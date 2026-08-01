package p000;

/* JADX INFO: renamed from: ng */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0585ng extends p000.p80 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7607;

    public /* synthetic */ C0585ng(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
            r0 = this;
            r0.f7607 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f7607
            java.lang.String r1 = ""
            java.lang.String r2 = "FeedRightButtonManager"
            r3 = 4
            r4 = 0
            r5 = 0
            r6 = 1
            switch(r0) {
                case 0: goto L5ea;
                case 1: goto L5d5;
                case 2: goto L5c6;
                case 3: goto L59e;
                case 4: goto L553;
                case 5: goto L536;
                case 6: goto L44c;
                case 7: goto L422;
                case 8: goto L40d;
                case 9: goto L3af;
                case 10: goto L39a;
                case 11: goto L33c;
                case 12: goto L32a;
                case 13: goto L31b;
                case 14: goto L30c;
                case 15: goto L2c2;
                case 16: goto L2b8;
                case 17: goto L2ae;
                case 18: goto L29d;
                case 19: goto L264;
                case 20: goto L24f;
                case 21: goto L23d;
                case 22: goto L226;
                case 23: goto L20f;
                case 24: goto L11e;
                case 25: goto L112;
                case 26: goto La3;
                case 27: goto L34;
                case 28: goto L22;
                default: goto Ld;
            }
        Ld:
            java.lang.String r14 = (java.lang.String) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            pu0 r13 = (p000.pu0) r13
            r13.getClass()
            boolean r13 = p000.pu0.m4601(r14)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L22:
            android.app.Activity r14 = (android.app.Activity) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            ht0 r13 = (p000.ht0) r13
            r13.getClass()
            p000.ht0.m2532(r14)
            s62 r13 = p000.s62.f9751
            return r13
        L34:
            java.lang.String r14 = (java.lang.String) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            gt0 r13 = (p000.gt0) r13
            java.util.LinkedHashMap r0 = r13.f4454
            java.lang.Object r14 = r0.get(r14)
            java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
            if (r14 == 0) goto La0
            java.lang.Object r14 = r14.get()
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto L50
            goto La0
        L50:
            i0 r1 = r13.f4449
            r1.getClass()
            boolean r0 = r14.isAttachedToWindow()
            if (r0 != 0) goto L5c
            goto L8e
        L5c:
            boolean r0 = r14.performLongClick()     // Catch: java.lang.Throwable -> L65
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L65
            goto L6c
        L65:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L6c:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)
            if (r2 == 0) goto L85
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r3 = "long_click:"
            java.lang.String r14 = r3.concat(r14)
            java.lang.String r3 = "转发宿主 Tab 长按失败"
            r1.m2550(r14, r3, r2)
        L85:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L8c
            r0 = r14
        L8c:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L8e:
            java.lang.ref.WeakReference r14 = r13.f4452
            java.lang.Object r14 = r14.get()
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            if (r14 == 0) goto La0
            ft0 r0 = new ft0
            r0.<init>(r13, r5)
            r14.post(r0)
        La0:
            s62 r13 = p000.s62.f9751
            return r13
        La3:
            java.lang.String r14 = (java.lang.String) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            gt0 r13 = (p000.gt0) r13
            java.util.LinkedHashMap r0 = r13.f4454
            java.lang.Object r14 = r0.get(r14)
            java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
            if (r14 == 0) goto L10f
            java.lang.Object r14 = r14.get()
            android.view.View r14 = (android.view.View) r14
            if (r14 != 0) goto Lbf
            goto L10f
        Lbf:
            i0 r1 = r13.f4449
            r1.getClass()
            boolean r0 = r14.isAttachedToWindow()
            if (r0 != 0) goto Lcb
            goto Lfd
        Lcb:
            boolean r0 = r14.performClick()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Ld4
            goto Ldb
        Ld4:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        Ldb:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)
            if (r2 == 0) goto Lf4
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r3 = "click:"
            java.lang.String r14 = r3.concat(r14)
            java.lang.String r3 = "转发宿主 Tab 点击失败"
            r1.m2550(r14, r3, r2)
        Lf4:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto Lfb
            r0 = r14
        Lfb:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        Lfd:
            java.lang.ref.WeakReference r14 = r13.f4452
            java.lang.Object r14 = r14.get()
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            if (r14 == 0) goto L10f
            ft0 r0 = new ft0
            r0.<init>(r13, r6)
            r14.post(r0)
        L10f:
            s62 r13 = p000.s62.f9751
            return r13
        L112:
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r13 = r13.receiver
            co0 r13 = (p000.co0) r13
            r13.mo1281(r14)
            s62 r13 = p000.s62.f9751
            return r13
        L11e:
            mk0 r14 = (p000.mk0) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            nk0 r13 = (p000.nk0) r13
            r13.getClass()
            java.lang.String r13 = r14.f7194
            java.lang.String r0 = r14.f7195
            java.lang.String[] r13 = new java.lang.String[]{r13, r0}
            java.util.List r13 = p000.AbstractC1021yh.m6897(r13)
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r13, r2)
            r0.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L145:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L178
            java.lang.Object r2 = r13.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L154
            r2 = r1
        L154:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r5
        L15a:
            int r7 = r2.length()
            if (r4 >= r7) goto L170
            char r7 = r2.charAt(r4)
            boolean r8 = p000.jx0.m3020(r7)
            if (r8 != 0) goto L16d
            r3.append(r7)
        L16d:
            int r4 = r4 + 1
            goto L15a
        L170:
            java.lang.String r2 = r3.toString()
            r0.add(r2)
            goto L145
        L178:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r0 = r0.iterator()
        L181:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L198
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L181
            r13.add(r2)
            goto L181
        L198:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L1be
            java.util.Set r14 = p000.nk0.f7662
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L1a7
            goto L20a
        L1a7:
            java.util.Iterator r13 = r13.iterator()
        L1ab:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L20a
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r14.contains(r0)
            if (r0 == 0) goto L1ab
            goto L209
        L1be:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r14.f7192
            r13.append(r0)
            r0 = 124(0x7c, float:1.74E-43)
            r13.append(r0)
            java.lang.String r14 = r14.f7193
            if (r14 != 0) goto L1d2
            goto L1d3
        L1d2:
            r1 = r14
        L1d3:
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = p000.AbstractC0602nx.m4134(r14, r13, r14)
            java.lang.String r14 = "unread"
            boolean r14 = p000.q02.m4654(r13, r14, r5)
            if (r14 != 0) goto L20a
            java.util.List r14 = p000.nk0.f7663
            if (r14 == 0) goto L1f3
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L1f3
            goto L20a
        L1f3:
            java.util.Iterator r14 = r14.iterator()
        L1f7:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L20a
            java.lang.Object r0 = r14.next()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = p000.q02.m4654(r13, r0, r5)
            if (r0 == 0) goto L1f7
        L209:
            r5 = r6
        L20a:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            return r13
        L20f:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            zj0 r13 = (p000.zj0) r13
            zj0 r0 = p000.zj0.f13118
            r13.getClass()
            boolean r13 = p000.zj0.m7155(r14)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L226:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            zj0 r13 = (p000.zj0) r13
            zj0 r0 = p000.zj0.f13118
            r13.getClass()
            boolean r13 = p000.zj0.m7154(r14)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L23d:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            zj0 r13 = (p000.zj0) r13
            boolean r13 = p000.zj0.m7139(r13, r14)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L24f:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            vj0 r13 = (p000.vj0) r13
            r13.getClass()
            boolean r13 = p000.vj0.m6252(r14)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L264:
            java.lang.annotation.Annotation r14 = (java.lang.annotation.Annotation) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            vj0 r13 = (p000.vj0) r13
            r13.getClass()
            wf r13 = p000.ln0.m3599(r14)     // Catch: java.lang.Throwable -> L289
            java.lang.Class r13 = p000.ln0.m3604(r13)     // Catch: java.lang.Throwable -> L289
            java.lang.String r0 = "value"
            java.lang.reflect.Method r13 = r13.getMethod(r0, r4)     // Catch: java.lang.Throwable -> L289
            java.lang.Object r13 = r13.invoke(r14, r4)     // Catch: java.lang.Throwable -> L289
            boolean r14 = r13 instanceof java.lang.String     // Catch: java.lang.Throwable -> L289
            if (r14 == 0) goto L28c
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L289
            goto L294
        L289:
            r0 = move-exception
            r13 = r0
            goto L28e
        L28c:
            r13 = r4
            goto L294
        L28e:
            eo1 r14 = new eo1
            r14.<init>(r13)
            r13 = r14
        L294:
            boolean r14 = r13 instanceof p000.eo1
            if (r14 == 0) goto L299
            goto L29a
        L299:
            r4 = r13
        L29a:
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L29d:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            wi0 r13 = (p000.wi0) r13
            r13.getClass()
            java.lang.String r13 = p000.wi0.m6388(r14)
            return r13
        L2ae:
            java.lang.Object r13 = r13.receiver
            nh0 r13 = (p000.nh0) r13
            p000.nh0.m4045(r13, r14)
            s62 r13 = p000.s62.f9751
            return r13
        L2b8:
            java.lang.Object r13 = r13.receiver
            nh0 r13 = (p000.nh0) r13
            p000.nh0.m4045(r13, r14)
            s62 r13 = p000.s62.f9751
            return r13
        L2c2:
            java.lang.Object r13 = r13.receiver
            nh0 r13 = (p000.nh0) r13
            if (r14 != 0) goto L2cc
            r13.getClass()
            goto L309
        L2cc:
            r13.getClass()
            java.lang.String r13 = p000.nh0.m4043(r14)
            boolean r0 = p000.q02.m4671(r13)
            java.lang.String r1 = "rfae3094b732ade5a"
            if (r0 == 0) goto L2ed
            java.lang.Class r13 = r14.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r14 = "capture skipped, conversationId unresolved, logic="
            java.lang.String r13 = r14.concat(r13)
            p000.C0888ux.m5988(r1, r13, r4, r3, r4)
            goto L309
        L2ed:
            java.util.concurrent.ConcurrentHashMap r0 = p000.nh0.f7622
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r14)
            r0.put(r13, r2)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r14)
            p000.nh0.f7623 = r0
            p000.nh0.f7624 = r13
            java.lang.String r14 = "capture conversationId="
            java.lang.String r13 = r14.concat(r13)
            p000.C0888ux.m5988(r1, r13, r4, r3, r4)
        L309:
            s62 r13 = p000.s62.f9751
            return r13
        L30c:
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            nh0 r13 = (p000.nh0) r13
            r13.getClass()
            java.lang.String r13 = p000.nh0.m4060(r14)
            return r13
        L31b:
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            ch0 r13 = (p000.ch0) r13
            r13.getClass()
            java.lang.String r13 = p000.ch0.m1180(r14)
            return r13
        L32a:
            java.util.List r14 = (java.util.List) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            hf0 r13 = (p000.hf0) r13
            r13.getClass()
            p000.hf0.m2503(r14)
            s62 r13 = p000.s62.f9751
            return r13
        L33c:
            xd0 r14 = (p000.xd0) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            yc0 r13 = (p000.yc0) r13
            r13.getClass()
            java.lang.String r13 = r14.f12133
            r0 = 64
            java.lang.String r8 = p000.AbstractC0782s1.m5343(r13, r0)
            java.lang.String r13 = r14.f12134
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r9 = p000.AbstractC0782s1.m5343(r13, r0)
            int r13 = r8.length()
            if (r13 != 0) goto L365
            int r13 = r9.length()
            if (r13 != 0) goto L365
            goto L399
        L365:
            java.lang.String r13 = r14.f12135
            r1 = 128(0x80, float:1.8E-43)
            java.lang.String r10 = p000.AbstractC0782s1.m5326(r13, r1)
            java.lang.String r13 = r14.f12136
            java.lang.String r11 = p000.AbstractC0782s1.m5326(r13, r1)
            java.lang.String r13 = r14.f12137
            java.lang.String r12 = p000.AbstractC0782s1.m5326(r13, r0)
            long r13 = r14.f12138
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r1 = 0
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 <= 0) goto L386
            r4 = r0
        L386:
            if (r4 == 0) goto L38e
            long r13 = r4.longValue()
        L38c:
            r6 = r13
            goto L393
        L38e:
            long r13 = java.lang.System.currentTimeMillis()
            goto L38c
        L393:
            xd0 r5 = new xd0
            r5.<init>(r6, r8, r9, r10, r11, r12)
            r4 = r5
        L399:
            return r4
        L39a:
            java.lang.Class r14 = (java.lang.Class) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            b30 r13 = (p000.b30) r13
            java.lang.String r13 = r13.m709(r14)
            if (r13 == 0) goto L3aa
            r5 = r6
        L3aa:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            return r13
        L3af:
            java.lang.String r14 = (java.lang.String) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            b30 r13 = (p000.b30) r13
            r13.getClass()
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r13 = r14.toUpperCase(r13)
            r13.getClass()
            java.lang.String r14 = "AVATAR"
            boolean r14 = p000.q02.m4654(r13, r14, r5)
            if (r14 == 0) goto L3cf
            java.lang.String r4 = "avatar"
            goto L40c
        L3cf:
            java.lang.String r14 = "DIGG"
            boolean r14 = p000.q02.m4654(r13, r14, r5)
            if (r14 != 0) goto L40a
            java.lang.String r14 = "LIKE"
            boolean r14 = p000.q02.m4654(r13, r14, r5)
            if (r14 == 0) goto L3e0
            goto L40a
        L3e0:
            java.lang.String r14 = "COMMENT"
            boolean r14 = p000.q02.m4654(r13, r14, r5)
            if (r14 == 0) goto L3eb
            java.lang.String r4 = "comment"
            goto L40c
        L3eb:
            java.lang.String r14 = "COLLECT"
            boolean r14 = p000.q02.m4654(r13, r14, r5)
            if (r14 != 0) goto L407
            java.lang.String r14 = "FAVORITE"
            boolean r14 = p000.q02.m4654(r13, r14, r5)
            if (r14 == 0) goto L3fc
            goto L407
        L3fc:
            java.lang.String r14 = "SHARE"
            boolean r13 = p000.q02.m4654(r13, r14, r5)
            if (r13 == 0) goto L40c
            java.lang.String r4 = "share"
            goto L40c
        L407:
            java.lang.String r4 = "collect"
            goto L40c
        L40a:
            java.lang.String r4 = "digg"
        L40c:
            return r4
        L40d:
            java.lang.Class r14 = (java.lang.Class) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            b30 r13 = (p000.b30) r13
            r13.getClass()
            boolean r13 = p000.b30.m705(r14)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L422:
            w20 r14 = (p000.w20) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            z20 r13 = (p000.z20) r13
            r13.getClass()
            java.lang.String r13 = "auto_scroll_next_enabled"
            boolean r14 = p000.ui1.m5887(r13, r5)
            r14 = r14 ^ r6
            p000.ui1.m5871(r13, r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "右侧自动连播开关已切换 enabled="
            r13.<init>(r0)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            p000.C0888ux.m5988(r2, r13, r4, r3, r4)
            s62 r13 = p000.s62.f9751
            return r13
        L44c:
            w20 r14 = (p000.w20) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            z20 r13 = (p000.z20) r13
            r13.getClass()
            java.lang.Object r13 = r14.f11547
            if (r13 != 0) goto L463
            java.lang.String r13 = "点击不感兴趣失败：未解析到当前 Aweme"
            p000.C0888ux.m5988(r2, r13, r4, r3, r4)
            goto L533
        L463:
            android.app.Activity r0 = r14.f11546
            java.lang.String r7 = "homepage_hot"
            if (r0 != 0) goto L46a
            goto L4a3
        L46a:
            android.content.Intent r8 = r0.getIntent()
            java.lang.String r0 = "from"
            java.lang.String r9 = "previous_page"
            java.lang.String r10 = "enter_from"
            java.lang.String r11 = "event_type"
            java.lang.String[] r9 = new java.lang.String[]{r10, r11, r0, r9}
        L47a:
            if (r5 >= r3) goto L4a3
            r0 = r9[r5]
            if (r8 == 0) goto L48c
            java.lang.String r0 = r8.getStringExtra(r0)     // Catch: java.lang.Throwable -> L485
            goto L48d
        L485:
            r0 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r0)
            goto L48e
        L48c:
            r0 = r4
        L48d:
            r10 = r0
        L48e:
            boolean r0 = r10 instanceof p000.eo1
            if (r0 == 0) goto L493
            r10 = r4
        L493:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L4a0
            boolean r0 = p000.q02.m4671(r10)
            if (r0 == 0) goto L49e
            goto L4a0
        L49e:
            r7 = r10
            goto L4a3
        L4a0:
            int r5 = r5 + 1
            goto L47a
        L4a3:
            android.content.Context r14 = r14.f11545     // Catch: java.lang.Throwable -> L4b0
            n81 r0 = p000.n81.f7457     // Catch: java.lang.Throwable -> L4b0
            boolean r14 = p000.p81.m4398(r14, r13, r7, r0)     // Catch: java.lang.Throwable -> L4b0
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L4b0
            goto L4b8
        L4b0:
            r0 = move-exception
            r14 = r0
            eo1 r0 = new eo1
            r0.<init>(r14)
            r14 = r0
        L4b8:
            java.lang.Throwable r0 = p000.fo1.m2190(r14)
            if (r0 != 0) goto L4bf
            goto L4ce
        L4bf:
            java.lang.String r14 = r0.getMessage()
            java.lang.String r0 = "执行不感兴趣异常: "
            java.lang.String r14 = p000.lz1.m3687(r0, r14)
            p000.C0888ux.m5988(r2, r14, r4, r3, r4)
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
        L4ce:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            java.lang.Class r0 = r13.getClass()
            java.util.ArrayList r0 = p000.z20.m7068(r0)
            java.util.Iterator r0 = r0.iterator()
        L4e0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L4fa
            java.lang.Object r5 = r0.next()
            r8 = r5
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "aid"
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto L4e0
            goto L4fb
        L4fa:
            r5 = r4
        L4fb:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            if (r5 == 0) goto L512
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L512
            java.lang.Object r13 = r5.get(r13)     // Catch: java.lang.Throwable -> L512
            if (r13 == 0) goto L50d
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L512
            goto L50e
        L50d:
            r13 = r4
        L50e:
            if (r13 != 0) goto L511
            goto L512
        L511:
            r1 = r13
        L512:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "右侧不感兴趣点击完成 ok="
            r13.<init>(r0)
            r13.append(r14)
            java.lang.String r14 = " enterFrom="
            r13.append(r14)
            r13.append(r7)
            java.lang.String r14 = " aweme="
            r13.append(r14)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            p000.C0888ux.m5988(r2, r13, r4, r3, r4)
        L533:
            s62 r13 = p000.s62.f9751
            return r13
        L536:
            android.content.Context r14 = (android.content.Context) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            z20 r13 = (p000.z20) r13
            r13.getClass()
            r13 = 2131230842(0x7f08007a, float:1.8077748E38)
            java.lang.String r0 = "bgxq"
            android.graphics.drawable.Drawable r13 = p000.z20.m7082(r13, r14, r0)
            if (r13 != 0) goto L552
            java.lang.String r14 = "加载模块不感兴趣图标失败: drawable=bgxq"
            p000.C0888ux.m5988(r2, r14, r4, r3, r4)
        L552:
            return r13
        L553:
            java.lang.Class r14 = (java.lang.Class) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            km r13 = (p000.C0474km) r13
            r13.getClass()
            boolean r13 = r14.isPrimitive()
            if (r13 != 0) goto L599
            boolean r13 = r14.isEnum()
            if (r13 != 0) goto L599
            boolean r13 = r14.isArray()
            if (r13 == 0) goto L572
            goto L599
        L572:
            java.util.List r13 = p000.C0474km.f6026
            if (r13 == 0) goto L57d
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L57d
            goto L598
        L57d:
            java.util.Iterator r13 = r13.iterator()
        L581:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L598
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r14.getName()
            boolean r0 = p000.x02.m6485(r1, r0, r5)
            if (r0 == 0) goto L581
            goto L599
        L598:
            r5 = r6
        L599:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r5)
            return r13
        L59e:
            android.text.style.ClickableSpan r14 = (android.text.style.ClickableSpan) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            ll r13 = (p000.C0516ll) r13
            r13.getClass()
            java.util.concurrent.ConcurrentHashMap r13 = p000.C0516ll.f6702
            java.lang.Class r14 = r14.getClass()
            wj r0 = new wj
            r1 = 22
            r0.<init>(r1)
            c8 r1 = new c8
            r1.<init>(r0, r6)
            java.lang.Object r13 = r13.computeIfAbsent(r14, r1)
            r13.getClass()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            return r13
        L5c6:
            mk r14 = (p000.C0552mk) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            uk r13 = (p000.C0875uk) r13
            r13.m5923(r14)
            s62 r13 = p000.s62.f9751
            return r13
        L5d5:
            java.lang.Class r14 = (java.lang.Class) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            kk r13 = (p000.C0472kk) r13
            r13.getClass()
            boolean r13 = p000.C0472kk.m3296(r14)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            return r13
        L5ea:
            android.view.View r14 = (android.view.View) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            tg r13 = (p000.C0834tg) r13
            r13.getClass()
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L611
            android.os.Handler r13 = p000.AbstractC0871ug.f10780
            jb r0 = new jb
            r1 = 17
            r0.<init>(r14, r1)
            r13.post(r0)
            goto L614
        L611:
            r13.m5693(r14, r6)
        L614:
            s62 r13 = p000.s62.f9751
            return r13
    }
}
