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
    public static int m195a(View view, AbstractC2730xt abstractC2730xt) {
        return ((abstractC2730xt.mo5252c(view) / 2) + abstractC2730xt.mo5254e(view)) - ((abstractC2730xt.mo5261l() / 2) + abstractC2730xt.mo5260k());
    }

    /* JADX INFO: renamed from: b */
    public static View m196b(AbstractC1160i abstractC1160i, AbstractC2730xt abstractC2730xt) {
        int childCount = abstractC1160i.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo5261l = (abstractC2730xt.mo5261l() / 2) + abstractC2730xt.mo5260k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = abstractC1160i.getChildAt(i2);
            int iAbs = Math.abs(((abstractC2730xt.mo5252c(childAt) / 2) + abstractC2730xt.mo5254e(childAt)) - iMo5261l);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2730xt m197c(AbstractC1160i abstractC1160i) {
        AbstractC2730xt abstractC2730xt = this.mHorizontalHelper;
        if (abstractC2730xt == null || abstractC2730xt.f9328a != abstractC1160i) {
            this.mHorizontalHelper = new C2687wt(abstractC1160i, 0);
        }
        return this.mHorizontalHelper;
    }

    @Override // p000.AbstractC0127Cy
    public int[] calculateDistanceToFinalSnap(AbstractC1160i abstractC1160i, View view) {
        int[] iArr = new int[2];
        if (abstractC1160i.canScrollHorizontally()) {
            iArr[0] = m195a(view, m197c(abstractC1160i));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1160i.canScrollVertically()) {
            iArr[1] = m195a(view, m198d(abstractC1160i));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // p000.AbstractC0127Cy
    public AbstractC1164m createScroller(AbstractC1160i abstractC1160i) {
        if (abstractC1160i instanceof InterfaceC2818zv) {
            return new C0079Bt(this, this.mRecyclerView.getContext(), 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2730xt m198d(AbstractC1160i abstractC1160i) {
        AbstractC2730xt abstractC2730xt = this.mVerticalHelper;
        if (abstractC2730xt == null || abstractC2730xt.f9328a != abstractC1160i) {
            this.mVerticalHelper = new C2687wt(abstractC1160i, 1);
        }
        return this.mVerticalHelper;
    }

    @Override // p000.AbstractC0127Cy
    public View findSnapView(AbstractC1160i abstractC1160i) {
        if (abstractC1160i.canScrollVertically()) {
            return m196b(abstractC1160i, m198d(abstractC1160i));
        }
        if (abstractC1160i.canScrollHorizontally()) {
            return m196b(abstractC1160i, m197c(abstractC1160i));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC0127Cy
    @SuppressLint({"UnknownNullness"})
    public int findTargetSnapPosition(AbstractC1160i abstractC1160i, int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC1160i.getItemCount();
        if (itemCount != 0) {
            View view = null;
            AbstractC2730xt abstractC2730xtM198d = abstractC1160i.canScrollVertically() ? m198d(abstractC1160i) : abstractC1160i.canScrollHorizontally() ? m197c(abstractC1160i) : null;
            if (abstractC2730xtM198d != null) {
                int childCount = abstractC1160i.getChildCount();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = abstractC1160i.getChildAt(i5);
                    if (childAt != null) {
                        int iM195a = m195a(childAt, abstractC2730xtM198d);
                        if (iM195a <= 0 && iM195a > i4) {
                            view2 = childAt;
                            i4 = iM195a;
                        }
                        if (iM195a >= 0 && iM195a < i3) {
                            view = childAt;
                            i3 = iM195a;
                        }
                    }
                }
                boolean z2 = !abstractC1160i.canScrollHorizontally() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return abstractC1160i.getPosition(view);
                }
                if (!z2 && view2 != null) {
                    return abstractC1160i.getPosition(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int position = abstractC1160i.getPosition(view);
                    int itemCount2 = abstractC1160i.getItemCount();
                    if ((abstractC1160i instanceof InterfaceC2818zv) && (pointFComputeScrollVectorForPosition = ((InterfaceC2818zv) abstractC1160i).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = position + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < itemCount) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }
}
