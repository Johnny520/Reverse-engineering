package p000;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1160i;
import androidx.recyclerview.widget.AbstractC1164m;

/* JADX INFO: renamed from: Ct */
/* JADX INFO: loaded from: classes.dex */
public class C0122Ct extends AbstractC0127Cy {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;
    private AbstractC2730xt mHorizontalHelper;
    private AbstractC2730xt mVerticalHelper;

    /* JADX INFO: renamed from: a */
    public static int m195a(View r1, AbstractC2730xt r2) {
        int r0 = r2.mo5254e(r1);
        int r12 = (r2.mo5252c(r1) / 2) + r0;
        int r02 = r2.mo5260k();
        return r12 - ((r2.mo5261l() / 2) + r02);
    }

    /* JADX INFO: renamed from: b */
    public static View m196b(AbstractC1160i r8, AbstractC2730xt r9) {
        int r0 = r8.getChildCount();
        View r1 = null;
        if (r0 != 0) goto L5;
        return null;
    L5:
        int r2 = r9.mo5260k();
        int r3 = (r9.mo5261l() / 2) + r2;
        int r22 = Integer.MAX_VALUE;
        int r4 = 0;
    L6:
        if (r4 >= r0) goto L11;
        View r5 = r8.getChildAt(r4);
        int r6 = r9.mo5254e(r5);
        int r62 = Math.abs(((r9.mo5252c(r5) / 2) + r6) - r3);
        if (r62 >= r22) goto L10;
        r1 = r5;
        r22 = r62;
    L10:
        r4 = r4 + 1;
        goto L6
    L11:
        return r1;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2730xt m197c(AbstractC1160i r3) {
        AbstractC2730xt r0 = this.mHorizontalHelper;
        if (r0 != null) goto L5;
    L6:
        this.mHorizontalHelper = new C2687wt(r3, 0);
    L8:
        return this.mHorizontalHelper;
    L5:
        if (r0.f9328a == r3) goto L8;
        goto L6
    }

    @Override // p000.AbstractC0127Cy
    public int[] calculateDistanceToFinalSnap(AbstractC1160i r5, View r6) {
        int[] r0 = new int[2];
        if (r5.canScrollHorizontally() == false) goto L5;
        r0[0] = m195a(r6, m197c(r5));
    L7:
        if (r5.canScrollVertically() == false) goto L10;
        r0[1] = m195a(r6, m198d(r5));
        return r0;
    L10:
        r0[1] = 0;
        return r0;
    L5:
        r0[0] = 0;
        goto L7
    }

    @Override // p000.AbstractC0127Cy
    public AbstractC1164m createScroller(AbstractC1160i r3) {
        if ((r3 instanceof InterfaceC2818zv) == true) goto L7;
        return null;
    L7:
        return new C0079Bt(this, this.mRecyclerView.getContext(), 0);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2730xt m198d(AbstractC1160i r3) {
        AbstractC2730xt r0 = this.mVerticalHelper;
        if (r0 != null) goto L5;
    L6:
        this.mVerticalHelper = new C2687wt(r3, 1);
    L8:
        return this.mVerticalHelper;
    L5:
        if (r0.f9328a == r3) goto L8;
        goto L6
    }

    @Override // p000.AbstractC0127Cy
    public View findSnapView(AbstractC1160i r2) {
        if (r2.canScrollVertically() == false) goto L7;
        return m196b(r2, m198d(r2));
    L7:
        if (r2.canScrollHorizontally() == true) goto L9;
        return null;
    L9:
        return m196b(r2, m197c(r2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0127Cy
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(AbstractC1160i r13, int r14, int r15) {
        int r0 = r13.getItemCount();
        if (r0 == 0) goto L62;
        View r3 = null;
        if (r13.canScrollVertically() == false) goto L9;
        AbstractC2730xt r2 = m198d(r13);
    L12:
        if (r2 == null) goto L62;
        int r4 = r13.getChildCount();
        boolean r5 = false;
        int r9 = 0;
        int r8 = Integer.MAX_VALUE;
        int r7 = Integer.MIN_VALUE;
        View r6 = null;
    L15:
        if (r9 >= r4) goto L27;
        View r10 = r13.getChildAt(r9);
        if (r10 == null) goto L26;
        int r11 = m195a(r10, r2);
        if (r11 > 0) goto L23;
        if (r11 <= r7) goto L23;
        r6 = r10;
        r7 = r11;
    L23:
        if (r11 < 0) goto L26;
        if (r11 >= r8) goto L26;
        r3 = r10;
        r8 = r11;
    L26:
        r9 = r9 + 1;
        goto L15
    L27:
        int r42 = 1;
        if (r13.canScrollHorizontally() == false) goto L32;
        if (r14 <= 0) goto L31;
    L30:
        boolean r142 = true;
    L34:
        if (r142 == false) goto L38;
        if (r3 == null) goto L38;
        return r13.getPosition(r3);
    L38:
        if (r142 == true) goto L42;
        if (r6 == null) goto L42;
        return r13.getPosition(r6);
    L42:
        if (r142 == false) goto L44;
        r3 = r6;
    L44:
        if (r3 == null) goto L62;
        int r152 = r13.getPosition(r3);
        int r22 = r13.getItemCount();
        if ((r13 instanceof InterfaceC2818zv) == false) goto L55;
        PointF r132 = ((InterfaceC2818zv) r13).computeScrollVectorForPosition(r22 - 1);
        if (r132 == null) goto L55;
        if (r132.x >= 0.0f) goto L53;
    L54:
        r5 = true;
        goto L55
    L53:
        if (r132.y < 0.0f) goto L54;
    L55:
        if (r5 != r142) goto L57;
        r42 = -1;
    L57:
        int r153 = r152 + r42;
        if (r153 < 0) goto L62;
        if (r153 >= r0) goto L62;
        return r153;
    L31:
        r142 = false;
        goto L34
    L32:
        if (r15 <= 0) goto L31;
    L9:
        if (r13.canScrollHorizontally() == false) goto L11;
        r2 = m197c(r13);
        goto L12
    L11:
        r2 = null;
    L62:
        return -1;
    }
}
