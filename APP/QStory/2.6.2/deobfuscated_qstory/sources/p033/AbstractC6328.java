package p033;

import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6328 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f17440 = AbstractC3932.m8313().concat("/Pic/");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m11884() {
        File[] fileArrListFiles = new File(f17440).listFiles();
        if (fileArrListFiles == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                arrayList.add(file.getName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
