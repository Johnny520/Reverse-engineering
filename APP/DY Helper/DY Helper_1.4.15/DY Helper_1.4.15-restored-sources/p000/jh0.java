package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jh0 {

    /* JADX INFO: renamed from: α */
    public final p000.kh0 f5466;

    /* JADX INFO: renamed from: β */
    public final int f5467;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Long f5468;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Long f5469;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f5470;

    /* JADX INFO: renamed from: ζ */
    public final int f5471;

    /* JADX INFO: renamed from: η */
    public final int f5472;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f5473;

    public /* synthetic */ jh0(p000.kh0 r10, int r11, java.lang.Long r12, java.lang.Long r13, int r14, java.lang.String r15, int r16) {
            r9 = this;
            r0 = r16 & 64
            if (r0 == 0) goto L5
            r14 = 0
        L5:
            r7 = r14
            r5 = 0
            r6 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public jh0(p000.kh0 r1, int r2, java.lang.Long r3, java.lang.Long r4, java.lang.String r5, int r6, int r7, java.lang.String r8) {
            r0 = this;
            r0.<init>()
            r0.f5466 = r1
            r0.f5467 = r2
            r0.f5468 = r3
            r0.f5469 = r4
            r0.f5470 = r5
            r0.f5471 = r6
            r0.f5472 = r7
            r0.f5473 = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.jh0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            jh0 r5 = (p000.jh0) r5
            kh0 r1 = r4.f5466
            kh0 r3 = r5.f5466
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f5467
            int r3 = r5.f5467
            if (r1 == r3) goto L1a
            return r2
        L1a:
            java.lang.Long r1 = r4.f5468
            java.lang.Long r3 = r5.f5468
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L25
            return r2
        L25:
            java.lang.Long r1 = r4.f5469
            java.lang.Long r3 = r5.f5469
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            java.lang.String r1 = r4.f5470
            java.lang.String r3 = r5.f5470
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L3b
            return r2
        L3b:
            int r1 = r4.f5471
            int r3 = r5.f5471
            if (r1 == r3) goto L42
            return r2
        L42:
            int r1 = r4.f5472
            int r3 = r5.f5472
            if (r1 == r3) goto L49
            return r2
        L49:
            java.lang.String r4 = r4.f5473
            java.lang.String r5 = r5.f5473
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L54
            return r2
        L54:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            kh0 r0 = r4.f5466
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f5467
            int r0 = p000.a12.m14(r2, r0, r1)
            r2 = 0
            java.lang.Long r3 = r4.f5468
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Long r3 = r4.f5469
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f5470
            if (r3 != 0) goto L2d
            goto L31
        L2d:
            int r2 = r3.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r4.f5471
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f5472
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r4 = r4.f5473
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExportProgress(stage="
            r0.<init>(r1)
            kh0 r1 = r2.f5466
            r0.append(r1)
            java.lang.String r1 = ", loadedMessageCount="
            r0.append(r1)
            int r1 = r2.f5467
            r0.append(r1)
            java.lang.String r1 = ", earliestTimeMs="
            r0.append(r1)
            java.lang.Long r1 = r2.f5468
            r0.append(r1)
            java.lang.String r1 = ", latestTimeMs="
            r0.append(r1)
            java.lang.Long r1 = r2.f5469
            r0.append(r1)
            java.lang.String r1 = ", currentMonthLabel="
            r0.append(r1)
            java.lang.String r1 = r2.f5470
            r0.append(r1)
            java.lang.String r1 = ", completedMonths="
            r0.append(r1)
            int r1 = r2.f5471
            r0.append(r1)
            java.lang.String r1 = ", totalMonths="
            r0.append(r1)
            int r1 = r2.f5472
            r0.append(r1)
            java.lang.String r1 = ", note="
            r0.append(r1)
            java.lang.String r2 = r2.f5473
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
