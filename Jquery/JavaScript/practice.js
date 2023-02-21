function fun(a,b)
{
    if(a==100||b==100||(a+b)==100)
    {
        return true;
    }
    else
    return false;
}

console.log(fun(100,0));
document.write(fun(0,100));
fun(50,50);
fun(10,20);