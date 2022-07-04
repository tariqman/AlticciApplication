function alticci (){
    var n = document.getElementById("n").value;
    n= 100;
    if(n)
    {
        let request = new XMLHttpRequest();
        request.open("GET","http://localhost:8080/AlticciApplication/webresources/api/alticci/"+n);
        request.send();
        request.onload = ()=>{
            if(request.status == 200)
            {
                console.log("response"+request.response);
               window.alert(request.response);
            }
            else 
            {
                window.alert("error is : "+request.status + " "+request.statusText);
            }
        }
    }
    else
    {
        window.alert("Please enter n value");
    }
}