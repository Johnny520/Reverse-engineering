package z5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f22556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f22557k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f22558l;

    public a(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f22556j = r1
            r0.f22557k = r2
            r0.f22558l = r3
            return
    }

    public static z5.a g1(i5.a r3) {
            boolean r0 = r3 instanceof z5.a
            if (r0 == 0) goto L7
            z5.a r3 = (z5.a) r3
            return r3
        L7:
            z5.a r0 = new z5.a
            java.lang.String r1 = r3.f1()
            java.lang.String r2 = r3.getName()
            java.lang.String r3 = r3.getType()
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // i5.a
    public final java.lang.String f1() {
            r1 = this;
            java.lang.String r0 = r1.f22556j
            return r0
    }

    @Override // i5.a
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f22557k
            return r0
    }

    @Override // i5.a
    public final java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.f22558l
            return r0
    }
}
