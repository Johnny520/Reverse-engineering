package p000;

/* JADX INFO: renamed from: xe */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0981xe extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f12141;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.reflect.Method f12142;

    public /* synthetic */ C0981xe(int r1, java.lang.Object r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.f12141 = r1
            r0.f12142 = r3
            r0.<init>()
            return
    }

    public C0981xe(int r1, java.lang.reflect.Method r2) {
            r0 = this;
            r0.f12141 = r1
            switch(r1) {
                case 3: goto L15;
                case 11: goto Ld;
                default: goto L5;
            }
        L5:
            eh r1 = p000.C0248eh.f3550
            r0.f12142 = r2
            r0.<init>()
            return
        Ld:
            l82 r1 = p000.l82.f6483
            r0.f12142 = r2
            r0.<init>()
            return
        L15:
            eh r1 = p000.C0248eh.f3550
            r0.f12142 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C0981xe(java.lang.reflect.Method r1, int r2, boolean r3) {
            r0 = this;
            r0.f12141 = r2
            r0.f12142 = r1
            r0.<init>()
            return
    }

    @Override // p000.m01
    public void afterHookedMethod(p000.k01 r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r0.f12141
            r4 = 1
            r5 = 0
            switch(r2) {
                case 6: goto L33a;
                case 7: goto Lb;
                case 8: goto L30b;
                case 9: goto L2ea;
                case 10: goto Ld1;
                case 11: goto Lb;
                case 12: goto Lb;
                case 13: goto La6;
                case 14: goto Lf;
                default: goto Lb;
            }
        Lb:
            super.afterHookedMethod(r19)
            return
        Lf:
            java.lang.reflect.Method r0 = r0.f12142
            r1.getClass()
            boolean r2 = p000.m82.m3794()     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L1c
            goto La5
        L1c:
            java.lang.Object r2 = r1.f5694     // Catch: java.lang.Throwable -> L26
            boolean r6 = r2 instanceof java.util.List     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L28
            r3 = r2
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L26
            goto L29
        L26:
            r0 = move-exception
            goto L88
        L28:
            r3 = 0
        L29:
            if (r3 != 0) goto L2d
            goto La5
        L2d:
            boolean r2 = r3.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto La5
            boolean r2 = r3.isEmpty()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L3a
            goto L4d
        L3a:
            java.util.Iterator r2 = r3.iterator()     // Catch: java.lang.Throwable -> L26
        L3e:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L26
            boolean r3 = r3 instanceof java.lang.Float     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L3e
            goto La5
        L4d:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26
            java.util.List r3 = p000.m82.f7015     // Catch: java.lang.Throwable -> L26
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            r1.m3107(r2)     // Catch: java.lang.Throwable -> L26
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.m82.f7018     // Catch: java.lang.Throwable -> L26
            boolean r1 = r1.compareAndSet(r5, r4)     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto La5
            java.lang.Class r1 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "extended speed list via "
            r2.append(r3)     // Catch: java.lang.Throwable -> L26
            r2.append(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "#"
            r2.append(r1)     // Catch: java.lang.Throwable -> L26
            r2.append(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L26
            p000.m82.m3796(r0)     // Catch: java.lang.Throwable -> L26
            goto La5
        L88:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.m82.f7019
            boolean r1 = r1.compareAndSet(r5, r4)
            if (r1 == 0) goto La5
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "speed callback failed: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.m82.m3796(r0)
        La5:
            return
        La6:
            r1.getClass()
            java.lang.reflect.Method r0 = r0.f12142
            java.lang.Class r2 = r0.getReturnType()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto Lb8
            java.lang.Float[] r0 = p000.n82.f7462
            goto Lcd
        Lb8:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Class r0 = r0.getReturnType()
            boolean r0 = r2.isAssignableFrom(r0)
            if (r0 == 0) goto Lcb
            java.lang.Float[] r0 = p000.n82.f7462
            java.util.List r0 = p000.AbstractC0312g7.m2262(r0)
            goto Lcd
        Lcb:
            java.lang.Object r0 = r1.f5694
        Lcd:
            r1.m3107(r0)
            return
        Ld1:
            r1.getClass()
            java.lang.reflect.Method r0 = r0.f12142
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            o22 r2 = p000.o22.f7889
            java.util.Set r2 = p000.o22.m4173()
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto Lec
            goto L2e9
        Lec:
            java.lang.Object r6 = r1.f5694
            boolean r7 = r6 instanceof java.util.List
            if (r7 == 0) goto Lf5
            java.util.List r6 = (java.util.List) r6
            goto Lf6
        Lf5:
            r6 = 0
        Lf6:
            if (r6 != 0) goto Lfa
            goto L2e9
        Lfa:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r6.iterator()
        L103:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L117
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = p000.o22.m4161(r9)
            if (r9 == 0) goto L103
            r7.add(r9)
            goto L103
        L117:
            java.lang.reflect.Executable r8 = r1.f5690
            boolean r9 = r8 instanceof java.lang.reflect.Method
            if (r9 == 0) goto L120
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            goto L121
        L120:
            r8 = 0
        L121:
            boolean r9 = p000.o22.m4182(r6, r7)
            if (r9 != 0) goto L12e
            java.lang.String r0 = "skip"
            p000.o22.m4181(r8, r6, r7, r0)
            goto L2e9
        L12e:
            java.lang.String r9 = "match"
            p000.o22.m4181(r8, r6, r7, r9)
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L15a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r9 = r6.iterator()
        L142:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L15a
            java.lang.Object r10 = r9.next()
            if (r10 == 0) goto L153
            java.lang.String r10 = r10.toString()
            goto L154
        L153:
            r10 = 0
        L154:
            if (r10 == 0) goto L142
            r7.add(r10)
            goto L142
        L15a:
            r11 = r7
            r16 = 0
            r17 = 62
            java.lang.String r12 = ", "
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r7 = p000.AbstractC0984xh.m6644(r11, r12, r13, r14, r15, r16, r17)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r6.iterator()
        L171:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L197
            java.lang.Object r11 = r10.next()
            java.lang.String r12 = p000.o22.m4161(r11)
            java.lang.String r12 = p000.o22.m4184(r12)
            if (r12 == 0) goto L193
            java.lang.String r13 = "homepage_home"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L193
            boolean r12 = r2.contains(r12)
            if (r12 != 0) goto L171
        L193:
            r9.add(r11)
            goto L171
        L197:
            int r10 = r9.size()
            int r6 = r6.size()
            if (r10 == r6) goto L2e9
            r1.m3107(r9)
            java.lang.Object r1 = r1.f5691
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L1af
        L1ac:
            r11 = 0
            goto L293
        L1af:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            if (r1 == 0) goto L1bd
            java.lang.Class r10 = r1.getClass()
            r6.add(r10)
        L1bd:
            if (r0 == 0) goto L1e1
            java.util.List r10 = p000.C0903vb.f11215
            java.lang.Object r10 = p000.C0666ox.f8297
            kx r10 = p000.EnumC0491kx.f6271
            java.util.List r0 = p000.C0666ox.m4321(r10, r0)
            if (r0 != 0) goto L1cd
            jz r0 = p000.C0450jz.f5672
        L1cd:
            java.util.Iterator r0 = r0.iterator()
        L1d1:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L1e1
            java.lang.Object r10 = r0.next()
            java.lang.Class r10 = (java.lang.Class) r10
            r6.add(r10)
            goto L1d1
        L1e1:
            java.util.Iterator r0 = r6.iterator()
        L1e5:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L1ac
            java.lang.Object r6 = r0.next()
            java.lang.Class r6 = (java.lang.Class) r6
            if (r1 == 0) goto L252
            java.lang.Class r10 = r1.getClass()
            boolean r10 = r6.isAssignableFrom(r10)
            if (r10 == 0) goto L1ff
            r10 = r1
            goto L200
        L1ff:
            r10 = 0
        L200:
            if (r10 == 0) goto L252
            java.lang.Class r11 = r10.getClass()
        L206:
            if (r11 == 0) goto L252
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L252
            java.lang.reflect.Field[] r12 = r11.getDeclaredFields()
            r12.getClass()
            int r13 = r12.length
            r14 = r5
        L219:
            if (r14 >= r13) goto L24c
            r15 = r12[r14]
            int r16 = r15.getModifiers()
            boolean r16 = java.lang.reflect.Modifier.isStatic(r16)
            if (r16 != 0) goto L248
            r15.setAccessible(r4)     // Catch: java.lang.Throwable -> L248
            java.lang.Object r5 = r15.get(r10)     // Catch: java.lang.Throwable -> L248
            if (r5 != 0) goto L231
            goto L248
        L231:
            boolean r3 = r5 instanceof java.util.List     // Catch: java.lang.Throwable -> L248
            if (r3 == 0) goto L23b
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L248
            p000.o22.m4186(r15, r10, r5, r2)     // Catch: java.lang.Throwable -> L248
            goto L248
        L23b:
            boolean r3 = r5 instanceof java.util.Map     // Catch: java.lang.Throwable -> L248
            if (r3 == 0) goto L245
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L248
            p000.o22.m4187(r15, r10, r5, r2)     // Catch: java.lang.Throwable -> L248
            goto L248
        L245:
            p000.o22.m4185(r5, r2)     // Catch: java.lang.Throwable -> L248
        L248:
            int r14 = r14 + 1
            r5 = 0
            goto L219
        L24c:
            java.lang.Class r11 = r11.getSuperclass()
            r5 = 0
            goto L206
        L252:
            java.lang.reflect.Field[] r3 = r6.getDeclaredFields()
            r3.getClass()
            int r5 = r3.length
            r6 = 0
        L25b:
            if (r6 >= r5) goto L290
            r10 = r3[r6]
            int r11 = r10.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 == 0) goto L28c
            r10.setAccessible(r4)     // Catch: java.lang.Throwable -> L28c
            r11 = 0
            java.lang.Object r12 = r10.get(r11)     // Catch: java.lang.Throwable -> L28d
            if (r12 != 0) goto L274
            goto L28d
        L274:
            boolean r13 = r12 instanceof java.util.List     // Catch: java.lang.Throwable -> L28d
            if (r13 == 0) goto L27e
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> L28d
            p000.o22.m4186(r10, r11, r12, r2)     // Catch: java.lang.Throwable -> L28d
            goto L28d
        L27e:
            boolean r13 = r12 instanceof java.util.Map     // Catch: java.lang.Throwable -> L28d
            if (r13 == 0) goto L288
            java.util.Map r12 = (java.util.Map) r12     // Catch: java.lang.Throwable -> L28d
            p000.o22.m4187(r10, r11, r12, r2)     // Catch: java.lang.Throwable -> L28d
            goto L28d
        L288:
            p000.o22.m4185(r12, r2)     // Catch: java.lang.Throwable -> L28d
            goto L28d
        L28c:
            r11 = 0
        L28d:
            int r6 = r6 + 1
            goto L25b
        L290:
            r5 = 0
            goto L1e5
        L293:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = p000.o22.f7884
            long r2 = r0 - r2
            r4 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L2a9
            java.lang.String r2 = p000.o22.f7883
            boolean r2 = r7.equals(r2)
            if (r2 != 0) goto L2e9
        L2a9:
            if (r8 == 0) goto L2b6
            java.lang.Class r2 = r8.getDeclaringClass()
            if (r2 == 0) goto L2b6
            java.lang.String r2 = r2.getName()
            goto L2b7
        L2b6:
            r2 = r11
        L2b7:
            if (r8 == 0) goto L2be
            java.lang.String r3 = r8.getName()
            goto L2bf
        L2be:
            r3 = r11
        L2bf:
            r14 = 0
            r15 = 62
            java.lang.String r10 = ", "
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r4 = p000.AbstractC0984xh.m6644(r9, r10, r11, r12, r13, r14, r15)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "r9766bd9254517fa8"
            r5.<init>(r6)
            r5.append(r2)
            r5.append(r3)
            r5.append(r7)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            p000.C0888ux.m5985(r2)
            p000.o22.f7884 = r0
            p000.o22.f7883 = r7
        L2e9:
            return
        L2ea:
            r1.getClass()
            java.lang.ThreadLocal r0 = p000.f01.f3712
            java.lang.Object r1 = r0.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L2fc
            int r1 = r1.intValue()
            goto L2fd
        L2fc:
            r1 = 0
        L2fd:
            int r1 = r1 - r4
            if (r1 >= 0) goto L302
            r5 = 0
            goto L303
        L302:
            r5 = r1
        L303:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.set(r1)
            return
        L30b:
            r1.getClass()
            java.lang.Object r0 = r1.f5691
            if (r0 != 0) goto L313
            goto L339
        L313:
            java.util.Set r1 = p000.f01.f3716
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L31c
            goto L339
        L31c:
            java.lang.ThreadLocal r0 = p000.f01.f3713
            java.lang.Object r1 = r0.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L32b
            int r1 = r1.intValue()
            goto L32c
        L32b:
            r1 = 0
        L32c:
            int r1 = r1 - r4
            if (r1 >= 0) goto L331
            r5 = 0
            goto L332
        L331:
            r5 = r1
        L332:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.set(r1)
        L339:
            return
        L33a:
            r11 = 0
            java.lang.String r2 = "bind:"
            r1.getClass()
            java.lang.Object[] r3 = r1.f5692
            java.lang.reflect.Method r0 = r0.f12142
            if (r3 == 0) goto L394
            r5 = 0
            java.lang.Object r5 = p000.AbstractC0312g7.m2253(r5, r3)     // Catch: java.lang.Throwable -> L380
            if (r5 != 0) goto L34e
            goto L394
        L34e:
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r4, r3)     // Catch: java.lang.Throwable -> L380
            boolean r4 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L380
            if (r4 == 0) goto L359
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L380
            goto L35a
        L359:
            r3 = r11
        L35a:
            if (r3 == 0) goto L365
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L380
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L380
            goto L366
        L365:
            r3 = r11
        L366:
            android.os.Handler r4 = p000.ah0.f229     // Catch: java.lang.Throwable -> L380
            java.lang.Object r1 = r1.f5691     // Catch: java.lang.Throwable -> L380
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L380
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L380
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L380
            r4.append(r0)     // Catch: java.lang.Throwable -> L380
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L380
            p000.ah0.m117(r1, r5, r3, r0)     // Catch: java.lang.Throwable -> L380
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L380
            goto L387
        L380:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L387:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L394
            android.os.Handler r1 = p000.ah0.f229
            java.lang.String r1 = "adapter-bind"
            p000.ah0.m138(r1, r0)
        L394:
            return
    }

    @Override // p000.m01
    public void beforeHookedMethod(p000.k01 r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r0.f12141
            r3 = 7
            r4 = 4
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            switch(r2) {
                case 0: goto L503;
                case 1: goto L46e;
                case 2: goto L430;
                case 3: goto L3f8;
                case 4: goto L39c;
                case 5: goto L374;
                case 6: goto L12;
                case 7: goto L310;
                case 8: goto L24d;
                case 9: goto L154;
                case 10: goto L12;
                case 11: goto L6a;
                case 12: goto L16;
                default: goto L12;
            }
        L12:
            super.beforeHookedMethod(r20)
            return
        L16:
            r1.getClass()
            java.lang.Object[] r2 = r1.f5692
            r2.getClass()
            java.lang.Object r2 = p000.AbstractC0312g7.m2250(r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L29
            r10 = r2
            java.lang.Number r10 = (java.lang.Number) r10
        L29:
            if (r10 == 0) goto L69
            float r2 = r10.floatValue()
            java.lang.Object r3 = r1.f5691
            if (r3 != 0) goto L34
            goto L69
        L34:
            java.lang.reflect.Method r0 = r0.f12142
            p000.l82.m3535(r0, r3)
            java.lang.ThreadLocal r0 = p000.l82.f6485
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 != 0) goto L69
            long r3 = p000.l82.f6491
            java.util.concurrent.atomic.AtomicLong r0 = p000.l82.f6489
            long r6 = r0.get()
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 == 0) goto L69
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto L69
            java.lang.Float r0 = p000.l82.m3537()
            if (r0 == 0) goto L69
            float r0 = r0.floatValue()
            java.lang.Object[] r1 = r1.f5692
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1[r9] = r0
        L69:
            return
        L6a:
            r1.getClass()
            java.lang.Object r2 = r1.f5691
            if (r2 != 0) goto L73
            goto L153
        L73:
            java.lang.reflect.Executable r3 = r1.f5690
            boolean r4 = r3 instanceof java.lang.reflect.Method
            if (r4 == 0) goto L7c
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            goto L7d
        L7c:
            r3 = r10
        L7d:
            if (r3 != 0) goto L81
            java.lang.reflect.Method r3 = r0.f12142
        L81:
            java.lang.Object[] r0 = r1.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2250(r0)
            boolean r4 = r0 instanceof java.lang.Number
            if (r4 == 0) goto L91
            java.lang.Number r0 = (java.lang.Number) r0
            goto L92
        L91:
            r0 = r10
        L92:
            if (r0 == 0) goto L9d
            float r0 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L9e
        L9d:
            r0 = r10
        L9e:
            if (r0 == 0) goto L14e
            java.lang.ThreadLocal r4 = p000.l82.f6485
            java.lang.Object r4 = r4.get()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 != 0) goto Le1
            long r6 = p000.l82.f6491
            java.util.concurrent.atomic.AtomicLong r4 = p000.l82.f6489
            long r11 = r4.get()
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 == 0) goto Le1
            float r4 = r0.floatValue()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto Le1
            l82 r4 = p000.l82.f6483
            java.lang.Float r4 = p000.l82.m3537()
            if (r4 == 0) goto Le1
            float r6 = r4.floatValue()
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto Ld3
            r10 = r4
        Ld3:
            if (r10 == 0) goto Le1
            float r4 = r10.floatValue()
            java.lang.Object[] r5 = r1.f5692
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5[r9] = r4
        Le1:
            ym1 r4 = p000.gf0.f4353
            float r4 = r0.floatValue()
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            r5.getClass()
            ss1 r5 = p000.AbstractC0312g7.m2232(r5)
            k82 r6 = p000.k82.f5809
            int r7 = p000.gf0.m2300()
            r10 = 1073741824(0x40000000, float:2.0)
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 != 0) goto L13d
            java.util.Iterator r5 = r5.iterator()
        L106:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L13d
            java.lang.Object r10 = r5.next()
            java.lang.Object r10 = r6.invoke(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.util.List r11 = p000.gf0.f4354
            if (r11 == 0) goto L121
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L121
            goto L106
        L121:
            java.util.Iterator r11 = r11.iterator()
        L125:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L106
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = p000.x02.m6485(r10, r12, r9)
            if (r12 == 0) goto L125
            r4 = 5
            int r4 = p000.j81.m2906(r7, r8, r4)
            float r4 = (float) r4
        L13d:
            float r0 = r0.floatValue()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L146
            goto L14e
        L146:
            java.lang.Object[] r0 = r1.f5692
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            r0[r9] = r1
        L14e:
            l82 r0 = p000.l82.f6483
            p000.l82.m3535(r3, r2)
        L153:
            return
        L154:
            java.lang.String r2 = "rd1fe9f51c470bd02"
            java.lang.String r3 = "legacy status filtered source="
            r1.getClass()
            java.lang.Object[] r4 = r1.f5692
            java.lang.Object r1 = r1.f5691
            if (r1 != 0) goto L163
            goto L24c
        L163:
            java.lang.ThreadLocal r5 = p000.f01.f3712
            java.lang.Object r11 = r5.get()
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L172
            int r11 = r11.intValue()
            goto L173
        L172:
            r11 = r9
        L173:
            int r12 = r11 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r5.set(r12)
            java.lang.reflect.Method r14 = r0.f12142
            r4.getClass()     // Catch: java.lang.Throwable -> L18c
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r9, r4)     // Catch: java.lang.Throwable -> L18c
            boolean r5 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L18c
            if (r5 == 0) goto L18f
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L18c
            goto L190
        L18c:
            r0 = move-exception
            goto L237
        L18f:
            r0 = r10
        L190:
            if (r0 != 0) goto L194
            goto L24c
        L194:
            if (r11 != 0) goto L1ee
            java.util.Map r5 = p000.f01.f3714     // Catch: java.lang.Throwable -> L18c
            r5.getClass()     // Catch: java.lang.Throwable -> L18c
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18c
            int r11 = r0.size()     // Catch: java.lang.Throwable -> L18c
            r15.<init>(r11)     // Catch: java.lang.Throwable -> L18c
            r15.addAll(r0)     // Catch: java.lang.Throwable -> L18c
            java.lang.Object r8 = p000.AbstractC0312g7.m2253(r8, r4)     // Catch: java.lang.Throwable -> L18c
            boolean r11 = r8 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L18c
            if (r11 == 0) goto L1b2
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L18c
            goto L1b3
        L1b2:
            r8 = r10
        L1b3:
            if (r8 == 0) goto L1bc
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L18c
            r16 = r8
            goto L1be
        L1bc:
            r16 = r9
        L1be:
            java.lang.Object r7 = p000.AbstractC0312g7.m2253(r7, r4)     // Catch: java.lang.Throwable -> L18c
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18c
            if (r8 == 0) goto L1c9
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L18c
            goto L1ca
        L1c9:
            r7 = r10
        L1ca:
            if (r7 == 0) goto L1d3
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L18c
            r17 = r7
            goto L1d5
        L1d3:
            r17 = r9
        L1d5:
            java.lang.Object r6 = p000.AbstractC0312g7.m2253(r6, r4)     // Catch: java.lang.Throwable -> L18c
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L18c
            if (r7 == 0) goto L1e0
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L18c
        L1e0:
            if (r10 != 0) goto L1e4
            java.lang.String r10 = ""
        L1e4:
            r18 = r10
            d01 r13 = new d01     // Catch: java.lang.Throwable -> L18c
            r13.<init>(r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L18c
            r5.put(r1, r13)     // Catch: java.lang.Throwable -> L18c
        L1ee:
            be0 r1 = p000.be0.f1670     // Catch: java.lang.Throwable -> L18c
            boolean r1 = r1.m939()     // Catch: java.lang.Throwable -> L18c
            if (r1 != 0) goto L1f7
            goto L24c
        L1f7:
            java.util.ArrayList r1 = p000.vd0.m6179(r0)     // Catch: java.lang.Throwable -> L18c
            if (r1 != 0) goto L1fe
            goto L24c
        L1fe:
            int r5 = r1.size()     // Catch: java.lang.Throwable -> L18c
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L18c
            if (r5 < r6) goto L209
            goto L24c
        L209:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L18c
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L18c
            r4[r9] = r5     // Catch: java.lang.Throwable -> L18c
            int r4 = r0.size()     // Catch: java.lang.Throwable -> L18c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L18c
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L18c
            int r0 = r0 - r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L18c
            r1.append(r4)     // Catch: java.lang.Throwable -> L18c
            java.lang.String r3 = " removed="
            r1.append(r3)     // Catch: java.lang.Throwable -> L18c
            r1.append(r0)     // Catch: java.lang.Throwable -> L18c
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L18c
            p000.C0888ux.m5975(r2, r0)     // Catch: java.lang.Throwable -> L18c
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L18c
            goto L23d
        L237:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L23d:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L24c
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "legacy status callback failed: "
            p000.AbstractC0602nx.m4143(r1, r0, r2)
        L24c:
            return
        L24d:
            java.lang.String r2 = "rd1fe9f51c470bd02"
            java.lang.String r3 = "refactor status filtered source="
            r1.getClass()
            java.lang.Object[] r4 = r1.f5692
            java.lang.Object r1 = r1.f5691
            if (r1 != 0) goto L25c
            goto L30f
        L25c:
            java.util.Set r5 = p000.f01.f3716
            boolean r5 = r5.contains(r1)
            if (r5 != 0) goto L266
            goto L30f
        L266:
            java.lang.ThreadLocal r5 = p000.f01.f3713
            java.lang.Object r6 = r5.get()
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L275
            int r6 = r6.intValue()
            goto L276
        L275:
            r6 = r9
        L276:
            int r7 = r6 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.set(r7)
            java.lang.reflect.Method r0 = r0.f12142
            r4.getClass()     // Catch: java.lang.Throwable -> L290
            java.lang.Object r5 = p000.AbstractC0312g7.m2253(r9, r4)     // Catch: java.lang.Throwable -> L290
            boolean r7 = r5 instanceof java.util.List     // Catch: java.lang.Throwable -> L290
            if (r7 == 0) goto L292
            r10 = r5
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L290
            goto L292
        L290:
            r0 = move-exception
            goto L2fa
        L292:
            if (r10 != 0) goto L296
            goto L30f
        L296:
            if (r6 != 0) goto L2b1
            java.util.Map r5 = p000.f01.f3715     // Catch: java.lang.Throwable -> L290
            r5.getClass()     // Catch: java.lang.Throwable -> L290
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L290
            int r7 = r10.size()     // Catch: java.lang.Throwable -> L290
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L290
            r6.addAll(r10)     // Catch: java.lang.Throwable -> L290
            c01 r7 = new c01     // Catch: java.lang.Throwable -> L290
            r7.<init>(r0, r6)     // Catch: java.lang.Throwable -> L290
            r5.put(r1, r7)     // Catch: java.lang.Throwable -> L290
        L2b1:
            be0 r0 = p000.be0.f1670     // Catch: java.lang.Throwable -> L290
            boolean r0 = r0.m939()     // Catch: java.lang.Throwable -> L290
            if (r0 != 0) goto L2ba
            goto L30f
        L2ba:
            java.util.ArrayList r0 = p000.vd0.m6179(r10)     // Catch: java.lang.Throwable -> L290
            if (r0 != 0) goto L2c1
            goto L30f
        L2c1:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L290
            int r5 = r10.size()     // Catch: java.lang.Throwable -> L290
            if (r1 < r5) goto L2cc
            goto L30f
        L2cc:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L290
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L290
            r4[r9] = r1     // Catch: java.lang.Throwable -> L290
            int r1 = r10.size()     // Catch: java.lang.Throwable -> L290
            int r4 = r10.size()     // Catch: java.lang.Throwable -> L290
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L290
            int r4 = r4 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L290
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L290
            r0.append(r1)     // Catch: java.lang.Throwable -> L290
            java.lang.String r1 = " removed="
            r0.append(r1)     // Catch: java.lang.Throwable -> L290
            r0.append(r4)     // Catch: java.lang.Throwable -> L290
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L290
            p000.C0888ux.m5975(r2, r0)     // Catch: java.lang.Throwable -> L290
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L290
            goto L300
        L2fa:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L300:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L30f
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "refactor status callback failed: "
            p000.AbstractC0602nx.m4143(r1, r0, r2)
        L30f:
            return
        L310:
            r1.getClass()
            java.lang.Object[] r1 = r1.f5692
            be0 r2 = p000.be0.f1670
            boolean r2 = r2.m939()
            if (r2 != 0) goto L31e
            goto L373
        L31e:
            java.lang.reflect.Method r0 = r0.f12142
            java.lang.Class[] r0 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L35b
            r0.getClass()     // Catch: java.lang.Throwable -> L35b
            int r2 = r0.length     // Catch: java.lang.Throwable -> L35b
        L328:
            if (r9 >= r2) goto L338
            r3 = r0[r9]     // Catch: java.lang.Throwable -> L35b
            java.lang.Class<java.util.List> r4 = java.util.List.class
            boolean r3 = r4.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> L35b
            if (r3 == 0) goto L335
            goto L339
        L335:
            int r9 = r9 + 1
            goto L328
        L338:
            r9 = -1
        L339:
            if (r9 >= 0) goto L33c
            goto L373
        L33c:
            r1.getClass()     // Catch: java.lang.Throwable -> L35b
            java.lang.Object r0 = p000.AbstractC0312g7.m2253(r9, r1)     // Catch: java.lang.Throwable -> L35b
            boolean r2 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L35b
            if (r2 == 0) goto L34a
            r10 = r0
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L35b
        L34a:
            if (r10 != 0) goto L34d
            goto L373
        L34d:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L35b
            java.util.ArrayList r2 = p000.vd0.m6175(r10)     // Catch: java.lang.Throwable -> L35b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L35b
            r1[r9] = r0     // Catch: java.lang.Throwable -> L35b
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L35b
            goto L362
        L35b:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L362:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L373
            java.lang.String r1 = "r1e0d2867edbb56e0"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "search publish callback failed: "
            p000.AbstractC0602nx.m4143(r2, r0, r1)
        L373:
            return
        L374:
            r1.getClass()
            boolean r2 = p000.kn0.f6047
            if (r2 == 0) goto L37f
            int r2 = p000.kn0.f6048
            if (r2 > 0) goto L39b
        L37f:
            r1.m3107(r10)
            java.util.Set r1 = p000.q20.f8803
            java.lang.reflect.Method r0 = r0.f12142
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "skip FamiliarFeedPreloadManager."
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.q20.m4726(r0)
        L39b:
            return
        L39c:
            java.lang.reflect.Method r2 = r0.f12142
            r1.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0261eu.f3669
            java.lang.String r0 = "block_douyin_duration_reminder_enabled"
            boolean r0 = p000.ui1.m5887(r0, r9)     // Catch: java.lang.Throwable -> L3ae
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3ae
            goto L3b5
        L3ae:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L3b5:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L3bc
            r0 = r3
        L3bc:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c5
            goto L3f7
        L3c5:
            r1.m3107(r10)
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0261eu.f3671
            boolean r0 = r0.compareAndSet(r9, r8)
            if (r0 == 0) goto L3f7
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0261eu.f3669
            java.lang.Class r0 = r2.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r2.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "blocked Douyin duration reminder feed trigger: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "#"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            p000.C0261eu.m1960(r0)
        L3f7:
            return
        L3f8:
            r1.getClass()
            java.lang.Object r2 = r1.f5691
            if (r2 != 0) goto L400
            goto L42f
        L400:
            eh r3 = p000.C0248eh.f3550
            boolean r3 = p000.C0248eh.m1922()
            if (r3 != 0) goto L415
            java.util.Map r1 = p000.C0248eh.f3554
            monitor-enter(r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L412
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L412
            monitor-exit(r1)
            goto L42f
        L412:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L415:
            java.lang.reflect.Method r0 = r0.f12142
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "resume "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p000.C0248eh.m1924(r2, r0)
            r1.m3107(r10)
        L42f:
            return
        L430:
            r1.getClass()
            java.lang.Object r2 = r1.f5691
            if (r2 != 0) goto L438
            goto L46d
        L438:
            eh r3 = p000.C0248eh.f3550
            boolean r3 = p000.C0248eh.m1922()
            if (r3 != 0) goto L44d
            java.util.Map r1 = p000.C0248eh.f3554
            monitor-enter(r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L44a
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L44a
            monitor-exit(r1)
            goto L46d
        L44a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L44d:
            java.lang.reflect.Method r0 = r0.f12142
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "bitmap start "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p000.C0248eh.m1924(r2, r0)
            r0 = -12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.m3107(r0)
        L46d:
            return
        L46e:
            java.lang.reflect.Method r0 = r0.f12142
            java.lang.String r2 = "enabled host chapter ad skip via "
            r1.getClass()
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L4e4
            df r5 = p000.C0016af.f211     // Catch: java.lang.Throwable -> L4e4
            o7 r12 = new o7     // Catch: java.lang.Throwable -> L4e4
            r13 = 17
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L4e4
            boolean r12 = r5.m1734(r10, r12)     // Catch: java.lang.Throwable -> L4e4
            if (r12 != 0) goto L48a
            goto L502
        L48a:
            java.lang.Object[] r1 = r1.f5692     // Catch: java.lang.Throwable -> L4e4
            if (r1 != 0) goto L490
            goto L502
        L490:
            int r12 = r1.length     // Catch: java.lang.Throwable -> L4e4
            if (r12 == r3) goto L494
            goto L502
        L494:
            r3 = r1[r7]     // Catch: java.lang.Throwable -> L4e4
            boolean r3 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L4e4
            if (r3 == 0) goto L502
            r3 = r1[r6]     // Catch: java.lang.Throwable -> L4e4
            boolean r3 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L4e4
            if (r3 == 0) goto L502
            r3 = r1[r4]     // Catch: java.lang.Throwable -> L4e4
            boolean r3 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L4e4
            if (r3 != 0) goto L4a7
            goto L502
        L4a7:
            boolean r3 = r5.m1735(r10)     // Catch: java.lang.Throwable -> L4e4
            if (r3 != 0) goto L4ae
            goto L502
        L4ae:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4e4
            r1[r7] = r3     // Catch: java.lang.Throwable -> L4e4
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4e4
            r1[r6] = r3     // Catch: java.lang.Throwable -> L4e4
            r1[r4] = r3     // Catch: java.lang.Throwable -> L4e4
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0016af.f209     // Catch: java.lang.Throwable -> L4e4
            boolean r1 = r1.compareAndSet(r9, r8)     // Catch: java.lang.Throwable -> L4e4
            if (r1 == 0) goto L502
            java.lang.Class r1 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L4e4
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L4e4
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L4e4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e4
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4e4
            r3.append(r1)     // Catch: java.lang.Throwable -> L4e4
            java.lang.String r1 = "#"
            r3.append(r1)     // Catch: java.lang.Throwable -> L4e4
            r3.append(r0)     // Catch: java.lang.Throwable -> L4e4
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4e4
            p000.C0016af.m101(r0)     // Catch: java.lang.Throwable -> L4e4
            goto L502
        L4e4:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0016af.f210
            boolean r1 = r1.compareAndSet(r9, r8)
            if (r1 == 0) goto L502
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "chapter callback failed: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0016af.m101(r0)
        L502:
            return
        L503:
            java.lang.reflect.Method r0 = r0.f12142
            java.lang.String r2 = "enabled host chapter ad skip via "
            r1.getClass()
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L579
            df r5 = p000.C0075bf.f1689     // Catch: java.lang.Throwable -> L579
            o7 r12 = new o7     // Catch: java.lang.Throwable -> L579
            r13 = 16
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L579
            boolean r12 = r5.m1734(r10, r12)     // Catch: java.lang.Throwable -> L579
            if (r12 != 0) goto L51f
            goto L597
        L51f:
            java.lang.Object[] r1 = r1.f5692     // Catch: java.lang.Throwable -> L579
            if (r1 != 0) goto L525
            goto L597
        L525:
            int r12 = r1.length     // Catch: java.lang.Throwable -> L579
            if (r12 == r3) goto L529
            goto L597
        L529:
            r3 = r1[r7]     // Catch: java.lang.Throwable -> L579
            boolean r3 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L579
            if (r3 == 0) goto L597
            r3 = r1[r6]     // Catch: java.lang.Throwable -> L579
            boolean r3 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L579
            if (r3 == 0) goto L597
            r3 = r1[r4]     // Catch: java.lang.Throwable -> L579
            boolean r3 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L579
            if (r3 != 0) goto L53c
            goto L597
        L53c:
            boolean r3 = r5.m1735(r10)     // Catch: java.lang.Throwable -> L579
            if (r3 != 0) goto L543
            goto L597
        L543:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L579
            r1[r7] = r3     // Catch: java.lang.Throwable -> L579
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L579
            r1[r6] = r3     // Catch: java.lang.Throwable -> L579
            r1[r4] = r3     // Catch: java.lang.Throwable -> L579
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0075bf.f1687     // Catch: java.lang.Throwable -> L579
            boolean r1 = r1.compareAndSet(r9, r8)     // Catch: java.lang.Throwable -> L579
            if (r1 == 0) goto L597
            java.lang.Class r1 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L579
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L579
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L579
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L579
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L579
            r3.append(r1)     // Catch: java.lang.Throwable -> L579
            java.lang.String r1 = "#"
            r3.append(r1)     // Catch: java.lang.Throwable -> L579
            r3.append(r0)     // Catch: java.lang.Throwable -> L579
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L579
            p000.C0075bf.m950(r0)     // Catch: java.lang.Throwable -> L579
            goto L597
        L579:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0075bf.f1688
            boolean r1 = r1.compareAndSet(r9, r8)
            if (r1 == 0) goto L597
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "legacy chapter callback failed: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0075bf.m950(r0)
        L597:
            return
    }
}
