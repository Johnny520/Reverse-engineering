package androidx.recyclerview.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p329.C8787;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2463 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2473 f7334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7335 = true;

    public C2463(C2473 c2473) {
        this.f7334 = c2473;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM4873;
        C2473 c2473 = this.f7334;
        C8787 c8787 = c2473.f7404;
        if (!this.f7335 || (viewM4873 = c2473.m4873(motionEvent)) == null || c2473.f7406.m4698(viewM4873) == null) {
            return;
        }
        DialogXRecycleView dialogXRecycleView = c2473.f7406;
        c8787.getClass();
        if ((AbstractC2464.m4856(196611, dialogXRecycleView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c2473.f7412;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c2473.f7393 = x;
                c2473.f7392 = y;
                c2473.f7413 = 0.0f;
                c2473.f7409 = 0.0f;
                c8787.getClass();
            }
        }
    }
}
