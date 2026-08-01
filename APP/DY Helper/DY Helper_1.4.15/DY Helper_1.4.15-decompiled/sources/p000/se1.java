package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class se1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f9875 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f9876 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicReference f9877 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicReference f9878 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.se1.f9875 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.se1.f9876 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.lang.String r1 = ""
            r0.<init>(r1)
            p000.se1.f9877 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            p000.se1.f9878 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m5486() {
            java.lang.String r0 = p000.ui1.m5890()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L1e
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.AbstractC0976x9.f12071
            java.lang.String r0 = p000.AbstractC0976x9.f12078
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static p000.qe1 m5487(java.lang.ClassLoader r51, boolean r52, java.lang.String r53, java.util.List r54) {
            r1 = r51
            r2 = r53
            if (r54 != 0) goto Lc
            java.util.List r0 = m5491()
            r3 = r0
            goto Le
        Lc:
            r3 = r54
        Le:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L21
            qe1 r4 = new qe1
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            r9 = 1
            java.lang.String r10 = "没有已识别的小火人单聊会话"
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        L21:
            if (r52 == 0) goto L26
            java.lang.String r0 = "自动"
            goto L28
        L26:
            java.lang.String r0 = "手动"
        L28:
            int r4 = r3.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "开始"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = "领取亲密度 会话="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = " module=Closeness(2)"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r4 = "rb4e434d444870f0e"
            r5 = 0
            r6 = 4
            p000.C0888ux.m5988(r4, r0, r5, r6, r5)
            java.util.Iterator r7 = r3.iterator()
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L58:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7d
            int r10 = r9 + 1
            java.lang.Object r0 = r7.next()
            ky1 r0 = (p000.ky1) r0
            java.lang.Thread r16 = java.lang.Thread.currentThread()
            boolean r16 = r16.isInterrupted()
            if (r16 != 0) goto L7d
            if (r52 == 0) goto L89
            boolean r16 = m5488()
            if (r16 != 0) goto L89
            java.lang.String r0 = "自动亲密度领取执行中被关闭，停止后续会话"
            p000.C0888ux.m5988(r4, r0, r5, r6, r5)
        L7d:
            r28 = r11
            r30 = r12
            r25 = r13
            r26 = r14
            r24 = r15
            goto L52f
        L89:
            if (r52 == 0) goto L9b
            java.lang.String r8 = m5486()
            boolean r8 = p000.ln0.m3626(r8, r2)
            if (r8 != 0) goto L9b
            java.lang.String r0 = "自动亲密度领取检测到账号变化，停止使用旧会话"
            p000.C0888ux.m5988(r4, r0, r5, r6, r5)
            goto L7d
        L9b:
            ry1 r8 = p000.ry1.f9602
            java.lang.String r8 = p000.ry1.m5197(r0)
            long r5 = r0.f6323
            r17 = r3
            pe1 r3 = p000.pe1.f8537
            java.lang.Object r0 = r3.m4513(r1, r5)
            r18 = r7
            boolean r7 = r0 instanceof p000.eo1
            r19 = 300(0x12c, double:1.48E-321)
            r21 = r0
            java.lang.String r0 = " shortId="
            r22 = r7
            if (r22 == 0) goto Lf5
            int r15 = r15 + 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r22 = 1
            java.lang.String r7 = "亲密度读取失败 name="
            r3.<init>(r7)
            r3.append(r8)
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
            java.lang.Throwable r3 = p000.fo1.m2190(r21)
            if (r3 != 0) goto Lde
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r5 = "亲密度读取返回未知错误"
            r3.<init>(r5)
        Lde:
            p000.C0888ux.m5977(r4, r0, r3)
            int r0 = r17.size()
            int r0 = r0 + (-1)
            if (r9 >= r0) goto Lec
            m5490(r19)
        Lec:
            r9 = r10
            r3 = r17
            r7 = r18
        Lf1:
            r5 = 0
            r6 = 4
            goto L58
        Lf5:
            r22 = 1
            p000.i81.m2649(r21)
            r7 = r21
            oe1 r7 = (p000.oe1) r7
            r21 = r10
            int r10 = r7.f8062
            boolean r23 = r7.m4228()
            r24 = r15
            java.lang.String r15 = " msg="
            r25 = r13
            java.lang.String r13 = " http="
            r26 = r14
            java.lang.String r14 = " bridge="
            java.lang.String r27 = ""
            r28 = r11
            java.lang.String r11 = " code="
            r29 = -1
            if (r23 != 0) goto L1a0
            r3 = 994008(0xf2ad8, float:1.392902E-39)
            if (r10 != r3) goto L142
            int r14 = r26 + 1
            java.lang.String r3 = "亲密度领取跳过 name="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r3, r8, r5, r0)
            r0.append(r11)
            r0.append(r10)
            java.lang.String r3 = " reason=pet_not_exist"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 4
            r5 = 0
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
            r30 = r12
            r15 = r24
            goto L185
        L142:
            int r3 = r24 + 1
            r23 = r3
            int r3 = r7.f8060
            r30 = r12
            java.lang.Integer r12 = r7.f8061
            if (r12 == 0) goto L152
            int r29 = r12.intValue()
        L152:
            r12 = r29
            java.lang.String r7 = r7.f8063
            if (r7 != 0) goto L15a
            r7 = r27
        L15a:
            java.lang.String r1 = "亲密度读取业务失败 name="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r1, r8, r5, r0)
            r0.append(r14)
            r0.append(r3)
            r0.append(r13)
            r0.append(r12)
            r0.append(r11)
            r0.append(r10)
            r0.append(r15)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r3 = 4
            r5 = 0
            p000.C0888ux.m5979(r4, r0, r5, r3, r5)
            r15 = r23
            r14 = r26
        L185:
            int r0 = r17.size()
            int r0 = r0 + (-1)
            if (r9 >= r0) goto L190
            m5490(r19)
        L190:
            r1 = r51
            r3 = r17
            r7 = r18
            r9 = r21
            r13 = r25
            r11 = r28
        L19c:
            r12 = r30
            goto Lf1
        L1a0:
            r30 = r12
            int r1 = r28 + 1
            ne1 r7 = r7.f8064
            if (r7 == 0) goto L527
            java.util.List r10 = r7.f7589
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r10 = r10.iterator()
        L1b3:
            boolean r23 = r10.hasNext()
            if (r23 == 0) goto L1d0
            r23 = r1
            java.lang.Object r1 = r10.next()
            r28 = r10
            r10 = r1
            ke1 r10 = (p000.ke1) r10
            boolean r10 = r10.f5878
            if (r10 == 0) goto L1cb
            r12.add(r1)
        L1cb:
            r1 = r23
            r10 = r28
            goto L1b3
        L1d0:
            r23 = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r12.iterator()
        L1e0:
            boolean r28 = r12.hasNext()
            if (r28 == 0) goto L205
            r28 = r12
            java.lang.Object r12 = r28.next()
            r31 = r9
            r9 = r12
            ke1 r9 = (p000.ke1) r9
            int r9 = r9.f5875
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r1.add(r9)
            if (r9 == 0) goto L200
            r10.add(r12)
        L200:
            r12 = r28
            r9 = r31
            goto L1e0
        L205:
            r31 = r9
            boolean r1 = r10.isEmpty()
            java.lang.String r9 = " total="
            java.lang.String r12 = " level="
            r32 = -1
            if (r1 == 0) goto L253
            java.lang.Integer r1 = r7.f7583
            if (r1 == 0) goto L21e
            int r1 = r1.intValue()
        L21b:
            r28 = r10
            goto L221
        L21e:
            r1 = r29
            goto L21b
        L221:
            java.lang.Long r10 = r7.f7587
            if (r10 == 0) goto L232
            long r34 = r10.longValue()
            r49 = r34
            r34 = r11
            r10 = r49
        L22f:
            r35 = r7
            goto L237
        L232:
            r34 = r11
            r10 = r32
            goto L22f
        L237:
            java.lang.String r7 = "亲密度无需领取 name="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r7, r8, r5, r0)
            r0.append(r12)
            r0.append(r1)
            r0.append(r9)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r7 = 0
            p000.C0888ux.m5988(r4, r0, r7, r1, r7)
            goto L259
        L253:
            r35 = r7
            r28 = r10
            r34 = r11
        L259:
            java.util.Iterator r1 = r28.iterator()
            r7 = r35
            r10 = 0
        L260:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L504
            int r11 = r10 + 1
            java.lang.Object r0 = r1.next()
            r35 = r1
            r1 = r0
            ke1 r1 = (p000.ke1) r1
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L504
            if (r52 == 0) goto L283
            boolean r0 = m5488()
            if (r0 == 0) goto L504
        L283:
            if (r52 == 0) goto L298
            java.lang.String r0 = m5486()
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L298
            java.lang.String r0 = "自动亲密度领取行为阶段检测到账号变化，停止当前会话"
            r3 = 4
            r5 = 0
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
            goto L504
        L298:
            java.util.List r0 = r7.f7589
            boolean r36 = r0.isEmpty()
            java.lang.String r2 = " id="
            if (r36 == 0) goto L2af
        L2a2:
            r44 = r3
            r40 = r5
            r39 = r7
            r36 = r11
            r5 = r15
            r3 = r34
            goto L4dd
        L2af:
            java.util.Iterator r0 = r0.iterator()
        L2b3:
            boolean r36 = r0.hasNext()
            if (r36 == 0) goto L2a2
            java.lang.Object r36 = r0.next()
            r37 = r0
            r0 = r36
            ke1 r0 = (p000.ke1) r0
            r36 = r11
            int r11 = r0.f5875
            r38 = r15
            int r15 = r1.f5875
            if (r11 != r15) goto L4c0
            boolean r0 = r0.f5878
            if (r0 == 0) goto L4c0
            java.lang.Integer r11 = r7.f7583
            r39 = 0
            int r0 = (r5 > r39 ? 1 : (r5 == r39 ? 0 : -1))
            if (r0 <= 0) goto L33e
            if (r15 <= 0) goto L32e
            r39 = r7
            r7 = r51
            java.util.LinkedHashMap r0 = p000.xn0.m6713(r7, r5)     // Catch: java.lang.Throwable -> L32a
            r40 = r5
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L326
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L326
            java.lang.String r6 = "behavior_id"
            r37 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L309
            r5.put(r6, r11)     // Catch: java.lang.Throwable -> L309
            java.lang.String r6 = "https://stark-gate.zijieapi.com/ttgame/social_pet/closeness/claim"
            le1 r0 = p000.pe1.m4510(r7, r6, r5, r0)     // Catch: java.lang.Throwable -> L309
            org.json.JSONObject r5 = r0.f6591     // Catch: java.lang.Throwable -> L309
            r6 = 0
            org.json.JSONObject r11 = p000.pe1.m4507(r6, r5)     // Catch: java.lang.Throwable -> L309
            if (r11 == 0) goto L30b
            ne1 r6 = r3.m4514(r11)     // Catch: java.lang.Throwable -> L309
            goto L30c
        L309:
            r0 = move-exception
            goto L34e
        L30b:
            r6 = 0
        L30c:
            me1 r42 = new me1     // Catch: java.lang.Throwable -> L309
            int r11 = r0.f6589     // Catch: java.lang.Throwable -> L309
            java.lang.Integer r0 = r0.f6590     // Catch: java.lang.Throwable -> L309
            int r45 = p000.pe1.m4505(r5, r6)     // Catch: java.lang.Throwable -> L309
            java.lang.String r46 = p000.pe1.m4506(r5)     // Catch: java.lang.Throwable -> L309
            r44 = r0
            r47 = r6
            r43 = r11
            r42.<init>(r43, r44, r45, r46, r47)     // Catch: java.lang.Throwable -> L309
            r5 = r42
            goto L353
        L326:
            r0 = move-exception
        L327:
            r37 = r11
            goto L34e
        L32a:
            r0 = move-exception
            r40 = r5
            goto L327
        L32e:
            r40 = r5
            r39 = r7
            r37 = r11
            r7 = r51
            java.lang.String r0 = "behaviorId 必须大于 0"
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L309
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L309
            throw r5     // Catch: java.lang.Throwable -> L309
        L33e:
            r40 = r5
            r39 = r7
            r37 = r11
            r7 = r51
            java.lang.String r0 = "conversationShortId 必须大于 0"
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L309
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L309
            throw r5     // Catch: java.lang.Throwable -> L309
        L34e:
            eo1 r5 = new eo1
            r5.<init>(r0)
        L353:
            boolean r0 = r5 instanceof p000.eo1
            r42 = 200(0xc8, double:9.9E-322)
            if (r0 == 0) goto L398
            int r24 = r24 + 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "亲密度领取失败 name="
            r0.<init>(r1)
            r0.append(r8)
            r0.append(r2)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.Throwable r1 = p000.fo1.m2190(r5)
            if (r1 != 0) goto L37c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "亲密度领取返回未知错误"
            r1.<init>(r2)
        L37c:
            p000.C0888ux.m5977(r4, r0, r1)
            int r0 = r28.size()
            int r0 = r0 + (-1)
            if (r10 >= r0) goto L38a
            m5490(r42)
        L38a:
            r2 = r53
            r1 = r35
            r10 = r36
            r15 = r38
            r7 = r39
            r5 = r40
            goto L260
        L398:
            p000.i81.m2649(r5)
            me1 r5 = (p000.me1) r5
            java.lang.Integer r0 = r5.f7101
            int r6 = r5.f7100
            int r11 = r5.f7102
            r44 = r3
            r3 = r22
            if (r6 != r3) goto L46a
            xm0 r3 = new xm0
            r45 = r0
            r0 = 200(0xc8, float:2.8E-43)
            r7 = 299(0x12b, float:4.19E-43)
            r46 = r10
            r10 = 1
            r3.<init>(r0, r7, r10)
            if (r45 == 0) goto L46e
            int r0 = r45.intValue()
            boolean r0 = r3.m6684(r0)
            if (r0 == 0) goto L46e
            r3 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r7 = 996502(0xf3496, float:1.396397E-39)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r10}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L46e
            ne1 r0 = r5.f7104
            if (r0 == 0) goto L46e
            if (r11 != r7) goto L3ea
            int r25 = r25 + 1
            goto L3ec
        L3ea:
            int r30 = r30 + 1
        L3ec:
            java.lang.String r5 = r1.f5876
            if (r5 != 0) goto L3f2
            r5 = r27
        L3f2:
            java.lang.Integer r1 = r1.f5877
            if (r1 == 0) goto L3fb
            int r1 = r1.intValue()
            goto L3fd
        L3fb:
            r1 = r29
        L3fd:
            if (r11 != r7) goto L401
            r6 = 1
            goto L402
        L401:
            r6 = r3
        L402:
            if (r37 == 0) goto L409
            int r7 = r37.intValue()
            goto L40b
        L409:
            r7 = r29
        L40b:
            java.lang.Integer r10 = r0.f7583
            if (r10 == 0) goto L414
            int r10 = r10.intValue()
            goto L416
        L414:
            r10 = r29
        L416:
            java.lang.Long r11 = r0.f7587
            if (r11 == 0) goto L423
            long r47 = r11.longValue()
            r54 = r4
            r3 = r47
            goto L427
        L423:
            r54 = r4
            r3 = r32
        L427:
            java.lang.String r11 = "亲密度领取成功 name="
            r37 = r0
            java.lang.String r0 = " behaviorName="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4135(r15, r11, r8, r2, r0)
            r0.append(r5)
            java.lang.String r2 = " amount="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " idempotent="
            r0.append(r1)
            r0.append(r6)
            r0.append(r12)
            r0.append(r7)
            java.lang.String r1 = "->"
            r0.append(r1)
            r0.append(r10)
            r0.append(r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4 = r54
            r3 = 4
            r5 = 0
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
            r3 = r34
            r7 = r37
            r5 = r38
            goto L4a0
        L46a:
            r45 = r0
            r46 = r10
        L46e:
            int r24 = r24 + 1
            if (r45 == 0) goto L477
            int r0 = r45.intValue()
            goto L479
        L477:
            r0 = r29
        L479:
            java.lang.String r1 = r5.f7103
            if (r1 != 0) goto L47f
            r1 = r27
        L47f:
            java.lang.String r3 = "亲密度领取业务失败 name="
            java.lang.StringBuilder r2 = p000.AbstractC0602nx.m4135(r15, r3, r8, r2, r14)
            r3 = r34
            p000.AbstractC0602nx.m4117(r2, r6, r13, r0, r3)
            r2.append(r11)
            r5 = r38
            r2.append(r5)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r1 = 4
            r7 = 0
            p000.C0888ux.m5979(r4, r0, r7, r1, r7)
            r7 = r39
        L4a0:
            int r0 = r28.size()
            r22 = 1
            int r0 = r0 + (-1)
            r6 = r46
            if (r6 >= r0) goto L4af
            m5490(r42)
        L4af:
            r2 = r53
            r34 = r3
            r15 = r5
            r1 = r35
            r10 = r36
        L4b8:
            r5 = r40
            r3 = r44
            r22 = 1
            goto L260
        L4c0:
            r44 = r3
            r40 = r5
            r39 = r7
            r6 = r10
            r3 = r34
            r5 = r38
            r34 = r3
            r15 = r5
            r10 = r6
            r11 = r36
            r0 = r37
            r7 = r39
            r5 = r40
            r3 = r44
            r22 = 1
            goto L2b3
        L4dd:
            int r0 = r1.f5875
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "亲密度行为已由最新响应移除，跳过 name="
            r1.<init>(r6)
            r1.append(r8)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            r7 = 0
            p000.C0888ux.m5988(r4, r0, r7, r1, r7)
            r2 = r53
            r34 = r3
            r15 = r5
            r1 = r35
            r10 = r36
            r7 = r39
            goto L4b8
        L504:
            int r0 = r17.size()
            r22 = 1
            int r0 = r0 + (-1)
            r8 = r31
            if (r8 >= r0) goto L513
            m5490(r19)
        L513:
            r1 = r51
            r2 = r53
            r3 = r17
            r7 = r18
            r9 = r21
            r11 = r23
            r15 = r24
            r13 = r25
            r14 = r26
            goto L19c
        L527:
            java.lang.String r0 = "Required value was null."
            p000.C1080.m7279(r0)
            r16 = 0
            return r16
        L52f:
            java.lang.String r0 = ", 领取 "
            java.lang.String r1 = ", 幂等 "
            java.lang.String r2 = "亲密度领取完成: 会话 "
            r11 = r28
            r12 = r30
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r11, r0, r12, r1)
            java.lang.String r1 = ", 跳过 "
            java.lang.String r2 = ", 失败 "
            r13 = r25
            r14 = r26
            p000.AbstractC0602nx.m4117(r0, r13, r1, r14, r2)
            r15 = r24
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r3 = 4
            r5 = 0
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
            qe1 r10 = new qe1
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m5488() {
            boolean r0 = p000.AbstractC0976x9.m6529()
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto Le
            goto L15
        Le:
            java.lang.String r0 = "pet_elf_closeness_auto_claim_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
            return r0
        L15:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static void m5489(android.app.Activity r3) {
            r3.getClass()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            java.util.concurrent.atomic.AtomicReference r3 = p000.se1.f9878
            r3.set(r0)
            boolean r3 = m5488()
            if (r3 != 0) goto L14
            goto L35
        L14:
            java.lang.String r3 = m5486()
            int r0 = r3.length()
            if (r0 <= 0) goto L2b
            java.util.concurrent.atomic.AtomicReference r0 = p000.se1.f9877
            java.lang.Object r0 = r0.get()
            boolean r3 = p000.ln0.m3626(r0, r3)
            if (r3 == 0) goto L2b
            goto L35
        L2b:
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.se1.f9876
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 != 0) goto L36
        L35:
            return
        L36:
            java.lang.Thread r3 = new java.lang.Thread
            fb0 r0 = new fb0
            r2 = 14
            r0.<init>(r2)
            java.lang.String r2 = "rf4bb6f7ffb728a62"
            r3.<init>(r0, r2)
            r3.setDaemon(r1)
            r3.start()
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m5490(long r0) {
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L4
            return
        L4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static java.util.List m5491() {
            java.util.concurrent.ConcurrentHashMap r0 = p000.ry1.f9620
            java.util.Map r0 = p000.ex0.m1975(r0)
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            f7 r0 = p000.AbstractC0984xh.m6661(r0)
            f71 r1 = new f71
            r2 = 26
            r1.<init>(r2)
            y30 r2 = new y30
            r3 = 1
            r2.<init>(r0, r3, r1)
            ib1 r0 = new ib1
            r1 = 9
            r0.<init>(r1)
            java.util.List r1 = p000.us1.m5949(r2)
            p000.AbstractC0019ai.m168(r1, r0)
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L38
            jz r0 = p000.C0450jz.f5672
            goto L5a
        L38:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L47
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            goto L5a
        L47:
            java.util.ArrayList r1 = p000.lz1.m3696(r1)
        L4b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r0.next()
            r1.add(r2)
            goto L4b
        L59:
            r0 = r1
        L5a:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static boolean m5492(int r6, p000.p70 r7) {
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = (long) r6
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            long r2 = r2 + r0
        L9:
            long r0 = java.lang.System.currentTimeMillis()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L31
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            boolean r6 = r6.isInterrupted()
            if (r6 == 0) goto L1d
            r6 = 0
            return r6
        L1d:
            java.lang.Object r6 = r7.invoke()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L2b
            r6 = 1
            return r6
        L2b:
            r0 = 500(0x1f4, double:2.47E-321)
            m5490(r0)
            goto L9
        L31:
            java.lang.Object r6 = r7.invoke()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
    }
}
