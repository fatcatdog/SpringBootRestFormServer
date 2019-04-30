import React from 'react';
import { Link } from 'react-router-dom';
import { withRouter } from 'react-router-dom';

class Home extends React.Component {
  userObject = {
     email: '',
     password: ''
   };

  constructor(props) {
   super(props);
   this.state = {
     item: this.userObject
   };
   this.handleChange = this.handleChange.bind(this);
   this.handleSubmit = this.handleSubmit.bind(this);
 }

 handleChange(event) {
   const target = event.target;
   const value = target.value;
   const name = target.name;
   let item = {...this.state.item};
   item[name] = value;
   this.setState({item});
 }

 async handleSubmit(event) {
   event.preventDefault();
   const {item} = this.state;
   console.log(item);

       await fetch('http://localhost:8080/forms/login', {
         method: 'POST',
         headers: {
           'Accept': 'application/json',
           'Content-Type': 'application/json'
         },
         body: JSON.stringify(item)

       }).then(function(response) {
       if (!response.ok) {
         console.log("Not valid");
       } else {
         console.log("Success")
       }
   })
}

 render(){
   const {item} = this.state;

   return (
     <div>
     Home Component
     <form onSubmit={this.handleSubmit}>
     <p>Email:</p>
     <input type="text" name="email" id="email" value={item.email}
     onChange={this.handleChange}
     />
     <p>Password:</p>
     <input type="text" name="password" id="password" value={item.password}
     onChange={this.handleChange}
     />
     <p><input type="submit" value="Submit" /></p>
     </form>
     </div>
   )
 }
}

export default Home;
