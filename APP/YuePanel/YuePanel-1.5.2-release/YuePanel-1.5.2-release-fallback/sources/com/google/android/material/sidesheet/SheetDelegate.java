package com.google.android.material.sidesheet;

/* JADX INFO: loaded from: classes.dex */
abstract class SheetDelegate {
    public SheetDelegate() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract int calculateInnerMargin(@Yue.InterfaceC4410 android.view.ViewGroup.MarginLayoutParams r1);

    public abstract float calculateSlideOffset(int r1);

    public abstract int getCoplanarSiblingAdjacentMargin(@Yue.InterfaceC4410 android.view.ViewGroup.MarginLayoutParams r1);

    public abstract int getExpandedOffset();

    public abstract int getHiddenOffset();

    public abstract int getMaxViewPositionHorizontal();

    public abstract int getMinViewPositionHorizontal();

    public abstract <V extends android.view.View> int getOuterEdge(@Yue.InterfaceC4410 V r1);

    public abstract int getParentInnerEdge(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1);

    public abstract int getSheetEdge();

    public abstract boolean isExpandingOutwards(float r1);

    public abstract boolean isReleasedCloseToInnerEdge(@Yue.InterfaceC4410 android.view.View r1);

    public abstract boolean isSwipeSignificant(float r1, float r2);

    public abstract boolean shouldHide(@Yue.InterfaceC4410 android.view.View r1, float r2);

    public abstract void updateCoplanarSiblingAdjacentMargin(@Yue.InterfaceC4410 android.view.ViewGroup.MarginLayoutParams r1, int r2);

    public abstract void updateCoplanarSiblingLayoutParams(@Yue.InterfaceC4410 android.view.ViewGroup.MarginLayoutParams r1, int r2, int r3);
}
