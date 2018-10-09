package codility;


public class Accumul {
    public static String accum(String s) {
        if (s.equals(null) || s.isEmpty()) return "";
        char[] splits = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int k=0; k<splits.length; k++){
            for (int j = 0; j<k+1; j++){
                if (j == 0) sb.append(Character.toUpperCase(splits[k]));
                else sb.append(Character.toLowerCase(splits[k]));}
            if (k != splits.length-1) sb.append("-");
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
        System.out.println(accum("NyffsGeyylB"));
        System.out.println(accum("MjtkuBovqrU"));
        System.out.println(accum("EvidjUnokmM"));
        System.out.println(accum("HbideVbxncC"));
    }
}
