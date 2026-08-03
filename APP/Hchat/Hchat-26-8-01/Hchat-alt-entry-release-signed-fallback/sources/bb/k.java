package bb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb.l f675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b9.f f676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ab.b f677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bb.c f678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayDeque f680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f692r;

    public k(bb.l r1, b9.f r2, ab.b r3, bb.c r4) {
            r0 = this;
            r0.<init>()
            r0.f675a = r1
            r0.f676b = r2
            r0.f677c = r3
            r0.f678d = r4
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f679e = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.f680f = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.f681g = r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r0.f682h = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f683i = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f684j = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f685k = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f686l = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f687m = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f688n = r1
            return
    }

    public static boolean g(java.lang.String r2) {
            java.lang.String r0 = "@chatroom"
            r1 = 0
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L13
            java.lang.String r0 = "@im.chatroom"
            boolean r2 = og.t.W(r2, r0, r1)
            if (r2 == 0) goto L12
            goto L13
        L12:
            return r1
        L13:
            r2 = 1
            return r2
    }

    public static boolean h(java.lang.String r2) {
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.c()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            int r1 = r0.length()
            if (r1 <= 0) goto L1e
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1e
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public static java.lang.String n(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "|"
            java.lang.String r1 = wb.en.h(r1, r0, r2)
            return r1
    }

    public final boolean a() {
            r4 = this;
            java.lang.Object r0 = r4.f679e
            monitor-enter(r0)
            boolean r1 = r4.f690p     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto La
            monitor-exit(r0)
            r0 = 0
            return r0
        La:
            r1 = 1
            r4.f690p = r1     // Catch: java.lang.Throwable -> L15
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L15
            r4.f691q = r2     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return r1
        L15:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void b(long r4, java.lang.String r6) {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r3.f688n
            java.lang.Object r1 = r0.get(r6)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 != 0) goto Lb
            goto L16
        Lb:
            long r1 = r1.longValue()
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L16
            r0.remove(r6)
        L16:
            return
    }

    public final void c(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            boolean r0 = g(r5)
            if (r0 == 0) goto L4e
            og.k r0 = bb.l.f693c
            boolean r0 = fb.v0.A(r6)
            if (r0 != 0) goto Lf
            goto L4e
        Lf:
            bb.l r0 = r4.f675a
            boolean r0 = r0.e(r6)
            if (r0 != 0) goto L4e
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r4.f682h
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L4e
            boolean r0 = r4.e(r5, r6)
            if (r0 == 0) goto L26
            goto L4e
        L26:
            java.lang.String r0 = n(r5, r6)
            java.lang.Object r1 = r4.f679e
            monitor-enter(r1)
            java.util.HashSet r2 = r4.f681g     // Catch: java.lang.Throwable -> L4b
            boolean r2 = r2.contains(r0)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L37
            monitor-exit(r1)
            return
        L37:
            java.util.ArrayDeque r2 = r4.f680f     // Catch: java.lang.Throwable -> L4b
            sf.e r3 = new sf.e     // Catch: java.lang.Throwable -> L4b
            r3.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4b
            r2.addLast(r3)     // Catch: java.lang.Throwable -> L4b
            java.util.HashSet r5 = r4.f681g     // Catch: java.lang.Throwable -> L4b
            r5.add(r0)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r1)
            r4.d()
            return
        L4b:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L4e:
            return
    }

    public final void d() {
            r3 = this;
            r3.i()
            java.lang.Object r0 = r3.f679e
            monitor-enter(r0)
            boolean r1 = r3.f689o     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = 1
            r3.f689o = r1     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r0 == 0) goto L20
            bb.i r1 = new bb.i
            r2 = 0
            r1.<init>(r3, r2)
            r0.d(r1)
            return
        L20:
            java.lang.Thread r0 = new java.lang.Thread
            bb.i r1 = new bb.i
            r2 = 1
            r1.<init>(r3, r2)
            r0.<init>(r1)
            r0.start()
            return
        L2f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final boolean e(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r2.f684j
            java.lang.String r3 = n(r3, r4)
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L13
            long r3 = r3.longValue()
            goto L15
        L13:
            r3 = 0
        L15:
            long r0 = java.lang.System.currentTimeMillis()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1f
            r3 = 1
            return r3
        L1f:
            r3 = 0
            return r3
    }

    public final boolean f(long r3, java.lang.String r5) {
            r2 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r2.f688n
            java.lang.Object r5 = r0.get(r5)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 != 0) goto Lb
            goto L15
        Lb:
            long r0 = r5.longValue()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L15
            r3 = 1
            return r3
        L15:
            r3 = 0
            return r3
    }

    public final void i() {
            r7 = this;
            java.lang.Object r0 = r7.f679e
            monitor-enter(r0)
            boolean r1 = r7.f690p     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L9
            monitor-exit(r0)
            return
        L9:
            long r1 = r7.f691q     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2e
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
            long r5 = r5 - r1
            r1 = 15000(0x3a98, double:7.411E-320)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L2e
            r1 = 0
            r7.f690p = r1     // Catch: java.lang.Throwable -> L2c
            r7.f691q = r3     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r7.f682h     // Catch: java.lang.Throwable -> L2c
            r1.clear()     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.ConcurrentHashMap r1 = r7.f688n     // Catch: java.lang.Throwable -> L2c
            r1.clear()     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r1 = move-exception
            goto L30
        L2e:
            monitor-exit(r0)
            return
        L30:
            monitor-exit(r0)
            throw r1
    }

    public final void j() {
            r5 = this;
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r0 == 0) goto L1d
            double r1 = java.lang.Math.random()
            r3 = 700(0x2bc, double:3.46E-321)
            double r3 = (double) r3
            double r1 = r1 * r3
            long r1 = (long) r1
            r3 = 800(0x320, double:3.953E-321)
            long r1 = r1 + r3
            bb.i r3 = new bb.i
            r4 = 2
            r3.<init>(r5, r4)
            java.lang.String r4 = "real_tail_resume"
            r0.f(r4, r1, r3)
        L1d:
            return
    }

    public final void k() {
            r6 = this;
        L0:
            r0 = 0
            bb.l r1 = r6.f675a     // Catch: java.lang.Throwable -> L2d
            android.content.SharedPreferences r1 = r1.f694a     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "enable"
            boolean r1 = r1.getBoolean(r2, r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto Le1
            r6.i()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r6.f679e     // Catch: java.lang.Throwable -> L2d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r6.f690p     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L33
            r6.f689o = r0     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r6.f679e
            monitor-enter(r1)
            boolean r2 = r6.f690p
            if (r2 != 0) goto L2b
            java.util.ArrayDeque r2 = r6.f680f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2b
            r6.f689o = r0
        L2b:
            monitor-exit(r1)
            return
        L2d:
            r1 = move-exception
            goto Lf9
        L30:
            r2 = move-exception
            goto Ldf
        L33:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r6.f679e     // Catch: java.lang.Throwable -> L2d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayDeque r2 = r6.f680f     // Catch: java.lang.Throwable -> Ldc
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Ldc
            if (r2 == 0) goto L41
            r2 = 0
            goto L5d
        L41:
            java.util.ArrayDeque r2 = r6.f680f     // Catch: java.lang.Throwable -> Ldc
            java.lang.Object r2 = r2.removeFirst()     // Catch: java.lang.Throwable -> Ldc
            r3 = r2
            sf.e r3 = (sf.e) r3     // Catch: java.lang.Throwable -> Ldc
            java.util.HashSet r4 = r6.f681g     // Catch: java.lang.Throwable -> Ldc
            java.lang.Object r5 = r3.f12418g     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ldc
            java.lang.Object r3 = r3.f12419h     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r3 = n(r5, r3)     // Catch: java.lang.Throwable -> Ldc
            r4.remove(r3)     // Catch: java.lang.Throwable -> Ldc
            sf.e r2 = (sf.e) r2     // Catch: java.lang.Throwable -> Ldc
        L5d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto Lc0
            java.lang.Object r1 = r2.f12418g     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r2 = r2.f12419h     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2d
            bb.l r3 = r6.f675a     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.e(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L0
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = r6.f682h     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.contains(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L0
            boolean r3 = r6.e(r1, r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L7f
            goto L0
        L7f:
            b9.f r3 = r6.f676b     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.c()     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L91
            r6.c(r1, r2)     // Catch: java.lang.Throwable -> L2d
            r0 = 800(0x320, double:3.953E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L0
            goto L0
        L91:
            boolean r3 = r6.a()     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L9c
            r6.c(r1, r2)     // Catch: java.lang.Throwable -> L2d
            goto L0
        L9c:
            r6.m(r1, r2, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r6.f679e     // Catch: java.lang.Throwable -> L2d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2d
            r6.f689o = r0     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r6.f679e
            monitor-enter(r1)
            boolean r2 = r6.f690p     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto Lb9
            java.util.ArrayDeque r2 = r6.f680f     // Catch: java.lang.Throwable -> Lb7
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lb7
            if (r2 == 0) goto Lb9
            r6.f689o = r0     // Catch: java.lang.Throwable -> Lb7
            goto Lb9
        Lb7:
            r0 = move-exception
            goto Lbb
        Lb9:
            monitor-exit(r1)
            return
        Lbb:
            monitor-exit(r1)
            throw r0
        Lbd:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        Lc0:
            java.lang.Object r1 = r6.f679e     // Catch: java.lang.Throwable -> L2d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2d
            r6.f689o = r0     // Catch: java.lang.Throwable -> Ld9
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r6.f679e
            monitor-enter(r1)
            boolean r2 = r6.f690p
            if (r2 != 0) goto Ld7
            java.util.ArrayDeque r2 = r6.f680f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Ld7
            r6.f689o = r0
        Ld7:
            monitor-exit(r1)
            return
        Ld9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        Ldc:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        Ldf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r2     // Catch: java.lang.Throwable -> L2d
        Le1:
            java.lang.Object r1 = r6.f679e
            monitor-enter(r1)
            boolean r2 = r6.f690p     // Catch: java.lang.Throwable -> Lf3
            if (r2 != 0) goto Lf5
            java.util.ArrayDeque r2 = r6.f680f     // Catch: java.lang.Throwable -> Lf3
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lf3
            if (r2 == 0) goto Lf5
            r6.f689o = r0     // Catch: java.lang.Throwable -> Lf3
            goto Lf5
        Lf3:
            r0 = move-exception
            goto Lf7
        Lf5:
            monitor-exit(r1)
            goto L114
        Lf7:
            monitor-exit(r1)
            throw r0
        Lf9:
            ab.b r2 = r6.f677c     // Catch: java.lang.Throwable -> L117
            java.lang.String r3 = "实名尾字队列异常"
            r2.invoke(r3, r1)     // Catch: java.lang.Throwable -> L117
            java.lang.Object r1 = r6.f679e
            monitor-enter(r1)
            boolean r2 = r6.f690p     // Catch: java.lang.Throwable -> L112
            if (r2 != 0) goto Lf5
            java.util.ArrayDeque r2 = r6.f680f     // Catch: java.lang.Throwable -> L112
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L112
            if (r2 == 0) goto Lf5
            r6.f689o = r0     // Catch: java.lang.Throwable -> L112
            goto Lf5
        L112:
            r0 = move-exception
            goto L115
        L114:
            return
        L115:
            monitor-exit(r1)
            throw r0
        L117:
            r1 = move-exception
            java.lang.Object r2 = r6.f679e
            monitor-enter(r2)
            boolean r3 = r6.f690p     // Catch: java.lang.Throwable -> L12a
            if (r3 != 0) goto L12c
            java.util.ArrayDeque r3 = r6.f680f     // Catch: java.lang.Throwable -> L12a
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L12a
            if (r3 == 0) goto L12c
            r6.f689o = r0     // Catch: java.lang.Throwable -> L12a
            goto L12c
        L12a:
            r0 = move-exception
            goto L12e
        L12c:
            monitor-exit(r2)
            throw r1
        L12e:
            monitor-exit(r2)
            throw r0
    }

    public final void l() {
            r3 = this;
            java.lang.Object r0 = r3.f679e
            monitor-enter(r0)
            r1 = 0
            r3.f690p = r1     // Catch: java.lang.Throwable -> Lc
            r1 = 0
            r3.f691q = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void m(java.lang.String r12, java.lang.String r13, boolean r14) {
            r11 = this;
            java.lang.String r0 = n(r12, r13)
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = r11.f682h
            r1.add(r13)
            java.lang.Object r1 = r11.f679e
            monitor-enter(r1)
            long r2 = r11.f692r     // Catch: java.lang.Throwable -> L56
            r4 = 1
            long r2 = r2 + r4
            r11.f692r = r2     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.ConcurrentHashMap r2 = r11.f688n     // Catch: java.lang.Throwable -> L56
            long r3 = r11.f692r     // Catch: java.lang.Throwable -> L56
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L56
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L56
            long r8 = r11.f692r     // Catch: java.lang.Throwable -> L56
            monitor-exit(r1)
            java.lang.Thread r0 = new java.lang.Thread
            bb.h r4 = new bb.h
            r10 = 1
            r5 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)
            r0.<init>(r4)
            r0.start()
            o8.j r12 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            bb.h r4 = new bb.h
            r10 = 0
            r5 = r7
            r7 = r6
            r6 = r5
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r10)
            if (r14 == 0) goto L4c
            if (r12 == 0) goto L48
            r12.e(r4)
            return
        L48:
            r4.run()
            return
        L4c:
            if (r12 == 0) goto L52
            r12.e(r4)
            return
        L52:
            r4.run()
            return
        L56:
            r0 = move-exception
            r12 = r0
            monitor-exit(r1)
            throw r12
    }
}
