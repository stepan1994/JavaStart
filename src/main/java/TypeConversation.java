public class TypeConversation {
    public static void main (String[] args){
        byte simpleByte = 15;
        System.out.println(simpleByte);
        int sInt = simpleByte;
        System.out.println(sInt);

        float sFloat = 31.123456F;
        System.out.println(sFloat);

        double sDouble = sFloat;
        System.out.println(sDouble);

        char sChar = 'A';
        System.out.println(sChar);
        sInt = sChar;
        System.out.println(sInt);

        //long sLong = sFloat;
        sDouble = sInt;
        System.out.println(sDouble);
        System.out.println(sInt + sDouble);
        System.out.println(sDouble +sInt);

        System.out.println(sFloat + sInt);
        sInt = 2147483647;
        long sLong = 2147483647;
        System.out.println(sInt + sLong);

        //Cинтаксис;
        // (тип) переменная;

        sLong = (long)sFloat;
        System.out.println(sLong);

        simpleByte = (byte) sInt;
        System.out.println(simpleByte);





    }
}
