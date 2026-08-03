package x6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    static {
            return
    }

    public static final java.util.List a(q6.a r5, r6.c r6) {
            r6.getClass()
            java.lang.Class r0 = r6.f11541a
            java.lang.reflect.Constructor[] r0 = r0.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            int r2 = r0.length     // Catch: java.lang.Throwable -> L1a
            r3 = 0
        L10:
            if (r3 >= r2) goto L24
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto L1c
            r1.add(r4)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r0 = move-exception
            goto L1f
        L1c:
            int r3 = r3 + 1
            goto L10
        L1f:
            sf.f r1 = new sf.f
            r1.<init>(r0)
        L24:
            java.lang.Throwable r0 = sf.g.b(r1)
            if (r0 == 0) goto L2f
            y6.a r0 = y6.b.f22306a
            r0.ordinal()
        L2f:
            boolean r0 = r1 instanceof sf.f
            if (r0 == 0) goto L34
            r1 = 0
        L34:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L3a
            tf.t r1 = tf.t.f13167g
        L3a:
            dg.n r0 = new dg.n
            r2 = 6
            r0.<init>(r1, r2)
            ng.i r0 = b(r0, r5, r6)
            ng.i r5 = g(r0, r5, r6)
            wb.sr r0 = new wb.sr
            r1 = 17
            r0.<init>(r1)
            ng.t r5 = ng.m.W(r5, r0)
            java.lang.Class<java.lang.reflect.Constructor> r0 = java.lang.reflect.Constructor.class
            gg.f r1 = gg.v.a(r0)
            java.lang.Class<java.lang.reflect.Method> r2 = java.lang.reflect.Method.class
            gg.f r2 = gg.v.a(r2)
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L70
            x6.e r0 = new x6.e
            r1 = 0
            r0.<init>(r6, r1)
            ng.t r5 = ng.m.W(r5, r0)
            goto L9b
        L70:
            gg.f r0 = gg.v.a(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L85
            x6.e r0 = new x6.e
            r1 = 1
            r0.<init>(r6, r1)
            ng.t r5 = ng.m.W(r5, r0)
            goto L9b
        L85:
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            gg.f r0 = gg.v.a(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La0
            x6.e r0 = new x6.e
            r1 = 2
            r0.<init>(r6, r1)
            ng.t r5 = ng.m.W(r5, r0)
        L9b:
            java.util.List r5 = ng.m.b0(r5)
            return r5
        La0:
            java.lang.String r6 = "Unsupported member type: "
            okio.a.p(r5, r6)
            r5 = 0
            return r5
    }

    public static ng.i b(dg.n r4, r6.d r5, r6.c r6) {
            wb.sr r0 = new wb.sr
            r1 = 18
            r0.<init>(r1)
            ng.t r4 = ng.m.W(r4, r0)
            java.lang.String r0 = r5.f11544b
            x6.c r1 = new x6.c
            r2 = 0
            r1.<init>(r2)
            java.lang.String r2 = "name"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            x6.c r0 = new x6.c
            r1 = 1
            r0.<init>(r1)
            java.lang.String r1 = "nameCondition"
            r2 = 0
            ng.i r4 = h(r4, r6, r1, r2, r0)
            java.util.LinkedHashSet r0 = r5.f11545c
            x6.c r1 = new x6.c
            r3 = 2
            r1.<init>(r3)
            java.lang.String r3 = "modifiers"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11546d
            x6.c r1 = new x6.c
            r3 = 3
            r1.<init>(r3)
            java.lang.String r3 = "modifiersNot"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            x6.c r0 = new x6.c
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = "modifiersCondition"
            ng.i r4 = h(r4, r6, r1, r2, r0)
            x6.c r0 = new x6.c
            r1 = 6
            r0.<init>(r1)
            java.lang.String r1 = "isSynthetic"
            ng.i r4 = h(r4, r6, r1, r2, r0)
            x6.c r0 = new x6.c
            r1 = 7
            r0.<init>(r1)
            java.lang.String r1 = "isSyntheticNot"
            ng.i r4 = h(r4, r6, r1, r2, r0)
            java.util.LinkedHashSet r0 = r5.f11547e
            x6.a r1 = new x6.a
            r3 = 16
            r1.<init>(r6, r3)
            java.lang.String r3 = "annotations"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r5 = r5.f11548f
            x6.a r0 = new x6.a
            r1 = 17
            r0.<init>(r6, r1)
            java.lang.String r1 = "annotationsNot"
            ng.i r4 = h(r4, r6, r1, r5, r0)
            x6.c r5 = new x6.c
            r0 = 8
            r5.<init>(r0)
            java.lang.String r0 = "genericString"
            ng.i r4 = h(r4, r6, r0, r2, r5)
            return r4
    }

    public static final int c(java.lang.String r7) {
            r0 = 0
            r2 = 0
        L3:
            int r3 = r7.length()
            if (r2 >= r3) goto L1d
            char r3 = r7.charAt(r2)
            long r3 = (long) r3
            r5 = 127(0x7f, double:6.27E-322)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L17
            r3 = 2
            goto L19
        L17:
            r3 = 1
        L19:
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L3
        L1d:
            int r7 = (int) r0
            return r7
    }

    public static final java.lang.String d(int r1, java.lang.String r2) {
            int r0 = c(r2)
            int r1 = r1 - r0
            if (r1 <= 0) goto L12
            java.lang.String r0 = " "
            java.lang.String r1 = og.t.Z(r1, r0)
            java.lang.String r1 = bc.e.i(r2, r1)
            return r1
        L12:
            return r2
    }

    public static java.util.List e(java.lang.reflect.AnnotatedElement[] r8) {
            int r0 = r8.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto L11
            r4 = r8[r2]
            java.lang.annotation.Annotation[] r4 = r4.getAnnotations()
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        L11:
            if (r3 != 0) goto L16
            tf.t r8 = tf.t.f13167g
            return r8
        L16:
            uf.c r0 = a.a.E()
            int r2 = r8.length
            r3 = r1
        L1c:
            if (r3 >= r2) goto L3e
            r4 = r8[r3]
            java.lang.annotation.Annotation[] r4 = r4.getAnnotations()
            int r5 = r4.length
            r6 = r1
        L26:
            if (r6 >= r5) goto L3b
            r7 = r4[r6]
            gg.f r7 = a.a.Q(r7)
            java.lang.Class r7 = r7.a()
            r7.getClass()
            r0.add(r7)
            int r6 = r6 + 1
            goto L26
        L3b:
            int r3 = r3 + 1
            goto L1c
        L3e:
            uf.c r8 = a.a.t(r0)
            return r8
    }

    public static boolean f(java.util.Collection r6, java.util.List r7, r6.c r8) {
            int r0 = r6.size()
            int r1 = r7.size()
            r2 = 0
            if (r0 == r1) goto Lc
            goto L44
        Lc:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r0 = r2
        L13:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r6.next()
            int r3 = r0 + 1
            java.lang.Object r0 = r7.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
            r4 = 0
            java.lang.Class r1 = k(r1, r8, r4)
            java.lang.Class<s6.b> r4 = s6.b.class
            gg.f r5 = gg.v.a(r4)
            java.lang.Class r5 = a.a.a0(r5)
            if (r5 != 0) goto L37
            goto L38
        L37:
            r4 = r5
        L38:
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L45
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L45
        L44:
            return r2
        L45:
            r0 = r3
            goto L13
        L47:
            r6 = 1
            return r6
    }

    public static ng.i g(ng.i r4, r6.a r5, r6.c r6) {
            x6.f r0 = x6.f.f21204h
            ng.t r4 = ng.m.W(r4, r0)
            java.util.ArrayList r0 = r5.f11517g
            x6.a r1 = new x6.a
            r2 = 1
            r1.<init>(r6, r2)
            java.lang.String r2 = "parameters"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            java.util.ArrayList r0 = r5.f11518h
            x6.a r1 = new x6.a
            r2 = 8
            r1.<init>(r6, r2)
            java.lang.String r2 = "parametersNot"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            wb.m0 r0 = new wb.m0
            r1 = 23
            r0.<init>(r1)
            java.lang.String r1 = "parametersCondition"
            r2 = 0
            ng.i r4 = h(r4, r6, r1, r2, r0)
            wb.m0 r0 = new wb.m0
            r1 = 24
            r0.<init>(r1)
            java.lang.String r1 = "parameterCount"
            ng.i r4 = h(r4, r6, r1, r2, r0)
            wb.m0 r0 = new wb.m0
            r1 = 25
            r0.<init>(r1)
            java.lang.String r1 = "parameterCountCondition"
            ng.i r4 = h(r4, r6, r1, r2, r0)
            java.util.LinkedHashSet r0 = r5.f11519i
            wb.m0 r1 = new wb.m0
            r3 = 26
            r1.<init>(r3)
            java.lang.String r3 = "typeParameters"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11520j
            wb.m0 r1 = new wb.m0
            r3 = 27
            r1.<init>(r3)
            java.lang.String r3 = "typeParametersNot"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11521k
            x6.a r1 = new x6.a
            r3 = 14
            r1.<init>(r6, r3)
            java.lang.String r3 = "exceptionTypes"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11522l
            x6.a r1 = new x6.a
            r3 = 15
            r1.<init>(r6, r3)
            java.lang.String r3 = "exceptionTypesNot"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11523m
            wb.m0 r1 = new wb.m0
            r3 = 29
            r1.<init>(r3)
            java.lang.String r3 = "genericExceptionTypes"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11524n
            wb.m0 r1 = new wb.m0
            r3 = 17
            r1.<init>(r3)
            java.lang.String r3 = "genericExceptionTypesNot"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11525o
            wb.m0 r1 = new wb.m0
            r3 = 18
            r1.<init>(r3)
            java.lang.String r3 = "genericParameters"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11526p
            wb.m0 r1 = new wb.m0
            r3 = 19
            r1.<init>(r3)
            java.lang.String r3 = "genericParametersNot"
            ng.i r4 = h(r4, r6, r3, r0, r1)
            wb.m0 r0 = new wb.m0
            r1 = 20
            r0.<init>(r1)
            java.lang.String r1 = "isVarArgs"
            ng.i r4 = h(r4, r6, r1, r2, r0)
            wb.m0 r0 = new wb.m0
            r1 = 21
            r0.<init>(r1)
            java.lang.String r1 = "isVarArgsNot"
            ng.i r4 = h(r4, r6, r1, r2, r0)
            java.util.ArrayList r0 = r5.f11527q
            x6.a r1 = new x6.a
            r2 = 3
            r1.<init>(r6, r2)
            java.lang.String r2 = "parameterAnnotations"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            java.util.ArrayList r0 = r5.f11528r
            x6.a r1 = new x6.a
            r2 = 4
            r1.<init>(r6, r2)
            java.lang.String r2 = "parameterAnnotationsNot"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11529s
            x6.a r1 = new x6.a
            r2 = 5
            r1.<init>(r6, r2)
            java.lang.String r2 = "annotatedReturnType"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11530t
            x6.a r1 = new x6.a
            r2 = 6
            r1.<init>(r6, r2)
            java.lang.String r2 = "annotatedReturnTypeNot"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11531u
            x6.a r1 = new x6.a
            r2 = 7
            r1.<init>(r6, r2)
            java.lang.String r2 = "annotatedReceiverType"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11532v
            x6.a r1 = new x6.a
            r2 = 9
            r1.<init>(r6, r2)
            java.lang.String r2 = "annotatedReceiverTypeNot"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11533w
            x6.a r1 = new x6.a
            r2 = 10
            r1.<init>(r6, r2)
            java.lang.String r2 = "annotatedParameterTypes"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11534x
            x6.a r1 = new x6.a
            r2 = 11
            r1.<init>(r6, r2)
            java.lang.String r2 = "annotatedParameterTypesNot"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            java.util.LinkedHashSet r0 = r5.f11535y
            x6.a r1 = new x6.a
            r2 = 12
            r1.<init>(r6, r2)
            java.lang.String r2 = "annotatedExceptionTypes"
            ng.i r4 = h(r4, r6, r2, r0, r1)
            java.util.LinkedHashSet r5 = r5.f11536z
            x6.a r0 = new x6.a
            r1 = 13
            r0.<init>(r6, r1)
            java.lang.String r1 = "annotatedExceptionTypesNot"
            ng.i r4 = h(r4, r6, r1, r5, r0)
            return r4
    }

    public static ng.i h(ng.j r1, r6.c r2, java.lang.String r3, java.lang.Object r4, fg.p r5) {
            wb.dj r0 = new wb.dj
            r0.<init>(r4, r5, r2, r3)
            ng.i r2 = new ng.i
            r3 = 1
            r2.<init>(r1, r3, r0)
            return r2
    }

    public static java.util.List i(r6.d r3, r6.c r4, java.lang.Class r5, fg.l r6) {
            tf.t r0 = tf.t.f13167g
            if (r5 == 0) goto L30
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            gg.f r2 = gg.v.a(r1)
            java.lang.Class r2 = a.a.a0(r2)
            if (r2 != 0) goto L11
            goto L12
        L11:
            r1 = r2
        L12:
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L19
            goto L30
        L19:
            java.lang.Object r5 = r6.invoke(r5)
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L2c
            r4.getClass()
            j(r3, r4)
            goto L2d
        L2c:
            r0 = r5
        L2d:
            java.util.List r0 = (java.util.List) r0
            return r0
        L30:
            j(r3, r4)
            return r0
    }

    public static void j(r6.d r16, r6.c r17) {
            r1 = r16
            r2 = r17
            java.lang.String r3 = " (Kotlin reflection is not available)"
            r2.getClass()
            java.lang.Class r4 = r2.f11541a
            java.lang.String r5 = ""
            java.lang.String r0 = "-+"
            java.lang.String r6 = "+-"
            java.lang.String r7 = "-"
            r8 = 0
            java.util.Map r9 = r1.a()     // Catch: java.lang.Throwable -> L47
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L47
            r10.<init>()     // Catch: java.lang.Throwable -> L47
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L47
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L47
        L25:
            boolean r11 = r9.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r11 == 0) goto L7a
            java.lang.Object r11 = r9.next()     // Catch: java.lang.Throwable -> L47
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch: java.lang.Throwable -> L47
            java.lang.Object r12 = r11.getKey()     // Catch: java.lang.Throwable -> L47
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L47
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> L47
            r13 = 0
            if (r11 != 0) goto L40
        L3e:
            r11 = r13
            goto L61
        L40:
            boolean r14 = r11 instanceof sf.b     // Catch: java.lang.Throwable -> L47
            if (r14 == 0) goto L4a
            java.lang.String r11 = "(Runtime Condition)"
            goto L61
        L47:
            r0 = move-exception
            goto L182
        L4a:
            boolean r14 = r11 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L47
            if (r14 == 0) goto L5d
            r14 = r11
            java.util.Collection r14 = (java.util.Collection) r14     // Catch: java.lang.Throwable -> L47
            boolean r14 = r14.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r14 == 0) goto L58
            goto L3e
        L58:
            java.lang.String r11 = s6.b.a(r11)     // Catch: java.lang.Throwable -> L47
            goto L61
        L5d:
            java.lang.String r11 = s6.b.a(r11)     // Catch: java.lang.Throwable -> L47
        L61:
            if (r11 == 0) goto L6c
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L47
            java.lang.String r11 = og.t.a0(r11, r3, r5, r8)     // Catch: java.lang.Throwable -> L47
            goto L6d
        L6c:
            r11 = r13
        L6d:
            if (r11 == 0) goto L74
            sf.e r13 = new sf.e     // Catch: java.lang.Throwable -> L47
            r13.<init>(r12, r11)     // Catch: java.lang.Throwable -> L47
        L74:
            if (r13 == 0) goto L25
            r10.add(r13)     // Catch: java.lang.Throwable -> L47
            goto L25
        L7a:
            boolean r9 = r10.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r9 == 0) goto L86
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L47
            goto L188
        L86:
            java.util.Iterator r9 = r10.iterator()     // Catch: java.lang.Throwable -> L47
            boolean r11 = r9.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r11 == 0) goto L17c
            java.lang.Object r11 = r9.next()     // Catch: java.lang.Throwable -> L47
            sf.e r11 = (sf.e) r11     // Catch: java.lang.Throwable -> L47
            java.lang.Object r11 = r11.f12418g     // Catch: java.lang.Throwable -> L47
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L47
            int r11 = c(r11)     // Catch: java.lang.Throwable -> L47
        L9e:
            boolean r12 = r9.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r12 == 0) goto Lb6
            java.lang.Object r12 = r9.next()     // Catch: java.lang.Throwable -> L47
            sf.e r12 = (sf.e) r12     // Catch: java.lang.Throwable -> L47
            java.lang.Object r12 = r12.f12418g     // Catch: java.lang.Throwable -> L47
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L47
            int r12 = c(r12)     // Catch: java.lang.Throwable -> L47
            if (r11 >= r12) goto L9e
            r11 = r12
            goto L9e
        Lb6:
            java.util.Iterator r9 = r10.iterator()     // Catch: java.lang.Throwable -> L47
            boolean r12 = r9.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r12 == 0) goto L176
            java.lang.Object r12 = r9.next()     // Catch: java.lang.Throwable -> L47
            sf.e r12 = (sf.e) r12     // Catch: java.lang.Throwable -> L47
            java.lang.Object r12 = r12.f12419h     // Catch: java.lang.Throwable -> L47
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Throwable -> L47
            int r12 = c(r12)     // Catch: java.lang.Throwable -> L47
        Lce:
            boolean r13 = r9.hasNext()     // Catch: java.lang.Throwable -> L47
            if (r13 == 0) goto Le6
            java.lang.Object r13 = r9.next()     // Catch: java.lang.Throwable -> L47
            sf.e r13 = (sf.e) r13     // Catch: java.lang.Throwable -> L47
            java.lang.Object r13 = r13.f12419h     // Catch: java.lang.Throwable -> L47
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L47
            int r13 = c(r13)     // Catch: java.lang.Throwable -> L47
            if (r12 >= r13) goto Lce
            r12 = r13
            goto Lce
        Le6:
            java.lang.String r9 = r4.toString()     // Catch: java.lang.Throwable -> L47
            java.lang.String r9 = og.t.a0(r9, r3, r5, r8)     // Catch: java.lang.Throwable -> L47
            int r13 = c(r9)     // Catch: java.lang.Throwable -> L47
            int r14 = r11 + r12
            int r14 = r14 + 3
            int r13 = r13 - r14
            if (r13 >= 0) goto Lfa
            r13 = r8
        Lfa:
            int r12 = r12 + r13
            java.lang.String r13 = og.t.Z(r11, r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r14 = og.t.Z(r12, r7)     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r15.<init>()     // Catch: java.lang.Throwable -> L47
            r15.append(r6)     // Catch: java.lang.Throwable -> L47
            r15.append(r13)     // Catch: java.lang.Throwable -> L47
            java.lang.String r13 = "-+-"
            r15.append(r13)     // Catch: java.lang.Throwable -> L47
            r15.append(r14)     // Catch: java.lang.Throwable -> L47
            r15.append(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.String r13 = r15.toString()     // Catch: java.lang.Throwable -> L47
            int r14 = r11 + r12
            int r14 = r14 + 3
            java.lang.String r7 = og.t.Z(r14, r7)     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r15.<init>()     // Catch: java.lang.Throwable -> L47
            r15.append(r6)     // Catch: java.lang.Throwable -> L47
            r15.append(r7)     // Catch: java.lang.Throwable -> L47
            r15.append(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = r15.toString()     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = d(r14, r9)     // Catch: java.lang.Throwable -> L47
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r7.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r9 = "| "
            r7.append(r9)     // Catch: java.lang.Throwable -> L47
            r7.append(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = " |"
            r7.append(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = "\n"
            x6.b r14 = new x6.b     // Catch: java.lang.Throwable -> L47
            r14.<init>(r11, r12)     // Catch: java.lang.Throwable -> L47
            r15 = 30
            r12 = 0
            r9 = r13
            r13 = 0
            r11 = r7
            java.lang.String r7 = tf.m.A1(r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L47
            java.lang.String[] r0 = new java.lang.String[]{r0, r6, r9, r7, r9}     // Catch: java.lang.Throwable -> L47
            java.util.List r9 = a.a.y0(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.String r10 = "\n"
            r13 = 0
            r14 = 62
            r11 = 0
            r12 = 0
            java.lang.String r0 = tf.m.A1(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L47
            goto L188
        L176:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            throw r0     // Catch: java.lang.Throwable -> L47
        L17c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L47
            throw r0     // Catch: java.lang.Throwable -> L47
        L182:
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L188:
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = og.t.a0(r4, r3, r5, r8)
            java.lang.String r4 = "\nFailed to build condition table."
            java.lang.String r3 = r3.concat(r4)
            boolean r4 = r0 instanceof sf.f
            if (r4 == 0) goto L19b
            r0 = r3
        L19b:
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r1 instanceof q6.c
            java.lang.String r4 = "Unsupported condition type: "
            java.lang.String r6 = "\nSuggestion: "
            java.lang.String r7 = ".\n"
            java.lang.String r8 = "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. "
            if (r3 == 0) goto L1b7
            java.lang.String r9 = "No method found matching the condition for current class"
            java.lang.StringBuilder r0 = bc.e.p(r9, r5, r7, r0, r6)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            goto L1d5
        L1b7:
            boolean r9 = r1 instanceof q6.a
            if (r9 == 0) goto L1c4
            java.lang.String r5 = "No constructor found matching the condition for current class.\n"
            java.lang.String r6 = "\nSuggestion: Constructors are not inherited from superclass, check if the conditions are correct and valid, and try again. "
            java.lang.String r0 = eh.a.n(r5, r0, r6)
            goto L1d5
        L1c4:
            boolean r9 = r1 instanceof q6.b
            if (r9 == 0) goto L21a
            java.lang.String r9 = "No field found matching the condition for current class"
            java.lang.StringBuilder r0 = bc.e.p(r9, r5, r7, r0, r6)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
        L1d5:
            r6.b r2 = r2.f11542b
            r6.b r5 = r6.b.f11537g
            if (r2 != r5) goto L209
            java.lang.String r2 = "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.1.0 ======\n"
            if (r3 != 0) goto L1ff
            boolean r3 = r1 instanceof q6.a
            if (r3 != 0) goto L1f5
            boolean r3 = r1 instanceof q6.b
            if (r3 != 0) goto L1eb
            okio.a.p(r1, r4)
            return
        L1eb:
            java.lang.NoSuchFieldException r1 = new java.lang.NoSuchFieldException
            java.lang.String r0 = r0.concat(r2)
            r1.<init>(r0)
            goto L208
        L1f5:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.String r0 = r0.concat(r2)
            r1.<init>(r0)
            goto L208
        L1ff:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.String r0 = r0.concat(r2)
            r1.<init>(r0)
        L208:
            throw r1
        L209:
            r6.b r1 = r6.b.f11538h
            if (r2 != r1) goto L219
            java.lang.CharSequence r0 = og.m.R0(r0)
            r0.toString()
            y6.a r0 = y6.b.f22306a
            r0.ordinal()
        L219:
            return
        L21a:
            okio.a.p(r1, r4)
            return
    }

    public static java.lang.Class k(java.lang.Object r2, r6.c r3, java.lang.String r4) {
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r2 = (java.lang.Class) r2
            goto L64
        L7:
            boolean r0 = r2 instanceof mg.b
            if (r0 == 0) goto L1a
            mg.b r2 = (mg.b) r2
            r2.getClass()
            gg.e r2 = (gg.e) r2
            java.lang.Class r2 = r2.a()
            r2.getClass()
            goto L64
        L1a:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L5c
            r6.b r0 = r3.f11542b
            java.lang.Class r3 = r3.f11541a
            r6.b r1 = r6.b.f11537g
            if (r0 != r1) goto L31
            java.lang.String r2 = (java.lang.String) r2
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.Class r2 = t6.a.a(r3, r2)
            goto L64
        L31:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.Class r2 = t6.a.a(r3, r2)     // Catch: java.lang.Throwable -> L3c
            goto L43
        L3c:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L43:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L49
            r2 = 0
        L49:
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 != 0) goto L64
            java.lang.Class<x6.d> r2 = x6.d.class
            gg.f r3 = gg.v.a(r2)
            java.lang.Class r3 = a.a.a0(r3)
            if (r3 != 0) goto L5a
            goto L64
        L5a:
            r2 = r3
            goto L64
        L5c:
            boolean r3 = r2 instanceof s6.b
            if (r3 == 0) goto L84
            java.lang.Class r2 = r2.getClass()
        L64:
            java.lang.Class<s6.b> r3 = s6.b.class
            gg.f r0 = gg.v.a(r3)
            java.lang.Class r0 = a.a.a0(r0)
            if (r0 != 0) goto L71
            goto L72
        L71:
            r3 = r0
        L72:
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L83
            if (r4 != 0) goto L7b
            goto L83
        L7b:
            java.lang.String r2 = "VagueType is not supported for \""
            java.lang.String r3 = "\"."
            okio.a.m(r4, r2, r3)
        L82:
            r2 = 0
        L83:
            return r2
        L84:
            java.lang.String r3 = "Unsupported type: "
            java.lang.String r4 = ", supported types are Class, KClass, String and VagueType."
            okio.a.m(r2, r3, r4)
            goto L82
    }
}
