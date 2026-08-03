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

    public RunnableC1165n(RecyclerView r3) {
        this.f4060g = r3;
        Interpolator r0 = RecyclerView.sQuinticInterpolator;
        this.f4057d = r0;
        this.f4058e = false;
        this.f4059f = false;
        this.f4056c = new OverScroller(r3.getContext(), r0);
    }

    /* JADX INFO: renamed from: a */
    public final void m2271a(int r13, int r14) {
        RecyclerView r1 = this.f4060g;
        r1.setScrollState(2);
        this.f4055b = 0;
        this.f4054a = 0;
        Interpolator r0 = this.f4057d;
        Interpolator r2 = RecyclerView.sQuinticInterpolator;
        if (r0 == r2) goto L5;
        this.f4057d = r2;
        this.f4056c = new OverScroller(r1.getContext(), r2);
    L5:
        this.f4056c.fling(0, 0, r13, r14, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        m2272b();
    }

    /* JADX INFO: renamed from: b */
    public final void m2272b() {
        if (this.f4058e == false) goto L6;
        this.f4059f = true;
        return;
    L6:
        RecyclerView r0 = this.f4060g;
        r0.removeCallbacks(this);
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        r0.postOnAnimation(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m2273c(int r10, int r11, Interpolator r12, int r13) {
        RecyclerView r2 = this.f4060g;
        if (r13 != Integer.MIN_VALUE) goto L15;
        int r132 = Math.abs(r10);
        int r0 = Math.abs(r11);
        if (r132 <= r0) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L10;
        int r4 = r2.getWidth();
    L11:
        if (r3 == true) goto L14;
        r132 = r0;
    L14:
        r13 = Math.min((int) (((r132 / r4) + 1.0f) * 300.0f), 2000);
        goto L15
    L10:
        r4 = r2.getHeight();
        goto L11
    L7:
        r3 = false;
    L15:
        int r8 = r13;
        if (r12 != null) goto L19;
        r12 = RecyclerView.sQuinticInterpolator;
    L19:
        if (this.f4057d == r12) goto L21;
        this.f4057d = r12;
        this.f4056c = new OverScroller(r2.getContext(), r12);
    L21:
        this.f4055b = 0;
        this.f4054a = 0;
        r2.setScrollState(2);
        this.f4056c.startScroll(0, 0, r10, r11, r8);
        m2272b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView r0 = this.f4060g;
        if (r0.mLayout != null) goto L6;
        r0.removeCallbacks(this);
        this.f4056c.abortAnimation();
        return;
    L6:
        this.f4059f = false;
        this.f4058e = true;
        r0.consumePendingUpdateOperations();
        OverScroller r10 = this.f4056c;
        if (r10.computeScrollOffset() == false) goto L87;
        int r1 = r10.getCurrX();
        int r2 = r10.getCurrY();
        int r3 = r1 - this.f4054a;
        int r4 = r2 - this.f4055b;
        this.f4054a = r1;
        this.f4055b = r2;
        int r12 = r0.consumeFlingInHorizontalStretch(r3);
        int r22 = r0.consumeFlingInVerticalStretch(r4);
        int[] r32 = r0.mReusableIntPair;
        r32[0] = 0;
        r32[1] = 0;
        if (r0.dispatchNestedPreScroll(r12, r22, r32, null, 1) == false) goto L12;
        int[] r33 = r0.mReusableIntPair;
        r12 = r12 - r33[0];
        r22 = r22 - r33[1];
    L12:
        if (r0.getOverScrollMode() == 2) goto L15;
        r0.considerReleasingGlowsOnScroll(r12, r22);
    L15:
        if (r0.mAdapter == null) goto L30;
        int[] r34 = r0.mReusableIntPair;
        r34[0] = 0;
        r34[1] = 0;
        r0.scrollStep(r12, r22, r34);
        int[] r35 = r0.mReusableIntPair;
        int r42 = r35[0];
        int r36 = r35[1];
        int r13 = r12 - r42;
        int r23 = r22 - r36;
        AbstractC1164m r5 = r0.mLayout.mSmoothScroller;
        if (r5 != null) goto L19;
    L29:
        int r37 = r13;
        int r14 = r42;
        int r43 = r23;
        int r24 = r36;
    L32:
        if (r0.mItemDecorations.isEmpty() == true) goto L34;
        r0.invalidate();
    L34:
        int[] r7 = r0.mReusableIntPair;
        r7[0] = 0;
        r7[1] = 0;
        r0.dispatchNestedScroll(r14, r24, r37, r43, null, 1, r7);
        int[] r52 = r0.mReusableIntPair;
        int r38 = r37 - r52[0];
        int r44 = r43 - r52[1];
        if (r14 != 0) goto L37;
        if (r24 != 0) goto L37;
    L39:
        if (RecyclerView.access$200(r0) == true) goto L42;
        r0.invalidate();
    L42:
        if (r10.getCurrX() != r10.getFinalX()) goto L44;
        boolean r53 = true;
    L46:
        if (r10.getCurrY() != r10.getFinalY()) goto L48;
        boolean r6 = true;
    L50:
        if (r10.isFinished() == true) goto L57;
        if (r53 == true) goto L53;
        if (r38 != 0) goto L53;
    L56:
        boolean r54 = false;
    L58:
        AbstractC1164m r62 = r0.mLayout.mSmoothScroller;
        if (r62 != null) goto L61;
    L63:
        if (r54 == true) goto L65;
    L84:
        m2272b();
        RunnableC1155d r39 = r0.mGapWorker;
        if (r39 == null) goto L87;
        r39.m2242a(r0, r14, r24);
        goto L87
    L65:
        if (r0.getOverScrollMode() == 2) goto L79;
        int r15 = (int) r10.getCurrVelocity();
        if (r38 >= 0) goto L69;
        int r25 = -r15;
    L72:
        if (r44 >= 0) goto L74;
        r15 = -r15;
    L77:
        r0.absorbGlows(r25, r15);
        goto L79
    L74:
        if (r44 > 0) goto L77;
        r15 = 0;
        goto L77
    L69:
        if (r38 <= 0) goto L71;
        r25 = r15;
        goto L72
    L71:
        r25 = 0;
    L79:
        if (RecyclerView.ALLOW_THREAD_GAP_WORK == false) goto L87;
        C1154c r16 = r0.mPrefetchRegistry;
        int[] r26 = r16.f4022c;
        if (r26 == null) goto L83;
        Arrays.fill(r26, -1);
    L83:
        r16.f4023d = 0;
        goto L87
    L61:
        if (r62.isPendingInitialRun() == false) goto L63;
    L53:
        if (r6 == true) goto L57;
        if (r44 == 0) goto L56;
    L57:
        r54 = true;
        goto L58
    L48:
        r6 = false;
        goto L50
    L44:
        r53 = false;
    L37:
        r0.dispatchOnScrolled(r14, r24);
        goto L39
    L19:
        if (r5.isPendingInitialRun() == true) goto L29;
        if (r5.isRunning() == false) goto L29;
        int r63 = r0.mState.m58b();
        if (r63 != 0) goto L26;
        r5.stop();
        goto L29
    L26:
        if (r5.getTargetPosition() < r63) goto L28;
        r5.setTargetPosition(r63 - 1);
        r5.onAnimation(r42, r36);
        goto L29
    L28:
        r5.onAnimation(r42, r36);
        goto L29
    L30:
        r37 = r12;
        r43 = r22;
        r14 = 0;
        r24 = 0;
    L87:
        AbstractC1164m r17 = r0.mLayout.mSmoothScroller;
        if (r17 != null) goto L90;
    L92:
        this.f4058e = false;
        if (this.f4059f == false) goto L96;
        r0.removeCallbacks(this);
        WeakHashMap r18 = AbstractC2185lE.f7617a;
        r0.postOnAnimation(this);
        return;
    L96:
        r0.setScrollState(0);
        r0.stopNestedScroll(1);
        return;
    L90:
        if (r17.isPendingInitialRun() == false) goto L92;
        r17.onAnimation(0, 0);
        goto L92
    }
}
