package p000a;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: a.V0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0380V0 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1436a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1437b;

    public /* synthetic */ C0380V0(int i, Object obj) {
        this.f1436a = i;
        this.f1437b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1436a) {
            case 0:
                ((LayoutInflaterFactory2C0291Q0) this.f1437b).m810T();
                break;
            case 1:
                InterfaceC0819s7 interfaceC0819s7 = (InterfaceC0819s7) this.f1437b;
                C0631i9.m1482e(interfaceC0819s7, "$onBackInvoked");
                interfaceC0819s7.mo31a();
                break;
            default:
                ((Runnable) this.f1437b).run();
                break;
        }
    }
}
