package h6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends h6.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h6.n f5134a;

    public m(h6.n r1) {
            r0 = this;
            r0.<init>()
            r0.f5134a = r1
            return
    }

    @Override // h6.n
    public final void b(o6.a r2, java.lang.Object r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r2.l()
            return
        L6:
            h6.n r0 = r1.f5134a
            r0.b(r2, r3)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NullSafeTypeAdapter["
            r0.<init>(r1)
            h6.n r1 = r2.f5134a
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
