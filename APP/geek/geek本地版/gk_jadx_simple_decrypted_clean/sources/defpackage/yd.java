package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class yd implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ CoordinatorLayout a;

    public yd(CoordinatorLayout r1) {
        this.a = r1;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View r2, View r3) {
        ViewGroup.OnHierarchyChangeListener r0 = this.a.q;
        if (r0 == null) goto L6;
        r0.onChildViewAdded(r2, r3);
        return;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View r3, View r4) {
        CoordinatorLayout r1 = this.a;
        r1.p(2);
        ViewGroup.OnHierarchyChangeListener r0 = r1.q;
        if (r0 == null) goto L6;
        r0.onChildViewRemoved(r3, r4);
        return;
    }
}
