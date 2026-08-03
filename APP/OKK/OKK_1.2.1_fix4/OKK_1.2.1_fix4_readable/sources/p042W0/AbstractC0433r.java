package p042W0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: W0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0433r extends AbstractC0432q {
    /* JADX INFO: renamed from: C0 */
    public static boolean m1028C0(String str, String str2) {
        AbstractC0307g.m703e(str, "<this>");
        AbstractC0307g.m703e(str2, "suffix");
        return str.endsWith(str2);
    }

    /* JADX INFO: renamed from: D0 */
    public static boolean m1029D0(String str, String str2, boolean z2) {
        return str == null ? str2 == null : !z2 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: E0 */
    public static final boolean m1030E0(int i2, int i3, int i4, String str, String str2, boolean z2) {
        AbstractC0307g.m703e(str, "<this>");
        AbstractC0307g.m703e(str2, "other");
        return !z2 ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z2, i2, str2, i3, i4);
    }

    /* JADX INFO: renamed from: F0 */
    public static String m1031F0(String str, String str2, String str3, boolean z2) {
        AbstractC0307g.m703e(str, "<this>");
        AbstractC0307g.m703e(str2, "oldValue");
        AbstractC0307g.m703e(str3, "newValue");
        int i2 = 0;
        int iM1008M0 = AbstractC0425j.m1008M0(str, str2, 0, z2);
        if (iM1008M0 < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i2, iM1008M0);
            sb.append(str3);
            i2 = iM1008M0 + length;
            if (iM1008M0 >= str.length()) {
                break;
            }
            iM1008M0 = AbstractC0425j.m1008M0(str, str2, iM1008M0 + i3, z2);
        } while (iM1008M0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        AbstractC0307g.m702d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: G0 */
    public static String m1032G0(String str, char c, char c2) {
        AbstractC0307g.m703e(str, "<this>");
        String strReplace = str.replace(c, c2);
        AbstractC0307g.m702d(strReplace, "replace(...)");
        return strReplace;
    }

    /* JADX INFO: renamed from: H0 */
    public static boolean m1033H0(String str, String str2, boolean z2) {
        AbstractC0307g.m703e(str, "<this>");
        AbstractC0307g.m703e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : m1030E0(0, 0, str2.length(), str, str2, z2);
    }

    /* JADX INFO: renamed from: I0 */
    public static boolean m1034I0(String str, int i2) {
        AbstractC0307g.m703e(str, "<this>");
        return str.startsWith(":\r\n", i2);
    }
}
