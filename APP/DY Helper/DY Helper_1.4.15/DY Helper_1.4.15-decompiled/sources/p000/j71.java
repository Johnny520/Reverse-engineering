package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j71 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f5344;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f5345;

    /* JADX INFO: renamed from: γ */
    public final boolean f5346;

    /* JADX INFO: renamed from: δ */
    public final int f5347;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f5348;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f5349;

    /* JADX INFO: renamed from: η */
    public final boolean f5350;

    /* JADX INFO: renamed from: θ */
    public final p000.p70 f5351;

    /* JADX INFO: renamed from: ι */
    public final p000.p70 f5352;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f5353;

    /* JADX INFO: renamed from: λ */
    public final boolean f5354;

    /* JADX INFO: renamed from: μ */
    public final boolean f5355;

    public j71(java.lang.String r5, java.lang.String r6, boolean r7, int r8, java.lang.String r9, java.lang.String r10, boolean r11, p000.p70 r12, p000.p70 r13, java.lang.String r14, int r15) {
            r4 = this;
            r0 = r15 & 4
            r1 = 1
            if (r0 == 0) goto L6
            r7 = r1
        L6:
            r0 = r15 & 64
            r2 = 0
            if (r0 == 0) goto Lc
            r11 = r2
        Lc:
            r0 = r15 & 256(0x100, float:3.59E-43)
            r3 = 0
            if (r0 == 0) goto L12
            r13 = r3
        L12:
            r0 = r15 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L17
            r14 = r3
        L17:
            r0 = r15 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            r15 = r15 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L23
            goto L24
        L23:
            r1 = r2
        L24:
            r9.getClass()
            r10.getClass()
            r4.<init>()
            r4.f5344 = r5
            r4.f5345 = r6
            r4.f5346 = r7
            r4.f5347 = r8
            r4.f5348 = r9
            r4.f5349 = r10
            r4.f5350 = r11
            r4.f5351 = r12
            r4.f5352 = r13
            r4.f5353 = r14
            r4.f5354 = r0
            r4.f5355 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L7e
        L4:
            boolean r0 = r3 instanceof p000.j71
            if (r0 != 0) goto La
            goto L7c
        La:
            j71 r3 = (p000.j71) r3
            java.lang.String r0 = r2.f5344
            java.lang.String r1 = r3.f5344
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L7c
        L18:
            java.lang.String r0 = r2.f5345
            java.lang.String r1 = r3.f5345
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L23
            goto L7c
        L23:
            boolean r0 = r2.f5346
            boolean r1 = r3.f5346
            if (r0 == r1) goto L2a
            goto L7c
        L2a:
            int r0 = r2.f5347
            int r1 = r3.f5347
            if (r0 == r1) goto L31
            goto L7c
        L31:
            java.lang.String r0 = r2.f5348
            java.lang.String r1 = r3.f5348
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L3c
            goto L7c
        L3c:
            java.lang.String r0 = r2.f5349
            java.lang.String r1 = r3.f5349
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L47
            goto L7c
        L47:
            boolean r0 = r2.f5350
            boolean r1 = r3.f5350
            if (r0 == r1) goto L4e
            goto L7c
        L4e:
            p70 r0 = r2.f5351
            p70 r1 = r3.f5351
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            goto L7c
        L59:
            p70 r0 = r2.f5352
            p70 r1 = r3.f5352
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L64
            goto L7c
        L64:
            java.lang.String r0 = r2.f5353
            java.lang.String r1 = r3.f5353
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L6f
            goto L7c
        L6f:
            boolean r0 = r2.f5354
            boolean r1 = r3.f5354
            if (r0 == r1) goto L76
            goto L7c
        L76:
            boolean r2 = r2.f5355
            boolean r3 = r3.f5355
            if (r2 == r3) goto L7e
        L7c:
            r2 = 0
            return r2
        L7e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f5344
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f5345
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r4.f5346
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r2 = r4.f5347
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r4.f5348
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f5349
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r4.f5350
            int r0 = p000.lz1.m3678(r0, r1, r2)
            p70 r2 = r4.f5351
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            p70 r3 = r4.f5352
            if (r3 != 0) goto L3c
            r3 = r0
            goto L40
        L3c:
            int r3 = r3.hashCode()
        L40:
            int r2 = r2 + r3
            int r2 = r2 * r1
            java.lang.String r3 = r4.f5353
            if (r3 != 0) goto L47
            goto L4b
        L47:
            int r0 = r3.hashCode()
        L4b:
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r4.f5354
            int r0 = p000.lz1.m3678(r2, r1, r0)
            boolean r4 = r4.f5355
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", subtitle="
            java.lang.String r1 = ", isPrimary="
            java.lang.String r2 = "ActionItem(title="
            java.lang.String r3 = r5.f5344
            java.lang.String r4 = r5.f5345
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            boolean r1 = r5.f5346
            r0.append(r1)
            java.lang.String r1 = ", iconRes="
            r0.append(r1)
            int r1 = r5.f5347
            r0.append(r1)
            java.lang.String r1 = ", iconBg="
            r0.append(r1)
            java.lang.String r1 = ", iconTint="
            java.lang.String r2 = ", locked="
            java.lang.String r3 = r5.f5348
            java.lang.String r4 = r5.f5349
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            boolean r1 = r5.f5350
            r0.append(r1)
            java.lang.String r1 = ", onClick="
            r0.append(r1)
            p70 r1 = r5.f5351
            r0.append(r1)
            java.lang.String r1 = ", onLongClick="
            r0.append(r1)
            p70 r1 = r5.f5352
            r0.append(r1)
            java.lang.String r1 = ", secondaryActionLabel="
            r0.append(r1)
            java.lang.String r1 = r5.f5353
            r0.append(r1)
            java.lang.String r1 = ", quickActionEligible="
            r0.append(r1)
            boolean r1 = r5.f5354
            r0.append(r1)
            java.lang.String r1 = ", sharePanelEligible="
            r0.append(r1)
            boolean r5 = r5.f5355
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
