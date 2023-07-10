import axios from 'axios';
const baseUrl="http://localhost:9092/account";
class AccountService{
    getAll(){
        return axios.get(baseUrl);
    }
    
}
export default new AccountService();