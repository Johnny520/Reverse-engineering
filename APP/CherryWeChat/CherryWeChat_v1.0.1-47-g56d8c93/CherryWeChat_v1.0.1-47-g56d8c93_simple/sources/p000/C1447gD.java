package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: gD */
/* JADX INFO: loaded from: classes.dex */
public final class C1447gD extends AbstractC1535iD {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5056b;

    public /* synthetic */ C1447gD(Unsafe r1, int r2) {
        this.f5056b = r2;
        super(r1);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: c */
    public final boolean mo2763c(long r4, Object r6) {
        switch(this.f5056b) {
            case 0: goto L14;
            default: goto L5;
        };
    L5:
        if (AbstractC2092jD.f7370g == false) goto L10;
        if (AbstractC2092jD.m4268h(r4, r6) != 0) goto L22;
        return false;
    L22:
        return true;
    L10:
        if (AbstractC2092jD.m4269i(r4, r6) != 0) goto L22;
        return false;
    L14:
        if (AbstractC2092jD.f7370g == false) goto L19;
        if (AbstractC2092jD.m4268h(r4, r6) != 0) goto L24;
        return false;
    L24:
        return true;
    L19:
        if (AbstractC2092jD.m4269i(r4, r6) != 0) goto L24;
        return false;
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: d */
    public final byte mo2764d(long r2, Object r4) {
        switch(this.f5056b) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (AbstractC2092jD.f7370g == false) goto L8;
        return AbstractC2092jD.m4268h(r2, r4);
    L8:
        return AbstractC2092jD.m4269i(r2, r4);
    L10:
        if (AbstractC2092jD.f7370g == false) goto L13;
        return AbstractC2092jD.m4268h(r2, r4);
    L13:
        return AbstractC2092jD.m4269i(r2, r4);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: e */
    public final double mo2765e(long r2, Object r4) {
        switch(this.f5056b) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Double.longBitsToDouble(m2907h(r2, r4));
    L7:
        return Double.longBitsToDouble(m2907h(r2, r4));
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: f */
    public final float mo2766f(long r2, Object r4) {
        switch(this.f5056b) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Float.intBitsToFloat(m2906g(r2, r4));
    L7:
        return Float.intBitsToFloat(m2906g(r2, r4));
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: k */
    public final void mo2767k(Object r2, long r3, boolean r5) {
        switch(this.f5056b) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (AbstractC2092jD.f7370g == false) goto L7;
        AbstractC2092jD.m4272l(r2, r3, r5 ? 1 : 0);
        return;
    L7:
        AbstractC2092jD.m4273m(r2, r3, r5 ? 1 : 0);
        return;
    L10:
        if (AbstractC2092jD.f7370g == false) goto L12;
        AbstractC2092jD.m4272l(r2, r3, r5 ? 1 : 0);
        return;
    L12:
        AbstractC2092jD.m4273m(r2, r3, r5 ? 1 : 0);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: l */
    public final void mo2768l(Object r2, long r3, byte r5) {
        switch(this.f5056b) {
            case 0: goto L10;
            default: goto L5;
        };
    L5:
        if (AbstractC2092jD.f7370g == false) goto L7;
        AbstractC2092jD.m4272l(r2, r3, r5);
        return;
    L7:
        AbstractC2092jD.m4273m(r2, r3, r5);
        return;
    L10:
        if (AbstractC2092jD.f7370g == false) goto L12;
        AbstractC2092jD.m4272l(r2, r3, r5);
        return;
    L12:
        AbstractC2092jD.m4273m(r2, r3, r5);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: m */
    public final void mo2769m(Object r7, long r8, double r10) {
        switch(this.f5056b) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        m2911p(r7, r8, Double.doubleToLongBits(r10));
        return;
    L6:
        m2911p(r7, r8, Double.doubleToLongBits(r10));
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: n */
    public final void mo2770n(Object r2, long r3, float r5) {
        switch(this.f5056b) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        m2910o(Float.floatToIntBits(r5), r3, r2);
        return;
    L6:
        m2910o(Float.floatToIntBits(r5), r3, r2);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: s */
    public final boolean mo2771s() {
        switch(this.f5056b) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return false;
    L6:
        return false;
    }
}
