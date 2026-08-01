package p082Q0;

/* JADX INFO: renamed from: Q0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1167a {

    /* JADX INFO: renamed from: a */
    public static final long f3817a = (((long) 1023) << 50) ^ (-1);

    /* JADX INFO: renamed from: b */
    public static final long f3818b = (-1) ^ (((long) 33554431) << 25);

    /* JADX INFO: renamed from: c */
    public static final long f3819c;

    static {
        long j5 = 33554431;
        f3819c = j5 | (((long) Math.min(0, 1023)) << 50) | (j5 << 25);
    }
}
