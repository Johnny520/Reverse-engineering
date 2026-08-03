package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import p000.AbstractC1293cr;
import p000.AbstractC2374ph;
import p000.AbstractC2730xt;
import p000.C0038Av;
import p000.C1509ho;
import p000.C1552io;
import p000.C2110jo;
import p000.C2154ko;
import p000.C2201lo;
import p000.C2388pv;
import p000.C2431qv;
import p000.InterfaceC2337ov;
import p000.InterfaceC2818zv;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC1160i implements InterfaceC2818zv {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C1509ho mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C1552io mLayoutChunkResult;
    private C2110jo mLayoutState;
    int mOrientation;
    AbstractC2730xt mOrientationHelper;
    C2154ko mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    public LinearLayoutManager(int r3) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1509ho();
        this.mLayoutChunkResult = new C1552io();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(r3);
        setReverseLayout(false);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String r2) {
        if (this.mPendingSavedState != null) goto L6;
        super.assertNotInLayoutOrScroll(r2);
        return;
    }

    public void calculateExtraLayoutSpace(C0038Av r4, int[] r5) {
        int r42 = getExtraLayoutSpace(r4);
        if (this.mLayoutState.f7417f != (-1)) goto L5;
        int r0 = 0;
    L6:
        r5[0] = r42;
        r5[1] = r0;
        return;
    L5:
        r0 = r42;
        r42 = 0;
        goto L6
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public boolean canScrollHorizontally() {
        if (this.mOrientation != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public boolean canScrollVertically() {
        if (this.mOrientation != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int r2, int r3, C0038Av r4, InterfaceC2337ov r5) {
        if (this.mOrientation == 0) goto L7;
        r2 = r3;
    L7:
        if (getChildCount() == 0) goto L16;
        if (r2 == 0) goto L17;
        ensureLayoutState();
        if (r2 <= 0) goto L13;
        int r0 = 1;
    L14:
        m2188o(r0, Math.abs(r2), true, r4);
        collectPrefetchPositionsForLayoutState(r4, this.mLayoutState, r5);
        return;
    L13:
        r0 = -1;
        goto L14
    L17:
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int r6, InterfaceC2337ov r7) {
        C2154ko r0 = this.mPendingSavedState;
        int r1 = -1;
        if (r0 == null) goto L7;
        int r3 = r0.f7531a;
        if (r3 < 0) goto L7;
        boolean r02 = r0.f7533c;
    L12:
        if (r02 == true) goto L15;
        r1 = 1;
    L15:
        int r03 = 0;
    L17:
        if (r03 >= this.mInitialPrefetchItemCount) goto L21;
        if (r3 < 0) goto L25;
        if (r3 >= r6) goto L26;
        ((C1154c) r7).m2239a(r3, 0);
        r3 = r3 + r1;
        r03 = r03 + 1;
        goto L17
    L26:
        return;
    L25:
        return;
    L21:
        return;
    L7:
        m2187n();
        r02 = this.mShouldReverseLayout;
        r3 = this.mPendingScrollPosition;
        if (r3 != (-1)) goto L12;
        if (r02 == false) goto L11;
        r3 = r6 - 1;
        goto L12
    L11:
        r3 = 0;
        goto L12
    }

    public void collectPrefetchPositionsForLayoutState(C0038Av r2, C2110jo r3, InterfaceC2337ov r4) {
        int r0 = r3.f7415d;
        if (r0 >= 0) goto L5;
        return;
    L5:
        if (r0 >= r2.m58b()) goto L9;
        C1154c r42 = (C1154c) r4;
        r42.m2239a(r0, Math.max(0, r3.f7418g));
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(C0038Av r1) {
        return m2177d(r1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(C0038Av r1) {
        return m2178e(r1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(C0038Av r1) {
        return m2179f(r1);
    }

    @Override // p000.InterfaceC2818zv
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int r4) {
        if (getChildCount() != 0) goto L6;
        return null;
    L6:
        boolean r0 = false;
        int r2 = 1;
        if (r4 >= getPosition(getChildAt(0))) goto L10;
        r0 = true;
    L10:
        if (r0 == this.mShouldReverseLayout) goto L13;
        r2 = -1;
    L13:
        if (this.mOrientation != 0) goto L17;
        return new PointF(r2, 0.0f);
    L17:
        return new PointF(0.0f, r2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(C0038Av r1) {
        return m2177d(r1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(C0038Av r1) {
        return m2178e(r1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(C0038Av r1) {
        return m2179f(r1);
    }

    public int convertFocusDirectionToLayoutDirection(int r5) {
        if (r5 == 1) goto L39;
        if (r5 == 2) goto L32;
        if (r5 == 17) goto L28;
        if (r5 == 33) goto L24;
        if (r5 == 66) goto L20;
        if (r5 == 130) goto L16;
        return Integer.MIN_VALUE;
    L16:
        if (this.mOrientation != 1) goto L18;
        return 1;
    L18:
        return Integer.MIN_VALUE;
    L20:
        if (this.mOrientation != 0) goto L22;
        return 1;
    L22:
        return Integer.MIN_VALUE;
    L24:
        if (this.mOrientation != 1) goto L26;
        return -1;
    L26:
        return Integer.MIN_VALUE;
    L28:
        if (this.mOrientation != 0) goto L30;
        return -1;
    L30:
        return Integer.MIN_VALUE;
    L32:
        if (this.mOrientation != 1) goto L35;
        return 1;
    L35:
        if (isLayoutRTL() == false) goto L37;
        return -1;
    L37:
        return 1;
    L39:
        if (this.mOrientation != 1) goto L42;
        return -1;
    L42:
        if (isLayoutRTL() == false) goto L44;
        return 1;
    L44:
        return -1;
    }

    public C2110jo createLayoutState() {
        C2110jo r0 = new C2110jo();
        r0.f7412a = true;
        r0.f7419h = 0;
        r0.f7420i = 0;
        r0.f7422k = null;
        return r0;
    }

    /* JADX INFO: renamed from: d */
    public final int m2177d(C0038Av r7) {
        if (getChildCount() != 0) goto L6;
        return 0;
    L6:
        ensureLayoutState();
        return AbstractC1293cr.m2552m(r7, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX INFO: renamed from: e */
    public final int m2178e(C0038Av r8) {
        if (getChildCount() != 0) goto L6;
        return 0;
    L6:
        ensureLayoutState();
        return AbstractC1293cr.m2553n(r8, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState != null) goto L6;
        this.mLayoutState = createLayoutState();
        return;
    }

    /* JADX INFO: renamed from: f */
    public final int m2179f(C0038Av r7) {
        if (getChildCount() != 0) goto L6;
        return 0;
    L6:
        ensureLayoutState();
        return AbstractC1293cr.m2554o(r7, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(C1161j r8, C2110jo r9, C0038Av r10, boolean r11) {
        int r0 = r9.f7414c;
        int r1 = r9.f7418g;
        if (r1 == Integer.MIN_VALUE) goto L7;
        if (r0 >= 0) goto L6;
        r9.f7418g = r1 + r0;
    L6:
        m2185l(r8, r9);
    L7:
        int r12 = r9.f7414c + r9.f7419h;
        C1552io r3 = this.mLayoutChunkResult;
    L9:
        if (r9.f7423l == true) goto L11;
        if (r12 > 0) goto L11;
    L35:
        return r0 - r9.f7414c;
    L11:
        int r4 = r9.f7415d;
        if (r4 < 0) goto L35;
        if (r4 >= r10.m58b()) goto L35;
        r3.f5511a = 0;
        r3.f5512b = false;
        r3.f5513c = false;
        r3.f5514d = false;
        layoutChunk(r8, r10, r9, r3);
        if (r3.f5512b == true) goto L35;
        int r42 = r9.f7413b;
        int r5 = r3.f5511a;
        r9.f7413b = (r9.f7417f * r5) + r42;
        if (r3.f5513c == true) goto L21;
    L24:
        r9.f7414c -= r5;
        r12 = r12 - r5;
    L25:
        int r43 = r9.f7418g;
        if (r43 == Integer.MIN_VALUE) goto L31;
        int r44 = r43 + r5;
        r9.f7418g = r44;
        int r52 = r9.f7414c;
        if (r52 >= 0) goto L30;
        r9.f7418g = r44 + r52;
    L30:
        m2185l(r8, r9);
    L31:
        if (r11 == false) goto L9;
        if (r3.f5514d == false) goto L9;
    L21:
        if (r9.f7422k != null) goto L24;
        if (r10.f82g == true) goto L25;
        goto L24
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View r0 = findOneVisibleChild(0, getChildCount(), true, false);
        if (r0 != null) goto L7;
        return -1;
    L7:
        return getPosition(r0);
    }

    public View findFirstVisibleChildClosestToEnd(boolean r3, boolean r4) {
        if (this.mShouldReverseLayout == false) goto L7;
        return findOneVisibleChild(0, getChildCount(), r3, r4);
    L7:
        return findOneVisibleChild(getChildCount() - 1, -1, r3, r4);
    }

    public View findFirstVisibleChildClosestToStart(boolean r3, boolean r4) {
        if (this.mShouldReverseLayout == false) goto L7;
        return findOneVisibleChild(getChildCount() - 1, -1, r3, r4);
    L7:
        return findOneVisibleChild(0, getChildCount(), r3, r4);
    }

    public int findFirstVisibleItemPosition() {
        View r0 = findOneVisibleChild(0, getChildCount(), false, true);
        if (r0 != null) goto L7;
        return -1;
    L7:
        return getPosition(r0);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View r0 = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (r0 != null) goto L6;
        return -1;
    L6:
        return getPosition(r0);
    }

    public int findLastVisibleItemPosition() {
        View r0 = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (r0 != null) goto L6;
        return -1;
    L6:
        return getPosition(r0);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int r4, int r5) {
        ensureLayoutState();
        if (r5 > r4) goto L7;
        if (r5 < r4) goto L7;
        return getChildAt(r4);
    L7:
        if (this.mOrientationHelper.mo5254e(getChildAt(r4)) >= this.mOrientationHelper.mo5260k()) goto L9;
        int r0 = 16644;
        int r1 = 16388;
    L11:
        if (this.mOrientation != 0) goto L15;
        return this.mHorizontalBoundCheck.m1995a(r4, r5, r0, r1);
    L15:
        return this.mVerticalBoundCheck.m1995a(r4, r5, r0, r1);
    L9:
        r0 = 4161;
        r1 = 4097;
        goto L11
    }

    public View findOneVisibleChild(int r2, int r3, boolean r4, boolean r5) {
        ensureLayoutState();
        int r0 = 320;
        if (r4 == false) goto L5;
        int r42 = 24579;
    L6:
        if (r5 == true) goto L10;
        r0 = 0;
    L10:
        if (this.mOrientation != 0) goto L14;
        return this.mHorizontalBoundCheck.m1995a(r2, r3, r42, r0);
    L14:
        return this.mVerticalBoundCheck.m1995a(r2, r3, r42, r0);
    L5:
        r42 = 320;
        goto L6
    }

    public View findReferenceChild(C1161j r17, C0038Av r18, boolean r19, boolean r20) {
        ensureLayoutState();
        int r1 = getChildCount();
        if (r20 == false) goto L5;
        int r12 = getChildCount() - 1;
        int r4 = -1;
        int r5 = -1;
    L6:
        int r6 = r18.m58b();
        int r7 = this.mOrientationHelper.mo5260k();
        int r8 = this.mOrientationHelper.mo5256g();
        View r9 = null;
        View r10 = null;
        View r11 = null;
    L7:
        if (r12 == r4) goto L37;
        View r122 = getChildAt(r12);
        int r13 = getPosition(r122);
        int r14 = this.mOrientationHelper.mo5254e(r122);
        int r15 = this.mOrientationHelper.mo5251b(r122);
        if (r13 < 0) goto L36;
        if (r13 >= r6) goto L36;
        if (((C2431qv) r122.getLayoutParams()).f8526a.isRemoved() == false) goto L15;
        if (r11 != null) goto L36;
        r11 = r122;
        goto L36
    L15:
        if (r15 > r7) goto L18;
        if (r14 >= r7) goto L18;
        boolean r132 = true;
    L19:
        if (r14 < r8) goto L22;
        if (r15 <= r8) goto L22;
        boolean r142 = true;
    L23:
        if (r132 == true) goto L27;
        if (r142 == true) goto L27;
        return r122;
    L27:
        if (r19 == false) goto L32;
        if (r142 == true) goto L33;
        if (r9 != null) goto L36;
    L35:
        r9 = r122;
    L33:
        r10 = r122;
        goto L36
    L32:
        if (r132 == true) goto L33;
        if (r9 != null) goto L36;
    L22:
        r142 = false;
    L18:
        r132 = false;
    L36:
        r12 = r12 + r5;
        goto L7
    L37:
        if (r9 == null) goto L39;
        return r9;
    L39:
        if (r10 == null) goto L41;
        return r10;
    L41:
        return r11;
    L5:
        r4 = r1;
        r12 = 0;
        r5 = 1;
        goto L6
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int r3) {
        int r0 = getChildCount();
        if (r0 != 0) goto L6;
        return null;
    L6:
        int r1 = r3 - getPosition(getChildAt(0));
        if (r1 < 0) goto L13;
        if (r1 >= r0) goto L13;
        View r02 = getChildAt(r1);
        if (getPosition(r02) != r3) goto L13;
        return r02;
    L13:
        return super.findViewByPosition(r3);
    }

    /* JADX INFO: renamed from: g */
    public final int m2180g(int r2, C1161j r3, C0038Av r4, boolean r5) {
        int r0 = this.mOrientationHelper.mo5256g() - r2;
        if (r0 <= 0) goto L11;
        int r32 = -scrollBy(-r0, r3, r4);
        int r22 = r2 + r32;
        if (r5 == false) goto L10;
        int r42 = this.mOrientationHelper.mo5256g() - r22;
        if (r42 <= 0) goto L10;
        this.mOrientationHelper.mo5264o(r42);
        return r42 + r32;
    L10:
        return r32;
    L11:
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public C2431qv generateDefaultLayoutParams() {
        return new C2431qv(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(C0038Av r2) {
        if (r2.f76a != (-1)) goto L5;
        return 0;
    L5:
        return this.mOrientationHelper.mo5261l();
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    /* JADX INFO: renamed from: h */
    public final int m2181h(int r2, C1161j r3, C0038Av r4, boolean r5) {
        int r0 = r2 - this.mOrientationHelper.mo5260k();
        if (r0 <= 0) goto L10;
        int r32 = -scrollBy(r0, r3, r4);
        int r22 = r2 + r32;
        if (r5 == false) goto L12;
        int r23 = r22 - this.mOrientationHelper.mo5260k();
        if (r23 <= 0) goto L13;
        this.mOrientationHelper.mo5264o(-r23);
        return r32 - r23;
    L13:
        return r32;
    L12:
        return r32;
    L10:
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final View m2182i() {
        if (this.mShouldReverseLayout == false) goto L5;
        int r0 = 0;
    L7:
        return getChildAt(r0);
    L5:
        r0 = getChildCount() - 1;
        goto L7
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        if (getLayoutDirection() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* JADX INFO: renamed from: j */
    public final View m2183j() {
        if (this.mShouldReverseLayout == false) goto L5;
        int r0 = getChildCount() - 1;
    L7:
        return getChildAt(r0);
    L5:
        r0 = 0;
        goto L7
    }

    /* JADX INFO: renamed from: k */
    public final void m2184k() {
        int r0 = 0;
    L4:
        if (r0 >= getChildCount()) goto L6;
        View r1 = getChildAt(r0);
        getPosition(r1);
        this.mOrientationHelper.mo5254e(r1);
        r0 = r0 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: l */
    public final void m2185l(C1161j r6, C2110jo r7) {
        if (r7.f7412a == true) goto L5;
        return;
    L5:
        if (r7.f7423l == true) goto L71;
        int r0 = r7.f7418g;
        int r1 = r7.f7420i;
        if (r7.f7417f != (-1)) goto L34;
        int r72 = getChildCount();
        if (r0 < 0) goto L72;
        int r3 = (this.mOrientationHelper.mo5255f() - r0) + r1;
        if (this.mShouldReverseLayout == false) goto L24;
        int r02 = 0;
    L15:
        if (r02 >= r72) goto L74;
        View r12 = getChildAt(r02);
        if (this.mOrientationHelper.mo5254e(r12) < r3) goto L22;
        if (this.mOrientationHelper.mo5263n(r12) < r3) goto L22;
        r02 = r02 + 1;
    L22:
        m2186m(r6, 0, r02);
        return;
    L74:
        return;
    L24:
        int r73 = r72 - 1;
        int r03 = r73;
    L25:
        if (r03 < 0) goto L75;
        View r13 = getChildAt(r03);
        if (this.mOrientationHelper.mo5254e(r13) < r3) goto L32;
        if (this.mOrientationHelper.mo5263n(r13) < r3) goto L32;
        r03 = r03 - 1;
    L32:
        m2186m(r6, r73, r03);
        return;
    L75:
        return;
    L72:
        return;
    L34:
        if (r0 < 0) goto L73;
        int r04 = r0 - r1;
        int r74 = getChildCount();
        if (this.mShouldReverseLayout == false) goto L48;
        int r75 = r74 - 1;
        int r14 = r75;
    L39:
        if (r14 < 0) goto L76;
        View r2 = getChildAt(r14);
        if (this.mOrientationHelper.mo5251b(r2) > r04) goto L46;
        if (this.mOrientationHelper.mo5262m(r2) > r04) goto L46;
        r14 = r14 - 1;
    L46:
        m2186m(r6, r75, r14);
        return;
    L76:
        return;
    L48:
        int r15 = 0;
    L49:
        if (r15 >= r74) goto L77;
        View r32 = getChildAt(r15);
        if (this.mOrientationHelper.mo5251b(r32) > r04) goto L56;
        if (this.mOrientationHelper.mo5262m(r32) > r04) goto L56;
        r15 = r15 + 1;
    L56:
        m2186m(r6, 0, r15);
        return;
    L77:
        return;
    L73:
        return;
    }

    public void layoutChunk(C1161j r7, C0038Av r8, C2110jo r9, C1552io r10) {
        View r1 = r9.m4299b(r7);
        if (r1 != null) goto L6;
        r10.f5512b = true;
        return;
    L6:
        C2431qv r82 = (C2431qv) r1.getLayoutParams();
        if (r9.f7422k != null) goto L15;
        boolean r0 = this.mShouldReverseLayout;
        if (r9.f7417f != (-1)) goto L11;
        boolean r4 = true;
    L12:
        if (r0 != r4) goto L14;
        addView(r1);
    L22:
        measureChildWithMargins(r1, 0, 0);
        r10.f5511a = this.mOrientationHelper.mo5252c(r1);
        if (this.mOrientation == 1) goto L25;
        int r02 = getPaddingTop();
        int r3 = this.mOrientationHelper.mo5253d(r1) + r02;
        if (r9.f7417f != (-1)) goto L38;
        int r92 = r9.f7413b;
        int r2 = r92 - r10.f5511a;
        int r42 = r92;
        int r5 = r3;
    L37:
        int r32 = r02;
    L39:
        layoutDecoratedWithMargins(r1, r2, r32, r42, r5);
        if (r82.f8526a.isRemoved() == false) goto L42;
    L43:
        r10.f5513c = true;
    L44:
        r10.f5514d = r1.hasFocusable();
        return;
    L42:
        if (r82.f8526a.isUpdated() == false) goto L44;
    L38:
        int r93 = r9.f7413b;
        r42 = r10.f5511a + r93;
        r5 = r3;
        r2 = r93;
        goto L37
    L25:
        if (isLayoutRTL() == false) goto L27;
        int r03 = getWidth() - getPaddingRight();
        int r33 = r03 - this.mOrientationHelper.mo5253d(r1);
    L29:
        if (r9.f7417f != (-1)) goto L33;
        int r94 = r9.f7413b;
        int r22 = r94 - r10.f5511a;
    L31:
        int r43 = r33;
        r32 = r22;
        r2 = r43;
        r5 = r94;
        r42 = r03;
        goto L39
    L33:
        r22 = r9.f7413b;
        r94 = r10.f5511a + r22;
        goto L31
    L27:
        r33 = getPaddingLeft();
        r03 = this.mOrientationHelper.mo5253d(r1) + r33;
        goto L29
    L14:
        addView(r1, 0);
        goto L22
    L11:
        r4 = false;
        goto L12
    L15:
        boolean r04 = this.mShouldReverseLayout;
        if (r9.f7417f != (-1)) goto L18;
        boolean r44 = true;
    L19:
        if (r04 != r44) goto L21;
        addDisappearingView(r1);
        goto L22
    L21:
        addDisappearingView(r1, 0);
        goto L22
    L18:
        r44 = false;
        goto L19
    }

    /* JADX INFO: renamed from: m */
    public final void m2186m(C1161j r1, int r2, int r3) {
        if (r2 == r3) goto L10;
        if (r3 <= r2) goto L8;
        int r32 = r3 - 1;
    L6:
        if (r32 < r2) goto L13;
        removeAndRecycleViewAt(r32, r1);
        r32 = r32 - 1;
        goto L6
    L13:
        return;
    L8:
        if (r2 <= r3) goto L14;
        removeAndRecycleViewAt(r2, r1);
        r2 = r2 - 1;
        goto L8
    L14:
        return;
    }

    /* JADX INFO: renamed from: n */
    public final void m2187n() {
        if (this.mOrientation != 1) goto L5;
    L9:
        this.mShouldReverseLayout = this.mReverseLayout;
        return;
    L5:
        if (isLayoutRTL() == false) goto L9;
        this.mShouldReverseLayout = !this.mReverseLayout;
    }

    /* JADX INFO: renamed from: o */
    public final void m2188o(int r5, int r6, boolean r7, C0038Av r8) {
        this.mLayoutState.f7423l = resolveIsInfinite();
        this.mLayoutState.f7417f = r5;
        int[] r0 = this.mReusableIntPair;
        boolean r1 = false;
        r0[0] = 0;
        int r2 = 1;
        r0[1] = 0;
        calculateExtraLayoutSpace(r8, r0);
        int r82 = Math.max(0, this.mReusableIntPair[0]);
        int r02 = Math.max(0, this.mReusableIntPair[1]);
        if (r5 != 1) goto L5;
        r1 = true;
    L5:
        C2110jo r52 = this.mLayoutState;
        if (r1 == false) goto L8;
        int r3 = r02;
    L9:
        r52.f7419h = r3;
        if (r1 == true) goto L13;
        r82 = r02;
    L13:
        r52.f7420i = r82;
        if (r1 == false) goto L19;
        r52.f7419h = this.mOrientationHelper.mo5257h() + r3;
        View r53 = m2182i();
        C2110jo r03 = this.mLayoutState;
        if (this.mShouldReverseLayout == false) goto L18;
        r2 = -1;
    L18:
        r03.f7416e = r2;
        int r83 = getPosition(r53);
        C2110jo r12 = this.mLayoutState;
        r03.f7415d = r83 + r12.f7416e;
        r12.f7413b = this.mOrientationHelper.mo5251b(r53);
        int r54 = this.mOrientationHelper.mo5251b(r53) - this.mOrientationHelper.mo5256g();
    L24:
        C2110jo r84 = this.mLayoutState;
        r84.f7414c = r6;
        if (r7 == false) goto L27;
        r84.f7414c = r6 - r54;
    L27:
        r84.f7418g = r54;
        return;
    L19:
        View r55 = m2183j();
        C2110jo r04 = this.mLayoutState;
        r04.f7419h = this.mOrientationHelper.mo5260k() + r04.f7419h;
        C2110jo r05 = this.mLayoutState;
        if (this.mShouldReverseLayout == true) goto L23;
        r2 = -1;
    L23:
        r05.f7416e = r2;
        int r85 = getPosition(r55);
        C2110jo r13 = this.mLayoutState;
        r05.f7415d = r85 + r13.f7416e;
        r13.f7413b = this.mOrientationHelper.mo5254e(r55);
        r54 = (-this.mOrientationHelper.mo5254e(r55)) + this.mOrientationHelper.mo5260k();
        goto L24
    L8:
        r3 = r82;
        goto L9
    }

    public void onAnchorReady(C1161j r1, C0038Av r2, C1509ho r3, int r4) {
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView r1, C1161j r2) {
        onDetachedFromWindow(r1);
        if (this.mRecycleChildrenOnDetach == false) goto L6;
        removeAndRecycleAllViews(r2);
        r2.f4039a.clear();
        r2.m2261h();
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View r3, int r4, C1161j r5, C0038Av r6) {
        m2187n();
        if (getChildCount() == 0) goto L24;
        int r32 = convertFocusDirectionToLayoutDirection(r4);
        if (r32 == Integer.MIN_VALUE) goto L24;
        ensureLayoutState();
        m2188o(r32, (int) (this.mOrientationHelper.mo5261l() * MAX_SCROLL_FACTOR), false, r6);
        C2110jo r0 = this.mLayoutState;
        r0.f7418g = Integer.MIN_VALUE;
        r0.f7412a = false;
        fill(r5, r0, r6, true);
        if (r32 != (-1)) goto L15;
        if (this.mShouldReverseLayout == false) goto L13;
        View r42 = findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    L18:
        if (r32 != (-1)) goto L20;
        View r33 = m2183j();
    L22:
        if (r33.hasFocusable() == false) goto L26;
        if (r42 == null) goto L24;
        return r33;
    L26:
        return r42;
    L20:
        r33 = m2182i();
        goto L22
    L13:
        r42 = findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
        goto L18
    L15:
        if (this.mShouldReverseLayout == false) goto L17;
        r42 = findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
        goto L18
    L17:
        r42 = findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    L24:
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        if (getChildCount() <= 0) goto L6;
        r2.setFromIndex(findFirstVisibleItemPosition());
        r2.setToIndex(findLastVisibleItemPosition());
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void onLayoutChildren(C1161j r14, C0038Av r15) {
        int r1 = -1;
        if (this.mPendingSavedState != null) goto L7;
        if (this.mPendingScrollPosition != (-1)) goto L7;
    L10:
        C2154ko r0 = this.mPendingSavedState;
        if (r0 == null) goto L15;
        int r02 = r0.f7531a;
        if (r02 < 0) goto L15;
        this.mPendingScrollPosition = r02;
    L15:
        ensureLayoutState();
        this.mLayoutState.f7412a = false;
        m2187n();
        View r03 = getFocusedChild();
        C1509ho r3 = this.mAnchorInfo;
        if (r3.f5350e == true) goto L18;
    L28:
        r3.m2885d();
        C1509ho r04 = this.mAnchorInfo;
        r04.f5349d = this.mShouldReverseLayout ^ this.mStackFromEnd;
        if (r15.f82g == true) goto L85;
        int r32 = this.mPendingScrollPosition;
        if (r32 == (-1)) goto L85;
        if (r32 >= 0) goto L35;
    L83:
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        goto L85
    L35:
        if (r32 >= r15.m58b()) goto L83;
        int r33 = this.mPendingScrollPosition;
        r04.f5347b = r33;
        C2154ko r4 = this.mPendingSavedState;
        if (r4 == null) goto L46;
        if (r4.f7531a < 0) goto L46;
        boolean r34 = r4.f7533c;
        r04.f5349d = r34;
        if (r34 == false) goto L44;
        r04.f5348c = this.mOrientationHelper.mo5256g() - this.mPendingSavedState.f7532b;
    L125:
        this.mAnchorInfo.f5350e = true;
    L126:
        C2110jo r05 = this.mLayoutState;
        if (r05.f7421j < 0) goto L129;
        int r35 = 1;
    L130:
        r05.f7417f = r35;
        int[] r06 = this.mReusableIntPair;
        r06[0] = 0;
        r06[1] = 0;
        calculateExtraLayoutSpace(r15, r06);
        int r36 = this.mOrientationHelper.mo5260k() + Math.max(0, this.mReusableIntPair[0]);
        int r42 = this.mOrientationHelper.mo5257h() + Math.max(0, this.mReusableIntPair[1]);
        if (r15.f82g == false) goto L146;
        int r07 = this.mPendingScrollPosition;
        if (r07 == (-1)) goto L146;
        if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) goto L146;
        View r08 = findViewByPosition(r07);
        if (r08 == null) goto L146;
        if (this.mShouldReverseLayout == false) goto L142;
        int r5 = this.mOrientationHelper.mo5256g() - this.mOrientationHelper.mo5251b(r08);
        int r09 = this.mPendingScrollPositionOffset;
    L141:
        int r52 = r5 - r09;
        if (r52 <= 0) goto L145;
        r36 = r36 + r52;
        goto L146
    L145:
        r42 = r42 - r52;
        goto L146
    L142:
        r09 = this.mOrientationHelper.mo5254e(r08) - this.mOrientationHelper.mo5260k();
        r5 = this.mPendingScrollPositionOffset;
    L146:
        C1509ho r010 = this.mAnchorInfo;
        if (r010.f5349d == false) goto L152;
        if (this.mShouldReverseLayout == false) goto L153;
    L150:
        r1 = 1;
    L153:
        onAnchorReady(r14, r15, r010, r1);
        detachAndScrapAttachedViews(r14);
        this.mLayoutState.f7423l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f7420i = 0;
        C1509ho r011 = this.mAnchorInfo;
        if (r011.f5349d == false) goto L161;
        m2190q(r011.f5347b, r011.f5348c);
        C2110jo r012 = this.mLayoutState;
        r012.f7419h = r36;
        fill(r14, r012, r15, false);
        C2110jo r013 = this.mLayoutState;
        int r12 = r013.f7413b;
        int r37 = r013.f7415d;
        int r014 = r013.f7414c;
        if (r014 <= 0) goto L158;
        r42 = r42 + r014;
    L158:
        C1509ho r015 = this.mAnchorInfo;
        m2189p(r015.f5347b, r015.f5348c);
        C2110jo r016 = this.mLayoutState;
        r016.f7419h = r42;
        r016.f7415d += r016.f7416e;
        fill(r14, r016, r15, false);
        C2110jo r017 = this.mLayoutState;
        int r43 = r017.f7413b;
        int r018 = r017.f7414c;
        if (r018 <= 0) goto L169;
        m2190q(r37, r12);
        C2110jo r13 = this.mLayoutState;
        r13.f7419h = r018;
        fill(r14, r13, r15, false);
        r12 = this.mLayoutState.f7413b;
    L169:
        if (getChildCount() <= 0) goto L176;
        if ((this.mShouldReverseLayout ^ this.mStackFromEnd) == false) goto L174;
        int r019 = m2180g(r43, r14, r15, true);
        int r16 = r12 + r019;
        int r44 = r43 + r019;
        int r020 = m2181h(r16, r14, r15, false);
    L173:
        r12 = r16 + r020;
        r43 = r44 + r020;
        goto L176
    L174:
        int r021 = m2181h(r12, r14, r15, true);
        r16 = r12 + r021;
        r44 = r43 + r021;
        r020 = m2180g(r44, r14, r15, false);
    L176:
        if (r15.f86k == false) goto L205;
        if (getChildCount() == 0) goto L205;
        if (r15.f82g == true) goto L205;
        if (supportsPredictiveItemAnimations() == false) goto L205;
        List r022 = r14.f4042d;
        int r38 = r022.size();
        int r53 = getPosition(getChildAt(0));
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
    L185:
        if (r7 >= r38) goto L198;
        AbstractC1166o r10 = (AbstractC1166o) r022.get(r7);
        if (r10.isRemoved() == true) goto L197;
        if (r10.getLayoutPosition() >= r53) goto L192;
        boolean r11 = true;
    L194:
        if (r11 == this.mShouldReverseLayout) goto L196;
        r8 = r8 + this.mOrientationHelper.mo5252c(r10.itemView);
        goto L197
    L196:
        r9 = r9 + this.mOrientationHelper.mo5252c(r10.itemView);
        goto L197
    L192:
        r11 = false;
    L197:
        r7 = r7 + 1;
        goto L185
    L198:
        this.mLayoutState.f7422k = r022;
        if (r8 <= 0) goto L201;
        m2190q(getPosition(m2183j()), r12);
        C2110jo r17 = this.mLayoutState;
        r17.f7419h = r8;
        r17.f7414c = 0;
        r17.m4298a(null);
        fill(r14, this.mLayoutState, r15, false);
    L201:
        if (r9 <= 0) goto L203;
        m2189p(getPosition(m2182i()), r43);
        C2110jo r18 = this.mLayoutState;
        r18.f7419h = r9;
        r18.f7414c = 0;
        r18.m4298a(null);
        fill(r14, this.mLayoutState, r15, false);
    L203:
        this.mLayoutState.f7422k = null;
    L205:
        if (r15.f82g == true) goto L207;
        AbstractC2730xt r142 = this.mOrientationHelper;
        r142.f9329b = r142.mo5261l();
    L208:
        this.mLastStackFromEnd = this.mStackFromEnd;
        return;
    L207:
        this.mAnchorInfo.m2885d();
        goto L208
    L161:
        m2189p(r011.f5347b, r011.f5348c);
        C2110jo r023 = this.mLayoutState;
        r023.f7419h = r42;
        fill(r14, r023, r15, false);
        C2110jo r024 = this.mLayoutState;
        r43 = r024.f7413b;
        int r19 = r024.f7415d;
        int r025 = r024.f7414c;
        if (r025 <= 0) goto L164;
        r36 = r36 + r025;
    L164:
        C1509ho r026 = this.mAnchorInfo;
        m2190q(r026.f5347b, r026.f5348c);
        C2110jo r027 = this.mLayoutState;
        r027.f7419h = r36;
        r027.f7415d += r027.f7416e;
        fill(r14, r027, r15, false);
        C2110jo r028 = this.mLayoutState;
        int r39 = r028.f7413b;
        int r029 = r028.f7414c;
        if (r029 <= 0) goto L167;
        m2189p(r19, r43);
        C2110jo r110 = this.mLayoutState;
        r110.f7419h = r029;
        fill(r14, r110, r15, false);
        r43 = this.mLayoutState.f7413b;
    L167:
        r12 = r39;
        goto L169
    L152:
        if (this.mShouldReverseLayout == false) goto L150;
    L129:
        r35 = -1;
        goto L130
    L44:
        r04.f5348c = this.mOrientationHelper.mo5260k() + this.mPendingSavedState.f7532b;
    L46:
        if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) goto L79;
        View r310 = findViewByPosition(r33);
        if (r310 == null) goto L68;
        if (this.mOrientationHelper.mo5252c(r310) <= this.mOrientationHelper.mo5261l()) goto L53;
        r04.m2882a();
        goto L125
    L53:
        if ((this.mOrientationHelper.mo5254e(r310) - this.mOrientationHelper.mo5260k()) >= 0) goto L56;
        r04.f5348c = this.mOrientationHelper.mo5260k();
        r04.f5349d = false;
        goto L125
    L56:
        if ((this.mOrientationHelper.mo5256g() - this.mOrientationHelper.mo5251b(r310)) >= 0) goto L59;
        r04.f5348c = this.mOrientationHelper.mo5256g();
        r04.f5349d = true;
        goto L125
    L59:
        if (r04.f5349d == false) goto L65;
        int r311 = this.mOrientationHelper.mo5251b(r310);
        AbstractC2730xt r45 = this.mOrientationHelper;
        if (Integer.MIN_VALUE != r45.f9329b) goto L63;
        int r72 = 0;
    L64:
        int r73 = r72 + r311;
    L66:
        r04.f5348c = r73;
        goto L125
    L63:
        r72 = r45.mo5261l() - r45.f9329b;
        goto L64
    L65:
        r73 = this.mOrientationHelper.mo5254e(r310);
        goto L66
    L68:
        if (getChildCount() > 0) goto L70;
    L78:
        r04.m2882a();
        goto L125
    L70:
        if (this.mPendingScrollPosition >= getPosition(getChildAt(0))) goto L72;
        boolean r312 = true;
    L74:
        if (r312 != this.mShouldReverseLayout) goto L76;
        boolean r313 = true;
    L77:
        r04.f5349d = r313;
        goto L78
    L76:
        r313 = false;
        goto L77
    L72:
        r312 = false;
        goto L74
    L79:
        boolean r314 = this.mShouldReverseLayout;
        r04.f5349d = r314;
        if (r314 == false) goto L82;
        r04.f5348c = this.mOrientationHelper.mo5256g() - this.mPendingScrollPositionOffset;
        goto L125
    L82:
        r04.f5348c = this.mOrientationHelper.mo5260k() + this.mPendingScrollPositionOffset;
    L85:
        if (getChildCount() == 0) goto L120;
        View r315 = getFocusedChild();
        if (r315 == null) goto L96;
        C2431qv r46 = (C2431qv) r315.getLayoutParams();
        if (r46.f8526a.isRemoved() == true) goto L96;
        if (r46.f8526a.getLayoutPosition() < 0) goto L96;
        if (r46.f8526a.getLayoutPosition() >= r15.m58b()) goto L96;
        r04.m2884c(r315, getPosition(r315));
    L96:
        boolean r316 = this.mLastStackFromEnd;
        boolean r47 = this.mStackFromEnd;
        if (r316 != r47) goto L120;
        View r317 = findReferenceChild(r14, r15, r04.f5349d, r47);
        if (r317 == null) goto L120;
        r04.m2883b(r317, getPosition(r317));
        if (r15.f82g == true) goto L125;
        if (supportsPredictiveItemAnimations() == false) goto L125;
        int r48 = this.mOrientationHelper.mo5254e(r317);
        int r318 = this.mOrientationHelper.mo5251b(r317);
        int r74 = this.mOrientationHelper.mo5260k();
        int r82 = this.mOrientationHelper.mo5256g();
        if (r318 > r74) goto L109;
        if (r48 >= r74) goto L109;
        boolean r92 = true;
    L110:
        if (r48 < r82) goto L113;
        if (r318 <= r82) goto L113;
        boolean r319 = true;
    L114:
        if (r92 == true) goto L117;
        if (r319 == false) goto L125;
    L117:
        if (r04.f5349d == false) goto L119;
        r74 = r82;
    L119:
        r04.f5348c = r74;
    L113:
        r319 = false;
    L109:
        r92 = false;
    L120:
        r04.m2882a();
        if (this.mStackFromEnd == false) goto L123;
        int r320 = r15.m58b() - 1;
    L124:
        r04.f5347b = r320;
        goto L125
    L123:
        r320 = 0;
        goto L124
    L18:
        if (this.mPendingScrollPosition != (-1)) goto L28;
        if (this.mPendingSavedState != null) goto L28;
        if (r03 == null) goto L126;
        if (this.mOrientationHelper.mo5254e(r03) < this.mOrientationHelper.mo5256g()) goto L26;
    L27:
        this.mAnchorInfo.m2884c(r03, getPosition(r03));
        goto L126
    L26:
        if (this.mOrientationHelper.mo5251b(r03) > this.mOrientationHelper.mo5260k()) goto L126;
    L7:
        if (r15.m58b() != 0) goto L10;
        removeAndRecycleAllViews(r14);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(C0038Av r1) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m2885d();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable r3) {
        if ((r3 instanceof C2154ko) == false) goto L9;
        C2154ko r32 = (C2154ko) r3;
        this.mPendingSavedState = r32;
        if (this.mPendingScrollPosition == (-1)) goto L7;
        r32.f7531a = -1;
    L7:
        requestLayout();
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        C2154ko r0 = this.mPendingSavedState;
        if (r0 == null) goto L6;
        C2154ko r1 = new C2154ko();
        r1.f7531a = r0.f7531a;
        r1.f7532b = r0.f7532b;
        r1.f7533c = r0.f7533c;
        return r1;
    L6:
        C2154ko r02 = new C2154ko();
        if (getChildCount() <= 0) goto L14;
        ensureLayoutState();
        boolean r12 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        r02.f7533c = r12;
        if (r12 == false) goto L12;
        View r13 = m2182i();
        r02.f7532b = this.mOrientationHelper.mo5256g() - this.mOrientationHelper.mo5251b(r13);
        r02.f7531a = getPosition(r13);
        return r02;
    L12:
        View r14 = m2183j();
        r02.f7531a = getPosition(r14);
        r02.f7532b = this.mOrientationHelper.mo5254e(r14) - this.mOrientationHelper.mo5260k();
        return r02;
    L14:
        r02.f7531a = -1;
        return r02;
    }

    /* JADX INFO: renamed from: p */
    public final void m2189p(int r4, int r5) {
        this.mLayoutState.f7414c = this.mOrientationHelper.mo5256g() - r5;
        C2110jo r0 = this.mLayoutState;
        if (this.mShouldReverseLayout == false) goto L5;
        int r1 = -1;
    L6:
        r0.f7416e = r1;
        r0.f7415d = r4;
        r0.f7417f = 1;
        r0.f7413b = r5;
        r0.f7418g = Integer.MIN_VALUE;
        return;
    L5:
        r1 = 1;
        goto L6
    }

    public void prepareForDrop(View r4, View r5, int r6, int r7) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m2187n();
        int r62 = getPosition(r4);
        int r72 = getPosition(r5);
        if (r62 >= r72) goto L5;
        byte r63 = 1;
    L7:
        if (this.mShouldReverseLayout == false) goto L13;
        if (r63 != 1) goto L11;
        scrollToPositionWithOffset(r72, this.mOrientationHelper.mo5256g() - (this.mOrientationHelper.mo5252c(r4) + this.mOrientationHelper.mo5254e(r5)));
        return;
    L11:
        scrollToPositionWithOffset(r72, this.mOrientationHelper.mo5256g() - this.mOrientationHelper.mo5251b(r5));
        return;
    L13:
        if (r63 != (-1)) goto L16;
        scrollToPositionWithOffset(r72, this.mOrientationHelper.mo5254e(r5));
        return;
    L16:
        scrollToPositionWithOffset(r72, this.mOrientationHelper.mo5251b(r5) - this.mOrientationHelper.mo5252c(r4));
        return;
    L5:
        r63 = -1;
        goto L7
    }

    /* JADX INFO: renamed from: q */
    public final void m2190q(int r3, int r4) {
        this.mLayoutState.f7414c = r4 - this.mOrientationHelper.mo5260k();
        C2110jo r0 = this.mLayoutState;
        r0.f7415d = r3;
        if (this.mShouldReverseLayout == false) goto L5;
        int r32 = 1;
    L6:
        r0.f7416e = r32;
        r0.f7417f = -1;
        r0.f7413b = r4;
        r0.f7418g = Integer.MIN_VALUE;
        return;
    L5:
        r32 = -1;
        goto L6
    }

    public boolean resolveIsInfinite() {
        if (this.mOrientationHelper.mo5258i() == 0) goto L5;
        return false;
    L5:
        if (this.mOrientationHelper.mo5255f() != 0) goto L10;
        return true;
    L10:
        return false;
    }

    public int scrollBy(int r6, C1161j r7, C0038Av r8) {
        if (getChildCount() == 0) goto L17;
        if (r6 == 0) goto L17;
        ensureLayoutState();
        this.mLayoutState.f7412a = true;
        if (r6 <= 0) goto L9;
        int r0 = 1;
    L10:
        int r3 = Math.abs(r6);
        m2188o(r0, r3, true, r8);
        C2110jo r2 = this.mLayoutState;
        int r72 = fill(r7, r2, r8, false) + r2.f7418g;
        if (r72 >= 0) goto L13;
        return 0;
    L13:
        if (r3 <= r72) goto L15;
        r6 = r0 * r72;
    L15:
        this.mOrientationHelper.mo5264o(-r6);
        this.mLayoutState.f7421j = r6;
        return r6;
    L9:
        r0 = -1;
    L17:
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int r3, C1161j r4, C0038Av r5) {
        if (this.mOrientation != 1) goto L7;
        return 0;
    L7:
        return scrollBy(r3, r4, r5);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public void scrollToPosition(int r2) {
        this.mPendingScrollPosition = r2;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C2154ko r22 = this.mPendingSavedState;
        if (r22 == null) goto L5;
        r22.f7531a = -1;
    L5:
        requestLayout();
    }

    public void scrollToPositionWithOffset(int r1, int r2) {
        this.mPendingScrollPosition = r1;
        this.mPendingScrollPositionOffset = r2;
        C2154ko r12 = this.mPendingSavedState;
        if (r12 == null) goto L5;
        r12.f7531a = -1;
    L5:
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int r2, C1161j r3, C0038Av r4) {
        if (this.mOrientation != 0) goto L7;
        return 0;
    L7:
        return scrollBy(r2, r3, r4);
    }

    public void setInitialPrefetchItemCount(int r1) {
        this.mInitialPrefetchItemCount = r1;
    }

    public void setOrientation(int r3) {
        if (r3 != 0) goto L4;
    L8:
        assertNotInLayoutOrScroll(null);
        if (r3 == this.mOrientation) goto L11;
    L14:
        AbstractC2730xt r0 = AbstractC2730xt.m5296a(this, r3);
        this.mOrientationHelper = r0;
        this.mAnchorInfo.f5346a = r0;
        this.mOrientation = r3;
        requestLayout();
        return;
    L11:
        if (this.mOrientationHelper == null) goto L14;
        return;
    L4:
        if (r3 == 1) goto L8;
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r3, "invalid orientation:"));
    }

    public void setRecycleChildrenOnDetach(boolean r1) {
        this.mRecycleChildrenOnDetach = r1;
    }

    public void setReverseLayout(boolean r2) {
        assertNotInLayoutOrScroll(null);
        if (r2 != this.mReverseLayout) goto L5;
        return;
    L5:
        this.mReverseLayout = r2;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean r1) {
        this.mSmoothScrollbarEnabled = r1;
    }

    public void setStackFromEnd(boolean r2) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd != r2) goto L5;
        return;
    L5:
        this.mStackFromEnd = r2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public boolean shouldMeasureTwice() {
        if (getHeightMode() != 1073741824) goto L5;
        return false;
    L5:
        if (getWidthMode() != 1073741824) goto L7;
        return false;
    L7:
        if (hasFlexibleChildInBothOrientations() == false) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView r1, C0038Av r2, int r3) {
        C2201lo r22 = new C2201lo(r1.getContext());
        r22.setTargetPosition(r3);
        startSmoothScroll(r22);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null) goto L5;
        return false;
    L5:
        if (this.mLastStackFromEnd != this.mStackFromEnd) goto L10;
        return true;
    L10:
        return false;
    }

    public void validateChildOrder() {
        getChildCount();
        boolean r1 = true;
        if (getChildCount() < 1) goto L37;
        int r2 = getPosition(getChildAt(0));
        int r3 = this.mOrientationHelper.mo5254e(getChildAt(0));
        if (this.mShouldReverseLayout == false) goto L22;
        int r4 = 1;
    L9:
        if (r4 >= getChildCount()) goto L44;
        View r7 = getChildAt(r4);
        int r8 = getPosition(r7);
        int r72 = this.mOrientationHelper.mo5254e(r7);
        if (r8 < r2) goto L12;
        if (r72 > r3) goto L20;
        r4 = r4 + 1;
        goto L9
    L20:
        m2184k();
        throw new RuntimeException("detected invalid location");
    L12:
        m2184k();
        StringBuilder r42 = new StringBuilder("detected invalid position. loc invalid? ");
        if (r72 < r3) goto L16;
        r1 = false;
    L16:
        r42.append(r1);
        throw new RuntimeException(r42.toString());
    L44:
        return;
    L22:
        int r43 = 1;
    L24:
        if (r43 >= getChildCount()) goto L45;
        View r73 = getChildAt(r43);
        int r82 = getPosition(r73);
        int r74 = this.mOrientationHelper.mo5254e(r73);
        if (r82 < r2) goto L27;
        if (r74 < r3) goto L35;
        r43 = r43 + 1;
        goto L24
    L35:
        m2184k();
        throw new RuntimeException("detected invalid location");
    L27:
        m2184k();
        StringBuilder r44 = new StringBuilder("detected invalid position. loc invalid? ");
        if (r74 < r3) goto L31;
        r1 = false;
    L31:
        r44.append(r1);
        throw new RuntimeException(r44.toString());
    L45:
        return;
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context r3, AttributeSet r4, int r5, int r6) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1509ho();
        this.mLayoutChunkResult = new C1552io();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        C2388pv r32 = AbstractC1160i.getProperties(r3, r4, r5, r6);
        setOrientation(r32.f8388a);
        setReverseLayout(r32.f8390c);
        setStackFromEnd(r32.f8391d);
    }
}
