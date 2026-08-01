package p000;

import android.graphics.Paint;

/* JADX INFO: renamed from: dd */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0125dd implements InterfaceC0812uq {

    /* JADX INFO: renamed from: d */
    public final C0087cd f1052d;

    /* JADX INFO: renamed from: e */
    public final C0541o8 f1053e;

    /* JADX INFO: renamed from: f */
    public C0877w5 f1054f;

    /* JADX INFO: renamed from: g */
    public C0877w5 f1055g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0125dd() {
        C1009zm c1009zm = p30.f4737d;
        C0087cd c0087cd = new C0087cd();
        c0087cd.f787a = c1009zm;
        c0087cd.f788b = k50.f3015d;
        c0087cd.f789c = C0183es.f1523a;
        c0087cd.f790d = 0L;
        this.f1052d = c0087cd;
        C0541o8 c0541o8 = new C0541o8();
        c0541o8.f4482c = this;
        c0541o8.f4480a = new C0910x1(2, c0541o8);
        this.f1053e = c0541o8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0877w5 m681a(C0125dd c0125dd, long j, o30 o30Var, int i) {
        C0877w5 c0877w5M683e = c0125dd.m683e(o30Var);
        Paint paint = c0877w5M683e.f7002a;
        if (!C0207ff.m1094c(p30.m2992b(paint.getColor()), j)) {
            c0877w5M683e.m4871e(j);
        }
        if (c0877w5M683e.f7004c != null) {
            c0877w5M683e.m4873g(null);
        }
        if (!p30.m3002l(c0877w5M683e.f7005d, null)) {
            c0877w5M683e.m4872f(null);
        }
        if (c0877w5M683e.f7003b != i) {
            c0877w5M683e.m4870d(i);
        }
        if (paint.isFilterBitmap()) {
            return c0877w5M683e;
        }
        paint.setFilterBitmap(true);
        return c0877w5M683e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: C */
    public final void mo639C(long j, long j2, long j3, o30 o30Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f1052d.f789c.mo247m(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), m681a(this, j, o30Var, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: D */
    public final void mo640D(C0752t5 c0752t5, long j, long j2, long j3, float f, C0348ja c0348ja, int i) {
        this.f1052d.f789c.mo237c(c0752t5, j, j2, j3, m682d(null, C0664qt.f5220Q, f, c0348ja, 3, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: J */
    public final void mo642J(C0118d6 c0118d6, pf1 pf1Var, float f, o30 o30Var, int i) {
        this.f1052d.f789c.mo240f(c0118d6, m682d(pf1Var, o30Var, f, null, i, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: T */
    public final void mo646T(long j, long j2, long j3, float f) {
        InterfaceC0051bd interfaceC0051bd = this.f1052d.f789c;
        C0877w5 c0877w5M2767g = this.f1055g;
        if (c0877w5M2767g == null) {
            c0877w5M2767g = o30.m2767g();
            c0877w5M2767g.m4876j(1);
            this.f1055g = c0877w5M2767g;
        }
        Paint paint = c0877w5M2767g.f7002a;
        if (!C0207ff.m1094c(p30.m2992b(paint.getColor()), j)) {
            c0877w5M2767g.m4871e(j);
        }
        if (c0877w5M2767g.f7004c != null) {
            c0877w5M2767g.m4873g(null);
        }
        if (!p30.m3002l(c0877w5M2767g.f7005d, null)) {
            c0877w5M2767g.m4872f(null);
        }
        if (c0877w5M2767g.f7003b != 3) {
            c0877w5M2767g.m4870d(3);
        }
        if (paint.getStrokeWidth() != f) {
            paint.setStrokeWidth(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c0877w5M2767g.m4867a() != 0) {
            c0877w5M2767g.m4874h(0);
        }
        if (c0877w5M2767g.m4868b() != 0) {
            c0877w5M2767g.m4875i(0);
        }
        if (!paint.isFilterBitmap()) {
            paint.setFilterBitmap(true);
        }
        interfaceC0051bd.mo244j(j2, j3, c0877w5M2767g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f1052d.f787a.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C0877w5 m682d(pf1 pf1Var, o30 o30Var, float f, C0348ja c0348ja, int i, int i2) {
        C0877w5 c0877w5M683e = m683e(o30Var);
        Paint paint = c0877w5M683e.f7002a;
        if (pf1Var != null) {
            pf1Var.mo1197h(f, mo649c(), c0877w5M683e);
        } else {
            if (c0877w5M683e.f7004c != null) {
                c0877w5M683e.m4873g(null);
            }
            long jM2992b = p30.m2992b(paint.getColor());
            long j = C0207ff.f1702b;
            if (!C0207ff.m1094c(jM2992b, j)) {
                c0877w5M683e.m4871e(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c0877w5M683e.m4869c(f);
            }
        }
        if (!p30.m3002l(c0877w5M683e.f7005d, c0348ja)) {
            c0877w5M683e.m4872f(c0348ja);
        }
        if (c0877w5M683e.f7003b != i) {
            c0877w5M683e.m4870d(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c0877w5M683e;
        }
        paint.setFilterBitmap(true ^ (i2 == 0));
        return c0877w5M683e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0877w5 m683e(o30 o30Var) {
        if (p30.m3002l(o30Var, C0664qt.f5220Q)) {
            C0877w5 c0877w5 = this.f1054f;
            if (c0877w5 != null) {
                return c0877w5;
            }
            C0877w5 c0877w5M2767g = o30.m2767g();
            c0877w5M2767g.m4876j(0);
            this.f1054f = c0877w5M2767g;
            return c0877w5M2767g;
        }
        if (!(o30Var instanceof s41)) {
            C0921xc.m5129j();
            return null;
        }
        C0877w5 c0877w5M2767g2 = this.f1055g;
        if (c0877w5M2767g2 == null) {
            c0877w5M2767g2 = o30.m2767g();
            c0877w5M2767g2.m4876j(1);
            this.f1055g = c0877w5M2767g2;
        }
        Paint paint = c0877w5M2767g2.f7002a;
        float strokeWidth = paint.getStrokeWidth();
        s41 s41Var = (s41) o30Var;
        float f = s41Var.f5636Q;
        if (strokeWidth != f) {
            paint.setStrokeWidth(f);
        }
        int iM4867a = c0877w5M2767g2.m4867a();
        int i = s41Var.f5638S;
        if (iM4867a != i) {
            c0877w5M2767g2.m4874h(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = s41Var.f5637R;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iM4868b = c0877w5M2767g2.m4868b();
        int i2 = s41Var.f5639T;
        if (iM4868b == i2) {
            return c0877w5M2767g2;
        }
        c0877w5M2767g2.m4875i(i2);
        return c0877w5M2767g2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    public final k50 getLayoutDirection() {
        return this.f1052d.f788b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f1052d.f787a.mo49h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0812uq
    /* JADX INFO: renamed from: t */
    public final C0541o8 mo655t() {
        return this.f1053e;
    }
}
