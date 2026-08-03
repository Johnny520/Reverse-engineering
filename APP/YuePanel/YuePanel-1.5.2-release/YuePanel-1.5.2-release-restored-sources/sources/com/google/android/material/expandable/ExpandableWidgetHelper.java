package com.google.android.material.expandable;

import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandableWidgetHelper {
    private boolean expanded = false;

    @InterfaceC5411
    private int expandedComponentIdHint = 0;

    @InterfaceC6391
    private final View widget;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.android.material.expandable.ExpandableWidget */
    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableWidgetHelper(ExpandableWidget expandableWidget) {
        this.widget = (View) expandableWidget;
    }

    private void dispatchExpandedStateChanged() {
        ViewParent parent = this.widget.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.widget);
        }
    }

    @InterfaceC5411
    public int getExpandedComponentIdHint() {
        return this.expandedComponentIdHint;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public void onRestoreInstanceState(@InterfaceC6391 Bundle bundle) {
        this.expanded = bundle.getBoolean("expanded", false);
        this.expandedComponentIdHint = bundle.getInt("expandedComponentIdHint", 0);
        if (this.expanded) {
            dispatchExpandedStateChanged();
        }
    }

    @InterfaceC6391
    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.expanded);
        bundle.putInt("expandedComponentIdHint", this.expandedComponentIdHint);
        return bundle;
    }

    public boolean setExpanded(boolean z) {
        if (this.expanded == z) {
            return false;
        }
        this.expanded = z;
        dispatchExpandedStateChanged();
        return true;
    }

    public void setExpandedComponentIdHint(@InterfaceC5411 int i) {
        this.expandedComponentIdHint = i;
    }
}
