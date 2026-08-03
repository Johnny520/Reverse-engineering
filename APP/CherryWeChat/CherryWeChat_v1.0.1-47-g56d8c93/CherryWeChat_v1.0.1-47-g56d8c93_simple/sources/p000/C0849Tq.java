package p000;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: renamed from: Tq */
/* JADX INFO: loaded from: classes.dex */
public final class C0849Tq extends C0692Q3 {

    /* JADX INFO: renamed from: g */
    public static final int[][] f2694g = null;

    /* JADX INFO: renamed from: e */
    public ColorStateList f2695e;

    /* JADX INFO: renamed from: f */
    public boolean f2696f;

    static {
        f2694g = new int[][]{new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2695e != null) goto L6;
        int r0 = AbstractC0295Gu.m621n(this, io.github.cherrywechat.R.attr.colorControlActivated);
        int r1 = AbstractC0295Gu.m621n(this, io.github.cherrywechat.R.attr.colorOnSurface);
        int r2 = AbstractC0295Gu.m621n(this, io.github.cherrywechat.R.attr.colorSurface);
        int[] r02 = {AbstractC0295Gu.m629v(r2, r0, 1.0f), AbstractC0295Gu.m629v(r2, r1, 0.54f), AbstractC0295Gu.m629v(r2, r1, 0.38f), AbstractC0295Gu.m629v(r2, r1, 0.38f)};
        this.f2695e = new ColorStateList(f2694g, r02);
    L6:
        return this.f2695e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2696f == true) goto L5;
        return;
    L5:
        if (getButtonTintList() != null) goto L9;
        setUseMaterialThemeColors(true);
        return;
    }

    public void setUseMaterialThemeColors(boolean r1) {
        this.f2696f = r1;
        if (r1 == false) goto L6;
        setButtonTintList(getMaterialThemeColorsTintList());
        return;
    L6:
        setButtonTintList(null);
    }
}
