package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ta0 extends defpackage.wd {
    public defpackage.au a;

    @Override // defpackage.wd
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, int r4) {
            r1 = this;
            r1.r(r2, r3, r4)
            au r2 = r1.a
            if (r2 != 0) goto Le
            au r2 = new au
            r2.<init>(r3)
            r1.a = r2
        Le:
            au r2 = r1.a
            java.lang.Object r3 = r2.a
            android.view.View r3 = (android.view.View) r3
            int r4 = r3.getTop()
            r2.b = r4
            int r3 = r3.getLeft()
            r2.c = r3
            au r2 = r1.a
            java.lang.Object r3 = r2.a
            android.view.View r3 = (android.view.View) r3
            int r4 = r3.getTop()
            int r0 = r2.b
            int r4 = r4 - r0
            int r4 = 0 - r4
            java.util.WeakHashMap r0 = defpackage.ja0.a
            r3.offsetTopAndBottom(r4)
            int r4 = r3.getLeft()
            int r2 = r2.c
            int r4 = r4 - r2
            int r2 = 0 - r4
            r3.offsetLeftAndRight(r2)
            r2 = 1
            return r2
    }

    public void r(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
            r0 = this;
            r1.q(r2, r3)
            return
    }
}
