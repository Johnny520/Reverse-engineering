package p099y;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p085r.C0811c;

/* JADX INFO: renamed from: y.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1061Z extends C1073f0 {

    /* JADX INFO: renamed from: f */
    public static boolean f3681f = false;

    /* JADX INFO: renamed from: g */
    public static Method f3682g;

    /* JADX INFO: renamed from: h */
    public static Class f3683h;

    /* JADX INFO: renamed from: i */
    public static Field f3684i;

    /* JADX INFO: renamed from: j */
    public static Field f3685j;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f3686c;

    /* JADX INFO: renamed from: d */
    public C0811c f3687d;

    /* JADX INFO: renamed from: e */
    public C0811c f3688e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1061Z(C1075g0 c1075g0, WindowInsets windowInsets) {
        super(c1075g0);
        this.f3687d = null;
        this.f3686c = windowInsets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    private C0811c m2313n(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f3681f) {
            m2314o();
        }
        Method method = f3682g;
        if (method != null && f3683h != null && f3684i != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3684i.get(f3685j.get(objInvoke));
                if (rect != null) {
                    return C0811c.m1479a(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: o */
    private static void m2314o() {
        try {
            f3682g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3683h = cls;
            f3684i = cls.getDeclaredField("mVisibleInsets");
            f3685j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3684i.setAccessible(true);
            f3685j.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f3681f = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: d */
    public void mo2315d(View view) {
        C0811c c0811cM2313n = m2313n(view);
        if (c0811cM2313n == null) {
            c0811cM2313n = C0811c.f2711e;
        }
        m2321p(c0811cM2313n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f3688e, ((AbstractC1061Z) obj).f3688e);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: g */
    public final C0811c mo2316g() {
        if (this.f3687d == null) {
            WindowInsets windowInsets = this.f3686c;
            this.f3687d = C0811c.m1479a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3687d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: h */
    public C1075g0 mo2317h(int i2, int i3, int i4, int i5) {
        C1075g0 c1075g0M2342c = C1075g0.m2342c(this.f3686c, null);
        int i6 = Build.VERSION.SDK_INT;
        AbstractC1060Y c1059x = i6 >= 30 ? new C1059X(c1075g0M2342c) : i6 >= 29 ? new C1058W(c1075g0M2342c) : new C1057V(c1075g0M2342c);
        c1059x.mo2311d(C1075g0.m2341a(mo2316g(), i2, i3, i4, i5));
        c1059x.mo2310c(C1075g0.m2341a(mo2324f(), i2, i3, i4, i5));
        return c1059x.mo2309b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: j */
    public boolean mo2318j() {
        return this.f3686c.isRound();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void m2321p(C0811c c0811c) {
        this.f3688e = c0811c;
    }

    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: k */
    public void mo2319k(C0811c[] c0811cArr) {
    }

    @Override // p099y.C1073f0
    /* JADX INFO: renamed from: l */
    public void mo2320l(C1075g0 c1075g0) {
    }
}
