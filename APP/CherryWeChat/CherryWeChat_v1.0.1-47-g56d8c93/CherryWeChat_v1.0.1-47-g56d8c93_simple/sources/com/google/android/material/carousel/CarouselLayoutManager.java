package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.AbstractC1160i;
import androidx.recyclerview.widget.C1161j;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;
import p000.AbstractC0887Ul;
import p000.AbstractC0939Vu;
import p000.AbstractC2374ph;
import p000.C0038Av;
import p000.C0751Re;
import p000.C0866U6;
import p000.C0909V6;
import p000.C0952W6;
import p000.C2431qv;
import p000.InterfaceC2818zv;
import p000.ViewOnLayoutChangeListenerC0823T6;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC1160i implements InterfaceC2818zv {

    /* JADX INFO: renamed from: a */
    public final C0751Re f4505a;

    /* JADX INFO: renamed from: b */
    public AbstractC0887Ul f4506b;

    /* JADX INFO: renamed from: c */
    public final View.OnLayoutChangeListener f4507c;

    public CarouselLayoutManager() {
        C0751Re r0 = new C0751Re();
        new C0909V6();
        this.f4507c = new ViewOnLayoutChangeListenerC0823T6(this);
        this.f4505a = r0;
        requestLayout();
        setOrientation(0);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean canScrollHorizontally() {
        return m2458e();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean canScrollVertically() {
        return !m2458e();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollExtent(C0038Av r1) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollOffset(C0038Av r1) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollRange(C0038Av r1) {
        return 0;
    }

    @Override // p000.InterfaceC2818zv
    public final PointF computeScrollVectorForPosition(int r1) {
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollExtent(C0038Av r1) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollOffset(C0038Av r1) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollRange(C0038Av r1) {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final float m2457d(float r2, float r3) {
        if (m2459f() == false) goto L7;
        return r2 - r3;
    L7:
        return r2 + r3;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2458e() {
        if (this.f4506b.f2775a != 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2459f() {
        if (m2458e() == true) goto L5;
        return false;
    L5:
        if (getLayoutDirection() != 1) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateDefaultLayoutParams() {
        return new C2431qv(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void getDecoratedBoundsWithMargins(View r1, Rect r2) {
        super.getDecoratedBoundsWithMargins(r1, r2);
        r2.centerY();
        if (m2458e() == false) goto L6;
        r2.centerX();
    L6:
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void measureChildWithMargins(View r1, int r2, int r3) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onAttachedToWindow(RecyclerView r6) {
        super.onAttachedToWindow(r6);
        Context r0 = r6.getContext();
        C0751Re r1 = this.f4505a;
        float r2 = r1.f2387a;
        if (r2 > 0.0f) goto L6;
        r2 = r0.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    L6:
        r1.f2387a = r2;
        float r22 = r1.f2388b;
        if (r22 > 0.0f) goto L10;
        r22 = r0.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    L10:
        r1.f2388b = r22;
        requestLayout();
        r6.addOnLayoutChangeListener(this.f4507c);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onDetachedFromWindow(RecyclerView r1, C1161j r2) {
        onDetachedFromWindow(r1);
        r1.removeOnLayoutChangeListener(this.f4507c);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final View onFocusSearchFailed(View r4, int r5, C1161j r6, C0038Av r7) {
        if (getChildCount() == 0) goto L66;
        int r62 = this.f4506b.f2775a;
        if (r5 != 1) goto L8;
    L23:
        byte r52 = -1;
    L30:
        if (r52 == (-2147483648)) goto L67;
        int r63 = 0;
        if (r52 != (-1)) goto L50;
        if (getPosition(r4) == 0) goto L68;
        int r42 = getPosition(getChildAt(0)) - 1;
        if (r42 < 0) goto L45;
        if (r42 >= getItemCount()) goto L45;
        this.f4506b.mo1739h();
        throw null;
    L45:
        if (m2459f() == false) goto L48;
        r63 = getChildCount() - 1;
    L48:
        return getChildAt(r63);
    L68:
        return null;
    L50:
        if (getPosition(r4) != (getItemCount() - 1)) goto L53;
        return null;
    L53:
        int r43 = getPosition(getChildAt(getChildCount() - 1)) + 1;
        if (r43 < 0) goto L61;
        if (r43 >= getItemCount()) goto L61;
        this.f4506b.mo1739h();
        throw null;
    L61:
        if (m2459f() == true) goto L65;
        r63 = getChildCount() - 1;
    L65:
        return getChildAt(r63);
    L67:
        return null;
    L8:
        if (r5 != 2) goto L10;
    L19:
        r52 = 1;
        goto L30
    L10:
        if (r5 != 17) goto L12;
        if (r62 == 0) goto L28;
    L17:
        r52 = -2147483648;
        goto L30
    L28:
        if (m2459f() == false) goto L23;
    L12:
        if (r5 != 33) goto L14;
        if (r62 != 1) goto L17;
    L14:
        if (r5 != 66) goto L16;
        if (r62 != 0) goto L17;
        if (m2459f() == false) goto L19;
    L16:
        if (r5 != 130) goto L17;
        if (r62 != 1) goto L17;
    L66:
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        if (getChildCount() <= 0) goto L6;
        r2.setFromIndex(getPosition(getChildAt(0)));
        r2.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsAdded(RecyclerView r1, int r2, int r3) {
        super.onItemsAdded(r1, r2, r3);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsChanged(RecyclerView r1) {
        super.onItemsChanged(r1);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsRemoved(RecyclerView r1, int r2, int r3) {
        super.onItemsRemoved(r1, r2, r3);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutChildren(C1161j r2, C0038Av r3) {
        if (r3.m58b() > 0) goto L5;
    L13:
        removeAndRecycleAllViews(r2);
        return;
    L5:
        if (m2458e() == false) goto L7;
        int r32 = getWidth();
    L9:
        if (r32 <= 0.0f) goto L13;
        m2459f();
        measureChildWithMargins(r2.m2258d(0), 0, 0);
        throw null;
    L7:
        r32 = getHeight();
        goto L9
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutCompleted(C0038Av r1) {
        if (getChildCount() != 0) goto L5;
        return;
    L5:
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean requestChildRectangleOnScreen(RecyclerView r1, View r2, Rect r3, boolean r4, boolean r5) {
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int scrollHorizontallyBy(int r2, C1161j r3, C0038Av r4) {
        if (m2458e() == true) goto L5;
    L10:
        return 0;
    L5:
        if (getChildCount() == 0) goto L10;
        if (r2 == 0) goto L10;
        measureChildWithMargins(r3.m2258d(0), 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void scrollToPosition(int r1) {
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int scrollVerticallyBy(int r2, C1161j r3, C0038Av r4) {
        if (canScrollVertically() == true) goto L5;
    L10:
        return 0;
    L5:
        if (getChildCount() == 0) goto L10;
        if (r2 == 0) goto L10;
        measureChildWithMargins(r3.m2258d(0), 0, 0);
        throw null;
    }

    public final void setOrientation(int r3) {
        if (r3 == 0) goto L8;
        if (r3 == 1) goto L8;
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r3, "invalid orientation:"));
    L8:
        assertNotInLayoutOrScroll(null);
        AbstractC0887Ul r1 = this.f4506b;
        if (r1 != null) goto L11;
    L14:
        if (r3 == 0) goto L19;
        if (r3 != 1) goto L18;
        C0952W6 r32 = new C0952W6(this, 0);
    L20:
        this.f4506b = r32;
        requestLayout();
        return;
    L18:
        throw new IllegalArgumentException("invalid orientation");
    L19:
        r32 = new C0952W6(this, 1);
        goto L20
    L11:
        if (r3 != r1.f2775a) goto L14;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void smoothScrollToPosition(RecyclerView r1, C0038Av r2, int r3) {
        C0866U6 r22 = new C0866U6(this, r1.getContext());
        r22.setTargetPosition(r3);
        startSmoothScroll(r22);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context r1, AttributeSet r2, int r3, int r4) {
        new C0909V6();
        this.f4507c = new ViewOnLayoutChangeListenerC0823T6(this);
        this.f4505a = new C0751Re();
        requestLayout();
        if (r2 == null) goto L6;
        TypedArray r12 = r1.obtainStyledAttributes(r2, AbstractC0939Vu.f2933b);
        r12.getInt(0, 0);
        requestLayout();
        setOrientation(r12.getInt(0, 0));
        r12.recycle();
        return;
    }
}
