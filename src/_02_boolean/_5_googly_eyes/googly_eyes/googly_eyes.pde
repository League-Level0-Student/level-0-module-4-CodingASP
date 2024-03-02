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
fill(255);
ellipse(417,193,150,100);
ellipse(562,191,150,100);
int pupilSize = 30;

fill(0);
float leftPupilX = constrain(mouseX, 317 + pupilSize / 2, 517 - pupilSize / 2);
float leftPupilY = constrain(mouseY, 143 + pupilSize / 2, 243 - pupilSize / 2);
ellipse(leftPupilX, leftPupilY, pupilSize, pupilSize);


float rightPupilX = constrain(mouseX + 145, 462 + pupilSize / 2, 662 - pupilSize / 2);
float rightPupilY = constrain(mouseY, 143 + pupilSize / 2, 243 - pupilSize / 2);
ellipse(rightPupilX, rightPupilY, pupilSize, pupilSize);
}
