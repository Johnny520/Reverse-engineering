package a1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f18i;

    public /* synthetic */ d(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f16g = r2
            r0.f17h = r1
            r0.f18i = r3
            r0.<init>()
            return
    }

    private final void a() {
            r13 = this;
            java.lang.Object r0 = r13.f17h
            ha.d r0 = (ha.d) r0
            java.lang.Object r1 = r13.f18i
            p8.d0 r2 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r2 == 0) goto L16d
            ha.c0 r1 = oh.h.z(r1, r2)
            if (r1 == 0) goto L16d
            java.lang.String r2 = r0.a()
            int r2 = r2.length()
            if (r2 != 0) goto L39
            java.lang.String r1 = r1.f5170c
            java.lang.String r1 = ha.d.b(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "跳过 "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "：评论内容为空"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.c(r1)
            return
        L39:
            java.lang.String r2 = r1.f5168a
            java.lang.Object r3 = r0.f5179d
            monitor-enter(r3)
            r0.d()     // Catch: java.lang.Throwable -> L5a
            java.util.LinkedHashSet r4 = r0.f5182g     // Catch: java.lang.Throwable -> L5a
            boolean r4 = r4.contains(r2)     // Catch: java.lang.Throwable -> L5a
            r5 = 0
            r7 = 1
            r8 = 0
            if (r4 != 0) goto L69
            java.util.LinkedHashMap r4 = r0.f5181f     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Throwable -> L5a
            ha.b r2 = (ha.b) r2     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L5d
            long r9 = r2.f5155a     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r0 = move-exception
            goto L16b
        L5d:
            r9 = r5
        L5e:
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5a
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto L67
            goto L69
        L67:
            r2 = r8
            goto L6a
        L69:
            r2 = r7
        L6a:
            monitor-exit(r3)
            if (r2 == 0) goto L6f
            goto L16d
        L6f:
            java.lang.String r2 = r0.f(r1)
            java.lang.String r3 = r1.f5168a
            if (r2 == 0) goto La2
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 + r6
            r0.g(r4, r3)
            java.lang.String r1 = r1.f5170c
            java.lang.String r1 = ha.d.b(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "跳过 "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "："
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.c(r1)
            return
        La2:
            java.lang.Object r2 = r0.f5179d
            monitor-enter(r2)
            r0.d()     // Catch: java.lang.Throwable -> Lbf
            java.util.LinkedHashSet r4 = r0.f5182g     // Catch: java.lang.Throwable -> Lbf
            boolean r4 = r4.contains(r3)     // Catch: java.lang.Throwable -> Lbf
            if (r4 == 0) goto Lb2
        Lb0:
            r3 = r8
            goto Ldb
        Lb2:
            java.util.LinkedHashMap r4 = r0.f5181f     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> Lbf
            ha.b r4 = (ha.b) r4     // Catch: java.lang.Throwable -> Lbf
            if (r4 == 0) goto Lc2
            long r5 = r4.f5155a     // Catch: java.lang.Throwable -> Lbf
            goto Lc2
        Lbf:
            r0 = move-exception
            goto L169
        Lc2:
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lbf
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 <= 0) goto Lcb
            goto Lb0
        Lcb:
            java.util.LinkedHashMap r4 = r0.f5181f     // Catch: java.lang.Throwable -> Lbf
            ha.b r5 = new ha.b     // Catch: java.lang.Throwable -> Lbf
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.<init>(r9)     // Catch: java.lang.Throwable -> Lbf
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> Lbf
            r3 = r7
        Ldb:
            monitor-exit(r2)
            if (r3 != 0) goto Le0
            goto L16d
        Le0:
            android.content.SharedPreferences r2 = r0.f5177b
            java.lang.String r3 = "comment_delay_mode"
            int r3 = r2.getInt(r3, r7)
            if (r3 != 0) goto Lf8
            java.lang.String r3 = "comment_fixed_delay_seconds"
            r4 = 300(0x12c, float:4.2E-43)
            int r2 = r2.getInt(r3, r4)
            if (r2 >= 0) goto Lf5
            goto Lf6
        Lf5:
            r8 = r2
        Lf6:
            long r2 = (long) r8
            goto L122
        Lf8:
            java.lang.String r3 = "comment_random_min_seconds"
            r4 = 60
            int r3 = r2.getInt(r3, r4)
            if (r3 >= 0) goto L103
            goto L104
        L103:
            r8 = r3
        L104:
            long r3 = (long) r8
            java.lang.String r5 = "comment_random_max_seconds"
            r6 = 3600(0xe10, float:5.045E-42)
            int r2 = r2.getInt(r5, r6)
            long r5 = (long) r2
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L113
            r5 = r3
        L113:
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L119
            r2 = r3
            goto L122
        L119:
            r7 = 1
            long r5 = r5 + r7
            jg.a r2 = jg.d.f6902g
            long r2 = r2.e(r3, r5)
        L122:
            java.lang.String r4 = r1.f5170c
            java.lang.String r4 = ha.d.b(r4)
            ha.d0 r5 = r1.f5172e
            java.lang.String r5 = r5.f5192g
            java.lang.String r6 = "已捕捉 "
            java.lang.String r7 = " 的"
            java.lang.String r8 = "朋友圈，"
            java.lang.StringBuilder r4 = bc.e.p(r6, r4, r7, r5, r8)
            r4.append(r2)
            java.lang.String r5 = "秒后评论"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.c(r4)
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r0.f5178c
            a1.d r5 = new a1.d
            r6 = 12
            r5.<init>(r0, r6, r1)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledFuture r2 = r4.schedule(r5, r2, r6)
            java.util.concurrent.ConcurrentHashMap r3 = r0.f5183h
            java.lang.String r4 = r1.f5168a
            r3.put(r4, r2)
            boolean r3 = r2.isDone()
            if (r3 == 0) goto L16d
            java.util.concurrent.ConcurrentHashMap r0 = r0.f5183h
            java.lang.String r1 = r1.f5168a
            r0.remove(r1, r2)
            return
        L169:
            monitor-exit(r2)
            throw r0
        L16b:
            monitor-exit(r3)
            throw r0
        L16d:
            return
    }

    private final void b() {
            r13 = this;
            java.lang.Object r0 = r13.f17h
            ha.k r0 = (ha.k) r0
            java.lang.Object r1 = r13.f18i
            p8.d0 r2 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r2 == 0) goto L146
            ha.c0 r1 = oh.h.z(r1, r2)
            if (r1 == 0) goto L146
            java.lang.String r2 = r1.f5168a
            java.lang.Object r3 = r0.f5249d
            monitor-enter(r3)
            r0.c()     // Catch: java.lang.Throwable -> L33
            java.util.LinkedHashSet r4 = r0.f5252g     // Catch: java.lang.Throwable -> L33
            boolean r4 = r4.contains(r2)     // Catch: java.lang.Throwable -> L33
            r5 = 0
            r7 = 1
            r8 = 0
            if (r4 != 0) goto L42
            java.util.LinkedHashMap r4 = r0.f5251f     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Throwable -> L33
            ha.j r2 = (ha.j) r2     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L36
            long r9 = r2.f5228a     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r0 = move-exception
            goto L144
        L36:
            r9 = r5
        L37:
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L33
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 <= 0) goto L40
            goto L42
        L40:
            r2 = r8
            goto L43
        L42:
            r2 = r7
        L43:
            monitor-exit(r3)
            if (r2 == 0) goto L48
            goto L146
        L48:
            java.lang.String r2 = r0.e(r1)
            java.lang.String r3 = r1.f5168a
            if (r2 == 0) goto L7b
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 + r6
            r0.f(r4, r3)
            java.lang.String r1 = r1.f5170c
            java.lang.String r1 = ha.k.a(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "跳过 "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "："
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.b(r1)
            return
        L7b:
            java.lang.Object r2 = r0.f5249d
            monitor-enter(r2)
            r0.c()     // Catch: java.lang.Throwable -> L98
            java.util.LinkedHashSet r4 = r0.f5252g     // Catch: java.lang.Throwable -> L98
            boolean r4 = r4.contains(r3)     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L8b
        L89:
            r3 = r8
            goto Lb4
        L8b:
            java.util.LinkedHashMap r4 = r0.f5251f     // Catch: java.lang.Throwable -> L98
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L98
            ha.j r4 = (ha.j) r4     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L9b
            long r5 = r4.f5228a     // Catch: java.lang.Throwable -> L98
            goto L9b
        L98:
            r0 = move-exception
            goto L142
        L9b:
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L98
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 <= 0) goto La4
            goto L89
        La4:
            java.util.LinkedHashMap r4 = r0.f5251f     // Catch: java.lang.Throwable -> L98
            ha.j r5 = new ha.j     // Catch: java.lang.Throwable -> L98
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L98
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> L98
            r3 = r7
        Lb4:
            monitor-exit(r2)
            if (r3 != 0) goto Lb9
            goto L146
        Lb9:
            android.content.SharedPreferences r2 = r0.f5247b
            java.lang.String r3 = "delay_mode"
            int r3 = r2.getInt(r3, r7)
            if (r3 != 0) goto Ld1
            java.lang.String r3 = "fixed_delay_seconds"
            r4 = 300(0x12c, float:4.2E-43)
            int r2 = r2.getInt(r3, r4)
            if (r2 >= 0) goto Lce
            goto Lcf
        Lce:
            r8 = r2
        Lcf:
            long r2 = (long) r8
            goto Lfb
        Ld1:
            java.lang.String r3 = "random_min_seconds"
            r4 = 60
            int r3 = r2.getInt(r3, r4)
            if (r3 >= 0) goto Ldc
            goto Ldd
        Ldc:
            r8 = r3
        Ldd:
            long r3 = (long) r8
            java.lang.String r5 = "random_max_seconds"
            r6 = 3600(0xe10, float:5.045E-42)
            int r2 = r2.getInt(r5, r6)
            long r5 = (long) r2
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lec
            r5 = r3
        Lec:
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto Lf2
            r2 = r3
            goto Lfb
        Lf2:
            r7 = 1
            long r5 = r5 + r7
            jg.a r2 = jg.d.f6902g
            long r2 = r2.e(r3, r5)
        Lfb:
            java.lang.String r4 = r1.f5170c
            java.lang.String r4 = ha.k.a(r4)
            ha.d0 r5 = r1.f5172e
            java.lang.String r5 = r5.f5192g
            java.lang.String r6 = "已捕捉 "
            java.lang.String r7 = " 的"
            java.lang.String r8 = "朋友圈，"
            java.lang.StringBuilder r4 = bc.e.p(r6, r4, r7, r5, r8)
            r4.append(r2)
            java.lang.String r5 = "秒后点赞"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.b(r4)
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r0.f5248c
            a1.d r5 = new a1.d
            r6 = 14
            r5.<init>(r0, r6, r1)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledFuture r2 = r4.schedule(r5, r2, r6)
            java.util.concurrent.ConcurrentHashMap r3 = r0.f5253h
            java.lang.String r4 = r1.f5168a
            r3.put(r4, r2)
            boolean r3 = r2.isDone()
            if (r3 == 0) goto L146
            java.util.concurrent.ConcurrentHashMap r0 = r0.f5253h
            java.lang.String r1 = r1.f5168a
            r0.remove(r1, r2)
            return
        L142:
            monitor-exit(r2)
            throw r0
        L144:
            monitor-exit(r3)
            throw r0
        L146:
            return
    }

    private final void c() {
            r12 = this;
            java.lang.Object r0 = r12.f17h
            ha.k r0 = (ha.k) r0
            java.lang.Object r1 = r12.f18i
            ha.c0 r1 = (ha.c0) r1
            java.lang.String r2 = "点赞失败 "
            java.lang.String r3 = "点赞成功 "
            java.lang.String r4 = "取消 "
            r5 = 600000(0x927c0, double:2.964394E-318)
            java.lang.String r7 = r0.e(r1)     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L4b
            java.lang.String r2 = r1.f5168a     // Catch: java.lang.Throwable -> L49
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49
            r10 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r8 + r10
            r0.f(r8, r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r1.f5170c     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = ha.k.a(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L49
            r3.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "："
            r3.append(r2)     // Catch: java.lang.Throwable -> L49
            r3.append(r7)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L49
            r0.b(r2)     // Catch: java.lang.Throwable -> L49
        L41:
            java.util.concurrent.ConcurrentHashMap r0 = r0.f5253h
            java.lang.String r1 = r1.f5168a
        L45:
            r0.remove(r1)
            return
        L49:
            r2 = move-exception
            goto Lc0
        L4b:
            p8.d0 r4 = h.Hchat.hooks.api.core.WeChatApis.snsApi()     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L97
            java.lang.Object r7 = r1.f5174g     // Catch: java.lang.Throwable -> L49
            boolean r4 = r4.k(r7)     // Catch: java.lang.Throwable -> L49
            r7 = 1
            if (r4 != r7) goto L97
            java.lang.String r2 = r1.f5170c     // Catch: java.lang.Throwable -> L49
            r0.d(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r1.f5168a     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = r0.f5249d     // Catch: java.lang.Throwable -> L49
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L49
            java.util.LinkedHashMap r7 = r0.f5251f     // Catch: java.lang.Throwable -> L94
            r7.remove(r2)     // Catch: java.lang.Throwable -> L94
            java.util.LinkedHashSet r7 = r0.f5252g     // Catch: java.lang.Throwable -> L94
            r7.add(r2)     // Catch: java.lang.Throwable -> L94
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L49
            r0.g()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r1.f5170c     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = ha.k.a(r2)     // Catch: java.lang.Throwable -> L49
            ha.d0 r4 = r1.f5172e     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.f5192g     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L49
            r7.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = " · "
            r7.append(r2)     // Catch: java.lang.Throwable -> L49
            r7.append(r4)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L49
            r0.b(r2)     // Catch: java.lang.Throwable -> L49
            goto Lbb
        L94:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L49
            throw r2     // Catch: java.lang.Throwable -> L49
        L97:
            java.lang.String r3 = r1.f5168a     // Catch: java.lang.Throwable -> L49
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L49
            long r7 = r7 + r5
            r0.f(r7, r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = r1.f5170c     // Catch: java.lang.Throwable -> L49
            java.lang.String r3 = ha.k.a(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L49
            r4.append(r3)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "，稍后允许重试"
            r4.append(r2)     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L49
            r0.b(r2)     // Catch: java.lang.Throwable -> L49
        Lbb:
            java.util.concurrent.ConcurrentHashMap r0 = r0.f5253h
            java.lang.String r1 = r1.f5168a
            goto L45
        Lc0:
            java.lang.String r3 = r1.f5168a     // Catch: java.lang.Throwable -> Ld3
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld3
            long r7 = r7 + r5
            r0.f(r7, r3)     // Catch: java.lang.Throwable -> Ld3
            ab.b r3 = r0.f5246a     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r4 = "执行朋友圈点赞失败"
            r3.invoke(r4, r2)     // Catch: java.lang.Throwable -> Ld3
            goto L41
        Ld3:
            r2 = move-exception
            java.util.concurrent.ConcurrentHashMap r0 = r0.f5253h
            java.lang.String r1 = r1.f5168a
            r0.remove(r1)
            throw r2
    }

    private final void d() {
            r9 = this;
            java.lang.Object r0 = r9.f17h
            ha.b0 r0 = (ha.b0) r0
            java.lang.Object r1 = r9.f18i
            p8.d0 r2 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r2 == 0) goto L154
            ha.c0 r1 = oh.h.z(r1, r2)
            if (r1 == 0) goto L154
            android.content.SharedPreferences r2 = r0.f5158c
            java.lang.String r3 = "enabled_at_seconds"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            long r6 = r1.f5171d
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 <= 0) goto L154
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L154
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2c
            goto L154
        L2c:
            android.content.SharedPreferences r2 = r0.f5158c
            java.lang.String r3 = "targets"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            java.util.Set r2 = r9.e0.S(r2)
            java.lang.String r3 = r1.f5170c
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L44
            goto L154
        L44:
            java.lang.String r2 = r1.f5168a
            java.util.LinkedHashSet r3 = r0.f5161f
            monitor-enter(r3)
            java.util.LinkedHashSet r4 = r0.f5161f     // Catch: java.lang.Throwable -> L151
            boolean r2 = r4.add(r2)     // Catch: java.lang.Throwable -> L151
            if (r2 != 0) goto L53
            monitor-exit(r3)
            return
        L53:
            java.util.LinkedHashSet r2 = r0.f5161f     // Catch: java.lang.Throwable -> L151
            java.util.List r2 = tf.m.P1(r2)     // Catch: java.lang.Throwable -> L151
            monitor-exit(r3)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L63:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r2.next()
            r3.put(r4)
            goto L63
        L71:
            android.content.SharedPreferences r2 = r0.f5158c
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "notified_ids"
            java.lang.String r3 = r3.toString()
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r3)
            r2.commit()
            java.lang.String r2 = r1.f5170c
            g8.i r3 = wb.en.c()
            if (r3 == 0) goto La2
            h.Hchat.hooks.api.model.WeChatContact r3 = r3.n(r2)
            if (r3 == 0) goto La2
            java.lang.String r3 = r3.displayName()
            if (r3 == 0) goto La2
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L9f
            r3 = r2
        L9f:
            if (r3 == 0) goto La2
            r2 = r3
        La2:
            android.content.SharedPreferences r3 = r0.f5158c
            java.lang.String r4 = "title_template"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            if (r3 != 0) goto Lb0
            java.lang.String r3 = ""
        Lb0:
            java.lang.String r3 = ha.b0.a(r1, r3, r2)
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto Lbc
            java.lang.String r3 = "📣 指定好友发布朋友圈"
        Lbc:
            android.content.SharedPreferences r4 = r0.f5158c
            java.lang.String r5 = "body_template"
            java.lang.String r6 = ""
            java.lang.String r4 = r4.getString(r5, r6)
            if (r4 != 0) goto Lca
            java.lang.String r4 = ""
        Lca:
            java.lang.String r4 = ha.b0.a(r1, r4, r2)
            boolean r5 = og.m.t0(r4)
            if (r5 == 0) goto Lef
            ha.d0 r4 = r1.f5172e
            java.lang.String r4 = r4.f5192g
            java.lang.String r5 = " 发布了"
            java.lang.String r6 = "朋友圈"
            java.lang.String r4 = wb.en.i(r2, r5, r4, r6)
            java.lang.String r5 = r1.f5173f
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto Le9
            goto Lef
        Le9:
            java.lang.String r6 = "："
            java.lang.String r4 = wb.en.h(r4, r6, r5)
        Lef:
            android.content.SharedPreferences r5 = r0.f5158c
            java.lang.String r6 = "system_notification"
            r7 = 1
            boolean r5 = r5.getBoolean(r6, r7)
            if (r5 == 0) goto L114
            r0.c(r1, r3, r4)     // Catch: java.lang.Throwable -> L100
            sf.n r3 = sf.n.f12433a     // Catch: java.lang.Throwable -> L100
            goto L107
        L100:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L107:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L114
            ab.b r4 = r0.f5156a
            java.lang.String r5 = "发送朋友圈发布通知失败"
            r4.invoke(r5, r3)
        L114:
            android.content.SharedPreferences r3 = r0.f5158c
            java.lang.String r4 = "toast"
            boolean r3 = r3.getBoolean(r4, r7)
            if (r3 == 0) goto L154
            android.content.SharedPreferences r3 = r0.f5158c
            java.lang.String r4 = "toast_template"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            if (r3 != 0) goto L12c
            java.lang.String r3 = ""
        L12c:
            java.lang.String r3 = ha.b0.a(r1, r3, r2)
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L144
            ha.d0 r1 = r1.f5172e
            java.lang.String r1 = r1.f5192g
            java.lang.String r3 = "📣 "
            java.lang.String r4 = " 发布了"
            java.lang.String r5 = "朋友圈"
            java.lang.String r3 = bc.e.k(r3, r2, r4, r1, r5)
        L144:
            android.os.Handler r1 = r0.f5159d
            a1.d r2 = new a1.d
            r4 = 16
            r2.<init>(r0, r4, r3)
            r1.post(r2)
            goto L154
        L151:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L154:
            return
    }

    private final void e() {
            r12 = this;
            java.lang.Object r0 = r12.f17h
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r1 = r12.f18i
            int[] r1 = (int[]) r1
            int r2 = r0.getWidth()
            int r3 = r0.getTotalPaddingLeft()
            int r2 = r2 - r3
            int r3 = r0.getTotalPaddingRight()
            int r2 = r2 - r3
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L1e
            r2 = r3
        L1e:
            android.text.TextPaint r4 = r0.getPaint()
            java.lang.CharSequence r5 = r0.getText()
            java.lang.String r5 = r5.toString()
            float r4 = r4.measureText(r5)
            float r2 = r9.e0.q(r4, r3, r2)
            int r3 = r0.getTotalPaddingLeft()
            float r5 = (float) r3
            android.text.TextPaint r3 = r0.getPaint()
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            float r7 = r5 + r2
            r2 = 0
            r9 = r1[r2]
            r2 = 1
            r10 = r1[r2]
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            r6 = 0
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.setShader(r4)
            r0.invalidate()
            return
    }

    private final void f() {
            r9 = this;
            java.lang.Object r0 = r9.f17h
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            java.lang.Object r1 = r9.f18i
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            k9.r r2 = k9.r.f7530a
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            boolean r3 = r2 instanceof android.widget.FrameLayout.LayoutParams
            if (r3 == 0) goto L16
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
        L14:
            r4 = r2
            goto L18
        L16:
            r2 = 0
            goto L14
        L18:
            if (r4 == 0) goto L3b
            android.content.Context r3 = r0.getContext()
            r3.getClass()
            int r5 = r1.getWidth()
            int r6 = r1.getHeight()
            int r7 = r0.getWidth()
            int r8 = r0.getHeight()
            boolean r1 = k9.r.b(r3, r4, r5, r6, r7, r8)
            if (r1 != 0) goto L38
            goto L3b
        L38:
            r0.setLayoutParams(r4)
        L3b:
            r1 = 0
            r0.setVisibility(r1)
            r0.bringToFront()
            return
    }

    private final void g() {
            r9 = this;
            java.lang.Object r0 = r9.f17h
            ob.n r0 = (ob.n) r0
            java.lang.Object r1 = r9.f18i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "文字转语音播放失败"
            java.lang.String r3 = ".part"
            r4 = 0
            ob.k r4 = r0.j(r4)
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.f9743g
            java.io.File r6 = r0.c(r4)
            r7 = 0
            r0.k(r1, r4, r6)     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r5.get()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L4c
            boolean r1 = r0.d()     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L28
            goto L4c
        L28:
            r7 = 1
            android.os.Handler r1 = r0.f9740d     // Catch: java.lang.Throwable -> L4a
            a1.d r4 = new a1.d     // Catch: java.lang.Throwable -> L4a
            r8 = 26
            r4.<init>(r0, r8, r6)     // Catch: java.lang.Throwable -> L4a
            r1.post(r4)     // Catch: java.lang.Throwable -> L4a
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.getParentFile()
            java.lang.String r2 = r6.getName()
            java.lang.String r2 = bc.e.i(r2, r3)
            r0.<init>(r1, r2)
        L46:
            r0.delete()
            return
        L4a:
            r1 = move-exception
            goto L61
        L4c:
            r6.delete()
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.getParentFile()
            java.lang.String r2 = r6.getName()
            java.lang.String r2 = bc.e.i(r2, r3)
            r0.<init>(r1, r2)
            goto L46
        L61:
            boolean r4 = r5.get()     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L76
            ia.t r4 = r0.f9738b     // Catch: java.lang.Throwable -> L74
            r4.invoke(r2, r1)     // Catch: java.lang.Throwable -> L74
            java.lang.String r1 = ob.n.m(r2, r1)     // Catch: java.lang.Throwable -> L74
            r0.l(r1)     // Catch: java.lang.Throwable -> L74
            goto L76
        L74:
            r0 = move-exception
            goto L8d
        L76:
            if (r7 != 0) goto L7b
            r6.delete()
        L7b:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.getParentFile()
            java.lang.String r2 = r6.getName()
            java.lang.String r2 = bc.e.i(r2, r3)
            r0.<init>(r1, r2)
            goto L46
        L8d:
            if (r7 != 0) goto L92
            r6.delete()
        L92:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.getParentFile()
            java.lang.String r4 = r6.getName()
            java.lang.String r3 = bc.e.i(r4, r3)
            r1.<init>(r2, r3)
            r1.delete()
            throw r0
    }

    private final void h() {
            r7 = this;
            java.lang.Object r0 = r7.f17h
            ob.n r0 = (ob.n) r0
            java.lang.Object r1 = r7.f18i
            java.io.File r1 = (java.io.File) r1
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f9743g
            boolean r2 = r2.get()
            if (r2 == 0) goto L87
            boolean r2 = r0.d()
            if (r2 == 0) goto L87
            boolean r2 = r1.isFile()
            if (r2 != 0) goto L1d
            goto L87
        L1d:
            r0.g()
            long r2 = r0.f9750n
            r4 = 1
            long r2 = r2 + r4
            r0.f9750n = r2
            android.media.MediaPlayer r4 = new android.media.MediaPlayer
            r4.<init>()
            r0.f9748l = r4
            r0.f9749m = r1
            android.media.AudioAttributes$Builder r5 = new android.media.AudioAttributes$Builder     // Catch: java.lang.Throwable -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L6a
            r6 = 1
            android.media.AudioAttributes$Builder r5 = r5.setContentType(r6)     // Catch: java.lang.Throwable -> L6a
            android.media.AudioAttributes$Builder r5 = r5.setUsage(r6)     // Catch: java.lang.Throwable -> L6a
            android.media.AudioAttributes r5 = r5.build()     // Catch: java.lang.Throwable -> L6a
            r4.setAudioAttributes(r5)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L6a
            r4.setDataSource(r1)     // Catch: java.lang.Throwable -> L6a
            ob.g r1 = new ob.g     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6a
            r4.setOnPreparedListener(r1)     // Catch: java.lang.Throwable -> L6a
            ob.h r1 = new ob.h     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6a
            r4.setOnCompletionListener(r1)     // Catch: java.lang.Throwable -> L6a
            ob.i r1 = new ob.i     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6a
            r4.setOnErrorListener(r1)     // Catch: java.lang.Throwable -> L6a
            r4.prepareAsync()     // Catch: java.lang.Throwable -> L6a
            sf.n r1 = sf.n.f12433a     // Catch: java.lang.Throwable -> L6a
            goto L71
        L6a:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L71:
            java.lang.Throwable r1 = sf.g.b(r1)
            if (r1 == 0) goto L86
            ia.t r2 = r0.f9738b
            java.lang.String r3 = "启动文字转语音播放器失败"
            r2.invoke(r3, r1)
            java.lang.String r1 = "语音播放失败"
            r0.l(r1)
            r0.g()
        L86:
            return
        L87:
            r1.delete()
            return
    }

    private final void i() {
            r4 = this;
            java.lang.Object r0 = r4.f17h
            q8.r r0 = (q8.r) r0
            java.lang.Object r1 = r4.f18i
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r2 = r0.f10735a     // Catch: java.lang.Throwable -> L13
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r2, r1, r3)     // Catch: java.lang.Throwable -> L13
            r1.show()     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Toast失败: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.b(r1)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r18 = this;
            r1 = r18
            int r0 = r1.f16g
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            switch(r0) {
                case 0: goto L832;
                case 1: goto L80e;
                case 2: goto L7f9;
                case 3: goto L678;
                case 4: goto L609;
                case 5: goto L5fd;
                case 6: goto L477;
                case 7: goto L46b;
                case 8: goto L45f;
                case 9: goto L453;
                case 10: goto L447;
                case 11: goto L443;
                case 12: goto L331;
                case 13: goto L32d;
                case 14: goto L329;
                case 15: goto L325;
                case 16: goto L313;
                case 17: goto L295;
                case 18: goto L27d;
                case 19: goto L123;
                case 20: goto L9b;
                case 21: goto L63;
                case 22: goto L5f;
                case 23: goto L5b;
                case 24: goto L47;
                case 25: goto L43;
                case 26: goto L3f;
                case 27: goto L3b;
                case 28: goto L20;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r1.f17h
            ra.h r0 = (ra.h) r0
            java.lang.Object r2 = r1.f18i
            android.view.View r2 = (android.view.View) r2
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            ra.d r4 = new ra.d
            r4.<init>(r0, r2)
            r3.addOnGlobalLayoutListener(r4)
            return
        L20:
            java.lang.Object r0 = r1.f17h
            r8.d r0 = (r8.d) r0
            java.lang.Object r2 = r1.f18i
            java.lang.String r2 = (java.lang.String) r2
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.f11613g
            r3.set(r7)
            android.os.Handler r3 = r8.e.f11615a
            r8.c r3 = r0.f11608b
            boolean r3 = r8.e.b(r3)
            if (r3 == 0) goto L3a
            r8.e.d(r2, r0)
        L3a:
            return
        L3b:
            r1.i()
            return
        L3f:
            r1.h()
            return
        L43:
            r1.g()
            return
        L47:
            java.lang.Object r0 = r1.f17h
            n8.c r0 = (n8.c) r0
            java.lang.Object r2 = r1.f18i
            java.util.Map r0 = r0.f9067d
            java.lang.Object r0 = r0.remove(r2)
            fg.l r0 = (fg.l) r0
            if (r0 == 0) goto L5a
            r0.invoke(r5)
        L5a:
            return
        L5b:
            r1.f()
            return
        L5f:
            r1.e()
            return
        L63:
            java.lang.Object r0 = r1.f17h
            b.e r0 = (b.e) r0
            java.lang.Object r2 = r0.f333i
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Object r3 = r1.f18i
            fg.p r3 = (fg.p) r3
            java.lang.Object r0 = r0.f332h     // Catch: java.lang.Throwable -> L78
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r2, r0, r4)     // Catch: java.lang.Throwable -> L78
            goto L7f
        L78:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L7f:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L9a
            java.lang.String r2 = r2.toGenericString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "退出多选状态失败: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.invoke(r2, r0)
        L9a:
            return
        L9b:
            java.lang.Object r0 = r1.f17h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r2 = r1.f18i
            jb.e r2 = (jb.e) r2
            java.util.Iterator r0 = r0.iterator()
            r3 = r7
            r4 = r3
        La9:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L112
            java.lang.Object r6 = r0.next()
            int r8 = r3 + 1
            if (r3 < 0) goto L10e
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            r2.getClass()
            java.lang.String r3 = jb.e.d(r6)
            if (r3 == 0) goto L10c
            r8.g r6 = r2.f6858a
            android.content.Context r6 = r6.f11620a
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "finder_image_"
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = "_"
            r11.append(r9)
            r11.append(r8)
            java.lang.String r9 = ".png"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            sf.i r10 = zb.b.f22655a
            boolean r10 = og.m.t0(r3)
            if (r10 == 0) goto Lef
            r3 = r5
            goto L108
        Lef:
            java.io.File r10 = new java.io.File
            java.lang.String r11 = "Finder"
            java.io.File r6 = zb.b.i(r6, r11)
            java.lang.String r11 = "finder_image"
            java.lang.String r12 = zb.b.h(r3)
            java.lang.String r9 = zb.b.a(r9, r11, r12)
            r10.<init>(r6, r9)
            java.io.File r3 = zb.b.g(r10, r3, r7)
        L108:
            if (r3 == 0) goto L10c
            int r4 = r4 + 1
        L10c:
            r3 = r8
            goto La9
        L10e:
            a.a.Q0()
            throw r5
        L112:
            if (r4 <= 0) goto L11d
            java.lang.String r0 = "已下载 "
            java.lang.String r3 = " 张图片到 Hchat/Finder"
            java.lang.String r0 = eh.a.m(r4, r0, r3)
            goto L11f
        L11d:
            java.lang.String r0 = "图片下载失败"
        L11f:
            r2.k(r0)
            return
        L123:
            java.lang.Object r0 = r1.f17h
            r2 = r0
            jb.e r2 = (jb.e) r2
            java.lang.Object r0 = r1.f18i
            r3 = r0
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.lang.String r4 = ".mp4"
            java.lang.String r6 = "finder_video_"
            java.lang.String r0 = "decodeKey"
            java.lang.String r8 = "decode_key"
            java.lang.String[] r0 = new java.lang.String[]{r0, r8}
            r2.getClass()
            java.lang.String r8 = jb.e.h(r3, r0)
            r8.g r9 = r2.f6858a
            java.lang.String r0 = "spec"
            org.json.JSONArray r0 = r3.optJSONArray(r0)
            if (r0 == 0) goto L151
            int r10 = r0.length()
            r11 = r7
        L14f:
            if (r11 < r10) goto L153
        L151:
            r12 = r5
            goto L190
        L153:
            org.json.JSONObject r12 = r0.optJSONObject(r11)
            if (r12 == 0) goto L18d
            java.lang.String r13 = "codingFormat"
            java.lang.String r14 = "coding_format"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14}
            java.lang.String r13 = jb.e.h(r12, r13)
            java.lang.String r14 = "h265"
            boolean r14 = r13.equalsIgnoreCase(r14)
            if (r14 != 0) goto L176
            java.lang.String r14 = "hevc"
            boolean r13 = r13.equalsIgnoreCase(r14)
            if (r13 != 0) goto L176
            goto L18d
        L176:
            java.lang.String r13 = "fileFormat"
            java.lang.String r14 = "file_format"
            java.lang.String[] r13 = new java.lang.String[]{r13, r14}
            java.lang.String r12 = jb.e.h(r12, r13)
            boolean r13 = og.m.t0(r12)
            if (r13 != 0) goto L189
            goto L18a
        L189:
            r12 = r5
        L18a:
            if (r12 == 0) goto L18d
            goto L190
        L18d:
            int r11 = r11 + 1
            goto L14f
        L190:
            if (r12 == 0) goto L1ea
            java.lang.String r0 = "url"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r0 = jb.e.h(r3, r0)
            java.lang.String r10 = "url_token"
            java.lang.String r11 = "urlToken"
            java.lang.String[] r10 = new java.lang.String[]{r10, r11}
            java.lang.String r10 = jb.e.h(r3, r10)
            java.lang.String r0 = r0.concat(r10)
            boolean r10 = og.m.t0(r0)
            if (r10 != 0) goto L1b3
            goto L1b4
        L1b3:
            r0 = r5
        L1b4:
            if (r0 == 0) goto L1ea
            okhttp3.HttpUrl$Companion r10 = okhttp3.HttpUrl.Companion     // Catch: java.lang.Throwable -> L1d7
            okhttp3.HttpUrl r0 = r10.parse(r0)     // Catch: java.lang.Throwable -> L1d7
            if (r0 == 0) goto L1d9
            okhttp3.HttpUrl$Builder r0 = r0.newBuilder()     // Catch: java.lang.Throwable -> L1d7
            if (r0 == 0) goto L1d9
            java.lang.String r10 = "X-snsvideoflag"
            okhttp3.HttpUrl$Builder r0 = r0.setQueryParameter(r10, r12)     // Catch: java.lang.Throwable -> L1d7
            if (r0 == 0) goto L1d9
            okhttp3.HttpUrl r0 = r0.build()     // Catch: java.lang.Throwable -> L1d7
            if (r0 == 0) goto L1d9
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d7
            goto L1e1
        L1d7:
            r0 = move-exception
            goto L1db
        L1d9:
            r0 = r5
            goto L1e1
        L1db:
            sf.f r10 = new sf.f
            r10.<init>(r0)
            r0 = r10
        L1e1:
            boolean r10 = r0 instanceof sf.f
            if (r10 == 0) goto L1e7
            r0 = r5
        L1e7:
            java.lang.String r0 = (java.lang.String) r0
            goto L1eb
        L1ea:
            r0 = r5
        L1eb:
            java.lang.String r10 = jb.e.i(r3)
            if (r0 == 0) goto L218
            boolean r11 = og.m.t0(r0)
            if (r11 == 0) goto L1f8
            goto L218
        L1f8:
            boolean r11 = og.m.t0(r8)
            if (r11 != 0) goto L218
            android.content.Context r3 = r9.f11620a
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            r5.append(r9)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.io.File r0 = zb.b.d(r3, r0, r8, r4)
            goto L272
        L218:
            boolean r0 = og.m.t0(r10)
            if (r0 != 0) goto L255
            android.content.Context r0 = r9.f11620a
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            r3.append(r8)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            sf.i r4 = zb.b.f22655a
            boolean r4 = og.m.t0(r10)
            if (r4 == 0) goto L23c
            goto L253
        L23c:
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "Finder"
            java.io.File r0 = zb.b.i(r0, r5)
            java.lang.String r5 = "finder_video"
            java.lang.String r6 = "mp4"
            java.lang.String r3 = zb.b.a(r3, r5, r6)
            r4.<init>(r0, r3)
            java.io.File r5 = zb.b.g(r4, r10, r7)
        L253:
            r0 = r5
            goto L272
        L255:
            android.content.Context r0 = r9.f11620a
            java.lang.String r3 = jb.e.d(r3)
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            r5.append(r9)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.io.File r0 = zb.b.d(r0, r3, r8, r4)
        L272:
            if (r0 == 0) goto L277
            java.lang.String r0 = "已下载视频到 Hchat/Finder"
            goto L279
        L277:
            java.lang.String r0 = "视频下载失败"
        L279:
            r2.k(r0)
            return
        L27d:
            java.lang.Object r0 = r1.f17h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f18i
            hb.e0 r2 = (hb.e0) r2
            boolean r3 = r0.isFinishing()
            if (r3 != 0) goto L294
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L294
            r2.invoke()
        L294:
            return
        L295:
            java.lang.Object r0 = r1.f17h
            hb.k r0 = (hb.k) r0
            java.lang.Object r2 = r1.f18i
            java.lang.String r2 = (java.lang.String) r2
            hb.i r3 = r0.f5424g
            if (r3 == 0) goto L2a4
            java.lang.String r4 = r3.f5394a
            goto L2a5
        L2a4:
            r4 = r5
        L2a5:
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L2de
            b9.c r2 = r0.f5426i
            if (r2 == 0) goto L2b4
            android.os.Handler r4 = r0.f5420c
            r4.removeCallbacks(r2)
        L2b4:
            r0.f5426i = r5
            java.lang.Object r2 = r0.f5425h
            if (r2 == 0) goto L2c1
            java.lang.String r4 = "cancel"
            java.lang.Object[] r6 = new java.lang.Object[r7]
            h.Hchat.utils.KavaReflector.invokeMethod(r2, r4, r6)
        L2c1:
            r0.f5425h = r5
            r0.f5424g = r5
            fg.q r2 = r3.f5397d
            if (r2 == 0) goto L2da
            int r4 = r3.f5399f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r3 = r3.f5396c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r2.b(r4, r3, r5)
        L2da:
            r0.n()
            goto L312
        L2de:
            java.util.ArrayDeque r0 = r0.f5422e
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L2e7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L312
            java.lang.Object r3 = r0.next()
            hb.i r3 = (hb.i) r3
            java.lang.String r4 = r3.f5394a
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L2fc
            goto L2e7
        L2fc:
            r0.remove()
            fg.q r0 = r3.f5397d
            if (r0 == 0) goto L312
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            int r3 = r3.f5396c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r0.b(r2, r3, r4)
        L312:
            return
        L313:
            java.lang.Object r0 = r1.f17h
            ha.b0 r0 = (ha.b0) r0
            java.lang.Object r2 = r1.f18i
            java.lang.String r2 = (java.lang.String) r2
            android.content.Context r0 = r0.f5157b
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r7)
            r0.show()
            return
        L325:
            r1.d()
            return
        L329:
            r1.c()
            return
        L32d:
            r1.b()
            return
        L331:
            java.lang.Object r0 = r1.f17h
            r2 = r0
            ha.d r2 = (ha.d) r2
            java.lang.Object r0 = r1.f18i
            r3 = r0
            ha.c0 r3 = (ha.c0) r3
            java.lang.String r0 = "评论失败 "
            java.lang.String r4 = "评论已提交 "
            java.lang.String r5 = "取消 "
            java.lang.String r7 = "取消 "
            r8 = 600000(0x927c0, double:2.964394E-318)
            java.lang.String r10 = r2.f(r3)     // Catch: java.lang.Throwable -> L37f
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            if (r10 == 0) goto L382
            java.lang.String r0 = r3.f5168a     // Catch: java.lang.Throwable -> L37f
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L37f
            long r4 = r4 + r11
            r2.g(r4, r0)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = r3.f5170c     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = ha.d.b(r0)     // Catch: java.lang.Throwable -> L37f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37f
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L37f
            r4.append(r0)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = "："
            r4.append(r0)     // Catch: java.lang.Throwable -> L37f
            r4.append(r10)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L37f
            r2.c(r0)     // Catch: java.lang.Throwable -> L37f
        L376:
            java.util.concurrent.ConcurrentHashMap r0 = r2.f5183h
            java.lang.String r2 = r3.f5168a
        L37a:
            r0.remove(r2)
            goto L439
        L37f:
            r0 = move-exception
            goto L426
        L382:
            java.lang.String r7 = r2.h()     // Catch: java.lang.Throwable -> L37f
            int r10 = r7.length()     // Catch: java.lang.Throwable -> L37f
            if (r10 != 0) goto L3b1
            java.lang.String r0 = r3.f5168a     // Catch: java.lang.Throwable -> L37f
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L37f
            long r6 = r6 + r11
            r2.g(r6, r0)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = r3.f5170c     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = ha.d.b(r0)     // Catch: java.lang.Throwable -> L37f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L37f
            r4.append(r0)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = "：评论内容为空"
            r4.append(r0)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L37f
            r2.c(r0)     // Catch: java.lang.Throwable -> L37f
            goto L376
        L3b1:
            p8.d0 r5 = h.Hchat.hooks.api.core.WeChatApis.snsApi()     // Catch: java.lang.Throwable -> L37f
            if (r5 == 0) goto L3fc
            java.lang.Object r10 = r3.f5174g     // Catch: java.lang.Throwable -> L37f
            boolean r5 = r5.e(r10, r7)     // Catch: java.lang.Throwable -> L37f
            if (r5 != r6) goto L3fc
            java.lang.String r0 = r3.f5170c     // Catch: java.lang.Throwable -> L37f
            r2.e(r0)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = r3.f5168a     // Catch: java.lang.Throwable -> L37f
            java.lang.Object r5 = r2.f5179d     // Catch: java.lang.Throwable -> L37f
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L37f
            java.util.LinkedHashMap r6 = r2.f5181f     // Catch: java.lang.Throwable -> L3f9
            r6.remove(r0)     // Catch: java.lang.Throwable -> L3f9
            java.util.LinkedHashSet r6 = r2.f5182g     // Catch: java.lang.Throwable -> L3f9
            r6.add(r0)     // Catch: java.lang.Throwable -> L3f9
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37f
            r2.i()     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = r3.f5170c     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = ha.d.b(r0)     // Catch: java.lang.Throwable -> L37f
            ha.d0 r5 = r3.f5172e     // Catch: java.lang.Throwable -> L37f
            java.lang.String r5 = r5.f5192g     // Catch: java.lang.Throwable -> L37f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37f
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L37f
            r6.append(r0)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = " · "
            r6.append(r0)     // Catch: java.lang.Throwable -> L37f
            r6.append(r5)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L37f
            r2.c(r0)     // Catch: java.lang.Throwable -> L37f
            goto L420
        L3f9:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L37f
            throw r0     // Catch: java.lang.Throwable -> L37f
        L3fc:
            java.lang.String r4 = r3.f5168a     // Catch: java.lang.Throwable -> L37f
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L37f
            long r5 = r5 + r8
            r2.g(r5, r4)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r4 = r3.f5170c     // Catch: java.lang.Throwable -> L37f
            java.lang.String r4 = ha.d.b(r4)     // Catch: java.lang.Throwable -> L37f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37f
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L37f
            r5.append(r4)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = "，稍后允许重试"
            r5.append(r0)     // Catch: java.lang.Throwable -> L37f
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L37f
            r2.c(r0)     // Catch: java.lang.Throwable -> L37f
        L420:
            java.util.concurrent.ConcurrentHashMap r0 = r2.f5183h
            java.lang.String r2 = r3.f5168a
            goto L37a
        L426:
            java.lang.String r4 = r3.f5168a     // Catch: java.lang.Throwable -> L43a
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L43a
            long r5 = r5 + r8
            r2.g(r5, r4)     // Catch: java.lang.Throwable -> L43a
            ab.b r4 = r2.f5176a     // Catch: java.lang.Throwable -> L43a
            java.lang.String r5 = "执行朋友圈评论失败"
            r4.invoke(r5, r0)     // Catch: java.lang.Throwable -> L43a
            goto L376
        L439:
            return
        L43a:
            r0 = move-exception
            java.util.concurrent.ConcurrentHashMap r2 = r2.f5183h
            java.lang.String r3 = r3.f5168a
            r2.remove(r3)
            throw r0
        L443:
            r1.a()
            return
        L447:
            java.lang.Object r0 = r1.f17h
            h.Hchat.hooks.items.script.ScriptWaBridge r0 = (h.Hchat.hooks.items.script.ScriptWaBridge) r0
            java.lang.Object r2 = r1.f18i
            eb.w0 r2 = (eb.w0) r2
            h.Hchat.hooks.items.script.ScriptWaBridge.j(r0, r2)
            return
        L453:
            java.lang.Object r0 = r1.f17h
            h.Hchat.hooks.items.script.ScriptWaBridge r0 = (h.Hchat.hooks.items.script.ScriptWaBridge) r0
            java.lang.Object r2 = r1.f18i
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            h.Hchat.hooks.items.script.ScriptWaBridge.c(r0, r2)
            return
        L45f:
            java.lang.Object r0 = r1.f17h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f18i
            h.Hchat.hooks.items.script.ScriptPluginBridge r2 = (h.Hchat.hooks.items.script.ScriptPluginBridge) r2
            h.Hchat.hooks.items.script.ScriptPluginRuntime.d(r0, r2)
            return
        L46b:
            java.lang.Object r0 = r1.f17h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f18i
            eb.c0 r2 = (eb.c0) r2
            h.Hchat.hooks.items.script.ScriptPluginRuntime.u(r0, r2)
            return
        L477:
            java.lang.Object r0 = r1.f17h
            r5 = r0
            d9.e r5 = (d9.e) r5
            java.lang.Object r0 = r1.f18i
            android.net.Uri r0 = (android.net.Uri) r0
            android.app.Activity r8 = r5.f2092a
            java.lang.String r9 = r5.f2093b
            boolean r10 = r5.f2094c
            java.util.concurrent.ConcurrentHashMap r11 = d9.o.f2133a
            java.lang.String r11 = "[Hchat:CustomFriendAvatar] 保存自定义好友头像失败: wxid="
            java.lang.Class<d9.o> r12 = d9.o.class
            monitor-enter(r12)
            r8.getClass()     // Catch: java.lang.Throwable -> L5fa
            r9.getClass()     // Catch: java.lang.Throwable -> L5fa
            java.lang.CharSequence r9 = og.m.R0(r9)     // Catch: java.lang.Throwable -> L5fa
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L5fa
            int r13 = r9.length()     // Catch: java.lang.Throwable -> L5fa
            if (r13 != 0) goto L4a4
            monitor-exit(r12)
            goto L5ef
        L4a4:
            android.graphics.Bitmap r0 = d9.o.c(r8, r0)     // Catch: java.lang.Throwable -> L4c3
            if (r0 == 0) goto L5b6
            int r13 = r0.getWidth()     // Catch: java.lang.Throwable -> L4c3
            int r14 = r0.getHeight()     // Catch: java.lang.Throwable -> L4c3
            int r13 = java.lang.Math.min(r13, r14)     // Catch: java.lang.Throwable -> L4c3
            int r14 = r0.getWidth()     // Catch: java.lang.Throwable -> L4c3
            if (r14 != r13) goto L4c6
            int r14 = r0.getHeight()     // Catch: java.lang.Throwable -> L4c3
            if (r14 != r13) goto L4c6
            goto L4d9
        L4c3:
            r0 = move-exception
            goto L5be
        L4c6:
            int r14 = r0.getWidth()     // Catch: java.lang.Throwable -> L4c3
            int r14 = r14 - r13
            int r14 = r14 / r4
            int r15 = r0.getHeight()     // Catch: java.lang.Throwable -> L4c3
            int r15 = r15 - r13
            int r15 = r15 / r4
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r14, r15, r13, r13)     // Catch: java.lang.Throwable -> L4c3
            r0.getClass()     // Catch: java.lang.Throwable -> L4c3
        L4d9:
            java.io.File r13 = d9.o.a(r8, r9)     // Catch: java.lang.Throwable -> L4c3
            java.io.File r14 = r13.getParentFile()     // Catch: java.lang.Throwable -> L4c3
            if (r14 == 0) goto L4e6
            r14.mkdirs()     // Catch: java.lang.Throwable -> L4c3
        L4e6:
            java.io.File r14 = new java.io.File     // Catch: java.lang.Throwable -> L4c3
            java.io.File r15 = r13.getParentFile()     // Catch: java.lang.Throwable -> L4c3
            r16 = 0
            java.lang.String r2 = r13.getName()     // Catch: java.lang.Throwable -> L4c3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c3
            r3.<init>()     // Catch: java.lang.Throwable -> L4c3
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r2 = ".tmp"
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L4c3
            r14.<init>(r15, r2)     // Catch: java.lang.Throwable -> L4c3
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4c3
            r2.<init>(r14)     // Catch: java.lang.Throwable -> L4c3
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L5a5
            r15 = 100
            boolean r0 = r0.compress(r3, r15, r2)     // Catch: java.lang.Throwable -> L5a5
            if (r0 == 0) goto L5a8
            java.io.FileDescriptor r0 = r2.getFD()     // Catch: java.lang.Throwable -> L5a5
            r0.sync()     // Catch: java.lang.Throwable -> L5a5
            r2.close()     // Catch: java.lang.Throwable -> L4c3
            boolean r0 = r14.isFile()     // Catch: java.lang.Throwable -> L4c3
            if (r0 == 0) goto L59d
            long r2 = r14.length()     // Catch: java.lang.Throwable -> L4c3
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L59d
            java.nio.file.Path r0 = r14.toPath()     // Catch: java.lang.Throwable -> L544
            java.nio.file.Path r2 = r13.toPath()     // Catch: java.lang.Throwable -> L544
            java.nio.file.CopyOption[] r3 = new java.nio.file.CopyOption[r4]     // Catch: java.lang.Throwable -> L544
            java.nio.file.StandardCopyOption r4 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.lang.Throwable -> L544
            r3[r7] = r4     // Catch: java.lang.Throwable -> L544
            java.nio.file.StandardCopyOption r4 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.Throwable -> L544
            r3[r6] = r4     // Catch: java.lang.Throwable -> L544
            java.nio.file.Path r0 = java.nio.file.Files.move(r0, r2, r3)     // Catch: java.lang.Throwable -> L544
            goto L54b
        L544:
            r0 = move-exception
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L4c3
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4c3
            r0 = r2
        L54b:
            java.lang.Throwable r0 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L4c3
            if (r0 != 0) goto L552
            goto L56d
        L552:
            boolean r0 = r13.exists()     // Catch: java.lang.Throwable -> L4c3
            if (r0 == 0) goto L567
            boolean r0 = r13.delete()     // Catch: java.lang.Throwable -> L4c3
            if (r0 == 0) goto L55f
            goto L567
        L55f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r2 = "旧头像删除失败"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4c3
            throw r0     // Catch: java.lang.Throwable -> L4c3
        L567:
            boolean r0 = r14.renameTo(r13)     // Catch: java.lang.Throwable -> L4c3
            if (r0 == 0) goto L595
        L56d:
            if (r10 == 0) goto L58d
            java.util.LinkedHashSet r0 = d9.o.b(r8)     // Catch: java.lang.Throwable -> L4c3
            java.util.Set r0 = tf.m.T1(r0)     // Catch: java.lang.Throwable -> L4c3
            r0.add(r9)     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r2 = "Hchat_custom_friend_avatar_config"
            android.content.SharedPreferences r2 = ub.b.c(r8, r2)     // Catch: java.lang.Throwable -> L4c3
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r3 = "configured_friends"
            android.content.SharedPreferences$Editor r0 = r2.putStringSet(r3, r0)     // Catch: java.lang.Throwable -> L4c3
            r0.apply()     // Catch: java.lang.Throwable -> L4c3
        L58d:
            java.util.concurrent.ConcurrentHashMap r0 = d9.o.f2133a     // Catch: java.lang.Throwable -> L4c3
            r0.remove(r9)     // Catch: java.lang.Throwable -> L4c3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4c3
            goto L5c4
        L595:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r2 = "头像替换失败"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4c3
            throw r0     // Catch: java.lang.Throwable -> L4c3
        L59d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r2 = "头像文件为空"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4c3
            throw r0     // Catch: java.lang.Throwable -> L4c3
        L5a5:
            r0 = move-exception
            r3 = r0
            goto L5b0
        L5a8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5a5
            java.lang.String r3 = "头像写入失败"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L5a5
            throw r0     // Catch: java.lang.Throwable -> L5a5
        L5b0:
            throw r3     // Catch: java.lang.Throwable -> L5b1
        L5b1:
            r0 = move-exception
            ig.a.i(r2, r3)     // Catch: java.lang.Throwable -> L4c3
            throw r0     // Catch: java.lang.Throwable -> L4c3
        L5b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4c3
            java.lang.String r2 = "无法解析图片"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4c3
            throw r0     // Catch: java.lang.Throwable -> L4c3
        L5be:
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L5fa
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5fa
            r0 = r2
        L5c4:
            java.lang.Throwable r2 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L5fa
            if (r2 != 0) goto L5cb
            goto L5e8
        L5cb:
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> L5fa
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5fa
            r3.<init>(r11)     // Catch: java.lang.Throwable -> L5fa
            r3.append(r9)     // Catch: java.lang.Throwable -> L5fa
            java.lang.String r4 = ", error="
            r3.append(r4)     // Catch: java.lang.Throwable -> L5fa
            r3.append(r0)     // Catch: java.lang.Throwable -> L5fa
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5fa
            fb.v0.n(r0, r2)     // Catch: java.lang.Throwable -> L5fa
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5fa
        L5e8:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5fa
            boolean r7 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5fa
            monitor-exit(r12)
        L5ef:
            android.app.Activity r0 = r5.f2092a
            ba.e r2 = new ba.e
            r2.<init>(r5, r7, r6)
            r0.runOnUiThread(r2)
            return
        L5fa:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L5fa
            throw r0
        L5fd:
            java.lang.Object r0 = r1.f17h
            ud.l r0 = (ud.l) r0
            java.lang.Object r2 = r1.f18i
            ud.r r2 = (ud.r) r2
            be.d0.i(r0, r2)
            return
        L609:
            java.lang.Object r0 = r1.f17h
            bb.g r0 = (bb.g) r0
            java.lang.Object r2 = r1.f18i
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r3 = r0.f657g
            r3.getClass()
            monitor-enter(r3)
            java.util.Map r4 = r0.f657g     // Catch: java.lang.Throwable -> L675
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L675
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L675
            java.util.List r4 = tf.m.P1(r4)     // Catch: java.lang.Throwable -> L675
            monitor-exit(r3)
            java.util.Iterator r3 = r4.iterator()
        L628:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L674
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L628
            r5.getClass()
            bb.l r4 = r0.f652b
            android.content.SharedPreferences r6 = r4.f694a
            java.lang.String r8 = "enable"
            boolean r6 = r6.getBoolean(r8, r7)
            if (r6 == 0) goto L65d
            java.lang.String r4 = r4.a(r2)
            r0.c(r5, r2, r4)
            goto L660
        L65d:
            bb.g.j(r5)
        L660:
            ib.b r4 = r0.f653c
            android.content.SharedPreferences r4 = r4.f6650a
            java.lang.String r6 = "enable"
            boolean r4 = r4.getBoolean(r6, r7)
            if (r4 == 0) goto L670
            r0.b(r5)
            goto L628
        L670:
            bb.g.i(r5)
            goto L628
        L674:
            return
        L675:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L678:
            r16 = 0
            java.lang.Object r0 = r1.f17h
            r2 = r0
            ba.d r2 = (ba.d) r2
            java.lang.Object r0 = r1.f18i
            android.net.Uri r0 = (android.net.Uri) r0
            android.app.Activity r3 = r2.f556a
            ba.n r5 = r2.f557b
            ba.r r8 = ba.r.f632a
            java.lang.Class<ba.r> r8 = ba.r.class
            monitor-enter(r8)
            r5.getClass()     // Catch: java.lang.Throwable -> L7f6
            ba.r r9 = ba.r.f632a     // Catch: java.lang.Throwable -> L7f6
            java.io.File r9 = ba.r.a(r3, r5)     // Catch: java.lang.Throwable -> L7f6
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L7f6
            java.io.File r11 = r9.getParentFile()     // Catch: java.lang.Throwable -> L7f6
            java.lang.String r12 = r9.getName()     // Catch: java.lang.Throwable -> L7f6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f6
            r13.<init>()     // Catch: java.lang.Throwable -> L7f6
            r13.append(r12)     // Catch: java.lang.Throwable -> L7f6
            java.lang.String r12 = ".tmp"
            r13.append(r12)     // Catch: java.lang.Throwable -> L7f6
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L7f6
            r10.<init>(r11, r12)     // Catch: java.lang.Throwable -> L7f6
            java.io.File r11 = r9.getParentFile()     // Catch: java.lang.Throwable -> L6bd
            if (r11 == 0) goto L6c1
            r11.mkdirs()     // Catch: java.lang.Throwable -> L6bd
            goto L6c1
        L6bd:
            r0 = move-exception
            r15 = r5
            goto L7b0
        L6c1:
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L6bd
            java.io.InputStream r3 = r3.openInputStream(r0)     // Catch: java.lang.Throwable -> L6bd
            if (r3 == 0) goto L7a7
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L79c
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L79c
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L790
            r12 = r16
        L6d6:
            int r14 = r3.read(r0)     // Catch: java.lang.Throwable -> L790
            if (r14 >= 0) goto L774
            java.io.FileDescriptor r0 = r11.getFD()     // Catch: java.lang.Throwable -> L770
            r0.sync()     // Catch: java.lang.Throwable -> L770
            r11.close()     // Catch: java.lang.Throwable -> L76c
            r3.close()     // Catch: java.lang.Throwable -> L6bd
            boolean r0 = r10.isFile()     // Catch: java.lang.Throwable -> L6bd
            if (r0 == 0) goto L764
            long r11 = r10.length()     // Catch: java.lang.Throwable -> L6bd
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 <= 0) goto L764
            ba.o r16 = ba.r.b(r10)     // Catch: java.lang.Throwable -> L6bd
            if (r16 == 0) goto L75c
            java.nio.file.Path r0 = r10.toPath()     // Catch: java.lang.Throwable -> L714
            java.nio.file.Path r3 = r9.toPath()     // Catch: java.lang.Throwable -> L714
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r4]     // Catch: java.lang.Throwable -> L714
            java.nio.file.StandardCopyOption r11 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.lang.Throwable -> L714
            r4[r7] = r11     // Catch: java.lang.Throwable -> L714
            java.nio.file.StandardCopyOption r11 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.Throwable -> L714
            r4[r6] = r11     // Catch: java.lang.Throwable -> L714
            java.nio.file.Path r0 = java.nio.file.Files.move(r0, r3, r4)     // Catch: java.lang.Throwable -> L714
            goto L71b
        L714:
            r0 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L6bd
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6bd
            r0 = r3
        L71b:
            java.lang.Throwable r0 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L6bd
            if (r0 != 0) goto L722
            goto L73d
        L722:
            boolean r0 = r9.exists()     // Catch: java.lang.Throwable -> L6bd
            if (r0 == 0) goto L737
            boolean r0 = r9.delete()     // Catch: java.lang.Throwable -> L6bd
            if (r0 == 0) goto L72f
            goto L737
        L72f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6bd
            java.lang.String r3 = "旧气泡文件删除失败"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6bd
            throw r0     // Catch: java.lang.Throwable -> L6bd
        L737:
            boolean r0 = r10.renameTo(r9)     // Catch: java.lang.Throwable -> L6bd
            if (r0 == 0) goto L754
        L73d:
            java.util.concurrent.ConcurrentHashMap r0 = ba.r.f633b     // Catch: java.lang.Throwable -> L6bd
            ba.p r11 = new ba.p     // Catch: java.lang.Throwable -> L6bd
            long r12 = r9.lastModified()     // Catch: java.lang.Throwable -> L6bd
            long r14 = r9.length()     // Catch: java.lang.Throwable -> L6bd
            r11.<init>(r12, r14, r16)     // Catch: java.lang.Throwable -> L6bd
            r0.put(r5, r11)     // Catch: java.lang.Throwable -> L6bd
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L6bd
            r15 = r5
            goto L7b6
        L754:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6bd
            java.lang.String r3 = "气泡文件替换失败"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6bd
            throw r0     // Catch: java.lang.Throwable -> L6bd
        L75c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6bd
            java.lang.String r3 = "无法解析气泡图片"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6bd
            throw r0     // Catch: java.lang.Throwable -> L6bd
        L764:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6bd
            java.lang.String r3 = "气泡文件为空"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6bd
            throw r0     // Catch: java.lang.Throwable -> L6bd
        L76c:
            r0 = move-exception
            r4 = r0
            r15 = r5
            goto L79f
        L770:
            r0 = move-exception
            r4 = r0
            r15 = r5
            goto L793
        L774:
            r15 = r5
            long r4 = (long) r14
            long r12 = r12 + r4
            r4 = 33554432(0x2000000, double:1.6578092E-316)
            int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r4 > 0) goto L788
            r11.write(r0, r7, r14)     // Catch: java.lang.Throwable -> L785
            r5 = r15
            r4 = 2
            goto L6d6
        L785:
            r0 = move-exception
        L786:
            r4 = r0
            goto L793
        L788:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L785
            java.lang.String r4 = "气泡文件不能超过 32 MB"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L785
            throw r0     // Catch: java.lang.Throwable -> L785
        L790:
            r0 = move-exception
            r15 = r5
            goto L786
        L793:
            throw r4     // Catch: java.lang.Throwable -> L794
        L794:
            r0 = move-exception
            ig.a.i(r11, r4)     // Catch: java.lang.Throwable -> L799
            throw r0     // Catch: java.lang.Throwable -> L799
        L799:
            r0 = move-exception
        L79a:
            r4 = r0
            goto L79f
        L79c:
            r0 = move-exception
            r15 = r5
            goto L79a
        L79f:
            throw r4     // Catch: java.lang.Throwable -> L7a0
        L7a0:
            r0 = move-exception
            ig.a.i(r3, r4)     // Catch: java.lang.Throwable -> L7a5
            throw r0     // Catch: java.lang.Throwable -> L7a5
        L7a5:
            r0 = move-exception
            goto L7b0
        L7a7:
            r15 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a5
            java.lang.String r3 = "无法读取气泡文件"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L7a5
            throw r0     // Catch: java.lang.Throwable -> L7a5
        L7b0:
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L7f6
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L7f6
            r0 = r3
        L7b6:
            java.lang.Throwable r3 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L7f6
            if (r3 != 0) goto L7bd
            goto L7e4
        L7bd:
            r10.delete()     // Catch: java.lang.Throwable -> L7f6
            java.lang.String r0 = r15.f615h     // Catch: java.lang.Throwable -> L7f6
            java.lang.String r4 = r3.getMessage()     // Catch: java.lang.Throwable -> L7f6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f6
            r5.<init>()     // Catch: java.lang.Throwable -> L7f6
            java.lang.String r6 = "[Hchat:MessageBubble] 保存"
            r5.append(r6)     // Catch: java.lang.Throwable -> L7f6
            r5.append(r0)     // Catch: java.lang.Throwable -> L7f6
            java.lang.String r0 = "失败: "
            r5.append(r0)     // Catch: java.lang.Throwable -> L7f6
            r5.append(r4)     // Catch: java.lang.Throwable -> L7f6
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L7f6
            fb.v0.n(r0, r3)     // Catch: java.lang.Throwable -> L7f6
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L7f6
        L7e4:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L7f6
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L7f6
            monitor-exit(r8)
            android.app.Activity r3 = r2.f556a
            ba.e r4 = new ba.e
            r4.<init>(r2, r0, r7)
            r3.runOnUiThread(r4)
            return
        L7f6:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7f6
            throw r0
        L7f9:
            java.lang.Object r0 = r1.f17h
            r2 = r0
            ac.q r2 = (ac.q) r2
            java.lang.Object r0 = r1.f18i
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()     // Catch: java.lang.Throwable -> L809
            r2.a()
            return
        L809:
            r0 = move-exception
            r2.a()
            throw r0
        L80e:
            java.lang.Object r0 = r1.f17h
            ac.o r0 = (ac.o) r0
            java.lang.Object r2 = r1.f18i
            java.lang.String r2 = (java.lang.String) r2
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r0.f191a
            r4.append(r5)
            java.lang.String r0 = r0.f192b
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0, r2)
            ig.a.n(r3)
            return
        L832:
            java.lang.Object r0 = r1.f17h
            a1.i r0 = (a1.i) r0
            java.lang.Object r2 = r1.f18i
            android.util.LongSparseArray r2 = (android.util.LongSparseArray) r2
            a7.a.p(r0, r2)
            return
    }
}
