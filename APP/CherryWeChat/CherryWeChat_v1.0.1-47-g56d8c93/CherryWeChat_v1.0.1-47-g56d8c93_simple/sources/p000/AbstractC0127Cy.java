package p000;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.AbstractC1160i;
import androidx.recyclerview.widget.AbstractC1164m;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: Cy */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0127Cy extends AbstractC2517sv {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final AbstractC2603uv mScrollListener;

    public AbstractC0127Cy() {
        this.mScrollListener = new C0084By(this);
    }

    public void attachToRecyclerView(RecyclerView r3) {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == r3) goto L16;
        if (r0 == null) goto L7;
        r0.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    L7:
        this.mRecyclerView = r3;
        if (r3 != null) goto L10;
        return;
    L10:
        if (r3.getOnFlingListener() != null) goto L14;
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
        this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
        snapToTargetExistingView();
        return;
    L14:
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public abstract int[] calculateDistanceToFinalSnap(AbstractC1160i r1, View r2);

    @SuppressLint({"UnknownNullness"})
    public int[] calculateScrollDistance(int r10, int r11) {
        this.mGravityScroller.fling(0, 0, r10, r11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    public abstract AbstractC1164m createScroller(AbstractC1160i r1);

    @Deprecated
    public C2201lo createSnapScroller(AbstractC1160i r3) {
        if ((r3 instanceof InterfaceC2818zv) == true) goto L7;
        return null;
    L7:
        return new C0079Bt(this, this.mRecyclerView.getContext(), 1);
    }

    public abstract View findSnapView(AbstractC1160i r1);

    public abstract int findTargetSnapPosition(AbstractC1160i r1, int r2, int r3);

    @Override // p000.AbstractC2517sv
    public boolean onFling(int r5, int r6) {
        AbstractC1160i r0 = this.mRecyclerView.getLayoutManager();
        if (r0 != null) goto L6;
        return false;
    L6:
        if (this.mRecyclerView.getAdapter() != null) goto L8;
        return false;
    L8:
        int r2 = this.mRecyclerView.getMinFlingVelocity();
        if (Math.abs(r6) > r2) goto L13;
        if (Math.abs(r5) > r2) goto L13;
    L20:
        return false;
    L13:
        if ((r0 instanceof InterfaceC2818zv) == false) goto L20;
        AbstractC1164m r22 = createScroller(r0);
        if (r22 == null) goto L20;
        int r52 = findTargetSnapPosition(r0, r5, r6);
        if (r52 == (-1)) goto L20;
        r22.setTargetPosition(r52);
        r0.startSmoothScroll(r22);
        return true;
    }

    public void snapToTargetExistingView() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L19;
        AbstractC1160i r02 = r0.getLayoutManager();
        if (r02 == null) goto L20;
        View r1 = findSnapView(r02);
        if (r1 == null) goto L21;
        int[] r03 = calculateDistanceToFinalSnap(r02, r1);
        int r12 = r03[0];
        if (r12 == 0) goto L14;
    L17:
        this.mRecyclerView.smoothScrollBy(r12, r03[1]);
        return;
    L14:
        if (r03[1] != 0) goto L17;
        return;
    L21:
        return;
    L20:
        return;
    }
}
