package p245;

import java.util.Iterator;
import kotlin.text.Regex;

/* JADX INFO: renamed from: 飘花落叶言楪兰哲子苏世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8151 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Regex f22480 = new Regex("\r\n|\r|\n");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m13575(Object obj, String str, StringBuilder sb) {
        if (obj != null) {
            Iterator<T> it = f22480.split(obj.toString(), 0).iterator();
            while (it.hasNext()) {
                sb.append(str + ": " + ((String) it.next()) + "\r\n");
            }
        }
    }
}
