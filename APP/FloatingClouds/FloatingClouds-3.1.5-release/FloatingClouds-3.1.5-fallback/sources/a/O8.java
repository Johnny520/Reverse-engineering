package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O8 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200a;

    public /* synthetic */ O8(int r1) {
            r0 = this;
            r0.f200a = r1
            r0.<init>()
            return
    }

    public /* synthetic */ O8(top.mmjz.floatingclouds.plugin.IPlugin r1, int r2) {
            r0 = this;
            r0.f200a = r2
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r37) {
            r36 = this;
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class r3 = java.lang.Void.TYPE
            java.lang.Class r4 = java.lang.Boolean.TYPE
            java.lang.String r5 = "a"
            java.lang.String r6 = "getDeclaredMethods(...)"
            java.lang.String r7 = "cls"
            java.lang.String r8 = "com.tencent.mm.booter.notification.m0"
            a.cd r9 = a.EnumC0089cd.f426a
            java.lang.String r11 = "fh5.w0"
            java.lang.String r12 = "m"
            a.cd r13 = a.EnumC0089cd.c
            java.lang.String r14 = "null"
            java.lang.String r15 = "RuleSystem"
            r16 = 2
            java.lang.String r1 = "getArgs(...)"
            java.lang.String r0 = "ctx"
            r18 = 0
            java.lang.String r10 = "chain"
            r19 = r14
            r14 = r36
            r21 = r1
            int r1 = r14.f200a
            switch(r1) {
                case 0: goto L9ef;
                case 1: goto L9c5;
                case 2: goto L97c;
                case 3: goto L970;
                case 4: goto L964;
                case 5: goto L958;
                case 6: goto L94c;
                case 7: goto L886;
                case 8: goto L84e;
                case 9: goto L842;
                case 10: goto L836;
                case 11: goto L82a;
                case 12: goto L81e;
                case 13: goto L7fb;
                case 14: goto L7f1;
                case 15: goto L79e;
                case 16: goto L736;
                case 17: goto L6e9;
                case 18: goto L611;
                case 19: goto L5c1;
                case 20: goto L557;
                case 21: goto L51a;
                case 22: goto L4b5;
                case 23: goto L4a5;
                case 24: goto L497;
                case 25: goto L3e6;
                case 26: goto L326;
                case 27: goto L318;
                case 28: goto L3f;
                default: goto L2f;
            }
        L2f:
            r1 = r37
            a.fd r1 = (a.C0143fd) r1
            a.C0193i9.e(r1, r0)
            java.lang.String r0 = "xc4.k"
            java.lang.ClassLoader r1 = r1.b
            java.lang.Class r0 = a.A1.b(r1, r0)
            return r0
        L3f:
            r1 = r37
            a.fd r1 = (a.C0143fd) r1
            a.C0193i9.e(r1, r0)
            a.Cd r0 = a.Cd.f49a
            r0.getClass()
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.ClassLoader r1 = r1.b
            java.lang.Class r23 = a.Cd.g(r1, r11)
            java.lang.String r0 = "fh5.w"
            java.lang.Class r24 = a.Cd.g(r1, r0)
            java.lang.String r0 = "fh5.a"
            java.lang.Class r25 = a.Cd.g(r1, r0)
            a.a5$d r0 = a.C0043a5.b()
            java.lang.String r4 = "adapterNames"
            java.lang.String r5 = "snapshotClass"
            java.lang.String r6 = "dataSourceClass"
            java.lang.String r7 = "ms"
            java.lang.String r8 = " time="
            java.lang.String r10 = " snapshot="
            java.lang.String r11 = " datasource="
            java.lang.String r12 = ""
            r20 = r1
            if (r0 == 0) goto L159
            java.lang.Object r1 = r0.f388a
            boolean r16 = r1.isEmpty()
            if (r16 != 0) goto L159
            java.lang.Object r0 = r0.b
            r22 = r0
            r21 = r1
            a.Hf r0 = a.Cd.j(r20, r21, r22, r23, r24, r25)
            long r16 = java.lang.System.currentTimeMillis()
            r26 = r2
            long r1 = r16 - r26
            java.io.Serializable r3 = r0.f116a
            r16 = r3
            java.lang.Class r16 = (java.lang.Class) r16
            if (r16 == 0) goto La8
            java.lang.String r16 = r16.getName()
            r37 = r16
            r16 = r3
            r3 = r37
        La5:
            r37 = r12
            goto Lad
        La8:
            r16 = r3
            r3 = r19
            goto La5
        Lad:
            java.io.Serializable r12 = r0.b
            r17 = r12
            java.lang.Class r17 = (java.lang.Class) r17
            if (r17 == 0) goto Lc0
            java.lang.String r18 = r17.getName()
            r35 = r18
            r18 = r12
            r12 = r35
            goto Lc4
        Lc0:
            r18 = r12
            r12 = r19
        Lc4:
            java.io.Serializable r0 = r0.c
            r28 = r0
            java.lang.Class r28 = (java.lang.Class) r28
            if (r28 == 0) goto Ld7
            java.lang.String r28 = r28.getName()
            r35 = r28
            r28 = r0
            r0 = r35
            goto Ldb
        Ld7:
            r28 = r0
            r0 = r19
        Ldb:
            java.lang.String r14 = "CONV_LIST_RESOLVER_REPORT feature=conv_list_classes path=DEXKIT_RULE fallback=false adapter="
            java.lang.StringBuilder r3 = a.C0487z.i(r14, r3, r11, r12, r10)
            r3.append(r0)
            r3.append(r8)
            r3.append(r1)
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r0}
            a.C0453x1.b(r0)
            if (r16 == 0) goto L15d
            r3 = r16
            java.lang.Class r3 = (java.lang.Class) r3
            if (r18 != 0) goto L103
            r12 = r37
            goto L105
        L103:
            r12 = r18
        L105:
            a.mc r0 = new a.mc
            r0.<init>(r6, r12)
            if (r28 != 0) goto L10f
            r12 = r37
            goto L111
        L10f:
            r12 = r28
        L111:
            a.mc r1 = new a.mc
            r1.<init>(r5, r12)
            r2 = r21
            java.util.List r2 = (java.util.List) r2
            r5 = r22
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r2 = a.C0383t3.q0(r2, r5)
            java.lang.String r5 = r3.getName()
            if (r17 == 0) goto L12d
            java.lang.String r6 = r17.getName()
            goto L12e
        L12d:
            r6 = 0
        L12e:
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.util.ArrayList r5 = a.N1.c0(r5)
            java.util.ArrayList r2 = a.C0383t3.q0(r2, r5)
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>(r2)
            java.util.List r2 = a.C0383t3.w0(r5)
            a.mc r5 = new a.mc
            r5.<init>(r4, r2)
            a.mc[] r0 = new a.C0267mc[]{r0, r1, r5}
            java.util.Map r0 = a.C0067ba.E(r0)
            r1 = 0
            r2 = 12
            a.gd r0 = a.C0161gd.a.a(r3, r9, r1, r0, r2)
            goto L317
        L159:
            r26 = r2
            r37 = r12
        L15d:
            java.lang.String r0 = "conv_adapter_structural_v1"
            org.json.JSONObject r0 = a.C0043a5.d(r0)
            if (r0 != 0) goto L167
        L165:
            r0 = 0
            goto L18e
        L167:
            a.a5$d r28 = new a.a5$d     // Catch: java.lang.Throwable -> L183
            java.lang.String r1 = "adapterClassNames"
            java.util.List r29 = a.C0043a5.g(r1, r0)     // Catch: java.lang.Throwable -> L183
            java.lang.String r1 = "dataSourceClassNames"
            java.util.List r30 = a.C0043a5.g(r1, r0)     // Catch: java.lang.Throwable -> L183
            a.Y5 r31 = a.Y5.f351a     // Catch: java.lang.Throwable -> L183
            r32 = r31
            r33 = r31
            r34 = r31
            r28.<init>(r29, r30, r31, r32, r33, r34)     // Catch: java.lang.Throwable -> L183
            r0 = r28
            goto L18e
        L183:
            r0 = move-exception
            java.lang.String r1 = "DexKitCache: parse ConvAdapterStructural failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.e(r0)
            goto L165
        L18e:
            if (r0 == 0) goto L267
            java.lang.Object r1 = r0.f388a
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L267
            java.lang.Object r0 = r0.b
            r22 = r0
            r21 = r1
            a.Hf r0 = a.Cd.j(r20, r21, r22, r23, r24, r25)
            r1 = r23
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r26
            java.io.Serializable r9 = r0.f116a
            r12 = r9
            java.lang.Class r12 = (java.lang.Class) r12
            if (r12 == 0) goto L1b6
            java.lang.String r12 = r12.getName()
            goto L1b8
        L1b6:
            r12 = r19
        L1b8:
            java.io.Serializable r14 = r0.b
            r16 = r14
            java.lang.Class r16 = (java.lang.Class) r16
            if (r16 == 0) goto L1cb
            java.lang.String r17 = r16.getName()
            r35 = r17
            r17 = r9
            r9 = r35
            goto L1cf
        L1cb:
            r17 = r9
            r9 = r19
        L1cf:
            java.io.Serializable r0 = r0.c
            r18 = r0
            java.lang.Class r18 = (java.lang.Class) r18
            if (r18 == 0) goto L1e4
            java.lang.String r18 = r18.getName()
            r20 = r18
            r18 = r0
            r0 = r20
        L1e1:
            r20 = r14
            goto L1e9
        L1e4:
            r18 = r0
            r0 = r19
            goto L1e1
        L1e9:
            java.lang.String r14 = "CONV_LIST_RESOLVER_REPORT feature=conv_list_classes path=DEXKIT_STRUCTURAL fallback=false adapter="
            java.lang.StringBuilder r9 = a.C0487z.i(r14, r12, r11, r9, r10)
            r9.append(r0)
            r9.append(r8)
            r9.append(r2)
            r9.append(r7)
            java.lang.String r0 = r9.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r0}
            a.C0453x1.b(r0)
            if (r17 == 0) goto L269
            r9 = r17
            java.lang.Class r9 = (java.lang.Class) r9
            if (r20 != 0) goto L211
            r14 = r37
            goto L213
        L211:
            r14 = r20
        L213:
            a.mc r0 = new a.mc
            r0.<init>(r6, r14)
            if (r18 != 0) goto L21d
            r12 = r37
            goto L21f
        L21d:
            r12 = r18
        L21f:
            a.mc r1 = new a.mc
            r1.<init>(r5, r12)
            r2 = r21
            java.util.List r2 = (java.util.List) r2
            r3 = r22
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r2 = a.C0383t3.q0(r2, r3)
            java.lang.String r3 = r9.getName()
            if (r16 == 0) goto L23b
            java.lang.String r5 = r16.getName()
            goto L23c
        L23b:
            r5 = 0
        L23c:
            java.lang.String[] r3 = new java.lang.String[]{r3, r5}
            java.util.ArrayList r3 = a.N1.c0(r3)
            java.util.ArrayList r2 = a.C0383t3.q0(r2, r3)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>(r2)
            java.util.List r2 = a.C0383t3.w0(r3)
            a.mc r3 = new a.mc
            r3.<init>(r4, r2)
            a.mc[] r0 = new a.C0267mc[]{r0, r1, r3}
            java.util.Map r0 = a.C0067ba.E(r0)
            r1 = 0
            r2 = 12
            a.gd r0 = a.C0161gd.a.a(r9, r13, r1, r0, r2)
            goto L317
        L267:
            r1 = r23
        L269:
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r26
            if (r1 == 0) goto L276
            java.lang.String r0 = r1.getName()
            goto L278
        L276:
            r0 = r19
        L278:
            if (r24 == 0) goto L27f
            java.lang.String r9 = r24.getName()
            goto L281
        L27f:
            r9 = r19
        L281:
            if (r25 == 0) goto L288
            java.lang.String r14 = r25.getName()
            goto L28a
        L288:
            r14 = r19
        L28a:
            java.lang.String r12 = "CONV_LIST_RESOLVER_REPORT feature=conv_list_classes path=LITERAL_FALLBACK fallback=true adapter="
            java.lang.StringBuilder r0 = a.C0487z.i(r12, r0, r11, r9, r10)
            r0.append(r14)
            r0.append(r8)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r0}
            a.C0453x1.b(r0)
            a.cd r11 = a.EnumC0089cd.b
            if (r1 == 0) goto L2f9
            if (r24 != 0) goto L2b0
            r0 = r37
            goto L2b2
        L2b0:
            r0 = r24
        L2b2:
            a.mc r2 = new a.mc
            r2.<init>(r6, r0)
            if (r25 != 0) goto L2bc
            r0 = r37
            goto L2be
        L2bc:
            r0 = r25
        L2be:
            a.mc r3 = new a.mc
            r3.<init>(r5, r0)
            java.lang.String r25 = r1.getName()
            if (r24 == 0) goto L2d0
            java.lang.String r0 = r24.getName()
            r26 = r0
            goto L2d2
        L2d0:
            r26 = 0
        L2d2:
            java.lang.String r30 = "va5.a"
            java.lang.String r31 = "lr.f1"
            java.lang.String r27 = "bm3.m"
            java.lang.String r28 = "sc3.x"
            java.lang.String r29 = "sc3.x3"
            java.lang.String[] r0 = new java.lang.String[]{r25, r26, r27, r28, r29, r30, r31}
            java.util.ArrayList r0 = a.N1.c0(r0)
            a.mc r5 = new a.mc
            r5.<init>(r4, r0)
            a.mc[] r0 = new a.C0267mc[]{r2, r3, r5}
            java.util.Map r0 = a.C0067ba.E(r0)
            r2 = 0
            r3 = 12
            a.gd r0 = a.C0161gd.a.a(r1, r11, r2, r0, r3)
            goto L317
        L2f9:
            a.dd r12 = a.EnumC0107dd.c
            a.j6 r0 = new a.j6
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "CONV_LIST_NOT_FOUND"
            java.lang.String r2 = "conv_list_classes"
            java.lang.String r3 = "all resolution strategies failed"
            java.lang.String r4 = ""
            r0.<init>(r1, r2, r3, r4, r5)
            a.gd r7 = new a.gd
            r13 = 0
            r14 = 0
            r8 = 0
            r9 = 0
            r10 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0 = r7
        L317:
            return r0
        L318:
            r1 = r37
            a.fd r1 = (a.C0143fd) r1
            a.C0193i9.e(r1, r0)
            java.lang.ClassLoader r0 = r1.b
            java.lang.Class r0 = a.A1.b(r0, r11)
            return r0
        L326:
            r1 = r37
            a.fd r1 = (a.C0143fd) r1
            a.C0193i9.e(r1, r0)
            a.Cd r0 = a.Cd.f49a
            r0.getClass()
            java.lang.Object r0 = a.C0043a5.f384a
            java.lang.String r2 = "notification_precheck"
            if (r0 == 0) goto L345
            java.lang.String r3 = "rule_class_"
            java.lang.String r3 = r3.concat(r2)
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L346
        L345:
            r0 = 0
        L346:
            r3 = 28
            java.lang.ClassLoader r1 = r1.b
            if (r0 == 0) goto L359
            java.lang.Class r0 = a.Cd.g(r1, r0)
            if (r0 == 0) goto L359
            r4 = 0
            a.gd r0 = a.C0161gd.a.a(r0, r13, r4, r4, r3)
            goto L3e5
        L359:
            r4 = 0
            boolean r0 = a.C0435w1.H()
            java.lang.String r5 = "NOTIFICATION_PRECHECK_RESOLVED cls="
            if (r0 == 0) goto L3a8
            java.lang.String r0 = "preTalkerMute"
            java.util.List r0 = a.C0435w1.r(r0, r4)     // Catch: java.lang.Exception -> L369
            goto L36b
        L369:
            a.Y5 r0 = a.Y5.f351a
        L36b:
            java.util.Iterator r0 = r0.iterator()
        L36f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L387
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            a.Cd r6 = a.Cd.f49a
            r6.getClass()
            java.lang.Class r4 = a.Cd.g(r1, r4)
            if (r4 == 0) goto L36f
            goto L388
        L387:
            r4 = 0
        L388:
            if (r4 == 0) goto L3a8
            java.lang.String r0 = r4.getName()
            a.C0043a5.h(r2, r0)
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = " via=DkBridge(string)"
            java.lang.String r0 = a.C0487z.g(r5, r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r15, r0}
            a.C0453x1.b(r0)
            r1 = 0
            a.gd r0 = a.C0161gd.a.a(r4, r9, r1, r1, r3)
            goto L3e5
        L3a8:
            java.lang.Class r0 = a.Cd.g(r1, r8)
            a.cd r10 = a.EnumC0089cd.b
            if (r0 == 0) goto L3c7
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = " via=LITERAL_FALLBACK"
            java.lang.String r1 = a.C0487z.g(r5, r1, r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r15, r1}
            a.C0453x1.b(r1)
            r1 = 0
            a.gd r0 = a.C0161gd.a.a(r0, r10, r1, r1, r3)
            goto L3e5
        L3c7:
            a.dd r11 = a.EnumC0107dd.c
            a.j6 r0 = new a.j6
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "NOTIFICATION_PRECHECK_NOT_FOUND"
            java.lang.String r2 = "notification_precheck"
            java.lang.String r3 = "no notification precheck class found"
            java.lang.String r4 = ""
            r0.<init>(r1, r2, r3, r4, r5)
            a.gd r6 = new a.gd
            r12 = 0
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0 = r6
        L3e5:
            return r0
        L3e6:
            r1 = r37
            a.fd r1 = (a.C0143fd) r1
            a.C0193i9.e(r1, r0)
            a.Cd r0 = a.Cd.f49a
            r0.getClass()
            a.a5$e r0 = a.C0043a5.e()
            a.cd r6 = a.EnumC0089cd.b
            if (r0 != 0) goto L419
            a.dd r7 = a.EnumC0107dd.c
            a.j6 r5 = new a.j6
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = "MSG_STORAGE_CACHE_EMPTY"
            java.lang.String r10 = "F017_msg_storage"
            java.lang.String r11 = "DexKitCache.getMsgStorageInfo() returned null (scan not completed)"
            java.lang.String r12 = ""
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            a.gd r2 = new a.gd
            r8 = 0
            r9 = 0
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L496
        L419:
            java.lang.String r2 = r0.f389a
            java.lang.ClassLoader r1 = r1.b
            java.lang.Class r3 = a.Cd.g(r1, r2)
            if (r3 != 0) goto L447
            a.dd r7 = a.EnumC0107dd.d
            a.j6 r5 = new a.j6
            java.lang.String r0 = "forName("
            java.lang.String r1 = ") failed"
            java.lang.String r11 = a.C0487z.g(r0, r2, r1)
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r10 = "F017_msg_storage"
            java.lang.String r12 = ""
            java.lang.String r9 = "CLASS_LOAD_FAILED"
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            a.gd r2 = new a.gd
            r8 = 0
            r9 = 0
            r3 = 0
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L496
        L447:
            java.lang.String r4 = r0.c
            java.lang.Class r1 = a.Cd.g(r1, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "MSG_STORAGE_RESOLVED storage="
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " method="
            r5.append(r2)
            java.lang.String r0 = r0.b
            r5.append(r0)
            java.lang.String r2 = " msgInfo="
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r15, r2}
            a.C0453x1.b(r2)
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Any"
            a.C0193i9.c(r1, r2)
            a.mc r2 = new a.mc
            java.lang.String r4 = "msgInfoClass"
            r2.<init>(r4, r1)
            a.mc r1 = new a.mc
            java.lang.String r4 = "insertMethod"
            r1.<init>(r4, r0)
            a.mc[] r0 = new a.C0267mc[]{r2, r1}
            java.util.Map r0 = a.C0067ba.E(r0)
            r1 = 0
            r2 = 12
            a.gd r2 = a.C0161gd.a.a(r3, r13, r1, r0, r2)
        L496:
            return r2
        L497:
            r1 = r37
            a.fd r1 = (a.C0143fd) r1
            a.C0193i9.e(r1, r0)
            java.lang.ClassLoader r0 = r1.b
            java.lang.Class r0 = a.A1.b(r0, r8)
            return r0
        L4a5:
            r1 = r37
            a.fd r1 = (a.C0143fd) r1
            a.C0193i9.e(r1, r0)
            java.lang.String r0 = "com.tencent.mm.storage.f9"
            java.lang.ClassLoader r1 = r1.b
            java.lang.Class r0 = a.A1.b(r1, r0)
            return r0
        L4b5:
            r0 = r37
            a.gd r0 = (a.C0161gd) r0
            if (r0 != 0) goto L4be
            java.lang.String r0 = "NA"
            goto L519
        L4be:
            java.lang.Class<?> r1 = r0.b
            if (r1 == 0) goto L4c7
            java.lang.String r14 = r1.getName()
            goto L4f2
        L4c7:
            java.lang.reflect.Method r1 = r0.f
            if (r1 == 0) goto L4f0
            java.lang.Class r2 = r1.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "#"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r1 != 0) goto L4ee
            goto L4f0
        L4ee:
            r14 = r1
            goto L4f2
        L4f0:
            r14 = r19
        L4f2:
            boolean r1 = r0.f485a
            if (r1 == 0) goto L4f9
            java.lang.String r1 = "ok"
            goto L4fb
        L4f9:
            java.lang.String r1 = "fail"
        L4fb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ":"
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = "|"
            r2.append(r1)
            a.cd r0 = r0.d
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        L519:
            return r0
        L51a:
            r0 = r37
            java.lang.Class r0 = (java.lang.Class) r0
            a.C0193i9.e(r0, r7)
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            a.C0193i9.d(r0, r6)
            int r1 = r0.length
            r2 = r18
        L52b:
            if (r2 >= r1) goto L550
            r3 = r0[r2]
            java.lang.String r6 = r3.getName()
            boolean r6 = a.C0193i9.a(r6, r5)
            if (r6 == 0) goto L54d
            java.lang.Class r6 = r3.getReturnType()
            boolean r6 = a.C0193i9.a(r6, r4)
            if (r6 == 0) goto L54d
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            r6 = 1
            if (r3 != r6) goto L54e
            r10 = r6
            goto L552
        L54d:
            r6 = 1
        L54e:
            int r2 = r2 + r6
            goto L52b
        L550:
            r10 = r18
        L552:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L557:
            r0 = r37
            java.lang.Class r0 = (java.lang.Class) r0
            a.C0193i9.e(r0, r7)
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            a.C0193i9.d(r0, r6)
            int r1 = r0.length
            r5 = r18
        L568:
            if (r5 >= r1) goto L5ba
            r6 = r0[r5]
            java.lang.Class r7 = r6.getReturnType()
            boolean r7 = a.C0193i9.a(r7, r3)
            if (r7 == 0) goto L5b5
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r7 = r7.length
            r8 = 4
            if (r7 != r8) goto L5b5
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7 = r7[r18]
            boolean r7 = a.C0193i9.a(r7, r2)
            if (r7 == 0) goto L5b5
            java.lang.Class[] r7 = r6.getParameterTypes()
            r20 = 1
            r7 = r7[r20]
            boolean r7 = a.C0193i9.a(r7, r4)
            if (r7 == 0) goto L5b5
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7 = r7[r16]
            boolean r7 = a.C0193i9.a(r7, r4)
            if (r7 == 0) goto L5b5
            java.lang.Class[] r6 = r6.getParameterTypes()
            r7 = 3
            r6 = r6[r7]
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r6 = a.C0193i9.a(r6, r7)
            if (r6 == 0) goto L5b5
            r10 = 1
            goto L5bc
        L5b5:
            r20 = 1
            int r5 = r5 + 1
            goto L568
        L5ba:
            r10 = r18
        L5bc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L5c1:
            r0 = r37
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r12)
            java.lang.String r1 = r0.getName()
            java.lang.String r4 = "x"
            boolean r1 = a.C0193i9.a(r1, r4)
            if (r1 != 0) goto L5e0
            java.lang.String r1 = r0.getName()
            java.lang.String r4 = "p"
            boolean r1 = a.C0193i9.a(r1, r4)
            if (r1 == 0) goto L60a
        L5e0:
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            r6 = 1
            if (r1 != r6) goto L60a
            java.lang.Class[] r1 = r0.getParameterTypes()
            r1 = r1[r18]
            boolean r1 = a.C0193i9.a(r1, r2)
            if (r1 == 0) goto L60a
            java.lang.Class r1 = r0.getReturnType()
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto L60a
            java.lang.Class r0 = r0.getReturnType()
            boolean r0 = a.C0193i9.a(r0, r3)
            if (r0 != 0) goto L60a
            r10 = 1
            goto L60c
        L60a:
            r10 = r18
        L60c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L611:
            r1 = 0
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.util.List r2 = r0.getArgs()
            r3 = r21
            a.C0193i9.d(r2, r3)
            r3 = r18
            java.lang.Object r2 = a.C0383t3.o0(r2, r3)
            if (r2 != 0) goto L630
            java.lang.Object r0 = r0.proceed()
            goto L6e8
        L630:
            java.lang.String r3 = "userName:"
            java.lang.String r4 = "userName"
            java.lang.String r5 = "talker"
            java.lang.String r6 = "h"
            java.lang.String r7 = "f74979h"
            java.lang.String[] r4 = new java.lang.String[]{r6, r7, r4, r5}
            java.util.List r4 = a.C0294o3.d0(r4)
            java.util.Iterator r4 = r4.iterator()
        L646:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L675
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class r6 = r2.getClass()     // Catch: java.lang.NoSuchFieldException -> L646
            java.lang.reflect.Field r5 = r6.getDeclaredField(r5)     // Catch: java.lang.NoSuchFieldException -> L646
            r6 = 1
            r5.setAccessible(r6)     // Catch: java.lang.NoSuchFieldException -> L646
            java.lang.Object r5 = r5.get(r2)     // Catch: java.lang.NoSuchFieldException -> L646
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.NoSuchFieldException -> L646
            if (r6 == 0) goto L669
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.NoSuchFieldException -> L646
            goto L66a
        L669:
            r5 = r1
        L66a:
            if (r5 == 0) goto L646
            boolean r6 = a.Be.P(r5)     // Catch: java.lang.NoSuchFieldException -> L646
            if (r6 == 0) goto L673
            goto L646
        L673:
            r10 = r5
            goto L6b7
        L675:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6b6
            r4 = 0
            boolean r5 = a.Be.I(r2, r3, r4)     // Catch: java.lang.Throwable -> L6b6
            if (r5 == 0) goto L6b6
            java.lang.String r4 = "<this>"
            a.C0193i9.e(r2, r4)     // Catch: java.lang.Throwable -> L6b6
            java.lang.String r4 = "missingDelimiterValue"
            a.C0193i9.e(r2, r4)     // Catch: java.lang.Throwable -> L6b6
            r4 = 6
            r5 = 0
            int r4 = a.Be.N(r2, r3, r5, r5, r4)     // Catch: java.lang.Throwable -> L6b6
            r5 = -1
            if (r4 != r5) goto L694
            goto L6a6
        L694:
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L6b6
            int r3 = r3 + r4
            int r4 = r2.length()     // Catch: java.lang.Throwable -> L6b6
            java.lang.String r2 = r2.substring(r3, r4)     // Catch: java.lang.Throwable -> L6b6
            java.lang.String r3 = "substring(...)"
            a.C0193i9.d(r2, r3)     // Catch: java.lang.Throwable -> L6b6
        L6a6:
            java.lang.CharSequence r2 = a.Be.V(r2)     // Catch: java.lang.Throwable -> L6b6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6b6
            boolean r3 = a.Be.P(r2)     // Catch: java.lang.Throwable -> L6b6
            if (r3 != 0) goto L6b6
            r10 = r2
            goto L6b7
        L6b6:
            r10 = r1
        L6b7:
            if (r10 == 0) goto L6e4
            java.util.concurrent.ExecutorService r1 = a.fh.G
            boolean r1 = a.fh.a.a(r10)
            if (r1 == 0) goto L6e4
            a.x8 r1 = a.C0460x8.f762a
            boolean r1 = a.C0460x8.a()
            if (r1 != 0) goto L6e4
            java.lang.String r0 = "[MuteNotifPart] SUPPRESS notification for masked user="
            java.lang.String r1 = " (a.a fallback)"
            java.lang.String r0 = a.C0487z.g(r0, r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r6 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            a.C0453x1.b(r0)
            r17 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            goto L6e8
        L6e4:
            java.lang.Object r0 = r0.proceed()
        L6e8:
            return r0
        L6e9:
            r3 = r21
            r1 = 0
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.util.List r2 = r0.getArgs()
            a.C0193i9.d(r2, r3)
            r3 = 0
            java.lang.Object r2 = a.C0383t3.o0(r2, r3)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L707
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            goto L708
        L707:
            r10 = r1
        L708:
            if (r10 == 0) goto L731
            java.util.concurrent.ExecutorService r1 = a.fh.G
            boolean r1 = a.fh.a.a(r10)
            if (r1 == 0) goto L731
            a.x8 r1 = a.C0460x8.f762a
            boolean r1 = a.C0460x8.a()
            if (r1 != 0) goto L731
            java.lang.String r0 = "[MuteNotifPart] SUPPRESS notification for masked user="
            java.lang.String r1 = " (m0.b)"
            java.lang.String r0 = a.C0487z.g(r0, r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r6 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            a.C0453x1.b(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L735
        L731:
            java.lang.Object r0 = r0.proceed()
        L735:
            return r0
        L736:
            r3 = r21
            r1 = 0
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r2 = r0.proceed()
            java.util.List r0 = r0.getArgs()     // Catch: java.lang.Throwable -> L79d
            a.C0193i9.d(r0, r3)     // Catch: java.lang.Throwable -> L79d
            java.lang.Object r0 = a.C0383t3.n0(r0)     // Catch: java.lang.Throwable -> L79d
            if (r0 != 0) goto L752
            goto L79d
        L752:
            java.lang.String r3 = "field_talker"
            java.lang.Object r3 = a.A1.h(r0, r3)     // Catch: java.lang.Throwable -> L79d
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L79d
            if (r4 == 0) goto L760
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L79d
            goto L761
        L760:
            r10 = r1
        L761:
            if (r10 == 0) goto L79d
            boolean r1 = a.Be.P(r10)     // Catch: java.lang.Throwable -> L79d
            if (r1 == 0) goto L76a
            goto L79d
        L76a:
            java.util.concurrent.ExecutorService r1 = a.fh.G     // Catch: java.lang.Throwable -> L79d
            boolean r1 = a.fh.a.a(r10)     // Catch: java.lang.Throwable -> L79d
            if (r1 != 0) goto L773
            goto L79d
        L773:
            java.lang.String r1 = "field_isSend"
            java.lang.Object r0 = a.A1.h(r0, r1)     // Catch: java.lang.Throwable -> L79d
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L79d
            if (r1 == 0) goto L784
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L79d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L79d
            goto L793
        L784:
            boolean r1 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L79d
            if (r1 == 0) goto L792
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L79d
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L79d
            if (r0 == 0) goto L792
            r0 = 1
            goto L793
        L792:
            r0 = 0
        L793:
            java.util.concurrent.CopyOnWriteArrayList<a.ca$d> r1 = a.C0086ca.f421a     // Catch: java.lang.Throwable -> L79d
            a.ca$a$b r1 = new a.ca$a$b     // Catch: java.lang.Throwable -> L79d
            r1.<init>(r10, r0)     // Catch: java.lang.Throwable -> L79d
            a.C0086ca.a(r1)     // Catch: java.lang.Throwable -> L79d
        L79d:
            return r2
        L79e:
            r1 = 0
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.String r2 = "FC_DEBUG"
            java.lang.String r3 = "MaskUIManager: SettingsCareModeIntro.initView FIRED!"
            android.util.Log.e(r2, r3)
            java.lang.Object r2 = r0.proceed()
            java.lang.Object r0 = r0.getThisObject()
            boolean r3 = r0 instanceof android.app.Activity
            if (r3 == 0) goto L7bd
            r10 = r0
            android.app.Activity r10 = (android.app.Activity) r10
            goto L7be
        L7bd:
            r10 = r1
        L7be:
            if (r10 != 0) goto L7c1
            goto L7f0
        L7c1:
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r10.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L7cd
            goto L7f0
        L7cd:
            a.Rc r1 = new a.Rc
            r1.<init>()
            a.V7 r3 = new a.V7
            r6 = 1
            r3.<init>(r1, r10, r6)
            a.C0390ta.a(r0, r3)
            int r0 = r1.f248a
            java.lang.String r1 = "MaskUIManager: "
            java.lang.String r3 = " long-click views"
            java.lang.String r0 = a.C0487z.c(r0, r1, r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            a.C0453x1.b(r0)
        L7f0:
            return r2
        L7f1:
            r0 = r37
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            a.Wf r0 = a.Wf.f330a
            return r0
        L7fb:
            r0 = r37
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r12)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "setOnItemLongClickListener"
            boolean r1 = a.C0193i9.a(r1, r2)
            if (r1 == 0) goto L818
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r6 = 1
            if (r0 != r6) goto L818
            r10 = 1
            goto L819
        L818:
            r10 = 0
        L819:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L81e:
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r0 = a.R8.h(r0)
            return r0
        L82a:
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r0 = a.R8.h(r0)
            return r0
        L836:
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r0 = a.R8.g(r0)
            return r0
        L842:
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r0 = a.R8.g(r0)
            return r0
        L84e:
            r3 = r21
            r1 = 0
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.util.List r2 = r0.getArgs()
            a.C0193i9.d(r2, r3)
            r6 = 1
            java.lang.Object r2 = a.C0383t3.o0(r2, r6)
            boolean r3 = r2 instanceof android.app.Notification
            if (r3 == 0) goto L86b
            android.app.Notification r2 = (android.app.Notification) r2
            goto L86c
        L86b:
            r2 = r1
        L86c:
            if (r2 == 0) goto L881
            boolean r3 = a.C0074bh.b()
            if (r3 == 0) goto L881
            boolean r2 = a.R8.q(r2)
            if (r2 == 0) goto L881
            java.lang.String r0 = "intercept Service.startForeground"
            a.R8.r(r0)
            r10 = r1
            goto L885
        L881:
            java.lang.Object r10 = r0.proceed()
        L885:
            return r10
        L886:
            r3 = r21
            r1 = 0
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.util.List r2 = r0.getArgs()
            a.C0193i9.d(r2, r3)
            r6 = 1
            java.lang.Object r2 = a.C0383t3.o0(r2, r6)
            boolean r3 = r2 instanceof android.os.Bundle
            if (r3 == 0) goto L8a3
            android.os.Bundle r2 = (android.os.Bundle) r2
            goto L8a4
        L8a3:
            r2 = r1
        L8a4:
            if (r2 == 0) goto L8bf
            java.util.Set r3 = r2.keySet()
            if (r3 == 0) goto L8bf
            a.Q8 r4 = new a.Q8
            r5 = 0
            r4.<init>(r2, r5)
            r5 = 30
            java.lang.String r6 = ", "
            java.lang.String r3 = a.C0383t3.p0(r3, r6, r4, r5)
            if (r3 != 0) goto L8bd
            goto L8bf
        L8bd:
            r14 = r3
            goto L8c1
        L8bf:
            r14 = r19
        L8c1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "TelecomManager.addNewIncomingCall extras={"
            r3.<init>(r4)
            r3.append(r14)
            java.lang.String r4 = "}"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            a.R8.r(r3)
            if (r2 != 0) goto L8db
            r2 = r1
            goto L91d
        L8db:
            java.util.Set r3 = r2.keySet()
            java.lang.String r4 = "keySet(...)"
            a.C0193i9.d(r3, r4)
            a.M1 r4 = new a.M1
            r6 = 1
            r4.<init>(r6, r3)
            a.Q8 r3 = new a.Q8
            r3.<init>(r2, r6)
            a.Bf r2 = new a.Bf
            r2.<init>(r4, r3)
            a.kd r3 = new a.kd
            r4 = 21
            r3.<init>(r4)
            a.x6 r4 = new a.x6
            r4.<init>(r2, r3)
            a.x6$a r2 = new a.x6$a
            r2.<init>(r4)
        L905:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L919
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = a.yh.a(r4)
            if (r4 == 0) goto L905
            goto L91a
        L919:
            r3 = r1
        L91a:
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
        L91d:
            if (r2 != 0) goto L92f
            java.lang.String r2 = a.C0074bh.a()
            if (r2 == 0) goto L92e
            java.util.concurrent.ExecutorService r3 = a.fh.G
            boolean r3 = a.fh.a.a(r2)
            if (r3 == 0) goto L92e
            goto L92f
        L92e:
            r2 = r1
        L92f:
            if (r2 == 0) goto L947
            java.util.concurrent.ExecutorService r3 = a.fh.G
            boolean r3 = a.fh.a.a(r2)
            if (r3 == 0) goto L947
            java.lang.String r0 = "intercept TelecomManager.addNewIncomingCall for blacklisted user="
            java.lang.String r0 = r0.concat(r2)
            a.R8.r(r0)
            a.C0074bh.g(r2)
            r10 = r1
            goto L94b
        L947:
            java.lang.Object r10 = r0.proceed()
        L94b:
            return r10
        L94c:
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r0 = a.R8.g(r0)
            return r0
        L958:
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r0 = a.R8.g(r0)
            return r0
        L964:
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r0 = a.R8.g(r0)
            return r0
        L970:
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r0 = a.R8.g(r0)
            return r0
        L97c:
            r3 = r21
            r1 = 0
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.util.List r2 = r0.getArgs()
            a.C0193i9.d(r2, r3)
            r3 = r16
            java.lang.Object r2 = a.C0383t3.o0(r2, r3)
            boolean r3 = r2 instanceof android.content.Intent
            if (r3 == 0) goto L99b
            r10 = r2
            android.content.Intent r10 = (android.content.Intent) r10
            goto L99c
        L99b:
            r10 = r1
        L99c:
            if (r10 == 0) goto L9c0
            boolean r1 = a.R8.t(r10)
            if (r1 == 0) goto L9c0
            android.content.ComponentName r0 = r10.getComponent()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "intercept IActivityTaskManager.startActivity intent="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            a.R8.r(r0)
            r18 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            goto L9c4
        L9c0:
            java.lang.Object r0 = r0.proceed()
        L9c4:
            return r0
        L9c5:
            r0 = r37
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r12)
            java.lang.String r1 = r0.getName()
            boolean r2 = a.C0193i9.a(r1, r5)
            if (r2 != 0) goto L9de
            java.lang.String r2 = "b"
            boolean r1 = a.C0193i9.a(r1, r2)
            if (r1 == 0) goto L9e8
        L9de:
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r6 = 1
            if (r0 < r6) goto L9e8
            r10 = r6
            goto L9ea
        L9e8:
            r10 = r18
        L9ea:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L9ef:
            r0 = r37
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r0 = a.R8.f(r0)
            return r0
    }
}
