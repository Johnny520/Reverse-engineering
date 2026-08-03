package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1561j;

    public /* synthetic */ r(long r2, nb.w r4, java.lang.String r5) {
            r1 = this;
            r0 = 3
            r1.f1558g = r0
            r1.<init>()
            r1.f1559h = r2
            r1.f1560i = r4
            r1.f1561j = r5
            return
    }

    public /* synthetic */ r(h.Hchat.hooks.items.script.ScriptWaBridge r2, long r3, a1.d r5) {
            r1 = this;
            r0 = 1
            r1.f1558g = r0
            r1.<init>()
            r1.f1560i = r2
            r1.f1559h = r3
            r1.f1561j = r5
            return
    }

    public /* synthetic */ r(java.lang.Object r1, java.lang.Object r2, long r3, int r5) {
            r0 = this;
            r0.f1558g = r5
            r0.f1560i = r1
            r0.f1561j = r2
            r0.f1559h = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r18 = this;
            r1 = r18
            int r0 = r1.f1558g
            switch(r0) {
                case 0: goto L3ad;
                case 1: goto L39f;
                case 2: goto L2af;
                case 3: goto L273;
                case 4: goto L265;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f1560i
            r2 = r0
            rb.k r2 = (rb.k) r2
            java.lang.Object r0 = r1.f1561j
            r3 = r0
            rb.d r3 = (rb.d) r3
            long r4 = r1.f1559h
            rb.l r0 = r2.f11906c
            android.content.SharedPreferences r0 = r0.f11928a
            java.lang.String r6 = "zombie_check_auto_tag"
            r7 = 1
            boolean r0 = r0.getBoolean(r6, r7)
            r6 = 0
            if (r0 == 0) goto L1e2
            java.lang.String r10 = r3.f11881a
            rb.l r0 = r2.f11906c
            android.content.SharedPreferences r0 = r0.f11928a
            java.lang.String r11 = "zombie_check_label_name"
            java.lang.String r12 = "僵尸粉"
            java.lang.String r0 = r0.getString(r11, r12)
            if (r0 != 0) goto L33
            java.lang.String r0 = ""
        L33:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r11 = og.m.t0(r0)
            if (r11 == 0) goto L42
            goto L43
        L42:
            r12 = r0
        L43:
            tf.t r11 = tf.t.f13167g
            boolean r0 = r2.a(r4)
            if (r0 != 0) goto L50
            r0 = r6
            r16 = 1000(0x3e8, double:4.94E-321)
            goto L1b9
        L50:
            g8.i r13 = h.Hchat.hooks.api.core.WeChatApis.contacts()
            if (r13 == 0) goto L1b5
            java.util.ArrayList r0 = r13.p()     // Catch: java.lang.Throwable -> L5b
            goto L62
        L5b:
            r0 = move-exception
            sf.f r14 = new sf.f
            r14.<init>(r0)
            r0 = r14
        L62:
            boolean r14 = r0 instanceof sf.f
            if (r14 == 0) goto L68
            r0 = r11
        L68:
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r15 = r0.iterator()
        L73:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L8e
            r16 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = r15.next()
            r9 = r8
            h.Hchat.hooks.api.model.ContactLabelBean r9 = (h.Hchat.hooks.api.model.ContactLabelBean) r9
            java.util.List<java.lang.String> r9 = r9.userNameList
            boolean r9 = r9.contains(r10)
            if (r9 == 0) goto L73
            r14.add(r8)
            goto L73
        L8e:
            r16 = 1000(0x3e8, double:4.94E-321)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = tf.n.e1(r14)
            r8.<init>(r9)
            java.util.Iterator r9 = r14.iterator()
        L9d:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto Laf
            java.lang.Object r14 = r9.next()
            h.Hchat.hooks.api.model.ContactLabelBean r14 = (h.Hchat.hooks.api.model.ContactLabelBean) r14
            java.lang.String r14 = r14.labelName
            r8.add(r14)
            goto L9d
        Laf:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        Lb8:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto Lcf
            java.lang.Object r14 = r8.next()
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = og.m.t0(r15)
            if (r15 != 0) goto Lb8
            r9.add(r14)
            goto Lb8
        Lcf:
            java.util.Set r8 = tf.m.T1(r9)
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto Lda
            goto Lf3
        Lda:
            java.util.Iterator r9 = r0.iterator()
        Lde:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto Lf3
            java.lang.Object r14 = r9.next()
            h.Hchat.hooks.api.model.ContactLabelBean r14 = (h.Hchat.hooks.api.model.ContactLabelBean) r14
            java.lang.String r14 = r14.labelName
            boolean r14 = gg.l.a(r14, r12)
            if (r14 == 0) goto Lde
            goto L149
        Lf3:
            java.lang.String r9 = r13.a(r12)
            r9.getClass()
            boolean r9 = og.m.t0(r9)
            if (r9 == 0) goto L103
        L100:
            r0 = r6
            goto L1b9
        L103:
            r9 = r6
        L104:
            r14 = 15
            if (r9 >= r14) goto L149
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto L10f
            goto L128
        L10f:
            java.util.Iterator r14 = r0.iterator()
        L113:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L128
            java.lang.Object r15 = r14.next()
            h.Hchat.hooks.api.model.ContactLabelBean r15 = (h.Hchat.hooks.api.model.ContactLabelBean) r15
            java.lang.String r15 = r15.labelName
            boolean r15 = gg.l.a(r15, r12)
            if (r15 == 0) goto L113
            goto L149
        L128:
            int r9 = r9 + 1
            boolean r0 = r2.a(r4)
            if (r0 != 0) goto L131
            goto L100
        L131:
            java.lang.Thread.sleep(r16)     // Catch: java.lang.Throwable -> L134
        L134:
            java.util.ArrayList r0 = r13.p()     // Catch: java.lang.Throwable -> L139
            goto L140
        L139:
            r0 = move-exception
            sf.f r14 = new sf.f
            r14.<init>(r0)
            r0 = r14
        L140:
            boolean r14 = r0 instanceof sf.f
            if (r14 == 0) goto L146
            r0 = r11
        L146:
            java.util.List r0 = (java.util.List) r0
            goto L104
        L149:
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L150
            goto L100
        L150:
            java.util.Iterator r0 = r0.iterator()
        L154:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L100
            java.lang.Object r9 = r0.next()
            h.Hchat.hooks.api.model.ContactLabelBean r9 = (h.Hchat.hooks.api.model.ContactLabelBean) r9
            java.lang.String r9 = r9.labelName
            boolean r9 = gg.l.a(r9, r12)
            if (r9 == 0) goto L154
            boolean r0 = r2.a(r4)
            if (r0 != 0) goto L16f
            goto L100
        L16f:
            r8.add(r12)
            java.util.List r0 = tf.m.P1(r8)     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r13.P(r10, r0)     // Catch: java.lang.Throwable -> L17f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L17f
            goto L186
        L17f:
            r0 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        L186:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r9 = r0 instanceof sf.f
            if (r9 == 0) goto L18d
            r0 = r8
        L18d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L197
            goto L100
        L197:
            boolean r0 = r13.C(r10, r12)     // Catch: java.lang.Throwable -> L1a0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1a0
            goto L1a7
        L1a0:
            r0 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        L1a7:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r9 = r0 instanceof sf.f
            if (r9 == 0) goto L1ae
            r0 = r8
        L1ae:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L1b9
        L1b5:
            r16 = 1000(0x3e8, double:4.94E-321)
            goto L100
        L1b9:
            java.lang.Object r8 = r2.f11907d
            monitor-enter(r8)
            java.lang.String r9 = r3.f11882b     // Catch: java.lang.Throwable -> L1c3
            if (r0 == 0) goto L1c5
            java.lang.String r0 = "已追加标签"
            goto L1c7
        L1c3:
            r0 = move-exception
            goto L1e0
        L1c5:
            java.lang.String r0 = "标签处理失败"
        L1c7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c3
            r10.<init>()     // Catch: java.lang.Throwable -> L1c3
            r10.append(r9)     // Catch: java.lang.Throwable -> L1c3
            java.lang.String r9 = ": "
            r10.append(r9)     // Catch: java.lang.Throwable -> L1c3
            r10.append(r0)     // Catch: java.lang.Throwable -> L1c3
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L1c3
            r2.b(r0)     // Catch: java.lang.Throwable -> L1c3
            monitor-exit(r8)
            goto L1e4
        L1e0:
            monitor-exit(r8)
            throw r0
        L1e2:
            r16 = 1000(0x3e8, double:4.94E-321)
        L1e4:
            rb.l r0 = r2.f11906c
            android.content.SharedPreferences r0 = r0.f11928a
            java.lang.String r8 = "zombie_check_auto_delete"
            boolean r0 = r0.getBoolean(r8, r6)
            if (r0 != 0) goto L1f2
            goto L264
        L1f2:
            rb.l r0 = r2.f11906c
            android.content.SharedPreferences r0 = r0.f11928a
            java.lang.String r8 = "zombie_check_delete_delay_seconds"
            r9 = 3
            int r0 = r0.getInt(r8, r9)
            r8 = 300(0x12c, float:4.2E-43)
            int r0 = r9.e0.r(r0, r6, r8)
            long r8 = (long) r0
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L20f
            long r8 = r8 * r16
            java.lang.Thread.sleep(r8)     // Catch: java.lang.Throwable -> L20f
        L20f:
            rb.l r0 = r2.f11906c
            android.content.SharedPreferences r0 = r0.f11928a
            java.lang.String r8 = "zombie_check_auto_delete"
            boolean r0 = r0.getBoolean(r8, r6)
            if (r0 == 0) goto L264
            boolean r0 = r2.a(r4)
            if (r0 != 0) goto L222
            goto L264
        L222:
            rb.c r0 = r2.f11914k
            if (r0 == 0) goto L23b
            java.lang.String r4 = r3.f11881a
            rb.l r5 = r2.f11906c
            android.content.SharedPreferences r5 = r5.f11928a
            java.lang.String r8 = "zombie_check_clear_record"
            boolean r5 = r5.getBoolean(r8, r6)
            boolean r0 = r0.b(r4, r5)
            if (r0 != r7) goto L239
            goto L23a
        L239:
            r7 = r6
        L23a:
            r6 = r7
        L23b:
            java.lang.Object r4 = r2.f11907d
            monitor-enter(r4)
            java.lang.String r0 = r3.f11882b     // Catch: java.lang.Throwable -> L245
            if (r6 == 0) goto L247
            java.lang.String r3 = "已提交删除好友"
            goto L249
        L245:
            r0 = move-exception
            goto L262
        L247:
            java.lang.String r3 = "删除好友失败"
        L249:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L245
            r5.<init>()     // Catch: java.lang.Throwable -> L245
            r5.append(r0)     // Catch: java.lang.Throwable -> L245
            java.lang.String r0 = ": "
            r5.append(r0)     // Catch: java.lang.Throwable -> L245
            r5.append(r3)     // Catch: java.lang.Throwable -> L245
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L245
            r2.b(r0)     // Catch: java.lang.Throwable -> L245
            monitor-exit(r4)
            goto L264
        L262:
            monitor-exit(r4)
            throw r0
        L264:
            return
        L265:
            java.lang.Object r0 = r1.f1560i
            o8.j r0 = (o8.j) r0
            java.lang.Object r2 = r1.f1561j
            java.lang.String r2 = (java.lang.String) r2
            long r3 = r1.f1559h
            r0.b(r3, r2)
            return
        L273:
            long r2 = r1.f1559h
            java.lang.Object r0 = r1.f1560i
            nb.w r0 = (nb.w) r0
            java.lang.Object r4 = r1.f1561j
            java.lang.String r4 = (java.lang.String) r4
            long r5 = r0.f9319i
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L2ae
            boolean r2 = r0.f9318h
            if (r2 != 0) goto L288
            goto L2ae
        L288:
            r2 = 0
            r0.f9320j = r2
            boolean r2 = og.m.t0(r4)
            if (r2 == 0) goto L293
            java.lang.String r4 = "系统默认"
        L293:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "引擎 "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " 初始化超时"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r2)
            r0.v(r3)
        L2ae:
            return
        L2af:
            java.lang.Object r0 = r1.f1560i
            r2 = r0
            ha.h r2 = (ha.h) r2
            java.lang.Object r3 = r1.f1561j
            long r6 = r1.f1559h
            java.lang.String r4 = "暂时无法确认当前账号"
            ab.b r5 = r2.f5213a
            boolean r0 = r2.g(r6)
            if (r0 != 0) goto L2c4
            goto L39e
        L2c4:
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            r8 = 0
            if (r0 != 0) goto L2d2
            java.lang.String r0 = "朋友圈自动转发 API 未就绪"
            r5.invoke(r0, r8)
            goto L39e
        L2d2:
            ha.c0 r0 = oh.h.z(r3, r0)     // Catch: java.lang.Throwable -> L2d7
            goto L2de
        L2d7:
            r0 = move-exception
            sf.f r9 = new sf.f
            r9.<init>(r0)
            r0 = r9
        L2de:
            java.lang.Throwable r9 = sf.g.b(r0)
            if (r9 == 0) goto L2e9
            java.lang.String r10 = "解析朋友圈记录失败"
            r5.invoke(r10, r9)
        L2e9:
            boolean r9 = r0 instanceof sf.f
            if (r9 == 0) goto L2ee
            r0 = r8
        L2ee:
            ha.c0 r0 = (ha.c0) r0
            if (r0 == 0) goto L39e
            java.lang.String r9 = r0.f5168a
            java.lang.Object r10 = r2.f5218f
            monitor-enter(r10)
            java.util.LinkedHashSet r11 = r2.f5220h     // Catch: java.lang.Throwable -> L39b
            boolean r11 = r11.contains(r9)     // Catch: java.lang.Throwable -> L39b
            monitor-exit(r10)
            if (r11 != 0) goto L39e
            java.util.concurrent.ConcurrentHashMap r10 = r2.f5221i
            boolean r10 = r10.containsKey(r9)
            if (r10 == 0) goto L30a
            goto L39e
        L30a:
            java.lang.String r10 = r2.q(r0)
            if (r10 == 0) goto L337
            boolean r11 = r10.equals(r4)
            if (r11 != 0) goto L337
            java.lang.String r0 = r0.f5170c
            java.lang.String r0 = r2.b(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "忽略 "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = "："
            r3.append(r0)
            r3.append(r10)
            java.lang.String r0 = r3.toString()
            r2.i(r0)
            goto L39e
        L337:
            p8.o r10 = r2.f5215c
            p8.v r3 = r10.u(r3)
            if (r3 != 0) goto L349
            java.lang.String r0 = "暂时无法解析朋友圈原生内容: snsId="
            java.lang.String r0 = r0.concat(r9)
            r5.invoke(r0, r8)
            goto L39e
        L349:
            int r5 = r3.f10428c
            r8 = 54
            if (r5 != r8) goto L352
            ha.t r5 = ha.t.f5282k
            goto L376
        L352:
            r8 = 1
            if (r5 != r8) goto L358
            ha.t r5 = ha.t.f5280i
            goto L376
        L358:
            r8 = 5
            if (r5 == r8) goto L374
            r8 = 15
            if (r5 != r8) goto L360
            goto L374
        L360:
            ha.d0 r5 = r0.f5172e
            ha.d0 r8 = ha.d0.f5187i
            if (r5 != r8) goto L371
            java.util.ArrayList r5 = r3.f10429d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L371
            ha.t r5 = ha.t.f5279h
            goto L376
        L371:
            ha.t r5 = ha.t.f5283l
            goto L376
        L374:
            ha.t r5 = ha.t.f5281j
        L376:
            java.lang.String r8 = r2.o(r0, r3, r5)
            if (r8 == 0) goto L391
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L38c
            long r8 = r2.l()
            r4 = r3
            r3 = r0
            r2.p(r3, r4, r5, r6, r8)
            goto L39e
        L38c:
            r3 = r0
            r2.d(r3, r6, r8)
            goto L39e
        L391:
            r4 = r3
            r3 = r0
            long r8 = r2.l()
            r2.p(r3, r4, r5, r6, r8)
            goto L39e
        L39b:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        L39e:
            return
        L39f:
            java.lang.Object r0 = r1.f1560i
            h.Hchat.hooks.items.script.ScriptWaBridge r0 = (h.Hchat.hooks.items.script.ScriptWaBridge) r0
            long r2 = r1.f1559h
            java.lang.Object r4 = r1.f1561j
            a1.d r4 = (a1.d) r4
            h.Hchat.hooks.items.script.ScriptWaBridge.B(r0, r2, r4)
            return
        L3ad:
            java.lang.Object r0 = r1.f1560i
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r0 = r1.f1561j
            r3 = r0
            ca.e0 r3 = (ca.e0) r3
            long r5 = r1.f1559h
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L411
            boolean r0 = r2.isDestroyed()
            if (r0 == 0) goto L3c6
            goto L411
        L3c6:
            r3.getClass()
            java.lang.String r0 = "转发[H]"
            java.lang.String r8 = ""
            java.lang.String r4 = "转发到朋友圈"
            java.lang.String r7 = ""
            sf.e r9 = new sf.e
            r9.<init>(r4, r7)
            java.lang.String r4 = "转发给好友"
            sf.e r10 = new sf.e
            r10.<init>(r4, r7)
            java.lang.String r4 = "分享"
            sf.e r11 = new sf.e
            r11.<init>(r4, r7)
            java.lang.String r4 = "群发助手"
            sf.e r12 = new sf.e
            r12.<init>(r4, r7)
            java.lang.String r4 = "转发至标签"
            sf.e r13 = new sf.e
            r13.<init>(r4, r7)
            sf.e[] r4 = new sf.e[]{r9, r10, r11, r12, r13}
            java.util.List r9 = a.a.y0(r4)
            r4 = r2
            ca.i r2 = new ca.i
            r7 = 0
            r2.<init>(r3, r4, r5, r7)
            bi.c r7 = new bi.c
            r3 = 7
            r7.<init>(r3)
            r6 = r2
            r2 = r4
            r4 = r8
            wb.lv r8 = wb.lv.f17583j
            r3 = r0
            r5 = r9
            wb.y2.Q1(r2, r3, r4, r5, r6, r7, r8)
        L411:
            return
    }
}
