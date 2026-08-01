package p000;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0461m6 extends TextPaint {

    /* JADX INFO: renamed from: a */
    public C0877w5 f3810a;

    /* JADX INFO: renamed from: b */
    public u61 f3811b;

    /* JADX INFO: renamed from: c */
    public int f3812c;

    /* JADX INFO: renamed from: d */
    public v01 f3813d;

    /* JADX INFO: renamed from: e */
    public C0207ff f3814e;

    /* JADX INFO: renamed from: f */
    public pf1 f3815f;

    /* JADX INFO: renamed from: g */
    public C0135dn f3816g;

    /* JADX INFO: renamed from: h */
    public q11 f3817h;

    /* JADX INFO: renamed from: i */
    public o30 f3818i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0877w5 m2430a() {
        C0877w5 c0877w5 = this.f3810a;
        if (c0877w5 != null) {
            return c0877w5;
        }
        C0877w5 c0877w52 = new C0877w5(this);
        this.f3810a = c0877w52;
        return c0877w52;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2431b(int i) {
        if (i == this.f3812c) {
            return;
        }
        m2430a().m4870d(i);
        this.f3812c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2432c(pf1 pf1Var, long j, float f) {
        if (pf1Var == null) {
            this.f3816g = null;
            this.f3815f = null;
            this.f3817h = null;
            setShader(null);
            return;
        }
        if (pf1Var instanceof g31) {
            m2433d(g60.m1219r(f, ((g31) pf1Var).f1852l));
            return;
        }
        if (!(pf1Var instanceof AbstractC0646qb)) {
            C0921xc.m5129j();
            return;
        }
        if (p30.m3002l(this.f3815f, pf1Var)) {
            q11 q11Var = this.f3817h;
            if (!(q11Var == null ? false : q11.m3185a(q11Var.f5022a, j))) {
            }
        } else if (j != 9205357640488583168L) {
            this.f3815f = pf1Var;
            this.f3817h = new q11(j);
            this.f3816g = r60.m3411m(new C0381k6(pf1Var, j));
        }
        C0877w5 c0877w5M2430a = m2430a();
        C0135dn c0135dn = this.f3816g;
        c0877w5M2430a.m4873g(c0135dn != null ? (Shader) c0135dn.getValue() : null);
        this.f3814e = null;
        rd0.m3460S(this, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2433d(long j) {
        C0207ff c0207ff = this.f3814e;
        if ((c0207ff == null ? false : C0207ff.m1094c(c0207ff.f1709a, j)) || j == 16) {
            return;
        }
        this.f3814e = new C0207ff(j);
        setColor(p30.m2987W(j));
        this.f3816g = null;
        this.f3815f = null;
        this.f3817h = null;
        setShader(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m2434e(o30 o30Var) {
        if (o30Var == null || p30.m3002l(this.f3818i, o30Var)) {
            return;
        }
        this.f3818i = o30Var;
        if (o30Var.equals(C0664qt.f5220Q)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(o30Var instanceof s41)) {
            C0921xc.m5129j();
            return;
        }
        m2430a().m4876j(1);
        C0877w5 c0877w5M2430a = m2430a();
        s41 s41Var = (s41) o30Var;
        c0877w5M2430a.f7002a.setStrokeWidth(s41Var.f5636Q);
        C0877w5 c0877w5M2430a2 = m2430a();
        c0877w5M2430a2.f7002a.setStrokeMiter(s41Var.f5637R);
        m2430a().m4875i(s41Var.f5639T);
        m2430a().m4874h(s41Var.f5638S);
        m2430a().f7002a.setPathEffect(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2435f(v01 v01Var) {
        if (v01Var == null || p30.m3002l(this.f3813d, v01Var)) {
            return;
        }
        this.f3813d = v01Var;
        if (v01Var.equals(v01.f6368d)) {
            clearShadowLayer();
            return;
        }
        v01 v01Var2 = this.f3813d;
        float f = v01Var2.f6371c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (v01Var2.f6370b >> 32)), Float.intBitsToFloat((int) (this.f3813d.f6370b & 4294967295L)), p30.m2987W(this.f3813d.f6369a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m2436g(u61 u61Var) {
        if (u61Var == null || p30.m3002l(this.f3811b, u61Var)) {
            return;
        }
        this.f3811b = u61Var;
        int i = u61Var.f6145a;
        setUnderlineText((i | 1) == i);
        int i2 = this.f3811b.f6145a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
