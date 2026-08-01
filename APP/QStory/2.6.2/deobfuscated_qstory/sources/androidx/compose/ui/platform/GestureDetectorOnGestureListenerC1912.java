package androidx.compose.ui.platform;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.ui.focus.C1464;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class GestureDetectorOnGestureListenerC1912 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1908 f5654;

    public GestureDetectorOnGestureListenerC1912(C1908 c1908) {
        this.f5654 = c1908;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C1908 c1908 = this.f5654;
        InterfaceC6557 interfaceC6557 = (InterfaceC6557) c1908.f5623;
        if (!c1908.f5625) {
            int i = c1908.f5624;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    interfaceC6557.invoke(new C1464(f > 0.0f ? 1 : 2));
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                interfaceC6557.invoke(new C1464(f2 > 0.0f ? 1 : 2));
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
