package p000;

/* JADX INFO: renamed from: uu */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0816uu {

    /* JADX INFO: renamed from: a */
    public final C1017zu f6307a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f6308b;

    /* JADX INFO: renamed from: c */
    public final kh0 f6309c;

    /* JADX INFO: renamed from: d */
    public final kh0 f6310d;

    /* JADX INFO: renamed from: e */
    public boolean f6311e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0816uu(C1017zu c1017zu, ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3) {
        this.f6307a = c1017zu;
        this.f6308b = viewTreeObserverOnGlobalLayoutListenerC0875w3;
        kh0 kh0Var = ey0.f1546a;
        this.f6309c = new kh0();
        this.f6310d = new kh0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4355a() {
        if (this.f6311e) {
            return;
        }
        C0417l3 c0417l3 = new C0417l3(0, this, C0816uu.class, "invalidateNodes", "invalidateNodes()V", 0, 1);
        dh0 dh0Var = this.f6308b.f6988x0;
        if (dh0Var.m703g(c0417l3) < 0) {
            dh0Var.m697a(c0417l3);
        }
        this.f6311e = true;
    }
}
