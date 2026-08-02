package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sb1 {
    /* JADX INFO: renamed from: a */
    public static String m4781a(List list, String str, vi1 vi1Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str2 = (i & 2) != 0 ? "" : "[\n\t";
        String str3 = (i & 4) == 0 ? "\n]" : "";
        if ((i & 32) != 0) {
            vi1Var = null;
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
            if (vi1Var != null) {
                sb.append((CharSequence) vi1Var.mo5j(obj));
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

    /* JADX INFO: renamed from: b */
    public static final void m4782b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
