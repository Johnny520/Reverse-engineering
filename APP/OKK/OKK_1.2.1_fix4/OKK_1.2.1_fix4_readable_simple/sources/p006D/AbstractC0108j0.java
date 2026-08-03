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

    public AbstractC0108j0(C0122q0 r1, WindowInsets r2) {
        super(r1);
        this.f290e = null;
        this.f288c = r2;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    private C1102c m376r(int r4, boolean r5) {
        C1102c r02 = C1102c.f4248e;
        int r1 = 1;
    L4:
        if (r1 > 256) goto L10;
        if ((r4 & r1) == 0) goto L9;
        r02 = C1102c.m2597a(r02, m387s(r1, r5));
    L9:
        r1 = r1 << 1;
        goto L4
    L10:
        return r02;
    }

    /* JADX INFO: renamed from: t */
    private C1102c m377t() {
        C0122q0 r02 = this.f291f;
        if (r02 == null) goto L7;
        return r02.f309a.mo391h();
    L7:
        return C1102c.f4248e;
    }

    /* JADX INFO: renamed from: u */
    private C1102c m378u(View r5) {
        if (Build.VERSION.SDK_INT >= 30) goto L25;
        if (f283h == true) goto L7;
        m379v();
    L7:
        Method r02 = f284i;
        if (r02 != null) goto L10;
    L23:
        return null;
    L10:
        if (f285j == null) goto L23;
        if (f286k == null) goto L23;
        Object r52 = r02.invoke(r5, null);     // Catch: ReflectiveOperationException -> L21
        if (r52 != null) goto L17;
        return null;
    L17:
        Object r53 = f287l.get(r52);     // Catch: ReflectiveOperationException -> L21
        Rect r54 = (Rect) f286k.get(r53);     // Catch: ReflectiveOperationException -> L21
        if (r54 == null) goto L28;
        return C1102c.m2598b(r54.left, r54.top, r54.right, r54.bottom);
    L28:
        return null;
    L21:
        e = move-exception;
        e.getMessage();
        goto L23
    L25:
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: v */
    private static void m379v() {
        f284i = View.class.getDeclaredMethod("getViewRootImpl", null);     // Catch: ReflectiveOperationException -> L5
        Class<?> r1 = Class.forName("android.view.View$AttachInfo");     // Catch: ReflectiveOperationException -> L5
        f285j = r1;     // Catch: ReflectiveOperationException -> L5
        f286k = r1.getDeclaredField("mVisibleInsets");     // Catch: ReflectiveOperationException -> L5
        f287l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");     // Catch: ReflectiveOperationException -> L5
        f286k.setAccessible(true);     // Catch: ReflectiveOperationException -> L5
        f287l.setAccessible(true);     // Catch: ReflectiveOperationException -> L5
    L7:
        f283h = true;
        return;
    L5:
        e = move-exception;
        e.getMessage();
        goto L7
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: d */
    public void mo380d(View r1) {
        C1102c r12 = m378u(r1);
        if (r12 != null) goto L5;
        r12 = C1102c.f4248e;
    L5:
        m388w(r12);
    }

    @Override // p006D.C0118o0
    public boolean equals(Object r2) {
        if (super.equals(r2) == true) goto L7;
        return false;
    L7:
        return Objects.equals(this.f292g, ((AbstractC0108j0) r2).f292g);
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: f */
    public C1102c mo381f(int r2) {
        return m376r(r2, false);
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: j */
    public final C1102c mo382j() {
        if (this.f290e != null) goto L6;
        WindowInsets r02 = this.f288c;
        this.f290e = C1102c.m2598b(r02.getSystemWindowInsetLeft(), r02.getSystemWindowInsetTop(), r02.getSystemWindowInsetRight(), r02.getSystemWindowInsetBottom());
    L6:
        return this.f290e;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: l */
    public C0122q0 mo383l(int r4, int r5, int r6, int r7) {
        C0122q0 r02 = C0122q0.m429d(null, this.f288c);
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 30) goto L6;
        AbstractC0106i0 r12 = new C0104h0(r02);
    L9:
        r12.mo364g(C0122q0.m428b(mo382j(), r4, r5, r6, r7));
        r12.mo363e(C0122q0.m428b(mo391h(), r4, r5, r6, r7));
        return r12.mo362b();
    L6:
        if (r1 < 29) goto L8;
        r12 = new C0102g0(r02);
        goto L9
    L8:
        r12 = new C0100f0(r02);
        goto L9
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: n */
    public boolean mo384n() {
        return this.f288c.isRound();
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: o */
    public void mo385o(C1102c[] r1) {
        this.f289d = r1;
    }

    @Override // p006D.C0118o0
    /* JADX INFO: renamed from: p */
    public void mo386p(C0122q0 r1) {
        this.f291f = r1;
    }

    /* JADX INFO: renamed from: s */
    public C1102c m387s(int r6, boolean r7) {
        int r1 = 0;
        if (r6 == 1) goto L72;
        C1102c r2 = null;
        if (r6 == 2) goto L61;
        C1102c r02 = C1102c.f4248e;
        if (r6 != 8) goto L9;
        C1102c[] r62 = this.f289d;
        if (r62 == null) goto L46;
        r2 = r62[3];
    L46:
        if (r2 == null) goto L48;
        return r2;
    L48:
        C1102c r63 = mo382j();
        C1102c r72 = m377t();
        int r64 = r63.f4252d;
        if (r64 > r72.f4252d) goto L51;
        C1102c r65 = this.f292g;
        if (r65 != null) goto L55;
    L60:
        return r02;
    L55:
        if (r65.equals(r02) == true) goto L60;
        int r66 = this.f292g.f4252d;
        if (r66 <= r72.f4252d) goto L60;
        return C1102c.m2598b(0, 0, 0, r66);
    L51:
        return C1102c.m2598b(0, 0, 0, r64);
    L9:
        if (r6 == 16) goto L42;
        if (r6 == 32) goto L40;
        if (r6 == 64) goto L38;
        if (r6 == 128) goto L17;
        return r02;
    L17:
        C0122q0 r67 = this.f291f;
        if (r67 == null) goto L20;
        C0109k r68 = r67.f309a.mo408e();
    L21:
        if (r68 == null) goto L36;
        int r73 = Build.VERSION.SDK_INT;
        if (r73 < 28) goto L25;
        int r22 = AbstractC0107j.m373d(r68.f293a);
    L26:
        if (r73 < 28) goto L28;
        int r3 = AbstractC0107j.m375f(r68.f293a);
    L29:
        if (r73 < 28) goto L31;
        int r4 = AbstractC0107j.m374e(r68.f293a);
    L32:
        if (r73 < 28) goto L35;
        r1 = AbstractC0107j.m372c(r68.f293a);
    L35:
        return C1102c.m2598b(r22, r3, r4, r1);
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
        return r02;
    L20:
        r68 = mo408e();
        goto L21
    L38:
        return mo420k();
    L40:
        return mo418g();
    L42:
        return mo419i();
    L61:
        if (r7 == false) goto L64;
        C1102c r69 = m377t();
        C1102c r74 = mo391h();
        return C1102c.m2598b(Math.max(r69.f4249a, r74.f4249a), 0, Math.max(r69.f4251c, r74.f4251c), Math.max(r69.f4252d, r74.f4252d));
    L64:
        C1102c r610 = mo382j();
        C0122q0 r75 = this.f291f;
        if (r75 == null) goto L67;
        r2 = r75.f309a.mo391h();
    L67:
        int r76 = r610.f4252d;
        if (r2 == null) goto L71;
        r76 = Math.min(r76, r2.f4252d);
    L71:
        return C1102c.m2598b(r610.f4249a, 0, r610.f4251c, r76);
    L72:
        if (r7 == false) goto L76;
        return C1102c.m2598b(0, Math.max(m377t().f4250b, mo382j().f4250b), 0, 0);
    L76:
        return C1102c.m2598b(0, mo382j().f4250b, 0, 0);
    }

    /* JADX INFO: renamed from: w */
    public void m388w(C1102c r1) {
        this.f292g = r1;
    }
}
