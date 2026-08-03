package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Gq */
/* JADX INFO: loaded from: classes.dex */
public final class C0291Gq {

    /* JADX INFO: renamed from: a */
    public final MaterialButton f966a;

    /* JADX INFO: renamed from: b */
    public C0728Qx f967b;

    /* JADX INFO: renamed from: c */
    public C1301cz f968c;

    /* JADX INFO: renamed from: d */
    public C0686Py f969d;

    /* JADX INFO: renamed from: e */
    public C2464rl f970e;

    /* JADX INFO: renamed from: f */
    public int f971f;

    /* JADX INFO: renamed from: g */
    public int f972g;

    /* JADX INFO: renamed from: h */
    public int f973h;

    /* JADX INFO: renamed from: i */
    public int f974i;

    /* JADX INFO: renamed from: j */
    public int f975j;

    /* JADX INFO: renamed from: k */
    public int f976k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f977l;

    /* JADX INFO: renamed from: m */
    public ColorStateList f978m;

    /* JADX INFO: renamed from: n */
    public ColorStateList f979n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f980o;

    /* JADX INFO: renamed from: p */
    public C1021Xq f981p;

    /* JADX INFO: renamed from: t */
    public boolean f985t;

    /* JADX INFO: renamed from: v */
    public RippleDrawable f987v;

    /* JADX INFO: renamed from: w */
    public int f988w;

    /* JADX INFO: renamed from: q */
    public boolean f982q = false;

    /* JADX INFO: renamed from: r */
    public boolean f983r = false;

    /* JADX INFO: renamed from: s */
    public boolean f984s = false;

    /* JADX INFO: renamed from: u */
    public boolean f986u = true;

    public C0291Gq(MaterialButton materialButton, C0728Qx c0728Qx) {
        this.f966a = materialButton;
        this.f967b = c0728Qx;
    }

