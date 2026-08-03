package m8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f8779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f8780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f8781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f8782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f8783f;

    public c() {
            r2 = this;
            r2.<init>()
            r0 = 32
            v1.l[] r1 = new v1.l[r0]
            r2.f8779b = r1
            float[] r1 = new float[r0]
            r2.f8780c = r1
            byte[] r0 = new byte[r0]
            r2.f8781d = r0
            f.l0 r0 = f.s0.f2899a
            f.l0 r0 = new f.l0
            r0.<init>()
            r2.f8782e = r0
            f.l0 r0 = new f.l0
            r0.<init>()
            r2.f8783f = r0
            return
    }

    public c(java.io.StringWriter r4, int r5, int r6, java.lang.String r7) {
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L45
            r0 = 1
            if (r5 < r0) goto L3e
            if (r6 < r0) goto L37
            java.io.StringWriter r0 = new java.io.StringWriter
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.<init>(r1)
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>(r1)
            r3.f8779b = r4
            r3.f8778a = r5
            java.lang.StringBuffer r4 = r0.getBuffer()
            r3.f8780c = r4
            java.lang.StringBuffer r4 = r2.getBuffer()
            r3.f8781d = r4
            z4.f r4 = new z4.f
            java.lang.String r1 = ""
            r4.<init>(r0, r5, r1)
            r3.f8782e = r4
            z4.f r4 = new z4.f
            r4.<init>(r2, r6, r7)
            r3.f8783f = r4
            return
        L37:
            java.lang.String r4 = "rightWidth < 1"
            j8.o.t(r4)
            r4 = 0
            throw r4
        L3e:
            java.lang.String r4 = "leftWidth < 1"
            j8.o.t(r4)
            r4 = 0
            throw r4
        L45:
            java.lang.String r4 = "out == null"
            bsh.j.c(r4)
            r4 = 0
            throw r4
    }

    public c(java.math.BigInteger r9) {
            r8 = this;
            r8.<init>()
            java.math.BigInteger r0 = new java.math.BigInteger
            java.lang.String r1 = "ffffffffffffffff"
            r2 = 16
            r0.<init>(r1, r2)
            r8.f8779b = r0
            r0 = 8
            java.math.BigInteger[] r1 = new java.math.BigInteger[r0]
            r3 = 0
            r4 = r3
        L14:
            if (r4 >= r0) goto L22
            java.math.BigInteger r5 = new java.math.BigInteger
            java.lang.String r6 = "9e3779b97f4a7c13"
            r5.<init>(r6, r2)
            r1[r4] = r5
            int r4 = r4 + 1
            goto L14
        L22:
            r8.f8780c = r1
            r1 = 256(0x100, float:3.59E-43)
            java.math.BigInteger[] r2 = new java.math.BigInteger[r1]
            r4 = r3
        L29:
            if (r4 >= r1) goto L35
            java.math.BigInteger r5 = java.math.BigInteger.ZERO
            r5.getClass()
            r2[r4] = r5
            int r4 = r4 + 1
            goto L29
        L35:
            r8.f8781d = r2
            java.math.BigInteger[] r2 = new java.math.BigInteger[r1]
            r4 = r3
        L3a:
            if (r4 >= r1) goto L46
            java.math.BigInteger r5 = java.math.BigInteger.ZERO
            r5.getClass()
            r2[r4] = r5
            int r4 = r4 + 1
            goto L3a
        L46:
            r8.f8782e = r2
            java.math.BigInteger[] r2 = new java.math.BigInteger[r1]
            r4 = r3
        L4b:
            if (r4 >= r1) goto L57
            java.math.BigInteger r5 = java.math.BigInteger.ZERO
            r5.getClass()
            r2[r4] = r5
            int r4 = r4 + 1
            goto L4b
        L57:
            r8.f8783f = r2
            r2 = 255(0xff, float:3.57E-43)
            r8.f8778a = r2
            java.lang.Object r2 = r8.f8781d
            java.math.BigInteger[] r2 = (java.math.BigInteger[]) r2
            r2[r3] = r9
            r9 = r3
        L64:
            r2 = 4
            if (r9 >= r2) goto L71
            java.lang.Object r2 = r8.f8780c
            java.math.BigInteger[] r2 = (java.math.BigInteger[]) r2
            r8.g(r2)
            int r9 = r9 + 1
            goto L64
        L71:
            r9 = r3
        L72:
            if (r9 >= r1) goto Lb3
            r2 = r3
        L75:
            java.lang.Object r4 = r8.f8780c
            java.math.BigInteger[] r4 = (java.math.BigInteger[]) r4
            if (r2 < r0) goto L95
            r8.g(r4)
            r2 = r3
        L7f:
            if (r2 < r0) goto L84
            int r9 = r9 + 8
            goto L72
        L84:
            java.lang.Object r4 = r8.f8782e
            java.math.BigInteger[] r4 = (java.math.BigInteger[]) r4
            int r5 = r9 + r2
            java.lang.Object r6 = r8.f8780c
            java.math.BigInteger[] r6 = (java.math.BigInteger[]) r6
            r6 = r6[r2]
            r4[r5] = r6
            int r2 = r2 + 1
            goto L7f
        L95:
            r5 = r4[r2]
            java.lang.Object r6 = r8.f8781d
            java.math.BigInteger[] r6 = (java.math.BigInteger[]) r6
            int r7 = r9 + r2
            r6 = r6[r7]
            java.math.BigInteger r5 = r5.add(r6)
            java.lang.Object r6 = r8.f8779b
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            java.math.BigInteger r5 = r5.and(r6)
            r5.getClass()
            r4[r2] = r5
            int r2 = r2 + 1
            goto L75
        Lb3:
            r9 = r3
        Lb4:
            if (r9 >= r1) goto Lf5
            r2 = r3
        Lb7:
            java.lang.Object r4 = r8.f8780c
            java.math.BigInteger[] r4 = (java.math.BigInteger[]) r4
            if (r2 < r0) goto Ld7
            r8.g(r4)
            r2 = r3
        Lc1:
            if (r2 < r0) goto Lc6
            int r9 = r9 + 8
            goto Lb4
        Lc6:
            java.lang.Object r4 = r8.f8782e
            java.math.BigInteger[] r4 = (java.math.BigInteger[]) r4
            int r5 = r9 + r2
            java.lang.Object r6 = r8.f8780c
            java.math.BigInteger[] r6 = (java.math.BigInteger[]) r6
            r6 = r6[r2]
            r4[r5] = r6
            int r2 = r2 + 1
            goto Lc1
        Ld7:
            r5 = r4[r2]
            java.lang.Object r6 = r8.f8782e
            java.math.BigInteger[] r6 = (java.math.BigInteger[]) r6
            int r7 = r9 + r2
            r6 = r6[r7]
            java.math.BigInteger r5 = r5.add(r6)
            java.lang.Object r6 = r8.f8779b
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            java.math.BigInteger r5 = r5.and(r6)
            r5.getClass()
            r4[r2] = r5
            int r2 = r2 + 1
            goto Lb7
        Lf5:
            r8.n()
            return
    }

    public c(m8.b r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f8778a = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.f8782e = r0
            java.util.Set r0 = j8.b.o()
            r1.f8783f = r0
            r1.f8779b = r2
            return
    }

    public static void a(java.lang.StringBuffer r1, java.io.Writer r2) {
            int r0 = r1.length()
            if (r0 == 0) goto L13
            int r0 = r0 + (-1)
            char r1 = r1.charAt(r0)
            r0 = 10
            if (r1 == r0) goto L13
            r2.write(r0)
        L13:
            return
    }

    public static boolean d(java.lang.Class r6, java.lang.reflect.Method r7) {
            r0 = 0
            if (r7 != 0) goto L5
            goto Lae
        L5:
            java.lang.String r1 = r7.getName()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r2 = "equals"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto Lae
            java.lang.String r2 = "hashCode"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto Lae
            java.lang.String r2 = "toString"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto Lae
            java.lang.String r2 = "wait"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto Lae
            java.lang.String r2 = "notify"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto Lae
            java.lang.String r2 = "notifyAll"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto L3b
            goto Lae
        L3b:
            java.lang.Class[] r1 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto Lae
            int r2 = r1.length     // Catch: java.lang.Throwable -> Lae
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L4b
            int r2 = r1.length     // Catch: java.lang.Throwable -> Lae
            if (r2 == r3) goto L4b
            goto Lae
        L4b:
            int r2 = r1.length     // Catch: java.lang.Throwable -> Lae
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r2 != r3) goto L59
            r2 = r1[r4]     // Catch: java.lang.Throwable -> Lae
            if (r2 == r5) goto L59
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r2 == r3) goto L59
            goto Lae
        L59:
            r1 = r1[r0]     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto Lae
            boolean r2 = r1.isPrimitive()     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto Lae
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 == r2) goto Lae
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto L6c
            goto Lae
        L6c:
            if (r6 == 0) goto L75
            boolean r2 = r1.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto L75
            goto Lae
        L75:
            if (r6 != 0) goto L9b
            boolean r6 = r1.isPrimitive()     // Catch: java.lang.Throwable -> Lae
            if (r6 != 0) goto Lae
            boolean r6 = r1.isInterface()     // Catch: java.lang.Throwable -> Lae
            if (r6 == 0) goto L84
            goto Lae
        L84:
            java.lang.String r6 = "getType"
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> Lae
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.findMethodRecursive(r1, r6, r2)     // Catch: java.lang.Throwable -> Lae
            if (r6 == 0) goto Lae
            java.lang.Class[] r1 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> Lae
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto Lae
            java.lang.Class r6 = r6.getReturnType()     // Catch: java.lang.Throwable -> Lae
            if (r6 != r5) goto Lae
        L9b:
            java.lang.Class r6 = r7.getReturnType()     // Catch: java.lang.Throwable -> Lae
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lae
            if (r6 == r7) goto Lad
            java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
            if (r6 == r7) goto Lad
            if (r6 == r5) goto Lad
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> Lae
            if (r6 != r7) goto Lae
        Lad:
            return r4
        Lae:
            return r0
    }

    public static int f(java.lang.reflect.Method r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r3.getName()
            java.lang.String r2 = "g"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L18
            java.lang.String r2 = "f"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L1a
        L18:
            r0 = 80
        L1a:
            java.lang.String r2 = "h"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L24
            int r0 = r0 + 70
        L24:
            java.lang.String r2 = "doScene"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L34
            java.lang.String r2 = "doSceneImp"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L36
        L34:
            int r0 = r0 + 80
        L36:
            java.lang.String r2 = "d"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L46
            java.lang.String r2 = "cancel"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L48
        L46:
            int r0 = r0 + (-100)
        L48:
            java.lang.Class r1 = r3.getReturnType()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 == r2) goto L54
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r1 != r2) goto L56
        L54:
            int r0 = r0 + 100
        L56:
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 == r2) goto L5e
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r1 != r2) goto L60
        L5e:
            int r0 = r0 + 20
        L60:
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 != r2) goto L66
            int r0 = r0 + (-50)
        L66:
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            r1 = 2
            if (r3 != r1) goto L70
            int r0 = r0 + 10
        L70:
            return r0
    }

    public static boolean h(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto Lb
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        Lb:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L1a
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 < 0) goto L18
            goto L1a
        L18:
            r1 = 0
            return r1
        L1a:
            r1 = 1
            return r1
    }

    public static boolean k(java.lang.Object r3) {
            r0 = 1
            if (r3 != 0) goto L4
            goto L67
        L4:
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L67
            boolean r2 = r1.isPrimitive()     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            boolean r2 = r1.isEnum()     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            boolean r2 = r1.isArray()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L1b
            goto L67
        L1b:
            boolean r2 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            boolean r2 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            boolean r2 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            boolean r2 = r3 instanceof java.lang.Character     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            boolean r2 = r3 instanceof android.content.Context     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            boolean r2 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            boolean r2 = r3 instanceof java.lang.Class     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            boolean r2 = r3 instanceof java.lang.reflect.Method     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L67
            boolean r3 = r3 instanceof java.lang.reflect.Field     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L40
            return r0
        L40:
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = "java."
            boolean r1 = r3.startsWith(r1)     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L67
            java.lang.String r1 = "android.view."
            boolean r1 = r3.startsWith(r1)     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L67
            java.lang.String r1 = "android.widget."
            boolean r1 = r3.startsWith(r1)     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L67
            java.lang.String r1 = "android.graphics."
            boolean r3 = r3.startsWith(r1)     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L65
            goto L67
        L65:
            r3 = 0
            return r3
        L67:
            return r0
    }

    public void b(java.lang.Object r2, java.lang.String r3, java.lang.reflect.Method r4) {
            r1 = this;
            if (r2 == 0) goto L34
            if (r4 != 0) goto L5
            goto L34
        L5:
            r1.f8780c = r2
            r1.f8781d = r4
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r0 = r0.length
            r1.f8778a = r0
            java.lang.String r0 = ": "
            java.lang.StringBuilder r3 = bc.e.n(r3, r0)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r3.append(r2)
            java.lang.String r2 = "#"
            r3.append(r2)
            java.lang.String r2 = r4.getName()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.e(r2)
        L34:
            return
    }

    public synchronized void c(java.lang.Class r9, java.util.List r10) {
            r8 = this;
            monitor-enter(r8)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            if (r9 == 0) goto Lf
            r0.add(r9)     // Catch: java.lang.Throwable -> Lc
            goto Lf
        Lc:
            r9 = move-exception
            goto L10f
        Lf:
            if (r10 == 0) goto L14
            r0.addAll(r10)     // Catch: java.lang.Throwable -> Lc
        L14:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lc
            r8.f8782e = r9     // Catch: java.lang.Throwable -> Lc
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lc
            if (r9 == 0) goto L28
            java.lang.String r9 = "网络队列类为null，且没有候选类"
            r8.e(r9)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r8)
            return
        L28:
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> Lc
            r10 = 0
        L2d:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto Lc6
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> Lc
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto L3c
            goto L2d
        L3c:
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r1)     // Catch: java.lang.Throwable -> L9f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9f
        L44:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L9f
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L9f
            r4 = 0
            boolean r4 = d(r4, r3)     // Catch: java.lang.Throwable -> L9f
            if (r4 == 0) goto L44
            java.lang.Object r4 = r8.f8783f     // Catch: java.lang.Throwable -> L9f
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L9f
            boolean r4 = r4.add(r3)     // Catch: java.lang.Throwable -> L9f
            if (r4 != 0) goto L62
            goto L44
        L62:
            r8.i r4 = r8.i.f11631b     // Catch: java.lang.Throwable -> L72
            c9.c2 r5 = new c9.c2     // Catch: java.lang.Throwable -> L72
            r6 = 8
            r7 = 0
            r5.<init>(r6, r8, r3, r7)     // Catch: java.lang.Throwable -> L72
            r4.b(r3, r5)     // Catch: java.lang.Throwable -> L72
            int r10 = r10 + 1
            goto L44
        L72:
            r4 = move-exception
            java.lang.Object r5 = r8.f8783f     // Catch: java.lang.Throwable -> L9f
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L9f
            r5.remove(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r5.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r6 = "网络队列方法Hook失败: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = r3.toGenericString()     // Catch: java.lang.Throwable -> L9f
            r5.append(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = " "
            r5.append(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = r4.getMessage()     // Catch: java.lang.Throwable -> L9f
            r5.append(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L9f
            r8.e(r3)     // Catch: java.lang.Throwable -> L9f
            goto L44
        L9f:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r3.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = "网络队列类扫描失败: "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Lc
            r3.append(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = " "
            r3.append(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = r2.getMessage()     // Catch: java.lang.Throwable -> Lc
            r3.append(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lc
            r8.e(r1)     // Catch: java.lang.Throwable -> Lc
            goto L2d
        Lc6:
            if (r10 != 0) goto Leb
            java.lang.Object r9 = r8.f8783f     // Catch: java.lang.Throwable -> Lc
            java.util.Set r9 = (java.util.Set) r9     // Catch: java.lang.Throwable -> Lc
            boolean r9 = r9.isEmpty()     // Catch: java.lang.Throwable -> Lc
            if (r9 == 0) goto Leb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r9.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r10 = "网络队列候选类无合适方法可Hook: "
            r9.append(r10)     // Catch: java.lang.Throwable -> Lc
            int r10 = r0.size()     // Catch: java.lang.Throwable -> Lc
            r9.append(r10)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lc
            r8.e(r9)     // Catch: java.lang.Throwable -> Lc
            goto L10d
        Leb:
            if (r10 <= 0) goto L10d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r9.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r1 = "网络队列补装Hook: classes="
            r9.append(r1)     // Catch: java.lang.Throwable -> Lc
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lc
            r9.append(r0)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = " methods="
            r9.append(r0)     // Catch: java.lang.Throwable -> Lc
            r9.append(r10)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lc
            r8.e(r9)     // Catch: java.lang.Throwable -> Lc
        L10d:
            monitor-exit(r8)
            return
        L10f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc
            throw r9
    }

    public void e(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.f8779b
            m8.b r0 = (m8.b) r0
            if (r0 == 0) goto L9
            r0.a(r2)
        L9:
            return
    }

    public void g(java.math.BigInteger[] r13) {
            r12 = this;
            r0 = 0
            r1 = r13[r0]
            r2 = 4
            r3 = r13[r2]
            java.math.BigInteger r1 = r1.subtract(r3)
            java.lang.Object r3 = r12.f8779b
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r1 = r1.and(r3)
            r1.getClass()
            r13[r0] = r1
            r1 = 5
            r4 = r13[r1]
            r5 = 7
            r6 = r13[r5]
            r7 = 9
            java.math.BigInteger r6 = r6.shiftRight(r7)
            java.math.BigInteger r4 = r4.xor(r6)
            java.math.BigInteger r4 = r4.and(r3)
            r4.getClass()
            r13[r1] = r4
            r4 = r13[r5]
            r6 = r13[r0]
            java.math.BigInteger r4 = r4.add(r6)
            java.math.BigInteger r4 = r4.and(r3)
            r4.getClass()
            r13[r5] = r4
            r4 = 1
            r6 = r13[r4]
            r8 = r13[r1]
            java.math.BigInteger r6 = r6.subtract(r8)
            java.math.BigInteger r6 = r6.and(r3)
            r6.getClass()
            r13[r4] = r6
            r6 = 6
            r8 = r13[r6]
            r9 = r13[r0]
            java.math.BigInteger r7 = r9.shiftLeft(r7)
            java.math.BigInteger r7 = r8.xor(r7)
            java.math.BigInteger r7 = r7.and(r3)
            r7.getClass()
            r13[r6] = r7
            r7 = r13[r0]
            r8 = r13[r4]
            java.math.BigInteger r7 = r7.add(r8)
            java.math.BigInteger r7 = r7.and(r3)
            r7.getClass()
            r13[r0] = r7
            r7 = 2
            r8 = r13[r7]
            r9 = r13[r6]
            java.math.BigInteger r8 = r8.subtract(r9)
            java.math.BigInteger r8 = r8.and(r3)
            r8.getClass()
            r13[r7] = r8
            r8 = r13[r5]
            r9 = r13[r4]
            r10 = 23
            java.math.BigInteger r9 = r9.shiftRight(r10)
            java.math.BigInteger r8 = r8.xor(r9)
            java.math.BigInteger r8 = r8.and(r3)
            r8.getClass()
            r13[r5] = r8
            r8 = r13[r4]
            r9 = r13[r7]
            java.math.BigInteger r8 = r8.add(r9)
            java.math.BigInteger r8 = r8.and(r3)
            r8.getClass()
            r13[r4] = r8
            r8 = 3
            r9 = r13[r8]
            r10 = r13[r5]
            java.math.BigInteger r9 = r9.subtract(r10)
            java.math.BigInteger r9 = r9.and(r3)
            r9.getClass()
            r13[r8] = r9
            r9 = r13[r0]
            r10 = r13[r7]
            r11 = 15
            java.math.BigInteger r10 = r10.shiftLeft(r11)
            java.math.BigInteger r9 = r9.xor(r10)
            java.math.BigInteger r9 = r9.and(r3)
            r9.getClass()
            r13[r0] = r9
            r9 = r13[r7]
            r10 = r13[r8]
            java.math.BigInteger r9 = r9.add(r10)
            java.math.BigInteger r9 = r9.and(r3)
            r9.getClass()
            r13[r7] = r9
            r9 = r13[r2]
            r0 = r13[r0]
            java.math.BigInteger r0 = r9.subtract(r0)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r2] = r0
            r0 = r13[r4]
            r9 = r13[r8]
            r10 = 14
            java.math.BigInteger r9 = r9.shiftRight(r10)
            java.math.BigInteger r0 = r0.xor(r9)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r4] = r0
            r0 = r13[r8]
            r9 = r13[r2]
            java.math.BigInteger r0 = r0.add(r9)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r8] = r0
            r0 = r13[r1]
            r4 = r13[r4]
            java.math.BigInteger r0 = r0.subtract(r4)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r1] = r0
            r0 = r13[r7]
            r4 = r13[r2]
            r9 = 20
            java.math.BigInteger r4 = r4.shiftLeft(r9)
            java.math.BigInteger r0 = r0.xor(r4)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r7] = r0
            r0 = r13[r2]
            r4 = r13[r1]
            java.math.BigInteger r0 = r0.add(r4)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r2] = r0
            r0 = r13[r6]
            r4 = r13[r7]
            java.math.BigInteger r0 = r0.subtract(r4)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r6] = r0
            r0 = r13[r8]
            r4 = r13[r1]
            r7 = 17
            java.math.BigInteger r4 = r4.shiftRight(r7)
            java.math.BigInteger r0 = r0.xor(r4)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r8] = r0
            r0 = r13[r1]
            r4 = r13[r6]
            java.math.BigInteger r0 = r0.add(r4)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r1] = r0
            r0 = r13[r5]
            r1 = r13[r8]
            java.math.BigInteger r0 = r0.subtract(r1)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r5] = r0
            r0 = r13[r2]
            r1 = r13[r6]
            java.math.BigInteger r1 = r1.shiftLeft(r10)
            java.math.BigInteger r0 = r0.xor(r1)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r2] = r0
            r0 = r13[r6]
            r1 = r13[r5]
            java.math.BigInteger r0 = r0.add(r1)
            java.math.BigInteger r0 = r0.and(r3)
            r0.getClass()
            r13[r6] = r0
            return
    }

    public void i() {
            r8 = this;
            java.lang.Object r0 = r8.f8781d
            java.lang.StringBuffer r0 = (java.lang.StringBuffer) r0
            java.lang.Object r1 = r8.f8780c
            java.lang.StringBuffer r1 = (java.lang.StringBuffer) r1
            java.lang.Object r2 = r8.f8779b
            java.io.Writer r2 = (java.io.Writer) r2
        Lc:
            java.lang.String r3 = "\n"
            int r4 = r1.indexOf(r3)
            if (r4 >= 0) goto L15
            goto L1b
        L15:
            int r3 = r0.indexOf(r3)
            if (r3 >= 0) goto L1c
        L1b:
            return
        L1c:
            r5 = 0
            if (r4 == 0) goto L26
            java.lang.String r6 = r1.substring(r5, r4)
            r2.write(r6)
        L26:
            if (r3 == 0) goto L3c
            int r6 = r8.f8778a
            int r6 = r6 - r4
        L2b:
            if (r6 <= 0) goto L35
            r7 = 32
            r2.write(r7)
            int r6 = r6 + (-1)
            goto L2b
        L35:
            java.lang.String r6 = r0.substring(r5, r3)
            r2.write(r6)
        L3c:
            r6 = 10
            r2.write(r6)
            int r4 = r4 + 1
            r1.delete(r5, r4)
            int r3 = r3 + 1
            r0.delete(r5, r3)
            goto Lc
    }

    public boolean j(java.lang.Object r15) {
            r14 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r15 != 0) goto L9
            goto L1bb
        L9:
            boolean r2 = r15 instanceof java.lang.Object[]
            r3 = 1
            if (r2 == 0) goto L16
            r2 = r15
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r4 = r2.length
            if (r4 != r3) goto L16
            r15 = r2[r0]
        L16:
            if (r15 != 0) goto L1a
            goto L1bb
        L1a:
            java.lang.Object r2 = r14.f8780c
            if (r2 == 0) goto L38
            java.lang.Object r2 = r14.f8781d
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 != 0) goto L25
            goto L38
        L25:
            int r2 = f(r2)
            r4 = 100
            if (r2 >= r4) goto L12a
            java.lang.Object r2 = r14.f8780c
            java.lang.Class r4 = r15.getClass()
            r14.l(r2, r4)
            goto L12a
        L38:
            java.lang.Class r2 = r15.getClass()
            java.lang.Object r4 = r14.f8780c
            if (r4 == 0) goto L48
            java.lang.Object r4 = r14.f8781d
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L48
            goto L12a
        L48:
            java.lang.Object r4 = r14.f8782e
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L12a
            java.util.Iterator r4 = r4.iterator()
        L52:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L12a
            java.lang.Object r5 = r4.next()
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 == 0) goto L52
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap
            r6.<init>()
            java.util.Set r6 = java.util.Collections.newSetFromMap(r6)
            r7 = r5
        L6a:
            java.lang.String r8 = "网络发包器主动缓存成功: "
            r9 = 3
            r10 = 0
            if (r7 == 0) goto Lbd
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            if (r7 == r11) goto Lbd
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredFields(r7)     // Catch: java.lang.Throwable -> Lbd
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Lbd
        L7c:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> Lbd
            if (r12 == 0) goto Lb8
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> Lbd
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12     // Catch: java.lang.Throwable -> Lbd
            boolean r13 = h.Hchat.utils.KavaReflector.isStatic(r12)     // Catch: java.lang.Throwable -> L7c
            if (r13 != 0) goto L8f
            goto L7c
        L8f:
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.readField(r12, r10)     // Catch: java.lang.Throwable -> L7c
            boolean r13 = k(r12)     // Catch: java.lang.Throwable -> L7c
            if (r13 == 0) goto L9a
            goto L7c
        L9a:
            boolean r12 = r14.m(r12, r2, r9, r6)     // Catch: java.lang.Throwable -> L7c
            if (r12 == 0) goto L7c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r12.<init>()     // Catch: java.lang.Throwable -> L7c
            r12.append(r8)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r13 = r5.getName()     // Catch: java.lang.Throwable -> L7c
            r12.append(r13)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L7c
            r14.e(r12)     // Catch: java.lang.Throwable -> L7c
            goto L12a
        Lb8:
            java.lang.Class r7 = r7.getSuperclass()     // Catch: java.lang.Throwable -> Lbd
            goto L6a
        Lbd:
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredMethods(r5)     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L52
        Lc5:
            boolean r11 = r7.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r11 == 0) goto L52
            java.lang.Object r11 = r7.next()     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch: java.lang.Throwable -> L52
            boolean r12 = h.Hchat.utils.KavaReflector.isStatic(r11)     // Catch: java.lang.Throwable -> Lc5
            if (r12 != 0) goto Ld8
            goto Lc5
        Ld8:
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> Lc5
            int r12 = r12.length     // Catch: java.lang.Throwable -> Lc5
            if (r12 == 0) goto Le0
            goto Lc5
        Le0:
            java.lang.Class r12 = r11.getReturnType()     // Catch: java.lang.Throwable -> Lc5
            if (r12 == 0) goto Lc5
            java.lang.Class r13 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> Lc5
            if (r12 == r13) goto Lc5
            boolean r13 = r12.isPrimitive()     // Catch: java.lang.Throwable -> Lc5
            if (r13 != 0) goto Lc5
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            if (r12 != r13) goto Lf5
            goto Lc5
        Lf5:
            java.lang.Object[] r12 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.invoke(r11, r10, r12)     // Catch: java.lang.Throwable -> Lc5
            boolean r13 = k(r12)     // Catch: java.lang.Throwable -> Lc5
            if (r13 == 0) goto L102
            goto Lc5
        L102:
            boolean r12 = r14.m(r12, r2, r9, r6)     // Catch: java.lang.Throwable -> Lc5
            if (r12 == 0) goto Lc5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5
            r12.<init>()     // Catch: java.lang.Throwable -> Lc5
            r12.append(r8)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r13 = r5.getName()     // Catch: java.lang.Throwable -> Lc5
            r12.append(r13)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r13 = "#"
            r12.append(r13)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r11 = r11.getName()     // Catch: java.lang.Throwable -> Lc5
            r12.append(r11)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> Lc5
            r14.e(r11)     // Catch: java.lang.Throwable -> Lc5
        L12a:
            java.lang.Object r2 = r14.f8780c
            if (r2 == 0) goto L193
            java.lang.Object r4 = r14.f8781d
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L193
            r3 = 2
            int r5 = r14.f8778a     // Catch: java.lang.Throwable -> L14f
            if (r5 != r3) goto L142
            java.lang.Object[] r5 = new java.lang.Object[]{r15, r1}     // Catch: java.lang.Throwable -> L14f
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r4, r2, r5)     // Catch: java.lang.Throwable -> L14f
            goto L14a
        L142:
            java.lang.Object[] r5 = new java.lang.Object[]{r15}     // Catch: java.lang.Throwable -> L14f
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r4, r2, r5)     // Catch: java.lang.Throwable -> L14f
        L14a:
            boolean r15 = h(r2)     // Catch: java.lang.Throwable -> L14f
            return r15
        L14f:
            int r2 = r14.f8778a     // Catch: java.lang.Throwable -> L16a
            java.lang.Object r4 = r14.f8780c
            java.lang.Object r5 = r14.f8781d
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r2 != r3) goto L16c
            java.lang.String r2 = r5.getName()     // Catch: java.lang.Throwable -> L16a
            java.lang.Object[] r15 = new java.lang.Object[]{r15, r1}     // Catch: java.lang.Throwable -> L16a
            java.lang.Object r15 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r2, r15)     // Catch: java.lang.Throwable -> L16a
            boolean r15 = h(r15)     // Catch: java.lang.Throwable -> L16a
            return r15
        L16a:
            r15 = move-exception
            goto L17d
        L16c:
            java.lang.String r1 = r5.getName()     // Catch: java.lang.Throwable -> L16a
            java.lang.Object[] r15 = new java.lang.Object[]{r15}     // Catch: java.lang.Throwable -> L16a
            java.lang.Object r15 = h.Hchat.utils.KavaReflector.invokeMethod(r4, r1, r15)     // Catch: java.lang.Throwable -> L16a
            boolean r15 = h(r15)     // Catch: java.lang.Throwable -> L16a
            return r15
        L17d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "sendNetworkRequest 异常: "
            r1.<init>(r2)
            java.lang.String r15 = r15.getMessage()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r14.e(r15)
            goto L1bb
        L193:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "sendNetworkRequest 失败: dispatcher="
            r15.<init>(r1)
            java.lang.Object r1 = r14.f8780c
            if (r1 == 0) goto L1a0
            r1 = r3
            goto L1a1
        L1a0:
            r1 = r0
        L1a1:
            r15.append(r1)
            java.lang.String r1 = " method="
            r15.append(r1)
            java.lang.Object r1 = r14.f8781d
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L1b0
            goto L1b1
        L1b0:
            r3 = r0
        L1b1:
            r15.append(r3)
            java.lang.String r15 = r15.toString()
            r14.e(r15)
        L1bb:
            return r0
    }

    public boolean l(java.lang.Object r11, java.lang.Class r12) {
            r10 = this;
            java.lang.String r0 = "网络发包器方法匹配"
            if (r11 == 0) goto L8d
            r1 = 1
            r2 = 0
            java.lang.Class r3 = r11.getClass()     // Catch: java.lang.Throwable -> L39
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredMethods(r3)     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L39
            r4 = r2
        L13:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L33
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L39
            boolean r6 = d(r12, r5)     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L13
            if (r4 == 0) goto L31
            int r6 = f(r5)     // Catch: java.lang.Throwable -> L39
            int r7 = f(r4)     // Catch: java.lang.Throwable -> L39
            if (r6 <= r7) goto L13
        L31:
            r4 = r5
            goto L13
        L33:
            if (r4 == 0) goto L39
            r10.b(r11, r0, r4)     // Catch: java.lang.Throwable -> L39
            return r1
        L39:
            java.lang.Class r3 = r11.getClass()     // Catch: java.lang.Throwable -> L8d
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r3)     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L8d
        L45:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r4 == 0) goto L8d
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L8d
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r11)     // Catch: java.lang.Throwable -> L8d
            if (r4 == 0) goto L45
            if (r4 != r11) goto L5a
            goto L45
        L5a:
            java.lang.Class r5 = r4.getClass()     // Catch: java.lang.Throwable -> L45
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredMethods(r5)     // Catch: java.lang.Throwable -> L45
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L45
            r6 = r2
        L67:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L87
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L45
            boolean r8 = d(r12, r7)     // Catch: java.lang.Throwable -> L45
            if (r8 == 0) goto L67
            if (r6 == 0) goto L85
            int r8 = f(r7)     // Catch: java.lang.Throwable -> L45
            int r9 = f(r6)     // Catch: java.lang.Throwable -> L45
            if (r8 <= r9) goto L67
        L85:
            r6 = r7
            goto L67
        L87:
            if (r6 == 0) goto L45
            r10.b(r4, r0, r6)     // Catch: java.lang.Throwable -> L45
            return r1
        L8d:
            r11 = 0
            return r11
    }

    public boolean m(java.lang.Object r6, java.lang.Class r7, int r8, java.util.Set r9) {
            r5 = this;
            if (r6 == 0) goto L50
            if (r9 == 0) goto Le
            boolean r0 = r9.contains(r6)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Lb
            goto L50
        Lb:
            r9.add(r6)     // Catch: java.lang.Throwable -> Le
        Le:
            boolean r0 = r5.l(r6, r7)
            r1 = 1
            if (r0 == 0) goto L16
            goto L4a
        L16:
            if (r8 > 0) goto L19
            goto L50
        L19:
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Throwable -> L50
        L1d:
            if (r0 == 0) goto L50
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r0 == r2) goto L50
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r0)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L50
        L2b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L50
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r6)     // Catch: java.lang.Throwable -> L2b
            boolean r4 = k(r3)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L42
            goto L2b
        L42:
            int r4 = r8 + (-1)
            boolean r3 = r5.m(r3, r7, r4, r9)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2b
        L4a:
            return r1
        L4b:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L50
            goto L1d
        L50:
            r6 = 0
            return r6
    }

    public void n() {
            r12 = this;
            java.lang.Object r0 = r12.f8782e
            java.math.BigInteger[] r0 = (java.math.BigInteger[]) r0
            java.lang.Object r1 = r12.f8783f
            java.math.BigInteger[] r1 = (java.math.BigInteger[]) r1
            r2 = 2
            r3 = r1[r2]
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            java.math.BigInteger r3 = r3.add(r4)
            java.lang.Object r4 = r12.f8779b
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            java.math.BigInteger r3 = r3.and(r4)
            r3.getClass()
            r1[r2] = r3
            r3 = 1
            r5 = r1[r3]
            r6 = r1[r2]
            java.math.BigInteger r5 = r5.add(r6)
            java.math.BigInteger r5 = r5.and(r4)
            r5.getClass()
            r1[r3] = r5
            r5 = 0
            r6 = r5
        L32:
            r7 = 256(0x100, float:3.59E-43)
            if (r6 < r7) goto L37
            return
        L37:
            int r8 = r6 % 4
            r9 = 3
            if (r8 == 0) goto L78
            if (r8 == r3) goto L67
            if (r8 == r2) goto L55
            if (r8 == r9) goto L43
            goto L91
        L43:
            r8 = r1[r5]
            r10 = 33
            java.math.BigInteger r10 = r8.shiftRight(r10)
            java.math.BigInteger r8 = r8.xor(r10)
            r8.getClass()
            r1[r5] = r8
            goto L91
        L55:
            r8 = r1[r5]
            r10 = 12
            java.math.BigInteger r10 = r8.shiftLeft(r10)
            java.math.BigInteger r8 = r8.xor(r10)
            r8.getClass()
            r1[r5] = r8
            goto L91
        L67:
            r8 = r1[r5]
            r10 = 5
            java.math.BigInteger r10 = r8.shiftRight(r10)
            java.math.BigInteger r8 = r8.xor(r10)
            r8.getClass()
            r1[r5] = r8
            goto L91
        L78:
            r8 = r1[r5]
            r10 = 21
            java.math.BigInteger r10 = r8.shiftLeft(r10)
            java.math.BigInteger r8 = r8.xor(r10)
            java.math.BigInteger r8 = r8.not()
            java.math.BigInteger r8 = r8.and(r4)
            r8.getClass()
            r1[r5] = r8
        L91:
            r8 = r1[r5]
            int r10 = r6 + 128
            int r10 = r10 % r7
            r7 = r0[r10]
            java.math.BigInteger r7 = r8.add(r7)
            java.math.BigInteger r7 = r7.and(r4)
            r7.getClass()
            r1[r5] = r7
            r7 = r0[r6]
            java.math.BigInteger r8 = r7.shiftRight(r9)
            r9 = 256(0x100, double:1.265E-321)
            java.math.BigInteger r11 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r8 = r8.mod(r11)
            int r8 = r8.intValue()
            r8 = r0[r8]
            r11 = r1[r5]
            java.math.BigInteger r8 = r8.add(r11)
            r11 = r1[r3]
            java.math.BigInteger r8 = r8.add(r11)
            java.math.BigInteger r8 = r8.and(r4)
            r8.getClass()
            r0[r6] = r8
            r11 = 11
            java.math.BigInteger r8 = r8.shiftRight(r11)
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r8 = r8.mod(r9)
            int r8 = r8.intValue()
            r8 = r0[r8]
            java.math.BigInteger r7 = r8.add(r7)
            java.math.BigInteger r7 = r7.and(r4)
            r7.getClass()
            r1[r3] = r7
            java.lang.Object r7 = r12.f8781d
            java.math.BigInteger[] r7 = (java.math.BigInteger[]) r7
            r8 = r1[r3]
            r7[r6] = r8
            int r6 = r6 + 1
            goto L32
    }
}
