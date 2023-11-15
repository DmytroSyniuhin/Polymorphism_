public class Program {
    public static void main(String[] args) {
        MusicStyles groups = new RockMusic();
        groups.playMusic();
        System.out.println();
        groups = new PopMusic();
        groups.playMusic();
        System.out.println();
        groups = new ClassicMusic();
        groups.playMusic();
    }
}

