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

    public LinearLayoutManager(int i) {
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
        setOrientation(i);
        setReverseLayout(false);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(C0038Av c0038Av, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c0038Av);
        if (this.mLayoutState.f7417f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void collectAdjacentPrefetchPositions(int i, int i2, C0038Av c0038Av, InterfaceC2337ov interfaceC2337ov) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        ensureLayoutState();
        m2188o(i > 0 ? 1 : -1, Math.abs(i), true, c0038Av);
        collectPrefetchPositionsForLayoutState(c0038Av, this.mLayoutState, interfaceC2337ov);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void collectInitialPrefetchPositions(int i, InterfaceC2337ov interfaceC2337ov) {
        boolean z;
        int i2;
        C2154ko c2154ko = this.mPendingSavedState;
        if (c2154ko == null || (i2 = c2154ko.f7531a) < 0) {
            m2187n();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c2154ko.f7533c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((C1154c) interfaceC2337ov).m2239a(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(C0038Av c0038Av, C2110jo c2110jo, InterfaceC2337ov interfaceC2337ov) {
        int i = c2110jo.f7415d;
        if (i < 0 || i >= c0038Av.m58b()) {
            return;
        }
        ((C1154c) interfaceC2337ov).m2239a(i, Math.max(0, c2110jo.f7418g));
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollExtent(C0038Av c0038Av) {
        return m2177d(c0038Av);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollOffset(C0038Av c0038Av) {
        return m2178e(c0038Av);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeHorizontalScrollRange(C0038Av c0038Av) {
        return m2179f(c0038Av);
    }

    @Override // p000.InterfaceC2818zv
    @SuppressLint({"UnknownNullness"})
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = (i < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollExtent(C0038Av c0038Av) {
        return m2177d(c0038Av);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollOffset(C0038Av c0038Av) {
        return m2178e(c0038Av);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int computeVerticalScrollRange(C0038Av c0038Av) {
        return m2179f(c0038Av);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public C2110jo createLayoutState() {
        C2110jo c2110jo = new C2110jo();
        c2110jo.f7412a = true;
        c2110jo.f7419h = 0;
        c2110jo.f7420i = 0;
        c2110jo.f7422k = null;
        return c2110jo;
    }

    /* JADX INFO: renamed from: d */
    public final int m2177d(C0038Av c0038Av) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return AbstractC1293cr.m2552m(c0038Av, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    /* JADX INFO: renamed from: e */
    public final int m2178e(C0038Av c0038Av) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return AbstractC1293cr.m2553n(c0038Av, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m2179f(C0038Av c0038Av) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return AbstractC1293cr.m2554o(c0038Av, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(C1161j c1161j, C2110jo c2110jo, C0038Av c0038Av, boolean z) {
        int i;
        int i2 = c2110jo.f7414c;
        int i3 = c2110jo.f7418g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c2110jo.f7418g = i3 + i2;
            }
            m2185l(c1161j, c2110jo);
        }
        int i4 = c2110jo.f7414c + c2110jo.f7419h;
        C1552io c1552io = this.mLayoutChunkResult;
        while (true) {
            if ((!c2110jo.f7423l && i4 <= 0) || (i = c2110jo.f7415d) < 0 || i >= c0038Av.m58b()) {
                break;
            }
            c1552io.f5511a = 0;
            c1552io.f5512b = false;
            c1552io.f5513c = false;
            c1552io.f5514d = false;
            layoutChunk(c1161j, c0038Av, c2110jo, c1552io);
            if (!c1552io.f5512b) {
                int i5 = c2110jo.f7413b;
                int i6 = c1552io.f5511a;
                c2110jo.f7413b = (c2110jo.f7417f * i6) + i5;
                if (!c1552io.f5513c || c2110jo.f7422k != null || !c0038Av.f82g) {
                    c2110jo.f7414c -= i6;
                    i4 -= i6;
                }
                int i7 = c2110jo.f7418g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c2110jo.f7418g = i8;
                    int i9 = c2110jo.f7414c;
                    if (i9 < 0) {
                        c2110jo.f7418g = i8 + i9;
                    }
                    m2185l(c1161j, c2110jo);
                }
                if (z && c1552io.f5514d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c2110jo.f7414c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z, z2) : findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z, z2) : findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo5254e(getChildAt(i)) < this.mOrientationHelper.mo5260k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m1995a(i, i2, i3, i4) : this.mVerticalBoundCheck.m1995a(i, i2, i3, i4);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m1995a(i, i2, i3, i4) : this.mVerticalBoundCheck.m1995a(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View findReferenceChild(C1161j c1161j, C0038Av c0038Av, boolean z, boolean z2) {
        int i;
        int childCount;
        int i2;
        ensureLayoutState();
        int childCount2 = getChildCount();
        if (z2) {
            childCount = getChildCount() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = childCount2;
            childCount = 0;
            i2 = 1;
        }
        int iM58b = c0038Av.m58b();
        int iMo5260k = this.mOrientationHelper.mo5260k();
        int iMo5256g = this.mOrientationHelper.mo5256g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (childCount != i) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            int iMo5254e = this.mOrientationHelper.mo5254e(childAt);
            int iMo5251b = this.mOrientationHelper.mo5251b(childAt);
            if (position >= 0 && position < iM58b) {
                if (!((C2431qv) childAt.getLayoutParams()).f8526a.isRemoved()) {
                    boolean z3 = iMo5251b <= iMo5260k && iMo5254e < iMo5260k;
                    boolean z4 = iMo5254e >= iMo5256g && iMo5251b > iMo5256g;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (z4) {
                            view2 = childAt;
                        } else if (view == null) {
                            view = childAt;
                        }
                    } else if (!z3) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            childCount += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    /* JADX INFO: renamed from: g */
    public final int m2180g(int i, C1161j c1161j, C0038Av c0038Av, boolean z) {
        int iMo5256g;
        int iMo5256g2 = this.mOrientationHelper.mo5256g() - i;
        if (iMo5256g2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-iMo5256g2, c1161j, c0038Av);
        int i3 = i + i2;
        if (!z || (iMo5256g = this.mOrientationHelper.mo5256g() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo5264o(iMo5256g);
        return iMo5256g + i2;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public C2431qv generateDefaultLayoutParams() {
        return new C2431qv(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(C0038Av c0038Av) {
        if (c0038Av.f76a != -1) {
            return this.mOrientationHelper.mo5261l();
        }
        return 0;
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
    public final int m2181h(int i, C1161j c1161j, C0038Av c0038Av, boolean z) {
        int iMo5260k;
        int iMo5260k2 = i - this.mOrientationHelper.mo5260k();
        if (iMo5260k2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(iMo5260k2, c1161j, c0038Av);
        int i3 = i + i2;
        if (!z || (iMo5260k = i3 - this.mOrientationHelper.mo5260k()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo5264o(-iMo5260k);
        return i2 - iMo5260k;
    }

    /* JADX INFO: renamed from: i */
    public final View m2182i() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* JADX INFO: renamed from: j */
    public final View m2183j() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    /* JADX INFO: renamed from: k */
    public final void m2184k() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            getPosition(childAt);
            this.mOrientationHelper.mo5254e(childAt);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2185l(C1161j c1161j, C2110jo c2110jo) {
        if (!c2110jo.f7412a || c2110jo.f7423l) {
            return;
        }
        int i = c2110jo.f7418g;
        int i2 = c2110jo.f7420i;
        if (c2110jo.f7417f == -1) {
            int childCount = getChildCount();
            if (i < 0) {
                return;
            }
            int iMo5255f = (this.mOrientationHelper.mo5255f() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.mo5254e(childAt) < iMo5255f || this.mOrientationHelper.mo5263n(childAt) < iMo5255f) {
                        m2186m(c1161j, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.mo5254e(childAt2) < iMo5255f || this.mOrientationHelper.mo5263n(childAt2) < iMo5255f) {
                    m2186m(c1161j, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt3 = getChildAt(i7);
                if (this.mOrientationHelper.mo5251b(childAt3) > i6 || this.mOrientationHelper.mo5262m(childAt3) > i6) {
                    m2186m(c1161j, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = childCount2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View childAt4 = getChildAt(i9);
            if (this.mOrientationHelper.mo5251b(childAt4) > i6 || this.mOrientationHelper.mo5262m(childAt4) > i6) {
                m2186m(c1161j, i8, i9);
                return;
            }
        }
    }

    public void layoutChunk(C1161j c1161j, C0038Av c0038Av, C2110jo c2110jo, C1552io c1552io) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int iMo5253d;
        int i5;
        int i6;
        View viewM4299b = c2110jo.m4299b(c1161j);
        if (viewM4299b == null) {
            c1552io.f5512b = true;
            return;
        }
        C2431qv c2431qv = (C2431qv) viewM4299b.getLayoutParams();
        if (c2110jo.f7422k == null) {
            if (this.mShouldReverseLayout == (c2110jo.f7417f == -1)) {
                addView(viewM4299b);
            } else {
                addView(viewM4299b, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (c2110jo.f7417f == -1)) {
                addDisappearingView(viewM4299b);
            } else {
                addDisappearingView(viewM4299b, 0);
            }
        }
        measureChildWithMargins(viewM4299b, 0, 0);
        c1552io.f5511a = this.mOrientationHelper.mo5252c(viewM4299b);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo5253d = getWidth() - getPaddingRight();
                paddingLeft = iMo5253d - this.mOrientationHelper.mo5253d(viewM4299b);
            } else {
                paddingLeft = getPaddingLeft();
                iMo5253d = this.mOrientationHelper.mo5253d(viewM4299b) + paddingLeft;
            }
            if (c2110jo.f7417f == -1) {
                i6 = c2110jo.f7413b;
                i5 = i6 - c1552io.f5511a;
            } else {
                i5 = c2110jo.f7413b;
                i6 = c1552io.f5511a + i5;
            }
            int i7 = paddingLeft;
            i4 = i5;
            i3 = i7;
            i2 = i6;
            i = iMo5253d;
        } else {
            int paddingTop = getPaddingTop();
            int iMo5253d2 = this.mOrientationHelper.mo5253d(viewM4299b) + paddingTop;
            if (c2110jo.f7417f == -1) {
                int i8 = c2110jo.f7413b;
                i3 = i8 - c1552io.f5511a;
                i = i8;
                i2 = iMo5253d2;
            } else {
                int i9 = c2110jo.f7413b;
                i = c1552io.f5511a + i9;
                i2 = iMo5253d2;
                i3 = i9;
            }
            i4 = paddingTop;
        }
        layoutDecoratedWithMargins(viewM4299b, i3, i4, i, i2);
        if (c2431qv.f8526a.isRemoved() || c2431qv.f8526a.isUpdated()) {
            c1552io.f5513c = true;
        }
        c1552io.f5514d = viewM4299b.hasFocusable();
    }

    /* JADX INFO: renamed from: m */
    public final void m2186m(C1161j c1161j, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                removeAndRecycleViewAt(i, c1161j);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, c1161j);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2187n() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2188o(int i, int i2, boolean z, C0038Av c0038Av) {
        int iMo5260k;
        this.mLayoutState.f7423l = resolveIsInfinite();
        this.mLayoutState.f7417f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0038Av, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z2 = i == 1;
        C2110jo c2110jo = this.mLayoutState;
        int i3 = z2 ? iMax2 : iMax;
        c2110jo.f7419h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c2110jo.f7420i = iMax;
        if (z2) {
            c2110jo.f7419h = this.mOrientationHelper.mo5257h() + i3;
            View viewM2182i = m2182i();
            C2110jo c2110jo2 = this.mLayoutState;
            c2110jo2.f7416e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewM2182i);
            C2110jo c2110jo3 = this.mLayoutState;
            c2110jo2.f7415d = position + c2110jo3.f7416e;
            c2110jo3.f7413b = this.mOrientationHelper.mo5251b(viewM2182i);
            iMo5260k = this.mOrientationHelper.mo5251b(viewM2182i) - this.mOrientationHelper.mo5256g();
        } else {
            View viewM2183j = m2183j();
            C2110jo c2110jo4 = this.mLayoutState;
            c2110jo4.f7419h = this.mOrientationHelper.mo5260k() + c2110jo4.f7419h;
            C2110jo c2110jo5 = this.mLayoutState;
            c2110jo5.f7416e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewM2183j);
            C2110jo c2110jo6 = this.mLayoutState;
            c2110jo5.f7415d = position2 + c2110jo6.f7416e;
            c2110jo6.f7413b = this.mOrientationHelper.mo5254e(viewM2183j);
            iMo5260k = (-this.mOrientationHelper.mo5254e(viewM2183j)) + this.mOrientationHelper.mo5260k();
        }
        C2110jo c2110jo7 = this.mLayoutState;
        c2110jo7.f7414c = i2;
        if (z) {
            c2110jo7.f7414c = i2 - iMo5260k;
        }
        c2110jo7.f7418g = iMo5260k;
    }

    public void onAnchorReady(C1161j c1161j, C0038Av c0038Av, C1509ho c1509ho, int i) {
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void onDetachedFromWindow(RecyclerView recyclerView, C1161j c1161j) {
        onDetachedFromWindow(recyclerView);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c1161j);
            c1161j.f4039a.clear();
            c1161j.m2261h();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public View onFocusSearchFailed(View view, int i, C1161j c1161j, C0038Av c0038Av) {
        int iConvertFocusDirectionToLayoutDirection;
        m2187n();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            m2188o(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.mo5261l() * MAX_SCROLL_FACTOR), false, c0038Av);
            C2110jo c2110jo = this.mLayoutState;
            c2110jo.f7418g = Integer.MIN_VALUE;
            c2110jo.f7412a = false;
            fill(c1161j, c2110jo, c0038Av, true);
            View viewFindOnePartiallyOrCompletelyInvisibleChild = iConvertFocusDirectionToLayoutDirection == -1 ? this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            View viewM2183j = iConvertFocusDirectionToLayoutDirection == -1 ? m2183j() : m2182i();
            if (!viewM2183j.hasFocusable()) {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
            if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                return viewM2183j;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayoutChildren(C1161j c1161j, C0038Av c0038Av) {
        View viewFindReferenceChild;
        int i;
        int iMo5254e;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM2180g;
        int i6;
        View viewFindViewByPosition;
        int iMo5254e2;
        int iMo5256g;
        int i7;
        int i8 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && c0038Av.m58b() == 0) {
            removeAndRecycleAllViews(c1161j);
            return;
        }
        C2154ko c2154ko = this.mPendingSavedState;
        if (c2154ko != null && (i7 = c2154ko.f7531a) >= 0) {
            this.mPendingScrollPosition = i7;
        }
        ensureLayoutState();
        this.mLayoutState.f7412a = false;
        m2187n();
        View focusedChild = getFocusedChild();
        C1509ho c1509ho = this.mAnchorInfo;
        if (!c1509ho.f5350e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c1509ho.m2885d();
            C1509ho c1509ho2 = this.mAnchorInfo;
            c1509ho2.f5349d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            if (c0038Av.f82g || (i = this.mPendingScrollPosition) == -1) {
                if (getChildCount() != 0) {
                    View focusedChild2 = getFocusedChild();
                    if (focusedChild2 != null) {
                        C2431qv c2431qv = (C2431qv) focusedChild2.getLayoutParams();
                        if (c2431qv.f8526a.isRemoved() || c2431qv.f8526a.getLayoutPosition() < 0 || c2431qv.f8526a.getLayoutPosition() >= c0038Av.m58b()) {
                            boolean z = this.mLastStackFromEnd;
                            boolean z2 = this.mStackFromEnd;
                            if (z == z2 && (viewFindReferenceChild = findReferenceChild(c1161j, c0038Av, c1509ho2.f5349d, z2)) != null) {
                                c1509ho2.m2883b(viewFindReferenceChild, getPosition(viewFindReferenceChild));
                                if (!c0038Av.f82g && supportsPredictiveItemAnimations()) {
                                    int iMo5254e3 = this.mOrientationHelper.mo5254e(viewFindReferenceChild);
                                    int iMo5251b = this.mOrientationHelper.mo5251b(viewFindReferenceChild);
                                    int iMo5260k = this.mOrientationHelper.mo5260k();
                                    int iMo5256g2 = this.mOrientationHelper.mo5256g();
                                    boolean z3 = iMo5251b <= iMo5260k && iMo5254e3 < iMo5260k;
                                    boolean z4 = iMo5254e3 >= iMo5256g2 && iMo5251b > iMo5256g2;
                                    if (z3 || z4) {
                                        if (c1509ho2.f5349d) {
                                            iMo5260k = iMo5256g2;
                                        }
                                        c1509ho2.f5348c = iMo5260k;
                                    }
                                }
                            } else {
                                c1509ho2.m2882a();
                                c1509ho2.f5347b = this.mStackFromEnd ? c0038Av.m58b() - 1 : 0;
                            }
                        } else {
                            c1509ho2.m2884c(focusedChild2, getPosition(focusedChild2));
                        }
                        this.mAnchorInfo.f5350e = true;
                    }
                }
            } else if (i < 0 || i >= c0038Av.m58b()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
                if (getChildCount() != 0) {
                }
            } else {
                int i9 = this.mPendingScrollPosition;
                c1509ho2.f5347b = i9;
                C2154ko c2154ko2 = this.mPendingSavedState;
                if (c2154ko2 != null && c2154ko2.f7531a >= 0) {
                    boolean z5 = c2154ko2.f7533c;
                    c1509ho2.f5349d = z5;
                    if (z5) {
                        c1509ho2.f5348c = this.mOrientationHelper.mo5256g() - this.mPendingSavedState.f7532b;
                    } else {
                        c1509ho2.f5348c = this.mOrientationHelper.mo5260k() + this.mPendingSavedState.f7532b;
                    }
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition2 = findViewByPosition(i9);
                    if (viewFindViewByPosition2 == null) {
                        if (getChildCount() > 0) {
                            c1509ho2.f5349d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                        }
                        c1509ho2.m2882a();
                    } else if (this.mOrientationHelper.mo5252c(viewFindViewByPosition2) > this.mOrientationHelper.mo5261l()) {
                        c1509ho2.m2882a();
                    } else if (this.mOrientationHelper.mo5254e(viewFindViewByPosition2) - this.mOrientationHelper.mo5260k() < 0) {
                        c1509ho2.f5348c = this.mOrientationHelper.mo5260k();
                        c1509ho2.f5349d = false;
                    } else if (this.mOrientationHelper.mo5256g() - this.mOrientationHelper.mo5251b(viewFindViewByPosition2) < 0) {
                        c1509ho2.f5348c = this.mOrientationHelper.mo5256g();
                        c1509ho2.f5349d = true;
                    } else {
                        if (c1509ho2.f5349d) {
                            int iMo5251b2 = this.mOrientationHelper.mo5251b(viewFindViewByPosition2);
                            AbstractC2730xt abstractC2730xt = this.mOrientationHelper;
                            iMo5254e = (Integer.MIN_VALUE == abstractC2730xt.f9329b ? 0 : abstractC2730xt.mo5261l() - abstractC2730xt.f9329b) + iMo5251b2;
                        } else {
                            iMo5254e = this.mOrientationHelper.mo5254e(viewFindViewByPosition2);
                        }
                        c1509ho2.f5348c = iMo5254e;
                    }
                } else {
                    boolean z6 = this.mShouldReverseLayout;
                    c1509ho2.f5349d = z6;
                    if (z6) {
                        c1509ho2.f5348c = this.mOrientationHelper.mo5256g() - this.mPendingScrollPositionOffset;
                    } else {
                        c1509ho2.f5348c = this.mOrientationHelper.mo5260k() + this.mPendingScrollPositionOffset;
                    }
                }
                this.mAnchorInfo.f5350e = true;
            }
        } else if (focusedChild != null && (this.mOrientationHelper.mo5254e(focusedChild) >= this.mOrientationHelper.mo5256g() || this.mOrientationHelper.mo5251b(focusedChild) <= this.mOrientationHelper.mo5260k())) {
            this.mAnchorInfo.m2884c(focusedChild, getPosition(focusedChild));
        }
        C2110jo c2110jo = this.mLayoutState;
        c2110jo.f7417f = c2110jo.f7421j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c0038Av, iArr);
        int iMo5260k2 = this.mOrientationHelper.mo5260k() + Math.max(0, this.mReusableIntPair[0]);
        int iMo5257h = this.mOrientationHelper.mo5257h() + Math.max(0, this.mReusableIntPair[1]);
        if (c0038Av.f82g && (i6 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i6)) != null) {
            if (this.mShouldReverseLayout) {
                iMo5256g = this.mOrientationHelper.mo5256g() - this.mOrientationHelper.mo5251b(viewFindViewByPosition);
                iMo5254e2 = this.mPendingScrollPositionOffset;
            } else {
                iMo5254e2 = this.mOrientationHelper.mo5254e(viewFindViewByPosition) - this.mOrientationHelper.mo5260k();
                iMo5256g = this.mPendingScrollPositionOffset;
            }
            int i10 = iMo5256g - iMo5254e2;
            if (i10 > 0) {
                iMo5260k2 += i10;
            } else {
                iMo5257h -= i10;
            }
        }
        C1509ho c1509ho3 = this.mAnchorInfo;
        if (!c1509ho3.f5349d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i8 = 1;
        }
        onAnchorReady(c1161j, c0038Av, c1509ho3, i8);
        detachAndScrapAttachedViews(c1161j);
        this.mLayoutState.f7423l = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.f7420i = 0;
        C1509ho c1509ho4 = this.mAnchorInfo;
        if (c1509ho4.f5349d) {
            m2190q(c1509ho4.f5347b, c1509ho4.f5348c);
            C2110jo c2110jo2 = this.mLayoutState;
            c2110jo2.f7419h = iMo5260k2;
            fill(c1161j, c2110jo2, c0038Av, false);
            C2110jo c2110jo3 = this.mLayoutState;
            i3 = c2110jo3.f7413b;
            int i11 = c2110jo3.f7415d;
            int i12 = c2110jo3.f7414c;
            if (i12 > 0) {
                iMo5257h += i12;
            }
            C1509ho c1509ho5 = this.mAnchorInfo;
            m2189p(c1509ho5.f5347b, c1509ho5.f5348c);
            C2110jo c2110jo4 = this.mLayoutState;
            c2110jo4.f7419h = iMo5257h;
            c2110jo4.f7415d += c2110jo4.f7416e;
            fill(c1161j, c2110jo4, c0038Av, false);
            C2110jo c2110jo5 = this.mLayoutState;
            i2 = c2110jo5.f7413b;
            int i13 = c2110jo5.f7414c;
            if (i13 > 0) {
                m2190q(i11, i3);
                C2110jo c2110jo6 = this.mLayoutState;
                c2110jo6.f7419h = i13;
                fill(c1161j, c2110jo6, c0038Av, false);
                i3 = this.mLayoutState.f7413b;
            }
        } else {
            m2189p(c1509ho4.f5347b, c1509ho4.f5348c);
            C2110jo c2110jo7 = this.mLayoutState;
            c2110jo7.f7419h = iMo5257h;
            fill(c1161j, c2110jo7, c0038Av, false);
            C2110jo c2110jo8 = this.mLayoutState;
            i2 = c2110jo8.f7413b;
            int i14 = c2110jo8.f7415d;
            int i15 = c2110jo8.f7414c;
            if (i15 > 0) {
                iMo5260k2 += i15;
            }
            C1509ho c1509ho6 = this.mAnchorInfo;
            m2190q(c1509ho6.f5347b, c1509ho6.f5348c);
            C2110jo c2110jo9 = this.mLayoutState;
            c2110jo9.f7419h = iMo5260k2;
            c2110jo9.f7415d += c2110jo9.f7416e;
            fill(c1161j, c2110jo9, c0038Av, false);
            C2110jo c2110jo10 = this.mLayoutState;
            int i16 = c2110jo10.f7413b;
            int i17 = c2110jo10.f7414c;
            if (i17 > 0) {
                m2189p(i14, i2);
                C2110jo c2110jo11 = this.mLayoutState;
                c2110jo11.f7419h = i17;
                fill(c1161j, c2110jo11, c0038Av, false);
                i2 = this.mLayoutState.f7413b;
            }
            i3 = i16;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iM2180g2 = m2180g(i2, c1161j, c0038Av, true);
                i4 = i3 + iM2180g2;
                i5 = i2 + iM2180g2;
                iM2180g = m2181h(i4, c1161j, c0038Av, false);
            } else {
                int iM2181h = m2181h(i3, c1161j, c0038Av, true);
                i4 = i3 + iM2181h;
                i5 = i2 + iM2181h;
                iM2180g = m2180g(i5, c1161j, c0038Av, false);
            }
            i3 = i4 + iM2180g;
            i2 = i5 + iM2180g;
        }
        if (c0038Av.f86k && getChildCount() != 0 && !c0038Av.f82g && supportsPredictiveItemAnimations()) {
            List list = c1161j.f4042d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int iMo5252c = 0;
            int iMo5252c2 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                AbstractC1166o abstractC1166o = (AbstractC1166o) list.get(i18);
                if (!abstractC1166o.isRemoved()) {
                    if ((abstractC1166o.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        iMo5252c += this.mOrientationHelper.mo5252c(abstractC1166o.itemView);
                    } else {
                        iMo5252c2 += this.mOrientationHelper.mo5252c(abstractC1166o.itemView);
                    }
                }
            }
            this.mLayoutState.f7422k = list;
            if (iMo5252c > 0) {
                m2190q(getPosition(m2183j()), i3);
                C2110jo c2110jo12 = this.mLayoutState;
                c2110jo12.f7419h = iMo5252c;
                c2110jo12.f7414c = 0;
                c2110jo12.m4298a(null);
                fill(c1161j, this.mLayoutState, c0038Av, false);
            }
            if (iMo5252c2 > 0) {
                m2189p(getPosition(m2182i()), i2);
                C2110jo c2110jo13 = this.mLayoutState;
                c2110jo13.f7419h = iMo5252c2;
                c2110jo13.f7414c = 0;
                c2110jo13.m4298a(null);
                fill(c1161j, this.mLayoutState, c0038Av, false);
            }
            this.mLayoutState.f7422k = null;
        }
        if (c0038Av.f82g) {
            this.mAnchorInfo.m2885d();
        } else {
            AbstractC2730xt abstractC2730xt2 = this.mOrientationHelper;
            abstractC2730xt2.f9329b = abstractC2730xt2.mo5261l();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void onLayoutCompleted(C0038Av c0038Av) {
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m2885d();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C2154ko) {
            C2154ko c2154ko = (C2154ko) parcelable;
            this.mPendingSavedState = c2154ko;
            if (this.mPendingScrollPosition != -1) {
                c2154ko.f7531a = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public Parcelable onSaveInstanceState() {
        C2154ko c2154ko = this.mPendingSavedState;
        if (c2154ko != null) {
            C2154ko c2154ko2 = new C2154ko();
            c2154ko2.f7531a = c2154ko.f7531a;
            c2154ko2.f7532b = c2154ko.f7532b;
            c2154ko2.f7533c = c2154ko.f7533c;
            return c2154ko2;
        }
        C2154ko c2154ko3 = new C2154ko();
        if (getChildCount() <= 0) {
            c2154ko3.f7531a = -1;
            return c2154ko3;
        }
        ensureLayoutState();
        boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        c2154ko3.f7533c = z;
        if (z) {
            View viewM2182i = m2182i();
            c2154ko3.f7532b = this.mOrientationHelper.mo5256g() - this.mOrientationHelper.mo5251b(viewM2182i);
            c2154ko3.f7531a = getPosition(viewM2182i);
            return c2154ko3;
        }
        View viewM2183j = m2183j();
        c2154ko3.f7531a = getPosition(viewM2183j);
        c2154ko3.f7532b = this.mOrientationHelper.mo5254e(viewM2183j) - this.mOrientationHelper.mo5260k();
        return c2154ko3;
    }

    /* JADX INFO: renamed from: p */
    public final void m2189p(int i, int i2) {
        this.mLayoutState.f7414c = this.mOrientationHelper.mo5256g() - i2;
        C2110jo c2110jo = this.mLayoutState;
        c2110jo.f7416e = this.mShouldReverseLayout ? -1 : 1;
        c2110jo.f7415d = i;
        c2110jo.f7417f = 1;
        c2110jo.f7413b = i2;
        c2110jo.f7418g = Integer.MIN_VALUE;
    }

    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        m2187n();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5256g() - (this.mOrientationHelper.mo5252c(view) + this.mOrientationHelper.mo5254e(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5256g() - this.mOrientationHelper.mo5251b(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5254e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5251b(view2) - this.mOrientationHelper.mo5252c(view));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2190q(int i, int i2) {
        this.mLayoutState.f7414c = i2 - this.mOrientationHelper.mo5260k();
        C2110jo c2110jo = this.mLayoutState;
        c2110jo.f7415d = i;
        c2110jo.f7416e = this.mShouldReverseLayout ? 1 : -1;
        c2110jo.f7417f = -1;
        c2110jo.f7413b = i2;
        c2110jo.f7418g = Integer.MIN_VALUE;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.mo5258i() == 0 && this.mOrientationHelper.mo5255f() == 0;
    }

    public int scrollBy(int i, C1161j c1161j, C0038Av c0038Av) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f7412a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m2188o(i2, iAbs, true, c0038Av);
        C2110jo c2110jo = this.mLayoutState;
        int iFill = fill(c1161j, c2110jo, c0038Av, false) + c2110jo.f7418g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.mo5264o(-i);
        this.mLayoutState.f7421j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int scrollHorizontallyBy(int i, C1161j c1161j, C0038Av c0038Av) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c1161j, c0038Av);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        C2154ko c2154ko = this.mPendingSavedState;
        if (c2154ko != null) {
            c2154ko.f7531a = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        C2154ko c2154ko = this.mPendingSavedState;
        if (c2154ko != null) {
            c2154ko.f7531a = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public int scrollVerticallyBy(int i, C1161j c1161j, C0038Av c0038Av) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c1161j, c0038Av);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC2730xt abstractC2730xtM5296a = AbstractC2730xt.m5296a(this, i);
            this.mOrientationHelper = abstractC2730xtM5296a;
            this.mAnchorInfo.f5346a = abstractC2730xtM5296a;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    @SuppressLint({"UnknownNullness"})
    public void smoothScrollToPosition(RecyclerView recyclerView, C0038Av c0038Av, int i) {
        C2201lo c2201lo = new C2201lo(recyclerView.getContext());
        c2201lo.setTargetPosition(i);
        startSmoothScroll(c2201lo);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        getChildCount();
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iMo5254e = this.mOrientationHelper.mo5254e(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iMo5254e2 = this.mOrientationHelper.mo5254e(childAt);
                if (position2 < position) {
                    m2184k();
                    StringBuilder sb = new StringBuilder("detected invalid position. loc invalid? ");
                    sb.append(iMo5254e2 < iMo5254e);
                    throw new RuntimeException(sb.toString());
                }
                if (iMo5254e2 > iMo5254e) {
                    m2184k();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iMo5254e3 = this.mOrientationHelper.mo5254e(childAt2);
            if (position3 < position) {
                m2184k();
                StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                sb2.append(iMo5254e3 < iMo5254e);
                throw new RuntimeException(sb2.toString());
            }
            if (iMo5254e3 < iMo5254e) {
                m2184k();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
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
        C2388pv properties = AbstractC1160i.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f8388a);
        setReverseLayout(properties.f8390c);
        setStackFromEnd(properties.f8391d);
    }
}
