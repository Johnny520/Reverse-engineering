package p189n;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import p010a9.InterfaceC0184l;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p221p1.C5922e;
import p221p1.C5928k;
import p250r1.AbstractC6451a;
import p250r1.C6455e;
import p250r1.C6459i;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7147u0;
import p265s1.AbstractC7162x2;
import p265s1.C7100k3;
import p265s1.InterfaceC7090i3;
import p265s1.InterfaceC7144t2;
import p290u1.AbstractC8488g;
import p290u1.C8491j;
import p290u1.C8492k;
import p290u1.InterfaceC8484c;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: n.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5257o {
    /* JADX INFO: renamed from: a */
    public static C4700i0 m21492a(AbstractC7078g1 abstractC7078g1, long j10, long j11, AbstractC8488g abstractC8488g, InterfaceC8484c interfaceC8484c) {
        interfaceC8484c.mo18034W1();
        InterfaceC8487f.m32649T1(interfaceC8484c, abstractC7078g1, j10, j11, 0.0f, abstractC8488g, null, 0, Opcodes.IMUL, null);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m21493b(InterfaceC8484c interfaceC8484c) {
        interfaceC8484c.mo18034W1();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC4507m m21498g(InterfaceC4507m interfaceC4507m, C5294w c5294w, InterfaceC7090i3 interfaceC7090i3) {
        return m21500i(interfaceC4507m, c5294w.m21604b(), c5294w.m21603a(), interfaceC7090i3);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC4507m m21499h(InterfaceC4507m interfaceC4507m, float f10, long j10, InterfaceC7090i3 interfaceC7090i3) {
        return m21500i(interfaceC4507m, f10, new C7100k3(j10, null), interfaceC7090i3);
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC4507m m21500i(InterfaceC4507m interfaceC4507m, float f10, AbstractC7078g1 abstractC7078g1, InterfaceC7090i3 interfaceC7090i3) {
        return interfaceC4507m.mo17445i(new C5290v(f10, abstractC7078g1, interfaceC7090i3, null));
    }

    /* JADX INFO: renamed from: j */
    public static final C6459i m21501j(float f10, C6459i c6459i) {
        return new C6459i(f10, f10, c6459i.m25607j() - f10, c6459i.m25601d() - f10, m21505n(c6459i.m25605h(), f10), m21505n(c6459i.m25606i(), f10), m21505n(c6459i.m25600c(), f10), m21505n(c6459i.m25599b(), f10), null);
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC7144t2 m21502k(InterfaceC7144t2 interfaceC7144t2, C6459i c6459i, float f10, boolean z10) {
        interfaceC7144t2.reset();
        InterfaceC7144t2.m28219i(interfaceC7144t2, c6459i, null, 2, null);
        if (!z10) {
            InterfaceC7144t2 interfaceC7144t2M28224a = AbstractC7147u0.m28224a();
            InterfaceC7144t2.m28219i(interfaceC7144t2M28224a, m21501j(f10, c6459i), null, 2, null);
            interfaceC7144t2.mo28182o(interfaceC7144t2, interfaceC7144t2M28224a, AbstractC7162x2.f23689a.m28258a());
        }
        return interfaceC7144t2;
    }

    /* JADX INFO: renamed from: l */
    public static final C5928k m21503l(C5922e c5922e) {
        return c5922e.m23830l(new InterfaceC0184l() { // from class: n.n
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC5257o.m21493b((InterfaceC8484c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static final C5928k m21504m(C5922e c5922e, final AbstractC7078g1 abstractC7078g1, long j10, long j11, boolean z10, float f10) {
        final long jM25569c = z10 ? C6455e.f20314b.m25569c() : j10;
        final long jM23827b = z10 ? c5922e.m23827b() : j11;
        final AbstractC8488g c8492k = z10 ? C8491j.f28345a : new C8492k(f10, 0.0f, 0, 0, null, 30, null);
        return c5922e.m23830l(new InterfaceC0184l() { // from class: n.m
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC5257o.m21492a(abstractC7078g1, jM25569c, jM23827b, c8492k, (InterfaceC8484c) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static final long m21505n(long j10, float f10) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j10 >> 32)) - f10);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j10 & 4294967295L)) - f10);
        return AbstractC6451a.m25527b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L));
    }
}
