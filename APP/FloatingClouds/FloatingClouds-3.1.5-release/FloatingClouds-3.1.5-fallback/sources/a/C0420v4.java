package a;

/* JADX INFO: renamed from: a.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0420v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0420v4 f731a = null;
    public static volatile boolean b;

    static {
            a.v4 r0 = new a.v4
            r0.<init>()
            a.C0420v4.f731a = r0
            return
    }

    public static void a(java.lang.Class r9, java.lang.String r10) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n"
            java.lang.String r10 = a.C0487z.f(r10, r1)
            r0.<init>(r10)
            a.g2 r10 = new a.g2
            r1 = 7
            r10.<init>(r1)
            a.T7 r1 = new a.T7
            a.A3 r2 = new a.A3
            r3 = 6
            r2.<init>(r3, r9)
            r1.<init>(r2, r10)
            java.util.Iterator r9 = r1.iterator()
        L20:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L9f
            java.lang.Object r10 = r9.next()
            java.lang.Class r10 = (java.lang.Class) r10
            java.lang.String r1 = r10.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "--- "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " ---\n"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()
            java.lang.String r1 = "getDeclaredMethods(...)"
            a.C0193i9.d(r10, r1)
            int r1 = r10.length
            r2 = 0
        L51:
            if (r2 >= r1) goto L20
            r3 = r10[r2]
            java.lang.Class r4 = r3.getReturnType()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r3.getName()
            java.lang.Class[] r3 = r3.getParameterTypes()
            java.lang.String r6 = "getParameterTypes(...)"
            a.C0193i9.d(r3, r6)
            a.g2 r6 = new a.g2
            r7 = 8
            r6.<init>(r7)
            r7 = 31
            r8 = 0
            java.lang.String r3 = a.N1.e0(r3, r8, r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = " "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = "("
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = ")\n"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r0.append(r3)
            int r2 = r2 + 1
            goto L51
        L9f:
            java.lang.String r9 = "ConvMuteRuleRegistrar"
            java.lang.String r10 = r0.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10}
            a.C0453x1.a(r9)
            return
    }

    public static void b(java.lang.ClassLoader r24) {
            r1 = r24
            java.lang.String r2 = "."
            java.lang.String r3 = "L"
            java.lang.String r4 = "register convGetter OK: "
            java.lang.String r0 = "cl"
            a.C0193i9.e(r1, r0)
            boolean r0 = a.C0420v4.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "register() called registered="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " cl="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "ConvMuteRuleRegistrar"
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}
            a.C0453x1.b(r0)
            boolean r0 = a.C0420v4.b
            if (r0 == 0) goto L3c
            java.lang.String r0 = "register() already registered, skip"
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}
            a.C0453x1.b(r0)
            return
        L3c:
            a.fd r6 = new a.fd
            int r0 = a.B1.f21a
            r7 = 1
            r8 = -1
            if (r0 != r8) goto L65
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L57
            a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L57
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L57
            java.lang.String r9 = "com.tencent.mm"
            r10 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r9, r10)     // Catch: java.lang.Exception -> L57
            int r8 = r0.versionCode     // Catch: java.lang.Exception -> L57
            goto L63
        L57:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.a(r0)
        L63:
            a.B1.f21a = r8
        L65:
            int r0 = a.B1.f21a
            r6.<init>(r0, r1)
            a.Cd r0 = a.Cd.f49a     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "wx8076_conv_getter"
            a.md r1 = r0.c(r1)     // Catch: java.lang.Throwable -> L7a
            boolean r8 = r1 instanceof a.C0338qb     // Catch: java.lang.Throwable -> L7a
            r9 = 0
            if (r8 == 0) goto L7d
            a.qb r1 = (a.C0338qb) r1     // Catch: java.lang.Throwable -> L7a
            goto L7e
        L7a:
            r0 = move-exception
            goto L238
        L7d:
            r1 = r9
        L7e:
            if (r1 == 0) goto L230
            a.gd r1 = r0.b(r1, r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.reflect.Method r1 = r1.f     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L228
            java.lang.Class r8 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.Class r10 = r1.getReturnType()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r11 = r8.getName()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r12 = r10.getName()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = r1.getName()     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r14.<init>(r4)     // Catch: java.lang.Throwable -> L7a
            r14.append(r11)     // Catch: java.lang.Throwable -> L7a
            r14.append(r2)     // Catch: java.lang.Throwable -> L7a
            r14.append(r13)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "(String) -> "
            r14.append(r4)     // Catch: java.lang.Throwable -> L7a
            r14.append(r12)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = r14.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}     // Catch: java.lang.Throwable -> L7a
            a.C0453x1.b(r4)     // Catch: java.lang.Throwable -> L7a
            a.g3 r4 = new a.g3     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = "wx8076_mute_storage_class"
            r14 = 80
            r15 = 12
            r4.<init>(r13, r11, r14, r15)     // Catch: java.lang.Throwable -> L7a
            a.g3 r13 = new a.g3     // Catch: java.lang.Throwable -> L7a
            r16 = r7
            java.lang.String r7 = "wx8076_mute_model_class"
            r13.<init>(r7, r12, r14, r15)     // Catch: java.lang.Throwable -> L7a
            r0.i(r4)     // Catch: java.lang.Throwable -> L7a
            r0.i(r13)     // Catch: java.lang.Throwable -> L7a
            a.qb r17 = new a.qb     // Catch: java.lang.Throwable -> L7a
            java.lang.String r18 = "wx8076_mute_getter"
            java.lang.String r19 = "boolean"
            a.Y5 r20 = a.Y5.f351a     // Catch: java.lang.Throwable -> L7a
            java.lang.String r21 = ""
            java.lang.String r22 = "wx8076_mute_model_class"
            r23 = 1
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L7a
            r0 = r17
            a.qb r17 = new a.qb     // Catch: java.lang.Throwable -> L7a
            java.lang.String r18 = "wx8076_mute_setter"
            java.lang.String r19 = "void"
            java.lang.String r4 = "I"
            java.util.List r20 = a.C0435w1.K(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r21 = ""
            java.lang.String r22 = "wx8076_mute_model_class"
            r23 = 1
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L7a
            r4 = r17
            java.lang.String r7 = "/"
            java.lang.String r2 = a.Ae.G(r12, r2, r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L7a
            r7.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = ";"
            r7.append(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L7a
            a.qb r17 = new a.qb     // Catch: java.lang.Throwable -> L7a
            java.lang.String r18 = "wx8076_conv_persist"
            java.lang.String r19 = "int"
            java.lang.String r3 = "Ljava/lang/String;"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L7a
            java.util.List r20 = a.C0294o3.d0(r2)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r21 = "W"
            java.lang.String r22 = "wx8076_mute_storage_class"
            r23 = 1
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L7a
            r2 = r17
            a.qb[] r3 = new a.C0338qb[]{r0, r4, r2}     // Catch: java.lang.Throwable -> L7a
            java.util.List r3 = a.C0294o3.d0(r3)     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L7a
        L13f:
            boolean r7 = r3.hasNext()     // Catch: java.lang.Throwable -> L7a
            if (r7 == 0) goto L151
            java.lang.Object r7 = r3.next()     // Catch: java.lang.Throwable -> L7a
            a.qb r7 = (a.C0338qb) r7     // Catch: java.lang.Throwable -> L7a
            a.Cd r13 = a.Cd.f49a     // Catch: java.lang.Throwable -> L7a
            r13.i(r7)     // Catch: java.lang.Throwable -> L7a
            goto L13f
        L151:
            a.Cd r3 = a.Cd.f49a     // Catch: java.lang.Throwable -> L7a
            a.gd r0 = r3.b(r0, r6)     // Catch: java.lang.Throwable -> L7a
            a.gd r4 = r3.b(r4, r6)     // Catch: java.lang.Throwable -> L7a
            a.gd r2 = r3.b(r2, r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L7a
            java.lang.reflect.Method r3 = r0.f     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L16c
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L7a
            goto L16d
        L16c:
            r3 = r9
        L16d:
            java.lang.reflect.Method r6 = r4.f     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L176
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L7a
            goto L177
        L176:
            r6 = r9
        L177:
            java.lang.reflect.Method r7 = r2.f     // Catch: java.lang.Throwable -> L7a
            if (r7 == 0) goto L17f
            java.lang.String r9 = r7.getName()     // Catch: java.lang.Throwable -> L7a
        L17f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r7.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = "register rules executed storage="
            r7.append(r13)     // Catch: java.lang.Throwable -> L7a
            r7.append(r11)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = " model="
            r7.append(r13)     // Catch: java.lang.Throwable -> L7a
            r7.append(r12)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r13 = " convGetter="
            r7.append(r13)     // Catch: java.lang.Throwable -> L7a
            r7.append(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = " muteGetter="
            r7.append(r1)     // Catch: java.lang.Throwable -> L7a
            r7.append(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = " muteSetter="
            r7.append(r1)     // Catch: java.lang.Throwable -> L7a
            r7.append(r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = " persist="
            r7.append(r1)     // Catch: java.lang.Throwable -> L7a
            r7.append(r9)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1}     // Catch: java.lang.Throwable -> L7a
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.reflect.Method r0 = r0.f     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L1da
            java.lang.reflect.Method r1 = r4.f     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L1da
            java.lang.reflect.Method r1 = r2.f     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L1cc
            goto L1da
        L1cc:
            a.C0420v4.b = r16     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "register() SUCCESS"
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r0}     // Catch: java.lang.Throwable -> L7a
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L7a
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L7a
            goto L23c
        L1da:
            if (r0 != 0) goto L1f0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "muteGetter not found on "
            r0.append(r1)     // Catch: java.lang.Throwable -> L7a
            r0.append(r12)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7a
            a(r10, r0)     // Catch: java.lang.Throwable -> L7a
        L1f0:
            java.lang.reflect.Method r0 = r4.f     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L208
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "muteSetter not found on "
            r0.append(r1)     // Catch: java.lang.Throwable -> L7a
            r0.append(r12)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7a
            a(r10, r0)     // Catch: java.lang.Throwable -> L7a
        L208:
            java.lang.reflect.Method r0 = r2.f     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L220
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r0.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "persist not found on "
            r0.append(r1)     // Catch: java.lang.Throwable -> L7a
            r0.append(r11)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L7a
            a(r8, r0)     // Catch: java.lang.Throwable -> L7a
        L220:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "mute rules partially unresolved"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L7a
        L228:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "wx8076_conv_getter method unresolved"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L7a
        L230:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "wx8076_conv_getter not registered"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            throw r0     // Catch: java.lang.Throwable -> L7a
        L238:
            a.wd$a r0 = a.C0465xd.a(r0)
        L23c:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L24b
            java.lang.String r1 = "register() FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r5, r1, r0}
            a.C0453x1.a(r0)
        L24b:
            return
    }
}
