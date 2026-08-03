package com.google.android.material.sidesheet;

import Yue.InterfaceC6391;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
abstract class SheetDelegate {
    public abstract int calculateInnerMargin(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float calculateSlideOffset(int i);

    public abstract int getCoplanarSiblingAdjacentMargin(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int getExpandedOffset();

    public abstract int getHiddenOffset();

    public abstract int getMaxViewPositionHorizontal();

    public abstract int getMinViewPositionHorizontal();

    public abstract <V extends View> int getOuterEdge(@InterfaceC6391 V v);

    public abstract int getParentInnerEdge(@InterfaceC6391 CoordinatorLayout coordinatorLayout);

    public abstract int getSheetEdge();

    public abstract boolean isExpandingOutwards(float f);

    public abstract boolean isReleasedCloseToInnerEdge(@InterfaceC6391 View view);

    public abstract boolean isSwipeSignificant(float f, float f2);

    public abstract boolean shouldHide(@InterfaceC6391 View view, float f);

    public abstract void updateCoplanarSiblingAdjacentMargin(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void updateCoplanarSiblingLayoutParams(@InterfaceC6391 ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);
}
