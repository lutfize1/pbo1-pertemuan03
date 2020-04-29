package percabangan;

public class IfElse {
        public static void main (String[] args) {
            double totalBelanja = 53000;
            double uangDiDompet = 25000;

            if(uangDiDompet<totalBelanja) {
                System.out.println("uang kurang, kurangi jajan anda");
            }else if(uangDiDompet>totalBelanja) {
                double angusul = uangDiDompet - totalBelanja;
                System.out.println("uang cukup, angsul : " + angusul);
            }else{
                System.out.println("uang pas.. UwU..");
            }
        }
}
