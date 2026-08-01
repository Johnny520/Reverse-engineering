package p158f0;

import p000A.C0045X;
import p095T.C1342V;
import p108V3.C1534G;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: f0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2069a extends C2070b {
    @Override // p158f0.C2070b
    /* JADX INFO: renamed from: C */
    public final C2070b mo3799C(InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        return (C2070b) ((AbstractC2074f) AbstractC2082n.m3829e(new C1534G(new C0045X(5, interfaceC1601c, interfaceC1601c2), 2)));
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: c */
    public final void mo3787c() {
        synchronized (AbstractC2082n.f6972c) {
            m3814o();
        }
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: k */
    public final void mo3793k() {
        AbstractC2086r.m3860l();
        throw null;
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: l */
    public final void mo3794l() {
        AbstractC2086r.m3860l();
        throw null;
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: m */
    public final void mo3795m() {
        AbstractC2082n.m3825a();
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: u */
    public final AbstractC2074f mo3797u(InterfaceC1601c interfaceC1601c) {
        return (C2073e) ((AbstractC2074f) AbstractC2082n.m3829e(new C1534G(new C1342V(interfaceC1601c, 1), 2)));
    }

    @Override // p158f0.C2070b
    /* JADX INFO: renamed from: w */
    public final AbstractC2086r mo3800w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
