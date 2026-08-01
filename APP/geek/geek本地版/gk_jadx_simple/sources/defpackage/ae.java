package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ae implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout a;

    public ae(CoordinatorLayout r1) {
        this.a = r1;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.p(0);
        return true;
    }
}
