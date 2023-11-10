import processing.core.PApplet;

public class Sketch extends PApplet {
	  
  public void settings() {
	  // Size of the canvas
    size(400, 400);
  }

  
  public void setup() {
    // Background colour of canvas
    background(255);
  }

  
  public void draw() {
      // Draws the rows of Houses
      house(30, 40, 40, 40);
      house(130, 40, 40, 40);
      house(230, 40, 40, 40);
      house(330, 40, 40, 40);
      house(30, 140, 40, 40);
      house(130, 140, 40, 40);
      house(230, 140, 40, 40);
      house(330, 140, 40, 40);
      house(30, 240, 40, 40);
      house(130, 240, 40, 40);
      house(230, 240, 40, 40);
      house(330, 240, 40, 40);
      house(30, 340, 40, 40);
      house(130, 340, 40, 40);
      house(230, 340, 40, 40);
      house(330, 340, 40, 40);
      
      // Draws the rows of stick people
      for (int intSecondY = 90; intSecondY < 390; intSecondY += 100){
        for (int intSecondX = 100; intSecondX < 390; intSecondX += 100){
          stickFigure(intSecondX, intSecondY, 15, 15, (float) 0.5 * intSecondY + 50, (float) 0.57 * intSecondY + 20, (float) 0.8 * intSecondY + 20);
        }
      }
    
      // Draws a circle with the colour of parameters to the right of the mouse
      int colourMouse = readColour(20);
      fill(colourMouse);
      stroke(0);
      if(mousePressed){
        ellipse(mouseX, mouseY, 10, 10);
      }
    
  }

  /**
   * Draws a house at various locations specified by the method parameters
   * @param houseX is the x coordinate 
   * @param houseY is the y coordinate
   * @param houseWidth is the width
   * @param houseHeight is the height
   */
  public void house(float houseX, float houseY, float houseWidth, float houseHeight) {
    
    // Rectangle House base
    stroke(0);
    fill(168, 86, 50);
    rect(houseX, houseY, houseWidth, houseHeight);
   
    // Rectangle house door
    stroke(0);
    fill(0);
    rect(houseX + 17, houseY + 25, houseWidth - 35, houseHeight - 25);
  
    // Traingle House roof
    stroke(0);
    fill(168, 86, 50);
    triangle(houseX, houseY, houseX + 40, houseY, houseX + 20, houseY - 30);

    
    // Rectangle House base windows
    // Left window
    stroke(0);
    fill(255);
    rect(houseX + 5, houseY + 5, houseWidth - 30, houseHeight - 30);

    // Right Window
    stroke(0);
    fill(255);
    rect(houseX + 25, houseY + 5, houseWidth - 30, houseHeight - 30);

    
  }

  /**
   * Draws stick figures at various locations with changing colours specified by the method parameters
   * @param stickX is the X coordinate 
   * @param stickY is the Y coordinate
   * @param stickWidth is the width 
   * @param stickHeight is the height
   * @param colourR is the Red in RGB
   * @param colourG is the Green in RGB
   * @param colourB is the Blue in RGB
   */
  public void stickFigure(float stickX, float stickY, float stickWidth, float stickHeight, float colourR, float colourG, float colourB) {
    // Head of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    ellipse(stickX, stickY, stickWidth, stickHeight);

    // Body of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    line(stickX, stickY + 8, stickX, stickY + 28);

    // Right arm of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    line(stickX, stickY + 14, stickX + 14, stickY + 6);

    // Left arm of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    line(stickX, stickY + 14, stickX - 7, stickY + 24);

    // Right leg of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    line(stickX, stickY + 28, stickX + 12, stickY + 42);

    // Left leg of stick figure
    stroke(colourR, colourG, colourB);
    noFill();
    line(stickX, stickY + 28, stickX - 12, stickY + 42);

  }
  
  /**
   * Draws the colour of the pixel that is right of the mouse
   * @param intPixel the Pixels to the right of mouse
   * @return the colour of the pixel that is the parameter to the right of the mouse when it is pressed
   */
  public int readColour(int intPixels){
    if(mousePressed){
      return get(mouseX + intPixels, mouseY);
    }
    else{
      return color(0);
    }
  }
}