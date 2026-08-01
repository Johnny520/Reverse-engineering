package p000;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: ae */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0015ae implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f136a;

    public ViewTreeObserverOnPreDrawListenerC0015ae(CoordinatorLayout coordinatorLayout) {
        this.f136a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f136a.m223p(0);
        return true;
    }
}
