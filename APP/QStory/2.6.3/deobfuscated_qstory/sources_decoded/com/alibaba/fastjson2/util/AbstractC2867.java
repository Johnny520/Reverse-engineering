package com.alibaba.fastjson2.util;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.reader.C2725;
import com.alibaba.fastjson2.reader.C2802;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2867 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f9033;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final BigInteger f9034;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final BigInteger f9035;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final BigInteger f9036;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final BigInteger f9037;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final MethodType f9038;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final MethodType f9039;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final IdentityHashMap f9040;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f9041;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C2824 f9042;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static volatile MethodHandle f9043;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final BigInteger f9044;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final BigInteger f9045;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2830 f9046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Class f9047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class f9050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class f9051;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final MethodType f9052;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final MethodType f9053;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final MethodType f9054;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final MethodType f9055;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final MethodType f9056;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final MethodType f9057;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final MethodType f9058;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final MethodType f9059;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final MethodType f9060;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final MethodType f9061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final MethodType f9062;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final MethodType f9063;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final MethodType f9064;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final MethodType f9065;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final MethodType f9066;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final MethodType f9067;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final MethodType f9068;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final MethodType f9069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Class f9049 = Collections.singleton(1).getClass();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Class f9048 = Collections.singletonList(1).getClass();

    static {
        Collections.unmodifiableCollection(new ArrayList()).getClass();
        f9047 = Collections.unmodifiableList(new ArrayList()).getClass();
        Collections.unmodifiableSet(new HashSet()).getClass();
        Collections.unmodifiableSortedSet(new TreeSet()).getClass();
        Collections.unmodifiableNavigableSet(new TreeSet()).getClass();
        f9046 = new C2830(List.class, String.class);
        f9065 = MethodType.methodType(Supplier.class);
        f9064 = MethodType.methodType(Function.class);
        f9068 = MethodType.methodType(ToIntFunction.class);
        f9069 = MethodType.methodType(ToLongFunction.class);
        MethodType.methodType(ObjIntConsumer.class);
        f9066 = MethodType.methodType(IntFunction.class);
        f9067 = MethodType.methodType(LongFunction.class);
        f9059 = MethodType.methodType(BiFunction.class);
        f9058 = MethodType.methodType(BiConsumer.class);
        Class cls = Void.TYPE;
        f9062 = MethodType.methodType(cls, Object.class, Object.class);
        f9063 = MethodType.methodType(Object.class);
        f9060 = MethodType.methodType((Class<?>) Object.class, (Class<?>) Object.class);
        Class cls2 = Integer.TYPE;
        f9061 = MethodType.methodType((Class<?>) cls2, (Class<?>) Object.class);
        Class cls3 = Long.TYPE;
        f9053 = MethodType.methodType((Class<?>) cls3, (Class<?>) Object.class);
        MethodType.methodType(cls, Object.class, cls2);
        f9052 = MethodType.methodType((Class<?>) Object.class, (Class<?>) cls3);
        f9056 = MethodType.methodType((Class<?>) cls, (Class<?>) cls3);
        f9057 = MethodType.methodType(Object.class, Object.class, Object.class);
        f9054 = MethodType.methodType(cls);
        f9055 = MethodType.methodType((Class<?>) cls, (Class<?>) cls2);
        f9039 = MethodType.methodType((Class<?>) cls, (Class<?>) String.class);
        f9038 = MethodType.methodType((Class<?>) Object.class, (Class<?>) cls2);
        f9037 = BigInteger.valueOf(-2147483648L);
        f9036 = BigInteger.valueOf(2147483647L);
        f9035 = BigInteger.valueOf(Long.MIN_VALUE);
        f9034 = BigInteger.valueOf(Long.MAX_VALUE);
        f9045 = BigInteger.valueOf(-9007199254740991L);
        f9044 = BigInteger.valueOf(9007199254740991L);
        f9042 = new C2824();
        f9041 = AtomicReferenceFieldUpdater.newUpdater(C2824.class, char[].class, "飘花落叶言子楪世苏哲兰");
        f9040 = new IdentityHashMap();
        f9033 = new ConcurrentHashMap();
        Class clsM5929 = m5929("com.alibaba.fastjson.JSONObject");
        f9051 = clsM5929;
        if (clsM5929 != null) {
            try {
                clsM5929.getDeclaredField("map").setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        f9050 = m5929("com.alibaba.fastjson.JSONArray");
        IdentityHashMap identityHashMap = f9040;
        identityHashMap.put(Byte.TYPE, "B");
        identityHashMap.put(Short.TYPE, "S");
        identityHashMap.put(cls2, "I");
        identityHashMap.put(cls3, "J");
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
        ConcurrentHashMap concurrentHashMap = f9033;
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
        concurrentHashMap.put("java.util.concurrent.ConcurrentLinkedDeque", ConcurrentLinkedDeque.class);
        identityHashMap.put(HashSet.class, "HashSet");
        identityHashMap.put(TreeSet.class, "TreeSet");
        identityHashMap.put(LinkedHashSet.class, "LinkedHashSet");
        identityHashMap.put(ConcurrentHashMap.class, "ConcurrentHashMap");
        identityHashMap.put(ConcurrentLinkedQueue.class, "ConcurrentLinkedQueue");
        identityHashMap.put(ConcurrentLinkedDeque.class, "ConcurrentLinkedDeque");
        identityHashMap.put(JSONObject.class, "JSONObject");
        identityHashMap.put(JSONArray.class, "JSONArray");
        identityHashMap.put(Currency.class, "Currency");
        identityHashMap.put(TimeUnit.class, "TimeUnit");
        Class[] clsArr = {Object.class, Cloneable.class, AutoCloseable.class, Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, Hashtable.class, TreeMap.class, IdentityHashMap.class, WeakHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, LinkedList.class, TimeUnit.class, ConcurrentHashMap.class, AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Number.class, String.class, BigDecimal.class, BigInteger.class, BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, Currency.class, SimpleDateFormat.class, JSONObject.class, JSONArray.class, ConcurrentSkipListMap.class, ConcurrentSkipListSet.class};
        for (int i = 0; i < 68; i++) {
            Class cls4 = clsArr[i];
            ConcurrentHashMap concurrentHashMap2 = f9033;
            concurrentHashMap2.put(cls4.getSimpleName(), cls4);
            concurrentHashMap2.put(cls4.getName(), cls4);
            f9040.put(cls4, cls4.getSimpleName());
        }
        ConcurrentHashMap concurrentHashMap3 = f9033;
        concurrentHashMap3.put("JO10", JSONObject1O.class);
        concurrentHashMap3.put("[O", Object[].class);
        concurrentHashMap3.put("[Ljava.lang.Object;", Object[].class);
        concurrentHashMap3.put("[java.lang.Object", Object[].class);
        concurrentHashMap3.put("[Object", Object[].class);
        concurrentHashMap3.put("StackTraceElement", StackTraceElement.class);
        concurrentHashMap3.put("[StackTraceElement", StackTraceElement[].class);
        String[] strArr = {"java.util.Collections$UnmodifiableMap", "java.util.Collections$UnmodifiableCollection"};
        for (int i2 = 0; i2 < 2; i2++) {
            Class clsM59292 = m5929(strArr[i2]);
            f9033.put(clsM59292.getName(), clsM59292);
        }
        Class cls5 = f9051;
        if (cls5 != null) {
            ConcurrentHashMap concurrentHashMap4 = f9033;
            concurrentHashMap4.putIfAbsent("JO1", cls5);
            concurrentHashMap4.putIfAbsent(cls5.getName(), cls5);
        }
        Class cls6 = f9050;
        if (cls6 != null) {
            ConcurrentHashMap concurrentHashMap5 = f9033;
            concurrentHashMap5.putIfAbsent("JA1", cls6);
            concurrentHashMap5.putIfAbsent(cls6.getName(), cls6);
        }
        IdentityHashMap identityHashMap2 = f9040;
        identityHashMap2.put(new HashMap().keySet().getClass(), "Set");
        identityHashMap2.put(new LinkedHashMap().keySet().getClass(), "Set");
        identityHashMap2.put(new TreeMap().keySet().getClass(), "Set");
        identityHashMap2.put(new ConcurrentHashMap().keySet().getClass(), "Set");
        identityHashMap2.put(new ConcurrentSkipListMap().keySet().getClass(), "Set");
        ConcurrentHashMap concurrentHashMap6 = f9033;
        concurrentHashMap6.put("Set", HashSet.class);
        identityHashMap2.put(new HashMap().values().getClass(), "List");
        identityHashMap2.put(new LinkedHashMap().values().getClass(), "List");
        identityHashMap2.put(new TreeMap().values().getClass(), "List");
        identityHashMap2.put(new ConcurrentHashMap().values().getClass(), "List");
        identityHashMap2.put(new ConcurrentSkipListMap().values().getClass(), "List");
        concurrentHashMap6.put("List", ArrayList.class);
        concurrentHashMap6.put("java.util.ImmutableCollections$Map1", HashMap.class);
        concurrentHashMap6.put("java.util.ImmutableCollections$MapN", LinkedHashMap.class);
        concurrentHashMap6.put("java.util.ImmutableCollections$Set12", LinkedHashSet.class);
        concurrentHashMap6.put("java.util.ImmutableCollections$SetN", LinkedHashSet.class);
        concurrentHashMap6.put("java.util.ImmutableCollections$List12", ArrayList.class);
        concurrentHashMap6.put("java.util.ImmutableCollections$ListN", ArrayList.class);
        concurrentHashMap6.put("java.util.ImmutableCollections$SubList", ArrayList.class);
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            f9033.putIfAbsent((String) entry.getValue(), (Class) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static boolean m5898(int i, String str) {
        int length;
        int length2;
        if (str != null && (length2 = (length = str.length()) - i) >= 7 && length2 <= 25) {
            int i2 = i;
            int i3 = 0;
            while (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '.' || i == length - 1) {
                    int i4 = cCharAt == '.' ? i : i + 1;
                    int i5 = i4 - i2;
                    if (i5 == 1) {
                        char cCharAt2 = str.charAt(i4 - 1);
                        if (cCharAt2 < '0' || cCharAt2 > '9') {
                            return false;
                        }
                    } else {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                return false;
                            }
                            char cCharAt3 = str.charAt(i4 - 3);
                            char cCharAt4 = str.charAt(i4 - 2);
                            char cCharAt5 = str.charAt(i4 - 1);
                            if (cCharAt3 >= '0' && cCharAt3 <= '2' && cCharAt4 >= '0' && cCharAt4 <= '9' && cCharAt5 >= '0' && cCharAt5 <= '9') {
                                if ((cCharAt5 - '0') + AbstractC0053.m143(cCharAt4, 48, 10, (cCharAt3 - '0') * 100) > 255) {
                                }
                            }
                            return false;
                        }
                        char cCharAt6 = str.charAt(i4 - 2);
                        char cCharAt7 = str.charAt(i4 - 1);
                        if (cCharAt6 < '0' || cCharAt6 > '9' || cCharAt7 < '0' || cCharAt7 > '9') {
                            return false;
                        }
                    }
                    if (cCharAt == '.') {
                        i3++;
                        i2 = i + 1;
                    }
                }
                i++;
            }
            if (i3 == 3) {
                return true;
            }
        }
        return false;
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
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m5899(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2867.m5899(java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static short m5900(Object obj) {
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
            C0276.m850("can not cast to byte");
            return (short) 0;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return (short) 0;
        }
        return Short.parseShort(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static Short m5901(Object obj) {
        if (obj == null || (obj instanceof Short)) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            C0276.m850("can not cast to byte");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static String m5902(char c, char c2) {
        return (c < ' ' || c > '~' || c2 < ' ' || c2 > '~') ? new String(new char[]{c, c2}) : AbstractC2820.f8781[(c2 - ' ') + ((c - ' ') * 95)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static String m5903(char c) {
        String[] strArr = AbstractC2820.f8782;
        return c < strArr.length ? strArr[c] : Character.toString(c);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static Long m5904(Object obj) {
        if (obj == null || (obj instanceof Long)) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
        }
        return Long.valueOf(m5905(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static long m5905(Object obj) {
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
            C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("can not cast to long from ")));
            return 0L;
        }
        String str = (String) obj;
        if (!str.isEmpty() && !"null".equals(str)) {
            try {
                if (str.lastIndexOf(44) == str.length() - 4 && str.indexOf(46) == -1) {
                    return NumberFormat.getNumberInstance().parse(str).longValue();
                }
            } catch (ParseException unused) {
            }
            if (AbstractC2849.m5688(str)) {
                return Long.parseLong(str);
            }
            C0276.m850("parseLong error ".concat(str));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static Instant m5906(Object obj) {
        AbstractC2899 abstractC2899M6091;
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
                return (Instant) C2725.f8293.mo5507((Map) obj, 0L);
            }
            C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("can not cast to Date from ")));
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str.charAt(0) != '\"') {
            abstractC2899M6091 = AbstractC2899.m6091("\"" + str + '\"');
        } else {
            abstractC2899M6091 = AbstractC2899.m6091(str);
        }
        return (Instant) abstractC2899M6091.mo6140(Instant.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static float m5907(Object obj) {
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
            C0276.m850("can not cast to decimal");
            return 0.0f;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0.0f;
        }
        return Float.parseFloat(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static Integer m5908(Object obj) {
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
        C0276.m850("can not cast to integer");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static int m5909(Object obj) {
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
            C0276.m850("can not cast to int");
            return 0;
        }
        String str = (String) obj;
        if (!str.isEmpty() && !"null".equals(str)) {
            try {
                if (str.lastIndexOf(44) == str.length() - 4 && str.indexOf(46) == -1) {
                    return NumberFormat.getNumberInstance().parse(str).intValue();
                }
            } catch (ParseException unused) {
            }
            if (AbstractC2849.m5688(str)) {
                return Integer.parseInt(str);
            }
            C0276.m850("parseInt error, ".concat(str));
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static boolean m5910(Object obj) {
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
        C0276.m850("can not cast to boolean");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static Boolean m5911(Object obj) {
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
        C0276.m850("can not cast to boolean");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static BigInteger m5912(Object obj) {
        if (obj == null || (obj instanceof BigInteger)) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            C0276.m850("can not cast to bigint");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigInteger(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static BigDecimal m5913(String str) {
        Function function;
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        ToIntFunction toIntFunction = AbstractC2854.f8926;
        if (toIntFunction == null || toIntFunction.applyAsInt(str) != 0 || (function = AbstractC2854.f8927) == null) {
            char[] cArrM5770 = AbstractC2854.m5770(str);
            return m5932(0, cArrM5770.length, cArrM5770);
        }
        byte[] bArr = (byte[]) function.apply(str);
        return m5933(0, bArr, bArr.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static BigDecimal m5914(Object obj) {
        if (obj == null || (obj instanceof BigDecimal)) {
            return (BigDecimal) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigDecimal.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return (BigDecimal) m5927(BigDecimal.class, obj);
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigDecimal(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static BigDecimal m5915(double d) {
        byte[] bArr = new byte[24];
        return m5933(0, bArr, AbstractC2827.m5674(bArr, 0, d));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static Float m5916(Object obj) {
        if (obj == null || (obj instanceof Float)) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            C0276.m850("can not cast to decimal");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static double m5917(Object obj) {
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
        boolean z = obj instanceof Collection;
        if ((z && ((Collection) obj).isEmpty()) || ((obj instanceof Map) && ((Map) obj).isEmpty())) {
            return 0.0d;
        }
        if (z) {
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
        C0276.m850("can not cast to double");
        return 0.0d;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static Double m5918(Object obj) {
        if (obj == null || (obj instanceof Double)) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            C0276.m850("can not cast to double");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static Date m5919(Object obj) {
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
            return AbstractC2866.m5868((String) obj);
        }
        if ((obj instanceof Long) || (obj instanceof Integer)) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("$date");
            if (obj2 instanceof String) {
                return AbstractC2866.m5868((String) obj2);
            }
        }
        C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("can not cast to Date from ")));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static byte m5920(Object obj) {
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
            C0276.m850("can not cast to byte");
            return (byte) 0;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return (byte) 0;
        }
        return Byte.parseByte(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static Byte m5921(Object obj) {
        if (obj == null || (obj instanceof Byte)) {
            return (Byte) obj;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            C0276.m850("can not cast to byte");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static double m5922(int i, int i2, long j) {
        long jNumberOfLeadingZeros = ((long) (64 - Long.numberOfLeadingZeros(j))) - ((long) Math.ceil(((double) i2) * 3.321928094887362d));
        if (jNumberOfLeadingZeros < -1076) {
            return ((double) i) * 0.0d;
        }
        if (jNumberOfLeadingZeros > 1025) {
            return ((double) i) * Double.POSITIVE_INFINITY;
        }
        if (i2 == 0) {
            return ((double) i) * j;
        }
        int i3 = ((int) jNumberOfLeadingZeros) - 56;
        if (9 - Long.numberOfLeadingZeros(AbstractC2860.m5777(i3, i2, j)) >= (-1076) - i3) {
            return Math.scalb(r7 | 1, i3) * ((double) i);
        }
        return Math.scalb(((long) Long.signum(r7 & ((1 << r1) - 1))) | (r7 >> r1) | 1, -1076) * ((double) i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m5923(Object obj, Object obj2) {
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

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Object m5924(Object obj, Type type, C2802 c2802) throws IOException {
        if (type instanceof Class) {
            return m5926(obj, (Class) type, c2802);
        }
        if (obj instanceof Collection) {
            return c2802.m5633(type, false).mo5469((Collection) obj, 0L);
        }
        if (obj instanceof Map) {
            return c2802.m5633(type, false).mo5507((Map) obj, 0L);
        }
        String strM6375 = InterfaceC2916.m6375(obj);
        if (strM6375 == null || strM6375.isEmpty()) {
            return null;
        }
        C2802 c2802M6387 = AbstractC2933.m6387();
        C2943 c2943 = new C2943(c2802M6387);
        long j = JSONReader$Feature.FieldBased.mask;
        InterfaceC2788 interfaceC2788M5633 = c2802M6387.m5633(type, false);
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(strM6375, c2943);
        try {
            Object objMo5463 = interfaceC2788M5633.mo5463(abstractC2899M6092, type, null, 0L);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(objMo5463);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
            return objMo5463;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m5925(Object obj, Type type) {
        return m5924(obj, type, AbstractC2933.m6387());
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x013d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m5926(java.lang.Object r11, java.lang.Class r12, com.alibaba.fastjson2.reader.C2802 r13) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2867.m5926(java.lang.Object, java.lang.Class, com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m5927(Class cls, Object obj) {
        return m5926(obj, cls, AbstractC2933.m6387());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Object m5928(JSONObject jSONObject, Class cls) {
        MethodHandle methodHandleFindStatic = f9043;
        if (methodHandleFindStatic == null) {
            try {
                Class<?> cls2 = Class.forName("java.lang.reflect.Proxy");
                methodHandleFindStatic = AbstractC2854.m5768(cls2).findStatic(cls2, "newProxyInstance", MethodType.methodType(Object.class, ClassLoader.class, Class[].class, InvocationHandler.class));
                f9043 = methodHandleFindStatic;
            } catch (Throwable unused) {
            }
        }
        try {
            return (Object) methodHandleFindStatic.invokeExact(cls.getClassLoader(), new Class[]{cls}, jSONObject);
        } catch (Throwable th) {
            C0276.m843(AbstractC0053.m154(cls, "create proxy error : "), th);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Class m5929(String str) {
        if (str.length() >= 192) {
            return null;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case -2073921873:
                if (str.equals("java.util.OptionalInt")) {
                    b = 0;
                }
                break;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    b = 1;
                }
                break;
            case -2010664371:
                if (str.equals("java.io.IOException")) {
                    b = 2;
                }
                break;
            case -1939501217:
                if (str.equals("Object")) {
                    b = 3;
                }
                break;
            case -1932803762:
                if (str.equals("HashMap")) {
                    b = 4;
                }
                break;
            case -1932797868:
                if (str.equals("HashSet")) {
                    b = 5;
                }
                break;
            case -1899270121:
                if (str.equals("java.util.LinkedList")) {
                    b = 6;
                }
                break;
            case -1808118735:
                if (str.equals("String")) {
                    b = 7;
                }
                break;
            case -1671476816:
                if (str.equals("ConcurrentLinkedDeque")) {
                    b = 8;
                }
                break;
            case -1659005919:
                if (str.equals("ConcurrentLinkedQueue")) {
                    b = 9;
                }
                break;
            case -1418007307:
                if (str.equals("LinkedHashMap")) {
                    b = 10;
                }
                break;
            case -1418001413:
                if (str.equals("LinkedHashSet")) {
                    b = 11;
                }
                break;
            case -1402722386:
                if (str.equals("java.util.HashMap")) {
                    b = 12;
                }
                break;
            case -1402716492:
                if (str.equals("java.util.HashSet")) {
                    b = 13;
                }
                break;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    b = 14;
                }
                break;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    b = 15;
                }
                break;
            case -1374008726:
                if (str.equals("byte[]")) {
                    b = 16;
                }
                break;
            case -1361632968:
                if (str.equals("char[]")) {
                    b = 17;
                }
                break;
            case -1325958191:
                if (str.equals("double")) {
                    b = 18;
                }
                break;
            case -1114099497:
                if (str.equals("java.util.ArrayList")) {
                    b = 19;
                }
                break;
            case -1097129250:
                if (str.equals("long[]")) {
                    b = 20;
                }
                break;
            case -1074506598:
                if (str.equals("java.util.Collections$SingletonList")) {
                    b = 21;
                }
                break;
            case -958795145:
                if (str.equals("LinkedList")) {
                    b = 22;
                }
                break;
            case -766441794:
                if (str.equals("float[]")) {
                    b = 23;
                }
                break;
            case -761719520:
                if (str.equals("java.util.Optional")) {
                    b = 24;
                }
                break;
            case -530663260:
                if (str.equals("java.lang.Class")) {
                    b = 25;
                }
                break;
            case -413661986:
                if (str.equals("java.util.Collections$EmptyMap")) {
                    b = 26;
                }
                break;
            case -413656092:
                if (str.equals("java.util.Collections$EmptySet")) {
                    b = 27;
                }
                break;
            case -113680546:
                if (str.equals("Calendar")) {
                    b = 28;
                }
                break;
            case 65:
                if (str.equals("A")) {
                    b = 29;
                }
                break;
            case 66:
                if (str.equals("B")) {
                    b = 30;
                }
                break;
            case 67:
                if (str.equals("C")) {
                    b = 31;
                }
                break;
            case 68:
                if (str.equals("D")) {
                    b = 32;
                }
                break;
            case 70:
                if (str.equals("F")) {
                    b = 33;
                }
                break;
            case 73:
                if (str.equals("I")) {
                    b = 34;
                }
                break;
            case 74:
                if (str.equals("J")) {
                    b = 35;
                }
                break;
            case 77:
                if (str.equals("M")) {
                    b = 36;
                }
                break;
            case 79:
                if (str.equals("O")) {
                    b = 37;
                }
                break;
            case 83:
                if (str.equals("S")) {
                    b = 38;
                }
                break;
            case 90:
                if (str.equals("Z")) {
                    b = 39;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b = 40;
                }
                break;
            case 2433:
                if (str.equals("LM")) {
                    b = 41;
                }
                break;
            case 2887:
                if (str.equals("[B")) {
                    b = 42;
                }
                break;
            case 2888:
                if (str.equals("[C")) {
                    b = 43;
                }
                break;
            case 2889:
                if (str.equals("[D")) {
                    b = 44;
                }
                break;
            case 2891:
                if (str.equals("[F")) {
                    b = 45;
                }
                break;
            case 2894:
                if (str.equals("[I")) {
                    b = 46;
                }
                break;
            case 2895:
                if (str.equals("[J")) {
                    b = 47;
                }
                break;
            case 2900:
                if (str.equals("[O")) {
                    b = 48;
                }
                break;
            case 2904:
                if (str.equals("[S")) {
                    b = 49;
                }
                break;
            case 2911:
                if (str.equals("[Z")) {
                    b = 50;
                }
                break;
            case 73612:
                if (str.equals("JO1")) {
                    b = 51;
                }
                break;
            case 77116:
                if (str.equals("Map")) {
                    b = 52;
                }
                break;
            case 83010:
                if (str.equals("Set")) {
                    b = 53;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    b = 54;
                }
                break;
            case 2122702:
                if (str.equals("Date")) {
                    b = 55;
                }
                break;
            case 2368702:
                if (str.equals("List")) {
                    b = 56;
                }
                break;
            case 2616251:
                if (str.equals("UUID")) {
                    b = 57;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    b = 58;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    b = 59;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    b = 60;
                }
                break;
            case 61358428:
                if (str.equals("java.util.Collections$EmptyList")) {
                    b = 61;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    b = 62;
                }
                break;
            case 65821278:
                if (str.equals("java.util.List")) {
                    b = 63;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    b = 64;
                }
                break;
            case 100361105:
                if (str.equals("int[]")) {
                    b = 65;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    b = 66;
                }
                break;
            case 133021628:
                if (str.equals("java.util.OptionalLong")) {
                    b = 67;
                }
                break;
            case 179563853:
                if (str.equals("java.util.Arrays$ArrayList")) {
                    b = 68;
                }
                break;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    b = 69;
                }
                break;
            case 578806391:
                if (str.equals("ArrayList")) {
                    b = 70;
                }
                break;
            case 600988612:
                if (str.equals("TreeSet")) {
                    b = 71;
                }
                break;
            case 889669201:
                if (str.equals("java.util.Collections$UnmodifiableRandomAccessList")) {
                    b = 72;
                }
                break;
            case 935176422:
                if (str.equals("java.util.Collections$SingletonSet")) {
                    b = 73;
                }
                break;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    b = 74;
                }
                break;
            case 1131069988:
                if (str.equals("java.util.TreeSet")) {
                    b = 75;
                }
                break;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    b = 76;
                }
                break;
            case 1258621781:
                if (str.equals("java.util.LinkedHashMap")) {
                    b = 77;
                }
                break;
            case 1258627675:
                if (str.equals("java.util.LinkedHashSet")) {
                    b = 78;
                }
                break;
            case 1359468275:
                if (str.equals("double[]")) {
                    b = 79;
                }
                break;
            case 1372295063:
                if (str.equals("ConcurrentHashMap")) {
                    b = 80;
                }
                break;
            case 1645304908:
                if (str.equals("[String")) {
                    b = 81;
                }
                break;
            case 1752376903:
                if (str.equals("JSONObject")) {
                    b = 82;
                }
                break;
            case 2058423690:
                if (str.equals("boolean[]")) {
                    b = 83;
                }
                break;
            case 2067161310:
                if (str.equals("short[]")) {
                    b = 84;
                }
                break;
        }
        Class cls = f9047;
        switch (b) {
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
            case 12:
            case 36:
                return HashMap.class;
            case 5:
            case 13:
                return HashSet.class;
            case 6:
            case 22:
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
            case 11:
            case 78:
                return LinkedHashSet.class;
            case 14:
            case 52:
                return Map.class;
            case 15:
            case 53:
                return Set.class;
            case 16:
            case 42:
                return byte[].class;
            case 17:
            case 43:
                return char[].class;
            case 18:
            case 32:
                return Double.TYPE;
            case 19:
            case 29:
            case 70:
                return ArrayList.class;
            case 20:
            case 47:
                return long[].class;
            case 21:
                return f9048;
            case 23:
            case 45:
                return float[].class;
            case 24:
                return Optional.class;
            case 25:
                return Class.class;
            case 26:
                return Collections.EMPTY_MAP.getClass();
            case 27:
                return Collections.EMPTY_SET.getClass();
            case 28:
                return Calendar.class;
            case 30:
            case 58:
                return Byte.TYPE;
            case 31:
            case 59:
                return Character.TYPE;
            case 33:
            case 64:
                return Float.TYPE;
            case 34:
            case 54:
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
            case 79:
                return double[].class;
            case 46:
            case 65:
                return int[].class;
            case 48:
                return Object[].class;
            case 49:
            case 84:
                return short[].class;
            case 50:
            case 83:
                return boolean[].class;
            case 51:
                str = "com.alibaba.fastjson.JSONObject";
                break;
            case 55:
                return Date.class;
            case 56:
            case 63:
                return List.class;
            case 57:
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
                return cls;
            case 73:
                return f9049;
            case 80:
                return ConcurrentHashMap.class;
            case 81:
                return String[].class;
            case 82:
                return JSONObject.class;
        }
        Class cls2 = (Class) f9033.get(str);
        if (cls2 != null) {
            return cls2;
        }
        if (str.startsWith("java.util.ImmutableCollections$")) {
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return cls;
            }
        }
        if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
            str = AbstractC0053.m161(1, 1, str);
        }
        if (str.charAt(0) == '[' || str.endsWith("[]")) {
            Class clsM5929 = m5929(str.charAt(0) == '[' ? str.substring(1) : AbstractC0053.m161(2, 0, str));
            if (clsM5929 != null) {
                return Array.newInstance((Class<?>) clsM5929, 0).getClass();
            }
            C0276.m850("load class error ".concat(str));
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
                return InterfaceC2916.class.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } catch (ClassNotFoundException unused4) {
            return Class.forName(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int m5930(int i, int i2, char[] cArr) {
        int i3;
        int iM5721;
        int i4 = i + i2;
        int i5 = i + 1;
        char c = cArr[i];
        int i6 = AbstractC2849.m5690(c) ? '0' - c : (i2 == 1 || !(c == '-' || c == '+')) ? 1 : 0;
        while (true) {
            i3 = i5 + 1;
            if (i3 < i4 && (iM5721 = AbstractC2849.m5721(i5, cArr)) != -1) {
                if (!(-21474836 <= i6) || !(i6 <= 0)) {
                    break;
                }
                i6 = (i6 * 100) - iM5721;
                i5 += 2;
            } else {
                break;
            }
        }
        if (i5 < i4) {
            char c2 = cArr[i5];
            if (AbstractC2849.m5690(c2)) {
                if ((-214748364 <= i6) & (i6 <= 0)) {
                    i6 = ((i6 * 10) + 48) - c2;
                    i5 = i3;
                }
            }
        }
        if (((i5 == i4) & (i6 <= 0)) && (Integer.MIN_VALUE < i6 || c == '-')) {
            return c == '-' ? i6 : -i6;
        }
        throw new NumberFormatException("parseInt error ".concat(new String(cArr, i5, i2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static int m5931(int i, byte[] bArr, int i2) {
        int i3;
        int iM5720;
        int i4 = i + i2;
        int i5 = i + 1;
        byte b = bArr[i];
        int i6 = AbstractC2849.m5690(b) ? 48 - b : (i2 == 1 || !(b == 45 || b == 43)) ? 1 : 0;
        while (true) {
            i3 = i5 + 1;
            if (i3 < i4 && (iM5720 = AbstractC2849.m5720(bArr, i5)) != -1) {
                if (!(-21474836 <= i6) || !(i6 <= 0)) {
                    break;
                }
                i6 = (i6 * 100) - iM5720;
                i5 += 2;
            } else {
                break;
            }
        }
        if (i5 < i4) {
            byte b2 = bArr[i5];
            if (AbstractC2849.m5690(b2)) {
                if ((-214748364 <= i6) & (i6 <= 0)) {
                    i6 = ((i6 * 10) + 48) - b2;
                    i5 = i3;
                }
            }
        }
        if (((i5 == i4) & (i6 <= 0)) && (Integer.MIN_VALUE < i6 || b == 45)) {
            return b == 45 ? i6 : -i6;
        }
        throw new NumberFormatException("parseInt error ".concat(new String(bArr, i5, i2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static BigDecimal m5932(int i, int i2, char[] cArr) {
        int i3;
        boolean z;
        if (cArr == null || i2 == 0) {
            return null;
        }
        if (cArr[i] == '-') {
            i3 = i + 1;
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        if (i2 <= 20 || (z && i2 == 21)) {
            int i4 = i + i2;
            int i5 = -1;
            long j = 0;
            int i6 = 0;
            while (i3 < i4) {
                char c = cArr[i3];
                if (c != '.') {
                    if (c >= '0' && c <= '9') {
                        long j2 = j * 10;
                        if (((j | 10) >>> 31) == 0 || j2 / 10 == j) {
                            j = j2 + ((long) (c - '0'));
                            i3++;
                        }
                    }
                    j = -1;
                    break;
                }
                i6++;
                if (i6 > 1) {
                    break;
                }
                i5 = i3;
                i3++;
            }
            if (j >= 0 && i6 <= 1) {
                if (z) {
                    j = -j;
                }
                return BigDecimal.valueOf(j, i5 != -1 ? (i2 - (i5 - i)) - 1 : 0);
            }
        }
        return new BigDecimal(cArr, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static BigDecimal m5933(int i, byte[] bArr, int i2) {
        int i3;
        boolean z;
        long j;
        char[] cArr;
        if (bArr == null || i2 == 0) {
            return null;
        }
        if (bArr[i] == 45) {
            i3 = i + 1;
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        if (i2 <= 20 || (z && i2 == 21)) {
            int i4 = i + i2;
            int i5 = 0;
            int i6 = -1;
            long j2 = 0;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b != 46) {
                    j = 0;
                    if (b >= 48 && b <= 57) {
                        long j3 = j2 * 10;
                        if (((j2 | 10) >>> 31) == 0 || j3 / 10 == j2) {
                            j2 = j3 + ((long) (b - 48));
                        }
                    }
                    j2 = -1;
                    break;
                }
                i5++;
                if (i5 > 1) {
                    break;
                }
                i6 = i3;
                i3++;
            }
            j = 0;
            if (j2 >= j && i5 <= 1) {
                if (z) {
                    j2 = -j2;
                }
                return BigDecimal.valueOf(j2, i6 != -1 ? (i2 - (i6 - i)) - 1 : 0);
            }
        }
        if (i == 0 && i2 == bArr.length) {
            cArr = (char[]) AbstractC2819.f8780.apply(bArr);
        } else {
            char[] cArr2 = new char[i2];
            for (int i7 = 0; i7 < i2; i7++) {
                cArr2[i7] = (char) bArr[i + i7];
            }
            cArr = cArr2;
        }
        return new BigDecimal(cArr, 0, cArr.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean m5934(BigInteger bigInteger) {
        int i;
        long j = AbstractC2854.f8938;
        if (j == -1) {
            return bigInteger.compareTo(f9037) >= 0 && bigInteger.compareTo(f9036) <= 0;
        }
        int[] iArr = (int[]) AbstractC2854.f8921.getObject(bigInteger, j);
        return iArr.length == 0 || (iArr.length == 1 && ((i = iArr[0]) >= 0 || (i == Integer.MIN_VALUE && bigInteger.signum() == -1)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m5935(Class cls) {
        if (!cls.isInterface()) {
            return false;
        }
        if (cls.getName().startsWith("java.util.function.")) {
            return true;
        }
        return cls.isAnnotationPresent(FunctionalInterface.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m5936(BigDecimal bigDecimal) {
        int iScale = bigDecimal.scale();
        if (iScale == 0) {
            return true;
        }
        if (bigDecimal.precision() < 20) {
            long j = AbstractC2854.f8934;
            if (j != -1) {
                long j2 = AbstractC2854.f8921.getLong(bigDecimal, j);
                switch (iScale) {
                    case 1:
                        if (j2 % 10 == 0) {
                        }
                        break;
                    case 2:
                        if (j2 % 100 == 0) {
                        }
                        break;
                    case 3:
                        if (j2 % 1000 == 0) {
                        }
                        break;
                    case 4:
                        if (j2 % 10000 == 0) {
                        }
                        break;
                    case 5:
                        if (j2 % 100000 == 0) {
                        }
                        break;
                    case 6:
                        if (j2 % 1000000 == 0) {
                        }
                        break;
                    case 7:
                        if (j2 % 10000000 == 0) {
                        }
                        break;
                    case 8:
                        if (j2 % 100000000 == 0) {
                        }
                        break;
                    case 9:
                        if (j2 % 1000000000 == 0) {
                        }
                        break;
                }
                return true;
            }
        }
        return (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).scale() == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static boolean m5937(Class cls) {
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
        return name.contains("$SpringCGLIB$") || name.contains("$SpringCGLIB$") || name.contains("$EnhancerBySpringCGLIB$");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m5938(BigInteger bigInteger) {
        long j = AbstractC2854.f8938;
        if (j != -1) {
            int[] iArr = (int[]) AbstractC2854.f8921.getObject(bigInteger, j);
            if (iArr.length <= 1) {
                return true;
            }
            if (iArr.length == 2) {
                int i = iArr[0];
                return i >= 0 || (i == Integer.MIN_VALUE && iArr[1] == 0 && bigInteger.signum() == -1);
            }
        }
        return bigInteger.compareTo(f9035) >= 0 && bigInteger.compareTo(f9034) <= 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m5939(String str) {
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
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static Class m5940(Class cls) {
        return cls == Integer.TYPE ? int[].class : cls == Byte.TYPE ? byte[].class : cls == Short.TYPE ? short[].class : cls == Long.TYPE ? long[].class : cls == String.class ? String[].class : cls == Object.class ? Object[].class : Array.newInstance((Class<?>) cls, 1).getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static float m5941(int i, int i2, long j) {
        float f;
        float fScalb;
        float f2;
        float f3;
        long jNumberOfLeadingZeros = ((long) (64 - Long.numberOfLeadingZeros(j))) - ((long) Math.ceil(((double) i2) * 3.321928094887362d));
        if (jNumberOfLeadingZeros < -151) {
            f2 = i;
            f3 = 0.0f;
        } else if (jNumberOfLeadingZeros > 129) {
            f2 = i;
            f3 = Float.POSITIVE_INFINITY;
        } else {
            if (i2 != 0) {
                int i3 = ((int) jNumberOfLeadingZeros) - 27;
                int iM5777 = (int) AbstractC2860.m5777(i3, i2, j);
                int i4 = j == 0 ? 0 : 1;
                if (6 - Integer.numberOfLeadingZeros(iM5777) >= (-151) - i3) {
                    f = i;
                    fScalb = Math.scalb(iM5777 | i4, i3);
                } else {
                    f = i;
                    fScalb = Math.scalb(Integer.signum(iM5777 & ((1 << r2) - 1)) | (iM5777 >> r2) | i4, -151);
                }
                return fScalb * f;
            }
            f2 = i;
            f3 = j;
        }
        return f2 * f3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Class m5942(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m5942(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : m5942(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m5942(upperBounds[0]);
            }
        }
        return type instanceof GenericArrayType ? m5940(m5944(((GenericArrayType) type).getGenericComponentType())) : Object.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m5943(Class cls) {
        IdentityHashMap identityHashMap = f9040;
        String str = (String) identityHashMap.get(cls);
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
            identityHashMap.putIfAbsent(cls, "JO1");
            return (String) identityHashMap.get(cls);
        }
        if (typeName.equals("com.alibaba.fastjson.JSONArray")) {
            identityHashMap.putIfAbsent(cls, "JA1");
            return (String) identityHashMap.get(cls);
        }
        int iIndexOf = typeName.indexOf(36);
        if (iIndexOf != -1 && m5939(typeName.substring(iIndexOf + 1))) {
            Class superclass = cls.getSuperclass();
            if (Map.class.isAssignableFrom(superclass)) {
                return m5943(superclass);
            }
        }
        return typeName;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Class m5944(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m5944(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : m5944(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m5944(upperBounds[0]);
            }
        }
        return type instanceof GenericArrayType ? m5940(m5944(((GenericArrayType) type).getGenericComponentType())) : Object.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Object m5945(Type type) {
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
}
