package top.linl.dexparser;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class Main {
    public static void main(String[] strArr) throws InterruptedException, IOException {
        System.out.println(DexFinder.builder(new File("D:\\JADX\\QQ_8.9.85.apk").getAbsolutePath()).build().testFindMethodString("doOnBackEvent"));
    }
}
