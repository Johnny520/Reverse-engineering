package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 implements i.e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f5660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f5661b;

    public f1(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f5660a = r1
            r0.f5661b = r2
            return
    }

    @Override // i.e1
    public final java.lang.Object b() {
            r1 = this;
            java.lang.Object r0 = r1.f5660a
            return r0
    }

    @Override // i.e1
    public final java.lang.Object c() {
            r1 = this;
            java.lang.Object r0 = r1.f5661b
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof i.e1
            if (r0 == 0) goto L20
            i.e1 r3 = (i.e1) r3
            java.lang.Object r0 = r3.b()
            java.lang.Object r1 = r2.f5660a
            boolean r0 = gg.l.a(r1, r0)
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.f5661b
            java.lang.Object r3 = r3.c()
            boolean r3 = gg.l.a(r0, r3)
            if (r3 == 0) goto L20
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.f5660a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            java.lang.Object r2 = r3.f5661b
            if (r2 == 0) goto L15
            int r0 = r2.hashCode()
        L15:
            int r1 = r1 + r0
            return r1
    }
}
