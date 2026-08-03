package b9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f536b;

    public e(b5.c r2) {
            r1 = this;
            r0 = 27
            r1.f535a = r0
            r1.f536b = r2
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.<init>(r2)
            return
    }

    public /* synthetic */ e(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f535a = r2
            r0.f536b = r1
            r0.<init>()
            return
    }

    private final void a(de.robv.android.xposed.XC_MethodHook.MethodHookParam r33) {
            r32 = this;
            r33.getClass()
            r1 = r32
            java.lang.Object r0 = r1.f536b
            bb.g r0 = (bb.g) r0
            r0.getClass()
            r2 = r33
            java.lang.Object[] r2 = r2.args
            if (r2 == 0) goto L38f
            java.lang.Object r3 = tf.l.z0(r2)
            if (r3 == 0) goto L38f
            java.util.concurrent.ConcurrentHashMap r4 = r0.f658h
            java.lang.Class r5 = r3.getClass()
            java.lang.Object r5 = r4.get(r5)
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            r6 = 0
            if (r5 == 0) goto L34
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r5, r3)
            boolean r4 = r3 instanceof android.widget.TextView
            if (r4 == 0) goto L32
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L4d
        L32:
            r3 = r6
            goto L4d
        L34:
            java.lang.Class r5 = r3.getClass()
            java.lang.reflect.Field r5 = r0.h(r5)
            java.lang.Class r7 = r3.getClass()
            r4.put(r7, r5)
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r5, r3)
            boolean r4 = r3 instanceof android.widget.TextView
            if (r4 == 0) goto L32
            android.widget.TextView r3 = (android.widget.TextView) r3
        L4d:
            if (r3 == 0) goto L38f
            bb.l r4 = r0.f652b
            android.content.SharedPreferences r4 = r4.f694a
            java.lang.String r5 = "enable"
            r7 = 0
            boolean r4 = r4.getBoolean(r5, r7)
            ib.b r5 = r0.f653c
            android.content.SharedPreferences r5 = r5.f6650a
            java.lang.String r8 = "enable"
            boolean r5 = r5.getBoolean(r8, r7)
            if (r4 != 0) goto L74
            if (r5 != 0) goto L74
            java.util.Map r0 = r0.f657g
            r0.remove(r3)
            bb.g.j(r3)
            bb.g.i(r3)
            return
        L74:
            q8.m r8 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r8 == 0) goto L7f
            java.lang.String r8 = r8.a()
            goto L80
        L7f:
            r8 = r6
        L80:
            if (r8 != 0) goto L84
            java.lang.String r8 = ""
        L84:
            java.lang.String r9 = "@chatroom"
            boolean r9 = og.t.W(r8, r9, r7)
            if (r9 != 0) goto La1
            java.lang.String r9 = "@im.chatroom"
            boolean r9 = og.t.W(r8, r9, r7)
            if (r9 == 0) goto L95
            goto La1
        L95:
            java.util.Map r0 = r0.f657g
            r0.remove(r3)
            bb.g.j(r3)
            bb.g.i(r3)
            return
        La1:
            java.lang.String r9 = ""
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r11 = r2.length
            r13 = r6
            r12 = r7
        Lab:
            if (r12 >= r11) goto Le3
            r14 = r2[r12]
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto Ld3
            r15 = r9
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r15 = r15.length()
            if (r15 != 0) goto Lbd
            r9 = r14
        Lbd:
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            java.lang.CharSequence r15 = og.m.R0(r15)
            java.lang.String r15 = r15.toString()
            og.k r16 = bb.l.f693c
            boolean r16 = zb.c.b(r15)
            if (r16 == 0) goto Ld3
            r10.add(r15)
        Ld3:
            if (r14 == 0) goto Le0
            java.lang.Class r15 = r14.getClass()
            boolean r15 = r0.k(r15)
            if (r15 == 0) goto Le0
            r13 = r14
        Le0:
            int r12 = r12 + 1
            goto Lab
        Le3:
            r2 = 1
            if (r13 != 0) goto Le8
        Le6:
            r11 = r7
            goto L113
        Le8:
            java.lang.String r11 = "field_isSend"
            java.lang.String r12 = "isSend"
            java.lang.String[] r11 = new java.lang.String[]{r11, r12}
            r12 = r7
        Lf1:
            r14 = 2
            if (r12 < r14) goto Lf5
            goto Le6
        Lf5:
            r14 = r11[r12]
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.readField(r13, r14)
            boolean r15 = r14 instanceof java.lang.Number
            if (r15 == 0) goto L109
            java.lang.Number r14 = (java.lang.Number) r14
            int r11 = r14.intValue()
            if (r11 != r2) goto Le6
            r11 = r2
            goto L113
        L109:
            boolean r15 = r14 instanceof java.lang.Boolean
            if (r15 == 0) goto L38b
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r11 = r14.booleanValue()
        L113:
            if (r11 == 0) goto L121
            java.util.Map r0 = r0.f657g
            r0.remove(r3)
            bb.g.j(r3)
            bb.g.i(r3)
            return
        L121:
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            java.util.Iterator r9 = r10.iterator()
        L128:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L13c
            java.lang.Object r10 = r9.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = bb.g.l(r11)
            if (r11 != 0) goto L128
            goto L13d
        L13c:
            r10 = r6
        L13d:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L143
            goto L235
        L143:
            java.lang.String r9 = bb.g.e(r13)
            if (r9 == 0) goto L156
            boolean r10 = bb.g.l(r9)
            if (r10 != 0) goto L151
            r10 = r9
            goto L152
        L151:
            r10 = r6
        L152:
            if (r10 == 0) goto L156
            goto L235
        L156:
            java.util.Map r15 = r0.f656f
            java.lang.String r16 = ""
            if (r13 != 0) goto L16b
            og.k r9 = bb.l.f693c
            boolean r9 = zb.c.b(r14)
            if (r9 == 0) goto L165
            r6 = r14
        L165:
            if (r6 != 0) goto L168
            goto L1cb
        L168:
            r10 = r6
            goto L235
        L16b:
            java.lang.Object r9 = r15.get(r13)
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L176
            goto L235
        L176:
            java.lang.String r17 = "A0"
            java.lang.String r18 = "B0"
            java.lang.String r19 = "C0"
            java.lang.String r20 = "D0"
            java.lang.String r21 = "E0"
            java.lang.String r22 = "F0"
            java.lang.String r23 = "getSender"
            java.lang.String r24 = "getSendTalker"
            java.lang.String r25 = "getTalker"
            java.lang.String r26 = "j"
            java.lang.String r27 = "R1"
            java.lang.String r28 = "P1"
            java.lang.String r29 = "o0"
            java.lang.String r30 = "x0"
            java.lang.String r31 = "j0"
            java.lang.String[] r17 = new java.lang.String[]{r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31}
            r9 = r7
        L199:
            r10 = 15
            if (r9 < r10) goto L1fe
            java.lang.String r18 = "field_talker"
            java.lang.String r19 = "talker"
            java.lang.String r20 = "field_sender"
            java.lang.String r21 = "sender"
            java.lang.String r22 = "sendTalker"
            java.lang.String r23 = "field_talkerUsername"
            java.lang.String r24 = "P"
            java.lang.String[] r10 = new java.lang.String[]{r18, r19, r20, r21, r22, r23, r24}
            r9 = r7
        L1b0:
            r11 = 7
            if (r9 < r11) goto L1cf
            java.lang.String r10 = bb.g.e(r13)
            if (r10 == 0) goto L1c0
            java.util.Map r15 = (java.util.Map) r15
            r15.put(r13, r10)
            goto L235
        L1c0:
            og.k r9 = bb.l.f693c
            boolean r9 = zb.c.b(r14)
            if (r9 == 0) goto L1c9
            r6 = r14
        L1c9:
            if (r6 != 0) goto L168
        L1cb:
            r10 = r16
            goto L235
        L1cf:
            r11 = r10[r9]
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.readField(r13, r11)
            boolean r12 = r11 instanceof java.lang.String
            if (r12 == 0) goto L1dc
            java.lang.String r11 = (java.lang.String) r11
            goto L1dd
        L1dc:
            r11 = r6
        L1dd:
            og.k r12 = bb.l.f693c
            boolean r12 = zb.c.b(r11)
            if (r12 == 0) goto L1fb
            if (r11 == 0) goto L1ef
            java.lang.CharSequence r6 = og.m.R0(r11)
            java.lang.String r6 = r6.toString()
        L1ef:
            if (r6 != 0) goto L1f4
            r10 = r16
            goto L1f5
        L1f4:
            r10 = r6
        L1f5:
            java.util.Map r15 = (java.util.Map) r15
            r15.put(r13, r10)
            goto L235
        L1fb:
            int r9 = r9 + 1
            goto L1b0
        L1fe:
            r10 = r17[r9]
            java.lang.Class r11 = r13.getClass()
            java.lang.Class[] r12 = new java.lang.Class[r7]
            java.lang.reflect.Method r10 = h.Hchat.utils.KavaReflector.findMethod(r11, r10, r12)
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invoke(r10, r13, r11)
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L217
            java.lang.String r10 = (java.lang.String) r10
            goto L218
        L217:
            r10 = r6
        L218:
            og.k r11 = bb.l.f693c
            boolean r11 = zb.c.b(r10)
            if (r11 == 0) goto L387
            if (r10 == 0) goto L22a
            java.lang.CharSequence r6 = og.m.R0(r10)
            java.lang.String r6 = r6.toString()
        L22a:
            if (r6 != 0) goto L22f
            r10 = r16
            goto L230
        L22f:
            r10 = r6
        L230:
            java.util.Map r15 = (java.util.Map) r15
            r15.put(r13, r10)
        L235:
            og.k r6 = bb.l.f693c
            boolean r6 = zb.c.b(r10)
            if (r6 == 0) goto L37b
            boolean r6 = bb.g.l(r10)
            if (r6 == 0) goto L245
            goto L37b
        L245:
            java.util.Map r6 = r0.f657g
            r6.getClass()
            java.util.Map r6 = (java.util.Map) r6
            r6.put(r3, r10)
            if (r4 == 0) goto L36e
            bb.l r4 = r0.f652b
            java.lang.String r4 = r4.a(r10)
            int r6 = r4.length()
            if (r6 <= 0) goto L25f
            r6 = r2
            goto L260
        L25f:
            r6 = r7
        L260:
            if (r6 == 0) goto L28e
            boolean r2 = r0.c(r3, r10, r4)
            if (r2 != 0) goto L371
            java.util.Map r2 = r0.f657g
            r2.getClass()
            java.util.Map r2 = (java.util.Map) r2
            r2.put(r3, r10)
            o8.j r2 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r2 == 0) goto L371
            int r6 = java.lang.System.identityHashCode(r3)
            java.lang.String r7 = "real_tail_apply_"
            java.lang.String r6 = eh.a.l(r6, r7)
            b9.c r7 = new b9.c
            r7.<init>(r0, r3, r10, r4)
            r8 = 120(0x78, double:5.93E-322)
            r2.f(r6, r8, r7)
            goto L371
        L28e:
            bb.g.j(r3)
            bb.l r4 = r0.f652b
            android.content.SharedPreferences r4 = r4.f694a
            java.lang.String r6 = "visible_query"
            boolean r4 = r4.getBoolean(r6, r2)
            if (r4 == 0) goto L371
            bb.k r4 = r0.f654d
            r4.i()
            java.lang.CharSequence r6 = og.m.R0(r8)
            java.lang.String r6 = r6.toString()
            if (r6 != 0) goto L2ae
            java.lang.String r6 = ""
        L2ae:
            java.lang.CharSequence r8 = og.m.R0(r10)
            java.lang.String r8 = r8.toString()
            if (r8 != 0) goto L2ba
            java.lang.String r8 = ""
        L2ba:
            boolean r9 = bb.k.g(r6)
            if (r9 == 0) goto L371
            boolean r9 = fb.v0.A(r8)
            if (r9 != 0) goto L2c8
            goto L371
        L2c8:
            boolean r9 = bb.k.h(r8)
            if (r9 != 0) goto L371
            bb.l r9 = r4.f675a
            boolean r9 = r9.e(r8)
            if (r9 != 0) goto L371
            java.util.concurrent.ConcurrentHashMap$KeySetView r9 = r4.f682h
            boolean r9 = r9.contains(r8)
            if (r9 == 0) goto L2e0
            goto L371
        L2e0:
            java.lang.Object r9 = r4.f679e
            monitor-enter(r9)
            java.util.ArrayDeque r10 = r4.f680f     // Catch: java.lang.Throwable -> L36b
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L36b
            java.util.concurrent.ConcurrentHashMap r11 = r4.f686l     // Catch: java.lang.Throwable -> L36b
            int r11 = r11.size()     // Catch: java.lang.Throwable -> L36b
            int r10 = r10 + r11
            r11 = 80
            if (r10 < r11) goto L2f5
            r7 = r2
        L2f5:
            monitor-exit(r9)
            if (r7 != 0) goto L2fb
            r4.c(r6, r8)
        L2fb:
            boolean r7 = r4.e(r6, r8)
            if (r7 == 0) goto L303
            goto L371
        L303:
            java.lang.String r7 = bb.k.n(r6, r8)
            long r9 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r11 = r4.f685k
            java.lang.Object r11 = r11.get(r7)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L321
            long r11 = r11.longValue()
            long r11 = r9 - r11
            r13 = 5000(0x1388, double:2.4703E-320)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L371
        L321:
            java.util.concurrent.ConcurrentHashMap r11 = r4.f685k
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r11.put(r7, r9)
            r4.i()
            boolean r7 = bb.k.g(r6)
            if (r7 == 0) goto L371
            boolean r7 = fb.v0.A(r8)
            if (r7 != 0) goto L33a
            goto L371
        L33a:
            bb.l r7 = r4.f675a
            boolean r7 = r7.e(r8)
            if (r7 != 0) goto L371
            java.util.concurrent.ConcurrentHashMap$KeySetView r7 = r4.f682h
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L371
            boolean r7 = r4.e(r6, r8)
            if (r7 == 0) goto L351
            goto L371
        L351:
            b9.f r7 = r4.f676b
            boolean r7 = r7.c()
            if (r7 != 0) goto L35d
            r4.c(r6, r8)
            goto L371
        L35d:
            boolean r7 = r4.a()
            if (r7 != 0) goto L367
            r4.c(r6, r8)
            goto L371
        L367:
            r4.m(r6, r8, r2)
            goto L371
        L36b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L36e:
            bb.g.j(r3)
        L371:
            if (r5 == 0) goto L377
            r0.b(r3)
            return
        L377:
            bb.g.i(r3)
            return
        L37b:
            java.util.Map r0 = r0.f657g
            r0.remove(r3)
            bb.g.j(r3)
            bb.g.i(r3)
            return
        L387:
            int r9 = r9 + 1
            goto L199
        L38b:
            int r12 = r12 + 1
            goto Lf1
        L38f:
            return
    }

    private final void b(de.robv.android.xposed.XC_MethodHook.MethodHookParam r36) {
            r35 = this;
            r0 = r36
            r0.getClass()
            r1 = r35
            java.lang.Object r2 = r1.f536b
            da.h r2 = (da.h) r2
            android.content.SharedPreferences r3 = r2.f2157b
            java.lang.Object[] r4 = r0.args
            if (r4 == 0) goto L7ce
            int r5 = r4.length
            r6 = 2
            if (r5 >= r6) goto L17
            goto L7ce
        L17:
            r5 = 0
            r7 = r4[r5]
            if (r7 == 0) goto L7ce
            r8 = 1
            r4 = r4[r8]
            boolean r9 = r4 instanceof java.lang.Integer
            if (r9 == 0) goto L26
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L27
        L26:
            r4 = 0
        L27:
            if (r4 == 0) goto L7ce
            int r9 = r4.intValue()
            java.lang.String r11 = "itemView"
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.readField(r7, r11)
            boolean r12 = r11 instanceof android.view.View
            if (r12 == 0) goto L3a
            android.view.View r11 = (android.view.View) r11
            goto L3b
        L3a:
            r11 = 0
        L3b:
            if (r11 == 0) goto L3e
            goto L53
        L3e:
            java.lang.Class r11 = r7.getClass()
            java.lang.reflect.Field r11 = r2.k(r11)
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r11, r7)
            boolean r11 = r7 instanceof android.view.View
            if (r11 == 0) goto L52
            r11 = r7
            android.view.View r11 = (android.view.View) r11
            goto L53
        L52:
            r11 = 0
        L53:
            if (r11 == 0) goto L7ce
            da.h.d(r11)
            java.lang.String r7 = "message_text_color_enable"
            boolean r7 = r3.getBoolean(r7, r5)
            if (r7 != 0) goto L62
            goto L7ce
        L62:
            java.lang.Object r0 = r0.thisObject
            if (r0 == 0) goto L7ce
            java.util.concurrent.ConcurrentHashMap r7 = r2.f2159d
            if (r9 >= 0) goto L6f
            r16 = r6
            r0 = 0
            goto L1b3
        L6f:
            java.lang.Class r12 = r0.getClass()
            java.lang.Object r12 = r7.get(r12)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto L87
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r12, r0, r4)
            r16 = r6
            goto L1b3
        L87:
            java.lang.Class r12 = r0.getClass()
        L8b:
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            if (r12 == 0) goto L11a
            boolean r14 = r12.equals(r13)
            if (r14 != 0) goto L11a
            java.util.List r13 = h.Hchat.utils.KavaReflector.declaredMethods(r12)
            java.util.Iterator r13 = r13.iterator()
        L9d:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lf7
            java.lang.Object r14 = r13.next()
            r15 = r14
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            java.lang.Class[] r10 = r15.getParameterTypes()
            int r10 = r10.length
            if (r10 != r8) goto Lf2
            java.lang.Class[] r10 = r15.getParameterTypes()
            r10 = r10[r5]
            r16 = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r10 = gg.l.a(r10, r6)
            if (r10 != 0) goto Lcd
            java.lang.Class[] r10 = r15.getParameterTypes()
            r10 = r10[r5]
            boolean r6 = gg.l.a(r10, r6)
            if (r6 == 0) goto Lf4
        Lcd:
            java.lang.String r6 = r15.getName()
            java.lang.String r10 = "J0"
            boolean r6 = gg.l.a(r6, r10)
            if (r6 != 0) goto Lfa
            java.lang.String r6 = r15.getName()
            java.lang.String r10 = "getItem"
            boolean r6 = gg.l.a(r6, r10)
            if (r6 != 0) goto Lfa
            java.lang.String r6 = r15.getName()
            java.lang.String r10 = "get"
            boolean r6 = gg.l.a(r6, r10)
            if (r6 == 0) goto Lf4
            goto Lfa
        Lf2:
            r16 = r6
        Lf4:
            r6 = r16
            goto L9d
        Lf7:
            r16 = r6
            r14 = 0
        Lfa:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r14 == 0) goto L112
            java.lang.Class r6 = r0.getClass()
            r7.put(r6, r14)
            java.lang.Object[] r6 = new java.lang.Object[]{r4}
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invoke(r14, r0, r6)
            if (r6 == 0) goto L112
        L10f:
            r0 = r6
            goto L1b3
        L112:
            java.lang.Class r12 = r12.getSuperclass()
            r6 = r16
            goto L8b
        L11a:
            r16 = r6
            java.util.concurrent.ConcurrentHashMap r4 = r2.f2160e
            java.lang.Class r6 = r0.getClass()
            java.lang.Object r6 = r4.get(r6)
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            if (r6 == 0) goto L135
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r6, r0)
            java.lang.Object r6 = da.h.o(r9, r6)
            if (r6 == 0) goto L135
            goto L10f
        L135:
            java.lang.Class r6 = r0.getClass()
        L139:
            if (r6 == 0) goto L1a1
            boolean r7 = r6.equals(r13)
            if (r7 != 0) goto L1a1
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredFields(r6)
            java.util.Iterator r7 = r7.iterator()
        L149:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L187
            java.lang.Object r10 = r7.next()
            r12 = r10
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            java.lang.String r14 = r12.getName()
            java.lang.String r15 = "K"
            boolean r14 = gg.l.a(r14, r15)
            if (r14 != 0) goto L188
            java.lang.String r14 = r12.getName()
            java.lang.String r15 = "items"
            boolean r14 = gg.l.a(r14, r15)
            if (r14 != 0) goto L188
            java.lang.String r14 = r12.getName()
            java.lang.String r15 = "data"
            boolean r14 = gg.l.a(r14, r15)
            if (r14 != 0) goto L188
            java.lang.String r12 = r12.getName()
            java.lang.String r14 = "list"
            boolean r12 = gg.l.a(r12, r14)
            if (r12 == 0) goto L149
            goto L188
        L187:
            r10 = 0
        L188:
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            if (r10 == 0) goto L19c
            java.lang.Class r6 = r0.getClass()
            r4.put(r6, r10)
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r10, r0)
            java.lang.Object r0 = da.h.o(r9, r0)
            goto L1b3
        L19c:
            java.lang.Class r6 = r6.getSuperclass()
            goto L139
        L1a1:
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            r4.getClass()
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r0 = da.h.j(r0, r9, r4, r5)
        L1b3:
            if (r0 == 0) goto L7ce
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            r4.getClass()
            java.util.Set r4 = (java.util.Set) r4
            java.lang.Object r0 = da.h.z(r5, r0, r4)
            if (r0 == 0) goto L7ce
            long r18 = da.h.q(r0)
            q8.m r4 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r4 == 0) goto L1d8
            java.lang.String r4 = r4.a()
            goto L1d9
        L1d8:
            r4 = 0
        L1d9:
            java.lang.String r6 = ""
            if (r4 != 0) goto L1de
            r4 = r6
        L1de:
            java.lang.String r7 = "field_content"
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r0, r7)
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L1eb
            java.lang.String r7 = (java.lang.String) r7
            goto L1ec
        L1eb:
            r7 = 0
        L1ec:
            if (r7 == 0) goto L1fb
            boolean r9 = og.m.t0(r7)
            if (r9 != 0) goto L1f5
            goto L1f6
        L1f5:
            r7 = 0
        L1f6:
            if (r7 == 0) goto L1fb
        L1f8:
            r28 = r7
            goto L234
        L1fb:
            java.lang.String r7 = "content"
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r0, r7)
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L208
            java.lang.String r7 = (java.lang.String) r7
            goto L209
        L208:
            r7 = 0
        L209:
            if (r7 == 0) goto L216
            boolean r9 = og.m.t0(r7)
            if (r9 != 0) goto L212
            goto L213
        L212:
            r7 = 0
        L213:
            if (r7 == 0) goto L216
            goto L1f8
        L216:
            java.lang.Class r7 = r0.getClass()
            java.lang.String r9 = "getContent"
            java.lang.Class[] r10 = new java.lang.Class[r5]
            java.lang.reflect.Method r7 = h.Hchat.utils.KavaReflector.findMethod(r7, r9, r10)
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r7, r0, r9)
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L22f
            java.lang.String r7 = (java.lang.String) r7
            goto L230
        L22f:
            r7 = 0
        L230:
            if (r7 != 0) goto L1f8
            r28 = r6
        L234:
            java.lang.String r7 = "field_type"
            java.lang.String r9 = "type"
            java.lang.String r10 = "getType"
            java.lang.Object r7 = da.h.x(r0, r10, r7, r9)
            java.lang.Integer r7 = da.h.v(r7)
            if (r7 == 0) goto L255
            int r9 = r7.intValue()
            if (r9 <= 0) goto L24b
            goto L24c
        L24b:
            r7 = 0
        L24c:
            if (r7 == 0) goto L255
            int r7 = r7.intValue()
        L252:
            r22 = r7
            goto L25f
        L255:
            l8.d r7 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r7.getClass()
            int r7 = l8.d.f(r28)
            goto L252
        L25f:
            if (r22 > 0) goto L264
            r17 = 0
            goto L2ad
        L264:
            java.lang.String r7 = "field_talker"
            java.lang.String r9 = "talker"
            java.lang.String r10 = "getTalker"
            java.lang.Object r7 = da.h.x(r0, r10, r7, r9)
            boolean r9 = r7 instanceof java.lang.String
            if (r9 == 0) goto L275
            java.lang.String r7 = (java.lang.String) r7
            goto L276
        L275:
            r7 = 0
        L276:
            if (r7 == 0) goto L27b
            r27 = r7
            goto L27d
        L27b:
            r27 = r4
        L27d:
            java.lang.String r4 = "field_isSend"
            java.lang.String r7 = "isSend"
            java.lang.String r9 = "getIsSend"
            java.lang.Object r0 = da.h.x(r0, r9, r4, r7)
            java.lang.Integer r0 = da.h.v(r0)
            if (r0 == 0) goto L294
            int r0 = r0.intValue()
            r24 = r0
            goto L296
        L294:
            r24 = r5
        L296:
            h.Hchat.hooks.api.model.WeChatMessage r17 = new h.Hchat.hooks.api.model.WeChatMessage
            java.lang.String r33 = ""
            java.lang.String r34 = ""
            r20 = 0
            r23 = 0
            r25 = 0
            java.lang.String r29 = ""
            java.lang.String r30 = ""
            java.lang.String r31 = ""
            r32 = 0
            r17.<init>(r18, r20, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34)
        L2ad:
            if (r17 == 0) goto L7ce
            boolean r0 = r17.isVoip()
            tf.t r4 = tf.t.f13167g
            if (r0 == 0) goto L309
            sf.i r0 = r2.f2163h
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L2ca
            goto L2cb
        L2ca:
            r6 = 0
        L2cb:
            if (r6 == 0) goto L674
            int r0 = r6.intValue()
            android.view.View r0 = r11.findViewById(r0)
            if (r0 == 0) goto L674
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            da.h.h(r0, r4)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L2ed:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L306
            java.lang.Object r7 = r4.next()
            r9 = r7
            da.f r9 = (da.f) r9
            android.widget.TextView r9 = r9.f2151b
            boolean r9 = r0.add(r9)
            if (r9 == 0) goto L2ed
            r6.add(r7)
            goto L2ed
        L306:
            r4 = r6
            goto L674
        L309:
            boolean r0 = r17.isApp()
            if (r0 == 0) goto L37e
            int r0 = r17.appMsgType()
            r7 = 19
            if (r0 != r7) goto L37e
            sf.i r0 = r2.f2164i
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L328:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L357
            java.lang.Object r6 = r0.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            android.view.View r6 = r11.findViewById(r6)
            if (r6 == 0) goto L344
            int r7 = r6.getVisibility()
            if (r7 == 0) goto L346
        L344:
            r9 = 0
            goto L351
        L346:
            android.widget.TextView r7 = da.h.A(r6)
            if (r7 == 0) goto L344
            da.f r9 = new da.f
            r9.<init>(r6, r7)
        L351:
            if (r9 == 0) goto L328
            r4.add(r9)
            goto L328
        L357:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L365:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L306
            java.lang.Object r7 = r4.next()
            r9 = r7
            da.f r9 = (da.f) r9
            android.view.View r9 = r9.f2150a
            boolean r9 = r0.add(r9)
            if (r9 == 0) goto L365
            r6.add(r7)
            goto L365
        L37e:
            boolean r0 = r17.isText()
            if (r0 != 0) goto L392
            boolean r0 = r17.isQuote()
            if (r0 != 0) goto L392
            boolean r0 = r17.isVoice()
            if (r0 != 0) goto L392
        L390:
            r9 = 0
            goto L3bd
        L392:
            sf.i r0 = r2.f2162g
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L3a5
            goto L3a6
        L3a5:
            r7 = 0
        L3a6:
            if (r7 == 0) goto L390
            int r0 = r7.intValue()
            android.view.View r0 = r11.findViewById(r0)
            if (r0 == 0) goto L390
            android.widget.TextView r7 = da.h.A(r0)
            if (r7 == 0) goto L390
            da.f r9 = new da.f
            r9.<init>(r0, r7)
        L3bd:
            if (r9 == 0) goto L3c1
            goto L668
        L3c1:
            boolean r0 = r17.isText()
            if (r0 != 0) goto L3ca
        L3c7:
            r9 = 0
            goto L456
        L3ca:
            java.lang.String r0 = r17.bodyContent()
            boolean r7 = og.m.t0(r0)
            if (r7 != 0) goto L3d5
            goto L3d6
        L3d5:
            r0 = 0
        L3d6:
            if (r0 == 0) goto L3c7
            java.lang.String r0 = da.h.n(r0)
            int r7 = r0.length()
            r9 = 6
            if (r7 != 0) goto L3e5
            r0 = r4
            goto L428
        L3e5:
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r7.add(r0)
            java.lang.String r10 = ":\n"
            int r10 = og.m.r0(r0, r10, r5, r5, r9)
            if (r10 <= 0) goto L408
            int r10 = r10 + 2
            int r12 = r0.length()
            if (r10 >= r12) goto L408
            java.lang.String r0 = r0.substring(r10)
            java.lang.String r0 = da.h.n(r0)
            r7.add(r0)
        L408:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L411:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L428
            java.lang.Object r10 = r7.next()
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = og.m.t0(r12)
            if (r12 != 0) goto L411
            r0.add(r10)
            goto L411
        L428:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L42f
            goto L3c7
        L42f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            da.h.f(r11, r0, r8, r7)
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L440
            da.h.f(r11, r0, r5, r7)
        L440:
            c9.a0 r0 = new c9.a0
            r10 = 5
            r0.<init>(r2, r10)
            c9.a0 r10 = new c9.a0
            r10.<init>(r0, r9)
            java.util.List r0 = tf.m.K1(r7, r10)
            java.lang.Object r0 = tf.m.v1(r0)
            da.f r0 = (da.f) r0
            r9 = r0
        L456:
            if (r9 == 0) goto L45a
            goto L668
        L45a:
            boolean r0 = r17.isText()
            r7 = 7
            if (r0 != 0) goto L46a
            boolean r0 = r17.isQuote()
            if (r0 != 0) goto L46a
            r5 = r4
            goto L5fd
        L46a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r9 = r17.isText()
            if (r9 == 0) goto L47c
            java.lang.String r9 = r17.bodyContent()
            da.h.c(r9, r0)
        L47c:
            boolean r9 = r17.isQuote()
            if (r9 == 0) goto L4a1
            java.lang.String r9 = r17.bodyContent()
            h.Hchat.hooks.api.model.WeChatQuoteMsg r10 = r17.getQuoteMsg()
            if (r10 == 0) goto L48f
            java.lang.String r10 = r10.title
            goto L490
        L48f:
            r10 = 0
        L490:
            da.h.c(r10, r0)
            l8.d r10 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r10.getClass()
            java.lang.String r10 = "title"
            java.lang.String r9 = l8.d.o(r9, r10)
            da.h.c(r9, r0)
        L4a1:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L4ad:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L5ac
            java.lang.Object r10 = r0.next()
            r10.getClass()
            sf.e r10 = (sf.e) r10
            java.lang.Object r12 = r10.f12418g
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            java.lang.Object r10 = r10.f12419h
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L57f
            boolean r13 = og.m.t0(r10)
            if (r13 == 0) goto L4d2
            goto L57f
        L4d2:
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r13.<init>()
            r14 = r5
            r15 = r16
        L4da:
            if (r14 >= r15) goto L51c
            java.lang.String r15 = "&lt;"
            java.lang.String r8 = "<"
            java.lang.String r8 = og.t.a0(r10, r15, r8, r5)
            java.lang.String r10 = "&gt;"
            java.lang.String r15 = ">"
            java.lang.String r8 = og.t.a0(r8, r10, r15, r5)
            java.lang.String r10 = "&quot;"
            java.lang.String r15 = "\""
            java.lang.String r8 = og.t.a0(r8, r10, r15, r5)
            java.lang.String r10 = "&apos;"
            java.lang.String r15 = "'"
            java.lang.String r8 = og.t.a0(r8, r10, r15, r5)
            java.lang.String r10 = "&amp;"
            java.lang.String r15 = "&"
            java.lang.String r8 = og.t.a0(r8, r10, r15, r5)
            og.k r10 = new og.k
            java.lang.String r15 = "&#(x[0-9a-fA-F]+|[0-9]+);"
            r10.<init>(r15)
            b4.b r15 = new b4.b
            r5 = 23
            r15.<init>(r5)
            java.lang.String r10 = r10.e(r8, r15)
            int r14 = r14 + 1
            r5 = 0
            r8 = 1
            r15 = 2
            goto L4da
        L51c:
            java.lang.String r5 = da.h.s(r10)
            int r8 = r5.length()
            if (r8 != 0) goto L527
            goto L55f
        L527:
            da.h.b(r5, r13)
            java.lang.String r8 = "<[^>]+>"
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r8)
            r8.getClass()
            java.util.regex.Matcher r8 = r8.matcher(r5)
            java.lang.String r8 = r8.replaceAll(r6)
            r8.getClass()
            java.lang.String r10 = "\\{\\{[^}]+}}"
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)
            r10.getClass()
            java.util.regex.Matcher r8 = r10.matcher(r8)
            java.lang.String r8 = r8.replaceAll(r6)
            r8.getClass()
            java.lang.String r8 = da.h.s(r8)
            boolean r5 = gg.l.a(r8, r5)
            if (r5 != 0) goto L55f
            da.h.b(r8, r13)
        L55f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r8 = r13.iterator()
        L568:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L580
            java.lang.Object r10 = r8.next()
            r13 = r10
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = og.m.t0(r13)
            if (r13 != 0) goto L568
            r5.add(r10)
            goto L568
        L57f:
            r5 = r4
        L580:
            java.util.Iterator r5 = r5.iterator()
        L584:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L5a6
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r10 = r9.get(r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L59e
            int r10 = r10.intValue()
            if (r12 >= r10) goto L584
        L59e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r9.put(r8, r10)
            goto L584
        L5a6:
            r5 = 0
            r8 = 1
            r16 = 2
            goto L4ad
        L5ac:
            java.util.Set r0 = r9.entrySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            a9.h r5 = new a9.h
            r6 = 8
            r5.<init>(r6)
            c9.a0 r6 = new c9.a0
            r6.<init>(r5, r7)
            java.util.List r0 = tf.m.K1(r0, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = tf.n.e1(r0)
            r5.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L5d2:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L5fd
            java.lang.Object r6 = r0.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            da.d r8 = new da.d
            java.lang.Object r9 = r6.getKey()
            r9.getClass()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r6 = r6.getValue()
            r6.getClass()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r8.<init>(r9, r6)
            r5.add(r8)
            goto L5d2
        L5fd:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L605
        L603:
            r9 = 0
            goto L63f
        L605:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6 = 1
            da.h.e(r11, r5, r6, r0)
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L619
            r6 = 0
            da.h.e(r11, r5, r6, r0)
            goto L61a
        L619:
            r6 = 0
        L61a:
            a9.h r5 = new a9.h
            r5.<init>(r7)
            c9.a0 r7 = new c9.a0
            r8 = 3
            r7.<init>(r5, r8)
            da.g r5 = new da.g
            r5.<init>(r7, r2, r6)
            c9.a0 r6 = new c9.a0
            r7 = 4
            r6.<init>(r5, r7)
            java.util.List r0 = tf.m.K1(r0, r6)
            java.lang.Object r0 = tf.m.v1(r0)
            da.e r0 = (da.e) r0
            if (r0 == 0) goto L603
            da.f r0 = r0.f2147a
            r9 = r0
        L63f:
            if (r9 == 0) goto L642
            goto L668
        L642:
            boolean r0 = r17.isText()
            if (r0 != 0) goto L64a
            r9 = 0
            goto L668
        L64a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            da.h.g(r11, r0)
            da.g r5 = new da.g
            r5.<init>(r2, r11)
            da.g r6 = new da.g
            r15 = 2
            r6.<init>(r5, r2, r15)
            java.util.List r0 = tf.m.K1(r0, r6)
            java.lang.Object r0 = tf.m.v1(r0)
            da.f r0 = (da.f) r0
            r9 = r0
        L668:
            if (r9 == 0) goto L66f
            java.util.List r0 = a.a.x0(r9)
            goto L670
        L66f:
            r0 = 0
        L670:
            if (r0 != 0) goto L673
            goto L674
        L673:
            r4 = r0
        L674:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L67c
            goto L7ce
        L67c:
            boolean r0 = r17.isOutgoing()
            android.content.Context r5 = r11.getContext()
            r5.getClass()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.uiMode
            r5 = r5 & 48
            r6 = 32
            if (r5 != r6) goto L699
            r6 = 1
            goto L69a
        L699:
            r6 = 0
        L69a:
            if (r0 == 0) goto L6a1
            if (r6 == 0) goto L6a1
            java.lang.String r5 = "message_text_color_right_dark"
            goto L6ad
        L6a1:
            if (r0 == 0) goto L6a6
            java.lang.String r5 = "message_text_color_right_light"
            goto L6ad
        L6a6:
            if (r6 == 0) goto L6ab
            java.lang.String r5 = "message_text_color_left_dark"
            goto L6ad
        L6ab:
            java.lang.String r5 = "message_text_color_left_light"
        L6ad:
            java.lang.String r7 = "#FF000000"
            if (r0 == 0) goto L6b4
            if (r6 == 0) goto L6b4
            goto L6bb
        L6b4:
            if (r0 == 0) goto L6b7
            goto L6bb
        L6b7:
            if (r6 == 0) goto L6bb
            java.lang.String r7 = "#FFFFFFFF"
        L6bb:
            java.lang.String r0 = r3.getString(r5, r7)
            if (r0 == 0) goto L6c2
            goto L6c3
        L6c2:
            r0 = r7
        L6c3:
            da.c r0 = da.h.u(r0)
            if (r0 == 0) goto L6ca
            goto L6ce
        L6ca:
            da.c r0 = da.h.u(r7)
        L6ce:
            if (r0 == 0) goto L7ce
            java.lang.String r3 = r17.bodyContent()
            boolean r5 = r17.isQuote()
            if (r5 != 0) goto L6f4
            boolean r5 = r17.isText()
            if (r5 == 0) goto L6f2
            r5 = 35
            boolean r5 = og.m.i0(r3, r5)
            if (r5 != 0) goto L6f4
            r5 = 65283(0xff03, float:9.1481E-41)
            boolean r3 = og.m.i0(r3, r5)
            if (r3 == 0) goto L6f2
            goto L6f4
        L6f2:
            r6 = 0
            goto L6f5
        L6f4:
            r6 = 1
        L6f5:
            java.util.Iterator r3 = r4.iterator()
        L6f9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7ce
            java.lang.Object r4 = r3.next()
            da.f r4 = (da.f) r4
            if (r6 != 0) goto L74a
            android.view.View r5 = r4.f2150a
            android.widget.TextView r7 = r4.f2151b
            java.lang.CharSequence r5 = da.h.y(r5, r7)
            boolean r7 = r5 instanceof android.text.Spanned
            if (r7 == 0) goto L716
            android.text.Spanned r5 = (android.text.Spanned) r5
            goto L717
        L716:
            r5 = 0
        L717:
            if (r5 == 0) goto L741
            int r7 = r5.length()
            if (r7 != 0) goto L724
            r5 = 1
            r9 = 0
            r19 = 0
            goto L745
        L724:
            int r7 = r5.length()
            java.lang.Class<android.text.style.ClickableSpan> r8 = android.text.style.ClickableSpan.class
            r9 = 0
            java.lang.Object[] r5 = r5.getSpans(r9, r7, r8)
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L739
            r18 = 1
        L737:
            r5 = 1
            goto L73c
        L739:
            r18 = r9
            goto L737
        L73c:
            r7 = r18 ^ 1
            r19 = r7
            goto L745
        L741:
            r5 = 1
            r9 = 0
            r19 = r9
        L745:
            if (r19 == 0) goto L748
            goto L74c
        L748:
            r7 = r9
            goto L74d
        L74a:
            r5 = 1
            r9 = 0
        L74c:
            r7 = r5
        L74d:
            android.view.View r8 = r4.f2150a
            android.widget.TextView r4 = r4.f2151b
            da.h.d(r8)
            da.b r10 = new da.b
            android.content.res.ColorStateList r11 = r4.getTextColors()
            r11.getClass()
            android.content.res.ColorStateList r12 = r4.getLinkTextColors()
            r12.getClass()
            android.text.TextPaint r13 = r4.getPaint()
            int r13 = r13.linkColor
            android.text.TextPaint r14 = r4.getPaint()
            android.graphics.Shader r14 = r14.getShader()
            int r15 = r0.f2142a
            r10.<init>(r11, r12, r13, r14, r15)
            r11 = 2131099711(0x7f06003f, float:1.7811783E38)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r8.setTag(r11, r12)
            r11 = 2131099712(0x7f060040, float:1.7811785E38)
            r8.setTag(r11, r10)
            int r11 = r0.f2142a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r13 = 2131099713(0x7f060041, float:1.7811787E38)
            r8.setTag(r13, r12)
            boolean r12 = da.h.m(r8)
            if (r12 == 0) goto L7a4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r13 = "setTextColor"
            h.Hchat.utils.KavaReflector.invokeMethod(r8, r13, r12)
        L7a4:
            r4.setTextColor(r11)
            r4.invalidate()
            r8.invalidate()
            r4.setLinkTextColor(r11)
            boolean r12 = da.h.m(r8)
            if (r12 == 0) goto L7c3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r12 = "setLinkTextColor"
            h.Hchat.utils.KavaReflector.invokeMethod(r8, r12, r11)
        L7c3:
            boolean r11 = r0.f2144c
            if (r11 != 0) goto L7c9
            if (r7 == 0) goto L6f9
        L7c9:
            r2.B(r8, r4, r0, r10)
            goto L6f9
        L7ce:
            return
    }

    private final void c(de.robv.android.xposed.XC_MethodHook.MethodHookParam r9) {
            r8 = this;
            r9.getClass()
            java.lang.Object r0 = r9.getResult()
            boolean r1 = r0 instanceof android.app.Notification
            r2 = 0
            if (r1 == 0) goto Lf
            android.app.Notification r0 = (android.app.Notification) r0
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto Le8
            java.util.concurrent.atomic.AtomicBoolean r1 = e9.q.f2460a
            java.lang.Object r1 = r8.f536b
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Object[] r9 = r9.args
            if (r9 == 0) goto L1d
            goto L20
        L1d:
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]
        L20:
            java.lang.Class[] r1 = r1.getParameterTypes()
            r1.getClass()
            boolean r3 = e9.q.l(r1)
            if (r3 == 0) goto L76
            e9.k r1 = new e9.k
            r3 = 4
            java.lang.Object r3 = tf.l.C0(r3, r9)
            if (r3 == 0) goto L3b
            java.lang.String r3 = r3.toString()
            goto L3c
        L3b:
            r3 = r2
        L3c:
            java.lang.String r4 = ""
            if (r3 != 0) goto L41
            r3 = r4
        L41:
            r5 = 5
            java.lang.Object r5 = tf.l.C0(r5, r9)
            if (r5 == 0) goto L4d
            java.lang.String r5 = r5.toString()
            goto L4e
        L4d:
            r5 = r2
        L4e:
            if (r5 != 0) goto L51
            r5 = r4
        L51:
            r6 = 6
            java.lang.Object r6 = tf.l.C0(r6, r9)
            if (r6 == 0) goto L5d
            java.lang.String r6 = r6.toString()
            goto L5e
        L5d:
            r6 = r2
        L5e:
            if (r6 != 0) goto L61
            r6 = r4
        L61:
            r7 = 14
            java.lang.Object r9 = tf.l.C0(r7, r9)
            if (r9 == 0) goto L6d
            java.lang.String r2 = r9.toString()
        L6d:
            if (r2 != 0) goto L70
            goto L71
        L70:
            r4 = r2
        L71:
            r1.<init>(r3, r5, r6, r4)
            r2 = r1
            goto L9f
        L76:
            boolean r1 = e9.q.o(r1)
            if (r1 == 0) goto L9f
            java.lang.Object r9 = tf.l.z0(r9)
            if (r9 == 0) goto L9f
            e9.k r2 = new e9.k
            java.lang.String r1 = "e"
            java.lang.String r1 = e9.q.x(r9, r1)
            java.lang.String r3 = "f"
            java.lang.String r3 = e9.q.x(r9, r3)
            java.lang.String r4 = "g"
            java.lang.String r4 = e9.q.x(r9, r4)
            java.lang.String r5 = "o"
            java.lang.String r9 = e9.q.x(r9, r5)
            r2.<init>(r1, r3, r4, r9)
        L9f:
            if (r2 == 0) goto Le8
            java.lang.String r9 = r2.f2432a
            android.os.Bundle r1 = r0.extras
            if (r1 != 0) goto Lae
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.extras = r1
        Lae:
            java.lang.String r1 = r2.f2435d
            java.lang.String r3 = r2.f2434c
            java.lang.String r2 = r2.f2433b
            boolean r4 = og.m.t0(r9)
            if (r4 != 0) goto Lc1
            android.os.Bundle r4 = r0.extras
            java.lang.String r5 = "hchat_custom_notification_native_title"
            r4.putString(r5, r9)
        Lc1:
            boolean r9 = og.m.t0(r2)
            if (r9 != 0) goto Lce
            android.os.Bundle r9 = r0.extras
            java.lang.String r4 = "hchat_custom_notification_native_text"
            r9.putString(r4, r2)
        Lce:
            boolean r9 = og.m.t0(r3)
            if (r9 != 0) goto Ldb
            android.os.Bundle r9 = r0.extras
            java.lang.String r2 = "hchat_custom_notification_native_summary"
            r9.putString(r2, r3)
        Ldb:
            boolean r9 = og.m.t0(r1)
            if (r9 != 0) goto Le8
            android.os.Bundle r9 = r0.extras
            java.lang.String r0 = "hchat_custom_notification_talker"
            r9.putString(r0, r1)
        Le8:
            return
    }

    private final void d(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            r6 = this;
            r7.getClass()
            java.lang.Object r0 = r6.f536b
            hb.k r0 = (hb.k) r0
            java.lang.Object r1 = r7.thisObject
            java.lang.Object[] r7 = r7.args
            r0.getClass()
            if (r1 != 0) goto L11
            return
        L11:
            r2 = 0
            if (r7 == 0) goto L1a
            r3 = 1
            java.lang.Object r3 = tf.l.C0(r3, r7)
            goto L1b
        L1a:
            r3 = r2
        L1b:
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L22
            java.lang.Number r3 = (java.lang.Number) r3
            goto L23
        L22:
            r3 = r2
        L23:
            r4 = -1
            if (r3 == 0) goto L2b
            int r3 = r3.intValue()
            goto L2c
        L2b:
            r3 = r4
        L2c:
            if (r7 == 0) goto L34
            r5 = 2
            java.lang.Object r7 = tf.l.C0(r5, r7)
            goto L35
        L34:
            r7 = r2
        L35:
            boolean r5 = r7 instanceof java.lang.Number
            if (r5 == 0) goto L3c
            r2 = r7
            java.lang.Number r2 = (java.lang.Number) r2
        L3c:
            if (r2 == 0) goto L42
            int r4 = r2.intValue()
        L42:
            android.os.Handler r7 = r0.f5420c
            hb.d r2 = new hb.d
            r2.<init>(r1, r0, r3, r4)
            r7.post(r2)
            return
    }

    private final void e(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f536b
            hb.c r0 = (hb.c) r0
            java.lang.Object r0 = r0.f5340i
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r1 = "multi_recall_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L15
            goto L72
        L15:
            java.lang.Object r0 = r6.thisObject
            java.util.List r0 = k8.b.b(r0)
            java.util.List r0 = hb.c.t(r0)
            if (r0 != 0) goto L22
            goto L72
        L22:
            java.lang.Object[] r6 = r6.args
            if (r6 == 0) goto L72
            java.lang.Object r6 = tf.l.C0(r2, r6)
            if (r6 == 0) goto L72
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 1212371523(0x48435243, float:200009.05)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r3 = "findItem"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r3, r2)
            if (r2 == 0) goto L44
            goto L72
        L44:
            java.lang.String r2 = "批量撤回[H]"
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r1, r0, r2}
            java.lang.String r4 = "add"
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r4, r3)
            if (r3 == 0) goto L53
            goto L5b
        L53:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r0, r2}
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r4, r0)
        L5b:
            if (r3 == 0) goto L5e
            goto L72
        L5e:
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2}
            java.lang.String r3 = "f"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r3, r0)
            if (r0 == 0) goto L6b
            goto L72
        L6b:
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2}
            h.Hchat.utils.KavaReflector.invokeMethod(r6, r3, r0)
        L72:
            return
    }

    private final void f(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            r6 = this;
            r7.getClass()
            java.lang.Object r0 = r6.f536b
            n8.c r0 = (n8.c) r0
            java.util.Map r0 = r0.f9067d
            java.lang.Object r1 = r7.thisObject
            java.lang.Object r0 = r0.remove(r1)
            fg.l r0 = (fg.l) r0
            if (r0 == 0) goto L5e
            n8.b r1 = new n8.b
            java.lang.Object[] r2 = r7.args
            r2.getClass()
            r3 = 0
            java.lang.Object r2 = tf.l.C0(r3, r2)
            boolean r3 = r2 instanceof java.lang.Number
            r4 = 0
            if (r3 == 0) goto L27
            java.lang.Number r2 = (java.lang.Number) r2
            goto L28
        L27:
            r2 = r4
        L28:
            if (r2 == 0) goto L2f
            int r2 = r2.intValue()
            goto L30
        L2f:
            r2 = -1
        L30:
            java.lang.Object[] r3 = r7.args
            r3.getClass()
            r5 = 1
            java.lang.Object r3 = tf.l.C0(r5, r3)
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L41
            java.lang.String r3 = (java.lang.String) r3
            goto L42
        L41:
            r3 = r4
        L42:
            if (r3 == 0) goto L45
            goto L47
        L45:
            java.lang.String r3 = ""
        L47:
            java.lang.Object[] r7 = r7.args
            r7.getClass()
            r5 = 2
            java.lang.Object r7 = tf.l.C0(r5, r7)
            boolean r5 = r7 instanceof org.json.JSONObject
            if (r5 == 0) goto L58
            r4 = r7
            org.json.JSONObject r4 = (org.json.JSONObject) r4
        L58:
            r1.<init>(r2, r3, r4)
            r0.invoke(r1)
        L5e:
            return
    }

    private final void g(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            r8.getClass()
            java.lang.Object r0 = r7.f536b
            p8.e0 r0 = (p8.e0) r0
            java.lang.ThreadLocal r1 = r0.f10350g
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L17
            goto L96
        L17:
            java.lang.Object r1 = r8.getResult()
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L23
            goto L96
        L23:
            java.lang.Object[] r8 = r8.args
            if (r8 == 0) goto L96
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L2a:
            r4 = 0
            if (r3 >= r1) goto L46
            r5 = r8[r3]
            if (r5 == 0) goto L39
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
        L39:
            java.lang.String r6 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L43
            r4 = r5
            goto L46
        L43:
            int r3 = r3 + 1
            goto L2a
        L46:
            if (r4 == 0) goto L96
            java.lang.String r8 = "isAd"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r8, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r8 = gg.l.a(r8, r1)
            if (r8 == 0) goto L59
            goto L96
        L59:
            java.util.concurrent.CopyOnWriteArrayList r8 = r0.f10349f
            java.util.Iterator r8 = r8.iterator()
        L5f:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r8.next()
            ha.c r1 = (ha.c) r1
            r1.b(r4)     // Catch: java.lang.Throwable -> L71
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> L71
            goto L78
        L71:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L78:
            java.lang.Throwable r1 = sf.g.b(r1)
            if (r1 == 0) goto L5f
            p8.p r2 = r0.f10347d
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "朋友圈入库观察回调失败: "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.invoke(r1)
            goto L5f
        L96:
            return
    }

    private final void h(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = r4.f536b
            r9.d0 r0 = (r9.d0) r0
            java.lang.ThreadLocal r0 = r0.A
            java.lang.Object r0 = r0.get()
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r0.pollLast()
            r9.x r1 = (r9.x) r1
            if (r1 == 0) goto L1a
            goto L20
        L1a:
            r9.x r1 = new r9.x
            r2 = 0
            r1.<init>(r2)
        L20:
            if (r0 == 0) goto L32
            boolean r0 = r0.isEmpty()
            r2 = 1
            if (r0 != r2) goto L32
            java.lang.Object r0 = r4.f536b
            r9.d0 r0 = (r9.d0) r0
            java.lang.ThreadLocal r0 = r0.A
            r0.remove()
        L32:
            java.lang.Object r0 = r4.f536b
            r9.d0 r0 = (r9.d0) r0
            r9.z r0 = r0.B
            boolean r0 = r0.f11815a
            if (r0 != 0) goto L3d
            goto L69
        L3d:
            java.lang.Object r0 = r4.f536b
            r9.d0 r0 = (r9.d0) r0
            java.lang.Object r2 = r5.thisObject     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r5 = r5.args     // Catch: java.lang.Throwable -> L51
            java.lang.Object r1 = r1.f11809a     // Catch: java.lang.Throwable -> L51
            r3 = 0
            boolean r5 = r0.g(r3, r2, r1, r5)     // Catch: java.lang.Throwable -> L51
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L51
            goto L58
        L51:
            r5 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r5)
            r5 = r0
        L58:
            java.lang.Object r0 = r4.f536b
            r9.d0 r0 = (r9.d0) r0
            java.lang.Throwable r5 = sf.g.b(r5)
            if (r5 == 0) goto L69
            ia.t r0 = r0.f11654b
            java.lang.String r1 = "消息显示时间绑定失败"
            r0.invoke(r1, r5)
        L69:
            return
    }

    private final void i(de.robv.android.xposed.XC_MethodHook.MethodHookParam r12) {
            r11 = this;
            r12.getClass()
            java.lang.Object r0 = r11.f536b
            s9.b r0 = (s9.b) r0
            java.lang.Object[] r12 = r12.args
            r0.getClass()
            if (r12 == 0) goto L1a8
            int r1 = r12.length
            r2 = 4
            if (r1 == r2) goto L14
            goto L1a8
        L14:
            int r1 = r12.length
            r2 = 0
            r3 = r2
        L17:
            r4 = 0
            if (r3 >= r1) goto L2a
            r5 = r12[r3]
            if (r5 == 0) goto L27
            java.lang.String r6 = "com.tencent.mm.storage."
            boolean r6 = eh.a.z(r6, r5, r2)
            if (r6 == 0) goto L27
            goto L2b
        L27:
            int r3 = r3 + 1
            goto L17
        L2a:
            r5 = r4
        L2b:
            if (r5 == 0) goto L1a8
            r1 = 2
            r3 = r12[r1]
            boolean r6 = r3 instanceof java.lang.String
            if (r6 == 0) goto L37
            java.lang.String r3 = (java.lang.String) r3
            goto L38
        L37:
            r3 = r4
        L38:
            java.lang.String r6 = "isSend"
            g8.a r7 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r7 == 0) goto L45
            java.lang.String r7 = r7.c()
            goto L46
        L45:
            r7 = r4
        L46:
            if (r7 != 0) goto L4a
            java.lang.String r7 = ""
        L4a:
            boolean r8 = og.m.t0(r7)
            if (r8 != 0) goto L62
            if (r3 == 0) goto L62
            boolean r8 = og.m.t0(r3)
            if (r8 == 0) goto L59
            goto L62
        L59:
            boolean r1 = r7.equals(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto La0
        L62:
            java.lang.String r3 = "getIsSend"
            java.lang.String[] r3 = new java.lang.String[]{r3, r6}
            r7 = r2
        L69:
            if (r7 < r1) goto L87
            java.lang.String r3 = "field_isSend"
            java.lang.String[] r8 = new java.lang.String[]{r3, r6}
            r3 = r2
        L72:
            if (r3 < r1) goto L76
            r1 = r4
            goto La0
        L76:
            r6 = r8[r3]
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r5, r6)
            java.lang.Boolean r6 = s9.b.d(r6)
            if (r6 == 0) goto L84
            r1 = r6
            goto La0
        L84:
            int r3 = r3 + 1
            goto L72
        L87:
            r8 = r3[r7]
            java.lang.Class r9 = r5.getClass()
            java.lang.Class[] r10 = new java.lang.Class[r2]
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findMethod(r9, r8, r10)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.invoke(r8, r5, r9)
            java.lang.Boolean r8 = s9.b.d(r8)
            if (r8 == 0) goto L1a4
            r1 = r8
        La0:
            if (r1 == 0) goto L1a8
            boolean r1 = r1.booleanValue()
            android.content.SharedPreferences r3 = r0.f12396b
            if (r1 == 0) goto Lb1
            java.lang.String r1 = "hide_chat_avatar_self"
            boolean r1 = r3.getBoolean(r1, r2)
            goto Lb7
        Lb1:
            java.lang.String r1 = "hide_chat_avatar_other"
            boolean r1 = r3.getBoolean(r1, r2)
        Lb7:
            int r3 = r12.length
            r5 = r2
        Lb9:
            if (r5 >= r3) goto Lcd
            r6 = r12[r5]
            if (r6 == 0) goto Lca
            java.lang.Class r7 = r6.getClass()
            s9.a r7 = r0.a(r7)
            if (r7 == 0) goto Lca
            goto Lce
        Lca:
            int r5 = r5 + 1
            goto Lb9
        Lcd:
            r6 = r4
        Lce:
            if (r6 == 0) goto L1a8
            java.lang.Class r12 = r6.getClass()
            s9.a r12 = r0.a(r12)
            if (r12 == 0) goto L1a8
            java.lang.reflect.Field r3 = r12.f12393a
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r6)
            boolean r5 = r3 instanceof android.view.View
            if (r5 == 0) goto Le7
            android.view.View r3 = (android.view.View) r3
            goto Le8
        Le7:
            r3 = r4
        Le8:
            if (r3 == 0) goto L1a8
            java.lang.reflect.Field r12 = r12.f12394b
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.readField(r12, r6)
            boolean r5 = r12 instanceof android.view.View
            if (r5 == 0) goto Lf7
            android.view.View r12 = (android.view.View) r12
            goto Lf8
        Lf7:
            r12 = r4
        Lf8:
            android.view.ViewParent r5 = r3.getParent()
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L103
            android.view.View r5 = (android.view.View) r5
            goto L104
        L103:
            r5 = r4
        L104:
            android.view.View[] r12 = new android.view.View[]{r12, r5}
            ng.j r12 = tf.l.k0(r12)
            i2.z r5 = new i2.z
            r6 = 29
            r5.<init>(r6)
            ng.i r6 = new ng.i
            r6.<init>(r12, r2, r5)
            ng.h r12 = new ng.h
            r12.<init>(r6)
        L11d:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L13b
            java.lang.Object r5 = r12.next()
            r6 = r5
            android.view.View r6 = (android.view.View) r6
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "com.tencent.mm.ui.base.MaskLayout"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L11d
            r4 = r5
        L13b:
            android.view.View r4 = (android.view.View) r4
            r12 = 8
            if (r4 != 0) goto L147
            if (r1 == 0) goto L1a8
            r3.setVisibility(r12)
            return
        L147:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            if (r5 == 0) goto L1a8
            java.util.Map r6 = r0.f12400f
            if (r1 == 0) goto L180
            r6.getClass()
            monitor-enter(r6)
            java.util.Map r1 = r0.f12400f     // Catch: java.lang.Throwable -> L16e
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L16e
            if (r1 != 0) goto L170
            java.util.Map r0 = r0.f12400f     // Catch: java.lang.Throwable -> L16e
            r0.getClass()     // Catch: java.lang.Throwable -> L16e
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L16e
            int r1 = r5.width     // Catch: java.lang.Throwable -> L16e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L16e
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L16e
            goto L170
        L16e:
            r12 = move-exception
            goto L17e
        L170:
            monitor-exit(r6)
            int r0 = r5.width
            if (r0 == 0) goto L17a
            r5.width = r2
            r4.setLayoutParams(r5)
        L17a:
            r3.setVisibility(r12)
            return
        L17e:
            monitor-exit(r6)
            throw r12
        L180:
            r6.getClass()
            monitor-enter(r6)
            java.util.Map r12 = r0.f12400f     // Catch: java.lang.Throwable -> L1a1
            java.lang.Object r12 = r12.remove(r4)     // Catch: java.lang.Throwable -> L1a1
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L1a1
            monitor-exit(r6)
            if (r12 == 0) goto L1a8
            int r0 = r5.width
            int r1 = r12.intValue()
            if (r0 == r1) goto L1a8
            int r12 = r12.intValue()
            r5.width = r12
            r4.setLayoutParams(r5)
            return
        L1a1:
            r12 = move-exception
            monitor-exit(r6)
            throw r12
        L1a4:
            int r7 = r7 + 1
            goto L69
        L1a8:
            return
    }

    private final void j(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            r8.getClass()
            java.lang.Object r0 = r7.f536b
            b5.c r0 = (b5.c) r0
            java.lang.Object[] r8 = r8.args
            r1 = 0
            r2 = 0
            if (r8 == 0) goto L12
            java.lang.Object r8 = tf.l.C0(r2, r8)
            goto L13
        L12:
            r8 = r1
        L13:
            java.lang.Object r0 = r0.f470b
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            if (r8 == 0) goto Lbc
            java.lang.String r3 = "hide_chat_menu_enable"
            boolean r3 = r0.getBoolean(r3, r2)
            if (r3 != 0) goto L23
            goto Lbc
        L23:
            java.lang.String r3 = "hide_chat_menu_titles"
            java.lang.String r4 = "提醒,搜一搜,收藏"
            java.lang.String r0 = r0.getString(r3, r4)
            java.util.Set r0 = r9.e0.Y(r0)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L37
            goto Lbc
        L37:
            java.lang.String r3 = "size"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invokeMethod(r8, r3, r4)
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L46
            java.lang.Number r3 = (java.lang.Number) r3
            goto L47
        L46:
            r3 = r1
        L47:
            if (r3 == 0) goto Lbc
            int r3 = r3.intValue()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
        L52:
            if (r2 < r3) goto L76
            java.util.Iterator r0 = r4.iterator()
        L58:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "removeItem"
            h.Hchat.utils.KavaReflector.invokeMethod(r8, r2, r1)
            goto L58
        L76:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "getItem"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invokeMethod(r8, r6, r5)
            boolean r6 = r5 instanceof android.view.MenuItem
            if (r6 == 0) goto L8b
            android.view.MenuItem r5 = (android.view.MenuItem) r5
            goto L8c
        L8b:
            r5 = r1
        L8c:
            if (r5 == 0) goto Lb9
            java.lang.CharSequence r6 = r5.getTitle()
            if (r6 == 0) goto La3
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto La3
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            goto La4
        La3:
            r6 = r1
        La4:
            if (r6 != 0) goto La8
            java.lang.String r6 = ""
        La8:
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto Lb9
            int r5 = r5.getItemId()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.add(r5)
        Lb9:
            int r2 = r2 + 1
            goto L52
        Lbc:
            return
    }

    private final void k(de.robv.android.xposed.XC_MethodHook.MethodHookParam r25) {
            r24 = this;
            r1 = r24
            r0 = r25
            java.lang.Object r2 = r1.f536b
            r4 = r2
            wa.g r4 = (wa.g) r4
            java.util.concurrent.ConcurrentHashMap r2 = r4.f14921g
            h.Hchat.dexkit.DexFinder r3 = r4.f14916b
            java.lang.String r5 = "req|"
            java.lang.String r6 = "快照保存: type="
            android.content.SharedPreferences r7 = r4.f14917c
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L21
            java.lang.String r10 = "protobuf_packet_enable"
            boolean r10 = r7.getBoolean(r10, r8)
            if (r10 == 0) goto L21
            r10 = r9
            goto L22
        L21:
            r10 = r8
        L22:
            java.util.concurrent.CopyOnWriteArrayList r11 = wa.j.f14927c
            boolean r11 = r11.isEmpty()
            if (r10 != 0) goto L2e
            if (r11 == 0) goto L2e
            goto L194
        L2e:
            java.lang.Object[] r12 = r0.args     // Catch: java.lang.Throwable -> L5c
            if (r12 == 0) goto L194
            int r13 = r12.length     // Catch: java.lang.Throwable -> L5c
            r14 = 3
            if (r13 >= r14) goto L38
            goto L194
        L38:
            r13 = r8
            r8 = r12[r9]     // Catch: java.lang.Throwable -> L5c
            r14 = 2
            r12 = r12[r14]     // Catch: java.lang.Throwable -> L5c
            if (r8 != 0) goto L42
            goto L194
        L42:
            java.lang.String r15 = "getUri"
            java.lang.Object r15 = wa.g.e(r8, r15)     // Catch: java.lang.Throwable -> L5c
            if (r15 != 0) goto L4d
            java.lang.String r15 = ""
            goto L51
        L4d:
            java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch: java.lang.Throwable -> L5c
        L51:
            int r16 = r15.length()     // Catch: java.lang.Throwable -> L5c
            if (r16 != 0) goto L59
            java.lang.String r15 = "null"
        L59:
            r16 = r15
            goto L5f
        L5c:
            r0 = move-exception
            goto L17f
        L5f:
            java.lang.String r15 = "getType"
            java.lang.Object r15 = wa.g.e(r8, r15)     // Catch: java.lang.Throwable -> L5c
            boolean r13 = r15 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L5c
            if (r13 == 0) goto L70
            java.lang.Number r15 = (java.lang.Number) r15     // Catch: java.lang.Throwable -> L5c
            int r13 = r15.intValue()     // Catch: java.lang.Throwable -> L5c
            goto L71
        L70:
            r13 = -1
        L71:
            if (r10 == 0) goto L7c
            boolean r15 = r4.n(r13)     // Catch: java.lang.Throwable -> L5c
            if (r15 == 0) goto L7c
            r21 = r9
            goto L7e
        L7c:
            r21 = 0
        L7e:
            if (r21 == 0) goto L84
            if (r11 == 0) goto L84
            goto L194
        L84:
            java.lang.Object r15 = r0.thisObject     // Catch: java.lang.Throwable -> L5c
            r22 = 0
            r23 = r14
            java.lang.String r14 = "getReqObj"
            java.lang.Object r14 = wa.g.e(r8, r14)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r19 = wa.g.i(r14)     // Catch: java.lang.Throwable -> L9c
            byte[] r20 = wa.g.u(r19)     // Catch: java.lang.Throwable -> L9c
            if (r19 == 0) goto L9c
            if (r20 != 0) goto La0
        L9c:
            r14 = r13
            r13 = r16
            goto Lb2
        La0:
            r18 = r15
            wa.f r15 = new wa.f     // Catch: java.lang.Throwable -> L9c
            r17 = r13
            r15.<init>(r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> Lae
            r13 = r16
            r14 = r17
            goto Lb4
        Lae:
            r13 = r16
            r14 = r17
        Lb2:
            r15 = r22
        Lb4:
            if (r15 == 0) goto L133
            java.lang.String r9 = r15.a()     // Catch: java.lang.Throwable -> L5c
            r2.put(r9, r15)     // Catch: java.lang.Throwable -> L5c
            int r9 = r2.size()     // Catch: java.lang.Throwable -> L5c
            r1 = 60
            if (r9 > r1) goto Lc6
            goto Ld7
        Lc6:
            java.util.Set r1 = r2.keySet()     // Catch: java.lang.Throwable -> Ld7
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld7
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Ld7
            r2.remove(r1)     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            if (r11 != 0) goto Le0
            java.lang.String r1 = "request"
            byte[] r2 = r15.f14913e     // Catch: java.lang.Throwable -> L5c
            wa.g.c(r1, r13, r14, r2)     // Catch: java.lang.Throwable -> L5c
        Le0:
            if (r10 == 0) goto L10d
            if (r21 != 0) goto L10d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L5c
            r1.append(r14)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = " uri="
            r1.append(r2)     // Catch: java.lang.Throwable -> L5c
            r1.append(r13)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = " req="
            r1.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r2 = r15.f14912d     // Catch: java.lang.Throwable -> L5c
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L5c
            r1.append(r2)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            r4.p(r1)     // Catch: java.lang.Throwable -> L5c
        L10d:
            if (r10 == 0) goto L133
            if (r21 != 0) goto L133
            if (r7 == 0) goto L11c
            java.lang.String r1 = "protobuf_packet_capture_request"
            r2 = 1
            boolean r1 = r7.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L133
        L11c:
            java.lang.String r1 = r15.a()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r5.concat(r1)     // Catch: java.lang.Throwable -> L5c
            byte[] r2 = r15.f14913e     // Catch: java.lang.Throwable -> L5c
            boolean r1 = r4.t(r1, r2)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L133
            java.lang.String r1 = "请求"
            byte[] r2 = r15.f14913e     // Catch: java.lang.Throwable -> L5c
            r4.q(r1, r13, r14, r2)     // Catch: java.lang.Throwable -> L5c
        L133:
            if (r11 == 0) goto L14a
            if (r10 == 0) goto L194
            if (r21 != 0) goto L194
            if (r7 == 0) goto L147
            java.lang.String r1 = "protobuf_packet_capture_response"
            r2 = 1
            boolean r1 = r7.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L145
            goto L148
        L145:
            r2 = 0
            goto L148
        L147:
            r2 = 1
        L148:
            if (r2 == 0) goto L194
        L14a:
            if (r12 == 0) goto L194
            if (r3 == 0) goto L194
            java.lang.Class<?> r1 = r3.protobufOnGYNetEndClass     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L194
            boolean r1 = r1.isInterface()     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L194
            java.lang.Class r1 = r12.getClass()     // Catch: java.lang.Throwable -> L5c
            boolean r1 = java.lang.reflect.Proxy.isProxyClass(r1)     // Catch: java.lang.Throwable -> L5c
            if (r1 != 0) goto L194
            java.lang.Class<?> r1 = r3.protobufOnGYNetEndClass     // Catch: java.lang.Throwable -> L5c
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L5c
            java.lang.Class<?> r2 = r3.protobufOnGYNetEndClass     // Catch: java.lang.Throwable -> L5c
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L5c
            wa.d r3 = new wa.d     // Catch: java.lang.Throwable -> L5c
            r5 = r12
            r6 = r13
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r1, r2, r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object[] r0 = r0.args     // Catch: java.lang.Throwable -> L5c
            r0[r23] = r1     // Catch: java.lang.Throwable -> L5c
            goto L194
        L17f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "dispatch处理失败: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            wa.g.h(r0)
        L194:
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r34) {
            r33 = this;
            r1 = r33
            r0 = r34
            int r2 = r1.f535a
            r3 = 2
            r4 = 1
            r5 = 0
            java.lang.String r6 = ""
            java.lang.Object r8 = r1.f536b
            switch(r2) {
                case 0: goto Lb8a;
                case 1: goto L1cf;
                case 2: goto L109;
                case 3: goto L105;
                case 4: goto L73;
                case 5: goto L6f;
                case 6: goto L6b;
                case 7: goto L10;
                case 8: goto L10;
                case 9: goto L38;
                case 10: goto L10;
                case 11: goto L34;
                case 12: goto L10;
                case 13: goto L10;
                case 14: goto L30;
                case 15: goto L10;
                case 16: goto L10;
                case 17: goto L10;
                case 18: goto L2c;
                case 19: goto L10;
                case 20: goto L10;
                case 21: goto L28;
                case 22: goto L10;
                case 23: goto L20;
                case 24: goto L1c;
                case 25: goto L10;
                case 26: goto L18;
                case 27: goto L14;
                default: goto L10;
            }
        L10:
            super.afterHookedMethod(r34)
            return
        L14:
            r33.j(r34)
            return
        L18:
            r33.i(r34)
            return
        L1c:
            r33.h(r34)
            return
        L20:
            java.lang.Object r0 = r0.thisObject
            q8.b r8 = (q8.b) r8
            y4.c.d(r0, r8)
            return
        L28:
            r33.g(r34)
            return
        L2c:
            r33.f(r34)
            return
        L30:
            r33.e(r34)
            return
        L34:
            r33.d(r34)
            return
        L38:
            r0.getClass()
            java.lang.String r2 = "hchat_send_text_decoration"
            java.lang.Object r0 = r0.getObjectExtra(r2)
            boolean r2 = r0 instanceof eb.h0
            if (r2 == 0) goto L49
            r7 = r0
            eb.h0 r7 = (eb.h0) r7
            goto L4a
        L49:
            r7 = 0
        L4a:
            if (r7 == 0) goto L6a
            eb.m0 r8 = (eb.m0) r8
            eb.m0.b(r8, r7)     // Catch: java.lang.Throwable -> L54
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L54
            goto L5b
        L54:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L5b:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L6a
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:Script] 恢复未发送文字失败: "
            eh.a.x(r3, r2, r0)
        L6a:
            return
        L6b:
            r33.c(r34)
            return
        L6f:
            r33.b(r34)
            return
        L73:
            r0.getClass()
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r5, r2)
            boolean r9 = r2 instanceof java.lang.Integer
            if (r9 == 0) goto L86
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L87
        L86:
            r2 = 0
        L87:
            if (r2 == 0) goto L104
            java.util.concurrent.ConcurrentHashMap r9 = c9.e.f1156c
            java.lang.Object r10 = r9.get(r2)
            r14 = r10
            c9.d r14 = (c9.d) r14
            if (r14 == 0) goto L104
            java.lang.ref.WeakReference r10 = r14.f1125a
            java.lang.Object r10 = r10.get()
            r13 = r10
            android.app.Activity r13 = (android.app.Activity) r13
            if (r13 != 0) goto La3
            r9.remove(r2, r14)
            goto L104
        La3:
            java.lang.Object r10 = r0.thisObject
            if (r10 != r13) goto L104
            boolean r2 = r9.remove(r2, r14)
            if (r2 != 0) goto Lae
            goto L104
        Lae:
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r4, r2)
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto Lbe
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto Lbf
        Lbe:
            r2 = 0
        Lbf:
            if (r2 == 0) goto Lc6
            int r2 = r2.intValue()
            goto Lc7
        Lc6:
            r2 = r5
        Lc7:
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r3, r0)
            boolean r3 = r0 instanceof android.content.Intent
            if (r3 == 0) goto Ld7
            android.content.Intent r0 = (android.content.Intent) r0
            goto Ld8
        Ld7:
            r0 = 0
        Ld8:
            if (r0 == 0) goto Le0
            android.net.Uri r7 = r0.getData()
            r15 = r7
            goto Le1
        Le0:
            r15 = 0
        Le1:
            r0 = -1
            if (r2 != r0) goto Lfc
            if (r15 != 0) goto Le7
            goto Lfc
        Le7:
            java.lang.Thread r0 = new java.lang.Thread
            r12 = r8
            c9.e r12 = (c9.e) r12
            ac.l r11 = new ac.l
            r16 = 3
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.String r2 = "Hchat-ConversationGroupDocument"
            r0.<init>(r11, r2)
            r0.start()
            goto L104
        Lfc:
            c9.p2 r0 = new c9.p2
            r0.<init>(r6, r5)
            r14.a(r0)
        L104:
            return
        L105:
            r33.a(r34)
            return
        L109:
            b9.f r8 = (b9.f) r8
            r0.getClass()
            java.lang.Object r0 = r0.thisObject
            if (r0 == 0) goto L1ce
            java.util.Map r2 = r8.f538b
            java.lang.Object r2 = r2.remove(r0)
            bb.j r2 = (bb.j) r2
            if (r2 == 0) goto L1ce
            java.lang.String r3 = "r"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r3)
            if (r0 == 0) goto L139
            java.lang.String r3 = "f"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r3)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L131
            java.lang.String r0 = (java.lang.String) r0
            goto L132
        L131:
            r0 = 0
        L132:
            og.k r3 = bb.l.f693c
            java.lang.String r0 = fb.v0.G(r0)
            goto L13a
        L139:
            r0 = r6
        L13a:
            bb.k r3 = r2.f671a
            java.util.concurrent.ConcurrentHashMap r4 = r3.f684j
            java.util.concurrent.ConcurrentHashMap r5 = r3.f683i
            java.lang.String r8 = r2.f672b
            java.lang.String r9 = r2.f673c
            long r10 = r2.f674d
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = r3.f682h
            java.lang.String r12 = bb.k.n(r8, r9)
            boolean r13 = r3.f(r10, r12)
            if (r13 != 0) goto L154
            goto L1ce
        L154:
            r3.b(r10, r12)
            boolean r10 = og.m.t0(r0)
            if (r10 == 0) goto L17c
            r2.remove(r9)
            r3.l()
            java.lang.String r0 = bb.k.n(r8, r9)
            r5.remove(r0)
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 6000(0x1770, double:2.9644E-320)
            long r5 = r5 + r7
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r4.put(r0, r2)
            r3.j()
            goto L1ce
        L17c:
            bb.l r8 = r3.f675a
            if (r9 == 0) goto L189
            java.lang.CharSequence r7 = og.m.R0(r9)
            java.lang.String r7 = r7.toString()
            goto L18a
        L189:
            r7 = 0
        L18a:
            if (r7 != 0) goto L18d
            goto L18e
        L18d:
            r6 = r7
        L18e:
            og.k r7 = bb.l.f693c
            boolean r7 = fb.v0.A(r6)
            if (r7 != 0) goto L197
            goto L1ba
        L197:
            java.lang.String r0 = fb.v0.G(r0)
            int r7 = r0.length()
            if (r7 != 0) goto L1a2
            goto L1ba
        L1a2:
            java.util.concurrent.ConcurrentHashMap r7 = r8.f695b
            r7.put(r6, r0)
            android.content.SharedPreferences r7 = r8.f694a
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r8 = "tail_"
            java.lang.String r6 = r8.concat(r6)
            android.content.SharedPreferences$Editor r0 = r7.putString(r6, r0)
            r0.apply()
        L1ba:
            r2.remove(r9)
            r5.remove(r12)
            r4.remove(r12)
            r3.l()
            bb.c r0 = r3.f678d
            r0.invoke(r9)
            r3.j()
        L1ce:
            return
        L1cf:
            r0.getClass()
            ba.m r8 = (ba.m) r8
            java.lang.ThreadLocal r2 = r8.f605l
            java.lang.Object r2 = r2.get()
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            if (r2 == 0) goto Lb89
            java.lang.Object r9 = r2.pollLast()
            ba.h r9 = (ba.h) r9
            if (r9 == 0) goto Lb89
            android.view.View r10 = r9.f567a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1f3
            java.lang.ThreadLocal r2 = r8.f605l
            r2.remove()
        L1f3:
            if (r10 == 0) goto L208
            java.lang.Object r2 = r10.getTag()
            if (r2 == 0) goto L208
            java.lang.String r11 = "com.tencent.mm.ui.chatting.viewitems."
            boolean r11 = eh.a.z(r11, r2, r5)
            if (r11 == 0) goto L204
            goto L205
        L204:
            r2 = 0
        L205:
            if (r2 == 0) goto L208
            goto L20a
        L208:
            java.lang.Object r2 = r9.f568b
        L20a:
            java.lang.Object[] r0 = r0.args
            android.content.SharedPreferences r9 = r8.f595b
            if (r10 == 0) goto Lb89
            if (r0 == 0) goto L216
            int r11 = r0.length
            r12 = r4
        L214:
            if (r12 < r11) goto L218
        L216:
            r13 = 0
            goto L232
        L218:
            r13 = r0[r12]
            java.util.WeakHashMap r14 = new java.util.WeakHashMap
            r14.<init>()
            java.util.Set r14 = java.util.Collections.newSetFromMap(r14)
            r14.getClass()
            java.util.Set r14 = (java.util.Set) r14
            java.lang.Object r13 = r8.w(r5, r13, r14)
            if (r13 == 0) goto L22f
            goto L232
        L22f:
            int r12 = r12 + 1
            goto L214
        L232:
            if (r13 == 0) goto L243
            java.lang.String r0 = "field_type"
            java.lang.String r11 = "type"
            java.lang.String r12 = "getType"
            java.lang.Object r0 = ba.m.s(r13, r12, r0, r11)
            java.lang.Integer r0 = ba.m.r(r0)
            goto L244
        L243:
            r0 = 0
        L244:
            if (r13 == 0) goto L257
            java.lang.String r11 = "field_content"
            java.lang.String r12 = "content"
            java.lang.String r14 = "getContent"
            java.lang.Object r11 = ba.m.s(r13, r14, r11, r12)
            if (r11 == 0) goto L257
            java.lang.String r11 = r11.toString()
            goto L258
        L257:
            r11 = 0
        L258:
            if (r11 != 0) goto L25b
            r11 = r6
        L25b:
            r12 = 10002(0x2712, float:1.4016E-41)
            r14 = 10000(0x2710, float:1.4013E-41)
            if (r0 == 0) goto L28c
            int r7 = r0.intValue()
            if (r7 > 0) goto L26b
            r34 = 65535(0xffff, float:9.1834E-41)
            goto L282
        L26b:
            r34 = 65535(0xffff, float:9.1834E-41)
            r15 = r7 & 255(0xff, float:3.57E-43)
            r5 = r7 & r34
            int r18 = r7 >>> 16
            if (r18 != 0) goto L277
            goto L282
        L277:
            if (r5 == r14) goto L281
            if (r5 == r12) goto L281
            if (r15 == 0) goto L282
            if (r5 != r15) goto L282
            r7 = r15
            goto L282
        L281:
            r7 = r5
        L282:
            r5 = 49
            if (r7 != r5) goto L288
            r5 = r4
            goto L289
        L288:
            r5 = 0
        L289:
            if (r5 != r4) goto L28f
            goto L297
        L28c:
            r34 = 65535(0xffff, float:9.1834E-41)
        L28f:
            java.lang.String r5 = "<appmsg"
            boolean r5 = og.m.h0(r11, r5, r4)
            if (r5 == 0) goto L2a8
        L297:
            og.k r5 = ba.m.f588r
            boolean r5 = r5.a(r11)
            if (r5 != 0) goto L2aa
            java.lang.String r5 = "<refermsg"
            boolean r5 = og.m.h0(r11, r5, r4)
            if (r5 == 0) goto L2a8
            goto L2aa
        L2a8:
            r5 = 0
            goto L2ab
        L2aa:
            r5 = r4
        L2ab:
            if (r0 == 0) goto L2b9
            int r7 = r0.intValue()
            boolean r7 = ba.m.n(r7)
            if (r7 != r4) goto L2b9
            r7 = r4
            goto L2ba
        L2b9:
            r7 = 0
        L2ba:
            if (r0 == 0) goto L2c6
            java.util.Set r15 = ba.m.f591u
            boolean r15 = r15.contains(r0)
            if (r15 == 0) goto L2c6
            r15 = r4
            goto L2c7
        L2c6:
            r15 = 0
        L2c7:
            r12 = 34
            if (r0 != 0) goto L2cd
        L2cb:
            r14 = 0
            goto L30d
        L2cd:
            int r19 = r0.intValue()
            int r14 = fb.v0.F(r19)
            if (r14 != r4) goto L2d9
            r14 = r4
            goto L2da
        L2d9:
            r14 = 0
        L2da:
            if (r14 != 0) goto L2fe
            int r14 = r0.intValue()
            int r14 = fb.v0.F(r14)
            if (r14 != r12) goto L2e8
            r14 = r4
            goto L2e9
        L2e8:
            r14 = 0
        L2e9:
            if (r14 != 0) goto L2fe
            if (r7 != 0) goto L2fe
            java.util.Set r14 = ba.m.f585o
            boolean r14 = r14.contains(r0)
            if (r14 == 0) goto L2f6
            goto L2fe
        L2f6:
            if (r5 == 0) goto L300
            boolean r14 = ba.m.k(r0, r11)
            if (r14 != 0) goto L300
        L2fe:
            r14 = r4
            goto L30d
        L300:
            ba.a r14 = ba.m.v(r0, r11)
            int r14 = r14.ordinal()
            if (r14 == r4) goto L2fe
            if (r14 == r3) goto L2fe
            goto L2cb
        L30d:
            if (r14 != 0) goto L311
            goto Lb89
        L311:
            java.lang.String r14 = "bkl"
            tf.t r19 = tf.t.f13167g
            if (r5 == 0) goto L46f
            java.util.Map r7 = r8.g()
            java.lang.Object r7 = r7.get(r14)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L358
            int r7 = r7.intValue()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            ba.m.c(r10, r7, r15)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r15 = r15.iterator()
        L338:
            boolean r21 = r15.hasNext()
            if (r21 == 0) goto L352
            java.lang.Object r4 = r15.next()
            r12 = r4
            android.view.View r12 = (android.view.View) r12
            boolean r12 = ba.m.j(r12, r10)
            if (r12 == 0) goto L34e
            r7.add(r4)
        L34e:
            r4 = 1
            r12 = 34
            goto L338
        L352:
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L35d
        L358:
            r24 = r5
            r15 = 0
            goto L461
        L35d:
            l8.d r4 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r4.getClass()
            java.lang.String r4 = "title"
            java.lang.String r4 = l8.d.o(r11, r4)
            java.lang.String r4 = ba.m.q(r4)
            int r12 = r4.length()
            if (r12 <= 0) goto L458
            java.util.Iterator r12 = r7.iterator()
        L376:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L450
            java.lang.Object r15 = r12.next()
            r3 = r15
            android.view.View r3 = (android.view.View) r3
            java.lang.String r1 = "getWrappedTextView"
            r24 = r5
            r25 = r6
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r1, r6)
            boolean r5 = r1 instanceof android.widget.TextView
            if (r5 == 0) goto L397
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L398
        L397:
            r1 = 0
        L398:
            if (r1 == 0) goto L39b
            goto L3a4
        L39b:
            boolean r1 = r3 instanceof android.widget.TextView
            if (r1 == 0) goto L3a3
            r1 = r3
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L3a4
        L3a3:
            r1 = 0
        L3a4:
            java.lang.String r5 = "a"
            r26 = r1
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r5, r1)
            if (r1 == 0) goto L3cc
            boolean r5 = r1 instanceof java.lang.CharSequence
            if (r5 == 0) goto L3b8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L3b9
        L3b8:
            r1 = 0
        L3b9:
            if (r1 == 0) goto L3cc
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L3cc
            boolean r5 = og.m.t0(r1)
            if (r5 != 0) goto L3c8
            goto L3c9
        L3c8:
            r1 = 0
        L3c9:
            if (r1 == 0) goto L3cc
            goto L417
        L3cc:
            java.lang.String r1 = "x"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r3, r1)
            if (r1 == 0) goto L3ef
            boolean r5 = r1 instanceof java.lang.CharSequence
            if (r5 == 0) goto L3db
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L3dc
        L3db:
            r1 = 0
        L3dc:
            if (r1 == 0) goto L3ef
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L3ef
            boolean r5 = og.m.t0(r1)
            if (r5 != 0) goto L3eb
            goto L3ec
        L3eb:
            r1 = 0
        L3ec:
            if (r1 == 0) goto L3ef
            goto L417
        L3ef:
            java.lang.CharSequence r1 = r3.getContentDescription()
            if (r1 == 0) goto L3fa
            java.lang.String r1 = r1.toString()
            goto L3fb
        L3fa:
            r1 = 0
        L3fb:
            if (r1 != 0) goto L3ff
            r1 = r25
        L3ff:
            boolean r3 = og.m.t0(r1)
            if (r3 == 0) goto L417
            if (r26 == 0) goto L412
            java.lang.CharSequence r1 = r26.getText()
            if (r1 == 0) goto L412
            java.lang.String r1 = r1.toString()
            goto L413
        L412:
            r1 = 0
        L413:
            if (r1 != 0) goto L417
            r1 = r25
        L417:
            java.lang.String r1 = ba.m.q(r1)
            boolean r3 = gg.l.a(r1, r4)
            if (r3 != 0) goto L443
            int r3 = r4.length()
            r5 = 2
            if (r3 < r5) goto L43d
            int r3 = r1.length()
            int r5 = r4.length()
            int r5 = r5 * 3
            int r5 = r5 + 12
            if (r3 <= r5) goto L437
            goto L43d
        L437:
            r5 = 0
            boolean r1 = og.m.h0(r1, r4, r5)
            goto L43e
        L43d:
            r1 = 0
        L43e:
            if (r1 == 0) goto L441
            goto L443
        L441:
            r1 = 0
            goto L444
        L443:
            r1 = 1
        L444:
            if (r1 == 0) goto L447
            goto L453
        L447:
            r1 = r33
            r5 = r24
            r6 = r25
            r3 = 2
            goto L376
        L450:
            r24 = r5
            r15 = 0
        L453:
            android.view.View r15 = (android.view.View) r15
            if (r15 == 0) goto L45a
            goto L461
        L458:
            r24 = r5
        L45a:
            java.lang.Object r1 = tf.m.t1(r7)
            r15 = r1
            android.view.View r15 = (android.view.View) r15
        L461:
            if (r15 == 0) goto L468
            java.util.List r1 = a.a.x0(r15)
            goto L469
        L468:
            r1 = 0
        L469:
            if (r1 != 0) goto L6d9
        L46b:
            r1 = r19
            goto L6d9
        L46f:
            r24 = r5
            if (r7 == 0) goto L4fc
            if (r15 == 0) goto L4aa
            java.util.Map r1 = r8.g()
            java.lang.String r3 = "kpw"
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L498
            int r1 = r1.intValue()
            android.view.View r1 = r10.findViewById(r1)
            if (r1 == 0) goto L498
            boolean r3 = ba.m.o(r1, r10)
            if (r3 == 0) goto L494
            goto L495
        L494:
            r1 = 0
        L495:
            if (r1 == 0) goto L498
            goto L499
        L498:
            r1 = r10
        L499:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            ba.m.a(r1, r10, r3)
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L4aa
            r1 = r3
            goto L6d9
        L4aa:
            java.util.Map r1 = r8.g()
            java.lang.Object r1 = r1.get(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L4ec
            java.util.Map r3 = r8.i(r2)
            java.lang.Object r3 = r3.get(r1)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L4d2
            boolean r4 = ba.m.o(r3, r10)
            if (r4 == 0) goto L4c9
            goto L4ca
        L4c9:
            r3 = 0
        L4ca:
            if (r3 == 0) goto L4d2
            java.util.List r1 = a.a.x0(r3)
            goto L6d9
        L4d2:
            int r1 = r1.intValue()
            android.view.View r1 = r10.findViewById(r1)
            if (r1 == 0) goto L4ec
            boolean r3 = ba.m.o(r1, r10)
            if (r3 == 0) goto L4e3
            goto L4e4
        L4e3:
            r1 = 0
        L4e4:
            if (r1 == 0) goto L4ec
            java.util.List r1 = a.a.x0(r1)
            goto L6d9
        L4ec:
            android.view.View r1 = ba.m.d(r10, r10)
            if (r1 == 0) goto L4f7
            java.util.List r1 = a.a.x0(r1)
            goto L4f8
        L4f7:
            r1 = 0
        L4f8:
            if (r1 != 0) goto L6d9
            goto L46b
        L4fc:
            java.util.concurrent.ConcurrentHashMap r1 = r8.f599f
            java.lang.Class<android.view.View> r3 = android.view.View.class
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            if (r2 == 0) goto L51b
            java.lang.Class r5 = r2.getClass()
            java.lang.Object r5 = r1.get(r5)
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            if (r5 == 0) goto L51d
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r5, r2)
            boolean r5 = r1 instanceof android.view.View
            if (r5 == 0) goto L51b
            android.view.View r1 = (android.view.View) r1
            goto L57d
        L51b:
            r1 = 0
            goto L57d
        L51d:
            java.lang.Class r5 = r2.getClass()
        L521:
            if (r5 == 0) goto L51b
            boolean r6 = r5.equals(r4)
            if (r6 != 0) goto L51b
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredFields(r5)
            java.util.Iterator r6 = r6.iterator()
        L531:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L55f
            java.lang.Object r7 = r6.next()
            r12 = r7
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            java.lang.String r15 = r12.getName()
            r25 = r5
            java.lang.String r5 = "clickArea"
            boolean r5 = gg.l.a(r15, r5)
            if (r5 == 0) goto L558
            java.lang.Class r5 = r12.getType()
            boolean r5 = r3.isAssignableFrom(r5)
            if (r5 == 0) goto L558
            r5 = 1
            goto L559
        L558:
            r5 = 0
        L559:
            if (r5 == 0) goto L55c
            goto L562
        L55c:
            r5 = r25
            goto L531
        L55f:
            r25 = r5
            r7 = 0
        L562:
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            if (r7 == 0) goto L578
            java.lang.Class r5 = r2.getClass()
            r1.put(r5, r7)
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r7, r2)
            boolean r5 = r1 instanceof android.view.View
            if (r5 == 0) goto L51b
            android.view.View r1 = (android.view.View) r1
            goto L57d
        L578:
            java.lang.Class r5 = r25.getSuperclass()
            goto L521
        L57d:
            if (r1 == 0) goto L586
            boolean r5 = ba.m.j(r1, r10)
            if (r5 == 0) goto L586
            goto L587
        L586:
            r1 = 0
        L587:
            if (r1 == 0) goto L58f
            java.util.List r1 = a.a.x0(r1)
            goto L6d9
        L58f:
            java.util.Map r1 = r8.i(r2)
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.List r6 = ba.m.f592v
            java.util.Iterator r6 = r6.iterator()
        L59e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5f2
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map r12 = r8.g()
            java.lang.Object r12 = r12.get(r7)
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 == 0) goto L5ed
            int r15 = r12.intValue()
            boolean r7 = gg.l.a(r7, r14)
            if (r7 == 0) goto L5c2
            if (r0 != 0) goto L5c5
        L5c2:
            r25 = r6
            goto L5d0
        L5c5:
            int r7 = r0.intValue()
            r25 = r6
            r6 = 34
            if (r7 != r6) goto L5d0
            goto L5ef
        L5d0:
            java.lang.Object r6 = r1.get(r12)
            android.view.View r6 = (android.view.View) r6
            if (r6 == 0) goto L5d9
            goto L5dd
        L5d9:
            android.view.View r6 = r10.findViewById(r15)
        L5dd:
            if (r6 == 0) goto L5ef
            boolean r7 = ba.m.j(r6, r10)
            if (r7 == 0) goto L5e6
            goto L5e7
        L5e6:
            r6 = 0
        L5e7:
            if (r6 == 0) goto L5ef
            r5.add(r6)
            goto L5ef
        L5ed:
            r25 = r6
        L5ef:
            r6 = r25
            goto L59e
        L5f2:
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L5fe
            java.util.List r1 = tf.m.P1(r5)
            goto L6d9
        L5fe:
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r8.f602i
            java.util.concurrent.ConcurrentHashMap r5 = r8.f601h
            if (r2 == 0) goto L61f
            java.lang.Class r6 = r2.getClass()
            java.lang.Object r7 = r5.get(r6)
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 == 0) goto L622
            r12 = 0
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r7, r2, r1)
            boolean r3 = r1 instanceof android.view.View
            if (r3 == 0) goto L61f
            android.view.View r1 = (android.view.View) r1
            goto L69c
        L61f:
            r1 = 0
            goto L69c
        L622:
            boolean r7 = r1.contains(r6)
            if (r7 == 0) goto L629
            goto L61f
        L629:
            r7 = r6
        L62a:
            if (r7 == 0) goto L698
            boolean r12 = r7.equals(r4)
            if (r12 != 0) goto L698
            java.util.List r12 = h.Hchat.utils.KavaReflector.declaredMethods(r7)
            java.util.Iterator r12 = r12.iterator()
        L63a:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L677
            java.lang.Object r15 = r12.next()
            r25 = r15
            java.lang.reflect.Method r25 = (java.lang.reflect.Method) r25
            r26 = r4
            java.lang.String r4 = r25.getName()
            r27 = r7
            java.lang.String r7 = "getMainContainerView"
            boolean r4 = gg.l.a(r4, r7)
            if (r4 == 0) goto L66e
            java.lang.Class[] r4 = r25.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L66e
            java.lang.Class r4 = r25.getReturnType()
            boolean r4 = r3.isAssignableFrom(r4)
            if (r4 == 0) goto L66e
            r4 = 1
            goto L66f
        L66e:
            r4 = 0
        L66f:
            if (r4 == 0) goto L672
            goto L67c
        L672:
            r4 = r26
            r7 = r27
            goto L63a
        L677:
            r26 = r4
            r27 = r7
            r15 = 0
        L67c:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            if (r15 == 0) goto L691
            r5.put(r6, r15)
            r5 = 0
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r15, r2, r1)
            boolean r3 = r1 instanceof android.view.View
            if (r3 == 0) goto L61f
            android.view.View r1 = (android.view.View) r1
            goto L69c
        L691:
            java.lang.Class r7 = r27.getSuperclass()
            r4 = r26
            goto L62a
        L698:
            r1.add(r6)
            goto L61f
        L69c:
            if (r1 == 0) goto L6ad
            boolean r3 = ba.m.j(r1, r10)
            if (r3 == 0) goto L6a5
            goto L6a6
        L6a5:
            r1 = 0
        L6a6:
            if (r1 == 0) goto L6ad
            java.util.List r1 = a.a.x0(r1)
            goto L6d9
        L6ad:
            java.util.Map r1 = r8.g()
            java.lang.String r3 = "bkg"
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L46b
            int r1 = r1.intValue()
            android.view.View r1 = r10.findViewById(r1)
            if (r1 == 0) goto L6d4
            boolean r3 = ba.m.j(r1, r10)
            if (r3 == 0) goto L6cc
            goto L6cd
        L6cc:
            r1 = 0
        L6cd:
            if (r1 == 0) goto L6d4
            java.util.List r1 = a.a.x0(r1)
            goto L6d5
        L6d4:
            r1 = 0
        L6d5:
            if (r1 != 0) goto L6d9
            goto L46b
        L6d9:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L6e1
            goto Lb89
        L6e1:
            java.lang.String r3 = "message_bubble_enable"
            r5 = 0
            boolean r3 = r9.getBoolean(r3, r5)
            if (r3 != 0) goto L6ec
            goto Lb89
        L6ec:
            if (r13 == 0) goto L70c
            java.lang.String r3 = "field_isSend"
            java.lang.String r4 = "isSend"
            java.lang.String r5 = "getIsSend"
            java.lang.Object r3 = ba.m.s(r13, r5, r3, r4)
            java.lang.Integer r3 = ba.m.r(r3)
            if (r3 == 0) goto L70c
            int r3 = r3.intValue()
            if (r3 == 0) goto L706
            r3 = 1
            goto L707
        L706:
            r3 = 0
        L707:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L70d
        L70c:
            r3 = 0
        L70d:
            android.content.Context r4 = r10.getContext()
            r4.getClass()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.uiMode
            r4 = r4 & 48
            r5 = 32
            if (r4 != r5) goto L726
            r4 = 1
            goto L727
        L726:
            r4 = 0
        L727:
            java.lang.String r5 = "message_bubble_separate_dark_mode"
            r6 = 0
            boolean r5 = r9.getBoolean(r5, r6)
            ba.a r6 = ba.m.v(r0, r11)
            ba.a r7 = ba.a.f548k
            if (r6 != r7) goto L73d
        L736:
            r25 = r1
            r26 = r3
        L73a:
            r1 = 0
            goto L7ba
        L73d:
            java.lang.Object r9 = tf.m.t1(r1)
            android.view.View r9 = (android.view.View) r9
            int r12 = r10.getWidth()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            if (r12 <= 0) goto L74f
            r12 = 1
            goto L750
        L74f:
            r12 = 0
        L750:
            if (r12 == 0) goto L753
            goto L754
        L753:
            r13 = 0
        L754:
            if (r13 == 0) goto L75b
            int r12 = r13.intValue()
            goto L75f
        L75b:
            int r12 = r10.getMeasuredWidth()
        L75f:
            int r13 = r9.getWidth()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            if (r13 <= 0) goto L76b
            r13 = 1
            goto L76c
        L76b:
            r13 = 0
        L76c:
            if (r13 == 0) goto L76f
            goto L770
        L76f:
            r15 = 0
        L770:
            if (r15 == 0) goto L777
            int r13 = r15.intValue()
            goto L77b
        L777:
            int r13 = r9.getMeasuredWidth()
        L77b:
            if (r12 <= 0) goto L736
            if (r13 > 0) goto L780
            goto L736
        L780:
            r25 = r1
            r15 = 2
            int[] r1 = new int[r15]
            r26 = r3
            int[] r3 = new int[r15]
            r10.getLocationOnScreen(r1)
            r9.getLocationOnScreen(r3)
            r17 = 0
            r1 = r1[r17]
            float r1 = (float) r1
            float r9 = (float) r12
            r12 = 1073741824(0x40000000, float:2.0)
            float r15 = r9 / r12
            float r15 = r15 + r1
            r1 = r3[r17]
            float r1 = (float) r1
            float r3 = (float) r13
            float r3 = r3 / r12
            float r3 = r3 + r1
            float r1 = r3 - r15
            float r1 = java.lang.Math.abs(r1)
            r12 = 1034147594(0x3da3d70a, float:0.08)
            float r9 = r9 * r12
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 >= 0) goto L7af
            goto L73a
        L7af:
            int r1 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r1 <= 0) goto L7b5
            r1 = 1
            goto L7b6
        L7b5:
            r1 = 0
        L7b6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L7ba:
            ba.a r3 = ba.a.f545h
            if (r6 != r3) goto L7fa
            if (r0 != 0) goto L7fa
            if (r1 != 0) goto L7fa
            boolean r9 = r25.isEmpty()
            if (r9 == 0) goto L7ca
        L7c8:
            r9 = 0
            goto L7f7
        L7ca:
            java.util.Iterator r9 = r25.iterator()
        L7ce:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L7c8
            java.lang.Object r12 = r9.next()
            android.view.View r12 = (android.view.View) r12
            int r12 = r12.getId()
            java.util.Map r13 = r8.g()
            java.lang.Object r13 = r13.get(r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 != 0) goto L7eb
            goto L7f3
        L7eb:
            int r13 = r13.intValue()
            if (r12 != r13) goto L7f3
            r12 = 1
            goto L7f4
        L7f3:
            r12 = 0
        L7f4:
            if (r12 == 0) goto L7ce
            r9 = 1
        L7f7:
            if (r9 == 0) goto L7fa
            r6 = r7
        L7fa:
            if (r6 != r7) goto L7fe
            r1 = 0
            goto L80b
        L7fe:
            if (r26 == 0) goto L805
            boolean r1 = r26.booleanValue()
            goto L80b
        L805:
            if (r1 == 0) goto Lb89
            boolean r1 = r1.booleanValue()
        L80b:
            android.content.SharedPreferences r7 = r8.f596c
            java.lang.String r9 = "message_text_color_enable"
            r12 = 0
            boolean r7 = r7.getBoolean(r9, r12)
            if (r7 == 0) goto L881
            if (r0 == 0) goto L842
            int r7 = r0.intValue()
            if (r7 > 0) goto L81f
            goto L835
        L81f:
            r9 = r7 & 255(0xff, float:3.57E-43)
            r12 = r7 & r34
            int r13 = r7 >>> 16
            if (r13 != 0) goto L828
            goto L835
        L828:
            r13 = 10000(0x2710, float:1.4013E-41)
            if (r12 == r13) goto L837
            r13 = 10002(0x2712, float:1.4016E-41)
            if (r12 == r13) goto L837
            if (r9 == 0) goto L835
            if (r12 != r9) goto L835
            r7 = r9
        L835:
            r9 = 1
            goto L839
        L837:
            r7 = r12
            goto L835
        L839:
            if (r7 != r9) goto L83d
            r7 = r9
            goto L83e
        L83d:
            r7 = 0
        L83e:
            if (r7 != r9) goto L842
            r7 = 1
            goto L843
        L842:
            r7 = 0
        L843:
            if (r7 != 0) goto L87f
            if (r0 == 0) goto L874
            int r7 = r0.intValue()
            if (r7 > 0) goto L84e
            goto L864
        L84e:
            r9 = r7 & 255(0xff, float:3.57E-43)
            r12 = r7 & r34
            int r13 = r7 >>> 16
            if (r13 != 0) goto L857
            goto L864
        L857:
            r13 = 10000(0x2710, float:1.4013E-41)
            if (r12 == r13) goto L867
            r13 = 10002(0x2712, float:1.4016E-41)
            if (r12 == r13) goto L867
            if (r9 == 0) goto L864
            if (r12 != r9) goto L864
            r7 = r9
        L864:
            r9 = 34
            goto L869
        L867:
            r7 = r12
            goto L864
        L869:
            if (r7 != r9) goto L86e
            r7 = 1
        L86c:
            r9 = 1
            goto L870
        L86e:
            r7 = 0
            goto L86c
        L870:
            if (r7 != r9) goto L874
            r7 = 1
            goto L875
        L874:
            r7 = 0
        L875:
            if (r7 != 0) goto L87f
            if (r24 != 0) goto L87f
            boolean r7 = ba.m.k(r0, r11)
            if (r7 == 0) goto L881
        L87f:
            r7 = 1
            goto L882
        L881:
            r7 = 0
        L882:
            if (r6 != r3) goto L889
            if (r7 != 0) goto L887
            goto L889
        L887:
            r3 = 0
            goto L88a
        L889:
            r3 = 1
        L88a:
            if (r0 == 0) goto L8b9
            int r0 = r0.intValue()
            if (r0 > 0) goto L893
            goto L8a9
        L893:
            r7 = r0 & 255(0xff, float:3.57E-43)
            r9 = r0 & r34
            int r11 = r0 >>> 16
            if (r11 != 0) goto L89c
            goto L8a9
        L89c:
            r13 = 10000(0x2710, float:1.4013E-41)
            if (r9 == r13) goto L8ac
            r13 = 10002(0x2712, float:1.4016E-41)
            if (r9 == r13) goto L8ac
            if (r7 == 0) goto L8a9
            if (r9 != r7) goto L8a9
            r0 = r7
        L8a9:
            r9 = 34
            goto L8ae
        L8ac:
            r0 = r9
            goto L8a9
        L8ae:
            if (r0 != r9) goto L8b3
            r0 = 1
        L8b1:
            r9 = 1
            goto L8b5
        L8b3:
            r0 = 0
            goto L8b1
        L8b5:
            if (r0 != r9) goto L8b9
            r0 = 1
            goto L8ba
        L8b9:
            r0 = 0
        L8ba:
            if (r0 == 0) goto L8f4
            java.util.Map r0 = r8.g()
            java.lang.Object r0 = r0.get(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L8f4
            int r7 = r0.intValue()
            java.util.Map r2 = r8.i(r2)
            java.lang.Object r0 = r2.get(r0)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L8d9
            goto L8df
        L8d9:
            android.view.View r0 = r10.findViewById(r7)
            if (r0 == 0) goto L8f4
        L8df:
            boolean r2 = ba.m.o(r0, r10)
            if (r2 != 0) goto L8e6
            goto L8f4
        L8e6:
            ba.l r0 = ba.m.y(r0)
            if (r0 == 0) goto L8f1
            java.util.List r0 = a.a.x0(r0)
            goto L8f2
        L8f1:
            r0 = 0
        L8f2:
            if (r0 != 0) goto L8f6
        L8f4:
            r0 = r19
        L8f6:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r7 = r25.size()
            r2.<init>(r7)
            java.util.Iterator r7 = r25.iterator()
            r9 = 0
        L904:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Lb7d
            java.lang.Object r11 = r7.next()
            android.view.View r11 = (android.view.View) r11
            android.content.Context r12 = r11.getContext()
            r12.getClass()
            if (r4 == 0) goto L91d
            if (r5 == 0) goto L91d
            r13 = 1
            goto L91e
        L91d:
            r13 = 0
        L91e:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            a2.a r18 = ba.n.f608l
            r18.getClass()
            r34 = r0
            ba.n r0 = a2.a.E(r6, r1, r13)
            boolean r20 = r15.contains(r0)
            if (r20 != 0) goto L937
            r15.add(r0)
        L937:
            if (r13 == 0) goto L94a
            r18.getClass()
            r0 = 0
            ba.n r13 = a2.a.E(r6, r1, r0)
            boolean r0 = r15.contains(r13)
            if (r0 != 0) goto L94a
            r15.add(r13)
        L94a:
            java.util.Iterator r0 = r15.iterator()
        L94e:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L98d
            java.lang.Object r13 = r0.next()
            ba.n r13 = (ba.n) r13
            ba.r r15 = ba.r.f632a
            r13.getClass()
            ba.r r15 = ba.r.f632a
            ba.o r15 = r15.e(r12, r13)
            r18 = r0
            if (r15 == 0) goto L979
            ba.q r0 = new ba.q
            r20 = r1
            android.graphics.Bitmap r1 = r15.f619a
            r22 = r3
            byte[] r3 = r15.f620b
            android.graphics.Rect r15 = r15.f621c
            r0.<init>(r1, r3, r15)
            goto L97e
        L979:
            r20 = r1
            r22 = r3
            r0 = 0
        L97e:
            if (r0 == 0) goto L986
            ba.i r1 = new ba.i
            r1.<init>(r0, r13)
            goto L992
        L986:
            r0 = r18
            r1 = r20
            r3 = r22
            goto L94e
        L98d:
            r20 = r1
            r22 = r3
            r1 = 0
        L992:
            if (r1 == 0) goto Lb6f
            if (r9 != 0) goto L999
            r0 = r34
            goto L99b
        L999:
            r0 = r19
        L99b:
            ba.q r3 = r1.f569a
            ba.n r1 = r1.f570b
            if (r22 == 0) goto L9b7
            android.content.Context r12 = r11.getContext()
            r12.getClass()
            ba.r r13 = ba.r.f632a
            ba.o r1 = r13.e(r12, r1)
            if (r1 == 0) goto L9b7
            int r1 = r1.f622d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L9b8
        L9b7:
            r1 = 0
        L9b8:
            if (r1 == 0) goto La99
            int r12 = r1.intValue()
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            ba.m.b(r8, r11, r15, r11)
            r18 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r31 = r1
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r1 = r15.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L9e0:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto La0b
            java.lang.Object r15 = r1.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            java.lang.Object r24 = r15.getKey()
            r25 = r1
            r1 = r24
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r15 = r15.getValue()
            android.view.View r15 = (android.view.View) r15
            r32 = r4
            ba.l r4 = new ba.l
            r4.<init>(r15, r1)
            r0.add(r4)
            r1 = r25
            r4 = r32
            goto L9e0
        La0b:
            r32 = r4
            java.util.Iterator r0 = r0.iterator()
        La11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La23
            java.lang.Object r1 = r0.next()
            ba.l r1 = (ba.l) r1
            android.widget.TextView r4 = r1.f584b
            r13.putIfAbsent(r4, r1)
            goto La11
        La23:
            java.util.Iterator r0 = r18.iterator()
        La27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La39
            java.lang.Object r1 = r0.next()
            ba.l r1 = (ba.l) r1
            android.widget.TextView r4 = r1.f584b
            r13.putIfAbsent(r4, r1)
            goto La27
        La39:
            java.util.Collection r0 = r13.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        La4b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Laa0
            java.lang.Object r4 = r0.next()
            ba.l r4 = (ba.l) r4
            r4.getClass()
            android.widget.TextView r13 = r4.f584b
            int r15 = r13.getCurrentTextColor()
            boolean r28 = ba.m.h(r15, r12)
            android.content.res.ColorStateList r15 = r13.getLinkTextColors()
            int r15 = r15.getDefaultColor()
            boolean r29 = ba.m.h(r15, r12)
            if (r28 != 0) goto La78
            if (r29 != 0) goto La78
            r30 = r12
            r4 = 0
            goto La91
        La78:
            ba.k r24 = new ba.k
            android.content.res.ColorStateList r26 = r13.getTextColors()
            r26.getClass()
            android.content.res.ColorStateList r27 = r13.getLinkTextColors()
            r27.getClass()
            r25 = r4
            r30 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r4 = r24
        La91:
            if (r4 == 0) goto La96
            r1.add(r4)
        La96:
            r12 = r30
            goto La4b
        La99:
            r18 = r0
            r31 = r1
            r32 = r4
            r1 = 0
        Laa0:
            if (r1 != 0) goto Laa5
            r30 = r19
            goto Laa7
        Laa5:
            r30 = r1
        Laa7:
            ba.j r24 = new ba.j
            android.graphics.drawable.Drawable r25 = r11.getBackground()
            int r26 = r11.getPaddingLeft()
            int r27 = r11.getPaddingTop()
            int r28 = r11.getPaddingRight()
            int r29 = r11.getPaddingBottom()
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r0 = r24
            r1 = r26
            r4 = r27
            r12 = r28
            r13 = r29
            r15 = 2131099709(0x7f06003d, float:1.7811779E38)
            r11.setTag(r15, r0)
            r11.setBackground(r3)
            java.util.Map r0 = r8.g()
            java.lang.Object r0 = r0.get(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lb18
            int r15 = r11.getId()
            int r0 = r0.intValue()
            if (r15 != r0) goto Lb18
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r3 = r3.getPadding(r0)
            if (r3 == 0) goto Lafd
            int r3 = r0.left
            int r15 = r0.right
            int r3 = r3 + r15
            if (r3 <= 0) goto Lafd
            r3 = 1
            goto Lafe
        Lafd:
            r3 = 0
        Lafe:
            if (r3 == 0) goto Lb05
            int r15 = r0.left
            r23 = 2
            goto Lb0b
        Lb05:
            int r26 = r1 + r12
            r23 = 2
            int r15 = r26 / 2
        Lb0b:
            if (r3 == 0) goto Lb10
            int r0 = r0.right
            goto Lb14
        Lb10:
            int r26 = r1 + r12
            int r0 = r26 - r15
        Lb14:
            r11.setPadding(r15, r4, r0, r13)
            goto Lb1d
        Lb18:
            r23 = 2
            r11.setPadding(r1, r4, r12, r13)
        Lb1d:
            if (r31 == 0) goto Lb61
            int r0 = r31.intValue()
            java.util.Iterator r1 = r30.iterator()
        Lb27:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb61
            java.lang.Object r3 = r1.next()
            ba.k r3 = (ba.k) r3
            ba.l r4 = r3.f577a
            android.widget.TextView r12 = r4.f584b
            android.view.View r4 = r4.f583a
            boolean r13 = r3.f580d
            if (r13 == 0) goto Lb53
            boolean r13 = ba.m.l(r4)
            if (r13 == 0) goto Lb50
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r15 = "setTextColor"
            h.Hchat.utils.KavaReflector.invokeMethod(r4, r15, r13)
        Lb50:
            r12.setTextColor(r0)
        Lb53:
            boolean r3 = r3.f581e
            if (r3 == 0) goto Lb5a
            r12.setLinkTextColor(r0)
        Lb5a:
            r12.invalidate()
            r4.invalidate()
            goto Lb27
        Lb61:
            r11.invalidate()
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto Lb6b
            r9 = 1
        Lb6b:
            r2.add(r11)
            goto Lb73
        Lb6f:
            r32 = r4
            r23 = 2
        Lb73:
            r0 = r34
            r1 = r20
            r3 = r22
            r4 = r32
            goto L904
        Lb7d:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb89
            r0 = 2131099710(0x7f06003e, float:1.781178E38)
            r10.setTag(r0, r2)
        Lb89:
            return
        Lb8a:
            r25 = r6
            r0.getClass()
            b9.f r8 = (b9.f) r8
            java.lang.Object[] r0 = r0.args
            java.util.Map r1 = r8.f538b
            android.content.SharedPreferences r2 = r8.f539c
            java.lang.String r3 = "chat_time_mode"
            java.lang.String r4 = "original"
            java.lang.String r2 = r2.getString(r3, r4)
            java.lang.String r3 = "custom"
            boolean r5 = gg.l.a(r2, r3)
            if (r5 == 0) goto Lba8
            goto Lbb2
        Lba8:
            java.lang.String r3 = "hidden"
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto Lbb1
            goto Lbb2
        Lbb1:
            r3 = r4
        Lbb2:
            if (r0 == 0) goto Lbd9
            r5 = 0
            java.lang.Object r2 = tf.l.C0(r5, r0)
            if (r2 == 0) goto Lbc6
            android.view.View r5 = r8.e(r2)
            if (r5 == 0) goto Lbc2
            goto Lbc3
        Lbc2:
            r2 = 0
        Lbc3:
            if (r2 == 0) goto Lbc6
            goto Lbda
        Lbc6:
            int r2 = r0.length
            r5 = 0
        Lbc8:
            if (r5 >= r2) goto Lbd9
            r6 = r0[r5]
            if (r6 == 0) goto Lbd6
            android.view.View r7 = r8.e(r6)
            if (r7 == 0) goto Lbd6
            r2 = r6
            goto Lbda
        Lbd6:
            int r5 = r5 + 1
            goto Lbc8
        Lbd9:
            r2 = 0
        Lbda:
            if (r2 == 0) goto Lc69
            android.view.View r5 = r8.e(r2)
            if (r5 == 0) goto Lc69
            java.lang.Object r5 = r5.getTag()
            if (r5 == 0) goto Lbe9
            goto Lbea
        Lbe9:
            r5 = r2
        Lbea:
            android.widget.TextView r5 = r8.f(r5)
            if (r5 == 0) goto Lbf1
            goto Lbf7
        Lbf1:
            android.widget.TextView r5 = r8.f(r2)
            if (r5 == 0) goto Lc69
        Lbf7:
            boolean r2 = r3.equals(r4)
            if (r2 == 0) goto Lc01
            r1.remove(r5)
            goto Lc69
        Lc01:
            if (r0 == 0) goto Lc09
            r9 = 1
            java.lang.Object r2 = tf.l.C0(r9, r0)
            goto Lc0a
        Lc09:
            r2 = 0
        Lc0a:
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            r4.getClass()
            java.util.Set r4 = (java.util.Set) r4
            r6 = 0
            java.lang.Object r2 = b9.f.l(r6, r2, r4)
            if (r2 == 0) goto Lc24
            long r6 = b9.f.j(r2)
            goto Lc3f
        Lc24:
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)
            r2.getClass()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r0 = b9.f.l(r6, r0, r2)
            if (r0 == 0) goto Lc3d
            long r6 = b9.f.j(r0)
            goto Lc3f
        Lc3d:
            r6 = 0
        Lc3f:
            b9.d r0 = new b9.d
            java.lang.CharSequence r2 = r5.getText()
            if (r2 == 0) goto Lc4e
            java.lang.String r2 = r2.toString()
            r16 = r2
            goto Lc50
        Lc4e:
            r16 = 0
        Lc50:
            if (r16 != 0) goto Lc55
            r2 = r25
            goto Lc57
        Lc55:
            r2 = r16
        Lc57:
            int r4 = r5.getVisibility()
            r0.<init>(r4, r2, r6)
            r1.getClass()
            java.util.Map r1 = (java.util.Map) r1
            r1.put(r5, r0)
            r8.a(r5, r0, r3)
        Lc69:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r23) {
            r22 = this;
            r1 = r22
            r2 = r23
            int r0 = r1.f535a
            r3 = 5
            r4 = 2
            r5 = 3
            r6 = 1
            r7 = 0
            r8 = 0
            switch(r0) {
                case 1: goto L85d;
                case 2: goto Lf;
                case 3: goto Lf;
                case 4: goto Lf;
                case 5: goto Lf;
                case 6: goto Lf;
                case 7: goto L830;
                case 8: goto L821;
                case 9: goto L65c;
                case 10: goto L63c;
                case 11: goto Lf;
                case 12: goto L592;
                case 13: goto L553;
                case 14: goto Lf;
                case 15: goto L51d;
                case 16: goto L3e4;
                case 17: goto L3cb;
                case 18: goto Lf;
                case 19: goto L30e;
                case 20: goto L153;
                case 21: goto Lf;
                case 22: goto L13c;
                case 23: goto Lf;
                case 24: goto Lcb;
                case 25: goto L5d;
                case 26: goto Lf;
                case 27: goto Lf;
                case 28: goto L17;
                case 29: goto L13;
                default: goto Lf;
            }
        Lf:
            super.beforeHookedMethod(r23)
            return
        L13:
            r22.k(r23)
            return
        L17:
            r2.getClass()
            java.lang.Object r0 = r1.f536b
            w8.a r0 = (w8.a) r0
            android.content.SharedPreferences r0 = r0.f14887b
            java.lang.String r3 = "auto_original_image_enable"
            boolean r0 = r0.getBoolean(r3, r8)
            if (r0 != 0) goto L29
            goto L5c
        L29:
            java.lang.Object r0 = r2.thisObject
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L32
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
        L32:
            if (r7 == 0) goto L5c
            android.content.Intent r0 = r7.getIntent()
            r0.getClass()
            java.lang.String r2 = "query_source_type"
            int r2 = r0.getIntExtra(r2, r5)
            if (r2 != r5) goto L5c
            java.lang.String r2 = "GalleryUI_ToUser"
            java.lang.String r2 = r0.getStringExtra(r2)
            if (r2 == 0) goto L5c
            boolean r2 = og.m.t0(r2)
            if (r2 == 0) goto L52
            goto L5c
        L52:
            java.lang.String r2 = "key_send_raw_image"
            r0.putExtra(r2, r6)
            java.lang.String r2 = "send_raw_img"
            r0.putExtra(r2, r6)
        L5c:
            return
        L5d:
            r2.getClass()
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto Lca
            int r3 = r0.length
            if (r3 == r5) goto L69
            goto Lca
        L69:
            java.lang.Object r3 = r1.f536b
            rb.c r3 = (rb.c) r3
            rb.k r10 = r3.f11874b
            java.lang.Object r2 = r2.thisObject
            r2.getClass()
            r3 = r0[r8]
            boolean r5 = r3 instanceof java.lang.Number
            if (r5 == 0) goto L7d
            java.lang.Number r3 = (java.lang.Number) r3
            goto L7e
        L7d:
            r3 = r7
        L7e:
            if (r3 == 0) goto Lca
            int r12 = r3.intValue()
            r3 = r0[r6]
            if (r3 == 0) goto L8d
            java.lang.String r3 = r3.toString()
            goto L8e
        L8d:
            r3 = r7
        L8e:
            if (r3 != 0) goto L92
            java.lang.String r3 = ""
        L92:
            r13 = r3
            r0 = r0[r4]
            boolean r3 = r0 instanceof org.json.JSONObject
            if (r3 == 0) goto L9d
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            r14 = r0
            goto L9e
        L9d:
            r14 = r7
        L9e:
            java.lang.Object r3 = r10.f11907d
            monitor-enter(r3)
            rb.h r11 = r10.f11920q     // Catch: java.lang.Throwable -> Lb2
            if (r11 == 0) goto Lc6
            java.lang.Object r0 = r11.f11898b     // Catch: java.lang.Throwable -> Lb2
            if (r0 == r2) goto Laa
            goto Lc6
        Laa:
            java.util.concurrent.ScheduledFuture r0 = r11.f11899c     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto Lb4
            r0.cancel(r8)     // Catch: java.lang.Throwable -> Lb2
            goto Lb4
        Lb2:
            r0 = move-exception
            goto Lc8
        Lb4:
            r10.f11920q = r7     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = ""
            r10.f11918o = r0     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r3)
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r10.f11908e
            lb.a r9 = new lb.a
            r9.<init>(r10, r11, r12, r13, r14)
            r0.execute(r9)
            goto Lca
        Lc6:
            monitor-exit(r3)
            goto Lca
        Lc8:
            monitor-exit(r3)
            throw r0
        Lca:
            return
        Lcb:
            r2.getClass()
            java.lang.Object r0 = r1.f536b
            r3 = r0
            r9.d0 r3 = (r9.d0) r3
            java.lang.ThreadLocal r4 = r3.A
            java.lang.Object[] r0 = r2.args     // Catch: java.lang.Throwable -> L10b
            java.lang.Object r0 = r3.V(r0)     // Catch: java.lang.Throwable -> L10b
            if (r0 == 0) goto L105
            android.view.View r0 = r3.u(r0)     // Catch: java.lang.Throwable -> L10b
            if (r0 == 0) goto Lff
            java.lang.Object r2 = r0.getTag()     // Catch: java.lang.Throwable -> L10b
            if (r2 == 0) goto Lf8
            java.util.concurrent.ConcurrentHashMap r5 = r3.f11663k     // Catch: java.lang.Throwable -> L10b
            android.widget.TextView r5 = r9.d0.p(r2, r5)     // Catch: java.lang.Throwable -> L10b
            if (r5 == 0) goto Lf5
            boolean r8 = r9.d0.P(r5, r0)     // Catch: java.lang.Throwable -> L10b
        Lf5:
            if (r8 == 0) goto Lf8
            goto Lf9
        Lf8:
            r2 = r7
        Lf9:
            r9.x r0 = new r9.x     // Catch: java.lang.Throwable -> L10b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10b
            goto L112
        Lff:
            r9.x r0 = new r9.x     // Catch: java.lang.Throwable -> L10b
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L10b
            goto L112
        L105:
            r9.x r0 = new r9.x     // Catch: java.lang.Throwable -> L10b
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L10b
            goto L112
        L10b:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L112:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 != 0) goto L119
            goto L125
        L119:
            ia.t r0 = r3.f11654b
            java.lang.String r3 = "消息显示时间绑定前状态读取失败"
            r0.invoke(r3, r2)
            r9.x r0 = new r9.x
            r0.<init>(r7)
        L125:
            r9.x r0 = (r9.x) r0
            java.lang.Object r2 = r4.get()
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2
            if (r2 == 0) goto L130
            goto L138
        L130:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r4.set(r2)
        L138:
            r2.addLast(r0)
            return
        L13c:
            r2.getClass()
            java.lang.Object r0 = r1.f536b
            cb.f r0 = (cb.f) r0
            java.lang.Object r0 = r0.f1623d
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r3 = "block_typing_report_enable"
            boolean r0 = r0.getBoolean(r3, r8)
            if (r0 == 0) goto L152
            r2.setResult(r7)
        L152:
            return
        L153:
            java.lang.String r0 = "message"
            java.lang.Object r3 = r1.f536b
            oa.a r3 = (oa.a) r3
            java.lang.Object r5 = r3.f9706f
            na.b r5 = (na.b) r5
            java.lang.Object[] r9 = r2.args
            if (r9 != 0) goto L162
            goto L172
        L162:
            int r10 = r9.length
            r11 = r8
        L164:
            if (r11 >= r10) goto L172
            r12 = r9[r11]
            boolean r13 = r12 instanceof android.content.ContentValues
            if (r13 == 0) goto L16f
            android.content.ContentValues r12 = (android.content.ContentValues) r12
            goto L173
        L16f:
            int r11 = r11 + 1
            goto L164
        L172:
            r12 = r7
        L173:
            if (r12 != 0) goto L177
            goto L30d
        L177:
            java.lang.Object[] r2 = r2.args
            if (r2 != 0) goto L17c
            goto L1ae
        L17c:
            int r9 = r2.length     // Catch: java.lang.Throwable -> L1ae
            if (r9 <= 0) goto L18a
            r9 = r2[r8]     // Catch: java.lang.Throwable -> L1ae
            boolean r10 = r9 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1ae
            if (r10 == 0) goto L18a
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L1ae
            goto L1ae
        L18a:
            int r9 = r2.length     // Catch: java.lang.Throwable -> L1ae
            r10 = r8
        L18c:
            if (r10 >= r9) goto L1ae
            r11 = r2[r10]     // Catch: java.lang.Throwable -> L1ae
            boolean r13 = r11 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1ae
            if (r13 != 0) goto L195
            goto L1aa
        L195:
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L1ae
            java.lang.String r13 = r11.toLowerCase()     // Catch: java.lang.Throwable -> L1ae
            boolean r14 = r0.equals(r13)     // Catch: java.lang.Throwable -> L1ae
            if (r14 != 0) goto L1ad
            boolean r13 = r13.contains(r0)     // Catch: java.lang.Throwable -> L1ae
            if (r13 == 0) goto L1aa
            goto L1ad
        L1aa:
            int r10 = r10 + 1
            goto L18c
        L1ad:
            r7 = r11
        L1ae:
            java.lang.String r2 = "nativeurl"
            java.lang.String r9 = ":\n"
            java.lang.String r10 = "数据库兜底红包: talker="
            l3.l r11 = r3.f9701a
            boolean r11 = r11.e()
            if (r11 == 0) goto L30d
            boolean r11 = android.text.TextUtils.isEmpty(r7)
            if (r11 == 0) goto L1c3
            goto L1d9
        L1c3:
            java.lang.String r7 = r7.toLowerCase()
            boolean r11 = r0.equals(r7)
            if (r11 != 0) goto L1d9
            boolean r11 = r7.endsWith(r0)
            if (r11 != 0) goto L1d9
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L30d
        L1d9:
            pa.a.a(r12)     // Catch: java.lang.Throwable -> L1ef
            java.lang.String r0 = "content"
            java.lang.String r0 = oa.a.a(r12, r0)     // Catch: java.lang.Throwable -> L1ef
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ef
            if (r7 == 0) goto L1f2
            java.lang.String r0 = "msgContent"
            java.lang.String r0 = oa.a.a(r12, r0)     // Catch: java.lang.Throwable -> L1ef
            goto L1f2
        L1ef:
            r0 = move-exception
            goto L2f6
        L1f2:
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ef
            if (r7 != 0) goto L30d
            java.lang.String r7 = "<wcpayinfo>"
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L1ef
            if (r7 != 0) goto L202
            goto L30d
        L202:
            java.util.regex.Pattern r7 = oa.b.f9707a     // Catch: java.lang.Throwable -> L1ef
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ef
            if (r7 != 0) goto L30d
            java.lang.String r7 = "receivehongbao"
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L1ef
            if (r7 != 0) goto L222
            java.lang.String r7 = "wxhb_personalreceive"
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L1ef
            if (r7 != 0) goto L222
            java.lang.String r7 = "<nativeurl>"
            boolean r7 = r0.contains(r7)     // Catch: java.lang.Throwable -> L1ef
            if (r7 == 0) goto L30d
        L222:
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1ef
            if (r7 == 0) goto L22a
        L228:
            r4 = r0
            goto L23d
        L22a:
            int r7 = r0.indexOf(r9)     // Catch: java.lang.Throwable -> L1ef
            if (r7 <= 0) goto L228
            java.lang.String r11 = "<"
            int r11 = r0.indexOf(r11)     // Catch: java.lang.Throwable -> L1ef
            if (r11 <= r7) goto L228
            int r7 = r7 + r4
            java.lang.String r4 = r0.substring(r7)     // Catch: java.lang.Throwable -> L1ef
        L23d:
            java.lang.String r7 = oa.b.e(r4, r2)     // Catch: java.lang.Throwable -> L1ef
            boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L1ef
            if (r11 == 0) goto L24b
            java.lang.String r7 = oa.b.e(r0, r2)     // Catch: java.lang.Throwable -> L1ef
        L24b:
            r11 = r7
            boolean r2 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L1ef
            if (r2 == 0) goto L254
            goto L30d
        L254:
            java.lang.String r2 = "talker"
            java.lang.String r2 = oa.a.a(r12, r2)     // Catch: java.lang.Throwable -> L1ef
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1ef
            if (r7 == 0) goto L266
            java.lang.String r2 = "username"
            java.lang.String r2 = oa.a.a(r12, r2)     // Catch: java.lang.Throwable -> L1ef
        L266:
            java.lang.String r7 = "sendTalker"
            java.lang.String r7 = oa.a.a(r12, r7)     // Catch: java.lang.Throwable -> L1ef
            boolean r13 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L1ef
            if (r13 == 0) goto L27c
            int r9 = r0.indexOf(r9)     // Catch: java.lang.Throwable -> L1ef
            if (r9 <= 0) goto L27c
            java.lang.String r7 = r0.substring(r8, r9)     // Catch: java.lang.Throwable -> L1ef
        L27c:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L1ef
            if (r0 == 0) goto L2b3
            java.lang.String r0 = "isSend"
            java.lang.Object r0 = r12.get(r0)     // Catch: java.lang.Throwable -> L2a4
            boolean r7 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L2a4
            if (r7 == 0) goto L293
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L2a4
            int r8 = r0.intValue()     // Catch: java.lang.Throwable -> L2a4
            goto L2a4
        L293:
            if (r0 == 0) goto L2a4
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L2a4
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2a4
            if (r7 == 0) goto L2a0
            goto L2a4
        L2a0:
            int r8 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L2a4
        L2a4:
            java.lang.Object r0 = r3.f9704d     // Catch: java.lang.Throwable -> L1ef
            na.b r0 = (na.b) r0     // Catch: java.lang.Throwable -> L1ef
            na.e r0 = r0.f9099h     // Catch: java.lang.Throwable -> L1ef
            java.lang.String r0 = r0.a()     // Catch: java.lang.Throwable -> L1ef
            if (r8 != r6) goto L2b2
            r7 = r0
            goto L2b3
        L2b2:
            r7 = r2
        L2b3:
            r9 = r7
            boolean r0 = oa.b.f(r2)     // Catch: java.lang.Throwable -> L1ef
            if (r0 == 0) goto L2bb
            goto L2c9
        L2bb:
            boolean r0 = oa.b.f(r9)     // Catch: java.lang.Throwable -> L1ef
            if (r0 == 0) goto L2c2
            goto L2c8
        L2c2:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L1ef
            if (r0 == 0) goto L2c9
        L2c8:
            r2 = r9
        L2c9:
            java.lang.String r0 = "exclusive_recv_username"
            java.lang.String r12 = oa.b.e(r4, r0)     // Catch: java.lang.Throwable -> L1ef
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ef
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L1ef
            r0.append(r2)     // Catch: java.lang.Throwable -> L1ef
            java.lang.String r6 = " sender="
            r0.append(r6)     // Catch: java.lang.Throwable -> L1ef
            r0.append(r9)     // Catch: java.lang.Throwable -> L1ef
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1ef
            na.e r6 = r5.f9099h     // Catch: java.lang.Throwable -> L1ef
            r6.d(r0)     // Catch: java.lang.Throwable -> L1ef
            java.lang.Object r0 = r3.f9705e     // Catch: java.lang.Throwable -> L1ef
            na.b r0 = (na.b) r0     // Catch: java.lang.Throwable -> L1ef
            java.lang.String r7 = "数据库兜底"
            na.e r6 = r0.f9099h     // Catch: java.lang.Throwable -> L1ef
            r10 = r2
            r8 = r4
            r6.e(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1ef
            goto L30d
        L2f6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ERROR 数据库兜底处理失败: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            na.e r2 = r5.f9099h
            r2.d(r0)
        L30d:
            return
        L30e:
            r2.getClass()
            java.lang.Object[] r0 = r2.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r8, r0)
            boolean r3 = r0 instanceof android.view.KeyEvent
            if (r3 == 0) goto L321
            r7 = r0
            android.view.KeyEvent r7 = (android.view.KeyEvent) r7
        L321:
            if (r7 == 0) goto L3ca
            java.lang.Object r0 = r1.f536b
            b9.a r0 = (b9.a) r0
            java.lang.Object r0 = r0.f524f
            nb.w r0 = (nb.w) r0
            if (r0 == 0) goto L3ca
            android.os.Handler r3 = r0.f9312b
            int r4 = r7.getKeyCode()
            r5 = 24
            r9 = 25
            if (r4 == r9) goto L341
            int r4 = r7.getKeyCode()
            if (r4 == r5) goto L341
            goto L3ca
        L341:
            int r4 = r7.getAction()
            if (r4 != r6) goto L353
            int r4 = r0.f9330t
            int r6 = r7.getKeyCode()
            if (r4 != r6) goto L353
            r0.f9330t = r8
            goto L3c5
        L353:
            int r4 = r7.getAction()
            if (r4 == 0) goto L35b
            goto L3ca
        L35b:
            int r4 = r0.f9330t
            int r6 = r7.getKeyCode()
            if (r4 != r6) goto L36a
            int r4 = r7.getRepeatCount()
            if (r4 <= 0) goto L36a
            goto L3c5
        L36a:
            int r4 = r7.getRepeatCount()
            if (r4 != 0) goto L372
            r0.f9330t = r8
        L372:
            int r4 = r7.getRepeatCount()
            if (r4 == 0) goto L379
            goto L3ca
        L379:
            nb.z r4 = r0.y()
            java.lang.String r6 = "text_speech_enable"
            boolean r6 = r4.b(r6)
            if (r6 == 0) goto L3ca
            java.lang.String r6 = "text_speech_volume_control"
            boolean r4 = r4.b(r6)
            if (r4 != 0) goto L38e
            goto L3ca
        L38e:
            nb.l r4 = r0.f9325o
            if (r4 != 0) goto L397
            boolean r4 = r0.f9328r
            if (r4 != 0) goto L397
            goto L3ca
        L397:
            int r4 = r7.getKeyCode()
            if (r4 == r5) goto L3b0
            if (r4 == r9) goto L3a0
            goto L3ca
        L3a0:
            int r4 = r7.getKeyCode()
            r0.f9330t = r4
            nb.e r4 = new nb.e
            r5 = 7
            r4.<init>(r0, r5)
            r3.post(r4)
            goto L3c5
        L3b0:
            boolean r4 = r0.f9328r
            if (r4 != 0) goto L3b5
            goto L3ca
        L3b5:
            int r4 = r7.getKeyCode()
            r0.f9330t = r4
            nb.e r4 = new nb.e
            r5 = 8
            r4.<init>(r0, r5)
            r3.post(r4)
        L3c5:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.setResult(r0)
        L3ca:
            return
        L3cb:
            r2.getClass()
            java.lang.Object r0 = r1.f536b
            cb.f r0 = (cb.f) r0
            java.lang.Object r0 = r0.f1623d
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r3 = "disable_pat_enable"
            boolean r0 = r0.getBoolean(r3, r8)
            if (r0 == 0) goto L3e3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.setResult(r0)
        L3e3:
            return
        L3e4:
            java.lang.String r0 = "g"
            java.lang.String r3 = ""
            java.lang.Object[] r2 = r2.args
            if (r2 == 0) goto L51c
            int r4 = r2.length
            if (r4 >= r6) goto L3f1
            goto L51c
        L3f1:
            java.lang.Object r4 = r1.f536b
            k8.k r4 = (k8.k) r4
            r5 = r2[r8]
            int r9 = r2.length
            if (r9 <= r6) goto L3fc
            r7 = r2[r6]
        L3fc:
            java.util.concurrent.ConcurrentHashMap r2 = r4.f7439h
            java.lang.String r9 = "i"
            java.lang.String r10 = ":"
            if (r5 != 0) goto L406
            goto L51c
        L406:
            java.lang.String r11 = "d"
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.readField(r5, r11)     // Catch: java.lang.Throwable -> L4d7
            if (r11 == 0) goto L413
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L4d7
            goto L414
        L413:
            r11 = r3
        L414:
            java.lang.String r12 = "e"
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.readField(r5, r12)     // Catch: java.lang.Throwable -> L4d7
            if (r12 == 0) goto L421
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> L4d7
            goto L422
        L421:
            r12 = r3
        L422:
            java.lang.String r13 = "f"
            java.lang.Object r13 = h.Hchat.utils.KavaReflector.readField(r5, r13)     // Catch: java.lang.Throwable -> L4d7
            if (r13 == 0) goto L42f
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L4d7
            goto L430
        L42f:
            r13 = r3
        L430:
            java.lang.Class r14 = r5.getClass()     // Catch: java.lang.Throwable -> L4d7
            java.lang.reflect.Field r14 = h.Hchat.utils.KavaReflector.findFieldRecursive(r14, r0)     // Catch: java.lang.Throwable -> L4d7
            if (r14 == 0) goto L43c
            r14 = r6
            goto L43d
        L43c:
            r14 = r8
        L43d:
            if (r14 == 0) goto L444
            long r14 = k8.k.e(r5, r0)     // Catch: java.lang.Throwable -> L4d7
            goto L448
        L444:
            long r14 = k8.k.e(r5, r9)     // Catch: java.lang.Throwable -> L4d7
        L448:
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L4d7
            java.lang.reflect.Field r0 = h.Hchat.utils.KavaReflector.findFieldRecursive(r6, r0)     // Catch: java.lang.Throwable -> L4d7
            if (r0 == 0) goto L454
            r6 = 1
            goto L455
        L454:
            r6 = r8
        L455:
            if (r6 == 0) goto L45c
            long r5 = k8.k.e(r5, r9)     // Catch: java.lang.Throwable -> L4d7
            goto L462
        L45c:
            java.lang.String r0 = "n"
            long r5 = k8.k.e(r5, r0)     // Catch: java.lang.Throwable -> L4d7
        L462:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L4d7
            if (r0 != 0) goto L51c
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L4d7
            if (r0 == 0) goto L470
            goto L51c
        L470:
            r16 = 0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            r16 = 300000(0x493e0, double:1.482197E-318)
            if (r0 > 0) goto L47a
            goto L498
        L47a:
            r18 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r0 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r0 <= 0) goto L486
            r18 = r14
            goto L48a
        L486:
            r18 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 * r14
        L48a:
            long r20 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4d7
            long r20 = r20 - r18
            long r18 = java.lang.Math.abs(r20)     // Catch: java.lang.Throwable -> L4d7
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 > 0) goto L51c
        L498:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d7
            r0.<init>()     // Catch: java.lang.Throwable -> L4d7
            r0.append(r11)     // Catch: java.lang.Throwable -> L4d7
            r0.append(r10)     // Catch: java.lang.Throwable -> L4d7
            r0.append(r12)     // Catch: java.lang.Throwable -> L4d7
            r0.append(r10)     // Catch: java.lang.Throwable -> L4d7
            r0.append(r5)     // Catch: java.lang.Throwable -> L4d7
            r0.append(r10)     // Catch: java.lang.Throwable -> L4d7
            r0.append(r14)     // Catch: java.lang.Throwable -> L4d7
            r0.append(r10)     // Catch: java.lang.Throwable -> L4d7
            r0.append(r13)     // Catch: java.lang.Throwable -> L4d7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4d7
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4d7
            java.lang.Long r8 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L4d7
            java.lang.Object r0 = r2.put(r0, r8)     // Catch: java.lang.Throwable -> L4d7
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L4d7
            if (r0 == 0) goto L4d9
            long r19 = r0.longValue()     // Catch: java.lang.Throwable -> L4d7
            long r19 = r9 - r19
            int r0 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r0 >= 0) goto L4d9
            goto L51c
        L4d7:
            r0 = move-exception
            goto L507
        L4d9:
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L4d7
            r8 = 128(0x80, float:1.8E-43)
            if (r0 >= r8) goto L4e2
            goto L4ef
        L4e2:
            java.util.Set r0 = r2.entrySet()     // Catch: java.lang.Throwable -> L4d7
            k8.j r2 = new k8.j     // Catch: java.lang.Throwable -> L4d7
            r8 = 0
            r2.<init>(r9, r8)     // Catch: java.lang.Throwable -> L4d7
            r0.removeIf(r2)     // Catch: java.lang.Throwable -> L4d7
        L4ef:
            boolean r0 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L4d7
            if (r0 == 0) goto L4f6
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L4d7
        L4f6:
            r9 = r3
            f8.c r0 = r4.f7435d     // Catch: java.lang.Throwable -> L4d7
            r7 = r12
            r8 = r13
            r12 = r5
            f8.h r5 = new f8.h     // Catch: java.lang.Throwable -> L4d7
            r6 = r11
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10, r12)     // Catch: java.lang.Throwable -> L4d7
            r0.b(r5)     // Catch: java.lang.Throwable -> L4d7
            goto L51c
        L507:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "派发拍一拍事件失败: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.d(r0)
        L51c:
            return
        L51d:
            r2.getClass()
            java.lang.Object r0 = r1.f536b
            k8.e r0 = (k8.e) r0
            java.lang.ThreadLocal r0 = r0.f7401b
            java.lang.Object r0 = r0.get()
            k8.d r0 = (k8.d) r0
            if (r0 == 0) goto L552
            java.lang.Object[] r3 = r2.args
            if (r3 == 0) goto L552
            r8 = 0
            java.lang.Object r3 = tf.l.C0(r8, r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L53e
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
        L53e:
            if (r7 == 0) goto L552
            java.lang.String r3 = r0.f7398a
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L549
            goto L552
        L549:
            long r3 = r0.f7399b
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.setResult(r0)
        L552:
            return
        L553:
            java.lang.String r0 = "Hchat_fake_voice_duration_config"
            r2.getClass()
            java.lang.Object r4 = r1.f536b
            ea.c r4 = (ea.c) r4
            java.lang.Object r5 = r4.f2482a
            r8.g r5 = (r8.g) r5
            android.content.Context r5 = r5.f11620a
            android.content.SharedPreferences r5 = ub.b.c(r5, r0)
            java.lang.String r6 = "fake_voice_duration_enable"
            r8 = 0
            boolean r5 = r5.getBoolean(r6, r8)
            if (r5 != 0) goto L570
            goto L591
        L570:
            java.lang.Object r4 = r4.f2482a
            r8.g r4 = (r8.g) r4
            android.content.Context r4 = r4.f11620a
            android.content.SharedPreferences r0 = ub.b.c(r4, r0)
            java.lang.String r4 = "fake_voice_duration_seconds"
            int r0 = r0.getInt(r4, r3)
            r3 = 60
            r4 = 1
            int r0 = r9.e0.r(r0, r4, r3)
            int r0 = r0 * 1000
            long r3 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.setResult(r0)
        L591:
            return
        L592:
            r2.getClass()
            java.lang.Object r0 = r1.f536b
            ea.c r0 = (ea.c) r0
            java.lang.Object r0 = r0.f2483b
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r6 = "fake_scan_camera_enable"
            r8 = 0
            boolean r0 = r0.getBoolean(r6, r8)
            if (r0 != 0) goto L5a8
            goto L63b
        L5a8:
            java.lang.Object[] r0 = r2.args
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            if (r0 == 0) goto L63b
            int r8 = r0.length
            if (r8 >= r3) goto L5ba
            goto L63b
        L5ba:
            int r3 = r0.length
            r8 = 15
            if (r3 == r8) goto L5cb
            r4 = 16
            if (r3 == r4) goto L5c5
            goto L63b
        L5c5:
            sf.e r3 = new sf.e
            r3.<init>(r2, r6)
            goto L5d5
        L5cb:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            sf.e r4 = new sf.e
            r4.<init>(r3, r2)
            r3 = r4
        L5d5:
            java.lang.Object r2 = r3.f12418g
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r3 = r3.f12419h
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = r0[r2]
            boolean r8 = r4 instanceof java.lang.Integer
            if (r8 == 0) goto L5ee
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L5fe
        L5ee:
            boolean r8 = r4 instanceof java.lang.Number
            if (r8 == 0) goto L5fd
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L5fe
        L5fd:
            r4 = r7
        L5fe:
            if (r4 == 0) goto L63b
            int r4 = r4.intValue()
            r8 = r0[r3]
            boolean r9 = r8 instanceof java.lang.Integer
            if (r9 == 0) goto L60e
            r7 = r8
            java.lang.Integer r7 = (java.lang.Integer) r7
            goto L61c
        L60e:
            boolean r9 = r8 instanceof java.lang.Number
            if (r9 == 0) goto L61c
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r8.intValue()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L61c:
            if (r7 == 0) goto L63b
            int r7 = r7.intValue()
            r8 = 1
            if (r4 != r8) goto L62c
            r8 = 34
            if (r7 != r8) goto L62c
        L629:
            r18 = 0
            goto L633
        L62c:
            if (r4 != r5) goto L63b
            r4 = 37
            if (r7 != r4) goto L63b
            goto L629
        L633:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
            r0[r2] = r4
            r0[r3] = r6
        L63b:
            return
        L63c:
            r2.getClass()
            java.lang.Object r0 = r1.f536b
            ha.j0 r0 = (ha.j0) r0
            android.content.SharedPreferences r0 = r0.f5241b
            java.lang.String r3 = "sns_anti_recall_enable"
            r8 = 0
            boolean r3 = r0.getBoolean(r3, r8)
            if (r3 == 0) goto L65b
            java.lang.String r3 = "sns_force_legacy_profile_enable"
            boolean r0 = r0.getBoolean(r3, r8)
            if (r0 == 0) goto L65b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.setResult(r0)
        L65b:
            return
        L65c:
            r8 = r6
            r2.getClass()
            java.lang.Object r0 = r2.thisObject
            if (r0 != 0) goto L666
            goto L6e7
        L666:
            java.lang.Class r3 = r0.getClass()
            java.util.LinkedHashMap r4 = eb.m0.f2589c
            monitor-enter(r4)
            boolean r5 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L67a
            if (r5 == 0) goto L67d
            java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L67a
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L67a
            goto L67e
        L67a:
            r0 = move-exception
            goto L81f
        L67d:
            r5 = r7
        L67e:
            monitor-exit(r4)
            if (r5 == 0) goto L687
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r5, r0)
        L685:
            r3 = r0
            goto L6e8
        L687:
            monitor-enter(r4)
            boolean r5 = r4.containsKey(r3)     // Catch: java.lang.Throwable -> L81c
            monitor-exit(r4)
            if (r5 == 0) goto L690
            goto L6e7
        L690:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r3
        L696:
            if (r5 == 0) goto L6ac
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L6ac
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredFields(r5)
            tf.r.h1(r4, r6)
            java.lang.Class r5 = r5.getSuperclass()
            goto L696
        L6ac:
            java.util.Iterator r4 = r4.iterator()
        L6b0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6ce
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Class r6 = r6.getType()
            java.lang.String r6 = r6.getName()
            java.lang.String r9 = "com.tencent.mm.pluginsdk.ui.chat.ChatFooter"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L6b0
            goto L6cf
        L6ce:
            r5 = r7
        L6cf:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            if (r5 == 0) goto L6d8
            java.lang.reflect.Field r4 = h.Hchat.utils.KavaReflector.accessible(r5)
            goto L6d9
        L6d8:
            r4 = r7
        L6d9:
            java.util.LinkedHashMap r5 = eb.m0.f2589c
            monitor-enter(r5)
            r5.put(r3, r4)     // Catch: java.lang.Throwable -> L819
            monitor-exit(r5)
            if (r4 == 0) goto L6e7
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r4, r0)
            goto L685
        L6e7:
            r3 = r7
        L6e8:
            if (r3 == 0) goto L818
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            eb.m0.f2596j = r0
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L6f9
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            goto L6fa
        L6f9:
            r0 = r7
        L6fa:
            if (r0 == 0) goto L701
            android.content.Context r0 = r0.getContext()
            goto L702
        L701:
            r0 = r7
        L702:
            android.app.Activity r0 = eb.m0.c(r0)
            if (r0 == 0) goto L709
            goto L723
        L709:
            java.lang.Object r0 = eb.m0.d(r3)
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L714
            android.view.View r0 = (android.view.View) r0
            goto L715
        L714:
            r0 = r7
        L715:
            if (r0 == 0) goto L71c
            android.content.Context r0 = r0.getContext()
            goto L71d
        L71c:
            r0 = r7
        L71d:
            android.app.Activity r0 = eb.m0.c(r0)
            if (r0 == 0) goto L736
        L723:
            q8.o r4 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r4 == 0) goto L736
            boolean r5 = r0.isFinishing()
            if (r5 != 0) goto L736
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r0)
            r4.f10730b = r5
        L736:
            java.lang.String r4 = eb.m0.i(r3)
            java.util.concurrent.CopyOnWriteArrayList r0 = eb.m0.f2593g
            java.util.Iterator r5 = r0.iterator()
            r5.getClass()
        L743:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L769
            java.lang.Object r0 = r5.next()
            r6 = r0
            eb.j0 r6 = (eb.j0) r6
            eb.i0 r0 = r6.f2566b     // Catch: java.lang.Throwable -> L75a
            boolean r0 = r0.b(r4)     // Catch: java.lang.Throwable -> L75a
            if (r0 == 0) goto L743
            r6 = r8
            goto L76a
        L75a:
            r0 = move-exception
            java.lang.String r6 = r6.f2565a
            java.lang.String r9 = r0.getMessage()
            java.lang.String r10 = "[Hchat:Script] 发送按钮模块回调失败: "
            java.lang.String r11 = " "
            eh.a.w(r10, r6, r11, r9, r0)
            goto L743
        L769:
            r6 = 0
        L76a:
            if (r6 == 0) goto L76e
            r0 = 0
            goto L776
        L76e:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            eb.d0 r0 = r0.dispatchOnClickSendBtn(r4)
            boolean r0 = r0.f2533a
        L776:
            if (r6 != 0) goto L7ae
            if (r0 != 0) goto L7ae
            java.lang.String r0 = eb.m0.i(r3)
            java.lang.Object r4 = r1.f536b
            eb.m0 r4 = (eb.m0) r4
            eb.h0 r0 = eb.m0.a(r4, r3, r0)     // Catch: java.lang.Throwable -> L787
            goto L78e
        L787:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L78e:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 == 0) goto L79d
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "[Hchat:Script] 发送文字装饰失败: "
            eh.a.x(r5, r4, r3)
        L79d:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L7a2
            goto L7a3
        L7a2:
            r7 = r0
        L7a3:
            eb.h0 r7 = (eb.h0) r7
            if (r7 == 0) goto L818
            java.lang.String r0 = "hchat_send_text_decoration"
            r2.setObjectExtra(r0, r7)
            goto L818
        L7ae:
            java.lang.String r0 = ""
            java.lang.Object r4 = eb.m0.d(r3)
            if (r4 == 0) goto L800
            eb.m0 r5 = eb.m0.f2587a
            boolean r5 = r4 instanceof android.widget.TextView
            if (r5 == 0) goto L7c2
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r0)
            goto L815
        L7c2:
            java.lang.Object r5 = eb.m0.h(r4)
            if (r5 == 0) goto L7cd
            java.lang.Class r6 = r5.getClass()
            goto L7ce
        L7cd:
            r6 = r7
        L7ce:
            java.lang.String r8 = "clear"
            java.lang.reflect.Method r6 = eb.m0.e(r6, r8)
            if (r5 == 0) goto L7df
            if (r6 == 0) goto L7df
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            h.Hchat.utils.KavaReflector.invoke(r6, r5, r0)
            goto L815
        L7df:
            java.lang.Class r5 = r4.getClass()
            java.lang.Class<java.lang.CharSequence> r6 = java.lang.CharSequence.class
            java.lang.reflect.Method r5 = eb.m0.f(r5, r6)
            if (r5 == 0) goto L7ec
            goto L7f6
        L7ec:
            java.lang.Class r5 = r4.getClass()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.reflect.Method r5 = eb.m0.f(r5, r6)
        L7f6:
            if (r5 == 0) goto L800
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            h.Hchat.utils.KavaReflector.invoke(r5, r4, r0)
            goto L815
        L800:
            java.lang.Class r4 = r3.getClass()
            java.lang.Class r5 = r0.getClass()
            java.lang.reflect.Method r4 = eb.m0.f(r4, r5)
            if (r4 == 0) goto L815
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            h.Hchat.utils.KavaReflector.invoke(r4, r3, r0)
        L815:
            r2.setResult(r7)
        L818:
            return
        L819:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L81c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L81f:
            monitor-exit(r4)
            throw r0
        L821:
            r2.getClass()
            java.lang.Object r0 = r1.f536b
            java.util.function.Function r0 = (java.util.function.Function) r0
            java.lang.Object r0 = r0.apply(r2)
            r2.setResult(r0)
            return
        L830:
            r2.getClass()
            java.lang.Object r0 = r1.f536b
            ea.c r0 = (ea.c) r0
            java.lang.Object r0 = r0.f2482a
            r8.g r0 = (r8.g) r0
            android.content.Context r0 = r0.f11620a
            java.lang.String r3 = "Hchat_fake_mini_program_base_lib_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r3)
            java.lang.String r3 = "fake_mini_program_base_lib_enable"
            r8 = 0
            boolean r0 = r0.getBoolean(r3, r8)
            if (r0 != 0) goto L84d
            goto L85c
        L84d:
            java.lang.Object[] r0 = r2.args
            int r2 = r0.length
            r3 = 6
            if (r2 > r3) goto L854
            goto L85c
        L854:
            r2 = 9999(0x270f, float:1.4012E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r3] = r2
        L85c:
            return
        L85d:
            r2.getClass()
            java.lang.Object r0 = r1.f536b
            ba.m r0 = (ba.m) r0
            java.lang.Object[] r2 = r2.args
            r0.getClass()
            java.lang.ThreadLocal r3 = r0.f605l
            if (r2 == 0) goto L87f
            int r4 = r2.length
            r8 = 0
        L86f:
            if (r8 >= r4) goto L87f
            r5 = r2[r8]
            if (r5 == 0) goto L87c
            android.view.View r6 = r0.f(r5)
            if (r6 == 0) goto L87c
            goto L880
        L87c:
            int r8 = r8 + 1
            goto L86f
        L87f:
            r5 = r7
        L880:
            if (r5 == 0) goto L887
            android.view.View r0 = r0.f(r5)
            goto L888
        L887:
            r0 = r7
        L888:
            if (r0 == 0) goto L89a
            java.lang.Object r2 = r0.getTag()
            if (r2 == 0) goto L89a
            java.lang.String r4 = "com.tencent.mm.ui.chatting.viewitems."
            r8 = 0
            boolean r4 = eh.a.z(r4, r2, r8)
            if (r4 == 0) goto L89a
            goto L89b
        L89a:
            r2 = r7
        L89b:
            ba.h r4 = new ba.h
            r4.<init>(r0, r2)
            if (r0 == 0) goto L8eb
            r2 = 2131099710(0x7f06003e, float:1.781178E38)
            java.lang.Object r5 = r0.getTag(r2)
            boolean r6 = r5 instanceof android.view.View
            if (r6 == 0) goto L8b3
            android.view.View r5 = (android.view.View) r5
            ba.m.x(r5)
            goto L8e8
        L8b3:
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L8e8
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L8c2:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L8d4
            java.lang.Object r8 = r5.next()
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto L8c2
            r6.add(r8)
            goto L8c2
        L8d4:
            java.util.Iterator r5 = r6.iterator()
        L8d8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8e8
            java.lang.Object r6 = r5.next()
            android.view.View r6 = (android.view.View) r6
            ba.m.x(r6)
            goto L8d8
        L8e8:
            r0.setTag(r2, r7)
        L8eb:
            java.lang.Object r0 = r3.get()
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            if (r0 == 0) goto L8f4
            goto L8fc
        L8f4:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.set(r0)
        L8fc:
            r0.addLast(r4)
            return
    }
}
