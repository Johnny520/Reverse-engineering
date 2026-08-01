package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gh0 {

    /* JADX INFO: renamed from: α */
    public final boolean f4372;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4373;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f4374;

    public gh0(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f4372 = r3
            r0.f4373 = r1
            r0.f4374 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.gh0
            if (r0 != 0) goto L8
            goto L26
        L8:
            gh0 r3 = (p000.gh0) r3
            boolean r0 = r2.f4372
            boolean r1 = r3.f4372
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.String r0 = r2.f4373
            java.lang.String r1 = r3.f4373
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.String r2 = r2.f4374
            java.lang.String r3 = r3.f4374
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.f4372
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r1 = r2.f4373
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r2 = r2.f4374
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ActiveConversationStatus(ready="
            r0.<init>(r1)
            boolean r1 = r2.f4372
            r0.append(r1)
            java.lang.String r1 = ", conversationId="
            r0.append(r1)
            java.lang.String r1 = r2.f4373
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f4374
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }
}
