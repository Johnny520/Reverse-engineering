package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.C1247R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import p000a.C0354Ta;
import p000a.C0893w5;

/* JADX INFO: renamed from: a.Da */
/* JADX INFO: loaded from: classes.dex */
public final class C0067Da {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f218a;

    /* JADX INFO: renamed from: b */
    public C0393Vd f219b;

    /* JADX INFO: renamed from: c */
    public int f220c;

    /* JADX INFO: renamed from: d */
    public int f221d;

    /* JADX INFO: renamed from: e */
    public int f222e;

    /* JADX INFO: renamed from: f */
    public int f223f;

    /* JADX INFO: renamed from: g */
    public int f224g;

    /* JADX INFO: renamed from: h */
    public int f225h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f226i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f227j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f228k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f229l;

    /* JADX INFO: renamed from: m */
    public C0354Ta f230m;

    /* JADX INFO: renamed from: q */
    public boolean f234q;

    /* JADX INFO: renamed from: s */
    public RippleDrawable f236s;

    /* JADX INFO: renamed from: t */
    public int f237t;

    /* JADX INFO: renamed from: n */
    public boolean f231n = false;

    /* JADX INFO: renamed from: o */
    public boolean f232o = false;

    /* JADX INFO: renamed from: p */
    public boolean f233p = false;

    /* JADX INFO: renamed from: r */
    public boolean f235r = true;

    public C0067Da(MaterialButton materialButton, C0393Vd c0393Vd) {
        this.f218a = materialButton;
        this.f219b = c0393Vd;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0465Zd m165a() {
        RippleDrawable rippleDrawable = this.f236s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f236s.getNumberOfLayers() > 2 ? (InterfaceC0465Zd) this.f236s.getDrawable(2) : (InterfaceC0465Zd) this.f236s.getDrawable(1);
    }

    /* JADX INFO: renamed from: b */
    public final C0354Ta m166b(boolean z) {
        RippleDrawable rippleDrawable = this.f236s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0354Ta) ((LayerDrawable) ((InsetDrawable) this.f236s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m167c(C0393Vd c0393Vd) {
        this.f219b = c0393Vd;
        if (m166b(false) != null) {
            m166b(false).setShapeAppearanceModel(c0393Vd);
        }
        if (m166b(true) != null) {
            m166b(true).setShapeAppearanceModel(c0393Vd);
        }
        if (m165a() != null) {
            m165a().setShapeAppearanceModel(c0393Vd);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m168d(int i, int i2) {
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        MaterialButton materialButton = this.f218a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f222e;
        int i4 = this.f223f;
        this.f223f = i2;
        this.f222e = i;
        if (!this.f232o) {
            m169e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* JADX INFO: renamed from: e */
    public final void m169e() {
        C0354Ta c0354Ta = new C0354Ta(this.f219b);
        MaterialButton materialButton = this.f218a;
        c0354Ta.m965i(materialButton.getContext());
        C0893w5.a.m2176h(c0354Ta, this.f227j);
        PorterDuff.Mode mode = this.f226i;
        if (mode != null) {
            C0893w5.a.m2177i(c0354Ta, mode);
        }
        float f = this.f225h;
        ColorStateList colorStateList = this.f228k;
        c0354Ta.f1310a.f1343j = f;
        c0354Ta.invalidateSelf();
        C0354Ta.b bVar = c0354Ta.f1310a;
        if (bVar.f1337d != colorStateList) {
            bVar.f1337d = colorStateList;
            c0354Ta.onStateChange(c0354Ta.getState());
        }
        C0354Ta c0354Ta2 = new C0354Ta(this.f219b);
        c0354Ta2.setTint(0);
        float f2 = this.f225h;
        int iM684b = this.f231n ? C0247Na.m684b(materialButton, C1247R.attr.colorSurface) : 0;
        c0354Ta2.f1310a.f1343j = f2;
        c0354Ta2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM684b);
        C0354Ta.b bVar2 = c0354Ta2.f1310a;
        if (bVar2.f1337d != colorStateListValueOf) {
            bVar2.f1337d = colorStateListValueOf;
            c0354Ta2.onStateChange(c0354Ta2.getState());
        }
        C0354Ta c0354Ta3 = new C0354Ta(this.f219b);
        this.f230m = c0354Ta3;
        C0893w5.a.m2175g(c0354Ta3, -1);
        ColorStateList colorStateListValueOf2 = this.f229l;
        if (colorStateListValueOf2 == null) {
            colorStateListValueOf2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0354Ta2, c0354Ta}), this.f220c, this.f222e, this.f221d, this.f223f), this.f230m);
        this.f236s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C0354Ta c0354TaM166b = m166b(false);
        if (c0354TaM166b != null) {
            c0354TaM166b.m966j(this.f237t);
            c0354TaM166b.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m170f() {
        C0354Ta c0354TaM166b = m166b(false);
        C0354Ta c0354TaM166b2 = m166b(true);
        if (c0354TaM166b != null) {
            float f = this.f225h;
            ColorStateList colorStateList = this.f228k;
            c0354TaM166b.f1310a.f1343j = f;
            c0354TaM166b.invalidateSelf();
            C0354Ta.b bVar = c0354TaM166b.f1310a;
            if (bVar.f1337d != colorStateList) {
                bVar.f1337d = colorStateList;
                c0354TaM166b.onStateChange(c0354TaM166b.getState());
            }
            if (c0354TaM166b2 != null) {
                float f2 = this.f225h;
                int iM684b = this.f231n ? C0247Na.m684b(this.f218a, C1247R.attr.colorSurface) : 0;
                c0354TaM166b2.f1310a.f1343j = f2;
                c0354TaM166b2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM684b);
                C0354Ta.b bVar2 = c0354TaM166b2.f1310a;
                if (bVar2.f1337d != colorStateListValueOf) {
                    bVar2.f1337d = colorStateListValueOf;
                    c0354TaM166b2.onStateChange(c0354TaM166b2.getState());
                }
            }
        }
    }
}
