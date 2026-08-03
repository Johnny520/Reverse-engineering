package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p000.AbstractC0213Ey;
import p000.AbstractC0810Su;
import p000.AbstractC2185lE;
import p000.C0038Av;
import p000.C1045YD;
import p000.C1118a0;
import p000.C1384ev;
import p000.C2294nv;
import p000.C2388pv;
import p000.C2408qE;
import p000.C2431qv;
import p000.C2520sy;
import p000.InterfaceC1002XD;
import p000.InterfaceC2337ov;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1160i {
    boolean mAutoMeasure;
    C1153b mChildHelper;
    private int mHeight;
    private int mHeightMode;
    C1045YD mHorizontalBoundCheck;
    private final InterfaceC1002XD mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow;
    private boolean mItemPrefetchEnabled;
    private boolean mMeasurementCacheEnabled;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations;
    AbstractC1164m mSmoothScroller;
    C1045YD mVerticalBoundCheck;
    private final InterfaceC1002XD mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public AbstractC1160i() {
        C2294nv c2294nv = new C2294nv(this, 0);
        this.mHorizontalBoundCheckCallback = c2294nv;
        C2294nv c2294nv2 = new C2294nv(this, 1);
        this.mVerticalBoundCheckCallback = c2294nv2;
        this.mHorizontalBoundCheck = new C1045YD(c2294nv);
        this.mVerticalBoundCheck = new C1045YD(c2294nv2);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2251b(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static int chooseSize(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[PHI: r3
  0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
        int i4 = i - i2;
        int i5 = 0;
        int iMax = Math.max(0, i4);
        if (z) {
            if (i3 >= 0) {
                i5 = 1073741824;
            } else {
                i3 = 0;
            }
        } else if (i3 < 0) {
            if (i3 == -1) {
                i3 = iMax;
                i5 = 1073741824;
            } else if (i3 == -2) {
                i5 = Integer.MIN_VALUE;
                i3 = iMax;
            }
        }
        return View.MeasureSpec.makeMeasureSpec(i3, i5);
    }

    public static C2388pv getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
        C2388pv c2388pv = new C2388pv();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0810Su.f2564a, i, i2);
        c2388pv.f8388a = typedArrayObtainStyledAttributes.getInt(0, 1);
        c2388pv.f8389b = typedArrayObtainStyledAttributes.getInt(10, 1);
        c2388pv.f8390c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        c2388pv.f8391d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return c2388pv;
    }

    /* JADX INFO: renamed from: a */
    public final void m2252a(View view, int i, boolean z) {
        AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z || childViewHolderInt.isRemoved()) {
            C2520sy c2520sy = this.mRecyclerView.mViewInfoStore.f8756a;
            C2408qE c2408qEM4846a = (C2408qE) c2520sy.get(childViewHolderInt);
            if (c2408qEM4846a == null) {
                c2408qEM4846a = C2408qE.m4846a();
                c2520sy.put(childViewHolderInt, c2408qEM4846a);
            }
            c2408qEM4846a.f8443a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m4973c(childViewHolderInt);
        }
        C2431qv c2431qv = (C2431qv) view.getLayoutParams();
        if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.m2229b(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int iM2237j = this.mChildHelper.m2237j(view);
            if (i == -1) {
                i = this.mChildHelper.m2232e();
            }
            if (iM2237j == -1) {
                StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                sb.append(this.mRecyclerView.indexOfChild(view));
                throw new IllegalStateException(AbstractC0213Ey.m406d(this.mRecyclerView, sb));
            }
            if (iM2237j != i) {
                this.mRecyclerView.mLayout.moveView(iM2237j, i);
            }
        } else {
            this.mChildHelper.m2228a(view, i, false);
            c2431qv.f8528c = true;
            AbstractC1164m abstractC1164m = this.mSmoothScroller;
            if (abstractC1164m != null && abstractC1164m.isRunning()) {
                this.mSmoothScroller.onChildAttachedToWindow(view);
            }
        }
        if (c2431qv.f8529d) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                Objects.toString(c2431qv.f8526a);
            }
            childViewHolderInt.itemView.invalidate();
            c2431qv.f8529d = false;
        }
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertInLayoutOrScroll(str);
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void attachView(View view, int i, C2431qv c2431qv) {
        AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isRemoved()) {
            C2520sy c2520sy = this.mRecyclerView.mViewInfoStore.f8756a;
            C2408qE c2408qEM4846a = (C2408qE) c2520sy.get(childViewHolderInt);
            if (c2408qEM4846a == null) {
                c2408qEM4846a = C2408qE.m4846a();
                c2520sy.put(childViewHolderInt, c2408qEM4846a);
            }
            c2408qEM4846a.f8443a |= 1;
        } else {
            this.mRecyclerView.mViewInfoStore.m4973c(childViewHolderInt);
        }
        this.mChildHelper.m2229b(view, i, c2431qv, childViewHolderInt.isRemoved());
    }

    /* JADX INFO: renamed from: c */
    public final void m2253c(C1161j c1161j, int i, View view) {
        AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.shouldIgnore()) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                childViewHolderInt.toString();
            }
        } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
            removeViewAt(i);
            c1161j.m2264k(childViewHolderInt);
        } else {
            detachViewAt(i);
            c1161j.m2265l(view);
            this.mRecyclerView.mViewInfoStore.m4973c(childViewHolderInt);
        }
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public abstract boolean canScrollHorizontally();

    public abstract boolean canScrollVertically();

    public boolean checkLayoutParams(C2431qv c2431qv) {
        return c2431qv != null;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, C0038Av c0038Av, InterfaceC2337ov interfaceC2337ov) {
    }

    public void collectInitialPrefetchPositions(int i, InterfaceC2337ov interfaceC2337ov) {
    }

    public abstract int computeHorizontalScrollExtent(C0038Av c0038Av);

    public abstract int computeHorizontalScrollOffset(C0038Av c0038Av);

    public abstract int computeHorizontalScrollRange(C0038Av c0038Av);

    public abstract int computeVerticalScrollExtent(C0038Av c0038Av);

    public abstract int computeVerticalScrollOffset(C0038Av c0038Av);

    public abstract int computeVerticalScrollRange(C0038Av c0038Av);

    public void detachAndScrapAttachedViews(C1161j c1161j) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m2253c(c1161j, childCount, getChildAt(childCount));
        }
    }

    public void detachAndScrapView(View view, C1161j c1161j) {
        m2253c(c1161j, this.mChildHelper.m2237j(view), view);
    }

    public void detachAndScrapViewAt(int i, C1161j c1161j) {
        m2253c(c1161j, i, getChildAt(i));
    }

    public void detachView(View view) {
        int iM2237j = this.mChildHelper.m2237j(view);
        if (iM2237j >= 0) {
            this.mChildHelper.m2230c(iM2237j);
        }
    }

    public void detachViewAt(int i) {
        getChildAt(i);
        this.mChildHelper.m2230c(i);
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, C1161j c1161j) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, c1161j);
    }

    @SuppressLint({"UnknownNullness"})
    public void endAnimation(View view) {
        AbstractC1159h abstractC1159h = this.mRecyclerView.mItemAnimator;
        if (abstractC1159h != null) {
            abstractC1159h.mo2248d(RecyclerView.getChildViewHolderInt(view));
        }
    }

    public View findContainingItemView(View view) {
        View viewFindContainingItemView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.f4019c.contains(viewFindContainingItemView)) {
            return null;
        }
        return viewFindContainingItemView;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f82g || !childViewHolderInt.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract C2431qv generateDefaultLayoutParams();

    @SuppressLint({"UnknownNullness"})
    public C2431qv generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2431qv ? new C2431qv((C2431qv) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2431qv((ViewGroup.MarginLayoutParams) layoutParams) : new C2431qv(layoutParams);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View view) {
        return ((C2431qv) view.getLayoutParams()).f8527b.bottom;
    }

    public View getChildAt(int i) {
        C1153b c1153b = this.mChildHelper;
        if (c1153b != null) {
            return c1153b.m2231d(i);
        }
        return null;
    }

    public int getChildCount() {
        C1153b c1153b = this.mChildHelper;
        if (c1153b != null) {
            return c1153b.m2232e();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.mClipToPadding;
    }

    public int getColumnCountForAccessibility(C1161j c1161j, C0038Av c0038Av) {
        return -1;
    }

    public int getDecoratedBottom(View view) {
        return getBottomDecorationHeight(view) + view.getBottom();
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((C2431qv) view.getLayoutParams()).f8527b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((C2431qv) view.getLayoutParams()).f8527b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(View view) {
        return getRightDecorationWidth(view) + view.getRight();
    }

    public int getDecoratedTop(View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.f4019c.contains(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView recyclerView = this.mRecyclerView;
        AbstractC1158g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(View view) {
        return RecyclerView.getChildViewHolderInt(view).getItemViewType();
    }

    public int getLayoutDirection() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        return recyclerView.getLayoutDirection();
    }

    public int getLeftDecorationWidth(View view) {
        return ((C2431qv) view.getLayoutParams()).f8527b.left;
    }

    public int getMinimumHeight() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        return recyclerView.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        return recyclerView.getMinimumWidth();
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        return recyclerView.getPaddingEnd();
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return 0;
        }
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        return recyclerView.getPaddingStart();
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(View view) {
        return ((C2431qv) view.getLayoutParams()).f8526a.getLayoutPosition();
    }

    public int getRightDecorationWidth(View view) {
        return ((C2431qv) view.getLayoutParams()).f8527b.right;
    }

    public int getRowCountForAccessibility(C1161j c1161j, C0038Av c0038Av) {
        return -1;
    }

    public int getSelectionModeForAccessibility(C1161j c1161j, C0038Av c0038Av) {
        return 0;
    }

    public int getTopDecorationHeight(View view) {
        return ((C2431qv) view.getLayoutParams()).f8527b.top;
    }

    public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C2431qv) view.getLayoutParams()).f8527b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.mRecyclerView.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException(AbstractC0213Ey.m406d(this.mRecyclerView, new StringBuilder("View should be fully attached to be ignored")));
        }
        AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.addFlags(128);
        this.mRecyclerView.mViewInfoStore.m4974d(childViewHolderInt);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public abstract boolean isAutoMeasureEnabled();

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(C1161j c1161j, C0038Av c0038Av) {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        AbstractC1164m abstractC1164m = this.mSmoothScroller;
        return abstractC1164m != null && abstractC1164m.isRunning();
    }

    public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
        boolean z3 = this.mHorizontalBoundCheck.m1996b(view) && this.mVerticalBoundCheck.m1996b(view);
        return z ? z3 : !z3;
    }

    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((C2431qv) view.getLayoutParams()).f8527b;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        C2431qv c2431qv = (C2431qv) view.getLayoutParams();
        Rect rect = c2431qv.f8527b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c2431qv).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c2431qv).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c2431qv).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c2431qv).bottomMargin);
    }

    public void measureChild(View view, int i, int i2) {
        C2431qv c2431qv = (C2431qv) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, ((ViewGroup.MarginLayoutParams) c2431qv).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, ((ViewGroup.MarginLayoutParams) c2431qv).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c2431qv)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        C2431qv c2431qv = (C2431qv) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
        int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c2431qv).leftMargin + ((ViewGroup.MarginLayoutParams) c2431qv).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c2431qv).width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) c2431qv).topMargin + ((ViewGroup.MarginLayoutParams) c2431qv).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c2431qv).height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c2431qv)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i, int i2) {
        View childAt = getChildAt(i);
        if (childAt != null) {
            detachViewAt(i);
            attachView(childAt, i2);
        } else {
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }
    }

    public void offsetChildrenHorizontal(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i);
        }
    }

    public void onAdapterChanged(AbstractC1158g abstractC1158g, AbstractC1158g abstractC1158g2) {
    }

    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
        return false;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public abstract void onDetachedFromWindow(RecyclerView recyclerView, C1161j c1161j);

    public abstract View onFocusSearchFailed(View view, int i, C1161j c1161j, C0038Av c0038Av);

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(C1118a0 c1118a0) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, c1118a0);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, C1118a0 c1118a0) {
        AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt == null || childViewHolderInt.isRemoved()) {
            return;
        }
        C1153b c1153b = this.mChildHelper;
        if (c1153b.f4019c.contains(childViewHolderInt.itemView)) {
            return;
        }
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, c1118a0);
    }

    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
    }

    public void onItemsChanged(RecyclerView recyclerView) {
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
    }

    public abstract void onLayoutChildren(C1161j c1161j, C0038Av c0038Av);

    public abstract void onLayoutCompleted(C0038Av c0038Av);

    public void onMeasure(C1161j c1161j, C0038Av c0038Av, int i, int i2) {
        this.mRecyclerView.defaultOnMeasure(i, i2);
    }

    @Deprecated
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        return isSmoothScrolling() || recyclerView.isComputingLayout();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onSmoothScrollerStopped(AbstractC1164m abstractC1164m) {
        if (this.mSmoothScroller == abstractC1164m) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
    }

    public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    public void removeAllViews() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            C1153b c1153b = this.mChildHelper;
            int iM2233f = c1153b.m2233f(childCount);
            C1384ev c1384ev = c1153b.f4017a;
            View childAt = c1384ev.f4930a.getChildAt(iM2233f);
            if (childAt != null) {
                if (c1153b.f4018b.m4258f(iM2233f)) {
                    c1153b.m2238k(childAt);
                }
                c1384ev.m2670a(iM2233f);
            }
        }
    }

    public void removeAndRecycleAllViews(C1161j c1161j) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, c1161j);
            }
        }
    }

    public void removeAndRecycleScrapInt(C1161j c1161j) {
        ArrayList arrayList = c1161j.f4039a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC1166o) arrayList.get(i)).itemView;
            AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                AbstractC1159h abstractC1159h = this.mRecyclerView.mItemAnimator;
                if (abstractC1159h != null) {
                    abstractC1159h.mo2248d(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                AbstractC1166o childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt2.mScrapContainer = null;
                childViewHolderInt2.mInChangeScrap = false;
                childViewHolderInt2.clearReturnedFromScrapFlag();
                c1161j.m2264k(childViewHolderInt2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c1161j.f4040b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(View view, C1161j c1161j) {
        removeView(view);
        c1161j.m2263j(view);
    }

    public void removeAndRecycleViewAt(int i, C1161j c1161j) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        c1161j.m2263j(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    @SuppressLint({"UnknownNullness"})
    public void removeView(View view) {
        C1153b c1153b = this.mChildHelper;
        C1384ev c1384ev = c1153b.f4017a;
        int iIndexOfChild = c1384ev.f4930a.indexOfChild(view);
        if (iIndexOfChild < 0) {
            return;
        }
        if (c1153b.f4018b.m4258f(iIndexOfChild)) {
            c1153b.m2238k(view);
        }
        c1384ev.m2670a(iIndexOfChild);
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            C1153b c1153b = this.mChildHelper;
            int iM2233f = c1153b.m2233f(i);
            C1384ev c1384ev = c1153b.f4017a;
            View childAt = c1384ev.f4930a.getChildAt(iM2233f);
            if (childAt == null) {
                return;
            }
            if (c1153b.f4018b.m4258f(iM2233f)) {
                c1153b.m2238k(childAt);
            }
            c1384ev.m2670a(iM2233f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int iMin = Math.min(0, i);
        int i2 = top - paddingTop;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - width;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - height);
        if (getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int paddingLeft2 = getPaddingLeft();
                int paddingTop2 = getPaddingTop();
                int width2 = getWidth() - getPaddingRight();
                int height2 = getHeight() - getPaddingBottom();
                Rect rect2 = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(focusedChild, rect2);
                if (rect2.left - i4 < width2 && rect2.right - i4 > paddingLeft2 && rect2.top - i5 < height2 && rect2.bottom - i5 > paddingTop2) {
                }
            }
        } else if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.smoothScrollBy(i4, i5);
            }
            return true;
        }
        return false;
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public abstract int scrollHorizontallyBy(int i, C1161j c1161j, C0038Av c0038Av);

    public abstract void scrollToPosition(int i);

    public abstract int scrollVerticallyBy(int i, C1161j c1161j, C0038Av c0038Av);

    @Deprecated
    public void setAutoMeasureEnabled(boolean z) {
        this.mAutoMeasure = z;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z) {
        if (z != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.mRecycler.m2268o();
            }
        }
    }

    public void setMeasureSpecs(int i, int i2) {
        this.mWidth = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.mHeightMode = mode2;
        if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            return;
        }
        this.mHeight = 0;
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int i, int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(childAt, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
        setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
    }

    public void setMeasurementCacheEnabled(boolean z) {
        this.mMeasurementCacheEnabled = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.mChildHelper;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i, int i2, C2431qv c2431qv) {
        return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && m2251b(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c2431qv).width) && m2251b(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c2431qv).height)) ? false : true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i, int i2, C2431qv c2431qv) {
        return (this.mMeasurementCacheEnabled && m2251b(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c2431qv).width) && m2251b(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c2431qv).height)) ? false : true;
    }

    public abstract void smoothScrollToPosition(RecyclerView recyclerView, C0038Av c0038Av, int i);

    @SuppressLint({"UnknownNullness"})
    public void startSmoothScroll(AbstractC1164m abstractC1164m) {
        AbstractC1164m abstractC1164m2 = this.mSmoothScroller;
        if (abstractC1164m2 != null && abstractC1164m != abstractC1164m2 && abstractC1164m2.isRunning()) {
            this.mSmoothScroller.stop();
        }
        this.mSmoothScroller = abstractC1164m;
        abstractC1164m.start(this.mRecyclerView, this);
    }

    public void stopIgnoringView(View view) {
        AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.stopIgnoring();
        childViewHolderInt.resetInternal();
        childViewHolderInt.addFlags(4);
    }

    public void stopSmoothScroller() {
        AbstractC1164m abstractC1164m = this.mSmoothScroller;
        if (abstractC1164m != null) {
            abstractC1164m.stop();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View view, int i) {
        m2252a(view, i, true);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View view, int i) {
        m2252a(view, i, false);
    }

    public void onInitializeAccessibilityEvent(C1161j c1161j, C0038Av c0038Av, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC1158g abstractC1158g = this.mRecyclerView.mAdapter;
        if (abstractC1158g != null) {
            accessibilityEvent.setItemCount(abstractC1158g.getItemCount());
        }
    }

    public void onInitializeAccessibilityNodeInfo(C1161j c1161j, C0038Av c0038Av, C1118a0 c1118a0) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            c1118a0.m2040a(8192);
            c1118a0.m2048j(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            c1118a0.m2040a(4096);
            c1118a0.m2048j(true);
        }
        c1118a0.f3530a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(getRowCountForAccessibility(c1161j, c0038Av), getColumnCountForAccessibility(c1161j, c0038Av), isLayoutHierarchical(c1161j, c0038Av), getSelectionModeForAccessibility(c1161j, c0038Av)));
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        onItemsUpdated(recyclerView, i, i2);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, C0038Av c0038Av, View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    public boolean performAccessibilityAction(C1161j c1161j, C0038Av c0038Av, int i, Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        int i2;
        int i3;
        if (this.mRecyclerView == null) {
            return false;
        }
        int height = getHeight();
        int width = getWidth();
        Rect rect = new Rect();
        if (this.mRecyclerView.getMatrix().isIdentity() && this.mRecyclerView.getGlobalVisibleRect(rect)) {
            height = rect.height();
            width = rect.width();
        }
        if (i == 4096) {
            paddingTop = this.mRecyclerView.canScrollVertically(1) ? (height - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.mRecyclerView.canScrollHorizontally(1)) {
                paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                i2 = paddingTop;
                i3 = paddingLeft;
            }
            i2 = paddingTop;
            i3 = 0;
        } else if (i != 8192) {
            i3 = 0;
            i2 = 0;
        } else {
            paddingTop = this.mRecyclerView.canScrollVertically(-1) ? -((height - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.mRecyclerView.canScrollHorizontally(-1)) {
                paddingLeft = -((width - getPaddingLeft()) - getPaddingRight());
                i2 = paddingTop;
                i3 = paddingLeft;
            }
            i2 = paddingTop;
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
        return true;
    }

    public boolean performAccessibilityActionForItem(C1161j c1161j, C0038Av c0038Av, View view, int i, Bundle bundle) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 < 0) {
                if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            }
            i2 = 1073741824;
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 != -1) {
            if (i4 == -2) {
                if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                    i4 = iMax;
                    i2 = Integer.MIN_VALUE;
                } else {
                    i4 = iMax;
                    i2 = 0;
                }
            }
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    @SuppressLint({"UnknownNullness"})
    public C2431qv generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C2431qv(context, attributeSet);
    }

    public void onInitializeAccessibilityNodeInfoForItem(C1161j c1161j, C0038Av c0038Av, View view, C1118a0 c1118a0) {
    }

    public void setMeasuredDimension(int i, int i2) {
        this.mRecyclerView.setMeasuredDimension(i, i2);
    }

    public void attachView(View view, int i) {
        attachView(view, i, (C2431qv) view.getLayoutParams());
    }

    public void attachView(View view) {
        attachView(view, -1);
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
    }
}
