package p304;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9236 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Charset f23627 = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14534(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            C8376.m13328(file, "not a readable directory: ");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m14534(file2);
            }
            if (!file2.delete()) {
                C8376.m13328(file2, "failed to delete file: ");
                return;
            }
        }
    }
}
