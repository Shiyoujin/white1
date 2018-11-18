public class c {
    public static void main(String[] args) {
        String str = "helloworld";
        char [] arr = str.toCharArray();//将字符串变为字符数组
        for  (int x = 0 ;x< arr.length ; x ++){
            arr[x] -= 32;  //编码减少32，即转变为大写字母，只有变为数组才能做加减法
        }
        //将处理后的字符数组交给String变为字符串
        String newStr = new String(arr) ;
        System.out.println(newStr);
    }
}
