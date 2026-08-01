package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class f10 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3720;

    public /* synthetic */ f10(int r1) {
            r0 = this;
            r0.f3720 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ f10(int r1, int r2) {
            r0 = this;
            r0.f3720 = r2
            r0.<init>(r1)
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r14) {
            r13 = this;
            int r0 = r13.f3720
            r1 = 700(0x2bc, double:3.46E-321)
            r3 = 14
            r4 = 120(0x78, double:5.93E-322)
            r6 = 40001(0x9c41, float:5.6053E-41)
            r7 = 4
            r8 = 1
            r9 = 0
            r10 = 0
            switch(r0) {
                case 3: goto L60c;
                case 4: goto L5cb;
                case 5: goto L12;
                case 6: goto L12;
                case 7: goto L12;
                case 8: goto L12;
                case 9: goto L12;
                case 10: goto L5b4;
                case 11: goto L59d;
                case 12: goto L567;
                case 13: goto L26f;
                case 14: goto L12;
                case 15: goto L25f;
                case 16: goto L22b;
                case 17: goto L1d2;
                case 18: goto L12;
                case 19: goto L181;
                case 20: goto L134;
                case 21: goto Lfc;
                case 22: goto Lcd;
                case 23: goto L12;
                case 24: goto L12;
                case 25: goto L95;
                case 26: goto L61;
                case 27: goto L37;
                case 28: goto L16;
                default: goto L12;
            }
        L12:
            super.afterHookedMethod(r14)
            return
        L16:
            r14.getClass()
            java.lang.Object[] r14 = r14.f5692
            r14.getClass()
            java.lang.Object r14 = p000.AbstractC0312g7.m2250(r14)
            boolean r0 = r14 instanceof android.view.View
            if (r0 == 0) goto L29
            r10 = r14
            android.view.View r10 = (android.view.View) r10
        L29:
            if (r10 != 0) goto L2c
            goto L36
        L2c:
            jb r14 = new jb
            r0 = 23
            r14.<init>(r0, r10, r13)
            r10.post(r14)
        L36:
            return
        L37:
            r14.getClass()
            java.lang.Object[] r13 = r14.f5692
            r13 = r13[r9]
            boolean r14 = r13 instanceof android.content.Context
            if (r14 == 0) goto L45
            android.content.Context r13 = (android.content.Context) r13
            goto L46
        L45:
            r13 = r10
        L46:
            if (r13 != 0) goto L49
            goto L60
        L49:
            nh0 r14 = p000.nh0.f7619
            android.content.Context r14 = r13.getApplicationContext()
            p000.nh0.f7621 = r14
            java.lang.String r13 = r13.getPackageName()
            java.lang.String r14 = "appContext captured = "
            java.lang.String r13 = p000.lz1.m3687(r14, r13)
            java.lang.String r14 = "rfae3094b732ade5a"
            p000.C0888ux.m5988(r14, r13, r10, r7, r10)
        L60:
            return
        L61:
            r14.getClass()
            java.lang.Object r13 = r14.f5691     // Catch: java.lang.Throwable -> L80
            boolean r14 = r13 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L80
            if (r14 == 0) goto L6d
            r10 = r13
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch: java.lang.Throwable -> L80
        L6d:
            if (r10 != 0) goto L70
            goto L94
        L70:
            android.os.Handler r13 = p000.ah0.f229     // Catch: java.lang.Throwable -> L80
            java.lang.String r13 = "getAdapter"
            java.lang.Object r13 = p000.ah0.m143(r10, r13)     // Catch: java.lang.Throwable -> L80
            java.lang.String r14 = "RecyclerView.setAdapter"
            p000.ah0.m131(r10, r13, r14)     // Catch: java.lang.Throwable -> L80
            s62 r13 = p000.s62.f9751     // Catch: java.lang.Throwable -> L80
            goto L87
        L80:
            r13 = move-exception
            eo1 r14 = new eo1
            r14.<init>(r13)
            r13 = r14
        L87:
            java.lang.Throwable r13 = p000.fo1.m2190(r13)
            if (r13 == 0) goto L94
            android.os.Handler r14 = p000.ah0.f229
            java.lang.String r14 = "lazy-set-adapter"
            p000.ah0.m138(r14, r13)
        L94:
            return
        L95:
            r14.getClass()
            java.lang.Object[] r13 = r14.f5692     // Catch: java.lang.Throwable -> Lb8
            if (r13 == 0) goto La1
            java.lang.Object r13 = p000.AbstractC0312g7.m2253(r9, r13)     // Catch: java.lang.Throwable -> Lb8
            goto La2
        La1:
            r13 = r10
        La2:
            boolean r0 = r13 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> Lb8
            if (r0 == 0) goto La9
            r10 = r13
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch: java.lang.Throwable -> Lb8
        La9:
            if (r10 != 0) goto Lac
            goto Lcc
        Lac:
            java.lang.Object r13 = r14.f5691     // Catch: java.lang.Throwable -> Lb8
            android.os.Handler r14 = p000.ah0.f229     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r14 = "Adapter.onAttachedToRecyclerView"
            p000.ah0.m131(r10, r13, r14)     // Catch: java.lang.Throwable -> Lb8
            s62 r13 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lb8
            goto Lbf
        Lb8:
            r13 = move-exception
            eo1 r14 = new eo1
            r14.<init>(r13)
            r13 = r14
        Lbf:
            java.lang.Throwable r13 = p000.fo1.m2190(r13)
            if (r13 == 0) goto Lcc
            android.os.Handler r14 = p000.ah0.f229
            java.lang.String r14 = "lazy-adapter-attached"
            p000.ah0.m138(r14, r13)
        Lcc:
            return
        Lcd:
            r14.getClass()
            java.lang.Object[] r13 = r14.f5692     // Catch: java.lang.Throwable -> Le7
            if (r13 == 0) goto Lfb
            java.lang.Object r13 = p000.AbstractC0312g7.m2253(r9, r13)     // Catch: java.lang.Throwable -> Le7
            if (r13 != 0) goto Ldb
            goto Lfb
        Ldb:
            android.os.Handler r0 = p000.ah0.f229     // Catch: java.lang.Throwable -> Le7
            java.lang.Object r14 = r14.f5691     // Catch: java.lang.Throwable -> Le7
            java.lang.String r0 = "attached"
            p000.ah0.m117(r14, r13, r10, r0)     // Catch: java.lang.Throwable -> Le7
            s62 r13 = p000.s62.f9751     // Catch: java.lang.Throwable -> Le7
            goto Lee
        Le7:
            r13 = move-exception
            eo1 r14 = new eo1
            r14.<init>(r13)
            r13 = r14
        Lee:
            java.lang.Throwable r13 = p000.fo1.m2190(r13)
            if (r13 == 0) goto Lfb
            android.os.Handler r14 = p000.ah0.f229
            java.lang.String r14 = "holder-attached"
            p000.ah0.m138(r14, r13)
        Lfb:
            return
        Lfc:
            r14.getClass()
            java.lang.Object[] r13 = r14.f5692     // Catch: java.lang.Throwable -> L11f
            r13.getClass()     // Catch: java.lang.Throwable -> L11f
            java.lang.Object r13 = p000.AbstractC0312g7.m2253(r9, r13)     // Catch: java.lang.Throwable -> L11f
            boolean r14 = r13 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L11f
            if (r14 == 0) goto L10f
            r10 = r13
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch: java.lang.Throwable -> L11f
        L10f:
            if (r10 != 0) goto L112
            goto L133
        L112:
            android.os.Handler r13 = p000.ah0.f229     // Catch: java.lang.Throwable -> L11f
            p000.ah0.m134(r10)     // Catch: java.lang.Throwable -> L11f
            java.lang.String r13 = "target-adapter-attached"
            p000.ah0.m165(r10, r13, r8)     // Catch: java.lang.Throwable -> L11f
            s62 r13 = p000.s62.f9751     // Catch: java.lang.Throwable -> L11f
            goto L126
        L11f:
            r13 = move-exception
            eo1 r14 = new eo1
            r14.<init>(r13)
            r13 = r14
        L126:
            java.lang.Throwable r13 = p000.fo1.m2190(r13)
            if (r13 == 0) goto L133
            android.os.Handler r14 = p000.ah0.f229
            java.lang.String r14 = "adapter-rv-attached"
            p000.ah0.m138(r14, r13)
        L133:
            return
        L134:
            r14.getClass()
            java.util.concurrent.ConcurrentHashMap r13 = p000.sg0.f9894     // Catch: java.lang.Throwable -> L17c
            boolean r13 = p000.sg0.m5494()     // Catch: java.lang.Throwable -> L17c
            if (r13 != 0) goto L140
            goto L180
        L140:
            java.lang.Object r13 = r14.f5691     // Catch: java.lang.Throwable -> L17c
            r13.getClass()     // Catch: java.lang.Throwable -> L17c
            java.lang.String r13 = p000.sg0.m5499(r13)     // Catch: java.lang.Throwable -> L17c
            if (r13 != 0) goto L14c
            goto L180
        L14c:
            java.lang.Object r0 = r14.f5694     // Catch: java.lang.Throwable -> L17c
            boolean r1 = r0 instanceof byte[]     // Catch: java.lang.Throwable -> L17c
            if (r1 == 0) goto L155
            r10 = r0
            byte[] r10 = (byte[]) r10     // Catch: java.lang.Throwable -> L17c
        L155:
            if (r10 == 0) goto L169
            int r0 = r10.length     // Catch: java.lang.Throwable -> L17c
            if (r0 != 0) goto L15b
            goto L169
        L15b:
            java.util.concurrent.ConcurrentHashMap r14 = p000.sg0.f9897     // Catch: java.lang.Throwable -> L17c
            int r0 = r10.length     // Catch: java.lang.Throwable -> L17c
            byte[] r0 = java.util.Arrays.copyOf(r10, r0)     // Catch: java.lang.Throwable -> L17c
            r14.putIfAbsent(r13, r0)     // Catch: java.lang.Throwable -> L17c
            p000.sg0.m5500(r14)     // Catch: java.lang.Throwable -> L17c
            goto L180
        L169:
            java.util.concurrent.ConcurrentHashMap r0 = p000.sg0.f9897     // Catch: java.lang.Throwable -> L17c
            java.lang.Object r13 = r0.get(r13)     // Catch: java.lang.Throwable -> L17c
            byte[] r13 = (byte[]) r13     // Catch: java.lang.Throwable -> L17c
            if (r13 == 0) goto L180
            int r0 = r13.length     // Catch: java.lang.Throwable -> L17c
            byte[] r13 = java.util.Arrays.copyOf(r13, r0)     // Catch: java.lang.Throwable -> L17c
            r14.m3107(r13)     // Catch: java.lang.Throwable -> L17c
            goto L180
        L17c:
            r13 = move-exception
            p000.sg0.m5496(r13)
        L180:
            return
        L181:
            r14.getClass()
            java.lang.Object r13 = r14.f5691
            java.util.concurrent.ConcurrentHashMap r0 = p000.sg0.f9894     // Catch: java.lang.Throwable -> L1cd
            boolean r0 = p000.sg0.m5494()     // Catch: java.lang.Throwable -> L1cd
            if (r0 != 0) goto L18f
            goto L1d1
        L18f:
            r13.getClass()     // Catch: java.lang.Throwable -> L1cd
            java.lang.String r0 = p000.sg0.m5499(r13)     // Catch: java.lang.Throwable -> L1cd
            if (r0 != 0) goto L199
            goto L1d1
        L199:
            java.lang.Object r1 = r14.f5694     // Catch: java.lang.Throwable -> L1cd
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1cd
            if (r2 == 0) goto L1a2
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L1cd
        L1a2:
            if (r10 == 0) goto L1ba
            int r1 = r10.length()     // Catch: java.lang.Throwable -> L1cd
            if (r1 != 0) goto L1ab
            goto L1ba
        L1ab:
            boolean r1 = p000.sg0.m5495(r10)     // Catch: java.lang.Throwable -> L1cd
            if (r1 != 0) goto L1ba
            java.util.concurrent.ConcurrentHashMap r13 = p000.sg0.f9896     // Catch: java.lang.Throwable -> L1cd
            r13.putIfAbsent(r0, r10)     // Catch: java.lang.Throwable -> L1cd
            p000.sg0.m5500(r13)     // Catch: java.lang.Throwable -> L1cd
            goto L1d1
        L1ba:
            java.util.concurrent.ConcurrentHashMap r1 = p000.sg0.f9896     // Catch: java.lang.Throwable -> L1cd
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L1cd
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1cd
            if (r0 == 0) goto L1d1
            r14.m3107(r0)     // Catch: java.lang.Throwable -> L1cd
            java.lang.String r14 = "content"
            p000.qe0.m4882(r14, r13, r0)     // Catch: java.lang.Throwable -> L1d1
            goto L1d1
        L1cd:
            r13 = move-exception
            p000.sg0.m5496(r13)
        L1d1:
            return
        L1d2:
            r14.getClass()
            java.lang.Object r13 = r14.f5691
            java.util.concurrent.ConcurrentHashMap r0 = p000.sg0.f9894     // Catch: java.lang.Throwable -> L226
            boolean r0 = p000.sg0.m5494()     // Catch: java.lang.Throwable -> L226
            if (r0 != 0) goto L1e0
            goto L22a
        L1e0:
            java.lang.Object r0 = r14.f5694     // Catch: java.lang.Throwable -> L226
            boolean r1 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L226
            if (r1 == 0) goto L1e9
            r10 = r0
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L226
        L1e9:
            if (r10 == 0) goto L22a
            int r0 = r10.intValue()     // Catch: java.lang.Throwable -> L226
            r1 = 5
            if (r0 == r1) goto L1f3
            goto L22a
        L1f3:
            r13.getClass()     // Catch: java.lang.Throwable -> L226
            int r0 = p000.sg0.m5498(r13)     // Catch: java.lang.Throwable -> L226
            if (r0 != r6) goto L1fd
            goto L22a
        L1fd:
            java.lang.String r13 = p000.sg0.m5499(r13)     // Catch: java.lang.Throwable -> L226
            if (r13 == 0) goto L213
            java.util.concurrent.ConcurrentHashMap r0 = p000.sg0.f9894     // Catch: java.lang.Throwable -> L226
            boolean r0 = r0.containsKey(r13)     // Catch: java.lang.Throwable -> L226
            if (r0 == 0) goto L213
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L226
            r14.m3107(r13)     // Catch: java.lang.Throwable -> L226
            goto L22a
        L213:
            if (r13 == 0) goto L22a
            java.util.concurrent.ConcurrentHashMap r14 = p000.sg0.f9895     // Catch: java.lang.Throwable -> L226
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L226
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L226
            r14.put(r13, r0)     // Catch: java.lang.Throwable -> L226
            p000.sg0.m5500(r14)     // Catch: java.lang.Throwable -> L226
            goto L22a
        L226:
            r13 = move-exception
            p000.sg0.m5496(r13)
        L22a:
            return
        L22b:
            r14.getClass()
            java.lang.Object r13 = r14.f5691
            boolean r0 = p000.sg0.m5494()     // Catch: java.lang.Throwable -> L25a
            if (r0 != 0) goto L237
            goto L25e
        L237:
            java.lang.Object r0 = r14.f5694     // Catch: java.lang.Throwable -> L25a
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L25a
            if (r1 == 0) goto L240
            r10 = r0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L25a
        L240:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L25a
            boolean r0 = p000.ln0.m3626(r10, r0)     // Catch: java.lang.Throwable -> L25a
            r13.getClass()     // Catch: java.lang.Throwable -> L25a
            int r1 = p000.sg0.m5498(r13)     // Catch: java.lang.Throwable -> L25a
            if (r0 == 0) goto L254
            if (r1 == r6) goto L254
            p000.sg0.m5497(r13)     // Catch: java.lang.Throwable -> L25a
        L254:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L25a
            r14.m3107(r13)     // Catch: java.lang.Throwable -> L25a
            goto L25e
        L25a:
            r13 = move-exception
            p000.sg0.m5496(r13)
        L25e:
            return
        L25f:
            r14.getClass()
            int r13 = p000.gf0.m2300()
            float r13 = (float) r13
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r14.m3107(r13)
            return
        L26f:
            r14.getClass()
            java.lang.Object r13 = r14.f5691
            if (r13 != 0) goto L278
            goto L566
        L278:
            boolean r14 = p000.ui1.m5894()
            if (r14 != 0) goto L280
            goto L566
        L280:
            java.lang.String r14 = "color_ring"
            boolean r0 = p000.ui1.m5904(r14)
            if (r0 == 0) goto L566
            java.util.Set r0 = p000.c30.f1955
            java.lang.Class r1 = r13.getClass()
            java.util.ArrayList r1 = p000.c30.m1124(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L29b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L300
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.setAccessible(r8)     // Catch: java.lang.Throwable -> L2b0
            java.lang.Object r4 = r4.get(r13)     // Catch: java.lang.Throwable -> L2b0
            goto L2b7
        L2b0:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L2b7:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L2bc
            r4 = r10
        L2bc:
            boolean r5 = r4 instanceof java.util.List
            if (r5 == 0) goto L2c3
            java.util.List r4 = (java.util.List) r4
            goto L2c4
        L2c3:
            r4 = r10
        L2c4:
            if (r4 != 0) goto L2c7
            goto L29b
        L2c7:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L2ce
            goto L29b
        L2ce:
            java.util.Iterator r4 = r4.iterator()
        L2d2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L29b
            java.lang.Object r5 = r4.next()
            java.lang.Object r5 = p000.c30.m1125(r5)
            if (r5 == 0) goto L2e7
            java.lang.String r5 = r5.toString()
            goto L2e8
        L2e7:
            r5 = r10
        L2e8:
            java.util.Set r6 = p000.c30.f1954
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r6 = p000.AbstractC0984xh.m6632(r6, r5)
            if (r6 != 0) goto L2fc
            java.util.Set r6 = p000.c30.f1955
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = p000.AbstractC0984xh.m6632(r6, r5)
            if (r5 == 0) goto L2d2
        L2fc:
            r2.add(r3)
            goto L29b
        L300:
            java.util.Iterator r1 = r2.iterator()
        L304:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "FeedRightControlsHide3903"
            if (r2 == 0) goto L395
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r2.setAccessible(r8)     // Catch: java.lang.Throwable -> L322
            java.lang.Object r4 = r2.get(r13)     // Catch: java.lang.Throwable -> L322
            boolean r5 = p000.h62.m2433(r4)     // Catch: java.lang.Throwable -> L322
            if (r5 == 0) goto L324
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L322
            goto L32c
        L322:
            r4 = move-exception
            goto L326
        L324:
            r4 = r10
            goto L32c
        L326:
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L32c:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L331
            r4 = r10
        L331:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L336
            goto L304
        L336:
            int r5 = r4.size()
            int r6 = r4.size()
            int r6 = r6 + (-1)
            if (r6 < 0) goto L363
        L342:
            int r11 = r6 + (-1)
            java.lang.Object r12 = r4.get(r6)
            java.lang.Object r12 = p000.c30.m1125(r12)
            if (r12 == 0) goto L35e
            java.lang.String r12 = r12.toString()
            if (r12 != 0) goto L355
            goto L35e
        L355:
            boolean r12 = r0.contains(r12)
            if (r12 == 0) goto L35e
            r4.remove(r6)
        L35e:
            if (r11 >= 0) goto L361
            goto L363
        L361:
            r6 = r11
            goto L342
        L363:
            int r6 = r4.size()
            if (r5 == r6) goto L304
            java.lang.String r2 = r2.getName()
            int r4 = r4.size()
            int r5 = r5 - r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "已移除 3903 头像扩展 "
            r4.<init>(r6)
            r4.append(r0)
            java.lang.String r6 = ", field="
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = ", removed="
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            p000.C0888ux.m5988(r3, r2, r10, r7, r10)
            goto L304
        L395:
            java.util.Set r0 = p000.c30.f1954
            java.lang.Class r0 = r13.getClass()
            java.util.ArrayList r0 = p000.c30.m1124(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3a8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L413
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r2.setAccessible(r8)     // Catch: java.lang.Throwable -> L3bc
            java.lang.Object r4 = r2.get(r13)     // Catch: java.lang.Throwable -> L3bc
            goto L3c3
        L3bc:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L3c3:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L3c8
            r4 = r10
        L3c8:
            boolean r5 = r4 instanceof java.util.List
            if (r5 == 0) goto L3cf
            java.util.List r4 = (java.util.List) r4
            goto L3d0
        L3cf:
            r4 = r10
        L3d0:
            if (r4 != 0) goto L3d4
        L3d2:
            r5 = r10
            goto L40d
        L3d4:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3dc
            r5 = r9
            goto L402
        L3dc:
            java.util.Iterator r4 = r4.iterator()
            r5 = r9
        L3e1:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L402
            java.lang.Object r6 = r4.next()
            if (r6 == 0) goto L3e1
            java.util.Set r11 = p000.c30.f1954
            java.lang.Class r6 = r6.getClass()
            boolean r6 = p000.c30.m1128(r6)
            if (r6 == 0) goto L3e1
            int r5 = r5 + 1
            if (r5 < 0) goto L3fe
            goto L3e1
        L3fe:
            p000.AbstractC1021yh.m6916()
            throw r10
        L402:
            if (r5 <= 0) goto L3d2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            l91 r5 = new l91
            r5.<init>(r2, r4)
        L40d:
            if (r5 == 0) goto L3a8
            r1.add(r5)
            goto L3a8
        L413:
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L41f
            r1 = r10
            goto L44e
        L41f:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L42a
            goto L44e
        L42a:
            r2 = r1
            l91 r2 = (p000.l91) r2
            java.lang.Object r2 = r2.f6503
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
        L435:
            java.lang.Object r4 = r0.next()
            r5 = r4
            l91 r5 = (p000.l91) r5
            java.lang.Object r5 = r5.f6503
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r2 >= r5) goto L448
            r1 = r4
            r2 = r5
        L448:
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L435
        L44e:
            l91 r1 = (p000.l91) r1
            if (r1 == 0) goto L457
            java.lang.Object r0 = r1.f6502
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L458
        L457:
            r0 = r10
        L458:
            if (r0 != 0) goto L45c
            goto L566
        L45c:
            java.lang.Class r1 = r13.getClass()
            java.util.ArrayList r1 = p000.c30.m1124(r1)
            java.util.Iterator r1 = r1.iterator()
        L468:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b4
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.setAccessible(r8)     // Catch: java.lang.Throwable -> L47d
            java.lang.Object r4 = r4.get(r13)     // Catch: java.lang.Throwable -> L47d
            goto L484
        L47d:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L484:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L489
            r4 = r10
        L489:
            boolean r5 = r4 instanceof java.util.List
            if (r5 == 0) goto L490
            java.util.List r4 = (java.util.List) r4
            goto L491
        L490:
            r4 = r10
        L491:
            if (r4 != 0) goto L494
            goto L468
        L494:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L468
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L4a1
            goto L4b5
        L4a1:
            java.util.Iterator r4 = r4.iterator()
        L4a5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4b5
            java.lang.Object r5 = r4.next()
            boolean r5 = r5 instanceof java.lang.Integer
            if (r5 != 0) goto L4a5
            goto L468
        L4b4:
            r2 = r10
        L4b5:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r0.setAccessible(r8)     // Catch: java.lang.Throwable -> L4c7
            java.lang.Object r0 = r0.get(r13)     // Catch: java.lang.Throwable -> L4c7
            boolean r1 = p000.h62.m2433(r0)     // Catch: java.lang.Throwable -> L4c7
            if (r1 == 0) goto L4c9
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L4c7
            goto L4d1
        L4c7:
            r0 = move-exception
            goto L4cb
        L4c9:
            r0 = r10
            goto L4d1
        L4cb:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L4d1:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L4d6
            r0 = r10
        L4d6:
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L4dc
            goto L566
        L4dc:
            if (r2 == 0) goto L4e4
            r2.setAccessible(r8)     // Catch: java.lang.Throwable -> L4e2
            goto L4e4
        L4e2:
            r13 = move-exception
            goto L4f7
        L4e4:
            if (r2 == 0) goto L4eb
            java.lang.Object r13 = r2.get(r13)     // Catch: java.lang.Throwable -> L4e2
            goto L4ec
        L4eb:
            r13 = r10
        L4ec:
            boolean r1 = p000.h62.m2433(r13)     // Catch: java.lang.Throwable -> L4e2
            if (r1 == 0) goto L4f5
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Throwable -> L4e2
            goto L4fd
        L4f5:
            r13 = r10
            goto L4fd
        L4f7:
            eo1 r1 = new eo1
            r1.<init>(r13)
            r13 = r1
        L4fd:
            boolean r1 = r13 instanceof p000.eo1
            if (r1 == 0) goto L502
            r13 = r10
        L502:
            java.util.List r13 = (java.util.List) r13
            int r1 = r0.size()
            int r2 = r0.size()
            int r2 = r2 + (-1)
            if (r2 < 0) goto L552
        L510:
            int r4 = r2 + (-1)
            java.lang.Object r5 = r0.get(r2)
            if (r5 != 0) goto L519
            goto L54d
        L519:
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            boolean r6 = p000.ui1.m5904(r14)
            if (r6 == 0) goto L54d
            java.lang.String r6 = "ColorRing"
            boolean r6 = p000.q02.m4654(r5, r6, r8)
            if (r6 != 0) goto L53f
            java.lang.String r6 = "Story"
            boolean r6 = p000.q02.m4654(r5, r6, r8)
            if (r6 != 0) goto L53f
            java.lang.String r6 = "AvatarRing"
            boolean r5 = p000.q02.m4654(r5, r6, r8)
            if (r5 == 0) goto L54d
        L53f:
            r0.remove(r2)
            if (r13 == 0) goto L54d
            int r5 = r13.size()
            if (r2 >= r5) goto L54d
            r13.remove(r2)
        L54d:
            if (r4 >= 0) goto L550
            goto L552
        L550:
            r2 = r4
            goto L510
        L552:
            int r13 = r0.size()
            if (r1 == r13) goto L566
            int r13 = r0.size()
            int r1 = r1 - r13
            java.lang.String r13 = "已移除 3903 头像已注册 Presenter removed="
            java.lang.String r13 = p000.a12.m17(r13, r1)
            p000.C0888ux.m5988(r3, r13, r10, r7, r10)
        L566:
            return
        L567:
            z20 r13 = p000.z20.f12945
            r14.getClass()
            java.lang.Object r13 = r14.f5691
            boolean r14 = r13 instanceof android.view.ViewGroup
            if (r14 == 0) goto L575
            r10 = r13
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
        L575:
            if (r10 != 0) goto L578
            goto L59c
        L578:
            java.lang.String r13 = "onLayout"
            p000.z20.m7079(r10, r13)
            android.content.Context r13 = r10.getContext()
            android.app.Activity r13 = p000.z20.m7083(r13)
            if (r13 != 0) goto L588
            goto L59c
        L588:
            java.lang.Object r14 = p000.z20.m7081(r10)
            if (r14 != 0) goto L58f
            goto L59c
        L58f:
            java.util.Map r0 = p000.z20.f12952
            r0.getClass()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r14)
            r0.put(r13, r1)
        L59c:
            return
        L59d:
            r14.getClass()
            java.lang.Object r13 = r14.f5691
            boolean r14 = r13 instanceof android.view.ViewGroup
            if (r14 == 0) goto L5a9
            r10 = r13
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
        L5a9:
            if (r10 != 0) goto L5ac
            goto L5b3
        L5ac:
            z20 r13 = p000.z20.f12945
            java.lang.String r13 = "onAttachedToWindow"
            p000.z20.m7067(r10, r13)
        L5b3:
            return
        L5b4:
            r14.getClass()
            java.lang.Object r13 = r14.f5691
            boolean r14 = r13 instanceof android.view.ViewGroup
            if (r14 == 0) goto L5c0
            r10 = r13
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
        L5c0:
            if (r10 != 0) goto L5c3
            goto L5ca
        L5c3:
            z20 r13 = p000.z20.f12945
            java.lang.String r13 = "constructor"
            p000.z20.m7067(r10, r13)
        L5ca:
            return
        L5cb:
            r14.getClass()
            java.lang.Object r13 = r14.f5691
            boolean r0 = r13 instanceof android.app.Activity
            if (r0 == 0) goto L5d7
            android.app.Activity r13 = (android.app.Activity) r13
            goto L5d8
        L5d7:
            r13 = r10
        L5d8:
            if (r13 != 0) goto L5db
            goto L60b
        L5db:
            java.lang.Object[] r14 = r14.f5692
            r14.getClass()
            java.lang.Object r14 = p000.AbstractC0312g7.m2253(r9, r14)
            boolean r0 = r14 instanceof java.lang.Boolean
            if (r0 == 0) goto L5eb
            r10 = r14
            java.lang.Boolean r10 = (java.lang.Boolean) r10
        L5eb:
            if (r10 == 0) goto L5f1
            boolean r9 = r10.booleanValue()
        L5f1:
            if (r9 == 0) goto L60b
            com.example.dyhelper.hook.C0157.m1517(r13, r4, r8)
            android.view.Window r14 = r13.getWindow()
            if (r14 == 0) goto L60b
            android.view.View r14 = r14.getDecorView()
            if (r14 != 0) goto L603
            goto L60b
        L603:
            n9 r0 = new n9
            r0.<init>(r13, r3)
            r14.postDelayed(r0, r1)
        L60b:
            return
        L60c:
            r14.getClass()
            java.lang.Object r13 = r14.f5691
            boolean r14 = r13 instanceof android.app.Activity
            if (r14 == 0) goto L618
            r10 = r13
            android.app.Activity r10 = (android.app.Activity) r10
        L618:
            if (r10 != 0) goto L61b
            goto L633
        L61b:
            com.example.dyhelper.hook.C0157.m1517(r10, r4, r8)
            android.view.Window r13 = r10.getWindow()
            if (r13 == 0) goto L633
            android.view.View r13 = r13.getDecorView()
            if (r13 != 0) goto L62b
            goto L633
        L62b:
            n9 r14 = new n9
            r14.<init>(r10, r3)
            r13.postDelayed(r14, r1)
        L633:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f3720
            r3 = 8
            r4 = 11
            r5 = 4
            r6 = 1
            r7 = 0
            r8 = 0
            switch(r2) {
                case 0: goto L502;
                case 1: goto L336;
                case 2: goto L2d4;
                case 5: goto L2bc;
                case 6: goto L2a6;
                case 7: goto L290;
                case 8: goto L245;
                case 9: goto L1fa;
                case 14: goto L128;
                case 18: goto La5;
                case 23: goto L73;
                case 24: goto L41;
                case 29: goto L15;
                default: goto L11;
            }
        L11:
            super.beforeHookedMethod(r18)
            return
        L15:
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pj0.f8581
            boolean r0 = p000.pj0.m4547()
            if (r0 != 0) goto L21
            goto L40
        L21:
            java.util.concurrent.atomic.AtomicInteger r0 = p000.pj0.f8582
            int r0 = r0.incrementAndGet()
            r2 = 20
            if (r0 <= r2) goto L2f
            int r2 = r0 % 50
            if (r2 != 0) goto L3a
        L2f:
            java.lang.String r2 = "DYHelper"
            java.lang.String r3 = "勿扰模式拦截消息Tab角标刷新 LJIIL #"
            java.lang.String r0 = p000.a12.m17(r3, r0)
            p000.C0888ux.m5988(r2, r0, r8, r5, r8)
        L3a:
            p000.pj0.m4546()
            r1.m3107(r8)
        L40:
            return
        L41:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L72
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r7, r0)     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L4f
            goto L72
        L4f:
            android.os.Handler r1 = p000.ah0.f229     // Catch: java.lang.Throwable -> L5e
            android.view.View r0 = p000.ah0.m160(r0)     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L58
            goto L72
        L58:
            p000.ah0.m145(r0, r6, r6)     // Catch: java.lang.Throwable -> L5e
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5e
            goto L65
        L5e:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L65:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L72
            android.os.Handler r1 = p000.ah0.f229
            java.lang.String r1 = "holder-detached"
            p000.ah0.m138(r1, r0)
        L72:
            return
        L73:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto La4
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r7, r0)     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto L81
            goto La4
        L81:
            android.os.Handler r1 = p000.ah0.f229     // Catch: java.lang.Throwable -> L90
            android.view.View r0 = p000.ah0.m160(r0)     // Catch: java.lang.Throwable -> L90
            if (r0 != 0) goto L8a
            goto La4
        L8a:
            p000.ah0.m145(r0, r6, r7)     // Catch: java.lang.Throwable -> L90
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L90
            goto L97
        L90:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L97:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto La4
            android.os.Handler r1 = p000.ah0.f229
            java.lang.String r1 = "holder-recycled"
            p000.ah0.m138(r1, r0)
        La4:
            return
        La5:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            java.util.concurrent.ConcurrentHashMap r2 = p000.sg0.f9894     // Catch: java.lang.Throwable -> L123
            boolean r2 = p000.sg0.m5494()     // Catch: java.lang.Throwable -> L123
            if (r2 != 0) goto Lb4
            goto L127
        Lb4:
            java.lang.Object r1 = r1.f5691     // Catch: java.lang.Throwable -> L123
            if (r1 != 0) goto Lba
            goto L127
        Lba:
            java.lang.String r2 = p000.sg0.m5499(r1)     // Catch: java.lang.Throwable -> L123
            if (r2 != 0) goto Lc2
            goto L127
        Lc2:
            r0.getClass()     // Catch: java.lang.Throwable -> L123
            int r3 = r0.length     // Catch: java.lang.Throwable -> L123
            if (r3 != 0) goto Lca
        Lc8:
            r3 = r8
            goto Ld2
        Lca:
            r3 = r0[r7]     // Catch: java.lang.Throwable -> L123
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L123
            if (r4 == 0) goto Lc8
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L123
        Ld2:
            if (r3 == 0) goto Lea
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L123
            if (r4 != 0) goto Ldb
            goto Lea
        Ldb:
            boolean r4 = p000.sg0.m5495(r3)     // Catch: java.lang.Throwable -> L123
            if (r4 != 0) goto Lea
            java.util.concurrent.ConcurrentHashMap r0 = p000.sg0.f9896     // Catch: java.lang.Throwable -> L123
            r0.putIfAbsent(r2, r3)     // Catch: java.lang.Throwable -> L123
            p000.sg0.m5500(r0)     // Catch: java.lang.Throwable -> L123
            goto L127
        Lea:
            java.lang.String r4 = "content"
            java.lang.Object r1 = p000.qe0.m4879(r1, r4)     // Catch: java.lang.Throwable -> Lf7
            boolean r4 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lf7
            if (r4 == 0) goto Lf7
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lf7
            r8 = r1
        Lf7:
            if (r8 == 0) goto L110
            int r1 = r8.length()     // Catch: java.lang.Throwable -> L123
            if (r1 != 0) goto L100
            goto L110
        L100:
            java.util.concurrent.ConcurrentHashMap r1 = p000.sg0.f9894     // Catch: java.lang.Throwable -> L123
            boolean r1 = p000.sg0.m5495(r8)     // Catch: java.lang.Throwable -> L123
            if (r1 != 0) goto L110
            java.util.concurrent.ConcurrentHashMap r1 = p000.sg0.f9896     // Catch: java.lang.Throwable -> L123
            r1.putIfAbsent(r2, r8)     // Catch: java.lang.Throwable -> L123
            p000.sg0.m5500(r1)     // Catch: java.lang.Throwable -> L123
        L110:
            java.util.concurrent.ConcurrentHashMap r1 = p000.sg0.f9896     // Catch: java.lang.Throwable -> L123
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L123
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L123
            boolean r2 = p000.sg0.m5495(r3)     // Catch: java.lang.Throwable -> L123
            if (r2 == 0) goto L127
            if (r1 == 0) goto L127
            r0[r7] = r1     // Catch: java.lang.Throwable -> L123
            goto L127
        L123:
            r0 = move-exception
            p000.sg0.m5496(r0)
        L127:
            return
        L128:
            r1.getClass()
            java.lang.ThreadLocal r0 = p000.e30.f3393
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L13b
            goto L1f7
        L13b:
            java.lang.Object r0 = r1.f5691
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L145
            android.app.Activity r0 = (android.app.Activity) r0
            r2 = r0
            goto L146
        L145:
            r2 = r8
        L146:
            if (r2 != 0) goto L14a
            goto L1f7
        L14a:
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r7, r0)
            boolean r3 = r0 instanceof android.view.MotionEvent
            if (r3 == 0) goto L15b
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            r3 = r0
            goto L15c
        L15b:
            r3 = r8
        L15c:
            if (r3 != 0) goto L160
            goto L1f7
        L160:
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.e30.f3392
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L16a
            goto L1f0
        L16a:
            long r9 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r4 = p000.e30.f3394
            monitor-enter(r4)
            android.view.MotionEvent r11 = p000.e30.f3395     // Catch: java.lang.Throwable -> L19d
            if (r11 != r3) goto L19f
            int r11 = p000.e30.f3396     // Catch: java.lang.Throwable -> L19d
            int r12 = r3.getActionMasked()     // Catch: java.lang.Throwable -> L19d
            if (r11 != r12) goto L19f
            long r11 = p000.e30.f3397     // Catch: java.lang.Throwable -> L19d
            long r13 = r3.getEventTime()     // Catch: java.lang.Throwable -> L19d
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L19f
            long r11 = p000.e30.f3398     // Catch: java.lang.Throwable -> L19d
            long r13 = r3.getDownTime()     // Catch: java.lang.Throwable -> L19d
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L19f
            long r11 = p000.e30.f3399     // Catch: java.lang.Throwable -> L19d
            long r11 = r9 - r11
            r13 = 1000(0x3e8, double:4.94E-321)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L19f
            r11 = r6
            goto L1a0
        L19d:
            r0 = move-exception
            goto L1f8
        L19f:
            r11 = r7
        L1a0:
            if (r11 != 0) goto L1b8
            p000.e30.f3395 = r3     // Catch: java.lang.Throwable -> L19d
            int r12 = r3.getActionMasked()     // Catch: java.lang.Throwable -> L19d
            p000.e30.f3396 = r12     // Catch: java.lang.Throwable -> L19d
            long r12 = r3.getEventTime()     // Catch: java.lang.Throwable -> L19d
            p000.e30.f3397 = r12     // Catch: java.lang.Throwable -> L19d
            long r12 = r3.getDownTime()     // Catch: java.lang.Throwable -> L19d
            p000.e30.f3398 = r12     // Catch: java.lang.Throwable -> L19d
            p000.e30.f3399 = r9     // Catch: java.lang.Throwable -> L19d
        L1b8:
            monitor-exit(r4)
            if (r11 == 0) goto L1bc
            goto L1f0
        L1bc:
            java.util.Iterator r4 = r0.iterator()
        L1c0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1f0
            java.lang.Object r0 = r4.next()
            r9 = r0
            d30 r9 = (p000.d30) r9
            boolean r0 = r9.mo1647(r2, r3)     // Catch: java.lang.Throwable -> L1d5
            if (r0 == 0) goto L1c0
            r7 = r6
            goto L1c0
        L1d5:
            r0 = move-exception
            java.lang.String r10 = "FeedTouchEventDispatcher"
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r11 = "listener 分发异常: "
            java.lang.String r12 = ", "
            java.lang.String r0 = p000.a12.m18(r11, r9, r12, r0)
            p000.C0888ux.m5988(r10, r0, r8, r5, r8)
            goto L1c0
        L1f0:
            if (r7 == 0) goto L1f7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.m3107(r0)
        L1f7:
            return
        L1f8:
            monitor-exit(r4)
            throw r0
        L1fa:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r7, r0)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L20d
            r8 = r1
            java.lang.Integer r8 = (java.lang.Integer) r8
        L20d:
            if (r8 == 0) goto L244
            int r1 = r8.intValue()
            if (r1 != r4) goto L244
            java.util.Set r1 = p000.q20.f8803
            boolean r1 = p000.kn0.f6047
            if (r1 == 0) goto L226
            int r1 = p000.kn0.f6048
            if (r1 > 0) goto L220
            goto L226
        L220:
            int r1 = p000.kn0.f6048
            int r7 = p000.j81.m2906(r1, r6, r3)
        L226:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r6] = r1
            java.lang.String r0 = "force_tt_parallel"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "force TTVideoEngine.setIntValue(11, "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            p000.q20.m4727(r0, r1)
        L244:
            return
        L245:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r7, r0)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L258
            r8 = r1
            java.lang.Integer r8 = (java.lang.Integer) r8
        L258:
            if (r8 == 0) goto L28f
            int r1 = r8.intValue()
            if (r1 != r4) goto L28f
            java.util.Set r1 = p000.q20.f8803
            boolean r1 = p000.kn0.f6047
            if (r1 == 0) goto L271
            int r1 = p000.kn0.f6048
            if (r1 > 0) goto L26b
            goto L271
        L26b:
            int r1 = p000.kn0.f6048
            int r7 = p000.j81.m2906(r1, r6, r3)
        L271:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0[r6] = r1
            java.lang.String r0 = "force_loader_parallel"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "force DataLoaderHelper.setInt(11, "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ")"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            p000.q20.m4727(r0, r1)
        L28f:
            return
        L290:
            r1.getClass()
            boolean r0 = p000.kn0.f6047
            if (r0 == 0) goto L29b
            int r0 = p000.kn0.f6048
            if (r0 > 0) goto L2a5
        L29b:
            r1.m3107(r8)
            java.util.Set r0 = p000.q20.f8803
            java.lang.String r0 = "skip adapter preloadTypeConfig"
            p000.q20.m4726(r0)
        L2a5:
            return
        L2a6:
            r1.getClass()
            boolean r0 = p000.kn0.f6047
            if (r0 == 0) goto L2b1
            int r0 = p000.kn0.f6048
            if (r0 > 0) goto L2bb
        L2b1:
            r1.m3107(r8)
            java.util.Set r0 = p000.q20.f8803
            java.lang.String r0 = "skip adapter prefetchItemView"
            p000.q20.m4726(r0)
        L2bb:
            return
        L2bc:
            r1.getClass()
            boolean r0 = p000.kn0.f6047
            if (r0 == 0) goto L2c7
            int r0 = p000.kn0.f6048
            if (r0 > 0) goto L2d3
        L2c7:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.m3107(r0)
            java.util.Set r0 = p000.q20.f8803
            java.lang.String r0 = "skip adapter preloadViewHolder"
            p000.q20.m4726(r0)
        L2d3:
            return
        L2d4:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L2e0
            android.view.View r0 = (android.view.View) r0
            goto L2e1
        L2e0:
            r0 = r8
        L2e1:
            if (r0 != 0) goto L2e4
            goto L332
        L2e4:
            java.lang.Object[] r1 = r1.f5692
            r1.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r7, r1)
            boolean r2 = r1 instanceof android.view.MotionEvent
            if (r2 == 0) goto L2f4
            r8 = r1
            android.view.MotionEvent r8 = (android.view.MotionEvent) r8
        L2f4:
            if (r8 != 0) goto L2f7
            goto L332
        L2f7:
            x10 r1 = p000.x10.f11972
            int r1 = r8.getActionMasked()
            if (r1 == 0) goto L302
            if (r1 == r6) goto L302
            goto L332
        L302:
            android.content.Context r0 = r0.getContext()
            android.app.Activity r0 = p000.x10.m6494(r0)
            if (r0 != 0) goto L30d
            goto L332
        L30d:
            w10 r9 = new w10
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            r10.<init>(r0)
            float r11 = r8.getRawX()
            float r12 = r8.getRawY()
            long r13 = r8.getEventTime()
            long r15 = android.os.SystemClock.uptimeMillis()
            r9.<init>(r10, r11, r12, r13, r15)
            java.lang.Object r1 = p000.x10.f11983
            monitor-enter(r1)
            java.util.WeakHashMap r2 = p000.x10.f11982     // Catch: java.lang.Throwable -> L333
            r2.put(r0, r9)     // Catch: java.lang.Throwable -> L333
            p000.x10.f11984 = r9     // Catch: java.lang.Throwable -> L333
            monitor-exit(r1)
        L332:
            return
        L333:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L336:
            java.lang.String r0 = ""
            r1.getClass()
            java.lang.Object[] r2 = r1.f5692
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.n10.f7350
            boolean r3 = p000.ui1.m5903()
            if (r3 != 0) goto L347
            goto L501
        L347:
            if (r2 == 0) goto L34f
            r3 = 2
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r3, r2)
            goto L350
        L34f:
            r3 = r8
        L350:
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L357
            java.lang.Number r3 = (java.lang.Number) r3
            goto L358
        L357:
            r3 = r8
        L358:
            if (r3 == 0) goto L501
            int r3 = r3.intValue()
            if (r3 != r6) goto L501
            if (r2 != 0) goto L364
            goto L501
        L364:
            r3 = 5
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r3, r2)
            if (r3 == 0) goto L370
            java.lang.String r3 = r3.toString()
            goto L371
        L370:
            r3 = r8
        L371:
            if (r3 != 0) goto L374
            r3 = r0
        L374:
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L37c
            goto L3f4
        L37c:
            r3 = r7
        L37d:
            int r4 = r2.length
            if (r3 >= r4) goto L3c0
            int r4 = r3 + 1
            r3 = r2[r3]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L3b5
            if (r3 == 0) goto L396
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L396
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r5)
            r3.getClass()
            goto L397
        L396:
            r3 = r8
        L397:
            if (r3 != 0) goto L39a
            r3 = r0
        L39a:
            java.lang.String r5 = "homepage"
            boolean r5 = p000.q02.m4654(r3, r5, r7)
            if (r5 != 0) goto L3f4
            java.lang.String r5 = "feed"
            boolean r5 = p000.q02.m4654(r3, r5, r7)
            if (r5 != 0) goto L3f4
            java.lang.String r5 = "click"
            boolean r3 = p000.q02.m4654(r3, r5, r7)
            if (r3 == 0) goto L3b3
            goto L3f4
        L3b3:
            r3 = r4
            goto L37d
        L3b5:
            r0 = move-exception
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L3c0:
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()
            r3.getClass()
            int r4 = r3.length
            r5 = r7
        L3cd:
            if (r5 >= r4) goto L501
            r9 = r3[r5]
            java.lang.String r9 = r9.getClassName()
            r9.getClass()
            java.lang.String r10 = ".feed."
            boolean r10 = p000.q02.m4654(r9, r10, r7)
            if (r10 != 0) goto L3f4
            java.lang.String r10 = "FeedAvatarPresenter"
            boolean r10 = p000.q02.m4654(r9, r10, r7)
            if (r10 != 0) goto L3f4
            java.lang.String r10 = "DPPFollowUserPresenter"
            boolean r9 = p000.q02.m4654(r9, r10, r7)
            if (r9 == 0) goto L3f1
            goto L3f4
        L3f1:
            int r5 = r5 + 1
            goto L3cd
        L3f4:
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r7, r2)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L3ff
            java.lang.String r3 = (java.lang.String) r3
            goto L400
        L3ff:
            r3 = r8
        L400:
            if (r3 != 0) goto L404
            r12 = r0
            goto L405
        L404:
            r12 = r3
        L405:
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r6, r2)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L410
            java.lang.String r2 = (java.lang.String) r2
            goto L411
        L410:
            r2 = r8
        L411:
            if (r2 != 0) goto L415
            r13 = r0
            goto L416
        L415:
            r13 = r2
        L416:
            boolean r0 = p000.q02.m4671(r13)
            if (r0 != 0) goto L424
            java.lang.String r0 = "sec:"
            java.lang.String r0 = r0.concat(r13)
        L422:
            r14 = r0
            goto L440
        L424:
            boolean r0 = p000.q02.m4671(r12)
            if (r0 != 0) goto L431
            java.lang.String r0 = "uid:"
            java.lang.String r0 = r0.concat(r12)
            goto L422
        L431:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r2 = r0.getId()
            java.lang.String r0 = "unknown:"
            java.lang.String r0 = p000.AbstractC0602nx.m4126(r2, r0)
            goto L422
        L440:
            java.util.concurrent.ConcurrentHashMap r2 = p000.n10.f7355
            long r3 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r5 = p000.n10.f7354
            java.lang.Object r0 = r5.get(r14)
            java.lang.Long r0 = (java.lang.Long) r0
            r9 = 0
            if (r0 == 0) goto L457
            long r15 = r0.longValue()
            goto L458
        L457:
            r15 = r9
        L458:
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 <= 0) goto L45f
            r0 = r6
            goto L4ed
        L45f:
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 == 0) goto L46a
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r5.remove(r14, r0)
        L46a:
            m10 r0 = new m10
            r0.<init>()
            java.lang.Object r3 = r2.putIfAbsent(r14, r0)
            m10 r3 = (p000.m10) r3
            if (r3 != 0) goto L479
            r11 = r0
            goto L47a
        L479:
            r11 = r3
        L47a:
            java.util.concurrent.CountDownLatch r0 = r11.f6885
            if (r3 != 0) goto L4a4
            android.app.Activity r10 = p000.AbstractC0378i.m2546()
            if (r10 != 0) goto L488
            r0.countDown()
            goto L4a4
        L488:
            boolean r4 = r10.isFinishing()
            if (r4 != 0) goto L4a1
            boolean r4 = r10.isDestroyed()
            if (r4 == 0) goto L495
            goto L4a1
        L495:
            android.os.Handler r4 = p000.n10.f7353
            v8 r9 = new v8
            r15 = 2
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r4.post(r9)
            goto L4a4
        L4a1:
            r0.countDown()
        L4a4:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L4be
            r9 = 30000(0x7530, double:1.4822E-319)
            boolean r0 = r0.await(r9, r4)     // Catch: java.lang.Throwable -> L4be
            if (r0 == 0) goto L4c0
            java.util.concurrent.atomic.AtomicReference r0 = r11.f6886     // Catch: java.lang.Throwable -> L4be
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L4be
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4be
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4be
            if (r0 == 0) goto L4c0
            r7 = r6
            goto L4c0
        L4be:
            r0 = move-exception
            goto L4c5
        L4c0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L4be
            goto L4cb
        L4c5:
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L4cb:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto L4d2
            r0 = r4
        L4d2:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r3 != 0) goto L4dd
            r2.remove(r14, r11)
        L4dd:
            if (r0 == 0) goto L4ed
            long r2 = java.lang.System.currentTimeMillis()
            r9 = 5000(0x1388, double:2.4703E-320)
            long r2 = r2 + r9
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.put(r14, r2)
        L4ed:
            if (r0 != 0) goto L501
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.String r2 = "DYHelper cancelled feed follow request"
            r0.<init>(r2)
            r1.f5695 = r0
            r1.f5694 = r8
            r1.f5696 = r6
            java.lang.String r0 = "r84c14b19b9028fd2"
            p000.AbstractC0602nx.m4121(r0, r12, r13)
        L501:
            return
        L502:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r7, r0)
            boolean r2 = r0 instanceof android.view.MotionEvent
            if (r2 == 0) goto L515
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            goto L516
        L515:
            r0 = r8
        L516:
            if (r0 != 0) goto L519
            goto L52f
        L519:
            java.util.concurrent.CopyOnWriteArrayList r2 = p000.g10.f4192
            java.lang.Object r2 = r1.f5691
            java.lang.String r3 = "semantic"
            boolean r0 = p000.g10.m2221(r2, r0, r3, r6)
            if (r0 == 0) goto L52f
            r1.m3107(r8)
            java.lang.String r0 = "r898d705a05f158a0"
            java.lang.String r1 = "宿主双击语义兜底已消费事件"
            p000.C0888ux.m5988(r0, r1, r8, r5, r8)
        L52f:
            return
    }
}
