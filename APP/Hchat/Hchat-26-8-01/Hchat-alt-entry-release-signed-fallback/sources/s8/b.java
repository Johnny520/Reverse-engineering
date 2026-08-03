package s8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s8.c f12381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r8.g f12382c;

    public /* synthetic */ b(s8.c r1, r8.g r2, int r3) {
            r0 = this;
            r0.f12380a = r3
            r0.f12381b = r1
            r0.f12382c = r2
            r0.<init>()
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r49) {
            r48 = this;
            r1 = r48
            r2 = r49
            int r0 = r1.f12380a
            java.lang.String r3 = "撤回"
            java.lang.String r4 = ""
            r5 = 47
            r6 = 43
            r7 = 2
            r8 = 34
            r8.g r11 = r1.f12382c
            r12 = 3
            r13 = 0
            r14 = 1
            s8.c r15 = r1.f12381b
            r16 = 0
            r9 = 0
            switch(r0) {
                case 0: goto L505;
                case 1: goto L11b;
                case 2: goto L8d;
                default: goto L1e;
            }
        L1e:
            r2.getClass()
            boolean r0 = s8.c.k(r15, r11)
            if (r0 == 0) goto L8c
            boolean r0 = s8.c.C(r11)
            if (r0 != 0) goto L2e
            goto L8c
        L2e:
            java.lang.Object[] r0 = r2.args
            java.util.Set r3 = r15.f12386g
            if (r0 == 0) goto L8c
            int r4 = r0.length
            if (r4 != 0) goto L38
            goto L8c
        L38:
            r4 = r0[r13]
            if (r4 == 0) goto L61
            java.lang.Class r10 = r4.getClass()
            boolean r10 = s8.c.A(r10)
            if (r10 == 0) goto L61
            long r10 = s8.c.H(r4)
            int r13 = s8.c.I(r4)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            boolean r10 = r3.contains(r10)
            if (r10 == 0) goto L61
            if (r13 == r12) goto L89
            if (r13 == r8) goto L89
            if (r13 == r6) goto L89
            if (r13 != r5) goto L61
            goto L89
        L61:
            int r5 = r0.length
            if (r5 < r7) goto L8c
            boolean r4 = r4 instanceof java.lang.String
            if (r4 == 0) goto L8c
            r0 = r0[r14]
            boolean r4 = r0 instanceof java.lang.Number
            if (r4 == 0) goto L71
            java.lang.Number r0 = (java.lang.Number) r0
            goto L72
        L71:
            r0 = r9
        L72:
            if (r0 == 0) goto L79
            long r4 = r0.longValue()
            goto L7b
        L79:
            r4 = r16
        L7b:
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 <= 0) goto L8c
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L8c
        L89:
            r2.setResult(r9)
        L8c:
            return
        L8d:
            r2.getClass()
            boolean r0 = s8.c.k(r15, r11)
            if (r0 == 0) goto L11a
            boolean r0 = s8.c.C(r11)
            if (r0 != 0) goto L9e
            goto L11a
        L9e:
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto L11a
            int r3 = r0.length
            if (r3 >= r7) goto La7
            goto L11a
        La7:
            r3 = r0[r13]
            if (r3 == 0) goto L11a
            java.lang.Class r4 = r3.getClass()
            boolean r4 = s8.c.A(r4)
            if (r4 != 0) goto Lb6
            goto L11a
        Lb6:
            r0 = r0[r14]
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r0 = gg.l.a(r0, r4)
            if (r0 != 0) goto Lc1
            goto L11a
        Lc1:
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r0.getClass()
            int r4 = r0.length
            r7 = r13
        Lcf:
            if (r7 >= r4) goto L11a
            r10 = r0[r7]
            java.lang.String r11 = r10.getMethodName()
            java.lang.String r14 = "onGYNetEnd"
            boolean r11 = gg.l.a(r11, r14)
            if (r11 == 0) goto L117
            java.lang.String r10 = r10.getClassName()
            r10.getClass()
            java.lang.String r11 = "com.tencent.mm.modelsimple."
            boolean r10 = og.t.d0(r10, r11, r13)
            if (r10 == 0) goto L117
            int r0 = s8.c.I(r3)
            if (r0 == r12) goto Lfa
            if (r0 == r8) goto Lfa
            if (r0 == r6) goto Lfa
            if (r0 != r5) goto L11a
        Lfa:
            long r4 = s8.c.H(r3)
            java.util.Set r0 = r15.f12386g
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L110
            boolean r0 = s8.c.G(r3)
            if (r0 == 0) goto L11a
        L110:
            r15.F(r4)
            r2.setResult(r9)
            goto L11a
        L117:
            int r7 = r7 + 1
            goto Lcf
        L11a:
            return
        L11b:
            r2.getClass()
            java.util.Set r5 = r15.f12384e
            r8.g r6 = r1.f12382c
            boolean r0 = s8.c.k(r15, r6)
            if (r0 != 0) goto L12a
            goto L504
        L12a:
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto L504
            java.lang.Object r8 = tf.l.C0(r13, r0)
            boolean r10 = r8 instanceof java.lang.String
            if (r10 == 0) goto L139
            java.lang.String r8 = (java.lang.String) r8
            goto L13a
        L139:
            r8 = r9
        L13a:
            if (r8 == 0) goto L13d
            goto L13e
        L13d:
            r8 = r4
        L13e:
            java.lang.Object r10 = tf.l.C0(r14, r0)
            boolean r11 = r10 instanceof java.lang.Number
            if (r11 == 0) goto L149
            java.lang.Number r10 = (java.lang.Number) r10
            goto L14a
        L149:
            r10 = r9
        L14a:
            if (r10 == 0) goto L151
            long r10 = r10.longValue()
            goto L153
        L151:
            r10 = r16
        L153:
            java.lang.Object r9 = tf.l.C0(r12, r0)
            boolean r12 = r9 instanceof java.lang.String
            if (r12 == 0) goto L15e
            java.lang.String r9 = (java.lang.String) r9
            goto L15f
        L15e:
            r9 = 0
        L15f:
            if (r9 == 0) goto L162
            goto L163
        L162:
            r9 = r4
        L163:
            java.lang.Object r7 = tf.l.C0(r7, r0)
            java.lang.String r12 = "a"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r7, r12)
            g8.a r19 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r19 == 0) goto L178
            java.lang.String r19 = r19.c()
            goto L17a
        L178:
            r19 = 0
        L17a:
            if (r19 != 0) goto L17e
            r14 = r4
            goto L180
        L17e:
            r14 = r19
        L180:
            k8.q r19 = h.Hchat.hooks.api.core.WeChatApis.messageParser()     // Catch: java.lang.Throwable -> L18f
            if (r19 == 0) goto L191
            l8.e r0 = k8.q.k(r0, r14)     // Catch: java.lang.Throwable -> L18f
            if (r0 == 0) goto L191
            long r13 = r0.f7907c     // Catch: java.lang.Throwable -> L18f
            goto L193
        L18f:
            r0 = move-exception
            goto L198
        L191:
            r13 = r16
        L193:
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L18f
            goto L19e
        L198:
            sf.f r13 = new sf.f
            r13.<init>(r0)
            r0 = r13
        L19e:
            java.lang.Long r13 = java.lang.Long.valueOf(r16)
            boolean r14 = r0 instanceof sf.f
            if (r14 == 0) goto L1a7
            r0 = r13
        L1a7:
            java.lang.Number r0 = (java.lang.Number) r0
            long r13 = r0.longValue()
            long r13 = s8.c.K(r13)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 <= 0) goto L1ba
            goto L1bb
        L1ba:
            r0 = 0
        L1bb:
            if (r0 == 0) goto L1c2
            long r13 = r0.longValue()
            goto L1c6
        L1c2:
            long r13 = java.lang.System.currentTimeMillis()
        L1c6:
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r7, r12)
            java.lang.String r12 = "h"
            java.lang.String r12 = s8.c.l(r0, r12)
            java.lang.String r1 = "e"
            java.lang.String r1 = s8.c.l(r0, r1)
            java.lang.CharSequence r19 = og.m.R0(r9)
            r20 = r4
            java.lang.String r4 = r19.toString()
            r32 = r13
            java.lang.String r13 = "你撤回"
            r14 = 0
            boolean r13 = og.t.d0(r4, r13, r14)
            if (r13 != 0) goto L25e
            java.lang.String r13 = "\"你\"撤回"
            boolean r13 = og.t.d0(r4, r13, r14)
            if (r13 != 0) goto L25e
            java.lang.String r13 = "“你”撤回"
            boolean r4 = og.t.d0(r4, r13, r14)
            if (r4 == 0) goto L1fc
            goto L25e
        L1fc:
            boolean r4 = s8.c.z(r8, r1)
            if (r4 == 0) goto L205
        L202:
            r24 = r1
            goto L261
        L205:
            boolean r1 = og.m.t0(r9)
            if (r1 == 0) goto L20e
            r4 = r20
            goto L25b
        L20e:
            java.lang.String r1 = "[\"“](.*?)[\"”]\\s*撤回"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            java.util.regex.Matcher r1 = r1.matcher(r9)
            r1.getClass()
            r14 = 0
            og.i r1 = a7.a.b(r1, r14, r9)
            if (r1 == 0) goto L23c
            java.util.List r1 = r1.a()
            r4 = 1
            java.lang.Object r1 = tf.m.w1(r4, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L23c
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            r4 = r1
            goto L23d
        L23c:
            r4 = 0
        L23d:
            if (r4 == 0) goto L245
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto L25b
        L245:
            java.lang.String r1 = og.m.N0(r9, r3)
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            r3 = 3
            char[] r3 = new char[r3]
            r3 = {x0830: FILL_ARRAY_DATA , data: [34, 8220, 8221} // fill-array
            java.lang.String r4 = og.m.S0(r1, r3)
        L25b:
            r24 = r4
            goto L261
        L25e:
            java.lang.String r1 = "你"
            goto L202
        L261:
            java.lang.String r1 = "f"
            java.lang.String r25 = s8.c.l(r0, r1)
            java.lang.String r1 = "msgid"
            java.lang.Long r1 = s8.c.P(r12, r1)
            java.lang.String r3 = "r"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r3)
            boolean r3 = r0 instanceof java.lang.Number
            if (r3 == 0) goto L27a
            java.lang.Number r0 = (java.lang.Number) r0
            goto L27b
        L27a:
            r0 = 0
        L27b:
            if (r0 == 0) goto L284
            long r3 = r0.longValue()
        L281:
            r21 = r3
            goto L293
        L284:
            java.lang.String r0 = "newmsgid"
            java.lang.Long r0 = s8.c.P(r12, r0)
            if (r0 == 0) goto L291
            long r3 = r0.longValue()
            goto L281
        L291:
            r21 = r16
        L293:
            java.lang.String r0 = "c"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r7, r0)
            if (r0 == 0) goto L29c
            goto L2a2
        L29c:
            java.lang.String r0 = "d"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r7, r0)
        L2a2:
            boolean r3 = r0 instanceof java.lang.Number
            if (r3 == 0) goto L2a9
            java.lang.Number r0 = (java.lang.Number) r0
            goto L2aa
        L2a9:
            r0 = 0
        L2aa:
            if (r0 == 0) goto L2b3
            int r0 = r0.intValue()
            r30 = r0
            goto L2b5
        L2b3:
            r30 = 0
        L2b5:
            if (r1 == 0) goto L2be
            long r0 = r1.longValue()
            r19 = r0
            goto L2c0
        L2be:
            r19 = r10
        L2c0:
            boolean r0 = og.m.t0(r24)
            if (r0 == 0) goto L2d7
            boolean r0 = og.m.t0(r25)
            if (r0 == 0) goto L2d7
            int r0 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r0 > 0) goto L2d7
            int r0 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r0 > 0) goto L2d7
            r4 = r8
            r0 = 0
            goto L2ea
        L2d7:
            l8.f r18 = new l8.f
            java.lang.String r29 = ""
            r31 = 0
            r26 = 0
            java.lang.String r28 = ""
            r23 = r8
            r18.<init>(r19, r21, r23, r24, r25, r26, r28, r29, r30, r31)
            r4 = r23
            r0 = r18
        L2ea:
            boolean r1 = s8.c.y(r0)
            if (r1 == 0) goto L2f1
            goto L317
        L2f1:
            if (r0 == 0) goto L306
            long r7 = r0.f7916a
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r3 <= 0) goto L2fe
            goto L2ff
        L2fe:
            r1 = 0
        L2ff:
            if (r1 == 0) goto L306
        L301:
            long r7 = r1.longValue()
            goto L318
        L306:
            if (r0 == 0) goto L313
            long r7 = r0.f7917b
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r3 <= 0) goto L313
            goto L314
        L313:
            r1 = 0
        L314:
            if (r1 == 0) goto L317
            goto L301
        L317:
            r7 = r10
        L318:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r3 = ":"
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            boolean r7 = og.m.t0(r1)
            if (r7 == 0) goto L334
            r7 = 0
            goto L338
        L334:
            boolean r7 = r5.contains(r1)
        L338:
            if (r7 != 0) goto L500
            java.util.ArrayList r7 = s8.c.M(r10, r0)
            java.util.Iterator r7 = r7.iterator()
        L342:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L39e
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            java.util.concurrent.ConcurrentHashMap r12 = r15.f12385f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            r13.append(r3)
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            java.lang.Object r12 = r12.get(r13)
            h.Hchat.hooks.api.model.WeChatMessage r12 = (h.Hchat.hooks.api.model.WeChatMessage) r12
            if (r12 == 0) goto L36f
            goto L39f
        L36f:
            k8.s r12 = h.Hchat.hooks.api.core.WeChatApis.messageStore()
            if (r12 == 0) goto L37c
            h.Hchat.hooks.api.model.WeChatMessage r12 = r12.c(r8)
            if (r12 == 0) goto L37c
            goto L398
        L37c:
            k8.s r12 = h.Hchat.hooks.api.core.WeChatApis.messageStore()
            if (r12 == 0) goto L387
            h.Hchat.hooks.api.model.WeChatMessage r12 = r12.e(r8, r4)
            goto L388
        L387:
            r12 = 0
        L388:
            if (r12 == 0) goto L38b
            goto L398
        L38b:
            k8.s r12 = h.Hchat.hooks.api.core.WeChatApis.messageStore()
            if (r12 == 0) goto L397
            h.Hchat.hooks.api.model.WeChatMessage r8 = r12.d(r8)
            r12 = r8
            goto L398
        L397:
            r12 = 0
        L398:
            if (r12 == 0) goto L342
            r15.N(r12)
            goto L39f
        L39e:
            r12 = 0
        L39f:
            if (r12 == 0) goto L45b
            l8.f r18 = new l8.f
            long r7 = r12.msgSvrId
            java.lang.String r3 = r12.talker
            java.lang.String r24 = r12.sendTalker()
            long r13 = r12.createTime
            java.lang.String r28 = r12.bodyContent()
            java.lang.String r29 = r12.getMsgSource()
            int r9 = r12.flag
            r21 = 0
            java.lang.String r25 = ""
            r23 = r3
            r19 = r7
            r30 = r9
            r31 = r12
            r26 = r13
            r18.<init>(r19, r21, r23, r24, r25, r26, r28, r29, r30, r31)
            r3 = r18
            if (r0 == 0) goto L45c
            java.lang.String r7 = r0.f7923h
            java.lang.String r8 = r0.f7922g
            java.lang.String r9 = r0.f7920e
            java.lang.String r12 = r0.f7919d
            java.lang.String r13 = r0.f7918c
            l8.f r34 = new l8.f
            r14 = r7
            r18 = r8
            long r7 = r0.f7916a
            int r23 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r23 <= 0) goto L3e4
            r35 = r7
            goto L3e6
        L3e4:
            r35 = r19
        L3e6:
            long r7 = r0.f7917b
            int r19 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r19 <= 0) goto L3ef
            r37 = r7
            goto L3f1
        L3ef:
            r37 = r21
        L3f1:
            boolean r7 = r13.isEmpty()
            if (r7 != 0) goto L3fa
        L3f7:
            r39 = r13
            goto L3fd
        L3fa:
            java.lang.String r13 = r3.f7918c
            goto L3f7
        L3fd:
            boolean r7 = r12.isEmpty()
            if (r7 != 0) goto L406
        L403:
            r40 = r12
            goto L409
        L406:
            java.lang.String r12 = r3.f7919d
            goto L403
        L409:
            boolean r7 = r9.isEmpty()
            if (r7 != 0) goto L412
        L40f:
            r41 = r9
            goto L415
        L412:
            java.lang.String r9 = r3.f7920e
            goto L40f
        L415:
            long r7 = r0.a()
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 <= 0) goto L424
            long r7 = r0.a()
        L421:
            r42 = r7
            goto L429
        L424:
            long r7 = r3.a()
            goto L421
        L429:
            boolean r7 = r18.isEmpty()
            if (r7 != 0) goto L432
            r44 = r18
            goto L436
        L432:
            java.lang.String r8 = r3.f7922g
            r44 = r8
        L436:
            boolean r7 = r14.isEmpty()
            if (r7 != 0) goto L43f
            r45 = r14
            goto L443
        L43f:
            java.lang.String r7 = r3.f7923h
            r45 = r7
        L443:
            int r9 = r0.f7924i
            if (r9 == 0) goto L44a
            r46 = r9
            goto L44c
        L44a:
            r46 = r30
        L44c:
            h.Hchat.hooks.api.model.WeChatMessage r12 = r0.f7925j
            if (r12 == 0) goto L453
            r47 = r12
            goto L455
        L453:
            r47 = r31
        L455:
            r34.<init>(r35, r37, r39, r40, r41, r42, r44, r45, r46, r47)
            r3 = r34
            goto L45c
        L45b:
            r3 = r0
        L45c:
            boolean r0 = s8.c.y(r0)
            boolean r7 = s8.c.y(r3)
            if (r0 != 0) goto L46c
            if (r7 == 0) goto L469
            goto L46c
        L469:
            r25 = 0
            goto L46e
        L46c:
            r25 = 1
        L46e:
            if (r25 == 0) goto L478
            boolean r0 = s8.c.C(r6)
            if (r0 != 0) goto L478
            r13 = 0
            goto L4cb
        L478:
            if (r25 == 0) goto L48c
            if (r3 == 0) goto L483
            h.Hchat.hooks.api.model.WeChatMessage r0 = r3.f7925j
            if (r0 == 0) goto L483
            long r7 = r0.msgId
            goto L485
        L483:
            r7 = r16
        L485:
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 <= 0) goto L48c
            r15.F(r7)
        L48c:
            android.content.Context r0 = r6.f11620a
            java.lang.String r7 = "anti_recall_show_notice"
            java.lang.String r8 = "Hchat_anti_recall_config"
            if (r25 == 0) goto L4b0
            android.content.SharedPreferences r0 = ub.b.c(r0, r8)
            r9 = 1
            boolean r0 = r0.getBoolean(r7, r9)
            if (r0 == 0) goto L4c5
            r25 = 1
            r22 = r3
            r19 = r4
            r18 = r6
            r20 = r10
            r23 = r32
            s8.c.o(r18, r19, r20, r22, r23, r25)
            r13 = r9
            goto L4cb
        L4b0:
            r22 = r3
            r19 = r4
            r18 = r6
            r20 = r10
            r23 = r32
            r9 = 1
            android.content.SharedPreferences r0 = ub.b.c(r0, r8)
            boolean r0 = r0.getBoolean(r7, r9)
            if (r0 != 0) goto L4c7
        L4c5:
            r13 = 1
            goto L4cb
        L4c7:
            s8.c.o(r18, r19, r20, r22, r23, r25)
            goto L4c5
        L4cb:
            if (r13 != 0) goto L4ce
            goto L504
        L4ce:
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto L4d5
            goto L500
        L4d5:
            r5.add(r1)
            int r0 = r5.size()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 <= r1) goto L500
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r3 = r5.size()
            int r3 = r3 - r1
            java.util.List r0 = tf.m.L1(r3, r0)
            java.util.Iterator r0 = r0.iterator()
        L4f0:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L500
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r5.remove(r1)
            goto L4f0
        L500:
            r1 = 0
            r2.setResult(r1)
        L504:
            return
        L505:
            r20 = r4
            r1 = r9
            r2.getClass()
            boolean r0 = s8.c.k(r15, r11)
            if (r0 == 0) goto L824
            boolean r0 = s8.c.C(r11)
            if (r0 != 0) goto L519
            goto L824
        L519:
            java.lang.Object[] r2 = r2.args
            java.util.concurrent.ConcurrentHashMap r4 = r15.f12387h
            java.lang.String r5 = "type"
            if (r2 != 0) goto L523
            goto L824
        L523:
            java.lang.Object r0 = tf.l.z0(r2)
            boolean r6 = r0 instanceof java.lang.String
            if (r6 == 0) goto L52e
            java.lang.String r0 = (java.lang.String) r0
            goto L52f
        L52e:
            r0 = r1
        L52f:
            if (r0 == 0) goto L53a
            boolean r6 = og.m.t0(r0)
            if (r6 == 0) goto L538
            goto L53a
        L538:
            r6 = r0
            goto L56f
        L53a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r6 = r2.length
            r7 = 0
        L541:
            if (r7 >= r6) goto L54f
            r8 = r2[r7]
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L54c
            r0.add(r8)
        L54c:
            int r7 = r7 + 1
            goto L541
        L54f:
            java.util.Iterator r0 = r0.iterator()
        L553:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L567
            java.lang.Object r6 = r0.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = s8.c.u(r7)
            if (r7 == 0) goto L553
            goto L568
        L567:
            r6 = r1
        L568:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L538
            r6 = r20
        L56f:
            boolean r0 = s8.c.u(r6)
            if (r0 != 0) goto L577
            goto L824
        L577:
            int r0 = r2.length
            r7 = 0
        L579:
            if (r7 >= r0) goto L585
            r8 = r2[r7]
            boolean r9 = r8 instanceof android.content.ContentValues
            if (r9 == 0) goto L582
            goto L586
        L582:
            int r7 = r7 + 1
            goto L579
        L585:
            r8 = r1
        L586:
            boolean r0 = r8 instanceof android.content.ContentValues
            if (r0 == 0) goto L58d
            android.content.ContentValues r8 = (android.content.ContentValues) r8
            goto L58e
        L58d:
            r8 = r1
        L58e:
            if (r8 == 0) goto L824
            java.lang.String r7 = "content"
            java.lang.String r0 = r8.getAsString(r7)
            if (r0 != 0) goto L59b
            r9 = r20
            goto L59c
        L59b:
            r9 = r0
        L59c:
            java.lang.Integer r0 = r8.getAsInteger(r5)     // Catch: java.lang.Throwable -> L5a7
            if (r0 == 0) goto L5a9
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L5a7
            goto L5aa
        L5a7:
            r0 = move-exception
            goto L5b0
        L5a9:
            r0 = 0
        L5aa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5a7
        L5ae:
            r14 = 0
            goto L5b7
        L5b0:
            sf.f r10 = new sf.f
            r10.<init>(r0)
            r0 = r10
            goto L5ae
        L5b7:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            boolean r11 = r0 instanceof sf.f
            if (r11 == 0) goto L5c0
            r0 = r10
        L5c0:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = s8.c.B(r0)
            java.lang.String r10 = "revokemsg"
            if (r0 != 0) goto L5dd
            boolean r0 = og.m.h0(r9, r3, r14)
            if (r0 != 0) goto L5dd
            r11 = 1
            boolean r0 = og.m.h0(r9, r10, r11)
            if (r0 != 0) goto L5dd
            goto L824
        L5dd:
            int r0 = r2.length
            r11 = 0
            r14 = 0
        L5e0:
            if (r14 < r0) goto L5e5
            r12 = r20
            goto L5f8
        L5e5:
            r12 = r2[r14]
            boolean r13 = r12 instanceof android.content.ContentValues
            if (r13 == 0) goto L5f0
            r1 = 0
            r11 = 1
        L5ed:
            r12 = 1
            goto L81f
        L5f0:
            if (r11 == 0) goto L81c
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L81c
            java.lang.String r12 = (java.lang.String) r12
        L5f8:
            int r0 = r2.length
            r14 = 0
        L5fa:
            if (r14 >= r0) goto L617
            r11 = r2[r14]
            boolean r13 = r11 instanceof java.lang.Object[]
            if (r13 == 0) goto L613
            java.lang.Class r13 = r11.getClass()
            java.lang.Class r13 = r13.getComponentType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r1 = gg.l.a(r13, r1)
            if (r1 == 0) goto L613
            goto L618
        L613:
            int r14 = r14 + 1
            r1 = 0
            goto L5fa
        L617:
            r11 = 0
        L618:
            boolean r0 = r11 instanceof java.lang.String[]
            if (r0 == 0) goto L61f
            java.lang.String[] r11 = (java.lang.String[]) r11
            goto L620
        L61f:
            r11 = 0
        L620:
            boolean r0 = og.m.t0(r12)
            if (r0 != 0) goto L635
            if (r11 == 0) goto L635
            int r0 = r11.length
            if (r0 != 0) goto L62c
            goto L635
        L62c:
            java.lang.String r0 = "msgId"
            r1 = 1
            boolean r0 = og.m.h0(r12, r0, r1)
            if (r0 != 0) goto L638
        L635:
            r0 = r16
            goto L65b
        L638:
            int r0 = r11.length
            r14 = 0
        L63a:
            if (r14 >= r0) goto L654
            r1 = r11[r14]
            java.lang.Long r1 = og.t.g0(r1)
            if (r1 == 0) goto L64d
            long r12 = r1.longValue()
            int r2 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r2 <= 0) goto L64d
            goto L64e
        L64d:
            r1 = 0
        L64e:
            if (r1 == 0) goto L651
            goto L655
        L651:
            int r14 = r14 + 1
            goto L63a
        L654:
            r1 = 0
        L655:
            if (r1 == 0) goto L635
            long r0 = r1.longValue()
        L65b:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 > 0) goto L661
            goto L824
        L661:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r4.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L66e
            goto L6b3
        L66e:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r2 == 0) goto L6a4
            java.util.Map r6 = s8.c.L(r0, r6)
            if (r6 == 0) goto L67d
            java.util.Map r6 = (java.util.Map) r6
            goto L6a5
        L67d:
            java.util.List r2 = r2.messageTables()
            java.util.Iterator r2 = r2.iterator()
        L685:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L69d
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            java.util.Map r6 = s8.c.L(r0, r6)
            if (r6 == 0) goto L685
            java.util.Map r6 = (java.util.Map) r6
            goto L6a5
        L69d:
            java.lang.String r2 = "message"
            java.util.Map r6 = s8.c.L(r0, r2)
            goto L6a5
        L6a4:
            r6 = 0
        L6a5:
            if (r6 == 0) goto L6b2
            r2 = r6
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            r4.put(r6, r2)
            goto L6b3
        L6b2:
            r2 = 0
        L6b3:
            k8.s r4 = h.Hchat.hooks.api.core.WeChatApis.messageStore()
            if (r4 == 0) goto L6be
            h.Hchat.hooks.api.model.WeChatMessage r4 = r4.c(r0)
            goto L6bf
        L6be:
            r4 = 0
        L6bf:
            java.util.Set r6 = r15.f12386g
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            boolean r6 = r6.contains(r11)
            if (r6 != 0) goto L6d4
            if (r4 == 0) goto L824
            boolean r6 = r4.isSend()
            r11 = 1
            if (r6 != r11) goto L824
        L6d4:
            r15.F(r0)
            if (r2 != 0) goto L6db
            goto L76e
        L6db:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L6e3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L76e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            boolean r6 = og.m.t0(r2)
            if (r6 != 0) goto L6e3
            java.util.Set r6 = s8.c.f12383n
            java.util.Locale r11 = java.util.Locale.US
            r11.getClass()
            java.lang.String r11 = r2.toLowerCase(r11)
            r11.getClass()
            boolean r6 = r6.contains(r11)
            if (r6 == 0) goto L714
            goto L6e3
        L714:
            boolean r6 = r1 instanceof byte[]
            if (r6 == 0) goto L71e
            byte[] r1 = (byte[]) r1
            r8.put(r2, r1)
            goto L6e3
        L71e:
            boolean r6 = r1 instanceof java.lang.String
            if (r6 == 0) goto L728
            java.lang.String r1 = (java.lang.String) r1
            r8.put(r2, r1)
            goto L6e3
        L728:
            boolean r6 = r1 instanceof java.lang.Integer
            if (r6 == 0) goto L732
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8.put(r2, r1)
            goto L6e3
        L732:
            boolean r6 = r1 instanceof java.lang.Long
            if (r6 == 0) goto L73c
            java.lang.Long r1 = (java.lang.Long) r1
            r8.put(r2, r1)
            goto L6e3
        L73c:
            boolean r6 = r1 instanceof java.lang.Short
            if (r6 == 0) goto L746
            java.lang.Short r1 = (java.lang.Short) r1
            r8.put(r2, r1)
            goto L6e3
        L746:
            boolean r6 = r1 instanceof java.lang.Float
            if (r6 == 0) goto L750
            java.lang.Float r1 = (java.lang.Float) r1
            r8.put(r2, r1)
            goto L6e3
        L750:
            boolean r6 = r1 instanceof java.lang.Double
            if (r6 == 0) goto L75a
            java.lang.Double r1 = (java.lang.Double) r1
            r8.put(r2, r1)
            goto L6e3
        L75a:
            boolean r6 = r1 instanceof java.lang.Boolean
            if (r6 == 0) goto L765
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r8.put(r2, r1)
            goto L6e3
        L765:
            java.lang.String r1 = r1.toString()
            r8.put(r2, r1)
            goto L6e3
        L76e:
            if (r4 == 0) goto L787
            int r0 = r4.type
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L77f
            boolean r0 = s8.c.B(r0)
            if (r0 != 0) goto L77f
            goto L780
        L77f:
            r1 = 0
        L780:
            if (r1 == 0) goto L787
            int r0 = r1.intValue()
            goto L788
        L787:
            r0 = 1
        L788:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.put(r5, r0)
            if (r4 == 0) goto L794
            int r0 = r4.isSend
            goto L795
        L794:
            r0 = 1
        L795:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "isSend"
            r8.put(r1, r0)
            if (r4 == 0) goto L7ad
            int r0 = r4.status
            if (r0 <= 0) goto L7ad
            java.lang.String r1 = "status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.put(r1, r0)
        L7ad:
            if (r4 == 0) goto L7f8
            java.lang.String r0 = r4.imagePath
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L7be
            java.lang.String r0 = "imgPath"
            java.lang.String r1 = r4.imagePath
            r8.put(r0, r1)
        L7be:
            java.lang.String r0 = r4.reserved
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L7cd
            java.lang.String r0 = "reserved"
            java.lang.String r1 = r4.reserved
            r8.put(r0, r1)
        L7cd:
            java.lang.String r0 = r4.translatedContent
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L7dc
            java.lang.String r0 = "transContent"
            java.lang.String r1 = r4.translatedContent
            r8.put(r0, r1)
        L7dc:
            java.lang.String r0 = r4.msgSource
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L7eb
            java.lang.String r0 = "msgSource"
            java.lang.String r1 = r4.msgSource
            r8.put(r0, r1)
        L7eb:
            int r0 = r4.flag
            if (r0 == 0) goto L7f8
            java.lang.String r1 = "flag"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.put(r1, r0)
        L7f8:
            r1 = 0
            boolean r0 = og.m.h0(r9, r3, r1)
            if (r0 != 0) goto L806
            r12 = 1
            boolean r0 = og.m.h0(r9, r10, r12)
            if (r0 == 0) goto L824
        L806:
            if (r4 == 0) goto L80b
            java.lang.String r9 = r4.content
            goto L80c
        L80b:
            r9 = 0
        L80c:
            if (r9 != 0) goto L811
            r4 = r20
            goto L812
        L811:
            r4 = r9
        L812:
            boolean r0 = og.m.t0(r4)
            if (r0 != 0) goto L824
            r8.put(r7, r4)
            goto L824
        L81c:
            r1 = 0
            goto L5ed
        L81f:
            int r14 = r14 + 1
            r1 = 0
            goto L5e0
        L824:
            return
    }
}
