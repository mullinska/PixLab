/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("beach.jpg");
	    beach.keepOnlyBlue();
	    beach.explore();
  }
  
  public static void testNegate() {
	  Picture beach = new Picture("beach.jpg");
	    beach.negate();
	    beach.explore();
  }
  
  public static void testGrayscale() {
	  Picture beach = new Picture("beach.jpg");
	    beach.grayscale();
	    beach.explore();
  }
  
  public static void testFixUnderwater() {
	  Picture water = new Picture("water.jpg");
	  	water.explore();
	  	water.fixUnderwater();
	    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal(){
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontalBotToTop(){
	    Picture caterpillar = new Picture("caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorizontal();
	    caterpillar.explore();
	  }
  public static void testMirrorDiagonal(){
	    Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.mirrorDiagonal();
	    beach.explore();
	  }
  
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    Picture swan = new Picture("swan.jpg");
    Picture arch = new Picture("arch.jpg");
    Picture beach = new Picture("beach.jpg");
    
    canvas.copy2(swan, 200, 200, 300, 300);
    canvas.copy2(arch, 100, 200, 200, 100);
    canvas.copy2(beach, 300, 200, 400, 300);
    canvas.mirrorDiagonal();
    
    canvas.explore();
  }
  
  public static void testCopy()
  {
    Picture canvas = new Picture("640x480.jpg");
    Picture swan = new Picture("swan.jpg");
    canvas.copy2(swan, 0, 0, 100, 100);
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//	  testMirrorVertical();
//	  testMirrorVerticalRightToLeft();
//	  testMirrorHorizontal();
//	  testMirrorHorizontalBotToTop();
//	  testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    testCollage();
//    testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}