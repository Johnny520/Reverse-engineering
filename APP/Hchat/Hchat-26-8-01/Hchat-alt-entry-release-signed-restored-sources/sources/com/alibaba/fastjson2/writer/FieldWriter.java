package com.alibaba.fastjson2.writer;

import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.SymbolTable;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.JdbcSupport;
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
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldWriter<T> implements Comparable {
    static final AtomicReferenceFieldUpdater<FieldWriter, ObjectWriter> initObjectWriterUpdater = AtomicReferenceFieldUpdater.newUpdater(FieldWriter.class, ObjectWriter.class, "initObjectWriter");
    final boolean backReference;
    public final DecimalFormat decimalFormat;
    public final long features;
    public final Field field;
    public final Class fieldClass;
    final boolean fieldClassSerializable;
    public final String fieldName;
    protected final long fieldOffset;
    public final Type fieldType;
    public final String format;
    final long hashCode;
    volatile ObjectWriter initObjectWriter;
    public final String label;
    final boolean managedReference;
    public final Method method;
    final byte[] nameJSONB;
    long nameSymbolCache;
    final char[] nameWithColonUTF16;
    final byte[] nameWithColonUTF8;
    public final int ordinal;
    transient JSONWriter.Path path;
    protected final boolean primitive;
    final boolean raw;
    final JSONWriter.Path rootParentPath;
    final boolean symbol;
    final boolean trim;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriter(String str, int i9, long j3, String str2, String str3, Type type, Class cls, Field field, Method method) {
        if ("string".equals(str2) && cls != String.class) {
            j3 |= JSONWriter.Feature.WriteNonStringValueAsString.mask;
        }
        this.fieldName = str;
        this.ordinal = i9;
        this.format = str2;
        this.label = str3;
        this.hashCode = Fnv.hashCode64(str);
        this.features = j3;
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
        this.raw = (FieldInfo.RAW_VALUE_MASK & j3) != 0;
        this.managedReference = (JSONWriter.Feature.ReferenceDetection.mask & j3) != 0;
        this.backReference = (j3 & FieldInfo.BACKR_EFERENCE) != 0;
        this.rootParentPath = new JSONWriter.Path(JSONWriter.Path.ROOT, str);
        int length = str.length();
        int i10 = length + 3;
        int i11 = i10;
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 1 || cCharAt > 127) {
                i11 = cCharAt > 2047 ? i11 + 2 : i11 + 1;
            }
        }
        byte[] bArr = new byte[i11];
        bArr[0] = 34;
        int i13 = 1;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                bArr[i13] = (byte) cCharAt2;
                i13++;
            } else if (cCharAt2 > 2047) {
                bArr[i13] = (byte) (((cCharAt2 >> '\f') & 15) | 224);
                int i15 = i13 + 2;
                bArr[i13 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i13 += 3;
                bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                int i16 = i13 + 1;
                bArr[i13] = (byte) (((cCharAt2 >> 6) & 31) | Opcodes.CHECKCAST);
                i13 += 2;
                bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
            }
        }
        bArr[i13] = 34;
        bArr[i13 + 1] = 58;
        this.nameWithColonUTF8 = bArr;
        char[] cArr = new char[i10];
        cArr[0] = '\"';
        str.getChars(0, str.length(), cArr, 1);
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
        this.nameWithColonUTF16 = cArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectWriter getObjectWriter(Type type, Class cls, String str, Locale locale, Class cls2) {
        if (Map.class.isAssignableFrom(cls2)) {
            return cls.isAssignableFrom(cls2) ? ObjectWriterImplMap.m1785of(type, cls2) : ObjectWriterImplMap.m1783of(cls2);
        }
        if (Calendar.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? ObjectWriterImplCalendar.INSTANCE : new ObjectWriterImplCalendar(str, locale);
        }
        if (ZonedDateTime.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? ObjectWriterImplZonedDateTime.INSTANCE : new ObjectWriterImplZonedDateTime(str, locale);
        }
        if (OffsetDateTime.class.isAssignableFrom(cls2)) {
            return (str == null || str.isEmpty()) ? ObjectWriterImplOffsetDateTime.INSTANCE : ObjectWriterImplOffsetDateTime.m1787of(str, locale);
        }
        if (LocalDateTime.class.isAssignableFrom(cls2)) {
            ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(LocalDateTime.class);
            return (objectWriter == null || objectWriter == ObjectWriterImplLocalDateTime.INSTANCE) ? (str == null || str.isEmpty()) ? ObjectWriterImplLocalDateTime.INSTANCE : new ObjectWriterImplLocalDateTime(str, locale) : objectWriter;
        }
        if (LocalDate.class.isAssignableFrom(cls2)) {
            ObjectWriter objectWriter2 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(LocalDate.class);
            return (objectWriter2 == null || objectWriter2 == ObjectWriterImplLocalDate.INSTANCE) ? ObjectWriterImplLocalDate.m1781of(str, locale) : objectWriter2;
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
            return ObjectWriterImplOptional.m1788of(str, locale);
        }
        String name = cls2.getName();
        if (name.equals("java.sql.Date")) {
            return new ObjectWriterImplDate(str, locale);
        }
        if (name.equals("java.sql.Time")) {
            return JdbcSupport.TimeWriter.m1773of(str);
        }
        if (name.equals("java.sql.Timestamp")) {
            return new JdbcSupport.TimestampWriter(str);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean writeFieldNameSymbol(JSONWriter jSONWriter, SymbolTable symbolTable) {
        int ordinalByHashCode;
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j3 = this.nameSymbolCache;
        if (j3 == 0) {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.hashCode);
            this.nameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
        } else if (((int) j3) == iIdentityHashCode) {
            ordinalByHashCode = (int) (j3 >> 32);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Field field;
        Field field2;
        FieldWriter fieldWriter = (FieldWriter) obj;
        int i9 = this.ordinal;
        int i10 = fieldWriter.ordinal;
        if (i9 < i10) {
            return -1;
        }
        if (i9 > i10) {
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
            boolean z9 = member instanceof Method;
            if (z9 && (member2 instanceof Field) && ((Method) member).getReturnType() == ((Field) member2).getType()) {
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
            if (cls2 == Boolean.class && cls == Boolean.class && z9 && (member2 instanceof Method)) {
                String name = ((Method) member).getName();
                String name2 = ((Method) member2).getName();
                if (name.startsWith("is") && name2.startsWith("get")) {
                    return 1;
                }
                if (name.startsWith("get") && name2.startsWith("is")) {
                    return -1;
                }
            }
            if (z9 && (member2 instanceof Method)) {
                String name3 = ((Method) member).getName();
                String name4 = ((Method) member2).getName();
                if (!name3.equals(name4)) {
                    String str = BeanUtils.getterName(name3, null);
                    String str2 = BeanUtils.getterName(name4, null);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getFieldValue(T t9) {
        if (t9 == null) {
            C0086a.m450i(this.fieldName, "field.get error, ");
            return null;
        }
        Field field = this.field;
        if (field == null) {
            throw new UnsupportedOperationException();
        }
        try {
            long j3 = this.fieldOffset;
            return (j3 == -1 || this.primitive) ? field.get(t9) : JDKUtils.UNSAFE.getObject(t9, j3);
        } catch (IllegalAccessException e6) {
            e = e6;
            C0086a.m456o("field.get error, ", this.fieldName, e);
            return null;
        } catch (IllegalArgumentException e7) {
            e = e7;
            C0086a.m456o("field.get error, ", this.fieldName, e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter getInitWriter() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class getItemClass() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Type getItemType() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriter getItemWriter(JSONWriter jSONWriter, Type type) {
        return jSONWriter.getObjectWriter(type, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JSONWriter.Path getPath(JSONWriter.Path path) {
        JSONWriter.Path path2 = this.path;
        if (path2 != null) {
            return path2.parent == path ? path2 : new JSONWriter.Path(path, this.fieldName);
        }
        JSONWriter.Path path3 = new JSONWriter.Path(path, this.fieldName);
        this.path = path3;
        return path3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final JSONWriter.Path getRootParentPath() {
        return this.rootParentPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isDateFormatISO8601() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isDateFormatMillis() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isFieldClassSerializable() {
        return this.fieldClassSerializable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.fieldName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean unwrapped() {
        return false;
    }

    public abstract boolean write(JSONWriter jSONWriter, T t9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            } catch (IOException e6) {
                throw new JSONException("write gzipBytes error", e6);
            }
        } catch (Throwable th2) {
            IOUtils.close(gZIPOutputStream);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeBool(JSONWriter jSONWriter, boolean[] zArr) {
        if (zArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            jSONWriter.writeBool(zArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeDate(JSONWriter jSONWriter, boolean z9, long j3) {
        long j4;
        if (jSONWriter.jsonb) {
            jSONWriter.writeMillis(j3);
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        if (isDateFormatMillis() || context.isDateFormatMillis()) {
            if (z9) {
                writeFieldName(jSONWriter);
            }
            jSONWriter.writeInt64(j3);
            return;
        }
        ZoneId zoneId = context.getZoneId();
        if (context.getDateFormat() != null) {
            ZonedDateTime zonedDateTimeOfInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j3), zoneId);
            if (isDateFormatISO8601() || context.isDateFormatISO8601()) {
                jSONWriter.writeDateTimeISO8601(zonedDateTimeOfInstant.getYear(), zonedDateTimeOfInstant.getMonthValue(), zonedDateTimeOfInstant.getDayOfMonth(), zonedDateTimeOfInstant.getHour(), zonedDateTimeOfInstant.getMinute(), zonedDateTimeOfInstant.getSecond(), zonedDateTimeOfInstant.getNano() / 1000000, zonedDateTimeOfInstant.getOffset().getTotalSeconds(), true);
                return;
            }
            String str = context.getDateFormatter().format(zonedDateTimeOfInstant);
            if (z9) {
                writeFieldName(jSONWriter);
            }
            jSONWriter.writeString(str);
            return;
        }
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j3);
        long epochSecond = instantOfEpochMilli.getEpochSecond() + ((long) zoneId.getRules().getOffset(instantOfEpochMilli).getTotalSeconds());
        long jFloorDiv = Math.floorDiv(epochSecond, 86400L);
        int iFloorMod = (int) Math.floorMod(epochSecond, 86400L);
        long j5 = 719468 + jFloorDiv;
        if (j5 < 0) {
            long j10 = ((jFloorDiv + 719469) / 146097) - 1;
            j4 = j10 * 400;
            j5 += (-j10) * 146097;
        } else {
            j4 = 0;
        }
        long j11 = ((j5 * 400) + 591) / 146097;
        long j12 = j5 - ((j11 / 400) + (((j11 / 4) + (j11 * 365)) - (j11 / 100)));
        if (j12 < 0) {
            j11--;
            j12 = j5 - ((j11 / 400) + (((j11 / 4) + (365 * j11)) - (j11 / 100)));
        }
        int i9 = (int) j12;
        int i10 = ((i9 * 5) + 2) / Opcodes.IFEQ;
        int i11 = ((i10 + 2) % 12) + 1;
        int i12 = (i9 - (((i10 * 306) + 5) / 10)) + 1;
        int iCheckValidIntValue = ChronoField.YEAR.checkValidIntValue(j11 + j4 + ((long) (i10 / 10)));
        long j13 = iFloorMod;
        ChronoField.SECOND_OF_DAY.checkValidValue(j13);
        int i13 = (int) (j13 / 3600);
        long j14 = j13 - ((long) (i13 * 3600));
        int i14 = (int) (j14 / 60);
        int i15 = (int) (j14 - ((long) (i14 * 60)));
        if (z9) {
            writeFieldName(jSONWriter);
        }
        jSONWriter.writeDateTime19(iCheckValidIntValue, i11, i12, i13, i14, i15);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeEnum(JSONWriter jSONWriter, Enum r2) {
        writeFieldName(jSONWriter);
        jSONWriter.writeEnum(r2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeEnumJSONB(JSONWriter jSONWriter, Enum r2) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeFloat(JSONWriter jSONWriter, float[] fArr) {
        if (fArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            jSONWriter.writeFloat(fArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean writeFloatNull(JSONWriter jSONWriter) {
        long features = jSONWriter.getFeatures(this.features);
        long j3 = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        long j4 = j3 | feature.mask;
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
        if (((j4 | feature2.mask) & features) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        if ((feature.mask & features) != 0) {
            jSONWriter.writeFloat(0.0f);
            return true;
        }
        if ((features & feature2.mask) != 0) {
            jSONWriter.writeInt32(0);
            return true;
        }
        jSONWriter.writeNull();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeInt16(JSONWriter jSONWriter, short[] sArr) {
        if (sArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            jSONWriter.writeInt16(sArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeInt32(JSONWriter jSONWriter, int i9) {
        writeFieldName(jSONWriter);
        jSONWriter.writeInt32(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeInt64(JSONWriter jSONWriter, long j3) {
        writeFieldName(jSONWriter);
        if ((this.features & JSONWriter.Feature.WriteNonStringValueAsString.mask) != 0) {
            jSONWriter.writeString(Long.toString(j3));
        } else {
            jSONWriter.writeInt64(j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean writeIntNull(JSONWriter jSONWriter) {
        long features = this.features | jSONWriter.getFeatures();
        long j3 = JSONWriter.Feature.WriteNulls.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.NullAsDefaultValue;
        long j4 = j3 | feature.mask;
        JSONWriter.Feature feature2 = JSONWriter.Feature.WriteNullNumberAsZero;
        if (((j4 | feature2.mask) & features) == 0) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeList(JSONWriter jSONWriter, boolean z9, List list) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeListJSONB(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeListStr(JSONWriter jSONWriter, boolean z9, List<String> list) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeListValue(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeListValueJSONB(JSONWriter jSONWriter, List list) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void writeString(JSONWriter jSONWriter, String str) {
        writeFieldName(jSONWriter);
        if (str == null && (this.features & (JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) != 0) {
            jSONWriter.writeString(HttpUrl.FRAGMENT_ENCODE_SET);
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

    public abstract void writeValue(JSONWriter jSONWriter, T t9);

    public void writeBool(JSONWriter jSONWriter, boolean z9) {
        throw new UnsupportedOperationException();
    }

    public void writeFloat(JSONWriter jSONWriter, float f3) {
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeFloat(f3, decimalFormat);
        } else {
            jSONWriter.writeFloat(f3);
        }
    }

    public void writeDouble(JSONWriter jSONWriter, double[] dArr) {
        if (dArr != null || jSONWriter.isWriteNulls()) {
            writeFieldName(jSONWriter);
            jSONWriter.writeDouble(dArr);
        }
    }

    public void writeDouble(JSONWriter jSONWriter, double d10) {
        writeFieldName(jSONWriter);
        DecimalFormat decimalFormat = this.decimalFormat;
        if (decimalFormat != null) {
            jSONWriter.writeDouble(d10, decimalFormat);
        } else {
            jSONWriter.writeDouble(d10);
        }
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

    public void writeDate(JSONWriter jSONWriter, long j3) {
        writeDate(jSONWriter, true, j3);
    }

    public void writeDate(JSONWriter jSONWriter, boolean z9, Date date) {
        if (date == null) {
            if (z9) {
                writeFieldName(jSONWriter);
            }
            jSONWriter.writeNull();
            return;
        }
        writeDate(jSONWriter, z9, date.getTime());
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
}
