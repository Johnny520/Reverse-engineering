package dg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends dg.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.io.File[] f2245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg.h f2247e;

    public g(dg.h r1, java.io.File r2) {
            r0 = this;
            r2.getClass()
            r0.f2247e = r1
            r0.<init>(r2)
            return
    }

    @Override // dg.i
    public final java.io.File a() {
            r5 = this;
            boolean r0 = r5.f2244b
            r1 = 0
            java.io.File r2 = r5.f2250a
            if (r0 != 0) goto L20
            dg.h r0 = r5.f2247e
            dg.j r0 = r0.f2249j
            fg.l r0 = r0.f2252b
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1c
            return r1
        L1c:
            r0 = 1
            r5.f2244b = r0
            return r2
        L20:
            java.io.File[] r0 = r5.f2245c
            if (r0 == 0) goto L2b
            int r3 = r5.f2246d
            int r4 = r0.length
            if (r3 >= r4) goto L2a
            goto L2b
        L2a:
            return r1
        L2b:
            if (r0 != 0) goto L39
            java.io.File[] r0 = r2.listFiles()
            r5.f2245c = r0
            if (r0 == 0) goto L38
            int r0 = r0.length
            if (r0 != 0) goto L39
        L38:
            return r1
        L39:
            java.io.File[] r0 = r5.f2245c
            r0.getClass()
            int r1 = r5.f2246d
            int r2 = r1 + 1
            r5.f2246d = r2
            r0 = r0[r1]
            return r0
    }
}
