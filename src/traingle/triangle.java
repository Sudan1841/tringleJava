package traingle;

public class triangle {

    public static void main(String[] args) {
        // Define the height of the triangle
    	int height = 20;
    	String[] triangle = new String[height+1];
    	
    	for(int i = 0; i < height; i++) {
    		int spaces = i*2;
    		triangle[i] = "|"+ " ".repeat(spaces)+"\\";
    		
    	}
    	int baseLeng  = height *2+1;
    	StringBuilder baseLine =  new StringBuilder();
    	for(int i = 0; i< baseLeng; i++) {
    		baseLine.append("_");
    	}
    	triangle[height] = baseLine.toString();
    	for(String line: triangle ) {
    		System.out.println(line);
    	}
    	
}

}   
    
    
   