package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class uw0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f10970;

    /* JADX INFO: renamed from: β */
    public final long f10971;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f10972;

    /* JADX INFO: renamed from: δ */
    public final int f10973;

    public uw0(java.lang.String r1, long r2, java.lang.String r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f10970 = r1
            r0.f10971 = r2
            r0.f10972 = r4
            r0.f10973 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L31
        L3:
            boolean r0 = r5 instanceof p000.uw0
            if (r0 != 0) goto L8
            goto L2f
        L8:
            uw0 r5 = (p000.uw0) r5
            java.lang.String r0 = r4.f10970
            java.lang.String r1 = r5.f10970
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2f
        L15:
            long r0 = r4.f10971
            long r2 = r5.f10971
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L2f
        L1e:
            java.lang.String r0 = r4.f10972
            java.lang.String r1 = r5.f10972
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L2f
        L29:
            int r4 = r4.f10973
            int r5 = r5.f10973
            if (r4 == r5) goto L31
        L2f:
            r4 = 0
            return r4
        L31:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f10970
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f10971
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r2 = r4.f10972
            int r0 = p000.a12.m15(r0, r1, r2)
            int r4 = r4.f10973
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "ManagedGroup(conversationId="
            java.lang.String r1 = ", conversationShortId="
            java.lang.String r2 = r5.f10970
            long r3 = r5.f10971
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r0, r2, r3, r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r5.f10972
            r0.append(r1)
            java.lang.String r1 = ", currentUserRole="
            r0.append(r1)
            int r5 = r5.f10973
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
