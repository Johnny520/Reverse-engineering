package rb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11896i;

    public /* synthetic */ g(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f11894g = r2
            r0.f11895h = r1
            r0.f11896i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ g(java.util.List r1, wb.ep r2, wb.dp r3) {
            r0 = this;
            r2 = 13
            r0.f11894g = r2
            r0.<init>()
            r0.f11895h = r1
            r0.f11896i = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r41 = this;
            r1 = r41
            int r0 = r1.f11894g
            r3 = 0
            r5 = 1
            r6 = 0
            r7 = 0
            switch(r0) {
                case 0: goto L7f9;
                case 1: goto L7e3;
                case 2: goto L7ac;
                case 3: goto L797;
                case 4: goto L769;
                case 5: goto L37e;
                case 6: goto L372;
                case 7: goto L364;
                case 8: goto L358;
                case 9: goto L34a;
                case 10: goto L339;
                case 11: goto L321;
                case 12: goto L308;
                case 13: goto L1aa;
                case 14: goto L19c;
                case 15: goto L183;
                case 16: goto L175;
                case 17: goto L146;
                case 18: goto L12f;
                case 19: goto Lc5;
                case 20: goto Lb3;
                case 21: goto L58;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r1.f11895h
            y9.e r0 = (y9.e) r0
            java.lang.Object r2 = r1.f11896i
            y9.d r2 = (y9.d) r2
            java.util.Map r3 = r0.f22336e
            r3.getClass()
            monitor-enter(r3)
            java.util.Map r4 = r0.f22336e     // Catch: java.lang.Throwable -> L55
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L55
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L55
            java.util.List r4 = tf.m.P1(r4)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r3)
            java.util.Iterator r3 = r4.iterator()
        L2b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L54
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.Object r4 = r4.getValue()
            y9.d r4 = (y9.d) r4
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L2b
            r5.getClass()
            java.lang.String r4 = r2.f22330a
            java.lang.String r6 = r2.f22331b
            r0.a(r5, r4, r6)
            goto L2b
        L54:
            return
        L55:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L58:
            java.lang.Object r0 = r1.f11895h
            y9.e r0 = (y9.e) r0
            java.lang.Object r2 = r1.f11896i
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r3 = r0.f22336e
            r3.getClass()
            monitor-enter(r3)
            java.util.Map r4 = r0.f22336e     // Catch: java.lang.Throwable -> Lb0
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> Lb0
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> Lb0
            java.util.Set r4 = tf.m.U1(r4)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r3)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            dg.n r3 = new dg.n
            r6 = 6
            r3.<init>(r4, r6)
            ca.s r4 = new ca.s
            r6 = 23
            r4.<init>(r2, r6)
            ng.i r2 = new ng.i
            r2.<init>(r3, r5, r4)
            java.util.List r2 = ng.m.b0(r2)
            java.util.Iterator r2 = r2.iterator()
        L8f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r2.next()
            y9.d r3 = (y9.d) r3
            r3.getClass()
            o8.j r4 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r4 == 0) goto L8f
            rb.g r5 = new rb.g
            r6 = 22
            r5.<init>(r0, r6, r3)
            r4.e(r5)
            goto L8f
        Laf:
            return
        Lb0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Lb3:
            java.lang.Object r0 = r1.f11895h
            y1.x2 r0 = (y1.x2) r0
            java.lang.Object r2 = r1.f11896i
            androidx.lifecycle.s r2 = (androidx.lifecycle.s) r2
            boolean r3 = r0.f22158i
            if (r3 != 0) goto Lc4
            r0.f22159j = r2
            r2.a(r0)
        Lc4:
            return
        Lc5:
            java.lang.Object r0 = r1.f11895h
            x8.k r0 = (x8.k) r0
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f21297k
            java.lang.Object r5 = r1.f11896i
            x8.k r5 = (x8.k) r5
        Lcf:
            java.util.concurrent.atomic.AtomicBoolean r8 = r0.f21295i     // Catch: java.lang.Throwable -> Lf7
            boolean r8 = r8.get()     // Catch: java.lang.Throwable -> Lf7
            if (r8 != 0) goto L110
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf7
            java.util.concurrent.atomic.AtomicLong r10 = r0.f21298l     // Catch: java.lang.Throwable -> Lf7
            long r10 = r10.get()     // Catch: java.lang.Throwable -> Lf7
            long r8 = r8 - r10
            long r10 = r0.f21291e     // Catch: java.lang.Throwable -> Lf7
            long r10 = r10 - r8
            int r8 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r8 > 0) goto L105
            java.util.concurrent.atomic.AtomicReference r3 = x8.q.f21337i     // Catch: java.lang.Throwable -> Lf7
        Leb:
            boolean r4 = r3.compareAndSet(r5, r6)     // Catch: java.lang.Throwable -> Lf7
            if (r4 == 0) goto Lf9
            java.lang.String r3 = "idle timeout"
            r0.b(r3)     // Catch: java.lang.Throwable -> Lf7
            goto L110
        Lf7:
            r0 = move-exception
            goto L113
        Lf9:
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> Lf7
            if (r4 == r5) goto Leb
            java.lang.String r3 = "idle replaced"
            r0.b(r3)     // Catch: java.lang.Throwable -> Lf7
            goto L110
        L105:
            r8 = 1000(0x3e8, double:4.94E-321)
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 >= 0) goto L10c
            r10 = r8
        L10c:
            java.lang.Thread.sleep(r10)     // Catch: java.lang.Throwable -> Lf7
            goto Lcf
        L110:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> Lf7
            goto L119
        L113:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L119:
            r2.set(r7)
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L12e
            r2.set(r7)
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:AutoReply] 小智MCP空闲检查失败: "
            eh.a.x(r3, r2, r0)
        L12e:
            return
        L12f:
            java.lang.Object r0 = r1.f11895h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f11896i
            wb.st r2 = (wb.st) r2
            fb.i2 r2 = r2.f19138b
            java.util.concurrent.ConcurrentHashMap r3 = fb.t2.f3808a
            r2.getClass()
            java.io.File r0 = fb.t2.g(r0, r2)     // Catch: java.lang.Throwable -> L145
            fb.t2.q(r0)     // Catch: java.lang.Throwable -> L145
        L145:
            return
        L146:
            java.lang.Object r0 = r1.f11895h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f11896i
            fb.j2 r2 = (fb.j2) r2
            java.util.concurrent.ConcurrentHashMap r3 = fb.t2.f3808a     // Catch: java.lang.Throwable -> L162
            r0.getClass()     // Catch: java.lang.Throwable -> L162
            r2.getClass()     // Catch: java.lang.Throwable -> L162
            java.lang.String r2 = r2.f3590a     // Catch: java.lang.Throwable -> L15f
            java.io.File r0 = fb.t2.i(r0, r2)     // Catch: java.lang.Throwable -> L15f
            fb.t2.q(r0)     // Catch: java.lang.Throwable -> L15f
        L15f:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L162
            goto L169
        L162:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L169:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L174
            java.lang.String r2 = "[Hchat:ScriptAgent] 清理恢复工作区失败"
            fb.v0.n(r2, r0)
        L174:
            return
        L175:
            java.lang.Object r0 = r1.f11895h
            wb.gr r0 = (wb.gr) r0
            java.lang.Object r2 = r1.f11896i
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            wb.ns r0 = r0.f16453c
            r0.invoke(r2)
            return
        L183:
            java.lang.Object r0 = r1.f11895h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f11896i
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L192
            goto L194
        L192:
            java.lang.String r2 = "读取附件失败"
        L194:
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r7)
            r0.show()
            return
        L19c:
            java.lang.Object r0 = r1.f11895h
            wb.dp r0 = (wb.dp) r0
            java.lang.Object r2 = r1.f11896i
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            wb.kp r0 = r0.f15770b
            r0.invoke(r2)
            return
        L1aa:
            java.lang.Object r0 = r1.f11895h
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r1.f11896i
            wb.dp r2 = (wb.dp) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r8 = r0.iterator()
        L1bb:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L2bb
            java.lang.Object r0 = r8.next()
            android.net.Uri r0 = (android.net.Uri) r0
            android.app.Activity r9 = r2.f15769a
            wb.ep r10 = wb.ep.f16002a
            java.lang.String r10 = wb.ho.C6(r9, r0)     // Catch: java.lang.Throwable -> L1e7
            r11 = 47
            if (r10 == 0) goto L1ec
            java.lang.String r10 = og.m.L0(r10, r11, r10)     // Catch: java.lang.Throwable -> L1e7
            r12 = 92
            java.lang.String r10 = og.m.L0(r10, r12, r10)     // Catch: java.lang.Throwable -> L1e7
            boolean r12 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L1e7
            if (r12 == 0) goto L1e4
            r10 = r6
        L1e4:
            if (r10 == 0) goto L1ec
            goto L1fc
        L1e7:
            r0 = move-exception
            r16 = r3
            goto L28f
        L1ec:
            java.lang.String r10 = r0.getLastPathSegment()     // Catch: java.lang.Throwable -> L1e7
            if (r10 == 0) goto L1f7
            java.lang.String r10 = og.m.L0(r10, r11, r10)     // Catch: java.lang.Throwable -> L1e7
            goto L1f8
        L1f7:
            r10 = r6
        L1f8:
            if (r10 != 0) goto L1fc
            java.lang.String r10 = ""
        L1fc:
            boolean r11 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L1e7
            if (r11 != 0) goto L285
            java.io.ByteArrayOutputStream r11 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L1e7
            r11.<init>()     // Catch: java.lang.Throwable -> L1e7
            android.content.ContentResolver r12 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L233
            java.io.InputStream r12 = r12.openInputStream(r0)     // Catch: java.lang.Throwable -> L233
            if (r12 == 0) goto L273
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L267
            r13 = r3
        L217:
            int r15 = r12.read(r0)     // Catch: java.lang.Throwable -> L267
            if (r15 >= 0) goto L238
            r12.close()     // Catch: java.lang.Throwable -> L233
            byte[] r0 = r11.toByteArray()     // Catch: java.lang.Throwable -> L233
            r11.close()     // Catch: java.lang.Throwable -> L1e7
            java.util.Set r11 = gb.k.f4440a     // Catch: java.lang.Throwable -> L1e7
            r0.getClass()     // Catch: java.lang.Throwable -> L1e7
            gb.g r0 = gb.k.c(r10, r0)     // Catch: java.lang.Throwable -> L1e7
            r16 = r3
            goto L295
        L233:
            r0 = move-exception
            r16 = r3
        L236:
            r3 = r0
            goto L27d
        L238:
            r16 = r3
            long r3 = (long) r15
            long r13 = r13 + r3
            r3 = 16777216(0x1000000, double:8.289046E-317)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 > 0) goto L24c
            r11.write(r0, r7, r15)     // Catch: java.lang.Throwable -> L249
            r3 = r16
            goto L217
        L249:
            r0 = move-exception
        L24a:
            r3 = r0
            goto L26b
        L24c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L249
            r0.<init>()     // Catch: java.lang.Throwable -> L249
            r0.append(r10)     // Catch: java.lang.Throwable -> L249
            java.lang.String r3 = " 超过 16384 KiB"
            r0.append(r3)     // Catch: java.lang.Throwable -> L249
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L249
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L249
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L249
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L249
            throw r3     // Catch: java.lang.Throwable -> L249
        L267:
            r0 = move-exception
            r16 = r3
            goto L24a
        L26b:
            throw r3     // Catch: java.lang.Throwable -> L26c
        L26c:
            r0 = move-exception
            ig.a.i(r12, r3)     // Catch: java.lang.Throwable -> L271
            throw r0     // Catch: java.lang.Throwable -> L271
        L271:
            r0 = move-exception
            goto L236
        L273:
            r16 = r3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L271
            java.lang.String r3 = "无法打开所选文件"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L271
            throw r0     // Catch: java.lang.Throwable -> L271
        L27d:
            throw r3     // Catch: java.lang.Throwable -> L27e
        L27e:
            r0 = move-exception
            ig.a.i(r11, r3)     // Catch: java.lang.Throwable -> L283
            throw r0     // Catch: java.lang.Throwable -> L283
        L283:
            r0 = move-exception
            goto L28f
        L285:
            r16 = r3
            java.lang.String r0 = "无法读取所选文件名"
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L283
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L283
            throw r3     // Catch: java.lang.Throwable -> L283
        L28f:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L295:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 != 0) goto L29c
            goto L2b0
        L29c:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            rb.g r4 = new rb.g
            r10 = 12
            r4.<init>(r9, r10, r3)
            r0.post(r4)
            r0 = r6
        L2b0:
            gb.g r0 = (gb.g) r0
            if (r0 == 0) goto L2b7
            r5.add(r0)
        L2b7:
            r3 = r16
            goto L1bb
        L2bb:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r5.iterator()
        L2c9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2ee
            java.lang.Object r5 = r4.next()
            r6 = r5
            gb.g r6 = (gb.g) r6
            java.lang.String r6 = r6.f4422a
            java.util.Locale r7 = java.util.Locale.ROOT
            r7.getClass()
            java.lang.String r6 = r6.toLowerCase(r7)
            r6.getClass()
            boolean r6 = r0.add(r6)
            if (r6 == 0) goto L2c9
            r3.add(r5)
            goto L2c9
        L2ee:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L307
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            rb.g r4 = new rb.g
            r5 = 14
            r4.<init>(r2, r5, r3)
            r0.post(r4)
        L307:
            return
        L308:
            java.lang.Object r0 = r1.f11895h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f11896i
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r2 = r2.getMessage()
            if (r2 == 0) goto L317
            goto L319
        L317:
            java.lang.String r2 = "读取附加文件失败"
        L319:
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r7)
            r0.show()
            return
        L321:
            java.lang.Object r0 = r1.f11895h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r2 = r1.f11896i
            hb.e0 r2 = (hb.e0) r2
            boolean r3 = r0.isFinishing()
            if (r3 != 0) goto L338
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L338
            r2.invoke()
        L338:
            return
        L339:
            java.lang.Object r0 = r1.f11895h
            wb.la r0 = (wb.la) r0
            java.lang.Object r2 = r1.f11896i
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            wb.j5 r3 = new wb.j5
            r3.<init>()
            r0.invoke(r3, r2)
            return
        L34a:
            java.lang.Object r0 = r1.f11895h
            wb.la r0 = (wb.la) r0
            java.lang.Object r2 = r1.f11896i
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            tf.t r3 = tf.t.f13167g
            r0.invoke(r3, r2)
            return
        L358:
            java.lang.Object r0 = r1.f11895h
            wb.la r0 = (wb.la) r0
            java.lang.Object r2 = r1.f11896i
            java.util.List r2 = (java.util.List) r2
            r0.invoke(r2, r6)
            return
        L364:
            java.lang.Object r0 = r1.f11895h
            fg.p r0 = (fg.p) r0
            java.lang.Object r2 = r1.f11896i
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            tf.t r3 = tf.t.f13167g
            r0.invoke(r3, r2)
            return
        L372:
            java.lang.Object r0 = r1.f11895h
            fg.p r0 = (fg.p) r0
            java.lang.Object r2 = r1.f11896i
            java.util.List r2 = (java.util.List) r2
            r0.invoke(r2, r6)
            return
        L37e:
            r16 = r3
            java.lang.Object r0 = r1.f11895h
            v8.q r0 = (v8.q) r0
            java.lang.Object r3 = r1.f11896i
            k8.o r3 = (k8.o) r3
            boolean r4 = r3.f7452i
            r8 = 10002(0x2712, float:1.4016E-41)
            r9 = 10000(0x2710, float:1.4013E-41)
            if (r4 == 0) goto L4b6
            java.util.concurrent.ConcurrentLinkedDeque r4 = r0.f14280g
            long r11 = java.lang.System.currentTimeMillis()
            h.Hchat.hooks.api.model.WeChatMessage r13 = r3.f7454k
            java.lang.String r14 = r3.f7446c
            int r13 = r13.type
            if (r13 > 0) goto L3a2
            r18 = 65535(0xffff, float:9.1834E-41)
            goto L3b9
        L3a2:
            r15 = r13 & 255(0xff, float:3.57E-43)
            r18 = 65535(0xffff, float:9.1834E-41)
            r10 = r13 & r18
            int r19 = r13 >>> 16
            if (r19 != 0) goto L3ae
            goto L3b9
        L3ae:
            if (r10 == r9) goto L3b8
            if (r10 == r8) goto L3b8
            if (r15 == 0) goto L3b9
            if (r10 != r15) goto L3b9
            r13 = r15
            goto L3b9
        L3b8:
            r13 = r10
        L3b9:
            java.util.Iterator r10 = r4.iterator()
            r10.getClass()
        L3c0:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L4b1
            java.lang.Object r15 = r10.next()
            v8.g r15 = (v8.g) r15
            long r5 = r15.f14241e
            java.lang.String r2 = r15.f14239c
            long r5 = r11 - r5
            r21 = 10000(0x2710, double:4.9407E-320)
            int r5 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r5 <= 0) goto L3de
            r4.remove(r15)
            r5 = 1
            r6 = 0
            goto L3c0
        L3de:
            java.lang.String r5 = r15.f14237a
            boolean r5 = gg.l.a(r5, r14)
            if (r5 == 0) goto L4a8
            int r5 = r15.f14238b
            if (r5 != r13) goto L4a8
            r0.m(r15)
            h.Hchat.hooks.api.model.WeChatMessage r5 = r3.f7453j
            if (r5 == 0) goto L3f2
            goto L3f4
        L3f2:
            h.Hchat.hooks.api.model.WeChatMessage r5 = r3.f7454k
        L3f4:
            long r8 = r5.msgSvrId
            java.lang.Long r22 = java.lang.Long.valueOf(r8)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L3ff
            goto L401
        L3ff:
            r22 = 0
        L401:
            if (r22 == 0) goto L412
            long r8 = r22.longValue()
            k8.s r6 = h.Hchat.hooks.api.core.WeChatApis.messageStore()
            if (r6 == 0) goto L412
            h.Hchat.hooks.api.model.WeChatMessage r6 = r6.e(r8, r14)
            goto L413
        L412:
            r6 = 0
        L413:
            h.Hchat.hooks.api.model.WeChatMessage[] r6 = new h.Hchat.hooks.api.model.WeChatMessage[]{r5, r6}
            ng.j r6 = tf.l.k0(r6)
            i2.z r8 = new i2.z
            r9 = 29
            r8.<init>(r9)
            ng.i r9 = new ng.i
            r9.<init>(r6, r7, r8)
            ng.h r6 = new ng.h
            r6.<init>(r9)
        L42c:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L466
            java.lang.Object r8 = r6.next()
            h.Hchat.hooks.api.model.WeChatMessage r8 = (h.Hchat.hooks.api.model.WeChatMessage) r8
            r9 = r5
            r23 = r6
            long r5 = r8.msgId
            int r24 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r24 <= 0) goto L44d
            java.util.concurrent.ConcurrentHashMap$KeySetView r7 = r15.f14242f
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            boolean r5 = r7.contains(r5)
            if (r5 != 0) goto L45f
        L44d:
            long r5 = r8.msgSvrId
            int r7 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r7 <= 0) goto L461
            java.util.concurrent.ConcurrentHashMap$KeySetView r7 = r15.f14243g
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            boolean r5 = r7.contains(r5)
            if (r5 == 0) goto L461
        L45f:
            r5 = 1
            goto L468
        L461:
            r5 = r9
            r6 = r23
            r7 = 0
            goto L42c
        L466:
            r9 = r5
            r5 = 0
        L468:
            java.lang.String r6 = r3.f7444a
            java.lang.String r7 = "local_send"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L49e
            boolean r6 = og.m.t0(r2)
            if (r6 != 0) goto L49e
            java.lang.String r6 = r3.f7448e
            java.lang.String r7 = r9.bodyContent()
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}
            ng.j r6 = tf.l.k0(r6)
            java.util.Iterator r6 = r6.iterator()
        L48a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L49e
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = gg.l.a(r7, r2)
            if (r7 == 0) goto L48a
            r2 = 1
            goto L49f
        L49e:
            r2 = 0
        L49f:
            if (r5 != 0) goto L4a3
            if (r2 == 0) goto L4a8
        L4a3:
            boolean r2 = r4.remove(r15)
            goto L4b2
        L4a8:
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 10002(0x2712, float:1.4016E-41)
            r9 = 10000(0x2710, float:1.4013E-41)
            goto L3c0
        L4b1:
            r2 = 0
        L4b2:
            if (r2 == 0) goto L4b9
            goto L765
        L4b6:
            r18 = 65535(0xffff, float:9.1834E-41)
        L4b9:
            v8.r r2 = v8.r.f14282a
            android.content.Context r2 = r0.f14275b
            boolean r2 = v8.r.a(r2)
            if (r2 != 0) goto L4c5
            goto L765
        L4c5:
            java.util.LinkedHashSet r2 = v8.r.f14283b
            java.lang.String r4 = r3.f7445b
            boolean r4 = r2.contains(r4)
            if (r4 != 0) goto L4fd
            h.Hchat.hooks.api.model.WeChatMessage r4 = r3.f7454k
            int r4 = r4.type
            if (r4 > 0) goto L4d6
            goto L4ee
        L4d6:
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = r4 & r18
            int r7 = r4 >>> 16
            if (r7 != 0) goto L4df
            goto L4ee
        L4df:
            r7 = 10000(0x2710, float:1.4013E-41)
            if (r6 == r7) goto L4ed
            r7 = 10002(0x2712, float:1.4016E-41)
            if (r6 == r7) goto L4ed
            if (r5 == 0) goto L4ee
            if (r6 != r5) goto L4ee
            r4 = r5
            goto L4ee
        L4ed:
            r4 = r6
        L4ee:
            r5 = 62
            if (r4 != r5) goto L4fb
            java.lang.String r4 = "video_number_video"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L4fb
            goto L4fd
        L4fb:
            r2 = 0
            goto L4fe
        L4fd:
            r2 = 1
        L4fe:
            if (r2 != 0) goto L502
            goto L765
        L502:
            java.lang.String r2 = r3.f7448e
            java.lang.String r4 = r3.f7449f
            h.Hchat.hooks.api.model.WeChatMessage r5 = r3.f7454k
            java.lang.String r5 = r5.bodyContent()
            java.lang.String[] r2 = new java.lang.String[]{r2, r4, r5}
            java.util.List r2 = a.a.y0(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L51d:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L537
            java.lang.Object r5 = r2.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r6.getClass()
            boolean r6 = og.m.t0(r6)
            if (r6 != 0) goto L51d
            r4.add(r5)
            goto L51d
        L537:
            java.util.Set r2 = tf.m.T1(r4)
            java.util.List r4 = tf.m.P1(r2)
            java.lang.String r5 = "\n"
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            java.lang.String r35 = tf.m.A1(r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = r3.f7447d
            boolean r4 = og.m.t0(r2)
            if (r4 == 0) goto L556
            java.lang.String r2 = r3.c()
        L556:
            java.lang.String r31 = p.a.l(r2, r2)
            long r4 = java.lang.System.currentTimeMillis()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            v8.r r6 = v8.r.f14282a
            android.content.Context r6 = r0.f14275b
            java.util.List r6 = v8.r.b(r6)
            java.util.Iterator r6 = r6.iterator()
        L56f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L605
            java.lang.Object r7 = r6.next()
            r25 = r7
            v8.a r25 = (v8.a) r25
            java.lang.String r7 = r3.f7446c
            r7.getClass()
            java.lang.String r8 = r3.f7445b
            r8.getClass()
            h.Hchat.hooks.api.model.WeChatMessage r9 = r3.f7454k
            int r9 = r9.type
            boolean r10 = r3.f7452i
            r26 = r7
            r27 = r8
            r28 = r9
            r30 = r10
            r29 = r35
            boolean r7 = v8.q.n(r25, r26, r27, r28, r29, r30, r31)
            r8 = r25
            if (r7 != 0) goto L5a0
            goto L56f
        L5a0:
            java.util.Set r7 = r8.f14207g
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L5a8:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L56f
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = og.m.t0(r9)
            if (r10 != 0) goto L5a8
            java.lang.String r10 = r3.f7446c
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L5a8
            boolean r10 = r8.f14209i
            if (r10 == 0) goto L5d5
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            long r11 = r8.f14210j
            int r13 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r13 >= 0) goto L5d0
            r11 = r16
        L5d0:
            long r10 = r10.toMillis(r11)
            goto L5d7
        L5d5:
            r10 = r16
        L5d7:
            java.lang.Object r12 = r2.get(r9)
            if (r12 != 0) goto L5e5
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            r2.put(r9, r12)
        L5e5:
            java.util.Map r12 = (java.util.Map) r12
            java.lang.String r9 = r8.f14201a
            int r13 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r13 > 0) goto L5ef
            r13 = r4
            goto L5fd
        L5ef:
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r18 = r13 - r10
            int r15 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r15 <= 0) goto L5fb
            goto L5fd
        L5fb:
            long r13 = r4 + r10
        L5fd:
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r12.put(r9, r10)
            goto L5a8
        L605:
            java.util.Set r6 = r2.keySet()
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            c9.a0 r7 = new c9.a0
            r8 = 28
            r7.<init>(r2, r8)
            java.util.List r6 = tf.m.K1(r6, r7)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L621
            goto L765
        L621:
            java.lang.String r7 = ":"
            h.Hchat.hooks.api.model.WeChatMessage r8 = r3.f7454k
            long r9 = r8.msgSvrId
            int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r11 <= 0) goto L632
            java.lang.String r7 = "svr:"
        L62d:
            java.lang.String r7 = bc.e.g(r9, r7)
            goto L65d
        L632:
            long r9 = r8.msgId
            int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r11 <= 0) goto L63b
            java.lang.String r7 = "local:"
            goto L62d
        L63b:
            java.lang.String r9 = r3.f7446c
            long r10 = r8.createTime
            int r8 = r8.type
            java.lang.String r12 = r3.f7448e
            int r12 = r12.hashCode()
            java.lang.String r13 = "event:"
            java.lang.StringBuilder r9 = eh.a.v(r13, r9, r7, r10)
            r9.append(r7)
            r9.append(r8)
            r9.append(r7)
            r9.append(r12)
            java.lang.String r7 = r9.toString()
        L65d:
            java.util.LinkedHashMap r8 = r0.f14277d
            monitor-enter(r8)
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L766
            java.util.LinkedHashMap r11 = r0.f14277d     // Catch: java.lang.Throwable -> L766
            java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> L766
            r11.getClass()     // Catch: java.lang.Throwable -> L766
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L766
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L766
        L673:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L766
            if (r12 == 0) goto L6a3
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L766
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch: java.lang.Throwable -> L766
            r12.getClass()     // Catch: java.lang.Throwable -> L766
            java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Throwable -> L766
            r12.getClass()     // Catch: java.lang.Throwable -> L766
            java.lang.Number r12 = (java.lang.Number) r12     // Catch: java.lang.Throwable -> L766
            long r12 = r12.longValue()     // Catch: java.lang.Throwable -> L766
            long r12 = r9 - r12
            r14 = 600000(0x927c0, double:2.964394E-318)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L69b
            r12 = 1
        L699:
            r13 = 1
            goto L69d
        L69b:
            r12 = 0
            goto L699
        L69d:
            if (r12 != r13) goto L673
            r11.remove()     // Catch: java.lang.Throwable -> L766
            goto L673
        L6a3:
            java.util.LinkedHashMap r11 = r0.f14277d     // Catch: java.lang.Throwable -> L766
            boolean r11 = r11.containsKey(r7)     // Catch: java.lang.Throwable -> L766
            if (r11 == 0) goto L6ae
            r20 = 0
            goto L6b9
        L6ae:
            java.util.LinkedHashMap r11 = r0.f14277d     // Catch: java.lang.Throwable -> L766
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L766
            r11.put(r7, r9)     // Catch: java.lang.Throwable -> L766
            r20 = 1
        L6b9:
            monitor-exit(r8)
            if (r20 != 0) goto L6be
            goto L765
        L6be:
            java.util.concurrent.ConcurrentHashMap$KeySetView r8 = r0.f14278e
            boolean r8 = r8.add(r7)
            if (r8 != 0) goto L6c8
            goto L765
        L6c8:
            java.util.concurrent.ConcurrentHashMap$KeySetView r8 = r0.f14278e
            int r8 = r8.size()
            r9 = 128(0x80, float:1.8E-43)
            if (r8 <= r9) goto L6d9
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r0.f14278e
            r0.remove(r7)
            goto L765
        L6d9:
            h.Hchat.hooks.api.model.WeChatMessage r8 = r3.f7454k
            java.lang.String r9 = r3.f7446c
            r9.getClass()
            long r10 = r8.msgSvrId
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            int r13 = r2.size()
            int r13 = tf.y.a0(r13)
            r12.<init>(r13)
            java.util.Set r2 = r2.entrySet()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L6f9:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L717
            java.lang.Object r13 = r2.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.Object r13 = r13.getValue()
            java.util.Map r13 = (java.util.Map) r13
            java.util.Map r13 = tf.y.f0(r13)
            r12.put(r14, r13)
            goto L6f9
        L717:
            java.lang.String r2 = r3.f7445b
            r2.getClass()
            int r13 = r8.type
            boolean r3 = r3.f7452i
            r14 = 60000(0xea60, double:2.9644E-319)
            long r38 = r4 + r14
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            r4.getClass()
            java.lang.String r5 = "-"
            java.lang.String r14 = ""
            r15 = 0
            java.lang.String r40 = og.t.a0(r4, r5, r14, r15)
            v8.h r25 = new v8.h
            r33 = r2
            r36 = r3
            r26 = r7
            r30 = r8
            r27 = r9
            r28 = r10
            r32 = r12
            r34 = r13
            r37 = r31
            r31 = r6
            r25.<init>(r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40)
            r2 = r25
            v8.b r3 = new v8.b
            r4 = 3
            r3.<init>(r0, r2, r4)
            r4 = 350(0x15e, double:1.73E-321)
            boolean r3 = r0.o(r4, r3)
            if (r3 != 0) goto L765
            r0.d(r2)
        L765:
            return
        L766:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L769:
            java.lang.Object r0 = r1.f11895h
            ua.k r0 = (ua.k) r0
            java.lang.Object r2 = r1.f11896i
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r0.f13666h
            if (r3 == 0) goto L779
            r0.d(r2)
            goto L796
        L779:
            java.util.ArrayDeque r3 = r0.f13667i
            r3.addLast(r2)
            android.speech.tts.TextToSpeech r2 = r0.f13665g
            if (r2 == 0) goto L783
            goto L796
        L783:
            android.speech.tts.TextToSpeech r2 = new android.speech.tts.TextToSpeech
            android.content.Context r3 = r0.f13659a
            android.content.Context r3 = r3.getApplicationContext()
            sa.a r4 = new sa.a
            r13 = 1
            r4.<init>(r0, r13)
            r2.<init>(r3, r4)
            r0.f13665g = r2
        L796:
            return
        L797:
            java.lang.Object r0 = r1.f11895h
            sa.c r0 = (sa.c) r0
            java.lang.Object r2 = r1.f11896i
            android.media.Ringtone r2 = (android.media.Ringtone) r2
            r0.getClass()
            boolean r0 = r2.isPlaying()     // Catch: java.lang.Throwable -> L7ab
            if (r0 == 0) goto L7ab
            r2.stop()     // Catch: java.lang.Throwable -> L7ab
        L7ab:
            return
        L7ac:
            java.lang.Object r0 = r1.f11895h
            sa.c r0 = (sa.c) r0
            java.lang.Object r2 = r1.f11896i
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r3 = r0.f12408b
            android.content.Context r4 = r0.f12407a     // Catch: java.lang.Throwable -> L7d8
            android.media.Ringtone r2 = android.media.RingtoneManager.getRingtone(r4, r2)     // Catch: java.lang.Throwable -> L7d8
            if (r2 != 0) goto L7bf
            goto L7e2
        L7bf:
            r4 = 5
            r2.setStreamType(r4)     // Catch: java.lang.Throwable -> L7c3
        L7c3:
            r2.play()     // Catch: java.lang.Throwable -> L7d4
            android.os.Handler r4 = r0.f12411e     // Catch: java.lang.Throwable -> L7d4
            rb.g r5 = new rb.g     // Catch: java.lang.Throwable -> L7d4
            r6 = 3
            r5.<init>(r0, r6, r2)     // Catch: java.lang.Throwable -> L7d4
            r6 = 3500(0xdac, double:1.729E-320)
            r4.postDelayed(r5, r6)     // Catch: java.lang.Throwable -> L7d4
            goto L7e2
        L7d4:
            r0 = move-exception
            java.lang.String r2 = " 铃声播放失败: "
            goto L7db
        L7d8:
            r0 = move-exception
            java.lang.String r2 = " 铃声加载失败: "
        L7db:
            java.lang.StringBuilder r2 = bc.e.n(r3, r2)
            bc.e.s(r0, r2, r0)
        L7e2:
            return
        L7e3:
            java.lang.Object r0 = r1.f11895h
            sa.c r0 = (sa.c) r0
            java.lang.Object r2 = r1.f11896i
            java.lang.String r2 = (java.lang.String) r2
            r0.getClass()
            android.content.Context r0 = r0.f12407a     // Catch: java.lang.Throwable -> L7f8
            r15 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r15)     // Catch: java.lang.Throwable -> L7f8
            r0.show()     // Catch: java.lang.Throwable -> L7f8
        L7f8:
            return
        L7f9:
            java.lang.Object r0 = r1.f11895h
            rb.k r0 = (rb.k) r0
            java.lang.Object r2 = r1.f11896i
            rb.h r2 = (rb.h) r2
            java.lang.Object r3 = r0.f11907d
            monitor-enter(r3)
            rb.h r4 = r0.f11920q     // Catch: java.lang.Throwable -> L818
            if (r4 == r2) goto L80a
            monitor-exit(r3)
            goto L817
        L80a:
            r4 = 0
            r0.f11920q = r4     // Catch: java.lang.Throwable -> L818
            java.lang.String r4 = ""
            r0.f11918o = r4     // Catch: java.lang.Throwable -> L818
            monitor-exit(r3)
            java.lang.String r3 = "检测超时"
            r0.f(r2, r3)
        L817:
            return
        L818:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }
}
