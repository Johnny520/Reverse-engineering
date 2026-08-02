package p000;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: renamed from: k6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0376k6 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5350h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0045b7 f5351i;

    public /* synthetic */ RunnableC0376k6(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, int i) {
        this.f5350h = i;
        this.f5351i = viewTreeObserverOnGlobalLayoutListenerC0045b7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5350h;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f5351i;
        switch (i) {
            case 0:
                C0017ag c0017ag = viewTreeObserverOnGlobalLayoutListenerC0045b7.f692p;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!c0017ag.isEmpty()) {
                    try {
                        ((xm0) c0017ag.removeLast()).mo6a();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            case 1:
                viewTreeObserverOnGlobalLayoutListenerC0045b7.f649L0 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0045b7.f633D0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.m462I(motionEvent);
                    return;
                } else {
                    C0676s.m4653l("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                ViewTreeObserverOnGlobalLayoutListenerC0045b7.m451n(viewTreeObserverOnGlobalLayoutListenerC0045b7.getRoot());
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC0045b7.m451n(viewTreeObserverOnGlobalLayoutListenerC0045b7.getRoot());
                return;
        }
    }
}
