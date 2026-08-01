package p018b3;

import p319w2.C9058e;
import p319w2.C9137t3;

/* JADX INFO: renamed from: b3.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0980u0 {
    /* JADX INFO: renamed from: a */
    public static final C9058e m3593a(C0978t0 c0978t0) {
        return c0978t0.m3583h().m35165t(c0978t0.m3585j());
    }

    /* JADX INFO: renamed from: b */
    public static final C9058e m3594b(C0978t0 c0978t0, int i10) {
        C9058e c9058eM3583h = c0978t0.m3583h();
        int iM35520k = C9137t3.m35520k(c0978t0.m3585j());
        int iM35520k2 = C9137t3.m35520k(c0978t0.m3585j());
        int length = iM35520k2 + i10;
        if (((i10 ^ length) & (iM35520k2 ^ length)) < 0) {
            length = c0978t0.m3586k().length();
        }
        return c9058eM3583h.subSequence(iM35520k, Math.min(length, c0978t0.m3586k().length()));
    }

    /* JADX INFO: renamed from: c */
    public static final C9058e m3595c(C0978t0 c0978t0, int i10) {
        C9058e c9058eM3583h = c0978t0.m3583h();
        int iM35521l = C9137t3.m35521l(c0978t0.m3585j());
        int i11 = iM35521l - i10;
        if (((i10 ^ iM35521l) & (iM35521l ^ i11)) < 0) {
            i11 = 0;
        }
        return c9058eM3583h.subSequence(Math.max(0, i11), C9137t3.m35521l(c0978t0.m3585j()));
    }
}
