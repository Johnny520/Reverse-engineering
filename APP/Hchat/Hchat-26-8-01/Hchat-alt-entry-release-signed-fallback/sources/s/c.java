package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11987e;

    public static long a(long r4, long r6) {
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return r4
        L7:
            r0 = 4
            long r0 = (long) r0
            long r6 = r6 / r0
            r2 = 3
            long r2 = (long) r2
            long r6 = r6 * r2
            long r4 = r4 / r0
            long r4 = r4 + r6
            return r4
    }
}
