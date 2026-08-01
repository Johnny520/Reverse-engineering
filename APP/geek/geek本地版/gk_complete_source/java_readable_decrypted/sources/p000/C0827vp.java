package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: vp */
/* JADX INFO: loaded from: classes.dex */
public final class C0827vp extends AbstractC0697s6 {

    /* JADX INFO: renamed from: b */
    public final AbstractC0716sp f4874b;

    /* JADX INFO: renamed from: c */
    public C0500mw f4875c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0864wp f4876d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0826vo f4877e;

    public C0827vp(AbstractC0716sp abstractC0716sp, C0864wp c0864wp, InterfaceC0826vo interfaceC0826vo) {
        this.f4876d = c0864wp;
        this.f4877e = interfaceC0826vo;
        this.f4874b = abstractC0716sp;
    }

    @Override // p000.AbstractC0697s6
    /* JADX INFO: renamed from: b */
    public final void mo2306b(Object obj, Object obj2) {
        C0829vr c0829vr = (C0829vr) obj;
        boolean z = obj2 == null;
        AbstractC0716sp abstractC0716sp = this.f4874b;
        InterfaceC0826vo interfaceC0826vo = z ? abstractC0716sp : this.f4875c;
        if (interfaceC0826vo != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0829vr.f4882a;
            while (!atomicReferenceFieldUpdater.compareAndSet(c0829vr, this, interfaceC0826vo)) {
                if (atomicReferenceFieldUpdater.get(c0829vr) != this) {
                    return;
                }
            }
            if (z) {
                C0500mw c0500mw = this.f4875c;
                AbstractC0346ip.m1500l(c0500mw);
                abstractC0716sp.m2522g(c0500mw);
            }
        }
    }

    @Override // p000.AbstractC0697s6
    /* JADX INFO: renamed from: c */
    public final C0431l0 mo2307c(Object obj) {
        if (this.f4876d.m2592x() == this.f4877e) {
            return null;
        }
        return a80.f74g;
    }
}
