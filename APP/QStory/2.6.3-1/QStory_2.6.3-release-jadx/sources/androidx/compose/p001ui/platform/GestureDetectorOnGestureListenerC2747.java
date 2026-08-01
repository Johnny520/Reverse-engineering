package androidx.compose.p001ui.platform;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.p001ui.focus.C2299;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC2747 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2743 f6000;

    public GestureDetectorOnGestureListenerC2747(C2743 c2743) {
        this.f6000 = c2743;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C2743 c2743 = this.f6000;
        InterfaceC7387 interfaceC7387 = (InterfaceC7387) c2743.f5969;
        if (!c2743.f5971) {
            int i = c2743.f5970;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    interfaceC7387.invoke(new C2299(f > 0.0f ? 1 : 2));
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                interfaceC7387.invoke(new C2299(f2 > 0.0f ? 1 : 2));
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
