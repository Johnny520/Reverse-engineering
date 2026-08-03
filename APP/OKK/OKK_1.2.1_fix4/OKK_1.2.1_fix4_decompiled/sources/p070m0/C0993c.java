package p070m0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p056f0.AbstractC0805P;
import p086v0.AbstractC1110a;
import p087w.AbstractC1111a;
import p089x0.C1122f;
import p089x0.C1123g;
import p089x0.C1127k;
import p089x0.InterfaceC1138v;

/* JADX INFO: renamed from: m0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0993c {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f3530a;

    /* JADX INFO: renamed from: b */
    public C1127k f3531b;

    /* JADX INFO: renamed from: c */
    public int f3532c;

    /* JADX INFO: renamed from: d */
    public int f3533d;

    /* JADX INFO: renamed from: e */
    public int f3534e;

    /* JADX INFO: renamed from: f */
    public int f3535f;

    /* JADX INFO: renamed from: g */
    public int f3536g;

    /* JADX INFO: renamed from: h */
    public int f3537h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f3538i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f3539j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f3540k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f3541l;

    /* JADX INFO: renamed from: m */
    public C1123g f3542m;

    /* JADX INFO: renamed from: q */
    public boolean f3546q;

    /* JADX INFO: renamed from: s */
    public RippleDrawable f3548s;

    /* JADX INFO: renamed from: t */
    public int f3549t;

    /* JADX INFO: renamed from: n */
    public boolean f3543n = false;

    /* JADX INFO: renamed from: o */
    public boolean f3544o = false;

    /* JADX INFO: renamed from: p */
    public boolean f3545p = false;

    /* JADX INFO: renamed from: r */
    public boolean f3547r = true;

    public C0993c(MaterialButton materialButton, C1127k c1127k) {
        this.f3530a = materialButton;
        this.f3531b = c1127k;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1138v m2380a() {
        RippleDrawable rippleDrawable = this.f3548s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f3548s.getNumberOfLayers() > 2 ? (InterfaceC1138v) this.f3548s.getDrawable(2) : (InterfaceC1138v) this.f3548s.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public final C1123g m2381b(boolean z2) {
        RippleDrawable rippleDrawable = this.f3548s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1123g) ((LayerDrawable) ((InsetDrawable) this.f3548s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m2382c(C1127k c1127k) {
        this.f3531b = c1127k;
        if (m2381b(false) != null) {
            m2381b(false).setShapeAppearanceModel(c1127k);
        }
        if (m2381b(true) != null) {
            m2381b(true).setShapeAppearanceModel(c1127k);
        }
        if (m2380a() != null) {
            m2380a().setShapeAppearanceModel(c1127k);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2383d(int i2, int i3) {
        Field field = AbstractC0080Q.f219a;
        MaterialButton materialButton = this.f3530a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.f3534e;
        int i5 = this.f3535f;
        this.f3535f = i3;
        this.f3534e = i2;
        if (!this.f3544o) {
            m2384e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    /* JADX INFO: renamed from: e */
    public final void m2384e() {
        C1123g c1123g = new C1123g(this.f3531b);
        MaterialButton materialButton = this.f3530a;
        c1123g.m2649i(materialButton.getContext());
        AbstractC1111a.m2626h(c1123g, this.f3539j);
        PorterDuff.Mode mode = this.f3538i;
        if (mode != null) {
            AbstractC1111a.m2627i(c1123g, mode);
        }
        float f2 = this.f3537h;
        ColorStateList colorStateList = this.f3540k;
        c1123g.f4312a.f4300k = f2;
        c1123g.invalidateSelf();
        C1122f c1122f = c1123g.f4312a;
        if (c1122f.f4293d != colorStateList) {
            c1122f.f4293d = colorStateList;
            c1123g.onStateChange(c1123g.getState());
        }
        C1123g c1123g2 = new C1123g(this.f3531b);
        c1123g2.setTint(0);
        float f3 = this.f3537h;
        int iM2048o = this.f3543n ? AbstractC0805P.m2048o(materialButton, C1031R.attr.colorSurface) : 0;
        c1123g2.f4312a.f4300k = f3;
        c1123g2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM2048o);
        C1122f c1122f2 = c1123g2.f4312a;
        if (c1122f2.f4293d != colorStateListValueOf) {
            c1122f2.f4293d = colorStateListValueOf;
            c1123g2.onStateChange(c1123g2.getState());
        }
        C1123g c1123g3 = new C1123g(this.f3531b);
        this.f3542m = c1123g3;
        AbstractC1111a.m2625g(c1123g3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(AbstractC1110a.m2618a(this.f3541l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c1123g2, c1123g}), this.f3532c, this.f3534e, this.f3533d, this.f3535f), this.f3542m);
        this.f3548s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C1123g c1123gM2381b = m2381b(false);
        if (c1123gM2381b != null) {
            c1123gM2381b.m2650j(this.f3549t);
            c1123gM2381b.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2385f() {
        C1123g c1123gM2381b = m2381b(false);
        C1123g c1123gM2381b2 = m2381b(true);
        if (c1123gM2381b != null) {
            float f2 = this.f3537h;
            ColorStateList colorStateList = this.f3540k;
            c1123gM2381b.f4312a.f4300k = f2;
            c1123gM2381b.invalidateSelf();
            C1122f c1122f = c1123gM2381b.f4312a;
            if (c1122f.f4293d != colorStateList) {
                c1122f.f4293d = colorStateList;
                c1123gM2381b.onStateChange(c1123gM2381b.getState());
            }
            if (c1123gM2381b2 != null) {
                float f3 = this.f3537h;
                int iM2048o = this.f3543n ? AbstractC0805P.m2048o(this.f3530a, C1031R.attr.colorSurface) : 0;
                c1123gM2381b2.f4312a.f4300k = f3;
                c1123gM2381b2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM2048o);
                C1122f c1122f2 = c1123gM2381b2.f4312a;
                if (c1122f2.f4293d != colorStateListValueOf) {
                    c1122f2.f4293d = colorStateListValueOf;
                    c1123gM2381b2.onStateChange(c1123gM2381b2.getState());
                }
            }
        }
    }
}
