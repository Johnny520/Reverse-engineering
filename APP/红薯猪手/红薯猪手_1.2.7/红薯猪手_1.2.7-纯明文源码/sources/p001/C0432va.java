package p001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: ۟.va */
/* JADX INFO: loaded from: classes.dex */
public class C0432va extends C0406ta {
    /* JADX INFO: renamed from: ۥۡ۟, reason: contains not printable characters */
    public static boolean m1253(CharSequence charSequence, String str) {
        C0237h4.m1090("<this>", charSequence);
        C0237h4.m1090("other", str);
        return m1256(charSequence, str, 0, false, 2) >= 0;
    }

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public static final int m1254(CharSequence charSequence) {
        C0237h4.m1090("<this>", charSequence);
        return charSequence.length() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public static final int m1255(int i, CharSequence charSequence, String str, boolean z) {
        C0237h4.m1090("<this>", charSequence);
        C0237h4.m1090("string", str);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C0223g4 c0223g4 = new C0223g4(i, length);
        if (charSequence instanceof String) {
            int i2 = c0223g4.f762;
            int i3 = c0223g4.f1424;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (!C0406ta.m1246(str, 0, (String) charSequence, i, str.length(), z)) {
                    if (i != i2) {
                        i += i3;
                    }
                }
                return i;
            }
        } else {
            int i4 = c0223g4.f762;
            int i5 = c0223g4.f1424;
            if ((i5 > 0 && i <= i4) || (i5 < 0 && i4 <= i)) {
                while (!m1257(str, charSequence, i, str.length(), z)) {
                    if (i != i4) {
                        i += i5;
                    }
                }
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public static /* synthetic */ int m1256(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m1255(i, charSequence, str, z);
    }

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public static final boolean m1257(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        char upperCase;
        char upperCase2;
        C0237h4.m1090("<this>", charSequence);
        C0237h4.m1090("other", charSequence2);
        if (i < 0 || charSequence.length() - i2 < 0 || i > charSequence2.length() - i2) {
            return false;
        }
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= i2) {
                return true;
            }
            char cCharAt = charSequence.charAt(0 + i3);
            char cCharAt2 = charSequence2.charAt(i + i3);
            if (cCharAt != cCharAt2 && (!z || ((upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: ۥۡۤ, reason: contains not printable characters */
    public static final void m1258(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۡۥ, reason: contains not printable characters */
    public static List m1259(CharSequence charSequence, String[] strArr) {
        C0237h4.m1090("<this>", charSequence);
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                m1258(0);
                int iM1255 = m1255(0, charSequence, str, false);
                if (iM1255 == -1) {
                    return C0272jb.m1105(charSequence.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int length = 0;
                do {
                    arrayList.add(charSequence.subSequence(length, iM1255).toString());
                    length = str.length() + iM1255;
                    iM1255 = m1255(length, charSequence, str, false);
                } while (iM1255 != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        m1258(0);
        List listAsList = Arrays.asList(strArr);
        C0237h4.m1089("asList(...)", listAsList);
        Iterable<C0223g4> c0145aa = new C0145aa(new C0276k1(charSequence, 0, 0, new C0419ua(listAsList, false)));
        ArrayList arrayList2 = new ArrayList(c0145aa instanceof Collection ? ((Collection) c0145aa).size() : 10);
        for (C0223g4 c0223g4 : c0145aa) {
            C0237h4.m1090("range", c0223g4);
            arrayList2.add(charSequence.subSequence(Integer.valueOf(c0223g4.f761).intValue(), Integer.valueOf(c0223g4.f762).intValue() + 1).toString());
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۡۦ, reason: contains not printable characters */
    public static final CharSequence m1260(CharSequence charSequence) {
        C0237h4.m1090("<this>", charSequence);
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = charSequence.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }
}
