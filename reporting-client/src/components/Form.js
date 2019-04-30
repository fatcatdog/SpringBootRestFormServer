import React from 'react';

class Form extends React.Component {

userObject = {
  email: 'jacob223',
  password: '23244'
}

emptyForm = {
   teamName: '',
   jiraProject: ''
 };

 constructor(props) {
  super(props);
  this.state = {
    user: this.userObject,
    item: this.emptyForm
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


alert(this.state.user.email + " " + this.state.user.password);
alert(item.teamName + " " + item.jiraProject);
  //     await fetch('http://localhost:8080/api/blogs', {
  //       method: 'POST',
  //       headers: {
  //         'Accept': 'application/json',
  //         'Content-Type': 'application/json'
  //       },
  //       body: JSON.stringify(item)
  //     }).then(function(response) {
  //     if (!response.ok) {
  //         throw Error(response.statusText);
  //     }
  //     return response;
  // }).then(window.location.assign("http://localhost:3000"))
    }

render() {
const {item} = this.state;
return (
<div>
Form Component
<form onSubmit={this.handleSubmit}>
<p>Team Name:</p>
<input type="text" name="teamName" id="teamName" value={item.teamName}
onChange={this.handleChange}
/>
<p>Jira Project:</p>
<input type="text" name="jiraProject" id="jiraProject" value={item.jiraProject}
onChange={this.handleChange}
/>
<p><input type="submit" value="Submit" /></p>

</form>
</div>
)
}
}

export default Form;
