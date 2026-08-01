package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class va1 {

    /* JADX INFO: renamed from: α */
    public final int f11199;

    /* JADX INFO: renamed from: β */
    public final int f11200;

    /* JADX INFO: renamed from: γ */
    public final int f11201;

    /* JADX INFO: renamed from: δ */
    public final int f11202;

    /* JADX INFO: renamed from: ε */
    public final int f11203;

    /* JADX INFO: renamed from: ζ */
    public final int f11204;

    /* JADX INFO: renamed from: η */
    public final int f11205;

    /* JADX INFO: renamed from: θ */
    public final int f11206;

    /* JADX INFO: renamed from: ι */
    public final java.lang.String f11207;

    public va1(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.f11199 = r1
            r0.f11200 = r2
            r0.f11201 = r3
            r0.f11202 = r4
            r0.f11203 = r5
            r0.f11204 = r6
            r0.f11205 = r7
            r0.f11206 = r8
            r0.f11207 = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4e
        L3:
            boolean r0 = r3 instanceof p000.va1
            if (r0 != 0) goto L8
            goto L4c
        L8:
            va1 r3 = (p000.va1) r3
            int r0 = r2.f11199
            int r1 = r3.f11199
            if (r0 == r1) goto L11
            goto L4c
        L11:
            int r0 = r2.f11200
            int r1 = r3.f11200
            if (r0 == r1) goto L18
            goto L4c
        L18:
            int r0 = r2.f11201
            int r1 = r3.f11201
            if (r0 == r1) goto L1f
            goto L4c
        L1f:
            int r0 = r2.f11202
            int r1 = r3.f11202
            if (r0 == r1) goto L26
            goto L4c
        L26:
            int r0 = r2.f11203
            int r1 = r3.f11203
            if (r0 == r1) goto L2d
            goto L4c
        L2d:
            int r0 = r2.f11204
            int r1 = r3.f11204
            if (r0 == r1) goto L34
            goto L4c
        L34:
            int r0 = r2.f11205
            int r1 = r3.f11205
            if (r0 == r1) goto L3b
            goto L4c
        L3b:
            int r0 = r2.f11206
            int r1 = r3.f11206
            if (r0 == r1) goto L42
            goto L4c
        L42:
            java.lang.String r2 = r2.f11207
            java.lang.String r3 = r3.f11207
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4e
        L4c:
            r2 = 0
            return r2
        L4e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f11199
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f11200
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f11201
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f11202
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f11203
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f11204
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f11205
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f11206
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f11207
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", handledConversations="
            java.lang.String r1 = ", fedConversations="
            java.lang.String r2 = "Summary(totalConversations="
            int r3 = r5.f11199
            int r4 = r5.f11200
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", disabledConversations="
            java.lang.String r2 = ", unavailableConversations="
            int r3 = r5.f11201
            int r4 = r5.f11202
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", priceBlockedConversations="
            java.lang.String r2 = ", skippedConversations="
            int r3 = r5.f11203
            int r4 = r5.f11204
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", failureCount="
            java.lang.String r2 = ", message="
            int r3 = r5.f11205
            int r4 = r5.f11206
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.f11207
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
