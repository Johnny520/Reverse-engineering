package p357y1;

import android.view.GestureDetector;
import android.view.MotionEvent;
import p041d1.C0670p;

/* JADX INFO: renamed from: y1.p1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC5920p1 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5924q1 f24029a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GestureDetectorOnGestureListenerC5920p1(C5924q1 c5924q1) {
        this.f24029a = c5924q1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
        C5924q1 c5924q1 = this.f24029a;
        C5918p c5918p = c5924q1.f24034a;
        if (!c5924q1.f24036c) {
            int i9 = c5924q1.f24035b;
            if (i9 == 1) {
                if (Math.abs(f3) > Math.abs(f10)) {
                    ((C0670p) c5918p.f24027h.getFocusOwner()).m1849g(f3 > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i9 == 2 && Math.abs(f10) > Math.abs(f3)) {
                ((C0670p) c5918p.f24027h.getFocusOwner()).m1849g(f10 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
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
