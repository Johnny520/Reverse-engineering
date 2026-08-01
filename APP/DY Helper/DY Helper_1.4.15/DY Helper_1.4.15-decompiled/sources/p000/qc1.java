package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class qc1 {

    /* JADX INFO: renamed from: α */
    public static final p000.qc1 f8961 = null;

    static {
            qc1 r0 = new qc1
            r0.<init>()
            p000.qc1.f8961 = r0
            od r0 = p000.EnumC0619od.f8035
            od r1 = p000.EnumC0619od.f8036
            od r2 = p000.EnumC0619od.f8034
            od[] r0 = new p000.EnumC0619od[]{r2, r0, r1}
            p000.AbstractC1021yh.m6897(r0)
            return
    }

    /* JADX INFO: renamed from: α */
    public static int m4852(p000.zd1 r3, p000.id1 r4) {
            r4.getClass()
            java.lang.Integer r4 = r4.f5019
            if (r4 != 0) goto L8
            goto L31
        L8:
            int r0 = r4.intValue()
            if (r0 != 0) goto L17
            java.util.ArrayList r3 = r3.m7123()
            int r3 = r3.size()
            return r3
        L17:
            java.lang.Long r3 = m4853(r3)
            if (r3 == 0) goto L31
            long r0 = r3.longValue()
            int r3 = r4.intValue()
            long r3 = (long) r3
            long r0 = r0 / r3
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L2f
            r0 = r3
        L2f:
            int r3 = (int) r0
            return r3
        L31:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.Long m4853(p000.zd1 r2) {
            r2.getClass()
            java.lang.String r2 = r2.f13053
            if (r2 == 0) goto L20
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L20
            java.lang.String r0 = ","
            java.lang.String r1 = ""
            java.lang.String r2 = p000.x02.m6483(r2, r0, r1)
            r0 = 10
            java.lang.Long r2 = p000.x02.m6489(r2, r0)
            return r2
        L20:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static p000.oc1 m4854(java.util.List r1, p000.zd1 r2, java.lang.Integer r3, java.lang.String r4, java.util.Set r5, long r6) {
            if (r3 == 0) goto La
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto La
            r5 = 1
            goto Lb
        La:
            r5 = 0
        Lb:
            r0 = 0
            if (r5 == 0) goto Lf
            goto L33
        Lf:
            java.lang.Integer r2 = r2.f13048
            if (r3 == 0) goto L33
            int r3 = r3.intValue()
            java.util.List r1 = m4859(r1, r2, r6)
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            r6 = r2
            id1 r6 = (p000.id1) r6
            int r6 = r6.f5015
            if (r6 != r3) goto L1f
            r0 = r2
        L31:
            id1 r0 = (p000.id1) r0
        L33:
            oc1 r1 = new oc1
            if (r0 == 0) goto L44
            java.lang.String r2 = r0.f5016
            if (r2 != 0) goto L4b
            int r2 = r0.f5015
            java.lang.String r3 = "种子 "
            java.lang.String r2 = p000.a12.m17(r3, r2)
            goto L4b
        L44:
            if (r5 == 0) goto L49
            java.lang.String r2 = "当前会话已确认该种子不在活动时间"
            goto L4b
        L49:
            java.lang.String r2 = "固定种子未选择、未解锁、已下架或不在活动时间"
        L4b:
            td r3 = p000.EnumC0831td.f10319
            r1.<init>(r0, r3, r4, r2)
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.List m4855(p000.zd1 r0, p000.bb1 r1, p000.rc1 r2) {
            int r1 = r1.f1620
            int r2 = r2.f9332
            java.lang.Integer r1 = m4858(r1, r2)
            java.util.ArrayList r0 = r0.m7126()
            if (r1 == 0) goto L16
            int r1 = r1.intValue()
            java.util.List r0 = p000.AbstractC0984xh.m6662(r0, r1)
        L16:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.Long m4856(p000.zd1 r10, java.util.List r11, long r12) {
            r0 = 10
            int r0 = p000.AbstractC1021yh.m6889(r11, r0)
            int r0 = p000.ex0.m1970(r0)
            r1 = 16
            if (r0 >= r1) goto Lf
            r0 = r1
        Lf:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r11 = r11.iterator()
        L18:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r11.next()
            r2 = r0
            id1 r2 = (p000.id1) r2
            int r2 = r2.f5015
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r0)
            goto L18
        L2f:
            java.util.ArrayList r10 = r10.m7122()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L3c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r10.next()
            lc1 r0 = (p000.lc1) r0
            java.lang.Integer r2 = r0.f6547
            r3 = 0
            if (r2 == 0) goto L91
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r1.get(r2)
            id1 r2 = (p000.id1) r2
            if (r2 != 0) goto L5e
            goto L91
        L5e:
            java.lang.Long r4 = r0.f6556
            if (r4 == 0) goto L91
            long r4 = r4.longValue()
            java.lang.Integer r6 = r2.f5029
            if (r6 == 0) goto L91
            int r6 = r6.intValue()
            java.lang.Integer r2 = r2.f5028
            if (r2 == 0) goto L83
            java.lang.Integer r0 = r0.f6555
            if (r0 == 0) goto L7b
            int r0 = r0.intValue()
            goto L7c
        L7b:
            r0 = 0
        L7c:
            int r2 = r2.intValue()
            if (r0 < r2) goto L83
            goto L91
        L83:
            long r6 = (long) r6
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r6 = r6 + r4
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r2 <= 0) goto L91
            r3 = r0
        L91:
            if (r3 == 0) goto L3c
            r11.add(r3)
            goto L3c
        L97:
            java.lang.Comparable r10 = p000.AbstractC0984xh.m6649(r11)
            java.lang.Long r10 = (java.lang.Long) r10
            return r10
    }

    /* JADX INFO: renamed from: ζ */
    public static int m4857(p000.zd1 r0, p000.bb1 r1, p000.rc1 r2, p000.id1 r3) {
            if (r3 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r1 = r1.f1621
            int r2 = r2.f9333
            java.lang.Integer r1 = m4858(r1, r2)
            if (r1 == 0) goto L13
            int r1 = r1.intValue()
            goto L1b
        L13:
            java.util.ArrayList r1 = r0.m7123()
            int r1 = r1.size()
        L1b:
            java.util.ArrayList r2 = r0.m7123()
            int r2 = r2.size()
            int r0 = m4852(r0, r3)
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = java.lang.Math.min(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.Integer m4858(int r2, int r3) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 0
            if (r2 <= 0) goto L8
            goto L9
        L8:
            r0 = r1
        L9:
            if (r0 == 0) goto L18
            int r2 = r0.intValue()
            int r2 = r2 - r3
            if (r2 >= 0) goto L13
            r2 = 0
        L13:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L18:
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.List m4859(java.util.List r4, java.lang.Integer r5, long r6) {
            if (r5 != 0) goto L5
            jz r4 = p000.C0450jz.f5672
            return r4
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            r2 = r1
            id1 r2 = (p000.id1) r2
            boolean r3 = r2.f5033
            if (r3 == 0) goto Le
            boolean r3 = r2.m2743(r6)
            if (r3 == 0) goto Le
            java.lang.Integer r2 = r2.f5022
            if (r2 == 0) goto L2e
            int r2 = r2.intValue()
            goto L31
        L2e:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L31:
            int r3 = r5.intValue()
            if (r2 > r3) goto Le
            r0.add(r1)
            goto Le
        L3b:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static java.util.List m4860(p000.zd1 r12, java.util.List r13, long r14) {
            r12.getClass()
            java.lang.Integer r0 = r12.f13050
            r1 = 0
            if (r0 == 0) goto Ld
            int r2 = r0.intValue()
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 > 0) goto L13
            jz r12 = p000.C0450jz.f5672
            return r12
        L13:
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r13, r2)
            int r2 = p000.ex0.m1970(r2)
            r3 = 16
            if (r2 >= r3) goto L22
            r2 = r3
        L22:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L2b:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r13.next()
            r4 = r2
            id1 r4 = (p000.id1) r4
            int r4 = r4.f5015
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r4, r2)
            goto L2b
        L42:
            java.util.ArrayList r12 = r12.m7122()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L4f:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r12.next()
            r4 = r2
            lc1 r4 = (p000.lc1) r4
            java.lang.Integer r5 = r4.f6547
            r6 = 0
            if (r5 == 0) goto L70
            int r5 = r5.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r3.get(r5)
            id1 r5 = (p000.id1) r5
            goto L71
        L70:
            r5 = r6
        L71:
            if (r5 == 0) goto L76
            java.lang.Integer r7 = r5.f5028
            goto L77
        L76:
            r7 = r6
        L77:
            if (r5 == 0) goto L7b
            java.lang.Integer r6 = r5.f5029
        L7b:
            java.lang.Integer r5 = r4.f6555
            java.lang.Long r8 = r4.f6556
            if (r7 == 0) goto L8f
            if (r5 == 0) goto L8f
            int r9 = r5.intValue()
            int r10 = r7.intValue()
            if (r9 < r10) goto L8f
        L8d:
            r9 = r1
            goto Lc5
        L8f:
            r9 = 1
            if (r6 == 0) goto La6
            if (r8 == 0) goto La6
            long r4 = r8.longValue()
            int r6 = r6.intValue()
            long r6 = (long) r6
            r10 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r10
            long r6 = r6 + r4
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 > 0) goto L8d
            goto Lc5
        La6:
            if (r7 == 0) goto Lb3
            if (r6 == 0) goto Lb3
            if (r5 == 0) goto Lc5
            int r4 = r5.intValue()
            if (r4 != 0) goto L8d
            goto Lc5
        Lb3:
            if (r5 == 0) goto Lbb
            int r5 = r5.intValue()
            if (r5 != 0) goto L8d
        Lbb:
            if (r8 != 0) goto L8d
            long r4 = r4.f6550
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L8d
        Lc5:
            if (r9 == 0) goto L4f
            r13.add(r2)
            goto L4f
        Lcb:
            if (r0 == 0) goto Ld1
            int r1 = r0.intValue()
        Ld1:
            java.util.List r12 = p000.AbstractC0984xh.m6662(r13, r1)
            return r12
    }

    /* JADX INFO: renamed from: θ */
    public final p000.oc1 m4861(java.util.List r12, p000.zd1 r13, p000.C0720qd r14, p000.C0794sd r15, java.util.Set r16, long r17) {
            r11 = this;
            r13.getClass()
            r15.getClass()
            td r1 = r15.m5469()
            int r1 = r1.ordinal()
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L2a
            if (r1 != r2) goto L25
            java.lang.Integer r6 = r15.f9840
            java.lang.String r7 = "人员固定"
            r4 = r12
            r5 = r13
            r8 = r16
            r9 = r17
            oc1 r11 = m4854(r4, r5, r6, r7, r8, r9)
            return r11
        L25:
            p000.C1080.m7272()
            r11 = 0
            return r11
        L2a:
            int r3 = r14.f8968
            java.util.Set r4 = r15.f9842
            java.lang.String r6 = "人员智能"
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r16
            r7 = r17
            oc1 r11 = r0.m4862(r1, r2, r3, r4, r5, r6, r7)
            return r11
        L3c:
            td r1 = r14.m4863()
            if (r1 != 0) goto L44
            r1 = -1
            goto L4c
        L44:
            int[] r4 = p000.pc1.f8491
            int r1 = r1.ordinal()
            r1 = r4[r1]
        L4c:
            if (r1 == r3) goto L6d
            if (r1 == r2) goto L5b
            oc1 r11 = new oc1
            java.lang.String r12 = "全局"
            java.lang.String r13 = "全局种子策略尚未设置"
            r14 = 0
            r11.<init>(r14, r14, r12, r13)
            return r11
        L5b:
            int r3 = r14.f8968
            java.util.Set r4 = r15.f9842
            java.lang.String r6 = "全局智能"
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r16
            r7 = r17
            oc1 r11 = r0.m4862(r1, r2, r3, r4, r5, r6, r7)
            return r11
        L6d:
            java.lang.Integer r2 = r14.f8967
            java.lang.String r3 = "全局固定"
            r0 = r12
            r1 = r13
            r4 = r16
            r5 = r17
            oc1 r11 = m4854(r0, r1, r2, r3, r4, r5)
            return r11
    }

    /* JADX INFO: renamed from: κ */
    public final p000.oc1 m4862(java.util.List r18, p000.zd1 r19, int r20, java.util.Set r21, java.util.Set r22, java.lang.String r23, long r24) {
            r17 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.LinkedHashSet r3 = p000.g81.m2282(r2, r3)
            java.lang.Integer r4 = r0.f13048
            java.lang.Long r5 = m4853(r0)
            if (r1 >= 0) goto L1c
            r6 = 0
        L17:
            r7 = r18
            r8 = r24
            goto L1e
        L1c:
            r6 = r1
            goto L17
        L1e:
            java.util.List r4 = m4859(r7, r4, r8)
            f7 r7 = new f7
            r8 = 1
            r7.<init>(r8, r4)
            tb r4 = new tb
            r4.<init>(r3, r8)
            y30 r3 = new y30
            r3.<init>(r7, r8, r4)
            f71 r4 = new f71
            r7 = 17
            r4.<init>(r7)
            y30 r7 = new y30
            r7.<init>(r3, r8, r4)
            eg r3 = new eg
            r4 = 2
            r3.<init>(r6, r4)
            y30 r4 = new y30
            r4.<init>(r7, r8, r3)
            nc1 r3 = new nc1
            r6 = 0
            r3.<init>(r5, r6)
            y30 r5 = new y30
            r5.<init>(r4, r8, r3)
            a30 r9 = new a30
            r15 = 0
            r16 = 2
            r10 = 2
            java.lang.Class<qc1> r12 = p000.qc1.class
            java.lang.String r13 = "compareSmartSeed"
            java.lang.String r14 = "compareSmartSeed(Lcom/example/dyhelper/hook/IM/pet/PetElfCampSeedCatalog$Seed;Lcom/example/dyhelper/hook/IM/pet/PetElfCampSeedCatalog$Seed;)I"
            r11 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            lm r3 = new lm
            r4 = 1
            r3.<init>(r4, r9)
            java.util.List r4 = p000.us1.m5949(r5)
            p000.AbstractC0019ai.m168(r4, r3)
            java.util.Iterator r3 = r4.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L7e
            r3 = 0
            goto L82
        L7e:
            java.lang.Object r3 = r3.next()
        L82:
            id1 r3 = (p000.id1) r3
            oc1 r4 = new oc1
            if (r3 == 0) goto Lbf
            java.lang.String r0 = r3.f5016
            if (r0 != 0) goto L94
            int r0 = r3.f5015
            java.lang.String r1 = "种子 "
            java.lang.String r0 = p000.a12.m17(r1, r0)
        L94:
            java.lang.Integer r1 = r3.f5019
            java.lang.String r2 = "?"
            if (r1 != 0) goto L9b
            r1 = r2
        L9b:
            java.lang.Integer r5 = r3.f5020
            if (r5 != 0) goto La0
            goto La1
        La0:
            r2 = r5
        La1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = "，价格 "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = "，收益 "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            goto L137
        Lbf:
            java.lang.Integer r5 = r0.f13048
            if (r5 != 0) goto Lc6
            java.lang.String r0 = "营地等级未知"
            goto L137
        Lc6:
            java.lang.Long r0 = m4853(r0)
            if (r0 != 0) goto Lcf
            java.lang.String r0 = "金币未知，无法校验付费种子"
            goto L137
        Lcf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "没有满足等级、余额与收益数据的可买种子，活动时间已校验"
            r0.<init>(r5)
            if (r1 <= 0) goto Lee
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "（价格上限 "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "）"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
        Lee:
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            java.lang.String r5 = " 种"
            if (r1 != 0) goto L111
            int r1 = r2.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "，已排除 "
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
        L111:
            r1 = r22
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L133
            int r1 = r22.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "，当前会话活动拒绝 "
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
        L133:
            java.lang.String r0 = r0.toString()
        L137:
            td r1 = p000.EnumC0831td.f10318
            r2 = r23
            r4.<init>(r3, r1, r2, r0)
            return r4
    }
}
