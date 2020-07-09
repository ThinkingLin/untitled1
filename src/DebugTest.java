import java.util.HashMap;
import java.util.Map;

public class DebugTest {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        Map<String,String> map = new HashMap<String,String>();
        map.put("age","十八");
        map.put("name","thinking");
        map.put("class","一年级一班");
        map.put("sex","男");
        map.put("height","168");

        String name = map.get("name");
        System.out.println("name = " + name);

        map.remove("age");
        System.out.println(map);
    }

}
