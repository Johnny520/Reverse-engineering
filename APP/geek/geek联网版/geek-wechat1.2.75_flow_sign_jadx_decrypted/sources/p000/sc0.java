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
public abstract class sc0 extends yc0 {

    /* JADX INFO: renamed from: h */
    public static boolean f4300h;

    /* JADX INFO: renamed from: i */
    public static Method f4301i;

    /* JADX INFO: renamed from: j */
    public static Class f4302j;

    /* JADX INFO: renamed from: k */
    public static Field f4303k;

    /* JADX INFO: renamed from: l */
    public static Field f4304l;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f4305c;

    /* JADX INFO: renamed from: d */
    public C0346ip[] f4306d;

    /* JADX INFO: renamed from: e */
    public C0346ip f4307e;

    /* JADX INFO: renamed from: f */
    public bd0 f4308f;

    /* JADX INFO: renamed from: g */
    public C0346ip f4309g;

    public sc0(bd0 bd0Var, WindowInsets windowInsets) {
        super(bd0Var);
        this.f4307e = null;
        this.f4305c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private C0346ip m2363r(int i, boolean z) {
        C0346ip c0346ipM1523a = C0346ip.f2570e;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c0346ipM1523a = C0346ip.m1523a(c0346ipM1523a, m2374s(i2, z));
            }
        }
        return c0346ipM1523a;
    }

    /* JADX INFO: renamed from: t */
    private C0346ip m2364t() {
        bd0 bd0Var = this.f4308f;
        return bd0Var != null ? bd0Var.f724a.mo2410h() : C0346ip.f2570e;
    }

    /* JADX INFO: renamed from: u */
    private C0346ip m2365u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f4300h) {
            m2366v();
        }
        Method method = f4301i;
        if (method != null && f4302j != null && f4303k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f4303k.get(f4304l.get(objInvoke));
                if (rect != null) {
                    return C0346ip.m1524b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: v */
    private static void m2366v() {
        try {
            f4301i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f4302j = cls;
            f4303k = cls.getDeclaredField("mVisibleInsets");
            f4304l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f4303k.setAccessible(true);
            f4304l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f4300h = true;
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: d */
    public void mo2367d(View view) {
        C0346ip c0346ipM2365u = m2365u(view);
        if (c0346ipM2365u == null) {
            c0346ipM2365u = C0346ip.f2570e;
        }
        m2375w(c0346ipM2365u);
    }

    @Override // p000.yc0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f4309g, ((sc0) obj).f4309g);
        }
        return false;
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: f */
    public C0346ip mo2368f(int i) {
        return m2363r(i, false);
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: j */
    public final C0346ip mo2369j() {
        if (this.f4307e == null) {
            WindowInsets windowInsets = this.f4305c;
            this.f4307e = C0346ip.m1524b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f4307e;
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: l */
    public bd0 mo2370l(int i, int i2, int i3, int i4) {
        bd0 bd0VarM515g = bd0.m515g(null, this.f4305c);
        int i5 = Build.VERSION.SDK_INT;
        rc0 qc0Var = i5 >= 30 ? new qc0(bd0VarM515g) : i5 >= 29 ? new pc0(bd0VarM515g) : new nc0(bd0VarM515g);
        qc0Var.mo1946g(bd0.m514e(mo2369j(), i, i2, i3, i4));
        qc0Var.mo1945e(bd0.m514e(mo2410h(), i, i2, i3, i4));
        return qc0Var.mo1944b();
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: n */
    public boolean mo2371n() {
        return this.f4305c.isRound();
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: o */
    public void mo2372o(C0346ip[] c0346ipArr) {
        this.f4306d = c0346ipArr;
    }

    @Override // p000.yc0
    /* JADX INFO: renamed from: p */
    public void mo2373p(bd0 bd0Var) {
        this.f4308f = bd0Var;
    }

    /* JADX INFO: renamed from: s */
    public C0346ip m2374s(int i, boolean z) {
        C0346ip c0346ipMo2410h;
        int i2;
        if (i == 1) {
            return z ? C0346ip.m1524b(0, Math.max(m2364t().f2572b, mo2369j().f2572b), 0, 0) : C0346ip.m1524b(0, mo2369j().f2572b, 0, 0);
        }
        if (i == 2) {
            if (z) {
                C0346ip c0346ipM2364t = m2364t();
                C0346ip c0346ipMo2410h2 = mo2410h();
                return C0346ip.m1524b(Math.max(c0346ipM2364t.f2571a, c0346ipMo2410h2.f2571a), 0, Math.max(c0346ipM2364t.f2573c, c0346ipMo2410h2.f2573c), Math.max(c0346ipM2364t.f2574d, c0346ipMo2410h2.f2574d));
            }
            C0346ip c0346ipMo2369j = mo2369j();
            bd0 bd0Var = this.f4308f;
            c0346ipMo2410h = bd0Var != null ? bd0Var.f724a.mo2410h() : null;
            int iMin = c0346ipMo2369j.f2574d;
            if (c0346ipMo2410h != null) {
                iMin = Math.min(iMin, c0346ipMo2410h.f2574d);
            }
            return C0346ip.m1524b(c0346ipMo2369j.f2571a, 0, c0346ipMo2369j.f2573c, iMin);
        }
        C0346ip c0346ip = C0346ip.f2570e;
        if (i == 8) {
            C0346ip[] c0346ipArr = this.f4306d;
            c0346ipMo2410h = c0346ipArr != null ? c0346ipArr[AbstractC0387ju.m1627p(8)] : null;
            if (c0346ipMo2410h != null) {
                return c0346ipMo2410h;
            }
            C0346ip c0346ipMo2369j2 = mo2369j();
            C0346ip c0346ipM2364t2 = m2364t();
            int i3 = c0346ipMo2369j2.f2574d;
            if (i3 > c0346ipM2364t2.f2574d) {
                return C0346ip.m1524b(0, 0, 0, i3);
            }
            C0346ip c0346ip2 = this.f4309g;
            return (c0346ip2 == null || c0346ip2.equals(c0346ip) || (i2 = this.f4309g.f2574d) <= c0346ipM2364t2.f2574d) ? c0346ip : C0346ip.m1524b(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo2608i();
        }
        if (i == 32) {
            return mo2607g();
        }
        if (i == 64) {
            return mo2609k();
        }
        if (i != 128) {
            return c0346ip;
        }
        bd0 bd0Var2 = this.f4308f;
        C0018ah c0018ahMo2563e = bd0Var2 != null ? bd0Var2.f724a.mo2563e() : mo2563e();
        if (c0018ahMo2563e == null) {
            return c0346ip;
        }
        int i4 = Build.VERSION.SDK_INT;
        return C0346ip.m1524b(i4 >= 28 ? AbstractC0966zg.m2846d(c0018ahMo2563e.f82a) : 0, i4 >= 28 ? AbstractC0966zg.m2848f(c0018ahMo2563e.f82a) : 0, i4 >= 28 ? AbstractC0966zg.m2847e(c0018ahMo2563e.f82a) : 0, i4 >= 28 ? AbstractC0966zg.m2845c(c0018ahMo2563e.f82a) : 0);
    }

    /* JADX INFO: renamed from: w */
    public void m2375w(C0346ip c0346ip) {
        this.f4309g = c0346ip;
    }
}
