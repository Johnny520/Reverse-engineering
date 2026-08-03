package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.m f21911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f.x f21912b;

    public f2(f2.q r5, f.k r6) {
            r4 = this;
            r4.<init>()
            f2.m r0 = r5.f3213d
            r4.f21911a = r0
            r0 = 4
            java.util.List r5 = f2.q.j(r0, r5)
            f.x r0 = new f.x
            int r1 = r5.size()
            r0.<init>(r1)
            r4.f21912b = r0
            int r0 = r5.size()
            r1 = 0
        L1c:
            if (r1 >= r0) goto L36
            java.lang.Object r2 = r5.get(r1)
            f2.q r2 = (f2.q) r2
            int r3 = r2.f3215f
            boolean r3 = r6.a(r3)
            if (r3 == 0) goto L33
            f.x r3 = r4.f21912b
            int r2 = r2.f3215f
            r3.a(r2)
        L33:
            int r1 = r1 + 1
            goto L1c
        L36:
            return
    }
}
