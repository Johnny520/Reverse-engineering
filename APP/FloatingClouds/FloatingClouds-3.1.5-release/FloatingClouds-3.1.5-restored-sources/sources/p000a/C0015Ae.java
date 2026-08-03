package p000a;

/* JADX INFO: renamed from: a.Ae */
/* JADX INFO: loaded from: classes.dex */
public class C0015Ae extends C0959ze {
    /* JADX INFO: renamed from: D */
    public static boolean m45D(String str, String str2) {
        C0631i9.m1482e(str, "<this>");
        return str.endsWith(str2);
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m46E(int i, int i2, int i3, String str, String str2, boolean z) {
        C0631i9.m1482e(str, "<this>");
        C0631i9.m1482e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* JADX INFO: renamed from: F */
    public static String m47F(String str, char c, char c2) {
        C0631i9.m1482e(str, "<this>");
        String strReplace = str.replace(c, c2);
        C0631i9.m1481d(strReplace, "replace(...)");
        return strReplace;
    }

    /* JADX INFO: renamed from: G */
    public static String m48G(String str, String str2, String str3) {
        C0631i9.m1482e(str, "<this>");
        int iM97L = C0034Be.m97L(str, str2, 0, false);
        if (iM97L < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM97L);
            sb.append(str3);
            i2 = iM97L + length;
            if (iM97L >= str.length()) {
                break;
            }
            iM97L = C0034Be.m97L(str, str2, iM97L + i, false);
        } while (iM97L > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        C0631i9.m1481d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m49H(String str, String str2, boolean z) {
        C0631i9.m1482e(str, "<this>");
        C0631i9.m1482e(str2, "prefix");
        return !z ? str.startsWith(str2) : m46E(0, 0, str2.length(), str, str2, z);
    }
}
