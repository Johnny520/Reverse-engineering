package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements gg.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5167b;

    public /* synthetic */ c(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f5166a = r2
            r0.f5167b = r1
            r0.<init>()
            return
    }

    @Override // gg.h
    public final gg.j a() {
            r13 = this;
            int r0 = r13.f5166a
            switch(r0) {
                case 0: goto L65;
                case 1: goto L4d;
                case 2: goto L35;
                case 3: goto L1d;
                default: goto L5;
            }
        L5:
            gg.j r1 = new gg.j
            java.lang.Object r0 = r13.f5167b
            r3 = r0
            ia.a0 r3 = (ia.a0) r3
            java.lang.Class<ia.a0> r0 = ia.a0.class
            java.lang.Class r4 = eh.a.i(r0)
            r7 = 0
            r8 = 0
            r2 = 1
            java.lang.String r5 = "onPostStored"
            java.lang.String r6 = "onPostStored(Ljava/lang/Object;)V"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L1d:
            gg.j r2 = new gg.j
            java.lang.Object r0 = r13.f5167b
            r4 = r0
            ha.b0 r4 = (ha.b0) r4
            java.lang.Class<ha.b0> r0 = ha.b0.class
            java.lang.Class r5 = eh.a.i(r0)
            r8 = 0
            r9 = 0
            r3 = 1
            java.lang.String r6 = "onPostStored"
            java.lang.String r7 = "onPostStored(Ljava/lang/Object;)V"
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L35:
            gg.j r3 = new gg.j
            java.lang.Object r0 = r13.f5167b
            r5 = r0
            ha.k r5 = (ha.k) r5
            java.lang.Class<ha.k> r0 = ha.k.class
            java.lang.Class r6 = eh.a.i(r0)
            r9 = 0
            r10 = 0
            r4 = 1
            java.lang.String r7 = "onPostStored"
            java.lang.String r8 = "onPostStored(Ljava/lang/Object;)V"
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L4d:
            gg.j r4 = new gg.j
            java.lang.Object r0 = r13.f5167b
            r6 = r0
            ha.h r6 = (ha.h) r6
            java.lang.Class<ha.h> r0 = ha.h.class
            java.lang.Class r7 = eh.a.i(r0)
            r10 = 0
            r11 = 0
            r5 = 1
            java.lang.String r8 = "onPostStored"
            java.lang.String r9 = "onPostStored(Ljava/lang/Object;)V"
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L65:
            gg.j r5 = new gg.j
            java.lang.Object r0 = r13.f5167b
            r7 = r0
            ha.d r7 = (ha.d) r7
            java.lang.Class<ha.d> r0 = ha.d.class
            java.lang.Class r8 = eh.a.i(r0)
            r11 = 0
            r12 = 0
            r6 = 1
            java.lang.String r9 = "onPostStored"
            java.lang.String r10 = "onPostStored(Ljava/lang/Object;)V"
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
    }

    public final void b(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f5166a
            switch(r0) {
                case 0: goto Lb5;
                case 1: goto L7d;
                case 2: goto L60;
                case 3: goto L31;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.f5167b
            ia.a0 r0 = (ia.a0) r0
            java.lang.String r1 = ia.a0.q(r8)
            if (r1 == 0) goto L30
            b5.c r2 = r0.f6539b
            monitor-enter(r2)
            java.util.LinkedHashMap r3 = r2.J()     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            if (r3 != 0) goto L1e
            goto L30
        L1e:
            r0.i(r8)
            aa.c r8 = new aa.c
            r2 = 19
            r8.<init>(r0, r2, r1)
            r0.r(r8)
            goto L30
        L2c:
            r0 = move-exception
            r8 = r0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r8
        L30:
            return
        L31:
            java.lang.Object r0 = r7.f5167b
            ha.b0 r0 = (ha.b0) r0
            android.content.SharedPreferences r1 = r0.f5158c
            java.lang.String r2 = "enable"
            r3 = 0
            boolean r2 = r1.getBoolean(r2, r3)
            if (r2 != 0) goto L41
            goto L5f
        L41:
            java.lang.String r2 = "system_notification"
            r3 = 1
            boolean r2 = r1.getBoolean(r2, r3)
            if (r2 != 0) goto L53
            java.lang.String r2 = "toast"
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L53
            goto L5f
        L53:
            java.util.concurrent.ExecutorService r1 = r0.f5160e     // Catch: java.lang.Throwable -> L5f
            a1.d r2 = new a1.d     // Catch: java.lang.Throwable -> L5f
            r3 = 15
            r2.<init>(r0, r3, r8)     // Catch: java.lang.Throwable -> L5f
            r1.execute(r2)     // Catch: java.lang.Throwable -> L5f
        L5f:
            return
        L60:
            java.lang.Object r0 = r7.f5167b
            ha.k r0 = (ha.k) r0
            android.content.SharedPreferences r1 = r0.f5247b
            java.lang.String r2 = "enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 != 0) goto L70
            goto L7c
        L70:
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.f5248c     // Catch: java.lang.Throwable -> L7c
            a1.d r2 = new a1.d     // Catch: java.lang.Throwable -> L7c
            r3 = 13
            r2.<init>(r0, r3, r8)     // Catch: java.lang.Throwable -> L7c
            r1.execute(r2)     // Catch: java.lang.Throwable -> L7c
        L7c:
            return
        L7d:
            java.lang.Object r0 = r7.f5167b
            r2 = r0
            ha.h r2 = (ha.h) r2
            android.content.SharedPreferences r0 = r2.f5214b
            java.lang.String r1 = "enable"
            r3 = 0
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 != 0) goto L8e
            goto Lb4
        L8e:
            long r4 = r2.f5223k
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r2.f5216d     // Catch: java.lang.Throwable -> L9f
            ca.r r1 = new ca.r     // Catch: java.lang.Throwable -> L9f
            r6 = 2
            r3 = r8
            r1.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L9f
            r0.execute(r1)     // Catch: java.lang.Throwable -> L9f
            sf.n r8 = sf.n.f12433a     // Catch: java.lang.Throwable -> L9f
            goto La7
        L9f:
            r0 = move-exception
            r8 = r0
            sf.f r0 = new sf.f
            r0.<init>(r8)
            r8 = r0
        La7:
            java.lang.Throwable r8 = sf.g.b(r8)
            if (r8 == 0) goto Lb4
            ab.b r0 = r2.f5213a
            java.lang.String r1 = "提交朋友圈自动转发任务失败"
            r0.invoke(r1, r8)
        Lb4:
            return
        Lb5:
            r3 = r8
            java.lang.Object r8 = r7.f5167b
            ha.d r8 = (ha.d) r8
            android.content.SharedPreferences r0 = r8.f5177b
            java.lang.String r1 = "comment_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Lc6
            goto Ld2
        Lc6:
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r8.f5178c     // Catch: java.lang.Throwable -> Ld2
            a1.d r1 = new a1.d     // Catch: java.lang.Throwable -> Ld2
            r2 = 11
            r1.<init>(r8, r2, r3)     // Catch: java.lang.Throwable -> Ld2
            r0.execute(r1)     // Catch: java.lang.Throwable -> Ld2
        Ld2:
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f5166a
            switch(r0) {
                case 0: goto L69;
                case 1: goto L50;
                case 2: goto L37;
                case 3: goto L1e;
                default: goto L5;
            }
        L5:
            boolean r0 = r2 instanceof ha.c
            if (r0 == 0) goto L1c
            boolean r0 = r2 instanceof gg.h
            if (r0 == 0) goto L1c
            gg.j r0 = r1.a()
            gg.h r2 = (gg.h) r2
            gg.j r2 = r2.a()
            boolean r2 = r0.equals(r2)
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
        L1e:
            boolean r0 = r2 instanceof ha.c
            if (r0 == 0) goto L35
            boolean r0 = r2 instanceof gg.h
            if (r0 == 0) goto L35
            gg.j r0 = r1.a()
            gg.h r2 = (gg.h) r2
            gg.j r2 = r2.a()
            boolean r2 = r0.equals(r2)
            goto L36
        L35:
            r2 = 0
        L36:
            return r2
        L37:
            boolean r0 = r2 instanceof ha.c
            if (r0 == 0) goto L4e
            boolean r0 = r2 instanceof gg.h
            if (r0 == 0) goto L4e
            gg.j r0 = r1.a()
            gg.h r2 = (gg.h) r2
            gg.j r2 = r2.a()
            boolean r2 = r0.equals(r2)
            goto L4f
        L4e:
            r2 = 0
        L4f:
            return r2
        L50:
            boolean r0 = r2 instanceof ha.c
            if (r0 == 0) goto L67
            boolean r0 = r2 instanceof gg.h
            if (r0 == 0) goto L67
            gg.j r0 = r1.a()
            gg.h r2 = (gg.h) r2
            gg.j r2 = r2.a()
            boolean r2 = r0.equals(r2)
            goto L68
        L67:
            r2 = 0
        L68:
            return r2
        L69:
            boolean r0 = r2 instanceof ha.c
            if (r0 == 0) goto L80
            boolean r0 = r2 instanceof gg.h
            if (r0 == 0) goto L80
            gg.j r0 = r1.a()
            gg.h r2 = (gg.h) r2
            gg.j r2 = r2.a()
            boolean r2 = r0.equals(r2)
            goto L81
        L80:
            r2 = 0
        L81:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f5166a
            switch(r0) {
                case 0: goto L29;
                case 1: goto L20;
                case 2: goto L17;
                case 3: goto Le;
                default: goto L5;
            }
        L5:
            gg.j r0 = r1.a()
            int r0 = r0.hashCode()
            return r0
        Le:
            gg.j r0 = r1.a()
            int r0 = r0.hashCode()
            return r0
        L17:
            gg.j r0 = r1.a()
            int r0 = r0.hashCode()
            return r0
        L20:
            gg.j r0 = r1.a()
            int r0 = r0.hashCode()
            return r0
        L29:
            gg.j r0 = r1.a()
            int r0 = r0.hashCode()
            return r0
    }
}
