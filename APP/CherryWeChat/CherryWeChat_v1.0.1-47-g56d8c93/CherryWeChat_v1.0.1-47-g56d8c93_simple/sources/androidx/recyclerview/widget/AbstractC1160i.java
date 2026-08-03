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
        C2294nv r0 = new C2294nv(this, 0);
        this.mHorizontalBoundCheckCallback = r0;
        C2294nv r1 = new C2294nv(this, 1);
        this.mVerticalBoundCheckCallback = r1;
        this.mHorizontalBoundCheck = new C1045YD(r0);
        this.mVerticalBoundCheck = new C1045YD(r1);
        this.mRequestedSimpleAnimations = false;
        this.mIsAttachedToWindow = false;
        this.mAutoMeasure = false;
        this.mMeasurementCacheEnabled = true;
        this.mItemPrefetchEnabled = true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2251b(int r3, int r4, int r5) {
        int r0 = View.MeasureSpec.getMode(r4);
        int r42 = View.MeasureSpec.getSize(r4);
        if (r5 <= 0) goto L7;
        if (r3 == r5) goto L7;
        return false;
    L7:
        if (r0 == Integer.MIN_VALUE) goto L16;
        if (r0 != 0) goto L10;
        return true;
    L10:
        if (r0 == 1073741824) goto L12;
        return false;
    L12:
        if (r42 != r3) goto L14;
        return true;
    L14:
        return false;
    L16:
        if (r42 < r3) goto L18;
        return true;
    L18:
        return false;
    }

    public static int chooseSize(int r2, int r3, int r4) {
        int r0 = View.MeasureSpec.getMode(r2);
        int r22 = View.MeasureSpec.getSize(r2);
        if (r0 == Integer.MIN_VALUE) goto L9;
        if (r0 != 1073741824) goto L7;
        return r22;
    L7:
        return Math.max(r3, r4);
    L9:
        return Math.min(r22, Math.max(r3, r4));
    }

    @Deprecated
    public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
        int r12 = r1 - r2;
        int r22 = 0;
        int r13 = Math.max(0, r12);
        if (r4 == false) goto L7;
        if (r3 < 0) goto L6;
    L5:
        r22 = 1073741824;
    L16:
        return View.MeasureSpec.makeMeasureSpec(r3, r22);
    L6:
        r3 = 0;
        goto L16
    L7:
        if (r3 >= 0) goto L5;
        if (r3 != (-1)) goto L13;
        r3 = r13;
        goto L5
    L13:
        if (r3 != (-2)) goto L6;
        r22 = Integer.MIN_VALUE;
        r3 = r13;
        goto L16
    }

    public static C2388pv getProperties(Context r2, AttributeSet r3, int r4, int r5) {
        C2388pv r0 = new C2388pv();
        TypedArray r22 = r2.obtainStyledAttributes(r3, AbstractC0810Su.f2564a, r4, r5);
        r0.f8388a = r22.getInt(0, 1);
        r0.f8389b = r22.getInt(10, 1);
        r0.f8390c = r22.getBoolean(9, false);
        r0.f8391d = r22.getBoolean(11, false);
        r22.recycle();
        return r0;
    }

    /* JADX INFO: renamed from: a */
    public final void m2252a(View r6, int r7, boolean r8) {
        AbstractC1166o r0 = RecyclerView.getChildViewHolderInt(r6);
        if (r8 == false) goto L5;
    L8:
        C2520sy r82 = this.mRecyclerView.mViewInfoStore.f8756a;
        C2408qE r2 = (C2408qE) r82.get(r0);
        if (r2 != null) goto L11;
        r2 = C2408qE.m4846a();
        r82.put(r0, r2);
    L11:
        r2.f8443a |= 1;
    L12:
        C2431qv r83 = (C2431qv) r6.getLayoutParams();
        if (r0.wasReturnedFromScrap() == true) goto L33;
        if (r0.isScrap() == true) goto L33;
        if (r6.getParent() != this.mRecyclerView) goto L27;
        int r1 = this.mChildHelper.m2237j(r6);
        if (r7 != (-1)) goto L22;
        r7 = this.mChildHelper.m2232e();
    L22:
        if (r1 == (-1)) goto L25;
        if (r1 == r7) goto L38;
        this.mRecyclerView.mLayout.moveView(r1, r7);
    L38:
        if (r83.f8529d == true) goto L40;
        return;
    L40:
        if (RecyclerView.sVerboseLoggingEnabled == false) goto L42;
        Objects.toString(r83.f8526a);
    L42:
        r0.itemView.invalidate();
        r83.f8529d = false;
        return;
    L25:
        StringBuilder r84 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
        r84.append(this.mRecyclerView.indexOfChild(r6));
        throw new IllegalStateException(AbstractC0213Ey.m406d(this.mRecyclerView, r84));
    L27:
        this.mChildHelper.m2228a(r6, r7, false);
        r83.f8528c = true;
        AbstractC1164m r72 = this.mSmoothScroller;
        if (r72 == null) goto L38;
        if (r72.isRunning() == false) goto L38;
        this.mSmoothScroller.onChildAttachedToWindow(r6);
    L33:
        if (r0.isScrap() == false) goto L35;
        r0.unScrap();
    L36:
        this.mChildHelper.m2229b(r6, r7, r6.getLayoutParams(), false);
        goto L38
    L35:
        r0.clearReturnedFromScrapFlag();
        goto L36
    L5:
        if (r0.isRemoved() == true) goto L8;
        this.mRecyclerView.mViewInfoStore.m4973c(r0);
        goto L12
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View r2) {
        addDisappearingView(r2, -1);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View r2) {
        addView(r2, -1);
    }

    public void assertInLayoutOrScroll(String r2) {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L6;
        r0.assertInLayoutOrScroll(r2);
        return;
    }

    public void assertNotInLayoutOrScroll(String r2) {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L6;
        r0.assertNotInLayoutOrScroll(r2);
        return;
    }

    public void attachView(View r4, int r5, C2431qv r6) {
        AbstractC1166o r0 = RecyclerView.getChildViewHolderInt(r4);
        if (r0.isRemoved() == false) goto L8;
        C2520sy r1 = this.mRecyclerView.mViewInfoStore.f8756a;
        C2408qE r2 = (C2408qE) r1.get(r0);
        if (r2 != null) goto L7;
        r2 = C2408qE.m4846a();
        r1.put(r0, r2);
    L7:
        r2.f8443a |= 1;
    L9:
        this.mChildHelper.m2229b(r4, r5, r6, r0.isRemoved());
        return;
    L8:
        this.mRecyclerView.mViewInfoStore.m4973c(r0);
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public final void m2253c(C1161j r3, int r4, View r5) {
        AbstractC1166o r0 = RecyclerView.getChildViewHolderInt(r5);
        if (r0.shouldIgnore() == false) goto L9;
        if (RecyclerView.sVerboseLoggingEnabled == false) goto L18;
        r0.toString();
        return;
    L18:
        return;
    L9:
        if (r0.isInvalid() == true) goto L11;
    L16:
        detachViewAt(r4);
        r3.m2265l(r5);
        this.mRecyclerView.mViewInfoStore.m4973c(r0);
        return;
    L11:
        if (r0.isRemoved() == true) goto L16;
        if (this.mRecyclerView.mAdapter.hasStableIds() == true) goto L16;
        removeViewAt(r4);
        r3.m2264k(r0);
    }

    public void calculateItemDecorationsForChild(View r2, Rect r3) {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 != null) goto L6;
        r3.set(0, 0, 0, 0);
        return;
    L6:
        r3.set(r0.getItemDecorInsetsForChild(r2));
    }

    public abstract boolean canScrollHorizontally();

    public abstract boolean canScrollVertically();

    public boolean checkLayoutParams(C2431qv r1) {
        if (r1 == null) goto L5;
        return true;
    L5:
        return false;
    }

    public void collectAdjacentPrefetchPositions(int r1, int r2, C0038Av r3, InterfaceC2337ov r4) {
    }

    public void collectInitialPrefetchPositions(int r1, InterfaceC2337ov r2) {
    }

    public abstract int computeHorizontalScrollExtent(C0038Av r1);

    public abstract int computeHorizontalScrollOffset(C0038Av r1);

    public abstract int computeHorizontalScrollRange(C0038Av r1);

    public abstract int computeVerticalScrollExtent(C0038Av r1);

    public abstract int computeVerticalScrollOffset(C0038Av r1);

    public abstract int computeVerticalScrollRange(C0038Av r1);

    public void detachAndScrapAttachedViews(C1161j r3) {
        int r0 = getChildCount() - 1;
    L3:
        if (r0 < 0) goto L5;
        m2253c(r3, r0, getChildAt(r0));
        r0 = r0 - 1;
        goto L3
    }

    public void detachAndScrapView(View r2, C1161j r3) {
        m2253c(r3, this.mChildHelper.m2237j(r2), r2);
    }

    public void detachAndScrapViewAt(int r2, C1161j r3) {
        m2253c(r3, r2, getChildAt(r2));
    }

    public void detachView(View r2) {
        int r22 = this.mChildHelper.m2237j(r2);
        if (r22 < 0) goto L6;
        this.mChildHelper.m2230c(r22);
        return;
    }

    public void detachViewAt(int r2) {
        getChildAt(r2);
        this.mChildHelper.m2230c(r2);
    }

    public void dispatchAttachedToWindow(RecyclerView r2) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(r2);
    }

    public void dispatchDetachedFromWindow(RecyclerView r2, C1161j r3) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(r2, r3);
    }

    @SuppressLint({"UnknownNullness"})
    public void endAnimation(View r2) {
        AbstractC1159h r0 = this.mRecyclerView.mItemAnimator;
        if (r0 == null) goto L6;
        r0.mo2248d(RecyclerView.getChildViewHolderInt(r2));
        return;
    }

    public View findContainingItemView(View r2) {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L10;
        View r22 = r0.findContainingItemView(r2);
        if (r22 == null) goto L10;
        if (this.mChildHelper.f4019c.contains(r22) == true) goto L10;
        return r22;
    L10:
        return null;
    }

    public View findViewByPosition(int r6) {
        int r0 = getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L17;
        View r2 = getChildAt(r1);
        AbstractC1166o r3 = RecyclerView.getChildViewHolderInt(r2);
        if (r3 == null) goto L16;
        if (r3.getLayoutPosition() != r6) goto L16;
        if (r3.shouldIgnore() == true) goto L16;
        if (this.mRecyclerView.mState.f82g == true) goto L15;
        if (r3.isRemoved() == true) goto L16;
    L15:
        return r2;
    L16:
        r1 = r1 + 1;
        goto L3
    L17:
        return null;
    }

    public abstract C2431qv generateDefaultLayoutParams();

    @SuppressLint({"UnknownNullness"})
    public C2431qv generateLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C2431qv) == false) goto L7;
        return new C2431qv((C2431qv) r2);
    L7:
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L11;
        return new C2431qv((ViewGroup.MarginLayoutParams) r2);
    L11:
        return new C2431qv(r2);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View r1) {
        return ((C2431qv) r1.getLayoutParams()).f8527b.bottom;
    }

    public View getChildAt(int r2) {
        C1153b r0 = this.mChildHelper;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.m2231d(r2);
    }

    public int getChildCount() {
        C1153b r0 = this.mChildHelper;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.m2232e();
    }

    public boolean getClipToPadding() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.mClipToPadding == false) goto L10;
        return true;
    L10:
        return false;
    }

    public int getColumnCountForAccessibility(C1161j r1, C0038Av r2) {
        return -1;
    }

    public int getDecoratedBottom(View r2) {
        int r0 = r2.getBottom();
        return getBottomDecorationHeight(r2) + r0;
    }

    public void getDecoratedBoundsWithMargins(View r1, Rect r2) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(r1, r2);
    }

    public int getDecoratedLeft(View r2) {
        return r2.getLeft() - getLeftDecorationWidth(r2);
    }

    public int getDecoratedMeasuredHeight(View r3) {
        Rect r0 = ((C2431qv) r3.getLayoutParams()).f8527b;
        return (r3.getMeasuredHeight() + r0.top) + r0.bottom;
    }

    public int getDecoratedMeasuredWidth(View r3) {
        Rect r0 = ((C2431qv) r3.getLayoutParams()).f8527b;
        return (r3.getMeasuredWidth() + r0.left) + r0.right;
    }

    public int getDecoratedRight(View r2) {
        int r0 = r2.getRight();
        return getRightDecorationWidth(r2) + r0;
    }

    public int getDecoratedTop(View r2) {
        return r2.getTop() - getTopDecorationHeight(r2);
    }

    public View getFocusedChild() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L13;
        View r02 = r0.getFocusedChild();
        if (r02 != null) goto L8;
        return null;
    L8:
        if (this.mChildHelper.f4019c.contains(r02) == true) goto L14;
        return r02;
    L14:
        return null;
    L13:
        return null;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L5;
        AbstractC1158g r02 = r0.getAdapter();
    L6:
        if (r02 != null) goto L8;
        return 0;
    L8:
        return r02.getItemCount();
    L5:
        r02 = null;
        goto L6
    }

    public int getItemViewType(View r1) {
        return RecyclerView.getChildViewHolderInt(r1).getItemViewType();
    }

    public int getLayoutDirection() {
        RecyclerView r0 = this.mRecyclerView;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        return r0.getLayoutDirection();
    }

    public int getLeftDecorationWidth(View r1) {
        return ((C2431qv) r1.getLayoutParams()).f8527b.left;
    }

    public int getMinimumHeight() {
        RecyclerView r0 = this.mRecyclerView;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        return r0.getMinimumHeight();
    }

    public int getMinimumWidth() {
        RecyclerView r0 = this.mRecyclerView;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        return r0.getMinimumWidth();
    }

    public int getPaddingBottom() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingBottom();
    }

    public int getPaddingEnd() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L6;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        return r0.getPaddingEnd();
    L6:
        return 0;
    }

    public int getPaddingLeft() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingLeft();
    }

    public int getPaddingRight() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingRight();
    }

    public int getPaddingStart() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L6;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        return r0.getPaddingStart();
    L6:
        return 0;
    }

    public int getPaddingTop() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getPaddingTop();
    }

    public int getPosition(View r1) {
        return ((C2431qv) r1.getLayoutParams()).f8526a.getLayoutPosition();
    }

    public int getRightDecorationWidth(View r1) {
        return ((C2431qv) r1.getLayoutParams()).f8527b.right;
    }

    public int getRowCountForAccessibility(C1161j r1, C0038Av r2) {
        return -1;
    }

    public int getSelectionModeForAccessibility(C1161j r1, C0038Av r2) {
        return 0;
    }

    public int getTopDecorationHeight(View r1) {
        return ((C2431qv) r1.getLayoutParams()).f8527b.top;
    }

    public void getTransformedBoundingBox(View r6, boolean r7, Rect r8) {
        if (r7 == false) goto L4;
        Rect r72 = ((C2431qv) r6.getLayoutParams()).f8527b;
        r8.set(-r72.left, -r72.top, r6.getWidth() + r72.right, r6.getHeight() + r72.bottom);
    L6:
        if (this.mRecyclerView == null) goto L12;
        Matrix r73 = r6.getMatrix();
        if (r73 == null) goto L12;
        if (r73.isIdentity() == true) goto L12;
        RectF r0 = this.mRecyclerView.mTempRectF;
        r0.set(r8);
        r73.mapRect(r0);
        r8.set((int) Math.floor(r0.left), (int) Math.floor(r0.top), (int) Math.ceil(r0.right), (int) Math.ceil(r0.bottom));
    L12:
        r8.offset(r6.getLeft(), r6.getTop());
        return;
    L4:
        r8.set(0, 0, r6.getWidth(), r6.getHeight());
        goto L6
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int r0 = getChildCount();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L11;
        ViewGroup.LayoutParams r3 = getChildAt(r2).getLayoutParams();
        if (r3.width >= 0) goto L10;
        if (r3.height >= 0) goto L10;
        return true;
    L10:
        r2 = r2 + 1;
        goto L3
    L11:
        return false;
    }

    public boolean hasFocus() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.hasFocus() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public void ignoreView(View r3) {
        ViewParent r0 = r3.getParent();
        RecyclerView r1 = this.mRecyclerView;
        if (r0 == r1) goto L5;
    L8:
        StringBuilder r02 = new StringBuilder("View should be fully attached to be ignored");
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(this.mRecyclerView, r02));
    L5:
        if (r1.indexOfChild(r3) == (-1)) goto L8;
        AbstractC1166o r32 = RecyclerView.getChildViewHolderInt(r3);
        r32.addFlags(128);
        this.mRecyclerView.mViewInfoStore.m4974d(r32);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public abstract boolean isAutoMeasureEnabled();

    public boolean isFocused() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isFocused() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(C1161j r1, C0038Av r2) {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        AbstractC1164m r0 = this.mSmoothScroller;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isRunning() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isViewPartiallyVisible(View r2, boolean r3, boolean r4) {
        if (this.mHorizontalBoundCheck.m1996b(r2) == true) goto L5;
    L7:
        boolean r22 = false;
    L8:
        if (r3 == false) goto L11;
        return r22;
    L11:
        return !r22;
    L5:
        if (this.mVerticalBoundCheck.m1996b(r2) == false) goto L7;
        r22 = true;
        goto L8
    }

    public void layoutDecorated(View r3, int r4, int r5, int r6, int r7) {
        Rect r0 = ((C2431qv) r3.getLayoutParams()).f8527b;
        r3.layout(r4 + r0.left, r5 + r0.top, r6 - r0.right, r7 - r0.bottom);
    }

    public void layoutDecoratedWithMargins(View r4, int r5, int r6, int r7, int r8) {
        C2431qv r0 = (C2431qv) r4.getLayoutParams();
        Rect r1 = r0.f8527b;
        r4.layout((r5 + r1.left) + ((ViewGroup.MarginLayoutParams) r0).leftMargin, (r6 + r1.top) + ((ViewGroup.MarginLayoutParams) r0).topMargin, (r7 - r1.right) - ((ViewGroup.MarginLayoutParams) r0).rightMargin, (r8 - r1.bottom) - ((ViewGroup.MarginLayoutParams) r0).bottomMargin);
    }

    public void measureChild(View r6, int r7, int r8) {
        C2431qv r0 = (C2431qv) r6.getLayoutParams();
        Rect r1 = this.mRecyclerView.getItemDecorInsetsForChild(r6);
        int r2 = (r1.left + r1.right) + r7;
        int r72 = (r1.top + r1.bottom) + r8;
        int r82 = getWidth();
        int r12 = getWidthMode();
        int r3 = getPaddingLeft();
        int r83 = getChildMeasureSpec(r82, r12, (getPaddingRight() + r3) + r2, ((ViewGroup.MarginLayoutParams) r0).width, canScrollHorizontally());
        int r13 = getHeight();
        int r22 = getHeightMode();
        int r32 = getPaddingTop();
        int r73 = getChildMeasureSpec(r13, r22, (getPaddingBottom() + r32) + r72, ((ViewGroup.MarginLayoutParams) r0).height, canScrollVertically());
        if (shouldMeasureChild(r6, r83, r73, r0) == false) goto L6;
        r6.measure(r83, r73);
        return;
    }

    public void measureChildWithMargins(View r6, int r7, int r8) {
        C2431qv r0 = (C2431qv) r6.getLayoutParams();
        Rect r1 = this.mRecyclerView.getItemDecorInsetsForChild(r6);
        int r2 = (r1.left + r1.right) + r7;
        int r72 = (r1.top + r1.bottom) + r8;
        int r82 = getWidth();
        int r12 = getWidthMode();
        int r3 = getPaddingLeft();
        int r83 = getChildMeasureSpec(r82, r12, (((getPaddingRight() + r3) + ((ViewGroup.MarginLayoutParams) r0).leftMargin) + ((ViewGroup.MarginLayoutParams) r0).rightMargin) + r2, ((ViewGroup.MarginLayoutParams) r0).width, canScrollHorizontally());
        int r13 = getHeight();
        int r22 = getHeightMode();
        int r32 = getPaddingTop();
        int r73 = getChildMeasureSpec(r13, r22, (((getPaddingBottom() + r32) + ((ViewGroup.MarginLayoutParams) r0).topMargin) + ((ViewGroup.MarginLayoutParams) r0).bottomMargin) + r72, ((ViewGroup.MarginLayoutParams) r0).height, canScrollVertically());
        if (shouldMeasureChild(r6, r83, r73, r0) == false) goto L6;
        r6.measure(r83, r73);
        return;
    }

    public void moveView(int r3, int r4) {
        View r0 = getChildAt(r3);
        if (r0 == null) goto L7;
        detachViewAt(r3);
        attachView(r0, r4);
        return;
    L7:
        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + r3 + this.mRecyclerView.toString());
    }

    public void offsetChildrenHorizontal(int r2) {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L6;
        r0.offsetChildrenHorizontal(r2);
        return;
    }

    public void offsetChildrenVertical(int r2) {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L6;
        r0.offsetChildrenVertical(r2);
        return;
    }

    public void onAdapterChanged(AbstractC1158g r1, AbstractC1158g r2) {
    }

    public boolean onAddFocusables(RecyclerView r1, ArrayList<View> r2, int r3, int r4) {
        return false;
    }

    public void onAttachedToWindow(RecyclerView r1) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView r1) {
    }

    public abstract void onDetachedFromWindow(RecyclerView r1, C1161j r2);

    public abstract View onFocusSearchFailed(View r1, int r2, C1161j r3, C0038Av r4);

    public void onInitializeAccessibilityEvent(AccessibilityEvent r3) {
        RecyclerView r0 = this.mRecyclerView;
        onInitializeAccessibilityEvent(r0.mRecycler, r0.mState, r3);
    }

    public void onInitializeAccessibilityNodeInfo(C1118a0 r3) {
        RecyclerView r0 = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(r0.mRecycler, r0.mState, r3);
    }

    public void onInitializeAccessibilityNodeInfoForItem(View r3, C1118a0 r4) {
        AbstractC1166o r0 = RecyclerView.getChildViewHolderInt(r3);
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.isRemoved() == true) goto L11;
        C1153b r1 = this.mChildHelper;
        View r02 = r0.itemView;
        if (r1.f4019c.contains(r02) == true) goto L12;
        RecyclerView r03 = this.mRecyclerView;
        onInitializeAccessibilityNodeInfoForItem(r03.mRecycler, r03.mState, r3, r4);
        return;
    L12:
        return;
    }

    public View onInterceptFocusSearch(View r1, int r2) {
        return null;
    }

    public void onItemsAdded(RecyclerView r1, int r2, int r3) {
    }

    public void onItemsChanged(RecyclerView r1) {
    }

    public void onItemsMoved(RecyclerView r1, int r2, int r3, int r4) {
    }

    public void onItemsRemoved(RecyclerView r1, int r2, int r3) {
    }

    public void onItemsUpdated(RecyclerView r1, int r2, int r3) {
    }

    public abstract void onLayoutChildren(C1161j r1, C0038Av r2);

    public abstract void onLayoutCompleted(C0038Av r1);

    public void onMeasure(C1161j r1, C0038Av r2, int r3, int r4) {
        this.mRecyclerView.defaultOnMeasure(r3, r4);
    }

    @Deprecated
    public boolean onRequestChildFocus(RecyclerView r1, View r2, View r3) {
        if (isSmoothScrolling() == false) goto L5;
        return true;
    L5:
        if (r1.isComputingLayout() == true) goto L11;
        return false;
    L11:
        return true;
    }

    public void onRestoreInstanceState(Parcelable r1) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int r1) {
    }

    public void onSmoothScrollerStopped(AbstractC1164m r2) {
        if (this.mSmoothScroller != r2) goto L6;
        this.mSmoothScroller = null;
        return;
    }

    public boolean performAccessibilityAction(int r3, Bundle r4) {
        RecyclerView r0 = this.mRecyclerView;
        return performAccessibilityAction(r0.mRecycler, r0.mState, r3, r4);
    }

    public boolean performAccessibilityActionForItem(View r8, int r9, Bundle r10) {
        RecyclerView r0 = this.mRecyclerView;
        return performAccessibilityActionForItem(r0.mRecycler, r0.mState, r8, r9, r10);
    }

    public void postOnAnimation(Runnable r3) {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L6;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        r0.postOnAnimation(r3);
        return;
    }

    public void removeAllViews() {
        int r0 = getChildCount() - 1;
    L3:
        if (r0 < 0) goto L12;
        C1153b r1 = this.mChildHelper;
        int r2 = r1.m2233f(r0);
        C1384ev r3 = r1.f4017a;
        View r4 = r3.f4930a.getChildAt(r2);
        if (r4 == null) goto L11;
        if (r1.f4018b.m4258f(r2) == false) goto L10;
        r1.m2238k(r4);
    L10:
        r3.m2670a(r2);
    L11:
        r0 = r0 - 1;
        goto L3
    }

    public void removeAndRecycleAllViews(C1161j r3) {
        int r0 = getChildCount() - 1;
    L3:
        if (r0 < 0) goto L8;
        if (RecyclerView.getChildViewHolderInt(getChildAt(r0)).shouldIgnore() == true) goto L7;
        removeAndRecycleViewAt(r0, r3);
    L7:
        r0 = r0 - 1;
        goto L3
    }

    public void removeAndRecycleScrapInt(C1161j r8) {
        ArrayList r0 = r8.f4039a;
        int r1 = r0.size();
        int r2 = r1 - 1;
    L3:
        if (r2 < 0) goto L15;
        View r3 = ((AbstractC1166o) r0.get(r2)).itemView;
        AbstractC1166o r4 = RecyclerView.getChildViewHolderInt(r3);
        if (r4.shouldIgnore() == true) goto L14;
        r4.setIsRecyclable(false);
        if (r4.isTmpDetached() == false) goto L10;
        this.mRecyclerView.removeDetachedView(r3, false);
    L10:
        AbstractC1159h r6 = this.mRecyclerView.mItemAnimator;
        if (r6 == null) goto L13;
        r6.mo2248d(r4);
    L13:
        r4.setIsRecyclable(true);
        AbstractC1166o r32 = RecyclerView.getChildViewHolderInt(r3);
        r32.mScrapContainer = null;
        r32.mInChangeScrap = false;
        r32.clearReturnedFromScrapFlag();
        r8.m2264k(r32);
    L14:
        r2 = r2 - 1;
        goto L3
    L15:
        r0.clear();
        ArrayList r82 = r8.f4040b;
        if (r82 == null) goto L18;
        r82.clear();
    L18:
        if (r1 <= 0) goto L24;
        this.mRecyclerView.invalidate();
        return;
    }

    public void removeAndRecycleView(View r1, C1161j r2) {
        removeView(r1);
        r2.m2263j(r1);
    }

    public void removeAndRecycleViewAt(int r2, C1161j r3) {
        View r0 = getChildAt(r2);
        removeViewAt(r2);
        r3.m2263j(r0);
    }

    public boolean removeCallbacks(Runnable r2) {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 != null) goto L5;
        return false;
    L5:
        return r0.removeCallbacks(r2);
    }

    public void removeDetachedView(View r3) {
        this.mRecyclerView.removeDetachedView(r3, false);
    }

    @SuppressLint({"UnknownNullness"})
    public void removeView(View r5) {
        C1153b r0 = this.mChildHelper;
        C1384ev r1 = r0.f4017a;
        int r2 = r1.f4930a.indexOfChild(r5);
        if (r2 >= 0) goto L6;
        return;
    L6:
        if (r0.f4018b.m4258f(r2) == false) goto L8;
        r0.m2238k(r5);
    L8:
        r1.m2670a(r2);
    }

    public void removeViewAt(int r5) {
        if (getChildAt(r5) == null) goto L12;
        C1153b r0 = this.mChildHelper;
        int r52 = r0.m2233f(r5);
        C1384ev r1 = r0.f4017a;
        View r2 = r1.f4930a.getChildAt(r52);
        if (r2 != null) goto L8;
        return;
    L8:
        if (r0.f4018b.m4258f(r52) == false) goto L10;
        r0.m2238k(r2);
    L10:
        r1.m2670a(r52);
        return;
    }

    public boolean requestChildRectangleOnScreen(RecyclerView r9, View r10, Rect r11, boolean r12, boolean r13) {
        int r0 = getPaddingLeft();
        int r1 = getPaddingTop();
        int r2 = getWidth() - getPaddingRight();
        int r3 = getHeight() - getPaddingBottom();
        int r4 = (r10.getLeft() + r11.left) - r10.getScrollX();
        int r5 = (r10.getTop() + r11.top) - r10.getScrollY();
        int r102 = r11.width() + r4;
        int r112 = r11.height() + r5;
        int r42 = r4 - r0;
        int r6 = Math.min(0, r42);
        int r52 = r5 - r1;
        int r14 = Math.min(0, r52);
        int r103 = r102 - r2;
        int r22 = Math.max(0, r103);
        int r113 = Math.max(0, r112 - r3);
        if (getLayoutDirection() != 1) goto L7;
        if (r22 != 0) goto L11;
        r22 = Math.max(r6, r103);
    L11:
        if (r14 != 0) goto L14;
        r14 = Math.min(r52, r113);
    L14:
        int[] r104 = {r22, r14};
        int r114 = r104[0];
        int r105 = r104[1];
        if (r13 == false) goto L28;
        View r132 = r9.getFocusedChild();
        if (r132 == null) goto L31;
        int r15 = getPaddingLeft();
        int r23 = getPaddingTop();
        int r32 = getWidth() - getPaddingRight();
        int r43 = getHeight() - getPaddingBottom();
        Rect r53 = this.mRecyclerView.mTempRect;
        getDecoratedBoundsWithMargins(r132, r53);
        if ((r53.left - r114) >= r32) goto L31;
        if ((r53.right - r114) <= r15) goto L31;
        if ((r53.top - r105) >= r43) goto L31;
        if ((r53.bottom - r105) > r23) goto L28;
    L31:
        return false;
    L28:
        if (r114 != 0) goto L32;
        if (r105 == 0) goto L31;
    L32:
        if (r12 == false) goto L34;
        r9.scrollBy(r114, r105);
    L35:
        return true;
    L34:
        r9.smoothScrollBy(r114, r105);
        goto L35
    L7:
        if (r6 != 0) goto L10;
        r6 = Math.min(r42, r22);
    L10:
        r22 = r6;
        goto L11
    }

    public void requestLayout() {
        RecyclerView r0 = this.mRecyclerView;
        if (r0 == null) goto L6;
        r0.requestLayout();
        return;
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public abstract int scrollHorizontallyBy(int r1, C1161j r2, C0038Av r3);

    public abstract void scrollToPosition(int r1);

    public abstract int scrollVerticallyBy(int r1, C1161j r2, C0038Av r3);

    @Deprecated
    public void setAutoMeasureEnabled(boolean r1) {
        this.mAutoMeasure = r1;
    }

    public void setExactMeasureSpecsFrom(RecyclerView r3) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(r3.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r3.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean r2) {
        if (r2 == this.mItemPrefetchEnabled) goto L8;
        this.mItemPrefetchEnabled = r2;
        this.mPrefetchMaxCountObserved = 0;
        RecyclerView r22 = this.mRecyclerView;
        if (r22 == null) goto L9;
        r22.mRecycler.m2268o();
        return;
    L9:
        return;
    }

    public void setMeasureSpecs(int r2, int r3) {
        this.mWidth = View.MeasureSpec.getSize(r2);
        int r22 = View.MeasureSpec.getMode(r2);
        this.mWidthMode = r22;
        if (r22 == 0) goto L5;
    L7:
        this.mHeight = View.MeasureSpec.getSize(r3);
        int r23 = View.MeasureSpec.getMode(r3);
        this.mHeightMode = r23;
        if (r23 == 0) goto L10;
        return;
    L10:
        if (RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC == true) goto L14;
        this.mHeight = 0;
        return;
    L14:
        return;
    L5:
        if (RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC == true) goto L7;
        this.mWidth = 0;
        goto L7
    }

    public void setMeasuredDimension(Rect r3, int r4, int r5) {
        int r0 = r3.width();
        int r1 = getPaddingLeft() + r0;
        int r02 = getPaddingRight() + r1;
        int r32 = r3.height();
        int r12 = getPaddingTop() + r32;
        int r33 = getPaddingBottom() + r12;
        setMeasuredDimension(chooseSize(r4, r02, getMinimumWidth()), chooseSize(r5, r33, getMinimumHeight()));
    }

    public void setMeasuredDimensionFromChildren(int r9, int r10) {
        int r0 = getChildCount();
        if (r0 != 0) goto L6;
        this.mRecyclerView.defaultOnMeasure(r9, r10);
        return;
    L6:
        int r1 = Integer.MIN_VALUE;
        int r4 = Integer.MAX_VALUE;
        int r5 = 0;
        int r2 = Integer.MIN_VALUE;
        int r3 = Integer.MAX_VALUE;
    L7:
        if (r5 >= r0) goto L21;
        View r6 = getChildAt(r5);
        Rect r7 = this.mRecyclerView.mTempRect;
        getDecoratedBoundsWithMargins(r6, r7);
        int r62 = r7.left;
        if (r62 >= r3) goto L11;
        r3 = r62;
    L11:
        int r63 = r7.right;
        if (r63 <= r1) goto L14;
        r1 = r63;
    L14:
        int r64 = r7.top;
        if (r64 >= r4) goto L17;
        r4 = r64;
    L17:
        int r65 = r7.bottom;
        if (r65 <= r2) goto L20;
        r2 = r65;
    L20:
        r5 = r5 + 1;
        goto L7
    L21:
        this.mRecyclerView.mTempRect.set(r3, r4, r1, r2);
        setMeasuredDimension(this.mRecyclerView.mTempRect, r9, r10);
    }

    public void setMeasurementCacheEnabled(boolean r1) {
        this.mMeasurementCacheEnabled = r1;
    }

    public void setRecyclerView(RecyclerView r2) {
        if (r2 != null) goto L4;
        this.mRecyclerView = null;
        this.mChildHelper = null;
        this.mWidth = 0;
        this.mHeight = 0;
    L5:
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
        return;
    L4:
        this.mRecyclerView = r2;
        this.mChildHelper = r2.mChildHelper;
        this.mWidth = r2.getWidth();
        this.mHeight = r2.getHeight();
        goto L5
    }

    public boolean shouldMeasureChild(View r3, int r4, int r5, C2431qv r6) {
        if (r3.isLayoutRequested() == false) goto L5;
        return true;
    L5:
        if (this.mMeasurementCacheEnabled == true) goto L7;
        return true;
    L7:
        if (m2251b(r3.getWidth(), r4, ((ViewGroup.MarginLayoutParams) r6).width) == true) goto L9;
        return true;
    L9:
        if (m2251b(r3.getHeight(), r5, ((ViewGroup.MarginLayoutParams) r6).height) == false) goto L17;
        return false;
    L17:
        return true;
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View r3, int r4, int r5, C2431qv r6) {
        if (this.mMeasurementCacheEnabled == true) goto L5;
        return true;
    L5:
        if (m2251b(r3.getMeasuredWidth(), r4, ((ViewGroup.MarginLayoutParams) r6).width) == true) goto L7;
        return true;
    L7:
        if (m2251b(r3.getMeasuredHeight(), r5, ((ViewGroup.MarginLayoutParams) r6).height) == false) goto L14;
        return false;
    L14:
        return true;
    }

    public abstract void smoothScrollToPosition(RecyclerView r1, C0038Av r2, int r3);

    @SuppressLint({"UnknownNullness"})
    public void startSmoothScroll(AbstractC1164m r2) {
        AbstractC1164m r0 = this.mSmoothScroller;
        if (r0 == null) goto L8;
        if (r2 == r0) goto L8;
        if (r0.isRunning() == false) goto L8;
        this.mSmoothScroller.stop();
    L8:
        this.mSmoothScroller = r2;
        r2.start(this.mRecyclerView, this);
    }

    public void stopIgnoringView(View r2) {
        AbstractC1166o r22 = RecyclerView.getChildViewHolderInt(r2);
        r22.stopIgnoring();
        r22.resetInternal();
        r22.addFlags(4);
    }

    public void stopSmoothScroller() {
        AbstractC1164m r0 = this.mSmoothScroller;
        if (r0 == null) goto L6;
        r0.stop();
        return;
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public void addDisappearingView(View r2, int r3) {
        m2252a(r2, r3, true);
    }

    @SuppressLint({"UnknownNullness"})
    public void addView(View r2, int r3) {
        m2252a(r2, r3, false);
    }

    public void onInitializeAccessibilityEvent(C1161j r2, C0038Av r3, AccessibilityEvent r4) {
        RecyclerView r22 = this.mRecyclerView;
        if (r22 == null) goto L20;
        if (r4 == null) goto L22;
        boolean r32 = true;
        if (r22.canScrollVertically(1) == false) goto L9;
    L16:
        r4.setScrollable(r32);
        AbstractC1158g r23 = this.mRecyclerView.mAdapter;
        if (r23 == null) goto L21;
        r4.setItemCount(r23.getItemCount());
        return;
    L21:
        return;
    L9:
        if (this.mRecyclerView.canScrollVertically(-1) == true) goto L16;
        if (this.mRecyclerView.canScrollHorizontally(-1) == true) goto L16;
        if (this.mRecyclerView.canScrollHorizontally(1) == true) goto L16;
        r32 = false;
        goto L16
    L22:
        return;
    }

    public void onInitializeAccessibilityNodeInfo(C1161j r4, C0038Av r5, C1118a0 r6) {
        if (this.mRecyclerView.canScrollVertically(-1) == false) goto L5;
    L6:
        r6.m2040a(8192);
        r6.m2048j(true);
    L8:
        if (this.mRecyclerView.canScrollVertically(1) == false) goto L10;
    L11:
        r6.m2040a(4096);
        r6.m2048j(true);
    L12:
        AccessibilityNodeInfo.CollectionInfo r42 = AccessibilityNodeInfo.CollectionInfo.obtain(getRowCountForAccessibility(r4, r5), getColumnCountForAccessibility(r4, r5), isLayoutHierarchical(r4, r5), getSelectionModeForAccessibility(r4, r5));
        r6.f3530a.setCollectionInfo(r42);
        return;
    L10:
        if (this.mRecyclerView.canScrollHorizontally(1) == false) goto L12;
    L5:
        if (this.mRecyclerView.canScrollHorizontally(-1) == false) goto L8;
        goto L6
    }

    public void onItemsUpdated(RecyclerView r1, int r2, int r3, Object r4) {
        onItemsUpdated(r1, r2, r3);
    }

    public boolean onRequestChildFocus(RecyclerView r1, C0038Av r2, View r3, View r4) {
        return onRequestChildFocus(r1, r3, r4);
    }

    public boolean performAccessibilityAction(C1161j r9, C0038Av r10, int r11, Bundle r12) {
        if (this.mRecyclerView != null) goto L5;
        return false;
    L5:
        int r92 = getHeight();
        int r122 = getWidth();
        Rect r0 = new Rect();
        if (this.mRecyclerView.getMatrix().isIdentity() == false) goto L11;
        if (this.mRecyclerView.getGlobalVisibleRect(r0) == false) goto L11;
        r92 = r0.height();
        r122 = r0.width();
    L11:
        if (r11 == 4096) goto L25;
        if (r11 == 8192) goto L16;
        int r3 = 0;
        int r4 = 0;
    L31:
        if (r4 != 0) goto L34;
        if (r3 != 0) goto L34;
        return false;
    L34:
        this.mRecyclerView.smoothScrollBy(r3, r4, null, Integer.MIN_VALUE, true);
        return true;
    L16:
        if (this.mRecyclerView.canScrollVertically(-1) == false) goto L18;
        int r93 = -((r92 - getPaddingTop()) - getPaddingBottom());
    L20:
        if (this.mRecyclerView.canScrollHorizontally(-1) == false) goto L23;
        int r112 = -((r122 - getPaddingLeft()) - getPaddingRight());
    L22:
        r4 = r93;
        r3 = r112;
    L23:
        r4 = r93;
        r3 = 0;
        goto L31
    L18:
        r93 = 0;
        goto L20
    L25:
        if (this.mRecyclerView.canScrollVertically(1) == false) goto L27;
        r93 = (r92 - getPaddingTop()) - getPaddingBottom();
    L29:
        if (this.mRecyclerView.canScrollHorizontally(1) == false) goto L23;
        r112 = (r122 - getPaddingLeft()) - getPaddingRight();
        goto L22
    L27:
        r93 = 0;
        goto L29
    }

    public boolean performAccessibilityActionForItem(C1161j r1, C0038Av r2, View r3, int r4, Bundle r5) {
        return false;
    }

    public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
        int r42 = Math.max(0, r4 - r6);
        if (r8 == false) goto L11;
        if (r7 < 0) goto L6;
    L5:
        r5 = 1073741824;
    L22:
        return View.MeasureSpec.makeMeasureSpec(r7, r5);
    L6:
        if (r7 != (-1)) goto L10;
        if (r5 == Integer.MIN_VALUE) goto L14;
        if (r5 == 0) goto L10;
        if (r5 != 1073741824) goto L10;
    L14:
        r7 = r42;
    L10:
        r5 = 0;
        r7 = 0;
        goto L22
    L11:
        if (r7 >= 0) goto L5;
        if (r7 == (-1)) goto L14;
        if (r7 != (-2)) goto L10;
        if (r5 == Integer.MIN_VALUE) goto L20;
        if (r5 == 1073741824) goto L20;
        r7 = r42;
        r5 = 0;
    L20:
        r7 = r42;
        r5 = Integer.MIN_VALUE;
        goto L22
    }

    @SuppressLint({"UnknownNullness"})
    public C2431qv generateLayoutParams(Context r2, AttributeSet r3) {
        return new C2431qv(r2, r3);
    }

    public void onInitializeAccessibilityNodeInfoForItem(C1161j r1, C0038Av r2, View r3, C1118a0 r4) {
    }

    public void setMeasuredDimension(int r2, int r3) {
        RecyclerView.access$500(this.mRecyclerView, r2, r3);
    }

    public void attachView(View r2, int r3) {
        attachView(r2, r3, (C2431qv) r2.getLayoutParams());
    }

    public void attachView(View r2) {
        attachView(r2, -1);
    }

    public boolean requestChildRectangleOnScreen(RecyclerView r7, View r8, Rect r9, boolean r10) {
        return requestChildRectangleOnScreen(r7, r8, r9, r10, false);
    }
}
