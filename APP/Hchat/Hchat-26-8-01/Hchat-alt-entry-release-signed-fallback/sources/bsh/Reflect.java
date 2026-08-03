package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Reflect {
    private static final java.util.Map<java.lang.String, java.lang.String> ACCESSOR_NAMES = null;
    private static final java.util.regex.Pattern DEFAULT_PACKAGE = null;
    static final java.lang.String GET_PREFIX = "get";
    static final java.lang.String IS_PREFIX = "is";
    private static final java.util.regex.Pattern PACKAGE_ACCESS = null;
    static final java.lang.String SET_PREFIX = "set";
    public static final java.lang.Object[] ZERO_ARGS = null;
    public static final java.lang.Class<?>[] ZERO_TYPES = null;
    static final java.util.Map<java.lang.Class<?>, java.lang.Object> instanceCache = null;

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            bsh.Reflect.ZERO_ARGS = r1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            bsh.Reflect.ZERO_TYPES = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            bsh.Reflect.ACCESSOR_NAMES = r0
            java.lang.String r0 = "[^\\.]+|bsh\\..*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bsh.Reflect.DEFAULT_PACKAGE = r0
            java.lang.String r0 = "package.access"
            java.lang.String r0 = java.security.Security.getProperty(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = "null"
        L22:
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            bsh.a r1 = new bsh.a
            r2 = 7
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.filter(r1)
            java.lang.String r1 = "(?:"
            java.lang.String r2 = ").*"
            java.lang.String r3 = "|"
            java.util.stream.Collector r1 = java.util.stream.Collectors.joining(r3, r1, r2)
            java.lang.Object r0 = r0.collect(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            bsh.Reflect.PACKAGE_ACCESS = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            bsh.Reflect.instanceCache = r0
            return
    }

    public Reflect() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ boolean a(java.lang.String r0) {
            boolean r0 = lambda$getVariableNames$2(r0)
            return r0
    }

    public static java.lang.String accessorName(java.lang.String r4, java.lang.String r5) {
            java.util.Map<java.lang.String, java.lang.String> r0 = bsh.Reflect.ACCESSOR_NAMES
            boolean r1 = r0.containsKey(r5)
            if (r1 != 0) goto L1d
            char[] r1 = r5.toCharArray()
            r2 = 0
            char r3 = r1[r2]
            char r3 = java.lang.Character.toUpperCase(r3)
            r1[r2] = r3
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r0.put(r5, r2)
        L1d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.Object r4 = r0.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    public static /* synthetic */ java.lang.String[] b(int r0) {
            java.lang.String[] r0 = lambda$getVariableNames$3(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object[] c(java.lang.Class r0, int r1) {
            java.lang.Object[] r0 = lambda$getEnumConstants$8(r0, r1)
            return r0
    }

    private static bsh.ReflectError cantFindConstructor(java.lang.Class<?> r3, java.lang.Class<?>[] r4) {
            int r0 = r4.length
            if (r0 != 0) goto Lf
            bsh.ReflectError r4 = new bsh.ReflectError
            java.lang.String r0 = "Can't find default constructor for: "
            java.lang.String r3 = p.a.k(r3, r0)
            r4.<init>(r3)
            return r4
        Lf:
            bsh.ReflectError r0 = new bsh.ReflectError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't find constructor: "
            r1.<init>(r2)
            java.lang.String r2 = r3.getName()
            java.lang.String r4 = bsh.StringUtil.methodString(r2, r4)
            r1.append(r4)
            java.lang.String r4 = " in class: "
            r1.append(r4)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    private static void checkFoundStaticMethod(bsh.Invocable r2, boolean r3, java.lang.Class<?> r4) {
            if (r2 == 0) goto L37
            if (r3 == 0) goto L37
            boolean r3 = r2.isStatic()
            if (r3 == 0) goto Lb
            goto L37
        Lb:
            bsh.UtilEvalError r3 = new bsh.UtilEvalError
            java.lang.String r0 = r2.getName()
            java.lang.Class[] r2 = r2.getParameterTypes()
            java.lang.String r2 = bsh.StringUtil.methodString(r0, r2)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot reach instance method: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " from static context: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L37:
            return
    }

    public static java.lang.Object constructObject(java.lang.Class<?> r4, java.lang.Object r5, java.lang.Object[] r6) {
            if (r4 != 0) goto L5
            bsh.Primitive r4 = bsh.Primitive.NULL
            return r4
        L5:
            boolean r0 = r4.isInterface()
            if (r0 != 0) goto Lad
            java.lang.Class[] r0 = bsh.Types.getTypes(r6)
            boolean r1 = r4.isMemberClass()
            if (r1 == 0) goto L3a
            boolean r1 = isStatic(r4)
            if (r1 != 0) goto L3a
            if (r5 == 0) goto L3a
            java.lang.Class r1 = r5.getClass()
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            java.util.stream.Stream r0 = java.util.stream.Stream.concat(r1, r0)
            bsh.e r1 = new bsh.e
            r2 = 9
            r1.<init>(r2)
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
        L3a:
            java.lang.String r1 = "Looking for most specific constructor: "
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r4}
            bsh.Interpreter.debug(r1)
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r1 = bsh.BshClassManager.memberCache
            java.lang.Object r1 = r1.get(r4)
            bsh.BshClassManager$MemberCache r1 = (bsh.BshClassManager.MemberCache) r1
            java.lang.String r2 = r4.getName()
            bsh.Invocable r1 = r1.findMethod(r2, r0)
            if (r1 == 0) goto La8
            int r2 = r6.length
            int r3 = r1.getParameterCount()
            if (r2 == r3) goto L68
            boolean r2 = r1.isVarArgs()
            if (r2 != 0) goto L68
            boolean r2 = r1.isInnerClass()
            if (r2 == 0) goto La8
        L68:
            java.lang.Object r4 = r1.invoke(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L6d
            return r4
        L6d:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            java.lang.Throwable r5 = r5.getCause()
            boolean r5 = r5 instanceof java.lang.IllegalAccessException
            if (r5 == 0) goto La7
            bsh.ReflectError r5 = new bsh.ReflectError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "We don't have permission to create an instance. "
            r6.<init>(r0)
            java.lang.Throwable r0 = r4.getCause()
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r0 = r0.getMessage()
            r6.append(r0)
            java.lang.String r0 = " Use setAccessibility(true) to enable access."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.Throwable r4 = r4.getCause()
            java.lang.Throwable r4 = r4.getCause()
            r5.<init>(r6, r4)
            throw r5
        La7:
            throw r4
        La8:
            bsh.ReflectError r4 = cantFindConstructor(r4, r0)
            throw r4
        Lad:
            bsh.ReflectError r5 = new bsh.ReflectError
            java.lang.String r6 = "Can't create instance of an interface: "
            java.lang.String r4 = p.a.k(r4, r6)
            r5.<init>(r4)
            throw r5
    }

    public static java.lang.Object constructObject(java.lang.Class<?> r1, java.lang.Object[] r2) {
            r0 = 0
            java.lang.Object r1 = constructObject(r1, r0, r2)
            return r1
    }

    public static /* synthetic */ java.lang.Class[] d(int r0) {
            java.lang.Class[] r0 = lambda$constructObject$1(r0)
            return r0
    }

    public static /* synthetic */ bsh.Variable e(bsh.NameSpace r0, java.lang.String r1) {
            bsh.Variable r0 = lambda$getVariables$4(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object f(java.lang.reflect.Field r0) {
            java.lang.Object r0 = lambda$getEnumConstants$7(r0)
            return r0
    }

    public static bsh.BshMethod findMostSpecificBshMethod(java.lang.Class<?>[] r2, java.util.List<bsh.BshMethod> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "find most specific BshMethod for: "
            r0.<init>(r1)
            java.lang.String r1 = java.util.Arrays.toString(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            bsh.Interpreter.debug(r0)
            int r2 = findMostSpecificBshMethodIndex(r2, r3)
            r0 = -1
            if (r2 != r0) goto L22
            r2 = 0
            return r2
        L22:
            java.lang.Object r2 = r3.get(r2)
            bsh.BshMethod r2 = (bsh.BshMethod) r2
            return r2
    }

    public static int findMostSpecificBshMethodIndex(java.lang.Class<?>[] r8, java.util.List<bsh.BshMethod> r9) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r9.size()
            if (r1 >= r2) goto L41
            java.lang.String r2 = "  "
            java.lang.String r3 = ":"
            java.lang.StringBuilder r2 = eh.a.t(r1, r2, r3)
            java.lang.Object r3 = r9.get(r1)
            bsh.BshMethod r3 = (bsh.BshMethod) r3
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = " "
            r2.append(r3)
            java.lang.Object r3 = r9.get(r1)
            bsh.BshMethod r3 = (bsh.BshMethod) r3
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            bsh.Interpreter.debug(r2)
            int r1 = r1 + 1
            goto L2
        L41:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r9.iterator()
            r4 = r0
        L50:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L71
            java.lang.Object r5 = r3.next()
            bsh.BshMethod r5 = (bsh.BshMethod) r5
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r6 = r8.length
            int r7 = r5.length
            if (r6 != r7) goto L6e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r2.add(r6)
            r1.add(r5)
        L6e:
            int r4 = r4 + 1
            goto L50
        L71:
            int r3 = r1.size()
            java.lang.Class[][] r3 = new java.lang.Class[r3][]
            java.lang.Object[] r3 = r1.toArray(r3)
            java.lang.Class[][] r3 = (java.lang.Class[][]) r3
            int r3 = findMostSpecificSignature(r8, r3)
            if (r3 < 0) goto Lb8
            java.lang.Object r8 = r2.get(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = " remap: "
            r9.<init>(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = " match:"
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r9)
            return r8
        Lb8:
            r1.clear()
            r2.clear()
            java.util.Iterator r9 = r9.iterator()
            r3 = r0
        Lc3:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L105
            java.lang.Object r4 = r9.next()
            bsh.BshMethod r4 = (bsh.BshMethod) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            boolean r4 = r4.isVarArgs()
            if (r4 == 0) goto L102
            int r4 = r8.length
            int r6 = r5.length
            int r6 = r6 + (-1)
            if (r4 < r6) goto L102
            int r4 = r8.length
            java.lang.Class[] r4 = new java.lang.Class[r4]
            int r6 = r5.length
            int r6 = r6 + (-1)
            java.lang.System.arraycopy(r5, r0, r4, r0, r6)
            int r6 = r5.length
            int r6 = r6 + (-1)
            r6 = r5[r6]
            java.lang.Class r6 = r6.getComponentType()
            int r5 = r5.length
            int r5 = r5 + (-1)
            int r7 = r8.length
            java.util.Arrays.fill(r4, r5, r7, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2.add(r5)
            r1.add(r4)
        L102:
            int r3 = r3 + 1
            goto Lc3
        L105:
            int r9 = r1.size()
            java.lang.Class[][] r9 = new java.lang.Class[r9][]
            java.lang.Object[] r9 = r1.toArray(r9)
            java.lang.Class[][] r9 = (java.lang.Class[][]) r9
            int r8 = findMostSpecificSignature(r8, r9)
            if (r8 < 0) goto L155
            java.lang.Object r8 = r2.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = " remap (varargs): "
            r9.<init>(r1)
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = " match (varargs):"
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r9)
        L155:
            return r8
    }

    public static bsh.BshMethod findMostSpecificExtensionMethod(java.lang.Class<?> r2, java.lang.Class<?>[] r3, java.util.List<bsh.BshMethod> r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "find most specific extension method for: receiver: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " args: "
            r0.append(r1)
            java.lang.String r1 = java.util.Arrays.toString(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            bsh.Interpreter.debug(r0)
            int r2 = findMostSpecificExtensionMethodIndex(r2, r3, r4)
            r3 = -1
            if (r2 != r3) goto L2a
            r2 = 0
            return r2
        L2a:
            java.lang.Object r2 = r4.get(r2)
            bsh.BshMethod r2 = (bsh.BshMethod) r2
            return r2
    }

    public static int findMostSpecificExtensionMethodIndex(java.lang.Class<?> r7, java.lang.Class<?>[] r8, java.util.List<bsh.BshMethod> r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r9.size()
            if (r2 >= r3) goto L2b
            java.lang.Object r3 = r9.get(r2)
            bsh.BshMethod r3 = (bsh.BshMethod) r3
            boolean r4 = r3.isExtension
            if (r4 == 0) goto L28
            java.lang.Class<?> r3 = r3.receiverType
            if (r3 == 0) goto L28
            boolean r3 = bsh.Types.isJavaBoxTypesAssignable(r3, r7)
            if (r3 == 0) goto L28
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
        L28:
            int r2 = r2 + 1
            goto L7
        L2b:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L33
            r7 = -1
            return r7
        L33:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            r2 = r1
        L39:
            int r3 = r0.size()
            if (r2 >= r3) goto L7f
            java.lang.Object r3 = r0.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            java.lang.Object r4 = r9.get(r4)
            bsh.BshMethod r4 = (bsh.BshMethod) r4
            java.lang.Class<?> r4 = r4.receiverType
            r5 = r1
        L52:
            int r6 = r0.size()
            if (r5 >= r6) goto L7c
            if (r2 != r5) goto L5b
            goto L79
        L5b:
            java.lang.Object r6 = r0.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r6 = r9.get(r6)
            bsh.BshMethod r6 = (bsh.BshMethod) r6
            java.lang.Class<?> r6 = r6.receiverType
            if (r4 == r6) goto L79
            boolean r6 = r4.isAssignableFrom(r6)
            if (r6 == 0) goto L79
            r7.remove(r3)
            goto L7c
        L79:
            int r5 = r5 + 1
            goto L52
        L7c:
            int r2 = r2 + 1
            goto L39
        L7f:
            int r0 = r7.size()
            r2 = 1
            if (r0 != r2) goto L91
            java.lang.Object r7 = r7.get(r1)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            return r7
        L91:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r7.iterator()
        L9a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb4
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r3 = r9.get(r3)
            bsh.BshMethod r3 = (bsh.BshMethod) r3
            r0.add(r3)
            goto L9a
        Lb4:
            int r8 = findMostSpecificBshMethodIndex(r8, r0)
            if (r8 < 0) goto Lc5
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            return r7
        Lc5:
            java.lang.Object r7 = r7.get(r1)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            return r7
    }

    public static bsh.Invocable findMostSpecificInvocable(java.lang.Class<?>[] r2, java.util.List<bsh.Invocable> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "find most specific Invocable for: "
            r0.<init>(r1)
            java.lang.String r1 = java.util.Arrays.toString(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            bsh.Interpreter.debug(r0)
            int r2 = findMostSpecificInvocableIndex(r2, r3)
            r0 = -1
            if (r2 != r0) goto L22
            r2 = 0
            return r2
        L22:
            java.lang.Object r2 = r3.get(r2)
            bsh.Invocable r2 = (bsh.Invocable) r2
            return r2
    }

    public static int findMostSpecificInvocableIndex(java.lang.Class<?>[] r8, java.util.List<bsh.Invocable> r9) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r9.size()
            if (r1 >= r2) goto L2b
            java.lang.String r2 = "  "
            java.lang.String r3 = "="
            java.lang.StringBuilder r2 = eh.a.t(r1, r2, r3)
            java.lang.Object r3 = r9.get(r1)
            bsh.Invocable r3 = (bsh.Invocable) r3
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            bsh.Interpreter.debug(r2)
            int r1 = r1 + 1
            goto L2
        L2b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r9.iterator()
            r4 = r0
        L3a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r3.next()
            bsh.Invocable r5 = (bsh.Invocable) r5
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r6 = r8.length
            int r7 = r5.length
            if (r6 != r7) goto L58
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r2.add(r6)
            r1.add(r5)
        L58:
            int r4 = r4 + 1
            goto L3a
        L5b:
            int r3 = r1.size()
            java.lang.Class[][] r3 = new java.lang.Class[r3][]
            java.lang.Object[] r3 = r1.toArray(r3)
            java.lang.Class[][] r3 = (java.lang.Class[][]) r3
            int r3 = findMostSpecificSignature(r8, r3)
            if (r3 < 0) goto Lac
            java.lang.Object r8 = r2.get(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = " remap="
            r9.<init>(r1)
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = " match="
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r9)
            return r8
        Lac:
            r1.clear()
            r2.clear()
            java.util.Iterator r9 = r9.iterator()
            r3 = r0
        Lb7:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lf4
            java.lang.Object r4 = r9.next()
            bsh.Invocable r4 = (bsh.Invocable) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            boolean r6 = r4.isVarArgs()
            if (r6 == 0) goto Lf1
            int r6 = r8.length
            int r7 = r5.length
            int r7 = r7 + (-1)
            if (r6 < r7) goto Lf1
            int r6 = r8.length
            java.lang.Class[] r6 = new java.lang.Class[r6]
            int r7 = r5.length
            int r7 = r7 + (-1)
            java.lang.System.arraycopy(r5, r0, r6, r0, r7)
            int r5 = r5.length
            int r5 = r5 + (-1)
            int r7 = r8.length
            java.lang.Class r4 = r4.getVarArgsComponentType()
            java.util.Arrays.fill(r6, r5, r7, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.add(r4)
            r1.add(r6)
        Lf1:
            int r3 = r3 + 1
            goto Lb7
        Lf4:
            int r9 = r1.size()
            java.lang.Class[][] r9 = new java.lang.Class[r9][]
            java.lang.Object[] r9 = r1.toArray(r9)
            java.lang.Class[][] r9 = (java.lang.Class[][]) r9
            int r8 = findMostSpecificSignature(r8, r9)
            if (r8 < 0) goto L110
            java.lang.Object r8 = r2.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
        L110:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = " remap (varargs) ="
            r9.<init>(r1)
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = " match (varargs) ="
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r9)
            return r8
    }

    public static int findMostSpecificSignature(java.lang.Class<?>[] r7, java.lang.Class<?>[][] r8) {
            r0 = 1
            r1 = r0
        L2:
            r2 = 4
            r3 = -1
            if (r1 > r2) goto L3b
            r2 = 0
            r4 = 0
        L8:
            int r5 = r8.length
            if (r4 >= r5) goto L35
            r5 = r8[r4]
            if (r2 == 0) goto L16
            boolean r6 = bsh.Types.areSignaturesEqual(r5, r2)
            if (r6 == 0) goto L16
            goto L32
        L16:
            boolean r6 = bsh.Types.isSignatureAssignable(r7, r5, r1)
            if (r6 == 0) goto L32
            if (r2 == 0) goto L30
            boolean r6 = bsh.Types.areSignaturesEqual(r7, r5)
            if (r6 != 0) goto L30
            boolean r6 = bsh.Types.isSignatureAssignable(r5, r2, r0)
            if (r6 == 0) goto L32
            boolean r6 = bsh.Types.areSignaturesEqual(r7, r2)
            if (r6 != 0) goto L32
        L30:
            r3 = r4
            r2 = r5
        L32:
            int r4 = r4 + 1
            goto L8
        L35:
            if (r2 == 0) goto L38
            return r3
        L38:
            int r1 = r1 + 1
            goto L2
        L3b:
            return r3
    }

    public static /* synthetic */ boolean g(java.lang.String r0) {
            boolean r0 = lambda$static$0(r0)
            return r0
    }

    public static bsh.This getClassInstanceThis(java.lang.Object r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1c
            r0.<init>()     // Catch: java.lang.Exception -> L1c
            bsh.This$Keys r1 = bsh.This.Keys.BSHTHIS     // Catch: java.lang.Exception -> L1c
            r0.append(r1)     // Catch: java.lang.Exception -> L1c
            r0.append(r3)     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L1c
            java.lang.Object r2 = getObjectFieldValue(r2, r3)     // Catch: java.lang.Exception -> L1c
            java.lang.Object r2 = bsh.Primitive.unwrap(r2)     // Catch: java.lang.Exception -> L1c
            bsh.This r2 = (bsh.This) r2     // Catch: java.lang.Exception -> L1c
            return r2
        L1c:
            r2 = move-exception
            java.lang.String r3 = "Generated class: Error getting This "
            bsh.j.d(r3, r2)
            r2 = 0
            return r2
    }

    public static bsh.Modifiers getClassModifiers(java.lang.Class<?> r1) {
            bsh.This$Keys r0 = bsh.This.Keys.BSHCLASSMODIFIERS     // Catch: java.lang.Exception -> L11
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L11
            bsh.Variable r0 = getVariable(r1, r0)     // Catch: java.lang.Exception -> L11
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L11
            bsh.Modifiers r0 = (bsh.Modifiers) r0     // Catch: java.lang.Exception -> L11
            return r0
        L11:
            bsh.Modifiers r0 = new bsh.Modifiers
            boolean r1 = r1.isInterface()
            r0.<init>(r1)
            return r0
    }

    public static bsh.This getClassStaticThis(java.lang.Class<?> r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L18
            r0.<init>()     // Catch: java.lang.Exception -> L18
            bsh.This$Keys r1 = bsh.This.Keys.BSHSTATIC     // Catch: java.lang.Exception -> L18
            r0.append(r1)     // Catch: java.lang.Exception -> L18
            r0.append(r3)     // Catch: java.lang.Exception -> L18
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L18
            java.lang.Object r2 = getStaticFieldValue(r2, r3)     // Catch: java.lang.Exception -> L18
            bsh.This r2 = (bsh.This) r2     // Catch: java.lang.Exception -> L18
            return r2
        L18:
            r2 = move-exception
            java.lang.String r3 = "Unable to get class static space: "
            bsh.j.d(r3, r2)
            r2 = 0
            return r2
    }

    public static bsh.BshMethod getDeclaredMethod(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>[] r4) {
            boolean r0 = isGeneratedClass(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            bsh.BshMethod r0 = getMethod(r2, r3, r4)
            if (r0 != 0) goto L1d
            boolean r1 = r2.isInterface()
            if (r1 != 0) goto L1d
            java.lang.Object r2 = getNewInstance(r2)
            bsh.BshMethod r2 = getMethod(r2, r3, r4)
            return r2
        L1d:
            return r0
    }

    public static bsh.BshMethod[] getDeclaredMethods(java.lang.Class<?> r1) {
            boolean r0 = isGeneratedClass(r1)
            if (r0 != 0) goto La
            r1 = 0
            bsh.BshMethod[] r1 = new bsh.BshMethod[r1]
            return r1
        La:
            boolean r0 = r1.isInterface()
            if (r0 == 0) goto L15
            bsh.BshMethod[] r1 = getMethods(r1)
            return r1
        L15:
            java.lang.Object r1 = getNewInstance(r1)
            bsh.BshMethod[] r1 = getMethods(r1)
            return r1
    }

    public static bsh.Variable getDeclaredVariable(java.lang.Class<?> r2, java.lang.String r3) {
            boolean r0 = isGeneratedClass(r2)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            bsh.Variable r0 = getVariable(r2, r3)
            if (r0 != 0) goto L1d
            boolean r1 = r2.isInterface()
            if (r1 != 0) goto L1d
            java.lang.Object r2 = getNewInstance(r2)
            bsh.Variable r2 = getVariable(r2, r3)
            return r2
        L1d:
            return r0
    }

    public static bsh.Variable[] getDeclaredVariables(java.lang.Class<?> r1) {
            boolean r0 = isGeneratedClass(r1)
            if (r0 != 0) goto La
            r1 = 0
            bsh.Variable[] r1 = new bsh.Variable[r1]
            return r1
        La:
            boolean r0 = r1.isInterface()
            if (r0 == 0) goto L15
            bsh.Variable[] r1 = getVariables(r1)
            return r1
        L15:
            java.lang.Object r1 = getNewInstance(r1)
            bsh.Variable[] r1 = getVariables(r1)
            return r1
    }

    public static java.util.Map.Entry getEntryForKey(java.lang.Object r4, java.util.Map.Entry[] r5) {
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L14
            r2 = r5[r1]
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L11
            return r2
        L11:
            int r1 = r1 + 1
            goto L2
        L14:
            r4 = 0
            return r4
    }

    public static <T> T[] getEnumConstants(java.lang.Class<T> r3) {
            java.lang.reflect.Field[] r0 = r3.getFields()
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            be.i r1 = new be.i
            r2 = 4
            r1.<init>(r3, r2)
            java.util.stream.Stream r0 = r0.filter(r1)
            bsh.b r1 = new bsh.b
            r2 = 14
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.map(r1)
            bsh.a r1 = new bsh.a
            r2 = 5
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.filter(r1)
            be.s r1 = new be.s
            r2 = 1
            r1.<init>(r2, r3)
            java.lang.Object[] r3 = r0.toArray(r1)
            return r3
    }

    private static java.lang.Object getFieldValue(java.lang.Class<?> r3, java.lang.Object r4, java.lang.String r5, boolean r6) {
            bsh.Invocable r0 = resolveExpectedJavaField(r3, r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> Lc bsh.ReflectError -> Le
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> Lc bsh.ReflectError -> Le
            java.lang.Object r3 = r0.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> Lc bsh.ReflectError -> Le
            return r3
        Lc:
            r3 = move-exception
            goto L10
        Le:
            r0 = move-exception
            goto L41
        L10:
            java.lang.Throwable r4 = r3.getCause()
            boolean r4 = r4 instanceof bsh.InterpreterError
            if (r4 != 0) goto L3a
            java.lang.Throwable r4 = r3.getCause()
            boolean r4 = r4 instanceof bsh.UtilEvalError
            if (r4 == 0) goto L2a
            bsh.UtilTargetError r4 = new bsh.UtilTargetError
            java.lang.Throwable r3 = r3.getCause()
            r4.<init>(r3)
            throw r4
        L2a:
            bsh.ReflectError r4 = new bsh.ReflectError
            java.lang.String r6 = "Can't access field: "
            java.lang.String r5 = wb.en.g(r6, r5)
            java.lang.Throwable r3 = r3.getCause()
            r4.<init>(r5, r3)
            throw r4
        L3a:
            java.lang.Throwable r3 = r3.getCause()
            bsh.InterpreterError r3 = (bsh.InterpreterError) r3
            throw r3
        L41:
            bsh.NameSpace r1 = getThisNS(r3)
            boolean r3 = isGeneratedClass(r3)
            if (r3 == 0) goto L96
            if (r1 == 0) goto L96
            boolean r3 = r1.isClass
            if (r3 == 0) goto L96
            java.lang.String r3 = "private"
            r2 = 1
            if (r6 == 0) goto L73
            bsh.Variable r4 = r1.getVariableImpl(r5, r2)
            bsh.Primitive r5 = bsh.Primitive.VOID
            if (r4 == 0) goto L6f
            boolean r3 = r4.hasModifier(r3)
            if (r3 == 0) goto L6a
            boolean r3 = bsh.Capabilities.haveAccessibility()
            if (r3 == 0) goto L6f
        L6a:
            java.lang.Object r3 = r1.unwrapVariable(r4)
            goto L70
        L6f:
            r3 = r5
        L70:
            if (r5 == r3) goto L96
            return r3
        L73:
            bsh.NameSpace r4 = getThisNS(r4)
            if (r4 == 0) goto L96
            bsh.Variable r5 = r4.getVariableImpl(r5, r2)
            bsh.Primitive r6 = bsh.Primitive.VOID
            if (r5 == 0) goto L92
            boolean r3 = r5.hasModifier(r3)
            if (r3 == 0) goto L8d
            boolean r3 = bsh.Capabilities.haveAccessibility()
            if (r3 == 0) goto L92
        L8d:
            java.lang.Object r3 = r4.unwrapVariable(r5)
            goto L93
        L92:
            r3 = r6
        L93:
            if (r6 == r3) goto L96
            return r3
        L96:
            throw r0
    }

    public static bsh.LHS getLHSObjectField(java.lang.Object r4, java.lang.String r5) {
            boolean r0 = r4 instanceof bsh.This
            r1 = 0
            if (r0 == 0) goto Lf
            bsh.LHS r0 = new bsh.LHS
            bsh.This r4 = (bsh.This) r4
            bsh.NameSpace r4 = r4.namespace
            r0.<init>(r4, r5, r1)
            return r0
        Lf:
            java.lang.Class r0 = r4.getClass()     // Catch: bsh.ReflectError -> L1d
            bsh.Invocable r0 = resolveExpectedJavaField(r0, r5, r1)     // Catch: bsh.ReflectError -> L1d
            bsh.LHS r1 = new bsh.LHS     // Catch: bsh.ReflectError -> L1d
            r1.<init>(r4, r0)     // Catch: bsh.ReflectError -> L1d
            return r1
        L1d:
            r0 = move-exception
            bsh.NameSpace r1 = getThisNS(r4)
            java.lang.Class r2 = r4.getClass()
            boolean r2 = isGeneratedClass(r2)
            if (r2 == 0) goto L4d
            if (r1 == 0) goto L4d
            boolean r2 = r1.isClass
            if (r2 == 0) goto L4d
            r2 = 1
            bsh.Variable r2 = r1.getVariableImpl(r5, r2)
            if (r2 == 0) goto L4d
            java.lang.String r3 = "private"
            boolean r2 = r2.hasModifier(r3)
            if (r2 == 0) goto L47
            boolean r2 = bsh.Capabilities.haveAccessibility()
            if (r2 == 0) goto L4d
        L47:
            bsh.LHS r4 = new bsh.LHS
            r4.<init>(r1, r5)
            return r4
        L4d:
            java.lang.Class r1 = r4.getClass()
            boolean r1 = hasObjectPropertySetter(r1, r5)
            if (r1 == 0) goto L5d
            bsh.LHS r0 = new bsh.LHS
            r0.<init>(r4, r5)
            return r0
        L5d:
            throw r0
    }

    public static bsh.LHS getLHSStaticField(java.lang.Class<?> r4, java.lang.String r5) {
            r0 = 1
            bsh.Invocable r1 = resolveExpectedJavaField(r4, r5, r0)     // Catch: bsh.ReflectError -> Lb
            bsh.LHS r2 = new bsh.LHS     // Catch: bsh.ReflectError -> Lb
            r2.<init>(r1)     // Catch: bsh.ReflectError -> Lb
            return r2
        Lb:
            r1 = move-exception
            bsh.NameSpace r2 = getThisNS(r4)
            boolean r3 = isGeneratedClass(r4)
            if (r3 == 0) goto L36
            if (r2 == 0) goto L36
            boolean r3 = r2.isClass
            if (r3 == 0) goto L36
            bsh.Variable r0 = r2.getVariableImpl(r5, r0)
            if (r0 == 0) goto L36
            java.lang.String r3 = "private"
            boolean r0 = r0.hasModifier(r3)
            if (r0 == 0) goto L30
            boolean r0 = bsh.Capabilities.haveAccessibility()
            if (r0 == 0) goto L36
        L30:
            bsh.LHS r4 = new bsh.LHS
            r4.<init>(r2, r5)
            return r4
        L36:
            boolean r0 = hasObjectPropertySetter(r4, r5)
            if (r0 == 0) goto L42
            bsh.LHS r0 = new bsh.LHS
            r0.<init>(r4, r5)
            return r0
        L42:
            throw r1
    }

    public static bsh.BshMethod getMethod(bsh.NameSpace r1, java.lang.String r2, java.lang.Class<?>[] r3) {
            r0 = 1
            bsh.BshMethod r1 = getMethod(r1, r2, r3, r0)
            return r1
    }

    public static bsh.BshMethod getMethod(bsh.NameSpace r1, java.lang.String r2, java.lang.Class<?>[] r3, boolean r4) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            bsh.BshMethod r1 = r1.getMethod(r2, r3, r4)     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            return r0
    }

    public static bsh.BshMethod getMethod(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>[] r2) {
            bsh.NameSpace r0 = getThisNS(r0)
            bsh.BshMethod r0 = getMethod(r0, r1, r2)
            return r0
    }

    public static bsh.BshMethod getMethod(java.lang.Object r0, java.lang.String r1, java.lang.Class<?>[] r2) {
            bsh.NameSpace r0 = getThisNS(r0)
            bsh.BshMethod r0 = getMethod(r0, r1, r2)
            return r0
    }

    public static java.lang.String[] getMethodNames(bsh.NameSpace r0) {
            if (r0 != 0) goto L6
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
        L6:
            java.lang.String[] r0 = r0.getMethodNames()
            return r0
    }

    public static bsh.BshMethod[] getMethods(bsh.NameSpace r0) {
            if (r0 != 0) goto L6
            r0 = 0
            bsh.BshMethod[] r0 = new bsh.BshMethod[r0]
            return r0
        L6:
            bsh.BshMethod[] r0 = r0.getMethods()
            return r0
    }

    public static bsh.BshMethod[] getMethods(java.lang.Class<?> r0) {
            bsh.NameSpace r0 = getThisNS(r0)
            bsh.BshMethod[] r0 = getMethods(r0)
            return r0
    }

    public static bsh.BshMethod[] getMethods(java.lang.Object r0) {
            bsh.NameSpace r0 = getThisNS(r0)
            bsh.BshMethod[] r0 = getMethods(r0)
            return r0
    }

    public static java.lang.Object getNewInstance(java.lang.Class<?> r3) {
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = bsh.Reflect.instanceCache
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto Ld
            java.lang.Object r3 = r0.get(r3)
            return r3
        Ld:
            r1 = 0
            java.lang.reflect.Constructor r2 = r3.getConstructor(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L1a
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L1a
            goto L1f
        L1a:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = bsh.Reflect.instanceCache
            r0.put(r3, r1)
        L1f:
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = bsh.Reflect.instanceCache
            java.lang.Object r3 = r0.get(r3)
            return r3
    }

    public static java.lang.Object getObjectFieldValue(java.lang.Object r3, java.lang.String r4) {
            boolean r0 = r3 instanceof bsh.This
            if (r0 == 0) goto Ld
            bsh.This r3 = (bsh.This) r3
            bsh.NameSpace r3 = r3.namespace
            java.lang.Object r3 = r3.getVariable(r4)
            return r3
        Ld:
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r3 == r0) goto L2c
            java.lang.Class r0 = r3.getClass()     // Catch: bsh.ReflectError -> L1b
            r1 = 0
            java.lang.Object r3 = getFieldValue(r0, r3, r4, r1)     // Catch: bsh.ReflectError -> L1b
            return r3
        L1b:
            r0 = move-exception
            java.lang.Class r1 = r3.getClass()
            boolean r1 = hasObjectPropertyGetter(r1, r4)
            if (r1 == 0) goto L2b
            java.lang.Object r3 = getObjectProperty(r3, r4)
            return r3
        L2b:
            throw r0
        L2c:
            bsh.UtilTargetError r3 = new bsh.UtilTargetError
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Attempt to access field '"
            java.lang.String r2 = "' on null value"
            java.lang.String r4 = eh.a.n(r1, r4, r2)
            r0.<init>(r4)
            r3.<init>(r0)
            throw r3
    }

    public static java.lang.Object getObjectProperty(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = bsh.Types.isPropertyTypeMap(r2)
            if (r0 == 0) goto L16
            java.util.Map r2 = (java.util.Map) r2
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L13
            java.lang.Object r2 = r2.get(r3)
            return r2
        L13:
            bsh.Primitive r2 = bsh.Primitive.VOID
            return r2
        L16:
            boolean r0 = bsh.Types.isPropertyTypeEntry(r2)
            if (r0 == 0) goto L30
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L2d
            java.lang.Object r2 = r2.getValue()
            return r2
        L2d:
            bsh.Primitive r2 = bsh.Primitive.VOID
            return r2
        L30:
            java.lang.Class r0 = r2.getClass()
            boolean r1 = bsh.Types.isPropertyTypeEntryList(r0)
            if (r1 == 0) goto L4a
            java.util.Map$Entry[] r2 = (java.util.Map.Entry[]) r2
            java.util.Map$Entry r2 = getEntryForKey(r3, r2)
            if (r2 == 0) goto L47
            java.lang.Object r2 = r2.getValue()
            return r2
        L47:
            bsh.Primitive r2 = bsh.Primitive.VOID
            return r2
        L4a:
            boolean r1 = r2 instanceof java.lang.Class
            if (r1 == 0) goto L51
            r0 = r2
            java.lang.Class r0 = (java.lang.Class) r0
        L51:
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r1 = bsh.BshClassManager.memberCache
            java.lang.Object r0 = r1.get(r0)
            bsh.BshClassManager$MemberCache r0 = (bsh.BshClassManager.MemberCache) r0
            java.lang.String r3 = r3.toString()
            bsh.Invocable r3 = r0.findGetter(r3)
            if (r3 != 0) goto L6f
            java.lang.String r2 = "property getter not found"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            bsh.Interpreter.debug(r2)
            bsh.Primitive r2 = bsh.Primitive.VOID
            return r2
        L6f:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L77
            java.lang.Object r2 = r3.invoke(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L77
            return r2
        L77:
            java.lang.String r2 = "Property accessor threw exception"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            bsh.Interpreter.debug(r2)
            bsh.Primitive r2 = bsh.Primitive.VOID
            return r2
    }

    public static java.lang.Object getObjectProperty(java.lang.Object r2, java.lang.String r3) {
            boolean r0 = bsh.Types.isPropertyTypeEntry(r2)
            if (r0 == 0) goto L44
            r3.getClass()
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case 106079: goto L28;
                case 116513: goto L1d;
                case 111972721: goto L12;
                default: goto L11;
            }
        L11:
            goto L32
        L12:
            java.lang.String r0 = "value"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1b
            goto L32
        L1b:
            r1 = 2
            goto L32
        L1d:
            java.lang.String r0 = "val"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L26
            goto L32
        L26:
            r1 = 1
            goto L32
        L28:
            java.lang.String r0 = "key"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L31
            goto L32
        L31:
            r1 = 0
        L32:
            switch(r1) {
                case 0: goto L3d;
                case 1: goto L36;
                case 2: goto L36;
                default: goto L35;
            }
        L35:
            goto L44
        L36:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            return r2
        L3d:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            return r2
        L44:
            java.lang.Object r2 = getObjectProperty(r2, r3)
            return r2
    }

    public static java.lang.Object getStaticFieldValue(java.lang.Class<?> r2, java.lang.String r3) {
            r0 = 0
            r1 = 1
            java.lang.Object r2 = getFieldValue(r2, r0, r3, r1)
            return r2
    }

    public static bsh.NameSpace getThisNS(java.lang.Class<?> r2) {
            boolean r0 = isGeneratedClass(r2)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r2.getSimpleName()     // Catch: java.lang.Exception -> L13
            bsh.This r2 = getClassStaticThis(r2, r0)     // Catch: java.lang.Exception -> L13
            bsh.NameSpace r2 = r2.namespace     // Catch: java.lang.Exception -> L13
            return r2
        L13:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof bsh.UtilTargetError
            if (r0 != 0) goto L1d
            return r1
        L1d:
            bsh.InterpreterError r0 = new bsh.InterpreterError
            java.lang.Throwable r1 = r2.getCause()
            java.lang.Throwable r1 = r1.getCause()
            java.lang.String r1 = r1.getMessage()
            java.lang.Throwable r2 = r2.getCause()
            java.lang.Throwable r2 = r2.getCause()
            r0.<init>(r1, r2)
            throw r0
    }

    public static bsh.NameSpace getThisNS(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r3.getClass()
            boolean r2 = isGeneratedClass(r1)
            if (r2 != 0) goto Lf
            return r0
        Lf:
            boolean r2 = r3 instanceof java.lang.reflect.Proxy     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L1f
            java.lang.Class[] r3 = r1.getInterfaces()     // Catch: java.lang.Exception -> L2a
            r1 = 0
            r3 = r3[r1]     // Catch: java.lang.Exception -> L2a
            bsh.NameSpace r3 = getThisNS(r3)     // Catch: java.lang.Exception -> L2a
            return r3
        L1f:
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.Exception -> L2a
            bsh.This r3 = getClassInstanceThis(r3, r1)     // Catch: java.lang.Exception -> L2a
            bsh.NameSpace r3 = r3.namespace     // Catch: java.lang.Exception -> L2a
            return r3
        L2a:
            return r0
    }

    public static java.lang.Class<?> getType(java.lang.Object r0) {
            java.lang.Class r0 = bsh.Types.getType(r0)
            return r0
    }

    public static bsh.Variable getVariable(bsh.NameSpace r2, java.lang.String r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            r1 = 0
            bsh.Variable r2 = r2.getVariableImpl(r3, r1)     // Catch: java.lang.Exception -> La
            return r2
        La:
            return r0
    }

    public static bsh.Variable getVariable(java.lang.Class<?> r0, java.lang.String r1) {
            bsh.NameSpace r0 = getThisNS(r0)
            bsh.Variable r0 = getVariable(r0, r1)
            return r0
    }

    public static bsh.Variable getVariable(java.lang.Object r0, java.lang.String r1) {
            bsh.NameSpace r0 = getThisNS(r0)
            bsh.Variable r0 = getVariable(r0, r1)
            return r0
    }

    public static java.lang.String[] getVariableNames(bsh.NameSpace r2) {
            if (r2 != 0) goto L6
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            return r2
        L6:
            java.lang.String[] r2 = r2.getVariableNames()
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            bsh.a r0 = new bsh.a
            r1 = 6
            r0.<init>(r1)
            java.util.stream.Stream r2 = r2.filter(r0)
            bsh.e r0 = new bsh.e
            r1 = 11
            r0.<init>(r1)
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    public static bsh.Variable[] getVariables(bsh.NameSpace r1) {
            java.lang.String[] r0 = getVariableNames(r1)
            bsh.Variable[] r1 = getVariables(r1, r0)
            return r1
    }

    public static bsh.Variable[] getVariables(bsh.NameSpace r2, java.lang.String[] r3) {
            if (r2 == 0) goto L2b
            if (r3 != 0) goto L5
            goto L2b
        L5:
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            bc.j r0 = new bc.j
            r1 = 1
            r0.<init>(r2, r1)
            java.util.stream.Stream r2 = r3.map(r0)
            bsh.a r3 = new bsh.a
            r0 = 4
            r3.<init>(r0)
            java.util.stream.Stream r2 = r2.filter(r3)
            bsh.e r3 = new bsh.e
            r0 = 10
            r3.<init>(r0)
            java.lang.Object[] r2 = r2.toArray(r3)
            bsh.Variable[] r2 = (bsh.Variable[]) r2
            return r2
        L2b:
            r2 = 0
            bsh.Variable[] r2 = new bsh.Variable[r2]
            return r2
    }

    public static bsh.Variable[] getVariables(java.lang.Class<?> r0) {
            bsh.NameSpace r0 = getThisNS(r0)
            bsh.Variable[] r0 = getVariables(r0)
            return r0
    }

    public static bsh.Variable[] getVariables(java.lang.Object r0) {
            bsh.NameSpace r0 = getThisNS(r0)
            bsh.Variable[] r0 = getVariables(r0)
            return r0
    }

    public static /* synthetic */ bsh.Variable[] h(int r0) {
            bsh.Variable[] r0 = lambda$getVariables$5(r0)
            return r0
    }

    public static boolean hasModifier(java.lang.String r0, int r1) {
            java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
            boolean r0 = r1.contains(r0)
            return r0
    }

    public static boolean hasObjectPropertyGetter(java.lang.Class<?> r3, java.lang.String r4) {
            boolean r0 = bsh.Types.isPropertyType(r3)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r0 = bsh.BshClassManager.memberCache
            java.lang.Object r2 = r0.get(r3)
            bsh.BshClassManager$MemberCache r2 = (bsh.BshClassManager.MemberCache) r2
            boolean r2 = r2.hasMember(r4)
            if (r2 == 0) goto L23
            java.lang.Object r3 = r0.get(r3)
            bsh.BshClassManager$MemberCache r3 = (bsh.BshClassManager.MemberCache) r3
            bsh.Invocable r3 = r3.findGetter(r4)
            if (r3 == 0) goto L23
            return r1
        L23:
            r3 = 0
            return r3
    }

    public static boolean hasObjectPropertySetter(java.lang.Class<?> r3, java.lang.String r4) {
            boolean r0 = bsh.Types.isPropertyType(r3)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r0 = bsh.BshClassManager.memberCache
            java.lang.Object r2 = r0.get(r3)
            bsh.BshClassManager$MemberCache r2 = (bsh.BshClassManager.MemberCache) r2
            boolean r2 = r2.hasMember(r4)
            if (r2 == 0) goto L23
            java.lang.Object r3 = r0.get(r3)
            bsh.BshClassManager$MemberCache r3 = (bsh.BshClassManager.MemberCache) r3
            bsh.Invocable r3 = r3.findSetter(r4)
            if (r3 == 0) goto L23
            return r1
        L23:
            r3 = 0
            return r3
    }

    public static /* synthetic */ boolean i(java.lang.Class r0, java.lang.reflect.Field r1) {
            boolean r0 = lambda$getEnumConstants$6(r0, r1)
            return r0
    }

    public static java.lang.Object invokeCompiledCommand(java.lang.Class<?> r4, java.lang.Object[] r5, bsh.Interpreter r6, bsh.CallStack r7, bsh.Node r8) {
            int r0 = r5.length
            r1 = 2
            int r0 = r0 + r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r6
            r3 = 1
            r0[r3] = r7
            int r7 = r5.length
            java.lang.System.arraycopy(r5, r2, r0, r1, r7)
            bsh.BshClassManager r5 = r6.getClassManager()
            java.lang.String r6 = "invoke"
            java.lang.Object r4 = invokeStaticMethod(r5, r4, r6, r0, r8)     // Catch: bsh.ReflectError -> L1a java.lang.reflect.InvocationTargetException -> L2f
            return r4
        L1a:
            r4 = move-exception
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Error invoking compiled command: "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r4)
            throw r5
        L2f:
            r4 = move-exception
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            java.lang.Throwable r6 = r4.getCause()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Error in compiled command: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6, r4)
            throw r5
    }

    private static java.lang.Object invokeMathMethod(java.lang.Class<?> r6, java.lang.Object r7, java.lang.Class<?> r8, java.lang.String r9, java.lang.Object[] r10, bsh.Interpreter r11, bsh.CallStack r12, bsh.Node r13) {
            java.lang.Object r0 = bsh.Primitive.castWrapper(r6, r7)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r7 = invokeObjectMethod(r0, r1, r2, r3, r4, r5)
            boolean r9 = r7 instanceof bsh.Primitive
            if (r9 == 0) goto L23
            r9 = r7
            bsh.Primitive r9 = (bsh.Primitive) r9
            java.lang.Class r9 = r9.getType()
            if (r9 != r6) goto L23
            java.lang.Object r6 = bsh.Primitive.castWrapper(r8, r7)
            java.lang.Object r6 = bsh.Primitive.wrap(r6, r8)
            return r6
        L23:
            return r7
    }

    public static java.lang.Object invokeObjectMethod(java.lang.Object r10, java.lang.String r11, java.lang.Object[] r12, bsh.Interpreter r13, bsh.CallStack r14, bsh.Node r15) {
            java.lang.String r1 = "Error in method invocation: "
            java.lang.String r2 = "Attempt to invoke method: "
            boolean r0 = r10 instanceof bsh.This
            if (r0 == 0) goto L1c
            boolean r0 = bsh.This.isExposedThisMethod(r11)
            if (r0 != 0) goto L1c
            r3 = r10
            bsh.This r3 = (bsh.This) r3
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            java.lang.Object r10 = r3.invokeMethod(r4, r5, r6, r7, r8, r9)
            return r10
        L1c:
            r4 = r11
            r5 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            bsh.BshClassManager r3 = r11.getClassManager()
            boolean r14 = r10 instanceof bsh.Primitive
            java.lang.Class r15 = r10.getClass()     // Catch: bsh.UtilEvalError -> L110
            if (r14 == 0) goto L6d
            java.lang.String r0 = "equals"
            boolean r0 = r4.equals(r0)     // Catch: bsh.UtilEvalError -> L43
            if (r0 == 0) goto L49
            bsh.Primitive r10 = (bsh.Primitive) r10     // Catch: bsh.UtilEvalError -> L43
            r11 = 0
            r11 = r5[r11]     // Catch: bsh.UtilEvalError -> L43
            boolean r10 = r10.equals(r11)     // Catch: bsh.UtilEvalError -> L43
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: bsh.UtilEvalError -> L43
            return r10
        L43:
            r0 = move-exception
            r10 = r0
            r6 = r12
            r7 = r13
            goto L12d
        L49:
            bsh.Primitive r0 = bsh.Primitive.NULL     // Catch: bsh.UtilEvalError -> L43
            if (r10 == r0) goto L5c
            bsh.Primitive r0 = bsh.Primitive.VOID     // Catch: bsh.UtilEvalError -> L43
            if (r10 == r0) goto L5c
            r15 = r10
            bsh.Primitive r15 = (bsh.Primitive) r15     // Catch: bsh.UtilEvalError -> L43
            java.lang.Class r15 = r15.getType()     // Catch: bsh.UtilEvalError -> L43
            java.lang.Object r10 = bsh.Primitive.unwrap(r10)     // Catch: bsh.UtilEvalError -> L43
        L5c:
            java.lang.String r0 = "getType"
            boolean r0 = r4.equals(r0)     // Catch: bsh.UtilEvalError -> L43
            if (r0 != 0) goto L6f
            java.lang.String r0 = "getClass"
            boolean r0 = r4.equals(r0)     // Catch: bsh.UtilEvalError -> L43
            if (r0 == 0) goto L6d
            goto L6f
        L6d:
            r9 = r10
            goto L7b
        L6f:
            bsh.Primitive r11 = bsh.Primitive.VOID     // Catch: bsh.UtilEvalError -> L43
            if (r10 != r11) goto L7a
            bsh.Primitive r10 = (bsh.Primitive) r10     // Catch: bsh.UtilEvalError -> L43
            java.lang.Class r10 = r10.getType()     // Catch: bsh.UtilEvalError -> L43
            return r10
        L7a:
            return r15
        L7b:
            r8 = 0
            r6 = r4
            r7 = r5
            r5 = r9
            r4 = r15
            bsh.Invocable r10 = resolveExpectedJavaMethod(r3, r4, r5, r6, r7, r8)     // Catch: bsh.UtilEvalError -> L43 java.lang.reflect.InvocationTargetException -> L9b bsh.ReflectError -> La3
            r4 = r6
            r5 = r7
            bsh.NameSpace r0 = getThisNS(r9)     // Catch: bsh.UtilEvalError -> L43 java.lang.reflect.InvocationTargetException -> L90 bsh.ReflectError -> L93
            if (r0 == 0) goto L96
            r0.setNode(r13)     // Catch: bsh.UtilEvalError -> L43 java.lang.reflect.InvocationTargetException -> L90 bsh.ReflectError -> L93
            goto L96
        L90:
            r0 = move-exception
        L91:
            r10 = r0
            goto L9e
        L93:
            r0 = move-exception
        L94:
            r10 = r0
            goto La9
        L96:
            java.lang.Object r10 = r10.invoke(r9, r5)     // Catch: bsh.UtilEvalError -> L43 java.lang.reflect.InvocationTargetException -> L90 bsh.ReflectError -> L93
            return r10
        L9b:
            r0 = move-exception
            r4 = r6
            goto L91
        L9e:
            bsh.TargetError r10 = targetErrorFromTargetException(r10, r4, r12, r13)     // Catch: bsh.UtilEvalError -> L43
            throw r10     // Catch: bsh.UtilEvalError -> L43
        La3:
            r0 = move-exception
            r15 = r4
            r9 = r5
            r4 = r6
            r5 = r7
            goto L94
        La9:
            bsh.Primitive r0 = bsh.Primitive.VOID     // Catch: bsh.UtilEvalError -> L110
            if (r9 == r0) goto L114
            bsh.NameSpace r0 = r12.top()     // Catch: bsh.UtilEvalError -> L110
            java.lang.Class[] r2 = bsh.Types.getTypes(r5)     // Catch: bsh.UtilEvalError -> L110
            bsh.BshMethod r3 = r0.getExtensionMethod(r15, r4, r2)     // Catch: bsh.UtilEvalError -> L110
            if (r3 == 0) goto Lc9
            r8 = 0
            r6 = r12
            r7 = r13
            r4 = r5
            r5 = r11
            java.lang.Object r10 = r3.invoke(r4, r5, r6, r7, r8, r9)     // Catch: bsh.UtilEvalError -> Lc5
            return r10
        Lc5:
            r0 = move-exception
        Lc6:
            r10 = r0
            goto L12d
        Lc9:
            r6 = r12
            r7 = r13
            r2 = r9
            if (r14 == 0) goto Lfa
            boolean r12 = r11.getStrictJava()     // Catch: bsh.UtilEvalError -> Lc5
            if (r12 != 0) goto Lfa
            boolean r12 = bsh.Types.isNumeric(r2)     // Catch: bsh.UtilEvalError -> Lc5 bsh.TargetError -> Le2 bsh.EvalError -> Lfa
            if (r12 != 0) goto Le5
            r3 = r4
            r4 = r5
            r5 = r11
            java.lang.Object r10 = invokeObjectMethod(r2, r3, r4, r5, r6, r7)     // Catch: bsh.UtilEvalError -> Lc5 bsh.TargetError -> Le2 bsh.EvalError -> Lfa
            return r10
        Le2:
            r0 = move-exception
        Le3:
            r10 = r0
            goto Lf9
        Le5:
            r3 = r15
            r8 = r7
            r7 = r6
            r6 = r11
            java.lang.Object r10 = numericMathMethod(r2, r3, r4, r5, r6, r7, r8)     // Catch: bsh.UtilEvalError -> Lee bsh.EvalError -> Lf2 bsh.TargetError -> Lf5
            return r10
        Lee:
            r0 = move-exception
            r6 = r7
            r7 = r8
            goto Lc6
        Lf2:
            r6 = r7
            r7 = r8
            goto Lfa
        Lf5:
            r0 = move-exception
            r6 = r7
            r7 = r8
            goto Le3
        Lf9:
            throw r10     // Catch: bsh.UtilEvalError -> Lc5
        Lfa:
            bsh.EvalError r11 = new bsh.EvalError     // Catch: bsh.UtilEvalError -> Lc5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> Lc5
            r12.<init>(r1)     // Catch: bsh.UtilEvalError -> Lc5
            java.lang.String r13 = r10.getMessage()     // Catch: bsh.UtilEvalError -> Lc5
            r12.append(r13)     // Catch: bsh.UtilEvalError -> Lc5
            java.lang.String r12 = r12.toString()     // Catch: bsh.UtilEvalError -> Lc5
            r11.<init>(r12, r7, r6, r10)     // Catch: bsh.UtilEvalError -> Lc5
            throw r11     // Catch: bsh.UtilEvalError -> Lc5
        L110:
            r0 = move-exception
            r6 = r12
            r7 = r13
            goto Lc6
        L114:
            r6 = r12
            r7 = r13
            bsh.EvalError r11 = new bsh.EvalError     // Catch: bsh.UtilEvalError -> Lc5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> Lc5
            r12.<init>(r2)     // Catch: bsh.UtilEvalError -> Lc5
            r12.append(r4)     // Catch: bsh.UtilEvalError -> Lc5
            java.lang.String r13 = "() on undefined"
            r12.append(r13)     // Catch: bsh.UtilEvalError -> Lc5
            java.lang.String r12 = r12.toString()     // Catch: bsh.UtilEvalError -> Lc5
            r11.<init>(r12, r7, r6, r10)     // Catch: bsh.UtilEvalError -> Lc5
            throw r11     // Catch: bsh.UtilEvalError -> Lc5
        L12d:
            bsh.EvalError r10 = r10.toEvalError(r7, r6)
            throw r10
    }

    public static java.lang.Object invokeStaticMethod(bsh.BshClassManager r7, java.lang.Class<?> r8, java.lang.String r9, java.lang.Object[] r10, bsh.Node r11) {
            java.lang.String r0 = "invoke static Method"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            bsh.Interpreter.debug(r0)
            bsh.NameSpace r0 = getThisNS(r8)
            if (r0 == 0) goto L12
            r0.setNode(r11)
        L12:
            r3 = 0
            r6 = 1
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            bsh.Invocable r7 = resolveExpectedJavaMethod(r1, r2, r3, r4, r5, r6)
            r8 = 0
            java.lang.Object r7 = r7.invoke(r8, r5)
            return r7
    }

    public static boolean isGeneratedClass(java.lang.Class<?> r1) {
            if (r1 == 0) goto Le
            java.lang.Class<bsh.GeneratedClass> r0 = bsh.GeneratedClass.class
            if (r1 == r0) goto Le
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean isPackageAccessible(java.lang.Class<?> r1) {
            boolean r0 = bsh.Capabilities.haveAccessibility()
            if (r0 != 0) goto L19
            java.util.regex.Pattern r0 = bsh.Reflect.PACKAGE_ACCESS
            java.lang.String r1 = r1.getName()
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L17
            goto L19
        L17:
            r1 = 0
            return r1
        L19:
            r1 = 1
            return r1
    }

    public static boolean isPackageScope(java.lang.Class<?> r1) {
            java.util.regex.Pattern r0 = bsh.Reflect.DEFAULT_PACKAGE
            java.lang.String r1 = r1.getName()
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    public static boolean isPrivate(java.lang.Class<?> r0) {
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPrivate(r0)
            return r0
    }

    public static boolean isPrivate(java.lang.reflect.Member r0) {
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPrivate(r0)
            return r0
    }

    public static boolean isPublic(java.lang.Class<?> r0) {
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            return r0
    }

    public static boolean isPublic(java.lang.reflect.Member r0) {
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            return r0
    }

    public static boolean isStatic(java.lang.Class<?> r0) {
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    public static boolean isStatic(java.lang.reflect.Member r0) {
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    private static /* synthetic */ java.lang.Class[] lambda$constructObject$1(int r0) {
            java.lang.Class[] r0 = new java.lang.Class[r0]
            return r0
    }

    private static /* synthetic */ boolean lambda$getEnumConstants$6(java.lang.Class r0, java.lang.reflect.Field r1) {
            java.lang.Class r1 = r1.getType()
            if (r1 != r0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$getEnumConstants$7(java.lang.reflect.Field r1) {
            r0 = 0
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L6
            return r1
        L6:
            return r0
    }

    private static /* synthetic */ java.lang.Object[] lambda$getEnumConstants$8(java.lang.Class r0, int r1) {
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    private static /* synthetic */ boolean lambda$getVariableNames$2(java.lang.String r1) {
            java.lang.String r0 = "_?bsh.*"
            boolean r1 = r1.matches(r0)
            r1 = r1 ^ 1
            return r1
    }

    private static /* synthetic */ java.lang.String[] lambda$getVariableNames$3(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    private static /* synthetic */ bsh.Variable lambda$getVariables$4(bsh.NameSpace r0, java.lang.String r1) {
            bsh.Variable r0 = getVariable(r0, r1)
            return r0
    }

    private static /* synthetic */ bsh.Variable[] lambda$getVariables$5(int r0) {
            bsh.Variable[] r0 = new bsh.Variable[r0]
            return r0
    }

    private static /* synthetic */ boolean lambda$static$0(java.lang.String r0) {
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public static void logInvokeMethod(java.lang.String r1, bsh.Invocable r2, java.util.List<java.lang.Object> r3) {
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            java.lang.Object[] r3 = r3.toArray()
            logInvokeMethod(r1, r2, r3)
        L15:
            return
    }

    public static void logInvokeMethod(java.lang.String r6, bsh.Invocable r7, java.lang.Object[] r8) {
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3c
            java.lang.String r0 = " with args:"
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7, r0}
            bsh.Interpreter.debug(r6)
            r6 = 0
        L18:
            int r7 = r8.length
            if (r6 >= r7) goto L3c
            r3 = r8[r6]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            if (r3 != 0) goto L27
            java.lang.String r7 = "<unknown>"
        L25:
            r5 = r7
            goto L2c
        L27:
            java.lang.Class r7 = r3.getClass()
            goto L25
        L2c:
            java.lang.String r0 = "args["
            java.lang.String r2 = "] = "
            java.lang.String r4 = " type = "
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5}
            bsh.Interpreter.debug(r7)
            int r6 = r6 + 1
            goto L18
        L3c:
            return
    }

    private static java.lang.Object numericMathMethod(java.lang.Object r11, java.lang.Class<?> r12, java.lang.String r13, java.lang.Object[] r14, bsh.Interpreter r15, bsh.CallStack r16, bsh.Node r17) {
            boolean r0 = bsh.Types.isFloatingpoint(r11)
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            java.lang.Class<java.math.BigDecimal> r2 = java.math.BigDecimal.class
            if (r0 == 0) goto L15
            r3 = r2
        Lb:
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            goto L17
        L15:
            r3 = r1
            goto Lb
        L17:
            java.lang.Object r11 = invokeMathMethod(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: bsh.EvalError -> L1c bsh.TargetError -> L34
            return r11
        L1c:
            boolean r0 = bsh.Types.isFloatingpoint(r11)
            if (r0 == 0) goto L2d
            r3 = r1
        L23:
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            goto L2f
        L2d:
            r3 = r2
            goto L23
        L2f:
            java.lang.Object r11 = invokeMathMethod(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L34:
            r0 = move-exception
            r1 = r3
            r11 = r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Method found on "
            r12.<init>(r13)
            java.lang.String r13 = r1.getSimpleName()
            r12.append(r13)
            java.lang.String r13 = " but with error"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            bsh.EvalError r11 = r11.reThrow(r12)
            throw r11
    }

    public static bsh.Invocable resolveExpectedJavaField(java.lang.Class<?> r2, java.lang.String r3, boolean r4) {
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r0 = bsh.BshClassManager.memberCache
            java.lang.Object r0 = r0.get(r2)
            bsh.BshClassManager$MemberCache r0 = (bsh.BshClassManager.MemberCache) r0
            bsh.Invocable r0 = r0.findField(r3)
            if (r0 == 0) goto L31
            if (r4 == 0) goto L30
            boolean r4 = r0.isStatic()
            if (r4 == 0) goto L17
            goto L30
        L17:
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.String r0 = "Can't reach instance field: "
            java.lang.String r1 = " from static context: "
            java.lang.StringBuilder r3 = bc.e.o(r0, r3, r1)
            java.lang.String r2 = r2.getName()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r4.<init>(r2)
            throw r4
        L30:
            return r0
        L31:
            bsh.ReflectError r4 = new bsh.ReflectError
            java.lang.String r0 = "No such field: "
            java.lang.String r1 = " for class: "
            java.lang.StringBuilder r3 = bc.e.o(r0, r3, r1)
            java.lang.String r2 = r2.getName()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r4.<init>(r2)
            throw r4
    }

    public static bsh.Invocable resolveExpectedJavaMethod(bsh.BshClassManager r1, java.lang.Class<?> r2, java.lang.Object r3, java.lang.String r4, java.lang.Object[] r5, boolean r6) {
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r3 == r0) goto L65
            java.lang.Class[] r3 = bsh.Types.getTypes(r5)
            bsh.Invocable r5 = resolveJavaMethod(r2, r4, r3, r6)
            if (r1 == 0) goto L31
            boolean r1 = r1.getStrictJava()
            if (r1 == 0) goto L31
            if (r5 == 0) goto L31
            java.lang.Class r1 = r5.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 == 0) goto L31
            java.lang.Class r1 = r5.getDeclaringClass()
            if (r1 == r2) goto L31
            int r1 = r5.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 == 0) goto L31
            r5 = 0
        L31:
            if (r5 != 0) goto L64
            bsh.ReflectError r1 = new bsh.ReflectError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r6 == 0) goto L3f
            java.lang.String r6 = "Static method "
            goto L41
        L3f:
            java.lang.String r6 = "Method "
        L41:
            r5.append(r6)
            java.lang.String r3 = bsh.StringUtil.methodString(r4, r3)
            r5.append(r3)
            java.lang.String r3 = " not found in class'"
            r5.append(r3)
            java.lang.String r2 = r2.getName()
            r5.append(r2)
            java.lang.String r2 = "'"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.<init>(r2)
            throw r1
        L64:
            return r5
        L65:
            bsh.UtilTargetError r1 = new bsh.UtilTargetError
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "Attempt to invoke method "
            java.lang.String r5 = " on null value"
            java.lang.String r3 = eh.a.n(r3, r4, r5)
            r2.<init>(r3)
            r1.<init>(r2)
            throw r1
    }

    public static bsh.Invocable resolveJavaField(java.lang.Class<?> r0, java.lang.String r1, boolean r2) {
            bsh.Invocable r0 = resolveExpectedJavaField(r0, r1, r2)     // Catch: bsh.ReflectError -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static bsh.Invocable resolveJavaMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Class<?>[] r3, boolean r4) {
            if (r1 == 0) goto L1d
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r0 = bsh.BshClassManager.memberCache
            java.lang.Object r0 = r0.get(r1)
            bsh.BshClassManager$MemberCache r0 = (bsh.BshClassManager.MemberCache) r0
            bsh.Invocable r2 = r0.findMethod(r2, r3)
            java.lang.String r3 = "resolved java method: "
            java.lang.String r0 = " on class: "
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2, r0, r1}
            bsh.Interpreter.debug(r3)
            checkFoundStaticMethod(r2, r4, r1)
            return r2
        L1d:
            java.lang.String r1 = "null class"
            bsh.j.f(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object setObjectProperty(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            boolean r0 = bsh.Types.isPropertyTypeMap(r5)
            if (r0 == 0) goto L11
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r7 = bsh.Primitive.unwrap(r7)
            java.lang.Object r5 = r5.put(r6, r7)
            return r5
        L11:
            boolean r0 = bsh.Types.isPropertyTypeEntry(r5)
            java.lang.String r1 = " for type: "
            java.lang.String r2 = "No such property setter: "
            if (r0 == 0) goto L4d
            r0 = r5
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L31
            java.lang.Object r5 = bsh.Primitive.unwrap(r7)
            java.lang.Object r5 = r0.setValue(r5)
            return r5
        L31:
            bsh.ReflectError r7 = new bsh.ReflectError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r5 = bsh.StringUtil.typeString(r5)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r7.<init>(r5)
            throw r7
        L4d:
            java.lang.Class r0 = r5.getClass()
            boolean r3 = bsh.Types.isPropertyTypeEntryList(r0)
            if (r3 == 0) goto L66
            java.util.Map$Entry[] r5 = (java.util.Map.Entry[]) r5
            java.util.Map$Entry r5 = getEntryForKey(r6, r5)
            java.lang.Object r6 = bsh.Primitive.unwrap(r7)
            java.lang.Object r5 = r5.setValue(r6)
            return r5
        L66:
            boolean r3 = r5 instanceof java.lang.Class
            if (r3 == 0) goto L6d
            r0 = r5
            java.lang.Class r0 = (java.lang.Class) r0
        L6d:
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r3 = bsh.BshClassManager.memberCache
            java.lang.Object r3 = r3.get(r0)
            bsh.BshClassManager$MemberCache r3 = (bsh.BshClassManager.MemberCache) r3
            java.lang.String r4 = r6.toString()
            bsh.Invocable r3 = r3.findSetter(r4)
            if (r3 == 0) goto La9
            java.lang.Object r6 = bsh.Primitive.unwrap(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L8c
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.reflect.InvocationTargetException -> L8c
            java.lang.Object r5 = r3.invoke(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L8c
            return r5
        L8c:
            r5 = move-exception
            bsh.ReflectError r6 = new bsh.ReflectError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Property accessor threw exception: "
            r7.<init>(r0)
            java.lang.Throwable r0 = r5.getCause()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.Throwable r5 = r5.getCause()
            r6.<init>(r7, r5)
            throw r6
        La9:
            bsh.ReflectError r5 = new bsh.ReflectError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            r7.append(r6)
            java.lang.String r6 = bsh.StringUtil.typeString(r0)
            r7.append(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
    }

    public static java.lang.Object setObjectProperty(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            boolean r0 = bsh.Types.isPropertyTypeEntry(r1)
            if (r0 == 0) goto L21
            r2.getClass()
            java.lang.String r0 = "val"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "value"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1a
            goto L21
        L1a:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.setValue(r3)
            return r1
        L21:
            java.lang.Object r1 = setObjectProperty(r1, r2, r3)
            return r1
    }

    public static bsh.BshMethod staticMethodImport(java.lang.Class<?> r1, java.lang.String r2) {
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r0 = bsh.BshClassManager.memberCache
            java.lang.Object r1 = r0.get(r1)
            bsh.BshClassManager$MemberCache r1 = (bsh.BshClassManager.MemberCache) r1
            bsh.Invocable r1 = r1.findStaticMethod(r2)
            r2 = 0
            if (r1 == 0) goto L15
            bsh.BshMethod r0 = new bsh.BshMethod
            r0.<init>(r1, r2)
            return r0
        L15:
            return r2
    }

    public static bsh.TargetError targetErrorFromTargetException(java.lang.reflect.InvocationTargetException r7, java.lang.String r8, bsh.CallStack r9, bsh.Node r10) {
            java.lang.String r0 = "Method Invocation "
            java.lang.String r2 = wb.en.g(r0, r8)
            java.lang.Throwable r3 = r7.getCause()
            boolean r7 = r3 instanceof bsh.EvalError
            r8 = 1
            if (r7 == 0) goto L1e
            boolean r7 = r3 instanceof bsh.TargetError
            if (r7 == 0) goto L1d
            r7 = r3
            bsh.TargetError r7 = (bsh.TargetError) r7
            boolean r7 = r7.inNativeCode()
            if (r7 == 0) goto L1d
            goto L1e
        L1d:
            r8 = 0
        L1e:
            r6 = r8
            bsh.TargetError r1 = new bsh.TargetError
            r5 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }
}
