package p339x1;

import bsh.org.objectweb.asm.Opcodes;
import p012ah.C0086a;
import p069f.C0925b0;
import p071f1.AbstractC0996c0;
import p071f1.C1005h;
import p071f1.C1034w;
import p071f1.InterfaceC1031u;
import p085fg.InterfaceC1231l;
import p118i1.C1902b;
import p293u2.C4240j;
import p293u2.C4242l;
import p308v1.AbstractC4377b1;
import p308v1.C4399j;
import p356y0.AbstractC5852n;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x1.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5657x extends AbstractC5614i1 {

    /* JADX INFO: renamed from: a0 */
    public static final C1005h f23047a0;

    /* JADX INFO: renamed from: Y */
    public InterfaceC5651v f23048Y;

    /* JADX INFO: renamed from: Z */
    public C5654w f23049Z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1005h c1005hM2510f = AbstractC0996c0.m2510f();
        int i9 = C1034w.f3264h;
        c1005hM2510f.m2588w(C1034w.f3261e);
        c1005hM2510f.m2564C(1.0f);
        c1005hM2510f.m2565D(1);
        f23047a0 = c1005hM2510f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: x1.v */
    /* JADX WARN: Multi-variable type inference failed */
    public C5657x(C5602f0 c5602f0, InterfaceC5651v interfaceC5651v) {
        super(c5602f0);
        this.f23048Y = interfaceC5651v;
        this.f23049Z = c5602f0.f22797n != null ? new C5654w(this) : null;
        if ((((AbstractC5852n) interfaceC5651v).f23788g.f23790i & Opcodes.ACC_INTERFACE) == 0) {
            return;
        }
        C0086a.m445d();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: A0 */
    public final void mo8820A0(long j3, float f3, InterfaceC1231l interfaceC1231l) {
        m10076H1(j3, f3, interfaceC1231l, null);
        m10223T1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5614i1, p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: B0 */
    public final void mo8821B0(long j3, float f3, C1902b c1902b) {
        m10076H1(j3, f3, null, c1902b);
        m10223T1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: G */
    public final int mo8829G(int i9) {
        InterfaceC5651v interfaceC5651v = this.f23048Y;
        AbstractC5614i1 abstractC5614i1 = this.f22869v;
        abstractC5614i1.getClass();
        return interfaceC5651v.mo1345G(this, abstractC5614i1, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5614i1
    /* JADX INFO: renamed from: G1 */
    public final void mo10075G1(InterfaceC1031u interfaceC1031u, C1902b c1902b) {
        AbstractC5614i1 abstractC5614i1;
        AbstractC5614i1 abstractC5614i12 = this.f22869v;
        abstractC5614i12.getClass();
        abstractC5614i12.m10099k1(interfaceC1031u, c1902b);
        if (!((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(this.f22868u)).getShowLayoutBounds() || (abstractC5614i1 = this.f22869v) == null) {
            return;
        }
        if (C4242l.m8534a(this.f14595i, abstractC5614i1.f14595i) && C4240j.m8528b(abstractC5614i1.f22854F, 0L)) {
            return;
        }
        long j3 = this.f14595i;
        interfaceC1031u.mo2501t(0.5f, 0.5f, ((int) (j3 >> 32)) - 0.5f, ((int) (j3 & 4294967295L)) - 0.5f, f23047a0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: K0 */
    public final int mo10174K0(C4399j c4399j) {
        C5654w c5654w = this.f23049Z;
        if (c5654w == null) {
            return AbstractC5618k.m10147c(this, c4399j);
        }
        C0925b0 c0925b0 = c5654w.f22937z;
        int iM2270d = c0925b0.m2270d(c4399j);
        if (iM2270d >= 0) {
            return c0925b0.f2896c[iM2270d];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: M */
    public final int mo8830M(int i9) {
        InterfaceC5651v interfaceC5651v = this.f23048Y;
        AbstractC5614i1 abstractC5614i1 = this.f22869v;
        abstractC5614i1.getClass();
        return interfaceC5651v.mo1347Q(this, abstractC5614i1, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: Q */
    public final AbstractC4377b1 mo8831Q(long j3) {
        m8823E0(j3);
        InterfaceC5651v interfaceC5651v = this.f23048Y;
        AbstractC5614i1 abstractC5614i1 = this.f22869v;
        abstractC5614i1.getClass();
        m10079K1(interfaceC5651v.mo1350j(this, abstractC5614i1, j3));
        m10070B1();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T1 */
    public final void m10223T1() {
        if (this.f22923p) {
            return;
        }
        m10071C1();
        AbstractC5614i1 abstractC5614i1 = this.f22869v;
        abstractC5614i1.getClass();
        abstractC5614i1.f22924q = this.f22924q;
        mo10091Z0().mo7600f();
        abstractC5614i1.f22924q = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: x1.v */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U1 */
    public final void m10224U1(InterfaceC5651v interfaceC5651v) {
        if (interfaceC5651v.equals(this.f23048Y) || (((AbstractC5852n) interfaceC5651v).f23788g.f23790i & Opcodes.ACC_INTERFACE) == 0) {
            this.f23048Y = interfaceC5651v;
        } else {
            C0086a.m445d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: j */
    public final int mo8832j(int i9) {
        InterfaceC5651v interfaceC5651v = this.f23048Y;
        AbstractC5614i1 abstractC5614i1 = this.f22869v;
        abstractC5614i1.getClass();
        return interfaceC5651v.mo1348R0(this, abstractC5614i1, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5614i1
    /* JADX INFO: renamed from: m1 */
    public final void mo10101m1() {
        if (this.f23049Z == null) {
            this.f23049Z = new C5654w(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: p0 */
    public final int mo8833p0(int i9) {
        InterfaceC5651v interfaceC5651v = this.f23048Y;
        AbstractC5614i1 abstractC5614i1 = this.f22869v;
        abstractC5614i1.getClass();
        return interfaceC5651v.mo1346K0(this, abstractC5614i1, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5614i1
    /* JADX INFO: renamed from: p1 */
    public final AbstractC5631o0 mo10104p1() {
        return this.f23049Z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5614i1
    /* JADX INFO: renamed from: r1 */
    public final AbstractC5852n mo10106r1() {
        return ((AbstractC5852n) this.f23048Y).f23788g;
    }
}
