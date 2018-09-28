int gravity = 3;
int upVelocity = 30;

int birdX = 100;
int birdY = 400;

int topBarX = 700;
int botBarX = 700;
int topPipeHeight = (int) random(100, 400);
int botPipeHeight = (int) random(100, 400);

void setup(){
 size(800,800);
 showBar(topBarX, 0, topPipeHeight);
 showBar(botBarX, (800 - botPipeHeight), botPipeHeight);
}

void draw(){
  background(0,0,0);
  fill(255,255,255);
  ellipse(birdX, birdY, 50, 50);

  if( topBarX <= -150 ){
    topBarX = 800;
    topPipeHeight = (int) random(100, 400);
  }
  
  if( botBarX <= -150 ){
    botBarX = 800;
    botPipeHeight = (int) random(100, 400);
  }

  showBar(topBarX, 0, topPipeHeight);
  showBar(botBarX, (800 - botPipeHeight), botPipeHeight);
  println(botPipeHeight);

  if( intersectsPipes() != true ){
    topBarX -= 5;
    botBarX -= 5;
    upVelocity = upVelocity + gravity;
    birdY = upVelocity;
  }
}

void showBar( int xPos, int yPos, int height ){
  fill(0, 255, 0);
  rect(xPos, yPos, 100, height);
}

boolean intersectsPipes() { 
     if ( (birdY+25) < topPipeHeight && (birdX+25) > topBarX && (birdX-25) < (topBarX+50)){
       return true;
     } else if ( (birdY+25) > 800-botPipeHeight && (birdX+25) > botBarX && (birdX-25) < (botBarX+50)) {
       return true;
     } else {
       return false;
     }
}

void mousePressed(){
  upVelocity -= 50;
}