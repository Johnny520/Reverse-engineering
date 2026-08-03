package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class TypeUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final double[] BIG_10_POW = null;
    private static final java.math.BigInteger[] BIG_TEN_POWERS_TABLE_0 = null;
    private static volatile java.math.BigInteger[] BIG_TEN_POWERS_TABLE_1;
    static final com.alibaba.fastjson2.util.TypeUtils.Cache CACHE = null;
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils.Cache, char[]> CHARS_UPDATER = null;
    public static final java.lang.Class CLASS_SINGLE_LIST = null;
    public static final java.lang.Class CLASS_SINGLE_SET = null;
    public static final java.lang.Class CLASS_UNMODIFIABLE_LIST = null;
    public static final java.lang.reflect.ParameterizedType PARAM_TYPE_LIST_STR = null;
    static final float[] SINGLE_SMALL_10_POW = null;
    public static final double[] SMALL_10_POW = null;
    static final double[] TINY_10_POW = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Cache {
        volatile char[] chars;

        public Cache() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Mapping {
        static final java.util.Map<java.lang.Class, java.lang.String> NAME_MAPPINGS = null;
        static final java.util.Map<java.lang.String, java.lang.Class> TYPE_MAPPINGS = null;

        static {
                java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
                r1 = 192(0xc0, float:2.69E-43)
                r0.<init>(r1)
                com.alibaba.fastjson2.util.TypeUtils.Mapping.NAME_MAPPINGS = r0
                java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
                r2 = 256(0x100, float:3.59E-43)
                r1.<init>(r2)
                com.alibaba.fastjson2.util.TypeUtils.Mapping.TYPE_MAPPINGS = r1
                java.lang.Class r2 = java.lang.Byte.TYPE
                java.lang.String r3 = "B"
                r0.put(r2, r3)
                java.lang.Class r2 = java.lang.Short.TYPE
                java.lang.String r3 = "S"
                r0.put(r2, r3)
                java.lang.Class r2 = java.lang.Integer.TYPE
                java.lang.String r3 = "I"
                r0.put(r2, r3)
                java.lang.Class r2 = java.lang.Long.TYPE
                java.lang.String r3 = "J"
                r0.put(r2, r3)
                java.lang.Class r2 = java.lang.Float.TYPE
                java.lang.String r3 = "F"
                r0.put(r2, r3)
                java.lang.Class r2 = java.lang.Double.TYPE
                java.lang.String r3 = "D"
                r0.put(r2, r3)
                java.lang.Class r2 = java.lang.Character.TYPE
                java.lang.String r3 = "C"
                r0.put(r2, r3)
                java.lang.Class r2 = java.lang.Boolean.TYPE
                java.lang.String r3 = "Z"
                r0.put(r2, r3)
                java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
                java.lang.String r3 = "[O"
                r0.put(r2, r3)
                java.lang.Class<java.lang.Object[][]> r4 = java.lang.Object[][].class
                java.lang.String r5 = "[[O"
                r0.put(r4, r5)
                java.lang.Class<byte[]> r4 = byte[].class
                java.lang.String r5 = "[B"
                r0.put(r4, r5)
                java.lang.Class<byte[][]> r4 = byte[][].class
                java.lang.String r5 = "[[B"
                r0.put(r4, r5)
                java.lang.Class<short[]> r4 = short[].class
                java.lang.String r5 = "[S"
                r0.put(r4, r5)
                java.lang.Class<short[][]> r4 = short[][].class
                java.lang.String r5 = "[[S"
                r0.put(r4, r5)
                java.lang.Class<int[]> r4 = int[].class
                java.lang.String r5 = "[I"
                r0.put(r4, r5)
                java.lang.Class<int[][]> r4 = int[][].class
                java.lang.String r5 = "[[I"
                r0.put(r4, r5)
                java.lang.Class<long[]> r4 = long[].class
                java.lang.String r5 = "[J"
                r0.put(r4, r5)
                java.lang.Class<long[][]> r4 = long[][].class
                java.lang.String r5 = "[[J"
                r0.put(r4, r5)
                java.lang.Class<float[]> r4 = float[].class
                java.lang.String r5 = "[F"
                r0.put(r4, r5)
                java.lang.Class<float[][]> r4 = float[][].class
                java.lang.String r5 = "[[F"
                r0.put(r4, r5)
                java.lang.Class<double[]> r4 = double[].class
                java.lang.String r5 = "[D"
                r0.put(r4, r5)
                java.lang.Class<double[][]> r4 = double[][].class
                java.lang.String r5 = "[[D"
                r0.put(r4, r5)
                java.lang.Class<char[]> r4 = char[].class
                java.lang.String r5 = "[C"
                r0.put(r4, r5)
                java.lang.Class<char[][]> r4 = char[][].class
                java.lang.String r5 = "[[C"
                r0.put(r4, r5)
                java.lang.Class<boolean[]> r4 = boolean[].class
                java.lang.String r5 = "[Z"
                r0.put(r4, r5)
                java.lang.Class<boolean[][]> r4 = boolean[][].class
                java.lang.String r5 = "[[Z"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Byte[]> r4 = java.lang.Byte[].class
                java.lang.String r5 = "[Byte"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Byte[][]> r4 = java.lang.Byte[][].class
                java.lang.String r5 = "[[Byte"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Short[]> r4 = java.lang.Short[].class
                java.lang.String r5 = "[Short"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Short[][]> r4 = java.lang.Short[][].class
                java.lang.String r5 = "[[Short"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Integer[]> r4 = java.lang.Integer[].class
                java.lang.String r5 = "[Integer"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Integer[][]> r4 = java.lang.Integer[][].class
                java.lang.String r5 = "[[Integer"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Long[]> r4 = java.lang.Long[].class
                java.lang.String r5 = "[Long"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Long[][]> r4 = java.lang.Long[][].class
                java.lang.String r5 = "[[Long"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Float[]> r4 = java.lang.Float[].class
                java.lang.String r5 = "[Float"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Float[][]> r4 = java.lang.Float[][].class
                java.lang.String r5 = "[[Float"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Double[]> r4 = java.lang.Double[].class
                java.lang.String r5 = "[Double"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Double[][]> r4 = java.lang.Double[][].class
                java.lang.String r5 = "[[Double"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Character[]> r4 = java.lang.Character[].class
                java.lang.String r5 = "[Character"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Character[][]> r4 = java.lang.Character[][].class
                java.lang.String r5 = "[[Character"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Boolean[]> r4 = java.lang.Boolean[].class
                java.lang.String r5 = "[Boolean"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Boolean[][]> r4 = java.lang.Boolean[][].class
                java.lang.String r5 = "[[Boolean"
                r0.put(r4, r5)
                java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
                java.lang.String r5 = "[String"
                r0.put(r4, r5)
                java.lang.Class<java.lang.String[][]> r4 = java.lang.String[][].class
                java.lang.String r5 = "[[String"
                r0.put(r4, r5)
                java.lang.Class<java.math.BigDecimal[]> r4 = java.math.BigDecimal[].class
                java.lang.String r5 = "[BigDecimal"
                r0.put(r4, r5)
                java.lang.Class<java.math.BigDecimal[][]> r4 = java.math.BigDecimal[][].class
                java.lang.String r5 = "[[BigDecimal"
                r0.put(r4, r5)
                java.lang.Class<java.math.BigInteger[]> r4 = java.math.BigInteger[].class
                java.lang.String r5 = "[BigInteger"
                r0.put(r4, r5)
                java.lang.Class<java.math.BigInteger[][]> r4 = java.math.BigInteger[][].class
                java.lang.String r5 = "[[BigInteger"
                r0.put(r4, r5)
                java.lang.Class<java.util.UUID[]> r4 = java.util.UUID[].class
                java.lang.String r5 = "[UUID"
                r0.put(r4, r5)
                java.lang.Class<java.util.UUID[][]> r4 = java.util.UUID[][].class
                java.lang.String r5 = "[[UUID"
                r0.put(r4, r5)
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                java.lang.String r5 = "Object"
                r0.put(r4, r5)
                java.lang.String r4 = "M"
                java.lang.Class<java.util.HashMap> r5 = java.util.HashMap.class
                r0.put(r5, r4)
                java.lang.String r4 = "HashMap"
                r1.put(r4, r5)
                java.lang.String r4 = "java.util.HashMap"
                r1.put(r4, r5)
                java.lang.String r4 = "LM"
                java.lang.Class<java.util.LinkedHashMap> r6 = java.util.LinkedHashMap.class
                r0.put(r6, r4)
                java.lang.String r4 = "LinkedHashMap"
                r1.put(r4, r6)
                java.lang.String r4 = "java.util.LinkedHashMap"
                r1.put(r4, r6)
                java.lang.String r4 = "TM"
                java.lang.Class<java.util.TreeMap> r7 = java.util.TreeMap.class
                r0.put(r7, r4)
                java.lang.String r4 = "TreeMap"
                r1.put(r4, r7)
                java.lang.String r4 = "A"
                java.lang.Class<java.util.ArrayList> r7 = java.util.ArrayList.class
                r0.put(r7, r4)
                java.lang.String r4 = "ArrayList"
                r1.put(r4, r7)
                java.lang.String r4 = "java.util.ArrayList"
                r1.put(r4, r7)
                java.lang.Class<java.util.LinkedList> r4 = java.util.LinkedList.class
                java.lang.String r8 = "LA"
                r0.put(r4, r8)
                r1.put(r8, r4)
                java.lang.String r8 = "LinkedList"
                r1.put(r8, r4)
                java.lang.String r8 = "java.util.LinkedList"
                r1.put(r8, r4)
                java.lang.String r4 = "java.util.concurrent.ConcurrentLinkedQueue"
                java.lang.Class<java.util.concurrent.ConcurrentLinkedQueue> r8 = java.util.concurrent.ConcurrentLinkedQueue.class
                r1.put(r4, r8)
                java.lang.String r1 = "HashSet"
                java.lang.Class<java.util.HashSet> r4 = java.util.HashSet.class
                r0.put(r4, r1)
                java.lang.Class<java.util.TreeSet> r1 = java.util.TreeSet.class
                java.lang.String r9 = "TreeSet"
                r0.put(r1, r9)
                java.lang.String r1 = "LinkedHashSet"
                java.lang.Class<java.util.LinkedHashSet> r9 = java.util.LinkedHashSet.class
                r0.put(r9, r1)
                java.lang.Class<java.util.concurrent.ConcurrentHashMap> r1 = java.util.concurrent.ConcurrentHashMap.class
                java.lang.String r10 = "ConcurrentHashMap"
                r0.put(r1, r10)
                java.lang.String r1 = "ConcurrentLinkedQueue"
                r0.put(r8, r1)
                java.lang.Class<com.alibaba.fastjson2.JSONObject> r1 = com.alibaba.fastjson2.JSONObject.class
                java.lang.String r8 = "JSONObject"
                r0.put(r1, r8)
                java.lang.Class<com.alibaba.fastjson2.JSONArray> r1 = com.alibaba.fastjson2.JSONArray.class
                java.lang.String r8 = "JSONArray"
                r0.put(r1, r8)
                java.lang.Class<java.util.Currency> r1 = java.util.Currency.class
                java.lang.String r8 = "Currency"
                r0.put(r1, r8)
                java.lang.Class<java.util.concurrent.TimeUnit> r1 = java.util.concurrent.TimeUnit.class
                java.lang.String r8 = "TimeUnit"
                r0.put(r1, r8)
                java.util.Map r0 = java.util.Collections.EMPTY_MAP
                java.lang.Class r54 = r0.getClass()
                java.lang.Class<java.util.concurrent.ConcurrentSkipListMap> r76 = java.util.concurrent.ConcurrentSkipListMap.class
                java.lang.Class<java.util.concurrent.ConcurrentSkipListSet> r77 = java.util.concurrent.ConcurrentSkipListSet.class
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                java.lang.Class<java.lang.Cloneable> r11 = java.lang.Cloneable.class
                java.lang.Class<java.lang.AutoCloseable> r12 = java.lang.AutoCloseable.class
                java.lang.Class<java.lang.Exception> r13 = java.lang.Exception.class
                java.lang.Class<java.lang.RuntimeException> r14 = java.lang.RuntimeException.class
                java.lang.Class<java.lang.IllegalAccessError> r15 = java.lang.IllegalAccessError.class
                java.lang.Class<java.lang.IllegalAccessException> r16 = java.lang.IllegalAccessException.class
                java.lang.Class<java.lang.IllegalArgumentException> r17 = java.lang.IllegalArgumentException.class
                java.lang.Class<java.lang.IllegalMonitorStateException> r18 = java.lang.IllegalMonitorStateException.class
                java.lang.Class<java.lang.IllegalStateException> r19 = java.lang.IllegalStateException.class
                java.lang.Class<java.lang.IllegalThreadStateException> r20 = java.lang.IllegalThreadStateException.class
                java.lang.Class<java.lang.IndexOutOfBoundsException> r21 = java.lang.IndexOutOfBoundsException.class
                java.lang.Class<java.lang.InstantiationError> r22 = java.lang.InstantiationError.class
                java.lang.Class<java.lang.InstantiationException> r23 = java.lang.InstantiationException.class
                java.lang.Class<java.lang.InternalError> r24 = java.lang.InternalError.class
                java.lang.Class<java.lang.InterruptedException> r25 = java.lang.InterruptedException.class
                java.lang.Class<java.lang.LinkageError> r26 = java.lang.LinkageError.class
                java.lang.Class<java.lang.NegativeArraySizeException> r27 = java.lang.NegativeArraySizeException.class
                java.lang.Class<java.lang.NoClassDefFoundError> r28 = java.lang.NoClassDefFoundError.class
                java.lang.Class<java.lang.NoSuchFieldError> r29 = java.lang.NoSuchFieldError.class
                java.lang.Class<java.lang.NoSuchFieldException> r30 = java.lang.NoSuchFieldException.class
                java.lang.Class<java.lang.NoSuchMethodError> r31 = java.lang.NoSuchMethodError.class
                java.lang.Class<java.lang.NoSuchMethodException> r32 = java.lang.NoSuchMethodException.class
                java.lang.Class<java.lang.NullPointerException> r33 = java.lang.NullPointerException.class
                java.lang.Class<java.lang.NumberFormatException> r34 = java.lang.NumberFormatException.class
                java.lang.Class<java.lang.OutOfMemoryError> r35 = java.lang.OutOfMemoryError.class
                java.lang.Class<java.lang.SecurityException> r36 = java.lang.SecurityException.class
                java.lang.Class<java.lang.StackOverflowError> r37 = java.lang.StackOverflowError.class
                java.lang.Class<java.lang.StringIndexOutOfBoundsException> r38 = java.lang.StringIndexOutOfBoundsException.class
                java.lang.Class<java.lang.TypeNotPresentException> r39 = java.lang.TypeNotPresentException.class
                java.lang.Class<java.lang.VerifyError> r40 = java.lang.VerifyError.class
                java.lang.Class<java.lang.StackTraceElement> r41 = java.lang.StackTraceElement.class
                java.lang.Class<java.util.Hashtable> r42 = java.util.Hashtable.class
                java.lang.Class<java.util.TreeMap> r43 = java.util.TreeMap.class
                java.lang.Class<java.util.IdentityHashMap> r44 = java.util.IdentityHashMap.class
                java.lang.Class<java.util.WeakHashMap> r45 = java.util.WeakHashMap.class
                java.lang.Class<java.util.HashSet> r46 = java.util.HashSet.class
                java.lang.Class<java.util.LinkedHashSet> r47 = java.util.LinkedHashSet.class
                java.lang.Class<java.util.TreeSet> r48 = java.util.TreeSet.class
                java.lang.Class<java.util.LinkedList> r49 = java.util.LinkedList.class
                java.lang.Class<java.util.concurrent.TimeUnit> r50 = java.util.concurrent.TimeUnit.class
                java.lang.Class<java.util.concurrent.ConcurrentHashMap> r51 = java.util.concurrent.ConcurrentHashMap.class
                java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r52 = java.util.concurrent.atomic.AtomicInteger.class
                java.lang.Class<java.util.concurrent.atomic.AtomicLong> r53 = java.util.concurrent.atomic.AtomicLong.class
                java.lang.Class<java.lang.Boolean> r55 = java.lang.Boolean.class
                java.lang.Class<java.lang.Character> r56 = java.lang.Character.class
                java.lang.Class<java.lang.Byte> r57 = java.lang.Byte.class
                java.lang.Class<java.lang.Short> r58 = java.lang.Short.class
                java.lang.Class<java.lang.Integer> r59 = java.lang.Integer.class
                java.lang.Class<java.lang.Long> r60 = java.lang.Long.class
                java.lang.Class<java.lang.Float> r61 = java.lang.Float.class
                java.lang.Class<java.lang.Double> r62 = java.lang.Double.class
                java.lang.Class<java.lang.Number> r63 = java.lang.Number.class
                java.lang.Class<java.lang.String> r64 = java.lang.String.class
                java.lang.Class<java.math.BigDecimal> r65 = java.math.BigDecimal.class
                java.lang.Class<java.math.BigInteger> r66 = java.math.BigInteger.class
                java.lang.Class<java.util.BitSet> r67 = java.util.BitSet.class
                java.lang.Class<java.util.Calendar> r68 = java.util.Calendar.class
                java.lang.Class<java.util.Date> r69 = java.util.Date.class
                java.lang.Class<java.util.Locale> r70 = java.util.Locale.class
                java.lang.Class<java.util.UUID> r71 = java.util.UUID.class
                java.lang.Class<java.util.Currency> r72 = java.util.Currency.class
                java.lang.Class<java.text.SimpleDateFormat> r73 = java.text.SimpleDateFormat.class
                java.lang.Class<com.alibaba.fastjson2.JSONObject> r74 = com.alibaba.fastjson2.JSONObject.class
                java.lang.Class<com.alibaba.fastjson2.JSONArray> r75 = com.alibaba.fastjson2.JSONArray.class
                java.lang.Class[] r0 = new java.lang.Class[]{r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77}
                r1 = 0
            L29f:
                r8 = 68
                if (r1 >= r8) goto L2bd
                r8 = r0[r1]
                java.lang.String r10 = r8.getSimpleName()
                java.util.Map<java.lang.String, java.lang.Class> r11 = com.alibaba.fastjson2.util.TypeUtils.Mapping.TYPE_MAPPINGS
                r11.put(r10, r8)
                java.lang.String r12 = r8.getName()
                r11.put(r12, r8)
                java.util.Map<java.lang.Class, java.lang.String> r11 = com.alibaba.fastjson2.util.TypeUtils.Mapping.NAME_MAPPINGS
                r11.put(r8, r10)
                int r1 = r1 + 1
                goto L29f
            L2bd:
                java.util.Map<java.lang.String, java.lang.Class> r0 = com.alibaba.fastjson2.util.TypeUtils.Mapping.TYPE_MAPPINGS
                java.lang.String r1 = "JO10"
                java.lang.Class<com.alibaba.fastjson2.util.JSONObject1O> r8 = com.alibaba.fastjson2.util.JSONObject1O.class
                r0.put(r1, r8)
                r0.put(r3, r2)
                java.lang.String r1 = "[Ljava.lang.Object;"
                r0.put(r1, r2)
                java.lang.String r1 = "[java.lang.Object"
                r0.put(r1, r2)
                java.lang.String r1 = "[Object"
                r0.put(r1, r2)
                java.lang.String r1 = "StackTraceElement"
                java.lang.Class<java.lang.StackTraceElement> r2 = java.lang.StackTraceElement.class
                r0.put(r1, r2)
                java.lang.String r1 = "[StackTraceElement"
                java.lang.Class<java.lang.StackTraceElement[]> r2 = java.lang.StackTraceElement[].class
                r0.put(r1, r2)
                java.util.Map r1 = java.util.Collections.EMPTY_MAP
                java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
                java.lang.Class r1 = r1.getClass()
                java.lang.String r2 = "java.util.Collections$UnmodifiableMap"
                r0.put(r2, r1)
                java.util.List r1 = java.util.Collections.EMPTY_LIST
                java.util.Collection r1 = java.util.Collections.unmodifiableCollection(r1)
                java.lang.Class r1 = r1.getClass()
                java.lang.String r2 = "java.util.Collections$UnmodifiableCollection"
                r0.put(r2, r1)
                java.lang.Class r1 = com.alibaba.fastjson2.JSONFactory.getClassJSONObject1x()
                if (r1 == 0) goto L316
                java.lang.String r2 = "JO1"
                r0.put(r2, r1)
                java.lang.String r2 = r1.getName()
                r0.put(r2, r1)
            L316:
                java.lang.Class r1 = com.alibaba.fastjson2.JSONFactory.getClassJSONArray1x()
                if (r1 == 0) goto L328
                java.lang.String r2 = "JA1"
                r0.put(r2, r1)
                java.lang.String r2 = r1.getName()
                r0.put(r2, r1)
            L328:
                java.util.Map<java.lang.Class, java.lang.String> r1 = com.alibaba.fastjson2.util.TypeUtils.Mapping.NAME_MAPPINGS
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.util.Set r2 = r2.keySet()
                java.lang.Class r2 = r2.getClass()
                java.lang.String r3 = "Set"
                r1.put(r2, r3)
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Set r2 = r2.keySet()
                java.lang.Class r2 = r2.getClass()
                r1.put(r2, r3)
                java.util.TreeMap r2 = new java.util.TreeMap
                r2.<init>()
                java.util.Set r2 = r2.keySet()
                java.lang.Class r2 = r2.getClass()
                r1.put(r2, r3)
                java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
                r2.<init>()
                java.util.Set r2 = r2.keySet()
                java.lang.Class r2 = r2.getClass()
                r1.put(r2, r3)
                java.util.concurrent.ConcurrentSkipListMap r2 = new java.util.concurrent.ConcurrentSkipListMap
                r2.<init>()
                java.util.Set r2 = r2.keySet()
                java.lang.Class r2 = r2.getClass()
                r1.put(r2, r3)
                r0.put(r3, r4)
                java.util.HashMap r2 = new java.util.HashMap
                r2.<init>()
                java.util.Collection r2 = r2.values()
                java.lang.Class r2 = r2.getClass()
                java.lang.String r3 = "List"
                r1.put(r2, r3)
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Collection r2 = r2.values()
                java.lang.Class r2 = r2.getClass()
                r1.put(r2, r3)
                java.util.TreeMap r2 = new java.util.TreeMap
                r2.<init>()
                java.util.Collection r2 = r2.values()
                java.lang.Class r2 = r2.getClass()
                r1.put(r2, r3)
                java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
                r2.<init>()
                java.util.Collection r2 = r2.values()
                java.lang.Class r2 = r2.getClass()
                r1.put(r2, r3)
                java.util.concurrent.ConcurrentSkipListMap r2 = new java.util.concurrent.ConcurrentSkipListMap
                r2.<init>()
                java.util.Collection r2 = r2.values()
                java.lang.Class r2 = r2.getClass()
                r1.put(r2, r3)
                r0.put(r3, r7)
                java.lang.String r2 = "java.util.ImmutableCollections$Map1"
                r0.put(r2, r5)
                java.lang.String r2 = "java.util.ImmutableCollections$MapN"
                r0.put(r2, r6)
                java.lang.String r2 = "java.util.ImmutableCollections$Set12"
                r0.put(r2, r9)
                java.lang.String r2 = "java.util.ImmutableCollections$SetN"
                r0.put(r2, r9)
                java.lang.String r2 = "java.util.ImmutableCollections$List12"
                r0.put(r2, r7)
                java.lang.String r2 = "java.util.ImmutableCollections$ListN"
                r0.put(r2, r7)
                java.lang.String r2 = "java.util.ImmutableCollections$SubList"
                r0.put(r2, r7)
                java.util.Set r0 = r1.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L3ff:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L425
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()
                java.lang.String r2 = (java.lang.String) r2
                java.util.Map<java.lang.String, java.lang.Class> r3 = com.alibaba.fastjson2.util.TypeUtils.Mapping.TYPE_MAPPINGS
                java.lang.Object r4 = r3.get(r2)
                java.lang.Class r4 = (java.lang.Class) r4
                if (r4 != 0) goto L3ff
                java.lang.Object r1 = r1.getKey()
                java.lang.Class r1 = (java.lang.Class) r1
                r3.put(r2, r1)
                goto L3ff
            L425:
                return
        }

        public Mapping() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Set r2 = java.util.Collections.singleton(r1)
            java.lang.Class r2 = r2.getClass()
            com.alibaba.fastjson2.util.TypeUtils.CLASS_SINGLE_SET = r2
            java.util.List r1 = java.util.Collections.singletonList(r1)
            java.lang.Class r1 = r1.getClass()
            com.alibaba.fastjson2.util.TypeUtils.CLASS_SINGLE_LIST = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.Class r1 = r1.getClass()
            com.alibaba.fastjson2.util.TypeUtils.CLASS_UNMODIFIABLE_LIST = r1
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r1 = new com.alibaba.fastjson2.util.ParameterizedTypeImpl
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r0]
            r3 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r3] = r4
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r1.<init>(r4, r2)
            com.alibaba.fastjson2.util.TypeUtils.PARAM_TYPE_LIST_STR = r1
            r1 = 23
            double[] r1 = new double[r1]
            r1 = {x008c: FILL_ARRAY_DATA , data: [4607182418800017408, 4621819117588971520, 4636737291354636288, 4652007308841189376, 4666723172467343360, 4681608360884174848, 4696837146684686336, 4711630319722168320, 4726483295884279808, 4741671816366391296, 4756540486875873280, 4771362005757984768, 4786511204640096256, 4801453603149578240, 4816244402031689728, 4831355200913801216, 4846369599423283200, 4861130398305394688, 4876203697187506176, 4891288408196988160, 4906019910204099648, 4921056587992461136, 4936209963552724370} // fill-array
            com.alibaba.fastjson2.util.TypeUtils.SMALL_10_POW = r1
            r1 = 11
            float[] r1 = new float[r1]
            r1 = {x00ec: FILL_ARRAY_DATA , data: [1065353216, 1092616192, 1120403456, 1148846080, 1176256512, 1203982336, 1232348160, 1259902592, 1287568416, 1315859240, 1343554297} // fill-array
            com.alibaba.fastjson2.util.TypeUtils.SINGLE_SMALL_10_POW = r1
            r1 = 5
            double[] r2 = new double[r1]
            r2 = {x0106: FILL_ARRAY_DATA , data: [4846369599423283200, 5085611494797045271, 5564284217833028085, 6521906365687930162, 8436737289693151036} // fill-array
            com.alibaba.fastjson2.util.TypeUtils.BIG_10_POW = r2
            double[] r1 = new double[r1]
            r1 = {x011e: FILL_ARRAY_DATA , data: [4367597403136100796, 4128101167230658355, 3649340653511681853, 2691949749288605597, 776877706278891331} // fill-array
            com.alibaba.fastjson2.util.TypeUtils.TINY_10_POW = r1
            com.alibaba.fastjson2.util.TypeUtils$Cache r1 = new com.alibaba.fastjson2.util.TypeUtils$Cache
            r1.<init>()
            com.alibaba.fastjson2.util.TypeUtils.CACHE = r1
            java.lang.Class<char[]> r1 = char[].class
            java.lang.String r2 = "chars"
            java.lang.Class<com.alibaba.fastjson2.util.TypeUtils$Cache> r4 = com.alibaba.fastjson2.util.TypeUtils.Cache.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r4, r1, r2)
            com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER = r1
            r1 = 19
            java.math.BigInteger[] r2 = new java.math.BigInteger[r1]
            java.math.BigInteger r4 = java.math.BigInteger.ONE
            r2[r3] = r4
            java.math.BigInteger r3 = java.math.BigInteger.TEN
            r2[r0] = r3
            r3 = 10
            r0 = 2
            r5 = r3
        L7c:
            if (r0 >= r1) goto L88
            long r5 = r5 * r3
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r5)
            r2[r0] = r7
            int r0 = r0 + 1
            goto L7c
        L88:
            com.alibaba.fastjson2.util.TypeUtils.BIG_TEN_POWERS_TABLE_0 = r2
            return
    }

    public TypeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T cast(java.lang.Object r1, java.lang.Class<T> r2) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Object r1 = cast(r1, r2, r0)
            return r1
    }

    public static <T> T cast(java.lang.Object r8, java.lang.Class<T> r9, com.alibaba.fastjson2.reader.ObjectReaderProvider r10) {
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            boolean r1 = r9.isInstance(r8)
            if (r1 == 0) goto Lb
            return r8
        Lb:
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r9 != r1) goto L14
            java.util.Date r8 = toDate(r8)
            return r8
        L14:
            java.lang.Class<java.time.Instant> r1 = java.time.Instant.class
            if (r9 != r1) goto L1d
            java.time.Instant r8 = toInstant(r8)
            return r8
        L1d:
            java.lang.Class<java.time.LocalDate> r1 = java.time.LocalDate.class
            if (r9 != r1) goto L36
            boolean r1 = r8 instanceof java.util.Date
            if (r1 == 0) goto L36
            java.util.Date r8 = (java.util.Date) r8
            java.time.Instant r8 = r8.toInstant()
            java.time.ZoneId r9 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r8 = r8.atZone(r9)
            java.time.LocalDate r8 = r8.toLocalDate()
            return r8
        L36:
            java.lang.Class<java.time.LocalDateTime> r1 = java.time.LocalDateTime.class
            if (r9 != r1) goto L4f
            boolean r1 = r8 instanceof java.util.Date
            if (r1 == 0) goto L4f
            java.util.Date r8 = (java.util.Date) r8
            java.time.Instant r8 = r8.toInstant()
            java.time.ZoneId r9 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r8 = r8.atZone(r9)
            java.time.LocalDateTime r8 = r8.toLocalDateTime()
            return r8
        L4f:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r9 != r1) goto L61
            boolean r9 = r8 instanceof java.lang.Character
            if (r9 == 0) goto L5c
            java.lang.String r8 = r8.toString()
            return r8
        L5c:
            java.lang.String r8 = com.alibaba.fastjson2.JSON.toJSONString(r8)
            return r8
        L61:
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r1 = java.util.concurrent.atomic.AtomicInteger.class
            if (r9 != r1) goto L6f
            java.util.concurrent.atomic.AtomicInteger r9 = new java.util.concurrent.atomic.AtomicInteger
            int r8 = toIntValue(r8)
            r9.<init>(r8)
            return r9
        L6f:
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r1 = java.util.concurrent.atomic.AtomicLong.class
            if (r9 != r1) goto L7d
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong
            long r0 = toLongValue(r8)
            r9.<init>(r0)
            return r9
        L7d:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r1 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r9 != r1) goto L8d
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r9.<init>(r8)
            return r9
        L8d:
            boolean r1 = r8 instanceof java.util.Map
            if (r1 == 0) goto L9e
            com.alibaba.fastjson2.reader.ObjectReader r9 = r10.getObjectReader(r9)
            java.util.Map r8 = (java.util.Map) r8
            r0 = 0
            java.lang.Object r8 = r9.createInstance(r8, r0)
            return r8
        L9e:
            java.lang.Class r1 = r8.getClass()
            java.util.function.Function r1 = r10.getTypeConvert(r1, r9)
            if (r1 == 0) goto Lad
            java.lang.Object r8 = r1.apply(r8)
            return r8
        Lad:
            boolean r1 = r9.isEnum()
            if (r1 == 0) goto Ld0
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.getObjectReader(r9)
            boolean r1 = r2 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplEnum
            if (r1 == 0) goto Ld2
            boolean r1 = r8 instanceof java.lang.Integer
            if (r1 == 0) goto Ld0
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum r2 = (com.alibaba.fastjson2.reader.ObjectReaderImplEnum) r2
            java.lang.Enum r8 = r2.of(r8)
            return r8
        Ld0:
            r2 = r9
            goto Le3
        Ld2:
            java.lang.String r8 = com.alibaba.fastjson2.JSON.toJSONString(r8)
            com.alibaba.fastjson2.JSONReader r3 = com.alibaba.fastjson2.JSONReader.of(r8)
            r5 = 0
            r6 = 0
            r4 = r9
            java.lang.Object r8 = r2.readObject(r3, r4, r5, r6)
            return r8
        Le3:
            boolean r9 = r8 instanceof java.lang.String
            if (r9 == 0) goto L12e
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L12d
            java.lang.String r9 = "null"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto Lf8
            goto L12d
        Lf8:
            java.lang.String r9 = r8.trim()
            r10 = 0
            char r9 = r9.charAt(r10)
            r10 = 34
            if (r9 == r10) goto L118
            r10 = 123(0x7b, float:1.72E-43)
            if (r9 == r10) goto L118
            r10 = 91
            if (r9 != r10) goto L10e
            goto L118
        L10e:
            java.lang.String r8 = com.alibaba.fastjson2.JSON.toJSONString(r8)
            com.alibaba.fastjson2.JSONReader r8 = com.alibaba.fastjson2.JSONReader.of(r8)
        L116:
            r1 = r8
            goto L11d
        L118:
            com.alibaba.fastjson2.JSONReader r8 = com.alibaba.fastjson2.JSONReader.of(r8)
            goto L116
        L11d:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r8 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.reader.ObjectReader r0 = r8.getObjectReader(r2)
            r3 = 0
            r4 = 0
            java.lang.Object r8 = r0.readObject(r1, r2, r3, r4)
            return r8
        L12d:
            return r0
        L12e:
            boolean r9 = r2.isEnum()
            if (r9 == 0) goto L150
            boolean r9 = r8 instanceof java.lang.Integer
            if (r9 == 0) goto L150
            r9 = r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r1 = r1.getObjectReader(r2)
            boolean r3 = r1 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplEnum
            if (r3 == 0) goto L150
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum r1 = (com.alibaba.fastjson2.reader.ObjectReaderImplEnum) r1
            java.lang.Enum r8 = r1.of(r9)
            return r8
        L150:
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L15f
            com.alibaba.fastjson2.reader.ObjectReader r9 = r10.getObjectReader(r2)
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r8 = r9.createInstance(r8)
            return r8
        L15f:
            java.lang.String r9 = r2.getName()
            boolean r10 = r8 instanceof java.lang.Integer
            if (r10 != 0) goto L16b
            boolean r10 = r8 instanceof java.lang.Long
            if (r10 == 0) goto L192
        L16b:
            r10 = r8
            java.lang.Number r10 = (java.lang.Number) r10
            long r3 = r10.longValue()
            java.lang.String r10 = "java.time.LocalDateTime"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L1d5
            java.lang.String r10 = "java.sql.Date"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L1cf
            java.lang.String r10 = "java.sql.Time"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L1c9
            java.lang.String r10 = "java.sql.Timestamp"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L1c3
        L192:
            com.alibaba.fastjson2.writer.ObjectWriterProvider r10 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            java.lang.Class r1 = r8.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r10 = r10.getObjectWriter(r1)
            boolean r1 = r10 instanceof com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl
            if (r1 == 0) goto L1b3
            com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl r10 = (com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl) r10
            java.util.function.Function r10 = r10.getFunction()
            if (r10 == 0) goto L1b3
            java.lang.Object r10 = r10.apply(r8)
            boolean r1 = r2.isInstance(r10)
            if (r1 == 0) goto L1b3
            return r10
        L1b3:
            java.lang.String r10 = "can not cast to "
            java.lang.String r1 = ", from "
            java.lang.StringBuilder r9 = bc.e.o(r10, r9, r1)
            java.lang.Class r8 = r8.getClass()
            ah.a.r(r9, r8)
            return r0
        L1c3:
            java.sql.Timestamp r8 = new java.sql.Timestamp
            r8.<init>(r3)
            return r8
        L1c9:
            java.sql.Time r8 = new java.sql.Time
            r8.<init>(r3)
            return r8
        L1cf:
            java.sql.Date r8 = new java.sql.Date
            r8.<init>(r3)
            return r8
        L1d5:
            java.time.Instant r8 = java.time.Instant.ofEpochMilli(r3)
            java.time.ZoneId r9 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.LocalDateTime r8 = java.time.LocalDateTime.ofInstant(r8, r9)
            return r8
    }

    public static <T> T cast(java.lang.Object r1, java.lang.reflect.Type r2) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Object r1 = cast(r1, r2, r0)
            return r1
    }

    public static <T> T cast(java.lang.Object r2, java.lang.reflect.Type r3, com.alibaba.fastjson2.reader.ObjectReaderProvider r4) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.Object r2 = cast(r2, r3, r4)
            return r2
        Lb:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L1a
            com.alibaba.fastjson2.reader.ObjectReader r3 = r4.getObjectReader(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r2 = r3.createInstance(r2)
            return r2
        L1a:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L2b
            com.alibaba.fastjson2.reader.ObjectReader r3 = r4.getObjectReader(r3)
            java.util.Map r2 = (java.util.Map) r2
            r0 = 0
            java.lang.Object r2 = r3.createInstance(r2, r0)
            return r2
        L2b:
            java.lang.String r2 = com.alibaba.fastjson2.JSON.toJSONString(r2)
            java.lang.Object r2 = com.alibaba.fastjson2.JSON.parseObject(r2, r3)
            return r2
    }

    public static java.lang.Object[] cast(java.lang.Object r6, java.lang.reflect.Type[] r7) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            int r0 = r7.length
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r2 = r6 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L28
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r6.next()
            int r2 = r3 + 1
            r4 = r7[r3]
            java.lang.Object r0 = cast(r0, r4)
            r1[r3] = r0
            r3 = r2
            goto L12
        L28:
            java.lang.Class r2 = r6.getClass()
            boolean r4 = r2.isArray()
            if (r4 == 0) goto L4a
            int r2 = java.lang.reflect.Array.getLength(r6)
        L36:
            if (r3 >= r0) goto L49
            if (r3 >= r2) goto L49
            java.lang.Object r4 = java.lang.reflect.Array.get(r6, r3)
            r5 = r7[r3]
            java.lang.Object r4 = cast(r4, r5)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L36
        L49:
            return r1
        L4a:
            java.lang.String r6 = com.alibaba.fastjson2.JSON.toJSONString(r7)
            java.lang.String r7 = " from "
            java.lang.String r0 = "can not cast to types "
            ah.a.m(r0, r6, r7, r2)
            r6 = 0
            return r6
    }

    public static int compare(java.lang.Object r9, java.lang.Object r10) {
            java.lang.Class r0 = r9.getClass()
            java.lang.Class r1 = r10.getClass()
            if (r0 != r1) goto L11
            java.lang.Comparable r9 = (java.lang.Comparable) r9
            int r9 = r9.compareTo(r10)
            return r9
        L11:
            java.lang.Class r0 = r9.getClass()
            java.lang.Class r1 = r10.getClass()
            java.lang.Class<java.math.BigInteger> r2 = java.math.BigInteger.class
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            java.lang.Class<java.lang.Float> r4 = java.lang.Float.class
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            java.lang.Class<java.math.BigDecimal> r7 = java.math.BigDecimal.class
            if (r0 != r7) goto L6c
            if (r1 != r6) goto L37
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0.<init>(r10)
        L34:
            r10 = r0
            goto L2d7
        L37:
            if (r1 != r5) goto L45
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            r0.<init>(r1)
            goto L34
        L45:
            if (r1 != r4) goto L54
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            double r0 = (double) r10
            java.math.BigDecimal r10 = java.math.BigDecimal.valueOf(r0)
            goto L2d7
        L54:
            if (r1 != r3) goto L62
            java.lang.Double r10 = (java.lang.Double) r10
            double r0 = r10.doubleValue()
            java.math.BigDecimal r10 = java.math.BigDecimal.valueOf(r0)
            goto L2d7
        L62:
            if (r1 != r2) goto L2d7
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            r0.<init>(r10)
            goto L34
        L6c:
            if (r0 != r2) goto Lc0
            if (r1 != r6) goto L7d
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            long r0 = (long) r10
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r0)
            goto L2d7
        L7d:
            if (r1 != r5) goto L8b
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            java.math.BigInteger r10 = java.math.BigInteger.valueOf(r0)
            goto L2d7
        L8b:
            if (r1 != r4) goto La2
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            double r0 = (double) r10
            java.math.BigDecimal r10 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            r0.<init>(r9)
        L9f:
            r9 = r0
            goto L2d7
        La2:
            if (r1 != r3) goto Lb6
            java.lang.Double r10 = (java.lang.Double) r10
            double r0 = r10.doubleValue()
            java.math.BigDecimal r10 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            r0.<init>(r9)
            goto L9f
        Lb6:
            if (r1 != r7) goto L2d7
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            r0.<init>(r9)
            goto L9f
        Lc0:
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r0 != r5) goto L123
            if (r1 != r6) goto Ld4
            java.lang.Long r0 = new java.lang.Long
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            long r1 = (long) r10
            r0.<init>(r1)
            goto L34
        Ld4:
            if (r1 != r7) goto Le2
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.Long r9 = (java.lang.Long) r9
            long r1 = r9.longValue()
            r0.<init>(r1)
            goto L9f
        Le2:
            if (r1 != r4) goto Lf1
            java.lang.Float r0 = new java.lang.Float
            java.lang.Long r9 = (java.lang.Long) r9
            long r1 = r9.longValue()
            float r9 = (float) r1
            r0.<init>(r9)
            goto L9f
        Lf1:
            if (r1 != r3) goto L100
            java.lang.Double r0 = new java.lang.Double
            java.lang.Long r9 = (java.lang.Long) r9
            long r1 = r9.longValue()
            double r1 = (double) r1
            r0.<init>(r1)
            goto L9f
        L100:
            if (r1 != r2) goto L10e
            java.lang.Long r9 = (java.lang.Long) r9
            long r0 = r9.longValue()
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r0)
            goto L2d7
        L10e:
            if (r1 != r8) goto L2d7
            java.lang.Long r9 = (java.lang.Long) r9
            long r0 = r9.longValue()
            java.math.BigDecimal r9 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r10 = (java.lang.String) r10
            r0.<init>(r10)
            goto L34
        L123:
            if (r0 != r6) goto L189
            if (r1 != r5) goto L135
            java.lang.Long r0 = new java.lang.Long
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            long r1 = (long) r9
            r0.<init>(r1)
            goto L9f
        L135:
            if (r1 != r7) goto L144
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r0.<init>(r9)
            goto L9f
        L144:
            if (r1 != r2) goto L153
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            long r0 = (long) r9
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r0)
            goto L2d7
        L153:
            if (r1 != r4) goto L163
            java.lang.Float r0 = new java.lang.Float
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            r0.<init>(r9)
            goto L9f
        L163:
            if (r1 != r3) goto L173
            java.lang.Double r0 = new java.lang.Double
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            double r1 = (double) r9
            r0.<init>(r1)
            goto L9f
        L173:
            if (r1 != r8) goto L2d7
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            long r0 = (long) r9
            java.math.BigDecimal r9 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r10 = (java.lang.String) r10
            r0.<init>(r10)
            goto L34
        L189:
            if (r0 != r3) goto L1f3
            if (r1 != r6) goto L19b
            java.lang.Double r0 = new java.lang.Double
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            double r1 = (double) r10
            r0.<init>(r1)
            goto L34
        L19b:
            if (r1 != r5) goto L1ab
            java.lang.Double r0 = new java.lang.Double
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            double r1 = (double) r1
            r0.<init>(r1)
            goto L34
        L1ab:
            if (r1 != r4) goto L1bb
            java.lang.Double r0 = new java.lang.Double
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            double r1 = (double) r10
            r0.<init>(r1)
            goto L34
        L1bb:
            if (r1 != r7) goto L1c9
            java.lang.Double r9 = (java.lang.Double) r9
            double r0 = r9.doubleValue()
            java.math.BigDecimal r9 = java.math.BigDecimal.valueOf(r0)
            goto L2d7
        L1c9:
            if (r1 != r8) goto L1de
            java.lang.Double r9 = (java.lang.Double) r9
            double r0 = r9.doubleValue()
            java.math.BigDecimal r9 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r10 = (java.lang.String) r10
            r0.<init>(r10)
            goto L34
        L1de:
            if (r1 != r2) goto L2d7
            java.lang.Double r9 = (java.lang.Double) r9
            double r0 = r9.doubleValue()
            java.math.BigDecimal r9 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            r0.<init>(r10)
            goto L34
        L1f3:
            if (r0 != r4) goto L260
            if (r1 != r6) goto L205
            java.lang.Float r0 = new java.lang.Float
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            float r10 = (float) r10
            r0.<init>(r10)
            goto L34
        L205:
            if (r1 != r5) goto L215
            java.lang.Float r0 = new java.lang.Float
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            float r10 = (float) r1
            r0.<init>(r10)
            goto L34
        L215:
            if (r1 != r3) goto L225
            java.lang.Double r0 = new java.lang.Double
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            double r1 = (double) r9
            r0.<init>(r1)
            goto L9f
        L225:
            if (r1 != r7) goto L234
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            double r0 = (double) r9
            java.math.BigDecimal r9 = java.math.BigDecimal.valueOf(r0)
            goto L2d7
        L234:
            if (r1 != r8) goto L24a
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            double r0 = (double) r9
            java.math.BigDecimal r9 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r10 = (java.lang.String) r10
            r0.<init>(r10)
            goto L34
        L24a:
            if (r1 != r2) goto L2d7
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            double r0 = (double) r9
            java.math.BigDecimal r9 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            r0.<init>(r10)
            goto L34
        L260:
            if (r0 != r8) goto L2d7
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            if (r1 != r6) goto L2a0
            r1 = 0
            int r2 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L272
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L272
            r2 = r1
            goto L273
        L272:
            r2 = move-exception
        L273:
            if (r2 == 0) goto L28c
            long r2 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L28a
            java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L28a
            r2 = r10
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.NumberFormatException -> L28a
            int r2 = r2.intValue()     // Catch: java.lang.NumberFormatException -> L28a
            long r2 = (long) r2     // Catch: java.lang.NumberFormatException -> L28a
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L28a
            goto L28d
        L28a:
            r1 = move-exception
            goto L28d
        L28c:
            r1 = r2
        L28d:
            if (r1 == 0) goto L2d7
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r0)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            long r0 = (long) r10
            java.math.BigDecimal r10 = java.math.BigDecimal.valueOf(r0)
            goto L2d7
        L2a0:
            if (r1 != r5) goto L2b2
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r0)
            java.lang.Long r10 = (java.lang.Long) r10
            long r0 = r10.longValue()
            java.math.BigDecimal r10 = java.math.BigDecimal.valueOf(r0)
            goto L2d7
        L2b2:
            if (r1 != r4) goto L2bd
            float r9 = java.lang.Float.parseFloat(r0)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            goto L2d7
        L2bd:
            if (r1 != r3) goto L2c8
            double r0 = java.lang.Double.parseDouble(r0)
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            goto L2d7
        L2c8:
            if (r1 != r2) goto L2d0
            java.math.BigInteger r9 = new java.math.BigInteger
            r9.<init>(r0)
            goto L2d7
        L2d0:
            if (r1 != r7) goto L2d7
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r0)
        L2d7:
            java.lang.Comparable r9 = (java.lang.Comparable) r9
            int r9 = r9.compareTo(r10)
            return r9
    }

    public static double doubleValue(int r6, long r7, int r9) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r7)
            int r0 = 64 - r0
            long r0 = (long) r0
            double r2 = (double) r9
            r4 = 4614662735865160561(0x400a934f0979a371, double:3.321928094887362)
            double r2 = r2 * r4
            double r2 = java.lang.Math.ceil(r2)
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = -1076(0xfffffffffffffbcc, double:NaN)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1f
            double r6 = (double) r6
            r8 = 0
            double r6 = r6 * r8
            return r6
        L1f:
            r2 = 1025(0x401, double:5.064E-321)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2a
            double r6 = (double) r6
            r8 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            double r6 = r6 * r8
            return r6
        L2a:
            if (r9 >= 0) goto L40
            int r9 = -r9
            java.math.BigInteger r9 = power10(r9)
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            double r0 = (double) r6
            java.math.BigInteger r6 = r7.multiply(r9)
            double r6 = r6.doubleValue()
            double r6 = r6 * r0
            return r6
        L40:
            if (r9 != 0) goto L46
            double r0 = (double) r6
            double r6 = (double) r7
            double r0 = r0 * r6
            return r0
        L46:
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            int r8 = (int) r0
            int r8 = r8 + (-56)
            java.math.BigInteger r9 = power10(r9)
            if (r8 > 0) goto L59
            int r0 = -r8
            java.math.BigInteger r7 = r7.shiftLeft(r0)
            goto L5d
        L59:
            java.math.BigInteger r9 = r9.shiftLeft(r8)
        L5d:
            java.math.BigInteger[] r7 = r7.divideAndRemainder(r9)
            r9 = 0
            r9 = r7[r9]
            long r0 = r9.longValue()
            r9 = 1
            r7 = r7[r9]
            int r7 = r7.signum()
            int r9 = java.lang.Long.numberOfLeadingZeros(r0)
            int r9 = 9 - r9
            int r2 = (-1076) - r8
            if (r9 < r2) goto L83
            double r2 = (double) r6
            long r6 = (long) r7
            long r6 = r6 | r0
            double r6 = (double) r6
            double r6 = java.lang.Math.scalb(r6, r8)
            double r6 = r6 * r2
            return r6
        L83:
            r8 = 1
            long r3 = r8 << r2
            long r3 = r3 - r8
            long r8 = r0 >> r2
            long r0 = r0 & r3
            int r0 = java.lang.Long.signum(r0)
            long r0 = (long) r0
            long r8 = r8 | r0
            long r0 = (long) r7
            long r7 = r8 | r0
            double r0 = (double) r6
            double r6 = (double) r7
            r8 = -1076(0xfffffffffffffbcc, float:NaN)
            double r6 = java.lang.Math.scalb(r6, r8)
            double r6 = r6 * r0
            return r6
    }

    public static double doubleValue(boolean r20, int r21, char[] r22, int r23) {
            r0 = r21
            r1 = r23
            double[] r2 = com.alibaba.fastjson2.util.TypeUtils.SMALL_10_POW
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
            float[] r4 = com.alibaba.fastjson2.util.TypeUtils.SINGLE_SMALL_10_POW
            int r4 = r4.length
            r4 = 16
            int r9 = java.lang.Math.min(r1, r4)
            r4 = 0
            char r5 = r22[r4]
            int r5 = r5 + (-48)
            r6 = 9
            int r6 = java.lang.Math.min(r9, r6)
            r7 = r3
        L1e:
            if (r7 >= r6) goto L2a
            int r5 = r5 * 10
            char r8 = r22[r7]
            int r5 = r5 + r8
            int r5 = r5 + (-48)
            int r7 = r7 + 1
            goto L1e
        L2a:
            long r7 = (long) r5
        L2b:
            if (r6 >= r9) goto L39
            r10 = 10
            long r7 = r7 * r10
            char r5 = r22[r6]
            int r5 = r5 + (-48)
            long r10 = (long) r5
            long r7 = r7 + r10
            int r6 = r6 + 1
            goto L2b
        L39:
            double r5 = (double) r7
            int r10 = r0 - r9
            r11 = 15
            r12 = 0
            if (r1 > r11) goto L7d
            if (r10 == 0) goto L78
            int r11 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r11 != 0) goto L49
            goto L78
        L49:
            if (r10 < 0) goto L6a
            if (r10 > r2) goto L57
            double[] r0 = com.alibaba.fastjson2.util.TypeUtils.SMALL_10_POW
            r1 = r0[r10]
            double r5 = r5 * r1
            if (r20 == 0) goto L56
            double r0 = -r5
            return r0
        L56:
            return r5
        L57:
            int r11 = 15 - r9
            int r2 = r2 + r11
            if (r10 > r2) goto L7d
            double[] r0 = com.alibaba.fastjson2.util.TypeUtils.SMALL_10_POW
            r1 = r0[r11]
            double r5 = r5 * r1
            int r10 = r10 - r11
            r1 = r0[r10]
            double r5 = r5 * r1
            if (r20 == 0) goto L69
            double r0 = -r5
            return r0
        L69:
            return r5
        L6a:
            int r2 = -r2
            if (r10 < r2) goto L7d
            double[] r0 = com.alibaba.fastjson2.util.TypeUtils.SMALL_10_POW
            int r1 = -r10
            r1 = r0[r1]
            double r5 = r5 / r1
            if (r20 == 0) goto L77
            double r0 = -r5
            return r0
        L77:
            return r5
        L78:
            if (r20 == 0) goto L7c
            double r0 = -r5
            return r0
        L7c:
            return r5
        L7d:
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r10 <= 0) goto Ld1
            r2 = 309(0x135, float:4.33E-43)
            r11 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            r16 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            if (r0 <= r2) goto L8d
            if (r20 == 0) goto L8c
            return r16
        L8c:
            return r11
        L8d:
            r2 = r10 & 15
            if (r2 == 0) goto L97
            double[] r13 = com.alibaba.fastjson2.util.TypeUtils.SMALL_10_POW
            r18 = r13[r2]
            double r5 = r5 * r18
        L97:
            int r2 = r10 >> 4
            if (r2 == 0) goto Lcf
            r10 = r4
        L9c:
            if (r2 <= r3) goto Lad
            r13 = r2 & 1
            if (r13 == 0) goto La8
            double[] r13 = com.alibaba.fastjson2.util.TypeUtils.BIG_10_POW
            r18 = r13[r10]
            double r5 = r5 * r18
        La8:
            int r10 = r10 + 1
            int r2 = r2 >> 1
            goto L9c
        Lad:
            double[] r2 = com.alibaba.fastjson2.util.TypeUtils.BIG_10_POW
            r18 = r2[r10]
            double r18 = r18 * r5
            boolean r13 = java.lang.Double.isInfinite(r18)
            if (r13 == 0) goto Lcd
            double r5 = r5 / r14
            r13 = r2[r10]
            double r5 = r5 * r13
            boolean r2 = java.lang.Double.isInfinite(r5)
            if (r2 == 0) goto Lc7
            if (r20 == 0) goto Lc6
            return r16
        Lc6:
            return r11
        Lc7:
            r5 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            goto Lcf
        Lcd:
            r5 = r18
        Lcf:
            r11 = r5
            goto L114
        Ld1:
            if (r10 >= 0) goto Lcf
            int r2 = -r10
            r10 = -325(0xfffffffffffffebb, float:NaN)
            r16 = -9223372036854775808
            if (r0 >= r10) goto Lde
            if (r20 == 0) goto Ldd
            return r16
        Ldd:
            return r12
        Lde:
            r10 = r2 & 15
            if (r10 == 0) goto Le7
            double[] r11 = com.alibaba.fastjson2.util.TypeUtils.SMALL_10_POW
            r10 = r11[r10]
            double r5 = r5 / r10
        Le7:
            int r2 = r2 >> 4
            if (r2 == 0) goto Lcf
            r10 = r4
        Lec:
            if (r2 <= r3) goto Lfd
            r11 = r2 & 1
            if (r11 == 0) goto Lf8
            double[] r11 = com.alibaba.fastjson2.util.TypeUtils.TINY_10_POW
            r18 = r11[r10]
            double r5 = r5 * r18
        Lf8:
            int r10 = r10 + 1
            int r2 = r2 >> 1
            goto Lec
        Lfd:
            double[] r2 = com.alibaba.fastjson2.util.TypeUtils.TINY_10_POW
            r10 = r2[r10]
            double r18 = r5 * r10
            int r2 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r2 != 0) goto Lcd
            double r5 = r5 * r14
            double r5 = r5 * r10
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 != 0) goto L111
            if (r20 == 0) goto L110
            return r16
        L110:
            return r12
        L111:
            r5 = 1
            goto Lcf
        L114:
            r2 = 1100(0x44c, float:1.541E-42)
            if (r1 <= r2) goto L11e
            r1 = 49
            r22[r2] = r1
            r1 = 1101(0x44d, float:1.543E-42)
        L11e:
            r10 = r1
            com.alibaba.fastjson2.util.FDBigInteger r5 = new com.alibaba.fastjson2.util.FDBigInteger
            r6 = r7
            r8 = r22
            r5.<init>(r6, r8, r9, r10)
            int r0 = r0 - r10
            long r1 = java.lang.Double.doubleToRawLongBits(r11)
            int r6 = -r0
            int r6 = java.lang.Math.max(r4, r6)
            int r0 = java.lang.Math.max(r4, r0)
            com.alibaba.fastjson2.util.FDBigInteger r5 = r5.multByPow52(r0, r4)
            r5.immutable = r3
            r7 = 0
            r8 = r4
        L13d:
            r9 = 52
            long r9 = r1 >>> r9
            int r9 = (int) r9
            r10 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r10 = r10 & r1
            if (r9 <= 0) goto L14e
            r12 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r10 = r10 | r12
            goto L157
        L14e:
            int r9 = java.lang.Long.numberOfLeadingZeros(r10)
            int r9 = r9 + (-11)
            long r10 = r10 << r9
            int r9 = 1 - r9
        L157:
            int r12 = r9 + (-1023)
            int r13 = java.lang.Long.numberOfTrailingZeros(r10)
            long r10 = r10 >>> r13
            int r9 = r9 + (-1075)
            int r9 = r9 + r13
            int r14 = 53 - r13
            if (r9 < 0) goto L16a
            int r15 = r6 + r9
            r16 = r0
            goto L16f
        L16a:
            int r15 = r0 - r9
            r16 = r15
            r15 = r6
        L16f:
            r4 = -1023(0xfffffffffffffc01, float:NaN)
            if (r12 > r4) goto L177
            int r12 = r12 + r13
            int r12 = r12 + 1023
            goto L179
        L177:
            int r12 = r13 + 1
        L179:
            int r4 = r15 + r12
            int r12 = r16 + r12
            int r13 = java.lang.Math.min(r12, r15)
            int r13 = java.lang.Math.min(r4, r13)
            int r4 = r4 - r13
            int r12 = r12 - r13
            int r15 = r15 - r13
            com.alibaba.fastjson2.util.FDBigInteger r4 = com.alibaba.fastjson2.util.FDBigInteger.valueOfMulPow52(r10, r6, r4)
            if (r7 == 0) goto L190
            if (r8 == r12) goto L195
        L190:
            com.alibaba.fastjson2.util.FDBigInteger r7 = r5.leftShift(r12)
            r8 = r12
        L195:
            int r10 = r4.cmp(r7)
            if (r10 <= 0) goto L1b2
            com.alibaba.fastjson2.util.FDBigInteger r4 = r4.leftInplaceSub(r7)
            if (r14 != r3) goto L1b0
            r10 = -1022(0xfffffffffffffc02, float:NaN)
            if (r9 <= r10) goto L1b0
            int r15 = r15 + (-1)
            if (r15 >= 0) goto L1b0
            com.alibaba.fastjson2.util.FDBigInteger r4 = r4.leftShift(r3)
            r9 = r3
            r15 = 0
            goto L1b9
        L1b0:
            r9 = r3
            goto L1b9
        L1b2:
            if (r10 >= 0) goto L1e7
            com.alibaba.fastjson2.util.FDBigInteger r4 = r7.rightInplaceSub(r4)
            r9 = 0
        L1b9:
            int r4 = r4.cmpPow52(r6, r15)
            if (r4 >= 0) goto L1c0
            goto L1e7
        L1c0:
            r10 = -1
            r12 = 0
            r14 = 1
            if (r4 != 0) goto L1d4
            long r3 = r1 & r14
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 == 0) goto L1e7
            if (r9 == 0) goto L1d1
            goto L1d2
        L1d1:
            r10 = r14
        L1d2:
            long r1 = r1 + r10
            goto L1e7
        L1d4:
            if (r9 == 0) goto L1d7
            goto L1d8
        L1d7:
            r10 = r14
        L1d8:
            long r1 = r1 + r10
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 == 0) goto L1e7
            r9 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 != 0) goto L1e4
            goto L1e7
        L1e4:
            r4 = 0
            goto L13d
        L1e7:
            if (r20 == 0) goto L1ec
            r3 = -9223372036854775808
            long r1 = r1 | r3
        L1ec:
            double r0 = java.lang.Double.longBitsToDouble(r1)
            return r0
    }

    public static float floatValue(int r6, long r7, int r9) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r7)
            int r0 = 64 - r0
            long r0 = (long) r0
            double r2 = (double) r9
            r4 = 4614662735865160561(0x400a934f0979a371, double:3.321928094887362)
            double r2 = r2 * r4
            double r2 = java.lang.Math.ceil(r2)
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = -151(0xffffffffffffff69, double:NaN)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1e
            float r6 = (float) r6
            r7 = 0
        L1c:
            float r6 = r6 * r7
            return r6
        L1e:
            r2 = 129(0x81, double:6.37E-322)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L28
            float r6 = (float) r6
            r7 = 2139095040(0x7f800000, float:Infinity)
            goto L1c
        L28:
            if (r9 >= 0) goto L3e
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            float r6 = (float) r6
            int r8 = -r9
            java.math.BigInteger r8 = power10(r8)
            java.math.BigInteger r7 = r7.multiply(r8)
            float r7 = r7.floatValue()
        L3c:
            float r7 = r7 * r6
            return r7
        L3e:
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            int r8 = (int) r0
            int r8 = r8 + (-27)
            java.math.BigInteger r9 = power10(r9)
            if (r8 > 0) goto L51
            int r0 = -r8
            java.math.BigInteger r7 = r7.shiftLeft(r0)
            goto L55
        L51:
            java.math.BigInteger r9 = r9.shiftLeft(r8)
        L55:
            java.math.BigInteger[] r7 = r7.divideAndRemainder(r9)
            r9 = 0
            r9 = r7[r9]
            int r9 = r9.intValue()
            r0 = 1
            r7 = r7[r0]
            int r7 = r7.signum()
            int r1 = java.lang.Integer.numberOfLeadingZeros(r9)
            int r1 = 6 - r1
            int r2 = (-151) - r8
            if (r1 < r2) goto L79
            float r6 = (float) r6
            r7 = r7 | r9
            float r7 = (float) r7
            float r7 = java.lang.Math.scalb(r7, r8)
            goto L3c
        L79:
            int r8 = r0 << r2
            int r8 = r8 - r0
            int r0 = r9 >> r2
            r8 = r8 & r9
            int r8 = java.lang.Integer.signum(r8)
            r8 = r8 | r0
            r7 = r7 | r8
            float r6 = (float) r6
            float r7 = (float) r7
            r8 = -151(0xffffffffffffff69, float:NaN)
            float r7 = java.lang.Math.scalb(r7, r8)
            goto L3c
    }

    public static float floatValue(boolean r16, int r17, char[] r18, int r19) {
            r0 = r17
            r1 = r19
            float[] r2 = com.alibaba.fastjson2.util.TypeUtils.SINGLE_SMALL_10_POW
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
            r4 = 8
            int r9 = java.lang.Math.min(r1, r4)
            r11 = 0
            char r5 = r18[r11]
            int r5 = r5 + (-48)
            r6 = r3
        L15:
            if (r6 >= r9) goto L21
            int r5 = r5 * 10
            char r7 = r18[r6]
            int r5 = r5 + r7
            int r5 = r5 + (-48)
            int r6 = r6 + 1
            goto L15
        L21:
            float r6 = (float) r5
            int r7 = r0 - r9
            r8 = 0
            r10 = 7
            if (r1 > r10) goto L63
            if (r7 == 0) goto L5e
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L2f
            goto L5e
        L2f:
            if (r7 < 0) goto L50
            if (r7 > r2) goto L3d
            float[] r0 = com.alibaba.fastjson2.util.TypeUtils.SINGLE_SMALL_10_POW
            r0 = r0[r7]
            float r6 = r6 * r0
            if (r16 == 0) goto L3c
            float r0 = -r6
            return r0
        L3c:
            return r6
        L3d:
            int r10 = 7 - r9
            int r2 = r2 + r10
            if (r7 > r2) goto L86
            float[] r0 = com.alibaba.fastjson2.util.TypeUtils.SINGLE_SMALL_10_POW
            r1 = r0[r10]
            float r6 = r6 * r1
            int r7 = r7 - r10
            r0 = r0[r7]
            float r6 = r6 * r0
            if (r16 == 0) goto L4f
            float r0 = -r6
            return r0
        L4f:
            return r6
        L50:
            int r2 = -r2
            if (r7 < r2) goto L86
            float[] r0 = com.alibaba.fastjson2.util.TypeUtils.SINGLE_SMALL_10_POW
            int r1 = -r7
            r0 = r0[r1]
            float r6 = r6 / r0
            if (r16 == 0) goto L5d
            float r0 = -r6
            return r0
        L5d:
            return r6
        L5e:
            if (r16 == 0) goto L62
            float r0 = -r6
            return r0
        L62:
            return r6
        L63:
            if (r0 < r1) goto L86
            int r2 = r1 + r0
            r10 = 15
            if (r2 > r10) goto L86
            long r2 = (long) r5
        L6c:
            if (r9 >= r1) goto L7a
            r4 = 10
            long r2 = r2 * r4
            char r4 = r18[r9]
            int r4 = r4 + (-48)
            long r4 = (long) r4
            long r2 = r2 + r4
            int r9 = r9 + 1
            goto L6c
        L7a:
            double r2 = (double) r2
            int r0 = r0 - r1
            double[] r1 = com.alibaba.fastjson2.util.TypeUtils.SMALL_10_POW
            r0 = r1[r0]
            double r2 = r2 * r0
            float r0 = (float) r2
            if (r16 == 0) goto L85
            float r0 = -r0
        L85:
            return r0
        L86:
            double r12 = (double) r6
            if (r7 <= 0) goto Lb3
            r2 = 39
            if (r0 <= r2) goto L95
            if (r16 == 0) goto L92
            r0 = -8388608(0xffffffffff800000, float:-Infinity)
            return r0
        L92:
            r0 = 2139095040(0x7f800000, float:Infinity)
            return r0
        L95:
            r2 = r7 & 15
            if (r2 == 0) goto L9e
            double[] r6 = com.alibaba.fastjson2.util.TypeUtils.SMALL_10_POW
            r14 = r6[r2]
            double r12 = r12 * r14
        L9e:
            int r2 = r7 >> 4
            if (r2 == 0) goto Lde
            r6 = r11
        La3:
            if (r2 <= 0) goto Lde
            r7 = r2 & 1
            if (r7 == 0) goto Lae
            double[] r7 = com.alibaba.fastjson2.util.TypeUtils.BIG_10_POW
            r14 = r7[r6]
            double r12 = r12 * r14
        Lae:
            int r6 = r6 + 1
            int r2 = r2 >> 1
            goto La3
        Lb3:
            if (r7 >= 0) goto Lde
            int r2 = -r7
            r6 = -46
            if (r0 >= r6) goto Lc0
            if (r16 == 0) goto Lbf
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        Lbf:
            return r8
        Lc0:
            r6 = r2 & 15
            if (r6 == 0) goto Lc9
            double[] r7 = com.alibaba.fastjson2.util.TypeUtils.SMALL_10_POW
            r6 = r7[r6]
            double r12 = r12 / r6
        Lc9:
            int r2 = r2 >> 4
            if (r2 == 0) goto Lde
            r6 = r11
        Lce:
            if (r2 <= 0) goto Lde
            r7 = r2 & 1
            if (r7 == 0) goto Ld9
            double[] r7 = com.alibaba.fastjson2.util.TypeUtils.TINY_10_POW
            r14 = r7[r6]
            double r12 = r12 * r14
        Ld9:
            int r6 = r6 + 1
            int r2 = r2 >> 1
            goto Lce
        Lde:
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r6 = (float) r12
            float r2 = java.lang.Math.min(r2, r6)
            r6 = 1
            float r2 = java.lang.Math.max(r6, r2)
            r6 = 200(0xc8, float:2.8E-43)
            if (r1 <= r6) goto Lf5
            r1 = 49
            r18[r6] = r1
            r1 = 201(0xc9, float:2.82E-43)
        Lf5:
            r10 = r1
            com.alibaba.fastjson2.util.FDBigInteger r1 = new com.alibaba.fastjson2.util.FDBigInteger
            long r6 = (long) r5
            r8 = r18
            r5 = r1
            r5.<init>(r6, r8, r9, r10)
            int r0 = r0 - r10
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            int r2 = -r0
            int r2 = java.lang.Math.max(r11, r2)
            int r0 = java.lang.Math.max(r11, r0)
            com.alibaba.fastjson2.util.FDBigInteger r5 = r5.multByPow52(r0, r11)
            r5.immutable = r3
            r6 = 0
            r7 = r11
        L115:
            int r8 = r1 >>> 23
            r9 = 8388607(0x7fffff, float:1.1754942E-38)
            r9 = r9 & r1
            if (r8 <= 0) goto L121
            r10 = 8388608(0x800000, float:1.1754944E-38)
            r9 = r9 | r10
            goto L129
        L121:
            int r8 = java.lang.Integer.numberOfLeadingZeros(r9)
            int r8 = r8 - r4
            int r9 = r9 << r8
            int r8 = 1 - r8
        L129:
            int r10 = r8 + (-127)
            int r12 = java.lang.Integer.numberOfTrailingZeros(r9)
            int r9 = r9 >>> r12
            int r8 = r8 + (-150)
            int r8 = r8 + r12
            int r13 = 24 - r12
            if (r8 < 0) goto L13b
            int r14 = r2 + r8
            r15 = r0
            goto L13f
        L13b:
            int r14 = r0 - r8
            r15 = r14
            r14 = r2
        L13f:
            r4 = -127(0xffffffffffffff81, float:NaN)
            if (r10 > r4) goto L147
            int r10 = r10 + r12
            int r10 = r10 + 127
            goto L149
        L147:
            int r10 = r12 + 1
        L149:
            int r4 = r14 + r10
            int r15 = r15 + r10
            int r10 = java.lang.Math.min(r15, r14)
            int r10 = java.lang.Math.min(r4, r10)
            int r4 = r4 - r10
            int r15 = r15 - r10
            int r14 = r14 - r10
            long r9 = (long) r9
            com.alibaba.fastjson2.util.FDBigInteger r4 = com.alibaba.fastjson2.util.FDBigInteger.valueOfMulPow52(r9, r2, r4)
            if (r6 == 0) goto L160
            if (r7 == r15) goto L165
        L160:
            com.alibaba.fastjson2.util.FDBigInteger r6 = r5.leftShift(r15)
            r7 = r15
        L165:
            int r9 = r4.cmp(r6)
            if (r9 <= 0) goto L182
            com.alibaba.fastjson2.util.FDBigInteger r4 = r4.leftInplaceSub(r6)
            if (r13 != r3) goto L180
            r9 = -126(0xffffffffffffff82, float:NaN)
            if (r8 <= r9) goto L180
            int r14 = r14 + (-1)
            if (r14 >= 0) goto L180
            com.alibaba.fastjson2.util.FDBigInteger r4 = r4.leftShift(r3)
            r8 = r3
            r14 = r11
            goto L189
        L180:
            r8 = r3
            goto L189
        L182:
            if (r9 >= 0) goto L1ac
            com.alibaba.fastjson2.util.FDBigInteger r4 = r6.rightInplaceSub(r4)
            r8 = r11
        L189:
            int r4 = r4.cmpPow52(r2, r14)
            if (r4 >= 0) goto L190
            goto L1ac
        L190:
            r9 = -1
            if (r4 != 0) goto L19c
            r0 = r1 & 1
            if (r0 == 0) goto L1ac
            if (r8 == 0) goto L19a
            r3 = r9
        L19a:
            int r1 = r1 + r3
            goto L1ac
        L19c:
            if (r8 == 0) goto L19f
            goto L1a0
        L19f:
            r9 = r3
        L1a0:
            int r1 = r1 + r9
            if (r1 == 0) goto L1ac
            r4 = 2139095040(0x7f800000, float:Infinity)
            if (r1 != r4) goto L1a8
            goto L1ac
        L1a8:
            r4 = 8
            goto L115
        L1ac:
            if (r16 == 0) goto L1b1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
        L1b1:
            float r0 = java.lang.Float.intBitsToFloat(r1)
            return r0
    }

    public static java.lang.Class<?> getArrayClass(java.lang.Class r1) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L7
            java.lang.Class<int[]> r1 = int[].class
            return r1
        L7:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto Le
            java.lang.Class<byte[]> r1 = byte[].class
            return r1
        Le:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L15
            java.lang.Class<short[]> r1 = short[].class
            return r1
        L15:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L1c
            java.lang.Class<long[]> r1 = long[].class
            return r1
        L1c:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L23
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            return r1
        L23:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 != r0) goto L2a
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            return r1
        L2a:
            r0 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
            java.lang.Class r1 = r1.getClass()
            return r1
    }

    public static java.lang.Class<?> getClass(java.lang.reflect.Type r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.Class r0 = r4.getClass()
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            if (r0 != r1) goto Lf
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        Lf:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1e
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = r4.getRawType()
            java.lang.Class r4 = getClass(r4)
            return r4
        L1e:
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L37
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.Type[] r4 = r4.getBounds()
            r4 = r4[r1]
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L32
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L32:
            java.lang.Class r4 = getClass(r4)
            return r4
        L37:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L4d
            r0 = r4
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            int r2 = r0.length
            r3 = 1
            if (r2 != r3) goto L4d
            r4 = r0[r1]
            java.lang.Class r4 = getClass(r4)
            return r4
        L4d:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L60
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.Class r4 = getClass(r4)
            java.lang.Class r4 = getArrayClass(r4)
            return r4
        L60:
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            return r4
    }

    public static java.lang.Object getDefaultValue(java.lang.reflect.Type r2) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            r1 = 0
            if (r2 != r0) goto La
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            return r2
        La:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r2 != r0) goto L15
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L15:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r2 != r0) goto L1f
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L1f:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r2 != r0) goto L2a
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L2a:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r2 != r0) goto L31
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L31:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r2 != r0) goto L3a
            java.lang.Short r2 = java.lang.Short.valueOf(r1)
            return r2
        L3a:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r2 != r0) goto L43
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            return r2
        L43:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r2 != r0) goto L4c
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            return r2
        L4c:
            r2 = 0
            return r2
    }

    public static java.util.Map getInnerMap(java.util.Map r1) {
            java.util.function.Function r0 = com.alibaba.fastjson2.JSONFactory.getInnerMap()
            java.lang.Object r1 = r0.apply(r1)
            java.util.Map r1 = (java.util.Map) r1
            return r1
    }

    public static java.lang.reflect.Type getMapValueType(java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L12
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r2 = r2.getActualTypeArguments()
            int r0 = r2.length
            r1 = 2
            if (r0 != r1) goto L12
            r0 = 1
            r2 = r2[r0]
            return r2
        L12:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            return r2
    }

    public static java.lang.Class getMapping(java.lang.String r1) {
            java.util.Map<java.lang.String, java.lang.Class> r0 = com.alibaba.fastjson2.util.TypeUtils.Mapping.TYPE_MAPPINGS
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    public static java.lang.Class<?> getMapping(java.lang.reflect.Type r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.Class r0 = r4.getClass()
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            if (r0 != r1) goto Lf
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        Lf:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1e
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = r4.getRawType()
            java.lang.Class r4 = getMapping(r4)
            return r4
        L1e:
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L37
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.Type[] r4 = r4.getBounds()
            r4 = r4[r1]
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L32
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L32:
            java.lang.Class r4 = getMapping(r4)
            return r4
        L37:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L4d
            r0 = r4
            java.lang.reflect.WildcardType r0 = (java.lang.reflect.WildcardType) r0
            java.lang.reflect.Type[] r0 = r0.getUpperBounds()
            int r2 = r0.length
            r3 = 1
            if (r2 != r3) goto L4d
            r4 = r0[r1]
            java.lang.Class r4 = getMapping(r4)
            return r4
        L4d:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L60
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.Class r4 = getClass(r4)
            java.lang.Class r4 = getArrayClass(r4)
            return r4
        L60:
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            return r4
    }

    public static java.lang.String getTypeName(java.lang.Class r3) {
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "java.util.HashMap"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L88
            java.lang.String r1 = "java.util.ArrayList"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L85
            java.lang.String r1 = "com.alibaba.fastjson.JSONObject"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L82
            java.lang.String r1 = "com.alibaba.fastjson.JSONArray"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7f
            java.lang.String r1 = "java.util.List"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7e
            java.lang.String r1 = "com.alibaba.fastjson2.JSONArray"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7b
            java.lang.String r1 = "java.lang.Object"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L78
            java.lang.String r1 = "com.alibaba.fastjson2.JSONObject"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L75
            java.util.Map<java.lang.Class, java.lang.String> r1 = com.alibaba.fastjson2.util.TypeUtils.Mapping.NAME_MAPPINGS
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L4f
            return r1
        L4f:
            r1 = 36
            int r1 = r0.indexOf(r1)
            r2 = -1
            if (r1 == r2) goto L7e
            int r1 = r1 + 1
            java.lang.String r1 = r0.substring(r1)
            boolean r1 = isInteger(r1)
            if (r1 == 0) goto L7e
            java.lang.Class r3 = r3.getSuperclass()
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L7e
            java.lang.String r3 = getTypeName(r3)
            return r3
        L75:
            java.lang.String r3 = "JSONObject"
            return r3
        L78:
            java.lang.String r3 = "Object"
            return r3
        L7b:
            java.lang.String r3 = "JSONArray"
            return r3
        L7e:
            return r0
        L7f:
            java.lang.String r3 = "JA1"
            return r3
        L82:
            java.lang.String r3 = "JO1"
            return r3
        L85:
            java.lang.String r3 = "A"
            return r3
        L88:
            java.lang.String r3 = "M"
            return r3
    }

    public static java.lang.String getTypeName(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = getTypeName(r1)
            return r1
        Lb:
            java.lang.String r1 = "<non-class>"
            return r1
    }

    public static java.lang.reflect.Type intern(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L20
            r0 = r3
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r1 = r0.getRawType()
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            java.lang.Class<java.util.List> r2 = java.util.List.class
            if (r1 != r2) goto L20
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L20
            r1 = 0
            r0 = r0[r1]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r0 != r1) goto L20
            java.lang.reflect.ParameterizedType r3 = com.alibaba.fastjson2.util.TypeUtils.PARAM_TYPE_LIST_STR
        L20:
            return r3
    }

    public static boolean isInteger(java.lang.String r6) {
            r0 = 0
            if (r6 == 0) goto L3d
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto La
            goto L3d
        La:
            char r1 = r6.charAt(r0)
            r2 = 45
            r3 = 57
            r4 = 48
            r5 = 1
            if (r1 == r2) goto L21
            r2 = 43
            if (r1 != r2) goto L1c
            goto L21
        L1c:
            if (r1 < r4) goto L20
            if (r1 <= r3) goto L28
        L20:
            return r0
        L21:
            int r1 = r6.length()
            if (r1 != r5) goto L28
            return r0
        L28:
            r1 = r5
        L29:
            int r2 = r6.length()
            if (r1 >= r2) goto L3c
            char r2 = r6.charAt(r1)
            if (r2 < r4) goto L3b
            if (r2 <= r3) goto L38
            goto L3b
        L38:
            int r1 = r1 + 1
            goto L29
        L3b:
            return r0
        L3c:
            return r5
        L3d:
            return r0
    }

    public static boolean isInteger(byte[] r6, int r7, int r8) {
            r0 = 0
            if (r6 == 0) goto L30
            if (r8 != 0) goto L6
            goto L30
        L6:
            r1 = r6[r7]
            char r1 = (char) r1
            r2 = 45
            r3 = 57
            r4 = 48
            r5 = 1
            if (r1 == r2) goto L1c
            r2 = 43
            if (r1 != r2) goto L17
            goto L1c
        L17:
            if (r1 < r4) goto L1b
            if (r1 <= r3) goto L1f
        L1b:
            return r0
        L1c:
            if (r8 != r5) goto L1f
            return r0
        L1f:
            int r8 = r8 + r7
            int r7 = r7 + r5
        L21:
            if (r7 >= r8) goto L2f
            r1 = r6[r7]
            char r1 = (char) r1
            if (r1 < r4) goto L2e
            if (r1 <= r3) goto L2b
            goto L2e
        L2b:
            int r7 = r7 + 1
            goto L21
        L2e:
            return r0
        L2f:
            return r5
        L30:
            return r0
    }

    public static boolean isNumber(java.lang.String r11) {
            r0 = 0
            if (r11 == 0) goto Lba
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto Lb
            goto Lba
        Lb:
            char r1 = r11.charAt(r0)
            r2 = 43
            r3 = 45
            r4 = 46
            r5 = 1
            if (r1 == r3) goto L28
            if (r1 != r2) goto L1b
            goto L28
        L1b:
            if (r1 != r4) goto L26
            int r6 = r11.length()
            if (r6 != r5) goto L24
            return r0
        L24:
            r6 = r5
            goto L34
        L26:
            r6 = r0
            goto L34
        L28:
            int r1 = r11.length()
            if (r1 != r5) goto L2f
            return r0
        L2f:
            char r1 = r11.charAt(r5)
            goto L24
        L34:
            int r7 = r11.length()
            if (r1 != r4) goto L3c
            r8 = r5
            goto L3d
        L3c:
            r8 = r0
        L3d:
            r9 = 57
            r10 = 48
            if (r8 != 0) goto L5c
            if (r1 < r10) goto L5c
            if (r1 > r9) goto L5c
        L47:
            if (r6 >= r7) goto L5b
            int r1 = r6 + 1
            char r6 = r11.charAt(r6)
            if (r6 < r10) goto L56
            if (r6 <= r9) goto L54
            goto L56
        L54:
            r6 = r1
            goto L47
        L56:
            r8 = r6
            r6 = r1
            r1 = r8
            r8 = r5
            goto L5d
        L5b:
            return r5
        L5c:
            r8 = r0
        L5d:
            if (r1 != r4) goto L81
            if (r6 >= r7) goto L80
            int r1 = r6 + 1
            char r4 = r11.charAt(r6)
            if (r4 < r10) goto L7d
            if (r4 > r9) goto L7d
        L6b:
            if (r1 >= r7) goto L7c
            int r6 = r1 + 1
            char r1 = r11.charAt(r1)
            if (r1 < r10) goto L7a
            if (r1 <= r9) goto L78
            goto L7a
        L78:
            r1 = r6
            goto L6b
        L7a:
            r4 = r5
            goto L82
        L7c:
            return r5
        L7d:
            r6 = r1
            r1 = r4
            goto L7a
        L80:
            return r5
        L81:
            r4 = r0
        L82:
            if (r8 != 0) goto L87
            if (r4 != 0) goto L87
            return r0
        L87:
            r4 = 101(0x65, float:1.42E-43)
            if (r1 == r4) goto L8f
            r4 = 69
            if (r1 != r4) goto Lb8
        L8f:
            if (r6 != r7) goto L92
            return r5
        L92:
            int r1 = r6 + 1
            char r4 = r11.charAt(r6)
            if (r4 == r2) goto L9c
            if (r4 != r3) goto La5
        L9c:
            if (r1 >= r7) goto Lba
            int r6 = r6 + 2
            char r4 = r11.charAt(r1)
            r1 = r6
        La5:
            if (r4 < r10) goto Lba
            if (r4 > r9) goto Lba
        La9:
            if (r1 >= r7) goto Lb9
            int r2 = r1 + 1
            char r1 = r11.charAt(r1)
            if (r1 < r10) goto Lb8
            if (r1 <= r9) goto Lb6
            goto Lb8
        Lb6:
            r1 = r2
            goto La9
        Lb8:
            return r0
        Lb9:
            return r5
        Lba:
            return r0
    }

    public static boolean isNumber(byte[] r9, int r10, int r11) {
            r0 = 0
            if (r9 == 0) goto La3
            if (r11 != 0) goto L7
            goto La3
        L7:
            r1 = r9[r10]
            char r1 = (char) r1
            r2 = 43
            r3 = 45
            r4 = 46
            r5 = 1
            if (r1 == r3) goto L20
            if (r1 != r2) goto L16
            goto L20
        L16:
            if (r1 != r4) goto L1e
            if (r11 != r5) goto L1b
            return r0
        L1b:
            int r6 = r10 + 1
            goto L28
        L1e:
            r6 = r10
            goto L28
        L20:
            if (r11 != r5) goto L23
            return r0
        L23:
            int r6 = r10 + 1
            r1 = r9[r6]
            char r1 = (char) r1
        L28:
            int r10 = r10 + r11
            if (r1 != r4) goto L2d
            r11 = r5
            goto L2e
        L2d:
            r11 = r0
        L2e:
            r7 = 57
            r8 = 48
            if (r11 != 0) goto L4a
            if (r1 < r8) goto L4a
            if (r1 > r7) goto L4a
        L38:
            if (r6 >= r10) goto L49
            int r11 = r6 + 1
            r1 = r9[r6]
            char r1 = (char) r1
            if (r1 < r8) goto L46
            if (r1 <= r7) goto L44
            goto L46
        L44:
            r6 = r11
            goto L38
        L46:
            r6 = r11
            r11 = r5
            goto L4b
        L49:
            return r5
        L4a:
            r11 = r0
        L4b:
            if (r1 != r4) goto L6d
            if (r6 >= r10) goto L6c
            int r1 = r6 + 1
            r4 = r9[r6]
            char r4 = (char) r4
            if (r4 < r8) goto L69
            if (r4 > r7) goto L69
        L58:
            if (r1 >= r10) goto L68
            int r6 = r1 + 1
            r1 = r9[r1]
            char r1 = (char) r1
            if (r1 < r8) goto L66
            if (r1 <= r7) goto L64
            goto L66
        L64:
            r1 = r6
            goto L58
        L66:
            r4 = r5
            goto L6e
        L68:
            return r5
        L69:
            r6 = r1
            r1 = r4
            goto L66
        L6c:
            return r5
        L6d:
            r4 = r0
        L6e:
            if (r11 != 0) goto L73
            if (r4 != 0) goto L73
            return r0
        L73:
            r11 = 101(0x65, float:1.42E-43)
            if (r1 == r11) goto L7b
            r11 = 69
            if (r1 != r11) goto La1
        L7b:
            if (r6 != r10) goto L7e
            return r5
        L7e:
            int r11 = r6 + 1
            r1 = r9[r6]
            char r1 = (char) r1
            if (r1 == r2) goto L87
            if (r1 != r3) goto L8f
        L87:
            if (r11 >= r10) goto La3
            int r6 = r6 + 2
            r11 = r9[r11]
            char r1 = (char) r11
            r11 = r6
        L8f:
            if (r1 < r8) goto La3
            if (r1 > r7) goto La3
        L93:
            if (r11 >= r10) goto La2
            int r1 = r11 + 1
            r11 = r9[r11]
            char r11 = (char) r11
            if (r11 < r8) goto La1
            if (r11 <= r7) goto L9f
            goto La1
        L9f:
            r11 = r1
            goto L93
        La1:
            return r0
        La2:
            return r5
        La3:
            return r0
    }

    public static boolean isNumber(char[] r9, int r10, int r11) {
            r0 = 0
            if (r9 == 0) goto L9b
            if (r11 != 0) goto L7
            goto L9b
        L7:
            char r1 = r9[r10]
            r2 = 43
            r3 = 45
            r4 = 46
            r5 = 1
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L15
            goto L1f
        L15:
            if (r1 != r4) goto L1d
            if (r11 != r5) goto L1a
            return r0
        L1a:
            int r6 = r10 + 1
            goto L26
        L1d:
            r6 = r10
            goto L26
        L1f:
            if (r11 != r5) goto L22
            return r0
        L22:
            int r6 = r10 + 1
            char r1 = r9[r6]
        L26:
            int r10 = r10 + r11
            if (r1 != r4) goto L2b
            r11 = r5
            goto L2c
        L2b:
            r11 = r0
        L2c:
            r7 = 57
            r8 = 48
            if (r11 != 0) goto L47
            if (r1 < r8) goto L47
            if (r1 > r7) goto L47
        L36:
            if (r6 >= r10) goto L46
            int r11 = r6 + 1
            char r1 = r9[r6]
            if (r1 < r8) goto L43
            if (r1 <= r7) goto L41
            goto L43
        L41:
            r6 = r11
            goto L36
        L43:
            r6 = r11
            r11 = r5
            goto L48
        L46:
            return r5
        L47:
            r11 = r0
        L48:
            if (r1 != r4) goto L68
            if (r6 >= r10) goto L67
            int r1 = r6 + 1
            char r4 = r9[r6]
            if (r4 < r8) goto L64
            if (r4 > r7) goto L64
        L54:
            if (r1 >= r10) goto L63
            int r6 = r1 + 1
            char r1 = r9[r1]
            if (r1 < r8) goto L61
            if (r1 <= r7) goto L5f
            goto L61
        L5f:
            r1 = r6
            goto L54
        L61:
            r4 = r5
            goto L69
        L63:
            return r5
        L64:
            r6 = r1
            r1 = r4
            goto L61
        L67:
            return r5
        L68:
            r4 = r0
        L69:
            if (r11 != 0) goto L6e
            if (r4 != 0) goto L6e
            return r0
        L6e:
            r11 = 101(0x65, float:1.42E-43)
            if (r1 == r11) goto L76
            r11 = 69
            if (r1 != r11) goto L99
        L76:
            if (r6 != r10) goto L79
            return r5
        L79:
            int r11 = r6 + 1
            char r1 = r9[r6]
            if (r1 == r2) goto L81
            if (r1 != r3) goto L88
        L81:
            if (r11 >= r10) goto L9b
            int r6 = r6 + 2
            char r1 = r9[r11]
            r11 = r6
        L88:
            if (r1 < r8) goto L9b
            if (r1 > r7) goto L9b
        L8c:
            if (r11 >= r10) goto L9a
            int r1 = r11 + 1
            char r11 = r9[r11]
            if (r11 < r8) goto L99
            if (r11 <= r7) goto L97
            goto L99
        L97:
            r11 = r1
            goto L8c
        L99:
            return r0
        L9a:
            return r5
        L9b:
            return r0
    }

    public static boolean isUUID(java.lang.String r12) {
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            int r1 = r12.length()
            r2 = 102(0x66, float:1.43E-43)
            r3 = 97
            r4 = 70
            r5 = 65
            r6 = 57
            r7 = 48
            r8 = 32
            r9 = 1
            if (r1 != r8) goto L31
            r1 = r0
        L1a:
            if (r1 >= r8) goto L30
            char r10 = r12.charAt(r1)
            if (r10 < r7) goto L24
            if (r10 <= r6) goto L2c
        L24:
            if (r10 < r5) goto L28
            if (r10 <= r4) goto L2c
        L28:
            if (r10 < r3) goto L2f
            if (r10 > r2) goto L2f
        L2c:
            int r1 = r1 + 1
            goto L1a
        L2f:
            return r0
        L30:
            return r9
        L31:
            int r1 = r12.length()
            r8 = 36
            if (r1 != r8) goto L68
            r1 = r0
        L3a:
            if (r1 >= r8) goto L67
            char r10 = r12.charAt(r1)
            r11 = 8
            if (r1 == r11) goto L5f
            r11 = 13
            if (r1 == r11) goto L5f
            r11 = 18
            if (r1 == r11) goto L5f
            r11 = 23
            if (r1 != r11) goto L51
            goto L5f
        L51:
            if (r10 < r7) goto L55
            if (r10 <= r6) goto L64
        L55:
            if (r10 < r5) goto L59
            if (r10 <= r4) goto L64
        L59:
            if (r10 < r3) goto L5e
            if (r10 > r2) goto L5e
            goto L64
        L5e:
            return r0
        L5f:
            r11 = 45
            if (r10 == r11) goto L64
            return r0
        L64:
            int r1 = r1 + 1
            goto L3a
        L67:
            return r9
        L68:
            return r0
    }

    public static java.lang.Class loadClass(java.lang.String r8) {
            int r0 = r8.length()
            r1 = 192(0xc0, float:2.69E-43)
            r2 = 0
            if (r0 < r1) goto La
            return r2
        La:
            int r0 = r8.hashCode()
            r1 = 76
            r3 = 59
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = -1
            switch(r0) {
                case -2056817302: goto L464;
                case -2010664371: goto L459;
                case -1939501217: goto L44e;
                case -1932803762: goto L443;
                case -1932797868: goto L438;
                case -1899270121: goto L42d;
                case -1808118735: goto L422;
                case -1659005919: goto L417;
                case -1418007307: goto L409;
                case -1418001413: goto L3fb;
                case -1402722386: goto L3ed;
                case -1402716492: goto L3df;
                case -1383349348: goto L3d1;
                case -1383343454: goto L3c3;
                case -1374008726: goto L3b5;
                case -1361632968: goto L3a7;
                case -1325958191: goto L399;
                case -1114099497: goto L38b;
                case -1097129250: goto L37d;
                case -1074506598: goto L36f;
                case -958795145: goto L361;
                case -766441794: goto L353;
                case -530663260: goto L345;
                case -413661986: goto L337;
                case -413656092: goto L329;
                case -113680546: goto L31b;
                case 65: goto L30d;
                case 66: goto L2ff;
                case 67: goto L2f1;
                case 68: goto L2e3;
                case 70: goto L2d5;
                case 73: goto L2c7;
                case 74: goto L2b9;
                case 77: goto L2ab;
                case 79: goto L29d;
                case 83: goto L28f;
                case 90: goto L281;
                case 2421: goto L273;
                case 2433: goto L265;
                case 2887: goto L257;
                case 2888: goto L249;
                case 2889: goto L23b;
                case 2891: goto L22d;
                case 2894: goto L21f;
                case 2895: goto L211;
                case 2900: goto L203;
                case 2904: goto L1f5;
                case 2911: goto L1e7;
                case 73612: goto L1d9;
                case 77116: goto L1cb;
                case 83010: goto L1bd;
                case 104431: goto L1af;
                case 2122702: goto L1a1;
                case 2368702: goto L193;
                case 2616251: goto L185;
                case 3039496: goto L177;
                case 3052374: goto L169;
                case 3327612: goto L15b;
                case 61358428: goto L14d;
                case 64711720: goto L140;
                case 65821278: goto L132;
                case 97526364: goto L124;
                case 100361105: goto L116;
                case 109413500: goto L108;
                case 179563853: goto Lfa;
                case 398795216: goto Lec;
                case 578806391: goto Lde;
                case 600988612: goto Ld0;
                case 889669201: goto Lc2;
                case 935176422: goto Lb4;
                case 1063877011: goto La6;
                case 1131069988: goto L98;
                case 1195259493: goto L8a;
                case 1258621781: goto L7c;
                case 1258627675: goto L6e;
                case 1359468275: goto L60;
                case 1372295063: goto L53;
                case 1645304908: goto L45;
                case 1752376903: goto L37;
                case 2058423690: goto L29;
                case 2067161310: goto L1b;
                default: goto L19;
            }
        L19:
            goto L46e
        L1b:
            java.lang.String r0 = "short[]"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L25
            goto L46e
        L25:
            r7 = 80
            goto L46e
        L29:
            java.lang.String r0 = "boolean[]"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L33
            goto L46e
        L33:
            r7 = 79
            goto L46e
        L37:
            java.lang.String r0 = "JSONObject"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L41
            goto L46e
        L41:
            r7 = 78
            goto L46e
        L45:
            java.lang.String r0 = "[String"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L4f
            goto L46e
        L4f:
            r7 = 77
            goto L46e
        L53:
            java.lang.String r0 = "ConcurrentHashMap"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L5d
            goto L46e
        L5d:
            r7 = r1
            goto L46e
        L60:
            java.lang.String r0 = "double[]"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L6a
            goto L46e
        L6a:
            r7 = 75
            goto L46e
        L6e:
            java.lang.String r0 = "java.util.LinkedHashSet"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L78
            goto L46e
        L78:
            r7 = 74
            goto L46e
        L7c:
            java.lang.String r0 = "java.util.LinkedHashMap"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L86
            goto L46e
        L86:
            r7 = 73
            goto L46e
        L8a:
            java.lang.String r0 = "java.lang.String"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L94
            goto L46e
        L94:
            r7 = 72
            goto L46e
        L98:
            java.lang.String r0 = "java.util.TreeSet"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto La2
            goto L46e
        La2:
            r7 = 71
            goto L46e
        La6:
            java.lang.String r0 = "java.lang.Object"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lb0
            goto L46e
        Lb0:
            r7 = 70
            goto L46e
        Lb4:
            java.lang.String r0 = "java.util.Collections$SingletonSet"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lbe
            goto L46e
        Lbe:
            r7 = 69
            goto L46e
        Lc2:
            java.lang.String r0 = "java.util.Collections$UnmodifiableRandomAccessList"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lcc
            goto L46e
        Lcc:
            r7 = 68
            goto L46e
        Ld0:
            java.lang.String r0 = "TreeSet"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lda
            goto L46e
        Lda:
            r7 = 67
            goto L46e
        Lde:
            java.lang.String r0 = "ArrayList"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Le8
            goto L46e
        Le8:
            r7 = 66
            goto L46e
        Lec:
            java.lang.String r0 = "java.lang.Long"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lf6
            goto L46e
        Lf6:
            r7 = 65
            goto L46e
        Lfa:
            java.lang.String r0 = "java.util.Arrays$ArrayList"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L104
            goto L46e
        L104:
            r7 = 64
            goto L46e
        L108:
            java.lang.String r0 = "short"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L112
            goto L46e
        L112:
            r7 = 63
            goto L46e
        L116:
            java.lang.String r0 = "int[]"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L120
            goto L46e
        L120:
            r7 = 62
            goto L46e
        L124:
            java.lang.String r0 = "float"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L12e
            goto L46e
        L12e:
            r7 = 61
            goto L46e
        L132:
            java.lang.String r0 = "java.util.List"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L13c
            goto L46e
        L13c:
            r7 = 60
            goto L46e
        L140:
            java.lang.String r0 = "boolean"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L14a
            goto L46e
        L14a:
            r7 = r3
            goto L46e
        L14d:
            java.lang.String r0 = "java.util.Collections$EmptyList"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L157
            goto L46e
        L157:
            r7 = 58
            goto L46e
        L15b:
            java.lang.String r0 = "long"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L165
            goto L46e
        L165:
            r7 = 57
            goto L46e
        L169:
            java.lang.String r0 = "char"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L173
            goto L46e
        L173:
            r7 = 56
            goto L46e
        L177:
            java.lang.String r0 = "byte"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L181
            goto L46e
        L181:
            r7 = 55
            goto L46e
        L185:
            java.lang.String r0 = "UUID"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L18f
            goto L46e
        L18f:
            r7 = 54
            goto L46e
        L193:
            java.lang.String r0 = "List"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L19d
            goto L46e
        L19d:
            r7 = 53
            goto L46e
        L1a1:
            java.lang.String r0 = "Date"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L1ab
            goto L46e
        L1ab:
            r7 = 52
            goto L46e
        L1af:
            java.lang.String r0 = "int"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L1b9
            goto L46e
        L1b9:
            r7 = 51
            goto L46e
        L1bd:
            java.lang.String r0 = "Set"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L1c7
            goto L46e
        L1c7:
            r7 = 50
            goto L46e
        L1cb:
            java.lang.String r0 = "Map"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L1d5
            goto L46e
        L1d5:
            r7 = 49
            goto L46e
        L1d9:
            java.lang.String r0 = "JO1"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L1e3
            goto L46e
        L1e3:
            r7 = 48
            goto L46e
        L1e7:
            java.lang.String r0 = "[Z"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L1f1
            goto L46e
        L1f1:
            r7 = 47
            goto L46e
        L1f5:
            java.lang.String r0 = "[S"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L1ff
            goto L46e
        L1ff:
            r7 = 46
            goto L46e
        L203:
            java.lang.String r0 = "[O"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L20d
            goto L46e
        L20d:
            r7 = 45
            goto L46e
        L211:
            java.lang.String r0 = "[J"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L21b
            goto L46e
        L21b:
            r7 = 44
            goto L46e
        L21f:
            java.lang.String r0 = "[I"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L229
            goto L46e
        L229:
            r7 = 43
            goto L46e
        L22d:
            java.lang.String r0 = "[F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L237
            goto L46e
        L237:
            r7 = 42
            goto L46e
        L23b:
            java.lang.String r0 = "[D"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L245
            goto L46e
        L245:
            r7 = 41
            goto L46e
        L249:
            java.lang.String r0 = "[C"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L253
            goto L46e
        L253:
            r7 = 40
            goto L46e
        L257:
            java.lang.String r0 = "[B"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L261
            goto L46e
        L261:
            r7 = 39
            goto L46e
        L265:
            java.lang.String r0 = "LM"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L26f
            goto L46e
        L26f:
            r7 = 38
            goto L46e
        L273:
            java.lang.String r0 = "LA"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L27d
            goto L46e
        L27d:
            r7 = 37
            goto L46e
        L281:
            java.lang.String r0 = "Z"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L28b
            goto L46e
        L28b:
            r7 = 36
            goto L46e
        L28f:
            java.lang.String r0 = "S"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L299
            goto L46e
        L299:
            r7 = 35
            goto L46e
        L29d:
            java.lang.String r0 = "O"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L2a7
            goto L46e
        L2a7:
            r7 = 34
            goto L46e
        L2ab:
            java.lang.String r0 = "M"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L2b5
            goto L46e
        L2b5:
            r7 = 33
            goto L46e
        L2b9:
            java.lang.String r0 = "J"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L2c3
            goto L46e
        L2c3:
            r7 = 32
            goto L46e
        L2c7:
            java.lang.String r0 = "I"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L2d1
            goto L46e
        L2d1:
            r7 = 31
            goto L46e
        L2d5:
            java.lang.String r0 = "F"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L2df
            goto L46e
        L2df:
            r7 = 30
            goto L46e
        L2e3:
            java.lang.String r0 = "D"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L2ed
            goto L46e
        L2ed:
            r7 = 29
            goto L46e
        L2f1:
            java.lang.String r0 = "C"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L2fb
            goto L46e
        L2fb:
            r7 = 28
            goto L46e
        L2ff:
            java.lang.String r0 = "B"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L309
            goto L46e
        L309:
            r7 = 27
            goto L46e
        L30d:
            java.lang.String r0 = "A"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L317
            goto L46e
        L317:
            r7 = 26
            goto L46e
        L31b:
            java.lang.String r0 = "Calendar"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L325
            goto L46e
        L325:
            r7 = 25
            goto L46e
        L329:
            java.lang.String r0 = "java.util.Collections$EmptySet"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L333
            goto L46e
        L333:
            r7 = 24
            goto L46e
        L337:
            java.lang.String r0 = "java.util.Collections$EmptyMap"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L341
            goto L46e
        L341:
            r7 = 23
            goto L46e
        L345:
            java.lang.String r0 = "java.lang.Class"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L34f
            goto L46e
        L34f:
            r7 = 22
            goto L46e
        L353:
            java.lang.String r0 = "float[]"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L35d
            goto L46e
        L35d:
            r7 = 21
            goto L46e
        L361:
            java.lang.String r0 = "LinkedList"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L36b
            goto L46e
        L36b:
            r7 = 20
            goto L46e
        L36f:
            java.lang.String r0 = "java.util.Collections$SingletonList"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L379
            goto L46e
        L379:
            r7 = 19
            goto L46e
        L37d:
            java.lang.String r0 = "long[]"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L387
            goto L46e
        L387:
            r7 = 18
            goto L46e
        L38b:
            java.lang.String r0 = "java.util.ArrayList"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L395
            goto L46e
        L395:
            r7 = 17
            goto L46e
        L399:
            java.lang.String r0 = "double"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L3a3
            goto L46e
        L3a3:
            r7 = 16
            goto L46e
        L3a7:
            java.lang.String r0 = "char[]"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L3b1
            goto L46e
        L3b1:
            r7 = 15
            goto L46e
        L3b5:
            java.lang.String r0 = "byte[]"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L3bf
            goto L46e
        L3bf:
            r7 = 14
            goto L46e
        L3c3:
            java.lang.String r0 = "java.util.Set"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L3cd
            goto L46e
        L3cd:
            r7 = 13
            goto L46e
        L3d1:
            java.lang.String r0 = "java.util.Map"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L3db
            goto L46e
        L3db:
            r7 = 12
            goto L46e
        L3df:
            java.lang.String r0 = "java.util.HashSet"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L3e9
            goto L46e
        L3e9:
            r7 = 11
            goto L46e
        L3ed:
            java.lang.String r0 = "java.util.HashMap"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L3f7
            goto L46e
        L3f7:
            r7 = 10
            goto L46e
        L3fb:
            java.lang.String r0 = "LinkedHashSet"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L405
            goto L46e
        L405:
            r7 = 9
            goto L46e
        L409:
            java.lang.String r0 = "LinkedHashMap"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L413
            goto L46e
        L413:
            r7 = 8
            goto L46e
        L417:
            java.lang.String r0 = "ConcurrentLinkedQueue"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L420
            goto L46e
        L420:
            r7 = 7
            goto L46e
        L422:
            java.lang.String r0 = "String"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L42b
            goto L46e
        L42b:
            r7 = 6
            goto L46e
        L42d:
            java.lang.String r0 = "java.util.LinkedList"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L436
            goto L46e
        L436:
            r7 = 5
            goto L46e
        L438:
            java.lang.String r0 = "HashSet"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L441
            goto L46e
        L441:
            r7 = 4
            goto L46e
        L443:
            java.lang.String r0 = "HashMap"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L44c
            goto L46e
        L44c:
            r7 = 3
            goto L46e
        L44e:
            java.lang.String r0 = "Object"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L457
            goto L46e
        L457:
            r7 = r4
            goto L46e
        L459:
            java.lang.String r0 = "java.io.IOException"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L462
            goto L46e
        L462:
            r7 = r6
            goto L46e
        L464:
            java.lang.String r0 = "java.lang.Integer"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L46d
            goto L46e
        L46d:
            r7 = r5
        L46e:
            switch(r7) {
                case 0: goto L5a1;
                case 1: goto L59e;
                case 2: goto L59b;
                case 3: goto L598;
                case 4: goto L595;
                case 5: goto L592;
                case 6: goto L58f;
                case 7: goto L58c;
                case 8: goto L589;
                case 9: goto L586;
                case 10: goto L598;
                case 11: goto L595;
                case 12: goto L583;
                case 13: goto L580;
                case 14: goto L57d;
                case 15: goto L57a;
                case 16: goto L577;
                case 17: goto L574;
                case 18: goto L571;
                case 19: goto L56e;
                case 20: goto L592;
                case 21: goto L56b;
                case 22: goto L568;
                case 23: goto L561;
                case 24: goto L55a;
                case 25: goto L557;
                case 26: goto L574;
                case 27: goto L554;
                case 28: goto L551;
                case 29: goto L577;
                case 30: goto L54e;
                case 31: goto L54b;
                case 32: goto L548;
                case 33: goto L598;
                case 34: goto L59b;
                case 35: goto L545;
                case 36: goto L542;
                case 37: goto L592;
                case 38: goto L589;
                case 39: goto L57d;
                case 40: goto L57a;
                case 41: goto L53f;
                case 42: goto L56b;
                case 43: goto L53c;
                case 44: goto L571;
                case 45: goto L539;
                case 46: goto L536;
                case 47: goto L533;
                case 48: goto L4a8;
                case 49: goto L583;
                case 50: goto L580;
                case 51: goto L54b;
                case 52: goto L4a5;
                case 53: goto L4a2;
                case 54: goto L49f;
                case 55: goto L554;
                case 56: goto L551;
                case 57: goto L548;
                case 58: goto L498;
                case 59: goto L542;
                case 60: goto L4a2;
                case 61: goto L54e;
                case 62: goto L53c;
                case 63: goto L545;
                case 64: goto L487;
                case 65: goto L484;
                case 66: goto L574;
                case 67: goto L481;
                case 68: goto L47e;
                case 69: goto L47b;
                case 70: goto L59b;
                case 71: goto L481;
                case 72: goto L58f;
                case 73: goto L589;
                case 74: goto L586;
                case 75: goto L53f;
                case 76: goto L478;
                case 77: goto L475;
                case 78: goto L472;
                case 79: goto L533;
                case 80: goto L536;
                default: goto L471;
            }
        L471:
            goto L4aa
        L472:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r8 = com.alibaba.fastjson2.JSONObject.class
            return r8
        L475:
            java.lang.Class<java.lang.String[]> r8 = java.lang.String[].class
            return r8
        L478:
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r8 = java.util.concurrent.ConcurrentHashMap.class
            return r8
        L47b:
            java.lang.Class r8 = com.alibaba.fastjson2.util.TypeUtils.CLASS_SINGLE_SET
            return r8
        L47e:
            java.lang.Class r8 = com.alibaba.fastjson2.util.TypeUtils.CLASS_UNMODIFIABLE_LIST
            return r8
        L481:
            java.lang.Class<java.util.TreeSet> r8 = java.util.TreeSet.class
            return r8
        L484:
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            return r8
        L487:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Integer[] r8 = new java.lang.Integer[]{r8}
            java.util.List r8 = java.util.Arrays.asList(r8)
            java.lang.Class r8 = r8.getClass()
            return r8
        L498:
            java.util.List r8 = java.util.Collections.EMPTY_LIST
            java.lang.Class r8 = r8.getClass()
            return r8
        L49f:
            java.lang.Class<java.util.UUID> r8 = java.util.UUID.class
            return r8
        L4a2:
            java.lang.Class<java.util.List> r8 = java.util.List.class
            return r8
        L4a5:
            java.lang.Class<java.util.Date> r8 = java.util.Date.class
            return r8
        L4a8:
            java.lang.String r8 = "com.alibaba.fastjson.JSONObject"
        L4aa:
            java.util.Map<java.lang.String, java.lang.Class> r0 = com.alibaba.fastjson2.util.TypeUtils.Mapping.TYPE_MAPPINGS
            java.lang.Object r0 = r0.get(r8)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L4b5
            return r0
        L4b5:
            java.lang.String r0 = "java.util.ImmutableCollections$"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L4c5
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.ClassNotFoundException -> L4c2
            return r8
        L4c2:
            java.lang.Class r8 = com.alibaba.fastjson2.util.TypeUtils.CLASS_UNMODIFIABLE_LIST
            return r8
        L4c5:
            char r0 = r8.charAt(r5)
            if (r0 != r1) goto L4da
            int r0 = r8.length()
            int r0 = r0 - r6
            char r0 = r8.charAt(r0)
            if (r0 != r3) goto L4da
            java.lang.String r8 = wb.en.f(r6, r6, r8)
        L4da:
            char r0 = r8.charAt(r5)
            r1 = 91
            if (r0 == r1) goto L50b
            java.lang.String r0 = "[]"
            boolean r0 = r8.endsWith(r0)
            if (r0 == 0) goto L4eb
            goto L50b
        L4eb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            if (r0 == 0) goto L4fa
            java.lang.Class r8 = r0.loadClass(r8)     // Catch: java.lang.ClassNotFoundException -> L4fa
            return r8
        L4fa:
            java.lang.Class<com.alibaba.fastjson2.JSON> r0 = com.alibaba.fastjson2.JSON.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L505
            java.lang.Class r8 = r0.loadClass(r8)     // Catch: java.lang.ClassNotFoundException -> L505
            return r8
        L505:
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.ClassNotFoundException -> L50a
            return r8
        L50a:
            return r2
        L50b:
            char r0 = r8.charAt(r5)
            if (r0 != r1) goto L516
            java.lang.String r0 = r8.substring(r6)
            goto L51a
        L516:
            java.lang.String r0 = wb.en.f(r4, r5, r8)
        L51a:
            java.lang.Class r0 = loadClass(r0)
            if (r0 == 0) goto L529
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r0, r5)
            java.lang.Class r8 = r8.getClass()
            return r8
        L529:
            java.lang.String r0 = "load class error "
            java.lang.String r8 = r0.concat(r8)
            ah.a.w(r8)
            return r2
        L533:
            java.lang.Class<boolean[]> r8 = boolean[].class
            return r8
        L536:
            java.lang.Class<short[]> r8 = short[].class
            return r8
        L539:
            java.lang.Class<java.lang.Object[]> r8 = java.lang.Object[].class
            return r8
        L53c:
            java.lang.Class<int[]> r8 = int[].class
            return r8
        L53f:
            java.lang.Class<double[]> r8 = double[].class
            return r8
        L542:
            java.lang.Class r8 = java.lang.Boolean.TYPE
            return r8
        L545:
            java.lang.Class r8 = java.lang.Short.TYPE
            return r8
        L548:
            java.lang.Class r8 = java.lang.Long.TYPE
            return r8
        L54b:
            java.lang.Class r8 = java.lang.Integer.TYPE
            return r8
        L54e:
            java.lang.Class r8 = java.lang.Float.TYPE
            return r8
        L551:
            java.lang.Class r8 = java.lang.Character.TYPE
            return r8
        L554:
            java.lang.Class r8 = java.lang.Byte.TYPE
            return r8
        L557:
            java.lang.Class<java.util.Calendar> r8 = java.util.Calendar.class
            return r8
        L55a:
            java.util.Set r8 = java.util.Collections.EMPTY_SET
            java.lang.Class r8 = r8.getClass()
            return r8
        L561:
            java.util.Map r8 = java.util.Collections.EMPTY_MAP
            java.lang.Class r8 = r8.getClass()
            return r8
        L568:
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            return r8
        L56b:
            java.lang.Class<float[]> r8 = float[].class
            return r8
        L56e:
            java.lang.Class r8 = com.alibaba.fastjson2.util.TypeUtils.CLASS_SINGLE_LIST
            return r8
        L571:
            java.lang.Class<long[]> r8 = long[].class
            return r8
        L574:
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            return r8
        L577:
            java.lang.Class r8 = java.lang.Double.TYPE
            return r8
        L57a:
            java.lang.Class<char[]> r8 = char[].class
            return r8
        L57d:
            java.lang.Class<byte[]> r8 = byte[].class
            return r8
        L580:
            java.lang.Class<java.util.Set> r8 = java.util.Set.class
            return r8
        L583:
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            return r8
        L586:
            java.lang.Class<java.util.LinkedHashSet> r8 = java.util.LinkedHashSet.class
            return r8
        L589:
            java.lang.Class<java.util.LinkedHashMap> r8 = java.util.LinkedHashMap.class
            return r8
        L58c:
            java.lang.Class<java.util.concurrent.ConcurrentLinkedQueue> r8 = java.util.concurrent.ConcurrentLinkedQueue.class
            return r8
        L58f:
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            return r8
        L592:
            java.lang.Class<java.util.LinkedList> r8 = java.util.LinkedList.class
            return r8
        L595:
            java.lang.Class<java.util.HashSet> r8 = java.util.HashSet.class
            return r8
        L598:
            java.lang.Class<java.util.HashMap> r8 = java.util.HashMap.class
            return r8
        L59b:
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            return r8
        L59e:
            java.lang.Class<java.io.IOException> r8 = java.io.IOException.class
            return r8
        L5a1:
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            return r8
    }

    public static <T> T newProxyInstance(java.lang.Class<T> r1, com.alibaba.fastjson2.JSONObject r2) {
            java.lang.ClassLoader r0 = r1.getClassLoader()
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.Object r1 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)
            return r1
    }

    public static java.lang.Class nonePrimitive(java.lang.Class r2) {
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L62
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "double"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L60
            java.lang.String r1 = "int"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5d
            java.lang.String r1 = "byte"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5a
            java.lang.String r1 = "char"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L57
            java.lang.String r1 = "long"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L54
            java.lang.String r1 = "boolean"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L51
            java.lang.String r1 = "float"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4e
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L62
        L4b:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            return r2
        L4e:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            return r2
        L51:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            return r2
        L54:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
        L57:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            return r2
        L5a:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            return r2
        L5d:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            return r2
        L60:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
        L62:
            return r2
    }

    public static java.math.BigDecimal parseBigDecimal(byte[] r23, int r24, int r25) {
            r0 = r25
            if (r23 == 0) goto L90
            if (r0 != 0) goto L8
            goto L90
        L8:
            r1 = r23[r24]
            r2 = 45
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L14
            int r1 = r24 + 1
            r2 = r4
            goto L17
        L14:
            r1 = r24
            r2 = r3
        L17:
            r5 = 20
            if (r0 <= r5) goto L21
            if (r2 == 0) goto L7b
            r5 = 21
            if (r0 != r5) goto L7b
        L21:
            int r5 = r24 + r0
            r6 = -1
            r9 = r3
            r12 = r6
            r10 = 0
        L28:
            if (r1 >= r5) goto L34
            r13 = r23[r1]
            r14 = 46
            if (r13 != r14) goto L3b
            int r9 = r9 + 1
            if (r9 <= r4) goto L37
        L34:
            r16 = 0
            goto L66
        L37:
            r12 = r1
            r16 = 0
            goto L63
        L3b:
            r14 = -1
            r16 = 0
            r7 = 48
            if (r13 < r7) goto L5c
            r7 = 57
            if (r13 > r7) goto L5c
            r7 = 10
            long r18 = r10 * r7
            long r20 = r10 | r7
            r22 = 31
            long r20 = r20 >>> r22
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 == 0) goto L5e
            long r7 = r18 / r7
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L5c
            goto L5e
        L5c:
            r10 = r14
            goto L66
        L5e:
            int r13 = r13 + (-48)
            long r7 = (long) r13
            long r10 = r18 + r7
        L63:
            int r1 = r1 + 1
            goto L28
        L66:
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 < 0) goto L7b
            if (r9 > r4) goto L7b
            if (r2 == 0) goto L6f
            long r10 = -r10
        L6f:
            if (r12 == r6) goto L76
            int r12 = r12 - r24
            int r0 = r0 - r12
            int r3 = r0 + (-1)
        L76:
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r10, r3)
            return r0
        L7b:
            char[] r1 = new char[r0]
            r2 = r3
        L7e:
            if (r2 >= r0) goto L8a
            int r4 = r24 + r2
            r4 = r23[r4]
            char r4 = (char) r4
            r1[r2] = r4
            int r2 = r2 + 1
            goto L7e
        L8a:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r1, r3, r0)
            return r2
        L90:
            r0 = 0
            return r0
    }

    public static java.math.BigDecimal parseBigDecimal(char[] r24, int r25, int r26) {
            r0 = r24
            r1 = r25
            r2 = r26
            if (r0 == 0) goto L81
            if (r2 != 0) goto Lc
            goto L81
        Lc:
            char r3 = r0[r1]
            r4 = 45
            r6 = 1
            if (r3 != r4) goto L17
            int r3 = r1 + 1
            r4 = r6
            goto L19
        L17:
            r3 = r1
            r4 = 0
        L19:
            r7 = 20
            if (r2 <= r7) goto L23
            if (r4 == 0) goto L7b
            r7 = 21
            if (r2 != r7) goto L7b
        L23:
            int r7 = r1 + r2
            r8 = -1
            r9 = 0
            r14 = r8
            r12 = r9
            r11 = 0
        L2b:
            if (r3 >= r7) goto L64
            char r15 = r0[r3]
            r5 = 46
            if (r15 != r5) goto L3a
            int r11 = r11 + 1
            if (r11 <= r6) goto L38
            goto L64
        L38:
            r14 = r3
            goto L61
        L3a:
            r16 = -1
            r5 = 48
            if (r15 < r5) goto L59
            r5 = 57
            if (r15 > r5) goto L59
            r18 = 10
            long r20 = r12 * r18
            long r22 = r12 | r18
            r5 = 31
            long r22 = r22 >>> r5
            int r5 = (r22 > r9 ? 1 : (r22 == r9 ? 0 : -1))
            if (r5 == 0) goto L5c
            long r18 = r20 / r18
            int r5 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r5 != 0) goto L59
            goto L5c
        L59:
            r12 = r16
            goto L64
        L5c:
            int r15 = r15 + (-48)
            long r12 = (long) r15
            long r12 = r20 + r12
        L61:
            int r3 = r3 + 1
            goto L2b
        L64:
            int r3 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r3 < 0) goto L7b
            if (r11 > r6) goto L7b
            if (r4 == 0) goto L6d
            long r12 = -r12
        L6d:
            if (r14 == r8) goto L75
            int r14 = r14 - r1
            int r0 = r2 - r14
            int r5 = r0 + (-1)
            goto L76
        L75:
            r5 = 0
        L76:
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r12, r5)
            return r0
        L7b:
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r0, r1, r2)
            return r3
        L81:
            r0 = 0
            return r0
    }

    public static java.lang.Boolean parseBoolean(byte[] r3, int r4, int r5) {
            if (r5 == 0) goto L7c
            r0 = 1
            if (r5 == r0) goto L54
            r0 = 101(0x65, float:1.42E-43)
            r1 = 4
            if (r5 == r1) goto L35
            r1 = 5
            if (r5 == r1) goto Le
            goto L68
        Le:
            r1 = r3[r4]
            r2 = 102(0x66, float:1.43E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 1
            r1 = r3[r1]
            r2 = 97
            if (r1 != r2) goto L68
            int r1 = r4 + 2
            r1 = r3[r1]
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 3
            r1 = r3[r1]
            r2 = 115(0x73, float:1.61E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 4
            r1 = r3[r1]
            if (r1 != r0) goto L68
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L35:
            r1 = r3[r4]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 1
            r1 = r3[r1]
            r2 = 114(0x72, float:1.6E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 2
            r1 = r3[r1]
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 3
            r1 = r3[r1]
            if (r1 != r0) goto L68
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L54:
            r0 = r3[r4]
            r1 = 49
            if (r0 == r1) goto L79
            r1 = 89
            if (r0 != r1) goto L5f
            goto L79
        L5f:
            r1 = 48
            if (r0 == r1) goto L76
            r1 = 78
            if (r0 != r1) goto L68
            goto L76
        L68:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r4, r5)
            boolean r3 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L76:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L79:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L7c:
            r3 = 0
            return r3
    }

    public static java.lang.Boolean parseBoolean(char[] r3, int r4, int r5) {
            if (r5 == 0) goto L7c
            r0 = 1
            if (r5 == r0) goto L54
            r0 = 101(0x65, float:1.42E-43)
            r1 = 4
            if (r5 == r1) goto L35
            r1 = 5
            if (r5 == r1) goto Le
            goto L68
        Le:
            char r1 = r3[r4]
            r2 = 102(0x66, float:1.43E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 1
            char r1 = r3[r1]
            r2 = 97
            if (r1 != r2) goto L68
            int r1 = r4 + 2
            char r1 = r3[r1]
            r2 = 108(0x6c, float:1.51E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 3
            char r1 = r3[r1]
            r2 = 115(0x73, float:1.61E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 4
            char r1 = r3[r1]
            if (r1 != r0) goto L68
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L35:
            char r1 = r3[r4]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 1
            char r1 = r3[r1]
            r2 = 114(0x72, float:1.6E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 2
            char r1 = r3[r1]
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L68
            int r1 = r4 + 3
            char r1 = r3[r1]
            if (r1 != r0) goto L68
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L54:
            char r0 = r3[r4]
            r1 = 49
            if (r0 == r1) goto L79
            r1 = 89
            if (r0 != r1) goto L5f
            goto L79
        L5f:
            r1 = 48
            if (r0 == r1) goto L76
            r1 = 78
            if (r0 != r1) goto L68
            goto L76
        L68:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r4, r5)
            boolean r3 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L76:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L79:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L7c:
            r3 = 0
            return r3
    }

    public static double parseDouble(byte[] r21, int r22, int r23) {
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r1 + r2
            if (r2 == 0) goto L117
            r4 = r0[r1]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r5 = 45
            r6 = 43
            if (r4 == r6) goto L1a
            if (r4 == r5) goto L18
            r9 = r1
            r4 = 0
            r10 = 0
            goto L1e
        L18:
            r4 = 1
            goto L1b
        L1a:
            r4 = 0
        L1b:
            int r9 = r1 + 1
            r10 = 1
        L1e:
            char[] r11 = new char[r2]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r12 = 0
            r13 = 0
            r14 = 0
        L23:
            java.lang.String r15 = "multiple points"
            r16 = 1
            r7 = 46
            r8 = 48
            if (r9 >= r3) goto L4c
            r5 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            if (r5 != r8) goto L34
            int r12 = r12 + 1
            goto L41
        L34:
            if (r5 != r7) goto L4c
            if (r13 != 0) goto L46
            int r5 = r9 - r1
            if (r10 == 0) goto L3e
            int r5 = r5 + (-1)
        L3e:
            r14 = r5
            r13 = r16
        L41:
            int r9 = r9 + 1
            r5 = 45
            goto L23
        L46:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r3.<init>(r15)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
        L4c:
            r5 = 0
            r19 = 0
        L4f:
            r6 = 57
            if (r9 >= r3) goto L90
            r7 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r8 = 49
            if (r7 < r8) goto L66
            if (r7 > r6) goto L66
            int r6 = r5 + 1
            char r7 = (char) r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r11[r5] = r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r5 = r6
            r8 = 46
            r19 = 0
            goto L84
        L66:
            r8 = 48
            if (r7 != r8) goto L75
            int r6 = r5 + 1
            char r7 = (char) r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r11[r5] = r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            int r19 = r19 + 1
            r5 = r6
            r8 = 46
            goto L84
        L75:
            r8 = 46
            if (r7 != r8) goto L90
            if (r13 != 0) goto L8a
            int r6 = r9 - r1
            if (r10 == 0) goto L81
            int r6 = r6 + (-1)
        L81:
            r14 = r6
            r13 = r16
        L84:
            int r9 = r9 + 1
            r7 = r8
            r8 = 48
            goto L4f
        L8a:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r3.<init>(r15)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
        L90:
            int r5 = r5 - r19
            if (r5 != 0) goto L97
            r7 = r16
            goto L98
        L97:
            r7 = 0
        L98:
            if (r7 == 0) goto L9c
            if (r12 == 0) goto L11f
        L9c:
            if (r13 == 0) goto La0
            int r14 = r14 - r12
            goto La2
        La0:
            int r14 = r5 + r19
        La2:
            if (r9 >= r3) goto Laf
            r8 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r10 = 101(0x65, float:1.42E-43)
            if (r8 == r10) goto Lb2
            r10 = 69
            if (r8 != r10) goto Laf
            goto Lb2
        Laf:
            r18 = r7
            goto L102
        Lb2:
            int r8 = r9 + 1
            r10 = r0[r8]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r12 = 43
            if (r10 == r12) goto Lc3
            r12 = 45
            if (r10 == r12) goto Lc1
            r9 = r16
            goto Lcc
        Lc1:
            r8 = -1
            goto Lc5
        Lc3:
            r8 = r16
        Lc5:
            int r9 = r9 + 2
            r20 = r9
            r9 = r8
            r8 = r20
        Lcc:
            r12 = r8
            r10 = 0
            r17 = 0
        Ld0:
            if (r12 >= r3) goto Lee
            r13 = 214748364(0xccccccc, float:3.1554434E-31)
            if (r10 < r13) goto Ld9
            r17 = r16
        Ld9:
            int r13 = r12 + 1
            r15 = r0[r12]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            r18 = r7
            r7 = 48
            if (r15 < r7) goto Lf0
            if (r15 > r6) goto Lf0
            int r10 = r10 * 10
            int r15 = r15 + (-48)
            int r10 = r10 + r15
            r12 = r13
            r7 = r18
            goto Ld0
        Lee:
            r18 = r7
        Lf0:
            int r6 = r5 + 324
            int r6 = r6 + r19
            if (r17 != 0) goto Lfd
            if (r10 <= r6) goto Lf9
            goto Lfd
        Lf9:
            int r9 = r9 * r10
            int r9 = r9 + r14
        Lfb:
            r14 = r9
            goto Lff
        Lfd:
            int r9 = r9 * r6
            goto Lfb
        Lff:
            if (r12 == r8) goto L11f
            r9 = r12
        L102:
            if (r9 >= r3) goto L108
            int r3 = r3 + (-1)
            if (r9 != r3) goto L11f
        L108:
            if (r18 == 0) goto L112
            if (r4 == 0) goto L10f
            r0 = -9223372036854775808
            return r0
        L10f:
            r0 = 0
            return r0
        L112:
            double r0 = doubleValue(r4, r14, r11, r5)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            return r0
        L117:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            java.lang.String r4 = "empty String"
            r3.<init>(r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11f
        L11f:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1, r2)
            ah.a.u(r3)
            r0 = 0
            return r0
    }

    public static double parseDouble(char[] r21, int r22, int r23) {
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r1 + r2
            if (r2 == 0) goto L115
            char r4 = r0[r1]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            r5 = 45
            r6 = 43
            if (r4 == r6) goto L1a
            if (r4 == r5) goto L18
            r9 = r1
            r4 = 0
            r10 = 0
            goto L1e
        L18:
            r4 = 1
            goto L1b
        L1a:
            r4 = 0
        L1b:
            int r9 = r1 + 1
            r10 = 1
        L1e:
            char[] r11 = new char[r2]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            r12 = 0
            r13 = 0
            r14 = 0
        L23:
            java.lang.String r15 = "multiple points"
            r16 = 1
            r7 = 46
            r8 = 48
            if (r9 >= r3) goto L4c
            char r5 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            if (r5 != r8) goto L34
            int r12 = r12 + 1
            goto L41
        L34:
            if (r5 != r7) goto L4c
            if (r13 != 0) goto L46
            int r5 = r9 - r1
            if (r10 == 0) goto L3e
            int r5 = r5 + (-1)
        L3e:
            r14 = r5
            r13 = r16
        L41:
            int r9 = r9 + 1
            r5 = 45
            goto L23
        L46:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            r3.<init>(r15)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
        L4c:
            r5 = 0
            r19 = 0
        L4f:
            r6 = 57
            if (r9 >= r3) goto L8e
            char r7 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            r8 = 49
            if (r7 < r8) goto L65
            if (r7 > r6) goto L65
            int r6 = r5 + 1
            r11[r5] = r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            r5 = r6
            r8 = 46
            r19 = 0
            goto L82
        L65:
            r8 = 48
            if (r7 != r8) goto L73
            int r6 = r5 + 1
            r11[r5] = r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            int r19 = r19 + 1
            r5 = r6
            r8 = 46
            goto L82
        L73:
            r8 = 46
            if (r7 != r8) goto L8e
            if (r13 != 0) goto L88
            int r6 = r9 - r1
            if (r10 == 0) goto L7f
            int r6 = r6 + (-1)
        L7f:
            r14 = r6
            r13 = r16
        L82:
            int r9 = r9 + 1
            r7 = r8
            r8 = 48
            goto L4f
        L88:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            r3.<init>(r15)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
        L8e:
            int r5 = r5 - r19
            if (r5 != 0) goto L95
            r7 = r16
            goto L96
        L95:
            r7 = 0
        L96:
            if (r7 == 0) goto L9a
            if (r12 == 0) goto L11d
        L9a:
            if (r13 == 0) goto L9e
            int r14 = r14 - r12
            goto La0
        L9e:
            int r14 = r5 + r19
        La0:
            if (r9 >= r3) goto Lad
            char r8 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            r10 = 101(0x65, float:1.42E-43)
            if (r8 == r10) goto Lb0
            r10 = 69
            if (r8 != r10) goto Lad
            goto Lb0
        Lad:
            r18 = r7
            goto L100
        Lb0:
            int r8 = r9 + 1
            char r10 = r0[r8]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            r12 = 43
            if (r10 == r12) goto Lc1
            r12 = 45
            if (r10 == r12) goto Lbf
            r9 = r16
            goto Lca
        Lbf:
            r8 = -1
            goto Lc3
        Lc1:
            r8 = r16
        Lc3:
            int r9 = r9 + 2
            r20 = r9
            r9 = r8
            r8 = r20
        Lca:
            r12 = r8
            r10 = 0
            r17 = 0
        Lce:
            if (r12 >= r3) goto Lec
            r13 = 214748364(0xccccccc, float:3.1554434E-31)
            if (r10 < r13) goto Ld7
            r17 = r16
        Ld7:
            int r13 = r12 + 1
            char r15 = r0[r12]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            r18 = r7
            r7 = 48
            if (r15 < r7) goto Lee
            if (r15 > r6) goto Lee
            int r10 = r10 * 10
            int r15 = r15 + (-48)
            int r10 = r10 + r15
            r12 = r13
            r7 = r18
            goto Lce
        Lec:
            r18 = r7
        Lee:
            int r6 = r5 + 324
            int r6 = r6 + r19
            if (r17 != 0) goto Lfb
            if (r10 <= r6) goto Lf7
            goto Lfb
        Lf7:
            int r9 = r9 * r10
            int r9 = r9 + r14
        Lf9:
            r14 = r9
            goto Lfd
        Lfb:
            int r9 = r9 * r6
            goto Lf9
        Lfd:
            if (r12 == r8) goto L11d
            r9 = r12
        L100:
            if (r9 >= r3) goto L106
            int r3 = r3 + (-1)
            if (r9 != r3) goto L11d
        L106:
            if (r18 == 0) goto L110
            if (r4 == 0) goto L10d
            r0 = -9223372036854775808
            return r0
        L10d:
            r0 = 0
            return r0
        L110:
            double r0 = doubleValue(r4, r14, r11, r5)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            return r0
        L115:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            java.lang.String r4 = "empty String"
            r3.<init>(r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11d
        L11d:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1, r2)
            ah.a.u(r3)
            r0 = 0
            return r0
    }

    public static float parseFloat(byte[] r21, int r22, int r23) {
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r1 + r2
            if (r2 == 0) goto L116
            r4 = r0[r1]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r5 = 45
            r6 = 43
            if (r4 == r6) goto L1a
            if (r4 == r5) goto L18
            r9 = r1
            r4 = 0
            r10 = 0
            goto L1e
        L18:
            r4 = 1
            goto L1b
        L1a:
            r4 = 0
        L1b:
            int r9 = r1 + 1
            r10 = 1
        L1e:
            char[] r11 = new char[r2]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r12 = 0
            r13 = 0
            r14 = 0
        L23:
            java.lang.String r15 = "multiple points"
            r16 = 1
            r7 = 46
            r8 = 48
            if (r9 >= r3) goto L4c
            r5 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            if (r5 != r8) goto L34
            int r12 = r12 + 1
            goto L41
        L34:
            if (r5 != r7) goto L4c
            if (r13 != 0) goto L46
            int r5 = r9 - r1
            if (r10 == 0) goto L3e
            int r5 = r5 + (-1)
        L3e:
            r14 = r5
            r13 = r16
        L41:
            int r9 = r9 + 1
            r5 = 45
            goto L23
        L46:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r3.<init>(r15)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
        L4c:
            r5 = 0
            r19 = 0
        L4f:
            r6 = 57
            if (r9 >= r3) goto L90
            r7 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r8 = 49
            if (r7 < r8) goto L66
            if (r7 > r6) goto L66
            int r6 = r5 + 1
            char r7 = (char) r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r11[r5] = r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r5 = r6
            r8 = 46
            r19 = 0
            goto L84
        L66:
            r8 = 48
            if (r7 != r8) goto L75
            int r6 = r5 + 1
            char r7 = (char) r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r11[r5] = r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            int r19 = r19 + 1
            r5 = r6
            r8 = 46
            goto L84
        L75:
            r8 = 46
            if (r7 != r8) goto L90
            if (r13 != 0) goto L8a
            int r6 = r9 - r1
            if (r10 == 0) goto L81
            int r6 = r6 + (-1)
        L81:
            r14 = r6
            r13 = r16
        L84:
            int r9 = r9 + 1
            r7 = r8
            r8 = 48
            goto L4f
        L8a:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r3.<init>(r15)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
        L90:
            int r5 = r5 - r19
            if (r5 != 0) goto L97
            r7 = r16
            goto L98
        L97:
            r7 = 0
        L98:
            if (r7 == 0) goto L9c
            if (r12 == 0) goto L11e
        L9c:
            if (r13 == 0) goto La0
            int r14 = r14 - r12
            goto La2
        La0:
            int r14 = r5 + r19
        La2:
            if (r9 >= r3) goto Laf
            r8 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r10 = 101(0x65, float:1.42E-43)
            if (r8 == r10) goto Lb2
            r10 = 69
            if (r8 != r10) goto Laf
            goto Lb2
        Laf:
            r18 = r7
            goto L102
        Lb2:
            int r8 = r9 + 1
            r10 = r0[r8]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r12 = 43
            if (r10 == r12) goto Lc3
            r12 = 45
            if (r10 == r12) goto Lc1
            r9 = r16
            goto Lcc
        Lc1:
            r8 = -1
            goto Lc5
        Lc3:
            r8 = r16
        Lc5:
            int r9 = r9 + 2
            r20 = r9
            r9 = r8
            r8 = r20
        Lcc:
            r12 = r8
            r10 = 0
            r17 = 0
        Ld0:
            if (r12 >= r3) goto Lee
            r13 = 214748364(0xccccccc, float:3.1554434E-31)
            if (r10 < r13) goto Ld9
            r17 = r16
        Ld9:
            int r13 = r12 + 1
            r15 = r0[r12]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            r18 = r7
            r7 = 48
            if (r15 < r7) goto Lf0
            if (r15 > r6) goto Lf0
            int r10 = r10 * 10
            int r15 = r15 + (-48)
            int r10 = r10 + r15
            r12 = r13
            r7 = r18
            goto Ld0
        Lee:
            r18 = r7
        Lf0:
            int r6 = r5 + 324
            int r6 = r6 + r19
            if (r17 != 0) goto Lfd
            if (r10 <= r6) goto Lf9
            goto Lfd
        Lf9:
            int r9 = r9 * r10
            int r9 = r9 + r14
        Lfb:
            r14 = r9
            goto Lff
        Lfd:
            int r9 = r9 * r6
            goto Lfb
        Lff:
            if (r12 == r8) goto L11e
            r9 = r12
        L102:
            if (r9 >= r3) goto L108
            int r3 = r3 + (-1)
            if (r9 != r3) goto L11e
        L108:
            if (r18 == 0) goto L111
            if (r4 == 0) goto L10f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        L10f:
            r0 = 0
            return r0
        L111:
            float r0 = floatValue(r4, r14, r11, r5)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            return r0
        L116:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            java.lang.String r4 = "empty String"
            r3.<init>(r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11e
        L11e:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1, r2)
            ah.a.u(r3)
            r0 = 0
            return r0
    }

    public static float parseFloat(char[] r21, int r22, int r23) {
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r1 + r2
            if (r2 == 0) goto L114
            char r4 = r0[r1]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            r5 = 45
            r6 = 43
            if (r4 == r6) goto L1a
            if (r4 == r5) goto L18
            r9 = r1
            r4 = 0
            r10 = 0
            goto L1e
        L18:
            r4 = 1
            goto L1b
        L1a:
            r4 = 0
        L1b:
            int r9 = r1 + 1
            r10 = 1
        L1e:
            char[] r11 = new char[r2]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            r12 = 0
            r13 = 0
            r14 = 0
        L23:
            java.lang.String r15 = "multiple points"
            r16 = 1
            r7 = 46
            r8 = 48
            if (r9 >= r3) goto L4c
            char r5 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            if (r5 != r8) goto L34
            int r12 = r12 + 1
            goto L41
        L34:
            if (r5 != r7) goto L4c
            if (r13 != 0) goto L46
            int r5 = r9 - r1
            if (r10 == 0) goto L3e
            int r5 = r5 + (-1)
        L3e:
            r14 = r5
            r13 = r16
        L41:
            int r9 = r9 + 1
            r5 = 45
            goto L23
        L46:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            r3.<init>(r15)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
        L4c:
            r5 = 0
            r19 = 0
        L4f:
            r6 = 57
            if (r9 >= r3) goto L8e
            char r7 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            r8 = 49
            if (r7 < r8) goto L65
            if (r7 > r6) goto L65
            int r6 = r5 + 1
            r11[r5] = r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            r5 = r6
            r8 = 46
            r19 = 0
            goto L82
        L65:
            r8 = 48
            if (r7 != r8) goto L73
            int r6 = r5 + 1
            r11[r5] = r7     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            int r19 = r19 + 1
            r5 = r6
            r8 = 46
            goto L82
        L73:
            r8 = 46
            if (r7 != r8) goto L8e
            if (r13 != 0) goto L88
            int r6 = r9 - r1
            if (r10 == 0) goto L7f
            int r6 = r6 + (-1)
        L7f:
            r14 = r6
            r13 = r16
        L82:
            int r9 = r9 + 1
            r7 = r8
            r8 = 48
            goto L4f
        L88:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            r3.<init>(r15)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
        L8e:
            int r5 = r5 - r19
            if (r5 != 0) goto L95
            r7 = r16
            goto L96
        L95:
            r7 = 0
        L96:
            if (r7 == 0) goto L9a
            if (r12 == 0) goto L11c
        L9a:
            if (r13 == 0) goto L9e
            int r14 = r14 - r12
            goto La0
        L9e:
            int r14 = r5 + r19
        La0:
            if (r9 >= r3) goto Lad
            char r8 = r0[r9]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            r10 = 101(0x65, float:1.42E-43)
            if (r8 == r10) goto Lb0
            r10 = 69
            if (r8 != r10) goto Lad
            goto Lb0
        Lad:
            r18 = r7
            goto L100
        Lb0:
            int r8 = r9 + 1
            char r10 = r0[r8]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            r12 = 43
            if (r10 == r12) goto Lc1
            r12 = 45
            if (r10 == r12) goto Lbf
            r9 = r16
            goto Lca
        Lbf:
            r8 = -1
            goto Lc3
        Lc1:
            r8 = r16
        Lc3:
            int r9 = r9 + 2
            r20 = r9
            r9 = r8
            r8 = r20
        Lca:
            r12 = r8
            r10 = 0
            r17 = 0
        Lce:
            if (r12 >= r3) goto Lec
            r13 = 214748364(0xccccccc, float:3.1554434E-31)
            if (r10 < r13) goto Ld7
            r17 = r16
        Ld7:
            int r13 = r12 + 1
            char r15 = r0[r12]     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            r18 = r7
            r7 = 48
            if (r15 < r7) goto Lee
            if (r15 > r6) goto Lee
            int r10 = r10 * 10
            int r15 = r15 + (-48)
            int r10 = r10 + r15
            r12 = r13
            r7 = r18
            goto Lce
        Lec:
            r18 = r7
        Lee:
            int r6 = r5 + 324
            int r6 = r6 + r19
            if (r17 != 0) goto Lfb
            if (r10 <= r6) goto Lf7
            goto Lfb
        Lf7:
            int r9 = r9 * r10
            int r9 = r9 + r14
        Lf9:
            r14 = r9
            goto Lfd
        Lfb:
            int r9 = r9 * r6
            goto Lf9
        Lfd:
            if (r12 == r8) goto L11c
            r9 = r12
        L100:
            if (r9 >= r3) goto L106
            int r3 = r3 + (-1)
            if (r9 != r3) goto L11c
        L106:
            if (r18 == 0) goto L10f
            if (r4 == 0) goto L10d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        L10d:
            r0 = 0
            return r0
        L10f:
            float r0 = floatValue(r4, r14, r11, r5)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            return r0
        L114:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            java.lang.String r4 = "empty String"
            r3.<init>(r4)     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
            throw r3     // Catch: java.lang.StringIndexOutOfBoundsException -> L11c
        L11c:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1, r2)
            ah.a.u(r3)
            r0 = 0
            return r0
    }

    public static int parseInt(byte[] r19, int r20, int r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 1000000(0xf4240, float:1.401298E-39)
            r4 = 100000(0x186a0, float:1.4013E-40)
            r5 = 10000(0x2710, float:1.4013E-41)
            r9 = 57
            r10 = 48
            switch(r2) {
                case 1: goto L1c0;
                case 2: goto L1aa;
                case 3: goto L186;
                case 4: goto L156;
                case 5: goto L119;
                case 6: goto Ld0;
                case 7: goto L7b;
                case 8: goto L17;
                default: goto L15;
            }
        L15:
            goto L1c8
        L17:
            r11 = r0[r1]
            int r12 = r1 + 1
            r12 = r0[r12]
            int r13 = r1 + 2
            r13 = r0[r13]
            int r14 = r1 + 3
            r14 = r0[r14]
            int r15 = r1 + 4
            r15 = r0[r15]
            int r16 = r1 + 5
            r8 = r0[r16]
            int r16 = r1 + 6
            r7 = r0[r16]
            int r16 = r1 + 7
            r6 = r0[r16]
            if (r11 < r10) goto L1c8
            if (r11 > r9) goto L1c8
            if (r12 < r10) goto L1c8
            if (r12 > r9) goto L1c8
            if (r13 < r10) goto L1c8
            if (r13 > r9) goto L1c8
            if (r14 < r10) goto L1c8
            if (r14 > r9) goto L1c8
            if (r15 < r10) goto L1c8
            if (r15 > r9) goto L1c8
            if (r8 < r10) goto L1c8
            if (r8 > r9) goto L1c8
            if (r7 < r10) goto L1c8
            if (r7 > r9) goto L1c8
            if (r6 < r10) goto L1c8
            if (r6 > r9) goto L1c8
            int r11 = r11 - r10
            r0 = 10000000(0x989680, float:1.4012985E-38)
            int r11 = r11 * r0
            int r0 = p.a.z(r12, r10, r3, r11)
            int r0 = p.a.z(r13, r10, r4, r0)
            int r0 = p.a.z(r14, r10, r5, r0)
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = p.a.z(r15, r10, r1, r0)
            r1 = 100
            int r0 = p.a.z(r8, r10, r1, r0)
            r1 = 10
            int r0 = p.a.z(r7, r10, r1, r0)
        L78:
            int r6 = r6 - r10
            int r6 = r6 + r0
            return r6
        L7b:
            r6 = r0[r1]
            int r7 = r1 + 1
            r7 = r0[r7]
            int r8 = r1 + 2
            r8 = r0[r8]
            int r11 = r1 + 3
            r11 = r0[r11]
            int r12 = r1 + 4
            r12 = r0[r12]
            int r13 = r1 + 5
            r13 = r0[r13]
            int r14 = r1 + 6
            r14 = r0[r14]
            if (r6 < r10) goto L1c8
            if (r6 > r9) goto L1c8
            if (r7 < r10) goto L1c8
            if (r7 > r9) goto L1c8
            if (r8 < r10) goto L1c8
            if (r8 > r9) goto L1c8
            if (r11 < r10) goto L1c8
            if (r11 > r9) goto L1c8
            if (r12 < r10) goto L1c8
            if (r12 > r9) goto L1c8
            if (r13 < r10) goto L1c8
            if (r13 > r9) goto L1c8
            if (r14 < r10) goto L1c8
            if (r14 > r9) goto L1c8
            int r6 = r6 - r10
            int r6 = r6 * r3
            int r0 = p.a.z(r7, r10, r4, r6)
            int r0 = p.a.z(r8, r10, r5, r0)
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = p.a.z(r11, r10, r1, r0)
            r1 = 100
            int r0 = p.a.z(r12, r10, r1, r0)
            r1 = 10
            int r0 = p.a.z(r13, r10, r1, r0)
            int r14 = r14 - r10
            int r14 = r14 + r0
            return r14
        Ld0:
            r3 = r0[r1]
            int r6 = r1 + 1
            r6 = r0[r6]
            int r7 = r1 + 2
            r7 = r0[r7]
            int r8 = r1 + 3
            r8 = r0[r8]
            int r11 = r1 + 4
            r11 = r0[r11]
            int r12 = r1 + 5
            r12 = r0[r12]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            if (r6 < r10) goto L1c8
            if (r6 > r9) goto L1c8
            if (r7 < r10) goto L1c8
            if (r7 > r9) goto L1c8
            if (r8 < r10) goto L1c8
            if (r8 > r9) goto L1c8
            if (r11 < r10) goto L1c8
            if (r11 > r9) goto L1c8
            if (r12 < r10) goto L1c8
            if (r12 > r9) goto L1c8
            int r3 = r3 - r10
            int r3 = r3 * r4
            int r0 = p.a.z(r6, r10, r5, r3)
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = p.a.z(r7, r10, r1, r0)
            r1 = 100
            int r0 = p.a.z(r8, r10, r1, r0)
            r1 = 10
            int r0 = p.a.z(r11, r10, r1, r0)
            int r12 = r12 - r10
            int r12 = r12 + r0
            return r12
        L119:
            r3 = r0[r1]
            int r4 = r1 + 1
            r4 = r0[r4]
            int r6 = r1 + 2
            r6 = r0[r6]
            int r7 = r1 + 3
            r7 = r0[r7]
            int r8 = r1 + 4
            r8 = r0[r8]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            if (r4 < r10) goto L1c8
            if (r4 > r9) goto L1c8
            if (r6 < r10) goto L1c8
            if (r6 > r9) goto L1c8
            if (r7 < r10) goto L1c8
            if (r7 > r9) goto L1c8
            if (r8 < r10) goto L1c8
            if (r8 > r9) goto L1c8
            int r3 = r3 - r10
            int r3 = r3 * r5
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = p.a.z(r4, r10, r1, r3)
            r1 = 100
            int r0 = p.a.z(r6, r10, r1, r0)
            r1 = 10
            int r0 = p.a.z(r7, r10, r1, r0)
            int r8 = r8 - r10
            int r8 = r8 + r0
            return r8
        L156:
            r3 = r0[r1]
            int r4 = r1 + 1
            r4 = r0[r4]
            int r5 = r1 + 2
            r5 = r0[r5]
            int r6 = r1 + 3
            r6 = r0[r6]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            if (r4 < r10) goto L1c8
            if (r4 > r9) goto L1c8
            if (r5 < r10) goto L1c8
            if (r5 > r9) goto L1c8
            if (r6 < r10) goto L1c8
            if (r6 > r9) goto L1c8
            int r3 = r3 - r10
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = r3 * r1
            r1 = 100
            int r0 = p.a.z(r4, r10, r1, r3)
            r1 = 10
            int r0 = p.a.z(r5, r10, r1, r0)
            goto L78
        L186:
            r3 = r0[r1]
            int r4 = r1 + 1
            r4 = r0[r4]
            int r5 = r1 + 2
            r5 = r0[r5]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            if (r4 < r10) goto L1c8
            if (r4 > r9) goto L1c8
            if (r5 < r10) goto L1c8
            if (r5 > r9) goto L1c8
            int r3 = r3 - r10
            r18 = 100
            int r3 = r3 * 100
            r1 = 10
            int r0 = p.a.z(r4, r10, r1, r3)
            int r5 = r5 - r10
            int r5 = r5 + r0
            return r5
        L1aa:
            r3 = r0[r1]
            int r4 = r1 + 1
            r4 = r0[r4]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            if (r4 < r10) goto L1c8
            if (r4 > r9) goto L1c8
            int r3 = r3 - r10
            r17 = 10
            int r3 = r3 * 10
            int r4 = r4 - r10
            int r4 = r4 + r3
            return r4
        L1c0:
            r3 = r0[r1]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            int r3 = r3 - r10
            return r3
        L1c8:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1, r2)
            int r0 = java.lang.Integer.parseInt(r3)
            return r0
    }

    public static int parseInt(char[] r19, int r20, int r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = 1000000(0xf4240, float:1.401298E-39)
            r4 = 100000(0x186a0, float:1.4013E-40)
            r5 = 10000(0x2710, float:1.4013E-41)
            r9 = 57
            r10 = 48
            switch(r2) {
                case 1: goto L1c0;
                case 2: goto L1aa;
                case 3: goto L186;
                case 4: goto L156;
                case 5: goto L119;
                case 6: goto Ld0;
                case 7: goto L7b;
                case 8: goto L17;
                default: goto L15;
            }
        L15:
            goto L1c8
        L17:
            char r11 = r0[r1]
            int r12 = r1 + 1
            char r12 = r0[r12]
            int r13 = r1 + 2
            char r13 = r0[r13]
            int r14 = r1 + 3
            char r14 = r0[r14]
            int r15 = r1 + 4
            char r15 = r0[r15]
            int r16 = r1 + 5
            char r8 = r0[r16]
            int r16 = r1 + 6
            char r7 = r0[r16]
            int r16 = r1 + 7
            char r6 = r0[r16]
            if (r11 < r10) goto L1c8
            if (r11 > r9) goto L1c8
            if (r12 < r10) goto L1c8
            if (r12 > r9) goto L1c8
            if (r13 < r10) goto L1c8
            if (r13 > r9) goto L1c8
            if (r14 < r10) goto L1c8
            if (r14 > r9) goto L1c8
            if (r15 < r10) goto L1c8
            if (r15 > r9) goto L1c8
            if (r8 < r10) goto L1c8
            if (r8 > r9) goto L1c8
            if (r7 < r10) goto L1c8
            if (r7 > r9) goto L1c8
            if (r6 < r10) goto L1c8
            if (r6 > r9) goto L1c8
            int r11 = r11 - r10
            r0 = 10000000(0x989680, float:1.4012985E-38)
            int r11 = r11 * r0
            int r0 = p.a.z(r12, r10, r3, r11)
            int r0 = p.a.z(r13, r10, r4, r0)
            int r0 = p.a.z(r14, r10, r5, r0)
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = p.a.z(r15, r10, r1, r0)
            r1 = 100
            int r0 = p.a.z(r8, r10, r1, r0)
            r1 = 10
            int r0 = p.a.z(r7, r10, r1, r0)
        L78:
            int r6 = r6 - r10
            int r6 = r6 + r0
            return r6
        L7b:
            char r6 = r0[r1]
            int r7 = r1 + 1
            char r7 = r0[r7]
            int r8 = r1 + 2
            char r8 = r0[r8]
            int r11 = r1 + 3
            char r11 = r0[r11]
            int r12 = r1 + 4
            char r12 = r0[r12]
            int r13 = r1 + 5
            char r13 = r0[r13]
            int r14 = r1 + 6
            char r14 = r0[r14]
            if (r6 < r10) goto L1c8
            if (r6 > r9) goto L1c8
            if (r7 < r10) goto L1c8
            if (r7 > r9) goto L1c8
            if (r8 < r10) goto L1c8
            if (r8 > r9) goto L1c8
            if (r11 < r10) goto L1c8
            if (r11 > r9) goto L1c8
            if (r12 < r10) goto L1c8
            if (r12 > r9) goto L1c8
            if (r13 < r10) goto L1c8
            if (r13 > r9) goto L1c8
            if (r14 < r10) goto L1c8
            if (r14 > r9) goto L1c8
            int r6 = r6 - r10
            int r6 = r6 * r3
            int r0 = p.a.z(r7, r10, r4, r6)
            int r0 = p.a.z(r8, r10, r5, r0)
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = p.a.z(r11, r10, r1, r0)
            r1 = 100
            int r0 = p.a.z(r12, r10, r1, r0)
            r1 = 10
            int r0 = p.a.z(r13, r10, r1, r0)
            int r14 = r14 - r10
            int r14 = r14 + r0
            return r14
        Ld0:
            char r3 = r0[r1]
            int r6 = r1 + 1
            char r6 = r0[r6]
            int r7 = r1 + 2
            char r7 = r0[r7]
            int r8 = r1 + 3
            char r8 = r0[r8]
            int r11 = r1 + 4
            char r11 = r0[r11]
            int r12 = r1 + 5
            char r12 = r0[r12]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            if (r6 < r10) goto L1c8
            if (r6 > r9) goto L1c8
            if (r7 < r10) goto L1c8
            if (r7 > r9) goto L1c8
            if (r8 < r10) goto L1c8
            if (r8 > r9) goto L1c8
            if (r11 < r10) goto L1c8
            if (r11 > r9) goto L1c8
            if (r12 < r10) goto L1c8
            if (r12 > r9) goto L1c8
            int r3 = r3 - r10
            int r3 = r3 * r4
            int r0 = p.a.z(r6, r10, r5, r3)
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = p.a.z(r7, r10, r1, r0)
            r1 = 100
            int r0 = p.a.z(r8, r10, r1, r0)
            r1 = 10
            int r0 = p.a.z(r11, r10, r1, r0)
            int r12 = r12 - r10
            int r12 = r12 + r0
            return r12
        L119:
            char r3 = r0[r1]
            int r4 = r1 + 1
            char r4 = r0[r4]
            int r6 = r1 + 2
            char r6 = r0[r6]
            int r7 = r1 + 3
            char r7 = r0[r7]
            int r8 = r1 + 4
            char r8 = r0[r8]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            if (r4 < r10) goto L1c8
            if (r4 > r9) goto L1c8
            if (r6 < r10) goto L1c8
            if (r6 > r9) goto L1c8
            if (r7 < r10) goto L1c8
            if (r7 > r9) goto L1c8
            if (r8 < r10) goto L1c8
            if (r8 > r9) goto L1c8
            int r3 = r3 - r10
            int r3 = r3 * r5
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = p.a.z(r4, r10, r1, r3)
            r1 = 100
            int r0 = p.a.z(r6, r10, r1, r0)
            r1 = 10
            int r0 = p.a.z(r7, r10, r1, r0)
            int r8 = r8 - r10
            int r8 = r8 + r0
            return r8
        L156:
            char r3 = r0[r1]
            int r4 = r1 + 1
            char r4 = r0[r4]
            int r5 = r1 + 2
            char r5 = r0[r5]
            int r6 = r1 + 3
            char r6 = r0[r6]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            if (r4 < r10) goto L1c8
            if (r4 > r9) goto L1c8
            if (r5 < r10) goto L1c8
            if (r5 > r9) goto L1c8
            if (r6 < r10) goto L1c8
            if (r6 > r9) goto L1c8
            int r3 = r3 - r10
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = r3 * r1
            r1 = 100
            int r0 = p.a.z(r4, r10, r1, r3)
            r1 = 10
            int r0 = p.a.z(r5, r10, r1, r0)
            goto L78
        L186:
            char r3 = r0[r1]
            int r4 = r1 + 1
            char r4 = r0[r4]
            int r5 = r1 + 2
            char r5 = r0[r5]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            if (r4 < r10) goto L1c8
            if (r4 > r9) goto L1c8
            if (r5 < r10) goto L1c8
            if (r5 > r9) goto L1c8
            int r3 = r3 - r10
            r18 = 100
            int r3 = r3 * 100
            r1 = 10
            int r0 = p.a.z(r4, r10, r1, r3)
            int r5 = r5 - r10
            int r5 = r5 + r0
            return r5
        L1aa:
            char r3 = r0[r1]
            int r4 = r1 + 1
            char r4 = r0[r4]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            if (r4 < r10) goto L1c8
            if (r4 > r9) goto L1c8
            int r3 = r3 - r10
            r17 = 10
            int r3 = r3 * 10
            int r4 = r4 - r10
            int r4 = r4 + r3
            return r4
        L1c0:
            char r3 = r0[r1]
            if (r3 < r10) goto L1c8
            if (r3 > r9) goto L1c8
            int r3 = r3 - r10
            return r3
        L1c8:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1, r2)
            int r0 = java.lang.Integer.parseInt(r3)
            return r0
    }

    public static long parseLong(byte[] r13, int r14, int r15) {
            r0 = 100000(0x186a0, float:1.4013E-40)
            r1 = 57
            r2 = 48
            switch(r15) {
                case 1: goto L1c1;
                case 2: goto L1aa;
                case 3: goto L186;
                case 4: goto L155;
                case 5: goto L117;
                case 6: goto Lcb;
                case 7: goto L73;
                case 8: goto Lc;
                default: goto La;
            }
        La:
            goto L1ca
        Lc:
            r3 = r13[r14]
            int r4 = r14 + 1
            r4 = r13[r4]
            int r5 = r14 + 2
            r5 = r13[r5]
            int r6 = r14 + 3
            r6 = r13[r6]
            int r7 = r14 + 4
            r7 = r13[r7]
            int r8 = r14 + 5
            r8 = r13[r8]
            int r9 = r14 + 6
            r9 = r13[r9]
            int r10 = r14 + 7
            r10 = r13[r10]
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            if (r5 < r2) goto L1ca
            if (r5 > r1) goto L1ca
            if (r6 < r2) goto L1ca
            if (r6 > r1) goto L1ca
            if (r7 < r2) goto L1ca
            if (r7 > r1) goto L1ca
            if (r8 < r2) goto L1ca
            if (r8 > r1) goto L1ca
            if (r9 < r2) goto L1ca
            if (r9 > r1) goto L1ca
            if (r10 < r2) goto L1ca
            if (r10 > r1) goto L1ca
            int r3 = r3 - r2
            long r13 = (long) r3
            r11 = 10000000(0x989680, double:4.9406565E-317)
            long r13 = r13 * r11
            int r4 = r4 - r2
            r15 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = r4 * r15
            long r3 = (long) r4
            long r13 = r13 + r3
            int r5 = r5 - r2
            int r5 = r5 * r0
            long r0 = (long) r5
            long r13 = r13 + r0
            int r6 = r6 - r2
            int r6 = r6 * 10000
            long r0 = (long) r6
            long r13 = r13 + r0
            int r7 = r7 - r2
            int r7 = r7 * 1000
            long r0 = (long) r7
            long r13 = r13 + r0
            int r8 = r8 - r2
            int r8 = r8 * 100
            long r0 = (long) r8
            long r13 = r13 + r0
            int r9 = r9 - r2
            int r9 = r9 * 10
            long r0 = (long) r9
            long r13 = r13 + r0
            int r10 = r10 - r2
            long r0 = (long) r10
            long r13 = r13 + r0
            return r13
        L73:
            r3 = r13[r14]
            int r4 = r14 + 1
            r4 = r13[r4]
            int r5 = r14 + 2
            r5 = r13[r5]
            int r6 = r14 + 3
            r6 = r13[r6]
            int r7 = r14 + 4
            r7 = r13[r7]
            int r8 = r14 + 5
            r8 = r13[r8]
            int r9 = r14 + 6
            r9 = r13[r9]
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            if (r5 < r2) goto L1ca
            if (r5 > r1) goto L1ca
            if (r6 < r2) goto L1ca
            if (r6 > r1) goto L1ca
            if (r7 < r2) goto L1ca
            if (r7 > r1) goto L1ca
            if (r8 < r2) goto L1ca
            if (r8 > r1) goto L1ca
            if (r9 < r2) goto L1ca
            if (r9 > r1) goto L1ca
            int r3 = r3 - r2
            long r13 = (long) r3
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r13 * r10
            int r4 = r4 - r2
            int r4 = r4 * r0
            long r0 = (long) r4
            long r13 = r13 + r0
            int r5 = r5 - r2
            int r5 = r5 * 10000
            long r0 = (long) r5
            long r13 = r13 + r0
            int r6 = r6 - r2
            int r6 = r6 * 1000
            long r0 = (long) r6
            long r13 = r13 + r0
            int r7 = r7 - r2
            int r7 = r7 * 100
            long r0 = (long) r7
            long r13 = r13 + r0
            int r8 = r8 - r2
            int r8 = r8 * 10
            long r0 = (long) r8
            long r13 = r13 + r0
            int r9 = r9 - r2
            long r0 = (long) r9
            long r13 = r13 + r0
            return r13
        Lcb:
            r0 = r13[r14]
            int r3 = r14 + 1
            r3 = r13[r3]
            int r4 = r14 + 2
            r4 = r13[r4]
            int r5 = r14 + 3
            r5 = r13[r5]
            int r6 = r14 + 4
            r6 = r13[r6]
            int r7 = r14 + 5
            r7 = r13[r7]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            if (r5 < r2) goto L1ca
            if (r5 > r1) goto L1ca
            if (r6 < r2) goto L1ca
            if (r6 > r1) goto L1ca
            if (r7 < r2) goto L1ca
            if (r7 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            r0 = 100000(0x186a0, double:4.94066E-319)
            long r13 = r13 * r0
            int r3 = r3 - r2
            int r3 = r3 * 10000
            long r0 = (long) r3
            long r13 = r13 + r0
            int r4 = r4 - r2
            int r4 = r4 * 1000
            long r0 = (long) r4
            long r13 = r13 + r0
            int r5 = r5 - r2
            int r5 = r5 * 100
            long r0 = (long) r5
            long r13 = r13 + r0
            int r6 = r6 - r2
            int r6 = r6 * 10
            long r0 = (long) r6
            long r13 = r13 + r0
            int r7 = r7 - r2
            long r0 = (long) r7
            long r13 = r13 + r0
            return r13
        L117:
            r0 = r13[r14]
            int r3 = r14 + 1
            r3 = r13[r3]
            int r4 = r14 + 2
            r4 = r13[r4]
            int r5 = r14 + 3
            r5 = r13[r5]
            int r6 = r14 + 4
            r6 = r13[r6]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            if (r5 < r2) goto L1ca
            if (r5 > r1) goto L1ca
            if (r6 < r2) goto L1ca
            if (r6 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            r0 = 10000(0x2710, double:4.9407E-320)
            long r13 = r13 * r0
            int r3 = r3 - r2
            int r3 = r3 * 1000
            long r0 = (long) r3
            long r13 = r13 + r0
            int r4 = r4 - r2
            int r4 = r4 * 100
            long r0 = (long) r4
            long r13 = r13 + r0
            int r5 = r5 - r2
            int r5 = r5 * 10
            long r0 = (long) r5
            long r13 = r13 + r0
            int r6 = r6 - r2
            long r0 = (long) r6
            long r13 = r13 + r0
            return r13
        L155:
            r0 = r13[r14]
            int r3 = r14 + 1
            r3 = r13[r3]
            int r4 = r14 + 2
            r4 = r13[r4]
            int r5 = r14 + 3
            r5 = r13[r5]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            if (r5 < r2) goto L1ca
            if (r5 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r0
            int r3 = r3 - r2
            int r3 = r3 * 100
            long r0 = (long) r3
            long r13 = r13 + r0
            int r4 = r4 - r2
            int r4 = r4 * 10
            long r0 = (long) r4
            long r13 = r13 + r0
            int r5 = r5 - r2
            long r0 = (long) r5
            long r13 = r13 + r0
            return r13
        L186:
            r0 = r13[r14]
            int r3 = r14 + 1
            r3 = r13[r3]
            int r4 = r14 + 2
            r4 = r13[r4]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            r0 = 100
            long r13 = r13 * r0
            int r3 = r3 - r2
            int r3 = r3 * 10
            long r0 = (long) r3
            long r13 = r13 + r0
            int r4 = r4 - r2
            long r0 = (long) r4
            long r13 = r13 + r0
            return r13
        L1aa:
            r0 = r13[r14]
            int r3 = r14 + 1
            r3 = r13[r3]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            r0 = 10
            long r13 = r13 * r0
            int r3 = r3 - r2
            long r0 = (long) r3
            long r13 = r13 + r0
            return r13
        L1c1:
            r0 = r13[r14]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            return r13
        L1ca:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r14, r15)
            long r13 = java.lang.Long.parseLong(r0)
            return r13
    }

    public static long parseLong(char[] r13, int r14, int r15) {
            r0 = 100000(0x186a0, float:1.4013E-40)
            r1 = 57
            r2 = 48
            switch(r15) {
                case 1: goto L1c1;
                case 2: goto L1aa;
                case 3: goto L186;
                case 4: goto L155;
                case 5: goto L117;
                case 6: goto Lcb;
                case 7: goto L73;
                case 8: goto Lc;
                default: goto La;
            }
        La:
            goto L1ca
        Lc:
            char r3 = r13[r14]
            int r4 = r14 + 1
            char r4 = r13[r4]
            int r5 = r14 + 2
            char r5 = r13[r5]
            int r6 = r14 + 3
            char r6 = r13[r6]
            int r7 = r14 + 4
            char r7 = r13[r7]
            int r8 = r14 + 5
            char r8 = r13[r8]
            int r9 = r14 + 6
            char r9 = r13[r9]
            int r10 = r14 + 7
            char r10 = r13[r10]
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            if (r5 < r2) goto L1ca
            if (r5 > r1) goto L1ca
            if (r6 < r2) goto L1ca
            if (r6 > r1) goto L1ca
            if (r7 < r2) goto L1ca
            if (r7 > r1) goto L1ca
            if (r8 < r2) goto L1ca
            if (r8 > r1) goto L1ca
            if (r9 < r2) goto L1ca
            if (r9 > r1) goto L1ca
            if (r10 < r2) goto L1ca
            if (r10 > r1) goto L1ca
            int r3 = r3 - r2
            long r13 = (long) r3
            r11 = 10000000(0x989680, double:4.9406565E-317)
            long r13 = r13 * r11
            int r4 = r4 - r2
            r15 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = r4 * r15
            long r3 = (long) r4
            long r13 = r13 + r3
            int r5 = r5 - r2
            int r5 = r5 * r0
            long r0 = (long) r5
            long r13 = r13 + r0
            int r6 = r6 - r2
            int r6 = r6 * 10000
            long r0 = (long) r6
            long r13 = r13 + r0
            int r7 = r7 - r2
            int r7 = r7 * 1000
            long r0 = (long) r7
            long r13 = r13 + r0
            int r8 = r8 - r2
            int r8 = r8 * 100
            long r0 = (long) r8
            long r13 = r13 + r0
            int r9 = r9 - r2
            int r9 = r9 * 10
            long r0 = (long) r9
            long r13 = r13 + r0
            int r10 = r10 - r2
            long r0 = (long) r10
            long r13 = r13 + r0
            return r13
        L73:
            char r3 = r13[r14]
            int r4 = r14 + 1
            char r4 = r13[r4]
            int r5 = r14 + 2
            char r5 = r13[r5]
            int r6 = r14 + 3
            char r6 = r13[r6]
            int r7 = r14 + 4
            char r7 = r13[r7]
            int r8 = r14 + 5
            char r8 = r13[r8]
            int r9 = r14 + 6
            char r9 = r13[r9]
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            if (r5 < r2) goto L1ca
            if (r5 > r1) goto L1ca
            if (r6 < r2) goto L1ca
            if (r6 > r1) goto L1ca
            if (r7 < r2) goto L1ca
            if (r7 > r1) goto L1ca
            if (r8 < r2) goto L1ca
            if (r8 > r1) goto L1ca
            if (r9 < r2) goto L1ca
            if (r9 > r1) goto L1ca
            int r3 = r3 - r2
            long r13 = (long) r3
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r13 * r10
            int r4 = r4 - r2
            int r4 = r4 * r0
            long r0 = (long) r4
            long r13 = r13 + r0
            int r5 = r5 - r2
            int r5 = r5 * 10000
            long r0 = (long) r5
            long r13 = r13 + r0
            int r6 = r6 - r2
            int r6 = r6 * 1000
            long r0 = (long) r6
            long r13 = r13 + r0
            int r7 = r7 - r2
            int r7 = r7 * 100
            long r0 = (long) r7
            long r13 = r13 + r0
            int r8 = r8 - r2
            int r8 = r8 * 10
            long r0 = (long) r8
            long r13 = r13 + r0
            int r9 = r9 - r2
            long r0 = (long) r9
            long r13 = r13 + r0
            return r13
        Lcb:
            char r0 = r13[r14]
            int r3 = r14 + 1
            char r3 = r13[r3]
            int r4 = r14 + 2
            char r4 = r13[r4]
            int r5 = r14 + 3
            char r5 = r13[r5]
            int r6 = r14 + 4
            char r6 = r13[r6]
            int r7 = r14 + 5
            char r7 = r13[r7]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            if (r5 < r2) goto L1ca
            if (r5 > r1) goto L1ca
            if (r6 < r2) goto L1ca
            if (r6 > r1) goto L1ca
            if (r7 < r2) goto L1ca
            if (r7 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            r0 = 100000(0x186a0, double:4.94066E-319)
            long r13 = r13 * r0
            int r3 = r3 - r2
            int r3 = r3 * 10000
            long r0 = (long) r3
            long r13 = r13 + r0
            int r4 = r4 - r2
            int r4 = r4 * 1000
            long r0 = (long) r4
            long r13 = r13 + r0
            int r5 = r5 - r2
            int r5 = r5 * 100
            long r0 = (long) r5
            long r13 = r13 + r0
            int r6 = r6 - r2
            int r6 = r6 * 10
            long r0 = (long) r6
            long r13 = r13 + r0
            int r7 = r7 - r2
            long r0 = (long) r7
            long r13 = r13 + r0
            return r13
        L117:
            char r0 = r13[r14]
            int r3 = r14 + 1
            char r3 = r13[r3]
            int r4 = r14 + 2
            char r4 = r13[r4]
            int r5 = r14 + 3
            char r5 = r13[r5]
            int r6 = r14 + 4
            char r6 = r13[r6]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            if (r5 < r2) goto L1ca
            if (r5 > r1) goto L1ca
            if (r6 < r2) goto L1ca
            if (r6 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            r0 = 10000(0x2710, double:4.9407E-320)
            long r13 = r13 * r0
            int r3 = r3 - r2
            int r3 = r3 * 1000
            long r0 = (long) r3
            long r13 = r13 + r0
            int r4 = r4 - r2
            int r4 = r4 * 100
            long r0 = (long) r4
            long r13 = r13 + r0
            int r5 = r5 - r2
            int r5 = r5 * 10
            long r0 = (long) r5
            long r13 = r13 + r0
            int r6 = r6 - r2
            long r0 = (long) r6
            long r13 = r13 + r0
            return r13
        L155:
            char r0 = r13[r14]
            int r3 = r14 + 1
            char r3 = r13[r3]
            int r4 = r14 + 2
            char r4 = r13[r4]
            int r5 = r14 + 3
            char r5 = r13[r5]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            if (r5 < r2) goto L1ca
            if (r5 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r0
            int r3 = r3 - r2
            int r3 = r3 * 100
            long r0 = (long) r3
            long r13 = r13 + r0
            int r4 = r4 - r2
            int r4 = r4 * 10
            long r0 = (long) r4
            long r13 = r13 + r0
            int r5 = r5 - r2
            long r0 = (long) r5
            long r13 = r13 + r0
            return r13
        L186:
            char r0 = r13[r14]
            int r3 = r14 + 1
            char r3 = r13[r3]
            int r4 = r14 + 2
            char r4 = r13[r4]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            if (r4 < r2) goto L1ca
            if (r4 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            r0 = 100
            long r13 = r13 * r0
            int r3 = r3 - r2
            int r3 = r3 * 10
            long r0 = (long) r3
            long r13 = r13 + r0
            int r4 = r4 - r2
            long r0 = (long) r4
            long r13 = r13 + r0
            return r13
        L1aa:
            char r0 = r13[r14]
            int r3 = r14 + 1
            char r3 = r13[r3]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            if (r3 < r2) goto L1ca
            if (r3 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            r0 = 10
            long r13 = r13 * r0
            int r3 = r3 - r2
            long r0 = (long) r3
            long r13 = r13 + r0
            return r13
        L1c1:
            char r0 = r13[r14]
            if (r0 < r2) goto L1ca
            if (r0 > r1) goto L1ca
            int r0 = r0 - r2
            long r13 = (long) r0
            return r13
        L1ca:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r14, r15)
            long r13 = java.lang.Long.parseLong(r0)
            return r13
    }

    private static java.math.BigInteger power10(int r5) {
            java.math.BigInteger[] r0 = com.alibaba.fastjson2.util.TypeUtils.BIG_TEN_POWERS_TABLE_0
            int r1 = r0.length
            if (r5 >= r1) goto L8
            r5 = r0[r5]
            return r5
        L8:
            java.math.BigInteger[] r1 = com.alibaba.fastjson2.util.TypeUtils.BIG_TEN_POWERS_TABLE_1
            if (r1 != 0) goto L26
            r1 = 128(0x80, float:1.8E-43)
            java.math.BigInteger[] r2 = new java.math.BigInteger[r1]
            r3 = 18
            r0 = r0[r3]
            r3 = 19
        L16:
            if (r3 >= r1) goto L23
            java.math.BigInteger r4 = java.math.BigInteger.TEN
            java.math.BigInteger r0 = r0.multiply(r4)
            r2[r3] = r0
            int r3 = r3 + 1
            goto L16
        L23:
            com.alibaba.fastjson2.util.TypeUtils.BIG_TEN_POWERS_TABLE_1 = r2
            r1 = r2
        L26:
            r5 = r1[r5]
            return r5
    }

    public static char[] toAsciiCharArray(byte[] r3) {
            int r0 = r3.length
            char[] r0 = new char[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto Lf
            r2 = r3[r1]
            char r2 = (char) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        Lf:
            return r0
    }

    public static java.math.BigDecimal toBigDecimal(double r3) {
            r0 = 24
            byte[] r0 = new byte[r0]
            r1 = 1
            r2 = 0
            int r3 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r3, r0, r2, r1)
            java.math.BigDecimal r3 = parseBigDecimal(r0, r2, r3)
            return r3
    }

    public static java.math.BigDecimal toBigDecimal(float r3) {
            r0 = 15
            byte[] r0 = new byte[r0]
            r1 = 1
            r2 = 0
            int r3 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r3, r0, r2, r1)
            java.math.BigDecimal r3 = parseBigDecimal(r0, r2, r3)
            return r3
    }

    public static java.math.BigDecimal toBigDecimal(long r0) {
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            return r0
    }

    public static java.math.BigDecimal toBigDecimal(java.lang.Object r2) {
            if (r2 == 0) goto L4b
            boolean r0 = r2 instanceof java.math.BigDecimal
            if (r0 == 0) goto L7
            goto L4b
        L7:
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 != 0) goto L40
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L40
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L40
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L18
            goto L40
        L18:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L35
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L33
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2d
            goto L33
        L2d:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r2)
            return r0
        L33:
            r2 = 0
            return r2
        L35:
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Object r2 = cast(r2, r0, r1)
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            return r2
        L40:
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            return r2
        L4b:
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            return r2
    }

    public static java.math.BigDecimal toBigDecimal(java.lang.String r2) {
            if (r2 == 0) goto L1c
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1c
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L11
            goto L1c
        L11:
            char[] r2 = r2.toCharArray()
            r0 = 0
            int r1 = r2.length
            java.math.BigDecimal r2 = parseBigDecimal(r2, r0, r1)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public static java.math.BigDecimal toBigDecimal(byte[] r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.math.BigDecimal r2 = parseBigDecimal(r2, r0, r1)
            return r2
    }

    public static java.math.BigDecimal toBigDecimal(char[] r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 0
            int r1 = r2.length
            java.math.BigDecimal r2 = parseBigDecimal(r2, r0, r1)
            return r2
    }

    public static java.math.BigInteger toBigInteger(java.lang.Object r2) {
            if (r2 == 0) goto L47
            boolean r0 = r2 instanceof java.math.BigInteger
            if (r0 == 0) goto L7
            goto L47
        L7:
            boolean r0 = r2 instanceof java.lang.Byte
            if (r0 != 0) goto L3c
            boolean r0 = r2 instanceof java.lang.Short
            if (r0 != 0) goto L3c
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L3c
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L18
            goto L3c
        L18:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L35
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L33
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2d
            goto L33
        L2d:
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            return r0
        L33:
            r2 = 0
            return r2
        L35:
            java.lang.String r2 = "can not cast to bigint"
            ah.a.w(r2)
            r2 = 0
            return r2
        L3c:
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            return r2
        L47:
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            return r2
    }

    public static java.lang.Boolean toBoolean(java.lang.Object r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof java.lang.Boolean
            if (r1 == 0) goto Lb
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            return r2
        Lb:
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L2a
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L29
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L20
            goto L29
        L20:
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L29:
            return r0
        L2a:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L3f
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0 = 1
            if (r2 != r0) goto L3a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
        L3a:
            if (r2 != 0) goto L3f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L3f:
            java.lang.String r2 = "can not cast to boolean"
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public static boolean toBooleanValue(java.lang.Object r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof java.lang.Boolean
            if (r1 == 0) goto Lf
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        Lf:
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L2a
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L29
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L24
            goto L29
        L24:
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            return r2
        L29:
            return r0
        L2a:
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 == 0) goto L3b
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r1 = 1
            if (r2 != r1) goto L38
            return r1
        L38:
            if (r2 != 0) goto L3b
            return r0
        L3b:
            java.lang.String r2 = "can not cast to boolean"
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public static java.lang.Byte toByte(java.lang.Object r1) {
            if (r1 == 0) goto L3d
            boolean r0 = r1 instanceof java.lang.Byte
            if (r0 == 0) goto L7
            goto L3d
        L7:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L16
            java.lang.Number r1 = (java.lang.Number) r1
            byte r1 = r1.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        L16:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L36
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L34
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
            goto L34
        L2b:
            byte r1 = java.lang.Byte.parseByte(r1)
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        L34:
            r1 = 0
            return r1
        L36:
            java.lang.String r1 = "can not cast to byte"
            ah.a.w(r1)
            r1 = 0
            return r1
        L3d:
            java.lang.Byte r1 = (java.lang.Byte) r1
            return r1
    }

    public static byte toByteValue(java.lang.Object r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof java.lang.Byte
            if (r1 == 0) goto Lf
            java.lang.Byte r2 = (java.lang.Byte) r2
            byte r2 = r2.byteValue()
            return r2
        Lf:
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 == 0) goto L1a
            java.lang.Number r2 = (java.lang.Number) r2
            byte r2 = r2.byteValue()
            return r2
        L1a:
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L35
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L34
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2f
            goto L34
        L2f:
            byte r2 = java.lang.Byte.parseByte(r2)
            return r2
        L34:
            return r0
        L35:
            java.lang.String r2 = "can not cast to byte"
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public static java.util.Date toDate(java.lang.Object r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Date
            if (r1 == 0) goto Lb
            java.util.Date r5 = (java.util.Date) r5
            return r5
        Lb:
            boolean r1 = r5 instanceof java.time.Instant
            if (r1 == 0) goto L1b
            java.time.Instant r5 = (java.time.Instant) r5
            java.util.Date r0 = new java.util.Date
            long r1 = r5.toEpochMilli()
            r0.<init>(r1)
            return r0
        L1b:
            boolean r1 = r5 instanceof java.time.ZonedDateTime
            if (r1 == 0) goto L2f
            java.time.ZonedDateTime r5 = (java.time.ZonedDateTime) r5
            java.util.Date r0 = new java.util.Date
            java.time.Instant r5 = r5.toInstant()
            long r1 = r5.toEpochMilli()
            r0.<init>(r1)
            return r0
        L2f:
            boolean r1 = r5 instanceof java.time.LocalDate
            if (r1 == 0) goto L49
            java.time.LocalDate r5 = (java.time.LocalDate) r5
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r5 = r5.atStartOfDay(r0)
            java.util.Date r0 = new java.util.Date
            java.time.Instant r5 = r5.toInstant()
            long r1 = r5.toEpochMilli()
            r0.<init>(r1)
            return r0
        L49:
            boolean r1 = r5 instanceof java.time.LocalDateTime
            if (r1 == 0) goto L63
            java.time.LocalDateTime r5 = (java.time.LocalDateTime) r5
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r5 = java.time.ZonedDateTime.of(r5, r0)
            java.util.Date r0 = new java.util.Date
            java.time.Instant r5 = r5.toInstant()
            long r1 = r5.toEpochMilli()
            r0.<init>(r1)
            return r0
        L63:
            boolean r1 = r5 instanceof java.lang.String
            if (r1 == 0) goto L7c
            java.lang.String r5 = (java.lang.String) r5
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r1 = com.alibaba.fastjson2.util.DateUtils.parseMillis(r5, r1)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L76
            return r0
        L76:
            java.util.Date r5 = new java.util.Date
            r5.<init>(r1)
            return r5
        L7c:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 != 0) goto L90
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L85
            goto L90
        L85:
            java.lang.String r0 = "can not cast to Date from "
            java.lang.Class r5 = r5.getClass()
            ah.a.i(r5, r0)
            r5 = 0
            return r5
        L90:
            java.util.Date r0 = new java.util.Date
            java.lang.Number r5 = (java.lang.Number) r5
            long r1 = r5.longValue()
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Double toDouble(java.lang.Object r2) {
            if (r2 == 0) goto L3d
            boolean r0 = r2 instanceof java.lang.Double
            if (r0 == 0) goto L7
            goto L3d
        L7:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L16
            java.lang.Number r2 = (java.lang.Number) r2
            double r0 = r2.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L16:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L36
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L34
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2b
            goto L34
        L2b:
            double r0 = java.lang.Double.parseDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L34:
            r2 = 0
            return r2
        L36:
            java.lang.String r2 = "can not cast to decimal"
            ah.a.w(r2)
            r2 = 0
            return r2
        L3d:
            java.lang.Double r2 = (java.lang.Double) r2
            return r2
    }

    public static double toDoubleValue(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L5
            return r0
        L5:
            boolean r2 = r3 instanceof java.lang.Double
            if (r2 == 0) goto L10
            java.lang.Double r3 = (java.lang.Double) r3
            double r0 = r3.doubleValue()
            return r0
        L10:
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L1b
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            return r0
        L1b:
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L35
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L34
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L30
            goto L34
        L30:
            double r0 = java.lang.Double.parseDouble(r3)
        L34:
            return r0
        L35:
            java.lang.String r3 = "can not cast to decimal"
            ah.a.w(r3)
            r0 = 0
            return r0
    }

    public static java.lang.Float toFloat(java.lang.Object r1) {
            if (r1 == 0) goto L3d
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L7
            goto L3d
        L7:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L16
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L16:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L36
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L34
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
            goto L34
        L2b:
            float r1 = java.lang.Float.parseFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L34:
            r1 = 0
            return r1
        L36:
            java.lang.String r1 = "can not cast to decimal"
            ah.a.w(r1)
            r1 = 0
            return r1
        L3d:
            java.lang.Float r1 = (java.lang.Float) r1
            return r1
    }

    public static float toFloatValue(java.lang.Object r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof java.lang.Float
            if (r1 == 0) goto Lf
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            return r2
        Lf:
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 == 0) goto L1a
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            return r2
        L1a:
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L35
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L34
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2f
            goto L34
        L2f:
            float r2 = java.lang.Float.parseFloat(r2)
            return r2
        L34:
            return r0
        L35:
            java.lang.String r2 = "can not cast to decimal"
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public static java.time.Instant toInstant(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.time.Instant
            if (r1 == 0) goto Lb
            java.time.Instant r3 = (java.time.Instant) r3
            return r3
        Lb:
            boolean r1 = r3 instanceof java.util.Date
            if (r1 == 0) goto L16
            java.util.Date r3 = (java.util.Date) r3
            java.time.Instant r3 = r3.toInstant()
            return r3
        L16:
            boolean r1 = r3 instanceof java.time.ZonedDateTime
            if (r1 == 0) goto L21
            java.time.ZonedDateTime r3 = (java.time.ZonedDateTime) r3
            java.time.Instant r3 = r3.toInstant()
            return r3
        L21:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L63
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L62
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L36
            goto L62
        L36:
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 34
            if (r0 == r1) goto L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "\""
            r0.<init>(r2)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            com.alibaba.fastjson2.JSONReader r3 = com.alibaba.fastjson2.JSONReader.of(r3)
            goto L59
        L55:
            com.alibaba.fastjson2.JSONReader r3 = com.alibaba.fastjson2.JSONReader.of(r3)
        L59:
            java.lang.Class<java.time.Instant> r0 = java.time.Instant.class
            java.lang.Object r3 = r3.read(r0)
            java.time.Instant r3 = (java.time.Instant) r3
            return r3
        L62:
            return r0
        L63:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L74
            com.alibaba.fastjson2.reader.ObjectReaderImplInstant r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInstant.INSTANCE
            java.util.Map r3 = (java.util.Map) r3
            r1 = 0
            java.lang.Object r3 = r0.createInstance(r3, r1)
            java.time.Instant r3 = (java.time.Instant) r3
            return r3
        L74:
            java.lang.String r0 = "can not cast to Date from "
            java.lang.Class r3 = r3.getClass()
            ah.a.i(r3, r0)
            r3 = 0
            return r3
    }

    public static int toIntValue(java.lang.Object r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 == 0) goto Lf
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
        Lf:
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 == 0) goto L1a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
        L1a:
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L6a
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L69
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L2f
            goto L69
        L2f:
            r0 = 44
            int r0 = r2.lastIndexOf(r0)     // Catch: java.text.ParseException -> L53
            int r1 = r2.length()     // Catch: java.text.ParseException -> L53
            int r1 = r1 + (-4)
            if (r0 != r1) goto L53
            r0 = 46
            int r0 = r2.indexOf(r0)     // Catch: java.text.ParseException -> L53
            r1 = -1
            if (r0 != r1) goto L53
            java.text.NumberFormat r0 = java.text.NumberFormat.getNumberInstance()     // Catch: java.text.ParseException -> L53
            java.lang.Number r0 = r0.parse(r2)     // Catch: java.text.ParseException -> L53
            int r2 = r0.intValue()     // Catch: java.text.ParseException -> L53
            return r2
        L53:
            boolean r0 = com.alibaba.fastjson2.util.IOUtils.isNumber(r2)
            if (r0 == 0) goto L5e
            int r2 = java.lang.Integer.parseInt(r2)
            return r2
        L5e:
            java.lang.String r0 = "parseInt error, "
            java.lang.String r2 = r0.concat(r2)
            ah.a.w(r2)
            r2 = 0
            return r2
        L69:
            return r0
        L6a:
            java.lang.String r2 = "can not cast to int"
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public static java.lang.Integer toInteger(java.lang.Object r2) {
            if (r2 == 0) goto L5a
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 == 0) goto L7
            goto L5a
        L7:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L16
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L16:
            boolean r0 = r2 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L36
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L35
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2c
            goto L35
        L2c:
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L35:
            return r1
        L36:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L44
            r0 = r2
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L44
            return r1
        L44:
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L53
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L53:
            java.lang.String r2 = "can not cast to integer"
            ah.a.w(r2)
            r2 = 0
            return r2
        L5a:
            java.lang.Integer r2 = (java.lang.Integer) r2
            return r2
    }

    public static java.util.List toList(java.lang.Object r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto Lb
            java.util.List r2 = (java.util.List) r2
            return r2
        Lb:
            boolean r0 = r2 instanceof java.lang.Iterable
            if (r0 == 0) goto L29
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L1a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r2.next()
            r0.add(r1)
            goto L1a
        L28:
            return r0
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to List"
            java.lang.String r2 = bc.e.h(r2, r1, r0)
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public static java.lang.Long toLong(java.lang.Object r2) {
            if (r2 == 0) goto L27
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L7
            goto L27
        L7:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L1e
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1c
            java.lang.String r1 = "null"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r2 = 0
            return r2
        L1e:
            long r0 = toLongValue(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L27:
            java.lang.Long r2 = (java.lang.Long) r2
            return r2
    }

    public static long toLongValue(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L5
            return r0
        L5:
            boolean r2 = r3 instanceof java.lang.Long
            if (r2 == 0) goto L10
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            return r0
        L10:
            boolean r2 = r3 instanceof java.lang.Number
            if (r2 == 0) goto L1b
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            return r0
        L1b:
            boolean r2 = r3 instanceof java.lang.String
            if (r2 == 0) goto L6b
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L6a
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L30
            goto L6a
        L30:
            r0 = 44
            int r0 = r3.lastIndexOf(r0)     // Catch: java.text.ParseException -> L54
            int r1 = r3.length()     // Catch: java.text.ParseException -> L54
            int r1 = r1 + (-4)
            if (r0 != r1) goto L54
            r0 = 46
            int r0 = r3.indexOf(r0)     // Catch: java.text.ParseException -> L54
            r1 = -1
            if (r0 != r1) goto L54
            java.text.NumberFormat r0 = java.text.NumberFormat.getNumberInstance()     // Catch: java.text.ParseException -> L54
            java.lang.Number r0 = r0.parse(r3)     // Catch: java.text.ParseException -> L54
            long r0 = r0.longValue()     // Catch: java.text.ParseException -> L54
            return r0
        L54:
            boolean r0 = com.alibaba.fastjson2.util.IOUtils.isNumber(r3)
            if (r0 == 0) goto L5f
            long r0 = java.lang.Long.parseLong(r3)
            return r0
        L5f:
            java.lang.String r0 = "parseLong error "
            java.lang.String r3 = r0.concat(r3)
            ah.a.w(r3)
            r0 = 0
        L6a:
            return r0
        L6b:
            java.lang.String r0 = "can not cast to long from "
            java.lang.Class r3 = r3.getClass()
            ah.a.i(r3, r0)
            r0 = 0
            return r0
    }

    public static java.lang.Short toShort(java.lang.Object r1) {
            if (r1 == 0) goto L3d
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 == 0) goto L7
            goto L3d
        L7:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L16
            java.lang.Number r1 = (java.lang.Number) r1
            short r1 = r1.shortValue()
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        L16:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L36
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L34
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2b
            goto L34
        L2b:
            short r1 = java.lang.Short.parseShort(r1)
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        L34:
            r1 = 0
            return r1
        L36:
            java.lang.String r1 = "can not cast to byte"
            ah.a.w(r1)
            r1 = 0
            return r1
        L3d:
            java.lang.Short r1 = (java.lang.Short) r1
            return r1
    }

    public static short toShortValue(java.lang.Object r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2 instanceof java.lang.Short
            if (r1 == 0) goto Lf
            java.lang.Short r2 = (java.lang.Short) r2
            short r2 = r2.shortValue()
            return r2
        Lf:
            boolean r1 = r2 instanceof java.lang.Number
            if (r1 == 0) goto L1c
            java.lang.Number r2 = (java.lang.Number) r2
            short r2 = r2.shortValue()
            byte r2 = (byte) r2
            short r2 = (short) r2
            return r2
        L1c:
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L37
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L36
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L31
            goto L36
        L31:
            short r2 = java.lang.Short.parseShort(r2)
            return r2
        L36:
            return r0
        L37:
            java.lang.String r2 = "can not cast to byte"
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public static java.lang.String[] toStringArray(java.lang.Object r5) {
            if (r5 == 0) goto L6c
            boolean r0 = r5 instanceof java.lang.String[]
            if (r0 == 0) goto L7
            goto L6c
        L7:
            boolean r0 = r5 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L37
            java.util.Collection r5 = (java.util.Collection) r5
            int r0 = r5.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r5.next()
            int r3 = r1 + 1
            if (r2 == 0) goto L30
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L2b
            goto L30
        L2b:
            java.lang.String r2 = r2.toString()
            goto L32
        L30:
            java.lang.String r2 = (java.lang.String) r2
        L32:
            r0[r1] = r2
            r1 = r3
            goto L18
        L36:
            return r0
        L37:
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L61
            int r0 = java.lang.reflect.Array.getLength(r5)
            java.lang.String[] r2 = new java.lang.String[r0]
        L47:
            if (r1 >= r0) goto L60
            java.lang.Object r3 = java.lang.reflect.Array.get(r5, r1)
            if (r3 == 0) goto L59
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L54
            goto L59
        L54:
            java.lang.String r3 = r3.toString()
            goto L5b
        L59:
            java.lang.String r3 = (java.lang.String) r3
        L5b:
            r2[r1] = r3
            int r1 = r1 + 1
            goto L47
        L60:
            return r2
        L61:
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Object r5 = cast(r5, r0, r1)
            java.lang.String[] r5 = (java.lang.String[]) r5
            return r5
        L6c:
            java.lang.String[] r5 = (java.lang.String[]) r5
            return r5
    }

    public static boolean validateIPv4(java.lang.String r1) {
            r0 = 0
            boolean r1 = validateIPv4(r1, r0)
            return r1
    }

    public static boolean validateIPv4(java.lang.String r12, int r13) {
            r0 = 0
            if (r12 != 0) goto L4
            return r0
        L4:
            int r1 = r12.length()
            int r2 = r1 - r13
            r3 = 7
            if (r2 < r3) goto L9d
            r3 = 25
            if (r2 <= r3) goto L13
            goto L9d
        L13:
            r2 = r13
            r3 = r0
        L15:
            r4 = 3
            r5 = 1
            if (r13 >= r1) goto L9a
            char r6 = r12.charAt(r13)
            r7 = 46
            if (r6 == r7) goto L25
            int r8 = r1 + (-1)
            if (r13 != r8) goto L95
        L25:
            if (r6 != r7) goto L29
            r8 = r13
            goto L2b
        L29:
            int r8 = r13 + 1
        L2b:
            int r9 = r8 - r2
            r10 = 57
            r11 = 48
            if (r9 == r5) goto L84
            r5 = 2
            if (r9 == r5) goto L6e
            if (r9 == r4) goto L39
            return r0
        L39:
            int r4 = r8 + (-3)
            char r4 = r12.charAt(r4)
            int r5 = r8 + (-2)
            char r5 = r12.charAt(r5)
            int r8 = r8 + (-1)
            char r8 = r12.charAt(r8)
            if (r4 < r11) goto L6d
            r9 = 50
            if (r4 <= r9) goto L52
            goto L6d
        L52:
            if (r5 < r11) goto L6d
            if (r5 <= r10) goto L57
            goto L6d
        L57:
            if (r8 < r11) goto L6d
            if (r8 <= r10) goto L5c
            goto L6d
        L5c:
            int r4 = r4 + (-48)
            int r4 = r4 * 100
            r9 = 10
            int r4 = p.a.z(r5, r11, r9, r4)
            int r8 = r8 + (-48)
            int r8 = r8 + r4
            r4 = 255(0xff, float:3.57E-43)
            if (r8 <= r4) goto L8f
        L6d:
            return r0
        L6e:
            int r4 = r8 + (-2)
            char r4 = r12.charAt(r4)
            int r8 = r8 + (-1)
            char r5 = r12.charAt(r8)
            if (r4 < r11) goto L83
            if (r4 <= r10) goto L7f
            goto L83
        L7f:
            if (r5 < r11) goto L83
            if (r5 <= r10) goto L8f
        L83:
            return r0
        L84:
            int r8 = r8 + (-1)
            char r4 = r12.charAt(r8)
            if (r4 < r11) goto L99
            if (r4 <= r10) goto L8f
            goto L99
        L8f:
            if (r6 != r7) goto L95
            int r3 = r3 + 1
            int r2 = r13 + 1
        L95:
            int r13 = r13 + 1
            goto L15
        L99:
            return r0
        L9a:
            if (r3 != r4) goto L9d
            return r5
        L9d:
            return r0
    }

    public static boolean validateIPv6(java.lang.String r17) {
            r0 = r17
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r0.length()
            r3 = 2
            if (r2 < r3) goto L11
            r4 = 39
            if (r2 <= r4) goto L15
        L11:
            r16 = r1
            goto L138
        L15:
            r4 = r1
            r5 = r4
            r6 = r5
        L18:
            r7 = 1
            if (r4 >= r2) goto L2a
            char r8 = r0.charAt(r4)
            r9 = 46
            if (r8 != r9) goto L2e
            boolean r0 = validateIPv4(r0, r5)
            if (r0 != 0) goto L2a
            return r1
        L2a:
            r16 = r1
            goto L131
        L2e:
            r9 = 58
            if (r8 == r9) goto L3b
            int r10 = r2 + (-1)
            if (r4 != r10) goto L37
            goto L3b
        L37:
            r16 = r1
            goto L12a
        L3b:
            if (r8 != r9) goto L3f
            r10 = r4
            goto L41
        L3f:
            int r10 = r4 + 1
        L41:
            int r11 = r10 - r5
            if (r11 == 0) goto L121
            r12 = 102(0x66, float:1.43E-43)
            r13 = 97
            r14 = 70
            r15 = 65
            r16 = r1
            r1 = 57
            r9 = 48
            if (r11 == r7) goto L10e
            if (r11 == r3) goto Le8
            r7 = 3
            if (r11 == r7) goto Laf
            r7 = 4
            if (r11 == r7) goto L5e
            return r16
        L5e:
            int r7 = r10 + (-4)
            char r7 = r0.charAt(r7)
            int r11 = r10 + (-3)
            char r11 = r0.charAt(r11)
            int r3 = r10 + (-2)
            char r3 = r0.charAt(r3)
            int r10 = r10 + (-1)
            char r10 = r0.charAt(r10)
            if (r7 < r9) goto L7a
            if (r7 <= r1) goto L83
        L7a:
            if (r7 < r15) goto L7e
            if (r7 <= r14) goto L83
        L7e:
            if (r7 < r13) goto Lae
            if (r7 <= r12) goto L83
            goto Lae
        L83:
            if (r11 < r9) goto L87
            if (r11 <= r1) goto L90
        L87:
            if (r11 < r15) goto L8b
            if (r11 <= r14) goto L90
        L8b:
            if (r11 < r13) goto Lae
            if (r11 <= r12) goto L90
            goto Lae
        L90:
            if (r3 < r9) goto L94
            if (r3 <= r1) goto L9d
        L94:
            if (r3 < r15) goto L98
            if (r3 <= r14) goto L9d
        L98:
            if (r3 < r13) goto Lae
            if (r3 <= r12) goto L9d
            goto Lae
        L9d:
            if (r10 < r9) goto La6
            if (r10 <= r1) goto La2
            goto La6
        La2:
            r1 = 58
            goto L124
        La6:
            if (r10 < r15) goto Laa
            if (r10 <= r14) goto La2
        Laa:
            if (r10 < r13) goto Lae
            if (r10 <= r12) goto La2
        Lae:
            return r16
        Laf:
            int r3 = r10 + (-3)
            char r3 = r0.charAt(r3)
            int r7 = r10 + (-2)
            char r7 = r0.charAt(r7)
            int r10 = r10 + (-1)
            char r10 = r0.charAt(r10)
            if (r3 < r9) goto Lc5
            if (r3 <= r1) goto Lce
        Lc5:
            if (r3 < r15) goto Lc9
            if (r3 <= r14) goto Lce
        Lc9:
            if (r3 < r13) goto Le7
            if (r3 <= r12) goto Lce
            goto Le7
        Lce:
            if (r7 < r9) goto Ld2
            if (r7 <= r1) goto Ldb
        Ld2:
            if (r7 < r15) goto Ld6
            if (r7 <= r14) goto Ldb
        Ld6:
            if (r7 < r13) goto Le7
            if (r7 <= r12) goto Ldb
            goto Le7
        Ldb:
            if (r10 < r9) goto Ldf
            if (r10 <= r1) goto La2
        Ldf:
            if (r10 < r15) goto Le3
            if (r10 <= r14) goto La2
        Le3:
            if (r10 < r13) goto Le7
            if (r10 <= r12) goto La2
        Le7:
            return r16
        Le8:
            int r3 = r10 + (-2)
            char r3 = r0.charAt(r3)
            int r10 = r10 + (-1)
            char r7 = r0.charAt(r10)
            if (r3 < r9) goto Lf8
            if (r3 <= r1) goto L101
        Lf8:
            if (r3 < r15) goto Lfc
            if (r3 <= r14) goto L101
        Lfc:
            if (r3 < r13) goto L10d
            if (r3 <= r12) goto L101
            goto L10d
        L101:
            if (r7 < r9) goto L105
            if (r7 <= r1) goto La2
        L105:
            if (r7 < r15) goto L109
            if (r7 <= r14) goto La2
        L109:
            if (r7 < r13) goto L10d
            if (r7 <= r12) goto La2
        L10d:
            return r16
        L10e:
            int r10 = r10 + (-1)
            char r3 = r0.charAt(r10)
            if (r3 < r9) goto L118
            if (r3 <= r1) goto La2
        L118:
            if (r3 < r15) goto L11c
            if (r3 <= r14) goto La2
        L11c:
            if (r3 < r13) goto L120
            if (r3 <= r12) goto La2
        L120:
            return r16
        L121:
            r16 = r1
            r1 = r9
        L124:
            if (r8 != r1) goto L12a
            int r6 = r6 + 1
            int r5 = r4 + 1
        L12a:
            int r4 = r4 + 1
            r1 = r16
            r3 = 2
            goto L18
        L131:
            if (r6 <= 0) goto L138
            r0 = 8
            if (r6 >= r0) goto L138
            return r7
        L138:
            return r16
    }
}
