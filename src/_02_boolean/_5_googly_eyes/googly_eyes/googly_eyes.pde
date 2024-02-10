PImage face;
void setup() 
{
face = loadImage("face.jpg");  
size(800,600);
face.resize(width,height);
  
}

void draw() 
{
background(face);  
ellipse(417,193,150,100);
ellipse(562,191,150,100);

}
