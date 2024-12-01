import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rows = 21;
        int cols = 19;
        int tileSize = 32;
        int boardWidth = tileSize * cols;
        int boardHeight = tileSize * rows;

        JFrame frame = new JFrame("Pac Man");
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacMan = new PacMan();
        frame.add(pacMan);
        frame.pack();
        pacMan.requestFocus();
        frame.setVisible(true);
    }
}
