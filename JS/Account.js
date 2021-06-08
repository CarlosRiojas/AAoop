class Account{
    constructor(name,document,email,password){ 

    
    this.id;
    this.name = name;
    this.document = document;
    this.email;
    this.password;
    }

    printDataAccount(){
        console.log("Name:"+this.name)
        console.log("Document: " + this.document)
        console.log("Email: "+ this.email)
        console.log("password: "+this.password)
    }
}