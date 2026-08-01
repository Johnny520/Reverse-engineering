package p158f0;

import p092S0.C1286x;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: f0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2072d extends AbstractC2074f {

    /* JADX INFO: renamed from: e */
    public final InterfaceC1601c f6941e;

    /* JADX INFO: renamed from: f */
    public final AbstractC2074f f6942f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2072d(long j5, C2080l c2080l, InterfaceC1601c interfaceC1601c, AbstractC2074f abstractC2074f) {
        super(j5, c2080l);
        this.f6941e = interfaceC1601c;
        this.f6942f = abstractC2074f;
        abstractC2074f.mo3793k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: c */
    public final void mo3787c() {
        AbstractC2074f abstractC2074f = this.f6942f;
        if (this.f6947c) {
            return;
        }
        if (this.f6946b != abstractC2074f.mo3791g()) {
            m3812a();
        }
        abstractC2074f.mo3794l();
        this.f6947c = true;
        synchronized (AbstractC2082n.f6972c) {
            m3814o();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: e */
    public final InterfaceC1601c mo3789e() {
        return this.f6941e;
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
        AbstractC2086r.m3860l();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: l */
    public final void mo3794l() {
        AbstractC2086r.m3860l();
        throw null;
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
        return new C2072d(this.f6946b, this.f6945a, AbstractC2082n.m3835k(interfaceC1601c, this.f6941e, true), this.f6942f);
    }

    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: m */
    public final void mo3795m() {
    }
}
