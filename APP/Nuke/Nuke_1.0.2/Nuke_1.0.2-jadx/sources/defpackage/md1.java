package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class md1 extends kd1 implements if1 {
    public final gk1 A;
    public final zn1 v;
    public LinkedHashMap x;
    public of1 z;
    public long w = 0;
    public final nd1 y = new nd1(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public md1(zn1 zn1Var) {
        this.v = zn1Var;
        gk1 gk1Var = hs1.a;
        this.A = new gk1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void H0(md1 md1Var, of1 of1Var) {
        LinkedHashMap linkedHashMap;
        if (of1Var != null) {
            md1Var.g0((((long) of1Var.c()) & 4294967295L) | (((long) of1Var.e()) << 32));
        } else {
            md1Var.g0(0L);
        }
        if (!t11.l(md1Var.z, of1Var) && of1Var != null && ((((linkedHashMap = md1Var.x) != null && !linkedHashMap.isEmpty()) || !of1Var.a().isEmpty()) && !t11.l(of1Var.a(), md1Var.x))) {
            qd1 qd1Var = md1Var.v.v.N.q;
            qd1Var.getClass();
            qd1Var.x.f();
            LinkedHashMap linkedHashMap2 = md1Var.x;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                md1Var.x = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(of1Var.a());
        }
        md1Var.z = of1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final of1 A0() {
        of1 of1Var = this.z;
        if (of1Var != null) {
            return of1Var;
        }
        throw vi0.e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final kd1 B0() {
        zn1 zn1Var = this.v.x;
        if (zn1Var != null) {
            return zn1Var.Q0();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final long C0() {
        return this.w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final void G0() {
        f0(this.w, 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void I0() {
        A0().b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J0(long j) {
        if (!z01.a(this.w, j)) {
            this.w = j;
            zn1 zn1Var = this.v;
            qd1 qd1Var = zn1Var.v.N.q;
            if (qd1Var != null) {
                qd1Var.o0();
            }
            kd1.E0(zn1Var);
        }
        if (this.r) {
            return;
        }
        o0(A0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long K0(md1 md1Var, boolean z) {
        long jC = 0;
        while (!this.equals(md1Var)) {
            if (!this.p || !z) {
                jC = z01.c(jC, this.w);
            }
            zn1 zn1Var = this.v.x;
            zn1Var.getClass();
            this = zn1Var.Q0();
            this.getClass();
        }
        return jC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float b() {
        return this.v.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sz1
    public final void f0(long j, float f, in0 in0Var) {
        J0(j);
        if (this.q) {
            return;
        }
        I0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.m11
    public final d61 getLayoutDirection() {
        return this.v.v.G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sz1, defpackage.if1
    public final Object i() {
        return this.v.i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e70
    public final float m() {
        return this.v.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final kd1 r0() {
        zn1 zn1Var = this.v.w;
        if (zn1Var != null) {
            return zn1Var.Q0();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final c61 t0() {
        return this.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1, defpackage.m11
    public final boolean u() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final boolean v0() {
        return this.z != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kd1
    public final r61 w0() {
        return this.v.v;
    }
}
