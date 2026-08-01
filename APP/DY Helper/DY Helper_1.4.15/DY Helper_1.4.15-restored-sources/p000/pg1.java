package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class pg1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f8551 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f8552 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f8553 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f8554 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f8555 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicLong f8556 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.atomic.AtomicReference f8557 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.pg1.f8551 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.pg1.f8552 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.pg1.f8553 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.pg1.f8554 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.pg1.f8555 = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p000.pg1.f8556 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            p000.pg1.f8557 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.l91 m4525(java.lang.ClassLoader r16, p000.ky1 r17, java.util.ArrayList r18, java.util.HashSet r19, java.lang.String r20) {
            r0 = r17
            r1 = r19
            r2 = r20
            f7 r3 = new f7
            r4 = 1
            r5 = r18
            r3.<init>(r4, r5)
            og1 r4 = p000.og1.f8098
            y30 r5 = new y30
            r6 = 1
            r5.<init>(r3, r6, r4)
            cf1 r3 = new cf1
            r4 = 11
            r3.<init>(r4)
            bu r4 = new bu
            java.util.Iterator r5 = r5.iterator()
            r4.<init>(r5, r3)
            r3 = 0
            r5 = r3
        L28:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lcb
            java.lang.Object r7 = r4.next()
            r9 = r7
            tf1 r9 = (p000.tf1) r9
            long r7 = r0.f6323
            java.lang.String r10 = r9.f10354
            java.lang.String r14 = r9.f10353
            if (r10 != 0) goto L3e
            r10 = r14
        L3e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            java.lang.String r7 = ":"
            r11.append(r7)
            r11.append(r10)
            java.lang.String r7 = r11.toString()
            boolean r8 = r1.contains(r7)
            if (r8 != 0) goto L28
            java.lang.String r10 = r0.f6322
            long r11 = r0.f6323
            int r13 = r0.f6325
            r8 = r16
            rf1 r9 = p000.xn0.m6715(r8, r9, r10, r11, r13)
            java.lang.Object r8 = r9.f9362
            boolean r10 = r9.m5085()
            java.lang.String r12 = " taskId="
            java.lang.String r13 = "r86c859e3375e752"
            if (r10 == 0) goto L96
            r10 = r8
            sf1 r10 = (p000.sf1) r10
            if (r10 == 0) goto L96
            int r11 = r10.f9887
            int r10 = r10.f9889
            r15 = 12057(0x2f19, float:1.6895E-41)
            int[] r10 = new int[]{r11, r10}
            boolean r10 = com.example.dyhelper.core.protection.ProtectionNativeBridge.m1316(r15, r10)
            if (r10 != r6) goto L96
            r1.add(r7)
            int r3 = r3 + 1
            java.lang.String r7 = "生产领取成功 name="
            java.lang.String r7 = p000.a12.m18(r7, r2, r12, r14)
            r8 = 4
            r9 = 0
            p000.C0888ux.m5988(r13, r7, r9, r8, r9)
            goto Lc4
        L96:
            int r5 = r5 + 1
            java.lang.Throwable r7 = r9.f9363
            if (r7 == 0) goto La2
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto Lb0
        La2:
            sf1 r8 = (p000.sf1) r8
            if (r8 == 0) goto La9
            java.lang.String r9 = r8.f9890
            goto Laa
        La9:
            r9 = 0
        Laa:
            if (r9 != 0) goto Laf
            java.lang.String r7 = "unknown"
            goto Lb0
        Laf:
            r7 = r9
        Lb0:
            java.lang.String r8 = "生产领取失败 name="
            java.lang.String r9 = " error="
            java.lang.StringBuilder r8 = p000.lz1.m3695(r8, r2, r12, r14, r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = 4
            r9 = 0
            p000.C0888ux.m5979(r13, r7, r9, r8, r9)
        Lc4:
            r7 = 300(0x12c, double:1.48E-321)
            m4536(r7)
            goto L28
        Lcb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            l91 r2 = new l91
            r2.<init>(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static p000.mg1 m4526(java.lang.String r9, int r10) {
            mg1 r0 = new mg1
            r5 = 0
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r8 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static p000.mg1 m4527(android.app.Activity r49, p000.lg1 r50) {
            r1 = r49
            r4 = r50
            my1 r8 = r4.f6630
            xn0 r9 = p000.xn0.f12242
            ky1 r10 = r4.f6629
            boolean r11 = r4.f6626
            kg1 r12 = r4.f6623
            java.util.concurrent.ConcurrentHashMap r0 = p000.ry1.f9620
            java.util.Map r0 = p000.ex0.m1975(r0)
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            f7 r0 = p000.AbstractC0984xh.m6661(r0)
            cf1 r2 = new cf1
            r3 = 12
            r2.<init>(r3)
            y30 r3 = new y30
            r13 = 1
            r3.<init>(r0, r13, r2)
            bf1 r0 = new bf1
            r0.<init>(r10, r13)
            y30 r2 = new y30
            r2.<init>(r3, r13, r0)
            ib1 r0 = new ib1
            r3 = 15
            r0.<init>(r3)
            java.util.List r2 = p000.us1.m5949(r2)
            p000.AbstractC0019ai.m168(r2, r0)
            java.util.Iterator r0 = r2.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L50
            jz r0 = p000.C0450jz.f5672
            goto L72
        L50:
            java.lang.Object r2 = r0.next()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L5f
            java.util.List r0 = p000.AbstractC1021yh.m6896(r2)
            goto L72
        L5f:
            java.util.ArrayList r2 = p000.lz1.m3696(r2)
        L63:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r0.next()
            r2.add(r3)
            goto L63
        L71:
            r0 = r2
        L72:
            boolean r2 = r0.isEmpty()
            r14 = 0
            if (r2 == 0) goto L83
            java.lang.String r0 = "没有已识别的小火人单聊会话"
            m4528(r1, r4, r14, r0, r13)
            mg1 r0 = m4526(r0, r13)
            return r0
        L83:
            int[] r2 = p000.ng1.f7616
            int r3 = r12.ordinal()
            r2 = r2[r3]
            if (r2 != r13) goto L8f
            r15 = r13
            goto L92
        L8f:
            boolean r2 = r4.f6624
            r15 = r2
        L92:
            boolean r2 = r4.f6625
            kg1 r3 = p000.kg1.f5912
            if (r12 != r3) goto L9a
            r3 = r0
            goto Lc4
        L9a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r0.iterator()
        La3:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lc4
            java.lang.Object r6 = r5.next()
            r7 = r6
            ky1 r7 = (p000.ky1) r7
            ry1 r16 = p000.ry1.f9602
            if (r10 == 0) goto Lb6
            r13 = r8
            goto Lb7
        Lb6:
            r13 = r14
        Lb7:
            iy1 r7 = p000.ry1.m5203(r7, r15, r2, r13)
            boolean r7 = r7.f5246
            if (r7 == 0) goto Lc2
            r3.add(r6)
        Lc2:
            r13 = 1
            goto La3
        Lc4:
            boolean r5 = r3.isEmpty()
            r13 = 0
            if (r5 == 0) goto Ld5
            java.lang.String r0 = "所有会话均被人员规则排除"
            m4528(r1, r4, r14, r0, r13)
            mg1 r0 = m4526(r0, r13)
            return r0
        Ld5:
            java.util.concurrent.atomic.AtomicReference r5 = p000.ry1.f9578
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto Le8
            java.lang.Class r5 = r5.getClass()
            java.lang.ClassLoader r5 = r5.getClassLoader()
            if (r5 == 0) goto Le8
            goto Lf0
        Le8:
            java.lang.Class r5 = r1.getClass()
            java.lang.ClassLoader r5 = r5.getClassLoader()
        Lf0:
            java.lang.String r6 = m4531(r12)
            java.lang.String r7 = m4532(r12)
            int r14 = r3.size()
            java.lang.String r13 = "准备处理 0/"
            java.lang.String r13 = p000.a12.m17(r13, r14)
            boolean r14 = m4539(r4)
            if (r14 != 0) goto L10a
            r14 = 0
            goto L110
        L10a:
            android.os.Handler r14 = com.example.dyhelper.p002ui.C0182.f2694
            r14 = 0
            com.example.dyhelper.p002ui.C0182.m1599(r14, r1, r6, r7, r13)
        L110:
            int r0 = r0.size()
            int r13 = r3.size()
            int r13 = r0 - r13
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.Iterator r19 = r3.iterator()
            r22 = r0
            r20 = r8
            r25 = r10
            r26 = r11
            r27 = r13
            r0 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r21 = 0
            r23 = 0
            r24 = 0
        L13d:
            boolean r28 = r19.hasNext()
            r29 = r13
            kg1 r13 = p000.kg1.f5914
            java.lang.String r30 = ""
            r31 = 300(0x12c, double:1.48E-321)
            r33 = r11
            java.lang.String r11 = "r86c859e3375e752"
            if (r28 == 0) goto L5be
            r28 = r10
            int r10 = r8 + 1
            java.lang.Object r34 = r19.next()
            r35 = r8
            r8 = r34
            ky1 r8 = (p000.ky1) r8
            java.lang.Thread r34 = java.lang.Thread.currentThread()
            boolean r34 = r34.isInterrupted()
            if (r34 != 0) goto L176
            if (r12 != r13) goto L189
            boolean r34 = m4529()
            if (r34 != 0) goto L189
            java.lang.String r2 = "每日火星任务执行中被关闭，停止后续会话"
            r8 = 4
            r10 = 0
            p000.C0888ux.m5988(r11, r2, r10, r8, r10)
        L176:
            r39 = r0
            r36 = r3
            r45 = r5
            r38 = r9
        L17e:
            r15 = r11
            r10 = r12
            r37 = r14
            r11 = r22
            r14 = r7
            r7 = r6
            r6 = r4
            goto L5ca
        L189:
            ry1 r34 = p000.ry1.f9602
            r34 = r3
            java.lang.String r3 = p000.ry1.m5197(r8)
            r37 = r11
            r36 = r12
            long r11 = r8.f6323
            int r38 = r35 * 75
            int r4 = r34.size()
            r39 = r0
            r0 = 1
            if (r4 >= r0) goto L1a3
            r4 = 1
        L1a3:
            int r0 = r38 / r4
            int r4 = r34.size()
            r38 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            r40 = r2
            java.lang.String r2 = " · 读取任务 "
            r13.append(r2)
            r13.append(r10)
            java.lang.String r2 = "/"
            r13.append(r2)
            r13.append(r4)
            java.lang.String r2 = r13.toString()
            boolean r4 = m4539(r50)
            if (r4 != 0) goto L1d0
            goto L1d3
        L1d0:
            com.example.dyhelper.p002ui.C0182.m1600(r1, r6, r7, r2, r0)
        L1d3:
            r5.getClass()
            rf1 r2 = r9.m6760(r5, r11)
            java.lang.Object r4 = r2.f9362
            gg1 r4 = (p000.gg1) r4
            boolean r13 = r2.m5085()
            if (r13 == 0) goto L555
            if (r4 == 0) goto L555
            int r13 = r4.f4365
            if (r13 != 0) goto L555
            int r13 = r39 + 1
            java.util.ArrayList r2 = r4.m2311()
            if (r26 == 0) goto L20f
            l91 r4 = m4525(r5, r8, r2, r14, r3)
            r41 = r0
            java.lang.Object r0 = r4.f6502
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + r24
            java.lang.Object r4 = r4.f6503
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r23 = r4 + r23
            r24 = r0
            goto L211
        L20f:
            r41 = r0
        L211:
            if (r25 == 0) goto L218
            r0 = r20
        L215:
            r4 = r40
            goto L21a
        L218:
            r0 = 0
            goto L215
        L21a:
            iy1 r0 = p000.ry1.m5203(r8, r15, r4, r0)
            kg1 r1 = p000.kg1.f5913
            r40 = r8
            kg1 r8 = p000.kg1.f5915
            r42 = r10
            r10 = r36
            if (r10 == r1) goto L258
            r1 = r38
            if (r10 == r1) goto L230
            if (r10 != r8) goto L233
        L230:
            r38 = r1
            goto L258
        L233:
            r43 = r2
            r44 = r4
            r45 = r5
            r38 = r9
            r46 = r11
            r11 = r22
            r36 = r34
            r2 = r40
            r48 = r41
            r12 = r0
            r9 = r3
            r22 = r13
            r34 = r15
            r15 = r37
            r13 = r1
            r37 = r14
            r1 = r49
        L252:
            r14 = r7
            r7 = r6
            r6 = r50
            goto L45e
        L258:
            boolean r1 = r0.f5247
            if (r1 == 0) goto L44a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r36 = r2.iterator()
        L265:
            boolean r39 = r36.hasNext()
            if (r39 == 0) goto L291
            r39 = r0
            java.lang.Object r0 = r36.next()
            r43 = r2
            r2 = r0
            tf1 r2 = (p000.tf1) r2
            r44 = r4
            int r4 = r2.f10355
            r45 = r2
            r2 = 1
            if (r4 != r2) goto L28a
            fg1 r2 = r45.m5632()
            fg1 r4 = p000.fg1.f3929
            if (r2 != r4) goto L28a
            r1.add(r0)
        L28a:
            r0 = r39
            r2 = r43
            r4 = r44
            goto L265
        L291:
            r39 = r0
            r43 = r2
            r44 = r4
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2a5:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2ca
            java.lang.Object r4 = r1.next()
            r36 = r1
            r1 = r4
            tf1 r1 = (p000.tf1) r1
            r45 = r5
            java.lang.String r5 = r1.f10354
            if (r5 != 0) goto L2bc
            java.lang.String r5 = r1.f10353
        L2bc:
            boolean r1 = r0.add(r5)
            if (r1 == 0) goto L2c5
            r2.add(r4)
        L2c5:
            r1 = r36
            r5 = r45
            goto L2a5
        L2ca:
            r45 = r5
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L42d
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L2e1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2fa
            java.lang.Object r2 = r1.next()
            tf1 r2 = (p000.tf1) r2
            qg1 r4 = p000.rg1.m5088(r2)
            l91 r5 = new l91
            r5.<init>(r2, r4)
            r0.add(r5)
            goto L2e1
        L2fa:
            java.util.Iterator r1 = r0.iterator()
        L2fe:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L310
            java.lang.Object r2 = r1.next()
            r4 = r2
            l91 r4 = (p000.l91) r4
            java.lang.Object r4 = r4.f6503
            if (r4 != 0) goto L2fe
            goto L311
        L310:
            r2 = 0
        L311:
            l91 r2 = (p000.l91) r2
            if (r2 == 0) goto L31a
            java.lang.Object r1 = r2.f6502
            tf1 r1 = (p000.tf1) r1
            goto L31b
        L31a:
            r1 = 0
        L31b:
            if (r1 == 0) goto L350
            int r23 = r23 + 1
            java.lang.String r0 = r1.f10353
            java.lang.String r1 = "任务 "
            java.lang.String r2 = " 数量未知，拒绝发送 name="
            java.lang.String r0 = p000.a12.m18(r1, r0, r2, r3)
            r2 = r37
            r1 = 4
            r4 = 0
            p000.C0888ux.m5979(r2, r0, r4, r1, r4)
        L330:
            r1 = r49
            r46 = r11
            r37 = r14
            r11 = r22
            r36 = r34
            r12 = r39
            r48 = r41
            r14 = r7
            r22 = r13
            r34 = r15
            r13 = r38
            r15 = r2
            r7 = r6
            r38 = r9
            r2 = r40
            r6 = r50
            r9 = r3
            goto L45e
        L350:
            r2 = r37
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L35b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L37b
            java.lang.Object r4 = r0.next()
            l91 r4 = (p000.l91) r4
            java.lang.Object r4 = r4.f6503
            qg1 r4 = (p000.qg1) r4
            if (r4 == 0) goto L374
            int r4 = r4.f9003
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L375
        L374:
            r4 = 0
        L375:
            if (r4 == 0) goto L35b
            r1.add(r4)
            goto L35b
        L37b:
            java.lang.Comparable r0 = p000.AbstractC0984xh.m6647(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L330
            ry1 r36 = p000.ry1.f9602
            if (r25 == 0) goto L38a
            r1 = r20
            goto L38b
        L38a:
            r1 = 0
        L38b:
            boolean r4 = p000.ui1.m5867()
            java.lang.String r5 = "火星任务"
            if (r4 != 0) goto L395
            r1 = 0
            goto L3c9
        L395:
            if (r1 != 0) goto L39b
            my1 r1 = p000.ry1.m5202(r40)
        L39b:
            java.lang.String r1 = r1.f7325
            boolean r4 = p000.q02.m4671(r1)
            if (r4 == 0) goto L3c3
            ly1 r1 = p000.ry1.m5200(r40)
            if (r1 == 0) goto L3ae
            my1 r1 = r1.f6844
            java.lang.String r1 = r1.f7325
            goto L3af
        L3ae:
            r1 = 0
        L3af:
            if (r1 != 0) goto L3b2
            goto L3b4
        L3b2:
            r30 = r1
        L3b4:
            boolean r1 = p000.q02.m4671(r30)
            if (r1 == 0) goto L3c1
            java.lang.String r1 = "pet_elf_mutual_message"
            java.lang.String r1 = p000.ui1.m5893(r1, r5)
            goto L3c3
        L3c1:
            r1 = r30
        L3c3:
            r4 = 48
            java.lang.String r1 = p000.q02.m4693(r1, r4)
        L3c9:
            if (r1 != 0) goto L3ce
            r30 = r5
            goto L3d0
        L3ce:
            r30 = r1
        L3d0:
            int r37 = r0.intValue()
            ig1 r0 = new ig1
            r1 = r15
            r15 = r2
            r2 = r34
            r34 = r1
            r4 = r50
            r5 = r6
            r6 = r7
            r46 = r11
            r11 = r22
            r12 = r39
            r1 = r41
            r7 = r3
            r22 = r13
            r13 = r38
            r3 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r38 = r6
            r6 = r4
            r4 = r37
            r37 = r14
            r14 = r38
            r48 = r1
            r1 = r3
            r38 = r9
            r3 = r30
            r9 = r7
            r7 = r5
            r5 = r0
            r0 = r36
            r36 = r2
            r2 = r40
            oy1 r0 = r0.m5309(r1, r2, r3, r4, r5)
            int r3 = r0.f8346
            int r4 = r33 + r3
            int r0 = r0.f8347
            int r23 = r23 + r0
            if (r21 != 0) goto L41e
            if (r3 <= 0) goto L41c
            goto L41e
        L41c:
            r0 = 0
            goto L41f
        L41e:
            r0 = 1
        L41f:
            if (r3 <= 0) goto L428
            java.lang.Long r3 = java.lang.Long.valueOf(r46)
            r11.add(r3)
        L428:
            r21 = r0
            r33 = r4
            goto L45e
        L42d:
            r1 = r49
            r46 = r11
            r11 = r22
            r36 = r34
            r12 = r39
            r2 = r40
            r48 = r41
        L43b:
            r22 = r13
            r34 = r15
            r15 = r37
            r13 = r38
            r38 = r9
            r37 = r14
            r9 = r3
            goto L252
        L44a:
            r1 = r49
            r43 = r2
            r44 = r4
            r45 = r5
            r46 = r11
            r11 = r22
            r36 = r34
            r2 = r40
            r48 = r41
            r12 = r0
            goto L43b
        L45e:
            if (r10 == r13) goto L462
            if (r10 != r8) goto L49b
        L462:
            boolean r0 = r12.f5248
            if (r0 == 0) goto L49b
            boolean r0 = r43.isEmpty()
            if (r0 == 0) goto L46d
            goto L49b
        L46d:
            java.util.Iterator r0 = r43.iterator()
        L471:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L49b
            java.lang.Object r3 = r0.next()
            tf1 r3 = (p000.tf1) r3
            int r4 = r3.f10355
            r5 = 1
            if (r4 != r5) goto L524
            fg1 r3 = r3.m5632()
            fg1 r4 = p000.fg1.f3930
            if (r3 != r4) goto L524
            android.net.Uri r0 = r6.f6628
            if (r0 != 0) goto L49f
            int r23 = r23 + 1
            java.lang.String r0 = "图片任务已命中但设置中未选择图片 name="
            java.lang.String r0 = r0.concat(r9)
            r4 = 0
            r8 = 4
            p000.C0888ux.m5979(r15, r0, r4, r8, r4)
        L49b:
            r13 = r29
            goto L52a
        L49f:
            java.lang.String r3 = " · 发送任务图片"
            java.lang.String r3 = r9.concat(r3)
            boolean r4 = m4539(r6)
            if (r4 != 0) goto L4ac
            goto L4b1
        L4ac:
            r4 = r48
            com.example.dyhelper.p002ui.C0182.m1600(r1, r7, r14, r3, r4)
        L4b1:
            eg1 r0 = p000.g81.m2285(r1, r2, r0)
            boolean r2 = r0.f3545
            if (r2 == 0) goto L4c5
            int r13 = r29 + 1
            java.lang.Long r0 = java.lang.Long.valueOf(r46)
            r11.add(r0)
            r21 = 1
            goto L52a
        L4c5:
            int r23 = r23 + 1
            bg1 r2 = r0.f3549
            if (r2 == 0) goto L4d3
            boolean r3 = r2.f1710
            r5 = 1
            if (r3 != r5) goto L4d4
            int r3 = r28 + 1
            goto L4d6
        L4d3:
            r5 = 1
        L4d4:
            r3 = r28
        L4d6:
            if (r2 == 0) goto L4de
            boolean r4 = r2.f1710
            if (r4 != r5) goto L4de
            r4 = 1
            goto L4df
        L4de:
            r4 = 0
        L4df:
            int r5 = r0.f3546
            int r8 = r0.f3547
            java.lang.String r0 = r0.f3548
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "图片任务发送失败 name="
            r12.<init>(r13)
            r12.append(r9)
            java.lang.String r9 = " retryable="
            r12.append(r9)
            r12.append(r4)
            java.lang.String r4 = " kind="
            r12.append(r4)
            r12.append(r2)
            java.lang.String r2 = " bridge="
            r12.append(r2)
            r12.append(r5)
            java.lang.String r2 = " image="
            r12.append(r2)
            r12.append(r8)
            java.lang.String r2 = " detail="
            r12.append(r2)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r4 = 0
            r8 = 4
            p000.C0888ux.m5979(r15, r0, r4, r8, r4)
            r28 = r3
            goto L49b
        L524:
            r4 = r48
            r48 = r4
            goto L471
        L52a:
            int r0 = r36.size()
            r16 = 1
            int r0 = r0 + (-1)
            r3 = r35
            if (r3 >= r0) goto L539
            m4536(r31)
        L539:
            r4 = r6
            r6 = r7
            r12 = r10
            r7 = r14
            r0 = r22
            r10 = r28
            r15 = r34
            r3 = r36
            r14 = r37
            r9 = r38
            r8 = r42
            r2 = r44
            r5 = r45
            r22 = r11
            r11 = r33
            goto L13d
        L555:
            r45 = r5
            r38 = r9
            r42 = r10
            r11 = r22
            r10 = r36
            r44 = r40
            r9 = r3
            r36 = r34
            r3 = r35
            r34 = r15
            r15 = r37
            r37 = r14
            r14 = r7
            r7 = r6
            r6 = r50
            int r23 = r23 + 1
            java.lang.Throwable r0 = r2.f9363
            if (r0 == 0) goto L57c
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L586
        L57c:
            if (r4 == 0) goto L581
            java.lang.String r0 = r4.f4366
            goto L582
        L581:
            r0 = 0
        L582:
            if (r0 != 0) goto L586
            java.lang.String r0 = "unknown"
        L586:
            java.lang.String r2 = "生产任务列表失败 name="
            java.lang.String r4 = " error="
            java.lang.String r0 = p000.a12.m18(r2, r9, r4, r0)
            r4 = 0
            r8 = 4
            p000.C0888ux.m5979(r15, r0, r4, r8, r4)
            int r0 = r36.size()
            r16 = 1
            int r0 = r0 + (-1)
            if (r3 >= r0) goto L5a0
            m4536(r31)
        L5a0:
            r4 = r6
            r6 = r7
            r12 = r10
            r22 = r11
            r7 = r14
            r10 = r28
            r13 = r29
            r11 = r33
            r15 = r34
            r3 = r36
            r14 = r37
            r9 = r38
            r0 = r39
            r8 = r42
            r2 = r44
            r5 = r45
            goto L13d
        L5be:
            r39 = r0
            r36 = r3
            r45 = r5
            r38 = r9
            r28 = r10
            goto L17e
        L5ca:
            r0 = 3
            if (r26 == 0) goto L6e3
            if (r21 == 0) goto L6e3
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            boolean r2 = r2.isInterrupted()
            if (r2 != 0) goto L6e3
            if (r10 != r13) goto L5e1
            boolean r2 = m4529()
            if (r2 == 0) goto L6e3
        L5e1:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r36.iterator()
        L5ea:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L607
            java.lang.Object r4 = r3.next()
            r5 = r4
            ky1 r5 = (p000.ky1) r5
            long r8 = r5.f6323
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            boolean r5 = r11.contains(r5)
            if (r5 == 0) goto L5ea
            r2.add(r4)
            goto L5ea
        L607:
            r3 = 0
        L608:
            if (r3 >= r0) goto L6e3
            r4 = 2500(0x9c4, double:1.235E-320)
            m4536(r4)
            java.util.Iterator r4 = r2.iterator()
            r5 = 0
        L614:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L6d1
            int r8 = r5 + 1
            java.lang.Object r9 = r4.next()
            ky1 r9 = (p000.ky1) r9
            ry1 r11 = p000.ry1.f9602
            java.lang.String r11 = p000.ry1.m5197(r9)
            int r12 = r2.size()
            int r12 = r12 * r3
            int r12 = r12 + r5
            r13 = 1
            int r12 = r12 + r13
            r19 = r0
            int r0 = r2.size()
            if (r0 >= r13) goto L639
            r0 = 1
        L639:
            int r0 = r0 * 3
            int r13 = r3 + 1
            r20 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r21 = r2
            java.lang.String r2 = " · 刷新领取 "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r2 = "/3"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r12 = r12 * 25
            int r12 = r12 / r20
            int r12 = r12 + 75
            boolean r2 = m4539(r6)
            if (r2 != 0) goto L667
            goto L66a
        L667:
            com.example.dyhelper.p002ui.C0182.m1600(r1, r7, r14, r0, r12)
        L66a:
            r45.getClass()
            long r12 = r9.f6323
            r0 = r38
            r2 = r45
            rf1 r12 = r0.m6760(r2, r12)
            java.lang.Object r13 = r12.f9362
            gg1 r13 = (p000.gg1) r13
            boolean r12 = r12.m5085()
            if (r12 == 0) goto L6bf
            if (r13 == 0) goto L6bf
            int r12 = r13.f4365
            if (r12 != 0) goto L6bf
            java.util.ArrayList r12 = r13.m2311()
            r13 = r37
            l91 r9 = m4525(r2, r9, r12, r13, r11)
            java.lang.Object r11 = r9.f6502
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            int r24 = r11 + r24
            java.lang.Object r9 = r9.f6503
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r23 = r9 + r23
            int r9 = r21.size()
            r16 = 1
            int r9 = r9 + (-1)
            if (r5 >= r9) goto L6b2
            m4536(r31)
        L6b2:
            r38 = r0
            r45 = r2
            r5 = r8
            r37 = r13
            r0 = r19
            r2 = r21
            goto L614
        L6bf:
            r13 = r37
            int r23 = r23 + 1
            int r9 = r21.size()
            r16 = 1
            int r9 = r9 + (-1)
            if (r5 >= r9) goto L6b2
            m4536(r31)
            goto L6b2
        L6d1:
            r19 = r0
            r21 = r2
            r13 = r37
            r0 = r38
            r2 = r45
            int r3 = r3 + 1
            r0 = r19
            r2 = r21
            goto L608
        L6e3:
            r19 = r0
            r0 = r23
            r2 = r24
            if (r28 <= 0) goto L6f6
            java.lang.String r3 = "，待重试 "
            r4 = r28
            java.lang.String r30 = p000.a12.m17(r3, r4)
        L6f3:
            r3 = r30
            goto L6f9
        L6f6:
            r4 = r28
            goto L6f3
        L6f9:
            java.lang.String r5 = "，文本 "
            java.lang.String r7 = "，图片 "
            java.lang.String r8 = "会话 "
            r11 = r33
            r9 = r39
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4136(r8, r9, r5, r11, r7)
            java.lang.String r7 = "，领取 "
            java.lang.String r8 = "，跳过 "
            r13 = r29
            p000.AbstractC0602nx.m4117(r5, r13, r7, r2, r8)
            r7 = r27
            r5.append(r7)
            java.lang.String r8 = "，失败 "
            r5.append(r8)
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            int r5 = r10.ordinal()
            if (r5 == 0) goto L743
            r8 = 1
            if (r5 == r8) goto L740
            r10 = 2
            if (r5 == r10) goto L73d
            r10 = r19
            if (r5 != r10) goto L737
            java.lang.String r5 = "人员火星任务完成"
            goto L746
        L737:
            p000.C1080.m7272()
            r17 = 0
            return r17
        L73d:
            java.lang.String r5 = "每日火星任务完成"
            goto L746
        L740:
            java.lang.String r5 = "互发任务完成"
            goto L746
        L743:
            r8 = 1
            java.lang.String r5 = "火星领取完成"
        L746:
            if (r0 <= 0) goto L74f
            if (r11 != 0) goto L74f
            if (r13 != 0) goto L74f
            if (r2 != 0) goto L74f
            goto L750
        L74f:
            r8 = 0
        L750:
            m4528(r1, r6, r5, r3, r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = ": "
            java.lang.String r1 = p000.AbstractC0602nx.m4133(r1, r5, r6, r3)
            r8 = 4
            r10 = 0
            p000.C0888ux.m5988(r15, r1, r10, r8, r10)
            mg1 r18 = new mg1
            java.lang.String r26 = p000.lz1.m3688(r5, r6, r3)
            r24 = r0
            r22 = r2
            r25 = r4
            r23 = r7
            r19 = r9
            r20 = r11
            r21 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            return r18
    }

    /* JADX INFO: renamed from: δ */
    public static void m4528(android.app.Activity r10, p000.lg1 r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            boolean r0 = m4539(r11)
            kg1 r11 = r11.f6623
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.String r0 = m4531(r11)
            if (r12 != 0) goto L13
            java.lang.String r12 = m4532(r11)
        L13:
            r3 = r12
            if (r14 == 0) goto L1a
            com.example.dyhelper.p002ui.C0182.m1590(r10, r0, r3, r13)
            return
        L1a:
            android.os.Handler r11 = com.example.dyhelper.p002ui.C0182.f2694
            r10.getClass()
            java.lang.String r2 = com.example.dyhelper.p002ui.C0182.m1593(r0)
            d52 r1 = new d52
            r5 = 100
            f52 r6 = p000.f52.f3754
            r8 = 1600(0x640, double:7.905E-321)
            r7 = r10
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.example.dyhelper.p002ui.C0182.m1597(r1)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m4529() {
            boolean r0 = p000.ui1.m5867()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r0 = "pet_elf_auto_task_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m4530() {
            boolean r0 = p000.ui1.m5867()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r0 = "pet_elf_auto_claim_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m4531(p000.kg1 r1) {
            int r1 = r1.ordinal()
            if (r1 == 0) goto L1d
            r0 = 1
            if (r1 == r0) goto L1a
            r0 = 2
            if (r1 == r0) goto L17
            r0 = 3
            if (r1 != r0) goto L12
            java.lang.String r1 = "pet_elf:person"
            return r1
        L12:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L17:
            java.lang.String r1 = "pet_elf:daily"
            return r1
        L1a:
            java.lang.String r1 = "pet_elf:mutual"
            return r1
        L1d:
            java.lang.String r1 = "pet_elf:claim"
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.String m4532(p000.kg1 r1) {
            int r1 = r1.ordinal()
            if (r1 == 0) goto L1d
            r0 = 1
            if (r1 == r0) goto L1a
            r0 = 2
            if (r1 == r0) goto L17
            r0 = 3
            if (r1 != r0) goto L12
            java.lang.String r1 = "完成火星任务"
            return r1
        L12:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L17:
            java.lang.String r1 = "每日火星任务"
            return r1
        L1a:
            java.lang.String r1 = "完成互发消息任务"
            return r1
        L1d:
            java.lang.String r1 = "领取火星"
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static void m4533(android.app.Activity r10) {
            r10.getClass()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r10)
            java.util.concurrent.atomic.AtomicReference r10 = p000.pg1.f8557
            r10.set(r0)
            boolean r10 = p000.AbstractC0976x9.m6529()
            if (r10 != 0) goto L15
            goto L9a
        L15:
            boolean r10 = m4530()
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L43
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.pg1.f8552
            boolean r10 = r10.get()
            if (r10 == 0) goto L26
            goto L43
        L26:
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.pg1.f8553
            boolean r10 = r10.compareAndSet(r0, r1)
            if (r10 != 0) goto L2f
            goto L43
        L2f:
            java.lang.Thread r10 = new java.lang.Thread
            fb0 r2 = new fb0
            r3 = 16
            r2.<init>(r3)
            java.lang.String r3 = "r62da759f6a7d20c7"
            r10.<init>(r2, r3)
            r10.setDaemon(r1)
            r10.start()
        L43:
            boolean r10 = m4529()
            if (r10 != 0) goto L4a
            goto L9a
        L4a:
            java.lang.String r10 = "pet_elf_auto_last_run_date"
            java.lang.String r2 = ""
            java.lang.String r10 = p000.ui1.m5893(r10, r2)
            java.lang.String r2 = m4538()
            boolean r10 = r10.equals(r2)
            if (r10 == 0) goto L5d
            goto L9a
        L5d:
            java.lang.String r10 = "spark_auto_renew_trigger_hour"
            r2 = -1
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L68
            int r2 = r3.getInt(r10, r2)     // Catch: java.lang.Throwable -> L68
        L68:
            if (r2 < 0) goto L77
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            r3 = 11
            int r10 = r10.get(r3)
            if (r10 >= r2) goto L77
            goto L9a
        L77:
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.atomic.AtomicLong r10 = p000.pg1.f8556
            long r4 = r10.get()
            long r6 = r2 - r4
            r8 = 60000(0xea60, double:2.9644E-319)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L8b
            goto L9a
        L8b:
            boolean r10 = r10.compareAndSet(r4, r2)
            if (r10 != 0) goto L92
            goto L9a
        L92:
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.pg1.f8555
            boolean r10 = r10.compareAndSet(r0, r1)
            if (r10 != 0) goto L9b
        L9a:
            return
        L9b:
            java.lang.Thread r10 = new java.lang.Thread
            fb0 r0 = new fb0
            r2 = 15
            r0.<init>(r2)
            java.lang.String r2 = "r1351137180264ddf"
            r10.<init>(r0, r2)
            r10.setDaemon(r1)
            r10.start()
            return
    }

    /* JADX INFO: renamed from: κ */
    public static void m4534(android.app.Activity r4) {
            if (r4 == 0) goto L1e
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L11
            boolean r0 = r4.isDestroyed()
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = r4
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1e
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicReference r0 = p000.pg1.f8557
            r0.set(r1)
        L1e:
            boolean r0 = p000.AbstractC0976x9.m6529()
            if (r0 == 0) goto L49
            boolean r0 = m4530()
            if (r0 != 0) goto L2b
            goto L49
        L2b:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pg1.f8554
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L36
            goto L49
        L36:
            java.lang.Thread r0 = new java.lang.Thread
            hg1 r1 = new hg1
            r3 = 0
            r1.<init>(r4, r3)
            java.lang.String r4 = "r6ee2d07c2b38eec3"
            r0.<init>(r1, r4)
            r0.setDaemon(r2)
            r0.start()
        L49:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static void m4535(android.app.Activity r1, java.lang.String r2, int r3) {
            r0 = 1
            if (r3 < r0) goto L16
            java.lang.String r3 = "pet_elf_auto_success_toast_enabled"
            boolean r3 = p000.ui1.m5887(r3, r0)
            if (r3 != 0) goto Lc
            goto L16
        Lc:
            xx0 r3 = new xx0
            r0 = 9
            r3.<init>(r1, r2, r0)
            r1.runOnUiThread(r3)
        L16:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m4536(long r0) {
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L4
            return
        L4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
    }

    /* JADX INFO: renamed from: ν */
    public static void m4537(android.app.Activity r4, p000.lg1 r5, p000.a80 r6) {
            boolean r0 = p000.AbstractC0976x9.m6529()
            r1 = 1
            if (r0 != 0) goto L11
            java.lang.String r4 = "火星任务仅限内测用户使用"
            mg1 r4 = m4526(r4, r1)
            r6.invoke(r4)
            return
        L11:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pg1.f8551
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 != 0) goto L24
            java.lang.String r4 = "已有火星任务正在执行，请稍后"
            mg1 r4 = m4526(r4, r1)
            r6.invoke(r4)
            return
        L24:
            java.lang.Thread r0 = new java.lang.Thread
            jg1 r2 = new jg1
            r3 = 0
            r2.<init>(r4, r5, r6, r3)
            kg1 r4 = r5.f6623
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "r3c58554f041a7fe1"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.<init>(r2, r4)
            r0.setDaemon(r1)
            r0.start()
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.String m4538() {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            r0.getClass()
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m4539(p000.lg1 r2) {
            boolean r0 = r2.f6627
            if (r0 == 0) goto L14
            kg1 r2 = r2.f6623
            kg1 r0 = p000.kg1.f5915
            r1 = 1
            if (r2 == r0) goto L13
            java.lang.String r2 = "spark_show_top_notification"
            boolean r2 = p000.ui1.m5887(r2, r1)
            if (r2 == 0) goto L14
        L13:
            return r1
        L14:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: π */
    public static boolean m4540(int r3, p000.p70 r4) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L29
            java.lang.Object r1 = r4.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L11
            r3 = 1
            return r3
        L11:
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            boolean r1 = r1.isInterrupted()
            if (r1 != 0) goto L23
            int r0 = r0 + 1
            goto L1
        L23:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException
            r3.<init>()
            throw r3
        L29:
            java.lang.Object r3 = r4.invoke()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }
}
