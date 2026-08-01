package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cu extends defpackage.e4 {
    public static final int[][] g = null;
    public android.content.res.ColorStateList e;
    public boolean f;

    static {
            r0 = 16842910(0x101009e, float:2.3694E-38)
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r2 = new int[]{r0, r1}
            r3 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r0 = new int[]{r0, r3}
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r1 = new int[]{r4, r1}
            int[] r3 = new int[]{r4, r3}
            int[][] r0 = new int[][]{r2, r0, r1, r3}
            defpackage.cu.g = r0
            return
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r6 = this;
            android.content.res.ColorStateList r0 = r6.e
            if (r0 != 0) goto L3e
            r0 = 2130968800(0x7f0400e0, float:1.7546264E38)
            int r0 = defpackage.zt.k(r6, r0)
            r1 = 2130968819(0x7f0400f3, float:1.7546302E38)
            int r1 = defpackage.zt.k(r6, r1)
            r2 = 2130968841(0x7f040109, float:1.7546347E38)
            int r2 = defpackage.zt.k(r6, r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = defpackage.zt.E(r3, r2, r0)
            r3 = 1057635697(0x3f0a3d71, float:0.54)
            int r3 = defpackage.zt.E(r3, r2, r1)
            r4 = 1052938076(0x3ec28f5c, float:0.38)
            int r5 = defpackage.zt.E(r4, r2, r1)
            int r1 = defpackage.zt.E(r4, r2, r1)
            int[] r0 = new int[]{r0, r3, r5, r1}
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            int[][] r2 = defpackage.cu.g
            r1.<init>(r2, r0)
            r6.e = r1
        L3e:
            android.content.res.ColorStateList r0 = r6.e
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.f
            if (r0 == 0) goto L11
            android.content.res.ColorStateList r0 = defpackage.wb.a(r1)
            if (r0 != 0) goto L11
            r0 = 1
            r1.setUseMaterialThemeColors(r0)
        L11:
            return
    }

    public void setUseMaterialThemeColors(boolean r1) {
            r0 = this;
            r0.f = r1
            if (r1 == 0) goto Lc
            android.content.res.ColorStateList r1 = r0.getMaterialThemeColorsTintList()
            defpackage.wb.c(r0, r1)
            return
        Lc:
            r1 = 0
            defpackage.wb.c(r0, r1)
            return
    }
}
