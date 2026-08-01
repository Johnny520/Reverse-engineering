package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ge1 {

    /* JADX INFO: renamed from: α */
    public final long f4345;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4346;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Long f4347;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f4348;

    public ge1(long r1, java.lang.String r3, java.lang.Long r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f4345 = r1
            r0.f4346 = r3
            r0.f4347 = r4
            r0.f4348 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L35
        L3:
            boolean r0 = r5 instanceof p000.ge1
            if (r0 != 0) goto L8
            goto L33
        L8:
            ge1 r5 = (p000.ge1) r5
            long r0 = r4.f4345
            long r2 = r5.f4345
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L33
        L13:
            java.lang.String r0 = r4.f4346
            java.lang.String r1 = r5.f4346
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1e
            goto L33
        L1e:
            java.lang.Long r0 = r4.f4347
            java.lang.Long r1 = r5.f4347
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L29
            goto L33
        L29:
            java.lang.String r4 = r4.f4348
            java.lang.String r5 = r5.f4348
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L35
        L33:
            r4 = 0
            return r4
        L35:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f4345
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            r1 = 0
            java.lang.String r2 = r3.f4346
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Long r2 = r3.f4347
            if (r2 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = r2.hashCode()
        L1f:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r3 = r3.f4348
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Resolution(conversationShortId="
            r0.<init>(r1)
            long r1 = r3.f4345
            r0.append(r1)
            java.lang.String r1 = ", conversationId="
            r0.append(r1)
            java.lang.String r1 = r3.f4346
            r0.append(r1)
            java.lang.String r1 = ", otherUid="
            r0.append(r1)
            java.lang.Long r1 = r3.f4347
            r0.append(r1)
            java.lang.String r1 = ", source="
            r0.append(r1)
            java.lang.String r3 = r3.f4348
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
