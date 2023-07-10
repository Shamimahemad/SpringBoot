
import React, { Component } from 'react'
import {Link} from 'react-router-dom';
import AccountService from '../Service/AccountService'
 class AccountTable extends Component {
constructor(props){
    super(props);
    this.state={
        prodarr:[],
        searcharr:[],
        searchtext:""
    }

}
//initialize array 
componentDidMount(){
    this.fetchdata()
}

fetchdata(){
    AccountService.getAll()
    .then((response)=>{
        this.setState({...this.state,prodarr:[...response.data],searcharr:[...response.data]})
    }).catch()
}
deleteProduct(pid){
   AccountService.deleteById(pid)
   .then((response)=>{
        this.fetchdata()
   })
   .catch()
}
  render() {
    return (
      <div>
      
  <input type="text" name="search" id="search"></input>&nbsp;&nbsp;&nbsp;
  <Link to='/form'>
     <button type="button" name="btn" id="btn" className="btn btn-success">Add new Account</button>  
  </Link> 
  <table className="table table-striped">
    <thead>
      <tr>
        <th scope="col">Account ac</th>
        <th scope="col">Account hname</th>
        <th scope="col">Account balance</th>
        <th scope="col">Account loan</th>
        
      </tr>
    </thead>
    <tbody>
    {
        this.state.searcharr.map(account=>
            <tr key={account.ac}>
                <th scope="row">{account.ac}</th>
                <td>{account.hname}</td>
                <td>{account.balance}</td>
                <td>{account.loan}</td>
                <td>

                <button type="button" name="btn" id="btn" className="btn btn-danger" onClick={()=>this.deleteAccount(account.ac)}>delete</button> &nbsp;&nbsp;&nbsp; 
                <Link to={`/edit/${account.ac}`}>
                <button type="button" name="btn" id="btn" className="btn btn-primary">edit</button> &nbsp;&nbsp;&nbsp; 
                </Link>
                <button type="button" name="btn" id="btn" className="btn btn-info">view</button> 
                </td>
            </tr>
        )
    }
      
      
    </tbody>
  </table>
</div>
    )
  }
}

export default AccountTable;