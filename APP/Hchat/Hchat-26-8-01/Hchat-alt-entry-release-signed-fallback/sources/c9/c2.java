package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1124c;

    public /* synthetic */ c2(int r1, java.lang.Object r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            r0.f1122a = r1
            r0.f1124c = r2
            r0.f1123b = r3
            r0.<init>()
            return
    }

    public c2(android.content.Context r2, fg.p r3) {
            r1 = this;
            r0 = 3
            r1.f1122a = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = h9.d.f5152a
            r1.f1123b = r2
            r1.f1124c = r3
            r1.<init>()
            return
    }

    public /* synthetic */ c2(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f1122a = r2
            r0.f1123b = r1
            r0.f1124c = r3
            r0.<init>()
            return
    }

    private final void a(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            r6 = this;
            java.lang.Object r0 = r6.f1124c
            z8.f r0 = (z8.f) r0
            java.lang.Object r1 = r6.f1123b
            z8.g r1 = (z8.g) r1
            r7.getClass()
            java.lang.Object[] r2 = r7.args
            r3 = 0
            if (r2 == 0) goto L16
            r4 = 3
            java.lang.Object r2 = tf.l.C0(r4, r2)
            goto L17
        L16:
            r2 = r3
        L17:
            boolean r4 = r2 instanceof java.lang.Boolean
            if (r4 == 0) goto L1e
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L1f
        L1e:
            r2 = r3
        L1f:
            if (r2 == 0) goto L91
            boolean r2 = r2.booleanValue()
            android.content.SharedPreferences r4 = r1.f22650c
            r5 = 0
            if (r2 != 0) goto L31
            java.lang.String r2 = "call_block_outgoing_ringtone"
            boolean r2 = r4.getBoolean(r2, r5)
            goto L37
        L31:
            java.lang.String r2 = "call_block_incoming_ringtone"
            boolean r2 = r4.getBoolean(r2, r5)
        L37:
            if (r2 != 0) goto L3a
            goto L91
        L3a:
            java.lang.Object[] r2 = r7.args
            if (r2 == 0) goto L43
            java.lang.Object r2 = tf.l.C0(r5, r2)
            goto L44
        L43:
            r2 = r3
        L44:
            boolean r4 = r2 instanceof java.lang.Long
            if (r4 == 0) goto L4b
            java.lang.Long r2 = (java.lang.Long) r2
            goto L4c
        L4b:
            r2 = r3
        L4c:
            if (r2 == 0) goto L91
            java.lang.reflect.Method r4 = r0.f22645b     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r5 = r7.thisObject     // Catch: java.lang.Throwable -> L5b
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeOrThrow(r4, r5, r2)     // Catch: java.lang.Throwable -> L5b
            goto L62
        L5b:
            r2 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r2)
            r2 = r4
        L62:
            boolean r4 = r2 instanceof sf.f
            if (r4 != 0) goto L6a
            r7.setResult(r3)
        L6a:
            java.lang.Throwable r7 = sf.g.b(r2)
            if (r7 == 0) goto L91
            java.lang.reflect.Method r0 = r0.f22644a
            java.lang.String r0 = r0.toGenericString()
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = r1.f22652e
            boolean r2 = r2.add(r0)
            if (r2 == 0) goto L91
            y9.b r1 = r1.f22649b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CoreV2 通话铃声确认回调失败: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.invoke(r0, r7)
        L91:
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r11) {
            r10 = this;
            int r0 = r10.f1122a
            java.lang.Object r1 = r10.f1124c
            java.lang.Object r2 = r10.f1123b
            switch(r0) {
                case 0: goto L117;
                case 12: goto Lc5;
                case 13: goto Lbc;
                case 16: goto Ld;
                default: goto L9;
            }
        L9:
            super.afterHookedMethod(r11)
            return
        Ld:
            r11.getClass()
            z8.d r2 = (z8.d) r2
            java.lang.ThreadLocal r0 = r2.f22639d
            y9.b r3 = r2.f22637b
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = r2.f22641f
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r5 = 0
            if (r0 == 0) goto L26
            int r0 = r0.intValue()
            goto L27
        L26:
            r0 = r5
        L27:
            r6 = 1
            if (r0 <= 0) goto L2c
            r0 = r6
            goto L2d
        L2c:
            r0 = r5
        L2d:
            if (r0 == 0) goto Lbb
            r8.g r0 = r2.f22636a
            android.content.Context r0 = r0.f11620a
            java.lang.String r7 = "Hchat_call_media_limit_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r7)
            java.lang.String r7 = "call_media_limit_enable"
            boolean r0 = r0.getBoolean(r7, r5)
            if (r0 != 0) goto L43
            goto Lbb
        L43:
            java.lang.Object r11 = r11.thisObject
            z8.b r1 = (z8.b) r1
            java.lang.reflect.Field r0 = r1.f22632b
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.readField(r0, r11)
            r0 = 0
            if (r11 == 0) goto Lae
            java.util.concurrent.ConcurrentHashMap r1 = r2.f22640e
            java.lang.Class r7 = r11.getClass()
            nb.a r8 = new nb.a
            r9 = 29
            r8.<init>(r2, r9)
            bc.j r2 = new bc.j
            r9 = 16
            r2.<init>(r8, r9)
            java.lang.Object r1 = r1.computeIfAbsent(r7, r2)
            r1.getClass()
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L81
            java.lang.String r11 = "fields"
            boolean r11 = r4.add(r11)
            if (r11 == 0) goto Lbb
            java.lang.String r11 = "微信通话状态事件未找到布尔结果字段"
            r3.invoke(r11, r0)
            goto Lbb
        L81:
            java.util.Iterator r1 = r1.iterator()
        L85:
            r2 = r5
        L86:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L9e
            java.lang.Object r7 = r1.next()
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r7 = h.Hchat.utils.KavaReflector.writeField(r7, r11, r8)
            if (r7 != 0) goto L9c
            if (r2 == 0) goto L85
        L9c:
            r2 = r6
            goto L86
        L9e:
            if (r2 != 0) goto Lbb
            java.lang.String r11 = "write"
            boolean r11 = r4.add(r11)
            if (r11 == 0) goto Lbb
            java.lang.String r11 = "微信通话状态事件结果改写失败"
            r3.invoke(r11, r0)
            goto Lbb
        Lae:
            java.lang.String r11 = "result"
            boolean r11 = r4.add(r11)
            if (r11 == 0) goto Lbb
            java.lang.String r11 = "微信通话状态事件结果为空"
            r3.invoke(r11, r0)
        Lbb:
            return
        Lbc:
            r11.getClass()
            qa.f r2 = (qa.f) r2
            qa.f.c(r2)
            return
        Lc5:
            java.lang.Object r11 = r11.thisObject
            boolean r0 = r11 instanceof android.app.Activity
            if (r0 == 0) goto L116
            q8.q r1 = (q8.q) r1
            b5.c r0 = new b5.c
            java.lang.String r2 = (java.lang.String) r2
            android.app.Activity r11 = (android.app.Activity) r11
            r0.<init>()
            r0.f469a = r2
            r0.f470b = r11
            if (r11 == 0) goto Le5
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            goto Le7
        Le5:
            java.lang.String r11 = ""
        Le7:
            r0.f471c = r11
            java.util.concurrent.CopyOnWriteArrayList r11 = r1.f10733b
            java.util.Iterator r11 = r11.iterator()
        Lef:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L116
            java.lang.Object r2 = r11.next()
            q8.p r2 = (q8.p) r2
            r2.a(r0)     // Catch: java.lang.Throwable -> Lff
            goto Lef
        Lff:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "生命周期回调失败: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.b(r2)
            goto Lef
        L116:
            return
        L117:
            r8.g r1 = (r8.g) r1
            r11.getClass()
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L13a
            java.lang.String r0 = "onResume"
            boolean r0 = gg.l.a(r2, r0)     // Catch: java.lang.Throwable -> L13a
            if (r0 == 0) goto L13c
            android.content.Context r0 = r1.f11620a     // Catch: java.lang.Throwable -> L13a
            c9.d2.y(r0)     // Catch: java.lang.Throwable -> L13a
            c9.d2 r0 = c9.d2.f1137a     // Catch: java.lang.Throwable -> L13a
            java.lang.Object r0 = r11.thisObject     // Catch: java.lang.Throwable -> L13a
            c9.d2.B(r0)     // Catch: java.lang.Throwable -> L13a
            java.lang.Object r11 = r11.thisObject     // Catch: java.lang.Throwable -> L13a
            android.content.Context r0 = r1.f11620a     // Catch: java.lang.Throwable -> L13a
            c9.d2.A(r11, r0)     // Catch: java.lang.Throwable -> L13a
            goto L13c
        L13a:
            r11 = move-exception
            goto L142
        L13c:
            java.lang.ThreadLocal r11 = c9.d2.f1147k
            r11.remove()
            return
        L142:
            java.lang.ThreadLocal r0 = c9.d2.f1147k
            r0.remove()
            throw r11
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r22) {
            r21 = this;
            r1 = r21
            r2 = r22
            int r0 = r1.f1122a
            r3 = 6
            r4 = 3
            r5 = 2
            java.lang.String r6 = "无法退出多选状态，请稍后重试"
            r7 = 1
            r8 = 0
            r9 = 0
            switch(r0) {
                case 0: goto L984;
                case 1: goto L8ca;
                case 2: goto L8a7;
                case 3: goto L877;
                case 4: goto L82b;
                case 5: goto L762;
                case 6: goto L655;
                case 7: goto L5b8;
                case 8: goto L596;
                case 9: goto L47f;
                case 10: goto L29f;
                case 11: goto L246;
                case 12: goto L11;
                case 13: goto L1a3;
                case 14: goto L7c;
                case 15: goto L19;
                case 16: goto L11;
                case 17: goto L15;
                default: goto L11;
            }
        L11:
            super.beforeHookedMethod(r22)
            return
        L15:
            r21.a(r22)
            return
        L19:
            r2.getClass()
            java.lang.Object r0 = r1.f1123b
            xa.m r0 = (xa.m) r0
            java.lang.Object r3 = r1.f1124c
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r4 = r0.b()
            if (r4 != 0) goto L2b
            goto L7b
        L2b:
            java.lang.Object[] r4 = r2.args
            if (r4 == 0) goto L7b
            int r5 = r4.length
        L30:
            if (r9 >= r5) goto L42
            r6 = r4[r9]
            boolean r10 = r6 instanceof android.view.MenuItem
            if (r10 == 0) goto L3b
            android.view.MenuItem r6 = (android.view.MenuItem) r6
            goto L3c
        L3b:
            r6 = r8
        L3c:
            if (r6 == 0) goto L3f
            goto L43
        L3f:
            int r9 = r9 + 1
            goto L30
        L42:
            r6 = r8
        L43:
            if (r6 == 0) goto L7b
            int r4 = r6.getItemId()
            r5 = 1212371539(0x48435253, float:200009.3)
            if (r4 == r5) goto L4f
            goto L7b
        L4f:
            java.util.Map r4 = r0.f21451g
            java.lang.Object r4 = r4.remove(r6)
            xa.i r4 = (xa.i) r4
            if (r4 == 0) goto L5a
            goto L5e
        L5a:
            xa.i r4 = r0.f21452h
            if (r4 == 0) goto L7b
        L5e:
            r0.f21452h = r8
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r5 = java.lang.Boolean.TYPE
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L6e
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
        L6e:
            r2.setResult(r8)
            android.os.Handler r2 = r0.f21448d
            xa.d r3 = new xa.d
            r3.<init>(r0, r4, r7)
            r2.post(r3)
        L7b:
            return
        L7c:
            r2.getClass()
            java.lang.Object r0 = r1.f1123b
            r11 = r0
            qb.k r11 = (qb.k) r11
            java.lang.Object r0 = r1.f1124c
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r3 = r11.p()
            if (r3 != 0) goto L90
            goto L1a2
        L90:
            java.lang.Object[] r3 = r2.args
            if (r3 == 0) goto L1a2
            java.lang.Object r3 = tf.l.C0(r9, r3)
            boolean r4 = r3 instanceof android.view.MenuItem
            if (r4 == 0) goto L9f
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            goto La0
        L9f:
            r3 = r8
        La0:
            if (r3 == 0) goto L1a2
            int r4 = r3.getItemId()
            r5 = 1212372557(0x4843564d, float:200025.2)
            if (r4 != r5) goto Lad
            r4 = r7
            goto Lae
        Lad:
            r4 = r9
        Lae:
            int r3 = r3.getItemId()
            r5 = 1212372558(0x4843564e, float:200025.22)
            if (r3 != r5) goto Lb8
            goto Lb9
        Lb8:
            r7 = r9
        Lb9:
            if (r4 != 0) goto Lbf
            if (r7 != 0) goto Lbf
            goto L1a2
        Lbf:
            if (r4 == 0) goto Lcb
            java.lang.String r3 = "voice_forward_chat_multi_forward_enable"
            boolean r3 = r11.O(r3)
            if (r3 != 0) goto Lcb
            goto L1a2
        Lcb:
            if (r7 == 0) goto Ld9
            android.content.SharedPreferences r3 = r11.f10836c
            java.lang.String r5 = "voice_forward_chat_multi_merge_enable"
            boolean r3 = r3.getBoolean(r5, r9)
            if (r3 != 0) goto Ld9
            goto L1a2
        Ld9:
            q8.o r3 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r3 == 0) goto Le4
            android.app.Activity r3 = r3.a()
            goto Le5
        Le4:
            r3 = r8
        Le5:
            if (r3 == 0) goto Le9
            r12 = r3
            goto Lea
        Le9:
            r12 = r8
        Lea:
            java.lang.Object r3 = r2.thisObject
            java.util.List r3 = k8.b.b(r3)
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L19a
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto Lfd
            goto L113
        Lfd:
            java.util.Iterator r5 = r3.iterator()
        L101:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L113
            java.lang.Object r7 = r5.next()
            boolean r7 = qb.k.u(r7)
            if (r7 != 0) goto L101
            goto L19a
        L113:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r5 = r3.iterator()
        L11c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L130
            java.lang.Object r7 = r5.next()
            qb.i r7 = r11.D(r7)
            if (r7 == 0) goto L11c
            r13.add(r7)
            goto L11c
        L130:
            int r5 = r13.size()
            int r3 = r3.size()
            if (r5 == r3) goto L143
            java.lang.String r0 = "部分语音文件不存在"
            qb.k.N(r12, r0)
            r2.setResult(r8)
            goto L1a2
        L143:
            java.lang.Object r3 = r2.thisObject
            ia.t r5 = r11.f10835b
            b.e r14 = be.h.X(r3, r0, r5)
            if (r14 != 0) goto L154
            qb.k.N(r12, r6)
            r2.setResult(r8)
            goto L1a2
        L154:
            if (r12 != 0) goto L15c
            java.lang.String r0 = "当前页面不可用"
            qb.k.N(r8, r0)
            goto L196
        L15c:
            if (r4 == 0) goto L162
            r11.I(r12, r13, r14, r8)
            goto L196
        L162:
            sf.e r0 = new sf.e
            java.lang.String r3 = "转发"
            java.lang.String r4 = "选择好友或群聊发送合并语音"
            r0.<init>(r3, r4)
            sf.e r3 = new sf.e
            java.lang.String r4 = "保存"
            java.lang.String r5 = "保存合并后的 MP3 文件"
            r3.<init>(r4, r5)
            sf.e[] r0 = new sf.e[]{r0, r3}
            java.util.List r0 = a.a.y0(r0)
            qb.b r16 = new qb.b
            r15 = 1
            r10 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            k.s1 r3 = new k.s1
            r4 = 7
            r3.<init>(r4)
            wb.lv r18 = wb.lv.f17583j
            java.lang.String r13 = "合并语音"
            java.lang.String r14 = "请选择合并语音的操作"
            r15 = r0
            r17 = r3
            wb.y2.Q1(r12, r13, r14, r15, r16, r17, r18)
        L196:
            r2.setResult(r8)
            goto L1a2
        L19a:
            java.lang.String r0 = "未找到选中的语音消息"
            qb.k.N(r12, r0)
            r2.setResult(r8)
        L1a2:
            return
        L1a3:
            java.lang.Object r0 = r1.f1123b
            qa.f r0 = (qa.f) r0
            r2.getClass()
            java.lang.Object[] r3 = r2.args
            if (r3 == 0) goto L1b3
            java.lang.Object r3 = tf.l.C0(r9, r3)
            goto L1b4
        L1b3:
            r3 = r8
        L1b4:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L1bb
            java.lang.String r3 = (java.lang.String) r3
            goto L1bc
        L1bb:
            r3 = r8
        L1bc:
            java.lang.Object r4 = r2.thisObject
            boolean r6 = r4 instanceof android.view.View
            if (r6 == 0) goto L1c5
            r8 = r4
            android.view.View r8 = (android.view.View) r8
        L1c5:
            boolean r4 = qa.f.b(r0, r8, r3)
            if (r4 == 0) goto L1cd
            goto L245
        L1cd:
            if (r3 == 0) goto L245
            r4 = r9
        L1d0:
            int r6 = r3.length()
            if (r4 >= r6) goto L245
            char r6 = r3.charAt(r4)
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 == 0) goto L242
            if (r8 == 0) goto L245
            qa.b r4 = qa.f.i(r0, r8)
            if (r4 == 0) goto L1e9
            goto L1eb
        L1e9:
            qa.b r4 = qa.b.f10773g
        L1eb:
            boolean r6 = qa.f.h(r0, r4)
            if (r6 == 0) goto L200
            java.util.WeakHashMap r6 = r0.f10788d
            java.lang.Object r6 = r6.get(r8)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r6 = gg.l.a(r6, r10)
            if (r6 != 0) goto L200
            goto L245
        L200:
            boolean r6 = qa.f.d(r0, r4)
            if (r6 != 0) goto L207
            goto L245
        L207:
            java.lang.String r3 = qa.f.f(r0, r8, r4, r3)
            java.lang.String r6 = qa.f.a(r0, r4, r3)
            android.animation.ValueAnimator r10 = qa.f.s(r8)
            if (r10 == 0) goto L21e
            boolean r11 = r10.isStarted()
            if (r11 == 0) goto L21e
            r10.end()
        L21e:
            java.lang.String r6 = qa.f.l(r3, r6)
            qa.f.g(r0, r8, r4, r6)
            qa.f.e(r0, r4, r3)
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto L22e
            r0[r9] = r6
        L22e:
            java.lang.Object r0 = r1.f1124c
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            if (r0 != r5) goto L245
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto L245
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0[r7] = r2
            goto L245
        L242:
            int r4 = r4 + 1
            goto L1d0
        L245:
            return
        L246:
            java.lang.Object r0 = r1.f1124c
            r3 = r0
            q8.i r3 = (q8.i) r3
            java.lang.Object[] r0 = r2.args
            if (r0 != 0) goto L250
            goto L260
        L250:
            int r2 = r0.length
        L251:
            if (r9 >= r2) goto L260
            r4 = r0[r9]
            boolean r5 = r4 instanceof android.content.Intent
            if (r5 == 0) goto L25d
            r8 = r4
            android.content.Intent r8 = (android.content.Intent) r8
            goto L260
        L25d:
            int r9 = r9 + 1
            goto L251
        L260:
            if (r8 == 0) goto L29e
            java.lang.Object r0 = r1.f1123b
            r2 = r0
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.f10708b
            java.util.Iterator r4 = r0.iterator()
        L26d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L29e
            java.lang.Object r0 = r4.next()
            q8.j r0 = (q8.j) r0
            r0.a(r8, r2)     // Catch: java.lang.Throwable -> L27d
            goto L26d
        L27d:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Activity启动监听回调失败: "
            r5.<init>(r6)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            i8.f r5 = r3.f10707a
            if (r5 == 0) goto L26d
            java.lang.String r5 = "[WeChatActivityStartApi] "
            java.lang.String r0 = r5.concat(r0)
            i8.i.f(r0)
            goto L26d
        L29e:
            return
        L29f:
            java.lang.Object[] r0 = r2.args
            if (r0 != 0) goto L2a5
            goto L47e
        L2a5:
            java.lang.Object r0 = r1.f1123b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L2ad:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L47e
            java.lang.Object r0 = r3.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L2ad
            java.lang.Object[] r5 = r2.args
            int r6 = r5.length
            if (r0 >= r6) goto L2ad
            r0 = r5[r0]
            if (r0 == 0) goto L2ad
            java.lang.Object r5 = r1.f1124c
            oa.a r5 = (oa.a) r5
            java.lang.String r6 = "nativeurl"
            java.lang.String r7 = ":\n"
            l3.l r10 = r5.f9701a
            java.lang.String r11 = "hb_auto_enable"
            android.content.SharedPreferences r10 = r10.b()     // Catch: java.lang.Throwable -> L2dd
            boolean r10 = r10.getBoolean(r11, r9)     // Catch: java.lang.Throwable -> L2dd
            goto L2de
        L2dd:
            r10 = r9
        L2de:
            if (r10 != 0) goto L2e1
            goto L2ad
        L2e1:
            java.lang.String r10 = "h"
            java.lang.String r11 = "i"
            java.lang.String r12 = "m"
            java.lang.String[] r11 = new java.lang.String[]{r10, r11, r12}     // Catch: java.lang.Throwable -> L33c
            r12 = r9
        L2ec:
            java.lang.String r13 = "<wcpayinfo>"
            if (r12 >= r4) goto L306
            r14 = r11[r12]     // Catch: java.lang.Throwable -> L33c
            java.lang.String r14 = x6.d.c0(r0, r14)     // Catch: java.lang.Throwable -> L33c
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L33c
            if (r15 != 0) goto L303
            boolean r15 = r14.contains(r13)     // Catch: java.lang.Throwable -> L33c
            if (r15 == 0) goto L303
            goto L31a
        L303:
            int r12 = r12 + 1
            goto L2ec
        L306:
            java.lang.String r14 = x6.d.c0(r0, r10)     // Catch: java.lang.Throwable -> L33c
            boolean r10 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L33c
            if (r10 != 0) goto L319
            java.lang.String r10 = "^-?\\d+$"
            boolean r10 = r14.matches(r10)     // Catch: java.lang.Throwable -> L33c
            if (r10 != 0) goto L319
            goto L31a
        L319:
            r14 = r8
        L31a:
            boolean r10 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L33c
            if (r10 != 0) goto L2ad
            boolean r10 = r14.contains(r13)     // Catch: java.lang.Throwable -> L33c
            if (r10 != 0) goto L327
            goto L2ad
        L327:
            int r10 = r14.indexOf(r7)     // Catch: java.lang.Throwable -> L33c
            if (r10 <= 0) goto L33f
            java.lang.String r11 = "<"
            int r11 = r14.indexOf(r11)     // Catch: java.lang.Throwable -> L33c
            if (r11 <= r10) goto L33f
            int r10 = r10 + 2
            java.lang.String r10 = r14.substring(r10)     // Catch: java.lang.Throwable -> L33c
            goto L340
        L33c:
            r0 = move-exception
            goto L467
        L33f:
            r10 = r14
        L340:
            java.lang.String r11 = oa.b.e(r10, r6)     // Catch: java.lang.Throwable -> L33c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33c
            r12.<init>()     // Catch: java.lang.Throwable -> L33c
            java.lang.String r13 = "AddMsg wcpayinfo nativeurl="
            r12.append(r13)     // Catch: java.lang.Throwable -> L33c
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L33c
            r15 = 50
            java.lang.String r16 = "EMPTY"
            if (r13 == 0) goto L35b
            r13 = r16
            goto L367
        L35b:
            int r13 = r11.length()     // Catch: java.lang.Throwable -> L33c
            int r13 = java.lang.Math.min(r15, r13)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r13 = r11.substring(r9, r13)     // Catch: java.lang.Throwable -> L33c
        L367:
            r12.append(r13)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L33c
            r5.c(r12)     // Catch: java.lang.Throwable -> L33c
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L33c
            if (r12 == 0) goto L3ae
            java.lang.String r6 = oa.b.e(r14, r6)     // Catch: java.lang.Throwable -> L33c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33c
            r12.<init>()     // Catch: java.lang.Throwable -> L33c
            java.lang.String r13 = "  原始content中nativeurl="
            r12.append(r13)     // Catch: java.lang.Throwable -> L33c
            boolean r13 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L33c
            if (r13 == 0) goto L38e
        L38b:
            r13 = r16
            goto L39b
        L38e:
            int r13 = r6.length()     // Catch: java.lang.Throwable -> L33c
            int r13 = java.lang.Math.min(r15, r13)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r16 = r6.substring(r9, r13)     // Catch: java.lang.Throwable -> L33c
            goto L38b
        L39b:
            r12.append(r13)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L33c
            r5.c(r12)     // Catch: java.lang.Throwable -> L33c
            boolean r12 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L33c
            if (r12 != 0) goto L3ae
            r15 = r6
            r12 = r14
            goto L3b0
        L3ae:
            r12 = r10
            r15 = r11
        L3b0:
            boolean r6 = android.text.TextUtils.isEmpty(r15)     // Catch: java.lang.Throwable -> L33c
            if (r6 == 0) goto L3bd
            java.lang.String r0 = "  放弃: 无法提取nativeurl"
            r5.c(r0)     // Catch: java.lang.Throwable -> L33c
            goto L2ad
        L3bd:
            java.lang.String r6 = "e"
            java.lang.String r6 = x6.d.c0(r0, r6)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r10 = "f"
            java.lang.String r0 = x6.d.c0(r0, r10)     // Catch: java.lang.Throwable -> L33c
            java.lang.Object r10 = r5.f9704d     // Catch: java.lang.Throwable -> L33c
            na.b r10 = (na.b) r10     // Catch: java.lang.Throwable -> L33c
            na.e r10 = r10.f9099h     // Catch: java.lang.Throwable -> L33c
            java.lang.String r10 = r10.a()     // Catch: java.lang.Throwable -> L33c
            boolean r11 = oa.b.f(r0)     // Catch: java.lang.Throwable -> L33c
            if (r11 == 0) goto L3da
            goto L3f3
        L3da:
            boolean r11 = oa.b.f(r6)     // Catch: java.lang.Throwable -> L33c
            if (r11 == 0) goto L3e1
            goto L3f5
        L3e1:
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L33c
            if (r11 != 0) goto L3f5
            boolean r10 = r10.equals(r6)     // Catch: java.lang.Throwable -> L33c
            if (r10 == 0) goto L3f5
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L33c
            if (r10 != 0) goto L3f5
        L3f3:
            r10 = r0
            goto L3f6
        L3f5:
            r10 = r6
        L3f6:
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L33c
            if (r11 == 0) goto L3fd
            r10 = r0
        L3fd:
            java.lang.String r11 = "fromusername"
            java.lang.String r11 = oa.b.e(r12, r11)     // Catch: java.lang.Throwable -> L33c
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L33c
            if (r13 == 0) goto L419
            boolean r13 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L33c
            if (r13 != 0) goto L419
            int r7 = r14.indexOf(r7)     // Catch: java.lang.Throwable -> L33c
            if (r7 <= 0) goto L419
            java.lang.String r11 = r14.substring(r9, r7)     // Catch: java.lang.Throwable -> L33c
        L419:
            boolean r7 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L33c
            if (r7 == 0) goto L420
            r11 = r6
        L420:
            java.lang.String r13 = oa.b.g(r11)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r14 = oa.b.g(r10)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r7 = "exclusive_recv_username"
            java.lang.String r16 = oa.b.e(r12, r7)     // Catch: java.lang.Throwable -> L33c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33c
            r7.<init>()     // Catch: java.lang.Throwable -> L33c
            java.lang.String r10 = "  from="
            r7.append(r10)     // Catch: java.lang.Throwable -> L33c
            r7.append(r6)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r6 = " to="
            r7.append(r6)     // Catch: java.lang.Throwable -> L33c
            r7.append(r0)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r0 = " talker="
            r7.append(r0)     // Catch: java.lang.Throwable -> L33c
            r7.append(r14)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r0 = " sender="
            r7.append(r0)     // Catch: java.lang.Throwable -> L33c
            r7.append(r13)     // Catch: java.lang.Throwable -> L33c
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L33c
            r5.c(r0)     // Catch: java.lang.Throwable -> L33c
            java.lang.Object r0 = r5.f9705e     // Catch: java.lang.Throwable -> L33c
            na.b r0 = (na.b) r0     // Catch: java.lang.Throwable -> L33c
            java.lang.String r11 = "AddMsg"
            na.e r10 = r0.f9099h     // Catch: java.lang.Throwable -> L33c
            r10.e(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L33c
            goto L2ad
        L467:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "ERROR handleAddMsg: "
            r6.<init>(r7)
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r5.c(r0)
            goto L2ad
        L47e:
            return
        L47f:
            m9.c r0 = m9.c.f8791i
            r2.getClass()
            java.lang.Object r5 = r1.f1123b
            r12 = r5
            m9.e r12 = (m9.e) r12
            java.lang.ThreadLocal r5 = r12.f8806d
            r8.g r6 = r12.f8803a
            java.lang.Object r5 = r5.get()
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r5 = gg.l.a(r5, r10)
            if (r5 == 0) goto L49b
            goto L595
        L49b:
            java.lang.Object[] r5 = r2.args
            if (r5 == 0) goto L595
            java.lang.Object r5 = tf.l.C0(r7, r5)
            if (r5 == 0) goto L595
            java.lang.String r10 = "field_name"
            java.lang.String r10 = r12.b(r5, r10)
            java.lang.String r11 = "field_content"
            java.lang.String r11 = r12.b(r5, r11)
            java.lang.String r13 = "field_md5"
            java.lang.String r13 = r12.b(r5, r13)
            java.lang.String r14 = "dice"
            boolean r14 = og.t.d0(r10, r14, r7)
            if (r14 != 0) goto L4ef
            java.lang.String r14 = "type=\"2\""
            boolean r14 = og.m.h0(r11, r14, r9)
            if (r14 != 0) goto L4ef
            java.util.HashSet r14 = m9.e.f8802l
            boolean r14 = r14.contains(r13)
            if (r14 == 0) goto L4d0
            goto L4ef
        L4d0:
            java.lang.String r14 = "jsb"
            boolean r10 = og.t.d0(r10, r14, r7)
            if (r10 != 0) goto L4eb
            java.lang.String r10 = "type=\"1\""
            boolean r10 = og.m.h0(r11, r10, r9)
            if (r10 != 0) goto L4eb
            java.util.HashSet r10 = m9.e.f8801k
            boolean r10 = r10.contains(r13)
            if (r10 == 0) goto L4e9
            goto L4eb
        L4e9:
            r14 = r8
            goto L4f0
        L4eb:
            m9.c r10 = m9.c.f8790h
            r14 = r10
            goto L4f0
        L4ef:
            r14 = r0
        L4f0:
            if (r14 == 0) goto L595
            android.content.Context r10 = r6.f11620a
            java.lang.String r11 = "Hchat_game_emoji_config"
            android.content.SharedPreferences r10 = ub.b.c(r10, r11)
            java.lang.String r13 = "game_emoji_pick_before_send"
            boolean r10 = r10.getBoolean(r13, r9)
            if (r10 == 0) goto L557
            java.lang.Object r0 = r1.f1124c
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            q8.o r3 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r3 == 0) goto L511
            android.app.Activity r3 = r3.a()
            goto L512
        L511:
            r3 = r8
        L512:
            if (r3 == 0) goto L515
            goto L516
        L515:
            r3 = r8
        L516:
            if (r3 == 0) goto L595
            boolean r4 = r3.isFinishing()
            if (r4 != 0) goto L527
            boolean r4 = r3.isDestroyed()
            if (r4 == 0) goto L525
            goto L527
        L525:
            r11 = r3
            goto L528
        L527:
            r11 = r8
        L528:
            if (r11 == 0) goto L595
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.f8807e
            boolean r3 = r3.compareAndSet(r9, r7)
            if (r3 != 0) goto L536
            r2.setResult(r8)
            goto L595
        L536:
            m9.d r13 = new m9.d
            java.lang.Object r3 = r2.thisObject
            java.lang.Object[] r4 = r2.args
            r4.getClass()
            int r5 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            r13.<init>(r0, r3, r4, r14)
            r2.setResult(r8)
            android.os.Handler r0 = r12.f8805c
            b9.c r10 = new b9.c
            r15 = 12
            r10.<init>(r11, r12, r13, r14, r15)
            r0.post(r10)
            goto L595
        L557:
            android.content.Context r2 = r6.f11620a
            android.content.SharedPreferences r2 = ub.b.c(r2, r11)
            java.lang.String r10 = "game_emoji_fixed_result"
            boolean r2 = r2.getBoolean(r10, r9)
            if (r2 == 0) goto L595
            if (r14 != r0) goto L578
            android.content.Context r0 = r6.f11620a
            android.content.SharedPreferences r0 = ub.b.c(r0, r11)
            java.lang.String r2 = "game_emoji_dice_result"
            int r0 = r0.getInt(r2, r7)
            int r0 = r9.e0.r(r0, r7, r3)
            goto L588
        L578:
            android.content.Context r0 = r6.f11620a
            android.content.SharedPreferences r0 = ub.b.c(r0, r11)
            java.lang.String r2 = "game_emoji_rps_result"
            int r0 = r0.getInt(r2, r7)
            int r0 = r9.e0.r(r0, r7, r4)
        L588:
            boolean r0 = r12.a(r5, r14, r0)
            if (r0 != 0) goto L595
            ia.t r0 = r12.f8804b
            java.lang.String r2 = "改写游戏表情结果失败"
            r0.invoke(r2, r8)
        L595:
            return
        L596:
            java.lang.Object r0 = r1.f1123b
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Object r3 = r1.f1124c
            m8.c r3 = (m8.c) r3
            java.lang.Object r4 = r3.f8780c
            if (r4 == 0) goto L5b0
            int r4 = m8.c.f(r0)
            java.lang.Object r5 = r3.f8781d
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            int r5 = m8.c.f(r5)
            if (r4 <= r5) goto L5b7
        L5b0:
            java.lang.Object r2 = r2.thisObject
            java.lang.String r4 = "网络发包器已缓存"
            r3.b(r2, r4, r0)
        L5b7:
            return
        L5b8:
            java.lang.Object[] r0 = r2.args
            if (r0 != 0) goto L5be
            goto L654
        L5be:
            java.lang.Object r0 = r1.f1123b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L5c6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L654
            java.lang.Object r0 = r3.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L64e
            java.lang.Object[] r4 = r2.args
            int r5 = r4.length
            if (r0 >= r5) goto L64e
            r0 = r4[r0]
            if (r0 == 0) goto L64e
            java.lang.Object r4 = r1.f1124c
            k8.k r4 = (k8.k) r4
            f8.c r5 = r4.f7435d
            g8.a r6 = r4.f7433b     // Catch: java.lang.Throwable -> L5f0
            if (r6 == 0) goto L5f4
            java.lang.String r6 = r6.c()     // Catch: java.lang.Throwable -> L5f0
            goto L5f6
        L5f0:
            r0 = move-exception
            r20 = r3
            goto L638
        L5f4:
            java.lang.String r6 = ""
        L5f6:
            k8.q r7 = r4.f7434c     // Catch: java.lang.Throwable -> L5f0
            r7.getClass()     // Catch: java.lang.Throwable -> L5f0
            l8.e r0 = k8.q.k(r0, r6)     // Catch: java.lang.Throwable -> L5f0
            if (r0 != 0) goto L602
            goto L64e
        L602:
            f8.g r6 = new f8.g     // Catch: java.lang.Throwable -> L5f0
            java.lang.String r7 = r0.f7910f     // Catch: java.lang.Throwable -> L5f0
            java.lang.String r8 = r0.f7911g     // Catch: java.lang.Throwable -> L5f0
            java.lang.String r9 = r0.f7912h     // Catch: java.lang.Throwable -> L5f0
            java.lang.String r10 = r0.f7909e     // Catch: java.lang.Throwable -> L5f0
            int r11 = r0.f7906b     // Catch: java.lang.Throwable -> L5f0
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L5f0
            long r12 = r0.f7907c     // Catch: java.lang.Throwable -> L5f0
            long r14 = r0.f7908d     // Catch: java.lang.Throwable -> L5f0
            r20 = r3
            java.lang.String r3 = r0.f7914j     // Catch: java.lang.Throwable -> L637
            r16 = r3
            java.lang.String r3 = r0.f7915k     // Catch: java.lang.Throwable -> L637
            r18 = 0
            r19 = 0
            r17 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L637
            r5.b(r6)     // Catch: java.lang.Throwable -> L637
            boolean r0 = r0.f7905a     // Catch: java.lang.Throwable -> L637
            if (r0 == 0) goto L650
            f8.b r0 = new f8.b     // Catch: java.lang.Throwable -> L637
            r0.<init>()     // Catch: java.lang.Throwable -> L637
            r5.b(r0)     // Catch: java.lang.Throwable -> L637
            goto L650
        L637:
            r0 = move-exception
        L638:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "派发消息事件失败: "
            r3.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.d(r0)
            goto L650
        L64e:
            r20 = r3
        L650:
            r3 = r20
            goto L5c6
        L654:
            return
        L655:
            r2.getClass()
            java.lang.Object r0 = r1.f1123b
            hb.c r0 = (hb.c) r0
            java.lang.Object r3 = r1.f1124c
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Object r4 = r0.f5339h
            ia.t r4 = (ia.t) r4
            java.lang.Object r0 = r0.f5340i
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r5 = "multi_recall_enable"
            boolean r0 = r0.getBoolean(r5, r9)
            if (r0 != 0) goto L672
            goto L761
        L672:
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto L67b
            java.lang.Object r0 = tf.l.C0(r9, r0)
            goto L67c
        L67b:
            r0 = r8
        L67c:
            boolean r5 = r0 instanceof android.view.MenuItem
            if (r5 == 0) goto L683
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            goto L684
        L683:
            r0 = r8
        L684:
            if (r0 == 0) goto L761
            int r0 = r0.getItemId()
            r5 = 1212371523(0x48435243, float:200009.05)
            if (r0 == r5) goto L691
            goto L761
        L691:
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto L69c
            android.app.Activity r0 = r0.a()
            goto L69d
        L69c:
            r0 = r8
        L69d:
            if (r0 == 0) goto L6a0
            goto L6a1
        L6a0:
            r0 = r8
        L6a1:
            if (r0 == 0) goto L6ab
            boolean r5 = r0.isFinishing()
            if (r5 != 0) goto L6ab
            r5 = r0
            goto L6ac
        L6ab:
            r5 = r8
        L6ac:
            java.lang.Object r0 = r2.thisObject
            java.util.List r0 = k8.b.b(r0)
            java.util.List r10 = hb.c.t(r0)
            if (r10 != 0) goto L6cb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6c1
            java.lang.String r0 = "未找到选中的消息"
            goto L6c3
        L6c1:
            java.lang.String r0 = "只能批量撤回自己发送的消息"
        L6c3:
            hb.c.A(r5, r0)
            r2.setResult(r8)
            goto L761
        L6cb:
            java.lang.Object r0 = r2.thisObject
            b.e r3 = be.h.X(r0, r3, r4)
            if (r3 != 0) goto L6db
            hb.c.A(r5, r6)
            r2.setResult(r8)
            goto L761
        L6db:
            k8.g r6 = p.a.q()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L6e9
        L6e5:
            r16 = r10
            goto L74a
        L6e9:
            java.util.Iterator r11 = r10.iterator()
            r12 = r9
        L6ee:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L748
            java.lang.Object r13 = r11.next()
            if (r6 == 0) goto L704
            boolean r0 = r6.s(r13)     // Catch: java.lang.Throwable -> L702
            if (r0 != r7) goto L704
            r0 = r7
            goto L705
        L702:
            r0 = move-exception
            goto L70a
        L704:
            r0 = r9
        L705:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L702
            goto L710
        L70a:
            sf.f r14 = new sf.f
            r14.<init>(r0)
            r0 = r14
        L710:
            java.lang.Throwable r14 = sf.g.b(r0)
            r16 = r10
            if (r14 == 0) goto L72d
            long r9 = hb.c.q(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r15 = "批量撤回消息异常: msgId="
            r13.<init>(r15)
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            r4.invoke(r9, r14)
        L72d:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r10 = r0 instanceof sf.f
            if (r10 == 0) goto L734
            r0 = r9
        L734:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L740
            int r12 = r12 + 1
            if (r12 < 0) goto L744
        L740:
            r10 = r16
            r9 = 0
            goto L6ee
        L744:
            a.a.P0()
            throw r8
        L748:
            r9 = r12
            goto L6e5
        L74a:
            int r0 = r16.size()
            java.lang.String r6 = "/"
            java.lang.String r7 = " 条消息"
            java.lang.String r10 = "已发起撤回 "
            java.lang.String r0 = eh.a.k(r9, r0, r10, r6, r7)
            hb.c.A(r5, r0)
            r3.r(r4)
            r2.setResult(r8)
        L761:
            return
        L762:
            r2.getClass()
            java.lang.Object r0 = r1.f1123b
            r13 = r0
            hb.i0 r13 = (hb.i0) r13
            java.lang.Object r0 = r1.f1124c
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            android.content.SharedPreferences r3 = r13.f5403d
            java.lang.String r4 = "selected_messages_enable"
            boolean r3 = r3.getBoolean(r4, r7)
            if (r3 != 0) goto L77a
            goto L82a
        L77a:
            java.lang.Object[] r3 = r2.args
            if (r3 == 0) goto L784
            r15 = 0
            java.lang.Object r3 = tf.l.C0(r15, r3)
            goto L785
        L784:
            r3 = r8
        L785:
            boolean r4 = r3 instanceof android.view.MenuItem
            if (r4 == 0) goto L78c
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            goto L78d
        L78c:
            r3 = r8
        L78d:
            if (r3 == 0) goto L82a
            int r3 = r3.getItemId()
            r4 = 1212371789(0x4843534d, float:200013.2)
            if (r3 == r4) goto L7a3
            r4 = 1212371796(0x48435354, float:200013.31)
            if (r3 == r4) goto L79f
            goto L82a
        L79f:
            hb.g0 r3 = hb.g0.f5387h
        L7a1:
            r12 = r3
            goto L7a6
        L7a3:
            hb.g0 r3 = hb.g0.f5386g
            goto L7a1
        L7a6:
            r2.setResult(r8)
            q8.o r3 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r3 == 0) goto L7b4
            android.app.Activity r3 = r3.a()
            goto L7b5
        L7b4:
            r3 = r8
        L7b5:
            if (r3 == 0) goto L7b8
            goto L7b9
        L7b8:
            r3 = r8
        L7b9:
            if (r3 == 0) goto L7c3
            boolean r4 = r3.isFinishing()
            if (r4 != 0) goto L7c3
            r11 = r3
            goto L7c4
        L7c3:
            r11 = r8
        L7c4:
            if (r11 != 0) goto L7c7
            goto L82a
        L7c7:
            java.lang.Object r3 = r2.thisObject
            java.util.List r3 = k8.b.b(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r3.iterator()
        L7d6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7ea
            java.lang.Object r7 = r5.next()
            hb.t r7 = x6.d.y(r7)
            if (r7 == 0) goto L7d6
            r4.add(r7)
            goto L7d6
        L7ea:
            a9.h r5 = new a9.h
            r7 = 19
            r5.<init>(r7)
            c9.a0 r8 = new c9.a0
            r8.<init>(r5, r7)
            java.util.List r14 = tf.m.K1(r4, r8)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L825
            int r4 = r14.size()
            int r3 = r3.size()
            if (r4 == r3) goto L80b
            goto L825
        L80b:
            java.lang.Object r2 = r2.thisObject
            ab.b r3 = r13.f5401b
            b.e r15 = be.h.X(r2, r0, r3)
            if (r15 != 0) goto L819
            r13.e(r11, r6)
            goto L82a
        L819:
            android.os.Handler r0 = r13.f5402c
            ca.x r9 = new ca.x
            r10 = 7
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.post(r9)
            goto L82a
        L825:
            java.lang.String r0 = "部分选中消息暂不支持发送"
            r13.e(r11, r0)
        L82a:
            return
        L82b:
            java.lang.Object r0 = r1.f1124c
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Object r3 = r1.f1123b
            ha.j0 r3 = (ha.j0) r3
            r2.getClass()
            boolean r4 = ha.j0.m(r0)     // Catch: java.lang.Throwable -> L848
            if (r4 == 0) goto L84a
            java.lang.Object r4 = r2.thisObject     // Catch: java.lang.Throwable -> L848
            java.lang.Object[] r2 = r2.args     // Catch: java.lang.Throwable -> L848
            boolean r0 = ha.j0.l(r0)     // Catch: java.lang.Throwable -> L848
            ha.j0.b(r3, r4, r2, r0)     // Catch: java.lang.Throwable -> L848
            goto L876
        L848:
            r0 = move-exception
            goto L871
        L84a:
            boolean r0 = ha.j0.k(r0)     // Catch: java.lang.Throwable -> L848
            if (r0 == 0) goto L876
            java.lang.ThreadLocal r0 = r3.f5244e     // Catch: java.lang.Throwable -> L848
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L848
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L848
            boolean r0 = gg.l.a(r0, r4)     // Catch: java.lang.Throwable -> L848
            if (r0 == 0) goto L85f
            goto L876
        L85f:
            android.content.SharedPreferences r0 = r3.f5241b     // Catch: java.lang.Throwable -> L848
            java.lang.String r4 = "sns_anti_recall_enable"
            r15 = 0
            boolean r0 = r0.getBoolean(r4, r15)     // Catch: java.lang.Throwable -> L848
            if (r0 != 0) goto L86b
            goto L876
        L86b:
            java.lang.Object[] r0 = r2.args     // Catch: java.lang.Throwable -> L848
            ha.j0.a(r3, r0)     // Catch: java.lang.Throwable -> L848
            goto L876
        L871:
            java.lang.String r2 = "[Hchat:SnsAntiRecall] Hook处理失败"
            fb.v0.n(r2, r0)
        L876:
            return
        L877:
            r2.getClass()
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = h9.d.f5152a
            java.lang.Object r0 = r1.f1123b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r3 = r1.f1124c
            fg.p r3 = (fg.p) r3
            java.lang.Object[] r2 = r2.args     // Catch: java.lang.Throwable -> L88d
            if (r2 == 0) goto L88f
            java.lang.Object r8 = tf.l.z0(r2)     // Catch: java.lang.Throwable -> L88d
            goto L88f
        L88d:
            r0 = move-exception
            goto L895
        L88f:
            h9.d.a(r0, r8, r3)     // Catch: java.lang.Throwable -> L88d
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L88d
            goto L89b
        L895:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L89b:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L8a6
            java.lang.String r2 = "虚拟定位运行时 Hook 失败"
            r3.invoke(r2, r0)
        L8a6:
            return
        L8a7:
            r2.getClass()
            java.lang.Object r0 = r1.f1123b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r3 = "Hchat_fake_location_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r3)
            java.lang.String r3 = "fake_location_enable"
            r15 = 0
            boolean r0 = r0.getBoolean(r3, r15)
            if (r0 != 0) goto L8be
            goto L8c9
        L8be:
            java.lang.Object r0 = r1.f1124c
            fg.a r0 = (fg.a) r0
            java.lang.Object r0 = r0.invoke()
            r2.setResult(r0)
        L8c9:
            return
        L8ca:
            r2.getClass()
            java.lang.Object r0 = r1.f1123b
            ca.e0 r0 = (ca.e0) r0
            java.lang.Object r4 = r1.f1124c
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            ab.b r7 = r0.f1483c
            android.content.SharedPreferences r9 = r0.f1485e
            java.lang.String r10 = "message_forward_multi_moments_enable"
            r15 = 0
            boolean r9 = r9.getBoolean(r10, r15)
            if (r9 != 0) goto L8e4
            goto L983
        L8e4:
            java.lang.Object[] r9 = r2.args
            if (r9 == 0) goto L983
            int r10 = r9.length
        L8e9:
            if (r15 >= r10) goto L8fb
            r11 = r9[r15]
            boolean r12 = r11 instanceof android.view.MenuItem
            if (r12 == 0) goto L8f4
            android.view.MenuItem r11 = (android.view.MenuItem) r11
            goto L8f5
        L8f4:
            r11 = r8
        L8f5:
            if (r11 == 0) goto L8f8
            goto L8fc
        L8f8:
            int r15 = r15 + 1
            goto L8e9
        L8fb:
            r11 = r8
        L8fc:
            if (r11 == 0) goto L983
            int r9 = r11.getItemId()
            r10 = 1212370256(0x48434d50, float:199989.25)
            if (r9 == r10) goto L909
            goto L983
        L909:
            r2.setResult(r8)
            android.app.Activity r8 = ca.e0.b()
            if (r8 == 0) goto L983
            java.lang.Object r9 = r2.thisObject
            java.util.List r9 = k8.b.b(r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r9.iterator()
        L921:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L935
            java.lang.Object r12 = r11.next()
            hb.t r12 = x6.d.y(r12)
            if (r12 == 0) goto L921
            r10.add(r12)
            goto L921
        L935:
            a9.h r11 = new a9.h
            r11.<init>(r3)
            c9.a0 r3 = new c9.a0
            r3.<init>(r11, r5)
            java.util.List r3 = tf.m.K1(r10, r3)
            boolean r5 = r9.isEmpty()
            if (r5 != 0) goto L97e
            int r5 = r3.size()
            int r9 = r9.size()
            if (r5 == r9) goto L954
            goto L97e
        L954:
            ca.c0 r3 = r0.j(r8, r3)
            android.content.Intent r5 = r3.f1468a
            if (r5 != 0) goto L962
            java.lang.String r2 = r3.f1469b
            r0.r(r8, r2)
            goto L983
        L962:
            java.lang.Object r2 = r2.thisObject
            b.e r2 = be.h.X(r2, r4, r7)
            if (r2 != 0) goto L96e
            r0.r(r8, r6)
            goto L983
        L96e:
            r2.r(r7)
            android.os.Handler r2 = r0.f1484d
            ac.l r3 = new ac.l
            r4 = 8
            r3.<init>(r8, r0, r5, r4)
            r2.post(r3)
            goto L983
        L97e:
            java.lang.String r2 = "部分选中消息暂不支持转发到朋友圈"
            r0.r(r8, r2)
        L983:
            return
        L984:
            r2.getClass()
            java.lang.ThreadLocal r0 = c9.d2.f1147k
            r0.remove()
            c9.d2 r3 = c9.d2.f1137a
            java.lang.Object r2 = r2.thisObject
            java.lang.String r2 = c9.d2.v(r2)
            if (r2 == 0) goto L999
            r0.set(r2)
        L999:
            return
    }
}
