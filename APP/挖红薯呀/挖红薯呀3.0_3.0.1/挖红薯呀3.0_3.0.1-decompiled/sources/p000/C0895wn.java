package p000;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: wn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0895wn extends AbstractC0671r implements rk0 {

    /* JADX INFO: renamed from: l */
    public final Window f7151l;

    /* JADX INFO: renamed from: m */
    public final gp0 f7152m;

    /* JADX INFO: renamed from: n */
    public boolean f7153n;

    /* JADX INFO: renamed from: o */
    public boolean f7154o;

    /* JADX INFO: renamed from: p */
    public boolean f7155p;

    /* JADX INFO: renamed from: q */
    public boolean f7156q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0895wn(Context context, Window window) {
        super(context);
        this.f7151l = window;
        this.f7152m = r60.m3419u(AbstractC0512nh.f4263a);
        int i = kc1.f3078a;
        gc1.m1236a(this, this);
        kc1.m1788a(this, new C0858vn(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.rk0
    /* JADX INFO: renamed from: a */
    public final be1 mo1964a(View view, be1 be1Var) {
        if (!this.f7154o) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return be1Var.f503a.mo4196n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return be1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0671r
    /* JADX INFO: renamed from: b */
    public final void mo1246b(InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(1735448596);
        int i2 = (c0616pi.m3108h(this) ? 4 : 2) | i;
        if (c0616pi.m3082O(i2 & 1, (i2 & 3) != 2)) {
            ((InterfaceC0904ww) this.f7152m.getValue()).invoke(c0616pi, 0);
        } else {
            c0616pi.m3085R();
        }
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0634q(this, i, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0671r
    /* JADX INFO: renamed from: e */
    public final void mo3369e(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    @Override // p000.AbstractC0671r
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3370f(int i, int i2) {
        int iM1776a;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.mo3370f(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.f7151l;
        if (mode != Integer.MIN_VALUE || this.f7153n || window.getAttributes().height != -2) {
            iM1776a = size2;
        } else if (!this.f7154o) {
            iM1776a = size2 + 1;
        } else if (Build.VERSION.SDK_INT < 32) {
            iM1776a = C0383k8.f3046a.m1776a(window);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i3 = size - paddingRight;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = iM1776a - paddingBottom;
        int i5 = i4 >= 0 ? i4 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f7154o || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f7153n) {
            return;
        }
        window.setLayout(-1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0671r
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7156q;
    }
}
