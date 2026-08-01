package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: v2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0804v2 {

    /* JADX INFO: renamed from: a */
    public final View f4787a;

    /* JADX INFO: renamed from: d */
    public y60 f4790d;

    /* JADX INFO: renamed from: e */
    public y60 f4791e;

    /* JADX INFO: renamed from: f */
    public y60 f4792f;

    /* JADX INFO: renamed from: c */
    public int f4789c = -1;

    /* JADX INFO: renamed from: b */
    public final C0768u3 f4788b = C0768u3.m2404a();

    public C0804v2(View view) {
        this.f4787a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m2479a() {
        View view = this.f4787a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f4790d != null) {
                if (this.f4792f == null) {
                    this.f4792f = new y60();
                }
                y60 y60Var = this.f4792f;
                y60Var.f5279a = null;
                y60Var.f5282d = false;
                y60Var.f5280b = null;
                y60Var.f5281c = false;
                WeakHashMap weakHashMap = ja0.f2600a;
                ColorStateList colorStateListM2661g = y90.m2661g(view);
                if (colorStateListM2661g != null) {
                    y60Var.f5282d = true;
                    y60Var.f5279a = colorStateListM2661g;
                }
                PorterDuff.Mode modeM2662h = y90.m2662h(view);
                if (modeM2662h != null) {
                    y60Var.f5281c = true;
                    y60Var.f5280b = modeM2662h;
                }
                if (y60Var.f5282d || y60Var.f5281c) {
                    C0768u3.m2407e(background, y60Var, view.getDrawableState());
                    return;
                }
            }
            y60 y60Var2 = this.f4791e;
            if (y60Var2 != null) {
                C0768u3.m2407e(background, y60Var2, view.getDrawableState());
                return;
            }
            y60 y60Var3 = this.f4790d;
            if (y60Var3 != null) {
                C0768u3.m2407e(background, y60Var3, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m2480b() {
        y60 y60Var = this.f4791e;
        if (y60Var != null) {
            return y60Var.f5279a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m2481c() {
        y60 y60Var = this.f4791e;
        if (y60Var != null) {
            return y60Var.f5280b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m2482d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM2542f;
        View view = this.f4787a;
        Context context = view.getContext();
        int[] iArr = AbstractC0910xy.f5242z;
        C0659r5 c0659r5M2219y = C0659r5.m2219y(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
        View view2 = this.f4787a;
        ja0.m1574k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0659r5M2219y.f4209b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f4789c = typedArray.getResourceId(0, -1);
                C0768u3 c0768u3 = this.f4788b;
                Context context2 = view.getContext();
                int i2 = this.f4789c;
                synchronized (c0768u3) {
                    colorStateListM2542f = c0768u3.f4655a.m2542f(context2, i2);
                }
                if (colorStateListM2542f != null) {
                    m2485g(colorStateListM2542f);
                }
            }
            if (typedArray.hasValue(1)) {
                y90.m2671q(view, c0659r5M2219y.m2233l(1));
            }
            if (typedArray.hasValue(2)) {
                y90.m2672r(view, AbstractC0187eh.m1028b(typedArray.getInt(2, -1), null));
            }
            c0659r5M2219y.m2245z();
        } catch (Throwable th) {
            c0659r5M2219y.m2245z();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2483e() {
        this.f4789c = -1;
        m2485g(null);
        m2479a();
    }

    /* JADX INFO: renamed from: f */
    public final void m2484f(int i) {
        ColorStateList colorStateListM2542f;
        this.f4789c = i;
        C0768u3 c0768u3 = this.f4788b;
        if (c0768u3 != null) {
            Context context = this.f4787a.getContext();
            synchronized (c0768u3) {
                colorStateListM2542f = c0768u3.f4655a.m2542f(context, i);
            }
        } else {
            colorStateListM2542f = null;
        }
        m2485g(colorStateListM2542f);
        m2479a();
    }

    /* JADX INFO: renamed from: g */
    public final void m2485g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f4790d == null) {
                this.f4790d = new y60();
            }
            y60 y60Var = this.f4790d;
            y60Var.f5279a = colorStateList;
            y60Var.f5282d = true;
        } else {
            this.f4790d = null;
        }
        m2479a();
    }

    /* JADX INFO: renamed from: h */
    public final void m2486h(ColorStateList colorStateList) {
        if (this.f4791e == null) {
            this.f4791e = new y60();
        }
        y60 y60Var = this.f4791e;
        y60Var.f5279a = colorStateList;
        y60Var.f5282d = true;
        m2479a();
    }

    /* JADX INFO: renamed from: i */
    public final void m2487i(PorterDuff.Mode mode) {
        if (this.f4791e == null) {
            this.f4791e = new y60();
        }
        y60 y60Var = this.f4791e;
        y60Var.f5280b = mode;
        y60Var.f5281c = true;
        m2479a();
    }
}
