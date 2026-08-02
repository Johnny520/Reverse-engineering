package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z11 implements pf1, m11 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ m11 f13703h;

    /* JADX INFO: renamed from: i */
    public final d61 f13704i;

    public z11(m11 m11Var, d61 d61Var) {
        this.f13703h = m11Var;
        this.f13704i = d61Var;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: A */
    public final float mo689A(float f) {
        return this.f13703h.mo689A(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: K */
    public final float mo690K(long j) {
        return this.f13703h.mo690K(j);
    }

    @Override // p000.pf1
    /* JADX INFO: renamed from: S */
    public final of1 mo691S(int i, int i2, Map map, in0 in0Var, in0 in0Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            kz0.m2764b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new y11(i, i2, map, in0Var);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: T */
    public final int mo692T(float f) {
        return this.f13703h.mo692T(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f13703h.mo693b();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: d0 */
    public final long mo694d0(long j) {
        return this.f13703h.mo694d0(j);
    }

    @Override // p000.m11
    public final d61 getLayoutDirection() {
        return this.f13704i;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: h0 */
    public final float mo695h0(long j) {
        return this.f13703h.mo695h0(j);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f13703h.mo697m();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: p0 */
    public final long mo698p0(float f) {
        return this.f13703h.mo698p0(f);
    }

    @Override // p000.m11
    /* JADX INFO: renamed from: u */
    public final boolean mo699u() {
        return this.f13703h.mo699u();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: u0 */
    public final float mo700u0(int i) {
        return this.f13703h.mo700u0(i);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x */
    public final long mo701x(float f) {
        return this.f13703h.mo701x(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x0 */
    public final float mo702x0(float f) {
        return this.f13703h.mo702x0(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: y */
    public final long mo703y(long j) {
        return this.f13703h.mo703y(j);
    }
}
