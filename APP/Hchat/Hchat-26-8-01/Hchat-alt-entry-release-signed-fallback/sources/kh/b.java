package kh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedHashMap f7612a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f7613b = null;

    static {
            sf.e r0 = new sf.e
            java.lang.String r9 = "boolean"
            java.lang.String r10 = "Z"
            r0.<init>(r9, r10)
            sf.e r1 = new sf.e
            java.lang.String r11 = "byte"
            java.lang.String r12 = "B"
            r1.<init>(r11, r12)
            sf.e r2 = new sf.e
            java.lang.String r13 = "char"
            java.lang.String r14 = "C"
            r2.<init>(r13, r14)
            sf.e r3 = new sf.e
            java.lang.String r15 = "short"
            java.lang.String r4 = "S"
            r3.<init>(r15, r4)
            r5 = r4
            sf.e r4 = new sf.e
            java.lang.String r6 = "int"
            java.lang.String r7 = "I"
            r4.<init>(r6, r7)
            r8 = r5
            sf.e r5 = new sf.e
            r16 = r15
            java.lang.String r15 = "float"
            r17 = r13
            java.lang.String r13 = "F"
            r5.<init>(r15, r13)
            r18 = r6
            sf.e r6 = new sf.e
            r19 = r13
            java.lang.String r13 = "long"
            r20 = r15
            java.lang.String r15 = "J"
            r6.<init>(r13, r15)
            r21 = r7
            sf.e r7 = new sf.e
            r22 = r13
            java.lang.String r13 = "double"
            r23 = r15
            java.lang.String r15 = "D"
            r7.<init>(r13, r15)
            r24 = r8
            sf.e r8 = new sf.e
            r25 = r13
            java.lang.String r13 = "void"
            r26 = r15
            java.lang.String r15 = "V"
            r8.<init>(r13, r15)
            r27 = r18
            r18 = r15
            r15 = r27
            r27 = r13
            r28 = r21
            r13 = r24
            sf.e[] r0 = new sf.e[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = 9
            int r2 = tf.y.a0(r2)
            r1.<init>(r2)
            tf.y.d0(r1, r0)
            kh.b.f7612a = r1
            sf.e r0 = new sf.e
            r0.<init>(r10, r9)
            sf.e r1 = new sf.e
            r1.<init>(r12, r11)
            sf.e r3 = new sf.e
            r4 = r17
            r3.<init>(r14, r4)
            sf.e r4 = new sf.e
            r5 = r16
            r4.<init>(r13, r5)
            sf.e r5 = new sf.e
            r6 = r28
            r5.<init>(r6, r15)
            sf.e r6 = new sf.e
            r8 = r19
            r7 = r20
            r6.<init>(r8, r7)
            sf.e r7 = new sf.e
            r8 = r22
            r9 = r23
            r7.<init>(r9, r8)
            sf.e r8 = new sf.e
            r9 = r25
            r10 = r26
            r8.<init>(r10, r9)
            sf.e r9 = new sf.e
            r11 = r18
            r10 = r27
            r9.<init>(r11, r10)
            r29 = r0
            r30 = r1
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r35 = r7
            r36 = r8
            r37 = r9
            sf.e[] r0 = new sf.e[]{r29, r30, r31, r32, r33, r34, r35, r36, r37}
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r2)
            tf.y.d0(r1, r0)
            kh.b.f7613b = r1
            return
    }

    public static final java.lang.String a(java.lang.reflect.Constructor r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Class[] r3 = r3.getParameterTypes()
            r3.getClass()
            kh.a r1 = kh.a.f7609h
            r2 = 30
            java.lang.String r3 = tf.l.F0(r3, r1, r2)
            java.lang.String r1 = ")V"
            java.lang.String r3 = eh.a.r(r0, r3, r1)
            return r3
    }

    public static final java.lang.String b(java.lang.reflect.Method r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getDeclaringClass()
            r1.getClass()
            java.lang.String r1 = f(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r2 = c(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final java.lang.String c(java.lang.reflect.Method r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Class[] r1 = r4.getParameterTypes()
            r1.getClass()
            kh.a r2 = kh.a.f7610i
            r3 = 30
            java.lang.String r1 = tf.l.F0(r1, r2, r3)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.Class r4 = r4.getReturnType()
            r4.getClass()
            java.lang.String r4 = f(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static final java.lang.String d(java.lang.Class r1) {
            r1.getClass()
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L1b
            java.lang.Class r1 = r1.getComponentType()
            r1.getClass()
            java.lang.String r1 = d(r1)
            java.lang.String r0 = "[]"
            java.lang.String r1 = bc.e.i(r1, r0)
            return r1
        L1b:
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L8f
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            java.lang.String r1 = "boolean"
            return r1
        L2c:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L37
            java.lang.String r1 = "byte"
            return r1
        L37:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L42
            java.lang.String r1 = "char"
            return r1
        L42:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4d
            java.lang.String r1 = "short"
            return r1
        L4d:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            java.lang.String r1 = "int"
            return r1
        L58:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L63
            java.lang.String r1 = "float"
            return r1
        L63:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6e
            java.lang.String r1 = "long"
            return r1
        L6e:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L79
            java.lang.String r1 = "double"
            return r1
        L79:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L84
            java.lang.String r1 = "void"
            return r1
        L84:
            java.lang.String r0 = "Unknown primitive type: "
            java.lang.String r1 = p.a.k(r1, r0)
            j8.o.A(r1)
            r1 = 0
            return r1
        L8f:
            java.lang.String r1 = r1.getName()
            return r1
    }

    public static final java.lang.String e(java.lang.String r4) {
            r4.getClass()
            r0 = 0
            char r1 = r4.charAt(r0)
            r2 = 91
            r3 = 1
            if (r1 != r2) goto L1c
            java.lang.String r4 = r4.substring(r3)
            java.lang.String r4 = e(r4)
            java.lang.String r0 = "[]"
            java.lang.String r4 = r4.concat(r0)
            return r4
        L1c:
            int r1 = r4.length()
            if (r1 != r3) goto L38
            java.util.LinkedHashMap r0 = kh.b.f7613b
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L2d
            return r0
        L2d:
            java.lang.String r0 = "Unknown primitive typeSign: "
            java.lang.String r4 = r0.concat(r4)
            j8.o.t(r4)
            r4 = 0
            return r4
        L38:
            char r0 = r4.charAt(r0)
            r1 = 76
            if (r0 != r1) goto L62
            int r0 = r4.length()
            int r0 = r0 - r3
            char r0 = r4.charAt(r0)
            r1 = 59
            if (r0 != r1) goto L62
            int r0 = r4.length()
            int r0 = r0 - r3
            java.lang.String r4 = r4.substring(r3, r0)
            r0 = 47
            r1 = 46
            java.lang.String r4 = r4.replace(r0, r1)
            r4.getClass()
            return r4
        L62:
            java.lang.String r0 = "Unknown class sign: "
            java.lang.String r4 = r0.concat(r4)
            j8.o.A(r4)
            r4 = 0
            return r4
    }

    public static final java.lang.String f(java.lang.Class r2) {
            r2.getClass()
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L77
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            java.lang.String r2 = "Z"
            return r2
        L14:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r2 = "B"
            return r2
        L1f:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2a
            java.lang.String r2 = "C"
            return r2
        L2a:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L35
            java.lang.String r2 = "S"
            return r2
        L35:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L40
            java.lang.String r2 = "I"
            return r2
        L40:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4b
            java.lang.String r2 = "F"
            return r2
        L4b:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L56
            java.lang.String r2 = "J"
            return r2
        L56:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L61
            java.lang.String r2 = "D"
            return r2
        L61:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L6c
            java.lang.String r2 = "V"
            return r2
        L6c:
            java.lang.String r0 = "Unknown primitive type: "
            java.lang.String r2 = p.a.k(r2, r0)
            j8.o.A(r2)
            r2 = 0
            return r2
        L77:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L8f
            java.lang.Class r2 = r2.getComponentType()
            r2.getClass()
            java.lang.String r2 = f(r2)
            java.lang.String r0 = "["
            java.lang.String r2 = r0.concat(r2)
            return r2
        L8f:
            java.lang.String r2 = r2.getName()
            r0 = 46
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            java.lang.String r0 = "L"
            java.lang.String r1 = ";"
            java.lang.String r2 = eh.a.n(r0, r2, r1)
            return r2
    }

    public static final java.lang.String g(java.lang.String r2) {
            r2.getClass()
            java.lang.String r0 = "[]"
            r1 = 0
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 == 0) goto L21
            int r0 = r2.length()
            int r0 = r0 + (-2)
            java.lang.String r2 = r2.substring(r1, r0)
            java.lang.String r2 = g(r2)
            java.lang.String r0 = "["
            java.lang.String r2 = r0.concat(r2)
            return r2
        L21:
            java.util.LinkedHashMap r0 = kh.b.f7612a
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L4a
            r0 = 46
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = ";"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L4a:
            return r0
    }
}
