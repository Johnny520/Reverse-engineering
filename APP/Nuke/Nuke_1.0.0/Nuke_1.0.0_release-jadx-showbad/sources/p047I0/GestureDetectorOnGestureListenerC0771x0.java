package p047I0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import p198m0.C2584o;

/* JADX INFO: renamed from: I0.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC0771x0 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0773y0 f2419a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GestureDetectorOnGestureListenerC0771x0(C0773y0 c0773y0) {
        this.f2419a = c0773y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f5) {
        C0773y0 c0773y0 = this.f2419a;
        C0758r c0758r = c0773y0.f2511a;
        if (!c0773y0.f2513c) {
            int i5 = c0773y0.f2512b;
            if (i5 == 1) {
                if (Math.abs(f2) > Math.abs(f5)) {
                    ((C2584o) c0758r.f2375f.getFocusOwner()).m4532g(f2 > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i5 == 2 && Math.abs(f5) > Math.abs(f2)) {
                ((C2584o) c0758r.f2375f.getFocusOwner()).m4532g(f5 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f5) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
