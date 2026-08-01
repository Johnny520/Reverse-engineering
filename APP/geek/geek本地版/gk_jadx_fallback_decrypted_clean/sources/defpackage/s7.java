package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s7 extends defpackage.gt {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.wd b;

    public /* synthetic */ s7(defpackage.wd r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.gt
    public final boolean H(android.view.View r5, int r6) {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            wd r6 = r4.b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.p
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            wd r0 = r4.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.L
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.a0
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.Y
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.V
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r6 = r0.U
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
    }

    @Override // defpackage.gt
    public final int b(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            wd r2 = r1.b
            com.google.android.material.sidesheet.SideSheetBehavior r2 = (com.google.android.material.sidesheet.SideSheetBehavior) r2
            zt r0 = r2.a
            int r0 = r0.o()
            zt r2 = r2.a
            int r2 = r2.n()
            int r2 = defpackage.ct.d(r3, r0, r2)
            return r2
        L1a:
            int r2 = r2.getLeft()
            return r2
    }

    @Override // defpackage.gt
    public final int c(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r2 = r2.getTop()
            return r2
        La:
            wd r2 = r1.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r2 = r2.x()
            int r0 = r1.m()
            int r2 = defpackage.ct.d(r3, r2, r0)
            return r2
    }

    @Override // defpackage.gt
    public int l(android.view.View r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            int r2 = super.l(r2)
            return r2
        La:
            wd r2 = r1.b
            com.google.android.material.sidesheet.SideSheetBehavior r2 = (com.google.android.material.sidesheet.SideSheetBehavior) r2
            int r0 = r2.l
            int r2 = r2.o
            int r0 = r0 + r2
            return r0
    }

    @Override // defpackage.gt
    public int m() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r0 = super.m()
            return r0
        La:
            wd r0 = r2.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            boolean r1 = r0.I
            if (r1 == 0) goto L15
            int r0 = r0.T
            goto L17
        L15:
            int r0 = r0.G
        L17:
            return r0
    }

    @Override // defpackage.gt
    public final void s(int r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            r0 = 1
            if (r3 != r0) goto L13
            wd r3 = r2.b
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            boolean r1 = r3.g
            if (r1 == 0) goto L13
            r3.r(r0)
        L13:
            return
        L14:
            r0 = 1
            if (r3 != r0) goto L22
            wd r3 = r2.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            boolean r1 = r3.K
            if (r1 == 0) goto L22
            r3.C(r0)
        L22:
            return
    }

    @Override // defpackage.gt
    public final void t(android.view.View r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L4d;
                default: goto L5;
            }
        L5:
            wd r7 = r4.b
            com.google.android.material.sidesheet.SideSheetBehavior r7 = (com.google.android.material.sidesheet.SideSheetBehavior) r7
            java.lang.ref.WeakReference r0 = r7.q
            if (r0 == 0) goto L14
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L2f
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L2f
            zt r2 = r7.a
            int r3 = r5.getLeft()
            int r5 = r5.getRight()
            r2.R(r1, r3, r5)
            r0.setLayoutParams(r1)
        L2f:
            java.util.LinkedHashSet r5 = r7.u
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L4c
            zt r7 = r7.a
            r7.b(r6)
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L47
            goto L4c
        L47:
            java.lang.ClassCastException r5 = defpackage.z30.h(r5)
            throw r5
        L4c:
            return
        L4d:
            wd r5 = r4.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r5
            r5.u(r7)
            return
    }

    @Override // defpackage.gt
    public final void u(android.view.View r6, float r7, float r8) {
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L62;
                default: goto L5;
            }
        L5:
            wd r0 = r5.b
            com.google.android.material.sidesheet.SideSheetBehavior r0 = (com.google.android.material.sidesheet.SideSheetBehavior) r0
            zt r1 = r0.a
            boolean r1 = r1.A(r7)
            if (r1 == 0) goto L12
            goto L5a
        L12:
            zt r1 = r0.a
            boolean r1 = r1.P(r6, r7)
            if (r1 == 0) goto L2b
            zt r1 = r0.a
            boolean r7 = r1.D(r7, r8)
            if (r7 != 0) goto L5c
            zt r7 = r0.a
            boolean r7 = r7.C(r6)
            if (r7 == 0) goto L5a
            goto L5c
        L2b:
            r1 = 0
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 == 0) goto L3d
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L3d
            goto L5c
        L3d:
            int r7 = r6.getLeft()
            zt r8 = r0.a
            int r8 = r8.l()
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            zt r1 = r0.a
            int r1 = r1.m()
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto L5c
        L5a:
            r7 = 3
            goto L5d
        L5c:
            r7 = 5
        L5d:
            r8 = 1
            r0.t(r6, r7, r8)
            return
        L62:
            wd r0 = r5.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            r1 = 0
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r3 = 6
            r4 = 3
            if (r2 >= 0) goto L84
            boolean r7 = r0.b
            if (r7 == 0) goto L74
        L71:
            r3 = r4
            goto L145
        L74:
            int r7 = r6.getTop()
            java.lang.System.currentTimeMillis()
            r0.getClass()
            int r8 = r0.E
            if (r7 <= r8) goto L71
            goto L145
        L84:
            boolean r2 = r0.I
            if (r2 == 0) goto Ld3
            boolean r2 = r0.D(r6, r8)
            if (r2 == 0) goto Ld3
            float r7 = java.lang.Math.abs(r7)
            float r1 = java.lang.Math.abs(r8)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto La1
            int r7 = r0.d
            float r7 = (float) r7
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 > 0) goto Lb0
        La1:
            int r7 = r6.getTop()
            int r8 = r0.T
            int r1 = r0.x()
            int r1 = r1 + r8
            int r1 = r1 / 2
            if (r7 <= r1) goto Lb3
        Lb0:
            r3 = 5
            goto L145
        Lb3:
            boolean r7 = r0.b
            if (r7 == 0) goto Lb8
            goto L71
        Lb8:
            int r7 = r6.getTop()
            int r8 = r0.x()
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6.getTop()
            int r1 = r0.E
            int r8 = r8 - r1
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L145
            goto L71
        Ld3:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r2 = 4
            if (r1 == 0) goto L104
            float r7 = java.lang.Math.abs(r7)
            float r8 = java.lang.Math.abs(r8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto Le5
            goto L104
        Le5:
            boolean r7 = r0.b
            if (r7 == 0) goto Leb
        Le9:
            r3 = r2
            goto L145
        Leb:
            int r7 = r6.getTop()
            int r8 = r0.E
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r0.G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Le9
            r0.getClass()
            goto L145
        L104:
            int r7 = r6.getTop()
            boolean r8 = r0.b
            if (r8 == 0) goto L11f
            int r8 = r0.D
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r0.G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Le9
            goto L71
        L11f:
            int r8 = r0.E
            if (r7 >= r8) goto L133
            int r8 = r0.G
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            if (r7 >= r8) goto L12f
            goto L71
        L12f:
            r0.getClass()
            goto L145
        L133:
            int r8 = r7 - r8
            int r8 = java.lang.Math.abs(r8)
            int r1 = r0.G
            int r7 = r7 - r1
            int r7 = java.lang.Math.abs(r7)
            if (r8 >= r7) goto Le9
            r0.getClass()
        L145:
            r0.getClass()
            r7 = 1
            r0.E(r6, r3, r7)
            return
    }
}
