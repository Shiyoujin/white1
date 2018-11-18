public class a {
    public static void main(String[] args) {
        String str = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";//，或者空格与下的""内容对齐
        String result[] = str.split(",");//字符串全拆分字符数组
        for (int x = 0; x < result.length; x++)
            if (isNumber(result[x]) ){
                System.out.println("this number");
            } else if (isCapital(result[x])) {
                System.out.println("this capital");
            } else if (isLowcase(result[x])){
                System.out.println("this lowcase");
            }else                            {
                System.out.println("all not");
    }
    }
        //该方法主要是判断字符串是否由数字所组成！
        public static boolean isNumber(String result){ //此result看作  竖着的字符串
            char baby[] = result.toCharArray();//将字符串变为字符数组
            for (int x = 0; x < baby.length; x++) {
                if (baby[x] < '0' || baby[x] > '9') {   //  ||表示或者
                    return false;
                }
            }
            return true;
        }
        public static boolean isCapital (String result){
            char babb[] = result.toCharArray();
            for (int x = 0; x < babb.length; x++) {
                if (result.matches("[A-Z]*")) {   //"[A-Z]*"
                    return true;
                }
            }
            return false;
        }
        public static boolean isLowcase (String result){
            char baab[] = result.toCharArray();
            for (int x = 0; x < baab.length; x++) {
                if (result.matches("[a-z]*")) {
                    return true;
                }
            }
            return false;
        }
    }

