package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wk0 {

    /* JADX INFO: renamed from: a */
    public final bl0 f12551a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC0045b7 f12552b;

    /* JADX INFO: renamed from: c */
    public final sk1 f12553c;

    /* JADX INFO: renamed from: d */
    public final sk1 f12554d;

    /* JADX INFO: renamed from: e */
    public boolean f12555e;

    public wk0(bl0 bl0Var, ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7) {
        this.f12551a = bl0Var;
        this.f12552b = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        sk1 sk1Var = fd2.f2911a;
        this.f12553c = new sk1();
        this.f12554d = new sk1();
    }

    /* JADX INFO: renamed from: a */
    public final void m5940a() {
        if (this.f12555e) {
            return;
        }
        C0645r6 c0645r6 = new C0645r6(0, this, wk0.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 2);
        lk1 lk1Var = this.f12552b.f639G0;
        if (lk1Var.m2931g(c0645r6) < 0) {
            lk1Var.m2925a(c0645r6);
        }
        this.f12555e = true;
    }
}
