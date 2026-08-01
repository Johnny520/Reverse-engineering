package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class my1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7323;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f7324;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7325;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Boolean f7326;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Boolean f7327;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Boolean f7328;

    /* JADX INFO: renamed from: η */
    public final java.lang.Boolean f7329;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f7330;

    public /* synthetic */ my1(int r11, java.lang.String r12, java.lang.String r13) {
            r10 = this;
            r0 = r11 & 1
            java.lang.String r4 = ""
            if (r0 == 0) goto L8
            r2 = r4
            goto L9
        L8:
            r2 = r12
        L9:
            r11 = r11 & 2
            if (r11 == 0) goto Lf
            r3 = r4
            goto L10
        Lf:
            r3 = r13
        L10:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r4
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public my1(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.Boolean r4, java.lang.Boolean r5, java.lang.Boolean r6, java.lang.Boolean r7, java.lang.String r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f7323 = r1
            r0.f7324 = r2
            r0.f7325 = r3
            r0.f7326 = r4
            r0.f7327 = r5
            r0.f7328 = r6
            r0.f7329 = r7
            r0.f7330 = r8
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.my1 m3911(p000.my1 r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Boolean r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Boolean r16, java.lang.String r17, int r18) {
            r0 = r18
            r1 = r0 & 1
            if (r1 == 0) goto L8
            java.lang.String r10 = r9.f7323
        L8:
            r1 = r10
            r10 = r0 & 2
            if (r10 == 0) goto Lf
            java.lang.String r11 = r9.f7324
        Lf:
            r2 = r11
            r10 = r0 & 4
            if (r10 == 0) goto L16
            java.lang.String r12 = r9.f7325
        L16:
            r3 = r12
            r10 = r0 & 8
            if (r10 == 0) goto L1d
            java.lang.Boolean r13 = r9.f7326
        L1d:
            r4 = r13
            r10 = r0 & 16
            if (r10 == 0) goto L24
            java.lang.Boolean r14 = r9.f7327
        L24:
            r5 = r14
            r10 = r0 & 32
            if (r10 == 0) goto L2b
            java.lang.Boolean r15 = r9.f7328
        L2b:
            r6 = r15
            r10 = r0 & 64
            if (r10 == 0) goto L34
            java.lang.Boolean r10 = r9.f7329
            r7 = r10
            goto L36
        L34:
            r7 = r16
        L36:
            r10 = r0 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L3e
            java.lang.String r9 = r9.f7330
            r8 = r9
            goto L40
        L3e:
            r8 = r17
        L40:
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r8.getClass()
            my1 r0 = new my1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.my1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            my1 r5 = (p000.my1) r5
            java.lang.String r1 = r4.f7323
            java.lang.String r3 = r5.f7323
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f7324
            java.lang.String r3 = r5.f7324
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f7325
            java.lang.String r3 = r5.f7325
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Boolean r1 = r4.f7326
            java.lang.Boolean r3 = r5.f7326
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Boolean r1 = r4.f7327
            java.lang.Boolean r3 = r5.f7327
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.Boolean r1 = r4.f7328
            java.lang.Boolean r3 = r5.f7328
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.Boolean r1 = r4.f7329
            java.lang.Boolean r3 = r5.f7329
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r4 = r4.f7330
            java.lang.String r5 = r5.f7330
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L64
            return r2
        L64:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f7323
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f7324
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f7325
            int r0 = p000.a12.m15(r0, r1, r2)
            r2 = 0
            java.lang.Boolean r3 = r4.f7326
            if (r3 != 0) goto L1c
            r3 = r2
            goto L20
        L1c:
            int r3 = r3.hashCode()
        L20:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Boolean r3 = r4.f7327
            if (r3 != 0) goto L28
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Boolean r3 = r4.f7328
            if (r3 != 0) goto L34
            r3 = r2
            goto L38
        L34:
            int r3 = r3.hashCode()
        L38:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Boolean r3 = r4.f7329
            if (r3 != 0) goto L3f
            goto L43
        L3f:
            int r2 = r3.hashCode()
        L43:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r4 = r4.f7330
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", source="
            java.lang.String r1 = ", petTaskMessage="
            java.lang.String r2 = "SparkPersonMessageConfig(message="
            java.lang.String r3 = r5.f7323
            java.lang.String r4 = r5.f7324
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f7325
            r0.append(r1)
            java.lang.String r1 = ", petTaskEnabled="
            r0.append(r1)
            java.lang.Boolean r1 = r5.f7326
            r0.append(r1)
            java.lang.String r1 = ", petTaskMutualMessageEnabled="
            r0.append(r1)
            java.lang.Boolean r1 = r5.f7327
            r0.append(r1)
            java.lang.String r1 = ", petTaskImageEnabled="
            r0.append(r1)
            java.lang.Boolean r1 = r5.f7328
            r0.append(r1)
            java.lang.String r1 = ", petAutoFeedEnabled="
            r0.append(r1)
            java.lang.Boolean r1 = r5.f7329
            r0.append(r1)
            java.lang.String r1 = ", petAutoFeedFoodId="
            r0.append(r1)
            java.lang.String r5 = r5.f7330
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
