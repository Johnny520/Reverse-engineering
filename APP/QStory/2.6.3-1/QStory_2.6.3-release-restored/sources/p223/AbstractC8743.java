package p223;

import androidx.compose.p001ui.text.C2891;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8743 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m13968(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Void m13969(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m13970(List list, String str, C2891 c2891, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "[\n\t";
        String str3 = (i & 4) == 0 ? "\n]" : "";
        if ((i & 32) != 0) {
            c2891 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (c2891 != null) {
                sb.append((CharSequence) c2891.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }
}
