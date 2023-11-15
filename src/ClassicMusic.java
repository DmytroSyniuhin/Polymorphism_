public class ClassicMusic extends MusicStyles {
    String[] groups = new String[]{"Ensemble 48", "Steve Reich and Musicians", "New Century Chamber Orchestra"};
    @Override
    void playMusic() {
        System.out.println("Класичні групи:");
        for (String a : groups) {
            System.out.println(a);
        }
    }
}