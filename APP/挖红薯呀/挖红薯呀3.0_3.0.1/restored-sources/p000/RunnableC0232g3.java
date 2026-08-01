package p000;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: renamed from: g3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0232g3 implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1850d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0875w3 f1851e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0232g3(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, int i) {
        this.f1850d = i;
        this.f1851e = viewTreeObserverOnGlobalLayoutListenerC0875w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1850d;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f1851e;
        switch (i) {
            case 0:
                C0917x8 c0917x8 = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6961k;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!c0917x8.isEmpty()) {
                    try {
                        ((InterfaceC0298hw) c0917x8.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            default:
                viewTreeObserverOnGlobalLayoutListenerC0875w3.f6916C0 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6982u0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    viewTreeObserverOnGlobalLayoutListenerC0875w3.m4848E(motionEvent);
                    return;
                } else {
                    C0921xc.m5134o("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
        }
    }
}
