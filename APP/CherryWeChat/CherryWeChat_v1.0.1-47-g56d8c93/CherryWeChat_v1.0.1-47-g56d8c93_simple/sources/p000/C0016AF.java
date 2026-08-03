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

    public C0016AF(C0489LF r1, WindowInsets r2) {
        super(r1);
        this.f28e = null;
        this.f26c = r2;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: u */
    private C2765yl m7u(int r4, boolean r5) {
        C2765yl r0 = C2765yl.f9404e;
        int r1 = 1;
    L4:
        if (r1 > 512) goto L10;
        if ((r4 & r1) == 0) goto L9;
        r0 = C2765yl.m5336a(r0, m22v(r1, r5));
    L9:
        r1 = r1 << 1;
        goto L4
    L10:
        return r0;
    }

    /* JADX INFO: renamed from: w */
    private C2765yl m8w() {
        C0489LF r0 = this.f29f;
        if (r0 == null) goto L7;
        return r0.f1602a.mo93i();
    L7:
        return C2765yl.f9404e;
    }

    /* JADX INFO: renamed from: x */
    private C2765yl m9x(View r5) {
        if (Build.VERSION.SDK_INT >= 30) goto L25;
        if (f21i == true) goto L7;
        m10y();
    L7:
        Method r0 = f22j;
        if (r0 != null) goto L10;
    L23:
        return null;
    L10:
        if (f23k == null) goto L23;
        if (f24l == null) goto L23;
        Object r52 = r0.invoke(r5, null);     // Catch: ReflectiveOperationException -> L21
        if (r52 == null) goto L23;
        Object r53 = f25m.get(r52);     // Catch: ReflectiveOperationException -> L21
        Rect r54 = (Rect) f24l.get(r53);     // Catch: ReflectiveOperationException -> L21
        if (r54 == null) goto L23;
        return C2765yl.m5337b(r54.left, r54.top, r54.right, r54.bottom);
    L21:
        e = move-exception;
        e.getMessage();
        goto L23
    L25:
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: y */
    private static void m10y() {
        f22j = View.class.getDeclaredMethod("getViewRootImpl", null);     // Catch: ReflectiveOperationException -> L5
        Class<?> r1 = Class.forName("android.view.View$AttachInfo");     // Catch: ReflectiveOperationException -> L5
        f23k = r1;     // Catch: ReflectiveOperationException -> L5
        f24l = r1.getDeclaredField("mVisibleInsets");     // Catch: ReflectiveOperationException -> L5
        f25m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");     // Catch: ReflectiveOperationException -> L5
        f24l.setAccessible(true);     // Catch: ReflectiveOperationException -> L5
        f25m.setAccessible(true);     // Catch: ReflectiveOperationException -> L5
    L7:
        f21i = true;
        return;
    L5:
        e = move-exception;
        e.getMessage();
        goto L7
    }

    /* JADX INFO: renamed from: z */
    public static boolean m11z(int r0, int r1) {
        if ((r0 & 6) != (r1 & 6)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: d */
    public void mo12d(View r1) {
        C2765yl r12 = m9x(r1);
        if (r12 != null) goto L5;
        r12 = C2765yl.f9404e;
    L5:
        mo19q(r12);
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: e */
    public void mo13e(C0489LF r3) {
        C0489LF r0 = this.f29f;
        r3.f1602a.mo20r(r0);
        C2765yl r02 = this.f30g;
        C0317HF r32 = r3.f1602a;
        r32.mo19q(r02);
        r32.mo21t(this.f31h);
    }

    @Override // p000.C0317HF
    public boolean equals(Object r4) {
        if (super.equals(r4) == true) goto L5;
        return false;
    L5:
        C0016AF r42 = (C0016AF) r4;
        if (Objects.equals(this.f30g, r42.f30g) == true) goto L8;
    L11:
        return false;
    L8:
        if (m11z(this.f31h, r42.f31h) == false) goto L11;
        return true;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: g */
    public C2765yl mo14g(int r2) {
        return m7u(r2, false);
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: k */
    public final C2765yl mo15k() {
        if (this.f28e != null) goto L6;
        WindowInsets r0 = this.f26c;
        this.f28e = C2765yl.m5337b(r0.getSystemWindowInsetLeft(), r0.getSystemWindowInsetTop(), r0.getSystemWindowInsetRight(), r0.getSystemWindowInsetBottom());
    L6:
        return this.f28e;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: m */
    public C0489LF mo16m(int r4, int r5, int r6, int r7) {
        C0489LF r0 = C0489LF.m939h(null, this.f26c);
        int r1 = Build.VERSION.SDK_INT;
        if (r1 < 34) goto L6;
        AbstractC2796zF r12 = new C2753yF(r0);
    L15:
        r12.mo5086g(C0489LF.m938e(mo15k(), r4, r5, r6, r7));
        r12.mo5085e(C0489LF.m938e(mo93i(), r4, r5, r6, r7));
        return r12.mo5084b();
    L6:
        if (r1 < 31) goto L9;
        r12 = new C2710xF(r0);
        goto L15
    L9:
        if (r1 < 30) goto L12;
        r12 = new C2667wF(r0);
        goto L15
    L12:
        if (r1 < 29) goto L14;
        r12 = new C2624vF(r0);
        goto L15
    L14:
        r12 = new C2581uF(r0);
        goto L15
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: o */
    public boolean mo17o() {
        return this.f26c.isRound();
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: p */
    public void mo18p(C2765yl[] r1) {
        this.f27d = r1;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: q */
    public void mo19q(C2765yl r1) {
        this.f30g = r1;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: r */
    public void mo20r(C0489LF r1) {
        this.f29f = r1;
    }

    @Override // p000.C0317HF
    /* JADX INFO: renamed from: t */
    public void mo21t(int r1) {
        this.f31h = r1;
    }

    /* JADX INFO: renamed from: v */
    public C2765yl m22v(int r5, boolean r6) {
        C2765yl r1 = C2765yl.f9404e;
        if (r5 == 1) goto L63;
        C2765yl r0 = null;
        if (r5 != 2) goto L7;
        if (r6 == false) goto L53;
        C2765yl r52 = m8w();
        C2765yl r62 = mo93i();
        return C2765yl.m5337b(Math.max(r52.f9405a, r62.f9405a), 0, Math.max(r52.f9407c, r62.f9407c), Math.max(r52.f9408d, r62.f9408d));
    L53:
        if ((this.f31h & 2) == 0) goto L55;
        return r1;
    L55:
        C2765yl r53 = mo15k();
        C0489LF r63 = this.f29f;
        if (r63 == null) goto L58;
        r0 = r63.f1602a.mo93i();
    L58:
        int r64 = r53.f9408d;
        if (r0 == null) goto L62;
        r64 = Math.min(r64, r0.f9408d);
    L62:
        return C2765yl.m5337b(r53.f9405a, 0, r53.f9407c, r64);
    L7:
        if (r5 != 8) goto L9;
        C2765yl[] r54 = this.f27d;
        if (r54 == null) goto L34;
        r0 = r54[AbstractC0714Qj.m1501w(8)];
    L34:
        if (r0 == null) goto L36;
        return r0;
    L36:
        C2765yl r55 = mo15k();
        C2765yl r65 = m8w();
        int r56 = r55.f9408d;
        if (r56 > r65.f9408d) goto L39;
        C2765yl r57 = this.f30g;
        if (r57 != null) goto L43;
    L48:
        return r1;
    L43:
        if (r57.equals(r1) == true) goto L48;
        int r58 = this.f30g.f9408d;
        if (r58 <= r65.f9408d) goto L48;
        return C2765yl.m5337b(0, 0, 0, r58);
    L39:
        return C2765yl.m5337b(0, 0, 0, r56);
    L9:
        if (r5 == 16) goto L30;
        if (r5 == 32) goto L28;
        if (r5 == 64) goto L26;
        if (r5 == 128) goto L17;
        return r1;
    L17:
        C0489LF r59 = this.f29f;
        if (r59 == null) goto L20;
        C1543ie r510 = r59.f1602a.mo150f();
    L21:
        if (r510 == null) goto L24;
        DisplayCutout r511 = r510.f5442a;
        return C2765yl.m5337b(r511.getSafeInsetLeft(), r511.getSafeInsetTop(), r511.getSafeInsetRight(), r511.getSafeInsetBottom());
    L24:
        return r1;
    L20:
        r510 = mo150f();
        goto L21
    L26:
        return mo262l();
    L28:
        return mo260h();
    L30:
        return mo261j();
    L63:
        if (r6 == false) goto L67;
        return C2765yl.m5337b(0, Math.max(m8w().f9406b, mo15k().f9406b), 0, 0);
    L67:
        if ((this.f31h & 4) == 0) goto L70;
        return r1;
    L70:
        return C2765yl.m5337b(0, mo15k().f9406b, 0, 0);
    }

    public C0016AF(C0489LF r2, C0016AF r3) {
        this(r2, new WindowInsets(r3.f26c));
    }
}
