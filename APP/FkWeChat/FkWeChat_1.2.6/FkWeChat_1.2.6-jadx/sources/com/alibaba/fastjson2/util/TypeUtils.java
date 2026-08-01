package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.AbstractC1843z;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1571d;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.C1608k0;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplEnum;
import com.alibaba.fastjson2.reader.ObjectReaderImplInstant;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import okhttp3.internal.p218ws.WebSocketProtocol;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class TypeUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final BigInteger BIGINT_INT32_MAX;
    public static final BigInteger BIGINT_INT32_MIN;
    public static final BigInteger BIGINT_INT64_MAX;
    public static final BigInteger BIGINT_INT64_MIN;
    public static final BigInteger BIGINT_JAVASCRIPT_HIGH;
    public static final BigInteger BIGINT_JAVASCRIPT_LOW;
    static final double[] BIG_10_POW;
    static final Cache CACHE;
    static final AtomicReferenceFieldUpdater<Cache, char[]> CHARS_UPDATER;
    public static final Class CLASS_JSON_ARRAY_1x;
    public static final Class CLASS_JSON_OBJECT_1x;
    public static final Field FIELD_JSON_OBJECT_1x_map;

    /* JADX INFO: renamed from: L */
    private static final double f4760L = 3.321928094887362d;
    static final long LONG_JAVASCRIPT_HIGH = 9007199254740991L;
    static final long LONG_JAVASCRIPT_LOW = -9007199254740991L;
    static volatile MethodHandle METHOD_NEW_PROXY_INSTANCE = null;
    static volatile boolean METHOD_NEW_PROXY_INSTANCE_ERROR = false;
    public static final MethodType METHOD_TYPE_INT_OBJECT;
    public static final MethodType METHOD_TYPE_LONG_OBJECT;
    public static final MethodType METHOD_TYPE_OBJECT;
    public static final MethodType METHOD_TYPE_OBJECT_DOUBLE;
    public static final MethodType METHOD_TYPE_OBJECT_INT;
    public static final MethodType METHOD_TYPE_OBJECT_LONG;
    public static final MethodType METHOD_TYPE_OBJECT_OBJECT;
    public static final MethodType METHOD_TYPE_OBJECT_OBJECT_OBJECT;
    public static final MethodType METHOD_TYPE_VOID;
    public static final MethodType METHOD_TYPE_VOID_INT;
    public static final MethodType METHOD_TYPE_VOID_LONG;
    public static final MethodType METHOD_TYPE_VOID_OBJECT_INT;
    public static final MethodType METHOD_TYPE_VOID_STRING;
    public static final MethodType METHOD_TYPE_VOO;
    static final Map<Class, String> NAME_MAPPINGS;
    private static final int P_D = 53;
    private static final int P_F = 24;
    private static final int Q_MAX_D = 971;
    private static final int Q_MAX_F = 104;
    private static final int Q_MIN_D = -1074;
    private static final int Q_MIN_F = -149;
    static final float[] SINGLE_SMALL_10_POW;
    public static final double[] SMALL_10_POW;
    static final double[] TINY_10_POW;
    static final Map<String, Class> TYPE_MAPPINGS;
    public static final Class CLASS_SINGLE_SET = Collections.singleton(1).getClass();
    public static final Class CLASS_SINGLE_LIST = Collections.singletonList(1).getClass();
    public static final Class CLASS_UNMODIFIABLE_COLLECTION = Collections.unmodifiableCollection(new ArrayList()).getClass();
    public static final Class CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(new ArrayList()).getClass();
    public static final Class CLASS_UNMODIFIABLE_SET = Collections.unmodifiableSet(new HashSet()).getClass();
    public static final Class CLASS_UNMODIFIABLE_SORTED_SET = Collections.unmodifiableSortedSet(new TreeSet()).getClass();
    public static final Class CLASS_UNMODIFIABLE_NAVIGABLE_SET = Collections.unmodifiableNavigableSet(new TreeSet()).getClass();
    public static final ParameterizedType PARAM_TYPE_LIST_STR = new ParameterizedTypeImpl(List.class, String.class);
    public static final MethodType METHOD_TYPE_SUPPLIER = MethodType.methodType(Supplier.class);
    public static final MethodType METHOD_TYPE_FUNCTION = MethodType.methodType(Function.class);
    public static final MethodType METHOD_TYPE_TO_INT_FUNCTION = MethodType.methodType(ToIntFunction.class);
    public static final MethodType METHOD_TYPE_TO_LONG_FUNCTION = MethodType.methodType(ToLongFunction.class);
    public static final MethodType METHOD_TYPE_OBJECT_INT_CONSUMER = MethodType.methodType(ObjIntConsumer.class);
    public static final MethodType METHOD_TYPE_INT_FUNCTION = MethodType.methodType(IntFunction.class);
    public static final MethodType METHOD_TYPE_LONG_FUNCTION = MethodType.methodType(LongFunction.class);
    public static final MethodType METHOD_TYPE_DOUBLE_FUNCTION = MethodType.methodType(DoubleFunction.class);
    public static final MethodType METHOD_TYPE_BI_FUNCTION = MethodType.methodType(BiFunction.class);
    public static final MethodType METHOD_TYPE_BI_CONSUMER = MethodType.methodType(BiConsumer.class);

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class Cache {
        volatile char[] chars;
    }

    /* JADX INFO: renamed from: com.alibaba.fastjson2.util.TypeUtils$X1 */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class C1777X1 {
        static final Function<byte[], char[]> TO_CHARS;

        static {
            Function<byte[], char[]> functionInvokeExact;
            if (JDKUtils.JVM_VERSION > 9) {
                try {
                    Class<?> cls = Class.forName("java.lang.StringLatin1");
                    MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(cls);
                    functionInvokeExact = (Function) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", MethodType.methodType(Function.class), MethodType.methodType((Class<?>) Object.class, (Class<?>) Object.class), lookupTrustedLookup.findStatic(cls, "toChars", MethodType.methodType((Class<?>) char[].class, (Class<?>) byte[].class)), MethodType.methodType((Class<?>) char[].class, (Class<?>) byte[].class)).getTarget().invokeExact();
                } catch (Throwable unused) {
                    functionInvokeExact = null;
                }
            } else {
                functionInvokeExact = null;
            }
            if (functionInvokeExact == null) {
                functionInvokeExact = new Function() { // from class: com.alibaba.fastjson2.util.b0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return TypeUtils.toAsciiCharArray((byte[]) obj);
                    }
                };
            }
            TO_CHARS = functionInvokeExact;
        }
    }

    /* JADX INFO: renamed from: com.alibaba.fastjson2.util.TypeUtils$X2 */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class C1778X2 {
        static final char END = '~';
        static final int SIZE2 = 95;
        static final char START = ' ';
        static final String[] chars;
        static final String[] chars2;

        static {
            String[] strArr = new String[128];
            for (char c10 = 0; c10 < 128; c10 = (char) (c10 + 1)) {
                strArr[c10] = Character.toString(c10);
            }
            chars = strArr;
            String[] strArr2 = new String[9025];
            for (char c11 = ' '; c11 <= '~'; c11 = (char) (c11 + 1)) {
                for (char c12 = ' '; c12 <= '~'; c12 = (char) (c12 + 1)) {
                    strArr2[((c11 - ' ') * 95) + (c12 - ' ')] = new String(new char[]{c11, c12});
                }
            }
            chars2 = strArr2;
        }
    }

    static {
        Class cls = Void.TYPE;
        METHOD_TYPE_VOO = MethodType.methodType(cls, Object.class, Object.class);
        METHOD_TYPE_OBJECT = MethodType.methodType(Object.class);
        METHOD_TYPE_OBJECT_OBJECT = MethodType.methodType((Class<?>) Object.class, (Class<?>) Object.class);
        Class cls2 = Integer.TYPE;
        METHOD_TYPE_INT_OBJECT = MethodType.methodType((Class<?>) cls2, (Class<?>) Object.class);
        Class cls3 = Long.TYPE;
        METHOD_TYPE_LONG_OBJECT = MethodType.methodType((Class<?>) cls3, (Class<?>) Object.class);
        METHOD_TYPE_VOID_OBJECT_INT = MethodType.methodType(cls, Object.class, cls2);
        METHOD_TYPE_OBJECT_LONG = MethodType.methodType((Class<?>) Object.class, (Class<?>) cls3);
        Class cls4 = Double.TYPE;
        METHOD_TYPE_OBJECT_DOUBLE = MethodType.methodType((Class<?>) Object.class, (Class<?>) cls4);
        METHOD_TYPE_VOID_LONG = MethodType.methodType((Class<?>) cls, (Class<?>) cls3);
        METHOD_TYPE_OBJECT_OBJECT_OBJECT = MethodType.methodType(Object.class, Object.class, Object.class);
        METHOD_TYPE_VOID = MethodType.methodType(cls);
        METHOD_TYPE_VOID_INT = MethodType.methodType((Class<?>) cls, (Class<?>) cls2);
        METHOD_TYPE_VOID_STRING = MethodType.methodType((Class<?>) cls, (Class<?>) String.class);
        METHOD_TYPE_OBJECT_INT = MethodType.methodType((Class<?>) Object.class, (Class<?>) cls2);
        BIGINT_INT32_MIN = BigInteger.valueOf(-2147483648L);
        BIGINT_INT32_MAX = BigInteger.valueOf(2147483647L);
        BIGINT_INT64_MIN = BigInteger.valueOf(Long.MIN_VALUE);
        BIGINT_INT64_MAX = BigInteger.valueOf(Long.MAX_VALUE);
        BIGINT_JAVASCRIPT_LOW = BigInteger.valueOf(LONG_JAVASCRIPT_LOW);
        BIGINT_JAVASCRIPT_HIGH = BigInteger.valueOf(LONG_JAVASCRIPT_HIGH);
        SMALL_10_POW = new double[]{1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
        SINGLE_SMALL_10_POW = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        BIG_10_POW = new double[]{1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};
        TINY_10_POW = new double[]{1.0E-16d, 1.0E-32d, 1.0E-64d, 1.0E-128d, 1.0E-256d};
        CACHE = new Cache();
        CHARS_UPDATER = AtomicReferenceFieldUpdater.newUpdater(Cache.class, char[].class, "chars");
        NAME_MAPPINGS = new IdentityHashMap();
        TYPE_MAPPINGS = new ConcurrentHashMap();
        Class clsLoadClass = loadClass("com.alibaba.fastjson.JSONObject");
        CLASS_JSON_OBJECT_1x = clsLoadClass;
        Field declaredField = null;
        if (clsLoadClass != null) {
            try {
                declaredField = clsLoadClass.getDeclaredField("map");
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        FIELD_JSON_OBJECT_1x_map = declaredField;
        CLASS_JSON_ARRAY_1x = loadClass("com.alibaba.fastjson.JSONArray");
        Map<Class, String> map = NAME_MAPPINGS;
        map.put(Byte.TYPE, "B");
        map.put(Short.TYPE, "S");
        map.put(cls2, "I");
        map.put(cls3, "J");
        map.put(Float.TYPE, "F");
        map.put(cls4, "D");
        map.put(Character.TYPE, "C");
        map.put(Boolean.TYPE, "Z");
        map.put(Object[].class, "[O");
        map.put(Object[][].class, "[[O");
        map.put(byte[].class, "[B");
        map.put(byte[][].class, "[[B");
        map.put(short[].class, "[S");
        map.put(short[][].class, "[[S");
        map.put(int[].class, "[I");
        map.put(int[][].class, "[[I");
        map.put(long[].class, "[J");
        map.put(long[][].class, "[[J");
        map.put(float[].class, "[F");
        map.put(float[][].class, "[[F");
        map.put(double[].class, "[D");
        map.put(double[][].class, "[[D");
        map.put(char[].class, "[C");
        map.put(char[][].class, "[[C");
        map.put(boolean[].class, "[Z");
        map.put(boolean[][].class, "[[Z");
        map.put(Byte[].class, "[Byte");
        map.put(Byte[][].class, "[[Byte");
        map.put(Short[].class, "[Short");
        map.put(Short[][].class, "[[Short");
        map.put(Integer[].class, "[Integer");
        map.put(Integer[][].class, "[[Integer");
        map.put(Long[].class, "[Long");
        map.put(Long[][].class, "[[Long");
        map.put(Float[].class, "[Float");
        map.put(Float[][].class, "[[Float");
        map.put(Double[].class, "[Double");
        map.put(Double[][].class, "[[Double");
        map.put(Character[].class, "[Character");
        map.put(Character[][].class, "[[Character");
        map.put(Boolean[].class, "[Boolean");
        map.put(Boolean[][].class, "[[Boolean");
        map.put(String[].class, "[String");
        map.put(String[][].class, "[[String");
        map.put(BigDecimal[].class, "[BigDecimal");
        map.put(BigDecimal[][].class, "[[BigDecimal");
        map.put(BigInteger[].class, "[BigInteger");
        map.put(BigInteger[][].class, "[[BigInteger");
        map.put(UUID[].class, "[UUID");
        map.put(UUID[][].class, "[[UUID");
        map.put(Object.class, "Object");
        map.put(HashMap.class, "M");
        Map<String, Class> map2 = TYPE_MAPPINGS;
        map2.put("HashMap", HashMap.class);
        map2.put("java.util.HashMap", HashMap.class);
        map.put(LinkedHashMap.class, "LM");
        map2.put("LinkedHashMap", LinkedHashMap.class);
        map2.put("java.util.LinkedHashMap", LinkedHashMap.class);
        map.put(TreeMap.class, "TM");
        map2.put("TreeMap", TreeMap.class);
        map.put(ArrayList.class, "A");
        map2.put("ArrayList", ArrayList.class);
        map2.put("java.util.ArrayList", ArrayList.class);
        map.put(LinkedList.class, "LA");
        map2.put("LA", LinkedList.class);
        map2.put("LinkedList", LinkedList.class);
        map2.put("java.util.LinkedList", LinkedList.class);
        map2.put("java.util.concurrent.ConcurrentLinkedQueue", ConcurrentLinkedQueue.class);
        map2.put("java.util.concurrent.ConcurrentLinkedDeque", ConcurrentLinkedDeque.class);
        map.put(HashSet.class, "HashSet");
        map.put(TreeSet.class, "TreeSet");
        map.put(LinkedHashSet.class, "LinkedHashSet");
        map.put(ConcurrentHashMap.class, "ConcurrentHashMap");
        map.put(ConcurrentLinkedQueue.class, "ConcurrentLinkedQueue");
        map.put(ConcurrentLinkedDeque.class, "ConcurrentLinkedDeque");
        map.put(JSONObject.class, "JSONObject");
        map.put(JSONArray.class, "JSONArray");
        map.put(Currency.class, "Currency");
        map.put(TimeUnit.class, "TimeUnit");
        Class[] clsArr = {Object.class, Cloneable.class, AutoCloseable.class, Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, Hashtable.class, TreeMap.class, IdentityHashMap.class, WeakHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, LinkedList.class, TimeUnit.class, ConcurrentHashMap.class, AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Number.class, String.class, BigDecimal.class, BigInteger.class, BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, Currency.class, SimpleDateFormat.class, JSONObject.class, JSONArray.class, ConcurrentSkipListMap.class, ConcurrentSkipListSet.class};
        for (int i10 = 0; i10 < 68; i10++) {
            Class cls5 = clsArr[i10];
            Map<String, Class> map3 = TYPE_MAPPINGS;
            map3.put(cls5.getSimpleName(), cls5);
            map3.put(cls5.getName(), cls5);
            NAME_MAPPINGS.put(cls5, cls5.getSimpleName());
        }
        Map<String, Class> map4 = TYPE_MAPPINGS;
        map4.put("JO10", JSONObject1O.class);
        map4.put("[O", Object[].class);
        map4.put("[Ljava.lang.Object;", Object[].class);
        map4.put("[java.lang.Object", Object[].class);
        map4.put("[Object", Object[].class);
        map4.put("StackTraceElement", StackTraceElement.class);
        map4.put("[StackTraceElement", StackTraceElement[].class);
        String[] strArr = {"java.util.Collections$UnmodifiableMap", "java.util.Collections$UnmodifiableCollection"};
        for (int i11 = 0; i11 < 2; i11++) {
            Class clsLoadClass2 = loadClass(strArr[i11]);
            TYPE_MAPPINGS.put(clsLoadClass2.getName(), clsLoadClass2);
        }
        Class cls6 = CLASS_JSON_OBJECT_1x;
        if (cls6 != null) {
            Map<String, Class> map5 = TYPE_MAPPINGS;
            map5.putIfAbsent("JO1", cls6);
            map5.putIfAbsent(cls6.getName(), cls6);
        }
        Class cls7 = CLASS_JSON_ARRAY_1x;
        if (cls7 != null) {
            Map<String, Class> map6 = TYPE_MAPPINGS;
            map6.putIfAbsent("JA1", cls7);
            map6.putIfAbsent(cls7.getName(), cls7);
        }
        Map<Class, String> map7 = NAME_MAPPINGS;
        map7.put(new HashMap().keySet().getClass(), "Set");
        map7.put(new LinkedHashMap().keySet().getClass(), "Set");
        map7.put(new TreeMap().keySet().getClass(), "Set");
        map7.put(new ConcurrentHashMap().keySet().getClass(), "Set");
        map7.put(new ConcurrentSkipListMap().keySet().getClass(), "Set");
        Map<String, Class> map8 = TYPE_MAPPINGS;
        map8.put("Set", HashSet.class);
        map7.put(new HashMap().values().getClass(), "List");
        map7.put(new LinkedHashMap().values().getClass(), "List");
        map7.put(new TreeMap().values().getClass(), "List");
        map7.put(new ConcurrentHashMap().values().getClass(), "List");
        map7.put(new ConcurrentSkipListMap().values().getClass(), "List");
        map8.put("List", ArrayList.class);
        map8.put("java.util.ImmutableCollections$Map1", HashMap.class);
        map8.put("java.util.ImmutableCollections$MapN", LinkedHashMap.class);
        map8.put("java.util.ImmutableCollections$Set12", LinkedHashSet.class);
        map8.put("java.util.ImmutableCollections$SetN", LinkedHashSet.class);
        map8.put("java.util.ImmutableCollections$List12", ArrayList.class);
        map8.put("java.util.ImmutableCollections$ListN", ArrayList.class);
        map8.put("java.util.ImmutableCollections$SubList", ArrayList.class);
        for (Map.Entry<Class, String> entry : map7.entrySet()) {
            TYPE_MAPPINGS.putIfAbsent(entry.getValue(), entry.getKey());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Class<T> cls, ObjectReaderProvider objectReaderProvider) {
        Function function;
        Function function2;
        Function typeConvert;
        if (obj == 0) {
            return null;
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (cls == Date.class) {
            return (T) toDate(obj);
        }
        if (cls == Instant.class) {
            return (T) toInstant(obj);
        }
        if (cls == LocalDate.class && (obj instanceof Date)) {
            return (T) ((Date) obj).toInstant().atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDate();
        }
        if (cls == LocalDateTime.class && (obj instanceof Date)) {
            return (T) ((Date) obj).toInstant().atZone(DateUtils.DEFAULT_ZONE_ID).toLocalDateTime();
        }
        if (obj instanceof Date) {
            long time = ((Date) obj).getTime();
            String name = cls.getName();
            if (name.equals("java.sql.Date")) {
                return (T) JdbcSupport.createDate(time);
            }
            if (name.equals("java.sql.Time")) {
                return (T) JdbcSupport.createTime(time);
            }
            if (name.equals("java.sql.Timestamp")) {
                return (T) JdbcSupport.createTimestamp(time);
            }
        }
        if (cls == String.class) {
            return ((obj instanceof Character) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Enum)) ? (T) obj.toString() : (T) JSON.toJSONString(obj);
        }
        if (cls == AtomicInteger.class) {
            return (T) new AtomicInteger(toIntValue(obj));
        }
        if (cls == AtomicLong.class) {
            return (T) new AtomicLong(toLongValue(obj));
        }
        if (cls == AtomicBoolean.class) {
            return (T) new AtomicBoolean(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Map) {
            return (T) objectReaderProvider.getObjectReader(cls).createInstance((Map) obj, 0L);
        }
        Function typeConvert2 = objectReaderProvider.getTypeConvert(obj.getClass(), cls);
        if (typeConvert2 != null) {
            return (T) typeConvert2.apply(obj);
        }
        if (cls.isEnum()) {
            ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls);
            if (!(objectReader instanceof ObjectReaderImplEnum)) {
                return (T) objectReader.readObject(JSONReader.m6226of(JSON.toJSONString(obj)), cls, null, 0L);
            }
            if (obj instanceof Integer) {
                return (T) ((ObjectReaderImplEnum) objectReader).m6368of(((Integer) obj).intValue());
            }
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty()) {
                if (cls == StringBuffer.class) {
                    return (T) new StringBuffer();
                }
                if (cls == StringBuilder.class) {
                    return (T) new StringBuilder();
                }
            }
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            char cCharAt = str.trim().charAt(0);
            return (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls).readObject((cCharAt == '\"' || cCharAt == '{' || cCharAt == '[') ? JSONReader.m6226of(str) : JSONReader.m6226of(JSON.toJSONString(str)), cls, null, 0L);
        }
        if (obj instanceof Collection) {
            return (T) objectReaderProvider.getObjectReader(cls).createInstance((Collection) obj);
        }
        String name2 = cls.getName();
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            long jLongValue = ((Number) obj).longValue();
            if (name2.equals("java.time.LocalDateTime")) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), DateUtils.DEFAULT_ZONE_ID);
            }
            if (name2.equals("java.sql.Date")) {
                return (T) JdbcSupport.createDate(jLongValue);
            }
            if (name2.equals("java.sql.Time")) {
                return (T) JdbcSupport.createTime(jLongValue);
            }
            if (name2.equals("java.sql.Timestamp")) {
                return (T) JdbcSupport.createTimestamp(jLongValue);
            }
        }
        if (obj.getClass().getName().equals("org.bson.types.Decimal128") && cls == Double.class) {
            ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
            if ((objectWriter instanceof ObjectWriterPrimitiveImpl) && (function2 = ((ObjectWriterPrimitiveImpl) objectWriter).getFunction()) != null && (typeConvert = objectReaderProvider.getTypeConvert(function2.apply(obj).getClass(), cls)) != null) {
                return (T) typeConvert.apply(obj);
            }
        }
        ObjectWriter objectWriter2 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
        if ((objectWriter2 instanceof ObjectWriterPrimitiveImpl) && (function = ((ObjectWriterPrimitiveImpl) objectWriter2).getFunction()) != null) {
            T t10 = (T) function.apply(obj);
            if (cls.isInstance(t10)) {
                return t10;
            }
        }
        C1608k0.m6297a("can not cast to ", name2, ", from ", obj.getClass());
        return null;
    }

    public static int compare(Object obj, Object obj2) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Class<?> cls = obj.getClass();
        Class<?> cls2 = obj2.getClass();
        if (cls == cls2) {
            return ((Comparable) obj).compareTo(obj2);
        }
        if (cls == BigDecimal.class) {
            if (cls2 == Integer.class || cls2 == Long.class) {
                obj2 = BigDecimal.valueOf(((Number) obj2).longValue());
            } else if (cls2 == Float.class || cls2 == Double.class) {
                obj2 = BigDecimal.valueOf(((Number) obj2).doubleValue());
            } else if (cls2 == BigInteger.class) {
                bigDecimal = new BigDecimal((BigInteger) obj2);
                obj2 = bigDecimal;
            }
        } else if (cls == BigInteger.class) {
            if (cls2 == Integer.class || cls2 == Long.class) {
                obj2 = BigInteger.valueOf(((Number) obj2).longValue());
            } else {
                if (cls2 == Float.class || cls2 == Double.class) {
                    obj2 = BigDecimal.valueOf(((Number) obj2).doubleValue());
                    bigDecimal2 = new BigDecimal((BigInteger) obj);
                } else if (cls2 == BigDecimal.class) {
                    bigDecimal2 = new BigDecimal((BigInteger) obj);
                }
                obj = bigDecimal2;
            }
        } else if (cls == Long.class) {
            if (cls2 == Integer.class) {
                return Long.compare(((Long) obj).longValue(), ((Integer) obj2).intValue());
            }
            if (cls2 == BigDecimal.class) {
                obj = BigDecimal.valueOf(((Long) obj).longValue());
            } else {
                if (cls2 == Float.class || cls2 == Double.class) {
                    return Double.compare(((Long) obj).longValue(), ((Number) obj2).doubleValue());
                }
                if (cls2 == BigInteger.class) {
                    obj = BigInteger.valueOf(((Long) obj).longValue());
                } else if (cls2 == String.class) {
                    obj = BigDecimal.valueOf(((Long) obj).longValue());
                    bigDecimal = new BigDecimal((String) obj2);
                    obj2 = bigDecimal;
                }
            }
        } else if (cls == Integer.class) {
            if (cls2 == Long.class) {
                return Long.compare(((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
            if (cls2 == BigDecimal.class) {
                obj = BigDecimal.valueOf(((Integer) obj).intValue());
            } else if (cls2 == BigInteger.class) {
                obj = BigInteger.valueOf(((Integer) obj).intValue());
            } else {
                if (cls2 == Float.class || cls2 == Double.class) {
                    return Double.compare(((Integer) obj).intValue(), ((Number) obj2).doubleValue());
                }
                if (cls2 == String.class) {
                    obj = BigDecimal.valueOf(((Integer) obj).intValue());
                    bigDecimal = new BigDecimal((String) obj2);
                    obj2 = bigDecimal;
                }
            }
        } else if (cls == Double.class) {
            if (cls2 == Integer.class || cls2 == Long.class || cls2 == Float.class) {
                return Double.compare(((Double) obj).doubleValue(), ((Number) obj2).doubleValue());
            }
            if (cls2 == BigDecimal.class) {
                obj = BigDecimal.valueOf(((Double) obj).doubleValue());
            } else {
                if (cls2 == String.class) {
                    obj = BigDecimal.valueOf(((Double) obj).doubleValue());
                    bigDecimal = new BigDecimal((String) obj2);
                } else if (cls2 == BigInteger.class) {
                    obj = BigDecimal.valueOf(((Double) obj).doubleValue());
                    bigDecimal = new BigDecimal((BigInteger) obj2);
                }
                obj2 = bigDecimal;
            }
        } else if (cls == Float.class) {
            if (cls2 == Integer.class || cls2 == Long.class || cls2 == Double.class) {
                return Double.compare(((Float) obj).floatValue(), ((Number) obj2).doubleValue());
            }
            if (cls2 == BigDecimal.class) {
                obj = BigDecimal.valueOf(((Float) obj).floatValue());
            } else {
                if (cls2 == String.class) {
                    obj = BigDecimal.valueOf(((Float) obj).floatValue());
                    bigDecimal = new BigDecimal((String) obj2);
                } else if (cls2 == BigInteger.class) {
                    obj = BigDecimal.valueOf(((Float) obj).floatValue());
                    bigDecimal = new BigDecimal((BigInteger) obj2);
                }
                obj2 = bigDecimal;
            }
        } else if (cls == String.class) {
            String str = (String) obj;
            if (cls2 == Integer.class || cls2 == Long.class) {
                try {
                    return Long.compare(Long.parseLong(str), ((Number) obj2).longValue());
                } catch (NumberFormatException unused) {
                    obj = new BigDecimal(str);
                    obj2 = BigDecimal.valueOf(((Number) obj2).longValue());
                }
            } else {
                if (cls2 == Float.class || cls2 == Double.class) {
                    return Double.compare(Double.parseDouble(str), ((Number) obj2).doubleValue());
                }
                if (cls2 == BigInteger.class) {
                    obj = new BigInteger(str);
                } else if (cls2 == BigDecimal.class) {
                    obj = new BigDecimal(str);
                }
            }
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca A[PHI: r18
  0x00ca: PHI (r18v2 double) = (r18v0 double), (r18v4 double) binds: [B:85:0x0102, B:58:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double doubleValue(boolean r20, int r21, byte[] r22, int r23) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.doubleValue(boolean, int, byte[], int):double");
    }

    public static float floatValue(boolean z10, int i10, byte[] bArr, int i11) {
        int i12;
        int i13;
        int i14;
        FDBigInteger fDBigIntegerRightInplaceSub;
        boolean z11;
        int i15 = i11;
        int length = SINGLE_SMALL_10_POW.length - 1;
        int i16 = 8;
        int iMin = Math.min(i15, 8);
        int i17 = bArr[0] + JSONB.Constants.BC_INT64_BYTE_ZERO;
        for (int i18 = 1; i18 < iMin; i18++) {
            i17 = ((i17 * 10) + bArr[i18]) - 48;
        }
        float f10 = i17;
        int i19 = i10 - iMin;
        if (i15 <= 7) {
            if (i19 == 0 || f10 == 0.0f) {
                return z10 ? -f10 : f10;
            }
            if (i19 >= 0) {
                if (i19 <= length) {
                    float f11 = f10 * SINGLE_SMALL_10_POW[i19];
                    return z10 ? -f11 : f11;
                }
                int i20 = 7 - iMin;
                if (i19 <= length + i20) {
                    float[] fArr = SINGLE_SMALL_10_POW;
                    float f12 = f10 * fArr[i20] * fArr[i19 - i20];
                    return z10 ? -f12 : f12;
                }
            } else if (i19 >= (-length)) {
                float f13 = f10 / SINGLE_SMALL_10_POW[-i19];
                return z10 ? -f13 : f13;
            }
        } else if (i10 >= i15 && i15 + i10 <= 15) {
            long j10 = i17;
            while (iMin < i15) {
                j10 = (j10 * 10) + ((long) (bArr[iMin] + JSONB.Constants.BC_INT64_BYTE_ZERO));
                iMin++;
            }
            float f14 = (float) (j10 * SMALL_10_POW[i10 - i15]);
            return z10 ? -f14 : f14;
        }
        double d10 = f10;
        if (i19 > 0) {
            if (i10 > 39) {
                return z10 ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            }
            int i21 = i19 & 15;
            if (i21 != 0) {
                d10 *= SMALL_10_POW[i21];
            }
            int i22 = i19 >> 4;
            if (i22 != 0) {
                int i23 = 0;
                while (i22 > 0) {
                    if ((i22 & 1) != 0) {
                        d10 *= BIG_10_POW[i23];
                    }
                    i23++;
                    i22 >>= 1;
                }
            }
        } else if (i19 < 0) {
            int i24 = -i19;
            if (i10 < -46) {
                return z10 ? -0.0f : 0.0f;
            }
            int i25 = i24 & 15;
            if (i25 != 0) {
                d10 /= SMALL_10_POW[i25];
            }
            int i26 = i24 >> 4;
            if (i26 != 0) {
                int i27 = 0;
                while (i26 > 0) {
                    if ((i26 & 1) != 0) {
                        d10 *= TINY_10_POW[i27];
                    }
                    i27++;
                    i26 >>= 1;
                }
            }
        }
        float fMax = Math.max(Float.MIN_VALUE, Math.min(Float.MAX_VALUE, (float) d10));
        if (i15 > 200) {
            bArr[200] = 49;
            i15 = 201;
        }
        int i28 = i15;
        FDBigInteger fDBigInteger = new FDBigInteger(i17, bArr, iMin, i28);
        int i29 = i10 - i28;
        int iFloatToRawIntBits = Float.floatToRawIntBits(fMax);
        int iMax = Math.max(0, -i29);
        int iMax2 = Math.max(0, i29);
        FDBigInteger fDBigIntegerMultByPow52 = fDBigInteger.multByPow52(iMax2, 0);
        fDBigIntegerMultByPow52.makeImmutable();
        FDBigInteger fDBigIntegerLeftShift = null;
        int i30 = 0;
        while (true) {
            int i31 = iFloatToRawIntBits >>> 23;
            int i32 = 8388607 & iFloatToRawIntBits;
            if (i31 > 0) {
                i12 = i32 | 8388608;
            } else {
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i32) - i16;
                i12 = i32 << iNumberOfLeadingZeros;
                i31 = 1 - iNumberOfLeadingZeros;
            }
            int i33 = i31 - 127;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i12);
            int i34 = i12 >>> iNumberOfTrailingZeros;
            int i35 = (i31 - 150) + iNumberOfTrailingZeros;
            int i36 = 24 - iNumberOfTrailingZeros;
            if (i35 >= 0) {
                i14 = iMax + i35;
                i13 = iMax2;
            } else {
                i13 = iMax2 - i35;
                i14 = iMax;
            }
            int i37 = i33 <= -127 ? i33 + iNumberOfTrailingZeros + 127 : iNumberOfTrailingZeros + 1;
            int i38 = i14 + i37;
            int i39 = i13 + i37;
            int iMin2 = Math.min(i38, Math.min(i39, i14));
            int i40 = i39 - iMin2;
            int i41 = i14 - iMin2;
            FDBigInteger fDBigIntegerValueOfMulPow52 = FDBigInteger.valueOfMulPow52(i34, iMax, i38 - iMin2);
            if (fDBigIntegerLeftShift == null || i30 != i40) {
                fDBigIntegerLeftShift = fDBigIntegerMultByPow52.leftShift(i40);
                i30 = i40;
            }
            int iCmp = fDBigIntegerValueOfMulPow52.cmp(fDBigIntegerLeftShift);
            if (iCmp <= 0) {
                if (iCmp >= 0) {
                    break;
                }
                fDBigIntegerRightInplaceSub = fDBigIntegerLeftShift.rightInplaceSub(fDBigIntegerValueOfMulPow52);
                z11 = false;
            } else {
                fDBigIntegerRightInplaceSub = fDBigIntegerValueOfMulPow52.leftInplaceSub(fDBigIntegerLeftShift);
                if (i36 != 1 || i35 <= -126 || i41 - 1 >= 0) {
                    z11 = true;
                } else {
                    fDBigIntegerRightInplaceSub = fDBigIntegerRightInplaceSub.leftShift(1);
                    z11 = true;
                    i41 = 0;
                }
            }
            int iCmpPow52 = fDBigIntegerRightInplaceSub.cmpPow52(iMax, i41);
            if (iCmpPow52 < 0) {
                break;
            }
            if (iCmpPow52 != 0) {
                iFloatToRawIntBits += z11 ? -1 : 1;
                if (iFloatToRawIntBits == 0 || iFloatToRawIntBits == 2139095040) {
                    break;
                }
                i16 = 8;
            } else if ((iFloatToRawIntBits & 1) != 0) {
                iFloatToRawIntBits += z11 ? -1 : 1;
            }
        }
        if (z10) {
            iFloatToRawIntBits |= Integer.MIN_VALUE;
        }
        return Float.intBitsToFloat(iFloatToRawIntBits);
    }

    public static Class<?> getArrayClass(Class cls) {
        return cls == Integer.TYPE ? int[].class : cls == Byte.TYPE ? byte[].class : cls == Short.TYPE ? short[].class : cls == Long.TYPE ? long[].class : cls == String.class ? String[].class : cls == Object.class ? Object[].class : Array.newInstance((Class<?>) cls, 1).getClass();
    }

    public static Class<?> getClass(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getClass(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : getClass(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return getClass(upperBounds[0]);
            }
        }
        return type instanceof GenericArrayType ? getArrayClass(getClass(((GenericArrayType) type).getGenericComponentType())) : Object.class;
    }

    public static Object getDefaultValue(Type type) {
        if (type == Integer.TYPE) {
            return 0;
        }
        if (type == Long.TYPE) {
            return 0L;
        }
        if (type == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (type == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (type == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (type == Short.TYPE) {
            return (short) 0;
        }
        if (type == Byte.TYPE) {
            return (byte) 0;
        }
        if (type == Character.TYPE) {
            return (char) 0;
        }
        if (type == Optional.class) {
            return Optional.empty();
        }
        if (type == OptionalInt.class) {
            return OptionalInt.empty();
        }
        if (type == OptionalLong.class) {
            return OptionalLong.empty();
        }
        if (type == OptionalDouble.class) {
            return OptionalDouble.empty();
        }
        return null;
    }

    public static Map getInnerMap(Map map) {
        Field field;
        Class cls = CLASS_JSON_OBJECT_1x;
        if (cls != null && cls.isInstance(map) && (field = FIELD_JSON_OBJECT_1x_map) != null) {
            try {
                return (Map) field.get(map);
            } catch (IllegalAccessException unused) {
            }
        }
        return map;
    }

    public static Type getMapValueType(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length == 2 ? actualTypeArguments[1] : Object.class;
    }

    public static Class<?> getMapping(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getMapping(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : getMapping(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return getMapping(upperBounds[0]);
            }
        }
        return type instanceof GenericArrayType ? getArrayClass(getClass(((GenericArrayType) type).getGenericComponentType())) : Object.class;
    }

    public static String getTypeName(Class cls) {
        Map<Class, String> map = NAME_MAPPINGS;
        String str = map.get(cls);
        if (str != null) {
            return str;
        }
        if (Proxy.isProxyClass(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces.length > 0) {
                cls = interfaces[0];
            }
        }
        String typeName = cls.getTypeName();
        typeName.getClass();
        if (typeName.equals("com.alibaba.fastjson.JSONObject")) {
            map.putIfAbsent(cls, "JO1");
            return map.get(cls);
        }
        if (typeName.equals("com.alibaba.fastjson.JSONArray")) {
            map.putIfAbsent(cls, "JA1");
            return map.get(cls);
        }
        int iIndexOf = typeName.indexOf(36);
        if (iIndexOf != -1 && isInteger(typeName.substring(iIndexOf + 1))) {
            Class superclass = cls.getSuperclass();
            if (Map.class.isAssignableFrom(superclass)) {
                return getTypeName(superclass);
            }
        }
        return typeName;
    }

    public static Type intern(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        return (rawType == List.class && actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) ? PARAM_TYPE_LIST_STR : type;
    }

    public static boolean isFunction(Class cls) {
        if (!cls.isInterface()) {
            return $assertionsDisabled;
        }
        if (cls.getName().startsWith("java.util.function.")) {
            return true;
        }
        return cls.isAnnotationPresent(FunctionalInterface.class);
    }

    public static boolean isInt32(BigInteger bigInteger) {
        int i10;
        long j10 = JDKUtils.FIELD_BIGINTEGER_MAG_OFFSET;
        if (j10 == -1) {
            if (bigInteger.compareTo(BIGINT_INT32_MIN) < 0 || bigInteger.compareTo(BIGINT_INT32_MAX) > 0) {
                return $assertionsDisabled;
            }
            return true;
        }
        int[] iArr = (int[]) JDKUtils.UNSAFE.getObject(bigInteger, j10);
        if (iArr.length == 0 || (iArr.length == 1 && ((i10 = iArr[0]) >= 0 || (i10 == Integer.MIN_VALUE && bigInteger.signum() == -1)))) {
            return true;
        }
        return $assertionsDisabled;
    }

    public static boolean isInt64(BigInteger bigInteger) {
        long j10 = JDKUtils.FIELD_BIGINTEGER_MAG_OFFSET;
        if (j10 != -1) {
            int[] iArr = (int[]) JDKUtils.UNSAFE.getObject(bigInteger, j10);
            if (iArr.length <= 1) {
                return true;
            }
            if (iArr.length == 2) {
                int i10 = iArr[0];
                if (i10 >= 0 || (i10 == Integer.MIN_VALUE && iArr[1] == 0 && bigInteger.signum() == -1)) {
                    return true;
                }
                return $assertionsDisabled;
            }
        }
        if (bigInteger.compareTo(BIGINT_INT64_MIN) < 0 || bigInteger.compareTo(BIGINT_INT64_MAX) > 0) {
            return $assertionsDisabled;
        }
        return true;
    }

    public static boolean isInteger(BigDecimal bigDecimal) {
        int iScale = bigDecimal.scale();
        if (iScale == 0) {
            return true;
        }
        if (bigDecimal.precision() < 20) {
            long j10 = JDKUtils.FIELD_DECIMAL_INT_COMPACT_OFFSET;
            if (j10 != -1) {
                long j11 = JDKUtils.UNSAFE.getLong(bigDecimal, j10);
                switch (iScale) {
                    case 1:
                        if (j11 % 10 == 0) {
                        }
                        break;
                    case 2:
                        if (j11 % 100 == 0) {
                        }
                        break;
                    case 3:
                        if (j11 % 1000 == 0) {
                        }
                        break;
                    case 4:
                        if (j11 % 10000 == 0) {
                        }
                        break;
                    case 5:
                        if (j11 % 100000 == 0) {
                        }
                        break;
                    case 6:
                        if (j11 % 1000000 == 0) {
                        }
                        break;
                    case 7:
                        if (j11 % 10000000 == 0) {
                        }
                        break;
                    case 8:
                        if (j11 % 100000000 == 0) {
                        }
                        break;
                    case 9:
                        if (j11 % 1000000000 == 0) {
                        }
                        break;
                }
                return true;
            }
        }
        if (AbstractC1843z.m6535a(bigDecimal).scale() == 0) {
            return true;
        }
        return $assertionsDisabled;
    }

    public static boolean isJavaScriptSupport(BigDecimal bigDecimal) {
        boolean z10 = bigDecimal.precision() < 16 || isJavaScriptSupport(bigDecimal.unscaledValue());
        if (z10 || bigDecimal.scale() == 0) {
            return z10;
        }
        if (bigDecimal.compareTo(BigDecimal.valueOf(bigDecimal.doubleValue())) == 0) {
            return true;
        }
        return $assertionsDisabled;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isNumber(java.lang.String r11) {
        /*
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
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.isNumber(java.lang.String):boolean");
    }

    public static boolean isProxy(Class<?> cls) {
        String name = cls.getName();
        if (name.indexOf(36) != -1 && (name.contains("$EnhancerBySpringCGLIB$") || name.contains("$EnhancerByCGLIB$") || name.contains("$FastClassBySpringCGLIB$") || name.contains("$FastClassByCGLIB$") || name.contains("$EnhancerBySpringCGLIB$") || name.contains("$EnhancerByCGLIB$"))) {
            return true;
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            String name2 = cls2.getName();
            if (name2.equals("javassist.util.proxy.ProxyObject") || name2.equals("org.springframework.cglib.proxy.Factory") || name2.equals("org.springframework.context.annotation.ConfigurationClassEnhancer$EnhancedConfiguration") || name2.equals("org.springframework.cloud.context.config.annotation.RefreshScope") || name2.equals("org.mockito.cglib.proxy.Factory") || name2.equals("org.apache.ibatis.javassist.util.proxy.ProxyObject") || name2.equals("net.sf.cglib.proxy.Factory") || name2.equals("org.hibernate.proxy.HibernateProxy")) {
                return true;
            }
            if (name2.startsWith("org.springframework.cloud.context.config.annotation.") && name2.endsWith("RefreshScope")) {
                return true;
            }
        }
        if (name.contains("$SpringCGLIB$") || name.contains("$SpringCGLIB$") || name.contains("$EnhancerBySpringCGLIB$")) {
            return true;
        }
        return $assertionsDisabled;
    }

    public static boolean isUUID(String str) {
        if (str == null) {
            return $assertionsDisabled;
        }
        if (str.length() == 32) {
            for (int i10 = 0; i10 < 32; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'F') && (cCharAt < 'a' || cCharAt > 'f'))) {
                    return $assertionsDisabled;
                }
            }
            return true;
        }
        if (str.length() != 36) {
            return $assertionsDisabled;
        }
        for (int i11 = 0; i11 < 36; i11++) {
            char cCharAt2 = str.charAt(i11);
            if (i11 == 8 || i11 == 13 || i11 == 18 || i11 == 23) {
                if (cCharAt2 != '-') {
                    return $assertionsDisabled;
                }
            } else if ((cCharAt2 < '0' || cCharAt2 > '9') && ((cCharAt2 < 'A' || cCharAt2 > 'F') && (cCharAt2 < 'a' || cCharAt2 > 'f'))) {
                return $assertionsDisabled;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Class loadClass(String str) {
        if (str.length() >= 192) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2073921873:
                if (str.equals("java.util.OptionalInt")) {
                    b10 = 0;
                }
                break;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    b10 = 1;
                }
                break;
            case -2010664371:
                if (str.equals("java.io.IOException")) {
                    b10 = 2;
                }
                break;
            case -1939501217:
                if (str.equals("Object")) {
                    b10 = 3;
                }
                break;
            case -1932803762:
                if (str.equals("HashMap")) {
                    b10 = 4;
                }
                break;
            case -1932797868:
                if (str.equals("HashSet")) {
                    b10 = 5;
                }
                break;
            case -1899270121:
                if (str.equals("java.util.LinkedList")) {
                    b10 = 6;
                }
                break;
            case -1808118735:
                if (str.equals("String")) {
                    b10 = 7;
                }
                break;
            case -1671476816:
                if (str.equals("ConcurrentLinkedDeque")) {
                    b10 = 8;
                }
                break;
            case -1659005919:
                if (str.equals("ConcurrentLinkedQueue")) {
                    b10 = 9;
                }
                break;
            case -1418007307:
                if (str.equals("LinkedHashMap")) {
                    b10 = 10;
                }
                break;
            case -1418001413:
                if (str.equals("LinkedHashSet")) {
                    b10 = 11;
                }
                break;
            case -1402722386:
                if (str.equals("java.util.HashMap")) {
                    b10 = 12;
                }
                break;
            case -1402716492:
                if (str.equals("java.util.HashSet")) {
                    b10 = 13;
                }
                break;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    b10 = 14;
                }
                break;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    b10 = 15;
                }
                break;
            case -1374008726:
                if (str.equals("byte[]")) {
                    b10 = JSONB.Constants.BC_INT32_NUM_16;
                }
                break;
            case -1361632968:
                if (str.equals("char[]")) {
                    b10 = 17;
                }
                break;
            case -1325958191:
                if (str.equals("double")) {
                    b10 = 18;
                }
                break;
            case -1114099497:
                if (str.equals("java.util.ArrayList")) {
                    b10 = 19;
                }
                break;
            case -1097129250:
                if (str.equals("long[]")) {
                    b10 = 20;
                }
                break;
            case -1074506598:
                if (str.equals("java.util.Collections$SingletonList")) {
                    b10 = 21;
                }
                break;
            case -958795145:
                if (str.equals("LinkedList")) {
                    b10 = 22;
                }
                break;
            case -766441794:
                if (str.equals("float[]")) {
                    b10 = 23;
                }
                break;
            case -761719520:
                if (str.equals("java.util.Optional")) {
                    b10 = 24;
                }
                break;
            case -530663260:
                if (str.equals("java.lang.Class")) {
                    b10 = 25;
                }
                break;
            case -413661986:
                if (str.equals("java.util.Collections$EmptyMap")) {
                    b10 = 26;
                }
                break;
            case -413656092:
                if (str.equals("java.util.Collections$EmptySet")) {
                    b10 = 27;
                }
                break;
            case -113680546:
                if (str.equals("Calendar")) {
                    b10 = 28;
                }
                break;
            case 65:
                if (str.equals("A")) {
                    b10 = 29;
                }
                break;
            case 66:
                if (str.equals("B")) {
                    b10 = 30;
                }
                break;
            case 67:
                if (str.equals("C")) {
                    b10 = 31;
                }
                break;
            case 68:
                if (str.equals("D")) {
                    b10 = 32;
                }
                break;
            case 70:
                if (str.equals("F")) {
                    b10 = 33;
                }
                break;
            case 73:
                if (str.equals("I")) {
                    b10 = 34;
                }
                break;
            case 74:
                if (str.equals("J")) {
                    b10 = 35;
                }
                break;
            case 77:
                if (str.equals("M")) {
                    b10 = 36;
                }
                break;
            case Opcodes.IASTORE /* 79 */:
                if (str.equals("O")) {
                    b10 = 37;
                }
                break;
            case Opcodes.AASTORE /* 83 */:
                if (str.equals("S")) {
                    b10 = 38;
                }
                break;
            case 90:
                if (str.equals("Z")) {
                    b10 = 39;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b10 = 40;
                }
                break;
            case 2433:
                if (str.equals("LM")) {
                    b10 = 41;
                }
                break;
            case 2887:
                if (str.equals("[B")) {
                    b10 = 42;
                }
                break;
            case 2888:
                if (str.equals("[C")) {
                    b10 = 43;
                }
                break;
            case 2889:
                if (str.equals("[D")) {
                    b10 = 44;
                }
                break;
            case 2891:
                if (str.equals("[F")) {
                    b10 = 45;
                }
                break;
            case 2894:
                if (str.equals("[I")) {
                    b10 = 46;
                }
                break;
            case 2895:
                if (str.equals("[J")) {
                    b10 = JSONB.Constants.BC_INT32_NUM_MAX;
                }
                break;
            case 2900:
                if (str.equals("[O")) {
                    b10 = JSONB.Constants.BC_INT32_BYTE_MIN;
                }
                break;
            case 2904:
                if (str.equals("[S")) {
                    b10 = 49;
                }
                break;
            case 2911:
                if (str.equals("[Z")) {
                    b10 = 50;
                }
                break;
            case 73612:
                if (str.equals("JO1")) {
                    b10 = 51;
                }
                break;
            case 77116:
                if (str.equals("Map")) {
                    b10 = 52;
                }
                break;
            case 83010:
                if (str.equals("Set")) {
                    b10 = 53;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    b10 = 54;
                }
                break;
            case 2122702:
                if (str.equals("Date")) {
                    b10 = 55;
                }
                break;
            case 2368702:
                if (str.equals("List")) {
                    b10 = JSONB.Constants.BC_INT32_BYTE_ZERO;
                }
                break;
            case 2616251:
                if (str.equals("UUID")) {
                    b10 = 57;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    b10 = 58;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    b10 = 59;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    b10 = 60;
                }
                break;
            case 61358428:
                if (str.equals("java.util.Collections$EmptyList")) {
                    b10 = 61;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    b10 = 62;
                }
                break;
            case 65821278:
                if (str.equals("java.util.List")) {
                    b10 = JSONB.Constants.BC_INT32_BYTE_MAX;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    b10 = JSONB.Constants.BC_INT32_SHORT_MIN;
                }
                break;
            case 100361105:
                if (str.equals("int[]")) {
                    b10 = 65;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    b10 = 66;
                }
                break;
            case 133021628:
                if (str.equals("java.util.OptionalLong")) {
                    b10 = 67;
                }
                break;
            case 179563853:
                if (str.equals("java.util.Arrays$ArrayList")) {
                    b10 = JSONB.Constants.BC_INT32_SHORT_ZERO;
                }
                break;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    b10 = 69;
                }
                break;
            case 578806391:
                if (str.equals("ArrayList")) {
                    b10 = 70;
                }
                break;
            case 600988612:
                if (str.equals("TreeSet")) {
                    b10 = JSONB.Constants.BC_INT32_SHORT_MAX;
                }
                break;
            case 889669201:
                if (str.equals("java.util.Collections$UnmodifiableRandomAccessList")) {
                    b10 = JSONB.Constants.BC_INT32;
                }
                break;
            case 935176422:
                if (str.equals("java.util.Collections$SingletonSet")) {
                    b10 = 73;
                }
                break;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    b10 = JSONB.Constants.BC_STR_ASCII_FIX_1;
                }
                break;
            case 1131069988:
                if (str.equals("java.util.TreeSet")) {
                    b10 = 75;
                }
                break;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    b10 = 76;
                }
                break;
            case 1258621781:
                if (str.equals("java.util.LinkedHashMap")) {
                    b10 = JSONB.Constants.BC_STR_ASCII_FIX_4;
                }
                break;
            case 1258627675:
                if (str.equals("java.util.LinkedHashSet")) {
                    b10 = JSONB.Constants.BC_STR_ASCII_FIX_5;
                }
                break;
            case 1359468275:
                if (str.equals("double[]")) {
                    b10 = 79;
                }
                break;
            case 1372295063:
                if (str.equals("ConcurrentHashMap")) {
                    b10 = 80;
                }
                break;
            case 1645304908:
                if (str.equals("[String")) {
                    b10 = 81;
                }
                break;
            case 1752376903:
                if (str.equals("JSONObject")) {
                    b10 = 82;
                }
                break;
            case 2058423690:
                if (str.equals("boolean[]")) {
                    b10 = 83;
                }
                break;
            case 2067161310:
                if (str.equals("short[]")) {
                    b10 = 84;
                }
                break;
        }
        switch (b10) {
            case 0:
                return OptionalInt.class;
            case 1:
                return Integer.class;
            case 2:
                return IOException.class;
            case 3:
            case 37:
            case 74:
                return Object.class;
            case 4:
            case Opcodes.FCONST_1 /* 12 */:
            case 36:
                return HashMap.class;
            case 5:
            case Opcodes.FCONST_2 /* 13 */:
                return HashSet.class;
            case 6:
            case Opcodes.LLOAD /* 22 */:
            case 40:
                return LinkedList.class;
            case 7:
            case 76:
                return String.class;
            case 8:
                return ConcurrentLinkedDeque.class;
            case 9:
                return ConcurrentLinkedQueue.class;
            case 10:
            case 41:
            case 77:
                return LinkedHashMap.class;
            case Opcodes.FCONST_0 /* 11 */:
            case 78:
                return LinkedHashSet.class;
            case Opcodes.DCONST_0 /* 14 */:
            case 52:
                return Map.class;
            case 15:
            case 53:
                return Set.class;
            case 16:
            case 42:
                return byte[].class;
            case Opcodes.SIPUSH /* 17 */:
            case 43:
                return char[].class;
            case Opcodes.LDC /* 18 */:
            case 32:
                return Double.TYPE;
            case 19:
            case 29:
            case 70:
                return ArrayList.class;
            case 20:
            case 47:
                return long[].class;
            case Opcodes.ILOAD /* 21 */:
                return CLASS_SINGLE_LIST;
            case Opcodes.FLOAD /* 23 */:
            case 45:
                return float[].class;
            case 24:
                return Optional.class;
            case Opcodes.ALOAD /* 25 */:
                return Class.class;
            case 26:
                return Collections.EMPTY_MAP.getClass();
            case 27:
                return Collections.EMPTY_SET.getClass();
            case 28:
                return Calendar.class;
            case 30:
            case Opcodes.ASTORE /* 58 */:
                return Byte.TYPE;
            case 31:
            case 59:
                return Character.TYPE;
            case 33:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                return Float.TYPE;
            case 34:
            case Opcodes.ISTORE /* 54 */:
                return Integer.TYPE;
            case 35:
            case 60:
                return Long.TYPE;
            case 38:
            case 66:
                return Short.TYPE;
            case 39:
            case 62:
                return Boolean.TYPE;
            case 44:
            case Opcodes.IASTORE /* 79 */:
                return double[].class;
            case Opcodes.IALOAD /* 46 */:
            case 65:
                return int[].class;
            case 48:
                return Object[].class;
            case 49:
            case Opcodes.BASTORE /* 84 */:
                return short[].class;
            case Opcodes.AALOAD /* 50 */:
            case Opcodes.AASTORE /* 83 */:
                return boolean[].class;
            case Opcodes.BALOAD /* 51 */:
                str = "com.alibaba.fastjson.JSONObject";
                break;
            case Opcodes.LSTORE /* 55 */:
                return Date.class;
            case Opcodes.FSTORE /* 56 */:
            case 63:
                return List.class;
            case Opcodes.DSTORE /* 57 */:
                return UUID.class;
            case 61:
                return Collections.EMPTY_LIST.getClass();
            case 67:
                return OptionalLong.class;
            case 68:
                return Arrays.asList(1).getClass();
            case 69:
                return Long.class;
            case 71:
            case 75:
                return TreeSet.class;
            case 72:
                return CLASS_UNMODIFIABLE_LIST;
            case 73:
                return CLASS_SINGLE_SET;
            case 80:
                return ConcurrentHashMap.class;
            case 81:
                return String[].class;
            case 82:
                return JSONObject.class;
        }
        Class cls = TYPE_MAPPINGS.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.startsWith("java.util.ImmutableCollections$")) {
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return CLASS_UNMODIFIABLE_LIST;
            }
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = str.substring(1, str.length() - 1);
        }
        if (str.charAt(0) == '[' || str.endsWith(_UrlKt.PATH_SEGMENT_ENCODE_SET_URI)) {
            Class clsLoadClass = loadClass(str.charAt(0) == '[' ? str.substring(1) : str.substring(0, str.length() - 2));
            if (clsLoadClass != null) {
                return Array.newInstance((Class<?>) clsLoadClass, 0).getClass();
            }
            C1569c.m6258a("load class error ".concat(str));
            return null;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                return contextClassLoader.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        try {
            try {
                return JSON.class.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused3) {
                return Class.forName(str);
            }
        } catch (ClassNotFoundException unused4) {
            return null;
        }
    }

    public static <T> T newProxyInstance(Class<T> cls, JSONObject jSONObject) {
        MethodHandle methodHandleFindStatic = METHOD_NEW_PROXY_INSTANCE;
        if (methodHandleFindStatic == null) {
            try {
                Class<?> cls2 = Class.forName("java.lang.reflect.Proxy");
                methodHandleFindStatic = JDKUtils.trustedLookup(cls2).findStatic(cls2, "newProxyInstance", MethodType.methodType(Object.class, ClassLoader.class, Class[].class, InvocationHandler.class));
                METHOD_NEW_PROXY_INSTANCE = methodHandleFindStatic;
            } catch (Throwable unused) {
                METHOD_NEW_PROXY_INSTANCE_ERROR = true;
            }
        }
        try {
            return (T) (Object) methodHandleFindStatic.invokeExact(cls.getClassLoader(), new Class[]{cls}, jSONObject);
        } catch (Throwable th) {
            C1780a0.m6502a("create proxy error : ", cls, th);
            return null;
        }
    }

    public static Class nonePrimitive(Class cls) {
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        return !name.equals("double") ? !name.equals("int") ? !name.equals("byte") ? !name.equals("char") ? !name.equals("long") ? !name.equals("boolean") ? !name.equals("float") ? !name.equals("short") ? cls : Short.class : Float.class : Boolean.class : Long.class : Character.class : Byte.class : Integer.class : Double.class;
    }

    public static BigDecimal parseBigDecimal(byte[] bArr, int i10, int i11) {
        int i12;
        boolean z10;
        long j10;
        char[] cArrApply;
        if (bArr == null || i11 == 0) {
            return null;
        }
        if (bArr[i10] == 45) {
            i12 = i10 + 1;
            z10 = true;
        } else {
            i12 = i10;
            z10 = false;
        }
        if (i11 <= 20 || (z10 && i11 == 21)) {
            int i13 = i10 + i11;
            int i14 = 0;
            int i15 = -1;
            long j11 = 0;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 != 46) {
                    j10 = 0;
                    if (b10 >= 48 && b10 <= 57) {
                        long j12 = j11 * 10;
                        if (((j11 | 10) >>> 31) == 0 || j12 / 10 == j11) {
                            j11 = j12 + ((long) (b10 + JSONB.Constants.BC_INT64_BYTE_ZERO));
                        }
                    }
                    j11 = -1;
                    break;
                }
                i14++;
                if (i14 > 1) {
                    break;
                }
                i15 = i12;
                i12++;
            }
            j10 = 0;
            if (j11 >= j10 && i14 <= 1) {
                if (z10) {
                    j11 = -j11;
                }
                return BigDecimal.valueOf(j11, i15 != -1 ? (i11 - (i15 - i10)) - 1 : 0);
            }
        }
        if (i10 == 0 && i11 == bArr.length) {
            cArrApply = C1777X1.TO_CHARS.apply(bArr);
        } else {
            char[] cArr = new char[i11];
            for (int i16 = 0; i16 < i11; i16++) {
                cArr[i16] = (char) bArr[i10 + i16];
            }
            cArrApply = cArr;
        }
        return new BigDecimal(cArrApply, 0, cArrApply.length);
    }

    public static Boolean parseBoolean(char[] cArr, int i10, int i11) {
        char c10;
        if (i11 == 0) {
            return null;
        }
        boolean z10 = true;
        if ((i11 != 1 || ((c10 = cArr[i10]) != '1' && c10 != 'Y')) && (i11 != 4 || (IOUtils.getLongLE(cArr, i10) | 9007336695791648L) != 28429475166421108L)) {
            z10 = $assertionsDisabled;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011e, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0111, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0116, B:101:0x011d), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0111, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0116, B:101:0x011d), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0111, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0116, B:101:0x011d), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0111, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0116, B:101:0x011d), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0111, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0116, B:101:0x011d), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0111 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0111, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0116, B:101:0x011d), top: B:105:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double parseDouble(char[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.parseDouble(char[], int, int):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011d, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0110, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0115, B:101:0x011c), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0110, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0115, B:101:0x011c), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0110, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0115, B:101:0x011c), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0110, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0115, B:101:0x011c), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0110, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0115, B:101:0x011c), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0110 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:90:0x0103, B:98:0x0110, B:86:0x00fc, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:100:0x0115, B:101:0x011c), top: B:105:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float parseFloat(char[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.parseFloat(char[], int, int):float");
    }

    public static int parseInt(byte[] bArr, int i10, int i11) {
        int i12;
        int iDigit2;
        int i13 = i10 + i11;
        int i14 = i10 + 1;
        byte b10 = bArr[i10];
        boolean zIsDigit = IOUtils.isDigit(b10);
        boolean z10 = $assertionsDisabled;
        int i15 = zIsDigit ? 48 - b10 : (i11 == 1 || !(b10 == 45 || b10 == 43)) ? 1 : 0;
        while (true) {
            i12 = i14 + 1;
            if (i12 < i13 && (iDigit2 = IOUtils.digit2(bArr, i14)) != -1) {
                if (!(-21474836 <= i15) || !(i15 <= 0)) {
                    break;
                }
                i15 = (i15 * 100) - iDigit2;
                i14 += 2;
            } else {
                break;
            }
        }
        if (i14 < i13) {
            byte b11 = bArr[i14];
            if (IOUtils.isDigit(b11)) {
                if ((-214748364 <= i15) & (i15 <= 0)) {
                    i15 = ((i15 * 10) + 48) - b11;
                    i14 = i12;
                }
            }
        }
        boolean z11 = (i14 == i13) & (i15 <= 0);
        if (Integer.MIN_VALUE < i15 || b10 == 45) {
            z10 = true;
        }
        if (z11 && z10) {
            return b10 == 45 ? i15 : -i15;
        }
        throw new NumberFormatException("parseInt error ".concat(new String(bArr, i14, i11)));
    }

    public static long parseLong(byte[] bArr, int i10, int i11) {
        int i12;
        int iDigit2;
        int i13 = i10 + i11;
        int i14 = i10 + 1;
        byte b10 = bArr[i10];
        boolean z10 = true;
        long j10 = IOUtils.isDigit(b10) ? 48 - b10 : (i11 == 1 || !(b10 == 45 || b10 == 43)) ? 1L : 0L;
        while (true) {
            i12 = i14 + 1;
            if (i12 < i13 && (iDigit2 = IOUtils.digit2(bArr, i14)) != -1) {
                if (!(-92233720368547758L <= j10) || !(j10 <= 0)) {
                    break;
                }
                j10 = (j10 * 100) - ((long) iDigit2);
                i14 += 2;
            } else {
                break;
            }
        }
        if (i14 < i13) {
            byte b11 = bArr[i14];
            if (IOUtils.isDigit(b11)) {
                if ((-922337203685477580L <= j10) & (j10 <= 0)) {
                    j10 = ((j10 * 10) + 48) - ((long) b11);
                    i14 = i12;
                }
            }
        }
        boolean z11 = (i14 == i13) & (j10 <= 0);
        if (Long.MIN_VALUE >= j10 && b10 != 45) {
            z10 = false;
        }
        if (z11 && z10) {
            return b10 == 45 ? j10 : -j10;
        }
        throw new NumberFormatException("parseInt error ".concat(new String(bArr, i14, i11)));
    }

    public static char[] toAsciiCharArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            cArr[i10] = (char) bArr[i10];
        }
        return cArr;
    }

    public static BigDecimal toBigDecimal(Object obj) {
        if (obj == null || (obj instanceof BigDecimal)) {
            return (BigDecimal) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigDecimal.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return (BigDecimal) cast(obj, BigDecimal.class);
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigDecimal(str);
    }

    public static BigInteger toBigInteger(Object obj) {
        if (obj == null || (obj instanceof BigInteger)) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            C1569c.m6258a("can not cast to bigint");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigInteger(str);
    }

    public static Boolean toBoolean(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (obj instanceof Number) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue == 1) {
                return Boolean.TRUE;
            }
            if (iIntValue == 0) {
                return Boolean.FALSE;
            }
        }
        C1569c.m6258a("can not cast to boolean");
        return null;
    }

    public static boolean toBooleanValue(Object obj) {
        if (obj == null) {
            return $assertionsDisabled;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return (str.isEmpty() || "null".equals(str)) ? $assertionsDisabled : Boolean.parseBoolean(str);
        }
        if (obj instanceof Number) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue == 1) {
                return true;
            }
            if (iIntValue == 0) {
                return $assertionsDisabled;
            }
        }
        C1569c.m6258a("can not cast to boolean");
        return $assertionsDisabled;
    }

    public static Byte toByte(Object obj) {
        if (obj == null || (obj instanceof Byte)) {
            return (Byte) obj;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            C1569c.m6258a("can not cast to byte");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    public static byte toByteValue(Object obj) {
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        if (!(obj instanceof String)) {
            C1569c.m6258a("can not cast to byte");
            return (byte) 0;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return (byte) 0;
        }
        return Byte.parseByte(str);
    }

    public static Date toDate(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Instant) {
            return new Date(((Instant) obj).toEpochMilli());
        }
        if (obj instanceof ZonedDateTime) {
            return new Date(((ZonedDateTime) obj).toInstant().toEpochMilli());
        }
        if (obj instanceof LocalDate) {
            return new Date(((LocalDate) obj).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
        }
        if (obj instanceof LocalDateTime) {
            return new Date(((LocalDateTime) obj).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
        }
        if (obj instanceof String) {
            return DateUtils.parseDate((String) obj);
        }
        if ((obj instanceof Long) || (obj instanceof Integer)) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("$date");
            if (obj2 instanceof String) {
                return DateUtils.parseDate((String) obj2);
            }
        }
        C1607k.m6296a("can not cast to Date from ", obj.getClass());
        return null;
    }

    public static Double toDouble(Object obj) {
        if (obj == null || (obj instanceof Double)) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            C1569c.m6258a("can not cast to double");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    public static double toDoubleValue(Object obj) {
        if (obj == null) {
            return 0.0d;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return 0.0d;
            }
            return Double.parseDouble(str);
        }
        boolean z10 = obj instanceof Collection;
        if ((z10 && ((Collection) obj).isEmpty()) || ((obj instanceof Map) && ((Map) obj).isEmpty())) {
            return 0.0d;
        }
        if (z10) {
            Collection collection = (Collection) obj;
            if (collection.size() == 1) {
                Object next = collection.iterator().next();
                if (next instanceof Number) {
                    return ((Number) next).doubleValue();
                }
                if (next instanceof String) {
                    return Double.parseDouble((String) next);
                }
            }
        }
        C1569c.m6258a("can not cast to double");
        return 0.0d;
    }

    public static Float toFloat(Object obj) {
        if (obj == null || (obj instanceof Float)) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            C1569c.m6258a("can not cast to decimal");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(str));
    }

    public static float toFloatValue(Object obj) {
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        if (!(obj instanceof String)) {
            C1569c.m6258a("can not cast to decimal");
            return 0.0f;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0.0f;
        }
        return Float.parseFloat(str);
    }

    public static Instant toInstant(Object obj) {
        JSONReader jSONReaderM6226of;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Instant) {
            return (Instant) obj;
        }
        if (obj instanceof Date) {
            return ((Date) obj).toInstant();
        }
        if (obj instanceof ZonedDateTime) {
            return ((ZonedDateTime) obj).toInstant();
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Map) {
                return (Instant) ObjectReaderImplInstant.INSTANCE.createInstance((Map) obj, 0L);
            }
            C1607k.m6296a("can not cast to Date from ", obj.getClass());
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str.charAt(0) != '\"') {
            jSONReaderM6226of = JSONReader.m6226of("\"" + str + '\"');
        } else {
            jSONReaderM6226of = JSONReader.m6226of(str);
        }
        return (Instant) jSONReaderM6226of.read(Instant.class);
    }

    public static int toIntValue(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String)) {
            C1569c.m6258a("can not cast to int");
            return 0;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0;
        }
        try {
            if (str.lastIndexOf(44) == str.length() - 4 && str.indexOf(46) == -1) {
                return NumberFormat.getNumberInstance().parse(str).intValue();
            }
        } catch (ParseException unused) {
        }
        if (IOUtils.isNumber(str)) {
            return Integer.parseInt(str);
        }
        C1569c.m6258a("parseInt error, ".concat(str));
        return 0;
    }

    public static Integer toInteger(Object obj) {
        if (obj == null || (obj instanceof Integer)) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(str));
        }
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return null;
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        C1569c.m6258a("can not cast to integer");
        return null;
    }

    public static List toList(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        if (!(obj instanceof Iterable)) {
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to List");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Long toLong(Object obj) {
        if (obj == null || (obj instanceof Long)) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
        }
        return Long.valueOf(toLongValue(obj));
    }

    public static long toLongValue(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (!(obj instanceof String)) {
            C1607k.m6296a("can not cast to long from ", obj.getClass());
            return 0L;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0L;
        }
        try {
            if (str.lastIndexOf(44) == str.length() - 4 && str.indexOf(46) == -1) {
                return NumberFormat.getNumberInstance().parse(str).longValue();
            }
        } catch (ParseException unused) {
        }
        if (IOUtils.isNumber(str)) {
            return Long.parseLong(str);
        }
        C1569c.m6258a("parseLong error ".concat(str));
        return 0L;
    }

    public static Short toShort(Object obj) {
        if (obj == null || (obj instanceof Short)) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            C1569c.m6258a("can not cast to byte");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    public static short toShortValue(Object obj) {
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        if (obj instanceof Number) {
            return (byte) ((Number) obj).shortValue();
        }
        if (!(obj instanceof String)) {
            C1569c.m6258a("can not cast to byte");
            return (short) 0;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return (short) 0;
        }
        return Short.parseShort(str);
    }

    public static String toString(byte b10, byte b11) {
        return (b10 < 32 || b10 > 126 || b11 < 32 || b11 > 126) ? new String(new byte[]{b10, b11}, StandardCharsets.ISO_8859_1) : C1778X2.chars2[((b10 - 32) * 95) + (b11 - 32)];
    }

    public static String[] toStringArray(Object obj) {
        if (obj == null || (obj instanceof String[])) {
            return (String[]) obj;
        }
        int i10 = 0;
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            String[] strArr = new String[collection.size()];
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i11 = i10 + 1;
                strArr[i10] = (next == null || (next instanceof String)) ? (String) next : next.toString();
                i10 = i11;
            }
            return strArr;
        }
        if (!obj.getClass().isArray()) {
            return (String[]) cast(obj, String[].class);
        }
        int length = Array.getLength(obj);
        String[] strArr2 = new String[length];
        while (i10 < length) {
            Object obj2 = Array.get(obj, i10);
            strArr2[i10] = (obj2 == null || (obj2 instanceof String)) ? (String) obj2 : obj2.toString();
            i10++;
        }
        return strArr2;
    }

    public static boolean validateIPv4(String str, int i10) {
        int length;
        int length2;
        if (str != null && (length2 = (length = str.length()) - i10) >= 7 && length2 <= 25) {
            int i11 = i10;
            int i12 = 0;
            while (i10 < length) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '.' || i10 == length - 1) {
                    int i13 = cCharAt == '.' ? i10 : i10 + 1;
                    int i14 = i13 - i11;
                    if (i14 == 1) {
                        char cCharAt2 = str.charAt(i13 - 1);
                        if (cCharAt2 < '0' || cCharAt2 > '9') {
                            return $assertionsDisabled;
                        }
                    } else if (i14 == 2) {
                        char cCharAt3 = str.charAt(i13 - 2);
                        char cCharAt4 = str.charAt(i13 - 1);
                        if (cCharAt3 < '0' || cCharAt3 > '9' || cCharAt4 < '0' || cCharAt4 > '9') {
                            return $assertionsDisabled;
                        }
                    } else {
                        if (i14 != 3) {
                            return $assertionsDisabled;
                        }
                        char cCharAt5 = str.charAt(i13 - 3);
                        char cCharAt6 = str.charAt(i13 - 2);
                        char cCharAt7 = str.charAt(i13 - 1);
                        if (cCharAt5 < '0' || cCharAt5 > '2' || cCharAt6 < '0' || cCharAt6 > '9' || cCharAt7 < '0' || cCharAt7 > '9' || ((cCharAt5 - '0') * 100) + ((cCharAt6 - '0') * 10) + (cCharAt7 - '0') > 255) {
                            return $assertionsDisabled;
                        }
                    }
                    if (cCharAt == '.') {
                        i12++;
                        i11 = i10 + 1;
                    }
                }
                i10++;
            }
            if (i12 == 3) {
                return true;
            }
        }
        return $assertionsDisabled;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x010d, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0131, code lost:
    
        if (r6 <= 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0135, code lost:
    
        if (r6 >= 8) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0137, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ae, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e7, code lost:
    
        return r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean validateIPv6(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.validateIPv6(java.lang.String):boolean");
    }

    public static String toString(byte b10) {
        if (b10 >= 0) {
            String[] strArr = C1778X2.chars;
            if (b10 < strArr.length) {
                return strArr[b10];
            }
        }
        return new String(new byte[]{b10}, StandardCharsets.ISO_8859_1);
    }

    public static String toString(char c10, char c11) {
        if (c10 >= ' ' && c10 <= '~' && c11 >= ' ' && c11 <= '~') {
            return C1778X2.chars2[((c10 - ' ') * 95) + (c11 - ' ')];
        }
        return new String(new char[]{c10, c11});
    }

    public static String toString(char c10) {
        String[] strArr = C1778X2.chars;
        if (c10 < strArr.length) {
            return strArr[c10];
        }
        return Character.toString(c10);
    }

    public static Boolean parseBoolean(byte[] bArr, int i10, int i11) {
        byte b10;
        if (i11 == 0) {
            return null;
        }
        boolean z10 = true;
        if ((i11 != 1 || ((b10 = bArr[i10]) != 49 && b10 != 89)) && (i11 != 4 || (IOUtils.getIntUnaligned(bArr, i10) | 538976288) != IOUtils.TRUE)) {
            z10 = $assertionsDisabled;
        }
        return Boolean.valueOf(z10);
    }

    public static boolean isJavaScriptSupport(long j10) {
        if (j10 < LONG_JAVASCRIPT_LOW || j10 > LONG_JAVASCRIPT_HIGH) {
            return $assertionsDisabled;
        }
        return true;
    }

    public static boolean isJavaScriptSupport(BigInteger bigInteger) {
        if (bigInteger.compareTo(BIGINT_JAVASCRIPT_LOW) < 0 || bigInteger.compareTo(BIGINT_JAVASCRIPT_HIGH) > 0) {
            return $assertionsDisabled;
        }
        return true;
    }

    public static BigDecimal toBigDecimal(long j10) {
        return BigDecimal.valueOf(j10);
    }

    public static BigDecimal toBigDecimal(float f10) {
        byte[] bArr = new byte[15];
        return parseBigDecimal(bArr, 0, NumberUtils.writeFloat(bArr, 0, f10, true, $assertionsDisabled));
    }

    public static BigDecimal toBigDecimal(double d10) {
        byte[] bArr = new byte[24];
        return parseBigDecimal(bArr, 0, NumberUtils.writeDouble(bArr, 0, d10, true, $assertionsDisabled));
    }

    public static BigDecimal toBigDecimal(String str) {
        Function<String, byte[]> function;
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
        if (toIntFunction != null && toIntFunction.applyAsInt(str) == JDKUtils.LATIN1.byteValue() && (function = JDKUtils.STRING_VALUE) != null) {
            byte[] bArrApply = function.apply(str);
            return parseBigDecimal(bArrApply, 0, bArrApply.length);
        }
        char[] charArray = JDKUtils.getCharArray(str);
        return parseBigDecimal(charArray, 0, charArray.length);
    }

    public static BigDecimal toBigDecimal(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return parseBigDecimal(cArr, 0, cArr.length);
    }

    public static BigDecimal toBigDecimal(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return parseBigDecimal(bArr, 0, bArr.length);
    }

    public static Class getMapping(String str) {
        return TYPE_MAPPINGS.get(str);
    }

    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return $assertionsDisabled;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-' || cCharAt == '+') {
            if (str.length() == 1) {
                return $assertionsDisabled;
            }
        } else if (cCharAt < '0' || cCharAt > '9') {
            return $assertionsDisabled;
        }
        for (int i10 = 1; i10 < str.length(); i10++) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return $assertionsDisabled;
            }
        }
        return true;
    }

    public static int parseInt(char[] cArr, int i10, int i11) {
        int i12;
        int iDigit2;
        int i13 = i10 + i11;
        int i14 = i10 + 1;
        char c10 = cArr[i10];
        boolean zIsDigit = IOUtils.isDigit(c10);
        boolean z10 = $assertionsDisabled;
        int i15 = zIsDigit ? '0' - c10 : (i11 == 1 || !(c10 == '-' || c10 == '+')) ? 1 : 0;
        while (true) {
            i12 = i14 + 1;
            if (i12 < i13 && (iDigit2 = IOUtils.digit2(cArr, i14)) != -1) {
                if (!(-21474836 <= i15) || !(i15 <= 0)) {
                    break;
                }
                i15 = (i15 * 100) - iDigit2;
                i14 += 2;
            } else {
                break;
            }
        }
        if (i14 < i13) {
            char c11 = cArr[i14];
            if (IOUtils.isDigit(c11)) {
                if ((-214748364 <= i15) & (i15 <= 0)) {
                    i15 = ((i15 * 10) + 48) - c11;
                    i14 = i12;
                }
            }
        }
        boolean z11 = (i14 == i13) & (i15 <= 0);
        if (Integer.MIN_VALUE < i15 || c10 == '-') {
            z10 = true;
        }
        if (z11 && z10) {
            return c10 == '-' ? i15 : -i15;
        }
        throw new NumberFormatException("parseInt error ".concat(new String(cArr, i14, i11)));
    }

    public static boolean isInteger(byte[] bArr, int i10, int i11) {
        if (bArr == null || i11 == 0) {
            return $assertionsDisabled;
        }
        char c10 = (char) bArr[i10];
        if (c10 == '-' || c10 == '+') {
            if (i11 == 1) {
                return $assertionsDisabled;
            }
        } else if (c10 < '0' || c10 > '9') {
            return $assertionsDisabled;
        }
        int i12 = i11 + i10;
        for (int i13 = i10 + 1; i13 < i12; i13++) {
            char c11 = (char) bArr[i13];
            if (c11 < '0' || c11 > '9') {
                return $assertionsDisabled;
            }
        }
        return true;
    }

    public static boolean isInteger(char[] cArr, int i10, int i11) {
        if (cArr == null || i11 == 0) {
            return $assertionsDisabled;
        }
        char c10 = cArr[i10];
        if (c10 == '-' || c10 == '+') {
            if (i11 == 1) {
                return $assertionsDisabled;
            }
        } else if (c10 < '0' || c10 > '9') {
            return $assertionsDisabled;
        }
        int i12 = i11 + i10;
        for (int i13 = i10 + 1; i13 < i12; i13++) {
            char c11 = cArr[i13];
            if (c11 < '0' || c11 > '9') {
                return $assertionsDisabled;
            }
        }
        return true;
    }

    public static boolean validateIPv4(String str) {
        return validateIPv4(str, 0);
    }

    public static long parseLong(char[] cArr, int i10, int i11) {
        int i12;
        int iDigit2;
        int i13 = i10 + i11;
        int i14 = i10 + 1;
        char c10 = cArr[i10];
        boolean z10 = true;
        long j10 = IOUtils.isDigit(c10) ? '0' - c10 : (i11 == 1 || !(c10 == '-' || c10 == '+')) ? 1L : 0L;
        while (true) {
            i12 = i14 + 1;
            if (i12 < i13 && (iDigit2 = IOUtils.digit2(cArr, i14)) != -1) {
                if (!(-92233720368547758L <= j10) || !(j10 <= 0)) {
                    break;
                }
                j10 = (j10 * 100) - ((long) iDigit2);
                i14 += 2;
            } else {
                break;
            }
        }
        if (i14 < i13) {
            char c11 = cArr[i14];
            if (IOUtils.isDigit(c11)) {
                if ((-922337203685477580L <= j10) & (j10 <= 0)) {
                    j10 = ((j10 * 10) + 48) - ((long) c11);
                    i14 = i12;
                }
            }
        }
        boolean z11 = (i14 == i13) & (j10 <= 0);
        if (Long.MIN_VALUE >= j10 && c10 != '-') {
            z10 = false;
        }
        if (z11 && z10) {
            return c10 == '-' ? j10 : -j10;
        }
        throw new NumberFormatException("parseInt error ".concat(new String(cArr, i14, i11)));
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i10, int i11) {
        int i12;
        boolean z10;
        if (cArr == null || i11 == 0) {
            return null;
        }
        if (cArr[i10] == '-') {
            i12 = i10 + 1;
            z10 = true;
        } else {
            i12 = i10;
            z10 = $assertionsDisabled;
        }
        if (i11 <= 20 || (z10 && i11 == 21)) {
            int i13 = i10 + i11;
            int i14 = -1;
            long j10 = 0;
            int i15 = 0;
            while (i12 < i13) {
                char c10 = cArr[i12];
                if (c10 != '.') {
                    if (c10 >= '0' && c10 <= '9') {
                        long j11 = j10 * 10;
                        if (((j10 | 10) >>> 31) == 0 || j11 / 10 == j10) {
                            j10 = j11 + ((long) (c10 - '0'));
                            i12++;
                        }
                    }
                    j10 = -1;
                    break;
                }
                i15++;
                if (i15 > 1) {
                    break;
                }
                i14 = i12;
                i12++;
            }
            if (j10 >= 0 && i15 <= 1) {
                if (z10) {
                    j10 = -j10;
                }
                return BigDecimal.valueOf(j10, i14 != -1 ? (i11 - (i14 - i10)) - 1 : 0);
            }
        }
        return new BigDecimal(cArr, i10, i11);
    }

    public static boolean isNumber(byte[] bArr, int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        if (bArr != null && i11 != 0) {
            char c10 = (char) bArr[i10];
            if (c10 == '-' || c10 == '+') {
                if (i11 == 1) {
                    return $assertionsDisabled;
                }
                i12 = i10 + 1;
                c10 = (char) bArr[i12];
            } else if (c10 != '.') {
                i12 = i10;
            } else {
                if (i11 == 1) {
                    return $assertionsDisabled;
                }
                i12 = i10 + 1;
            }
            int i13 = i10 + i11;
            if (!(c10 == '.') && c10 >= '0' && c10 <= '9') {
                while (i12 < i13) {
                    int i14 = i12 + 1;
                    c10 = (char) bArr[i12];
                    if (c10 < '0' || c10 > '9') {
                        i12 = i14;
                        z10 = true;
                    } else {
                        i12 = i14;
                    }
                }
                return true;
            }
            z10 = false;
            if (c10 != '.') {
                z11 = false;
            } else {
                if (i12 >= i13) {
                    return true;
                }
                int i15 = i12 + 1;
                char c11 = (char) bArr[i12];
                if (c11 >= '0' && c11 <= '9') {
                    while (i15 < i13) {
                        i12 = i15 + 1;
                        c10 = (char) bArr[i15];
                        if (c10 >= '0' && c10 <= '9') {
                            i15 = i12;
                        }
                    }
                    return true;
                }
                i12 = i15;
                c10 = c11;
                z11 = true;
            }
            if (!z10 && !z11) {
                return $assertionsDisabled;
            }
            if (c10 == 'e' || c10 == 'E') {
                if (i12 == i13) {
                    return true;
                }
                int i16 = i12 + 1;
                char c12 = (char) bArr[i12];
                if (c12 == '+' || c12 == '-') {
                    if (i16 < i13) {
                        c12 = (char) bArr[i16];
                        i16 = i12 + 2;
                    }
                }
                if (c12 >= '0' && c12 <= '9') {
                    while (i16 < i13) {
                        int i17 = i16 + 1;
                        char c13 = (char) bArr[i16];
                        if (c13 >= '0' && c13 <= '9') {
                            i16 = i17;
                        }
                    }
                    return true;
                }
            }
            return $assertionsDisabled;
        }
        return $assertionsDisabled;
    }

    public static boolean isNumber(char[] cArr, int i10, int i11) {
        int i12;
        boolean z10;
        boolean z11;
        if (cArr != null && i11 != 0) {
            char c10 = cArr[i10];
            if (c10 == '-' || c10 == '+') {
                if (i11 == 1) {
                    return $assertionsDisabled;
                }
                i12 = i10 + 1;
                c10 = cArr[i12];
            } else if (c10 != '.') {
                i12 = i10;
            } else {
                if (i11 == 1) {
                    return $assertionsDisabled;
                }
                i12 = i10 + 1;
            }
            int i13 = i10 + i11;
            if (!(c10 == '.') && c10 >= '0' && c10 <= '9') {
                while (i12 < i13) {
                    int i14 = i12 + 1;
                    c10 = cArr[i12];
                    if (c10 < '0' || c10 > '9') {
                        i12 = i14;
                        z10 = true;
                    } else {
                        i12 = i14;
                    }
                }
                return true;
            }
            z10 = false;
            if (c10 != '.') {
                z11 = false;
            } else {
                if (i12 >= i13) {
                    return true;
                }
                int i15 = i12 + 1;
                char c11 = cArr[i12];
                if (c11 >= '0' && c11 <= '9') {
                    while (i15 < i13) {
                        i12 = i15 + 1;
                        c10 = cArr[i15];
                        if (c10 >= '0' && c10 <= '9') {
                            i15 = i12;
                        }
                    }
                    return true;
                }
                i12 = i15;
                c10 = c11;
                z11 = true;
            }
            if (!z10 && !z11) {
                return $assertionsDisabled;
            }
            if (c10 == 'e' || c10 == 'E') {
                if (i12 == i13) {
                    return true;
                }
                int i16 = i12 + 1;
                char c12 = cArr[i12];
                if (c12 == '+' || c12 == '-') {
                    if (i16 < i13) {
                        c12 = cArr[i16];
                        i16 = i12 + 2;
                    }
                }
                if (c12 >= '0' && c12 <= '9') {
                    while (i16 < i13) {
                        int i17 = i16 + 1;
                        char c13 = cArr[i16];
                        if (c13 >= '0' && c13 <= '9') {
                            i16 = i17;
                        }
                    }
                    return true;
                }
            }
            return $assertionsDisabled;
        }
        return $assertionsDisabled;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011b, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011b, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010e, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0113, B:101:0x011a), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011b, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010e, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0113, B:101:0x011a), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c A[Catch: StringIndexOutOfBoundsException -> 0x011b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011b, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010e, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0113, B:101:0x011a), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011b, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010e, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0113, B:101:0x011a), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa A[Catch: StringIndexOutOfBoundsException -> 0x011b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011b, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010e, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0113, B:101:0x011a), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e A[Catch: StringIndexOutOfBoundsException -> 0x011b, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011b, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010e, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0113, B:101:0x011a), top: B:105:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float parseFloat(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.parseFloat(byte[], int, int):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011c, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010f, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0114, B:101:0x011b), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010f, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0114, B:101:0x011b), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010f, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0114, B:101:0x011b), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010f, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0114, B:101:0x011b), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010f, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0114, B:101:0x011b), top: B:105:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:90:0x0101, B:98:0x010f, B:86:0x00fa, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:100:0x0114, B:101:0x011b), top: B:105:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double parseDouble(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.TypeUtils.parseDouble(byte[], int, int):double");
    }

    public static float floatValue(int i10, long j10, int i11) {
        float f10;
        float fScalb;
        long jNumberOfLeadingZeros = ((long) (64 - Long.numberOfLeadingZeros(j10))) - ((long) Math.ceil(((double) i11) * f4760L));
        if (jNumberOfLeadingZeros < -151) {
            f10 = i10;
            fScalb = 0.0f;
        } else if (jNumberOfLeadingZeros > 129) {
            f10 = i10;
            fScalb = Float.POSITIVE_INFINITY;
        } else if (i11 == 0) {
            f10 = i10;
            fScalb = j10;
        } else {
            int i12 = ((int) jNumberOfLeadingZeros) - 27;
            int iDivideKnuthLong = (int) MutableBigInteger.divideKnuthLong(j10, i12, i11);
            int i13 = j10 == 0 ? 0 : 1;
            if (6 - Integer.numberOfLeadingZeros(iDivideKnuthLong) >= (-151) - i12) {
                f10 = i10;
                fScalb = Math.scalb(i13 | iDivideKnuthLong, i12);
            } else {
                f10 = i10;
                fScalb = Math.scalb(i13 | (iDivideKnuthLong >> r2) | Integer.signum(iDivideKnuthLong & ((1 << r2) - 1)), -151);
            }
        }
        return f10 * fScalb;
    }

    public static double doubleValue(int i10, long j10, int i11) {
        double d10;
        double dScalb;
        double d11;
        double d12;
        long jNumberOfLeadingZeros = ((long) (64 - Long.numberOfLeadingZeros(j10))) - ((long) Math.ceil(((double) i11) * f4760L));
        if (jNumberOfLeadingZeros < -1076) {
            d11 = i10;
            d12 = 0.0d;
        } else {
            if (jNumberOfLeadingZeros <= 1025) {
                if (i11 == 0) {
                    d10 = i10;
                    dScalb = j10;
                } else {
                    int i12 = ((int) jNumberOfLeadingZeros) - 56;
                    long jDivideKnuthLong = MutableBigInteger.divideKnuthLong(j10, i12, i11);
                    int i13 = (-1076) - i12;
                    if (9 - Long.numberOfLeadingZeros(jDivideKnuthLong) >= i13) {
                        return ((double) i10) * Math.scalb(jDivideKnuthLong | 1, i12);
                    }
                    d10 = i10;
                    dScalb = Math.scalb(((long) Long.signum(jDivideKnuthLong & ((1 << i13) - 1))) | (jDivideKnuthLong >> i13) | 1, -1076);
                }
                return d10 * dScalb;
            }
            d11 = i10;
            d12 = Double.POSITIVE_INFINITY;
        }
        return d11 * d12;
    }

    public static <T> T cast(Object obj, Type type) {
        return (T) cast(obj, type, JSONFactory.getDefaultObjectReaderProvider());
    }

    public static <T> T cast(Object obj, Type type, ObjectReaderProvider objectReaderProvider) {
        if (type instanceof Class) {
            return (T) cast(obj, (Class) type, objectReaderProvider);
        }
        if (obj instanceof Collection) {
            return (T) objectReaderProvider.getObjectReader(type).createInstance((Collection) obj);
        }
        if (obj instanceof Map) {
            return (T) objectReaderProvider.getObjectReader(type).createInstance((Map) obj, 0L);
        }
        return (T) JSON.parseObject(JSON.toJSONString(obj), type);
    }

    public static <T> T cast(Object obj, Class<T> cls) {
        return (T) cast(obj, (Class) cls, JSONFactory.getDefaultObjectReaderProvider());
    }

    public static Object[] cast(Object obj, Type[] typeArr) {
        if (obj == null) {
            return null;
        }
        int length = typeArr.length;
        Object[] objArr = new Object[length];
        int i10 = 0;
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                objArr[i10] = cast(it.next(), typeArr[i10]);
                i10++;
            }
        } else {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                int length2 = Array.getLength(obj);
                while (i10 < length && i10 < length2) {
                    objArr[i10] = cast(Array.get(obj, i10), typeArr[i10]);
                    i10++;
                }
            } else {
                C1608k0.m6297a("can not cast to types ", JSON.toJSONString(typeArr), " from ", cls);
                return null;
            }
        }
        return objArr;
    }
}
