package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements k8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7443b;

    public /* synthetic */ m(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f7442a = r2
            r0.f7443b = r1
            r0.<init>()
            return
    }

    @Override // k8.h
    public final void a(b.e r14) {
            r13 = this;
            int r0 = r13.f7442a
            switch(r0) {
                case 0: goto Lf1;
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r13.f7443b
            s8.c r0 = (s8.c) r0
            java.lang.Object r14 = r14.f333i
            h.Hchat.hooks.api.model.WeChatMessage r14 = (h.Hchat.hooks.api.model.WeChatMessage) r14
            r0.N(r14)
            return
        L11:
            java.lang.Object r0 = r13.f7443b
            r2 = r0
            ka.f r2 = (ka.f) r2
            ka.g r0 = r2.f7554c
            java.lang.Object r1 = r14.f332h
            l8.a r1 = (l8.a) r1
            java.lang.String r3 = "insert"
            java.lang.String r1 = r1.f7892a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lf0
            java.lang.Object r14 = r14.f333i
            h.Hchat.hooks.api.model.WeChatMessage r14 = (h.Hchat.hooks.api.model.WeChatMessage) r14
            if (r14 == 0) goto Lf0
            java.lang.String r1 = "qq_music_order_enable"
            r3 = 0
            boolean r1 = r0.b(r1, r3)
            if (r1 == 0) goto Lf0
            boolean r1 = r14.isText()
            if (r1 != 0) goto L3d
            goto Lf0
        L3d:
            boolean r1 = r14.isSystem()
            if (r1 == 0) goto L45
            goto Lf0
        L45:
            long r4 = r14.createTime
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L66
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L5d
            r8 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r8
        L5d:
            long r6 = r6 - r4
            r4 = 30000(0x7530, double:1.4822E-319)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 < 0) goto L66
            goto Lf0
        L66:
            r1 = r3
            java.lang.String r3 = r14.talker
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L71
            goto Lf0
        L71:
            boolean r4 = r14.isOutgoing()
            if (r4 != 0) goto L83
            java.util.Set r0 = r0.a()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L83
            goto Lf0
        L83:
            java.lang.String r0 = r14.content
            boolean r4 = r14.isGroupChat()
            if (r4 != 0) goto L94
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            goto Lba
        L94:
            java.lang.String r4 = ":\n"
            boolean r5 = og.m.h0(r0, r4, r1)
            if (r5 == 0) goto L9d
            goto La5
        L9d:
            java.lang.String r4 = ":\\n"
            boolean r1 = og.m.h0(r0, r4, r1)
            if (r1 == 0) goto Lb2
        La5:
            java.lang.String r0 = og.m.K0(r0, r4)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            goto Lba
        Lb2:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
        Lba:
            ka.d r7 = r2.c(r0)
            if (r7 == 0) goto Lf0
            boolean r0 = r14.isOutgoing()
            if (r0 == 0) goto Ldf
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r0.getClass()
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.a()
            if (r0 == 0) goto Ld8
            java.lang.String r0 = r0.c()
            goto Ld9
        Ld8:
            r0 = 0
        Ld9:
            if (r0 != 0) goto Ldd
            java.lang.String r0 = ""
        Ldd:
            r6 = r0
            goto Le4
        Ldf:
            java.lang.String r0 = r14.getSendTalker()
            goto Ldd
        Le4:
            long r4 = r14.msgId
            java.util.concurrent.ExecutorService r14 = r2.f7556e
            ka.c r1 = new ka.c
            r1.<init>(r2, r3, r4, r6, r7)
            r14.execute(r1)
        Lf0:
            return
        Lf1:
            java.lang.Object r0 = r13.f7443b
            k8.p r0 = (k8.p) r0
            java.lang.Object r14 = r14.f333i
            r11 = r14
            h.Hchat.hooks.api.model.WeChatMessage r11 = (h.Hchat.hooks.api.model.WeChatMessage) r11
            if (r11 != 0) goto Lfe
            goto L1b8
        Lfe:
            boolean r14 = r0.f7467h
            if (r14 == 0) goto L10a
            boolean r14 = r11.isOutgoing()
            if (r14 != 0) goto L10a
            goto L1b8
        L10a:
            boolean r14 = r11.isOutgoing()
            if (r14 == 0) goto L150
            java.lang.String r14 = r11.talker
            java.lang.String r1 = r11.content
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            if (r2 != 0) goto L150
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L121
            goto L150
        L121:
            java.util.concurrent.ConcurrentHashMap r2 = r0.f7466g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r14)
            r14 = 10
            r3.append(r14)
            r3.append(r1)
            java.lang.String r14 = r3.toString()
            java.lang.Object r14 = r2.get(r14)
            java.lang.Long r14 = (java.lang.Long) r14
            if (r14 == 0) goto L150
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r14.longValue()
            long r1 = r1 - r3
            r3 = 10000(0x2710, double:4.9407E-320)
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 >= 0) goto L150
            goto L1b8
        L150:
            boolean r14 = r11.isOutgoing()
            if (r14 == 0) goto L15d
            java.lang.String r14 = r11.talker
            java.lang.String r1 = r11.content
            k8.g.d(r14, r1)
        L15d:
            k8.o r1 = new k8.o
            java.lang.String r3 = r0.d(r11)
            java.lang.String r4 = r11.talker
            boolean r14 = r11.isOutgoing()
            java.lang.String r2 = ""
            if (r14 == 0) goto L179
            g8.a r14 = r0.f7463d
            if (r14 == 0) goto L176
            java.lang.String r14 = r14.c()
            goto L177
        L176:
            r14 = r2
        L177:
            r5 = r14
            goto L17a
        L179:
            r5 = r2
        L17a:
            java.lang.String r6 = r11.content
            k8.q r14 = r0.f7462c
            if (r14 == 0) goto L186
            java.lang.String r14 = k8.q.b(r6)
            r7 = r14
            goto L187
        L186:
            r7 = r6
        L187:
            java.lang.String r14 = r11.content
            k8.q r8 = r0.f7462c
            if (r8 != 0) goto L18f
        L18d:
            r8 = r2
            goto L19a
        L18f:
            java.lang.String r14 = k8.q.b(r14)
            java.lang.String r2 = "nativeurl"
            java.lang.String r2 = k8.q.c(r14, r2)
            goto L18d
        L19a:
            java.lang.String r14 = r11.talker
            k8.q r2 = r0.f7462c
            if (r2 == 0) goto L1a9
            boolean r14 = k8.q.f(r14)
            if (r14 == 0) goto L1a9
            r14 = 1
        L1a7:
            r9 = r14
            goto L1ab
        L1a9:
            r14 = 0
            goto L1a7
        L1ab:
            boolean r10 = r11.isOutgoing()
            r12 = 0
            java.lang.String r2 = "message_db"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.a(r1)
        L1b8:
            return
    }
}
