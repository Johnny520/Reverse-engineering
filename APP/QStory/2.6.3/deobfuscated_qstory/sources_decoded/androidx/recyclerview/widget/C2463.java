package androidx.recyclerview.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p330.C8778;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2463 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2473 f7335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7336 = true;

    public C2463(C2473 c2473) {
        this.f7335 = c2473;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM4883;
        C2473 c2473 = this.f7335;
        C8778 c8778 = c2473.f7405;
        if (!this.f7336 || (viewM4883 = c2473.m4883(motionEvent)) == null || c2473.f7407.m4708(viewM4883) == null) {
            return;
        }
        DialogXRecycleView dialogXRecycleView = c2473.f7407;
        c8778.getClass();
        if ((AbstractC2464.m4866(196611, dialogXRecycleView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c2473.f7413;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c2473.f7394 = x;
                c2473.f7393 = y;
                c2473.f7414 = 0.0f;
                c2473.f7410 = 0.0f;
                c8778.getClass();
            }
        }
    }
}
