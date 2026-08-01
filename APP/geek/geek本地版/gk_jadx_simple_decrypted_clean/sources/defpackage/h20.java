package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class h20 extends TouchDelegate {
    public final View a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final int e;
    public boolean f;

    public h20(Rect r5, Rect r6, View r7) {
        super(r5, r7);
        int r0 = ViewConfiguration.get(r7.getContext()).getScaledTouchSlop();
        this.e = r0;
        Rect r1 = new Rect();
        this.b = r1;
        Rect r2 = new Rect();
        this.d = r2;
        Rect r3 = new Rect();
        this.c = r3;
        r1.set(r5);
        r2.set(r5);
        int r52 = -r0;
        r2.inset(r52, r52);
        r3.set(r6);
        this.a = r7;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent r9) {
        int r0 = (int) r9.getX();
        int r1 = (int) r9.getY();
        int r2 = r9.getAction();
        boolean r5 = true;
        if (r2 == 0) goto L17;
        if (r2 == 1) goto L11;
        if (r2 == 2) goto L11;
        if (r2 != 3) goto L19;
        boolean r22 = this.f;
        this.f = false;
    L10:
        r5 = r22;
        boolean r23 = true;
    L20:
        if (r5 == false) goto L29;
        Rect r4 = this.c;
        View r52 = this.a;
        if (r23 == true) goto L24;
    L26:
        r9.setLocation(r0 - r4.left, r1 - r4.top);
    L28:
        return r52.dispatchTouchEvent(r9);
    L24:
        if (r4.contains(r0, r1) == true) goto L26;
        r9.setLocation(r52.getWidth() / 2, r52.getHeight() / 2);
        goto L28
    L29:
        return false;
    L19:
        r23 = true;
        r5 = false;
    L11:
        r22 = this.f;
        if (r22 == false) goto L10;
        if (this.d.contains(r0, r1) == true) goto L10;
        r5 = r22;
        r23 = false;
        goto L20
    L17:
        if (this.b.contains(r0, r1) == false) goto L19;
        this.f = true;
        r23 = true;
        goto L20
    }
}
