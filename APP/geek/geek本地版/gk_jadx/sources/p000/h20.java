package p000;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class h20 extends TouchDelegate {

    /* JADX INFO: renamed from: a */
    public final View f2196a;

    /* JADX INFO: renamed from: b */
    public final Rect f2197b;

    /* JADX INFO: renamed from: c */
    public final Rect f2198c;

    /* JADX INFO: renamed from: d */
    public final Rect f2199d;

    /* JADX INFO: renamed from: e */
    public final int f2200e;

    /* JADX INFO: renamed from: f */
    public boolean f2201f;

    public h20(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f2200e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f2197b = rect3;
        Rect rect4 = new Rect();
        this.f2199d = rect4;
        Rect rect5 = new Rect();
        this.f2198c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f2196a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f2201f;
                if (z2 && !this.f2199d.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.f2201f;
                    this.f2201f = false;
                }
                z = true;
                z3 = false;
            }
            z3 = z2;
            z = true;
        } else if (this.f2197b.contains(x, y)) {
            this.f2201f = true;
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        Rect rect = this.f2198c;
        View view = this.f2196a;
        if (!z || rect.contains(x, y)) {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
