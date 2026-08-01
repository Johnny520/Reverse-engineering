package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nq1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7708;

    public /* synthetic */ nq1(int r1) {
            r0 = this;
            r0.f7708 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r34) {
            r33 = this;
            r0 = r33
            r1 = r34
            int r0 = r0.f7708
            r2 = 7
            r3 = 6
            r4 = 32
            s62 r5 = p000.s62.f9751
            r6 = 4
            r7 = 3
            r8 = 8
            r9 = 2
            r11 = 1
            r12 = 0
            switch(r0) {
                case 0: goto L7ae;
                case 1: goto L79e;
                case 2: goto L78e;
                case 3: goto L743;
                case 4: goto L711;
                case 5: goto L6bb;
                case 6: goto L67b;
                case 7: goto L648;
                case 8: goto L612;
                case 9: goto L5b3;
                case 10: goto L5a0;
                case 11: goto L590;
                case 12: goto L43e;
                case 13: goto L42e;
                case 14: goto L41e;
                case 15: goto L40e;
                case 16: goto L2f2;
                case 17: goto L148;
                case 18: goto L109;
                case 19: goto Lf9;
                case 20: goto Le9;
                case 21: goto Laa;
                case 22: goto L9a;
                case 23: goto L86;
                case 24: goto L7b;
                case 25: goto L7a;
                case 26: goto L71;
                case 27: goto L46;
                case 28: goto L29;
                default: goto L16;
            }
        L16:
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            bv1 r1 = p000.bv1.f1853
            java.lang.String r1 = "feed_preload_count"
            int r0 = p000.j81.m2906(r0, r12, r8)
            p000.ui1.m5873(r1, r0)
            return r5
        L29:
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = p000.j81.m2905(r0, r1, r2)
            java.lang.String r1 = "clean_progress_bar_alpha"
            p000.ui1.m5872(r1, r0)
            bv1 r0 = p000.bv1.f1853
            p000.bv1.m1036(r1)
            return r5
        L46:
            r0 = r1
            android.app.Activity r0 = (android.app.Activity) r0
            r0.getClass()
            java.lang.String r0 = "profile_video_search_alpha"
            r1 = 100
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L59
            int r0 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            if (r0 != r1) goto L6c
            java.lang.String r0 = "profile_video_comment_bar_alpha"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L67
            int r0 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L67
            goto L68
        L67:
            r0 = r1
        L68:
            if (r0 == r1) goto L6b
            goto L6c
        L6b:
            r11 = r12
        L6c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L71:
            if (r1 != 0) goto L74
            goto L75
        L74:
            r11 = r12
        L75:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L7a:
            return r1
        L7b:
            r0 = r1
            ss1 r0 = (p000.ss1) r0
            r0.getClass()
            java.util.Iterator r0 = r0.iterator()
            return r0
        L86:
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pr1.f8671
            java.lang.Class r0 = r1.getClass()
            java.lang.String r1 = "duration"
            boolean r0 = p000.pr1.m4582(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L9a:
            r1.getClass()
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            p32 r1 = new p32
            r1.<init>(r0)
            return r1
        Laa:
            r1.getClass()
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            q32 r1 = new q32
            java.lang.Object r2 = r0.get(r12)
            n5 r3 = p000.jx0.f5630
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r4 = p000.ln0.m3626(r2, r4)
            if (r4 == 0) goto Lc2
        Lc0:
            r2 = 0
            goto Lce
        Lc2:
            if (r2 == 0) goto Lc0
            java.lang.Object r3 = r3.f7388
            a80 r3 = (p000.a80) r3
            java.lang.Object r2 = r3.invoke(r2)
            p32 r2 = (p000.p32) r2
        Lce:
            r2.getClass()
            int r2 = r2.f8413
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto Ldd
            r10 = r0
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            goto Lde
        Ldd:
            r10 = 0
        Lde:
            r10.getClass()
            boolean r0 = r10.booleanValue()
            r1.<init>(r2, r0)
            return r1
        Le9:
            r1.getClass()
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            rr0 r1 = new rr0
            r1.<init>(r0)
            return r1
        Lf9:
            r1.getClass()
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            xy r1 = new xy
            r1.<init>(r0)
            return r1
        L109:
            r1.getClass()
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r0.get(r12)
            if (r1 == 0) goto L118
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L119
        L118:
            r1 = 0
        L119:
            r1.getClass()
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.get(r11)
            n5 r2 = p000.jx0.f5627
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r3 = p000.ln0.m3626(r0, r3)
            if (r3 == 0) goto L130
        L12e:
            r10 = 0
            goto L13d
        L130:
            if (r0 == 0) goto L12e
            java.lang.Object r2 = r2.f7388
            a80 r2 = (p000.a80) r2
            java.lang.Object r0 = r2.invoke(r0)
            r10 = r0
            xy r10 = (p000.C1001xy) r10
        L13d:
            r10.getClass()
            int r0 = r10.f12379
            kh1 r2 = new kh1
            r2.<init>(r0, r1)
            return r2
        L148:
            r1.getClass()
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            ux1 r13 = new ux1
            java.lang.Object r1 = r0.get(r12)
            int r5 = p000.C0114ci.f2126
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            p000.ln0.m3626(r1, r5)
            if (r1 == 0) goto L179
            boolean r12 = r1.equals(r5)
            if (r12 == 0) goto L16b
            long r14 = p000.C0114ci.f2125
            ci r1 = new ci
            r1.<init>(r14)
            goto L17a
        L16b:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r14 = (long) r1
            long r14 = r14 << r4
            ci r1 = new ci
            r1.<init>(r14)
            goto L17a
        L179:
            r1 = 0
        L17a:
            r1.getClass()
            long r14 = r1.f2127
            java.lang.Object r1 = r0.get(r11)
            z32[] r11 = p000.y32.f12440
            qq1 r11 = p000.rq1.f9466
            a80 r11 = r11.f9083
            p000.ln0.m3626(r1, r5)
            if (r1 == 0) goto L195
            java.lang.Object r1 = r11.invoke(r1)
            y32 r1 = (p000.y32) r1
            goto L196
        L195:
            r1 = 0
        L196:
            r1.getClass()
            r12 = r11
            long r10 = r1.f12442
            java.lang.Object r1 = r0.get(r9)
            d60 r9 = p000.d60.f2920
            n5 r9 = p000.rq1.f9457
            boolean r16 = p000.ln0.m3626(r1, r5)
            if (r16 == 0) goto L1ad
        L1aa:
            r18 = 0
            goto L1bb
        L1ad:
            if (r1 == 0) goto L1aa
            java.lang.Object r9 = r9.f7388
            a80 r9 = (p000.a80) r9
            java.lang.Object r1 = r9.invoke(r1)
            d60 r1 = (p000.d60) r1
            r18 = r1
        L1bb:
            java.lang.Object r1 = r0.get(r7)
            n5 r7 = p000.rq1.f9464
            boolean r9 = p000.ln0.m3626(r1, r5)
            if (r9 == 0) goto L1ca
        L1c7:
            r19 = 0
            goto L1d8
        L1ca:
            if (r1 == 0) goto L1c7
            java.lang.Object r7 = r7.f7388
            a80 r7 = (p000.a80) r7
            java.lang.Object r1 = r7.invoke(r1)
            b60 r1 = (p000.b60) r1
            r19 = r1
        L1d8:
            java.lang.Object r1 = r0.get(r6)
            n5 r6 = p000.rq1.f9465
            boolean r7 = p000.ln0.m3626(r1, r5)
            if (r7 == 0) goto L1e7
        L1e4:
            r20 = 0
            goto L1f5
        L1e7:
            if (r1 == 0) goto L1e4
            java.lang.Object r6 = r6.f7388
            a80 r6 = (p000.a80) r6
            java.lang.Object r1 = r6.invoke(r1)
            c60 r1 = (p000.c60) r1
            r20 = r1
        L1f5:
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L200
            java.lang.String r1 = (java.lang.String) r1
            r22 = r1
            goto L202
        L200:
            r22 = 0
        L202:
            java.lang.Object r1 = r0.get(r2)
            p000.ln0.m3626(r1, r5)
            if (r1 == 0) goto L212
            java.lang.Object r1 = r12.invoke(r1)
            y32 r1 = (p000.y32) r1
            goto L213
        L212:
            r1 = 0
        L213:
            r1.getClass()
            long r1 = r1.f12442
            java.lang.Object r3 = r0.get(r8)
            n5 r6 = p000.rq1.f9458
            boolean r7 = p000.ln0.m3626(r3, r5)
            if (r7 == 0) goto L227
        L224:
            r25 = 0
            goto L235
        L227:
            if (r3 == 0) goto L224
            java.lang.Object r6 = r6.f7388
            a80 r6 = (p000.a80) r6
            java.lang.Object r3 = r6.invoke(r3)
            r8 r3 = (p000.C0752r8) r3
            r25 = r3
        L235:
            r3 = 9
            java.lang.Object r3 = r0.get(r3)
            n5 r6 = p000.rq1.f9455
            boolean r7 = p000.ln0.m3626(r3, r5)
            if (r7 == 0) goto L246
        L243:
            r26 = 0
            goto L254
        L246:
            if (r3 == 0) goto L243
            java.lang.Object r6 = r6.f7388
            a80 r6 = (p000.a80) r6
            java.lang.Object r3 = r6.invoke(r3)
            g32 r3 = (p000.g32) r3
            r26 = r3
        L254:
            r3 = 10
            java.lang.Object r3 = r0.get(r3)
            av0 r6 = p000.av0.f1319
            n5 r6 = p000.rq1.f9439
            boolean r7 = p000.ln0.m3626(r3, r5)
            if (r7 == 0) goto L267
        L264:
            r27 = 0
            goto L275
        L267:
            if (r3 == 0) goto L264
            java.lang.Object r6 = r6.f7388
            a80 r6 = (p000.a80) r6
            java.lang.Object r3 = r6.invoke(r3)
            av0 r3 = (p000.av0) r3
            r27 = r3
        L275:
            r3 = 11
            java.lang.Object r3 = r0.get(r3)
            p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto L29d
            boolean r6 = r3.equals(r5)
            if (r6 == 0) goto L28e
            long r3 = p000.C0114ci.f2125
            ci r6 = new ci
            r6.<init>(r3)
            goto L29e
        L28e:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r6 = (long) r3
            long r3 = r6 << r4
            ci r6 = new ci
            r6.<init>(r3)
            goto L29e
        L29d:
            r6 = 0
        L29e:
            r6.getClass()
            long r3 = r6.f2127
            r6 = 12
            java.lang.Object r6 = r0.get(r6)
            n5 r7 = p000.rq1.f9454
            boolean r8 = p000.ln0.m3626(r6, r5)
            if (r8 == 0) goto L2b4
        L2b1:
            r30 = 0
            goto L2c2
        L2b4:
            if (r6 == 0) goto L2b1
            java.lang.Object r7 = r7.f7388
            a80 r7 = (p000.a80) r7
            java.lang.Object r6 = r7.invoke(r6)
            c32 r6 = (p000.c32) r6
            r30 = r6
        L2c2:
            r6 = 13
            java.lang.Object r0 = r0.get(r6)
            fv1 r6 = p000.fv1.f4142
            n5 r6 = p000.rq1.f9459
            boolean r5 = p000.ln0.m3626(r0, r5)
            if (r5 == 0) goto L2d5
        L2d2:
            r31 = 0
            goto L2e3
        L2d5:
            if (r0 == 0) goto L2d2
            java.lang.Object r5 = r6.f7388
            a80 r5 = (p000.a80) r5
            java.lang.Object r0 = r5.invoke(r0)
            fv1 r0 = (p000.fv1) r0
            r31 = r0
        L2e3:
            r32 = 49184(0xc020, float:6.8921E-41)
            r21 = 0
            r23 = r1
            r28 = r3
            r16 = r10
            r13.<init>(r14, r16, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r30, r31, r32)
            return r13
        L2f2:
            r1.getClass()
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            r91 r13 = new r91
            java.lang.Object r1 = r0.get(r12)
            qq1 r4 = p000.rq1.f9461
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            p000.ln0.m3626(r1, r5)
            if (r1 == 0) goto L310
            a80 r4 = r4.f9083
            java.lang.Object r1 = r4.invoke(r1)
            z22 r1 = (p000.z22) r1
            goto L311
        L310:
            r1 = 0
        L311:
            r1.getClass()
            int r14 = r1.f12953
            java.lang.Object r1 = r0.get(r11)
            qq1 r4 = p000.rq1.f9462
            p000.ln0.m3626(r1, r5)
            if (r1 == 0) goto L32a
            a80 r4 = r4.f9083
            java.lang.Object r1 = r4.invoke(r1)
            e32 r1 = (p000.e32) r1
            goto L32b
        L32a:
            r1 = 0
        L32b:
            r1.getClass()
            int r15 = r1.f3402
            java.lang.Object r1 = r0.get(r9)
            z32[] r4 = p000.y32.f12440
            qq1 r4 = p000.rq1.f9466
            p000.ln0.m3626(r1, r5)
            if (r1 == 0) goto L346
            a80 r4 = r4.f9083
            java.lang.Object r1 = r4.invoke(r1)
            y32 r1 = (p000.y32) r1
            goto L347
        L346:
            r1 = 0
        L347:
            r1.getClass()
            long r9 = r1.f12442
            java.lang.Object r1 = r0.get(r7)
            h32 r4 = p000.h32.f4565
            n5 r4 = p000.rq1.f9456
            boolean r7 = p000.ln0.m3626(r1, r5)
            if (r7 == 0) goto L35d
        L35a:
            r18 = 0
            goto L36b
        L35d:
            if (r1 == 0) goto L35a
            java.lang.Object r4 = r4.f7388
            a80 r4 = (p000.a80) r4
            java.lang.Object r1 = r4.invoke(r1)
            h32 r1 = (p000.h32) r1
            r18 = r1
        L36b:
            java.lang.Object r1 = r0.get(r6)
            n5 r4 = p000.jx0.f5626
            boolean r6 = p000.ln0.m3626(r1, r5)
            if (r6 == 0) goto L37a
        L377:
            r19 = 0
            goto L388
        L37a:
            if (r1 == 0) goto L377
            java.lang.Object r4 = r4.f7388
            a80 r4 = (p000.a80) r4
            java.lang.Object r1 = r4.invoke(r1)
            kh1 r1 = (p000.kh1) r1
            r19 = r1
        L388:
            r1 = 5
            java.lang.Object r1 = r0.get(r1)
            wr0 r4 = p000.wr0.f11805
            n5 r4 = p000.rq1.f9441
            boolean r6 = p000.ln0.m3626(r1, r5)
            if (r6 == 0) goto L39a
        L397:
            r20 = 0
            goto L3a8
        L39a:
            if (r1 == 0) goto L397
            java.lang.Object r4 = r4.f7388
            a80 r4 = (p000.a80) r4
            java.lang.Object r1 = r4.invoke(r1)
            wr0 r1 = (p000.wr0) r1
            r20 = r1
        L3a8:
            java.lang.Object r1 = r0.get(r3)
            n5 r3 = p000.jx0.f5628
            boolean r4 = p000.ln0.m3626(r1, r5)
            if (r4 == 0) goto L3b6
        L3b4:
            r1 = 0
            goto L3c2
        L3b6:
            if (r1 == 0) goto L3b4
            java.lang.Object r3 = r3.f7388
            a80 r3 = (p000.a80) r3
            java.lang.Object r1 = r3.invoke(r1)
            rr0 r1 = (p000.rr0) r1
        L3c2:
            r1.getClass()
            int r1 = r1.f9470
            java.lang.Object r2 = r0.get(r2)
            qq1 r3 = p000.rq1.f9463
            p000.ln0.m3626(r2, r5)
            if (r2 == 0) goto L3db
            a80 r3 = r3.f9083
            java.lang.Object r2 = r3.invoke(r2)
            rg0 r2 = (p000.rg0) r2
            goto L3dc
        L3db:
            r2 = 0
        L3dc:
            r2.getClass()
            int r2 = r2.f9370
            java.lang.Object r0 = r0.get(r8)
            n5 r3 = p000.jx0.f5629
            boolean r4 = p000.ln0.m3626(r0, r5)
            if (r4 == 0) goto L3f6
        L3ed:
            r21 = r1
            r22 = r2
            r16 = r9
            r23 = 0
            goto L40a
        L3f6:
            if (r0 == 0) goto L3ed
            java.lang.Object r3 = r3.f7388
            a80 r3 = (p000.a80) r3
            java.lang.Object r0 = r3.invoke(r0)
            q32 r0 = (p000.q32) r0
            r23 = r0
            r21 = r1
            r22 = r2
            r16 = r9
        L40a:
            r13.<init>(r14, r15, r16, r18, r19, r20, r21, r22, r23)
            return r13
        L40e:
            a72 r0 = new a72
            if (r1 == 0) goto L416
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            goto L417
        L416:
            r10 = 0
        L417:
            r10.getClass()
            r0.<init>(r10)
            return r0
        L41e:
            q72 r0 = new q72
            if (r1 == 0) goto L426
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            goto L427
        L426:
            r10 = 0
        L427:
            r10.getClass()
            r0.<init>(r10)
            return r0
        L42e:
            r1.getClass()
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            ur0 r1 = new ur0
            r1.<init>(r0)
            return r1
        L43e:
            r1.getClass()
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r0.get(r12)
            if (r1 == 0) goto L44d
            i4 r1 = (p000.EnumC0383i4) r1
            goto L44e
        L44d:
            r1 = 0
        L44e:
            r1.getClass()
            java.lang.Object r2 = r0.get(r9)
            if (r2 == 0) goto L45a
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L45b
        L45a:
            r2 = 0
        L45b:
            r2.getClass()
            int r2 = r2.intValue()
            java.lang.Object r3 = r0.get(r7)
            if (r3 == 0) goto L46b
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L46c
        L46b:
            r3 = 0
        L46c:
            r3.getClass()
            int r3 = r3.intValue()
            java.lang.Object r4 = r0.get(r6)
            if (r4 == 0) goto L47c
            java.lang.String r4 = (java.lang.String) r4
            goto L47d
        L47c:
            r4 = 0
        L47d:
            r4.getClass()
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L568;
                case 1: goto L541;
                case 2: goto L51a;
                case 3: goto L4f4;
                case 4: goto L4ce;
                case 5: goto L4a8;
                case 6: goto L48d;
                default: goto L487;
            }
        L487:
            p000.C1080.m7272()
            r10 = 0
            goto L58f
        L48d:
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L497
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            goto L498
        L497:
            r10 = 0
        L498:
            r10.getClass()
            f4 r0 = new f4
            p02 r1 = new p02
            r1.<init>(r10)
            r0.<init>(r1, r2, r3, r4)
        L4a5:
            r10 = r0
            goto L58f
        L4a8:
            java.lang.Object r0 = r0.get(r11)
            n5 r1 = p000.rq1.f9450
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = p000.ln0.m3626(r0, r5)
            if (r5 == 0) goto L4b8
        L4b6:
            r10 = 0
            goto L4c5
        L4b8:
            if (r0 == 0) goto L4b6
            java.lang.Object r1 = r1.f7388
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r1.invoke(r0)
            r10 = r0
            fs0 r10 = (p000.fs0) r10
        L4c5:
            r10.getClass()
            f4 r0 = new f4
            r0.<init>(r10, r2, r3, r4)
            goto L4a5
        L4ce:
            java.lang.Object r0 = r0.get(r11)
            n5 r1 = p000.rq1.f9449
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = p000.ln0.m3626(r0, r5)
            if (r5 == 0) goto L4de
        L4dc:
            r10 = 0
            goto L4eb
        L4de:
            if (r0 == 0) goto L4dc
            java.lang.Object r1 = r1.f7388
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r1.invoke(r0)
            r10 = r0
            gs0 r10 = (p000.gs0) r10
        L4eb:
            r10.getClass()
            f4 r0 = new f4
            r0.<init>(r10, r2, r3, r4)
            goto L4a5
        L4f4:
            java.lang.Object r0 = r0.get(r11)
            n5 r1 = p000.rq1.f9448
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = p000.ln0.m3626(r0, r5)
            if (r5 == 0) goto L504
        L502:
            r10 = 0
            goto L511
        L504:
            if (r0 == 0) goto L502
            java.lang.Object r1 = r1.f7388
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r1.invoke(r0)
            r10 = r0
            a72 r10 = (p000.a72) r10
        L511:
            r10.getClass()
            f4 r0 = new f4
            r0.<init>(r10, r2, r3, r4)
            goto L4a5
        L51a:
            java.lang.Object r0 = r0.get(r11)
            n5 r1 = p000.rq1.f9447
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = p000.ln0.m3626(r0, r5)
            if (r5 == 0) goto L52a
        L528:
            r10 = 0
            goto L537
        L52a:
            if (r0 == 0) goto L528
            java.lang.Object r1 = r1.f7388
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r1.invoke(r0)
            r10 = r0
            q72 r10 = (p000.q72) r10
        L537:
            r10.getClass()
            f4 r0 = new f4
            r0.<init>(r10, r2, r3, r4)
            goto L4a5
        L541:
            java.lang.Object r0 = r0.get(r11)
            n5 r1 = p000.rq1.f9452
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = p000.ln0.m3626(r0, r5)
            if (r5 == 0) goto L551
        L54f:
            r10 = 0
            goto L55e
        L551:
            if (r0 == 0) goto L54f
            java.lang.Object r1 = r1.f7388
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r1.invoke(r0)
            r10 = r0
            ux1 r10 = (p000.ux1) r10
        L55e:
            r10.getClass()
            f4 r0 = new f4
            r0.<init>(r10, r2, r3, r4)
            goto L4a5
        L568:
            java.lang.Object r0 = r0.get(r11)
            n5 r1 = p000.rq1.f9451
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = p000.ln0.m3626(r0, r5)
            if (r5 == 0) goto L578
        L576:
            r10 = 0
            goto L585
        L578:
            if (r0 == 0) goto L576
            java.lang.Object r1 = r1.f7388
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r1.invoke(r0)
            r10 = r0
            r91 r10 = (p000.r91) r10
        L585:
            r10.getClass()
            f4 r0 = new f4
            r0.<init>(r10, r2, r3, r4)
            goto L4a5
        L58f:
            return r10
        L590:
            r1.getClass()
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            vr0 r1 = new vr0
            r1.<init>(r0)
            return r1
        L5a0:
            r1.getClass()
            r0 = r1
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            p000.tr0.m5735(r0)
            tr0 r1 = new tr0
            r1.<init>(r0)
            return r1
        L5b3:
            r1.getClass()
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            wr0 r1 = new wr0
            java.lang.Object r2 = r0.get(r12)
            float r3 = p000.tr0.f10432
            qq1 r3 = p000.rq1.f9442
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            p000.ln0.m3626(r2, r4)
            if (r2 == 0) goto L5d3
            a80 r3 = r3.f9083
            java.lang.Object r2 = r3.invoke(r2)
            tr0 r2 = (p000.tr0) r2
            goto L5d4
        L5d3:
            r2 = 0
        L5d4:
            r2.getClass()
            float r2 = r2.f10435
            java.lang.Object r3 = r0.get(r11)
            qq1 r5 = p000.rq1.f9443
            p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L5ed
            a80 r5 = r5.f9083
            java.lang.Object r3 = r5.invoke(r3)
            vr0 r3 = (p000.vr0) r3
            goto L5ee
        L5ed:
            r3 = 0
        L5ee:
            r3.getClass()
            int r3 = r3.f11371
            java.lang.Object r0 = r0.get(r9)
            qq1 r5 = p000.rq1.f9444
            p000.ln0.m3626(r0, r4)
            if (r0 == 0) goto L608
            a80 r4 = r5.f9083
            java.lang.Object r0 = r4.invoke(r0)
            r10 = r0
            ur0 r10 = (p000.ur0) r10
            goto L609
        L608:
            r10 = 0
        L609:
            r10.getClass()
            int r0 = r10.f10934
            r1.<init>(r2, r3, r0)
            return r1
        L612:
            r1.getClass()
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r0.get(r12)
            if (r1 == 0) goto L621
            java.lang.String r1 = (java.lang.String) r1
            goto L622
        L621:
            r1 = 0
        L622:
            r1.getClass()
            java.lang.Object r0 = r0.get(r11)
            n5 r2 = p000.rq1.f9453
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r3 = p000.ln0.m3626(r0, r3)
            if (r3 == 0) goto L635
        L633:
            r10 = 0
            goto L642
        L635:
            if (r0 == 0) goto L633
            java.lang.Object r2 = r2.f7388
            a80 r2 = (p000.a80) r2
            java.lang.Object r0 = r2.invoke(r0)
            r10 = r0
            o32 r10 = (p000.o32) r10
        L642:
            fs0 r0 = new fs0
            r0.<init>(r1, r10)
            return r0
        L648:
            zu0 r0 = new zu0
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r2 = java.util.Locale.forLanguageTag(r1)
            java.lang.String r3 = r2.toLanguageTag()
            java.lang.String r4 = "und"
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L677
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "The language tag "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.println(r1)
        L677:
            r0.<init>(r2)
            return r0
        L67b:
            r1.getClass()
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            int r2 = r0.size()
        L68e:
            if (r12 >= r2) goto L6b5
            java.lang.Object r3 = r0.get(r12)
            n5 r4 = p000.rq1.f9440
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = p000.ln0.m3626(r3, r5)
            if (r5 == 0) goto L6a0
        L69e:
            r3 = 0
            goto L6ac
        L6a0:
            if (r3 == 0) goto L69e
            java.lang.Object r4 = r4.f7388
            a80 r4 = (p000.a80) r4
            java.lang.Object r3 = r4.invoke(r3)
            zu0 r3 = (p000.zu0) r3
        L6ac:
            r3.getClass()
            r1.add(r3)
            int r12 = r12 + 1
            goto L68e
        L6b5:
            av0 r0 = new av0
            r0.<init>(r1)
            return r0
        L6bb:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 == 0) goto L6ce
            o41 r0 = new o41
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r0.<init>(r1)
            goto L710
        L6ce:
            r1.getClass()
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r0.get(r12)
            if (r1 == 0) goto L6dd
            java.lang.Float r1 = (java.lang.Float) r1
            goto L6de
        L6dd:
            r1 = 0
        L6de:
            r1.getClass()
            float r1 = r1.floatValue()
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L6ef
            r10 = r0
            java.lang.Float r10 = (java.lang.Float) r10
            goto L6f0
        L6ef:
            r10 = 0
        L6f0:
            r10.getClass()
            float r0 = r10.floatValue()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            long r0 = r1 << r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r5
            long r0 = r0 | r2
            o41 r2 = new o41
            r2.<init>(r0)
            r0 = r2
        L710:
            return r0
        L711:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 == 0) goto L726
            z32 r0 = new z32
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            r0.<init>(r1)
            goto L742
        L726:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 == 0) goto L73b
            z32 r0 = new z32
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            r0.<init>(r1)
            goto L742
        L73b:
            z32 r0 = new z32
            r1 = 0
            r0.<init>(r1)
        L742:
            return r0
        L743:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r2 = p000.ln0.m3626(r1, r0)
            if (r2 == 0) goto L753
            long r0 = p000.y32.f12441
            y32 r2 = new y32
            r2.<init>(r0)
            goto L78d
        L753:
            r1.getClass()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r1.get(r12)
            if (r2 == 0) goto L761
            java.lang.Float r2 = (java.lang.Float) r2
            goto L762
        L761:
            r2 = 0
        L762:
            r2.getClass()
            float r2 = r2.floatValue()
            java.lang.Object r1 = r1.get(r11)
            qq1 r3 = p000.rq1.f9467
            p000.ln0.m3626(r1, r0)
            if (r1 == 0) goto L77e
            a80 r0 = r3.f9083
            java.lang.Object r0 = r0.invoke(r1)
            r10 = r0
            z32 r10 = (p000.z32) r10
            goto L77f
        L77e:
            r10 = 0
        L77f:
            r10.getClass()
            long r0 = r10.f12957
            long r0 = p000.u81.m5814(r0, r2)
            y32 r2 = new y32
            r2.<init>(r0)
        L78d:
            return r2
        L78e:
            r1.getClass()
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            c60 r1 = new c60
            r1.<init>(r0)
            return r1
        L79e:
            r1.getClass()
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            b60 r1 = new b60
            r1.<init>(r0)
            return r1
        L7ae:
            r1.getClass()
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            int r2 = r0.size()
        L7c1:
            if (r12 >= r2) goto L7e8
            java.lang.Object r3 = r0.get(r12)
            n5 r4 = p000.rq1.f9446
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r5 = p000.ln0.m3626(r3, r5)
            if (r5 == 0) goto L7d3
        L7d1:
            r3 = 0
            goto L7df
        L7d3:
            if (r3 == 0) goto L7d1
            java.lang.Object r4 = r4.f7388
            a80 r4 = (p000.a80) r4
            java.lang.Object r3 = r4.invoke(r3)
            f4 r3 = (p000.C0272f4) r3
        L7df:
            r3.getClass()
            r1.add(r3)
            int r12 = r12 + 1
            goto L7c1
        L7e8:
            return r1
    }
}
