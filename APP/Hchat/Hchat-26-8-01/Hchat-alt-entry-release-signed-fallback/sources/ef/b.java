package ef;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b5.k f2752b;

    public b(int r1, b5.k r2) {
            r0 = this;
            r0.<init>()
            r0.f2751a = r1
            r0.f2752b = r2
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            b5.k r0 = r3.f2752b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "RawNamedValue{nameRef="
            r1.<init>(r2)
            int r2 = r3.f2751a
            r1.append(r2)
            java.lang.String r2 = ", rawValue="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
