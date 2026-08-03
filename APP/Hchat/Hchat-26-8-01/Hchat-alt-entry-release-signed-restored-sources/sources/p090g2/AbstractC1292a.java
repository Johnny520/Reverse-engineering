package p090g2;

/* JADX INFO: renamed from: g2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1292a {

    /* JADX INFO: renamed from: a */
    public static final long f4311a = (((long) 1023) << 50) ^ (-1);

    /* JADX INFO: renamed from: b */
    public static final long f4312b = (-1) ^ (((long) 33554431) << 25);

    /* JADX INFO: renamed from: c */
    public static final long f4313c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j3 = 33554431;
        f4313c = j3 | (((long) Math.min(0, 1023)) << 50) | (j3 << 25);
    }
}
