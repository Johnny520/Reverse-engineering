package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.ObjBoolConsumer;
import com.alibaba.fastjson2.function.ObjByteConsumer;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import com.alibaba.fastjson2.function.ObjFloatConsumer;
import com.alibaba.fastjson2.function.ObjShortConsumer;
import com.alibaba.fastjson2.function.ToByteFunction;
import com.alibaba.fastjson2.function.ToCharFunction;
import com.alibaba.fastjson2.function.ToFloatFunction;
import com.alibaba.fastjson2.function.ToShortFunction;
import com.alibaba.fastjson2.introspect.PropertyAccessor;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactory;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.JdbcSupport;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldReader<T> implements Comparable<FieldReader> {
    public final Object defaultValue;
    public final long features;
    public final Field field;
    public final Class fieldClass;
    final boolean fieldClassSerializable;
    public final String fieldName;
    final long fieldNameHash;
    final long fieldNameHashLCase;
    protected final long fieldOffset;
    public final Type fieldType;
    public final String format;
    final BiConsumer function;
    Class itemClass;
    volatile ObjectReader itemReader;
    Type itemType;
    public final Locale locale;
    public final Method method;
    final boolean noneStaticMemberClass;
    public final int ordinal;
    final String paramName;
    final long paramNameHash;
    final Parameter parameter;
    protected final PropertyAccessor propertyAccessor;
    final boolean readOnly;
    volatile ObjectReader reader;
    volatile JSONPath referenceCache;
    public final JSONSchema schema;

    public FieldReader(String str, Type type, Class cls, int i10, long j10, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, Object obj2, String str3, Parameter parameter) {
        this.fieldName = str;
        this.fieldType = type;
        this.fieldClass = cls;
        boolean z10 = false;
        this.fieldClassSerializable = cls != null && (Serializable.class.isAssignableFrom(cls) || Modifier.isInterface(cls.getModifiers()) || BeanUtils.isRecord(cls) || cls.isPrimitive());
        this.features = j10;
        this.fieldNameHash = Fnv.hashCode64(str);
        this.fieldNameHashLCase = Fnv.hashCode64LCase(str);
        this.ordinal = i10;
        this.format = str2;
        this.locale = locale;
        this.defaultValue = obj;
        this.schema = jSONSchema;
        this.method = method;
        this.field = field;
        this.paramName = str3;
        this.paramNameHash = str3 != null ? Fnv.hashCode64(str3) : 0L;
        this.parameter = parameter;
        if ((method != null && method.getParameterCount() == 0) || (field != null && Modifier.isFinal(field.getModifiers()))) {
            z10 = true;
        }
        this.readOnly = z10;
        this.propertyAccessor = createPropertyAccessor(str, type, cls, method, field, obj2, jSONSchema);
        Class<?> declaringClass = null;
        this.function = obj2 instanceof BiConsumer ? (BiConsumer) obj2 : null;
        long jObjectFieldOffset = (field == null || (j10 & FieldInfo.DISABLE_UNSAFE) != 0) ? -1L : JDKUtils.UNSAFE.objectFieldOffset(field);
        this.fieldOffset = jObjectFieldOffset;
        if (jObjectFieldOffset == -1 && field != null && method == null) {
            try {
                field.setAccessible(true);
            } catch (Throwable th) {
                JDKUtils.setReflectErrorLast(th);
            }
        }
        if (method != null) {
            declaringClass = method.getDeclaringClass();
        } else if (field != null) {
            declaringClass = field.getDeclaringClass();
        }
        this.noneStaticMemberClass = BeanUtils.isNoneStaticMemberClass(declaringClass, cls);
    }

    public static ObjectReader createFormattedObjectReader(Type type, Class cls, String str, Locale locale) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String typeName = type.getTypeName();
        typeName.getClass();
        switch (typeName) {
            case "byte[]":
            case "[B":
                return new ObjectReaderImplInt8Array(str);
            case "java.sql.Date":
                return JdbcSupport.createDateReader((Class) type, str, locale);
            case "java.sql.Time":
                return JdbcSupport.createTimeReader((Class) type, str, locale);
            case "java.sql.Timestamp":
                return JdbcSupport.createTimestampReader((Class) type, str, locale);
            default:
                if (Calendar.class.isAssignableFrom(cls)) {
                    return ObjectReaderImplCalendar.m6366of(str, locale);
                }
                if (cls == ZonedDateTime.class) {
                    return ObjectReaderImplZonedDateTime.m6399of(str, locale);
                }
                if (cls == LocalDateTime.class) {
                    return new ObjectReaderImplLocalDateTime(str, locale);
                }
                if (cls == LocalDate.class) {
                    return ObjectReaderImplLocalDate.m6386of(str, locale);
                }
                if (cls == LocalTime.class) {
                    return new ObjectReaderImplLocalTime(str, locale);
                }
                if (cls == Instant.class) {
                    return ObjectReaderImplInstant.m6369of(str, locale);
                }
                if (cls == OffsetTime.class) {
                    return ObjectReaderImplOffsetTime.m6391of(str, locale);
                }
                if (cls == OffsetDateTime.class) {
                    return ObjectReaderImplOffsetDateTime.m6390of(str, locale);
                }
                if (cls == Optional.class) {
                    return ObjectReaderImplOptional.m6392of(type, str, locale);
                }
                if (cls == Date.class) {
                    return ObjectReaderImplDate.m6367of(str, locale);
                }
                return null;
        }
    }

    private PropertyAccessor createPropertyAccessor(String str, Type type, Class cls, Method method, Field field, Object obj, JSONSchema jSONSchema) {
        PropertyAccessorFactory propertyAccessorFactory = JSONFactory.PROPERTY_ACCESSOR_FACTORY;
        BiFunction<PropertyAccessor, Throwable, RuntimeException> biFunction = new BiFunction() { // from class: com.alibaba.fastjson2.reader.o
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                return FieldReader.m6316u((PropertyAccessor) obj2, (Throwable) obj3);
            }
        };
        PropertyAccessor propertyAccessorCreate = obj instanceof BiConsumer ? propertyAccessorFactory.create(str, (Class<?>) cls, type, (Function) null, (BiConsumer) obj, biFunction) : obj instanceof ObjDoubleConsumer ? propertyAccessorFactory.create(str, (ToDoubleFunction) null, (ObjDoubleConsumer) obj) : obj instanceof ObjBoolConsumer ? propertyAccessorFactory.create(str, (Predicate) null, (ObjBoolConsumer) obj) : obj instanceof ObjFloatConsumer ? propertyAccessorFactory.create(str, (ToFloatFunction) null, (ObjFloatConsumer) obj) : obj instanceof ObjByteConsumer ? propertyAccessorFactory.create(str, (ToByteFunction) null, (ObjByteConsumer) obj) : obj instanceof ObjIntConsumer ? propertyAccessorFactory.create(str, (ToIntFunction) null, (ObjIntConsumer) obj) : obj instanceof ObjLongConsumer ? propertyAccessorFactory.create(str, (ToLongFunction) null, (ObjLongConsumer) obj) : obj instanceof ObjCharConsumer ? propertyAccessorFactory.create(str, (ToCharFunction) null, (ObjCharConsumer) obj) : obj instanceof ObjShortConsumer ? propertyAccessorFactory.create(str, (ToShortFunction) null, (ObjShortConsumer) obj) : obj instanceof Function ? propertyAccessorFactory.create(str, (Class<?>) cls, type, (Function) obj, (BiConsumer) null) : method != null ? propertyAccessorFactory.create(method, biFunction) : field != null ? propertyAccessorFactory.create(field) : null;
        return jSONSchema != null ? schema(propertyAccessorCreate, jSONSchema) : propertyAccessorCreate;
    }

    private String getActualFieldName(FieldReader fieldReader) {
        String name = fieldReader.method.getName();
        return fieldReader.isReadOnly() ? BeanUtils.getterName(name, PropertyNamingStrategy.CamelCase.name()) : BeanUtils.setterName(name, PropertyNamingStrategy.CamelCase.name());
    }

    private boolean needCompareToActualFieldClass(Class cls) {
        return cls.isEnum() || cls.isInterface();
    }

    private static PropertyAccessor schema(PropertyAccessor propertyAccessor, final JSONSchema jSONSchema) {
        PropertyAccessorFactory propertyAccessorFactory = JSONFactory.PROPERTY_ACCESSOR_FACTORY;
        Class<?> clsPropertyClass = propertyAccessor.propertyClass();
        return clsPropertyClass == Boolean.TYPE ? propertyAccessorFactory.create(propertyAccessor, (ObjBoolConsumer) null, new ObjBoolConsumer() { // from class: com.alibaba.fastjson2.reader.m
            @Override // com.alibaba.fastjson2.function.ObjBoolConsumer
            public final void accept(Object obj, boolean z10) {
                jSONSchema.assertValidate(Boolean.valueOf(z10));
            }
        }) : clsPropertyClass == Boolean.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.e
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : clsPropertyClass == Byte.TYPE ? propertyAccessorFactory.create(propertyAccessor, (ObjByteConsumer) null, new ObjByteConsumer() { // from class: com.alibaba.fastjson2.reader.f
            @Override // com.alibaba.fastjson2.function.ObjByteConsumer
            public final void accept(Object obj, byte b10) {
                jSONSchema.assertValidate((long) b10);
            }
        }) : clsPropertyClass == Byte.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.g
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : clsPropertyClass == Character.TYPE ? propertyAccessorFactory.create(propertyAccessor, (ObjCharConsumer) null, new ObjCharConsumer() { // from class: com.alibaba.fastjson2.reader.h
            @Override // com.alibaba.fastjson2.function.ObjCharConsumer
            public final void accept(Object obj, char c10) {
                jSONSchema.assertValidate((long) c10);
            }
        }) : clsPropertyClass == Character.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.i
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : clsPropertyClass == Short.TYPE ? propertyAccessorFactory.create(propertyAccessor, (ObjShortConsumer) null, new ObjShortConsumer() { // from class: com.alibaba.fastjson2.reader.j
            @Override // com.alibaba.fastjson2.function.ObjShortConsumer
            public final void accept(Object obj, short s10) {
                jSONSchema.assertValidate((long) s10);
            }
        }) : clsPropertyClass == Short.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.k
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : clsPropertyClass == Integer.TYPE ? propertyAccessorFactory.create(propertyAccessor, (ObjIntConsumer) null, new ObjIntConsumer() { // from class: com.alibaba.fastjson2.reader.l
            @Override // java.util.function.ObjIntConsumer
            public final void accept(Object obj, int i10) {
                jSONSchema.assertValidate((long) i10);
            }
        }) : clsPropertyClass == Integer.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.n
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : clsPropertyClass == Long.TYPE ? propertyAccessorFactory.create(propertyAccessor, (ObjLongConsumer) null, new ObjLongConsumer() { // from class: com.alibaba.fastjson2.reader.p
            @Override // java.util.function.ObjLongConsumer
            public final void accept(Object obj, long j10) {
                jSONSchema.assertValidate(j10);
            }
        }) : clsPropertyClass == Long.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.q
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : clsPropertyClass == Float.TYPE ? propertyAccessorFactory.create(propertyAccessor, (ObjFloatConsumer) null, new ObjFloatConsumer() { // from class: com.alibaba.fastjson2.reader.r
            @Override // com.alibaba.fastjson2.function.ObjFloatConsumer
            public final void accept(Object obj, float f10) {
                jSONSchema.assertValidate(f10);
            }
        }) : clsPropertyClass == Float.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.s
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : clsPropertyClass == Double.TYPE ? propertyAccessorFactory.create(propertyAccessor, (ObjDoubleConsumer) null, new ObjDoubleConsumer() { // from class: com.alibaba.fastjson2.reader.t
            @Override // java.util.function.ObjDoubleConsumer
            public final void accept(Object obj, double d10) {
                jSONSchema.assertValidate(d10);
            }
        }) : clsPropertyClass == Double.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.u
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : clsPropertyClass == String.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.v
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : clsPropertyClass == BigInteger.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.w
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : clsPropertyClass == BigDecimal.class ? propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.c
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        }) : propertyAccessorFactory.create(propertyAccessor, (BiConsumer) null, new BiConsumer() { // from class: com.alibaba.fastjson2.reader.d
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                jSONSchema.assertValidate(obj2);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ RuntimeException m6316u(PropertyAccessor propertyAccessor, Throwable th) {
        return new JSONException("set PropertyAccessor failed: " + propertyAccessor.name() + ", " + th);
    }

    public abstract void accept(T t10, Object obj);

    public void accept(T t10, boolean z10) {
        accept(t10, Boolean.valueOf(z10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void acceptAny(T r12, java.lang.Object r13, long r14) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.FieldReader.acceptAny(java.lang.Object, java.lang.Object, long):void");
    }

    public void acceptDefaultValue(T t10) {
        Object obj = this.defaultValue;
        if (obj != null) {
            accept(t10, obj);
        }
    }

    public void addResolveTask(JSONReader jSONReader, Object obj, String str) {
        JSONPath jSONPathM6205of;
        if (this.referenceCache == null || !this.referenceCache.toString().equals(str)) {
            jSONPathM6205of = JSONPath.m6205of(str);
            this.referenceCache = jSONPathM6205of;
        } else {
            jSONPathM6205of = this.referenceCache;
        }
        jSONReader.addResolveTask(this, obj, jSONPathM6205of);
    }

    public boolean belongTo(Class cls) {
        Field field = this.field;
        if (field != null && field.getDeclaringClass() == cls) {
            return true;
        }
        Method method = this.method;
        return method != null && method.getDeclaringClass().isAssignableFrom(cls);
    }

    public ObjectReader checkObjectAutoType(JSONReader jSONReader) {
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldReader fieldReader) {
        Class<?> superclass;
        Class<?> superclass2;
        Class<?> type;
        Class<?> declaringClass;
        Class<?> declaringClass2;
        int iCompareTo = this.fieldName.compareTo(fieldReader.fieldName);
        if (iCompareTo != 0) {
            int i10 = this.ordinal;
            int i11 = fieldReader.ordinal;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            return iCompareTo;
        }
        int i12 = isReadOnly() == fieldReader.isReadOnly() ? 0 : isReadOnly() ? 1 : -1;
        if (i12 == 0) {
            Member member = this.field;
            if (member == null) {
                member = this.method;
            }
            Member member2 = fieldReader.field;
            if (member2 == null) {
                member2 = fieldReader.method;
            }
            if (member != null && member2 != null && member.getClass() != member2.getClass() && (declaringClass2 = member.getDeclaringClass()) != (declaringClass = member2.getDeclaringClass())) {
                if (declaringClass2.isAssignableFrom(declaringClass)) {
                    return 1;
                }
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    return -1;
                }
            }
            Field field = this.field;
            if (field != null && fieldReader.field != null) {
                Class<?> declaringClass3 = field.getDeclaringClass();
                Class<?> declaringClass4 = fieldReader.field.getDeclaringClass();
                for (Class<? super Object> superclass3 = declaringClass3.getSuperclass(); superclass3 != null && superclass3 != Object.class; superclass3 = superclass3.getSuperclass()) {
                    if (superclass3 == declaringClass4) {
                        return 1;
                    }
                }
                do {
                    declaringClass4 = declaringClass4.getSuperclass();
                    if (declaringClass4 == null || declaringClass4 == Object.class) {
                    }
                } while (declaringClass4 != declaringClass3);
                return -1;
            }
            Method method = this.method;
            if (method != null && fieldReader.method != null) {
                Class<?> declaringClass5 = method.getDeclaringClass();
                Class<?> declaringClass6 = fieldReader.method.getDeclaringClass();
                if (declaringClass5 != declaringClass6) {
                    for (Class<? super Object> superclass4 = declaringClass5.getSuperclass(); superclass4 != null && superclass4 != Object.class; superclass4 = superclass4.getSuperclass()) {
                        if (superclass4 == declaringClass6) {
                            return -1;
                        }
                    }
                    for (Class<? super Object> superclass5 = declaringClass6.getSuperclass(); superclass5 != null && superclass5 != Object.class; superclass5 = superclass5.getSuperclass()) {
                        if (superclass5 == declaringClass5) {
                            return 1;
                        }
                    }
                }
                if (this.method.getParameterCount() == 1 && fieldReader.method.getParameterCount() == 1 && (superclass = this.method.getParameterTypes()[0]) != (superclass2 = fieldReader.method.getParameterTypes()[0])) {
                    if (superclass.isAssignableFrom(superclass2)) {
                        return 1;
                    }
                    if (superclass2.isAssignableFrom(superclass)) {
                        return -1;
                    }
                    if (Collection.class.isAssignableFrom(superclass2) && !Collection.class.isAssignableFrom(superclass)) {
                        return 1;
                    }
                    if (Collection.class.isAssignableFrom(superclass) && !Collection.class.isAssignableFrom(superclass2)) {
                        return -1;
                    }
                    if (needCompareToActualFieldClass(superclass) || needCompareToActualFieldClass(superclass2)) {
                        try {
                            type = declaringClass5.getDeclaredField(this.fieldName).getType();
                            if (type == null) {
                                try {
                                    type = declaringClass6.getDeclaredField(this.fieldName).getType();
                                } catch (NoSuchFieldException unused) {
                                }
                            }
                        } catch (NoSuchFieldException unused2) {
                            type = null;
                        }
                        if (type != null) {
                            while (superclass != null && superclass != Object.class) {
                                if (superclass == type) {
                                    return -1;
                                }
                                superclass = superclass.getSuperclass();
                            }
                            while (superclass2 != null && superclass2 != Object.class) {
                                if (superclass2 == type) {
                                    return 1;
                                }
                                superclass2 = superclass2.getSuperclass();
                            }
                        }
                    }
                    JSONField jSONField = (JSONField) BeanUtils.findAnnotation(this.method, JSONField.class);
                    JSONField jSONField2 = (JSONField) BeanUtils.findAnnotation(fieldReader.method, JSONField.class);
                    boolean z10 = jSONField != null;
                    if (z10 == (jSONField2 == null)) {
                        return z10 ? -1 : 1;
                    }
                }
                String name = this.method.getName();
                String name2 = fieldReader.method.getName();
                if (!name.equals(name2)) {
                    boolean zStartsWith = name.startsWith("set");
                    if (zStartsWith != name2.startsWith("set")) {
                        return zStartsWith ? -1 : 1;
                    }
                    String str = BeanUtils.setterName(name, (String) null);
                    String str2 = BeanUtils.setterName(name2, (String) null);
                    boolean zEquals = this.fieldName.equals(str);
                    if (zEquals != fieldReader.fieldName.equals(str2)) {
                        return zEquals ? 1 : -1;
                    }
                }
            }
            ObjectReader initReader = getInitReader();
            ObjectReader initReader2 = fieldReader.getInitReader();
            if (initReader != null && initReader2 == null) {
                return -1;
            }
            if (initReader == null && initReader2 != null) {
                return 1;
            }
            Class cls = this.fieldClass;
            Class cls2 = fieldReader.fieldClass;
            boolean zIsPrimitive = cls.isPrimitive();
            boolean zIsPrimitive2 = cls2.isPrimitive();
            if (zIsPrimitive && !zIsPrimitive2) {
                return -1;
            }
            if (!zIsPrimitive && zIsPrimitive2) {
                return 1;
            }
            boolean zStartsWith2 = cls.getName().startsWith("java.");
            boolean zStartsWith3 = cls2.getName().startsWith("java.");
            if (zStartsWith2 && !zStartsWith3) {
                return -1;
            }
            if (!zStartsWith2 && zStartsWith3) {
                return 1;
            }
        }
        return i12;
    }

    public BiConsumer getFunction() {
        return null;
    }

    public ObjectReader getInitReader() {
        return null;
    }

    public Class getItemClass() {
        Type type = this.itemType;
        if (type == null) {
            return null;
        }
        if (this.itemClass == null) {
            this.itemClass = TypeUtils.getClass(type);
        }
        return this.itemClass;
    }

    public long getItemClassHash() {
        Class itemClass = getItemClass();
        if (itemClass == null) {
            return 0L;
        }
        return Fnv.hashCode64(itemClass.getName());
    }

    public ObjectReader getItemObjectReader(JSONReader.Context context) {
        if (this.itemReader != null) {
            return this.itemReader;
        }
        ObjectReader objectReader = context.getObjectReader(this.itemType);
        this.itemReader = objectReader;
        return objectReader;
    }

    public Type getItemType() {
        return this.itemType;
    }

    public ObjectReader getObjectReader(ObjectReaderProvider objectReaderProvider) {
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReader = objectReaderProvider.getObjectReader(this.fieldType, (this.features & JSONReader.Feature.FieldBased.mask) != 0);
        this.reader = objectReader;
        return objectReader;
    }

    public final boolean isParameter() {
        return this.paramNameHash != 0;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public boolean isUnwrapped() {
        return (this.features & FieldInfo.UNWRAPPED_MASK) != 0;
    }

    public void processExtra(JSONReader jSONReader, Object obj) {
        jSONReader.skipValue();
    }

    public abstract Object readFieldValue(JSONReader jSONReader);

    public abstract void readFieldValue(JSONReader jSONReader, T t10);

    public void readFieldValueJSONB(JSONReader jSONReader, T t10) {
        readFieldValue(jSONReader, t10);
    }

    public boolean sameTo(FieldReader fieldReader) {
        Field field = this.field;
        if (field != null) {
            String name = field.getName();
            Field field2 = fieldReader.field;
            if (field2 != null && name.equals(field2.getName())) {
                return true;
            }
            if (fieldReader.method != null && name.equals(getActualFieldName(fieldReader))) {
                return true;
            }
        }
        if (this.method != null) {
            String actualFieldName = getActualFieldName(this);
            if (fieldReader.method != null) {
                String actualFieldName2 = getActualFieldName(fieldReader);
                if (actualFieldName != null && actualFieldName.equals(actualFieldName2)) {
                    return true;
                }
            }
            Field field3 = fieldReader.field;
            if (field3 != null && actualFieldName != null && actualFieldName.equals(field3.getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean supportAcceptType(Class cls) {
        return this.fieldClass == cls;
    }

    public String toString() {
        Member member = this.method;
        if (member == null) {
            member = this.field;
        }
        return member != null ? member.getName() : this.fieldName;
    }

    public void accept(T t10, byte b10) {
        accept(t10, Byte.valueOf(b10));
    }

    public void accept(T t10, short s10) {
        accept(t10, Short.valueOf(s10));
    }

    public void accept(T t10, int i10) {
        accept(t10, Integer.valueOf(i10));
    }

    public void accept(T t10, long j10) {
        accept(t10, Long.valueOf(j10));
    }

    public void accept(T t10, char c10) {
        accept(t10, Character.valueOf(c10));
    }

    public void accept(T t10, float f10) {
        accept(t10, Float.valueOf(f10));
    }

    public void accept(T t10, double d10) {
        accept(t10, Double.valueOf(d10));
    }

    public ObjectReader getItemObjectReader(JSONReader jSONReader) {
        return getItemObjectReader(jSONReader.getContext());
    }

    public void addResolveTask(JSONReader jSONReader, List list, int i10, String str) {
        jSONReader.addResolveTask(list, i10, JSONPath.m6205of(str));
    }

    public ObjectReader getObjectReader(JSONReader.Context context) {
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReader = context.getObjectReader(this.fieldType);
        this.reader = objectReader;
        return objectReader;
    }

    public ObjectReader getObjectReader(JSONReader jSONReader) {
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReader = jSONReader.getObjectReader(this.fieldType);
        this.reader = objectReader;
        return objectReader;
    }

    public void acceptExtra(Object obj, String str, Object obj2) {
    }

    public FieldReader(String str, Type type, Class cls, int i10, long j10, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field) {
        this(str, type, cls, i10, j10, str2, locale, obj, jSONSchema, method, field, null, null, null);
    }
}
