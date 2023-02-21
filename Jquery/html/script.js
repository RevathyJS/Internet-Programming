var nameerror=document.getElementById('name-error');
var phoneerror=document.getElementById('phone-error');
var emailerror=document.getElementById('email-error');

function validatename()
{
    var name=document.getElementById("t1").value;

    if(name.length == 0)
    {
        nameerror.innerHTML="Name is required";
        return false;
    }
    if(!name.match(/^[A-Za-z]*\s{1}[A-Za-z]*$/))
    {
        nameerror.innerHTML="write full name";
        return false;
    }
    nameerror.innerHTML ="valid";
    return true;

}

function validatephone()
{
    var phone=document.getElementById("t2").value;

    if(phone.length == 0)
    {
        phoneerror.innerHTML="Phone no is required";
        return false;
    }
    if(phone.length !== 10)
    {
        phoneerror.innerHTML="Phone no should be 10 digit";
        return false;
    }
    if(!phone.match(/^[0-9]{10}$/))
    {
        phoneerror.innerHTML="Phone no is required";
        return false;
    }
    phoneerror.innerHTML ="valid";
    return true;

}

function validateemail()
{
    var email=document.getElementById("t3").value;

    if(email.length==0)
    {
    emailerror.innerHTML="Email is required";
    return false;
    }
    if(!email.match(/^[A-Za-z\.\_0-9\-]*[@][A-Za-z]*[\.][a-z]{2,4}$/))
    {
    emailerror.innerHTML="Email Invalid";
    return false;
    }

    emailerror.innerHTML="valid";
    return true;
}