package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e21 extends n21 {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2298m = AtomicIntegerFieldUpdater.newUpdater(e21.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: l */
    public final C0151e2 f2299l;

    public e21(C0151e2 c0151e2) {
        this.f2299l = c0151e2;
    }

    @Override // p000.n21
    /* JADX INFO: renamed from: k */
    public final boolean mo1214k() {
        return true;
    }

    @Override // p000.n21
    /* JADX INFO: renamed from: l */
    public final void mo1215l(Throwable th) {
        if (f2298m.compareAndSet(this, 0, 1)) {
            this.f2299l.mo5j(th);
        }
    }
}
