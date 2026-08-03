package p055f;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p057g.AbstractC0895c0;
import p057g.C0900f;
import p057g.C0902g;
import p057g.C0904h;
import p057g.C0906i;
import p057g.RunnableC0899e0;

/* JADX INFO: renamed from: f.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0770a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f2732a;

    /* JADX INFO: renamed from: b */
    public final int f2733b;

    /* JADX INFO: renamed from: c */
    public final int f2734c;

    /* JADX INFO: renamed from: d */
    public final View f2735d;

    /* JADX INFO: renamed from: e */
    public RunnableC0899e0 f2736e;

    /* JADX INFO: renamed from: f */
    public RunnableC0899e0 f2737f;

    /* JADX INFO: renamed from: g */
    public boolean f2738g;

    /* JADX INFO: renamed from: h */
    public int f2739h;

    /* JADX INFO: renamed from: i */
    public final int[] f2740i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2741j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ View f2742k;

    public ViewOnTouchListenerC0770a(View r3) {
        this.f2740i = new int[2];
        this.f2735d = r3;
        r3.setLongClickable(true);
        r3.addOnAttachStateChangeListener(this);
        this.f2732a = ViewConfiguration.get(r3.getContext()).getScaledTouchSlop();
        int r32 = ViewConfiguration.getTapTimeout();
        this.f2733b = r32;
        this.f2734c = (ViewConfiguration.getLongPressTimeout() + r32) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1971a() {
        RunnableC0899e0 r02 = this.f2737f;
        View r1 = this.f2735d;
        if (r02 == null) goto L5;
        r1.removeCallbacks(r02);
    L5:
        RunnableC0899e0 r03 = this.f2736e;
        if (r03 == null) goto L9;
        r1.removeCallbacks(r03);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0781l m1972b() {
        switch(this.f2741j) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C0900f r02 = ((C0904h) this.f2742k).f3201d.f3220r;
        if (r02 != null) goto L8;
        return null;
    L8:
        return r02.m2026a();
    L9:
        AbstractC0771b r03 = ((ActionMenuItemView) this.f2742k).f1068m;
        if (r03 == null) goto L16;
        C0900f r04 = ((C0902g) r03).f3185a.f3221s;
        if (r04 != null) goto L14;
        return null;
    L14:
        return r04.m2026a();
    L16:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1973c() {
        switch(this.f2741j) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C0904h) this.f2742k).f3201d.m2236f();
        return true;
    L6:
        ActionMenuItemView r02 = (ActionMenuItemView) this.f2742k;
        InterfaceC0778i r1 = r02.f1066k;
        if (r1 != null) goto L9;
        return false;
    L9:
        if (r1.mo1116a(r02.f1063h) == false) goto L17;
        AbstractC0781l r03 = m1972b();
        if (r03 != null) goto L13;
        return false;
    L13:
        if (r03.mo1978d() == false) goto L19;
        return true;
    L19:
        return false;
    L17:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1974d() {
        switch(this.f2741j) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        C0906i r02 = ((C0904h) this.f2742k).f3201d;
        if (r02.f3222t == null) goto L9;
        return false;
    L9:
        r02.m2235e();
        return true;
    L5:
        return m1975e();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1975e() {
        AbstractC0781l r02 = m1972b();
        if (r02 != null) goto L5;
        return true;
    L5:
        if (r02.mo1978d() == false) goto L10;
        r02.dismiss();
        return true;
    L10:
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View r13, MotionEvent r14) {
        boolean r132 = this.f2738g;
        View r1 = this.f2735d;
        if (r132 == false) goto L27;
        AbstractC0781l r4 = m1972b();
        if (r4 == null) goto L23;
        if (r4.mo1978d() == false) goto L23;
        AbstractC0895c0 r42 = (AbstractC0895c0) r4.mo1979e();
        if (r42 == null) goto L23;
        if (r42.isShown() == false) goto L23;
        MotionEvent r5 = MotionEvent.obtainNoHistory(r14);
        int[] r6 = this.f2740i;
        r1.getLocationOnScreen(r6);
        r5.offsetLocation(r6[0], r6[1]);
        r42.getLocationOnScreen(r6);
        r5.offsetLocation(-r6[0], -r6[1]);
        boolean r12 = r42.m2230b(r5, this.f2739h);
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
        this.f2738g = r144;
        if (r144 == true) goto L67;
        if (r132 == false) goto L66;
        return true;
    L66:
        return false;
    L67:
        return true;
    L18:
        r143 = false;
    L23:
        if (m1974d() == false) goto L24;
        r144 = false;
        goto L61
    L27:
        if (r1.isEnabled() == false) goto L58;
        int r43 = r14.getActionMasked();
        if (r43 == 0) goto L51;
        if (r43 != 1) goto L33;
    L50:
        m1971a();
        goto L58
    L33:
        if (r43 == 2) goto L36;
        if (r43 == 3) goto L50;
    L36:
        int r02 = r14.findPointerIndex(this.f2739h);
        if (r02 < 0) goto L58;
        float r44 = r14.getX(r02);
        float r145 = r14.getY(r02);
        float r03 = this.f2732a;
        float r52 = -r03;
        if (r44 >= r52) goto L41;
    L47:
        m1971a();
        r1.getParent().requestDisallowInterceptTouchEvent(true);
        if (m1973c() == false) goto L58;
        r144 = true;
    L59:
        if (r144 == false) goto L61;
        long r62 = SystemClock.uptimeMillis();
        MotionEvent r04 = MotionEvent.obtain(r62, r62, 3, 0.0f, 0.0f, 0);
        r1.onTouchEvent(r04);
        r04.recycle();
        goto L61
    L41:
        if (r145 < r52) goto L47;
        if (r44 >= ((r1.getRight() - r1.getLeft()) + r03)) goto L47;
        if (r145 >= ((r1.getBottom() - r1.getTop()) + r03)) goto L47;
    L51:
        this.f2739h = r14.getPointerId(0);
        if (this.f2736e != null) goto L54;
        this.f2736e = new RunnableC0899e0(this, 0);
    L54:
        r1.postDelayed(this.f2736e, this.f2733b);
        if (this.f2737f != null) goto L57;
        this.f2737f = new RunnableC0899e0(this, 1);
    L57:
        r1.postDelayed(this.f2737f, this.f2734c);
    L58:
        r144 = false;
        goto L59
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r2) {
        this.f2738g = false;
        this.f2739h = -1;
        RunnableC0899e0 r22 = this.f2736e;
        if (r22 == null) goto L6;
        this.f2735d.removeCallbacks(r22);
        return;
    }

    public ViewOnTouchListenerC0770a(ActionMenuItemView r2) {
        this.f2741j = 0;
        this.f2742k = r2;
        this(r2);
    }

    public ViewOnTouchListenerC0770a(C0904h r2, View r3) {
        this.f2741j = 1;
        this.f2742k = r2;
        this(r3);
    }
}
