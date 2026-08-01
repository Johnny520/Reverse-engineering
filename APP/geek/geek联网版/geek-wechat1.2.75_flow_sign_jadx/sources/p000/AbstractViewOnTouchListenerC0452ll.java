package p000;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: ll */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0452ll implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f3009a;

    /* JADX INFO: renamed from: b */
    public final int f3010b;

    /* JADX INFO: renamed from: c */
    public final int f3011c;

    /* JADX INFO: renamed from: d */
    public final View f3012d;

    /* JADX INFO: renamed from: e */
    public RunnableC0415kl f3013e;

    /* JADX INFO: renamed from: f */
    public RunnableC0415kl f3014f;

    /* JADX INFO: renamed from: g */
    public boolean f3015g;

    /* JADX INFO: renamed from: h */
    public int f3016h;

    /* JADX INFO: renamed from: i */
    public final int[] f3017i = new int[2];

    public AbstractViewOnTouchListenerC0452ll(View view) {
        this.f3012d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3009a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3010b = tapTimeout;
        this.f3011c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1770a() {
        RunnableC0415kl runnableC0415kl = this.f3014f;
        View view = this.f3012d;
        if (runnableC0415kl != null) {
            view.removeCallbacks(runnableC0415kl);
        }
        RunnableC0415kl runnableC0415kl2 = this.f3013e;
        if (runnableC0415kl2 != null) {
            view.removeCallbacks(runnableC0415kl2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract y30 mo814b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo815c();

    /* JADX INFO: renamed from: d */
    public boolean mo816d() {
        y30 y30VarMo814b = mo814b();
        if (y30VarMo814b == null || !y30VarMo814b.mo973b()) {
            return true;
        }
        y30VarMo814b.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractViewOnTouchListenerC0452ll.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3015g = false;
        this.f3016h = -1;
        RunnableC0415kl runnableC0415kl = this.f3013e;
        if (runnableC0415kl != null) {
            this.f3012d.removeCallbacks(runnableC0415kl);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
