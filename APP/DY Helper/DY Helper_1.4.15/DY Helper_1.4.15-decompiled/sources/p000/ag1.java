package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ag1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f220 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.ag1.f220 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.zf1 m110(java.lang.String r9, int r10) {
            zf1 r0 = new zf1
            r5 = 0
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r8 = r9
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static p000.zf1 m111(java.lang.ClassLoader r37) {
            xn0 r0 = p000.xn0.f12242
            java.util.concurrent.ConcurrentHashMap r1 = p000.ry1.f9620
            java.util.Map r1 = p000.ex0.m1975(r1)
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            f7 r1 = p000.AbstractC0984xh.m6661(r1)
            cf1 r2 = new cf1
            r3 = 9
            r2.<init>(r3)
            y30 r3 = new y30
            r4 = 1
            r3.<init>(r1, r4, r2)
            ib1 r1 = new ib1
            r2 = 14
            r1.<init>(r2)
            java.util.List r2 = p000.us1.m5949(r3)
            p000.AbstractC0019ai.m168(r2, r1)
            java.util.Iterator r1 = r2.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L3a
            jz r1 = p000.C0450jz.f5672
            goto L5c
        L3a:
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L49
            java.util.List r1 = p000.AbstractC1021yh.m6896(r2)
            goto L5c
        L49:
            java.util.ArrayList r2 = p000.lz1.m3696(r2)
        L4d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r1.next()
            r2.add(r3)
            goto L4d
        L5b:
            r1 = r2
        L5c:
            boolean r2 = r1.isEmpty()
            r3 = 4
            java.lang.String r5 = "r86c859e3375e752"
            r12 = 0
            r6 = 0
            if (r2 == 0) goto L71
            java.lang.String r0 = "没有已收集的小火人单聊会话，请先进入私信列表或聊天页"
            p000.C0888ux.m5988(r5, r0, r6, r3, r6)
            zf1 r0 = m110(r0, r12)
            return r0
        L71:
            r2 = 20
            java.util.List r2 = p000.AbstractC0984xh.m6662(r1, r2)
            int r7 = r1.size()
            int r8 = r2.size()
            if (r7 <= r8) goto L8e
            int r1 = r1.size()
            java.lang.String r7 = "调试仅处理前 20 个会话，总会话="
            java.lang.String r1 = p000.a12.m17(r7, r1)
            p000.C0888ux.m5988(r5, r1, r6, r3, r6)
        L8e:
            int r1 = r2.size()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "开始火星任务调试 mode="
            r7.<init>(r8)
            yf1 r8 = p000.yf1.f12603
            r7.append(r8)
            java.lang.String r8 = " 会话="
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = "，本功能不会发送消息"
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            p000.C0888ux.m5988(r5, r1, r6, r3, r6)
            java.util.Iterator r1 = r2.iterator()
            r7 = r12
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
        Lbd:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L422
            int r15 = r7 + 1
            java.lang.Object r16 = r1.next()
            r12 = r16
            ky1 r12 = (p000.ky1) r12
            java.lang.Thread r16 = java.lang.Thread.currentThread()
            boolean r16 = r16.isInterrupted()
            if (r16 != 0) goto L422
            ry1 r16 = p000.ry1.f9602
            java.lang.String r4 = p000.ry1.m5197(r12)
            r18 = r7
            long r6 = r12.f6323
            r12 = r37
            rf1 r3 = r0.m6760(r12, r6)
            boolean r19 = r3.m5085()
            r20 = 300(0x12c, double:1.48E-321)
            r22 = r0
            java.lang.String r0 = " shortId="
            if (r19 != 0) goto L12c
            int r14 = r14 + 1
            java.lang.Throwable r3 = r3.f9363
            if (r3 == 0) goto L103
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L100
            goto L103
        L100:
            r19 = r1
            goto L106
        L103:
            java.lang.String r3 = "unknown"
            goto L100
        L106:
            java.lang.String r1 = "任务列表拉取失败 name="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r1, r4, r6, r0)
            java.lang.String r1 = ": "
            java.lang.String r0 = p000.lz1.m3691(r0, r1, r3)
            r1 = 4
            r3 = 0
            p000.C0888ux.m5979(r5, r0, r3, r1, r3)
            java.lang.Thread.sleep(r20)     // Catch: java.lang.InterruptedException -> L11b
            goto L122
        L11b:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L122:
            r7 = r15
            r1 = r19
            r0 = r22
            r3 = 4
            r4 = 1
        L129:
            r6 = 0
            r12 = 0
            goto Lbd
        L12c:
            r19 = r1
            java.lang.Object r1 = r3.f9362
            gg1 r1 = (p000.gg1) r1
            java.lang.String r3 = ""
            r23 = r2
            if (r1 == 0) goto L3ce
            int r2 = r1.f4365
            if (r2 != 0) goto L3ce
            int r8 = r8 + 1
            java.util.ArrayList r2 = r1.m2311()
            int r24 = r2.size()
            int r9 = r24 + r9
            r24 = r2
            java.util.Map r2 = r1.f4370
            java.util.Set r2 = r2.entrySet()
            r25 = r2
            java.lang.Iterable r25 = (java.lang.Iterable) r25
            cf1 r2 = new cf1
            r32 = r3
            r3 = 10
            r2.<init>(r3)
            r31 = 30
            java.lang.String r26 = ","
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = r2
            java.lang.String r2 = p000.AbstractC0984xh.m6644(r25, r26, r27, r28, r29, r30, r31)
            boolean r25 = p000.q02.m4671(r2)
            java.lang.String r26 = "none"
            if (r25 == 0) goto L177
            r2 = r26
        L177:
            int r3 = r24.size()
            r27 = r8
            java.lang.String r8 = r1.f4369
            if (r8 != 0) goto L183
            r8 = r26
        L183:
            java.lang.Long r1 = r1.f4367
            if (r1 == 0) goto L192
            long r28 = r1.longValue()
        L18b:
            r30 = r14
            r26 = r15
            r14 = r28
            goto L195
        L192:
            r28 = -1
            goto L18b
        L195:
            java.lang.String r1 = "任务列表 name="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r1, r4, r6, r0)
            java.lang.String r1 = " count="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " source="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " candidates="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " balanceSpark="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r3 = 0
            p000.C0888ux.m5988(r5, r0, r3, r1, r3)
            java.util.Iterator r0 = r24.iterator()
        L1c8:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = " requirement="
            java.lang.String r3 = " progress="
            java.lang.String r6 = " kind="
            java.lang.String r7 = " status="
            if (r1 == 0) goto L277
            java.lang.Object r1 = r0.next()
            tf1 r1 = (p000.tf1) r1
            java.lang.String r8 = r1.f10356
            if (r8 == 0) goto L1ea
            boolean r8 = p000.q02.m4671(r8)
            if (r8 == 0) goto L1e7
            goto L1ea
        L1e7:
            java.lang.String r8 = "present"
            goto L1ec
        L1ea:
            java.lang.String r8 = "missing"
        L1ec:
            java.lang.String r14 = r1.f10362
            if (r14 == 0) goto L204
            r15 = 32
            r28 = r0
            r0 = 10
            java.lang.String r14 = r14.replace(r0, r15)
            r14.getClass()
            r15 = 80
            java.lang.String r14 = p000.q02.m4693(r14, r15)
            goto L209
        L204:
            r28 = r0
            r0 = 10
            r14 = 0
        L209:
            if (r14 != 0) goto L20d
            r14 = r32
        L20d:
            java.lang.String r15 = r1.f10353
            java.lang.String r0 = r1.f10354
            if (r0 != 0) goto L215
            r0 = r32
        L215:
            r29 = r9
            int r9 = r1.f10355
            fg1 r12 = r1.m5632()
            r31 = r13
            java.lang.String r13 = m112(r1)
            r33 = r10
            java.lang.String r10 = m113(r1)
            java.lang.String r1 = r1.f10364
            r34 = r11
            java.lang.String r11 = " id="
            r35 = r5
            java.lang.String r5 = " unique="
            r36 = r8
            java.lang.String r8 = "任务 name="
            java.lang.StringBuilder r5 = p000.lz1.m3695(r8, r4, r11, r15, r5)
            r5.append(r0)
            r5.append(r7)
            r5.append(r9)
            r5.append(r6)
            r5.append(r12)
            r5.append(r3)
            r5.append(r13)
            r5.append(r2)
            java.lang.String r0 = " enterFrom="
            java.lang.String r2 = " token="
            p000.AbstractC0602nx.m4119(r5, r10, r0, r1, r2)
            java.lang.String r0 = " title="
            r8 = r36
            java.lang.String r0 = p000.AbstractC0602nx.m4133(r5, r8, r0, r14)
            r5 = r35
            r1 = 4
            r3 = 0
            p000.C0888ux.m5988(r5, r0, r3, r1, r3)
            r12 = r37
            r0 = r28
            r9 = r29
            r13 = r31
            r10 = r33
            r11 = r34
            goto L1c8
        L277:
            r29 = r9
            r33 = r10
            r34 = r11
            r31 = r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r24.iterator()
        L288:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L2a1
            java.lang.Object r8 = r1.next()
            r9 = r8
            tf1 r9 = (p000.tf1) r9
            fg1 r9 = r9.m5632()
            fg1 r10 = p000.fg1.f3931
            if (r9 == r10) goto L288
            r0.add(r8)
            goto L288
        L2a1:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2af:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L2cc
            java.lang.Object r9 = r0.next()
            r10 = r9
            tf1 r10 = (p000.tf1) r10
            java.lang.String r11 = r10.f10354
            if (r11 != 0) goto L2c2
            java.lang.String r11 = r10.f10353
        L2c2:
            boolean r10 = r1.add(r11)
            if (r10 == 0) goto L2af
            r8.add(r9)
            goto L2af
        L2cc:
            int r0 = r8.size()
            int r10 = r0 + r33
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L2da
            r1 = 0
            goto L30b
        L2da:
            java.util.Iterator r0 = r8.iterator()
            r1 = 0
        L2df:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L30b
            java.lang.Object r9 = r0.next()
            tf1 r9 = (p000.tf1) r9
            java.lang.Integer r9 = r9.m5633()
            if (r9 == 0) goto L2f7
            int r9 = r9.intValue()
        L2f5:
            r11 = 1
            goto L2f9
        L2f7:
            r9 = 0
            goto L2f5
        L2f9:
            if (r9 <= r11) goto L2fd
            r11 = 1
            goto L2fe
        L2fd:
            r11 = 0
        L2fe:
            if (r11 == 0) goto L2df
            int r1 = r1 + 1
            if (r1 < 0) goto L305
            goto L2df
        L305:
            p000.AbstractC1021yh.m6916()
            r17 = 0
            throw r17
        L30b:
            int r11 = r34 + r1
            java.util.Iterator r0 = r8.iterator()
        L311:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34b
            java.lang.Object r1 = r0.next()
            tf1 r1 = (p000.tf1) r1
            java.lang.String r8 = r1.f10353
            fg1 r9 = r1.m5632()
            int r12 = r1.f10355
            java.lang.String r13 = m112(r1)
            java.lang.String r1 = m113(r1)
            java.lang.String r14 = "命中相关任务 name="
            java.lang.String r15 = " taskId="
            java.lang.StringBuilder r8 = p000.lz1.m3695(r14, r4, r15, r8, r6)
            r8.append(r9)
            r8.append(r7)
            r8.append(r12)
            r8.append(r3)
            java.lang.String r1 = p000.AbstractC0602nx.m4133(r8, r13, r2, r1)
            r8 = 4
            r9 = 0
            p000.C0888ux.m5988(r5, r1, r9, r8, r9)
            goto L311
        L34b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r24.iterator()
        L354:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L373
            java.lang.Object r2 = r1.next()
            r3 = r2
            tf1 r3 = (p000.tf1) r3
            int r3 = r3.f10355
            r4 = 29091(0x71a3, float:4.0765E-41)
            int[] r3 = new int[]{r3}
            boolean r3 = com.example.dyhelper.core.protection.ProtectionNativeBridge.m1316(r4, r3)
            if (r3 == 0) goto L354
            r0.add(r2)
            goto L354
        L373:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L381:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L39e
            java.lang.Object r3 = r0.next()
            r4 = r3
            tf1 r4 = (p000.tf1) r4
            java.lang.String r6 = r4.f10354
            if (r6 != 0) goto L394
            java.lang.String r6 = r4.f10353
        L394:
            boolean r4 = r1.add(r6)
            if (r4 == 0) goto L381
            r2.add(r3)
            goto L381
        L39e:
            int r0 = r2.size()
            int r13 = r0 + r31
            int r0 = r23.size()
            r16 = 1
            int r0 = r0 + (-1)
            r15 = r18
            if (r15 >= r0) goto L3bb
            java.lang.Thread.sleep(r20)     // Catch: java.lang.InterruptedException -> L3b4
            goto L3bb
        L3b4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L3bb:
            r4 = r16
            r1 = r19
            r0 = r22
            r2 = r23
            r7 = r26
            r8 = r27
            r9 = r29
            r14 = r30
        L3cb:
            r3 = 4
            goto L129
        L3ce:
            r32 = r3
            r33 = r10
            r34 = r11
            r31 = r13
            r30 = r14
            r26 = r15
            r16 = 1
            int r14 = r30 + 1
            if (r1 == 0) goto L3e3
            int r0 = r1.f4365
            goto L3e4
        L3e3:
            r0 = -1
        L3e4:
            if (r1 == 0) goto L3e9
            java.lang.String r1 = r1.f4366
            goto L3ea
        L3e9:
            r1 = 0
        L3ea:
            if (r1 != 0) goto L3ef
            r3 = r32
            goto L3f0
        L3ef:
            r3 = r1
        L3f0:
            java.lang.String r1 = " code="
            java.lang.String r2 = " msg="
            java.lang.String r6 = "任务列表业务失败 name="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4135(r0, r6, r4, r1, r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r3 = 0
            p000.C0888ux.m5988(r5, r0, r3, r1, r3)
            java.lang.Thread.sleep(r20)     // Catch: java.lang.InterruptedException -> L40a
            goto L411
        L40a:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L411:
            r4 = r16
            r1 = r19
            r0 = r22
            r2 = r23
            r7 = r26
            r13 = r31
            r10 = r33
            r11 = r34
            goto L3cb
        L422:
            r33 = r10
            r34 = r11
            r31 = r13
            r30 = r14
            java.lang.String r0 = ", 任务 "
            java.lang.String r1 = ", 相关 "
            java.lang.String r2 = "任务检测完成: 会话 "
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r8, r0, r9, r1)
            java.lang.String r1 = ", 数量任务 "
            java.lang.String r2 = ", 可领取 "
            r10 = r33
            r11 = r34
            p000.AbstractC0602nx.m4117(r0, r10, r1, r11, r2)
            r13 = r31
            r0.append(r13)
            java.lang.String r1 = ", 失败 "
            r0.append(r1)
            r14 = r30
            r0.append(r14)
            java.lang.String r1 = "；未发送消息"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r3 = 0
            p000.C0888ux.m5988(r5, r0, r3, r1, r3)
            zf1 r6 = new zf1
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r13
            r13 = r14
            r12 = 0
            r14 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r6
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m112(p000.tf1 r4) {
            int r0 = r4.f10355
            java.lang.Integer r1 = r4.f10361
            r2 = 0
            if (r1 == 0) goto Le
            int r3 = r1.intValue()
            if (r3 <= 0) goto Le
            goto Lf
        Le:
            r1 = r2
        Lf:
            java.lang.Integer r4 = r4.f10360
            if (r4 != 0) goto L26
            if (r1 == 0) goto L27
            r4 = 29091(0x71a3, float:4.0765E-41)
            int[] r3 = new int[]{r0}
            boolean r4 = com.example.dyhelper.core.protection.ProtectionNativeBridge.m1316(r4, r3)
            if (r4 != 0) goto L24
            r4 = 3
            if (r0 != r4) goto L27
        L24:
            r2 = r1
            goto L27
        L26:
            r2 = r4
        L27:
            if (r2 == 0) goto L40
            if (r1 == 0) goto L40
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r0 = "/"
            r4.append(r0)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            return r4
        L40:
            if (r2 == 0) goto L54
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r0 = "/?"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L54:
            if (r1 == 0) goto L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "?/"
            r4.<init>(r0)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            return r4
        L65:
            java.lang.String r4 = "unknown"
            return r4
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m113(p000.tf1 r6) {
            java.lang.Integer r0 = r6.m5633()
            fg1 r1 = r6.m5632()
            int r1 = r1.ordinal()
            java.lang.String r2 = ")"
            java.lang.String r3 = "("
            java.lang.String r4 = ""
            if (r1 == 0) goto L4b
            r5 = 1
            if (r1 == r5) goto L22
            r6 = 2
            if (r1 != r6) goto L1d
            java.lang.String r6 = "other"
            return r6
        L1d:
            p000.C1080.m7272()
            r6 = 0
            return r6
        L22:
            if (r0 == 0) goto L48
            int r0 = r0.intValue()
            java.lang.String r6 = r6.m5631()
            if (r6 != 0) goto L2f
            goto L30
        L2f:
            r4 = r6
        L30:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "media:"
            r6.<init>(r1)
            r6.append(r0)
            r6.append(r3)
            r6.append(r4)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            return r6
        L48:
            java.lang.String r6 = "media:unknown"
            return r6
        L4b:
            if (r0 == 0) goto L71
            int r0 = r0.intValue()
            java.lang.String r6 = r6.m5631()
            if (r6 != 0) goto L58
            goto L59
        L58:
            r4 = r6
        L59:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "message:"
            r6.<init>(r1)
            r6.append(r0)
            r6.append(r3)
            r6.append(r4)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            return r6
        L71:
            java.lang.String r6 = "message:unknown"
            return r6
    }
}
