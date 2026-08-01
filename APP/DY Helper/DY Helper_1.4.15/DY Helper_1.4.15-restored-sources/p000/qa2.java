package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qa2 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f8943;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f8944;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f8945;

    /* JADX INFO: renamed from: δ */
    public final long f8946;

    public qa2(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.f8943 = r1
            r0.f8944 = r2
            r0.f8945 = r3
            r0.f8946 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof p000.qa2
            if (r0 != 0) goto L8
            goto L33
        L8:
            qa2 r3 = (p000.qa2) r3
            java.lang.String r0 = r2.f8943
            java.lang.String r1 = r3.f8943
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L33
        L15:
            java.lang.String r0 = r2.f8944
            java.lang.String r1 = r3.f8944
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L33
        L20:
            java.lang.String r0 = r2.f8945
            java.lang.String r1 = r3.f8945
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L33
        L2b:
            long r0 = r2.f8946
            long r2 = r3.f8946
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L35
        L33:
            r2 = 0
            return r2
        L35:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f8943
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f8944
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f8945
            int r0 = p000.a12.m15(r0, r1, r2)
            long r1 = r3.f8946
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", uri="
            java.lang.String r2 = "AudioItem(id="
            java.lang.String r3 = r5.f8943
            java.lang.String r4 = r5.f8944
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f8945
            r0.append(r1)
            java.lang.String r1 = ", durationMs="
            r0.append(r1)
            long r1 = r5.f8946
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
