package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: jp */
/* JADX INFO: loaded from: classes.dex */
public final class C0382jp extends AbstractC0567op {

    /* JADX INFO: renamed from: f */
    public static final AtomicIntegerFieldUpdater f2654f = AtomicIntegerFieldUpdater.newUpdater(C0382jp.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: e */
    public final AbstractC0716sp f2655e;

    public C0382jp(AbstractC0716sp abstractC0716sp) {
        this.f2655e = abstractC0716sp;
    }

    @Override // p000.InterfaceC0713sm
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo96f(Object obj) {
        mo647l((Throwable) obj);
        return C0819vh.f4855n;
    }

    @Override // p000.AbstractC0716sp
    /* JADX INFO: renamed from: l */
    public final void mo647l(Throwable th) {
        if (f2654f.compareAndSet(this, 0, 1)) {
            this.f2655e.mo96f(th);
        }
    }
}
