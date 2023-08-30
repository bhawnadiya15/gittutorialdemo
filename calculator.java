class 	Calculator{
int numbers(int a ,int b){
return a+b;}
double numbers(double a,double b){
return (a+b);}
void numbers(int a ,double b){
return a+b;
}
void numbers(double a,int b){
return a+b;}
}
class Main{
public static void main(String args[]){
Calculator c1 = new Calculator();
c1.numbers(8+9);
}}
