package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o5.t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z5.b f7226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k5.k f7228m;

    public j(k5.k r1, androidx.lifecycle.x r2, int r3) {
            r0 = this;
            r0.f7228m = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // o5.t
    public final java.lang.Object a(a5.a r10) {
            r9 = this;
            k5.k r0 = r9.f7228m
            k5.o r4 = r0.f7234l
        L4:
            int r1 = r9.f7225j
            int r1 = r1 + 1
            r9.f7225j = r1
            int r2 = r4.f7253t
            if (r1 <= r2) goto L13
            r10 = 3
            r9.f9546g = r10
            r10 = 0
            return r10
        L13:
            java.util.Iterator r1 = r0.f7232j
            if (r1 == 0) goto L23
            java.lang.Object r1 = r1.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L21:
            r8 = r1
            goto L25
        L23:
            r1 = 7
            goto L21
        L25:
            k5.z r1 = new k5.z
            k5.u r2 = r4.f7243j
            int r5 = r9.f7227l
            o5.c r6 = r0.f7229g
            o5.c r7 = r0.f7230h
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            z5.b r10 = r9.f7226k
            z5.b r2 = z5.b.i1(r1)
            r9.f7226k = r2
            int r5 = r1.f7309q
            r9.f7227l = r5
            boolean r5 = r0.f7233k
            if (r5 == 0) goto L4d
            if (r10 == 0) goto L4d
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L4d
            r10 = r3
            goto L4
        L4d:
            return r1
    }
}
