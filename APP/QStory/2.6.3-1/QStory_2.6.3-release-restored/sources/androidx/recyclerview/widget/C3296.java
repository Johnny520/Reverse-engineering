package androidx.recyclerview.widget;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p346.C9607;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3296 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C3306 f7680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f7681 = true;

    public C3296(C3306 c3306) {
        this.f7680 = c3306;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View viewM5443;
        C3306 c3306 = this.f7680;
        C9607 c9607 = c3306.f7750;
        if (!this.f7681 || (viewM5443 = c3306.m5443(motionEvent)) == null || c3306.f7752.m5268(viewM5443) == null) {
            return;
        }
        DialogXRecycleView dialogXRecycleView = c3306.f7752;
        c9607.getClass();
        if ((AbstractC3297.m5426(196611, dialogXRecycleView.getLayoutDirection()) & 16711680) != 0) {
            int pointerId = motionEvent.getPointerId(0);
            int i = c3306.f7758;
            if (pointerId == i) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(iFindPointerIndex);
                float y = motionEvent.getY(iFindPointerIndex);
                c3306.f7739 = x;
                c3306.f7738 = y;
                c3306.f7759 = 0.0f;
                c3306.f7755 = 0.0f;
                c9607.getClass();
            }
        }
    }
}
