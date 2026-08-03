package p000a;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: a.Z8 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0460Z8 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final Dialog f1728a;

    /* JADX INFO: renamed from: b */
    public final int f1729b;

    /* JADX INFO: renamed from: c */
    public final int f1730c;

    public ViewOnTouchListenerC0460Z8(Dialog dialog, Rect rect) {
        this.f1728a = dialog;
        this.f1729b = rect.left;
        this.f1730c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f1729b;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f1730c, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.f1728a.onTouchEvent(motionEventObtain);
    }
}
