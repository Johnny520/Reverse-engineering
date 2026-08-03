package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1429j;

    public /* synthetic */ x(int r1, java.lang.Object r2, java.lang.Object r3, boolean r4) {
            r0 = this;
            r0.f1426g = r1
            r0.f1428i = r2
            r0.f1429j = r3
            r0.f1427h = r4
            r0.<init>()
            return
    }

    public /* synthetic */ x(fb.b r2, boolean r3, java.io.File r4) {
            r1 = this;
            r0 = 1
            r1.f1426g = r0
            r1.<init>()
            r1.f1428i = r2
            r1.f1427h = r3
            r1.f1429j = r4
            return
    }

    public /* synthetic */ x(boolean r2, android.content.SharedPreferences r3, i0.a1 r4) {
            r1 = this;
            r0 = 2
            r1.f1426g = r0
            r1.<init>()
            r1.f1427h = r2
            r1.f1428i = r3
            r1.f1429j = r4
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r21) {
            r20 = this;
            r1 = r20
            int r0 = r1.f1426g
            r2 = 0
            r3 = 2
            sf.n r4 = sf.n.f12433a
            r5 = 3
            r6 = 5
            r7 = 0
            r8 = 1
            boolean r9 = r1.f1427h
            java.lang.Object r10 = r1.f1429j
            java.lang.Object r11 = r1.f1428i
            switch(r0) {
                case 0: goto L136;
                case 1: goto L11a;
                case 2: goto L105;
                case 3: goto L4d;
                default: goto L15;
            }
        L15:
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            i0.a1 r10 = (i0.a1) r10
            r0 = r21
            r.h r0 = (r.h) r0
            r0.getClass()
            wb.sr r2 = new wb.sr
            r3 = 14
            r2.<init>(r3)
            int r3 = r11.size()
            i0.q0 r7 = new i0.q0
            r7.<init>(r2, r6, r11)
            i0.c r2 = new i0.c
            r2.<init>(r11, r5)
            wb.rv r5 = new wb.rv
            r5.<init>(r10, r11, r9)
            s0.d r6 = new s0.d
            r9 = 802480018(0x2fd4df92, float:3.8721432E-10)
            r6.<init>(r9, r5, r8)
            ac.k r0 = r0.f11166a
            b5.c r5 = new b5.c
            r5.<init>(r7, r2, r6)
            r0.b(r3, r5)
            return r4
        L4d:
            fg.l r11 = (fg.l) r11
            r0 = r21
            h.t r0 = (h.t) r0
            r0.getClass()
            java.lang.Object r0 = r0.b()
            java.lang.Object r0 = r11.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r4 = r11.invoke(r10)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 6
            if (r9 != 0) goto L8f
            if (r0 != r4) goto L8f
            r0 = 120(0x78, float:1.68E-43)
            i.l1 r0 = i.d.p(r0, r5, r2)
            h.r0 r0 = h.m0.a(r0, r3)
            r4 = 90
            i.l1 r2 = i.d.p(r4, r5, r2)
            h.s0 r2 = h.m0.b(r2, r3)
            int r3 = h.k.f4708b
            h.e0 r3 = new h.e0
            r3.<init>(r0, r2)
            goto L104
        L8f:
            if (r4 < r0) goto L93
            r0 = r8
            goto L94
        L93:
            r0 = r7
        L94:
            r4 = 240(0xf0, float:3.36E-43)
            i.l1 r4 = i.d.p(r4, r5, r2)
            wb.m6 r9 = new wb.m6
            r10 = 4
            r9.<init>(r10, r0)
            i.m1 r10 = h.m0.f4717a
            h.l0 r10 = new h.l0
            r10.<init>(r9, r7)
            h.r0 r7 = new h.r0
            h.h1 r11 = new h.h1
            h.f1 r13 = new h.f1
            r13.<init>(r10, r4)
            r16 = 0
            r17 = 125(0x7d, float:1.75E-43)
            r12 = 0
            r14 = 0
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.<init>(r11)
            r4 = 160(0xa0, float:2.24E-43)
            i.l1 r4 = i.d.p(r4, r5, r2)
            h.r0 r4 = h.m0.a(r4, r3)
            h.r0 r4 = r7.a(r4)
            r7 = 220(0xdc, float:3.08E-43)
            i.l1 r7 = i.d.p(r7, r5, r2)
            wb.m6 r9 = new wb.m6
            r9.<init>(r6, r0)
            h.l0 r0 = new h.l0
            r0.<init>(r9, r8)
            h.s0 r6 = new h.s0
            h.h1 r8 = new h.h1
            h.f1 r10 = new h.f1
            r10.<init>(r0, r7)
            r13 = 0
            r14 = 125(0x7d, float:1.75E-43)
            r9 = 0
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r6.<init>(r8)
            r0 = 140(0x8c, float:1.96E-43)
            i.l1 r0 = i.d.p(r0, r5, r2)
            h.s0 r0 = h.m0.b(r0, r3)
            h.s0 r0 = r6.a(r0)
            int r2 = h.k.f4708b
            h.e0 r3 = new h.e0
            r3.<init>(r4, r0)
        L104:
            return r3
        L105:
            android.content.SharedPreferences r11 = (android.content.SharedPreferences) r11
            i0.a1 r10 = (i0.a1) r10
            r0 = r21
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            if (r9 != 0) goto L114
            goto L119
        L114:
            java.lang.String r3 = "glass_nav"
            wb.en.m(r10, r0, r11, r3, r2)
        L119:
            return r4
        L11a:
            fb.b r11 = (fb.b) r11
            java.io.File r10 = (java.io.File) r10
            r0 = r21
            java.io.File r0 = (java.io.File) r0
            r0.getClass()
            r11.d()
            if (r9 != 0) goto L130
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L131
        L130:
            r7 = r8
        L131:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L136:
            java.util.List r11 = (java.util.List) r11
            java.lang.String r10 = (java.lang.String) r10
            r4 = r21
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4
            r4.getClass()
            h8.a r6 = h.Hchat.hooks.api.core.WeChatApis.conversations()
            java.util.Iterator r8 = r11.iterator()
            r12 = r7
        L14a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L346
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r13 = r4.get()
            if (r13 == 0) goto L164
            r7 = r3
            r21 = r4
            r19 = r5
            r4 = r2
            goto L33b
        L164:
            if (r6 == 0) goto L32a
            g8.i r13 = r6.f5136b
            h.Hchat.dexkit.DexFinder r14 = r6.f5138d
            if (r0 == 0) goto L172
            java.lang.String r0 = r0.trim()
        L170:
            r15 = r0
            goto L175
        L172:
            java.lang.String r0 = ""
            goto L170
        L175:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L32a
            boolean r0 = g8.i.I(r15)
            java.lang.String r2 = " talker="
            java.lang.String r3 = " enabled="
            if (r0 == 0) goto L25b
            java.lang.String r0 = "群聊免打扰RoomSDK实例为空: talker="
            java.lang.String r13 = "群聊免打扰操作对象为空: talker="
            r18 = r7
            java.lang.reflect.Method r7 = r14.chatroomMuteServiceGetterMethod
            java.lang.reflect.Method r5 = r14.chatroomMuteBuildMethod
            java.lang.reflect.Method r1 = r14.chatroomMuteSubmitMethod
            if (r7 == 0) goto L197
            if (r5 == 0) goto L197
            if (r1 != 0) goto L19c
        L197:
            r21 = r4
            r14 = 3
            goto L249
        L19c:
            r21 = r4
            java.lang.Class r4 = r7.getDeclaringClass()     // Catch: java.lang.Throwable -> L214
            java.lang.Object r4 = ig.a.A(r14, r4)     // Catch: java.lang.Throwable -> L214
            java.lang.Object[] r14 = new java.lang.Object[]{r15}     // Catch: java.lang.Throwable -> L214
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invokeOrThrow(r7, r4, r14)     // Catch: java.lang.Throwable -> L214
            if (r4 == 0) goto L1ba
            java.lang.Class r7 = r5.getDeclaringClass()     // Catch: java.lang.Throwable -> L214
            boolean r7 = r7.isInstance(r4)     // Catch: java.lang.Throwable -> L214
            if (r7 != 0) goto L1bc
        L1ba:
            r14 = 3
            goto L217
        L1bc:
            r0 = r9 ^ 1
            java.lang.Class[] r7 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L214
            int r7 = r7.length     // Catch: java.lang.Throwable -> L214
            r14 = 3
            if (r7 != r14) goto L1d9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1d7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L1d7
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r0, r7}     // Catch: java.lang.Throwable -> L1d7
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r5, r4, r0)     // Catch: java.lang.Throwable -> L1d7
            goto L1e5
        L1d7:
            r0 = move-exception
            goto L227
        L1d9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1d7
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r0}     // Catch: java.lang.Throwable -> L1d7
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r5, r4, r0)     // Catch: java.lang.Throwable -> L1d7
        L1e5:
            if (r0 == 0) goto L1ff
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L1d7
            boolean r4 = r4.isInstance(r0)     // Catch: java.lang.Throwable -> L1d7
            if (r4 != 0) goto L1f2
            goto L1ff
        L1f2:
            r4 = r18
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1d7
            h.Hchat.utils.KavaReflector.invokeOrThrow(r1, r0, r5)     // Catch: java.lang.Throwable -> L1d7
            r19 = r14
            r4 = 0
            r7 = 2
            goto L2cf
        L1ff:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d7
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L1d7
            r0.append(r15)     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d7
            r6.f(r0)     // Catch: java.lang.Throwable -> L1d7
        L20e:
            r19 = r14
        L210:
            r4 = 0
            r7 = 2
            goto L330
        L214:
            r0 = move-exception
            r14 = 3
            goto L227
        L217:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d7
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d7
            r1.append(r15)     // Catch: java.lang.Throwable -> L1d7
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1d7
            r6.f(r0)     // Catch: java.lang.Throwable -> L1d7
            goto L20e
        L227:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "群聊免打扰设置失败: "
            r1.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            r1.append(r2)
            r1.append(r15)
            r1.append(r3)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r6.f(r0)
            goto L20e
        L249:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "群聊免打扰API尚未就绪: talker="
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r6.f(r0)
            goto L20e
        L25b:
            r21 = r4
            r19 = r5
            if (r9 == 0) goto L264
            java.lang.reflect.Method r0 = r14.contactMuteEnableMethod
            goto L266
        L264:
            java.lang.reflect.Method r0 = r14.contactMuteDisableMethod
        L266:
            boolean r1 = android.text.TextUtils.isEmpty(r15)
            if (r1 == 0) goto L26d
            goto L27a
        L26d:
            java.lang.String r1 = r15.trim()
            b.e r1 = r13.R(r1)
            if (r1 == 0) goto L27a
            java.lang.Object r1 = r1.f333i
            goto L27b
        L27a:
            r1 = 0
        L27b:
            if (r0 != 0) goto L296
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "私聊免打扰API尚未就绪: muteMethod=null talker="
            r0.<init>(r1)
            r0.append(r15)
            r0.append(r3)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r6.f(r0)
            goto L210
        L296:
            if (r1 != 0) goto L2b1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "私聊免打扰API尚未就绪: contact=null talker="
            r0.<init>(r1)
            r0.append(r15)
            r0.append(r3)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r6.f(r0)
            goto L210
        L2b1:
            java.lang.Class[] r4 = r0.getParameterTypes()
            int r5 = r4.length
            r7 = 2
            if (r5 != r7) goto L2c3
            r18 = 0
            r4 = r4[r18]
            boolean r4 = r4.isInstance(r1)
            if (r4 != 0) goto L2c5
        L2c3:
            r4 = 0
            goto L2f8
        L2c5:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2d4
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r4}     // Catch: java.lang.Throwable -> L2d4
            r4 = 0
            h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r4, r1)     // Catch: java.lang.Throwable -> L2d2
        L2cf:
            int r12 = r12 + 1
            goto L330
        L2d2:
            r0 = move-exception
            goto L2d6
        L2d4:
            r0 = move-exception
            r4 = 0
        L2d6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "私聊免打扰设置失败: "
            r1.<init>(r5)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            r1.append(r2)
            r1.append(r15)
            r1.append(r3)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r6.f(r0)
            goto L330
        L2f8:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r13 = "私聊免打扰API尚未就绪: typeMismatch method="
            r5.<init>(r13)
            java.lang.String r0 = r0.toGenericString()
            r5.append(r0)
            java.lang.String r0 = " contact="
            r5.append(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            r5.append(r0)
            r5.append(r2)
            r5.append(r15)
            r5.append(r3)
            r5.append(r9)
            java.lang.String r0 = r5.toString()
            r6.f(r0)
            goto L330
        L32a:
            r7 = r3
            r21 = r4
            r19 = r5
            r4 = r2
        L330:
            boolean r0 = r21.get()
            if (r0 != 0) goto L33b
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Thread.sleep(r0)
        L33b:
            r1 = r20
            r2 = r4
            r3 = r7
            r5 = r19
            r7 = 0
            r4 = r21
            goto L14a
        L346:
            c9.y r0 = new c9.y
            int r1 = r11.size()
            r4 = 0
            r0.<init>(r10, r12, r1, r4)
            return r0
    }
}
