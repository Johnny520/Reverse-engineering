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
    private int mTargetPosition;
    private View mTargetView;

    public AbstractC1164m() {
        this.mTargetPosition = -1;
        C1163l r1 = new C1163l();
        r1.f4051d = -1;
        r1.f4053f = false;
        r1.f4048a = 0;
        r1.f4049b = 0;
        r1.f4050c = Integer.MIN_VALUE;
        r1.f4052e = null;
        this.mRecyclingAction = r1;
    }

    public PointF computeScrollVectorForPosition(int r3) {
        Object r0 = getLayoutManager();
        if ((r0 instanceof InterfaceC2818zv) == true) goto L5;
        return null;
    L5:
        return ((InterfaceC2818zv) r0).computeScrollVectorForPosition(r3);
    }

    public View findViewByPosition(int r2) {
        return this.mRecyclerView.mLayout.findViewByPosition(r2);
    }

    public int getChildCount() {
        return this.mRecyclerView.mLayout.getChildCount();
    }

    public int getChildPosition(View r2) {
        return this.mRecyclerView.getChildLayoutPosition(r2);
    }

    public AbstractC1160i getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int r2) {
        this.mRecyclerView.scrollToPosition(r2);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(PointF r3) {
        float r0 = r3.x;
        float r1 = r3.y;
        float r12 = r1 * r1;
        float r02 = (float) Math.sqrt(r12 + (r0 * r0));
        r3.x /= r02;
        r3.y /= r02;
    }

    public void onAnimation(int r7, int r8) {
        RecyclerView r0 = this.mRecyclerView;
        if (this.mTargetPosition == (-1)) goto L5;
        if (r0 == null) goto L5;
    L7:
        if (this.mPendingInitialRun == true) goto L9;
    L19:
        boolean r1 = false;
        this.mPendingInitialRun = false;
        View r3 = this.mTargetView;
        if (r3 == null) goto L26;
        if (getChildPosition(r3) != this.mTargetPosition) goto L24;
        onTargetFound(this.mTargetView, r0.mState, this.mRecyclingAction);
        this.mRecyclingAction.m2270a(r0);
        stop();
        goto L26
    L24:
        this.mTargetView = null;
    L26:
        if (this.mRunning == false) goto L36;
        onSeekTargetStep(r7, r8, r0.mState, this.mRecyclingAction);
        C1163l r72 = this.mRecyclingAction;
        if (r72.f4051d < 0) goto L30;
        r1 = true;
    L30:
        r72.m2270a(r0);
        if (r1 == true) goto L33;
        return;
    L33:
        if (this.mRunning == false) goto L38;
        this.mPendingInitialRun = true;
        r0.mViewFlinger.m2272b();
        return;
    L38:
        return;
    L36:
        return;
    L9:
        if (this.mTargetView != null) goto L19;
        if (this.mLayoutManager == null) goto L19;
        PointF r12 = computeScrollVectorForPosition(this.mTargetPosition);
        if (r12 == null) goto L19;
        float r32 = r12.x;
        if (r32 == 0.0f) goto L17;
    L18:
        r0.scrollStep((int) Math.signum(r32), (int) Math.signum(r12.y), null);
        goto L19
    L17:
        if (r12.y == 0.0f) goto L19;
    L5:
        stop();
        goto L7
    }

    public void onChildAttachedToWindow(View r3) {
        if (getChildPosition(r3) != getTargetPosition()) goto L6;
        this.mTargetView = r3;
        int r32 = RecyclerView.HORIZONTAL;
        return;
    }

    public abstract void onSeekTargetStep(int r1, int r2, C0038Av r3, C1163l r4);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View r1, C0038Av r2, C1163l r3);

    public void setTargetPosition(int r1) {
        this.mTargetPosition = r1;
    }

    public void start(RecyclerView r3, AbstractC1160i r4) {
        RunnableC1165n r0 = r3.mViewFlinger;
        r0.f4060g.removeCallbacks(r0);
        r0.f4056c.abortAnimation();
        this.mRecyclerView = r3;
        this.mLayoutManager = r4;
        int r42 = this.mTargetPosition;
        if (r42 == (-1)) goto L7;
        r3.mState.f76a = r42;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.mViewFlinger.m2272b();
        this.mStarted = true;
        return;
    L7:
        throw new IllegalArgumentException("Invalid target position");
    }

    public final void stop() {
        if (this.mRunning == true) goto L5;
        return;
    L5:
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
