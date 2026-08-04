package yyds;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: yyds.ᛱᛳᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0091 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f687 = true;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1877 f688;

    public C0091(C1877 c1877) {
        this.f688 = c1877;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C1877 c1877;
        View viewM3668;
        AbstractC0185 abstractC0185M2419;
        if (!this.f687 || (viewM3668 = (c1877 = this.f688).m3668(motionEvent)) == null || (abstractC0185M2419 = c1877.f9450.m2419(viewM3668)) == null || (AbstractC2450.m4491(196611, c1877.f9450.getLayoutDirection()) & 16711680) == 0) {
            return;
        }
        int pointerId = motionEvent.getPointerId(0);
        int i = c1877.f9459;
        if (pointerId == i) {
            int iFindPointerIndex = motionEvent.findPointerIndex(i);
            float x = motionEvent.getX(iFindPointerIndex);
            float y = motionEvent.getY(iFindPointerIndex);
            c1877.f9466 = x;
            c1877.f9445 = y;
            c1877.f9444 = 0.0f;
            c1877.f9441 = 0.0f;
            c1877.m3670(abstractC0185M2419, 2);
        }
    }
}
