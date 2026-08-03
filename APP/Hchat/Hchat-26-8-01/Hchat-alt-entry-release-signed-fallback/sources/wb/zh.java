package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zh implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20630j;

    public /* synthetic */ zh(int r1, android.content.Context r2, java.lang.Object r3, java.lang.Object r4) {
            r0 = this;
            r0.f20627g = r1
            r0.f20628h = r2
            r0.f20629i = r3
            r0.f20630j = r4
            r0.<init>()
            return
    }

    public /* synthetic */ zh(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f20627g = r4
            r0.f20629i = r1
            r0.f20628h = r2
            r0.f20630j = r3
            r0.<init>()
            return
    }

    public /* synthetic */ zh(xa.m r2, xa.i r3, java.lang.String r4) {
            r1 = this;
            r0 = 15
            r1.f20627g = r0
            r1.<init>()
            r1.f20628h = r2
            r1.f20630j = r3
            r1.f20629i = r4
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r27 = this;
            r1 = r27
            int r0 = r1.f20627g
            switch(r0) {
                case 0: goto L590;
                case 1: goto L541;
                case 2: goto L516;
                case 3: goto L4ef;
                case 4: goto L45f;
                case 5: goto L442;
                case 6: goto L42d;
                case 7: goto L38b;
                case 8: goto L35b;
                case 9: goto L338;
                case 10: goto L304;
                case 11: goto L2e9;
                case 12: goto L2d5;
                case 13: goto L2b6;
                case 14: goto L293;
                case 15: goto L194;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "setCurrentState"
            java.lang.Object r2 = r1.f20629i
            y9.e r2 = (y9.e) r2
            java.lang.Object r3 = r1.f20628h
            a9.c r3 = (a9.c) r3
            java.lang.Object r4 = r1.f20630j
            y9.d r4 = (y9.d) r4
            java.lang.String r5 = r4.f22331b
            java.lang.String r6 = r4.f22330a
            android.widget.TextView r3 = r3.f83a
            ib.b r7 = r2.f22333b
            android.content.SharedPreferences r7 = r7.f6650a
            java.lang.String r8 = ""
            g8.d r9 = j8.b.f()
            r10 = 1
            r11 = 0
            if (r9 == 0) goto L3b
            int r9 = r9.j(r6, r5)
            r12 = 2
            if (r9 != r12) goto L33
            java.lang.String r9 = "群主"
            goto L3c
        L33:
            if (r9 != r10) goto L38
            java.lang.String r9 = "管理员"
            goto L3c
        L38:
            java.lang.String r9 = "群员"
            goto L3c
        L3b:
            r9 = r11
        L3c:
            if (r9 != 0) goto L3f
            r9 = r8
        L3f:
            java.lang.String r12 = ib.b.a(r6, r5)
            java.lang.String r13 = "custom_title_"
            java.lang.String r12 = r13.concat(r12)
            java.lang.String r12 = r7.getString(r12, r8)
            if (r12 == 0) goto L50
            goto L51
        L50:
            r12 = r8
        L51:
            java.lang.String r16 = a7.a.k(r12)
            java.lang.String r12 = ib.b.a(r6, r5)
            java.lang.String r13 = "custom_color_"
            java.lang.String r12 = r13.concat(r12)
            java.lang.String r12 = r7.getString(r12, r8)
            if (r12 == 0) goto L66
            goto L67
        L66:
            r12 = r8
        L67:
            y9.f r12 = a7.a.G(r12)
            if (r12 == 0) goto L72
            java.lang.String r12 = r12.a()
            goto L73
        L72:
            r12 = r11
        L73:
            if (r12 != 0) goto L78
            r17 = r8
            goto L7a
        L78:
            r17 = r12
        L7a:
            java.lang.String r6 = ib.b.a(r6, r5)
            java.lang.String r12 = "custom_text_color_"
            java.lang.String r6 = r12.concat(r6)
            java.lang.String r6 = r7.getString(r6, r8)
            if (r6 == 0) goto L8b
            goto L8c
        L8b:
            r6 = r8
        L8c:
            y9.f r6 = a7.a.G(r6)
            if (r6 == 0) goto L97
            java.lang.String r6 = r6.a()
            goto L98
        L97:
            r6 = r11
        L98:
            if (r6 != 0) goto L9d
            r18 = r8
            goto L9f
        L9d:
            r18 = r6
        L9f:
            int r6 = r9.length()
            if (r6 <= 0) goto Lab
            java.lang.String r6 = " · "
            java.lang.String r8 = r6.concat(r9)
        Lab:
            java.lang.String r19 = r5.concat(r8)
            db.f r5 = new db.f
            r6 = 22
            r5.<init>(r2, r6, r4)
            wb.xi r6 = new wb.xi
            r7 = 28
            r6.<init>(r2, r7, r4)
            android.content.Context r2 = r3.getContext()
        Lc1:
            boolean r3 = r2 instanceof android.content.ContextWrapper
            if (r3 == 0) goto Ld4
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto Lcd
            android.app.Activity r2 = (android.app.Activity) r2
        Lcb:
            r15 = r2
            goto Ldc
        Lcd:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto Lc1
        Ld4:
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto Ldb
            android.app.Activity r2 = (android.app.Activity) r2
            goto Lcb
        Ldb:
            r15 = r11
        Ldc:
            if (r15 == 0) goto L191
            android.view.Window r2 = r15.getWindow()
            if (r2 == 0) goto Le9
            android.view.View r2 = r2.getDecorView()
            goto Lea
        Le9:
            r2 = r11
        Lea:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto Lf1
            r11 = r2
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
        Lf1:
            if (r11 == 0) goto L191
            c9.a1 r14 = new c9.a1
            r2 = 3
            r14.<init>(r2)
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r2.<init>(r3)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r15)
            r4.setBackgroundColor(r3)
            r4.setClickable(r10)
            r4.setFocusable(r10)
            r4.setFocusableInTouchMode(r10)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r7 = -1
            r3.<init>(r7, r7)
            r4.setLayoutParams(r3)
            x6.d.H(r11, r14, r14, r14, r14)
            x6.d.H(r4, r14, r14, r14, r14)
            androidx.lifecycle.s r3 = r14.f1096h
            boolean r8 = r14.f1100l
            if (r8 != 0) goto L12e
            p4.t r8 = r14.f1097i
            android.os.Bundle r9 = android.os.Bundle.EMPTY
            r8.F(r9)
            r14.f1100l = r10
        L12e:
            androidx.lifecycle.l r8 = androidx.lifecycle.l.f291i
            r3.c(r0)
            r3.e(r8)
            androidx.lifecycle.l r8 = androidx.lifecycle.l.f292j
            r3.c(r0)
            r3.e(r8)
            androidx.lifecycle.l r8 = androidx.lifecycle.l.f293k
            r3.c(r0)
            r3.e(r8)
            gg.u r25 = new gg.u
            r25.<init>()
            c9.r0 r20 = new c9.r0
            r26 = 7
            r21 = r2
            r22 = r4
            r23 = r11
            r24 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r0 = r22
            r2 = r25
            y1.c1 r3 = new y1.c1
            r3.<init>(r15)
            x6.d.H(r3, r14, r14, r14, r14)
            y1.r1 r4 = y1.r1.f22061h
            r3.setViewCompositionStrategy(r4)
            wb.c5 r13 = new wb.c5
            r23 = 0
            r21 = r5
            r22 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            s0.d r4 = new s0.d
            r5 = -63225563(0xfffffffffc3b4125, float:-3.8891232E36)
            r4.<init>(r5, r13, r10)
            r3.setContent(r4)
            r2.f4564g = r3
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r7, r7)
            r0.addView(r3, r2)
            r11.addView(r0)
            r0.requestFocus()
        L191:
            sf.n r0 = sf.n.f12433a
            return r0
        L194:
            java.lang.Object r0 = r1.f20628h
            xa.m r0 = (xa.m) r0
            java.lang.Object r2 = r1.f20630j
            xa.i r2 = (xa.i) r2
            java.lang.Object r3 = r1.f20629i
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = r2.f21439b
            r0.getClass()
            tf.t r4 = tf.t.f13167g
            g8.i r5 = h.Hchat.hooks.api.core.WeChatApis.contacts()
            r6 = 0
            if (r5 == 0) goto L28b
            java.util.ArrayList r0 = r5.p()     // Catch: java.lang.Throwable -> L1b3
            goto L1ba
        L1b3:
            r0 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r0)
            r0 = r7
        L1ba:
            boolean r7 = r0 instanceof sf.f
            if (r7 == 0) goto L1c0
            r0 = r4
        L1c0:
            java.util.List r0 = (java.util.List) r0
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L1c9
            goto L1e2
        L1c9:
            java.util.Iterator r7 = r0.iterator()
        L1cd:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L1e2
            java.lang.Object r8 = r7.next()
            h.Hchat.hooks.api.model.ContactLabelBean r8 = (h.Hchat.hooks.api.model.ContactLabelBean) r8
            java.lang.String r8 = r8.labelName
            boolean r8 = gg.l.a(r8, r3)
            if (r8 == 0) goto L1cd
            goto L239
        L1e2:
            java.lang.String r7 = r5.a(r3)
            r7.getClass()
            boolean r7 = og.m.t0(r7)
            if (r7 == 0) goto L1f8
            xa.j r0 = new xa.j
            java.lang.String r2 = "创建好友标签失败"
            r0.<init>(r6, r2)
            goto L292
        L1f8:
            r7 = r6
        L1f9:
            r8 = 15
            if (r7 >= r8) goto L239
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L204
            goto L21d
        L204:
            java.util.Iterator r8 = r0.iterator()
        L208:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L21d
            java.lang.Object r9 = r8.next()
            h.Hchat.hooks.api.model.ContactLabelBean r9 = (h.Hchat.hooks.api.model.ContactLabelBean) r9
            java.lang.String r9 = r9.labelName
            boolean r9 = gg.l.a(r9, r3)
            if (r9 == 0) goto L208
            goto L239
        L21d:
            int r7 = r7 + 1
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r8)     // Catch: java.lang.Throwable -> L224
        L224:
            java.util.ArrayList r0 = r5.p()     // Catch: java.lang.Throwable -> L229
            goto L230
        L229:
            r0 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        L230:
            boolean r8 = r0 instanceof sf.f
            if (r8 == 0) goto L236
            r0 = r4
        L236:
            java.util.List r0 = (java.util.List) r0
            goto L1f9
        L239:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L240
            goto L283
        L240:
            java.util.Iterator r0 = r0.iterator()
        L244:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L283
            java.lang.Object r4 = r0.next()
            h.Hchat.hooks.api.model.ContactLabelBean r4 = (h.Hchat.hooks.api.model.ContactLabelBean) r4
            java.lang.String r4 = r4.labelName
            boolean r4 = gg.l.a(r4, r3)
            if (r4 == 0) goto L244
            boolean r0 = r5.O(r2, r3)     // Catch: java.lang.Throwable -> L261
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L261
            goto L268
        L261:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L268:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L26f
            r0 = r2
        L26f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            xa.j r2 = new xa.j
            if (r0 == 0) goto L27c
            java.lang.String r3 = "标签已创建并添加"
            goto L27e
        L27c:
            java.lang.String r3 = "添加好友标签失败"
        L27e:
            r2.<init>(r0, r3)
            r0 = r2
            goto L292
        L283:
            xa.j r0 = new xa.j
            java.lang.String r2 = "标签尚未同步，请稍后重试"
            r0.<init>(r6, r2)
            goto L292
        L28b:
            xa.j r0 = new xa.j
            java.lang.String r2 = "联系人标签不可用"
            r0.<init>(r6, r2)
        L292:
            return r0
        L293:
            java.lang.Object r0 = r1.f20629i
            xa.m r0 = (xa.m) r0
            java.lang.Object r2 = r1.f20628h
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r3 = r1.f20630j
            xa.j r3 = (xa.j) r3
            java.lang.String r3 = r3.f21442b
            r0.getClass()
            boolean r0 = xa.m.a(r2)
            if (r0 != 0) goto L2ab
            goto L2b3
        L2ab:
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r3, r0)
            r0.show()
        L2b3:
            sf.n r0 = sf.n.f12433a
            return r0
        L2b6:
            java.lang.Object r0 = r1.f20629i
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r2 = r1.f20628h
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r1.f20630j
            fg.a r3 = (fg.a) r3
            r4 = 0
            r5 = 1
            boolean r0 = r0.compareAndSet(r4, r5)
            if (r0 == 0) goto L2cf
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.invoke(r0)
        L2cf:
            r3.invoke()
        L2d2:
            sf.n r0 = sf.n.f12433a
            return r0
        L2d5:
            java.lang.Object r0 = r1.f20629i
            fg.l r0 = (fg.l) r0
            java.lang.Object r2 = r1.f20628h
            fb.d1 r2 = (fb.d1) r2
            java.lang.Object r3 = r1.f20630j
            i0.a1 r3 = (i0.a1) r3
            r4 = 0
            r3.setValue(r4)
            r0.invoke(r2)
            goto L2d2
        L2e9:
            java.lang.Object r0 = r1.f20629i
            wb.au r0 = (wb.au) r0
            java.lang.Object r2 = r1.f20628h
            i0.j1 r2 = (i0.j1) r2
            java.lang.Object r3 = r1.f20630j
            i0.j1 r3 = (i0.j1) r3
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r2.setValue(r4)
            r2 = 0
            r3.setValue(r2)
            fb.u2 r2 = fb.u2.f3819g
            r0.a(r2)
            goto L2d2
        L304:
            java.lang.Object r0 = r1.f20629i
            fg.l r0 = (fg.l) r0
            java.lang.Object r2 = r1.f20628h
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r1.f20630j
            fb.r0 r3 = (fb.r0) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L319:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L334
            java.lang.Object r5 = r2.next()
            r6 = r5
            fb.r0 r6 = (fb.r0) r6
            java.lang.String r6 = r6.f3744a
            java.lang.String r7 = r3.f3744a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L319
            r4.add(r5)
            goto L319
        L334:
            r0.invoke(r4)
            goto L2d2
        L338:
            java.lang.Object r0 = r1.f20629i
            fb.d1 r0 = (fb.d1) r0
            java.lang.Object r2 = r1.f20628h
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f20630j
            i0.a1 r3 = (i0.a1) r3
            boolean r4 = r0.f3495m
            if (r4 == 0) goto L353
            java.lang.String r0 = "请先解锁该对话"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r3)
            r0.show()
            goto L358
        L353:
            java.lang.String r0 = r0.f3483a
            r3.setValue(r0)
        L358:
            sf.n r0 = sf.n.f12433a
            return r0
        L35b:
            java.lang.Object r0 = r1.f20629i
            ab.e r0 = (ab.e) r0
            java.lang.Object r2 = r1.f20628h
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            java.lang.Object r3 = r1.f20630j
            gg.u r3 = (gg.u) r3
            java.util.WeakHashMap r4 = wb.fr.f16254c
            monitor-enter(r4)
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Throwable -> L37a
            java.lang.Object r3 = r3.f4564g     // Catch: java.lang.Throwable -> L37a
            if (r3 == 0) goto L382
            wb.dr r3 = (wb.dr) r3     // Catch: java.lang.Throwable -> L37a
            if (r5 != r3) goto L37c
            r4.remove(r2)     // Catch: java.lang.Throwable -> L37a
            goto L37c
        L37a:
            r0 = move-exception
            goto L389
        L37c:
            monitor-exit(r4)
            r0.invoke()
            goto L2d2
        L382:
            java.lang.String r0 = "handle"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L37a
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L37a
        L389:
            monitor-exit(r4)
            throw r0
        L38b:
            java.lang.Object r0 = r1.f20628h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f20629i
            eb.c0 r2 = (eb.c0) r2
            java.lang.Object r3 = r1.f20630j
            i0.a1 r3 = (i0.a1) r3
            r4 = r0
        L398:
            boolean r5 = r4 instanceof android.content.ContextWrapper
            if (r5 == 0) goto L3aa
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L3a3
            android.app.Activity r4 = (android.app.Activity) r4
            goto L3b2
        L3a3:
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            goto L398
        L3aa:
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L3b1
            android.app.Activity r4 = (android.app.Activity) r4
            goto L3b2
        L3b1:
            r4 = 0
        L3b2:
            if (r4 == 0) goto L420
            wb.ep r5 = wb.ep.f16002a
            wb.kp r0 = new wb.kp
            r6 = 3
            r0.<init>(r2, r3, r6)
            monitor-enter(r5)
            wb.dp r2 = new wb.dp     // Catch: java.lang.Throwable -> L41d
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L41d
            wb.ep.f16004c = r2     // Catch: java.lang.Throwable -> L41d
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L41d
            r5.a(r0)     // Catch: java.lang.Throwable -> L41d
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r5.a(r0)     // Catch: java.lang.Throwable -> L41d
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L41d
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L41d
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r0.addCategory(r2)     // Catch: java.lang.Throwable -> L41d
            java.lang.String r2 = "*/*"
            r0.setType(r2)     // Catch: java.lang.Throwable -> L41d
            java.lang.String r2 = "android.intent.extra.ALLOW_MULTIPLE"
            r3 = 1
            r0.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L41d
            r0.addFlags(r3)     // Catch: java.lang.Throwable -> L41d
            r2 = 64
            r0.addFlags(r2)     // Catch: java.lang.Throwable -> L41d
            wb.ho.B4(r4, r0)     // Catch: java.lang.Throwable -> L41d
            r2 = 1212371551(0x4843525f, float:200009.48)
            r4.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> L3f9
            goto L41b
        L3f9:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L41d
            java.lang.String r6 = "android.intent.action.GET_CONTENT"
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L41d
            java.lang.String r6 = "android.intent.category.OPENABLE"
            r0.addCategory(r6)     // Catch: java.lang.Throwable -> L41d
            java.lang.String r6 = "*/*"
            r0.setType(r6)     // Catch: java.lang.Throwable -> L41d
            java.lang.String r6 = "android.intent.extra.ALLOW_MULTIPLE"
            r0.putExtra(r6, r3)     // Catch: java.lang.Throwable -> L41d
            r0.addFlags(r3)     // Catch: java.lang.Throwable -> L41d
            java.lang.String r3 = "选择插件附加文件"
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r3)     // Catch: java.lang.Throwable -> L41d
            r4.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> L41d
        L41b:
            monitor-exit(r5)
            goto L42a
        L41d:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L41d
            throw r0
        L420:
            java.lang.String r2 = "无法打开文件选择器"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r3)
            r0.show()
        L42a:
            sf.n r0 = sf.n.f12433a
            return r0
        L42d:
            java.lang.Object r0 = r1.f20629i
            fg.l r0 = (fg.l) r0
            java.lang.Object r2 = r1.f20628h
            gb.c r2 = (gb.c) r2
            java.lang.Object r3 = r1.f20630j
            i0.a1 r3 = (i0.a1) r3
            r4 = 0
            r3.setValue(r4)
            r0.invoke(r2)
            goto L2d2
        L442:
            java.lang.Object r0 = r1.f20628h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f20629i
            x9.e r2 = (x9.e) r2
            java.lang.Object r3 = r1.f20630j
            i0.a1 r3 = (i0.a1) r3
            tf.t r4 = tf.t.f13167g
            wb.ho.K1(r2, r3, r4)
            java.lang.String r2 = "已清空关键词"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r3)
            r0.show()
            goto L2d2
        L45f:
            java.lang.Object r0 = r1.f20628h
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r1.f20629i
            x8.s r2 = (x8.s) r2
            java.lang.Object r3 = r1.f20630j
            fg.l r3 = (fg.l) r3
            boolean r4 = r0 instanceof android.app.Activity
            if (r4 == 0) goto L473
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            goto L474
        L473:
            r4 = 0
        L474:
            if (r4 != 0) goto L481
            java.lang.String r2 = "当前页面无法打开文件选择器"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r3)
            r0.show()
            goto L4e9
        L481:
            wb.p r5 = wb.p.f18201a
            int r6 = r2.f21345b
            wb.dj r7 = new wb.dj
            r7.<init>(r2, r3, r0)
            monitor-enter(r5)
            wb.p.f18203c = r7     // Catch: java.lang.Throwable -> L4ec
            wb.p.f18204d = r4     // Catch: java.lang.Throwable -> L4ec
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L4ec
            r5.a(r0)     // Catch: java.lang.Throwable -> L4ec
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r5.a(r0)     // Catch: java.lang.Throwable -> L4ec
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L4ec
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4ec
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r0.addCategory(r2)     // Catch: java.lang.Throwable -> L4ec
            java.lang.String r2 = "*/*"
            r0.setType(r2)     // Catch: java.lang.Throwable -> L4ec
            java.lang.String r2 = "android.intent.extra.ALLOW_MULTIPLE"
            r3 = 1
            r0.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L4ec
            r0.addFlags(r3)     // Catch: java.lang.Throwable -> L4ec
            r2 = 64
            r0.addFlags(r2)     // Catch: java.lang.Throwable -> L4ec
            wb.ho.B4(r4, r0)     // Catch: java.lang.Throwable -> L4ec
            r2 = 1212371543(0x48435257, float:200009.36)
            r4.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> L4c4
            goto L4e8
        L4c4:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L4ec
            java.lang.String r7 = "android.intent.action.GET_CONTENT"
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L4ec
            java.lang.String r7 = "android.intent.category.OPENABLE"
            r0.addCategory(r7)     // Catch: java.lang.Throwable -> L4ec
            java.lang.String r7 = "*/*"
            r0.setType(r7)     // Catch: java.lang.Throwable -> L4ec
            java.lang.String r7 = "android.intent.extra.ALLOW_MULTIPLE"
            r0.putExtra(r7, r3)     // Catch: java.lang.Throwable -> L4ec
            r0.addFlags(r3)     // Catch: java.lang.Throwable -> L4ec
            java.lang.String r3 = wb.ho.N4(r6)     // Catch: java.lang.Throwable -> L4ec
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r3)     // Catch: java.lang.Throwable -> L4ec
            r4.startActivityForResult(r0, r2)     // Catch: java.lang.Throwable -> L4ec
        L4e8:
            monitor-exit(r5)
        L4e9:
            sf.n r0 = sf.n.f12433a
            return r0
        L4ec:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4ec
            throw r0
        L4ef:
            java.lang.Object r0 = r1.f20629i
            fg.l r0 = (fg.l) r0
            java.lang.Object r2 = r1.f20628h
            x8.s r2 = (x8.s) r2
            java.lang.Object r3 = r1.f20630j
            fg.l r3 = (fg.l) r3
            wb.b3 r4 = new wb.b3
            int r5 = r2.f21345b
            java.lang.String r5 = wb.ho.N4(r5)
            java.lang.String r6 = r2.f21346c
            wb.kj r7 = new wb.kj
            r8 = 3
            r7.<init>(r3, r2, r8)
            r8 = 1
            java.lang.String r9 = ";;;"
            r4.<init>(r5, r6, r7, r8, r9)
            r0.invoke(r4)
            goto L2d2
        L516:
            java.lang.Object r0 = r1.f20629i
            x8.u r0 = (x8.u) r0
            java.lang.Object r2 = r1.f20628h
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f20630j
            i0.a1 r3 = (i0.a1) r3
            java.lang.String r4 = r0.f21365a
            r3.setValue(r4)
            java.lang.String r0 = r0.f21365a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "已选择 "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r3)
            r0.show()
            goto L2d2
        L541:
            java.lang.Object r0 = r1.f20629i
            v8.a r0 = (v8.a) r0
            java.lang.Object r2 = r1.f20628h
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f20630j
            fg.l r3 = (fg.l) r3
            java.util.Set r4 = r0.f14205e
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 0
            if (r5 == 0) goto L560
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L560
            goto L584
        L560:
            java.util.Iterator r4 = r4.iterator()
        L564:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L584
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r7 = "@chatroom"
            boolean r7 = og.t.W(r5, r7, r6)
            if (r7 != 0) goto L580
            java.lang.String r7 = "@im.chatroom"
            boolean r5 = og.t.W(r5, r7, r6)
            if (r5 == 0) goto L564
        L580:
            r3.invoke(r0)
            goto L58d
        L584:
            java.lang.String r0 = "请先选择监听群聊"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r6)
            r0.show()
        L58d:
            sf.n r0 = sf.n.f12433a
            return r0
        L590:
            java.lang.Object r0 = r1.f20629i
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r1.f20628h
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.f20630j
            i0.a1 r3 = (i0.a1) r3
            r3.setValue(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "已选择 "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r3)
            r0.show()
            goto L2d2
    }
}
