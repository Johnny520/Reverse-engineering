package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.u f5002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.u f5003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5004c;

    public v(h0.u r1, h0.u r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f5002a = r1
            r0.f5003b = r2
            r0.f5004c = r3
            return
    }

    public static h0.v a(h0.v r1, h0.u r2, h0.u r3, boolean r4, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            h0.u r2 = r1.f5002a
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            h0.u r3 = r1.f5003b
        Lc:
            r1.getClass()
            h0.v r1 = new h0.v
            r1.<init>(r2, r3, r4)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof h0.v
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h0.v r5 = (h0.v) r5
            h0.u r1 = r4.f5002a
            h0.u r3 = r5.f5002a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            h0.u r1 = r4.f5003b
            h0.u r3 = r5.f5003b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.f5004c
            boolean r5 = r5.f5004c
            if (r1 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            h0.u r0 = r2.f5002a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            h0.u r1 = r2.f5003b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r2.f5004c
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Selection(start="
            r0.<init>(r1)
            h0.u r1 = r2.f5002a
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            h0.u r1 = r2.f5003b
            r0.append(r1)
            java.lang.String r1 = ", handlesCrossed="
            r0.append(r1)
            boolean r1 = r2.f5004c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
