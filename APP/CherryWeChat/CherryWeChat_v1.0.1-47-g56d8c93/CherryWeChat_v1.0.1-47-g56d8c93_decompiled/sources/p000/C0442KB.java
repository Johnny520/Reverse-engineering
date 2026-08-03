package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: KB */
/* JADX INFO: loaded from: classes.dex */
public final class C0442KB extends AbstractC0399JB {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0521M4 f1444a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0485LB f1445b;

    public C0442KB(ViewTreeObserverOnPreDrawListenerC0485LB viewTreeObserverOnPreDrawListenerC0485LB, C0521M4 c0521m4) {
        this.f1445b = viewTreeObserverOnPreDrawListenerC0485LB;
        this.f1444a = c0521m4;
    }

    @Override // p000.InterfaceC0313HB
    /* JADX INFO: renamed from: d */
    public final void mo665d(AbstractC0356IB abstractC0356IB) {
        ((ArrayList) this.f1444a.get(this.f1445b.f1593b)).remove(abstractC0356IB);
        abstractC0356IB.mo786x(this);
    }
}
