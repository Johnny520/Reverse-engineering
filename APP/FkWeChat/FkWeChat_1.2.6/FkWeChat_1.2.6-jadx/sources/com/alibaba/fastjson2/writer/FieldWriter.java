package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.SymbolTable;
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
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.introspect.PropertyAccessor;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactory;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.JdbcSupport;
import com.alibaba.fastjson2.util.JodaSupport;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.zip.GZIPOutputStream;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldWriter<T> implements Comparable {
    static final AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> initObjectWriterUpdater = AtomicReferenceFieldUpdater.newUpdater(FieldWriter.class, ObjectWriter.class, "initObjectWriter");
    final boolean backReference;
    public final DecimalFormat decimalFormat;
    Object defaultValue;
    public final long features;
    public final Field field;
    public final Class fieldClass;
    final boolean fieldClassSerializable;
    public final String fieldName;
    protected final long fieldOffset;
    public final Type fieldType;
    public final String format;
    protected Function function;
    final long hashCode;
    volatile ObjectWriter initObjectWriter;
    public final String label;
    public final Locale locale;
    final boolean managedReference;
    public final Method method;
    final byte[] nameJSONB;
    long nameSymbolCache;
    final char[] nameWithColonUTF16;
    final byte[] nameWithColonUTF8;
    public final int ordinal;
    transient JSONWriter.Path path;
    protected final boolean primitive;
    protected final PropertyAccessor propertyAccessor;
    final boolean raw;
    final JSONWriter.Path rootParentPath;
    final boolean symbol;
    final boolean trim;

    public FieldWriter(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, Object obj) {
        char c10;
        char c11;
        long j11 = (!"string".equals(str2) || cls == String.class) ? j10 : j10 | JSONWriter.Feature.WriteNonStringValueAsString.mask;
        this.fieldName = str;
        this.ordinal = i10;
        this.format = str2;
        this.locale = locale;
        this.label = str3;
        this.hashCode = Fnv.hashCode64(str);
        this.features = j11;
        this.fieldType = TypeUtils.intern(type);
        this.fieldClass = cls;
        this.fieldClassSerializable = cls != null && (Serializable.class.isAssignableFrom(cls) || !Modifier.isFinal(cls.getModifiers()));
        this.field = field;
        this.method = method;
        this.primitive = cls.isPrimitive();
        this.nameJSONB = JSONB.toBytes(str);
        this.decimalFormat = (str2 == null || !(cls == Float.TYPE || cls == float[].class || cls == Float.class || cls == Float[].class || cls == Double.TYPE || cls == double[].class || cls == Double.class || cls == Double[].class || cls == BigDecimal.class || cls == BigDecimal[].class)) ? null : new DecimalFormat(str2);
        this.fieldOffset = field != null ? JDKUtils.UNSAFE.objectFieldOffset(field) : -1L;
        this.symbol = "symbol".equals(str2);
        this.trim = "trim".equals(str2);
        this.raw = (FieldInfo.RAW_VALUE_MASK & j11) != 0;
        this.managedReference = (JSONWriter.Feature.ReferenceDetection.mask & j11) != 0;
        this.backReference = (j11 & FieldInfo.BACKR_REFERENCE) != 0;
        this.rootParentPath = new JSONWriter.Path(JSONWriter.Path.ROOT, str);
        int length = str.length();
        int i11 = length + 3;
        int i12 = i11;
        int i13 = 0;
        while (true) {
            c10 = 2047;
            if (i13 >= length) {
                break;
            }
            char cCharAt = str.charAt(i13);
            if (cCharAt < 1 || cCharAt > 127) {
                i12 = cCharAt > 2047 ? i12 + 2 : i12 + 1;
            }
            i13++;
        }
        byte[] bArr = new byte[i12];
        char c12 = '\"';
        bArr[0] = 34;
        int i14 = 0;
        int i15 = 1;
        while (i14 < length) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                bArr[i15] = (byte) cCharAt2;
                c11 = c12;
                i15++;
            } else if (cCharAt2 > c10) {
                c11 = c12;
                bArr[i15] = (byte) (((cCharAt2 >> '\f') & 15) | 224);
                int i16 = i15 + 2;
                bArr[i15 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i15 += 3;
                bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                c11 = c12;
                int i17 = i15 + 1;
                bArr[i15] = (byte) (((cCharAt2 >> 6) & 31) | Opcodes.CHECKCAST);
                i15 += 2;
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
            }
            i14++;
            c12 = c11;
            c10 = 2047;
        }
        byte b10 = c12;
        bArr[i15] = b10;
        bArr[i15 + 1] = 58;
        this.nameWithColonUTF8 = bArr;
        char[] cArr = new char[i11];
        cArr[0] = b10;
        str.getChars(0, str.length(), cArr, 1);
        cArr[length + 1] = b10;
        cArr[length + 2] = ':';
        this.nameWithColonUTF16 = cArr;
        this.propertyAccessor = createPropertyAccessor(str, type, cls, field, method, obj);
        if (obj instanceof Function) {
            this.function = (Function) obj;
        }
    }

    private static PropertyAccessor createPropertyAccessor(String str, Type type, Class cls, Field field, Method method, Object obj) {
        PropertyAccessorFactory propertyAccessorFactory = JSONFactory.PROPERTY_ACCESSOR_FACTORY;
        if (obj instanceof Function) {
            return propertyAccessorFactory.create(str, (Class<?>) cls, type, (Function) obj, (BiConsumer) null);
        }
        if (obj instanceof Predicate) {
            return propertyAccessorFactory.create(str, (Predicate) obj, (ObjBoolConsumer) null);
        }
        if (obj instanceof ToFloatFunction) {
            return propertyAccessorFactory.create(str, (ToFloatFunction) obj, (ObjFloatConsumer) null);
        }
        if (obj instanceof ToDoubleFunction) {
            return propertyAccessorFactory.create(str, (ToDoubleFunction) obj, (ObjDoubleConsumer) null);
        }
        if (obj instanceof ToCharFunction) {
            return propertyAccessorFactory.create(str, (ToCharFunction) obj, (ObjCharConsumer) null);
        }
        if (obj instanceof ToIntFunction) {
            return propertyAccessorFactory.create(str, (ToIntFunction) obj, (ObjIntConsumer) null);
        }
        if (obj instanceof ToByteFunction) {
            return propertyAccessorFactory.create(str, (ToByteFunction) obj, (ObjByteConsumer) null);
        }
        if (obj instanceof ToShortFunction) {
            return propertyAccessorFactory.create(str, (ToShortFunction) obj, (ObjShortConsumer) null);
        }
        if (obj instanceof ToLongFunction) {
            return propertyAccessorFactory.create(str, (ToLongFunction) obj, (ObjLongConsumer) null);
        }
        if (method != null) {
            return propertyAccessorFactory.create(method);
        }
        if (field != null) {
            return propertyAccessorFactory.create(field);
        }
        return null;
    }

    public static ObjectWriter getObjectWriter(Type type, Class cls, String str, Locale locale, Class cls2) {
        if (Map.class.isAssignableFrom(cls2)) {
            return cls.isAssignableFrom(cls2) ? ObjectWriterImplMap.m6527of(type, str, cls2) : ObjectWriterImplMap.m6524of(cls2);
        }
        if (Calendar.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? ObjectWriterImplCalendar.INSTANCE : new ObjectWriterImplCalendar(str, locale);
        }
        if (ZonedDateTime.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? ObjectWriterImplZonedDateTime.INSTANCE : new ObjectWriterImplZonedDateTime(str, locale);
        }
        if (OffsetDateTime.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? ObjectWriterImplOffsetDateTime.INSTANCE : ObjectWriterImplOffsetDateTime.m6528of(str, locale);
        }
        if (LocalDateTime.class.isAssignableFrom(cls2)) {
            ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(LocalDateTime.class);
            return (objectWriter == null || objectWriter == ObjectWriterImplLocalDateTime.INSTANCE) ? (str == null || str.isEmpty()) ? ObjectWriterImplLocalDateTime.INSTANCE : new ObjectWriterImplLocalDateTime(str, locale) : objectWriter;
        }
        if (LocalDate.class.isAssignableFrom(cls2)) {
            ObjectWriter objectWriter2 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(LocalDate.class);
            return (objectWriter2 == null || objectWriter2 == ObjectWriterImplLocalDate.INSTANCE) ? ObjectWriterImplLocalDate.m6522of(str, locale) : objectWriter2;
        }
        if (LocalTime.class.isAssignableFrom(cls2)) {
            ObjectWriter objectWriter3 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(LocalTime.class);
            return (objectWriter3 == null || objectWriter3 == ObjectWriterImplLocalTime.INSTANCE) ? (str == null || str.isEmpty()) ? ObjectWriterImplLocalTime.INSTANCE : new ObjectWriterImplLocalTime(str, locale) : objectWriter3;
        }
        if (Instant.class == cls2) {
            return (str == null || str.isEmpty()) ? ObjectWriterImplInstant.INSTANCE : new ObjectWriterImplInstant(str, locale);
        }
        if (BigDecimal.class == cls2) {
            return (str == null || str.isEmpty()) ? ObjectWriterImplBigDecimal.INSTANCE : new ObjectWriterImplBigDecimal(new DecimalFormat(str), null);
        }
        if (BigDecimal[].class == cls2) {
            return (str == null || str.isEmpty()) ? new ObjectWriterArrayFinal(BigDecimal.class, null) : new ObjectWriterArrayFinal(BigDecimal.class, new DecimalFormat(str));
        }
        if (Optional.class == cls2) {
            return ObjectWriterImplOptional.m6529of(str, locale);
        }
        String name = cls2.getName();
        if (name.equals("org.joda.time.LocalDate")) {
            return JodaSupport.createLocalDateWriter(cls2, str);
        }
        if (name.equals("java.sql.Date")) {
            return new ObjectWriterImplDate(str, locale);
        }
        if (name.equals("java.sql.Time")) {
            return JdbcSupport.createTimeWriter(str);
        }
        if (name.equals("java.sql.Timestamp")) {
            return JdbcSupport.createTimestampWriter(cls2, str);
        }
        if (name.equals("org.joda.time.LocalDateTime")) {
            return JodaSupport.createLocalDateTimeWriter(cls2, str);
        }
        return null;
    }

    private boolean writeFieldNameSymbol(JSONWriter jSONWriter, SymbolTable symbolTable) {
        int ordinalByHashCode;
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j10 = this.nameSymbolCache;
        if (j10 == 0) {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
            this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        } else if (((int) j10) == iIdentityHashCode) {
            ordinalByHashCode = (int) (j10 >> 32);
        } else {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
            this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        }
        if (ordinalByHashCode == -1) {
            return false;
        }
        jSONWriter.writeSymbol(-ordinalByHashCode);
        return true;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Field field;
        Field field2;
        FieldWriter fieldWriter = (FieldWriter) obj;
        int i10 = this.ordinal;
        int i11 = fieldWriter.ordinal;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int iCompareTo = this.fieldName.compareTo(fieldWriter.fieldName);
        if (iCompareTo == 0) {
            Member member = (this.method == null || ((field2 = this.field) != null && Modifier.isPublic(field2.getModifiers()))) ? this.field : this.method;
            Member member2 = (fieldWriter.method == null || ((field = fieldWriter.field) != null && Modifier.isPublic(field.getModifiers()))) ? fieldWriter.field : fieldWriter.method;
            if (member != null && member2 != null) {
                Class<?> declaringClass = member2.getDeclaringClass();
                Class<?> declaringClass2 = member.getDeclaringClass();
                if (declaringClass2 != declaringClass) {
                    if (declaringClass2.isAssignableFrom(declaringClass)) {
                        return 1;
                    }
                    if (declaringClass.isAssignableFrom(declaringClass2)) {
                        return -1;
                    }
                }
                JSONField jSONField = member instanceof Field ? (JSONField) ((Field) member).getAnnotation(JSONField.class) : member instanceof Method ? (JSONField) ((Method) member).getAnnotation(JSONField.class) : null;
                JSONField jSONField2 = member2 instanceof Field ? (JSONField) ((Field) member2).getAnnotation(JSONField.class) : member instanceof Method ? (JSONField) ((Method) member2).getAnnotation(JSONField.class) : null;
                if (jSONField != null && jSONField2 == null) {
                    return -1;
                }
                if (jSONField == null && jSONField2 != null) {
                    return 1;
                }
            }
            if ((member instanceof Field) && (member2 instanceof Method) && ((Field) member).getType() == ((Method) member2).getReturnType()) {
                return -1;
            }
            boolean z10 = member instanceof Method;
            if (z10 && (member2 instanceof Field) && ((Method) member).getReturnType() == ((Field) member2).getType()) {
                return 1;
            }
            Class cls = fieldWriter.fieldClass;
            Class<?> cls2 = this.fieldClass;
            if (cls2 != cls && cls2 != null && cls != null) {
                if (cls2.isAssignableFrom(cls)) {
                    return 1;
                }
                if (cls.isAssignableFrom(cls2)) {
                    return -1;
                }
            }
            Class cls3 = Boolean.TYPE;
            if (cls2 == cls3 && cls != cls3) {
                return 1;
            }
            if (cls2 == Boolean.class && cls == Boolean.class && z10 && (member2 instanceof Method)) {
                String name = member.getName();
                String name2 = member2.getName();
                if (name.startsWith("is") && name2.startsWith("get")) {
                    return 1;
                }
                if (name.startsWith("get") && name2.startsWith("is")) {
                    return -1;
                }
            }
            if (z10 && (member2 instanceof Method)) {
                String name3 = member.getName();
                String name4 = member2.getName();
                if (!name3.equals(name4)) {
                    String str = BeanUtils.getterName(name3, (String) null);
                    String str2 = BeanUtils.getterName(name4, (String) null);
                    if (this.fieldName.equals(str) && !fieldWriter.fieldName.equals(str2)) {
                        return 1;
                    }
                    if (this.fieldName.equals(str2) && !fieldWriter.fieldName.equals(str)) {
                        return -1;
                    }
                }
            }
            if (cls2.isPrimitive() && !cls.isPrimitive()) {
                return -1;
            }
            if (!cls2.isPrimitive() && cls.isPrimitive()) {
                return 1;
            }
            if (cls2.getName().startsWith("java.") && !cls.getName().startsWith("java.")) {
                return -1;
            }
            if (!cls2.getName().startsWith("java.") && cls.getName().startsWith("java.")) {
                return 1;
            }
            Method method = this.method;
            if (method != null && fieldWriter.method == null) {
                return -1;
            }
            if (method == null && fieldWriter.method != null) {
                return 1;
            }
        }
        return iCompareTo;
    }

    public JSONException errorOnGet(Throwable th) {
        return new JSONException("field.get error, " + this.fieldName, th);
    }

    public Object getFieldValue(T t10) {
        try {
            return this.propertyAccessor.getObject(t10);
        } catch (Throwable th) {
            throw errorOnGet(th);
        }
    }

    public Function getFunction() {
        return this.function;
    }

    public ObjectWriter getInitWriter() {
        return null;
    }

    public Class getItemClass() {
        return null;
    }

    public Type getItemType() {
        return null;
    }

    public ObjectWriter getItemWriter(JSONWriter jSONWriter, Type type) {
        return jSONWriter.getObjectWriter(type, (Class) null);
    }

    public final JSONWriter.Path getPath(JSONWriter.Path path) {
        JSONWriter.Path path2 = this.path;
        if (path2 != null) {
            return path2.parent == path ? path2 : new JSONWriter.Path(path, this.fieldName);
        }
        JSONWriter.Path path3 = new JSONWriter.Path(path, this.fieldName);
        this.path = path3;
        return path3;
    }

    public final JSONWriter.Path getRootParentPath() {
        return this.rootParentPath;
    }

    public boolean isDateFormatISO8601() {
        return false;
    }

    public boolean isDateFormatMillis() {
        return false;
    }

    public boolean isFieldClassSerializable() {
        return this.fieldClassSerializable;
    }

    public boolean isRefDetect(Object obj, long j10) {
        long j11 = j10 | this.features;
        return ((JSONWriter.Feature.ReferenceDetection.mask & j11) == 0 || (j11 & FieldInfo.DISABLE_REFERENCE_DETECT) != 0 || obj == null || ObjectWriterProvider.isNotReferenceDetect(obj.getClass())) ? false : true;
    }

    public void setDefaultValue(T t10) {
        Object obj;
        if (Iterable.class.isAssignableFrom(this.fieldClass) || Map.class.isAssignableFrom(this.fieldClass)) {
            return;
        }
        Field field = this.field;
        if (field == null || t10 == null) {
            obj = null;
        } else {
            try {
                field.setAccessible(true);
                obj = this.field.get(t10);
            } catch (Throwable unused) {
                obj = null;
            }
        }
        if (obj == null) {
            return;
        }
        Class cls = this.fieldClass;
        if (cls == Boolean.TYPE) {
            if (obj.equals(Boolean.FALSE)) {
                return;
            }
        } else if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Long.TYPE || cls == Float.TYPE || cls == Double.TYPE) {
            if (((Number) obj).doubleValue() == 0.0d) {
                return;
            }
        } else if (cls == Character.TYPE && ((Character) obj).charValue() == 0) {
            return;
        }
        this.defaultValue = obj;
    }

    public String toString() {
        return this.fieldName;
    }

    public boolean unwrapped() {
        return false;
    }

    public abstract boolean write(JSONWriter jSONWriter, T t10);

    public void writeBinary(JSONWriter jSONWriter, byte[] bArr) {
        if (bArr == null) {
            if (jSONWriter.isWriteNulls()) {
                writeFieldName(jSONWriter);
                jSONWriter.writeArrayNull();
                return;
            }
            return;
        }
        writeFieldName(jSONWriter);
        if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(bArr);
            return;
        }
        if ("base64".equals(this.format) || (this.format == null && (jSONWriter.getFeatures(this.features) & JSONWriter.Feature.WriteByteArrayAsBase64.mask) != 0)) {
            jSONWriter.writeBase64(bArr);
            return;
        }
        if ("hex".equals(this.format)) {
            jSONWriter.writeHex(bArr);
            return;
        }
        if (!"gzip,base64".equals(this.format) && !"gzip".equals(this.format)) {
            jSONWriter.writeBinary(bArr);
            return;
        }
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = bArr.length < 512 ? new GZIPOutputStream(byteArrayOutputStream, bArr.length) : new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                IOUtils.close(gZIPOutputStream);
                jSONWriter.writeBase64(byteArray);
            } catch (IOException e10) {
                throw new JSONException("write gzipBytes error", e10);
            }
        } catch (Throwable th) {
            IOUtils.close(gZIPOutputStream);
            throw th;
        }
    }

    public void writeBool(JSONWriter jSONWriter, boolean[] zArr) {
        if (zArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
                jSONWriter.writeString(zArr);
            } else {
                jSONWriter.writeBool(zArr);
            }
        }
    }

    public void writeDate(JSONWriter jSONWriter, boolean z10, long j10) {
        long j11;
        if (jSONWriter.jsonb) {
            jSONWriter.writeMillis(j10);
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        if (isDateFormatMillis() || context.isDateFormatMillis()) {
            if (z10) {
                writeFieldName(jSONWriter);
            }
            jSONWriter.writeInt64(j10);
            return;
        }
        ZoneId zoneId = context.getZoneId();
        if (context.getDateFormat() != null) {
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j10), zoneId);
            if (isDateFormatISO8601() || context.isDateFormatISO8601()) {
                jSONWriter.writeDateTimeISO8601(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
                return;
            }
            String str = context.getDateFormatter().format(zonedDateTimeOfInstant);
            if (z10) {
                writeFieldName(jSONWriter);
            }
            jSONWriter.writeString(str);
            return;
        }
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j10);
        long epochSecond = instantOfEpochMilli.getEpochSecond() + ((long) zoneId.getRules().getOffset(instantOfEpochMilli).getTotalSeconds());
        long jFloorDiv = Math.floorDiv(epochSecond, 86400L);
        int iFloorMod = (int) Math.floorMod(epochSecond, 86400L);
        long j12 = 719468 + jFloorDiv;
        if (j12 < 0) {
            long j13 = ((jFloorDiv + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((((j14 * 365) + (j14 / 4)) - (j14 / 100)) + (j14 / 400));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((((365 * j14) + (j14 / 4)) - (j14 / 100)) + (j14 / 400));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / Opcodes.IFEQ;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        int iCheckValidIntValue = ChronoField.YEAR.checkValidIntValue(j14 + j11 + ((long) (i11 / 10)));
        long j16 = iFloorMod;
        ChronoField.SECOND_OF_DAY.checkValidValue(j16);
        int i14 = (int) (j16 / 3600);
        long j17 = j16 - ((long) (i14 * 3600));
        int i15 = (int) (j17 / 60);
        int i16 = (int) (j17 - ((long) (i15 * 60)));
        if (z10) {
            writeFieldName(jSONWriter);
        }
        jSONWriter.writeDateTime19(iCheckValidIntValue, i12, i13, i14, i15, i16);
    }

    public void writeDouble(JSONWriter jSONWriter, Double d10) {
        if (d10 != null) {
            writeFieldName(jSONWriter);
            jSONWriter.writeDouble(d10.doubleValue());
            return;
        }
        long features = jSONWriter.getFeatures(this.features);
        if ((JSONWriter.Feature.WriteNulls.mask & features) == 0 || (features & JSONWriter.Feature.NotWriteDefaultValue.mask) != 0) {
            return;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeNumberNull();
    }

    public void writeEnum(JSONWriter jSONWriter, Enum r22) {
        writeFieldName(jSONWriter);
        jSONWriter.writeEnum(r22);
    }

    public void writeEnumJSONB(JSONWriter jSONWriter, Enum r22) {
        throw new UnsupportedOperationException();
    }

    public int writeEnumValueJSONB(byte[] bArr, int i10, Enum r32, SymbolTable symbolTable, long j10) {
        throw new UnsupportedOperationException();
    }

    public final void writeFieldName(JSONWriter jSONWriter) {
        if (jSONWriter.jsonb) {
            SymbolTable symbolTable = jSONWriter.symbolTable;
            if (symbolTable == null || !writeFieldNameSymbol(jSONWriter, symbolTable)) {
                jSONWriter.writeNameRaw(this.nameJSONB, this.hashCode);
                return;
            }
            return;
        }
        if (!jSONWriter.useSingleQuote && (jSONWriter.context.getFeatures() & JSONWriter.Feature.UnquoteFieldName.mask) == 0) {
            if (jSONWriter.utf8) {
                jSONWriter.writeNameRaw(this.nameWithColonUTF8);
                return;
            } else if (jSONWriter.utf16) {
                jSONWriter.writeNameRaw(this.nameWithColonUTF16);
                return;
            }
        }
        jSONWriter.writeName(this.fieldName);
        jSONWriter.writeColon();
    }

    public final void writeFieldNameJSONB(JSONWriter jSONWriter) {
        SymbolTable symbolTable = jSONWriter.symbolTable;
        if (symbolTable == null || !writeFieldNameSymbol(jSONWriter, symbolTable)) {
            jSONWriter.writeNameRaw(this.nameJSONB, this.hashCode);
        }
    }

    public void writeFloat(JSONWriter jSONWriter, float f10) {
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(f10, decimalFormat);
        } else if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Float.toString(f10));
        } else {
            jSONWriter.writeFloat(f10);
        }
    }

    public final boolean writeFloatNull(JSONWriter jSONWriter) {
        long features = jSONWriter.getFeatures(this.features);
        long j10 = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        long j11 = j10 | feature.mask;
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
        if (((j11 | feature2.mask) & features) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        if ((features & (feature.mask | feature2.mask)) != 0) {
            jSONWriter.writeFloat(0.0f);
            return true;
        }
        jSONWriter.writeNull();
        return true;
    }

    public void writeInt16(JSONWriter jSONWriter, short[] sArr) {
        if (sArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
                jSONWriter.writeString(sArr);
            } else {
                jSONWriter.writeInt16(sArr);
            }
        }
    }

    public void writeInt32(JSONWriter jSONWriter, int i10) {
        writeFieldName(jSONWriter);
        jSONWriter.writeInt32(i10);
    }

    public void writeInt64(JSONWriter jSONWriter, long j10) {
        writeFieldName(jSONWriter);
        if (JSONWriter.isWriteAsString(j10, this.features)) {
            jSONWriter.writeString(j10);
        } else {
            jSONWriter.writeInt64(j10);
        }
    }

    public final boolean writeIntNull(JSONWriter jSONWriter) {
        long features = this.features | jSONWriter.getFeatures();
        long j10 = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        long j11 = j10 | feature.mask;
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
        if (((j11 | feature2.mask) & features) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        if ((features & (feature2.mask | feature.mask)) != 0) {
            jSONWriter.writeInt32(0);
            return true;
        }
        jSONWriter.writeNull();
        return true;
    }

    public void writeList(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    public void writeListJSONB(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    public void writeListStr(JSONWriter jSONWriter, boolean z10, List<String> list) {
        throw new UnsupportedOperationException();
    }

    public void writeListValue(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    public void writeListValueJSONB(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    public void writeString(JSONWriter jSONWriter, String str) {
        writeFieldName(jSONWriter);
        if (str == null && (this.features & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) != 0) {
            jSONWriter.writeString(_UrlKt.FRAGMENT_ENCODE_SET);
            return;
        }
        if (this.trim && str != null) {
            str = str.trim();
        }
        if (this.symbol && jSONWriter.jsonb) {
            jSONWriter.writeSymbol(str);
        } else if (this.raw) {
            jSONWriter.writeRaw(str);
        } else {
            jSONWriter.writeString(str);
        }
    }

    public abstract void writeValue(JSONWriter jSONWriter, T t10);

    public final int writeFieldNameJSONB(byte[] bArr, int i10) {
        byte[] bArr2 = this.nameJSONB;
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
        return i10 + this.nameJSONB.length;
    }

    public final int writeFieldNameJSONB(byte[] bArr, int i10, JSONWriter jSONWriter) {
        return JSONB.InterfaceC1562IO.writeNameRaw(bArr, i10, this.nameJSONB, this.hashCode, jSONWriter);
    }

    public void writeBool(JSONWriter jSONWriter, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public void writeFloat(JSONWriter jSONWriter, float[] fArr) {
        if (fArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
                jSONWriter.writeString(fArr);
            } else {
                jSONWriter.writeFloat(fArr);
            }
        }
    }

    public void writeDouble(JSONWriter jSONWriter, double[] dArr) {
        if (dArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
                jSONWriter.writeString(dArr);
            } else {
                jSONWriter.writeDouble(dArr);
            }
        }
    }

    public void writeDouble(JSONWriter jSONWriter, double d10) {
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(d10, decimalFormat);
        } else if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Double.toString(d10));
        } else {
            jSONWriter.writeDouble(d10);
        }
    }

    public int writeFieldNameSymbol(SymbolTable symbolTable) {
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j10 = this.nameSymbolCache;
        if (j10 == 0) {
            int ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
            this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            return ordinalByHashCode;
        }
        if (((int) j10) == iIdentityHashCode) {
            return (int) (j10 >> 32);
        }
        int ordinalByHashCode2 = symbolTable.getOrdinalByHashCode(this.hashCode);
        this.nameSymbolCache = (((long) ordinalByHashCode2) << 32) | ((long) iIdentityHashCode);
        return ordinalByHashCode2;
    }

    public void writeString(JSONWriter jSONWriter, char[] cArr) {
        if (cArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            if (cArr == null) {
                jSONWriter.writeStringNull();
            } else {
                jSONWriter.writeString(cArr, 0, cArr.length);
            }
        }
    }

    public void writeDate(JSONWriter jSONWriter, long j10) {
        writeDate(jSONWriter, true, j10);
    }

    public void writeDate(JSONWriter jSONWriter, boolean z10, Date date) {
        if (date == null) {
            if (z10) {
                writeFieldName(jSONWriter);
            }
            jSONWriter.writeNull();
            return;
        }
        writeDate(jSONWriter, z10, date.getTime());
    }

    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        if (cls == Float[].class) {
            if (this.decimalFormat != null) {
                return new ObjectWriterArrayFinal(Float.class, this.decimalFormat);
            }
            return ObjectWriterArrayFinal.FLOAT_ARRAY;
        }
        if (cls == Double[].class) {
            if (this.decimalFormat != null) {
                return new ObjectWriterArrayFinal(Double.class, this.decimalFormat);
            }
            return ObjectWriterArrayFinal.DOUBLE_ARRAY;
        }
        if (cls == BigDecimal[].class) {
            if (this.decimalFormat != null) {
                return new ObjectWriterArrayFinal(BigDecimal.class, this.decimalFormat);
            }
            return ObjectWriterArrayFinal.DECIMAL_ARRAY;
        }
        return jSONWriter.getObjectWriter(cls);
    }

    public FieldWriter(String str, int i10, long j10, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method) {
        this(str, i10, j10, str2, locale, str3, type, cls, field, method, null);
    }
}
