package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: ci */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1266ci implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f4302a;

    /* JADX INFO: renamed from: b */
    public final int f4303b;

    /* JADX INFO: renamed from: c */
    public final int f4304c;

    /* JADX INFO: renamed from: d */
    public final View f4305d;

    /* JADX INFO: renamed from: e */
    public RunnableC1223bi f4306e;

    /* JADX INFO: renamed from: f */
    public RunnableC1223bi f4307f;

    /* JADX INFO: renamed from: g */
    public boolean f4308g;

    /* JADX INFO: renamed from: h */
    public int f4309h;

    /* JADX INFO: renamed from: i */
    public final int[] f4310i;

    public AbstractViewOnTouchListenerC1266ci(View r3) {
        this.f4310i = new int[2];
        this.f4305d = r3;
        r3.setLongClickable(true);
        r3.addOnAttachStateChangeListener(this);
        this.f4302a = ViewConfiguration.get(r3.getContext()).getScaledTouchSlop();
        int r32 = ViewConfiguration.getTapTimeout();
        this.f4303b = r32;
        this.f4304c = (ViewConfiguration.getLongPressTimeout() + r32) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2407a() {
        RunnableC1223bi r0 = this.f4307f;
        View r1 = this.f4305d;
        if (r0 == null) goto L5;
        r1.removeCallbacks(r0);
    L5:
        RunnableC1223bi r02 = this.f4306e;
        if (r02 == null) goto L9;
        r1.removeCallbacks(r02);
        return;
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC2168ky mo1753b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1754c();

    /* JADX INFO: renamed from: d */
    public boolean mo2408d() {
        InterfaceC2168ky r0 = mo1753b();
        if (r0 != null) goto L5;
        return true;
    L5:
        if (r0.mo575a() == false) goto L10;
        r0.dismiss();
        return true;
    L10:
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r13, MotionEvent r14) {
        boolean r132 = this.f4308g;
        View r1 = this.f4305d;
        if (r132 == false) goto L27;
        InterfaceC2168ky r4 = mo1753b();
        if (r4 == null) goto L23;
        if (r4.mo575a() == false) goto L23;
        C0365Ie r42 = r4.mo580h();
        if (r42 == null) goto L23;
        if (r42.isShown() == false) goto L23;
        MotionEvent r5 = MotionEvent.obtainNoHistory(r14);
        int[] r6 = this.f4310i;
        r1.getLocationOnScreen(r6);
        r5.offsetLocation(r6[0], r6[1]);
        r42.getLocationOnScreen(r6);
        r5.offsetLocation(-r6[0], -r6[1]);
        boolean r12 = r42.m807b(r5, this.f4309h);
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
        this.f4308g = r144;
        if (r144 == true) goto L66;
        if (r132 == true) goto L66;
        return false;
    L66:
        return true;
    L18:
        r143 = false;
    L23:
        if (mo2408d() == false) goto L24;
        r144 = false;
        goto L61
    L27:
        if (r1.isEnabled() == false) goto L58;
        int r43 = r14.getActionMasked();
        if (r43 == 0) goto L51;
        if (r43 != 1) goto L33;
    L50:
        m2407a();
        goto L58
    L33:
        if (r43 == 2) goto L36;
        if (r43 == 3) goto L50;
    L36:
        int r0 = r14.findPointerIndex(this.f4309h);
        if (r0 < 0) goto L58;
        float r44 = r14.getX(r0);
        float r145 = r14.getY(r0);
        float r02 = this.f4302a;
        float r52 = -r02;
        if (r44 >= r52) goto L41;
    L47:
        m2407a();
        r1.getParent().requestDisallowInterceptTouchEvent(true);
        if (mo1754c() == false) goto L58;
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
        this.f4309h = r14.getPointerId(0);
        if (this.f4306e != null) goto L54;
        this.f4306e = new RunnableC1223bi(this, 0);
    L54:
        r1.postDelayed(this.f4306e, this.f4303b);
        if (this.f4307f != null) goto L57;
        this.f4307f = new RunnableC1223bi(this, 1);
    L57:
        r1.postDelayed(this.f4307f, this.f4304c);
    L58:
        r144 = false;
        goto L59
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        this.f4308g = false;
        this.f4309h = -1;
        RunnableC1223bi r22 = this.f4306e;
        if (r22 == null) goto L6;
        this.f4305d.removeCallbacks(r22);
        return;
    }
}
