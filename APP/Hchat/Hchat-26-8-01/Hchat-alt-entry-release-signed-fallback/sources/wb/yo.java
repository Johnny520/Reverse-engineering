package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class yo extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20449b;

    public /* synthetic */ yo(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f20448a = r2
            r0.f20449b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r31) {
            r30 = this;
            r1 = r30
            r0 = r31
            int r2 = r1.f20448a
            switch(r2) {
                case 0: goto L31d;
                case 1: goto L256;
                case 2: goto Ld;
                default: goto L9;
            }
        L9:
            super.afterHookedMethod(r31)
            return
        Ld:
            r0.getClass()
            java.lang.Object r2 = r1.f20449b
            r4 = r2
            y9.e r4 = (y9.e) r4
            java.lang.String r2 = ""
            ib.b r3 = r4.f22333b
            java.util.Map r5 = r4.f22336e
            android.content.SharedPreferences r3 = r3.f6650a
            java.lang.String r6 = "enable"
            r7 = 0
            boolean r3 = r3.getBoolean(r6, r7)
            if (r3 != 0) goto L28
            goto L255
        L28:
            q8.m r3 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            r6 = 0
            if (r3 == 0) goto L34
            java.lang.String r3 = r3.a()
            goto L35
        L34:
            r3 = r6
        L35:
            if (r3 != 0) goto L38
            r3 = r2
        L38:
            boolean r8 = y9.e.g(r3)
            if (r8 != 0) goto L40
            goto L255
        L40:
            java.lang.Object[] r0 = r0.args
            if (r0 == 0) goto L255
            java.lang.Object r8 = tf.l.z0(r0)
            if (r8 == 0) goto L255
            java.util.concurrent.ConcurrentHashMap r9 = r4.f22337f
            java.lang.Class r10 = r8.getClass()
            java.lang.Object r10 = r9.get(r10)
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            if (r10 == 0) goto L65
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.readField(r10, r8)
            boolean r9 = r8 instanceof android.widget.TextView
            if (r9 == 0) goto L63
            android.widget.TextView r8 = (android.widget.TextView) r8
            goto L7e
        L63:
            r8 = r6
            goto L7e
        L65:
            java.lang.Class r10 = r8.getClass()
            java.lang.reflect.Field r10 = r4.d(r10)
            java.lang.Class r11 = r8.getClass()
            r9.put(r11, r10)
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.readField(r10, r8)
            boolean r9 = r8 instanceof android.widget.TextView
            if (r9 == 0) goto L63
            android.widget.TextView r8 = (android.widget.TextView) r8
        L7e:
            if (r8 == 0) goto L255
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r0.length
            r13 = r2
            r12 = r6
            r11 = r7
        L89:
            if (r11 >= r10) goto Lbf
            r14 = r0[r11]
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto Laf
            r15 = r13
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r15 = r15.length()
            if (r15 != 0) goto L9b
            r13 = r14
        L9b:
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            java.lang.CharSequence r15 = og.m.R0(r15)
            java.lang.String r15 = r15.toString()
            boolean r16 = zb.c.b(r15)
            if (r16 == 0) goto Laf
            r9.add(r15)
        Laf:
            if (r14 == 0) goto Lbc
            java.lang.Class r15 = r14.getClass()
            boolean r15 = r4.f(r15)
            if (r15 == 0) goto Lbc
            r12 = r14
        Lbc:
            int r11 = r11 + 1
            goto L89
        Lbf:
            if (r12 != 0) goto Lc3
        Lc1:
            r10 = r7
            goto Lee
        Lc3:
            java.lang.String r0 = "field_isSend"
            java.lang.String r10 = "isSend"
            java.lang.String[] r0 = new java.lang.String[]{r0, r10}
            r10 = r7
        Lcc:
            r11 = 2
            if (r10 < r11) goto Ld0
            goto Lc1
        Ld0:
            r11 = r0[r10]
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.readField(r12, r11)
            boolean r14 = r11 instanceof java.lang.Number
            if (r14 == 0) goto Le4
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
            r10 = 1
            if (r0 != r10) goto Lc1
            goto Lee
        Le4:
            boolean r14 = r11 instanceof java.lang.Boolean
            if (r14 == 0) goto L251
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
        Lee:
            if (r10 == 0) goto Lf8
            r5.remove(r8)
            r4.l(r8)
            goto L255
        Lf8:
            r11 = r13
            java.lang.String r11 = (java.lang.String) r11
            java.util.Iterator r0 = r9.iterator()
        Lff:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L113
            java.lang.Object r9 = r0.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = y9.e.h(r10)
            if (r10 != 0) goto Lff
            goto L114
        L113:
            r9 = r6
        L114:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L11b
            r2 = r9
            goto L206
        L11b:
            java.lang.String r0 = y9.e.b(r12)
            if (r0 == 0) goto L12e
            boolean r9 = y9.e.h(r0)
            if (r9 != 0) goto L128
            goto L129
        L128:
            r0 = r6
        L129:
            if (r0 == 0) goto L12e
        L12b:
            r2 = r0
            goto L206
        L12e:
            java.util.Map r14 = r4.f22335d
            if (r12 != 0) goto L140
            boolean r0 = zb.c.b(r11)
            if (r0 == 0) goto L139
            r6 = r11
        L139:
            if (r6 != 0) goto L13d
            goto L206
        L13d:
            r2 = r6
            goto L206
        L140:
            java.lang.Object r0 = r14.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L149
            goto L12b
        L149:
            java.lang.String r15 = "A0"
            java.lang.String r16 = "B0"
            java.lang.String r17 = "C0"
            java.lang.String r18 = "D0"
            java.lang.String r19 = "E0"
            java.lang.String r20 = "F0"
            java.lang.String r21 = "getSender"
            java.lang.String r22 = "getSendTalker"
            java.lang.String r23 = "getTalker"
            java.lang.String r24 = "j"
            java.lang.String r25 = "R1"
            java.lang.String r26 = "P1"
            java.lang.String r27 = "o0"
            java.lang.String r28 = "x0"
            java.lang.String r29 = "j0"
            java.lang.String[] r15 = new java.lang.String[]{r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            r0 = r7
        L16c:
            r9 = 15
            if (r0 < r9) goto L1d3
            java.lang.String r16 = "field_talker"
            java.lang.String r17 = "talker"
            java.lang.String r18 = "field_sender"
            java.lang.String r19 = "sender"
            java.lang.String r20 = "sendTalker"
            java.lang.String r21 = "field_talkerUsername"
            java.lang.String r22 = "P"
            java.lang.String[] r9 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22}
        L182:
            r0 = 7
            if (r7 < r0) goto L1a8
            java.lang.String r0 = y9.e.b(r12)
            if (r0 == 0) goto L191
            java.util.Map r14 = (java.util.Map) r14
            r14.put(r12, r0)
            goto L12b
        L191:
            boolean r0 = zb.c.b(r11)
            if (r0 == 0) goto L198
            r6 = r11
        L198:
            if (r6 != 0) goto L19b
            goto L19c
        L19b:
            r2 = r6
        L19c:
            int r0 = r2.length()
            if (r0 <= 0) goto L206
            java.util.Map r14 = (java.util.Map) r14
            r14.put(r12, r2)
            goto L206
        L1a8:
            r0 = r9[r7]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r12, r0)
            boolean r10 = r0 instanceof java.lang.String
            if (r10 == 0) goto L1b5
            java.lang.String r0 = (java.lang.String) r0
            goto L1b6
        L1b5:
            r0 = r6
        L1b6:
            boolean r10 = zb.c.b(r0)
            if (r10 == 0) goto L1d0
            if (r0 == 0) goto L1c6
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r6 = r0.toString()
        L1c6:
            if (r6 != 0) goto L1c9
            goto L1ca
        L1c9:
            r2 = r6
        L1ca:
            java.util.Map r14 = (java.util.Map) r14
            r14.put(r12, r2)
            goto L206
        L1d0:
            int r7 = r7 + 1
            goto L182
        L1d3:
            r9 = r15[r0]
            java.lang.Class r10 = r12.getClass()
            java.lang.Class[] r13 = new java.lang.Class[r7]
            java.lang.reflect.Method r9 = h.Hchat.utils.KavaReflector.findMethod(r10, r9, r13)
            java.lang.Object[] r10 = new java.lang.Object[r7]
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invoke(r9, r12, r10)
            boolean r10 = r9 instanceof java.lang.String
            if (r10 == 0) goto L1ec
            java.lang.String r9 = (java.lang.String) r9
            goto L1ed
        L1ec:
            r9 = r6
        L1ed:
            boolean r10 = zb.c.b(r9)
            if (r10 == 0) goto L24d
            if (r9 == 0) goto L1fd
            java.lang.CharSequence r0 = og.m.R0(r9)
            java.lang.String r6 = r0.toString()
        L1fd:
            if (r6 != 0) goto L200
            goto L201
        L200:
            r2 = r6
        L201:
            java.util.Map r14 = (java.util.Map) r14
            r14.put(r12, r2)
        L206:
            boolean r0 = zb.c.b(r2)
            if (r0 == 0) goto L246
            boolean r0 = y9.e.h(r2)
            if (r0 == 0) goto L213
            goto L246
        L213:
            boolean r0 = r4.a(r8, r3, r2)
            if (r0 != 0) goto L255
            y9.d r6 = new y9.d
            r6.<init>(r3, r2)
            r5.getClass()
            java.util.Map r5 = (java.util.Map) r5
            r5.put(r8, r6)
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r0 == 0) goto L255
            int r5 = java.lang.System.identityHashCode(r8)
            java.lang.String r7 = "member_title_apply_"
            java.lang.String r10 = eh.a.l(r5, r7)
            r7 = r3
            ca.x r3 = new ca.x
            r9 = 21
            r5 = r8
            r8 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r4 = 120(0x78, double:5.93E-322)
            r0.f(r10, r4, r3)
            goto L255
        L246:
            r5.remove(r8)
            r4.l(r8)
            goto L255
        L24d:
            int r0 = r0 + 1
            goto L16c
        L251:
            int r10 = r10 + 1
            goto Lcc
        L255:
            return
        L256:
            r0.getClass()
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            r3 = 0
            java.lang.Object r2 = tf.l.C0(r3, r2)
            boolean r4 = r2 instanceof java.lang.Integer
            r5 = 0
            if (r4 == 0) goto L26b
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L26c
        L26b:
            r2 = r5
        L26c:
            if (r2 == 0) goto L31c
            int r2 = r2.intValue()
            r4 = 1212371551(0x4843525f, float:200009.48)
            if (r2 == r4) goto L279
            goto L31c
        L279:
            java.lang.Object r2 = r1.f20449b
            wb.ep r2 = (wb.ep) r2
            monitor-enter(r2)
            wb.dp r4 = wb.ep.f16004c     // Catch: java.lang.Throwable -> L319
            wb.ep.f16004c = r5     // Catch: java.lang.Throwable -> L319
            monitor-exit(r2)
            if (r4 == 0) goto L31c
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            r6 = 1
            java.lang.Object r2 = tf.l.C0(r6, r2)
            boolean r6 = r2 instanceof java.lang.Integer
            if (r6 == 0) goto L296
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L297
        L296:
            r2 = r5
        L297:
            if (r2 == 0) goto L31c
            int r2 = r2.intValue()
            r6 = -1
            if (r2 == r6) goto L2a2
            goto L31c
        L2a2:
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            r2 = 2
            java.lang.Object r0 = tf.l.C0(r2, r0)
            boolean r2 = r0 instanceof android.content.Intent
            if (r2 == 0) goto L2b3
            android.content.Intent r0 = (android.content.Intent) r0
            goto L2b4
        L2b3:
            r0 = r5
        L2b4:
            if (r0 == 0) goto L31c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.net.Uri r6 = r0.getData()
            if (r6 == 0) goto L2c4
            r2.add(r6)
        L2c4:
            android.content.ClipData r6 = r0.getClipData()
            if (r6 == 0) goto L2f6
            int r7 = r6.getItemCount()
        L2ce:
            if (r3 < r7) goto L2d1
            goto L2f6
        L2d1:
            android.content.ClipData$Item r0 = r6.getItemAt(r3)     // Catch: java.lang.Throwable -> L2dc
            if (r0 == 0) goto L2de
            android.net.Uri r0 = r0.getUri()     // Catch: java.lang.Throwable -> L2dc
            goto L2e6
        L2dc:
            r0 = move-exception
            goto L2e0
        L2de:
            r0 = r5
            goto L2e6
        L2e0:
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        L2e6:
            boolean r8 = r0 instanceof sf.f
            if (r8 == 0) goto L2ec
            r0 = r5
        L2ec:
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto L2f3
            r2.add(r0)
        L2f3:
            int r3 = r3 + 1
            goto L2ce
        L2f6:
            java.util.Set r0 = tf.m.T1(r2)
            java.util.List r0 = tf.m.P1(r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L305
            goto L31c
        L305:
            java.lang.Thread r2 = new java.lang.Thread
            java.lang.Object r3 = r1.f20449b
            wb.ep r3 = (wb.ep) r3
            rb.g r5 = new rb.g
            r5.<init>(r0, r3, r4)
            java.lang.String r0 = "Hchat-Plugin-Market-Files"
            r2.<init>(r5, r0)
            r2.start()
            goto L31c
        L319:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L319
            throw r0
        L31c:
            return
        L31d:
            r0.getClass()
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            r3 = 0
            java.lang.Object r2 = tf.l.C0(r3, r2)
            boolean r4 = r2 instanceof java.lang.Integer
            r5 = 0
            if (r4 == 0) goto L332
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L333
        L332:
            r2 = r5
        L333:
            if (r2 == 0) goto L4b7
            int r2 = r2.intValue()
            r4 = 1212371549(0x4843525d, float:200009.45)
            if (r2 == r4) goto L340
            goto L4b7
        L340:
            java.lang.Object r2 = r1.f20449b
            wb.zo r2 = (wb.zo) r2
            monitor-enter(r2)
            wb.xo r4 = wb.zo.f20690c     // Catch: java.lang.Throwable -> L4b4
            wb.zo.f20690c = r5     // Catch: java.lang.Throwable -> L4b4
            monitor-exit(r2)
            if (r4 == 0) goto L4b7
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            r6 = 1
            java.lang.Object r2 = tf.l.C0(r6, r2)
            boolean r7 = r2 instanceof java.lang.Integer
            if (r7 == 0) goto L35d
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L35e
        L35d:
            r2 = r5
        L35e:
            if (r2 == 0) goto L4b7
            int r2 = r2.intValue()
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            r7 = 2
            java.lang.Object r0 = tf.l.C0(r7, r0)
            boolean r7 = r0 instanceof android.content.Intent
            if (r7 == 0) goto L375
            android.content.Intent r0 = (android.content.Intent) r0
            goto L376
        L375:
            r0 = r5
        L376:
            r7 = -1
            if (r2 != r7) goto L4b7
            if (r0 != 0) goto L37d
            goto L4b7
        L37d:
            java.lang.String r2 = "kwebmap_slat"
            r7 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            double r9 = r0.getDoubleExtra(r2, r7)
            java.lang.String r2 = "kwebmap_lng"
            double r7 = r0.getDoubleExtra(r2, r7)
            java.lang.Double r2 = java.lang.Double.valueOf(r9)
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            sf.e r2 = wb.ho.v7(r2, r7)
            if (r2 == 0) goto L39b
            goto L49c
        L39b:
            java.lang.String r2 = "KLocationIntent"
            android.os.Parcelable r0 = r0.getParcelableExtra(r2)     // Catch: java.lang.Throwable -> L3a2
            goto L3a9
        L3a2:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L3a9:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L3af
            r0 = r5
        L3af:
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            if (r0 == 0) goto L49b
            java.lang.String r2 = "d"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r0, r2)
            boolean r7 = r2 instanceof java.lang.Number
            if (r7 == 0) goto L3c0
            java.lang.Number r2 = (java.lang.Number) r2
            goto L3c1
        L3c0:
            r2 = r5
        L3c1:
            if (r2 == 0) goto L3cc
            double r7 = r2.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
            goto L3cd
        L3cc:
            r2 = r5
        L3cd:
            java.lang.String r7 = "e"
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r0, r7)
            boolean r8 = r7 instanceof java.lang.Number
            if (r8 == 0) goto L3da
            java.lang.Number r7 = (java.lang.Number) r7
            goto L3db
        L3da:
            r7 = r5
        L3db:
            if (r7 == 0) goto L3e6
            double r7 = r7.doubleValue()
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            goto L3e7
        L3e6:
            r7 = r5
        L3e7:
            if (r2 == 0) goto L3f4
            if (r7 == 0) goto L3f4
            sf.e r2 = wb.ho.v7(r2, r7)
            if (r2 == 0) goto L3f4
            r5 = r2
            goto L49b
        L3f4:
            java.lang.Class r2 = r0.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            dg.n r2 = tf.m.m1(r2)
            wb.jk r7 = new wb.jk
            r8 = 27
            r7.<init>(r8)
            ng.i r8 = new ng.i
            r8.<init>(r2, r6, r7)
            nb.a r2 = new nb.a
            r7 = 26
            r2.<init>(r0, r7)
            ng.i r2 = ng.m.X(r8, r2)
            ng.h r7 = new ng.h
            r7.<init>(r2)
        L41c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L43a
            java.lang.Object r2 = r7.next()
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "lat"
            boolean r9 = og.m.h0(r8, r9, r6)
            if (r9 == 0) goto L41c
            java.lang.String r9 = "lng"
            boolean r8 = og.m.h0(r8, r9, r6)
            if (r8 == 0) goto L41c
            goto L43b
        L43a:
            r2 = r5
        L43b:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L440
            goto L444
        L440:
            java.lang.String r2 = r0.toString()
        L444:
            java.lang.String r0 = "(?:lat|latitude)\\s*[:= ]\\s*([-+]?[0-9]*\\.?[0-9]+)"
            r7 = 66
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r7)
            r0.getClass()
            r2.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r2)
            r0.getClass()
            og.i r0 = a7.a.b(r0, r3, r2)
            if (r0 == 0) goto L470
            java.util.List r0 = r0.a()
            java.lang.Object r0 = tf.m.w1(r6, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L470
            java.lang.Double r0 = og.s.U(r0)
            goto L471
        L470:
            r0 = r5
        L471:
            java.lang.String r8 = "(?:lng|lon|longitude)\\s*[:= ]\\s*([-+]?[0-9]*\\.?[0-9]+)"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r8, r7)
            r7.getClass()
            java.util.regex.Matcher r7 = r7.matcher(r2)
            r7.getClass()
            og.i r2 = a7.a.b(r7, r3, r2)
            if (r2 == 0) goto L497
            java.util.List r2 = r2.a()
            java.lang.Object r2 = tf.m.w1(r6, r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L497
            java.lang.Double r5 = og.s.U(r2)
        L497:
            sf.e r5 = wb.ho.v7(r0, r5)
        L49b:
            r2 = r5
        L49c:
            if (r2 != 0) goto L4aa
            android.app.Activity r0 = r4.f20238a
            java.lang.String r2 = "解析微信地图选点失败"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r3)
            r0.show()
            goto L4b7
        L4aa:
            wb.sc r0 = r4.f20239b
            java.lang.Object r3 = r2.f12418g
            java.lang.Object r2 = r2.f12419h
            r0.invoke(r3, r2)
            goto L4b7
        L4b4:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b4
            throw r0
        L4b7:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r38) {
            r37 = this;
            r1 = r37
            r2 = r38
            int r0 = r1.f20448a
            r3 = 0
            java.lang.Object r4 = r1.f20449b
            r5 = 2
            r6 = 0
            switch(r0) {
                case 3: goto L46;
                case 4: goto L12;
                default: goto Le;
            }
        Le:
            super.beforeHookedMethod(r38)
            return
        L12:
            r2.getClass()
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto L1e
            java.lang.Object r0 = tf.l.C0(r5, r0)
            goto L1f
        L1e:
            r0 = r6
        L1f:
            boolean r5 = r0 instanceof java.lang.Boolean
            if (r5 == 0) goto L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L27
        L26:
            r0 = r6
        L27:
            if (r0 == 0) goto L45
            boolean r0 = r0.booleanValue()
            z8.g r4 = (z8.g) r4
            android.content.SharedPreferences r4 = r4.f22650c
            if (r0 == 0) goto L3a
            java.lang.String r0 = "call_block_outgoing_ringtone"
            boolean r0 = r4.getBoolean(r0, r3)
            goto L40
        L3a:
            java.lang.String r0 = "call_block_incoming_ringtone"
            boolean r0 = r4.getBoolean(r0, r3)
        L40:
            if (r0 == 0) goto L45
            r2.setResult(r6)
        L45:
            return
        L46:
            r2.getClass()
            java.lang.Object r0 = r2.thisObject
            boolean r7 = r0 instanceof android.app.Activity
            if (r7 == 0) goto L52
            android.app.Activity r0 = (android.app.Activity) r0
            goto L53
        L52:
            r0 = r6
        L53:
            if (r0 == 0) goto L3bb
            java.lang.Object[] r7 = r2.args
            if (r7 == 0) goto L5e
            java.lang.Object r7 = tf.l.C0(r3, r7)
            goto L5f
        L5e:
            r7 = r6
        L5f:
            boolean r8 = r7 instanceof android.view.MotionEvent
            if (r8 == 0) goto L66
            android.view.MotionEvent r7 = (android.view.MotionEvent) r7
            goto L67
        L66:
            r7 = r6
        L67:
            if (r7 == 0) goto L3bb
            ya.g r4 = (ya.g) r4
            java.lang.Class r8 = r0.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "com.tencent.mm.ui.LauncherUI"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L80
            r4.a()
            goto L3bb
        L80:
            java.util.concurrent.atomic.AtomicBoolean r8 = ya.i.f22391a
            java.lang.String r8 = "Hchat_quick_mark_read_config"
            android.content.SharedPreferences r8 = ub.b.c(r0, r8)
            java.lang.String r9 = "drag_read_enable"
            boolean r8 = r8.getBoolean(r9, r3)
            if (r8 != 0) goto L95
            r4.a()
            goto L3bb
        L95:
            int r8 = r7.getActionMasked()
            r9 = 1
            if (r8 == 0) goto L19f
            if (r8 == r9) goto L12c
            if (r8 == r5) goto Lb6
            r0 = 3
            if (r8 == r0) goto La9
            ya.a r0 = r4.f22390d
            if (r0 == 0) goto L3bb
            goto L198
        La9:
            r4.f22389c = r6
            ya.a r0 = r4.f22390d
            if (r0 == 0) goto L3bb
            r0.c()
            r4.f22390d = r6
            goto L198
        Lb6:
            ya.a r0 = r4.f22390d
            if (r0 != 0) goto L11f
            ya.c r0 = r4.f22389c
            if (r0 == 0) goto L3bb
            float r3 = r0.f22374d
            float r5 = r0.f22373c
            ya.b r8 = r0.f22372b
            float r10 = r7.getRawX()
            float r11 = r7.getRawY()
            float r10 = r10 - r5
            float r11 = r11 - r3
            android.view.View r12 = r8.f22354a
            android.view.View r13 = r8.f22355b
            android.content.res.Resources r12 = r12.getResources()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            r14 = 1099956224(0x41900000, float:18.0)
            float r12 = android.util.TypedValue.applyDimension(r9, r14, r12)
            int r12 = (int) r12
            int r12 = -r12
            float r12 = (float) r12
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 > 0) goto L3bb
            float r11 = java.lang.Math.abs(r11)
            float r10 = java.lang.Math.abs(r10)
            r12 = 1061997773(0x3f4ccccd, float:0.8)
            float r10 = r10 * r12
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 <= 0) goto L3bb
            r4.f22389c = r6
            ya.a r6 = new ya.a
            android.view.ViewGroup r0 = r0.f22371a
            r6.<init>(r0, r8, r5, r3)
            r4.f22390d = r6
            if (r13 == 0) goto L10d
            android.view.ViewParent r0 = r13.getParent()
            if (r0 == 0) goto L10d
            r0.requestDisallowInterceptTouchEvent(r9)
        L10d:
            if (r13 == 0) goto L112
            r13.bringToFront()
        L112:
            float r0 = r7.getRawX()
            float r3 = r7.getRawY()
            r6.b(r0, r3)
            goto L198
        L11f:
            float r3 = r7.getRawX()
            float r4 = r7.getRawY()
            r0.b(r3, r4)
            goto L198
        L12c:
            ya.a r5 = r4.f22390d
            if (r5 != 0) goto L134
            r4.f22389c = r6
            goto L3bb
        L134:
            ya.b r0 = r5.f22345b
            float r8 = r7.getRawX()
            float r7 = r7.getRawY()
            r5.b(r8, r7)
            boolean r7 = r5.d()
            if (r7 == 0) goto L193
            android.view.View r7 = r0.f22354a     // Catch: java.lang.Throwable -> L178
            android.content.Context r7 = r7.getContext()     // Catch: java.lang.Throwable -> L178
            int r7 = ya.i.e(r7, r9)     // Catch: java.lang.Throwable -> L178
            if (r7 < 0) goto L154
            goto L155
        L154:
            r9 = r3
        L155:
            if (r9 == 0) goto L173
            android.view.View r7 = r5.f22348e     // Catch: java.lang.Throwable -> L176
            android.view.ViewPropertyAnimator r7 = r7.animate()     // Catch: java.lang.Throwable -> L176
            r7.cancel()     // Catch: java.lang.Throwable -> L176
            r5.a()     // Catch: java.lang.Throwable -> L176
            android.view.View r0 = r0.f22355b     // Catch: java.lang.Throwable -> L176
            if (r0 == 0) goto L173
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Throwable -> L176
            if (r0 == 0) goto L173
            r0.requestDisallowInterceptTouchEvent(r3)     // Catch: java.lang.Throwable -> L176
            goto L173
        L171:
            r3 = r9
            goto L179
        L173:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L176
            goto L180
        L176:
            r0 = move-exception
            goto L171
        L178:
            r0 = move-exception
        L179:
            sf.f r7 = new sf.f
            r7.<init>(r0)
            r9 = r3
            r0 = r7
        L180:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L18d
            y9.b r3 = r4.f22387a
            java.lang.String r7 = "快捷已读触发失败"
            r3.invoke(r7, r0)
        L18d:
            if (r9 != 0) goto L196
            r5.c()
            goto L196
        L193:
            r5.c()
        L196:
            r4.f22390d = r6
        L198:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.setResult(r0)
            goto L3bb
        L19f:
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L1aa
            android.view.View r0 = r0.getDecorView()
            goto L1ab
        L1aa:
            r0 = r6
        L1ab:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L1b3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r11 = r0
            goto L1b4
        L1b3:
            r11 = r6
        L1b4:
            if (r11 == 0) goto L3bb
            java.lang.String r0 = "Hchat:MiuixSettingsPage"
            android.view.View r0 = r11.findViewWithTag(r0)
            if (r0 == 0) goto L1c3
            r4.a()
            goto L3bb
        L1c3:
            float r0 = r7.getRawX()
            float r2 = r7.getRawY()
            int r8 = r11.getHeight()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            if (r8 <= 0) goto L1d6
            goto L1d7
        L1d6:
            r10 = r6
        L1d7:
            if (r10 == 0) goto L1de
            int r8 = r10.intValue()
            goto L1e8
        L1de:
            android.content.res.Resources r8 = r11.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r8 = r8.heightPixels
        L1e8:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            th.d r12 = new th.d
            r12.<init>(r4, r8, r10)
            ya.g.d(r11, r12)
            r4.m r8 = new r4.m
            r12 = 6
            r8.<init>(r12)
            wb.kn r12 = new wb.kn
            r13 = 12
            r12.<init>(r8, r13)
            java.lang.Object r8 = tf.m.E1(r10, r12)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 == 0) goto L287
            int[] r10 = new int[r5]
            r8.getLocationOnScreen(r10)
            r12 = r10[r3]
            r10 = r10[r9]
            int r13 = uf.d.e(r8)
            int r14 = uf.d.d(r8)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r13 <= 0) goto L221
            if (r14 > 0) goto L224
        L221:
            r16 = r3
            goto L27a
        L224:
            r16 = r3
            android.widget.TextView r3 = ya.g.c(r8)
            if (r3 == 0) goto L27a
            int[] r6 = new int[r5]
            r3.getLocationOnScreen(r6)
            r6 = r6[r16]
            float r6 = (float) r6
            int r3 = uf.d.e(r3)
            float r3 = (float) r3
            float r3 = r3 / r15
            float r3 = r3 + r6
            float r6 = (float) r13
            java.util.Set r13 = ya.g.f22386f
            int r13 = r13.size()
            float r13 = (float) r13
            float r13 = r6 / r13
            r38 = r15
            r15 = 1111490560(0x42400000, float:48.0)
            int r15 = uf.d.b(r8, r15)
            float r15 = (float) r15
            int r18 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r18 >= 0) goto L253
            r13 = r15
        L253:
            float r13 = r13 / r38
            float r15 = r3 - r13
            float r10 = (float) r10
            float r3 = r3 + r13
            float r13 = (float) r14
            r14 = 1060655596(0x3f3851ec, float:0.72)
            float r14 = r14 * r13
            float r14 = r14 + r10
            float r12 = (float) r12
            float r6 = r6 + r12
            float r13 = r13 + r10
            r18 = r9
            ya.f r9 = new ya.f
            float r12 = java.lang.Math.max(r15, r12)
            float r10 = java.lang.Math.max(r10, r10)
            float r3 = java.lang.Math.min(r3, r6)
            float r6 = java.lang.Math.min(r14, r13)
            r9.<init>(r12, r10, r3, r6)
            goto L27f
        L27a:
            r18 = r9
            r38 = r15
            r9 = 0
        L27f:
            if (r9 == 0) goto L287
            boolean r3 = r9.a(r0, r2)
            if (r3 != 0) goto L28a
        L287:
            r6 = 0
            goto L3a7
        L28a:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            ya.d r6 = new ya.d
            r6.<init>(r4, r0, r2, r3)
            ya.g.d(r8, r6)
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L359
            r4.m r0 = new r4.m
            r2 = 7
            r0.<init>(r2)
            wb.kn r2 = new wb.kn
            r6 = 13
            r2.<init>(r0, r6)
            java.lang.Object r0 = tf.m.E1(r3, r2)
            ya.e r0 = (ya.e) r0
            if (r0 == 0) goto L287
            android.view.View r0 = r0.f22378a
            if (r0 == 0) goto L287
            int[] r2 = new int[r5]
            r0.getLocationOnScreen(r2)
            boolean r3 = r0 instanceof android.widget.TextView
            if (r3 == 0) goto L2c3
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L2c4
        L2c3:
            r3 = 0
        L2c4:
            ya.b r19 = new ya.b
            r22 = r2[r16]
            r23 = r2[r18]
            int r2 = uf.d.e(r0)
            r5 = r18
            if (r2 >= r5) goto L2d5
            r24 = r5
            goto L2d7
        L2d5:
            r24 = r2
        L2d7:
            int r2 = uf.d.d(r0)
            if (r2 >= r5) goto L2e0
            r25 = 1
            goto L2e2
        L2e0:
            r25 = r2
        L2e2:
            if (r3 == 0) goto L2eb
            java.lang.CharSequence r2 = r3.getText()
            r26 = r2
            goto L2ed
        L2eb:
            r26 = 0
        L2ed:
            if (r3 == 0) goto L2f6
            int r2 = r3.getCurrentTextColor()
        L2f3:
            r27 = r2
            goto L2f8
        L2f6:
            r2 = -1
            goto L2f3
        L2f8:
            if (r3 == 0) goto L301
            float r2 = r3.getTextSize()
        L2fe:
            r28 = r2
            goto L303
        L301:
            r2 = 0
            goto L2fe
        L303:
            if (r3 == 0) goto L30c
            android.graphics.Typeface r2 = r3.getTypeface()
            r29 = r2
            goto L30e
        L30c:
            r29 = 0
        L30e:
            if (r3 == 0) goto L317
            int r2 = r3.getGravity()
            r30 = r2
            goto L319
        L317:
            r30 = r16
        L319:
            if (r3 == 0) goto L322
            boolean r3 = r3.getIncludeFontPadding()
            r31 = r3
            goto L324
        L322:
            r31 = r16
        L324:
            int r32 = r0.getPaddingLeft()
            int r33 = r0.getPaddingTop()
            int r34 = r0.getPaddingRight()
            int r35 = r0.getPaddingBottom()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r2 == 0) goto L34d
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            if (r2 == 0) goto L34d
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
            if (r2 == 0) goto L34d
            android.graphics.drawable.Drawable r6 = r2.mutate()
            r36 = r6
            goto L34f
        L34d:
            r36 = 0
        L34f:
            r21 = r0
            r20 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r6 = r19
            goto L3a7
        L359:
            boolean r3 = r9.a(r0, r2)
            if (r3 != 0) goto L361
            goto L287
        L361:
            r3 = 1092616192(0x41200000, float:10.0)
            int r5 = uf.d.b(r11, r3)
            r3 = 1
            if (r5 >= r3) goto L36c
            r15 = 1
            goto L36d
        L36c:
            r15 = r5
        L36d:
            ya.b r10 = new ya.b
            float r3 = (float) r15
            float r3 = r3 / r38
            float r0 = r0 - r3
            int r13 = (int) r0
            float r2 = r2 - r3
            int r14 = (int) r2
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r3 = 1
            r0.setShape(r3)
            r2 = 250(0xfa, float:3.5E-43)
            r3 = 81
            int r2 = android.graphics.Color.rgb(r2, r3, r3)
            r0.setColor(r2)
            r12 = 0
            r17 = 0
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r16 = r15
            r27 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r6 = r10
        L3a7:
            if (r6 == 0) goto L3bb
            r4.a()
            ya.c r0 = new ya.c
            float r2 = r7.getRawX()
            float r3 = r7.getRawY()
            r0.<init>(r11, r6, r2, r3)
            r4.f22389c = r0
        L3bb:
            return
    }
}
