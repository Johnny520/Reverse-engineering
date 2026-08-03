package p078r;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: r.c */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC1060c implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f4063a;

    public ViewGroupOnHierarchyChangeListenerC1060c(CoordinatorLayout r1) {
        this.f4063a = r1;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View r2, View r3) {
        ViewGroup.OnHierarchyChangeListener r02 = this.f4063a.f1294q;
        if (r02 == null) goto L6;
        r02.onChildViewAdded(r2, r3);
        return;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View r3, View r4) {
        CoordinatorLayout r1 = this.f4063a;
        r1.m1173o(2);
        ViewGroup.OnHierarchyChangeListener r02 = r1.f1294q;
        if (r02 == null) goto L6;
        r02.onChildViewRemoved(r3, r4);
        return;
    }
}
