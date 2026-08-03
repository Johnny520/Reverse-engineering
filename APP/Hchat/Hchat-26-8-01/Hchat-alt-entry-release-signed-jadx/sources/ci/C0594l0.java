package ci;

import mg.InterfaceC2842d;
import p027c0.C0362g;
import p072f2.AbstractC1058u;
import p072f2.AbstractC1060w;
import p072f2.InterfaceC1062y;
import p085fg.InterfaceC1235p;
import p144k.InterfaceC2226y0;
import p187n.C2857k;
import p187n.C2858l;
import p187n.C2859m;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p267s1.AbstractC3898h0;
import p267s1.C3903k;
import p267s1.C3906l0;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p339x1.AbstractC5615j;
import p339x1.InterfaceC5600e2;
import p339x1.InterfaceC5612i;
import p339x1.InterfaceC5656w1;
import p339x1.InterfaceC5665z1;

/* JADX INFO: renamed from: ci.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0594l0 extends AbstractC5615j implements InterfaceC5656w1, InterfaceC5665z1, InterfaceC5600e2 {

    /* JADX INFO: renamed from: F */
    public static final C0571a f1853F = new C0571a();

    /* JADX INFO: renamed from: A */
    public InterfaceC5612i f1854A;

    /* JADX INFO: renamed from: B */
    public C2859m f1855B;

    /* JADX INFO: renamed from: C */
    public C2857k f1856C;

    /* JADX INFO: renamed from: D */
    public boolean f1857D;

    /* JADX INFO: renamed from: E */
    public final C0571a f1858E;

    /* JADX INFO: renamed from: w */
    public C2857k f1859w;

    /* JADX INFO: renamed from: x */
    public InterfaceC2226y0 f1860x;

    /* JADX INFO: renamed from: y */
    public boolean f1861y;

    /* JADX INFO: renamed from: z */
    public C3906l0 f1862z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0594l0(C2857k c2857k, InterfaceC2226y0 interfaceC2226y0, boolean z9) {
        this.f1859w = c2857k;
        this.f1860x = interfaceC2226y0;
        this.f1861y = z9;
        this.f1856C = c2857k;
        this.f1857D = c2857k == null && interfaceC2226y0 != null;
        this.f1858E = f1853F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public static final void m1607n1(C0594l0 c0594l0, InterfaceC3599t interfaceC3599t, InterfaceC3596r0 interfaceC3596r0, InterfaceC1235p interfaceC1235p) {
        AbstractC3603v.m7563q(interfaceC3599t, null, new C0585h(interfaceC3596r0, interfaceC1235p, null, 0), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5600e2
    /* JADX INFO: renamed from: F */
    public final Object mo742F() {
        return this.f1858E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: P */
    public final void mo1608P(C3903k c3903k, EnumC3905l enumC3905l, long j3) {
        c3903k.getClass();
        long j4 = ((j3 >> 33) << 32) | (((j3 << 32) >> 33) & 4294967295L);
        Float.floatToRawIntBits((int) (j4 >> 32));
        Float.floatToRawIntBits((int) (j4 & 4294967295L));
        m1613p1();
        if (this.f1862z == null) {
            C0362g c0362g = new C0362g(this, 1);
            C3903k c3903k2 = AbstractC3898h0.f12782a;
            C3906l0 c3906l0 = new C3906l0(null, null, null, c0362g);
            m10122k1(c3906l0);
            this.f1862z = c3906l0;
        }
        C3906l0 c3906l02 = this.f1862z;
        if (c3906l02 != null) {
            c3906l02.mo1608P(c3903k, enumC3905l, j3);
        }
        InterfaceC5612i interfaceC5612i = this.f1854A;
        if (interfaceC5612i instanceof InterfaceC5656w1) {
            ((InterfaceC5656w1) interfaceC5612i).mo1608P(c3903k, enumC3905l, j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: S0 */
    public final boolean mo1609S0() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
        interfaceC1062y.getClass();
        if (this.f1861y) {
            return;
        }
        InterfaceC2842d[] interfaceC2842dArr = AbstractC1060w.f3404a;
        interfaceC1062y.mo2644a(AbstractC1058u.f3385j, C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: b0 */
    public final void mo1611b0() {
        C3906l0 c3906l0 = this.f1862z;
        if (c3906l0 != null) {
            c3906l0.mo1611b0();
        }
        InterfaceC5612i interfaceC5612i = this.f1854A;
        if (interfaceC5612i instanceof InterfaceC5656w1) {
            InterfaceC5656w1 interfaceC5656w1 = interfaceC5612i instanceof InterfaceC5656w1 ? (InterfaceC5656w1) interfaceC5612i : null;
            if (interfaceC5656w1 != null) {
                interfaceC5656w1.mo1611b0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        if (this.f1857D) {
            return;
        }
        m1613p1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        m1612o1();
        if (this.f1856C == null) {
            this.f1859w = null;
        }
        InterfaceC5612i interfaceC5612i = this.f1854A;
        if (interfaceC5612i != null) {
            m10123l1(interfaceC5612i);
        }
        this.f1854A = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final void m1612o1() {
        C2859m c2859m;
        C2857k c2857k = this.f1859w;
        if (c2857k != null && (c2859m = this.f1855B) != null) {
            c2857k.m6282b(new C2858l(c2859m));
        }
        this.f1855B = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p1 */
    public final void m1613p1() {
        InterfaceC2226y0 interfaceC2226y0;
        if (this.f1854A == null && (interfaceC2226y0 = this.f1860x) != null) {
            if (this.f1859w == null) {
                this.f1859w = new C2857k();
            }
            C2857k c2857k = this.f1859w;
            c2857k.getClass();
            InterfaceC5612i interfaceC5612iMo1606a = interfaceC2226y0.mo1606a(c2857k);
            m10122k1(interfaceC5612iMo1606a);
            this.f1854A = interfaceC5612iMo1606a;
        }
    }
}
