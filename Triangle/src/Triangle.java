****************************************************************************
 *
 * Created by: Perry Martin
 * Created on: Oct 2016
 * Assignment 4
 *     
 *
 ****************************************************************************/

public class Triangle {
	
	private double _aSide;
	private double _bSide;
	private double _cSide;
	private String _name;
	private double _area;
	private double _semiPerimeter;
	private double _perimeter;
	private double _height;
	private double _incircleRadius;
	private double _incircleArea;
	private double _circumcircleRadius;
	private double _circumcircleArea;
	
	public  Triangle(double givenASide, double givenBSide, double givenCSide) {
   
        	
	//input of the lengths
	   this._aSide = givenASide;
       this._bSide = givenBSide;
	   this._cSide = givenCSide;
	  
	  // To see if Triangle is valid
	  boolean validTriangle = isTriangleValid();
	  
	  //just to make the math shorter
	  final double PI = Math.PI;
	
	if (validTriangle == true){
		
		
		this._name = calculateNames();
		
		this._semiPerimeter = (this._aSide + this._bSide + this._cSide)/2;
		
		this._perimeter = this._semiPerimeter * 2;
		
		this._area = 
					Math.sqrt(this._semiPerimeter * 
					(this._semiPerimeter - this._aSide) * 
					(this._semiPerimeter - this._bSide) * 
					(this._semiPerimeter - this._cSide));
		
		this._height = 2*(this._area/this._bSide);
		
		this._incircleRadius = this._area/this._semiPerimeter;	
		
		this._circumcircleRadius = 
					(this._aSide * this._bSide * this._cSide)/
					Math.sqrt((this._aSide + this._bSide + this._cSide) * 
							(this._bSide + this._cSide - this._aSide) *
							(this._aSide + this._cSide - this._bSide) *
							(this._aSide + this._bSide - this._cSide));
		
		this._incircleArea = PI * Math.pow(this._incircleRadius, 2);
		
		this._circumcircleArea = PI * Math.pow(this._circumcircleRadius, 2);
		}
	else {
		System.out.println("Invalid Input");
		
	}
	
	
	
	
	
	}
	
	
protected String calculateNames(){
		
		if(this._bSide == this._aSide && this ._aSide == this._cSide){
			return "Equilateral";
		}
		else if(this._aSide == this._bSide ||
				this._bSide == this._cSide ||
				this._aSide == this._cSide)  {
			
			return "Isoseles";
			
		}
		else{
			return "Scalene";
		}
		
		
	}
	
	
	
	
	
      public String state(){
		
		  String stateOfTriangle = 
		     " Side A: " + this._aSide +
		     ", Side B: " + this._bSide +
		     ", Side C: " + this._cSide +
		     ", Name: " + this._name +
		     ", Area: "  + this._area +
		     ", Semiperimeter: " + this._semiPerimeter +
		     ", Perimeter: " + this._perimeter +
		     ", Height: " + this._height +
	         ", IncircleRadius: " + this._incircleRadius +
	         ", IncircleArea: " + this._incircleArea +
	         ", CircumcircleRadius: " + this._circumcircleRadius+
	         ", CircumcircleArea: " + this._circumcircleArea 
		    ;
		     
			
		
		return stateOfTriangle;
	}
	
      protected boolean isTriangleValid(){
  		
  		if ( this._aSide > 0 || this._cSide > 0 || this._bSide > 0){
  			
  			   if (this._bSide + this._cSide > this._aSide &&
  			      this._cSide + this._aSide > this._bSide &&
  			      this._aSide + this._bSide > this._cSide){
  			      	
  			      	return true;
  			      }
  			   	}
  		return false;
  		
  	}
	
          
}
