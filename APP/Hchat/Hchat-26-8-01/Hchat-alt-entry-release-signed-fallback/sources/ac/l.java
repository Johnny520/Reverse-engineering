package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f182i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f183j;

    public /* synthetic */ l(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.String r4) {
            r0 = this;
            r0.f180g = r1
            r0.f181h = r2
            r0.f183j = r4
            r0.f182i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ l(android.app.Activity r1, java.util.List r2, gg.s r3, qb.k r4) {
            r0 = this;
            r4 = 28
            r0.f180g = r4
            r0.<init>()
            r0.f181h = r1
            r0.f182i = r2
            r0.f183j = r3
            return
    }

    public /* synthetic */ l(android.app.Activity r1, java.util.List r2, ia.q r3, ia.j r4) {
            r0 = this;
            r3 = 16
            r0.f180g = r3
            r0.<init>()
            r0.f181h = r1
            r0.f182i = r2
            r0.f183j = r4
            return
    }

    public /* synthetic */ l(java.lang.Object r1, android.content.Context r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f180g = r5
            r0.f181h = r2
            r0.f182i = r3
            r0.f183j = r4
            r0.<init>()
            return
    }

    public /* synthetic */ l(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f180g = r4
            r0.f181h = r1
            r0.f182i = r2
            r0.f183j = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r1 = r17
            int r0 = r1.f180g
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            switch(r0) {
                case 0: goto L79a;
                case 1: goto L778;
                case 2: goto L75a;
                case 3: goto L6b7;
                case 4: goto L6a5;
                case 5: goto L693;
                case 6: goto L608;
                case 7: goto L5aa;
                case 8: goto L58e;
                case 9: goto L57c;
                case 10: goto L521;
                case 11: goto L4f6;
                case 12: goto L4e6;
                case 13: goto L4d8;
                case 14: goto L445;
                case 15: goto L429;
                case 16: goto L400;
                case 17: goto L3d8;
                case 18: goto L3a8;
                case 19: goto L37b;
                case 20: goto L33e;
                case 21: goto L2fa;
                case 22: goto L2e3;
                case 23: goto L2b5;
                case 24: goto L20a;
                case 25: goto L1ec;
                case 26: goto L1ca;
                case 27: goto Lb5;
                case 28: goto L83;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r1.f181h
            r2 = r0
            qb.k r2 = (qb.k) r2
            java.lang.Object r0 = r1.f182i
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r0 = r1.f183j
            qb.i r0 = (qb.i) r0
            java.lang.String r6 = "语音保存失败"
            java.io.File r7 = r2.c()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L3f
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.f10829a     // Catch: java.lang.Throwable -> L35
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L35
            boolean r0 = r2.E(r8, r7)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L2f
            goto L30
        L2f:
            r7 = r4
        L30:
            if (r0 == 0) goto L37
            java.lang.String r8 = ""
            goto L39
        L35:
            r0 = move-exception
            goto L47
        L37:
            java.lang.String r8 = "语音转 MP3 失败"
        L39:
            qb.h r9 = new qb.h     // Catch: java.lang.Throwable -> L35
            r9.<init>(r7, r8, r0)     // Catch: java.lang.Throwable -> L35
            goto L4c
        L3f:
            qb.h r9 = new qb.h     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "创建保存目录失败"
            r9.<init>(r4, r0, r5)     // Catch: java.lang.Throwable -> L35
            goto L4c
        L47:
            sf.f r9 = new sf.f
            r9.<init>(r0)
        L4c:
            java.lang.Throwable r0 = sf.g.b(r9)
            if (r0 != 0) goto L53
            goto L5f
        L53:
            ia.t r2 = r2.f10835b
            java.lang.String r7 = "保存语音失败"
            r2.invoke(r7, r0)
            qb.h r9 = new qb.h
            r9.<init>(r4, r6, r5)
        L5f:
            qb.h r9 = (qb.h) r9
            boolean r0 = r9.f10826a
            if (r0 == 0) goto L74
            java.io.File r0 = r9.f10827b
            if (r0 == 0) goto L74
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r2 = "语音已保存: "
            java.lang.String r0 = wb.en.g(r2, r0)
            goto L7f
        L74:
            java.lang.String r0 = r9.f10828c
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L7d
            goto L7e
        L7d:
            r6 = r0
        L7e:
            r0 = r6
        L7f:
            qb.k.N(r3, r0)
            return
        L83:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f182i
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r1.f183j
            gg.s r4 = (gg.s) r4
            boolean r5 = r0.isFinishing()
            if (r5 != 0) goto Lb4
            int r5 = r2.size()
            int r4 = r4.f4562g
            if (r5 != r3) goto La5
            if (r4 != r3) goto La2
            java.lang.String r2 = "语音转发成功"
            goto Lb1
        La2:
            java.lang.String r2 = "语音转发失败"
            goto Lb1
        La5:
            int r2 = r2.size()
            java.lang.String r3 = "语音转发完成: "
            java.lang.String r5 = "/"
            java.lang.String r2 = p.a.j(r4, r3, r5, r2)
        Lb1:
            qb.k.N(r0, r2)
        Lb4:
            return
        Lb5:
            java.lang.Object r0 = r1.f181h
            r7 = r0
            hb.r r7 = (hb.r) r7
            java.lang.Object r0 = r1.f183j
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r1.f182i
            r12 = r0
            q9.d r12 = (q9.d) r12
            q9.g r10 = r7.q(r8)     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r0 = r7.f5456c
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            if (r10 == 0) goto Ld7
            boolean r6 = r10.f10761c     // Catch: java.lang.Throwable -> Ld4
            if (r6 != 0) goto Ld7
            goto L1a9
        Ld4:
            r0 = move-exception
            goto L1ac
        Ld7:
            if (r10 == 0) goto Ldc
            int r6 = r10.f10762d     // Catch: java.lang.Throwable -> Ld4
            goto Le2
        Ldc:
            java.lang.String r6 = "group_rename_delay_seconds"
            int r6 = r0.getInt(r6, r5)     // Catch: java.lang.Throwable -> Ld4
        Le2:
            r9 = 600(0x258, float:8.41E-43)
            int r6 = r9.e0.r(r6, r5, r9)     // Catch: java.lang.Throwable -> Ld4
            long r13 = (long) r6
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            r15 = 0
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 > 0) goto Lf3
            goto Lfe
        Lf3:
            java.lang.Thread.sleep(r13)     // Catch: java.lang.Throwable -> Ld4 java.lang.InterruptedException -> Lf7
            goto Lfe
        Lf7:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Ld4
            r6.interrupt()     // Catch: java.lang.Throwable -> Ld4
        Lfe:
            q9.f r9 = r7.r(r8, r12)     // Catch: java.lang.Throwable -> Ld4
            if (r10 == 0) goto L107
            java.lang.String r0 = r10.f10763e     // Catch: java.lang.Throwable -> Ld4
            goto L12b
        L107:
            java.lang.String r6 = "text"
            java.lang.String r11 = "group_rename_prompt_type"
            java.lang.String r13 = x6.d.E(r11, r8)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r14 = "global"
            java.lang.String r13 = r0.getString(r13, r14)     // Catch: java.lang.Throwable -> Ld4
            if (r13 == 0) goto L118
            goto L119
        L118:
            r13 = r14
        L119:
            boolean r14 = r13.equals(r14)     // Catch: java.lang.Throwable -> Ld4
            if (r14 == 0) goto L127
            java.lang.String r0 = r0.getString(r11, r6)     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto L126
            r6 = r0
        L126:
            r13 = r6
        L127:
            java.lang.String r0 = x6.d.Q(r13)     // Catch: java.lang.Throwable -> Ld4
        L12b:
            q9.c r6 = new q9.c     // Catch: java.lang.Throwable -> Ld4
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Ld4
            r13 = r6
            q9.c r6 = new q9.c     // Catch: java.lang.Throwable -> Ld4
            r11 = 1
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r9 = "card"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> Ld4
            if (r9 == 0) goto L145
            java.util.List r0 = a.a.x0(r6)     // Catch: java.lang.Throwable -> Ld4
            goto L178
        L145:
            java.lang.String r9 = "both"
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto L174
            if (r10 == 0) goto L152
            java.lang.String r0 = r10.f10764f     // Catch: java.lang.Throwable -> Ld4
            goto L156
        L152:
            java.lang.String r0 = r7.c(r8)     // Catch: java.lang.Throwable -> Ld4
        L156:
            java.lang.String r9 = "card_first"
            boolean r0 = r0.equals(r9)     // Catch: java.lang.Throwable -> Ld4
            if (r0 == 0) goto L169
            fg.a[] r0 = new fg.a[r2]     // Catch: java.lang.Throwable -> Ld4
            r0[r5] = r6     // Catch: java.lang.Throwable -> Ld4
            r0[r3] = r13     // Catch: java.lang.Throwable -> Ld4
            java.util.List r0 = a.a.y0(r0)     // Catch: java.lang.Throwable -> Ld4
            goto L178
        L169:
            fg.a[] r0 = new fg.a[r2]     // Catch: java.lang.Throwable -> Ld4
            r0[r5] = r13     // Catch: java.lang.Throwable -> Ld4
            r0[r3] = r6     // Catch: java.lang.Throwable -> Ld4
            java.util.List r0 = a.a.y0(r0)     // Catch: java.lang.Throwable -> Ld4
            goto L178
        L174:
            java.util.List r0 = a.a.x0(r13)     // Catch: java.lang.Throwable -> Ld4
        L178:
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> Ld4
        L17c:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld4
            if (r6 == 0) goto L1a9
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> Ld4
            int r9 = r5 + 1
            if (r5 < 0) goto L1a5
            fg.a r6 = (fg.a) r6     // Catch: java.lang.Throwable -> Ld4
            r6.invoke()     // Catch: java.lang.Throwable -> Ld4
            int r6 = r0.size()     // Catch: java.lang.Throwable -> Ld4
            int r6 = r6 - r3
            if (r5 >= r6) goto L1a3
            r5 = 300(0x12c, double:1.48E-321)
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Throwable -> Ld4 java.lang.InterruptedException -> L19c
            goto L1a3
        L19c:
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Ld4
            r5.interrupt()     // Catch: java.lang.Throwable -> Ld4
        L1a3:
            r5 = r9
            goto L17c
        L1a5:
            a.a.Q0()     // Catch: java.lang.Throwable -> Ld4
            throw r4     // Catch: java.lang.Throwable -> Ld4
        L1a9:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> Ld4
            goto L1b2
        L1ac:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L1b2:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L1c9
            java.lang.Object r2 = r7.f5455b
            ia.t r2 = (ia.t) r2
            java.lang.String r3 = r12.f10744a
            java.lang.String r4 = "改名提醒发送异常: "
            java.lang.String r5 = "/"
            java.lang.String r3 = bc.e.j(r4, r8, r5, r3)
            r2.invoke(r3, r0)
        L1c9:
            return
        L1ca:
            java.lang.Object r0 = r1.f181h
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r2 = r1.f182i
            fg.a r2 = (fg.a) r2
            java.lang.Object r3 = r1.f183j
            java.util.concurrent.CountDownLatch r3 = (java.util.concurrent.CountDownLatch) r3
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L1e7
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1e7
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L1e7
            r0.set(r2)     // Catch: java.lang.Throwable -> L1e7
            r3.countDown()
            return
        L1e7:
            r0 = move-exception
            r3.countDown()
            throw r0
        L1ec:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f182i
            p8.i r2 = (p8.i) r2
            java.lang.Object r3 = r1.f183j
            p8.l r3 = (p8.l) r3
            boolean r4 = r0.isFinishing()
            if (r4 != 0) goto L209
            boolean r4 = r0.isDestroyed()
            if (r4 != 0) goto L209
            fg.p r2 = r2.f10379i
            r2.invoke(r0, r3)
        L209:
            return
        L20a:
            java.lang.Object r0 = r1.f181h
            r2 = r0
            gg.u r2 = (gg.u) r2
            java.lang.Object r0 = r1.f182i
            r3 = r0
            p8.h r3 = (p8.h) r3
            java.lang.Object r0 = r1.f183j
            java.util.List r0 = (java.util.List) r0
            org.luckypray.dexkit.DexKitBridge r5 = r3.f10363c     // Catch: java.lang.Throwable -> L25e
            ch.e r6 = new ch.e     // Catch: java.lang.Throwable -> L25e
            r6.<init>()     // Catch: java.lang.Throwable -> L25e
            fh.k r7 = new fh.k     // Catch: java.lang.Throwable -> L25e
            r7.<init>()     // Catch: java.lang.Throwable -> L25e
            fh.k.u0(r7, r0)     // Catch: java.lang.Throwable -> L25e
            r6.f1666h = r7     // Catch: java.lang.Throwable -> L25e
            hh.p r0 = r5.findMethod(r6)     // Catch: java.lang.Throwable -> L25e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25e
            r5.<init>()     // Catch: java.lang.Throwable -> L25e
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L25e
        L236:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L25e
            if (r0 == 0) goto L260
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L25e
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L25e
            java.lang.ClassLoader r7 = r3.f10362b     // Catch: java.lang.Throwable -> L249
            java.lang.reflect.Method r0 = r0.r(r7)     // Catch: java.lang.Throwable -> L249
            goto L250
        L249:
            r0 = move-exception
            sf.f r7 = new sf.f     // Catch: java.lang.Throwable -> L25e
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L25e
            r0 = r7
        L250:
            boolean r7 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L25e
            if (r7 == 0) goto L256
            r0 = r4
        L256:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L25e
            if (r0 == 0) goto L236
            r5.add(r0)     // Catch: java.lang.Throwable -> L25e
            goto L236
        L25e:
            r0 = move-exception
            goto L289
        L260:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L25e
            r0.<init>()     // Catch: java.lang.Throwable -> L25e
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L25e
            r4.<init>()     // Catch: java.lang.Throwable -> L25e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L25e
        L26e:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L25e
            if (r6 == 0) goto L28e
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L25e
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L25e
            java.lang.String r7 = r7.toGenericString()     // Catch: java.lang.Throwable -> L25e
            boolean r7 = r0.add(r7)     // Catch: java.lang.Throwable -> L25e
            if (r7 == 0) goto L26e
            r4.add(r6)     // Catch: java.lang.Throwable -> L25e
            goto L26e
        L289:
            sf.f r4 = new sf.f
            r4.<init>(r0)
        L28e:
            java.lang.Throwable r0 = sf.g.b(r4)
            if (r0 == 0) goto L2ab
            p8.p r3 = r3.f10364d
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "定位朋友圈缓存查询入口失败: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r3.invoke(r0)
        L2ab:
            tf.t r0 = tf.t.f13167g
            boolean r3 = r4 instanceof sf.f
            if (r3 == 0) goto L2b2
            r4 = r0
        L2b2:
            r2.f4564g = r4
            return
        L2b5:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f182i
            ob.n r2 = (ob.n) r2
            java.lang.Object r3 = r1.f183j
            java.lang.String r3 = (java.lang.String) r3
            if (r0 == 0) goto L2d7
            boolean r4 = r0.isFinishing()
            if (r4 != 0) goto L2d7
            boolean r4 = r0.isDestroyed()
            if (r4 != 0) goto L2d7
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r3, r5)
            r0.show()
            goto L2e2
        L2d7:
            r8.g r0 = r2.f9737a
            android.content.Context r0 = r0.f11620a
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r3, r5)
            r0.show()
        L2e2:
            return
        L2e3:
            java.lang.Object r0 = r1.f181h
            gg.t r0 = (gg.t) r0
            java.lang.Object r2 = r1.f182i
            gg.u r2 = (gg.u) r2
            java.lang.Object r3 = r1.f183j
            gg.u r3 = (gg.u) r3
            long r4 = r0.f4563g
            r6 = 1
            long r4 = r4 + r6
            r0.f4563g = r4
            nb.f0.d(r2, r3)
            return
        L2fa:
            java.lang.Object r0 = r1.f181h
            nb.w r0 = (nb.w) r0
            java.lang.Object r3 = r1.f182i
            gg.u r3 = (gg.u) r3
            java.lang.Object r5 = r1.f183j
            nb.o r5 = (nb.o) r5
            java.lang.Runnable r6 = r0.f9335y
            java.lang.Object r3 = r3.f4564g
            if (r3 == 0) goto L338
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r6 != r3) goto L337
            nb.l r3 = r0.f9325o
            if (r3 != r5) goto L337
            boolean r3 = r0.f9328r
            if (r3 == 0) goto L319
            goto L337
        L319:
            r0.f9335y = r4
            java.lang.String r3 = "[Hchat:TextSpeech] 原语音播放完成回调超时，已跳过当前语音"
            fb.v0.m(r3)
            j8.p r3 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r3 == 0) goto L332
            j8.y r3 = r3.f6816b
            if (r3 == 0) goto L332
            j8.u r5 = new j8.u
            r5.<init>(r3, r2)
            r3.r(r5)
        L332:
            r0.f9325o = r4
            r0.n()
        L337:
            return
        L338:
            java.lang.String r0 = "runnable"
            gg.l.g(r0)
            throw r4
        L33e:
            java.lang.Object r0 = r1.f181h
            l3.l r0 = (l3.l) r0
            java.lang.Object r2 = r1.f182i
            a7.a r2 = (a7.a) r2
            java.lang.Object r3 = r1.f183j
            java.util.concurrent.ThreadPoolExecutor r3 = (java.util.concurrent.ThreadPoolExecutor) r3
            android.content.Context r0 = r0.f7805a     // Catch: java.lang.Throwable -> L367
            l3.s r0 = a.a.B(r0)     // Catch: java.lang.Throwable -> L367
            if (r0 == 0) goto L36c
            l3.h r4 = r0.f7820a     // Catch: java.lang.Throwable -> L367
            l3.r r4 = (l3.r) r4     // Catch: java.lang.Throwable -> L367
            java.lang.Object r5 = r4.f7814d     // Catch: java.lang.Throwable -> L367
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L367
            r4.f7816f = r3     // Catch: java.lang.Throwable -> L369
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L369
            l3.h r0 = r0.f7820a     // Catch: java.lang.Throwable -> L367
            l3.k r4 = new l3.k     // Catch: java.lang.Throwable -> L367
            r4.<init>(r2, r3)     // Catch: java.lang.Throwable -> L367
            r0.a(r4)     // Catch: java.lang.Throwable -> L367
            goto L37a
        L367:
            r0 = move-exception
            goto L374
        L369:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L369
            throw r0     // Catch: java.lang.Throwable -> L367
        L36c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L367
            java.lang.String r4 = "EmojiCompat font provider not available on this device."
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L367
            throw r0     // Catch: java.lang.Throwable -> L367
        L374:
            r2.D(r0)
            r3.shutdown()
        L37a:
            return
        L37b:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f183j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f182i
            k9.h r3 = (k9.h) r3
            boolean r4 = r0.isFinishing()
            if (r4 != 0) goto L3a4
            boolean r4 = r0.isDestroyed()
            if (r4 == 0) goto L394
            goto L3a4
        L394:
            wb.da r0 = r3.f7497c
            if (r2 == 0) goto L39e
            k9.f r3 = new k9.f
            r3.<init>(r2)
            goto L3a0
        L39e:
            k9.e r3 = k9.e.f7493b
        L3a0:
            r0.invoke(r3)
            goto L3a7
        L3a4:
            ig.a.m(r0, r2)
        L3a7:
            return
        L3a8:
            java.lang.Object r0 = r1.f181h
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r0 = r1.f182i
            r3 = r0
            k9.h r3 = (k9.h) r3
            java.lang.Object r0 = r1.f183j
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r5 = r3.f7496b     // Catch: java.lang.Throwable -> L3bd
            java.lang.String r0 = ig.a.Y(r2, r5, r0)     // Catch: java.lang.Throwable -> L3bd
            goto L3c4
        L3bd:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L3c4:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto L3ca
            goto L3cb
        L3ca:
            r4 = r0
        L3cb:
            java.lang.String r4 = (java.lang.String) r4
            ac.l r0 = new ac.l
            r5 = 19
            r0.<init>(r5, r2, r3, r4)
            r2.runOnUiThread(r0)
            return
        L3d8:
            java.lang.Object r0 = r1.f181h
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Object r2 = r1.f182i
            java.lang.Object r3 = r1.f183j
            ia.t r3 = (ia.t) r3
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3ed
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5}     // Catch: java.lang.Throwable -> L3ed
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r4, r2)     // Catch: java.lang.Throwable -> L3ed
            goto L3f4
        L3ed:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L3f4:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L3ff
            java.lang.String r2 = "收藏语音启动下载失败"
            r3.invoke(r2, r0)
        L3ff:
            return
        L400:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f182i
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r1.f183j
            ia.j r3 = (ia.j) r3
            boolean r4 = r0.isFinishing()
            if (r4 != 0) goto L428
            boolean r4 = r0.isDestroyed()
            if (r4 == 0) goto L419
            goto L428
        L419:
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L425
            java.lang.String r2 = "没有可选择的好友"
            ia.q.j(r0, r2)
            goto L428
        L425:
            r3.invoke(r2)
        L428:
            return
        L429:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f182i
            c9.u r2 = (c9.u) r2
            java.lang.Object r3 = r1.f183j
            java.util.List r3 = (java.util.List) r3
            boolean r4 = r0.isFinishing()
            if (r4 != 0) goto L444
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L444
            r2.invoke(r3)
        L444:
            return
        L445:
            java.lang.Object r0 = r1.f181h
            r2 = r0
            g9.d r2 = (g9.d) r2
            java.lang.Object r0 = r1.f182i
            r3 = r0
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r0 = r1.f183j
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = "表情保存失败"
            j8.p r6 = h.Hchat.hooks.api.core.WeChatApis.media()     // Catch: java.lang.Throwable -> L464
            if (r6 == 0) goto L466
            j8.f r6 = r6.f6818d     // Catch: java.lang.Throwable -> L464
            if (r6 == 0) goto L466
            byte[] r0 = r6.c(r0)     // Catch: java.lang.Throwable -> L464
            goto L467
        L464:
            r0 = move-exception
            goto L497
        L466:
            r0 = r4
        L467:
            if (r0 == 0) goto L48f
            int r6 = r0.length     // Catch: java.lang.Throwable -> L464
            if (r6 != 0) goto L46d
            goto L48f
        L46d:
            java.io.File r6 = r2.a(r0)     // Catch: java.lang.Throwable -> L464
            if (r6 == 0) goto L487
            boolean r0 = g9.d.f(r6, r0)     // Catch: java.lang.Throwable -> L464
            if (r0 != 0) goto L47f
            g9.b r0 = new g9.b     // Catch: java.lang.Throwable -> L464
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L464
            goto L49d
        L47f:
            g9.b r0 = new g9.b     // Catch: java.lang.Throwable -> L464
            java.lang.String r7 = ""
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L464
            goto L49d
        L487:
            g9.b r0 = new g9.b     // Catch: java.lang.Throwable -> L464
            java.lang.String r6 = "创建保存目录失败"
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L464
            goto L49d
        L48f:
            g9.b r0 = new g9.b     // Catch: java.lang.Throwable -> L464
            java.lang.String r6 = "表情文件不存在或尚未下载"
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L464
            goto L49d
        L497:
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L49d:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 != 0) goto L4a4
            goto L4b0
        L4a4:
            ab.b r0 = r2.f4398b
            java.lang.String r7 = "保存表情失败"
            r0.invoke(r7, r6)
            g9.b r0 = new g9.b
            r0.<init>(r4, r5)
        L4b0:
            g9.b r0 = (g9.b) r0
            java.io.File r4 = r0.f4391a
            if (r4 == 0) goto L4c1
            java.lang.String r0 = r4.getAbsolutePath()
            java.lang.String r4 = "表情已保存: "
            java.lang.String r0 = wb.en.g(r4, r0)
            goto L4cc
        L4c1:
            java.lang.String r0 = r0.f4392b
            boolean r4 = og.m.t0(r0)
            if (r4 == 0) goto L4ca
            goto L4cb
        L4ca:
            r5 = r0
        L4cb:
            r0 = r5
        L4cc:
            android.os.Handler r2 = r2.f4400d
            c9.t r4 = new c9.t
            r5 = 5
            r4.<init>(r3, r0, r5)
            r2.post(r4)
            return
        L4d8:
            java.lang.Object r0 = r1.f181h
            h.Hchat.hooks.items.script.ScriptPluginBridge r0 = (h.Hchat.hooks.items.script.ScriptPluginBridge) r0
            java.lang.Object r2 = r1.f182i
            h.Hchat.hooks.items.script.ScriptMessageBean r2 = (h.Hchat.hooks.items.script.ScriptMessageBean) r2
            java.lang.Object r3 = r1.f183j
            h.Hchat.hooks.items.script.ScriptPluginRuntime.k(r0, r2, r3)
            return
        L4e6:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f182i
            h.Hchat.hooks.items.script.ScriptPluginBridge r2 = (h.Hchat.hooks.items.script.ScriptPluginBridge) r2
            java.lang.Object r3 = r1.f183j
            fg.l r3 = (fg.l) r3
            h.Hchat.hooks.items.script.ScriptPluginBridge.b(r0, r2, r3)
            return
        L4f6:
            java.lang.Object r0 = r1.f181h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f182i
            e9.c r2 = (e9.c) r2
            java.lang.Object r3 = r1.f183j
            e9.l r3 = (e9.l) r3
            java.util.concurrent.atomic.AtomicBoolean r4 = e9.q.f2460a     // Catch: java.lang.Throwable -> L50a
            e9.q.z(r0, r2, r3)     // Catch: java.lang.Throwable -> L50a
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L50a
            goto L511
        L50a:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L511:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L520
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:CustomNotification] 转发微信原生通知失败: "
            eh.a.x(r3, r2, r0)
        L520:
            return
        L521:
            java.lang.Object r0 = r1.f181h
            r2 = r0
            cb.f r2 = (cb.f) r2
            java.lang.Object r0 = r1.f182i
            r3 = r0
            db.c r3 = (db.c) r3
            java.lang.Object r0 = r1.f183j
            r4 = r0
            android.os.PowerManager$WakeLock r4 = (android.os.PowerManager.WakeLock) r4
            sf.e r0 = r2.t(r3)     // Catch: java.lang.Throwable -> L535
            goto L53c
        L535:
            r0 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L577
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L577
            r0 = r6
        L53c:
            java.lang.Throwable r6 = sf.g.b(r0)     // Catch: java.lang.Throwable -> L577
            if (r6 != 0) goto L543
            goto L55e
        L543:
            java.lang.Object r0 = r2.f1623d     // Catch: java.lang.Throwable -> L577
            ab.b r0 = (ab.b) r0     // Catch: java.lang.Throwable -> L577
            java.lang.String r7 = "定时任务执行异常"
            r0.invoke(r7, r6)     // Catch: java.lang.Throwable -> L577
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L577
            int r5 = cb.f.b(r3)     // Catch: java.lang.Throwable -> L577
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L577
            sf.e r6 = new sf.e     // Catch: java.lang.Throwable -> L577
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> L577
            r0 = r6
        L55e:
            sf.e r0 = (sf.e) r0     // Catch: java.lang.Throwable -> L577
            java.lang.Object r5 = r0.f12418g     // Catch: java.lang.Throwable -> L577
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L577
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L577
            java.lang.Object r0 = r0.f12419h     // Catch: java.lang.Throwable -> L577
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L577
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L577
            r2.d(r3, r5, r0)     // Catch: java.lang.Throwable -> L577
            r2.q(r4)
            return
        L577:
            r0 = move-exception
            r2.q(r4)
            throw r0
        L57c:
            java.lang.Object r0 = r1.f181h
            d8.b r0 = (d8.b) r0
            java.lang.Object r2 = r1.f182i
            android.app.Application r2 = (android.app.Application) r2
            java.lang.Object r3 = r1.f183j
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r3
            h.Hchat.ModuleEntry r0 = r0.f2079c
            h.Hchat.ModuleEntry.f(r0, r2, r3)
            return
        L58e:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f182i
            ca.e0 r2 = (ca.e0) r2
            java.lang.Object r3 = r1.f183j
            android.content.Intent r3 = (android.content.Intent) r3
            boolean r4 = r0.isFinishing()
            if (r4 != 0) goto L5a9
            boolean r4 = r0.isDestroyed()
            if (r4 != 0) goto L5a9
            r2.q(r0, r3)
        L5a9:
            return
        L5aa:
            java.lang.Object r0 = r1.f181h
            r6 = r0
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r0 = r1.f182i
            ca.e0 r0 = (ca.e0) r0
            java.lang.Object r2 = r1.f183j
            hb.t r2 = (hb.t) r2
            boolean r3 = r6.isFinishing()
            if (r3 != 0) goto L607
            boolean r3 = r6.isDestroyed()
            if (r3 != 0) goto L607
            r0.getClass()
            java.lang.String r7 = "转发[H]"
            java.lang.String r8 = ""
            java.lang.String r3 = "转发到朋友圈"
            java.lang.String r4 = ""
            sf.e r9 = new sf.e
            r9.<init>(r3, r4)
            java.lang.String r3 = "转发给好友"
            sf.e r10 = new sf.e
            r10.<init>(r3, r4)
            java.lang.String r3 = "分享"
            sf.e r11 = new sf.e
            r11.<init>(r3, r4)
            java.lang.String r3 = "群发助手"
            sf.e r12 = new sf.e
            r12.<init>(r3, r4)
            java.lang.String r3 = "转发至标签"
            sf.e r13 = new sf.e
            r13.<init>(r3, r4)
            sf.e[] r3 = new sf.e[]{r9, r10, r11, r12, r13}
            java.util.List r9 = a.a.y0(r3)
            ca.h r10 = new ca.h
            r10.<init>(r0, r6, r2, r5)
            bi.c r11 = new bi.c
            r0 = 7
            r11.<init>(r0)
            wb.lv r12 = wb.lv.f17583j
            wb.y2.Q1(r6, r7, r8, r9, r10, r11, r12)
        L607:
            return
        L608:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f182i
            java.lang.Object r6 = r1.f183j
            java.lang.String r6 = (java.lang.String) r6
            java.util.List r7 = c9.o2.i(r0)
            java.util.Iterator r7 = r7.iterator()
        L61a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L634
            java.lang.Object r8 = r7.next()
            r9 = r8
            c9.a r9 = (c9.a) r9
            java.lang.String r9 = r9.f1081a
            java.lang.String r9 = c9.d2.F(r9)
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L61a
            r4 = r8
        L634:
            c9.a r4 = (c9.a) r4
            if (r4 == 0) goto L640
            c9.d2 r2 = c9.d2.f1137a
            java.lang.String r2 = r4.f1081a
            c9.d2.h(r0, r2)
            goto L692
        L640:
            c9.d2 r0 = c9.d2.f1137a
            java.lang.String r0 = "ui"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r2, r0)
            if (r0 == 0) goto L66d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r4 = "finish_direct"
            r2.putBoolean(r4, r5)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r7 = "startChatting"
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            java.lang.Object[] r9 = new java.lang.Object[]{r6, r2, r8}
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r4, r7, r9)
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r2, r8}
            boolean r0 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r4, r0, r2)
            goto L66e
        L66d:
            r0 = r5
        L66e:
            if (r0 != 0) goto L692
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversations()
            if (r0 == 0) goto L67f
            boolean r0 = r0.h(r6)
            if (r0 != r3) goto L67d
            goto L67e
        L67d:
            r3 = r5
        L67e:
            r5 = r3
        L67f:
            if (r5 != 0) goto L692
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:ConversationGroup] 打开分组内会话失败: talker="
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            fb.v0.m(r0)
        L692:
            return
        L693:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f183j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f182i
            fg.a r3 = (fg.a) r3
            c9.j1 r4 = c9.j1.f1228a
            c9.j1.v(r0, r2, r3)
            return
        L6a5:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f183j
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.f182i
            aa.c r3 = (aa.c) r3
            android.os.Handler r4 = c9.b0.f1104a
            c9.b0.g(r0, r2, r3)
            return
        L6b7:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f182i
            c9.d r2 = (c9.d) r2
            java.lang.Object r3 = r1.f183j
            android.net.Uri r3 = (android.net.Uri) r3
            c9.e r4 = c9.e.f1154a
            c9.o2 r4 = r2.f1126b     // Catch: java.lang.Throwable -> L6f2
            boolean r6 = r4 instanceof c9.b     // Catch: java.lang.Throwable -> L6f2
            if (r6 == 0) goto L704
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L6f2
            java.lang.String r6 = "wt"
            java.io.OutputStream r3 = r0.openOutputStream(r3, r6)     // Catch: java.lang.Throwable -> L6f2
            if (r3 == 0) goto L6fc
            c9.b r4 = (c9.b) r4     // Catch: java.lang.Throwable -> L6f4
            java.lang.String r0 = r4.f1103b     // Catch: java.lang.Throwable -> L6f4
            java.nio.charset.Charset r4 = og.a.f9804a     // Catch: java.lang.Throwable -> L6f4
            byte[] r0 = r0.getBytes(r4)     // Catch: java.lang.Throwable -> L6f4
            r0.getClass()     // Catch: java.lang.Throwable -> L6f4
            r3.write(r0)     // Catch: java.lang.Throwable -> L6f4
            r3.close()     // Catch: java.lang.Throwable -> L6f2
            c9.p2 r0 = new c9.p2     // Catch: java.lang.Throwable -> L6f2
            java.lang.String r3 = "聊天分组已导出"
            r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> L6f2
            goto L72a
        L6f2:
            r0 = move-exception
            goto L724
        L6f4:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L6f7
        L6f7:
            r0 = move-exception
            ig.a.i(r3, r4)     // Catch: java.lang.Throwable -> L6f2
            throw r0     // Catch: java.lang.Throwable -> L6f2
        L6fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6f2
            java.lang.String r3 = "无法写入所选文件"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L6f2
            throw r0     // Catch: java.lang.Throwable -> L6f2
        L704:
            c9.c r6 = c9.c.f1110b     // Catch: java.lang.Throwable -> L6f2
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L6f2
            if (r4 == 0) goto L71e
            java.lang.String r3 = c9.e.c(r0, r3)     // Catch: java.lang.Throwable -> L6f2
            c9.f2 r0 = c9.o2.h(r0, r3)     // Catch: java.lang.Throwable -> L6f2
            c9.p2 r3 = new c9.p2     // Catch: java.lang.Throwable -> L6f2
            java.lang.String r4 = r0.f1193c     // Catch: java.lang.Throwable -> L6f2
            boolean r0 = r0.f1191a     // Catch: java.lang.Throwable -> L6f2
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L6f2
            goto L729
        L71e:
            af.d r0 = new af.d     // Catch: java.lang.Throwable -> L6f2
            r0.<init>()     // Catch: java.lang.Throwable -> L6f2
            throw r0     // Catch: java.lang.Throwable -> L6f2
        L724:
            sf.f r3 = new sf.f
            r3.<init>(r0)
        L729:
            r0 = r3
        L72a:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 != 0) goto L731
            goto L754
        L731:
            java.lang.String r0 = r3.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "[Hchat:ConversationGroup] 处理聊天分组文件失败: "
            r4.<init>(r6)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            fb.v0.n(r0, r3)
            c9.p2 r0 = new c9.p2
            java.lang.String r3 = r3.getMessage()
            if (r3 == 0) goto L74f
            goto L751
        L74f:
            java.lang.String r3 = "处理聊天分组文件失败"
        L751:
            r0.<init>(r3, r5)
        L754:
            c9.p2 r0 = (c9.p2) r0
            r2.a(r0)
            return
        L75a:
            java.lang.Object r0 = r1.f181h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f182i
            c9.d r2 = (c9.d) r2
            java.lang.Object r3 = r1.f183j
            c9.p2 r3 = (c9.p2) r3
            boolean r4 = r0.isFinishing()
            if (r4 != 0) goto L777
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L777
            fg.l r0 = r2.f1127c
            r0.invoke(r3)
        L777:
            return
        L778:
            java.lang.Object r0 = r1.f181h
            b0.h r0 = (b0.h) r0
            java.lang.Object r2 = r1.f182i
            b0.e r2 = (b0.e) r2
            java.lang.Object r4 = r1.f183j
            b0.f r4 = (b0.f) r4
            android.view.View r5 = r0.f367a
            b0.x r6 = new b0.x
            r6.<init>(r2)
            android.view.ActionMode r2 = r5.startActionMode(r6, r3)
            android.view.ActionMode r0 = r0.f374h
            gg.l.a(r0, r2)
            if (r2 != 0) goto L799
            r4.close()
        L799:
            return
        L79a:
            java.lang.Object r0 = r1.f181h
            ac.o r0 = (ac.o) r0
            java.lang.Object r2 = r1.f182i
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r2 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r2
            java.lang.Object r3 = r1.f183j
            java.lang.String r3 = (java.lang.String) r3
            r2.onSharedPreferenceChanged(r0, r3)
            return
    }
}
