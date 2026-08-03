package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: w3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2655w3 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9191b;

    public /* synthetic */ C2655w3(int r1, Object r2) {
        this.f9190a = r1;
        this.f9191b = r2;
    }

    public final void onBackInvoked() {
        switch(this.f9190a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((Runnable) this.f9191b).run();
        return;
    L6:
        ((C2115jt) this.f9191b).mo6a();
        return;
    L8:
        ((LayoutInflaterFactory2C0176E3) this.f9191b).m335D();
    }
}
