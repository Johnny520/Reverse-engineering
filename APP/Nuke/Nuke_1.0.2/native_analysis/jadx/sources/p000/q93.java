package p000;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q93 extends i93 {

    /* JADX INFO: renamed from: b */
    public final ar0 f8838b;

    /* JADX INFO: renamed from: c */
    public String f8839c;

    /* JADX INFO: renamed from: d */
    public boolean f8840d;

    /* JADX INFO: renamed from: e */
    public final jc0 f8841e;

    /* JADX INFO: renamed from: f */
    public xm0 f8842f;

    /* JADX INFO: renamed from: g */
    public final nx1 f8843g;

    /* JADX INFO: renamed from: h */
    public C0095cl f8844h;

    /* JADX INFO: renamed from: i */
    public final nx1 f8845i;

    /* JADX INFO: renamed from: j */
    public long f8846j;

    /* JADX INFO: renamed from: k */
    public float f8847k;

    /* JADX INFO: renamed from: l */
    public float f8848l;

    /* JADX INFO: renamed from: m */
    public final p93 f8849m;

    public q93(ar0 ar0Var) {
        this.f8838b = ar0Var;
        ar0Var.f348i = new p93(this, 0);
        this.f8839c = "";
        this.f8840d = true;
        this.f8841e = new jc0();
        this.f8842f = C0367jy.f5271w;
        this.f8843g = op0.m3598u(null);
        this.f8845i = op0.m3598u(new gr2(0L));
        this.f8846j = 9205357640488583168L;
        this.f8847k = 1.0f;
        this.f8848l = 1.0f;
        this.f8849m = new p93(this, 1);
    }

    @Override // p000.i93
    /* JADX INFO: renamed from: a */
    public final void mo260a(nc0 nc0Var) {
        m4103e(nc0Var, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4103e(nc0 nc0Var, float f, C0095cl c0095cl) {
        int i;
        C0095cl c0095cl2;
        char c;
        long j;
        C0095cl c0095cl3;
        int i2;
        int i3;
        ar0 ar0Var = this.f8838b;
        boolean z = ar0Var.f343d;
        nx1 nx1Var = this.f8843g;
        if (!z || ar0Var.f344e == 16) {
            i = 0;
        } else {
            C0095cl c0095cl4 = (C0095cl) nx1Var.getValue();
            int i4 = s93.f9998a;
            if (!(c0095cl4 instanceof C0095cl) ? c0095cl4 == null : !((i3 = c0095cl4.f1608c) != 5 && i3 != 3)) {
                if (!(c0095cl instanceof C0095cl) ? c0095cl == null : !((i2 = c0095cl.f1608c) != 5 && i2 != 3)) {
                    i = 1;
                }
            }
        }
        boolean z2 = this.f8840d;
        jc0 jc0Var = this.f8841e;
        if (z2 || !gr2.m2019a(this.f8846j, nc0Var.mo3280d())) {
            if (i == 1) {
                long jM2565b = ar0Var.f344e;
                int i5 = s93.f9998a;
                if (C0363ju.m2567d(jM2565b) != 1.0f) {
                    jM2565b = C0363ju.m2565b(1.0f, jM2565b);
                }
                c0095cl2 = new C0095cl(jM2565b, 5);
            } else {
                c0095cl2 = null;
            }
            this.f8844h = c0095cl2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32));
            nx1 nx1Var2 = this.f8845i;
            this.f8847k = fIntBitsToFloat / Float.intBitsToFloat((int) (((gr2) nx1Var2.getValue()).f3684a >> 32));
            this.f8848l = Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L)) / Float.intBitsToFloat((int) (((gr2) nx1Var2.getValue()).f3684a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (nc0Var.mo3280d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (nc0Var.mo3280d() & 4294967295L))))) & 4294967295L);
            d61 layoutDirection = nc0Var.getLayoutDirection();
            C0122d9 c0122d9M3766b = jc0Var.f4957a;
            C0192f6 c0192f6M4520F = jc0Var.f4958b;
            if (c0122d9M3766b == null || c0192f6M4520F == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = c0122d9M3766b.f1913a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || jc0Var.f4960d != i) {
                }
                jc0Var.f4959c = jCeil;
                C0702sp c0702sp = jc0Var.f4961e;
                long jM4715q0 = s11.m4715q0(jCeil);
                C0664rp c0664rp = c0702sp.f10256h;
                e70 e70Var = c0664rp.f9665a;
                d61 d61Var = c0664rp.f9666b;
                InterfaceC0627qp interfaceC0627qp = c0664rp.f9667c;
                C0192f6 c0192f6 = c0192f6M4520F;
                long j2 = c0664rp.f9668d;
                c0664rp.f9665a = nc0Var;
                c0664rp.f9666b = layoutDirection;
                c0664rp.f9667c = c0192f6;
                c0664rp.f9668d = jM4715q0;
                c0192f6.mo1522l();
                nc0.m3270i0(c0702sp, C0363ju.f5212b, 0L, 0L, 62);
                this.f8849m.mo5j(c0702sp);
                c0192f6.mo1520i();
                C0664rp c0664rp2 = c0702sp.f10256h;
                c0664rp2.f9665a = e70Var;
                c0664rp2.f9666b = d61Var;
                c0664rp2.f9667c = interfaceC0627qp;
                c0664rp2.f9668d = j2;
                c0122d9M3766b.f1913a.prepareToDraw();
                this.f8840d = false;
                this.f8846j = nc0Var.mo3280d();
            }
            c0122d9M3766b = AbstractC0570p7.m3766b((int) (jCeil >> c), (int) (jCeil & j), i);
            c0192f6M4520F = rp0.m4520F(c0122d9M3766b);
            jc0Var.f4957a = c0122d9M3766b;
            jc0Var.f4958b = c0192f6M4520F;
            jc0Var.f4960d = i;
            jc0Var.f4959c = jCeil;
            C0702sp c0702sp2 = jc0Var.f4961e;
            long jM4715q02 = s11.m4715q0(jCeil);
            C0664rp c0664rp3 = c0702sp2.f10256h;
            e70 e70Var2 = c0664rp3.f9665a;
            d61 d61Var2 = c0664rp3.f9666b;
            InterfaceC0627qp interfaceC0627qp2 = c0664rp3.f9667c;
            C0192f6 c0192f62 = c0192f6M4520F;
            long j22 = c0664rp3.f9668d;
            c0664rp3.f9665a = nc0Var;
            c0664rp3.f9666b = layoutDirection;
            c0664rp3.f9667c = c0192f62;
            c0664rp3.f9668d = jM4715q02;
            c0192f62.mo1522l();
            nc0.m3270i0(c0702sp2, C0363ju.f5212b, 0L, 0L, 62);
            this.f8849m.mo5j(c0702sp2);
            c0192f62.mo1520i();
            C0664rp c0664rp22 = c0702sp2.f10256h;
            c0664rp22.f9665a = e70Var2;
            c0664rp22.f9666b = d61Var2;
            c0664rp22.f9667c = interfaceC0627qp2;
            c0664rp22.f9668d = j22;
            c0122d9M3766b.f1913a.prepareToDraw();
            this.f8840d = false;
            this.f8846j = nc0Var.mo3280d();
        } else {
            C0122d9 c0122d9 = jc0Var.f4957a;
            if (i != (c0122d9 != null ? c0122d9.m971a() : 0)) {
            }
        }
        if (c0095cl != null) {
            c0095cl3 = c0095cl;
        } else {
            c0095cl3 = ((C0095cl) nx1Var.getValue()) != null ? (C0095cl) nx1Var.getValue() : this.f8844h;
        }
        C0122d9 c0122d92 = jc0Var.f4957a;
        if (c0122d92 == null) {
            kz0.m2764b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        nc0.m3269V(nc0Var, c0122d92, jc0Var.f4959c, 0L, f, c0095cl3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f8839c);
        sb.append("\n\tviewportWidth: ");
        nx1 nx1Var = this.f8845i;
        sb.append(Float.intBitsToFloat((int) (((gr2) nx1Var.getValue()).f3684a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((gr2) nx1Var.getValue()).f3684a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
