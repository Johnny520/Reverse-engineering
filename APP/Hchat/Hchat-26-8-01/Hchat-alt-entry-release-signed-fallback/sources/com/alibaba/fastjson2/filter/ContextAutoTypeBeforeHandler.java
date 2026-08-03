package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ContextAutoTypeBeforeHandler implements com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler {
    static final java.lang.Class CLASS_UNMODIFIABLE_COLLECTION = null;
    static final java.lang.Class CLASS_UNMODIFIABLE_SET = null;
    static final java.lang.Class CLASS_UNMODIFIABLE_SORTED_SET = null;
    final long[] acceptHashCodes;
    final java.util.Map<java.lang.Long, java.lang.Class> classCache;
    final java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Class>> tclHashCaches;

    static {
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.SortedSet r0 = java.util.Collections.unmodifiableSortedSet(r0)
            java.lang.Class r0 = r0.getClass()
            com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler.CLASS_UNMODIFIABLE_SORTED_SET = r0
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            java.lang.Class r0 = r0.getClass()
            com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler.CLASS_UNMODIFIABLE_SET = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            java.lang.Class r0 = r0.getClass()
            com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler.CLASS_UNMODIFIABLE_COLLECTION = r0
            return
    }

    public ContextAutoTypeBeforeHandler(boolean r2) {
            r1 = this;
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1.<init>(r2, r0)
            return
    }

    public ContextAutoTypeBeforeHandler(boolean r1, java.lang.Class... r2) {
            r0 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String[] r2 = names(r2)
            r0.<init>(r1, r2)
            return
    }

    public ContextAutoTypeBeforeHandler(boolean r106, java.lang.String... r107) {
            r105 = this;
            r0 = r105
            r1 = r107
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r0.tclHashCaches = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r3 = 1061158912(0x3f400000, float:0.75)
            r4 = 1
            r5 = 16
            r2.<init>(r5, r3, r4)
            r0.classCache = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3 = 0
            if (r106 == 0) goto L137
            java.lang.Class<java.util.concurrent.TimeUnit> r4 = java.util.concurrent.TimeUnit.class
            java.util.EnumSet r4 = java.util.EnumSet.noneOf(r4)
            java.lang.Class r36 = r4.getClass()
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            java.lang.Class r55 = r4.getClass()
            java.util.Map r4 = java.util.Collections.EMPTY_MAP
            java.lang.Class r56 = r4.getClass()
            java.lang.Class r57 = com.alibaba.fastjson2.util.TypeUtils.CLASS_SINGLE_SET
            java.lang.Class r58 = com.alibaba.fastjson2.util.TypeUtils.CLASS_SINGLE_LIST
            java.lang.Class r59 = com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler.CLASS_UNMODIFIABLE_COLLECTION
            java.lang.Class r60 = com.alibaba.fastjson2.util.TypeUtils.CLASS_UNMODIFIABLE_LIST
            java.lang.Class r61 = com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler.CLASS_UNMODIFIABLE_SET
            java.lang.Class r62 = com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler.CLASS_UNMODIFIABLE_SORTED_SET
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            java.lang.Class r63 = r4.getClass()
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>()
            java.util.SortedMap r4 = java.util.Collections.unmodifiableSortedMap(r4)
            java.lang.Class r64 = r4.getClass()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.lang.Class r65 = r4.getClass()
            java.lang.Class<java.lang.VerifyError> r103 = java.lang.VerifyError.class
            java.lang.Class<java.lang.StackTraceElement> r104 = java.lang.StackTraceElement.class
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            java.lang.Class r6 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r7 = java.lang.Byte.class
            java.lang.Class r8 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r9 = java.lang.Short.class
            java.lang.Class r10 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            java.lang.Class r12 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r13 = java.lang.Long.class
            java.lang.Class r14 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r15 = java.lang.Float.class
            java.lang.Class r16 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r17 = java.lang.Double.class
            java.lang.Class<java.lang.Number> r18 = java.lang.Number.class
            java.lang.Class<java.math.BigInteger> r19 = java.math.BigInteger.class
            java.lang.Class<java.math.BigDecimal> r20 = java.math.BigDecimal.class
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r21 = java.util.concurrent.atomic.AtomicInteger.class
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r22 = java.util.concurrent.atomic.AtomicLong.class
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r23 = java.util.concurrent.atomic.AtomicBoolean.class
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r24 = java.util.concurrent.atomic.AtomicIntegerArray.class
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r25 = java.util.concurrent.atomic.AtomicLongArray.class
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r26 = java.util.concurrent.atomic.AtomicReference.class
            java.lang.Class r27 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r28 = java.lang.Boolean.class
            java.lang.Class r29 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r30 = java.lang.Character.class
            java.lang.Class<java.lang.String> r31 = java.lang.String.class
            java.lang.Class<java.util.UUID> r32 = java.util.UUID.class
            java.lang.Class<java.util.Currency> r33 = java.util.Currency.class
            java.lang.Class<java.util.BitSet> r34 = java.util.BitSet.class
            java.lang.Class<java.util.EnumSet> r35 = java.util.EnumSet.class
            java.lang.Class<java.util.Date> r37 = java.util.Date.class
            java.lang.Class<java.util.Calendar> r38 = java.util.Calendar.class
            java.lang.Class<java.time.LocalDate> r39 = java.time.LocalDate.class
            java.lang.Class<java.time.LocalDateTime> r40 = java.time.LocalDateTime.class
            java.lang.Class<java.time.Instant> r41 = java.time.Instant.class
            java.lang.Class<java.text.SimpleDateFormat> r42 = java.text.SimpleDateFormat.class
            java.lang.Class<java.time.format.DateTimeFormatter> r43 = java.time.format.DateTimeFormatter.class
            java.lang.Class<java.util.concurrent.TimeUnit> r44 = java.util.concurrent.TimeUnit.class
            java.lang.Class<java.util.Set> r45 = java.util.Set.class
            java.lang.Class<java.util.HashSet> r46 = java.util.HashSet.class
            java.lang.Class<java.util.LinkedHashSet> r47 = java.util.LinkedHashSet.class
            java.lang.Class<java.util.TreeSet> r48 = java.util.TreeSet.class
            java.lang.Class<java.util.List> r49 = java.util.List.class
            java.lang.Class<java.util.ArrayList> r50 = java.util.ArrayList.class
            java.lang.Class<java.util.LinkedList> r51 = java.util.LinkedList.class
            java.lang.Class<java.util.concurrent.ConcurrentLinkedQueue> r52 = java.util.concurrent.ConcurrentLinkedQueue.class
            java.lang.Class<java.util.concurrent.ConcurrentSkipListSet> r53 = java.util.concurrent.ConcurrentSkipListSet.class
            java.lang.Class<java.util.concurrent.CopyOnWriteArrayList> r54 = java.util.concurrent.CopyOnWriteArrayList.class
            java.lang.Class<java.util.Map> r66 = java.util.Map.class
            java.lang.Class<java.util.HashMap> r67 = java.util.HashMap.class
            java.lang.Class<java.util.Hashtable> r68 = java.util.Hashtable.class
            java.lang.Class<java.util.TreeMap> r69 = java.util.TreeMap.class
            java.lang.Class<java.util.LinkedHashMap> r70 = java.util.LinkedHashMap.class
            java.lang.Class<java.util.WeakHashMap> r71 = java.util.WeakHashMap.class
            java.lang.Class<java.util.IdentityHashMap> r72 = java.util.IdentityHashMap.class
            java.lang.Class<java.util.concurrent.ConcurrentMap> r73 = java.util.concurrent.ConcurrentMap.class
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r74 = java.util.concurrent.ConcurrentHashMap.class
            java.lang.Class<java.util.concurrent.ConcurrentSkipListMap> r75 = java.util.concurrent.ConcurrentSkipListMap.class
            java.lang.Class<java.lang.Exception> r76 = java.lang.Exception.class
            java.lang.Class<java.lang.IllegalAccessError> r77 = java.lang.IllegalAccessError.class
            java.lang.Class<java.lang.IllegalAccessException> r78 = java.lang.IllegalAccessException.class
            java.lang.Class<java.lang.IllegalArgumentException> r79 = java.lang.IllegalArgumentException.class
            java.lang.Class<java.lang.IllegalMonitorStateException> r80 = java.lang.IllegalMonitorStateException.class
            java.lang.Class<java.lang.IllegalStateException> r81 = java.lang.IllegalStateException.class
            java.lang.Class<java.lang.IllegalThreadStateException> r82 = java.lang.IllegalThreadStateException.class
            java.lang.Class<java.lang.IndexOutOfBoundsException> r83 = java.lang.IndexOutOfBoundsException.class
            java.lang.Class<java.lang.InstantiationError> r84 = java.lang.InstantiationError.class
            java.lang.Class<java.lang.InstantiationException> r85 = java.lang.InstantiationException.class
            java.lang.Class<java.lang.InternalError> r86 = java.lang.InternalError.class
            java.lang.Class<java.lang.InterruptedException> r87 = java.lang.InterruptedException.class
            java.lang.Class<java.lang.LinkageError> r88 = java.lang.LinkageError.class
            java.lang.Class<java.lang.NegativeArraySizeException> r89 = java.lang.NegativeArraySizeException.class
            java.lang.Class<java.lang.NoClassDefFoundError> r90 = java.lang.NoClassDefFoundError.class
            java.lang.Class<java.lang.NoSuchFieldError> r91 = java.lang.NoSuchFieldError.class
            java.lang.Class<java.lang.NoSuchFieldException> r92 = java.lang.NoSuchFieldException.class
            java.lang.Class<java.lang.NoSuchMethodError> r93 = java.lang.NoSuchMethodError.class
            java.lang.Class<java.lang.NoSuchMethodException> r94 = java.lang.NoSuchMethodException.class
            java.lang.Class<java.lang.NullPointerException> r95 = java.lang.NullPointerException.class
            java.lang.Class<java.lang.NumberFormatException> r96 = java.lang.NumberFormatException.class
            java.lang.Class<java.lang.OutOfMemoryError> r97 = java.lang.OutOfMemoryError.class
            java.lang.Class<java.lang.RuntimeException> r98 = java.lang.RuntimeException.class
            java.lang.Class<java.lang.SecurityException> r99 = java.lang.SecurityException.class
            java.lang.Class<java.lang.StackOverflowError> r100 = java.lang.StackOverflowError.class
            java.lang.Class<java.lang.StringIndexOutOfBoundsException> r101 = java.lang.StringIndexOutOfBoundsException.class
            java.lang.Class<java.lang.TypeNotPresentException> r102 = java.lang.TypeNotPresentException.class
            java.lang.Class[] r4 = new java.lang.Class[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104}
            r5 = r3
        L11d:
            r6 = 100
            if (r5 >= r6) goto L12d
            r6 = r4[r5]
            java.lang.String r6 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r6)
            r2.add(r6)
            int r5 = r5 + 1
            goto L11d
        L12d:
            java.lang.String r4 = "javax.validation.ValidationException"
            r2.add(r4)
            java.lang.String r4 = "javax.validation.NoProviderFoundException"
            r2.add(r4)
        L137:
            r4 = r3
        L138:
            int r5 = r1.length
            if (r4 >= r5) goto L156
            r5 = r1[r4]
            if (r5 == 0) goto L153
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L146
            goto L153
        L146:
            java.lang.Class r6 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r5)
            if (r6 == 0) goto L150
            java.lang.String r5 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r6)
        L150:
            r2.add(r5)
        L153:
            int r4 = r4 + 1
            goto L138
        L156:
            int r1 = r2.size()
            long[] r4 = new long[r1]
            java.util.Iterator r2 = r2.iterator()
            r5 = r3
        L161:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L194
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            r7 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r9 = r3
        L173:
            int r10 = r6.length()
            if (r9 >= r10) goto L18e
            char r10 = r6.charAt(r9)
            r11 = 36
            if (r10 != r11) goto L183
            r10 = 46
        L183:
            long r10 = (long) r10
            long r7 = r7 ^ r10
            r10 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r7 = r7 * r10
            int r9 = r9 + 1
            goto L173
        L18e:
            int r6 = r5 + 1
            r4[r5] = r7
            r5 = r6
            goto L161
        L194:
            if (r5 == r1) goto L19a
            long[] r4 = java.util.Arrays.copyOf(r4, r5)
        L19a:
            java.util.Arrays.sort(r4)
            r0.acceptHashCodes = r4
            return
    }

    public ContextAutoTypeBeforeHandler(java.lang.Class... r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public ContextAutoTypeBeforeHandler(java.lang.String... r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public static java.lang.String[] names(java.util.Collection<java.lang.Class> r2) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r2.next()
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 != 0) goto L18
            goto L9
        L18:
            java.lang.String r1 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r1)
            r0.add(r1)
            goto L9
        L20:
            int r2 = r0.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    private java.lang.Class putCacheIfAbsent(long r5, java.lang.Class r7) {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            if (r0 == 0) goto L4a
            java.lang.Class<com.alibaba.fastjson2.JSON> r1 = com.alibaba.fastjson2.JSON.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r0 == r1) goto L4a
            int r0 = java.lang.System.identityHashCode(r0)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Class>> r1 = r4.tclHashCaches
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 != 0) goto L3f
            java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Class>> r1 = r4.tclHashCaches
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r1.put(r2, r3)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Class>> r1 = r4.tclHashCaches
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            r1 = r0
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
        L3f:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r1.put(r5, r7)
            java.lang.Class r5 = (java.lang.Class) r5
            return r5
        L4a:
            java.util.Map<java.lang.Long, java.lang.Class> r0 = r4.classCache
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r0.put(r5, r7)
            java.lang.Class r5 = (java.lang.Class) r5
            return r5
    }

    @Override // com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
    public java.lang.Class<?> apply(long r1, java.lang.Class<?> r3, long r4) {
            r0 = this;
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r3 = r3.getContextClassLoader()
            if (r3 == 0) goto L2f
            java.lang.Class<com.alibaba.fastjson2.JSON> r4 = com.alibaba.fastjson2.JSON.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            if (r3 == r4) goto L2f
            int r3 = java.lang.System.identityHashCode(r3)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.lang.Class>> r4 = r0.tclHashCaches
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r4.get(r3)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            if (r3 == 0) goto L2f
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
        L2f:
            java.util.Map<java.lang.Long, java.lang.Class> r3 = r0.classCache
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
    public java.lang.Class<?> apply(java.lang.String r13, java.lang.Class<?> r14, long r15) {
            r12 = this;
            java.lang.String r0 = "O"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto La
            java.lang.String r13 = "Object"
        La:
            int r6 = r13.length()
            r7 = 0
            r0 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r8 = r7
        L15:
            if (r8 >= r6) goto L53
            char r2 = r13.charAt(r8)
            r3 = 36
            if (r2 != r3) goto L21
            r2 = 46
        L21:
            long r2 = (long) r2
            long r0 = r0 ^ r2
            r2 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r9 = r0 * r2
            long[] r0 = r12.acceptHashCodes
            int r0 = java.util.Arrays.binarySearch(r0, r9)
            if (r0 < 0) goto L4f
            long r1 = com.alibaba.fastjson2.util.Fnv.hashCode64(r13)
            r0 = r12
            r3 = r14
            r4 = r15
            java.lang.Class r11 = r0.apply(r1, r3, r4)
            if (r11 != 0) goto L4c
            java.lang.Class r11 = com.alibaba.fastjson2.util.TypeUtils.loadClass(r13)
            if (r11 == 0) goto L4c
            java.lang.Class r1 = r12.putCacheIfAbsent(r1, r11)
            if (r1 == 0) goto L4c
            r11 = r1
        L4c:
            if (r11 == 0) goto L4f
            return r11
        L4f:
            int r8 = r8 + 1
            r0 = r9
            goto L15
        L53:
            long r1 = com.alibaba.fastjson2.util.Fnv.hashCode64(r13)
            int r3 = r13.length()
            r6 = 0
            if (r3 <= 0) goto L92
            char r3 = r13.charAt(r7)
            r4 = 91
            if (r3 != r4) goto L92
            r0 = r12
            r3 = r14
            r4 = r15
            java.lang.Class r7 = r0.apply(r1, r3, r4)
            if (r7 == 0) goto L70
            return r7
        L70:
            r7 = 1
            java.lang.String r7 = r13.substring(r7)
            if (r14 == 0) goto L7c
            java.lang.Class r8 = r14.getComponentType()
            goto L7d
        L7c:
            r8 = r6
        L7d:
            java.lang.Class r7 = r12.apply(r7, r8, r4)
            if (r7 == 0) goto L93
            if (r7 != r8) goto L86
            goto L8a
        L86:
            java.lang.Class r14 = com.alibaba.fastjson2.util.TypeUtils.getArrayClass(r7)
        L8a:
            java.lang.Class r13 = r12.putCacheIfAbsent(r1, r14)
            if (r13 == 0) goto L91
            return r13
        L91:
            return r14
        L92:
            r4 = r15
        L93:
            java.lang.Class r7 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r13)
            if (r7 == 0) goto Lad
            java.lang.String r7 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r7)
            boolean r13 = r13.equals(r7)
            if (r13 != 0) goto Lad
            java.lang.Class r13 = r12.apply(r7, r14, r4)
            if (r13 == 0) goto Lac
            r12.putCacheIfAbsent(r1, r13)
        Lac:
            return r13
        Lad:
            return r6
    }
}
