package p000;

/* JADX INFO: renamed from: sd */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0794sd {

    /* JADX INFO: renamed from: α */
    public final long f9836;

    /* JADX INFO: renamed from: β */
    public final p000.ip1 f9837;

    /* JADX INFO: renamed from: γ */
    public final p000.ip1 f9838;

    /* JADX INFO: renamed from: δ */
    public final p000.ip1 f9839;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Integer f9840;

    /* JADX INFO: renamed from: ζ */
    public final p000.EnumC0831td f9841;

    /* JADX INFO: renamed from: η */
    public final java.util.Set f9842;

    public /* synthetic */ C0794sd(long r10) {
            r9 = this;
            td r7 = p000.EnumC0831td.f10317
            nz r8 = p000.C0604nz.f7825
            ip1 r3 = p000.ip1.f5162
            r6 = 0
            r4 = r3
            r5 = r3
            r0 = r9
            r1 = r10
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            return
    }

    public C0794sd(long r1, p000.ip1 r3, p000.ip1 r4, p000.ip1 r5, java.lang.Integer r6, p000.EnumC0831td r7, java.util.Set r8) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r7.getClass()
            r8.getClass()
            r0.<init>()
            r0.f9836 = r1
            r0.f9837 = r3
            r0.f9838 = r4
            r0.f9839 = r5
            r0.f9840 = r6
            r0.f9841 = r7
            r0.f9842 = r8
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.C0794sd m5468(p000.C0794sd r9, p000.ip1 r10, p000.ip1 r11, p000.ip1 r12) {
            long r1 = r9.f9836
            java.lang.Integer r6 = r9.f9840
            td r7 = r9.f9841
            java.util.Set r8 = r9.f9842
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r7.getClass()
            r8.getClass()
            sd r0 = new sd
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.C0794sd
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sd r8 = (p000.C0794sd) r8
            long r3 = r7.f9836
            long r5 = r8.f9836
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            ip1 r1 = r7.f9837
            ip1 r3 = r8.f9837
            if (r1 == r3) goto L1c
            return r2
        L1c:
            ip1 r1 = r7.f9838
            ip1 r3 = r8.f9838
            if (r1 == r3) goto L23
            return r2
        L23:
            ip1 r1 = r7.f9839
            ip1 r3 = r8.f9839
            if (r1 == r3) goto L2a
            return r2
        L2a:
            java.lang.Integer r1 = r7.f9840
            java.lang.Integer r3 = r8.f9840
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L35
            return r2
        L35:
            td r1 = r7.f9841
            td r3 = r8.f9841
            if (r1 == r3) goto L3c
            return r2
        L3c:
            java.util.Set r7 = r7.f9842
            java.util.Set r8 = r8.f9842
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 != 0) goto L47
            return r2
        L47:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f9836
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            ip1 r1 = r2.f9837
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            ip1 r0 = r2.f9838
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            ip1 r1 = r2.f9839
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Integer r0 = r2.f9840
            if (r0 != 0) goto L29
            r0 = 0
            goto L2d
        L29:
            int r0 = r0.hashCode()
        L2d:
            int r1 = r1 + r0
            int r1 = r1 * 31
            td r0 = r2.f9841
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.Set r2 = r2.f9842
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CampPersonRule(conversationShortId="
            r0.<init>(r1)
            long r1 = r3.f9836
            r0.append(r1)
            java.lang.String r1 = ", harvest="
            r0.append(r1)
            ip1 r1 = r3.f9837
            r0.append(r1)
            java.lang.String r1 = ", plant="
            r0.append(r1)
            ip1 r1 = r3.f9838
            r0.append(r1)
            java.lang.String r1 = ", water="
            r0.append(r1)
            ip1 r1 = r3.f9839
            r0.append(r1)
            java.lang.String r1 = ", seedId="
            r0.append(r1)
            java.lang.Integer r1 = r3.f9840
            r0.append(r1)
            java.lang.String r1 = ", seedMode="
            r0.append(r1)
            td r1 = r3.f9841
            r0.append(r1)
            java.lang.String r1 = ", excludedSeedIds="
            r0.append(r1)
            java.util.Set r3 = r3.f9842
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final p000.EnumC0831td m5469() {
            r3 = this;
            td r0 = r3.f9841
            td r1 = p000.EnumC0831td.f10318
            if (r0 != r1) goto L7
            return r1
        L7:
            java.lang.Integer r3 = r3.f9840
            td r1 = p000.EnumC0831td.f10319
            if (r0 != r1) goto L16
            if (r3 == 0) goto L16
            int r2 = r3.intValue()
            if (r2 <= 0) goto L16
            return r1
        L16:
            td r2 = p000.EnumC0831td.f10317
            if (r0 != r2) goto L23
            if (r3 == 0) goto L23
            int r3 = r3.intValue()
            if (r3 <= 0) goto L23
            return r1
        L23:
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final boolean m5470(p000.EnumC0619od r4, boolean r5) {
            r3 = this;
            r4.getClass()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L15
            r0 = 1
            if (r4 == r0) goto L16
            r0 = 2
            if (r4 != r0) goto L10
            goto L16
        L10:
            p000.C1080.m7272()
            r3 = 0
            return r3
        L15:
            r0 = 0
        L16:
            ip1 r4 = r3.f9837
            int r4 = p000.u81.m5803(r4)
            ip1 r1 = r3.f9838
            int r1 = p000.u81.m5803(r1)
            ip1 r3 = r3.f9839
            int r3 = p000.u81.m5803(r3)
            r2 = 6644(0x19f4, float:9.31E-42)
            int[] r3 = new int[]{r0, r4, r1, r3, r5}
            boolean r3 = com.example.dyhelper.core.protection.ProtectionNativeBridge.m1316(r2, r3)
            return r3
    }
}
