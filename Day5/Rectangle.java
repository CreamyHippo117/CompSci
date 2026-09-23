package Day5;


public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int newLength, int newWidth)
    {
        length = newLength;
        width = newWidth;
    }

    public Rectangle()
    {
    length = 1;
    width = 1;
    }

    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setLength(int newLength)
    {
        length = newLength;
    }

    public void setWidth(int newWidth)
    {
        width = newWidth;
    }
    
    public int calculateArea()
    {
        return length * width;
    }

    public int calculatePerimeter()
    {
        return (length + width) * 2;
    }

    public double calculateDiagonal()
    {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }
    
    public String toString()
    {
       return ("This rectangle has length " + length + " and width " + width + ".");
    }

    public boolean equals(Rectangle other)
    {
        if  (length == other.getLength())
        {
            if (width == other.getWidth()) {

                return true;
            }

        }
        return false;

        }
            
        
    }




