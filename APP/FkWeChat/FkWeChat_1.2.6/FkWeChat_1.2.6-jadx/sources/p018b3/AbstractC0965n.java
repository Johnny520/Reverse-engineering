package p018b3;

import p319w2.AbstractC9142u3;
import p319w2.C9137t3;

/* JADX INFO: renamed from: b3.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0965n {
    /* JADX INFO: renamed from: a */
    public static final long m3523a(long j10, long j11) {
        int iM35519j;
        int iM35521l = C9137t3.m35521l(j10);
        int iM35520k = C9137t3.m35520k(j10);
        if (C9137t3.m35525p(j11, j10)) {
            if (C9137t3.m35513d(j11, j10)) {
                iM35521l = C9137t3.m35521l(j11);
                iM35520k = iM35521l;
            } else {
                if (C9137t3.m35513d(j10, j11)) {
                    iM35519j = C9137t3.m35519j(j11);
                } else if (C9137t3.m35514e(j11, iM35521l)) {
                    iM35521l = C9137t3.m35521l(j11);
                    iM35519j = C9137t3.m35519j(j11);
                } else {
                    iM35520k = C9137t3.m35521l(j11);
                }
                iM35520k -= iM35519j;
            }
        } else if (iM35520k > C9137t3.m35521l(j11)) {
            iM35521l -= C9137t3.m35519j(j11);
            iM35519j = C9137t3.m35519j(j11);
            iM35520k -= iM35519j;
        }
        return AbstractC9142u3.m35530b(iM35521l, iM35520k);
    }
}
