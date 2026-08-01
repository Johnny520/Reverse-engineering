package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class py1 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f8759;

    public /* synthetic */ py1(int r1) {
            r0 = this;
            r0.f8759 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ py1(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f8759 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r10) {
            r9 = this;
            int r0 = r9.f8759
            r1 = 2
            java.lang.String r2 = "捕获顶栏 ViewPager: "
            java.lang.String r3 = "r3912affb67f40e11"
            java.lang.String r4 = "rfe847aaa60ab2d90"
            r5 = 4
            r6 = 1
            r7 = 0
            r8 = 0
            switch(r0) {
                case 0: goto L585;
                case 1: goto L527;
                case 2: goto L50a;
                case 3: goto L4cf;
                case 4: goto L4a8;
                case 5: goto L481;
                case 6: goto L45e;
                case 7: goto L43b;
                case 8: goto L411;
                case 9: goto L371;
                case 10: goto L10;
                case 11: goto L344;
                case 12: goto L2a4;
                case 13: goto L10;
                case 14: goto L277;
                case 15: goto L22c;
                case 16: goto L1b2;
                case 17: goto L17b;
                case 18: goto L15e;
                case 19: goto L10;
                case 20: goto L10;
                case 21: goto L10;
                case 22: goto L10;
                case 23: goto L10;
                case 24: goto Le7;
                case 25: goto L10;
                case 26: goto L10;
                case 27: goto L6f;
                case 28: goto L14;
                default: goto L10;
            }
        L10:
            super.afterHookedMethod(r10)
            return
        L14:
            java.lang.String r9 = "🔍 发现 setPlaySpeed: "
            r10.getClass()
            java.lang.Object[] r0 = r10.f5692
            r0 = r0[r7]
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L24
            java.lang.String r0 = (java.lang.String) r0
            goto L25
        L24:
            r0 = r8
        L25:
            if (r0 != 0) goto L28
            goto L6e
        L28:
            java.lang.Object r10 = r10.f5694
            boolean r1 = r10 instanceof java.lang.Class
            if (r1 == 0) goto L31
            java.lang.Class r10 = (java.lang.Class) r10
            goto L32
        L31:
            r10 = r8
        L32:
            if (r10 != 0) goto L35
            goto L6e
        L35:
            java.lang.String r1 = "X."
            boolean r1 = p000.x02.m6485(r0, r1, r7)
            if (r1 != 0) goto L3e
            goto L6e
        L3e:
            java.lang.String r1 = "#setPlaySpeed"
            java.lang.String r1 = r0.concat(r1)
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.n82.f7463
            boolean r1 = r2.add(r1)
            if (r1 != 0) goto L4d
            goto L6e
        L4d:
            java.lang.String r1 = "setPlaySpeed"
            java.lang.Class r2 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L6e
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L6e
            java.lang.reflect.Method r10 = r10.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L6e
            java.lang.String r9 = r9.concat(r0)     // Catch: java.lang.NoSuchMethodException -> L6e
            p000.C0888ux.m5988(r4, r9, r8, r5, r8)     // Catch: java.lang.NoSuchMethodException -> L6e
            xq0 r9 = p000.xq0.f12253     // Catch: java.lang.NoSuchMethodException -> L6e
            r10.getClass()     // Catch: java.lang.NoSuchMethodException -> L6e
            bt r1 = new bt     // Catch: java.lang.NoSuchMethodException -> L6e
            r2 = 6
            r1.<init>(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L6e
            r9.m6775(r10, r1)     // Catch: java.lang.NoSuchMethodException -> L6e
        L6e:
            return
        L6f:
            java.lang.String r9 = "after setSpeed: provider.getSpeed()="
            java.lang.String r0 = "after setSpeed: LJIJJLI.LIZ="
            r10.getClass()
            java.lang.Object r1 = r10.f5691
            java.lang.Object[] r10 = r10.f5692
            r10 = r10[r7]
            boolean r2 = r10 instanceof java.lang.Float
            if (r2 == 0) goto L83
            java.lang.Float r10 = (java.lang.Float) r10
            goto L84
        L83:
            r10 = r8
        L84:
            if (r10 == 0) goto Le6
            float r10 = r10.floatValue()
            r2 = 1077936128(0x40400000, float:3.0)
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 > 0) goto L91
            goto Le6
        L91:
            java.lang.String r10 = "LJIJJLI"
            java.lang.Object r10 = p000.qe0.m4879(r1, r10)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = "LIZ"
            if (r10 == 0) goto Lb7
            java.lang.Class r3 = r10.getClass()     // Catch: java.lang.Throwable -> Lc7
            java.lang.reflect.Field r2 = p000.qe0.m4878(r3, r2)     // Catch: java.lang.Throwable -> Lc7
            float r10 = r2.getFloat(r10)     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lc7
            r2.append(r10)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Throwable -> Lc7
            p000.C0888ux.m5988(r4, r10, r8, r5, r8)     // Catch: java.lang.Throwable -> Lc7
            goto Lc7
        Lb7:
            java.lang.String r10 = "Instance receiver is null for field "
            java.lang.String r10 = r10.concat(r2)     // Catch: java.lang.Throwable -> Lc7
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Lc7
            r0.<init>(r10)     // Catch: java.lang.Throwable -> Lc7
            throw r0     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            java.lang.String r10 = "getVideoInfoProvider"
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r10 = p000.qe0.m4869(r1, r10, r0)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r0 = "getSpeed"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r10 = p000.qe0.m4869(r10, r0, r1)     // Catch: java.lang.Throwable -> Le6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le6
            r0.<init>(r9)     // Catch: java.lang.Throwable -> Le6
            r0.append(r10)     // Catch: java.lang.Throwable -> Le6
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Throwable -> Le6
            p000.C0888ux.m5988(r4, r9, r8, r5, r8)     // Catch: java.lang.Throwable -> Le6
        Le6:
            return
        Le7:
            r10.getClass()
            java.lang.String[] r9 = p000.n82.f7460
            java.lang.Object r9 = r10.f5694
            java.lang.Float[] r0 = p000.n82.f7462
            boolean r1 = r9 instanceof float[]
            if (r1 == 0) goto L107
            r0.getClass()
            int r9 = r0.length
            float[] r8 = new float[r9]
        Lfa:
            if (r7 >= r9) goto L158
            r1 = r0[r7]
            float r1 = r1.floatValue()
            r8[r7] = r1
            int r7 = r7 + 1
            goto Lfa
        L107:
            boolean r1 = r9 instanceof java.lang.Object[]
            if (r1 == 0) goto L124
            java.lang.Class r9 = r9.getClass()
            java.lang.Class r9 = r9.getComponentType()
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            boolean r9 = p000.ln0.m3626(r9, r1)
            if (r9 == 0) goto L158
            int r9 = r0.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r0, r9)
            r8 = r9
            java.lang.Float[] r8 = (java.lang.Float[]) r8
            goto L158
        L124:
            boolean r1 = r9 instanceof java.util.List
            if (r1 == 0) goto L158
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L158
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r1 = r9 instanceof java.util.Collection
            if (r1 == 0) goto L141
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L141
            goto L154
        L141:
            java.util.Iterator r9 = r9.iterator()
        L145:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L154
            java.lang.Object r1 = r9.next()
            boolean r1 = r1 instanceof java.lang.Float
            if (r1 != 0) goto L145
            goto L158
        L154:
            java.util.List r8 = p000.AbstractC0312g7.m2262(r0)
        L158:
            if (r8 == 0) goto L15d
            r10.m3107(r8)
        L15d:
            return
        L15e:
            r10.getClass()
            long r9 = p000.l82.f6491
            java.util.concurrent.atomic.AtomicLong r0 = p000.l82.f6489
            long r0 = r0.get()
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 != 0) goto L16e
            goto L17a
        L16e:
            android.os.Handler r9 = p000.l82.f6488
            fb0 r10 = new fb0
            r0 = 23
            r10.<init>(r0)
            r9.post(r10)
        L17a:
            return
        L17b:
            r10.getClass()
            java.lang.Object r9 = r10.f5691
            if (r9 == 0) goto L18f
            java.lang.Class r10 = r9.getClass()
            java.lang.reflect.Method r10 = p000.l82.m3536(r10)
            if (r10 == 0) goto L18f
            p000.l82.m3535(r10, r9)
        L18f:
            java.util.concurrent.atomic.AtomicLong r9 = p000.l82.f6489
            long r9 = r9.incrementAndGet()
            r0 = -9223372036854775808
            p000.l82.f6491 = r0
            p000.l82.f6490 = r9
            long[] r0 = new long[r5]
            r0 = {x05de: FILL_ARRAY_DATA , data: [0, 120, 360, 800} // fill-array
        L1a0:
            if (r7 >= r5) goto L1b1
            r1 = r0[r7]
            android.os.Handler r3 = p000.l82.f6488
            h82 r4 = new h82
            r4.<init>(r9)
            r3.postDelayed(r4, r1)
            int r7 = r7 + 1
            goto L1a0
        L1b1:
            return
        L1b2:
            r10.getClass()
            be0 r9 = p000.be0.f1670
            boolean r0 = r9.m939()
            if (r0 != 0) goto L1bf
            goto L22b
        L1bf:
            java.lang.Object r10 = r10.f5691     // Catch: java.lang.Throwable -> L1c9
            boolean r0 = r10 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L1c9
            if (r0 == 0) goto L1cc
            r8 = r10
            android.app.Activity r8 = (android.app.Activity) r8     // Catch: java.lang.Throwable -> L1c9
            goto L1cc
        L1c9:
            r0 = move-exception
            r9 = r0
            goto L216
        L1cc:
            if (r8 != 0) goto L1cf
            goto L22b
        L1cf:
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.c72.f1985     // Catch: java.lang.Throwable -> L1c9
            android.content.Intent r10 = r8.getIntent()     // Catch: java.lang.Throwable -> L1c9
            java.lang.String[] r0 = p000.c72.f1986     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r0 = p000.c72.m1147(r10, r0)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String[] r1 = p000.c72.f1987     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r10 = p000.c72.m1147(r10, r1)     // Catch: java.lang.Throwable -> L1c9
            boolean r9 = r9.m941(r0, r10)     // Catch: java.lang.Throwable -> L1c9
            if (r9 != 0) goto L1e8
            goto L22b
        L1e8:
            android.view.Window r9 = r8.getWindow()     // Catch: java.lang.Throwable -> L1c9
            if (r9 == 0) goto L1f7
            android.view.View r9 = r9.getDecorView()     // Catch: java.lang.Throwable -> L1c9
            if (r9 == 0) goto L1f7
            r9.setVisibility(r5)     // Catch: java.lang.Throwable -> L1c9
        L1f7:
            e71 r9 = new e71     // Catch: java.lang.Throwable -> L1c9
            r10 = 19
            r9.<init>(r8, r10)     // Catch: java.lang.Throwable -> L1c9
            boolean r9 = p000.pd2.m4475(r8, r9)     // Catch: java.lang.Throwable -> L1c9
            if (r9 != 0) goto L213
            boolean r9 = r8.isFinishing()     // Catch: java.lang.Throwable -> L1c9
            if (r9 != 0) goto L213
            boolean r9 = r8.isDestroyed()     // Catch: java.lang.Throwable -> L1c9
            if (r9 != 0) goto L213
            r8.finish()     // Catch: java.lang.Throwable -> L1c9
        L213:
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1c9
            goto L21c
        L216:
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        L21c:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L22b
            java.lang.String r9 = r9.getMessage()
            java.lang.String r10 = "profile navigation callback failed: "
            p000.AbstractC0602nx.m4143(r10, r9, r3)
        L22b:
            return
        L22c:
            r10.getClass()
            be0 r9 = p000.be0.f1670
            boolean r9 = r9.m939()
            if (r9 != 0) goto L238
            goto L276
        L238:
            java.lang.Object r9 = r10.f5694     // Catch: java.lang.Throwable -> L242
            boolean r0 = r9 instanceof java.util.List     // Catch: java.lang.Throwable -> L242
            if (r0 == 0) goto L245
            r8 = r9
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L242
            goto L245
        L242:
            r0 = move-exception
            r9 = r0
            goto L261
        L245:
            if (r8 != 0) goto L248
            goto L276
        L248:
            java.util.ArrayList r9 = p000.vd0.m6180(r8)     // Catch: java.lang.Throwable -> L242
            int r0 = r9.size()     // Catch: java.lang.Throwable -> L242
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L242
            if (r0 >= r1) goto L25e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L242
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L242
            r10.m3107(r0)     // Catch: java.lang.Throwable -> L242
        L25e:
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L242
            goto L267
        L261:
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        L267:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L276
            java.lang.String r9 = r9.getMessage()
            java.lang.String r10 = "mention callback failed: "
            p000.AbstractC0602nx.m4143(r10, r9, r3)
        L276:
            return
        L277:
            r10.getClass()
            l52 r9 = p000.l52.f6428
            boolean r9 = p000.l52.m3514()
            if (r9 != 0) goto L283
            goto L2a3
        L283:
            java.lang.Object[] r9 = r10.f5692
            r9.getClass()
            java.lang.Object r9 = p000.AbstractC0312g7.m2253(r7, r9)
            boolean r10 = r9 instanceof java.lang.Integer
            if (r10 == 0) goto L293
            r8 = r9
            java.lang.Integer r8 = (java.lang.Integer) r8
        L293:
            if (r8 == 0) goto L2a3
            int r9 = r8.intValue()
            java.util.Set r10 = p000.l52.f6439
            boolean r10 = r10.contains(r8)
            if (r10 != 0) goto L2a3
            p000.l52.f6440 = r9
        L2a3:
            return
        L2a4:
            r10.getClass()
            java.lang.Object[] r9 = r10.f5692
            r9.getClass()
            int r0 = r9.length
            r3 = r7
        L2ae:
            if (r3 >= r0) goto L2be
            r4 = r9[r3]
            l52 r5 = p000.l52.f6428
            boolean r5 = p000.l52.m3512(r4)
            if (r5 == 0) goto L2bb
            goto L2bf
        L2bb:
            int r3 = r3 + 1
            goto L2ae
        L2be:
            r4 = r8
        L2bf:
            if (r4 == 0) goto L2db
            l52 r9 = p000.l52.f6428
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r4)
            p000.l52.f6442 = r9
            java.lang.Class r9 = r4.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r0 = "ra3f49bce40b36580"
            p000.C0888ux.m5975(r0, r9)
        L2db:
            java.lang.Object[] r9 = r10.f5692
            r9.getClass()
            int r10 = r9.length
            r0 = r7
        L2e2:
            if (r0 >= r10) goto L32a
            r2 = r9[r0]
            l52 r3 = p000.l52.f6428
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L2f0
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            goto L2f1
        L2f0:
            r3 = r8
        L2f1:
            if (r3 != 0) goto L2f4
            goto L323
        L2f4:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L2fb
            goto L323
        L2fb:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L303
            r4 = r7
            goto L31f
        L303:
            java.util.Iterator r3 = r3.iterator()
            r4 = r7
        L308:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L31f
            java.lang.Object r5 = r3.next()
            boolean r5 = r5 instanceof android.view.View
            if (r5 == 0) goto L308
            int r4 = r4 + 1
            if (r4 < 0) goto L31b
            goto L308
        L31b:
            p000.AbstractC1021yh.m6916()
            throw r8
        L31f:
            if (r4 < r1) goto L323
            r3 = r6
            goto L324
        L323:
            r3 = r7
        L324:
            if (r3 == 0) goto L327
            goto L32b
        L327:
            int r0 = r0 + 1
            goto L2e2
        L32a:
            r2 = r8
        L32b:
            boolean r9 = r2 instanceof java.util.List
            if (r9 == 0) goto L332
            r8 = r2
            java.util.List r8 = (java.util.List) r8
        L332:
            if (r8 == 0) goto L33c
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L33b
            goto L33c
        L33b:
            r6 = r7
        L33c:
            if (r6 != 0) goto L343
            l52 r9 = p000.l52.f6428
            p000.l52.m3500(r8)
        L343:
            return
        L344:
            r10.getClass()
            m52 r9 = p000.m52.f6942
            boolean r9 = p000.m52.m3745()
            if (r9 != 0) goto L350
            goto L370
        L350:
            java.lang.Object[] r9 = r10.f5692
            r9.getClass()
            java.lang.Object r9 = p000.AbstractC0312g7.m2253(r7, r9)
            boolean r10 = r9 instanceof java.lang.Integer
            if (r10 == 0) goto L360
            r8 = r9
            java.lang.Integer r8 = (java.lang.Integer) r8
        L360:
            if (r8 == 0) goto L370
            int r9 = r8.intValue()
            java.util.Set r10 = p000.m52.f6953
            boolean r10 = r10.contains(r8)
            if (r10 != 0) goto L370
            p000.m52.f6954 = r9
        L370:
            return
        L371:
            r10.getClass()
            java.lang.Object[] r9 = r10.f5692
            r9.getClass()
            int r0 = r9.length
            r3 = r7
        L37b:
            if (r3 >= r0) goto L38b
            r4 = r9[r3]
            m52 r5 = p000.m52.f6942
            boolean r5 = p000.m52.m3743(r4)
            if (r5 == 0) goto L388
            goto L38c
        L388:
            int r3 = r3 + 1
            goto L37b
        L38b:
            r4 = r8
        L38c:
            if (r4 == 0) goto L3a8
            m52 r9 = p000.m52.f6942
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r4)
            p000.m52.f6956 = r9
            java.lang.Class r9 = r4.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r0 = "r14983b95b84acb5"
            p000.C0888ux.m5975(r0, r9)
        L3a8:
            java.lang.Object[] r9 = r10.f5692
            r9.getClass()
            int r10 = r9.length
            r0 = r7
        L3af:
            if (r0 >= r10) goto L3f7
            r2 = r9[r0]
            m52 r3 = p000.m52.f6942
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L3bd
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            goto L3be
        L3bd:
            r3 = r8
        L3be:
            if (r3 != 0) goto L3c1
            goto L3f0
        L3c1:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3c8
            goto L3f0
        L3c8:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3d0
            r4 = r7
            goto L3ec
        L3d0:
            java.util.Iterator r3 = r3.iterator()
            r4 = r7
        L3d5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L3ec
            java.lang.Object r5 = r3.next()
            boolean r5 = r5 instanceof android.view.View
            if (r5 == 0) goto L3d5
            int r4 = r4 + 1
            if (r4 < 0) goto L3e8
            goto L3d5
        L3e8:
            p000.AbstractC1021yh.m6916()
            throw r8
        L3ec:
            if (r4 < r1) goto L3f0
            r3 = r6
            goto L3f1
        L3f0:
            r3 = r7
        L3f1:
            if (r3 == 0) goto L3f4
            goto L3f8
        L3f4:
            int r0 = r0 + 1
            goto L3af
        L3f7:
            r2 = r8
        L3f8:
            boolean r9 = r2 instanceof java.util.List
            if (r9 == 0) goto L3ff
            r8 = r2
            java.util.List r8 = (java.util.List) r8
        L3ff:
            if (r8 == 0) goto L409
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L408
            goto L409
        L408:
            r6 = r7
        L409:
            if (r6 != 0) goto L410
            m52 r9 = p000.m52.f6942
            p000.m52.m3731(r8)
        L410:
            return
        L411:
            r10.getClass()
            boolean r9 = p000.o22.m4179()
            if (r9 == 0) goto L41b
            goto L43a
        L41b:
            java.lang.Object[] r9 = r10.f5692
            r9.getClass()
            java.lang.Object r9 = p000.AbstractC0312g7.m2253(r7, r9)
            boolean r10 = r9 instanceof android.view.View
            if (r10 == 0) goto L42b
            r8 = r9
            android.view.View r8 = (android.view.View) r8
        L42b:
            if (r8 != 0) goto L42e
            goto L43a
        L42e:
            java.util.Set r9 = p000.o22.f7897
            boolean r9 = r9.contains(r8)
            if (r9 != 0) goto L437
            goto L43a
        L437:
            p000.o22.m4171(r8)
        L43a:
            return
        L43b:
            r10.getClass()
            boolean r9 = p000.o22.m4179()
            if (r9 == 0) goto L445
            goto L45d
        L445:
            java.lang.Object r9 = r10.f5691
            boolean r10 = r9 instanceof android.view.View
            if (r10 == 0) goto L44e
            r8 = r9
            android.view.View r8 = (android.view.View) r8
        L44e:
            if (r8 != 0) goto L451
            goto L45d
        L451:
            java.util.Set r9 = p000.o22.f7897
            boolean r9 = r9.contains(r8)
            if (r9 != 0) goto L45a
            goto L45d
        L45a:
            p000.o22.m4171(r8)
        L45d:
            return
        L45e:
            r10.getClass()
            boolean r9 = p000.o22.m4179()
            if (r9 == 0) goto L468
            goto L480
        L468:
            java.lang.Object r9 = r10.f5691
            boolean r10 = r9 instanceof android.view.View
            if (r10 == 0) goto L471
            r8 = r9
            android.view.View r8 = (android.view.View) r8
        L471:
            if (r8 != 0) goto L474
            goto L480
        L474:
            java.util.Set r9 = p000.o22.f7897
            boolean r9 = r9.contains(r8)
            if (r9 != 0) goto L47d
            goto L480
        L47d:
            p000.o22.m4171(r8)
        L480:
            return
        L481:
            o22 r9 = p000.o22.f7889
            r10.getClass()
            java.lang.Object[] r0 = r10.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r6, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L496
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L496:
            if (r8 != 0) goto L499
            goto L4a7
        L499:
            java.lang.String r0 = p000.o22.m4184(r8)
            if (r0 != 0) goto L4a0
            goto L4a7
        L4a0:
            java.lang.Object r10 = r10.f5694
            java.lang.String r1 = "factory"
            r9.m4189(r10, r0, r1)
        L4a7:
            return
        L4a8:
            o22 r9 = p000.o22.f7889
            r10.getClass()
            java.lang.Object[] r0 = r10.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r6, r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4bd
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L4bd:
            if (r8 != 0) goto L4c0
            goto L4ce
        L4c0:
            java.lang.String r0 = p000.o22.m4184(r8)
            if (r0 != 0) goto L4c7
            goto L4ce
        L4c7:
            java.lang.Object r10 = r10.f5691
            java.lang.String r1 = "constructor"
            r9.m4189(r10, r0, r1)
        L4ce:
            return
        L4cf:
            r10.getClass()
            java.lang.Object r9 = r10.f5691
            boolean r10 = r9 instanceof android.app.Activity
            if (r10 == 0) goto L4db
            r8 = r9
            android.app.Activity r8 = (android.app.Activity) r8
        L4db:
            if (r8 != 0) goto L4de
            goto L509
        L4de:
            o22 r9 = p000.o22.f7889
            java.util.Set r10 = p000.o22.m4173()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L4eb
            goto L509
        L4eb:
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 + r2
            r9.m4193()
            android.os.Handler r9 = p000.o22.f7911
            java.lang.Object r10 = p000.o22.f7909
            r9.removeCallbacksAndMessages(r10)
            n22 r10 = new n22
            r10.<init>(r0, r8)
            r9.post(r10)
            java.lang.String r9 = "r50fc0a33274d5298"
            p000.C0888ux.m5985(r9)
        L509:
            return
        L50a:
            r10.getClass()
            java.lang.Object r9 = r10.f5694     // Catch: java.lang.Throwable -> L51d
            if (r9 != 0) goto L512
            goto L526
        L512:
            ry1 r0 = p000.ry1.f9602     // Catch: java.lang.Throwable -> L51d
            java.lang.Object r10 = r10.f5691     // Catch: java.lang.Throwable -> L51d
            r10.getClass()     // Catch: java.lang.Throwable -> L51d
            p000.ry1.m5204(r10, r9)     // Catch: java.lang.Throwable -> L51d
            goto L526
        L51d:
            r0 = move-exception
            r9 = r0
            ry1 r10 = p000.ry1.f9602
            java.lang.String r10 = "processConversationSpark 异常"
            p000.ry1.m5275(r10, r9)
        L526:
            return
        L527:
            r10.getClass()
            java.lang.Object r0 = r10.f5691
            java.lang.Object r9 = r10.f5694
            boolean r1 = r9 instanceof java.util.Map
            if (r1 == 0) goto L536
            java.util.Map r9 = (java.util.Map) r9
            r1 = r9
            goto L537
        L536:
            r1 = r8
        L537:
            if (r1 != 0) goto L53a
            goto L584
        L53a:
            java.lang.String r9 = "a:consecutive_chat_data"
            java.lang.Object r2 = r1.get(r9)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L547
            java.lang.String r2 = (java.lang.String) r2
            goto L548
        L547:
            r2 = r8
        L548:
            if (r2 != 0) goto L54b
            goto L584
        L54b:
            ry1 r3 = p000.ry1.f9602
            r0.getClass()
            java.lang.String r3 = "getConversationId"
            java.lang.Object r3 = p000.ry1.m5214(r0, r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L55d
            java.lang.String r3 = (java.lang.String) r3
            goto L55e
        L55d:
            r3 = r8
        L55e:
            if (r3 != 0) goto L561
            goto L584
        L561:
            java.util.concurrent.atomic.AtomicLong r4 = p000.ry1.f9619
            long r4 = r4.get()
            long r4 = p000.ry1.m5232(r4, r3)
            java.lang.String r0 = p000.ry1.m5209(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L572
            goto L584
        L572:
            boolean r2 = r1 instanceof p000.lo0
            if (r2 == 0) goto L57a
            boolean r2 = r1 instanceof p000.po0
            if (r2 == 0) goto L57b
        L57a:
            r8 = r1
        L57b:
            if (r8 != 0) goto L57e
            goto L584
        L57e:
            r8.put(r9, r0)
            r10.m3107(r8)
        L584:
            return
        L585:
            r10.getClass()
            java.util.concurrent.atomic.AtomicReference r9 = p000.ry1.f9624
            java.lang.Object r0 = r9.get()
            if (r0 != 0) goto L59f
            java.lang.Object r10 = r10.f5691
            r9.set(r10)
            ry1 r9 = p000.ry1.f9602
            r9.m5301()
            java.lang.String r9 = "已捕获 SendMsgHandler 实例"
            p000.ry1.m5274(r9)
        L59f:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            int r2 = r0.f8759
            r4 = 3
            r7 = 1500(0x5dc, double:7.41E-321)
            java.lang.String r9 = "跳过隐藏顶栏页失败: ViewPager 为空 position="
            java.lang.String r10 = ")"
            r11 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r12 = "rfe847aaa60ab2d90"
            r13 = -1
            r14 = 4
            r15 = 0
            r16 = 0
            r3 = 1
            r17 = 250(0xfa, double:1.235E-321)
            r5 = 0
            switch(r2) {
                case 6: goto L760;
                case 7: goto L720;
                case 8: goto L6db;
                case 9: goto L1d;
                case 10: goto L659;
                case 11: goto L558;
                case 12: goto L1d;
                case 13: goto L4d6;
                case 14: goto L3d5;
                case 15: goto L1d;
                case 16: goto L1d;
                case 17: goto L1d;
                case 18: goto L1d;
                case 19: goto L316;
                case 20: goto L274;
                case 21: goto L26b;
                case 22: goto L25a;
                case 23: goto L24b;
                case 24: goto L1d;
                case 25: goto L215;
                case 26: goto L1da;
                case 27: goto L19f;
                case 28: goto L1d;
                case 29: goto L21;
                default: goto L1d;
            }
        L1d:
            super.beforeHookedMethod(r25)
            return
        L21:
            ya2 r2 = p000.ya2.f12541
            r1.getClass()
            boolean r0 = p000.ib2.m2728()
            if (r0 == 0) goto L2e
            goto L19e
        L2e:
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r5, r0)
            if (r0 != 0) goto L3b
            goto L19e
        L3b:
            ab2 r4 = p000.ib2.m2703(r0)
            if (r4 == 0) goto L43
            goto L120
        L43:
            java.util.IdentityHashMap r4 = new java.util.IdentityHashMap
            r4.<init>()
            java.util.Set r4 = java.util.Collections.newSetFromMap(r4)
            w6 r6 = new w6
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            l91 r8 = new l91
            r8.<init>(r0, r7)
            r6.addLast(r8)
            r4.add(r0)
        L60:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L11f
            java.lang.Object r0 = r6.removeFirst()
            l91 r0 = (p000.l91) r0
            java.lang.Object r7 = r0.f6502
            java.lang.Object r0 = r0.f6503
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            r0 = 2
            if (r8 >= r0) goto L60
            java.lang.Class r0 = r7.getClass()
            java.util.ArrayList r0 = p000.ib2.m2718(r0)
            java.util.Iterator r9 = r0.iterator()
        L85:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r9.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            int r10 = r0.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L85
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> La0
            goto La7
        La0:
            r0 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r0)
            r0 = r10
        La7:
            boolean r10 = r0 instanceof p000.eo1
            if (r10 == 0) goto Lac
            r0 = r15
        Lac:
            if (r0 != 0) goto Laf
            goto L85
        Laf:
            ib2 r10 = p000.ib2.f4981
            boolean r10 = r0 instanceof java.lang.String
            if (r10 != 0) goto L85
            boolean r10 = r0 instanceof java.lang.Number
            if (r10 != 0) goto L85
            boolean r10 = r0 instanceof java.lang.Boolean
            if (r10 != 0) goto L85
            boolean r10 = r0 instanceof java.lang.CharSequence
            if (r10 != 0) goto L85
            boolean r10 = r0 instanceof java.lang.Class
            if (r10 != 0) goto L85
            boolean r10 = r0 instanceof android.content.Context
            if (r10 != 0) goto L85
            boolean r10 = r0 instanceof android.view.View
            if (r10 != 0) goto L85
            java.lang.Class r10 = r0.getClass()
            boolean r10 = r10.isEnum()
            if (r10 != 0) goto L85
            java.lang.Class r10 = r0.getClass()
            boolean r10 = r10.isPrimitive()
            if (r10 != 0) goto L85
            java.lang.Class r10 = r0.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "java."
            boolean r10 = p000.x02.m6485(r10, r11, r5)
            if (r10 != 0) goto L85
            java.lang.Class r10 = r0.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "android."
            boolean r10 = p000.x02.m6485(r10, r11, r5)
            if (r10 == 0) goto L102
            goto L85
        L102:
            ab2 r10 = p000.ib2.m2703(r0)
            if (r10 == 0) goto L109
            goto L120
        L109:
            boolean r10 = r4.add(r0)
            if (r10 == 0) goto L85
            int r10 = r8 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            l91 r11 = new l91
            r11.<init>(r0, r10)
            r6.addLast(r11)
            goto L85
        L11f:
            r0 = r15
        L120:
            if (r0 != 0) goto L124
            goto L19e
        L124:
            ab2 r4 = p000.ib2.m2703(r0)
            if (r4 != 0) goto L12c
            goto L19e
        L12c:
            java.io.File r6 = r4.f180
            java.lang.String r6 = r6.getAbsolutePath()
            r6.getClass()
            r7 = 92
            r8 = 47
            java.lang.String r6 = r6.replace(r7, r8)
            r6.getClass()
            java.lang.Object r4 = r4.f176
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r7 = "/comment/"
            boolean r7 = p000.q02.m4654(r6, r7, r3)
            if (r7 != 0) goto L190
            java.lang.String r7 = "comment"
            boolean r8 = p000.q02.m4654(r6, r7, r3)
            if (r8 != 0) goto L190
            boolean r7 = p000.q02.m4654(r4, r7, r3)
            if (r7 == 0) goto L161
            goto L190
        L161:
            java.lang.String r7 = "/im/"
            boolean r7 = p000.q02.m4654(r6, r7, r3)
            if (r7 != 0) goto L18d
            java.lang.String r7 = "im_"
            boolean r7 = p000.q02.m4654(r6, r7, r3)
            if (r7 != 0) goto L18d
            java.lang.String r7 = "/audio"
            boolean r6 = p000.q02.m4654(r6, r7, r3)
            if (r6 != 0) goto L18d
            java.lang.String r6 = "~79E5B19C89B3C3BDFA87D5FC28F4667EC8FACC5D1EBC6A59BA9DEDCE"
            java.lang.String r6 = p000.jf0.m2957(r6)
            boolean r5 = p000.x02.m6485(r4, r6, r5)
            if (r5 != 0) goto L18d
            java.lang.String r5 = "audio"
            boolean r3 = p000.q02.m4654(r4, r5, r3)
            if (r3 == 0) goto L191
        L18d:
            ya2 r15 = p000.ya2.f12542
            goto L191
        L190:
            r15 = r2
        L191:
            if (r15 != 0) goto L194
            goto L19e
        L194:
            if (r15 != r2) goto L199
            java.lang.String r2 = "comment-runnable"
            goto L19b
        L199:
            java.lang.String r2 = "im-runnable"
        L19b:
            p000.ib2.m2725(r1, r15, r0, r2)
        L19e:
            return
        L19f:
            r1.getClass()
            java.lang.reflect.Executable r0 = r1.f5690
            boolean r2 = r0 instanceof java.lang.reflect.Method
            if (r2 == 0) goto L1ab
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto L1ac
        L1ab:
            r0 = r15
        L1ac:
            if (r0 == 0) goto L1b8
            l82 r2 = p000.l82.f6483
            java.lang.Object r2 = r1.f5691
            r2.getClass()
            p000.l82.m3535(r0, r2)
        L1b8:
            java.lang.Object[] r0 = r1.f5692
            r0 = r0[r5]
            r0.getClass()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "▶ SimPlayer.setSpeed("
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5988(r12, r0, r15, r14, r15)
            return
        L1da:
            r1.getClass()
            java.lang.reflect.Executable r0 = r1.f5690
            boolean r2 = r0 instanceof java.lang.reflect.Method
            if (r2 == 0) goto L1e6
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto L1e7
        L1e6:
            r0 = r15
        L1e7:
            if (r0 == 0) goto L1f3
            l82 r2 = p000.l82.f6483
            java.lang.Object r2 = r1.f5691
            r2.getClass()
            p000.l82.m3535(r0, r2)
        L1f3:
            java.lang.Object[] r0 = r1.f5692
            r0 = r0[r5]
            r0.getClass()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "▶ FeedPlayerWrapper.setSpeed("
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5988(r12, r0, r15, r14, r15)
            return
        L215:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2250(r0)
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L24a
            java.lang.Number r1 = (java.lang.Number) r1
            float r2 = r1.floatValue()
            r3 = 1036831949(0x3dcccccd, float:0.1)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 1092616192(0x41200000, float:10.0)
            if (r2 < 0) goto L23c
            float r2 = r1.floatValue()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L24a
        L23c:
            float r1 = r1.floatValue()
            float r1 = p000.j81.m2905(r1, r3, r4)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0[r5] = r1
        L24a:
            return
        L24b:
            r1.getClass()
            boolean r0 = p000.n82.m4012()
            if (r0 == 0) goto L259
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.m3107(r0)
        L259:
            return
        L25a:
            r1.getClass()
            boolean r0 = p000.n82.m4012()
            if (r0 == 0) goto L26a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.m3107(r0)
        L26a:
            return
        L26b:
            r1.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.m3107(r0)
            return
        L274:
            java.lang.String r2 = ": "
            java.lang.String r4 = "Native extended speed enabled for "
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2250(r0)
            if (r0 != 0) goto L288
            goto L315
        L288:
            java.lang.String r6 = "getSpeed"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L297
            java.lang.Object r0 = p000.qe0.m4869(r0, r6, r5)     // Catch: java.lang.Throwable -> L297
            boolean r5 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L297
            if (r5 == 0) goto L299
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L297
            goto L29a
        L297:
            r0 = move-exception
            goto L2a5
        L299:
            r0 = r15
        L29a:
            if (r0 == 0) goto L2ba
            float r0 = r0.floatValue()     // Catch: java.lang.Throwable -> L297
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L297
            goto L2bb
        L2a5:
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r6 = "Read PlaybackParams speed ERR: "
            java.lang.String r0 = p000.a12.m18(r6, r5, r2, r0)
            p000.C0888ux.m5988(r12, r0, r15, r14, r15)
        L2ba:
            r0 = r15
        L2bb:
            if (r0 == 0) goto L315
            float r0 = r0.floatValue()
            float r5 = java.lang.Math.abs(r0)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L315
            r5 = 1077936128(0x40400000, float:3.0)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L2d3
            goto L315
        L2d3:
            java.lang.Object r5 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L2ff
            java.lang.Object r1 = r1.f5691     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r5 = "setIntOption"
            r6 = 258(0x102, float:3.62E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L2ff
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2ff
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r3}     // Catch: java.lang.Throwable -> L2ff
            p000.qe0.m4869(r1, r5, r3)     // Catch: java.lang.Throwable -> L2ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ff
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L2ff
            r1.append(r0)     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r0 = "x"
            r1.append(r0)     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L2ff
            p000.C0888ux.m5988(r12, r0, r15, r14, r15)     // Catch: java.lang.Throwable -> L2ff
            goto L315
        L2ff:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "Enable native extended speed ERR: "
            java.lang.String r0 = p000.a12.m18(r3, r1, r2, r0)
            p000.C0888ux.m5988(r12, r0, r15, r14, r15)
        L315:
            return
        L316:
            r1.getClass()
            java.lang.ThreadLocal r0 = p000.l82.f6485
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L3d4
            long r6 = p000.l82.f6491
            java.util.concurrent.atomic.AtomicLong r0 = p000.l82.f6489
            long r8 = r0.get()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L335
            goto L3d4
        L335:
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r2 = p000.AbstractC0312g7.m2250(r0)
            if (r2 != 0) goto L342
            goto L3d4
        L342:
            java.lang.String r0 = "LIZIZ"
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L358
            java.lang.reflect.Field r0 = r4.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L358
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L358
            float r0 = r0.getFloat(r2)     // Catch: java.lang.Throwable -> L358
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L358
            goto L35f
        L358:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L35f:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L364
            r0 = r15
        L364:
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 == 0) goto L3d4
            float r0 = r0.floatValue()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L3d4
            java.lang.String r0 = "LIZ"
            java.lang.String r4 = p000.l82.m3538(r2, r0)
            if (r4 != 0) goto L379
            goto L3d4
        L379:
            java.lang.String r6 = "default"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L382
            goto L3d4
        L382:
            java.lang.Float r4 = p000.l82.m3537()
            if (r4 == 0) goto L3d4
            float r6 = r4.floatValue()
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 != 0) goto L391
            goto L3d4
        L391:
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class r7 = r2.getClass()     // Catch: java.lang.Throwable -> L3aa
            java.lang.String r0 = p000.l82.m3538(r2, r0)     // Catch: java.lang.Throwable -> L3aa
            if (r0 != 0) goto L39f
            r0 = r15
            goto L3c8
        L39f:
            java.lang.String r8 = "LIZJ"
            java.lang.String r2 = p000.l82.m3538(r2, r8)     // Catch: java.lang.Throwable -> L3aa
            if (r2 != 0) goto L3ac
            java.lang.String r2 = ""
            goto L3ac
        L3aa:
            r0 = move-exception
            goto L3c2
        L3ac:
            java.lang.Class r8 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L3aa
            java.lang.Class[] r6 = new java.lang.Class[]{r8, r6, r6}     // Catch: java.lang.Throwable -> L3aa
            java.lang.reflect.Constructor r6 = r7.getDeclaredConstructor(r6)     // Catch: java.lang.Throwable -> L3aa
            r6.setAccessible(r3)     // Catch: java.lang.Throwable -> L3aa
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0, r2}     // Catch: java.lang.Throwable -> L3aa
            java.lang.Object r0 = r6.newInstance(r0)     // Catch: java.lang.Throwable -> L3aa
            goto L3c8
        L3c2:
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L3c8:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L3cd
            goto L3ce
        L3cd:
            r15 = r0
        L3ce:
            if (r15 == 0) goto L3d4
            java.lang.Object[] r0 = r1.f5692
            r0[r5] = r15
        L3d4:
            return
        L3d5:
            r1.getClass()
            l52 r0 = p000.l52.f6428
            boolean r0 = p000.l52.m3514()
            if (r0 != 0) goto L3e2
            goto L4d5
        L3e2:
            boolean r0 = p000.AbstractC0976x9.m6531()
            if (r0 != 0) goto L3ea
            goto L4d5
        L3ea:
            p000.l52.m3503()
            p000.l52.m3517()
            long r10 = java.lang.System.currentTimeMillis()
            long r19 = p000.l52.f6446
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 >= 0) goto L3fc
            goto L4d5
        L3fc:
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r5, r0)
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L40c
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L40d
        L40c:
            r0 = r15
        L40d:
            if (r0 == 0) goto L4d5
            int r2 = r0.intValue()
            java.util.Set r4 = p000.l52.f6439
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L41d
            goto L4d5
        L41d:
            java.lang.Object r0 = r1.f5691
            java.lang.Object r0 = p000.l52.m3518(r0)
            if (r0 != 0) goto L438
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ra3f49bce40b36580"
            p000.C0888ux.m5977(r1, r0, r15)
            goto L4d5
        L438:
            java.lang.Object r4 = p000.l52.f6438
            int r4 = r4.size()
            if (r4 > 0) goto L443
        L440:
            r4 = r15
            goto L4a2
        L443:
            java.util.Set r5 = p000.l52.f6439
            long r19 = java.lang.System.currentTimeMillis()
            int r6 = p000.l52.f6444
            if (r6 == 0) goto L458
            long r21 = p000.l52.f6445
            long r19 = r19 - r21
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 > 0) goto L458
            int r13 = p000.l52.f6444
            goto L467
        L458:
            int r6 = p000.l52.f6440
            if (r6 >= 0) goto L45e
        L45c:
            r13 = r3
            goto L467
        L45e:
            int r6 = p000.l52.f6440
            if (r2 <= r6) goto L463
            goto L45c
        L463:
            int r6 = p000.l52.f6440
            if (r2 >= r6) goto L45c
        L467:
            int r6 = r2 + r13
        L469:
            if (r6 < 0) goto L47e
            if (r6 >= r4) goto L47e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r7 = r5.contains(r7)
            if (r7 != 0) goto L47c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L47f
        L47c:
            int r6 = r6 + r13
            goto L469
        L47e:
            r6 = r15
        L47f:
            if (r6 == 0) goto L48a
            int r4 = r6.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L4a2
        L48a:
            int r6 = r2 - r13
            int r7 = -r13
        L48d:
            if (r6 < 0) goto L440
            if (r6 >= r4) goto L440
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r8 = r5.contains(r8)
            if (r8 != 0) goto L4a0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            goto L4a2
        L4a0:
            int r6 = r6 + r7
            goto L48d
        L4a2:
            if (r4 == 0) goto L4d5
            int r4 = r4.intValue()
            int r5 = p000.l52.m3509(r0)
            if (r4 < 0) goto L4d5
            if (r4 >= r5) goto L4d5
            r1.m3107(r15)
            p000.l52.f6440 = r4
            long r10 = r10 + r17
            p000.l52.f6446 = r10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L4c0
            r15 = r0
            android.view.View r15 = (android.view.View) r15
        L4c0:
            h52 r1 = new h52
            r1.<init>(r0, r4, r2, r3)
            if (r15 == 0) goto L4d2
            ν r0 = new ν
            r2 = 28
            r0.<init>(r2, r1)
            r15.post(r0)
            goto L4d5
        L4d2:
            r1.invoke()
        L4d5:
            return
        L4d6:
            r1.getClass()
            l52 r0 = p000.l52.f6428
            boolean r0 = p000.l52.m3514()
            if (r0 != 0) goto L4e3
            goto L557
        L4e3:
            java.lang.Object r0 = r1.f5691
            java.lang.Object[] r1 = r1.f5692
            r1.getClass()
            int r2 = r1.length
            if (r2 < r4) goto L50b
            r2 = r1[r5]
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L50b
            r4 = r1[r3]
            boolean r4 = r4 instanceof java.lang.Float
            if (r4 == 0) goto L50b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1 = r1[r3]
            r1.getClass()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L530
        L50b:
            int r2 = r1.length
            if (r2 < r14) goto L557
            r2 = r1[r5]
            boolean r4 = r2 instanceof java.lang.Float
            if (r4 == 0) goto L557
            r4 = r1[r3]
            boolean r4 = r4 instanceof java.lang.Integer
            if (r4 == 0) goto L557
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1 = r1[r3]
            r1.getClass()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r23 = r2
            r2 = r1
            r1 = r23
        L530:
            int r4 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r4 <= 0) goto L557
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 < 0) goto L539
            goto L557
        L539:
            java.lang.Object r0 = p000.l52.m3518(r0)
            if (r0 != 0) goto L540
            goto L557
        L540:
            int r0 = p000.l52.m3510(r0)
            if (r0 != r2) goto L548
            r13 = r3
            goto L54c
        L548:
            if (r0 <= r2) goto L54b
            goto L54c
        L54b:
            r13 = r5
        L54c:
            if (r13 != 0) goto L54f
            goto L557
        L54f:
            p000.l52.f6444 = r13
            long r0 = java.lang.System.currentTimeMillis()
            p000.l52.f6445 = r0
        L557:
            return
        L558:
            r1.getClass()
            m52 r0 = p000.m52.f6942
            boolean r0 = p000.m52.m3745()
            if (r0 != 0) goto L565
            goto L658
        L565:
            boolean r0 = p000.AbstractC0976x9.m6531()
            if (r0 != 0) goto L56d
            goto L658
        L56d:
            p000.m52.m3734()
            p000.m52.m3748()
            long r10 = java.lang.System.currentTimeMillis()
            long r19 = p000.m52.f6960
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 >= 0) goto L57f
            goto L658
        L57f:
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r5, r0)
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L58f
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L590
        L58f:
            r0 = r15
        L590:
            if (r0 == 0) goto L658
            int r2 = r0.intValue()
            java.util.Set r4 = p000.m52.f6953
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L5a0
            goto L658
        L5a0:
            java.lang.Object r0 = r1.f5691
            java.lang.Object r0 = p000.m52.m3749(r0)
            if (r0 != 0) goto L5bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "r14983b95b84acb5"
            p000.C0888ux.m5977(r1, r0, r15)
            goto L658
        L5bb:
            java.lang.Object r4 = p000.m52.f6952
            int r4 = r4.size()
            if (r4 > 0) goto L5c6
        L5c3:
            r3 = r15
            goto L625
        L5c6:
            java.util.Set r6 = p000.m52.f6953
            long r19 = java.lang.System.currentTimeMillis()
            int r9 = p000.m52.f6958
            if (r9 == 0) goto L5db
            long r21 = p000.m52.f6959
            long r19 = r19 - r21
            int r7 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r7 > 0) goto L5db
            int r13 = p000.m52.f6958
            goto L5ea
        L5db:
            int r7 = p000.m52.f6954
            if (r7 >= 0) goto L5e1
        L5df:
            r13 = r3
            goto L5ea
        L5e1:
            int r7 = p000.m52.f6954
            if (r2 <= r7) goto L5e6
            goto L5df
        L5e6:
            int r7 = p000.m52.f6954
            if (r2 >= r7) goto L5df
        L5ea:
            int r3 = r2 + r13
        L5ec:
            if (r3 < 0) goto L601
            if (r3 >= r4) goto L601
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L5ff
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L602
        L5ff:
            int r3 = r3 + r13
            goto L5ec
        L601:
            r3 = r15
        L602:
            if (r3 == 0) goto L60d
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L625
        L60d:
            int r3 = r2 - r13
            int r7 = -r13
        L610:
            if (r3 < 0) goto L5c3
            if (r3 >= r4) goto L5c3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r8 = r6.contains(r8)
            if (r8 != 0) goto L623
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L625
        L623:
            int r3 = r3 + r7
            goto L610
        L625:
            if (r3 == 0) goto L658
            int r3 = r3.intValue()
            int r4 = p000.m52.m3740(r0)
            if (r3 < 0) goto L658
            if (r3 >= r4) goto L658
            r1.m3107(r15)
            p000.m52.f6954 = r3
            long r10 = r10 + r17
            p000.m52.f6960 = r10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L643
            r15 = r0
            android.view.View r15 = (android.view.View) r15
        L643:
            h52 r1 = new h52
            r1.<init>(r0, r3, r2, r5)
            if (r15 == 0) goto L655
            ν r0 = new ν
            r2 = 27
            r0.<init>(r2, r1)
            r15.post(r0)
            goto L658
        L655:
            r1.invoke()
        L658:
            return
        L659:
            r1.getClass()
            m52 r0 = p000.m52.f6942
            boolean r0 = p000.m52.m3745()
            if (r0 != 0) goto L666
            goto L6da
        L666:
            java.lang.Object r0 = r1.f5691
            java.lang.Object[] r1 = r1.f5692
            r1.getClass()
            int r2 = r1.length
            if (r2 < r4) goto L68e
            r2 = r1[r5]
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L68e
            r4 = r1[r3]
            boolean r4 = r4 instanceof java.lang.Float
            if (r4 == 0) goto L68e
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1 = r1[r3]
            r1.getClass()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L6b3
        L68e:
            int r2 = r1.length
            if (r2 < r14) goto L6da
            r2 = r1[r5]
            boolean r4 = r2 instanceof java.lang.Float
            if (r4 == 0) goto L6da
            r4 = r1[r3]
            boolean r4 = r4 instanceof java.lang.Integer
            if (r4 == 0) goto L6da
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1 = r1[r3]
            r1.getClass()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r23 = r2
            r2 = r1
            r1 = r23
        L6b3:
            int r4 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r4 <= 0) goto L6da
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 < 0) goto L6bc
            goto L6da
        L6bc:
            java.lang.Object r0 = p000.m52.m3749(r0)
            if (r0 != 0) goto L6c3
            goto L6da
        L6c3:
            int r0 = p000.m52.m3741(r0)
            if (r0 != r2) goto L6cb
            r13 = r3
            goto L6cf
        L6cb:
            if (r0 <= r2) goto L6ce
            goto L6cf
        L6ce:
            r13 = r5
        L6cf:
            if (r13 != 0) goto L6d2
            goto L6da
        L6d2:
            p000.m52.f6958 = r13
            long r0 = java.lang.System.currentTimeMillis()
            p000.m52.f6959 = r0
        L6da:
            return
        L6db:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            boolean r1 = p000.o22.m4179()
            if (r1 == 0) goto L6e7
            goto L71f
        L6e7:
            r0.getClass()
            java.lang.Object r1 = p000.AbstractC0312g7.m2253(r5, r0)
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L6f5
            r15 = r1
            android.view.View r15 = (android.view.View) r15
        L6f5:
            if (r15 != 0) goto L6f8
            goto L71f
        L6f8:
            java.util.Set r1 = p000.o22.f7897
            boolean r1 = r1.contains(r15)
            if (r1 != 0) goto L701
            goto L71f
        L701:
            int r1 = r0.length
            r2 = r5
        L703:
            if (r5 >= r1) goto L71c
            r4 = r0[r5]
            int r6 = r2 + 1
            boolean r7 = r4 instanceof android.view.ViewGroup.LayoutParams
            if (r7 == 0) goto L718
            r7 = r4
            android.view.ViewGroup$LayoutParams r7 = (android.view.ViewGroup.LayoutParams) r7
            p000.o22.m4158(r15, r7, r3)
            p000.o22.m4167(r7)
            r0[r2] = r4
        L718:
            int r5 = r5 + 1
            r2 = r6
            goto L703
        L71c:
            p000.o22.m4171(r15)
        L71f:
            return
        L720:
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            boolean r2 = p000.o22.m4179()
            if (r2 == 0) goto L72c
            goto L75f
        L72c:
            java.lang.Object r1 = r1.f5691
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L735
            android.view.View r1 = (android.view.View) r1
            goto L736
        L735:
            r1 = r15
        L736:
            if (r1 != 0) goto L739
            goto L75f
        L739:
            java.util.Set r2 = p000.o22.f7897
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L742
            goto L75f
        L742:
            r0.getClass()
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r5, r0)
            boolean r4 = r2 instanceof android.view.ViewGroup.LayoutParams
            if (r4 == 0) goto L750
            r15 = r2
            android.view.ViewGroup$LayoutParams r15 = (android.view.ViewGroup.LayoutParams) r15
        L750:
            if (r15 != 0) goto L757
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r5, r5)
        L757:
            p000.o22.m4158(r1, r15, r3)
            p000.o22.m4167(r15)
            r0[r5] = r15
        L75f:
            return
        L760:
            r1.getClass()
            boolean r0 = p000.o22.m4179()
            if (r0 == 0) goto L76a
            goto L789
        L76a:
            java.lang.Object r0 = r1.f5691
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L773
            r15 = r0
            android.view.View r15 = (android.view.View) r15
        L773:
            if (r15 != 0) goto L776
            goto L789
        L776:
            java.util.Set r0 = p000.o22.f7897
            boolean r0 = r0.contains(r15)
            if (r0 != 0) goto L77f
            goto L789
        L77f:
            java.lang.Object[] r0 = r1.f5692
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r5] = r1
        L789:
            return
    }
}
