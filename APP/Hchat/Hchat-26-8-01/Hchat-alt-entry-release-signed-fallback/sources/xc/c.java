package xc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21535a;

    public c(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f21535a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof xc.c
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            xc.c r2 = (xc.c) r2
            java.lang.String r2 = r2.f21535a
            java.lang.String r0 = r1.f21535a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f21535a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f21535a
            return r0
    }
}
