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

    public ViewOnTouchListenerC2722xl(Dialog r2, Rect r3) {
        this.f9303a = r2;
        this.f9304b = r3.left;
        this.f9305c = r3.top;
        ViewConfiguration.get(r2.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r6, MotionEvent r7) {
        View r0 = r6.findViewById(R.id.content);
        int r2 = r0.getLeft() + this.f9304b;
        int r1 = r0.getWidth() + r2;
        int r4 = r0.getTop() + this.f9305c;
        if (new RectF(r2, r4, r1, r0.getHeight() + r4).contains(r7.getX(), r7.getY()) == false) goto L6;
        return false;
    L6:
        MotionEvent r02 = MotionEvent.obtain(r7);
        if (r7.getAction() != 1) goto L9;
        r02.setAction(4);
    L9:
        r6.performClick();
        return this.f9303a.onTouchEvent(r02);
    }
}
