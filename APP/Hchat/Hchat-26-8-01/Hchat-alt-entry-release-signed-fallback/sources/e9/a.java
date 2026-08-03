package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements f8.d, i0.e2, k7.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2387i;

    public /* synthetic */ a(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f2385g = r2
            r0.f2387i = r1
            r0.f2386h = r3
            r0.<init>()
            return
    }

    @Override // i0.e2
    public boolean a() {
            r8 = this;
            java.lang.Object r0 = r8.f2387i
            s.z0 r0 = (s.z0) r0
            java.lang.Object r1 = r8.f2386h
            s.c r1 = (s.c) r1
            boolean r2 = r0.f12173q
            if (r2 != 0) goto L26
            r0.h()
            long r2 = r0.f12171o
            long r4 = r1.f11983a
            long r2 = s.c.a(r2, r4)
            r1.f11983a = r2
            long r4 = r0.f12170n
            long r6 = r1.f11984b
            long r2 = r2 + r6
            boolean r1 = r0.g(r4, r2)
            r1 = r1 ^ 1
            r0.f12173q = r1
        L26:
            boolean r0 = r0.f12173q
            return r0
    }

    @Override // f8.d
    public void b(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f2385g
            r1 = 1
            r2 = 3
            r3 = 12
            r4 = 0
            r5 = 8
            r8.c r6 = r8.c.f11604j
            java.lang.Object r7 = r9.f2386h
            java.lang.Object r8 = r9.f2387i
            switch(r0) {
                case 0: goto L189;
                case 1: goto L171;
                case 2: goto L157;
                case 3: goto L12;
                case 4: goto L130;
                case 5: goto L12;
                case 6: goto L12;
                case 7: goto L118;
                case 8: goto Lef;
                case 9: goto Ld7;
                case 10: goto L12;
                case 11: goto L97;
                case 12: goto L12;
                case 13: goto L7e;
                case 14: goto L3b;
                default: goto L12;
            }
        L12:
            c9.g r8 = (c9.g) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            i8.c r10 = h.Hchat.hooks.api.core.WeChatApis.message()
            r10.getClass()
            k8.p r10 = h.Hchat.hooks.api.core.WeChatApis.l()
            if (r10 != 0) goto L2e
            java.lang.String r10 = "[Hchat:KeywordNotification] 消息观察 API 未就绪"
            fb.v0.m(r10)
            goto L3a
        L2e:
            e9.b r0 = new e9.b
            r0.<init>(r7, r2)
            a2.a r10 = r10.e(r0)
            r8.j(r10)
        L3a:
            return
        L3b:
            c9.g r8 = (c9.g) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            i8.c r10 = h.Hchat.hooks.api.core.WeChatApis.message()
            r10.getClass()
            k8.p r10 = h.Hchat.hooks.api.core.WeChatApis.l()
            if (r10 != 0) goto L57
            java.lang.String r10 = "[Hchat:AutoReply] 消息观察 API 未就绪"
            fb.v0.m(r10)
            goto L64
        L57:
            e9.b r0 = new e9.b
            r1 = 2
            r0.<init>(r7, r1)
            a2.a r10 = r10.e(r0)
            r8.j(r10)
        L64:
            eb.k r10 = eb.k.f2567a
            r10.j(r7)
            c9.o1 r10 = new c9.o1
            r10.<init>(r7)
            java.util.concurrent.CopyOnWriteArrayList r0 = eb.k.f2570d
            r0.add(r10)
            a2.a r10 = new a2.a
            r0 = 9
            r10.<init>(r0)
            r8.j(r10)
            return
        L7e:
            c9.g r8 = (c9.g) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            android.os.Handler r10 = r8.e.f11615a
            sh.v1 r10 = new sh.v1
            r0 = 5
            r10.<init>(r7, r0, r8)
            java.lang.String r0 = "protobuf_packet"
            java.lang.String r1 = "Protobuf"
            r8.e.f(r5, r10, r0, r1, r6)
            return
        L97:
            b9.a r8 = (b9.a) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            java.lang.Object r10 = r8.f524f
            v8.q r10 = (v8.q) r10
            if (r10 == 0) goto La7
            goto Ld6
        La7:
            i8.c r10 = h.Hchat.hooks.api.core.WeChatApis.message()
            r10.getClass()
            k8.p r10 = h.Hchat.hooks.api.core.WeChatApis.l()
            if (r10 != 0) goto Lba
            java.lang.String r10 = "[Hchat:AutoMessageForward] 消息观察 API 未就绪"
            fb.v0.m(r10)
            goto Ld6
        Lba:
            v8.q r0 = new v8.q
            android.content.Context r1 = r7.f11620a
            i2.y r3 = new i2.y
            r4 = 28
            r3.<init>(r4)
            r0.<init>(r1, r3)
            r8.f524f = r0
            na.c r1 = new na.c
            r1.<init>(r0, r2)
            a2.a r10 = r10.e(r1)
            r8.j(r10)
        Ld6:
            return
        Ld7:
            ua.b r8 = (ua.b) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            android.os.Handler r10 = r8.e.f11615a
            sh.v1 r10 = new sh.v1
            r10.<init>(r7, r1, r8)
            java.lang.String r0 = "auto_transfer"
            java.lang.String r1 = "自动收款"
            r8.e.f(r5, r10, r0, r1, r6)
            return
        Lef:
            c9.g r8 = (c9.g) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            i8.c r10 = h.Hchat.hooks.api.core.WeChatApis.message()
            r10.getClass()
            k8.p r10 = h.Hchat.hooks.api.core.WeChatApis.l()
            if (r10 != 0) goto L10b
            java.lang.String r10 = "[Hchat:BlockAtAllNotification] 消息观察 API 未就绪"
            fb.v0.m(r10)
            goto L117
        L10b:
            e9.b r0 = new e9.b
            r0.<init>(r7, r1)
            a2.a r10 = r10.e(r0)
            r8.j(r10)
        L117:
            return
        L118:
            s8.c r8 = (s8.c) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            aa.c r10 = new aa.c
            r0 = 29
            r10.<init>(r8, r0, r7)
            java.lang.String r0 = "anti_recall"
            java.lang.String r1 = "防撤回"
            r8.e.f(r3, r10, r0, r1, r4)
            return
        L130:
            ob.f r8 = (ob.f) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            android.os.Handler r10 = r8.e.f11615a
            c9.f r10 = new c9.f
            r0 = 6
            r10.<init>(r7, r0)
            java.lang.String r0 = "shared:send_button"
            java.lang.String r1 = "聊天发送按钮"
            r8.e.f(r5, r10, r0, r1, r6)
            i.e0 r10 = new i.e0
            r0 = 10
            r10.<init>(r8, r0)
            java.lang.String r0 = "text_voice"
            java.lang.String r1 = "文本转语音"
            r8.e.f(r3, r10, r0, r1, r4)
            return
        L157:
            b9.a r8 = (b9.a) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            android.os.Handler r10 = r8.e.f11615a
            aa.c r10 = new aa.c
            r0 = 22
            r10.<init>(r8, r0, r7)
            java.lang.String r0 = "auto_redpacket"
            java.lang.String r1 = "自动抢红包"
            r8.e.f(r5, r10, r0, r1, r6)
            return
        L171:
            ia.u r8 = (ia.u) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            aa.c r10 = new aa.c
            r0 = 18
            r10.<init>(r8, r0, r7)
            java.lang.String r0 = "moments_fake_interaction_sns_menu"
            java.lang.String r1 = "朋友圈伪互动"
            r8.e.f(r3, r10, r0, r1, r4)
            return
        L189:
            c9.g r8 = (c9.g) r8
            r8.g r7 = (r8.g) r7
            f8.e r10 = (f8.e) r10
            r10.getClass()
            i8.c r10 = h.Hchat.hooks.api.core.WeChatApis.message()
            r10.getClass()
            k8.p r10 = h.Hchat.hooks.api.core.WeChatApis.l()
            if (r10 != 0) goto L1a5
            java.lang.String r10 = "[Hchat:CustomNotification] 消息观察 API 未就绪"
            fb.v0.m(r10)
            goto L1b2
        L1a5:
            e9.b r0 = new e9.b
            r1 = 0
            r0.<init>(r7, r1)
            a2.a r10 = r10.e(r0)
            r8.j(r10)
        L1b2:
            return
    }

    public java.lang.Object c(java.io.InputStream r65, long r66) {
            r64 = this;
            r0 = r64
            java.lang.Object r1 = r0.f2387i
            bc.q r1 = (bc.q) r1
            java.lang.Object r2 = r0.f2386h
            bc.o r2 = (bc.o) r2
            r1.getClass()
            bc.p r3 = r2.f758b
            java.lang.String r2 = r2.f757a
            bc.p r4 = bc.p.f761i
            if (r3 != r4) goto L8e1
            java.util.ArrayList r1 = r1.f768b
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L1c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r3 = r1.next()
            df.h r3 = (df.h) r3
            r3.getClass()
            java.lang.String r4 = ".arsc"
            boolean r4 = r2.endsWith(r4)
            if (r4 != 0) goto L35
            r3 = 0
            goto L3d
        L35:
            df.g r4 = new df.g
            ud.u r3 = r3.f2229a
            r4.<init>(r3)
            r3 = r4
        L3d:
            if (r3 == 0) goto L1c
        L3f:
            if (r3 == 0) goto L8d5
            long r1 = java.lang.System.currentTimeMillis()
            df.e r4 = new df.e
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream
            r7 = 32768(0x8000, float:4.5918E-41)
            r8 = r65
            r6.<init>(r8, r7)
            r4.<init>(r6)
            r3.f2210b = r4
            df.i r4 = new df.i
            ud.u r6 = r3.f2226d
            bc.g r7 = r6.f13742a
            ad.c r8 = r7.K
            r4.<init>(r8)
            r3.f2227e = r4
            mh.b r4 = df.g.f2224g
            df.e r8 = r3.f2210b
            java.lang.String r9 = "Not a table chunk"
            r10 = 2
            r8.a(r10, r9)
            df.e r8 = r3.f2210b
            java.lang.String r9 = "Unexpected table header size"
            r11 = 12
            r8.a(r11, r9)
            df.e r8 = r3.f2210b
            int r8 = r8.e()
            df.e r9 = r3.f2210b
            int r9 = r9.e()
            r13 = 0
        L83:
            df.e r14 = r3.f2210b
            r66 = r13
            long r12 = r14.f2220h
            r15 = r6
            r67 = 0
            long r5 = (long) r8
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 >= 0) goto L884
            int r5 = r14.c()
            df.e r6 = r3.f2210b
            int r6 = r6.c()
            df.e r14 = r3.f2210b
            int r14 = r14.e()
            r16 = r10
            long r10 = (long) r14
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r17
            long r10 = r10 + r12
            r14 = 1
            if (r5 == r14) goto L85a
            r14 = 512(0x200, float:7.17E-43)
            if (r5 == r14) goto Lbf
            r26 = r1
            r42 = r7
            r28 = r8
            r29 = r9
            r40 = r15
            goto L86a
        Lbf:
            df.e r5 = r3.f2210b
            r14 = 284(0x11c, float:3.98E-43)
            if (r6 < r14) goto L84a
            int r5 = r5.e()
            df.e r14 = r3.f2210b
            r0 = 128(0x80, float:1.8E-43)
            java.lang.String r14 = r14.i(r0)
            df.e r0 = r3.f2210b
            int r0 = r0.e()
            r26 = r1
            long r0 = (long) r0
            long r0 = r0 + r12
            df.e r2 = r3.f2210b
            r2.e()
            df.e r2 = r3.f2210b
            int r2 = r2.e()
            r28 = r8
            r29 = r9
            long r8 = (long) r2
            long r8 = r8 + r12
            df.e r2 = r3.f2210b
            r2.e()
            r2 = 288(0x120, float:4.04E-43)
            if (r6 < r2) goto Lfa
            df.e r2 = r3.f2210b
            r2.e()
        Lfa:
            df.e r2 = r3.f2210b
            r30 = r5
            long r5 = (long) r6
            long r12 = r12 + r5
            java.lang.String r5 = "package header end"
            r2.k(r12, r5)
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L117
            df.e r2 = r3.f2210b
            java.lang.String r12 = "Expected typeStrings string pool"
            r2.k(r0, r12)
            df.a r0 = r3.b()
            goto L119
        L117:
            r0 = r67
        L119:
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L129
            df.e r1 = r3.f2210b
            java.lang.String r2 = "Expected keyStrings string pool"
            r1.k(r8, r2)
            df.a r1 = r3.b()
            goto L12b
        L129:
            r1 = r67
        L12b:
            df.i r2 = r3.f2227e
            ad.c r5 = r2.f2232b
            java.util.Set r5 = r5.f225a
            zc.a r6 = zc.a.f22658g
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L164
            java.util.regex.Pattern r5 = kd.d.f7584a
            xe.q r5 = xe.q.f21574b
            if (r14 == 0) goto L15a
            boolean r5 = r14.isEmpty()
            if (r5 != 0) goto L15a
            java.util.HashSet r5 = kd.d.f7586c
            boolean r5 = r5.contains(r14)
            if (r5 != 0) goto L15a
            java.util.regex.Pattern r5 = kd.d.f7585b
            java.util.regex.Matcher r5 = r5.matcher(r14)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L15a
            goto L164
        L15a:
            mh.b r5 = ad.c.f224c
            java.lang.String r6 = "App package '{}' has invalid format and will be ignored"
            r5.h(r14, r6)
            java.lang.String r5 = "INVALID_PACKAGE"
            goto L165
        L164:
            r5 = r14
        L165:
            r2.f2233c = r5
        L167:
            df.e r2 = r3.f2210b
            long r5 = r2.f2220h
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 >= 0) goto L841
            int r2 = r2.c()
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.String r12 = "res package chunk start at {} type {}"
            r4.p(r8, r12, r9)
            if (r2 == 0) goto L819
            r8 = 16
            switch(r2) {
                case 513: goto L2dd;
                case 514: goto L295;
                case 515: goto L22a;
                case 516: goto L1f8;
                case 517: goto L1e4;
                case 518: goto L1a3;
                default: goto L187;
            }
        L187:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "Unknown chunk type {} encountered at offset {}"
            r4.s(r2, r6, r5)
        L194:
            r62 = r0
            r63 = r1
            r42 = r7
            r33 = r10
            r23 = r14
            r40 = r15
            r8 = 1
            goto L831
        L1a3:
            java.lang.String r2 = "parsing staged alias chunk starting at offset {}"
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r4.k(r2, r8)
            df.e r2 = r3.f2210b
            r2.c()
            df.e r2 = r3.f2210b
            int r2 = r2.e()
            long r8 = (long) r2
            long r5 = r5 + r8
            df.e r2 = r3.f2210b
            int r2 = r2.e()
            r8 = 0
        L1c0:
            df.e r9 = r3.f2210b
            if (r8 >= r2) goto L1de
            int r9 = r9.e()
            df.e r12 = r3.f2210b
            int r12 = r12.e()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "Staged alias: stagedResId {} finalizedResId {}"
            r4.y(r9, r13, r12)
            int r8 = r8 + 1
            goto L1c0
        L1de:
            java.lang.String r2 = "staged alias chunk end"
            r9.k(r5, r2)
            goto L194
        L1e4:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Encountered unsupported chunk type RES_TABLE_TYPE_OVERLAY_POLICY at offset 0x%x "
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L1f8:
            java.lang.String r2 = "parsing overlay type chunk starting at offset {}"
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r4.k(r2, r8)
            df.e r2 = r3.f2210b
            r2.c()
            df.e r2 = r3.f2210b
            int r2 = r2.e()
            long r8 = (long) r2
            long r5 = r5 + r8
            df.e r2 = r3.f2210b
            r8 = 256(0x100, float:3.59E-43)
            java.lang.String r2 = r2.i(r8)
            df.e r9 = r3.f2210b
            java.lang.String r8 = r9.i(r8)
            java.lang.String r9 = "Overlay header data: name={} actor={}"
            r4.p(r2, r9, r8)
            df.e r2 = r3.f2210b
            java.lang.String r8 = "overlay chunk end"
            r2.k(r5, r8)
            goto L194
        L22a:
            java.lang.String r2 = "parsing library type chunk starting at offset {}"
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r4.k(r2, r8)
            df.e r2 = r3.f2210b
            java.lang.String r8 = "Unexpected header size"
            r9 = 12
            r2.a(r9, r8)
            df.e r2 = r3.f2210b
            int r2 = r2.e()
            long r12 = (long) r2
            long r12 = r12 + r5
            df.e r2 = r3.f2210b
            int r2 = r2.e()
            r8 = 0
        L24b:
            df.e r9 = r3.f2210b
            if (r8 >= r2) goto L279
            int r9 = r9.e()
            r20 = r2
            df.e r2 = r3.f2210b
            r21 = r8
            r8 = 128(0x80, float:1.8E-43)
            java.lang.String r2 = r2.i(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4.f(r9, r2)
            df.e r2 = r3.f2210b
            long r8 = r2.f2220h
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 > 0) goto L273
            int r8 = r21 + 1
            r2 = r20
            goto L24b
        L273:
            java.lang.String r0 = "reading after chunk end"
            j8.o.y(r0)
            return r67
        L279:
            long r8 = r9.f2220h
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 != 0) goto L281
        L27f:
            goto L194
        L281:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Error reading library chunk at offset 0x%x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L295:
            r2 = r8
            df.e r8 = r3.f2210b
            java.lang.String r9 = "Unexpected type spec header size"
            r8.a(r2, r9)
            df.e r2 = r3.f2210b
            int r2 = r2.e()
            long r8 = (long) r2
            long r8 = r8 + r5
            df.e r2 = r3.f2210b
            r2.g()
            df.e r2 = r3.f2210b
            r12 = 3
            r2.skip(r12)
            df.e r2 = r3.f2210b
            int r2 = r2.e()
            r12 = 0
        L2b8:
            df.e r13 = r3.f2210b
            if (r12 >= r2) goto L2c2
            r13.e()
            int r12 = r12 + 1
            goto L2b8
        L2c2:
            long r12 = r13.f2220h
            int r2 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r2 != 0) goto L2c9
            goto L27f
        L2c9:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Error reading type spec chunk at offset 0x%x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L2dd:
            r2 = r8
            df.e r8 = r3.f2210b
            r8.c()
            df.e r8 = r3.f2210b
            int r8 = r8.e()
            long r8 = (long) r8
            long r8 = r8 & r17
            long r12 = r5 + r8
            df.e r2 = r3.f2210b
            int r8 = (int) r8
            r2.mark(r8)
            df.e r2 = r3.f2210b
            int r2 = r2.g()
            int r8 = r2 + (-1)
            java.lang.String r9 = r0.a(r8)
            r31 = r2
            df.e r2 = r3.f2210b
            int r2 = r2.g()
            r20 = r2 & 1
            if (r20 == 0) goto L30f
            r32 = 1
            goto L311
        L30f:
            r32 = 0
        L311:
            r2 = r2 & 2
            if (r2 == 0) goto L318
            r20 = 1
            goto L31a
        L318:
            r20 = 0
        L31a:
            df.e r2 = r3.f2210b
            r2.c()
            df.e r2 = r3.f2210b
            int r2 = r2.e()
            r21 = r5
            df.e r5 = r3.f2210b
            int r5 = r5.e()
            long r5 = (long) r5
            long r5 = r21 + r5
            r23 = r14
            df.e r14 = r3.f2210b
            r33 = r10
            long r10 = r14.f2220h
            int r14 = r14.e()
            r21 = r10
            r10 = 4
            if (r14 < r10) goto L813
            int r11 = r14 + (-4)
            r10 = 52
            int r10 = java.lang.Math.max(r10, r11)
            byte[] r10 = new byte[r10]
            r25 = r15
            df.e r15 = r3.f2210b
            r60 = r12
            long r12 = r15.f2220h
            r35 = r12
            long r12 = (long) r11
            long r12 = r35 + r12
            r15.f2220h = r12
            if (r11 < 0) goto L80d
            r12 = 0
        L35d:
            if (r12 >= r11) goto L373
            java.io.InputStream r13 = r15.f2219g
            r35 = r11
            int r11 = r35 - r12
            int r11 = r13.read(r10, r12, r11)
            if (r11 < 0) goto L36f
            int r12 = r12 + r11
            r11 = r35
            goto L35d
        L36f:
            j8.o.a()
            return r67
        L373:
            df.e r11 = new df.e
            java.io.ByteArrayInputStream r12 = new java.io.ByteArrayInputStream
            r12.<init>(r10)
            r11.<init>(r12)
            int r10 = r11.c()
            short r10 = (short) r10
            int r12 = r11.c()
            short r12 = (short) r12
            int r13 = r11.g()
            byte r13 = (byte) r13
            int r15 = r11.g()
            byte r15 = (byte) r15
            r36 = r10
            r10 = 97
            char[] r38 = df.g.f(r13, r15, r10)
            int r10 = r11.g()
            byte r10 = (byte) r10
            int r13 = r11.g()
            byte r13 = (byte) r13
            r15 = 48
            char[] r39 = df.g.f(r10, r13, r15)
            int r10 = r11.g()
            byte r10 = (byte) r10
            int r13 = r11.g()
            byte r13 = (byte) r13
            int r42 = r11.c()
            int r15 = r11.g()
            byte r15 = (byte) r15
            r40 = r10
            int r10 = r11.g()
            byte r10 = (byte) r10
            r44 = r10
            int r10 = r11.g()
            byte r10 = (byte) r10
            r45 = r10
            int r10 = r11.g()
            byte r10 = (byte) r10
            r46 = r10
            int r10 = r11.c()
            short r10 = (short) r10
            r47 = r10
            int r10 = r11.c()
            short r10 = (short) r10
            r48 = r10
            int r10 = r11.c()
            short r10 = (short) r10
            r11.c()
            r49 = r10
            int r10 = r11.g()
            byte r10 = (byte) r10
            r50 = r10
            int r10 = r11.g()
            byte r10 = (byte) r10
            r51 = r10
            int r10 = r11.c()
            short r10 = (short) r10
            r52 = r10
            int r10 = r11.c()
            short r10 = (short) r10
            r53 = r10
            int r10 = r11.c()
            short r10 = (short) r10
            r54 = r10
            r10 = 4
            java.lang.String r35 = df.g.e(r10, r11)
            char[] r10 = r35.toCharArray()
            r37 = r12
            r12 = 8
            java.lang.String r12 = df.g.e(r12, r11)
            char[] r12 = r12.toCharArray()
            r35 = r11
            int r11 = r35.g()
            byte r11 = (byte) r11
            r57 = r11
            int r11 = r35.g()
            byte r11 = (byte) r11
            r35.c()
            r58 = r11
            df.e r11 = r3.f2210b
            r62 = r0
            r63 = r1
            long r0 = (long) r14
            long r0 = r21 + r0
            r41 = r13
            java.lang.String r13 = "Config skip trailing bytes"
            r11.b(r0, r13)
            ef.a r35 = new ef.a
            int r0 = r10.length
            if (r0 != 0) goto L44e
            r55 = r67
            goto L450
        L44e:
            r55 = r10
        L450:
            int r0 = r12.length
            if (r0 != 0) goto L45a
            r56 = r67
        L455:
            r59 = r14
            r43 = r15
            goto L45d
        L45a:
            r56 = r12
            goto L455
        L45d:
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            r0 = r35
            boolean r1 = r0.f2749k
            if (r1 == 0) goto L46d
            java.lang.String r1 = "Invalid config flags detected: {}{}"
            java.lang.String r10 = r0.f2750l
            r4.s(r9, r1, r10)
        L46d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            if (r32 == 0) goto L492
            r10 = 0
        L475:
            if (r10 >= r2) goto L4c3
            df.e r11 = r3.f2210b
            int r11 = r11.c()
            df.e r12 = r3.f2210b
            int r12 = r12.c()
            r24 = 4
            int r12 = r12 * 4
            df.f r13 = new df.f
            r13.<init>(r11, r12)
            r1.add(r13)
            int r10 = r10 + 1
            goto L475
        L492:
            if (r20 == 0) goto L4af
            r10 = 0
        L495:
            if (r10 >= r2) goto L4c3
            df.e r11 = r3.f2210b
            int r11 = r11.c()
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r11 == r12) goto L4ac
            df.f r12 = new df.f
            int r11 = r11 * 4
            r12.<init>(r10, r11)
            r1.add(r12)
        L4ac:
            int r10 = r10 + 1
            goto L495
        L4af:
            r10 = 0
        L4b0:
            if (r10 >= r2) goto L4c3
            df.f r11 = new df.f
            df.e r12 = r3.f2210b
            int r12 = r12.e()
            r11.<init>(r10, r12)
            r1.add(r11)
            int r10 = r10 + 1
            goto L4b0
        L4c3:
            df.e r2 = r3.f2210b
            java.lang.String r10 = "Failed to skip to entries start"
            r2.k(r5, r10)
            java.util.HashSet r2 = new java.util.HashSet
            int r10 = r1.size()
            int r10 = r10 * 2
            r2.<init>(r10)
            java.util.Iterator r1 = r1.iterator()
            r10 = 0
        L4da:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L7f1
            java.lang.Object r11 = r1.next()
            df.f r11 = (df.f) r11
            int r12 = r11.f2223b
            r13 = -1
            if (r12 != r13) goto L4fe
        L4eb:
            r36 = r1
            r37 = r2
        L4ef:
            r38 = r5
            r42 = r7
            r41 = r8
            r43 = r10
            r40 = r25
            r2 = 16
            r8 = 1
            goto L7df
        L4fe:
            int r11 = r11.f2222a
            if (r32 == 0) goto L50d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            boolean r14 = r2.add(r14)
            if (r14 != 0) goto L50d
            goto L4eb
        L50d:
            long r14 = (long) r12
            long r14 = r14 + r5
            int r12 = (r14 > r60 ? 1 : (r14 == r60 ? 0 : -1))
            if (r12 < 0) goto L516
            int r10 = r10 + 1
            goto L4da
        L516:
            df.e r12 = r3.f2210b
            r20 = r14
            long r13 = r12.f2220h
            int r13 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r13 >= 0) goto L523
            r12.reset()
        L523:
            df.e r12 = r3.f2210b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Expected start of entry "
            r13.<init>(r14)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
            r14 = r20
            r12.k(r14, r13)
            df.e r12 = r3.f2210b
            int r12 = r12.c()
            df.e r13 = r3.f2210b
            int r13 = r13.c()
            r14 = r13 & 1
            if (r14 == 0) goto L54a
            r14 = 1
            goto L54b
        L54a:
            r14 = 0
        L54b:
            r15 = r13 & 8
            if (r15 == 0) goto L551
            r15 = 1
            goto L552
        L551:
            r15 = 0
        L552:
            r36 = r1
            if (r15 == 0) goto L55b
            r1 = r12
        L557:
            r37 = r2
            r2 = -1
            goto L562
        L55b:
            df.e r1 = r3.f2210b
            int r1 = r1.e()
            goto L557
        L562:
            if (r1 != r2) goto L565
            goto L4ef
        L565:
            int r2 = r30 << 24
            int r20 = r31 << 16
            r2 = r2 | r20
            r21 = r2 | r11
            r22 = r23
            r2 = r62
            java.lang.String r23 = r2.a(r8)
            r11 = r63
            java.lang.String r1 = r11.a(r1)
            ad.c r2 = r7.K
            rf.b r2 = r2.f226b
            boolean r2 = r2.c(r1)
            if (r2 != 0) goto L597
            ef.c r1 = df.g.f2225h
            r38 = r5
            r42 = r7
            r41 = r8
            r43 = r10
            r63 = r11
            r23 = r22
            r40 = r25
            goto L78e
        L597:
            df.i r2 = r3.f2227e
            java.util.HashMap r2 = r2.f2235e
            r38 = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L5b7
            r24 = r2
            r42 = r7
            r41 = r8
            r43 = r10
            r63 = r11
            r40 = r25
            goto L712
        L5b7:
            r2 = r25
            j8.f r5 = r2.f13745d
            java.lang.Object r5 = r5.f6781b
            od.b r5 = (od.b) r5
            java.util.concurrent.ConcurrentHashMap r5 = r5.f9771a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)
            java.lang.Object r5 = r5.get(r6)
            ud.l r5 = (ud.l) r5
            boolean r6 = r5 instanceof ud.g
            if (r6 == 0) goto L5d2
            ud.g r5 = (ud.g) r5
            goto L5d4
        L5d2:
            r5 = r67
        L5d4:
            if (r5 == 0) goto L61d
            ud.e r6 = r5.f13706k
            ud.e r6 = r6.a0()
            r40 = r2
            md.a r2 = md.a.f8831m
            md.f r6 = r6.f8877g
            boolean r2 = r6.a(r2)
            if (r2 == 0) goto L5eb
        L5e8:
            r41 = r8
            goto L611
        L5eb:
            int r2 = r7.T
            od.c r6 = r5.f13707l
            java.lang.String r6 = r6.f9774h
            r20 = r2
            int r2 = t3.c.b(r20)
            if (r2 == 0) goto L614
            r41 = r8
            r8 = 1
            if (r2 == r8) goto L611
            r8 = r16
            if (r2 != r8) goto L603
            goto L621
        L603:
            java.lang.String r0 = bc.e.w(r20)
            java.lang.String r1 = "Unexpected ResourceNameSource value: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            return r67
        L611:
            r8 = r16
            goto L620
        L614:
            r41 = r8
            r8 = r16
            java.lang.String r6 = xe.a.a(r1, r6)
            goto L621
        L61d:
            r40 = r2
            goto L5e8
        L620:
            r6 = r1
        L621:
            boolean r2 = r7.a()
            if (r2 == 0) goto L6e2
            java.util.EnumSet r2 = r7.D
            bc.f r8 = bc.f.f710i
            boolean r2 = r2.contains(r8)
            r8 = r2 ^ 1
            java.lang.Integer r24 = java.lang.Integer.valueOf(r21)
            r25 = r2
            java.lang.Object[] r2 = new java.lang.Object[]{r24}
            r42 = r7
            java.lang.String r7 = "_res_0x%08x"
            java.lang.String r2 = java.lang.String.format(r7, r2)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L64f
            r43 = r10
            r63 = r11
            goto L6ec
        L64f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r24 = r6.length()
            r43 = r10
            r19 = 1
            int r10 = r24 + 1
            r7.<init>(r10)
            r63 = r11
            r10 = 0
            int r11 = r6.codePointAt(r10)
            if (r25 == 0) goto L671
            boolean r24 = kd.d.b(r11)
            if (r24 == 0) goto L66e
            goto L671
        L66e:
            r10 = 95
            goto L68f
        L671:
            r10 = 880(0x370, float:1.233E-42)
            if (r11 >= r10) goto L67e
            boolean r10 = java.lang.Character.isUnicodeIdentifierStart(r11)
            if (r10 == 0) goto L67e
            r10 = 95
            goto L682
        L67e:
            r10 = 95
            if (r11 != r10) goto L68f
        L682:
            java.util.regex.Pattern r20 = kd.d.f7584a
            boolean r20 = java.lang.Character.isJavaIdentifierStart(r11)
            if (r20 == 0) goto L68f
            r7.appendCodePoint(r11)
            r10 = 0
            goto L69c
        L68f:
            r7.append(r10)
            boolean r10 = f8.i.b0(r11, r8)
            if (r10 == 0) goto L69b
            r7.appendCodePoint(r11)
        L69b:
            r10 = 1
        L69c:
            int r11 = java.lang.Character.charCount(r11)
            r24 = r10
        L6a2:
            int r10 = r6.length()
            if (r11 >= r10) goto L6c9
            int r10 = r6.codePointAt(r11)
            boolean r25 = f8.i.b0(r10, r8)
            if (r25 == 0) goto L6b8
            r7.appendCodePoint(r10)
            r25 = r6
            goto L6c1
        L6b8:
            r25 = r6
            r6 = 95
            r7.append(r6)
            r24 = 1
        L6c1:
            int r6 = java.lang.Character.charCount(r10)
            int r11 = r11 + r6
            r6 = r25
            goto L6a2
        L6c9:
            java.lang.String r6 = r7.toString()
            java.util.HashSet r7 = kd.d.f7586c
            boolean r7 = r7.contains(r6)
            if (r7 == 0) goto L6d7
            r8 = 1
            goto L6d9
        L6d7:
            r8 = r24
        L6d9:
            if (r8 == 0) goto L6e0
            java.lang.String r2 = r6.concat(r2)
            goto L6ec
        L6e0:
            r2 = r6
            goto L6ec
        L6e2:
            r25 = r6
            r42 = r7
            r43 = r10
            r63 = r11
            r2 = r25
        L6ec:
            boolean r6 = r1.equals(r2)
            if (r6 != 0) goto L6fd
            df.i r6 = r3.f2227e
            java.util.HashMap r6 = r6.f2235e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r21)
            r6.put(r7, r2)
        L6fd:
            if (r5 == 0) goto L710
            r6 = 46
            r10 = 95
            java.lang.String r6 = r2.replace(r6, r10)
            od.c r7 = r5.f13707l
            r7.f9776j = r6
            md.a r6 = md.a.f8843x
            r5.w(r6)
        L710:
            r24 = r2
        L712:
            ef.c r20 = new ef.c
            java.lang.String r2 = r0.f2750l
            r25 = r2
            r20.<init>(r21, r22, r23, r24, r25)
            r5 = r20
            r2 = r21
            r23 = r22
            df.i r6 = r3.f2227e
            java.util.TreeMap r6 = r6.f2234d
            java.lang.Object r6 = r6.get(r5)
            ef.c r6 = (ef.c) r6
            if (r6 == 0) goto L769
            int r7 = r6.f2753a
            if (r7 != r2) goto L738
            java.lang.String r2 = "ResourceEntries with duplicate resource id found: {} {}"
            r4.n(r6, r2, r5)
            r2 = r1
            goto L73a
        L738:
            r2 = r24
        L73a:
            ef.c r5 = r5.a(r2)
            ef.c r2 = r6.a(r2)
            java.lang.String r7 = r2.f2756d
            java.lang.String r8 = "Resource name collision - renamed to {} and {}"
            java.lang.String r10 = r5.f2756d
            r4.p(r10, r8, r7)
            df.i r8 = r3.f2227e
            java.util.ArrayList r8 = r8.f2231a
            int r6 = r8.indexOf(r6)
            r10 = -1
            if (r6 == r10) goto L759
            r8.set(r6, r2)
        L759:
            df.i r6 = r3.f2227e
            r6.getClass()
            int r2 = r2.f2753a
            java.util.HashMap r6 = r6.f2235e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.put(r2, r7)
        L769:
            java.lang.String r2 = r5.f2756d
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L781
            df.i r1 = r3.f2227e
            r1.getClass()
            int r6 = r5.f2753a
            java.util.HashMap r1 = r1.f2235e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1.put(r6, r2)
        L781:
            df.i r1 = r3.f2227e
            java.util.ArrayList r2 = r1.f2231a
            r2.add(r5)
            java.util.TreeMap r1 = r1.f2234d
            r1.put(r5, r5)
            r1 = r5
        L78e:
            if (r15 == 0) goto L7a3
            int r2 = r13 >> 8
            df.e r5 = r3.f2210b
            int r5 = r5.e()
            b5.k r6 = new b5.k
            r8 = 1
            r6.<init>(r2, r5, r8)
            r1.f2758f = r6
            r2 = 16
            goto L7df
        L7a3:
            r8 = 1
            r2 = 16
            if (r14 != 0) goto L7b2
            if (r12 != r2) goto L7ab
            goto L7b2
        L7ab:
            b5.k r5 = r3.d()
            r1.f2758f = r5
            goto L7df
        L7b2:
            df.e r5 = r3.f2210b
            r5.e()
            df.e r5 = r3.f2210b
            int r5 = r5.e()
            r1.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            r7 = 0
        L7c6:
            if (r7 >= r5) goto L7dd
            df.e r10 = r3.f2210b
            int r10 = r10.e()
            ef.b r11 = new ef.b
            b5.k r12 = r3.d()
            r11.<init>(r10, r12)
            r6.add(r11)
            int r7 = r7 + 1
            goto L7c6
        L7dd:
            r1.f2759g = r6
        L7df:
            r1 = r36
            r2 = r37
            r5 = r38
            r25 = r40
            r8 = r41
            r7 = r42
            r10 = r43
            r16 = 2
            goto L4da
        L7f1:
            r42 = r7
            r43 = r10
            r40 = r25
            r8 = 1
            if (r43 <= 0) goto L803
            java.lang.String r0 = "{} entries of type {} has been ignored (invalid offset)"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r43)
            r4.s(r1, r0, r9)
        L803:
            df.e r0 = r3.f2210b
            java.lang.String r1 = "End of chunk"
            r5 = r60
            r0.k(r5, r1)
            goto L831
        L80d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        L813:
            java.lang.String r0 = "Config size < 4"
            j8.o.y(r0)
            return r67
        L819:
            r62 = r0
            r63 = r1
            r21 = r5
            r42 = r7
            r33 = r10
            r23 = r14
            r40 = r15
            r8 = 1
            java.lang.String r0 = "Null chunk type encountered at offset {}"
            java.lang.Long r1 = java.lang.Long.valueOf(r21)
            r4.a(r1, r0)
        L831:
            r14 = r23
            r10 = r33
            r15 = r40
            r7 = r42
            r0 = r62
            r1 = r63
            r16 = 2
            goto L167
        L841:
            r42 = r7
            r33 = r10
            r40 = r15
            int r13 = r66 + 1
            goto L86c
        L84a:
            long r0 = r5.f2220h
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            java.lang.String r1 = "Decode error: Package header size too small, position: 0x"
            java.lang.String r0 = wb.en.g(r1, r0)
            j8.o.y(r0)
            return r67
        L85a:
            r26 = r1
            r42 = r7
            r28 = r8
            r29 = r9
            r40 = r15
            df.a r0 = r3.c(r12, r10)
            r3.f2228f = r0
        L86a:
            r13 = r66
        L86c:
            df.e r0 = r3.f2210b
            java.lang.String r1 = "Skip to table chunk end"
            r0.k(r10, r1)
            r0 = r64
            r1 = r26
            r8 = r28
            r9 = r29
            r6 = r40
            r7 = r42
            r10 = 2
            r11 = 12
            goto L83
        L884:
            r12 = r66
            r26 = r1
            r0 = r9
            if (r12 == r0) goto L898
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "Unexpected package chunks, read: {}, expected: {}"
            r4.s(r1, r2, r0)
        L898:
            df.i r0 = r3.f2227e
            java.util.ArrayList r1 = r0.f2231a
            ae.a r2 = new ae.a
            r5 = 7
            r2.<init>(r5)
            java.util.Comparator r2 = java.util.Comparator.comparingInt(r2)
            r1.sort(r2)
            java.util.TreeMap r1 = r0.f2234d
            r1.clear()
            java.util.HashMap r0 = r0.f2235e
            r0.clear()
            boolean r0 = r4.d()
            if (r0 == 0) goto L8d4
            df.i r0 = r3.f2227e
            java.util.ArrayList r0 = r0.f2231a
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r26
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Resource table parsed: size: {}, time: {}ms"
            r4.y(r0, r2, r1)
        L8d4:
            return r3
        L8d5:
            r67 = 0
            java.lang.String r0 = "Unknown type of resource file: "
            java.lang.String r0 = wb.en.g(r0, r2)
            ah.a.k(r0)
            return r67
        L8e1:
            r67 = 0
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Unexpected resource type for decode: "
            java.lang.String r2 = ", expect '.pb'/'.arsc'"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            j8.o.t(r0)
            return r67
    }

    @Override // k7.d
    public k7.a n() {
            r4 = this;
            java.lang.Object r0 = r4.f2387i
            okio.a r0 = (okio.a) r0
            java.lang.Object r1 = r4.f2386h
            p7.i r1 = (p7.i) r1
            r7.c r1 = r1.f10292u
            byte[] r1 = r1.f11553k
            r2 = 0
            r1 = r1[r2]
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L14
            r2 = r3
        L14:
            int r0 = r0.f9858g
            switch(r0) {
                case 16: goto L2b;
                case 17: goto L25;
                case 18: goto L1f;
                default: goto L19;
            }
        L19:
            r7.y r0 = new r7.y
            r0.<init>(r2)
            goto L30
        L1f:
            r7.x r0 = new r7.x
            r0.<init>(r2)
            goto L30
        L25:
            r7.q r0 = new r7.q
            r0.<init>(r2)
            goto L30
        L2b:
            r7.o r0 = new r7.o
            r0.<init>(r2)
        L30:
            return r0
    }
}
