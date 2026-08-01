package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gc1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f4316;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4317;

    /* JADX INFO: renamed from: γ */
    public final int f4318;

    /* JADX INFO: renamed from: δ */
    public final int f4319;

    /* JADX INFO: renamed from: ε */
    public final int f4320;

    /* JADX INFO: renamed from: ζ */
    public final int f4321;

    /* JADX INFO: renamed from: η */
    public final int f4322;

    /* JADX INFO: renamed from: θ */
    public final int f4323;

    /* JADX INFO: renamed from: ι */
    public final boolean f4324;

    public /* synthetic */ gc1(int r11, int r12, int r13, java.lang.String r14) {
            r10 = this;
            r13 = r13 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L7
            r13 = 0
        L5:
            r9 = r13
            goto L9
        L7:
            r13 = 1
            goto L5
        L9:
            java.lang.String r1 = "正在刷新营地"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r10
            r3 = r11
            r4 = r12
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public gc1(java.lang.String r1, java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.f4316 = r1
            r0.f4317 = r2
            r0.f4318 = r3
            r0.f4319 = r4
            r0.f4320 = r5
            r0.f4321 = r6
            r0.f4322 = r7
            r0.f4323 = r8
            r0.f4324 = r9
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.gc1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            gc1 r5 = (p000.gc1) r5
            java.lang.String r1 = r4.f4316
            java.lang.String r3 = r5.f4316
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f4317
            java.lang.String r3 = r5.f4317
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.f4318
            int r3 = r5.f4318
            if (r1 == r3) goto L29
            return r2
        L29:
            int r1 = r4.f4319
            int r3 = r5.f4319
            if (r1 == r3) goto L30
            return r2
        L30:
            int r1 = r4.f4320
            int r3 = r5.f4320
            if (r1 == r3) goto L37
            return r2
        L37:
            int r1 = r4.f4321
            int r3 = r5.f4321
            if (r1 == r3) goto L3e
            return r2
        L3e:
            int r1 = r4.f4322
            int r3 = r5.f4322
            if (r1 == r3) goto L45
            return r2
        L45:
            int r1 = r4.f4323
            int r3 = r5.f4323
            if (r1 == r3) goto L4c
            return r2
        L4c:
            boolean r4 = r4.f4324
            boolean r5 = r5.f4324
            if (r4 == r5) goto L53
            return r2
        L53:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4316
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4317
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f4318
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f4319
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f4320
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f4321
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f4322
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f4323
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r3 = r3.f4324
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", detail="
            java.lang.String r1 = ", completedPeople="
            java.lang.String r2 = "TaskProgress(title="
            java.lang.String r3 = r5.f4316
            java.lang.String r4 = r5.f4317
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", totalPeople="
            java.lang.String r2 = ", processedOperations="
            int r3 = r5.f4318
            int r4 = r5.f4319
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", totalOperations="
            java.lang.String r2 = ", successfulOperations="
            int r3 = r5.f4320
            int r4 = r5.f4321
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", failedOperations="
            java.lang.String r2 = ", isIndeterminate="
            int r3 = r5.f4322
            int r4 = r5.f4323
            p000.AbstractC0602nx.m4117(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            boolean r5 = r5.f4324
            java.lang.String r5 = p000.lz1.m3693(r0, r5, r1)
            return r5
    }
}
