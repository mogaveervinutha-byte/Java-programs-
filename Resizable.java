interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    int width, height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);

        System.out.println("Original Rectangle:");
        r.display();

        r.resizeWidth(30);
        r.resizeHeight(40);

        System.out.println("Resized Rectangle:");
        r.display();
    }
}
