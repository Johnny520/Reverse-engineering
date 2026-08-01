package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gb1 {

    /* JADX INFO: renamed from: α */
    public final long f4304;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4305;

    /* JADX INFO: renamed from: γ */
    public final long f4306;

    public gb1(long r1, java.lang.String r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.f4304 = r1
            r0.f4305 = r3
            r0.f4306 = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.gb1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gb1 r8 = (p000.gb1) r8
            long r3 = r7.f4304
            long r5 = r8.f4304
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.f4305
            java.lang.String r3 = r8.f4305
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            long r3 = r7.f4306
            long r7 = r8.f4306
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f4304
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r1 = r3.f4305
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r3.f4306
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BatchTarget(conversationShortId="
            r0.<init>(r1)
            long r1 = r3.f4304
            r0.append(r1)
            java.lang.String r1 = ", conversationId="
            r0.append(r1)
            java.lang.String r1 = r3.f4305
            r0.append(r1)
            java.lang.String r1 = ", otherUid="
            r0.append(r1)
            long r1 = r3.f4306
            r0.append(r1)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
