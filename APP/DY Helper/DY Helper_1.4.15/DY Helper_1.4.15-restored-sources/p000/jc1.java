package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jc1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f5424 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f5425 = null;

    /* JADX INFO: renamed from: γ */
    public static final p000.C0000a f5426 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.jc1.f5424 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.jc1.f5425 = r0
            a r0 = new a
            r0.<init>(r1)
            p000.jc1.f5426 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static boolean m2928(java.lang.String r1) {
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5425
            boolean r0 = r0.get()
            if (r0 != 0) goto L1b
            java.lang.String r0 = p000.ui1.m5890()
            boolean r1 = p000.ln0.m3626(r0, r1)
            if (r1 == 0) goto L1b
            boolean r1 = p000.AbstractC0976x9.m6528()
            if (r1 != 0) goto L19
            goto L1b
        L19:
            r1 = 0
            return r1
        L1b:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: Β */
    public static java.lang.String m2929(p000.zd1 r10) {
            if (r10 == 0) goto L5f
            java.lang.Integer r0 = r10.f13048
            if (r0 == 0) goto Lb
            int r0 = r0.intValue()
            goto Lc
        Lb:
            r0 = -1
        Lc:
            java.util.List r1 = r10.f13051
            int r1 = r1.size()
            java.util.ArrayList r2 = r10.m7126()
            int r2 = r2.size()
            java.util.ArrayList r3 = r10.m7122()
            int r3 = r3.size()
            java.util.ArrayList r4 = r10.m7123()
            int r4 = r4.size()
            java.util.ArrayList r5 = r10.m7125()
            int r5 = r5.size()
            java.lang.Long r10 = r10.m7127()
            if (r10 == 0) goto L3d
            long r6 = r10.longValue()
            goto L3f
        L3d:
            r6 = -1
        L3f:
            java.lang.String r10 = " plots="
            java.lang.String r8 = " mature="
            java.lang.String r9 = "level="
            java.lang.StringBuilder r10 = p000.AbstractC0602nx.m4136(r9, r0, r10, r1, r8)
            java.lang.String r0 = " growing="
            java.lang.String r1 = " idle="
            p000.AbstractC0602nx.m4117(r10, r2, r0, r3, r1)
            java.lang.String r0 = " locked="
            java.lang.String r1 = " nextMature="
            p000.AbstractC0602nx.m4117(r10, r4, r0, r5, r1)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            return r10
        L5f:
            java.lang.String r10 = "snapshot=none"
            return r10
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m2930(p000.EnumC0619od r1) {
            int r1 = r1.ordinal()
            if (r1 == 0) goto L17
            r0 = 1
            if (r1 == r0) goto L14
            r0 = 2
            if (r1 != r0) goto Lf
            java.lang.String r1 = "water"
            return r1
        Lf:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L14:
            java.lang.String r1 = "plant"
            return r1
        L17:
            java.lang.String r1 = "harvest"
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static p000.cc1 m2931() {
            long r6 = java.lang.System.currentTimeMillis()
            qd r3 = p000.v81.m6127()
            kd1 r0 = p000.kd1.f5861
            java.util.List r1 = r0.m3202()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.List r0 = m2939()
            java.util.Iterator r11 = r0.iterator()
        L25:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L2e3
            java.lang.Object r0 = r11.next()
            ec1 r0 = (p000.ec1) r0
            id r2 = r0.f3487
            sd r4 = r0.f3486
            long r12 = r0.f3481
            r5 = 0
            boolean r14 = p000.xn0.m6723(r2, r6, r5)
            if (r2 == 0) goto L86
            r16 = r6
            long r5 = r2.f5006
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat
            java.util.Locale r15 = java.util.Locale.getDefault()
            r19 = r11
            java.lang.String r11 = "yyyy-MM-dd"
            r7.<init>(r11, r15)
            java.util.Date r15 = new java.util.Date
            r15.<init>(r5)
            java.lang.String r5 = r7.format(r15)
            r5.getClass()
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.util.Locale r7 = java.util.Locale.getDefault()
            r6.<init>(r11, r7)
            java.util.Date r7 = new java.util.Date
            r11 = r14
            r14 = r16
            r7.<init>(r14)
            java.lang.String r6 = r6.format(r7)
            r6.getClass()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8a
            pd r5 = r2.f5004
            pd r6 = p000.EnumC0683pd.f8502
            if (r5 != r6) goto L8a
            zd1 r5 = r2.f5005
            if (r5 != 0) goto L84
            goto L8a
        L84:
            r5 = 0
            goto L8b
        L86:
            r19 = r11
            r11 = r14
            r14 = r6
        L8a:
            r5 = 1
        L8b:
            if (r11 == 0) goto L9b
            if (r5 == 0) goto L9b
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r8.add(r0)
        L96:
            r17 = r10
        L98:
            r6 = r14
            goto L2dd
        L9b:
            r5 = 0
            if (r2 == 0) goto La1
            zd1 r6 = r2.f5005
            goto La2
        La1:
            r6 = r5
        La2:
            if (r6 == 0) goto L96
            od r6 = p000.EnumC0619od.f8035
            od r7 = p000.EnumC0619od.f8036
            nz r16 = p000.C0604nz.f7825
            if (r11 == 0) goto L20b
            java.lang.Long r0 = r2.f5009
            if (r0 == 0) goto Lbb
            long r20 = r0.longValue()
            int r0 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r0 > 0) goto Lbb
            r18 = 1
            goto Lbd
        Lbb:
            r18 = 0
        Lbd:
            java.util.Set r0 = r2.f5010
            if (r18 == 0) goto Lc2
            goto Lc3
        Lc2:
            r0 = r5
        Lc3:
            if (r0 != 0) goto Lc7
            r0 = r16
        Lc7:
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L10f
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r8.add(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r9.put(r4, r0)
            od r0 = r2.f5011
            if (r0 == 0) goto L96
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L102
            r4 = 1
            if (r0 == r4) goto Lf9
            r4 = 2
            if (r0 != r4) goto Lf5
        Lf2:
            r0 = r16
            goto L10b
        Lf5:
            p000.C1080.m7272()
            return r5
        Lf9:
            od[] r0 = new p000.EnumC0619od[]{r7}
            java.util.LinkedHashSet r16 = p000.g81.m2280(r0)
            goto Lf2
        L102:
            od[] r0 = new p000.EnumC0619od[]{r6, r7}
            java.util.LinkedHashSet r16 = p000.g81.m2280(r0)
            goto Lf2
        L10b:
            r10.put(r2, r0)
            goto L96
        L10f:
            zd1 r0 = r2.f5005
            if (r0 != 0) goto L117
            r17 = r10
            goto L1cc
        L117:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.lang.Long r5 = r2.f5007
            if (r5 == 0) goto L178
            long r5 = r5.longValue()
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 > 0) goto L178
            java.util.List r5 = r0.f13051
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L133:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L160
            java.lang.Object r7 = r5.next()
            r11 = r7
            lc1 r11 = (p000.lc1) r11
            r16 = r5
            mc1 r5 = r11.f6546
            r17 = r10
            mc1 r10 = p000.mc1.f7071
            if (r5 == r10) goto L15c
            java.lang.Long r5 = r11.f6549
            if (r5 == 0) goto L157
            long r10 = r5.longValue()
            int r5 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r5 > 0) goto L157
            goto L15c
        L157:
            r5 = r16
            r10 = r17
            goto L133
        L15c:
            r6.add(r7)
            goto L157
        L160:
            r17 = r10
            java.util.Iterator r5 = r6.iterator()
        L166:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L17a
            java.lang.Object r6 = r5.next()
            lc1 r6 = (p000.lc1) r6
            java.lang.String r6 = r6.f6544
            r4.add(r6)
            goto L166
        L178:
            r17 = r10
        L17a:
            java.lang.Long r2 = r2.f5008
            if (r2 == 0) goto L1a2
            long r5 = r2.longValue()
            int r2 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r2 > 0) goto L1a2
            qc1 r2 = p000.qc1.f8961
            java.util.List r0 = p000.qc1.m4860(r0, r1, r14)
            java.util.Iterator r0 = r0.iterator()
        L190:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1a2
            java.lang.Object r2 = r0.next()
            lc1 r2 = (p000.lc1) r2
            java.lang.String r2 = r2.f6544
            r4.add(r2)
            goto L190
        L1a2:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r4.iterator()
        L1ab:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1c2
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = p000.q02.m4671(r5)
            if (r5 != 0) goto L1ab
            r0.add(r4)
            goto L1ab
        L1c2:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            p000.AbstractC0984xh.m6664(r0, r2)
            r16 = r2
        L1cc:
            java.lang.Iterable r16 = (java.lang.Iterable) r16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r16.iterator()
        L1d7:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1ee
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = p000.q02.m4671(r5)
            if (r5 != 0) goto L1d7
            r0.add(r4)
            goto L1d7
        L1ee:
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            r8.add(r2)
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L98
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            r9.put(r2, r0)
            goto L98
        L20b:
            r17 = r10
            id r0 = r0.f3487
            if (r0 == 0) goto L215
            zd1 r2 = r0.f5005
            if (r2 != 0) goto L218
        L215:
            r6 = r14
            goto L2c4
        L218:
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            od r0 = p000.EnumC0619od.f8034
            boolean r5 = r3.f8963
            boolean r0 = r4.m5470(r0, r5)
            if (r0 == 0) goto L241
            java.util.ArrayList r0 = r2.m7126()
            java.util.Iterator r0 = r0.iterator()
        L22f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L241
            java.lang.Object r5 = r0.next()
            lc1 r5 = (p000.lc1) r5
            java.lang.String r5 = r5.f6544
            r10.add(r5)
            goto L22f
        L241:
            boolean r0 = r3.f8964
            boolean r0 = r4.m5470(r6, r0)
            if (r0 == 0) goto L275
            qc1 r0 = p000.qc1.f8961
            xn0 r5 = p000.xn0.f12236
            java.util.Set r5 = r5.m6765(r12, r14)
            r11 = r7
            r6 = r14
            oc1 r0 = r0.m4861(r1, r2, r3, r4, r5, r6)
            id1 r0 = r0.f8028
            if (r0 == 0) goto L277
            java.util.ArrayList r0 = r2.m7123()
            java.util.Iterator r0 = r0.iterator()
        L263:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L277
            java.lang.Object r5 = r0.next()
            lc1 r5 = (p000.lc1) r5
            java.lang.String r5 = r5.f6544
            r10.add(r5)
            goto L263
        L275:
            r11 = r7
            r6 = r14
        L277:
            boolean r0 = r3.f8965
            boolean r0 = r4.m5470(r11, r0)
            if (r0 == 0) goto L29b
            qc1 r0 = p000.qc1.f8961
            java.util.List r0 = p000.qc1.m4860(r2, r1, r6)
            java.util.Iterator r0 = r0.iterator()
        L289:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29b
            java.lang.Object r2 = r0.next()
            lc1 r2 = (p000.lc1) r2
            java.lang.String r2 = r2.f6544
            r10.add(r2)
            goto L289
        L29b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r10.iterator()
        L2a4:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2bb
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = p000.q02.m4671(r5)
            if (r5 != 0) goto L2a4
            r0.add(r4)
            goto L2a4
        L2bb:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            p000.AbstractC0984xh.m6664(r0, r2)
            goto L2c6
        L2c4:
            r2 = r16
        L2c6:
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2dd
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r8.add(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r12)
            r9.put(r0, r2)
        L2dd:
            r10 = r17
            r11 = r19
            goto L25
        L2e3:
            r17 = r10
            cc1 r0 = new cc1
            r1 = r17
            r0.<init>(r8, r9, r1)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static p000.bc1 m2932(p000.EnumC0619od r43, java.util.List r44, p000.C0720qd r45, java.util.List r46, p000.bb1 r47, p000.rc1 r48, long r49) {
            r0 = r43
            r4 = r45
            r9 = r47
            r7 = r49
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            java.util.Iterator r15 = r44.iterator()
            r16 = 0
            r2 = r48
            r20 = r16
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
        L2e:
            boolean r3 = r15.hasNext()
            r5 = 2
            r44 = r15
            if (r3 == 0) goto L2c3
            java.lang.Object r3 = r44.next()
            ec1 r3 = (p000.ec1) r3
            sd r1 = r3.f3486
            r25 = 0
            java.lang.String r15 = r3.f3484
            r26 = r5
            sd r5 = r3.f3486
            r37 = r12
            r38 = r13
            long r12 = r3.f3481
            boolean r6 = r4.m4864(r0)
            boolean r1 = r1.m5470(r0, r6)
            if (r1 != 0) goto L64
            int r18 = r18 + 1
            r41 = r2
            r0 = r11
            r7 = r14
            r5 = r37
            r6 = r38
        L61:
            r2 = 0
            goto L2b1
        L64:
            id r1 = r3.f3487
            if (r1 == 0) goto L70
            zd1 r6 = r1.f5005
            r42 = r6
            r6 = r3
            r3 = r42
            goto L73
        L70:
            r6 = r3
            r3 = r25
        L73:
            r28 = r2
            if (r1 == 0) goto L7a
            pd r2 = r1.f5004
            goto L7c
        L7a:
            r2 = r25
        L7c:
            pd r10 = p000.EnumC0683pd.f8502
            if (r2 != r10) goto L82
            if (r3 != 0) goto L8d
        L82:
            r0 = r11
            r7 = r14
            r10 = r28
            r5 = r37
            r6 = r38
            r2 = 0
            goto L2ad
        L8d:
            od r2 = p000.EnumC0619od.f8035
            if (r0 != r2) goto Lb4
            r29 = r1
            qc1 r1 = p000.qc1.f8961
            r30 = r1
            xn0 r1 = p000.xn0.f12236
            java.util.Set r1 = r1.m6765(r12, r7)
            r41 = r2
            r26 = r6
            r40 = r11
            r39 = r14
            r24 = r28
            r11 = r29
            r14 = 1
            r2 = r46
            r6 = r1
            r1 = r30
            oc1 r1 = r1.m4861(r2, r3, r4, r5, r6, r7)
            goto Lc2
        Lb4:
            r41 = r2
            r26 = r6
            r40 = r11
            r39 = r14
            r24 = r28
            r14 = 1
            r11 = r1
            r1 = r25
        Lc2:
            qc1 r2 = p000.qc1.f8961
            pd r2 = r11.f5004
            if (r1 == 0) goto Lcb
            id1 r6 = r1.f8028
            goto Lcd
        Lcb:
            r6 = r25
        Lcd:
            r24.getClass()
            if (r2 != r10) goto L106
            int r2 = r0.ordinal()
            if (r2 == 0) goto Lf9
            if (r2 == r14) goto Lf0
            r10 = 2
            if (r2 != r10) goto Lec
            r2 = r46
            java.util.List r6 = p000.qc1.m4860(r3, r2, r7)
            int r6 = r6.size()
            r10 = r24
        Le9:
            r11 = r41
            goto L10d
        Lec:
            p000.C1080.m7272()
            return r25
        Lf0:
            r2 = r46
            r10 = r24
            int r6 = p000.qc1.m4857(r3, r9, r10, r6)
            goto Le9
        Lf9:
            r2 = r46
            r10 = r24
            java.util.List r6 = p000.qc1.m4855(r3, r9, r10)
            int r6 = r6.size()
            goto Le9
        L106:
            r2 = r46
            r10 = r24
            r11 = r41
            r6 = 0
        L10d:
            if (r0 != r11) goto L1c4
            if (r1 == 0) goto L114
            id1 r11 = r1.f8028
            goto L116
        L114:
            r11 = r25
        L116:
            r14 = 48
            java.lang.String r14 = m2950(r15, r14)
            if (r1 == 0) goto L121
            java.lang.String r0 = r1.f8030
            goto L123
        L121:
            r0 = r25
        L123:
            if (r1 == 0) goto L128
            td r2 = r1.f8029
            goto L12a
        L128:
            r2 = r25
        L12a:
            if (r11 == 0) goto L12f
            int r7 = r11.f5015
            goto L130
        L12f:
            r7 = 0
        L130:
            if (r11 == 0) goto L135
            java.lang.Integer r8 = r11.f5019
            goto L137
        L135:
            r8 = r25
        L137:
            if (r11 == 0) goto L13c
            java.lang.Integer r11 = r11.f5020
            goto L13e
        L13c:
            r11 = r25
        L13e:
            java.lang.String r3 = r3.f13053
            r28 = r15
            int r15 = r4.f8968
            java.util.Set r5 = r5.f9842
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = p000.AbstractC0984xh.m6657(r5)
            if (r1 == 0) goto L151
            java.lang.String r4 = r1.f8031
            goto L153
        L151:
            r4 = r25
        L153:
            if (r4 != 0) goto L157
            java.lang.String r4 = ""
        L157:
            r9 = 160(0xa0, float:2.24E-43)
            java.lang.String r4 = m2950(r4, r9)
            java.lang.String r9 = "种植预览 name="
            r41 = r10
            java.lang.String r10 = " shortId="
            java.lang.StringBuilder r9 = p000.AbstractC0602nx.m4137(r9, r14, r12, r10)
            java.lang.String r10 = " source="
            r9.append(r10)
            r9.append(r0)
            java.lang.String r0 = " mode="
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = " seedId="
            r9.append(r0)
            r9.append(r7)
            java.lang.String r0 = " price="
            r9.append(r0)
            r9.append(r8)
            java.lang.String r0 = " income="
            r9.append(r0)
            r9.append(r11)
            java.lang.String r0 = " coin="
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = " maxPrice="
            r9.append(r0)
            r9.append(r15)
            java.lang.String r0 = " excluded="
            r9.append(r0)
            r9.append(r5)
            java.lang.String r0 = " candidates="
            r9.append(r0)
            r9.append(r6)
            java.lang.String r0 = " reason="
            r9.append(r0)
            r9.append(r4)
            java.lang.String r0 = r9.toString()
            r2 = 4
            java.lang.String r3 = "r7ce9b41b1577bc7d"
            r4 = r25
            p000.C0888ux.m5992(r3, r0, r4, r2, r4)
            goto L1c8
        L1c4:
            r41 = r10
            r28 = r15
        L1c8:
            if (r6 > 0) goto L1d6
            int r23 = r23 + 1
            r5 = r37
            r6 = r38
            r7 = r39
            r0 = r40
            goto L61
        L1d6:
            r3 = r26
            r0 = r40
            r0.add(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r7 = r39
            r7.put(r2, r4)
            int r19 = r19 + r6
            int r2 = r43.ordinal()
            if (r2 == 0) goto L298
            r14 = 1
            if (r2 == r14) goto L207
            r10 = 2
            if (r2 != r10) goto L201
            r5 = r37
            r6 = r38
            r1 = r41
            r2 = 0
            goto L2aa
        L201:
            p000.C1080.m7272()
            r25 = 0
            return r25
        L207:
            if (r1 == 0) goto L20c
            id1 r2 = r1.f8028
            goto L20d
        L20c:
            r2 = 0
        L20d:
            if (r2 == 0) goto L286
            java.lang.String r4 = r2.f5016
            if (r4 != 0) goto L21b
            int r4 = r2.f5015
            java.lang.String r5 = "种子 "
            java.lang.String r4 = p000.a12.m17(r5, r4)
        L21b:
            java.lang.Integer r5 = r2.f5019
            if (r5 == 0) goto L22d
            int r5 = r5.intValue()
            long r8 = (long) r6
            long r10 = (long) r5
            long r8 = r8 * r10
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r34 = r5
            goto L22f
        L22d:
            r34 = 0
        L22f:
            java.lang.Integer r5 = r2.f5020
            if (r5 == 0) goto L243
            int r5 = r5.intValue()
            long r8 = (long) r6
            long r10 = (long) r5
            long r8 = r8 * r10
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r35 = r5
        L240:
            r5 = r37
            goto L246
        L243:
            r35 = 0
            goto L240
        L246:
            r5.add(r4)
            if (r34 == 0) goto L250
            long r8 = r34.longValue()
            goto L252
        L250:
            r8 = r16
        L252:
            long r20 = r20 + r8
            r8 = 0
            fc1 r25 = new fc1
            long r9 = r3.f3481
            int r3 = r2.f5015
            java.lang.Integer r11 = r2.f5019
            java.lang.Integer r2 = r2.f5020
            if (r1 == 0) goto L27e
            java.lang.String r1 = r1.f8030
            r36 = r1
            r33 = r2
            r29 = r3
            r30 = r4
            r31 = r6
            r26 = r9
            r32 = r11
            r25.<init>(r26, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r1 = r25
            r6 = r38
            r6.add(r1)
        L27b:
            r10 = r41
            goto L28d
        L27e:
            java.lang.String r0 = "Required value was null."
            p000.C1080.m7279(r0)
            r25 = r8
            return r25
        L286:
            r31 = r6
            r5 = r37
            r6 = r38
            goto L27b
        L28d:
            int r1 = r10.f9333
            int r1 = r1 + r31
            r2 = 0
            r14 = 1
            rc1 r1 = p000.rc1.m5078(r10, r2, r1, r14)
            goto L2aa
        L298:
            r31 = r6
            r5 = r37
            r6 = r38
            r10 = r41
            r2 = 0
            int r1 = r10.f9332
            int r1 = r1 + r31
            r3 = 2
            rc1 r1 = p000.rc1.m5078(r10, r1, r2, r3)
        L2aa:
            r41 = r1
            goto L2b1
        L2ad:
            int r22 = r22 + 1
            r41 = r10
        L2b1:
            r15 = r44
            r4 = r45
            r9 = r47
            r11 = r0
            r12 = r5
            r13 = r6
            r14 = r7
            r2 = r41
            r0 = r43
            r7 = r49
            goto L2e
        L2c3:
            r3 = r5
            r0 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            int r1 = r43.ordinal()
            if (r1 == 0) goto L2ef
            r14 = 1
            if (r1 == r14) goto L2dd
            if (r1 != r3) goto L2d7
            r40 = r0
            r11 = 0
            goto L2fe
        L2d7:
            p000.C1080.m7272()
            r25 = 0
            return r25
        L2dd:
            qc1 r1 = p000.qc1.f8961
            r9 = r47
            int r1 = r9.f1621
            r10 = r48
            int r2 = r10.f9333
            java.lang.Integer r15 = p000.qc1.m4858(r1, r2)
        L2eb:
            r40 = r0
            r11 = r15
            goto L2fe
        L2ef:
            r9 = r47
            r10 = r48
            qc1 r1 = p000.qc1.f8961
            int r1 = r9.f1620
            int r2 = r10.f9332
            java.lang.Integer r15 = p000.qc1.m4858(r1, r2)
            goto L2eb
        L2fe:
            bc1 r0 = new bc1
            r8 = r18
            r2 = r19
            r3 = r20
            r9 = r22
            r10 = r23
            r1 = r40
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.Object m2933(java.lang.ClassLoader r17, p000.ec1 r18) {
            r0 = r18
            long r1 = r0.f3481
            java.lang.String r6 = r0.f3482
            long r3 = r0.f3483
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto Le2
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto Lda
            vc1 r0 = p000.ln0.m3594(r1)     // Catch: java.lang.Throwable -> Lea
            if (r0 == 0) goto L19
            return r0
        L19:
            java.lang.Object r7 = p000.ln0.f6717     // Catch: java.lang.Throwable -> Lea
            monitor-enter(r7)     // Catch: java.lang.Throwable -> Lea
            vc1 r0 = p000.ln0.m3594(r1)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L24
            goto L8f
        L24:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> L68
            r8.<init>()     // Catch: java.lang.Throwable -> L68
            r0 = r17
            java.util.List r9 = p000.ln0.m3654(r0, r1, r3, r5)     // Catch: java.lang.Throwable -> L68
            r10 = r5
            uh0 r0 = new uh0     // Catch: java.lang.Throwable -> L68
            r5 = 27
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = p000.AbstractC0984xh.m6658(r9, r0)     // Catch: java.lang.Throwable -> L68
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L68
        L49:
            boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L6b
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L68
            r11 = r9
            hb1 r11 = (p000.hb1) r11     // Catch: java.lang.Throwable -> L68
            uc1 r12 = r11.f4678     // Catch: java.lang.Throwable -> L68
            java.lang.String r11 = r11.f4677     // Catch: java.lang.Throwable -> L68
            java.lang.String r11 = r12.m5842(r11)     // Catch: java.lang.Throwable -> L68
            boolean r11 = r8.add(r11)     // Catch: java.lang.Throwable -> L68
            if (r11 == 0) goto L49
            r5.add(r9)     // Catch: java.lang.Throwable -> L68
            goto L49
        L68:
            r0 = move-exception
            goto Ld8
        L6b:
            java.util.Iterator r8 = r5.iterator()     // Catch: java.lang.Throwable -> L68
        L6f:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto La4
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L68
            hb1 r0 = (p000.hb1) r0     // Catch: java.lang.Throwable -> L68
            r15 = r3
            r4 = r6
            r5 = r15
            r2 = r1
            r1 = r0
            r0 = r17
            java.lang.Object r9 = p000.ln0.m3653(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L68
            r0 = r1
            r1 = r2
            boolean r3 = r9 instanceof p000.eo1     // Catch: java.lang.Throwable -> L68
            if (r3 != 0) goto L91
            r0 = r9
            vc1 r0 = (p000.vc1) r0     // Catch: java.lang.Throwable -> L68
        L8f:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lea
            return r0
        L91:
            java.lang.Throwable r3 = p000.fo1.m2190(r9)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto La0
            java.lang.String r0 = r0.f4679     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = p000.ln0.m3647(r3)     // Catch: java.lang.Throwable -> L68
            p000.ln0.m3644(r10, r1, r0, r3)     // Catch: java.lang.Throwable -> L68
        La0:
            r15 = r5
            r6 = r4
            r3 = r15
            goto L6f
        La4:
            java.lang.String r9 = "; "
            r13 = 0
            r14 = 62
            r5 = r10
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r5
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L68
            r1 = 320(0x140, float:4.48E-43)
            java.lang.String r0 = p000.q02.m4693(r0, r1)     // Catch: java.lang.Throwable -> L68
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L68
            boolean r2 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto Lc3
            java.lang.String r0 = "宿主未提供可验证的营地身份"
            goto Ld4
        Lc3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r2.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = "宿主营地身份自动验证失败: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L68
            r2.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L68
        Ld4:
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L68
            throw r1     // Catch: java.lang.Throwable -> L68
        Ld8:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lea
            throw r0     // Catch: java.lang.Throwable -> Lea
        Lda:
            java.lang.String r0 = "会话对端 UID 无效"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lea
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lea
            throw r1     // Catch: java.lang.Throwable -> Lea
        Le2:
            java.lang.String r0 = "会话短 ID 无效"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lea
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lea
            throw r1     // Catch: java.lang.Throwable -> Lea
        Lea:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static p000.dc1 m2934(java.lang.ClassLoader r42, p000.EnumC0619od r43, boolean r44, java.util.LinkedHashSet r45, java.util.LinkedHashMap r46, java.util.LinkedHashMap r47, p000.ac1 r48, int r49) {
            kz r0 = p000.C0493kz.f6332
            r1 = r49 & 8
            if (r1 == 0) goto L8
            r1 = 0
            goto La
        L8:
            r1 = r45
        La:
            r3 = r49 & 16
            if (r3 == 0) goto L10
            r3 = r0
            goto L12
        L10:
            r3 = r46
        L12:
            r4 = r49 & 32
            if (r4 == 0) goto L18
            r14 = r0
            goto L1a
        L18:
            r14 = r47
        L1a:
            r0 = r49 & 64
            if (r0 == 0) goto L20
            r0 = 0
            goto L22
        L20:
            r0 = r48
        L22:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r5 = "/"
            java.lang.String r6 = " "
            java.lang.String r19 = "auto"
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.jc1.f5425
            java.util.concurrent.atomic.AtomicBoolean r8 = p000.jc1.f5424
            java.lang.String r9 = "r7ce9b41b1577bc7d"
            boolean r10 = p000.AbstractC0976x9.m6528()
            if (r10 == 0) goto L64b
            boolean r10 = p000.ui1.m5867()
            if (r10 != 0) goto L3e
            goto L64b
        L3e:
            r10 = 0
            r11 = 1
            boolean r12 = r8.compareAndSet(r10, r11)
            if (r12 != 0) goto L5e
            dc1 r20 = new dc1
            r28 = 0
            r29 = 188(0xbc, float:2.63E-43)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r20
        L5e:
            if (r44 == 0) goto L63
            r7.set(r10)
        L63:
            java.lang.String r12 = p000.ui1.m5890()     // Catch: java.lang.Throwable -> Lba
            ae1 r13 = p000.xn0.m6717(r12)     // Catch: java.lang.Throwable -> Lba
            qd r22 = p000.v81.m6127()     // Catch: java.lang.Throwable -> Lba
            r15 = r42
            java.lang.Object r2 = p000.ln0.m3640(r15, r10)     // Catch: java.lang.Throwable -> Lba
            kd1 r16 = p000.kd1.f5861     // Catch: java.lang.Throwable -> Lba
            java.util.List r16 = r16.m3202()     // Catch: java.lang.Throwable -> Lba
            boolean r11 = r2 instanceof p000.eo1     // Catch: java.lang.Throwable -> Lba
            if (r11 == 0) goto L81
            r2 = r16
        L81:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> Lba
            r11 = 10
            int r16 = p000.AbstractC1021yh.m6889(r2, r11)     // Catch: java.lang.Throwable -> Lba
            int r11 = p000.ex0.m1970(r16)     // Catch: java.lang.Throwable -> Lba
            r10 = 16
            if (r11 >= r10) goto L92
            r11 = r10
        L92:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lba
            r10.<init>(r11)     // Catch: java.lang.Throwable -> Lba
            java.util.Iterator r11 = r2.iterator()     // Catch: java.lang.Throwable -> Lba
        L9b:
            boolean r16 = r11.hasNext()     // Catch: java.lang.Throwable -> Lba
            if (r16 == 0) goto Lc1
            r23 = r2
            java.lang.Object r2 = r11.next()     // Catch: java.lang.Throwable -> Lba
            r48 = r4
            r4 = r2
            id1 r4 = (p000.id1) r4     // Catch: java.lang.Throwable -> Lba
            int r4 = r4.f5015     // Catch: java.lang.Throwable -> Lba
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lba
            r10.put(r4, r2)     // Catch: java.lang.Throwable -> Lba
            r4 = r48
            r2 = r23
            goto L9b
        Lba:
            r0 = move-exception
            r20 = r7
        Lbd:
            r2 = r8
            r10 = r9
            goto L620
        Lc1:
            r23 = r2
            r48 = r4
            bb1 r2 = new bb1     // Catch: java.lang.Throwable -> Lba
            java.lang.String r4 = "pet_elf_camp_daily_harvest_limit"
            android.content.SharedPreferences r11 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Ld5
            r49 = r7
            r7 = 0
            int r4 = r11.getInt(r4, r7)     // Catch: java.lang.Throwable -> Ld8
            goto Ld9
        Ld5:
            r49 = r7
            r7 = 0
        Ld8:
            r4 = r7
        Ld9:
            r11 = 100
            int r4 = p000.j81.m2906(r4, r7, r11)     // Catch: java.lang.Throwable -> L61b
            java.lang.String r11 = "pet_elf_camp_daily_plant_limit"
            r16 = r8
            android.content.SharedPreferences r8 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lee
            int r8 = r8.getInt(r11, r7)     // Catch: java.lang.Throwable -> Lee
        Leb:
            r11 = 100
            goto Lf0
        Lee:
            r8 = r7
            goto Leb
        Lf0:
            int r8 = p000.j81.m2906(r8, r7, r11)     // Catch: java.lang.Throwable -> L148
            java.lang.String r7 = "pet_elf_camp_operation_interval_seconds"
            r11 = 3
            r17 = r10
            android.content.SharedPreferences r10 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L101
            int r11 = r10.getInt(r7, r11)     // Catch: java.lang.Throwable -> L101
        L101:
            r7 = 60
            r10 = 0
            int r7 = p000.j81.m2906(r11, r10, r7)     // Catch: java.lang.Throwable -> L148
            long r10 = (long) r7     // Catch: java.lang.Throwable -> L148
            r20 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r20
            r2.<init>(r4, r8, r10)     // Catch: java.lang.Throwable -> L148
            xn0 r4 = p000.xn0.f12235     // Catch: java.lang.Throwable -> L148
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L148
            rc1 r25 = r4.m6763(r7)     // Catch: java.lang.Throwable -> L148
            java.util.List r4 = m2939()     // Catch: java.lang.Throwable -> L148
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L148
            r7.<init>()     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r8 = r4.iterator()     // Catch: java.lang.Throwable -> L148
        L127:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L148
            if (r10 == 0) goto L156
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L148
            r11 = r10
            ec1 r11 = (p000.ec1) r11     // Catch: java.lang.Throwable -> L148
            if (r1 == 0) goto L150
            r18 = r12
            long r11 = r11.f3481     // Catch: java.lang.Throwable -> L148
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L148
            boolean r11 = r1.contains(r11)     // Catch: java.lang.Throwable -> L148
            if (r11 == 0) goto L145
            goto L152
        L145:
            r12 = r18
            goto L127
        L148:
            r0 = move-exception
            r20 = r49
            r10 = r9
            r2 = r16
            goto L620
        L150:
            r18 = r12
        L152:
            r7.add(r10)     // Catch: java.lang.Throwable -> L148
            goto L145
        L156:
            r18 = r12
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L148
            r8 = 10
            int r10 = p000.AbstractC1021yh.m6889(r7, r8)     // Catch: java.lang.Throwable -> L148
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L148
        L167:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L148
            if (r8 == 0) goto L17b
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L148
            ec1 r8 = (p000.ec1) r8     // Catch: java.lang.Throwable -> L148
            ec1 r8 = m2952(r8, r3)     // Catch: java.lang.Throwable -> L148
            r1.add(r8)     // Catch: java.lang.Throwable -> L148
            goto L167
        L17b:
            if (r43 == 0) goto L182
            java.util.List r7 = p000.AbstractC1021yh.m6896(r43)     // Catch: java.lang.Throwable -> L148
            goto L18a
        L182:
            od[] r7 = p000.EnumC0619od.values()     // Catch: java.lang.Throwable -> L148
            java.util.List r7 = p000.AbstractC0312g7.m2262(r7)     // Catch: java.lang.Throwable -> L148
        L18a:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L148
            r10 = 10
            int r11 = p000.AbstractC1021yh.m6889(r7, r10)     // Catch: java.lang.Throwable -> L148
            int r11 = p000.ex0.m1970(r11)     // Catch: java.lang.Throwable -> L148
            r12 = 16
            if (r11 >= r12) goto L19b
            r11 = r12
        L19b:
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L148
        L1a2:
            boolean r11 = r7.hasNext()     // Catch: java.lang.Throwable -> L148
            if (r11 == 0) goto L210
            java.lang.Object r11 = r7.next()     // Catch: java.lang.Throwable -> L148
            r12 = r11
            od r12 = (p000.EnumC0619od) r12     // Catch: java.lang.Throwable -> L148
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L148
            r10.<init>()     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r20 = r1.iterator()     // Catch: java.lang.Throwable -> L148
        L1b8:
            boolean r21 = r20.hasNext()     // Catch: java.lang.Throwable -> L148
            if (r21 == 0) goto L1ea
            r47 = r1
            java.lang.Object r1 = r20.next()     // Catch: java.lang.Throwable -> L148
            r24 = r2
            r2 = r1
            ec1 r2 = (p000.ec1) r2     // Catch: java.lang.Throwable -> L148
            r29 = r3
            long r2 = r2.f3481     // Catch: java.lang.Throwable -> L148
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L148
            java.lang.Object r2 = r14.get(r2)     // Catch: java.lang.Throwable -> L148
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L148
            if (r2 == 0) goto L1e6
            boolean r2 = r2.contains(r12)     // Catch: java.lang.Throwable -> L148
            if (r2 != 0) goto L1e6
        L1df:
            r1 = r47
            r2 = r24
            r3 = r29
            goto L1b8
        L1e6:
            r10.add(r1)     // Catch: java.lang.Throwable -> L148
            goto L1df
        L1ea:
            r47 = r1
            r24 = r2
            r29 = r3
            long r26 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L148
            r21 = r10
            r20 = r12
            bc1 r1 = m2932(r20, r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L148
            r12 = r22
            r2 = r24
            r3 = r25
            r8.put(r11, r1)     // Catch: java.lang.Throwable -> L148
            r1 = r47
            r25 = r3
            r22 = r12
            r3 = r29
            r10 = 10
            goto L1a2
        L210:
            r47 = r1
            r29 = r3
            r12 = r22
            r3 = r25
            java.util.Collection r1 = r8.values()     // Catch: java.lang.Throwable -> L148
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L148
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L148
            r7.<init>()     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L148
        L227:
            boolean r10 = r1.hasNext()     // Catch: java.lang.Throwable -> L148
            if (r10 == 0) goto L239
            java.lang.Object r10 = r1.next()     // Catch: java.lang.Throwable -> L148
            bc1 r10 = (p000.bc1) r10     // Catch: java.lang.Throwable -> L148
            java.util.ArrayList r10 = r10.f1630     // Catch: java.lang.Throwable -> L148
            p000.AbstractC0984xh.m6660(r7, r10)     // Catch: java.lang.Throwable -> L148
            goto L227
        L239:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L148
            r1.<init>()     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L148
        L242:
            boolean r10 = r7.hasNext()     // Catch: java.lang.Throwable -> L148
            if (r10 == 0) goto L258
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L148
            ec1 r10 = (p000.ec1) r10     // Catch: java.lang.Throwable -> L148
            long r10 = r10.f3481     // Catch: java.lang.Throwable -> L148
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L148
            r1.add(r10)     // Catch: java.lang.Throwable -> L148
            goto L242
        L258:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L148
            r15.<init>()     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r7 = r47.iterator()     // Catch: java.lang.Throwable -> L148
        L261:
            boolean r10 = r7.hasNext()     // Catch: java.lang.Throwable -> L148
            if (r10 == 0) goto L286
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L148
            r11 = r10
            ec1 r11 = (p000.ec1) r11     // Catch: java.lang.Throwable -> L148
            r21 = r7
            r20 = r8
            long r7 = r11.f3481     // Catch: java.lang.Throwable -> L148
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L148
            boolean r7 = r1.contains(r7)     // Catch: java.lang.Throwable -> L148
            if (r7 == 0) goto L281
            r15.add(r10)     // Catch: java.lang.Throwable -> L148
        L281:
            r8 = r20
            r7 = r21
            goto L261
        L286:
            r20 = r8
            if (r43 == 0) goto L2a8
            int r1 = r43.ordinal()     // Catch: java.lang.Throwable -> L148
            if (r1 == 0) goto L2a2
            r7 = 1
            if (r1 == r7) goto L29f
            r8 = 2
            if (r1 != r8) goto L299
            java.lang.String r1 = "正在批量浇水"
            goto L2a5
        L299:
            pm r0 = new pm     // Catch: java.lang.Throwable -> L148
            r0.<init>()     // Catch: java.lang.Throwable -> L148
            throw r0     // Catch: java.lang.Throwable -> L148
        L29f:
            java.lang.String r1 = "正在批量种地"
            goto L2a5
        L2a2:
            r7 = 1
            java.lang.String r1 = "正在一键收菜"
        L2a5:
            r31 = r1
            goto L2ac
        L2a8:
            r7 = 1
            java.lang.String r1 = "正在执行自动营地任务"
            goto L2a5
        L2ac:
            java.util.Set r1 = r20.entrySet()     // Catch: java.lang.Throwable -> L148
            r32 = r1
            java.lang.Iterable r32 = (java.lang.Iterable) r32     // Catch: java.lang.Throwable -> L148
            java.lang.String r33 = "; "
            f71 r1 = new f71     // Catch: java.lang.Throwable -> L148
            r8 = 15
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L148
            r38 = 30
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = r1
            java.lang.String r1 = p000.AbstractC0984xh.m6644(r32, r33, r34, r35, r36, r37, r38)     // Catch: java.lang.Throwable -> L148
            if (r43 == 0) goto L2d2
            java.lang.String r8 = m2930(r43)     // Catch: java.lang.Throwable -> L148
            goto L2d4
        L2d2:
            r8 = r19
        L2d4:
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L148
            int r10 = r47.size()     // Catch: java.lang.Throwable -> L148
            int r11 = r15.size()     // Catch: java.lang.Throwable -> L148
            int r7 = r15.size()     // Catch: java.lang.Throwable -> L148
            r22 = r12
            r12 = 4
            int r7 = java.lang.Math.min(r12, r7)     // Catch: java.lang.Throwable -> L148
            int r12 = r3.f9332     // Catch: java.lang.Throwable -> L148
            r21 = r13
            int r13 = r2.f1620     // Catch: java.lang.Throwable -> L148
            java.lang.Integer r24 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L148
            if (r13 <= 0) goto L2f8
            goto L2fa
        L2f8:
            r24 = 0
        L2fa:
            if (r24 == 0) goto L306
            java.lang.String r13 = r24.toString()     // Catch: java.lang.Throwable -> L148
            if (r13 != 0) goto L303
            goto L306
        L303:
            r24 = r14
            goto L309
        L306:
            java.lang.String r13 = "unlimited"
            goto L303
        L309:
            int r14 = r3.f9333     // Catch: java.lang.Throwable -> L148
            r25 = r15
            int r15 = r2.f1621     // Catch: java.lang.Throwable -> L148
            java.lang.Integer r26 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L148
            if (r15 <= 0) goto L316
            goto L318
        L316:
            r26 = 0
        L318:
            if (r26 == 0) goto L324
            java.lang.String r15 = r26.toString()     // Catch: java.lang.Throwable -> L148
            if (r15 != 0) goto L321
            goto L324
        L321:
            r26 = r0
            goto L327
        L324:
            java.lang.String r15 = "unlimited"
            goto L321
        L327:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L148
            r0.<init>()     // Catch: java.lang.Throwable -> L148
            r27 = r3
            java.lang.String r3 = "批量计划 mode="
            r0.append(r3)     // Catch: java.lang.Throwable -> L148
            r0.append(r8)     // Catch: java.lang.Throwable -> L148
            java.lang.String r3 = " 发现会话="
            r0.append(r3)     // Catch: java.lang.Throwable -> L148
            r0.append(r4)     // Catch: java.lang.Throwable -> L148
            java.lang.String r3 = " 范围会话="
            r0.append(r3)     // Catch: java.lang.Throwable -> L148
            r0.append(r10)     // Catch: java.lang.Throwable -> L148
            java.lang.String r3 = " 任务会话="
            r0.append(r3)     // Catch: java.lang.Throwable -> L148
            r0.append(r11)     // Catch: java.lang.Throwable -> L148
            r0.append(r6)     // Catch: java.lang.Throwable -> L148
            r0.append(r1)     // Catch: java.lang.Throwable -> L148
            java.lang.String r1 = " 并发="
            r0.append(r1)     // Catch: java.lang.Throwable -> L148
            r0.append(r7)     // Catch: java.lang.Throwable -> L148
            java.lang.String r1 = " 今日限额=收获"
            r0.append(r1)     // Catch: java.lang.Throwable -> L148
            r0.append(r12)     // Catch: java.lang.Throwable -> L148
            r0.append(r5)     // Catch: java.lang.Throwable -> L148
            r0.append(r13)     // Catch: java.lang.Throwable -> L148
            java.lang.String r1 = ",种植"
            r0.append(r1)     // Catch: java.lang.Throwable -> L148
            r0.append(r14)     // Catch: java.lang.Throwable -> L148
            r0.append(r5)     // Catch: java.lang.Throwable -> L148
            r0.append(r15)     // Catch: java.lang.Throwable -> L148
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L148
            r1 = 0
            r3 = 4
            p000.C0888ux.m5992(r9, r0, r1, r3, r1)     // Catch: java.lang.Throwable -> L148
            java.util.Set r0 = r20.entrySet()     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L148
        L389:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L148
            if (r1 == 0) goto L3ee
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L148
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L148
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L148
            od r3 = (p000.EnumC0619od) r3     // Catch: java.lang.Throwable -> L148
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L148
            bc1 r1 = (p000.bc1) r1     // Catch: java.lang.Throwable -> L148
            java.lang.String r3 = m2930(r3)     // Catch: java.lang.Throwable -> L148
            int r4 = r1.f1636     // Catch: java.lang.Throwable -> L148
            int r5 = r1.f1637     // Catch: java.lang.Throwable -> L148
            int r7 = r1.f1638     // Catch: java.lang.Throwable -> L148
            java.lang.Integer r1 = r1.f1639     // Catch: java.lang.Throwable -> L148
            if (r1 == 0) goto L3b5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L148
            if (r1 != 0) goto L3b7
        L3b5:
            java.lang.String r1 = "unlimited"
        L3b7:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L148
            r8.<init>()     // Catch: java.lang.Throwable -> L148
            java.lang.String r10 = "计划明细 action="
            r8.append(r10)     // Catch: java.lang.Throwable -> L148
            r8.append(r3)     // Catch: java.lang.Throwable -> L148
            java.lang.String r3 = " 规则关闭="
            r8.append(r3)     // Catch: java.lang.Throwable -> L148
            r8.append(r4)     // Catch: java.lang.Throwable -> L148
            java.lang.String r3 = " 不可用="
            r8.append(r3)     // Catch: java.lang.Throwable -> L148
            r8.append(r5)     // Catch: java.lang.Throwable -> L148
            java.lang.String r3 = " 无候选="
            r8.append(r3)     // Catch: java.lang.Throwable -> L148
            r8.append(r7)     // Catch: java.lang.Throwable -> L148
            java.lang.String r3 = " 剩余限额="
            r8.append(r3)     // Catch: java.lang.Throwable -> L148
            r8.append(r1)     // Catch: java.lang.Throwable -> L148
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> L148
            r3 = 0
            r4 = 4
            p000.C0888ux.m5992(r9, r1, r3, r4, r3)     // Catch: java.lang.Throwable -> L148
            goto L389
        L3ee:
            r4 = 4
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L148
            r0.<init>()     // Catch: java.lang.Throwable -> L148
            java.util.Set r1 = r20.entrySet()     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L148
        L3fc:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L148
            if (r3 == 0) goto L44f
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L148
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L148
            java.lang.Object r5 = r3.getKey()     // Catch: java.lang.Throwable -> L148
            od r5 = (p000.EnumC0619od) r5     // Catch: java.lang.Throwable -> L148
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L148
            bc1 r3 = (p000.bc1) r3     // Catch: java.lang.Throwable -> L148
            java.util.LinkedHashMap r3 = r3.f1635     // Catch: java.lang.Throwable -> L148
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L148
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L148
        L41e:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L148
            if (r7 == 0) goto L3fc
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L148
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L148
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Throwable -> L148
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L148
            long r10 = r8.longValue()     // Catch: java.lang.Throwable -> L148
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L148
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L148
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L148
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L148
            l91 r10 = new l91     // Catch: java.lang.Throwable -> L148
            r10.<init>(r8, r5)     // Catch: java.lang.Throwable -> L148
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L148
            r0.put(r10, r7)     // Catch: java.lang.Throwable -> L148
            goto L41e
        L44f:
            db1 r8 = new db1     // Catch: java.lang.Throwable -> L148
            int r1 = r2.f1620     // Catch: java.lang.Throwable -> L148
            int r3 = r2.f1621     // Catch: java.lang.Throwable -> L148
            r5 = r27
            r8.<init>(r5, r1, r3, r0)     // Catch: java.lang.Throwable -> L148
            java.lang.Object r1 = r8.f3028     // Catch: java.lang.Throwable -> L148
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L148
            cb1 r0 = r8.m1686()     // Catch: java.lang.Throwable -> L613
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L148
            if (r26 == 0) goto L4b7
            gc1 r30 = new gc1     // Catch: java.lang.Throwable -> L148
            boolean r1 = r25.isEmpty()     // Catch: java.lang.Throwable -> L148
            if (r1 == 0) goto L471
            java.lang.String r1 = "当前没有符合条件的营地或地块"
        L46e:
            r32 = r1
            goto L48c
        L471:
            int r1 = r25.size()     // Catch: java.lang.Throwable -> L148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L148
            r3.<init>()     // Catch: java.lang.Throwable -> L148
            java.lang.String r5 = "已确认 "
            r3.append(r5)     // Catch: java.lang.Throwable -> L148
            r3.append(r1)     // Catch: java.lang.Throwable -> L148
            java.lang.String r1 = " 位人员进入任务"
            r3.append(r1)     // Catch: java.lang.Throwable -> L148
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L148
            goto L46e
        L48c:
            int r34 = r25.size()     // Catch: java.lang.Throwable -> L148
            int r1 = r0.f2053     // Catch: java.lang.Throwable -> L148
            boolean r3 = r25.isEmpty()     // Catch: java.lang.Throwable -> L148
            if (r3 != 0) goto L49f
            int r0 = r0.f2053     // Catch: java.lang.Throwable -> L148
            if (r0 != 0) goto L49f
            r39 = 1
            goto L4a1
        L49f:
            r39 = 0
        L4a1:
            r33 = 0
            r35 = 0
            r37 = 0
            r38 = 0
            r36 = r1
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch: java.lang.Throwable -> L148
            r0 = r30
            r1 = r26
            r1.invoke(r0)     // Catch: java.lang.Throwable -> L148
        L4b5:
            r3 = r4
            goto L4ba
        L4b7:
            r1 = r26
            goto L4b5
        L4ba:
            wb1 r4 = new wb1     // Catch: java.lang.Throwable -> L148
            r13 = r43
            r20 = r49
            r41 = r9
            r40 = r16
            r10 = r17
            r5 = r18
            r11 = r21
            r12 = r22
            r7 = r23
            r14 = r24
            r15 = r25
            r18 = r29
            r17 = r31
            r0 = 10
            r16 = r1
            r9 = r2
            r2 = r3
            r3 = r6
            r6 = r42
            r1 = r48
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L60d
            boolean r5 = r15.isEmpty()     // Catch: java.lang.Throwable -> L60d
            if (r5 != 0) goto L5a7
            int r5 = r15.size()     // Catch: java.lang.Throwable -> L5a3
            int r5 = java.lang.Math.min(r2, r5)     // Catch: java.lang.Throwable -> L5a3
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger     // Catch: java.lang.Throwable -> L5a3
            r10 = 0
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L5a3
            ho r7 = new ho     // Catch: java.lang.Throwable -> L5a3
            r9 = 1
            r7.<init>(r9, r6)     // Catch: java.lang.Throwable -> L5a3
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newFixedThreadPool(r5, r7)     // Catch: java.lang.Throwable -> L5a3
            r6 = 3
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L531
            int r0 = p000.AbstractC1021yh.m6889(r15, r0)     // Catch: java.lang.Throwable -> L531
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L531
            java.util.Iterator r0 = r15.iterator()     // Catch: java.lang.Throwable -> L531
            r10 = 0
        L512:
            boolean r11 = r0.hasNext()     // Catch: java.lang.Throwable -> L531
            if (r11 == 0) goto L53b
            java.lang.Object r11 = r0.next()     // Catch: java.lang.Throwable -> L531
            int r12 = r10 + 1
            if (r10 < 0) goto L535
            ec1 r11 = (p000.ec1) r11     // Catch: java.lang.Throwable -> L531
            gs r13 = new gs     // Catch: java.lang.Throwable -> L531
            r14 = 5
            r13.<init>(r10, r14, r4, r11)     // Catch: java.lang.Throwable -> L531
            java.util.concurrent.Future r10 = r5.submit(r13)     // Catch: java.lang.Throwable -> L531
            r9.add(r10)     // Catch: java.lang.Throwable -> L531
            r10 = r12
            goto L512
        L531:
            r0 = move-exception
            r10 = r41
            goto L58b
        L535:
            p000.AbstractC1021yh.m6917()     // Catch: java.lang.Throwable -> L531
            r28 = 0
            throw r28     // Catch: java.lang.Throwable -> L531
        L53b:
            java.util.Iterator r4 = r9.iterator()     // Catch: java.lang.Throwable -> L531
        L53f:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L531
            if (r0 == 0) goto L56c
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L531
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0     // Catch: java.lang.Throwable -> L531
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L550
            goto L557
        L550:
            r0 = move-exception
            eo1 r9 = new eo1     // Catch: java.lang.Throwable -> L531
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L531
            r0 = r9
        L557:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L531
            if (r0 == 0) goto L567
            java.lang.String r9 = "等待营地并行会话完成失败"
            r10 = r41
            p000.C0888ux.m5977(r10, r9, r0)     // Catch: java.lang.Throwable -> L565
            goto L569
        L565:
            r0 = move-exception
            goto L58b
        L567:
            r10 = r41
        L569:
            r41 = r10
            goto L53f
        L56c:
            r10 = r41
            r5.shutdown()     // Catch: java.lang.Throwable -> L57b
            boolean r0 = r5.awaitTermination(r6, r1)     // Catch: java.lang.Throwable -> L57b java.lang.InterruptedException -> L580
            if (r0 != 0) goto L5a9
            r5.shutdownNow()     // Catch: java.lang.Throwable -> L57b java.lang.InterruptedException -> L580
            goto L5a9
        L57b:
            r0 = move-exception
        L57c:
            r2 = r40
            goto L620
        L580:
            r5.shutdownNow()     // Catch: java.lang.Throwable -> L57b
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L57b
            r0.interrupt()     // Catch: java.lang.Throwable -> L57b
            goto L5a9
        L58b:
            r5.shutdown()     // Catch: java.lang.Throwable -> L57b
            boolean r1 = r5.awaitTermination(r6, r1)     // Catch: java.lang.Throwable -> L57b java.lang.InterruptedException -> L598
            if (r1 != 0) goto L5a2
            r5.shutdownNow()     // Catch: java.lang.Throwable -> L57b java.lang.InterruptedException -> L598
            goto L5a2
        L598:
            r5.shutdownNow()     // Catch: java.lang.Throwable -> L57b
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L57b
            r1.interrupt()     // Catch: java.lang.Throwable -> L57b
        L5a2:
            throw r0     // Catch: java.lang.Throwable -> L57b
        L5a3:
            r0 = move-exception
            r10 = r41
            goto L57c
        L5a7:
            r10 = r41
        L5a9:
            java.lang.Object r1 = r8.f3028     // Catch: java.lang.Throwable -> L57b
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L57b
            cb1 r0 = r8.m1686()     // Catch: java.lang.Throwable -> L606
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57b
            dc1 r29 = new dc1     // Catch: java.lang.Throwable -> L57b
            int r1 = r0.f2044     // Catch: java.lang.Throwable -> L57b
            int r4 = r0.f2045     // Catch: java.lang.Throwable -> L57b
            int r5 = r0.f2046     // Catch: java.lang.Throwable -> L57b
            int r6 = r0.f2047     // Catch: java.lang.Throwable -> L57b
            int r7 = r0.f2048     // Catch: java.lang.Throwable -> L57b
            int r8 = r0.f2049     // Catch: java.lang.Throwable -> L57b
            int r0 = r0.f2050     // Catch: java.lang.Throwable -> L57b
            boolean r37 = r20.get()     // Catch: java.lang.Throwable -> L57b
            r38 = 256(0x100, float:3.59E-43)
            r36 = r0
            r30 = r1
            r31 = r4
            r32 = r5
            r33 = r6
            r34 = r7
            r35 = r8
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch: java.lang.Throwable -> L57b
            if (r43 == 0) goto L5de
            java.lang.String r19 = m2930(r43)     // Catch: java.lang.Throwable -> L57b
        L5de:
            r0 = r19
            java.lang.String r1 = r29.m1696()     // Catch: java.lang.Throwable -> L57b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57b
            r4.<init>()     // Catch: java.lang.Throwable -> L57b
            java.lang.String r5 = "批量完成 mode="
            r4.append(r5)     // Catch: java.lang.Throwable -> L57b
            r4.append(r0)     // Catch: java.lang.Throwable -> L57b
            r4.append(r3)     // Catch: java.lang.Throwable -> L57b
            r4.append(r1)     // Catch: java.lang.Throwable -> L57b
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L57b
            r1 = 0
            p000.C0888ux.m5992(r10, r0, r1, r2, r1)     // Catch: java.lang.Throwable -> L57b
            r2 = r40
            r10 = 0
            r2.set(r10)
            goto L644
        L606:
            r0 = move-exception
            r2 = r40
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60b
            throw r0     // Catch: java.lang.Throwable -> L60b
        L60b:
            r0 = move-exception
            goto L620
        L60d:
            r0 = move-exception
            r2 = r40
            r10 = r41
            goto L620
        L613:
            r0 = move-exception
            r20 = r49
            r10 = r9
            r2 = r16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L60b
            throw r0     // Catch: java.lang.Throwable -> L60b
        L61b:
            r0 = move-exception
            r20 = r49
            goto Lbd
        L620:
            java.lang.String r1 = "营地批量任务异常"
            p000.C0888ux.m5977(r10, r1, r0)     // Catch: java.lang.Throwable -> L645
            dc1 r21 = new dc1     // Catch: java.lang.Throwable -> L645
            boolean r29 = r20.get()     // Catch: java.lang.Throwable -> L645
            r30 = 316(0x13c, float:4.43E-43)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch: java.lang.Throwable -> L645
            r10 = 0
            r2.set(r10)
            r29 = r21
        L644:
            return r29
        L645:
            r0 = move-exception
            r10 = 0
            r2.set(r10)
            throw r0
        L64b:
            dc1 r11 = new dc1
            r19 = 0
            r20 = 444(0x1bc, float:6.22E-43)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r11
    }

    /* JADX INFO: renamed from: ζ */
    public static final p000.s62 m2935(java.lang.String r46, java.lang.ClassLoader r47, java.util.List r48, p000.db1 r49, p000.bb1 r50, java.util.LinkedHashMap r51, p000.ae1 r52, p000.C0720qd r53, p000.EnumC0619od r54, java.util.Map r55, java.util.ArrayList r56, p000.a80 r57, java.lang.String r58, java.util.Map r59, int r60, p000.ec1 r61) {
            r0 = r47
            r3 = r48
            r12 = r50
            r14 = r53
            r4 = r54
            r15 = r59
            r5 = r61
            java.lang.String r1 = " smartMaxPrice="
            java.lang.String r2 = " coin="
            java.lang.String r6 = " mode="
            java.lang.String r7 = " source="
            java.lang.String r8 = "种植决策 name="
            java.lang.String r9 = "，收益 "
            java.lang.String r10 = "（价格 "
            xn0 r11 = p000.xn0.f12236
            r16 = r1
            java.lang.String r1 = " 块"
            r17 = r2
            java.lang.String r2 = " 块，今日剩余限额 "
            java.lang.String r18 = "不限制"
            java.lang.String r13 = " shortId="
            r19 = r13
            java.lang.String r13 = "r7ce9b41b1577bc7d"
            java.lang.String r20 = "未知"
            r21 = r13
            java.lang.String r13 = "种子 "
            r22 = r13
            java.lang.String r13 = " 块作物"
            s62 r23 = p000.s62.f9751
            r5.getClass()
            r24 = r6
            od[] r6 = p000.EnumC0619od.values()
            r25 = r13
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r26 = r7
            int r7 = r6.length
            int r7 = p000.ex0.m1970(r7)
            r27 = r8
            r8 = 16
            if (r7 >= r8) goto L55
            r7 = r8
        L55:
            r13.<init>(r7)
            int r7 = r6.length
            r29 = r1
            r8 = 0
        L5c:
            if (r8 >= r7) goto La6
            r30 = 1
            r1 = r6[r8]
            if (r4 == 0) goto L6c
            if (r4 != r1) goto L67
            goto L6c
        L67:
            r31 = r6
            r6 = r55
            goto L94
        L6c:
            long r31 = r5.m1898()
            java.lang.Long r4 = java.lang.Long.valueOf(r31)
            r31 = r6
            r6 = r55
            java.lang.Object r4 = r6.get(r4)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L87
            boolean r4 = r4.contains(r1)
            if (r4 != 0) goto L87
            goto L94
        L87:
            sd r4 = r5.f3486
            boolean r5 = r14.m4864(r1)
            boolean r4 = r4.m5470(r1, r5)
            if (r4 == 0) goto L94
            goto L96
        L94:
            r30 = 0
        L96:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r30)
            r13.put(r1, r4)
            int r8 = r8 + 1
            r4 = r54
            r5 = r61
            r6 = r31
            goto L5c
        La6:
            r30 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r4 = 0
            r1.<init>(r4)
            boolean r5 = m2928(r46)     // Catch: java.lang.Throwable -> Lcb
            if (r5 != 0) goto Ld38
            java.util.Collection r5 = r13.values()     // Catch: java.lang.Throwable -> Ld21
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> Ld21
            boolean r6 = r5 instanceof java.util.Collection     // Catch: java.lang.Throwable -> Ld21
            if (r6 == 0) goto Ld6
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> Lcb
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> Lcb
            if (r6 == 0) goto Ld6
        Lc7:
            r28 = r13
            goto Ld2b
        Lcb:
            r0 = move-exception
            r24 = r1
            r28 = r13
        Ld0:
            r2 = r19
            r6 = r21
            goto Ld3e
        Ld6:
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Ld21
        Lda:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> Ld21
            if (r6 == 0) goto Lc7
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> Ld21
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Ld21
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Ld21
            if (r6 == 0) goto Ld0f
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> Ld0b
            r5.<init>()     // Catch: java.lang.Throwable -> Ld0b
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> Ld0b
            r6.<init>()     // Catch: java.lang.Throwable -> Ld0b
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> Ld0b
            r7.<init>()     // Catch: java.lang.Throwable -> Ld0b
            r8 = r11
            java.lang.String r11 = "正在查询实时营地"
            r39 = r5
            r40 = r6
            r41 = r7
            r38 = r8
            r36 = r9
            r37 = r10
            r28 = r13
            r33 = r24
            r34 = r26
            r35 = r27
            r7 = r54
            r6 = r56
            r9 = r57
            r10 = r58
            r5 = r60
            r8 = r61
            r13 = r4
            r4 = r49
            m2938(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Ld02
            r5 = r8
            java.lang.Object r4 = m2933(r0, r5)     // Catch: java.lang.Throwable -> Ld02
            java.lang.Throwable r6 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> Ld02
            if (r6 != 0) goto Lcbc
            vc1 r4 = (p000.vc1) r4     // Catch: java.lang.Throwable -> Lcb8
            zd1 r6 = m2941(r0, r4, r5, r3)     // Catch: java.lang.Throwable -> Lcb8
            if (r6 != 0) goto L1df
            xn0 r0 = p000.xn0.f12237     // Catch: java.lang.Throwable -> L1d6
            java.util.Map r0 = r0.m6762()     // Catch: java.lang.Throwable -> L1d6
            long r2 = r5.m1898()     // Catch: java.lang.Throwable -> L1d6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L1d6
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L1d6
            id r0 = (p000.C0392id) r0     // Catch: java.lang.Throwable -> L1d6
            if (r0 == 0) goto L157
            pd r7 = r0.m2741()     // Catch: java.lang.Throwable -> L152
            goto L158
        L152:
            r0 = move-exception
            r24 = r1
            goto Ld0
        L157:
            r7 = 0
        L158:
            pd r0 = p000.EnumC0683pd.f8504     // Catch: java.lang.Throwable -> L1d6
            if (r7 == r0) goto L160
            pd r0 = p000.EnumC0683pd.f8503     // Catch: java.lang.Throwable -> L18b
            if (r7 != r0) goto L164
        L160:
            r9 = r1
            r1 = r49
            goto L190
        L164:
            r49.m1684()     // Catch: java.lang.Throwable -> L18b
            java.lang.String r8 = "实时状态查询失败"
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r9 = r1
            r1 = r49
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L186
            r2 = r1
        L17a:
            r7 = r56
            r5 = r57
            r6 = r58
            r3 = r61
            r1 = r9
            r4 = r28
            goto L1b1
        L186:
            r0 = move-exception
        L187:
            r24 = r9
            goto Ld0
        L18b:
            r0 = move-exception
            r9 = r1
            r1 = r49
            goto L187
        L190:
            java.lang.Object r2 = r1.f3028     // Catch: java.lang.Throwable -> L1cb
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L1cb
            int r0 = r1.f3039     // Catch: java.lang.Throwable -> L1c0
            int r0 = r0 + 1
            r1.f3039 = r0     // Catch: java.lang.Throwable -> L1c0
            r1.m1686()     // Catch: java.lang.Throwable -> L1c0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1cb
            java.lang.String r8 = "实时确认无小火人或无营地，已正常跳过"
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r5 = r61
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1b5
            r2 = r49
            goto L17a
        L1b1:
            m2937(r1, r2, r3, r4, r5, r6, r7)
            return r23
        L1b5:
            r0 = move-exception
        L1b6:
            r24 = r9
            r8 = r28
            goto Ld0
        L1bc:
            r0 = move-exception
            r5 = r61
            goto L1b6
        L1c0:
            r0 = move-exception
            r5 = r61
            r24 = r9
            r8 = r28
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c9
            throw r0     // Catch: java.lang.Throwable -> L1c9
        L1c9:
            r0 = move-exception
            goto L1d2
        L1cb:
            r0 = move-exception
            r5 = r61
            r24 = r9
            r8 = r28
        L1d2:
            r28 = r8
            goto Ld0
        L1d6:
            r0 = move-exception
            r24 = r1
            r8 = r28
            r1 = r49
            goto Ld0
        L1df:
            r24 = r1
            r8 = r28
            r1 = r49
            zd1 r9 = m2936(r15, r5, r6)     // Catch: java.lang.Throwable -> Lcb4
            java.util.List r9 = r9.m7129()     // Catch: java.lang.Throwable -> Lcb4
            int r9 = r9.size()     // Catch: java.lang.Throwable -> Lcb4
            r1.m1683(r9)     // Catch: java.lang.Throwable -> Lcb4
            od r9 = p000.EnumC0619od.f8034     // Catch: java.lang.Throwable -> Lcb4
            java.lang.Object r10 = r8.get(r9)     // Catch: java.lang.Throwable -> Lcb4
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lcb4
            boolean r10 = p000.ln0.m3626(r10, r11)     // Catch: java.lang.Throwable -> Lcb4
            if (r10 == 0) goto L41f
            zd1 r10 = m2936(r15, r5, r6)     // Catch: java.lang.Throwable -> L417
            rc1 r11 = r1.m1681()     // Catch: java.lang.Throwable -> L417
            qc1 r26 = p000.qc1.f8961     // Catch: java.lang.Throwable -> L417
            java.util.List r26 = p000.qc1.m4855(r10, r12, r11)     // Catch: java.lang.Throwable -> L417
            r28 = r8
            long r7 = r5.m1898()     // Catch: java.lang.Throwable -> L3ed
            int r13 = r26.size()     // Catch: java.lang.Throwable -> L3ed
            r1.m1682(r7, r9, r13)     // Catch: java.lang.Throwable -> L3ed
            int r7 = r12.m844()     // Catch: java.lang.Throwable -> L3ed
            int r8 = r11.m5079()     // Catch: java.lang.Throwable -> L3ed
            java.lang.Integer r7 = p000.qc1.m4858(r7, r8)     // Catch: java.lang.Throwable -> L3ed
            java.util.ArrayList r8 = r10.m7126()     // Catch: java.lang.Throwable -> L3ed
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L3ed
            if (r7 == 0) goto L23d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L23a
            if (r7 != 0) goto L23f
            goto L23d
        L23a:
            r0 = move-exception
            goto Ld0
        L23d:
            r7 = r18
        L23f:
            int r9 = r26.size()     // Catch: java.lang.Throwable -> L3ed
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3ed
            r10.<init>()     // Catch: java.lang.Throwable -> L3ed
            java.lang.String r11 = "成熟 "
            r10.append(r11)     // Catch: java.lang.Throwable -> L3ed
            r10.append(r8)     // Catch: java.lang.Throwable -> L3ed
            r10.append(r2)     // Catch: java.lang.Throwable -> L3ed
            r10.append(r7)     // Catch: java.lang.Throwable -> L3ed
            java.lang.String r7 = "，准备收获 "
            r10.append(r7)     // Catch: java.lang.Throwable -> L3ed
            r10.append(r9)     // Catch: java.lang.Throwable -> L3ed
            r13 = r29
            r10.append(r13)     // Catch: java.lang.Throwable -> L3ed
            java.lang.String r11 = r10.toString()     // Catch: java.lang.Throwable -> L3ed
            r7 = r54
            r9 = r57
            r10 = r58
            r8 = r5
            r29 = r13
            r5 = r60
            r13 = r4
            r4 = r1
            r1 = r6
            r6 = r56
            m2938(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L413
            java.util.Iterator r26 = r26.iterator()     // Catch: java.lang.Throwable -> L40e
            r8 = 0
            r31 = 0
        L281:
            boolean r5 = r26.hasNext()     // Catch: java.lang.Throwable -> L40e
            if (r5 == 0) goto L3a2
            java.lang.Object r5 = r26.next()     // Catch: java.lang.Throwable -> L2ba
            lc1 r5 = (p000.lc1) r5     // Catch: java.lang.Throwable -> L2ba
            boolean r6 = m2928(r46)     // Catch: java.lang.Throwable -> L2ba
            if (r6 != 0) goto L3a2
            od r7 = p000.EnumC0619od.f8034     // Catch: java.lang.Throwable -> L2ba
            boolean r6 = r4.m1687(r7)     // Catch: java.lang.Throwable -> L2ba
            if (r6 != 0) goto L2be
            java.lang.String r11 = "今日收获限额已被其它并行会话用完"
            r7 = r54
            r6 = r56
            r9 = r57
            r10 = r58
            r5 = r60
            r32 = r1
            r1 = r8
            r8 = r61
            m2938(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2ba
            r10 = r4
        L2b0:
            r9 = r25
            r25 = r39
            r39 = r2
            r2 = r52
            goto L3a8
        L2ba:
            r0 = move-exception
            r10 = r4
            goto Ld0
        L2be:
            r32 = r1
            r10 = r4
            r1 = r8
            int r31 = r31 + 1
            long r8 = r12.f1622     // Catch: java.lang.Throwable -> L23a
            r42 = r8
            xb1 r9 = new xb1     // Catch: java.lang.Throwable -> L23a
            r4 = 0
            r9.<init>(r0, r13, r5, r4)     // Catch: java.lang.Throwable -> L23a
            r6 = r61
            r8 = r5
            r4 = r42
            hc1 r4 = m2948(r4, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L23a
            int r1 = r1 + 1
            boolean r5 = r4.m2489()     // Catch: java.lang.Throwable -> L23a
            cb1 r5 = r10.m1680(r7, r5)     // Catch: java.lang.Throwable -> L23a
            boolean r4 = r4.m2489()     // Catch: java.lang.Throwable -> L23a
            if (r4 == 0) goto L372
            java.lang.String r4 = r8.f6544     // Catch: java.lang.Throwable -> L23a
            r6 = r39
            r6.add(r4)     // Catch: java.lang.Throwable -> L23a
            java.lang.Integer r4 = r8.m3547()     // Catch: java.lang.Throwable -> L23a
            if (r4 == 0) goto L309
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L23a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L23a
            r7 = r51
            java.lang.Object r4 = r7.get(r4)     // Catch: java.lang.Throwable -> L23a
            id1 r4 = (p000.id1) r4     // Catch: java.lang.Throwable -> L23a
            if (r4 == 0) goto L30b
            java.lang.Integer r4 = r4.f5020     // Catch: java.lang.Throwable -> L23a
            goto L30c
        L309:
            r7 = r51
        L30b:
            r4 = 0
        L30c:
            boolean r8 = r8.m3548()     // Catch: java.lang.Throwable -> L23a
            if (r4 == 0) goto L334
            int r9 = r4.intValue()     // Catch: java.lang.Throwable -> L23a
            if (r9 < 0) goto L319
            goto L31a
        L319:
            r4 = 0
        L31a:
            if (r4 == 0) goto L334
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L23a
            r42 = r1
            r39 = r2
            long r1 = (long) r4     // Catch: java.lang.Throwable -> L23a
            if (r8 == 0) goto L32f
            r8 = 2
            long r1 = r1 * r8
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L23a
            goto L339
        L32f:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L23a
            goto L339
        L334:
            r42 = r1
            r39 = r2
            r1 = 0
        L339:
            if (r52 == 0) goto L341
            r2 = r52
            p000.ae1.m93(r2, r1)     // Catch: java.lang.Throwable -> L23a
            goto L343
        L341:
            r2 = r52
        L343:
            int r1 = r5.m1174()     // Catch: java.lang.Throwable -> L23a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23a
            r4.<init>()     // Catch: java.lang.Throwable -> L23a
            java.lang.String r5 = "已收获 "
            r4.append(r5)     // Catch: java.lang.Throwable -> L23a
            r4.append(r1)     // Catch: java.lang.Throwable -> L23a
            r1 = r25
            r4.append(r1)     // Catch: java.lang.Throwable -> L23a
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Throwable -> L23a
            r7 = r54
            r9 = r57
            r5 = r60
            r8 = r61
            r25 = r6
            r4 = r10
            r6 = r56
            r10 = r58
            m2938(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L23a
            r10 = r49
            goto L390
        L372:
            r42 = r1
            r1 = r25
            r25 = r39
            r39 = r2
            r2 = r52
            java.lang.String r11 = "收获失败，继续处理后续地块"
            r4 = r49
            r7 = r54
            r6 = r56
            r9 = r57
            r10 = r58
            r5 = r60
            r8 = r61
            m2938(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L2ba
            r10 = r4
        L390:
            r4 = r10
            r2 = r39
            r8 = r42
            r39 = r25
            r25 = r1
            r1 = r32
            goto L281
        L39d:
            r0 = move-exception
            r10 = r49
            goto Ld0
        L3a2:
            r32 = r1
            r10 = r4
            r1 = r8
            goto L2b0
        L3a8:
            long r4 = r61.m1898()     // Catch: java.lang.Throwable -> L3f4
            od r6 = p000.EnumC0619od.f8034     // Catch: java.lang.Throwable -> L3f4
            r10.m1682(r4, r6, r1)     // Catch: java.lang.Throwable -> L3f4
            if (r1 <= 0) goto L401
            java.lang.String r4 = "after_harvest"
            r2 = r61
            r1 = r13
            r11 = r16
            r5 = r25
            r8 = r29
            zd1 r6 = m2940(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3fe
            r16 = r1
            if (r6 != 0) goto L3f8
            r10.m1684()     // Catch: java.lang.Throwable -> L3f4
            java.lang.String r8 = "收获后刷新失败"
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r5 = r61
            r1 = r10
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3ed
            r2 = r49
            r7 = r56
            r5 = r57
            r6 = r58
            r3 = r61
            r1 = r24
            r4 = r28
            m2937(r1, r2, r3, r4, r5, r6, r7)
            return r23
        L3ed:
            r0 = move-exception
            r10 = r1
            r1 = r5
        L3f0:
            r2 = r28
            goto Ld0
        L3f4:
            r0 = move-exception
            r1 = r61
            goto L3f0
        L3f8:
            r1 = r61
            r2 = r28
            r0 = r6
            goto L432
        L3fe:
            r0 = move-exception
            r1 = r2
            goto L3f0
        L401:
            r1 = r61
            r11 = r16
            r2 = r28
            r8 = r29
            r16 = r13
            r0 = r32
            goto L432
        L40e:
            r0 = move-exception
            r1 = r61
            r10 = r4
            goto L3f0
        L413:
            r0 = move-exception
            r10 = r4
            r1 = r8
            goto L3f0
        L417:
            r0 = move-exception
            r10 = r1
            r1 = r5
            r2 = r8
            r28 = r2
            goto Ld0
        L41f:
            r10 = r1
            r39 = r2
            r1 = r5
            r32 = r6
            r2 = r8
            r11 = r16
            r9 = r25
            r8 = r29
            r16 = r4
            r0 = r32
            r31 = 0
        L432:
            od r3 = p000.EnumC0619od.f8035     // Catch: java.lang.Throwable -> Lcab
            java.lang.Object r4 = r2.get(r3)     // Catch: java.lang.Throwable -> Lcab
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lcab
            boolean r4 = p000.ln0.m3626(r4, r5)     // Catch: java.lang.Throwable -> Lcab
            if (r4 == 0) goto Lb33
            r4 = r2
            zd1 r2 = m2936(r15, r1, r0)     // Catch: java.lang.Throwable -> Lb26
            long r5 = r1.m1898()     // Catch: java.lang.Throwable -> Lb26
            r7 = r2
            r51 = r3
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb26
            r28 = r4
            r4 = r38
            java.util.Set r2 = r4.m6765(r5, r2)     // Catch: java.lang.Throwable -> Lb23
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> Lb23
            java.util.Set r5 = p000.AbstractC0984xh.m6670(r2)     // Catch: java.lang.Throwable -> Lb23
            r32 = r0
            qc1 r0 = p000.qc1.f8961     // Catch: java.lang.Throwable -> Lb23
            sd r4 = r1.f3486     // Catch: java.lang.Throwable -> Lb23
            r2 = r7
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb23
            r1 = r48
            r25 = r9
            r3 = r14
            r13 = r30
            r14 = r32
            r15 = r39
            r9 = r51
            oc1 r0 = r0.m4861(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lb1c
            r1 = r2
            id1 r2 = r0.f8028     // Catch: java.lang.Throwable -> Lb1c
            if (r2 == 0) goto L9c5
            java.lang.Long r26 = p000.qc1.m4853(r1)     // Catch: java.lang.Throwable -> L9c2
            rc1 r4 = r10.m1681()     // Catch: java.lang.Throwable -> L9c2
            java.util.ArrayList r6 = r1.m7123()     // Catch: java.lang.Throwable -> L9c2
            int r7 = p000.qc1.m4857(r1, r12, r4, r2)     // Catch: java.lang.Throwable -> L9c2
            java.util.List r29 = p000.AbstractC0984xh.m6662(r6, r7)     // Catch: java.lang.Throwable -> L9c2
            long r6 = r61.m1898()     // Catch: java.lang.Throwable -> L9c2
            int r3 = r29.size()     // Catch: java.lang.Throwable -> L9c2
            r10.m1682(r6, r9, r3)     // Catch: java.lang.Throwable -> L9c2
            int r3 = p000.qc1.m4852(r1, r2)     // Catch: java.lang.Throwable -> L9c2
            int r6 = r12.m845()     // Catch: java.lang.Throwable -> L9c2
            int r4 = r4.f9333     // Catch: java.lang.Throwable -> L9c2
            java.lang.Integer r4 = p000.qc1.m4858(r6, r4)     // Catch: java.lang.Throwable -> L9c2
            java.lang.String r6 = r0.f8030     // Catch: java.lang.Throwable -> L9c2
            java.lang.String r7 = r2.f5016     // Catch: java.lang.Throwable -> L9c2
            if (r7 != 0) goto L4c8
            int r7 = r2.m2742()     // Catch: java.lang.Throwable -> L23a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23a
            r9.<init>()     // Catch: java.lang.Throwable -> L23a
            r13 = r22
            r9.append(r13)     // Catch: java.lang.Throwable -> L23a
            r9.append(r7)     // Catch: java.lang.Throwable -> L23a
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L23a
            goto L4ca
        L4c8:
            r13 = r22
        L4ca:
            java.lang.Integer r9 = r2.f5019     // Catch: java.lang.Throwable -> L9c2
            if (r9 != 0) goto L4d0
            r9 = r20
        L4d0:
            r22 = r1
            java.lang.Integer r1 = r2.f5020     // Catch: java.lang.Throwable -> L9c2
            if (r1 != 0) goto L4d8
            r1 = r20
        L4d8:
            java.util.ArrayList r32 = r22.m7123()     // Catch: java.lang.Throwable -> L9c2
            r38 = r2
            int r2 = r32.size()     // Catch: java.lang.Throwable -> L9c2
            if (r4 == 0) goto L4ee
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L23a
            if (r4 != 0) goto L4eb
            goto L4ee
        L4eb:
            r32 = r5
            goto L4f1
        L4ee:
            r4 = r18
            goto L4eb
        L4f1:
            int r5 = r29.size()     // Catch: java.lang.Throwable -> L9c2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b7
            r10.<init>()     // Catch: java.lang.Throwable -> L9b7
            r10.append(r6)     // Catch: java.lang.Throwable -> L9b7
            java.lang.String r6 = "选择 "
            r10.append(r6)     // Catch: java.lang.Throwable -> L9b7
            r10.append(r7)     // Catch: java.lang.Throwable -> L9b7
            r6 = r37
            r10.append(r6)     // Catch: java.lang.Throwable -> L9b7
            r10.append(r9)     // Catch: java.lang.Throwable -> L9b7
            r9 = r36
            r10.append(r9)     // Catch: java.lang.Throwable -> L9b7
            r10.append(r1)     // Catch: java.lang.Throwable -> L9b7
            java.lang.String r1 = "）；空闲 "
            r10.append(r1)     // Catch: java.lang.Throwable -> L9b7
            r10.append(r2)     // Catch: java.lang.Throwable -> L9b7
            java.lang.String r1 = " 块，金币可购买 "
            r10.append(r1)     // Catch: java.lang.Throwable -> L9b7
            r10.append(r3)     // Catch: java.lang.Throwable -> L9b7
            r10.append(r15)     // Catch: java.lang.Throwable -> L9b7
            r10.append(r4)     // Catch: java.lang.Throwable -> L9b7
            java.lang.String r1 = "，准备种植 "
            r10.append(r1)     // Catch: java.lang.Throwable -> L9b7
            r10.append(r5)     // Catch: java.lang.Throwable -> L9b7
            r10.append(r8)     // Catch: java.lang.Throwable -> L9b7
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> L9b7
            r1 = r49
            r15 = r53
            r4 = r54
            r3 = r56
            r7 = r58
            r2 = r60
            r5 = r61
            r44 = r6
            r36 = r9
            r9 = r17
            r10 = r38
            r6 = r57
            r17 = r13
            r13 = 4
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9c0
            java.lang.String r2 = m2951(r5)     // Catch: java.lang.Throwable -> L9b7
            long r3 = r5.m1898()     // Catch: java.lang.Throwable -> L9b7
            java.lang.String r6 = r0.f8030     // Catch: java.lang.Throwable -> L9b7
            td r7 = r0.f8029     // Catch: java.lang.Throwable -> L9b7
            int r8 = r10.m2742()     // Catch: java.lang.Throwable -> L9b7
            java.lang.Integer r13 = r10.f5019     // Catch: java.lang.Throwable -> L9b7
            java.lang.Integer r12 = r10.f5020     // Catch: java.lang.Throwable -> L9b7
            r38 = r10
            java.lang.String r10 = r14.f13053     // Catch: java.lang.Throwable -> L9b7
            r37 = r14
            int r14 = r15.f8968     // Catch: java.lang.Throwable -> L9b7
            sd r15 = r5.f3486     // Catch: java.lang.Throwable -> L9b7
            java.util.Set r15 = r15.f9842     // Catch: java.lang.Throwable -> L9b7
            java.lang.Iterable r15 = (java.lang.Iterable) r15     // Catch: java.lang.Throwable -> L9b7
            java.util.List r15 = p000.AbstractC0984xh.m6657(r15)     // Catch: java.lang.Throwable -> L9b7
            java.util.List r5 = p000.AbstractC0984xh.m6657(r32)     // Catch: java.lang.Throwable -> L9b7
            int r1 = r29.size()     // Catch: java.lang.Throwable -> L9b7
            r18 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b7
            r1.<init>()     // Catch: java.lang.Throwable -> L9b7
            r39 = r5
            r5 = r35
            r1.append(r5)     // Catch: java.lang.Throwable -> L9b7
            r1.append(r2)     // Catch: java.lang.Throwable -> L9b7
            r2 = r19
            r1.append(r2)     // Catch: java.lang.Throwable -> L9af
            r1.append(r3)     // Catch: java.lang.Throwable -> L9af
            r3 = r34
            r1.append(r3)     // Catch: java.lang.Throwable -> L9af
            r1.append(r6)     // Catch: java.lang.Throwable -> L9af
            r4 = r33
            r1.append(r4)     // Catch: java.lang.Throwable -> L9af
            r1.append(r7)     // Catch: java.lang.Throwable -> L9af
            java.lang.String r3 = " seedId="
            r1.append(r3)     // Catch: java.lang.Throwable -> L9af
            r1.append(r8)     // Catch: java.lang.Throwable -> L9af
            java.lang.String r3 = " price="
            r1.append(r3)     // Catch: java.lang.Throwable -> L9af
            r1.append(r13)     // Catch: java.lang.Throwable -> L9af
            java.lang.String r3 = " income="
            r1.append(r3)     // Catch: java.lang.Throwable -> L9af
            r1.append(r12)     // Catch: java.lang.Throwable -> L9af
            r1.append(r9)     // Catch: java.lang.Throwable -> L9af
            r1.append(r10)     // Catch: java.lang.Throwable -> L9af
            r1.append(r11)     // Catch: java.lang.Throwable -> L9af
            r1.append(r14)     // Catch: java.lang.Throwable -> L9af
            java.lang.String r3 = " excluded="
            r1.append(r3)     // Catch: java.lang.Throwable -> L9af
            r1.append(r15)     // Catch: java.lang.Throwable -> L9af
            java.lang.String r3 = " activityRejected="
            r1.append(r3)     // Catch: java.lang.Throwable -> L9af
            r3 = r39
            r1.append(r3)     // Catch: java.lang.Throwable -> L9af
            java.lang.String r3 = " candidates="
            r1.append(r3)     // Catch: java.lang.Throwable -> L9af
            r3 = r18
            r1.append(r3)     // Catch: java.lang.Throwable -> L9af
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9af
            r10 = r21
            r3 = 0
            r13 = 4
            p000.C0888ux.m5992(r10, r1, r3, r13, r3)     // Catch: java.lang.Throwable -> L9a1
            r9 = r0
            r14 = r29
            r0 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L601:
            int r1 = r14.size()     // Catch: java.lang.Throwable -> L9a1
            if (r11 >= r1) goto L999
            if (r12 != 0) goto L999
            boolean r1 = m2928(r46)     // Catch: java.lang.Throwable -> L9a1
            if (r1 != 0) goto L999
            if (r0 != 0) goto L657
            od r1 = p000.EnumC0619od.f8035     // Catch: java.lang.Throwable -> L652
            r4 = r49
            boolean r3 = r4.m1687(r1)     // Catch: java.lang.Throwable -> L647
            if (r3 != 0) goto L64d
            java.util.List r14 = p000.AbstractC0984xh.m6662(r14, r11)     // Catch: java.lang.Throwable -> L647
            long r5 = r61.m1898()     // Catch: java.lang.Throwable -> L647
            int r3 = r14.size()     // Catch: java.lang.Throwable -> L647
            r4.m1682(r5, r1, r3)     // Catch: java.lang.Throwable -> L647
            java.lang.String r8 = "今日种植限额已被其它并行会话用完"
            r3 = r56
            r6 = r57
            r7 = r58
            r5 = r61
            r15 = r2
            r1 = r4
            r4 = r54
            r2 = r60
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L641
            r6 = r1
            r2 = r15
            r12 = 1
            goto L601
        L641:
            r0 = move-exception
            r6 = r1
        L643:
            r6 = r10
        L644:
            r2 = r15
            goto Ld3e
        L647:
            r0 = move-exception
            r15 = r2
            r6 = r4
        L64a:
            r6 = r10
            goto Ld3e
        L64d:
            r6 = r4
            r18 = 1
        L650:
            r15 = r2
            goto L65c
        L652:
            r0 = move-exception
            r6 = r49
        L655:
            r15 = r2
            goto L64a
        L657:
            r6 = r49
            r18 = r0
            goto L650
        L65c:
            java.lang.Object r0 = r14.get(r11)     // Catch: java.lang.Throwable -> L995
            r3 = r0
            lc1 r3 = (p000.lc1) r3     // Catch: java.lang.Throwable -> L995
            int r31 = r31 + 1
            int r13 = r13 + 1
            r7 = r50
            long r0 = r7.f1622     // Catch: java.lang.Throwable -> L995
            od r8 = p000.EnumC0619od.f8035     // Catch: java.lang.Throwable -> L995
            xb0 r5 = new xb0     // Catch: java.lang.Throwable -> L995
            r1 = r0
            r0 = r5
            r5 = 3
            r33 = r1
            r2 = r16
            r4 = r38
            r1 = r47
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L995
            r1 = r4
            r4 = r3
            r3 = r8
            r8 = r1
            r2 = r61
            r5 = r0
            r0 = r33
            hc1 r0 = m2948(r0, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L995
            r1 = r3
            r3 = r4
            boolean r2 = r0.m2489()     // Catch: java.lang.Throwable -> L995
            if (r2 == 0) goto L733
            r2 = 1
            cb1 r0 = r6.m1680(r1, r2)     // Catch: java.lang.Throwable -> L72d
            java.lang.String r1 = r3.f6544     // Catch: java.lang.Throwable -> L72d
            r2 = r40
            r2.add(r1)     // Catch: java.lang.Throwable -> L72d
            if (r52 == 0) goto L6c2
            java.lang.Integer r1 = r8.f5019     // Catch: java.lang.Throwable -> L6ba
            if (r1 == 0) goto L6bc
            int r3 = r1.intValue()     // Catch: java.lang.Throwable -> L6ba
            if (r3 < 0) goto L6ab
            goto L6ac
        L6ab:
            r1 = 0
        L6ac:
            if (r1 == 0) goto L6bc
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L6ba
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L6ba
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L6ba
        L6b7:
            r3 = r52
            goto L6be
        L6ba:
            r0 = move-exception
            goto L643
        L6bc:
            r1 = 0
            goto L6b7
        L6be:
            p000.ae1.m94(r3, r1)     // Catch: java.lang.Throwable -> L6ba
            goto L6c4
        L6c2:
            r3 = r52
        L6c4:
            java.lang.Integer r1 = r8.f5019     // Catch: java.lang.Throwable -> L72d
            if (r1 == 0) goto L6e8
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L6ba
            if (r26 == 0) goto L6df
            long r4 = r26.longValue()     // Catch: java.lang.Throwable -> L6ba
            r40 = r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L6ba
            long r4 = r4 - r1
            long r1 = p000.j81.m2903(r4)     // Catch: java.lang.Throwable -> L6ba
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L6ba
            goto L6e2
        L6df:
            r40 = r2
            r1 = 0
        L6e2:
            if (r1 != 0) goto L6e5
            goto L6ea
        L6e5:
            r26 = r1
            goto L6ea
        L6e8:
            r40 = r2
        L6ea:
            int r11 = r11 + 1
            int r0 = r0.m1175()     // Catch: java.lang.Throwable -> L72d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72d
            r1.<init>()     // Catch: java.lang.Throwable -> L72d
            java.lang.String r2 = "已种植 "
            r1.append(r2)     // Catch: java.lang.Throwable -> L72d
            r1.append(r0)     // Catch: java.lang.Throwable -> L72d
            r0 = r25
            r1.append(r0)     // Catch: java.lang.Throwable -> L72d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L72d
            r4 = r54
            r3 = r56
            r2 = r60
            r5 = r61
            r21 = r8
            r19 = r12
            r8 = r1
            r1 = r6
            r12 = r7
            r6 = r57
            r7 = r58
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L728
            r8 = r1
            r2 = r5
            r25 = r0
            r2 = r15
            r12 = r19
            r38 = r21
            r0 = 0
            goto L601
        L728:
            r0 = move-exception
            r8 = r1
            r2 = r5
            goto L643
        L72d:
            r0 = move-exception
            r2 = r61
            r8 = r6
            goto L643
        L733:
            r2 = r61
            r21 = r8
            r19 = r12
            r8 = r6
            r12 = r7
            kc1 r0 = r0.m2488()     // Catch: java.lang.Throwable -> L8e5
            if (r0 == 0) goto L955
            boolean r0 = r0.m3186()     // Catch: java.lang.Throwable -> L8e5
            r3 = 1
            if (r0 != r3) goto L955
            int r0 = r21.m2742()     // Catch: java.lang.Throwable -> L8e5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L8e5
            r5 = r32
            r5.add(r0)     // Catch: java.lang.Throwable -> L8e5
            long r3 = r2.m1898()     // Catch: java.lang.Throwable -> L8e5
            r0 = r21
            p000.xn0.m6751(r3, r0)     // Catch: java.lang.Throwable -> L8e5
            td r3 = r9.f8029     // Catch: java.lang.Throwable -> L8e5
            td r4 = p000.EnumC0831td.f10318     // Catch: java.lang.Throwable -> L8e5
            if (r3 != r4) goto L766
            r3 = 1
            goto L767
        L766:
            r3 = 0
        L767:
            java.util.ArrayList r4 = r22.m7123()     // Catch: java.lang.Throwable -> L8e5
            java.util.List r4 = p000.AbstractC0984xh.m6634(r4, r11)     // Catch: java.lang.Throwable -> L8e5
            if (r26 == 0) goto L777
            java.lang.String r6 = r26.toString()     // Catch: java.lang.Throwable -> L6ba
            if (r6 != 0) goto L77a
        L777:
            r6 = r37
            goto L780
        L77a:
            r7 = r6
            r6 = r37
        L77d:
            r21 = r1
            goto L783
        L780:
            java.lang.String r7 = r6.f13053     // Catch: java.lang.Throwable -> L8e5
            goto L77d
        L783:
            r1 = 4015(0xfaf, float:5.626E-42)
            r29 = r13
            r13 = r22
            zd1 r1 = p000.zd1.m7121(r13, r4, r7, r1)     // Catch: java.lang.Throwable -> L8e5
            if (r3 == 0) goto L7b3
            r38 = r0
            qc1 r0 = p000.qc1.f8961     // Catch: java.lang.Throwable -> L6ba
            r3 = r4
            sd r4 = r2.f3486     // Catch: java.lang.Throwable -> L6ba
            r32 = r6
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6ba
            r2 = r1
            r22 = r9
            r9 = r21
            r45 = r25
            r21 = r38
            r1 = r48
            r25 = r13
            r13 = r3
            r3 = r53
            oc1 r0 = r0.m4861(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6ba
            r33 = r5
            goto L7c7
        L7b3:
            r2 = r1
            r33 = r5
            r32 = r6
            r22 = r9
            r9 = r21
            r45 = r25
            r21 = r0
            r25 = r13
            r13 = r4
            oc1 r0 = p000.oc1.m4218(r22)     // Catch: java.lang.Throwable -> L8e5
        L7c7:
            id1 r1 = r0.f8028     // Catch: java.lang.Throwable -> L8e5
            if (r1 == 0) goto L8e9
            int r3 = r1.m2742()     // Catch: java.lang.Throwable -> L8e5
            int r4 = r21.m2742()     // Catch: java.lang.Throwable -> L8e5
            if (r3 == r4) goto L8e9
            rc1 r3 = r8.m1681()     // Catch: java.lang.Throwable -> L8e5
            int r4 = r3.f9333     // Catch: java.lang.Throwable -> L8e5
            r5 = 1
            int r4 = r4 - r5
            if (r4 >= 0) goto L7e0
            r4 = 0
        L7e0:
            r6 = 0
            rc1 r3 = p000.rc1.m5078(r3, r6, r4, r5)     // Catch: java.lang.Throwable -> L8e5
            qc1 r4 = p000.qc1.f8961     // Catch: java.lang.Throwable -> L8e5
            int r2 = p000.qc1.m4857(r2, r12, r3, r1)     // Catch: java.lang.Throwable -> L8e5
            java.util.List r3 = p000.AbstractC0984xh.m6662(r14, r11)     // Catch: java.lang.Throwable -> L8e5
            java.util.List r2 = p000.AbstractC0984xh.m6662(r13, r2)     // Catch: java.lang.Throwable -> L8e5
            java.util.ArrayList r14 = p000.AbstractC0984xh.m6651(r3, r2)     // Catch: java.lang.Throwable -> L8e5
            long r2 = r61.m1898()     // Catch: java.lang.Throwable -> L8e5
            int r4 = r14.size()     // Catch: java.lang.Throwable -> L8e5
            r8.m1682(r2, r9, r4)     // Catch: java.lang.Throwable -> L8e5
            r13 = r21
            java.lang.String r2 = r13.f5016     // Catch: java.lang.Throwable -> L8e5
            if (r2 != 0) goto L81e
            int r2 = r13.m2742()     // Catch: java.lang.Throwable -> L6ba
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6ba
            r3.<init>()     // Catch: java.lang.Throwable -> L6ba
            r9 = r17
            r3.append(r9)     // Catch: java.lang.Throwable -> L6ba
            r3.append(r2)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L6ba
            goto L820
        L81e:
            r9 = r17
        L820:
            java.lang.String r3 = r1.f5016     // Catch: java.lang.Throwable -> L8e5
            if (r3 != 0) goto L837
            int r3 = r1.m2742()     // Catch: java.lang.Throwable -> L6ba
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6ba
            r4.<init>()     // Catch: java.lang.Throwable -> L6ba
            r4.append(r9)     // Catch: java.lang.Throwable -> L6ba
            r4.append(r3)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L6ba
        L837:
            java.lang.Integer r4 = r1.f5019     // Catch: java.lang.Throwable -> L8e5
            if (r4 != 0) goto L83d
            r4 = r20
        L83d:
            java.lang.Integer r5 = r1.f5020     // Catch: java.lang.Throwable -> L8e5
            if (r5 != 0) goto L843
            r5 = r20
        L843:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e5
            r6.<init>()     // Catch: java.lang.Throwable -> L8e5
            r6.append(r2)     // Catch: java.lang.Throwable -> L8e5
            java.lang.String r2 = " 不适用于当前会话，已改选 "
            r6.append(r2)     // Catch: java.lang.Throwable -> L8e5
            r6.append(r3)     // Catch: java.lang.Throwable -> L8e5
            r2 = r44
            r6.append(r2)     // Catch: java.lang.Throwable -> L8e5
            r6.append(r4)     // Catch: java.lang.Throwable -> L8e5
            r3 = r36
            r6.append(r3)     // Catch: java.lang.Throwable -> L8e5
            r6.append(r5)     // Catch: java.lang.Throwable -> L8e5
            java.lang.String r4 = "）"
            r6.append(r4)     // Catch: java.lang.Throwable -> L8e5
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L8e5
            r12 = r53
            r6 = r57
            r7 = r58
            r5 = r61
            r17 = r1
            r37 = r2
            r36 = r3
            r1 = r8
            r3 = r56
            r2 = r60
            r8 = r4
            r4 = r54
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r2 = m2951(r61)     // Catch: java.lang.Throwable -> L6ba
            long r3 = r61.m1898()     // Catch: java.lang.Throwable -> L6ba
            int r5 = r13.m2742()     // Catch: java.lang.Throwable -> L6ba
            int r6 = r17.m2742()     // Catch: java.lang.Throwable -> L6ba
            int r7 = r14.size()     // Catch: java.lang.Throwable -> L6ba
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6ba
            r8.<init>()     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r13 = "种植重选 name="
            r8.append(r13)     // Catch: java.lang.Throwable -> L6ba
            r8.append(r2)     // Catch: java.lang.Throwable -> L6ba
            r8.append(r15)     // Catch: java.lang.Throwable -> L6ba
            r8.append(r3)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r2 = " rejectedSeedId="
            r8.append(r2)     // Catch: java.lang.Throwable -> L6ba
            r8.append(r5)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r2 = " nextSeedId="
            r8.append(r2)     // Catch: java.lang.Throwable -> L6ba
            r8.append(r6)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r2 = " candidates="
            r8.append(r2)     // Catch: java.lang.Throwable -> L6ba
            r8.append(r7)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r2 = r8.toString()     // Catch: java.lang.Throwable -> L6ba
            r3 = 0
            r13 = 4
            p000.C0888ux.m5992(r10, r2, r3, r13, r3)     // Catch: java.lang.Throwable -> L6ba
            r2 = r15
            r38 = r17
            r12 = r19
            r22 = r25
            r13 = r29
            r44 = r37
            r25 = r45
            r17 = r9
            r37 = r32
            r32 = r33
            r9 = r0
            r0 = r18
            goto L601
        L8e5:
            r0 = move-exception
            r1 = r8
            goto L643
        L8e9:
            r12 = r53
            r1 = r8
            r0 = r17
            r13 = r21
            r37 = r44
            r4 = 0
            r1.m1680(r9, r4)     // Catch: java.lang.Throwable -> L6ba
            int r2 = r11 + 1
            java.util.List r14 = p000.AbstractC0984xh.m6662(r14, r2)     // Catch: java.lang.Throwable -> L6ba
            long r2 = r61.m1898()     // Catch: java.lang.Throwable -> L6ba
            int r4 = r14.size()     // Catch: java.lang.Throwable -> L6ba
            r1.m1682(r2, r9, r4)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r2 = r13.f5016     // Catch: java.lang.Throwable -> L6ba
            if (r2 != 0) goto L91e
            int r2 = r13.m2742()     // Catch: java.lang.Throwable -> L6ba
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6ba
            r3.<init>()     // Catch: java.lang.Throwable -> L6ba
            r3.append(r0)     // Catch: java.lang.Throwable -> L6ba
            r3.append(r2)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L6ba
        L91e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6ba
            r3.<init>()     // Catch: java.lang.Throwable -> L6ba
            r3.append(r2)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r2 = " 不在当前会话活动时间，没有其它可用种子，已停止该会话剩余种植"
            r3.append(r2)     // Catch: java.lang.Throwable -> L6ba
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> L6ba
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r5 = r61
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6ba
            r17 = r0
            r38 = r13
            r2 = r15
            r9 = r22
            r22 = r25
            r13 = r29
            r44 = r37
            r25 = r45
            r0 = 0
            r12 = 1
        L94f:
            r37 = r32
            r32 = r33
            goto L601
        L955:
            r12 = r53
            r29 = r13
            r0 = r17
            r13 = r21
            r45 = r25
            r33 = r32
            r32 = r37
            r37 = r44
            r25 = r22
            r22 = r9
            r9 = r1
            r1 = r8
            r4 = 0
            r1.m1680(r9, r4)     // Catch: java.lang.Throwable -> L6ba
            int r11 = r11 + 1
            java.lang.String r8 = "种植失败，继续处理后续地块"
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r5 = r61
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6ba
            r17 = r0
            r38 = r13
            r2 = r15
            r12 = r19
            r9 = r22
            r22 = r25
            r13 = r29
            r44 = r37
            r25 = r45
            r0 = 0
            goto L94f
        L995:
            r0 = move-exception
            r1 = r6
            goto L643
        L999:
            r1 = r49
            r15 = r2
            r45 = r25
            r32 = r37
            goto L9a6
        L9a1:
            r0 = move-exception
            r1 = r49
            goto L655
        L9a6:
            if (r0 == 0) goto L9ab
            r1.m1685()     // Catch: java.lang.Throwable -> L6ba
        L9ab:
            r9 = r10
            r8 = r13
            goto La9f
        L9af:
            r0 = move-exception
            r1 = r49
            r15 = r2
            r10 = r21
            goto L64a
        L9b7:
            r0 = move-exception
            r1 = r49
        L9ba:
            r15 = r19
            r10 = r21
            goto L643
        L9c0:
            r0 = move-exception
            goto L9ba
        L9c2:
            r0 = move-exception
            r1 = r10
            goto L9ba
        L9c5:
            r12 = r53
            r2 = r9
            r32 = r14
            r9 = r17
            r15 = r19
            r45 = r25
            r4 = r33
            r3 = r34
            r25 = r1
            r33 = r5
            r1 = r10
            r10 = r21
            r5 = r35
            long r6 = r61.m1898()     // Catch: java.lang.Throwable -> Lb17
            r13 = 0
            r1.m1682(r6, r2, r13)     // Catch: java.lang.Throwable -> Lb17
            java.lang.String r2 = r0.f8030     // Catch: java.lang.Throwable -> Lb17
            java.lang.String r6 = r0.f8031     // Catch: java.lang.Throwable -> Lb17
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb17
            r7.<init>()     // Catch: java.lang.Throwable -> Lb17
            java.lang.String r8 = "种植跳过："
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb17
            r7.append(r2)     // Catch: java.lang.Throwable -> Lb17
            java.lang.String r2 = "，"
            r7.append(r2)     // Catch: java.lang.Throwable -> Lb17
            r7.append(r6)     // Catch: java.lang.Throwable -> Lb17
            java.lang.String r8 = r7.toString()     // Catch: java.lang.Throwable -> Lb17
            r6 = r57
            r7 = r58
            r2 = r60
            r13 = r3
            r14 = r4
            r21 = r10
            r4 = r54
            r3 = r56
            r10 = r5
            r5 = r61
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lb15
            java.lang.String r1 = m2951(r5)     // Catch: java.lang.Throwable -> Lb11
            long r2 = r5.m1898()     // Catch: java.lang.Throwable -> Lb11
            java.lang.String r4 = r0.f8030     // Catch: java.lang.Throwable -> Lb11
            td r6 = r0.f8029     // Catch: java.lang.Throwable -> Lb11
            java.lang.String r0 = r0.f8031     // Catch: java.lang.Throwable -> Lb11
            r7 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = m2950(r0, r7)     // Catch: java.lang.Throwable -> Lb11
            r7 = r25
            java.lang.String r8 = r7.f13053     // Catch: java.lang.Throwable -> Lb11
            java.lang.Integer r7 = r7.m7124()     // Catch: java.lang.Throwable -> Lb11
            int r12 = r12.f8968     // Catch: java.lang.Throwable -> Lb11
            r17 = r12
            sd r12 = r5.f3486     // Catch: java.lang.Throwable -> Lb11
            java.util.Set r12 = r12.f9842     // Catch: java.lang.Throwable -> Lb11
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.lang.Throwable -> Lb11
            java.util.List r12 = p000.AbstractC0984xh.m6657(r12)     // Catch: java.lang.Throwable -> Lb11
            java.util.List r5 = p000.AbstractC0984xh.m6657(r33)     // Catch: java.lang.Throwable -> Lb09
            r53 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb09
            r5.<init>()     // Catch: java.lang.Throwable -> Lb09
            r5.append(r10)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r1)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r15)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r2)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r13)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r4)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r14)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r6)     // Catch: java.lang.Throwable -> Lb09
            java.lang.String r1 = " result=skip reason="
            r5.append(r1)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r0)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r9)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r8)     // Catch: java.lang.Throwable -> Lb09
            java.lang.String r0 = " level="
            r5.append(r0)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r7)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r11)     // Catch: java.lang.Throwable -> Lb09
            r0 = r17
            r5.append(r0)     // Catch: java.lang.Throwable -> Lb09
            java.lang.String r0 = " excluded="
            r5.append(r0)     // Catch: java.lang.Throwable -> Lb09
            r5.append(r12)     // Catch: java.lang.Throwable -> Lb09
            java.lang.String r0 = " activityRejected="
            r5.append(r0)     // Catch: java.lang.Throwable -> Lb09
            r0 = r53
            r5.append(r0)     // Catch: java.lang.Throwable -> Lb09
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lb09
            r9 = r21
            r3 = 0
            r13 = 4
            p000.C0888ux.m5992(r9, r0, r3, r13, r3)     // Catch: java.lang.Throwable -> Lae6
            r8 = 0
        La9f:
            if (r8 <= 0) goto Lafa
            java.lang.String r4 = "after_plant"
            od r6 = p000.EnumC0619od.f8035     // Catch: java.lang.Throwable -> Lae6
            r0 = r47
            r3 = r48
            r2 = r61
            r1 = r16
            r5 = r40
            zd1 r4 = m2940(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Laf5
            r10 = r0
            r13 = r1
            r11 = r3
            if (r4 != 0) goto Laec
            r49.m1684()     // Catch: java.lang.Throwable -> Lae6
            java.lang.String r8 = "种植后刷新失败，等待定向复查"
            r1 = r49
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r5 = r61
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lae0
            r2 = r49
            r7 = r56
            r5 = r57
            r6 = r58
            r3 = r61
            r1 = r24
            r4 = r28
            m2937(r1, r2, r3, r4, r5, r6, r7)
            return r23
        Lae0:
            r0 = move-exception
        Lae1:
            r12 = r28
        Lae3:
            r6 = r9
            goto L644
        Lae6:
            r0 = move-exception
            r1 = r49
            r5 = r61
            goto Lae1
        Laec:
            r1 = r49
            r5 = r61
            r12 = r28
            r0 = r4
            goto Lb44
        Laf5:
            r0 = move-exception
            r1 = r49
            r5 = r2
            goto Lae1
        Lafa:
            r10 = r47
            r11 = r48
            r1 = r49
            r5 = r61
            r13 = r16
            r12 = r28
            r0 = r32
            goto Lb44
        Lb09:
            r0 = move-exception
            r1 = r49
            r5 = r61
        Lb0e:
            r9 = r21
            goto Lae1
        Lb11:
            r0 = move-exception
            r1 = r49
            goto Lb0e
        Lb15:
            r0 = move-exception
            goto Lb0e
        Lb17:
            r0 = move-exception
            r5 = r61
            r9 = r10
            goto Lae1
        Lb1c:
            r0 = move-exception
            r5 = r61
        Lb1f:
            r1 = r10
            r15 = r19
            goto Lb0e
        Lb23:
            r0 = move-exception
            r5 = r1
            goto Lb1f
        Lb26:
            r0 = move-exception
            r5 = r1
            r12 = r4
            r1 = r10
            r15 = r19
            r9 = r21
        Lb2e:
            r6 = r9
            r28 = r12
            goto L644
        Lb33:
            r11 = r48
            r32 = r0
            r5 = r1
            r12 = r2
            r45 = r9
            r1 = r10
            r13 = r16
            r15 = r19
            r9 = r21
            r10 = r47
        Lb44:
            od r2 = p000.EnumC0619od.f8036     // Catch: java.lang.Throwable -> Lc5f
            java.lang.Object r3 = r12.get(r2)     // Catch: java.lang.Throwable -> Lc5f
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lc5f
            boolean r3 = p000.ln0.m3626(r3, r4)     // Catch: java.lang.Throwable -> Lc5f
            if (r3 == 0) goto Lc6e
            r3 = r59
            zd1 r0 = m2936(r3, r5, r0)     // Catch: java.lang.Throwable -> Lc5f
            qc1 r3 = p000.qc1.f8961     // Catch: java.lang.Throwable -> Lc5f
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc5f
            java.util.List r0 = p000.qc1.m4860(r0, r11, r3)     // Catch: java.lang.Throwable -> Lc5f
            long r3 = r5.m1898()     // Catch: java.lang.Throwable -> Lc5f
            int r6 = r0.size()     // Catch: java.lang.Throwable -> Lc5f
            r1.m1682(r3, r2, r6)     // Catch: java.lang.Throwable -> Lc5f
            int r2 = r0.size()     // Catch: java.lang.Throwable -> Lc5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5f
            r3.<init>()     // Catch: java.lang.Throwable -> Lc5f
            java.lang.String r4 = "准备浇水 "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lc5f
            r3.append(r2)     // Catch: java.lang.Throwable -> Lc5f
            r14 = r45
            r3.append(r14)     // Catch: java.lang.Throwable -> Lc5f
            java.lang.String r8 = r3.toString()     // Catch: java.lang.Throwable -> Lc5f
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc5f
            r6 = r1
            java.util.Iterator r16 = r0.iterator()     // Catch: java.lang.Throwable -> Lc6b
            r8 = 0
        Lb9a:
            boolean r0 = r16.hasNext()     // Catch: java.lang.Throwable -> Lc6b
            if (r0 == 0) goto Lc25
            java.lang.Object r0 = r16.next()     // Catch: java.lang.Throwable -> Lbde
            r4 = r0
            lc1 r4 = (p000.lc1) r4     // Catch: java.lang.Throwable -> Lbde
            boolean r0 = m2928(r46)     // Catch: java.lang.Throwable -> Lbde
            if (r0 != 0) goto Lc25
            int r31 = r31 + 1
            int r17 = r8 + 1
            r7 = r50
            long r0 = r7.f1622     // Catch: java.lang.Throwable -> Lbde
            od r3 = p000.EnumC0619od.f8036     // Catch: java.lang.Throwable -> Lbde
            xb1 r5 = new xb1     // Catch: java.lang.Throwable -> Lbde
            r2 = 1
            r5.<init>(r10, r13, r4, r2)     // Catch: java.lang.Throwable -> Lbde
            r2 = r61
            hc1 r0 = m2948(r0, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lbde
            boolean r1 = r0.m2489()     // Catch: java.lang.Throwable -> Lbde
            cb1 r1 = r6.m1680(r3, r1)     // Catch: java.lang.Throwable -> Lbde
            boolean r0 = r0.m2489()     // Catch: java.lang.Throwable -> Lbde
            if (r0 == 0) goto Lc0c
            java.lang.String r0 = r4.f6544     // Catch: java.lang.Throwable -> Lbde
            r2 = r41
            r2.add(r0)     // Catch: java.lang.Throwable -> Lbde
            if (r52 == 0) goto Lbe1
            p000.ae1.m95(r52)     // Catch: java.lang.Throwable -> Lbde
            goto Lbe1
        Lbde:
            r0 = move-exception
            goto Lb2e
        Lbe1:
            int r0 = r1.m1176()     // Catch: java.lang.Throwable -> Lbde
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbde
            r1.<init>()     // Catch: java.lang.Throwable -> Lbde
            java.lang.String r3 = "已浇水 "
            r1.append(r3)     // Catch: java.lang.Throwable -> Lbde
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbde
            r1.append(r14)     // Catch: java.lang.Throwable -> Lbde
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> Lbde
            r4 = r54
            r3 = r56
            r7 = r58
            r5 = r61
            r41 = r2
            r1 = r6
            r6 = r57
            r2 = r60
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lbde
            goto Lc1f
        Lc0c:
            java.lang.String r8 = "浇水失败，继续处理后续地块"
            r1 = r49
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r5 = r61
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lbde
        Lc1f:
            r6 = r49
            r8 = r17
            goto Lb9a
        Lc25:
            if (r8 <= 0) goto Lc68
            java.lang.String r4 = "after_water"
            od r6 = p000.EnumC0619od.f8036     // Catch: java.lang.Throwable -> Lc64
            r2 = r61
            r0 = r10
            r3 = r11
            r1 = r13
            r5 = r41
            zd1 r0 = m2940(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc64
            if (r0 != 0) goto Lc68
            r49.m1684()     // Catch: java.lang.Throwable -> Lc64
            java.lang.String r8 = "浇水后刷新失败，等待定向复查"
            r1 = r49
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r5 = r61
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc5f
            r2 = r49
            r7 = r56
            r5 = r57
            r6 = r58
            r3 = r61
            r4 = r12
            r1 = r24
            m2937(r1, r2, r3, r4, r5, r6, r7)
            return r23
        Lc5f:
            r0 = move-exception
        Lc60:
            r28 = r12
            goto Lae3
        Lc64:
            r0 = move-exception
            r1 = r49
            goto Lc60
        Lc68:
            r1 = r49
            goto Lc6e
        Lc6b:
            r0 = move-exception
            r1 = r6
            goto Lc60
        Lc6e:
            r28 = r12
            if (r31 != 0) goto Lc92
            java.lang.Object r2 = r1.f3028     // Catch: java.lang.Throwable -> Lca1
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Lca1
            int r0 = r1.f3039     // Catch: java.lang.Throwable -> Lca4
            r30 = 1
            int r0 = r0 + 1
            r1.f3039 = r0     // Catch: java.lang.Throwable -> Lca4
            r1.m1686()     // Catch: java.lang.Throwable -> Lca4
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lca1
            java.lang.String r8 = "实时状态已确认，本次没有可执行写操作"
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r5 = r61
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lca1
        Lc92:
            r2 = r49
            r7 = r56
            r5 = r57
            r6 = r58
            r3 = r61
            r1 = r24
            r4 = r28
            goto Lca7
        Lca1:
            r0 = move-exception
            goto Lae3
        Lca4:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lca1
            throw r0     // Catch: java.lang.Throwable -> Lca1
        Lca7:
            m2937(r1, r2, r3, r4, r5, r6, r7)
            return r23
        Lcab:
            r0 = move-exception
            r28 = r2
        Lcae:
            r15 = r19
            r9 = r21
            goto Lae3
        Lcb4:
            r0 = move-exception
            r28 = r8
            goto Lcae
        Lcb8:
            r0 = move-exception
            r24 = r1
            goto Lcae
        Lcbc:
            r24 = r1
            r15 = r19
            r9 = r21
            r49.m1684()     // Catch: java.lang.Throwable -> Lcfd
            java.lang.String r0 = m2949(r6)     // Catch: java.lang.Throwable -> Lcfd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcfd
            r1.<init>()     // Catch: java.lang.Throwable -> Lcfd
            java.lang.String r2 = "上下文获取失败："
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcfd
            r1.append(r0)     // Catch: java.lang.Throwable -> Lcfd
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> Lcfd
            r1 = r49
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r5 = r61
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lcfd
            r2 = r49
            r7 = r56
            r5 = r57
            r6 = r58
            r3 = r61
            r1 = r24
            r4 = r28
            m2937(r1, r2, r3, r4, r5, r6, r7)
            return r23
        Lcfd:
            r0 = move-exception
            r1 = r24
            goto Lae3
        Ld02:
            r0 = move-exception
        Ld03:
            r15 = r19
            r9 = r21
            r24 = r1
            goto Lae3
        Ld0b:
            r0 = move-exception
            r28 = r13
            goto Ld03
        Ld0f:
            r37 = r10
            r28 = r13
            r3 = r15
            r10 = r27
            r0 = r47
            r12 = r50
            r10 = r37
            r4 = 0
            r3 = r48
            goto Lda
        Ld21:
            r0 = move-exception
            r28 = r13
            r2 = r19
            r6 = r21
            r24 = r1
            goto Ld3e
        Ld2b:
            r4 = r28
        Ld2d:
            r2 = r49
            r7 = r56
            r5 = r57
            r6 = r58
            r3 = r61
            goto Ld3a
        Ld38:
            r4 = r13
            goto Ld2d
        Ld3a:
            m2937(r1, r2, r3, r4, r5, r6, r7)
            return r23
        Ld3e:
            r49.m1684()     // Catch: java.lang.Throwable -> Ld9b
            java.lang.String r1 = m2951(r61)     // Catch: java.lang.Throwable -> Ld9b
            long r3 = r61.m1898()     // Catch: java.lang.Throwable -> Ld9b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9b
            r5.<init>()     // Catch: java.lang.Throwable -> Ld9b
            java.lang.String r7 = "并行会话执行异常 name="
            r5.append(r7)     // Catch: java.lang.Throwable -> Ld9b
            r5.append(r1)     // Catch: java.lang.Throwable -> Ld9b
            r5.append(r2)     // Catch: java.lang.Throwable -> Ld9b
            r5.append(r3)     // Catch: java.lang.Throwable -> Ld9b
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> Ld9b
            p000.C0888ux.m5977(r6, r1, r0)     // Catch: java.lang.Throwable -> Ld9b
            java.lang.String r0 = m2949(r0)     // Catch: java.lang.Throwable -> Ld9b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld9b
            r1.<init>()     // Catch: java.lang.Throwable -> Ld9b
            java.lang.String r2 = "会话执行异常："
            r1.append(r2)     // Catch: java.lang.Throwable -> Ld9b
            r1.append(r0)     // Catch: java.lang.Throwable -> Ld9b
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> Ld9b
            r1 = r49
            r4 = r54
            r3 = r56
            r6 = r57
            r7 = r58
            r2 = r60
            r5 = r61
            m2938(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Ld9b
            r2 = r49
            r7 = r56
            r5 = r57
            r6 = r58
            r3 = r61
            r1 = r24
            r4 = r28
            m2937(r1, r2, r3, r4, r5, r6, r7)
            return r23
        Ld9b:
            r0 = move-exception
            r1 = r24
            r4 = r28
            r2 = r49
            r7 = r56
            r5 = r57
            r6 = r58
            r3 = r61
            m2937(r1, r2, r3, r4, r5, r6, r7)
            throw r0
    }

    /* JADX INFO: renamed from: η */
    public static final p000.zd1 m2936(java.util.Map r2, p000.ec1 r3, p000.zd1 r4) {
            long r0 = r3.f3481
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r2.get(r3)
            java.util.Set r2 = (java.util.Set) r2
            zd1 r2 = m2953(r4, r2)
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public static final void m2937(java.util.concurrent.atomic.AtomicBoolean r18, p000.db1 r19, p000.ec1 r20, java.util.LinkedHashMap r21, p000.a80 r22, java.lang.String r23, java.util.ArrayList r24) {
            r0 = r19
            r1 = r22
            r2 = 0
            r3 = 1
            r4 = r18
            boolean r4 = r4.compareAndSet(r2, r3)
            if (r4 != 0) goto L10
            goto Lcb
        L10:
            r4 = r20
            long r4 = r4.f3481
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Set r7 = r21.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L21:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L45
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L21
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            r6.put(r9, r8)
            goto L21
        L45:
            java.util.Set r6 = r6.keySet()
            java.util.Collection r6 = (java.util.Collection) r6
            r6.getClass()
            java.lang.Object r7 = r0.f3028
            monitor-enter(r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L83
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L83
        L57:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L83
            if (r8 == 0) goto L85
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L83
            od r8 = (p000.EnumC0619od) r8     // Catch: java.lang.Throwable -> L83
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L83
            l91 r10 = new l91     // Catch: java.lang.Throwable -> L83
            r10.<init>(r9, r8)     // Catch: java.lang.Throwable -> L83
            java.util.LinkedHashSet r8 = r0.f3030     // Catch: java.lang.Throwable -> L83
            boolean r8 = r8.contains(r10)     // Catch: java.lang.Throwable -> L83
            if (r8 != 0) goto L57
            java.util.LinkedHashMap r8 = r0.f3029     // Catch: java.lang.Throwable -> L83
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L83
            r8.put(r10, r9)     // Catch: java.lang.Throwable -> L83
            java.util.LinkedHashSet r8 = r0.f3030     // Catch: java.lang.Throwable -> L83
            r8.add(r10)     // Catch: java.lang.Throwable -> L83
            goto L57
        L83:
            r0 = move-exception
            goto Lcc
        L85:
            int r4 = r0.f3041     // Catch: java.lang.Throwable -> L83
            int r4 = r4 + r3
            r0.f3041 = r4     // Catch: java.lang.Throwable -> L83
            cb1 r0 = r0.m1686()     // Catch: java.lang.Throwable -> L83
            monitor-exit(r7)
            if (r1 == 0) goto Lcb
            gc1 r8 = new gc1
            int r4 = r0.f2051
            int r5 = r24.size()
            java.lang.String r6 = "已处理 "
            java.lang.String r7 = "/"
            java.lang.String r9 = " 位人员"
            java.lang.String r10 = p000.AbstractC0602nx.m4128(r6, r4, r7, r5, r9)
            int r11 = r0.f2051
            int r12 = r24.size()
            int r13 = r0.f2052
            int r14 = r0.f2053
            int r15 = r0.f2054
            int r4 = r0.f2055
            if (r14 != 0) goto Lc2
            int r0 = r0.f2051
            int r5 = r24.size()
            if (r0 >= r5) goto Lc2
            r17 = r3
        Lbd:
            r9 = r23
            r16 = r4
            goto Lc5
        Lc2:
            r17 = r2
            goto Lbd
        Lc5:
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.invoke(r8)
        Lcb:
            return
        Lcc:
            monitor-exit(r7)
            throw r0
    }

    /* JADX INFO: renamed from: ι */
    public static final void m2938(p000.db1 r17, int r18, java.util.ArrayList r19, p000.EnumC0619od r20, p000.ec1 r21, p000.a80 r22, java.lang.String r23, java.lang.String r24) {
            r0 = r21
            r2 = r24
            java.lang.String r3 = "/"
            r4 = r17
            java.lang.Object r5 = r4.f3028
            monitor-enter(r5)
            cb1 r4 = r4.m1686()     // Catch: java.lang.Throwable -> La9
            monitor-exit(r5)
            java.lang.String r5 = "r7ce9b41b1577bc7d"
            r6 = 1
            int r7 = r18 + 1
            int r8 = r19.size()
            if (r20 == 0) goto L20
            java.lang.String r9 = m2930(r20)
            goto L22
        L20:
            java.lang.String r9 = "auto"
        L22:
            java.lang.String r10 = m2951(r0)
            long r11 = r0.f3481
            int r13 = r4.f2052
            int r14 = r4.f2053
            int r15 = r4.f2054
            int r6 = r4.f2055
            r1 = 160(0xa0, float:2.24E-43)
            java.lang.String r1 = m2950(r2, r1)
            r16 = r4
            java.lang.String r4 = "执行进度 "
            java.lang.String r2 = " action="
            java.lang.StringBuilder r2 = p000.AbstractC0602nx.m4136(r4, r7, r3, r8, r2)
            java.lang.String r4 = " name="
            java.lang.String r7 = " shortId="
            p000.AbstractC0602nx.m4119(r2, r9, r4, r10, r7)
            r2.append(r11)
            java.lang.String r4 = " processed="
            r2.append(r4)
            r2.append(r13)
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " success="
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = " failed="
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = " detail="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 4
            r3 = 0
            p000.C0888ux.m5992(r5, r1, r3, r2, r3)
            if (r22 == 0) goto La8
            gc1 r6 = new gc1
            java.lang.String r0 = r0.f3484
            java.lang.String r1 = " · "
            r2 = r24
            java.lang.String r8 = p000.lz1.m3688(r0, r1, r2)
            r0 = r16
            int r9 = r0.f2051
            int r10 = r19.size()
            int r11 = r0.f2052
            int r12 = r0.f2053
            int r13 = r0.f2054
            int r14 = r0.f2055
            if (r12 != 0) goto L9d
            r15 = 1
        L9a:
            r7 = r23
            goto La0
        L9d:
            r0 = 0
            r15 = r0
            goto L9a
        La0:
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r22
            r1.invoke(r6)
        La8:
            return
        La9:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    /* JADX INFO: renamed from: κ */
    public static java.util.List m2939() {
            java.util.Map r0 = p000.v81.m6126()
            xn0 r1 = p000.xn0.f12237
            java.util.Map r1 = r1.m6762()
            java.util.concurrent.ConcurrentHashMap r2 = p000.ry1.f9620
            java.util.Map r2 = p000.ex0.m1975(r2)
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            f7 r2 = p000.AbstractC0984xh.m6661(r2)
            f71 r3 = new f71
            r4 = 14
            r3.<init>(r4)
            y30 r4 = new y30
            r5 = 1
            r4.<init>(r2, r5, r3)
            ic1 r2 = p000.ic1.f5001
            cu r3 = new cu
            r5 = 0
            r3.<init>(r4, r5, r2)
            wa r2 = new wa
            r4 = 25
            r2.<init>(r0, r4, r1)
            t52 r0 = new t52
            r0.<init>(r3, r2)
            ib1 r1 = new ib1
            r2 = 1
            r1.<init>(r2)
            java.util.List r0 = p000.us1.m5949(r0)
            p000.AbstractC0019ai.m168(r0, r1)
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L55
            jz r0 = p000.C0450jz.f5672
            goto L77
        L55:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L64
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            goto L77
        L64:
            java.util.ArrayList r1 = p000.lz1.m3696(r1)
        L68:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r0.next()
            r1.add(r2)
            goto L68
        L76:
            r0 = r1
        L77:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static p000.zd1 m2940(java.lang.ClassLoader r28, p000.vc1 r29, p000.ec1 r30, java.util.List r31, java.lang.String r32, java.util.Set r33, p000.EnumC0619od r34) {
            r0 = r30
            r1 = r32
            xn0 r2 = p000.xn0.f12237
            java.lang.Object r3 = p000.i81.m2663(r28, r29)
            boolean r4 = r3 instanceof p000.eo1
            r5 = 0
            if (r4 == 0) goto L11
            r6 = r5
            goto L12
        L11:
            r6 = r3
        L12:
            ab1 r6 = (p000.ab1) r6
            pd r10 = p000.EnumC0683pd.f8504
            if (r6 == 0) goto L35
            boolean r7 = r6.m54()
            if (r7 == 0) goto L35
            zd1 r7 = r6.f175
            if (r7 != 0) goto L35
            id r7 = new id
            long r8 = r0.f3481
            long r12 = java.lang.System.currentTimeMillis()
            r15 = 0
            r16 = 496(0x1f0, float:6.95E-43)
            r11 = 0
            r14 = 0
            r7.<init>(r8, r10, r11, r12, r14, r15, r16)
            r2.m6770(r7)
        L35:
            if (r6 == 0) goto L4a
            boolean r7 = r6.m54()
            if (r7 == 0) goto L43
            zd1 r7 = r6.f175
            if (r7 == 0) goto L43
            r7 = r6
            goto L44
        L43:
            r7 = r5
        L44:
            if (r7 == 0) goto L4a
            zd1 r7 = r7.f175
            r15 = r7
            goto L4b
        L4a:
            r15 = r5
        L4b:
            java.lang.String r7 = " "
            if (r4 == 0) goto L66
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L60
            java.lang.String r3 = m2949(r3)
            java.lang.String r4 = "error="
            java.lang.String r3 = r4.concat(r3)
            goto L77
        L60:
            java.lang.String r0 = "Required value was null."
            p000.C1080.m7279(r0)
            return r5
        L66:
            if (r6 != 0) goto L6b
            java.lang.String r3 = "error=empty_result"
            goto L77
        L6b:
            java.lang.String r3 = m2947(r6)
            java.lang.String r4 = m2929(r15)
            java.lang.String r3 = p000.lz1.m3688(r3, r7, r4)
        L77:
            java.lang.String r4 = m2951(r0)
            long r8 = r0.f3481
            java.lang.String r6 = "实时查询 stage="
            java.lang.String r11 = " name="
            java.lang.String r12 = " shortId="
            java.lang.StringBuilder r4 = p000.lz1.m3695(r6, r1, r11, r4, r12)
            r4.append(r8)
            r4.append(r7)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "r7ce9b41b1577bc7d"
            r6 = 4
            p000.C0888ux.m5992(r4, r3, r5, r6, r5)
            long r13 = java.lang.System.currentTimeMillis()
            r3 = r33
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r3.iterator()
        Lab:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto Lc3
            java.lang.Object r11 = r3.next()
            r16 = r11
            java.lang.String r16 = (java.lang.String) r16
            boolean r16 = p000.q02.m4671(r16)
            if (r16 != 0) goto Lab
            r7.add(r11)
            goto Lab
        Lc3:
            java.util.Set r26 = p000.AbstractC0984xh.m6671(r7)
            r3 = r26
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Ldc
            r16 = 15000(0x3a98, double:7.411E-320)
            long r16 = r13 + r16
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            r25 = r3
            goto Lde
        Ldc:
            r25 = r5
        Lde:
            if (r15 == 0) goto L103
            id r11 = new id
            long r5 = r0.f3481
            java.lang.Long r18 = r15.m7127()
            qc1 r0 = p000.qc1.f8961
            r0 = r31
            java.lang.Long r19 = p000.qc1.m4856(r15, r0, r13)
            r16 = r13
            pd r14 = p000.EnumC0683pd.f8502
            r22 = r34
            r3 = r12
            r20 = r25
            r21 = r26
            r12 = r5
            r11.<init>(r12, r14, r15, r16, r18, r19, r20, r21, r22)
            r2.m6770(r11)
            goto L15d
        L103:
            r3 = r12
            r16 = r13
            if (r25 == 0) goto L158
            java.util.Map r5 = r2.m6762()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.lang.Object r5 = r5.get(r6)
            id r5 = (p000.C0392id) r5
            if (r5 == 0) goto L11b
            pd r6 = r5.f5004
            goto L11c
        L11b:
            r6 = 0
        L11c:
            if (r6 == r10) goto L15d
            if (r5 == 0) goto L123
            pd r6 = r5.f5004
            goto L124
        L123:
            r6 = 0
        L124:
            pd r7 = p000.EnumC0683pd.f8503
            if (r6 == r7) goto L15d
            r21 = r16
            id r16 = new id
            long r6 = r0.f3481
            if (r5 == 0) goto L135
            zd1 r0 = r5.f5005
            r20 = r0
            goto L137
        L135:
            r20 = 0
        L137:
            if (r5 == 0) goto L13e
            java.lang.Long r0 = r5.f5007
            r23 = r0
            goto L140
        L13e:
            r23 = 0
        L140:
            if (r5 == 0) goto L147
            java.lang.Long r0 = r5.f5008
            r24 = r0
            goto L149
        L147:
            r24 = 0
        L149:
            pd r19 = p000.EnumC0683pd.f8505
            r27 = r34
            r17 = r6
            r16.<init>(r17, r19, r20, r21, r23, r24, r25, r26, r27)
            r0 = r16
            r2.m6770(r0)
            goto L15d
        L158:
            r5 = r16
            r2.m6766(r8, r5)
        L15d:
            if (r25 == 0) goto L187
            int r0 = r26.size()
            if (r15 == 0) goto L167
            r2 = 1
            goto L168
        L167:
            r2 = 0
        L168:
            java.lang.String r5 = "写后定向复查 stage="
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4137(r5, r1, r8, r3)
            java.lang.String r3 = " plots="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = " delay=15000ms snapshot="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r1 = 4
            r2 = 0
            p000.C0888ux.m5992(r4, r0, r2, r1, r2)
        L187:
            return r15
    }

    /* JADX INFO: renamed from: μ */
    public static /* synthetic */ p000.zd1 m2941(java.lang.ClassLoader r7, p000.vc1 r8, p000.ec1 r9, java.util.List r10) {
            java.lang.String r4 = "before_write"
            nz r5 = p000.C0604nz.f7825
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            zd1 r7 = m2940(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: ν */
    public static void m2942(android.app.Activity r3, p000.a80 r4, p000.a80 r5) {
            r3.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5425
            r1 = 0
            r0.set(r1)
            java.lang.Thread r0 = new java.lang.Thread
            e9 r1 = new e9
            r2 = 23
            r1.<init>(r3, r4, r5, r2)
            java.lang.String r3 = "rc8b08ccb9ef9e6ae"
            r0.<init>(r1, r3)
            r3 = 1
            r0.setDaemon(r3)
            r0.start()
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static p000.dc1 m2943(java.lang.ClassLoader r35, boolean r36, java.util.LinkedHashSet r37, p000.C0372hu r38, int r39) {
            r0 = r35
            r7 = r36
            r1 = r39 & 4
            r8 = 0
            if (r1 == 0) goto Lb
            r1 = r8
            goto Ld
        Lb:
            r1 = r37
        Ld:
            r2 = r39 & 8
            if (r2 == 0) goto L13
            r9 = r8
            goto L15
        L13:
            r9 = r38
        L15:
            boolean r2 = p000.AbstractC0976x9.m6528()
            if (r2 == 0) goto L7e4
            boolean r2 = p000.ui1.m5867()
            if (r2 != 0) goto L23
            goto L7e4
        L23:
            java.util.List r2 = m2939()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r2 = r2.iterator()
        L30:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()
            r4 = r3
            ec1 r4 = (p000.ec1) r4
            if (r1 == 0) goto L4b
            long r4 = r4.f3481
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L30
        L4b:
            r10.add(r3)
            goto L30
        L4f:
            long r11 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r1 = r10.iterator()
        L5c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L75
            java.lang.Object r2 = r1.next()
            r3 = r2
            ec1 r3 = (p000.ec1) r3
            id r3 = r3.f3487
            boolean r3 = p000.xn0.m6723(r3, r11, r7)
            if (r3 == 0) goto L5c
            r13.add(r2)
            goto L5c
        L75:
            java.lang.String r1 = "r7ce9b41b1577bc7d"
            int r2 = r10.size()
            int r3 = r13.size()
            int r4 = r10.size()
            int r5 = r13.size()
            int r4 = r4 - r5
            java.lang.String r5 = "刷新开始 会话="
            java.lang.String r6 = " 待联网="
            java.lang.String r14 = " 缓存命中="
            java.lang.StringBuilder r2 = p000.AbstractC0602nx.m4136(r5, r2, r6, r3, r14)
            r2.append(r4)
            java.lang.String r3 = " force="
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r14 = 4
            p000.C0888ux.m5992(r1, r2, r8, r14, r8)
            r15 = 0
            if (r9 == 0) goto Lc2
            gc1 r1 = new gc1
            int r2 = r10.size()
            java.lang.String r3 = "正在准备 "
            java.lang.String r4 = " 位人员的营地状态"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r3, r2, r4)
            int r3 = r10.size()
            r4 = 240(0xf0, float:3.36E-43)
            r1.<init>(r15, r3, r4, r2)
            r9.invoke(r1)
        Lc2:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = p000.AbstractC1021yh.m6889(r13, r2)
            r1.<init>(r3)
            java.util.Iterator r3 = r13.iterator()
        Ld1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lfa
            java.lang.Object r4 = r3.next()
            ec1 r4 = (p000.ec1) r4
            gb1 r16 = new gb1
            long r5 = r4.f3481
            java.lang.String r15 = r4.f3482
            r38 = r9
            long r8 = r4.f3483
            r17 = r5
            r20 = r8
            r19 = r15
            r16.<init>(r17, r19, r20)
            r4 = r16
            r1.add(r4)
            r9 = r38
            r8 = 0
            r15 = 0
            goto Ld1
        Lfa:
            r38 = r9
            java.lang.Object r8 = p000.ln0.f6717
            monitor-enter(r8)
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L12b
            r3.<init>()     // Catch: java.lang.Throwable -> L12b
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12b
            r4.<init>()     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L12b
        L10d:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r5 == 0) goto L12e
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L12b
            r6 = r5
            gb1 r6 = (p000.gb1) r6     // Catch: java.lang.Throwable -> L12b
            long r14 = r6.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r6 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L12b
            boolean r6 = r3.add(r6)     // Catch: java.lang.Throwable -> L12b
            if (r6 == 0) goto L129
            r4.add(r5)     // Catch: java.lang.Throwable -> L12b
        L129:
            r14 = 4
            goto L10d
        L12b:
            r0 = move-exception
            goto L7e2
        L12e:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L12b
            r9.<init>()     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r1 = r4.iterator()     // Catch: java.lang.Throwable -> L12b
        L137:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r3 == 0) goto L155
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L12b
            gb1 r3 = (p000.gb1) r3     // Catch: java.lang.Throwable -> L12b
            long r5 = r3.f4304     // Catch: java.lang.Throwable -> L12b
            vc1 r5 = p000.ln0.m3594(r5)     // Catch: java.lang.Throwable -> L12b
            if (r5 == 0) goto L137
            long r14 = r3.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r3 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L12b
            r9.put(r3, r5)     // Catch: java.lang.Throwable -> L12b
            goto L137
        L155:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12b
            r1.<init>()     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r3 = r4.iterator()     // Catch: java.lang.Throwable -> L12b
        L15e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r4 == 0) goto L17b
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L12b
            r5 = r4
            gb1 r5 = (p000.gb1) r5     // Catch: java.lang.Throwable -> L12b
            long r5 = r5.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L12b
            boolean r5 = r9.containsKey(r5)     // Catch: java.lang.Throwable -> L12b
            if (r5 != 0) goto L15e
            r1.add(r4)     // Catch: java.lang.Throwable -> L12b
            goto L15e
        L17b:
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L12b
            if (r3 == 0) goto L190
            fb1 r1 = new fb1     // Catch: java.lang.Throwable -> L12b
            nz r2 = p000.C0604nz.f7825     // Catch: java.lang.Throwable -> L12b
            kz r3 = p000.C0493kz.f6332     // Catch: java.lang.Throwable -> L12b
            r1.<init>(r9, r2, r3)     // Catch: java.lang.Throwable -> L12b
        L18a:
            r22 = r10
            r21 = r13
            goto L481
        L190:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12b
            r14.<init>()     // Catch: java.lang.Throwable -> L12b
            r3 = 0
            r4 = 0
        L197:
            r6 = 20
            if (r3 >= r6) goto L446
            java.lang.Object r6 = p000.j81.m2916(r0, r4)     // Catch: java.lang.Throwable -> L12b
            java.lang.Throwable r15 = p000.fo1.m2190(r6)     // Catch: java.lang.Throwable -> L12b
            if (r15 != 0) goto L406
            eb1 r6 = (p000.eb1) r6     // Catch: java.lang.Throwable -> L12b
            boolean r15 = r6.m1892()     // Catch: java.lang.Throwable -> L12b
            if (r15 == 0) goto L1c2
            java.lang.Integer r15 = r6.m1891()     // Catch: java.lang.Throwable -> L12b
            if (r15 == 0) goto L1c0
            java.lang.Integer r15 = r6.m1891()     // Catch: java.lang.Throwable -> L12b
            if (r15 != 0) goto L1ba
            goto L1c2
        L1ba:
            int r15 = r15.intValue()     // Catch: java.lang.Throwable -> L12b
            if (r15 != 0) goto L1c2
        L1c0:
            r15 = 1
            goto L1c3
        L1c2:
            r15 = 0
        L1c3:
            if (r15 != 0) goto L22b
            java.lang.Integer r3 = r6.f3472     // Catch: java.lang.Throwable -> L12b
            r4 = -1
            if (r3 == 0) goto L1cf
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L12b
            goto L1d0
        L1cf:
            r3 = r4
        L1d0:
            java.lang.Integer r5 = r6.m1891()     // Catch: java.lang.Throwable -> L12b
            if (r5 == 0) goto L1da
            int r4 = r5.intValue()     // Catch: java.lang.Throwable -> L12b
        L1da:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12b
            r5.<init>()     // Catch: java.lang.Throwable -> L12b
            java.lang.String r6 = "http="
            r5.append(r6)     // Catch: java.lang.Throwable -> L12b
            r5.append(r3)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r3 = " code="
            r5.append(r3)     // Catch: java.lang.Throwable -> L12b
            r5.append(r4)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L12b
            nz r4 = p000.C0604nz.f7825     // Catch: java.lang.Throwable -> L12b
            int r2 = p000.AbstractC1021yh.m6889(r1, r2)     // Catch: java.lang.Throwable -> L12b
            int r2 = p000.ex0.m1970(r2)     // Catch: java.lang.Throwable -> L12b
            r5 = 16
            if (r2 >= r5) goto L204
            r5 = 16
            goto L205
        L204:
            r5 = r2
        L205:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L12b
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L12b
        L20e:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r5 == 0) goto L224
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L12b
            gb1 r5 = (p000.gb1) r5     // Catch: java.lang.Throwable -> L12b
            long r5 = r5.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L12b
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> L12b
            goto L20e
        L224:
            fb1 r1 = new fb1     // Catch: java.lang.Throwable -> L12b
            r1.<init>(r9, r4, r2)     // Catch: java.lang.Throwable -> L12b
            goto L18a
        L22b:
            org.json.JSONObject r15 = r6.f3473     // Catch: java.lang.Throwable -> L12b
            r14.add(r15)     // Catch: java.lang.Throwable -> L12b
            lb1 r22 = p000.lb1.f6537     // Catch: java.lang.Throwable -> L12b
            org.json.JSONObject r6 = r6.f3473     // Catch: java.lang.Throwable -> L12b
            java.lang.Object r15 = p000.AbstractC0984xh.m6638(r1)     // Catch: java.lang.Throwable -> L12b
            gb1 r15 = (p000.gb1) r15     // Catch: java.lang.Throwable -> L12b
            r23 = r6
            long r5 = r15.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Object r15 = p000.AbstractC0984xh.m6638(r1)     // Catch: java.lang.Throwable -> L12b
            gb1 r15 = (p000.gb1) r15     // Catch: java.lang.Throwable -> L12b
            r18 = r3
            long r2 = r15.f4306     // Catch: java.lang.Throwable -> L12b
            r26 = r2
            r24 = r5
            kb1 r2 = r22.m3543(r23, r24, r26)     // Catch: java.lang.Throwable -> L12b
            boolean r3 = r2.f5836     // Catch: java.lang.Throwable -> L12b
            if (r3 != 0) goto L3ab
            java.util.LinkedHashSet r15 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L12b
            r15.<init>()     // Catch: java.lang.Throwable -> L12b
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L12b
            r2.<init>()     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r16 = r1.iterator()     // Catch: java.lang.Throwable -> L12b
        L262:
            boolean r1 = r16.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r1 == 0) goto L39f
            java.lang.Object r1 = r16.next()     // Catch: java.lang.Throwable -> L12b
            gb1 r1 = (p000.gb1) r1     // Catch: java.lang.Throwable -> L12b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12b
            r4 = 10
            int r5 = p000.AbstractC1021yh.m6889(r14, r4)     // Catch: java.lang.Throwable -> L12b
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r5 = r14.iterator()     // Catch: java.lang.Throwable -> L12b
        L27d:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r6 == 0) goto L2a1
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L12b
            r23 = r6
            org.json.JSONObject r23 = (org.json.JSONObject) r23     // Catch: java.lang.Throwable -> L12b
            lb1 r22 = p000.lb1.f6537     // Catch: java.lang.Throwable -> L12b
            r6 = r5
            long r4 = r1.f4304     // Catch: java.lang.Throwable -> L12b
            r24 = r4
            long r4 = r1.f4306     // Catch: java.lang.Throwable -> L12b
            r26 = r4
            kb1 r4 = r22.m3543(r23, r24, r26)     // Catch: java.lang.Throwable -> L12b
            r3.add(r4)     // Catch: java.lang.Throwable -> L12b
            r5 = r6
            r4 = 10
            goto L27d
        L2a1:
            java.util.Iterator r4 = r3.iterator()     // Catch: java.lang.Throwable -> L12b
            r5 = 0
        L2a6:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r6 == 0) goto L2b6
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L12b
            kb1 r6 = (p000.kb1) r6     // Catch: java.lang.Throwable -> L12b
            int r6 = r6.f5835     // Catch: java.lang.Throwable -> L12b
            int r5 = r5 + r6
            goto L2a6
        L2b6:
            if (r5 != 0) goto L2ce
            long r3 = r1.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L12b
            r15.add(r1)     // Catch: java.lang.Throwable -> L12b
        L2c1:
            r22 = r10
            r21 = r13
            r17 = r14
            r10 = 10
            r18 = 1
            r13 = r2
            goto L396
        L2ce:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12b
            r4.<init>()     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> L12b
        L2d7:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r6 == 0) goto L2e9
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L12b
            kb1 r6 = (p000.kb1) r6     // Catch: java.lang.Throwable -> L12b
            java.util.List r6 = r6.f5843     // Catch: java.lang.Throwable -> L12b
            p000.AbstractC0984xh.m6660(r4, r6)     // Catch: java.lang.Throwable -> L12b
            goto L2d7
        L2e9:
            java.util.Set r4 = p000.AbstractC0984xh.m6670(r4)     // Catch: java.lang.Throwable -> L12b
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)     // Catch: java.lang.Throwable -> L12b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12b
            r5.<init>()     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L12b
        L2fa:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r6 == 0) goto L30c
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L12b
            kb1 r6 = (p000.kb1) r6     // Catch: java.lang.Throwable -> L12b
            java.util.List r6 = r6.f5834     // Catch: java.lang.Throwable -> L12b
            p000.AbstractC0984xh.m6660(r5, r6)     // Catch: java.lang.Throwable -> L12b
            goto L2fa
        L30c:
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r5)     // Catch: java.lang.Throwable -> L12b
            java.util.List r3 = p000.AbstractC0984xh.m6666(r3)     // Catch: java.lang.Throwable -> L12b
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L12b
            r6 = 1
            if (r5 != r6) goto L32b
            hb1 r3 = new hb1     // Catch: java.lang.Throwable -> L12b
            java.lang.Object r4 = p000.AbstractC0984xh.m6655(r4)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L12b
            uc1 r5 = p000.uc1.f10692     // Catch: java.lang.Throwable -> L12b
            java.lang.String r6 = "world_relation_batch"
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L12b
            goto L344
        L32b:
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L12b
            r6 = 1
            if (r4 != r6) goto L343
            hb1 r4 = new hb1     // Catch: java.lang.Throwable -> L12b
            java.lang.Object r3 = p000.AbstractC0984xh.m6655(r3)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L12b
            uc1 r5 = p000.uc1.f10693     // Catch: java.lang.Throwable -> L12b
            java.lang.String r6 = "world_relation_batch_sec_pet"
            r4.<init>(r3, r5, r6)     // Catch: java.lang.Throwable -> L12b
            r3 = r4
            goto L344
        L343:
            r3 = 0
        L344:
            if (r3 != 0) goto L353
            long r3 = r1.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r3 = "关系身份候选不唯一或缺失"
            r2.put(r1, r3)     // Catch: java.lang.Throwable -> L12b
            goto L2c1
        L353:
            r4 = r2
            r5 = r3
            long r2 = r1.f4304     // Catch: java.lang.Throwable -> L12b
            r6 = r4
            java.lang.String r4 = r1.f4305     // Catch: java.lang.Throwable -> L12b
            r20 = r5
            r18 = r6
            long r5 = r1.f4306     // Catch: java.lang.Throwable -> L12b
            r22 = r10
            r21 = r13
            r17 = r14
            r13 = r18
            r10 = 10
            r18 = 1
            r14 = r1
            r1 = r20
            java.lang.Object r1 = p000.ln0.m3653(r0, r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L12b
            boolean r2 = r1 instanceof p000.eo1     // Catch: java.lang.Throwable -> L12b
            if (r2 != 0) goto L383
            r2 = r1
            vc1 r2 = (p000.vc1) r2     // Catch: java.lang.Throwable -> L12b
            long r3 = r14.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L12b
            r9.put(r3, r2)     // Catch: java.lang.Throwable -> L12b
        L383:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)     // Catch: java.lang.Throwable -> L12b
            if (r1 == 0) goto L396
            long r2 = r14.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r1 = p000.ln0.m3647(r1)     // Catch: java.lang.Throwable -> L12b
            r13.put(r2, r1)     // Catch: java.lang.Throwable -> L12b
        L396:
            r2 = r13
            r14 = r17
            r13 = r21
            r10 = r22
            goto L262
        L39f:
            r22 = r10
            r21 = r13
            r13 = r2
            fb1 r1 = new fb1     // Catch: java.lang.Throwable -> L12b
            r1.<init>(r9, r15, r13)     // Catch: java.lang.Throwable -> L12b
            goto L481
        L3ab:
            r22 = r10
            r21 = r13
            r17 = r14
            r10 = 10
            java.lang.Integer r2 = r2.f5837     // Catch: java.lang.Throwable -> L12b
            if (r2 == 0) goto L3bc
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L12b
            goto L3be
        L3bc:
            int r2 = r4 + 10
        L3be:
            if (r2 > r4) goto L3fa
            nz r2 = p000.C0604nz.f7825     // Catch: java.lang.Throwable -> L12b
            int r3 = p000.AbstractC1021yh.m6889(r1, r10)     // Catch: java.lang.Throwable -> L12b
            int r3 = p000.ex0.m1970(r3)     // Catch: java.lang.Throwable -> L12b
            r5 = 16
            if (r3 >= r5) goto L3d1
            r5 = 16
            goto L3d2
        L3d1:
            r5 = r3
        L3d2:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L12b
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L12b
        L3db:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r4 == 0) goto L3f3
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L12b
            gb1 r4 = (p000.gb1) r4     // Catch: java.lang.Throwable -> L12b
            long r4 = r4.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r5 = "分页 offset 未递增"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L12b
            goto L3db
        L3f3:
            fb1 r1 = new fb1     // Catch: java.lang.Throwable -> L12b
            r1.<init>(r9, r2, r3)     // Catch: java.lang.Throwable -> L12b
            goto L481
        L3fa:
            int r3 = r18 + 1
            r4 = r2
            r2 = r10
            r14 = r17
            r13 = r21
            r10 = r22
            goto L197
        L406:
            r22 = r10
            r21 = r13
            r10 = r2
            java.lang.String r2 = p000.ln0.m3647(r15)     // Catch: java.lang.Throwable -> L12b
            nz r3 = p000.C0604nz.f7825     // Catch: java.lang.Throwable -> L12b
            int r4 = p000.AbstractC1021yh.m6889(r1, r10)     // Catch: java.lang.Throwable -> L12b
            int r4 = p000.ex0.m1970(r4)     // Catch: java.lang.Throwable -> L12b
            r5 = 16
            if (r4 >= r5) goto L420
            r5 = 16
            goto L421
        L420:
            r5 = r4
        L421:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L12b
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L12b
        L42a:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r5 == 0) goto L440
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L12b
            gb1 r5 = (p000.gb1) r5     // Catch: java.lang.Throwable -> L12b
            long r5 = r5.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L12b
            r4.put(r5, r2)     // Catch: java.lang.Throwable -> L12b
            goto L42a
        L440:
            fb1 r1 = new fb1     // Catch: java.lang.Throwable -> L12b
            r1.<init>(r9, r3, r4)     // Catch: java.lang.Throwable -> L12b
            goto L481
        L446:
            r22 = r10
            r21 = r13
            r10 = r2
            nz r2 = p000.C0604nz.f7825     // Catch: java.lang.Throwable -> L12b
            int r3 = p000.AbstractC1021yh.m6889(r1, r10)     // Catch: java.lang.Throwable -> L12b
            int r3 = p000.ex0.m1970(r3)     // Catch: java.lang.Throwable -> L12b
            r5 = 16
            if (r3 >= r5) goto L45a
            goto L45b
        L45a:
            r5 = r3
        L45b:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L12b
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L12b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L12b
        L464:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L12b
            if (r4 == 0) goto L47c
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L12b
            gb1 r4 = (p000.gb1) r4     // Catch: java.lang.Throwable -> L12b
            long r4 = r4.f4304     // Catch: java.lang.Throwable -> L12b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r5 = "关系列表分页超过安全上限"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L12b
            goto L464
        L47c:
            fb1 r1 = new fb1     // Catch: java.lang.Throwable -> L12b
            r1.<init>(r9, r2, r3)     // Catch: java.lang.Throwable -> L12b
        L481:
            monitor-exit(r8)
            java.lang.String r2 = "r7ce9b41b1577bc7d"
            int r3 = r21.size()
            java.util.LinkedHashMap r4 = r1.f3861
            int r4 = r4.size()
            java.lang.Object r5 = r1.f3862
            int r5 = r5.size()
            java.lang.Object r6 = r1.f3863
            int r6 = r6.size()
            java.lang.String r8 = "身份批量解析完成 待联网="
            java.lang.String r9 = " 可用上下文="
            java.lang.String r10 = " 无小火人="
            java.lang.StringBuilder r3 = p000.AbstractC0602nx.m4136(r8, r3, r9, r4, r10)
            r3.append(r5)
            java.lang.String r4 = " 验证失败="
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            r4 = 0
            r5 = 4
            p000.C0888ux.m5992(r2, r3, r4, r5, r4)
            java.util.Iterator r2 = r22.iterator()
            r3 = 0
            r24 = 0
            r25 = 0
            r29 = 0
            r30 = 0
        L4c5:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L7bd
            java.lang.Object r4 = r2.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L7b8
            ec1 r4 = (p000.ec1) r4
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.jc1.f5425
            boolean r6 = r6.get()
            if (r6 != 0) goto L7a1
            xn0 r6 = p000.xn0.f12237
            id r8 = r4.f3487
            boolean r8 = p000.xn0.m6723(r8, r11, r7)
            r9 = 48
            if (r8 != 0) goto L54a
            id r6 = r4.f3487
            if (r6 == 0) goto L4f9
            zd1 r6 = r6.f5005
            if (r6 == 0) goto L4f9
            java.util.List r6 = r6.f13051
            int r6 = r6.size()
            int r25 = r6 + r25
        L4f9:
            java.lang.String r6 = "已使用当天缓存"
            r8 = r38
            r10 = r22
            m2945(r8, r4, r3, r10, r6)
            java.lang.String r6 = "r7ce9b41b1577bc7d"
            int r13 = r10.size()
            java.lang.String r14 = r4.f3484
            java.lang.String r9 = m2950(r14, r9)
            long r14 = r4.f3481
            id r4 = r4.f3487
            if (r4 == 0) goto L517
            zd1 r4 = r4.f5005
            goto L518
        L517:
            r4 = 0
        L518:
            java.lang.String r4 = m2929(r4)
            r37 = r2
            java.lang.String r2 = "刷新进度 "
            java.lang.String r7 = "/"
            r16 = r11
            java.lang.String r11 = " name="
            java.lang.StringBuilder r2 = p000.AbstractC0602nx.m4136(r2, r5, r7, r13, r11)
            r2.append(r9)
            java.lang.String r7 = " shortId="
            r2.append(r7)
            r2.append(r14)
            java.lang.String r7 = " result=cache "
            java.lang.String r2 = p000.lz1.m3691(r2, r7, r4)
            r4 = 0
            r7 = 4
            p000.C0888ux.m5992(r6, r2, r4, r7, r4)
            m2944(r8, r3, r10)
            r21 = r1
            r11 = r16
        L547:
            r4 = 0
            goto L7ab
        L54a:
            r8 = r38
            r37 = r2
            r16 = r11
            r10 = r22
            r7 = 4
            java.lang.String r2 = "正在查询实时状态"
            m2945(r8, r4, r3, r10, r2)
            java.lang.Object r2 = r1.f3862
            long r11 = r4.f3481
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            boolean r2 = r2.contains(r11)
            if (r2 == 0) goto L5ba
            int r29 = r29 + 1
            id r11 = new id
            long r12 = r4.f3481
            pd r14 = p000.EnumC0683pd.f8503
            r19 = 0
            r20 = 496(0x1f0, float:6.95E-43)
            r15 = 0
            r18 = 0
            r11.<init>(r12, r14, r15, r16, r18, r19, r20)
            r2 = r11
            r11 = r16
            r6.m6770(r2)
            java.lang.String r2 = "未检测到小火人，已排除后续任务"
            m2945(r8, r4, r3, r10, r2)
            java.lang.String r2 = "r7ce9b41b1577bc7d"
            int r6 = r10.size()
            java.lang.String r13 = r4.f3484
            java.lang.String r9 = m2950(r13, r9)
            long r13 = r4.f3481
            java.lang.String r4 = "刷新进度 "
            java.lang.String r15 = "/"
            java.lang.String r7 = " name="
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4136(r4, r5, r15, r6, r7)
            r4.append(r9)
            java.lang.String r6 = " shortId="
            r4.append(r6)
            r4.append(r13)
            java.lang.String r6 = " result=no_pet_relation action=skip"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 0
            r7 = 4
            p000.C0888ux.m5992(r2, r4, r6, r7, r6)
            m2944(r8, r3, r10)
            r21 = r1
            goto L547
        L5ba:
            r11 = r16
            java.util.LinkedHashMap r2 = r1.f3861
            long r13 = r4.f3481
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            java.lang.Object r2 = r2.get(r7)
            vc1 r2 = (p000.vc1) r2
            if (r2 != 0) goto L637
            int r30 = r30 + 1
            long r13 = r4.f3481
            r6.m6766(r13, r11)
            java.lang.Object r2 = r1.f3863
            long r6 = r4.f3481
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L5e5
            java.lang.String r2 = ""
        L5e5:
            boolean r6 = p000.q02.m4671(r2)
            if (r6 == 0) goto L5ed
            java.lang.String r2 = "未返回上下文或明确关系分类"
        L5ed:
            r6 = 60
            java.lang.String r6 = p000.q02.m4693(r2, r6)
            java.lang.String r7 = "上下文获取失败："
            java.lang.String r6 = r7.concat(r6)
            m2945(r8, r4, r3, r10, r6)
            java.lang.String r6 = "r7ce9b41b1577bc7d"
            int r7 = r10.size()
            java.lang.String r13 = r4.f3484
            java.lang.String r9 = m2950(r13, r9)
            long r13 = r4.f3481
            r4 = 160(0xa0, float:2.24E-43)
            java.lang.String r2 = m2950(r2, r4)
            java.lang.String r4 = "刷新进度 "
            java.lang.String r15 = "/"
            r21 = r1
            java.lang.String r1 = " name="
            java.lang.StringBuilder r1 = p000.AbstractC0602nx.m4136(r4, r5, r15, r7, r1)
            r1.append(r9)
            java.lang.String r4 = " shortId="
            r1.append(r4)
            r1.append(r13)
            java.lang.String r4 = " result=context_failed detail="
            java.lang.String r1 = p000.lz1.m3691(r1, r4, r2)
            r4 = 0
            r7 = 4
            p000.C0888ux.m5992(r6, r1, r4, r7, r4)
            m2944(r8, r3, r10)
            goto L547
        L637:
            r21 = r1
            java.lang.Object r1 = p000.i81.m2663(r0, r2)
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L643
            r2 = 0
            goto L644
        L643:
            r2 = r1
        L644:
            ab1 r2 = (p000.ab1) r2
            if (r2 == 0) goto L64c
            zd1 r7 = r2.f175
            r15 = r7
            goto L64d
        L64c:
            r15 = 0
        L64d:
            if (r2 == 0) goto L6ef
            boolean r7 = r2.m54()
            if (r7 == 0) goto L6ef
            zd1 r7 = r2.f175
            if (r7 == 0) goto L6ef
            if (r15 == 0) goto L6ef
            kd1 r1 = p000.kd1.f5861
            java.util.List r1 = r1.m3202()
            id r7 = new id
            long r13 = r4.f3481
            r16 = r13
            pd r14 = p000.EnumC0683pd.f8502
            java.lang.Long r18 = r15.m7127()
            qc1 r13 = p000.qc1.f8961
            java.lang.Long r19 = p000.qc1.m4856(r15, r1, r11)
            r20 = 448(0x1c0, float:6.28E-43)
            r33 = r16
            r16 = r11
            r12 = r33
            r11 = r7
            r11.<init>(r12, r14, r15, r16, r18, r19, r20)
            r6.m6770(r11)
            int r24 = r24 + 1
            java.util.List r1 = r15.f13051
            int r1 = r1.size()
            int r25 = r1 + r25
            java.util.ArrayList r1 = r15.m7126()
            int r1 = r1.size()
            java.util.ArrayList r6 = r15.m7123()
            int r6 = r6.size()
            java.lang.String r7 = "状态已更新：成熟 "
            java.lang.String r11 = "，空闲 "
            java.lang.String r1 = p000.AbstractC0602nx.m4125(r1, r6, r7, r11)
            m2945(r8, r4, r3, r10, r1)
            java.lang.String r1 = "r7ce9b41b1577bc7d"
            int r6 = r10.size()
            java.lang.String r7 = r4.f3484
            java.lang.String r7 = m2950(r7, r9)
            long r11 = r4.f3481
            java.lang.String r2 = m2947(r2)
            java.lang.String r4 = m2929(r15)
            java.lang.String r9 = "刷新进度 "
            java.lang.String r13 = "/"
            java.lang.String r14 = " name="
            java.lang.StringBuilder r6 = p000.AbstractC0602nx.m4136(r9, r5, r13, r6, r14)
            r6.append(r7)
            java.lang.String r7 = " shortId="
            r6.append(r7)
            r6.append(r11)
            java.lang.String r7 = " result=available "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " "
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            r4 = 0
            r7 = 4
            p000.C0888ux.m5992(r1, r2, r4, r7, r4)
            r11 = r16
            goto L79d
        L6ef:
            r16 = r11
            if (r2 == 0) goto L74d
            boolean r7 = r2.m54()
            if (r7 == 0) goto L74d
            zd1 r7 = r2.f175
            if (r7 != 0) goto L74d
            int r29 = r29 + 1
            id r11 = new id
            long r12 = r4.f3481
            pd r14 = p000.EnumC0683pd.f8504
            r19 = 0
            r20 = 496(0x1f0, float:6.95E-43)
            r15 = 0
            r18 = 0
            r11.<init>(r12, r14, r15, r16, r18, r19, r20)
            r1 = r11
            r11 = r16
            r6.m6770(r1)
            java.lang.String r1 = "暂无营地，已排除后续任务"
            m2945(r8, r4, r3, r10, r1)
            java.lang.String r1 = "r7ce9b41b1577bc7d"
            int r6 = r10.size()
            java.lang.String r7 = r4.f3484
            java.lang.String r7 = m2950(r7, r9)
            long r13 = r4.f3481
            java.lang.String r2 = m2947(r2)
            java.lang.String r4 = "刷新进度 "
            java.lang.String r9 = "/"
            java.lang.String r15 = " name="
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4136(r4, r5, r9, r6, r15)
            r4.append(r7)
            java.lang.String r6 = " shortId="
            r4.append(r6)
            r4.append(r13)
            java.lang.String r6 = " result=no_camp action=skip "
            java.lang.String r2 = p000.lz1.m3691(r4, r6, r2)
            r4 = 0
            r7 = 4
            p000.C0888ux.m5992(r1, r2, r4, r7, r4)
            goto L79d
        L74d:
            r11 = r16
            int r30 = r30 + 1
            long r13 = r4.f3481
            r6.m6766(r13, r11)
            java.lang.String r6 = "刷新失败，等待下次重试"
            m2945(r8, r4, r3, r10, r6)
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L766
            java.lang.String r1 = m2949(r1)
            goto L76f
        L766:
            if (r2 == 0) goto L76d
            java.lang.String r1 = m2947(r2)
            goto L76f
        L76d:
            java.lang.String r1 = "empty_result"
        L76f:
            java.lang.String r2 = "r7ce9b41b1577bc7d"
            int r6 = r10.size()
            java.lang.String r7 = r4.f3484
            java.lang.String r7 = m2950(r7, r9)
            long r13 = r4.f3481
            java.lang.String r4 = "刷新进度 "
            java.lang.String r9 = "/"
            java.lang.String r15 = " name="
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4136(r4, r5, r9, r6, r15)
            r4.append(r7)
            java.lang.String r6 = " shortId="
            r4.append(r6)
            r4.append(r13)
            java.lang.String r6 = " result=request_failed detail="
            java.lang.String r1 = p000.lz1.m3691(r4, r6, r1)
            r4 = 0
            r7 = 4
            p000.C0888ux.m5992(r2, r1, r4, r7, r4)
        L79d:
            m2944(r8, r3, r10)
            goto L7ab
        L7a1:
            r8 = r38
            r21 = r1
            r37 = r2
            r10 = r22
            goto L547
        L7ab:
            r7 = r36
            r2 = r37
            r3 = r5
            r38 = r8
            r22 = r10
            r1 = r21
            goto L4c5
        L7b8:
            r4 = 0
            p000.AbstractC1021yh.m6917()
            throw r4
        L7bd:
            dc1 r23 = new dc1
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.jc1.f5425
            boolean r31 = r0.get()
            r32 = 284(0x11c, float:3.98E-43)
            r26 = 0
            r27 = 0
            r28 = 0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.String r0 = "r7ce9b41b1577bc7d"
            java.lang.String r1 = r23.m1696()
            java.lang.String r2 = "刷新完成 "
            java.lang.String r1 = r2.concat(r1)
            r4 = 0
            r7 = 4
            p000.C0888ux.m5992(r0, r1, r4, r7, r4)
            return r23
        L7e2:
            monitor-exit(r8)
            throw r0
        L7e4:
            dc1 r9 = new dc1
            r17 = 0
            r18 = 444(0x1bc, float:6.22E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r9
    }

    /* JADX INFO: renamed from: ο */
    public static final void m2944(p000.a80 r5, int r6, java.util.ArrayList r7) {
            if (r5 == 0) goto L20
            gc1 r0 = new gc1
            int r6 = r6 + 1
            int r1 = r7.size()
            java.lang.String r2 = "/"
            java.lang.String r3 = " 位人员"
            java.lang.String r4 = "已处理 "
            java.lang.String r1 = p000.AbstractC0602nx.m4128(r4, r6, r2, r1, r3)
            int r7 = r7.size()
            r2 = 496(0x1f0, float:6.95E-43)
            r0.<init>(r6, r7, r2, r1)
            r5.invoke(r0)
        L20:
            return
    }

    /* JADX INFO: renamed from: π */
    public static void m2945(p000.a80 r2, p000.ec1 r3, int r4, java.util.ArrayList r5, java.lang.String r6) {
            if (r2 == 0) goto L18
            gc1 r0 = new gc1
            java.lang.String r3 = r3.f3484
            java.lang.String r1 = " · "
            java.lang.String r3 = p000.lz1.m3688(r3, r1, r6)
            int r5 = r5.size()
            r6 = 480(0x1e0, float:6.73E-43)
            r0.<init>(r4, r5, r6, r3)
            r2.invoke(r0)
        L18:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public static void m2946(android.app.Activity r3, p000.a80 r4) {
            r3.getClass()
            boolean r0 = p000.AbstractC0976x9.m6528()
            if (r0 != 0) goto L1e
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "营地功能仅限内测用户使用"
            r3.<init>(r0)
            eo1 r0 = new eo1
            r0.<init>(r3)
            fo1 r3 = new fo1
            r3.<init>(r0)
            r4.invoke(r3)
            return
        L1e:
            java.lang.Thread r0 = new java.lang.Thread
            ii0 r1 = new ii0
            r2 = 8
            r1.<init>(r3, r2, r4)
            java.lang.String r3 = "r159a003294a3c97d"
            r0.<init>(r1, r3)
            r3 = 1
            r0.setDaemon(r3)
            r0.start()
            return
    }

    /* JADX INFO: renamed from: σ */
    public static java.lang.String m2947(p000.ab1 r6) {
            int r0 = r6.f171
            java.lang.Integer r1 = r6.f172
            if (r1 == 0) goto Lb
            int r1 = r1.intValue()
            goto Lc
        Lb:
            r1 = -1
        Lc:
            int r2 = r6.f173
            java.lang.String r6 = r6.f174
            if (r6 != 0) goto L14
            java.lang.String r6 = ""
        L14:
            r3 = 80
            java.lang.String r6 = m2950(r6, r3)
            java.lang.String r3 = " http="
            java.lang.String r4 = " code="
            java.lang.String r5 = "bridge="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r5, r0, r3, r1, r4)
            r0.append(r2)
            java.lang.String r1 = " message="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    /* JADX INFO: renamed from: τ */
    public static p000.hc1 m2948(long r10, p000.ec1 r12, p000.EnumC0619od r13, p000.lc1 r14, p000.p70 r15) {
            java.util.concurrent.ConcurrentHashMap r0 = p000.je1.f5443     // Catch: java.lang.Throwable -> Ld
            long r0 = r12.f3481     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r10 = p000.je1.m2956(r0, r10, r15)     // Catch: java.lang.Throwable -> Ld
            fo1 r10 = (p000.fo1) r10     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r10 = r10.f4054     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            r10 = move-exception
            eo1 r11 = new eo1
            r11.<init>(r10)
            r10 = r11
        L14:
            boolean r11 = r10 instanceof p000.eo1
            r15 = 0
            if (r11 == 0) goto L1b
            r0 = r15
            goto L1c
        L1b:
            r0 = r10
        L1c:
            kc1 r0 = (p000.kc1) r0
            r1 = 0
            if (r0 == 0) goto L29
            boolean r2 = r0.m3187()
            r3 = 1
            if (r2 != r3) goto L29
            r1 = r3
        L29:
            r2 = 80
            if (r11 == 0) goto L44
            java.lang.Throwable r11 = p000.fo1.m2190(r10)
            if (r11 == 0) goto L3e
            java.lang.String r11 = m2949(r11)
            java.lang.String r3 = "error="
            java.lang.String r11 = r3.concat(r11)
            goto L84
        L3e:
            java.lang.String r10 = "Required value was null."
            p000.C1080.m7279(r10)
            return r15
        L44:
            if (r0 != 0) goto L49
            java.lang.String r11 = "error=empty_result"
            goto L84
        L49:
            int r11 = r0.f5850
            java.lang.Integer r3 = r0.f5851
            if (r3 == 0) goto L54
            int r3 = r3.intValue()
            goto L55
        L54:
            r3 = -1
        L55:
            int r4 = r0.f5852
            java.lang.Boolean r5 = r0.f5854
            java.lang.String r6 = r0.f5853
            if (r6 != 0) goto L5f
            java.lang.String r6 = ""
        L5f:
            java.lang.String r6 = m2950(r6, r2)
            java.lang.String r7 = " http="
            java.lang.String r8 = " code="
            java.lang.String r9 = "bridge="
            java.lang.StringBuilder r11 = p000.AbstractC0602nx.m4136(r9, r11, r7, r3, r8)
            r11.append(r4)
            java.lang.String r3 = " success="
            r11.append(r3)
            r11.append(r5)
            java.lang.String r3 = " message="
            r11.append(r3)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
        L84:
            java.lang.String r13 = m2930(r13)
            if (r1 == 0) goto L8d
            java.lang.String r1 = "success"
            goto L8f
        L8d:
            java.lang.String r1 = "failed"
        L8f:
            java.lang.String r3 = m2951(r12)
            long r4 = r12.f3481
            java.lang.String r12 = r14.f6544
            java.lang.String r12 = m2950(r12, r2)
            java.lang.String r14 = " result="
            java.lang.String r2 = " name="
            java.lang.String r6 = "写请求 action="
            java.lang.StringBuilder r13 = p000.lz1.m3695(r6, r13, r14, r1, r2)
            r13.append(r3)
            java.lang.String r14 = " shortId="
            r13.append(r14)
            r13.append(r4)
            java.lang.String r14 = " plot="
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = " "
            r13.append(r12)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12 = 4
            java.lang.String r13 = "r7ce9b41b1577bc7d"
            p000.C0888ux.m5992(r13, r11, r15, r12, r15)
            hc1 r11 = new hc1
            java.lang.Throwable r10 = p000.fo1.m2190(r10)
            r11.<init>(r0, r10)
            return r11
    }

    /* JADX INFO: renamed from: υ */
    public static java.lang.String m2949(java.lang.Throwable r2) {
            f71 r0 = new f71
            r1 = 16
            r0.<init>(r1)
            ss1 r2 = p000.us1.m5954(r2, r0)
            java.lang.Object r2 = p000.us1.m5956(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L19
            java.lang.String r0 = ""
        L19:
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L27
            java.lang.Class r2 = r2.getClass()
            java.lang.String r0 = r2.getSimpleName()
        L27:
            r2 = 160(0xa0, float:2.24E-43)
            java.lang.String r2 = m2950(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: φ */
    public static java.lang.String m2950(java.lang.String r2, int r3) {
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

    /* JADX INFO: renamed from: χ */
    public static java.lang.String m2951(p000.ec1 r1) {
            java.lang.String r1 = r1.f3484
            r0 = 48
            java.lang.String r1 = m2950(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ψ */
    public static p000.ec1 m2952(p000.ec1 r12, java.util.Map r13) {
            long r0 = r12.f3481
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r13 = r13.get(r0)
            java.util.Set r13 = (java.util.Set) r13
            if (r13 != 0) goto Lf
            goto L18
        Lf:
            id r0 = r12.f3487
            if (r0 != 0) goto L14
            goto L18
        L14:
            zd1 r1 = r0.f5005
            if (r1 != 0) goto L19
        L18:
            return r12
        L19:
            zd1 r13 = m2953(r1, r13)
            r1 = 507(0x1fb, float:7.1E-43)
            id r11 = p000.C0392id.m2740(r0, r13, r1)
            long r3 = r12.f3481
            java.lang.String r5 = r12.f3482
            long r6 = r12.f3483
            java.lang.String r8 = r12.f3484
            sd r9 = r12.f3485
            sd r10 = r12.f3486
            ec1 r2 = new ec1
            r2.<init>(r3, r5, r6, r8, r9, r10, r11)
            return r2
    }

    /* JADX INFO: renamed from: ω */
    public static p000.zd1 m2953(p000.zd1 r4, java.util.Set r5) {
            r4.getClass()
            if (r5 != 0) goto L6
            return r4
        L6:
            java.util.List r0 = r4.f13051
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            r3 = r2
            lc1 r3 = (p000.lc1) r3
            java.lang.String r3 = r3.f6544
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L11
            r1.add(r2)
            goto L11
        L2a:
            r5 = 0
            r0 = 4079(0xfef, float:5.716E-42)
            zd1 r4 = p000.zd1.m7121(r4, r1, r5, r0)
            return r4
    }
}
