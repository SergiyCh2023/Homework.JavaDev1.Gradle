import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {

    User me = new User("Sergiy", "Chalapchiy");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(me);

        System.out.println(json);

    }

}
