package com.google.android.material.appbar;

import Yue.C5194;
import Yue.C6132;
import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    private static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @InterfaceC6490
    public abstract View findFirstDependency(List<View> list);

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        return C6132.m18838((int) (overlapRatioForOffset * i), 0, i);
    }

    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public int getScrollRange(@InterfaceC6391 View view) {
        return view.getMeasuredHeight();
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view, int i) {
        View viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (viewFindFirstDependency == null) {
            super.layoutChild(coordinatorLayout, view, i);
            this.verticalLayoutGap = 0;
            return;
        }
        CoordinatorLayout.C8796 c8796 = (CoordinatorLayout.C8796) view.getLayoutParams();
        Rect rect = this.tempRect1;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c8796).leftMargin, viewFindFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) c8796).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c8796).rightMargin, ((coordinatorLayout.getHeight() + viewFindFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c8796).bottomMargin);
        C8472 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && C8273.m27350(coordinatorLayout) && !C8273.m27350(view)) {
            rect.left += lastWindowInsets.m28291();
            rect.right -= lastWindowInsets.m28292();
        }
        Rect rect2 = this.tempRect2;
        C5194.m1974(resolveGravity(c8796.f29435), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
        view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
        this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public boolean onMeasureChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        View viewFindFirstDependency;
        C8472 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C8273.m27350(viewFindFirstDependency) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m28293() + lastWindowInsets.m28290();
        }
        int scrollRange = size + getScrollRange(viewFindFirstDependency);
        int measuredHeight = viewFindFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            scrollRange -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }
}
