package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class z30 extends f40 {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7785l = AtomicIntegerFieldUpdater.newUpdater(z30.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: k */
    public final C0191f f7786k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z30(C0191f c0191f) {
        this.f7786k = c0191f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f40
    /* JADX INFO: renamed from: r */
    public final boolean mo18r() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.f40
    /* JADX INFO: renamed from: s */
    public final void mo19s(Throwable th) {
        if (f7785l.compareAndSet(this, 0, 1)) {
            this.f7786k.invoke(th);
        }
    }
}
