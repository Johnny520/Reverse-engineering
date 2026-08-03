package v8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final og.k f14273i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.y f14274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f14275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ScheduledThreadPoolExecutor f14276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashMap f14277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f14278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f14279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f14280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14281h;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "[0-9a-fA-F]{32}"
            r0.<init>(r1)
            v8.q.f14273i = r0
            return
    }

    public q(android.content.Context r3, i2.y r4) {
            r2 = this;
            r2.<init>()
            r2.f14274a = r4
            android.content.Context r4 = r3.getApplicationContext()
            if (r4 == 0) goto Lc
            r3 = r4
        Lc:
            r2.f14275b = r3
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = new java.util.concurrent.ScheduledThreadPoolExecutor
            c9.q r4 = new c9.q
            r0 = 26
            r4.<init>(r0)
            r0 = 1
            r3.<init>(r0, r4)
            r3.setRemoveOnCancelPolicy(r0)
            r2.f14276c = r3
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.f14277d = r3
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r2.f14278e = r3
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r2.f14279f = r3
            java.util.concurrent.ConcurrentLinkedDeque r3 = new java.util.concurrent.ConcurrentLinkedDeque
            r3.<init>()
            r2.f14280g = r3
            v0.a r3 = new v0.a
            r4 = 2
            r3.<init>(r2, r4)
            r0 = 0
            r2.o(r0, r3)
            return
    }

    public static java.lang.String c(java.lang.String... r4) {
            ng.j r4 = tf.l.k0(r4)
            r9.p r0 = new r9.p
            r1 = 12
            r0.<init>(r1)
            ng.t r4 = ng.m.W(r4, r0)
            r9.p r0 = new r9.p
            r1 = 13
            r0.<init>(r1)
            ng.i r1 = new ng.i
            r2 = 1
            r1.<init>(r4, r2, r0)
            v8.p r4 = v8.p.f14272n
            ng.t r4 = ng.m.W(r1, r4)
            ng.j r0 = r4.f9459a
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L43
            fg.l r1 = r4.f9460b
            java.lang.Object r3 = r0.next()
            java.lang.Object r1 = r1.invoke(r3)
            r3 = r1
            java.io.File r3 = (java.io.File) r3
            boolean r3 = r3.isFile()
            if (r3 == 0) goto L28
            goto L44
        L43:
            r1 = r2
        L44:
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L4c
            java.lang.String r2 = r1.getAbsolutePath()
        L4c:
            if (r2 != 0) goto L51
            java.lang.String r4 = ""
            return r4
        L51:
            return r2
    }

    public static java.lang.String e(java.lang.String... r5) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L19
            r3 = r5[r2]
            if (r3 == 0) goto L12
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L10
            goto L12
        L10:
            r4 = r1
            goto L13
        L12:
            r4 = 1
        L13:
            if (r4 != 0) goto L16
            goto L1a
        L16:
            int r2 = r2 + 1
            goto L3
        L19:
            r3 = 0
        L1a:
            if (r3 != 0) goto L1f
            java.lang.String r5 = ""
            return r5
        L1f:
            return r3
    }

    public static boolean f(v8.h r6, java.lang.String r7, long r8) {
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r7 = r0.isFile()
            if (r7 == 0) goto L10
            long r1 = r0.length()
            goto L12
        L10:
            r1 = -1
        L12:
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r5 = 0
            if (r7 <= 0) goto L4d
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 <= 0) goto L22
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L22
            goto L4d
        L22:
            java.lang.String r7 = r6.f14263t
            java.lang.String r8 = r0.getAbsolutePath()
            boolean r7 = r7.equals(r8)
            r8 = 1
            if (r7 == 0) goto L3b
            long r3 = r6.f14264u
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto L3b
            int r7 = r6.f14265v
            int r7 = r7 + r8
            r6.f14265v = r7
            goto L48
        L3b:
            java.lang.String r7 = r0.getAbsolutePath()
            r7.getClass()
            r6.f14263t = r7
            r6.f14264u = r1
            r6.f14265v = r5
        L48:
            int r6 = r6.f14265v
            if (r6 < r8) goto L4d
            return r8
        L4d:
            return r5
    }

    public static long h(h.Hchat.hooks.api.model.WeChatMessage r3, java.lang.String r4) {
            java.lang.String r3 = i(r3, r4)
            java.lang.Long r3 = og.t.g0(r3)
            r0 = 0
            if (r3 == 0) goto L16
            long r3 = r3.longValue()
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L15
            goto L16
        L15:
            return r3
        L16:
            return r0
    }

    public static java.lang.String i(h.Hchat.hooks.api.model.WeChatMessage r3, java.lang.String r4) {
            java.lang.String r0 = r3.bodyContent()
            java.lang.String r1 = r3.reserved
            java.lang.String r2 = r3.translatedContent
            java.lang.String r3 = r3.msgSource
            java.lang.String[] r3 = new java.lang.String[]{r0, r1, r2, r3}
            ng.j r3 = tf.l.k0(r3)
            ca.s r0 = new ca.s
            r1 = 17
            r0.<init>(r4, r1)
            ng.t r3 = ng.m.W(r3, r0)
            ng.j r4 = r3.f9459a
            java.util.Iterator r4 = r4.iterator()
        L23:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3d
            fg.l r0 = r3.f9460b
            java.lang.Object r1 = r4.next()
            java.lang.Object r0 = r0.invoke(r1)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = og.m.t0(r1)
            if (r1 != 0) goto L23
            goto L3e
        L3d:
            r0 = 0
        L3e:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L45
            java.lang.String r3 = ""
            return r3
        L45:
            return r0
    }

    public static java.util.ArrayList l(int r6, java.lang.String r7) {
            k8.s r0 = h.Hchat.hooks.api.core.WeChatApis.messageStore()
            if (r0 == 0) goto Ld
            r1 = 24
            java.util.ArrayList r7 = r0.f(r1, r7)
            goto Le
        Ld:
            r7 = 0
        Le:
            if (r7 != 0) goto L12
            tf.t r7 = tf.t.f13167g
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r7.next()
            r2 = r1
            h.Hchat.hooks.api.model.WeChatMessage r2 = (h.Hchat.hooks.api.model.WeChatMessage) r2
            boolean r3 = r2.isOutgoing()
            if (r3 == 0) goto L1b
            int r2 = r2.type
            if (r2 > 0) goto L33
            goto L4d
        L33:
            r3 = r2 & 255(0xff, float:3.57E-43)
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r2
            int r5 = r2 >>> 16
            if (r5 != 0) goto L3e
            goto L4d
        L3e:
            r5 = 10000(0x2710, float:1.4013E-41)
            if (r4 == r5) goto L4c
            r5 = 10002(0x2712, float:1.4016E-41)
            if (r4 == r5) goto L4c
            if (r3 == 0) goto L4d
            if (r4 != r3) goto L4d
            r2 = r3
            goto L4d
        L4c:
            r2 = r4
        L4d:
            if (r2 != r6) goto L1b
            r0.add(r1)
            goto L1b
        L53:
            return r0
    }

    public static boolean n(v8.a r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, boolean r8, java.lang.String r9) {
            boolean r0 = r3.f14203c
            java.util.Set r1 = r3.f14206f
            r2 = 0
            if (r0 == 0) goto Le4
            java.util.Set r0 = r3.f14205e
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L11
            goto Le4
        L11:
            if (r8 == 0) goto L19
            boolean r8 = r3.f14204d
            if (r8 != 0) goto L19
            goto Le4
        L19:
            r8 = r1
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L51
            l8.d r8 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r8.getClass()
            boolean r8 = l8.d.g(r4)
            if (r8 == 0) goto Le4
            boolean r8 = og.m.t0(r9)
            if (r8 == 0) goto L35
            goto Le4
        L35:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r4 = "/"
            r8.append(r4)
            r8.append(r9)
            java.lang.String r4 = r8.toString()
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto L51
            goto Le4
        L51:
            java.util.Set r4 = r3.f14208h
            boolean r5 = r4.contains(r5)
            r8 = 1
            if (r5 == 0) goto L5c
        L5a:
            r4 = r8
            goto L87
        L5c:
            if (r6 > 0) goto L5f
            goto L79
        L5f:
            r5 = r6 & 255(0xff, float:3.57E-43)
            r9 = 65535(0xffff, float:9.1834E-41)
            r9 = r9 & r6
            int r0 = r6 >>> 16
            if (r0 != 0) goto L6a
            goto L79
        L6a:
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r9 == r0) goto L78
            r0 = 10002(0x2712, float:1.4016E-41)
            if (r9 == r0) goto L78
            if (r5 == 0) goto L79
            if (r9 != r5) goto L79
            r6 = r5
            goto L79
        L78:
            r6 = r9
        L79:
            r5 = 62
            if (r6 != r5) goto L86
            java.lang.String r5 = "video_number_video"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L86
            goto L5a
        L86:
            r4 = r2
        L87:
            if (r4 != 0) goto L8a
            goto Le4
        L8a:
            boolean r4 = r3.f14211k
            if (r4 == 0) goto Lb9
            v8.r r4 = v8.r.f14282a
            java.lang.String r4 = r3.f14212l
            java.util.ArrayList r4 = v8.r.c(r4)
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto Lb9
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto La3
            goto Le4
        La3:
            java.util.Iterator r4 = r4.iterator()
        La7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Le4
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = og.m.h0(r7, r5, r8)
            if (r5 == 0) goto La7
        Lb9:
            boolean r4 = r3.f14213m
            if (r4 == 0) goto Le3
            v8.r r4 = v8.r.f14282a
            java.lang.String r3 = r3.f14214n
            java.util.ArrayList r3 = v8.r.c(r3)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Lcc
            goto Le3
        Lcc:
            java.util.Iterator r3 = r3.iterator()
        Ld0:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le3
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.h0(r7, r4, r8)
            if (r4 == 0) goto Ld0
            goto Le4
        Le3:
            return r8
        Le4:
            return r2
    }

    public static boolean p(v8.f r7, java.lang.String r8) {
            k8.g r0 = p.a.q()
            if (r0 == 0) goto L91
            j8.p r1 = h.Hchat.hooks.api.core.WeChatApis.media()
            int r2 = r7.f14232a
            java.lang.String r3 = r7.f14233b
            java.lang.String r4 = r7.f14234c
            r5 = 1
            if (r2 == r5) goto L8c
            r6 = 3
            if (r2 == r6) goto L7d
            r6 = 34
            if (r2 == r6) goto L6e
            r6 = 62
            if (r2 == r6) goto L61
            r6 = 66
            if (r2 == r6) goto L5c
            r6 = 42
            if (r2 == r6) goto L5c
            r6 = 43
            if (r2 == r6) goto L61
            switch(r2) {
                case 47: goto L4f;
                case 48: goto L48;
                case 49: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L91
        L2e:
            boolean r2 = og.m.t0(r4)
            if (r2 != 0) goto L43
            if (r1 == 0) goto L91
            androidx.lifecycle.x r0 = r1.f6819e
            if (r0 == 0) goto L91
            java.lang.String r7 = r7.f14236e
            boolean r7 = r0.T(r8, r4, r7)
            if (r7 != r5) goto L91
            goto L8b
        L43:
            boolean r7 = r0.z(r8, r3)
            return r7
        L48:
            r7 = 48
            boolean r7 = r0.v(r7, r8, r3)
            return r7
        L4f:
            if (r1 == 0) goto L91
            j8.f r7 = r1.f6818d
            if (r7 == 0) goto L91
            boolean r7 = r7.v(r8, r4)
            if (r7 != r5) goto L91
            goto L8b
        L5c:
            boolean r7 = r0.v(r2, r8, r3)
            return r7
        L61:
            if (r1 == 0) goto L91
            bb.b r7 = r1.f6817c
            if (r7 == 0) goto L91
            boolean r7 = r7.q(r8, r4)
            if (r7 != r5) goto L91
            goto L8b
        L6e:
            if (r1 == 0) goto L91
            j8.y r0 = r1.f6816b
            if (r0 == 0) goto L91
            int r7 = r7.f14235d
            boolean r7 = r0.s(r7, r8, r4)
            if (r7 != r5) goto L91
            goto L8b
        L7d:
            if (r1 == 0) goto L91
            j8.n r7 = r1.f6815a
            if (r7 == 0) goto L91
            java.lang.String r0 = ""
            boolean r7 = r7.r(r8, r4, r0, r5)
            if (r7 != r5) goto L91
        L8b:
            return r5
        L8c:
            boolean r7 = r0.x(r8, r3)
            return r7
        L91:
            r7 = 0
            return r7
    }

    public final void a(java.io.File r3) {
            r2 = this;
            java.lang.String r0 = r2.g(r3)
            if (r0 == 0) goto L14
            boolean r1 = r3.isFile()
            if (r1 == 0) goto Lf
            r3.delete()
        Lf:
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = r2.f14279f
            r3.remove(r0)
        L14:
            return
    }

    public final void b(v8.h r9, v8.c r10, fg.a r11) {
            r8 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r8.f14276c
            boolean r1 = r0.isShutdown()
            if (r1 == 0) goto Le
            if (r10 == 0) goto L36
            r10.invoke()
            return
        Le:
            b9.c r2 = new b9.c     // Catch: java.lang.Throwable -> L22
            r7 = 18
            r4 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1f
            r0.execute(r2)     // Catch: java.lang.Throwable -> L1f
            sf.n r9 = sf.n.f12433a     // Catch: java.lang.Throwable -> L1f
            goto L2b
        L1f:
            r0 = move-exception
        L20:
            r9 = r0
            goto L25
        L22:
            r0 = move-exception
            r5 = r10
            goto L20
        L25:
            sf.f r10 = new sf.f
            r10.<init>(r9)
            r9 = r10
        L2b:
            java.lang.Throwable r9 = sf.g.b(r9)
            if (r9 == 0) goto L36
            if (r5 == 0) goto L36
            r5.invoke()
        L36:
            return
    }

    public final void d(v8.h r4) {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r3.f14278e
            java.lang.String r1 = r4.f14244a
            boolean r0 = r0.remove(r1)
            if (r0 != 0) goto Lb
            goto L1a
        Lb:
            r0 = 0
            r4.f14260q = r0
            boolean r0 = r4.f14259p
            if (r0 != 0) goto L1b
            java.lang.String r0 = r4.f14258o
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto L1b
        L1a:
            return
        L1b:
            v8.b r0 = new v8.b
            r1 = 1
            r0.<init>(r3, r4, r1)
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            r3.o(r1, r0)
            return
    }

    public final java.lang.String g(java.io.File r4) {
            r3 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r3.f14275b
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r2 = "Hchat_auto_message_forward"
            r0.<init>(r1, r2)
            r1 = 0
            java.io.File r4 = r4.getCanonicalFile()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = r4.getPath()     // Catch: java.lang.Throwable -> L2f
            java.io.File r4 = r4.getParentFile()     // Catch: java.lang.Throwable -> L2f
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.lang.Throwable -> L2f
            boolean r4 = gg.l.a(r4, r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2d
            goto L35
        L2d:
            r2 = r1
            goto L35
        L2f:
            r4 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r4)
        L35:
            boolean r4 = r2 instanceof sf.f
            if (r4 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r2
        L3b:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public final v8.n j(h.Hchat.hooks.api.model.WeChatMessage r41, v8.h r42) {
            r40 = this;
            r1 = r40
            r2 = r41
            r3 = r42
            int r0 = r2.type
            if (r0 > 0) goto Lb
            goto L24
        Lb:
            r4 = r0 & 255(0xff, float:3.57E-43)
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r0
            int r6 = r0 >>> 16
            if (r6 != 0) goto L16
            goto L24
        L16:
            r6 = 10000(0x2710, float:1.4013E-41)
            if (r5 == r6) goto L26
            r6 = 10002(0x2712, float:1.4016E-41)
            if (r5 == r6) goto L26
            if (r4 == 0) goto L24
            if (r5 != r4) goto L24
            r8 = r4
            goto L27
        L24:
            r8 = r0
            goto L27
        L26:
            r8 = r5
        L27:
            long r4 = r2.msgId
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L34
            goto L35
        L34:
            r0 = 0
        L35:
            if (r0 == 0) goto L58
            long r9 = r0.longValue()
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.database()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L48
            java.lang.Object r0 = r0.nativeMessageById(r9)     // Catch: java.lang.Throwable -> L46
            goto L50
        L46:
            r0 = move-exception
            goto L4a
        L48:
            r0 = 0
            goto L50
        L4a:
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L50:
            boolean r4 = r0 instanceof sf.f
            if (r4 == 0) goto L56
            r0 = 0
        L56:
            r9 = r0
            goto L59
        L58:
            r9 = 0
        L59:
            boolean r0 = r2.isVoice()
            r4 = 0
            v8.m r10 = v8.m.f14270a
            java.lang.String r11 = ""
            r12 = 1
            if (r0 == 0) goto L149
            java.lang.String r0 = r2.imagePath
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r3 = og.m.t0(r0)
            if (r3 != 0) goto L76
            goto L77
        L76:
            r0 = 0
        L77:
            if (r0 == 0) goto L7a
            goto Le1
        L7a:
            java.lang.String r0 = r2.bodyContent()
            r3 = 2
            char[] r3 = new char[r3]
            r3 = {x079a: FILL_ARRAY_DATA , data: [10, 13} // fill-array
            java.lang.String r0 = og.m.U0(r0, r3)
            char[] r3 = new char[r12]
            r6 = 58
            r3[r4] = r6
            r6 = 6
            java.util.List r3 = og.m.F0(r0, r3, r6)
            int r6 = r3.size()
            r7 = 3
            if (r6 < r7) goto Lbe
            r6 = 60
            boolean r6 = og.m.i0(r0, r6)
            if (r6 != 0) goto Lbe
            int r0 = r3.size()
            r6 = 4
            if (r0 != r6) goto Lb0
            java.lang.Object r0 = r3.get(r12)
        Lad:
            java.lang.String r0 = (java.lang.String) r0
            goto Lb5
        Lb0:
            java.lang.Object r0 = r3.get(r4)
            goto Lad
        Lb5:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            goto Le1
        Lbe:
            l8.d r3 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r3.getClass()
            java.lang.String r3 = "filename"
            java.lang.String r4 = l8.d.m(r0, r3)
            boolean r6 = og.m.t0(r4)
            if (r6 == 0) goto Ld5
            java.lang.String r4 = "voiceurl"
            java.lang.String r4 = l8.d.m(r0, r4)
        Ld5:
            boolean r6 = og.m.t0(r4)
            if (r6 == 0) goto Le0
            java.lang.String r0 = l8.d.o(r0, r3)
            goto Le1
        Le0:
            r0 = r4
        Le1:
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto Le9
        Le7:
            r3 = r11
            goto L119
        Le9:
            java.lang.String[] r3 = new java.lang.String[]{r0}
            java.lang.String r3 = c(r3)
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto Lf8
            goto Lf9
        Lf8:
            r3 = 0
        Lf9:
            if (r3 == 0) goto Lfc
            goto L119
        Lfc:
            j8.p r3 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r3 == 0) goto L114
            j8.y r3 = r3.f6816b
            if (r3 == 0) goto L114
            java.lang.String r3 = r3.q(r0)
            if (r3 == 0) goto L114
            boolean r4 = eh.a.y(r3)
            if (r4 == 0) goto L114
            r5 = r3
            goto L115
        L114:
            r5 = 0
        L115:
            if (r5 != 0) goto L118
            goto Le7
        L118:
            r3 = r5
        L119:
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L120
            return r10
        L120:
            java.util.concurrent.ConcurrentHashMap r4 = j8.e.f6779a
            long r11 = r2.msgId
            java.lang.String r4 = r2.content
            java.lang.String r2 = r2.bodyContent()
            java.lang.String[] r2 = new java.lang.String[]{r4, r2}
            java.util.List r13 = a.a.y0(r2)
            r14 = 1000(0x3e8, float:1.401E-42)
            r10 = r0
            int r11 = j8.e.d(r9, r10, r11, r13, r14)
            v8.k r0 = new v8.k
            v8.f r7 = new v8.f
            r12 = 0
            r13 = 18
            r9 = 0
            r10 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.<init>(r7)
            return r0
        L149:
            k8.t r0 = fb.v0.e(r2, r9)
            boolean r13 = r2.isText()
            v8.l r14 = v8.l.f14269a
            if (r13 == 0) goto L17b
            if (r0 == 0) goto L15a
            java.lang.String r0 = r0.f7474c
            goto L15b
        L15a:
            r0 = 0
        L15b:
            if (r0 != 0) goto L15e
            goto L15f
        L15e:
            r11 = r0
        L15f:
            boolean r0 = og.m.t0(r11)
            if (r0 != 0) goto L167
            r9 = r11
            goto L168
        L167:
            r9 = 0
        L168:
            if (r9 == 0) goto L798
            v8.k r14 = new v8.k
            v8.f r7 = new v8.f
            r12 = 0
            r13 = 28
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.<init>(r7)
            goto L798
        L17b:
            boolean r13 = r2.isImage()
            r15 = r6
            java.util.concurrent.ConcurrentHashMap$KeySetView r7 = r1.f14279f
            r18 = r15
            java.lang.String r15 = "Hchat_auto_message_forward"
            android.content.Context r4 = r1.f14275b
            java.lang.String r5 = "CDN任务提交失败"
            java.lang.String r6 = "aeskey"
            java.lang.String r12 = "length"
            v8.i r23 = v8.i.f14266a
            r24 = r4
            java.lang.String r4 = "md5"
            if (r13 == 0) goto L400
            if (r0 == 0) goto L19b
            java.lang.String r0 = r0.f7477f
            goto L19c
        L19b:
            r0 = 0
        L19c:
            if (r0 != 0) goto L19f
            goto L1a0
        L19f:
            r11 = r0
        L1a0:
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L3fa
            j8.n r0 = r0.f6815a
            if (r0 == 0) goto L3fa
            h.Hchat.hooks.api.model.WeChatImageMsg r8 = r2.getImageMsg()
            java.lang.String r9 = r0.p(r9)
            java.lang.String[] r9 = new java.lang.String[]{r9}
            java.lang.String r9 = c(r9)
            boolean r13 = og.m.t0(r9)
            java.lang.String r14 = "hdlength"
            if (r13 != 0) goto L204
            if (r8 == 0) goto L1dc
            int r13 = r8.bigLength
            r31 = r10
            r32 = r11
            long r10 = (long) r13
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 <= 0) goto L1d4
            goto L1d5
        L1d4:
            r13 = 0
        L1d5:
            if (r13 == 0) goto L1e0
            long r10 = r13.longValue()
            goto L1e4
        L1dc:
            r31 = r10
            r32 = r11
        L1e0:
            long r10 = h(r2, r14)
        L1e4:
            boolean r10 = f(r3, r9, r10)
            if (r10 == 0) goto L208
            v8.k r10 = new v8.k
            v8.f r25 = new v8.f
            r30 = 0
            r31 = 26
            r26 = 3
            r27 = 0
            r29 = 0
            r28 = r9
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r0 = r25
            r10.<init>(r0)
            goto L3fd
        L204:
            r31 = r10
            r32 = r11
        L208:
            java.lang.String r10 = r3.f14258o
            java.lang.String[] r10 = new java.lang.String[]{r10}
            java.lang.String r10 = c(r10)
            boolean r11 = og.m.t0(r10)
            if (r11 != 0) goto L21b
            r36 = r10
            goto L21d
        L21b:
            r36 = 0
        L21d:
            if (r36 == 0) goto L237
            v8.k r10 = new v8.k
            v8.f r33 = new v8.f
            r38 = 0
            r39 = 26
            r34 = 3
            r35 = 0
            r37 = 0
            r33.<init>(r34, r35, r36, r37, r38, r39)
            r0 = r33
            r10.<init>(r0)
            goto L3fd
        L237:
            h.Hchat.hooks.api.model.WeChatImageMsg r10 = r2.getImageMsg()
            if (r10 == 0) goto L240
            java.lang.String r11 = r10.key
            goto L241
        L240:
            r11 = 0
        L241:
            java.lang.String r6 = i(r2, r6)
            java.lang.String[] r6 = new java.lang.String[]{r11, r6}
            java.lang.String r36 = e(r6)
            boolean r6 = og.m.t0(r36)
            if (r6 == 0) goto L256
        L253:
            r4 = 0
            goto L301
        L256:
            if (r10 == 0) goto L25b
            java.lang.String r6 = r10.bigImgUrl
            goto L25c
        L25b:
            r6 = 0
        L25c:
            java.lang.String r11 = "cdnbigimgurl"
            java.lang.String r11 = i(r2, r11)
            java.lang.String[] r6 = new java.lang.String[]{r6, r11}
            java.lang.String r35 = e(r6)
            boolean r6 = og.m.t0(r35)
            if (r6 != 0) goto L2ac
            if (r10 == 0) goto L275
            java.lang.String r6 = r10.md5
            goto L276
        L275:
            r6 = 0
        L276:
            java.lang.String r4 = i(r2, r4)
            java.lang.String[] r4 = new java.lang.String[]{r6, r4}
            java.lang.String r34 = e(r4)
            if (r10 == 0) goto L288
            int r4 = r10.bigLength
            long r10 = (long) r4
            goto L28a
        L288:
            r10 = r18
        L28a:
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            int r6 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r6 <= 0) goto L293
            goto L294
        L293:
            r4 = 0
        L294:
            if (r4 == 0) goto L29d
            long r10 = r4.longValue()
        L29a:
            r38 = r10
            goto L2a2
        L29d:
            long r10 = h(r2, r14)
            goto L29a
        L2a2:
            v8.e r33 = new v8.e
            r37 = 1
            r33.<init>(r34, r35, r36, r37, r38)
        L2a9:
            r4 = r33
            goto L301
        L2ac:
            if (r10 == 0) goto L2b1
            java.lang.String r6 = r10.midImgUrl
            goto L2b2
        L2b1:
            r6 = 0
        L2b2:
            java.lang.String r11 = "cdnmidimgurl"
            java.lang.String r11 = i(r2, r11)
            java.lang.String[] r6 = new java.lang.String[]{r6, r11}
            java.lang.String r35 = e(r6)
            boolean r6 = og.m.t0(r35)
            if (r6 == 0) goto L2c7
            goto L253
        L2c7:
            if (r10 == 0) goto L2cc
            java.lang.String r6 = r10.md5
            goto L2cd
        L2cc:
            r6 = 0
        L2cd:
            java.lang.String r4 = i(r2, r4)
            java.lang.String[] r4 = new java.lang.String[]{r6, r4}
            java.lang.String r34 = e(r4)
            if (r10 == 0) goto L2df
            int r4 = r10.midLength
            long r10 = (long) r4
            goto L2e1
        L2df:
            r10 = r18
        L2e1:
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            int r6 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r6 <= 0) goto L2ea
            goto L2eb
        L2ea:
            r4 = 0
        L2eb:
            if (r4 == 0) goto L2f4
            long r10 = r4.longValue()
        L2f1:
            r38 = r10
            goto L2f9
        L2f4:
            long r10 = h(r2, r12)
            goto L2f1
        L2f9:
            v8.e r33 = new v8.e
            r37 = 2
            r33.<init>(r34, r35, r36, r37, r38)
            goto L2a9
        L301:
            if (r4 == 0) goto L377
            boolean r6 = r3.f14259p
            if (r6 != 0) goto L377
            java.io.File r6 = new java.io.File
            java.io.File r10 = r24.getCacheDir()
            r6.<init>(r10, r15)
            r6.mkdirs()
            java.io.File r10 = new java.io.File
            java.lang.String r11 = r3.f14256m
            java.lang.String r13 = "image_"
            java.lang.String r14 = ".jpg"
            java.lang.String r11 = eh.a.n(r13, r11, r14)
            r10.<init>(r6, r11)
            java.lang.String r6 = r10.getAbsolutePath()
            r6.getClass()
            r3.f14257n = r6
            java.io.File r10 = new java.io.File
            r10.<init>(r6)
            java.lang.String r10 = r1.g(r10)
            if (r10 == 0) goto L33c
            r7.getClass()
            r7.add(r10)
        L33c:
            r7 = 1
            r3.f14259p = r7
            r3.f14260q = r7
            java.lang.String r7 = r4.f14228b
            java.lang.String r10 = r4.f14229c
            int r11 = r4.f14230d
            p4.t r13 = new p4.t
            r14 = 13
            r13.<init>(r1, r14, r3)
            r25 = r0
            r28 = r6
            r26 = r7
            r27 = r10
            r29 = r11
            r30 = r13
            boolean r0 = r25.e(r26, r27, r28, r29, r30)
            if (r0 == 0) goto L36f
            v8.b r0 = new v8.b
            r0.<init>(r3, r1)
            r2 = 60000(0xea60, double:2.9644E-319)
            r1.o(r2, r0)
        L36b:
            r10 = r23
            goto L3fd
        L36f:
            r6 = 0
            r3.f14260q = r6
            r7 = 1
            r3.f14261r = r7
            r3.f14262s = r5
        L377:
            boolean r0 = r3.f14260q
            if (r0 == 0) goto L37c
            goto L36b
        L37c:
            boolean r0 = r3.f14261r
            java.lang.String r5 = "图片下载失败"
            if (r0 == 0) goto L395
            if (r4 == 0) goto L395
            java.lang.String r0 = r3.f14262s
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L38d
            goto L38e
        L38d:
            r5 = r0
        L38e:
            v8.j r10 = new v8.j
            r10.<init>(r5)
            goto L3fd
        L395:
            java.lang.String r0 = r2.imagePath
            r11 = r32
            java.lang.String[] r0 = new java.lang.String[]{r11, r9, r0}
            java.lang.String r0 = c(r0)
            boolean r4 = og.m.t0(r0)
            if (r4 != 0) goto L3e3
            if (r8 == 0) goto L3c0
            int r4 = r8.midLength
            long r6 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            int r6 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r6 <= 0) goto L3b7
            r17 = r4
            goto L3b9
        L3b7:
            r17 = 0
        L3b9:
            if (r17 == 0) goto L3c0
            long r6 = r17.longValue()
            goto L3c4
        L3c0:
            long r6 = h(r2, r12)
        L3c4:
            boolean r2 = f(r3, r0, r6)
            if (r2 == 0) goto L3e3
            v8.k r10 = new v8.k
            v8.f r20 = new v8.f
            r25 = 0
            r26 = 26
            r21 = 3
            r22 = 0
            r24 = 0
            r23 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r0 = r20
            r10.<init>(r0)
            goto L3fd
        L3e3:
            boolean r0 = r3.f14261r
            if (r0 == 0) goto L3f7
            java.lang.String r0 = r3.f14262s
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L3f0
            goto L3f1
        L3f0:
            r5 = r0
        L3f1:
            v8.j r10 = new v8.j
            r10.<init>(r5)
            goto L3fd
        L3f7:
            r10 = r31
            goto L3fd
        L3fa:
            r31 = r10
            goto L3f7
        L3fd:
            r14 = r10
            goto L798
        L400:
            r31 = r10
            boolean r9 = r2.isVideo()
            if (r9 == 0) goto L647
            if (r0 == 0) goto L40d
            java.lang.String r0 = r0.f7477f
            goto L40e
        L40d:
            r0 = 0
        L40e:
            if (r0 != 0) goto L411
            goto L412
        L411:
            r11 = r0
        L412:
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L3f7
            bb.b r9 = r0.f6817c
            if (r9 == 0) goto L3f7
            java.lang.String r0 = r2.imagePath
            java.lang.String[] r0 = new java.lang.String[]{r0, r11}
            ng.j r0 = tf.l.k0(r0)
            r9.p r10 = new r9.p
            r13 = 14
            r10.<init>(r13)
            ng.t r0 = ng.m.W(r0, r10)
            r9.p r10 = new r9.p
            r13 = 15
            r10.<init>(r13)
            ng.i r13 = new ng.i
            r14 = 1
            r13.<init>(r0, r14, r10)
            ng.c r0 = ng.m.S(r13)
            java.util.Iterator r10 = r0.iterator()
            r13 = 0
        L447:
            r0 = r10
            tf.b r0 = (tf.b) r0
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L486
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            j8.r r0 = r9.n(r0)     // Catch: java.lang.Throwable -> L45b
            goto L462
        L45b:
            r0 = move-exception
            sf.f r14 = new sf.f
            r14.<init>(r0)
            r0 = r14
        L462:
            boolean r14 = r0 instanceof sf.f
            if (r14 == 0) goto L468
            r0 = 0
        L468:
            j8.r r0 = (j8.r) r0
            if (r0 == 0) goto L447
            if (r13 != 0) goto L46f
            r13 = r0
        L46f:
            java.lang.String r14 = r0.f6822b
            r14.getClass()
            boolean r14 = og.m.t0(r14)
            if (r14 != 0) goto L447
            java.lang.String r14 = r0.f6823c
            r14.getClass()
            boolean r14 = og.m.t0(r14)
            if (r14 != 0) goto L447
            r13 = r0
        L486:
            h.Hchat.hooks.api.model.WeChatVideoMsg r0 = r2.getVideoMsg()
            if (r13 == 0) goto L48f
            java.lang.String r10 = r13.f6822b
            goto L490
        L48f:
            r10 = 0
        L490:
            if (r0 == 0) goto L497
            java.lang.String r14 = r0.cdnVideoUrl
        L494:
            r25 = r8
            goto L499
        L497:
            r14 = 0
            goto L494
        L499:
            java.lang.String r8 = "cdnvideourl"
            java.lang.String r8 = i(r2, r8)
            java.lang.String[] r8 = new java.lang.String[]{r10, r14, r8}
            java.lang.String r34 = e(r8)
            if (r13 == 0) goto L4ac
            java.lang.String r8 = r13.f6823c
            goto L4ad
        L4ac:
            r8 = 0
        L4ad:
            if (r0 == 0) goto L4b2
            java.lang.String r10 = r0.aesKey
            goto L4b3
        L4b2:
            r10 = 0
        L4b3:
            java.lang.String r6 = i(r2, r6)
            java.lang.String[] r6 = new java.lang.String[]{r8, r10, r6}
            java.lang.String r35 = e(r6)
            boolean r6 = og.m.t0(r34)
            if (r6 != 0) goto L4cb
            boolean r6 = og.m.t0(r35)
            if (r6 == 0) goto L4ce
        L4cb:
            r6 = r5
            goto L534
        L4ce:
            if (r13 == 0) goto L4d3
            java.lang.String r6 = r13.f6821a
            goto L4d4
        L4d3:
            r6 = 0
        L4d4:
            if (r0 == 0) goto L4d9
            java.lang.String r8 = r0.md5
            goto L4da
        L4d9:
            r8 = 0
        L4da:
            if (r0 == 0) goto L4df
            java.lang.String r10 = r0.newMd5
            goto L4e0
        L4df:
            r10 = 0
        L4e0:
            java.lang.String r4 = i(r2, r4)
            java.lang.String r14 = "newmd5"
            java.lang.String r14 = i(r2, r14)
            java.lang.String[] r4 = new java.lang.String[]{r6, r8, r10, r4, r14}
            java.lang.String r33 = e(r4)
            r6 = r5
            if (r13 == 0) goto L4f8
            long r4 = r13.f6824d
            goto L4fa
        L4f8:
            r4 = r18
        L4fa:
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            int r4 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r4 <= 0) goto L503
            goto L504
        L503:
            r8 = 0
        L504:
            if (r8 == 0) goto L50d
            long r4 = r8.longValue()
        L50a:
            r37 = r4
            goto L52a
        L50d:
            if (r0 == 0) goto L512
            long r4 = r0.length
            goto L514
        L512:
            r4 = r18
        L514:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            int r4 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r4 <= 0) goto L51d
            goto L51e
        L51d:
            r0 = 0
        L51e:
            if (r0 == 0) goto L525
            long r4 = r0.longValue()
            goto L50a
        L525:
            long r4 = h(r2, r12)
            goto L50a
        L52a:
            v8.e r32 = new v8.e
            r36 = 4
            r32.<init>(r33, r34, r35, r36, r37)
            r0 = r32
            goto L535
        L534:
            r0 = 0
        L535:
            java.lang.String r4 = r2.imagePath
            java.lang.String r5 = r9.o(r4)
            java.lang.String[] r4 = new java.lang.String[]{r11, r4, r5}
            java.lang.String r10 = c(r4)
            boolean r4 = og.m.t0(r10)
            if (r4 != 0) goto L594
            if (r13 == 0) goto L55e
            long r4 = r13.f6824d
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            int r4 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r4 <= 0) goto L556
            goto L557
        L556:
            r8 = 0
        L557:
            if (r8 == 0) goto L55e
            long r4 = r8.longValue()
            goto L57a
        L55e:
            if (r0 == 0) goto L563
            long r4 = r0.f14231e
            goto L57a
        L563:
            h.Hchat.hooks.api.model.WeChatVideoMsg r2 = r2.getVideoMsg()
            if (r2 == 0) goto L570
            long r4 = r2.length
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L571
        L570:
            r2 = 0
        L571:
            if (r2 == 0) goto L578
            long r4 = r2.longValue()
            goto L57a
        L578:
            r4 = r18
        L57a:
            boolean r2 = f(r3, r10, r4)
            if (r2 == 0) goto L594
            v8.k r0 = new v8.k
            v8.f r7 = new v8.f
            r12 = 0
            r13 = 26
            r9 = 0
            r11 = 0
            r8 = r25
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.<init>(r7)
        L591:
            r10 = r0
            goto L3fd
        L594:
            r8 = r25
            java.lang.String r2 = r3.f14258o
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r2 = c(r2)
            boolean r4 = og.m.t0(r2)
            if (r4 != 0) goto L5a8
            r10 = r2
            goto L5a9
        L5a8:
            r10 = 0
        L5a9:
            if (r10 == 0) goto L5bb
            v8.k r0 = new v8.k
            v8.f r7 = new v8.f
            r12 = 0
            r13 = 26
            r9 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.<init>(r7)
            goto L591
        L5bb:
            if (r0 == 0) goto L62c
            boolean r2 = r3.f14259p
            if (r2 != 0) goto L62c
            java.io.File r2 = new java.io.File
            java.io.File r4 = r24.getCacheDir()
            r2.<init>(r4, r15)
            r2.mkdirs()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r3.f14256m
            java.lang.String r8 = "video_"
            java.lang.String r10 = ".mp4"
            java.lang.String r5 = eh.a.n(r8, r5, r10)
            r4.<init>(r2, r5)
            java.lang.String r13 = r4.getAbsolutePath()
            r13.getClass()
            r3.f14257n = r13
            java.io.File r2 = new java.io.File
            r2.<init>(r13)
            java.lang.String r2 = r1.g(r2)
            if (r2 == 0) goto L5f6
            r7.getClass()
            r7.add(r2)
        L5f6:
            r7 = 1
            r3.f14259p = r7
            r3.f14260q = r7
            java.lang.String r11 = r0.f14228b
            java.lang.String r12 = r0.f14229c
            b5.c r2 = new b5.c
            r2.<init>(r0, r1, r3)
            java.lang.Object r0 = r9.f640d
            r10 = r0
            j8.n r10 = (j8.n) r10
            androidx.lifecycle.x r15 = new androidx.lifecycle.x
            r0 = 27
            r15.<init>(r2, r0)
            r14 = 4
            boolean r0 = r10.e(r11, r12, r13, r14, r15)
            if (r0 == 0) goto L624
            v8.b r0 = new v8.b
            r0.<init>(r3, r1)
            r2 = 60000(0xea60, double:2.9644E-319)
            r1.o(r2, r0)
            goto L36b
        L624:
            r2 = 0
            r3.f14260q = r2
            r7 = 1
            r3.f14261r = r7
            r3.f14262s = r6
        L62c:
            boolean r0 = r3.f14260q
            if (r0 == 0) goto L632
            goto L36b
        L632:
            boolean r0 = r3.f14261r
            if (r0 == 0) goto L3f7
            java.lang.String r0 = r3.f14262s
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L640
            java.lang.String r0 = "视频下载失败"
        L640:
            v8.j r10 = new v8.j
            r10.<init>(r0)
            goto L3fd
        L647:
            r3 = 62
            if (r8 != r3) goto L677
            if (r0 == 0) goto L650
            java.lang.String r0 = r0.f7477f
            goto L651
        L650:
            r0 = 0
        L651:
            java.lang.String r2 = r2.imagePath
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.lang.String r0 = c(r0)
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L663
            r10 = r0
            goto L664
        L663:
            r10 = 0
        L664:
            if (r10 == 0) goto L3f7
            v8.k r0 = new v8.k
            v8.f r7 = new v8.f
            r12 = 0
            r13 = 26
            r9 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.<init>(r7)
            goto L591
        L677:
            boolean r3 = r2.isEmoji()
            if (r3 == 0) goto L6fc
            if (r0 == 0) goto L682
            java.lang.String r0 = r0.f7477f
            goto L683
        L682:
            r0 = 0
        L683:
            if (r0 != 0) goto L686
            goto L687
        L686:
            r11 = r0
        L687:
            java.lang.String r0 = r2.imagePath
            java.lang.String[] r0 = new java.lang.String[]{r11, r0}
            java.lang.String r0 = c(r0)
            boolean r3 = og.m.t0(r0)
            if (r3 != 0) goto L698
            goto L699
        L698:
            r0 = 0
        L699:
            if (r0 == 0) goto L69c
            goto L6e0
        L69c:
            java.lang.String r0 = r2.imagePath
            java.lang.String[] r0 = new java.lang.String[]{r11, r0}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
        L6aa:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L6c0
            java.lang.Object r3 = r0.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            og.k r6 = v8.q.f14273i
            boolean r5 = r6.d(r5)
            if (r5 == 0) goto L6aa
            goto L6c1
        L6c0:
            r3 = 0
        L6c1:
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6c7
            goto L6e0
        L6c7:
            java.lang.String r0 = r2.bodyContent()
            l8.d r2 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r2.getClass()
            java.lang.String r2 = l8.d.m(r0, r4)
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L6df
            java.lang.String r0 = l8.d.o(r0, r4)
            goto L6e0
        L6df:
            r0 = r2
        L6e0:
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L6e8
            r10 = r0
            goto L6e9
        L6e8:
            r10 = 0
        L6e9:
            if (r10 == 0) goto L3f7
            v8.k r0 = new v8.k
            v8.f r7 = new v8.f
            r12 = 0
            r13 = 26
            r9 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.<init>(r7)
            goto L591
        L6fc:
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L73c
            if (r0 == 0) goto L707
            java.lang.String r0 = r0.f7477f
            goto L708
        L707:
            r0 = 0
        L708:
            java.lang.String r3 = r2.imagePath
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            java.lang.String r0 = c(r0)
            boolean r3 = og.m.t0(r0)
            if (r3 != 0) goto L71a
            r10 = r0
            goto L71b
        L71a:
            r10 = 0
        L71b:
            if (r10 == 0) goto L3f7
            v8.k r0 = new v8.k
            v8.f r7 = new v8.f
            h.Hchat.hooks.api.model.WeChatFileMsg r2 = r2.getFileMsg()
            if (r2 == 0) goto L72a
            java.lang.String r5 = r2.title
            goto L72b
        L72a:
            r5 = 0
        L72b:
            if (r5 != 0) goto L72f
            r12 = r11
            goto L730
        L72f:
            r12 = r5
        L730:
            r13 = 10
            r9 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.<init>(r7)
            goto L591
        L73c:
            boolean r3 = r2.isShareCard()
            if (r3 != 0) goto L774
            boolean r3 = r2.isLocation()
            if (r3 == 0) goto L749
            goto L774
        L749:
            boolean r2 = fb.v0.y(r2)
            if (r2 == 0) goto L798
            if (r0 == 0) goto L754
            java.lang.String r0 = r0.f7474c
            goto L755
        L754:
            r0 = 0
        L755:
            if (r0 != 0) goto L758
            goto L759
        L758:
            r11 = r0
        L759:
            boolean r0 = og.m.t0(r11)
            if (r0 != 0) goto L761
            r9 = r11
            goto L762
        L761:
            r9 = 0
        L762:
            if (r9 == 0) goto L798
            v8.k r14 = new v8.k
            v8.f r7 = new v8.f
            r12 = 0
            r13 = 28
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.<init>(r7)
            goto L798
        L774:
            if (r0 == 0) goto L779
            java.lang.String r0 = r0.f7474c
            goto L77a
        L779:
            r0 = 0
        L77a:
            if (r0 != 0) goto L77d
            goto L77e
        L77d:
            r11 = r0
        L77e:
            boolean r0 = og.m.t0(r11)
            if (r0 != 0) goto L786
            r9 = r11
            goto L787
        L786:
            r9 = 0
        L787:
            if (r9 == 0) goto L798
            v8.k r14 = new v8.k
            v8.f r7 = new v8.f
            r12 = 0
            r13 = 28
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.<init>(r7)
        L798:
            return r14
    }

    public final void k(v8.h r13) {
            r12 = this;
            java.lang.String r0 = " msgSvrId="
            i2.y r1 = r12.f14274a
            java.lang.String r2 = "消息类型暂不支持静默转发: talker="
            java.lang.String r3 = "消息媒体准备失败: talker="
            java.lang.String r4 = "等待消息媒体文件超时: talker="
            v8.r r5 = v8.r.f14282a
            android.content.Context r5 = r12.f14275b
            boolean r5 = v8.r.a(r5)
            if (r5 != 0) goto L18
            r12.d(r13)
            return
        L18:
            k8.s r5 = h.Hchat.hooks.api.core.WeChatApis.messageStore()     // Catch: java.lang.Throwable -> L5b
            r6 = 0
            if (r5 == 0) goto L44
            long r7 = r13.f14246c     // Catch: java.lang.Throwable -> L5b
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L37
            java.lang.String r9 = r13.f14245b     // Catch: java.lang.Throwable -> L5b
            h.Hchat.hooks.api.model.WeChatMessage r7 = r5.e(r7, r9)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L30
            goto L45
        L30:
            long r7 = r13.f14246c     // Catch: java.lang.Throwable -> L5b
            h.Hchat.hooks.api.model.WeChatMessage r7 = r5.d(r7)     // Catch: java.lang.Throwable -> L5b
            goto L45
        L37:
            h.Hchat.hooks.api.model.WeChatMessage r7 = r13.f14247d     // Catch: java.lang.Throwable -> L5b
            long r7 = r7.msgId     // Catch: java.lang.Throwable -> L5b
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 <= 0) goto L44
            h.Hchat.hooks.api.model.WeChatMessage r7 = r5.c(r7)     // Catch: java.lang.Throwable -> L5b
            goto L45
        L44:
            r7 = r6
        L45:
            if (r7 == 0) goto L48
            goto L4a
        L48:
            h.Hchat.hooks.api.model.WeChatMessage r7 = r13.f14247d     // Catch: java.lang.Throwable -> L5b
        L4a:
            v8.n r5 = r12.j(r7, r13)     // Catch: java.lang.Throwable -> L5b
            boolean r8 = r5 instanceof v8.k     // Catch: java.lang.Throwable -> L5b
            r9 = 0
            if (r8 == 0) goto L5e
            v8.k r5 = (v8.k) r5     // Catch: java.lang.Throwable -> L5b
            v8.f r2 = r5.f14268a     // Catch: java.lang.Throwable -> L5b
            r12.q(r13, r2, r9)     // Catch: java.lang.Throwable -> L5b
            return
        L5b:
            r2 = move-exception
            goto L101
        L5e:
            v8.m r8 = v8.m.f14270a     // Catch: java.lang.Throwable -> L5b
            boolean r8 = r5.equals(r8)     // Catch: java.lang.Throwable -> L5b
            if (r8 == 0) goto L9e
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5b
            long r7 = r13.f14255l     // Catch: java.lang.Throwable -> L5b
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L81
            v8.b r2 = new v8.b     // Catch: java.lang.Throwable -> L5b
            r2.<init>(r12, r13, r9)     // Catch: java.lang.Throwable -> L5b
            r3 = 500(0x1f4, double:2.47E-321)
            boolean r2 = r12.o(r3, r2)     // Catch: java.lang.Throwable -> L5b
            if (r2 != 0) goto La6
            r12.d(r13)     // Catch: java.lang.Throwable -> L5b
            return
        L81:
            r12.d(r13)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r13.f14245b     // Catch: java.lang.Throwable -> L5b
            long r7 = r13.f14246c     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            r3.append(r2)     // Catch: java.lang.Throwable -> L5b
            r3.append(r0)     // Catch: java.lang.Throwable -> L5b
            r3.append(r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L5b
            r1.invoke(r2, r6)     // Catch: java.lang.Throwable -> L5b
            return
        L9e:
            v8.i r4 = v8.i.f14266a     // Catch: java.lang.Throwable -> L5b
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto La7
        La6:
            return
        La7:
            boolean r4 = r5 instanceof v8.j     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto Ld4
            r12.d(r13)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r13.f14245b     // Catch: java.lang.Throwable -> L5b
            long r7 = r13.f14246c     // Catch: java.lang.Throwable -> L5b
            v8.j r5 = (v8.j) r5     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r5.f14267a     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L5b
            r5.append(r2)     // Catch: java.lang.Throwable -> L5b
            r5.append(r0)     // Catch: java.lang.Throwable -> L5b
            r5.append(r7)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = " reason="
            r5.append(r2)     // Catch: java.lang.Throwable -> L5b
            r5.append(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L5b
            r1.invoke(r2, r6)     // Catch: java.lang.Throwable -> L5b
            return
        Ld4:
            v8.l r3 = v8.l.f14269a     // Catch: java.lang.Throwable -> L5b
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto Lfb
            r12.d(r13)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r13.f14245b     // Catch: java.lang.Throwable -> L5b
            int r4 = r7.type     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L5b
            r5.append(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = " type="
            r5.append(r2)     // Catch: java.lang.Throwable -> L5b
            r5.append(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L5b
            r1.invoke(r2, r6)     // Catch: java.lang.Throwable -> L5b
            return
        Lfb:
            af.d r2 = new af.d     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r2     // Catch: java.lang.Throwable -> L5b
        L101:
            r12.d(r13)
            java.lang.String r3 = r13.f14245b
            long r4 = r13.f14246c
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r6 = "准备转发消息异常: talker="
            r13.<init>(r6)
            r13.append(r3)
            r13.append(r0)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r1.invoke(r13, r2)
            return
    }

    public final void m(v8.g r6) {
            r5 = this;
            java.lang.String r0 = r6.f14237a
            int r1 = r6.f14238b
            java.util.ArrayList r0 = l(r1, r0)
            dg.n r1 = new dg.n
            r2 = 6
            r1.<init>(r0, r2)
            nb.a r0 = new nb.a
            r2 = 17
            r0.<init>(r6, r2, r5)
            ng.i r2 = new ng.i
            r3 = 1
            r2.<init>(r1, r3, r0)
            ng.h r0 = new ng.h
            r0.<init>(r2)
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            h.Hchat.hooks.api.model.WeChatMessage r1 = (h.Hchat.hooks.api.model.WeChatMessage) r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = r6.f14242f
            long r3 = r1.msgId
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.add(r3)
            long r1 = r1.msgSvrId
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L20
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = r6.f14243g
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.add(r1)
            goto L20
        L49:
            return
    }

    public final boolean o(long r5, fg.a r7) {
            r4 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r4.f14276c
            boolean r1 = r0.isShutdown()
            if (r1 == 0) goto La
            r5 = 0
            return r5
        La:
            b0.c r1 = new b0.c     // Catch: java.lang.Throwable -> L1f
            r2 = 3
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L17
            r5 = r2
        L17:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L1f
            r0.schedule(r1, r5, r7)     // Catch: java.lang.Throwable -> L1f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L26:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r5 instanceof sf.f
            if (r7 == 0) goto L2d
            r5 = r6
        L2d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
    }

    public final void q(v8.h r4, v8.f r5, int r6) {
            r3 = this;
            r3.r(r4, r5, r6)     // Catch: java.lang.Throwable -> L6
            sf.n r5 = sf.n.f12433a     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        Ld:
            java.lang.Throwable r5 = sf.g.b(r5)
            if (r5 == 0) goto L35
            r3.d(r4)
            java.lang.String r6 = r4.f14245b
            long r0 = r4.f14246c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "执行转发任务异常: talker="
            r4.<init>(r2)
            r4.append(r6)
            java.lang.String r6 = " msgSvrId="
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            i2.y r6 = r3.f14274a
            r6.invoke(r4, r5)
        L35:
            return
    }

    public final void r(v8.h r21, v8.f r22, int r23) {
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            int r4 = r3.f14232a
            v8.r r0 = v8.r.f14282a
            android.content.Context r0 = r1.f14275b
            boolean r5 = v8.r.a(r0)
            if (r5 != 0) goto L16
            r20.d(r21)
            return
        L16:
            r5 = r4
            gg.s r4 = new gg.s
            r4.<init>()
            r6 = r23
            r4.f4562g = r6
            r6 = 0
            r7 = r6
        L22:
            int r8 = r4.f4562g
            java.util.List r9 = r2.f14248e
            int r10 = r9.size()
            r11 = 1
            if (r8 >= r10) goto La1
            int r7 = r4.f4562g
            java.lang.Object r7 = r9.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.util.LinkedHashMap r8 = r2.f14249f
            java.lang.Object r8 = r8.get(r7)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L41
            tf.u r8 = tf.u.f13168g
        L41:
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L97
            v8.r r10 = v8.r.f14282a
            boolean r10 = v8.r.a(r0)
            if (r10 != 0) goto L50
            goto L97
        L50:
            java.util.List r10 = v8.r.b(r0)
            dg.n r10 = tf.m.m1(r10)
            b0.s r12 = new b0.s
            r12.<init>(r8, r7, r1, r2)
            ng.i r7 = new ng.i
            r7.<init>(r10, r11, r12)
            nb.a r10 = new nb.a
            r12 = 18
            r10.<init>(r8, r12)
            ng.i r7 = ng.m.X(r7, r10)
            ng.h r8 = new ng.h
            r8.<init>(r7)
            boolean r7 = r8.hasNext()
            if (r7 != 0) goto L7a
            r7 = r6
            goto L94
        L7a:
            java.lang.Object r7 = r8.next()
            java.lang.Comparable r7 = (java.lang.Comparable) r7
        L80:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L94
            java.lang.Object r10 = r8.next()
            java.lang.Comparable r10 = (java.lang.Comparable) r10
            int r12 = r7.compareTo(r10)
            if (r12 <= 0) goto L80
            r7 = r10
            goto L80
        L94:
            java.lang.Long r7 = (java.lang.Long) r7
            goto L98
        L97:
            r7 = r6
        L98:
            if (r7 == 0) goto L9b
            goto La1
        L9b:
            int r8 = r4.f4562g
            int r8 = r8 + r11
            r4.f4562g = r8
            goto L22
        La1:
            int r0 = r4.f4562g
            int r8 = r9.size()
            if (r0 < r8) goto Lad
            r20.d(r21)
            return
        Lad:
            int r0 = r4.f4562g
            java.lang.Object r0 = r9.get(r0)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            long r12 = java.lang.System.currentTimeMillis()
            long r14 = r1.f14281h
            if (r7 == 0) goto Lcb
            long r16 = r7.longValue()
            r23 = r11
            r18 = r16
            r16 = r12
            r11 = r18
            goto Ld1
        Lcb:
            r23 = r11
            r16 = r12
            r11 = r16
        Ld1:
            long r10 = java.lang.Math.max(r14, r11)
            long r10 = r10 - r16
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 >= 0) goto Lde
            r10 = r12
        Lde:
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto Lf2
            v8.d r0 = new v8.d
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r1.o(r10, r0)
            if (r0 != 0) goto L16e
            r20.d(r21)
            return
        Lf2:
            boolean r0 = r1.s(r3, r8)     // Catch: java.lang.Throwable -> Lfb
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lfb
            goto L102
        Lfb:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L102:
            java.lang.Throwable r2 = sf.g.b(r0)
            java.lang.String r7 = " type="
            i2.y r10 = r1.f14274a
            if (r2 == 0) goto L123
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "转发消息异常: target="
            r11.<init>(r12)
            r11.append(r8)
            r11.append(r7)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            r10.invoke(r11, r2)
        L123:
            boolean r2 = r0 instanceof sf.f
            if (r2 != 0) goto L146
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L146
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "转发消息失败: target="
            r0.<init>(r2)
            r0.append(r8)
            r0.append(r7)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r10.invoke(r0, r6)
        L146:
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 500(0x1f4, double:2.47E-321)
            long r5 = r5 + r7
            r1.f14281h = r5
            int r0 = r4.f4562g
            int r0 = r0 + 1
            int r2 = r9.size()
            if (r0 >= r2) goto L16b
            v8.d r0 = new v8.d
            r5 = 1
            r2 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r1.o(r7, r0)
            if (r0 != 0) goto L16e
            r20.d(r21)
            goto L16e
        L16b:
            r20.d(r21)
        L16e:
            return
    }

    public final boolean s(v8.f r11, java.lang.String r12) {
            r10 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 - r2
            ca.c r2 = new ca.c
            r3 = 14
            r2.<init>(r0, r3)
            be.i r0 = new be.i
            r1 = 28
            r0.<init>(r2, r1)
            java.util.concurrent.ConcurrentLinkedDeque r1 = r10.f14280g
            r1.removeIf(r0)
        L1a:
            int r0 = r1.size()
            r2 = 128(0x80, float:1.8E-43)
            if (r0 < r2) goto L26
            r1.pollFirst()
            goto L1a
        L26:
            int r0 = r11.f14232a
            r2 = 62
            if (r0 != r2) goto L30
            r0 = 43
        L2e:
            r4 = r0
            goto L4e
        L30:
            if (r0 > 0) goto L33
            goto L2e
        L33:
            r2 = r0 & 255(0xff, float:3.57E-43)
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            int r4 = r0 >>> 16
            if (r4 != 0) goto L3e
            goto L2e
        L3e:
            r4 = 10000(0x2710, float:1.4013E-41)
            if (r3 == r4) goto L4c
            r4 = 10002(0x2712, float:1.4016E-41)
            if (r3 == r4) goto L4c
            if (r2 == 0) goto L2e
            if (r3 != r2) goto L2e
            r0 = r2
            goto L2e
        L4c:
            r0 = r3
            goto L2e
        L4e:
            java.lang.String r5 = r11.f14233b
            java.util.ArrayList r0 = l(r4, r12)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r0.next()
            h.Hchat.hooks.api.model.WeChatMessage r2 = (h.Hchat.hooks.api.model.WeChatMessage) r2
            long r2 = r2.msgId
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 <= 0) goto L76
            goto L77
        L76:
            r7 = 0
        L77:
            if (r7 == 0) goto L5d
            r6.add(r7)
            goto L5d
        L7d:
            long r7 = java.lang.System.currentTimeMillis()
            v8.g r2 = new v8.g
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r1.addLast(r2)
            boolean r11 = p(r11, r3)     // Catch: java.lang.Throwable -> L94
            if (r11 == 0) goto L97
            r10.m(r2)     // Catch: java.lang.Throwable -> L94
            return r11
        L94:
            r0 = move-exception
            r11 = r0
            goto L9b
        L97:
            r1.remove(r2)     // Catch: java.lang.Throwable -> L94
            return r11
        L9b:
            r1.remove(r2)
            throw r11
    }
}
