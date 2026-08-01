package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: mt */
/* JADX INFO: loaded from: classes.dex */
public final class C0497mt {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f3270a;

    /* JADX INFO: renamed from: b */
    public f30 f3271b;

    /* JADX INFO: renamed from: c */
    public int f3272c;

    /* JADX INFO: renamed from: d */
    public int f3273d;

    /* JADX INFO: renamed from: e */
    public int f3274e;

    /* JADX INFO: renamed from: f */
    public int f3275f;

    /* JADX INFO: renamed from: g */
    public int f3276g;

    /* JADX INFO: renamed from: h */
    public int f3277h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f3278i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f3279j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f3280k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f3281l;

    /* JADX INFO: renamed from: m */
    public C0200eu f3282m;

    /* JADX INFO: renamed from: q */
    public boolean f3286q;

    /* JADX INFO: renamed from: s */
    public RippleDrawable f3288s;

    /* JADX INFO: renamed from: t */
    public int f3289t;

    /* JADX INFO: renamed from: n */
    public boolean f3283n = false;

    /* JADX INFO: renamed from: o */
    public boolean f3284o = false;

    /* JADX INFO: renamed from: p */
    public boolean f3285p = false;

    /* JADX INFO: renamed from: r */
    public boolean f3287r = true;

    public C0497mt(MaterialButton materialButton, f30 f30Var) {
        this.f3270a = materialButton;
        this.f3271b = f30Var;
    }

    /* JADX INFO: renamed from: a */
    public final q30 m1856a() {
        RippleDrawable rippleDrawable = this.f3288s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f3288s.getNumberOfLayers() > 2 ? (q30) this.f3288s.getDrawable(2) : (q30) this.f3288s.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public final C0200eu m1857b(boolean z) {
        RippleDrawable rippleDrawable = this.f3288s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0200eu) ((LayerDrawable) ((InsetDrawable) this.f3288s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m1858c(f30 f30Var) {
        this.f3271b = f30Var;
        if (m1857b(false) != null) {
            m1857b(false).setShapeAppearanceModel(f30Var);
        }
        if (m1857b(true) != null) {
            m1857b(true).setShapeAppearanceModel(f30Var);
        }
        if (m1856a() != null) {
            m1856a().setShapeAppearanceModel(f30Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1859d(int i, int i2) {
        WeakHashMap weakHashMap = ja0.f2600a;
        MaterialButton materialButton = this.f3270a;
        int iM2369f = t90.m2369f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iM2368e = t90.m2368e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f3274e;
        int i4 = this.f3275f;
        this.f3275f = i2;
        this.f3274e = i;
        if (!this.f3284o) {
            m1860e();
        }
        t90.m2374k(materialButton, iM2369f, (paddingTop + i) - i3, iM2368e, (paddingBottom + i2) - i4);
    }

    /* JADX INFO: renamed from: e */
    public final void m1860e() {
        C0200eu c0200eu = new C0200eu(this.f3271b);
        MaterialButton materialButton = this.f3270a;
        c0200eu.m1083h(materialButton.getContext());
        AbstractC0104ch.m688h(c0200eu, this.f3279j);
        PorterDuff.Mode mode = this.f3278i;
        if (mode != null) {
            AbstractC0104ch.m689i(c0200eu, mode);
        }
        float f = this.f3277h;
        ColorStateList colorStateList = this.f3280k;
        c0200eu.f1842a.f1642j = f;
        c0200eu.invalidateSelf();
        C0163du c0163du = c0200eu.f1842a;
        if (c0163du.f1636d != colorStateList) {
            c0163du.f1636d = colorStateList;
            c0200eu.onStateChange(c0200eu.getState());
        }
        C0200eu c0200eu2 = new C0200eu(this.f3271b);
        c0200eu2.setTint(0);
        float f2 = this.f3277h;
        int iM2830k = this.f3283n ? AbstractC0979zt.m2830k(materialButton, R.attr.colorSurface) : 0;
        c0200eu2.f1842a.f1642j = f2;
        c0200eu2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM2830k);
        C0163du c0163du2 = c0200eu2.f1842a;
        if (c0163du2.f1636d != colorStateListValueOf) {
            c0163du2.f1636d = colorStateListValueOf;
            c0200eu2.onStateChange(c0200eu2.getState());
        }
        C0200eu c0200eu3 = new C0200eu(this.f3271b);
        this.f3282m = c0200eu3;
        AbstractC0104ch.m687g(c0200eu3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(g10.m1247a(this.f3281l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0200eu2, c0200eu}), this.f3272c, this.f3274e, this.f3273d, this.f3275f), this.f3282m);
        this.f3288s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C0200eu c0200euM1857b = m1857b(false);
        if (c0200euM1857b != null) {
            c0200euM1857b.m1084i(this.f3289t);
            c0200euM1857b.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1861f() {
        C0200eu c0200euM1857b = m1857b(false);
        C0200eu c0200euM1857b2 = m1857b(true);
        if (c0200euM1857b != null) {
            float f = this.f3277h;
            ColorStateList colorStateList = this.f3280k;
            c0200euM1857b.f1842a.f1642j = f;
            c0200euM1857b.invalidateSelf();
            C0163du c0163du = c0200euM1857b.f1842a;
            if (c0163du.f1636d != colorStateList) {
                c0163du.f1636d = colorStateList;
                c0200euM1857b.onStateChange(c0200euM1857b.getState());
            }
            if (c0200euM1857b2 != null) {
                float f2 = this.f3277h;
                int iM2830k = this.f3283n ? AbstractC0979zt.m2830k(this.f3270a, R.attr.colorSurface) : 0;
                c0200euM1857b2.f1842a.f1642j = f2;
                c0200euM1857b2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM2830k);
                C0163du c0163du2 = c0200euM1857b2.f1842a;
                if (c0163du2.f1636d != colorStateListValueOf) {
                    c0163du2.f1636d = colorStateListValueOf;
                    c0200euM1857b2.onStateChange(c0200euM1857b2.getState());
                }
            }
        }
    }
}
