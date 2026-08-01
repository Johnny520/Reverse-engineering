package p190n0;

import java.util.Comparator;
import p190n0.C5419r0;
import p250r1.C6457g;
import p319w2.C9122q3;

/* JADX INFO: renamed from: n0.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5436u {
    /* JADX INFO: renamed from: a */
    public static final void m22168a(C5432t1 c5432t1, C9122q3 c9122q3, long j10, long j11, long j12) {
        EnumC5394n enumC5394n;
        EnumC5394n enumC5394n2;
        long j13;
        EnumC5394n enumC5394nM22169b;
        EnumC5394n enumC5394n3;
        EnumC5394n enumC5394nM22169b2;
        EnumC5394n enumC5394n4;
        EnumC5394n enumC5394n5;
        int iM22171d;
        int iM22172e;
        C5419r0.a aVarM22115e;
        C5419r0.a aVarM22113c;
        C6457g c6457g = new C6457g(0.0f, 0.0f, (int) (c9122q3.m35381B() >> 32), (int) (c9122q3.m35381B() & 4294967295L));
        EnumC5394n enumC5394nM22173f = m22173f(j10, c6457g);
        EnumC5394n enumC5394nM22174g = m22174g(j10, c6457g);
        if (c5432t1.m22165h()) {
            C5419r0 c5419r0M22163f = c5432t1.m22163f();
            enumC5394n = enumC5394nM22174g;
            enumC5394n2 = enumC5394nM22173f;
            j13 = j12;
            enumC5394n4 = enumC5394n2;
            enumC5394nM22169b2 = m22169b(enumC5394n2, enumC5394n, c5432t1, j12, c5419r0M22163f != null ? c5419r0M22163f.m22113c() : null);
            enumC5394n3 = enumC5394nM22169b2;
            enumC5394n5 = enumC5394n3;
            enumC5394nM22169b = enumC5394n;
        } else {
            enumC5394n = enumC5394nM22174g;
            enumC5394n2 = enumC5394nM22173f;
            C5419r0 c5419r0M22163f2 = c5432t1.m22163f();
            j13 = j12;
            enumC5394nM22169b = m22169b(enumC5394n2, enumC5394n, c5432t1, j13, c5419r0M22163f2 != null ? c5419r0M22163f2.m22115e() : null);
            enumC5394n3 = enumC5394n2;
            enumC5394nM22169b2 = enumC5394n;
            enumC5394n4 = enumC5394nM22169b;
            enumC5394n5 = enumC5394n4;
        }
        if (m22175h(AbstractC5444v1.m22180d(enumC5394n2, enumC5394n), enumC5394n5)) {
            int length = c9122q3.m35393l().m35370j().length();
            if (c5432t1.m22165h()) {
                iM22172e = m22171d(j10, c9122q3);
                C5419r0 c5419r0M22163f3 = c5432t1.m22163f();
                iM22171d = (c5419r0M22163f3 == null || (aVarM22113c = c5419r0M22163f3.m22113c()) == null) ? iM22172e : m22172e(aVarM22113c, c5432t1.m22164g(), j13, length);
            } else {
                iM22171d = m22171d(j10, c9122q3);
                C5419r0 c5419r0M22163f4 = c5432t1.m22163f();
                iM22172e = (c5419r0M22163f4 == null || (aVarM22115e = c5419r0M22163f4.m22115e()) == null) ? iM22171d : m22172e(aVarM22115e, c5432t1.m22164g(), j13, length);
            }
            c5432t1.m22158a(j13, iM22172e, enumC5394n4, enumC5394nM22169b, iM22171d, enumC5394n3, enumC5394nM22169b2, (9223372034707292159L & j11) == 9205357640488583168L ? -1 : m22171d(j11, c9122q3), c9122q3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC5394n m22169b(EnumC5394n enumC5394n, EnumC5394n enumC5394n2, C5432t1 c5432t1, long j10, C5419r0.a aVar) {
        EnumC5394n enumC5394nM22170c;
        return (aVar == null || (enumC5394nM22170c = m22170c(c5432t1, aVar.m22121e(), j10)) == null) ? AbstractC5444v1.m22180d(enumC5394n, enumC5394n2) : enumC5394nM22170c;
    }

    /* JADX INFO: renamed from: c */
    public static final EnumC5394n m22170c(C5432t1 c5432t1, long j10, long j11) {
        int iCompare = c5432t1.m22164g().compare(Long.valueOf(j10), Long.valueOf(j11));
        return iCompare < 0 ? EnumC5394n.f16595q : iCompare > 0 ? EnumC5394n.f16597s : EnumC5394n.f16596r;
    }

    /* JADX INFO: renamed from: d */
    public static final int m22171d(long j10, C9122q3 c9122q3) {
        int i10 = (int) (4294967295L & j10);
        if (Float.intBitsToFloat(i10) <= 0.0f) {
            return 0;
        }
        return Float.intBitsToFloat(i10) >= c9122q3.m35403w().m35340j() ? c9122q3.m35393l().m35370j().length() : c9122q3.m35404x(j10);
    }

    /* JADX INFO: renamed from: e */
    public static final int m22172e(C5419r0.a aVar, Comparator comparator, long j10, int i10) {
        int iCompare = comparator.compare(Long.valueOf(aVar.m22121e()), Long.valueOf(j10));
        if (iCompare < 0) {
            return 0;
        }
        return iCompare > 0 ? i10 : aVar.m22120d();
    }

    /* JADX INFO: renamed from: f */
    public static final EnumC5394n m22173f(long j10, C6457g c6457g) {
        int i10 = (int) (j10 >> 32);
        return Float.intBitsToFloat(i10) < c6457g.m25583l() ? EnumC5394n.f16595q : Float.intBitsToFloat(i10) > c6457g.m25584m() ? EnumC5394n.f16597s : EnumC5394n.f16596r;
    }

    /* JADX INFO: renamed from: g */
    public static final EnumC5394n m22174g(long j10, C6457g c6457g) {
        int i10 = (int) (j10 & 4294967295L);
        return Float.intBitsToFloat(i10) < c6457g.m25586o() ? EnumC5394n.f16595q : Float.intBitsToFloat(i10) > c6457g.m25580i() ? EnumC5394n.f16597s : EnumC5394n.f16596r;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m22175h(EnumC5394n enumC5394n, EnumC5394n enumC5394n2) {
        return enumC5394n == EnumC5394n.f16596r || enumC5394n != enumC5394n2;
    }
}
