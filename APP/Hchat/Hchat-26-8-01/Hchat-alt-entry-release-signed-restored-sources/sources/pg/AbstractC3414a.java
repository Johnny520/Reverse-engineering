package pg;

import p162l3.C2469w;
import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: pg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3414a implements Comparable {

    /* JADX INFO: renamed from: g */
    public static final C2469w f11034g = new C2469w(16);

    /* JADX INFO: renamed from: h */
    public static final long f11035h = AbstractC3165h.m6795v(4611686018427387903L);

    /* JADX INFO: renamed from: i */
    public static final long f11036i = AbstractC3165h.m6795v(-4611686018427387903L);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m7193a(long j3, long j4) {
        long j5 = 1000000;
        long j10 = j4 / j5;
        long jM6778e = AbstractC3165h.m6778e(j3, j10);
        if (-4611686018426L > jM6778e || jM6778e >= 4611686018427L) {
            return AbstractC3165h.m6795v(jM6778e);
        }
        long j11 = ((jM6778e * j5) + (j4 - (j10 * j5))) << 1;
        int i9 = AbstractC3415b.f11037a;
        return j11;
    }
}
