package kangz.pojo;

import java.util.ArrayList;

public class Main {

    private static final int num = 00;
    private int num2=1;
    private String string ;
    private int num22=4;
    private String str;



    public static void main(String[] args) {

        System.out.println(12356);

        ArrayList<Object> arrayList = new ArrayList<>();
        for (Object o : arrayList) {
            System.out.println(o);
        }
        ArrayList<String> list = new ArrayList<String>();
        //list.nn
        if (list != null) {
            System.out.println(list);
        }
        //list.null
        if (list == null) {
            System.out.println("集合为空！");
        }
        for (String s : list) {
            System.out.println(s);
        }
        //list.for
        for (String s : list) {

        }
        //list.fori 正序
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr 降序
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        new Main().method();
    }
    //只是一个注释 ....这字体咋回事啊

    /**
     * 这是一个文档注释
     */
    public void method(){
        String string="1333";
        StringBuffer stringBuffer = new StringBuffer();
        if (string == null) {
            System.out.println();
            System.out.println();
            System.out.println();
        }
        String[] strings = {"123", "555", "55558"};
        //fori

        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }
        //iter
        for (String s : strings) {

    }

    }
    /**
     * 这是一个测试修改方法
     */
    public void testUpdate(){

    }
}
