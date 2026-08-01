package p000;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: cu */
/* JADX INFO: loaded from: classes.dex */
public final class C0127cu extends C0174e4 {

    /* JADX INFO: renamed from: g */
    public static final int[][] f1322g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f1323e;

    /* JADX INFO: renamed from: f */
    public boolean f1324f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1323e == null) {
            int iM2830k = AbstractC0979zt.m2830k(this, com.ljx.wechatmod.R.attr.colorControlActivated);
            int iM2830k2 = AbstractC0979zt.m2830k(this, com.ljx.wechatmod.R.attr.colorOnSurface);
            int iM2830k3 = AbstractC0979zt.m2830k(this, com.ljx.wechatmod.R.attr.colorSurface);
            this.f1323e = new ColorStateList(f1322g, new int[]{AbstractC0979zt.m2814E(1.0f, iM2830k3, iM2830k), AbstractC0979zt.m2814E(0.54f, iM2830k3, iM2830k2), AbstractC0979zt.m2814E(0.38f, iM2830k3, iM2830k2), AbstractC0979zt.m2814E(0.38f, iM2830k3, iM2830k2)});
        }
        return this.f1323e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1324f && AbstractC0850wb.m2558a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f1324f = z;
        if (z) {
            AbstractC0850wb.m2560c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0850wb.m2560c(this, null);
        }
    }
}
