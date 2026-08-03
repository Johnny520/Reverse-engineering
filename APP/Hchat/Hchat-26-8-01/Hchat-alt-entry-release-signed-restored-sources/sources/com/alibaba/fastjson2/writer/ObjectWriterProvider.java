package com.alibaba.fastjson2.writer;

import ae.C0070a;
import ae.C0073d;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.reader.C0628g;
import com.alibaba.fastjson2.reader.C0632k;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.JdbcSupport;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Clob;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterProvider {
    static final int ENUM = 16384;
    static final int[] NOT_REFERENCES_TYPE_HASH_CODES;
    static final int[] PRIMITIVE_HASH_CODES;
    static ObjectWriterAdapter STACK_TRACE_ELEMENT_WRITER = null;
    static final int TYPE_DATE_MASK = 16;
    static final int TYPE_DECIMAL_MASK = 8;
    static final int TYPE_ENUM_MASK = 32;
    static final int TYPE_INT32_MASK = 2;
    static final int TYPE_INT64_MASK = 4;
    final ConcurrentMap<Type, ObjectWriter> cache;
    final ConcurrentMap<Type, ObjectWriter> cacheFieldBased;
    final ObjectWriterCreator creator;
    final ConcurrentMap<Class, Class> mixInCache;
    final PropertyNamingStrategy namingStrategy;
    volatile long userDefineMask;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class[] clsArr = {Boolean.TYPE, Boolean.class, Character.class, Character.TYPE, Byte.class, Byte.TYPE, Short.class, Short.TYPE, Integer.class, Integer.TYPE, Long.class, Long.TYPE, Float.class, Float.TYPE, Double.class, Double.TYPE, BigInteger.class, BigDecimal.class, String.class, Currency.class, Date.class, UUID.class, Locale.class, String.class, StackTraceElement.class, Collections.EMPTY_LIST.getClass(), Collections.EMPTY_MAP.getClass(), Collections.EMPTY_SET.getClass()};
        int[] iArr = new int[28];
        for (int i9 = 0; i9 < 28; i9++) {
            iArr[i9] = System.identityHashCode(clsArr[i9]);
        }
        Arrays.sort(iArr);
        PRIMITIVE_HASH_CODES = iArr;
        int[] iArrCopyOf = Arrays.copyOf(iArr, 31);
        iArrCopyOf[iArrCopyOf.length - 1] = System.identityHashCode(Class.class);
        iArrCopyOf[iArrCopyOf.length - 2] = System.identityHashCode(int[].class);
        iArrCopyOf[iArrCopyOf.length - 3] = System.identityHashCode(long[].class);
        Arrays.sort(iArrCopyOf);
        NOT_REFERENCES_TYPE_HASH_CODES = iArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterProvider(PropertyNamingStrategy propertyNamingStrategy) {
        this.cache = new ConcurrentHashMap();
        this.cacheFieldBased = new ConcurrentHashMap();
        this.mixInCache = new ConcurrentHashMap();
        this.namingStrategy = propertyNamingStrategy;
        this.creator = ObjectWriterCreator.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void applyFeatures(FieldInfo fieldInfo, Enum[] enumArr) {
        for (Enum r02 : enumArr) {
            String strName = r02.name();
            strName.getClass();
            switch (strName) {
                case "DisableCircularReferenceDetect":
                    fieldInfo.features |= FieldInfo.DISABLE_REFERENCE_DETECT;
                    break;
                case "WriteNullNumberAsZero":
                    fieldInfo.features |= JSONWriter.Feature.WriteNullNumberAsZero.mask;
                    break;
                case "IgnoreErrorGetter":
                    fieldInfo.features |= JSONWriter.Feature.IgnoreErrorGetter.mask;
                    break;
                case "UseISO8601DateFormat":
                    fieldInfo.format = "iso8601";
                    break;
                case "WriteBigDecimalAsPlain":
                    fieldInfo.features |= JSONWriter.Feature.WriteBigDecimalAsPlain.mask;
                    break;
                case "WriteEnumUsingToString":
                    fieldInfo.features |= JSONWriter.Feature.WriteEnumUsingToString.mask;
                    break;
                case "BrowserCompatible":
                    fieldInfo.features |= JSONWriter.Feature.BrowserCompatible.mask;
                    break;
                case "WriteNullStringAsEmpty":
                    fieldInfo.features |= JSONWriter.Feature.WriteNullStringAsEmpty.mask;
                    break;
                case "NotWriteRootClassName":
                    fieldInfo.features |= JSONWriter.Feature.NotWriteRootClassName.mask;
                    break;
                case "WriteNullListAsEmpty":
                    fieldInfo.features |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                    break;
                case "WriteNonStringValueAsString":
                    fieldInfo.features |= JSONWriter.Feature.WriteNonStringValueAsString.mask;
                    break;
                case "WriteNullBooleanAsFalse":
                    fieldInfo.features |= JSONWriter.Feature.WriteNullBooleanAsFalse.mask;
                    break;
                case "WriteClassName":
                    fieldInfo.features |= JSONWriter.Feature.WriteClassName.mask;
                    break;
                case "WriteMapNullValue":
                    fieldInfo.features |= JSONWriter.Feature.WriteNulls.mask;
                    break;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ObjectWriter createEnumWriter(Class cls) throws NoSuchMethodException {
        Class cls2;
        if (!cls.isEnum()) {
            Class superclass = cls.getSuperclass();
            cls2 = superclass.isEnum() ? superclass : cls;
        }
        Member enumValueField = BeanUtils.getEnumValueField(cls2, this);
        if (enumValueField == null) {
            Member enumValueField2 = BeanUtils.getEnumValueField(this.mixInCache.get(cls2), this);
            if (enumValueField2 instanceof Field) {
                try {
                    enumValueField = cls2.getField(((Field) enumValueField2).getName());
                } catch (NoSuchFieldException | NoSuchMethodException unused) {
                }
            } else if (enumValueField2 instanceof Method) {
                enumValueField = cls2.getMethod(((Method) enumValueField2).getName(), null);
            }
        }
        Member member = enumValueField;
        BeanInfo beanInfo = new BeanInfo();
        getBeanInfo(beanInfo, cls2);
        if (beanInfo.writeEnumAsJavaBean) {
            return null;
        }
        return new ObjectWriterImplEnum(null, cls2, member, BeanUtils.getEnumAnnotationNames(cls2), 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isNotReferenceDetect(Class<?> cls) {
        if (Arrays.binarySearch(NOT_REFERENCES_TYPE_HASH_CODES, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isPrimitiveOrEnum(Class<?> cls) {
        if (Arrays.binarySearch(PRIMITIVE_HASH_CODES, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public /* synthetic */ void lambda$processJSONField1x$1(Annotation annotation, FieldInfo fieldInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            switch (name.hashCode()) {
                case -1371565692:
                    if (name.equals("serializeUsing")) {
                        Class<?> cls = (Class) objInvoke;
                        if (ObjectWriter.class.isAssignableFrom(cls)) {
                            fieldInfo.writeUsing = cls;
                        }
                    }
                    break;
                case -1268779017:
                    if (name.equals("format")) {
                        loadJsonFieldFormat(fieldInfo, (String) objInvoke);
                    }
                    break;
                case -1206994319:
                    if (name.equals("ordinal")) {
                        Integer num = (Integer) objInvoke;
                        if (num.intValue() != 0) {
                            fieldInfo.ordinal = num.intValue();
                        }
                    }
                    break;
                case -987658292:
                    if (name.equals("unwrapped") && ((Boolean) objInvoke).booleanValue()) {
                        fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
                        break;
                    }
                    break;
                case -940893828:
                    if (name.equals("serialzeFeatures")) {
                        applyFeatures(fieldInfo, (Enum[]) objInvoke);
                    }
                    break;
                case -659125328:
                    if (name.equals("defaultValue")) {
                        String str = (String) objInvoke;
                        if (!str.isEmpty()) {
                            fieldInfo.defaultValue = str;
                        }
                    }
                    break;
                case -573479200:
                    if (name.equals("serialize") && !((Boolean) objInvoke).booleanValue()) {
                        fieldInfo.ignore = true;
                        break;
                    }
                    break;
                case 3373707:
                    if (name.equals("name")) {
                        String str2 = (String) objInvoke;
                        if (!str2.isEmpty()) {
                            fieldInfo.fieldName = str2;
                        }
                    }
                    break;
                case 12396273:
                    if (name.equals("jsonDirect") && ((Boolean) objInvoke).booleanValue()) {
                        fieldInfo.features |= FieldInfo.RAW_VALUE_MASK;
                        break;
                    }
                    break;
                case 102727412:
                    if (name.equals("label")) {
                        String str3 = (String) objInvoke;
                        if (!str3.isEmpty()) {
                            fieldInfo.label = str3;
                        }
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void loadFieldInfo(FieldInfo fieldInfo, JSONField jSONField) {
        String strName = jSONField.name();
        if (!strName.isEmpty()) {
            fieldInfo.fieldName = strName;
        }
        String strDefaultValue = jSONField.defaultValue();
        if (!strDefaultValue.isEmpty()) {
            fieldInfo.defaultValue = strDefaultValue;
        }
        loadJsonFieldFormat(fieldInfo, jSONField.format());
        String strLabel = jSONField.label();
        if (!strLabel.isEmpty()) {
            fieldInfo.label = strLabel;
        }
        if (!fieldInfo.ignore) {
            fieldInfo.ignore = !jSONField.serialize();
        }
        if (jSONField.unwrapped()) {
            fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
        }
        for (JSONWriter.Feature feature : jSONField.serializeFeatures()) {
            fieldInfo.features |= feature.mask;
        }
        int iOrdinal = jSONField.ordinal();
        if (iOrdinal != 0) {
            fieldInfo.ordinal = iOrdinal;
        }
        if (jSONField.value()) {
            fieldInfo.features |= FieldInfo.VALUE_MASK;
        }
        if (jSONField.jsonDirect()) {
            fieldInfo.features |= FieldInfo.RAW_VALUE_MASK;
        }
        Class<?> clsSerializeUsing = jSONField.serializeUsing();
        if (ObjectWriter.class.isAssignableFrom(clsSerializeUsing)) {
            fieldInfo.writeUsing = clsSerializeUsing;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void loadJsonFieldFormat(FieldInfo fieldInfo, String str) {
        if (str.isEmpty()) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.indexOf(84) != -1 && !strTrim.contains("'T'")) {
            strTrim = strTrim.replaceAll("T", "'T'");
        }
        if (strTrim.isEmpty()) {
            return;
        }
        fieldInfo.format = strTrim;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        if (objectWriter instanceof ObjectWriterAdapter) {
            identityHashMap.put(objectWriter, null);
            List<FieldWriter> list = ((ObjectWriterAdapter) objectWriter).fieldWriters;
            for (int i9 = 0; i9 < list.size(); i9++) {
                FieldWriter fieldWriter = list.get(i9);
                if ((fieldWriter instanceof FieldWriterObject) && match(null, ((FieldWriterObject) fieldWriter).initObjectWriter, classLoader, identityHashMap)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void processAnnotations(FieldInfo fieldInfo, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.findAnnotation(annotation, JSONField.class);
            if (jSONField != null) {
                loadFieldInfo(fieldInfo, jSONField);
            } else {
                String name = clsAnnotationType.getName();
                if (name.equals("java.beans.Transient")) {
                    fieldInfo.ignore = true;
                    fieldInfo.isTransient = true;
                } else if (name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                    processJSONField1x(fieldInfo, annotation);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void processJSONField1x(FieldInfo fieldInfo, Annotation annotation) {
        BeanUtils.annotationMethods(annotation.getClass(), new C0632k(this, annotation, fieldInfo));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void cleanup(ClassLoader classLoader) {
        Iterator<Map.Entry<Class, Class>> it = this.mixInCache.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().getClassLoader() == classLoader) {
                it.remove();
            }
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator<Map.Entry<Type, ObjectWriter>> it2 = this.cache.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Type, ObjectWriter> next = it2.next();
            if (match(next.getKey(), next.getValue(), classLoader, identityHashMap)) {
                it2.remove();
            }
        }
        Iterator<Map.Entry<Type, ObjectWriter>> it3 = this.cacheFieldBased.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<Type, ObjectWriter> next2 = it3.next();
            if (match(next2.getKey(), next2.getValue(), classLoader, identityHashMap)) {
                it3.remove();
            }
        }
        BeanUtils.cleanupCache(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void cleanupMixIn() {
        this.mixInCache.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void clear() {
        this.mixInCache.clear();
        this.cache.clear();
        this.cacheFieldBased.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SafeVarargs
    public final void configEnumAsJavaBean(Class<? extends Enum>... clsArr) {
        for (Class<? extends Enum> cls : clsArr) {
            register(cls, this.creator.createObjectWriter(cls));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void getBeanInfo(BeanInfo beanInfo, Class cls) {
        Class cls2;
        Class superclass;
        String str;
        PropertyNamingStrategy propertyNamingStrategy = this.namingStrategy;
        if (propertyNamingStrategy != null && propertyNamingStrategy != PropertyNamingStrategy.NeverUseThisValueExceptDefaultValue) {
            beanInfo.namingStrategy = propertyNamingStrategy.name();
        }
        if (cls != null && (superclass = cls.getSuperclass()) != Object.class && superclass != null && superclass != Enum.class) {
            getBeanInfo(beanInfo, superclass);
            if (beanInfo.seeAlso != null && beanInfo.seeAlsoNames != null) {
                int i9 = 0;
                while (true) {
                    Class[] clsArr = beanInfo.seeAlso;
                    if (i9 >= clsArr.length) {
                        break;
                    }
                    if (clsArr[i9] == cls) {
                        String[] strArr = beanInfo.seeAlsoNames;
                        if (i9 < strArr.length && (str = strArr[i9]) != null && str.length() != 0) {
                            beanInfo.typeName = str;
                            break;
                        }
                    }
                    i9++;
                }
            }
        }
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        JSONType jSONType = null;
        int i10 = 0;
        Annotation annotation = null;
        while (i10 < declaredAnnotations.length) {
            Annotation annotation2 = declaredAnnotations[i10];
            Class<? extends Annotation> clsAnnotationType = annotation2.annotationType();
            JSONType jSONType2 = (JSONType) BeanUtils.findAnnotation(annotation2, JSONType.class);
            if (jSONType2 != annotation2 && clsAnnotationType.getName().equals("com.alibaba.fastjson.annotation.JSONType")) {
                annotation = annotation2;
            }
            i10++;
            jSONType = jSONType2;
        }
        if (jSONType == null && (cls2 = this.mixInCache.get(cls)) != null) {
            beanInfo.mixIn = true;
            Annotation[] declaredAnnotations2 = cls2.getDeclaredAnnotations();
            int i11 = 0;
            while (i11 < declaredAnnotations2.length) {
                Annotation annotation3 = declaredAnnotations2[i11];
                Class<? extends Annotation> clsAnnotationType2 = annotation3.annotationType();
                JSONType jSONType3 = (JSONType) BeanUtils.findAnnotation(annotation3, JSONType.class);
                if (jSONType3 != annotation3 && clsAnnotationType2.getName().equals("com.alibaba.fastjson.annotation.JSONType")) {
                    annotation = annotation3;
                }
                i11++;
                jSONType = jSONType3;
            }
        }
        if (jSONType != null) {
            Class<?>[] clsArrSeeAlso = jSONType.seeAlso();
            if (clsArrSeeAlso.length != 0) {
                beanInfo.seeAlso = clsArrSeeAlso;
            }
            String strTypeKey = jSONType.typeKey();
            if (!strTypeKey.isEmpty()) {
                beanInfo.typeKey = strTypeKey;
            }
            String strTypeName = jSONType.typeName();
            if (!strTypeName.isEmpty()) {
                beanInfo.typeName = strTypeName;
            }
            for (JSONWriter.Feature feature : jSONType.serializeFeatures()) {
                beanInfo.writerFeatures |= feature.mask;
            }
            beanInfo.namingStrategy = jSONType.naming().name();
            String[] strArrIgnores = jSONType.ignores();
            if (strArrIgnores.length > 0) {
                beanInfo.ignores = strArrIgnores;
            }
            String[] strArrIncludes = jSONType.includes();
            if (strArrIncludes.length > 0) {
                beanInfo.includes = strArrIncludes;
            }
            String[] strArrOrders = jSONType.orders();
            if (strArrOrders.length > 0) {
                beanInfo.orders = strArrOrders;
            }
            Class<?> clsSerializer = jSONType.serializer();
            if (ObjectWriter.class.isAssignableFrom(clsSerializer)) {
                beanInfo.serializer = clsSerializer;
                beanInfo.writeEnumAsJavaBean = true;
            }
            Class<? extends Filter>[] clsArrSerializeFilters = jSONType.serializeFilters();
            if (clsArrSerializeFilters.length != 0) {
                beanInfo.serializeFilters = clsArrSerializeFilters;
            }
            String str2 = jSONType.format();
            if (!str2.isEmpty()) {
                beanInfo.format = str2;
            }
            String strLocale = jSONType.locale();
            if (!strLocale.isEmpty()) {
                String[] strArrSplit = strLocale.split("_");
                if (strArrSplit.length == 2) {
                    beanInfo.locale = new Locale(strArrSplit[0], strArrSplit[1]);
                }
            }
            if (!jSONType.alphabetic()) {
                beanInfo.alphabetic = false;
            }
            if (jSONType.writeEnumAsJavaBean()) {
                beanInfo.writeEnumAsJavaBean = true;
            }
            String strRootName = jSONType.rootName();
            if (!strRootName.isEmpty()) {
                beanInfo.rootName = strRootName;
            }
        } else if (annotation != null) {
            BeanUtils.annotationMethods(annotation.annotationType(), new C0628g(beanInfo, annotation, 4));
        }
        Class[] clsArr2 = beanInfo.seeAlso;
        if (clsArr2 == null || clsArr2.length == 0) {
            return;
        }
        String str3 = beanInfo.typeName;
        if (str3 == null || str3.length() == 0) {
            for (Class cls3 : beanInfo.seeAlso) {
                if (cls3 == cls) {
                    beanInfo.typeName = cls.getSimpleName();
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter getExternalObjectWriter(String str, Class cls) {
        str.getClass();
        if (str.equals("java.sql.Time")) {
            return JdbcSupport.TimeWriter.m1773of(null);
        }
        if (str.equals("java.sql.Timestamp")) {
            return new JdbcSupport.TimestampWriter(null);
        }
        if (Clob.class.isAssignableFrom(cls)) {
            return new JdbcSupport.ClobWriter();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void getFieldInfo(BeanInfo beanInfo, FieldInfo fieldInfo, Class cls, Field field) {
        Class cls2;
        Field declaredField;
        JSONField jSONField = null;
        if (cls != null && (cls2 = this.mixInCache.get(cls)) != null && cls2 != cls) {
            try {
                declaredField = cls2.getDeclaredField(field.getName());
            } catch (Exception unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                getFieldInfo(beanInfo, fieldInfo, cls2, declaredField);
            }
        }
        if (this.mixInCache.get(field.getType()) != null) {
            fieldInfo.fieldClassMixIn = true;
        }
        if (Modifier.isTransient(field.getModifiers())) {
            fieldInfo.ignore = true;
            fieldInfo.isTransient = true;
        }
        for (Annotation annotation : field.getDeclaredAnnotations()) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            if ((jSONField != null || (jSONField = (JSONField) BeanUtils.findAnnotation(annotation, JSONField.class)) != annotation) && clsAnnotationType.getName().equals("com.alibaba.fastjson.annotation.JSONField")) {
                processJSONField1x(fieldInfo, annotation);
            }
        }
        if (jSONField == null) {
            return;
        }
        loadFieldInfo(fieldInfo, jSONField);
        Class<?> clsWriteUsing = jSONField.writeUsing();
        if (ObjectWriter.class.isAssignableFrom(clsWriteUsing)) {
            fieldInfo.writeUsing = clsWriteUsing;
        }
        Class<?> clsSerializeUsing = jSONField.serializeUsing();
        if (ObjectWriter.class.isAssignableFrom(clsSerializeUsing)) {
            fieldInfo.writeUsing = clsSerializeUsing;
        }
        if (jSONField.jsonDirect()) {
            fieldInfo.features |= FieldInfo.RAW_VALUE_MASK;
        }
        if ((fieldInfo.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0 && !String.class.equals(field.getType()) && fieldInfo.writeUsing == null) {
            fieldInfo.writeUsing = ObjectWriterImplToString.class;
        }
        Class<?> clsContentAs = jSONField.contentAs();
        if (clsContentAs != Void.class) {
            fieldInfo.contentAs = clsContentAs;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class getMixIn(Class cls) {
        return this.mixInCache.get(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ObjectWriter getObjectWriter(Type type, Class cls, boolean z9) {
        Class superclass = cls.getSuperclass();
        if (!cls.isEnum() && superclass != null && superclass.isEnum()) {
            return getObjectWriter(superclass, superclass, z9);
        }
        if (z9 && superclass != null && superclass != Object.class && superclass.getName().equals("com.google.protobuf.GeneratedMessageV3")) {
            z9 = false;
        }
        ObjectWriter objectWriterModule = z9 ? this.cacheFieldBased.get(type) : this.cache.get(type);
        if (objectWriterModule != null) {
            return objectWriterModule;
        }
        if ((!z9 || !Iterable.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls)) && (objectWriterModule = getObjectWriterModule(type, cls)) != null) {
            ObjectWriter objectWriterPut = z9 ? this.cacheFieldBased.put(type, objectWriterModule) : this.cache.put(type, objectWriterModule);
            return objectWriterPut != null ? objectWriterPut : objectWriterModule;
        }
        String name = cls.getName();
        if (name.equals("android.net.Uri$HierarchicalUri") || name.equals("android.net.Uri$StringUri")) {
            objectWriterModule = ObjectWriterImplToString.INSTANCE;
        } else if (name.equals("com.alibaba.fastjson.JSONObject")) {
            objectWriterModule = ObjectWriterImplMap.m1783of(cls);
        } else if (name.equals("android.net.Uri$OpaqueUri")) {
        }
        if (objectWriterModule != null) {
            return objectWriterModule;
        }
        ObjectWriter objectWriterCreateObjectWriter = this.creator.createObjectWriter(cls, z9 ? JSONWriter.Feature.FieldBased.mask : 0L, this);
        ObjectWriter objectWriterPut2 = z9 ? this.cacheFieldBased.put(type, objectWriterCreateObjectWriter) : this.cache.put(type, objectWriterCreateObjectWriter);
        return objectWriterPut2 != null ? objectWriterPut2 : objectWriterCreateObjectWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter getObjectWriterFromCache(Type type, Class cls, boolean z9) {
        return z9 ? this.cacheFieldBased.get(type) : this.cache.get(type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter getObjectWriterModule(Type type, Class cls) {
        ObjectWriter objectWriterCreateEnumWriter;
        Type type2 = type;
        if (type2 == String.class) {
            return ObjectWriterImplString.INSTANCE;
        }
        Class mapping = cls == null ? type2 instanceof Class ? (Class) type2 : TypeUtils.getMapping(type2) : cls;
        String name = mapping.getName();
        ObjectWriter externalObjectWriter = getExternalObjectWriter(name, mapping);
        if (externalObjectWriter != null) {
            return externalObjectWriter;
        }
        if (name.equals("java.util.regex.Pattern") || name.equals("net.sf.json.JSONNull") || name.equals("java.net.Inet6Address") || name.equals("java.net.Inet4Address") || name.equals("java.text.SimpleDateFormat") || name.equals("java.net.InetSocketAddress")) {
            return ObjectWriterMisc.INSTANCE;
        }
        int i9 = 0;
        int i10 = 1;
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType == List.class || rawType == ArrayList.class) {
                if (actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) {
                    return ObjectWriterImplListStr.INSTANCE;
                }
                type2 = rawType;
            }
            if (Map.class.isAssignableFrom(mapping)) {
                return ObjectWriterImplMap.m1785of(type2, mapping);
            }
        }
        if (type2 == LinkedList.class) {
            return ObjectWriterImplList.INSTANCE;
        }
        if (type2 == ArrayList.class || type2 == List.class || List.class.isAssignableFrom(mapping)) {
            return ObjectWriterImplList.INSTANCE;
        }
        if (Collection.class.isAssignableFrom(mapping)) {
            return ObjectWriterImplCollection.INSTANCE;
        }
        if (Map.class.isAssignableFrom(mapping)) {
            return ObjectWriterImplMap.m1783of(mapping);
        }
        if (Map.Entry.class.isAssignableFrom(mapping) && mapping.getName().startsWith("java.util")) {
            return ObjectWriterImplMapEntry.INSTANCE;
        }
        if (type2 == Integer.class) {
            return ObjectWriterImplInt32.INSTANCE;
        }
        if (type2 == AtomicInteger.class) {
            return ObjectWriterImplAtomicInteger.INSTANCE;
        }
        if (type2 == Byte.class) {
            return ObjectWriterImplInt8.INSTANCE;
        }
        if (type2 == Short.class) {
            return ObjectWriterImplInt16.INSTANCE;
        }
        if (type2 == Long.class) {
            return ObjectWriterImplInt64.INSTANCE;
        }
        if (type2 == AtomicLong.class) {
            return ObjectWriterImplAtomicLong.INSTANCE;
        }
        if (type2 == AtomicReference.class) {
            return ObjectWriterImplAtomicReference.INSTANCE;
        }
        if (type2 == Float.class) {
            return ObjectWriterImplFloat.INSTANCE;
        }
        if (type2 == Double.class) {
            return ObjectWriterImplDouble.INSTANCE;
        }
        if (type2 == BigInteger.class) {
            return ObjectWriterBigInteger.INSTANCE;
        }
        if (type2 == BigDecimal.class) {
            return ObjectWriterImplBigDecimal.INSTANCE;
        }
        if (type2 == OptionalInt.class) {
            return ObjectWriterImplOptionalInt.INSTANCE;
        }
        if (type2 == OptionalLong.class) {
            return ObjectWriterImplOptionalLong.INSTANCE;
        }
        if (type2 == OptionalDouble.class) {
            return ObjectWriterImplOptionalDouble.INSTANCE;
        }
        if (type2 == Optional.class) {
            return ObjectWriterImplOptional.INSTANCE;
        }
        if (type2 == Boolean.class) {
            return ObjectWriterImplBoolean.INSTANCE;
        }
        if (type2 == AtomicBoolean.class) {
            return ObjectWriterImplAtomicBoolean.INSTANCE;
        }
        if (type2 == AtomicIntegerArray.class) {
            return ObjectWriterImplAtomicIntegerArray.INSTANCE;
        }
        if (type2 == AtomicLongArray.class) {
            return ObjectWriterImplAtomicLongArray.INSTANCE;
        }
        if (type2 == Character.class) {
            return ObjectWriterImplCharacter.INSTANCE;
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (TimeUnit.class.isAssignableFrom(cls2)) {
                return new ObjectWriterImplEnum(null, TimeUnit.class, null, null, 0L);
            }
            if (Enum.class.isAssignableFrom(cls2) && (objectWriterCreateEnumWriter = createEnumWriter(cls2)) != null) {
                return objectWriterCreateEnumWriter;
            }
            if (JSONPath.class.isAssignableFrom(cls2)) {
                return ObjectWriterImplToString.INSTANCE;
            }
            if (cls2 == boolean[].class) {
                return ObjectWriterImplBoolValueArray.INSTANCE;
            }
            if (cls2 == char[].class) {
                return ObjectWriterImplCharValueArray.INSTANCE;
            }
            if (cls2 == StringBuffer.class || cls2 == StringBuilder.class) {
                return ObjectWriterImplToString.INSTANCE;
            }
            if (cls2 == byte[].class) {
                return ObjectWriterImplInt8ValueArray.INSTANCE;
            }
            if (cls2 == short[].class) {
                return ObjectWriterImplInt16ValueArray.INSTANCE;
            }
            if (cls2 == int[].class) {
                return ObjectWriterImplInt32ValueArray.INSTANCE;
            }
            if (cls2 == long[].class) {
                return ObjectWriterImplInt64ValueArray.INSTANCE;
            }
            if (cls2 == float[].class) {
                return ObjectWriterImplFloatValueArray.INSTANCE;
            }
            if (cls2 == double[].class) {
                return ObjectWriterImplDoubleValueArray.INSTANCE;
            }
            if (cls2 == Byte[].class) {
                return ObjectWriterImplInt8Array.INSTANCE;
            }
            if (cls2 == Integer[].class) {
                return ObjectWriterImplInt32Array.INSTANCE;
            }
            if (cls2 == Long[].class) {
                return ObjectWriterImplInt64Array.INSTANCE;
            }
            if (String[].class == cls2) {
                return ObjectWriterImplStringArray.INSTANCE;
            }
            if (BigDecimal[].class == cls2) {
                return ObjectWriterImpDecimalArray.INSTANCE;
            }
            if (Object[].class.isAssignableFrom(cls2)) {
                if (cls2 == Object[].class) {
                    return ObjectWriterArray.INSTANCE;
                }
                Class<?> componentType = cls2.getComponentType();
                return Modifier.isFinal(componentType.getModifiers()) ? new ObjectWriterArrayFinal(componentType, null) : new ObjectWriterArray(componentType);
            }
            if (cls2 == UUID.class) {
                return ObjectWriterImplUUID.INSTANCE;
            }
            if (cls2 == Locale.class) {
                return ObjectWriterImplLocale.INSTANCE;
            }
            if (cls2 == Currency.class) {
                return ObjectWriterImplCurrency.INSTANCE;
            }
            if (TimeZone.class.isAssignableFrom(cls2)) {
                return ObjectWriterImplTimeZone.INSTANCE;
            }
            if (cls2 == URI.class || cls2 == URL.class || cls2 == File.class || ZoneId.class.isAssignableFrom(cls2) || Charset.class.isAssignableFrom(cls2)) {
                return ObjectWriterImplToString.INSTANCE;
            }
            ObjectWriter externalObjectWriter2 = getExternalObjectWriter(cls2.getName(), cls2);
            if (externalObjectWriter2 != null) {
                return externalObjectWriter2;
            }
            BeanInfo beanInfo = new BeanInfo();
            Class mixIn = getMixIn(cls2);
            if (mixIn != null) {
                getBeanInfo(beanInfo, mixIn);
            }
            if (Date.class.isAssignableFrom(cls2)) {
                return (beanInfo.format == null && beanInfo.locale == null) ? ObjectWriterImplDate.INSTANCE : new ObjectWriterImplDate(beanInfo.format, beanInfo.locale);
            }
            if (Calendar.class.isAssignableFrom(cls2)) {
                return (beanInfo.format == null && beanInfo.locale == null) ? ObjectWriterImplCalendar.INSTANCE : new ObjectWriterImplCalendar(beanInfo.format, beanInfo.locale);
            }
            if (ZonedDateTime.class == cls2) {
                return (beanInfo.format == null && beanInfo.locale == null) ? ObjectWriterImplZonedDateTime.INSTANCE : new ObjectWriterImplZonedDateTime(beanInfo.format, beanInfo.locale);
            }
            if (OffsetDateTime.class == cls2) {
                return ObjectWriterImplOffsetDateTime.m1787of(beanInfo.format, beanInfo.locale);
            }
            if (LocalDateTime.class == cls2) {
                return (beanInfo.format == null && beanInfo.locale == null) ? ObjectWriterImplLocalDateTime.INSTANCE : new ObjectWriterImplLocalDateTime(beanInfo.format, beanInfo.locale);
            }
            if (LocalDate.class == cls2) {
                return ObjectWriterImplLocalDate.m1781of(beanInfo.format, beanInfo.locale);
            }
            if (LocalTime.class == cls2) {
                return (beanInfo.format == null && beanInfo.locale == null) ? ObjectWriterImplLocalTime.INSTANCE : new ObjectWriterImplLocalTime(beanInfo.format, beanInfo.locale);
            }
            if (OffsetTime.class == cls2) {
                return (beanInfo.format == null && beanInfo.locale == null) ? ObjectWriterImplOffsetTime.INSTANCE : new ObjectWriterImplOffsetTime(beanInfo.format, beanInfo.locale);
            }
            if (Instant.class == cls2) {
                return (beanInfo.format == null && beanInfo.locale == null) ? ObjectWriterImplInstant.INSTANCE : new ObjectWriterImplInstant(beanInfo.format, beanInfo.locale);
            }
            if (Duration.class == cls2 || Period.class == cls2) {
                return ObjectWriterImplToString.INSTANCE;
            }
            int i11 = 4;
            if (StackTraceElement.class == cls2) {
                if (STACK_TRACE_ELEMENT_WRITER == null) {
                    STACK_TRACE_ELEMENT_WRITER = new ObjectWriterAdapter(StackTraceElement.class, null, null, 0L, Arrays.asList(ObjectWriters.fieldWriter("fileName", String.class, new C0640b(2)), ObjectWriters.fieldWriter("lineNumber", new C0070a(i11)), ObjectWriters.fieldWriter("className", String.class, new C0640b(5)), ObjectWriters.fieldWriter("methodName", String.class, new C0640b(6))));
                }
                return STACK_TRACE_ELEMENT_WRITER;
            }
            if (Class.class == cls2) {
                return ObjectWriterImplClass.INSTANCE;
            }
            if (Method.class == cls2) {
                return new ObjectWriterAdapter(Method.class, null, null, 0L, Arrays.asList(ObjectWriters.fieldWriter("declaringClass", Class.class, new C0640b(7)), ObjectWriters.fieldWriter("name", String.class, new C0640b(8)), ObjectWriters.fieldWriter("parameterTypes", Class[].class, new C0640b(9))));
            }
            if (Field.class == cls2) {
                return new ObjectWriterAdapter(Method.class, null, null, 0L, Arrays.asList(ObjectWriters.fieldWriter("declaringClass", Class.class, new C0073d(29)), ObjectWriters.fieldWriter("name", String.class, new C0640b(i9))));
            }
            if (ParameterizedType.class.isAssignableFrom(cls2)) {
                return ObjectWriters.objectWriter(ParameterizedType.class, ObjectWriters.fieldWriter("actualTypeArguments", Type[].class, new C0640b(i10)), ObjectWriters.fieldWriter("ownerType", Type.class, new C0640b(3)), ObjectWriters.fieldWriter("rawType", Type.class, new C0640b(i11)));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void mixIn(Class cls, Class cls2) {
        ConcurrentMap<Class, Class> concurrentMap = this.mixInCache;
        if (cls2 == null) {
            concurrentMap.remove(cls);
        } else {
            concurrentMap.put(cls, cls2);
        }
        this.cache.remove(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter register(Type type, ObjectWriter objectWriter, boolean z9) {
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
            long j3 = this.userDefineMask;
            if (objectWriter == null) {
                this.userDefineMask = j3 & (-33);
            } else {
                this.userDefineMask = j3 | 32;
            }
        }
        return objectWriter == null ? z9 ? this.cacheFieldBased.remove(type) : this.cache.remove(type) : z9 ? this.cacheFieldBased.put(type, objectWriter) : this.cache.put(type, objectWriter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter registerIfAbsent(Type type, ObjectWriter objectWriter) {
        ObjectWriter objectWriter2 = this.cache.get(type);
        if (objectWriter2 == null) {
            this.cache.put(type, objectWriter);
        }
        return objectWriter2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter unregister(Type type) {
        return this.cache.remove(type);
    }

    public boolean unregister(Type type, ObjectWriter objectWriter) {
        return this.cache.remove(type, objectWriter);
    }

    public ObjectWriterProvider() {
        this((PropertyNamingStrategy) null);
    }

    public ObjectWriterProvider(ObjectWriterCreator objectWriterCreator) {
        this.cache = new ConcurrentHashMap();
        this.cacheFieldBased = new ConcurrentHashMap();
        this.mixInCache = new ConcurrentHashMap();
        this.creator = objectWriterCreator;
        this.namingStrategy = null;
    }

    public void cleanup(Class cls) {
        this.mixInCache.remove(cls);
        this.cache.remove(cls);
        this.cacheFieldBased.remove(cls);
        BeanUtils.cleanupCache(cls);
    }

    public ObjectWriter register(Type type, ObjectWriter objectWriter) {
        return register(type, objectWriter, false);
    }

    public void getFieldInfo(BeanInfo beanInfo, FieldInfo fieldInfo, Class cls, Method method) {
        Field field;
        Method declaredMethod;
        Class cls2 = this.mixInCache.get(cls);
        String name = method.getName();
        if (cls2 != null && cls2 != cls) {
            try {
                declaredMethod = cls2.getDeclaredMethod(name, method.getParameterTypes());
            } catch (Exception unused) {
                declaredMethod = null;
            }
            if (declaredMethod != null) {
                getFieldInfo(beanInfo, fieldInfo, cls2, declaredMethod);
            }
        }
        if (this.mixInCache.get(method.getReturnType()) != null) {
            fieldInfo.fieldClassMixIn = true;
        }
        int i9 = 0;
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            Method method2 = BeanUtils.getMethod(superclass, method);
            if (method2 != null) {
                getFieldInfo(beanInfo, fieldInfo, superclass, method2);
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                Method method3 = BeanUtils.getMethod(cls3, method);
                if (method3 != null) {
                    getFieldInfo(beanInfo, fieldInfo, superclass, method3);
                }
            }
        }
        processAnnotations(fieldInfo, method.getDeclaredAnnotations());
        if (!cls.getName().startsWith("java.lang", 0) && (field = BeanUtils.getField(cls, method)) != null) {
            fieldInfo.features |= FieldInfo.FIELD_MASK;
            getFieldInfo(beanInfo, fieldInfo, cls, field);
        }
        boolean z9 = beanInfo.kotlin;
        if (!z9 || beanInfo.creatorConstructor == null || beanInfo.createParameterNames == null) {
            return;
        }
        String str = BeanUtils.getterName(method, z9, null);
        while (true) {
            String[] strArr = beanInfo.createParameterNames;
            if (i9 >= strArr.length) {
                return;
            }
            if (str.equals(strArr[i9])) {
                Annotation[][] parameterAnnotations = beanInfo.creatorConstructor.getParameterAnnotations();
                if (i9 < parameterAnnotations.length) {
                    processAnnotations(fieldInfo, parameterAnnotations[i9]);
                    return;
                }
            }
            i9++;
        }
    }

    public ObjectWriter getObjectWriter(Type type, Class cls) {
        return getObjectWriter(type, cls, false);
    }

    public ObjectWriter getObjectWriter(Type type) {
        return getObjectWriter(type, TypeUtils.getClass(type), false);
    }

    public ObjectWriter getObjectWriter(Class cls) {
        return getObjectWriter(cls, cls, false);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class VoidObjectWriter implements ObjectWriter {
        public static final VoidObjectWriter INSTANCE = new VoidObjectWriter();

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        }
    }
}
