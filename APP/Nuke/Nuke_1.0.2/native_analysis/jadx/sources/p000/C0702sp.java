package p000;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: renamed from: sp */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0702sp implements nc0 {

    /* JADX INFO: renamed from: h */
    public final C0664rp f10256h;

    /* JADX INFO: renamed from: i */
    public final C0043b5 f10257i;

    /* JADX INFO: renamed from: j */
    public C0611q9 f10258j;

    /* JADX INFO: renamed from: k */
    public C0611q9 f10259k;

    public C0702sp() {
        h70 h70Var = pp0.f8434c;
        C0664rp c0664rp = new C0664rp();
        c0664rp.f9665a = h70Var;
        c0664rp.f9666b = d61.f1885h;
        c0664rp.f9667c = yd0.f13421a;
        c0664rp.f9668d = 0L;
        this.f10256h = c0664rp;
        this.f10257i = new C0043b5(this);
    }

    /* JADX INFO: renamed from: a */
    public static C0611q9 m4901a(C0702sp c0702sp, long j, op0 op0Var, int i) {
        C0611q9 c0611q9M4904f = c0702sp.m4904f(op0Var);
        Paint paint = (Paint) c0611q9M4904f.f8830c;
        if (!C0363ju.m2566c(sp0.m4930b(paint.getColor()), j)) {
            c0611q9M4904f.m4095k(j);
        }
        if (((Shader) c0611q9M4904f.f8831d) != null) {
            c0611q9M4904f.m4098n(null);
        }
        if (!t11.m5086l((C0095cl) c0611q9M4904f.f8832e, null)) {
            c0611q9M4904f.m4096l(null);
        }
        if (c0611q9M4904f.f8829b != i) {
            c0611q9M4904f.m4094j(i);
        }
        if (paint.isFilterBitmap()) {
            return c0611q9M4904f;
        }
        c0611q9M4904f.m4097m(1);
        return c0611q9M4904f;
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: E */
    public final C0043b5 mo3274E() {
        return this.f10257i;
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: G */
    public final void mo3275G(C0915y9 c0915y9, AbstractC0024an abstractC0024an, float f, op0 op0Var, int i) {
        this.f10256h.f9667c.mo1519h(c0915y9, m4902c(abstractC0024an, op0Var, f, null, i, 1));
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: R */
    public final void mo3276R(C0122d9 c0122d9, long j, long j2, long j3, float f, C0095cl c0095cl, int i) {
        this.f10256h.f9667c.mo1516e(c0122d9, j, j2, j3, m4902c(null, xi0.f13041h, f, c0095cl, 3, i));
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: Y */
    public final void mo3277Y(long j, long j2, long j3, float f, int i) {
        InterfaceC0627qp interfaceC0627qp = this.f10256h.f9667c;
        C0611q9 c0611q9M3911i = this.f10259k;
        if (c0611q9M3911i == null) {
            c0611q9M3911i = pp0.m3911i();
            c0611q9M3911i.m4102r(1);
            this.f10259k = c0611q9M3911i;
        }
        Paint paint = (Paint) c0611q9M3911i.f8830c;
        if (!C0363ju.m2566c(sp0.m4930b(paint.getColor()), j)) {
            c0611q9M3911i.m4095k(j);
        }
        if (((Shader) c0611q9M3911i.f8831d) != null) {
            c0611q9M3911i.m4098n(null);
        }
        if (!t11.m5086l((C0095cl) c0611q9M3911i.f8832e, null)) {
            c0611q9M3911i.m4096l(null);
        }
        if (c0611q9M3911i.f8829b != 3) {
            c0611q9M3911i.m4094j(3);
        }
        if (paint.getStrokeWidth() != f) {
            c0611q9M3911i.m4101q(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c0611q9M3911i.m4090f() != i) {
            c0611q9M3911i.m4099o(i);
        }
        if (c0611q9M3911i.m4091g() != 0) {
            c0611q9M3911i.m4100p(0);
        }
        if (!paint.isFilterBitmap()) {
            c0611q9M3911i.m4097m(1);
        }
        interfaceC0627qp.mo1523m(j2, j3, c0611q9M3911i);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f10256h.f9665a.mo693b();
    }

    /* JADX INFO: renamed from: c */
    public final C0611q9 m4902c(AbstractC0024an abstractC0024an, op0 op0Var, float f, C0095cl c0095cl, int i, int i2) {
        C0611q9 c0611q9M4904f = m4904f(op0Var);
        Paint paint = (Paint) c0611q9M4904f.f8830c;
        if (abstractC0024an != null) {
            abstractC0024an.mo234a(f, mo3280d(), c0611q9M4904f);
        } else {
            if (((Shader) c0611q9M4904f.f8831d) != null) {
                c0611q9M4904f.m4098n(null);
            }
            long jM4930b = sp0.m4930b(paint.getColor());
            long j = C0363ju.f5212b;
            if (!C0363ju.m2566c(jM4930b, j)) {
                c0611q9M4904f.m4095k(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c0611q9M4904f.m4093i(f);
            }
        }
        if (!t11.m5086l((C0095cl) c0611q9M4904f.f8832e, c0095cl)) {
            c0611q9M4904f.m4096l(c0095cl);
        }
        if (c0611q9M4904f.f8829b != i) {
            c0611q9M4904f.m4094j(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c0611q9M4904f;
        }
        c0611q9M4904f.m4097m(i2);
        return c0611q9M4904f;
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: c0 */
    public final void mo3279c0(long j, long j2, long j3, op0 op0Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f10256h.f9667c.mo1526p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), m4901a(this, j, op0Var, i));
    }

    /* JADX INFO: renamed from: e */
    public final void m4903e(C0122d9 c0122d9, C0095cl c0095cl) {
        this.f10256h.f9667c.mo1512a(c0122d9, m4902c(null, xi0.f13041h, 1.0f, c0095cl, 3, 1));
    }

    /* JADX INFO: renamed from: f */
    public final C0611q9 m4904f(op0 op0Var) {
        if (t11.m5086l(op0Var, xi0.f13041h)) {
            C0611q9 c0611q9 = this.f10258j;
            if (c0611q9 != null) {
                return c0611q9;
            }
            C0611q9 c0611q9M3911i = pp0.m3911i();
            c0611q9M3911i.m4102r(0);
            this.f10258j = c0611q9M3911i;
            return c0611q9M3911i;
        }
        if (!(op0Var instanceof xv2)) {
            c80.m675s();
            return null;
        }
        C0611q9 c0611q9M3911i2 = this.f10259k;
        if (c0611q9M3911i2 == null) {
            c0611q9M3911i2 = pp0.m3911i();
            c0611q9M3911i2.m4102r(1);
            this.f10259k = c0611q9M3911i2;
        }
        Paint paint = (Paint) c0611q9M3911i2.f8830c;
        float strokeWidth = paint.getStrokeWidth();
        xv2 xv2Var = (xv2) op0Var;
        float f = xv2Var.f13195h;
        if (strokeWidth != f) {
            c0611q9M3911i2.m4101q(f);
        }
        int iM4090f = c0611q9M3911i2.m4090f();
        int i = xv2Var.f13197j;
        if (iM4090f != i) {
            c0611q9M3911i2.m4099o(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = xv2Var.f13196i;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iM4091g = c0611q9M3911i2.m4091g();
        int i2 = xv2Var.f13198k;
        if (iM4091g == i2) {
            return c0611q9M3911i2;
        }
        c0611q9M3911i2.m4100p(i2);
        return c0611q9M3911i2;
    }

    @Override // p000.nc0
    public final d61 getLayoutDirection() {
        return this.f10256h.f9666b;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f10256h.f9665a.mo697m();
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: o */
    public final void mo3281o(long j, float f, long j2, op0 op0Var) {
        this.f10256h.f9667c.mo1515d(f, j2, m4901a(this, j, op0Var, 3));
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: t */
    public final void mo3282t(C0915y9 c0915y9, long j, op0 op0Var) {
        this.f10256h.f9667c.mo1519h(c0915y9, m4901a(this, j, op0Var, 3));
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: z */
    public final void mo3283z(AbstractC0024an abstractC0024an, long j, long j2, long j3, float f, op0 op0Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.f10256h.f9667c.mo1521j(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), m4902c(abstractC0024an, op0Var, f, null, 3, 1));
    }

    @Override // p000.nc0
    /* JADX INFO: renamed from: z0 */
    public final void mo3284z0(long j, float f, float f2, long j2, long j3, op0 op0Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f10256h.f9667c.mo1530t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, m4901a(this, j, op0Var, 3));
    }
}
