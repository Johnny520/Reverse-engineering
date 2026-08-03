package q9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements f8.d, sa.d, wa.h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f10738h;

    public /* synthetic */ a(android.content.SharedPreferences r1, c9.g r2) {
            r0 = this;
            r2 = 16
            r0.f10737g = r2
            r0.<init>()
            r0.f10738h = r1
            return
    }

    public /* synthetic */ a(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f10737g = r2
            r0.f10738h = r1
            r0.<init>()
            return
    }

    @Override // sa.d, m8.b
    public void a(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.f10738h
            ta.c r0 = (ta.c) r0
            r0.b(r2)
            return
    }

    @Override // f8.d
    public void b(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.f10737g
            switch(r1) {
                case 0: goto L176;
                case 1: goto L159;
                case 2: goto L13c;
                case 3: goto L11f;
                case 4: goto L7;
                case 5: goto Lc4;
                case 6: goto La7;
                case 7: goto L8a;
                case 8: goto L7;
                case 9: goto L6d;
                case 10: goto L7;
                case 11: goto L7;
                case 12: goto L5e;
                case 13: goto L41;
                case 14: goto L24;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f10738h
            z8.e r1 = (z8.e) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            v0.a r2 = new v0.a
            r3 = 12
            r2.<init>(r1, r3)
            r1 = 12
            java.lang.String r3 = "call_ringtone_block"
            java.lang.String r4 = "屏蔽通话铃声"
            r5 = 0
            r8.e.f(r1, r2, r3, r4, r5)
            return
        L24:
            java.lang.Object r1 = r0.f10738h
            z8.a r1 = (z8.a) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            v0.a r2 = new v0.a
            r3 = 11
            r2.<init>(r1, r3)
            r1 = 12
            java.lang.String r3 = "call_media_limit"
            java.lang.String r4 = "移除通话媒体限制"
            r5 = 0
            r8.e.f(r1, r2, r3, r4, r5)
            return
        L41:
            java.lang.Object r1 = r0.f10738h
            y9.c r1 = (y9.c) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            v0.a r2 = new v0.a
            r3 = 10
            r2.<init>(r1, r3)
            r1 = 12
            java.lang.String r3 = "member_title"
            java.lang.String r4 = "群员头衔"
            r5 = 0
            r8.e.f(r1, r2, r3, r4, r5)
            return
        L5e:
            java.lang.Object r1 = r0.f10738h
            xa.c r1 = (xa.c) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            r1.k()
            return
        L6d:
            java.lang.Object r1 = r0.f10738h
            u9.c r1 = (u9.c) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            i.e0 r2 = new i.e0
            r3 = 29
            r2.<init>(r1, r3)
            r1 = 12
            java.lang.String r3 = "hide_wechat_bottom_bar"
            java.lang.String r4 = "隐藏微信底栏"
            r5 = 0
            r8.e.f(r1, r2, r3, r4, r5)
            return
        L8a:
            java.lang.Object r1 = r0.f10738h
            b9.a r1 = (b9.a) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            i.e0 r2 = new i.e0
            r3 = 24
            r2.<init>(r1, r3)
            r1 = 12
            java.lang.String r3 = "hide_chat_menu"
            java.lang.String r4 = "隐藏长按菜单"
            r5 = 0
            r8.e.f(r1, r2, r3, r4, r5)
            return
        La7:
            java.lang.Object r1 = r0.f10738h
            b9.a r1 = (b9.a) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            i.e0 r2 = new i.e0
            r3 = 20
            r2.<init>(r1, r3)
            r1 = 12
            java.lang.String r3 = "hide_chat_avatar"
            java.lang.String r4 = "隐藏头像"
            r5 = 0
            r8.e.f(r1, r2, r3, r4, r5)
            return
        Lc4:
            java.lang.Object r1 = r0.f10738h
            s8.c r1 = (s8.c) r1
            r2 = r19
            f8.g r2 = (f8.g) r2
            if (r2 == 0) goto L11e
            long r3 = r2.f3339g
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L11e
            java.lang.String r3 = r2.f3335c
            if (r3 == 0) goto L11e
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto Le1
            goto L11e
        Le1:
            l8.d r3 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r7 = r2.f3335c
            java.lang.String r8 = r2.f3334b
            java.lang.String r9 = r2.f3336d
            long r10 = r2.f3338f
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lf3
            r4 = 1000(0x3e8, double:4.94E-321)
            long r5 = r10 * r4
        Lf3:
            r10 = r5
            boolean r12 = r2.f3343k
            java.lang.String r4 = r2.f3337e
            if (r4 == 0) goto L108
            r5 = 10
            java.lang.Integer r4 = og.t.e0(r5, r4)
            if (r4 == 0) goto L108
            int r4 = r4.intValue()
        L106:
            r13 = r4
            goto L10a
        L108:
            r4 = 0
            goto L106
        L10a:
            long r14 = r2.f3339g
            java.lang.String r4 = r2.f3340h
            java.lang.String r2 = r2.f3341i
            r3.getClass()
            r17 = r2
            r16 = r4
            h.Hchat.hooks.api.model.WeChatMessage r2 = l8.d.k(r7, r8, r9, r10, r12, r13, r14, r16, r17)
            r1.N(r2)
        L11e:
            return
        L11f:
            java.lang.Object r1 = r0.f10738h
            rb.b r1 = (rb.b) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            i.e0 r2 = new i.e0
            r3 = 16
            r2.<init>(r1, r3)
            r1 = 12
            java.lang.String r3 = "zombie_check"
            java.lang.String r4 = "僵尸粉检测"
            r5 = 0
            r8.e.f(r1, r2, r3, r4, r5)
            return
        L13c:
            java.lang.Object r1 = r0.f10738h
            r9.a r1 = (r9.a) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            i.e0 r2 = new i.e0
            r3 = 15
            r2.<init>(r1, r3)
            r1 = 12
            java.lang.String r3 = "hchat_extra"
            java.lang.String r4 = "分支扩展功能"
            r5 = 0
            r8.e.f(r1, r2, r3, r4, r5)
            return
        L159:
            java.lang.Object r1 = r0.f10738h
            qb.a r1 = (qb.a) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            i.e0 r2 = new i.e0
            r3 = 13
            r2.<init>(r1, r3)
            r1 = 12
            java.lang.String r3 = "voice_forward"
            java.lang.String r4 = "语音转发保存"
            r5 = 0
            r8.e.f(r1, r2, r3, r4, r5)
            return
        L176:
            java.lang.Object r1 = r0.f10738h
            hb.r r1 = (hb.r) r1
            r2 = r19
            f8.e r2 = (f8.e) r2
            r2.getClass()
            r1.p()
            return
    }

    @Override // wa.h
    public void c(java.lang.String r4, boolean r5) {
            r3 = this;
            java.lang.Object r5 = r3.f10738h
            android.content.Context r5 = (android.content.Context) r5
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            eb.w r1 = new eb.w
            r2 = 4
            r1.<init>(r5, r4, r2)
            r0.post(r1)
            return
    }

    public eb.l0 d(java.lang.String r9) {
            r8 = this;
            java.lang.Object r0 = r8.f10738h
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            r9.getClass()
            java.lang.String r1 = "message_affix_enable"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            r3 = 0
            if (r1 == 0) goto Lcc
            boolean r9 = og.m.t0(r9)
            if (r9 == 0) goto L19
            goto Lcc
        L19:
            java.lang.String r9 = "message_affix_text_format"
            java.lang.String r1 = "${sendText}"
            java.lang.String r9 = r0.getString(r9, r1)
            java.lang.String r4 = ""
            if (r9 != 0) goto L26
            r9 = r4
        L26:
            boolean r5 = og.m.t0(r9)
            if (r5 == 0) goto L2d
            r9 = r1
        L2d:
            r5 = r2
            r6 = r5
        L2f:
            r7 = 4
            int r5 = og.m.r0(r9, r1, r5, r2, r7)
            if (r5 >= 0) goto Lc6
            r5 = 1
            if (r6 == r5) goto L3b
            goto Lcc
        L3b:
            r5 = 6
            int r1 = og.m.r0(r9, r1, r2, r2, r5)
            java.lang.String r5 = "message_affix_time_format"
            java.lang.String r6 = "HH:mm:ss"
            java.lang.String r0 = r0.getString(r5, r6)
            if (r0 != 0) goto L4b
            goto L4c
        L4b:
            r4 = r0
        L4c:
            java.lang.CharSequence r0 = og.m.R0(r4)
            java.lang.String r0 = r0.toString()
            boolean r4 = og.m.t0(r0)
            if (r4 == 0) goto L5b
            r0 = r6
        L5b:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L6e
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L6e
            r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> L6e
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L6e
            r0.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = r4.format(r0)     // Catch: java.lang.Throwable -> L6e
            goto L75
        L6e:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L75:
            java.lang.Throwable r4 = sf.g.b(r0)
            if (r4 != 0) goto L7c
            goto L8e
        L7c:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r4 = java.util.Locale.getDefault()
            r0.<init>(r6, r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            java.lang.String r0 = r0.format(r4)
        L8e:
            r0.getClass()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r9.substring(r2, r1)
            java.lang.String r5 = "${line}"
            java.lang.String r6 = "\n"
            java.lang.String r4 = og.t.a0(r4, r5, r6, r2)
            java.lang.String r7 = "${sendTime}"
            java.lang.String r4 = og.t.a0(r4, r7, r0, r2)
            int r1 = r1 + 11
            java.lang.String r9 = r9.substring(r1)
            java.lang.String r9 = og.t.a0(r9, r5, r6, r2)
            java.lang.String r9 = og.t.a0(r9, r7, r0, r2)
            int r0 = r4.length()
            if (r0 != 0) goto Lc0
            int r0 = r9.length()
            if (r0 != 0) goto Lc0
            goto Lc5
        Lc0:
            eb.l0 r3 = new eb.l0
            r3.<init>(r4, r9)
        Lc5:
            return r3
        Lc6:
            int r6 = r6 + 1
            int r5 = r5 + 11
            goto L2f
        Lcc:
            return r3
    }

    public void e() {
            r9 = this;
            java.lang.Object r0 = r9.f10738h
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = w0.m.f14786c
            monitor-enter(r1)
            java.lang.Object r2 = w0.m.f14791h     // Catch: java.lang.Throwable -> L3a
            r2.getClass()     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            int r4 = tf.n.e1(r2)     // Catch: java.lang.Throwable -> L3a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
            r4 = 0
            r5 = r4
        L1b:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L36
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L3a
            r7 = 1
            if (r5 != 0) goto L30
            boolean r8 = gg.l.a(r6, r0)     // Catch: java.lang.Throwable -> L3a
            if (r8 == 0) goto L30
            r5 = r7
            r7 = r4
        L30:
            if (r7 == 0) goto L1b
            r3.add(r6)     // Catch: java.lang.Throwable -> L3a
            goto L1b
        L36:
            w0.m.f14791h = r3     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)
            return
        L3a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
