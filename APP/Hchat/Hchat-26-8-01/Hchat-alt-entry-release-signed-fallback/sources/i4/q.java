package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v4.c0 f6481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v4.c0 f6482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v4.c0 f6483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6484f;

    public q(int r1, int r2, v4.c0 r3, v4.c0 r4, v4.c0 r5, int r6) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto L39
            if (r2 < 0) goto L32
            if (r3 == 0) goto L2b
            if (r4 != 0) goto L15
            if (r5 == 0) goto Le
            goto L15
        Le:
            java.lang.String r1 = "(descriptor == null) && (signature == null)"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L15:
            if (r6 < 0) goto L24
            r0.f6479a = r1
            r0.f6480b = r2
            r0.f6481c = r3
            r0.f6482d = r4
            r0.f6483e = r5
            r0.f6484f = r6
            return
        L24:
            java.lang.String r1 = "index < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L2b:
            java.lang.String r1 = "name == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L32:
            java.lang.String r1 = "length < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L39:
            java.lang.String r1 = "startPc < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }
}
