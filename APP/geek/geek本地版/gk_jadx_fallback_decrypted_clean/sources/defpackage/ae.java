package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ae implements android.view.ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout a;

    public ae(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.a
            r1 = 0
            r0.p(r1)
            r0 = 1
            return r0
    }
}
