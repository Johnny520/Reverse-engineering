package p000a;

/* JADX INFO: renamed from: a.Ce */
/* JADX INFO: loaded from: classes.dex */
public class C0053Ce extends C0034Be {
    /* JADX INFO: renamed from: W */
    public static String m142W(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return m143X(str, length);
    }

    /* JADX INFO: renamed from: X */
    public static String m143X(String str, int i) {
        C0631i9.m1482e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C0944z.m2223c(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        C0631i9.m1481d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: Y */
    public static String m144Y(String str, int i) {
        C0631i9.m1482e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C0944z.m2223c(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(length - i);
        C0631i9.m1481d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
