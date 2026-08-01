package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class v71 implements p000.xp1 {

    /* JADX INFO: renamed from: α */
    public static volatile boolean f11124;

    /* JADX INFO: renamed from: α */
    public static final p000.ix0 m6032(java.util.regex.Matcher r0, int r1, java.lang.CharSequence r2) {
            boolean r1 = r0.find(r1)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            ix0 r1 = new ix0
            r1.<init>(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static final int m6033(float r2) {
            double r0 = (double) r2
            double r0 = java.lang.Math.ceil(r0)
            float r2 = (float) r0
            int r2 = java.lang.Math.round(r2)
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static void m6034(int r0, int r1) {
            if (r0 >= r1) goto Lf
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L8
            return
        L8:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Lf:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static org.json.JSONObject m6035(java.lang.Object r6) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r6 instanceof java.lang.Boolean
            java.lang.String r2 = "value"
            java.lang.String r3 = "type"
            if (r1 == 0) goto L1c
            java.lang.String r1 = "boolean"
            r0.put(r3, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0.put(r2, r6)
            return r0
        L1c:
            boolean r1 = r6 instanceof java.lang.Integer
            if (r1 == 0) goto L2f
            java.lang.String r1 = "int"
            r0.put(r3, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0.put(r2, r6)
            return r0
        L2f:
            boolean r1 = r6 instanceof java.lang.Long
            if (r1 == 0) goto L42
            java.lang.String r1 = "long"
            r0.put(r3, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            long r3 = r6.longValue()
            r0.put(r2, r3)
            return r0
        L42:
            boolean r1 = r6 instanceof java.lang.Float
            if (r1 == 0) goto L56
            java.lang.String r1 = "float"
            r0.put(r3, r1)
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            double r3 = (double) r6
            r0.put(r2, r3)
            return r0
        L56:
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L63
            java.lang.String r1 = "string"
            r0.put(r3, r1)
            r0.put(r2, r6)
            return r0
        L63:
            boolean r1 = r6 instanceof java.util.Set
            if (r1 == 0) goto Laa
            java.lang.String r1 = "string_set"
            r0.put(r3, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r6.iterator()
        L7c:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r6.next()
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L7c
            r3.add(r4)
            goto L7c
        L8e:
            java.util.List r6 = p000.AbstractC0984xh.m6657(r3)
            java.util.Iterator r6 = r6.iterator()
        L96:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto La6
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.put(r3)
            goto L96
        La6:
            r0.put(r2, r1)
            return r0
        Laa:
            java.lang.String r1 = "unsupported"
            r0.put(r3, r1)
            if (r6 == 0) goto Lb6
            java.lang.String r6 = r6.toString()
            goto Lb7
        Lb6:
            r6 = 0
        Lb7:
            if (r6 != 0) goto Lbb
            java.lang.String r6 = ""
        Lbb:
            r0.put(r2, r6)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static p000.kf1 m6036(java.lang.ClassLoader r32) {
            r0 = r32
            java.util.concurrent.ConcurrentHashMap r1 = p000.ry1.f9620
            java.util.Map r1 = p000.ex0.m1975(r1)
            java.util.Collection r1 = r1.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            f7 r1 = p000.AbstractC0984xh.m6661(r1)
            cf1 r2 = new cf1
            r3 = 4
            r2.<init>(r3)
            y30 r4 = new y30
            r5 = 1
            r4.<init>(r1, r5, r2)
            ib1 r1 = new ib1
            r2 = 13
            r1.<init>(r2)
            java.util.List r2 = p000.us1.m5949(r4)
            p000.AbstractC0019ai.m168(r2, r1)
            java.util.Iterator r1 = r2.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L39
            jz r1 = p000.C0450jz.f5672
            goto L5b
        L39:
            java.lang.Object r2 = r1.next()
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L48
            java.util.List r1 = p000.AbstractC1021yh.m6896(r2)
            goto L5b
        L48:
            java.util.ArrayList r2 = p000.lz1.m3696(r2)
        L4c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r1.next()
            r2.add(r4)
            goto L4c
        L5a:
            r1 = r2
        L5b:
            boolean r2 = r1.isEmpty()
            r10 = 1
            if (r2 == 0) goto L6f
            kf1 r4 = new kf1
            r8 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r11 = "没有已识别的小火人单聊会话"
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L6f:
            java.lang.String r2 = "pet_elf_auto_feed_default_food_id"
            java.lang.String r4 = "204"
            java.lang.String r2 = p000.ui1.m5893(r2, r4)
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            r2.getClass()
            java.lang.CharSequence r5 = p000.q02.m4660(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "__smart__"
            boolean r5 = p000.ln0.m3626(r5, r6)
            r7 = 10
            java.lang.String r8 = ""
            r9 = 0
            if (r5 == 0) goto L99
            r2 = r6
            goto Lb2
        L99:
            java.lang.Integer r2 = p000.x02.m6487(r2, r7)
            if (r2 == 0) goto Lae
            int r5 = r2.intValue()
            if (r5 <= 0) goto La6
            goto La7
        La6:
            r2 = r9
        La7:
            if (r2 == 0) goto Lae
            java.lang.String r2 = r2.toString()
            goto Laf
        Lae:
            r2 = r9
        Laf:
            if (r2 != 0) goto Lb2
            r2 = r8
        Lb2:
            boolean r5 = p000.q02.m4671(r2)
            if (r5 == 0) goto Lb9
            goto Lba
        Lb9:
            r4 = r2
        Lba:
            java.lang.String r2 = "pet_elf_auto_feed_max_price"
            r5 = 0
            android.content.SharedPreferences r11 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lc6
            int r2 = r11.getInt(r2, r5)     // Catch: java.lang.Throwable -> Lc6
            goto Lc7
        Lc6:
            r2 = r5
        Lc7:
            r11 = 100
            int r2 = p000.j81.m2906(r2, r5, r11)
            java.lang.CharSequence r11 = p000.q02.m4660(r4)
            java.lang.String r11 = r11.toString()
            boolean r6 = p000.ln0.m3626(r11, r6)
            if (r6 == 0) goto Lde
            java.lang.String r6 = "智能选择"
            goto Le4
        Lde:
            java.lang.String r6 = "foodId="
            java.lang.String r6 = r6.concat(r4)
        Le4:
            int r11 = r1.size()
            java.lang.String r12 = " selection="
            java.lang.String r13 = " maxPrice="
            java.lang.String r14 = "开始按设置投喂 会话="
            java.lang.StringBuilder r6 = p000.a12.m20(r11, r14, r12, r6, r13)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r11 = "rfac809154b3e7cbf"
            p000.C0888ux.m5988(r11, r6, r9, r3, r9)
            java.util.Iterator r6 = r1.iterator()
            r7 = r5
            r12 = r7
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r10
            r10 = r15
        L10a:
            boolean r18 = r6.hasNext()
            if (r18 == 0) goto L3f7
            int r18 = r5 + 1
            java.lang.Object r19 = r6.next()
            r3 = r19
            ky1 r3 = (p000.ky1) r3
            java.lang.Thread r19 = java.lang.Thread.currentThread()
            boolean r19 = r19.isInterrupted()
            if (r19 != 0) goto L3f7
            ry1 r19 = p000.ry1.f9602
            java.lang.String r9 = p000.ry1.m5197(r3)
            r20 = r6
            r21 = r7
            long r6 = r3.f6323
            java.lang.Object r3 = p000.p91.m4424(r0, r6)
            r22 = r1
            boolean r1 = r3 instanceof p000.eo1
            r23 = r1
            java.lang.String r1 = " shortId="
            if (r23 == 0) goto L17e
            int r21 = r21 + 1
            r23 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r24 = r8
            java.lang.String r8 = "按设置投喂前目录读取失败 name="
            r3.<init>(r8)
            r3.append(r9)
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = r3.toString()
            java.lang.Throwable r3 = p000.fo1.m2190(r23)
            if (r3 != 0) goto L165
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r6 = "食物目录返回未知错误"
            r3.<init>(r6)
        L165:
            p000.C0888ux.m5977(r11, r1, r3)
            int r1 = r22.size()
            int r1 = r1 + (-1)
            m6034(r5, r1)
            r5 = r18
            r6 = r20
            r7 = r21
            r1 = r22
            r8 = r24
        L17b:
            r3 = 4
            r9 = 0
            goto L10a
        L17e:
            r23 = r3
            r24 = r8
            p000.i81.m2649(r23)
            r3 = r23
            xe1 r3 = (p000.xe1) r3
            boolean r8 = r3.m6629()
            r23 = r8
            java.lang.String r8 = " msg="
            r26 = r10
            java.lang.String r10 = " code="
            r27 = r12
            java.lang.String r12 = "按设置投喂跳过 name="
            if (r23 != 0) goto L1e2
            int r1 = r3.f12147
            r6 = 994008(0xf2ad8, float:1.392902E-39)
            if (r1 != r6) goto L1b2
            int r10 = r26 + 1
            java.lang.String r1 = " reason=pet_not_exist"
            java.lang.String r1 = p000.lz1.m3674(r12, r9, r1)
            r3 = 4
            r6 = 0
            p000.C0888ux.m5988(r11, r1, r6, r3, r6)
            r7 = r21
            goto L1ce
        L1b2:
            int r7 = r21 + 1
            java.lang.String r3 = r3.f12148
            if (r3 != 0) goto L1ba
            r3 = r24
        L1ba:
            java.lang.String r6 = "按设置投喂前目录业务失败 name="
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4135(r1, r6, r9, r10, r8)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = 4
            r6 = 0
            p000.C0888ux.m5979(r11, r1, r6, r3, r6)
            r10 = r26
        L1ce:
            int r1 = r22.size()
            int r1 = r1 + (-1)
            m6034(r5, r1)
            r5 = r18
            r6 = r20
            r1 = r22
            r8 = r24
            r12 = r27
            goto L17b
        L1e2:
            int r13 = r13 + 1
            java.util.List r3 = r3.f12150
            ta1 r3 = p000.g81.m2273(r2, r4, r3)
            r23 = r2
            ua1 r2 = r3.f10265
            r28 = r4
            ze1 r4 = r3.f10264
            r29 = r13
            java.lang.String r13 = " reason="
            if (r4 == 0) goto L3ab
            if (r2 != 0) goto L3ab
            if (r4 == 0) goto L3a4
            java.lang.String r2 = r4.f13064
            r3 = 10
            java.lang.Integer r2 = p000.x02.m6487(r2, r3)
            java.lang.Integer r3 = r4.f13066
            if (r2 == 0) goto L20a
            if (r3 != 0) goto L212
        L20a:
            r31 = r14
            r30 = r15
            r3 = 4
            r6 = 0
            goto L375
        L212:
            r30 = r15
            int r15 = r2.intValue()
            r31 = r14
            int r14 = r3.intValue()
            java.lang.Object r14 = p000.p91.m4423(r0, r6, r15, r14)
            boolean r15 = r14 instanceof p000.eo1
            if (r15 == 0) goto L26e
            int r2 = r21 + 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "按设置投喂请求失败 name="
            r3.<init>(r4)
            r3.append(r9)
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = r3.toString()
            java.lang.Throwable r3 = p000.fo1.m2190(r14)
            if (r3 != 0) goto L249
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "投喂返回未知错误"
            r3.<init>(r4)
        L249:
            p000.C0888ux.m5977(r11, r1, r3)
            int r1 = r22.size()
            int r1 = r1 + (-1)
            m6034(r5, r1)
            r7 = r2
            r5 = r18
            r6 = r20
            r1 = r22
            r2 = r23
            r8 = r24
            r10 = r26
            r12 = r27
            r4 = r28
            r13 = r29
            r15 = r30
        L26a:
            r14 = r31
            goto L17b
        L26e:
            p000.i81.m2649(r14)
            we1 r14 = (p000.we1) r14
            java.lang.String r1 = r14.f11694
            int r6 = r14.f11693
            boolean r7 = r14.m6376()
            r15 = -1
            if (r7 == 0) goto L2e1
            int r1 = r31 + 1
            java.lang.String r6 = r4.f13065
            r7 = 48
            java.lang.String r6 = p000.q02.m4693(r6, r7)
            java.lang.Long r7 = r14.f11698
            if (r7 != 0) goto L294
            java.lang.Integer r7 = r4.f13068
            if (r7 != 0) goto L294
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
        L294:
            java.lang.Long r4 = r14.f11697
            if (r4 == 0) goto L29d
            long r12 = r4.longValue()
            goto L29f
        L29d:
            r12 = -1
        L29f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "按设置投喂成功 name="
            r4.<init>(r8)
            r4.append(r9)
            java.lang.String r8 = " foodId="
            r4.append(r8)
            r4.append(r2)
            java.lang.String r2 = " foodName="
            r4.append(r2)
            r4.append(r6)
            java.lang.String r2 = " price="
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = " closeness="
            r4.append(r2)
            r4.append(r7)
            java.lang.String r2 = " balanceSpark="
            r4.append(r2)
            r4.append(r12)
            java.lang.String r2 = r4.toString()
            r3 = 4
            r6 = 0
            p000.C0888ux.m5988(r11, r2, r6, r3, r6)
            r14 = r1
            r7 = r21
            r10 = r26
            goto L357
        L2e1:
            r2 = 300001(0x493e1, float:4.20391E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 300002(0x493e2, float:4.20392E-40)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r25 = 994008(0xf2ad8, float:1.392902E-39)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r25)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r2, r3, r4}
            java.util.Set r2 = p000.AbstractC0312g7.m2263(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L324
            int r2 = r26 + 1
            if (r1 != 0) goto L30e
            r1 = r24
        L30e:
            java.lang.StringBuilder r3 = p000.AbstractC0602nx.m4135(r6, r12, r9, r10, r8)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r3 = 4
            r6 = 0
            p000.C0888ux.m5988(r11, r1, r6, r3, r6)
            r10 = r2
            r7 = r21
        L321:
            r14 = r31
            goto L357
        L324:
            int r7 = r21 + 1
            r2 = 300003(0x493e3, float:4.20394E-40)
            if (r6 != r2) goto L32e
            java.lang.String r2 = "price_changed_no_retry"
            goto L330
        L32e:
            java.lang.String r2 = "business_error"
        L330:
            int r3 = r14.f11691
            java.lang.Integer r4 = r14.f11692
            if (r4 == 0) goto L33a
            int r15 = r4.intValue()
        L33a:
            if (r1 != 0) goto L33e
            r1 = r24
        L33e:
            java.lang.String r4 = " bridge="
            java.lang.String r12 = " http="
            java.lang.String r14 = "按设置投喂失败 name="
            java.lang.StringBuilder r3 = p000.AbstractC0602nx.m4135(r3, r14, r9, r4, r12)
            p000.AbstractC0602nx.m4117(r3, r15, r10, r6, r13)
            java.lang.String r1 = p000.AbstractC0602nx.m4133(r3, r2, r8, r1)
            r3 = 4
            r6 = 0
            p000.C0888ux.m5979(r11, r1, r6, r3, r6)
            r10 = r26
            goto L321
        L357:
            int r1 = r22.size()
            int r1 = r1 + (-1)
            m6034(r5, r1)
            r9 = r6
            r5 = r18
            r6 = r20
            r1 = r22
            r2 = r23
            r8 = r24
            r12 = r27
            r4 = r28
            r13 = r29
            r15 = r30
            goto L10a
        L375:
            int r1 = r27 + 1
            java.lang.String r2 = " reason=invalid_catalog_item"
            java.lang.String r2 = p000.lz1.m3674(r12, r9, r2)
            p000.C0888ux.m5988(r11, r2, r6, r3, r6)
            int r2 = r22.size()
            int r2 = r2 + (-1)
            m6034(r5, r2)
            r12 = r1
            r9 = r6
            r5 = r18
            r6 = r20
            r7 = r21
            r1 = r22
            r2 = r23
            r8 = r24
            r10 = r26
            r4 = r28
            r13 = r29
            r15 = r30
            r14 = r31
            r3 = 4
            goto L10a
        L3a4:
            r6 = 0
            java.lang.String r0 = "Required value was null."
            p000.C1080.m7279(r0)
            return r6
        L3ab:
            r31 = r14
            r30 = r15
            r17 = 10
            ua1 r1 = p000.ua1.f10667
            if (r2 != r1) goto L3ba
            int r15 = r30 + 1
            r1 = r27
            goto L3be
        L3ba:
            int r1 = r27 + 1
            r15 = r30
        L3be:
            if (r2 == 0) goto L3c3
            java.lang.String r2 = r2.f10670
            goto L3c5
        L3c3:
            java.lang.String r2 = "policy_rejected"
        L3c5:
            java.lang.String r3 = r3.f10266
            java.lang.String r4 = " detail="
            java.lang.StringBuilder r2 = p000.lz1.m3695(r12, r9, r13, r2, r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 4
            r6 = 0
            p000.C0888ux.m5988(r11, r2, r6, r3, r6)
            int r2 = r22.size()
            int r2 = r2 + (-1)
            m6034(r5, r2)
            r12 = r1
            r5 = r18
            r6 = r20
            r7 = r21
            r1 = r22
            r2 = r23
            r8 = r24
            r10 = r26
            r4 = r28
            r13 = r29
            goto L26a
        L3f7:
            r21 = r7
            r26 = r10
            r27 = r12
            r31 = r14
            r30 = r15
            java.lang.String r0 = ", 成功 "
            java.lang.String r1 = ", 价格拦截 "
            java.lang.String r2 = "按设置投喂完成: 会话 "
            r14 = r31
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r13, r0, r14, r1)
            java.lang.String r1 = ", 目录不可用 "
            java.lang.String r2 = ", 跳过 "
            r5 = r27
            r15 = r30
            p000.AbstractC0602nx.m4117(r0, r15, r1, r5, r2)
            r10 = r26
            r0.append(r10)
            java.lang.String r1 = ", 失败 "
            r0.append(r1)
            r7 = r21
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r3 = 4
            r6 = 0
            p000.C0888ux.m5988(r11, r0, r6, r3, r6)
            kf1 r12 = new kf1
            r19 = r0
            r16 = r5
            r18 = r7
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            return r12
    }

    /* JADX INFO: renamed from: η */
    public static final p000.hr0 m6037(android.view.View r3) {
        L0:
            r0 = 0
            if (r3 == 0) goto L22
            r1 = 2131297158(0x7f090386, float:1.8212253E38)
            java.lang.Object r1 = r3.getTag(r1)
            boolean r2 = r1 instanceof p000.hr0
            if (r2 == 0) goto L11
            hr0 r1 = (p000.hr0) r1
            goto L12
        L11:
            r1 = r0
        L12:
            if (r1 == 0) goto L15
            return r1
        L15:
            android.view.ViewParent r3 = p000.p91.m4429(r3)
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L20
            android.view.View r3 = (android.view.View) r3
            goto L0
        L20:
            r3 = r0
            goto L0
        L22:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static final p000.m32 m6038(p000.xr1 r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            is1 r1 = p000.wr1.f11812
            b21 r2 = r2.f12268
            java.lang.Object r2 = r2.m695(r1)
            r1 = 0
            if (r2 != 0) goto L11
            r2 = r1
        L11:
            м r2 = (p000.C1114) r2
            if (r2 == 0) goto L2f
            m80 r2 = r2.f13447
            a80 r2 = (p000.a80) r2
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r2.invoke(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2f
            r2 = 0
            java.lang.Object r2 = r0.get(r2)
            m32 r2 = (p000.m32) r2
            return r2
        L2f:
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static final boolean m6039(android.text.Spanned r2, java.lang.Class r3) {
            r0 = -1
            int r1 = r2.length()
            int r3 = r2.nextSpanTransition(r0, r1, r3)
            int r2 = r2.length()
            if (r3 == r2) goto L11
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static void m6040(p000.z81 r17, boolean r18) {
            r1 = r17
            p000.v71.f11124 = r18
            r2 = 1
            r4 = 0
            r5 = 4
            if (r18 == 0) goto L22e
            java.lang.String r0 = "r3e86435464f24cb5"
            java.lang.String r6 = "使用 3903 顶栏 Tab 过滤分支"
            p000.C0888ux.m5975(r0, r6)
            l52 r6 = p000.l52.f6428
            java.lang.String r0 = "ra3f49bce40b36580"
            java.lang.String r7 = "初始化 3903 顶栏 Tab 过滤"
            p000.C0888ux.m5975(r0, r7)
            java.lang.ClassLoader r0 = r1.f13011
            java.lang.Object r7 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L34
            java.lang.String r7 = p000.l52.f6431     // Catch: java.lang.Throwable -> L34
            java.lang.Class r7 = p000.qe0.m4876(r0, r7)     // Catch: java.lang.Throwable -> L34
            java.lang.String r8 = p000.l52.f6432     // Catch: java.lang.Throwable -> L34
            java.lang.Class r0 = p000.qe0.m4876(r0, r8)     // Catch: java.lang.Throwable -> L34
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L34
            java.lang.Class r8 = p000.l52.f6447     // Catch: java.lang.Throwable -> L83
            if (r8 != r7) goto L39
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
            r3 = r2
            r16 = 0
            goto L120
        L34:
            r0 = move-exception
            r16 = 0
            goto L114
        L39:
            java.lang.reflect.Method[] r8 = r7.getDeclaredMethods()     // Catch: java.lang.Throwable -> L83
            r8.getClass()     // Catch: java.lang.Throwable -> L83
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L83
            r9.<init>()     // Catch: java.lang.Throwable -> L83
            int r10 = r8.length     // Catch: java.lang.Throwable -> L83
            r11 = 0
        L47:
            if (r11 >= r10) goto L8b
            r12 = r8[r11]     // Catch: java.lang.Throwable -> L83
            int r13 = r12.getModifiers()     // Catch: java.lang.Throwable -> L83
            boolean r13 = java.lang.reflect.Modifier.isStatic(r13)     // Catch: java.lang.Throwable -> L83
            if (r13 != 0) goto L80
            java.lang.Class r13 = r12.getReturnType()     // Catch: java.lang.Throwable -> L83
            java.lang.Class r14 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L83
            boolean r13 = p000.ln0.m3626(r13, r14)     // Catch: java.lang.Throwable -> L83
            if (r13 == 0) goto L80
            java.lang.Class[] r13 = r12.getParameterTypes()     // Catch: java.lang.Throwable -> L83
            r13.getClass()     // Catch: java.lang.Throwable -> L83
            int r14 = r13.length     // Catch: java.lang.Throwable -> L83
            r15 = 0
        L6a:
            if (r15 >= r14) goto L80
            r16 = 0
            r3 = r13[r15]     // Catch: java.lang.Throwable -> L7a
            boolean r3 = r0.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L7d
            r9.add(r12)     // Catch: java.lang.Throwable -> L7a
            goto L88
        L7a:
            r0 = move-exception
            goto L112
        L7d:
            int r15 = r15 + 1
            goto L6a
        L80:
            r16 = 0
            goto L88
        L83:
            r0 = move-exception
            r16 = 0
            goto L112
        L88:
            int r11 = r11 + 1
            goto L47
        L8b:
            r16 = 0
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7a
            r3.<init>()     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r8 = r9.iterator()     // Catch: java.lang.Throwable -> L7a
        L9b:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r9 == 0) goto Lbb
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L7a
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L7a
            l52 r11 = p000.l52.f6428     // Catch: java.lang.Throwable -> L7a
            r10.getClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r10 = p000.l52.m3516(r10)     // Catch: java.lang.Throwable -> L7a
            boolean r10 = r0.add(r10)     // Catch: java.lang.Throwable -> L7a
            if (r10 == 0) goto L9b
            r3.add(r9)     // Catch: java.lang.Throwable -> L7a
            goto L9b
        Lbb:
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto Lce
            java.lang.String r0 = "ra3f49bce40b36580"
            java.lang.String r3 = "未找到 3903 顶栏 ViewPager 结构候选，已降级为不捕获页序"
            p000.C0888ux.m5979(r0, r3, r4, r5, r4)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lcc
        Lc9:
            r3 = r16
            goto L120
        Lcc:
            r0 = move-exception
            goto L114
        Lce:
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L7a
        Ld2:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r8 == 0) goto Lee
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L7a
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L7a
            r8.setAccessible(r2)     // Catch: java.lang.Throwable -> L7a
            xq0 r9 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L7a
            py1 r10 = new py1     // Catch: java.lang.Throwable -> L7a
            r11 = 12
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L7a
            r9.m6775(r8, r10)     // Catch: java.lang.Throwable -> L7a
            goto Ld2
        Lee:
            l52 r0 = p000.l52.f6428     // Catch: java.lang.Throwable -> L7a
            p000.l52.m3511(r7)     // Catch: java.lang.Throwable -> L7a
            p000.l52.f6447 = r7     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "ra3f49bce40b36580"
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r7.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r8 = "Hook 顶栏 ViewPager 捕获成功 methods="
            r7.append(r8)     // Catch: java.lang.Throwable -> L7a
            r7.append(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Throwable -> L7a
            p000.C0888ux.m5975(r0, r3)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lcc
            r3 = r2
            goto L120
        L112:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lcc
            throw r0     // Catch: java.lang.Throwable -> Lcc
        L114:
            java.lang.String r3 = "ra3f49bce40b36580"
            java.lang.String r7 = r0.getMessage()
            java.lang.String r8 = "Hook 顶栏 ViewPager 捕获失败: "
            p000.AbstractC0602nx.m4145(r8, r7, r3, r0)
            goto Lc9
        L120:
            boolean r0 = p000.l52.m3514()
            if (r0 == 0) goto L211
            java.lang.ClassLoader r0 = r1.f13011
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L138
            java.lang.String r1 = p000.l52.f6430     // Catch: java.lang.Throwable -> L138
            java.lang.Class r0 = p000.qe0.m4876(r0, r1)     // Catch: java.lang.Throwable -> L138
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L138
            java.lang.Class r1 = p000.l52.f6448     // Catch: java.lang.Throwable -> L180
            if (r1 != r0) goto L13b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L138
            goto L218
        L138:
            r0 = move-exception
            goto L205
        L13b:
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L180
            r1.getClass()     // Catch: java.lang.Throwable -> L180
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L180
            r7.<init>()     // Catch: java.lang.Throwable -> L180
            int r8 = r1.length     // Catch: java.lang.Throwable -> L180
            r9 = r16
        L14a:
            if (r9 >= r8) goto L186
            r10 = r1[r9]     // Catch: java.lang.Throwable -> L180
            r10.getClass()     // Catch: java.lang.Throwable -> L180
            int r11 = r10.getModifiers()     // Catch: java.lang.Throwable -> L180
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)     // Catch: java.lang.Throwable -> L180
            if (r11 != 0) goto L183
            java.lang.Class r11 = r10.getReturnType()     // Catch: java.lang.Throwable -> L180
            java.lang.Class r12 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L180
            boolean r11 = p000.ln0.m3626(r11, r12)     // Catch: java.lang.Throwable -> L180
            if (r11 == 0) goto L183
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L180
            int r11 = r11.length     // Catch: java.lang.Throwable -> L180
            if (r11 != r2) goto L183
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L180
            r11 = r11[r16]     // Catch: java.lang.Throwable -> L180
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L180
            boolean r11 = p000.ln0.m3626(r11, r12)     // Catch: java.lang.Throwable -> L180
            if (r11 == 0) goto L183
            r7.add(r10)     // Catch: java.lang.Throwable -> L180
            goto L183
        L180:
            r0 = move-exception
            goto L203
        L183:
            int r9 = r9 + 1
            goto L14a
        L186:
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L180
            r1.<init>()     // Catch: java.lang.Throwable -> L180
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L180
            r8.<init>()     // Catch: java.lang.Throwable -> L180
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L180
        L194:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L180
            if (r9 == 0) goto L1b4
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L180
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L180
            l52 r11 = p000.l52.f6428     // Catch: java.lang.Throwable -> L180
            r10.getClass()     // Catch: java.lang.Throwable -> L180
            java.lang.String r10 = p000.l52.m3516(r10)     // Catch: java.lang.Throwable -> L180
            boolean r10 = r1.add(r10)     // Catch: java.lang.Throwable -> L180
            if (r10 == 0) goto L194
            r8.add(r9)     // Catch: java.lang.Throwable -> L180
            goto L194
        L1b4:
            boolean r1 = r8.isEmpty()     // Catch: java.lang.Throwable -> L180
            if (r1 == 0) goto L1c5
            java.lang.String r0 = "ra3f49bce40b36580"
            java.lang.String r1 = "未找到 3903 顶栏页面切换结构候选，已降级为不跳过隐藏页"
            p000.C0888ux.m5979(r0, r1, r4, r5, r4)     // Catch: java.lang.Throwable -> L180
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L138
        L1c2:
            r2 = r16
            goto L218
        L1c5:
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L180
        L1c9:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L180
            if (r4 == 0) goto L1e5
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L180
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L180
            r4.setAccessible(r2)     // Catch: java.lang.Throwable -> L180
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L180
            py1 r7 = new py1     // Catch: java.lang.Throwable -> L180
            r9 = 14
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L180
            r5.m6775(r4, r7)     // Catch: java.lang.Throwable -> L180
            goto L1c9
        L1e5:
            p000.l52.f6448 = r0     // Catch: java.lang.Throwable -> L180
            java.lang.String r0 = "ra3f49bce40b36580"
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L180
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L180
            r4.<init>()     // Catch: java.lang.Throwable -> L180
            java.lang.String r5 = "Hook 顶栏页面切换成功 methods="
            r4.append(r5)     // Catch: java.lang.Throwable -> L180
            r4.append(r1)     // Catch: java.lang.Throwable -> L180
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L180
            p000.C0888ux.m5975(r0, r1)     // Catch: java.lang.Throwable -> L180
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L138
            goto L218
        L203:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L138
            throw r0     // Catch: java.lang.Throwable -> L138
        L205:
            java.lang.String r1 = "ra3f49bce40b36580"
            java.lang.String r2 = r0.getMessage()
            java.lang.String r4 = "Hook 顶栏页面切换失败: "
            p000.AbstractC0602nx.m4145(r4, r2, r1, r0)
            goto L1c2
        L211:
            java.lang.String r0 = "ra3f49bce40b36580"
            java.lang.String r1 = "顶栏隐藏页跳过未启用，跳过滑动索引 Hook"
            p000.C0888ux.m5975(r0, r1)
        L218:
            if (r3 == 0) goto L225
            if (r2 == 0) goto L225
            java.lang.String r0 = "ra3f49bce40b36580"
            java.lang.String r1 = "Hook 3903 MainTabStripScrollView 成功"
            p000.C0888ux.m5975(r0, r1)
            goto L442
        L225:
            java.lang.String r0 = "ra3f49bce40b36580"
            java.lang.String r1 = "3903 顶栏 Hook 尚未完全就绪，等待 attach 阶段安全重试"
            p000.C0888ux.m5975(r0, r1)
            goto L442
        L22e:
            r16 = 0
            java.lang.String r0 = "r3e86435464f24cb5"
            java.lang.String r3 = "使用旧版顶栏 Tab 过滤分支"
            p000.C0888ux.m5975(r0, r3)
            m52 r3 = p000.m52.f6942
            java.lang.String r0 = "r14983b95b84acb5"
            java.lang.String r6 = "初始化顶栏 Tab 过滤"
            p000.C0888ux.m5975(r0, r6)
            java.lang.ClassLoader r0 = r1.f13011
            java.lang.Object r6 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L259
            java.lang.String r6 = p000.m52.f6945     // Catch: java.lang.Throwable -> L259
            java.lang.Class r6 = p000.qe0.m4876(r0, r6)     // Catch: java.lang.Throwable -> L259
            java.lang.String r7 = p000.m52.f6946     // Catch: java.lang.Throwable -> L259
            java.lang.Class r0 = p000.qe0.m4876(r0, r7)     // Catch: java.lang.Throwable -> L259
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L259
            java.lang.Class r7 = p000.m52.f6961     // Catch: java.lang.Throwable -> L29d
            if (r7 != r6) goto L25c
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L259
        L256:
            r6 = r2
            goto L337
        L259:
            r0 = move-exception
            goto L32b
        L25c:
            java.lang.reflect.Method[] r7 = r6.getDeclaredMethods()     // Catch: java.lang.Throwable -> L29d
            r7.getClass()     // Catch: java.lang.Throwable -> L29d
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29d
            r8.<init>()     // Catch: java.lang.Throwable -> L29d
            int r9 = r7.length     // Catch: java.lang.Throwable -> L29d
            r10 = r16
        L26b:
            if (r10 >= r9) goto L2a6
            r11 = r7[r10]     // Catch: java.lang.Throwable -> L29d
            int r12 = r11.getModifiers()     // Catch: java.lang.Throwable -> L29d
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)     // Catch: java.lang.Throwable -> L29d
            if (r12 != 0) goto L2a3
            java.lang.Class r12 = r11.getReturnType()     // Catch: java.lang.Throwable -> L29d
            java.lang.Class r13 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L29d
            boolean r12 = p000.ln0.m3626(r12, r13)     // Catch: java.lang.Throwable -> L29d
            if (r12 == 0) goto L2a3
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> L29d
            r12.getClass()     // Catch: java.lang.Throwable -> L29d
            int r13 = r12.length     // Catch: java.lang.Throwable -> L29d
            r14 = r16
        L28f:
            if (r14 >= r13) goto L2a3
            r15 = r12[r14]     // Catch: java.lang.Throwable -> L29d
            boolean r15 = r0.isAssignableFrom(r15)     // Catch: java.lang.Throwable -> L29d
            if (r15 == 0) goto L2a0
            r8.add(r11)     // Catch: java.lang.Throwable -> L29d
            goto L2a3
        L29d:
            r0 = move-exception
            goto L329
        L2a0:
            int r14 = r14 + 1
            goto L28f
        L2a3:
            int r10 = r10 + 1
            goto L26b
        L2a6:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L29d
            r0.<init>()     // Catch: java.lang.Throwable -> L29d
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29d
            r7.<init>()     // Catch: java.lang.Throwable -> L29d
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L29d
        L2b4:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L29d
            if (r9 == 0) goto L2d4
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L29d
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L29d
            m52 r11 = p000.m52.f6942     // Catch: java.lang.Throwable -> L29d
            r10.getClass()     // Catch: java.lang.Throwable -> L29d
            java.lang.String r10 = p000.m52.m3747(r10)     // Catch: java.lang.Throwable -> L29d
            boolean r10 = r0.add(r10)     // Catch: java.lang.Throwable -> L29d
            if (r10 == 0) goto L2b4
            r7.add(r9)     // Catch: java.lang.Throwable -> L29d
            goto L2b4
        L2d4:
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> L29d
            if (r0 == 0) goto L2e5
            java.lang.String r0 = "r14983b95b84acb5"
            java.lang.String r6 = "未找到顶栏 ViewPager 结构候选，已降级为不捕获页序"
            p000.C0888ux.m5979(r0, r6, r4, r5, r4)     // Catch: java.lang.Throwable -> L29d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L259
        L2e2:
            r6 = r16
            goto L337
        L2e5:
            java.util.Iterator r0 = r7.iterator()     // Catch: java.lang.Throwable -> L29d
        L2e9:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L29d
            if (r8 == 0) goto L305
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L29d
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L29d
            r8.setAccessible(r2)     // Catch: java.lang.Throwable -> L29d
            xq0 r9 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L29d
            py1 r10 = new py1     // Catch: java.lang.Throwable -> L29d
            r11 = 9
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L29d
            r9.m6775(r8, r10)     // Catch: java.lang.Throwable -> L29d
            goto L2e9
        L305:
            m52 r0 = p000.m52.f6942     // Catch: java.lang.Throwable -> L29d
            p000.m52.m3742(r6)     // Catch: java.lang.Throwable -> L29d
            p000.m52.f6961 = r6     // Catch: java.lang.Throwable -> L29d
            java.lang.String r0 = "r14983b95b84acb5"
            int r6 = r7.size()     // Catch: java.lang.Throwable -> L29d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29d
            r7.<init>()     // Catch: java.lang.Throwable -> L29d
            java.lang.String r8 = "Hook 顶栏 ViewPager 捕获成功 methods="
            r7.append(r8)     // Catch: java.lang.Throwable -> L29d
            r7.append(r6)     // Catch: java.lang.Throwable -> L29d
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L29d
            p000.C0888ux.m5975(r0, r6)     // Catch: java.lang.Throwable -> L29d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L259
            goto L256
        L329:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L259
            throw r0     // Catch: java.lang.Throwable -> L259
        L32b:
            java.lang.String r6 = "r14983b95b84acb5"
            java.lang.String r7 = r0.getMessage()
            java.lang.String r8 = "Hook 顶栏 ViewPager 捕获失败: "
            p000.AbstractC0602nx.m4145(r8, r7, r6, r0)
            goto L2e2
        L337:
            boolean r0 = p000.m52.m3745()
            if (r0 == 0) goto L428
            java.lang.ClassLoader r0 = r1.f13011
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L34f
            java.lang.String r1 = p000.m52.f6944     // Catch: java.lang.Throwable -> L34f
            java.lang.Class r0 = p000.qe0.m4876(r0, r1)     // Catch: java.lang.Throwable -> L34f
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L34f
            java.lang.Class r1 = p000.m52.f6962     // Catch: java.lang.Throwable -> L397
            if (r1 != r0) goto L352
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34f
            goto L42f
        L34f:
            r0 = move-exception
            goto L41c
        L352:
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L397
            r1.getClass()     // Catch: java.lang.Throwable -> L397
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L397
            r7.<init>()     // Catch: java.lang.Throwable -> L397
            int r8 = r1.length     // Catch: java.lang.Throwable -> L397
            r9 = r16
        L361:
            if (r9 >= r8) goto L39d
            r10 = r1[r9]     // Catch: java.lang.Throwable -> L397
            r10.getClass()     // Catch: java.lang.Throwable -> L397
            int r11 = r10.getModifiers()     // Catch: java.lang.Throwable -> L397
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)     // Catch: java.lang.Throwable -> L397
            if (r11 != 0) goto L39a
            java.lang.Class r11 = r10.getReturnType()     // Catch: java.lang.Throwable -> L397
            java.lang.Class r12 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L397
            boolean r11 = p000.ln0.m3626(r11, r12)     // Catch: java.lang.Throwable -> L397
            if (r11 == 0) goto L39a
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L397
            int r11 = r11.length     // Catch: java.lang.Throwable -> L397
            if (r11 != r2) goto L39a
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L397
            r11 = r11[r16]     // Catch: java.lang.Throwable -> L397
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L397
            boolean r11 = p000.ln0.m3626(r11, r12)     // Catch: java.lang.Throwable -> L397
            if (r11 == 0) goto L39a
            r7.add(r10)     // Catch: java.lang.Throwable -> L397
            goto L39a
        L397:
            r0 = move-exception
            goto L41a
        L39a:
            int r9 = r9 + 1
            goto L361
        L39d:
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L397
            r1.<init>()     // Catch: java.lang.Throwable -> L397
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L397
            r8.<init>()     // Catch: java.lang.Throwable -> L397
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L397
        L3ab:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Throwable -> L397
            if (r9 == 0) goto L3cb
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L397
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L397
            m52 r11 = p000.m52.f6942     // Catch: java.lang.Throwable -> L397
            r10.getClass()     // Catch: java.lang.Throwable -> L397
            java.lang.String r10 = p000.m52.m3747(r10)     // Catch: java.lang.Throwable -> L397
            boolean r10 = r1.add(r10)     // Catch: java.lang.Throwable -> L397
            if (r10 == 0) goto L3ab
            r8.add(r9)     // Catch: java.lang.Throwable -> L397
            goto L3ab
        L3cb:
            boolean r1 = r8.isEmpty()     // Catch: java.lang.Throwable -> L397
            if (r1 == 0) goto L3dc
            java.lang.String r0 = "r14983b95b84acb5"
            java.lang.String r1 = "未找到顶栏页面切换结构候选，已降级为不跳过隐藏页"
            p000.C0888ux.m5979(r0, r1, r4, r5, r4)     // Catch: java.lang.Throwable -> L397
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34f
        L3d9:
            r2 = r16
            goto L42f
        L3dc:
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Throwable -> L397
        L3e0:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L397
            if (r4 == 0) goto L3fc
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L397
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L397
            r4.setAccessible(r2)     // Catch: java.lang.Throwable -> L397
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L397
            py1 r7 = new py1     // Catch: java.lang.Throwable -> L397
            r9 = 11
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L397
            r5.m6775(r4, r7)     // Catch: java.lang.Throwable -> L397
            goto L3e0
        L3fc:
            p000.m52.f6962 = r0     // Catch: java.lang.Throwable -> L397
            java.lang.String r0 = "r14983b95b84acb5"
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L397
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L397
            r4.<init>()     // Catch: java.lang.Throwable -> L397
            java.lang.String r5 = "Hook 顶栏页面切换成功 methods="
            r4.append(r5)     // Catch: java.lang.Throwable -> L397
            r4.append(r1)     // Catch: java.lang.Throwable -> L397
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L397
            p000.C0888ux.m5975(r0, r1)     // Catch: java.lang.Throwable -> L397
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34f
            goto L42f
        L41a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34f
            throw r0     // Catch: java.lang.Throwable -> L34f
        L41c:
            java.lang.String r1 = "r14983b95b84acb5"
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "Hook 顶栏页面切换失败: "
            p000.AbstractC0602nx.m4145(r3, r2, r1, r0)
            goto L3d9
        L428:
            java.lang.String r0 = "r14983b95b84acb5"
            java.lang.String r1 = "顶栏隐藏页跳过未启用，跳过滑动索引 Hook"
            p000.C0888ux.m5975(r0, r1)
        L42f:
            if (r6 == 0) goto L43b
            if (r2 == 0) goto L43b
            java.lang.String r0 = "r14983b95b84acb5"
            java.lang.String r1 = "Hook MainTabStripScrollView 成功"
            p000.C0888ux.m5975(r0, r1)
            goto L442
        L43b:
            java.lang.String r0 = "r14983b95b84acb5"
            java.lang.String r1 = "顶栏 Hook 尚未完全就绪，等待 attach 阶段安全重试"
            p000.C0888ux.m5975(r0, r1)
        L442:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static java.util.List m6041(p000.rw1 r24, int r25, p000.rw1 r26, boolean r27, boolean r28, boolean r29) {
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r24.m5170(r25)
            int r4 = r1 + r3
            int r5 = r24.m5156(r25)
            int r6 = r0.m5156(r4)
            int r7 = r6 - r5
            r9 = 1
            if (r1 < 0) goto L2b
            int[] r10 = r0.f9539
            int r11 = r24.m5167(r25)
            int r11 = r11 * 5
            int r11 = r11 + r9
            r10 = r10[r11]
            r11 = 201326592(0xc000000, float:9.8607613E-32)
            r10 = r10 & r11
            if (r10 == 0) goto L2b
            r10 = r9
            goto L2c
        L2b:
            r10 = 0
        L2c:
            r2.m5172(r3)
            int r11 = r2.f9557
            r2.m5173(r7, r11)
            int r11 = r0.f9544
            if (r11 >= r4) goto L3b
            r0.m5131(r4)
        L3b:
            int r11 = r0.f9548
            if (r11 >= r6) goto L42
            r0.m5132(r6, r4)
        L42:
            int[] r6 = r2.f9539
            int r11 = r2.f9557
            int[] r12 = r0.f9539
            int r13 = r11 * 5
            int r14 = r1 * 5
            int r15 = r4 * 5
            p000.AbstractC0312g7.m2235(r13, r14, r15, r12, r6)
            java.lang.Object[] r12 = r2.f9540
            int r14 = r2.f9546
            java.lang.Object[] r15 = r0.f9540
            java.lang.System.arraycopy(r15, r5, r12, r14, r7)
            int r15 = r2.f9559
            int r16 = r13 + 2
            r6[r16] = r15
            int r16 = r11 - r1
            int r8 = r11 + r3
            int r18 = r2.m5157(r11, r6)
            int r18 = r14 - r18
            r19 = r9
            int r9 = r2.f9550
            r20 = r9
            int r9 = r2.f9549
            int r12 = r12.length
            r21 = r10
            r10 = r20
            r20 = r13
            r13 = r11
        L7a:
            if (r13 >= r8) goto Laf
            if (r13 == r11) goto L88
            int r22 = r13 * 5
            int r22 = r22 + 2
            r23 = r6[r22]
            int r23 = r23 + r16
            r6[r22] = r23
        L88:
            int r22 = r2.m5157(r13, r6)
            r23 = r6
            int r6 = r22 + r18
            if (r10 >= r13) goto L96
            r22 = r11
            r11 = 0
            goto L9a
        L96:
            r22 = r11
            int r11 = r2.f9548
        L9a:
            int r6 = p000.rw1.m5128(r6, r11, r9, r12)
            int r11 = r13 * 5
            int r11 = r11 + 4
            r23[r11] = r6
            if (r13 != r10) goto La8
            int r10 = r10 + 1
        La8:
            int r13 = r13 + 1
            r11 = r22
            r6 = r23
            goto L7a
        Laf:
            r23 = r6
            r2.f9550 = r10
            java.util.ArrayList r6 = r0.f9541
            int r9 = r0.m5165()
            int r6 = p000.qw1.m4945(r6, r1, r9)
            java.util.ArrayList r9 = r0.f9541
            int r10 = r0.m5165()
            int r4 = p000.qw1.m4945(r9, r4, r10)
            if (r6 >= r4) goto L100
            java.util.ArrayList r9 = r0.f9541
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r4 - r6
            r10.<init>(r11)
            r11 = r6
        Ld3:
            if (r11 >= r4) goto Le7
            java.lang.Object r12 = r9.get(r11)
            q80 r12 = (p000.q80) r12
            int r13 = r12.f8904
            int r13 = r13 + r16
            r12.f8904 = r13
            r10.add(r12)
            int r11 = r11 + 1
            goto Ld3
        Le7:
            java.util.ArrayList r11 = r2.f9541
            int r12 = r2.f9557
            int r13 = r2.m5165()
            int r11 = p000.qw1.m4945(r11, r12, r13)
            java.util.ArrayList r12 = r2.f9541
            r12.addAll(r11, r10)
            java.util.List r4 = r9.subList(r6, r4)
            r4.clear()
            goto L102
        L100:
            jz r10 = p000.C0450jz.f5672
        L102:
            boolean r4 = r10.isEmpty()
            if (r4 != 0) goto L126
            java.util.HashMap r4 = r0.f9542
            java.util.HashMap r6 = r2.f9542
            if (r4 == 0) goto L126
            if (r6 == 0) goto L126
            int r6 = r10.size()
            r9 = 0
        L115:
            if (r9 >= r6) goto L126
            java.lang.Object r11 = r10.get(r9)
            q80 r11 = (p000.q80) r11
            java.lang.Object r11 = r4.get(r11)
            x80 r11 = (p000.x80) r11
            int r9 = r9 + 1
            goto L115
        L126:
            int r4 = r2.f9559
            r2.m5144(r15)
            int[] r4 = r0.f9539
            int r4 = r0.m5134(r1, r4)
            if (r29 != 0) goto L136
            r17 = 0
            goto L173
        L136:
            if (r27 == 0) goto L168
            if (r4 < 0) goto L13d
            r17 = r19
            goto L13f
        L13d:
            r17 = 0
        L13f:
            if (r17 == 0) goto L14d
            r0.m5145()
            int r3 = r0.f9557
            int r4 = r4 - r3
            r0.m5151(r4)
            r0.m5145()
        L14d:
            int r3 = r0.f9557
            int r1 = r1 - r3
            r0.m5151(r1)
            boolean r1 = r0.m5137()
            if (r17 == 0) goto L165
            r0.m5142()
            r0.m5159()
            r0.m5142()
            r0.m5159()
        L165:
            r17 = r1
            goto L173
        L168:
            boolean r3 = r0.m5138(r1, r3)
            int r1 = r1 + (-1)
            r0.m5139(r5, r7, r1)
            r17 = r3
        L173:
            if (r17 == 0) goto L17a
            java.lang.String r0 = "Unexpectedly removed anchors"
            p000.AbstractC0804sn.m5526(r0)
        L17a:
            int r0 = r2.f9552
            int r13 = r20 + 1
            r1 = r23[r13]
            r3 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r1
            if (r3 == 0) goto L188
            r9 = r19
            goto L18d
        L188:
            r3 = 67108863(0x3ffffff, float:1.5046327E-36)
            r9 = r1 & r3
        L18d:
            int r0 = r0 + r9
            r2.f9552 = r0
            if (r28 == 0) goto L197
            r2.f9557 = r8
            int r14 = r14 + r7
            r2.f9546 = r14
        L197:
            if (r21 == 0) goto L19c
            r2.m5149(r15)
        L19c:
            return r10
    }

    /* JADX INFO: renamed from: μ */
    public static void m6042() {
            jz r0 = p000.C0450jz.f5672
            nz r1 = p000.C0604nz.f7825
            boolean r2 = p000.v71.f11124
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = -1
            java.lang.String r8 = ""
            r9 = -1
            if (r2 == 0) goto L2e
            l52 r2 = p000.l52.f6428
            p000.l52.f6436 = r9
            p000.l52.f6434 = r1
            p000.l52.f6435 = r1
            p000.l52.f6437 = r8
            p000.l52.f6438 = r0
            p000.l52.f6439 = r1
            p000.l52.f6440 = r7
            p000.l52.f6441 = r8
            p000.l52.f6442 = r6
            p000.l52.f6443 = r0
            p000.l52.f6444 = r5
            p000.l52.f6445 = r3
            p000.l52.f6446 = r3
            return
        L2e:
            m52 r2 = p000.m52.f6942
            p000.m52.f6950 = r9
            p000.m52.f6948 = r1
            p000.m52.f6949 = r1
            p000.m52.f6951 = r8
            p000.m52.f6952 = r0
            p000.m52.f6953 = r1
            p000.m52.f6954 = r7
            p000.m52.f6955 = r8
            p000.m52.f6956 = r6
            p000.m52.f6957 = r0
            p000.m52.f6958 = r5
            p000.m52.f6959 = r3
            p000.m52.f6960 = r3
            return
    }

    /* JADX INFO: renamed from: ν */
    public static void m6043() {
            boolean r0 = p000.v71.f11124
            if (r0 == 0) goto L39
            l52 r0 = p000.l52.f6428
            p000.l52.m3503()
            p000.l52.m3517()
            java.lang.Object r0 = p000.l52.f6443
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L17
            r1.add(r2)
            goto L17
        L2f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6d
            p000.l52.m3500(r1)
            return
        L39:
            m52 r0 = p000.m52.f6942
            p000.m52.m3734()
            p000.m52.m3748()
            java.lang.Object r0 = p000.m52.f6957
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L4c
            r1.add(r2)
            goto L4c
        L64:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6d
            p000.m52.m3731(r1)
        L6d:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static boolean m6044(android.content.SharedPreferences.Editor r5, java.lang.String r6, org.json.JSONObject r7) {
            java.lang.String r0 = "type"
            java.lang.String r0 = r7.optString(r0)
            r1 = 0
            if (r0 == 0) goto L9f
            int r2 = r0.hashCode()
            java.lang.String r3 = "value"
            r4 = 1
            switch(r2) {
                case -1572742348: goto L72;
                case -891985903: goto L5f;
                case 104431: goto L4e;
                case 3327612: goto L3b;
                case 64711720: goto L2a;
                case 97526364: goto L15;
                default: goto L13;
            }
        L13:
            goto L9f
        L15:
            java.lang.String r2 = "float"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1f
            goto L9f
        L1f:
            r0 = 0
            double r0 = r7.optDouble(r3, r0)
            float r7 = (float) r0
            r5.putFloat(r6, r7)
            return r4
        L2a:
            java.lang.String r2 = "boolean"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L33
            goto L9f
        L33:
            boolean r7 = r7.optBoolean(r3, r1)
            r5.putBoolean(r6, r7)
            return r4
        L3b:
            java.lang.String r2 = "long"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L44
            goto L9f
        L44:
            r0 = 0
            long r0 = r7.optLong(r3, r0)
            r5.putLong(r6, r0)
            return r4
        L4e:
            java.lang.String r2 = "int"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L57
            goto L9f
        L57:
            int r7 = r7.optInt(r3, r1)
            r5.putInt(r6, r7)
            return r4
        L5f:
            java.lang.String r2 = "string"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L68
            goto L9f
        L68:
            java.lang.String r0 = ""
            java.lang.String r7 = r7.optString(r3, r0)
            r5.putString(r6, r7)
            return r4
        L72:
            java.lang.String r2 = "string_set"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L7b
            goto L9f
        L7b:
            org.json.JSONArray r7 = r7.optJSONArray(r3)
            if (r7 != 0) goto L86
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
        L86:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r2 = r7.length()
        L8f:
            if (r1 >= r2) goto L9b
            java.lang.String r3 = r7.optString(r1)
            r0.add(r3)
            int r1 = r1 + 1
            goto L8f
        L9b:
            r5.putStringSet(r6, r0)
            return r4
        L9f:
            return r1
    }

    /* JADX INFO: renamed from: π */
    public static final androidx.compose.p001ui.viewinterop.AndroidViewHolder m6045(androidx.compose.p001ui.platform.AndroidViewsHandler r3, int r4) {
            java.util.HashMap r3 = r3.getLayoutNodeToHolder()
            java.util.Set r3 = r3.entrySet()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            r2 = r0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            yp0 r2 = (p000.yp0) r2
            int r2 = r2.f12744
            if (r2 != r4) goto Le
            goto L28
        L27:
            r0 = r1
        L28:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L33
            java.lang.Object r3 = r0.getValue()
            androidx.compose.ui.viewinterop.AndroidViewHolder r3 = (androidx.compose.p001ui.viewinterop.AndroidViewHolder) r3
            return r3
        L33:
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public static void m6046(android.app.Activity r5, int r6, java.lang.String r7, java.util.List r8, p000.a80 r9) {
            r5.getClass()
            r8.getClass()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L14:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r8.next()
            r3 = r2
            s71 r3 = (p000.s71) r3
            java.lang.String r3 = r3.f9753
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto L14
            r1.add(r2)
            goto L14
        L2d:
            zt0 r8 = p000.AbstractC1021yh.m6893()
            java.lang.String r0 = "留空"
            r8.add(r0)
            java.util.Iterator r0 = r1.iterator()
        L3a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r0.next()
            s71 r2 = (p000.s71) r2
            boolean r3 = r2.f9758
            java.lang.String r2 = r2.f9754
            if (r3 == 0) goto L52
            java.lang.String r3 = " · 内测"
            java.lang.String r2 = r2.concat(r3)
        L52:
            r8.add(r2)
            goto L3a
        L56:
            zt0 r8 = p000.AbstractC1021yh.m6883(r8)
            java.util.Iterator r0 = r1.iterator()
            r2 = 0
            r3 = r2
        L60:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L78
            java.lang.Object r4 = r0.next()
            s71 r4 = (p000.s71) r4
            java.lang.String r4 = r4.f9753
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L75
            goto L79
        L75:
            int r3 = r3 + 1
            goto L60
        L78:
            r3 = -1
        L79:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r0 = 0
            if (r3 < 0) goto L81
            goto L82
        L81:
            r7 = r0
        L82:
            if (r7 == 0) goto L8b
            int r7 = r7.intValue()
            int r7 = r7 + 1
            goto L8c
        L8b:
            r7 = r2
        L8c:
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r4 = "设置第 "
            r5.<init>(r4)
            r5.append(r6)
            java.lang.String r6 = " 个快捷按钮"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.app.AlertDialog$Builder r5 = r3.setTitle(r5)
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.Object[] r6 = r8.toArray(r6)
            java.lang.CharSequence[] r6 = (java.lang.CharSequence[]) r6
            bc0 r8 = new bc0
            r2 = 4
            r8.<init>(r9, r2, r1)
            android.app.AlertDialog$Builder r5 = r5.setSingleChoiceItems(r6, r7, r8)
            java.lang.String r6 = "取消"
            android.app.AlertDialog$Builder r5 = r5.setNegativeButton(r6, r0)
            r5.show()
            return
    }

    /* JADX INFO: renamed from: σ */
    public static final java.lang.String m6047(int r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "android.widget.Button"
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            java.lang.String r1 = "android.widget.CheckBox"
            return r1
        Lb:
            r0 = 3
            if (r1 != r0) goto L11
            java.lang.String r1 = "android.widget.RadioButton"
            return r1
        L11:
            r0 = 5
            if (r1 != r0) goto L17
            java.lang.String r1 = "android.widget.ImageView"
            return r1
        L17:
            r0 = 6
            if (r1 != r0) goto L1d
            java.lang.String r1 = "android.widget.Spinner"
            return r1
        L1d:
            r0 = 7
            if (r1 != r0) goto L23
            java.lang.String r1 = "android.widget.NumberPicker"
            return r1
        L23:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: τ */
    public static final double m6048(long r4) {
            r0 = 11
            long r0 = r4 >>> r0
            double r0 = (double) r0
            r2 = 2048(0x800, float:2.87E-42)
            double r2 = (double) r2
            double r0 = r0 * r2
            r2 = 2047(0x7ff, double:1.0114E-320)
            long r4 = r4 & r2
            double r4 = (double) r4
            double r0 = r0 + r4
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static final java.lang.String m6049(long r8) {
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 16
            if (r0 < 0) goto L13
            p000.jx0.m3045(r1)
            java.lang.String r8 = java.lang.Long.toString(r8, r1)
            r8.getClass()
            return r8
        L13:
            r0 = 1
            long r2 = r8 >>> r0
            long r4 = (long) r1
            long r2 = r2 / r4
            long r2 = r2 << r0
            long r6 = r2 * r4
            long r8 = r8 - r6
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L24
            long r8 = r8 - r4
            r4 = 1
            long r2 = r2 + r4
        L24:
            p000.jx0.m3045(r1)
            java.lang.String r0 = java.lang.Long.toString(r2, r1)
            r0.getClass()
            p000.jx0.m3045(r1)
            java.lang.String r8 = java.lang.Long.toString(r8, r1)
            r8.getClass()
            java.lang.String r8 = r0.concat(r8)
            return r8
    }

    /* JADX INFO: renamed from: β */
    public abstract void m6050();

    /* JADX INFO: renamed from: ο */
    public abstract void m6051(p000.C1080 r1);

    /* JADX INFO: renamed from: φ */
    public abstract void m6052();
}
