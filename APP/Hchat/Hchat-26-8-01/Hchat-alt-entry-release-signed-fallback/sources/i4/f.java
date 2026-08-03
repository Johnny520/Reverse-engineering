package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v4.d0 f6457d;

    public f(int r1, int r2, int r3, v4.d0 r4) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto L20
            if (r2 < r1) goto L19
            if (r3 < 0) goto L12
            r0.f6454a = r1
            r0.f6455b = r2
            r0.f6456c = r3
            r0.f6457d = r4
            return
        L12:
            java.lang.String r1 = "handlerPc < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L19:
            java.lang.String r1 = "endPc < startPc"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L20:
            java.lang.String r1 = "startPc < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }
}
