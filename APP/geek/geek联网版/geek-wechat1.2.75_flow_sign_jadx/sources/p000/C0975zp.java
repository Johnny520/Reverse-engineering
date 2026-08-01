package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: zp */
/* JADX INFO: loaded from: classes.dex */
public final class C0975zp extends AbstractC0696s6 {

    /* JADX INFO: renamed from: b */
    public final AbstractC0864wp f5605b;

    /* JADX INFO: renamed from: c */
    public C0796uw f5606c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0040aq f5607d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0974zo f5608e;

    public C0975zp(AbstractC0864wp abstractC0864wp, C0040aq c0040aq, InterfaceC0974zo interfaceC0974zo) {
        this.f5607d = c0040aq;
        this.f5608e = interfaceC0974zo;
        this.f5605b = abstractC0864wp;
    }

    @Override // p000.AbstractC0696s6
    /* JADX INFO: renamed from: b */
    public final void mo2306b(Object obj, Object obj2) {
        C0977zr c0977zr = (C0977zr) obj;
        boolean z = obj2 == null;
        AbstractC0864wp abstractC0864wp = this.f5605b;
        InterfaceC0974zo interfaceC0974zo = z ? abstractC0864wp : this.f5606c;
        if (interfaceC0974zo != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0977zr.f5613a;
            while (!atomicReferenceFieldUpdater.compareAndSet(c0977zr, this, interfaceC0974zo)) {
                if (atomicReferenceFieldUpdater.get(c0977zr) != this) {
                    return;
                }
            }
            if (z) {
                C0796uw c0796uw = this.f5606c;
                AbstractC0493mp.m1854d(c0796uw);
                abstractC0864wp.m2850g(c0796uw);
            }
        }
    }

    @Override // p000.AbstractC0696s6
    /* JADX INFO: renamed from: c */
    public final C0431l0 mo2307c(Object obj) {
        if (this.f5607d.m465x() == this.f5608e) {
            return null;
        }
        return g80.f1913g;
    }
}
