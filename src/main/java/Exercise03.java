public class Exercise03 {
    public static void main(String[] args) {
        String song = "RWUBWUBWUBLWUB";
        System.out.println(SongDecoder(song));
    }

    public static String SongDecoder (String song){
        String[] s = song.split("WUB");
        StringBuilder sb = new StringBuilder();
        for (String sg:s) {
            if(!sg.equals("")) {
                sg.trim();
                sb.append(sg + " ");
            }
        }
        return sb.toString().trim();
    }
}
//Очистка текста от шума.

