package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.C0983R;
import java.util.WeakHashMap;
import p000a.C0866ug;

/* JADX INFO: renamed from: a.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0111G0 {

    /* JADX INFO: renamed from: a */
    public final View f370a;

    /* JADX INFO: renamed from: d */
    public C0713mf f373d;

    /* JADX INFO: renamed from: e */
    public C0713mf f374e;

    /* JADX INFO: renamed from: f */
    public C0713mf f375f;

    /* JADX INFO: renamed from: c */
    public int f372c = -1;

    /* JADX INFO: renamed from: b */
    public final C0434Y0 f371b = C0434Y0.m1080a();

    public C0111G0(View view) {
        this.f370a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m296a() {
        View view = this.f370a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f373d != null) {
                if (this.f375f == null) {
                    this.f375f = new C0713mf();
                }
                C0713mf c0713mf = this.f375f;
                c0713mf.f2693a = null;
                c0713mf.f2696d = false;
                c0713mf.f2694b = null;
                c0713mf.f2695c = false;
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                ColorStateList colorStateListM2015g = C0866ug.d.m2015g(view);
                if (colorStateListM2015g != null) {
                    c0713mf.f2696d = true;
                    c0713mf.f2693a = colorStateListM2015g;
                }
                PorterDuff.Mode modeM2016h = C0866ug.d.m2016h(view);
                if (modeM2016h != null) {
                    c0713mf.f2695c = true;
                    c0713mf.f2694b = modeM2016h;
                }
                if (c0713mf.f2696d || c0713mf.f2695c) {
                    C0434Y0.m1083e(background, c0713mf, view.getDrawableState());
                    return;
                }
            }
            C0713mf c0713mf2 = this.f374e;
            if (c0713mf2 != null) {
                C0434Y0.m1083e(background, c0713mf2, view.getDrawableState());
                return;
            }
            C0713mf c0713mf3 = this.f373d;
            if (c0713mf3 != null) {
                C0434Y0.m1083e(background, c0713mf3, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m297b() {
        C0713mf c0713mf = this.f374e;
        if (c0713mf != null) {
            return c0713mf.f2693a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m298c() {
        C0713mf c0713mf = this.f374e;
        if (c0713mf != null) {
            return c0713mf.f2694b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m299d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM1811f;
        View view = this.f370a;
        C0751of c0751ofM1768e = C0751of.m1768e(view.getContext(), attributeSet, C0983R.styleable.ViewBackgroundHelper, i);
        TypedArray typedArray = c0751ofM1768e.f2960b;
        View view2 = this.f370a;
        C0866ug.m2002i(view2, view2.getContext(), C0983R.styleable.ViewBackgroundHelper, attributeSet, c0751ofM1768e.f2960b, i);
        try {
            if (typedArray.hasValue(C0983R.styleable.ViewBackgroundHelper_android_background)) {
                this.f372c = typedArray.getResourceId(C0983R.styleable.ViewBackgroundHelper_android_background, -1);
                C0434Y0 c0434y0 = this.f371b;
                Context context = view.getContext();
                int i2 = this.f372c;
                synchronized (c0434y0) {
                    colorStateListM1811f = c0434y0.f1632a.m1811f(context, i2);
                }
                if (colorStateListM1811f != null) {
                    m302g(colorStateListM1811f);
                }
            }
            if (typedArray.hasValue(C0983R.styleable.ViewBackgroundHelper_backgroundTint)) {
                C0866ug.d.m2025q(view, c0751ofM1768e.m1769a(C0983R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(C0983R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                C0866ug.d.m2026r(view, C0912x5.m2200c(typedArray.getInt(C0983R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            c0751ofM1768e.m1773f();
        } catch (Throwable th) {
            c0751ofM1768e.m1773f();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m300e() {
        this.f372c = -1;
        m302g(null);
        m296a();
    }

    /* JADX INFO: renamed from: f */
    public final void m301f(int i) {
        ColorStateList colorStateListM1811f;
        this.f372c = i;
        C0434Y0 c0434y0 = this.f371b;
        if (c0434y0 != null) {
            Context context = this.f370a.getContext();
            synchronized (c0434y0) {
                colorStateListM1811f = c0434y0.f1632a.m1811f(context, i);
            }
        } else {
            colorStateListM1811f = null;
        }
        m302g(colorStateListM1811f);
        m296a();
    }

    /* JADX INFO: renamed from: g */
    public final void m302g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f373d == null) {
                this.f373d = new C0713mf();
            }
            C0713mf c0713mf = this.f373d;
            c0713mf.f2693a = colorStateList;
            c0713mf.f2696d = true;
        } else {
            this.f373d = null;
        }
        m296a();
    }

    /* JADX INFO: renamed from: h */
    public final void m303h(ColorStateList colorStateList) {
        if (this.f374e == null) {
            this.f374e = new C0713mf();
        }
        C0713mf c0713mf = this.f374e;
        c0713mf.f2693a = colorStateList;
        c0713mf.f2696d = true;
        m296a();
    }

    /* JADX INFO: renamed from: i */
    public final void m304i(PorterDuff.Mode mode) {
        if (this.f374e == null) {
            this.f374e = new C0713mf();
        }
        C0713mf c0713mf = this.f374e;
        c0713mf.f2694b = mode;
        c0713mf.f2695c = true;
        m296a();
    }
}
