package g4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4.b f4290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g4.j f4291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u4.o f4293d;

    public h(g4.b r2, g4.j r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f4292c = r0
            r1.f4290a = r2
            r1.f4291b = r3
            return
    }

    public final u4.o a() {
            r1 = this;
            u4.o r0 = r1.f4293d
            if (r0 != 0) goto L14
            g4.b r0 = r1.f4290a
            r0.f()
            u4.o r0 = r1.f4293d
            if (r0 == 0) goto Le
            goto L14
        Le:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L14:
            u4.o r0 = r1.f4293d
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "v"
            r0.<init>(r1)
            int r1 = r2.f4292c
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            g4.j r1 = r2.f4291b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
