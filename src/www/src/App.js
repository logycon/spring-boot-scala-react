import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  state = {}

  componentDidMount() {
    this.hello();
  }

  hello = () => {
    fetch('/api/hello')
      .then(res => res.json())
      .then(msg => {
        console.log(msg.message);
        this.setState(msg)
      } )

  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo"/>
          <p>
            App Header - Frontend Change
          </p>
          <div>
            {this.state.message}
          </div>
        </header>
      </div>
    );
  }
}

export default App;
