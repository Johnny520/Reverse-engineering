package p107h6;

import p024b9.AbstractC1052o0;
import p024b9.C1045l;

/* JADX INFO: renamed from: h6.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2873a extends AbstractC2882j {

    /* JADX INFO: renamed from: a0 */
    public final AbstractC2882j f7534a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2873a(AbstractC2882j abstractC2882j) {
        super(EnumC2875c.f7538u, AbstractC1052o0.m3807b(double[].class), null, abstractC2882j.m10373n(), new double[0]);
        abstractC2882j.getClass();
        this.f7534a0 = abstractC2882j;
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public double[] mo10314a(C2885m c2885m) {
        c2885m.getClass();
        C1045l c1045l = C1045l.f3204a;
        return new double[]{Double.longBitsToDouble(c2885m.m10489l())};
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo10315d(C2886n c2886n, double[] dArr) {
        c2886n.getClass();
        dArr.getClass();
        for (double d10 : dArr) {
            this.f7534a0.mo10315d(c2886n, Double.valueOf(d10));
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo10316e(C2888p c2888p, double[] dArr) {
        c2888p.getClass();
        dArr.getClass();
        int length = dArr.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                c2888p.m10527h(Double.doubleToLongBits(dArr[length]));
            }
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo10317h(C2886n c2886n, int i10, double[] dArr) {
        c2886n.getClass();
        if (dArr != null) {
            if (dArr.length == 0) {
                return;
            }
            super.mo10317h(c2886n, i10, dArr);
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo10318i(C2888p c2888p, int i10, double[] dArr) {
        c2888p.getClass();
        if (dArr != null) {
            if (dArr.length == 0) {
                return;
            }
            super.mo10318i(c2888p, i10, dArr);
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo10319j(double[] dArr) {
        dArr.getClass();
        int iMo10319j = 0;
        for (double d10 : dArr) {
            iMo10319j += this.f7534a0.mo10319j(Double.valueOf(d10));
        }
        return iMo10319j;
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int mo10320k(int i10, double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return 0;
        }
        return super.mo10320k(i10, dArr);
    }
}
