package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6477b;

    public o(int r1, int r2) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto L13
            if (r2 < 0) goto Lc
            r0.f6476a = r1
            r0.f6477b = r2
            return
        Lc:
            java.lang.String r1 = "lineNumber < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
        L13:
            java.lang.String r1 = "startPc < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }
}
