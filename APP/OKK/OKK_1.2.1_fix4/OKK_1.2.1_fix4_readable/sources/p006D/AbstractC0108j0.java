package p006D;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p085v.C1102c;

/* JADX INFO: renamed from: D.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0108j0 extends C0118o0 {

    /* JADX INFO: renamed from: h */
    public static boolean f283h = false;

    /* JADX INFO: renamed from: i */
    public static Method f284i;

    /* JADX INFO: renamed from: j */
    public static Class f285j;

    /* JADX INFO: renamed from: k */
    public static Field f286k;

    /* JADX INFO: renamed from: l */
    public static Field f287l;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f288c;

    /* JADX INFO: renamed from: d */
    public C1102c[] f289d;

    /* JADX INFO: renamed from: e */
    public C1102c f290e;

    /* JADX INFO: renamed from: f */
    public C0122q0 f291f;

    /* JADX INFO: renamed from: g */
    public C1102c f292g;

    public AbstractC0108j0(C0122q0 c0122q0, WindowInsets windowInsets) {
        super(c0122q0);
        this.f290e = null;
        this.f288c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private C1102c m376r(int i2, boolean z2) {
        C1102c c1102cM2597a = C1102c.f4248e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                c1102cM2597a = C1102c.m2597a(c1102cM2597a, m387s(i3, z2));
            }
        }
        return c1102cM2597a;
    }

    /* JADX INFO: renamed from: t */
    private C1102c m377t() {
        C0122q0 c0122q0 = this.f291f;
        return c0122q0 != null ? c0122q0.f309a.mo391h() : C1102c.f4248e;
    }

    /* JADX INFO: renamed from: u */
    private C1102c m378u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f283h) {
            m379v();
        }
        Method method = f284i;
        if (method != null && f285j != null && f286k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    return null;
                }
                Rect rect = (Rect) f286k.get(f287l.get(objInvoke));
                if (rect != null) {
                    return C1102c.m2598b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                e2.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: v */
    private static void m379v() {
        try {
            f284i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f285j = cls;
            f286k = cls.getDeclaredField("mVisibleInsets");
            f287l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f286k.setAccessible(true);
            f287l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            e2.getMessage();
        }
        f283h = true;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: d */
    public void mo380d(View view) {
        C1102c c1102cM378u = m378u(view);
        if (c1102cM378u == null) {
            c1102cM378u = C1102c.f4248e;
        }
        m388w(c1102cM378u);
    }

    @Override // p006D.C0118o0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f292g, ((AbstractC0108j0) obj).f292g);
        }
        return false;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: f */
    public C1102c mo381f(int i2) {
        return m376r(i2, false);
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: j */
    public final C1102c mo382j() {
        if (this.f290e == null) {
            WindowInsets windowInsets = this.f288c;
            this.f290e = C1102c.m2598b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f290e;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: l */
    public C0122q0 mo383l(int i2, int i3, int i4, int i5) {
        C0122q0 c0122q0M429d = C0122q0.m429d(null, this.f288c);
        int i6 = Build.VERSION.SDK_INT;
        AbstractC0106i0 c0104h0 = i6 >= 30 ? new C0104h0(c0122q0M429d) : i6 >= 29 ? new C0102g0(c0122q0M429d) : new C0100f0(c0122q0M429d);
        c0104h0.mo364g(C0122q0.m428b(mo382j(), i2, i3, i4, i5));
        c0104h0.mo363e(C0122q0.m428b(mo391h(), i2, i3, i4, i5));
        return c0104h0.mo362b();
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: n */
    public boolean mo384n() {
        return this.f288c.isRound();
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: o */
    public void mo385o(C1102c[] c1102cArr) {
        this.f289d = c1102cArr;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: p */
    public void mo386p(C0122q0 c0122q0) {
        this.f291f = c0122q0;
    }

    /* JADX INFO: renamed from: s */
    public C1102c m387s(int i2, boolean z2) {
        C1102c c1102cMo391h;
        int i3;
        if (i2 == 1) {
            return z2 ? C1102c.m2598b(0, Math.max(m377t().f4250b, mo382j().f4250b), 0, 0) : C1102c.m2598b(0, mo382j().f4250b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C1102c c1102cM377t = m377t();
                C1102c c1102cMo391h2 = mo391h();
                return C1102c.m2598b(Math.max(c1102cM377t.f4249a, c1102cMo391h2.f4249a), 0, Math.max(c1102cM377t.f4251c, c1102cMo391h2.f4251c), Math.max(c1102cM377t.f4252d, c1102cMo391h2.f4252d));
            }
            C1102c c1102cMo382j = mo382j();
            C0122q0 c0122q0 = this.f291f;
            c1102cMo391h = c0122q0 != null ? c0122q0.f309a.mo391h() : null;
            int iMin = c1102cMo382j.f4252d;
            if (c1102cMo391h != null) {
                iMin = Math.min(iMin, c1102cMo391h.f4252d);
            }
            return C1102c.m2598b(c1102cMo382j.f4249a, 0, c1102cMo382j.f4251c, iMin);
        }
        C1102c c1102c = C1102c.f4248e;
        if (i2 == 8) {
            C1102c[] c1102cArr = this.f289d;
            c1102cMo391h = c1102cArr != null ? c1102cArr[3] : null;
            if (c1102cMo391h != null) {
                return c1102cMo391h;
            }
            C1102c c1102cMo382j2 = mo382j();
            C1102c c1102cM377t2 = m377t();
            int i4 = c1102cMo382j2.f4252d;
            if (i4 > c1102cM377t2.f4252d) {
                return C1102c.m2598b(0, 0, 0, i4);
            }
            C1102c c1102c2 = this.f292g;
            return (c1102c2 == null || c1102c2.equals(c1102c) || (i3 = this.f292g.f4252d) <= c1102cM377t2.f4252d) ? c1102c : C1102c.m2598b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return mo419i();
        }
        if (i2 == 32) {
            return mo418g();
        }
        if (i2 == 64) {
            return mo420k();
        }
        if (i2 != 128) {
            return c1102c;
        }
        C0122q0 c0122q02 = this.f291f;
        C0109k c0109kMo408e = c0122q02 != null ? c0122q02.f309a.mo408e() : mo408e();
        if (c0109kMo408e == null) {
            return c1102c;
        }
        int i5 = Build.VERSION.SDK_INT;
        return C1102c.m2598b(i5 >= 28 ? AbstractC0107j.m373d(c0109kMo408e.f293a) : 0, i5 >= 28 ? AbstractC0107j.m375f(c0109kMo408e.f293a) : 0, i5 >= 28 ? AbstractC0107j.m374e(c0109kMo408e.f293a) : 0, i5 >= 28 ? AbstractC0107j.m372c(c0109kMo408e.f293a) : 0);
    }

    /* JADX INFO: renamed from: w */
    public void m388w(C1102c c1102c) {
        this.f292g = c1102c;
    }
}
