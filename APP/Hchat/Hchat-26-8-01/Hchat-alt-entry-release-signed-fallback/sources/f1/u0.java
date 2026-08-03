package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f3122b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3123c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3124a;

    static {
            r0 = 1056964608(0x3f000000, float:0.5)
            long r0 = f1.c0.g(r0, r0)
            f1.u0.f3122b = r0
            return
    }

    public /* synthetic */ u0(long r1) {
            r0 = this;
            r0.<init>()
            r0.f3124a = r1
            return
    }

    public static final boolean a(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static java.lang.String b(long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TransformOrigin(packedValue="
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof f1.u0
            if (r0 != 0) goto L5
            goto Lf
        L5:
            f1.u0 r5 = (f1.u0) r5
            long r0 = r5.f3124a
            long r2 = r4.f3124a
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L11
        Lf:
            r5 = 0
            return r5
        L11:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f3124a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f3124a
            java.lang.String r0 = b(r0)
            return r0
    }
}
