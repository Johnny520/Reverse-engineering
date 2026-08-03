package androidx.recyclerview.widget;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8984 extends AbstractC8992 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final float f30314 = 1.0f;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6490
    public AbstractC8987 f3975;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6490
    public AbstractC8987 f3976;

    @Override // androidx.recyclerview.widget.AbstractC8992
    public int[] calculateDistanceToFinalSnap(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919, @InterfaceC6391 View view) {
        int[] iArr = new int[2];
        if (abstractC8919.canScrollHorizontally()) {
            iArr[0] = m30686(abstractC8919, view, m30689(abstractC8919));
        } else {
            iArr[0] = 0;
        }
        if (abstractC8919.canScrollVertically()) {
            iArr[1] = m30686(abstractC8919, view, m30690(abstractC8919));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC8992
    public View findSnapView(RecyclerView.AbstractC8919 abstractC8919) {
        if (abstractC8919.canScrollVertically()) {
            return m30688(abstractC8919, m30690(abstractC8919));
        }
        if (abstractC8919.canScrollHorizontally()) {
            return m30688(abstractC8919, m30689(abstractC8919));
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC8992
    public int findTargetSnapPosition(RecyclerView.AbstractC8919 abstractC8919, int i, int i2) {
        int itemCount;
        View viewFindSnapView;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        int iM30687;
        int iM306872;
        if (!(abstractC8919 instanceof RecyclerView.AbstractC8934.InterfaceC1753) || (itemCount = abstractC8919.getItemCount()) == 0 || (viewFindSnapView = findSnapView(abstractC8919)) == null || (position = abstractC8919.getPosition(viewFindSnapView)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC8934.InterfaceC1753) abstractC8919).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (abstractC8919.canScrollHorizontally()) {
            iM30687 = m30687(abstractC8919, m30689(abstractC8919), i, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iM30687 = -iM30687;
            }
        } else {
            iM30687 = 0;
        }
        if (abstractC8919.canScrollVertically()) {
            iM306872 = m30687(abstractC8919, m30690(abstractC8919), 0, i2);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iM306872 = -iM306872;
            }
        } else {
            iM306872 = 0;
        }
        if (abstractC8919.canScrollVertically()) {
            iM30687 = iM306872;
        }
        if (iM30687 == 0) {
            return -1;
        }
        int i4 = position + iM30687;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= itemCount ? i3 : i5;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float m30685(RecyclerView.AbstractC8919 abstractC8919, AbstractC8987 abstractC8987) {
        int childCount = abstractC8919.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = abstractC8919.getChildAt(i3);
            int position = abstractC8919.getPosition(childAt);
            if (position != -1) {
                if (position < i2) {
                    view = childAt;
                    i2 = position;
                }
                if (position > i) {
                    view2 = childAt;
                    i = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(abstractC8987.mo30700(view), abstractC8987.mo30700(view2)) - Math.min(abstractC8987.mo30703(view), abstractC8987.mo30703(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i - i2) + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m30686(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919, @InterfaceC6391 View view, AbstractC8987 abstractC8987) {
        return (abstractC8987.mo30703(view) + (abstractC8987.mo30701(view) / 2)) - (abstractC8987.mo30710() + (abstractC8987.mo30711() / 2));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m30687(RecyclerView.AbstractC8919 abstractC8919, AbstractC8987 abstractC8987, int i, int i2) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i, i2);
        float fM30685 = m30685(abstractC8919, abstractC8987);
        if (fM30685 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / fM30685);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final View m30688(RecyclerView.AbstractC8919 abstractC8919, AbstractC8987 abstractC8987) {
        int childCount = abstractC8919.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo30710 = abstractC8987.mo30710() + (abstractC8987.mo30711() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = abstractC8919.getChildAt(i2);
            int iAbs = Math.abs((abstractC8987.mo30703(childAt) + (abstractC8987.mo30701(childAt) / 2)) - iMo30710);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final AbstractC8987 m30689(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919) {
        AbstractC8987 abstractC8987 = this.f3976;
        if (abstractC8987 == null || abstractC8987.f3981 != abstractC8919) {
            this.f3976 = AbstractC8987.m5003(abstractC8919);
        }
        return this.f3976;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final AbstractC8987 m30690(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919) {
        AbstractC8987 abstractC8987 = this.f3975;
        if (abstractC8987 == null || abstractC8987.f3981 != abstractC8919) {
            this.f3975 = AbstractC8987.m30699(abstractC8919);
        }
        return this.f3975;
    }
}
