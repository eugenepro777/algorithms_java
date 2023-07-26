package homeWork;

import homeWork.HashMap.Entity;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>(4);


        String v = hashMap.put("+79005551122", "Александр");
        v = hashMap.put("+79005551123", "Сергей");
        v = hashMap.put("+79005551123", "Алексей");
        v = hashMap.put("+79005551124", "Александр1");
        v = hashMap.put("+79005551125", "Александр2");
        v = hashMap.put("+79005551126", "Александр3");
        v = hashMap.put("+79005551127", "Александр4");
        v = hashMap.put("+79005551128", "Александр5");


        String searchRes = hashMap.get("+790055511221");
        String searchRes2 = hashMap.get("+79005551124");
        System.out.println(searchRes);
        System.out.println(searchRes2);

        v = hashMap.remove("+79005551127");






        for (Entity entity: hashMap) {
            System.out.println(entity.key + " : " + entity.value);
        }


        //hashMap.displayAllElements();

    }
}
