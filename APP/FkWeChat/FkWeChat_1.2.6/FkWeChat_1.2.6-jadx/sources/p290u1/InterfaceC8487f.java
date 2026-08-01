package p290u1;

import p121i3.C3185o;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p215oc.C5725t;
import p250r1.AbstractC6451a;
import p250r1.AbstractC6462l;
import p250r1.C6455e;
import p250r1.C6461k;
import p265s1.AbstractC7054b2;
import p265s1.AbstractC7078g1;
import p265s1.AbstractC7133r1;
import p265s1.AbstractC7168z0;
import p265s1.InterfaceC7089i2;
import p265s1.InterfaceC7144t2;
import p265s1.InterfaceC7149u2;

/* JADX INFO: renamed from: u1.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8487f extends InterfaceC3175e {

    /* JADX INFO: renamed from: p */
    public static final a f28340p = a.f28341a;

    /* JADX INFO: renamed from: u1.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f28341a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f28342b = AbstractC7168z0.f23700a.m28306B();

        /* JADX INFO: renamed from: c */
        public static final int f28343c = AbstractC7054b2.f23487a.m27768a();

        /* JADX INFO: renamed from: a */
        public final int m32661a() {
            return f28342b;
        }

        /* JADX INFO: renamed from: b */
        public final int m32662b() {
            return f28343c;
        }
    }

    /* JADX INFO: renamed from: F0 */
    static /* synthetic */ void m32647F0(InterfaceC8487f interfaceC8487f, InterfaceC7089i2 interfaceC7089i2, long j10, long j11, long j12, long j13, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
            return;
        }
        long jM12058b = (i12 & 2) != 0 ? C3185o.f8471b.m12058b() : j10;
        long jM12082c = (i12 & 4) != 0 ? C3189s.m12082c((((long) interfaceC7089i2.mo27905a()) & 4294967295L) | (((long) interfaceC7089i2.mo27908e()) << 32)) : j11;
        interfaceC8487f.mo18035Y(interfaceC7089i2, jM12058b, jM12082c, (i12 & 8) != 0 ? C3185o.f8471b.m12058b() : j12, (i12 & 16) != 0 ? jM12082c : j13, (i12 & 32) != 0 ? 1.0f : f10, (i12 & 64) != 0 ? C8491j.f28345a : abstractC8488g, (i12 & 128) != 0 ? null : abstractC7133r1, (i12 & 256) != 0 ? f28340p.m32661a() : i10, (i12 & 512) != 0 ? f28340p.m32662b() : i11);
    }

    /* JADX INFO: renamed from: N0 */
    static /* synthetic */ void m32648N0(InterfaceC8487f interfaceC8487f, AbstractC7078g1 abstractC7078g1, long j10, long j11, float f10, int i10, InterfaceC7149u2 interfaceC7149u2, float f11, AbstractC7133r1 abstractC7133r1, int i11, int i12, Object obj) {
        if (obj == null) {
            interfaceC8487f.mo18031K1(abstractC7078g1, j10, j11, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? C8492k.f28346e.m32671a() : i10, (i12 & 32) != 0 ? null : interfaceC7149u2, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : abstractC7133r1, (i12 & 256) != 0 ? f28340p.m32661a() : i11);
        } else {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
    }

    /* JADX INFO: renamed from: T1 */
    static /* synthetic */ void m32649T1(InterfaceC8487f interfaceC8487f, AbstractC7078g1 abstractC7078g1, long j10, long j11, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        } else {
            long jM25569c = (i11 & 2) != 0 ? C6455e.f20314b.m25569c() : j10;
            interfaceC8487f.mo18026A1(abstractC7078g1, jM25569c, (i11 & 4) != 0 ? interfaceC8487f.m32660U0(interfaceC8487f.mo18037b(), jM25569c) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? C8491j.f28345a : abstractC8488g, (i11 & 32) != 0 ? null : abstractC7133r1, (i11 & 64) != 0 ? f28340p.m32661a() : i10);
        }
    }

    /* JADX INFO: renamed from: U */
    static /* synthetic */ void m32650U(InterfaceC8487f interfaceC8487f, InterfaceC7089i2 interfaceC7089i2, long j10, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        if (obj == null) {
            interfaceC8487f.mo18045p0(interfaceC7089i2, (i11 & 2) != 0 ? C6455e.f20314b.m25569c() : j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? C8491j.f28345a : abstractC8488g, (i11 & 16) != 0 ? null : abstractC7133r1, (i11 & 32) != 0 ? f28340p.m32661a() : i10);
        } else {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
    }

    /* JADX INFO: renamed from: X0 */
    static /* synthetic */ void m32651X0(InterfaceC8487f interfaceC8487f, long j10, float f10, long j11, float f11, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
            return;
        }
        if ((i11 & 2) != 0) {
            f10 = C6461k.m25620h(interfaceC8487f.mo18037b()) / 2.0f;
        }
        interfaceC8487f.mo18036Z1(j10, f10, (i11 & 4) != 0 ? interfaceC8487f.mo18030G1() : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? C8491j.f28345a : abstractC8488g, (i11 & 32) != 0 ? null : abstractC7133r1, (i11 & 64) != 0 ? f28340p.m32661a() : i10);
    }

    /* JADX INFO: renamed from: a2 */
    static /* synthetic */ void m32652a2(InterfaceC8487f interfaceC8487f, long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        InterfaceC8487f interfaceC8487f2;
        long jM32660U0;
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
            return;
        }
        long jM25569c = (i11 & 16) != 0 ? C6455e.f20314b.m25569c() : j11;
        if ((i11 & 32) != 0) {
            interfaceC8487f2 = interfaceC8487f;
            jM32660U0 = interfaceC8487f2.m32660U0(interfaceC8487f.mo18037b(), jM25569c);
        } else {
            interfaceC8487f2 = interfaceC8487f;
            jM32660U0 = j12;
        }
        interfaceC8487f2.mo18033S1(j10, f10, f11, z10, jM25569c, jM32660U0, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? C8491j.f28345a : abstractC8488g, (i11 & 256) != 0 ? null : abstractC7133r1, (i11 & 512) != 0 ? f28340p.m32661a() : i10);
    }

    /* JADX INFO: renamed from: e1 */
    static /* synthetic */ void m32653e1(InterfaceC8487f interfaceC8487f, long j10, long j11, long j12, float f10, int i10, InterfaceC7149u2 interfaceC7149u2, float f11, AbstractC7133r1 abstractC7133r1, int i11, int i12, Object obj) {
        if (obj == null) {
            interfaceC8487f.mo18027C1(j10, j11, j12, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? C8492k.f28346e.m32671a() : i10, (i12 & 32) != 0 ? null : interfaceC7149u2, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : abstractC7133r1, (i12 & 256) != 0 ? f28340p.m32661a() : i11);
        } else {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
    }

    /* JADX INFO: renamed from: k0 */
    static /* synthetic */ void m32654k0(InterfaceC8487f interfaceC8487f, long j10, long j11, long j12, long j13, AbstractC8488g abstractC8488g, float f10, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        InterfaceC8487f interfaceC8487f2;
        long jM32660U0;
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
            return;
        }
        long jM25569c = (i11 & 2) != 0 ? C6455e.f20314b.m25569c() : j11;
        if ((i11 & 4) != 0) {
            interfaceC8487f2 = interfaceC8487f;
            jM32660U0 = interfaceC8487f2.m32660U0(interfaceC8487f.mo18037b(), jM25569c);
        } else {
            interfaceC8487f2 = interfaceC8487f;
            jM32660U0 = j12;
        }
        interfaceC8487f2.mo18043m1(j10, jM25569c, jM32660U0, (i11 & 8) != 0 ? AbstractC6451a.f20308a.m25531a() : j13, (i11 & 16) != 0 ? C8491j.f28345a : abstractC8488g, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? null : abstractC7133r1, (i11 & 128) != 0 ? f28340p.m32661a() : i10);
    }

    /* JADX INFO: renamed from: o0 */
    static /* synthetic */ void m32655o0(InterfaceC8487f interfaceC8487f, AbstractC7078g1 abstractC7078g1, float f10, long j10, float f11, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        if (obj == null) {
            interfaceC8487f.mo18042l0(abstractC7078g1, (i11 & 2) != 0 ? C6461k.m25620h(interfaceC8487f.mo18037b()) / 2.0f : f10, (i11 & 4) != 0 ? interfaceC8487f.mo18030G1() : j10, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? C8491j.f28345a : abstractC8488g, (i11 & 32) != 0 ? null : abstractC7133r1, (i11 & 64) != 0 ? f28340p.m32661a() : i10);
        } else {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
    }

    /* JADX INFO: renamed from: t0 */
    static /* synthetic */ void m32656t0(InterfaceC8487f interfaceC8487f, AbstractC7078g1 abstractC7078g1, long j10, long j11, long j12, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        } else {
            long jM25569c = (i11 & 2) != 0 ? C6455e.f20314b.m25569c() : j10;
            interfaceC8487f.mo18032N(abstractC7078g1, jM25569c, (i11 & 4) != 0 ? interfaceC8487f.m32660U0(interfaceC8487f.mo18037b(), jM25569c) : j11, (i11 & 8) != 0 ? AbstractC6451a.f20308a.m25531a() : j12, (i11 & 16) != 0 ? 1.0f : f10, (i11 & 32) != 0 ? C8491j.f28345a : abstractC8488g, (i11 & 64) != 0 ? null : abstractC7133r1, (i11 & 128) != 0 ? f28340p.m32661a() : i10);
        }
    }

    /* JADX INFO: renamed from: v0 */
    static /* synthetic */ void m32657v0(InterfaceC8487f interfaceC8487f, InterfaceC7144t2 interfaceC7144t2, long j10, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
            return;
        }
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
        interfaceC8487f.mo18039f1(interfaceC7144t2, j10, f11, abstractC8488g2, abstractC7133r1, (i11 & 32) != 0 ? f28340p.m32661a() : i10);
    }

    /* JADX INFO: renamed from: w1 */
    static /* synthetic */ void m32658w1(InterfaceC8487f interfaceC8487f, long j10, long j11, long j12, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        } else {
            long jM25569c = (i11 & 2) != 0 ? C6455e.f20314b.m25569c() : j11;
            interfaceC8487f.mo18028D1(j10, jM25569c, (i11 & 4) != 0 ? interfaceC8487f.m32660U0(interfaceC8487f.mo18037b(), jM25569c) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? C8491j.f28345a : abstractC8488g, (i11 & 32) != 0 ? null : abstractC7133r1, (i11 & 64) != 0 ? f28340p.m32661a() : i10);
        }
    }

    /* JADX INFO: renamed from: y0 */
    static /* synthetic */ void m32659y0(InterfaceC8487f interfaceC8487f, InterfaceC7144t2 interfaceC7144t2, AbstractC7078g1 abstractC7078g1, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
            return;
        }
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
            i10 = f28340p.m32661a();
        }
        interfaceC8487f.mo18029E1(interfaceC7144t2, abstractC7078g1, f11, abstractC8488g2, abstractC7133r12, i10);
    }

    /* JADX INFO: renamed from: A1 */
    void mo18026A1(AbstractC7078g1 abstractC7078g1, long j10, long j11, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10);

    /* JADX INFO: renamed from: C1 */
    void mo18027C1(long j10, long j11, long j12, float f10, int i10, InterfaceC7149u2 interfaceC7149u2, float f11, AbstractC7133r1 abstractC7133r1, int i11);

    /* JADX INFO: renamed from: D1 */
    void mo18028D1(long j10, long j11, long j12, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10);

    /* JADX INFO: renamed from: E1 */
    void mo18029E1(InterfaceC7144t2 interfaceC7144t2, AbstractC7078g1 abstractC7078g1, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10);

    /* JADX INFO: renamed from: G1 */
    default long mo18030G1() {
        return AbstractC6462l.m25628a(mo18044n1().mo32628b());
    }

    /* JADX INFO: renamed from: K1 */
    void mo18031K1(AbstractC7078g1 abstractC7078g1, long j10, long j11, float f10, int i10, InterfaceC7149u2 interfaceC7149u2, float f11, AbstractC7133r1 abstractC7133r1, int i11);

    /* JADX INFO: renamed from: N */
    void mo18032N(AbstractC7078g1 abstractC7078g1, long j10, long j11, long j12, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10);

    /* JADX INFO: renamed from: S1 */
    void mo18033S1(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10);

    /* JADX INFO: renamed from: U0 */
    default long m32660U0(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return C6461k.m25616d((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: Y */
    void mo18035Y(InterfaceC7089i2 interfaceC7089i2, long j10, long j11, long j12, long j13, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10, int i11);

    /* JADX INFO: renamed from: Z1 */
    void mo18036Z1(long j10, float f10, long j11, float f11, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10);

    /* JADX INFO: renamed from: b */
    default long mo18037b() {
        return mo18044n1().mo32628b();
    }

    /* JADX INFO: renamed from: f1 */
    void mo18039f1(InterfaceC7144t2 interfaceC7144t2, long j10, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10);

    EnumC3191u getLayoutDirection();

    /* JADX INFO: renamed from: l0 */
    void mo18042l0(AbstractC7078g1 abstractC7078g1, float f10, long j10, float f11, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10);

    /* JADX INFO: renamed from: m1 */
    void mo18043m1(long j10, long j11, long j12, long j13, AbstractC8488g abstractC8488g, float f10, AbstractC7133r1 abstractC7133r1, int i10);

    /* JADX INFO: renamed from: n1 */
    InterfaceC8485d mo18044n1();

    /* JADX INFO: renamed from: p0 */
    void mo18045p0(InterfaceC7089i2 interfaceC7089i2, long j10, float f10, AbstractC8488g abstractC8488g, AbstractC7133r1 abstractC7133r1, int i10);
}
