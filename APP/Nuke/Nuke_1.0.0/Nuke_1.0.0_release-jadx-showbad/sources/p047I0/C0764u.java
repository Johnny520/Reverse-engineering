package p047I0;

import android.os.SystemClock;
import android.view.MotionEvent;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: I0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0764u extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2385e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0772y f2386f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0764u(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, int i5) {
        super(0);
        this.f2385e = i5;
        this.f2386f = viewTreeObserverOnGlobalLayoutListenerC0772y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int actionMasked;
        switch (this.f2385e) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2386f;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0772y.f2506x0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    viewTreeObserverOnGlobalLayoutListenerC0772y.f2508y0 = SystemClock.uptimeMillis();
                    viewTreeObserverOnGlobalLayoutListenerC0772y.post(viewTreeObserverOnGlobalLayoutListenerC0772y.f2433D0);
                }
                return C0891q.f2780a;
            default:
                return this.f2386f.get_viewTreeOwners();
        }
    }
}
