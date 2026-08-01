package p288;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8415 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Charset f23291 = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13956(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            C7546.m12740(file, "not a readable directory: ");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m13956(file2);
            }
            if (!file2.delete()) {
                C7546.m12740(file2, "failed to delete file: ");
                return;
            }
        }
    }
}
