package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fc1 {

    /* JADX INFO: renamed from: α */
    public final long f3872;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f3873;

    /* JADX INFO: renamed from: γ */
    public final int f3874;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f3875;

    /* JADX INFO: renamed from: ε */
    public final int f3876;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Integer f3877;

    /* JADX INFO: renamed from: η */
    public final java.lang.Integer f3878;

    /* JADX INFO: renamed from: θ */
    public final java.lang.Long f3879;

    /* JADX INFO: renamed from: ι */
    public final java.lang.Long f3880;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f3881;

    public fc1(long r1, java.lang.String r3, int r4, java.lang.String r5, int r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.Long r9, java.lang.Long r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.f3872 = r1
            r0.f3873 = r3
            r0.f3874 = r4
            r0.f3875 = r5
            r0.f3876 = r6
            r0.f3877 = r7
            r0.f3878 = r8
            r0.f3879 = r9
            r0.f3880 = r10
            r0.f3881 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L71
        L4:
            boolean r0 = r5 instanceof p000.fc1
            if (r0 != 0) goto La
            goto L6f
        La:
            fc1 r5 = (p000.fc1) r5
            long r0 = r4.f3872
            long r2 = r5.f3872
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L15
            goto L6f
        L15:
            java.lang.String r0 = r4.f3873
            java.lang.String r1 = r5.f3873
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L6f
        L20:
            int r0 = r4.f3874
            int r1 = r5.f3874
            if (r0 == r1) goto L27
            goto L6f
        L27:
            java.lang.String r0 = r4.f3875
            java.lang.String r1 = r5.f3875
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L6f
        L32:
            int r0 = r4.f3876
            int r1 = r5.f3876
            if (r0 == r1) goto L39
            goto L6f
        L39:
            java.lang.Integer r0 = r4.f3877
            java.lang.Integer r1 = r5.f3877
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L44
            goto L6f
        L44:
            java.lang.Integer r0 = r4.f3878
            java.lang.Integer r1 = r5.f3878
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L4f
            goto L6f
        L4f:
            java.lang.Long r0 = r4.f3879
            java.lang.Long r1 = r5.f3879
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L5a
            goto L6f
        L5a:
            java.lang.Long r0 = r4.f3880
            java.lang.Long r1 = r5.f3880
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L65
            goto L6f
        L65:
            java.lang.String r4 = r4.f3881
            java.lang.String r5 = r5.f3881
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L71
        L6f:
            r4 = 0
            return r4
        L71:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f3872
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f3873
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r4.f3874
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r4.f3875
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r4.f3876
            int r0 = p000.a12.m14(r2, r0, r1)
            r2 = 0
            java.lang.Integer r3 = r4.f3877
            if (r3 != 0) goto L28
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f3878
            if (r3 != 0) goto L34
            r3 = r2
            goto L38
        L34:
            int r3 = r3.hashCode()
        L38:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r3 = r4.f3879
            if (r3 != 0) goto L40
            r3 = r2
            goto L44
        L40:
            int r3 = r3.hashCode()
        L44:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r3 = r4.f3880
            if (r3 != 0) goto L4b
            goto L4f
        L4b:
            int r2 = r3.hashCode()
        L4f:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r4 = r4.f3881
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlantPreview(conversationShortId="
            r0.<init>(r1)
            long r1 = r3.f3872
            r0.append(r1)
            java.lang.String r1 = ", displayName="
            r0.append(r1)
            java.lang.String r1 = r3.f3873
            r0.append(r1)
            java.lang.String r1 = ", seedId="
            r0.append(r1)
            int r1 = r3.f3874
            r0.append(r1)
            java.lang.String r1 = ", seedName="
            r0.append(r1)
            java.lang.String r1 = r3.f3875
            r0.append(r1)
            java.lang.String r1 = ", plotCount="
            r0.append(r1)
            int r1 = r3.f3876
            r0.append(r1)
            java.lang.String r1 = ", unitCost="
            r0.append(r1)
            java.lang.Integer r1 = r3.f3877
            r0.append(r1)
            java.lang.String r1 = ", unitIncome="
            r0.append(r1)
            java.lang.Integer r1 = r3.f3878
            r0.append(r1)
            java.lang.String r1 = ", estimatedCost="
            r0.append(r1)
            java.lang.Long r1 = r3.f3879
            r0.append(r1)
            java.lang.String r1 = ", estimatedIncome="
            r0.append(r1)
            java.lang.Long r1 = r3.f3880
            r0.append(r1)
            java.lang.String r1 = ", source="
            r0.append(r1)
            java.lang.String r3 = r3.f3881
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
