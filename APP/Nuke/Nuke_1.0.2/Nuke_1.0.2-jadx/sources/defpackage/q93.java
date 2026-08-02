package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q93 extends i93 {
    public final ar0 b;
    public String c;
    public boolean d;
    public final jc0 e;
    public xm0 f;
    public final nx1 g;
    public cl h;
    public final nx1 i;
    public long j;
    public float k;
    public float l;
    public final p93 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q93(ar0 ar0Var) {
        this.b = ar0Var;
        ar0Var.i = new p93(this, 0);
        this.c = "";
        this.d = true;
        this.e = new jc0();
        this.f = jy.w;
        this.g = op0.u(null);
        this.i = op0.u(new gr2(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new p93(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i93
    public final void a(nc0 nc0Var) {
        e(nc0Var, 1.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(nc0 nc0Var, float f, cl clVar) {
        int i;
        cl clVar2;
        char c;
        long j;
        cl clVar3;
        int i2;
        int i3;
        ar0 ar0Var = this.b;
        boolean z = ar0Var.d;
        nx1 nx1Var = this.g;
        if (!z || ar0Var.e == 16) {
            i = 0;
        } else {
            cl clVar4 = (cl) nx1Var.getValue();
            int i4 = s93.a;
            if (!(clVar4 instanceof cl) ? clVar4 == null : !((i3 = clVar4.c) != 5 && i3 != 3)) {
                if (!(clVar instanceof cl) ? clVar == null : !((i2 = clVar.c) != 5 && i2 != 3)) {
                    i = 1;
                }
            }
        }
        boolean z2 = this.d;
        jc0 jc0Var = this.e;
        if (z2 || !gr2.a(this.j, nc0Var.d())) {
            if (i == 1) {
                long jB = ar0Var.e;
                int i5 = s93.a;
                if (ju.d(jB) != 1.0f) {
                    jB = ju.b(1.0f, jB);
                }
                clVar2 = new cl(jB, 5);
            } else {
                clVar2 = null;
            }
            this.h = clVar2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (nc0Var.d() >> 32));
            nx1 nx1Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((gr2) nx1Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L)) / Float.intBitsToFloat((int) (((gr2) nx1Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (nc0Var.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (nc0Var.d() & 4294967295L))))) & 4294967295L);
            d61 layoutDirection = nc0Var.getLayoutDirection();
            d9 d9VarB = jc0Var.a;
            f6 f6VarF = jc0Var.b;
            if (d9VarB == null || f6VarF == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = d9VarB.a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || jc0Var.d != i) {
                }
                jc0Var.c = jCeil;
                sp spVar = jc0Var.e;
                long jQ0 = s11.q0(jCeil);
                rp rpVar = spVar.h;
                e70 e70Var = rpVar.a;
                d61 d61Var = rpVar.b;
                qp qpVar = rpVar.c;
                f6 f6Var = f6VarF;
                long j2 = rpVar.d;
                rpVar.a = nc0Var;
                rpVar.b = layoutDirection;
                rpVar.c = f6Var;
                rpVar.d = jQ0;
                f6Var.l();
                nc0.i0(spVar, ju.b, 0L, 0L, 62);
                this.m.j(spVar);
                f6Var.i();
                rp rpVar2 = spVar.h;
                rpVar2.a = e70Var;
                rpVar2.b = d61Var;
                rpVar2.c = qpVar;
                rpVar2.d = j2;
                d9VarB.a.prepareToDraw();
                this.d = false;
                this.j = nc0Var.d();
            }
            d9VarB = p7.b((int) (jCeil >> c), (int) (jCeil & j), i);
            f6VarF = rp0.F(d9VarB);
            jc0Var.a = d9VarB;
            jc0Var.b = f6VarF;
            jc0Var.d = i;
            jc0Var.c = jCeil;
            sp spVar2 = jc0Var.e;
            long jQ02 = s11.q0(jCeil);
            rp rpVar3 = spVar2.h;
            e70 e70Var2 = rpVar3.a;
            d61 d61Var2 = rpVar3.b;
            qp qpVar2 = rpVar3.c;
            f6 f6Var2 = f6VarF;
            long j22 = rpVar3.d;
            rpVar3.a = nc0Var;
            rpVar3.b = layoutDirection;
            rpVar3.c = f6Var2;
            rpVar3.d = jQ02;
            f6Var2.l();
            nc0.i0(spVar2, ju.b, 0L, 0L, 62);
            this.m.j(spVar2);
            f6Var2.i();
            rp rpVar22 = spVar2.h;
            rpVar22.a = e70Var2;
            rpVar22.b = d61Var2;
            rpVar22.c = qpVar2;
            rpVar22.d = j22;
            d9VarB.a.prepareToDraw();
            this.d = false;
            this.j = nc0Var.d();
        } else {
            d9 d9Var = jc0Var.a;
            if (i != (d9Var != null ? d9Var.a() : 0)) {
            }
        }
        if (clVar != null) {
            clVar3 = clVar;
        } else {
            clVar3 = ((cl) nx1Var.getValue()) != null ? (cl) nx1Var.getValue() : this.h;
        }
        d9 d9Var2 = jc0Var.a;
        if (d9Var2 == null) {
            kz0.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        nc0.V(nc0Var, d9Var2, jc0Var.c, 0L, f, clVar3, 0, 858);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        nx1 nx1Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((gr2) nx1Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((gr2) nx1Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
