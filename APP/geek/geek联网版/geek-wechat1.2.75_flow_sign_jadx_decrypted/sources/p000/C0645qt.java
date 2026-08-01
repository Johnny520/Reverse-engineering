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

/* JADX INFO: renamed from: qt */
/* JADX INFO: loaded from: classes.dex */
public final class C0645qt {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f3930a;

    /* JADX INFO: renamed from: b */
    public m30 f3931b;

    /* JADX INFO: renamed from: c */
    public int f3932c;

    /* JADX INFO: renamed from: d */
    public int f3933d;

    /* JADX INFO: renamed from: e */
    public int f3934e;

    /* JADX INFO: renamed from: f */
    public int f3935f;

    /* JADX INFO: renamed from: g */
    public int f3936g;

    /* JADX INFO: renamed from: h */
    public int f3937h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f3938i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f3939j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f3940k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f3941l;

    /* JADX INFO: renamed from: m */
    public C0350iu f3942m;

    /* JADX INFO: renamed from: q */
    public boolean f3946q;

    /* JADX INFO: renamed from: s */
    public RippleDrawable f3948s;

    /* JADX INFO: renamed from: t */
    public int f3949t;

    /* JADX INFO: renamed from: n */
    public boolean f3943n = false;

    /* JADX INFO: renamed from: o */
    public boolean f3944o = false;

    /* JADX INFO: renamed from: p */
    public boolean f3945p = false;

    /* JADX INFO: renamed from: r */
    public boolean f3947r = true;

    public C0645qt(MaterialButton materialButton, m30 m30Var) {
        this.f3930a = materialButton;
        this.f3931b = m30Var;
    }

    /* JADX INFO: renamed from: a */
    public final x30 m2159a() {
        RippleDrawable rippleDrawable = this.f3948s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f3948s.getNumberOfLayers() > 2 ? (x30) this.f3948s.getDrawable(2) : (x30) this.f3948s.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public final C0350iu m2160b(boolean z) {
        RippleDrawable rippleDrawable = this.f3948s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0350iu) ((LayerDrawable) ((InsetDrawable) this.f3948s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m2161c(m30 m30Var) {
        this.f3931b = m30Var;
        if (m2160b(false) != null) {
            m2160b(false).setShapeAppearanceModel(m30Var);
        }
        if (m2160b(true) != null) {
            m2160b(true).setShapeAppearanceModel(m30Var);
        }
        if (m2159a() != null) {
            m2159a().setShapeAppearanceModel(m30Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2162d(int i, int i2) {
        WeakHashMap weakHashMap = oa0.f3426a;
        MaterialButton materialButton = this.f3930a;
        int iM2734f = y90.m2734f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int iM2733e = y90.m2733e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f3934e;
        int i4 = this.f3935f;
        this.f3935f = i2;
        this.f3934e = i;
        if (!this.f3944o) {
            m2163e();
        }
        y90.m2739k(materialButton, iM2734f, (paddingTop + i) - i3, iM2733e, (paddingBottom + i2) - i4);
    }

    /* JADX INFO: renamed from: e */
    public final void m2163e() {
        C0350iu c0350iu = new C0350iu(this.f3931b);
        MaterialButton materialButton = this.f3930a;
        c0350iu.m1535h(materialButton.getContext());
        AbstractC0187eh.m995h(c0350iu, this.f3939j);
        PorterDuff.Mode mode = this.f3938i;
        if (mode != null) {
            AbstractC0187eh.m996i(c0350iu, mode);
        }
        float f = this.f3937h;
        ColorStateList colorStateList = this.f3940k;
        c0350iu.f2585a.f2275j = f;
        c0350iu.invalidateSelf();
        C0311hu c0311hu = c0350iu.f2585a;
        if (c0311hu.f2269d != colorStateList) {
            c0311hu.f2269d = colorStateList;
            c0350iu.onStateChange(c0350iu.getState());
        }
        C0350iu c0350iu2 = new C0350iu(this.f3931b);
        c0350iu2.setTint(0);
        float f2 = this.f3937h;
        int iM1198m = this.f3943n ? g80.m1198m(materialButton, R.attr.colorSurface) : 0;
        c0350iu2.f2585a.f2275j = f2;
        c0350iu2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM1198m);
        C0311hu c0311hu2 = c0350iu2.f2585a;
        if (c0311hu2.f2269d != colorStateListValueOf) {
            c0311hu2.f2269d = colorStateListValueOf;
            c0350iu2.onStateChange(c0350iu2.getState());
        }
        C0350iu c0350iu3 = new C0350iu(this.f3931b);
        this.f3942m = c0350iu3;
        AbstractC0187eh.m994g(c0350iu3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(n10.m1909a(this.f3941l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0350iu2, c0350iu}), this.f3932c, this.f3934e, this.f3933d, this.f3935f), this.f3942m);
        this.f3948s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C0350iu c0350iuM2160b = m2160b(false);
        if (c0350iuM2160b != null) {
            c0350iuM2160b.m1536i(this.f3949t);
            c0350iuM2160b.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2164f() {
        C0350iu c0350iuM2160b = m2160b(false);
        C0350iu c0350iuM2160b2 = m2160b(true);
        if (c0350iuM2160b != null) {
            float f = this.f3937h;
            ColorStateList colorStateList = this.f3940k;
            c0350iuM2160b.f2585a.f2275j = f;
            c0350iuM2160b.invalidateSelf();
            C0311hu c0311hu = c0350iuM2160b.f2585a;
            if (c0311hu.f2269d != colorStateList) {
                c0311hu.f2269d = colorStateList;
                c0350iuM2160b.onStateChange(c0350iuM2160b.getState());
            }
            if (c0350iuM2160b2 != null) {
                float f2 = this.f3937h;
                int iM1198m = this.f3943n ? g80.m1198m(this.f3930a, R.attr.colorSurface) : 0;
                c0350iuM2160b2.f2585a.f2275j = f2;
                c0350iuM2160b2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM1198m);
                C0311hu c0311hu2 = c0350iuM2160b2.f2585a;
                if (c0311hu2.f2269d != colorStateListValueOf) {
                    c0311hu2.f2269d = colorStateListValueOf;
                    c0350iuM2160b2.onStateChange(c0350iuM2160b2.getState());
                }
            }
        }
    }
}
