package p040U0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p006D.AbstractC0079h;
import p011F0.AbstractC0125m;
import p011F0.C0113a;
import p011F0.C0121i;
import p021K0.C0169h;
import p027N0.AbstractC0223g;
import p034R0.C0244c;

/* JADX INFO: renamed from: U0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0299i extends AbstractC0307q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static String m505A0(String str, String str2) {
        int iLastIndexOf = str.lastIndexOf("-", m515m0(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        AbstractC0223g.m417d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public static String m506B0(int i2, String str) {
        AbstractC0223g.m418e(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String strSubstring = str.substring(0, i2);
        AbstractC0223g.m417d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static CharSequence m507C0(CharSequence charSequence) {
        AbstractC0223g.m418e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zM166D = AbstractC0079h.m166D(charSequence.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!zM166D) {
                    break;
                }
                length--;
            } else if (zM166D) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static CharSequence m508D0(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i2 = length - 1;
            if (!AbstractC0079h.m166D(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i2 < 0) {
                return "";
            }
            length = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public static String m509E0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        AbstractC0223g.m418e(str, "<this>");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char cCharAt = str.charAt(length);
                int length2 = cArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (cCharAt == cArr[i3]) {
                        break;
                    }
                    i3++;
                }
                if (!(i3 >= 0)) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static CharSequence m510F0(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!AbstractC0079h.m166D(str.charAt(i2))) {
                return str.subSequence(i2, str.length());
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static boolean m511i0(CharSequence charSequence, String str, boolean z2) {
        AbstractC0223g.m418e(charSequence, "<this>");
        AbstractC0223g.m418e(str, "other");
        return m518p0(charSequence, str, 0, z2, 2) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static boolean m512j0(String str, char c2) {
        return m517o0(str, c2, 0, 2) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static String m513k0(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return m506B0(length, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static Character m514l0(String str) {
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public static final int m515m0(CharSequence charSequence) {
        AbstractC0223g.m418e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static final int m516n0(CharSequence charSequence, String str, int i2, boolean z2) {
        AbstractC0223g.m418e(charSequence, "<this>");
        AbstractC0223g.m418e(str, "string");
        if (!z2 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i2);
        }
        int length = charSequence.length();
        if (i2 < 0) {
            i2 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C0244c c0244c = new C0244c(i2, length, 1);
        boolean z3 = charSequence instanceof String;
        int i3 = c0244c.f585c;
        int i4 = c0244c.f584b;
        int i5 = c0244c.f583a;
        if (!z3 || str == null) {
            boolean z4 = z2;
            if ((i3 <= 0 || i5 > i4) && (i3 >= 0 || i4 > i5)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z5 = z4;
                z4 = z5;
                if (m521s0(str, 0, charSequence2, i5, str.length(), z5)) {
                    return i5;
                }
                if (i5 == i4) {
                    return -1;
                }
                i5 += i3;
                charSequence = charSequence2;
            }
        } else {
            if ((i3 <= 0 || i5 > i4) && (i3 >= 0 || i4 > i5)) {
                return -1;
            }
            int i6 = i5;
            while (true) {
                String str2 = str;
                boolean z6 = z2;
                if (AbstractC0307q.m535e0(0, i6, str.length(), str2, (String) charSequence, z6)) {
                    return i6;
                }
                if (i6 == i4) {
                    return -1;
                }
                i6 += i3;
                str = str2;
                z2 = z6;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static int m517o0(CharSequence charSequence, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        AbstractC0223g.m418e(charSequence, "<this>");
        return !(charSequence instanceof String) ? m519q0(charSequence, new char[]{c2}, i2, false) : ((String) charSequence).indexOf(c2, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ int m518p0(CharSequence charSequence, String str, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return m516n0(charSequence, str, i2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static final int m519q0(CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        int i3;
        AbstractC0223g.m418e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length == 1) {
                return ((String) charSequence).indexOf(cArr[0], i2);
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int i4 = new C0244c(i2, m515m0(charSequence), 1).f584b;
        boolean z3 = i2 <= i4;
        if (!z3) {
            i2 = i4;
        }
        while (z3) {
            if (i2 != i4) {
                i3 = i2 + 1;
            } else {
                if (!z3) {
                    throw new NoSuchElementException();
                }
                i3 = i2;
                z3 = false;
            }
            char cCharAt = charSequence.charAt(i2);
            for (char c2 : cArr) {
                if (AbstractC0079h.m187k(c2, cCharAt, z2)) {
                    return i2;
                }
            }
            i2 = i3;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public static int m520r0(String str) {
        int iM515m0 = m515m0(str);
        AbstractC0223g.m418e(str, "<this>");
        return str.lastIndexOf(46, iM515m0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static final boolean m521s0(String str, int i2, CharSequence charSequence, int i3, int i4, boolean z2) {
        AbstractC0223g.m418e(str, "<this>");
        AbstractC0223g.m418e(charSequence, "other");
        if (i3 >= 0 && i2 >= 0 && i2 <= str.length() - i4 && i3 <= charSequence.length() - i4) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (AbstractC0079h.m187k(str.charAt(i2 + i5), charSequence.charAt(i3 + i5), z2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public static String m522t0(String str, String str2) {
        AbstractC0223g.m418e(str, "<this>");
        if (!AbstractC0307q.m538h0(str, false, str2)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC0223g.m417d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static List m523u0(String str, char[] cArr) {
        AbstractC0223g.m418e(str, "<this>");
        if (cArr.length == 1) {
            String strValueOf = String.valueOf(cArr[0]);
            int iM516n0 = m516n0(str, strValueOf, 0, false);
            if (iM516n0 == -1) {
                return AbstractC0079h.m167E(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iM516n0).toString());
                length = strValueOf.length() + iM516n0;
                iM516n0 = m516n0(str, strValueOf, length, false);
            } while (iM516n0 != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            return arrayList;
        }
        C0121i c0121i = new C0121i(1, new C0169h(str, new C0113a(2, cArr)));
        ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(c0121i));
        Iterator it = c0121i.iterator();
        while (true) {
            C0292b c0292b = (C0292b) it;
            if (!c0292b.hasNext()) {
                return arrayList2;
            }
            C0244c c0244c = (C0244c) c0292b.next();
            AbstractC0223g.m418e(c0244c, "range");
            arrayList2.add(str.subSequence(c0244c.f583a, c0244c.f584b + 1).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static String m524v0(String str, char c2) {
        AbstractC0223g.m418e(str, "<this>");
        AbstractC0223g.m418e(str, "missingDelimiterValue");
        int iM517o0 = m517o0(str, c2, 0, 6);
        if (iM517o0 == -1) {
            return str;
        }
        String strSubstring = str.substring(iM517o0 + 1, str.length());
        AbstractC0223g.m417d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static String m525w0(String str) {
        AbstractC0223g.m418e(str, "<this>");
        AbstractC0223g.m418e(str, "missingDelimiterValue");
        int iM520r0 = m520r0(str);
        if (iM520r0 == -1) {
            return str;
        }
        String strSubstring = str.substring(iM520r0 + 1, str.length());
        AbstractC0223g.m417d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static String m526x0(String str, char c2) {
        int iM517o0 = m517o0(str, c2, 0, 6);
        if (iM517o0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM517o0);
        AbstractC0223g.m417d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public static String m527y0(String str, String str2) {
        int iM518p0 = m518p0(str, str2, 0, false, 6);
        if (iM518p0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iM518p0);
        AbstractC0223g.m417d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static String m528z0(String str) {
        AbstractC0223g.m418e(str, "<this>");
        int iM520r0 = m520r0(str);
        if (iM520r0 == -1) {
            return "";
        }
        String strSubstring = str.substring(0, iM520r0);
        AbstractC0223g.m417d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
