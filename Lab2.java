public class Lab2
{
  
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    
    Robot.turnLeft();
        Robot.turnLeft();
        Robot.turnLeft();
               
       }
       //test.....oh it ended up working sweeet
       public static void getBack2()
       {
         Robot.move();
         Robot.move();
         Robot.move();
         Robot.move();
         Robot.move();
         Lab2.turnRight();       
         
        }
      // this makes the robot on the checkerboard go up
      //it starts at the beginning of the graph
      // it moves twice and makes it dark 4 times and reaches the top of the board
        public static void checkerboardUp()
        {
            Robot.makeDark();
            Robot.move();
            Robot.move();
            Robot.makeDark();
            Robot.move();
            Robot.move();
            Robot.makeDark();
            Robot.move();
            Robot.move();
            Robot.makeDark();
            Robot.move();
                
      }
      //this helps to recenter the robot on the checkerboard before going up
      // it starts at the top unit of the board
      // it ends facing downwards
      public static void recenterCheckerUp()
      {
          Lab2.turnRight();
          Robot.move();
          Lab2.turnRight();
    
        
        
        }
       //this helps to recenter the robot on the checkerboard before going down
       // it starts facing downwards
       // it ends facing upwards because it moves left twice
        public static void recenterCheckerDown()
        {
            
            Robot.turnLeft();
            Robot.move();
            Robot.turnLeft();
            
            
            
        }
        
        
        
        
        
        
        // makes the robot draw a checkerboard downwards
        //starts downwards
        //ends facing downards at the wall
        public static void checkerboardDown()
        {
            Robot.makeDark();
            Robot.move();
            Robot.move();
            Robot.makeDark();
            Robot.move();
            Robot.move();
            Robot.makeDark();
            Robot.move();
            Robot.move();
            Robot.makeDark();
            Robot.move();
            
            
        }
        
        
        
        
        
        
        
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    
    
    // when y>4 allows the side to be completed 4 times
    for(int y=0; y<4 ; y++)
    {
    for(int x = 0; x < 6; x++) //this checks if its on dark and makes it move 7 units
    {
        if (Robot.onDark() == false)
        {
            Robot.move();
            
        }else
        {if (Robot.onDark()==true)
            {
       Robot.makeLight();
       Robot.move();
    };};  
       
        
    };
    Robot.turnLeft();
}
    
 
  }
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    
    // this loop is for the amount of prongs on the comb
  for(int y=0 ; y< 5 ; y++)
  {
      Lab2.turnRight();
      // this other loop makes the straight dark pattern on the comb
    for(int x= 0; x < 7 ; x++)
   {
     if (Robot.onDark() == false) {
        Robot.makeDark();
        Robot.move();
        if (Robot.frontIsClear()== false) { 
          Lab2.turnRight();
          Lab2.turnRight();

        }
        
            
        }   
       
  }
  
  //this code helps the robot re-center before executing its code again
  // For the getBack2 command, the robot starts at the second unit up and ends at the highest unit on the first starting unit.
  Lab2.getBack2();
  if (Robot.frontIsClear())
  {
  Robot.move();
  Robot.makeDark();
  Robot.move();
  
}
 
}
  }
  
  public static void makeCheckered()
  {
  
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    //this loops makes the robot use recenterCheckerUp and checkerboardDown
    // to make a board when it beings at the wall.
    // recenterCheckerDown makes the robot recenter as it begins to go down
    for(int x=0; x<3; x++)
    {
    Lab2.checkerboardUp();
    Lab2.recenterCheckerUp();
    Lab2.checkerboardDown();
    Lab2.recenterCheckerDown();
}
    Lab2.checkerboardUp();
    Lab2.recenterCheckerUp();
    Lab2.checkerboardDown();
  }
}
