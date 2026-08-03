package aa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f130d;

    public /* synthetic */ d(java.lang.Object r1, java.lang.reflect.Method r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f127a = r4
            r0.f128b = r1
            r0.f129c = r2
            r0.f130d = r3
            r0.<init>()
            return
    }

    public d(o8.d r2, java.lang.String r3, java.lang.reflect.Method r4) {
            r1 = this;
            r0 = 2
            r1.f127a = r0
            r1.f130d = r2
            r1.f128b = r3
            r1.f129c = r4
            r2 = -10000(0xffffffffffffd8f0, float:NaN)
            r1.<init>(r2)
            return
    }

    public d(r8.g r1, java.util.List r2, aa.e r3, k8.q r4) {
            r0 = this;
            r4 = 0
            r0.f127a = r4
            r0.f128b = r1
            r0.f129c = r2
            r0.f130d = r3
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.<init>(r1)
            return
    }

    public d(s8.c r2, r8.g r3, java.lang.reflect.Method r4) {
            r1 = this;
            r0 = 3
            r1.f127a = r0
            r1.f129c = r2
            r1.f128b = r3
            r1.f130d = r4
            r1.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.f127a
            switch(r1) {
                case 2: goto Lb;
                default: goto L7;
            }
        L7:
            super.afterHookedMethod(r19)
            return
        Lb:
            java.lang.Object r1 = r0.f130d
            o8.d r1 = (o8.d) r1
            java.lang.ThreadLocal r2 = r1.f9592e
            java.lang.Object r3 = r2.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 1
            if (r3 > r4) goto L139
            r2.remove()
            java.lang.Object r2 = r0.f128b
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.f129c
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r3 = r19
            java.lang.Object[] r5 = r3.args
            java.lang.Object r3 = r3.getResult()
            java.util.concurrent.CopyOnWriteArrayList r7 = r1.f9591d
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L144
            if (r5 != 0) goto L3e
            goto L144
        L3e:
            boolean r7 = r3 instanceof java.lang.Number
            r8 = 0
            if (r7 == 0) goto L4c
            java.lang.Number r3 = (java.lang.Number) r3
            long r10 = r3.longValue()
            r11 = r10
            goto L4d
        L4c:
            r11 = r8
        L4d:
            java.lang.String r3 = "insert"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L85
            int r3 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r3 >= 0) goto L5b
            goto L144
        L5b:
            l8.a r3 = new l8.a
            java.lang.String r7 = o8.d.h(r5)
        L61:
            int r8 = r5.length
            if (r4 >= r8) goto L73
            r8 = r5[r4]
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L6b
            goto L73
        L6b:
            boolean r8 = r8 instanceof android.content.ContentValues
            if (r8 == 0) goto L70
            goto L73
        L70:
            int r4 = r4 + 1
            goto L61
        L73:
            android.content.ContentValues r8 = o8.d.a(r5)
            r2.getName()
            r9 = 0
            r10 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.b(r5)
            goto L144
        L85:
            java.lang.String r3 = "update"
            boolean r3 = r3.equals(r6)
            r7 = 0
            java.lang.String r13 = ""
            if (r3 == 0) goto Le7
            int r3 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r3 > 0) goto L96
            goto L144
        L96:
            l8.a r3 = new l8.a
            r14 = r7
            java.lang.String r7 = o8.d.h(r5)
            android.content.ContentValues r8 = o8.d.a(r5)
            int r9 = r5.length
            r15 = 0
            r16 = 0
        La5:
            if (r15 >= r9) goto Lbb
            r17 = r4
            r4 = r5[r15]
            boolean r10 = r4 instanceof android.content.ContentValues
            if (r10 == 0) goto Lb2
            r16 = r17
            goto Lbd
        Lb2:
            if (r16 == 0) goto Lbd
            boolean r10 = r4 instanceof java.lang.String
            if (r10 == 0) goto Lbd
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
        Lbb:
            r9 = r13
            goto Lc2
        Lbd:
            int r15 = r15 + 1
            r4 = r17
            goto La5
        Lc2:
            int r4 = r5.length
            r10 = 0
        Lc4:
            if (r10 >= r4) goto Ld0
            r13 = r5[r10]
            boolean r15 = r13 instanceof java.lang.String[]
            if (r15 == 0) goto Lcd
            goto Ld1
        Lcd:
            int r10 = r10 + 1
            goto Lc4
        Ld0:
            r13 = r14
        Ld1:
            boolean r4 = r13 instanceof java.lang.String[]
            if (r4 == 0) goto Lda
            r4 = r13
            java.lang.String[] r4 = (java.lang.String[]) r4
            r10 = r4
            goto Ldb
        Lda:
            r10 = r14
        Ldb:
            r2.getName()
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.b(r5)
            goto L144
        Le7:
            r17 = r4
            r14 = r7
            java.lang.String r3 = "delete"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L144
            int r3 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r3 <= 0) goto L144
            int r3 = r5.length
            r4 = 3
            if (r3 >= r4) goto Lfb
            goto L144
        Lfb:
            l8.a r3 = new l8.a
            java.lang.String r7 = o8.d.h(r5)
            r4 = r17
        L103:
            int r8 = r5.length
            if (r4 >= r8) goto L10f
            r8 = r5[r4]
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L111
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
        L10f:
            r9 = r13
            goto L114
        L111:
            int r4 = r4 + 1
            goto L103
        L114:
            int r4 = r5.length
            r10 = 0
        L116:
            if (r10 >= r4) goto L122
            r8 = r5[r10]
            boolean r13 = r8 instanceof java.lang.String[]
            if (r13 == 0) goto L11f
            goto L123
        L11f:
            int r10 = r10 + 1
            goto L116
        L122:
            r8 = r14
        L123:
            boolean r4 = r8 instanceof java.lang.String[]
            if (r4 == 0) goto L12c
            r4 = r8
            java.lang.String[] r4 = (java.lang.String[]) r4
            r10 = r4
            goto L12d
        L12c:
            r10 = r14
        L12d:
            r2.getName()
            r8 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.b(r5)
            goto L144
        L139:
            r17 = r4
            int r3 = r3 + (-1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2.set(r1)
        L144:
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r38) {
            r37 = this;
            r1 = r37
            r2 = r38
            int r0 = r1.f127a
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            java.lang.Object r7 = r1.f129c
            r8 = 1
            java.lang.Object r9 = r1.f128b
            java.lang.Object r10 = r1.f130d
            switch(r0) {
                case 0: goto L21e;
                case 1: goto L1bd;
                case 2: goto Ld0;
                case 3: goto L5b;
                default: goto L16;
            }
        L16:
            r2.getClass()
            java.lang.Object[] r0 = r2.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r8, r0)
            boolean r4 = r0 instanceof android.content.Intent
            if (r4 == 0) goto L29
            android.content.Intent r0 = (android.content.Intent) r0
            goto L2a
        L29:
            r0 = r6
        L2a:
            java.lang.ClassLoader r10 = (java.lang.ClassLoader) r10
            java.lang.String r4 = "com.tencent.tinker.loader.shareutil.ShareIntentUtil"
            java.lang.Class r4 = r10.loadClass(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "setIntentReturnCode"
            java.lang.Class<android.content.Intent> r10 = android.content.Intent.class
            java.lang.Class[] r3 = new java.lang.Class[]{r10, r3}     // Catch: java.lang.Throwable -> L4f
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch: java.lang.Throwable -> L4f
            r3.setAccessible(r8)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L4f
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r4}     // Catch: java.lang.Throwable -> L4f
            r3.invoke(r6, r0)     // Catch: java.lang.Throwable -> L4f
        L4f:
            uf.d r9 = (uf.d) r9
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Object r0 = uf.d.a(r9, r7)
            r2.setResult(r0)
            return
        L5b:
            r2.getClass()
            s8.c r7 = (s8.c) r7
            r8.g r9 = (r8.g) r9
            boolean r0 = s8.c.k(r7, r9)
            if (r0 == 0) goto Lcf
            boolean r0 = s8.c.C(r9)
            if (r0 != 0) goto L6f
            goto Lcf
        L6f:
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto L78
            java.lang.Object r0 = tf.l.C0(r5, r0)
            goto L79
        L78:
            r0 = r6
        L79:
            boolean r4 = r0 instanceof java.lang.Number
            if (r4 == 0) goto L80
            java.lang.Number r0 = (java.lang.Number) r0
            goto L81
        L80:
            r0 = r6
        L81:
            if (r0 == 0) goto Lcf
            long r11 = r0.longValue()
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto Lcf
            java.lang.Object r0 = tf.l.C0(r8, r0)
            if (r0 == 0) goto Lcf
            int r4 = s8.c.I(r0)
            boolean r4 = s8.c.B(r4)
            if (r4 != 0) goto L9c
            goto Lcf
        L9c:
            java.util.Set r4 = r7.f12386g
            java.lang.Long r8 = java.lang.Long.valueOf(r11)
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto Lae
            boolean r0 = s8.c.G(r0)
            if (r0 == 0) goto Lcf
        Lae:
            r7.F(r11)
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Class r0 = r10.getReturnType()
            boolean r3 = gg.l.a(r0, r3)
            if (r3 == 0) goto Lc2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            goto Lcc
        Lc2:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto Lcc
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        Lcc:
            r2.setResult(r6)
        Lcf:
            return
        Ld0:
            o8.d r10 = (o8.d) r10
            java.lang.ThreadLocal r0 = r10.f9592e
            java.lang.Object r3 = r0.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r3 + r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.set(r3)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r2.thisObject
            java.lang.Object[] r0 = r2.args
            if (r0 != 0) goto Lf0
            goto L1bc
        Lf0:
            java.lang.String r2 = "insert"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L102
            java.lang.String r2 = "update"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L102
            goto L1bc
        L102:
            android.content.ContentValues r2 = o8.d.a(r0)
            if (r2 != 0) goto L10a
            goto L1bc
        L10a:
            java.lang.String r0 = o8.d.h(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L116
            goto L1bc
        L116:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r3 = "message"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L132
            java.lang.String r3 = "message_"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L132
            java.lang.String r3 = "_message"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L1bc
        L132:
            java.lang.String r0 = "msgSource"
            boolean r3 = r2.containsKey(r0)
            java.lang.String r5 = "lvbuffer"
            if (r3 != 0) goto L152
            boolean r3 = r2.containsKey(r5)
            if (r3 != 0) goto L152
            java.lang.String r3 = "msgId"
            boolean r3 = r2.containsKey(r3)
            if (r3 != 0) goto L152
            java.lang.String r3 = "msgSvrId"
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L1bc
        L152:
            boolean r3 = r2.containsKey(r0)
            if (r3 != 0) goto L15a
            goto L1bc
        L15a:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L16e
            boolean r3 = r2.containsKey(r0)
            if (r3 != 0) goto L167
            goto L16e
        L167:
            java.lang.String r3 = r2.getAsString(r0)     // Catch: java.lang.Throwable -> L170
            if (r3 == 0) goto L16e
            goto L17a
        L16e:
            r3 = r4
            goto L17a
        L170:
            java.lang.Object r3 = r2.get(r0)
            if (r3 == 0) goto L16e
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L17a:
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L181
            goto L1bc
        L181:
            boolean r3 = r2.containsKey(r5)
            if (r3 != 0) goto L188
            goto L1b2
        L188:
            byte[] r3 = r2.getAsByteArray(r5)     // Catch: java.lang.Throwable -> L1a4
            if (r3 == 0) goto L1a4
            int r6 = r3.length     // Catch: java.lang.Throwable -> L1a4
            if (r6 <= 0) goto L1a4
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L1a4
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1a4
            r6.<init>(r3, r7)     // Catch: java.lang.Throwable -> L1a4
            java.lang.String r3 = o8.d.c(r6)     // Catch: java.lang.Throwable -> L1a4
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1a4
            if (r6 != 0) goto L1a4
            r4 = r3
            goto L1b2
        L1a4:
            java.lang.Object r3 = r2.get(r5)     // Catch: java.lang.Throwable -> L1b2
            if (r3 == 0) goto L1b2
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L1b2
            java.lang.String r4 = o8.d.c(r3)     // Catch: java.lang.Throwable -> L1b2
        L1b2:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L1b9
            goto L1bc
        L1b9:
            r2.put(r0, r4)
        L1bc:
            return
        L1bd:
            r2.getClass()
            ea.c r9 = (ea.c) r9
            java.lang.Object r0 = r9.f2483b
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r3 = "enable"
            boolean r0 = r0.getBoolean(r3, r5)
            if (r0 != 0) goto L1cf
            goto L21d
        L1cf:
            java.lang.Object r0 = r9.f2483b
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r3 = "sdk_id"
            java.lang.String r0 = r0.getString(r3, r4)
            if (r0 != 0) goto L1dc
            r0 = r4
        L1dc:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Object r3 = r9.f2483b
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r5 = "sdk_app_name"
            java.lang.String r3 = r3.getString(r5, r4)
            if (r3 != 0) goto L1f1
            goto L1f2
        L1f1:
            r4 = r3
        L1f2:
            java.lang.CharSequence r3 = og.m.R0(r4)
            java.lang.String r3 = r3.toString()
            boolean r4 = og.m.t0(r0)
            if (r4 != 0) goto L21d
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L207
            goto L21d
        L207:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Object r4 = r2.thisObject
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            h.Hchat.utils.KavaReflector.invoke(r7, r4, r0)
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Object r0 = r2.thisObject
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            h.Hchat.utils.KavaReflector.invoke(r10, r0, r2)
        L21d:
            return
        L21e:
            java.lang.String r3 = "message_block_templates"
            aa.e r10 = (aa.e) r10
            r8.g r9 = (r8.g) r9
            r2.getClass()
            java.lang.Object[] r11 = r2.args
            if (r11 == 0) goto L7f7
            android.content.Context r0 = r9.f11620a
            java.lang.String r12 = "Hchat_message_block_config"
            android.content.SharedPreferences r12 = ub.b.c(r0, r12)
            java.lang.String r0 = "message_block_enable"
            boolean r0 = r12.getBoolean(r0, r5)     // Catch: java.lang.Throwable -> L23a
            goto L23b
        L23a:
            r0 = r5
        L23b:
            if (r0 != 0) goto L23f
            goto L7f7
        L23f:
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r0 == 0) goto L24a
            java.lang.String r0 = r0.c()
            goto L24b
        L24a:
            r0 = r6
        L24b:
            if (r0 != 0) goto L24f
            r13 = r4
            goto L250
        L24f:
            r13 = r0
        L250:
            java.util.Iterator r7 = r7.iterator()
        L254:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L7f7
            java.lang.Object r0 = r7.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r0 = tf.l.C0(r0, r11)
            if (r0 == 0) goto L7f3
            l8.e r0 = k8.q.k(r0, r13)     // Catch: java.lang.Throwable -> L26f
            goto L276
        L26f:
            r0 = move-exception
            sf.f r14 = new sf.f
            r14.<init>(r0)
            r0 = r14
        L276:
            boolean r14 = r0 instanceof sf.f
            if (r14 == 0) goto L27c
            r0 = r6
        L27c:
            l8.e r0 = (l8.e) r0
            if (r0 == 0) goto L7f3
            java.lang.String r14 = r0.f7913i
            java.lang.String r15 = r0.f7910f
            java.lang.String r6 = r0.f7914j
            java.lang.String r5 = r0.f7909e
            java.lang.String r8 = r0.f7912h
            java.lang.String r1 = r0.f7911g
            r18 = r5
            java.lang.String r5 = r0.f7915k
            r25 = r6
            r27 = r7
            long r6 = r0.f7907c
            boolean r16 = og.m.t0(r8)
            r28 = r6
            java.lang.String r6 = "@im.chatroom"
            java.lang.String r7 = "@chatroom"
            r30 = 1000(0x3e8, double:4.94E-321)
            r32 = 0
            if (r16 != 0) goto L2ac
            boolean r16 = og.m.t0(r1)
            if (r16 == 0) goto L2bc
        L2ac:
            r17 = r3
            r26 = r5
            r5 = r8
            r16 = r11
            r34 = r13
            r35 = r14
            r36 = r15
            r8 = r1
            goto L682
        L2bc:
            boolean r16 = og.m.t0(r5)
            if (r16 != 0) goto L2c9
            boolean r16 = r1.equals(r5)
            if (r16 == 0) goto L2c9
            goto L2ac
        L2c9:
            l8.d r16 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            int r17 = (r28 > r32 ? 1 : (r28 == r32 ? 0 : -1))
            if (r17 <= 0) goto L2d4
            long r19 = r28 * r30
        L2d1:
            r17 = r1
            goto L2d9
        L2d4:
            long r19 = java.lang.System.currentTimeMillis()
            goto L2d1
        L2d9:
            int r1 = r0.f7906b
            r34 = r13
            r35 = r14
            long r13 = r0.f7908d
            r16.getClass()
            r21 = 0
            r22 = r1
            r26 = r5
            r16 = r8
            r23 = r13
            h.Hchat.hooks.api.model.WeChatMessage r1 = l8.d.k(r16, r17, r18, r19, r21, r22, r23, r25, r26)
            r5 = r16
            r8 = r17
            java.lang.String r13 = r12.getString(r3, r4)     // Catch: java.lang.Throwable -> L2fd
            if (r13 == 0) goto L2fd
            goto L2fe
        L2fd:
            r13 = r4
        L2fe:
            java.util.List r13 = a2.a.C(r13)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L30b:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L328
            r16 = r11
            java.lang.Object r11 = r13.next()
            r17 = r13
            r13 = r11
            aa.h r13 = (aa.h) r13
            boolean r13 = r13.f134c
            if (r13 == 0) goto L323
            r14.add(r11)
        L323:
            r11 = r16
            r13 = r17
            goto L30b
        L328:
            r16 = r11
            int r11 = tf.n.e1(r14)
            int r11 = tf.y.a0(r11)
            r13 = 16
            if (r11 >= r13) goto L337
            r11 = r13
        L337:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r11)
            java.util.Iterator r11 = r14.iterator()
        L340:
            boolean r17 = r11.hasNext()
            if (r17 == 0) goto L35b
            r17 = r11
            java.lang.Object r11 = r17.next()
            r19 = r14
            r14 = r11
            aa.h r14 = (aa.h) r14
            java.lang.String r14 = r14.f132a
            r13.put(r14, r11)
            r11 = r17
            r14 = r19
            goto L340
        L35b:
            r19 = r14
            java.lang.String r11 = "message_block_bindings"
            java.lang.String r11 = r12.getString(r11, r4)     // Catch: java.lang.Throwable -> L366
            if (r11 == 0) goto L366
            goto L367
        L366:
            r11 = r4
        L367:
            java.util.List r14 = a2.a.w(r11)
            boolean r11 = og.m.t0(r11)
            if (r11 != 0) goto L372
            goto L382
        L372:
            java.lang.String r11 = r12.getString(r3, r4)     // Catch: java.lang.Throwable -> L379
            if (r11 == 0) goto L379
            goto L37a
        L379:
            r11 = r4
        L37a:
            java.util.List r11 = a2.a.C(r11)
            java.util.List r14 = a2.a.m(r11)
        L382:
            boolean r11 = r14.isEmpty()
            if (r11 != 0) goto L53c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r14 = r14.iterator()
        L391:
            boolean r17 = r14.hasNext()
            if (r17 == 0) goto L3db
            r17 = r3
            java.lang.Object r3 = r14.next()
            r20 = r14
            r14 = r3
            aa.a r14 = (aa.a) r14
            r14.getClass()
            boolean r21 = android.text.TextUtils.isEmpty(r5)
            if (r21 != 0) goto L3b1
            boolean r21 = android.text.TextUtils.isEmpty(r8)
            if (r21 == 0) goto L3b4
        L3b1:
            r36 = r15
            goto L3cc
        L3b4:
            r36 = r15
            java.lang.String r15 = r14.f105b
            java.lang.String r2 = "group_member"
            boolean r2 = gg.l.a(r15, r2)
            java.lang.String r14 = r14.f106c
            if (r2 == 0) goto L3c7
            boolean r2 = aa.f.b(r14, r5, r8)
            goto L3cd
        L3c7:
            boolean r2 = aa.f.g(r14, r5, r8)
            goto L3cd
        L3cc:
            r2 = 0
        L3cd:
            if (r2 == 0) goto L3d2
            r11.add(r3)
        L3d2:
            r2 = r38
            r3 = r17
            r14 = r20
            r15 = r36
            goto L391
        L3db:
            r17 = r3
            r36 = r15
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L540
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r11.iterator()
        L3ee:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L403
            java.lang.Object r11 = r3.next()
            r14 = r11
            aa.a r14 = (aa.a) r14
            boolean r14 = r14.f108e
            if (r14 == 0) goto L3ee
            r2.add(r11)
            goto L3ee
        L403:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L40b
            goto L682
        L40b:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L412
            goto L439
        L412:
            java.util.Iterator r3 = r2.iterator()
        L416:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L439
            java.lang.Object r11 = r3.next()
            aa.a r11 = (aa.a) r11
            java.lang.String r14 = r11.f109f
            java.lang.String r15 = "exclude"
            boolean r14 = gg.l.a(r14, r15)
            if (r14 == 0) goto L434
            boolean r11 = aa.e.k(r11, r13)
            if (r11 == 0) goto L434
            r11 = 1
            goto L435
        L434:
            r11 = 0
        L435:
            if (r11 == 0) goto L416
            goto L682
        L439:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L442:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L45d
            java.lang.Object r11 = r2.next()
            r14 = r11
            aa.a r14 = (aa.a) r14
            java.lang.String r14 = r14.f109f
            java.lang.String r15 = "block"
            boolean r14 = gg.l.a(r14, r15)
            if (r14 == 0) goto L442
            r3.add(r11)
            goto L442
        L45d:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L464
            goto L491
        L464:
            java.util.Iterator r2 = r3.iterator()
        L468:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L491
            java.lang.Object r11 = r2.next()
            aa.a r11 = (aa.a) r11
            boolean r14 = r11.f111h
            if (r14 == 0) goto L48c
            boolean r14 = aa.e.k(r11, r13)
            if (r14 == 0) goto L48c
            boolean r14 = r11.f112i
            java.util.Set r15 = r11.f113j
            java.lang.String r11 = r11.f114k
            boolean r11 = aa.e.l(r14, r15, r11, r0, r1)
            if (r11 == 0) goto L48c
            r11 = 1
            goto L48d
        L48c:
            r11 = 0
        L48d:
            if (r11 == 0) goto L468
            goto L680
        L491:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L49a:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L4af
            java.lang.Object r11 = r3.next()
            r14 = r11
            aa.a r14 = (aa.a) r14
            boolean r14 = r14.f111h
            if (r14 != 0) goto L49a
            r2.add(r11)
            goto L49a
        L4af:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L4b8:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L4ce
            java.lang.Object r11 = r2.next()
            aa.a r11 = (aa.a) r11
            java.util.Set r11 = r11.f110g
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            tf.r.h1(r3, r11)
            goto L4b8
        L4ce:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L4d7:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L4ef
            java.lang.Object r11 = r3.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r13.get(r11)
            aa.h r11 = (aa.h) r11
            if (r11 == 0) goto L4d7
            r2.add(r11)
            goto L4d7
        L4ef:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r2 = r2.iterator()
        L4fd:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L516
            java.lang.Object r13 = r2.next()
            r14 = r13
            aa.h r14 = (aa.h) r14
            java.lang.String r14 = r14.f132a
            boolean r14 = r3.add(r14)
            if (r14 == 0) goto L4fd
            r11.add(r13)
            goto L4fd
        L516:
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L51e
            goto L682
        L51e:
            java.util.Iterator r2 = r11.iterator()
        L522:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L682
            java.lang.Object r3 = r2.next()
            aa.h r3 = (aa.h) r3
            boolean r11 = r3.f140i
            java.util.Set r13 = r3.f141j
            java.lang.String r3 = r3.f142k
            boolean r3 = aa.e.l(r11, r13, r3, r0, r1)
            if (r3 == 0) goto L522
            goto L680
        L53c:
            r17 = r3
            r36 = r15
        L540:
            boolean r2 = r1.isOfficialAccount()
            if (r2 == 0) goto L558
            java.lang.String r2 = "message_block_default_official"
            java.lang.String r2 = r12.getString(r2, r4)     // Catch: java.lang.Throwable -> L551
            if (r2 == 0) goto L551
        L54e:
            r3 = 0
            r11 = 1
            goto L553
        L551:
            r2 = r4
            goto L54e
        L553:
            aa.b r2 = a2.a.x(r2, r3, r11)
            goto L588
        L558:
            r3 = 0
            boolean r2 = og.t.W(r5, r7, r3)
            if (r2 != 0) goto L577
            boolean r2 = og.t.W(r5, r6, r3)
            if (r2 == 0) goto L566
            goto L577
        L566:
            java.lang.String r2 = "message_block_default_private"
            java.lang.String r2 = r12.getString(r2, r4)     // Catch: java.lang.Throwable -> L570
            if (r2 == 0) goto L570
        L56e:
            r3 = 0
            goto L572
        L570:
            r2 = r4
            goto L56e
        L572:
            aa.b r2 = a2.a.x(r2, r3, r3)
            goto L588
        L577:
            java.lang.String r2 = "message_block_default_group"
            java.lang.String r2 = r12.getString(r2, r4)     // Catch: java.lang.Throwable -> L582
            if (r2 == 0) goto L582
        L57f:
            r3 = 0
            r11 = 1
            goto L584
        L582:
            r2 = r4
            goto L57f
        L584:
            aa.b r2 = a2.a.x(r2, r11, r3)
        L588:
            boolean r3 = r2.f118d
            if (r3 == 0) goto L60e
            boolean r3 = r2.f120f
            if (r3 == 0) goto L59c
            boolean r3 = r2.f121g
            java.util.Set r11 = r2.f122h
            java.lang.String r2 = r2.f123i
            boolean r1 = aa.e.l(r3, r11, r2, r0, r1)
            goto L683
        L59c:
            java.util.Set r2 = r2.f119e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L5a9:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L5c1
            java.lang.Object r11 = r2.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r11 = r13.get(r11)
            aa.h r11 = (aa.h) r11
            if (r11 == 0) goto L5a9
            r3.add(r11)
            goto L5a9
        L5c1:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r3 = r3.iterator()
        L5cf:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L5e8
            java.lang.Object r13 = r3.next()
            r14 = r13
            aa.h r14 = (aa.h) r14
            java.lang.String r14 = r14.f132a
            boolean r14 = r2.add(r14)
            if (r14 == 0) goto L5cf
            r11.add(r13)
            goto L5cf
        L5e8:
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L5f0
            goto L682
        L5f0:
            java.util.Iterator r2 = r11.iterator()
        L5f4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L682
            java.lang.Object r3 = r2.next()
            aa.h r3 = (aa.h) r3
            boolean r11 = r3.f140i
            java.util.Set r13 = r3.f141j
            java.lang.String r3 = r3.f142k
            boolean r3 = aa.e.l(r11, r13, r3, r0, r1)
            if (r3 == 0) goto L5f4
            goto L680
        L60e:
            boolean r2 = r19.isEmpty()
            if (r2 == 0) goto L616
            goto L682
        L616:
            boolean r2 = r19.isEmpty()
            if (r2 == 0) goto L61d
            goto L644
        L61d:
            java.util.Iterator r2 = r19.iterator()
        L621:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L644
            java.lang.Object r3 = r2.next()
            aa.h r3 = (aa.h) r3
            java.lang.String r11 = r3.f138g
            boolean r11 = aa.f.f(r11, r5, r8)
            if (r11 != 0) goto L640
            java.lang.String r3 = r3.f139h
            boolean r3 = aa.f.a(r3, r5, r8)
            if (r3 == 0) goto L63e
            goto L640
        L63e:
            r3 = 0
            goto L641
        L640:
            r3 = 1
        L641:
            if (r3 == 0) goto L621
            goto L682
        L644:
            boolean r2 = r19.isEmpty()
            if (r2 == 0) goto L64b
            goto L682
        L64b:
            java.util.Iterator r2 = r19.iterator()
        L64f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L682
            java.lang.Object r3 = r2.next()
            aa.h r3 = (aa.h) r3
            int r11 = r3.f135d
            r13 = 1
            if (r11 != r13) goto L661
            goto L674
        L661:
            java.lang.String r11 = r3.f136e
            boolean r11 = aa.f.f(r11, r5, r8)
            if (r11 != 0) goto L674
            java.lang.String r11 = r3.f137f
            boolean r11 = aa.f.a(r11, r5, r8)
            if (r11 == 0) goto L672
            goto L674
        L672:
            r3 = 0
            goto L67e
        L674:
            boolean r11 = r3.f140i
            java.util.Set r13 = r3.f141j
            java.lang.String r3 = r3.f142k
            boolean r3 = aa.e.l(r11, r13, r3, r0, r1)
        L67e:
            if (r3 == 0) goto L64f
        L680:
            r1 = 1
            goto L683
        L682:
            r1 = 0
        L683:
            if (r1 == 0) goto L7e2
            java.util.concurrent.atomic.AtomicInteger r1 = x9.d.f21409a
            android.content.Context r1 = r9.f11620a
            x9.e r2 = new x9.e
            r2.<init>(r1)
            java.lang.String r1 = "keyword_notify_enable"
            r3 = 0
            boolean r1 = r2.a(r1, r3)
            if (r1 != 0) goto L6a2
        L697:
            r17 = r8
            r3 = r25
            r21 = r35
            r15 = r36
            r1 = 0
            goto L7a1
        L6a2:
            boolean r1 = og.m.t0(r5)
            if (r1 != 0) goto L697
            boolean r1 = og.m.t0(r8)
            if (r1 != 0) goto L697
            boolean r1 = og.m.t0(r18)
            if (r1 == 0) goto L6b5
            goto L697
        L6b5:
            boolean r1 = r2.e(r5)
            if (r1 != 0) goto L6bc
            goto L697
        L6bc:
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            int r3 = (r28 > r32 ? 1 : (r28 == r32 ? 0 : -1))
            if (r3 <= 0) goto L6c7
            long r3 = r28 * r30
        L6c4:
            r19 = r3
            goto L6cc
        L6c7:
            long r3 = java.lang.System.currentTimeMillis()
            goto L6c4
        L6cc:
            int r3 = r0.f7906b
            long r11 = r0.f7908d
            r1.getClass()
            r21 = 0
            r22 = r3
            r16 = r5
            r17 = r8
            r23 = r11
            h.Hchat.hooks.api.model.WeChatMessage r1 = l8.d.k(r16, r17, r18, r19, r21, r22, r23, r25, r26)
            r3 = r25
            java.lang.String r16 = x9.d.h(r1)
            boolean r4 = r1.isGroupChat()
            if (r4 != 0) goto L6fe
            r4 = 0
            boolean r8 = og.t.W(r5, r7, r4)
            if (r8 != 0) goto L6fe
            boolean r8 = og.t.W(r5, r6, r4)
            if (r8 == 0) goto L6fb
            goto L6fe
        L6fb:
            r22 = 0
            goto L700
        L6fe:
            r22 = 1
        L700:
            k8.o r14 = new k8.o
            r24 = 0
            java.lang.String r15 = "message_block_precheck"
            r23 = 0
            r25 = r1
            r19 = r18
            r21 = r35
            r20 = r36
            r18 = r17
            r17 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r17 = r18
            r18 = r19
            r15 = r20
            if (r22 != 0) goto L735
            boolean r1 = r14.j()
            if (r1 != 0) goto L735
            r1 = 0
            boolean r4 = og.t.W(r5, r7, r1)
            if (r4 != 0) goto L736
            boolean r4 = og.t.W(r5, r6, r1)
            if (r4 == 0) goto L733
            goto L736
        L733:
            r4 = r1
            goto L737
        L735:
            r1 = 0
        L736:
            r4 = 1
        L737:
            if (r22 != 0) goto L74e
            boolean r8 = r14.j()
            if (r8 != 0) goto L74e
            boolean r7 = og.t.W(r5, r7, r1)
            if (r7 != 0) goto L74e
            boolean r6 = og.t.W(r5, r6, r1)
            if (r6 == 0) goto L74c
            goto L74e
        L74c:
            r6 = r1
            goto L74f
        L74e:
            r6 = 1
        L74f:
            java.lang.String r7 = r14.f7448e
            boolean r8 = og.m.t0(r7)
            if (r8 == 0) goto L75b
            java.lang.String r7 = r14.a()
        L75b:
            r7.getClass()
            java.lang.String r8 = x9.d.j(r14, r7)
            boolean r11 = og.m.t0(r8)
            if (r11 == 0) goto L76a
        L768:
            r11 = 0
            goto L775
        L76a:
            java.lang.String r7 = x9.d.g(r2, r14, r6, r7, r8)
            if (r7 == 0) goto L768
            x9.b r11 = new x9.b
            r11.<init>(r7, r8, r6)
        L775:
            if (r11 == 0) goto L779
            r11 = 1
            goto L7a0
        L779:
            if (r4 != 0) goto L77c
            goto L7a1
        L77c:
            java.lang.String r4 = "keyword_notify_at_all"
            r11 = 1
            boolean r4 = r2.a(r4, r11)
            if (r4 == 0) goto L792
            boolean r4 = r14.n()
            if (r4 != 0) goto L7a0
            boolean r4 = r14.e()
            if (r4 == 0) goto L792
            goto L7a0
        L792:
            java.lang.String r4 = "keyword_notify_at_me"
            boolean r2 = r2.a(r4, r11)
            if (r2 == 0) goto L7a1
            boolean r2 = r14.g()
            if (r2 == 0) goto L7a1
        L7a0:
            r1 = r11
        L7a1:
            if (r1 == 0) goto L7a4
            goto L7f7
        L7a4:
            f8.c r1 = r9.f11625f     // Catch: java.lang.Throwable -> L7c9
            f8.f r14 = new f8.f     // Catch: java.lang.Throwable -> L7c9
            int r2 = r0.f7906b     // Catch: java.lang.Throwable -> L7c9
            java.lang.String r19 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7c9
            long r6 = r0.f7907c     // Catch: java.lang.Throwable -> L7c9
            long r8 = r0.f7908d     // Catch: java.lang.Throwable -> L7c9
            r24 = r3
            r22 = r8
            r16 = r17
            r25 = r26
            r17 = r5
            r26 = r21
            r20 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r22, r24, r25, r26)     // Catch: java.lang.Throwable -> L7c9
            r1.b(r14)     // Catch: java.lang.Throwable -> L7c9
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L7c9
            goto L7d0
        L7c9:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L7d0:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L7db
            java.lang.String r1 = "屏蔽消息派发内部事件失败"
            r10.e(r1, r0)
        L7db:
            r2 = r38
            r3 = 0
            r2.setResult(r3)
            goto L7f7
        L7e2:
            r1 = r37
            r2 = r38
            r11 = r16
            r3 = r17
            r7 = r27
            r13 = r34
            r5 = 0
            r6 = 0
            r8 = 1
            goto L254
        L7f3:
            r1 = r37
            goto L254
        L7f7:
            return
    }
}
