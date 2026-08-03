package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.codec.FieldInfo;
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
import java.lang.reflect.Type;
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
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
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
    Class itemClass;
    volatile ObjectReader itemReader;
    Type itemType;
    public final Locale locale;
    public final Method method;
    final boolean noneStaticMemberClass;
    public final int ordinal;
    final boolean readOnly;
    volatile ObjectReader reader;
    volatile JSONPath referenceCache;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReader(String str, Type type, Class cls, int i9, long j3, String str2, Locale locale, Object obj, Method method, Field field) {
        this.fieldName = str;
        this.fieldType = type;
        this.fieldClass = cls;
        boolean zIsNoneStaticMemberClass = false;
        this.fieldClassSerializable = cls != null && (cls.isPrimitive() || cls == String.class || cls == List.class || Serializable.class.isAssignableFrom(cls) || Modifier.isInterface(cls.getModifiers()));
        this.features = j3;
        this.fieldNameHash = Fnv.hashCode64(str);
        this.fieldNameHashLCase = Fnv.hashCode64LCase(str);
        this.ordinal = i9;
        this.format = str2;
        this.locale = locale;
        this.defaultValue = obj;
        this.method = method;
        this.field = field;
        this.readOnly = (field != null && Modifier.isFinal(field.getModifiers())) || (FieldInfo.READ_ONLY & j3) != 0;
        long jObjectFieldOffset = (field == null || (j3 & FieldInfo.DISABLE_UNSAFE) != 0) ? -1L : JDKUtils.UNSAFE.objectFieldOffset(field);
        this.fieldOffset = jObjectFieldOffset;
        if (jObjectFieldOffset == -1 && field != null && method == null) {
            try {
                field.setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        if (cls != null && !cls.isPrimitive() && cls != String.class && cls != List.class && cls != Map.class && !cls.isEnum()) {
            zIsNoneStaticMemberClass = BeanUtils.isNoneStaticMemberClass(method != null ? method.getDeclaringClass() : field != null ? field.getDeclaringClass() : null, cls);
        }
        this.noneStaticMemberClass = zIsNoneStaticMemberClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectReader createFormattedObjectReader(Type type, Class cls, String str, Locale locale) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String typeName = TypeUtils.getTypeName(type);
        typeName.getClass();
        switch (typeName) {
            case "byte[]":
            case "[B":
                return new ObjectReaderImplInt8Array(str);
            case "java.sql.Date":
                return new JdbcSupport.DateReader(str, locale);
            case "java.sql.Time":
                return new JdbcSupport.TimeReader(str, locale);
            case "java.sql.Timestamp":
                return new JdbcSupport.TimestampReader(str, locale);
            default:
                if (Calendar.class.isAssignableFrom(cls)) {
                    return ObjectReaderImplCalendar.m1710of(str, locale);
                }
                if (cls == Date.class) {
                    return ObjectReaderImplDate.m1711of(str, locale);
                }
                if (cls == ZonedDateTime.class) {
                    return ObjectReaderImplZonedDateTime.m1742of(str, locale);
                }
                if (cls == LocalDateTime.class) {
                    return new ObjectReaderImplLocalDateTime(str, locale);
                }
                if (cls == LocalDate.class) {
                    return ObjectReaderImplLocalDate.m1729of(str, locale);
                }
                if (cls == LocalTime.class) {
                    return new ObjectReaderImplLocalTime(str, locale);
                }
                if (cls == Instant.class) {
                    return ObjectReaderImplInstant.m1713of(str, locale);
                }
                if (cls == OffsetTime.class) {
                    return ObjectReaderImplOffsetTime.m1734of(str, locale);
                }
                if (cls == OffsetDateTime.class) {
                    return ObjectReaderImplOffsetDateTime.m1733of(str, locale);
                }
                if (cls == Optional.class) {
                    return ObjectReaderImplOptional.m1735of(type, str, locale);
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean needCompareToActualFieldClass(Class cls) {
        return cls.isEnum() || cls.isInterface();
    }

    public abstract void accept(T t9, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void accept(T t9, boolean z9) {
        accept(t9, Boolean.valueOf(z9));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v11, resolved type: java.util.function.Function */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void acceptAny(T t9, Object obj, long j3) {
        Object object;
        boolean z9;
        Class cls;
        Object objValueOf;
        Function typeConvert;
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        if (obj != null) {
            Class<?> cls2 = obj.getClass();
            if (supportAcceptType(cls2)) {
                object = obj;
                z9 = true;
            } else {
                if (cls2 != String.class) {
                    if (cls2 == Integer.class && (((cls = this.fieldClass) == Boolean.TYPE || cls == Boolean.class) && (JSONReader.Feature.NonZeroNumberCastToBooleanAsTrue.mask & j3) != 0)) {
                        objValueOf = Boolean.valueOf(((Integer) obj).intValue() != 0);
                    }
                    z9 = true;
                    Class<?> cls3 = this.fieldClass;
                    if (cls2 == cls3) {
                    }
                } else if (this.fieldClass == Date.class) {
                    objValueOf = obj;
                    z9 = false;
                    Class<?> cls32 = this.fieldClass;
                    object = (cls2 == cls32 || !z9 || (typeConvert = objectReaderProvider.getTypeConvert(cls2, cls32)) == 0) ? objValueOf : typeConvert.apply(objValueOf);
                }
                objValueOf = obj;
                z9 = true;
                Class<?> cls322 = this.fieldClass;
                if (cls2 == cls322) {
                }
            }
        }
        if (object != null && this.fieldType != object.getClass()) {
            if (object instanceof JSONObject) {
                JSONReader.Feature feature = JSONReader.Feature.SupportSmartMatch;
                object = ((JSONObject) object).m1655to(this.fieldType, (j3 & feature.mask) != 0 ? new JSONReader.Feature[]{feature} : new JSONReader.Feature[0]);
            } else if (object instanceof JSONArray) {
                object = ((JSONArray) object).m1639to(this.fieldType, j3);
            } else if (j3 == 0 && !this.fieldClass.isInstance(object) && this.format == null) {
                ObjectReader initReader = getInitReader();
                object = initReader != null ? initReader.readObject(JSONReader.m1666of(JSON.toJSONString(object)), null, null, j3) : TypeUtils.cast(object, this.fieldClass, objectReaderProvider);
            } else if (z9) {
                JSONReader jSONReaderM1669of = JSONReader.m1669of(JSON.toJSONString(object), JSONFactory.createReadContext(j3));
                try {
                    object = getObjectReader(jSONReaderM1669of).readObject(jSONReaderM1669of, null, this.fieldName, j3);
                    if (jSONReaderM1669of != null) {
                        jSONReaderM1669of.close();
                    }
                } finally {
                }
            }
        }
        accept(t9, object);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void acceptDefaultValue(T t9) {
        Object obj = this.defaultValue;
        if (obj != null) {
            accept(t9, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addResolveTask(JSONReader jSONReader, Object obj, String str) {
        JSONPath jSONPathM1657of;
        if (this.referenceCache == null || !this.referenceCache.toString().equals(str)) {
            jSONPathM1657of = JSONPath.m1657of(str);
            this.referenceCache = jSONPathM1657of;
        } else {
            jSONPathM1657of = this.referenceCache;
        }
        jSONReader.addResolveTask(this, obj, jSONPathM1657of);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader checkObjectAutoType(JSONReader jSONReader) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(FieldReader fieldReader) {
        Class<?> superclass;
        Class<?> superclass2;
        Class<?> type;
        Class<?> declaringClass;
        Class<?> declaringClass2;
        int iCompareTo = this.fieldName.compareTo(fieldReader.fieldName);
        if (iCompareTo != 0) {
            int i9 = this.ordinal;
            int i10 = fieldReader.ordinal;
            if (i9 < i10) {
                return -1;
            }
            if (i9 > i10) {
                return 1;
            }
            return iCompareTo;
        }
        int i11 = isReadOnly() == fieldReader.isReadOnly() ? 0 : isReadOnly() ? 1 : -1;
        if (i11 == 0) {
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
                Class<?>[] parameterTypes = this.method.getParameterTypes();
                Class<?>[] parameterTypes2 = fieldReader.method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes2.length == 1 && (superclass = parameterTypes[0]) != (superclass2 = parameterTypes2[0])) {
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
                    if (jSONField != null && jSONField2 == null) {
                        return -1;
                    }
                    if (jSONField == null && jSONField2 != null) {
                        return 1;
                    }
                }
                String name = this.method.getName();
                String name2 = fieldReader.method.getName();
                if (!name.equals(name2)) {
                    String str = BeanUtils.setterName(name, (String) null);
                    String str2 = BeanUtils.setterName(name2, (String) null);
                    if (this.fieldName.equals(str) && !fieldReader.fieldName.equals(str2)) {
                        return 1;
                    }
                    if (fieldReader.fieldName.equals(str2) && !this.fieldName.equals(str)) {
                        return -1;
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
            boolean zStartsWith = cls.getName().startsWith("java.", 0);
            boolean zStartsWith2 = cls2.getName().startsWith("java.", 0);
            if (zStartsWith && !zStartsWith2) {
                return -1;
            }
            if (!zStartsWith && zStartsWith2) {
                return 1;
            }
        }
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader getInitReader() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getItemClassHash() {
        Class itemClass = getItemClass();
        if (itemClass == null) {
            return 0L;
        }
        return Fnv.hashCode64(itemClass.getName());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader getItemObjectReader(JSONReader.Context context) {
        if (this.itemReader != null) {
            return this.itemReader;
        }
        ObjectReader objectReader = context.getObjectReader(this.itemType);
        this.itemReader = objectReader;
        return objectReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Type getItemType() {
        return this.itemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader getObjectReader(ObjectReaderProvider objectReaderProvider) {
        if (this.reader != null) {
            return this.reader;
        }
        ObjectReader objectReader = objectReaderProvider.getObjectReader(this.fieldType, (this.features & JSONReader.Feature.FieldBased.mask) != 0);
        this.reader = objectReader;
        return objectReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isReadOnly() {
        return this.readOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isUnwrapped() {
        return (this.features & FieldInfo.UNWRAPPED_MASK) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void processExtra(JSONReader jSONReader, Object obj) {
        jSONReader.skipValue();
    }

    public abstract Object readFieldValue(JSONReader jSONReader);

    public abstract void readFieldValue(JSONReader jSONReader, T t9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void readFieldValueJSONB(JSONReader jSONReader, T t9) {
        readFieldValue(jSONReader, t9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean supportAcceptType(Class cls) {
        return this.fieldClass == cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        Member member = this.method;
        if (member == null) {
            member = this.field;
        }
        return member != null ? member.getName() : this.fieldName;
    }

    public void accept(T t9, byte b10) {
        accept(t9, Byte.valueOf(b10));
    }

    public void accept(T t9, short s10) {
        accept(t9, Short.valueOf(s10));
    }

    public void accept(T t9, int i9) {
        accept(t9, Integer.valueOf(i9));
    }

    public void accept(T t9, long j3) {
        accept(t9, Long.valueOf(j3));
    }

    public void accept(T t9, char c10) {
        accept(t9, Character.valueOf(c10));
    }

    public void accept(T t9, float f3) {
        accept(t9, Float.valueOf(f3));
    }

    public void accept(T t9, double d10) {
        accept(t9, Double.valueOf(d10));
    }

    public ObjectReader getItemObjectReader(JSONReader jSONReader) {
        return getItemObjectReader(jSONReader.context);
    }

    public void addResolveTask(JSONReader jSONReader, List list, int i9, String str) {
        jSONReader.addResolveTask(list, i9, JSONPath.m1657of(str));
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
}
