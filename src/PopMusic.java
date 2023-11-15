public class PopMusic extends MusicStyles {
    String[] groups = new String[]{"ABBA", "The Temptations", "Earth, Wind & Fire"};
    @Override
    void playMusic() {
        System.out.println("Поп групи:");
        for (String a : groups) {
            System.out.println(a);
        }
    }
}
