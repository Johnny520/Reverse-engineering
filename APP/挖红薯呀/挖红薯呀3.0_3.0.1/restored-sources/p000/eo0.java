package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class eo0 implements j21 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0399km f1493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qn0 f1494b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public eo0(C0399km c0399km, qn0 qn0Var, do0 do0Var) {
        this.f1493a = c0399km;
        this.f1494b = qn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j21
    /* JADX INFO: renamed from: a */
    public final float mo949a(float f, float f2) {
        C0399km c0399km = this.f1493a;
        int iM2039o = c0399km.m2039o();
        gp0 gp0Var = c0399km.f3555p;
        int i = ((zn0) gp0Var.getValue()).f7939c + iM2039o;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = c0399km.f3544e;
        if (f < 0.0f) {
            i2++;
        }
        int iM4907n = w60.m4907n(((int) (f2 / i)) + i2, 0, c0399km.mo1941n());
        c0399km.m2039o();
        int i3 = ((zn0) gp0Var.getValue()).f7939c;
        long j = i2;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i4 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int iAbs = Math.abs((w60.m4907n(w60.m4907n(iM4907n, i4, (int) j3), 0, c0399km.mo1941n()) - i2) * i) - i;
        int i5 = iAbs >= 0 ? iAbs : 0;
        if (i5 == 0) {
            return i5;
        }
        return Math.signum(f) * i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j21
    /* JADX INFO: renamed from: b */
    public final float mo950b(float f) {
        C0399km c0399km = this.f1493a;
        C0496n2 c0496n2 = c0399km.m2038m().f7950n;
        List list = c0399km.m2038m().f7937a;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            ae0 ae0Var = (ae0) list.get(i);
            int iM4914u = w60.m4914u(c0399km.m2038m());
            int i2 = -c0399km.m2038m().f7942f;
            int i3 = c0399km.m2038m().f7940d;
            int i4 = c0399km.m2038m().f7938b;
            int i5 = ae0Var.f142j;
            c0399km.mo1941n();
            float fM2630i = i5 - c0496n2.m2630i(iM4914u, i4, i2, i3);
            if (fM2630i <= 0.0f && fM2630i > f3) {
                f3 = fM2630i;
            }
            if (fM2630i >= 0.0f && fM2630i < f2) {
                f2 = fM2630i;
            }
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f2;
        }
        if (f2 == Float.POSITIVE_INFINITY) {
            f2 = f3;
        }
        if (!c0399km.mo502c()) {
            if (u50.m4275r(c0399km, f)) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = 0.0f;
            }
        }
        if (!c0399km.mo500a()) {
            f3 = 0.0f;
            if (!u50.m4275r(c0399km, f)) {
                f2 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f3);
        Float fValueOf2 = Float.valueOf(f2);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) this.f1494b.mo353a(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
            z10.m5363c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
        }
        if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return fFloatValue3;
    }
}
