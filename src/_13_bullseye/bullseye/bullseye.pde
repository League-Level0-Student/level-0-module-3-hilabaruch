 void setup(){
   size(1000,1000);    
   
    }

    void draw(){
background(#AAFFF0);
for(int i=5;i>=0;i--){ 
if(i%2==0){
  fill(#FF0320);}
  else {
   fill(#080708);
    
  }
  ellipse (550,500,i*100,i*100);
    }} 
