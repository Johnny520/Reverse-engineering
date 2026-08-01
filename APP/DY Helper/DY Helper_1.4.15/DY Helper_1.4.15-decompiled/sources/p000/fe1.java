package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fe1 {

    /* JADX INFO: renamed from: α */
    public final long f3912;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3913;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Long f3914;

    public fe1(long r1, java.lang.String r3, java.lang.Long r4) {
            r0 = this;
            r0.<init>()
            r0.f3912 = r1
            r0.f3913 = r3
            r0.f3914 = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.fe1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fe1 r8 = (p000.fe1) r8
            long r3 = r7.f3912
            long r5 = r8.f3912
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.f3913
            java.lang.String r3 = r8.f3913
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.lang.Long r7 = r7.f3914
            java.lang.Long r8 = r8.f3914
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 != 0) goto L2b
            return r2
        L2b:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f3912
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            r1 = 0
            java.lang.String r2 = r3.f3913
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Long r3 = r3.f3914
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r3.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "KnownConversation(conversationShortId="
            r0.<init>(r1)
            long r1 = r3.f3912
            r0.append(r1)
            java.lang.String r1 = ", conversationId="
            r0.append(r1)
            java.lang.String r1 = r3.f3913
            r0.append(r1)
            java.lang.String r1 = ", otherUid="
            r0.append(r1)
            java.lang.Long r3 = r3.f3914
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
