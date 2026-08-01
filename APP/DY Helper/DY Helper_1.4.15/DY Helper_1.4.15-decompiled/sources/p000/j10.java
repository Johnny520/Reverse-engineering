package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j10 {

    /* JADX INFO: renamed from: α */
    public final long f5289;

    /* JADX INFO: renamed from: β */
    public final long f5290;

    /* JADX INFO: renamed from: γ */
    public final float f5291;

    /* JADX INFO: renamed from: δ */
    public final float f5292;

    public j10(long r1, long r3, float r5, float r6) {
            r0 = this;
            r0.<init>()
            r0.f5289 = r1
            r0.f5290 = r3
            r0.f5291 = r5
            r0.f5292 = r6
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.j10
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j10 r8 = (p000.j10) r8
            long r3 = r7.f5289
            long r5 = r8.f5289
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.f5290
            long r5 = r8.f5290
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1e
            return r2
        L1e:
            float r1 = r7.f5291
            float r3 = r8.f5291
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L29
            return r2
        L29:
            float r7 = r7.f5292
            float r8 = r8.f5292
            int r7 = java.lang.Float.compare(r7, r8)
            if (r7 == 0) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f5289
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f5290
            int r0 = p000.lz1.m3677(r0, r1, r2)
            float r2 = r4.f5291
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r4 = r4.f5292
            int r4 = java.lang.Float.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FeedDoubleTapTouchSample(downTime="
            r0.<init>(r1)
            long r1 = r3.f5289
            r0.append(r1)
            java.lang.String r1 = ", eventTime="
            r0.append(r1)
            long r1 = r3.f5290
            r0.append(r1)
            java.lang.String r1 = ", rawX="
            r0.append(r1)
            float r1 = r3.f5291
            r0.append(r1)
            java.lang.String r1 = ", rawY="
            r0.append(r1)
            float r3 = r3.f5292
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
