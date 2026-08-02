package p000;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xy0 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yy0 f13235a;

    public xy0(yy0 yy0Var) {
        this.f13235a = yy0Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        yy0 yy0Var = this.f13235a;
        C0836w6 c0836w6 = yy0Var.f13670a;
        if (!yy0Var.f13672c) {
            int i = yy0Var.f13671b;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    ((bl0) c0836w6.f12362j.getFocusOwner()).m562g(f > 0.0f ? 1 : 2, false);
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                ((bl0) c0836w6.f12362j.getFocusOwner()).m562g(f2 > 0.0f ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

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
