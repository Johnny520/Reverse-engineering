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

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC1160i implements InterfaceC2818zv {

    /* JADX INFO: renamed from: a */
    public final C0751Re f4505a;

    /* JADX INFO: renamed from: b */
    public AbstractC0887Ul f4506b;

    /* JADX INFO: renamed from: c */
    public final View.OnLayoutChangeListener f4507c;

    public CarouselLayoutManager() {
        C0751Re c0751Re = new C0751Re();
        new C0909V6();
        this.f4507c = new View.OnLayoutChangeListener() { // from class: T6
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                view.post(new RunnableC0562N2(1, this.f2595a));
            }
        };
        this.f4505a = c0751Re;
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
    public final int computeHorizontalScrollExtent(C0038Av c0038Av) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollOffset(C0038Av c0038Av) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollRange(C0038Av c0038Av) {
        return 0;
    }

    @Override // p000.InterfaceC2818zv
    public final PointF computeScrollVectorForPosition(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollExtent(C0038Av c0038Av) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollOffset(C0038Av c0038Av) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollRange(C0038Av c0038Av) {
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final float m2457d(float f, float f2) {
        return m2459f() ? f - f2 : f + f2;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2458e() {
        return this.f4506b.f2775a == 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2459f() {
        return m2458e() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateDefaultLayoutParams() {
        return new C2431qv(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerY();
        if (m2458e()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void measureChildWithMargins(View view, int i, int i2) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        C0751Re c0751Re = this.f4505a;
        float dimension = c0751Re.f2387a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0751Re.f2387a = dimension;
        float dimension2 = c0751Re.f2388b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0751Re.f2388b = dimension2;
        requestLayout();
        recyclerView.addOnLayoutChangeListener(this.f4507c);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onDetachedFromWindow(RecyclerView recyclerView, C1161j c1161j) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.f4507c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    @Override // androidx.recyclerview.widget.AbstractC1160i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, C1161j c1161j, C0038Av c0038Av) {
        byte b;
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = this.f4506b.f2775a;
        if (i == 1) {
            b = -1;
        } else if (i == 2) {
            b = 1;
        } else if (i == 17) {
            if (i2 == 0) {
                if (m2459f()) {
                }
            }
            b = -2147483648;
        } else if (i != 33) {
            if (i == 66) {
                if (i2 == 0) {
                    if (m2459f()) {
                    }
                }
                b = -2147483648;
            } else if (i != 130 || i2 != 1) {
                b = -2147483648;
            }
        } else if (i2 == 1) {
        }
        if (b == -2147483648) {
            return null;
        }
        if (b == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            int position = getPosition(getChildAt(0)) - 1;
            if (position < 0 || position >= getItemCount()) {
                return getChildAt(m2459f() ? getChildCount() - 1 : 0);
            }
            this.f4506b.mo1739h();
            throw null;
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        int position2 = getPosition(getChildAt(getChildCount() - 1)) + 1;
        if (position2 < 0 || position2 >= getItemCount()) {
            return getChildAt(m2459f() ? 0 : getChildCount() - 1);
        }
        this.f4506b.mo1739h();
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutChildren(C1161j c1161j, C0038Av c0038Av) {
        if (c0038Av.m58b() > 0) {
            if ((m2458e() ? getWidth() : getHeight()) > 0.0f) {
                m2459f();
                measureChildWithMargins(c1161j.m2258d(0), 0, 0);
                throw null;
            }
        }
        removeAndRecycleAllViews(c1161j);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutCompleted(C0038Av c0038Av) {
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int scrollHorizontallyBy(int i, C1161j c1161j, C0038Av c0038Av) {
        if (!m2458e() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        measureChildWithMargins(c1161j.m2258d(0), 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void scrollToPosition(int i) {
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int scrollVerticallyBy(int i, C1161j c1161j, C0038Av c0038Av) {
        if (!canScrollVertically() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        measureChildWithMargins(c1161j.m2258d(0), 0, 0);
        throw null;
    }

    public final void setOrientation(int i) {
        C0952W6 c0952w6;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        AbstractC0887Ul abstractC0887Ul = this.f4506b;
        if (abstractC0887Ul == null || i != abstractC0887Ul.f2775a) {
            if (i == 0) {
                c0952w6 = new C0952W6(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c0952w6 = new C0952W6(this, 0);
            }
            this.f4506b = c0952w6;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void smoothScrollToPosition(RecyclerView recyclerView, C0038Av c0038Av, int i) {
        C0866U6 c0866u6 = new C0866U6(this, recyclerView.getContext());
        c0866u6.setTargetPosition(i);
        startSmoothScroll(c0866u6);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C0909V6();
        this.f4507c = new View.OnLayoutChangeListener() { // from class: T6
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i32 - i3 == i7 - i5 && i4 - i22 == i8 - i6) {
                    return;
                }
                view.post(new RunnableC0562N2(1, this.f2595a));
            }
        };
        this.f4505a = new C0751Re();
        requestLayout();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2933b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
