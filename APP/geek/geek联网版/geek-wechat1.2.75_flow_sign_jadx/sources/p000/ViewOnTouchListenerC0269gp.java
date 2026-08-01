package p000;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: gp */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0269gp implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final Dialog f2037a;

    /* JADX INFO: renamed from: b */
    public final int f2038b;

    /* JADX INFO: renamed from: c */
    public final int f2039c;

    /* JADX INFO: renamed from: d */
    public final int f2040d;

    public ViewOnTouchListenerC0269gp(Dialog dialog, Rect rect) {
        this.f2037a = dialog;
        this.f2038b = rect.left;
        this.f2039c = rect.top;
        this.f2040d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f2038b;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f2039c, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f2040d;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f2037a.onTouchEvent(motionEventObtain);
    }
}
