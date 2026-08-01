package defpackage;

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
    public static boolean h;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public ep[] d;
    public ep e;
    public wc0 f;
    public ep g;

    public nc0(wc0 r1, WindowInsets r2) {
        super(r1);
        this.e = null;
        this.c = r2;
    }

    @SuppressLint({"WrongConstant"})
    private ep r(int r4, boolean r5) {
        ep r0 = ep.e;
        int r1 = 1;
    L4:
        if (r1 > 256) goto L10;
        if ((r4 & r1) == 0) goto L9;
        r0 = ep.a(r0, s(r1, r5));
    L9:
        r1 = r1 << 1;
        goto L4
    L10:
        return r0;
    }

    private ep t() {
        wc0 r0 = this.f;
        if (r0 == null) goto L7;
        return r0.a.h();
    L7:
        return ep.e;
    }

    private ep u(View r6) {
        if (Build.VERSION.SDK_INT >= 30) goto L27;
        if (h == true) goto L7;
        v();
    L7:
        Method r1 = i;
        if (r1 != null) goto L10;
    L25:
        return null;
    L10:
        if (j == null) goto L25;
        if (k == null) goto L25;
        Object r62 = r1.invoke(r6, null);     // Catch: ReflectiveOperationException -> L18
        if (r62 != null) goto L20;
        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());     // Catch: ReflectiveOperationException -> L18
        return null;
    L20:
        Rect r63 = (Rect) k.get(l.get(r62));     // Catch: ReflectiveOperationException -> L18
        if (r63 == null) goto L25;
        return ep.b(r63.left, r63.top, r63.right, r63.bottom);
    L18:
        e = move-exception;
        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        goto L25
    L27:
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        i = View.class.getDeclaredMethod("getViewRootImpl", null);     // Catch: ReflectiveOperationException -> L5
        Class<?> r1 = Class.forName("android.view.View$AttachInfo");     // Catch: ReflectiveOperationException -> L5
        j = r1;     // Catch: ReflectiveOperationException -> L5
        k = r1.getDeclaredField("mVisibleInsets");     // Catch: ReflectiveOperationException -> L5
        l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");     // Catch: ReflectiveOperationException -> L5
        k.setAccessible(true);     // Catch: ReflectiveOperationException -> L5
        l.setAccessible(true);     // Catch: ReflectiveOperationException -> L5
    L7:
        h = true;
        return;
    L5:
        e = move-exception;
        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        goto L7
    }

    @Override // defpackage.tc0
    public void d(View r1) {
        ep r12 = u(r1);
        if (r12 != null) goto L5;
        r12 = ep.e;
    L5:
        w(r12);
    }

    @Override // defpackage.tc0
    public boolean equals(Object r2) {
        if (super.equals(r2) == true) goto L7;
        return false;
    L7:
        return Objects.equals(this.g, ((nc0) r2).g);
    }

    @Override // defpackage.tc0
    public ep f(int r2) {
        return r(r2, false);
    }

    @Override // defpackage.tc0
    public final ep j() {
        if (this.e != null) goto L6;
        WindowInsets r0 = this.c;
        this.e = ep.b(r0.getSystemWindowInsetLeft(), r0.getSystemWindowInsetTop(), r0.getSystemWindowInsetRight(), r0.getSystemWindowInsetBottom());
    L6:
        return this.e;
    }

    @Override // defpackage.tc0
    public wc0 l(int r4, int r5, int r6, int r7) {
        wc0 r0 = wc0.g(null, this.c);
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 30) goto L6;
        mc0 r12 = new lc0(r0);
    L9:
        r12.g(wc0.e(j(), r4, r5, r6, r7));
        r12.e(wc0.e(h(), r4, r5, r6, r7));
        return r12.b();
    L6:
        if (r1 < 29) goto L8;
        r12 = new kc0(r0);
        goto L9
    L8:
        r12 = new ic0(r0);
        goto L9
    }

    @Override // defpackage.tc0
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.tc0
    public void o(ep[] r1) {
        this.d = r1;
    }

    @Override // defpackage.tc0
    public void p(wc0 r1) {
        this.f = r1;
    }

    public ep s(int r6, boolean r7) {
        int r1 = 0;
        if (r6 == 1) goto L72;
        ep r2 = null;
        if (r6 == 2) goto L61;
        ep r0 = ep.e;
        if (r6 != 8) goto L9;
        ep[] r62 = this.d;
        if (r62 == null) goto L46;
        r2 = r62[ct.q(8)];
    L46:
        if (r2 == null) goto L48;
        return r2;
    L48:
        ep r63 = j();
        ep r72 = t();
        int r64 = r63.d;
        if (r64 > r72.d) goto L51;
        ep r65 = this.g;
        if (r65 != null) goto L55;
    L60:
        return r0;
    L55:
        if (r65.equals(r0) == true) goto L60;
        int r66 = this.g.d;
        if (r66 <= r72.d) goto L60;
        return ep.b(0, 0, 0, r66);
    L51:
        return ep.b(0, 0, 0, r64);
    L9:
        if (r6 == 16) goto L42;
        if (r6 == 32) goto L40;
        if (r6 == 64) goto L38;
        if (r6 == 128) goto L17;
        return r0;
    L17:
        wc0 r67 = this.f;
        if (r67 == null) goto L20;
        yg r68 = r67.a.e();
    L21:
        if (r68 == null) goto L36;
        int r73 = Build.VERSION.SDK_INT;
        if (r73 < 28) goto L25;
        int r22 = xg.d(r68.a);
    L26:
        if (r73 < 28) goto L28;
        int r3 = xg.f(r68.a);
    L29:
        if (r73 < 28) goto L31;
        int r4 = xg.e(r68.a);
    L32:
        if (r73 < 28) goto L35;
        r1 = xg.c(r68.a);
    L35:
        return ep.b(r22, r3, r4, r1);
    L31:
        r4 = 0;
        goto L32
    L28:
        r3 = 0;
        goto L29
    L25:
        r22 = 0;
        goto L26
    L36:
        return r0;
    L20:
        r68 = e();
        goto L21
    L38:
        return k();
    L40:
        return g();
    L42:
        return i();
    L61:
        if (r7 == false) goto L64;
        ep r69 = t();
        ep r74 = h();
        return ep.b(Math.max(r69.a, r74.a), 0, Math.max(r69.c, r74.c), Math.max(r69.d, r74.d));
    L64:
        ep r610 = j();
        wc0 r75 = this.f;
        if (r75 == null) goto L67;
        r2 = r75.a.h();
    L67:
        int r76 = r610.d;
        if (r2 == null) goto L71;
        r76 = Math.min(r76, r2.d);
    L71:
        return ep.b(r610.a, 0, r610.c, r76);
    L72:
        if (r7 == false) goto L76;
        return ep.b(0, Math.max(t().b, j().b), 0, 0);
    L76:
        return ep.b(0, j().b, 0, 0);
    }

    public void w(ep r1) {
        this.g = r1;
    }
}
