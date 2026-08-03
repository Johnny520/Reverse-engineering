package ra;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ra.c f11833b;

    public /* synthetic */ b(ra.c r1, int r2) {
            r0 = this;
            r0.f11832a = r2
            r0.f11833b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r15) {
            r14 = this;
            int r0 = r14.f11832a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r15)
            return
        L9:
            java.lang.String r0 = ""
            java.lang.String r1 = "拆红包完成: sendid="
            java.lang.String r2 = "拆红包完成但未取到本人实收金额: sendid="
            ra.c r3 = r14.f11833b
            java.lang.Object r4 = r3.f11838e
            na.k r4 = (na.k) r4
            java.lang.Object r5 = r3.f11837d
            l3.l r5 = (l3.l) r5
            boolean r5 = r5.f()
            if (r5 != 0) goto L21
            goto L162
        L21:
            java.lang.Object[] r5 = r15.args     // Catch: java.lang.Throwable -> L2e
            r6 = 0
            if (r5 == 0) goto L32
            int r7 = r5.length     // Catch: java.lang.Throwable -> L2e
            r8 = 2
            if (r7 <= r8) goto L32
            r5 = r5[r8]     // Catch: java.lang.Throwable -> L2e
            r9 = r5
            goto L33
        L2e:
            r0 = move-exception
            r15 = r0
            goto L14d
        L32:
            r9 = r6
        L33:
            if (r9 == 0) goto L48
            java.lang.String r5 = "sendId"
            java.lang.String r5 = x6.d.a0(r9, r5)     // Catch: java.lang.Throwable -> L2e
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto L49
            java.lang.String r5 = "sendid"
            java.lang.String r5 = x6.d.a0(r9, r5)     // Catch: java.lang.Throwable -> L2e
            goto L49
        L48:
            r5 = r6
        L49:
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto L66
            java.util.Set r7 = r4.f9191p     // Catch: java.lang.Throwable -> L2e
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L2e
            r8 = 1
            if (r7 != r8) goto L66
            java.util.Set r7 = r4.f9191p     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L66
            java.lang.Object r7 = r7.next()     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L66
            r8 = r7
            goto L67
        L66:
            r8 = r5
        L67:
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L162
            java.util.Set r5 = r4.f9191p     // Catch: java.lang.Throwable -> L2e
            boolean r5 = r5.contains(r8)     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L77
            goto L162
        L77:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = "redpacket_open_timeout:"
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L2e
            r5.append(r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2e
            ra.c.c(r5)     // Catch: java.lang.Throwable -> L2e
            r5 = 0
            java.lang.Object[] r15 = r15.args     // Catch: java.lang.Throwable -> L9c
            if (r15 == 0) goto L9c
            int r7 = r15.length     // Catch: java.lang.Throwable -> L9c
            if (r7 <= 0) goto L9c
            r15 = r15[r5]     // Catch: java.lang.Throwable -> L9c
            boolean r7 = r15 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L9c
            if (r7 == 0) goto L9c
            java.lang.Number r15 = (java.lang.Number) r15     // Catch: java.lang.Throwable -> L9c
            int r5 = r15.intValue()     // Catch: java.lang.Throwable -> L9c
        L9c:
            java.lang.String r5 = x6.d.w(r5, r9)     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ConcurrentHashMap r15 = r4.f9186k     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r15 = r15.get(r8)     // Catch: java.lang.Throwable -> L2e
            java.util.Map r15 = (java.util.Map) r15     // Catch: java.lang.Throwable -> L2e
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto Lb0
            goto L129
        Lb0:
            java.lang.String r7 = "[^0-9.\\-]"
            java.lang.String r7 = r5.replaceAll(r7, r0)     // Catch: java.lang.Throwable -> L129
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L129
            if (r10 != 0) goto L129
            double r10 = java.lang.Double.parseDouble(r7)     // Catch: java.lang.Throwable -> L129
            r12 = 4517329193108106637(0x3eb0c6f7a0b5ed8d, double:1.0E-6)
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 <= 0) goto L129
            if (r15 == 0) goto Ld4
            java.lang.String r2 = "talker"
            java.lang.Object r2 = r15.get(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2e
            goto Ld5
        Ld4:
            r2 = r6
        Ld5:
            java.util.Set r7 = r4.f9191p     // Catch: java.lang.Throwable -> L2e
            r7.remove(r8)     // Catch: java.lang.Throwable -> L2e
            java.util.Set r4 = r4.f9192q     // Catch: java.lang.Throwable -> L2e
            r4.add(r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r4.append(r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = " amount="
            r4.append(r1)     // Catch: java.lang.Throwable -> L2e
            r4.append(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = " talker="
            r4.append(r1)     // Catch: java.lang.Throwable -> L2e
            r4.append(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L2e
            r3.j(r1)     // Catch: java.lang.Throwable -> L2e
            if (r15 == 0) goto L109
            java.lang.String r1 = "nativeurl"
            java.lang.Object r15 = r15.get(r1)     // Catch: java.lang.Throwable -> L2e
            r6 = r15
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2e
        L109:
            r7 = r6
            boolean r15 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L2e
            if (r15 != 0) goto L11b
            java.lang.Object r15 = r3.f11840g     // Catch: java.lang.Throwable -> L2e
            ke.h r15 = (ke.h) r15     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r15 = r15.f7599h     // Catch: java.lang.Throwable -> L2e
            b5.c r15 = (b5.c) r15     // Catch: java.lang.Throwable -> L2e
            r15.y(r7)     // Catch: java.lang.Throwable -> L2e
        L11b:
            java.lang.Object r15 = r3.f11841h     // Catch: java.lang.Throwable -> L2e
            r4 = r15
            na.b r4 = (na.b) r4     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L124
            r6 = r2
            goto L125
        L124:
            r6 = r0
        L125:
            r4.c(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2e
            goto L162
        L129:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2e
            r0.append(r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = " json="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L2e
            r0.append(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e
            r3.j(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "未抢到本人实收金额"
            r3.n(r0, r15)     // Catch: java.lang.Throwable -> L2e
            r3.d(r8)     // Catch: java.lang.Throwable -> L2e
            goto L162
        L14d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ERROR openCallback: "
            r0.<init>(r1)
            java.lang.String r15 = r15.getMessage()
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r3.j(r15)
        L162:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r27) {
            r26 = this;
            r1 = r26
            r0 = r27
            int r2 = r1.f11832a
            switch(r2) {
                case 0: goto Ld;
                default: goto L9;
            }
        L9:
            super.beforeHookedMethod(r27)
            return
        Ld:
            java.lang.String r2 = "拆红包发包失败"
            java.lang.String r3 = "拆红包请求构造失败"
            java.lang.String r4 = "nickname"
            java.lang.String r5 = "headimg"
            java.lang.String r6 = "channelid"
            java.lang.String r7 = "msgtype"
            java.lang.String r8 = "拆红包发包失败: "
            java.lang.String r9 = "拆红包请求已发送: "
            java.lang.String r10 = "收红包响应: sendid="
            ra.c r11 = r1.f11833b
            java.lang.Object r12 = r11.f11838e
            na.k r12 = (na.k) r12
            java.lang.Object r13 = r11.f11836c
            h.Hchat.dexkit.DexFinder r13 = (h.Hchat.dexkit.DexFinder) r13
            java.lang.Object r14 = r11.f11837d
            l3.l r14 = (l3.l) r14
            boolean r14 = r14.f()
            if (r14 != 0) goto L35
            goto L289
        L35:
            java.lang.Object[] r14 = r0.args     // Catch: java.lang.Throwable -> Lcb
            r15 = 2
            r14 = r14[r15]     // Catch: java.lang.Throwable -> Lcb
            if (r14 != 0) goto L3e
            goto L289
        L3e:
            java.lang.String r15 = "sendId"
            java.lang.String r15 = x6.d.a0(r14, r15)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "timingIdentifier"
            java.lang.String r1 = x6.d.a0(r14, r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r14.<init>(r10)     // Catch: java.lang.Throwable -> Lcb
            r14.append(r15)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r10 = " timingId="
            r14.append(r10)     // Catch: java.lang.Throwable -> Lcb
            r14.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r10 = r14.toString()     // Catch: java.lang.Throwable -> Lcb
            r11.j(r10)     // Catch: java.lang.Throwable -> Lcb
            boolean r10 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> Lcb
            if (r10 != 0) goto L289
            boolean r10 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lcb
            if (r10 == 0) goto L6f
            goto L289
        L6f:
            java.util.Map r14 = r12.f9187l     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r0.thisObject     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r14.remove(r0)     // Catch: java.lang.Throwable -> L7a
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L7a
            goto L7b
        L7a:
            r0 = 0
        L7b:
            if (r0 == 0) goto L7e
            goto L86
        L7e:
            java.util.concurrent.ConcurrentHashMap r0 = r12.f9186k     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r0 = r0.get(r15)     // Catch: java.lang.Throwable -> Lcb
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> Lcb
        L86:
            if (r0 == 0) goto L289
            java.util.Set r14 = r12.f9190o     // Catch: java.lang.Throwable -> Lcb
            boolean r14 = r14.contains(r15)     // Catch: java.lang.Throwable -> Lcb
            if (r14 != 0) goto L92
            goto L289
        L92:
            java.util.Set r14 = r12.f9191p     // Catch: java.lang.Throwable -> Lcb
            boolean r14 = r14.add(r15)     // Catch: java.lang.Throwable -> Lcb
            if (r14 != 0) goto L9c
            goto L289
        L9c:
            java.util.Set r12 = r12.f9190o     // Catch: java.lang.Throwable -> Lcb
            r12.remove(r15)     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r14 = "redpacket_receive_timeout:"
            r12.<init>(r14)     // Catch: java.lang.Throwable -> Lcb
            r12.append(r15)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lcb
            ra.c.c(r12)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r12 = "requestNativeUrl"
            java.lang.Object r12 = r0.get(r12)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> Lcb
            boolean r14 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> Lcb
            if (r14 == 0) goto Lc8
            java.lang.String r12 = "nativeurl"
            java.lang.Object r12 = r0.get(r12)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> Lcb
        Lc8:
            r19 = r12
            goto Lce
        Lcb:
            r0 = move-exception
            goto L274
        Lce:
            java.lang.String r12 = "requestTalker"
            java.lang.Object r12 = r0.get(r12)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> Lcb
            boolean r14 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> Lcb
            if (r14 == 0) goto Le4
            java.lang.String r12 = "talker"
            java.lang.Object r12 = r0.get(r12)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> Lcb
        Le4:
            r22 = r12
            java.lang.Boolean r12 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r14 = "isUnion"
            java.lang.Object r14 = r0.get(r14)     // Catch: java.lang.Throwable -> Lcb
            boolean r12 = r12.equals(r14)     // Catch: java.lang.Throwable -> Lcb
            r14 = 1
            if (r12 == 0) goto Lfb
            java.lang.Class<?> r12 = r13.openLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> Lcb
            if (r12 == 0) goto Lfb
            r12 = r14
            goto Lfc
        Lfb:
            r12 = 0
        Lfc:
            java.lang.Object r10 = r0.get(r7)     // Catch: java.lang.Throwable -> Lcb
            boolean r10 = r10 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> Lcb
            if (r10 == 0) goto L10f
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> Lcb
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> Lcb
            goto L110
        L10f:
            r7 = r14
        L110:
            java.lang.Object r10 = r0.get(r6)     // Catch: java.lang.Throwable -> Lcb
            boolean r10 = r10 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> Lcb
            if (r10 == 0) goto L122
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> Lcb
            int r14 = r6.intValue()     // Catch: java.lang.Throwable -> Lcb
        L122:
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r10 = ""
            if (r6 == 0) goto L135
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lcb
            r20 = r5
            goto L137
        L135:
            r20 = r10
        L137:
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> Lcb
            if (r5 == 0) goto L145
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Lcb
        L145:
            r21 = r10
            if (r12 == 0) goto L166
            java.lang.reflect.Constructor<?> r4 = r13.unionOpenCtor10     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto L166
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L166
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L166
            java.lang.String r23 = "v1.0"
            java.lang.String r25 = ""
            r24 = r1
            r18 = r15
            java.lang.Object[] r1 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}     // Catch: java.lang.Throwable -> L16a
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r4, r1)     // Catch: java.lang.Throwable -> L16a
            goto L16b
        L166:
            r24 = r1
            r18 = r15
        L16a:
            r1 = 0
        L16b:
            if (r1 != 0) goto L185
            if (r12 == 0) goto L185
            java.lang.reflect.Constructor<?> r4 = r13.unionOpenCtor9     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto L185
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L185
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L185
            java.lang.String r23 = "v1.0"
            java.lang.Object[] r5 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22, r23, r24}     // Catch: java.lang.Throwable -> L185
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r4, r5)     // Catch: java.lang.Throwable -> L185
        L185:
            if (r1 != 0) goto L1a3
            if (r12 == 0) goto L1a3
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r23 = "v1.0"
            java.lang.String r25 = ""
            java.lang.Object[] r1 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}     // Catch: java.lang.Throwable -> Lcb
            java.lang.Class<?> r4 = r13.openLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> Lcb
            if (r4 != 0) goto L19f
        L19d:
            r1 = 0
            goto L1a3
        L19f:
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r4, r1)     // Catch: java.lang.Throwable -> L19d
        L1a3:
            if (r1 != 0) goto L1bd
            java.lang.reflect.Constructor<?> r4 = r13.openCtor10     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto L1bd
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1bd
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L1bd
            java.lang.String r23 = "v1.0"
            java.lang.String r25 = ""
            java.lang.Object[] r5 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}     // Catch: java.lang.Throwable -> L1bd
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r4, r5)     // Catch: java.lang.Throwable -> L1bd
        L1bd:
            if (r1 != 0) goto L1da
            java.lang.reflect.Constructor<?> r4 = r13.openCtor8     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto L1da
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1da
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L1da
            r23 = r24
            java.lang.Object[] r5 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22, r23}     // Catch: java.lang.Throwable -> L1d8
            r24 = r23
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r4, r5)     // Catch: java.lang.Throwable -> L1da
            goto L1da
        L1d8:
            r24 = r23
        L1da:
            if (r1 != 0) goto L1f2
            java.lang.reflect.Constructor<?> r4 = r13.openCtor9     // Catch: java.lang.Throwable -> Lcb
            if (r4 == 0) goto L1f2
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1f2
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L1f2
            java.lang.String r23 = "v1.0"
            java.lang.Object[] r5 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22, r23, r24}     // Catch: java.lang.Throwable -> L1f2
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r4, r5)     // Catch: java.lang.Throwable -> L1f2
        L1f2:
            if (r1 != 0) goto L212
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Integer r17 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r23 = "v1.0"
            java.lang.String r25 = ""
            java.lang.Object[] r1 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}     // Catch: java.lang.Throwable -> Lcb
            r4 = r18
            java.lang.Class<?> r5 = r13.openLuckyMoneyClass     // Catch: java.lang.Throwable -> Lcb
            if (r5 != 0) goto L20c
        L20a:
            r10 = 0
            goto L210
        L20c:
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r5, r1)     // Catch: java.lang.Throwable -> L20a
        L210:
            r1 = r10
            goto L214
        L212:
            r4 = r18
        L214:
            if (r1 != 0) goto L220
            r11.j(r3)     // Catch: java.lang.Throwable -> Lcb
            r11.n(r3, r0)     // Catch: java.lang.Throwable -> Lcb
            r11.d(r4)     // Catch: java.lang.Throwable -> Lcb
            goto L289
        L220:
            java.lang.String r3 = "openReq"
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r3 = r11.f11839f     // Catch: java.lang.Throwable -> Lcb
            m8.c r3 = (m8.c) r3     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = r3.j(r1)     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto L258
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r0.<init>(r9)     // Catch: java.lang.Throwable -> Lcb
            r0.append(r4)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lcb
            r11.j(r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "redpacket_open_timeout:"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lcb
            r0.append(r4)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lcb
            ra.a r1 = new ra.a     // Catch: java.lang.Throwable -> Lcb
            r2 = 0
            r1.<init>(r11, r4, r2)     // Catch: java.lang.Throwable -> Lcb
            r2 = 4500(0x1194, double:2.2233E-320)
            ra.c.t(r0, r2, r1)     // Catch: java.lang.Throwable -> Lcb
            goto L289
        L258:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r1.<init>(r8)     // Catch: java.lang.Throwable -> Lcb
            r1.append(r4)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcb
            r11.j(r1)     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = r11.p(r0, r4, r2)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto L289
            r11.n(r2, r0)     // Catch: java.lang.Throwable -> Lcb
            r11.d(r4)     // Catch: java.lang.Throwable -> Lcb
            goto L289
        L274:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ERROR receiveCallback: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.j(r0)
        L289:
            return
    }
}
