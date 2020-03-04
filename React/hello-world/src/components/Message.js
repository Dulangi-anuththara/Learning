import React, { Component} from 'react';


class Message extends Component{

    super()

    constructor(){
        this.state = {
            message:"Welcome to my world"
        }

    }   

    changeMessage = () =>{
        this.setState({
            message:"Thank You for subscribing"
        })
    }

    render(){
        return(
            <div>
                <h1>{this.state.message}</h1>
                <button onClick={ () => this.changeMessage()}>Subscribe</button>
            </div>
        )
    }
}