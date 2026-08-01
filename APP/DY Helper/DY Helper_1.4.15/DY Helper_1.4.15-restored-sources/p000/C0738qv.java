package p000;

/* JADX INFO: renamed from: qv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0738qv extends p000.do1 implements p000.e80 {

    /* JADX INFO: renamed from: η */
    public p000.vh1 f9139;

    /* JADX INFO: renamed from: θ */
    public int f9140;

    /* JADX INFO: renamed from: ι */
    public int f9141;

    /* JADX INFO: renamed from: κ */
    public /* synthetic */ java.lang.Object f9142;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ p000.qm1 f9143;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ p000.um1 f9144;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ p000.um1 f9145;

    public C0738qv(p000.qm1 r1, p000.um1 r2, p000.um1 r3, p000.InterfaceC0631op r4) {
            r0 = this;
            r0.f9143 = r1
            r0.f9144 = r2
            r0.f9145 = r3
            r0.<init>(r4)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            d22 r1 = (p000.d22) r1
            op r2 = (p000.InterfaceC0631op) r2
            op r0 = r0.mo1119(r2, r1)
            qv r0 = (p000.C0738qv) r0
            s62 r1 = p000.s62.f9751
            java.lang.Object r0 = r0.mo11(r1)
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0631op mo1119(p000.InterfaceC0631op r4, java.lang.Object r5) {
            r3 = this;
            qv r0 = new qv
            um1 r1 = r3.f9144
            um1 r2 = r3.f9145
            qm1 r3 = r3.f9143
            r0.<init>(r3, r1, r2, r4)
            r0.f9142 = r5
            return r0
    }

    @Override // p000.AbstractC0715q8
    /* JADX INFO: renamed from: κ */
    public final java.lang.Object mo11(java.lang.Object r25) {
            r24 = this;
            r0 = r24
            int r1 = r0.f9141
            r2 = 0
            r3 = 2
            r5 = 1
            cq r6 = p000.EnumC0184cq.f2716
            if (r1 == 0) goto L33
            if (r1 == r5) goto L27
            if (r1 != r3) goto L20
            int r1 = r0.f9140
            vh1 r7 = r0.f9139
            java.lang.Object r8 = r0.f9142
            d22 r8 = (p000.d22) r8
            p000.i81.m2649(r25)
            r2 = r25
            r4 = r5
            r5 = r6
            goto L16c
        L20:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
        L27:
            int r1 = r0.f9140
            java.lang.Object r7 = r0.f9142
            d22 r7 = (p000.d22) r7
            p000.i81.m2649(r25)
            r8 = r25
            goto L51
        L33:
            p000.i81.m2649(r25)
            java.lang.Object r1 = r0.f9142
            d22 r1 = (p000.d22) r1
            r7 = r1
            r1 = 0
        L3c:
            if (r1 != 0) goto L1ea
            r0.f9142 = r7
            r0.f9139 = r2
            r0.f9140 = r1
            r0.f9141 = r5
            wh1 r8 = p000.wh1.f11721
            java.lang.Object r8 = r7.m1638(r8, r0)
            if (r8 != r6) goto L51
            r5 = r6
            goto L166
        L51:
            vh1 r8 = (p000.vh1) r8
            java.lang.Object r9 = r8.f11293
            int r10 = r9.size()
            r11 = 0
        L5a:
            if (r11 >= r10) goto L6c
            java.lang.Object r12 = r9.get(r11)
            ai1 r12 = (p000.ai1) r12
            boolean r12 = p000.j81.m2902(r12)
            if (r12 != 0) goto L69
            goto L6d
        L69:
            int r11 = r11 + 1
            goto L5a
        L6c:
            r1 = r5
        L6d:
            java.lang.Object r9 = r8.f11293
            int r10 = r9.size()
            r11 = 0
        L74:
            if (r11 >= r10) goto L143
            java.lang.Object r12 = r9.get(r11)
            ai1 r12 = (p000.ai1) r12
            boolean r13 = r12.m170()
            if (r13 != 0) goto L13f
            e22 r13 = r7.f2867
            long r14 = r13.f3383
            yp0 r2 = p000.h62.m2445(r13)
            g92 r2 = r2.f12728
            long r3 = r2.mo2294()
            long r2 = r13.mo584(r3)
            r16 = r6
            long r5 = r13.f3383
            r13 = 32
            r17 = r5
            long r4 = r2 >> r13
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r5 = r17 >> r13
            int r5 = (int) r5
            float r5 = (float) r5
            float r4 = r4 - r5
            r5 = 0
            float r4 = java.lang.Math.max(r5, r4)
            r6 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r6
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r19
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = r13
            r21 = r14
            long r13 = r17 & r19
            int r13 = (int) r13
            float r13 = (float) r13
            float r2 = r2 - r13
            float r2 = java.lang.Math.max(r5, r2)
            float r2 = r2 / r6
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r4
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r13 = (long) r2
            long r4 = r4 << r3
            long r13 = r13 & r19
            long r5 = r4 | r13
            int r2 = r12.f267
            r4 = 1
            if (r2 != r4) goto Ldf
            r2 = 1
            goto Le0
        Ldf:
            r2 = 0
        Le0:
            long r12 = r12.f261
            long r14 = r12 >> r3
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            long r12 = r12 & r19
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            r25 = r3
            long r3 = r5 >> r25
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r2 = (float) r2
            float r3 = r3 * r2
            r4 = r14
            long r13 = r21 >> r25
            int r13 = (int) r13
            float r13 = (float) r13
            float r13 = r13 + r3
            long r5 = r5 & r19
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = r5 * r2
            r25 = r1
            long r1 = r21 & r19
            int r1 = (int) r1
            float r1 = (float) r1
            float r1 = r1 + r5
            float r2 = -r3
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L117
            r2 = 1
            goto L118
        L117:
            r2 = 0
        L118:
            int r3 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r3 <= 0) goto L11e
            r3 = 1
            goto L11f
        L11e:
            r3 = 0
        L11f:
            r2 = r2 | r3
            float r3 = -r5
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L127
            r3 = 1
            goto L128
        L127:
            r3 = 0
        L128:
            r2 = r2 | r3
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 <= 0) goto L12f
            r1 = 1
            goto L130
        L12f:
            r1 = 0
        L130:
            r1 = r1 | r2
            if (r1 == 0) goto L134
            goto L141
        L134:
            int r11 = r11 + 1
            r1 = r25
            r6 = r16
            r2 = 0
            r3 = 2
            r5 = 1
            goto L74
        L13f:
            r16 = r6
        L141:
            r1 = 1
            goto L147
        L143:
            r25 = r1
            r16 = r6
        L147:
            int r2 = r8.f11295
            r3 = 2
            if (r2 != r3) goto L153
            qm1 r1 = r0.f9143
            r4 = 1
            r1.f9050 = r4
            r1 = r4
            goto L154
        L153:
            r4 = 1
        L154:
            r0.f9142 = r7
            r0.f9139 = r8
            r0.f9140 = r1
            r0.f9141 = r3
            wh1 r2 = p000.wh1.f11722
            java.lang.Object r2 = r7.m1638(r2, r0)
            r5 = r16
            if (r2 != r5) goto L167
        L166:
            return r5
        L167:
            r23 = r8
            r8 = r7
            r7 = r23
        L16c:
            vh1 r2 = (p000.vh1) r2
            java.lang.Object r2 = r2.f11293
            int r6 = r2.size()
            r9 = 0
        L175:
            if (r9 >= r6) goto L188
            java.lang.Object r10 = r2.get(r9)
            ai1 r10 = (p000.ai1) r10
            boolean r10 = r10.m170()
            if (r10 == 0) goto L185
            r1 = r4
            goto L188
        L185:
            int r9 = r9 + 1
            goto L175
        L188:
            um1 r2 = r0.f9144
            java.lang.Object r6 = r2.f10912
            ai1 r6 = (p000.ai1) r6
            long r9 = r6.f259
            boolean r6 = p000.AbstractC0812sv.m5574(r7, r9)
            java.lang.Object r7 = r7.f11293
            um1 r9 = r0.f9145
            if (r6 == 0) goto L1c1
            int r6 = r7.size()
            r10 = 0
        L19f:
            if (r10 >= r6) goto L1b0
            java.lang.Object r11 = r7.get(r10)
            r12 = r11
            ai1 r12 = (p000.ai1) r12
            boolean r12 = r12.f262
            if (r12 == 0) goto L1ad
            goto L1b1
        L1ad:
            int r10 = r10 + 1
            goto L19f
        L1b0:
            r11 = 0
        L1b1:
            ai1 r11 = (p000.ai1) r11
            if (r11 == 0) goto L1ba
            r2.f10912 = r11
            r9.f10912 = r11
            goto L1e4
        L1ba:
            r1 = r4
            r6 = r5
            r7 = r8
            r2 = 0
            r5 = r1
            goto L3c
        L1c1:
            int r6 = r7.size()
            r10 = 0
        L1c6:
            if (r10 >= r6) goto L1e1
            java.lang.Object r11 = r7.get(r10)
            r12 = r11
            ai1 r12 = (p000.ai1) r12
            long r12 = r12.f259
            java.lang.Object r14 = r2.f10912
            ai1 r14 = (p000.ai1) r14
            long r14 = r14.f259
            boolean r12 = p000.u81.m5805(r12, r14)
            if (r12 == 0) goto L1de
            goto L1e2
        L1de:
            int r10 = r10 + 1
            goto L1c6
        L1e1:
            r11 = 0
        L1e2:
            r9.f10912 = r11
        L1e4:
            r6 = r5
            r7 = r8
            r2 = 0
            r5 = r4
            goto L3c
        L1ea:
            s62 r0 = p000.s62.f9751
            return r0
    }
}
