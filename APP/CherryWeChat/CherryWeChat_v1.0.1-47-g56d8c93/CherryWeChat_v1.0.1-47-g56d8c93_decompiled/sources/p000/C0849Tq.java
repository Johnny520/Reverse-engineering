package p000;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: Tq */
/* JADX INFO: loaded from: classes.dex */
public final class C0849Tq extends C0692Q3 {

    /* JADX INFO: renamed from: g */
    public static final int[][] f2694g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f2695e;

    /* JADX INFO: renamed from: f */
    public boolean f2696f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2695e == null) {
            int iM621n = AbstractC0295Gu.m621n(this, io.github.cherrywechat.R.attr.colorControlActivated);
            int iM621n2 = AbstractC0295Gu.m621n(this, io.github.cherrywechat.R.attr.colorOnSurface);
            int iM621n3 = AbstractC0295Gu.m621n(this, io.github.cherrywechat.R.attr.colorSurface);
            this.f2695e = new ColorStateList(f2694g, new int[]{AbstractC0295Gu.m629v(iM621n3, iM621n, 1.0f), AbstractC0295Gu.m629v(iM621n3, iM621n2, 0.54f), AbstractC0295Gu.m629v(iM621n3, iM621n2, 0.38f), AbstractC0295Gu.m629v(iM621n3, iM621n2, 0.38f)});
        }
        return this.f2695e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2696f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f2696f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
