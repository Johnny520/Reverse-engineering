package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dc1 {

    /* JADX INFO: renamed from: α */
    public final int f3076;

    /* JADX INFO: renamed from: β */
    public final int f3077;

    /* JADX INFO: renamed from: γ */
    public final int f3078;

    /* JADX INFO: renamed from: δ */
    public final int f3079;

    /* JADX INFO: renamed from: ε */
    public final int f3080;

    /* JADX INFO: renamed from: ζ */
    public final int f3081;

    /* JADX INFO: renamed from: η */
    public final int f3082;

    /* JADX INFO: renamed from: θ */
    public final boolean f3083;

    /* JADX INFO: renamed from: ι */
    public final boolean f3084;

    public dc1(int r3, int r4, int r5, int r6, int r7, int r8, int r9, boolean r10, int r11) {
            r2 = this;
            r0 = r11 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r0 = r11 & 8
            if (r0 == 0) goto Lb
            r6 = r1
        Lb:
            r0 = r11 & 16
            if (r0 == 0) goto L10
            r7 = r1
        L10:
            r0 = r11 & 32
            if (r0 == 0) goto L15
            r8 = r1
        L15:
            r0 = r11 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L1a
            r10 = r1
        L1a:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L1f
            goto L20
        L1f:
            r1 = 1
        L20:
            r2.<init>()
            r2.f3076 = r3
            r2.f3077 = r4
            r2.f3078 = r5
            r2.f3079 = r6
            r2.f3080 = r7
            r2.f3081 = r8
            r2.f3082 = r9
            r2.f3083 = r10
            r2.f3084 = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.dc1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            dc1 r5 = (p000.dc1) r5
            int r1 = r4.f3076
            int r3 = r5.f3076
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f3077
            int r3 = r5.f3077
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.f3078
            int r3 = r5.f3078
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r4.f3079
            int r3 = r5.f3079
            if (r1 == r3) goto L28
            return r2
        L28:
            int r1 = r4.f3080
            int r3 = r5.f3080
            if (r1 == r3) goto L2f
            return r2
        L2f:
            int r1 = r4.f3081
            int r3 = r5.f3081
            if (r1 == r3) goto L36
            return r2
        L36:
            int r1 = r4.f3082
            int r3 = r5.f3082
            if (r1 == r3) goto L3d
            return r2
        L3d:
            boolean r1 = r4.f3083
            boolean r3 = r5.f3083
            if (r1 == r3) goto L44
            return r2
        L44:
            boolean r4 = r4.f3084
            boolean r5 = r5.f3084
            if (r4 == r5) goto L4b
            return r2
        L4b:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f3076
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f3077
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f3078
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f3079
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f3080
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f3081
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f3082
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r3.f3083
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f3084
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", plots="
            java.lang.String r1 = ", harvested="
            java.lang.String r2 = "BatchSummary(people="
            int r3 = r5.f3076
            int r4 = r5.f3077
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", planted="
            java.lang.String r2 = ", watered="
            int r3 = r5.f3078
            int r4 = r5.f3079
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", skipped="
            java.lang.String r2 = ", failures="
            int r3 = r5.f3080
            int r4 = r5.f3081
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            int r1 = r5.f3082
            r0.append(r1)
            java.lang.String r1 = ", cancelled="
            r0.append(r1)
            boolean r1 = r5.f3083
            r0.append(r1)
            java.lang.String r1 = ", rejectedAsBusy="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r5 = r5.f3084
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.String m1696() {
            r6 = this;
            boolean r0 = r6.f3084
            if (r0 == 0) goto L7
            java.lang.String r6 = "已有营地写任务正在执行，本次未重复启动"
            return r6
        L7:
            boolean r0 = r6.f3083
            if (r0 == 0) goto Le
            java.lang.String r0 = "，已取消"
            goto L10
        Le:
            java.lang.String r0 = ""
        L10:
            java.lang.String r1 = "，地块 "
            java.lang.String r2 = "，收菜 "
            java.lang.String r3 = "人员 "
            int r4 = r6.f3076
            int r5 = r6.f3077
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4136(r3, r4, r1, r5, r2)
            java.lang.String r2 = "，种地 "
            java.lang.String r3 = "，浇水 "
            int r4 = r6.f3078
            int r5 = r6.f3079
            p000.AbstractC0602nx.m4117(r1, r4, r2, r5, r3)
            java.lang.String r2 = "，跳过 "
            java.lang.String r3 = "，失败 "
            int r4 = r6.f3080
            int r5 = r6.f3081
            p000.AbstractC0602nx.m4117(r1, r4, r2, r5, r3)
            int r6 = r6.f3082
            java.lang.String r6 = p000.AbstractC0602nx.m4131(r1, r6, r0)
            return r6
    }
}
