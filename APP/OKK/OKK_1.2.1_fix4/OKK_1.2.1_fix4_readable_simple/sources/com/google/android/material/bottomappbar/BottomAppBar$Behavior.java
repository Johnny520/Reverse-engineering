package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import p034S.AbstractC0324d;
import p066k0.ViewOnLayoutChangeListenerC0977a;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior<Object> {
    public BottomAppBar$Behavior() {
        new ViewOnLayoutChangeListenerC0977a(this);
        new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout r1, View r2, int r3) {
        AbstractC0324d.m724g(r2);
        throw null;
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, p078r.AbstractC1058a
    /* JADX INFO: renamed from: o */
    public final boolean mo1822o(View r1, int r2, int r3) {
        AbstractC0324d.m724g(r1);
        throw null;
    }

    public BottomAppBar$Behavior(Context r1, AttributeSet r2) {
        super(r1, r2);
        new ViewOnLayoutChangeListenerC0977a(this);
        new Rect();
    }
}
