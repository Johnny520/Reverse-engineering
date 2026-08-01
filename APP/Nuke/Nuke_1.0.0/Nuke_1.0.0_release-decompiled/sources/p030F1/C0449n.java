package p030F1;

import android.window.OnBackInvokedCallback;
import p112W2.InterfaceC1599a;

/* JADX INFO: renamed from: F1.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0449n implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1346b;

    public /* synthetic */ C0449n(int i5, Object obj) {
        this.f1345a = i5;
        this.f1346b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1345a) {
            case 0:
                ((C0447l) this.f1346b).m709a();
                break;
            default:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f1346b;
                if (interfaceC1599a != null) {
                    interfaceC1599a.mo6a();
                }
                break;
        }
    }
}
