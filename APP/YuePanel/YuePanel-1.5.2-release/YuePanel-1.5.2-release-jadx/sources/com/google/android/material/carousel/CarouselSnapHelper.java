package com.google.android.material.carousel;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.AbstractC8992;
import androidx.recyclerview.widget.C8983;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class CarouselSnapHelper extends AbstractC8992 {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private RecyclerView recyclerView;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CarouselSnapHelper() {
        this(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919, @InterfaceC6391 View view, boolean z) {
        if (!(abstractC8919 instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) abstractC8919, z);
        return abstractC8919.canScrollHorizontally() ? new int[]{iDistanceToFirstFocalKeyline, 0} : abstractC8919.canScrollVertically() ? new int[]{0, iDistanceToFirstFocalKeyline} : new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(@InterfaceC6391 View view, CarouselLayoutManager carouselLayoutManager, boolean z) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z);
    }

    @InterfaceC6490
    private View findViewNearestFirstKeyline(RecyclerView.AbstractC8919 abstractC8919) {
        int childCount = abstractC8919.getChildCount();
        View view = null;
        if (childCount != 0 && (abstractC8919 instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) abstractC8919;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = abstractC8919.getChildAt(i2);
                int iAbs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(abstractC8919.getPosition(childAt), false));
                if (iAbs < i) {
                    view = childAt;
                    i = iAbs;
                }
            }
        }
        return view;
    }

    private boolean isForwardFling(RecyclerView.AbstractC8919 abstractC8919, int i, int i2) {
        return abstractC8919.canScrollHorizontally() ? i > 0 : i2 > 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ */
    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.AbstractC8919 abstractC8919) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC8919.getItemCount();
        if (!(abstractC8919 instanceof RecyclerView.AbstractC8934.InterfaceC1753) || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC8934.InterfaceC1753) abstractC8919).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.AbstractC8992
    public void attachToRecyclerView(@InterfaceC6490 RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.AbstractC8992
    @InterfaceC6490
    public int[] calculateDistanceToFinalSnap(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919, @InterfaceC6391 View view) {
        return calculateDistanceToSnap(abstractC8919, view, false);
    }

    @Override // androidx.recyclerview.widget.AbstractC8992
    @InterfaceC6490
    public RecyclerView.AbstractC8934 createScroller(@InterfaceC6391 final RecyclerView.AbstractC8919 abstractC8919) {
        if (abstractC8919 instanceof RecyclerView.AbstractC8934.InterfaceC1753) {
            return new C8983(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.C8983
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f;
                    float f2;
                    if (abstractC8919.canScrollVertically()) {
                        f = displayMetrics.densityDpi;
                        f2 = 50.0f;
                    } else {
                        f = displayMetrics.densityDpi;
                        f2 = CarouselSnapHelper.HORIZONTAL_SNAP_SPEED;
                    }
                    return f2 / f;
                }

                @Override // androidx.recyclerview.widget.C8983, androidx.recyclerview.widget.RecyclerView.AbstractC8934
                public void onTargetFound(View view, RecyclerView.C8935 c8935, RecyclerView.AbstractC8934.C1752 c1752) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] iArrCalculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i = iArrCalculateDistanceToSnap[0];
                        int i2 = iArrCalculateDistanceToSnap[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                        if (iCalculateTimeForDeceleration > 0) {
                            c1752.m30372(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC8992
    @InterfaceC6490
    public View findSnapView(RecyclerView.AbstractC8919 abstractC8919) {
        return findViewNearestFirstKeyline(abstractC8919);
    }

    @Override // androidx.recyclerview.widget.AbstractC8992
    public int findTargetSnapPosition(RecyclerView.AbstractC8919 abstractC8919, int i, int i2) {
        int itemCount;
        if (!this.disableFling || (itemCount = abstractC8919.getItemCount()) == 0) {
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
                int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) abstractC8919, false);
                if (iDistanceToFirstFocalKeyline <= 0 && iDistanceToFirstFocalKeyline > i4) {
                    view2 = childAt;
                    i4 = iDistanceToFirstFocalKeyline;
                }
                if (iDistanceToFirstFocalKeyline >= 0 && iDistanceToFirstFocalKeyline < i3) {
                    view = childAt;
                    i3 = iDistanceToFirstFocalKeyline;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CarouselSnapHelper(boolean z) {
        this.disableFling = z;
    }
}
