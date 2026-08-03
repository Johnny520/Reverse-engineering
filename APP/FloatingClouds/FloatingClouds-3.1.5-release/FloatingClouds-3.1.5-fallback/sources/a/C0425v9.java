package a;

/* JADX INFO: renamed from: a.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0425v9 extends a.AbstractC0090ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> f736a;

    public C0425v9(com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r1) {
            r0 = this;
            r0.<init>()
            r0.f736a = r1
            return
    }

    @Override // a.AbstractC0090ce
    public final int a(android.view.ViewGroup.MarginLayoutParams r1) {
            r0 = this;
            int r1 = r1.leftMargin
            return r1
    }

    @Override // a.AbstractC0090ce
    public final float b(int r3) {
            r2 = this;
            int r0 = r2.d()
            float r0 = (float) r0
            int r1 = r2.c()
            float r1 = (float) r1
            float r1 = r1 - r0
            float r3 = (float) r3
            float r3 = r3 - r0
            float r3 = r3 / r1
            return r3
    }

    @Override // a.AbstractC0090ce
    public final int c() {
            r2 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r2.f736a
            int r1 = r0.n
            int r0 = r0.o
            int r1 = r1 + r0
            r0 = 0
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // a.AbstractC0090ce
    public final int d() {
            r2 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r2.f736a
            int r1 = r0.l
            int r1 = -r1
            int r0 = r0.o
            int r1 = r1 - r0
            return r1
    }

    @Override // a.AbstractC0090ce
    public final int e() {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.f736a
            int r0 = r0.o
            return r0
    }

    @Override // a.AbstractC0090ce
    public final int f() {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.f736a
            int r0 = r0.l
            int r0 = -r0
            return r0
    }

    @Override // a.AbstractC0090ce
    public final <V extends android.view.View> int g(V r2) {
            r1 = this;
            int r2 = r2.getRight()
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.f736a
            int r0 = r0.o
            int r2 = r2 + r0
            return r2
    }

    @Override // a.AbstractC0090ce
    public final int h(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
            r0 = this;
            int r1 = r1.getLeft()
            return r1
    }

    @Override // a.AbstractC0090ce
    public final int i() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // a.AbstractC0090ce
    public final boolean j(float r2) {
            r1 = this;
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    @Override // a.AbstractC0090ce
    public final boolean k(android.view.View r3) {
            r2 = this;
            int r3 = r3.getRight()
            int r0 = r2.c()
            int r1 = r2.d()
            int r0 = r0 - r1
            int r0 = r0 / 2
            if (r3 >= r0) goto L13
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    @Override // a.AbstractC0090ce
    public final boolean l(float r2, float r3) {
            r1 = this;
            float r0 = java.lang.Math.abs(r2)
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L1e
            float r2 = java.lang.Math.abs(r2)
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r3 = r1.f736a
            r3.getClass()
            r3 = 500(0x1f4, float:7.0E-43)
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1e
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    @Override // a.AbstractC0090ce
    public final boolean m(android.view.View r3, float r4) {
            r2 = this;
            int r3 = r3.getLeft()
            float r3 = (float) r3
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r2.f736a
            float r1 = r0.k
            float r4 = r4 * r1
            float r4 = r4 + r3
            float r3 = java.lang.Math.abs(r4)
            r0.getClass()
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // a.AbstractC0090ce
    public final void n(android.view.ViewGroup.MarginLayoutParams r2, int r3, int r4) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r0 = r1.f736a
            int r0 = r0.m
            if (r3 > r0) goto L8
            r2.leftMargin = r4
        L8:
            return
    }
}
