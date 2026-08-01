package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ee1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Long f3522;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3523;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Long f3524;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f3525;

    /* JADX INFO: renamed from: ε */
    public final java.util.Set f3526;

    public /* synthetic */ ee1() {
            r6 = this;
            r1 = 0
            nz r5 = p000.C0604nz.f7825
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public ee1(java.lang.Long r1, java.lang.String r2, java.lang.Long r3, java.lang.String r4, java.util.Set r5) {
            r0 = this;
            r5.getClass()
            r0.<init>()
            r0.f3522 = r1
            r0.f3523 = r2
            r0.f3524 = r3
            r0.f3525 = r4
            r0.f3526 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.ee1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ee1 r5 = (p000.ee1) r5
            java.lang.Long r1 = r4.f3522
            java.lang.Long r3 = r5.f3522
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f3523
            java.lang.String r3 = r5.f3523
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.Long r1 = r4.f3524
            java.lang.Long r3 = r5.f3524
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f3525
            java.lang.String r3 = r5.f3525
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.util.Set r4 = r4.f3526
            java.util.Set r5 = r5.f3526
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Long r1 = r3.f3522
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.String r2 = r3.f3523
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Long r2 = r3.f3524
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r2 = r3.f3525
            if (r2 != 0) goto L2c
            goto L30
        L2c:
            int r0 = r2.hashCode()
        L30:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Set r3 = r3.f3526
            int r3 = r3.hashCode()
            int r3 = r3 + r1
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Hints(explicitConversationShortId="
            r0.<init>(r1)
            java.lang.Long r1 = r2.f3522
            r0.append(r1)
            java.lang.String r1 = ", conversationId="
            r0.append(r1)
            java.lang.String r1 = r2.f3523
            r0.append(r1)
            java.lang.String r1 = ", otherUid="
            r0.append(r1)
            java.lang.Long r1 = r2.f3524
            r0.append(r1)
            java.lang.String r1 = ", groupId="
            r0.append(r1)
            java.lang.String r1 = r2.f3525
            r0.append(r1)
            java.lang.String r1 = ", observedKeys="
            r0.append(r1)
            java.util.Set r2 = r2.f3526
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final boolean m1917() {
            r3 = this;
            java.util.Set r3 = r3.f3526
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L13
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            return r1
        L13:
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Set r2 = p000.he1.f4709
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L17
            r3 = 1
            return r3
        L2d:
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final p000.ee1 m1918(p000.ee1 r7) {
            r6 = this;
            r7.getClass()
            ee1 r0 = new ee1
            java.lang.Long r1 = r6.f3522
            if (r1 != 0) goto Lb
            java.lang.Long r1 = r7.f3522
        Lb:
            java.lang.String r2 = r6.f3523
            if (r2 != 0) goto L11
            java.lang.String r2 = r7.f3523
        L11:
            java.lang.Long r3 = r6.f3524
            if (r3 != 0) goto L17
            java.lang.Long r3 = r7.f3524
        L17:
            java.lang.String r4 = r6.f3525
            if (r4 != 0) goto L1d
            java.lang.String r4 = r7.f3525
        L1d:
            java.util.Set r7 = r7.f3526
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Set r6 = r6.f3526
            java.util.LinkedHashSet r5 = p000.g81.m2282(r6, r7)
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
