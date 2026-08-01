package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ue1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f10717 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.ue1.f10717 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.te1 m5853(java.lang.ClassLoader r33) {
            java.util.concurrent.ConcurrentHashMap r0 = p000.ry1.f9620
            java.util.Map r0 = p000.ex0.m1975(r0)
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            f7 r0 = p000.AbstractC0984xh.m6661(r0)
            f71 r1 = new f71
            r2 = 28
            r1.<init>(r2)
            y30 r2 = new y30
            r3 = 1
            r2.<init>(r0, r3, r1)
            ib1 r0 = new ib1
            r1 = 10
            r0.<init>(r1)
            java.util.List r2 = p000.us1.m5949(r2)
            p000.AbstractC0019ai.m168(r2, r0)
            java.util.Iterator r0 = r2.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L38
            jz r0 = p000.C0450jz.f5672
            goto L5a
        L38:
            java.lang.Object r2 = r0.next()
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L47
            java.util.List r0 = p000.AbstractC1021yh.m6896(r2)
            goto L5a
        L47:
            java.util.ArrayList r2 = p000.lz1.m3696(r2)
        L4b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L59
            java.lang.Object r4 = r0.next()
            r2.add(r4)
            goto L4b
        L59:
            r0 = r2
        L5a:
            boolean r2 = r0.isEmpty()
            r4 = 4
            java.lang.String r5 = "rb4e434d444870f0e"
            r6 = 0
            if (r2 == 0) goto L73
            java.lang.String r12 = "没有已收集的小火人单聊会话，请先进入私信列表或聊天页"
            p000.C0888ux.m5988(r5, r12, r6, r4, r6)
            te1 r7 = new te1
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L73:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            int r7 = r0.size()
            java.lang.String r8 = "开始读取亲密度 会话="
            java.lang.String r9 = " module=Closeness(2)，仅执行只读请求"
            java.lang.String r7 = p000.AbstractC0602nx.m4127(r8, r7, r9)
            p000.C0888ux.m5988(r5, r7, r6, r4, r6)
            java.util.Iterator r7 = r0.iterator()
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L8f:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L37d
            java.lang.Object r10 = r7.next()
            int r14 = r9 + 1
            if (r9 < 0) goto L378
            ky1 r10 = (p000.ky1) r10
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            boolean r15 = r15.isInterrupted()
            if (r15 != 0) goto L35c
            ry1 r15 = p000.ry1.f9602
            java.lang.String r15 = p000.ry1.m5197(r10)
            r16 = r9
            long r8 = r10.f6323
            pe1 r10 = p000.pe1.f8537
            r17 = r3
            r3 = r33
            java.lang.Object r10 = r10.m4513(r3, r8)
            boolean r1 = r10 instanceof p000.eo1
            java.lang.String r4 = " shortId="
            if (r1 != 0) goto L315
            r1 = r10
            oe1 r1 = (p000.oe1) r1
            r18 = r6
            int r6 = r1.f8062
            boolean r19 = r1.m4228()
            java.lang.String r20 = ""
            r21 = -1
            if (r19 == 0) goto L296
            int r11 = r11 + 1
            ne1 r1 = r1.f8064
            if (r1 == 0) goto L28e
            java.util.List r6 = r1.f7589
            boolean r19 = r6.isEmpty()
            if (r19 == 0) goto Le6
            r24 = r0
            r0 = 0
            goto L10f
        Le6:
            java.util.Iterator r19 = r6.iterator()
            r22 = 0
        Lec:
            boolean r23 = r19.hasNext()
            if (r23 == 0) goto L10b
            java.lang.Object r23 = r19.next()
            r24 = r0
            r0 = r23
            ke1 r0 = (p000.ke1) r0
            boolean r0 = r0.f5878
            if (r0 == 0) goto L104
            int r22 = r22 + 1
            if (r22 < 0) goto L107
        L104:
            r0 = r24
            goto Lec
        L107:
            p000.AbstractC1021yh.m6916()
            throw r18
        L10b:
            r24 = r0
            r0 = r22
        L10f:
            java.lang.Integer r3 = r1.f7583
            if (r3 == 0) goto L11a
            int r3 = r3.intValue()
        L117:
            r19 = r6
            goto L11d
        L11a:
            r3 = r21
            goto L117
        L11d:
            java.lang.Integer r6 = r1.f7584
            if (r6 == 0) goto L128
            int r6 = r6.intValue()
        L125:
            r22 = r7
            goto L12b
        L128:
            r6 = r21
            goto L125
        L12b:
            java.lang.Long r7 = r1.f7585
            r25 = -1
            if (r7 == 0) goto L13e
            long r27 = r7.longValue()
            r23 = r11
            r31 = r27
            r27 = r10
            r10 = r31
            goto L144
        L13e:
            r27 = r10
            r23 = r11
            r10 = r25
        L144:
            java.lang.Long r7 = r1.f7588
            if (r7 == 0) goto L154
            long r28 = r7.longValue()
            r7 = r13
            r31 = r28
            r28 = r14
            r13 = r31
            goto L159
        L154:
            r7 = r13
            r28 = r14
            r13 = r25
        L159:
            java.lang.Long r1 = r1.f7587
            if (r1 == 0) goto L161
            long r25 = r1.longValue()
        L161:
            r29 = r2
            r1 = r25
            r25 = r7
            int r7 = r19.size()
            r26 = r12
            java.lang.String r12 = "亲密度信息 name="
            java.lang.StringBuilder r12 = p000.AbstractC0602nx.m4137(r12, r15, r8, r4)
            r30 = r4
            java.lang.String r4 = " level="
            r12.append(r4)
            r12.append(r3)
            java.lang.String r3 = "/"
            r12.append(r3)
            r12.append(r6)
            java.lang.String r4 = " progress="
            p000.AbstractC0602nx.m4118(r12, r4, r10, r3)
            r12.append(r13)
            java.lang.String r3 = " total="
            java.lang.String r4 = " behaviors="
            p000.AbstractC0602nx.m4118(r12, r3, r1, r4)
            r12.append(r7)
            java.lang.String r1 = " claimable="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            r2 = r18
            r1 = 4
            p000.C0888ux.m5988(r5, r0, r2, r1, r2)
            java.util.Iterator r0 = r19.iterator()
        L1ad:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f3
            java.lang.Object r1 = r0.next()
            ke1 r1 = (p000.ke1) r1
            int r2 = r1.f5875
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r29
            boolean r2 = r3.add(r2)
            if (r2 == 0) goto L1f0
            int r2 = r1.f5875
            java.lang.String r4 = r1.f5876
            if (r4 != 0) goto L1cf
            r4 = r20
        L1cf:
            java.lang.Integer r1 = r1.f5877
            if (r1 == 0) goto L1d8
            int r1 = r1.intValue()
            goto L1da
        L1d8:
            r1 = r21
        L1da:
            java.lang.String r6 = " behaviorName="
            java.lang.String r7 = " amount="
            java.lang.String r10 = "亲密度配置 id="
            java.lang.StringBuilder r2 = p000.a12.m20(r2, r10, r6, r4, r7)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 4
            r4 = 0
            p000.C0888ux.m5988(r5, r1, r4, r2, r4)
        L1f0:
            r29 = r3
            goto L1ad
        L1f3:
            r3 = r29
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r19.iterator()
        L1fe:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L213
            java.lang.Object r2 = r1.next()
            r4 = r2
            ke1 r4 = (p000.ke1) r4
            boolean r4 = r4.f5878
            if (r4 == 0) goto L1fe
            r0.add(r2)
            goto L1fe
        L213:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L281
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r4 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L228:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L265
            java.lang.Object r4 = r0.next()
            ke1 r4 = (p000.ke1) r4
            int r6 = r4.f5875
            java.lang.String r7 = r4.f5876
            if (r7 != 0) goto L23c
            r7 = r20
        L23c:
            java.lang.Integer r4 = r4.f5877
            if (r4 == 0) goto L245
            int r4 = r4.intValue()
            goto L247
        L245:
            r4 = r21
        L247:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = ":"
            r10.append(r6)
            r10.append(r7)
            r10.append(r6)
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            r1.add(r4)
            goto L228
        L265:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "亲密度待领取 name="
            r0.<init>(r4)
            r0.append(r15)
            java.lang.String r4 = " items="
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r4 = 0
            p000.C0888ux.m5988(r5, r0, r4, r1, r4)
            goto L284
        L281:
            r2 = 10
            r4 = 0
        L284:
            r11 = r23
            r13 = r25
            r12 = r26
            r7 = r30
            goto L325
        L28e:
            r4 = r18
            java.lang.String r0 = "Required value was null."
            p000.C1080.m7279(r0)
            return r4
        L296:
            r24 = r0
            r3 = r2
            r30 = r4
            r22 = r7
            r27 = r10
            r26 = r12
            r25 = r13
            r28 = r14
            r2 = 10
            r0 = 994008(0xf2ad8, float:1.392902E-39)
            java.lang.String r4 = " code="
            if (r6 != r0) goto L2cf
            int r12 = r26 + 1
            java.lang.String r0 = "亲密度读取跳过 name="
            r7 = r30
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r0, r15, r8, r7)
            r0.append(r4)
            r0.append(r6)
            java.lang.String r1 = " reason=pet_not_exist"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 4
            r4 = 0
            p000.C0888ux.m5988(r5, r0, r4, r1, r4)
            r13 = r25
            goto L325
        L2cf:
            r7 = r30
            int r13 = r25 + 1
            int r0 = r1.f8060
            java.lang.Integer r10 = r1.f8061
            if (r10 == 0) goto L2dd
            int r21 = r10.intValue()
        L2dd:
            r10 = r21
            java.lang.String r1 = r1.f8063
            if (r1 != 0) goto L2e5
            r1 = r20
        L2e5:
            java.lang.String r12 = "亲密度读取业务失败 name="
            java.lang.StringBuilder r12 = p000.AbstractC0602nx.m4137(r12, r15, r8, r7)
            java.lang.String r14 = " bridge="
            r12.append(r14)
            r12.append(r0)
            java.lang.String r0 = " http="
            r12.append(r0)
            r12.append(r10)
            r12.append(r4)
            r12.append(r6)
            java.lang.String r0 = " msg="
            r12.append(r0)
            r12.append(r1)
            java.lang.String r0 = r12.toString()
            r1 = 4
            r4 = 0
            p000.C0888ux.m5979(r5, r0, r4, r1, r4)
            r12 = r26
            goto L325
        L315:
            r24 = r0
            r3 = r2
            r22 = r7
            r27 = r10
            r26 = r12
            r25 = r13
            r28 = r14
            r2 = 10
            r7 = r4
        L325:
            java.lang.Throwable r0 = p000.fo1.m2190(r27)
            if (r0 == 0) goto L344
            int r13 = r13 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "亲密度读取失败 name="
            r1.<init>(r4)
            r1.append(r15)
            r1.append(r7)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            p000.C0888ux.m5977(r5, r1, r0)
        L344:
            int r0 = r24.size()
            int r0 = r0 + (-1)
            r8 = r16
            if (r8 >= r0) goto L36a
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L354
            goto L36a
        L354:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L36a
        L35c:
            r24 = r0
            r17 = r3
            r22 = r7
            r26 = r12
            r25 = r13
            r28 = r14
            r3 = r2
            r2 = r1
        L36a:
            r1 = r2
            r2 = r3
            r3 = r17
            r7 = r22
            r0 = r24
            r9 = r28
            r4 = 4
            r6 = 0
            goto L8f
        L378:
            p000.AbstractC1021yh.m6917()
            r4 = 0
            throw r4
        L37d:
            r24 = r0
            r4 = r6
            r26 = r12
            r25 = r13
            int r0 = r24.size()
            java.lang.String r1 = ", 成功 "
            java.lang.String r2 = ", 跳过 "
            java.lang.String r3 = "亲密度调试完成: 会话 "
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r3, r0, r1, r11, r2)
            r0.append(r12)
            java.lang.String r1 = ", 失败 "
            r0.append(r1)
            r7 = r25
            r0.append(r7)
            java.lang.String r14 = r0.toString()
            r1 = 4
            p000.C0888ux.m5988(r5, r14, r4, r1, r4)
            te1 r9 = new te1
            int r10 = r24.size()
            r13 = r7
            r9.<init>(r10, r11, r12, r13, r14)
            return r9
    }
}
