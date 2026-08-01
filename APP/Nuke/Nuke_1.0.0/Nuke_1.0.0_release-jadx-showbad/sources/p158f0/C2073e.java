package p158f0;

import p092S0.C1286x;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: f0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2073e extends AbstractC2074f {

    /* JADX INFO: renamed from: e */
    public final InterfaceC1601c f6943e;

    /* JADX INFO: renamed from: f */
    public int f6944f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2073e(long j5, C2080l c2080l, InterfaceC1601c interfaceC1601c) {
        super(j5, c2080l);
        this.f6943e = interfaceC1601c;
        this.f6944f = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: c */
    public final void mo3787c() {
        if (this.f6947c) {
            return;
        }
        mo3794l();
        this.f6947c = true;
        synchronized (AbstractC2082n.f6972c) {
            m3814o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: e */
    public final InterfaceC1601c mo3789e() {
        return this.f6943e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: f */
    public final boolean mo3790f() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: i */
    public final InterfaceC1601c mo3792i() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: k */
    public final void mo3793k() {
        this.f6944f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: l */
    public final void mo3794l() {
        int i5 = this.f6944f - 1;
        this.f6944f = i5;
        if (i5 == 0) {
            m3812a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: n */
    public final void mo3796n(InterfaceC2090v interfaceC2090v) {
        C1286x c1286x = AbstractC2082n.f6970a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: u */
    public final AbstractC2074f mo3797u(InterfaceC1601c interfaceC1601c) {
        AbstractC2082n.m3827c(this);
        return new C2072d(this.f6946b, this.f6945a, AbstractC2082n.m3835k(interfaceC1601c, this.f6943e, true), this);
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: m */
    public final void mo3795m() {
    }
}
