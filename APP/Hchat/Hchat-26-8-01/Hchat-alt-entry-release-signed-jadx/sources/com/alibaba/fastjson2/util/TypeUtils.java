package com.alibaba.fastjson2.util;

import bsh.ParserConstants;
import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplEnum;
import com.alibaba.fastjson2.reader.ObjectReaderImplInstant;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.Function;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p222p.AbstractC3199a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class TypeUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final BigInteger[] BIG_TEN_POWERS_TABLE_0;
    private static volatile BigInteger[] BIG_TEN_POWERS_TABLE_1;
    public static final Class CLASS_SINGLE_SET = Collections.singleton(1).getClass();
    public static final Class CLASS_SINGLE_LIST = Collections.singletonList(1).getClass();
    public static final Class CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(new ArrayList()).getClass();
    public static final ParameterizedType PARAM_TYPE_LIST_STR = new ParameterizedTypeImpl(List.class, String.class);
    public static final double[] SMALL_10_POW = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
    static final float[] SINGLE_SMALL_10_POW = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    static final double[] BIG_10_POW = {1.0E16d, 1.0E32d, 1.0E64d, 1.0E128d, 1.0E256d};
    static final double[] TINY_10_POW = {1.0E-16d, 1.0E-32d, 1.0E-64d, 1.0E-128d, 1.0E-256d};
    static final Cache CACHE = new Cache();
    static final AtomicReferenceFieldUpdater<Cache, char[]> CHARS_UPDATER = AtomicReferenceFieldUpdater.newUpdater(Cache.class, char[].class, "chars");

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Cache {
        volatile char[] chars;
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Mapping {
        static final Map<Class, String> NAME_MAPPINGS;
        static final Map<String, Class> TYPE_MAPPINGS;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            IdentityHashMap identityHashMap = new IdentityHashMap(Opcodes.CHECKCAST);
            NAME_MAPPINGS = identityHashMap;
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(Opcodes.ACC_NATIVE);
            TYPE_MAPPINGS = concurrentHashMap;
            identityHashMap.put(Byte.TYPE, "B");
            identityHashMap.put(Short.TYPE, "S");
            identityHashMap.put(Integer.TYPE, "I");
            identityHashMap.put(Long.TYPE, "J");
            identityHashMap.put(Float.TYPE, "F");
            identityHashMap.put(Double.TYPE, "D");
            identityHashMap.put(Character.TYPE, "C");
            identityHashMap.put(Boolean.TYPE, "Z");
            identityHashMap.put(Object[].class, "[O");
            identityHashMap.put(Object[][].class, "[[O");
            identityHashMap.put(byte[].class, "[B");
            identityHashMap.put(byte[][].class, "[[B");
            identityHashMap.put(short[].class, "[S");
            identityHashMap.put(short[][].class, "[[S");
            identityHashMap.put(int[].class, "[I");
            identityHashMap.put(int[][].class, "[[I");
            identityHashMap.put(long[].class, "[J");
            identityHashMap.put(long[][].class, "[[J");
            identityHashMap.put(float[].class, "[F");
            identityHashMap.put(float[][].class, "[[F");
            identityHashMap.put(double[].class, "[D");
            identityHashMap.put(double[][].class, "[[D");
            identityHashMap.put(char[].class, "[C");
            identityHashMap.put(char[][].class, "[[C");
            identityHashMap.put(boolean[].class, "[Z");
            identityHashMap.put(boolean[][].class, "[[Z");
            identityHashMap.put(Byte[].class, "[Byte");
            identityHashMap.put(Byte[][].class, "[[Byte");
            identityHashMap.put(Short[].class, "[Short");
            identityHashMap.put(Short[][].class, "[[Short");
            identityHashMap.put(Integer[].class, "[Integer");
            identityHashMap.put(Integer[][].class, "[[Integer");
            identityHashMap.put(Long[].class, "[Long");
            identityHashMap.put(Long[][].class, "[[Long");
            identityHashMap.put(Float[].class, "[Float");
            identityHashMap.put(Float[][].class, "[[Float");
            identityHashMap.put(Double[].class, "[Double");
            identityHashMap.put(Double[][].class, "[[Double");
            identityHashMap.put(Character[].class, "[Character");
            identityHashMap.put(Character[][].class, "[[Character");
            identityHashMap.put(Boolean[].class, "[Boolean");
            identityHashMap.put(Boolean[][].class, "[[Boolean");
            identityHashMap.put(String[].class, "[String");
            identityHashMap.put(String[][].class, "[[String");
            identityHashMap.put(BigDecimal[].class, "[BigDecimal");
            identityHashMap.put(BigDecimal[][].class, "[[BigDecimal");
            identityHashMap.put(BigInteger[].class, "[BigInteger");
            identityHashMap.put(BigInteger[][].class, "[[BigInteger");
            identityHashMap.put(UUID[].class, "[UUID");
            identityHashMap.put(UUID[][].class, "[[UUID");
            identityHashMap.put(Object.class, "Object");
            identityHashMap.put(HashMap.class, "M");
            concurrentHashMap.put("HashMap", HashMap.class);
            concurrentHashMap.put("java.util.HashMap", HashMap.class);
            identityHashMap.put(LinkedHashMap.class, "LM");
            concurrentHashMap.put("LinkedHashMap", LinkedHashMap.class);
            concurrentHashMap.put("java.util.LinkedHashMap", LinkedHashMap.class);
            identityHashMap.put(TreeMap.class, "TM");
            concurrentHashMap.put("TreeMap", TreeMap.class);
            identityHashMap.put(ArrayList.class, "A");
            concurrentHashMap.put("ArrayList", ArrayList.class);
            concurrentHashMap.put("java.util.ArrayList", ArrayList.class);
            identityHashMap.put(LinkedList.class, "LA");
            concurrentHashMap.put("LA", LinkedList.class);
            concurrentHashMap.put("LinkedList", LinkedList.class);
            concurrentHashMap.put("java.util.LinkedList", LinkedList.class);
            concurrentHashMap.put("java.util.concurrent.ConcurrentLinkedQueue", ConcurrentLinkedQueue.class);
            identityHashMap.put(HashSet.class, "HashSet");
            identityHashMap.put(TreeSet.class, "TreeSet");
            identityHashMap.put(LinkedHashSet.class, "LinkedHashSet");
            identityHashMap.put(ConcurrentHashMap.class, "ConcurrentHashMap");
            identityHashMap.put(ConcurrentLinkedQueue.class, "ConcurrentLinkedQueue");
            identityHashMap.put(JSONObject.class, "JSONObject");
            identityHashMap.put(JSONArray.class, "JSONArray");
            identityHashMap.put(Currency.class, "Currency");
            identityHashMap.put(TimeUnit.class, "TimeUnit");
            Class[] clsArr = {Object.class, Cloneable.class, AutoCloseable.class, Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, Hashtable.class, TreeMap.class, IdentityHashMap.class, WeakHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, LinkedList.class, TimeUnit.class, ConcurrentHashMap.class, AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Number.class, String.class, BigDecimal.class, BigInteger.class, BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, Currency.class, SimpleDateFormat.class, JSONObject.class, JSONArray.class, ConcurrentSkipListMap.class, ConcurrentSkipListSet.class};
            for (int i9 = 0; i9 < 68; i9++) {
                Class cls = clsArr[i9];
                String simpleName = cls.getSimpleName();
                Map<String, Class> map = TYPE_MAPPINGS;
                map.put(simpleName, cls);
                map.put(cls.getName(), cls);
                NAME_MAPPINGS.put(cls, simpleName);
            }
            Map<String, Class> map2 = TYPE_MAPPINGS;
            map2.put("JO10", JSONObject1O.class);
            map2.put("[O", Object[].class);
            map2.put("[Ljava.lang.Object;", Object[].class);
            map2.put("[java.lang.Object", Object[].class);
            map2.put("[Object", Object[].class);
            map2.put("StackTraceElement", StackTraceElement.class);
            map2.put("[StackTraceElement", StackTraceElement[].class);
            map2.put("java.util.Collections$UnmodifiableMap", Collections.unmodifiableMap(Collections.EMPTY_MAP).getClass());
            map2.put("java.util.Collections$UnmodifiableCollection", Collections.unmodifiableCollection(Collections.EMPTY_LIST).getClass());
            Class classJSONObject1x = JSONFactory.getClassJSONObject1x();
            if (classJSONObject1x != null) {
                map2.put("JO1", classJSONObject1x);
                map2.put(classJSONObject1x.getName(), classJSONObject1x);
            }
            Class classJSONArray1x = JSONFactory.getClassJSONArray1x();
            if (classJSONArray1x != null) {
                map2.put("JA1", classJSONArray1x);
                map2.put(classJSONArray1x.getName(), classJSONArray1x);
            }
            Map<Class, String> map3 = NAME_MAPPINGS;
            map3.put(new HashMap().keySet().getClass(), "Set");
            map3.put(new LinkedHashMap().keySet().getClass(), "Set");
            map3.put(new TreeMap().keySet().getClass(), "Set");
            map3.put(new ConcurrentHashMap().keySet().getClass(), "Set");
            map3.put(new ConcurrentSkipListMap().keySet().getClass(), "Set");
            map2.put("Set", HashSet.class);
            map3.put(new HashMap().values().getClass(), "List");
            map3.put(new LinkedHashMap().values().getClass(), "List");
            map3.put(new TreeMap().values().getClass(), "List");
            map3.put(new ConcurrentHashMap().values().getClass(), "List");
            map3.put(new ConcurrentSkipListMap().values().getClass(), "List");
            map2.put("List", ArrayList.class);
            map2.put("java.util.ImmutableCollections$Map1", HashMap.class);
            map2.put("java.util.ImmutableCollections$MapN", LinkedHashMap.class);
            map2.put("java.util.ImmutableCollections$Set12", LinkedHashSet.class);
            map2.put("java.util.ImmutableCollections$SetN", LinkedHashSet.class);
            map2.put("java.util.ImmutableCollections$List12", ArrayList.class);
            map2.put("java.util.ImmutableCollections$ListN", ArrayList.class);
            map2.put("java.util.ImmutableCollections$SubList", ArrayList.class);
            for (Map.Entry<Class, String> entry : map3.entrySet()) {
                String value = entry.getValue();
                Map<String, Class> map4 = TYPE_MAPPINGS;
                if (map4.get(value) == null) {
                    map4.put(value, entry.getKey());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        BigInteger[] bigIntegerArr = new BigInteger[19];
        bigIntegerArr[0] = BigInteger.ONE;
        bigIntegerArr[1] = BigInteger.TEN;
        long j3 = 10;
        for (int i9 = 2; i9 < 19; i9++) {
            j3 *= 10;
            bigIntegerArr[i9] = BigInteger.valueOf(j3);
        }
        BIG_TEN_POWERS_TABLE_0 = bigIntegerArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Class<T> cls, ObjectReaderProvider objectReaderProvider) {
        Function function;
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
        if (cls == String.class) {
            return obj instanceof Character ? (T) obj.toString() : (T) JSON.toJSONString(obj);
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
        Function typeConvert = objectReaderProvider.getTypeConvert(obj.getClass(), cls);
        if (typeConvert != null) {
            return (T) typeConvert.apply(obj);
        }
        if (cls.isEnum()) {
            ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls);
            if (!(objectReader instanceof ObjectReaderImplEnum)) {
                return (T) objectReader.readObject(JSONReader.m1666of(JSON.toJSONString(obj)), cls, null, 0L);
            }
            if (obj instanceof Integer) {
                return (T) ((ObjectReaderImplEnum) objectReader).m1712of(((Integer) obj).intValue());
            }
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            char cCharAt = str.trim().charAt(0);
            return (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls).readObject((cCharAt == '\"' || cCharAt == '{' || cCharAt == '[') ? JSONReader.m1666of(str) : JSONReader.m1666of(JSON.toJSONString(str)), cls, null, 0L);
        }
        if (cls.isEnum() && (obj instanceof Integer)) {
            int iIntValue = ((Integer) obj).intValue();
            ObjectReader objectReader2 = JSONFactory.defaultObjectReaderProvider.getObjectReader(cls);
            if (objectReader2 instanceof ObjectReaderImplEnum) {
                return (T) ((ObjectReaderImplEnum) objectReader2).m1712of(iIntValue);
            }
        }
        if (obj instanceof Collection) {
            return (T) objectReaderProvider.getObjectReader(cls).createInstance((Collection) obj);
        }
        String name = cls.getName();
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            long jLongValue = ((Number) obj).longValue();
            if (name.equals("java.time.LocalDateTime")) {
                return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), DateUtils.DEFAULT_ZONE_ID);
            }
            if (name.equals("java.sql.Date")) {
                return (T) new java.sql.Date(jLongValue);
            }
            if (name.equals("java.sql.Time")) {
                return (T) new Time(jLongValue);
            }
            if (name.equals("java.sql.Timestamp")) {
                return (T) new Timestamp(jLongValue);
            }
        }
        ObjectWriter objectWriter = JSONFactory.defaultObjectWriterProvider.getObjectWriter((Class) obj.getClass());
        if ((objectWriter instanceof ObjectWriterPrimitiveImpl) && (function = ((ObjectWriterPrimitiveImpl) objectWriter).getFunction()) != null) {
            T t9 = (T) function.apply(obj);
            if (cls.isInstance(t9)) {
                return t9;
            }
        }
        C0086a.m459r(AbstractC0255e.m1026o("can not cast to ", name, ", from "), obj.getClass());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int compare(Object obj, Object obj2) {
        Object bigDecimal;
        Object d10;
        if (obj.getClass() == obj2.getClass()) {
            return ((Comparable) obj).compareTo(obj2);
        }
        Class<?> cls = obj.getClass();
        Class<?> cls2 = obj2.getClass();
        if (cls == BigDecimal.class) {
            if (cls2 == Integer.class) {
                bigDecimal = new BigDecimal(((Integer) obj2).intValue());
            } else if (cls2 == Long.class) {
                bigDecimal = new BigDecimal(((Long) obj2).longValue());
            } else if (cls2 == Float.class) {
                obj2 = BigDecimal.valueOf(((Float) obj2).floatValue());
            } else if (cls2 == Double.class) {
                obj2 = BigDecimal.valueOf(((Double) obj2).doubleValue());
            } else if (cls2 == BigInteger.class) {
                bigDecimal = new BigDecimal((BigInteger) obj2);
            }
            obj2 = bigDecimal;
        } else if (cls == BigInteger.class) {
            if (cls2 == Integer.class) {
                obj2 = BigInteger.valueOf(((Integer) obj2).intValue());
            } else if (cls2 == Long.class) {
                obj2 = BigInteger.valueOf(((Long) obj2).longValue());
            } else {
                if (cls2 == Float.class) {
                    obj2 = BigDecimal.valueOf(((Float) obj2).floatValue());
                    d10 = new BigDecimal((BigInteger) obj);
                } else if (cls2 == Double.class) {
                    obj2 = BigDecimal.valueOf(((Double) obj2).doubleValue());
                    d10 = new BigDecimal((BigInteger) obj);
                } else if (cls2 == BigDecimal.class) {
                    d10 = new BigDecimal((BigInteger) obj);
                }
                obj = d10;
            }
        } else if (cls == Long.class) {
            if (cls2 == Integer.class) {
                bigDecimal = new Long(((Integer) obj2).intValue());
            } else {
                if (cls2 == BigDecimal.class) {
                    d10 = new BigDecimal(((Long) obj).longValue());
                } else if (cls2 == Float.class) {
                    d10 = new Float(((Long) obj).longValue());
                } else if (cls2 == Double.class) {
                    d10 = new Double(((Long) obj).longValue());
                } else if (cls2 == BigInteger.class) {
                    obj = BigInteger.valueOf(((Long) obj).longValue());
                } else if (cls2 == String.class) {
                    obj = BigDecimal.valueOf(((Long) obj).longValue());
                    bigDecimal = new BigDecimal((String) obj2);
                }
                obj = d10;
            }
            obj2 = bigDecimal;
        } else if (cls == Integer.class) {
            if (cls2 == Long.class) {
                d10 = new Long(((Integer) obj).intValue());
            } else if (cls2 == BigDecimal.class) {
                d10 = new BigDecimal(((Integer) obj).intValue());
            } else if (cls2 == BigInteger.class) {
                obj = BigInteger.valueOf(((Integer) obj).intValue());
            } else if (cls2 == Float.class) {
                d10 = new Float(((Integer) obj).intValue());
            } else if (cls2 == Double.class) {
                d10 = new Double(((Integer) obj).intValue());
            } else if (cls2 == String.class) {
                obj = BigDecimal.valueOf(((Integer) obj).intValue());
                bigDecimal = new BigDecimal((String) obj2);
                obj2 = bigDecimal;
            }
            obj = d10;
        } else if (cls == Double.class) {
            if (cls2 == Integer.class) {
                bigDecimal = new Double(((Integer) obj2).intValue());
            } else if (cls2 == Long.class) {
                bigDecimal = new Double(((Long) obj2).longValue());
            } else if (cls2 == Float.class) {
                bigDecimal = new Double(((Float) obj2).floatValue());
            } else if (cls2 == BigDecimal.class) {
                obj = BigDecimal.valueOf(((Double) obj).doubleValue());
            } else if (cls2 == String.class) {
                obj = BigDecimal.valueOf(((Double) obj).doubleValue());
                bigDecimal = new BigDecimal((String) obj2);
            } else if (cls2 == BigInteger.class) {
                obj = BigDecimal.valueOf(((Double) obj).doubleValue());
                bigDecimal = new BigDecimal((BigInteger) obj2);
            }
            obj2 = bigDecimal;
        } else if (cls == Float.class) {
            if (cls2 == Integer.class) {
                bigDecimal = new Float(((Integer) obj2).intValue());
            } else if (cls2 == Long.class) {
                bigDecimal = new Float(((Long) obj2).longValue());
            } else if (cls2 == Double.class) {
                d10 = new Double(((Float) obj).floatValue());
                obj = d10;
            } else if (cls2 == BigDecimal.class) {
                obj = BigDecimal.valueOf(((Float) obj).floatValue());
            } else if (cls2 == String.class) {
                obj = BigDecimal.valueOf(((Float) obj).floatValue());
                bigDecimal = new BigDecimal((String) obj2);
            } else if (cls2 == BigInteger.class) {
                obj = BigDecimal.valueOf(((Float) obj).floatValue());
                bigDecimal = new BigDecimal((BigInteger) obj2);
            }
            obj2 = bigDecimal;
        } else if (cls == String.class) {
            String str = (String) obj;
            if (cls2 == Integer.class) {
                NumberFormatException e6 = null;
                try {
                    obj = Integer.valueOf(Integer.parseInt(str));
                    e = null;
                } catch (NumberFormatException e7) {
                    e = e7;
                }
                if (e != null) {
                    try {
                        obj = Long.valueOf(Long.parseLong(str));
                        obj2 = Long.valueOf(((Integer) obj2).intValue());
                    } catch (NumberFormatException e10) {
                        e6 = e10;
                    }
                } else {
                    e6 = e;
                }
                if (e6 != null) {
                    obj = new BigDecimal(str);
                    obj2 = BigDecimal.valueOf(((Integer) obj2).intValue());
                }
            } else if (cls2 == Long.class) {
                obj = new BigDecimal(str);
                obj2 = BigDecimal.valueOf(((Long) obj2).longValue());
            } else if (cls2 == Float.class) {
                obj = Float.valueOf(Float.parseFloat(str));
            } else if (cls2 == Double.class) {
                obj = Double.valueOf(Double.parseDouble(str));
            } else if (cls2 == BigInteger.class) {
                obj = new BigInteger(str);
            } else if (cls2 == BigDecimal.class) {
                obj = new BigDecimal(str);
            }
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd A[PHI: r18
  0x00cd: PHI (r18v2 double) = (r18v0 double), (r18v4 double) binds: [B:85:0x0105, B:58:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double doubleValue(boolean z9, int i9, char[] cArr, int i10) {
        double d10;
        long j3;
        int i11;
        int i12;
        FDBigInteger fDBigIntegerRightInplaceSub;
        boolean z10;
        int i13 = i10;
        int length = SMALL_10_POW.length - 1;
        int length2 = SINGLE_SMALL_10_POW.length;
        int iMin = Math.min(i13, 16);
        int i14 = cArr[0] - '0';
        int iMin2 = Math.min(iMin, 9);
        for (int i15 = 1; i15 < iMin2; i15++) {
            i14 = ((i14 * 10) + cArr[i15]) - 48;
        }
        long j4 = i14;
        while (iMin2 < iMin) {
            j4 = (j4 * 10) + ((long) (cArr[iMin2] - '0'));
            iMin2++;
        }
        double d11 = j4;
        int i16 = i9 - iMin;
        if (i13 <= 15) {
            if (i16 == 0 || d11 == 0.0d) {
                return z9 ? -d11 : d11;
            }
            if (i16 >= 0) {
                if (i16 <= length) {
                    double d12 = d11 * SMALL_10_POW[i16];
                    return z9 ? -d12 : d12;
                }
                int i17 = 15 - iMin;
                if (i16 <= length + i17) {
                    double[] dArr = SMALL_10_POW;
                    double d13 = d11 * dArr[i17] * dArr[i16 - i17];
                    return z9 ? -d13 : d13;
                }
            } else if (i16 >= (-length)) {
                double d14 = d11 / SMALL_10_POW[-i16];
                return z9 ? -d14 : d14;
            }
        }
        if (i16 > 0) {
            if (i9 > 309) {
                return z9 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            }
            int i18 = i16 & 15;
            if (i18 != 0) {
                d11 *= SMALL_10_POW[i18];
            }
            int i19 = i16 >> 4;
            if (i19 != 0) {
                int i20 = 0;
                while (i19 > 1) {
                    if ((i19 & 1) != 0) {
                        d11 *= BIG_10_POW[i20];
                    }
                    i20++;
                    i19 >>= 1;
                }
                double[] dArr2 = BIG_10_POW;
                d10 = dArr2[i20] * d11;
                if (!Double.isInfinite(d10)) {
                    d11 = d10;
                } else {
                    if (Double.isInfinite((d11 / 2.0d) * dArr2[i20])) {
                        return z9 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
                    }
                    d11 = Double.MAX_VALUE;
                }
            }
        } else if (i16 < 0) {
            int i21 = -i16;
            if (i9 < -325) {
                return z9 ? -0.0d : 0.0d;
            }
            int i22 = i21 & 15;
            if (i22 != 0) {
                d11 /= SMALL_10_POW[i22];
            }
            int i23 = i21 >> 4;
            if (i23 != 0) {
                int i24 = 0;
                while (i23 > 1) {
                    if ((i23 & 1) != 0) {
                        d11 *= TINY_10_POW[i24];
                    }
                    i24++;
                    i23 >>= 1;
                }
                double d15 = TINY_10_POW[i24];
                d10 = d11 * d15;
                if (d10 == 0.0d) {
                    if (d11 * 2.0d * d15 == 0.0d) {
                        return z9 ? -0.0d : 0.0d;
                    }
                    d11 = Double.MIN_VALUE;
                }
            }
        }
        double d16 = d11;
        if (i13 > 1100) {
            cArr[1100] = '1';
            i13 = 1101;
        }
        int i25 = i13;
        FDBigInteger fDBigInteger = new FDBigInteger(j4, cArr, iMin, i25);
        int i26 = i9 - i25;
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d16);
        int iMax = Math.max(0, -i26);
        int iMax2 = Math.max(0, i26);
        FDBigInteger fDBigIntegerMultByPow52 = fDBigInteger.multByPow52(iMax2, 0);
        fDBigIntegerMultByPow52.immutable = true;
        FDBigInteger fDBigIntegerLeftShift = null;
        int i27 = 0;
        while (true) {
            int i28 = (int) (jDoubleToRawLongBits >>> 52);
            long j5 = 4503599627370495L & jDoubleToRawLongBits;
            if (i28 > 0) {
                j3 = j5 | FieldInfo.FIELD_MASK;
            } else {
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j5) - 11;
                j3 = j5 << iNumberOfLeadingZeros;
                i28 = 1 - iNumberOfLeadingZeros;
            }
            int i29 = i28 - 1023;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
            long j10 = j3 >>> iNumberOfTrailingZeros;
            int i30 = (i28 - 1075) + iNumberOfTrailingZeros;
            int i31 = 53 - iNumberOfTrailingZeros;
            if (i30 >= 0) {
                i12 = iMax + i30;
                i11 = iMax2;
            } else {
                i11 = iMax2 - i30;
                i12 = iMax;
            }
            int i32 = i29 <= -1023 ? i29 + iNumberOfTrailingZeros + 1023 : iNumberOfTrailingZeros + 1;
            int i33 = i12 + i32;
            int i34 = i11 + i32;
            int iMin3 = Math.min(i33, Math.min(i34, i12));
            int i35 = i34 - iMin3;
            int i36 = i12 - iMin3;
            FDBigInteger fDBigIntegerValueOfMulPow52 = FDBigInteger.valueOfMulPow52(j10, iMax, i33 - iMin3);
            if (fDBigIntegerLeftShift == null || i27 != i35) {
                fDBigIntegerLeftShift = fDBigIntegerMultByPow52.leftShift(i35);
                i27 = i35;
            }
            int iCmp = fDBigIntegerValueOfMulPow52.cmp(fDBigIntegerLeftShift);
            if (iCmp <= 0) {
                if (iCmp >= 0) {
                    break;
                }
                fDBigIntegerRightInplaceSub = fDBigIntegerLeftShift.rightInplaceSub(fDBigIntegerValueOfMulPow52);
                z10 = false;
            } else {
                fDBigIntegerRightInplaceSub = fDBigIntegerValueOfMulPow52.leftInplaceSub(fDBigIntegerLeftShift);
                if (i31 != 1 || i30 <= -1022 || i36 - 1 >= 0) {
                    z10 = true;
                } else {
                    fDBigIntegerRightInplaceSub = fDBigIntegerRightInplaceSub.leftShift(1);
                    z10 = true;
                    i36 = 0;
                }
            }
            int iCmpPow52 = fDBigIntegerRightInplaceSub.cmpPow52(iMax, i36);
            if (iCmpPow52 < 0) {
                break;
            }
            if (iCmpPow52 != 0) {
                jDoubleToRawLongBits += z10 ? -1L : 1L;
                if (jDoubleToRawLongBits == 0 || jDoubleToRawLongBits == 9218868437227405312L) {
                    break;
                }
            } else if ((jDoubleToRawLongBits & 1) != 0) {
                jDoubleToRawLongBits += z10 ? -1L : 1L;
            }
        }
        if (z9) {
            jDoubleToRawLongBits |= Long.MIN_VALUE;
        }
        return Double.longBitsToDouble(jDoubleToRawLongBits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float floatValue(boolean z9, int i9, char[] cArr, int i10) {
        int i11;
        int i12;
        int i13;
        FDBigInteger fDBigIntegerRightInplaceSub;
        boolean z10;
        int i14 = i10;
        int length = SINGLE_SMALL_10_POW.length - 1;
        int i15 = 8;
        int iMin = Math.min(i14, 8);
        int i16 = cArr[0] - '0';
        for (int i17 = 1; i17 < iMin; i17++) {
            i16 = ((i16 * 10) + cArr[i17]) - 48;
        }
        float f3 = i16;
        int i18 = i9 - iMin;
        if (i14 <= 7) {
            if (i18 == 0 || f3 == 0.0f) {
                return z9 ? -f3 : f3;
            }
            if (i18 >= 0) {
                if (i18 <= length) {
                    float f10 = f3 * SINGLE_SMALL_10_POW[i18];
                    return z9 ? -f10 : f10;
                }
                int i19 = 7 - iMin;
                if (i18 <= length + i19) {
                    float[] fArr = SINGLE_SMALL_10_POW;
                    float f11 = f3 * fArr[i19] * fArr[i18 - i19];
                    return z9 ? -f11 : f11;
                }
            } else if (i18 >= (-length)) {
                float f12 = f3 / SINGLE_SMALL_10_POW[-i18];
                return z9 ? -f12 : f12;
            }
        } else if (i9 >= i14 && i14 + i9 <= 15) {
            long j3 = i16;
            while (iMin < i14) {
                j3 = (j3 * 10) + ((long) (cArr[iMin] - '0'));
                iMin++;
            }
            float f13 = (float) (j3 * SMALL_10_POW[i9 - i14]);
            return z9 ? -f13 : f13;
        }
        double d10 = f3;
        if (i18 > 0) {
            if (i9 > 39) {
                return z9 ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            }
            int i20 = i18 & 15;
            if (i20 != 0) {
                d10 *= SMALL_10_POW[i20];
            }
            int i21 = i18 >> 4;
            if (i21 != 0) {
                int i22 = 0;
                while (i21 > 0) {
                    if ((i21 & 1) != 0) {
                        d10 *= BIG_10_POW[i22];
                    }
                    i22++;
                    i21 >>= 1;
                }
            }
        } else if (i18 < 0) {
            int i23 = -i18;
            if (i9 < -46) {
                return z9 ? -0.0f : 0.0f;
            }
            int i24 = i23 & 15;
            if (i24 != 0) {
                d10 /= SMALL_10_POW[i24];
            }
            int i25 = i23 >> 4;
            if (i25 != 0) {
                int i26 = 0;
                while (i25 > 0) {
                    if ((i25 & 1) != 0) {
                        d10 *= TINY_10_POW[i26];
                    }
                    i26++;
                    i25 >>= 1;
                }
            }
        }
        float fMax = Math.max(Float.MIN_VALUE, Math.min(Float.MAX_VALUE, (float) d10));
        if (i14 > 200) {
            cArr[200] = '1';
            i14 = 201;
        }
        int i27 = i14;
        FDBigInteger fDBigInteger = new FDBigInteger(i16, cArr, iMin, i27);
        int i28 = i9 - i27;
        int iFloatToRawIntBits = Float.floatToRawIntBits(fMax);
        int iMax = Math.max(0, -i28);
        int iMax2 = Math.max(0, i28);
        FDBigInteger fDBigIntegerMultByPow52 = fDBigInteger.multByPow52(iMax2, 0);
        fDBigIntegerMultByPow52.immutable = true;
        FDBigInteger fDBigIntegerLeftShift = null;
        int i29 = 0;
        while (true) {
            int i30 = iFloatToRawIntBits >>> 23;
            int i31 = 8388607 & iFloatToRawIntBits;
            if (i30 > 0) {
                i11 = i31 | 8388608;
            } else {
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i31) - i15;
                i11 = i31 << iNumberOfLeadingZeros;
                i30 = 1 - iNumberOfLeadingZeros;
            }
            int i32 = i30 - 127;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i11);
            int i33 = i11 >>> iNumberOfTrailingZeros;
            int i34 = (i30 - 150) + iNumberOfTrailingZeros;
            int i35 = 24 - iNumberOfTrailingZeros;
            if (i34 >= 0) {
                i13 = iMax + i34;
                i12 = iMax2;
            } else {
                i12 = iMax2 - i34;
                i13 = iMax;
            }
            int i36 = i32 <= -127 ? i32 + iNumberOfTrailingZeros + 127 : iNumberOfTrailingZeros + 1;
            int i37 = i13 + i36;
            int i38 = i12 + i36;
            int iMin2 = Math.min(i37, Math.min(i38, i13));
            int i39 = i38 - iMin2;
            int i40 = i13 - iMin2;
            FDBigInteger fDBigIntegerValueOfMulPow52 = FDBigInteger.valueOfMulPow52(i33, iMax, i37 - iMin2);
            if (fDBigIntegerLeftShift == null || i29 != i39) {
                fDBigIntegerLeftShift = fDBigIntegerMultByPow52.leftShift(i39);
                i29 = i39;
            }
            int iCmp = fDBigIntegerValueOfMulPow52.cmp(fDBigIntegerLeftShift);
            if (iCmp <= 0) {
                if (iCmp >= 0) {
                    break;
                }
                fDBigIntegerRightInplaceSub = fDBigIntegerLeftShift.rightInplaceSub(fDBigIntegerValueOfMulPow52);
                z10 = false;
            } else {
                fDBigIntegerRightInplaceSub = fDBigIntegerValueOfMulPow52.leftInplaceSub(fDBigIntegerLeftShift);
                if (i35 != 1 || i34 <= -126 || i40 - 1 >= 0) {
                    z10 = true;
                } else {
                    fDBigIntegerRightInplaceSub = fDBigIntegerRightInplaceSub.leftShift(1);
                    z10 = true;
                    i40 = 0;
                }
            }
            int iCmpPow52 = fDBigIntegerRightInplaceSub.cmpPow52(iMax, i40);
            if (iCmpPow52 < 0) {
                break;
            }
            if (iCmpPow52 != 0) {
                iFloatToRawIntBits += z10 ? -1 : 1;
                if (iFloatToRawIntBits == 0 || iFloatToRawIntBits == 2139095040) {
                    break;
                }
                i15 = 8;
            } else if ((iFloatToRawIntBits & 1) != 0) {
                iFloatToRawIntBits += z10 ? -1 : 1;
            }
        }
        if (z9) {
            iFloatToRawIntBits |= Integer.MIN_VALUE;
        }
        return Float.intBitsToFloat(iFloatToRawIntBits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> getArrayClass(Class cls) {
        return cls == Integer.TYPE ? int[].class : cls == Byte.TYPE ? byte[].class : cls == Short.TYPE ? short[].class : cls == Long.TYPE ? long[].class : cls == String.class ? String[].class : cls == Object.class ? Object[].class : Array.newInstance((Class<?>) cls, 1).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        return type == Character.TYPE ? (char) 0 : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Map getInnerMap(Map map) {
        return (Map) JSONFactory.getInnerMap().apply(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type getMapValueType(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return Object.class;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length == 2 ? actualTypeArguments[1] : Object.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getTypeName(Class cls) {
        String name = cls.getName();
        if (name.equals("java.util.HashMap")) {
            return "M";
        }
        if (name.equals("java.util.ArrayList")) {
            return "A";
        }
        if (name.equals("com.alibaba.fastjson.JSONObject")) {
            return "JO1";
        }
        if (name.equals("com.alibaba.fastjson.JSONArray")) {
            return "JA1";
        }
        if (!name.equals("java.util.List")) {
            if (name.equals("com.alibaba.fastjson2.JSONArray")) {
                return "JSONArray";
            }
            if (name.equals("java.lang.Object")) {
                return "Object";
            }
            if (name.equals("com.alibaba.fastjson2.JSONObject")) {
                return "JSONObject";
            }
            String str = Mapping.NAME_MAPPINGS.get(cls);
            if (str != null) {
                return str;
            }
            int iIndexOf = name.indexOf(36);
            if (iIndexOf != -1 && isInteger(name.substring(iIndexOf + 1))) {
                Class superclass = cls.getSuperclass();
                if (Map.class.isAssignableFrom(superclass)) {
                    return getTypeName(superclass);
                }
            }
        }
        return name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Type intern(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        return (rawType == List.class && actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) ? PARAM_TYPE_LIST_STR : type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-' || cCharAt == '+') {
            if (str.length() == 1) {
                return false;
            }
        } else if (cCharAt < '0' || cCharAt > '9') {
            return false;
        }
        for (int i9 = 1; i9 < str.length(); i9++) {
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isNumber(String str) {
        int i9;
        int length;
        boolean z9;
        boolean z10;
        if (str != null && !str.isEmpty()) {
            char cCharAt = str.charAt(0);
            if (cCharAt == '-' || cCharAt == '+') {
                if (str.length() == 1) {
                    return false;
                }
                cCharAt = str.charAt(1);
            } else {
                if (cCharAt != '.') {
                    i9 = 0;
                    length = str.length();
                    if ((cCharAt != '.') && cCharAt >= '0' && cCharAt <= '9') {
                        while (i9 < length) {
                            int i10 = i9 + 1;
                            char cCharAt2 = str.charAt(i9);
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                i9 = i10;
                                cCharAt = cCharAt2;
                                z9 = true;
                            } else {
                                i9 = i10;
                            }
                        }
                        return true;
                    }
                    z9 = false;
                    if (cCharAt == '.') {
                        z10 = false;
                    } else {
                        if (i9 >= length) {
                            return true;
                        }
                        int i11 = i9 + 1;
                        char cCharAt3 = str.charAt(i9);
                        if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                            while (i11 < length) {
                                i9 = i11 + 1;
                                cCharAt = str.charAt(i11);
                                if (cCharAt >= '0' && cCharAt <= '9') {
                                    i11 = i9;
                                }
                            }
                            return true;
                        }
                        i9 = i11;
                        cCharAt = cCharAt3;
                        z10 = true;
                    }
                    if (z9 && !z10) {
                        return false;
                    }
                    if (cCharAt != 'e' || cCharAt == 'E') {
                        if (i9 != length) {
                            return true;
                        }
                        int i12 = i9 + 1;
                        char cCharAt4 = str.charAt(i9);
                        if (cCharAt4 == '+' || cCharAt4 == '-') {
                            if (i12 < length) {
                                cCharAt4 = str.charAt(i12);
                                i12 = i9 + 2;
                            }
                        }
                        if (cCharAt4 >= '0' && cCharAt4 <= '9') {
                            while (i12 < length) {
                                int i13 = i12 + 1;
                                char cCharAt5 = str.charAt(i12);
                                if (cCharAt5 >= '0' && cCharAt5 <= '9') {
                                    i12 = i13;
                                }
                            }
                            return true;
                        }
                    }
                    return false;
                }
                if (str.length() == 1) {
                    return false;
                }
            }
            i9 = 1;
            length = str.length();
            if (cCharAt != '.') {
                z9 = false;
                if (cCharAt == '.') {
                }
                if (z9) {
                }
                if (cCharAt != 'e') {
                }
                if (i9 != length) {
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isUUID(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() == 32) {
            for (int i9 = 0; i9 < 32; i9++) {
                char cCharAt = str.charAt(i9);
                if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'F') && (cCharAt < 'a' || cCharAt > 'f'))) {
                    return false;
                }
            }
            return true;
        }
        if (str.length() != 36) {
            return false;
        }
        for (int i10 = 0; i10 < 36; i10++) {
            char cCharAt2 = str.charAt(i10);
            if (i10 == 8 || i10 == 13 || i10 == 18 || i10 == 23) {
                if (cCharAt2 != '-') {
                    return false;
                }
            } else if ((cCharAt2 < '0' || cCharAt2 > '9') && ((cCharAt2 < 'A' || cCharAt2 > 'F') && (cCharAt2 < 'a' || cCharAt2 > 'f'))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Class loadClass(String str) {
        if (str.length() >= 192) {
            return null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    b10 = 0;
                }
                break;
            case -2010664371:
                if (str.equals("java.io.IOException")) {
                    b10 = 1;
                }
                break;
            case -1939501217:
                if (str.equals("Object")) {
                    b10 = 2;
                }
                break;
            case -1932803762:
                if (str.equals("HashMap")) {
                    b10 = 3;
                }
                break;
            case -1932797868:
                if (str.equals("HashSet")) {
                    b10 = 4;
                }
                break;
            case -1899270121:
                if (str.equals("java.util.LinkedList")) {
                    b10 = 5;
                }
                break;
            case -1808118735:
                if (str.equals("String")) {
                    b10 = 6;
                }
                break;
            case -1659005919:
                if (str.equals("ConcurrentLinkedQueue")) {
                    b10 = 7;
                }
                break;
            case -1418007307:
                if (str.equals("LinkedHashMap")) {
                    b10 = 8;
                }
                break;
            case -1418001413:
                if (str.equals("LinkedHashSet")) {
                    b10 = 9;
                }
                break;
            case -1402722386:
                if (str.equals("java.util.HashMap")) {
                    b10 = 10;
                }
                break;
            case -1402716492:
                if (str.equals("java.util.HashSet")) {
                    b10 = 11;
                }
                break;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    b10 = 12;
                }
                break;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    b10 = 13;
                }
                break;
            case -1374008726:
                if (str.equals("byte[]")) {
                    b10 = 14;
                }
                break;
            case -1361632968:
                if (str.equals("char[]")) {
                    b10 = 15;
                }
                break;
            case -1325958191:
                if (str.equals("double")) {
                    b10 = JSONB.Constants.BC_INT32_NUM_16;
                }
                break;
            case -1114099497:
                if (str.equals("java.util.ArrayList")) {
                    b10 = 17;
                }
                break;
            case -1097129250:
                if (str.equals("long[]")) {
                    b10 = 18;
                }
                break;
            case -1074506598:
                if (str.equals("java.util.Collections$SingletonList")) {
                    b10 = 19;
                }
                break;
            case -958795145:
                if (str.equals("LinkedList")) {
                    b10 = 20;
                }
                break;
            case -766441794:
                if (str.equals("float[]")) {
                    b10 = 21;
                }
                break;
            case -530663260:
                if (str.equals("java.lang.Class")) {
                    b10 = 22;
                }
                break;
            case -413661986:
                if (str.equals("java.util.Collections$EmptyMap")) {
                    b10 = 23;
                }
                break;
            case -413656092:
                if (str.equals("java.util.Collections$EmptySet")) {
                    b10 = 24;
                }
                break;
            case -113680546:
                if (str.equals("Calendar")) {
                    b10 = 25;
                }
                break;
            case 65:
                if (str.equals("A")) {
                    b10 = 26;
                }
                break;
            case 66:
                if (str.equals("B")) {
                    b10 = 27;
                }
                break;
            case 67:
                if (str.equals("C")) {
                    b10 = 28;
                }
                break;
            case 68:
                if (str.equals("D")) {
                    b10 = 29;
                }
                break;
            case 70:
                if (str.equals("F")) {
                    b10 = 30;
                }
                break;
            case 73:
                if (str.equals("I")) {
                    b10 = 31;
                }
                break;
            case 74:
                if (str.equals("J")) {
                    b10 = 32;
                }
                break;
            case ParserConstants.RPAREN /* 77 */:
                if (str.equals("M")) {
                    b10 = 33;
                }
                break;
            case 79:
                if (str.equals("O")) {
                    b10 = 34;
                }
                break;
            case 83:
                if (str.equals("S")) {
                    b10 = 35;
                }
                break;
            case 90:
                if (str.equals("Z")) {
                    b10 = 36;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b10 = 37;
                }
                break;
            case 2433:
                if (str.equals("LM")) {
                    b10 = 38;
                }
                break;
            case 2887:
                if (str.equals("[B")) {
                    b10 = 39;
                }
                break;
            case 2888:
                if (str.equals("[C")) {
                    b10 = 40;
                }
                break;
            case 2889:
                if (str.equals("[D")) {
                    b10 = 41;
                }
                break;
            case 2891:
                if (str.equals("[F")) {
                    b10 = 42;
                }
                break;
            case 2894:
                if (str.equals("[I")) {
                    b10 = 43;
                }
                break;
            case 2895:
                if (str.equals("[J")) {
                    b10 = 44;
                }
                break;
            case 2900:
                if (str.equals("[O")) {
                    b10 = 45;
                }
                break;
            case 2904:
                if (str.equals("[S")) {
                    b10 = 46;
                }
                break;
            case 2911:
                if (str.equals("[Z")) {
                    b10 = JSONB.Constants.BC_INT32_NUM_MAX;
                }
                break;
            case 73612:
                if (str.equals("JO1")) {
                    b10 = JSONB.Constants.BC_INT32_BYTE_MIN;
                }
                break;
            case 77116:
                if (str.equals("Map")) {
                    b10 = 49;
                }
                break;
            case 83010:
                if (str.equals("Set")) {
                    b10 = 50;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    b10 = 51;
                }
                break;
            case 2122702:
                if (str.equals("Date")) {
                    b10 = 52;
                }
                break;
            case 2368702:
                if (str.equals("List")) {
                    b10 = 53;
                }
                break;
            case 2616251:
                if (str.equals("UUID")) {
                    b10 = 54;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    b10 = 55;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    b10 = JSONB.Constants.BC_INT32_BYTE_ZERO;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    b10 = 57;
                }
                break;
            case 61358428:
                if (str.equals("java.util.Collections$EmptyList")) {
                    b10 = 58;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    b10 = 59;
                }
                break;
            case 65821278:
                if (str.equals("java.util.List")) {
                    b10 = 60;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    b10 = 61;
                }
                break;
            case 100361105:
                if (str.equals("int[]")) {
                    b10 = 62;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    b10 = 63;
                }
                break;
            case 179563853:
                if (str.equals("java.util.Arrays$ArrayList")) {
                    b10 = JSONB.Constants.BC_INT32_SHORT_MIN;
                }
                break;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    b10 = 65;
                }
                break;
            case 578806391:
                if (str.equals("ArrayList")) {
                    b10 = 66;
                }
                break;
            case 600988612:
                if (str.equals("TreeSet")) {
                    b10 = 67;
                }
                break;
            case 889669201:
                if (str.equals("java.util.Collections$UnmodifiableRandomAccessList")) {
                    b10 = JSONB.Constants.BC_INT32_SHORT_ZERO;
                }
                break;
            case 935176422:
                if (str.equals("java.util.Collections$SingletonSet")) {
                    b10 = 69;
                }
                break;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    b10 = 70;
                }
                break;
            case 1131069988:
                if (str.equals("java.util.TreeSet")) {
                    b10 = JSONB.Constants.BC_INT32_SHORT_MAX;
                }
                break;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    b10 = JSONB.Constants.BC_INT32;
                }
                break;
            case 1258621781:
                if (str.equals("java.util.LinkedHashMap")) {
                    b10 = 73;
                }
                break;
            case 1258627675:
                if (str.equals("java.util.LinkedHashSet")) {
                    b10 = JSONB.Constants.BC_STR_ASCII_FIX_1;
                }
                break;
            case 1359468275:
                if (str.equals("double[]")) {
                    b10 = 75;
                }
                break;
            case 1372295063:
                if (str.equals("ConcurrentHashMap")) {
                    b10 = 76;
                }
                break;
            case 1645304908:
                if (str.equals("[String")) {
                    b10 = JSONB.Constants.BC_STR_ASCII_FIX_4;
                }
                break;
            case 1752376903:
                if (str.equals("JSONObject")) {
                    b10 = JSONB.Constants.BC_STR_ASCII_FIX_5;
                }
                break;
            case 2058423690:
                if (str.equals("boolean[]")) {
                    b10 = 79;
                }
                break;
            case 2067161310:
                if (str.equals("short[]")) {
                    b10 = 80;
                }
                break;
        }
        switch (b10) {
            case 0:
                return Integer.class;
            case 1:
                return IOException.class;
            case 2:
            case 34:
            case 70:
                return Object.class;
            case 3:
            case 10:
            case 33:
                return HashMap.class;
            case 4:
            case 11:
                return HashSet.class;
            case 5:
            case 20:
            case 37:
                return LinkedList.class;
            case 6:
            case 72:
                return String.class;
            case 7:
                return ConcurrentLinkedQueue.class;
            case 8:
            case 38:
            case 73:
                return LinkedHashMap.class;
            case 9:
            case 74:
                return LinkedHashSet.class;
            case 12:
            case 49:
                return Map.class;
            case 13:
            case 50:
                return Set.class;
            case 14:
            case 39:
                return byte[].class;
            case 15:
            case 40:
                return char[].class;
            case 16:
            case 29:
                return Double.TYPE;
            case 17:
            case 26:
            case 66:
                return ArrayList.class;
            case 18:
            case 44:
                return long[].class;
            case 19:
                return CLASS_SINGLE_LIST;
            case 21:
            case 42:
                return float[].class;
            case 22:
                return Class.class;
            case 23:
                return Collections.EMPTY_MAP.getClass();
            case 24:
                return Collections.EMPTY_SET.getClass();
            case 25:
                return Calendar.class;
            case 27:
            case 55:
                return Byte.TYPE;
            case 28:
            case 56:
                return Character.TYPE;
            case 30:
            case ParserConstants.WHILE /* 61 */:
                return Float.TYPE;
            case 31:
            case 51:
                return Integer.TYPE;
            case 32:
            case 57:
                return Long.TYPE;
            case 35:
            case ParserConstants.DECIMAL_LITERAL /* 63 */:
                return Short.TYPE;
            case 36:
            case ParserConstants.VOLATILE /* 59 */:
                return Boolean.TYPE;
            case 41:
            case 75:
                return double[].class;
            case 43:
            case ParserConstants.INTEGER_LITERAL /* 62 */:
                return int[].class;
            case ParserConstants.PROTECTED /* 45 */:
                return Object[].class;
            case 46:
            case 80:
                return short[].class;
            case 47:
            case 79:
                return boolean[].class;
            case 48:
                str = "com.alibaba.fastjson.JSONObject";
                break;
            case 52:
                return Date.class;
            case 53:
            case ParserConstants.WHEN /* 60 */:
                return List.class;
            case 54:
                return UUID.class;
            case 58:
                return Collections.EMPTY_LIST.getClass();
            case 64:
                return Arrays.asList(1).getClass();
            case 65:
                return Long.class;
            case 67:
            case 71:
                return TreeSet.class;
            case 68:
                return CLASS_UNMODIFIABLE_LIST;
            case 69:
                return CLASS_SINGLE_SET;
            case ParserConstants.LPAREN /* 76 */:
                return ConcurrentHashMap.class;
            case ParserConstants.RPAREN /* 77 */:
                return String[].class;
            case ParserConstants.LBRACE /* 78 */:
                return JSONObject.class;
        }
        Class cls = Mapping.TYPE_MAPPINGS.get(str);
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
            str = AbstractC4855en.m9262f(1, 1, str);
        }
        if (str.charAt(0) == '[' || str.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            Class clsLoadClass = loadClass(str.charAt(0) == '[' ? str.substring(1) : AbstractC4855en.m9262f(2, 0, str));
            if (clsLoadClass != null) {
                return Array.newInstance((Class<?>) clsLoadClass, 0).getClass();
            }
            C0086a.m464w("load class error ".concat(str));
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> T newProxyInstance(Class<T> cls, JSONObject jSONObject) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class nonePrimitive(Class cls) {
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        return !name.equals("double") ? !name.equals("int") ? !name.equals("byte") ? !name.equals("char") ? !name.equals("long") ? !name.equals("boolean") ? !name.equals("float") ? !name.equals("short") ? cls : Short.class : Float.class : Boolean.class : Long.class : Character.class : Byte.class : Integer.class : Double.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BigDecimal parseBigDecimal(byte[] bArr, int i9, int i10) {
        int i11;
        boolean z9;
        long j3;
        if (bArr == null || i10 == 0) {
            return null;
        }
        if (bArr[i9] == 45) {
            i11 = i9 + 1;
            z9 = true;
        } else {
            i11 = i9;
            z9 = false;
        }
        if (i10 <= 20 || (z9 && i10 == 21)) {
            int i12 = i9 + i10;
            int i13 = 0;
            int i14 = -1;
            long j4 = 0;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 != 46) {
                    j3 = 0;
                    if (b10 >= 48 && b10 <= 57) {
                        long j5 = j4 * 10;
                        if (((j4 | 10) >>> 31) == 0 || j5 / 10 == j4) {
                            j4 = j5 + ((long) (b10 + JSONB.Constants.BC_INT64_BYTE_ZERO));
                        }
                    }
                    j4 = -1;
                    break;
                }
                i13++;
                if (i13 > 1) {
                    break;
                }
                i14 = i11;
                i11++;
            }
            j3 = 0;
            if (j4 >= j3 && i13 <= 1) {
                if (z9) {
                    j4 = -j4;
                }
                return BigDecimal.valueOf(j4, i14 != -1 ? (i10 - (i14 - i9)) - 1 : 0);
            }
        }
        char[] cArr = new char[i10];
        for (int i15 = 0; i15 < i10; i15++) {
            cArr[i15] = (char) bArr[i9 + i15];
        }
        return new BigDecimal(cArr, 0, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Boolean parseBoolean(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return null;
        }
        if (i10 == 1) {
            byte b10 = bArr[i9];
            if (b10 == 49 || b10 == 89) {
                return Boolean.TRUE;
            }
            if (b10 == 48 || b10 == 78) {
                return Boolean.FALSE;
            }
        } else if (i10 != 4) {
            if (i10 == 5 && bArr[i9] == 102 && bArr[i9 + 1] == 97 && bArr[i9 + 2] == 108 && bArr[i9 + 3] == 115 && bArr[i9 + 4] == 101) {
                return Boolean.FALSE;
            }
        } else if (bArr[i9] == 116 && bArr[i9 + 1] == 114 && bArr[i9 + 2] == 117 && bArr[i9 + 3] == 101) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(Boolean.parseBoolean(new String(bArr, i9, i10)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011f, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0 A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112 A[Catch: StringIndexOutOfBoundsException -> 0x011f, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011f, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0112, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0117, B:102:0x011e), top: B:106:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double parseDouble(byte[] bArr, int i9, int i10) {
        boolean z9;
        int i11;
        boolean z10;
        char[] cArr;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        boolean z12;
        int i16;
        boolean z13;
        byte b10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        char c10;
        int i23 = i9 + i10;
        if (i10 == 0) {
            throw new NumberFormatException("empty String");
        }
        byte b11 = bArr[i9];
        if (b11 == 43) {
            z9 = false;
        } else {
            if (b11 != 45) {
                i11 = i9;
                z9 = false;
                z10 = false;
                cArr = new char[i10];
                i12 = 0;
                z11 = false;
                i13 = 0;
                while (i11 < i23) {
                    byte b12 = bArr[i11];
                    if (b12 != 48) {
                        if (b12 != 46) {
                            break;
                        }
                        if (z11) {
                            throw new NumberFormatException("multiple points");
                        }
                        int i24 = i11 - i9;
                        if (z10) {
                            i24--;
                        }
                        i13 = i24;
                        z11 = true;
                    } else {
                        i12++;
                    }
                    i11++;
                }
                int i25 = 0;
                i14 = 0;
                while (i11 < i23) {
                    byte b13 = bArr[i11];
                    if (b13 >= 49 && b13 <= 57) {
                        cArr[i25] = (char) b13;
                        i25++;
                        c10 = '.';
                        i14 = 0;
                    } else if (b13 != 48) {
                        c10 = '.';
                        if (b13 != 46) {
                            break;
                        }
                        if (z11) {
                            throw new NumberFormatException("multiple points");
                        }
                        int i26 = i11 - i9;
                        if (z10) {
                            i26--;
                        }
                        i13 = i26;
                        z11 = true;
                    } else {
                        cArr[i25] = (char) b13;
                        i14++;
                        i25++;
                        c10 = '.';
                    }
                    i11++;
                }
                i15 = i25 - i14;
                z12 = i15 != 0;
                if (z12 || i12 != 0) {
                    i16 = !z11 ? i13 - i12 : i15 + i14;
                    if (i11 < i23 || !((b10 = bArr[i11]) == 101 || b10 == 69)) {
                        z13 = z12;
                    } else {
                        int i27 = i11 + 1;
                        byte b14 = bArr[i27];
                        if (b14 == 43) {
                            i17 = 1;
                        } else if (b14 != 45) {
                            i18 = 1;
                            i19 = i27;
                            i20 = 0;
                            boolean z14 = false;
                            while (true) {
                                if (i19 < i23) {
                                    z13 = z12;
                                    break;
                                }
                                if (i20 >= 214748364) {
                                    z14 = true;
                                }
                                i21 = i19 + 1;
                                i22 = bArr[i19];
                                z13 = z12;
                                if (i22 < 48 || i22 > 57) {
                                    break;
                                }
                                i20 = (i20 * 10) + (i22 - 48);
                                i19 = i21;
                                z12 = z13;
                            }
                            int i28 = i15 + 324 + i14;
                            i16 = (!z14 || i20 > i28) ? i18 * i28 : (i18 * i20) + i16;
                            if (i19 != i27) {
                                i11 = i19;
                            }
                        } else {
                            i17 = -1;
                        }
                        int i29 = i11 + 2;
                        i18 = i17;
                        i27 = i29;
                        i19 = i27;
                        i20 = 0;
                        boolean z142 = false;
                        while (true) {
                            if (i19 < i23) {
                            }
                            i20 = (i20 * 10) + (i22 - 48);
                            i19 = i21;
                            z12 = z13;
                        }
                        int i282 = i15 + 324 + i14;
                        if (z142) {
                            i16 = (!z142 || i20 > i282) ? i18 * i282 : (i18 * i20) + i16;
                            if (i19 != i27) {
                            }
                        }
                    }
                    if (i11 < i23 || i11 == i23 - 1) {
                        return !z13 ? z9 ? -0.0d : 0.0d : doubleValue(z9, i16, cArr, i15);
                    }
                }
                C0086a.m462u(new String(bArr, i9, i10));
                return 0.0d;
            }
            z9 = true;
        }
        i11 = i9 + 1;
        z10 = true;
        cArr = new char[i10];
        i12 = 0;
        z11 = false;
        i13 = 0;
        while (i11 < i23) {
        }
        int i252 = 0;
        i14 = 0;
        while (i11 < i23) {
        }
        i15 = i252 - i14;
        if (i15 != 0) {
        }
        if (z12) {
            if (!z11) {
            }
            if (i11 < i23) {
                z13 = z12;
                if (i11 < i23) {
                }
                if (!z13) {
                }
            }
        }
        C0086a.m462u(new String(bArr, i9, i10));
        return 0.0d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011e, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111 A[Catch: StringIndexOutOfBoundsException -> 0x011e, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011e, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0084, B:36:0x006a, B:40:0x007b, B:42:0x007f, B:45:0x008a, B:46:0x008f, B:47:0x0090, B:54:0x009e, B:57:0x00a4, B:63:0x00b2, B:76:0x00d9, B:79:0x00e5, B:81:0x00f0, B:85:0x00f9, B:91:0x0104, B:99:0x0111, B:87:0x00fd, B:70:0x00c5, B:55:0x00a0, B:10:0x001b, B:101:0x0116, B:102:0x011d), top: B:106:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float parseFloat(byte[] bArr, int i9, int i10) {
        boolean z9;
        int i11;
        boolean z10;
        char[] cArr;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        boolean z12;
        int i16;
        boolean z13;
        byte b10;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        char c10;
        int i23 = i9 + i10;
        if (i10 == 0) {
            throw new NumberFormatException("empty String");
        }
        byte b11 = bArr[i9];
        if (b11 == 43) {
            z9 = false;
        } else {
            if (b11 != 45) {
                i11 = i9;
                z9 = false;
                z10 = false;
                cArr = new char[i10];
                i12 = 0;
                z11 = false;
                i13 = 0;
                while (i11 < i23) {
                    byte b12 = bArr[i11];
                    if (b12 != 48) {
                        if (b12 != 46) {
                            break;
                        }
                        if (z11) {
                            throw new NumberFormatException("multiple points");
                        }
                        int i24 = i11 - i9;
                        if (z10) {
                            i24--;
                        }
                        i13 = i24;
                        z11 = true;
                    } else {
                        i12++;
                    }
                    i11++;
                }
                int i25 = 0;
                i14 = 0;
                while (i11 < i23) {
                    byte b13 = bArr[i11];
                    if (b13 >= 49 && b13 <= 57) {
                        cArr[i25] = (char) b13;
                        i25++;
                        c10 = '.';
                        i14 = 0;
                    } else if (b13 != 48) {
                        c10 = '.';
                        if (b13 != 46) {
                            break;
                        }
                        if (z11) {
                            throw new NumberFormatException("multiple points");
                        }
                        int i26 = i11 - i9;
                        if (z10) {
                            i26--;
                        }
                        i13 = i26;
                        z11 = true;
                    } else {
                        cArr[i25] = (char) b13;
                        i14++;
                        i25++;
                        c10 = '.';
                    }
                    i11++;
                }
                i15 = i25 - i14;
                z12 = i15 != 0;
                if (z12 || i12 != 0) {
                    i16 = !z11 ? i13 - i12 : i15 + i14;
                    if (i11 < i23 || !((b10 = bArr[i11]) == 101 || b10 == 69)) {
                        z13 = z12;
                    } else {
                        int i27 = i11 + 1;
                        byte b14 = bArr[i27];
                        if (b14 == 43) {
                            i17 = 1;
                        } else if (b14 != 45) {
                            i18 = 1;
                            i19 = i27;
                            i20 = 0;
                            boolean z14 = false;
                            while (true) {
                                if (i19 < i23) {
                                    z13 = z12;
                                    break;
                                }
                                if (i20 >= 214748364) {
                                    z14 = true;
                                }
                                i21 = i19 + 1;
                                i22 = bArr[i19];
                                z13 = z12;
                                if (i22 < 48 || i22 > 57) {
                                    break;
                                }
                                i20 = (i20 * 10) + (i22 - 48);
                                i19 = i21;
                                z12 = z13;
                            }
                            int i28 = i15 + 324 + i14;
                            i16 = (!z14 || i20 > i28) ? i18 * i28 : (i18 * i20) + i16;
                            if (i19 != i27) {
                                i11 = i19;
                            }
                        } else {
                            i17 = -1;
                        }
                        int i29 = i11 + 2;
                        i18 = i17;
                        i27 = i29;
                        i19 = i27;
                        i20 = 0;
                        boolean z142 = false;
                        while (true) {
                            if (i19 < i23) {
                            }
                            i20 = (i20 * 10) + (i22 - 48);
                            i19 = i21;
                            z12 = z13;
                        }
                        int i282 = i15 + 324 + i14;
                        if (z142) {
                            i16 = (!z142 || i20 > i282) ? i18 * i282 : (i18 * i20) + i16;
                            if (i19 != i27) {
                            }
                        }
                    }
                    if (i11 < i23 || i11 == i23 - 1) {
                        return !z13 ? z9 ? -0.0f : 0.0f : floatValue(z9, i16, cArr, i15);
                    }
                }
                C0086a.m462u(new String(bArr, i9, i10));
                return 0.0f;
            }
            z9 = true;
        }
        i11 = i9 + 1;
        z10 = true;
        cArr = new char[i10];
        i12 = 0;
        z11 = false;
        i13 = 0;
        while (i11 < i23) {
        }
        int i252 = 0;
        i14 = 0;
        while (i11 < i23) {
        }
        i15 = i252 - i14;
        if (i15 != 0) {
        }
        if (z12) {
            if (!z11) {
            }
            if (i11 < i23) {
                z13 = z12;
                if (i11 < i23) {
                }
                if (!z13) {
                }
            }
        }
        C0086a.m462u(new String(bArr, i9, i10));
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int parseInt(byte[] bArr, int i9, int i10) {
        byte b10;
        int iM6853z;
        switch (i10) {
            case 1:
                byte b11 = bArr[i9];
                if (b11 >= 48 && b11 <= 57) {
                    return b11 - JSONB.Constants.BC_INT32_BYTE_MIN;
                }
                break;
            case 2:
                byte b12 = bArr[i9];
                byte b13 = bArr[i9 + 1];
                if (b12 >= 48 && b12 <= 57 && b13 >= 48 && b13 <= 57) {
                    return (b13 - JSONB.Constants.BC_INT32_BYTE_MIN) + ((b12 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10);
                }
                break;
            case 3:
                byte b14 = bArr[i9];
                byte b15 = bArr[i9 + 1];
                byte b16 = bArr[i9 + 2];
                if (b14 >= 48 && b14 <= 57 && b15 >= 48 && b15 <= 57 && b16 >= 48 && b16 <= 57) {
                    return (b16 - JSONB.Constants.BC_INT32_BYTE_MIN) + AbstractC3199a.m6853z(b15, 48, 10, (b14 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100);
                }
                break;
            case 4:
                byte b17 = bArr[i9];
                byte b18 = bArr[i9 + 1];
                byte b19 = bArr[i9 + 2];
                b10 = bArr[i9 + 3];
                if (b17 >= 48 && b17 <= 57 && b18 >= 48 && b18 <= 57 && b19 >= 48 && b19 <= 57 && b10 >= 48 && b10 <= 57) {
                    iM6853z = AbstractC3199a.m6853z(b19, 48, 10, AbstractC3199a.m6853z(b18, 48, 100, (b17 - JSONB.Constants.BC_INT32_BYTE_MIN) * 1000));
                    return (b10 - JSONB.Constants.BC_INT32_BYTE_MIN) + iM6853z;
                }
                break;
            case 5:
                byte b20 = bArr[i9];
                byte b21 = bArr[i9 + 1];
                byte b22 = bArr[i9 + 2];
                byte b23 = bArr[i9 + 3];
                byte b24 = bArr[i9 + 4];
                if (b20 >= 48 && b20 <= 57 && b21 >= 48 && b21 <= 57 && b22 >= 48 && b22 <= 57 && b23 >= 48 && b23 <= 57 && b24 >= 48 && b24 <= 57) {
                    return (b24 - JSONB.Constants.BC_INT32_BYTE_MIN) + AbstractC3199a.m6853z(b23, 48, 10, AbstractC3199a.m6853z(b22, 48, 100, AbstractC3199a.m6853z(b21, 48, 1000, (b20 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10000)));
                }
                break;
            case 6:
                byte b25 = bArr[i9];
                byte b26 = bArr[i9 + 1];
                byte b27 = bArr[i9 + 2];
                byte b28 = bArr[i9 + 3];
                byte b29 = bArr[i9 + 4];
                byte b30 = bArr[i9 + 5];
                if (b25 >= 48 && b25 <= 57 && b26 >= 48 && b26 <= 57 && b27 >= 48 && b27 <= 57 && b28 >= 48 && b28 <= 57 && b29 >= 48 && b29 <= 57 && b30 >= 48 && b30 <= 57) {
                    return (b30 - JSONB.Constants.BC_INT32_BYTE_MIN) + AbstractC3199a.m6853z(b29, 48, 10, AbstractC3199a.m6853z(b28, 48, 100, AbstractC3199a.m6853z(b27, 48, 1000, AbstractC3199a.m6853z(b26, 48, 10000, (b25 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100000))));
                }
                break;
            case 7:
                byte b31 = bArr[i9];
                byte b32 = bArr[i9 + 1];
                byte b33 = bArr[i9 + 2];
                byte b34 = bArr[i9 + 3];
                byte b35 = bArr[i9 + 4];
                byte b36 = bArr[i9 + 5];
                byte b37 = bArr[i9 + 6];
                if (b31 >= 48 && b31 <= 57 && b32 >= 48 && b32 <= 57 && b33 >= 48 && b33 <= 57 && b34 >= 48 && b34 <= 57 && b35 >= 48 && b35 <= 57 && b36 >= 48 && b36 <= 57 && b37 >= 48 && b37 <= 57) {
                    return (b37 - JSONB.Constants.BC_INT32_BYTE_MIN) + AbstractC3199a.m6853z(b36, 48, 10, AbstractC3199a.m6853z(b35, 48, 100, AbstractC3199a.m6853z(b34, 48, 1000, AbstractC3199a.m6853z(b33, 48, 10000, AbstractC3199a.m6853z(b32, 48, 100000, (b31 - JSONB.Constants.BC_INT32_BYTE_MIN) * 1000000)))));
                }
                break;
            case 8:
                byte b38 = bArr[i9];
                byte b39 = bArr[i9 + 1];
                byte b40 = bArr[i9 + 2];
                byte b41 = bArr[i9 + 3];
                byte b42 = bArr[i9 + 4];
                byte b43 = bArr[i9 + 5];
                byte b44 = bArr[i9 + 6];
                b10 = bArr[i9 + 7];
                if (b38 >= 48 && b38 <= 57 && b39 >= 48 && b39 <= 57 && b40 >= 48 && b40 <= 57 && b41 >= 48 && b41 <= 57 && b42 >= 48 && b42 <= 57 && b43 >= 48 && b43 <= 57 && b44 >= 48 && b44 <= 57 && b10 >= 48 && b10 <= 57) {
                    iM6853z = AbstractC3199a.m6853z(b44, 48, 10, AbstractC3199a.m6853z(b43, 48, 100, AbstractC3199a.m6853z(b42, 48, 1000, AbstractC3199a.m6853z(b41, 48, 10000, AbstractC3199a.m6853z(b40, 48, 100000, AbstractC3199a.m6853z(b39, 48, 1000000, (b38 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10000000))))));
                    return (b10 - JSONB.Constants.BC_INT32_BYTE_MIN) + iM6853z;
                }
                break;
        }
        return Integer.parseInt(new String(bArr, i9, i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long parseLong(byte[] bArr, int i9, int i10) {
        switch (i10) {
            case 1:
                byte b10 = bArr[i9];
                if (b10 >= 48 && b10 <= 57) {
                    return b10 - JSONB.Constants.BC_INT32_BYTE_MIN;
                }
                break;
            case 2:
                byte b11 = bArr[i9];
                byte b12 = bArr[i9 + 1];
                if (b11 >= 48 && b11 <= 57 && b12 >= 48 && b12 <= 57) {
                    return (((long) (b11 - JSONB.Constants.BC_INT32_BYTE_MIN)) * 10) + ((long) (b12 - JSONB.Constants.BC_INT32_BYTE_MIN));
                }
                break;
            case 3:
                byte b13 = bArr[i9];
                byte b14 = bArr[i9 + 1];
                byte b15 = bArr[i9 + 2];
                if (b13 >= 48 && b13 <= 57 && b14 >= 48 && b14 <= 57 && b15 >= 48 && b15 <= 57) {
                    return (((long) (b13 - JSONB.Constants.BC_INT32_BYTE_MIN)) * 100) + ((long) ((b14 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10)) + ((long) (b15 - JSONB.Constants.BC_INT32_BYTE_MIN));
                }
                break;
            case 4:
                byte b16 = bArr[i9];
                byte b17 = bArr[i9 + 1];
                byte b18 = bArr[i9 + 2];
                byte b19 = bArr[i9 + 3];
                if (b16 >= 48 && b16 <= 57 && b17 >= 48 && b17 <= 57 && b18 >= 48 && b18 <= 57 && b19 >= 48 && b19 <= 57) {
                    return (((long) (b16 - JSONB.Constants.BC_INT32_BYTE_MIN)) * 1000) + ((long) ((b17 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100)) + ((long) ((b18 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10)) + ((long) (b19 - JSONB.Constants.BC_INT32_BYTE_MIN));
                }
                break;
            case 5:
                byte b20 = bArr[i9];
                byte b21 = bArr[i9 + 1];
                byte b22 = bArr[i9 + 2];
                byte b23 = bArr[i9 + 3];
                byte b24 = bArr[i9 + 4];
                if (b20 >= 48 && b20 <= 57 && b21 >= 48 && b21 <= 57 && b22 >= 48 && b22 <= 57 && b23 >= 48 && b23 <= 57 && b24 >= 48 && b24 <= 57) {
                    return (((long) (b20 - JSONB.Constants.BC_INT32_BYTE_MIN)) * 10000) + ((long) ((b21 - JSONB.Constants.BC_INT32_BYTE_MIN) * 1000)) + ((long) ((b22 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100)) + ((long) ((b23 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10)) + ((long) (b24 - JSONB.Constants.BC_INT32_BYTE_MIN));
                }
                break;
            case 6:
                byte b25 = bArr[i9];
                byte b26 = bArr[i9 + 1];
                byte b27 = bArr[i9 + 2];
                byte b28 = bArr[i9 + 3];
                byte b29 = bArr[i9 + 4];
                byte b30 = bArr[i9 + 5];
                if (b25 >= 48 && b25 <= 57 && b26 >= 48 && b26 <= 57 && b27 >= 48 && b27 <= 57 && b28 >= 48 && b28 <= 57 && b29 >= 48 && b29 <= 57 && b30 >= 48 && b30 <= 57) {
                    return (((long) (b25 - JSONB.Constants.BC_INT32_BYTE_MIN)) * 100000) + ((long) ((b26 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10000)) + ((long) ((b27 - JSONB.Constants.BC_INT32_BYTE_MIN) * 1000)) + ((long) ((b28 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100)) + ((long) ((b29 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10)) + ((long) (b30 - JSONB.Constants.BC_INT32_BYTE_MIN));
                }
                break;
            case 7:
                byte b31 = bArr[i9];
                byte b32 = bArr[i9 + 1];
                byte b33 = bArr[i9 + 2];
                byte b34 = bArr[i9 + 3];
                byte b35 = bArr[i9 + 4];
                byte b36 = bArr[i9 + 5];
                byte b37 = bArr[i9 + 6];
                if (b31 >= 48 && b31 <= 57 && b32 >= 48 && b32 <= 57 && b33 >= 48 && b33 <= 57 && b34 >= 48 && b34 <= 57 && b35 >= 48 && b35 <= 57 && b36 >= 48 && b36 <= 57 && b37 >= 48 && b37 <= 57) {
                    return (((long) (b31 - JSONB.Constants.BC_INT32_BYTE_MIN)) * 1000000) + ((long) ((b32 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100000)) + ((long) ((b33 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10000)) + ((long) ((b34 - JSONB.Constants.BC_INT32_BYTE_MIN) * 1000)) + ((long) ((b35 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100)) + ((long) ((b36 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10)) + ((long) (b37 - JSONB.Constants.BC_INT32_BYTE_MIN));
                }
                break;
            case 8:
                byte b38 = bArr[i9];
                byte b39 = bArr[i9 + 1];
                byte b40 = bArr[i9 + 2];
                byte b41 = bArr[i9 + 3];
                byte b42 = bArr[i9 + 4];
                byte b43 = bArr[i9 + 5];
                byte b44 = bArr[i9 + 6];
                byte b45 = bArr[i9 + 7];
                if (b38 >= 48 && b38 <= 57 && b39 >= 48 && b39 <= 57 && b40 >= 48 && b40 <= 57 && b41 >= 48 && b41 <= 57 && b42 >= 48 && b42 <= 57 && b43 >= 48 && b43 <= 57 && b44 >= 48 && b44 <= 57 && b45 >= 48 && b45 <= 57) {
                    return (((long) (b38 - JSONB.Constants.BC_INT32_BYTE_MIN)) * 10000000) + ((long) ((b39 - JSONB.Constants.BC_INT32_BYTE_MIN) * 1000000)) + ((long) ((b40 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100000)) + ((long) ((b41 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10000)) + ((long) ((b42 - JSONB.Constants.BC_INT32_BYTE_MIN) * 1000)) + ((long) ((b43 - JSONB.Constants.BC_INT32_BYTE_MIN) * 100)) + ((long) ((b44 - JSONB.Constants.BC_INT32_BYTE_MIN) * 10)) + ((long) (b45 - JSONB.Constants.BC_INT32_BYTE_MIN));
                }
                break;
        }
        return Long.parseLong(new String(bArr, i9, i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static BigInteger power10(int i9) {
        BigInteger[] bigIntegerArr = BIG_TEN_POWERS_TABLE_0;
        if (i9 < bigIntegerArr.length) {
            return bigIntegerArr[i9];
        }
        BigInteger[] bigIntegerArr2 = BIG_TEN_POWERS_TABLE_1;
        if (bigIntegerArr2 == null) {
            BigInteger[] bigIntegerArr3 = new BigInteger[128];
            BigInteger bigIntegerMultiply = bigIntegerArr[18];
            for (int i10 = 19; i10 < 128; i10++) {
                bigIntegerMultiply = bigIntegerMultiply.multiply(BigInteger.TEN);
                bigIntegerArr3[i10] = bigIntegerMultiply;
            }
            BIG_TEN_POWERS_TABLE_1 = bigIntegerArr3;
            bigIntegerArr2 = bigIntegerArr3;
        }
        return bigIntegerArr2[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static char[] toAsciiCharArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i9 = 0; i9 < bArr.length; i9++) {
            cArr[i9] = (char) bArr[i9];
        }
        return cArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BigDecimal toBigDecimal(Object obj) {
        if (obj == null || (obj instanceof BigDecimal)) {
            return (BigDecimal) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigDecimal.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return (BigDecimal) cast(obj, BigDecimal.class, JSONFactory.defaultObjectReaderProvider);
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigDecimal(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BigInteger toBigInteger(Object obj) {
        if (obj == null || (obj instanceof BigInteger)) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            C0086a.m464w("can not cast to bigint");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigInteger(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        C0086a.m464w("can not cast to boolean");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean toBooleanValue(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return false;
            }
            return Boolean.parseBoolean(str);
        }
        if (obj instanceof Number) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue == 1) {
                return true;
            }
            if (iIntValue == 0) {
                return false;
            }
        }
        C0086a.m464w("can not cast to boolean");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Byte toByte(Object obj) {
        if (obj == null || (obj instanceof Byte)) {
            return (Byte) obj;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            C0086a.m464w("can not cast to byte");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m464w("can not cast to byte");
            return (byte) 0;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return (byte) 0;
        }
        return Byte.parseByte(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            return new Date(((LocalDate) obj).atStartOfDay(DateUtils.DEFAULT_ZONE_ID).toInstant().toEpochMilli());
        }
        if (obj instanceof LocalDateTime) {
            return new Date(ZonedDateTime.of((LocalDateTime) obj, DateUtils.DEFAULT_ZONE_ID).toInstant().toEpochMilli());
        }
        if (obj instanceof String) {
            long millis = DateUtils.parseMillis((String) obj, DateUtils.DEFAULT_ZONE_ID);
            if (millis == 0) {
                return null;
            }
            return new Date(millis);
        }
        if ((obj instanceof Long) || (obj instanceof Integer)) {
            return new Date(((Number) obj).longValue());
        }
        C0086a.m450i(obj.getClass(), "can not cast to Date from ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Double toDouble(Object obj) {
        if (obj == null || (obj instanceof Double)) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            C0086a.m464w("can not cast to decimal");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        if (!(obj instanceof String)) {
            C0086a.m464w("can not cast to decimal");
            return 0.0d;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0.0d;
        }
        return Double.parseDouble(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Float toFloat(Object obj) {
        if (obj == null || (obj instanceof Float)) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            C0086a.m464w("can not cast to decimal");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m464w("can not cast to decimal");
            return 0.0f;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0.0f;
        }
        return Float.parseFloat(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Instant toInstant(Object obj) {
        JSONReader jSONReaderM1666of;
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
            C0086a.m450i(obj.getClass(), "can not cast to Date from ");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str.charAt(0) != '\"') {
            jSONReaderM1666of = JSONReader.m1666of("\"" + str + '\"');
        } else {
            jSONReaderM1666of = JSONReader.m1666of(str);
        }
        return (Instant) jSONReaderM1666of.read(Instant.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m464w("can not cast to int");
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
        C0086a.m464w("parseInt error, ".concat(str));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        C0086a.m464w("can not cast to integer");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List toList(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        if (!(obj instanceof Iterable)) {
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to List", new StringBuilder("Can not cast '")));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m450i(obj.getClass(), "can not cast to long from ");
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
        C0086a.m464w("parseLong error ".concat(str));
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Short toShort(Object obj) {
        if (obj == null || (obj instanceof Short)) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            C0086a.m464w("can not cast to byte");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m464w("can not cast to byte");
            return (short) 0;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return (short) 0;
        }
        return Short.parseShort(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] toStringArray(Object obj) {
        if (obj == null || (obj instanceof String[])) {
            return (String[]) obj;
        }
        int i9 = 0;
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            String[] strArr = new String[collection.size()];
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i10 = i9 + 1;
                strArr[i9] = (next == null || (next instanceof String)) ? (String) next : next.toString();
                i9 = i10;
            }
            return strArr;
        }
        if (!obj.getClass().isArray()) {
            return (String[]) cast(obj, String[].class, JSONFactory.defaultObjectReaderProvider);
        }
        int length = Array.getLength(obj);
        String[] strArr2 = new String[length];
        while (i9 < length) {
            Object obj2 = Array.get(obj, i9);
            strArr2[i9] = (obj2 == null || (obj2 instanceof String)) ? (String) obj2 : obj2.toString();
            i9++;
        }
        return strArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean validateIPv4(String str, int i9) {
        int length;
        int length2;
        if (str != null && (length2 = (length = str.length()) - i9) >= 7 && length2 <= 25) {
            int i10 = i9;
            int i11 = 0;
            while (i9 < length) {
                char cCharAt = str.charAt(i9);
                if (cCharAt == '.' || i9 == length - 1) {
                    int i12 = cCharAt == '.' ? i9 : i9 + 1;
                    int i13 = i12 - i10;
                    if (i13 == 1) {
                        char cCharAt2 = str.charAt(i12 - 1);
                        if (cCharAt2 < '0' || cCharAt2 > '9') {
                            return false;
                        }
                    } else {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                return false;
                            }
                            char cCharAt3 = str.charAt(i12 - 3);
                            char cCharAt4 = str.charAt(i12 - 2);
                            char cCharAt5 = str.charAt(i12 - 1);
                            if (cCharAt3 >= '0' && cCharAt3 <= '2' && cCharAt4 >= '0' && cCharAt4 <= '9' && cCharAt5 >= '0' && cCharAt5 <= '9') {
                                if ((cCharAt5 - '0') + AbstractC3199a.m6853z(cCharAt4, 48, 10, (cCharAt3 - '0') * 100) > 255) {
                                }
                            }
                            return false;
                        }
                        char cCharAt6 = str.charAt(i12 - 2);
                        char cCharAt7 = str.charAt(i12 - 1);
                        if (cCharAt6 < '0' || cCharAt6 > '9' || cCharAt7 < '0' || cCharAt7 > '9') {
                            return false;
                        }
                    }
                    if (cCharAt == '.') {
                        i11++;
                        i10 = i9 + 1;
                    }
                }
                i9++;
            }
            if (i11 == 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    */
    public static boolean validateIPv6(String str) {
        boolean z9;
        char c10;
        boolean z10 = false;
        if (str == null) {
            return false;
        }
        int length = str.length();
        int i9 = 2;
        if (length < 2 || length > 39) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '.') {
                if (cCharAt == ':' || i10 == length - 1) {
                    int i13 = cCharAt == ':' ? i10 : i10 + 1;
                    int i14 = i13 - i11;
                    if (i14 != 0) {
                        z9 = z10;
                        if (i14 == 1) {
                            char cCharAt2 = str.charAt(i13 - 1);
                            if ((cCharAt2 < '0' || cCharAt2 > '9') && ((cCharAt2 < 'A' || cCharAt2 > 'F') && (cCharAt2 < 'a' || cCharAt2 > 'f'))) {
                                break;
                            }
                        } else if (i14 == i9) {
                            char cCharAt3 = str.charAt(i13 - 2);
                            char cCharAt4 = str.charAt(i13 - 1);
                            if (((cCharAt3 < '0' || cCharAt3 > '9') && ((cCharAt3 < 'A' || cCharAt3 > 'F') && (cCharAt3 < 'a' || cCharAt3 > 'f'))) || ((cCharAt4 < '0' || cCharAt4 > '9') && ((cCharAt4 < 'A' || cCharAt4 > 'F') && (cCharAt4 < 'a' || cCharAt4 > 'f')))) {
                                break;
                            }
                        } else if (i14 == 3) {
                            char cCharAt5 = str.charAt(i13 - 3);
                            char cCharAt6 = str.charAt(i13 - 2);
                            char cCharAt7 = str.charAt(i13 - 1);
                            if (((cCharAt5 < '0' || cCharAt5 > '9') && ((cCharAt5 < 'A' || cCharAt5 > 'F') && (cCharAt5 < 'a' || cCharAt5 > 'f'))) || (((cCharAt6 < '0' || cCharAt6 > '9') && ((cCharAt6 < 'A' || cCharAt6 > 'F') && (cCharAt6 < 'a' || cCharAt6 > 'f'))) || ((cCharAt7 < '0' || cCharAt7 > '9') && ((cCharAt7 < 'A' || cCharAt7 > 'F') && (cCharAt7 < 'a' || cCharAt7 > 'f'))))) {
                                break;
                            }
                        } else if (i14 == 4) {
                            char cCharAt8 = str.charAt(i13 - 4);
                            char cCharAt9 = str.charAt(i13 - 3);
                            char cCharAt10 = str.charAt(i13 - 2);
                            char cCharAt11 = str.charAt(i13 - 1);
                            if (((cCharAt8 < '0' || cCharAt8 > '9') && ((cCharAt8 < 'A' || cCharAt8 > 'F') && (cCharAt8 < 'a' || cCharAt8 > 'f'))) || (((cCharAt9 < '0' || cCharAt9 > '9') && ((cCharAt9 < 'A' || cCharAt9 > 'F') && (cCharAt9 < 'a' || cCharAt9 > 'f'))) || (((cCharAt10 < '0' || cCharAt10 > '9') && ((cCharAt10 < 'A' || cCharAt10 > 'F') && (cCharAt10 < 'a' || cCharAt10 > 'f'))) || ((cCharAt11 < '0' || cCharAt11 > '9') && ((cCharAt11 < 'A' || cCharAt11 > 'F') && (cCharAt11 < 'a' || cCharAt11 > 'f')))))) {
                                break;
                            }
                        } else {
                            return z9;
                        }
                        c10 = ':';
                    } else {
                        z9 = z10;
                        c10 = ':';
                    }
                    if (cCharAt == c10) {
                        i12++;
                        i11 = i10 + 1;
                    }
                } else {
                    z9 = z10;
                }
                i10++;
                z10 = z9;
                i9 = 2;
            } else if (!validateIPv4(str, i11)) {
                return z10;
            }
        }
        return z9;
    }

    public static boolean isInteger(byte[] bArr, int i9, int i10) {
        if (bArr == null || i10 == 0) {
            return false;
        }
        char c10 = (char) bArr[i9];
        if (c10 == '-' || c10 == '+') {
            if (i10 == 1) {
                return false;
            }
        } else if (c10 < '0' || c10 > '9') {
            return false;
        }
        int i11 = i10 + i9;
        for (int i12 = i9 + 1; i12 < i11; i12++) {
            char c11 = (char) bArr[i12];
            if (c11 < '0' || c11 > '9') {
                return false;
            }
        }
        return true;
    }

    public static BigDecimal toBigDecimal(long j3) {
        return BigDecimal.valueOf(j3);
    }

    public static BigDecimal toBigDecimal(float f3) {
        byte[] bArr = new byte[15];
        return parseBigDecimal(bArr, 0, DoubleToDecimal.toString(f3, bArr, 0, true));
    }

    public static BigDecimal toBigDecimal(double d10) {
        byte[] bArr = new byte[24];
        return parseBigDecimal(bArr, 0, DoubleToDecimal.toString(d10, bArr, 0, true));
    }

    public static BigDecimal toBigDecimal(String str) {
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        char[] charArray = str.toCharArray();
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
        return Mapping.TYPE_MAPPINGS.get(str);
    }

    public static Boolean parseBoolean(char[] cArr, int i9, int i10) {
        if (i10 == 0) {
            return null;
        }
        if (i10 == 1) {
            char c10 = cArr[i9];
            if (c10 == '1' || c10 == 'Y') {
                return Boolean.TRUE;
            }
            if (c10 == '0' || c10 == 'N') {
                return Boolean.FALSE;
            }
        } else if (i10 != 4) {
            if (i10 == 5 && cArr[i9] == 'f' && cArr[i9 + 1] == 'a' && cArr[i9 + 2] == 'l' && cArr[i9 + 3] == 's' && cArr[i9 + 4] == 'e') {
                return Boolean.FALSE;
            }
        } else if (cArr[i9] == 't' && cArr[i9 + 1] == 'r' && cArr[i9 + 2] == 'u' && cArr[i9 + 3] == 'e') {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(Boolean.parseBoolean(new String(cArr, i9, i10)));
    }

    public static String getTypeName(Type type) {
        if (type instanceof Class) {
            return getTypeName((Class) type);
        }
        return "<non-class>";
    }

    public static BigDecimal parseBigDecimal(char[] cArr, int i9, int i10) {
        int i11;
        boolean z9;
        if (cArr == null || i10 == 0) {
            return null;
        }
        if (cArr[i9] == '-') {
            i11 = i9 + 1;
            z9 = true;
        } else {
            i11 = i9;
            z9 = false;
        }
        if (i10 <= 20 || (z9 && i10 == 21)) {
            int i12 = i9 + i10;
            int i13 = -1;
            long j3 = 0;
            int i14 = 0;
            while (i11 < i12) {
                char c10 = cArr[i11];
                if (c10 != '.') {
                    if (c10 >= '0' && c10 <= '9') {
                        long j4 = j3 * 10;
                        if (((j3 | 10) >>> 31) == 0 || j4 / 10 == j3) {
                            j3 = j4 + ((long) (c10 - '0'));
                            i11++;
                        }
                    }
                    j3 = -1;
                    break;
                }
                i14++;
                if (i14 > 1) {
                    break;
                }
                i13 = i11;
                i11++;
            }
            if (j3 >= 0 && i14 <= 1) {
                if (z9) {
                    j3 = -j3;
                }
                return BigDecimal.valueOf(j3, i13 != -1 ? (i10 - (i13 - i9)) - 1 : 0);
            }
        }
        return new BigDecimal(cArr, i9, i10);
    }

    public static boolean validateIPv4(String str) {
        return validateIPv4(str, 0);
    }

    public static boolean isNumber(byte[] bArr, int i9, int i10) {
        int i11;
        boolean z9;
        boolean z10;
        if (bArr != null && i10 != 0) {
            char c10 = (char) bArr[i9];
            if (c10 == '-' || c10 == '+') {
                if (i10 == 1) {
                    return false;
                }
                i11 = i9 + 1;
                c10 = (char) bArr[i11];
            } else if (c10 != '.') {
                i11 = i9;
            } else {
                if (i10 == 1) {
                    return false;
                }
                i11 = i9 + 1;
            }
            int i12 = i9 + i10;
            if (!(c10 == '.') && c10 >= '0' && c10 <= '9') {
                while (i11 < i12) {
                    int i13 = i11 + 1;
                    c10 = (char) bArr[i11];
                    if (c10 < '0' || c10 > '9') {
                        i11 = i13;
                        z9 = true;
                    } else {
                        i11 = i13;
                    }
                }
                return true;
            }
            z9 = false;
            if (c10 != '.') {
                z10 = false;
            } else {
                if (i11 >= i12) {
                    return true;
                }
                int i14 = i11 + 1;
                char c11 = (char) bArr[i11];
                if (c11 >= '0' && c11 <= '9') {
                    while (i14 < i12) {
                        i11 = i14 + 1;
                        c10 = (char) bArr[i14];
                        if (c10 >= '0' && c10 <= '9') {
                            i14 = i11;
                        }
                    }
                    return true;
                }
                i11 = i14;
                c10 = c11;
                z10 = true;
            }
            if (!z9 && !z10) {
                return false;
            }
            if (c10 == 'e' || c10 == 'E') {
                if (i11 == i12) {
                    return true;
                }
                int i15 = i11 + 1;
                char c12 = (char) bArr[i11];
                if (c12 == '+' || c12 == '-') {
                    if (i15 < i12) {
                        c12 = (char) bArr[i15];
                        i15 = i11 + 2;
                    }
                }
                if (c12 >= '0' && c12 <= '9') {
                    while (i15 < i12) {
                        int i16 = i15 + 1;
                        char c13 = (char) bArr[i15];
                        if (c13 >= '0' && c13 <= '9') {
                            i15 = i16;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean isNumber(char[] cArr, int i9, int i10) {
        int i11;
        boolean z9;
        boolean z10;
        if (cArr != null && i10 != 0) {
            char c10 = cArr[i9];
            if (c10 == '-' || c10 == '+') {
                if (i10 == 1) {
                    return false;
                }
                i11 = i9 + 1;
                c10 = cArr[i11];
            } else if (c10 != '.') {
                i11 = i9;
            } else {
                if (i10 == 1) {
                    return false;
                }
                i11 = i9 + 1;
            }
            int i12 = i9 + i10;
            if (!(c10 == '.') && c10 >= '0' && c10 <= '9') {
                while (i11 < i12) {
                    int i13 = i11 + 1;
                    c10 = cArr[i11];
                    if (c10 < '0' || c10 > '9') {
                        i11 = i13;
                        z9 = true;
                    } else {
                        i11 = i13;
                    }
                }
                return true;
            }
            z9 = false;
            if (c10 != '.') {
                z10 = false;
            } else {
                if (i11 >= i12) {
                    return true;
                }
                int i14 = i11 + 1;
                char c11 = cArr[i11];
                if (c11 >= '0' && c11 <= '9') {
                    while (i14 < i12) {
                        i11 = i14 + 1;
                        c10 = cArr[i14];
                        if (c10 >= '0' && c10 <= '9') {
                            i14 = i11;
                        }
                    }
                    return true;
                }
                i11 = i14;
                c10 = c11;
                z10 = true;
            }
            if (!z9 && !z10) {
                return false;
            }
            if (c10 == 'e' || c10 == 'E') {
                if (i11 == i12) {
                    return true;
                }
                int i15 = i11 + 1;
                char c12 = cArr[i11];
                if (c12 == '+' || c12 == '-') {
                    if (i15 < i12) {
                        c12 = cArr[i15];
                        i15 = i11 + 2;
                    }
                }
                if (c12 >= '0' && c12 <= '9') {
                    while (i15 < i12) {
                        int i16 = i15 + 1;
                        char c13 = cArr[i15];
                        if (c13 >= '0' && c13 <= '9') {
                            i15 = i16;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011c, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f A[Catch: StringIndexOutOfBoundsException -> 0x011c, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011c, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x010f, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0114, B:102:0x011b), top: B:106:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static float parseFloat(char[] cArr, int i9, int i10) {
        boolean z9;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        boolean z12;
        boolean z13;
        char c10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        char c11;
        char c12;
        int i21 = i9 + i10;
        if (i10 != 0) {
            char c13 = cArr[i9];
            if (c13 == '+') {
                z9 = false;
            } else {
                if (c13 != '-') {
                    i11 = i9;
                    z9 = false;
                    z10 = false;
                    char[] cArr2 = new char[i10];
                    i12 = 0;
                    z11 = false;
                    i13 = 0;
                    while (i11 < i21) {
                        char c14 = cArr[i11];
                        if (c14 != '0') {
                            if (c14 != '.') {
                                break;
                            }
                            if (z11) {
                                throw new NumberFormatException("multiple points");
                            }
                            int i22 = i11 - i9;
                            if (z10) {
                                i22--;
                            }
                            i13 = i22;
                            z11 = true;
                        } else {
                            i12++;
                        }
                        i11++;
                    }
                    int i23 = 0;
                    i14 = 0;
                    while (i11 < i21) {
                        char c15 = cArr[i11];
                        if (c15 >= '1' && c15 <= '9') {
                            cArr2[i23] = c15;
                            i23++;
                            c12 = '.';
                            i14 = 0;
                        } else if (c15 != '0') {
                            c12 = '.';
                            if (c15 != '.') {
                                break;
                            }
                            if (z11) {
                                throw new NumberFormatException("multiple points");
                            }
                            int i24 = i11 - i9;
                            if (z10) {
                                i24--;
                            }
                            i13 = i24;
                            z11 = true;
                        } else {
                            cArr2[i23] = c15;
                            i14++;
                            i23++;
                            c12 = '.';
                        }
                        i11++;
                    }
                    i15 = i23 - i14;
                    z12 = i15 != 0;
                    if (z12 || i12 != 0) {
                        int i25 = !z11 ? i13 - i12 : i15 + i14;
                        if (i11 < i21 || !((c10 = cArr[i11]) == 'e' || c10 == 'E')) {
                            z13 = z12;
                        } else {
                            int i26 = i11 + 1;
                            char c16 = cArr[i26];
                            if (c16 == '+') {
                                i16 = 1;
                            } else if (c16 != '-') {
                                i17 = 1;
                                i18 = i26;
                                i19 = 0;
                                boolean z14 = false;
                                while (true) {
                                    if (i18 < i21) {
                                        z13 = z12;
                                        break;
                                    }
                                    if (i19 >= 214748364) {
                                        z14 = true;
                                    }
                                    i20 = i18 + 1;
                                    c11 = cArr[i18];
                                    z13 = z12;
                                    if (c11 < '0' || c11 > '9') {
                                        break;
                                    }
                                    i19 = (i19 * 10) + (c11 - '0');
                                    i18 = i20;
                                    z12 = z13;
                                }
                                int i27 = i15 + 324 + i14;
                                i25 = (!z14 || i19 > i27) ? i17 * i27 : (i17 * i19) + i25;
                                if (i18 != i26) {
                                    i11 = i18;
                                }
                            } else {
                                i16 = -1;
                            }
                            int i28 = i11 + 2;
                            i17 = i16;
                            i26 = i28;
                            i18 = i26;
                            i19 = 0;
                            boolean z142 = false;
                            while (true) {
                                if (i18 < i21) {
                                }
                                i19 = (i19 * 10) + (c11 - '0');
                                i18 = i20;
                                z12 = z13;
                            }
                            int i272 = i15 + 324 + i14;
                            if (z142) {
                                i25 = (!z142 || i19 > i272) ? i17 * i272 : (i17 * i19) + i25;
                                if (i18 != i26) {
                                }
                            }
                        }
                        if (i11 < i21 || i11 == i21 - 1) {
                            if (z13) {
                                return floatValue(z9, i25, cArr2, i15);
                            }
                            return z9 ? -0.0f : 0.0f;
                        }
                    }
                    C0086a.m462u(new String(cArr, i9, i10));
                    return 0.0f;
                }
                z9 = true;
            }
            i11 = i9 + 1;
            z10 = true;
            char[] cArr22 = new char[i10];
            i12 = 0;
            z11 = false;
            i13 = 0;
            while (i11 < i21) {
            }
            int i232 = 0;
            i14 = 0;
            while (i11 < i21) {
            }
            i15 = i232 - i14;
            if (i15 != 0) {
            }
            if (z12) {
                if (!z11) {
                }
                if (i11 < i21) {
                    z13 = z12;
                    if (i11 < i21) {
                    }
                    if (z13) {
                    }
                }
            }
            C0086a.m462u(new String(cArr, i9, i10));
            return 0.0f;
        }
        throw new NumberFormatException("empty String");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: StringIndexOutOfBoundsException -> 0x011d, TRY_ENTER, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110 A[Catch: StringIndexOutOfBoundsException -> 0x011d, TryCatch #0 {StringIndexOutOfBoundsException -> 0x011d, blocks: (B:4:0x000a, B:11:0x001e, B:15:0x002d, B:17:0x0031, B:24:0x0041, B:20:0x0038, B:22:0x003c, B:25:0x0046, B:26:0x004b, B:30:0x0053, B:33:0x005b, B:44:0x0082, B:36:0x0069, B:40:0x0079, B:42:0x007d, B:45:0x0088, B:46:0x008d, B:47:0x008e, B:54:0x009c, B:57:0x00a2, B:63:0x00b0, B:76:0x00d7, B:79:0x00e3, B:81:0x00ee, B:85:0x00f7, B:91:0x0102, B:99:0x0110, B:87:0x00fb, B:70:0x00c3, B:55:0x009e, B:10:0x001b, B:101:0x0115, B:102:0x011c), top: B:106:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double parseDouble(char[] cArr, int i9, int i10) {
        boolean z9;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        boolean z12;
        boolean z13;
        char c10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        char c11;
        char c12;
        int i21 = i9 + i10;
        if (i10 != 0) {
            char c13 = cArr[i9];
            if (c13 == '+') {
                z9 = false;
            } else {
                if (c13 != '-') {
                    i11 = i9;
                    z9 = false;
                    z10 = false;
                    char[] cArr2 = new char[i10];
                    i12 = 0;
                    z11 = false;
                    i13 = 0;
                    while (i11 < i21) {
                        char c14 = cArr[i11];
                        if (c14 != '0') {
                            if (c14 != '.') {
                                break;
                            }
                            if (z11) {
                                throw new NumberFormatException("multiple points");
                            }
                            int i22 = i11 - i9;
                            if (z10) {
                                i22--;
                            }
                            i13 = i22;
                            z11 = true;
                        } else {
                            i12++;
                        }
                        i11++;
                    }
                    int i23 = 0;
                    i14 = 0;
                    while (i11 < i21) {
                        char c15 = cArr[i11];
                        if (c15 >= '1' && c15 <= '9') {
                            cArr2[i23] = c15;
                            i23++;
                            c12 = '.';
                            i14 = 0;
                        } else if (c15 != '0') {
                            c12 = '.';
                            if (c15 != '.') {
                                break;
                            }
                            if (z11) {
                                throw new NumberFormatException("multiple points");
                            }
                            int i24 = i11 - i9;
                            if (z10) {
                                i24--;
                            }
                            i13 = i24;
                            z11 = true;
                        } else {
                            cArr2[i23] = c15;
                            i14++;
                            i23++;
                            c12 = '.';
                        }
                        i11++;
                    }
                    i15 = i23 - i14;
                    z12 = i15 != 0;
                    if (z12 || i12 != 0) {
                        int i25 = !z11 ? i13 - i12 : i15 + i14;
                        if (i11 < i21 || !((c10 = cArr[i11]) == 'e' || c10 == 'E')) {
                            z13 = z12;
                        } else {
                            int i26 = i11 + 1;
                            char c16 = cArr[i26];
                            if (c16 == '+') {
                                i16 = 1;
                            } else if (c16 != '-') {
                                i17 = 1;
                                i18 = i26;
                                i19 = 0;
                                boolean z14 = false;
                                while (true) {
                                    if (i18 < i21) {
                                        z13 = z12;
                                        break;
                                    }
                                    if (i19 >= 214748364) {
                                        z14 = true;
                                    }
                                    i20 = i18 + 1;
                                    c11 = cArr[i18];
                                    z13 = z12;
                                    if (c11 < '0' || c11 > '9') {
                                        break;
                                    }
                                    i19 = (i19 * 10) + (c11 - '0');
                                    i18 = i20;
                                    z12 = z13;
                                }
                                int i27 = i15 + 324 + i14;
                                i25 = (!z14 || i19 > i27) ? i17 * i27 : (i17 * i19) + i25;
                                if (i18 != i26) {
                                    i11 = i18;
                                }
                            } else {
                                i16 = -1;
                            }
                            int i28 = i11 + 2;
                            i17 = i16;
                            i26 = i28;
                            i18 = i26;
                            i19 = 0;
                            boolean z142 = false;
                            while (true) {
                                if (i18 < i21) {
                                }
                                i19 = (i19 * 10) + (c11 - '0');
                                i18 = i20;
                                z12 = z13;
                            }
                            int i272 = i15 + 324 + i14;
                            if (z142) {
                                i25 = (!z142 || i19 > i272) ? i17 * i272 : (i17 * i19) + i25;
                                if (i18 != i26) {
                                }
                            }
                        }
                        if (i11 < i21 || i11 == i21 - 1) {
                            if (z13) {
                                return doubleValue(z9, i25, cArr2, i15);
                            }
                            return z9 ? -0.0d : 0.0d;
                        }
                    }
                    C0086a.m462u(new String(cArr, i9, i10));
                    return 0.0d;
                }
                z9 = true;
            }
            i11 = i9 + 1;
            z10 = true;
            char[] cArr22 = new char[i10];
            i12 = 0;
            z11 = false;
            i13 = 0;
            while (i11 < i21) {
            }
            int i232 = 0;
            i14 = 0;
            while (i11 < i21) {
            }
            i15 = i232 - i14;
            if (i15 != 0) {
            }
            if (z12) {
                if (!z11) {
                }
                if (i11 < i21) {
                    z13 = z12;
                    if (i11 < i21) {
                    }
                    if (z13) {
                    }
                }
            }
            C0086a.m462u(new String(cArr, i9, i10));
            return 0.0d;
        }
        throw new NumberFormatException("empty String");
    }

    public static float floatValue(int i9, long j3, int i10) {
        float f3;
        float fScalb;
        float f10;
        float f11;
        long jNumberOfLeadingZeros = ((long) (64 - Long.numberOfLeadingZeros(j3))) - ((long) Math.ceil(((double) i10) * 3.321928094887362d));
        if (jNumberOfLeadingZeros < -151) {
            f10 = i9;
            f11 = 0.0f;
        } else {
            if (jNumberOfLeadingZeros <= 129) {
                if (i10 < 0) {
                    f3 = i9;
                    fScalb = BigInteger.valueOf(j3).multiply(power10(-i10)).floatValue();
                } else {
                    BigInteger bigIntegerValueOf = BigInteger.valueOf(j3);
                    int i11 = ((int) jNumberOfLeadingZeros) - 27;
                    BigInteger bigIntegerPower10 = power10(i10);
                    if (i11 <= 0) {
                        bigIntegerValueOf = bigIntegerValueOf.shiftLeft(-i11);
                    } else {
                        bigIntegerPower10 = bigIntegerPower10.shiftLeft(i11);
                    }
                    BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerValueOf.divideAndRemainder(bigIntegerPower10);
                    int iIntValue = bigIntegerArrDivideAndRemainder[0].intValue();
                    int iSignum = bigIntegerArrDivideAndRemainder[1].signum();
                    if (6 - Integer.numberOfLeadingZeros(iIntValue) >= (-151) - i11) {
                        f3 = i9;
                        fScalb = Math.scalb(iSignum | iIntValue, i11);
                    } else {
                        f3 = i9;
                        fScalb = Math.scalb(iSignum | Integer.signum(((1 << r2) - 1) & iIntValue) | (iIntValue >> r2), -151);
                    }
                }
                return fScalb * f3;
            }
            f10 = i9;
            f11 = Float.POSITIVE_INFINITY;
        }
        return f10 * f11;
    }

    public static int parseInt(char[] cArr, int i9, int i10) {
        char c10;
        int iM6853z;
        switch (i10) {
            case 1:
                char c11 = cArr[i9];
                if (c11 >= '0' && c11 <= '9') {
                    return c11 - '0';
                }
                break;
            case 2:
                char c12 = cArr[i9];
                char c13 = cArr[i9 + 1];
                if (c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
                    return (c13 - '0') + ((c12 - '0') * 10);
                }
                break;
            case 3:
                char c14 = cArr[i9];
                char c15 = cArr[i9 + 1];
                char c16 = cArr[i9 + 2];
                if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9' && c16 >= '0' && c16 <= '9') {
                    return (c16 - '0') + AbstractC3199a.m6853z(c15, 48, 10, (c14 - '0') * 100);
                }
                break;
            case 4:
                char c17 = cArr[i9];
                char c18 = cArr[i9 + 1];
                char c19 = cArr[i9 + 2];
                c10 = cArr[i9 + 3];
                if (c17 >= '0' && c17 <= '9' && c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9' && c10 >= '0' && c10 <= '9') {
                    iM6853z = AbstractC3199a.m6853z(c19, 48, 10, AbstractC3199a.m6853z(c18, 48, 100, (c17 - '0') * 1000));
                    return (c10 - '0') + iM6853z;
                }
                break;
            case 5:
                char c20 = cArr[i9];
                char c21 = cArr[i9 + 1];
                char c22 = cArr[i9 + 2];
                char c23 = cArr[i9 + 3];
                char c24 = cArr[i9 + 4];
                if (c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9' && c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9' && c24 >= '0' && c24 <= '9') {
                    return (c24 - '0') + AbstractC3199a.m6853z(c23, 48, 10, AbstractC3199a.m6853z(c22, 48, 100, AbstractC3199a.m6853z(c21, 48, 1000, (c20 - '0') * 10000)));
                }
                break;
            case 6:
                char c25 = cArr[i9];
                char c26 = cArr[i9 + 1];
                char c27 = cArr[i9 + 2];
                char c28 = cArr[i9 + 3];
                char c29 = cArr[i9 + 4];
                char c30 = cArr[i9 + 5];
                if (c25 >= '0' && c25 <= '9' && c26 >= '0' && c26 <= '9' && c27 >= '0' && c27 <= '9' && c28 >= '0' && c28 <= '9' && c29 >= '0' && c29 <= '9' && c30 >= '0' && c30 <= '9') {
                    return (c30 - '0') + AbstractC3199a.m6853z(c29, 48, 10, AbstractC3199a.m6853z(c28, 48, 100, AbstractC3199a.m6853z(c27, 48, 1000, AbstractC3199a.m6853z(c26, 48, 10000, (c25 - '0') * 100000))));
                }
                break;
            case 7:
                char c31 = cArr[i9];
                char c32 = cArr[i9 + 1];
                char c33 = cArr[i9 + 2];
                char c34 = cArr[i9 + 3];
                char c35 = cArr[i9 + 4];
                char c36 = cArr[i9 + 5];
                char c37 = cArr[i9 + 6];
                if (c31 >= '0' && c31 <= '9' && c32 >= '0' && c32 <= '9' && c33 >= '0' && c33 <= '9' && c34 >= '0' && c34 <= '9' && c35 >= '0' && c35 <= '9' && c36 >= '0' && c36 <= '9' && c37 >= '0' && c37 <= '9') {
                    return (c37 - '0') + AbstractC3199a.m6853z(c36, 48, 10, AbstractC3199a.m6853z(c35, 48, 100, AbstractC3199a.m6853z(c34, 48, 1000, AbstractC3199a.m6853z(c33, 48, 10000, AbstractC3199a.m6853z(c32, 48, 100000, (c31 - '0') * 1000000)))));
                }
                break;
            case 8:
                char c38 = cArr[i9];
                char c39 = cArr[i9 + 1];
                char c40 = cArr[i9 + 2];
                char c41 = cArr[i9 + 3];
                char c42 = cArr[i9 + 4];
                char c43 = cArr[i9 + 5];
                char c44 = cArr[i9 + 6];
                c10 = cArr[i9 + 7];
                if (c38 >= '0' && c38 <= '9' && c39 >= '0' && c39 <= '9' && c40 >= '0' && c40 <= '9' && c41 >= '0' && c41 <= '9' && c42 >= '0' && c42 <= '9' && c43 >= '0' && c43 <= '9' && c44 >= '0' && c44 <= '9' && c10 >= '0' && c10 <= '9') {
                    iM6853z = AbstractC3199a.m6853z(c44, 48, 10, AbstractC3199a.m6853z(c43, 48, 100, AbstractC3199a.m6853z(c42, 48, 1000, AbstractC3199a.m6853z(c41, 48, 10000, AbstractC3199a.m6853z(c40, 48, 100000, AbstractC3199a.m6853z(c39, 48, 1000000, (c38 - '0') * 10000000))))));
                    return (c10 - '0') + iM6853z;
                }
                break;
        }
        return Integer.parseInt(new String(cArr, i9, i10));
    }

    public static long parseLong(char[] cArr, int i9, int i10) {
        switch (i10) {
            case 1:
                char c10 = cArr[i9];
                if (c10 >= '0' && c10 <= '9') {
                    return c10 - '0';
                }
                break;
            case 2:
                char c11 = cArr[i9];
                char c12 = cArr[i9 + 1];
                if (c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9') {
                    return (((long) (c11 - '0')) * 10) + ((long) (c12 - '0'));
                }
                break;
            case 3:
                char c13 = cArr[i9];
                char c14 = cArr[i9 + 1];
                char c15 = cArr[i9 + 2];
                if (c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                    return (((long) (c13 - '0')) * 100) + ((long) ((c14 - '0') * 10)) + ((long) (c15 - '0'));
                }
                break;
            case 4:
                char c16 = cArr[i9];
                char c17 = cArr[i9 + 1];
                char c18 = cArr[i9 + 2];
                char c19 = cArr[i9 + 3];
                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9' && c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                    return (((long) (c16 - '0')) * 1000) + ((long) ((c17 - '0') * 100)) + ((long) ((c18 - '0') * 10)) + ((long) (c19 - '0'));
                }
                break;
            case 5:
                char c20 = cArr[i9];
                char c21 = cArr[i9 + 1];
                char c22 = cArr[i9 + 2];
                char c23 = cArr[i9 + 3];
                char c24 = cArr[i9 + 4];
                if (c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9' && c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9' && c24 >= '0' && c24 <= '9') {
                    return (((long) (c20 - '0')) * 10000) + ((long) ((c21 - '0') * 1000)) + ((long) ((c22 - '0') * 100)) + ((long) ((c23 - '0') * 10)) + ((long) (c24 - '0'));
                }
                break;
            case 6:
                char c25 = cArr[i9];
                char c26 = cArr[i9 + 1];
                char c27 = cArr[i9 + 2];
                char c28 = cArr[i9 + 3];
                char c29 = cArr[i9 + 4];
                char c30 = cArr[i9 + 5];
                if (c25 >= '0' && c25 <= '9' && c26 >= '0' && c26 <= '9' && c27 >= '0' && c27 <= '9' && c28 >= '0' && c28 <= '9' && c29 >= '0' && c29 <= '9' && c30 >= '0' && c30 <= '9') {
                    return (((long) (c25 - '0')) * 100000) + ((long) ((c26 - '0') * 10000)) + ((long) ((c27 - '0') * 1000)) + ((long) ((c28 - '0') * 100)) + ((long) ((c29 - '0') * 10)) + ((long) (c30 - '0'));
                }
                break;
            case 7:
                char c31 = cArr[i9];
                char c32 = cArr[i9 + 1];
                char c33 = cArr[i9 + 2];
                char c34 = cArr[i9 + 3];
                char c35 = cArr[i9 + 4];
                char c36 = cArr[i9 + 5];
                char c37 = cArr[i9 + 6];
                if (c31 >= '0' && c31 <= '9' && c32 >= '0' && c32 <= '9' && c33 >= '0' && c33 <= '9' && c34 >= '0' && c34 <= '9' && c35 >= '0' && c35 <= '9' && c36 >= '0' && c36 <= '9' && c37 >= '0' && c37 <= '9') {
                    return (((long) (c31 - '0')) * 1000000) + ((long) ((c32 - '0') * 100000)) + ((long) ((c33 - '0') * 10000)) + ((long) ((c34 - '0') * 1000)) + ((long) ((c35 - '0') * 100)) + ((long) ((c36 - '0') * 10)) + ((long) (c37 - '0'));
                }
                break;
            case 8:
                char c38 = cArr[i9];
                char c39 = cArr[i9 + 1];
                char c40 = cArr[i9 + 2];
                char c41 = cArr[i9 + 3];
                char c42 = cArr[i9 + 4];
                char c43 = cArr[i9 + 5];
                char c44 = cArr[i9 + 6];
                char c45 = cArr[i9 + 7];
                if (c38 >= '0' && c38 <= '9' && c39 >= '0' && c39 <= '9' && c40 >= '0' && c40 <= '9' && c41 >= '0' && c41 <= '9' && c42 >= '0' && c42 <= '9' && c43 >= '0' && c43 <= '9' && c44 >= '0' && c44 <= '9' && c45 >= '0' && c45 <= '9') {
                    return (((long) (c38 - '0')) * 10000000) + ((long) ((c39 - '0') * 1000000)) + ((long) ((c40 - '0') * 100000)) + ((long) ((c41 - '0') * 10000)) + ((long) ((c42 - '0') * 1000)) + ((long) ((c43 - '0') * 100)) + ((long) ((c44 - '0') * 10)) + ((long) (c45 - '0'));
                }
                break;
        }
        return Long.parseLong(new String(cArr, i9, i10));
    }

    public static <T> T cast(Object obj, Type type) {
        return (T) cast(obj, type, JSONFactory.defaultObjectReaderProvider);
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
        return (T) cast(obj, (Class) cls, JSONFactory.defaultObjectReaderProvider);
    }

    public static Object[] cast(Object obj, Type[] typeArr) {
        if (obj == null) {
            return null;
        }
        int length = typeArr.length;
        Object[] objArr = new Object[length];
        int i9 = 0;
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                objArr[i9] = cast(it.next(), typeArr[i9]);
                i9++;
            }
        } else {
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                int length2 = Array.getLength(obj);
                while (i9 < length && i9 < length2) {
                    objArr[i9] = cast(Array.get(obj, i9), typeArr[i9]);
                    i9++;
                }
            } else {
                C0086a.m454m("can not cast to types ", JSON.toJSONString(typeArr), " from ", cls);
                return null;
            }
        }
        return objArr;
    }

    public static double doubleValue(int i9, long j3, int i10) {
        long jNumberOfLeadingZeros = ((long) (64 - Long.numberOfLeadingZeros(j3))) - ((long) Math.ceil(((double) i10) * 3.321928094887362d));
        if (jNumberOfLeadingZeros < -1076) {
            return ((double) i9) * 0.0d;
        }
        if (jNumberOfLeadingZeros > 1025) {
            return ((double) i9) * Double.POSITIVE_INFINITY;
        }
        if (i10 < 0) {
            return BigInteger.valueOf(j3).multiply(power10(-i10)).doubleValue() * ((double) i9);
        }
        if (i10 == 0) {
            return ((double) i9) * j3;
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j3);
        int i11 = ((int) jNumberOfLeadingZeros) - 56;
        BigInteger bigIntegerPower10 = power10(i10);
        if (i11 <= 0) {
            bigIntegerValueOf = bigIntegerValueOf.shiftLeft(-i11);
        } else {
            bigIntegerPower10 = bigIntegerPower10.shiftLeft(i11);
        }
        BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerValueOf.divideAndRemainder(bigIntegerPower10);
        long jLongValue = bigIntegerArrDivideAndRemainder[0].longValue();
        int iSignum = bigIntegerArrDivideAndRemainder[1].signum();
        int i12 = (-1076) - i11;
        if (9 - Long.numberOfLeadingZeros(jLongValue) >= i12) {
            return Math.scalb(((long) iSignum) | jLongValue, i11) * ((double) i9);
        }
        return Math.scalb((jLongValue >> i12) | ((long) Long.signum(jLongValue & ((1 << i12) - 1))) | ((long) iSignum), -1076) * ((double) i9);
    }
}
