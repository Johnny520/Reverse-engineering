package p000;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: gD */
/* JADX INFO: loaded from: classes.dex */
public final class C1447gD extends AbstractC1535iD {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1447gD(Unsafe unsafe, int i) {
        super(unsafe);
        this.f5056b = i;
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: c */
    public final boolean mo2763c(long j, Object obj) {
        switch (this.f5056b) {
            case 0:
                if (AbstractC2092jD.f7370g) {
                    if (AbstractC2092jD.m4268h(j, obj) == 0) {
                    }
                } else if (AbstractC2092jD.m4269i(j, obj) == 0) {
                }
                break;
            default:
                if (AbstractC2092jD.f7370g) {
                    if (AbstractC2092jD.m4268h(j, obj) == 0) {
                    }
                } else if (AbstractC2092jD.m4269i(j, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: d */
    public final byte mo2764d(long j, Object obj) {
        switch (this.f5056b) {
            case 0:
                if (!AbstractC2092jD.f7370g) {
                }
                break;
            default:
                if (!AbstractC2092jD.f7370g) {
                }
                break;
        }
        return AbstractC2092jD.m4269i(j, obj);
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: e */
    public final double mo2765e(long j, Object obj) {
        switch (this.f5056b) {
        }
        return Double.longBitsToDouble(m2907h(j, obj));
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: f */
    public final float mo2766f(long j, Object obj) {
        switch (this.f5056b) {
        }
        return Float.intBitsToFloat(m2906g(j, obj));
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: k */
    public final void mo2767k(Object obj, long j, boolean z) {
        switch (this.f5056b) {
            case 0:
                if (!AbstractC2092jD.f7370g) {
                    AbstractC2092jD.m4273m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC2092jD.m4272l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!AbstractC2092jD.f7370g) {
                    AbstractC2092jD.m4273m(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    AbstractC2092jD.m4272l(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: l */
    public final void mo2768l(Object obj, long j, byte b) {
        switch (this.f5056b) {
            case 0:
                if (!AbstractC2092jD.f7370g) {
                    AbstractC2092jD.m4273m(obj, j, b);
                } else {
                    AbstractC2092jD.m4272l(obj, j, b);
                }
                break;
            default:
                if (!AbstractC2092jD.f7370g) {
                    AbstractC2092jD.m4273m(obj, j, b);
                } else {
                    AbstractC2092jD.m4272l(obj, j, b);
                }
                break;
        }
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: m */
    public final void mo2769m(Object obj, long j, double d) {
        switch (this.f5056b) {
            case 0:
                m2911p(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                m2911p(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: n */
    public final void mo2770n(Object obj, long j, float f) {
        switch (this.f5056b) {
            case 0:
                m2910o(Float.floatToIntBits(f), j, obj);
                break;
            default:
                m2910o(Float.floatToIntBits(f), j, obj);
                break;
        }
    }

    @Override // p000.AbstractC1535iD
    /* JADX INFO: renamed from: s */
    public final boolean mo2771s() {
        switch (this.f5056b) {
        }
        return false;
    }
}
