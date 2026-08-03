package a;

/* JADX INFO: renamed from: a.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0232kd implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f549a;

    public /* synthetic */ C0232kd(int r1) {
            r0 = this;
            r0.f549a = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0232kd(a.Od r1) {
            r0 = this;
            r1 = 20
            r0.f549a = r1
            r0.<init>()
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r23) {
            r22 = this;
            java.lang.String r0 = "getDeclaredMethods(...)"
            r1 = 0
            java.lang.String r2 = "it"
            r3 = 0
            r4 = 1
            java.lang.String r5 = "chain"
            r6 = r22
            int r7 = r6.f549a
            switch(r7) {
                case 0: goto L2c3;
                case 1: goto L2b7;
                case 2: goto L29d;
                case 3: goto L294;
                case 4: goto L286;
                case 5: goto L278;
                case 6: goto L26f;
                case 7: goto L266;
                case 8: goto L25d;
                case 9: goto L254;
                case 10: goto L24b;
                case 11: goto L242;
                case 12: goto L239;
                case 13: goto L230;
                case 14: goto L227;
                case 15: goto L21e;
                case 16: goto L215;
                case 17: goto L20c;
                case 18: goto L203;
                case 19: goto L1fa;
                case 20: goto Ld9;
                case 21: goto Ld1;
                case 22: goto Lc0;
                case 23: goto Laf;
                case 24: goto L9e;
                case 25: goto L8d;
                case 26: goto L7c;
                case 27: goto L73;
                case 28: goto L4e;
                default: goto L10;
            }
        L10:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            java.lang.Object r2 = r0.proceed()
            a.K3$a r3 = a.K3.f148a
            r3.getClass()
            a.jc r3 = a.K3.a.i()
            boolean r3 = r3.z
            if (r3 != 0) goto L29
            goto L4d
        L29:
            java.lang.Object r0 = r0.getThisObject()
            boolean r3 = r0 instanceof android.app.Activity
            if (r3 == 0) goto L34
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
        L34:
            if (r1 == 0) goto L40
            r1.finish()     // Catch: java.lang.Throwable -> L3c
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r0 = move-exception
            a.C0465xd.a(r0)
        L40:
            java.lang.String r0 = "WXMaskPlugin: blocked scan login dialog"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
        L4d:
            return r2
        L4e:
            r0 = r23
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class r1 = r0.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "#"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L73:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getName()
            return r0
        L7c:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            a.if r1 = a.Cif.f512a
            r1.getClass()
            java.lang.Object r0 = a.Cif.f(r0)
            return r0
        L8d:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            a.if r1 = a.Cif.f512a
            r1.getClass()
            java.lang.Object r0 = a.Cif.f(r0)
            return r0
        L9e:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            a.if r1 = a.Cif.f512a
            r1.getClass()
            java.lang.Object r0 = a.Cif.e(r0)
            return r0
        Laf:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            a.if r1 = a.Cif.f512a
            r1.getClass()
            java.lang.Object r0 = a.Cif.e(r0)
            return r0
        Lc0:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            a.if r1 = a.Cif.f512a
            r1.getClass()
            java.lang.Object r0 = a.Cif.e(r0)
            return r0
        Ld1:
            if (r23 != 0) goto Ld4
            r3 = r4
        Ld4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        Ld9:
            r0 = r23
            io.github.libxposed.api.XposedInterface$Chain r0 = (io.github.libxposed.api.XposedInterface.Chain) r0
            a.C0193i9.e(r0, r5)
            java.lang.Object r2 = r0.getThisObject()
            boolean r5 = r2 instanceof android.app.Activity
            if (r5 == 0) goto Leb
            android.app.Activity r2 = (android.app.Activity) r2
            goto Lec
        Leb:
            r2 = r1
        Lec:
            java.util.List r5 = r0.getArgs()
            java.lang.Object r5 = r5.get(r3)
            boolean r7 = r5 instanceof java.lang.String
            if (r7 == 0) goto Lfb
            java.lang.String r5 = (java.lang.String) r5
            goto Lfc
        Lfb:
            r5 = r1
        Lfc:
            if (r5 != 0) goto L100
            java.lang.String r5 = ""
        L100:
            r0.proceed()
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            java.lang.String r7 = r0.P
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L131
            if (r2 != 0) goto L118
            goto L1f7
        L118:
            r2.finish()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            a.l0 r1 = new a.l0
            r2 = 3
            r1.<init>(r2)
            r2 = 250(0xfa, double:1.235E-321)
            r0.postDelayed(r1, r2)
            goto L1f7
        L131:
            java.lang.String r0 = r0.Q
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L1f7
            boolean r0 = a.K3.a.l()
            if (r0 != 0) goto L141
            goto L1f7
        L141:
            a.Ue r0 = a.Ue.t
            if (r0 == 0) goto L1f2
            boolean r0 = a.K3.a.l()
            if (r0 != 0) goto L14d
            goto L1f2
        L14d:
            a.x8 r0 = a.C0460x8.f762a
            a.ca$b r5 = a.C0086ca.b.c
            a.ca$c r7 = a.C0086ca.c.c
            a.ca$b r8 = a.C0086ca.b.f424a
            a.ca$b r9 = a.C0086ca.b.b
            a.ca$b[] r8 = new a.C0086ca.b[]{r8, r9}
            java.util.Set r8 = a.C0282n9.z(r8)
            boolean r0 = r0.c(r5, r7, r8)
            if (r0 != 0) goto L186
            a.ca$b r0 = a.C0460x8.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "TempUnhideTrigger: command unhide BLOCKED (state="
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
            goto L1f2
        L186:
            java.lang.String r0 = "TempUnhideTrigger: command unhide triggered"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            a.C0453x1.b(r0)
            a.s4 r0 = a.C0366s4.I
            if (r0 == 0) goto L1f2
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = a.C0366s4.L
            long r9 = r7 - r9
            r11 = 500(0x1f4, double:2.47E-321)
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 >= 0) goto L1a7
            r5 = r4
            goto L1a8
        L1a7:
            r5 = r3
        L1a8:
            a.C0366s4.L = r7
            if (r5 != 0) goto L1ba
            a.s4$a$a$a r5 = a.C0366s4.a.C0005a.EnumC0006a.c
            a.k4 r7 = new a.k4
            r8 = 6
            r7.<init>(r0, r8)
            r0.y(r3, r5, r7)
            r0.z(r3, r5)
        L1ba:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.lang.Boolean> r3 = r0.n
            r3.clear()
            java.util.Map<java.lang.Object, java.lang.String> r3 = r0.w
            r3.clear()
            android.view.View r3 = r0.i
            if (r3 == 0) goto L1d0
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
        L1d0:
            java.lang.String r3 = "HideMainUI: onStateUnhideCommand immediate refresh rootView="
            java.lang.String r1 = a.C0487z.k(r3, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r4)
            a.C0453x1.b(r1)
            android.view.View r1 = r0.i
            if (r1 == 0) goto L1ef
            r0.d(r1)     // Catch: java.lang.Throwable -> L1eb
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1eb
            goto L1ef
        L1eb:
            r0 = move-exception
            a.C0465xd.a(r0)
        L1ef:
            a.C0366s4.x()
        L1f2:
            if (r2 == 0) goto L1f7
            r2.finish()
        L1f7:
            a.Wf r0 = a.Wf.f330a
            return r0
        L1fa:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.i = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L203:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.h = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L20c:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.g = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L215:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.e = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L21e:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.d = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L227:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.l = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L230:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.c = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L239:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.o = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L242:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.f = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L24b:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.n = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L254:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.m = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L25d:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.k = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L266:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.j = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L26f:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.Ed.b = r0
            a.Wf r0 = a.Wf.f330a
            return r0
        L278:
            r0 = r23
            a.r6 r0 = (a.C0350r6) r0
            a.C0193i9.e(r0, r2)
            a.Y4 r0 = r0.b()
            java.lang.String r0 = r0.b
            return r0
        L286:
            r0 = r23
            a.r6 r0 = (a.C0350r6) r0
            a.C0193i9.e(r0, r2)
            a.Y4 r0 = r0.b()
            java.lang.String r0 = r0.b
            return r0
        L294:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getName()
            return r0
        L29d:
            r1 = r23
            java.lang.Class r1 = (java.lang.Class) r1
            a.C0193i9.e(r1, r2)
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            a.C0193i9.d(r1, r0)
            int r0 = r1.length
            if (r0 != 0) goto L2b1
            a.a6 r0 = a.C0044a6.f396a
            goto L2b6
        L2b1:
            a.M1 r0 = new a.M1
            r0.<init>(r3, r1)
        L2b6:
            return r0
        L2b7:
            r0 = r23
            java.lang.Class r0 = (java.lang.Class) r0
            a.C0193i9.e(r0, r2)
            java.lang.Class r0 = r0.getSuperclass()
            return r0
        L2c3:
            r2 = r23
            a.fd r2 = (a.C0143fd) r2
            java.lang.String r5 = "ctx"
            a.C0193i9.e(r2, r5)
            a.Cd r5 = a.Cd.f49a
            r5.getClass()
            java.lang.Object r5 = a.C0043a5.f384a
            java.lang.String r7 = "sns_info_model"
            if (r5 == 0) goto L2e4
            java.lang.String r8 = "rule_class_"
            java.lang.String r8 = r8.concat(r7)
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            goto L2e5
        L2e4:
            r5 = r1
        L2e5:
            r8 = 28
            java.lang.ClassLoader r2 = r2.b
            if (r5 == 0) goto L2f9
            java.lang.Class r5 = a.Cd.g(r2, r5)
            if (r5 == 0) goto L2f9
            a.cd r0 = a.EnumC0089cd.c
            a.gd r0 = a.C0161gd.a.a(r5, r0, r1, r1, r8)
            goto L3bb
        L2f9:
            boolean r5 = a.C0435w1.H()
            a.cd r13 = a.EnumC0089cd.b
            if (r5 != 0) goto L322
            a.dd r14 = a.EnumC0107dd.b
            a.j6 r15 = new a.j6
            long r20 = java.lang.System.currentTimeMillis()
            java.lang.String r16 = "DK_NOT_READY"
            java.lang.String r17 = "sns_info_model"
            java.lang.String r18 = "DkBridge not initialized"
            java.lang.String r19 = ""
            r15.<init>(r16, r17, r18, r19, r20)
            a.gd r9 = new a.gd
            r12 = r15
            r15 = 0
            r16 = 0
            r10 = 0
            r11 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
        L31f:
            r0 = r9
            goto L3bb
        L322:
            java.lang.String r5 = "e4.p"
            java.util.List r5 = a.C0435w1.p(r5)     // Catch: java.lang.Exception -> L329
            goto L32b
        L329:
            a.Y5 r5 = a.Y5.f351a
        L32b:
            java.util.Iterator r5 = r5.iterator()
        L32f:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L375
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            a.Cd r10 = a.Cd.f49a
            r10.getClass()
            java.lang.Class r9 = a.Cd.g(r2, r9)
            if (r9 == 0) goto L36f
            java.lang.reflect.Method[] r10 = r9.getDeclaredMethods()
            a.C0193i9.d(r10, r0)
            int r11 = r10.length
            r12 = r3
        L34f:
            if (r12 >= r11) goto L36f
            r14 = r10[r12]
            java.lang.String r15 = r14.getName()
            java.lang.String r3 = "getCommentList"
            boolean r3 = a.C0193i9.a(r15, r3)
            if (r3 == 0) goto L36c
            java.lang.Class[] r3 = r14.getParameterTypes()
            java.lang.String r14 = "getParameterTypes(...)"
            a.C0193i9.d(r3, r14)
            int r3 = r3.length
            if (r3 != 0) goto L36c
            goto L370
        L36c:
            int r12 = r12 + r4
            r3 = 0
            goto L34f
        L36f:
            r9 = r1
        L370:
            if (r9 == 0) goto L373
            goto L376
        L373:
            r3 = 0
            goto L32f
        L375:
            r9 = r1
        L376:
            if (r9 == 0) goto L39b
            java.lang.String r0 = r9.getName()
            a.C0043a5.h(r7, r0)
            java.lang.String r0 = r9.getName()
            java.lang.String r2 = "SNS_INFO_MODEL_RESOLVED cls="
            java.lang.String r3 = " via=DkBridge"
            java.lang.String r0 = a.C0487z.g(r2, r0, r3)
            java.lang.String r2 = "RuleSystem"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            a.C0453x1.b(r0)
            a.cd r0 = a.EnumC0089cd.f426a
            a.gd r0 = a.C0161gd.a.a(r9, r0, r1, r1, r8)
            goto L3bb
        L39b:
            a.dd r14 = a.EnumC0107dd.c
            a.j6 r15 = new a.j6
            long r20 = java.lang.System.currentTimeMillis()
            java.lang.String r16 = "SNS_INFO_NOT_FOUND"
            java.lang.String r17 = "sns_info_model"
            java.lang.String r18 = "no class with getCommentList found"
            java.lang.String r19 = ""
            r15.<init>(r16, r17, r18, r19, r20)
            a.gd r9 = new a.gd
            r12 = r15
            r15 = 0
            r16 = 0
            r10 = 0
            r11 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L31f
        L3bb:
            return r0
    }
}
