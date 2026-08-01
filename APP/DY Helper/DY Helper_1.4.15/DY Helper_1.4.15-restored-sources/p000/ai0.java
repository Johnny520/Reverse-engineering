package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ai0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f254;

    /* JADX INFO: renamed from: β */
    public final boolean f255;

    /* JADX INFO: renamed from: γ */
    public final long f256;

    /* JADX INFO: renamed from: δ */
    public final boolean f257;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f258;

    public ai0(java.util.List r1, boolean r2, long r3, boolean r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f254 = r1
            r0.f255 = r2
            r0.f256 = r3
            r0.f257 = r5
            r0.f258 = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L38
        L3:
            boolean r0 = r5 instanceof p000.ai0
            if (r0 != 0) goto L8
            goto L36
        L8:
            ai0 r5 = (p000.ai0) r5
            java.lang.Object r0 = r4.f254
            java.lang.Object r1 = r5.f254
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L36
        L15:
            boolean r0 = r4.f255
            boolean r1 = r5.f255
            if (r0 == r1) goto L1c
            goto L36
        L1c:
            long r0 = r4.f256
            long r2 = r5.f256
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L25
            goto L36
        L25:
            boolean r0 = r4.f257
            boolean r1 = r5.f257
            if (r0 == r1) goto L2c
            goto L36
        L2c:
            java.lang.String r4 = r4.f258
            java.lang.String r5 = r5.f258
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L38
        L36:
            r4 = 0
            return r4
        L38:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.f254
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r4.f255
            int r0 = p000.lz1.m3678(r0, r1, r2)
            long r2 = r4.f256
            int r0 = p000.lz1.m3677(r0, r1, r2)
            boolean r2 = r4.f257
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r4 = r4.f258
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConversationPageResult(conversations="
            r0.<init>(r1)
            java.lang.Object r1 = r3.f254
            r0.append(r1)
            java.lang.String r1 = ", hasMore="
            r0.append(r1)
            boolean r1 = r3.f255
            r0.append(r1)
            java.lang.String r1 = ", nextCursor="
            r0.append(r1)
            long r1 = r3.f256
            r0.append(r1)
            java.lang.String r1 = ", callbackReceived="
            r0.append(r1)
            boolean r1 = r3.f257
            r0.append(r1)
            java.lang.String r1 = ", errorMessage="
            java.lang.String r2 = ")"
            java.lang.String r3 = r3.f258
            java.lang.String r3 = p000.AbstractC0602nx.m4133(r0, r1, r3, r2)
            return r3
    }
}
