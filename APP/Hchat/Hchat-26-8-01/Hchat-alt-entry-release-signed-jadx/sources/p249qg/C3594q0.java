package p249qg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p230p8.C3364p;

/* JADX INFO: renamed from: qg.q0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3594q0 extends AbstractC3602u0 {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11608l = AtomicIntegerFieldUpdater.newUpdater(C3594q0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: k */
    public final C3364p f11609k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3594q0(C3364p c3364p) {
        this.f11609k = c3364p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3602u0
    /* JADX INFO: renamed from: k */
    public final boolean mo7495k() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3602u0
    /* JADX INFO: renamed from: l */
    public final void mo7496l(Throwable th2) {
        if (f11608l.compareAndSet(this, 0, 1)) {
            this.f11609k.invoke(th2);
        }
    }
}
