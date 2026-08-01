package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class k31 {

    /* JADX INFO: renamed from: α */
    public final p000.yp0 f5724;

    /* JADX INFO: renamed from: β */
    public final p000.j31 f5725;

    /* JADX INFO: renamed from: γ */
    public final p000.gm0 f5726;

    /* JADX INFO: renamed from: δ */
    public p000.q31 f5727;

    /* JADX INFO: renamed from: ε */
    public final p000.q22 f5728;

    /* JADX INFO: renamed from: ζ */
    public p000.q01 f5729;

    /* JADX INFO: renamed from: η */
    public p000.k21 f5730;

    /* JADX INFO: renamed from: θ */
    public p000.k21 f5731;

    /* JADX INFO: renamed from: ι */
    public final p000.k21 f5732;

    /* JADX INFO: renamed from: κ */
    public p000.i31 f5733;

    public k31(p000.yp0 r3) {
            r2 = this;
            r2.<init>()
            r2.f5724 = r3
            j31 r0 = new j31
            r0.<init>()
            r1 = -1
            r0.f8774 = r1
            r2.f5725 = r0
            gm0 r0 = new gm0
            r0.<init>(r3)
            r2.f5726 = r0
            r2.f5727 = r0
            q22 r3 = r0.f4419
            r2.f5728 = r3
            r2.f5729 = r3
            k21 r3 = new k21
            r0 = 16
            r01[] r0 = new p000.r01[r0]
            r3.<init>(r0)
            r2.f5732 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m3140(p000.k31 r1, p000.q01 r2, p000.q31 r3) {
            q01 r2 = r2.f8775
        L2:
            if (r2 == 0) goto L28
            j31 r0 = r1.f5725
            if (r2 != r0) goto L1b
            yp0 r2 = r1.f5724
            yp0 r2 = r2.m7005()
            if (r2 == 0) goto L15
            k31 r2 = r2.f12733
            gm0 r2 = r2.f5726
            goto L16
        L15:
            r2 = 0
        L16:
            r3.f8841 = r2
            r1.f5727 = r3
            return
        L1b:
            int r0 = r2.f8773
            r0 = r0 & 2
            if (r0 == 0) goto L22
            goto L28
        L22:
            r2.mo4647(r3)
            q01 r2 = r2.f8775
            goto L2
        L28:
            return
    }

    /* JADX INFO: renamed from: β */
    public static p000.q01 m3141(p000.v01 r3, p000.q01 r4) {
            boolean r0 = r3 instanceof p000.v01
            r1 = 1
            if (r0 == 0) goto L10
            q01 r3 = r3.mo56()
            int r0 = p000.r31.m5059(r3)
            r3.f8773 = r0
            goto L29
        L10:
            p8 r0 = new p8
            r0.<init>()
            u11 r2 = p000.r31.f9251
            boolean r2 = r3 instanceof p000.C0612o6
            if (r2 == 0) goto L1e
            r2 = 9
            goto L1f
        L1e:
            r2 = r1
        L1f:
            r0.f8773 = r2
            r0.f8453 = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r3 = r0
        L29:
            boolean r0 = r3.f8784
            if (r0 == 0) goto L32
            java.lang.String r0 = "A ModifierNodeElement cannot return an already attached node from create() "
            p000.am0.m178(r0)
        L32:
            r3.f8779 = r1
            q01 r0 = r4.f8776
            if (r0 == 0) goto L3c
            r0.f8775 = r3
            r3.f8776 = r0
        L3c:
            r4.f8776 = r3
            r3.f8775 = r4
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public static p000.q01 m3142(p000.q01 r3) {
            boolean r0 = r3.f8784
            if (r0 == 0) goto L18
            u11 r1 = p000.r31.f9251
            if (r0 != 0) goto Ld
            java.lang.String r0 = "autoInvalidateRemovedNode called on unattached node"
            p000.am0.m178(r0)
        Ld:
            r0 = -1
            r1 = 2
            p000.r31.m5055(r3, r0, r1)
            r3.mo4653()
            r3.mo4650()
        L18:
            q01 r0 = r3.f8776
            q01 r1 = r3.f8775
            r2 = 0
            if (r0 == 0) goto L23
            r0.f8775 = r1
            r3.f8776 = r2
        L23:
            if (r1 == 0) goto L29
            r1.f8776 = r0
            r3.f8775 = r2
        L29:
            r1.getClass()
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static void m3143(p000.v01 r2, p000.v01 r3, p000.q01 r4) {
            boolean r2 = r2 instanceof p000.v01
            r0 = 1
            if (r2 == 0) goto L1a
            boolean r2 = r3 instanceof p000.v01
            if (r2 == 0) goto L1a
            r4.getClass()
            r3.mo57(r4)
            boolean r2 = r4.f8784
            if (r2 == 0) goto L17
            p000.r31.m5057(r4)
            return
        L17:
            r4.f8780 = r0
            return
        L1a:
            boolean r2 = r4 instanceof p000.C0678p8
            if (r2 == 0) goto L5a
            r2 = r4
            p8 r2 = (p000.C0678p8) r2
            boolean r1 = r2.f8784
            if (r1 == 0) goto L39
            if (r1 != 0) goto L2c
            java.lang.String r1 = "unInitializeModifier called on unattached node"
            p000.am0.m178(r1)
        L2c:
            int r1 = r2.f8773
            r1 = r1 & 8
            if (r1 == 0) goto L39
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.h62.m2446(r2)
            r1.m373()
        L39:
            r2.f8453 = r3
            u11 r1 = p000.r31.f9251
            boolean r3 = r3 instanceof p000.C0612o6
            if (r3 == 0) goto L44
            r3 = 9
            goto L45
        L44:
            r3 = r0
        L45:
            r2.f8773 = r3
            boolean r3 = r2.f8784
            if (r3 == 0) goto L4f
            r3 = 0
            r2.m4385(r3)
        L4f:
            boolean r2 = r4.f8784
            if (r2 == 0) goto L57
            p000.r31.m5057(r4)
            return
        L57:
            r4.f8780 = r0
            return
        L5a:
            java.lang.String r2 = "Unknown Modifier.Node type"
            p000.am0.m178(r2)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            q01 r1 = r4.f5729
            java.lang.String r2 = "]"
            q22 r4 = r4.f5728
            if (r1 != r4) goto L13
            r0.append(r2)
            goto L2e
        L13:
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L2e
            java.lang.String r3 = java.lang.String.valueOf(r1)
            r0.append(r3)
            q01 r3 = r1.f8776
            if (r3 != r4) goto L26
            r0.append(r2)
            goto L2e
        L26:
            java.lang.String r3 = ","
            r0.append(r3)
            q01 r1 = r1.f8776
            goto L13
        L2e:
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m3144(int r1) {
            r0 = this;
            q01 r0 = r0.f5729
            int r0 = r0.f8774
            r0 = r0 & r1
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final void m3145() {
            r2 = this;
            q01 r2 = r2.f5729
        L2:
            if (r2 == 0) goto L2a
            r2.mo4652()
            boolean r0 = r2.f8779
            if (r0 == 0) goto L1b
            u11 r0 = p000.r31.f9251
            boolean r0 = r2.f8784
            if (r0 != 0) goto L16
            java.lang.String r0 = "autoInvalidateInsertedNode called on unattached node"
            p000.am0.m178(r0)
        L16:
            r0 = -1
            r1 = 1
            p000.r31.m5055(r2, r0, r1)
        L1b:
            boolean r0 = r2.f8780
            if (r0 == 0) goto L22
            p000.r31.m5057(r2)
        L22:
            r0 = 0
            r2.f8779 = r0
            r2.f8780 = r0
            q01 r2 = r2.f8776
            goto L2
        L2a:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m3146(int r32, p000.k21 r33, p000.k21 r34, p000.q01 r35, boolean r36) {
            r31 = this;
            r1 = r31
            i31 r0 = r1.f5733
            if (r0 != 0) goto L18
            i31 r0 = new i31
            r3 = r32
            r4 = r33
            r5 = r34
            r2 = r35
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1.f5733 = r0
            goto L2c
        L18:
            r3 = r32
            r4 = r33
            r5 = r34
            r2 = r35
            r0.f4888 = r2
            r0.f4889 = r3
            r0.f4890 = r4
            r0.f4891 = r5
            r6 = r36
            r0.f4892 = r6
        L2c:
            k31 r2 = r0.f4893
            int r4 = r4.f5718
            int r4 = r4 - r3
            int r5 = r5.f5718
            int r5 = r5 - r3
            int r3 = r4 + r5
            r6 = 1
            int r3 = r3 + r6
            r7 = 2
            int r3 = r3 / r7
            cn0 r8 = new cn0
            int r9 = r3 * 3
            r8.<init>(r9)
            cn0 r9 = new cn0
            int r10 = r3 * 4
            r9.<init>(r10)
            r10 = 0
            r9.m1271(r10, r4, r10, r5)
            int r3 = r3 * r7
            int r3 = r3 + r6
            int[] r11 = new int[r3]
            int[] r12 = new int[r3]
            r13 = 5
            int[] r13 = new int[r13]
        L55:
            int r14 = r9.f2211
            if (r14 == 0) goto L27b
            r32 = r7
            int[] r7 = r9.f2210
            r33 = r10
            int r10 = r14 + (-1)
            r9.f2211 = r10
            r10 = r7[r10]
            r34 = 3
            int r15 = r14 + (-2)
            r9.f2211 = r15
            r15 = r7[r15]
            int r6 = r14 + (-3)
            r9.f2211 = r6
            r6 = r7[r6]
            int r14 = r14 + (-4)
            r9.f2211 = r14
            r7 = r7[r14]
            int r14 = r6 - r7
            r36 = r3
            int r3 = r10 - r15
            r16 = r11
            r11 = 1
            if (r14 < r11) goto L276
            if (r3 >= r11) goto L88
            goto L276
        L88:
            int r17 = r14 + r3
            int r17 = r17 + 1
            r35 = r11
            int r11 = r17 / 2
            int r17 = r36 / 2
            int r18 = r17 + 1
            r16[r18] = r7
            r12[r18] = r6
            r18 = r3
            r3 = r33
        L9c:
            if (r3 >= r11) goto L276
            int r19 = r14 - r18
            int r20 = java.lang.Math.abs(r19)
            r21 = r11
            r11 = r20 & 1
            r20 = r12
            r12 = r35
            if (r11 != r12) goto Lb0
            r11 = 1
            goto Lb2
        Lb0:
            r11 = r33
        Lb2:
            int r12 = -r3
            r22 = r11
            r11 = r12
        Lb6:
            r23 = 4
            if (r11 > r3) goto L148
            if (r11 == r12) goto Lde
            if (r11 == r3) goto Ld1
            int r24 = r11 + 1
            int r24 = r24 + r17
            r25 = r11
            r11 = r16[r24]
            int r24 = r25 + (-1)
            int r24 = r24 + r17
            r26 = r13
            r13 = r16[r24]
            if (r11 <= r13) goto Ld5
            goto Le2
        Ld1:
            r25 = r11
            r26 = r13
        Ld5:
            int r11 = r25 + (-1)
            int r11 = r11 + r17
            r11 = r16[r11]
            int r13 = r11 + 1
            goto Le9
        Lde:
            r25 = r11
            r26 = r13
        Le2:
            int r11 = r25 + 1
            int r11 = r11 + r17
            r11 = r16[r11]
            r13 = r11
        Le9:
            int r24 = r13 - r7
            int r24 = r24 + r15
            int r24 = r24 - r25
            if (r3 == 0) goto Lf4
            r27 = 1
            goto Lf6
        Lf4:
            r27 = r33
        Lf6:
            if (r13 != r11) goto Lfb
            r28 = 1
            goto Lfd
        Lfb:
            r28 = r33
        Lfd:
            r27 = r27 & r28
            int r27 = r24 - r27
            r30 = r24
            r24 = r11
            r11 = r30
        L107:
            if (r13 >= r6) goto L116
            if (r11 >= r10) goto L116
            boolean r28 = r0.m2612(r13, r11)
            if (r28 == 0) goto L116
            int r13 = r13 + 1
            int r11 = r11 + 1
            goto L107
        L116:
            int r28 = r17 + r25
            r16[r28] = r13
            if (r22 == 0) goto L13e
            r28 = r11
            int r11 = r19 - r25
            r29 = r14
            int r14 = r12 + 1
            if (r11 < r14) goto L140
            int r14 = r3 + (-1)
            if (r11 > r14) goto L140
            int r11 = r17 + r11
            r11 = r20[r11]
            if (r11 > r13) goto L140
            r26[r33] = r24
            r11 = 1
            r26[r11] = r27
            r26[r32] = r13
            r26[r34] = r28
            r26[r23] = r33
            r11 = 1
            goto L1d8
        L13e:
            r29 = r14
        L140:
            int r11 = r25 + 2
            r13 = r26
            r14 = r29
            goto Lb6
        L148:
            r26 = r13
            r29 = r14
            r11 = r19 & 1
            if (r11 != 0) goto L152
            r11 = 1
            goto L154
        L152:
            r11 = r33
        L154:
            r13 = r12
        L155:
            if (r13 > r3) goto L268
            if (r13 == r12) goto L177
            if (r13 == r3) goto L16c
            int r14 = r13 + 1
            int r14 = r14 + r17
            r14 = r20[r14]
            int r22 = r13 + (-1)
            int r22 = r22 + r17
            r24 = r11
            r11 = r20[r22]
            if (r14 >= r11) goto L16e
            goto L179
        L16c:
            r24 = r11
        L16e:
            int r11 = r13 + (-1)
            int r11 = r11 + r17
            r11 = r20[r11]
            int r14 = r11 + (-1)
            goto L180
        L177:
            r24 = r11
        L179:
            int r11 = r13 + 1
            int r11 = r11 + r17
            r11 = r20[r11]
            r14 = r11
        L180:
            int r22 = r6 - r14
            int r22 = r22 - r13
            int r22 = r10 - r22
            if (r3 == 0) goto L18b
            r25 = 1
            goto L18d
        L18b:
            r25 = r33
        L18d:
            if (r14 != r11) goto L192
            r27 = 1
            goto L194
        L192:
            r27 = r33
        L194:
            r25 = r25 & r27
            int r25 = r22 + r25
            r30 = r22
            r22 = r11
            r11 = r30
        L19e:
            if (r14 <= r7) goto L1b7
            if (r11 <= r15) goto L1b7
            r27 = r11
            int r11 = r14 + (-1)
            r28 = r13
            int r13 = r27 + (-1)
            boolean r11 = r0.m2612(r11, r13)
            if (r11 == 0) goto L1bb
            int r14 = r14 + (-1)
            int r11 = r27 + (-1)
            r13 = r28
            goto L19e
        L1b7:
            r27 = r11
            r28 = r13
        L1bb:
            int r13 = r17 + r28
            r20[r13] = r14
            if (r24 == 0) goto L262
            int r11 = r19 - r28
            if (r11 < r12) goto L262
            if (r11 > r3) goto L262
            int r11 = r17 + r11
            r11 = r16[r11]
            if (r11 < r14) goto L262
            r26[r33] = r14
            r11 = 1
            r26[r11] = r27
            r26[r32] = r22
            r26[r34] = r25
            r26[r23] = r11
        L1d8:
            r3 = r26[r32]
            r12 = r26[r33]
            int r3 = r3 - r12
            r12 = r26[r34]
            r13 = r26[r11]
            int r12 = r12 - r13
            int r3 = java.lang.Math.min(r3, r12)
            if (r3 <= 0) goto L243
            r3 = r26[r33]
            r12 = r26[r11]
            r11 = r26[r34]
            int r11 = r11 - r12
            r13 = r26[r32]
            int r13 = r13 - r3
            if (r11 == r13) goto L23b
            int r13 = java.lang.Math.min(r13, r11)
            r11 = r26[r23]
            if (r11 == 0) goto L1fe
            r14 = 1
            goto L200
        L1fe:
            r14 = r33
        L200:
            r17 = r26[r34]
            r18 = 1
            r19 = r26[r18]
            r35 = r3
            int r3 = r17 - r19
            r21 = r26[r32]
            r22 = r26[r33]
            r23 = r11
            int r11 = r21 - r22
            if (r3 <= r11) goto L217
            r3 = r18
            goto L219
        L217:
            r3 = r33
        L219:
            r3 = r3 | r14
            r3 = r3 ^ 1
            int r3 = r35 + r3
            if (r23 == 0) goto L223
            r11 = r18
            goto L225
        L223:
            r11 = r33
        L225:
            int r14 = r17 - r19
            r35 = r3
            int r3 = r21 - r22
            if (r14 <= r3) goto L230
            r3 = r18
            goto L232
        L230:
            r3 = r33
        L232:
            r3 = r3 ^ 1
            r3 = r3 | r11
            r3 = r3 ^ 1
            int r12 = r12 + r3
            r3 = r35
            goto L23f
        L23b:
            r35 = r3
            r18 = 1
        L23f:
            r8.m1270(r3, r12, r13)
            goto L245
        L243:
            r18 = r11
        L245:
            r3 = r26[r33]
            r11 = r26[r18]
            r9.m1271(r7, r3, r15, r11)
            r3 = r26[r32]
            r7 = r26[r34]
            r9.m1271(r3, r6, r7, r10)
        L253:
            r7 = r32
            r10 = r33
            r3 = r36
            r11 = r16
            r12 = r20
            r13 = r26
            r6 = 1
            goto L55
        L262:
            int r13 = r28 + 2
            r11 = r24
            goto L155
        L268:
            int r3 = r3 + 1
            r12 = r20
            r11 = r21
            r13 = r26
            r14 = r29
            r35 = 1
            goto L9c
        L276:
            r20 = r12
            r26 = r13
            goto L253
        L27b:
            r32 = r7
            r33 = r10
            r34 = 3
            int r3 = r8.f2211
            int r6 = r3 % 3
            if (r6 != 0) goto L28a
        L287:
            r6 = r34
            goto L290
        L28a:
            java.lang.String r6 = "Array size not a multiple of 3"
            p000.am0.m178(r6)
            goto L287
        L290:
            if (r3 <= r6) goto L299
            int r3 = r3 - r6
            r6 = r33
            r8.m1272(r6, r3)
            goto L29b
        L299:
            r6 = r33
        L29b:
            r8.m1270(r4, r5, r6)
            r3 = r6
            r4 = r3
            r5 = r4
        L2a1:
            int r7 = r8.f2211
            if (r3 >= r7) goto L385
            int[] r7 = r8.f2210
            r9 = r7[r3]
            int r10 = r3 + 2
            r10 = r7[r10]
            int r9 = r9 - r10
            int r11 = r3 + 1
            r7 = r7[r11]
            int r7 = r7 - r10
            int r3 = r3 + 3
        L2b5:
            if (r4 >= r9) goto L2e4
            q01 r11 = r0.f4888
            q01 r11 = r11.f8776
            r11.getClass()
            int r12 = r11.f8773
            r12 = r12 & 2
            if (r12 == 0) goto L2db
            q31 r12 = r11.f8778
            r12.getClass()
            q31 r13 = r12.f8841
            q31 r12 = r12.f8840
            r12.getClass()
            if (r13 == 0) goto L2d4
            r13.f8840 = r12
        L2d4:
            r12.f8841 = r13
            q01 r13 = r0.f4888
            m3140(r2, r13, r12)
        L2db:
            q01 r11 = m3142(r11)
            r0.f4888 = r11
            int r4 = r4 + 1
            goto L2b5
        L2e4:
            if (r5 >= r7) goto L351
            int r9 = r0.f4889
            int r9 = r9 + r5
            q01 r11 = r0.f4888
            k21 r12 = r0.f4891
            java.lang.Object[] r12 = r12.f5716
            r9 = r12[r9]
            v01 r9 = (p000.v01) r9
            q01 r9 = m3141(r9, r11)
            r0.f4888 = r9
            boolean r11 = r0.f4892
            if (r11 == 0) goto L34b
            q01 r9 = r9.f8776
            r9.getClass()
            q31 r9 = r9.f8778
            r9.getClass()
            q01 r11 = r0.f4888
            qp0 r11 = p000.h62.m2390(r11)
            if (r11 == 0) goto L329
            sp0 r12 = new sp0
            yp0 r13 = r2.f5724
            r12.<init>(r13, r11)
            q01 r11 = r0.f4888
            r11.mo4647(r12)
            q01 r11 = r0.f4888
            m3140(r2, r11, r12)
            q31 r11 = r9.f8841
            r12.f8841 = r11
            r12.f8840 = r9
            r9.f8841 = r12
            goto L32e
        L329:
            q01 r11 = r0.f4888
            r11.mo4647(r9)
        L32e:
            q01 r9 = r0.f4888
            r9.mo4649()
            q01 r9 = r0.f4888
            r9.mo4652()
            q01 r9 = r0.f4888
            u11 r11 = p000.r31.f9251
            boolean r11 = r9.f8784
            if (r11 != 0) goto L345
            java.lang.String r11 = "autoInvalidateInsertedNode called on unattached node"
            p000.am0.m178(r11)
        L345:
            r11 = -1
            r12 = 1
            p000.r31.m5055(r9, r11, r12)
            goto L34e
        L34b:
            r12 = 1
            r9.f8779 = r12
        L34e:
            int r5 = r5 + 1
            goto L2e4
        L351:
            r12 = 1
        L352:
            int r7 = r10 + (-1)
            if (r10 <= 0) goto L2a1
            q01 r9 = r0.f4888
            q01 r9 = r9.f8776
            r9.getClass()
            r0.f4888 = r9
            k21 r9 = r0.f4890
            int r10 = r0.f4889
            int r11 = r10 + r4
            java.lang.Object[] r9 = r9.f5716
            r9 = r9[r11]
            v01 r9 = (p000.v01) r9
            k21 r11 = r0.f4891
            int r10 = r10 + r5
            java.lang.Object[] r11 = r11.f5716
            r10 = r11[r10]
            v01 r10 = (p000.v01) r10
            boolean r11 = p000.ln0.m3626(r9, r10)
            if (r11 != 0) goto L37f
            q01 r11 = r0.f4888
            m3143(r9, r10, r11)
        L37f:
            int r4 = r4 + 1
            int r5 = r5 + 1
            r10 = r7
            goto L352
        L385:
            q22 r0 = r1.f5728
            q01 r0 = r0.f8775
            r10 = r6
        L38a:
            if (r0 == 0) goto L398
            j31 r2 = r1.f5725
            if (r0 == r2) goto L398
            int r2 = r0.f8773
            r10 = r10 | r2
            r0.f8774 = r10
            q01 r0 = r0.f8775
            goto L38a
        L398:
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m3147() {
            r5 = this;
            q22 r0 = r5.f5728
            q01 r0 = r0.f8775
            gm0 r1 = r5.f5726
        L6:
            yp0 r2 = r5.f5724
            if (r0 == 0) goto L39
            qp0 r3 = p000.h62.m2390(r0)
            if (r3 == 0) goto L33
            q31 r4 = r0.f8778
            if (r4 == 0) goto L25
            sp0 r4 = (p000.sp0) r4
            qp0 r2 = r4.f9984
            r4.m5528(r3)
            if (r2 == r0) goto L2d
            w81 r2 = r4.f8838
            if (r2 == 0) goto L2d
            r2.invalidate()
            goto L2d
        L25:
            sp0 r4 = new sp0
            r4.<init>(r2, r3)
            r0.mo4647(r4)
        L2d:
            r1.f8841 = r4
            r4.f8840 = r1
            r1 = r4
            goto L36
        L33:
            r0.mo4647(r1)
        L36:
            q01 r0 = r0.f8775
            goto L6
        L39:
            yp0 r0 = r2.m7005()
            if (r0 == 0) goto L44
            k31 r0 = r0.f12733
            gm0 r0 = r0.f5726
            goto L45
        L44:
            r0 = 0
        L45:
            r1.f8841 = r0
            r5.f5727 = r1
            return
    }
}
