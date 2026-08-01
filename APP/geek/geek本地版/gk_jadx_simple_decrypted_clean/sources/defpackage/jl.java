package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class jl implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;
    public final int b;
    public final int c;
    public final View d;
    public il e;
    public il f;
    public boolean g;
    public int h;
    public final int[] i;

    public jl(View r3) {
        this.i = new int[2];
        this.d = r3;
        r3.setLongClickable(true);
        r3.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(r3.getContext()).getScaledTouchSlop();
        int r32 = ViewConfiguration.getTapTimeout();
        this.b = r32;
        this.c = (ViewConfiguration.getLongPressTimeout() + r32) / 2;
    }

    public final void a() {
        il r0 = this.f;
        View r1 = this.d;
        if (r0 == null) goto L5;
        r1.removeCallbacks(r0);
    L5:
        il r02 = this.e;
        if (r02 == null) goto L9;
        r1.removeCallbacks(r02);
        return;
    }

    public abstract r30 b();

    public abstract boolean c();

    public boolean d() {
        r30 r0 = b();
        if (r0 != null) goto L5;
        return true;
    L5:
        if (r0.b() == false) goto L10;
        r0.dismiss();
        return true;
    L10:
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r13, MotionEvent r14) {
        boolean r132 = this.g;
        View r1 = this.d;
        if (r132 == false) goto L27;
        r30 r4 = b();
        if (r4 == null) goto L23;
        if (r4.b() == false) goto L23;
        kh r42 = r4.j();
        if (r42 == null) goto L23;
        if (r42.isShown() == false) goto L23;
        MotionEvent r5 = MotionEvent.obtainNoHistory(r14);
        int[] r6 = this.i;
        r1.getLocationOnScreen(r6);
        r5.offsetLocation(r6[0], r6[1]);
        r42.getLocationOnScreen(r6);
        r5.offsetLocation(-r6[0], -r6[1]);
        boolean r12 = r42.b(r5, this.h);
        r5.recycle();
        int r142 = r14.getActionMasked();
        if (r142 == 1) goto L18;
        if (r142 == 3) goto L18;
        boolean r143 = true;
    L19:
        if (r12 == false) goto L23;
        if (r143 == false) goto L23;
    L24:
        boolean r144 = true;
    L61:
        this.g = r144;
        if (r144 == true) goto L66;
        if (r132 == true) goto L66;
        return false;
    L66:
        return true;
    L18:
        r143 = false;
    L23:
        if (d() == false) goto L24;
        r144 = false;
        goto L61
    L27:
        if (r1.isEnabled() == false) goto L58;
        int r43 = r14.getActionMasked();
        if (r43 == 0) goto L51;
        if (r43 != 1) goto L33;
    L50:
        a();
        goto L58
    L33:
        if (r43 == 2) goto L36;
        if (r43 == 3) goto L50;
    L36:
        int r0 = r14.findPointerIndex(this.h);
        if (r0 < 0) goto L58;
        float r44 = r14.getX(r0);
        float r145 = r14.getY(r0);
        float r02 = this.a;
        float r52 = -r02;
        if (r44 >= r52) goto L41;
    L47:
        a();
        r1.getParent().requestDisallowInterceptTouchEvent(true);
        if (c() == false) goto L58;
        r144 = true;
    L59:
        if (r144 == false) goto L61;
        long r45 = SystemClock.uptimeMillis();
        MotionEvent r03 = MotionEvent.obtain(r45, r45, 3, 0.0f, 0.0f, 0);
        r1.onTouchEvent(r03);
        r03.recycle();
        goto L61
    L41:
        if (r145 < r52) goto L47;
        if (r44 >= ((r1.getRight() - r1.getLeft()) + r02)) goto L47;
        if (r145 >= ((r1.getBottom() - r1.getTop()) + r02)) goto L47;
    L51:
        this.h = r14.getPointerId(0);
        if (this.e != null) goto L54;
        this.e = new il(this, 0);
    L54:
        r1.postDelayed(this.e, this.b);
        if (this.f != null) goto L57;
        this.f = new il(this, 1);
    L57:
        r1.postDelayed(this.f, this.c);
    L58:
        r144 = false;
        goto L59
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        this.g = false;
        this.h = -1;
        il r22 = this.e;
        if (r22 == null) goto L6;
        this.d.removeCallbacks(r22);
        return;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
    }
}
