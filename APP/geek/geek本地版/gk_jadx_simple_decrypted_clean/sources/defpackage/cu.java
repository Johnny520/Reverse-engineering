package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: loaded from: classes.dex */
public final class cu extends e4 {
    public static final int[][] g = null;
    public ColorStateList e;
    public boolean f;

    static {
        g = new int[][]{new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e != null) goto L6;
        int r0 = zt.k(this, com.ljx.wechatmod.R.attr.colorControlActivated);
        int r1 = zt.k(this, com.ljx.wechatmod.R.attr.colorOnSurface);
        int r2 = zt.k(this, com.ljx.wechatmod.R.attr.colorSurface);
        int[] r02 = {zt.E(1.0f, r2, r0), zt.E(0.54f, r2, r1), zt.E(0.38f, r2, r1), zt.E(0.38f, r2, r1)};
        this.e = new ColorStateList(g, r02);
    L6:
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f == true) goto L5;
        return;
    L5:
        if (wb.a(this) != null) goto L9;
        setUseMaterialThemeColors(true);
        return;
    }

    public void setUseMaterialThemeColors(boolean r1) {
        this.f = r1;
        if (r1 == false) goto L6;
        wb.c(this, getMaterialThemeColorsTintList());
        return;
    L6:
        wb.c(this, null);
    }
}
