package p034;

import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6345 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f17478 = AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵喵呜呜~喵喵喵喵呜喵呜呜~喵呜喵喵呜喵呜喵"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m11893() {
        File[] fileArrListFiles = new File(f17478).listFiles();
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
