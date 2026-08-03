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

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ContextAutoTypeBeforeHandler implements JSONReader.AutoTypeBeforeHandler {
    final long[] acceptHashCodes;
    final Map<Long, Class> classCache;
    final ConcurrentMap<Integer, ConcurrentHashMap<Long, Class>> tclHashCaches;
    static final Class CLASS_UNMODIFIABLE_SORTED_SET = Collections.unmodifiableSortedSet(new TreeSet()).getClass();
    static final Class CLASS_UNMODIFIABLE_SET = Collections.unmodifiableSet(Collections.EMPTY_SET).getClass();
    static final Class CLASS_UNMODIFIABLE_COLLECTION = Collections.unmodifiableCollection(Collections.EMPTY_LIST).getClass();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ContextAutoTypeBeforeHandler(boolean z9, String... strArr) {
        this.tclHashCaches = new ConcurrentHashMap();
        this.classCache = new ConcurrentHashMap(16, 0.75f, 1);
        HashSet<String> hashSet = new HashSet();
        if (z9) {
            Class[] clsArr = {Object.class, Byte.TYPE, Byte.class, Short.TYPE, Short.class, Integer.TYPE, Integer.class, Long.TYPE, Long.class, Float.TYPE, Float.class, Double.TYPE, Double.class, Number.class, BigInteger.class, BigDecimal.class, AtomicInteger.class, AtomicLong.class, AtomicBoolean.class, AtomicIntegerArray.class, AtomicLongArray.class, AtomicReference.class, Boolean.TYPE, Boolean.class, Character.TYPE, Character.class, String.class, UUID.class, Currency.class, BitSet.class, EnumSet.class, EnumSet.noneOf(TimeUnit.class).getClass(), Date.class, Calendar.class, LocalDate.class, LocalDateTime.class, Instant.class, SimpleDateFormat.class, DateTimeFormatter.class, TimeUnit.class, Set.class, HashSet.class, LinkedHashSet.class, TreeSet.class, List.class, ArrayList.class, LinkedList.class, ConcurrentLinkedQueue.class, ConcurrentSkipListSet.class, CopyOnWriteArrayList.class, Collections.EMPTY_LIST.getClass(), Collections.EMPTY_MAP.getClass(), TypeUtils.CLASS_SINGLE_SET, TypeUtils.CLASS_SINGLE_LIST, CLASS_UNMODIFIABLE_COLLECTION, TypeUtils.CLASS_UNMODIFIABLE_LIST, CLASS_UNMODIFIABLE_SET, CLASS_UNMODIFIABLE_SORTED_SET, Collections.unmodifiableMap(new HashMap()).getClass(), Collections.unmodifiableSortedMap(new TreeMap()).getClass(), Arrays.asList(new Object[0]).getClass(), Map.class, HashMap.class, Hashtable.class, TreeMap.class, LinkedHashMap.class, WeakHashMap.class, IdentityHashMap.class, ConcurrentMap.class, ConcurrentHashMap.class, ConcurrentSkipListMap.class, Exception.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, RuntimeException.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class};
            for (int i9 = 0; i9 < 100; i9++) {
                hashSet.add(TypeUtils.getTypeName(clsArr[i9]));
            }
            hashSet.add("javax.validation.ValidationException");
            hashSet.add("javax.validation.NoProviderFoundException");
        }
        for (String str : strArr) {
            if (str != null && !str.isEmpty()) {
                Class mapping = TypeUtils.getMapping(str);
                hashSet.add(mapping != null ? TypeUtils.getTypeName(mapping) : str);
            }
        }
        int size = hashSet.size();
        long[] jArrCopyOf = new long[size];
        int i10 = 0;
        for (String str2 : hashSet) {
            long j3 = Fnv.MAGIC_HASH_CODE;
            for (int i11 = 0; i11 < str2.length(); i11++) {
                char cCharAt = str2.charAt(i11);
                if (cCharAt == '$') {
                    cCharAt = '.';
                }
                j3 = (j3 ^ ((long) cCharAt)) * Fnv.MAGIC_PRIME;
            }
            jArrCopyOf[i10] = j3;
            i10++;
        }
        jArrCopyOf = i10 != size ? Arrays.copyOf(jArrCopyOf, i10) : jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.acceptHashCodes = jArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] names(Collection<Class> collection) {
        HashSet hashSet = new HashSet();
        for (Class cls : collection) {
            if (cls != null) {
                hashSet.add(TypeUtils.getTypeName(cls));
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class putCacheIfAbsent(long j3, Class cls) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null || contextClassLoader == JSON.class.getClassLoader()) {
            return this.classCache.put(Long.valueOf(j3), cls);
        }
        int iIdentityHashCode = System.identityHashCode(contextClassLoader);
        ConcurrentHashMap<Long, Class> concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(iIdentityHashCode));
        if (concurrentHashMap == null) {
            this.tclHashCaches.put(Integer.valueOf(iIdentityHashCode), new ConcurrentHashMap<>());
            concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(iIdentityHashCode));
        }
        return concurrentHashMap.put(Long.valueOf(j3), cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
    public Class<?> apply(String str, Class<?> cls, long j3) {
        long j4;
        Class<?> clsPutCacheIfAbsent;
        if ("O".equals(str)) {
            str = "Object";
        }
        int length = str.length();
        long j5 = Fnv.MAGIC_HASH_CODE;
        int i9 = 0;
        while (i9 < length) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == '$') {
                cCharAt = '.';
            }
            long j10 = (j5 ^ ((long) cCharAt)) * Fnv.MAGIC_PRIME;
            if (Arrays.binarySearch(this.acceptHashCodes, j10) >= 0) {
                long jHashCode64 = Fnv.hashCode64(str);
                Class<?> clsApply = apply(jHashCode64, cls, j3);
                if (clsApply == null && (clsApply = TypeUtils.loadClass(str)) != null && (clsPutCacheIfAbsent = putCacheIfAbsent(jHashCode64, clsApply)) != null) {
                    clsApply = clsPutCacheIfAbsent;
                }
                if (clsApply != null) {
                    return clsApply;
                }
            }
            i9++;
            j5 = j10;
        }
        long jHashCode642 = Fnv.hashCode64(str);
        if (str.length() <= 0 || str.charAt(0) != '[') {
            j4 = j3;
        } else {
            j4 = j3;
            Class<?> clsApply2 = apply(jHashCode642, cls, j4);
            if (clsApply2 != null) {
                return clsApply2;
            }
            String strSubstring = str.substring(1);
            Class<?> componentType = cls != null ? cls.getComponentType() : null;
            Class<?> clsApply3 = apply(strSubstring, componentType, j4);
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
                Class<?> clsApply4 = apply(typeName, cls, j4);
                if (clsApply4 != null) {
                    putCacheIfAbsent(jHashCode642, clsApply4);
                }
                return clsApply4;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
    public Class<?> apply(long j3, Class<?> cls, long j4) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != JSON.class.getClassLoader()) {
            ConcurrentHashMap<Long, Class> concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(System.identityHashCode(contextClassLoader)));
            if (concurrentHashMap != null) {
                return concurrentHashMap.get(Long.valueOf(j3));
            }
        }
        return this.classCache.get(Long.valueOf(j3));
    }

    public ContextAutoTypeBeforeHandler(boolean z9, Class... clsArr) {
        this(z9, names(Arrays.asList(clsArr)));
    }

    public ContextAutoTypeBeforeHandler(String... strArr) {
        this(false, strArr);
    }

    public ContextAutoTypeBeforeHandler(boolean z9) {
        this(z9, new String[0]);
    }

    public ContextAutoTypeBeforeHandler(Class... clsArr) {
        this(false, clsArr);
    }
}
