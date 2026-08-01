package p040U0;

import java.util.Collection;
import java.util.Iterator;
import p006D.AbstractC0079h;
import p027N0.AbstractC0223g;
import p034R0.C0243b;
import p034R0.C0244c;

/* JADX INFO: renamed from: U0.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0307q extends AbstractC0306p {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static boolean m532b0(String str, String str2) {
        AbstractC0223g.m418e(str, "<this>");
        return str.endsWith(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static boolean m533c0(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static boolean m534d0(CharSequence charSequence) {
        AbstractC0223g.m418e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            Iterable c0244c = new C0244c(0, charSequence.length() - 1, 1);
            if (!(c0244c instanceof Collection) || !((Collection) c0244c).isEmpty()) {
                Iterator it = c0244c.iterator();
                while (it.hasNext()) {
                    if (!AbstractC0079h.m166D(charSequence.charAt(((C0243b) it).m458a()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static final boolean m535e0(int i2, int i3, int i4, String str, String str2, boolean z2) {
        AbstractC0223g.m418e(str, "<this>");
        AbstractC0223g.m418e(str2, "other");
        return !z2 ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z2, i2, str2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static String m536f0(String str, char c2, char c3) {
        AbstractC0223g.m418e(str, "<this>");
        String strReplace = str.replace(c2, c3);
        AbstractC0223g.m417d(strReplace, "replace(...)");
        return strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static String m537g0(String str, String str2, String str3) {
        AbstractC0223g.m418e(str, "<this>");
        AbstractC0223g.m418e(str2, "oldValue");
        int iM516n0 = AbstractC0299i.m516n0(str, str2, 0, false);
        if (iM516n0 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, iM516n0);
            sb.append(str3);
            i3 = iM516n0 + length;
            if (iM516n0 >= str.length()) {
                break;
            }
            iM516n0 = AbstractC0299i.m516n0(str, str2, iM516n0 + i2, false);
        } while (iM516n0 > 0);
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        AbstractC0223g.m417d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static boolean m538h0(String str, boolean z2, String str2) {
        AbstractC0223g.m418e(str, "<this>");
        AbstractC0223g.m418e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : m535e0(0, 0, str2.length(), str, str2, z2);
    }
}
