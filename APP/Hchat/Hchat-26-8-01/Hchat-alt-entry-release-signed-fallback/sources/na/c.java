package na;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements k8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f9101b;

    public /* synthetic */ c(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f9100a = r2
            r0.f9101b = r1
            r0.<init>()
            return
    }

    @Override // k8.n
    public final void a(k8.o r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f9100a
            switch(r2) {
                case 0: goto L48c;
                case 1: goto L237;
                case 2: goto L37;
                default: goto L9;
            }
        L9:
            java.lang.Object r2 = r0.f9101b
            v8.q r2 = (v8.q) r2
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r2.f14276c
            java.lang.String r4 = r1.f7446c
            r4.getClass()
            boolean r4 = og.m.t0(r4)
            if (r4 == 0) goto L1b
            goto L36
        L1b:
            boolean r4 = r3.isShutdown()
            if (r4 == 0) goto L22
            goto L36
        L22:
            boolean r4 = r1.f7452i
            if (r4 == 0) goto L29
            r4 = 250(0xfa, double:1.235E-321)
            goto L2b
        L29:
            r4 = 0
        L2b:
            rb.g r6 = new rb.g     // Catch: java.lang.Throwable -> L36
            r7 = 5
            r6.<init>(r2, r7, r1)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L36
            r3.schedule(r6, r4, r1)     // Catch: java.lang.Throwable -> L36
        L36:
            return
        L37:
            java.lang.Object r2 = r0.f9101b
            o9.p r2 = (o9.p) r2
            android.content.SharedPreferences r3 = r2.f9663b
            java.lang.String r4 = "group_invite_detail_enable"
            r5 = 0
            boolean r3 = r3.getBoolean(r4, r5)
            if (r3 != 0) goto L48
            goto L236
        L48:
            boolean r3 = r1.s()
            if (r3 == 0) goto L236
            boolean r3 = r1.j()
            if (r3 != 0) goto L56
            goto L236
        L56:
            java.lang.String r3 = r1.d()
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L71
            java.lang.String r3 = r1.f7446c
            java.lang.String r3 = p.a.l(r3, r3)
        L71:
            int r4 = r3.length()
            if (r4 != 0) goto L79
            goto L236
        L79:
            java.lang.String r4 = r1.a()
            java.lang.String r6 = r1.f7449f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r4.getClass()
            boolean r8 = og.m.t0(r4)
            if (r8 != 0) goto L90
            r7.append(r4)
        L90:
            r6.getClass()
            boolean r8 = og.m.t0(r6)
            if (r8 != 0) goto La7
            int r8 = r7.length()
            if (r8 <= 0) goto La4
            r8 = 10
            r7.append(r8)
        La4:
            r7.append(r6)
        La7:
            java.lang.String r7 = r7.toString()
            boolean r8 = og.m.t0(r7)
            r9 = 0
            if (r8 == 0) goto Lb4
            goto L219
        Lb4:
            java.lang.String r8 = o9.p.i(r7)
            java.util.List r10 = o9.p.f9657k
            r11 = 1
            if (r10 == 0) goto Lc5
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto Lc5
        Lc3:
            r10 = r5
            goto Ldc
        Lc5:
            java.util.Iterator r10 = r10.iterator()
        Lc9:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lc3
            java.lang.Object r12 = r10.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = og.m.h0(r8, r12, r11)
            if (r12 == 0) goto Lc9
            r10 = r11
        Ldc:
            java.util.List r12 = o9.p.f9658l
            if (r12 == 0) goto Le8
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto Le8
        Le6:
            r12 = r5
            goto Lff
        Le8:
            java.util.Iterator r12 = r12.iterator()
        Lec:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Le6
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = og.m.h0(r8, r13, r11)
            if (r13 == 0) goto Lec
            r12 = r11
        Lff:
            java.util.List r13 = o9.p.f9659m
            if (r13 == 0) goto L10b
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L10b
        L109:
            r8 = r5
            goto L122
        L10b:
            java.util.Iterator r13 = r13.iterator()
        L10f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L109
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            boolean r14 = og.m.h0(r8, r14, r11)
            if (r14 == 0) goto L10f
            r8 = r11
        L122:
            if (r10 == 0) goto L219
            if (r12 == 0) goto L219
            if (r8 != 0) goto L219
            java.lang.String[] r4 = new java.lang.String[]{r6, r4}
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r8 = r5
        L132:
            r10 = 2
            if (r8 < r10) goto L203
            java.util.Collection r4 = r6.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = tf.m.P1(r4)
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L14a
            goto L219
        L14a:
            java.lang.String r1 = r1.c()
            boolean r6 = o9.p.r(r3, r1)
            if (r6 == 0) goto L155
            goto L156
        L155:
            r1 = r9
        L156:
            java.lang.String r6 = ""
            if (r1 == 0) goto L160
            o9.i r8 = new o9.i
            r8.<init>(r1, r6)
            goto L161
        L160:
            r8 = r9
        L161:
            i8.a r1 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r1.getClass()
            g8.a r1 = h.Hchat.hooks.api.core.WeChatApis.a()
            if (r1 == 0) goto L184
            java.lang.String r1 = r1.c()
            if (r1 == 0) goto L184
            boolean r12 = o9.p.r(r3, r1)
            if (r12 == 0) goto L17b
            goto L17c
        L17b:
            r1 = r9
        L17c:
            if (r1 == 0) goto L184
            o9.i r12 = new o9.i
            r12.<init>(r1, r6)
            goto L185
        L184:
            r12 = r9
        L185:
            int r1 = r4.size()
            if (r1 < r10) goto L196
            java.lang.Object r1 = tf.m.t1(r4)
            o9.i r1 = (o9.i) r1
            java.util.List r4 = tf.m.q1(r11, r4)
            goto L1ab
        L196:
            if (r8 == 0) goto L199
            goto L1aa
        L199:
            if (r12 == 0) goto L1a7
            java.lang.String r1 = "你邀请"
            boolean r1 = og.m.h0(r7, r1, r5)
            if (r1 == 0) goto L1a4
            goto L1a5
        L1a4:
            r12 = r9
        L1a5:
            r8 = r12
            goto L1a8
        L1a7:
            r8 = r9
        L1a8:
            if (r8 == 0) goto L219
        L1aa:
            r1 = r8
        L1ab:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1b4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L1cf
            java.lang.Object r6 = r4.next()
            r7 = r6
            o9.i r7 = (o9.i) r7
            java.lang.String r7 = r7.f9636a
            java.lang.String r8 = r1.f9636a
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L1b4
            r5.add(r6)
            goto L1b4
        L1cf:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L1dd:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L1f6
            java.lang.Object r7 = r5.next()
            r8 = r7
            o9.i r8 = (o9.i) r8
            java.lang.String r8 = r8.f9636a
            boolean r8 = r4.add(r8)
            if (r8 == 0) goto L1dd
            r6.add(r7)
            goto L1dd
        L1f6:
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L1fd
            goto L219
        L1fd:
            o9.h r9 = new o9.h
            r9.<init>(r1, r6)
            goto L219
        L203:
            r10 = r4[r8]
            o9.p.h(r3, r10, r6)
            java.lang.String r12 = o9.p.i(r10)
            boolean r10 = r12.equals(r10)
            if (r10 != 0) goto L215
            o9.p.h(r3, r12, r6)
        L215:
            int r8 = r8 + 1
            goto L132
        L219:
            if (r9 == 0) goto L236
            o9.i r1 = r9.f9634a
            r2.C(r3, r1)
            java.util.ArrayList r1 = r9.f9635b
            java.util.Iterator r1 = r1.iterator()
        L226:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L236
            java.lang.Object r4 = r1.next()
            o9.i r4 = (o9.i) r4
            r2.C(r3, r4)
            goto L226
        L236:
            return
        L237:
            java.lang.Object r2 = r0.f9101b
            b9.a r2 = (b9.a) r2
            java.lang.Object r2 = r2.f524f
            r4 = r2
            nb.w r4 = (nb.w) r4
            if (r4 == 0) goto L48b
            nb.z r2 = r4.y()
            java.lang.String r3 = "text_speech_enable"
            boolean r3 = r2.b(r3)
            if (r3 == 0) goto L48b
            boolean r3 = r1.f7452i
            if (r3 != 0) goto L48b
            boolean r3 = r1.q()
            if (r3 == 0) goto L25a
            goto L48b
        L25a:
            boolean r3 = r1.u()
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L26c
            java.lang.String r3 = "text_speech_play_voice_messages"
            boolean r3 = r2.b(r3)
            if (r3 == 0) goto L26c
            r3 = r6
            goto L26d
        L26c:
            r3 = r5
        L26d:
            java.lang.String r7 = "text"
            java.lang.String r8 = r1.f7445b
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L27b
            if (r3 != 0) goto L27b
            goto L48b
        L27b:
            java.lang.String r7 = r1.f7446c
            boolean r8 = og.m.t0(r7)
            if (r8 == 0) goto L287
            java.lang.String r7 = r1.d()
        L287:
            java.lang.String r10 = p.a.l(r7, r7)
            int r7 = r10.length()
            if (r7 != 0) goto L293
            goto L48b
        L293:
            java.util.Set r7 = r2.a()
            boolean r7 = r7.contains(r10)
            if (r7 != 0) goto L29f
            goto L48b
        L29f:
            boolean r7 = nb.w.k(r2)
            if (r7 == 0) goto L2a7
            goto L48b
        L2a7:
            h.Hchat.hooks.api.model.WeChatMessage r7 = r1.f7454k
            r8 = 0
            if (r3 == 0) goto L34b
            if (r7 == 0) goto L2b0
            r15 = r7
            goto L2b3
        L2b0:
            h.Hchat.hooks.api.model.WeChatMessage r2 = r1.f7453j
            r15 = r2
        L2b3:
            r2 = 0
            if (r7 == 0) goto L2bc
            long r5 = r7.getMsgId()
            goto L2bd
        L2bc:
            r5 = r2
        L2bd:
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L2c6
            goto L2c7
        L2c6:
            r7 = r8
        L2c7:
            if (r7 == 0) goto L2cf
            long r5 = r7.longValue()
        L2cd:
            r11 = r5
            goto L2d5
        L2cf:
            if (r15 == 0) goto L2d4
            long r5 = r15.msgId
            goto L2cd
        L2d4:
            r11 = r2
        L2d5:
            if (r15 == 0) goto L2db
            long r5 = r15.msgSvrId
            r13 = r5
            goto L2dc
        L2db:
            r13 = r2
        L2dc:
            int r5 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            java.lang.String r6 = ":"
            if (r5 <= 0) goto L2f8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "svr:"
            r1.<init>(r2)
            r1.append(r10)
            r1.append(r6)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
        L2f6:
            r9 = r1
            goto L31e
        L2f8:
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 <= 0) goto L303
            java.lang.String r1 = "local:"
            java.lang.String r1 = bc.e.g(r11, r1)
            goto L2f6
        L303:
            if (r15 == 0) goto L307
            long r2 = r15.createTime
        L307:
            java.lang.String r1 = r1.f7448e
            int r1 = r1.hashCode()
            java.lang.String r5 = "transient:"
            java.lang.StringBuilder r2 = eh.a.v(r5, r10, r6, r2)
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L2f6
        L31e:
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r4.f9314d
            boolean r1 = r1.add(r9)
            if (r1 != 0) goto L328
            goto L48b
        L328:
            if (r15 == 0) goto L32e
            java.util.List r8 = nb.w.C(r15)
        L32e:
            if (r8 != 0) goto L332
            tf.t r8 = tf.t.f13167g
        L332:
            r16 = r8
            nb.k r5 = new nb.k
            r8 = r5
            r8.<init>(r9, r10, r11, r13, r15, r16)
            long r6 = r4.f9336z
            android.os.Handler r1 = r4.f9312b
            nb.h r3 = new nb.h
            r8 = 0
            r3.<init>(r4, r5, r6, r8)
            r4 = 300(0x12c, double:1.48E-321)
            r1.postDelayed(r3, r4)
            goto L48b
        L34b:
            if (r7 == 0) goto L352
            java.lang.String r3 = r7.bodyContent()
            goto L353
        L352:
            r3 = r8
        L353:
            java.lang.String r7 = ""
            if (r3 != 0) goto L358
            r3 = r7
        L358:
            boolean r9 = og.m.t0(r3)
            if (r9 == 0) goto L36a
            java.lang.String r3 = r1.f7448e
            boolean r9 = og.m.t0(r3)
            if (r9 == 0) goto L36a
            java.lang.String r3 = r1.a()
        L36a:
            og.k r9 = nb.w.A
            java.lang.String r3 = r9.f(r3, r7)
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            int r11 = r3.length()
            if (r11 != 0) goto L37f
            goto L3b7
        L37f:
            java.lang.String r11 = "<?xml"
            boolean r11 = og.t.d0(r3, r11, r6)
            if (r11 != 0) goto L3b7
            java.lang.String r11 = "<msg"
            boolean r11 = og.t.d0(r3, r11, r6)
            if (r11 != 0) goto L3b7
            java.lang.String r11 = "<appmsg"
            boolean r11 = og.t.d0(r3, r11, r6)
            if (r11 == 0) goto L398
            goto L3b7
        L398:
            java.lang.String r11 = "\\s+"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)
            r11.getClass()
            java.lang.String r12 = " "
            java.util.regex.Matcher r3 = r11.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r12)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            goto L3b8
        L3b7:
            r3 = r7
        L3b8:
            int r11 = r3.length()
            if (r11 != 0) goto L3c0
            goto L48b
        L3c0:
            java.lang.String r11 = "text_speech_announce_sender"
            boolean r2 = r2.b(r11)
            if (r2 == 0) goto L480
            boolean r2 = r1.f7451h
            if (r2 != 0) goto L3d5
            boolean r2 = r1.j()
            if (r2 == 0) goto L3d3
            goto L3d5
        L3d3:
            r2 = r5
            goto L3d6
        L3d5:
            r2 = r6
        L3d6:
            java.lang.String r11 = r1.f7447d
            boolean r12 = og.m.t0(r11)
            if (r12 == 0) goto L3e2
            java.lang.String r11 = r1.c()
        L3e2:
            java.lang.String r11 = p.a.l(r11, r11)
            g8.i r12 = wb.en.c()
            if (r2 != 0) goto L407
            boolean r1 = og.m.t0(r11)
            if (r1 == 0) goto L3f3
            goto L3f4
        L3f3:
            r10 = r11
        L3f4:
            if (r12 == 0) goto L3fa
            java.lang.String r8 = r12.r(r10)
        L3fa:
            if (r8 != 0) goto L3fd
            goto L3fe
        L3fd:
            r7 = r8
        L3fe:
            boolean r1 = og.m.t0(r7)
            if (r1 == 0) goto L474
            r7 = r10
            goto L474
        L407:
            if (r2 == 0) goto L442
            int r2 = r11.length()
            if (r2 != 0) goto L410
            goto L41e
        L410:
            boolean r2 = r11.equals(r10)
            if (r2 != 0) goto L41e
            java.lang.String r2 = "@chatroom"
            boolean r2 = og.t.W(r11, r2, r5)
            if (r2 == 0) goto L442
        L41e:
            java.lang.String r1 = r1.f7448e
            r1.getClass()
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            og.i r1 = og.k.b(r9, r1)
            if (r1 == 0) goto L43c
            java.util.List r1 = r1.a()
            java.lang.Object r1 = tf.m.w1(r6, r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L43d
        L43c:
            r1 = r8
        L43d:
            if (r1 != 0) goto L441
            r11 = r7
            goto L442
        L441:
            r11 = r1
        L442:
            int r1 = r11.length()
            if (r1 != 0) goto L449
            goto L474
        L449:
            boolean r1 = r11.equals(r10)
            if (r1 == 0) goto L450
            goto L474
        L450:
            if (r12 == 0) goto L457
            java.lang.String r1 = r12.t(r10, r11)
            goto L458
        L457:
            r1 = r8
        L458:
            if (r1 != 0) goto L45b
            r1 = r7
        L45b:
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L46c
            if (r12 == 0) goto L467
            java.lang.String r8 = r12.r(r11)
        L467:
            if (r8 != 0) goto L46a
            goto L46d
        L46a:
            r7 = r8
            goto L46d
        L46c:
            r7 = r1
        L46d:
            boolean r1 = og.m.t0(r7)
            if (r1 == 0) goto L474
            r7 = r11
        L474:
            int r1 = r7.length()
            if (r1 <= 0) goto L480
            java.lang.String r1 = " 说，"
            java.lang.String r3 = wb.en.h(r7, r1, r3)
        L480:
            android.os.Handler r1 = r4.f9312b
            nb.f r2 = new nb.f
            r5 = 0
            r2.<init>(r4, r3, r5)
            r1.post(r2)
        L48b:
            return
        L48c:
            java.lang.Object r2 = r0.f9101b
            r3 = r2
            na.e r3 = (na.e) r3
            java.lang.String r2 = r1.f7449f
            java.lang.String r4 = r1.f7448e
            java.lang.String r5 = "red_packet"
            java.lang.String r6 = r1.f7445b
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L4a1
            goto L548
        L4a1:
            java.lang.String r5 = r1.f7450g
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L4aa
            goto L4ab
        L4aa:
            r2 = r4
        L4ab:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r7 = "nativeurl"
            if (r6 == 0) goto L4b7
            java.lang.String r5 = oa.b.e(r2, r7)
        L4b7:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L4c7
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L4c7
            java.lang.String r5 = oa.b.e(r4, r7)
        L4c7:
            r8 = r5
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 == 0) goto L4d0
            goto L548
        L4d0:
            java.lang.String r5 = "exclusive_recv_username"
            java.lang.String r6 = oa.b.e(r2, r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L4e6
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L4e6
            java.lang.String r6 = oa.b.e(r4, r5)
        L4e6:
            r9 = r6
            java.lang.String r5 = "fromusername"
            java.lang.String r6 = oa.b.e(r2, r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L4fd
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L4fd
            java.lang.String r6 = oa.b.e(r4, r5)
        L4fd:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 == 0) goto L509
            java.lang.String r5 = "sendusername"
            java.lang.String r6 = oa.b.d(r8, r5)
        L509:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 == 0) goto L522
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L522
            java.lang.String r5 = ":\n"
            int r5 = r4.indexOf(r5)
            if (r5 <= 0) goto L522
            r6 = 0
            java.lang.String r6 = r4.substring(r6, r5)
        L522:
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L52a
            java.lang.String r6 = r1.f7447d
        L52a:
            java.lang.String r6 = oa.b.g(r6)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Observe:"
            r4.<init>(r5)
            java.lang.String r5 = r1.f7444a
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = r1.f7446c
            java.lang.String r7 = oa.b.g(r1)
            r5 = r2
            r3.e(r4, r5, r6, r7, r8, r9)
        L548:
            return
    }
}
