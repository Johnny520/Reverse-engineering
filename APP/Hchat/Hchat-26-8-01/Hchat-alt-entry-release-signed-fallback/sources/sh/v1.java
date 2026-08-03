package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12872i;

    public /* synthetic */ v1(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f12870g = r2
            r0.f12871h = r1
            r0.f12872i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ v1(w.n1 r1, i2.e r2, y1.p0 r3) {
            r0 = this;
            r1 = 4
            r0.f12870g = r1
            r0.<init>()
            r0.f12871h = r2
            r0.f12872i = r3
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r14 = this;
            int r0 = r14.f12870g
            switch(r0) {
                case 0: goto L455;
                case 1: goto L3c7;
                case 2: goto L399;
                case 3: goto L363;
                case 4: goto L349;
                case 5: goto L30b;
                case 6: goto L2f1;
                case 7: goto L2e1;
                case 8: goto L2c8;
                case 9: goto L28a;
                case 10: goto L279;
                case 11: goto L26c;
                case 12: goto L1ed;
                case 13: goto L1bf;
                case 14: goto L1b2;
                case 15: goto L1a0;
                case 16: goto L191;
                case 17: goto L182;
                case 18: goto L152;
                case 19: goto L122;
                case 20: goto L113;
                case 21: goto Le3;
                case 22: goto Ld4;
                case 23: goto La4;
                case 24: goto L97;
                case 25: goto L67;
                case 26: goto L59;
                case 27: goto L2a;
                case 28: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r14.f12871h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r14.f12872i
            java.lang.String r1 = (java.lang.String) r1
            wb.ho.v6(r0, r1)
        L10:
            sf.n r0 = sf.n.f12433a
            return r0
        L13:
            java.lang.Object r0 = r14.f12871h
            wb.l4 r0 = (wb.l4) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            wb.i4 r0 = (wb.i4) r0
            boolean r0 = r0.f16717b
            if (r0 == 0) goto L24
            wb.h4 r0 = wb.h4.f16487c
            goto L26
        L24:
            wb.h4 r0 = wb.h4.f16486b
        L26:
            r1.setValue(r0)
            goto L10
        L2a:
            java.lang.Object r0 = r14.f12871h
            x8.b r0 = (x8.b) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r0 = r0.f21231a
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.S(r2, r0)
            goto L55
        L4b:
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.V(r2, r0)
        L55:
            r1.setValue(r0)
            goto L10
        L59:
            java.lang.Object r0 = r14.f12871h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r14.f12872i
            wb.fu r1 = (wb.fu) r1
            java.lang.String r1 = r1.f16280a
            r0.invoke(r1)
            goto L10
        L67:
            java.lang.Object r0 = r14.f12871h
            v8.a r0 = (v8.a) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r0 = r0.f14201a
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L88
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.S(r2, r0)
            goto L92
        L88:
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.V(r2, r0)
        L92:
            r1.setValue(r0)
            goto L10
        L97:
            java.lang.Object r0 = r14.f12871h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r14.f12872i
            x9.f r1 = (x9.f) r1
            r0.invoke(r1)
            goto L10
        La4:
            java.lang.Object r0 = r14.f12871h
            ua.h r0 = (ua.h) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r0 = r0.f13618a
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto Lc5
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.S(r2, r0)
            goto Lcf
        Lc5:
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.V(r2, r0)
        Lcf:
            r1.setValue(r0)
            goto L10
        Ld4:
            java.lang.Object r0 = r14.f12871h
            ua.i r0 = (ua.i) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            java.lang.String r0 = r0.f13623a
            r1.setValue(r0)
            goto L10
        Le3:
            java.lang.Object r0 = r14.f12871h
            aa.a r0 = (aa.a) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r0 = r0.f104a
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L104
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.S(r2, r0)
            goto L10e
        L104:
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.V(r2, r0)
        L10e:
            r1.setValue(r0)
            goto L10
        L113:
            java.lang.Object r0 = r14.f12871h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r14.f12872i
            e9.c r1 = (e9.c) r1
            java.lang.String r1 = r1.f2391b
            r0.invoke(r1)
            goto L10
        L122:
            java.lang.Object r0 = r14.f12871h
            e9.c r0 = (e9.c) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r0 = r0.f2391b
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L143
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.S(r2, r0)
            goto L14d
        L143:
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.V(r2, r0)
        L14d:
            r1.setValue(r0)
            goto L10
        L152:
            java.lang.Object r0 = r14.f12871h
            na.i r0 = (na.i) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r0 = r0.f9143a
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L173
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.S(r2, r0)
            goto L17d
        L173:
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.LinkedHashSet r0 = tf.d0.V(r2, r0)
        L17d:
            r1.setValue(r0)
            goto L10
        L182:
            java.lang.Object r0 = r14.f12871h
            na.j r0 = (na.j) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            java.lang.String r0 = r0.f9150a
            r1.setValue(r0)
            goto L10
        L191:
            java.lang.Object r0 = r14.f12871h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r14.f12872i
            ua.i r1 = (ua.i) r1
            java.lang.String r1 = r1.f13623a
            r0.invoke(r1)
            goto L10
        L1a0:
            java.lang.Object r0 = r14.f12871h
            k9.j r0 = (k9.j) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            wb.q3 r2 = new wb.q3
            r2.<init>(r0, r0)
            r1.setValue(r2)
            goto L10
        L1b2:
            java.lang.Object r0 = r14.f12871h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r14.f12872i
            wb.c3 r1 = (wb.c3) r1
            r0.invoke(r1)
            goto L10
        L1bf:
            java.lang.Object r0 = r14.f12871h
            eb.c0 r0 = (eb.c0) r0
            java.lang.Object r1 = r14.f12872i
            android.content.Context r1 = (android.content.Context) r1
            h.Hchat.hooks.items.script.ScriptPluginRuntime r2 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.String r0 = r0.f2506a
            java.lang.Object r0 = r2.m12callOpenSettingsIoAF18A(r0)
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L1ea
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L1e0
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L1e0
            goto L1e2
        L1e0:
            java.lang.String r0 = "打开设置失败"
        L1e2:
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L1ea:
            sf.n r0 = sf.n.f12433a
            return r0
        L1ed:
            java.lang.Object r0 = r14.f12871h
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.Object r1 = r14.f12872i
            android.content.Context r1 = (android.content.Context) r1
            r2 = 0
            if (r0 != 0) goto L202
            java.lang.String r0 = "当前页面无法打开文件管理器"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
            goto L266
        L202:
            wb.r0 r1 = wb.r0.f18746a
            java.lang.String r3 = "Hchat_config_"
            monitor-enter(r1)
            wb.r0.f18749d = r0     // Catch: java.lang.Throwable -> L269
            java.lang.Class r4 = r0.getClass()     // Catch: java.lang.Throwable -> L269
            r1.a(r4)     // Catch: java.lang.Throwable -> L269
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r1.a(r4)     // Catch: java.lang.Throwable -> L269
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L269
            java.lang.String r5 = "yyyyMMdd_HHmmss"
            java.util.Locale r6 = java.util.Locale.US     // Catch: java.lang.Throwable -> L269
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L269
            java.util.Date r5 = new java.util.Date     // Catch: java.lang.Throwable -> L269
            r5.<init>()     // Catch: java.lang.Throwable -> L269
            java.lang.String r4 = r4.format(r5)     // Catch: java.lang.Throwable -> L269
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L269
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L269
            r5.append(r4)     // Catch: java.lang.Throwable -> L269
            java.lang.String r3 = ".json"
            r5.append(r3)     // Catch: java.lang.Throwable -> L269
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L269
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L269
            java.lang.String r5 = "android.intent.action.CREATE_DOCUMENT"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L269
            java.lang.String r5 = "android.intent.category.OPENABLE"
            r4.addCategory(r5)     // Catch: java.lang.Throwable -> L269
            java.lang.String r5 = "application/json"
            r4.setType(r5)     // Catch: java.lang.Throwable -> L269
            java.lang.String r5 = "android.intent.extra.TITLE"
            r4.putExtra(r5, r3)     // Catch: java.lang.Throwable -> L269
            r3 = 2
            r4.addFlags(r3)     // Catch: java.lang.Throwable -> L269
            wb.ho.B4(r0, r4)     // Catch: java.lang.Throwable -> L269
            r3 = 1212371544(0x48435258, float:200009.38)
            r0.startActivityForResult(r4, r3)     // Catch: java.lang.Throwable -> L25c
            goto L265
        L25c:
            java.lang.String r3 = "当前系统不支持创建配置文件"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r3, r2)     // Catch: java.lang.Throwable -> L269
            r0.show()     // Catch: java.lang.Throwable -> L269
        L265:
            monitor-exit(r1)
        L266:
            sf.n r0 = sf.n.f12433a
            return r0
        L269:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L269
            throw r0
        L26c:
            java.lang.Object r0 = r14.f12871h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r14.f12872i
            vb.a r1 = (vb.a) r1
            r0.invoke(r1)
            goto L10
        L279:
            java.lang.Object r0 = r14.f12871h
            fg.p r0 = (fg.p) r0
            java.lang.Object r1 = r14.f12872i
            wb.d3 r1 = (wb.d3) r1
            vb.a r2 = r1.f15601a
            wb.c3 r1 = r1.f15602b
            r0.invoke(r2, r1)
            goto L10
        L28a:
            java.lang.Object r0 = r14.f12871h
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r1.getValue()
            java.util.Set r2 = (java.util.Set) r2
            int r2 = r2.size()
            int r3 = r0.size()
            if (r2 != r3) goto L2a5
            tf.v r0 = tf.v.f13169g
            goto L2c3
        L2a5:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2ae:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2c2
            java.lang.Object r3 = r0.next()
            sf.j r3 = (sf.j) r3
            java.lang.Object r3 = r3.f12428g
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L2ae
        L2c2:
            r0 = r2
        L2c3:
            r1.setValue(r0)
            goto L10
        L2c8:
            java.lang.Object r0 = r14.f12871h
            i0.j1 r0 = (i0.j1) r0
            java.lang.Object r1 = r14.f12872i
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.setValue(r2)
            java.lang.String r0 = "已同意协议，重启微信后完整启用模块功能"
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
            goto L10
        L2e1:
            java.lang.Object r0 = r14.f12871h
            wb.xi r0 = (wb.xi) r0
            java.lang.Object r1 = r14.f12872i
            c9.r0 r1 = (c9.r0) r1
            r0.invoke()
            r1.invoke()
            goto L10
        L2f1:
            java.lang.Object r0 = r14.f12871h
            c9.n0 r0 = (c9.n0) r0
            java.lang.Object r1 = r14.f12872i
            fg.a r1 = (fg.a) r1
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L308
            r1.invoke()
        L308:
            sf.n r0 = sf.n.f12433a
            return r0
        L30b:
            java.lang.Object r0 = r14.f12871h
            r8.g r0 = (r8.g) r0
            java.lang.Object r1 = r14.f12872i
            c9.g r1 = (c9.g) r1
            android.content.Context r2 = r0.f11620a     // Catch: java.lang.Throwable -> L33d
            java.lang.String r3 = "Hchat_protobuf_packet_config"
            android.content.SharedPreferences r7 = ub.b.c(r2, r3)     // Catch: java.lang.Throwable -> L33d
            wa.g r4 = new wa.g     // Catch: java.lang.Throwable -> L33d
            java.lang.ClassLoader r5 = r0.f11622c     // Catch: java.lang.Throwable -> L33d
            h.Hchat.dexkit.DexFinder r6 = r0.f11624e     // Catch: java.lang.Throwable -> L33d
            b5.c r8 = new b5.c     // Catch: java.lang.Throwable -> L33d
            android.content.Context r0 = r0.f11620a     // Catch: java.lang.Throwable -> L33d
            r2 = 28
            r8.<init>(r0, r2)     // Catch: java.lang.Throwable -> L33d
            okio.a r9 = new okio.a     // Catch: java.lang.Throwable -> L33d
            r0 = 23
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L33d
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L33d
            boolean r0 = r4.m()     // Catch: java.lang.Throwable -> L33d
            if (r0 == 0) goto L344
            wa.j.f14925a = r4     // Catch: java.lang.Throwable -> L33d
            goto L344
        L33d:
            r0 = move-exception
            java.lang.String r2 = "Protobuf 安装失败"
            r1.e(r2, r0)
            r0 = 0
        L344:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L349:
            java.lang.Object r0 = r14.f12871h
            i2.e r0 = (i2.e) r0
            java.lang.Object r1 = r14.f12872i
            y1.p0 r1 = (y1.p0) r1
            java.lang.Object r0 = r0.f6288a
            i2.m r0 = (i2.m) r0
            boolean r2 = r0 instanceof i2.l
            if (r2 == 0) goto L360
            i2.l r0 = (i2.l) r0     // Catch: java.lang.IllegalArgumentException -> L360
            java.lang.String r0 = r0.f6352a     // Catch: java.lang.IllegalArgumentException -> L360
            r1.a(r0)     // Catch: java.lang.IllegalArgumentException -> L360
        L360:
            sf.n r0 = sf.n.f12433a
            return r0
        L363:
            java.lang.Object r0 = r14.f12871h
            w.n1 r0 = (w.n1) r0
            java.lang.Object r1 = r14.f12872i
            i2.g r1 = (i2.g) r1
            if (r0 == 0) goto L398
            w0.p r2 = r0.f14577c
            boolean r3 = r2.isEmpty()
            i2.g r4 = r0.f14576b
            if (r3 == 0) goto L378
            goto L392
        L378:
            w.v0 r3 = new w.v0
            r3.<init>(r4)
            int r4 = r2.size()
            r5 = 0
        L382:
            if (r5 >= r4) goto L390
            java.lang.Object r6 = r2.get(r5)
            fg.l r6 = (fg.l) r6
            r6.invoke(r3)
            int r5 = r5 + 1
            goto L382
        L390:
            i2.g r4 = r3.f14687b
        L392:
            r0.f14576b = r4
            if (r4 != 0) goto L397
            goto L398
        L397:
            r1 = r4
        L398:
            return r1
        L399:
            java.lang.Object r0 = r14.f12871h
            n2.s r0 = (n2.s) r0
            java.lang.Object r1 = r14.f12872i
            i0.a1 r1 = (i0.a1) r1
            long r2 = r0.f8977b
            java.lang.Object r4 = r1.getValue()
            n2.s r4 = (n2.s) r4
            long r4 = r4.f8977b
            boolean r2 = i2.m0.b(r2, r4)
            if (r2 == 0) goto L3c1
            i2.m0 r2 = r0.f8978c
            java.lang.Object r3 = r1.getValue()
            n2.s r3 = (n2.s) r3
            i2.m0 r3 = r3.f8978c
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L3c4
        L3c1:
            r1.setValue(r0)
        L3c4:
            sf.n r0 = sf.n.f12433a
            return r0
        L3c7:
            java.lang.Object r0 = r14.f12871h
            r8.g r0 = (r8.g) r0
            java.lang.Object r1 = r14.f12872i
            r4 = r1
            ua.b r4 = (ua.b) r4
            java.lang.Class<ua.b> r1 = ua.b.class
            r11 = 0
            ua.g r12 = ua.g.f13616a     // Catch: java.lang.Throwable -> L418
            ia.t r2 = new ia.t     // Catch: java.lang.Throwable -> L418
            gg.f r3 = gg.v.a(r1)     // Catch: java.lang.Throwable -> L418
            java.lang.Class r5 = r3.a()     // Catch: java.lang.Throwable -> L418
            r5.getClass()     // Catch: java.lang.Throwable -> L418
            java.lang.String r6 = "logError"
            java.lang.String r7 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r9 = 0
            r10 = 25
            r3 = 2
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L418
            r12.e(r0, r2)     // Catch: java.lang.Throwable -> L418
            ua.k r2 = r4.f13572h     // Catch: java.lang.Throwable -> L418
            if (r2 != 0) goto L41a
            ua.k r12 = new ua.k     // Catch: java.lang.Throwable -> L418
            android.content.Context r13 = r0.f11620a     // Catch: java.lang.Throwable -> L418
            ia.t r2 = new ia.t     // Catch: java.lang.Throwable -> L418
            gg.f r1 = gg.v.a(r1)     // Catch: java.lang.Throwable -> L418
            java.lang.Class r5 = r1.a()     // Catch: java.lang.Throwable -> L418
            r5.getClass()     // Catch: java.lang.Throwable -> L418
            java.lang.String r6 = "logError"
            java.lang.String r7 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r9 = 0
            r10 = 26
            r3 = 2
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L418
            r12.<init>(r13, r2)     // Catch: java.lang.Throwable -> L418
            r4.f13572h = r12     // Catch: java.lang.Throwable -> L418
            goto L41a
        L418:
            r0 = move-exception
            goto L44b
        L41a:
            boolean r1 = r4.f13571g     // Catch: java.lang.Throwable -> L418
            r2 = 1
            if (r1 == 0) goto L421
        L41f:
            r11 = r2
            goto L450
        L421:
            i8.c r1 = h.Hchat.hooks.api.core.WeChatApis.message()     // Catch: java.lang.Throwable -> L418
            r1.getClass()     // Catch: java.lang.Throwable -> L418
            k8.p r1 = h.Hchat.hooks.api.core.WeChatApis.l()     // Catch: java.lang.Throwable -> L418
            if (r1 == 0) goto L444
            boolean r3 = r1.c()     // Catch: java.lang.Throwable -> L418
            if (r3 != 0) goto L435
            goto L444
        L435:
            ua.a r3 = new ua.a     // Catch: java.lang.Throwable -> L418
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> L418
            a2.a r0 = r1.e(r3)     // Catch: java.lang.Throwable -> L418
            r4.j(r0)     // Catch: java.lang.Throwable -> L418
            r4.f13571g = r2     // Catch: java.lang.Throwable -> L418
            goto L41f
        L444:
            java.lang.String r0 = "消息观察不可用，自动收款未安装"
            r1 = 0
            r4.e(r0, r1)     // Catch: java.lang.Throwable -> L418
            goto L450
        L44b:
            java.lang.String r1 = "自动收款安装失败"
            r4.e(r1, r0)
        L450:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L455:
            java.lang.Object r0 = r14.f12871h
            sh.x r0 = (sh.x) r0
            java.lang.Object r1 = r14.f12872i
            i0.l2 r1 = (i0.l2) r1
            if (r0 == 0) goto L46a
            sh.e2 r2 = r0.f12893a
            if (r2 == 0) goto L46a
            float r2 = r2.f12572a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L46b
        L46a:
            r2 = 0
        L46b:
            java.lang.Object r3 = r1.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = -r3
            if (r2 == 0) goto L481
            float r2 = r2.floatValue()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L481
            goto L494
        L481:
            if (r0 == 0) goto L494
            sh.e2 r0 = r0.f12893a
            if (r0 == 0) goto L494
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = -r1
            r0.f12572a = r1
        L494:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
