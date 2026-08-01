package p361yc;

import java.util.ArrayList;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p300uc.C8661o;
import p300uc.InterfaceC8662p;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9486d;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: yc.d3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9685d3 implements InterfaceC9488f, InterfaceC9486d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f32917a = new ArrayList();

    /* JADX INFO: renamed from: H */
    private final boolean m37860H(InterfaceC9218f interfaceC9218f, int i10) {
        m37865Y(mo37863W(interfaceC9218f, i10));
        return true;
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: A */
    public final void mo630A(long j10) {
        mo718Q(m37864X(), j10);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: B */
    public final void mo36964B(InterfaceC9218f interfaceC9218f, int i10, int i11) {
        interfaceC9218f.getClass();
        mo717P(mo37863W(interfaceC9218f, i10), i11);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: C */
    public InterfaceC9486d mo36965C(InterfaceC9218f interfaceC9218f, int i10) {
        return super.mo36965C(interfaceC9218f, i10);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: D */
    public final void mo36966D(InterfaceC9218f interfaceC9218f, int i10, String str) {
        interfaceC9218f.getClass();
        str.getClass();
        mo720S(mo37863W(interfaceC9218f, i10), str);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: E */
    public final void mo36967E(InterfaceC9218f interfaceC9218f, int i10, boolean z10) {
        interfaceC9218f.getClass();
        mo710I(mo37863W(interfaceC9218f, i10), z10);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: F */
    public final void mo631F(String str) {
        str.getClass();
        mo720S(m37864X(), str);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: G */
    public abstract void mo632G(InterfaceC8662p interfaceC8662p, Object obj);

    /* JADX INFO: renamed from: I */
    public abstract void mo710I(Object obj, boolean z10);

    /* JADX INFO: renamed from: J */
    public abstract void mo711J(Object obj, byte b10);

    /* JADX INFO: renamed from: K */
    public abstract void mo712K(Object obj, char c10);

    /* JADX INFO: renamed from: L */
    public abstract void mo713L(Object obj, double d10);

    /* JADX INFO: renamed from: M */
    public abstract void mo714M(Object obj, InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: N */
    public abstract void mo715N(Object obj, float f10);

    /* JADX INFO: renamed from: O */
    public InterfaceC9488f mo716O(Object obj, InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        m37865Y(obj);
        return this;
    }

    /* JADX INFO: renamed from: P */
    public abstract void mo717P(Object obj, int i10);

    /* JADX INFO: renamed from: Q */
    public abstract void mo718Q(Object obj, long j10);

    /* JADX INFO: renamed from: R */
    public abstract void mo719R(Object obj, short s10);

    /* JADX INFO: renamed from: S */
    public abstract void mo720S(Object obj, String str);

    /* JADX INFO: renamed from: T */
    public abstract void mo721T(InterfaceC9218f interfaceC9218f);

    /* JADX INFO: renamed from: U */
    public final Object m37861U() {
        return AbstractC5081g0.m20587u0(this.f32917a);
    }

    /* JADX INFO: renamed from: V */
    public final Object m37862V() {
        return AbstractC5081g0.m20589w0(this.f32917a);
    }

    /* JADX INFO: renamed from: W */
    public abstract Object mo37863W(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: X */
    public final Object m37864X() {
        if (this.f32917a.isEmpty()) {
            throw new C8661o("No tag in stack for requested element");
        }
        ArrayList arrayList = this.f32917a;
        return arrayList.remove(AbstractC5114x.m20802q(arrayList));
    }

    /* JADX INFO: renamed from: Y */
    public final void m37865Y(Object obj) {
        this.f32917a.add(obj);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: d */
    public final void mo638d(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        if (!this.f32917a.isEmpty()) {
            m37864X();
        }
        mo721T(interfaceC9218f);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: g */
    public void mo36969g(InterfaceC9218f interfaceC9218f, int i10, InterfaceC8662p interfaceC8662p, Object obj) {
        interfaceC9218f.getClass();
        interfaceC8662p.getClass();
        if (m37860H(interfaceC9218f, i10)) {
            mo632G(interfaceC8662p, obj);
        }
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: h */
    public final void mo641h(double d10) {
        mo713L(m37864X(), d10);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: i */
    public final void mo642i(short s10) {
        mo719R(m37864X(), s10);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: j */
    public final void mo643j(byte b10) {
        mo711J(m37864X(), b10);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: k */
    public final void mo644k(boolean z10) {
        mo710I(m37864X(), z10);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: l */
    public final InterfaceC9488f mo36970l(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo716O(mo37863W(interfaceC9218f, i10), interfaceC9218f.mo35894h(i10));
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: m */
    public InterfaceC9488f mo645m(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return mo716O(m37864X(), interfaceC9218f);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: n */
    public final void mo36971n(InterfaceC9218f interfaceC9218f, int i10, float f10) {
        interfaceC9218f.getClass();
        mo715N(mo37863W(interfaceC9218f, i10), f10);
    }

    /* JADX INFO: renamed from: o */
    public void mo646o(InterfaceC9218f interfaceC9218f, int i10, InterfaceC8662p interfaceC8662p, Object obj) {
        interfaceC9218f.getClass();
        interfaceC8662p.getClass();
        if (m37860H(interfaceC9218f, i10)) {
            mo36975w(interfaceC8662p, obj);
        }
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: p */
    public final void mo647p(float f10) {
        mo715N(m37864X(), f10);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: q */
    public final void mo36972q(InterfaceC9218f interfaceC9218f, int i10, long j10) {
        interfaceC9218f.getClass();
        mo718Q(mo37863W(interfaceC9218f, i10), j10);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: r */
    public final void mo648r(char c10) {
        mo712K(m37864X(), c10);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: s */
    public final void mo649s(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        mo714M(m37864X(), interfaceC9218f, i10);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: t */
    public final void mo36973t(InterfaceC9218f interfaceC9218f, int i10, short s10) {
        interfaceC9218f.getClass();
        mo719R(mo37863W(interfaceC9218f, i10), s10);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: u */
    public final void mo36974u(InterfaceC9218f interfaceC9218f, int i10, char c10) {
        interfaceC9218f.getClass();
        mo712K(mo37863W(interfaceC9218f, i10), c10);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: w */
    public void mo36975w(InterfaceC8662p interfaceC8662p, Object obj) {
        super.mo36975w(interfaceC8662p, obj);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: x */
    public final void mo36976x(InterfaceC9218f interfaceC9218f, int i10, double d10) {
        interfaceC9218f.getClass();
        mo713L(mo37863W(interfaceC9218f, i10), d10);
    }

    @Override // p345xc.InterfaceC9486d
    /* JADX INFO: renamed from: y */
    public final void mo36977y(InterfaceC9218f interfaceC9218f, int i10, byte b10) {
        interfaceC9218f.getClass();
        mo711J(mo37863W(interfaceC9218f, i10), b10);
    }

    @Override // p345xc.InterfaceC9488f
    /* JADX INFO: renamed from: z */
    public final void mo650z(int i10) {
        mo717P(m37864X(), i10);
    }
}
