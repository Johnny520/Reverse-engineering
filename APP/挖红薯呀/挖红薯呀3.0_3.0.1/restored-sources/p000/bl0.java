package p000;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class bl0 {

    /* JADX INFO: renamed from: a */
    public final Runnable f543a;

    /* JADX INFO: renamed from: b */
    public final x51 f544b = new x51(new C0381k6(6, this));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bl0(Runnable runnable) {
        this.f543a = runnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final ri0 m356a() {
        return ((zk0) this.f544b.getValue()).f7920c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m357b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        m356a().m3508b(new sk0(onBackInvokedDispatcher, 0), 1);
        m356a().m3508b(new sk0(onBackInvokedDispatcher, 1000000), 0);
    }
}
