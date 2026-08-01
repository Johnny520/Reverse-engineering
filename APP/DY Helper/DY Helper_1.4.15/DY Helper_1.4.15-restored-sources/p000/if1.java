package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class if1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f5067 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.if1.f5067 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.hf1 m2758(java.lang.ClassLoader r28) {
            java.util.concurrent.ConcurrentHashMap r0 = p000.ry1.f9620
            java.util.Map r0 = p000.ex0.m1975(r0)
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            f7 r0 = p000.AbstractC0984xh.m6661(r0)
            cf1 r1 = new cf1
            r2 = 2
            r1.<init>(r2)
            y30 r2 = new y30
            r3 = 1
            r2.<init>(r0, r3, r1)
            ib1 r0 = new ib1
            r1 = 12
            r0.<init>(r1)
            java.util.List r1 = p000.us1.m5949(r2)
            p000.AbstractC0019ai.m168(r1, r0)
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L37
            jz r0 = p000.C0450jz.f5672
            goto L59
        L37:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L46
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            goto L59
        L46:
            java.util.ArrayList r1 = p000.lz1.m3696(r1)
        L4a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r0.next()
            r1.add(r2)
            goto L4a
        L58:
            r0 = r1
        L59:
            boolean r1 = r0.isEmpty()
            r2 = 0
            r4 = 4
            java.lang.String r5 = "ra38c9f1519a93e5b"
            r6 = 0
            if (r1 == 0) goto L6f
            java.lang.String r0 = "没有已收集的小火人单聊会话，请先进入私信列表或聊天页"
            p000.C0888ux.m5988(r5, r0, r6, r4, r6)
            hf1 r1 = new hf1
            r1.<init>(r2, r2, r2, r0)
            return r1
        L6f:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int r7 = r0.size()
            java.lang.String r8 = "开始获取食物列表 会话="
            java.lang.String r9 = " endpoint=feed/get，仅执行只读请求"
            java.lang.String r7 = p000.AbstractC0602nx.m4127(r8, r7, r9)
            p000.C0888ux.m5988(r5, r7, r6, r4, r6)
            java.util.Iterator r7 = r0.iterator()
            r8 = r2
            r9 = r8
            r10 = r9
        L8a:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L31d
            java.lang.Object r11 = r7.next()
            int r12 = r10 + 1
            if (r10 < 0) goto L318
            ky1 r11 = (p000.ky1) r11
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            boolean r13 = r13.isInterrupted()
            if (r13 != 0) goto L2fc
            ry1 r13 = p000.ry1.f9602
            java.lang.String r13 = p000.ry1.m5197(r11)
            long r14 = r11.f6323
            r11 = r28
            r16 = r3
            java.lang.Object r3 = p000.p91.m4424(r11, r14)
            boolean r4 = r3 instanceof p000.eo1
            java.lang.String r6 = " shortId="
            if (r4 != 0) goto L2b9
            r4 = r3
            xe1 r4 = (p000.xe1) r4
            r17 = r0
            java.lang.Integer r0 = r4.f12146
            r18 = r0
            int r0 = r4.f12145
            r19 = r3
            org.json.JSONObject r3 = r4.f12151
            r20 = r7
            java.util.List r7 = r4.f12150
            r21 = r7
            int r7 = r4.f12147
            boolean r22 = r4.m6629()
            java.lang.String r23 = ""
            java.lang.String r11 = " http="
            r24 = r12
            java.lang.String r12 = " bridge="
            r25 = -1
            if (r22 == 0) goto L250
            int r2 = r2 + 1
            r22 = r2
            if (r3 == 0) goto Lee
            java.lang.String r2 = "left"
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            goto Lef
        Lee:
            r2 = 0
        Lef:
            r26 = r9
            if (r3 == 0) goto Lfa
            java.lang.String r9 = "right"
            org.json.JSONObject r3 = r3.optJSONObject(r9)
            goto Lfb
        Lfa:
            r3 = 0
        Lfb:
            org.json.JSONObject[] r2 = new org.json.JSONObject[]{r2, r3}
            ss1 r2 = p000.AbstractC0312g7.m2232(r2)
            cf1 r3 = new cf1
            r9 = 3
            r3.<init>(r9)
            y30 r2 = p000.us1.m5943(r2, r3)
            java.lang.Object r2 = p000.us1.m5953(r2)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            if (r18 == 0) goto L11a
            int r3 = r18.intValue()
            goto L11c
        L11a:
            r3 = r25
        L11c:
            int r4 = r4.f12149
            int r9 = r21.size()
            r27 = r8
            if (r2 == 0) goto L12e
            java.lang.String r8 = "food_id"
            java.lang.Object r2 = r2.opt(r8)
            if (r2 != 0) goto L130
        L12e:
            java.lang.String r2 = "none"
        L130:
            java.lang.String r8 = "食物目录 name="
            java.lang.StringBuilder r8 = p000.AbstractC0602nx.m4137(r8, r13, r14, r6)
            r8.append(r12)
            r8.append(r0)
            r8.append(r11)
            r8.append(r3)
            java.lang.String r0 = " status="
            r8.append(r0)
            r8.append(r7)
            java.lang.String r0 = " rawCount="
            r8.append(r0)
            r8.append(r4)
            java.lang.String r0 = " parsedCount="
            r8.append(r0)
            r8.append(r9)
            java.lang.String r0 = " activeFoodId="
            r8.append(r0)
            r8.append(r2)
            java.lang.String r0 = r8.toString()
            r2 = 4
            r3 = 0
            p000.C0888ux.m5988(r5, r0, r3, r2, r3)
            java.util.Iterator r0 = r21.iterator()
        L16f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1b8
            java.lang.Object r2 = r0.next()
            ze1 r2 = (p000.ze1) r2
            java.lang.String r3 = r2.f13064
            boolean r3 = r1.add(r3)
            if (r3 == 0) goto L16f
            java.lang.String r3 = r2.f13064
            java.lang.String r4 = r2.f13065
            java.lang.Integer r7 = r2.f13067
            if (r7 == 0) goto L190
            int r7 = r7.intValue()
            goto L192
        L190:
            r7 = r25
        L192:
            java.lang.String r8 = r2.f13069
            if (r8 != 0) goto L198
            r8 = r23
        L198:
            java.lang.String r2 = r2.f13071
            java.lang.String r9 = " foodName="
            java.lang.String r11 = " duration="
            java.lang.String r12 = "食物配置 id="
            java.lang.StringBuilder r3 = p000.lz1.m3695(r12, r3, r9, r4, r11)
            java.lang.String r4 = " icon="
            java.lang.String r9 = " source="
            p000.lz1.m3671(r3, r7, r4, r8, r9)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 4
            r4 = 0
            p000.C0888ux.m5988(r5, r2, r4, r3, r4)
            goto L16f
        L1b8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r21.iterator()
        L1c1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1dd
            java.lang.Object r3 = r2.next()
            r4 = r3
            ze1 r4 = (p000.ze1) r4
            java.lang.Integer r4 = r4.f13066
            if (r4 != 0) goto L1d3
            goto L1c1
        L1d3:
            int r4 = r4.intValue()
            if (r4 != 0) goto L1c1
            r0.add(r3)
            goto L1c1
        L1dd:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L246
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p000.AbstractC1021yh.m6889(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L1f2:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L22b
            java.lang.Object r3 = r0.next()
            ze1 r3 = (p000.ze1) r3
            java.lang.String r4 = r3.f13064
            java.lang.String r7 = r3.f13065
            java.lang.Integer r3 = r3.f13068
            if (r3 == 0) goto L20b
            int r3 = r3.intValue()
            goto L20d
        L20b:
            r3 = r25
        L20d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r4 = ":"
            r8.append(r4)
            r8.append(r7)
            r8.append(r4)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            r2.add(r3)
            goto L1f2
        L22b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "免费食物 name="
            r0.<init>(r3)
            r0.append(r13)
            java.lang.String r3 = " items="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 4
            r3 = 0
            p000.C0888ux.m5988(r5, r0, r3, r2, r3)
        L246:
            r18 = r1
            r2 = r22
            r9 = r26
        L24c:
            r8 = r27
            goto L2c7
        L250:
            r27 = r8
            r26 = r9
            r3 = 994008(0xf2ad8, float:1.392902E-39)
            java.lang.String r8 = " code="
            if (r7 != r3) goto L27d
            int r0 = r27 + 1
            java.lang.String r3 = "食物目录跳过 name="
            java.lang.StringBuilder r3 = p000.AbstractC0602nx.m4137(r3, r13, r14, r6)
            r3.append(r8)
            r3.append(r7)
            java.lang.String r4 = " reason=pet_not_exist"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 4
            r7 = 0
            p000.C0888ux.m5988(r5, r3, r7, r4, r7)
            r8 = r0
            r18 = r1
            r9 = r26
            goto L2c7
        L27d:
            int r9 = r26 + 1
            if (r18 == 0) goto L285
            int r25 = r18.intValue()
        L285:
            r3 = r25
            java.lang.String r4 = r4.f12148
            if (r4 != 0) goto L28d
            r4 = r23
        L28d:
            r18 = r1
            java.lang.String r1 = "食物目录业务失败 name="
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4137(r1, r13, r14, r6)
            r1.append(r12)
            r1.append(r0)
            r1.append(r11)
            r1.append(r3)
            r1.append(r8)
            r1.append(r7)
            java.lang.String r0 = " msg="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r3 = 4
            r4 = 0
            p000.C0888ux.m5979(r5, r0, r4, r3, r4)
            goto L24c
        L2b9:
            r17 = r0
            r18 = r1
            r19 = r3
            r20 = r7
            r27 = r8
            r26 = r9
            r24 = r12
        L2c7:
            java.lang.Throwable r0 = p000.fo1.m2190(r19)
            if (r0 == 0) goto L2e6
            int r9 = r9 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "食物目录拉取失败 name="
            r1.<init>(r3)
            r1.append(r13)
            r1.append(r6)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            p000.C0888ux.m5977(r5, r1, r0)
        L2e6:
            int r0 = r17.size()
            int r0 = r0 + (-1)
            if (r10 >= r0) goto L30a
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L2f4
            goto L30a
        L2f4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L30a
        L2fc:
            r17 = r0
            r18 = r1
            r16 = r3
            r20 = r7
            r27 = r8
            r26 = r9
            r24 = r12
        L30a:
            r3 = r16
            r0 = r17
            r1 = r18
            r7 = r20
            r10 = r24
            r4 = 4
            r6 = 0
            goto L8a
        L318:
            p000.AbstractC1021yh.m6917()
            r3 = 0
            throw r3
        L31d:
            r17 = r0
            r3 = r6
            r27 = r8
            r26 = r9
            int r0 = r17.size()
            java.lang.String r1 = ", 成功 "
            java.lang.String r4 = ", 跳过 "
            java.lang.String r6 = "食物列表调试完成: 会话 "
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r6, r0, r1, r2, r4)
            r0.append(r8)
            java.lang.String r1 = ", 失败 "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r4 = 4
            p000.C0888ux.m5988(r5, r0, r3, r4, r3)
            hf1 r1 = new hf1
            int r3 = r17.size()
            r1.<init>(r3, r2, r9, r0)
            return r1
    }
}
