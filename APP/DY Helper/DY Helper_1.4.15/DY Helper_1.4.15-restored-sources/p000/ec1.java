package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ec1 {

    /* JADX INFO: renamed from: α */
    public final long f3481;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3482;

    /* JADX INFO: renamed from: γ */
    public final long f3483;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f3484;

    /* JADX INFO: renamed from: ε */
    public final p000.C0794sd f3485;

    /* JADX INFO: renamed from: ζ */
    public final p000.C0794sd f3486;

    /* JADX INFO: renamed from: η */
    public final p000.C0392id f3487;

    public ec1(long r1, java.lang.String r3, long r4, java.lang.String r6, p000.C0794sd r7, p000.C0794sd r8, p000.C0392id r9) {
            r0 = this;
            r0.<init>()
            r0.f3481 = r1
            r0.f3482 = r3
            r0.f3483 = r4
            r0.f3484 = r6
            r0.f3485 = r7
            r0.f3486 = r8
            r0.f3487 = r9
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L54
        L3:
            boolean r0 = r5 instanceof p000.ec1
            if (r0 != 0) goto L8
            goto L52
        L8:
            ec1 r5 = (p000.ec1) r5
            long r0 = r4.f3481
            long r2 = r5.f3481
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L52
        L13:
            java.lang.String r0 = r4.f3482
            java.lang.String r1 = r5.f3482
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1e
            goto L52
        L1e:
            long r0 = r4.f3483
            long r2 = r5.f3483
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L27
            goto L52
        L27:
            java.lang.String r0 = r4.f3484
            java.lang.String r1 = r5.f3484
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L52
        L32:
            sd r0 = r4.f3485
            sd r1 = r5.f3485
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L52
        L3d:
            sd r0 = r4.f3486
            sd r1 = r5.f3486
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L52
        L48:
            id r4 = r4.f3487
            id r5 = r5.f3487
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L54
        L52:
            r4 = 0
            return r4
        L54:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.f3481
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r5.f3482
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            long r3 = r5.f3483
            int r0 = p000.lz1.m3677(r0, r1, r3)
            java.lang.String r3 = r5.f3484
            int r0 = p000.a12.m15(r0, r1, r3)
            sd r3 = r5.f3485
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * r1
            sd r0 = r5.f3486
            int r0 = r0.hashCode()
            int r0 = r0 + r3
            int r0 = r0 * r1
            id r5 = r5.f3487
            if (r5 != 0) goto L37
            goto L3b
        L37:
            int r2 = r5.hashCode()
        L3b:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Person(conversationShortId="
            r0.<init>(r1)
            long r1 = r5.f3481
            r0.append(r1)
            java.lang.String r1 = ", conversationId="
            r0.append(r1)
            java.lang.String r1 = r5.f3482
            r0.append(r1)
            java.lang.String r1 = ", otherUid="
            java.lang.String r2 = ", displayName="
            long r3 = r5.f3483
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            java.lang.String r1 = r5.f3484
            r0.append(r1)
            java.lang.String r1 = ", storedRule="
            r0.append(r1)
            sd r1 = r5.f3485
            r0.append(r1)
            java.lang.String r1 = ", rule="
            r0.append(r1)
            sd r1 = r5.f3486
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            id r5 = r5.f3487
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final long m1898() {
            r2 = this;
            long r0 = r2.f3481
            return r0
    }
}
