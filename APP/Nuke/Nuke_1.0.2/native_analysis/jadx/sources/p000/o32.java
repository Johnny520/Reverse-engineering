package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o32 extends AbstractC0565p2 implements InterfaceC0212fq, ho2 {

    /* JADX INFO: renamed from: k */
    public final C0356jn f7463k;

    public o32(a20 a20Var, C0356jn c0356jn) {
        super(a20Var, true);
        this.f7463k = c0356jn;
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: D */
    public final void mo3477D(CancellationException cancellationException) {
        this.f7463k.m2531g(cancellationException, true);
        m4326z(cancellationException);
    }

    @Override // p000.ho2
    /* JADX INFO: renamed from: a */
    public final Object mo2224a(t00 t00Var, Object obj) {
        return this.f7463k.mo2224a(t00Var, obj);
    }

    @Override // p000.r21, p000.k21
    /* JADX INFO: renamed from: c */
    public final void mo1704c(CancellationException cancellationException) {
        Object obj = r21.f9330h.get(this);
        if (obj instanceof C0557ov) {
            return;
        }
        if ((obj instanceof q21) && ((q21) obj).m4044e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new l21(mo3677F(), null, this);
        }
        mo3477D(cancellationException);
    }

    @Override // p000.AbstractC0565p2
    /* JADX INFO: renamed from: g0 */
    public final void mo3478g0(Throwable th, boolean z) {
        if (this.f7463k.m2531g(th, false) || z) {
            return;
        }
        AbstractC0691se.m4824M(this.f7930j, th);
    }

    @Override // p000.AbstractC0565p2
    /* JADX INFO: renamed from: h0 */
    public final void mo3479h0(Object obj) {
        this.f7463k.m2531g(null, false);
    }

    @Override // p000.InterfaceC0212fq
    public final C0319in iterator() {
        C0356jn c0356jn = this.f7463k;
        c0356jn.getClass();
        return new C0319in(c0356jn);
    }

    @Override // p000.InterfaceC0212fq
    /* JADX INFO: renamed from: m */
    public final Object mo1713m() {
        return this.f7463k.mo1713m();
    }

    @Override // p000.ho2
    /* JADX INFO: renamed from: s */
    public final Object mo2225s(Object obj) {
        return this.f7463k.mo2225s(obj);
    }

    @Override // p000.InterfaceC0212fq
    /* JADX INFO: renamed from: w */
    public final Object mo1714w(t00 t00Var) {
        return this.f7463k.mo1714w(t00Var);
    }
}
