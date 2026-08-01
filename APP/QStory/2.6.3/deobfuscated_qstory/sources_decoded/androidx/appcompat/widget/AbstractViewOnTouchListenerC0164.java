package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewConfiguration;
import p190.InterfaceC7777;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0164 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public RunnableC0176 f648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final View f649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f650;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int[] f651 = new int[2];

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public RunnableC0176 f652;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f653;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f654;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f655;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f656;

    public AbstractViewOnTouchListenerC0164(View view) {
        this.f649 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f656 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f654 = tapTimeout;
        this.f655 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractViewOnTouchListenerC0164.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f653 = false;
        this.f650 = -1;
        RunnableC0176 runnableC0176 = this.f648;
        if (runnableC0176 != null) {
            this.f649.removeCallbacks(runnableC0176);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean mo619() {
        InterfaceC7777 interfaceC7777Mo527 = mo527();
        if (interfaceC7777Mo527 == null || !interfaceC7777Mo527.mo646()) {
            return true;
        }
        interfaceC7777Mo527.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract boolean mo526();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract InterfaceC7777 mo527();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m620() {
        RunnableC0176 runnableC0176 = this.f652;
        View view = this.f649;
        if (runnableC0176 != null) {
            view.removeCallbacks(runnableC0176);
        }
        RunnableC0176 runnableC01762 = this.f648;
        if (runnableC01762 != null) {
            view.removeCallbacks(runnableC01762);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
