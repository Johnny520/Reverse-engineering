package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {
    public SearchBar$ScrollingViewBehavior() {
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, defpackage.wd
    public final boolean d(CoordinatorLayout r1, View r2, View r3) {
        super.d(r1, r2, r3);
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context r1, AttributeSet r2) {
        super(r1, r2);
    }
}
