package p000;

import android.view.MotionEvent;

/* JADX INFO: renamed from: u3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0789u3 implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0875w3 f6117d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0789u3(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3) {
        this.f6117d = viewTreeObserverOnGlobalLayoutListenerC0875w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f6117d;
        viewTreeObserverOnGlobalLayoutListenerC0875w3.removeCallbacks(this);
        MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6982u0;
        if (motionEvent != null) {
            boolean z = motionEvent.getToolType(0) == 3;
            int actionMasked = motionEvent.getActionMasked();
            if (z) {
                if (actionMasked == 10 || actionMasked == 1) {
                    return;
                }
            } else if (actionMasked == 1) {
                return;
            }
            int i = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i = 2;
            }
            viewTreeObserverOnGlobalLayoutListenerC0875w3.m4849F(motionEvent, i, viewTreeObserverOnGlobalLayoutListenerC0875w3.f6984v0, false);
        }
    }
}
