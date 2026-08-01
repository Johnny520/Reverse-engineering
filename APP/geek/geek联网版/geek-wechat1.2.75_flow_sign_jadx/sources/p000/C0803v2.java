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
public final class C0803v2 {

    /* JADX INFO: renamed from: a */
    public final View f4876a;

    /* JADX INFO: renamed from: d */
    public e70 f4879d;

    /* JADX INFO: renamed from: e */
    public e70 f4880e;

    /* JADX INFO: renamed from: f */
    public e70 f4881f;

    /* JADX INFO: renamed from: c */
    public int f4878c = -1;

    /* JADX INFO: renamed from: b */
    public final C0767u3 f4877b = C0767u3.m2425a();

    public C0803v2(View view) {
        this.f4876a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m2533a() {
        View view = this.f4876a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f4879d != null) {
                if (this.f4881f == null) {
                    this.f4881f = new e70();
                }
                e70 e70Var = this.f4881f;
                e70Var.f1522a = null;
                e70Var.f1525d = false;
                e70Var.f1523b = null;
                e70Var.f1524c = false;
                WeakHashMap weakHashMap = oa0.f3426a;
                ColorStateList colorStateListM889g = da0.m889g(view);
                if (colorStateListM889g != null) {
                    e70Var.f1525d = true;
                    e70Var.f1522a = colorStateListM889g;
                }
                PorterDuff.Mode modeM890h = da0.m890h(view);
                if (modeM890h != null) {
                    e70Var.f1524c = true;
                    e70Var.f1523b = modeM890h;
                }
                if (e70Var.f1525d || e70Var.f1524c) {
                    C0767u3.m2428e(background, e70Var, view.getDrawableState());
                    return;
                }
            }
            e70 e70Var2 = this.f4880e;
            if (e70Var2 != null) {
                C0767u3.m2428e(background, e70Var2, view.getDrawableState());
                return;
            }
            e70 e70Var3 = this.f4879d;
            if (e70Var3 != null) {
                C0767u3.m2428e(background, e70Var3, view.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m2534b() {
        e70 e70Var = this.f4880e;
        if (e70Var != null) {
            return e70Var.f1522a;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuff.Mode m2535c() {
        e70 e70Var = this.f4880e;
        if (e70Var != null) {
            return e70Var.f1523b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m2536d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM822f;
        View view = this.f4876a;
        Context context = view.getContext();
        int[] iArr = AbstractC0205ez.f1702z;
        C0658r5 c0658r5M2226y = C0658r5.m2226y(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0658r5M2226y.f4064b;
        View view2 = this.f4876a;
        oa0.m2011k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0658r5M2226y.f4064b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f4878c = typedArray.getResourceId(0, -1);
                C0767u3 c0767u3 = this.f4877b;
                Context context2 = view.getContext();
                int i2 = this.f4878c;
                synchronized (c0767u3) {
                    colorStateListM822f = c0767u3.f4623a.m822f(context2, i2);
                }
                if (colorStateListM822f != null) {
                    m2539g(colorStateListM822f);
                }
            }
            if (typedArray.hasValue(1)) {
                da0.m899q(view, c0658r5M2226y.m2240l(1));
            }
            if (typedArray.hasValue(2)) {
                da0.m900r(view, AbstractC0261gh.m1276b(typedArray.getInt(2, -1), null));
            }
            c0658r5M2226y.m2252z();
        } catch (Throwable th) {
            c0658r5M2226y.m2252z();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2537e() {
        this.f4878c = -1;
        m2539g(null);
        m2533a();
    }

    /* JADX INFO: renamed from: f */
    public final void m2538f(int i) {
        ColorStateList colorStateListM822f;
        this.f4878c = i;
        C0767u3 c0767u3 = this.f4877b;
        if (c0767u3 != null) {
            Context context = this.f4876a.getContext();
            synchronized (c0767u3) {
                colorStateListM822f = c0767u3.f4623a.m822f(context, i);
            }
        } else {
            colorStateListM822f = null;
        }
        m2539g(colorStateListM822f);
        m2533a();
    }

    /* JADX INFO: renamed from: g */
    public final void m2539g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f4879d == null) {
                this.f4879d = new e70();
            }
            e70 e70Var = this.f4879d;
            e70Var.f1522a = colorStateList;
            e70Var.f1525d = true;
        } else {
            this.f4879d = null;
        }
        m2533a();
    }

    /* JADX INFO: renamed from: h */
    public final void m2540h(ColorStateList colorStateList) {
        if (this.f4880e == null) {
            this.f4880e = new e70();
        }
        e70 e70Var = this.f4880e;
        e70Var.f1522a = colorStateList;
        e70Var.f1525d = true;
        m2533a();
    }

    /* JADX INFO: renamed from: i */
    public final void m2541i(PorterDuff.Mode mode) {
        if (this.f4880e == null) {
            this.f4880e = new e70();
        }
        e70 e70Var = this.f4880e;
        e70Var.f1523b = mode;
        e70Var.f1524c = true;
        m2533a();
    }
}
