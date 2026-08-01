package p000;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class o20 extends TouchDelegate {

    /* JADX INFO: renamed from: a */
    public final View f3358a;

    /* JADX INFO: renamed from: b */
    public final Rect f3359b;

    /* JADX INFO: renamed from: c */
    public final Rect f3360c;

    /* JADX INFO: renamed from: d */
    public final Rect f3361d;

    /* JADX INFO: renamed from: e */
    public final int f3362e;

    /* JADX INFO: renamed from: f */
    public boolean f3363f;

    public o20(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3362e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f3359b = rect3;
        Rect rect4 = new Rect();
        this.f3361d = rect4;
        Rect rect5 = new Rect();
        this.f3360c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f3358a = view;
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
                z2 = this.f3363f;
                if (z2 && !this.f3361d.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.f3363f;
                    this.f3363f = false;
                }
                z = true;
                z3 = false;
            }
            z3 = z2;
            z = true;
        } else if (this.f3359b.contains(x, y)) {
            this.f3363f = true;
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        Rect rect = this.f3360c;
        View view = this.f3358a;
        if (!z || rect.contains(x, y)) {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
