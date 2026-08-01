package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ContextAutoTypeBeforeHandler implements JSONReader.AutoTypeBeforeHandler {
    final long[] acceptHashCodes;
    final Map<Long, Class> classCache;
    final ConcurrentMap<Integer, ConcurrentHashMap<Long, Class>> tclHashCaches;

    public ContextAutoTypeBeforeHandler(boolean z10, String... strArr) {
        this.tclHashCaches = new ConcurrentHashMap();
        this.classCache = new ConcurrentHashMap(16, 0.75f, 1);
        HashSet<String> hashSet = new HashSet();
        if (z10) {
            Class[] clsArr = {Object.class, Byte.TYPE, Byte.class, Short.TYPE, Short.class, Integer.TYPE, Integer.class, Long.TYPE, Long.class, Float.TYPE, Float.class, Double.TYPE, Double.class, Number.class, BigInteger.class, BigDecimal.class, AtomicInteger.class, AtomicLong.class, AtomicBoolean.class, AtomicIntegerArray.class, AtomicLongArray.class, AtomicReference.class, Boolean.TYPE, Boolean.class, Character.TYPE, Character.class, String.class, UUID.class, Currency.class, BitSet.class, EnumSet.class, EnumSet.noneOf(TimeUnit.class).getClass(), Date.class, Calendar.class, LocalTime.class, LocalDate.class, LocalDateTime.class, Instant.class, SimpleDateFormat.class, DateTimeFormatter.class, TimeUnit.class, Set.class, HashSet.class, LinkedHashSet.class, TreeSet.class, List.class, ArrayList.class, LinkedList.class, ConcurrentLinkedQueue.class, ConcurrentSkipListSet.class, CopyOnWriteArrayList.class, Collections.EMPTY_LIST.getClass(), Collections.EMPTY_MAP.getClass(), TypeUtils.CLASS_SINGLE_SET, TypeUtils.CLASS_SINGLE_LIST, TypeUtils.CLASS_UNMODIFIABLE_COLLECTION, TypeUtils.CLASS_UNMODIFIABLE_LIST, TypeUtils.CLASS_UNMODIFIABLE_SET, TypeUtils.CLASS_UNMODIFIABLE_SORTED_SET, TypeUtils.CLASS_UNMODIFIABLE_NAVIGABLE_SET, Collections.unmodifiableMap(new HashMap()).getClass(), Collections.unmodifiableNavigableMap(new TreeMap()).getClass(), Collections.unmodifiableSortedMap(new TreeMap()).getClass(), Arrays.asList(new Object[0]).getClass(), Map.class, HashMap.class, Hashtable.class, TreeMap.class, LinkedHashMap.class, WeakHashMap.class, IdentityHashMap.class, ConcurrentMap.class, ConcurrentHashMap.class, ConcurrentSkipListMap.class, Exception.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, RuntimeException.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class};
            for (int i10 = 0; i10 < 103; i10++) {
                hashSet.add(TypeUtils.getTypeName(clsArr[i10]));
            }
            hashSet.addAll(Arrays.asList("javax.validation.ValidationException", "javax.validation.NoProviderFoundException"));
        }
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                Class mapping = TypeUtils.getMapping(str);
                hashSet.add(mapping != null ? TypeUtils.getTypeName(mapping) : str);
            }
        }
        int size = hashSet.size();
        long[] jArrCopyOf = new long[size];
        int i11 = 0;
        for (String str2 : hashSet) {
            long j10 = Fnv.MAGIC_HASH_CODE;
            for (int i12 = 0; i12 < str2.length(); i12++) {
                char cCharAt = str2.charAt(i12);
                if (cCharAt == '$') {
                    cCharAt = '.';
                }
                j10 = (j10 ^ ((long) cCharAt)) * Fnv.MAGIC_PRIME;
            }
            jArrCopyOf[i11] = j10;
            i11++;
        }
        jArrCopyOf = i11 != size ? Arrays.copyOf(jArrCopyOf, i11) : jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.acceptHashCodes = jArrCopyOf;
    }

    public static String[] names(Collection<Class> collection) {
        HashSet hashSet = new HashSet();
        for (Class cls : collection) {
            if (cls != null) {
                hashSet.add(TypeUtils.getTypeName(cls));
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private Class putCacheIfAbsent(long j10, Class cls) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null || contextClassLoader == JSON.class.getClassLoader()) {
            return this.classCache.putIfAbsent(Long.valueOf(j10), cls);
        }
        int iIdentityHashCode = System.identityHashCode(contextClassLoader);
        ConcurrentHashMap<Long, Class> concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(iIdentityHashCode));
        if (concurrentHashMap == null) {
            this.tclHashCaches.putIfAbsent(Integer.valueOf(iIdentityHashCode), new ConcurrentHashMap<>());
            concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(iIdentityHashCode));
        }
        return concurrentHashMap.putIfAbsent(Long.valueOf(j10), cls);
    }

    @Override // com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
    public Class<?> apply(String str, Class<?> cls, long j10) {
        long j11;
        Class<?> clsPutCacheIfAbsent;
        if ("O".equals(str)) {
            str = "Object";
        }
        int length = str.length();
        long j12 = Fnv.MAGIC_HASH_CODE;
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '$') {
                cCharAt = '.';
            }
            long j13 = (j12 ^ ((long) cCharAt)) * Fnv.MAGIC_PRIME;
            if (Arrays.binarySearch(this.acceptHashCodes, j13) >= 0) {
                long jHashCode64 = Fnv.hashCode64(str);
                Class<?> clsApply = apply(jHashCode64, cls, j10);
                if (clsApply == null && (clsApply = TypeUtils.loadClass(str)) != null && (clsPutCacheIfAbsent = putCacheIfAbsent(jHashCode64, clsApply)) != null) {
                    clsApply = clsPutCacheIfAbsent;
                }
                if (clsApply != null) {
                    return clsApply;
                }
            }
            i10++;
            j12 = j13;
        }
        long jHashCode642 = Fnv.hashCode64(str);
        if (str.length() <= 0 || str.charAt(0) != '[') {
            j11 = j10;
        } else {
            j11 = j10;
            Class<?> clsApply2 = apply(jHashCode642, cls, j11);
            if (clsApply2 != null) {
                return clsApply2;
            }
            String strSubstring = str.substring(1);
            Class<?> componentType = cls != null ? cls.getComponentType() : null;
            Class<?> clsApply3 = apply(strSubstring, componentType, j11);
            if (clsApply3 != null) {
                if (clsApply3 != componentType) {
                    cls = TypeUtils.getArrayClass(clsApply3);
                }
                Class<?> clsPutCacheIfAbsent2 = putCacheIfAbsent(jHashCode642, cls);
                return clsPutCacheIfAbsent2 != null ? clsPutCacheIfAbsent2 : cls;
            }
        }
        Class mapping = TypeUtils.getMapping(str);
        if (mapping != null) {
            String typeName = TypeUtils.getTypeName(mapping);
            if (!str.equals(typeName)) {
                Class<?> clsApply4 = apply(typeName, cls, j11);
                if (clsApply4 != null) {
                    putCacheIfAbsent(jHashCode642, clsApply4);
                }
                return clsApply4;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
    public Class<?> apply(long j10, Class<?> cls, long j11) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != JSON.class.getClassLoader()) {
            ConcurrentHashMap<Long, Class> concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(System.identityHashCode(contextClassLoader)));
            if (concurrentHashMap != null) {
                return concurrentHashMap.get(Long.valueOf(j10));
            }
        }
        return this.classCache.get(Long.valueOf(j10));
    }

    public ContextAutoTypeBeforeHandler(boolean z10, Class... clsArr) {
        this(z10, names(Arrays.asList(clsArr)));
    }

    public ContextAutoTypeBeforeHandler(String... strArr) {
        this(false, strArr);
    }

    public ContextAutoTypeBeforeHandler(boolean z10) {
        this(z10, new String[0]);
    }

    public ContextAutoTypeBeforeHandler(Class... clsArr) {
        this(false, clsArr);
    }
}
