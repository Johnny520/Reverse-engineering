package p069i;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: i.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0661a1 extends TouchDelegate {

    /* JADX INFO: renamed from: a */
    public final View f2227a;

    /* JADX INFO: renamed from: b */
    public final Rect f2228b;

    /* JADX INFO: renamed from: c */
    public final Rect f2229c;

    /* JADX INFO: renamed from: d */
    public final Rect f2230d;

    /* JADX INFO: renamed from: e */
    public final int f2231e;

    /* JADX INFO: renamed from: f */
    public boolean f2232f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0661a1(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f2231e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f2228b = rect3;
        Rect rect4 = new Rect();
        this.f2230d = rect4;
        Rect rect5 = new Rect();
        this.f2229c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i2 = -scaledTouchSlop;
        rect4.inset(i2, i2);
        rect5.set(rect2);
        this.f2227a = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z3 = this.f2232f;
                if (z3 && !this.f2230d.contains(x2, y2)) {
                    z4 = z3;
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z3 = this.f2232f;
                    this.f2232f = false;
                }
                z2 = true;
                z4 = false;
            }
            z4 = z3;
            z2 = true;
        } else if (this.f2228b.contains(x2, y2)) {
            this.f2232f = true;
            z2 = true;
        } else {
            z2 = true;
            z4 = false;
        }
        if (!z4) {
            return false;
        }
        Rect rect = this.f2229c;
        View view = this.f2227a;
        if (!z2 || rect.contains(x2, y2)) {
            motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
