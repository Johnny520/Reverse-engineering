package p080f9;

import okhttp3.C5752g;
import p080f9.C2361h;

/* JADX INFO: renamed from: f9.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2368o extends AbstractC2367n {
    /* JADX INFO: renamed from: c */
    public static double m8576c(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    /* JADX INFO: renamed from: d */
    public static float m8577d(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    /* JADX INFO: renamed from: e */
    public static int m8578e(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    /* JADX INFO: renamed from: f */
    public static long m8579f(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    /* JADX INFO: renamed from: g */
    public static Comparable m8580g(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    /* JADX INFO: renamed from: h */
    public static float m8581h(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    /* JADX INFO: renamed from: i */
    public static int m8582i(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    /* JADX INFO: renamed from: j */
    public static long m8583j(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    /* JADX INFO: renamed from: k */
    public static double m8584k(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    /* JADX INFO: renamed from: l */
    public static float m8585l(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    /* JADX INFO: renamed from: m */
    public static int m8586m(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    /* JADX INFO: renamed from: n */
    public static long m8587n(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    /* JADX INFO: renamed from: o */
    public static Comparable m8588o(Comparable comparable, InterfaceC2359f interfaceC2359f) {
        comparable.getClass();
        interfaceC2359f.getClass();
        if (!interfaceC2359f.isEmpty()) {
            return (!interfaceC2359f.mo8552a(comparable, interfaceC2359f.mo8554c()) || interfaceC2359f.mo8552a(interfaceC2359f.mo8554c(), comparable)) ? (!interfaceC2359f.mo8552a(interfaceC2359f.mo8559l(), comparable) || interfaceC2359f.mo8552a(comparable, interfaceC2359f.mo8559l())) ? comparable : interfaceC2359f.mo8559l() : interfaceC2359f.mo8554c();
        }
        C5752g.m23253a("Cannot coerce value to an empty range: ", interfaceC2359f, 46);
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static C2361h m8589p(int i10, int i11) {
        return C2361h.f6487t.m8564a(i10, i11, -1);
    }

    /* JADX INFO: renamed from: q */
    public static C2361h m8590q(C2361h c2361h) {
        c2361h.getClass();
        return C2361h.f6487t.m8564a(c2361h.m8561p(), c2361h.m8560o(), -c2361h.m8562q());
    }

    /* JADX INFO: renamed from: r */
    public static C2361h m8591r(C2361h c2361h, int i10) {
        c2361h.getClass();
        AbstractC2367n.m8574a(i10 > 0, Integer.valueOf(i10));
        C2361h.a aVar = C2361h.f6487t;
        int iM8560o = c2361h.m8560o();
        int iM8561p = c2361h.m8561p();
        if (c2361h.m8562q() <= 0) {
            i10 = -i10;
        }
        return aVar.m8564a(iM8560o, iM8561p, i10);
    }

    /* JADX INFO: renamed from: s */
    public static C2363j m8592s(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? C2363j.f6495u.m8569a() : new C2363j(i10, i11 - 1);
    }
}
