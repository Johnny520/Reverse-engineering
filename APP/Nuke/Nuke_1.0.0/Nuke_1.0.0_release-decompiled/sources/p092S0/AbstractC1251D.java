package p092S0;

import java.util.ArrayList;
import java.util.List;
import p000A.C0038T0;
import p011B4.AbstractC0231b;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p081Q.C1160c;
import p110W0.InterfaceC1580e;
import p112W2.InterfaceC1601c;
import p120Y0.AbstractC1732a;
import p130a1.C1791d;
import p153e1.InterfaceC2007c;
import p164g1.AbstractC2179a;
import p179i4.AbstractC2352g;

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

    static {
        int i5 = 29;
        f4489a = new C0038T0(i5, new C1287y((byte) 0, 3), new C1286x(6));
        f4490b = new C0038T0(i5, new C1287y((byte) 0, 4), new C1286x(7));
        f4491c = new C0038T0(i5, new C1287y((byte) 0, 5), new C1286x(8));
        f4492d = new C0038T0(i5, new C1287y((byte) 0, 6), new C1286x(9));
        f4493e = new C0038T0(i5, new C1287y((byte) 0, 7), new C1286x(10));
    }

    /* JADX INFO: renamed from: a */
    public static C1263a m2312a(String str, C1260M c1260m, long j5, InterfaceC2007c interfaceC2007c, InterfaceC1580e interfaceC1580e, int i5, int i6) {
        C0981u c0981u = C0981u.f3047d;
        return new C1263a(new C1791d(str, c1260m, c0981u, c0981u, interfaceC1580e, interfaceC2007c), i5, 1, j5);
    }

    /* JADX INFO: renamed from: b */
    public static final long m2313b(int i5, int i6) {
        if (i5 < 0 || i6 < 0) {
            AbstractC1732a.m3085a("start and end cannot be negative. [start: " + i5 + ", end: " + i6 + ']');
        }
        long j5 = (((long) i6) & 4294967295L) | (((long) i5) << 32);
        int i7 = C1259L.f4537c;
        return j5;
    }

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

    /* JADX WARN: Removed duplicated region for block: B:78:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011d  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p092S0.C1260M m2319h(p092S0.C1260M r29, p153e1.EnumC2017m r30) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p092S0.AbstractC1251D.m2319h(S0.M, e1.m):S0.M");
    }
}
