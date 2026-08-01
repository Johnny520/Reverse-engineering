package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eq extends defpackage.zt {
    public final /* synthetic */ int e;
    public final com.google.android.material.sidesheet.SideSheetBehavior f;

    public /* synthetic */ eq(com.google.android.material.sidesheet.SideSheetBehavior r1, int r2) {
            r0 = this;
            r0.e = r2
            r0.f = r1
            r0.<init>()
            return
    }

    @Override // defpackage.zt
    public final boolean A(float r2) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
        Le:
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
    }

    @Override // defpackage.zt
    public final boolean C(android.view.View r3) {
            r2 = this;
            int r0 = r2.e
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            int r3 = r3.getLeft()
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.f
            int r0 = r0.m
            int r1 = r2.l()
            int r1 = r1 + r0
            int r1 = r1 / 2
            if (r3 <= r1) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            return r3
        L1a:
            int r3 = r3.getRight()
            int r0 = r2.l()
            int r1 = r2.m()
            int r0 = r0 - r1
            int r0 = r0 / 2
            if (r3 >= r0) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            return r3
    }

    @Override // defpackage.zt
    public final boolean D(float r2, float r3) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto L20;
                default: goto L5;
            }
        L5:
            float r0 = java.lang.Math.abs(r2)
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L1e
            float r2 = java.lang.Math.abs(r2)
            r3 = 500(0x1f4, float:7.0E-43)
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            return r2
        L20:
            float r0 = java.lang.Math.abs(r2)
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L39
            float r2 = java.lang.Math.abs(r2)
            r3 = 500(0x1f4, float:7.0E-43)
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L39
            r2 = 1
            goto L3a
        L39:
            r2 = 0
        L3a:
            return r2
    }

    @Override // defpackage.zt
    public final boolean P(android.view.View r3, float r4) {
            r2 = this;
            int r0 = r2.e
            switch(r0) {
                case 0: goto L21;
                default: goto L5;
            }
        L5:
            int r3 = r3.getRight()
            float r3 = (float) r3
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.f
            float r1 = r0.k
            float r4 = r4 * r1
            float r4 = r4 + r3
            float r3 = java.lang.Math.abs(r4)
            r0.getClass()
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            return r3
        L21:
            int r3 = r3.getLeft()
            float r3 = (float) r3
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.f
            float r1 = r0.k
            float r4 = r4 * r1
            float r4 = r4 + r3
            float r3 = java.lang.Math.abs(r4)
            r0.getClass()
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r3 = 1
            goto L3c
        L3b:
            r3 = 0
        L3c:
            return r3
    }

    @Override // defpackage.zt
    public final void R(android.view.ViewGroup.MarginLayoutParams r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            com.google.android.material.sidesheet.SideSheetBehavior r4 = r1.f
            int r4 = r4.m
            if (r3 > r4) goto Le
            int r4 = r4 - r3
            r2.rightMargin = r4
        Le:
            return
        Lf:
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.f
            int r0 = r0.m
            if (r3 > r0) goto L17
            r2.leftMargin = r4
        L17:
            return
    }

    @Override // defpackage.zt
    public final int a(android.view.ViewGroup.MarginLayoutParams r2) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r2 = r2.rightMargin
            return r2
        L8:
            int r2 = r2.leftMargin
            return r2
    }

    @Override // defpackage.zt
    public final float b(int r3) {
            r2 = this;
            int r0 = r2.e
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.f
            int r0 = r0.m
            float r0 = (float) r0
            int r1 = r2.l()
            float r1 = (float) r1
            float r1 = r0 - r1
            float r3 = (float) r3
            float r0 = r0 - r3
            float r0 = r0 / r1
            return r0
        L15:
            int r0 = r2.m()
            float r0 = (float) r0
            int r1 = r2.l()
            float r1 = (float) r1
            float r1 = r1 - r0
            float r3 = (float) r3
            float r3 = r3 - r0
            float r3 = r3 / r1
            return r3
    }

    @Override // defpackage.zt
    public final int l() {
            r3 = this;
            int r0 = r3.e
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r3.f
            int r1 = r0.m
            int r2 = r0.l
            int r1 = r1 - r2
            int r0 = r0.o
            int r1 = r1 - r0
            r0 = 0
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L15:
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r3.f
            int r1 = r0.n
            int r0 = r0.o
            int r1 = r1 + r0
            r0 = 0
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // defpackage.zt
    public final int m() {
            r2 = this;
            int r0 = r2.e
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.f
            int r0 = r0.m
            return r0
        La:
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.f
            int r1 = r0.l
            int r1 = -r1
            int r0 = r0.o
            int r1 = r1 - r0
            return r1
    }

    @Override // defpackage.zt
    public final int n() {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.f
            int r0 = r0.m
            return r0
        La:
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.f
            int r0 = r0.o
            return r0
    }

    @Override // defpackage.zt
    public final int o() {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r0 = r1.l()
            return r0
        La:
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.f
            int r0 = r0.l
            int r0 = -r0
            return r0
    }

    @Override // defpackage.zt
    public final int q(android.view.View r2) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            int r2 = r2.getLeft()
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.f
            int r0 = r0.o
            int r2 = r2 - r0
            return r2
        Lf:
            int r2 = r2.getRight()
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.f
            int r0 = r0.o
            int r2 = r2 + r0
            return r2
    }

    @Override // defpackage.zt
    public final int u(androidx.coordinatorlayout.widget.CoordinatorLayout r2) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r2 = r2.getRight()
            return r2
        La:
            int r2 = r2.getLeft()
            return r2
    }

    @Override // defpackage.zt
    public final int v() {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            r0 = 1
            return r0
    }
}
