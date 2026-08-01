package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 extends AbstractC0708s implements InterfaceC0470md, n01 {

    /* JADX INFO: renamed from: i */
    public final C0834vb f5219i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qs0(InterfaceC0618pk interfaceC0618pk, C0834vb c0834vb) {
        super(interfaceC0618pk, true);
        this.f5219i = c0834vb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: B */
    public final void mo1613B(CancellationException cancellationException) {
        this.f5219i.m4457g(cancellationException, true);
        m1612A(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40, p000.c40
    /* JADX INFO: renamed from: a */
    public final void mo478a(CancellationException cancellationException) {
        Object objM1622N = m1622N();
        if (objM1622N instanceof C0688rg) {
            return;
        }
        if ((objM1622N instanceof i40) && ((i40) objM1622N).m1554f()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new d40(mo1615D(), null, this);
        }
        mo1613B(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.n01
    /* JADX INFO: renamed from: c */
    public final Object mo1709c(InterfaceC0322ik interfaceC0322ik, Object obj) {
        return this.f5219i.mo1709c(interfaceC0322ik, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0470md
    public final C0797ub iterator() {
        C0834vb c0834vb = this.f5219i;
        c0834vb.getClass();
        return new C0797ub(c0834vb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0708s
    /* JADX INFO: renamed from: j0 */
    public final void mo3328j0(Throwable th, boolean z) {
        if (this.f5219i.m4457g(th, false) || z) {
            return;
        }
        o30.m2780t(this.f5614h, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0708s
    /* JADX INFO: renamed from: k0 */
    public final void mo3329k0(Object obj) {
        this.f5219i.m4457g(null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0470md
    /* JADX INFO: renamed from: m */
    public final Object mo2493m(m51 m51Var) {
        C0834vb c0834vb = this.f5219i;
        c0834vb.getClass();
        return C0834vb.m4440D(c0834vb, m51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0470md
    /* JADX INFO: renamed from: q */
    public final Object mo2494q() {
        return this.f5219i.mo2494q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.n01
    /* JADX INFO: renamed from: s */
    public final Object mo1710s(Object obj) {
        return this.f5219i.mo1710s(obj);
    }
}
