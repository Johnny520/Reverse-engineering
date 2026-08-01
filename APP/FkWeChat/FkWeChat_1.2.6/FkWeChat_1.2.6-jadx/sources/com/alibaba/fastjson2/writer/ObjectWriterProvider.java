package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.modules.ObjectCodecProvider;
import com.alibaba.fastjson2.modules.ObjectWriterAnnotationProcessor;
import com.alibaba.fastjson2.modules.ObjectWriterModule;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterProvider implements ObjectCodecProvider {
    static final int ENUM = 16384;
    static final int NAME_COMPATIBLE_WITH_FILED = 64;
    static final int[] NOT_REFERENCES_TYPE_HASH_CODES;
    static final int[] PRIMITIVE_HASH_CODES;
    static final int TYPE_DATE_MASK = 16;
    static final int TYPE_DECIMAL_MASK = 8;
    static final int TYPE_ENUM_MASK = 32;
    static final int TYPE_INT32_MASK = 2;
    static final int TYPE_INT64_MASK = 4;
    boolean alphabetic;
    final ConcurrentMap<Type, ObjectWriter> cache;
    final ConcurrentMap<Type, ObjectWriter> cacheFieldBased;
    final ObjectWriterCreator creator;
    boolean disableArrayMapping;
    boolean disableAutoType;
    boolean disableJSONB;
    boolean disableReferenceDetect;
    final ConcurrentMap<Class, Class> mixInCache;
    final List<ObjectWriterModule> modules;
    PropertyNamingStrategy namingStrategy;
    boolean skipTransient;
    volatile long userDefineMask;

    static {
        Class[] clsArr = {Boolean.TYPE, Boolean.class, Character.class, Character.TYPE, Byte.class, Byte.TYPE, Short.class, Short.TYPE, Integer.class, Integer.TYPE, Long.class, Long.TYPE, Float.class, Float.TYPE, Double.class, Double.TYPE, BigInteger.class, BigDecimal.class, String.class, Currency.class, Date.class, Calendar.class, UUID.class, Locale.class, LocalTime.class, LocalDate.class, LocalDateTime.class, Instant.class, ZoneId.class, ZonedDateTime.class, OffsetDateTime.class, OffsetTime.class, AtomicInteger.class, AtomicLong.class, String.class, StackTraceElement.class, Collections.EMPTY_LIST.getClass(), Collections.EMPTY_MAP.getClass(), Collections.EMPTY_SET.getClass()};
        int[] iArr = new int[39];
        for (int i10 = 0; i10 < 39; i10++) {
            iArr[i10] = System.identityHashCode(clsArr[i10]);
        }
        Arrays.sort(iArr);
        PRIMITIVE_HASH_CODES = iArr;
        int[] iArrCopyOf = Arrays.copyOf(iArr, 42);
        iArrCopyOf[iArrCopyOf.length - 1] = System.identityHashCode(Class.class);
        iArrCopyOf[iArrCopyOf.length - 2] = System.identityHashCode(int[].class);
        iArrCopyOf[iArrCopyOf.length - 3] = System.identityHashCode(long[].class);
        Arrays.sort(iArrCopyOf);
        NOT_REFERENCES_TYPE_HASH_CODES = iArrCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ObjectWriterProvider(com.alibaba.fastjson2.PropertyNamingStrategy r4) {
        /*
            r3 = this;
            r3.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.cache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.cacheFieldBased = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.mixInCache = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.modules = r0
            boolean r0 = com.alibaba.fastjson2.JSONFactory.isDisableReferenceDetect()
            r3.disableReferenceDetect = r0
            boolean r0 = com.alibaba.fastjson2.JSONFactory.isDisableArrayMapping()
            r3.disableArrayMapping = r0
            boolean r0 = com.alibaba.fastjson2.JSONFactory.isDisableJSONB()
            r3.disableJSONB = r0
            boolean r0 = com.alibaba.fastjson2.JSONFactory.isDisableAutoType()
            r3.disableAutoType = r0
            boolean r0 = com.alibaba.fastjson2.JSONFactory.isDefaultSkipTransient()
            r3.skipTransient = r0
            boolean r0 = com.alibaba.fastjson2.JSONFactory.isDefaultWriterAlphabetic()
            r3.alphabetic = r0
            r3.init()
            java.lang.String r0 = com.alibaba.fastjson2.JSONFactory.CREATOR
            int r1 = r0.hashCode()
            r2 = -1110092857(0xffffffffbdd553c7, float:-0.1041637)
            if (r1 == r2) goto L6c
            r2 = 96891(0x17a7b, float:1.35773E-40)
            if (r1 == r2) goto L65
            r2 = 1085265597(0x40afd6bd, float:5.494963)
            if (r1 == r2) goto L5c
            goto L77
        L5c:
            java.lang.String r1 = "reflect"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L77
            goto L74
        L65:
            java.lang.String r1 = "asm"
            boolean r0 = r0.equals(r1)
            goto L77
        L6c:
            java.lang.String r1 = "lambda"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L77
        L74:
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriterCreator.INSTANCE
            goto L86
        L77:
            r0 = 0
            boolean r1 = com.alibaba.fastjson2.util.JDKUtils.ANDROID     // Catch: java.lang.Throwable -> L82
            if (r1 != 0) goto L82
            boolean r1 = com.alibaba.fastjson2.util.JDKUtils.GRAAL     // Catch: java.lang.Throwable -> L82
            if (r1 != 0) goto L82
            com.alibaba.fastjson2.writer.ObjectWriterCreatorASM r0 = com.alibaba.fastjson2.writer.ObjectWriterCreatorASM.INSTANCE     // Catch: java.lang.Throwable -> L82
        L82:
            if (r0 != 0) goto L86
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = com.alibaba.fastjson2.writer.ObjectWriterCreator.INSTANCE
        L86:
            r3.creator = r0
            r3.namingStrategy = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.ObjectWriterProvider.<init>(com.alibaba.fastjson2.PropertyNamingStrategy):void");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m6530a(ClassLoader classLoader, Map.Entry entry) {
        return ((Class) entry.getKey()).getClassLoader() == classLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.alibaba.fastjson2.writer.ObjectWriter getObjectWriterInternal(java.lang.reflect.Type r10, java.lang.Class r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.writer.ObjectWriterProvider.getObjectWriterInternal(java.lang.reflect.Type, java.lang.Class, boolean):com.alibaba.fastjson2.writer.ObjectWriter");
    }

    public static boolean isNotReferenceDetect(Class<?> cls) {
        if (Arrays.binarySearch(NOT_REFERENCES_TYPE_HASH_CODES, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    public static boolean isPrimitiveOrEnum(Class<?> cls) {
        if (Arrays.binarySearch(PRIMITIVE_HASH_CODES, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    public static boolean match(Type type, ObjectWriter objectWriter, ClassLoader classLoader, IdentityHashMap<ObjectWriter, Object> identityHashMap) {
        Class<?> cls = TypeUtils.getClass(type);
        if (cls != null && cls.getClassLoader() == classLoader) {
            return true;
        }
        if (identityHashMap.containsKey(objectWriter)) {
            return false;
        }
        if (objectWriter instanceof ObjectWriterImplMap) {
            ObjectWriterImplMap objectWriterImplMap = (ObjectWriterImplMap) objectWriter;
            Class<?> cls2 = TypeUtils.getClass(objectWriterImplMap.valueType);
            if (cls2 != null && cls2.getClassLoader() == classLoader) {
                return true;
            }
            Class<?> cls3 = TypeUtils.getClass(objectWriterImplMap.keyType);
            return cls3 != null && cls3.getClassLoader() == classLoader;
        }
        if (objectWriter instanceof ObjectWriterImplCollection) {
            Class<?> cls4 = TypeUtils.getClass(((ObjectWriterImplCollection) objectWriter).itemType);
            return cls4 != null && cls4.getClassLoader() == classLoader;
        }
        if (objectWriter instanceof ObjectWriterImplOptional) {
            Class<?> cls5 = TypeUtils.getClass(((ObjectWriterImplOptional) objectWriter).valueType);
            return cls5 != null && cls5.getClassLoader() == classLoader;
        }
        if (objectWriter instanceof ObjectWriterAdapter) {
            identityHashMap.put(objectWriter, null);
            List<FieldWriter> list = ((ObjectWriterAdapter) objectWriter).fieldWriters;
            for (int i10 = 0; i10 < list.size(); i10++) {
                FieldWriter fieldWriter = list.get(i10);
                if ((fieldWriter instanceof FieldWriterObject) && match(null, ((FieldWriterObject) fieldWriter).initObjectWriter, classLoader, identityHashMap)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void cleanup(final ClassLoader classLoader) {
        this.mixInCache.entrySet().removeIf(new Predicate() { // from class: com.alibaba.fastjson2.writer.c0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ObjectWriterProvider.m6530a(classLoader, (Map.Entry) obj);
            }
        });
        final IdentityHashMap identityHashMap = new IdentityHashMap();
        this.cache.entrySet().removeIf(new Predicate() { // from class: com.alibaba.fastjson2.writer.d0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return ObjectWriterProvider.match((Type) entry.getKey(), (ObjectWriter) entry.getValue(), classLoader, identityHashMap);
            }
        });
        this.cacheFieldBased.entrySet().removeIf(new Predicate() { // from class: com.alibaba.fastjson2.writer.e0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return ObjectWriterProvider.match((Type) entry.getKey(), (ObjectWriter) entry.getValue(), classLoader, identityHashMap);
            }
        });
        BeanUtils.cleanupCache(classLoader);
    }

    public void cleanupMixIn() {
        this.mixInCache.clear();
    }

    public void clear() {
        this.mixInCache.clear();
        this.cache.clear();
        this.cacheFieldBased.clear();
    }

    @SafeVarargs
    public final void configEnumAsJavaBean(Class<? extends Enum>... clsArr) {
        for (Class<? extends Enum> cls : clsArr) {
            register(cls, getCreator().createObjectWriter(cls));
        }
    }

    public BeanInfo createBeanInfo() {
        return new BeanInfo(this);
    }

    public void getBeanInfo(BeanInfo beanInfo, Class cls) {
        PropertyNamingStrategy propertyNamingStrategy = this.namingStrategy;
        if (propertyNamingStrategy != null && propertyNamingStrategy != PropertyNamingStrategy.NeverUseThisValueExceptDefaultValue) {
            beanInfo.namingStrategy = propertyNamingStrategy.name();
        }
        for (int i10 = 0; i10 < this.modules.size(); i10++) {
            ObjectWriterAnnotationProcessor annotationProcessor = this.modules.get(i10).getAnnotationProcessor();
            if (annotationProcessor != null) {
                annotationProcessor.getBeanInfo(beanInfo, cls);
            }
        }
    }

    public ObjectWriterCreator getCreator() {
        ObjectWriterCreator contextWriterCreator = JSONFactory.getContextWriterCreator();
        return contextWriterCreator != null ? contextWriterCreator : this.creator;
    }

    public void getFieldInfo(BeanInfo beanInfo, FieldInfo fieldInfo, Class cls, Field field) {
        for (int i10 = 0; i10 < this.modules.size(); i10++) {
            ObjectWriterAnnotationProcessor annotationProcessor = this.modules.get(i10).getAnnotationProcessor();
            if (annotationProcessor != null) {
                annotationProcessor.getFieldInfo(beanInfo, fieldInfo, cls, field);
            }
        }
    }

    @Override // com.alibaba.fastjson2.modules.ObjectCodecProvider
    public Class getMixIn(Class cls) {
        return this.mixInCache.get(cls);
    }

    public List<ObjectWriterModule> getModules() {
        return this.modules;
    }

    public PropertyNamingStrategy getNamingStrategy() {
        return this.namingStrategy;
    }

    public ObjectWriter getObjectWriter(Type type, String str, Locale locale) {
        return type == Double.class ? new ObjectWriterImplDouble(new DecimalFormat(str)) : type == Float.class ? new ObjectWriterImplFloat(new DecimalFormat(str)) : type == BigDecimal.class ? new ObjectWriterImplBigDecimal(new DecimalFormat(str), null) : type == LocalDate.class ? ObjectWriterImplLocalDate.m6522of(str, null) : type == LocalDateTime.class ? new ObjectWriterImplLocalDateTime(str, null) : type == LocalTime.class ? new ObjectWriterImplLocalTime(str, null) : type == Date.class ? new ObjectWriterImplDate(str, null) : type == OffsetDateTime.class ? ObjectWriterImplOffsetDateTime.m6528of(str, null) : type == ZonedDateTime.class ? new ObjectWriterImplZonedDateTime(str, null) : getObjectWriter(type);
    }

    public ObjectWriter getObjectWriterFromCache(Type type, Class cls, boolean z10) {
        return z10 ? this.cacheFieldBased.get(type) : this.cache.get(type);
    }

    public void init() {
        this.modules.add(new ObjectWriterBaseModule(this));
    }

    public boolean isAlphabetic() {
        return this.alphabetic;
    }

    public boolean isDisableArrayMapping() {
        return this.disableArrayMapping;
    }

    public boolean isDisableAutoType() {
        return this.disableAutoType;
    }

    public boolean isDisableJSONB() {
        return this.disableJSONB;
    }

    public boolean isDisableReferenceDetect() {
        return this.disableReferenceDetect;
    }

    public boolean isSkipTransient() {
        return this.skipTransient;
    }

    public void mixIn(Class cls, Class cls2) {
        ConcurrentMap<Class, Class> concurrentMap = this.mixInCache;
        if (cls2 == null) {
            concurrentMap.remove(cls);
        } else {
            concurrentMap.put(cls, cls2);
        }
        this.cache.remove(cls);
    }

    public ObjectWriter register(Type type, ObjectWriter objectWriter, boolean z10) {
        if (type == Integer.class) {
            if (objectWriter == null || objectWriter == ObjectWriterImplInt32.INSTANCE) {
                this.userDefineMask &= -3;
            } else {
                this.userDefineMask |= 2;
            }
        } else if (type == Long.class || type == Long.TYPE) {
            if (objectWriter == null || objectWriter == ObjectWriterImplInt64.INSTANCE) {
                this.userDefineMask &= -5;
            } else {
                this.userDefineMask |= 4;
            }
        } else if (type == BigDecimal.class) {
            if (objectWriter == null || objectWriter == ObjectWriterImplBigDecimal.INSTANCE) {
                this.userDefineMask &= -9;
            } else {
                this.userDefineMask |= 8;
            }
        } else if (type == Date.class) {
            if (objectWriter == null || objectWriter == ObjectWriterImplDate.INSTANCE) {
                this.userDefineMask &= -17;
            } else {
                this.userDefineMask |= 16;
            }
        } else if (type == Enum.class) {
            long j10 = this.userDefineMask;
            if (objectWriter == null) {
                this.userDefineMask = j10 & (-33);
            } else {
                this.userDefineMask = j10 | 32;
            }
        }
        ConcurrentMap<Type, ObjectWriter> concurrentMap = z10 ? this.cacheFieldBased : this.cache;
        return objectWriter == null ? concurrentMap.remove(type) : concurrentMap.put(type, objectWriter);
    }

    public ObjectWriter registerIfAbsent(Type type, ObjectWriter objectWriter, boolean z10) {
        return (z10 ? this.cacheFieldBased : this.cache).putIfAbsent(type, objectWriter);
    }

    public void setAlphabetic(boolean z10) {
        this.alphabetic = z10;
    }

    public void setCompatibleWithFieldName(boolean z10) {
        long j10 = this.userDefineMask;
        if (z10) {
            this.userDefineMask = j10 | 64;
        } else {
            this.userDefineMask = j10 & (-65);
        }
    }

    public void setDisableArrayMapping(boolean z10) {
        this.disableArrayMapping = z10;
    }

    public void setDisableAutoType(boolean z10) {
        this.disableAutoType = z10;
    }

    public void setDisableJSONB(boolean z10) {
        this.disableJSONB = z10;
    }

    public void setDisableReferenceDetect(boolean z10) {
        this.disableReferenceDetect = z10;
    }

    public void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this.namingStrategy = propertyNamingStrategy;
    }

    public void setSkipTransient(boolean z10) {
        this.skipTransient = z10;
    }

    public ObjectWriter unregister(Type type, boolean z10) {
        return (z10 ? this.cacheFieldBased : this.cache).remove(type);
    }

    public ObjectWriter registerIfAbsent(Type type, ObjectWriter objectWriter) {
        return registerIfAbsent(type, objectWriter, false);
    }

    public ObjectWriter unregister(Type type) {
        return unregister(type, false);
    }

    public boolean unregister(Type type, ObjectWriter objectWriter) {
        return unregister(type, objectWriter, false);
    }

    public boolean unregister(Type type, ObjectWriter objectWriter, boolean z10) {
        return (z10 ? this.cacheFieldBased : this.cache).remove(type, objectWriter);
    }

    public boolean unregister(ObjectWriterModule objectWriterModule) {
        return this.modules.remove(objectWriterModule);
    }

    public void getFieldInfo(BeanInfo beanInfo, FieldInfo fieldInfo, Class cls, Method method) {
        for (int i10 = 0; i10 < this.modules.size(); i10++) {
            ObjectWriterAnnotationProcessor annotationProcessor = this.modules.get(i10).getAnnotationProcessor();
            if (annotationProcessor != null) {
                annotationProcessor.getFieldInfo(beanInfo, fieldInfo, cls, method);
            }
        }
    }

    public void cleanup(Class cls) {
        this.mixInCache.remove(cls);
        this.cache.remove(cls);
        this.cacheFieldBased.remove(cls);
        BeanUtils.cleanupCache(cls);
    }

    public ObjectWriter getObjectWriter(Class cls) {
        return getObjectWriter((Type) cls, cls, false);
    }

    public ObjectWriter getObjectWriter(Type type, Class cls) {
        return getObjectWriter(type, cls, false);
    }

    public ObjectWriter getObjectWriter(Type type) {
        return getObjectWriter(type, (Class) TypeUtils.getClass(type), false);
    }

    public ObjectWriter getObjectWriter(Type type, Class cls, String str, boolean z10) {
        ObjectWriter objectWriter = getObjectWriter(type, cls, z10);
        return (str != null && type == LocalDateTime.class && objectWriter == ObjectWriterImplLocalDateTime.INSTANCE) ? ObjectWriterImplLocalDateTime.m6523of(str, null) : objectWriter;
    }

    public ObjectWriter getObjectWriter(Type type, Class cls, boolean z10) {
        ObjectWriter objectWriter;
        if (z10) {
            objectWriter = this.cacheFieldBased.get(type);
        } else {
            objectWriter = this.cache.get(type);
        }
        return objectWriter != null ? objectWriter : getObjectWriterInternal(type, cls, z10);
    }

    public ObjectWriterProvider() {
        this((PropertyNamingStrategy) null);
    }

    public ObjectWriterProvider(ObjectWriterCreator objectWriterCreator) {
        this.cache = new ConcurrentHashMap();
        this.cacheFieldBased = new ConcurrentHashMap();
        this.mixInCache = new ConcurrentHashMap();
        this.modules = new ArrayList();
        this.disableReferenceDetect = JSONFactory.isDisableReferenceDetect();
        this.disableArrayMapping = JSONFactory.isDisableArrayMapping();
        this.disableJSONB = JSONFactory.isDisableJSONB();
        this.disableAutoType = JSONFactory.isDisableAutoType();
        this.skipTransient = JSONFactory.isDefaultSkipTransient();
        this.alphabetic = JSONFactory.isDefaultWriterAlphabetic();
        init();
        this.creator = objectWriterCreator;
    }

    public ObjectWriter register(Type type, ObjectWriter objectWriter) {
        return register(type, objectWriter, (JSONFactory.getDefaultWriterFeatures() & JSONWriter.Feature.FieldBased.mask) != 0);
    }

    public boolean register(ObjectWriterModule objectWriterModule) {
        for (int size = this.modules.size() - 1; size >= 0; size--) {
            if (this.modules.get(size) == objectWriterModule) {
                return false;
            }
        }
        objectWriterModule.init(this);
        this.modules.add(0, objectWriterModule);
        return true;
    }
}
