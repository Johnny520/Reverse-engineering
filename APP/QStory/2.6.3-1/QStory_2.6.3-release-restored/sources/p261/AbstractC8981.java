package p261;

import java.util.Iterator;
import kotlin.text.Regex;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲子苏世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8981 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Regex f22823 = new Regex("\r\n|\r|\n");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m14163(Object obj, String str, StringBuilder sb) {
        if (obj != null) {
            Iterator<T> it = f22823.split(obj.toString(), 0).iterator();
            while (it.hasNext()) {
                sb.append(str + ": " + ((String) it.next()) + "\r\n");
            }
        }
    }
}
