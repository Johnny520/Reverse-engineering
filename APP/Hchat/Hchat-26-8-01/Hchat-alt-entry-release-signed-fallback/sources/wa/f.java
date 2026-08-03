package wa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f14911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f14912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f14913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14914f;

    public f(java.lang.String r1, int r2, java.lang.Object r3, java.lang.Object r4, byte[] r5) {
            r0 = this;
            r0.<init>()
            r0.f14909a = r1
            r0.f14910b = r2
            r0.f14911c = r3
            r0.f14912d = r4
            r0.f14913e = r5
            long r1 = java.lang.System.currentTimeMillis()
            r0.f14914f = r1
            return
    }

    public final java.lang.String a() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.f14910b
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            java.lang.String r2 = r3.f14909a
            r0.append(r2)
            r0.append(r1)
            long r1 = r3.f14914f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
