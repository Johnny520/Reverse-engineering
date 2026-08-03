package p119i2;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import okio.C3193a;
import p068eh.AbstractC0921a;
import p071f1.C1024q0;
import p085fg.InterfaceC1231l;
import p101h1.AbstractC1566c;
import p101h1.C1569f;
import p177m2.AbstractC2772p;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p177m2.InterfaceC2760d;
import p204o2.AbstractC3042a;
import p225p2.AbstractC3291c;
import p225p2.C3290b;
import p227p4.C3315t;
import p237q2.C3430d;
import p280t2.C4085a;
import p280t2.C4089e;
import p280t2.C4093i;
import p280t2.C4096l;
import p280t2.C4098n;
import p280t2.C4100p;
import p280t2.C4101q;
import p280t2.C4103s;
import p280t2.InterfaceC4099o;
import p293u2.C4245o;
import p293u2.C4246p;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p324w2.AbstractC4679a;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: i2.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1923e0 {

    /* JADX INFO: renamed from: a */
    public static final C3315t f6507a;

    /* JADX INFO: renamed from: b */
    public static final C3315t f6508b;

    /* JADX INFO: renamed from: c */
    public static final C3315t f6509c;

    /* JADX INFO: renamed from: d */
    public static final C3315t f6510d;

    /* JADX INFO: renamed from: e */
    public static final C3315t f6511e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 12;
        f6507a = new C3315t(new C1954y(4), i9, new C1955z(2));
        f6508b = new C3315t(new C1954y(5), i9, new C1955z(3));
        f6509c = new C3315t(new C1954y(6), i9, new C1955z(4));
        f6510d = new C3315t(new C1954y(7), i9, new C1955z(5));
        f6511e = new C3315t(new C1954y(8), i9, new C1955z(6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1914a m4783a(String str, C1941n0 c1941n0, long j3, InterfaceC4233c interfaceC4233c, InterfaceC2760d interfaceC2760d, int i9, int i10) {
        C4173t c4173t = C4173t.f13710g;
        return new C1914a(new C3430d(str, c1941n0, c4173t, c4173t, interfaceC2760d, interfaceC4233c), i9, 1, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m4784b(int i9, int i10) {
        if (i9 < 0 || i10 < 0) {
            AbstractC3042a.m6486a("start and end cannot be negative. [start: " + i9 + ", end: " + i10 + ']');
        }
        long j3 = (((long) i10) & 4294967295L) | (((long) i9) << 32);
        int i11 = C1939m0.f6574c;
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m4785c(int i9, long j3) {
        int i10 = C1939m0.f6574c;
        int i11 = (int) (j3 >> 32);
        int i12 = i11 < 0 ? 0 : i11;
        if (i12 > i9) {
            i12 = i9;
        }
        int i13 = (int) (4294967295L & j3);
        int i14 = i13 >= 0 ? i13 : 0;
        if (i14 <= i9) {
            i9 = i14;
        }
        return (i12 == i11 && i9 == i13) ? j3 : m4784b(i12, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m4786d(int i9, List list) {
        int i10;
        int i11 = ((C1947r) AbstractC4166m.m8393B1(list)).f6598c;
        if (i9 > ((C1947r) AbstractC4166m.m8393B1(list)).f6598c) {
            AbstractC3042a.m6486a("Index " + i9 + " should be less or equal than last line's end " + i11);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 > size) {
                i10 = -(i12 + 1);
                break;
            }
            i10 = (i12 + size) >>> 1;
            C1947r c1947r = (C1947r) list.get(i10);
            byte b10 = c1947r.f6597b > i9 ? (byte) 1 : c1947r.f6598c <= i9 ? (byte) -1 : (byte) 0;
            if (b10 >= 0) {
                if (b10 <= 0) {
                    break;
                }
                size = i10 - 1;
            } else {
                i12 = i10 + 1;
            }
        }
        if (i10 >= 0 && i10 < list.size()) {
            return i10;
        }
        StringBuilder sbM2257t = AbstractC0921a.m2257t(i10, "Found paragraph index ", " should be in range [0, ");
        sbM2257t.append(list.size());
        sbM2257t.append(").\nDebug info: index=");
        sbM2257t.append(i9);
        sbM2257t.append(", paragraphs=[");
        sbM2257t.append(AbstractC4679a.m9170a(list, null, new C1946q(0), 31));
        sbM2257t.append(']');
        AbstractC3042a.m6486a(sbM2257t.toString());
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m4787e(int i9, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            C1947r c1947r = (C1947r) list.get(i11);
            byte b10 = c1947r.f6599d > i9 ? (byte) 1 : c1947r.f6600e <= i9 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m4788f(ArrayList arrayList, float f3) {
        if (f3 <= 0.0f) {
            return 0;
        }
        if (f3 >= ((C1947r) AbstractC4166m.m8393B1(arrayList)).f6602g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            C1947r c1947r = (C1947r) arrayList.get(i10);
            byte b10 = c1947r.f6601f > f3 ? (byte) 1 : c1947r.f6602g <= f3 ? (byte) -1 : (byte) 0;
            if (b10 < 0) {
                i9 = i10 + 1;
            } else {
                if (b10 <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m4789g(ArrayList arrayList, long j3, InterfaceC1231l interfaceC1231l) {
        int size = arrayList.size();
        for (int iM4786d = m4786d(C1939m0.m4816f(j3), arrayList); iM4786d < size; iM4786d++) {
            C1947r c1947r = (C1947r) arrayList.get(iM4786d);
            if (c1947r.f6597b >= C1939m0.m4815e(j3)) {
                return;
            }
            if (c1947r.f6597b != c1947r.f6598c) {
                interfaceC1231l.invoke(c1947r);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1941n0 m4790h(C1941n0 c1941n0, EnumC4243m enumC4243m) {
        long j3;
        C4101q c4101q;
        int i9;
        int i10;
        C4103s c4103s;
        C1925f0 c1925f0 = c1941n0.f6580a;
        InterfaceC4099o interfaceC4099o = AbstractC1927g0.f6535d;
        InterfaceC4099o interfaceC4099o2 = c1925f0.f6513a;
        if (interfaceC4099o2.equals(C4098n.f13563a)) {
            interfaceC4099o2 = AbstractC1927g0.f6535d;
        }
        InterfaceC4099o interfaceC4099o3 = interfaceC4099o2;
        long j4 = c1925f0.f6514b;
        C4246p[] c4246pArr = C4245o.f13923b;
        if ((j4 & 1095216660480L) == 0) {
            j4 = AbstractC1927g0.f6532a;
        }
        long j5 = j4;
        C2767k c2767k = c1925f0.f6515c;
        if (c2767k == null) {
            c2767k = C2767k.f8999i;
        }
        C2767k c2767k2 = c2767k;
        C2765i c2765i = c1925f0.f6516d;
        C2765i c2765i2 = new C2765i(c2765i != null ? c2765i.f8996a : 0);
        C2766j c2766j = c1925f0.f6517e;
        C2766j c2766j2 = new C2766j(c2766j != null ? c2766j.f8997a : Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        AbstractC2772p abstractC2772p = c1925f0.f6518f;
        if (abstractC2772p == null) {
            abstractC2772p = AbstractC2772p.f9006a;
        }
        AbstractC2772p abstractC2772p2 = abstractC2772p;
        String str = c1925f0.f6519g;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = str;
        long j10 = c1925f0.f6520h;
        if ((j10 & 1095216660480L) == 0) {
            j10 = AbstractC1927g0.f6533b;
        }
        long j11 = j10;
        C4085a c4085a = c1925f0.f6521i;
        float f3 = c4085a != null ? c4085a.f13537a : 0.0f;
        C4085a c4085a2 = new C4085a(Float.isNaN(f3) ? 0.0f : f3);
        C4100p c4100p = c1925f0.f6522j;
        if (c4100p == null) {
            c4100p = C4100p.f13564c;
        }
        C4100p c4100p2 = c4100p;
        C3290b c3290bM821r = c1925f0.f6523k;
        if (c3290bM821r == null) {
            C3290b c3290b = C3290b.f10460i;
            c3290bM821r = AbstractC3291c.f10463a.m821r();
        }
        C3290b c3290b2 = c3290bM821r;
        long j12 = c1925f0.f6524l;
        if (j12 == 16) {
            j12 = AbstractC1927g0.f6534c;
        }
        long j13 = j12;
        C4096l c4096l = c1925f0.f6525m;
        if (c4096l == null) {
            c4096l = C4096l.f13558b;
        }
        C4096l c4096l2 = c4096l;
        C1024q0 c1024q0 = c1925f0.f6526n;
        if (c1024q0 == null) {
            c1024q0 = C1024q0.f3233d;
        }
        C1024q0 c1024q02 = c1024q0;
        AbstractC1566c abstractC1566c = c1925f0.f6527o;
        if (abstractC1566c == null) {
            abstractC1566c = C1569f.f5225b;
        }
        C1925f0 c1925f02 = new C1925f0(interfaceC4099o3, j5, c2767k2, c2765i2, c2766j2, abstractC2772p2, str2, j11, c4085a2, c4100p2, c3290b2, j13, c4096l2, c1024q02, abstractC1566c);
        C1950u c1950u = c1941n0.f6581b;
        int i11 = AbstractC1951v.f6616b;
        int i12 = c1950u.f6606a;
        int i13 = 5;
        if (i12 == 0) {
            i12 = 5;
        }
        int i14 = c1950u.f6607b;
        if (i14 != 3) {
            if (i14 == 0) {
                int iOrdinal = enumC4243m.ordinal();
                if (iOrdinal == 0) {
                    i14 = 1;
                } else {
                    if (iOrdinal != 1) {
                        C3193a.m6822k();
                        return null;
                    }
                    i13 = 2;
                }
            }
            j3 = c1950u.f6608c;
            if ((j3 & 1095216660480L) == 0) {
                j3 = AbstractC1951v.f6615a;
            }
            c4101q = c1950u.f6609d;
            if (c4101q == null) {
                c4101q = C4101q.f13567c;
            }
            C1952w c1952w = c1950u.f6610e;
            C4093i c4093i = c1950u.f6611f;
            i9 = c1950u.f6612g;
            if (i9 == 0) {
                i9 = C4089e.f13542b;
            }
            i10 = c1950u.f6613h;
            if (i10 == 0) {
                i10 = 1;
            }
            c4103s = c1950u.f6614i;
            if (c4103s == null) {
                c4103s = C4103s.f13571c;
            }
            return new C1941n0(c1925f02, new C1950u(i12, i14, j3, c4101q, c1952w, c4093i, i9, i10, c4103s), c1941n0.f6582c);
        }
        int iOrdinal2 = enumC4243m.ordinal();
        if (iOrdinal2 == 0) {
            i13 = 4;
        } else if (iOrdinal2 != 1) {
            C3193a.m6822k();
            return null;
        }
        i14 = i13;
        j3 = c1950u.f6608c;
        if ((j3 & 1095216660480L) == 0) {
        }
        c4101q = c1950u.f6609d;
        if (c4101q == null) {
        }
        C1952w c1952w2 = c1950u.f6610e;
        C4093i c4093i2 = c1950u.f6611f;
        i9 = c1950u.f6612g;
        if (i9 == 0) {
        }
        i10 = c1950u.f6613h;
        if (i10 == 0) {
        }
        c4103s = c1950u.f6614i;
        if (c4103s == null) {
        }
        return new C1941n0(c1925f02, new C1950u(i12, i14, j3, c4101q, c1952w2, c4093i2, i9, i10, c4103s), c1941n0.f6582c);
    }
}
