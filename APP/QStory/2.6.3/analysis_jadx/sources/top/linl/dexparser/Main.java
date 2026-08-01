package top.linl.dexparser;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class Main {
    public static void main(String[] strArr) throws InterruptedException, IOException {
        System.out.println(DexFinder.builder(new File("D:\\JADX\\QQ_8.9.85.apk").getAbsolutePath()).build().testFindMethodString("doOnBackEvent"));
    }
}
