package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class vx1 {

    /* JADX INFO: renamed from: α */
    public static final long f11472 = 0;

    /* JADX INFO: renamed from: β */
    public static final long f11473 = 0;

    /* JADX INFO: renamed from: γ */
    public static final long f11474 = 0;

    /* JADX INFO: renamed from: δ */
    public static final p000.f32 f11475 = null;

    static {
            r0 = 14
            long r0 = p000.u81.m5807(r0)
            p000.vx1.f11472 = r0
            r0 = 0
            long r0 = p000.u81.m5807(r0)
            p000.vx1.f11473 = r0
            long r0 = p000.C0114ci.f2124
            p000.vx1.f11474 = r0
            long r0 = p000.C0114ci.f2120
            r2 = 16
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            oi r2 = new oi
            r2.<init>(r0)
            goto L23
        L21:
            xn0 r2 = p000.xn0.f12221
        L23:
            p000.vx1.f11475 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public static final p000.ux1 m6284(p000.ux1 r24, long r25, p000.kn0 r27, float r28, long r29, p000.d60 r31, p000.b60 r32, p000.c60 r33, p000.C0087br r34, java.lang.String r35, long r36, p000.C0752r8 r38, p000.g32 r39, p000.av0 r40, long r41, p000.c32 r43, p000.fv1 r44, p000.kn0 r45) {
            r0 = r24
            r1 = r25
            r3 = r27
            r5 = r29
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r4 = r43
            xn0 r15 = p000.xn0.f12221
            z32[] r16 = p000.y32.f12440
            r16 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r18 = r5 & r16
            r20 = 0
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            r22 = 16
            if (r18 != 0) goto L2c
            r19 = r15
            goto L36
        L2c:
            r19 = r15
            long r14 = r0.f10997
            boolean r14 = p000.y32.m6818(r5, r14)
            if (r14 == 0) goto L49
        L36:
            if (r3 != 0) goto L53
            int r14 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r14 == 0) goto L53
            f32 r14 = r0.f10996
            long r14 = r14.mo2033()
            boolean r14 = p000.C0114ci.m1192(r1, r14)
            if (r14 == 0) goto L49
            goto L53
        L49:
            r15 = r38
        L4b:
            r4 = r41
        L4d:
            r6 = r44
        L4f:
            r7 = r45
            goto L108
        L53:
            if (r8 == 0) goto L5d
            b60 r14 = r0.f10999
            boolean r14 = r8.equals(r14)
            if (r14 == 0) goto L49
        L5d:
            if (r7 == 0) goto L67
            d60 r14 = r0.f10998
            boolean r14 = r7.equals(r14)
            if (r14 == 0) goto L49
        L67:
            if (r10 == 0) goto L6d
            br r14 = r0.f11001
            if (r10 != r14) goto L49
        L6d:
            long r14 = r12 & r16
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 != 0) goto L74
            goto L7c
        L74:
            long r14 = r0.f11003
            boolean r14 = p000.y32.m6818(r12, r14)
            if (r14 == 0) goto L49
        L7c:
            if (r4 == 0) goto L86
            c32 r14 = r0.f11008
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L49
        L86:
            f32 r14 = r0.f10996
            kn0 r14 = r14.mo2034()
            boolean r14 = p000.ln0.m3626(r3, r14)
            if (r14 == 0) goto L49
            if (r3 == 0) goto L9e
            f32 r14 = r0.f10996
            float r14 = r14.mo2035()
            int r14 = (r28 > r14 ? 1 : (r28 == r14 ? 0 : -1))
            if (r14 != 0) goto L49
        L9e:
            if (r9 == 0) goto La8
            c60 r14 = r0.f11000
            boolean r14 = r9.equals(r14)
            if (r14 == 0) goto L49
        La8:
            if (r11 == 0) goto Lb2
            java.lang.String r14 = r0.f11002
            boolean r14 = r11.equals(r14)
            if (r14 == 0) goto L49
        Lb2:
            if (r38 == 0) goto Lbf
            r8 r14 = r0.f11004
            r15 = r38
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L4b
            goto Lc1
        Lbf:
            r15 = r38
        Lc1:
            if (r39 == 0) goto Lce
            g32 r14 = r0.f11005
            r4 = r39
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L4b
            goto Ld0
        Lce:
            r4 = r39
        Ld0:
            if (r40 == 0) goto Ldf
            av0 r14 = r0.f11006
            r4 = r40
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L4b
        Ldc:
            r4 = r41
            goto Le2
        Ldf:
            r4 = r40
            goto Ldc
        Le2:
            int r6 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r6 == 0) goto Lee
            long r6 = r0.f11007
            boolean r6 = p000.C0114ci.m1192(r4, r6)
            if (r6 == 0) goto L4d
        Lee:
            r6 = r44
            if (r6 == 0) goto Lfa
            fv1 r7 = r0.f11009
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L4f
        Lfa:
            r7 = r45
            if (r7 == 0) goto L107
            kn0 r14 = r0.f11010
            boolean r14 = r7.equals(r14)
            if (r14 != 0) goto L107
            goto L108
        L107:
            return r0
        L108:
            r14 = 0
            if (r3 == 0) goto L13a
            boolean r1 = r3 instanceof p000.px1
            if (r1 == 0) goto L127
            r1 = r3
            px1 r1 = (p000.px1) r1
            long r1 = r1.f8755
            r3 = r28
            long r1 = p000.e81.m1882(r1, r3)
            int r3 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r3 == 0) goto L124
            oi r3 = new oi
            r3.<init>(r1)
            goto L143
        L124:
            r3 = r19
            goto L143
        L127:
            r1 = r28
            boolean r2 = r3 instanceof p000.AbstractC0682pc
            if (r2 == 0) goto L136
            qc r2 = new qc
            pc r3 = (p000.AbstractC0682pc) r3
            r2.<init>(r3, r1)
            r3 = r2
            goto L143
        L136:
            p000.C1080.m7272()
            return r14
        L13a:
            int r3 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r3 == 0) goto L124
            oi r3 = new oi
            r3.<init>(r1)
        L143:
            f32 r1 = r0.f10996
            r1.getClass()
            boolean r2 = r3 instanceof p000.C0719qc
            if (r2 == 0) goto L166
            boolean r14 = r1 instanceof p000.C0719qc
            if (r14 == 0) goto L166
            qc r2 = new qc
            qc r3 = (p000.C0719qc) r3
            float r3 = r3.f8956
            boolean r14 = java.lang.Float.isNaN(r3)
            if (r14 == 0) goto L160
            qc r1 = (p000.C0719qc) r1
            float r3 = r1.f8956
        L160:
            r1 = 0
            r2.<init>(r1, r3)
            r3 = r2
            goto L17d
        L166:
            if (r2 == 0) goto L16d
            boolean r14 = r1 instanceof p000.C0719qc
            if (r14 != 0) goto L16d
            goto L17d
        L16d:
            if (r2 != 0) goto L175
            boolean r2 = r1 instanceof p000.C0719qc
            if (r2 == 0) goto L175
        L173:
            r3 = r1
            goto L17d
        L175:
            r2 = r19
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L173
        L17d:
            if (r10 != 0) goto L182
            br r1 = r0.f11001
            r10 = r1
        L182:
            if (r18 != 0) goto L187
            long r1 = r0.f10997
            goto L189
        L187:
            r1 = r29
        L189:
            if (r31 != 0) goto L18e
            d60 r14 = r0.f10998
            goto L190
        L18e:
            r14 = r31
        L190:
            if (r8 != 0) goto L194
            b60 r8 = r0.f10999
        L194:
            if (r9 != 0) goto L198
            c60 r9 = r0.f11000
        L198:
            if (r11 != 0) goto L19c
            java.lang.String r11 = r0.f11002
        L19c:
            long r16 = r12 & r16
            int r16 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r16 != 0) goto L1a4
            long r12 = r0.f11003
        L1a4:
            if (r15 != 0) goto L1a8
            r8 r15 = r0.f11004
        L1a8:
            r26 = r1
            if (r39 != 0) goto L1af
            g32 r1 = r0.f11005
            goto L1b1
        L1af:
            r1 = r39
        L1b1:
            if (r40 != 0) goto L1b6
            av0 r2 = r0.f11006
            goto L1b8
        L1b6:
            r2 = r40
        L1b8:
            int r16 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r16 == 0) goto L1bd
            goto L1bf
        L1bd:
            long r4 = r0.f11007
        L1bf:
            r36 = r1
            if (r43 != 0) goto L1c6
            c32 r1 = r0.f11008
            goto L1c8
        L1c6:
            r1 = r43
        L1c8:
            if (r6 != 0) goto L1cc
            fv1 r6 = r0.f11009
        L1cc:
            if (r7 != 0) goto L1d1
            kn0 r0 = r0.f11010
            goto L1d2
        L1d1:
            r0 = r7
        L1d2:
            ux1 r7 = new ux1
            r42 = r0
            r40 = r1
            r37 = r2
            r25 = r3
            r38 = r4
            r41 = r6
            r24 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r33 = r12
            r28 = r14
            r35 = r15
            r24.<init>(r25, r26, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r40, r41, r42)
            r0 = r24
            return r0
    }
}
