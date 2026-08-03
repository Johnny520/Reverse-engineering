package a;

/* JADX INFO: renamed from: a.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0150g2 implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f478a;

    public /* synthetic */ C0150g2(int r1) {
            r0 = this;
            r0.f478a = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0150g2(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f478a = r1
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r19) {
            r18 = this;
            java.lang.String r0 = "BlockContactInfo: blockBypass active, SKIP block (allow contact info)"
            java.lang.String r1 = "Contact_User"
            java.lang.String r2 = "]"
            java.lang.String r3 = "?"
            java.lang.String r4 = "<destruct>"
            java.lang.String r5 = "c"
            java.lang.String r6 = "setAdapter"
            java.lang.String r7 = "="
            java.lang.String r8 = "mtd"
            java.lang.String r9 = "e"
            java.lang.String r10 = "it"
            java.lang.Class<java.util.List> r11 = java.util.List.class
            java.lang.String r13 = "m"
            java.lang.String r14 = "chain"
            r16 = 0
            r15 = r18
            int r12 = r15.f478a
            switch(r12) {
                case 0: goto L663;
                case 1: goto L5c4;
                case 2: goto L5bc;
                case 3: goto L585;
                case 4: goto L57a;
                case 5: goto L56e;
                case 6: goto L537;
                case 7: goto L52b;
                case 8: goto L522;
                case 9: goto L4ea;
                case 10: goto L4c2;
                case 11: goto L414;
                case 12: goto L3ac;
                case 13: goto L37d;
                case 14: goto L375;
                case 15: goto L2bd;
                case 16: goto L29b;
                case 17: goto L264;
                case 18: goto L244;
                case 19: goto L20e;
                case 20: goto L1d8;
                case 21: goto L1b2;
                case 22: goto L186;
                case 23: goto L15a;
                case 24: goto L12a;
                case 25: goto Lda;
                case 26: goto Laa;
                case 27: goto L65;
                case 28: goto L45;
                default: goto L25;
            }
        L25:
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r13)
            java.lang.String r1 = r0.getName()
            boolean r1 = a.C0193i9.a(r1, r6)
            if (r1 == 0) goto L40
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L40
            r16 = 1
        L40:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L45:
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r13)
            java.lang.String r1 = r0.getName()
            boolean r1 = a.C0193i9.a(r1, r9)
            if (r1 == 0) goto L60
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L60
            r16 = 1
        L60:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L65:
            r0 = r19
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r14)
            java.lang.Object r1 = r0.proceed()
            if (r1 != 0) goto L74
            r2 = 0
            goto L75
        L74:
            r2 = r1
        L75:
            if (r2 != 0) goto L78
            goto La3
        L78:
            java.lang.String r3 = "getSnsId"
            java.lang.Object r2 = a.C0263m8.c(r2, r3)     // Catch: java.lang.Throwable -> L85
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L87
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L85
            goto L88
        L85:
            r0 = move-exception
            goto La6
        L87:
            r2 = 0
        L88:
            if (r2 != 0) goto L8b
            goto La3
        L8b:
            boolean r2 = a.C0263m8.n(r2)     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto La3
            java.lang.Object r0 = r0.getThisObject()     // Catch: java.lang.Throwable -> L85
            boolean r2 = r0 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L9d
            r12 = r0
            android.app.Activity r12 = (android.app.Activity) r12     // Catch: java.lang.Throwable -> L85
            goto L9e
        L9d:
            r12 = 0
        L9e:
            if (r12 == 0) goto La3
            r12.finish()     // Catch: java.lang.Throwable -> L85
        La3:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L85
            goto La9
        La6:
            a.C0465xd.a(r0)
        La9:
            return r1
        Laa:
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r13)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "B7"
            boolean r1 = a.C0193i9.a(r1, r2)
            if (r1 == 0) goto Ld5
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto Ld5
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0 = r0[r16]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 == 0) goto Ld5
            r16 = 1
        Ld5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        Lda:
            r0 = r19
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r14)
            r0.proceed()
            java.lang.Object r0 = r0.getThisObject()     // Catch: java.lang.Throwable -> L11f
            boolean r1 = a.C0263m8.m()     // Catch: java.lang.Throwable -> L11f
            if (r1 != 0) goto Lef
            goto L11c
        Lef:
            boolean r1 = r0 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L11f
            if (r1 != 0) goto Lf4
            goto L11c
        Lf4:
            java.util.Set r1 = a.C0263m8.k()     // Catch: java.lang.Throwable -> L11f
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L11f
            if (r1 == 0) goto Lff
            goto L11c
        Lff:
            java.lang.String r1 = "G"
            java.lang.Object r1 = a.C0263m8.i(r0, r1)     // Catch: java.lang.Throwable -> L11f
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L11f
            if (r2 == 0) goto L10d
            r12 = r1
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L11f
            goto L10e
        L10d:
            r12 = 0
        L10e:
            if (r12 != 0) goto L111
            goto L11c
        L111:
            boolean r1 = a.C0263m8.n(r12)     // Catch: java.lang.Throwable -> L11f
            if (r1 == 0) goto L11c
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> L11f
            r0.finish()     // Catch: java.lang.Throwable -> L11f
        L11c:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L11f
            goto L124
        L11f:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L124:
            a.wd r1 = new a.wd
            r1.<init>(r0)
            return r1
        L12a:
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r13)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "onCreate"
            boolean r1 = a.C0193i9.a(r1, r2)
            if (r1 == 0) goto L155
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L155
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0 = r0[r16]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 == 0) goto L155
            r16 = 1
        L155:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L15a:
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r13)
            java.lang.String r1 = r0.getName()
            boolean r1 = a.C0193i9.a(r1, r5)
            if (r1 == 0) goto L181
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L181
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0 = r0[r16]
            boolean r0 = a.C0193i9.a(r0, r11)
            if (r0 == 0) goto L181
            r16 = 1
        L181:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L186:
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r13)
            java.lang.String r1 = r0.getName()
            boolean r1 = a.C0193i9.a(r1, r5)
            if (r1 == 0) goto L1ad
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L1ad
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0 = r0[r16]
            boolean r0 = a.C0193i9.a(r0, r11)
            if (r0 == 0) goto L1ad
            r16 = 1
        L1ad:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L1b2:
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r13)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "q"
            boolean r1 = a.C0193i9.a(r1, r2)
            if (r1 == 0) goto L1d3
            java.lang.Class[] r0 = r0.getParameterTypes()
            java.lang.String r1 = "getParameterTypes(...)"
            a.C0193i9.d(r0, r1)
            int r0 = r0.length
            if (r0 != 0) goto L1d3
            r16 = 1
        L1d3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L1d8:
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r8)
            java.lang.String r1 = r0.getName()
            boolean r1 = a.C0193i9.a(r1, r9)
            if (r1 == 0) goto L209
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L209
            java.lang.Class[] r1 = r0.getParameterTypes()
            r1 = r1[r16]
            boolean r1 = a.C0193i9.a(r1, r11)
            if (r1 == 0) goto L209
            java.lang.Class r0 = r0.getReturnType()
            boolean r0 = a.C0193i9.a(r0, r11)
            if (r0 == 0) goto L209
            r16 = 1
        L209:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L20e:
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r8)
            java.lang.String r1 = r0.getName()
            boolean r1 = a.C0193i9.a(r1, r9)
            if (r1 == 0) goto L23f
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            r2 = 1
            if (r1 != r2) goto L23f
            java.lang.Class[] r1 = r0.getParameterTypes()
            r1 = r1[r16]
            boolean r1 = a.C0193i9.a(r1, r11)
            if (r1 == 0) goto L23f
            java.lang.Class r0 = r0.getReturnType()
            boolean r0 = a.C0193i9.a(r0, r11)
            if (r0 == 0) goto L23f
            r16 = 1
        L23f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L244:
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r8)
            java.lang.String r1 = r0.getName()
            boolean r1 = a.C0193i9.a(r1, r6)
            if (r1 == 0) goto L25f
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r2 = 1
            if (r0 != r2) goto L25f
            r16 = 1
        L25f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L264:
            r0 = r19
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            a.C0193i9.e(r0, r4)
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            a.n6$b r0 = (a.C0279n6.b) r0
            java.lang.String r2 = r0.f597a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r7)
            r3.append(r2)
            java.lang.String r1 = "("
            r3.append(r1)
            long r0 = r0.b
            r3.append(r0)
            java.lang.String r0 = "ms)"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L29b:
            r0 = r19
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            a.C0193i9.e(r0, r10)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L2bd:
            r0 = r19
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r14)
            java.lang.Object r1 = r0.proceed()
            java.lang.Object r0 = r0.getThisObject()
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L2d4
            r12 = r0
            android.app.Activity r12 = (android.app.Activity) r12
            goto L2d5
        L2d4:
            r12 = 0
        L2d5:
            if (r12 != 0) goto L2d9
            goto L374
        L2d9:
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "com.tencent.mm.ui.chatting.ChattingUI"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L2f3
            java.lang.String r2 = "com.tencent.mm.ui.LauncherUI"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2f3
            goto L374
        L2f3:
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 != 0) goto L300
            goto L374
        L300:
            boolean r0 = a.K3.a.k()
            if (r0 == 0) goto L308
            goto L374
        L308:
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.s
            if (r0 != 0) goto L311
            goto L374
        L311:
            java.util.ArrayList r0 = a.K3.a.f()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31c
            goto L374
        L31c:
            a.x8 r0 = a.C0460x8.f762a
            boolean r0 = a.C0460x8.a()
            if (r0 != 0) goto L374
            boolean r0 = a.C0366s4.F
            if (r0 == 0) goto L329
            goto L374
        L329:
            android.content.Intent r0 = r12.getIntent()
            if (r0 != 0) goto L330
            goto L374
        L330:
            java.lang.String r2 = "Chat_User"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 == 0) goto L374
            boolean r2 = a.Be.P(r0)
            if (r2 == 0) goto L33f
            goto L374
        L33f:
            java.util.concurrent.ExecutorService r2 = a.fh.G
            boolean r2 = a.fh.a.a(r0)
            if (r2 == 0) goto L374
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "blockEnterChat(onCreate): finishing "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " for "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r2 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
            r12.finish()
        L374:
            return r1
        L375:
            r0 = r19
            java.lang.String r0 = (java.lang.String) r0
            a.C0193i9.e(r0, r10)
            return r3
        L37d:
            r0 = r19
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r14)
            java.lang.Object r0 = r0.proceed()
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L390
            r12 = r0
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L391
        L390:
            r12 = 0
        L391:
            if (r12 == 0) goto L398
            int r0 = r12.intValue()
            goto L39a
        L398:
            r0 = r16
        L39a:
            java.lang.String r1 = "[DIAG-LABEL] mb getCount="
            java.lang.String r1 = a.C0487z.e(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            a.C0282n9.t(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L3ac:
            r0 = r19
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r14)
            java.lang.Object r1 = r0.proceed()
            java.util.List r0 = r0.getArgs()
            r3 = r16
            java.lang.Object r0 = r0.get(r3)
            boolean r3 = r0 instanceof java.lang.Integer
            if (r3 == 0) goto L3c9
            r12 = r0
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L3ca
        L3c9:
            r12 = 0
        L3ca:
            if (r12 == 0) goto L413
            int r0 = r12.intValue()
            if (r1 == 0) goto L3db
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            goto L3dd
        L3db:
            java.lang.String r3 = "null"
        L3dd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[DIAG-LABEL] mb getItem["
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = "] class="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r4 = 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            a.C0453x1.b(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ContactLabel item["
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            a.C0189i5.a(r1, r0)
        L413:
            return r1
        L414:
            r0 = r19
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r14)
            java.lang.Object r1 = r0.proceed()
            java.util.List r3 = r0.getArgs()
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L42f
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L430
        L42f:
            r3 = 0
        L430:
            if (r3 == 0) goto L4c1
            int r4 = r3.intValue()
            java.lang.String r5 = "[ContactLabel-mb getView:"
            java.lang.String r2 = a.C0487z.c(r4, r5, r2)
            java.lang.Object r0 = r0.getThisObject()
            java.lang.String r4 = "[DIAG-SNS] "
            if (r0 == 0) goto L457
            java.lang.Class r5 = r0.getClass()     // Catch: java.lang.Throwable -> L455
            java.lang.String r6 = "getItem"
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L455
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L455
            java.lang.reflect.Method r12 = r5.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L455
            goto L458
        L455:
            r0 = move-exception
            goto L493
        L457:
            r12 = 0
        L458:
            if (r12 == 0) goto L4c1
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L455
            java.lang.Object r0 = r12.invoke(r0, r3)     // Catch: java.lang.Throwable -> L455
            if (r0 != 0) goto L465
            goto L4c1
        L465:
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L455
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L455
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L455
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L455
            r5.append(r2)     // Catch: java.lang.Throwable -> L455
            java.lang.String r6 = " class="
            r5.append(r6)     // Catch: java.lang.Throwable -> L455
            r5.append(r3)     // Catch: java.lang.Throwable -> L455
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L455
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L455
            r5 = 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r5)     // Catch: java.lang.Throwable -> L455
            a.C0453x1.b(r3)     // Catch: java.lang.Throwable -> L455
            a.C0189i5.a(r0, r2)     // Catch: java.lang.Throwable -> L455
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L455
            goto L497
        L493:
            a.wd$a r0 = a.C0465xd.a(r0)
        L497:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L4c1
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " FAILED: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r2 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
        L4c1:
            return r1
        L4c2:
            r0 = r19
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            a.C0193i9.e(r0, r4)
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            a.p6 r0 = (a.C0315p6) r0
            a.q6 r0 = r0.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L4ea:
            r0 = r19
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            java.lang.String r1 = r0.getClassName()
            java.lang.String r2 = "getClassName(...)"
            a.C0193i9.d(r1, r2)
            r2 = 46
            java.lang.String r1 = a.Be.T(r1, r2)
            java.lang.String r2 = r0.getMethodName()
            int r0 = r0.getLineNumber()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "."
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ":"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L522:
            r0 = r19
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getName()
            return r0
        L52b:
            r0 = r19
            java.lang.Class r0 = (java.lang.Class) r0
            a.C0193i9.e(r0, r10)
            java.lang.Class r0 = r0.getSuperclass()
            return r0
        L537:
            r0 = r19
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r14)
            java.lang.Object r0 = r0.proceed()
            a.x8 r1 = a.C0460x8.f762a
            boolean r1 = a.C0460x8.a()
            if (r1 == 0) goto L56d
            r2 = 1
            a.C0366s4.G = r2
            a.w1 r1 = a.C0435w1.f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[ProfileWhitelist] 临时解除期间打开资料页: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ".ContactInfoUI"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            a.C0453x1.b(r1)
        L56d:
            return r0
        L56e:
            r0 = r19
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r14)
            java.lang.Object r0 = r0.proceed()
            return r0
        L57a:
            r0 = r19
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "\""
            java.lang.String r0 = a.C0487z.g(r1, r0, r1)
            return r0
        L585:
            r4 = r16
            r0 = r19
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            a.C0193i9.e(r0, r13)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "rawQueryWithFactory"
            boolean r1 = a.C0193i9.a(r1, r2)
            if (r1 == 0) goto L5b5
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            a.C0282n9.m(r1)
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            r1 = 4
            if (r0 != r1) goto L5b5
            r17 = 1
            goto L5b7
        L5b5:
            r17 = r4
        L5b7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            return r0
        L5bc:
            r0 = r19
            java.lang.String r0 = (java.lang.String) r0
            a.C0193i9.e(r0, r10)
            return r3
        L5c4:
            r2 = r19
            io.github.libxposed.api.XposedInterface$Chain r2 = (io.github.libxposed.api.XposedInterface.Chain) r2
            a.C0193i9.e(r2, r14)
            java.lang.Object r3 = r2.getThisObject()
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 == 0) goto L5d6
            android.app.Activity r3 = (android.app.Activity) r3
            goto L5d7
        L5d6:
            r3 = 0
        L5d7:
            if (r3 == 0) goto L65e
            boolean r4 = r3.isFinishing()
            if (r4 == 0) goto L5e1
            goto L65e
        L5e1:
            a.K3$a r4 = a.K3.f148a
            r4.getClass()
            a.jc r4 = a.K3.a.i()
            boolean r4 = r4.t
            if (r4 == 0) goto L659
            boolean r4 = a.K3.a.l()
            if (r4 != 0) goto L5f5
            goto L659
        L5f5:
            boolean r4 = a.K3.a.k()
            if (r4 == 0) goto L600
            java.lang.Object r12 = r2.proceed()
            goto L662
        L600:
            a.x8 r4 = a.C0460x8.f762a
            boolean r4 = a.C0460x8.a()
            if (r4 != 0) goto L648
            android.content.Intent r0 = r3.getIntent()
            if (r0 == 0) goto L613
            java.lang.String r0 = r0.getStringExtra(r1)
            goto L614
        L613:
            r0 = 0
        L614:
            if (r0 == 0) goto L643
            boolean r1 = a.Be.P(r0)
            if (r1 == 0) goto L61d
            goto L643
        L61d:
            java.util.concurrent.ExecutorService r1 = a.fh.G
            boolean r1 = a.fh.a.a(r0)
            if (r1 == 0) goto L63e
            java.lang.String r1 = "BlockContactInfo: BLOCK ContactInfoUI.onResume (fallback) for "
            java.lang.String r2 = ", finishing"
            java.lang.String r0 = a.C0487z.g(r1, r0, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r2 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            a.C0453x1.b(r0)
            r3.finish()
            r12 = 0
            goto L662
        L63e:
            java.lang.Object r12 = r2.proceed()
            goto L662
        L643:
            java.lang.Object r12 = r2.proceed()
            goto L662
        L648:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            java.lang.Object r12 = r2.proceed()
            goto L662
        L659:
            java.lang.Object r12 = r2.proceed()
            goto L662
        L65e:
            java.lang.Object r12 = r2.proceed()
        L662:
            return r12
        L663:
            r2 = r19
            io.github.libxposed.api.XposedInterface$Chain r2 = (io.github.libxposed.api.XposedInterface.Chain) r2
            a.C0193i9.e(r2, r14)
            java.lang.Object r3 = r2.proceed()
            java.lang.Object r2 = r2.getThisObject()
            boolean r4 = r2 instanceof android.app.Activity
            if (r4 == 0) goto L679
            android.app.Activity r2 = (android.app.Activity) r2
            goto L67a
        L679:
            r2 = 0
        L67a:
            if (r2 != 0) goto L67e
            goto L6e9
        L67e:
            boolean r4 = r2.isFinishing()
            if (r4 == 0) goto L685
            goto L6e9
        L685:
            a.K3$a r4 = a.K3.f148a
            r4.getClass()
            a.jc r4 = a.K3.a.i()
            boolean r4 = r4.t
            if (r4 == 0) goto L6e9
            boolean r4 = a.K3.a.l()
            if (r4 != 0) goto L699
            goto L6e9
        L699:
            boolean r4 = a.K3.a.k()
            if (r4 == 0) goto L6a0
            goto L6e9
        L6a0:
            a.x8 r4 = a.C0460x8.f762a
            boolean r4 = a.C0460x8.a()
            if (r4 != 0) goto L6dd
            android.content.Intent r0 = r2.getIntent()
            if (r0 == 0) goto L6b3
            java.lang.String r12 = r0.getStringExtra(r1)
            goto L6b4
        L6b3:
            r12 = 0
        L6b4:
            if (r12 == 0) goto L6e9
            boolean r0 = a.Be.P(r12)
            if (r0 == 0) goto L6bd
            goto L6e9
        L6bd:
            java.util.concurrent.ExecutorService r0 = a.fh.G
            boolean r0 = a.fh.a.a(r12)
            if (r0 == 0) goto L6e9
            java.lang.String r0 = "BlockContactInfo: BLOCK ContactInfoUI.onCreate for "
            java.lang.String r1 = ", finishing activity"
            java.lang.String r0 = a.C0487z.g(r0, r12, r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            r2.finish()
            goto L6e9
        L6dd:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
        L6e9:
            return r3
    }
}
