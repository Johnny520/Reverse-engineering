package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class Name implements java.io.Serializable {
    private static java.lang.String FINISHED;
    private static final java.util.regex.Pattern noOverride = null;
    java.lang.Class<?> asClass;
    private int callstackDepth;
    java.lang.Class<?> classOfStaticMethod;
    private java.lang.Object evalBaseObject;
    private java.lang.String evalName;
    private java.lang.String lastEvalName;
    public bsh.NameSpace namespace;
    java.lang.String value;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Parts {
        private static final java.util.Map<java.lang.String, bsh.Name.Parts> PARTSCACHE = null;
        public final int count;
        private final java.util.List<java.lang.String> list;
        private final java.lang.String[] prefix;
        private final java.lang.String[] suffix;

        static {
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                bsh.Name.Parts.PARTSCACHE = r0
                return
        }

        private Parts(java.lang.String r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "\\."
                java.lang.String[] r2 = r2.split(r0)
                java.util.List r2 = java.util.Arrays.asList(r2)
                r1.list = r2
                int r2 = r2.size()
                r1.count = r2
                int r0 = r2 + 1
                java.lang.String[] r0 = new java.lang.String[r0]
                r1.prefix = r0
                int r2 = r2 + 1
                java.lang.String[] r2 = new java.lang.String[r2]
                r1.suffix = r2
                return
        }

        public static /* bridge */ /* synthetic */ java.util.Map a() {
                java.util.Map<java.lang.String, bsh.Name$Parts> r0 = bsh.Name.Parts.PARTSCACHE
                return r0
        }

        public static bsh.Name.Parts get(java.lang.String r4) {
                java.util.Map<java.lang.String, bsh.Name$Parts> r0 = bsh.Name.Parts.PARTSCACHE
                boolean r1 = r0.containsKey(r4)
                if (r1 == 0) goto L14
                java.lang.Object r1 = r0.get(r4)
                bsh.Name$Parts r1 = (bsh.Name.Parts) r1
                if (r1 == 0) goto L11
                return r1
            L11:
                r0.remove(r4)
            L14:
                bsh.Name$Parts r1 = new bsh.Name$Parts
                r1.<init>(r4)
                r0.put(r4, r1)
                java.lang.String[] r0 = r1.prefix
                int r2 = r1.count
                r0[r2] = r4
                java.lang.String[] r3 = r1.suffix
                r3[r2] = r4
                r4 = 1
                if (r2 != r4) goto L2a
                return r1
            L2a:
                java.util.List<java.lang.String> r2 = r1.list
                r3 = 0
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                r0[r4] = r2
                java.lang.String[] r0 = r1.suffix
                java.util.List<java.lang.String> r2 = r1.list
                int r3 = r1.count
                int r3 = r3 - r4
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                r0[r4] = r2
                return r1
        }

        public java.lang.String prefix(int r4) {
                r3 = this;
                r0 = 1
                if (r0 > r4) goto L22
                int r0 = r3.count
                if (r0 >= r4) goto L8
                goto L22
            L8:
                java.lang.String[] r0 = r3.prefix
                r1 = r0[r4]
                if (r1 != 0) goto L1d
                java.util.List<java.lang.String> r1 = r3.list
                r2 = 0
                java.util.List r1 = r1.subList(r2, r4)
                java.lang.String r2 = "."
                java.lang.String r1 = java.lang.String.join(r2, r1)
                r0[r4] = r1
            L1d:
                java.lang.String[] r0 = r3.prefix
                r4 = r0[r4]
                return r4
            L22:
                r4 = 0
                return r4
        }

        public java.lang.String suffix(int r5) {
                r4 = this;
                r0 = 1
                if (r0 > r5) goto L23
                int r0 = r4.count
                if (r0 >= r5) goto L8
                goto L23
            L8:
                java.lang.String[] r1 = r4.suffix
                r2 = r1[r5]
                if (r2 != 0) goto L1e
                java.util.List<java.lang.String> r2 = r4.list
                int r3 = r0 - r5
                java.util.List r0 = r2.subList(r3, r0)
                java.lang.String r2 = "."
                java.lang.String r0 = java.lang.String.join(r2, r0)
                r1[r5] = r0
            L1e:
                java.lang.String[] r0 = r4.suffix
                r5 = r0[r5]
                return r5
            L23:
                r5 = 0
                return r5
        }
    }

    static {
            java.lang.String r0 = "eval|assert"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bsh.Name.noOverride = r0
            return
    }

    public Name(bsh.NameSpace r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.namespace = r1
            r0.value = r2
            return
    }

    public static void clearParts() {
            java.util.Map r0 = bsh.Name.Parts.a()
            monitor-enter(r0)
            java.util.Map r1 = bsh.Name.Parts.a()     // Catch: java.lang.Throwable -> Le
            r1.clear()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    private java.lang.Object completeRound(java.lang.String r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            if (r3 == 0) goto L9
            r0.lastEvalName = r1
            r0.evalName = r2
            r0.evalBaseObject = r3
            return r3
        L9:
            java.lang.String r2 = "lastEvalName = "
            java.lang.String r1 = wb.en.g(r2, r1)
            bsh.j.f(r1)
            r1 = 0
            return r1
    }

    private java.lang.Object consumeNextObjectField(bsh.CallStack r8, bsh.Interpreter r9, boolean r10, boolean r11) {
            r7 = this;
            java.lang.Object r0 = r7.evalBaseObject
            if (r0 != 0) goto L27
            java.lang.String r0 = r7.evalName
            boolean r0 = isCompound(r0)
            if (r0 != 0) goto L27
            if (r10 != 0) goto L27
            bsh.NameSpace r3 = r7.namespace
            java.lang.String r5 = r7.evalName
            r6 = 0
            r1 = r7
            r2 = r8
            r4 = r9
            java.lang.Object r8 = r1.resolveThisFieldReference(r2, r3, r4, r5, r6)
            bsh.Primitive r9 = bsh.Primitive.VOID
            if (r8 == r9) goto L2a
            java.lang.String r9 = r1.evalName
            java.lang.String r10 = bsh.Name.FINISHED
            java.lang.Object r8 = r7.completeRound(r9, r10, r8)
            return r8
        L27:
            r1 = r7
            r2 = r8
            r4 = r9
        L2a:
            java.lang.String r8 = r1.evalName
            r9 = 1
            java.lang.String r5 = prefix(r8, r9)
            java.lang.Object r8 = r1.evalBaseObject
            if (r8 == 0) goto L39
            boolean r0 = r8 instanceof bsh.This
            if (r0 == 0) goto L5f
        L39:
            if (r10 != 0) goto L5f
            if (r8 != 0) goto L46
            bsh.NameSpace r3 = r1.namespace
            r6 = 0
            java.lang.Object r8 = r1.resolveThisFieldReference(r2, r3, r4, r5, r6)
            r1 = r7
            goto L50
        L46:
            bsh.This r8 = (bsh.This) r8
            bsh.NameSpace r3 = r8.namespace
            r6 = 1
            r1 = r7
            java.lang.Object r8 = r1.resolveThisFieldReference(r2, r3, r4, r5, r6)
        L50:
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r8 == r0) goto L5f
            java.lang.String r9 = r1.evalName
            java.lang.String r9 = suffix(r9)
            java.lang.Object r8 = r7.completeRound(r5, r9, r8)
            return r8
        L5f:
            java.lang.Object r8 = r1.evalBaseObject
            r2 = 0
            if (r8 != 0) goto Lac
            java.lang.String r8 = "trying class: "
            java.lang.String r0 = r1.evalName
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            bsh.Interpreter.debug(r8)
            r8 = r9
            r0 = r2
            r3 = r0
        L72:
            java.lang.String r6 = r1.evalName
            int r6 = countParts(r6)
            if (r8 > r6) goto L8c
            java.lang.String r0 = r1.evalName
            java.lang.String r3 = prefix(r0, r8)
            bsh.NameSpace r0 = r1.namespace
            java.lang.Class r0 = r0.getClass(r3)
            if (r0 == 0) goto L89
            goto L8c
        L89:
            int r8 = r8 + 1
            goto L72
        L8c:
            java.lang.String r6 = r1.evalName
            if (r0 == 0) goto La3
            int r9 = countParts(r6)
            int r9 = r9 - r8
            java.lang.String r8 = suffix(r6, r9)
            bsh.ClassIdentifier r9 = new bsh.ClassIdentifier
            r9.<init>(r0)
            java.lang.Object r8 = r7.completeRound(r3, r8, r9)
            return r8
        La3:
            java.lang.String r8 = "not a class, trying var prefix "
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r6}
            bsh.Interpreter.debug(r8)
        Lac:
            java.lang.Object r8 = r1.evalBaseObject
            if (r8 == 0) goto Lb4
            boolean r0 = r8 instanceof bsh.This
            if (r0 == 0) goto Le5
        Lb4:
            if (r10 != 0) goto Le5
            if (r11 == 0) goto Le5
            if (r8 != 0) goto Lbd
            bsh.NameSpace r8 = r1.namespace
            goto Lc1
        Lbd:
            bsh.This r8 = (bsh.This) r8
            bsh.NameSpace r8 = r8.namespace
        Lc1:
            bsh.NameSpace r10 = new bsh.NameSpace
            java.lang.String r11 = "auto: "
            java.lang.String r11 = wb.en.g(r11, r5)
            r10.<init>(r8, r11)
            bsh.This r10 = r10.getThis(r4)
            java.lang.Object r11 = r1.evalBaseObject
            r0 = 0
            if (r11 != 0) goto Ld6
            goto Ld7
        Ld6:
            r9 = r0
        Ld7:
            r8.setVariable(r5, r10, r0, r9)
            java.lang.String r8 = r1.evalName
            java.lang.String r8 = suffix(r8)
            java.lang.Object r8 = r7.completeRound(r5, r8, r10)
            return r8
        Le5:
            if (r8 != 0) goto L114
            java.lang.String r8 = r1.evalName
            boolean r8 = isCompound(r8)
            if (r8 != 0) goto Lfe
            bsh.NameSpace r8 = r1.namespace
            java.lang.Object r8 = r8.getPropertyValue(r5, r4)
            java.lang.String r9 = r1.evalName
            java.lang.String r10 = bsh.Name.FINISHED
            java.lang.Object r8 = r7.completeRound(r9, r10, r8)
            return r8
        Lfe:
            bsh.UtilEvalError r8 = new bsh.UtilEvalError
            java.lang.String r9 = r1.evalName
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Class or variable not found: "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L114:
            bsh.Primitive r11 = bsh.Primitive.NULL
            if (r8 == r11) goto L294
            bsh.Primitive r11 = bsh.Primitive.VOID
            if (r8 == r11) goto L27e
            boolean r11 = r8 instanceof bsh.Primitive
            if (r11 != 0) goto L268
            boolean r11 = r8 instanceof bsh.ClassIdentifier
            if (r11 == 0) goto L1fa
            bsh.ClassIdentifier r8 = (bsh.ClassIdentifier) r8
            java.lang.Class r8 = r8.getTargetClass()
            java.lang.String r10 = r1.evalName
            java.lang.String r9 = prefix(r10, r9)
            java.lang.String r10 = "this"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L164
            bsh.NameSpace r10 = r1.namespace
        L13a:
            if (r10 == 0) goto L158
            java.lang.Object r11 = r10.classInstance
            if (r11 == 0) goto L153
            java.lang.Class r11 = r11.getClass()
            if (r11 != r8) goto L153
            java.lang.String r8 = r1.evalName
            java.lang.String r8 = suffix(r8)
            java.lang.Object r10 = r10.classInstance
            java.lang.Object r8 = r7.completeRound(r9, r8, r10)
            return r8
        L153:
            bsh.NameSpace r10 = r10.getParent()
            goto L13a
        L158:
            bsh.UtilEvalError r9 = new bsh.UtilEvalError
            java.lang.String r10 = "Can't find enclosing 'this' instance of class: "
            java.lang.String r8 = p.a.k(r8, r10)
            r9.<init>(r8)
            throw r9
        L164:
            bsh.security.MainSecurityGuard r10 = bsh.Interpreter.mainSecurityGuard
            r10.canGetStaticField(r8, r9)
            java.lang.String r10 = "Name call to getStaticFieldValue, class: "
            java.lang.String r11 = ", field:"
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r8, r11, r9}     // Catch: bsh.ReflectError -> L179
            bsh.Interpreter.debug(r10)     // Catch: bsh.ReflectError -> L179
            java.lang.Object r2 = bsh.Reflect.getStaticFieldValue(r8, r9)     // Catch: bsh.ReflectError -> L179
            goto L184
        L179:
            r0 = move-exception
            r10 = r0
            java.lang.String r11 = "field reflect error: "
            java.lang.Object[] r10 = new java.lang.Object[]{r11, r10}
            bsh.Interpreter.debug(r10)
        L184:
            if (r2 != 0) goto L1e9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r8.getName()
            r10.append(r11)
            java.lang.String r11 = "$"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            bsh.NameSpace r11 = r1.namespace
            java.lang.Class r10 = r11.getClass(r10)
            bsh.NameSpace r11 = r1.namespace
            java.lang.Object r11 = r11.classInstance
            if (r11 != 0) goto L1e2
            boolean r11 = bsh.Reflect.isGeneratedClass(r10)
            if (r11 == 0) goto L1e2
            bsh.Modifiers r11 = bsh.Reflect.getClassModifiers(r10)
            java.lang.String r0 = "static"
            boolean r11 = r11.hasModifier(r0)
            if (r11 == 0) goto L1bd
            goto L1e2
        L1bd:
            bsh.UtilEvalError r10 = new bsh.UtilEvalError
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "an enclosing instance that contains "
            r11.<init>(r0)
            r11.append(r8)
            java.lang.String r8 = "."
            r11.append(r8)
            r11.append(r9)
            java.lang.String r8 = " is required"
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8)
            throw r10
        L1e2:
            if (r10 == 0) goto L1e9
            bsh.ClassIdentifier r2 = new bsh.ClassIdentifier
            r2.<init>(r10)
        L1e9:
            if (r2 != 0) goto L1ef
            java.lang.Object r2 = bsh.Reflect.getObjectProperty(r8, r9)
        L1ef:
            java.lang.String r8 = r1.evalName
            java.lang.String r8 = suffix(r8)
            java.lang.Object r8 = r7.completeRound(r9, r8, r2)
            return r8
        L1fa:
            if (r10 != 0) goto L255
            java.lang.String r8 = r1.evalName
            java.lang.String r8 = prefix(r8, r9)
            bsh.security.MainSecurityGuard r9 = bsh.Interpreter.mainSecurityGuard
            java.lang.Object r10 = r1.evalBaseObject
            r9.canGetField(r10, r8)
            java.lang.String r9 = "length"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L233
            java.lang.Object r9 = r1.evalBaseObject
            java.lang.Class r9 = r9.getClass()
            boolean r9 = r9.isArray()
            if (r9 == 0) goto L233
            bsh.Primitive r9 = new bsh.Primitive
            java.lang.Object r10 = r1.evalBaseObject
            int r10 = java.lang.reflect.Array.getLength(r10)
            r9.<init>(r10)
            java.lang.String r10 = r1.evalName
            java.lang.String r10 = suffix(r10)
            java.lang.Object r8 = r7.completeRound(r8, r10, r9)
            return r8
        L233:
            java.lang.Object r9 = r1.evalBaseObject     // Catch: bsh.ReflectError -> L244
            java.lang.Object r9 = bsh.Reflect.getObjectFieldValue(r9, r8)     // Catch: bsh.ReflectError -> L244
            java.lang.String r10 = r1.evalName     // Catch: bsh.ReflectError -> L244
            java.lang.String r10 = suffix(r10)     // Catch: bsh.ReflectError -> L244
            java.lang.Object r8 = r7.completeRound(r8, r10, r9)     // Catch: bsh.ReflectError -> L244
            return r8
        L244:
            java.lang.Object r9 = r1.evalBaseObject
            java.lang.Object r9 = bsh.Reflect.getObjectProperty(r9, r8)
            java.lang.String r10 = r1.evalName
            java.lang.String r10 = suffix(r10)
            java.lang.Object r8 = r7.completeRound(r8, r10, r9)
            return r8
        L255:
            bsh.UtilEvalError r8 = new bsh.UtilEvalError
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r1.value
            java.lang.String r11 = " does not resolve to a class name."
            java.lang.String r9 = eh.a.r(r9, r10, r11)
            r8.<init>(r9)
            throw r8
        L268:
            bsh.UtilEvalError r8 = new bsh.UtilEvalError
            java.lang.String r9 = r1.value
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Can't treat primitive like an object. Error while evaluating: "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L27e:
            bsh.UtilEvalError r8 = new bsh.UtilEvalError
            java.lang.String r9 = r1.value
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Undefined variable or class name while evaluating: "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L294:
            bsh.UtilTargetError r8 = new bsh.UtilTargetError
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Null Pointer while evaluating: "
            r10.<init>(r11)
            java.lang.String r11 = r1.value
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            r8.<init>(r9)
            throw r8
    }

    public static int countParts(java.lang.String r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            bsh.Name$Parts r0 = bsh.Name.Parts.get(r0)
            int r0 = r0.count
            return r0
    }

    public static bsh.NameSpace getClassNameSpace(bsh.NameSpace r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.isClass
            if (r1 == 0) goto L9
            return r2
        L9:
            boolean r1 = r2.isMethod
            if (r1 == 0) goto L20
            bsh.NameSpace r1 = r2.getParent()
            if (r1 == 0) goto L20
            bsh.NameSpace r1 = r2.getParent()
            boolean r1 = r1.isClass
            if (r1 == 0) goto L20
            bsh.NameSpace r2 = r2.getParent()
            return r2
        L20:
            return r0
    }

    private java.lang.Object invokeLocalMethod(bsh.Interpreter r11, java.lang.Object[] r12, bsh.CallStack r13, bsh.Node r14) {
            r10 = this;
            java.lang.String r0 = "invokeLocalMethod: "
            java.lang.String r1 = r10.value
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            bsh.Interpreter.debug(r0)
            if (r11 == 0) goto Lae
            java.lang.String r2 = r10.value
            java.lang.Class[] r0 = bsh.Types.getTypes(r12)
            bsh.security.MainSecurityGuard r1 = bsh.Interpreter.mainSecurityGuard     // Catch: bsh.UtilEvalError -> La4
            r1.canInvokeLocalMethod(r2, r12)     // Catch: bsh.UtilEvalError -> La4
            r1 = 0
            bsh.NameSpace r5 = r10.namespace     // Catch: bsh.UtilEvalError -> L36
            java.lang.String r7 = "this"
            r8 = 0
            r3 = r10
            r6 = r11
            r4 = r13
            java.lang.Object r11 = r3.resolveThisFieldReference(r4, r5, r6, r7, r8)     // Catch: bsh.UtilEvalError -> L32
            r13 = r3
            r5 = r4
            r4 = r6
            boolean r3 = r11 instanceof bsh.This     // Catch: bsh.UtilEvalError -> L39
            if (r3 == 0) goto L30
            java.lang.Object r11 = bsh.Primitive.unwrap(r11)     // Catch: bsh.UtilEvalError -> L39
        L30:
            r9 = r11
            goto L3a
        L32:
            r13 = r3
            r5 = r4
            r4 = r6
            goto L39
        L36:
            r4 = r11
            r5 = r13
            r13 = r10
        L39:
            r9 = r1
        L3a:
            if (r9 == 0) goto L52
            bsh.Primitive r11 = bsh.Primitive.NULL     // Catch: bsh.UtilEvalError -> L4f
            if (r9 == r11) goto L52
            bsh.Primitive r11 = bsh.Primitive.VOID     // Catch: bsh.UtilEvalError -> L4f
            if (r9 == r11) goto L52
            bsh.NameSpace r11 = r13.namespace     // Catch: bsh.UtilEvalError -> L4f
            java.lang.Class r1 = bsh.Types.getType(r9)     // Catch: bsh.UtilEvalError -> L4f
            bsh.BshMethod r1 = r11.getExtensionMethod(r1, r2, r0)     // Catch: bsh.UtilEvalError -> L4f
            goto L52
        L4f:
            r0 = move-exception
            r11 = r0
            goto L5d
        L52:
            r11 = 0
            if (r1 != 0) goto L5b
            bsh.NameSpace r1 = r13.namespace     // Catch: bsh.UtilEvalError -> L4f
            bsh.BshMethod r1 = r1.getMethod(r2, r0, r11, r11)     // Catch: bsh.UtilEvalError -> L4f
        L5b:
            r3 = r1
            goto L64
        L5d:
            java.lang.String r12 = "Local method invocation"
            bsh.EvalError r11 = r11.toEvalError(r12, r14, r5)
            throw r11
        L64:
            bsh.NameSpace r1 = r13.namespace
            if (r3 == 0) goto L9d
            boolean r0 = r1.isMethod
            if (r0 != 0) goto L93
            boolean r0 = r3.isScriptedObject
            if (r0 != 0) goto L93
            bsh.NameSpace r0 = r3.declaringNameSpace
            boolean r0 = r1.isChildOf(r0)
            if (r0 == 0) goto L93
            bsh.NameSpace r0 = r13.namespace
            bsh.NameSpace r0 = r0.getParent()
            boolean r0 = r0.isClass
            if (r0 != 0) goto L93
            java.util.regex.Pattern r0 = bsh.Name.noOverride
            java.lang.String r1 = r3.getName()
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L93
            r11 = 1
        L93:
            r8 = r11
            r7 = r14
            r6 = r5
            r5 = r4
            r4 = r12
            java.lang.Object r11 = r3.invoke(r4, r5, r6, r7, r8, r9)
            return r11
        L9d:
            r3 = r12
            r6 = r14
            java.lang.Object r11 = r1.invokeCommand(r2, r3, r4, r5, r6)
            return r11
        La4:
            r0 = move-exception
            r5 = r13
            r6 = r14
            r13 = r10
            r11 = r0
            bsh.EvalError r11 = r11.toEvalError(r6, r5)
            throw r11
        Lae:
            r13 = r10
            java.lang.String r11 = "invokeLocalMethod: interpreter = null"
            bsh.j.f(r11)
            r11 = 0
            return r11
    }

    public static boolean isCompound(java.lang.String r1) {
            int r1 = countParts(r1)
            r0 = 1
            if (r1 <= r0) goto L8
            return r0
        L8:
            r1 = 0
            return r1
    }

    public static java.lang.String prefix(java.lang.String r1) {
            int r0 = countParts(r1)
            int r0 = r0 + (-1)
            java.lang.String r1 = prefix(r1, r0)
            return r1
    }

    public static java.lang.String prefix(java.lang.String r0, int r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            bsh.Name$Parts r0 = bsh.Name.Parts.get(r0)
            java.lang.String r0 = r0.prefix(r1)
            return r0
    }

    private void reset() {
            r1 = this;
            java.lang.String r0 = r1.value
            r1.evalName = r0
            r0 = 0
            r1.evalBaseObject = r0
            r0 = 0
            r1.callstackDepth = r0
            return
    }

    public static java.lang.String suffix(java.lang.String r1) {
            int r0 = countParts(r1)
            int r0 = r0 + (-1)
            java.lang.String r1 = suffix(r1, r0)
            return r1
    }

    public static java.lang.String suffix(java.lang.String r0, int r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            bsh.Name$Parts r0 = bsh.Name.Parts.get(r0)
            java.lang.String r0 = r0.suffix(r1)
            return r0
    }

    public java.lang.Object invokeMethod(bsh.Interpreter r9, java.lang.Object[] r10, bsh.CallStack r11, bsh.Node r12) {
            r8 = this;
            java.lang.String r0 = r8.value
            r1 = 1
            java.lang.String r3 = suffix(r0, r1)
            r6 = r3
            bsh.BshClassManager r3 = r9.getClassManager()
            bsh.NameSpace r0 = r11.top()
            java.lang.Class<?> r2 = r8.classOfStaticMethod
            if (r2 == 0) goto L20
            bsh.security.MainSecurityGuard r9 = bsh.Interpreter.mainSecurityGuard
            r9.canInvokeStaticMethod(r2, r6, r10)
            java.lang.Class<?> r9 = r8.classOfStaticMethod
            java.lang.Object r9 = bsh.Reflect.invokeStaticMethod(r3, r9, r6, r10, r12)
            return r9
        L20:
            java.lang.String r2 = r8.value
            boolean r2 = isCompound(r2)
            if (r2 != 0) goto L2d
            java.lang.Object r9 = r8.invokeLocalMethod(r9, r10, r11, r12)
            return r9
        L2d:
            java.lang.String r2 = r8.value
            java.lang.String r2 = prefix(r2)
            java.lang.String r4 = "super"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L6b
            java.lang.String r4 = r8.value
            int r4 = countParts(r4)
            r5 = 2
            if (r4 != r5) goto L6b
            bsh.This r4 = r0.getThis(r9)
            bsh.NameSpace r4 = r4.getNameSpace()
            r4.setNode(r12)
            bsh.NameSpace r4 = getClassNameSpace(r4)
            if (r4 == 0) goto L6b
            r5 = r4
            java.lang.Object r4 = r5.getClassInstance()
            java.lang.Class<?> r5 = r5.classStatic
            bsh.security.MainSecurityGuard r9 = bsh.Interpreter.mainSecurityGuard
            r9.canInvokeMethod(r4, r6, r10)
            bsh.ClassGenerator r2 = bsh.ClassGenerator.getClassGenerator()
            r7 = r10
            java.lang.Object r9 = r2.invokeSuperclassMethod(r3, r4, r5, r6, r7)
            return r9
        L6b:
            r4 = r10
            bsh.Name r10 = r0.getNameResolver(r2)
            java.lang.Object r2 = r10.toObject(r11, r9)
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r2 == r0) goto L105
            boolean r0 = r2 instanceof bsh.ClassIdentifier
            if (r0 != 0) goto Ld3
            boolean r0 = r2 instanceof bsh.Primitive
            if (r0 == 0) goto La6
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r2 == r0) goto L85
            goto La6
        L85:
            bsh.UtilTargetError r9 = new bsh.UtilTargetError
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Null Pointer in Method Invocation of "
            r12.<init>(r0)
            r12.append(r6)
            java.lang.String r0 = "() on variable: "
            r12.append(r0)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            r9.<init>(r11)
            throw r9
        La6:
            java.lang.Class r10 = r2.getClass()
            boolean r10 = r10.isEnum()
            if (r10 == 0) goto Lc5
            bsh.NameSpace r10 = bsh.Reflect.getThisNS(r2)
            if (r10 == 0) goto Lc5
            java.lang.Class[] r0 = bsh.Types.getTypes(r4)
            bsh.BshMethod r10 = r10.getMethod(r6, r0, r1)
            if (r10 == 0) goto Lc5
            java.lang.Object r9 = r10.invoke(r4, r9, r11, r12)
            return r9
        Lc5:
            bsh.security.MainSecurityGuard r10 = bsh.Interpreter.mainSecurityGuard
            r10.canInvokeMethod(r2, r6, r4)
            r5 = r9
            r7 = r12
            r3 = r6
            r6 = r11
            java.lang.Object r9 = bsh.Reflect.invokeObjectMethod(r2, r3, r4, r5, r6, r7)
            return r9
        Ld3:
            r7 = r12
            java.lang.String r9 = "invokeMethod: trying static - "
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10}
            bsh.Interpreter.debug(r9)
            bsh.ClassIdentifier r2 = (bsh.ClassIdentifier) r2
            java.lang.Class r9 = r2.getTargetClass()
            r8.classOfStaticMethod = r9
            if (r9 == 0) goto Lf1
            bsh.security.MainSecurityGuard r10 = bsh.Interpreter.mainSecurityGuard
            r10.canInvokeStaticMethod(r9, r6, r4)
            java.lang.Object r9 = bsh.Reflect.invokeStaticMethod(r3, r9, r6, r4, r7)
            return r9
        Lf1:
            bsh.UtilEvalError r9 = new bsh.UtilEvalError
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "invokeMethod: unknown target: "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L105:
            bsh.UtilEvalError r9 = new bsh.UtilEvalError
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Attempt to resolve method: "
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r12 = "() on undefined variable or class name: "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
    }

    public java.lang.Object resolveThisFieldReference(bsh.CallStack r8, bsh.NameSpace r9, bsh.Interpreter r10, java.lang.String r11, boolean r12) {
            r7 = this;
            java.lang.String r0 = "this"
            boolean r1 = r11.equals(r0)
            r2 = 0
            if (r1 == 0) goto L53
            r8 = r9
        La:
            if (r8 == 0) goto L29
            bsh.This$Keys r11 = bsh.This.Keys.BSHEXTENSIONMETHODRECEIVER
            java.lang.String r11 = r11.toString()
            java.lang.Object r11 = r8.getVariable(r11, r2)
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r11 == r0) goto L1f
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r11 == r0) goto L1f
            return r11
        L1f:
            boolean r11 = r8.isClass
            if (r11 == 0) goto L24
            goto L29
        L24:
            bsh.NameSpace r8 = r8.getParent()
            goto La
        L29:
            if (r12 != 0) goto L4b
            bsh.This r8 = r9.getThis(r10)
            bsh.NameSpace r9 = r8.getNameSpace()
            bsh.NameSpace r9 = getClassNameSpace(r9)
            if (r9 == 0) goto L4a
            java.lang.String r8 = r7.evalName
            boolean r8 = isCompound(r8)
            if (r8 == 0) goto L46
            bsh.This r8 = r9.getThis(r10)
            return r8
        L46:
            java.lang.Object r8 = r9.getClassInstance()
        L4a:
            return r8
        L4b:
            bsh.UtilEvalError r8 = new bsh.UtilEvalError
            java.lang.String r9 = "Redundant to call .this on This type"
            r8.<init>(r9)
            throw r8
        L53:
            java.lang.String r1 = "super"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L76
            bsh.This r8 = r9.getSuper(r10)
            bsh.NameSpace r9 = r8.getNameSpace()
            bsh.NameSpace r11 = r9.getParent()
            if (r11 == 0) goto L75
            bsh.NameSpace r11 = r9.getParent()
            boolean r11 = r11.isClass
            if (r11 == 0) goto L75
            bsh.This r8 = r9.getSuper(r10)
        L75:
            return r8
        L76:
            java.lang.String r1 = "global"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L83
            bsh.This r1 = r9.getGlobal(r10)
            goto L84
        L83:
            r1 = 0
        L84:
            if (r1 != 0) goto Lc6
            if (r12 == 0) goto Lc6
            java.lang.String r3 = "namespace"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L92
            r1 = r9
            goto Lc6
        L92:
            java.lang.String r3 = "variables"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L9f
            java.lang.String[] r1 = r9.getVariableNames()
            goto Lc6
        L9f:
            java.lang.String r3 = "methods"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto Lac
            java.lang.String[] r1 = r9.getMethodNames()
            goto Lc6
        Lac:
            java.lang.String r3 = "interpreter"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto Lc6
            java.lang.String r1 = r7.lastEvalName
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lbe
            r1 = r10
            goto Lc6
        Lbe:
            bsh.UtilEvalError r8 = new bsh.UtilEvalError
            java.lang.String r9 = "Can only call .interpreter on literal 'this'"
            r8.<init>(r9)
            throw r8
        Lc6:
            r3 = 1
            java.lang.String r4 = "no callstack"
            if (r1 != 0) goto L103
            if (r12 == 0) goto L103
            java.lang.String r5 = "caller"
            boolean r6 = r11.equals(r5)
            if (r6 == 0) goto L103
            java.lang.String r9 = r7.lastEvalName
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto Lee
            java.lang.String r9 = r7.lastEvalName
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto Le6
            goto Lee
        Le6:
            bsh.UtilEvalError r8 = new bsh.UtilEvalError
            java.lang.String r9 = "Can only call .caller on literal 'this' or literal '.caller'"
            r8.<init>(r9)
            throw r8
        Lee:
            if (r8 == 0) goto Lfe
            int r9 = r7.callstackDepth
            int r9 = r9 + r3
            r7.callstackDepth = r9
            bsh.NameSpace r8 = r8.get(r9)
            bsh.This r8 = r8.getThis(r10)
            return r8
        Lfe:
            bsh.j.f(r4)
            r8 = 0
            return r8
        L103:
            if (r1 != 0) goto L127
            if (r12 == 0) goto L127
            java.lang.String r10 = "callstack"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L127
            java.lang.String r10 = r7.lastEvalName
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L11f
            if (r8 == 0) goto L11a
            goto L128
        L11a:
            bsh.j.f(r4)
            r8 = 0
            return r8
        L11f:
            bsh.UtilEvalError r8 = new bsh.UtilEvalError
            java.lang.String r9 = "Can only call .callstack on literal 'this'"
            r8.<init>(r9)
            throw r8
        L127:
            r8 = r1
        L128:
            if (r8 != 0) goto L133
            java.lang.Object r8 = r7.evalBaseObject
            if (r8 != 0) goto L12f
            r2 = r3
        L12f:
            java.lang.Object r8 = r9.getVariable(r11, r2)
        L133:
            if (r8 != 0) goto L137
            bsh.Primitive r8 = bsh.Primitive.NULL
        L137:
            return r8
    }

    public synchronized java.lang.Class<?> toClass() {
            r4 = this;
            java.lang.String r0 = "Class: "
            monitor-enter(r4)
            java.lang.Class<?> r1 = r4.asClass     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L9
            monitor-exit(r4)
            return r1
        L9:
            r4.reset()     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = r4.evalName     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "var"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L32
            r2 = 0
            if (r1 != 0) goto L5d
            java.lang.String r1 = r4.evalName     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "val"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L22
            goto L5d
        L22:
            bsh.NameSpace r1 = r4.namespace     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = r4.evalName     // Catch: java.lang.Throwable -> L32
            java.lang.Class r1 = r1.getClass(r3)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L3e
            r3 = 1
            java.lang.Object r2 = r4.toObject(r2, r2, r3)     // Catch: java.lang.Throwable -> L32 bsh.UtilEvalError -> L34
            goto L34
        L32:
            r0 = move-exception
            goto L61
        L34:
            boolean r3 = r2 instanceof bsh.ClassIdentifier     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            bsh.ClassIdentifier r2 = (bsh.ClassIdentifier) r2     // Catch: java.lang.Throwable -> L32
            java.lang.Class r1 = r2.getTargetClass()     // Catch: java.lang.Throwable -> L32
        L3e:
            if (r1 == 0) goto L44
            r4.asClass = r1     // Catch: java.lang.Throwable -> L32
            monitor-exit(r4)
            return r1
        L44:
            java.lang.ClassNotFoundException r1 = new java.lang.ClassNotFoundException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r4.value     // Catch: java.lang.Throwable -> L32
            r2.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = " not found in namespace"
            r2.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L32
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L32
            throw r1     // Catch: java.lang.Throwable -> L32
        L5d:
            r4.asClass = r2     // Catch: java.lang.Throwable -> L32
            monitor-exit(r4)
            return r2
        L61:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            throw r0
    }

    public synchronized bsh.LHS toLHS(bsh.CallStack r5, bsh.Interpreter r6) {
            r4 = this;
            monitor-enter(r4)
            r4.reset()     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r4.evalName     // Catch: java.lang.Throwable -> L25
            boolean r0 = isCompound(r0)     // Catch: java.lang.Throwable -> L25
            r1 = 0
            if (r0 != 0) goto L39
            java.lang.String r5 = r4.evalName     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = "this"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L25
            if (r5 != 0) goto L31
            bsh.NameSpace r5 = r4.namespace     // Catch: java.lang.Throwable -> L25
            boolean r6 = r5.isClass     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto L28
            bsh.LHS r6 = new bsh.LHS     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r4.evalName     // Catch: java.lang.Throwable -> L25
            r6.<init>(r5, r0)     // Catch: java.lang.Throwable -> L25
            goto L2f
        L25:
            r5 = move-exception
            goto L133
        L28:
            bsh.LHS r6 = new bsh.LHS     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r4.evalName     // Catch: java.lang.Throwable -> L25
            r6.<init>(r5, r0, r1)     // Catch: java.lang.Throwable -> L25
        L2f:
            monitor-exit(r4)
            return r6
        L31:
            bsh.UtilEvalError r5 = new bsh.UtilEvalError     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = "Can't assign to 'this'."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L25
            throw r5     // Catch: java.lang.Throwable -> L25
        L39:
            r0 = 0
        L3a:
            java.lang.String r2 = r4.evalName     // Catch: java.lang.Throwable -> L25 bsh.UtilEvalError -> L4a
            r3 = 1
            if (r2 == 0) goto L4d
            boolean r2 = isCompound(r2)     // Catch: java.lang.Throwable -> L25 bsh.UtilEvalError -> L4a
            if (r2 == 0) goto L4d
            java.lang.Object r0 = r4.consumeNextObjectField(r5, r6, r1, r3)     // Catch: java.lang.Throwable -> L25 bsh.UtilEvalError -> L4a
            goto L3a
        L4a:
            r5 = move-exception
            goto L118
        L4d:
            java.lang.String r5 = r4.evalName     // Catch: java.lang.Throwable -> L25
            if (r5 != 0) goto L6f
            boolean r6 = r0 instanceof bsh.ClassIdentifier     // Catch: java.lang.Throwable -> L25
            if (r6 != 0) goto L56
            goto L6f
        L56:
            bsh.UtilEvalError r5 = new bsh.UtilEvalError     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r6.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "Can't assign to class: "
            r6.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r4.value     // Catch: java.lang.Throwable -> L25
            r6.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L25
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L25
            throw r5     // Catch: java.lang.Throwable -> L25
        L6f:
            if (r0 == 0) goto Lff
            boolean r6 = r0 instanceof bsh.This     // Catch: java.lang.Throwable -> L25
            if (r6 == 0) goto Ld3
            java.lang.String r6 = "namespace"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L25
            if (r5 != 0) goto Lba
            java.lang.String r5 = r4.evalName     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = "variables"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L25
            if (r5 != 0) goto Lba
            java.lang.String r5 = r4.evalName     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = "methods"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L25
            if (r5 != 0) goto Lba
            java.lang.String r5 = r4.evalName     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = "caller"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L25
            if (r5 != 0) goto Lba
            java.lang.String r5 = "found This reference evaluating LHS"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L25
            bsh.Interpreter.debug(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r4.lastEvalName     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = "super"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L25
            r5 = r5 ^ r3
            bsh.LHS r6 = new bsh.LHS     // Catch: java.lang.Throwable -> L25
            bsh.This r0 = (bsh.This) r0     // Catch: java.lang.Throwable -> L25
            bsh.NameSpace r0 = r0.namespace     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r4.evalName     // Catch: java.lang.Throwable -> L25
            r6.<init>(r0, r1, r5)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r4)
            return r6
        Lba:
            bsh.UtilEvalError r5 = new bsh.UtilEvalError     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r6.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "Can't assign to special variable: "
            r6.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r4.evalName     // Catch: java.lang.Throwable -> L25
            r6.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L25
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L25
            throw r5     // Catch: java.lang.Throwable -> L25
        Ld3:
            if (r5 == 0) goto Lf7
            boolean r6 = r0 instanceof bsh.ClassIdentifier     // Catch: java.lang.Throwable -> L25 bsh.ReflectError -> Lee
            if (r6 == 0) goto Le8
            r5 = r0
            bsh.ClassIdentifier r5 = (bsh.ClassIdentifier) r5     // Catch: java.lang.Throwable -> L25 bsh.ReflectError -> Lee
            java.lang.Class r5 = r5.getTargetClass()     // Catch: java.lang.Throwable -> L25 bsh.ReflectError -> Lee
            java.lang.String r6 = r4.evalName     // Catch: java.lang.Throwable -> L25 bsh.ReflectError -> Lee
            bsh.LHS r5 = bsh.Reflect.getLHSStaticField(r5, r6)     // Catch: java.lang.Throwable -> L25 bsh.ReflectError -> Lee
            monitor-exit(r4)
            return r5
        Le8:
            bsh.LHS r5 = bsh.Reflect.getLHSObjectField(r0, r5)     // Catch: java.lang.Throwable -> L25 bsh.ReflectError -> Lee
            monitor-exit(r4)
            return r5
        Lee:
            bsh.LHS r5 = new bsh.LHS     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r4.evalName     // Catch: java.lang.Throwable -> L25
            r5.<init>(r0, r6)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r4)
            return r5
        Lf7:
            bsh.InterpreterError r5 = new bsh.InterpreterError     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = "Internal error in lhs..."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L25
            throw r5     // Catch: java.lang.Throwable -> L25
        Lff:
            bsh.UtilEvalError r5 = new bsh.UtilEvalError     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r6.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = "Error in LHS: "
            r6.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r4.value     // Catch: java.lang.Throwable -> L25
            r6.append(r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L25
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L25
            throw r5     // Catch: java.lang.Throwable -> L25
        L118:
            bsh.UtilEvalError r6 = new bsh.UtilEvalError     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "LHS evaluation: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = r5.getMessage()     // Catch: java.lang.Throwable -> L25
            r0.append(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L25
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> L25
            throw r6     // Catch: java.lang.Throwable -> L25
        L133:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L25
            throw r5
    }

    public java.lang.Object toObject(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.toObject(r2, r3, r0)
            return r2
    }

    public synchronized java.lang.Object toObject(bsh.CallStack r3, bsh.Interpreter r4, boolean r5) {
            r2 = this;
            monitor-enter(r2)
            r2.reset()     // Catch: java.lang.Throwable -> Lf
            r0 = 0
        L5:
            java.lang.String r1 = r2.evalName     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            r0 = 0
            java.lang.Object r0 = r2.consumeNextObjectField(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> Lf
            goto L5
        Lf:
            r3 = move-exception
            goto L1d
        L11:
            if (r0 == 0) goto L15
            monitor-exit(r2)
            return r0
        L15:
            bsh.InterpreterError r3 = new bsh.InterpreterError     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = "null value in toObject()"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> Lf
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
