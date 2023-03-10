package classes;

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
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testRtoL(){
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.mirrorVerticalRtoL();
    caterpillar.explore();
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
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void thorizontal(){
    Picture swan = new Picture("images/swan.jpg");
    swan.explore();
    swan.horizontal();
    swan.explore();
  }
  
  public static void btot(){
    Picture swan = new Picture("images/swan.jpg");
    swan.explore();
    swan.horizontalBtoT();
    swan.explore();
  }
  
  public static void testDiag(){
    Picture theG = new Picture("images/beach.jpg");
    theG.explore();
    theG.diagonal();
    theG.explore();
  }
  
  public static void testMirArms(){
    Picture fourArm = new Picture("images/seagull.jpg");
    fourArm.explore();
    fourArm.mirrorArms();
    fourArm.explore();
  }
  
  public static void aFriendOrLover/*?*/(){
    Picture fourArm = new Picture("images/seagull.jpg");
    fourArm.explore();
    fourArm.mirrorGull();
    fourArm.explore();
  }
  
  public static void testMiCollage(){
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testRtoL();
    //thorizontal();
    //btot();
    //testDiag();
    //testMirArms();
    //aFriendOrLover();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testMiCollage();
    //testCopy();
    testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}