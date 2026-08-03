package p057g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p018J0.C0234d;
import p048b.AbstractC0550a;

/* JADX INFO: renamed from: g.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0916n {

    /* JADX INFO: renamed from: a */
    public final View f3239a;

    /* JADX INFO: renamed from: b */
    public final C0926s f3240b;

    /* JADX INFO: renamed from: c */
    public int f3241c = -1;

    /* JADX INFO: renamed from: d */
    public C0853C0 f3242d;

    /* JADX INFO: renamed from: e */
    public C0853C0 f3243e;

    /* JADX INFO: renamed from: f */
    public C0853C0 f3244f;

    public C0916n(View view) {
        C0926s c0926s;
        this.f3239a = view;
        PorterDuff.Mode mode = C0926s.f3289b;
        synchronized (C0926s.class) {
            try {
                if (C0926s.f3290c == null) {
                    C0926s.m2259b();
                }
                c0926s = C0926s.f3290c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3240b = c0926s;
    }

    /* JADX INFO: renamed from: a */
    public final void m2240a() {
        View view = this.f3239a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f3242d != null) {
                if (this.f3244f == null) {
                    this.f3244f = new C0853C0();
                }
                C0853C0 c0853c0 = this.f3244f;
                c0853c0.f3084a = null;
                c0853c0.f3087d = false;
                c0853c0.f3085b = null;
                c0853c0.f3086c = false;
                Field field = AbstractC0080Q.f219a;
                ColorStateList colorStateListM217g = AbstractC0070G.m217g(view);
                if (colorStateListM217g != null) {
                    c0853c0.f3087d = true;
                    c0853c0.f3084a = colorStateListM217g;
                }
                PorterDuff.Mode modeM218h = AbstractC0070G.m218h(view);
                if (modeM218h != null) {
                    c0853c0.f3086c = true;
                    c0853c0.f3085b = modeM218h;
                }
                if (c0853c0.f3087d || c0853c0.f3086c) {
                    C0926s.m2260c(background, c0853c0, view.getDrawableState());
                    return;
                }
            }
            C0853C0 c0853c02 = this.f3243e;
            if (c0853c02 != null) {
                C0926s.m2260c(background, c0853c02, view.getDrawableState());
                return;
            }
            C0853C0 c0853c03 = this.f3242d;
            if (c0853c03 != null) {
                C0926s.m2260c(background, c0853c03, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m2241b() {
        C0853C0 c0853c0 = this.f3243e;
        if (c0853c0 != null) {
            return c0853c0.f3084a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m2242c() {
        C0853C0 c0853c0 = this.f3243e;
        if (c0853c0 != null) {
            return c0853c0.f3085b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m2243d(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateListM2270h;
        View view = this.f3239a;
        Context context = view.getContext();
        int[] iArr = AbstractC0550a.f1636u;
        C0234d c0234dM638s = C0234d.m638s(context, attributeSet, iArr, i2, 0);
        TypedArray typedArray = (TypedArray) c0234dM638s.f475c;
        View view2 = this.f3239a;
        AbstractC0080Q.m290i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0234dM638s.f475c, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.f3241c = typedArray.getResourceId(0, -1);
                C0926s c0926s = this.f3240b;
                Context context2 = view.getContext();
                int i3 = this.f3241c;
                synchronized (c0926s) {
                    colorStateListM2270h = c0926s.f3291a.m2270h(context2, i3);
                }
                if (colorStateListM2270h != null) {
                    m2246g(colorStateListM2270h);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC0070G.m227q(view, c0234dM638s.m645h(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0070G.m228r(view, AbstractC0886W.m2221c(typedArray.getInt(2, -1), null));
            }
            c0234dM638s.m657u();
        } catch (Throwable th) {
            c0234dM638s.m657u();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2244e() {
        this.f3241c = -1;
        m2246g(null);
        m2240a();
    }

    /* JADX INFO: renamed from: f */
    public final void m2245f(int i2) {
        ColorStateList colorStateListM2270h;
        this.f3241c = i2;
        C0926s c0926s = this.f3240b;
        if (c0926s != null) {
            Context context = this.f3239a.getContext();
            synchronized (c0926s) {
                colorStateListM2270h = c0926s.f3291a.m2270h(context, i2);
            }
        } else {
            colorStateListM2270h = null;
        }
        m2246g(colorStateListM2270h);
        m2240a();
    }

    /* JADX INFO: renamed from: g */
    public final void m2246g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f3242d == null) {
                this.f3242d = new C0853C0();
            }
            C0853C0 c0853c0 = this.f3242d;
            c0853c0.f3084a = colorStateList;
            c0853c0.f3087d = true;
        } else {
            this.f3242d = null;
        }
        m2240a();
    }

    /* JADX INFO: renamed from: h */
    public final void m2247h(ColorStateList colorStateList) {
        if (this.f3243e == null) {
            this.f3243e = new C0853C0();
        }
        C0853C0 c0853c0 = this.f3243e;
        c0853c0.f3084a = colorStateList;
        c0853c0.f3087d = true;
        m2240a();
    }

    /* JADX INFO: renamed from: i */
    public final void m2248i(PorterDuff.Mode mode) {
        if (this.f3243e == null) {
            this.f3243e = new C0853C0();
        }
        C0853C0 c0853c0 = this.f3243e;
        c0853c0.f3085b = mode;
        c0853c0.f3086c = true;
        m2240a();
    }
}
