package p092S0;

import java.util.ArrayList;
import java.util.List;
import p000A.C0038T0;
import p011B4.AbstractC0231b;
import p027E4.C0330q;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p081Q.C1160c;
import p110W0.AbstractC1592q;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p110W0.InterfaceC1580e;
import p112W2.InterfaceC1601c;
import p120Y0.AbstractC1732a;
import p125Z0.AbstractC1782c;
import p125Z0.C1781b;
import p130a1.C1791d;
import p147d1.C1951a;
import p147d1.C1955e;
import p147d1.C1959i;
import p147d1.C1962l;
import p147d1.C1964n;
import p147d1.C1966p;
import p147d1.C1967q;
import p147d1.C1969s;
import p147d1.InterfaceC1965o;
import p153e1.C2019o;
import p153e1.C2020p;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p164g1.AbstractC2179a;
import p179i4.AbstractC2352g;
import p211o0.C2737L;
import p222q0.AbstractC2902c;
import p222q0.C2905f;

/* JADX INFO: renamed from: S0.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1251D {

    /* JADX INFO: renamed from: a */
    public static final C0038T0 f4489a;

    /* JADX INFO: renamed from: b */
    public static final C0038T0 f4490b;

    /* JADX INFO: renamed from: c */
    public static final C0038T0 f4491c;

    /* JADX INFO: renamed from: d */
    public static final C0038T0 f4492d;

    /* JADX INFO: renamed from: e */
    public static final C0038T0 f4493e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 29;
        f4489a = new C0038T0(i5, new C1287y((byte) 0, 3), new C1286x(6));
        f4490b = new C0038T0(i5, new C1287y((byte) 0, 4), new C1286x(7));
        f4491c = new C0038T0(i5, new C1287y((byte) 0, 5), new C1286x(8));
        f4492d = new C0038T0(i5, new C1287y((byte) 0, 6), new C1286x(9));
        f4493e = new C0038T0(i5, new C1287y((byte) 0, 7), new C1286x(10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1263a m2312a(String str, C1260M c1260m, long j5, InterfaceC2007c interfaceC2007c, InterfaceC1580e interfaceC1580e, int i5, int i6) {
        C0981u c0981u = C0981u.f3047d;
        return new C1263a(new C1791d(str, c1260m, c0981u, c0981u, interfaceC1580e, interfaceC2007c), i5, 1, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m2313b(int i5, int i6) {
        if (i5 < 0 || i6 < 0) {
            AbstractC1732a.m3085a("start and end cannot be negative. [start: " + i5 + ", end: " + i6 + ']');
        }
        long j5 = (((long) i6) & 4294967295L) | (((long) i5) << 32);
        int i7 = C1259L.f4537c;
        return j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m2314c(long j5, int i5) {
        int i6 = C1259L.f4537c;
        int i7 = (int) (j5 >> 32);
        int i8 = i7 < 0 ? 0 : i7;
        if (i8 > i5) {
            i8 = i5;
        }
        int i9 = (int) (4294967295L & j5);
        int i10 = i9 >= 0 ? i9 : 0;
        if (i10 <= i5) {
            i5 = i10;
        }
        return (i8 == i7 && i5 == i9) ? j5 : m2313b(i8, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final int m2315d(int i5, List list) {
        int i6;
        int i7 = ((C1279q) AbstractC0973m.m2017X(list)).f4597c;
        if (i5 > ((C1279q) AbstractC0973m.m2017X(list)).f4597c) {
            AbstractC1732a.m3085a("Index " + i5 + " should be less or equal than last line's end " + i7);
        }
        int size = list.size() - 1;
        int i8 = 0;
        while (true) {
            if (i8 > size) {
                i6 = -(i8 + 1);
                break;
            }
            i6 = (i8 + size) >>> 1;
            C1279q c1279q = (C1279q) list.get(i6);
            byte b2 = c1279q.f4596b > i5 ? (byte) 1 : c1279q.f4597c <= i5 ? (byte) -1 : (byte) 0;
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i6 - 1;
            } else {
                i8 = i6 + 1;
            }
        }
        if (i6 >= 0 && i6 < list.size()) {
            return i6;
        }
        StringBuilder sbM404o = AbstractC0231b.m404o(i6, "Found paragraph index ", " should be in range [0, ");
        sbM404o.append(list.size());
        sbM404o.append(").\nDebug info: index=");
        sbM404o.append(i5);
        sbM404o.append(", paragraphs=[");
        sbM404o.append(AbstractC2179a.m4007a(list, null, new C1160c(4), 31));
        sbM404o.append(']');
        AbstractC1732a.m3085a(sbM404o.toString());
        return i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m2316e(int i5, List list) {
        int size = list.size() - 1;
        int i6 = 0;
        while (i6 <= size) {
            int i7 = (i6 + size) >>> 1;
            C1279q c1279q = (C1279q) list.get(i7);
            byte b2 = c1279q.f4598d > i5 ? (byte) 1 : c1279q.f4599e <= i5 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i6 = i7 + 1;
            } else {
                if (b2 <= 0) {
                    return i7;
                }
                size = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m2317f(ArrayList arrayList, float f2) {
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((C1279q) AbstractC0973m.m2017X(arrayList)).f4601g) {
            return AbstractC2352g.m4208u(arrayList);
        }
        int size = arrayList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            C1279q c1279q = (C1279q) arrayList.get(i6);
            byte b2 = c1279q.f4600f > f2 ? (byte) 1 : c1279q.f4601g <= f2 ? (byte) -1 : (byte) 0;
            if (b2 < 0) {
                i5 = i6 + 1;
            } else {
                if (b2 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m2318g(ArrayList arrayList, long j5, InterfaceC1601c interfaceC1601c) {
        int size = arrayList.size();
        for (int iM2315d = m2315d(C1259L.m2338f(j5), arrayList); iM2315d < size; iM2315d++) {
            C1279q c1279q = (C1279q) arrayList.get(iM2315d);
            if (c1279q.f4596b >= C1259L.m2337e(j5)) {
                return;
            }
            if (c1279q.f4596b != c1279q.f4597c) {
                interfaceC1601c.mo1h(c1279q);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011d  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1260M m2319h(C1260M c1260m, EnumC2017m enumC2017m) {
        long j5;
        C1967q c1967q;
        int i5;
        int i6;
        C1969s c1969s;
        C1252E c1252e = c1260m.f4540a;
        InterfaceC1965o interfaceC1965o = AbstractC1253F.f4512d;
        InterfaceC1965o interfaceC1965o2 = c1252e.f4494a;
        if (interfaceC1965o2.equals(C1964n.f6645a)) {
            interfaceC1965o2 = AbstractC1253F.f4512d;
        }
        InterfaceC1965o interfaceC1965o3 = interfaceC1965o2;
        long j6 = c1252e.f4495b;
        C2020p[] c2020pArr = C2019o.f6746b;
        if ((j6 & 1095216660480L) == 0) {
            j6 = AbstractC1253F.f4509a;
        }
        long j7 = j6;
        C1587l c1587l = c1252e.f4496c;
        if (c1587l == null) {
            c1587l = C1587l.f5502f;
        }
        C1587l c1587l2 = c1587l;
        C1585j c1585j = c1252e.f4497d;
        C1585j c1585j2 = new C1585j(c1585j != null ? c1585j.f5499a : 0);
        C1586k c1586k = c1252e.f4498e;
        C1586k c1586k2 = new C1586k(c1586k != null ? c1586k.f5500a : 65535);
        AbstractC1592q abstractC1592q = c1252e.f4499f;
        if (abstractC1592q == null) {
            abstractC1592q = AbstractC1592q.f5512a;
        }
        AbstractC1592q abstractC1592q2 = abstractC1592q;
        String str = c1252e.f4500g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j8 = c1252e.f4501h;
        if ((j8 & 1095216660480L) == 0) {
            j8 = AbstractC1253F.f4510b;
        }
        long j9 = j8;
        C1951a c1951a = c1252e.f4502i;
        float f2 = c1951a != null ? c1951a.f6619a : 0.0f;
        C1951a c1951a2 = new C1951a(Float.isNaN(f2) ? 0.0f : f2);
        C1966p c1966p = c1252e.f4503j;
        if (c1966p == null) {
            c1966p = C1966p.f6646c;
        }
        C1966p c1966p2 = c1966p;
        C1781b c1781bM107k = c1252e.f4504k;
        if (c1781bM107k == null) {
            C1781b c1781b = C1781b.f6089f;
            c1781bM107k = AbstractC1782c.f6092a.m107k();
        }
        C1781b c1781b2 = c1781bM107k;
        long j10 = c1252e.f4505l;
        if (j10 == 16) {
            j10 = AbstractC1253F.f4511c;
        }
        long j11 = j10;
        C1962l c1962l = c1252e.f4506m;
        if (c1962l == null) {
            c1962l = C1962l.f6640b;
        }
        C1962l c1962l2 = c1962l;
        C2737L c2737l = c1252e.f4507n;
        if (c2737l == null) {
            c2737l = C2737L.f8703d;
        }
        C2737L c2737l2 = c2737l;
        AbstractC2902c abstractC2902c = c1252e.f4508o;
        if (abstractC2902c == null) {
            abstractC2902c = C2905f.f9190b;
        }
        C1252E c1252e2 = new C1252E(interfaceC1965o3, j7, c1587l2, c1585j2, c1586k2, abstractC1592q2, str2, j9, c1951a2, c1966p2, c1781b2, j11, c1962l2, c2737l2, abstractC2902c);
        C1282t c1282t = c1260m.f4541b;
        int i7 = AbstractC1283u.f4615b;
        int i8 = c1282t.f4605a;
        int i9 = 5;
        if (i8 == 0) {
            i8 = 5;
        }
        int i10 = c1282t.f4606b;
        if (i10 != 3) {
            if (i10 == 0) {
                int iOrdinal = enumC2017m.ordinal();
                if (iOrdinal == 0) {
                    i10 = 1;
                } else {
                    if (iOrdinal != 1) {
                        throw new C0330q();
                    }
                    i9 = 2;
                }
            }
            j5 = c1282t.f4607c;
            if ((j5 & 1095216660480L) == 0) {
                j5 = AbstractC1283u.f4614a;
            }
            c1967q = c1282t.f4608d;
            if (c1967q == null) {
                c1967q = C1967q.f6649c;
            }
            long j12 = j5;
            C1284v c1284v = c1282t.f4609e;
            C1959i c1959i = c1282t.f4610f;
            i5 = c1282t.f4611g;
            if (i5 == 0) {
                i5 = C1955e.f6624b;
            }
            i6 = c1282t.f4612h;
            if (i6 == 0) {
                i6 = 1;
            }
            c1969s = c1282t.f4613i;
            if (c1969s == null) {
                c1969s = C1969s.f6653c;
            }
            return new C1260M(c1252e2, new C1282t(i8, i10, j12, c1967q, c1284v, c1959i, i5, i6, c1969s), c1260m.f4542c);
        }
        int iOrdinal2 = enumC2017m.ordinal();
        if (iOrdinal2 == 0) {
            i9 = 4;
        } else if (iOrdinal2 != 1) {
            throw new C0330q();
        }
        i10 = i9;
        j5 = c1282t.f4607c;
        if ((j5 & 1095216660480L) == 0) {
        }
        c1967q = c1282t.f4608d;
        if (c1967q == null) {
        }
        long j122 = j5;
        C1284v c1284v2 = c1282t.f4609e;
        C1959i c1959i2 = c1282t.f4610f;
        i5 = c1282t.f4611g;
        if (i5 == 0) {
        }
        i6 = c1282t.f4612h;
        if (i6 == 0) {
        }
        c1969s = c1282t.f4613i;
        if (c1969s == null) {
        }
        return new C1260M(c1252e2, new C1282t(i8, i10, j122, c1967q, c1284v2, c1959i2, i5, i6, c1969s), c1260m.f4542c);
    }
}
