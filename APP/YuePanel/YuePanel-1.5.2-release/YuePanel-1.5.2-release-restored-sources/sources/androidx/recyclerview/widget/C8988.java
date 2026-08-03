package androidx.recyclerview.widget;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8988 extends AbstractC8992 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f30319 = 100;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6490
    public AbstractC8987 f3983;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6490
    public AbstractC8987 f3984;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۡ$ۥ */
    public class C1782 extends C8983 {
        public C1782(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C8983
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C8983
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.C8983, androidx.recyclerview.widget.RecyclerView.AbstractC8934
        public void onTargetFound(View view, RecyclerView.C8935 c8935, RecyclerView.AbstractC8934.C1752 c1752) {
            C8988 c8988 = C8988.this;
            int[] iArrCalculateDistanceToFinalSnap = c8988.calculateDistanceToFinalSnap(c8988.mRecyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                c1752.m30372(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    private int m30718(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919, @InterfaceC6391 View view, AbstractC8987 abstractC8987) {
        return (abstractC8987.mo30703(view) + (abstractC8987.mo30701(view) / 2)) - (abstractC8987.mo30710() + (abstractC8987.mo30711() / 2));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    private View m30719(RecyclerView.AbstractC8919 abstractC8919, AbstractC8987 abstractC8987) {
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
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private AbstractC8987 m30720(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919) {
        AbstractC8987 abstractC8987 = this.f3984;
        if (abstractC8987 == null || abstractC8987.f3981 != abstractC8919) {
            this.f3984 = AbstractC8987.m5003(abstractC8919);
        }
        return this.f3984;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    private AbstractC8987 m30721(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919) {
        AbstractC8987 abstractC8987 = this.f3983;
        if (abstractC8987 == null || abstractC8987.f3981 != abstractC8919) {
            this.f3983 = AbstractC8987.m30699(abstractC8919);
        }
        return this.f3983;
    }

    @Override // androidx.recyclerview.widget.AbstractC8992
    @InterfaceC6490
    public int[] calculateDistanceToFinalSnap(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919, @InterfaceC6391 View view) {
        int[] iArr = new int[2];
        if (abstractC8919.canScrollHorizontally()) {
            iArr[0] = m30718(abstractC8919, view, m30720(abstractC8919));
        } else {
            iArr[0] = 0;
        }
        if (abstractC8919.canScrollVertically()) {
            iArr[1] = m30718(abstractC8919, view, m30721(abstractC8919));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC8992
    public C8983 createSnapScroller(RecyclerView.AbstractC8919 abstractC8919) {
        if (abstractC8919 instanceof RecyclerView.AbstractC8934.InterfaceC1753) {
            return new C1782(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC8992
    @InterfaceC6490
    public View findSnapView(RecyclerView.AbstractC8919 abstractC8919) {
        if (abstractC8919.canScrollVertically()) {
            return m30719(abstractC8919, m30721(abstractC8919));
        }
        if (abstractC8919.canScrollHorizontally()) {
            return m30719(abstractC8919, m30720(abstractC8919));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC8992
    public int findTargetSnapPosition(RecyclerView.AbstractC8919 abstractC8919, int i, int i2) {
        AbstractC8987 abstractC8987M30722;
        int itemCount = abstractC8919.getItemCount();
        if (itemCount == 0 || (abstractC8987M30722 = m30722(abstractC8919)) == null) {
            return -1;
        }
        int childCount = abstractC8919.getChildCount();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = abstractC8919.getChildAt(i5);
            if (childAt != null) {
                int iM30718 = m30718(abstractC8919, childAt, abstractC8987M30722);
                if (iM30718 <= 0 && iM30718 > i4) {
                    view2 = childAt;
                    i4 = iM30718;
                }
                if (iM30718 >= 0 && iM30718 < i3) {
                    view = childAt;
                    i3 = iM30718;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(abstractC8919, i, i2);
        if (zIsForwardFling && view != null) {
            return abstractC8919.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return abstractC8919.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = abstractC8919.getPosition(view) + (isReverseLayout(abstractC8919) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public final boolean isForwardFling(RecyclerView.AbstractC8919 abstractC8919, int i, int i2) {
        return abstractC8919.canScrollHorizontally() ? i > 0 : i2 > 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isReverseLayout(RecyclerView.AbstractC8919 abstractC8919) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC8919.getItemCount();
        if (!(abstractC8919 instanceof RecyclerView.AbstractC8934.InterfaceC1753) || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC8934.InterfaceC1753) abstractC8919).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final AbstractC8987 m30722(RecyclerView.AbstractC8919 abstractC8919) {
        if (abstractC8919.canScrollVertically()) {
            return m30721(abstractC8919);
        }
        if (abstractC8919.canScrollHorizontally()) {
            return m30720(abstractC8919);
        }
        return null;
    }
}
