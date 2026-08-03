package dg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends dg.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.io.File[] f2239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dg.h f2242f;

    public e(dg.h r1, java.io.File r2) {
            r0 = this;
            r2.getClass()
            r0.f2242f = r1
            r0.<init>(r2)
            return
    }

    @Override // dg.i
    public final java.io.File a() {
            r6 = this;
            boolean r0 = r6.f2241e
            r1 = 0
            r2 = 1
            java.io.File r3 = r6.f2250a
            if (r0 != 0) goto L2b
            java.io.File[] r0 = r6.f2239c
            if (r0 != 0) goto L2b
            dg.h r0 = r6.f2242f
            dg.j r0 = r0.f2249j
            fg.l r0 = r0.f2252b
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.invoke(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L21
            return r1
        L21:
            java.io.File[] r0 = r3.listFiles()
            r6.f2239c = r0
            if (r0 != 0) goto L2b
            r6.f2241e = r2
        L2b:
            java.io.File[] r0 = r6.f2239c
            if (r0 == 0) goto L40
            int r4 = r6.f2240d
            int r5 = r0.length
            if (r4 >= r5) goto L40
            r0.getClass()
            int r1 = r6.f2240d
            int r2 = r1 + 1
            r6.f2240d = r2
            r0 = r0[r1]
            return r0
        L40:
            boolean r0 = r6.f2238b
            if (r0 != 0) goto L47
            r6.f2238b = r2
            return r3
        L47:
            return r1
    }
}
