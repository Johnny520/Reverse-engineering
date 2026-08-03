package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;
import p000.AbstractC2185lE;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1165n implements Runnable {

    /* JADX INFO: renamed from: a */
    public int f4054a;

    /* JADX INFO: renamed from: b */
    public int f4055b;

    /* JADX INFO: renamed from: c */
    public OverScroller f4056c;

    /* JADX INFO: renamed from: d */
    public Interpolator f4057d;

    /* JADX INFO: renamed from: e */
    public boolean f4058e;

    /* JADX INFO: renamed from: f */
    public boolean f4059f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RecyclerView f4060g;

    public RunnableC1165n(RecyclerView recyclerView) {
        this.f4060g = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f4057d = interpolator;
        this.f4058e = false;
        this.f4059f = false;
        this.f4056c = new OverScroller(recyclerView.getContext(), interpolator);
    }

    /* JADX INFO: renamed from: a */
    public final void m2271a(int i, int i2) {
        RecyclerView recyclerView = this.f4060g;
        recyclerView.setScrollState(2);
        this.f4055b = 0;
        this.f4054a = 0;
        Interpolator interpolator = this.f4057d;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f4057d = interpolator2;
            this.f4056c = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f4056c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m2272b();
    }

    /* JADX INFO: renamed from: b */
    public final void m2272b() {
        if (this.f4058e) {
            this.f4059f = true;
            return;
        }
        RecyclerView recyclerView = this.f4060g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        recyclerView.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m2273c(int i, int i2, Interpolator interpolator, int i3) {
        RecyclerView recyclerView = this.f4060g;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f4057d != interpolator) {
            this.f4057d = interpolator;
            this.f4056c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f4055b = 0;
        this.f4054a = 0;
        recyclerView.setScrollState(2);
        this.f4056c.startScroll(0, 0, i, i2, i4);
        m2272b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.f4060g;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f4056c.abortAnimation();
            return;
        }
        this.f4059f = false;
        this.f4058e = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f4056c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f4054a;
            int i6 = currY - this.f4055b;
            this.f4054a = currX;
            this.f4055b = currY;
            int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i5);
            int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i6);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                iConsumeFlingInHorizontalStretch -= iArr2[0];
                iConsumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i7 = iArr4[0];
                int i8 = iArr4[1];
                int i9 = iConsumeFlingInHorizontalStretch - i7;
                int i10 = iConsumeFlingInVerticalStretch - i8;
                AbstractC1164m abstractC1164m = recyclerView.mLayout.mSmoothScroller;
                if (abstractC1164m != null && !abstractC1164m.isPendingInitialRun() && abstractC1164m.isRunning()) {
                    int iM58b = recyclerView.mState.m58b();
                    if (iM58b == 0) {
                        abstractC1164m.stop();
                    } else if (abstractC1164m.getTargetPosition() >= iM58b) {
                        abstractC1164m.setTargetPosition(iM58b - 1);
                        abstractC1164m.onAnimation(i7, i8);
                    } else {
                        abstractC1164m.onAnimation(i7, i8);
                    }
                }
                i = i9;
                i3 = i7;
                i2 = i10;
                i4 = i8;
            } else {
                i = iConsumeFlingInHorizontalStretch;
                i2 = iConsumeFlingInVerticalStretch;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i3, i4, i, i2, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i11 = i - iArr6[0];
            int i12 = i2 - iArr6[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.dispatchOnScrolled(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
            AbstractC1164m abstractC1164m2 = recyclerView.mLayout.mSmoothScroller;
            if ((abstractC1164m2 == null || !abstractC1164m2.isPendingInitialRun()) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                    if (i12 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i12 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i13, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    C1154c c1154c = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = c1154c.f4022c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    c1154c.f4023d = 0;
                }
            } else {
                m2272b();
                RunnableC1155d runnableC1155d = recyclerView.mGapWorker;
                if (runnableC1155d != null) {
                    runnableC1155d.m2242a(recyclerView, i3, i4);
                }
            }
        }
        AbstractC1164m abstractC1164m3 = recyclerView.mLayout.mSmoothScroller;
        if (abstractC1164m3 != null && abstractC1164m3.isPendingInitialRun()) {
            abstractC1164m3.onAnimation(0, 0);
        }
        this.f4058e = false;
        if (!this.f4059f) {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            recyclerView.postOnAnimation(this);
        }
    }
}
