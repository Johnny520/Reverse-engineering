package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: np */
/* JADX INFO: loaded from: classes.dex */
public final class C0530np extends AbstractC0715sp {

    /* JADX INFO: renamed from: f */
    public static final AtomicIntegerFieldUpdater f3327f = AtomicIntegerFieldUpdater.newUpdater(C0530np.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: e */
    public final AbstractC0864wp f3328e;

    public C0530np(AbstractC0864wp abstractC0864wp) {
        this.f3328e = abstractC0864wp;
    }

    @Override // p000.InterfaceC0786um
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo26f(Object obj) {
        mo1671l((Throwable) obj);
        return C0893xh.f5258n;
    }

    @Override // p000.AbstractC0864wp
    /* JADX INFO: renamed from: l */
    public final void mo1671l(Throwable th) {
        if (f3327f.compareAndSet(this, 0, 1)) {
            this.f3328e.mo26f(th);
        }
    }
}
