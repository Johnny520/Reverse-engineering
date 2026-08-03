package p000a;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.C0703m5;
import p000a.C0866ug;

/* JADX INFO: renamed from: a.nh */
/* JADX INFO: loaded from: classes.dex */
public final class C0734nh {

    /* JADX INFO: renamed from: b */
    public static final C0734nh f2856b;

    /* JADX INFO: renamed from: a */
    public final k f2857a;

    /* JADX INFO: renamed from: a.nh$a */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final Field f2858a;

        /* JADX INFO: renamed from: b */
        public static final Field f2859b;

        /* JADX INFO: renamed from: c */
        public static final Field f2860c;

        /* JADX INFO: renamed from: d */
        public static final boolean f2861d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2858a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2859b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2860c = declaredField3;
                declaredField3.setAccessible(true);
                f2861d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }
    }

    /* JADX INFO: renamed from: a.nh$d */
    public static class d extends c {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d() {
        }

        @Override // p000a.C0734nh.e
        /* JADX INFO: renamed from: c */
        public void mo1703c(int i, C0479a9 c0479a9) {
            this.f2868c.setInsets(m.m1729a(i), c0479a9.m1167d());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(C0734nh c0734nh) {
            super(c0734nh);
        }
    }

    /* JADX INFO: renamed from: a.nh$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final C0734nh f2869a;

        /* JADX INFO: renamed from: b */
        public C0479a9[] f2870b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e() {
            this(new C0734nh());
        }

        /* JADX INFO: renamed from: a */
        public final void m1704a() {
            C0479a9[] c0479a9Arr = this.f2870b;
            if (c0479a9Arr != null) {
                C0479a9 c0479a9Mo1710f = c0479a9Arr[0];
                C0479a9 c0479a9Mo1710f2 = c0479a9Arr[1];
                C0734nh c0734nh = this.f2869a;
                if (c0479a9Mo1710f2 == null) {
                    c0479a9Mo1710f2 = c0734nh.f2857a.mo1710f(2);
                }
                if (c0479a9Mo1710f == null) {
                    c0479a9Mo1710f = c0734nh.f2857a.mo1710f(1);
                }
                mo1699g(C0479a9.m1164a(c0479a9Mo1710f, c0479a9Mo1710f2));
                C0479a9 c0479a9 = this.f2870b[l.m1728a(16)];
                if (c0479a9 != null) {
                    mo1701f(c0479a9);
                }
                C0479a9 c0479a92 = this.f2870b[l.m1728a(32)];
                if (c0479a92 != null) {
                    mo1700d(c0479a92);
                }
                C0479a9 c0479a93 = this.f2870b[l.m1728a(64)];
                if (c0479a93 != null) {
                    mo1702h(c0479a93);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public C0734nh mo1697b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo1703c(int i, C0479a9 c0479a9) {
            if (this.f2870b == null) {
                this.f2870b = new C0479a9[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f2870b[l.m1728a(i2)] = c0479a9;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void mo1700d(C0479a9 c0479a9) {
        }

        /* JADX INFO: renamed from: e */
        public void mo1698e(C0479a9 c0479a9) {
            throw null;
        }

        /* JADX INFO: renamed from: f */
        public void mo1701f(C0479a9 c0479a9) {
        }

        /* JADX INFO: renamed from: g */
        public void mo1699g(C0479a9 c0479a9) {
            throw null;
        }

        /* JADX INFO: renamed from: h */
        public void mo1702h(C0479a9 c0479a9) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public e(C0734nh c0734nh) {
            this.f2869a = c0734nh;
        }
    }

    /* JADX INFO: renamed from: a.nh$f */
    public static class f extends k {

        /* JADX INFO: renamed from: h */
        public static boolean f2871h = false;

        /* JADX INFO: renamed from: i */
        public static Method f2872i;

        /* JADX INFO: renamed from: j */
        public static Class<?> f2873j;

        /* JADX INFO: renamed from: k */
        public static Field f2874k;

        /* JADX INFO: renamed from: l */
        public static Field f2875l;

        /* JADX INFO: renamed from: c */
        public final WindowInsets f2876c;

        /* JADX INFO: renamed from: d */
        public C0479a9[] f2877d;

        /* JADX INFO: renamed from: e */
        public C0479a9 f2878e;

        /* JADX INFO: renamed from: f */
        public C0734nh f2879f;

        /* JADX INFO: renamed from: g */
        public C0479a9 f2880g;

        public f(C0734nh c0734nh, WindowInsets windowInsets) {
            super(c0734nh);
            this.f2878e = null;
            this.f2876c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: r */
        private C0479a9 m1705r(int i, boolean z) {
            C0479a9 c0479a9M1164a = C0479a9.f1797e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    c0479a9M1164a = C0479a9.m1164a(c0479a9M1164a, m1716s(i2, z));
                }
            }
            return c0479a9M1164a;
        }

        /* JADX INFO: renamed from: t */
        private C0479a9 m1706t() {
            C0734nh c0734nh = this.f2879f;
            return c0734nh != null ? c0734nh.f2857a.mo1720h() : C0479a9.f1797e;
        }

        /* JADX INFO: renamed from: u */
        private C0479a9 m1707u(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f2871h) {
                m1708v();
            }
            Method method = f2872i;
            if (method != null && f2873j != null && f2874k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2874k.get(f2875l.get(objInvoke));
                    if (rect != null) {
                        return C0479a9.m1165b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        /* JADX INFO: renamed from: v */
        private static void m1708v() {
            try {
                f2872i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2873j = cls;
                f2874k = cls.getDeclaredField("mVisibleInsets");
                f2875l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2874k.setAccessible(true);
                f2875l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f2871h = true;
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: d */
        public void mo1709d(View view) {
            C0479a9 c0479a9M1707u = m1707u(view);
            if (c0479a9M1707u == null) {
                c0479a9M1707u = C0479a9.f1797e;
            }
            m1717w(c0479a9M1707u);
        }

        @Override // p000a.C0734nh.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2880g, ((f) obj).f2880g);
            }
            return false;
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: f */
        public C0479a9 mo1710f(int i) {
            return m1705r(i, false);
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: j */
        public final C0479a9 mo1711j() {
            if (this.f2878e == null) {
                WindowInsets windowInsets = this.f2876c;
                this.f2878e = C0479a9.m1165b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f2878e;
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: l */
        public C0734nh mo1712l(int i, int i2, int i3, int i4) {
            C0734nh c0734nhM1690g = C0734nh.m1690g(null, this.f2876c);
            int i5 = Build.VERSION.SDK_INT;
            e dVar = i5 >= 30 ? new d(c0734nhM1690g) : i5 >= 29 ? new c(c0734nhM1690g) : new b(c0734nhM1690g);
            dVar.mo1699g(C0734nh.m1689e(mo1711j(), i, i2, i3, i4));
            dVar.mo1698e(C0734nh.m1689e(mo1720h(), i, i2, i3, i4));
            return dVar.mo1697b();
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: n */
        public boolean mo1713n() {
            return this.f2876c.isRound();
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: o */
        public void mo1714o(C0479a9[] c0479a9Arr) {
            this.f2877d = c0479a9Arr;
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: p */
        public void mo1715p(C0734nh c0734nh) {
            this.f2879f = c0734nh;
        }

        /* JADX INFO: renamed from: s */
        public C0479a9 m1716s(int i, boolean z) {
            C0479a9 c0479a9Mo1720h;
            int i2;
            if (i == 1) {
                return z ? C0479a9.m1165b(0, Math.max(m1706t().f1799b, mo1711j().f1799b), 0, 0) : C0479a9.m1165b(0, mo1711j().f1799b, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    C0479a9 c0479a9M1706t = m1706t();
                    C0479a9 c0479a9Mo1720h2 = mo1720h();
                    return C0479a9.m1165b(Math.max(c0479a9M1706t.f1798a, c0479a9Mo1720h2.f1798a), 0, Math.max(c0479a9M1706t.f1800c, c0479a9Mo1720h2.f1800c), Math.max(c0479a9M1706t.f1801d, c0479a9Mo1720h2.f1801d));
                }
                C0479a9 c0479a9Mo1711j = mo1711j();
                C0734nh c0734nh = this.f2879f;
                c0479a9Mo1720h = c0734nh != null ? c0734nh.f2857a.mo1720h() : null;
                int iMin = c0479a9Mo1711j.f1801d;
                if (c0479a9Mo1720h != null) {
                    iMin = Math.min(iMin, c0479a9Mo1720h.f1801d);
                }
                return C0479a9.m1165b(c0479a9Mo1711j.f1798a, 0, c0479a9Mo1711j.f1800c, iMin);
            }
            C0479a9 c0479a9 = C0479a9.f1797e;
            if (i == 8) {
                C0479a9[] c0479a9Arr = this.f2877d;
                c0479a9Mo1720h = c0479a9Arr != null ? c0479a9Arr[l.m1728a(8)] : null;
                if (c0479a9Mo1720h != null) {
                    return c0479a9Mo1720h;
                }
                C0479a9 c0479a9Mo1711j2 = mo1711j();
                C0479a9 c0479a9M1706t2 = m1706t();
                int i3 = c0479a9Mo1711j2.f1801d;
                if (i3 > c0479a9M1706t2.f1801d) {
                    return C0479a9.m1165b(0, 0, 0, i3);
                }
                C0479a9 c0479a92 = this.f2880g;
                return (c0479a92 == null || c0479a92.equals(c0479a9) || (i2 = this.f2880g.f1801d) <= c0479a9M1706t2.f1801d) ? c0479a9 : C0479a9.m1165b(0, 0, 0, i2);
            }
            if (i == 16) {
                return mo1726i();
            }
            if (i == 32) {
                return mo1725g();
            }
            if (i == 64) {
                return mo1727k();
            }
            if (i != 128) {
                return c0479a9;
            }
            C0734nh c0734nh2 = this.f2879f;
            C0703m5 c0703m5Mo1724e = c0734nh2 != null ? c0734nh2.f2857a.mo1724e() : mo1724e();
            if (c0703m5Mo1724e == null) {
                return c0479a9;
            }
            DisplayCutout displayCutout = c0703m5Mo1724e.f2651a;
            return C0479a9.m1165b(C0703m5.a.m1598d(displayCutout), C0703m5.a.m1600f(displayCutout), C0703m5.a.m1599e(displayCutout), C0703m5.a.m1597c(displayCutout));
        }

        /* JADX INFO: renamed from: w */
        public void m1717w(C0479a9 c0479a9) {
            this.f2880g = c0479a9;
        }
    }

    /* JADX INFO: renamed from: a.nh$g */
    public static class g extends f {

        /* JADX INFO: renamed from: m */
        public C0479a9 f2881m;

        public g(C0734nh c0734nh, WindowInsets windowInsets) {
            super(c0734nh, windowInsets);
            this.f2881m = null;
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: b */
        public C0734nh mo1718b() {
            return C0734nh.m1690g(null, this.f2876c.consumeStableInsets());
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: c */
        public C0734nh mo1719c() {
            return C0734nh.m1690g(null, this.f2876c.consumeSystemWindowInsets());
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: h */
        public final C0479a9 mo1720h() {
            if (this.f2881m == null) {
                WindowInsets windowInsets = this.f2876c;
                this.f2881m = C0479a9.m1165b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f2881m;
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: m */
        public boolean mo1721m() {
            return this.f2876c.isConsumed();
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: q */
        public void mo1722q(C0479a9 c0479a9) {
            this.f2881m = c0479a9;
        }
    }

    /* JADX INFO: renamed from: a.nh$h */
    public static class h extends g {
        public h(C0734nh c0734nh, WindowInsets windowInsets) {
            super(c0734nh, windowInsets);
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: a */
        public C0734nh mo1723a() {
            return C0734nh.m1690g(null, this.f2876c.consumeDisplayCutout());
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: e */
        public C0703m5 mo1724e() {
            DisplayCutout displayCutout = this.f2876c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C0703m5(displayCutout);
        }

        @Override // p000a.C0734nh.f, p000a.C0734nh.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f2876c, hVar.f2876c) && Objects.equals(this.f2880g, hVar.f2880g);
        }

        @Override // p000a.C0734nh.k
        public int hashCode() {
            return this.f2876c.hashCode();
        }
    }

    /* JADX INFO: renamed from: a.nh$i */
    public static class i extends h {

        /* JADX INFO: renamed from: n */
        public C0479a9 f2882n;

        /* JADX INFO: renamed from: o */
        public C0479a9 f2883o;

        /* JADX INFO: renamed from: p */
        public C0479a9 f2884p;

        public i(C0734nh c0734nh, WindowInsets windowInsets) {
            super(c0734nh, windowInsets);
            this.f2882n = null;
            this.f2883o = null;
            this.f2884p = null;
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: g */
        public C0479a9 mo1725g() {
            if (this.f2883o == null) {
                this.f2883o = C0479a9.m1166c(this.f2876c.getMandatorySystemGestureInsets());
            }
            return this.f2883o;
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: i */
        public C0479a9 mo1726i() {
            if (this.f2882n == null) {
                this.f2882n = C0479a9.m1166c(this.f2876c.getSystemGestureInsets());
            }
            return this.f2882n;
        }

        @Override // p000a.C0734nh.k
        /* JADX INFO: renamed from: k */
        public C0479a9 mo1727k() {
            if (this.f2884p == null) {
                this.f2884p = C0479a9.m1166c(this.f2876c.getTappableElementInsets());
            }
            return this.f2884p;
        }

        @Override // p000a.C0734nh.f, p000a.C0734nh.k
        /* JADX INFO: renamed from: l */
        public C0734nh mo1712l(int i, int i2, int i3, int i4) {
            return C0734nh.m1690g(null, this.f2876c.inset(i, i2, i3, i4));
        }

        @Override // p000a.C0734nh.g, p000a.C0734nh.k
        /* JADX INFO: renamed from: q */
        public void mo1722q(C0479a9 c0479a9) {
        }
    }

    /* JADX INFO: renamed from: a.nh$j */
    public static class j extends i {

        /* JADX INFO: renamed from: q */
        public static final C0734nh f2885q = C0734nh.m1690g(null, WindowInsets.CONSUMED);

        public j(C0734nh c0734nh, WindowInsets windowInsets) {
            super(c0734nh, windowInsets);
        }

        @Override // p000a.C0734nh.f, p000a.C0734nh.k
        /* JADX INFO: renamed from: d */
        public final void mo1709d(View view) {
        }

        @Override // p000a.C0734nh.f, p000a.C0734nh.k
        /* JADX INFO: renamed from: f */
        public C0479a9 mo1710f(int i) {
            return C0479a9.m1166c(this.f2876c.getInsets(m.m1729a(i)));
        }
    }

    /* JADX INFO: renamed from: a.nh$k */
    public static class k {

        /* JADX INFO: renamed from: b */
        public static final C0734nh f2886b;

        /* JADX INFO: renamed from: a */
        public final C0734nh f2887a;

        static {
            int i = Build.VERSION.SDK_INT;
            f2886b = (i >= 30 ? new d() : i >= 29 ? new c() : new b()).mo1697b().f2857a.mo1723a().f2857a.mo1718b().f2857a.mo1719c();
        }

        public k(C0734nh c0734nh) {
            this.f2887a = c0734nh;
        }

        /* JADX INFO: renamed from: a */
        public C0734nh mo1723a() {
            return this.f2887a;
        }

        /* JADX INFO: renamed from: b */
        public C0734nh mo1718b() {
            return this.f2887a;
        }

        /* JADX INFO: renamed from: c */
        public C0734nh mo1719c() {
            return this.f2887a;
        }

        /* JADX INFO: renamed from: d */
        public void mo1709d(View view) {
        }

        /* JADX INFO: renamed from: e */
        public C0703m5 mo1724e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return mo1713n() == kVar.mo1713n() && mo1721m() == kVar.mo1721m() && Objects.equals(mo1711j(), kVar.mo1711j()) && Objects.equals(mo1720h(), kVar.mo1720h()) && Objects.equals(mo1724e(), kVar.mo1724e());
        }

        /* JADX INFO: renamed from: f */
        public C0479a9 mo1710f(int i) {
            return C0479a9.f1797e;
        }

        /* JADX INFO: renamed from: g */
        public C0479a9 mo1725g() {
            return mo1711j();
        }

        /* JADX INFO: renamed from: h */
        public C0479a9 mo1720h() {
            return C0479a9.f1797e;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(mo1713n()), Boolean.valueOf(mo1721m()), mo1711j(), mo1720h(), mo1724e());
        }

        /* JADX INFO: renamed from: i */
        public C0479a9 mo1726i() {
            return mo1711j();
        }

        /* JADX INFO: renamed from: j */
        public C0479a9 mo1711j() {
            return C0479a9.f1797e;
        }

        /* JADX INFO: renamed from: k */
        public C0479a9 mo1727k() {
            return mo1711j();
        }

        /* JADX INFO: renamed from: l */
        public C0734nh mo1712l(int i, int i2, int i3, int i4) {
            return f2886b;
        }

        /* JADX INFO: renamed from: m */
        public boolean mo1721m() {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public boolean mo1713n() {
            return false;
        }

        /* JADX INFO: renamed from: o */
        public void mo1714o(C0479a9[] c0479a9Arr) {
        }

        /* JADX INFO: renamed from: p */
        public void mo1715p(C0734nh c0734nh) {
        }

        /* JADX INFO: renamed from: q */
        public void mo1722q(C0479a9 c0479a9) {
        }
    }

    /* JADX INFO: renamed from: a.nh$l */
    public static final class l {
        /* JADX INFO: renamed from: a */
        public static int m1728a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException(C0944z.m2225e("type needs to be >= FIRST and <= LAST, type=", i));
        }
    }

    /* JADX INFO: renamed from: a.nh$m */
    public static final class m {
        /* JADX INFO: renamed from: a */
        public static int m1729a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2856b = j.f2885q;
        } else {
            f2856b = k.f2886b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0734nh(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f2857a = new j(this, windowInsets);
        } else if (i2 >= 29) {
            this.f2857a = new i(this, windowInsets);
        } else {
            this.f2857a = new h(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0479a9 m1689e(C0479a9 c0479a9, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, c0479a9.f1798a - i2);
        int iMax2 = Math.max(0, c0479a9.f1799b - i3);
        int iMax3 = Math.max(0, c0479a9.f1800c - i4);
        int iMax4 = Math.max(0, c0479a9.f1801d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? c0479a9 : C0479a9.m1165b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: g */
    public static C0734nh m1690g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C0734nh c0734nh = new C0734nh(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            C0734nh c0734nhM2035a = C0866ug.e.m2035a(view);
            k kVar = c0734nh.f2857a;
            kVar.mo1715p(c0734nhM2035a);
            kVar.mo1709d(view.getRootView());
        }
        return c0734nh;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final int m1691a() {
        return this.f2857a.mo1711j().f1801d;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public final int m1692b() {
        return this.f2857a.mo1711j().f1798a;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final int m1693c() {
        return this.f2857a.mo1711j().f1800c;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final int m1694d() {
        return this.f2857a.mo1711j().f1799b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0734nh)) {
            return false;
        }
        return Objects.equals(this.f2857a, ((C0734nh) obj).f2857a);
    }

    /* JADX INFO: renamed from: f */
    public final WindowInsets m1695f() {
        k kVar = this.f2857a;
        if (kVar instanceof f) {
            return ((f) kVar).f2876c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f2857a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* JADX INFO: renamed from: a.nh$b */
    public static class b extends e {

        /* JADX INFO: renamed from: e */
        public static Field f2862e = null;

        /* JADX INFO: renamed from: f */
        public static boolean f2863f = false;

        /* JADX INFO: renamed from: g */
        public static Constructor<WindowInsets> f2864g = null;

        /* JADX INFO: renamed from: h */
        public static boolean f2865h = false;

        /* JADX INFO: renamed from: c */
        public WindowInsets f2866c;

        /* JADX INFO: renamed from: d */
        public C0479a9 f2867d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
            this.f2866c = m1696i();
        }

        /* JADX INFO: renamed from: i */
        private static WindowInsets m1696i() {
            if (!f2863f) {
                try {
                    f2862e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f2863f = true;
            }
            Field field = f2862e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f2865h) {
                try {
                    f2864g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f2865h = true;
            }
            Constructor<WindowInsets> constructor = f2864g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // p000a.C0734nh.e
        /* JADX INFO: renamed from: b */
        public C0734nh mo1697b() {
            m1704a();
            C0734nh c0734nhM1690g = C0734nh.m1690g(null, this.f2866c);
            C0479a9[] c0479a9Arr = this.f2870b;
            k kVar = c0734nhM1690g.f2857a;
            kVar.mo1714o(c0479a9Arr);
            kVar.mo1722q(this.f2867d);
            return c0734nhM1690g;
        }

        @Override // p000a.C0734nh.e
        /* JADX INFO: renamed from: e */
        public void mo1698e(C0479a9 c0479a9) {
            this.f2867d = c0479a9;
        }

        @Override // p000a.C0734nh.e
        /* JADX INFO: renamed from: g */
        public void mo1699g(C0479a9 c0479a9) {
            WindowInsets windowInsets = this.f2866c;
            if (windowInsets != null) {
                this.f2866c = windowInsets.replaceSystemWindowInsets(c0479a9.f1798a, c0479a9.f1799b, c0479a9.f1800c, c0479a9.f1801d);
            }
        }

        public b(C0734nh c0734nh) {
            super(c0734nh);
            this.f2866c = c0734nh.m1695f();
        }
    }

    /* JADX INFO: renamed from: a.nh$c */
    public static class c extends e {

        /* JADX INFO: renamed from: c */
        public final WindowInsets.Builder f2868c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
            this.f2868c = C0074E.m184f();
        }

        @Override // p000a.C0734nh.e
        /* JADX INFO: renamed from: b */
        public C0734nh mo1697b() {
            m1704a();
            C0734nh c0734nhM1690g = C0734nh.m1690g(null, this.f2868c.build());
            c0734nhM1690g.f2857a.mo1714o(this.f2870b);
            return c0734nhM1690g;
        }

        @Override // p000a.C0734nh.e
        /* JADX INFO: renamed from: d */
        public void mo1700d(C0479a9 c0479a9) {
            this.f2868c.setMandatorySystemGestureInsets(c0479a9.m1167d());
        }

        @Override // p000a.C0734nh.e
        /* JADX INFO: renamed from: e */
        public void mo1698e(C0479a9 c0479a9) {
            this.f2868c.setStableInsets(c0479a9.m1167d());
        }

        @Override // p000a.C0734nh.e
        /* JADX INFO: renamed from: f */
        public void mo1701f(C0479a9 c0479a9) {
            this.f2868c.setSystemGestureInsets(c0479a9.m1167d());
        }

        @Override // p000a.C0734nh.e
        /* JADX INFO: renamed from: g */
        public void mo1699g(C0479a9 c0479a9) {
            this.f2868c.setSystemWindowInsets(c0479a9.m1167d());
        }

        @Override // p000a.C0734nh.e
        /* JADX INFO: renamed from: h */
        public void mo1702h(C0479a9 c0479a9) {
            this.f2868c.setTappableElementInsets(c0479a9.m1167d());
        }

        public c(C0734nh c0734nh) {
            WindowInsets.Builder builderM184f;
            super(c0734nh);
            WindowInsets windowInsetsM1695f = c0734nh.m1695f();
            if (windowInsetsM1695f != null) {
                builderM184f = C0753oh.m1776b(windowInsetsM1695f);
            } else {
                builderM184f = C0074E.m184f();
            }
            this.f2868c = builderM184f;
        }
    }

    public C0734nh() {
        this.f2857a = new k(this);
    }
}
