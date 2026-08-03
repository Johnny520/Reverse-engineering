package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h4.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.c f5072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5073c;

    public b(i4.c r4) {
            r3 = this;
            java.lang.String r0 = "BootstrapMethods"
            r3.<init>(r0)
            r3.f5072b = r4
            java.lang.Object[] r0 = r4.f22543h
            int r0 = r0.length
            int r0 = r0 * 4
            int r0 = r0 + 8
            r1 = 0
        Lf:
            java.lang.Object[] r2 = r4.f22543h
            int r2 = r2.length
            if (r1 >= r2) goto L25
            java.lang.Object r2 = r4.l(r1)
            i4.b r2 = (i4.b) r2
            h4.u r2 = r2.f6440a
            java.lang.Object[] r2 = r2.f22543h
            int r2 = r2.length
            int r2 = r2 * 2
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto Lf
        L25:
            r3.f5073c = r0
            return
    }

    @Override // h4.s
    public final int a() {
            r1 = this;
            int r0 = r1.f5073c
            return r0
    }
}
