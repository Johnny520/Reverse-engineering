package p357y1;

import android.os.Trace;
import android.view.MotionEvent;
import p085fg.InterfaceC1220a;
import p136j8.C2104o;
import tf.C4164k;

/* JADX INFO: renamed from: y1.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5894j implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23954g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5934t f23955h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC5894j(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, int i9) {
        this.f23954g = i9;
        this.f23955h = viewTreeObserverOnGlobalLayoutListenerC5934t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23954g) {
            case 0:
                C4164k c4164k = this.f23955h.f24126o;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!c4164k.isEmpty()) {
                    try {
                        ((InterfaceC1220a) c4164k.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            case 1:
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f23955h;
                viewTreeObserverOnGlobalLayoutListenerC5934t.f24083K0 = false;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC5934t.f24067C0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    viewTreeObserverOnGlobalLayoutListenerC5934t.m10652K(motionEvent);
                    return;
                } else {
                    C2104o.m5276A("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                ViewTreeObserverOnGlobalLayoutListenerC5934t.m10639p(this.f23955h.getRoot());
                return;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC5934t.m10639p(this.f23955h.getRoot());
                return;
        }
    }
}
