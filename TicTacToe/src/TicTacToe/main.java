package TicTacToe;

public class main {
    public static void main(String[] args) {
        runSong a= new runSong("Home");
        a.run();
        
        Memory.bgSong = new runSong("Music");
        Memory.bgSong.run();
    }
}
