package p000;

/* JADX INFO: renamed from: cw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0190cw extends p000.InterfaceC1031yr {
    /* JADX INFO: renamed from: а */
    static /* synthetic */ void m1617(p000.InterfaceC0190cw r11, long r12, long r14, float r16, int r17) {
            r0 = r17 & 4
            r4 = 0
            if (r0 == 0) goto Le
            long r14 = r11.mo585()
            long r14 = m1621(r14, r4)
        Le:
            r6 = r14
            r14 = r17 & 8
            if (r14 == 0) goto L17
            r14 = 1065353216(0x3f800000, float:1.0)
            r8 = r14
            goto L19
        L17:
            r8 = r16
        L19:
            t30 r9 = p000.t30.f10165
            r14 = r17 & 64
            if (r14 == 0) goto L24
            r14 = 3
        L20:
            r1 = r11
            r2 = r12
            r10 = r14
            goto L26
        L24:
            r14 = 0
            goto L20
        L26:
            r1.mo582(r2, r4, r6, r8, r9, r10)
            return
    }

    /* JADX INFO: renamed from: в */
    static void m1618(p000.aq0 r17, p000.C0534m2 r18, long r19, long r21, float r23, p000.C0315ga r24, int r25, int r26) {
            r0 = r26
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r8 = r19
            goto Lb
        L9:
            r8 = r21
        Lb:
            r1 = r0 & 32
            if (r1 == 0) goto L13
            r1 = 1065353216(0x3f800000, float:1.0)
            r13 = r1
            goto L15
        L13:
            r13 = r23
        L15:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L1f
            r0 = 1
            r16 = r0
        L1c:
            r0 = r17
            goto L22
        L1f:
            r16 = r25
            goto L1c
        L22:
            fe r10 = r0.f1284
            r10.getClass()
            t30 r12 = p000.t30.f10165
            ee r0 = r10.f3906
            de r2 = r0.f3516
            r11 = 0
            r15 = 3
            r14 = r24
            q2 r10 = r10.m2103(r11, r12, r13, r14, r15, r16)
            r4 = 0
            r3 = r18
            r6 = r19
            r2.mo1723(r3, r4, r6, r8, r10)
            return
    }

    /* JADX INFO: renamed from: г */
    static /* synthetic */ void m1619(p000.InterfaceC0190cw r6, p000.z91 r7, p000.kn0 r8, p000.y02 r9, int r10) {
            r0 = r10 & 8
            if (r0 == 0) goto L6
            t30 r9 = p000.t30.f10165
        L6:
            r4 = r9
            r9 = r10 & 32
            if (r9 == 0) goto Le
            r9 = 3
        Lc:
            r5 = r9
            goto L10
        Le:
            r9 = 0
            goto Lc
        L10:
            r3 = 1065353216(0x3f800000, float:1.0)
            r0 = r6
            r1 = r7
            r2 = r8
            r0.mo591(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: о */
    static void m1620(p000.aq0 r13, p000.kn0 r14, long r15, long r17, long r19, p000.kn0 r21, int r22) {
            r0 = r22 & 2
            if (r0 == 0) goto L7
            r0 = 0
            goto L8
        L7:
            r0 = r15
        L8:
            r2 = r22 & 4
            if (r2 == 0) goto L17
            fe r2 = r13.f1284
            long r2 = r2.mo585()
            long r2 = m1621(r2, r0)
            goto L19
        L17:
            r2 = r17
        L19:
            r4 = r22 & 32
            if (r4 == 0) goto L20
            t30 r4 = p000.t30.f10165
            goto L22
        L20:
            r4 = r21
        L22:
            fe r13 = r13.f1284
            ee r5 = r13.f3906
            de r5 = r5.f3516
            r6 = 32
            long r7 = r0 >> r6
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r9
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r11 = r2 >> r6
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r11 = r11 + r7
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r2 = r2 & r9
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r0
            long r6 = r19 >> r6
            int r0 = (int) r6
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r6 = r19 & r9
            int r3 = (int) r6
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r6 = 0
            r7 = 1
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 3
            r15 = r13
            r16 = r14
            r17 = r4
            r19 = r6
            r21 = r7
            r18 = r9
            r20 = r10
            q2 r13 = r15.m2103(r16, r17, r18, r19, r20, r21)
            r21 = r13
            r19 = r0
            r16 = r1
            r18 = r2
            r20 = r3
            r14 = r5
            r15 = r8
            r17 = r11
            r14.mo1728(r15, r16, r17, r18, r19, r20, r21)
            return
    }

    /* JADX INFO: renamed from: т */
    static long m1621(long r6, long r8) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r8 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r8 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r6 = r6 - r7
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r8 = r4 & r2
            long r6 = r6 | r8
            return r6
    }

    p000.np0 getLayoutDirection();

    /* JADX INFO: renamed from: Β */
    p000.C0538m6 mo579();

    /* JADX INFO: renamed from: Η */
    default void mo580(p000.wa0 r7, long r8, p000.a80 r10) {
            r6 = this;
            np0 r2 = r6.getLayoutDirection()
            i3 r5 = new i3
            r0 = 3
            r5.<init>(r6, r0, r10)
            r1 = r6
            r0 = r7
            r3 = r8
            r0.m6345(r1, r2, r3, r5)
            return
    }

    /* JADX INFO: renamed from: Λ */
    void mo582(long r1, long r3, long r5, float r7, p000.kn0 r8, int r9);

    /* JADX INFO: renamed from: α */
    default long mo585() {
            r2 = this;
            m6 r2 = r2.mo579()
            long r0 = r2.m3758()
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    void mo591(p000.z91 r1, p000.kn0 r2, float r3, p000.kn0 r4, int r5);
}
