package p299ub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p080f9.C2361h;
import p080f9.C2363j;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;
import p185m8.AbstractC5110v;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5116y;
import p376zd.C10030z0;
import sb.AbstractC7294t;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: ub.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8621f0 extends AbstractC8611a0 {

    /* JADX INFO: renamed from: ub.f0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5110v {

        /* JADX INFO: renamed from: q */
        public int f28685q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ CharSequence f28686r;

        public a(CharSequence charSequence) {
            this.f28686r = charSequence;
        }

        @Override // p185m8.AbstractC5110v
        /* JADX INFO: renamed from: g */
        public char mo8551g() {
            CharSequence charSequence = this.f28686r;
            int i10 = this.f28685q;
            this.f28685q = i10 + 1;
            return charSequence.charAt(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28685q < this.f28686r.length();
        }
    }

    /* JADX INFO: renamed from: ub.f0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC7282h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f28687a;

        public b(CharSequence charSequence) {
            this.f28687a = charSequence;
        }

        @Override // sb.InterfaceC7282h
        public Iterator iterator() {
            return new C8620f(this.f28687a);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static String m33094A0(String str, int i10, char c10) {
        str.getClass();
        return m33171z0(str, i10, c10).toString();
    }

    /* JADX INFO: renamed from: B0 */
    public static final InterfaceC7282h m33095B0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        m33107N0(i11);
        return new C8616d(charSequence, i10, i11, new InterfaceC0188p() { // from class: ub.c0
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC8621f0.m33099F0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public static final InterfaceC7282h m33096C0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        m33107N0(i11);
        final List listM20652d = AbstractC5102r.m20652d(strArr);
        return new C8616d(charSequence, i10, i11, new InterfaceC0188p() { // from class: ub.d0
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC8621f0.m33100G0(listM20652d, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ InterfaceC7282h m33097D0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m33095B0(charSequence, cArr, i10, z10, i11);
    }

    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ InterfaceC7282h m33098E0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m33096C0(charSequence, strArr, i10, z10, i11);
    }

    /* JADX INFO: renamed from: F0 */
    public static final C4711r m33099F0(char[] cArr, boolean z10, CharSequence charSequence, int i10) {
        charSequence.getClass();
        int iM33154o0 = m33154o0(charSequence, cArr, i10, z10);
        if (iM33154o0 < 0) {
            return null;
        }
        return AbstractC4717x.m18815a(Integer.valueOf(iM33154o0), 1);
    }

    /* JADX INFO: renamed from: G0 */
    public static final C4711r m33100G0(List list, boolean z10, CharSequence charSequence, int i10) {
        charSequence.getClass();
        C4711r c4711rM33136f0 = m33136f0(charSequence, list, i10, z10, false);
        if (c4711rM33136f0 != null) {
            return AbstractC4717x.m18815a(c4711rM33136f0.m18795e(), Integer.valueOf(((String) c4711rM33136f0.m18796f()).length()));
        }
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public static final boolean m33101H0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!AbstractC8612b.m33080d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public static String m33102I0(String str, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return m33127a1(str, charSequence, false, 2, null) ? str.substring(charSequence.length()) : str;
    }

    /* JADX INFO: renamed from: J0 */
    public static String m33103J0(String str, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return m33134e0(str, charSequence, false, 2, null) ? str.substring(0, str.length() - charSequence.length()) : str;
    }

    /* JADX INFO: renamed from: K0 */
    public static String m33104K0(String str, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return m33105L0(str, charSequence, charSequence);
    }

    /* JADX INFO: renamed from: L0 */
    public static final String m33105L0(String str, CharSequence charSequence, CharSequence charSequence2) {
        str.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        return (str.length() >= charSequence.length() + charSequence2.length() && m33127a1(str, charSequence, false, 2, null) && m33134e0(str, charSequence2, false, 2, null)) ? str.substring(charSequence.length(), str.length() - charSequence2.length()) : str;
    }

    /* JADX INFO: renamed from: M0 */
    public static CharSequence m33106M0(CharSequence charSequence, int i10, int i11, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i11 < i10) {
            C8613b0.m33082a("End index (", i11, ") is less than start index (", i10);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i10);
        sb2.append(charSequence2);
        sb2.append(charSequence, i11, charSequence.length());
        return sb2;
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m33107N0(int i10) {
        if (i10 >= 0) {
            return;
        }
        C10030z0.m38853a("Limit must be non-negative, but was ", i10);
    }

    /* JADX INFO: renamed from: O0 */
    public static final List m33108O0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        charSequence.getClass();
        cArr.getClass();
        if (cArr.length == 1) {
            return m33110Q0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable iterableM28912v = AbstractC7294t.m28912v(m33097D0(charSequence, cArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(iterableM28912v, 10));
        Iterator it = iterableM28912v.iterator();
        while (it.hasNext()) {
            arrayList.add(m33129b1(charSequence, (C2363j) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P0 */
    public static final List m33109P0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        charSequence.getClass();
        strArr.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m33110Q0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableM28912v = AbstractC7294t.m28912v(m33098E0(charSequence, strArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(iterableM28912v, 10));
        Iterator it = iterableM28912v.iterator();
        while (it.hasNext()) {
            arrayList.add(m33129b1(charSequence, (C2363j) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Q0 */
    public static final List m33110Q0(CharSequence charSequence, String str, boolean z10, int i10) {
        m33107N0(i10);
        int length = 0;
        int iM33144j0 = m33144j0(charSequence, str, 0, z10);
        if (iM33144j0 == -1 || i10 == 1) {
            return AbstractC5112w.m20789e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? AbstractC2368o.m8582i(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM33144j0).toString());
            length = str.length() + iM33144j0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iM33144j0 = m33144j0(charSequence, str, length, z10);
        } while (iM33144j0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ List m33111R0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m33108O0(charSequence, cArr, z10, i10);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ List m33112S0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m33109P0(charSequence, strArr, z10, i10);
    }

    /* JADX INFO: renamed from: T0 */
    public static final InterfaceC7282h m33113T0(final CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        charSequence.getClass();
        strArr.getClass();
        return AbstractC7294t.m28901I(m33098E0(charSequence, strArr, 0, z10, i10, 2, null), new InterfaceC0184l() { // from class: ub.e0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC8621f0.m33117V0(charSequence, (C2363j) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ InterfaceC7282h m33115U0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m33113T0(charSequence, strArr, z10, i10);
    }

    /* JADX INFO: renamed from: V0 */
    public static final String m33117V0(CharSequence charSequence, C2363j c2363j) {
        c2363j.getClass();
        return m33129b1(charSequence, c2363j);
    }

    /* JADX INFO: renamed from: W0 */
    public static final boolean m33119W0(CharSequence charSequence, char c10, boolean z10) {
        charSequence.getClass();
        return charSequence.length() > 0 && AbstractC8612b.m33080d(charSequence.charAt(0), c10, z10);
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m33120X(CharSequence charSequence, char c10, boolean z10) {
        charSequence.getClass();
        return m33150m0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    /* JADX INFO: renamed from: X0 */
    public static boolean m33121X0(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10) {
        charSequence.getClass();
        charSequence2.getClass();
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? AbstractC8611a0.m33074S((String) charSequence, (String) charSequence2, i10, false, 4, null) : m33101H0(charSequence, i10, charSequence2, 0, charSequence2.length(), z10);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m33122Y(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        charSequence.getClass();
        charSequence2.getClass();
        return charSequence2 instanceof String ? m33152n0(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0 : m33148l0(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    /* JADX INFO: renamed from: Y0 */
    public static boolean m33123Y0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        charSequence.getClass();
        charSequence2.getClass();
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? AbstractC8611a0.m33075T((String) charSequence, (String) charSequence2, false, 2, null) : m33101H0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ boolean m33124Z(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m33120X(charSequence, c10, z10);
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ boolean m33125Z0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m33119W0(charSequence, c10, z10);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ boolean m33126a0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m33122Y(charSequence, charSequence2, z10);
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ boolean m33127a1(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m33123Y0(charSequence, charSequence2, z10);
    }

    /* JADX INFO: renamed from: b0 */
    public static final boolean m33128b0(CharSequence charSequence, char c10, boolean z10) {
        charSequence.getClass();
        return charSequence.length() > 0 && AbstractC8612b.m33080d(charSequence.charAt(m33140h0(charSequence)), c10, z10);
    }

    /* JADX INFO: renamed from: b1 */
    public static final String m33129b1(CharSequence charSequence, C2363j c2363j) {
        charSequence.getClass();
        c2363j.getClass();
        return charSequence.subSequence(c2363j.m8568v().intValue(), c2363j.m8567u().intValue() + 1).toString();
    }

    /* JADX INFO: renamed from: c0 */
    public static final boolean m33130c0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        charSequence.getClass();
        charSequence2.getClass();
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? AbstractC8611a0.m33060E((String) charSequence, (String) charSequence2, false, 2, null) : m33101H0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    /* JADX INFO: renamed from: c1 */
    public static String m33131c1(String str, C2363j c2363j) {
        str.getClass();
        c2363j.getClass();
        return str.substring(c2363j.m8568v().intValue(), c2363j.m8567u().intValue() + 1);
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ boolean m33132d0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m33128b0(charSequence, c10, z10);
    }

    /* JADX INFO: renamed from: d1 */
    public static String m33133d1(String str, char c10, String str2) {
        str.getClass();
        str2.getClass();
        int iM33150m0 = m33150m0(str, c10, 0, false, 6, null);
        return iM33150m0 == -1 ? str2 : str.substring(iM33150m0 + 1, str.length());
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ boolean m33134e0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m33130c0(charSequence, charSequence2, z10);
    }

    /* JADX INFO: renamed from: e1 */
    public static String m33135e1(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM33152n0 = m33152n0(str, str2, 0, false, 6, null);
        return iM33152n0 == -1 ? str3 : str.substring(iM33152n0 + str2.length(), str.length());
    }

    /* JADX INFO: renamed from: f0 */
    public static final C4711r m33136f0(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) AbstractC5081g0.m20536H0(collection);
            int iM33152n0 = !z11 ? m33152n0(charSequence, str, i10, false, 4, null) : m33166u0(charSequence, str, i10, false, 4, null);
            if (iM33152n0 < 0) {
                return null;
            }
            return AbstractC4717x.m18815a(Integer.valueOf(iM33152n0), str);
        }
        CharSequence charSequence3 = charSequence;
        C2361h c2363j = !z11 ? new C2363j(AbstractC2368o.m8578e(i10, 0), charSequence3.length()) : AbstractC2368o.m8589p(AbstractC2368o.m8582i(i10, m33140h0(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iM8560o = c2363j.m8560o();
            int iM8561p = c2363j.m8561p();
            int iM8562q = c2363j.m8562q();
            if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
                int i11 = iM8560o;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (AbstractC8611a0.m33063H(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iM8561p) {
                            break;
                        }
                        i11 += iM8562q;
                        z10 = z12;
                    } else {
                        return AbstractC4717x.m18815a(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iM8560o2 = c2363j.m8560o();
            int iM8561p2 = c2363j.m8561p();
            int iM8562q2 = c2363j.m8562q();
            if ((iM8562q2 > 0 && iM8560o2 <= iM8561p2) || (iM8562q2 < 0 && iM8561p2 <= iM8560o2)) {
                int i12 = iM8560o2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (m33101H0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iM8561p2) {
                            break;
                        }
                        i12 += iM8562q2;
                        charSequence3 = charSequence2;
                    } else {
                        return AbstractC4717x.m18815a(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ String m33137f1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m33133d1(str, c10, str2);
    }

    /* JADX INFO: renamed from: g0 */
    public static C2363j m33138g0(CharSequence charSequence) {
        charSequence.getClass();
        return new C2363j(0, charSequence.length() - 1);
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ String m33139g1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m33135e1(str, str2, str3);
    }

    /* JADX INFO: renamed from: h0 */
    public static int m33140h0(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: h1 */
    public static String m33141h1(String str, char c10, String str2) {
        str.getClass();
        str2.getClass();
        int iM33164t0 = m33164t0(str, c10, 0, false, 6, null);
        return iM33164t0 == -1 ? str2 : str.substring(iM33164t0 + 1, str.length());
    }

    /* JADX INFO: renamed from: i0 */
    public static final int m33142i0(CharSequence charSequence, char c10, int i10, boolean z10) {
        charSequence.getClass();
        return (z10 || !(charSequence instanceof String)) ? m33154o0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    /* JADX INFO: renamed from: i1 */
    public static final String m33143i1(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM33166u0 = m33166u0(str, str2, 0, false, 6, null);
        return iM33166u0 == -1 ? str3 : str.substring(iM33166u0 + str2.length(), str.length());
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m33144j0(CharSequence charSequence, String str, int i10, boolean z10) {
        charSequence.getClass();
        str.getClass();
        return (z10 || !(charSequence instanceof String)) ? m33148l0(charSequence, str, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(str, i10);
    }

    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ String m33145j1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m33141h1(str, c10, str2);
    }

    /* JADX INFO: renamed from: k0 */
    public static final int m33146k0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        C2361h c2363j = !z11 ? new C2363j(AbstractC2368o.m8578e(i10, 0), AbstractC2368o.m8582i(i11, charSequence.length())) : AbstractC2368o.m8589p(AbstractC2368o.m8582i(i10, m33140h0(charSequence)), AbstractC2368o.m8578e(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM8560o = c2363j.m8560o();
            int iM8561p = c2363j.m8561p();
            int iM8562q = c2363j.m8562q();
            if ((iM8562q <= 0 || iM8560o > iM8561p) && (iM8562q >= 0 || iM8561p > iM8560o)) {
                return -1;
            }
            int i12 = iM8560o;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (AbstractC8611a0.m33063H(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iM8561p) {
                    return -1;
                }
                i12 += iM8562q;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iM8560o2 = c2363j.m8560o();
            int iM8561p2 = c2363j.m8561p();
            int iM8562q2 = c2363j.m8562q();
            if ((iM8562q2 <= 0 || iM8560o2 > iM8561p2) && (iM8562q2 >= 0 || iM8561p2 > iM8560o2)) {
                return -1;
            }
            int i13 = iM8560o2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (m33101H0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iM8561p2) {
                    return -1;
                }
                i13 += iM8562q2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static /* synthetic */ String m33147k1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m33143i1(str, str2, str3);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ int m33148l0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return m33146k0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    /* JADX INFO: renamed from: l1 */
    public static final String m33149l1(String str, char c10, String str2) {
        str.getClass();
        str2.getClass();
        int iM33150m0 = m33150m0(str, c10, 0, false, 6, null);
        return iM33150m0 == -1 ? str2 : str.substring(0, iM33150m0);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ int m33150m0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m33142i0(charSequence, c10, i10, z10);
    }

    /* JADX INFO: renamed from: m1 */
    public static final String m33151m1(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM33152n0 = m33152n0(str, str2, 0, false, 6, null);
        return iM33152n0 == -1 ? str3 : str.substring(0, iM33152n0);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ int m33152n0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m33144j0(charSequence, str, i10, z10);
    }

    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ String m33153n1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m33149l1(str, c10, str2);
    }

    /* JADX INFO: renamed from: o0 */
    public static final int m33154o0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        charSequence.getClass();
        cArr.getClass();
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC5106t.m20685F0(cArr), i10);
        }
        int iM8578e = AbstractC2368o.m8578e(i10, 0);
        int iM33140h0 = m33140h0(charSequence);
        if (iM8578e > iM33140h0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iM8578e);
            for (char c10 : cArr) {
                if (AbstractC8612b.m33080d(c10, cCharAt, z10)) {
                    return iM8578e;
                }
            }
            if (iM8578e == iM33140h0) {
                return -1;
            }
            iM8578e++;
        }
    }

    /* JADX INFO: renamed from: o1 */
    public static /* synthetic */ String m33155o1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m33151m1(str, str2, str3);
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m33156p0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!AbstractC8610a.m33055c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p1 */
    public static String m33157p1(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iM33166u0 = m33166u0(str, str2, 0, false, 6, null);
        return iM33166u0 == -1 ? str3 : str.substring(0, iM33166u0);
    }

    /* JADX INFO: renamed from: q0 */
    public static final AbstractC5110v m33158q0(CharSequence charSequence) {
        charSequence.getClass();
        return new a(charSequence);
    }

    /* JADX INFO: renamed from: q1 */
    public static Boolean m33159q1(String str) {
        str.getClass();
        if (AbstractC1061t.m3842c(str, "true")) {
            return Boolean.TRUE;
        }
        if (AbstractC1061t.m3842c(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: r0 */
    public static final int m33160r0(CharSequence charSequence, char c10, int i10, boolean z10) {
        charSequence.getClass();
        return (z10 || !(charSequence instanceof String)) ? m33167v0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    /* JADX INFO: renamed from: r1 */
    public static CharSequence m33161r1(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zM33055c = AbstractC8610a.m33055c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zM33055c) {
                    break;
                }
                length--;
            } else if (zM33055c) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    /* JADX INFO: renamed from: s0 */
    public static final int m33162s0(CharSequence charSequence, String str, int i10, boolean z10) {
        charSequence.getClass();
        str.getClass();
        return (z10 || !(charSequence instanceof String)) ? m33146k0(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    /* JADX INFO: renamed from: s1 */
    public static String m33163s1(String str, char... cArr) {
        str.getClass();
        cArr.getClass();
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zM20698O = AbstractC5106t.m20698O(cArr, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zM20698O) {
                    break;
                }
                length--;
            } else if (zM20698O) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ int m33164t0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m33140h0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m33160r0(charSequence, c10, i10, z10);
    }

    /* JADX INFO: renamed from: t1 */
    public static String m33165t1(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        cArr.getClass();
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!AbstractC5106t.m20698O(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = _UrlKt.FRAGMENT_ENCODE_SET;
        } else {
            charSequenceSubSequence = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ int m33166u0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m33140h0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m33162s0(charSequence, str, i10, z10);
    }

    /* JADX INFO: renamed from: v0 */
    public static final int m33167v0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        charSequence.getClass();
        cArr.getClass();
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC5106t.m20685F0(cArr), i10);
        }
        for (int iM8582i = AbstractC2368o.m8582i(i10, m33140h0(charSequence)); -1 < iM8582i; iM8582i--) {
            char cCharAt = charSequence.charAt(iM8582i);
            for (char c10 : cArr) {
                if (AbstractC8612b.m33080d(c10, cCharAt, z10)) {
                    return iM8582i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ int m33168w0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m33140h0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m33167v0(charSequence, cArr, i10, z10);
    }

    /* JADX INFO: renamed from: x0 */
    public static InterfaceC7282h m33169x0(CharSequence charSequence) {
        charSequence.getClass();
        return new b(charSequence);
    }

    /* JADX INFO: renamed from: y0 */
    public static List m33170y0(CharSequence charSequence) {
        charSequence.getClass();
        return AbstractC7294t.m28908P(m33169x0(charSequence));
    }

    /* JADX INFO: renamed from: z0 */
    public static final CharSequence m33171z0(CharSequence charSequence, int i10, char c10) {
        charSequence.getClass();
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }
}
