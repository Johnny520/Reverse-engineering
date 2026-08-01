package p000;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: jl */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0378jl implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final float f2639a;

    /* JADX INFO: renamed from: b */
    public final int f2640b;

    /* JADX INFO: renamed from: c */
    public final int f2641c;

    /* JADX INFO: renamed from: d */
    public final View f2642d;

    /* JADX INFO: renamed from: e */
    public RunnableC0338il f2643e;

    /* JADX INFO: renamed from: f */
    public RunnableC0338il f2644f;

    /* JADX INFO: renamed from: g */
    public boolean f2645g;

    /* JADX INFO: renamed from: h */
    public int f2646h;

    /* JADX INFO: renamed from: i */
    public final int[] f2647i = new int[2];

    public AbstractViewOnTouchListenerC0378jl(View view) {
        this.f2642d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2639a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2640b = tapTimeout;
        this.f2641c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1604a() {
        RunnableC0338il runnableC0338il = this.f2644f;
        View view = this.f2642d;
        if (runnableC0338il != null) {
            view.removeCallbacks(runnableC0338il);
        }
        RunnableC0338il runnableC0338il2 = this.f2643e;
        if (runnableC0338il2 != null) {
            view.removeCallbacks(runnableC0338il2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract r30 mo863b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo864c();

    /* JADX INFO: renamed from: d */
    public boolean mo865d() {
        r30 r30VarMo863b = mo863b();
        if (r30VarMo863b == null || !r30VarMo863b.mo1705b()) {
            return true;
        }
        r30VarMo863b.dismiss();
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractViewOnTouchListenerC0378jl.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2645g = false;
        this.f2646h = -1;
        RunnableC0338il runnableC0338il = this.f2643e;
        if (runnableC0338il != null) {
            this.f2642d.removeCallbacks(runnableC0338il);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
