package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class s32 extends p000.v01 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f9701;

    /* JADX INFO: renamed from: β */
    public final p000.w32 f9702;

    /* JADX INFO: renamed from: γ */
    public final p000.f50 f9703;

    /* JADX INFO: renamed from: δ */
    public final int f9704;

    /* JADX INFO: renamed from: ε */
    public final int f9705;

    public s32(java.lang.String r1, p000.w32 r2, p000.f50 r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.f9701 = r1
            r0.f9702 = r2
            r0.f9703 = r3
            r0.f9704 = r4
            r0.f9705 = r5
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.s32
            if (r1 != 0) goto L9
            goto L3a
        L9:
            s32 r4 = (p000.s32) r4
            java.lang.String r1 = r3.f9701
            java.lang.String r2 = r4.f9701
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
            goto L3a
        L16:
            w32 r1 = r3.f9702
            w32 r2 = r4.f9702
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 != 0) goto L21
            goto L3a
        L21:
            f50 r1 = r3.f9703
            f50 r2 = r4.f9703
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 != 0) goto L2c
            goto L3a
        L2c:
            int r1 = r3.f9704
            int r2 = r4.f9704
            if (r1 != r2) goto L3a
            int r3 = r3.f9705
            int r4 = r4.f9705
            if (r3 == r4) goto L39
            goto L3a
        L39:
            return r0
        L3a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9701
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            w32 r2 = r3.f9702
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            f50 r0 = r3.f9703
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.f9704
            int r0 = p000.a12.m14(r2, r0, r1)
            r2 = 1
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r3 = r3.f9705
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r0 = r0 + r2
            int r0 = r0 * r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: δ */
    public final p000.q01 mo56() {
            r2 = this;
            v32 r0 = new v32
            r0.<init>()
            java.lang.String r1 = r2.f9701
            r0.f11096 = r1
            w32 r1 = r2.f9702
            r0.f11097 = r1
            f50 r1 = r2.f9703
            r0.f11098 = r1
            int r1 = r2.f9704
            r0.f11099 = r1
            r1 = 1
            r0.f11100 = r1
            int r2 = r2.f9705
            r0.f11101 = r2
            r0.f11090 = r1
            return r0
    }

    @Override // p000.v01
    /* JADX INFO: renamed from: ε */
    public final void mo57(p000.q01 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            v32 r1 = (p000.v32) r1
            r1.getClass()
            w32 r2 = r1.f11097
            r3 = 0
            r4 = 1
            w32 r5 = r0.f9702
            if (r5 == r2) goto L1e
            ux1 r6 = r5.f11556
            ux1 r2 = r2.f11556
            boolean r2 = r6.m6008(r2)
            if (r2 == 0) goto L1c
            goto L21
        L1c:
            r2 = r4
            goto L22
        L1e:
            r5.getClass()
        L21:
            r2 = r3
        L22:
            java.lang.String r6 = r1.f11096
            java.lang.String r7 = r0.f9701
            boolean r6 = p000.ln0.m3626(r6, r7)
            r8 = 0
            if (r6 == 0) goto L2e
            goto L33
        L2e:
            r1.f11096 = r7
            r1.f11095 = r8
            r3 = r4
        L33:
            w32 r6 = r1.f11097
            if (r6 == r5) goto L4e
            r91 r7 = r6.f11557
            r91 r9 = r5.f11557
            boolean r7 = p000.ln0.m3626(r7, r9)
            if (r7 == 0) goto L4c
            ux1 r6 = r6.f11556
            ux1 r7 = r5.f11556
            boolean r6 = r6.m6007(r7)
            if (r6 == 0) goto L4c
            goto L51
        L4c:
            r6 = 0
            goto L52
        L4e:
            r6.getClass()
        L51:
            r6 = 1
        L52:
            r6 = r6 ^ r4
            r1.f11097 = r5
            int r5 = r1.f11090
            if (r5 == r4) goto L5c
            r1.f11090 = r4
            r6 = r4
        L5c:
            int r5 = r1.f11101
            int r7 = r0.f9705
            if (r5 == r7) goto L65
            r1.f11101 = r7
            r6 = r4
        L65:
            boolean r5 = r1.f11100
            if (r5 == r4) goto L6c
            r1.f11100 = r4
            r6 = r4
        L6c:
            f50 r5 = r1.f11098
            f50 r7 = r0.f9703
            boolean r5 = p000.ln0.m3626(r5, r7)
            if (r5 != 0) goto L79
            r1.f11098 = r7
            r6 = r4
        L79:
            int r5 = r1.f11099
            int r0 = r0.f9704
            if (r5 != r0) goto L81
            r4 = r6
            goto L83
        L81:
            r1.f11099 = r0
        L83:
            if (r2 != 0) goto L89
            if (r3 != 0) goto L89
            if (r4 == 0) goto L8b
        L89:
            r1.f11093 = r8
        L8b:
            if (r3 != 0) goto L8f
            if (r4 == 0) goto La6
        L8f:
            q91 r9 = r1.m6029()
            java.lang.String r10 = r1.f11096
            w32 r11 = r1.f11097
            f50 r12 = r1.f11098
            int r13 = r1.f11099
            boolean r14 = r1.f11100
            int r15 = r1.f11101
            int r0 = r1.f11090
            r16 = r0
            r9.m4817(r10, r11, r12, r13, r14, r15, r16)
        La6:
            boolean r0 = r1.f8784
            if (r0 != 0) goto Lab
            goto Lc5
        Lab:
            if (r3 != 0) goto Lb3
            if (r2 == 0) goto Lb6
            t32 r0 = r1.f11094
            if (r0 == 0) goto Lb6
        Lb3:
            p000.i91.m2685(r1)
        Lb6:
            if (r3 != 0) goto Lba
            if (r4 == 0) goto Lc0
        Lba:
            p000.AbstractC0073bd.m847(r1)
            p000.AbstractC1021yh.m6865(r1)
        Lc0:
            if (r2 == 0) goto Lc5
            p000.AbstractC1021yh.m6865(r1)
        Lc5:
            return
    }
}
