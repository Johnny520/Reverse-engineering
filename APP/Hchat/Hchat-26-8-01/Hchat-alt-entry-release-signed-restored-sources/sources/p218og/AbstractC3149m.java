package p218og;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ng.C3018p;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p015b0.C0154t;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p172lg.C2562b;
import p172lg.C2564d;
import tf.AbstractC4165l;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: og.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3149m extends AbstractC3156t {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static String m6686A0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return m6693H0(str, str2) ? str.substring(str2.length()) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public static String m6687B0(String str, String str2) {
        str.getClass();
        return m6714m0(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public static StringBuilder m6688C0(CharSequence charSequence, int i9, int i10, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i10 < i9) {
            C3193a.m6820i(AbstractC0921a.m2248k(i10, i9, "End index (", ") is less than start index (", ")."));
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i9);
        sb2.append(charSequence2);
        sb2.append(charSequence, i10, charSequence.length());
        return sb2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D0 */
    public static final void m6689D0(int i9) {
        if (i9 >= 0) {
            return;
        }
        C2104o.m5291q(AbstractC0921a.m2249l(i9, "Limit must be non-negative, but was "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public static final List m6690E0(CharSequence charSequence, String str, int i9) {
        m6689D0(i9);
        int iM6716o0 = m6716o0(charSequence, str, 0, false);
        if (iM6716o0 == -1 || i9 == 1) {
            return AbstractC0000a.m99x0(charSequence.toString());
        }
        boolean z9 = i9 > 0;
        int i10 = 10;
        if (z9 && i9 <= 10) {
            i10 = i9;
        }
        ArrayList arrayList = new ArrayList(i10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM6716o0).toString());
            length = str.length() + iM6716o0;
            if (z9 && arrayList.size() == i9 - 1) {
                break;
            }
            iM6716o0 = m6716o0(charSequence, str, length, false);
        } while (iM6716o0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F0 */
    public static List m6691F0(CharSequence charSequence, char[] cArr, int i9) {
        int i10 = (i9 & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (cArr.length == 1) {
            return m6690E0(charSequence, String.valueOf(cArr[0]), i10);
        }
        m6689D0(i10);
        C3018p c3018p = new C3018p(new C3139c(charSequence, i10, new C0154t(cArr, 16)), 0);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(c3018p));
        Iterator it = c3018p.iterator();
        while (true) {
            C3138b c3138b = (C3138b) it;
            if (!c3138b.hasNext()) {
                return arrayList;
            }
            C2564d c2564d = (C2564d) c3138b.next();
            c2564d.getClass();
            arrayList.add(charSequence.subSequence(c2564d.f8312g, c2564d.f8313h + 1).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public static List m6692G0(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return m6690E0(charSequence, str, 0);
            }
        }
        m6689D0(0);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        C3018p c3018p = new C3018p(new C3139c(charSequence, 0, new C3157u(0, listAsList)), 0);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(c3018p));
        Iterator it = c3018p.iterator();
        while (true) {
            C3138b c3138b = (C3138b) it;
            if (!c3138b.hasNext()) {
                return arrayList;
            }
            C2564d c2564d = (C2564d) c3138b.next();
            c2564d.getClass();
            arrayList.add(charSequence.subSequence(c2564d.f8312g, c2564d.f8313h + 1).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public static boolean m6693H0(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? AbstractC3156t.m6740d0((String) charSequence, (String) charSequence2, false) : m6727z0(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public static boolean m6694I0(String str, char c10) {
        str.getClass();
        return str.length() > 0 && AbstractC0000a.m15I(str.charAt(0), c10, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public static String m6695J0(String str, char c10, String str2) {
        int iM6718q0 = m6718q0(str, c10, 0, 6);
        return iM6718q0 == -1 ? str2 : str.substring(iM6718q0 + 1, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public static String m6696K0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iM6719r0 = m6719r0(str, str2, 0, false, 6);
        return iM6719r0 == -1 ? str : str.substring(str2.length() + iM6719r0, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public static String m6697L0(String str, char c10, String str2) {
        int iM6724w0 = m6724w0(str, c10, 0, 6);
        return iM6724w0 == -1 ? str2 : str.substring(iM6724w0 + 1, str.length());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M0 */
    public static String m6698M0(String str, char c10) {
        str.getClass();
        str.getClass();
        int iM6718q0 = m6718q0(str, c10, 0, 6);
        return iM6718q0 == -1 ? str : str.substring(0, iM6718q0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public static String m6699N0(String str, String str2) {
        str.getClass();
        str.getClass();
        int iM6719r0 = m6719r0(str, str2, 0, false, 6);
        return iM6719r0 == -1 ? str : str.substring(0, iM6719r0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public static String m6700O0(String str, char c10, String str2) {
        int iM6724w0 = m6724w0(str, c10, 0, 6);
        return iM6724w0 == -1 ? str2 : str.substring(0, iM6724w0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P0 */
    public static String m6701P0(int i9, String str) {
        str.getClass();
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i9 > length) {
            i9 = length;
        }
        return str.substring(0, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    public static String m6702Q0(int i9, String str) {
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i9 > length) {
            i9 = length;
        }
        return str.substring(length - i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R0 */
    public static CharSequence m6703R0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i9 = 0;
        boolean z9 = false;
        while (i9 <= length) {
            boolean zM95v0 = AbstractC0000a.m95v0(charSequence.charAt(!z9 ? i9 : length));
            if (z9) {
                if (!zM95v0) {
                    break;
                }
                length--;
            } else if (zM95v0) {
                i9++;
            } else {
                z9 = true;
            }
        }
        return charSequence.subSequence(i9, length + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S0 */
    public static String m6704S0(String str, char... cArr) {
        str.getClass();
        int length = str.length() - 1;
        int i9 = 0;
        boolean z9 = false;
        while (i9 <= length) {
            boolean zM8377l0 = AbstractC4165l.m8377l0(cArr, str.charAt(!z9 ? i9 : length));
            if (z9) {
                if (!zM8377l0) {
                    break;
                }
                length--;
            } else if (zM8377l0) {
                i9++;
            } else {
                z9 = true;
            }
        }
        return str.subSequence(i9, length + 1).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T0 */
    public static CharSequence m6705T0(String str) {
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        while (true) {
            int i9 = length - 1;
            if (!AbstractC0000a.m95v0(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i9 < 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            length = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U0 */
    public static String m6706U0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i9 = length - 1;
                if (!AbstractC4165l.m8377l0(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i9 < 0) {
                    break;
                }
                length = i9;
            }
            charSequenceSubSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            charSequenceSubSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V0 */
    public static CharSequence m6707V0(String str) {
        str.getClass();
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (!AbstractC0000a.m95v0(str.charAt(i9))) {
                return str.subSequence(i9, str.length());
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W0 */
    public static String m6708W0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                charSequenceSubSequence = HttpUrl.FRAGMENT_ENCODE_SET;
                break;
            }
            if (!AbstractC4165l.m8377l0(cArr, str.charAt(i9))) {
                charSequenceSubSequence = str.subSequence(i9, str.length());
                break;
            }
            i9++;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static boolean m6709h0(CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (m6719r0(charSequence, (String) charSequence2, 0, z9, 2) >= 0) {
                return true;
            }
        } else if (m6717p0(charSequence, charSequence2, 0, charSequence.length(), z9, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static boolean m6710i0(CharSequence charSequence, char c10) {
        charSequence.getClass();
        return m6718q0(charSequence, c10, 0, 2) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static String m6711j0(int i9, String str) {
        str.getClass();
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i9 > length) {
            i9 = length;
        }
        return str.substring(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static String m6712k0(int i9, String str) {
        if (i9 < 0) {
            C2104o.m5291q(AbstractC0921a.m2250m(i9, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length() - i9;
        if (length < 0) {
            length = 0;
        }
        return m6701P0(length, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static boolean m6713l0(CharSequence charSequence, char c10) {
        charSequence.getClass();
        return charSequence.length() > 0 && AbstractC0000a.m15I(charSequence.charAt(charSequence.length() - 1), c10, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public static boolean m6714m0(CharSequence charSequence, String str) {
        charSequence.getClass();
        return charSequence instanceof String ? AbstractC3156t.m6733W((String) charSequence, str, false) : m6727z0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static Character m6715n0(CharSequence charSequence, int i9) {
        charSequence.getClass();
        if (i9 < 0 || i9 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    public static int m6716o0(CharSequence charSequence, String str, int i9, boolean z9) {
        charSequence.getClass();
        str.getClass();
        return (z9 || !(charSequence instanceof String)) ? m6717p0(charSequence, str, i9, charSequence.length(), z9, false) : ((String) charSequence).indexOf(str, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static final int m6717p0(CharSequence charSequence, CharSequence charSequence2, int i9, int i10, boolean z9, boolean z10) {
        C2562b c2562b;
        CharSequence charSequence3 = charSequence;
        CharSequence charSequence4 = charSequence2;
        int i11 = i9;
        int i12 = i10;
        if (z10) {
            charSequence3.getClass();
            int length = charSequence3.length() - 1;
            if (i11 > length) {
                i11 = length;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            c2562b = new C2562b(i11, i12, -1);
        } else {
            if (i11 < 0) {
                i11 = 0;
            }
            int length2 = charSequence3.length();
            if (i12 > length2) {
                i12 = length2;
            }
            c2562b = new C2564d(i11, i12, 1);
        }
        boolean z11 = charSequence3 instanceof String;
        int i13 = c2562b.f8314i;
        int i14 = c2562b.f8313h;
        int i15 = c2562b.f8312g;
        if (z11 && (charSequence4 instanceof String)) {
            if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
                int i16 = i15;
                while (true) {
                    String str = (String) charSequence4;
                    if (!AbstractC3156t.m6735Y(str, 0, (String) charSequence3, i16, str.length(), z9)) {
                        if (i16 == i14) {
                            break;
                        }
                        i16 += i13;
                    } else {
                        return i16;
                    }
                }
            }
        } else if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
            while (!m6727z0(charSequence4, 0, charSequence3, i15, charSequence4.length(), z9)) {
                if (i15 != i14) {
                    i15 += i13;
                    charSequence3 = charSequence;
                    charSequence4 = charSequence2;
                }
            }
            return i15;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static int m6718q0(CharSequence charSequence, char c10, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? m6720s0(charSequence, new char[]{c10}, i9, false) : ((String) charSequence).indexOf(c10, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ int m6719r0(CharSequence charSequence, String str, int i9, boolean z9, int i10) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return m6716o0(charSequence, str, i9, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static final int m6720s0(CharSequence charSequence, char[] cArr, int i9, boolean z9) {
        char c10;
        charSequence.getClass();
        if (!z9 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                C2104o.m5287l("Array is empty.");
            } else {
                if (length == 1) {
                    c10 = cArr[0];
                    return ((String) charSequence).indexOf(c10, i9);
                }
                C2104o.m5294t("Array has more than one element.");
            }
            c10 = 0;
            return ((String) charSequence).indexOf(c10, i9);
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int length2 = charSequence.length() - 1;
        if (i9 > length2) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i9);
            for (char c11 : cArr) {
                if (AbstractC0000a.m15I(c11, cCharAt, z9)) {
                    return i9;
                }
            }
            if (i9 == length2) {
                return -1;
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    public static boolean m6721t0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            if (!AbstractC0000a.m95v0(charSequence.charAt(i9))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    public static char m6722u0(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        C2104o.m5287l("Char sequence is empty.");
        return (char) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    public static int m6723v0(int i9, String str, String str2) {
        int length = (i9 & 2) != 0 ? str.length() - 1 : 0;
        str2.getClass();
        return str.lastIndexOf(str2, length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public static int m6724w0(String str, char c10, int i9, int i10) {
        if ((i10 & 2) != 0) {
            str.getClass();
            i9 = str.length() - 1;
        }
        str.getClass();
        return str.lastIndexOf(c10, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public static List m6725x0(CharSequence charSequence) {
        charSequence.getClass();
        C3140d c3140d = new C3140d(charSequence);
        if (!c3140d.hasNext()) {
            return C4173t.f13710g;
        }
        Object next = c3140d.next();
        if (!c3140d.hasNext()) {
            return AbstractC0000a.m99x0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (c3140d.hasNext()) {
            arrayList.add(c3140d.next());
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public static String m6726y0(int i9, String str) {
        CharSequence charSequenceSubSequence;
        if (i9 < 0) {
            C2104o.m5294t(AbstractC0921a.m2250m(i9, "Desired length ", " is less than zero."));
            return null;
        }
        if (i9 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i9);
            int length = i9 - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public static final boolean m6727z0(CharSequence charSequence, int i9, CharSequence charSequence2, int i10, int i11, boolean z9) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i10 < 0 || i9 < 0 || i9 > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!AbstractC0000a.m15I(charSequence.charAt(i9 + i12), charSequence2.charAt(i10 + i12), z9)) {
                return false;
            }
        }
        return true;
    }
}
