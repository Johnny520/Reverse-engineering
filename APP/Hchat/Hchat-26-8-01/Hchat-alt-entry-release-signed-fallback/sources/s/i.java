package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b5.c f12027c;

    public i(int r1, int r2, b5.c r3) {
            r0 = this;
            r0.<init>()
            r0.f12025a = r1
            r0.f12026b = r2
            r0.f12027c = r3
            if (r1 < 0) goto Lc
            goto L11
        Lc:
            java.lang.String r1 = "startIndex should be >= 0"
            o.b.a(r1)
        L11:
            if (r2 <= 0) goto L14
            return
        L14:
            java.lang.String r1 = "size should be > 0"
            o.b.a(r1)
            return
    }
}
