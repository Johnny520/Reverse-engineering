package p000a;

import android.R;
import android.content.res.ColorStateList;
import com.google.android.material.C1247R;

/* JADX INFO: renamed from: a.Ra */
/* JADX INFO: loaded from: classes.dex */
public final class C0318Ra extends C0623i1 {

    /* JADX INFO: renamed from: g */
    public static final int f1139g = C1247R.style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* JADX INFO: renamed from: h */
    public static final int[][] f1140h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e */
    public ColorStateList f1141e;

    /* JADX INFO: renamed from: f */
    public boolean f1142f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1141e == null) {
            int iM684b = C0247Na.m684b(this, C1247R.attr.colorControlActivated);
            int iM684b2 = C0247Na.m684b(this, C1247R.attr.colorOnSurface);
            int iM684b3 = C0247Na.m684b(this, C1247R.attr.colorSurface);
            this.f1141e = new ColorStateList(f1140h, new int[]{C0247Na.m686d(iM684b3, iM684b, 1.0f), C0247Na.m686d(iM684b3, iM684b2, 0.54f), C0247Na.m686d(iM684b3, iM684b2, 0.38f), C0247Na.m686d(iM684b3, iM684b2, 0.38f)});
        }
        return this.f1141e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1142f && C0096F3.m255a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f1142f = z;
        if (z) {
            C0096F3.m257c(this, getMaterialThemeColorsTintList());
        } else {
            C0096F3.m257c(this, null);
        }
    }
}
