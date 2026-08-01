package p047I0;

import android.os.Trace;
import android.view.MotionEvent;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: I0.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0743l implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2325d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0772y f2326e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0743l(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, int i5) {
        this.f2325d = i5;
        this.f2326e = viewTreeObserverOnGlobalLayoutListenerC0772y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2325d) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2326e;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!viewTreeObserverOnGlobalLayoutListenerC0772y.f2479k.isEmpty()) {
                    try {
                        ((InterfaceC1599a) viewTreeObserverOnGlobalLayoutListenerC0772y.f2479k.removeLast()).mo6a();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2 = this.f2326e;
                viewTreeObserverOnGlobalLayoutListenerC0772y2.f2437F0 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0772y2.f2506x0;
                AbstractC1665j.m2982b(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                viewTreeObserverOnGlobalLayoutListenerC0772y2.m1301I(motionEvent);
                return;
        }
    }
}
