package p107h6;

import p024b9.AbstractC1052o0;
import p024b9.C1047m;

/* JADX INFO: renamed from: h6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2876d extends AbstractC2882j {

    /* JADX INFO: renamed from: a0 */
    public final AbstractC2882j f7544a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2876d(AbstractC2882j abstractC2882j) {
        super(EnumC2875c.f7538u, AbstractC1052o0.m3807b(float[].class), null, abstractC2882j.m10373n(), new float[0]);
        abstractC2882j.getClass();
        this.f7544a0 = abstractC2882j;
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public float[] mo10314a(C2885m c2885m) {
        c2885m.getClass();
        C1047m c1047m = C1047m.f3206a;
        return new float[]{Float.intBitsToFloat(c2885m.m10488k())};
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo10315d(C2886n c2886n, float[] fArr) {
        c2886n.getClass();
        fArr.getClass();
        for (float f10 : fArr) {
            this.f7544a0.mo10315d(c2886n, Float.valueOf(f10));
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo10316e(C2888p c2888p, float[] fArr) {
        c2888p.getClass();
        fArr.getClass();
        int length = fArr.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                c2888p.m10526g(Float.floatToIntBits(fArr[length]));
            }
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo10317h(C2886n c2886n, int i10, float[] fArr) {
        c2886n.getClass();
        if (fArr != null) {
            if (fArr.length == 0) {
                return;
            }
            super.mo10317h(c2886n, i10, fArr);
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo10318i(C2888p c2888p, int i10, float[] fArr) {
        c2888p.getClass();
        if (fArr != null) {
            if (fArr.length == 0) {
                return;
            }
            super.mo10318i(c2888p, i10, fArr);
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo10319j(float[] fArr) {
        fArr.getClass();
        int iMo10319j = 0;
        for (float f10 : fArr) {
            iMo10319j += this.f7544a0.mo10319j(Float.valueOf(f10));
        }
        return iMo10319j;
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int mo10320k(int i10, float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return super.mo10320k(i10, fArr);
    }
}
