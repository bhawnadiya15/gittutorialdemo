class Account{
int balance;
public
void getter(int b){
balance = b;
}
void deposite(int money){

System.out.println("your account has been credted by "+money);
balance = balance+money;
}
void withdraw(int money){
balance = balance-money;
if(balance<0){
System.out.println("your balance does not support with withdrawal");
}
else{
System.out.println("your acc has been debited by "+money);
}}
void current_balance(){
System.out.println("your current balance contain rs"+balance);
}}
public class show{
public static void main(String args[]){
Account ac = new Account();
ac.getter(6544);
ac.deposite(345);
ac.withdraw(890);
ac.current_balance();
}
}
