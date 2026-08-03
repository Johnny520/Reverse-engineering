package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: Sb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC0791Sb implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f2491a;

    public ViewGroupOnHierarchyChangeListenerC0791Sb(CoordinatorLayout r1) {
        this.f2491a = r1;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View r2, View r3) {
        ViewGroup.OnHierarchyChangeListener r0 = this.f2491a.f3907q;
        if (r0 == null) goto L6;
        r0.onChildViewAdded(r2, r3);
        return;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View r3, View r4) {
        CoordinatorLayout r1 = this.f2491a;
        r1.m2139o(2);
        ViewGroup.OnHierarchyChangeListener r0 = r1.f3907q;
        if (r0 == null) goto L6;
        r0.onChildViewRemoved(r3, r4);
        return;
    }
}
