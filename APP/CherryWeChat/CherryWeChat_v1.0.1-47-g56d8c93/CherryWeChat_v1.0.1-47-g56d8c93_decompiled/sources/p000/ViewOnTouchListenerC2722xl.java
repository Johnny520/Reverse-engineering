package p000;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: xl */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC2722xl implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final Dialog f9303a;

    /* JADX INFO: renamed from: b */
    public final int f9304b;

    /* JADX INFO: renamed from: c */
    public final int f9305c;

    public ViewOnTouchListenerC2722xl(Dialog dialog, Rect rect) {
        this.f9303a = dialog;
        this.f9304b = rect.left;
        this.f9305c = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f9304b;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f9305c, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.f9303a.onTouchEvent(motionEventObtain);
    }
}
