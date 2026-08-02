package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rf0 extends th1 implements j61 {
    public xm0 A;
    public kf0 B;
    public long C = -9223372034707292160L;
    public r5 D;
    public final qf0 E;
    public y33 v;
    public u33 w;
    public u33 x;
    public sf0 y;
    public ph0 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rf0(y33 y33Var, u33 u33Var, u33 u33Var2, sf0 sf0Var, ph0 ph0Var, xm0 xm0Var, kf0 kf0Var) {
        this.v = y33Var;
        this.w = u33Var;
        this.x = u33Var2;
        this.y = sf0Var;
        this.z = ph0Var;
        this.A = xm0Var;
        this.B = kf0Var;
        gz.b(0, 0, 0, 0, 15);
        this.E = new qf0(this, 0);
        new qf0(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int D(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.X(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        this.C = -9223372034707292160L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r5 M0() {
        if (this.v.f().a(if0.h, if0.i)) {
            z33 z33Var = this.z.a;
            return null;
        }
        z33 z33Var2 = this.z.a;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int U(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.N(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    @Override // defpackage.j61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        char c;
        t33 t33VarA;
        m33 m33Var;
        if (this.v.c() == this.v.d.getValue()) {
            this.D = null;
        } else if (this.D == null) {
            r5 r5VarM0 = M0();
            if (r5VarM0 == null) {
                r5VarM0 = sn.j;
            }
            this.D = r5VarM0;
        }
        boolean zU = pf1Var.u();
        ce0 ce0Var = ce0.h;
        if (zU) {
            sz1 sz1VarE = if1Var.e(j);
            long j2 = (((long) sz1VarE.h) << 32) | (((long) sz1VarE.i) & 4294967295L);
            this.C = j2;
            return pf1Var.j0((int) (j2 >> 32), (int) (4294967295L & j2), ce0Var, new n6(sz1VarE, 3));
        }
        if (!((Boolean) this.A.a()).booleanValue()) {
            sz1 sz1VarE2 = if1Var.e(j);
            return pf1Var.j0(sz1VarE2.h, sz1VarE2.i, ce0Var, new n6(sz1VarE2, 4));
        }
        kf0 kf0Var = this.B;
        u33 u33Var = kf0Var.a;
        u33 u33Var2 = kf0Var.b;
        y33 y33Var = kf0Var.c;
        sf0 sf0Var = kf0Var.d;
        z33 z33Var = sf0Var.a;
        ph0 ph0Var = kf0Var.e;
        u33 u33Var3 = kf0Var.f;
        t33 t33VarA2 = u33Var != null ? u33Var.a(new lf0(sf0Var, ph0Var, 0), new lf0(sf0Var, ph0Var, 1)) : null;
        if (u33Var2 != null) {
            c = ' ';
            t33VarA = u33Var2.a(new lf0(sf0Var, ph0Var, 2), new lf0(sf0Var, ph0Var, 3));
        } else {
            c = ' ';
            t33VarA = null;
        }
        if (y33Var.c() == if0.h) {
            cd2 cd2Var = z33Var.b;
            if (cd2Var != null) {
                m33Var = new m33(cd2Var.a);
            } else {
                cd2 cd2Var2 = ph0Var.a.b;
                m33Var = cd2Var2 != null ? new m33(cd2Var2.a) : null;
            }
        } else {
            cd2 cd2Var3 = ph0Var.a.b;
            if (cd2Var3 != null) {
                m33Var = new m33(cd2Var3.a);
            } else {
                cd2 cd2Var4 = z33Var.b;
                if (cd2Var4 != null) {
                    m33Var = new m33(cd2Var4.a);
                }
            }
        }
        ec ecVar = new ec(t33VarA2, t33VarA, u33Var3 != null ? u33Var3.a(v6.J, new ec(m33Var, sf0Var, ph0Var, 3)) : null, 2);
        sz1 sz1VarE3 = if1Var.e(j);
        long j3 = (((long) sz1VarE3.i) & 4294967295L) | (((long) sz1VarE3.h) << c);
        long j4 = !h11.a(this.C, -9223372034707292160L) ? this.C : j3;
        u33 u33Var4 = this.w;
        t33 t33VarA3 = u33Var4 != null ? u33Var4.a(this.E, new pf0(this, j4, 0)) : null;
        if (t33VarA3 != null) {
            j3 = ((h11) t33VarA3.getValue()).a;
        }
        long jD = gz.d(j, j3);
        u33 u33Var5 = this.x;
        long j5 = u33Var5 != null ? ((z01) u33Var5.a(v6.K, new pf0(this, j4, 1)).getValue()).a : 0L;
        r5 r5Var = this.D;
        return pf1Var.j0((int) (jD >> c), (int) (jD & 4294967295L), ce0Var, new of0(sz1VarE3, z01.c(r5Var != null ? r5Var.a(j4, jD, d61.h) : 0L, 0L), j5, ecVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int g(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.W(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int p(kd1 kd1Var, if1 if1Var, int i) {
        return if1Var.f(i);
    }
}
