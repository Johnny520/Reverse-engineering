package com.alibaba.fastjson2.util;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.reader.C3558;
import com.alibaba.fastjson2.reader.C3570;
import com.alibaba.fastjson2.reader.C3635;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
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
import java.util.concurrent.atomic.AtomicBoolean;
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
import p025.AbstractC7012;
import p307.AbstractC9280;
import p307.C9368;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3700 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f9378;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static final BigInteger f9379;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final BigInteger f9380;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final BigInteger f9381;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final BigInteger f9382;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final MethodType f9383;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final MethodType f9384;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final IdentityHashMap f9385;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f9386;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final C3657 f9387;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static volatile MethodHandle f9388;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final BigInteger f9389;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final BigInteger f9390;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3663 f9391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Class f9392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Class f9395;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Class f9396;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final MethodType f9397;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final MethodType f9398;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final MethodType f9399;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final MethodType f9400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final MethodType f9401;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final MethodType f9402;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final MethodType f9403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final MethodType f9404;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final MethodType f9405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final MethodType f9406;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final MethodType f9407;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final MethodType f9408;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final MethodType f9409;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final MethodType f9410;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final MethodType f9411;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final MethodType f9412;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final MethodType f9413;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final MethodType f9414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Class f9394 = Collections.singleton(1).getClass();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Class f9393 = Collections.singletonList(1).getClass();

    static {
        Collections.unmodifiableCollection(new ArrayList()).getClass();
        f9392 = Collections.unmodifiableList(new ArrayList()).getClass();
        Collections.unmodifiableSet(new HashSet()).getClass();
        Collections.unmodifiableSortedSet(new TreeSet()).getClass();
        Collections.unmodifiableNavigableSet(new TreeSet()).getClass();
        f9391 = new C3663(List.class, String.class);
        f9410 = MethodType.methodType(Supplier.class);
        f9409 = MethodType.methodType(Function.class);
        f9413 = MethodType.methodType(ToIntFunction.class);
        f9414 = MethodType.methodType(ToLongFunction.class);
        MethodType.methodType(ObjIntConsumer.class);
        f9411 = MethodType.methodType(IntFunction.class);
        f9412 = MethodType.methodType(LongFunction.class);
        f9404 = MethodType.methodType(BiFunction.class);
        f9403 = MethodType.methodType(BiConsumer.class);
        Class cls = Void.TYPE;
        f9407 = MethodType.methodType(cls, Object.class, Object.class);
        f9408 = MethodType.methodType(Object.class);
        f9405 = MethodType.methodType((Class<?>) Object.class, (Class<?>) Object.class);
        Class cls2 = Integer.TYPE;
        f9406 = MethodType.methodType((Class<?>) cls2, (Class<?>) Object.class);
        Class cls3 = Long.TYPE;
        f9398 = MethodType.methodType((Class<?>) cls3, (Class<?>) Object.class);
        MethodType.methodType(cls, Object.class, cls2);
        f9397 = MethodType.methodType((Class<?>) Object.class, (Class<?>) cls3);
        f9401 = MethodType.methodType((Class<?>) cls, (Class<?>) cls3);
        f9402 = MethodType.methodType(Object.class, Object.class, Object.class);
        f9399 = MethodType.methodType(cls);
        f9400 = MethodType.methodType((Class<?>) cls, (Class<?>) cls2);
        f9384 = MethodType.methodType((Class<?>) cls, (Class<?>) String.class);
        f9383 = MethodType.methodType((Class<?>) Object.class, (Class<?>) cls2);
        f9382 = BigInteger.valueOf(-2147483648L);
        f9381 = BigInteger.valueOf(2147483647L);
        f9380 = BigInteger.valueOf(Long.MIN_VALUE);
        f9379 = BigInteger.valueOf(Long.MAX_VALUE);
        f9390 = BigInteger.valueOf(-9007199254740991L);
        f9389 = BigInteger.valueOf(9007199254740991L);
        f9387 = new C3657();
        f9386 = AtomicReferenceFieldUpdater.newUpdater(C3657.class, char[].class, "飘花落叶言子楪世苏哲兰");
        f9385 = new IdentityHashMap();
        f9378 = new ConcurrentHashMap();
        Class clsM6489 = m6489("com.alibaba.fastjson.JSONObject");
        f9396 = clsM6489;
        if (clsM6489 != null) {
            try {
                clsM6489.getDeclaredField("map").setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        f9395 = m6489("com.alibaba.fastjson.JSONArray");
        IdentityHashMap identityHashMap = f9385;
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
        ConcurrentHashMap concurrentHashMap = f9378;
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
            ConcurrentHashMap concurrentHashMap2 = f9378;
            concurrentHashMap2.put(cls4.getSimpleName(), cls4);
            concurrentHashMap2.put(cls4.getName(), cls4);
            f9385.put(cls4, cls4.getSimpleName());
        }
        ConcurrentHashMap concurrentHashMap3 = f9378;
        concurrentHashMap3.put("JO10", JSONObject1O.class);
        concurrentHashMap3.put("[O", Object[].class);
        concurrentHashMap3.put("[Ljava.lang.Object;", Object[].class);
        concurrentHashMap3.put("[java.lang.Object", Object[].class);
        concurrentHashMap3.put("[Object", Object[].class);
        concurrentHashMap3.put("StackTraceElement", StackTraceElement.class);
        concurrentHashMap3.put("[StackTraceElement", StackTraceElement[].class);
        String[] strArr = {"java.util.Collections$UnmodifiableMap", "java.util.Collections$UnmodifiableCollection"};
        for (int i2 = 0; i2 < 2; i2++) {
            Class clsM64892 = m6489(strArr[i2]);
            f9378.put(clsM64892.getName(), clsM64892);
        }
        Class cls5 = f9396;
        if (cls5 != null) {
            ConcurrentHashMap concurrentHashMap4 = f9378;
            concurrentHashMap4.putIfAbsent("JO1", cls5);
            concurrentHashMap4.putIfAbsent(cls5.getName(), cls5);
        }
        Class cls6 = f9395;
        if (cls6 != null) {
            ConcurrentHashMap concurrentHashMap5 = f9378;
            concurrentHashMap5.putIfAbsent("JA1", cls6);
            concurrentHashMap5.putIfAbsent(cls6.getName(), cls6);
        }
        IdentityHashMap identityHashMap2 = f9385;
        identityHashMap2.put(new HashMap().keySet().getClass(), "Set");
        identityHashMap2.put(new LinkedHashMap().keySet().getClass(), "Set");
        identityHashMap2.put(new TreeMap().keySet().getClass(), "Set");
        identityHashMap2.put(new ConcurrentHashMap().keySet().getClass(), "Set");
        identityHashMap2.put(new ConcurrentSkipListMap().keySet().getClass(), "Set");
        ConcurrentHashMap concurrentHashMap6 = f9378;
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
            f9378.putIfAbsent((String) entry.getValue(), (Class) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static boolean m6458(int i, String str) {
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
                                if ((cCharAt5 - '0') + AbstractC0900.m703(cCharAt4, 48, 10, (cCharAt3 - '0') * 100) > 255) {
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
    */
    public static boolean m6459(String str) {
        boolean z;
        char c;
        boolean z2 = false;
        if (str == null) {
            return false;
        }
        int length = str.length();
        int i = 2;
        if (length < 2 || length > 39) {
            return false;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt != '.') {
                if (cCharAt == ':' || i2 == length - 1) {
                    int i5 = cCharAt == ':' ? i2 : i2 + 1;
                    int i6 = i5 - i3;
                    if (i6 != 0) {
                        z = z2;
                        if (i6 == 1) {
                            char cCharAt2 = str.charAt(i5 - 1);
                            if ((cCharAt2 < '0' || cCharAt2 > '9') && ((cCharAt2 < 'A' || cCharAt2 > 'F') && (cCharAt2 < 'a' || cCharAt2 > 'f'))) {
                                break;
                            }
                        } else if (i6 == i) {
                            char cCharAt3 = str.charAt(i5 - 2);
                            char cCharAt4 = str.charAt(i5 - 1);
                            if (((cCharAt3 < '0' || cCharAt3 > '9') && ((cCharAt3 < 'A' || cCharAt3 > 'F') && (cCharAt3 < 'a' || cCharAt3 > 'f'))) || ((cCharAt4 < '0' || cCharAt4 > '9') && ((cCharAt4 < 'A' || cCharAt4 > 'F') && (cCharAt4 < 'a' || cCharAt4 > 'f')))) {
                                break;
                            }
                        } else if (i6 == 3) {
                            char cCharAt5 = str.charAt(i5 - 3);
                            char cCharAt6 = str.charAt(i5 - 2);
                            char cCharAt7 = str.charAt(i5 - 1);
                            if (((cCharAt5 < '0' || cCharAt5 > '9') && ((cCharAt5 < 'A' || cCharAt5 > 'F') && (cCharAt5 < 'a' || cCharAt5 > 'f'))) || (((cCharAt6 < '0' || cCharAt6 > '9') && ((cCharAt6 < 'A' || cCharAt6 > 'F') && (cCharAt6 < 'a' || cCharAt6 > 'f'))) || ((cCharAt7 < '0' || cCharAt7 > '9') && ((cCharAt7 < 'A' || cCharAt7 > 'F') && (cCharAt7 < 'a' || cCharAt7 > 'f'))))) {
                                break;
                            }
                        } else if (i6 == 4) {
                            char cCharAt8 = str.charAt(i5 - 4);
                            char cCharAt9 = str.charAt(i5 - 3);
                            char cCharAt10 = str.charAt(i5 - 2);
                            char cCharAt11 = str.charAt(i5 - 1);
                            if (((cCharAt8 < '0' || cCharAt8 > '9') && ((cCharAt8 < 'A' || cCharAt8 > 'F') && (cCharAt8 < 'a' || cCharAt8 > 'f'))) || (((cCharAt9 < '0' || cCharAt9 > '9') && ((cCharAt9 < 'A' || cCharAt9 > 'F') && (cCharAt9 < 'a' || cCharAt9 > 'f'))) || (((cCharAt10 < '0' || cCharAt10 > '9') && ((cCharAt10 < 'A' || cCharAt10 > 'F') && (cCharAt10 < 'a' || cCharAt10 > 'f'))) || ((cCharAt11 < '0' || cCharAt11 > '9') && ((cCharAt11 < 'A' || cCharAt11 > 'F') && (cCharAt11 < 'a' || cCharAt11 > 'f')))))) {
                                break;
                            }
                        } else {
                            return z;
                        }
                        c = ':';
                    } else {
                        z = z2;
                        c = ':';
                    }
                    if (cCharAt == c) {
                        i4++;
                        i3 = i2 + 1;
                    }
                } else {
                    z = z2;
                }
                i2++;
                z2 = z;
                i = 2;
            } else if (!m6458(i3, str)) {
                return z2;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static short m6460(Object obj) {
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
            C1123.m1410("can not cast to byte");
            return (short) 0;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return (short) 0;
        }
        return Short.parseShort(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static Short m6461(Object obj) {
        if (obj == null || (obj instanceof Short)) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            C1123.m1410("can not cast to byte");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static String m6462(char c, char c2) {
        return (c < ' ' || c > '~' || c2 < ' ' || c2 > '~') ? new String(new char[]{c, c2}) : AbstractC3653.f9126[(c2 - ' ') + ((c - ' ') * 95)];
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static String m6463(char c) {
        String[] strArr = AbstractC3653.f9127;
        return c < strArr.length ? strArr[c] : Character.toString(c);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static Long m6464(Object obj) {
        if (obj == null || (obj instanceof Long)) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
        }
        return Long.valueOf(m6465(obj));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static long m6465(Object obj) {
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
            C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to long from ")));
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
            if (AbstractC3682.m6248(str)) {
                return Long.parseLong(str);
            }
            C1123.m1410("parseLong error ".concat(str));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static Instant m6466(Object obj) {
        AbstractC3732 abstractC3732M6651;
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
                return (Instant) C3558.f8638.mo6067((Map) obj, 0L);
            }
            C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to Date from ")));
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str.charAt(0) != '\"') {
            abstractC3732M6651 = AbstractC3732.m6651("\"" + str + '\"');
        } else {
            abstractC3732M6651 = AbstractC3732.m6651(str);
        }
        return (Instant) abstractC3732M6651.mo6700(Instant.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static float m6467(Object obj) {
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
            C1123.m1410("can not cast to decimal");
            return 0.0f;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return 0.0f;
        }
        return Float.parseFloat(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static Integer m6468(Object obj) {
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
        C1123.m1410("can not cast to integer");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static int m6469(Object obj) {
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
            C1123.m1410("can not cast to int");
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
            if (AbstractC3682.m6248(str)) {
                return Integer.parseInt(str);
            }
            C1123.m1410("parseInt error, ".concat(str));
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static boolean m6470(Object obj) {
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
        C1123.m1410("can not cast to boolean");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static Boolean m6471(Object obj) {
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
        C1123.m1410("can not cast to boolean");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static BigInteger m6472(Object obj) {
        if (obj == null || (obj instanceof BigInteger)) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            C1123.m1410("can not cast to bigint");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigInteger(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static BigDecimal m6473(String str) {
        Function function;
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        ToIntFunction toIntFunction = AbstractC3687.f9271;
        if (toIntFunction == null || toIntFunction.applyAsInt(str) != 0 || (function = AbstractC3687.f9272) == null) {
            char[] cArrM6330 = AbstractC3687.m6330(str);
            return m6492(0, cArrM6330.length, cArrM6330);
        }
        byte[] bArr = (byte[]) function.apply(str);
        return m6493(0, bArr, bArr.length);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static BigDecimal m6474(Object obj) {
        if (obj == null || (obj instanceof BigDecimal)) {
            return (BigDecimal) obj;
        }
        if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            return BigDecimal.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return (BigDecimal) m6487(BigDecimal.class, obj);
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return new BigDecimal(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static BigDecimal m6475(double d) {
        byte[] bArr = new byte[24];
        return m6493(0, bArr, AbstractC3660.m6234(bArr, 0, d));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static Float m6476(Object obj) {
        if (obj == null || (obj instanceof Float)) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            C1123.m1410("can not cast to decimal");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static double m6477(Object obj) {
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
        C1123.m1410("can not cast to double");
        return 0.0d;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static Double m6478(Object obj) {
        if (obj == null || (obj instanceof Double)) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            C1123.m1410("can not cast to double");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static Date m6479(Object obj) {
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
            return AbstractC3699.m6428((String) obj);
        }
        if ((obj instanceof Long) || (obj instanceof Integer)) {
            return new Date(((Number) obj).longValue());
        }
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("$date");
            if (obj2 instanceof String) {
                return AbstractC3699.m6428((String) obj2);
            }
        }
        C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to Date from ")));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static byte m6480(Object obj) {
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
            C1123.m1410("can not cast to byte");
            return (byte) 0;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return (byte) 0;
        }
        return Byte.parseByte(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static Byte m6481(Object obj) {
        if (obj == null || (obj instanceof Byte)) {
            return (Byte) obj;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            C1123.m1410("can not cast to byte");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static double m6482(int i, int i2, long j) {
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
        if (9 - Long.numberOfLeadingZeros(AbstractC3693.m6337(i3, i2, j)) >= (-1076) - i3) {
            return Math.scalb(r7 | 1, i3) * ((double) i);
        }
        return Math.scalb(((long) Long.signum(r7 & ((1 << r1) - 1))) | (r7 >> r1) | 1, -1076) * ((double) i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m6483(Object obj, Object obj2) {
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
    public static Object m6484(Object obj, Type type, C3635 c3635) throws IOException {
        if (type instanceof Class) {
            return m6486(obj, (Class) type, c3635);
        }
        if (obj instanceof Collection) {
            return c3635.m6193(type, false).mo6029((Collection) obj, 0L);
        }
        if (obj instanceof Map) {
            return c3635.m6193(type, false).mo6067((Map) obj, 0L);
        }
        String strM6935 = InterfaceC3749.m6935(obj);
        if (strM6935 == null || strM6935.isEmpty()) {
            return null;
        }
        C3635 c3635M6947 = AbstractC3766.m6947();
        C3776 c3776 = new C3776(c3635M6947);
        long j = JSONReader$Feature.FieldBased.mask;
        InterfaceC3621 interfaceC3621M6193 = c3635M6947.m6193(type, false);
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(strM6935, c3776);
        try {
            Object objMo6023 = interfaceC3621M6193.mo6023(abstractC3732M6652, type, null, 0L);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(objMo6023);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return objMo6023;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m6485(Object obj, Type type) {
        return m6484(obj, type, AbstractC3766.m6947());
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x013d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m6486(Object obj, Class cls, C3635 c3635) {
        Function functionMo14579;
        Function functionMo145792;
        Function functionM6191;
        Enum r1;
        if (obj != null) {
            if (cls.isInstance(obj)) {
                return obj;
            }
            if (cls == Date.class) {
                return m6479(obj);
            }
            if (cls == Instant.class) {
                return m6466(obj);
            }
            if (cls == LocalDate.class && (obj instanceof Date)) {
                return ((Date) obj).toInstant().atZone(AbstractC3699.f9372).toLocalDate();
            }
            if (cls == LocalDateTime.class && (obj instanceof Date)) {
                return ((Date) obj).toInstant().atZone(AbstractC3699.f9372).toLocalDateTime();
            }
            if (cls == String.class) {
                return obj instanceof Character ? obj.toString() : InterfaceC3749.m6935(obj);
            }
            if (cls == AtomicInteger.class) {
                return new AtomicInteger(m6469(obj));
            }
            if (cls == AtomicLong.class) {
                return new AtomicLong(m6465(obj));
            }
            if (cls == AtomicBoolean.class) {
                return new AtomicBoolean(((Boolean) obj).booleanValue());
            }
            int i = 0;
            if (obj instanceof Map) {
                return c3635.m6193(cls, false).mo6067((Map) obj, 0L);
            }
            Function functionM61912 = c3635.m6191(obj.getClass(), cls);
            if (functionM61912 != null) {
                return functionM61912.apply(obj);
            }
            if (cls.isEnum()) {
                InterfaceC3621 interfaceC3621M6193 = AbstractC3766.m6947().m6193(cls, false);
                if (!(interfaceC3621M6193 instanceof C3570)) {
                    return interfaceC3621M6193.mo6023(AbstractC3732.m6651(InterfaceC3749.m6935(obj)), cls, null, 0L);
                }
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    C3570 c3570 = (C3570) interfaceC3621M6193;
                    Enum[] enumArr = c3570.f8707;
                    Member member = c3570.f8709;
                    if (member != null) {
                        try {
                            if (member instanceof Field) {
                                while (i < enumArr.length) {
                                    r1 = enumArr[i];
                                    if (((Field) member).getInt(r1) == iIntValue) {
                                        break;
                                    }
                                    i++;
                                }
                                r1 = null;
                            } else {
                                Method method = (Method) member;
                                while (i < enumArr.length) {
                                    r1 = enumArr[i];
                                    if (((Number) method.invoke(r1, null)).intValue() == iIntValue) {
                                        break;
                                    }
                                    i++;
                                }
                                r1 = null;
                            }
                            if (r1 != null) {
                                return r1;
                            }
                            C1123.m1410(AbstractC7012.m12147(iIntValue, "None enum ordinal or value "));
                            return null;
                        } catch (Exception e) {
                            throw new JSONException("parse enum error, class " + c3570.f8708.getName() + ", value " + iIntValue, e);
                        }
                    }
                    if (iIntValue >= 0) {
                        Enum[] enumArr2 = c3570.f8713;
                        if (iIntValue < enumArr2.length) {
                            return enumArr2[iIntValue];
                        }
                    }
                } else {
                    if (!(obj instanceof String)) {
                        if (obj instanceof Collection) {
                            return c3635.m6193(cls, false).mo6029((Collection) obj, 0L);
                        }
                        String name = cls.getName();
                        if ((obj instanceof Integer) || (obj instanceof Long)) {
                            long jLongValue = ((Number) obj).longValue();
                            if (name.equals("java.time.LocalDateTime")) {
                                return LocalDateTime.ofInstant(Instant.ofEpochMilli(jLongValue), AbstractC3699.f9372);
                            }
                            if (name.equals("java.sql.Date")) {
                                return new java.sql.Date(jLongValue);
                            }
                            if (name.equals("java.sql.Time")) {
                                return new Time(jLongValue);
                            }
                            if (name.equals("java.sql.Timestamp")) {
                                return new Timestamp(jLongValue);
                            }
                        }
                        if (obj.getClass().getName().equals("org.bson.types.Decimal128") && cls == Double.class) {
                            C9368 c9368 = AbstractC3766.f9639;
                            Class<?> cls2 = obj.getClass();
                            InterfaceC9352 interfaceC9352M14665 = c9368.m14665(cls2, cls2, false);
                            if ((interfaceC9352M14665 instanceof AbstractC9280) && (functionMo145792 = ((AbstractC9280) interfaceC9352M14665).mo14579()) != null && (functionM6191 = c3635.m6191(functionMo145792.apply(obj).getClass(), cls)) != null) {
                                return functionM6191.apply(obj);
                            }
                        }
                        C9368 c93682 = AbstractC3766.f9639;
                        Class<?> cls3 = obj.getClass();
                        InterfaceC9352 interfaceC9352M146652 = c93682.m14665(cls3, cls3, false);
                        if ((interfaceC9352M146652 instanceof AbstractC9280) && (functionMo14579 = ((AbstractC9280) interfaceC9352M146652).mo14579()) != null) {
                            Object objApply = functionMo14579.apply(obj);
                            if (cls.isInstance(objApply)) {
                                return objApply;
                            }
                        }
                        C1123.m1410(AbstractC3275.m5141(obj, AbstractC7012.m12144("can not cast to ", name, ", from ")));
                        return null;
                    }
                    String str = (String) obj;
                    if (!str.isEmpty() && !"null".equals(str)) {
                        char cCharAt = str.trim().charAt(0);
                        return AbstractC3766.m6947().m6193(cls, false).mo6023((cCharAt == '\"' || cCharAt == '{' || cCharAt == '[') ? AbstractC3732.m6651(str) : AbstractC3732.m6651(InterfaceC3749.m6935(str)), cls, null, 0L);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Object m6487(Class cls, Object obj) {
        return m6486(obj, cls, AbstractC3766.m6947());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static Object m6488(JSONObject jSONObject, Class cls) {
        MethodHandle methodHandleFindStatic = f9388;
        if (methodHandleFindStatic == null) {
            try {
                Class<?> cls2 = Class.forName("java.lang.reflect.Proxy");
                methodHandleFindStatic = AbstractC3687.m6328(cls2).findStatic(cls2, "newProxyInstance", MethodType.methodType(Object.class, ClassLoader.class, Class[].class, InvocationHandler.class));
                f9388 = methodHandleFindStatic;
            } catch (Throwable unused) {
            }
        }
        try {
            return (Object) methodHandleFindStatic.invokeExact(cls.getClassLoader(), new Class[]{cls}, jSONObject);
        } catch (Throwable th) {
            C1123.m1403(AbstractC0900.m714(cls, "create proxy error : "), th);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Class m6489(String str) {
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
        Class cls = f9392;
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
                return f9393;
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
                return f9394;
            case 80:
                return ConcurrentHashMap.class;
            case 81:
                return String[].class;
            case 82:
                return JSONObject.class;
        }
        Class cls2 = (Class) f9378.get(str);
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
            str = AbstractC0900.m721(1, 1, str);
        }
        if (str.charAt(0) == '[' || str.endsWith("[]")) {
            Class clsM6489 = m6489(str.charAt(0) == '[' ? str.substring(1) : AbstractC0900.m721(2, 0, str));
            if (clsM6489 != null) {
                return Array.newInstance((Class<?>) clsM6489, 0).getClass();
            }
            C1123.m1410("load class error ".concat(str));
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
                return InterfaceC3749.class.getClassLoader().loadClass(str);
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } catch (ClassNotFoundException unused4) {
            return Class.forName(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static int m6490(int i, int i2, char[] cArr) {
        int i3;
        int iM6281;
        int i4 = i + i2;
        int i5 = i + 1;
        char c = cArr[i];
        int i6 = AbstractC3682.m6250(c) ? '0' - c : (i2 == 1 || !(c == '-' || c == '+')) ? 1 : 0;
        while (true) {
            i3 = i5 + 1;
            if (i3 < i4 && (iM6281 = AbstractC3682.m6281(i5, cArr)) != -1) {
                if (!(-21474836 <= i6) || !(i6 <= 0)) {
                    break;
                }
                i6 = (i6 * 100) - iM6281;
                i5 += 2;
            } else {
                break;
            }
        }
        if (i5 < i4) {
            char c2 = cArr[i5];
            if (AbstractC3682.m6250(c2)) {
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
    public static int m6491(int i, byte[] bArr, int i2) {
        int i3;
        int iM6280;
        int i4 = i + i2;
        int i5 = i + 1;
        byte b = bArr[i];
        int i6 = AbstractC3682.m6250(b) ? 48 - b : (i2 == 1 || !(b == 45 || b == 43)) ? 1 : 0;
        while (true) {
            i3 = i5 + 1;
            if (i3 < i4 && (iM6280 = AbstractC3682.m6280(bArr, i5)) != -1) {
                if (!(-21474836 <= i6) || !(i6 <= 0)) {
                    break;
                }
                i6 = (i6 * 100) - iM6280;
                i5 += 2;
            } else {
                break;
            }
        }
        if (i5 < i4) {
            byte b2 = bArr[i5];
            if (AbstractC3682.m6250(b2)) {
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
    public static BigDecimal m6492(int i, int i2, char[] cArr) {
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
    public static BigDecimal m6493(int i, byte[] bArr, int i2) {
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
            cArr = (char[]) AbstractC3652.f9125.apply(bArr);
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
    public static boolean m6494(BigInteger bigInteger) {
        int i;
        long j = AbstractC3687.f9283;
        if (j == -1) {
            return bigInteger.compareTo(f9382) >= 0 && bigInteger.compareTo(f9381) <= 0;
        }
        int[] iArr = (int[]) AbstractC3687.f9266.getObject(bigInteger, j);
        return iArr.length == 0 || (iArr.length == 1 && ((i = iArr[0]) >= 0 || (i == Integer.MIN_VALUE && bigInteger.signum() == -1)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m6495(Class cls) {
        if (!cls.isInterface()) {
            return false;
        }
        if (cls.getName().startsWith("java.util.function.")) {
            return true;
        }
        return cls.isAnnotationPresent(FunctionalInterface.class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m6496(BigDecimal bigDecimal) {
        int iScale = bigDecimal.scale();
        if (iScale == 0) {
            return true;
        }
        if (bigDecimal.precision() < 20) {
            long j = AbstractC3687.f9279;
            if (j != -1) {
                long j2 = AbstractC3687.f9266.getLong(bigDecimal, j);
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
    public static boolean m6497(Class cls) {
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
    public static boolean m6498(BigInteger bigInteger) {
        long j = AbstractC3687.f9283;
        if (j != -1) {
            int[] iArr = (int[]) AbstractC3687.f9266.getObject(bigInteger, j);
            if (iArr.length <= 1) {
                return true;
            }
            if (iArr.length == 2) {
                int i = iArr[0];
                return i >= 0 || (i == Integer.MIN_VALUE && iArr[1] == 0 && bigInteger.signum() == -1);
            }
        }
        return bigInteger.compareTo(f9380) >= 0 && bigInteger.compareTo(f9379) <= 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m6499(String str) {
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
    public static Class m6500(Class cls) {
        return cls == Integer.TYPE ? int[].class : cls == Byte.TYPE ? byte[].class : cls == Short.TYPE ? short[].class : cls == Long.TYPE ? long[].class : cls == String.class ? String[].class : cls == Object.class ? Object[].class : Array.newInstance((Class<?>) cls, 1).getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static float m6501(int i, int i2, long j) {
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
                int iM6337 = (int) AbstractC3693.m6337(i3, i2, j);
                int i4 = j == 0 ? 0 : 1;
                if (6 - Integer.numberOfLeadingZeros(iM6337) >= (-151) - i3) {
                    f = i;
                    fScalb = Math.scalb(iM6337 | i4, i3);
                } else {
                    f = i;
                    fScalb = Math.scalb(Integer.signum(iM6337 & ((1 << r2) - 1)) | (iM6337 >> r2) | i4, -151);
                }
                return fScalb * f;
            }
            f2 = i;
            f3 = j;
        }
        return f2 * f3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Class m6502(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m6502(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : m6502(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m6502(upperBounds[0]);
            }
        }
        return type instanceof GenericArrayType ? m6500(m6504(((GenericArrayType) type).getGenericComponentType())) : Object.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m6503(Class cls) {
        IdentityHashMap identityHashMap = f9385;
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
        if (iIndexOf != -1 && m6499(typeName.substring(iIndexOf + 1))) {
            Class superclass = cls.getSuperclass();
            if (Map.class.isAssignableFrom(superclass)) {
                return m6503(superclass);
            }
        }
        return typeName;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static Class m6504(Type type) {
        if (type == null) {
            return null;
        }
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m6504(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : m6504(type2);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m6504(upperBounds[0]);
            }
        }
        return type instanceof GenericArrayType ? m6500(m6504(((GenericArrayType) type).getGenericComponentType())) : Object.class;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Object m6505(Type type) {
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
