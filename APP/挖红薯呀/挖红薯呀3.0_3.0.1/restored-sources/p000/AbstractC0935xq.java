package p000;

/* JADX INFO: renamed from: xq */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0935xq implements Comparable {

    /* JADX INFO: renamed from: d */
    public static final C0675r3 f7397d = new C0675r3(16);

    /* JADX INFO: renamed from: e */
    public static final long f7398e = p30.m3014x(4611686018427387903L);

    /* JADX INFO: renamed from: f */
    public static final long f7399f = p30.m3014x(-4611686018427387903L);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m5143a(long j, long j2) {
        long j3 = j2 / 1000000;
        long jM2996f = p30.m2996f(j, j3);
        if (-4611686018426L > jM2996f || jM2996f >= 4611686018427L) {
            return p30.m3014x(jM2996f);
        }
        long j4 = ((jM2996f * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = AbstractC0972yq.f7686a;
        return j4;
    }
}
