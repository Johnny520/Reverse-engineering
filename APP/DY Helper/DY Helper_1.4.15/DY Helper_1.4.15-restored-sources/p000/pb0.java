package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pb0 {

    /* JADX INFO: renamed from: α */
    public final long f8482;

    /* JADX INFO: renamed from: β */
    public final boolean f8483;

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList f8484;

    public pb0(long r1, boolean r3, java.util.ArrayList r4) {
            r0 = this;
            r0.<init>()
            r0.f8482 = r1
            r0.f8483 = r3
            r0.f8484 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L26
        L3:
            boolean r0 = r5 instanceof p000.pb0
            if (r0 != 0) goto L8
            goto L24
        L8:
            pb0 r5 = (p000.pb0) r5
            long r0 = r4.f8482
            long r2 = r5.f8482
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L24
        L13:
            boolean r0 = r4.f8483
            boolean r1 = r5.f8483
            if (r0 == r1) goto L1a
            goto L24
        L1a:
            java.util.ArrayList r4 = r4.f8484
            java.util.ArrayList r5 = r5.f8484
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L26
        L24:
            r4 = 0
            return r4
        L26:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f8482
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f8483
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.util.ArrayList r3 = r3.f8484
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QueryPage(nextCursor="
            r0.<init>(r1)
            long r1 = r3.f8482
            r0.append(r1)
            java.lang.String r1 = ", hasMore="
            r0.append(r1)
            boolean r1 = r3.f8483
            r0.append(r1)
            java.lang.String r1 = ", requests="
            r0.append(r1)
            java.util.ArrayList r3 = r3.f8484
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
