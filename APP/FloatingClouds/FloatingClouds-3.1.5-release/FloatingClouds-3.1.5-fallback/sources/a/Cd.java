package a;

/* JADX INFO: loaded from: classes.dex */
public final class Cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Cd f49a = null;
    public static final java.util.LinkedHashMap b = null;

    static {
            a.Cd r0 = new a.Cd
            r0.<init>()
            a.Cd.f49a = r0
            java.lang.String r0 = "RuleSystem"
            java.lang.String r1 = "loaded"
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            a.C0453x1.b(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            a.Cd.b = r0
            return
    }

    public static a.C0161gd a(a.C0151g3 r21, a.C0143fd r22) {
            r1 = r21
            r0 = r22
            a.dd r5 = a.EnumC0107dd.c
            java.lang.String r2 = "RuleSystem"
            java.lang.String r3 = "rule"
            a.C0193i9.e(r1, r3)
            java.lang.String r3 = "ctx"
            a.C0193i9.e(r0, r3)
            java.lang.String r3 = r1.f479a
            java.lang.String r4 = "ruleId"
            a.C0193i9.e(r3, r4)
            java.lang.Object r4 = a.C0043a5.f384a
            r6 = 0
            if (r4 == 0) goto L2b
            java.lang.String r7 = "rule_class_"
            java.lang.String r7 = r7.concat(r3)
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            goto L2c
        L2b:
            r4 = r6
        L2c:
            r7 = 28
            java.lang.ClassLoader r0 = r0.b
            if (r4 == 0) goto L3f
            java.lang.Class r4 = g(r0, r4)
            if (r4 == 0) goto L3f
            a.cd r0 = a.EnumC0089cd.c
            a.gd r0 = a.C0161gd.a.a(r4, r0, r6, r6, r7)
            return r0
        L3f:
            boolean r4 = a.C0435w1.H()
            a.cd r12 = a.EnumC0089cd.b
            if (r4 != 0) goto L65
            a.dd r13 = a.EnumC0107dd.b
            a.j6 r0 = new a.j6
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = r1.f479a
            java.lang.String r3 = "DkBridge not initialized"
            java.lang.String r1 = "DK_NOT_READY"
            java.lang.String r4 = ""
            r0.<init>(r1, r2, r3, r4, r5)
            a.gd r8 = new a.gd
            r9 = 0
            r10 = 0
            r14 = 0
            r15 = 0
            r11 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L65:
            r4 = r12
            java.lang.String r8 = r1.b     // Catch: java.lang.Exception -> L165
            java.lang.String r9 = "."
            java.lang.String r8 = a.Be.S(r8, r9)     // Catch: java.lang.Exception -> L165
            java.util.List r8 = a.C0435w1.p(r8)     // Catch: java.lang.Exception -> L165
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L94
            a.j6 r3 = new a.j6
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.String r12 = r1.f479a
            java.lang.String r13 = "no class matched"
            java.lang.String r11 = "DEXKIT_NO_MATCH"
            java.lang.String r14 = ""
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            a.gd r0 = new a.gd
            r1 = 0
            r2 = 0
            r6 = 0
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L94:
            java.util.List<java.lang.String> r5 = r1.c
            boolean r9 = r5.isEmpty()
            if (r9 != 0) goto L107
            java.util.Iterator r9 = r8.iterator()
        La0:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lfa
            java.lang.Object r10 = r9.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            a.Cd r12 = a.Cd.f49a
            r12.getClass()
            java.lang.Class r11 = g(r0, r11)
            if (r11 == 0) goto Lf6
            java.lang.Class[] r11 = r11.getInterfaces()
            java.lang.String r12 = "getInterfaces(...)"
            a.C0193i9.d(r11, r12)
            int r12 = r11.length
            r13 = 0
            r14 = r13
        Lc4:
            if (r14 >= r12) goto Lf6
            r15 = r11[r14]
            boolean r16 = r5.isEmpty()
            if (r16 == 0) goto Lcf
            goto Lf0
        Lcf:
            java.util.Iterator r16 = r5.iterator()
        Ld3:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto Lf0
            java.lang.Object r17 = r16.next()
            r6 = r17
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r15.getName()
            boolean r6 = a.Be.I(r7, r6, r13)
            if (r6 == 0) goto Lec
            goto Lfb
        Lec:
            r6 = 0
            r7 = 28
            goto Ld3
        Lf0:
            int r14 = r14 + 1
            r6 = 0
            r7 = 28
            goto Lc4
        Lf6:
            r6 = 0
            r7 = 28
            goto La0
        Lfa:
            r10 = 0
        Lfb:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L10e
            java.lang.Object r5 = a.C0383t3.m0(r8)
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            goto L10e
        L107:
            java.lang.Object r5 = a.C0383t3.m0(r8)
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
        L10e:
            java.lang.Class r0 = g(r0, r10)
            if (r0 != 0) goto L13b
            a.dd r13 = a.EnumC0107dd.d
            a.j6 r14 = new a.j6
            java.lang.String r0 = "forName("
            java.lang.String r2 = ") failed"
            java.lang.String r17 = a.C0487z.g(r0, r10, r2)
            long r19 = java.lang.System.currentTimeMillis()
            java.lang.String r15 = "CLASS_LOAD_FAILED"
            java.lang.String r0 = r1.f479a
            java.lang.String r18 = ""
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19)
            a.gd r8 = new a.gd
            r9 = 0
            r10 = 0
            r11 = r14
            r14 = 0
            r15 = 0
            r12 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L13b:
            a.C0043a5.h(r3, r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "DEXKIT_PRIMARY rule="
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r3 = " cls="
            r1.append(r3)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            a.C0453x1.b(r1)
            a.cd r1 = a.EnumC0089cd.f426a
            r2 = 0
            r3 = 28
            a.gd r0 = a.C0161gd.a.a(r0, r1, r2, r2, r3)
            return r0
        L165:
            r0 = move-exception
            java.lang.String r6 = "DK_SEARCH_FAILED "
            java.lang.String r3 = r6.concat(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r0}
            a.C0453x1.a(r2)
            a.j6 r3 = new a.j6
            java.lang.String r2 = r0.getMessage()
            if (r2 != 0) goto L17d
            java.lang.String r2 = ""
        L17d:
            r9 = r2
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>()
            java.io.PrintWriter r6 = new java.io.PrintWriter
            r6.<init>(r2)
            r0.printStackTrace(r6)
            r6.flush()
            java.lang.String r10 = r2.toString()
            java.lang.String r0 = "toString(...)"
            a.C0193i9.d(r10, r0)
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "DK_SEARCH_FAILED"
            java.lang.String r8 = r1.f479a
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            a.gd r0 = new a.gd
            r1 = 0
            r2 = 0
            r6 = 0
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static boolean d(java.lang.Class r6) {
            java.lang.reflect.Method[] r6 = r6.getMethods()
            java.lang.String r0 = "getMethods(...)"
            a.C0193i9.d(r6, r0)
            int r0 = r6.length
            r1 = 0
            r2 = r1
        Lc:
            if (r2 >= r0) goto L45
            r3 = r6[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "k"
            boolean r4 = a.C0193i9.a(r4, r5)
            if (r4 == 0) goto L42
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r4 = r4.length
            r5 = 2
            if (r4 != r5) goto L42
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4 = r4[r1]
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r4 = a.C0193i9.a(r4, r5)
            if (r4 == 0) goto L42
            java.lang.Class[] r3 = r3.getParameterTypes()
            r4 = 1
            r3 = r3[r4]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r3 = a.C0193i9.a(r3, r5)
            if (r3 == 0) goto L42
            return r4
        L42:
            int r2 = r2 + 1
            goto Lc
        L45:
            return r1
    }

    public static boolean e(java.lang.String r2) {
            r0 = 47
            r1 = 46
            java.lang.String r2 = a.Ae.F(r2, r0, r1)
            java.lang.String r0 = "java.util.ArrayList"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "ArrayList;"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = ".ArrayList"
            boolean r2 = r2.endsWith(r0)
            if (r2 == 0) goto L21
            goto L23
        L21:
            r2 = 0
            return r2
        L23:
            r2 = 1
            return r2
    }

    public static boolean f(java.lang.Class r2) {
            java.lang.Class<android.widget.ListAdapter> r0 = android.widget.ListAdapter.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L9
            goto L3a
        L9:
            java.lang.Class<android.widget.BaseAdapter> r0 = android.widget.BaseAdapter.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L12
            goto L3a
        L12:
            if (r2 == 0) goto L3c
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3c
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "android.widget.BaseAdapter"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3a
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "android.widget.ListAdapter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            goto L3a
        L35:
            java.lang.Class r2 = r2.getSuperclass()
            goto L12
        L3a:
            r2 = 1
            return r2
        L3c:
            r2 = 0
            return r2
    }

    public static java.lang.Class g(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.Exception -> L6
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static java.util.List h() {
            java.lang.String r0 = "com.tencent.mm.plugin.mvvmlist.MvvmList"
            a.Y5 r1 = a.Y5.f351a
            java.lang.String r2 = "RuleSystem"
            r3 = 0
            r4 = 8
            java.lang.String r5 = "void"
            java.lang.String r6 = "java.util.List"
            java.lang.String r7 = "boolean"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Exception -> L1c
            java.util.List r6 = a.C0294o3.d0(r6)     // Catch: java.lang.Exception -> L1c
            java.util.List r5 = a.C0435w1.x(r0, r5, r6, r3, r4)     // Catch: java.lang.Exception -> L1c
            goto L27
        L1c:
            r5 = move-exception
            java.lang.String r6 = "DK_SEARCH_FAILED F004_contact_list_fields submitReset(JVM)"
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r6, r5}
            a.C0453x1.a(r5)
            r5 = r1
        L27:
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L2e
            return r5
        L2e:
            java.lang.String r5 = "V"
            java.lang.String r6 = "Ljava/util/List;"
            java.lang.String r7 = "Z"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}     // Catch: java.lang.Exception -> L41
            java.util.List r6 = a.C0294o3.d0(r6)     // Catch: java.lang.Exception -> L41
            java.util.List r1 = a.C0435w1.x(r0, r5, r6, r3, r4)     // Catch: java.lang.Exception -> L41
            goto L4b
        L41:
            r0 = move-exception
            java.lang.String r3 = "DK_SEARCH_FAILED F004_contact_list_fields submitReset(desc)"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r3, r0}
            a.C0453x1.a(r0)
        L4b:
            return r1
    }

    public static a.Hf j(java.lang.ClassLoader r10, java.util.List r11, java.util.List r12, java.lang.Class r13, java.lang.Class r14, java.lang.Class r15) {
            java.util.Iterator r11 = r11.iterator()
        L4:
            boolean r0 = r11.hasNext()
            a.Cd r1 = a.Cd.f49a
            r2 = 0
            if (r0 == 0) goto L27
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.getClass()
            java.lang.Class r0 = g(r10, r0)
            if (r0 == 0) goto L23
            boolean r3 = f(r0)
            if (r3 == 0) goto L23
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 == 0) goto L4
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 != 0) goto L3d
            if (r13 == 0) goto L3c
            r1.getClass()
            boolean r11 = f(r13)
            if (r11 == 0) goto L37
            r11 = r13
            goto L38
        L37:
            r11 = r2
        L38:
            if (r11 != 0) goto L3b
            goto L3c
        L3b:
            r13 = r11
        L3c:
            r0 = r13
        L3d:
            java.util.Iterator r11 = r12.iterator()
        L41:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L61
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            r1.getClass()
            java.lang.Class r12 = g(r10, r12)
            if (r12 == 0) goto L5d
            boolean r13 = d(r12)
            if (r13 == 0) goto L5d
            goto L5e
        L5d:
            r12 = r2
        L5e:
            if (r12 == 0) goto L41
            goto L62
        L61:
            r12 = r2
        L62:
            if (r12 != 0) goto L6d
            if (r14 == 0) goto L6d
            boolean r11 = d(r14)
            if (r11 == 0) goto L6d
            r12 = r14
        L6d:
            if (r12 != 0) goto L70
            goto L71
        L70:
            r14 = r12
        L71:
            r11 = 1
            java.lang.Class<java.util.List> r12 = java.util.List.class
            r13 = 0
            if (r0 == 0) goto Lf2
            java.lang.String r3 = r0.getName()
            r1.getClass()
            java.lang.String r1 = a.Be.U(r3, r3)
            int r4 = r1.length()
            if (r4 != 0) goto L8a
            goto Lf2
        L8a:
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L91
            goto Lf2
        L91:
            java.util.List r1 = a.C0435w1.q(r1)     // Catch: java.lang.Exception -> L96
            goto L98
        L96:
            a.Y5 r1 = a.Y5.f351a
        L98:
            java.util.Iterator r1 = r1.iterator()
        L9c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lf2
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Class r3 = g(r10, r3)
            if (r3 == 0) goto Lee
            java.lang.reflect.Method[] r4 = r3.getDeclaredMethods()
            java.lang.String r5 = "getDeclaredMethods(...)"
            a.C0193i9.d(r4, r5)
            int r5 = r4.length
            r6 = r13
        Lb9:
            if (r6 >= r5) goto Lee
            r7 = r4[r6]
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            if (r8 != r11) goto Leb
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8 = r8[r13]
            boolean r8 = r8.isPrimitive()
            if (r8 != 0) goto Leb
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8 = r8[r13]
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r8 = a.C0193i9.a(r8, r9)
            if (r8 != 0) goto Leb
            java.lang.Class[] r7 = r7.getParameterTypes()
            r7 = r7[r13]
            boolean r7 = r12.isAssignableFrom(r7)
            if (r7 == 0) goto Leb
            goto Lef
        Leb:
            int r6 = r6 + 1
            goto Lb9
        Lee:
            r3 = r2
        Lef:
            if (r3 == 0) goto L9c
            r2 = r3
        Lf2:
            if (r2 != 0) goto L129
            if (r15 == 0) goto L129
            java.lang.reflect.Method[] r10 = r15.getMethods()
            java.lang.String r1 = "getMethods(...)"
            a.C0193i9.d(r10, r1)
            int r1 = r10.length
            r3 = r13
        L101:
            if (r3 >= r1) goto L129
            r4 = r10[r3]
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "a"
            boolean r5 = a.C0193i9.a(r5, r6)
            if (r5 == 0) goto L126
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            if (r5 != r11) goto L126
            java.lang.Class[] r4 = r4.getParameterTypes()
            r4 = r4[r13]
            boolean r4 = r12.isAssignableFrom(r4)
            if (r4 == 0) goto L126
            r2 = r15
            goto L129
        L126:
            int r3 = r3 + 1
            goto L101
        L129:
            if (r2 != 0) goto L12c
            goto L12d
        L12c:
            r15 = r2
        L12d:
            a.Hf r10 = new a.Hf
            r10.<init>(r0, r14, r15)
            return r10
    }

    public static boolean k(java.lang.Class r11, java.lang.String r12) {
            int r0 = r12.length()
            r1 = 1
            if (r0 != 0) goto L9
            goto Lbe
        L9:
            java.lang.String r0 = "void"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L18
            java.lang.Class r12 = java.lang.Void.TYPE
            boolean r11 = a.C0193i9.a(r11, r12)
            return r11
        L18:
            a.mc r2 = new a.mc
            java.lang.String r0 = "I"
            java.lang.String r3 = "int"
            r2.<init>(r0, r3)
            a.mc r3 = new a.mc
            java.lang.String r0 = "Z"
            java.lang.String r4 = "boolean"
            r3.<init>(r0, r4)
            a.mc r4 = new a.mc
            java.lang.String r0 = "J"
            java.lang.String r5 = "long"
            r4.<init>(r0, r5)
            a.mc r5 = new a.mc
            java.lang.String r0 = "D"
            java.lang.String r6 = "double"
            r5.<init>(r0, r6)
            a.mc r6 = new a.mc
            java.lang.String r0 = "F"
            java.lang.String r7 = "float"
            r6.<init>(r0, r7)
            a.mc r7 = new a.mc
            java.lang.String r0 = "B"
            java.lang.String r8 = "byte"
            r7.<init>(r0, r8)
            a.mc r8 = new a.mc
            java.lang.String r0 = "C"
            java.lang.String r9 = "char"
            r8.<init>(r0, r9)
            a.mc r9 = new a.mc
            java.lang.String r0 = "S"
            java.lang.String r10 = "short"
            r9.<init>(r0, r10)
            a.mc[] r0 = new a.C0267mc[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.Map r0 = a.C0067ba.E(r0)
            java.lang.String r2 = "["
            java.lang.String r3 = a.Be.S(r12, r2)
            java.lang.String r4 = ";"
            boolean r4 = r3.endsWith(r4)
            r5 = 0
            if (r4 == 0) goto L85
            int r4 = r3.length()
            int r4 = r4 - r1
            java.lang.String r3 = r3.substring(r5, r4)
            java.lang.String r4 = "substring(...)"
            a.C0193i9.d(r3, r4)
        L85:
            r4 = 47
            java.lang.String r3 = a.Be.T(r3, r4)
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L94
            goto L95
        L94:
            r3 = r0
        L95:
            boolean r12 = a.Ae.H(r12, r2, r5)
            boolean r0 = r11.isArray()
            if (r12 != r0) goto La1
            r12 = r1
            goto La2
        La1:
            r12 = r5
        La2:
            boolean r0 = r11.isArray()
            r2 = 46
            if (r0 == 0) goto Lae
            java.lang.Class r11 = r11.getComponentType()
        Lae:
            java.lang.String r11 = r11.getName()
            java.lang.String r11 = a.Be.T(r11, r2)
            if (r12 == 0) goto Lbf
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Lbf
        Lbe:
            return r1
        Lbf:
            return r5
    }

    public final a.C0161gd b(a.C0338qb r23, a.C0143fd r24) {
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = 0
            r3 = 1
            java.lang.String r4 = "ctx"
            a.C0193i9.e(r1, r4)
            java.lang.String r4 = r0.e
            r5 = r22
            a.md r6 = r5.c(r4)
            boolean r7 = r6 instanceof a.C0151g3
            if (r7 == 0) goto L1a
            a.g3 r6 = (a.C0151g3) r6
            goto L1b
        L1a:
            r6 = 0
        L1b:
            a.cd r13 = a.EnumC0089cd.b
            a.dd r14 = a.EnumC0107dd.c
            if (r6 != 0) goto L46
            a.j6 r15 = new a.j6
            java.lang.String r1 = "declaredClassRuleId="
            java.lang.String r2 = " not registered"
            java.lang.String r18 = a.C0487z.g(r1, r4, r2)
            long r20 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r0.f656a
            java.lang.String r19 = ""
            java.lang.String r16 = "NO_CLASS_RULE"
            r17 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            a.gd r9 = new a.gd
            r10 = 0
            r11 = 0
            r12 = r15
            r15 = 0
            r16 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L46:
            a.gd r1 = a(r6, r1)
            boolean r4 = r1.f485a
            if (r4 == 0) goto L1b0
            java.lang.Class<?> r1 = r1.b
            if (r1 != 0) goto L54
            goto L1b0
        L54:
            boolean r4 = r0.g
            if (r4 == 0) goto L76
            a.kd r4 = new a.kd
            r4.<init>(r3)
            a.T7 r6 = new a.T7
            a.A3 r7 = new a.A3
            r9 = 6
            r7.<init>(r9, r1)
            r6.<init>(r7, r4)
            a.kd r4 = new a.kd
            r7 = 2
            r4.<init>(r7)
            a.C6 r7 = new a.C6
            a.Td r9 = a.Td.i
            r7.<init>(r6, r4)
            goto L8c
        L76:
            java.lang.reflect.Method[] r4 = r1.getDeclaredMethods()
            java.lang.String r6 = "getDeclaredMethods(...)"
            a.C0193i9.d(r4, r6)
            int r6 = r4.length
            if (r6 != 0) goto L86
            a.a6 r4 = a.C0044a6.f396a
            r7 = r4
            goto L8c
        L86:
            a.M1 r6 = new a.M1
            r6.<init>(r2, r4)
            r7 = r6
        L8c:
            java.util.Iterator r4 = r7.iterator()
        L90:
            boolean r6 = r4.hasNext()
            java.lang.String r7 = "getParameterTypes(...)"
            java.util.List<java.lang.String> r9 = r0.c
            java.lang.String r10 = r0.b
            if (r6 == 0) goto L11f
            java.lang.Object r6 = r4.next()
            r11 = r6
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Class r12 = r11.getReturnType()
            java.lang.String r15 = "getReturnType(...)"
            a.C0193i9.d(r12, r15)
            a.Cd r15 = a.Cd.f49a
            r15.getClass()
            boolean r12 = k(r12, r10)
            if (r12 == 0) goto L11c
            java.lang.Class[] r12 = r11.getParameterTypes()
            a.C0193i9.d(r12, r7)
            int r15 = r9.size()
            int r8 = r12.length
            if (r15 == r8) goto Lc6
            goto L11c
        Lc6:
            a.f9 r8 = new a.f9
            int r15 = r9.size()
            int r15 = r15 - r3
            r8.<init>(r2, r15, r3)
            boolean r15 = r8 instanceof java.util.Collection
            if (r15 == 0) goto Lde
            r15 = r8
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto Lde
            goto L103
        Lde:
            java.util.Iterator r8 = r8.iterator()
        Le2:
            r15 = r8
            a.e9 r15 = (a.C0121e9) r15
            boolean r15 = r15.c
            if (r15 == 0) goto L103
            r15 = r8
            a.c9 r15 = (a.AbstractC0085c9) r15
            int r15 = r15.a()
            java.lang.Object r17 = r9.get(r15)
            r3 = r17
            java.lang.String r3 = (java.lang.String) r3
            r15 = r12[r15]
            boolean r3 = k(r15, r3)
            if (r3 != 0) goto L101
            goto L11c
        L101:
            r3 = 1
            goto Le2
        L103:
            java.lang.String r3 = r0.d
            int r8 = r3.length()
            if (r8 != 0) goto L10c
            goto L120
        L10c:
            java.lang.String r8 = r11.getName()
            java.lang.String r11 = "getName(...)"
            a.C0193i9.d(r8, r11)
            boolean r3 = a.Be.I(r8, r3, r2)
            if (r3 == 0) goto L11c
            goto L120
        L11c:
            r3 = 1
            goto L90
        L11f:
            r6 = 0
        L120:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L180
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = r6.getName()
            java.lang.Class[] r4 = r6.getParameterTypes()
            a.C0193i9.d(r4, r7)
            a.kd r7 = new a.kd
            r8 = 3
            r7.<init>(r8)
            r8 = 31
            r9 = 0
            java.lang.String r4 = a.N1.e0(r4, r9, r7, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "METHOD_RESOLVED rule="
            r7.<init>(r8)
            java.lang.String r0 = r0.f656a
            r7.append(r0)
            java.lang.String r0 = " class="
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = " method="
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = "("
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = ")"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r2 = "RuleSystem"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            a.C0453x1.b(r0)
            a.cd r0 = a.EnumC0089cd.f426a
            r2 = 20
            r9 = 0
            a.gd r0 = a.C0161gd.a.a(r1, r0, r6, r9, r2)
            return r0
        L180:
            a.j6 r6 = new a.j6
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "no method in "
            java.lang.String r3 = " matches returnType="
            java.lang.String r4 = " params="
            java.lang.StringBuilder r1 = a.C0487z.i(r2, r1, r3, r10, r4)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = r0.f656a
            java.lang.String r10 = ""
            java.lang.String r7 = "METHOD_NOT_FOUND"
            r6.<init>(r7, r8, r9, r10, r11)
            a.gd r9 = new a.gd
            r10 = 0
            r11 = 0
            r15 = 0
            r16 = 0
            r12 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
        L1b0:
            a.j6 r15 = new a.j6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "declared class "
            r1.<init>(r2)
            java.lang.String r2 = r6.b
            java.lang.String r3 = " unresolved"
            java.lang.String r18 = a.C0487z.h(r1, r2, r3)
            long r20 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r0.f656a
            java.lang.String r19 = ""
            java.lang.String r16 = "CLASS_UNRESOLVED"
            r17 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            a.gd r9 = new a.gd
            r10 = 0
            r11 = 0
            r12 = r15
            r15 = 0
            r16 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return r9
    }

    public final synchronized a.InterfaceC0268md c(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "ruleId"
            a.C0193i9.e(r2, r0)     // Catch: java.lang.Throwable -> L10
            java.util.LinkedHashMap r0 = a.Cd.b     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L10
            a.md r2 = (a.InterfaceC0268md) r2     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r2
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public final synchronized void i(a.InterfaceC0268md r6) {
            r5 = this;
            java.lang.String r0 = "REGISTER ruleId="
            java.lang.String r1 = "register() called ruleId="
            monitor-enter(r5)
            java.lang.String r2 = "rule"
            a.C0193i9.e(r6, r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "RuleSystem"
            java.lang.String r3 = r6.a()     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L57
            r4.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}     // Catch: java.lang.Throwable -> L57
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L57
            java.util.LinkedHashMap r1 = a.Cd.b     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L57
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "RuleSystem"
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L57
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L57
            r3.append(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = " type="
            r3.append(r0)     // Catch: java.lang.Throwable -> L57
            r3.append(r6)     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r6}     // Catch: java.lang.Throwable -> L57
            a.C0453x1.b(r6)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r5)
            return
        L57:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L57
            throw r6
    }
}
