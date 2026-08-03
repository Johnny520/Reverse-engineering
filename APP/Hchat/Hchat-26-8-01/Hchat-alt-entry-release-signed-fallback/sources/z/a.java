package z;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22459a;

    public a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f22459a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof z.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            z.a r3 = (z.a) r3
            int r3 = r3.f22459a
            int r0 = r2.f22459a
            if (r0 != r3) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f22459a
            return r0
    }
}
