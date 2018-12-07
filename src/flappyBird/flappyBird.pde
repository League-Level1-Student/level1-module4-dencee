int gravity = 3;
int upVelocity = 0;
int maxVelocity = 0;

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

  if( intersectsPipes() == true ){
    print("Game Over!");
  } else {
    topBarX -= 5;
    botBarX -= 5;
    
    if(upVelocity < maxVelocity) {
      upVelocity += 5;
    } else {
      upVelocity = 0;
      maxVelocity = 0;
    }
    
    birdY += ( gravity - upVelocity );
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
  maxVelocity = 30;
}