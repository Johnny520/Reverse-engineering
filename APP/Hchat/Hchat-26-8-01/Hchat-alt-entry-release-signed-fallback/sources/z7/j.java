package z7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends z7.k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l7.f f22609k;

    public j(java.util.Iterator r2, l7.f r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r1.f22609k = r3
            return
    }

    @Override // z7.k, java.util.function.Predicate
    public final boolean test(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L9
            l7.f r0 = r1.f22609k
            if (r2 != r0) goto L7
            goto L9
        L7:
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }
}
