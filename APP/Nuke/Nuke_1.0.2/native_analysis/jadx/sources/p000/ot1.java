package p000;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ot1 {

    /* JADX INFO: renamed from: a */
    public final Runnable f7842a;

    /* JADX INFO: renamed from: b */
    public final hx2 f7843b = new hx2(new C0727ta(17, this));

    public ot1(Runnable runnable) {
        this.f7842a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final fm1 m3639a() {
        return ((mt1) this.f7843b.getValue()).f6830c;
    }

    /* JADX INFO: renamed from: b */
    public final void m3640b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        m3639a().m1664c(new ht1(onBackInvokedDispatcher, 0), 1);
        m3639a().m1664c(new ht1(onBackInvokedDispatcher, 1000000), 0);
    }
}
