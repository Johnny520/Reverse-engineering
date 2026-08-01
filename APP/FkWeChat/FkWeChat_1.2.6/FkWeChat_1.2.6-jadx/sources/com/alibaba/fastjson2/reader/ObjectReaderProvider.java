package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1608k0;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.FieldBiConsumer;
import com.alibaba.fastjson2.function.FieldConsumer;
import com.alibaba.fastjson2.modules.ObjectCodecProvider;
import com.alibaba.fastjson2.modules.ObjectReaderAnnotationProcessor;
import com.alibaba.fastjson2.modules.ObjectReaderModule;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderProvider implements ObjectCodecProvider {
    static final String[] AUTO_TYPE_ACCEPT_LIST;
    static JSONReader.AutoTypeBeforeHandler DEFAULT_AUTO_TYPE_BEFORE_HANDLER;
    static Consumer<Class> DEFAULT_AUTO_TYPE_HANDLER;
    static boolean DEFAULT_AUTO_TYPE_HANDLER_INIT_ERROR;
    static final String[] DENYS;
    static final ClassLoader FASTJSON2_CLASS_LOADER = JSON.class.getClassLoader();
    public static final boolean SAFE_MODE;
    static ObjectReaderCachePair readerCache;
    private long[] acceptHashCodes;
    final ObjectReaderCreator creator;
    PropertyNamingStrategy namingStrategy;
    final ConcurrentMap<Type, ObjectReader> cache = new ConcurrentHashMap();
    final ConcurrentMap<Type, ObjectReader> cacheFieldBased = new ConcurrentHashMap();
    final ConcurrentMap<Integer, ConcurrentHashMap<Long, ObjectReader>> tclHashCaches = new ConcurrentHashMap();
    final ConcurrentMap<Long, ObjectReader> hashCache = new ConcurrentHashMap();
    final ConcurrentMap<Class, Class> mixInCache = new ConcurrentHashMap();
    final LRUAutoTypeCache autoTypeList = new LRUAutoTypeCache(1024);
    private final ConcurrentMap<Type, Map<Type, Function>> typeConverts = new ConcurrentHashMap();
    final List<ObjectReaderModule> modules = new CopyOnWriteArrayList();
    boolean disableReferenceDetect = JSONFactory.isDisableReferenceDetect();
    boolean disableArrayMapping = JSONFactory.isDisableArrayMapping();
    boolean disableJSONB = JSONFactory.isDisableJSONB();
    boolean disableAutoType = JSONFactory.isDisableAutoType();
    boolean disableSmartMatch = JSONFactory.isDisableSmartMatch();
    private JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = DEFAULT_AUTO_TYPE_BEFORE_HANDLER;
    private Consumer<Class> autoTypeHandler = DEFAULT_AUTO_TYPE_HANDLER;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class LRUAutoTypeCache extends LinkedHashMap<String, Date> {
        private final int maxSize;

        public LRUAutoTypeCache(int i10) {
            super(16, 0.75f, false);
            this.maxSize = i10;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Date> entry) {
            return size() > this.maxSize;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class ObjectReaderCachePair {
        final long hashCode;
        volatile int missCount;
        final ObjectReader reader;

        public ObjectReaderCachePair(long j10, ObjectReader objectReader) {
            this.hashCode = j10;
            this.reader = objectReader;
        }
    }

    static {
        Class clsLoadClass;
        Class clsLoadClass2;
        String property = System.getProperty(JSONFactory.PROPERTY_DENY_PROPERTY);
        if (property == null) {
            property = JSONFactory.Conf.getProperty(JSONFactory.PROPERTY_DENY_PROPERTY);
        }
        if (property == null || property.length() <= 0) {
            DENYS = new String[0];
        } else {
            DENYS = property.split(",");
        }
        String property2 = System.getProperty(JSONFactory.PROPERTY_AUTO_TYPE_ACCEPT);
        if (property2 == null) {
            property2 = JSONFactory.Conf.getProperty(JSONFactory.PROPERTY_AUTO_TYPE_ACCEPT);
        }
        if (property2 == null || property2.length() <= 0) {
            AUTO_TYPE_ACCEPT_LIST = new String[0];
        } else {
            AUTO_TYPE_ACCEPT_LIST = property2.split(",");
        }
        String property3 = System.getProperty(JSONFactory.PROPERTY_AUTO_TYPE_BEFORE_HANDLER);
        if (property3 == null || property3.isEmpty()) {
            property3 = JSONFactory.Conf.getProperty(JSONFactory.PROPERTY_AUTO_TYPE_BEFORE_HANDLER);
        }
        if (property3 != null) {
            property3 = property3.trim();
        }
        if (property3 != null && !property3.isEmpty() && (clsLoadClass2 = TypeUtils.loadClass(property3)) != null) {
            try {
                DEFAULT_AUTO_TYPE_BEFORE_HANDLER = (JSONReader.AutoTypeBeforeHandler) clsLoadClass2.newInstance();
            } catch (Exception unused) {
                DEFAULT_AUTO_TYPE_HANDLER_INIT_ERROR = true;
            }
        }
        String property4 = System.getProperty(JSONFactory.PROPERTY_AUTO_TYPE_HANDLER);
        if (property4 == null || property4.isEmpty()) {
            property4 = JSONFactory.Conf.getProperty(JSONFactory.PROPERTY_AUTO_TYPE_HANDLER);
        }
        if (property4 != null) {
            property4 = property4.trim();
        }
        if (property4 != null && !property4.isEmpty() && (clsLoadClass = TypeUtils.loadClass(property4)) != null) {
            try {
                DEFAULT_AUTO_TYPE_HANDLER = (Consumer) clsLoadClass.newInstance();
            } catch (Exception unused2) {
                DEFAULT_AUTO_TYPE_HANDLER_INIT_ERROR = true;
            }
        }
        String property5 = System.getProperty("fastjson.parser.safeMode");
        if (property5 == null || property5.isEmpty()) {
            property5 = JSONFactory.Conf.getProperty("fastjson.parser.safeMode");
        }
        if (property5 == null || property5.isEmpty()) {
            property5 = System.getProperty("fastjson2.parser.safeMode");
        }
        if (property5 == null || property5.isEmpty()) {
            property5 = JSONFactory.Conf.getProperty("fastjson2.parser.safeMode");
        }
        if (property5 != null) {
            property5 = property5.trim();
        }
        SAFE_MODE = "true".equals(property5);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ObjectReaderProvider() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderProvider.<init>():void");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m6400a(ClassLoader classLoader, Map.Entry entry) {
        return ((Class) entry.getKey()).getClassLoader() == classLoader;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6402c(long j10, AtomicReference atomicReference, Field field) {
        if (j10 == Fnv.hashCode64LCase(field.getName())) {
            atomicReference.set(field);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6403d(long j10, AtomicReference atomicReference, Method method) {
        if (j10 == Fnv.hashCode64LCase(BeanUtils.setterName(method.getName(), PropertyNamingStrategy.CamelCase.name()))) {
            atomicReference.set(method);
        }
    }

    private ObjectReader getObjectReaderInternal(Type type, boolean z10) {
        ObjectReader objectReader;
        ObjectReader objectReader2;
        Iterator<ObjectReaderModule> it = this.modules.iterator();
        ObjectReader objectReaderCreateObjectReader = null;
        while (it.hasNext()) {
            objectReaderCreateObjectReader = it.next().getObjectReader(this, type);
            if (objectReaderCreateObjectReader != null) {
                ObjectReader objectReaderPutIfAbsent = z10 ? this.cacheFieldBased.putIfAbsent(type, objectReaderCreateObjectReader) : this.cache.putIfAbsent(type, objectReaderCreateObjectReader);
                return objectReaderPutIfAbsent != null ? objectReaderPutIfAbsent : objectReaderCreateObjectReader;
            }
        }
        boolean z11 = false;
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            if (bounds.length > 0) {
                Type type2 = bounds[0];
                if ((type2 instanceof Class) && (objectReader2 = getObjectReader(type2, z10)) != null) {
                    ObjectReader previousObjectReader = getPreviousObjectReader(z10, type, objectReader2);
                    return previousObjectReader != null ? previousObjectReader : objectReader2;
                }
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType instanceof Class) {
                Class cls = (Class) rawType;
                Class superclass = cls;
                while (true) {
                    if (superclass == Object.class) {
                        break;
                    }
                    if (superclass.getTypeParameters().length > 0) {
                        z11 = true;
                        break;
                    }
                    superclass = superclass.getSuperclass();
                }
                if ((actualTypeArguments.length == 0 || !z11) && (objectReader = getObjectReader(cls, z10)) != null) {
                    ObjectReader previousObjectReader2 = getPreviousObjectReader(z10, type, objectReader);
                    return previousObjectReader2 != null ? previousObjectReader2 : objectReader;
                }
                if (actualTypeArguments.length == 1 && ArrayList.class.isAssignableFrom(cls)) {
                    return ObjectReaderImplList.m6383of(type, cls, 0L);
                }
                if (actualTypeArguments.length == 2 && Map.class.isAssignableFrom(cls)) {
                    return ObjectReaderImplMap.m6389of(type, cls, 0L);
                }
            }
        }
        Class<?> mapping = TypeUtils.getMapping(type);
        String name = mapping.getName();
        if (!z10 && "com.google.common.collect.ArrayListMultimap".equals(name)) {
            objectReaderCreateObjectReader = ObjectReaderImplMap.m6389of(null, mapping, 0L);
        }
        if (objectReaderCreateObjectReader == null) {
            objectReaderCreateObjectReader = getCreator().createObjectReader(mapping, type, z10, this);
        }
        ObjectReader previousObjectReader3 = getPreviousObjectReader(z10, type, objectReaderCreateObjectReader);
        return previousObjectReader3 != null ? previousObjectReader3 : objectReaderCreateObjectReader;
    }

    private ObjectReader getPreviousObjectReader(boolean z10, Type type, ObjectReader objectReader) {
        return z10 ? this.cacheFieldBased.putIfAbsent(type, objectReader) : this.cache.putIfAbsent(type, objectReader);
    }

    public static boolean match(Type type, ObjectReader objectReader, ClassLoader classLoader) {
        Class<?> cls = TypeUtils.getClass(type);
        if (cls != null && cls.getClassLoader() == classLoader) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (match(parameterizedType.getRawType(), objectReader, classLoader)) {
                return true;
            }
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (match(type2, objectReader, classLoader)) {
                    return true;
                }
            }
        }
        if (objectReader instanceof ObjectReaderImplMapTyped) {
            ObjectReaderImplMapTyped objectReaderImplMapTyped = (ObjectReaderImplMapTyped) objectReader;
            Class cls2 = objectReaderImplMapTyped.valueClass;
            if (cls2 != null && cls2.getClassLoader() == classLoader) {
                return true;
            }
            Class<?> cls3 = TypeUtils.getClass(objectReaderImplMapTyped.keyType);
            return cls3 != null && cls3.getClassLoader() == classLoader;
        }
        if (objectReader instanceof ObjectReaderImplList) {
            Class cls4 = ((ObjectReaderImplList) objectReader).itemClass;
            return cls4 != null && cls4.getClassLoader() == classLoader;
        }
        if (objectReader instanceof ObjectReaderImplOptional) {
            Class cls5 = ((ObjectReaderImplOptional) objectReader).itemClass;
            return cls5 != null && cls5.getClassLoader() == classLoader;
        }
        if (objectReader instanceof ObjectReaderAdapter) {
            for (FieldReader fieldReader : ((ObjectReaderAdapter) objectReader).fieldReaders) {
                Class cls6 = fieldReader.fieldClass;
                if (cls6 != null && cls6.getClassLoader() == classLoader) {
                    return true;
                }
                Type type3 = fieldReader.fieldType;
                if ((type3 instanceof ParameterizedType) && match(type3, null, classLoader)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addAutoTypeAccept(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        long jHashCode64 = Fnv.hashCode64(str);
        if (Arrays.binarySearch(this.acceptHashCodes, jHashCode64) < 0) {
            long[] jArr = this.acceptHashCodes;
            int length = jArr.length;
            long[] jArr2 = new long[length + 1];
            jArr2[length] = jHashCode64;
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            Arrays.sort(jArr2);
            this.acceptHashCodes = jArr2;
        }
    }

    public final void afterAutoType(String str, Class cls) {
        Consumer<Class> consumer = this.autoTypeHandler;
        if (consumer != null) {
            consumer.accept(cls);
        }
        synchronized (this.autoTypeList) {
            this.autoTypeList.putIfAbsent(str, new Date());
        }
    }

    public Class<?> checkAutoType(String str, Class<?> cls, long j10) {
        long j11;
        Class<?> clsLoadClass;
        Class<?> clsApply;
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = this.autoTypeBeforeHandler;
        if (autoTypeBeforeHandler != null && (clsApply = autoTypeBeforeHandler.apply(str, cls, j10)) != null) {
            afterAutoType(str, clsApply);
            return clsApply;
        }
        if (SAFE_MODE) {
            return null;
        }
        int length = str.length();
        if (length >= 192) {
            C1569c.m6258a("autoType is not support. ".concat(str));
            return null;
        }
        if (str.charAt(0) == '[') {
            checkAutoType(str.substring(1), null, j10);
        }
        if (cls != null && cls.getName().equals(str)) {
            afterAutoType(str, cls);
            return cls;
        }
        long j12 = 0;
        boolean z10 = (JSONReader.Feature.SupportAutoType.mask & j10) != 0;
        long j13 = Fnv.MAGIC_HASH_CODE;
        if (z10) {
            long j14 = -3750763034362895579L;
            int i10 = 0;
            j11 = Fnv.MAGIC_PRIME;
            while (i10 < length) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '$') {
                    cCharAt = '.';
                }
                long j15 = j12;
                long j16 = (j14 ^ ((long) cCharAt)) * Fnv.MAGIC_PRIME;
                if (Arrays.binarySearch(this.acceptHashCodes, j16) >= 0 && (clsLoadClass = TypeUtils.loadClass(str)) != null) {
                    if (cls == null || cls.isAssignableFrom(clsLoadClass)) {
                        afterAutoType(str, clsLoadClass);
                        return clsLoadClass;
                    }
                    C1608k0.m6297a("type not match. ", str, " -> ", cls.getName());
                    return null;
                }
                i10++;
                j14 = j16;
                j12 = j15;
            }
        } else {
            j11 = Fnv.MAGIC_PRIME;
        }
        long j17 = j12;
        if (!z10) {
            int i11 = 0;
            while (i11 < length) {
                char cCharAt2 = str.charAt(i11);
                if (cCharAt2 == '$') {
                    cCharAt2 = '.';
                }
                long j18 = (j13 ^ ((long) cCharAt2)) * j11;
                if (Arrays.binarySearch(this.acceptHashCodes, j18) >= 0) {
                    Class<?> clsLoadClass2 = TypeUtils.loadClass(str);
                    if (clsLoadClass2 == null || cls == null || cls.isAssignableFrom(clsLoadClass2)) {
                        afterAutoType(str, clsLoadClass2);
                        return clsLoadClass2;
                    }
                    C1608k0.m6297a("type not match. ", str, " -> ", cls.getName());
                    return null;
                }
                i11++;
                j13 = j18;
            }
        }
        if (!z10) {
            return null;
        }
        Class<?> mapping = TypeUtils.getMapping(str);
        if (mapping != null) {
            if (cls == null || cls == Object.class || mapping == HashMap.class || cls.isAssignableFrom(mapping)) {
                afterAutoType(str, mapping);
                return mapping;
            }
            C1608k0.m6297a("type not match. ", str, " -> ", cls.getName());
            return null;
        }
        Class<?> clsLoadClass3 = TypeUtils.loadClass(str);
        if (clsLoadClass3 != null) {
            if (ClassLoader.class.isAssignableFrom(clsLoadClass3) || JDKUtils.isSQLDataSourceOrRowSet(clsLoadClass3)) {
                C1569c.m6258a("autoType is not support. ".concat(str));
                return null;
            }
            if (cls != null) {
                if (cls.isAssignableFrom(clsLoadClass3)) {
                    afterAutoType(str, clsLoadClass3);
                    return clsLoadClass3;
                }
                if ((j10 & JSONReader.Feature.IgnoreAutoTypeNotMatch.mask) != j17) {
                    return cls;
                }
                C1608k0.m6297a("type not match. ", str, " -> ", cls.getName());
                return null;
            }
        }
        afterAutoType(str, clsLoadClass3);
        return clsLoadClass3;
    }

    public void cleanup(Class cls) {
        this.mixInCache.remove(cls);
        this.cache.remove(cls);
        this.cacheFieldBased.remove(cls);
        Iterator<ConcurrentHashMap<Long, ObjectReader>> it = this.tclHashCaches.values().iterator();
        while (it.hasNext()) {
            Iterator<Map.Entry<Long, ObjectReader>> it2 = it.next().entrySet().iterator();
            while (it2.hasNext()) {
                if (it2.next().getValue().getObjectClass() == cls) {
                    it2.remove();
                }
            }
        }
        BeanUtils.cleanupCache(cls);
    }

    public void cleanupMixIn() {
        this.mixInCache.clear();
    }

    public void clear() {
        this.mixInCache.clear();
        this.cache.clear();
        this.cacheFieldBased.clear();
    }

    public Function<Consumer, CharArrayValueConsumer> createCharArrayValueConsumerCreator(Class cls, FieldReader[] fieldReaderArr) {
        return this.creator.createCharArrayValueConsumerCreator(cls, fieldReaderArr);
    }

    public FieldReader createFieldReader(Class cls, String str, long j10) {
        ObjectReader objectReader = (j10 & JSONReader.Feature.FieldBased.mask) != 0 ? this.cacheFieldBased.get(cls) : this.cache.get(cls);
        if (objectReader != null) {
            return objectReader.getFieldReader(str);
        }
        final AtomicReference atomicReference = new AtomicReference();
        final long jHashCode64LCase = Fnv.hashCode64LCase(str);
        BeanUtils.fields(cls, new Consumer() { // from class: com.alibaba.fastjson2.reader.t3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ObjectReaderProvider.m6402c(jHashCode64LCase, atomicReference, (Field) obj);
            }
        });
        Field field = (Field) atomicReference.get();
        if (field != null) {
            return this.creator.createFieldReader(str, null, field.getType(), field);
        }
        final AtomicReference atomicReference2 = new AtomicReference();
        BeanUtils.setters(cls, new Consumer() { // from class: com.alibaba.fastjson2.reader.u3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ObjectReaderProvider.m6403d(jHashCode64LCase, atomicReference2, (Method) obj);
            }
        });
        Method method = (Method) atomicReference2.get();
        if (method == null) {
            return null;
        }
        Class<?> cls2 = method.getParameterTypes()[0];
        return this.creator.createFieldReaderMethod(cls, str, null, cls2, cls2, method);
    }

    public <T> Supplier<T> createObjectCreator(Class<T> cls, long j10) {
        final ObjectReader objectReader = (j10 & JSONReader.Feature.FieldBased.mask) != 0 ? this.cacheFieldBased.get(cls) : this.cache.get(cls);
        if (objectReader != null) {
            return new Supplier() { // from class: com.alibaba.fastjson2.reader.s3
                @Override // java.util.function.Supplier
                public final Object get() {
                    return objectReader.createInstance(0L);
                }
            };
        }
        Constructor defaultConstructor = BeanUtils.getDefaultConstructor(cls, false);
        if (defaultConstructor != null) {
            return LambdaMiscCodec.createSupplier(defaultConstructor);
        }
        C1569c.m6258a("default constructor not found : ".concat(cls.getName()));
        return null;
    }

    public <T> ObjectReader<T> createObjectReader(String[] strArr, Type[] typeArr, long[] jArr, Supplier<T> supplier, FieldConsumer<T> fieldConsumer) {
        FieldReader[] fieldReaderArr = new FieldReader[strArr.length];
        int i10 = 0;
        while (i10 < strArr.length) {
            Type type = typeArr[i10];
            fieldReaderArr[i10] = this.creator.createFieldReader(strArr[i10], type, TypeUtils.getClass(type), (jArr == null || i10 >= jArr.length) ? 0L : jArr[i10], new FieldBiConsumer(i10, fieldConsumer));
            i10++;
        }
        return this.creator.createObjectReader(null, supplier, fieldReaderArr);
    }

    public Function<Consumer, ByteArrayValueConsumer> createValueConsumerCreator(Class cls, FieldReader[] fieldReaderArr) {
        return this.creator.createByteArrayValueConsumerCreator(cls, fieldReaderArr);
    }

    public JSONReader.AutoTypeBeforeHandler getAutoTypeBeforeHandler() {
        return this.autoTypeBeforeHandler;
    }

    public Consumer<Class> getAutoTypeHandler() {
        return this.autoTypeHandler;
    }

    public Map<String, Date> getAutoTypeList() {
        return this.autoTypeList;
    }

    public void getBeanInfo(BeanInfo beanInfo, Class cls) {
        for (int i10 = 0; i10 < this.modules.size(); i10++) {
            this.modules.get(i10).getBeanInfo(beanInfo, cls);
        }
    }

    public ObjectReaderCreator getCreator() {
        ObjectReaderCreator contextReaderCreator = JSONFactory.getContextReaderCreator();
        return contextReaderCreator != null ? contextReaderCreator : this.creator;
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Method method) {
        for (int i10 = 0; i10 < this.modules.size(); i10++) {
            ObjectReaderAnnotationProcessor annotationProcessor = this.modules.get(i10).getAnnotationProcessor();
            if (annotationProcessor != null) {
                annotationProcessor.getFieldInfo(fieldInfo, cls, method);
            }
        }
        if (fieldInfo.fieldName == null && fieldInfo.alternateNames == null) {
            String name = method.getName();
            if (name.startsWith("set")) {
                String strSubstring = name.substring(3);
                if (BeanUtils.getDeclaredField(cls, strSubstring) != null) {
                    fieldInfo.alternateNames = new String[]{strSubstring};
                }
            }
        }
    }

    @Override // com.alibaba.fastjson2.modules.ObjectCodecProvider
    public Class getMixIn(Class cls) {
        return this.mixInCache.get(cls);
    }

    public List<ObjectReaderModule> getModules() {
        return this.modules;
    }

    public PropertyNamingStrategy getNamingStrategy() {
        return this.namingStrategy;
    }

    public ObjectReader getObjectReader(long j10) {
        ObjectReaderCachePair objectReaderCachePair = readerCache;
        ObjectReader objectReader = null;
        if (objectReaderCachePair != null) {
            if (objectReaderCachePair.hashCode == j10) {
                return objectReaderCachePair.reader;
            }
            int i10 = objectReaderCachePair.missCount;
            objectReaderCachePair.missCount = i10 + 1;
            if (i10 > 16) {
                readerCache = null;
            }
        }
        Long lValueOf = Long.valueOf(j10);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != FASTJSON2_CLASS_LOADER) {
            ConcurrentHashMap<Long, ObjectReader> concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(System.identityHashCode(contextClassLoader)));
            if (concurrentHashMap != null) {
                objectReader = concurrentHashMap.get(lValueOf);
            }
        }
        if (objectReader == null) {
            objectReader = this.hashCache.get(lValueOf);
        }
        if (objectReader != null && readerCache == null) {
            readerCache = new ObjectReaderCachePair(j10, objectReader);
        }
        return objectReader;
    }

    public Function getTypeConvert(Type type, Type type2) {
        Map<Type, Function> map = this.typeConverts.get(type);
        if (map == null) {
            return null;
        }
        return map.get(type2);
    }

    public void init() {
        Iterator<ObjectReaderModule> it = this.modules.iterator();
        while (it.hasNext()) {
            it.next().init(this);
        }
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

    public boolean isDisableSmartMatch() {
        return this.disableSmartMatch;
    }

    public void mixIn(Class cls, Class cls2) {
        ConcurrentMap<Class, Class> concurrentMap = this.mixInCache;
        if (cls2 == null) {
            concurrentMap.remove(cls);
        } else {
            concurrentMap.put(cls, cls2);
        }
        this.cache.remove(cls);
        this.cacheFieldBased.remove(cls);
    }

    public boolean register(ObjectReaderModule objectReaderModule) {
        for (int size = this.modules.size() - 1; size >= 0; size--) {
            if (this.modules.get(size) == objectReaderModule) {
                return false;
            }
        }
        objectReaderModule.init(this);
        this.modules.add(0, objectReaderModule);
        return true;
    }

    public void registerIfAbsent(long j10, ObjectReader objectReader) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != JSON.class.getClassLoader()) {
            int iIdentityHashCode = System.identityHashCode(contextClassLoader);
            ConcurrentHashMap<Long, ObjectReader> concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(iIdentityHashCode));
            if (concurrentHashMap == null) {
                this.tclHashCaches.putIfAbsent(Integer.valueOf(iIdentityHashCode), new ConcurrentHashMap<>());
                concurrentHashMap = this.tclHashCaches.get(Integer.valueOf(iIdentityHashCode));
            }
            concurrentHashMap.putIfAbsent(Long.valueOf(j10), objectReader);
        }
        this.hashCache.putIfAbsent(Long.valueOf(j10), objectReader);
    }

    public void registerSeeAlsoSubType(Class cls, String str) {
        ObjectReaderSeeAlso objectReaderSeeAlso;
        ObjectReaderSeeAlso objectReaderSeeAlsoAddSubType;
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            C1569c.m6258a("superclass is null");
            return;
        }
        ObjectReader objectReader = getObjectReader(superclass);
        if (!(objectReader instanceof ObjectReaderSeeAlso) || (objectReaderSeeAlsoAddSubType = (objectReaderSeeAlso = (ObjectReaderSeeAlso) objectReader).addSubType(cls, str)) == objectReaderSeeAlso) {
            return;
        }
        if (this.cache.containsKey(superclass)) {
            this.cache.put(superclass, objectReaderSeeAlsoAddSubType);
        } else {
            this.cacheFieldBased.put(cls, objectReaderSeeAlsoAddSubType);
        }
    }

    public Function registerTypeConvert(Type type, Type type2, Function function) {
        Map<Type, Function> map = this.typeConverts.get(type);
        if (map == null) {
            this.typeConverts.putIfAbsent(type, new ConcurrentHashMap());
            map = this.typeConverts.get(type);
        }
        return map.put(type2, function);
    }

    public void setAutoTypeBeforeHandler(JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler) {
        this.autoTypeBeforeHandler = autoTypeBeforeHandler;
    }

    public void setAutoTypeHandler(Consumer<Class> consumer) {
        this.autoTypeHandler = consumer;
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

    public void setDisableSmartMatch(boolean z10) {
        this.disableSmartMatch = z10;
    }

    public void setNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {
        this.namingStrategy = propertyNamingStrategy;
    }

    public boolean unregister(ObjectReaderModule objectReaderModule) {
        return this.modules.remove(objectReaderModule);
    }

    public ObjectReader unregisterObjectReader(Type type, boolean z10) {
        return (z10 ? this.cacheFieldBased : this.cache).remove(type);
    }

    public ObjectReader unregisterObjectReader(Type type) {
        return unregisterObjectReader(type, false);
    }

    public boolean unregisterObjectReader(Type type, ObjectReader objectReader) {
        return unregisterObjectReader(type, objectReader, false);
    }

    public boolean unregisterObjectReader(Type type, ObjectReader objectReader, boolean z10) {
        return (z10 ? this.cacheFieldBased : this.cache).remove(type, objectReader);
    }

    @Deprecated
    public void addAutoTypeDeny(String str) {
    }

    public ObjectReader register(Type type, ObjectReader objectReader) {
        return register(type, objectReader, false);
    }

    public ObjectReader register(Type type, ObjectReader objectReader, boolean z10) {
        ConcurrentMap<Type, ObjectReader> concurrentMap = z10 ? this.cacheFieldBased : this.cache;
        if (objectReader == null) {
            return concurrentMap.remove(type);
        }
        return concurrentMap.put(type, objectReader);
    }

    public void registerSeeAlsoSubType(Class cls) {
        registerSeeAlsoSubType(cls, null);
    }

    public <T> ObjectReader<T> createObjectReader(String[] strArr, Type[] typeArr, Supplier<T> supplier, FieldConsumer<T> fieldConsumer) {
        return createObjectReader(strArr, typeArr, null, supplier, fieldConsumer);
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Constructor constructor, int i10, Parameter parameter) {
        int i11 = 0;
        while (i11 < this.modules.size()) {
            ObjectReaderAnnotationProcessor annotationProcessor = this.modules.get(i11).getAnnotationProcessor();
            FieldInfo fieldInfo2 = fieldInfo;
            Class cls2 = cls;
            Constructor constructor2 = constructor;
            int i12 = i10;
            Parameter parameter2 = parameter;
            if (annotationProcessor != null) {
                annotationProcessor.getFieldInfo(fieldInfo2, cls2, constructor2, i12, parameter2);
            }
            i11++;
            fieldInfo = fieldInfo2;
            cls = cls2;
            constructor = constructor2;
            i10 = i12;
            parameter = parameter2;
        }
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Method method, int i10, Parameter parameter) {
        int i11 = 0;
        while (i11 < this.modules.size()) {
            ObjectReaderAnnotationProcessor annotationProcessor = this.modules.get(i11).getAnnotationProcessor();
            FieldInfo fieldInfo2 = fieldInfo;
            Class cls2 = cls;
            Method method2 = method;
            int i12 = i10;
            Parameter parameter2 = parameter;
            if (annotationProcessor != null) {
                annotationProcessor.getFieldInfo(fieldInfo2, cls2, method2, i12, parameter2);
            }
            i11++;
            fieldInfo = fieldInfo2;
            cls = cls2;
            method = method2;
            i10 = i12;
            parameter = parameter2;
        }
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Field field) {
        for (int i10 = 0; i10 < this.modules.size(); i10++) {
            this.modules.get(i10).getFieldInfo(fieldInfo, cls, field);
        }
    }

    public void cleanup(final ClassLoader classLoader) {
        this.mixInCache.entrySet().removeIf(new Predicate() { // from class: com.alibaba.fastjson2.reader.v3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ObjectReaderProvider.m6400a(classLoader, (Map.Entry) obj);
            }
        });
        this.cache.entrySet().removeIf(new Predicate() { // from class: com.alibaba.fastjson2.reader.w3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return ObjectReaderProvider.match((Type) entry.getKey(), (ObjectReader) entry.getValue(), classLoader);
            }
        });
        this.cacheFieldBased.entrySet().removeIf(new Predicate() { // from class: com.alibaba.fastjson2.reader.x3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return ObjectReaderProvider.match((Type) entry.getKey(), (ObjectReader) entry.getValue(), classLoader);
            }
        });
        this.tclHashCaches.remove(Integer.valueOf(System.identityHashCode(classLoader)));
        BeanUtils.cleanupCache(classLoader);
    }

    public ObjectReader registerIfAbsent(Type type, ObjectReader objectReader) {
        return registerIfAbsent(type, objectReader, false);
    }

    public ObjectReader registerIfAbsent(Type type, ObjectReader objectReader, boolean z10) {
        return (z10 ? this.cacheFieldBased : this.cache).putIfAbsent(type, objectReader);
    }

    public ObjectReader getObjectReader(String str, Class<?> cls, long j10) {
        Class<?> clsCheckAutoType = checkAutoType(str, cls, j10);
        if (clsCheckAutoType == null) {
            return null;
        }
        ObjectReader objectReader = getObjectReader(clsCheckAutoType, (j10 & JSONReader.Feature.FieldBased.mask) != 0);
        if (clsCheckAutoType != cls) {
            registerIfAbsent(Fnv.hashCode64(str), objectReader);
        }
        return objectReader;
    }

    public ObjectReader getObjectReader(Type type) {
        return getObjectReader(type, false);
    }

    public ObjectReader getObjectReader(Type type, boolean z10) {
        ObjectReader objectReader;
        if (type == null) {
            type = Object.class;
        }
        if (z10) {
            objectReader = this.cacheFieldBased.get(type);
        } else {
            objectReader = this.cache.get(type);
        }
        if (objectReader == null && (type instanceof WildcardType)) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                objectReader = (z10 ? this.cacheFieldBased : this.cache).get(upperBounds[0]);
            }
        }
        return objectReader != null ? objectReader : getObjectReaderInternal(type, z10);
    }

    public ObjectReaderProvider(ObjectReaderCreator objectReaderCreator) {
        long[] jArr;
        String[] strArr = AUTO_TYPE_ACCEPT_LIST;
        if (strArr == null) {
            jArr = new long[1];
        } else {
            jArr = new long[strArr.length + 1];
            int i10 = 0;
            while (true) {
                String[] strArr2 = AUTO_TYPE_ACCEPT_LIST;
                if (i10 >= strArr2.length) {
                    break;
                }
                jArr[i10] = Fnv.hashCode64(strArr2[i10]);
                i10++;
            }
        }
        jArr[jArr.length - 1] = -6293031534589903644L;
        Arrays.sort(jArr);
        this.acceptHashCodes = jArr;
        this.hashCache.put(Long.valueOf(ObjectArrayReader.TYPE_HASH_CODE), ObjectArrayReader.INSTANCE);
        this.hashCache.put(-4834614249632438472L, ObjectReaderImplString.INSTANCE);
        this.hashCache.put(Long.valueOf(Fnv.hashCode64(TypeUtils.getTypeName(HashMap.class))), ObjectReaderImplMap.INSTANCE);
        this.creator = objectReaderCreator;
        this.modules.add(new ObjectReaderBaseModule(this));
        init();
    }
}
