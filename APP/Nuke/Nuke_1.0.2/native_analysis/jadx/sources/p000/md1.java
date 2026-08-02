package p000;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class md1 extends kd1 implements if1 {

    /* JADX INFO: renamed from: A */
    public final gk1 f6571A;

    /* JADX INFO: renamed from: v */
    public final zn1 f6572v;

    /* JADX INFO: renamed from: x */
    public LinkedHashMap f6574x;

    /* JADX INFO: renamed from: z */
    public of1 f6576z;

    /* JADX INFO: renamed from: w */
    public long f6573w = 0;

    /* JADX INFO: renamed from: y */
    public final nd1 f6575y = new nd1(this);

    public md1(zn1 zn1Var) {
        this.f6572v = zn1Var;
        gk1 gk1Var = hs1.f4124a;
        this.f6571A = new gk1();
    }

    /* JADX INFO: renamed from: H0 */
    public static final void m3061H0(md1 md1Var, of1 of1Var) {
        LinkedHashMap linkedHashMap;
        if (of1Var != null) {
            md1Var.m5046g0((((long) of1Var.mo106c()) & 4294967295L) | (((long) of1Var.mo108e()) << 32));
        } else {
            md1Var.m5046g0(0L);
        }
        if (!t11.m5086l(md1Var.f6576z, of1Var) && of1Var != null && ((((linkedHashMap = md1Var.f6574x) != null && !linkedHashMap.isEmpty()) || !of1Var.mo104a().isEmpty()) && !t11.m5086l(of1Var.mo104a(), md1Var.f6574x))) {
            qd1 qd1Var = md1Var.f6572v.f13985v.f9373N.f11796q;
            qd1Var.getClass();
            qd1Var.f8918x.m4743f();
            LinkedHashMap linkedHashMap2 = md1Var.f6574x;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                md1Var.f6574x = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(of1Var.mo104a());
        }
        md1Var.f6576z = of1Var;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: A0 */
    public final of1 mo2630A0() {
        of1 of1Var = this.f6576z;
        if (of1Var != null) {
            return of1Var;
        }
        throw vi0.m5686e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: B0 */
    public final kd1 mo2631B0() {
        zn1 zn1Var = this.f6572v.f13987x;
        if (zn1Var != null) {
            return zn1Var.mo2842Q0();
        }
        return null;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: C0 */
    public final long mo2632C0() {
        return this.f6573w;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: G0 */
    public final void mo2635G0() {
        mo2506f0(this.f6573w, 0.0f, null);
    }

    /* JADX INFO: renamed from: I0 */
    public void mo3062I0() {
        mo2630A0().mo105b();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m3063J0(long j) {
        if (!z01.m6371a(this.f6573w, j)) {
            this.f6573w = j;
            zn1 zn1Var = this.f6572v;
            qd1 qd1Var = zn1Var.f13985v.f9373N.f11796q;
            if (qd1Var != null) {
                qd1Var.m4142o0();
            }
            kd1.m2629E0(zn1Var);
        }
        if (this.f5468r) {
            return;
        }
        m2639o0(mo2630A0());
    }

    /* JADX INFO: renamed from: K0 */
    public final long m3064K0(md1 md1Var, boolean z) {
        long jM6373c = 0;
        while (!this.equals(md1Var)) {
            if (!this.f5466p || !z) {
                jM6373c = z01.m6373c(jM6373c, this.f6573w);
            }
            zn1 zn1Var = this.f6572v.f13987x;
            zn1Var.getClass();
            this = zn1Var.mo2842Q0();
            this.getClass();
        }
        return jM6373c;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f6572v.mo693b();
    }

    @Override // p000.sz1
    /* JADX INFO: renamed from: f0 */
    public final void mo2506f0(long j, float f, in0 in0Var) {
        m3063J0(j);
        if (this.f5467q) {
            return;
        }
        mo3062I0();
    }

    @Override // p000.m11
    public final d61 getLayoutDirection() {
        return this.f6572v.f13985v.f9366G;
    }

    @Override // p000.sz1, p000.if1
    /* JADX INFO: renamed from: i */
    public final Object mo2342i() {
        return this.f6572v.mo2342i();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f6572v.mo697m();
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: r0 */
    public final kd1 mo2641r0() {
        zn1 zn1Var = this.f6572v.f13986w;
        if (zn1Var != null) {
            return zn1Var.mo2842Q0();
        }
        return null;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: t0 */
    public final c61 mo2642t0() {
        return this.f6575y;
    }

    @Override // p000.kd1, p000.m11
    /* JADX INFO: renamed from: u */
    public final boolean mo699u() {
        return true;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: v0 */
    public final boolean mo2643v0() {
        return this.f6576z != null;
    }

    @Override // p000.kd1
    /* JADX INFO: renamed from: w0 */
    public final r61 mo2644w0() {
        return this.f6572v.f13985v;
    }
}
