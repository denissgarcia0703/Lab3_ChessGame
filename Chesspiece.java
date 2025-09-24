public abstract class ChessPiece {
    protected String name;
    protected PieceColor color;
    protected char currentX;
    protected int currentY;

    public ChessPiece() {
        this.name = null;
        this.color = null;
    }
    public ChessPiece(String name, PieceColor color, char currentX, int currentY) {
        this.name = name;
        this.color = color;
        this.currentX = currentX;
        this.currentY = currentY;
    }
    public abstract boolean validMove(char targetX, int targetY);
    public void setColor(PieceColor color) {
        this.color = color;
    }
    public PieceColor getColor() {
        return this.color;
    }
    public void setCurrentX(char currentX) {
        this.currentX = currentX;
    }
    public char getCurrentX() {
        return this.currentX;
    }
    public void setCurrenty(int currentY) {
        this.currentY = currentY;
    }
    public int getCurrenty() {
        return this.currentY;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

