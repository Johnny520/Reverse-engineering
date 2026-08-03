package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends o5.t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z5.a f7215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o5.c f7217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k5.i f7218n;

    public h(k5.i r1, androidx.lifecycle.x r2, int r3, o5.c r4) {
            r0 = this;
            r0.f7218n = r1
            r0.f7217m = r4
            r0.<init>(r2, r3)
            return
    }

    @Override // o5.t
    public final java.lang.Object a(a5.a r9) {
            r8 = this;
            k5.i r0 = r8.f7218n
            k5.o r4 = r0.f7224l
        L4:
            int r1 = r8.f7214j
            int r1 = r1 + 1
            r8.f7214j = r1
            int r2 = r4.f7251r
            if (r1 <= r2) goto L17
            int r9 = r9.f56h
            r4.f7248o = r9
            r9 = 3
            r8.f9546g = r9
            r9 = 0
            return r9
        L17:
            java.util.Iterator r1 = r0.f7222j
            if (r1 == 0) goto L27
            java.lang.Object r1 = r1.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L25:
            r7 = r1
            goto L29
        L27:
            r1 = 7
            goto L25
        L29:
            k5.w r1 = new k5.w
            k5.u r2 = r4.f7243j
            int r5 = r8.f7216l
            o5.c r6 = r8.f7217m
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            z5.a r9 = r8.f7215k
            z5.a r2 = z5.a.g1(r1)
            r8.f7215k = r2
            int r5 = r1.f7293o
            r8.f7216l = r5
            boolean r5 = r0.f7223k
            if (r5 == 0) goto L4f
            if (r9 == 0) goto L4f
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L4f
            r9 = r3
            goto L4
        L4f:
            return r1
    }
}
