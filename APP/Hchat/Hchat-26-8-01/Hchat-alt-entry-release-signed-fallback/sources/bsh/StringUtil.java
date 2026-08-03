package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class StringUtil {
    public StringUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String a(java.lang.Class r0) {
            java.lang.String r0 = getTypeName(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String b(java.util.Iterator r0, java.lang.String r1) {
            java.lang.String r0 = lambda$getTypeNames$1(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String[] c(int r0) {
            java.lang.String[] r0 = lambda$getTypeNames$2(r0)
            return r0
    }

    public static java.lang.String classString(java.lang.Class<?> r2) {
            boolean r0 = bsh.Reflect.isGeneratedClass(r2)
            if (r0 == 0) goto Lb
            java.lang.String r2 = generatedClassString(r2)
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.getModifiers()
            java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
            r0.append(r1)
            boolean r1 = r2.isInterface()
            if (r1 == 0) goto L24
            java.lang.String r1 = ""
            goto L26
        L24:
            java.lang.String r1 = " class"
        L26:
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = getTypeName(r2)
            r0.append(r1)
            java.lang.String r1 = getTypeExtends(r2)
            r0.append(r1)
            java.lang.String r2 = getTypeImplements(r2)
            r0.append(r2)
            java.lang.String r2 = " {"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = r2.trim()
            return r2
    }

    public static /* synthetic */ java.lang.String[] d(int r0) {
            java.lang.String[] r0 = lambda$getTypeNames$0(r0)
            return r0
    }

    private static java.lang.String generatedClassString(java.lang.Class<?> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            bsh.Modifiers r1 = bsh.Reflect.getClassModifiers(r3)
            java.lang.String r1 = r1.toString()
            r2 = 11
            java.lang.String r1 = r1.substring(r2)
            r0.append(r1)
            boolean r1 = r3.isInterface()
            if (r1 == 0) goto L1f
            java.lang.String r1 = " interface"
            goto L21
        L1f:
            java.lang.String r1 = " class"
        L21:
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = getTypeName(r3)
            r0.append(r1)
            java.lang.String r1 = getTypeExtends(r3)
            r0.append(r1)
            java.lang.String r3 = getTypeImplements(r3)
            r0.append(r3)
            java.lang.String r3 = " {"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r3.trim()
            return r3
    }

    private static java.lang.String getTypeExtends(java.lang.Class<?> r2) {
            boolean r0 = r2.isInterface()
            if (r0 == 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " extends "
            r0.<init>(r1)
            java.lang.Class r2 = r2.getSuperclass()
            java.lang.String r2 = getTypeName(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String getTypeImplements(java.lang.Class<?> r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class[] r1 = r2.getInterfaces()
            int r1 = r1.length
            if (r1 <= 0) goto L2b
            boolean r1 = r2.isInterface()
            if (r1 == 0) goto L15
            java.lang.String r1 = " extends "
            goto L17
        L15:
            java.lang.String r1 = " implements "
        L17:
            r0.append(r1)
            java.lang.Class[] r2 = r2.getInterfaces()
            java.util.List r2 = getTypeNamesList(r2)
            java.lang.String r1 = ", "
            java.lang.String r2 = java.lang.String.join(r1, r2)
            r0.append(r2)
        L2b:
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String getTypeName(java.lang.Class<?> r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = "Object"
            return r0
        L5:
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    private static java.lang.String[] getTypeNames(java.lang.Class<?>[] r2) {
            java.util.stream.Stream r2 = getTypeNamesStream(r2)
            bsh.e r0 = new bsh.e
            r1 = 13
            r0.<init>(r1)
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    private static java.lang.String[] getTypeNames(java.lang.Class<?>[] r2, java.lang.String[] r3) {
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            java.util.Iterator r3 = r3.iterator()
            java.util.stream.Stream r2 = getTypeNamesStream(r2)
            bc.j r0 = new bc.j
            r1 = 2
            r0.<init>(r3, r1)
            java.util.stream.Stream r2 = r2.map(r0)
            bsh.e r3 = new bsh.e
            r0 = 12
            r3.<init>(r0)
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    private static java.util.List<java.lang.String> getTypeNamesList(java.lang.Class<?>[] r1) {
            java.util.stream.Stream r1 = getTypeNamesStream(r1)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r0)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    private static java.util.stream.Stream<java.lang.String> getTypeNamesStream(java.lang.Class<?>[] r2) {
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            bsh.b r0 = new bsh.b
            r1 = 15
            r0.<init>(r1)
            java.util.stream.Stream r2 = r2.map(r0)
            return r2
    }

    private static /* synthetic */ java.lang.String[] lambda$getTypeNames$0(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$getTypeNames$1(java.util.Iterator r1, java.lang.String r2) {
            java.lang.String r0 = " "
            java.lang.StringBuilder r2 = bc.e.n(r2, r0)
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
    }

    private static /* synthetic */ java.lang.String[] lambda$getTypeNames$2(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    public static java.lang.String maxCommonPrefix(java.lang.String r3, java.lang.String r4) {
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r3.regionMatches(r0, r4, r0, r1)
            if (r2 == 0) goto Lb
            int r1 = r1 + 1
            goto L2
        Lb:
            int r1 = r1 + (-1)
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
    }

    public static java.lang.String methodString(bsh.BshMethod r4) {
            bsh.Modifiers r0 = r4.getModifiers()
            java.lang.String r0 = r0.toString()
            r1 = 11
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r2 = bc.e.n(r0, r1)
            java.lang.Class r3 = r4.getReturnType()
            java.lang.String r3 = getTypeName(r3)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r4.getName()
            java.lang.Class[] r3 = r4.getParameterTypes()
            java.lang.String[] r4 = r4.getParameterNames()
            java.lang.String r4 = methodString(r1, r3, r4)
            r2.append(r4)
            java.lang.String r4 = "abstract"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L40
            java.lang.String r4 = ";"
            goto L42
        L40:
            java.lang.String r4 = " {}"
        L42:
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }

    public static java.lang.String methodString(java.lang.String r0, java.lang.Class<?>[] r1) {
            java.lang.String[] r1 = getTypeNames(r1)
            java.lang.String r0 = methodString(r0, r1)
            return r0
    }

    public static java.lang.String methodString(java.lang.String r0, java.lang.Class<?>[] r1, java.lang.String[] r2) {
            java.lang.String[] r1 = getTypeNames(r1, r2)
            java.lang.String r0 = methodString(r0, r1)
            return r0
    }

    public static java.lang.String methodString(java.lang.String r0, java.lang.Object[] r1) {
            java.lang.Class[] r1 = bsh.Types.getTypes(r1)
            java.lang.String r0 = methodString(r0, r1)
            return r0
    }

    public static java.lang.String methodString(java.lang.String r2, java.lang.String[] r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r2 = 40
            r0.append(r2)
            r2 = 0
        Le:
            int r1 = r3.length
            if (r2 >= r1) goto L20
            if (r2 == 0) goto L18
            java.lang.String r1 = ", "
            r0.append(r1)
        L18:
            r1 = r3[r2]
            r0.append(r1)
            int r2 = r2 + 1
            goto Le
        L20:
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String methodString(java.lang.reflect.Method r4) {
            int r0 = r4.getModifiers()
            java.lang.String r0 = java.lang.reflect.Modifier.toString(r0)
            java.lang.String r1 = " "
            java.lang.StringBuilder r2 = bc.e.n(r0, r1)
            java.lang.Class r3 = r4.getReturnType()
            java.lang.String r3 = getTypeName(r3)
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r4.getName()
            java.lang.Class[] r4 = r4.getParameterTypes()
            java.lang.String r4 = methodString(r1, r4)
            r2.append(r4)
            java.lang.String r4 = "abstract"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L36
            java.lang.String r4 = ";"
            goto L38
        L36:
            java.lang.String r4 = " {}"
        L38:
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }

    public static java.lang.String typeString(java.lang.Class<?> r2) {
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto La
        L8:
            r2 = r0
            goto L37
        La:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto L1c
            java.lang.Class<java.util.Queue> r1 = java.util.Queue.class
            boolean r2 = r1.isAssignableFrom(r2)
            if (r2 == 0) goto L8
            r2 = r1
            goto L37
        L1c:
            java.lang.Class<java.util.Deque> r0 = java.util.Deque.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto L25
            goto L8
        L25:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto L2e
            goto L8
        L2e:
            java.lang.Class<java.util.Map$Entry> r0 = java.util.Map.Entry.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto L37
            goto L8
        L37:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r2 = r2.getComponentType()
            java.lang.String r2 = typeString(r2)
            r0.append(r2)
            java.lang.String r2 = "[]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L57:
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "java"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L68
            java.lang.String r2 = r2.getSimpleName()
            return r2
        L68:
            java.lang.String r2 = r2.getName()
            return r2
    }

    public static java.lang.String typeString(java.lang.Object r1) {
            if (r1 == 0) goto L1f
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r0 != r1) goto L7
            goto L1f
        L7:
            boolean r0 = r1 instanceof bsh.Primitive
            if (r0 == 0) goto L16
            bsh.Primitive r1 = (bsh.Primitive) r1
            java.lang.Class r1 = r1.getType()
            java.lang.String r1 = r1.getSimpleName()
            return r1
        L16:
            java.lang.Class r1 = bsh.Types.getType(r1)
            java.lang.String r1 = typeString(r1)
            return r1
        L1f:
            java.lang.String r1 = "null"
            return r1
    }

    public static java.lang.String typeValueString(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = valueString(r2)
            r0.<init>(r1)
            java.lang.String r1 = " :"
            r0.append(r1)
            java.lang.String r2 = typeString(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String valueString(java.lang.Object r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.String r1 = "}"
            java.lang.String r2 = "{"
            r3 = 2
            r4 = 32
            java.lang.String r5 = ", "
            r6 = 0
            if (r9 == 0) goto L5f
            java.lang.Class r7 = r9.getClass()
            boolean r7 = r7.isArray()
            if (r7 == 0) goto L5f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r2 = r6
        L2f:
            int r7 = java.lang.reflect.Array.getLength(r9)
            if (r2 >= r7) goto L46
            java.lang.Object r7 = java.lang.reflect.Array.get(r9, r2)
            java.lang.String r7 = valueString(r7)
            r0.append(r7)
            r0.append(r5)
            int r2 = r2 + 1
            goto L2f
        L46:
            java.lang.StringBuilder r9 = r0.reverse()
            char r9 = r9.charAt(r6)
            if (r9 != r4) goto L53
            r0.delete(r6, r3)
        L53:
            java.lang.StringBuilder r9 = r0.reverse()
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            return r9
        L5f:
            boolean r7 = r9 instanceof java.util.Collection
            if (r7 == 0) goto La0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.Iterator r9 = r9.iterator()
        L70:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = valueString(r1)
            r0.append(r1)
            r0.append(r5)
            goto L70
        L85:
            java.lang.StringBuilder r9 = r0.reverse()
            char r9 = r9.charAt(r6)
            if (r9 != r4) goto L92
            r0.delete(r6, r3)
        L92:
            java.lang.StringBuilder r9 = r0.reverse()
            java.lang.String r0 = "]"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            return r9
        La0:
            boolean r7 = r9 instanceof java.util.Map
            java.lang.String r8 = "="
            if (r7 == 0) goto Lf7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.util.Map r9 = (java.util.Map) r9
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        Lb5:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lde
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r7 = r2.getKey()
            java.lang.String r7 = valueString(r7)
            r0.append(r7)
            r0.append(r8)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = valueString(r2)
            r0.append(r2)
            r0.append(r5)
            goto Lb5
        Lde:
            java.lang.StringBuilder r9 = r0.reverse()
            char r9 = r9.charAt(r6)
            if (r9 != r4) goto Leb
            r0.delete(r6, r3)
        Leb:
            java.lang.StringBuilder r9 = r0.reverse()
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            return r9
        Lf7:
            boolean r1 = r9 instanceof java.util.Map.Entry
            if (r1 == 0) goto L11d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r1 = r9.getKey()
            java.lang.String r1 = valueString(r1)
            r0.<init>(r1)
            r0.append(r8)
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = valueString(r9)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L11d:
            boolean r1 = r9 instanceof java.lang.String
            if (r1 == 0) goto L12f
            java.lang.String r9 = "\""
            java.lang.StringBuilder r0 = r0.insert(r6, r9)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L12f:
            java.lang.Object r1 = bsh.Primitive.unwrap(r9)
            boolean r1 = r1 instanceof java.lang.Character
            if (r1 == 0) goto L145
            java.lang.String r9 = "'"
            java.lang.StringBuilder r0 = r0.insert(r6, r9)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L145:
            java.lang.Object r1 = bsh.Primitive.unwrap(r9)
            boolean r1 = r1 instanceof java.lang.Number
            if (r1 == 0) goto L1dd
            java.lang.Object r1 = bsh.Primitive.unwrap(r9)
            boolean r1 = r1 instanceof java.lang.Byte
            if (r1 == 0) goto L15f
            java.lang.String r9 = "o"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L15f:
            java.lang.Object r1 = bsh.Primitive.unwrap(r9)
            boolean r1 = r1 instanceof java.lang.Short
            if (r1 == 0) goto L171
            java.lang.String r9 = "s"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L171:
            java.lang.Object r1 = bsh.Primitive.unwrap(r9)
            boolean r1 = r1 instanceof java.lang.Integer
            if (r1 == 0) goto L183
            java.lang.String r9 = "I"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L183:
            java.lang.Object r1 = bsh.Primitive.unwrap(r9)
            boolean r1 = r1 instanceof java.lang.Long
            if (r1 == 0) goto L195
            java.lang.String r9 = "L"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L195:
            java.lang.Object r1 = bsh.Primitive.unwrap(r9)
            boolean r1 = r1 instanceof java.math.BigInteger
            if (r1 == 0) goto L1a7
            java.lang.String r9 = "W"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L1a7:
            java.lang.Object r1 = bsh.Primitive.unwrap(r9)
            boolean r1 = r1 instanceof java.lang.Float
            if (r1 == 0) goto L1b9
            java.lang.String r9 = "f"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L1b9:
            java.lang.Object r1 = bsh.Primitive.unwrap(r9)
            boolean r1 = r1 instanceof java.lang.Double
            if (r1 == 0) goto L1cb
            java.lang.String r9 = "d"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L1cb:
            java.lang.Object r9 = bsh.Primitive.unwrap(r9)
            boolean r9 = r9 instanceof java.math.BigDecimal
            if (r9 == 0) goto L1dd
            java.lang.String r9 = "w"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        L1dd:
            java.lang.String r9 = r0.toString()
            return r9
    }

    public static java.lang.String variableString(bsh.Variable r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            bsh.Modifiers r1 = r3.getModifiers()
            java.lang.String r1 = r1.toString()
            r2 = 11
            java.lang.String r1 = r1.substring(r2)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.Class r2 = r3.getType()
            java.lang.String r2 = getTypeName(r2)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = ";"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static java.lang.String variableString(java.lang.reflect.Field r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.getModifiers()
            java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.Class r2 = r3.getType()
            java.lang.String r2 = getTypeName(r2)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = ";"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
