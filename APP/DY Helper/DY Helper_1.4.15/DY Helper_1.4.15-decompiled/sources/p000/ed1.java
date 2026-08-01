package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ed1 {

    /* JADX INFO: renamed from: α */
    public final long f3499;

    /* JADX INFO: renamed from: β */
    public final int f3500;

    /* JADX INFO: renamed from: γ */
    public final long f3501;

    /* JADX INFO: renamed from: δ */
    public final long f3502;

    public ed1(long r1, int r3, long r4, long r6) {
            r0 = this;
            r0.<init>()
            r0.f3499 = r1
            r0.f3500 = r3
            r0.f3501 = r4
            r0.f3502 = r6
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.ed1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ed1 r8 = (p000.ed1) r8
            long r3 = r7.f3499
            long r5 = r8.f3499
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            int r1 = r7.f3500
            int r3 = r8.f3500
            if (r1 == r3) goto L1c
            return r2
        L1c:
            long r3 = r7.f3501
            long r5 = r8.f3501
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L25
            return r2
        L25:
            long r3 = r7.f3502
            long r7 = r8.f3502
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L2e
            return r2
        L2e:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f3499
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f3500
            int r0 = p000.a12.m14(r2, r0, r1)
            long r2 = r4.f3501
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r1 = r4.f3502
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Rejection(conversationShortId="
            r0.<init>(r1)
            long r1 = r5.f3499
            r0.append(r1)
            java.lang.String r1 = ", seedId="
            r0.append(r1)
            int r1 = r5.f3500
            r0.append(r1)
            java.lang.String r1 = ", rejectedAtMillis="
            java.lang.String r2 = ", expiresAtMillis="
            long r3 = r5.f3501
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            long r1 = r5.f3502
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
