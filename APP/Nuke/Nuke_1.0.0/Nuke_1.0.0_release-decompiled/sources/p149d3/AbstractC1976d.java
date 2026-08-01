package p149d3;

import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0974n;
import p061L2.C0958A;
import p108V3.C1554g;
import p117X2.AbstractC1665j;
import p132a3.C1804d;
import p143c3.C1904f;
import p143c3.C1909k;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: d3.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1976d extends AbstractC1983k {
    /* JADX INFO: renamed from: V */
    public static boolean m3628V(CharSequence charSequence, char c5) {
        AbstractC1665j.m2985e(charSequence, "<this>");
        return m3634b0(charSequence, c5, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: W */
    public static boolean m3629W(CharSequence charSequence, String str) {
        AbstractC1665j.m2985e(charSequence, "<this>");
        return m3635c0(charSequence, str, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: X */
    public static String m3630X(String str, int i5) {
        AbstractC1665j.m2985e(str, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0231b.m397h(i5, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i5 > length) {
            i5 = length;
        }
        String strSubstring = str.substring(i5);
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m3631Y(CharSequence charSequence, String str) {
        return charSequence instanceof String ? ((String) charSequence).endsWith(str) : m3641i0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: Z */
    public static int m3632Z(CharSequence charSequence) {
        AbstractC1665j.m2985e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: a0 */
    public static final int m3633a0(CharSequence charSequence, String str, int i5, boolean z5) {
        AbstractC1665j.m2985e(charSequence, "<this>");
        AbstractC1665j.m2985e(str, "string");
        if (!z5 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i5);
        }
        int length = charSequence.length();
        int i6 = i5 < 0 ? 0 : i5;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C1804d c1804d = new C1804d(i6, length, 1);
        boolean z6 = charSequence instanceof String;
        int i7 = c1804d.f6142f;
        int i8 = c1804d.f6141e;
        int i9 = c1804d.f6140d;
        if (!z6 || !(str instanceof String)) {
            if ((i7 <= 0 || i9 > i8) && (i7 >= 0 || i8 > i9)) {
                return -1;
            }
            while (!m3641i0(str, 0, charSequence, i9, str.length(), z5)) {
                if (i9 == i8) {
                    return -1;
                }
                i9 += i7;
            }
            return i9;
        }
        if ((i7 <= 0 || i9 > i8) && (i7 >= 0 || i8 > i9)) {
            return -1;
        }
        int i10 = i9;
        while (!AbstractC1983k.m3651N(str, 0, (String) charSequence, i10, str.length(), z5)) {
            if (i10 == i8) {
                return -1;
            }
            i10 += i7;
        }
        return i10;
    }

    /* JADX INFO: renamed from: b0 */
    public static int m3634b0(CharSequence charSequence, char c5, int i5, int i6) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        AbstractC1665j.m2985e(charSequence, "<this>");
        return !(charSequence instanceof String) ? m3636d0(charSequence, new char[]{c5}, i5, false) : ((String) charSequence).indexOf(c5, i5);
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ int m3635c0(CharSequence charSequence, String str, int i5, int i6) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return m3633a0(charSequence, str, i5, false);
    }

    /* JADX INFO: renamed from: d0 */
    public static final int m3636d0(CharSequence charSequence, char[] cArr, int i5, boolean z5) {
        AbstractC1665j.m2985e(charSequence, "<this>");
        if (!z5 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i5);
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int iM3632Z = m3632Z(charSequence);
        if (i5 > iM3632Z) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i5);
            for (char c5 : cArr) {
                if (AbstractC1926h.m3572o(c5, cCharAt, z5)) {
                    return i5;
                }
            }
            if (i5 == iM3632Z) {
                return -1;
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m3637e0(CharSequence charSequence) {
        AbstractC1665j.m2985e(charSequence, "<this>");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (!AbstractC1926h.m3580w(charSequence.charAt(i5))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public static int m3638f0(int i5, String str, String str2) {
        int iM3632Z = (i5 & 2) != 0 ? m3632Z(str) : 0;
        AbstractC1665j.m2985e(str, "<this>");
        AbstractC1665j.m2985e(str2, "string");
        return str.lastIndexOf(str2, iM3632Z);
    }

    /* JADX INFO: renamed from: g0 */
    public static int m3639g0(String str, char c5, int i5, int i6) {
        if ((i6 & 2) != 0) {
            i5 = m3632Z(str);
        }
        return str.lastIndexOf(c5, i5);
    }

    /* JADX INFO: renamed from: h0 */
    public static String m3640h0(String str, int i5) {
        CharSequence charSequenceSubSequence;
        AbstractC1665j.m2985e(str, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0231b.m397h(i5, "Desired length ", " is less than zero."));
        }
        if (i5 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i5);
            int length = i5 - str.length();
            int i6 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: i0 */
    public static final boolean m3641i0(CharSequence charSequence, int i5, CharSequence charSequence2, int i6, int i7, boolean z5) {
        AbstractC1665j.m2985e(charSequence, "<this>");
        AbstractC1665j.m2985e(charSequence2, "other");
        if (i6 < 0 || i5 < 0 || i5 > charSequence.length() - i7 || i6 > charSequence2.length() - i7) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!AbstractC1926h.m3572o(charSequence.charAt(i5 + i8), charSequence2.charAt(i6 + i8), z5)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public static String m3642j0(String str, String str2) {
        AbstractC1665j.m2985e(str, "<this>");
        if (!AbstractC1983k.m3656S(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: k0 */
    public static final List m3643k0(CharSequence charSequence, String str) {
        int iM3633a0 = m3633a0(charSequence, str, 0, false);
        if (iM3633a0 == -1) {
            return AbstractC2352g.m4211y(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM3633a0).toString());
            length = str.length() + iM3633a0;
            iM3633a0 = m3633a0(charSequence, str, length, false);
        } while (iM3633a0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: l0 */
    public static List m3644l0(String str, String[] strArr) {
        AbstractC1665j.m2985e(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return m3643k0(str, str2);
            }
        }
        C1909k c1909k = new C1909k(new C1904f(str, new C1554g(5, AbstractC0972l.m1987K(strArr))));
        ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(c1909k, 10));
        Iterator it = c1909k.iterator();
        while (true) {
            C0958A c0958a = (C0958A) it;
            if (!c0958a.hasNext()) {
                return arrayList;
            }
            C1804d c1804d = (C1804d) c0958a.next();
            AbstractC1665j.m2985e(c1804d, "range");
            arrayList.add(str.subSequence(c1804d.f6140d, c1804d.f6141e + 1).toString());
        }
    }

    /* JADX INFO: renamed from: m0 */
    public static String m3645m0(String str, String str2) {
        AbstractC1665j.m2985e(str2, "delimiter");
        int iM3635c0 = m3635c0(str, str2, 0, 6);
        if (iM3635c0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iM3635c0, str.length());
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: n0 */
    public static String m3646n0(String str, int i5) {
        AbstractC1665j.m2985e(str, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0231b.m397h(i5, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i5 > length) {
            i5 = length;
        }
        String strSubstring = str.substring(0, i5);
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: o0 */
    public static CharSequence m3647o0(CharSequence charSequence) {
        AbstractC1665j.m2985e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i5 = 0;
        boolean z5 = false;
        while (i5 <= length) {
            boolean zM3580w = AbstractC1926h.m3580w(charSequence.charAt(!z5 ? i5 : length));
            if (z5) {
                if (!zM3580w) {
                    break;
                }
                length--;
            } else if (zM3580w) {
                i5++;
            } else {
                z5 = true;
            }
        }
        return charSequence.subSequence(i5, length + 1);
    }
}
