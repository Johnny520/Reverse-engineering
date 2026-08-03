package a;

/* JADX INFO: loaded from: classes.dex */
public final class Ra extends a.C0185i1 {
    public static final int g = 0;
    public static final int[][] h = null;
    public android.content.res.ColorStateList e;
    public boolean f;

    static {
            int r0 = com.google.android.material.R.style.Widget_MaterialComponents_CompoundButton_RadioButton
            a.Ra.g = r0
            r0 = 16842910(0x101009e, float:2.3694E-38)
            r1 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r2 = new int[]{r0, r1}
            r3 = -16842912(0xfffffffffefeff60, float:-1.6947495E38)
            int[] r0 = new int[]{r0, r3}
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r1 = new int[]{r4, r1}
            int[] r3 = new int[]{r4, r3}
            int[][] r0 = new int[][]{r2, r0, r1, r3}
            a.Ra.h = r0
            return
    }

    private android.content.res.ColorStateList getMaterialThemeColorsTintList() {
            r6 = this;
            android.content.res.ColorStateList r0 = r6.e
            if (r0 != 0) goto L3b
            int r0 = com.google.android.material.R.attr.colorControlActivated
            int r0 = a.Na.b(r6, r0)
            int r1 = com.google.android.material.R.attr.colorOnSurface
            int r1 = a.Na.b(r6, r1)
            int r2 = com.google.android.material.R.attr.colorSurface
            int r2 = a.Na.b(r6, r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = a.Na.d(r2, r0, r3)
            r3 = 1057635697(0x3f0a3d71, float:0.54)
            int r3 = a.Na.d(r2, r1, r3)
            r4 = 1052938076(0x3ec28f5c, float:0.38)
            int r5 = a.Na.d(r2, r1, r4)
            int r1 = a.Na.d(r2, r1, r4)
            int[] r0 = new int[]{r0, r3, r5, r1}
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            int[][] r2 = a.Ra.h
            r1.<init>(r2, r0)
            r6.e = r1
        L3b:
            android.content.res.ColorStateList r0 = r6.e
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.f
            if (r0 == 0) goto L11
            android.content.res.ColorStateList r0 = a.F3.a(r1)
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
            a.F3.c(r0, r1)
            return
        Lc:
            r1 = 0
            a.F3.c(r0, r1)
            return
    }
}
