package l0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7654a;

    public b(int r1) {
            r0 = this;
            r0.<init>()
            r0.f7654a = r1
            return
    }

    public final boolean a() {
            r2 = this;
            int r0 = r2.f7654a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "{ location = "
            r0.append(r1)
            int r1 = r3.f7654a
            java.lang.String r2 = " }"
            java.lang.String r0 = j8.b.j(r0, r1, r2)
            return r0
    }
}
