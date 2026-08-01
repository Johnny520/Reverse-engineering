package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class il1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5110;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f5111;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f5112;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f5113;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f5114;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f5115;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ java.lang.Object f5116;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ java.lang.Object f5117;

    /* JADX INFO: renamed from: ν */
    public final /* synthetic */ java.lang.Object f5118;

    /* JADX INFO: renamed from: ξ */
    public final /* synthetic */ java.lang.Object f5119;

    public /* synthetic */ il1(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, android.widget.TextView r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, int r10) {
            r0 = this;
            r0.f5110 = r10
            r0.f5111 = r1
            r0.f5112 = r2
            r0.f5113 = r3
            r0.f5114 = r4
            r0.f5115 = r5
            r0.f5116 = r6
            r0.f5117 = r7
            r0.f5118 = r8
            r0.f5119 = r9
            r0.<init>()
            return
    }

    public /* synthetic */ il1(p000.kl1 r2, p000.c21 r3, p000.c21 r4, java.util.List r5, java.util.List r6, p000.c21 r7, java.util.List r8, p000.c21 r9, java.util.Set r10) {
            r1 = this;
            r0 = 0
            r1.f5110 = r0
            r1.<init>()
            r1.f5111 = r2
            r1.f5112 = r3
            r1.f5113 = r4
            r1.f5116 = r5
            r1.f5117 = r6
            r1.f5114 = r7
            r1.f5118 = r8
            r1.f5115 = r9
            r1.f5119 = r10
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r29) {
            r28 = this;
            r0 = r28
            int r1 = r0.f5110
            switch(r1) {
                case 0: goto Lf2;
                case 1: goto Lad;
                case 2: goto L75;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f5111
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r2 = r0.f5112
            android.widget.ListView r2 = (android.widget.ListView) r2
            java.lang.Object r3 = r0.f5113
            android.widget.Button r3 = (android.widget.Button) r3
            java.lang.Object r4 = r0.f5114
            android.widget.Button r4 = (android.widget.Button) r4
            java.lang.Object r5 = r0.f5115
            va2 r5 = (p000.va2) r5
            java.lang.Object r6 = r0.f5116
            na2 r6 = (p000.na2) r6
            java.lang.Object r7 = r0.f5117
            android.widget.ProgressBar r7 = (android.widget.ProgressBar) r7
            java.lang.Object r8 = r0.f5118
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r0 = r0.f5119
            android.app.Dialog r0 = (android.app.Dialog) r0
            r9 = r29
            qa2 r9 = (p000.qa2) r9
            r9.getClass()
            int r10 = r1.getVisibility()
            if (r10 != 0) goto L39
            goto L72
        L39:
            r10 = 0
            r1.setVisibility(r10)
            r2.setEnabled(r10)
            r3.setEnabled(r10)
            r4.setEnabled(r10)
            java.lang.String r2 = r9.f8944
            java.lang.String r3 = "准备处理 "
            java.lang.String r2 = r3.concat(r2)
            r1.setVisibility(r10)
            r7.setIndeterminate(r10)
            r3 = 100
            int r3 = p000.j81.m2906(r10, r10, r3)
            r7.setProgress(r3)
            r8.setText(r2)
            r5.m6142()
            eb2 r2 = new eb2
            r2.<init>(r1, r7, r8)
            z61 r1 = new z61
            r3 = 11
            r1.<init>(r5, r3, r0)
            r6.mo10(r9, r2, r1)
        L72:
            s62 r0 = p000.s62.f9751
            return r0
        L75:
            java.lang.Object r1 = r0.f5111
            r7 = r1
            um1 r7 = (p000.um1) r7
            java.lang.Object r1 = r0.f5112
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Object r2 = r0.f5113
            um1 r2 = (p000.um1) r2
            java.lang.Object r3 = r0.f5114
            android.widget.EditText r3 = (android.widget.EditText) r3
            java.lang.Object r4 = r0.f5115
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r5 = r0.f5116
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r6 = r0.f5117
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Object r8 = r0.f5118
            qm1 r8 = (p000.qm1) r8
            java.lang.Object r0 = r0.f5119
            r9 = r0
            qm1 r9 = (p000.qm1) r9
            r0 = r29
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r0 = r1[r0]
            r7.f10912 = r0
            p000.bv1.m1052(r2, r3, r4, r5, r6, r7, r8, r9)
        Laa:
            s62 r0 = p000.s62.f9751
            return r0
        Lad:
            java.lang.Object r1 = r0.f5111
            r2 = r1
            um1 r2 = (p000.um1) r2
            java.lang.Object r1 = r0.f5112
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.f5113
            android.widget.EditText r3 = (android.widget.EditText) r3
            java.lang.Object r4 = r0.f5114
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r5 = r0.f5115
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r6 = r0.f5116
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Object r7 = r0.f5117
            um1 r7 = (p000.um1) r7
            java.lang.Object r8 = r0.f5118
            qm1 r8 = (p000.qm1) r8
            java.lang.Object r0 = r0.f5119
            r9 = r0
            qm1 r9 = (p000.qm1) r9
            r0 = r29
            a80 r0 = (p000.a80) r0
            r0.getClass()
            r2.f10912 = r1
            r3.setText(r1)
            android.text.Editable r0 = r3.getText()
            if (r0 == 0) goto Lea
            int r0 = r0.length()
            goto Leb
        Lea:
            r0 = 0
        Leb:
            r3.setSelection(r0)
            p000.bv1.m1052(r2, r3, r4, r5, r6, r7, r8, r9)
            goto Laa
        Lf2:
            java.lang.Object r1 = r0.f5111
            r2 = r1
            kl1 r2 = (p000.kl1) r2
            java.lang.Object r1 = r0.f5112
            r8 = r1
            c21 r8 = (p000.c21) r8
            java.lang.Object r1 = r0.f5113
            r9 = r1
            c21 r9 = (p000.c21) r9
            java.lang.Object r1 = r0.f5116
            r3 = r1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r0.f5117
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r1 = r0.f5114
            r6 = r1
            c21 r6 = (p000.c21) r6
            java.lang.Object r1 = r0.f5118
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r1 = r0.f5115
            r7 = r1
            c21 r7 = (p000.c21) r7
            java.lang.Object r0 = r0.f5119
            java.util.Set r0 = (java.util.Set) r0
            r1 = r29
            java.lang.Long r1 = (java.lang.Long) r1
            long r10 = r1.longValue()
            java.lang.Object r1 = r2.f6003
            monitor-enter(r1)
            boolean r12 = r2.m3334()     // Catch: java.lang.Throwable -> L42c
            monitor-exit(r1)
            r1 = 1
            r13 = 0
            if (r12 == 0) goto L16a
            java.lang.String r12 = "Recomposer:animation"
            android.os.Trace.beginSection(r12)
            k3 r12 = r2.f6001     // Catch: java.lang.Throwable -> L165
            java.lang.Object r12 = r12.f5723     // Catch: java.lang.Throwable -> L165
            b8 r12 = (p000.C0068b8) r12     // Catch: java.lang.Throwable -> L165
            mc r14 = new mc     // Catch: java.lang.Throwable -> L165
            r15 = 0
            r14.<init>(r15, r10)     // Catch: java.lang.Throwable -> L165
            r12.m811(r14)     // Catch: java.lang.Throwable -> L165
            java.lang.Object r10 = p000.ax1.f1362     // Catch: java.lang.Throwable -> L165
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L165
            sa0 r11 = p000.ax1.f1369     // Catch: java.lang.Throwable -> L162
            c21 r11 = r11.f3730     // Catch: java.lang.Throwable -> L162
            if (r11 == 0) goto L157
            boolean r11 = r11.m1114()     // Catch: java.lang.Throwable -> L162
            if (r11 != r1) goto L157
            r11 = r1
            goto L158
        L157:
            r11 = r13
        L158:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L165
            if (r11 == 0) goto L15e
            p000.ax1.m619()     // Catch: java.lang.Throwable -> L165
        L15e:
            android.os.Trace.endSection()
            goto L16a
        L162:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L165
            throw r0     // Catch: java.lang.Throwable -> L165
        L165:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L16a:
            java.lang.String r10 = "Recomposer:recompose"
            android.os.Trace.beginSection(r10)
            r2.m3315()     // Catch: java.lang.Throwable -> L427
            java.lang.Object r10 = r2.f6003     // Catch: java.lang.Throwable -> L427
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L427
            k21 r11 = r2.f6009     // Catch: java.lang.Throwable -> L188
            java.lang.Object[] r12 = r11.f5716     // Catch: java.lang.Throwable -> L188
            int r11 = r11.f5718     // Catch: java.lang.Throwable -> L188
            r14 = r13
        L17c:
            if (r14 >= r11) goto L18b
            r15 = r12[r14]     // Catch: java.lang.Throwable -> L188
            zn r15 = (p000.C1064zn) r15     // Catch: java.lang.Throwable -> L188
            r3.add(r15)     // Catch: java.lang.Throwable -> L188
            int r14 = r14 + 1
            goto L17c
        L188:
            r0 = move-exception
            goto L425
        L18b:
            k21 r11 = r2.f6009     // Catch: java.lang.Throwable -> L188
            r11.m3132()     // Catch: java.lang.Throwable -> L188
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L427
            r8.m1108()     // Catch: java.lang.Throwable -> L427
            r9.m1108()     // Catch: java.lang.Throwable -> L427
        L197:
            boolean r10 = r3.isEmpty()     // Catch: java.lang.Throwable -> L427
            r11 = 0
            if (r10 == 0) goto L346
            boolean r10 = r4.isEmpty()     // Catch: java.lang.Throwable -> L427
            if (r10 != 0) goto L1a6
            goto L346
        L1a6:
            tw1 r0 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L427
            boolean r10 = r0 instanceof p000.f21     // Catch: java.lang.Throwable -> L427
            if (r10 == 0) goto L1bf
            u52 r14 = new u52     // Catch: java.lang.Throwable -> L427
            r15 = r0
            f21 r15 = (p000.f21) r15     // Catch: java.lang.Throwable -> L427
            r18 = 1
            r19 = 0
            r16 = 0
            r17 = 0
            r14.<init>(r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L427
            goto L1c4
        L1bf:
            v52 r14 = new v52     // Catch: java.lang.Throwable -> L427
            r14.<init>(r0, r11, r1, r13)     // Catch: java.lang.Throwable -> L427
        L1c4:
            tw1 r1 = r14.m5760()     // Catch: java.lang.Throwable -> L20d
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L1fa
            if (r0 != 0) goto L215
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L1e1
            r10 = r13
        L1d3:
            if (r10 >= r0) goto L1e3
            java.lang.Object r12 = r5.get(r10)     // Catch: java.lang.Throwable -> L1e1
            zn r12 = (p000.C1064zn) r12     // Catch: java.lang.Throwable -> L1e1
            r7.m1107(r12)     // Catch: java.lang.Throwable -> L1e1
            int r10 = r10 + 1
            goto L1d3
        L1e1:
            r0 = move-exception
            goto L1ff
        L1e3:
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L1e1
            r10 = r13
        L1e8:
            if (r10 >= r0) goto L1f6
            java.lang.Object r12 = r5.get(r10)     // Catch: java.lang.Throwable -> L1e1
            zn r12 = (p000.C1064zn) r12     // Catch: java.lang.Throwable -> L1e1
            r12.m7185()     // Catch: java.lang.Throwable -> L1e1
            int r10 = r10 + 1
            goto L1e8
        L1f6:
            r5.clear()     // Catch: java.lang.Throwable -> L1fa
            goto L215
        L1fa:
            r0 = move-exception
            r24 = r1
            goto L33e
        L1ff:
            r2.m3314(r0, r11)     // Catch: java.lang.Throwable -> L210
            p000.jl1.m2961(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L210
            r5.clear()     // Catch: java.lang.Throwable -> L1fa
            p000.tw1.m5756(r1)     // Catch: java.lang.Throwable -> L20d
            goto L307
        L20d:
            r0 = move-exception
            goto L342
        L210:
            r0 = move-exception
            r5.clear()     // Catch: java.lang.Throwable -> L1fa
            throw r0     // Catch: java.lang.Throwable -> L1fa
        L215:
            boolean r0 = r6.m1114()     // Catch: java.lang.Throwable -> L1fa
            r17 = 255(0xff, double:1.26E-321)
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            if (r0 == 0) goto L298
            r7.m1115(r6)     // Catch: java.lang.Throwable -> L276
            java.lang.Object[] r0 = r6.f1942     // Catch: java.lang.Throwable -> L276
            r28 = 7
            long[] r10 = r6.f1941     // Catch: java.lang.Throwable -> L276
            int r13 = r10.length     // Catch: java.lang.Throwable -> L276
            int r13 = r13 + (-2)
            if (r13 < 0) goto L27a
            r15 = 0
            r21 = 128(0x80, double:6.3E-322)
        L233:
            r23 = 8
            r11 = r10[r15]     // Catch: java.lang.Throwable -> L276
            r25 = r0
            r24 = r1
            long r0 = ~r11
            long r0 = r0 << r28
            long r0 = r0 & r11
            long r0 = r0 & r19
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 == 0) goto L26d
            int r0 = r15 - r13
            int r0 = ~r0
            int r0 = r0 >>> 31
            int r0 = 8 - r0
            r1 = 0
        L24d:
            if (r1 >= r0) goto L269
            long r26 = r11 & r17
            int r26 = (r26 > r21 ? 1 : (r26 == r21 ? 0 : -1))
            if (r26 >= 0) goto L264
            int r26 = r15 << 3
            int r26 = r26 + r1
            r26 = r25[r26]     // Catch: java.lang.Throwable -> L261
            zn r26 = (p000.C1064zn) r26     // Catch: java.lang.Throwable -> L261
            r26.m7187()     // Catch: java.lang.Throwable -> L261
            goto L264
        L261:
            r0 = move-exception
        L262:
            r1 = 0
            goto L285
        L264:
            long r11 = r11 >> r23
            int r1 = r1 + 1
            goto L24d
        L269:
            r1 = r23
            if (r0 != r1) goto L27e
        L26d:
            if (r15 == r13) goto L27e
            int r15 = r15 + 1
            r1 = r24
            r0 = r25
            goto L233
        L276:
            r0 = move-exception
            r24 = r1
            goto L262
        L27a:
            r24 = r1
            r21 = 128(0x80, double:6.3E-322)
        L27e:
            r6.m1108()     // Catch: java.lang.Throwable -> L282
            goto L29e
        L282:
            r0 = move-exception
            goto L33e
        L285:
            r2.m3314(r0, r1)     // Catch: java.lang.Throwable -> L293
            p000.jl1.m2961(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L293
            r6.m1108()     // Catch: java.lang.Throwable -> L282
            p000.tw1.m5756(r24)     // Catch: java.lang.Throwable -> L20d
            goto L307
        L293:
            r0 = move-exception
            r6.m1108()     // Catch: java.lang.Throwable -> L282
            throw r0     // Catch: java.lang.Throwable -> L282
        L298:
            r24 = r1
            r28 = 7
            r21 = 128(0x80, double:6.3E-322)
        L29e:
            boolean r0 = r7.m1114()     // Catch: java.lang.Throwable -> L282
            if (r0 == 0) goto L310
            java.lang.Object[] r0 = r7.f1942     // Catch: java.lang.Throwable -> L2df
            long[] r1 = r7.f1941     // Catch: java.lang.Throwable -> L2df
            int r10 = r1.length     // Catch: java.lang.Throwable -> L2df
            int r10 = r10 + (-2)
            if (r10 < 0) goto L2f7
            r11 = 0
        L2ae:
            r12 = r1[r11]     // Catch: java.lang.Throwable -> L2df
            r15 = r0
            r25 = r1
            long r0 = ~r12     // Catch: java.lang.Throwable -> L2df
            long r0 = r0 << r28
            long r0 = r0 & r12
            long r0 = r0 & r19
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 == 0) goto L2ed
            int r0 = r11 - r10
            int r0 = ~r0     // Catch: java.lang.Throwable -> L2df
            int r0 = r0 >>> 31
            r23 = 8
            int r0 = 8 - r0
            r1 = 0
        L2c7:
            if (r1 >= r0) goto L2e8
            long r26 = r12 & r17
            int r26 = (r26 > r21 ? 1 : (r26 == r21 ? 0 : -1))
            if (r26 >= 0) goto L2da
            int r26 = r11 << 3
            int r26 = r26 + r1
            r26 = r15[r26]     // Catch: java.lang.Throwable -> L2df
            zn r26 = (p000.C1064zn) r26     // Catch: java.lang.Throwable -> L2df
            r26.m7188()     // Catch: java.lang.Throwable -> L2df
        L2da:
            r26 = r1
            r1 = 8
            goto L2e2
        L2df:
            r0 = move-exception
            r1 = 0
            goto L2fb
        L2e2:
            long r12 = r12 >> r1
            int r23 = r26 + 1
            r1 = r23
            goto L2c7
        L2e8:
            r1 = 8
            if (r0 != r1) goto L2f7
            goto L2ef
        L2ed:
            r1 = 8
        L2ef:
            if (r11 == r10) goto L2f7
            int r11 = r11 + 1
            r0 = r15
            r1 = r25
            goto L2ae
        L2f7:
            r7.m1108()     // Catch: java.lang.Throwable -> L282
            goto L310
        L2fb:
            r2.m3314(r0, r1)     // Catch: java.lang.Throwable -> L30b
            p000.jl1.m2961(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L30b
            r7.m1108()     // Catch: java.lang.Throwable -> L282
            p000.tw1.m5756(r24)     // Catch: java.lang.Throwable -> L20d
        L307:
            r14.mo2000()     // Catch: java.lang.Throwable -> L427
            goto L336
        L30b:
            r0 = move-exception
            r7.m1108()     // Catch: java.lang.Throwable -> L282
            throw r0     // Catch: java.lang.Throwable -> L282
        L310:
            p000.tw1.m5756(r24)     // Catch: java.lang.Throwable -> L20d
            r14.mo2000()     // Catch: java.lang.Throwable -> L427
            java.lang.Object r1 = r2.f6003     // Catch: java.lang.Throwable -> L427
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L427
            yd r0 = r2.m3333()     // Catch: java.lang.Throwable -> L33b
            if (r0 != 0) goto L320
            goto L325
        L320:
            java.lang.String r0 = "unexpected to get continuation here"
            p000.AbstractC0804sn.m5526(r0)     // Catch: java.lang.Throwable -> L33b
        L325:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L427
            tw1 r0 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L427
            r0.mo2007()     // Catch: java.lang.Throwable -> L427
            r9.m1108()     // Catch: java.lang.Throwable -> L427
            r8.m1108()     // Catch: java.lang.Throwable -> L427
            r1 = 0
            r2.f6017 = r1     // Catch: java.lang.Throwable -> L427
        L336:
            android.os.Trace.endSection()
            goto L41d
        L33b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L427
            throw r0     // Catch: java.lang.Throwable -> L427
        L33e:
            p000.tw1.m5756(r24)     // Catch: java.lang.Throwable -> L20d
            throw r0     // Catch: java.lang.Throwable -> L20d
        L342:
            r14.mo2000()     // Catch: java.lang.Throwable -> L427
            throw r0     // Catch: java.lang.Throwable -> L427
        L346:
            int r10 = r3.size()     // Catch: java.lang.Throwable -> L35d
            r11 = 0
        L34b:
            if (r11 >= r10) goto L367
            java.lang.Object r12 = r3.get(r11)     // Catch: java.lang.Throwable -> L35d
            zn r12 = (p000.C1064zn) r12     // Catch: java.lang.Throwable -> L35d
            zn r13 = r2.m3313(r12, r8)     // Catch: java.lang.Throwable -> L35d
            if (r13 == 0) goto L361
            r5.add(r13)     // Catch: java.lang.Throwable -> L35d
            goto L361
        L35d:
            r0 = move-exception
            r1 = 0
            goto L412
        L361:
            r9.m1107(r12)     // Catch: java.lang.Throwable -> L35d
            int r11 = r11 + 1
            goto L34b
        L367:
            r3.clear()     // Catch: java.lang.Throwable -> L427
            boolean r10 = r8.m1114()     // Catch: java.lang.Throwable -> L427
            if (r10 != 0) goto L376
            k21 r10 = r2.f6009     // Catch: java.lang.Throwable -> L427
            int r10 = r10.f5718     // Catch: java.lang.Throwable -> L427
            if (r10 == 0) goto L3d6
        L376:
            java.lang.Object r10 = r2.f6003     // Catch: java.lang.Throwable -> L427
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L427
            java.util.List r11 = r2.m3310()     // Catch: java.lang.Throwable -> L39a
            int r12 = r11.size()     // Catch: java.lang.Throwable -> L39a
            r13 = 0
        L382:
            if (r13 >= r12) goto L3a0
            java.lang.Object r14 = r11.get(r13)     // Catch: java.lang.Throwable -> L39a
            zn r14 = (p000.C1064zn) r14     // Catch: java.lang.Throwable -> L39a
            boolean r15 = r9.m1109(r14)     // Catch: java.lang.Throwable -> L39a
            if (r15 != 0) goto L39d
            boolean r15 = r14.m7202(r0)     // Catch: java.lang.Throwable -> L39a
            if (r15 == 0) goto L39d
            r3.add(r14)     // Catch: java.lang.Throwable -> L39a
            goto L39d
        L39a:
            r0 = move-exception
            goto L410
        L39d:
            int r13 = r13 + 1
            goto L382
        L3a0:
            k21 r11 = r2.f6009     // Catch: java.lang.Throwable -> L39a
            int r12 = r11.f5718     // Catch: java.lang.Throwable -> L39a
            r13 = 0
            r14 = 0
        L3a6:
            java.lang.Object[] r15 = r11.f5716
            if (r13 >= r12) goto L3cd
            r15 = r15[r13]     // Catch: java.lang.Throwable -> L39a
            zn r15 = (p000.C1064zn) r15     // Catch: java.lang.Throwable -> L39a
            boolean r17 = r9.m1109(r15)     // Catch: java.lang.Throwable -> L39a
            if (r17 != 0) goto L3c0
            boolean r17 = r3.contains(r15)     // Catch: java.lang.Throwable -> L39a
            if (r17 != 0) goto L3c0
            r3.add(r15)     // Catch: java.lang.Throwable -> L39a
            int r14 = r14 + 1
            goto L3ca
        L3c0:
            if (r14 <= 0) goto L3ca
            java.lang.Object[] r15 = r11.f5716     // Catch: java.lang.Throwable -> L39a
            int r17 = r13 - r14
            r18 = r15[r13]     // Catch: java.lang.Throwable -> L39a
            r15[r17] = r18     // Catch: java.lang.Throwable -> L39a
        L3ca:
            int r13 = r13 + 1
            goto L3a6
        L3cd:
            int r13 = r12 - r14
            r14 = 0
            java.util.Arrays.fill(r15, r13, r12, r14)     // Catch: java.lang.Throwable -> L39a
            r11.f5718 = r13     // Catch: java.lang.Throwable -> L39a
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L427
        L3d6:
            boolean r10 = r3.isEmpty()     // Catch: java.lang.Throwable -> L427
            if (r10 == 0) goto L405
            p000.jl1.m2962(r4, r2)     // Catch: java.lang.Throwable -> L402
        L3df:
            boolean r10 = r4.isEmpty()     // Catch: java.lang.Throwable -> L402
            if (r10 != 0) goto L405
            java.util.List r10 = r2.m3312(r4, r8)     // Catch: java.lang.Throwable -> L402
            r6.getClass()     // Catch: java.lang.Throwable -> L402
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L402
        L3f0:
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L402
            if (r11 == 0) goto L3fe
            java.lang.Object r11 = r10.next()     // Catch: java.lang.Throwable -> L402
            r6.m1116(r11)     // Catch: java.lang.Throwable -> L402
            goto L3f0
        L3fe:
            p000.jl1.m2962(r4, r2)     // Catch: java.lang.Throwable -> L402
            goto L3df
        L402:
            r0 = move-exception
            r1 = 0
            goto L408
        L405:
            r13 = 0
            goto L197
        L408:
            r2.m3314(r0, r1)     // Catch: java.lang.Throwable -> L427
            p000.jl1.m2961(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L427
            goto L336
        L410:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L427
            throw r0     // Catch: java.lang.Throwable -> L427
        L412:
            r2.m3314(r0, r1)     // Catch: java.lang.Throwable -> L420
            p000.jl1.m2961(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L420
            r3.clear()     // Catch: java.lang.Throwable -> L427
            goto L336
        L41d:
            s62 r0 = p000.s62.f9751
            return r0
        L420:
            r0 = move-exception
            r3.clear()     // Catch: java.lang.Throwable -> L427
            throw r0     // Catch: java.lang.Throwable -> L427
        L425:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L427
            throw r0     // Catch: java.lang.Throwable -> L427
        L427:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L42c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
