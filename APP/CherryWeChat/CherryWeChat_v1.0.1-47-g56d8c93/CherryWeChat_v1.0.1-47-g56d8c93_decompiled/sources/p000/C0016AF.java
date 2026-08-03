package p000;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: renamed from: AF */
/* JADX INFO: loaded from: classes.dex */
public class C0016AF extends C0317HF {

    /* JADX INFO: renamed from: i */
    public static boolean f21i = false;

    /* JADX INFO: renamed from: j */
    public static Method f22j;

    /* JADX INFO: renamed from: k */
    public static Class f23k;

    /* JADX INFO: renamed from: l */
    public static Field f24l;

    /* JADX INFO: renamed from: m */
    public static Field f25m;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f26c;

    /* JADX INFO: renamed from: d */
    public C2765yl[] f27d;

    /* JADX INFO: renamed from: e */
    public C2765yl f28e;

    /* JADX INFO: renamed from: f */
    public C0489LF f29f;

    /* JADX INFO: renamed from: g */
    public C2765yl f30g;

    /* JADX INFO: renamed from: h */
    public int f31h;

    public C0016AF(C0489LF c0489lf, WindowInsets windowInsets) {
        super(c0489lf);
        this.f28e = null;
        this.f26c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: u */
    private C2765yl m7u(int i, boolean z) {
        C2765yl c2765ylM5336a = C2765yl.f9404e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                c2765ylM5336a = C2765yl.m5336a(c2765ylM5336a, m22v(i2, z));
            }
        }
        return c2765ylM5336a;
    }

    /* JADX INFO: renamed from: w */
    private C2765yl m8w() {
        C0489LF c0489lf = this.f29f;
        return c0489lf != null ? c0489lf.f1602a.mo93i() : C2765yl.f9404e;
    }

    /* JADX INFO: renamed from: x */
    private C2765yl m9x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f21i) {
            m10y();
        }
        Method method = f22j;
        if (method != null && f23k != null && f24l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) f24l.get(f25m.get(objInvoke));
                    if (rect != null) {
                        return C2765yl.m5337b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: y */
    private static void m10y() {
        try {
            f22j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f23k = cls;
            f24l = cls.getDeclaredField("mVisibleInsets");
            f25m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f24l.setAccessible(true);
            f25m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        f21i = true;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m11z(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: d */
    public void mo12d(View view) {
        C2765yl c2765ylM9x = m9x(view);
        if (c2765ylM9x == null) {
            c2765ylM9x = C2765yl.f9404e;
        }
        mo19q(c2765ylM9x);
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: e */
    public void mo13e(C0489LF c0489lf) {
        c0489lf.f1602a.mo20r(this.f29f);
        C2765yl c2765yl = this.f30g;
        C0317HF c0317hf = c0489lf.f1602a;
        c0317hf.mo19q(c2765yl);
        c0317hf.mo21t(this.f31h);
    }

    @Override // p000.C0317HF
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C0016AF c0016af = (C0016AF) obj;
        return Objects.equals(this.f30g, c0016af.f30g) && m11z(this.f31h, c0016af.f31h);
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: g */
    public C2765yl mo14g(int i) {
        return m7u(i, false);
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: k */
    public final C2765yl mo15k() {
        if (this.f28e == null) {
            WindowInsets windowInsets = this.f26c;
            this.f28e = C2765yl.m5337b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f28e;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: m */
    public C0489LF mo16m(int i, int i2, int i3, int i4) {
        C0489LF c0489lfM939h = C0489LF.m939h(null, this.f26c);
        int i5 = Build.VERSION.SDK_INT;
        AbstractC2796zF c2753yF = i5 >= 34 ? new C2753yF(c0489lfM939h) : i5 >= 31 ? new C2710xF(c0489lfM939h) : i5 >= 30 ? new C2667wF(c0489lfM939h) : i5 >= 29 ? new C2624vF(c0489lfM939h) : new C2581uF(c0489lfM939h);
        c2753yF.mo5086g(C0489LF.m938e(mo15k(), i, i2, i3, i4));
        c2753yF.mo5085e(C0489LF.m938e(mo93i(), i, i2, i3, i4));
        return c2753yF.mo5084b();
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: o */
    public boolean mo17o() {
        return this.f26c.isRound();
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: p */
    public void mo18p(C2765yl[] c2765ylArr) {
        this.f27d = c2765ylArr;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: q */
    public void mo19q(C2765yl c2765yl) {
        this.f30g = c2765yl;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: r */
    public void mo20r(C0489LF c0489lf) {
        this.f29f = c0489lf;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: t */
    public void mo21t(int i) {
        this.f31h = i;
    }

    /* JADX INFO: renamed from: v */
    public C2765yl m22v(int i, boolean z) {
        C2765yl c2765ylMo93i;
        int i2;
        C2765yl c2765yl = C2765yl.f9404e;
        if (i == 1) {
            return z ? C2765yl.m5337b(0, Math.max(m8w().f9406b, mo15k().f9406b), 0, 0) : (this.f31h & 4) != 0 ? c2765yl : C2765yl.m5337b(0, mo15k().f9406b, 0, 0);
        }
        if (i == 2) {
            if (z) {
                C2765yl c2765ylM8w = m8w();
                C2765yl c2765ylMo93i2 = mo93i();
                return C2765yl.m5337b(Math.max(c2765ylM8w.f9405a, c2765ylMo93i2.f9405a), 0, Math.max(c2765ylM8w.f9407c, c2765ylMo93i2.f9407c), Math.max(c2765ylM8w.f9408d, c2765ylMo93i2.f9408d));
            }
            if ((this.f31h & 2) != 0) {
                return c2765yl;
            }
            C2765yl c2765ylMo15k = mo15k();
            C0489LF c0489lf = this.f29f;
            c2765ylMo93i = c0489lf != null ? c0489lf.f1602a.mo93i() : null;
            int iMin = c2765ylMo15k.f9408d;
            if (c2765ylMo93i != null) {
                iMin = Math.min(iMin, c2765ylMo93i.f9408d);
            }
            return C2765yl.m5337b(c2765ylMo15k.f9405a, 0, c2765ylMo15k.f9407c, iMin);
        }
        if (i == 8) {
            C2765yl[] c2765ylArr = this.f27d;
            c2765ylMo93i = c2765ylArr != null ? c2765ylArr[AbstractC0714Qj.m1501w(8)] : null;
            if (c2765ylMo93i != null) {
                return c2765ylMo93i;
            }
            C2765yl c2765ylMo15k2 = mo15k();
            C2765yl c2765ylM8w2 = m8w();
            int i3 = c2765ylMo15k2.f9408d;
            if (i3 > c2765ylM8w2.f9408d) {
                return C2765yl.m5337b(0, 0, 0, i3);
            }
            C2765yl c2765yl2 = this.f30g;
            return (c2765yl2 == null || c2765yl2.equals(c2765yl) || (i2 = this.f30g.f9408d) <= c2765ylM8w2.f9408d) ? c2765yl : C2765yl.m5337b(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo261j();
        }
        if (i == 32) {
            return mo260h();
        }
        if (i == 64) {
            return mo262l();
        }
        if (i != 128) {
            return c2765yl;
        }
        C0489LF c0489lf2 = this.f29f;
        C1543ie c1543ieMo150f = c0489lf2 != null ? c0489lf2.f1602a.mo150f() : mo150f();
        if (c1543ieMo150f == null) {
            return c2765yl;
        }
        DisplayCutout displayCutout = c1543ieMo150f.f5442a;
        return C2765yl.m5337b(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
    }

    public C0016AF(C0489LF c0489lf, C0016AF c0016af) {
        this(c0489lf, new WindowInsets(c0016af.f26c));
    }
}
