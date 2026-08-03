package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k8.k f7460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k8.i f7461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k8.q f7462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g8.a f7463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1.d f7464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f7465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f7466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f7467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f7468i;

    public p(k8.k r2, k8.i r3, k8.q r4, g8.a r5, g1.d r6) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f7465f = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f7466g = r0
            r1.f7460a = r2
            r1.f7461b = r3
            r1.f7462c = r4
            r1.f7463d = r5
            r1.f7464e = r6
            return
    }

    public final void a(k8.o r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.f7465f
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            k8.n r1 = (k8.n) r1
            r1.a(r5)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "消息观察回调失败: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            g1.d r2 = r4.f7464e
            if (r2 == 0) goto L6
            java.lang.String r2 = "[WeChatMessageObserveApi] "
            java.lang.String r1 = r2.concat(r1)
            i8.i.f(r1)
            goto L6
        L37:
            return
    }

    public final synchronized void b() {
            r7 = this;
            java.lang.String r0 = "消息观察已安装: pb="
            monitor-enter(r7)
            k8.k r1 = r7.f7460a     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L14
            r1 = r3
            goto L15
        L11:
            r0 = move-exception
            goto L88
        L14:
            r1 = r2
        L15:
            if (r1 == 0) goto L3f
            boolean r4 = r7.f7467h     // Catch: java.lang.Throwable -> L11
            if (r4 != 0) goto L3f
            k8.k r4 = r7.f7460a     // Catch: java.lang.Throwable -> L11
            k8.l r5 = new k8.l     // Catch: java.lang.Throwable -> L11
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L11
            f8.c r4 = r4.f7435d     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L2c
            java.lang.Class<f8.g> r6 = f8.g.class
            r4.c(r6, r5)     // Catch: java.lang.Throwable -> L11
        L2c:
            k8.k r4 = r7.f7460a     // Catch: java.lang.Throwable -> L11
            k8.l r5 = new k8.l     // Catch: java.lang.Throwable -> L11
            r6 = 1
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L11
            f8.c r4 = r4.f7435d     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L3d
            java.lang.Class<f8.h> r6 = f8.h.class
            r4.c(r6, r5)     // Catch: java.lang.Throwable -> L11
        L3d:
            r7.f7467h = r3     // Catch: java.lang.Throwable -> L11
        L3f:
            k8.i r4 = r7.f7461b     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L5a
            boolean r4 = r4.b()     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L5a
            boolean r4 = r7.f7468i     // Catch: java.lang.Throwable -> L11
            if (r4 != 0) goto L5a
            k8.i r4 = r7.f7461b     // Catch: java.lang.Throwable -> L11
            k8.m r5 = new k8.m     // Catch: java.lang.Throwable -> L11
            r6 = 0
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L11
            r4.e(r5)     // Catch: java.lang.Throwable -> L11
            r7.f7468i = r3     // Catch: java.lang.Throwable -> L11
        L5a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L11
            r4.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = " dbOutgoing="
            r4.append(r0)     // Catch: java.lang.Throwable -> L11
            k8.i r0 = r7.f7461b     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L72
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L72
            r2 = r3
        L72:
            r4.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L11
            g1.d r1 = r7.f7464e     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L86
            java.lang.String r1 = "[WeChatMessageObserveApi] "
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L11
            i8.i.f(r0)     // Catch: java.lang.Throwable -> L11
        L86:
            monitor-exit(r7)
            return
        L88:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    public final boolean c() {
            r1 = this;
            k8.k r0 = r1.f7460a
            if (r0 == 0) goto La
            boolean r0 = r0.c()
            if (r0 != 0) goto L14
        La:
            k8.i r0 = r1.f7461b
            if (r0 == 0) goto L16
            boolean r0 = r0.b()
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public final java.lang.String d(h.Hchat.hooks.api.model.WeChatMessage r3) {
            r2 = this;
            if (r3 != 0) goto L4
            goto La7
        L4:
            boolean r0 = r3.isRedPacket()
            if (r0 != 0) goto Lc5
            java.lang.String r0 = r3.content
            k8.q r1 = r2.f7462c
            if (r1 == 0) goto L18
            boolean r0 = k8.q.a(r0)
            if (r0 == 0) goto L18
            goto Lc5
        L18:
            boolean r0 = r3.isTransfer()
            if (r0 == 0) goto L21
            java.lang.String r3 = "transfer"
            return r3
        L21:
            boolean r0 = r3.isQuote()
            if (r0 == 0) goto L2a
            java.lang.String r3 = "quote"
            return r3
        L2a:
            boolean r0 = r3.isPat()
            if (r0 == 0) goto L33
            java.lang.String r3 = "pat"
            return r3
        L33:
            boolean r0 = r3.isNote()
            if (r0 == 0) goto L3c
            java.lang.String r3 = "note"
            return r3
        L3c:
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L45
            java.lang.String r3 = "file"
            return r3
        L45:
            boolean r0 = r3.isLink()
            if (r0 == 0) goto L4e
            java.lang.String r3 = "link"
            return r3
        L4e:
            boolean r0 = r3.isMusic()
            if (r0 == 0) goto L57
            java.lang.String r3 = "music"
            return r3
        L57:
            boolean r0 = r3.isVideoNumberVideo()
            if (r0 == 0) goto L60
            java.lang.String r3 = "video_number_video"
            return r3
        L60:
            boolean r0 = r3.isShareCard()
            if (r0 == 0) goto L69
            java.lang.String r3 = "share_card"
            return r3
        L69:
            boolean r0 = r3.isVoip()
            if (r0 == 0) goto L72
            java.lang.String r3 = "voip"
            return r3
        L72:
            boolean r0 = r3.isRecalled()
            if (r0 == 0) goto L79
            goto Lb3
        L79:
            int r0 = r3.type
            r1 = 1
            if (r0 == r1) goto Lc2
            r1 = 3
            if (r0 == r1) goto Lbf
            r1 = 34
            if (r0 == r1) goto Lbc
            r1 = 43
            if (r0 == r1) goto Lb9
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 == r1) goto Lb6
            r1 = 10002(0x2712, float:1.4016E-41)
            if (r0 == r1) goto Lb3
            switch(r0) {
                case 47: goto Lb0;
                case 48: goto Lad;
                case 49: goto Laa;
                default: goto L94;
            }
        L94:
            if (r0 <= 0) goto La7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "type_"
            r0.<init>(r1)
            int r3 = r3.type
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        La7:
            java.lang.String r3 = "unknown"
            return r3
        Laa:
            java.lang.String r3 = "app"
            return r3
        Lad:
            java.lang.String r3 = "location"
            return r3
        Lb0:
            java.lang.String r3 = "emoji"
            return r3
        Lb3:
            java.lang.String r3 = "recalled"
            return r3
        Lb6:
            java.lang.String r3 = "system"
            return r3
        Lb9:
            java.lang.String r3 = "video"
            return r3
        Lbc:
            java.lang.String r3 = "voice"
            return r3
        Lbf:
            java.lang.String r3 = "image"
            return r3
        Lc2:
            java.lang.String r3 = "text"
            return r3
        Lc5:
            java.lang.String r3 = "red_packet"
            return r3
    }

    public final a2.a e(k8.n r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.f7465f
            r0.addIfAbsent(r2)
            a2.a r2 = new a2.a
            r0 = 23
            r2.<init>(r0)
            return r2
    }
}
