package p000;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: be */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0065be implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f725a;

    public ViewTreeObserverOnPreDrawListenerC0065be(CoordinatorLayout coordinatorLayout) {
        this.f725a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f725a.m208p(0);
        return true;
    }
}
