import FirstPackage.*;

class FirstClass {
    public static void main(String[] s) {
        FirstPackage o = new FirstPackage(0, 0);
		int i, j;
            for (i = 1; i <= 8; i++) {
                for(j = 1; j <= 8; j++) {
                    o.setX(i);
                    o.setY(j);
                    System.out.print(o.sum());
                    System.out.print(" ");
                }
                System.out.println();

                }
        }
    }
