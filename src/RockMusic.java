public class RockMusic extends MusicStyles {
    String[] groups = new String[]{"Beatles", "Pink Floyd", "The Rolling Stones"};
    @Override
    void playMusic() {
        System.out.println("Рок групи:");
        for (String a : groups) {
            System.out.println(a);
        }
    }
}