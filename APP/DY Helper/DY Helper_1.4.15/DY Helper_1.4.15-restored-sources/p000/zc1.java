package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zc1 {

    /* JADX INFO: renamed from: α */
    public final long f13036;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f13037;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Long f13038;

    /* JADX INFO: renamed from: δ */
    public final long f13039;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f13040;

    public zc1(long r1, java.lang.String r3, java.lang.Long r4, long r5, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.f13036 = r1
            r0.f13037 = r3
            r0.f13038 = r4
            r0.f13039 = r5
            r0.f13040 = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L3e
        L3:
            boolean r0 = r5 instanceof p000.zc1
            if (r0 != 0) goto L8
            goto L3c
        L8:
            zc1 r5 = (p000.zc1) r5
            long r0 = r4.f13036
            long r2 = r5.f13036
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L3c
        L13:
            java.lang.String r0 = r4.f13037
            java.lang.String r1 = r5.f13037
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1e
            goto L3c
        L1e:
            java.lang.Long r0 = r4.f13038
            java.lang.Long r1 = r5.f13038
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L29
            goto L3c
        L29:
            long r0 = r4.f13039
            long r2 = r5.f13039
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L32
            goto L3c
        L32:
            java.lang.String r4 = r4.f13040
            java.lang.String r5 = r5.f13040
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3e
        L3c:
            r4 = 0
            return r4
        L3e:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f13036
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.f13037
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r3 = r4.f13038
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r2 = r3.hashCode()
        L1f:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r4.f13039
            int r0 = p000.lz1.m3677(r0, r1, r2)
            java.lang.String r4 = r4.f13040
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WorldConversationContext(conversationShortId="
            r0.<init>(r1)
            long r1 = r3.f13036
            r0.append(r1)
            java.lang.String r1 = ", conversationId="
            r0.append(r1)
            java.lang.String r1 = r3.f13037
            r0.append(r1)
            java.lang.String r1 = ", otherUid="
            r0.append(r1)
            java.lang.Long r1 = r3.f13038
            r0.append(r1)
            java.lang.String r1 = ", capturedAt="
            r0.append(r1)
            long r1 = r3.f13039
            r0.append(r1)
            java.lang.String r1 = ", source="
            r0.append(r1)
            java.lang.String r3 = r3.f13040
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
