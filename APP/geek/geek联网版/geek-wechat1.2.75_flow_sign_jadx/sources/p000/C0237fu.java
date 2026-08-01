package p000;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: fu */
/* JADX INFO: loaded from: classes.dex */
public final class C0237fu extends C0174e4 {

    /* JADX INFO: renamed from: g */
    public static final int[][] f1837g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f1838e;

    /* JADX INFO: renamed from: f */
    public boolean f1839f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1838e == null) {
            int iM1198m = g80.m1198m(this, com.ljx.wechatmod.R.attr.colorControlActivated);
            int iM1198m2 = g80.m1198m(this, com.ljx.wechatmod.R.attr.colorOnSurface);
            int iM1198m3 = g80.m1198m(this, com.ljx.wechatmod.R.attr.colorSurface);
            this.f1838e = new ColorStateList(f1837g, new int[]{g80.m1207v(1.0f, iM1198m3, iM1198m), g80.m1207v(0.54f, iM1198m3, iM1198m2), g80.m1207v(0.38f, iM1198m3, iM1198m2), g80.m1207v(0.38f, iM1198m3, iM1198m2)});
        }
        return this.f1838e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1839f && AbstractC0219fc.m1090a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f1839f = z;
        if (z) {
            AbstractC0219fc.m1092c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0219fc.m1092c(this, null);
        }
    }
}
