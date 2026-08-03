package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: w3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2655w3 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9191b;

    public /* synthetic */ C2655w3(int i, Object obj) {
        this.f9190a = i;
        this.f9191b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f9190a) {
            case 0:
                ((LayoutInflaterFactory2C0176E3) this.f9191b).m335D();
                break;
            case 1:
                ((C2115jt) this.f9191b).mo6a();
                break;
            default:
                ((Runnable) this.f9191b).run();
                break;
        }
    }
}
