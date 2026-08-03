package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.t f10235b;

    public v(int r1, u4.t r2) {
            r0 = this;
            r0.<init>()
            if (r1 < 0) goto L13
            if (r2 == 0) goto Lc
            r0.f10234a = r1
            r0.f10235b = r2
            return
        Lc:
            java.lang.String r1 = "position == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L13:
            java.lang.String r1 = "address < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }
}
