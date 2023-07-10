import logo from './logo.svg';
import './App.css';
import HomeComponent from './component/HomeComponent';
import {Route,Routes} from 'react-router-dom';
import MainHeaderNavBar from './component/MainHeaderNavBar';
import AccountTable from './component/AccountTable';

function App() {
  return (
    <div className="App">
     <MainHeaderNavBar></MainHeaderNavBar>
    <Routes>
       <Route path="/home" element={<HomeComponent></HomeComponent>} ></Route>
       <Route path="/table" element={<AccountTable></AccountTable>} ></Route>
       {/* <Route path="/form" element={<ProductForm></ProductForm>} ></Route>
       <Route path="/edit/:pid" element={<ProductEdit></ProductEdit>} ></Route>
        */}
    </Routes>
    </div>
  );
}

export default App;
