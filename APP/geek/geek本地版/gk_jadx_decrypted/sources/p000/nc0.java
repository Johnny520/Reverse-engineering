package p000;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class nc0 extends tc0 {

    /* JADX INFO: renamed from: h */
    public static boolean f3385h;

    /* JADX INFO: renamed from: i */
    public static Method f3386i;

    /* JADX INFO: renamed from: j */
    public static Class f3387j;

    /* JADX INFO: renamed from: k */
    public static Field f3388k;

    /* JADX INFO: renamed from: l */
    public static Field f3389l;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f3390c;

    /* JADX INFO: renamed from: d */
    public C0195ep[] f3391d;

    /* JADX INFO: renamed from: e */
    public C0195ep f3392e;

    /* JADX INFO: renamed from: f */
    public wc0 f3393f;

    /* JADX INFO: renamed from: g */
    public C0195ep f3394g;

    public nc0(wc0 wc0Var, WindowInsets windowInsets) {
        super(wc0Var);
        this.f3392e = null;
        this.f3390c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private C0195ep m1927r(int i, boolean z) {
        C0195ep c0195epM1049a = C0195ep.f1827e;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c0195epM1049a = C0195ep.m1049a(c0195epM1049a, m1938s(i2, z));
            }
        }
        return c0195epM1049a;
    }

    /* JADX INFO: renamed from: t */
    private C0195ep m1928t() {
        wc0 wc0Var = this.f3393f;
        return wc0Var != null ? wc0Var.f4955a.mo2014h() : C0195ep.f1827e;
    }

    /* JADX INFO: renamed from: u */
    private C0195ep m1929u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f3385h) {
            m1930v();
        }
        Method method = f3386i;
        if (method != null && f3387j != null && f3388k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3388k.get(f3389l.get(objInvoke));
                if (rect != null) {
                    return C0195ep.m1050b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: v */
    private static void m1930v() {
        try {
            f3386i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3387j = cls;
            f3388k = cls.getDeclaredField("mVisibleInsets");
            f3389l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3388k.setAccessible(true);
            f3389l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f3385h = true;
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: d */
    public void mo1931d(View view) {
        C0195ep c0195epM1929u = m1929u(view);
        if (c0195epM1929u == null) {
            c0195epM1929u = C0195ep.f1827e;
        }
        m1939w(c0195epM1929u);
    }

    @Override // p000.tc0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f3394g, ((nc0) obj).f3394g);
        }
        return false;
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: f */
    public C0195ep mo1932f(int i) {
        return m1927r(i, false);
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: j */
    public final C0195ep mo1933j() {
        if (this.f3392e == null) {
            WindowInsets windowInsets = this.f3390c;
            this.f3392e = C0195ep.m1050b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3392e;
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: l */
    public wc0 mo1934l(int i, int i2, int i3, int i4) {
        wc0 wc0VarM2563g = wc0.m2563g(null, this.f3390c);
        int i5 = Build.VERSION.SDK_INT;
        mc0 lc0Var = i5 >= 30 ? new lc0(wc0VarM2563g) : i5 >= 29 ? new kc0(wc0VarM2563g) : new ic0(wc0VarM2563g);
        lc0Var.mo1435g(wc0.m2562e(mo1933j(), i, i2, i3, i4));
        lc0Var.mo1434e(wc0.m2562e(mo2014h(), i, i2, i3, i4));
        return lc0Var.mo1433b();
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: n */
    public boolean mo1935n() {
        return this.f3390c.isRound();
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: o */
    public void mo1936o(C0195ep[] c0195epArr) {
        this.f3391d = c0195epArr;
    }

    @Override // p000.tc0
    /* JADX INFO: renamed from: p */
    public void mo1937p(wc0 wc0Var) {
        this.f3393f = wc0Var;
    }

    /* JADX INFO: renamed from: s */
    public C0195ep m1938s(int i, boolean z) {
        C0195ep c0195epMo2014h;
        int i2;
        if (i == 1) {
            return z ? C0195ep.m1050b(0, Math.max(m1928t().f1829b, mo1933j().f1829b), 0, 0) : C0195ep.m1050b(0, mo1933j().f1829b, 0, 0);
        }
        if (i == 2) {
            if (z) {
                C0195ep c0195epM1928t = m1928t();
                C0195ep c0195epMo2014h2 = mo2014h();
                return C0195ep.m1050b(Math.max(c0195epM1928t.f1828a, c0195epMo2014h2.f1828a), 0, Math.max(c0195epM1928t.f1830c, c0195epMo2014h2.f1830c), Math.max(c0195epM1928t.f1831d, c0195epMo2014h2.f1831d));
            }
            C0195ep c0195epMo1933j = mo1933j();
            wc0 wc0Var = this.f3393f;
            c0195epMo2014h = wc0Var != null ? wc0Var.f4955a.mo2014h() : null;
            int iMin = c0195epMo1933j.f1831d;
            if (c0195epMo2014h != null) {
                iMin = Math.min(iMin, c0195epMo2014h.f1831d);
            }
            return C0195ep.m1050b(c0195epMo1933j.f1828a, 0, c0195epMo1933j.f1830c, iMin);
        }
        C0195ep c0195ep = C0195ep.f1827e;
        if (i == 8) {
            C0195ep[] c0195epArr = this.f3391d;
            c0195epMo2014h = c0195epArr != null ? c0195epArr[AbstractC0126ct.m819q(8)] : null;
            if (c0195epMo2014h != null) {
                return c0195epMo2014h;
            }
            C0195ep c0195epMo1933j2 = mo1933j();
            C0195ep c0195epM1928t2 = m1928t();
            int i3 = c0195epMo1933j2.f1831d;
            if (i3 > c0195epM1928t2.f1831d) {
                return C0195ep.m1050b(0, 0, 0, i3);
            }
            C0195ep c0195ep2 = this.f3394g;
            return (c0195ep2 == null || c0195ep2.equals(c0195ep) || (i2 = this.f3394g.f1831d) <= c0195epM1928t2.f1831d) ? c0195ep : C0195ep.m1050b(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo2290i();
        }
        if (i == 32) {
            return mo2289g();
        }
        if (i == 64) {
            return mo2291k();
        }
        if (i != 128) {
            return c0195ep;
        }
        wc0 wc0Var2 = this.f3393f;
        C0929yg c0929ygMo2170e = wc0Var2 != null ? wc0Var2.f4955a.mo2170e() : mo2170e();
        if (c0929ygMo2170e == null) {
            return c0195ep;
        }
        int i4 = Build.VERSION.SDK_INT;
        return C0195ep.m1050b(i4 >= 28 ? AbstractC0892xg.m2627d(c0929ygMo2170e.f5340a) : 0, i4 >= 28 ? AbstractC0892xg.m2629f(c0929ygMo2170e.f5340a) : 0, i4 >= 28 ? AbstractC0892xg.m2628e(c0929ygMo2170e.f5340a) : 0, i4 >= 28 ? AbstractC0892xg.m2626c(c0929ygMo2170e.f5340a) : 0);
    }

    /* JADX INFO: renamed from: w */
    public void m1939w(C0195ep c0195ep) {
        this.f3394g = c0195ep;
    }
}
