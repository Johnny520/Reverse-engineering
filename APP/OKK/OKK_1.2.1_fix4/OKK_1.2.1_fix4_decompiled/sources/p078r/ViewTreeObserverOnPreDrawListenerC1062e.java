package p078r;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: r.e */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1062e implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f4080a;

    public ViewTreeObserverOnPreDrawListenerC1062e(CoordinatorLayout coordinatorLayout) {
        this.f4080a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f4080a.m1173o(0);
        return true;
    }
}
