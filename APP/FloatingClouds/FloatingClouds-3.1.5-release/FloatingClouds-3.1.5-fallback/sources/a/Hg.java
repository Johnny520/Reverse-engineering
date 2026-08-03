package a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Hg<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.Qe f117a;
    public int b;

    public Hg() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            return
    }

    public Hg(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.b = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
            r0 = this;
            r0.u(r1, r2, r3)
            a.Qe r1 = r0.f117a
            if (r1 != 0) goto L10
            a.Qe r1 = new a.Qe
            r1.<init>()
            r1.d = r2
            r0.f117a = r1
        L10:
            a.Qe r1 = r0.f117a
            java.lang.Object r2 = r1.d
            android.view.View r2 = (android.view.View) r2
            int r3 = r2.getTop()
            r1.f233a = r3
            int r2 = r2.getLeft()
            r1.b = r2
            a.Qe r1 = r0.f117a
            r1.b()
            int r1 = r0.b
            if (r1 == 0) goto L39
            a.Qe r2 = r0.f117a
            int r3 = r2.c
            if (r3 == r1) goto L36
            r2.c = r1
            r2.b()
        L36:
            r1 = 0
            r0.b = r1
        L39:
            r1 = 1
            return r1
    }

    public final int s() {
            r1 = this;
            a.Qe r0 = r1.f117a
            if (r0 == 0) goto L7
            int r0 = r0.c
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int t() {
            r1 = this;
            int r0 = r1.s()
            return r0
    }

    public void u(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
            r0 = this;
            r1.q(r2, r3)
            return
    }
}
