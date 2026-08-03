package df;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2223b;

    public f(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f2222a = r1
            r0.f2223b = r2
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.util.StringJoiner r0 = new java.util.StringJoiner
            java.lang.Class<df.f> r1 = df.f.class
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = "["
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r2 = "]"
            java.lang.String r3 = ", "
            r0.<init>(r3, r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "idx="
            r1.<init>(r2)
            int r2 = r4.f2222a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.StringJoiner r0 = r0.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "offset="
            r1.<init>(r2)
            int r2 = r4.f2223b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.StringJoiner r0 = r0.add(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
