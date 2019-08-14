import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Animal dog = Animal.create("dog", 4);
//        System.out.println("dog".equals(dog.name()));
//        System.out.println(dog.numOfLegs() == 4);
        System.out.println(Animal.create("cat", 4).equals(dog));

        KotlinAnimal kdog = new KotlinAnimal("doggy", 4);

        ObjectMapper mapper = new ObjectMapper();
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream("out.txt"))) {
//            mapper.writeValue(outputStream, dog);
            mapper.writeValue(outputStream, kdog);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        String json = "{\"name\" : \"dog\", \"numOfLegs\" : 4}";
//        try {
//            Animal cat = mapper.readValue(json, Animal.class);
//            System.out.println(cat);
//            String ser = mapper.writeValueAsString(cat);
//            System.out.println("serialized = " + ser);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
