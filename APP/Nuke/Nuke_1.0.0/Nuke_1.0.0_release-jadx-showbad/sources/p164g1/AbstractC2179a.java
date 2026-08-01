package p164g1;

import java.util.List;
import p081Q.C1160c;

/* JADX INFO: renamed from: g1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2179a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m4007a(List list, String str, C1160c c1160c, int i5) {
        if ((i5 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i5 & 2) != 0 ? "" : "[\n\t";
        String str3 = (i5 & 4) == 0 ? "\n]" : "";
        if ((i5 & 32) != 0) {
            c1160c = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int size = list.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            i6++;
            if (i6 > 1) {
                sb.append((CharSequence) str);
            }
            if (c1160c != null) {
                sb.append((CharSequence) c1160c.mo1h(obj));
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m4008b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
