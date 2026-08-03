package p014b;

import android.window.OnBackInvokedCallback;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: b.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0123b implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f323a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC1220a f324b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0123b(InterfaceC1220a interfaceC1220a, int i9) {
        this.f323a = i9;
        this.f324b = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f323a) {
            case 0:
                this.f324b.invoke();
                break;
            default:
                InterfaceC1220a interfaceC1220a = this.f324b;
                if (interfaceC1220a != null) {
                    interfaceC1220a.invoke();
                }
                break;
        }
    }
}
