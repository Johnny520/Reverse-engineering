package p000;

/* JADX INFO: renamed from: h3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0269h3 implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2135d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [hp.s(boolean):void, vf0.h3(android.app.Dialog, android.content.Context, android.view.View):void, w3.onAttachedToWindow():void] */
    public /* synthetic */ RunnableC0269h3(int i) {
        this.f2135d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2135d) {
            case 0:
                dh0 dh0Var = ViewTreeObserverOnGlobalLayoutListenerC0875w3.f6908M0;
                synchronized (dh0Var) {
                    Object[] objArr = dh0Var.f1108a;
                    int i = dh0Var.f1109b;
                    for (int i2 = 0; i2 < i; i2++) {
                        ViewTreeObserverOnGlobalLayoutListenerC0875w3.m4842m(((ViewTreeObserverOnGlobalLayoutListenerC0875w3) objArr[i2]).getRoot());
                    }
                }
                return;
            case 1:
                C0291hp.m1481t();
                return;
            default:
                vf0.m4628i3();
                return;
        }
    }
}
