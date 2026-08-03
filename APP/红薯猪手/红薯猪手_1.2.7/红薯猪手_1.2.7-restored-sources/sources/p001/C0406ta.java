package p001;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ۟.ta */
/* JADX INFO: loaded from: classes.dex */
public class C0406ta extends C0393sa {
    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static boolean m1244(String str, String str2) {
        C0237h4.m1090("<this>", str);
        return str.endsWith(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public static final boolean m1245(CharSequence charSequence) {
        boolean z;
        C0237h4.m1090("<this>", charSequence);
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable c0223g4 = new C0223g4(0, charSequence.length() - 1);
        if ((c0223g4 instanceof Collection) && ((Collection) c0223g4).isEmpty()) {
            z = true;
        } else {
            Iterator<Integer> it = c0223g4.iterator();
            while (((C0209f4) it).f1443) {
                char cCharAt = charSequence.charAt(((AbstractC0181d4) it).nextInt());
                if (!(Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt))) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public static final boolean m1246(String str, int i, String str2, int i2, int i3, boolean z) {
        C0237h4.m1090("<this>", str);
        C0237h4.m1090("other", str2);
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public static String m1247(String str, String str2, String str3) {
        C0237h4.m1090("<this>", str);
        C0237h4.m1090("oldValue", str2);
        C0237h4.m1090("newValue", str3);
        int iM1255 = C0432va.m1255(0, str, str2, false);
        if (iM1255 < 0) {
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
            sb.append((CharSequence) str, i2, iM1255);
            sb.append(str3);
            i2 = iM1255 + length;
            if (iM1255 >= str.length()) {
                break;
            }
            iM1255 = C0432va.m1255(iM1255 + i, str, str2, false);
        } while (iM1255 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        C0237h4.m1089("toString(...)", string);
        return string;
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static boolean m942(String str, String str2) {
        C0237h4.m1090("<this>", str);
        return str.startsWith(str2);
    }
}
