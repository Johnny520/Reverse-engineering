package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 {

    /* JADX INFO: renamed from: α */
    public final java.time.LocalDate f5411;

    /* JADX INFO: renamed from: β */
    public final long f5412;

    /* JADX INFO: renamed from: γ */
    public final long f5413;

    /* JADX INFO: renamed from: δ */
    public final int f5414;

    /* JADX INFO: renamed from: ε */
    public final int f5415;

    /* JADX INFO: renamed from: ζ */
    public final int f5416;

    /* JADX INFO: renamed from: η */
    public final int f5417;

    public /* synthetic */ jb1(java.time.LocalDate r11) {
            r10 = this;
            r8 = 0
            r9 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            return
    }

    public jb1(java.time.LocalDate r1, long r2, long r4, int r6, int r7, int r8, int r9) {
            r0 = this;
            r0.<init>()
            r0.f5411 = r1
            r0.f5412 = r2
            r0.f5413 = r4
            r0.f5414 = r6
            r0.f5415 = r7
            r0.f5416 = r8
            r0.f5417 = r9
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.jb1 m2926(p000.jb1 r10, java.time.LocalDate r11, long r12, long r14, int r16, int r17, int r18, int r19, int r20) {
            r0 = r20 & 1
            if (r0 == 0) goto L6
            java.time.LocalDate r11 = r10.f5411
        L6:
            r1 = r11
            r11 = r20 & 2
            if (r11 == 0) goto Ld
            long r12 = r10.f5412
        Ld:
            r2 = r12
            r11 = r20 & 4
            if (r11 == 0) goto L14
            long r14 = r10.f5413
        L14:
            r4 = r14
            r11 = r20 & 8
            if (r11 == 0) goto L1d
            int r11 = r10.f5414
            r6 = r11
            goto L1f
        L1d:
            r6 = r16
        L1f:
            r11 = r20 & 16
            if (r11 == 0) goto L27
            int r11 = r10.f5415
            r7 = r11
            goto L29
        L27:
            r7 = r17
        L29:
            r11 = r20 & 32
            if (r11 == 0) goto L31
            int r11 = r10.f5416
            r8 = r11
            goto L33
        L31:
            r8 = r18
        L33:
            r11 = r20 & 64
            if (r11 == 0) goto L3b
            int r11 = r10.f5417
            r9 = r11
            goto L3d
        L3b:
            r9 = r19
        L3d:
            r10.getClass()
            r1.getClass()
            jb1 r0 = new jb1
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.jb1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            jb1 r8 = (p000.jb1) r8
            java.time.LocalDate r1 = r7.f5411
            java.time.LocalDate r3 = r8.f5411
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f5412
            long r5 = r8.f5412
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            long r3 = r7.f5413
            long r5 = r8.f5413
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L29
            return r2
        L29:
            int r1 = r7.f5414
            int r3 = r8.f5414
            if (r1 == r3) goto L30
            return r2
        L30:
            int r1 = r7.f5415
            int r3 = r8.f5415
            if (r1 == r3) goto L37
            return r2
        L37:
            int r1 = r7.f5416
            int r3 = r8.f5416
            if (r1 == r3) goto L3e
            return r2
        L3e:
            int r7 = r7.f5417
            int r8 = r8.f5417
            if (r7 == r8) goto L45
            return r2
        L45:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.time.LocalDate r0 = r4.f5411
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f5412
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.f5413
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r2 = r4.f5414
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f5415
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f5416
            int r0 = p000.a12.m14(r2, r0, r1)
            int r4 = r4.f5417
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PetElfCampDailyStatistics(date="
            r0.<init>(r1)
            java.time.LocalDate r1 = r5.f5411
            r0.append(r1)
            java.lang.String r1 = ", coinIncome="
            r0.append(r1)
            long r1 = r5.f5412
            r0.append(r1)
            java.lang.String r1 = ", coinInvestment="
            java.lang.String r2 = ", plantCount="
            long r3 = r5.f5413
            p000.AbstractC0602nx.m4118(r0, r1, r3, r2)
            java.lang.String r1 = ", waterCount="
            java.lang.String r2 = ", unknownIncomeCount="
            int r3 = r5.f5414
            int r4 = r5.f5415
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            int r1 = r5.f5416
            r0.append(r1)
            java.lang.String r1 = ", unknownInvestmentCount="
            r0.append(r1)
            int r5 = r5.f5417
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
