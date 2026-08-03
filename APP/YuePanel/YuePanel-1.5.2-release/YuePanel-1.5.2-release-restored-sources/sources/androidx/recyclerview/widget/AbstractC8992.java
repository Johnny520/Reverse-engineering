package androidx.recyclerview.widget;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8992 extends RecyclerView.AbstractC8924 {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.AbstractC8926 mScrollListener = new C1784();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۥ$ۥ */
    public class C1784 extends RecyclerView.AbstractC8926 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3988 = false;

        public C1784() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8926
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f3988) {
                this.f3988 = false;
                AbstractC8992.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8926
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f3988 = true;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۥ$ۥ۟ */
    public class C1785 extends C8983 {
        public C1785(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C8983
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return AbstractC8992.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C8983, androidx.recyclerview.widget.RecyclerView.AbstractC8934
        public void onTargetFound(View view, RecyclerView.C8935 c8935, RecyclerView.AbstractC8934.C1752 c1752) {
            AbstractC8992 abstractC8992 = AbstractC8992.this;
            RecyclerView recyclerView = abstractC8992.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = abstractC8992.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i = iArrCalculateDistanceToFinalSnap[0];
            int i2 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                c1752.m30372(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    public void attachToRecyclerView(@InterfaceC6490 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m5007();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            m5008();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    @InterfaceC6490
    public abstract int[] calculateDistanceToFinalSnap(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919, @InterfaceC6391 View view);

    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    @InterfaceC6490
    public RecyclerView.AbstractC8934 createScroller(RecyclerView.AbstractC8919 abstractC8919) {
        return createSnapScroller(abstractC8919);
    }

    @InterfaceC6490
    @Deprecated
    public C8983 createSnapScroller(RecyclerView.AbstractC8919 abstractC8919) {
        if (abstractC8919 instanceof RecyclerView.AbstractC8934.InterfaceC1753) {
            return new C1785(this.mRecyclerView.getContext());
        }
        return null;
    }

    @InterfaceC6490
    public abstract View findSnapView(RecyclerView.AbstractC8919 abstractC8919);

    public abstract int findTargetSnapPosition(RecyclerView.AbstractC8919 abstractC8919, int i, int i2);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8924
    public boolean onFling(int i, int i2) {
        RecyclerView.AbstractC8919 layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m30744(layoutManager, i, i2);
    }

    public void snapToTargetExistingView() {
        RecyclerView.AbstractC8919 layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m5007() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m5008() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m30744(@InterfaceC6391 RecyclerView.AbstractC8919 abstractC8919, int i, int i2) {
        RecyclerView.AbstractC8934 abstractC8934CreateScroller;
        int iFindTargetSnapPosition;
        if (!(abstractC8919 instanceof RecyclerView.AbstractC8934.InterfaceC1753) || (abstractC8934CreateScroller = createScroller(abstractC8919)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(abstractC8919, i, i2)) == -1) {
            return false;
        }
        abstractC8934CreateScroller.setTargetPosition(iFindTargetSnapPosition);
        abstractC8919.startSmoothScroll(abstractC8934CreateScroller);
        return true;
    }
}
