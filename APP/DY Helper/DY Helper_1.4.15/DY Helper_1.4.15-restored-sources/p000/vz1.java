package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vz1 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f11494;

    /* JADX INFO: renamed from: β */
    public int f11495;

    /* JADX INFO: renamed from: γ */
    public int f11496;

    /* JADX INFO: renamed from: δ */
    public final int f11497;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.recyclerview.widget.StaggeredGridLayoutManager f11498;

    public vz1(androidx.recyclerview.widget.StaggeredGridLayoutManager r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f11498 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f11494 = r1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f11495 = r1
            r0.f11496 = r1
            r0.f11497 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m6289() {
            r3 = this;
            java.util.ArrayList r0 = r3.f11494
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            sz1 r1 = (p000.sz1) r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = r3.f11498
            р r2 = r2.f1188
            int r0 = r2.mo3523(r0)
            r3.f11496 = r0
            r1.getClass()
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m6290() {
            r1 = this;
            java.util.ArrayList r0 = r1.f11494
            r0.clear()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f11495 = r0
            r1.f11496 = r0
            return
    }

    /* JADX INFO: renamed from: γ */
    public final int m6291(int r3) {
            r2 = this;
            int r0 = r2.f11496
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            java.util.ArrayList r0 = r2.f11494
            int r0 = r0.size()
            if (r0 != 0) goto L10
            return r3
        L10:
            r2.m6289()
            int r2 = r2.f11496
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final int m6292(int r3) {
            r2 = this;
            int r0 = r2.f11495
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            java.util.ArrayList r0 = r2.f11494
            int r1 = r0.size()
            if (r1 != 0) goto L10
            return r3
        L10:
            r3 = 0
            java.lang.Object r3 = r0.get(r3)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            sz1 r0 = (p000.sz1) r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = r2.f11498
            р r1 = r1.f1188
            int r3 = r1.mo3524(r3)
            r2.f11495 = r3
            r0.getClass()
            int r2 = r2.f11495
            return r2
    }
}
