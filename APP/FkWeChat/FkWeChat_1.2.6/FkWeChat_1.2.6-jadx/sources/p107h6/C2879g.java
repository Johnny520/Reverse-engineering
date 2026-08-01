package p107h6;

import p024b9.AbstractC1052o0;

/* JADX INFO: renamed from: h6.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2879g extends AbstractC2882j {

    /* JADX INFO: renamed from: a0 */
    public final AbstractC2882j f7546a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2879g(AbstractC2882j abstractC2882j) {
        super(EnumC2875c.f7538u, AbstractC1052o0.m3807b(long[].class), null, abstractC2882j.m10373n(), new long[0]);
        abstractC2882j.getClass();
        this.f7546a0 = abstractC2882j;
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public long[] mo10314a(C2885m c2885m) {
        c2885m.getClass();
        return new long[]{((Number) this.f7546a0.mo10314a(c2885m)).longValue()};
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo10315d(C2886n c2886n, long[] jArr) {
        c2886n.getClass();
        jArr.getClass();
        for (long j10 : jArr) {
            this.f7546a0.mo10315d(c2886n, Long.valueOf(j10));
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo10316e(C2888p c2888p, long[] jArr) {
        c2888p.getClass();
        jArr.getClass();
        int length = jArr.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                this.f7546a0.mo10316e(c2888p, Long.valueOf(jArr[length]));
            }
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo10317h(C2886n c2886n, int i10, long[] jArr) {
        c2886n.getClass();
        if (jArr != null) {
            if (jArr.length == 0) {
                return;
            }
            super.mo10317h(c2886n, i10, jArr);
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo10318i(C2888p c2888p, int i10, long[] jArr) {
        c2888p.getClass();
        if (jArr != null) {
            if (jArr.length == 0) {
                return;
            }
            super.mo10318i(c2888p, i10, jArr);
        }
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo10319j(long[] jArr) {
        jArr.getClass();
        int iMo10319j = 0;
        for (long j10 : jArr) {
            iMo10319j += this.f7546a0.mo10319j(Long.valueOf(j10));
        }
        return iMo10319j;
    }

    @Override // p107h6.AbstractC2882j
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int mo10320k(int i10, long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return super.mo10320k(i10, jArr);
    }
}