    /* JADX INFO: renamed from: a */
    public final C1021Xq m586a(boolean z) {
        RippleDrawable rippleDrawable = this.f987v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C1021Xq) ((LayerDrawable) ((InsetDrawable) this.f987v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m587b(int i, int i2) {
        MaterialButton materialButton = this.f966a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f973h;
        int i4 = this.f974i;
        this.f974i = i2;
        this.f973h = i;
        if (!this.f983r) {
            m588c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* JADX INFO: renamed from: c */
    public final void m588c() {
        C1021Xq c1021Xq = new C1021Xq(this.f967b);
        C1301cz c1301cz = this.f968c;
        if (c1301cz != null) {
            c1021Xq.m1929o(c1301cz);
        }
        C0686Py c0686Py = this.f969d;
        if (c0686Py != null) {
            c1021Xq.m1926l(c0686Py);
        }
        C2464rl c2464rl = this.f970e;
        if (c2464rl != null) {
            c1021Xq.f3239D = c2464rl;
        }
        MaterialButton materialButton = this.f966a;
        c1021Xq.m1925k(materialButton.getContext());
        c1021Xq.setTintList(this.f978m);
        PorterDuff.Mode mode = this.f977l;
        if (mode != null) {
            c1021Xq.setTintMode(mode);
        }
        float f = this.f976k;
        ColorStateList colorStateList = this.f979n;
        c1021Xq.f3241b.f2912k = f;
        c1021Xq.invalidateSelf();
        C0935Vq c0935Vq = c1021Xq.f3241b;
        if (c0935Vq.f2906e != colorStateList) {
            c0935Vq.f2906e = colorStateList;
            c1021Xq.onStateChange(c1021Xq.getState());
        }
        C1021Xq c1021Xq2 = new C1021Xq(this.f967b);
        C1301cz c1301cz2 = this.f968c;
        if (c1301cz2 != null) {
            c1021Xq2.m1929o(c1301cz2);
        }
        C0686Py c0686Py2 = this.f969d;
        if (c0686Py2 != null) {
            c1021Xq2.m1926l(c0686Py2);
        }
        c1021Xq2.setTint(0);
        float f2 = this.f976k;
        int iM621n = this.f982q ? AbstractC0295Gu.m621n(materialButton, R.attr.colorSurface) : 0;
        c1021Xq2.f3241b.f2912k = f2;
        c1021Xq2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM621n);
        C0935Vq c0935Vq2 = c1021Xq2.f3241b;
        if (c0935Vq2.f2906e != colorStateListValueOf) {
            c0935Vq2.f2906e = colorStateListValueOf;
            c1021Xq2.onStateChange(c1021Xq2.getState());
        }
        C1021Xq c1021Xq3 = new C1021Xq(this.f967b);
        this.f981p = c1021Xq3;
        C1301cz c1301cz3 = this.f968c;
        if (c1301cz3 != null) {
            c1021Xq3.m1929o(c1301cz3);
        }
        C0686Py c0686Py3 = this.f969d;
        if (c0686Py3 != null) {
            this.f981p.m1926l(c0686Py3);
        }
        this.f981p.setTint(-1);
        ColorStateList colorStateListValueOf2 = this.f980o;
        if (colorStateListValueOf2 == null) {
            colorStateListValueOf2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c1021Xq2, c1021Xq}), this.f971f, this.f973h, this.f972g, this.f974i), this.f981p);
        this.f987v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C1021Xq c1021XqM586a = m586a(false);
        if (c1021XqM586a != null) {
            c1021XqM586a.m1927m(this.f988w);
            c1021XqM586a.setState(materialButton.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m589d() {
        C1021Xq c1021XqM586a = m586a(false);
        if (c1021XqM586a != null) {
            C1301cz c1301cz = this.f968c;
            if (c1301cz != null) {
                c1021XqM586a.m1929o(c1301cz);
            } else {
                c1021XqM586a.setShapeAppearanceModel(this.f967b);
            }
            C0686Py c0686Py = this.f969d;
            if (c0686Py != null) {
                c1021XqM586a.m1926l(c0686Py);
            }
        }
        C1021Xq c1021XqM586a2 = m586a(true);
        if (c1021XqM586a2 != null) {
            C1301cz c1301cz2 = this.f968c;
            if (c1301cz2 != null) {
                c1021XqM586a2.m1929o(c1301cz2);
            } else {
                c1021XqM586a2.setShapeAppearanceModel(this.f967b);
            }
            C0686Py c0686Py2 = this.f969d;
            if (c0686Py2 != null) {
                c1021XqM586a2.m1926l(c0686Py2);
            }
        }
        RippleDrawable rippleDrawable = this.f987v;
        InterfaceC1300cy interfaceC1300cy = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.f987v.getNumberOfLayers() > 2 ? (InterfaceC1300cy) this.f987v.getDrawable(2) : (InterfaceC1300cy) this.f987v.getDrawable(1);
        if (interfaceC1300cy != null) {
            interfaceC1300cy.setShapeAppearanceModel(this.f967b);
            if (interfaceC1300cy instanceof C1021Xq) {
                C1021Xq c1021Xq = (C1021Xq) interfaceC1300cy;
                C1301cz c1301cz3 = this.f968c;
                if (c1301cz3 != null) {
                    c1021Xq.m1929o(c1301cz3);
                }
                C0686Py c0686Py3 = this.f969d;
                if (c0686Py3 != null) {
                    c1021Xq.m1926l(c0686Py3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m590e() {
        C1021Xq c1021XqM586a = m586a(false);
        C1021Xq c1021XqM586a2 = m586a(true);
        if (c1021XqM586a != null) {
            float f = this.f976k;
            ColorStateList colorStateList = this.f979n;
            c1021XqM586a.f3241b.f2912k = f;
            c1021XqM586a.invalidateSelf();
            C0935Vq c0935Vq = c1021XqM586a.f3241b;
            if (c0935Vq.f2906e != colorStateList) {
                c0935Vq.f2906e = colorStateList;
                c1021XqM586a.onStateChange(c1021XqM586a.getState());
            }
            if (c1021XqM586a2 != null) {
                float f2 = this.f976k;
                int iM621n = this.f982q ? AbstractC0295Gu.m621n(this.f966a, R.attr.colorSurface) : 0;
                c1021XqM586a2.f3241b.f2912k = f2;
                c1021XqM586a2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iM621n);
                C0935Vq c0935Vq2 = c1021XqM586a2.f3241b;
                if (c0935Vq2.f2906e != colorStateListValueOf) {
                    c0935Vq2.f2906e = colorStateListValueOf;
                    c1021XqM586a2.onStateChange(c1021XqM586a2.getState());
                }
            }
        }
    }
}
