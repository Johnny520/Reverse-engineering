package p265s1;

import p215oc.C5729x;
import p250r1.AbstractC6451a;
import p250r1.C6455e;
import p250r1.C6457g;
import p250r1.C6459i;
import p250r1.C6461k;
import p265s1.AbstractC7124p2;
import p290u1.AbstractC8488g;
import p290u1.C8491j;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: s1.q2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7129q2 {
    /* JADX INFO: renamed from: a */
    public static final void m28150a(InterfaceC8487f interfaceC8487f, AbstractC7124p2 abstractC7124p2, AbstractC7078g1 abstractC7078g1, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        if (abstractC7124p2 instanceof AbstractC7124p2.b) {
            C6457g c6457gM28088b = ((AbstractC7124p2.b) abstractC7124p2).m28088b();
            interfaceC8487f.mo18026A1(abstractC7078g1, m28156g(c6457gM28088b), m28154e(c6457gM28088b), f10, abstractC8488g, abstractC7133r1, i10);
            return;
        }
        if (!(abstractC7124p2 instanceof AbstractC7124p2.c)) {
            if (abstractC7124p2 instanceof AbstractC7124p2.a) {
                interfaceC8487f.mo18029E1(((AbstractC7124p2.a) abstractC7124p2).m28087b(), abstractC7078g1, f10, abstractC8488g, abstractC7133r1, i10);
                return;
            } else {
                C5729x.m23182a();
                return;
            }
        }
        AbstractC7124p2.c cVar = (AbstractC7124p2.c) abstractC7124p2;
        InterfaceC7144t2 interfaceC7144t2M28090c = cVar.m28090c();
        if (interfaceC7144t2M28090c != null) {
            interfaceC8487f.mo18029E1(interfaceC7144t2M28090c, abstractC7078g1, f10, abstractC8488g, abstractC7133r1, i10);
            return;
        }
        C6459i c6459iM28089b = cVar.m28089b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c6459iM28089b.m25599b() >> 32));
        interfaceC8487f.mo18032N(abstractC7078g1, m28157h(c6459iM28089b), m28155f(c6459iM28089b), AbstractC6451a.m25527b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), f10, abstractC8488g, abstractC7133r1, i10);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m28151b(InterfaceC8487f interfaceC8487f, AbstractC7124p2 abstractC7124p2, AbstractC7078g1 abstractC7078g1, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            abstractC8488g = C8491j.f28345a;
        }
        AbstractC8488g abstractC8488g2 = abstractC8488g;
        if ((i11 & 16) != 0) {
            abstractC7133r1 = null;
        }
        AbstractC7133r1 abstractC7133r12 = abstractC7133r1;
        if ((i11 & 32) != 0) {
            i10 = InterfaceC8487f.f28340p.m32661a();
        }
        m28150a(interfaceC8487f, abstractC7124p2, abstractC7078g1, f11, abstractC8488g2, abstractC7133r12, i10);
    }

    /* JADX INFO: renamed from: c */
    public static final void m28152c(InterfaceC8487f interfaceC8487f, AbstractC7124p2 abstractC7124p2, long j10, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10) {
        if (abstractC7124p2 instanceof AbstractC7124p2.b) {
            C6457g c6457gM28088b = ((AbstractC7124p2.b) abstractC7124p2).m28088b();
            interfaceC8487f.mo18028D1(j10, m28156g(c6457gM28088b), m28154e(c6457gM28088b), f10, abstractC8488g, abstractC7133r1, i10);
            return;
        }
        if (!(abstractC7124p2 instanceof AbstractC7124p2.c)) {
            if (abstractC7124p2 instanceof AbstractC7124p2.a) {
                interfaceC8487f.mo18039f1(((AbstractC7124p2.a) abstractC7124p2).m28087b(), j10, f10, abstractC8488g, abstractC7133r1, i10);
                return;
            } else {
                C5729x.m23182a();
                return;
            }
        }
        AbstractC7124p2.c cVar = (AbstractC7124p2.c) abstractC7124p2;
        InterfaceC7144t2 interfaceC7144t2M28090c = cVar.m28090c();
        if (interfaceC7144t2M28090c != null) {
            interfaceC8487f.mo18039f1(interfaceC7144t2M28090c, j10, f10, abstractC8488g, abstractC7133r1, i10);
            return;
        }
        C6459i c6459iM28089b = cVar.m28089b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c6459iM28089b.m25599b() >> 32));
        interfaceC8487f.mo18043m1(j10, m28157h(c6459iM28089b), m28155f(c6459iM28089b), AbstractC6451a.m25527b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), abstractC8488g, f10, abstractC7133r1, i10);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m28153d(InterfaceC8487f interfaceC8487f, AbstractC7124p2 abstractC7124p2, long j10, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            abstractC8488g = C8491j.f28345a;
        }
        AbstractC8488g abstractC8488g2 = abstractC8488g;
        if ((i11 & 16) != 0) {
            abstractC7133r1 = null;
        }
        m28152c(interfaceC8487f, abstractC7124p2, j10, f11, abstractC8488g2, abstractC7133r1, (i11 & 32) != 0 ? InterfaceC8487f.f28340p.m32661a() : i10);
    }

    /* JADX INFO: renamed from: e */
    public static final long m28154e(C6457g c6457g) {
        float fM25584m = c6457g.m25584m() - c6457g.m25583l();
        return C6461k.m25616d((((long) Float.floatToRawIntBits(c6457g.m25580i() - c6457g.m25586o())) & 4294967295L) | (Float.floatToRawIntBits(fM25584m) << 32));
    }

    /* JADX INFO: renamed from: f */
    public static final long m28155f(C6459i c6459i) {
        float fM25607j = c6459i.m25607j();
        float fM25601d = c6459i.m25601d();
        return C6461k.m25616d((((long) Float.floatToRawIntBits(fM25607j)) << 32) | (((long) Float.floatToRawIntBits(fM25601d)) & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static final long m28156g(C6457g c6457g) {
        float fM25583l = c6457g.m25583l();
        float fM25586o = c6457g.m25586o();
        return C6455e.m25551e((((long) Float.floatToRawIntBits(fM25583l)) << 32) | (((long) Float.floatToRawIntBits(fM25586o)) & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public static final long m28157h(C6459i c6459i) {
        float fM25602e = c6459i.m25602e();
        float fM25604g = c6459i.m25604g();
        return C6455e.m25551e((((long) Float.floatToRawIntBits(fM25602e)) << 32) | (((long) Float.floatToRawIntBits(fM25604g)) & 4294967295L));
    }
}
