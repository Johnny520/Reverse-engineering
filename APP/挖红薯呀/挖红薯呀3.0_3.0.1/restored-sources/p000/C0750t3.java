package p000;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: renamed from: t3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0750t3 extends c50 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5902d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0875w3 f5903e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0750t3(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, int i) {
        super(0);
        this.f5902d = i;
        this.f5903e = viewTreeObserverOnGlobalLayoutListenerC0875w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int actionMasked;
        int i = this.f5902d;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f5903e;
        switch (i) {
            case 0:
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6982u0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    viewTreeObserverOnGlobalLayoutListenerC0875w3.f6984v0 = SystemClock.uptimeMillis();
                    viewTreeObserverOnGlobalLayoutListenerC0875w3.post(viewTreeObserverOnGlobalLayoutListenerC0875w3.f6912A0);
                }
                return na1.f4229a;
            default:
                return viewTreeObserverOnGlobalLayoutListenerC0875w3.get_viewTreeOwners();
        }
    }
}
