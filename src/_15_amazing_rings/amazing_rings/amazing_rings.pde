void setup(){
background(#80EADD);
size(3000,3000);
}




int x1 =550 ; int x2 =1500;
void draw(){
noFill();
     for(int i=100;i>=0;i--){ 
  ellipse (x1,500,i*5,i*5);
    } 
x1=x1+1; 


 
     for(int i=100;i>=0;i--){ 
  ellipse (x2,500,i*5,i*5);
    } 
x2=x2-1;
}
