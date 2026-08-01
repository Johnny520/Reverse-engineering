package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class xa1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f12093 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicReference f12094 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicReference f12095 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.xa1.f12093 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.lang.String r1 = ""
            r0.<init>(r1)
            p000.xa1.f12094 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            p000.xa1.f12095 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m6545(int r0, int r1) {
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

    /* JADX INFO: renamed from: β */
    public static java.lang.String m6546() {
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

    /* JADX INFO: renamed from: γ */
    public static p000.va1 m6547(java.lang.ClassLoader r35, java.lang.String r36) {
            r0 = r35
            r1 = r36
            java.util.List r2 = m6554()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L1e
            va1 r4 = new va1
            r11 = 0
            r12 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r13 = "自动投喂跳过 reason=no_conversation"
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r4
        L1e:
            java.lang.String r3 = "pet_elf_auto_feed_default_food_id"
            java.lang.String r4 = "204"
            java.lang.String r3 = p000.ui1.m5893(r3, r4)
            java.lang.String r5 = "pet_elf_auto_feed_max_price"
            r6 = 0
            android.content.SharedPreferences r7 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L32
            int r5 = r7.getInt(r5, r6)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r5 = r6
        L33:
            r7 = 100
            int r5 = p000.j81.m2906(r5, r6, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r8 = r2.size()
            java.lang.String r9 = " defaultFoodId="
            java.lang.String r10 = " maxPrice="
            java.lang.String r11 = "开始自动投喂 会话="
            java.lang.StringBuilder r8 = p000.a12.m20(r8, r11, r9, r3, r10)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "r87045d6703eaa6c4"
            r10 = 0
            r11 = 4
            p000.C0888ux.m5992(r9, r8, r10, r11, r10)
            java.util.Iterator r8 = r2.iterator()
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
            r23 = r15
            r24 = r23
            r25 = r24
        L68:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L90
            int r17 = r12 + 1
            java.lang.Object r19 = r8.next()
            r20 = 1
            r10 = r19
            ky1 r10 = (p000.ky1) r10
            java.lang.Thread r19 = java.lang.Thread.currentThread()
            boolean r19 = r19.isInterrupted()
            if (r19 != 0) goto L90
            boolean r19 = m6549()
            if (r19 != 0) goto La2
            java.lang.String r3 = "自动投喂停止 reason=setting_disabled"
            r4 = 0
            p000.C0888ux.m5992(r9, r3, r4, r11, r4)
        L90:
            r19 = r2
        L92:
            r31 = r6
            r32 = r13
            r33 = r14
            r22 = r15
            r6 = r23
            r29 = r25
            r25 = r24
            goto L43b
        La2:
            r19 = r2
            java.lang.String r2 = m6546()
            boolean r2 = p000.ln0.m3626(r2, r1)
            if (r2 != 0) goto Lb5
            java.lang.String r2 = "自动投喂停止 reason=account_changed"
            r4 = 0
            p000.C0888ux.m5992(r9, r2, r4, r11, r4)
            goto L92
        Lb5:
            ry1 r2 = p000.ry1.f9602
            java.lang.String r2 = p000.ry1.m5197(r10)
            r22 = r12
            long r11 = r10.f6323
            r26 = r3
            r3 = 40
            java.lang.String r2 = m6553(r2, r3)
            my1 r3 = p000.ry1.m5202(r10)
            r27 = r4
            ly1 r4 = p000.ry1.m5200(r10)
            if (r4 == 0) goto Ld8
            my1 r4 = r4.f6844
        Ld5:
            r28 = r8
            goto Lda
        Ld8:
            r4 = 0
            goto Ld5
        Lda:
            java.lang.Boolean r8 = r3.f7329
            if (r8 == 0) goto Le3
        Lde:
            boolean r8 = r8.booleanValue()
            goto Lee
        Le3:
            if (r4 == 0) goto Le8
            java.lang.Boolean r8 = r4.f7329
            goto Le9
        Le8:
            r8 = 0
        Le9:
            if (r8 == 0) goto Lec
            goto Lde
        Lec:
            r8 = r20
        Lee:
            java.lang.String r3 = r3.f7330
            boolean r29 = p000.q02.m4671(r3)
            java.lang.String r30 = ""
            if (r29 == 0) goto L114
            if (r4 == 0) goto Lfd
            java.lang.String r3 = r4.f7330
            goto Lfe
        Lfd:
            r3 = 0
        Lfe:
            if (r3 != 0) goto L102
            r3 = r30
        L102:
            boolean r4 = p000.q02.m4671(r3)
            if (r4 == 0) goto L114
            java.lang.String r3 = p000.ry1.m5228(r26)
            boolean r4 = p000.q02.m4671(r3)
            if (r4 == 0) goto L114
            r3 = r27
        L114:
            if (r8 != 0) goto L13a
            int r15 = r15 + 1
            int r13 = r13 + 1
            java.lang.String r3 = "person_disabled"
            java.lang.String r4 = "人员设置为关闭"
            m6551(r2, r3, r4)
            int r2 = r19.size()
            int r2 = r2 + (-1)
            r4 = r22
            m6545(r4, r2)
            r12 = r17
            r2 = r19
        L130:
            r3 = r26
            r4 = r27
            r8 = r28
        L136:
            r10 = 0
            r11 = 4
            goto L68
        L13a:
            r4 = r22
            java.lang.Object r8 = p000.p91.m4424(r0, r11)
            r22 = r15
            boolean r15 = r8 instanceof p000.eo1
            if (r15 == 0) goto L174
            r15 = r25
            int r25 = r15 + 1
            java.lang.Throwable r3 = p000.fo1.m2190(r8)
            if (r3 == 0) goto L155
            java.lang.String r8 = r3.getMessage()
            goto L156
        L155:
            r8 = 0
        L156:
            java.lang.String r10 = "catalog_request_failed"
            m6550(r2, r10, r8)
            java.lang.String r8 = "自动投喂目录读取失败 name="
            java.lang.String r2 = r8.concat(r2)
            p000.C0888ux.m5977(r9, r2, r3)
            int r2 = r19.size()
            int r2 = r2 + (-1)
            m6545(r4, r2)
            r12 = r17
            r2 = r19
            r15 = r22
            goto L130
        L174:
            r15 = r25
            p000.i81.m2649(r8)
            xe1 r8 = (p000.xe1) r8
            boolean r25 = r8.m6629()
            r29 = r15
            java.lang.String r15 = " "
            r31 = r6
            java.lang.String r6 = "pet_not_exist"
            r32 = r13
            java.lang.String r13 = "code="
            if (r25 != 0) goto L1da
            int r3 = r8.f12147
            r10 = 994008(0xf2ad8, float:1.392902E-39)
            if (r3 != r10) goto L1a0
            int r15 = r22 + 1
            int r24 = r24 + 1
            java.lang.String r3 = "当前会话没有可喂养小火人"
            m6551(r2, r6, r3)
            r25 = r29
            goto L1c1
        L1a0:
            int r25 = r29 + 1
            java.lang.String r6 = r8.f12148
            if (r6 != 0) goto L1a8
            r6 = r30
        L1a8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r13)
            r8.append(r3)
            r8.append(r15)
            r8.append(r6)
            java.lang.String r3 = r8.toString()
            java.lang.String r6 = "catalog_business_error"
            m6550(r2, r6, r3)
            r15 = r22
        L1c1:
            int r2 = r19.size()
            int r2 = r2 + (-1)
            m6545(r4, r2)
            r12 = r17
            r2 = r19
            r3 = r26
            r4 = r27
            r8 = r28
            r6 = r31
            r13 = r32
            goto L136
        L1da:
            r33 = r14
            r14 = r24
            int r22 = r22 + 1
            java.util.List r8 = r8.f12150
            ta1 r3 = p000.g81.m2273(r5, r3, r8)
            ua1 r8 = r3.f10265
            r24 = r5
            ze1 r5 = r3.f10264
            r25 = r14
            if (r5 == 0) goto L3b8
            if (r8 != 0) goto L3b8
            if (r5 == 0) goto L3b0
            java.lang.String r3 = r5.f13064
            r8 = 10
            java.lang.Integer r8 = p000.x02.m6487(r3, r8)
            r34 = -1
            java.lang.Integer r14 = r5.f13066
            if (r8 == 0) goto L380
            if (r14 != 0) goto L206
            goto L380
        L206:
            int r3 = r8.intValue()
            int r1 = r14.intValue()
            java.lang.Object r1 = p000.p91.m4423(r0, r11, r3, r1)
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto L259
            int r3 = r29 + 1
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L223
            java.lang.String r5 = r1.getMessage()
            goto L224
        L223:
            r5 = 0
        L224:
            java.lang.String r6 = "feed_request_failed"
            m6550(r2, r6, r5)
            java.lang.String r5 = "自动投喂请求失败 name="
            java.lang.String r2 = r5.concat(r2)
            p000.C0888ux.m5977(r9, r2, r1)
            int r1 = r19.size()
            int r1 = r1 + (-1)
            m6545(r4, r1)
            r1 = r36
            r12 = r17
            r2 = r19
            r15 = r22
            r5 = r24
            r24 = r25
            r4 = r27
            r8 = r28
            r6 = r31
            r13 = r32
            r14 = r33
            r10 = 0
            r11 = 4
            r25 = r3
            r3 = r26
            goto L68
        L259:
            p000.i81.m2649(r1)
            we1 r1 = (p000.we1) r1
            boolean r3 = r1.m6376()
            if (r3 == 0) goto L2ca
            int r3 = r33 + 1
            r7.add(r10)
            java.lang.String r6 = r5.f13065
            r10 = 48
            java.lang.String r6 = m6553(r6, r10)
            java.lang.Long r10 = r1.f11698
            if (r10 != 0) goto L27d
            java.lang.Integer r10 = r5.f13068
            if (r10 != 0) goto L27d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r34)
        L27d:
            java.lang.Long r1 = r1.f11697
            if (r1 == 0) goto L286
            long r11 = r1.longValue()
            goto L288
        L286:
            r11 = -1
        L288:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "自动投喂成功 name="
            r1.<init>(r5)
            r1.append(r2)
            java.lang.String r2 = " foodId="
            r1.append(r2)
            r1.append(r8)
            java.lang.String r2 = " foodName="
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " price="
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " closeness="
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " balanceSpark="
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r2 = 4
            r5 = 0
            p000.C0888ux.m5992(r9, r1, r5, r2, r5)
            r14 = r3
            r1 = r25
            r25 = r29
            goto L35d
        L2ca:
            int r3 = r1.f11693
            r5 = 300001(0x493e1, float:4.20391E-40)
            if (r3 != r5) goto L2ea
            int r1 = r25 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r13)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "already_feeding"
            m6551(r2, r5, r3)
        L2e4:
            r25 = r29
        L2e6:
            r14 = r33
            goto L35d
        L2ea:
            r5 = 300002(0x493e2, float:4.20392E-40)
            if (r3 != r5) goto L303
            int r1 = r25 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r13)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "food_not_in_activity"
            m6551(r2, r5, r3)
            goto L2e4
        L303:
            r10 = 994008(0xf2ad8, float:1.392902E-39)
            if (r3 != r10) goto L31a
            int r1 = r25 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r13)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            m6551(r2, r6, r3)
            goto L2e4
        L31a:
            r5 = 300003(0x493e3, float:4.20394E-40)
            if (r3 != r5) goto L338
            int r1 = r29 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r13)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "price_changed_no_retry"
            m6550(r2, r5, r3)
            r14 = r25
            r25 = r1
            r1 = r14
            goto L2e6
        L338:
            int r5 = r29 + 1
            java.lang.String r1 = r1.f11694
            if (r1 != 0) goto L340
            r1 = r30
        L340:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r13)
            r6.append(r3)
            r6.append(r15)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r3 = "feed_business_error"
            m6550(r2, r3, r1)
            r1 = r25
            r14 = r33
            r25 = r5
        L35d:
            int r2 = r19.size()
            int r2 = r2 + (-1)
            m6545(r4, r2)
            r12 = r17
            r2 = r19
            r15 = r22
            r5 = r24
            r3 = r26
            r4 = r27
            r8 = r28
            r6 = r31
            r13 = r32
            r10 = 0
            r11 = 4
            r24 = r1
            r1 = r36
            goto L68
        L380:
            int r6 = r31 + 1
            java.lang.String r1 = "foodId="
            java.lang.String r1 = r1.concat(r3)
            java.lang.String r3 = "invalid_catalog_item"
            m6551(r2, r3, r1)
            int r1 = r19.size()
            int r1 = r1 + (-1)
            m6545(r4, r1)
        L396:
            r1 = r36
            r12 = r17
            r2 = r19
            r15 = r22
            r5 = r24
            r24 = r25
            r3 = r26
            r4 = r27
            r8 = r28
            r25 = r29
            r13 = r32
            r14 = r33
            goto L136
        L3b0:
            java.lang.String r0 = "Required value was null."
            p000.C1080.m7279(r0)
        L3b5:
            r18 = 0
            return r18
        L3b8:
            r34 = -1
            if (r8 != 0) goto L3c1
            r1 = r34
        L3be:
            r5 = r20
            goto L3ca
        L3c1:
            int[] r1 = p000.wa1.f11644
            int r5 = r8.ordinal()
            r1 = r1[r5]
            goto L3be
        L3ca:
            if (r1 != r5) goto L3d3
            r6 = r23
            int r23 = r6 + 1
            r6 = r31
            goto L3d8
        L3d3:
            r6 = r23
            int r1 = r31 + 1
            r6 = r1
        L3d8:
            if (r8 == 0) goto L3dd
            java.lang.String r1 = r8.f10670
            goto L3df
        L3dd:
            java.lang.String r1 = "policy_rejected"
        L3df:
            if (r8 != 0) goto L3e5
            r5 = r34
            r8 = r5
            goto L3ef
        L3e5:
            int[] r5 = p000.wa1.f11644
            int r8 = r8.ordinal()
            r5 = r5[r8]
            r8 = r34
        L3ef:
            if (r5 == r8) goto L413
            r8 = 1
            if (r5 == r8) goto L410
            r8 = 2
            if (r5 == r8) goto L40d
            r8 = 3
            if (r5 == r8) goto L40a
            r8 = 4
            if (r5 == r8) goto L407
            r8 = 5
            if (r5 != r8) goto L403
            java.lang.String r5 = "服务端没有下发有效亲密度"
            goto L415
        L403:
            p000.C1080.m7272()
            goto L3b5
        L407:
            java.lang.String r5 = "服务端没有下发实时价格"
            goto L415
        L40a:
            java.lang.String r5 = "当前会话目录没有所选食物"
            goto L415
        L40d:
            java.lang.String r5 = "食物配置无效"
            goto L415
        L410:
            java.lang.String r5 = "实时价格超过用户设置上限"
            goto L415
        L413:
            java.lang.String r5 = "安全策略拒绝投喂"
        L415:
            java.lang.String r3 = r3.f10266
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = "；"
            r8.append(r5)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            m6551(r2, r1, r3)
            int r1 = r19.size()
            r20 = 1
            int r1 = r1 + (-1)
            m6545(r4, r1)
            goto L396
        L43b:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L522
            java.lang.String r1 = m6546()
            r2 = r36
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L522
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.se1.f9875
            boolean r1 = p000.se1.m5488()
            if (r1 == 0) goto L522
            r3 = 2000(0x7d0, double:9.88E-321)
            java.lang.Thread.sleep(r3)     // Catch: java.lang.InterruptedException -> L45b
            goto L462
        L45b:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L462:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.se1.f9875
            java.lang.String r3 = "投喂后"
            java.lang.String r4 = "投喂后等待2秒完成，开始定向领取亲密度 会话="
            boolean r5 = p000.se1.m5488()
            if (r5 == 0) goto L522
            java.lang.String r5 = p000.se1.m5486()
            boolean r5 = p000.ln0.m3626(r5, r2)
            if (r5 != 0) goto L47a
            goto L522
        L47a:
            f7 r5 = new f7
            r8 = 1
            r5.<init>(r8, r7)
            f71 r7 = new f71
            r10 = 27
            r7.<init>(r10)
            y30 r10 = new y30
            r10.<init>(r5, r8, r7)
            re1 r5 = p000.re1.f9356
            bu r7 = new bu
            java.util.Iterator r8 = r10.iterator()
            r7.<init>(r8, r5)
            boolean r5 = r7.hasNext()
            if (r5 != 0) goto L4a0
            jz r5 = p000.C0450jz.f5672
            goto L4c1
        L4a0:
            java.lang.Object r5 = r7.next()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L4af
            java.util.List r5 = p000.AbstractC1021yh.m6896(r5)
            goto L4c1
        L4af:
            java.util.ArrayList r5 = p000.lz1.m3696(r5)
        L4b3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L4c1
            java.lang.Object r8 = r7.next()
            r5.add(r8)
            goto L4b3
        L4c1:
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L4c8
            goto L522
        L4c8:
            kt0 r7 = new kt0
            r8 = 14
            r7.<init>(r8)
            r8 = 45
            boolean r7 = p000.se1.m5492(r8, r7)
            java.lang.String r8 = "rb4e434d444870f0e"
            if (r7 != 0) goto L4e1
            java.lang.String r0 = "投喂后亲密度领取跳过 reason=execution_busy_timeout"
            r2 = 4
            r4 = 0
            p000.C0888ux.m5992(r8, r0, r4, r2, r4)
            goto L522
        L4e1:
            r7 = 0
            r10 = 1
            boolean r11 = r1.compareAndSet(r7, r10)
            if (r11 != 0) goto L4ea
            goto L522
        L4ea:
            int r7 = r5.size()     // Catch: java.lang.Throwable -> L51c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51c
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L51c
            r10.append(r7)     // Catch: java.lang.Throwable -> L51c
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L51c
            r7 = 4
            r10 = 0
            p000.C0888ux.m5992(r8, r4, r10, r7, r10)     // Catch: java.lang.Throwable -> L51c
            r10 = 1
            qe1 r0 = p000.se1.m5487(r0, r10, r2, r5)     // Catch: java.lang.Throwable -> L51c
            java.lang.String r0 = r0.f8989     // Catch: java.lang.Throwable -> L51c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L51c
            r2.append(r0)     // Catch: java.lang.Throwable -> L51c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L51c
            r2 = 4
            r4 = 0
            p000.C0888ux.m5992(r8, r0, r4, r2, r4)     // Catch: java.lang.Throwable -> L51c
            r7 = 0
            r1.set(r7)
            goto L522
        L51c:
            r0 = move-exception
            r7 = 0
            r1.set(r7)
            throw r0
        L522:
            int r0 = r19.size()
            java.lang.String r1 = ", 成功 "
            java.lang.String r2 = ", 人员关闭 "
            java.lang.String r3 = "自动投喂完成: 会话 "
            r14 = r33
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r3, r0, r1, r14, r2)
            java.lang.String r1 = ", 目录不可用 "
            java.lang.String r2 = ", 价格拦截 "
            r3 = r31
            r13 = r32
            p000.AbstractC0602nx.m4117(r0, r13, r1, r3, r2)
            java.lang.String r1 = ", 跳过 "
            java.lang.String r2 = ", 失败 "
            r4 = r25
            p000.AbstractC0602nx.m4117(r0, r6, r1, r4, r2)
            r15 = r29
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r2 = 4
            r5 = 0
            p000.C0888ux.m5992(r9, r0, r5, r2, r5)
            va1 r13 = new va1
            int r1 = r19.size()
            r18 = r3
            r20 = r4
            r19 = r6
            r16 = r14
            r21 = r15
            r15 = r22
            r17 = r32
            r22 = r0
            r14 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r13
    }

    /* JADX INFO: renamed from: δ */
    public static void m6548() {
            java.util.concurrent.atomic.AtomicReference r0 = p000.xa1.f12094
            java.lang.String r1 = ""
            r0.set(r1)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m6549() {
            boolean r0 = p000.AbstractC0976x9.m6529()
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto Le
            goto L15
        Le:
            java.lang.String r0 = "pet_elf_auto_feed_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
            return r0
        L15:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static void m6550(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            if (r5 != 0) goto L4
            java.lang.String r5 = ""
        L4:
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r5 = m6553(r5, r0)
            java.lang.String r0 = " reason="
            java.lang.String r1 = " detail="
            java.lang.String r2 = "自动投喂失败 name="
            java.lang.StringBuilder r3 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4 = 4
            java.lang.String r5 = "r87045d6703eaa6c4"
            r0 = 0
            p000.C0888ux.m5992(r5, r3, r0, r4, r0)
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m6551(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r5 = m6553(r5, r0)
            java.lang.String r0 = " reason="
            java.lang.String r1 = " detail="
            java.lang.String r2 = "自动投喂跳过 name="
            java.lang.StringBuilder r3 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r5 = 4
            java.lang.String r0 = "r87045d6703eaa6c4"
            p000.C0888ux.m5992(r0, r3, r4, r5, r4)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m6552(android.app.Activity r3) {
            r3.getClass()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            java.util.concurrent.atomic.AtomicReference r3 = p000.xa1.f12095
            r3.set(r0)
            boolean r3 = m6549()
            if (r3 != 0) goto L14
            goto L35
        L14:
            java.lang.String r3 = m6546()
            int r0 = r3.length()
            if (r0 <= 0) goto L2b
            java.util.concurrent.atomic.AtomicReference r0 = p000.xa1.f12094
            java.lang.Object r0 = r0.get()
            boolean r3 = p000.ln0.m3626(r0, r3)
            if (r3 == 0) goto L2b
            goto L35
        L2b:
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.xa1.f12093
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 != 0) goto L36
        L35:
            return
        L36:
            java.lang.Thread r3 = new java.lang.Thread
            fb0 r0 = new fb0
            r2 = 12
            r0.<init>(r2)
            java.lang.String r2 = "r26540c2252536895"
            r3.<init>(r0, r2)
            r3.setDaemon(r1)
            r3.start()
            return
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.String m6553(java.lang.String r2, int r3) {
            r0 = 13
            r1 = 32
            java.lang.String r2 = p000.x02.m6482(r2, r0, r1)
            r0 = 10
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = p000.q02.m4693(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static java.util.List m6554() {
            java.util.concurrent.ConcurrentHashMap r0 = p000.ry1.f9620
            java.util.Map r0 = p000.ex0.m1975(r0)
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            f7 r0 = p000.AbstractC0984xh.m6661(r0)
            f71 r1 = new f71
            r2 = 7
            r1.<init>(r2)
            y30 r2 = new y30
            r3 = 1
            r2.<init>(r0, r3, r1)
            uh0 r0 = new uh0
            r1 = 26
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
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static boolean m6555(int r6, p000.p70 r7) {
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = (long) r6
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            long r2 = r2 + r0
        L9:
            long r0 = java.lang.System.currentTimeMillis()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L39
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
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L31
            goto L9
        L31:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
            goto L9
        L39:
            java.lang.Object r6 = r7.invoke()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
    }
}
