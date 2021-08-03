static int  MaxInteger(int a ,int b, int c){
//Enter your code here
if(a > b){
    if(a > c){
        return a;
    }
}
if(b > a){
    if(b > c){
        return b;
    }
}
return c;
}
