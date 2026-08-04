package yyds;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: yyds.ᲈᛴᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2642 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f13028;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f13029;

    public /* synthetic */ C2642(int i, Object obj) {
        this.f13028 = i;
        this.f13029 = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        int i = this.f13028;
        Object obj = this.f13029;
        switch (i) {
            case 0:
                ((LayoutInflaterFactory2C2181) obj).m4153();
                break;
            case 1:
                ((InterfaceC2266) obj).mo731();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
