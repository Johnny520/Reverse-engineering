package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1597l;

    public /* synthetic */ x(int r1, android.app.Activity r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = this;
            r0.f1592g = r1
            r0.f1594i = r2
            r0.f1593h = r3
            r0.f1595j = r4
            r0.f1596k = r5
            r0.f1597l = r6
            r0.<init>()
            return
    }

    public /* synthetic */ x(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f1592g = r6
            r0.f1593h = r1
            r0.f1594i = r2
            r0.f1595j = r3
            r0.f1596k = r4
            r0.f1597l = r5
            r0.<init>()
            return
    }

    public /* synthetic */ x(java.lang.Object r2, java.util.Map r3, android.content.Context r4, eb.c0 r5, i0.a1 r6) {
            r1 = this;
            r0 = 15
            r1.f1592g = r0
            r1.<init>()
            r1.f1595j = r2
            r1.f1593h = r3
            r1.f1594i = r4
            r1.f1596k = r5
            r1.f1597l = r6
            return
    }

    public /* synthetic */ x(java.util.List r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, android.app.Activity r5, int r6) {
            r0 = this;
            r0.f1592g = r6
            r0.f1593h = r1
            r0.f1595j = r2
            r0.f1596k = r3
            r0.f1597l = r4
            r0.f1594i = r5
            r0.<init>()
            return
    }

    public /* synthetic */ x(wb.kv r2, xa.m r3, android.app.Activity r4, java.lang.Object r5, xa.i r6) {
            r1 = this;
            r0 = 20
            r1.f1592g = r0
            r1.<init>()
            r1.f1593h = r2
            r1.f1596k = r3
            r1.f1594i = r4
            r1.f1595j = r5
            r1.f1597l = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r33 = this;
            r1 = r33
            int r0 = r1.f1592g
            java.lang.String r2 = "联系人列表不可用"
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r7 = ""
            sf.n r8 = sf.n.f12433a
            r10 = 1
            r11 = 0
            java.lang.Object r12 = r1.f1595j
            java.lang.Object r13 = r1.f1597l
            java.lang.Object r14 = r1.f1596k
            java.lang.Object r15 = r1.f1594i
            java.lang.Object r3 = r1.f1593h
            switch(r0) {
                case 0: goto L711;
                case 1: goto L703;
                case 2: goto L6f5;
                case 3: goto L6de;
                case 4: goto L6d0;
                case 5: goto L6a3;
                case 6: goto L66d;
                case 7: goto L5d5;
                case 8: goto L5b3;
                case 9: goto L595;
                case 10: goto L4ac;
                case 11: goto L453;
                case 12: goto L3dd;
                case 13: goto L374;
                case 14: goto L315;
                case 15: goto L2e3;
                case 16: goto L2bb;
                case 17: goto L116;
                case 18: goto Lf3;
                case 19: goto L63;
                case 20: goto L35;
                default: goto L1b;
            }
        L1b:
            y9.e r3 = (y9.e) r3
            android.widget.TextView r15 = (android.widget.TextView) r15
            y9.d r12 = (y9.d) r12
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r13 = (java.lang.String) r13
            java.util.Map r0 = r3.f22336e
            java.lang.Object r0 = r0.get(r15)
            boolean r0 = gg.l.a(r0, r12)
            if (r0 == 0) goto L34
            r3.a(r15, r14, r13)
        L34:
            return
        L35:
            wb.kv r3 = (wb.kv) r3
            r6 = r14
            xa.m r6 = (xa.m) r6
            r7 = r15
            android.app.Activity r7 = (android.app.Activity) r7
            r8 = r13
            xa.i r8 = (xa.i) r8
            r3.close()
            xa.f r4 = new xa.f
            r9 = 0
            java.lang.Object r5 = r1.f1595j
            r4.<init>(r5, r6, r7, r8, r9)
            r6.getClass()
            android.view.Window r0 = r7.getWindow()
            if (r0 == 0) goto L62
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L62
            wb.vu r2 = new wb.vu
            r2.<init>(r6, r7, r4)
            r0.postOnAnimation(r2)
        L62:
            return
        L63:
            fb.d1 r3 = (fb.d1) r3
            java.lang.String r15 = (java.lang.String) r15
            android.content.Context r12 = (android.content.Context) r12
            java.util.List r14 = (java.util.List) r14
            java.lang.String r13 = (java.lang.String) r13
            fb.g1 r0 = fb.g1.f3523a     // Catch: java.lang.Throwable -> L87
            java.util.List r0 = r3.f3487e     // Catch: java.lang.Throwable -> L87
            boolean r0 = fb.g1.h(r0)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L89
            r15.getClass()     // Catch: java.lang.Throwable -> L87
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = fb.g1.f3530h     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = fb.g1.m(r15)     // Catch: java.lang.Throwable -> L87
            r0.remove(r2)     // Catch: java.lang.Throwable -> L87
            fb.g1.n(r12, r3)     // Catch: java.lang.Throwable -> L87
            goto L8c
        L87:
            r0 = move-exception
            goto L8e
        L89:
            fb.g1.e(r12, r15)     // Catch: java.lang.Throwable -> L87
        L8c:
            r2 = r8
            goto L93
        L8e:
            sf.f r2 = new sf.f
            r2.<init>(r0)
        L93:
            boolean r0 = r2 instanceof sf.f
            java.lang.String r3 = "[Hchat:ScriptAgent] "
            if (r0 != 0) goto Lc6
            r0 = r2
            sf.n r0 = (sf.n) r0
            boolean r0 = r14.isEmpty()     // Catch: java.lang.Throwable -> La6
            if (r0 != 0) goto Lac
            wb.y2.E0(r12, r14)     // Catch: java.lang.Throwable -> La6
            goto Lac
        La6:
            r0 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r0)
        Lac:
            java.lang.Throwable r0 = sf.g.b(r8)
            if (r0 == 0) goto Lc6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r13)
            java.lang.String r5 = "清理工具结果失败"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            fb.v0.n(r4, r0)
        Lc6:
            java.lang.Throwable r0 = sf.g.b(r2)
            if (r0 == 0) goto Lf2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r3 = "保存会话失败"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            fb.v0.n(r2, r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            eb.w r2 = new eb.w
            r3 = 5
            r2.<init>(r12, r13, r3)
            r0.post(r2)
        Lf2:
            return
        Lf3:
            java.lang.String r3 = (java.lang.String) r3
            wb.au r15 = (wb.au) r15
            i0.a1 r12 = (i0.a1) r12
            i0.a1 r14 = (i0.a1) r14
            i0.a1 r13 = (i0.a1) r13
            java.lang.Object r0 = r12.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L110
            r14.setValue(r15)
            wb.y2.S0(r13, r10)
            goto L115
        L110:
            fb.u2 r0 = fb.u2.f3819g
            r15.a(r0)
        L115:
            return
        L116:
            java.util.List r3 = (java.util.List) r3
            android.app.Activity r15 = (android.app.Activity) r15
            java.io.File r12 = (java.io.File) r12
            java.util.HashSet r14 = (java.util.HashSet) r14
            wb.gr r13 = (wb.gr) r13
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L129:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L272
            java.lang.Object r0 = r3.next()
            android.net.Uri r0 = (android.net.Uri) r0
            wb.hr r4 = wb.hr.f16681a
            java.lang.String r4 = r0.toString()
            boolean r4 = r14.contains(r4)
            java.lang.String r5 = "_"
            java.lang.String r8 = wb.ho.C6(r15, r0)     // Catch: java.lang.Throwable -> L235
            java.lang.String r10 = "attachment"
            if (r8 == 0) goto L14a
            goto L152
        L14a:
            java.lang.String r8 = r0.getLastPathSegment()     // Catch: java.lang.Throwable -> L235
            if (r8 == 0) goto L151
            goto L152
        L151:
            r8 = r10
        L152:
            java.lang.String r16 = "[\\\\/:*?\"<>|]"
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r16)     // Catch: java.lang.Throwable -> L235
            r9.getClass()     // Catch: java.lang.Throwable -> L235
            java.util.regex.Matcher r9 = r9.matcher(r8)     // Catch: java.lang.Throwable -> L235
            java.lang.String r9 = r9.replaceAll(r5)     // Catch: java.lang.Throwable -> L235
            r9.getClass()     // Catch: java.lang.Throwable -> L235
            boolean r16 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L235
            if (r16 == 0) goto L16d
            goto L16e
        L16d:
            r10 = r9
        L16e:
            java.util.UUID r9 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L235
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L235
            r9.getClass()     // Catch: java.lang.Throwable -> L235
            r6 = 8
            java.lang.String r6 = r9.substring(r11, r6)     // Catch: java.lang.Throwable -> L235
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L235
            r24 = r12
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L238
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L238
            r1.<init>()     // Catch: java.lang.Throwable -> L238
            r1.append(r11)     // Catch: java.lang.Throwable -> L238
            r1.append(r5)     // Catch: java.lang.Throwable -> L238
            r1.append(r6)     // Catch: java.lang.Throwable -> L238
            r1.append(r5)     // Catch: java.lang.Throwable -> L238
            r1.append(r10)     // Catch: java.lang.Throwable -> L238
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L238
            r12 = r24
            r9.<init>(r12, r1)     // Catch: java.lang.Throwable -> L235
            android.content.ContentResolver r1 = r15.getContentResolver()     // Catch: java.lang.Throwable -> L1e1
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch: java.lang.Throwable -> L1e1
            if (r1 == 0) goto L233
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L219
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L219
            r6 = 32768(0x8000, float:4.5918E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L225
        L1b8:
            int r10 = r1.read(r6)     // Catch: java.lang.Throwable -> L225
            if (r10 >= 0) goto L21c
            r5.close()     // Catch: java.lang.Throwable -> L219
            r1.close()     // Catch: java.lang.Throwable -> L1e1
            java.lang.String r18 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L1e1
            r18.getClass()     // Catch: java.lang.Throwable -> L1e1
            android.content.ContentResolver r1 = r15.getContentResolver()     // Catch: java.lang.Throwable -> L1e1
            java.lang.String r1 = r1.getType(r0)     // Catch: java.lang.Throwable -> L1e1
            if (r1 != 0) goto L1d6
            r1 = r7
        L1d6:
            boolean r5 = og.m.t0(r1)     // Catch: java.lang.Throwable -> L1e1
            if (r5 == 0) goto L1de
            java.lang.String r1 = "application/octet-stream"
        L1de:
            r19 = r1
            goto L1e3
        L1e1:
            r0 = move-exception
            goto L23c
        L1e3:
            long r21 = r9.length()     // Catch: java.lang.Throwable -> L1e1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e1
            if (r4 == 0) goto L1ee
            goto L1ef
        L1ee:
            r0 = 0
        L1ef:
            if (r0 != 0) goto L1f4
            r20 = r7
            goto L1f6
        L1f4:
            r20 = r0
        L1f6:
            fb.a r16 = new fb.a     // Catch: java.lang.Throwable -> L1e1
            r17 = r8
            r16.<init>(r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L1e1
            boolean r0 = r9.isFile()     // Catch: java.lang.Throwable -> L1e1
            if (r0 == 0) goto L20e
            long r0 = r9.length()     // Catch: java.lang.Throwable -> L1e1
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L20e
            goto L210
        L20e:
            r16 = 0
        L210:
            if (r16 == 0) goto L213
            goto L243
        L213:
            r9.delete()     // Catch: java.lang.Throwable -> L1e1
            r16 = 0
            goto L243
        L219:
            r0 = move-exception
            r4 = r0
            goto L22d
        L21c:
            r17 = r8
            r8 = 0
            r5.write(r6, r8, r10)     // Catch: java.lang.Throwable -> L225
            r8 = r17
            goto L1b8
        L225:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L228
        L228:
            r0 = move-exception
            ig.a.i(r5, r4)     // Catch: java.lang.Throwable -> L219
            throw r0     // Catch: java.lang.Throwable -> L219
        L22d:
            throw r4     // Catch: java.lang.Throwable -> L22e
        L22e:
            r0 = move-exception
            ig.a.i(r1, r4)     // Catch: java.lang.Throwable -> L1e1
            throw r0     // Catch: java.lang.Throwable -> L1e1
        L233:
            r0 = 0
            goto L268
        L235:
            r0 = move-exception
        L236:
            r9 = 0
            goto L23c
        L238:
            r0 = move-exception
            r12 = r24
            goto L236
        L23c:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r16 = r1
        L243:
            java.lang.Throwable r0 = sf.g.b(r16)
            if (r0 != 0) goto L24a
            goto L264
        L24a:
            if (r9 == 0) goto L24f
            r9.delete()
        L24f:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r1.<init>(r4)
            rb.g r4 = new rb.g
            r5 = 15
            r4.<init>(r15, r5, r0)
            r1.post(r4)
            r16 = 0
        L264:
            r0 = r16
            fb.a r0 = (fb.a) r0
        L268:
            if (r0 == 0) goto L26d
            r2.add(r0)
        L26d:
            r1 = r33
            r11 = 0
            goto L129
        L272:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L280:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a1
            java.lang.Object r3 = r2.next()
            r4 = r3
            fb.a r4 = (fb.a) r4
            java.lang.String r5 = r4.f3390e
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L297
            java.lang.String r5 = r4.f3387b
        L297:
            boolean r4 = r0.add(r5)
            if (r4 == 0) goto L280
            r1.add(r3)
            goto L280
        L2a1:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L2ba
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            rb.g r2 = new rb.g
            r3 = 16
            r2.<init>(r13, r3, r1)
            r0.post(r2)
        L2ba:
            return
        L2bb:
            wb.kv r3 = (wb.kv) r3
            r5 = r15
            android.app.Activity r5 = (android.app.Activity) r5
            r6 = r12
            java.util.List r6 = (java.util.List) r6
            r7 = r14
            java.util.Set r7 = (java.util.Set) r7
            r8 = r13
            wb.me r8 = (wb.me) r8
            r3.close()
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L2e2
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L2e2
            b9.c r4 = new b9.c
            r9 = 21
            r4.<init>(r5, r6, r7, r8, r9)
            r0.postOnAnimation(r4)
        L2e2:
            return
        L2e3:
            java.util.Map r3 = (java.util.Map) r3
            android.content.Context r15 = (android.content.Context) r15
            eb.c0 r14 = (eb.c0) r14
            i0.a1 r13 = (i0.a1) r13
            boolean r0 = r12 instanceof sf.f
            if (r0 == 0) goto L314
            r13.setValue(r3)
            java.lang.String r0 = r14.f2513h
            if (r0 == 0) goto L2f7
            goto L2f9
        L2f7:
            java.lang.String r0 = "未知"
        L2f9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "加载["
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "]失败，已自动关闭"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r15, r0, r8)
            r0.show()
        L314:
            return
        L315:
            android.content.Context r3 = (android.content.Context) r3
            android.content.SharedPreferences r15 = (android.content.SharedPreferences) r15
            i0.a1 r12 = (i0.a1) r12
            i0.a1 r14 = (i0.a1) r14
            i0.a1 r13 = (i0.a1) r13
            h.Hchat.hooks.items.script.ScriptPluginRuntime r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.util.List r0 = r0.listPlugins(r3)
            int r1 = tf.n.e1(r0)
            int r1 = tf.y.a0(r1)
            r2 = 16
            if (r1 >= r2) goto L333
            r6 = r2
            goto L334
        L333:
            r6 = r1
        L334:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L33d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L359
            java.lang.Object r2 = r0.next()
            eb.c0 r2 = (eb.c0) r2
            java.lang.String r2 = r2.f2506a
            h.Hchat.hooks.items.script.ScriptPluginRuntime r4 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            boolean r4 = r4.isPluginEnabled(r3, r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r2, r4)
            goto L33d
        L359:
            r12.setValue(r1)
            java.lang.String r0 = "script_plugin_enable"
            r8 = 0
            boolean r0 = r15.getBoolean(r0, r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r14.setValue(r0)
            java.lang.Object r0 = r13.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            p.a.u(r0, r10, r13)
            return
        L374:
            i2.n0 r3 = (i2.n0) r3
            u2.m r15 = (u2.m) r15
            r5 = r12
            java.lang.String r5 = (java.lang.String) r5
            r10 = r14
            u2.c r10 = (u2.c) r10
            r9 = r13
            m2.d r9 = (m2.d) r9
            java.lang.String r0 = "BackgroundTextMeasurement"
            android.os.Trace.beginSection(r0)
            w0.f r0 = w0.m.j()     // Catch: java.lang.Throwable -> L3c2
            boolean r1 = r0 instanceof w0.b     // Catch: java.lang.Throwable -> L3c2
            if (r1 == 0) goto L391
            w0.b r0 = (w0.b) r0     // Catch: java.lang.Throwable -> L3c2
            goto L392
        L391:
            r0 = 0
        L392:
            if (r0 == 0) goto L3d1
            r1 = 0
            w0.b r1 = r0.C(r1, r1)     // Catch: java.lang.Throwable -> L3c2
            if (r1 == 0) goto L3d1
            w0.f r2 = r1.j()     // Catch: java.lang.Throwable -> L3c4
            i2.n0 r6 = i2.e0.h(r3, r15)     // Catch: java.lang.Throwable -> L3c6
            tf.t r7 = tf.t.f13167g     // Catch: java.lang.Throwable -> L3c6
            q2.d r4 = new q2.d     // Catch: java.lang.Throwable -> L3c6
            r8 = r7
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3c6
            r4.c()     // Catch: java.lang.Throwable -> L3c6
            r4.b()     // Catch: java.lang.Throwable -> L3c6
            w0.f.q(r2)     // Catch: java.lang.Throwable -> L3c4
            w0.q r0 = r1.w()     // Catch: java.lang.Throwable -> L3c2
            r0.d()     // Catch: java.lang.Throwable -> L3c2
            r1.c()     // Catch: java.lang.Throwable -> L3c2
            android.os.Trace.endSection()
            return
        L3c2:
            r0 = move-exception
            goto L3d9
        L3c4:
            r0 = move-exception
            goto L3cb
        L3c6:
            r0 = move-exception
            w0.f.q(r2)     // Catch: java.lang.Throwable -> L3c4
            throw r0     // Catch: java.lang.Throwable -> L3c4
        L3cb:
            throw r0     // Catch: java.lang.Throwable -> L3cc
        L3cc:
            r0 = move-exception
            r1.c()     // Catch: java.lang.Throwable -> L3c2
            throw r0     // Catch: java.lang.Throwable -> L3c2
        L3d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3c2
            java.lang.String r1 = "Cannot create a mutable snapshot of an read-only snapshot"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3c2
            throw r0     // Catch: java.lang.Throwable -> L3c2
        L3d9:
            android.os.Trace.endSection()
            throw r0
        L3dd:
            java.util.List r3 = (java.util.List) r3
            java.util.List r12 = (java.util.List) r12
            android.os.Handler r14 = (android.os.Handler) r14
            qb.k r13 = (qb.k) r13
            android.app.Activity r15 = (android.app.Activity) r15
            gg.s r0 = new gg.s     // Catch: java.lang.Throwable -> L424
            r0.<init>()     // Catch: java.lang.Throwable -> L424
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L424
            int r2 = r12.size()     // Catch: java.lang.Throwable -> L424
            int r1 = r1 * r2
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L424
            r8 = 0
        L3fa:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L424
            if (r3 == 0) goto L43f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L424
            wb.jv r3 = (wb.jv) r3     // Catch: java.lang.Throwable -> L424
            java.util.Iterator r4 = r12.iterator()     // Catch: java.lang.Throwable -> L424
        L40a:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L424
            if (r6 == 0) goto L3fa
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L424
            qb.i r6 = (qb.i) r6     // Catch: java.lang.Throwable -> L424
            java.lang.String r7 = r3.f17140a     // Catch: java.lang.Throwable -> L424
            boolean r6 = r13.G(r6, r7)     // Catch: java.lang.Throwable -> L424
            if (r6 == 0) goto L426
            int r6 = r0.f4562g     // Catch: java.lang.Throwable -> L424
            int r6 = r6 + r10
            r0.f4562g = r6     // Catch: java.lang.Throwable -> L424
            goto L426
        L424:
            r0 = move-exception
            goto L44c
        L426:
            int r8 = r8 + 1
            if (r8 >= r1) goto L40a
            r6 = 500(0x1f4, double:2.47E-321)
            r5.sleep(r6)     // Catch: java.lang.Throwable -> L424 java.lang.InterruptedException -> L431
            r6 = r10
            goto L439
        L431:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L424
            r6.interrupt()     // Catch: java.lang.Throwable -> L424
            r6 = 0
        L439:
            if (r6 != 0) goto L40a
        L43b:
            qb.k.e(r12)
            goto L44b
        L43f:
            qb.d r2 = new qb.d     // Catch: java.lang.Throwable -> L424
            r2.<init>(r15, r13, r0, r1)     // Catch: java.lang.Throwable -> L424
            r14.post(r2)     // Catch: java.lang.Throwable -> L424
            r13.getClass()
            goto L43b
        L44b:
            return
        L44c:
            r13.getClass()
            qb.k.e(r12)
            throw r0
        L453:
            java.util.List r3 = (java.util.List) r3
            android.os.Handler r12 = (android.os.Handler) r12
            qb.k r14 = (qb.k) r14
            qb.i r13 = (qb.i) r13
            android.app.Activity r15 = (android.app.Activity) r15
            gg.s r0 = new gg.s
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()
            r11 = 0
        L467:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a3
            java.lang.Object r2 = r1.next()
            int r4 = r11 + 1
            if (r11 < 0) goto L49d
            wb.jv r2 = (wb.jv) r2
            java.lang.String r2 = r2.f17140a
            boolean r2 = r14.G(r13, r2)
            if (r2 == 0) goto L484
            int r2 = r0.f4562g
            int r2 = r2 + r10
            r0.f4562g = r2
        L484:
            int r2 = r3.size()
            int r2 = r2 - r10
            if (r11 >= r2) goto L499
            r6 = 500(0x1f4, double:2.47E-321)
            r5.sleep(r6)     // Catch: java.lang.InterruptedException -> L491
            goto L49b
        L491:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L4ab
        L499:
            r6 = 500(0x1f4, double:2.47E-321)
        L49b:
            r11 = r4
            goto L467
        L49d:
            a.a.Q0()
            r23 = 0
            throw r23
        L4a3:
            ac.l r1 = new ac.l
            r1.<init>(r15, r3, r0, r14)
            r12.post(r1)
        L4ab:
            return
        L4ac:
            r23 = 0
            o9.p r3 = (o9.p) r3
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r14 = (java.lang.String) r14
            o9.q r13 = (o9.q) r13
            android.content.SharedPreferences r0 = r3.f9663b     // Catch: java.lang.Throwable -> L4e7
            bb.l r1 = r3.f9664c     // Catch: java.lang.Throwable -> L4e7
            java.lang.String r2 = "group_member_reply_delay_seconds"
            r4 = 0
            int r0 = r0.getInt(r2, r4)     // Catch: java.lang.Throwable -> L4e7
            r2 = 600(0x258, float:8.41E-43)
            int r0 = r9.e0.r(r0, r4, r2)     // Catch: java.lang.Throwable -> L4e7
            long r5 = (long) r0     // Catch: java.lang.Throwable -> L4e7
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r9
            o9.p.F(r5)     // Catch: java.lang.Throwable -> L4e7
            o9.j r0 = r3.u(r15, r12)     // Catch: java.lang.Throwable -> L4e7
            java.lang.String r2 = r0.f9639b     // Catch: java.lang.Throwable -> L4e7
            boolean r5 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L4e7
            if (r5 == 0) goto L4ea
            java.lang.String r2 = r0.f9640c     // Catch: java.lang.Throwable -> L4e7
            boolean r5 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L4e7
            if (r5 == 0) goto L4ea
            java.lang.String r2 = r0.f9641d     // Catch: java.lang.Throwable -> L4e7
            goto L4ea
        L4e7:
            r0 = move-exception
            goto L575
        L4ea:
            r26 = r2
            java.lang.String r27 = r0.b()     // Catch: java.lang.Throwable -> L4e7
            java.lang.String r28 = r1.c(r12)     // Catch: java.lang.Throwable -> L4e7
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L4e7
            r0.getClass()     // Catch: java.lang.Throwable -> L4e7
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> L4e7
            if (r0 == 0) goto L506
            int r11 = r0.s(r12)     // Catch: java.lang.Throwable -> L4e7
            goto L507
        L506:
            r11 = r4
        L507:
            java.lang.String r29 = r1.d(r11)     // Catch: java.lang.Throwable -> L4e7
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L4e7
            r0.getClass()     // Catch: java.lang.Throwable -> L4e7
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> L4e7
            if (r0 == 0) goto L53f
            java.lang.String r0 = r0.z(r12)     // Catch: java.lang.Throwable -> L4e7
            if (r0 == 0) goto L53f
            java.lang.CharSequence r0 = og.m.R0(r0)     // Catch: java.lang.Throwable -> L4e7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4e7
            if (r0 == 0) goto L53f
            java.lang.String r1 = "\\s+"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Throwable -> L4e7
            r1.getClass()     // Catch: java.lang.Throwable -> L4e7
            java.lang.String r2 = " "
            java.util.regex.Matcher r0 = r1.matcher(r0)     // Catch: java.lang.Throwable -> L4e7
            java.lang.String r9 = r0.replaceAll(r2)     // Catch: java.lang.Throwable -> L4e7
            r9.getClass()     // Catch: java.lang.Throwable -> L4e7
            goto L541
        L53f:
            r9 = r23
        L541:
            if (r9 != 0) goto L546
            r30 = r7
            goto L548
        L546:
            r30 = r9
        L548:
            java.lang.String r31 = o9.p.m(r15)     // Catch: java.lang.Throwable -> L4e7
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L4e7
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L4e7
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L4e7
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L4e7
            r1.<init>()     // Catch: java.lang.Throwable -> L4e7
            java.lang.String r32 = r0.format(r1)     // Catch: java.lang.Throwable -> L4e7
            r32.getClass()     // Catch: java.lang.Throwable -> L4e7
            o9.n r24 = new o9.n     // Catch: java.lang.Throwable -> L4e7
            r25 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Throwable -> L572
            r0 = r24
            r12 = r25
            r3.l(r14, r15, r0, r13)     // Catch: java.lang.Throwable -> L4e7
            goto L57a
        L572:
            r0 = move-exception
            r12 = r25
        L575:
            sf.f r8 = new sf.f
            r8.<init>(r0)
        L57a:
            java.lang.Throwable r0 = sf.g.b(r8)
            if (r0 == 0) goto L594
            ia.t r1 = r3.f9662a
            java.lang.String r2 = "进退群自动回复异常: "
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = bc.e.p(r2, r15, r3, r12, r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r1.invoke(r2, r0)
        L594:
            return
        L595:
            r6 = r15
            android.app.Activity r6 = (android.app.Activity) r6
            r5 = r3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r7 = r12
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r4 = r14
            android.widget.ScrollView r4 = (android.widget.ScrollView) r4
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            k9.r r0 = k9.r.f7530a
            k9.r.m(r6, r5, r7, r4, r13)
            b9.c r3 = new b9.c
            r8 = 11
            r3.<init>(r4, r5, r6, r7, r8)
            r4.postOnAnimation(r3)
            return
        L5b3:
            wb.kv r3 = (wb.kv) r3
            android.app.Activity r15 = (android.app.Activity) r15
            java.util.List r12 = (java.util.List) r12
            ia.q r14 = (ia.q) r14
            ia.j r13 = (ia.j) r13
            r3.close()
            android.view.Window r0 = r15.getWindow()
            if (r0 == 0) goto L5d4
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L5d4
            ac.l r1 = new ac.l
            r1.<init>(r15, r12, r14, r13)
            r0.postOnAnimation(r1)
        L5d4:
            return
        L5d5:
            r2 = r15
            android.app.Activity r2 = (android.app.Activity) r2
            hb.g0 r3 = (hb.g0) r3
            r6 = r12
            hb.i0 r6 = (hb.i0) r6
            r7 = r14
            java.util.List r7 = (java.util.List) r7
            r5 = r13
            b.e r5 = (b.e) r5
            boolean r0 = r2.isFinishing()
            if (r0 == 0) goto L5eb
            goto L66c
        L5eb:
            int r0 = r3.ordinal()
            r1 = 7
            wb.lv r8 = wb.lv.f17583j
            java.lang.String r3 = "微信原生群发助手"
            java.lang.String r4 = "模块通道"
            java.lang.String r9 = " 条消息"
            java.lang.String r11 = "已选 "
            if (r0 == 0) goto L636
            if (r0 != r10) goto L632
            r6.getClass()
            int r0 = r7.size()
            java.lang.String r0 = eh.a.m(r0, r11, r9)
            sf.e r9 = new sf.e
            java.lang.String r10 = "支持好友、群聊、公众号和标签"
            r9.<init>(r4, r10)
            sf.e r4 = new sf.e
            java.lang.String r10 = "仅选择好友并按原生队列发送"
            r4.<init>(r3, r10)
            sf.e[] r3 = new sf.e[]{r9, r4}
            java.util.List r3 = a.a.y0(r3)
            hb.f0 r4 = new hb.f0
            r4.<init>(r2, r7, r6, r5)
            k.s1 r7 = new k.s1
            r7.<init>(r1)
            r5 = r3
            java.lang.String r3 = "选择定时转发通道"
            r6 = r4
            r4 = r0
            wb.y2.Q1(r2, r3, r4, r5, r6, r7, r8)
            goto L66c
        L632:
            okio.a.k()
            goto L66c
        L636:
            r6.getClass()
            int r0 = r7.size()
            java.lang.String r0 = eh.a.m(r0, r11, r9)
            sf.e r9 = new sf.e
            java.lang.String r10 = "支持好友、群聊、公众号和好友标签"
            r9.<init>(r4, r10)
            sf.e r4 = new sf.e
            java.lang.String r10 = "按微信当前人数上限自动分批"
            r4.<init>(r3, r10)
            sf.e[] r3 = new sf.e[]{r9, r4}
            java.util.List r9 = a.a.y0(r3)
            r4 = r2
            hb.f0 r2 = new hb.f0
            r3 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r6 = r2
            r2 = r4
            k.s1 r7 = new k.s1
            r7.<init>(r1)
            java.lang.String r3 = "选择群发通道"
            r4 = r0
            r5 = r9
            wb.y2.Q1(r2, r3, r4, r5, r6, r7, r8)
        L66c:
            return
        L66d:
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            android.app.Activity r15 = (android.app.Activity) r15
            hb.x r14 = (hb.x) r14
            hb.i0 r13 = (hb.i0) r13
            boolean r0 = r3.get()
            if (r0 != 0) goto L6a2
            boolean r0 = r15.isFinishing()
            if (r0 != 0) goto L6a2
            boolean r0 = r15.isDestroyed()
            if (r0 == 0) goto L688
            goto L6a2
        L688:
            boolean r0 = r12 instanceof sf.f
            if (r0 != 0) goto L692
            r0 = r12
            java.util.List r0 = (java.util.List) r0
            r14.invoke(r0)
        L692:
            java.lang.Throwable r0 = sf.g.b(r12)
            if (r0 == 0) goto L6a2
            ab.b r1 = r13.f5401b
            java.lang.String r3 = "群发助手读取联系人失败"
            r1.invoke(r3, r0)
            r13.e(r15, r2)
        L6a2:
            return
        L6a3:
            fg.q r3 = (fg.q) r3
            gg.s r15 = (gg.s) r15
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.util.List r14 = (java.util.List) r14
            hb.b r13 = (hb.b) r13
            if (r3 == 0) goto L6cf
            int r0 = r15.f4562g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r12.size()
            int r2 = r14.size()
            int r2 = r2 * r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = r13.f5328b
            boolean r2 = r2.get()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.b(r0, r1, r2)
        L6cf:
            return
        L6d0:
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            java.util.concurrent.CountDownLatch r15 = (java.util.concurrent.CountDownLatch) r15
            java.util.concurrent.atomic.AtomicReference r12 = (java.util.concurrent.atomic.AtomicReference) r12
            fg.a r14 = (fg.a) r14
            java.util.concurrent.atomic.AtomicReference r13 = (java.util.concurrent.atomic.AtomicReference) r13
            h.Hchat.hooks.items.script.ScriptPluginBridge.d(r3, r15, r12, r14, r13)
            return
        L6de:
            android.view.View r3 = (android.view.View) r3
            da.b r15 = (da.b) r15
            da.h r12 = (da.h) r12
            android.widget.TextView r14 = (android.widget.TextView) r14
            da.c r13 = (da.c) r13
            r0 = 2131099712(0x7f060040, float:1.7811785E38)
            java.lang.Object r0 = r3.getTag(r0)
            if (r0 != r15) goto L6f4
            r12.B(r3, r14, r13, r15)
        L6f4:
            return
        L6f5:
            h.Hchat.ModuleEntry r3 = (h.Hchat.ModuleEntry) r3
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r15 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r15
            android.content.Context r12 = (android.content.Context) r12
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r14 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r14
            java.lang.String r13 = (java.lang.String) r13
            h.Hchat.ModuleEntry.d(r3, r15, r12, r14, r13)
            return
        L703:
            h.Hchat.ModuleEntry r3 = (h.Hchat.ModuleEntry) r3
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r15 = (de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam) r15
            android.content.Context r12 = (android.content.Context) r12
            android.content.Context r14 = (android.content.Context) r14
            ub.a r13 = (ub.a) r13
            h.Hchat.ModuleEntry.c(r3, r15, r12, r14, r13)
            return
        L711:
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            android.app.Activity r15 = (android.app.Activity) r15
            ca.l r14 = (ca.l) r14
            ca.e0 r13 = (ca.e0) r13
            boolean r0 = r3.get()
            if (r0 != 0) goto L743
            boolean r0 = r15.isFinishing()
            if (r0 != 0) goto L743
            boolean r0 = r15.isDestroyed()
            if (r0 == 0) goto L72c
            goto L743
        L72c:
            boolean r0 = r12 instanceof sf.f
            if (r0 != 0) goto L733
            r14.invoke(r12)
        L733:
            java.lang.Throwable r0 = sf.g.b(r12)
            if (r0 == 0) goto L743
            ab.b r1 = r13.f1483c
            java.lang.String r3 = "转发读取联系人失败"
            r1.invoke(r3, r0)
            r13.r(r15, r2)
        L743:
            return
    }
}
