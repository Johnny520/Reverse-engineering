package com.google.android.material.transformation;

import Yue.C8273;
import Yue.InterfaceC3647;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC8792<View> {
    private static final int STATE_COLLAPSED = 2;
    private static final int STATE_EXPANDED = 1;
    private static final int STATE_UNINITIALIZED = 0;
    private int currentState;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExpandableBehavior() {
        this.currentState = 0;
    }

    private boolean didStateChange(boolean z) {
        if (!z) {
            return this.currentState == 1;
        }
        int i = this.currentState;
        return i == 0 || i == 2;
    }

    @InterfaceC6490
    public static <T extends ExpandableBehavior> T from(@InterfaceC6391 View view, @InterfaceC6391 Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C8796)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.AbstractC8792 abstractC8792M29508 = ((CoordinatorLayout.C8796) layoutParams).m29508();
        if (abstractC8792M29508 instanceof ExpandableBehavior) {
            return cls.cast(abstractC8792M29508);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6490
    public ExpandableWidget findExpandableWidget(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.view.View */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.google.android.material.expandable.ExpandableWidget */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    @InterfaceC3647
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (!didStateChange(expandableWidget.isExpanded())) {
            return false;
        }
        this.currentState = expandableWidget.isExpanded() ? 1 : 2;
        return onExpandedStateChange((View) expandableWidget, view, expandableWidget.isExpanded(), true);
    }

    public abstract boolean onExpandedStateChange(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
    @InterfaceC3647
    public boolean onLayoutChild(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 final View view, int i) {
        final ExpandableWidget expandableWidgetFindExpandableWidget;
        if (C8273.m27404(view) || (expandableWidgetFindExpandableWidget = findExpandableWidget(coordinatorLayout, view)) == null || !didStateChange(expandableWidgetFindExpandableWidget.isExpanded())) {
            return false;
        }
        final int i2 = expandableWidgetFindExpandableWidget.isExpanded() ? 1 : 2;
        this.currentState = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.google.android.material.expandable.ExpandableWidget */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ExpandableBehavior.this.currentState == i2) {
                    ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                    ExpandableWidget expandableWidget = expandableWidgetFindExpandableWidget;
                    expandableBehavior.onExpandedStateChange((View) expandableWidget, view, expandableWidget.isExpanded(), false);
                }
                return false;
            }
        });
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentState = 0;
    }
}
