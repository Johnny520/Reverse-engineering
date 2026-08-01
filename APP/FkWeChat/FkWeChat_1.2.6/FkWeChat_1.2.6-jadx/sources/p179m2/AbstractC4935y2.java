package p179m2;

import p215oc.C5729x;
import p250r1.C6457g;
import p250r1.C6459i;
import p265s1.AbstractC7124p2;
import p265s1.AbstractC7147u0;
import p265s1.AbstractC7162x2;
import p265s1.InterfaceC7144t2;

/* JADX INFO: renamed from: m2.y2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4935y2 {
    /* JADX INFO: renamed from: a */
    public static final boolean m19934a(C6459i c6459i) {
        return Float.intBitsToFloat((int) (c6459i.m25605h() >> 32)) + Float.intBitsToFloat((int) (c6459i.m25606i() >> 32)) <= c6459i.m25607j() && Float.intBitsToFloat((int) (c6459i.m25599b() >> 32)) + Float.intBitsToFloat((int) (c6459i.m25600c() >> 32)) <= c6459i.m25607j() && Float.intBitsToFloat((int) (c6459i.m25605h() & 4294967295L)) + Float.intBitsToFloat((int) (c6459i.m25599b() & 4294967295L)) <= c6459i.m25601d() && Float.intBitsToFloat((int) (c6459i.m25606i() & 4294967295L)) + Float.intBitsToFloat((int) (c6459i.m25600c() & 4294967295L)) <= c6459i.m25601d();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m19935b(AbstractC7124p2 abstractC7124p2, float f10, float f11, InterfaceC7144t2 interfaceC7144t2, InterfaceC7144t2 interfaceC7144t22) {
        if (abstractC7124p2 instanceof AbstractC7124p2.b) {
            return m19938e(((AbstractC7124p2.b) abstractC7124p2).m28088b(), f10, f11);
        }
        if (abstractC7124p2 instanceof AbstractC7124p2.c) {
            return m19939f((AbstractC7124p2.c) abstractC7124p2, f10, f11, interfaceC7144t2, interfaceC7144t22);
        }
        if (abstractC7124p2 instanceof AbstractC7124p2.a) {
            return m19937d(((AbstractC7124p2.a) abstractC7124p2).m28087b(), f10, f11, interfaceC7144t2, interfaceC7144t22);
        }
        C5729x.m23182a();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m19936c(AbstractC7124p2 abstractC7124p2, float f10, float f11, InterfaceC7144t2 interfaceC7144t2, InterfaceC7144t2 interfaceC7144t22, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC7144t2 = null;
        }
        if ((i10 & 16) != 0) {
            interfaceC7144t22 = null;
        }
        return m19935b(abstractC7124p2, f10, f11, interfaceC7144t2, interfaceC7144t22);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m19937d(InterfaceC7144t2 interfaceC7144t2, float f10, float f11, InterfaceC7144t2 interfaceC7144t22, InterfaceC7144t2 interfaceC7144t23) {
        C6457g c6457g = new C6457g(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (interfaceC7144t22 == null) {
            interfaceC7144t22 = AbstractC7147u0.m28224a();
        }
        InterfaceC7144t2.m28220t(interfaceC7144t22, c6457g, null, 2, null);
        if (interfaceC7144t23 == null) {
            interfaceC7144t23 = AbstractC7147u0.m28224a();
        }
        interfaceC7144t23.mo28182o(interfaceC7144t2, interfaceC7144t22, AbstractC7162x2.f23689a.m28259b());
        boolean zIsEmpty = interfaceC7144t23.isEmpty();
        interfaceC7144t23.reset();
        interfaceC7144t22.reset();
        return !zIsEmpty;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m19938e(C6457g c6457g, float f10, float f11) {
        return c6457g.m25583l() <= f10 && f10 < c6457g.m25584m() && c6457g.m25586o() <= f11 && f11 < c6457g.m25580i();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m19939f(AbstractC7124p2.c cVar, float f10, float f11, InterfaceC7144t2 interfaceC7144t2, InterfaceC7144t2 interfaceC7144t22) {
        C6459i c6459iM28089b = cVar.m28089b();
        if (f10 < c6459iM28089b.m25602e() || f10 >= c6459iM28089b.m25603f() || f11 < c6459iM28089b.m25604g() || f11 >= c6459iM28089b.m25598a()) {
            return false;
        }
        if (!m19934a(c6459iM28089b)) {
            InterfaceC7144t2 interfaceC7144t2M28224a = interfaceC7144t22 == null ? AbstractC7147u0.m28224a() : interfaceC7144t22;
            InterfaceC7144t2.m28219i(interfaceC7144t2M28224a, c6459iM28089b, null, 2, null);
            return m19937d(interfaceC7144t2M28224a, f10, f11, interfaceC7144t2, interfaceC7144t22);
        }
        float fM25602e = c6459iM28089b.m25602e() + Float.intBitsToFloat((int) (c6459iM28089b.m25605h() >> 32));
        float fM25604g = c6459iM28089b.m25604g() + Float.intBitsToFloat((int) (c6459iM28089b.m25605h() & 4294967295L));
        float fM25603f = c6459iM28089b.m25603f() - Float.intBitsToFloat((int) (c6459iM28089b.m25606i() >> 32));
        float fM25604g2 = c6459iM28089b.m25604g() + Float.intBitsToFloat((int) (c6459iM28089b.m25606i() & 4294967295L));
        float fM25603f2 = c6459iM28089b.m25603f() - Float.intBitsToFloat((int) (c6459iM28089b.m25600c() >> 32));
        float fM25598a = c6459iM28089b.m25598a() - Float.intBitsToFloat((int) (c6459iM28089b.m25600c() & 4294967295L));
        float fM25598a2 = c6459iM28089b.m25598a() - Float.intBitsToFloat((int) (4294967295L & c6459iM28089b.m25599b()));
        float fM25602e2 = c6459iM28089b.m25602e() + Float.intBitsToFloat((int) (c6459iM28089b.m25599b() >> 32));
        if (f10 < fM25602e && f11 < fM25604g) {
            return m19940g(f10, f11, c6459iM28089b.m25605h(), fM25602e, fM25604g);
        }
        if (f10 < fM25602e2 && f11 > fM25598a2) {
            return m19940g(f10, f11, c6459iM28089b.m25599b(), fM25602e2, fM25598a2);
        }
        if (f10 > fM25603f && f11 < fM25604g2) {
            return m19940g(f10, f11, c6459iM28089b.m25606i(), fM25603f, fM25604g2);
        }
        if (f10 <= fM25603f2 || f11 <= fM25598a) {
            return true;
        }
        return m19940g(f10, f11, c6459iM28089b.m25600c(), fM25603f2, fM25598a);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m19940g(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }
}
