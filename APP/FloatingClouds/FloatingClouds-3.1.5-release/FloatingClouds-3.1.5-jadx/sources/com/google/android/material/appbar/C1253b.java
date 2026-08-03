package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p000a.C0038C;
import p000a.C0146I;

/* JADX INFO: renamed from: com.google.android.material.appbar.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1253b extends C0038C {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppBarLayout f5382d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CoordinatorLayout f5383e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AppBarLayout.BaseBehavior f5384f;

    public C1253b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f5384f = baseBehavior;
        this.f5382d = appBarLayout;
        this.f5383e = coordinatorLayout;
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: d */
    public final void mo115d(View view, C0146I c0146i) {
        AppBarLayout.BaseBehavior baseBehavior;
        View viewM3076B;
        this.f137a.onInitializeAccessibilityNodeInfo(view, c0146i.f505a);
        c0146i.m382h(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f5382d;
        if (appBarLayout.getTotalScrollRange() == 0 || (viewM3076B = AppBarLayout.BaseBehavior.m3076B((baseBehavior = this.f5384f), this.f5383e)) == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((AppBarLayout.C1251c) appBarLayout.getChildAt(i).getLayoutParams()).f5369a != 0) {
                if (baseBehavior.mo373t() != (-appBarLayout.getTotalScrollRange())) {
                    c0146i.m377b(C0146I.a.f508f);
                    c0146i.m383i(true);
                }
                if (baseBehavior.mo373t() != 0) {
                    if (!viewM3076B.canScrollVertically(-1)) {
                        c0146i.m377b(C0146I.a.f509g);
                        c0146i.m383i(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            c0146i.m377b(C0146I.a.f509g);
                            c0146i.m383i(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // p000a.C0038C
    /* JADX INFO: renamed from: g */
    public final boolean mo118g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.f5382d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.mo118g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f5384f;
        if (baseBehavior.mo373t() != 0) {
            View viewM3076B = AppBarLayout.BaseBehavior.m3076B(baseBehavior, this.f5383e);
            if (!viewM3076B.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                CoordinatorLayout coordinatorLayout = this.f5383e;
                AppBarLayout appBarLayout2 = this.f5382d;
                this.f5384f.m3080E(coordinatorLayout, appBarLayout2, viewM3076B, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
