package p000;

/* JADX INFO: renamed from: bm */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0082bm extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f1784;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.ClassLoader f1785;

    public /* synthetic */ C0082bm(int r1, java.lang.ClassLoader r2, boolean r3) {
            r0 = this;
            r0.f1784 = r1
            r0.f1785 = r2
            r0.<init>()
            return
    }

    public C0082bm(java.lang.ClassLoader r1, int r2) {
            r0 = this;
            r0.f1784 = r2
            switch(r2) {
                case 2: goto L25;
                case 8: goto L1d;
                case 9: goto L15;
                case 12: goto Ld;
                default: goto L5;
            }
        L5:
            java.util.Set r2 = p000.C0118cm.f2205
            r0.f1785 = r1
            r0.<init>()
            return
        Ld:
            c82 r2 = p000.c82.f1991
            r0.f1785 = r1
            r0.<init>()
            return
        L15:
            o22 r2 = p000.o22.f7889
            r0.f1785 = r1
            r0.<init>()
            return
        L1d:
            sh1 r2 = p000.sh1.f9903
            r0.f1785 = r1
            r0.<init>()
            return
        L25:
            java.util.Set r2 = p000.o20.f7873
            r0.f1785 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r0.f1784
            r3 = 3
            r4 = -1
            r5 = 0
            r6 = 10
            r7 = 1
            r8 = 2
            r9 = 4
            r10 = 0
            switch(r2) {
                case 0: goto L362;
                case 1: goto L12;
                case 2: goto L2d1;
                case 3: goto L12;
                case 4: goto L12;
                case 5: goto L2b9;
                case 6: goto L12;
                case 7: goto L2a6;
                case 8: goto Lee;
                case 9: goto Lb7;
                case 10: goto La4;
                case 11: goto L4d;
                case 12: goto L16;
                default: goto L12;
            }
        L12:
            super.afterHookedMethod(r20)
            return
        L16:
            r1.getClass()
            c82 r2 = p000.c82.f1991
            java.lang.Object r1 = r1.f5694
            java.lang.ClassLoader r0 = r0.f1785
            if (r1 != 0) goto L22
            goto L4c
        L22:
            r2.m1169(r1, r0)     // Catch: java.lang.Throwable -> L28
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L28
            goto L2f
        L28:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L2f:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L4c
            c82 r1 = p000.c82.f1991
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Feed 解码结果过滤失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.c82.m1159(r0)
        L4c:
            return
        L4d:
            r1.getClass()
            java.lang.Object r1 = r1.f5694
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L59
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
        L59:
            if (r10 != 0) goto L5c
            goto La3
        L5c:
            java.lang.Long r1 = p000.x02.m6489(r10, r6)
            if (r1 == 0) goto La3
            long r1 = r1.longValue()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L6d
            goto La3
        L6d:
            long r5 = p000.e72.f3437
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 > 0) goto L79
            java.lang.String r0 = "User.getUid()"
            p000.e72.m1858(r1, r0)
            goto La3
        L79:
            long r3 = p000.e72.f3437
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto La3
            java.util.ArrayList r1 = p000.e72.f3439
            java.lang.ClassLoader r0 = r0.f1785
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = p000.e72.f3438
            long r3 = r1 - r3
            r5 = 1500(0x5dc, double:7.41E-321)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L92
            goto La3
        L92:
            p000.e72.f3438 = r1
            java.lang.Thread r1 = new java.lang.Thread
            oj r2 = new oj
            r3 = 9
            r2.<init>(r0, r3)
            r1.<init>(r2)
            r1.start()
        La3:
            return
        La4:
            r1.getClass()
            java.lang.Thread r1 = new java.lang.Thread
            java.lang.ClassLoader r0 = r0.f1785
            oj r2 = new oj
            r2.<init>(r0, r6)
            r1.<init>(r2)
            r1.start()
            return
        Lb7:
            r1.getClass()
            java.lang.Object r1 = r1.f5694
            if (r1 != 0) goto Lbf
            goto Led
        Lbf:
            o22 r2 = p000.o22.f7889
            java.lang.Class r1 = r1.getClass()
            java.lang.ClassLoader r0 = r0.f1785
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.o22.f7892
            java.lang.String r3 = r1.getName()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto Ld4
            goto Led
        Ld4:
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.o22.f7893
            java.lang.String r3 = r1.getName()
            boolean r2 = r2.add(r3)
            if (r2 != 0) goto Le1
            goto Led
        Le1:
            android.os.Handler r2 = p000.o22.f7910
            ii0 r3 = new ii0
            r4 = 27
            r3.<init>(r1, r4, r0)
            r2.post(r3)
        Led:
            return
        Lee:
            r1.getClass()
            sh1 r2 = p000.sh1.f9903
            java.lang.ClassLoader r2 = r0.f1785
            java.lang.Object[] r1 = r1.f5692
            java.lang.String r0 = "auto_scroll_next_enabled"
            boolean r6 = p000.ui1.m5887(r0, r5)
            java.lang.String r0 = "auto_pause_on_complete_enabled"
            boolean r11 = p000.ui1.m5887(r0, r5)
            if (r6 != 0) goto L109
            if (r11 != 0) goto L109
            goto L2a3
        L109:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.AbstractC0825t7.f10214
            m7 r0 = p000.AbstractC0825t7.f10216
            if (r0 != 0) goto L111
            r0 = r4
            goto L119
        L111:
            int[] r12 = p000.AbstractC0788s7.f9752
            int r0 = r0.ordinal()
            r0 = r12[r0]
        L119:
            if (r0 == r4) goto L130
            if (r0 == r7) goto L129
            if (r0 == r8) goto L129
            if (r0 == r3) goto L130
            if (r0 != r9) goto L124
            goto L130
        L124:
            p000.C1080.m7272()
            goto L2a3
        L129:
            java.lang.String r0 = "ignore play completed for non-video selection"
            p000.sh1.m5510(r0)
            goto L2a3
        L130:
            if (r1 != 0) goto L134
            goto L221
        L134:
            r0 = r5
        L135:
            int r3 = r1.length
            if (r0 >= r3) goto L15b
            int r3 = r0 + 1
            r0 = r1[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L150
            boolean r4 = r0 instanceof java.lang.String
            if (r4 == 0) goto L14e
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto L14e
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            goto L221
        L14e:
            r0 = r3
            goto L135
        L150:
            r0 = move-exception
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L15b:
            r0 = r5
        L15c:
            int r3 = r1.length
            if (r0 >= r3) goto L221
            int r3 = r0 + 1
            r4 = r1[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L216
            if (r4 != 0) goto L167
        L165:
            r0 = r3
            goto L15c
        L167:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r8 = "Param"
            boolean r8 = p000.q02.m4654(r0, r8, r5)
            if (r8 != 0) goto L188
            java.lang.String r8 = "Completed"
            boolean r8 = p000.q02.m4654(r0, r8, r5)
            if (r8 != 0) goto L188
            java.lang.String r8 = "Play"
            boolean r0 = p000.q02.m4654(r0, r8, r5)
            if (r0 != 0) goto L188
            goto L165
        L188:
            java.lang.String r0 = "getAwemeId"
            java.lang.String r8 = "getAid"
            java.lang.String r12 = "getId"
            java.lang.String r13 = "getVideoId"
            java.lang.String[] r0 = new java.lang.String[]{r0, r8, r12, r13}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r8 = r0.iterator()
        L19c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L1cc
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L1af
            java.lang.Object r0 = p000.qe0.m4869(r4, r0, r12)     // Catch: java.lang.Throwable -> L1af
            goto L1b6
        L1af:
            r0 = move-exception
            eo1 r12 = new eo1
            r12.<init>(r0)
            r0 = r12
        L1b6:
            boolean r12 = r0 instanceof p000.eo1
            if (r12 == 0) goto L1bb
            r0 = r10
        L1bb:
            boolean r12 = r0 instanceof java.lang.String
            if (r12 == 0) goto L19c
            r12 = r0
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = p000.q02.m4671(r12)
            if (r12 != 0) goto L19c
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            goto L221
        L1cc:
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L1d5
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L1d5
            goto L1dc
        L1d5:
            r0 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r0)
            r0 = r8
        L1dc:
            boolean r8 = r0 instanceof p000.eo1
            if (r8 == 0) goto L1e1
            r0 = r10
        L1e1:
            r8 = r0
            java.lang.reflect.Field[] r8 = (java.lang.reflect.Field[]) r8
            if (r8 != 0) goto L1e8
            goto L165
        L1e8:
            int r12 = r8.length
            r13 = r5
        L1ea:
            if (r13 >= r12) goto L165
            r0 = r8[r13]
            r0.setAccessible(r7)     // Catch: java.lang.Throwable -> L1f6
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1f6
            goto L1fd
        L1f6:
            r0 = move-exception
            eo1 r14 = new eo1
            r14.<init>(r0)
            r0 = r14
        L1fd:
            boolean r14 = r0 instanceof p000.eo1
            if (r14 == 0) goto L202
            r0 = r10
        L202:
            boolean r14 = r0 instanceof java.lang.String
            if (r14 == 0) goto L213
            r14 = r0
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            boolean r14 = p000.q02.m4671(r14)
            if (r14 != 0) goto L213
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            goto L221
        L213:
            int r13 = r13 + 1
            goto L1ea
        L216:
            r0 = move-exception
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L221:
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r3 = p000.sh1.f9914
            monitor-enter(r3)
            long r12 = p000.sh1.f9915     // Catch: java.lang.Throwable -> L240
            long r12 = r0 - r12
            r14 = 1200(0x4b0, double:5.93E-321)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 >= 0) goto L234
            r4 = r7
            goto L235
        L234:
            r4 = r5
        L235:
            if (r10 == 0) goto L242
            java.lang.String r8 = p000.sh1.f9916     // Catch: java.lang.Throwable -> L240
            boolean r8 = r10.equals(r8)     // Catch: java.lang.Throwable -> L240
            if (r8 == 0) goto L242
            goto L243
        L240:
            r0 = move-exception
            goto L2a4
        L242:
            r7 = r5
        L243:
            if (r4 == 0) goto L24f
            if (r7 != 0) goto L24d
            if (r10 == 0) goto L24d
            java.lang.String r4 = p000.sh1.f9916     // Catch: java.lang.Throwable -> L240
            if (r4 != 0) goto L24f
        L24d:
            monitor-exit(r3)
            goto L2a3
        L24f:
            p000.sh1.f9915 = r0     // Catch: java.lang.Throwable -> L240
            p000.sh1.f9916 = r10     // Catch: java.lang.Throwable -> L240
            monitor-exit(r3)
            java.util.concurrent.atomic.AtomicInteger r0 = p000.sh1.f9909
            int r0 = r0.incrementAndGet()
            if (r11 == 0) goto L283
            if (r6 == 0) goto L26b
            android.os.Handler r1 = p000.sh1.f9904
            oj r3 = new oj
            r4 = 8
            r3.<init>(r2, r4)
            r1.post(r3)
            goto L283
        L26b:
            long[] r1 = new long[r9]
            r1 = {x0424: FILL_ARRAY_DATA , data: [0, 120, 350, 800} // fill-array
            r3 = r5
        L271:
            if (r3 >= r9) goto L283
            r7 = r1[r3]
            android.os.Handler r4 = p000.sh1.f9904
            oj r10 = new oj
            r12 = 5
            r10.<init>(r2, r12)
            r4.postDelayed(r10, r7)
            int r3 = r3 + 1
            goto L271
        L283:
            if (r6 != 0) goto L286
            goto L2a3
        L286:
            java.lang.String r1 = "auto_scroll_delay_ms"
            r3 = 800(0x320, float:1.121E-42)
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L292
            int r3 = r4.getInt(r1, r3)     // Catch: java.lang.Throwable -> L292
        L292:
            r1 = 5000(0x1388, float:7.006E-42)
            int r1 = p000.j81.m2906(r3, r5, r1)
            long r3 = (long) r1
            android.os.Handler r1 = p000.sh1.f9904
            rh1 r5 = new rh1
            r5.<init>(r0, r2, r11)
            r1.postDelayed(r5, r3)
        L2a3:
            return
        L2a4:
            monitor-exit(r3)
            throw r0
        L2a6:
            r1.getClass()
            boolean r1 = p000.kn0.f6047
            if (r1 == 0) goto L2b1
            int r1 = p000.kn0.f6048
            if (r1 > 0) goto L2b8
        L2b1:
            java.util.Set r1 = p000.q20.f8803
            java.lang.ClassLoader r0 = r0.f1785
            p000.q20.m4721(r0)
        L2b8:
            return
        L2b9:
            r1.getClass()
            java.util.Set r1 = p000.q20.f8803
            java.lang.ClassLoader r1 = r0.f1785
            p000.q20.m4717(r1)
            boolean r1 = p000.kn0.f6047
            if (r1 == 0) goto L2cb
            int r1 = p000.kn0.f6048
            if (r1 > 0) goto L2d0
        L2cb:
            java.lang.ClassLoader r0 = r0.f1785
            p000.q20.m4721(r0)
        L2d0:
            return
        L2d1:
            r1.getClass()
            java.util.Set r2 = p000.o20.f7873
            java.lang.ClassLoader r13 = r0.f1785
            java.lang.Object r0 = r1.f5691
            java.lang.Object r1 = p000.qe0.f8982
            java.lang.String r1 = "~78B38367CFE852F14F689594842A0085750A11DB0443EB2AFF250DFFBABD94A01BAE8D13E20B0745AD541F739E610490C00DB97E203B7A27453B359A1B6E0ACFDBE2FBAE339F5D0679"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = p000.qe0.m4877(r13, r1)
            cc r2 = new cc
            r2.<init>(r8, r1)
            java.lang.Object r14 = p000.h62.m2373(r2, r0)
            if (r14 != 0) goto L2f3
            goto L361
        L2f3:
            ig r1 = new ig
            r2 = 15
            r1.<init>(r2)
            java.lang.Object r15 = p000.h62.m2373(r1, r14)
            ig r1 = new ig
            r2 = 11
            r1.<init>(r2)
            java.lang.Object r0 = p000.h62.m2373(r1, r0)
            if (r0 == 0) goto L31b
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L312
            android.view.View r0 = (android.view.View) r0
            goto L313
        L312:
            r0 = r10
        L313:
            if (r0 == 0) goto L31b
            android.content.Context r0 = r0.getContext()
            r12 = r0
            goto L31c
        L31b:
            r12 = r10
        L31c:
            pv0 r11 = new pv0
            java.lang.String r16 = p000.h62.m2375(r14)
            r11.<init>(r12, r13, r14, r15, r16)
            java.util.concurrent.atomic.AtomicReference r0 = p000.b10.f1403     // Catch: java.lang.Throwable -> L334
            if (r15 != 0) goto L32b
        L329:
            r0 = r10
            goto L33b
        L32b:
            f8 r0 = p000.b10.m673(r15)     // Catch: java.lang.Throwable -> L334
            if (r0 == 0) goto L329
            h8 r0 = r0.f3798     // Catch: java.lang.Throwable -> L334
            goto L33b
        L334:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L33b:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L340
            goto L341
        L340:
            r10 = r0
        L341:
            h8 r10 = (p000.EnumC0350h8) r10
            if (r10 != 0) goto L346
            goto L34e
        L346:
            int[] r0 = p000.n20.f7361
            int r1 = r10.ordinal()
            r4 = r0[r1]
        L34e:
            if (r4 == r7) goto L35a
            if (r4 == r8) goto L35a
            if (r4 == r3) goto L357
            mv0 r0 = p000.mv0.f7286
            goto L35c
        L357:
            mv0 r0 = p000.mv0.f7288
            goto L35c
        L35a:
            mv0 r0 = p000.mv0.f7287
        L35c:
            xv0 r1 = p000.xv0.f12327
            r1.m6784(r0, r11)
        L361:
            return
        L362:
            r1.getClass()
            java.util.Set r2 = p000.C0118cm.f2205
            java.lang.ClassLoader r13 = r0.f1785
            java.lang.String r2 = "rc1ad4955cc6c3a73"
            java.lang.Object r0 = r1.f5694
            java.lang.Object[] r1 = r1.f5692
            boolean r3 = p000.h62.m2433(r0)
            if (r3 == 0) goto L379
            java.util.List r0 = (java.util.List) r0
            r3 = r0
            goto L37a
        L379:
            r3 = r10
        L37a:
            if (r3 != 0) goto L37e
            goto L405
        L37e:
            r1.getClass()
            java.lang.Object r14 = p000.AbstractC0312g7.m2253(r5, r1)
            if (r14 != 0) goto L389
            goto L405
        L389:
            java.lang.Object r15 = p000.AbstractC0312g7.m2253(r7, r1)
            android.content.Context r12 = p000.h62.m2370(r14)
            java.lang.Object r16 = p000.h62.m2369(r14)
            ig r0 = new ig
            r1 = 16
            r0.<init>(r1)
            java.lang.Object r17 = p000.h62.m2373(r0, r14)
            java.lang.String r18 = p000.h62.m2375(r14)
            ov0 r11 = new ov0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            xv0 r0 = p000.xv0.f12327
            mv0 r1 = p000.mv0.f7285
            java.util.List r0 = r0.m6784(r1, r11)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3b8
            goto L405
        L3b8:
            java.util.Iterator r1 = r0.iterator()
        L3bc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L405
            java.lang.Object r0 = r1.next()
            r4 = r0
            nv0 r4 = (p000.nv0) r4
            java.util.Set r0 = p000.C0118cm.f2205
            java.lang.Object r0 = p000.C0118cm.m1257(r13, r4, r14, r15)     // Catch: java.lang.Throwable -> L3ec
            boolean r0 = p000.C0118cm.m1254(r13, r3, r0, r4)     // Catch: java.lang.Throwable -> L3ec
            if (r0 != 0) goto L3ee
            java.lang.String r0 = r4.f7758     // Catch: java.lang.Throwable -> L3ec
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3ec
            r5.<init>()     // Catch: java.lang.Throwable -> L3ec
            java.lang.String r6 = "skip comment action, panel container not found id="
            r5.append(r6)     // Catch: java.lang.Throwable -> L3ec
            r5.append(r0)     // Catch: java.lang.Throwable -> L3ec
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L3ec
            p000.C0888ux.m5988(r2, r0, r10, r9, r10)     // Catch: java.lang.Throwable -> L3ec
            goto L3ee
        L3ec:
            r0 = move-exception
            goto L3f1
        L3ee:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3ec
            goto L3f7
        L3f1:
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L3f7:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L3bc
            java.lang.String r4 = r4.f7758
            java.lang.String r5 = "create comment action failed id="
            p000.AbstractC0602nx.m4145(r5, r4, r2, r0)
            goto L3bc
        L405:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r13) {
            r12 = this;
            int r0 = r12.f1784
            r1 = 4
            r2 = 0
            r3 = 0
            switch(r0) {
                case 1: goto L152;
                case 2: goto L8;
                case 3: goto L13e;
                case 4: goto La2;
                case 5: goto L8;
                case 6: goto L1c;
                case 7: goto Lc;
                default: goto L8;
            }
        L8:
            super.beforeHookedMethod(r13)
            return
        Lc:
            r13.getClass()
            java.util.Set r13 = p000.p20.f8396
            r13.clear()
            java.util.Set r13 = p000.q20.f8803
            java.lang.ClassLoader r12 = r12.f1785
            p000.q20.m4717(r12)
            return
        L1c:
            r13.getClass()
            java.lang.reflect.Executable r0 = r13.f5690
            boolean r1 = r0 instanceof java.lang.reflect.Method
            if (r1 == 0) goto L28
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto L29
        L28:
            r0 = r3
        L29:
            java.util.Set r1 = p000.q20.f8803
            java.lang.ClassLoader r1 = r12.f1785
            boolean r1 = p000.q20.m4718(r13, r1)
            if (r1 == 0) goto L34
            goto La1
        L34:
            int r1 = p000.kn0.f6048
            java.util.Set r4 = p000.p20.f8396
            java.lang.Object[] r4 = r13.f5692
            if (r1 > 0) goto L3d
            goto L6a
        L3d:
            java.lang.String r5 = p000.q20.m4719(r4)
            if (r5 != 0) goto L5b
            if (r4 != 0) goto L47
            java.lang.Object[] r4 = new java.lang.Object[r2]
        L47:
            l20 r2 = new l20
            r5 = 5
            r2.<init>(r5)
            r5 = 30
            java.lang.String r6 = "|"
            java.lang.String r2 = p000.AbstractC0312g7.m2256(r4, r6, r3, r2, r5)
            java.lang.String r4 = "anon:"
            java.lang.String r5 = r4.concat(r2)
        L5b:
            java.util.Set r2 = p000.p20.f8396
            boolean r4 = r2.contains(r5)
            if (r4 == 0) goto L64
            goto L9a
        L64:
            int r4 = r2.size()
            if (r4 < r1) goto L97
        L6a:
            if (r0 == 0) goto L70
            java.lang.Class r3 = r0.getReturnType()
        L70:
            java.lang.Object r12 = p000.q20.m4722(r3)
            r13.m3107(r12)
            java.lang.Object[] r12 = r13.f5692
            java.lang.String r12 = p000.q20.m4719(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "skip engine preload by count="
            r13.<init>(r0)
            r13.append(r1)
            java.lang.String r0 = " key="
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            p000.q20.m4726(r12)
            goto La1
        L97:
            r2.add(r5)
        L9a:
            java.lang.ClassLoader r12 = r12.f1785
            java.lang.Object[] r13 = r13.f5692
            p000.q20.m4720(r12, r13)
        La1:
            return
        La2:
            r13.getClass()
            java.util.Set r0 = p000.q20.f8803
            java.lang.ClassLoader r0 = r12.f1785
            boolean r0 = p000.q20.m4718(r13, r0)
            if (r0 == 0) goto Lb1
            goto L13d
        Lb1:
            java.lang.reflect.Executable r0 = r13.f5690
            boolean r4 = r0 instanceof java.lang.reflect.Method
            if (r4 == 0) goto Lba
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            goto Lbb
        Lba:
            r0 = r3
        Lbb:
            java.lang.Object[] r4 = r13.f5692
            int r5 = p000.kn0.f6048
            if (r4 == 0) goto L134
            if (r5 > 0) goto Lc5
            goto L134
        Lc5:
            int r6 = r4.length
        Lc6:
            if (r2 >= r6) goto L134
            r7 = r4[r2]
            boolean r8 = r7 instanceof java.util.List
            if (r8 == 0) goto Ld1
            java.util.List r7 = (java.util.List) r7
            goto Ld2
        Ld1:
            r7 = r3
        Ld2:
            if (r7 != 0) goto Ld5
            goto L131
        Ld5:
            int r8 = r7.size()
            if (r8 <= r5) goto L131
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.List r9 = p000.AbstractC0984xh.m6662(r7, r5)
            r8.<init>(r9)
            r4[r2] = r8
            if (r0 == 0) goto Led
            java.lang.String r9 = r0.getName()
            goto Lee
        Led:
            r9 = r3
        Lee:
            java.lang.String r10 = "insertPreloadMedia"
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 == 0) goto L110
            int r9 = r4.length
            if (r9 < r1) goto L110
            r9 = 2
            r10 = r4[r9]
            boolean r11 = r10 instanceof java.lang.Integer
            if (r11 == 0) goto L110
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            int r10 = java.lang.Math.min(r10, r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4[r9] = r10
        L110:
            int r7 = r7.size()
            int r8 = r8.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "trim preload media list "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = " -> "
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            p000.q20.m4726(r7)
        L131:
            int r2 = r2 + 1
            goto Lc6
        L134:
            java.util.Set r0 = p000.q20.f8803
            java.lang.ClassLoader r12 = r12.f1785
            java.lang.Object[] r13 = r13.f5692
            p000.q20.m4720(r12, r13)
        L13d:
            return
        L13e:
            r13.getClass()
            java.util.Set r0 = p000.q20.f8803
            java.lang.ClassLoader r12 = r12.f1785
            boolean r0 = p000.q20.m4718(r13, r12)
            if (r0 == 0) goto L14c
            goto L151
        L14c:
            java.lang.Object[] r13 = r13.f5692
            p000.q20.m4720(r12, r13)
        L151:
            return
        L152:
            java.lang.String r0 = "re42d48bb5ac13a6f"
            java.lang.ClassLoader r12 = r12.f1785
            r13.getClass()
            boolean r4 = p000.d00.m1636()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L176
            java.util.concurrent.atomic.AtomicLong r4 = p000.d00.f2829
            long r8 = r4.get()
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L176
            long r10 = android.os.SystemClock.elapsedRealtime()
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 > 0) goto L176
            r4 = r5
            goto L177
        L176:
            r4 = r2
        L177:
            if (r4 != 0) goto L182
            java.lang.String r8 = "key_ads_instant_reward"
            boolean r8 = p000.ui1.m5887(r8, r2)
            if (r8 != 0) goto L182
            goto L1d3
        L182:
            java.lang.Object r8 = r13.f5691     // Catch: java.lang.Throwable -> L1c5
            r8.getClass()     // Catch: java.lang.Throwable -> L1c5
            p000.d00.m1635(r8, r12)     // Catch: java.lang.Throwable -> L1c5
            java.lang.String r9 = "X.C19417310qO"
            java.lang.Class r12 = p000.qe0.m4876(r12, r9)     // Catch: java.lang.Throwable -> L1c5
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1c5
            java.lang.Object r12 = p000.qe0.m4880(r12, r9)     // Catch: java.lang.Throwable -> L1c5
            java.lang.String r9 = "executeReward"
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L1c5
            p000.qe0.m4869(r8, r9, r12)     // Catch: java.lang.Throwable -> L1c5
            java.lang.String r12 = "closeFragment"
            if (r4 != 0) goto L1ab
            java.lang.String r4 = "key_ads_force_reward"
            boolean r4 = p000.ui1.m5887(r4, r2)     // Catch: java.lang.Throwable -> L1c5
            if (r4 == 0) goto L1ac
        L1ab:
            r2 = r5
        L1ac:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L1c5
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L1c5
            p000.qe0.m4869(r8, r12, r2)     // Catch: java.lang.Throwable -> L1c5
            java.util.concurrent.atomic.AtomicLong r12 = p000.d00.f2829     // Catch: java.lang.Throwable -> L1c5
            r12.set(r6)     // Catch: java.lang.Throwable -> L1c5
            r13.m3107(r3)     // Catch: java.lang.Throwable -> L1c5
            java.lang.String r12 = "小游戏激励广告已按完成状态关闭"
            p000.C0888ux.m5988(r0, r12, r3, r1, r3)     // Catch: java.lang.Throwable -> L1c5
            goto L1d3
        L1c5:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            java.lang.String r13 = "小游戏激励广告即时完成失败，继续宿主流程: "
            java.lang.String r12 = p000.lz1.m3687(r13, r12)
            p000.C0888ux.m5988(r0, r12, r3, r1, r3)
        L1d3:
            return
    }
}
