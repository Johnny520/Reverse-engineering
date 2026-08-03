package f9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3358c;

    public /* synthetic */ d(boolean r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f3356a = r3
            r0.f3357b = r1
            r0.f3358c = r2
            r0.<init>()
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r25) {
            r24 = this;
            r1 = r24
            r0 = r25
            int r2 = r1.f3356a
            r0.getClass()
            switch(r2) {
                case 0: goto L365;
                case 1: goto Lc6;
                default: goto Lc;
            }
        Lc:
            boolean r2 = r1.f3357b
            if (r2 == 0) goto Lc5
            java.lang.Object r2 = r1.f3358c
            qb.k r2 = (qb.k) r2
            boolean r3 = r2.p()
            if (r3 != 0) goto L1c
            goto Lc5
        L1c:
            java.lang.String r3 = "voice_forward_chat_forward_enable"
            boolean r3 = r2.O(r3)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L32
            android.content.SharedPreferences r3 = r2.f10837d
            java.lang.String r6 = "message_forward_enable"
            boolean r3 = r3.getBoolean(r6, r4)
            if (r3 != 0) goto L32
            r3 = r5
            goto L33
        L32:
            r3 = r4
        L33:
            java.lang.String r6 = "voice_forward_chat_save_enable"
            boolean r6 = r2.O(r6)
            if (r3 != 0) goto L3f
            if (r6 != 0) goto L3f
            goto Lc5
        L3f:
            java.lang.Object[] r0 = r0.args
            if (r0 == 0) goto Lc5
            int r7 = r0.length
            r8 = 3
            if (r7 >= r8) goto L49
            goto Lc5
        L49:
            r9 = r0[r4]
            if (r9 == 0) goto Lc5
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            java.util.Set r7 = java.util.Collections.newSetFromMap(r7)
            r7.getClass()
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r2 = r2.C(r4, r0, r7)
            if (r2 == 0) goto Lc5
            boolean r2 = qb.k.u(r2)
            if (r2 != 0) goto L68
            goto Lc5
        L68:
            java.lang.Object r2 = tf.l.C0(r5, r0)
            boolean r7 = r2 instanceof android.view.View
            r8 = 0
            if (r7 == 0) goto L74
            android.view.View r2 = (android.view.View) r2
            goto L75
        L74:
            r2 = r8
        L75:
            if (r2 == 0) goto L89
            java.lang.Object r2 = r2.getTag()
            if (r2 == 0) goto L89
            java.lang.String r7 = "c"
            java.lang.String r10 = "d"
            java.lang.String[] r7 = new java.lang.String[]{r7, r10}
            r10 = r4
        L86:
            r11 = 2
            if (r10 < r11) goto L8b
        L89:
            r11 = r4
            goto La1
        L8b:
            r11 = r7[r10]
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.invokeMethod(r2, r11, r12)
            boolean r12 = r11 instanceof java.lang.Number
            if (r12 == 0) goto L9e
            java.lang.Number r11 = (java.lang.Number) r11
            int r4 = r11.intValue()
            goto L89
        L9e:
            int r10 = r10 + 1
            goto L86
        La1:
            java.lang.Object r0 = tf.l.C0(r5, r0)
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto Lac
            r8 = r0
            android.view.View r8 = (android.view.View) r8
        Lac:
            r10 = r8
            if (r3 == 0) goto Lb9
            java.lang.String r13 = "转发[H]"
            java.lang.String r14 = "icons_filled_share"
            r12 = 1212372550(0x48435646, float:200025.1)
            qb.k.a(r9, r10, r11, r12, r13, r14)
        Lb9:
            if (r6 == 0) goto Lc5
            java.lang.String r13 = "保存[H]"
            java.lang.String r14 = "icons_filled_download"
            r12 = 1212372563(0x48435653, float:200025.3)
            qb.k.a(r9, r10, r11, r12, r13, r14)
        Lc5:
            return
        Lc6:
            boolean r2 = r1.f3357b
            if (r2 == 0) goto L364
            java.lang.Object r2 = r1.f3358c
            lb.i r2 = (lb.i) r2
            java.util.concurrent.ConcurrentHashMap r3 = r2.f8000s
            java.util.Map r4 = r2.f7999r
            r4.clear()
            r3.clear()
            r8.g r5 = r2.f7982a
            android.content.Context r5 = r5.f11620a
            java.lang.String r6 = "Hchat_swipe_quote_config"
            android.content.SharedPreferences r5 = ub.b.c(r5, r6)
            java.lang.String r6 = "repeat_menu_enable"
            r7 = 0
            boolean r5 = r5.getBoolean(r6, r7)
            if (r5 != 0) goto Led
            goto L364
        Led:
            java.lang.Object[] r0 = r0.args
            if (r0 == 0) goto L364
            java.lang.Object r5 = tf.l.C0(r7, r0)
            if (r5 == 0) goto L364
            r6 = 1
            java.lang.Object r0 = tf.l.C0(r6, r0)
            boolean r8 = r0 instanceof android.view.View
            if (r8 == 0) goto L104
            android.view.View r0 = (android.view.View) r0
            r8 = r0
            goto L105
        L104:
            r8 = 0
        L105:
            if (r8 == 0) goto L364
            java.lang.Object r0 = r8.getTag()
            if (r0 == 0) goto L364
            java.lang.Object r0 = lb.i.K(r0)
            if (r0 == 0) goto L364
            long r10 = lb.i.x(r0)
            q8.m r12 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r12 == 0) goto L122
            java.lang.String r12 = r12.a()
            goto L123
        L122:
            r12 = 0
        L123:
            if (r12 != 0) goto L127
            java.lang.String r12 = ""
        L127:
            r13 = 0
            int r13 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r13 <= 0) goto L364
            boolean r13 = og.m.t0(r12)
            if (r13 == 0) goto L135
            goto L364
        L135:
            lb.c r13 = new lb.c
            r13.<init>(r10, r12, r0)
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.w(r10, r12, r0)     // Catch: java.lang.Throwable -> L14c
            if (r0 == 0) goto L141
            goto L156
        L141:
            k8.s r0 = h.Hchat.hooks.api.core.WeChatApis.messageStore()     // Catch: java.lang.Throwable -> L14c
            if (r0 == 0) goto L14e
            h.Hchat.hooks.api.model.WeChatMessage r0 = r0.c(r10)     // Catch: java.lang.Throwable -> L14c
            goto L156
        L14c:
            r0 = move-exception
            goto L150
        L14e:
            r0 = 0
            goto L156
        L150:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L156:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L15c
            r0 = 0
        L15c:
            h.Hchat.hooks.api.model.WeChatMessage r0 = (h.Hchat.hooks.api.model.WeChatMessage) r0
            if (r0 == 0) goto L364
            boolean r2 = r0.isRedPacket()
            if (r2 != 0) goto L364
            boolean r2 = r0.isTransfer()
            if (r2 == 0) goto L16e
            goto L364
        L16e:
            int r2 = r0.type
            if (r2 > 0) goto L173
            goto L18d
        L173:
            r10 = r2 & 255(0xff, float:3.57E-43)
            r11 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r2
            int r12 = r2 >>> 16
            if (r12 != 0) goto L17e
            goto L18d
        L17e:
            r12 = 10000(0x2710, float:1.4013E-41)
            if (r11 == r12) goto L18c
            r12 = 10002(0x2712, float:1.4016E-41)
            if (r11 == r12) goto L18c
            if (r10 == 0) goto L18d
            if (r11 != r10) goto L18d
            r2 = r10
            goto L18d
        L18c:
            r2 = r11
        L18d:
            boolean r10 = r0.isQuote()
            if (r10 != 0) goto L1c7
            boolean r10 = r0.isVoice()
            if (r10 != 0) goto L1c7
            boolean r10 = fb.v0.y(r0)
            if (r10 != 0) goto L1c7
            boolean r10 = r0.isText()
            if (r10 != 0) goto L1c7
            boolean r10 = r0.isShareCard()
            if (r10 != 0) goto L1c7
            boolean r10 = r0.isImage()
            if (r10 != 0) goto L1c7
            boolean r10 = r0.isEmoji()
            if (r10 != 0) goto L1c7
            boolean r10 = r0.isLocation()
            if (r10 != 0) goto L1c7
            boolean r0 = r0.isVideo()
            if (r0 != 0) goto L1c7
            r0 = 62
            if (r2 != r0) goto L364
        L1c7:
            java.lang.String r0 = "size"
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r0, r2)
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L1d6
            java.lang.Number r0 = (java.lang.Number) r0
            goto L1d7
        L1d6:
            r0 = 0
        L1d7:
            if (r0 == 0) goto L1de
            int r0 = r0.intValue()
            goto L1df
        L1de:
            r0 = r7
        L1df:
            r2 = r7
        L1e0:
            if (r2 < r0) goto L1e4
            r10 = r7
            goto L201
        L1e4:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r11 = "getItem"
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r11, r10)
            boolean r11 = r10 instanceof android.view.MenuItem
            if (r11 == 0) goto L1f9
            android.view.MenuItem r10 = (android.view.MenuItem) r10
            goto L1fa
        L1f9:
            r10 = 0
        L1fa:
            if (r10 == 0) goto L35c
            int r0 = r10.getGroupId()
            r10 = r0
        L201:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            lb.d r12 = new lb.d
            android.content.Context r0 = r8.getContext()
            r0.getClass()
            r12.<init>(r0)
            r0 = 1212371536(0x48435250, float:200009.25)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            android.view.MenuItem r0 = lb.i.f(r5)
            if (r0 == 0) goto L224
            lb.i.a(r5, r0, r12)
        L221:
            r9 = r0
            goto L33e
        L224:
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r15 = r0.getResources()
            android.content.Context r0 = r8.getContext()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "raw"
            java.lang.String r8 = "drawable"
            java.lang.String[] r16 = new java.lang.String[]{r2, r8}
            r2 = r7
        L23d:
            r8 = 2
            r25 = r6
            if (r2 < r8) goto L246
            r6 = r7
            r17 = r6
            goto L252
        L246:
            r6 = r16[r2]
            r17 = r7
            java.lang.String r7 = "icons_filled_edit_photo_pencil"
            int r6 = r15.getIdentifier(r7, r6, r0)
            if (r6 == 0) goto L354
        L252:
            java.lang.String r0 = "复读[H]"
            if (r6 == 0) goto L2df
            java.lang.Class r2 = r5.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            java.util.Iterator r2 = r2.iterator()
        L262:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L2bd
            java.lang.Object r7 = r2.next()
            r15 = r7
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            r18 = r8
            java.lang.Class[] r8 = r15.getParameterTypes()
            java.lang.String r15 = r15.getName()
            java.lang.String r9 = "c"
            boolean r9 = gg.l.a(r15, r9)
            if (r9 == 0) goto L2b6
            int r9 = r8.length
            r15 = 5
            if (r9 != r15) goto L2b6
            r9 = r8[r17]
            java.lang.Class r15 = java.lang.Integer.TYPE
            boolean r9 = gg.l.a(r9, r15)
            if (r9 == 0) goto L2b6
            r9 = r8[r25]
            boolean r9 = gg.l.a(r9, r15)
            if (r9 == 0) goto L2b6
            r9 = r8[r18]
            boolean r9 = gg.l.a(r9, r15)
            if (r9 == 0) goto L2b6
            r9 = 3
            r9 = r8[r9]
            r16 = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r2 = r9.isAssignableFrom(r2)
            if (r2 == 0) goto L2b8
            r2 = 4
            r2 = r8[r2]
            boolean r2 = gg.l.a(r2, r15)
            if (r2 == 0) goto L2b8
            goto L2be
        L2b6:
            r16 = r2
        L2b8:
            r2 = r16
            r8 = r18
            goto L262
        L2bd:
            r7 = 0
        L2be:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r14, r11, r0, r6}
            boolean r2 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r7, r5, r2)
            if (r2 == 0) goto L2df
            android.view.MenuItem r0 = lb.i.f(r5)
            if (r0 == 0) goto L2dd
            lb.i.a(r5, r0, r12)
            goto L221
        L2dd:
            r9 = 0
            goto L33e
        L2df:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r14, r11, r0}
            java.lang.String r6 = "add"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r6, r2)
            if (r2 == 0) goto L2f0
            goto L2fc
        L2f0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r14, r11, r0}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r6, r2)
        L2fc:
            boolean r6 = r2 instanceof android.view.MenuItem
            if (r6 == 0) goto L307
            r9 = r2
            android.view.MenuItem r9 = (android.view.MenuItem) r9
            lb.i.a(r5, r9, r12)
            goto L33e
        L307:
            if (r2 == 0) goto L314
            android.view.MenuItem r0 = lb.i.f(r5)
            if (r0 == 0) goto L2dd
            lb.i.a(r5, r0, r12)
            goto L221
        L314:
            java.lang.Object[] r2 = new java.lang.Object[]{r14, r0}
            java.lang.String r6 = "f"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r6, r2)
            if (r2 == 0) goto L321
            goto L329
        L321:
            java.lang.Object[] r0 = new java.lang.Object[]{r14, r0}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r5, r6, r0)
        L329:
            boolean r0 = r2 instanceof android.view.MenuItem
            if (r0 == 0) goto L330
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            goto L331
        L330:
            r2 = 0
        L331:
            if (r2 == 0) goto L334
            goto L338
        L334:
            android.view.MenuItem r2 = lb.i.f(r5)
        L338:
            if (r2 == 0) goto L2dd
            lb.i.a(r5, r2, r12)
            r9 = r2
        L33e:
            if (r9 == 0) goto L364
            r4.getClass()
            java.util.Map r4 = (java.util.Map) r4
            r4.put(r9, r13)
            int r0 = r9.getGroupId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r0, r13)
            goto L364
        L354:
            int r2 = r2 + 1
            r6 = r25
            r7 = r17
            goto L23d
        L35c:
            r25 = r6
            r17 = r7
            int r2 = r2 + 1
            goto L1e0
        L364:
            return
        L365:
            boolean r2 = r1.f3357b
            if (r2 == 0) goto L74c
            java.lang.Object r2 = r1.f3358c
            f9.e r2 = (f9.e) r2
            java.util.concurrent.ConcurrentHashMap r3 = r2.f3363e
            java.util.Map r4 = r2.f3362d
            r5 = 1212368196(0x48434544, float:199957.06)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.clear()
            r3.clear()
            r8.g r7 = r2.f3359a
            android.content.Context r8 = r7.f11620a
            java.lang.String r9 = "Hchat_edit_message_config"
            android.content.SharedPreferences r8 = ub.b.c(r8, r9)
            java.lang.String r9 = "edit_message_enable"
            r10 = 0
            boolean r8 = r8.getBoolean(r9, r10)
            if (r8 != 0) goto L393
            goto L74c
        L393:
            java.lang.Object[] r0 = r0.args
            if (r0 == 0) goto L74c
            int r8 = r0.length
            r9 = 3
            if (r8 >= r9) goto L39d
            goto L74c
        L39d:
            r8 = r0[r10]
            if (r8 == 0) goto L74c
            r11 = 1
            java.lang.Object r0 = tf.l.C0(r11, r0)
            boolean r12 = r0 instanceof android.view.View
            if (r12 == 0) goto L3ad
            android.view.View r0 = (android.view.View) r0
            goto L3ae
        L3ad:
            r0 = 0
        L3ae:
            if (r0 == 0) goto L74c
            java.lang.Object r12 = r0.getTag()
            boolean r14 = r12 instanceof android.view.View
            if (r14 == 0) goto L3be
            android.view.View r12 = (android.view.View) r12
            java.lang.Object r12 = r12.getTag()
        L3be:
            r14 = 0
            r25 = r9
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            if (r12 != 0) goto L3cd
            r16 = r11
            r20 = r14
        L3ca:
            r12 = 0
            goto L4a5
        L3cd:
            r16 = r11
            java.lang.String r11 = "com.tencent.mm.storage."
            boolean r17 = eh.a.z(r11, r12, r10)
            if (r17 == 0) goto L3eb
            long r17 = r2.c(r12)
            int r17 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r17 <= 0) goto L3eb
            long r17 = r2.c(r12)
            int r17 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r17 <= 0) goto L3eb
            r20 = r14
            goto L4a5
        L3eb:
            java.lang.Class r17 = r12.getClass()
            r13 = r17
        L3f1:
            if (r13 == 0) goto L444
            boolean r17 = r13.equals(r9)
            if (r17 != 0) goto L444
            java.util.List r17 = h.Hchat.utils.KavaReflector.declaredFields(r13)
            java.util.Iterator r17 = r17.iterator()
        L401:
            boolean r19 = r17.hasNext()
            if (r19 == 0) goto L43d
            java.lang.Object r19 = r17.next()
            r20 = r14
            r14 = r19
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            boolean r15 = h.Hchat.utils.KavaReflector.isStatic(r14)
            if (r15 != 0) goto L43a
            java.lang.Class r15 = r14.getType()
            r15.getClass()
            java.lang.String r15 = r15.getName()
            boolean r15 = og.t.d0(r15, r11, r10)
            if (r15 != 0) goto L429
            goto L43a
        L429:
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.readField(r14, r12)
            if (r14 == 0) goto L43a
            long r22 = r2.c(r14)
            int r15 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r15 <= 0) goto L43a
            r12 = r14
            goto L4a5
        L43a:
            r14 = r20
            goto L401
        L43d:
            r20 = r14
            java.lang.Class r13 = r13.getSuperclass()
            goto L3f1
        L444:
            r20 = r14
            java.lang.Class r13 = r12.getClass()
        L44a:
            if (r13 == 0) goto L3ca
            boolean r14 = r13.equals(r9)
            if (r14 != 0) goto L3ca
            java.util.List r14 = h.Hchat.utils.KavaReflector.declaredMethods(r13)
            java.util.Iterator r14 = r14.iterator()
        L45a:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L49d
            java.lang.Object r15 = r14.next()
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            boolean r17 = h.Hchat.utils.KavaReflector.isStatic(r15)
            if (r17 != 0) goto L487
            java.lang.Class[] r5 = r15.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L487
            java.lang.Class r5 = r15.getReturnType()
            r5.getClass()
            java.lang.String r5 = r5.getName()
            boolean r5 = og.t.d0(r5, r11, r10)
            if (r5 != 0) goto L48b
        L487:
            r5 = 1212368196(0x48434544, float:199957.06)
            goto L45a
        L48b:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r15, r12, r5)
            if (r5 == 0) goto L487
            long r22 = r2.c(r5)
            int r15 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r15 <= 0) goto L487
            r12 = r5
            goto L4a5
        L49d:
            java.lang.Class r13 = r13.getSuperclass()
            r5 = 1212368196(0x48434544, float:199957.06)
            goto L44a
        L4a5:
            if (r12 == 0) goto L74c
            android.content.Context r5 = r7.f11620a
            long r13 = r2.c(r12)
            f9.h r2 = be.h.t(r5, r13)
            if (r2 == 0) goto L74c
            long r13 = r2.f3376a
            int r2 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r2 > 0) goto L4bb
            goto L74c
        L4bb:
            java.lang.String r2 = "size"
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r8, r2, r5)
            boolean r5 = r2 instanceof java.lang.Number
            if (r5 == 0) goto L4ca
            java.lang.Number r2 = (java.lang.Number) r2
            goto L4cb
        L4ca:
            r2 = 0
        L4cb:
            if (r2 == 0) goto L4d2
            int r2 = r2.intValue()
            goto L4d3
        L4d2:
            r2 = r10
        L4d3:
            r5 = r10
        L4d4:
            if (r5 < r2) goto L4d8
            r2 = r10
            goto L4f4
        L4d8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r11 = "getItem"
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invokeMethod(r8, r11, r7)
            boolean r11 = r7 instanceof android.view.MenuItem
            if (r11 == 0) goto L4ed
            android.view.MenuItem r7 = (android.view.MenuItem) r7
            goto L4ee
        L4ed:
            r7 = 0
        L4ee:
            if (r7 == 0) goto L73d
            int r2 = r7.getGroupId()
        L4f4:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            android.view.MenuItem r7 = f9.e.a(r8)
            if (r7 == 0) goto L504
            r22 = r4
            r19 = r10
            goto L638
        L504:
            android.content.Context r0 = r0.getContext()
            r7 = 2
            if (r0 == 0) goto L50c
            goto L51a
        L50c:
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto L517
            android.app.Activity r0 = r0.a()
            goto L518
        L517:
            r0 = 0
        L518:
            if (r0 == 0) goto L547
        L51a:
            android.content.res.Resources r11 = r0.getResources()
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r15 = "raw"
            r19 = r10
            java.lang.String r10 = "drawable"
            java.lang.String[] r10 = new java.lang.String[]{r15, r10}
            r15 = r19
        L52e:
            r20 = r7
            if (r15 < r7) goto L535
        L532:
            r1 = r19
            goto L54c
        L535:
            r7 = r10[r15]
            java.lang.String r1 = "icons_filled_edit_photo_pencil"
            int r1 = r11.getIdentifier(r1, r7, r0)
            if (r1 == 0) goto L540
            goto L54c
        L540:
            int r15 = r15 + 1
            r1 = r24
            r7 = r20
            goto L52e
        L547:
            r20 = r7
            r19 = r10
            goto L532
        L54c:
            java.lang.String r0 = "修改[H]"
            if (r1 == 0) goto L5d5
            java.lang.Class r7 = r8.getClass()
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredMethods(r7)
            java.util.Iterator r7 = r7.iterator()
        L55c:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L5b6
            java.lang.Object r10 = r7.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Class[] r15 = r11.getParameterTypes()
            java.lang.String r11 = r11.getName()
            r21 = r2
            java.lang.String r2 = "c"
            boolean r2 = gg.l.a(r11, r2)
            if (r2 == 0) goto L5af
            int r2 = r15.length
            r11 = 5
            if (r2 != r11) goto L5af
            r2 = r15[r19]
            java.lang.Class r11 = java.lang.Integer.TYPE
            boolean r2 = gg.l.a(r2, r11)
            if (r2 == 0) goto L5af
            r2 = r15[r16]
            boolean r2 = gg.l.a(r2, r11)
            if (r2 == 0) goto L5af
            r2 = r15[r20]
            boolean r2 = gg.l.a(r2, r11)
            if (r2 == 0) goto L5af
            r2 = r15[r25]
            r22 = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r2 = r2.isAssignableFrom(r4)
            if (r2 == 0) goto L5b1
            r2 = 4
            r2 = r15[r2]
            boolean r2 = gg.l.a(r2, r11)
            if (r2 == 0) goto L5b1
            goto L5bb
        L5af:
            r22 = r4
        L5b1:
            r2 = r21
            r4 = r22
            goto L55c
        L5b6:
            r21 = r2
            r22 = r4
            r10 = 0
        L5bb:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r6, r5, r0, r4}
            boolean r2 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r10, r8, r2)
            if (r2 == 0) goto L5d9
            android.view.MenuItem r7 = f9.e.a(r8)
            goto L638
        L5d5:
            r21 = r2
            r22 = r4
        L5d9:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r6, r5, r0}
            java.lang.String r4 = "add"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r8, r4, r2)
            if (r2 == 0) goto L5ea
            goto L5f6
        L5ea:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r6, r5, r0}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r8, r4, r2)
        L5f6:
            boolean r4 = r2 instanceof android.view.MenuItem
            if (r4 == 0) goto L606
            if (r1 == 0) goto L606
            r0 = r2
            android.view.MenuItem r0 = (android.view.MenuItem) r0     // Catch: java.lang.Throwable -> L602
            r0.setIcon(r1)     // Catch: java.lang.Throwable -> L602
        L602:
            r7 = r2
            android.view.MenuItem r7 = (android.view.MenuItem) r7
            goto L638
        L606:
            if (r4 == 0) goto L60c
            r7 = r2
            android.view.MenuItem r7 = (android.view.MenuItem) r7
            goto L638
        L60c:
            if (r2 == 0) goto L613
            android.view.MenuItem r7 = f9.e.a(r8)
            goto L638
        L613:
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r0}
            java.lang.String r2 = "f"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r8, r2, r1)
            if (r1 == 0) goto L620
            goto L628
        L620:
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r0}
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r8, r2, r0)
        L628:
            boolean r0 = r1 instanceof android.view.MenuItem
            if (r0 == 0) goto L630
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            r7 = r1
            goto L631
        L630:
            r7 = 0
        L631:
            if (r7 == 0) goto L634
            goto L638
        L634:
            android.view.MenuItem r7 = f9.e.a(r8)
        L638:
            if (r7 == 0) goto L74c
            f9.c r0 = new f9.c
            r0.<init>(r12, r13)
            r22.getClass()
            r4 = r22
            java.util.Map r4 = (java.util.Map) r4
            r4.put(r7, r0)
            int r1 = r7.getGroupId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r1, r0)
            java.lang.Class r0 = r8.getClass()
        L658:
            if (r0 == 0) goto L74c
            boolean r1 = r0.equals(r9)
            if (r1 != 0) goto L74c
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r1 = r1.iterator()
        L668:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L734
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class r4 = r2.getType()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 != 0) goto L681
            goto L668
        L681:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r8)
            boolean r3 = gg.x.e(r2)
            if (r3 == 0) goto L68e
            java.util.List r2 = (java.util.List) r2
            goto L68f
        L68e:
            r2 = 0
        L68f:
            if (r2 == 0) goto L668
            java.util.Iterator r3 = r2.iterator()
            r4 = r19
        L697:
            boolean r5 = r3.hasNext()
            r6 = -1
            if (r5 == 0) goto L6c2
            java.lang.Object r5 = r3.next()
            if (r5 == r7) goto L6be
            boolean r10 = r5 instanceof android.view.MenuItem
            if (r10 == 0) goto L6ab
            android.view.MenuItem r5 = (android.view.MenuItem) r5
            goto L6ac
        L6ab:
            r5 = 0
        L6ac:
            if (r5 == 0) goto L6b8
            int r5 = r5.getItemId()
            r10 = 1212368196(0x48434544, float:199957.06)
            if (r5 != r10) goto L6bb
            goto L6c6
        L6b8:
            r10 = 1212368196(0x48434544, float:199957.06)
        L6bb:
            int r4 = r4 + 1
            goto L697
        L6be:
            r10 = 1212368196(0x48434544, float:199957.06)
            goto L6c6
        L6c2:
            r10 = 1212368196(0x48434544, float:199957.06)
            r4 = r6
        L6c6:
            if (r4 >= 0) goto L6c9
            goto L668
        L6c9:
            java.lang.Object r0 = r2.remove(r4)
            java.util.Iterator r1 = r2.iterator()
            r3 = r19
        L6d3:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L6f4
            java.lang.Object r4 = r1.next()
            boolean r5 = r4 instanceof android.view.MenuItem
            if (r5 == 0) goto L6e4
            android.view.MenuItem r4 = (android.view.MenuItem) r4
            goto L6e5
        L6e4:
            r4 = 0
        L6e5:
            if (r4 == 0) goto L6f1
            int r4 = r4.getItemId()
            r5 = 1212368471(0x48434657, float:199961.36)
            if (r4 != r5) goto L6f1
            goto L6f5
        L6f1:
            int r3 = r3 + 1
            goto L6d3
        L6f4:
            r3 = r6
        L6f5:
            java.util.Iterator r1 = r2.iterator()
            r4 = r19
        L6fb:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L71d
            java.lang.Object r5 = r1.next()
            boolean r7 = r5 instanceof android.view.MenuItem
            if (r7 == 0) goto L70c
            android.view.MenuItem r5 = (android.view.MenuItem) r5
            goto L70d
        L70c:
            r5 = 0
        L70d:
            if (r5 == 0) goto L71a
            int r5 = r5.getItemId()
            r7 = 1212371536(0x48435250, float:200009.25)
            if (r5 != r7) goto L71a
            r6 = r4
            goto L71d
        L71a:
            int r4 = r4 + 1
            goto L6fb
        L71d:
            if (r3 < 0) goto L722
            int r10 = r3 + 1
            goto L729
        L722:
            if (r6 < 0) goto L727
            int r10 = r6 + 1
            goto L729
        L727:
            r10 = r19
        L729:
            int r1 = r2.size()
            if (r10 <= r1) goto L730
            r10 = r1
        L730:
            r2.add(r10, r0)
            goto L74c
        L734:
            r10 = 1212368196(0x48434544, float:199957.06)
            java.lang.Class r0 = r0.getSuperclass()
            goto L658
        L73d:
            r22 = r4
            r19 = r10
            r10 = 1212368196(0x48434544, float:199957.06)
            int r5 = r5 + 1
            r1 = r24
            r10 = r19
            goto L4d4
        L74c:
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            int r2 = r0.f3356a
            r1.getClass()
            switch(r2) {
                case 0: goto L1ad;
                case 1: goto L139;
                default: goto Lc;
            }
        Lc:
            boolean r2 = r0.f3357b
            if (r2 != 0) goto L138
            java.lang.Object r2 = r0.f3358c
            qb.k r2 = (qb.k) r2
            boolean r3 = r2.p()
            if (r3 != 0) goto L1c
            goto L138
        L1c:
            java.lang.Object[] r3 = r1.args
            if (r3 == 0) goto L138
            r4 = 0
            java.lang.Object r5 = tf.l.C0(r4, r3)
            boolean r6 = r5 instanceof android.view.MenuItem
            r7 = 0
            if (r6 == 0) goto L2d
            android.view.MenuItem r5 = (android.view.MenuItem) r5
            goto L2e
        L2d:
            r5 = r7
        L2e:
            if (r5 == 0) goto L138
            int r6 = r5.getItemId()
            r8 = 1212372550(0x48435646, float:200025.1)
            r9 = 1212372563(0x48435653, float:200025.3)
            if (r6 == r8) goto L44
            int r6 = r5.getItemId()
            if (r6 == r9) goto L44
            goto L138
        L44:
            int r6 = r5.getItemId()
            if (r6 != r8) goto L54
            java.lang.String r6 = "voice_forward_chat_forward_enable"
            boolean r6 = r2.O(r6)
            if (r6 != 0) goto L54
            goto L138
        L54:
            int r6 = r5.getItemId()
            if (r6 != r9) goto L64
            java.lang.String r6 = "voice_forward_chat_save_enable"
            boolean r6 = r2.O(r6)
            if (r6 != 0) goto L64
            goto L138
        L64:
            java.util.WeakHashMap r6 = new java.util.WeakHashMap
            r6.<init>()
            java.util.Set r6 = java.util.Collections.newSetFromMap(r6)
            r6.getClass()
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r6 = r2.C(r4, r3, r6)
            r8 = 1
            java.lang.Object r3 = tf.l.C0(r8, r3)
            q8.o r8 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r8 == 0) goto L86
            android.app.Activity r8 = r8.a()
            goto L87
        L86:
            r8 = r7
        L87:
            if (r8 == 0) goto L92
            boolean r10 = r8.isFinishing()
            if (r10 != 0) goto L92
            r7 = r8
            goto Lf7
        L92:
            if (r3 == 0) goto Lf7
            java.util.concurrent.ConcurrentHashMap r8 = r2.f10844k
            java.lang.Class r10 = r3.getClass()
            java.lang.Object r11 = r8.get(r10)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            if (r11 == 0) goto La3
            goto Lde
        La3:
            java.lang.Class r11 = r3.getClass()
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredMethods(r11)
            java.util.Iterator r11 = r11.iterator()
        Laf:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Ld3
            java.lang.Object r12 = r11.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.Class[] r14 = r13.getParameterTypes()
            r14.getClass()
            int r14 = r14.length
            if (r14 != 0) goto Laf
            java.lang.Class<android.app.Activity> r14 = android.app.Activity.class
            java.lang.Class r13 = r13.getReturnType()
            boolean r13 = r14.isAssignableFrom(r13)
            if (r13 == 0) goto Laf
            goto Ld4
        Ld3:
            r12 = r7
        Ld4:
            r11 = r12
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            if (r11 == 0) goto Ldd
            r8.put(r10, r11)
            goto Lde
        Ldd:
            r11 = r7
        Lde:
            if (r11 == 0) goto Lf7
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r11, r3, r4)
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 == 0) goto Led
            android.app.Activity r3 = (android.app.Activity) r3
            goto Lee
        Led:
            r3 = r7
        Lee:
            if (r3 == 0) goto Lf7
            boolean r4 = r3.isFinishing()
            if (r4 != 0) goto Lf7
            r7 = r3
        Lf7:
            if (r6 == 0) goto L12e
            if (r7 != 0) goto Lfc
            goto L12e
        Lfc:
            qb.i r3 = r2.D(r6)
            if (r3 != 0) goto L10d
            java.lang.String r2 = "语音文件不存在"
            qb.k.N(r7, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setResult(r2)
            goto L138
        L10d:
            int r4 = r5.getItemId()
            if (r4 != r9) goto L125
            java.lang.Thread r4 = new java.lang.Thread
            ac.l r5 = new ac.l
            r6 = 29
            r5.<init>(r2, r7, r3, r6)
            java.lang.String r2 = "Hchat-VoiceSave"
            r4.<init>(r5, r2)
            r4.start()
            goto L128
        L125:
            r2.J(r7, r3)
        L128:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setResult(r2)
            goto L138
        L12e:
            java.lang.String r2 = "语音消息不可用"
            qb.k.N(r7, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setResult(r2)
        L138:
            return
        L139:
            boolean r2 = r0.f3357b
            if (r2 != 0) goto L1ac
            java.lang.Object r2 = r0.f3358c
            lb.i r2 = (lb.i) r2
            java.util.concurrent.ConcurrentHashMap r3 = r2.f8000s
            java.util.Map r4 = r2.f7999r
            java.lang.Object[] r1 = r1.args
            if (r1 == 0) goto L1ac
            int r5 = r1.length
            r6 = 0
        L14b:
            r7 = 0
            if (r6 >= r5) goto L15e
            r8 = r1[r6]
            boolean r9 = r8 instanceof android.view.MenuItem
            if (r9 == 0) goto L157
            android.view.MenuItem r8 = (android.view.MenuItem) r8
            goto L158
        L157:
            r8 = r7
        L158:
            if (r8 == 0) goto L15b
            goto L15f
        L15b:
            int r6 = r6 + 1
            goto L14b
        L15e:
            r8 = r7
        L15f:
            if (r8 == 0) goto L1ac
            int r1 = r8.getItemId()
            r5 = 1212371536(0x48435250, float:200009.25)
            if (r1 == r5) goto L16b
            goto L1ac
        L16b:
            java.lang.Object r1 = r4.remove(r8)
            lb.c r1 = (lb.c) r1
            if (r1 == 0) goto L174
            goto L182
        L174:
            int r1 = r8.getGroupId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.remove(r1)
            lb.c r1 = (lb.c) r1
        L182:
            r4.clear()
            r3.clear()
            if (r1 == 0) goto L190
            boolean r1 = r2.F(r1)
            if (r1 != 0) goto L1ac
        L190:
            q8.o r1 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r1 == 0) goto L19a
            android.app.Activity r7 = r1.a()
        L19a:
            if (r7 == 0) goto L19d
            goto L1a1
        L19d:
            r8.g r1 = r2.f7982a
            android.content.Context r7 = r1.f11620a
        L1a1:
            android.os.Handler r1 = r2.f7993l
            c9.p1 r2 = new c9.p1
            r3 = 2
            r2.<init>(r7, r3)
            r1.post(r2)
        L1ac:
            return
        L1ad:
            boolean r2 = r0.f3357b
            if (r2 != 0) goto L38d
            java.lang.Object r2 = r0.f3358c
            r4 = r2
            f9.e r4 = (f9.e) r4
            java.util.concurrent.ConcurrentHashMap r2 = r4.f3363e
            java.util.Map r3 = r4.f3362d
            r8.g r5 = r4.f3359a
            android.content.Context r6 = r5.f11620a
            java.lang.String r7 = "Hchat_edit_message_config"
            android.content.SharedPreferences r6 = ub.b.c(r6, r7)
            java.lang.String r7 = "edit_message_enable"
            r9 = 0
            boolean r6 = r6.getBoolean(r7, r9)
            if (r6 != 0) goto L1cf
            goto L38d
        L1cf:
            java.lang.Object[] r6 = r1.args
            if (r6 == 0) goto L38d
            int r7 = r6.length
            r8 = r9
        L1d5:
            r10 = 0
            if (r8 >= r7) goto L1e8
            r11 = r6[r8]
            boolean r12 = r11 instanceof android.view.MenuItem
            if (r12 == 0) goto L1e1
            android.view.MenuItem r11 = (android.view.MenuItem) r11
            goto L1e2
        L1e1:
            r11 = r10
        L1e2:
            if (r11 == 0) goto L1e5
            goto L1e9
        L1e5:
            int r8 = r8 + 1
            goto L1d5
        L1e8:
            r11 = r10
        L1e9:
            if (r11 == 0) goto L38d
            int r6 = r11.getItemId()
            r7 = 1212368196(0x48434544, float:199957.06)
            if (r6 == r7) goto L1f6
            goto L38d
        L1f6:
            java.lang.Object r1 = r1.thisObject
            q8.o r6 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r6 == 0) goto L203
            android.app.Activity r6 = r6.a()
            goto L204
        L203:
            r6 = r10
        L204:
            if (r6 == 0) goto L20f
            boolean r7 = r6.isFinishing()
            if (r7 != 0) goto L20f
        L20c:
            r14 = r6
            goto L276
        L20f:
            if (r1 == 0) goto L275
            java.util.concurrent.ConcurrentHashMap r6 = r4.f3365g
            java.lang.Class r7 = r1.getClass()
            java.lang.Object r8 = r6.get(r7)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto L220
            goto L25b
        L220:
            java.lang.Class r8 = r1.getClass()
            java.util.List r8 = h.Hchat.utils.KavaReflector.declaredMethods(r8)
            java.util.Iterator r8 = r8.iterator()
        L22c:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L250
            java.lang.Object r12 = r8.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.Class[] r14 = r13.getParameterTypes()
            r14.getClass()
            int r14 = r14.length
            if (r14 != 0) goto L22c
            java.lang.Class<android.app.Activity> r14 = android.app.Activity.class
            java.lang.Class r13 = r13.getReturnType()
            boolean r13 = r14.isAssignableFrom(r13)
            if (r13 == 0) goto L22c
            goto L251
        L250:
            r12 = r10
        L251:
            r8 = r12
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto L25a
            r6.putIfAbsent(r7, r8)
            goto L25b
        L25a:
            r8 = r10
        L25b:
            if (r8 == 0) goto L275
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r8, r1, r6)
            boolean r6 = r1 instanceof android.app.Activity
            if (r6 == 0) goto L26b
            android.app.Activity r1 = (android.app.Activity) r1
            r6 = r1
            goto L26c
        L26b:
            r6 = r10
        L26c:
            if (r6 == 0) goto L275
            boolean r1 = r6.isFinishing()
            if (r1 != 0) goto L275
            goto L20c
        L275:
            r14 = r10
        L276:
            java.lang.Object r1 = r3.remove(r11)
            f9.c r1 = (f9.c) r1
            if (r1 == 0) goto L280
        L27e:
            r6 = r1
            goto L28f
        L280:
            int r1 = r11.getGroupId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.remove(r1)
            f9.c r1 = (f9.c) r1
            goto L27e
        L28f:
            r3.clear()
            r2.clear()
            if (r6 == 0) goto L2b3
            long r1 = r6.f3354a
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto L2a4
            goto L2a5
        L2a4:
            r3 = r10
        L2a5:
            if (r3 == 0) goto L2b3
            long r1 = r3.longValue()
            android.content.Context r3 = r5.f11620a
            f9.h r1 = be.h.t(r3, r1)
            r5 = r1
            goto L2b4
        L2b3:
            r5 = r10
        L2b4:
            if (r14 == 0) goto L388
            if (r6 == 0) goto L388
            if (r5 != 0) goto L2bc
            goto L388
        L2bc:
            c9.q0 r1 = new c9.q0
            r1.<init>(r4, r5, r6, r14)
            c9.n0 r3 = new c9.n0
            r8 = 4
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            c9.h0 r2 = new c9.h0
            r4 = 3
            r2.<init>(r5, r1, r3, r4)
            s0.d r15 = new s0.d
            r1 = 1119126588(0x42b4843c, float:90.25827)
            r3 = 1
            r15.<init>(r1, r2, r3)
            android.view.Window r1 = r14.getWindow()
            if (r1 == 0) goto L2e2
            android.view.View r1 = r1.getDecorView()
            goto L2e3
        L2e2:
            r1 = r10
        L2e3:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L2ea
            r10 = r1
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
        L2ea:
            if (r10 == 0) goto L38d
            c9.a1 r13 = new c9.a1
            r1 = 1
            r13.<init>(r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r9)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r14)
            r2.setBackgroundColor(r9)
            r2.setClickable(r3)
            r2.setFocusable(r3)
            r2.setFocusableInTouchMode(r3)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            r2.setLayoutParams(r4)
            x6.d.H(r10, r13, r13, r13, r13)
            x6.d.H(r2, r13, r13, r13, r13)
            boolean r4 = r13.f1100l
            if (r4 != 0) goto L324
            p4.t r4 = r13.f1097i
            android.os.Bundle r6 = android.os.Bundle.EMPTY
            r4.F(r6)
            r13.f1100l = r3
        L324:
            androidx.lifecycle.s r4 = r13.f1096h
            java.lang.String r6 = "setCurrentState"
            r4.c(r6)
            androidx.lifecycle.l r7 = androidx.lifecycle.l.f291i
            r4.e(r7)
            r4.c(r6)
            androidx.lifecycle.l r7 = androidx.lifecycle.l.f292j
            r4.e(r7)
            r4.c(r6)
            androidx.lifecycle.l r6 = androidx.lifecycle.l.f293k
            r4.e(r6)
            gg.u r21 = new gg.u
            r21.<init>()
            c9.r0 r16 = new c9.r0
            r22 = 6
            r17 = r1
            r18 = r2
            r19 = r10
            r20 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r1 = r18
            r2 = r21
            y1.c1 r4 = new y1.c1
            r4.<init>(r14)
            x6.d.H(r4, r13, r13, r13, r13)
            y1.r1 r6 = y1.r1.f22061h
            r4.setViewCompositionStrategy(r6)
            c9.q0 r12 = new c9.q0
            r17 = 4
            r12.<init>(r13, r14, r15, r16, r17)
            s0.d r6 = new s0.d
            r7 = -1864497144(0xffffffff90de0808, float:-8.7575935E-29)
            r6.<init>(r7, r12, r3)
            r4.setContent(r6)
            r2.f4564g = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r5, r5)
            r1.addView(r4, r2)
            r10.addView(r1)
            r1.requestFocus()
            goto L38d
        L388:
            java.lang.String r1 = "消息不可修改"
            f9.e.d(r14, r1)
        L38d:
            return
    }
}
