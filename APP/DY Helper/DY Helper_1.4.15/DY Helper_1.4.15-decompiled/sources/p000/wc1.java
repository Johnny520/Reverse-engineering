package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wc1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f11676;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f11677;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f11678;

    /* JADX INFO: renamed from: δ */
    public final java.util.List f11679;

    /* JADX INFO: renamed from: ε */
    public final long f11680;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Integer f11681;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f11682;

    public wc1(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List r4, long r5, java.lang.Integer r7, java.lang.String r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f11676 = r1
            r0.f11677 = r2
            r0.f11678 = r3
            r0.f11679 = r4
            r0.f11680 = r5
            r0.f11681 = r7
            r0.f11682 = r8
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.wc1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wc1 r8 = (p000.wc1) r8
            java.lang.String r1 = r7.f11676
            java.lang.String r3 = r8.f11676
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f11677
            java.lang.String r3 = r8.f11677
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.f11678
            java.lang.String r3 = r8.f11678
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.List r1 = r7.f11679
            java.util.List r3 = r8.f11679
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            long r3 = r7.f11680
            long r5 = r8.f11680
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L41
            return r2
        L41:
            java.lang.Integer r1 = r7.f11681
            java.lang.Integer r3 = r8.f11681
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L4c
            return r2
        L4c:
            java.lang.String r7 = r7.f11682
            java.lang.String r8 = r8.f11682
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 != 0) goto L57
            return r2
        L57:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f11676
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f11677
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f11678
            int r0 = p000.a12.m15(r0, r1, r2)
            java.util.List r2 = r4.f11679
            int r0 = p000.a12.m16(r2, r0, r1)
            long r2 = r4.f11680
            int r0 = p000.lz1.m3677(r0, r1, r2)
            r2 = 0
            java.lang.Integer r3 = r4.f11681
            if (r3 != 0) goto L28
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r4 = r4.f11682
            if (r4 != 0) goto L33
            goto L37
        L33:
            int r2 = r4.hashCode()
        L37:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", method="
            java.lang.String r1 = ", parameterJson="
            java.lang.String r2 = "CapturedRequest(path="
            java.lang.String r3 = r5.f11676
            java.lang.String r4 = r5.f11677
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f11678
            r0.append(r1)
            java.lang.String r1 = ", headerNames="
            r0.append(r1)
            java.util.List r1 = r5.f11679
            r0.append(r1)
            java.lang.String r1 = ", capturedAt="
            r0.append(r1)
            long r1 = r5.f11680
            r0.append(r1)
            java.lang.String r1 = ", httpCode="
            r0.append(r1)
            java.lang.Integer r1 = r5.f11681
            r0.append(r1)
            java.lang.String r1 = ", responseJson="
            java.lang.String r2 = ")"
            java.lang.String r5 = r5.f11682
            java.lang.String r5 = p000.AbstractC0602nx.m4133(r0, r1, r5, r2)
            return r5
    }
}
