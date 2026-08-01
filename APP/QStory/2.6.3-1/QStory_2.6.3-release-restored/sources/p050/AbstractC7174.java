package p050;

import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f17823 = AbstractC4765.m8874().concat("/Pic/");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m12452() {
        File[] fileArrListFiles = new File(f17823).listFiles();
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
