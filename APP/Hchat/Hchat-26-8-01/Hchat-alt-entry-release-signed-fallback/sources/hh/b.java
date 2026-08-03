package hh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f1.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f5526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hh.d f5527i;

    public b(org.luckypray.dexkit.DexKitBridge r2, java.lang.String r3, hh.d r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0, r0)
            r1.f5526h = r3
            r1.f5527i = r4
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f5526h
            r0.append(r1)
            java.lang.String r1 = " = "
            r0.append(r1)
            hh.d r1 = r2.f5527i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
