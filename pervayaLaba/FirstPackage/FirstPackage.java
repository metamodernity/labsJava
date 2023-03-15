package FirstPackage;

public class FirstPackage {
    private int y;
    private int x;

    public FirstPackage(int y, int x) {
        this.y = y;
        this.x = x;
    }

	public int sum(){
		return this.x + this.y;
	}

	public int composition(){
		return this.x * this.y;
	}
	
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
