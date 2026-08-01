package p000;

import android.view.View;

/* JADX INFO: renamed from: yl */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0967yl implements InterfaceC0372jy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7654a;

    /* JADX INFO: renamed from: b */
    public final View f7655b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0967yl(View view, int i) {
        this.f7654a = i;
        this.f7655b = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0372jy
    /* JADX INFO: renamed from: a */
    public final void mo1591a() {
        int i = this.f7654a;
        View view = this.f7655b;
        switch (i) {
            case 0:
                int i2 = kc1.f3078a;
                view.performHapticFeedback(0);
                break;
            default:
                int i3 = kc1.f3078a;
                ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) view).performHapticFeedback(0);
                break;
        }
    }
}
