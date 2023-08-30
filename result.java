class School{
int roll,m1,m2, m3, m4;
String name,adress,branch;
School(int rol,int mar1,int mar2,int mar3,int mar4,String nam,String adres,String brach){
roll = rol;
m1 = mar1;
m2 = mar2;
m3 = mar3;
m4 = mar4;
name = nam;
adress = adres;
branch = brach;
}
char marks(){
float percentage = (m1+m2+m3+m4)/4f;
if(percentage<90){
return'A';}
else if(percentage<90 && percentage>80){
return 'B';
}
else if(percentage<80 && percentage>70){
return 'C';
}
else if(percentage<70 && percentage>60){return 'D';
}
else{
return 'F';
}}
void print(){
System.out.println("Name:"+name+"\n"+"roll no :" + roll+"\n"+"Adress :"+adress+"\n"+"Branch :"+branch+"\n"+"Grade: "+marks());
}
}
public class result{
public static void main(String args[]){
School s1 = new School(34,89,98,77,65,"ng","sector","cse");
s1.marks();
s1.print();
}}



