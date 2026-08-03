package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import p000.C0038Av;
import p000.InterfaceC2818zv;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1164m {
    private AbstractC1160i mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final C1163l mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;

    public AbstractC1164m() {
        C1163l c1163l = new C1163l();
        c1163l.f4051d = -1;
        c1163l.f4053f = false;
        c1163l.f4048a = 0;
        c1163l.f4049b = 0;
        c1163l.f4050c = Integer.MIN_VALUE;
        c1163l.f4052e = null;
        this.mRecyclingAction = c1163l;
    }

    public PointF computeScrollVectorForPosition(int i) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof InterfaceC2818zv) {
            return ((InterfaceC2818zv) layoutManager).computeScrollVectorForPosition(i);
        }
        return null;
    }

    public View findViewByPosition(int i) {
        return this.mRecyclerView.mLayout.findViewByPosition(i);
    }

    public int getChildCount() {
        return this.mRecyclerView.mLayout.getChildCount();
    }

    public int getChildPosition(View view) {
        return this.mRecyclerView.getChildLayoutPosition(view);
    }

    public AbstractC1160i getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int i) {
        this.mRecyclerView.scrollToPosition(i);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    public void onAnimation(int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        if (this.mTargetPosition == -1 || recyclerView == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f = pointFComputeScrollVectorForPosition.x;
            if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                this.mRecyclingAction.m2270a(recyclerView);
                stop();
            } else {
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
            C1163l c1163l = this.mRecyclingAction;
            boolean z = c1163l.f4051d >= 0;
            c1163l.m2270a(recyclerView);
            if (z && this.mRunning) {
                this.mPendingInitialRun = true;
                recyclerView.mViewFlinger.m2272b();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
            int i = RecyclerView.HORIZONTAL;
        }
    }

    public abstract void onSeekTargetStep(int i, int i2, C0038Av c0038Av, C1163l c1163l);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, C0038Av c0038Av, C1163l c1163l);

    public void setTargetPosition(int i) {
        this.mTargetPosition = i;
    }

    public void start(RecyclerView recyclerView, AbstractC1160i abstractC1160i) {
        RunnableC1165n runnableC1165n = recyclerView.mViewFlinger;
        runnableC1165n.f4060g.removeCallbacks(runnableC1165n);
        runnableC1165n.f4056c.abortAnimation();
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = abstractC1160i;
        int i = this.mTargetPosition;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.mState.f76a = i;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.mViewFlinger.m2272b();
        this.mStarted = true;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f76a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }
}
