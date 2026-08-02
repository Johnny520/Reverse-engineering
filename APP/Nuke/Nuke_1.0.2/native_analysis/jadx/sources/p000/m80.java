package p000;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m80 extends AbstractC0526o2 implements gt1 {

    /* JADX INFO: renamed from: q */
    public final Window f6505q;

    /* JADX INFO: renamed from: r */
    public final nx1 f6506r;

    /* JADX INFO: renamed from: s */
    public boolean f6507s;

    /* JADX INFO: renamed from: t */
    public boolean f6508t;

    /* JADX INFO: renamed from: u */
    public boolean f6509u;

    /* JADX INFO: renamed from: v */
    public boolean f6510v;

    public m80(Context context, Window window) {
        super(context);
        this.f6505q = window;
        this.f6506r = op0.m3598u(AbstractC0439lw.f6341a);
        int i = wa3.f12444a;
        ra3.m4425b(this, this);
        wa3.m5863b(this, new C0013ac(this, 1));
    }

    @Override // p000.AbstractC0526o2
    /* JADX INFO: renamed from: a */
    public final void mo927a(int i, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(1735448596);
        int i2 = 4;
        int i3 = (go0Var.m1984h(this) ? 4 : 2) | i;
        if (go0Var.m1958O(i3 & 1, (i3 & 3) != 2)) {
            ((mn0) this.f6506r.getValue()).mo12g(go0Var, 0);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0483n2(this, i, i2);
        }
    }

    @Override // p000.gt1
    /* JADX INFO: renamed from: b */
    public final cf3 mo333b(View view, cf3 cf3Var) {
        if (!this.f6508t) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return cf3Var.f1518a.mo4170r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return cf3Var;
    }

    @Override // p000.AbstractC0526o2
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f6510v;
    }

    @Override // p000.AbstractC0526o2
    /* JADX INFO: renamed from: h */
    public final void mo928h(boolean z, int i, int i2, int i3, int i4) {
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // p000.AbstractC0526o2
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo929i(int i, int i2) {
        int iM2899a;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.mo929i(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.f6505q;
        if (mode != Integer.MIN_VALUE || this.f6507s || window.getAttributes().height != -2) {
            iM2899a = size2;
        } else if (this.f6508t) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                iM2899a = C0347je.f4990a.m2489a(window);
            } else if (i3 < 32) {
                iM2899a = C0421le.f6075a.m2899a(window);
            }
        } else {
            iM2899a = size2 + 1;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = iM2899a - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f6508t || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.f6507s) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
