package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class pv2 extends wv2 {
    /* JADX INFO: renamed from: A0 */
    public static StringBuilder m3985A0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < i) {
            um2.m5514d(i2, i, ") is less than start index (", "End index (");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        sb.append(charSequence2);
        sb.append(charSequence, i2, charSequence.length());
        return sb;
    }

    /* JADX INFO: renamed from: B0 */
    public static final List m3986B0(CharSequence charSequence, String str) {
        int iM4002o0 = m4002o0(charSequence, str, 0, false);
        if (iM4002o0 == -1) {
            return AbstractC0179eu.m1434O(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM4002o0).toString());
            length = str.length() + iM4002o0;
            iM4002o0 = m4002o0(charSequence, str, length, false);
        } while (iM4002o0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: C0 */
    public static List m3987C0(String str, char[] cArr) {
        str.getClass();
        int i = 1;
        if (cArr.length == 1) {
            return m3986B0(str, String.valueOf(cArr[0]));
        }
        ky0 ky0Var = new ky0(i, new c70(str, new C0686s9(21, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(ky0Var, 10));
        Iterator it = ky0Var.iterator();
        while (true) {
            b70 b70Var = (b70) it;
            if (!b70Var.hasNext()) {
                return arrayList;
            }
            c11 c11Var = (c11) b70Var.next();
            c11Var.getClass();
            arrayList.add(str.subSequence(c11Var.f25h, c11Var.f26i + 1).toString());
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static List m3988D0(String str, String[] strArr) {
        str.getClass();
        int i = 1;
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() > 0) {
                return m3986B0(str, str2);
            }
        }
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        ky0 ky0Var = new ky0(i, new c70(str, new C0601q1(5, listAsList)));
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(ky0Var, 10));
        Iterator it = ky0Var.iterator();
        while (true) {
            b70 b70Var = (b70) it;
            if (!b70Var.hasNext()) {
                return arrayList;
            }
            c11 c11Var = (c11) b70Var.next();
            c11Var.getClass();
            arrayList.add(str.subSequence(c11Var.f25h, c11Var.f26i + 1).toString());
        }
    }

    /* JADX INFO: renamed from: E0 */
    public static boolean m3989E0(String str, char c) {
        return str.length() > 0 && xe1.m6137o(str.charAt(0), c, false);
    }

    /* JADX INFO: renamed from: F0 */
    public static String m3990F0(String str, String str2) {
        int iM4004q0 = m4004q0(str, str2, 0, false, 6);
        return iM4004q0 == -1 ? str : str.substring(str2.length() + iM4004q0, str.length());
    }

    /* JADX INFO: renamed from: G0 */
    public static String m3991G0(String str, char c) {
        int iM4003p0 = m4003p0(str, c, 0, 6);
        return iM4003p0 == -1 ? str : str.substring(0, iM4003p0);
    }

    /* JADX INFO: renamed from: H0 */
    public static String m3992H0(String str, int i) {
        str.getClass();
        if (i < 0) {
            C0676s.m4645c(hk1.m2208g(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    /* JADX INFO: renamed from: I0 */
    public static CharSequence m3993I0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM6099Q = xe1.m6099Q(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM6099Q) {
                    break;
                }
                length--;
            } else if (zM6099Q) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: J0 */
    public static String m3994J0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = str.charAt(length);
                int length2 = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        i2 = -1;
                        break;
                    }
                    if (cCharAt == cArr[i2]) {
                        break;
                    }
                    i2++;
                }
                if (!(i2 >= 0)) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m3995h0(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return m4004q0(charSequence, str, 0, z, 2) >= 0;
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m3996i0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return m4003p0(charSequence, c, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: j0 */
    public static String m3997j0(String str, int i) {
        str.getClass();
        if (i < 0) {
            C0676s.m4645c(hk1.m2208g(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(i);
    }

    /* JADX INFO: renamed from: k0 */
    public static String m3998k0(String str, int i) {
        if (i < 0) {
            C0676s.m4645c(hk1.m2208g(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i;
        if (length < 0) {
            length = 0;
        }
        return m3992H0(str, length);
    }

    /* JADX INFO: renamed from: l0 */
    public static boolean m3999l0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? wv2.m6005W((String) charSequence, str, false) : m4011x0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: m0 */
    public static boolean m4000m0(String str, char c) {
        return str.length() > 0 && xe1.m6137o(str.charAt(str.length() - 1), c, false);
    }

    /* JADX INFO: renamed from: n0 */
    public static Character m4001n0(String str) {
        str.getClass();
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    /* JADX INFO: renamed from: o0 */
    public static final int m4002o0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        c11 c11Var = new c11(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = c11Var.f27j;
        int i4 = c11Var.f26i;
        int i5 = c11Var.f25h;
        if (z2 && (str instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                int i6 = i5;
                while (!wv2.m6008Z(str, 0, (String) charSequence, i6, str.length(), z)) {
                    if (i6 != i4) {
                        i6 += i3;
                    }
                }
                return i6;
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!m4011x0(str, 0, charSequence, i5, str.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    /* JADX INFO: renamed from: p0 */
    public static int m4003p0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? m4005r0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ int m4004q0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m4002o0(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: r0 */
    public static final int m4005r0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC0460mg.m3102q0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (xe1.m6137o(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static boolean m4006s0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!xe1.m6099Q(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t0 */
    public static int m4007t0(int i, String str, String str2) {
        int length;
        if ((i & 2) != 0) {
            str.getClass();
            length = str.length() - 1;
        } else {
            length = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, length);
    }

    /* JADX INFO: renamed from: u0 */
    public static int m4008u0(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = str.length() - 1;
        }
        return str.lastIndexOf(c, i);
    }

    /* JADX INFO: renamed from: v0 */
    public static final List m4009v0(String str) {
        cb1 cb1Var = new cb1(str);
        if (!cb1Var.hasNext()) {
            return be0.f819h;
        }
        Object next = cb1Var.next();
        if (!cb1Var.hasNext()) {
            return AbstractC0179eu.m1434O(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (cb1Var.hasNext()) {
            arrayList.add(cb1Var.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w0 */
    public static String m4010w0(String str, int i) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            C0676s.m4651j(hk1.m2208g(i, "Desired length ", " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: x0 */
    public static final boolean m4011x0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!xe1.m6137o(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public static String m4012y0(String str, String str2) {
        str.getClass();
        return wv2.m6012d0(str, str2, false) ? str.substring(str2.length()) : str;
    }

    /* JADX INFO: renamed from: z0 */
    public static String m4013z0(String str, String str2) {
        return m3999l0(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }
}
