package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h4.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i4.p f5085b;

    public i(i4.p r3) {
            r2 = this;
            java.lang.String r0 = "LineNumberTable"
            r2.<init>(r0)
            boolean r0 = r3.f22555g     // Catch: java.lang.NullPointerException -> L15
            if (r0 != 0) goto Lc
            r2.f5085b = r3
            return
        Lc:
            e4.a r3 = new e4.a     // Catch: java.lang.NullPointerException -> L15
            java.lang.String r0 = "lineNumbers.isMutable()"
            r1 = 0
            r3.<init>(r0, r1)     // Catch: java.lang.NullPointerException -> L15
            throw r3     // Catch: java.lang.NullPointerException -> L15
        L15:
            java.lang.String r3 = "lineNumbers == null"
            bsh.j.c(r3)
            r3 = 0
            throw r3
    }

    @Override // h4.s
    public final int a() {
            r1 = this;
            i4.p r0 = r1.f5085b
            java.lang.Object[] r0 = r0.f22543h
            int r0 = r0.length
            int r0 = r0 * 4
            int r0 = r0 + 8
            return r0
    }
}
