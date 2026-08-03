package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Float f5682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i.v f5683b;

    public h0(java.lang.Float r1, i.v r2) {
            r0 = this;
            r0.<init>()
            r0.f5682a = r1
            r0.f5683b = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof i.h0
            if (r1 != 0) goto L9
            goto L20
        L9:
            i.h0 r4 = (i.h0) r4
            java.lang.Float r1 = r4.f5682a
            java.lang.Float r2 = r3.f5682a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L20
            i.v r4 = r4.f5683b
            i.v r1 = r3.f5683b
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L20
            return r0
        L20:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Float r0 = r3.f5682a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = eh.a.e(r2, r0, r1)
            i.v r1 = r3.f5683b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
