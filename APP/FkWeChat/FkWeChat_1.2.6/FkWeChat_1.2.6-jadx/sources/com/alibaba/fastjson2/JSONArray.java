package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplEnum;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import java.lang.reflect.Array;
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
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class JSONArray extends ArrayList<Object> {
    static ObjectWriter<JSONArray> arrayWriter = null;
    private static final long serialVersionUID = 1;

    public JSONArray(Object... objArr) {
        super(objArr.length);
        super.addAll(Arrays.asList(objArr));
    }

    public static JSONArray copyOf(Collection collection) {
        return new JSONArray((Collection<?>) collection);
    }

    public static JSONArray from(Object obj) {
        return (JSONArray) JSON.toJSON(obj);
    }

    /* JADX INFO: renamed from: of */
    public static JSONArray m6187of(Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray = new JSONArray(3);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        jSONArray.add(obj3);
        return jSONArray;
    }

    public static JSONArray parse(String str, JSONReader.Feature... featureArr) {
        return JSON.parseArray(str, featureArr);
    }

    public static JSONArray parseArray(String str, JSONReader.Feature... featureArr) {
        return JSON.parseArray(str, featureArr);
    }

    public JSONArray addArray() {
        JSONArray jSONArray = new JSONArray();
        add(jSONArray);
        return jSONArray;
    }

    public JSONObject addObject() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject);
        return jSONObject;
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return new JSONArray(this);
    }

    public JSONArray fluentAdd(Object obj) {
        add(obj);
        return this;
    }

    public JSONArray fluentAddAll(Collection<?> collection) {
        addAll(collection);
        return this;
    }

    public JSONArray fluentClear() {
        clear();
        return this;
    }

    public JSONArray fluentRemove(int i10) {
        remove(i10);
        return this;
    }

    public JSONArray fluentRemoveAll(Collection<?> collection) {
        removeAll(collection);
        return this;
    }

    public JSONArray fluentSet(int i10, Object obj) {
        set(i10, obj);
        return this;
    }

    public BigDecimal getBigDecimal(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return obj instanceof BigDecimal ? (BigDecimal) obj : obj instanceof BigInteger ? new BigDecimal((BigInteger) obj) : obj instanceof Float ? TypeUtils.toBigDecimal(((Float) obj).floatValue()) : obj instanceof Double ? TypeUtils.toBigDecimal(((Double) obj).doubleValue()) : BigDecimal.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return TypeUtils.toBigDecimal(((String) obj).trim());
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
        }
        C1571d.m6259a("Can not cast '", obj.getClass(), "' to BigDecimal");
        return null;
    }

    public BigInteger getBigInteger(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return obj instanceof BigInteger ? (BigInteger) obj : obj instanceof BigDecimal ? ((BigDecimal) obj).toBigInteger() : BigInteger.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? BigInteger.ONE : BigInteger.ZERO;
            }
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to BigInteger");
            return null;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return new BigInteger(strTrim);
    }

    public Boolean getBoolean(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (!(obj instanceof String)) {
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to boolean");
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return Boolean.valueOf("true".equalsIgnoreCase(str) || "1".equals(str));
    }

    public boolean getBooleanValue(int i10) {
        Boolean bool = getBoolean(i10);
        return bool != null && bool.booleanValue();
    }

    public Byte getByte(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to byte");
            return null;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(strTrim));
    }

    public byte getByteValue(int i10) {
        Byte b10 = getByte(i10);
        if (b10 == null) {
            return (byte) 0;
        }
        return b10.byteValue();
    }

    public Date getDate(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof String) {
            return DateUtils.parseDate((String) obj);
        }
        if (!(obj instanceof Number)) {
            return TypeUtils.toDate(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0) {
            return null;
        }
        return new Date(jLongValue);
    }

    public Double getDouble(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to double");
            return null;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(strTrim));
    }

    public double getDoubleValue(int i10) {
        Double d10 = getDouble(i10);
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    public Float getFloat(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to float");
            return null;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(strTrim));
    }

    public float getFloatValue(int i10) {
        Float f10 = getFloat(i10);
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public Instant getInstant(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Instant) {
            return (Instant) obj;
        }
        if (!(obj instanceof Number)) {
            return TypeUtils.toInstant(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0) {
            return null;
        }
        return Instant.ofEpochMilli(jLongValue);
    }

    public int getIntValue(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String)) {
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to int value");
            return 0;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return 0;
        }
        return strTrim.indexOf(46) != -1 ? (int) Double.parseDouble(strTrim) : Integer.parseInt(strTrim);
    }

    public Integer getInteger(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? 1 : 0;
            }
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to Integer");
            return null;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return strTrim.indexOf(46) != -1 ? Integer.valueOf((int) Double.parseDouble(strTrim)) : Integer.valueOf(Integer.parseInt(strTrim));
    }

    public JSONArray getJSONArray(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            if (str.charAt(0) != '[') {
                return m6185of((Object) str);
            }
            return JSONFactory.ARRAY_READER.readObject(JSONReader.m6226of(str), null, null, 0L);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray((Collection<?>) obj);
            set(i10, jSONArray);
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArrayM6188of = m6188of((Object[]) obj);
            set(i10, jSONArrayM6188of);
            return jSONArrayM6188of;
        }
        if (!obj.getClass().isArray()) {
            return null;
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray2 = new JSONArray(length);
        for (int i11 = 0; i11 < length; i11++) {
            jSONArray2.add(Array.get(obj, i11));
        }
        set(i10, jSONArray2);
        return jSONArray2;
    }

    public JSONObject getJSONObject(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return JSONFactory.OBJECT_READER.readObject(JSONReader.m6226of(str), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            set(i10, jSONObject);
            return jSONObject;
        }
        ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
        JSONObject jSONObject2 = objectWriter instanceof ObjectWriterAdapter ? ((ObjectWriterAdapter) objectWriter).toJSONObject(obj) : (JSONObject) JSON.toJSON(obj);
        set(i10, jSONObject2);
        return jSONObject2;
    }

    public LocalDate getLocalDate(int i10, LocalDate localDate) {
        Object obj = super.get(i10);
        return obj == null ? localDate : obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) TypeUtils.cast(obj, LocalDate.class);
    }

    public LocalDateTime getLocalDateTime(int i10, LocalDateTime localDateTime) {
        Object obj = super.get(i10);
        return obj == null ? localDateTime : obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) TypeUtils.cast(obj, LocalDateTime.class);
    }

    public LocalTime getLocalTime(int i10, LocalTime localTime) {
        Object obj = super.get(i10);
        return obj == null ? localTime : obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) TypeUtils.cast(obj, LocalTime.class);
    }

    public Long getLong(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? 1L : 0L;
            }
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to Long");
            return null;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return strTrim.indexOf(46) != -1 ? Long.valueOf((long) Double.parseDouble(strTrim)) : Long.valueOf(Long.parseLong(strTrim));
    }

    public long getLongValue(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (!(obj instanceof String)) {
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to long value");
            return 0L;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return 0L;
        }
        return strTrim.indexOf(46) != -1 ? (long) Double.parseDouble(strTrim) : Long.parseLong(strTrim);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getObject(int i10, Class<T> cls, JSONReader.Feature... featureArr) {
        T t10 = (T) get(i10);
        ObjectReader objectReader = null;
        if (t10 == 0) {
            return null;
        }
        Class<?> cls2 = t10.getClass();
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls2, cls);
        if (typeConvert != null) {
            return (T) typeConvert.apply(t10);
        }
        long j10 = JSONFactory.defaultReaderFeatures;
        boolean z10 = false;
        for (JSONReader.Feature feature : featureArr) {
            j10 |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z10 = true;
            }
        }
        if (t10 instanceof Map) {
            return (T) defaultObjectReaderProvider.getObjectReader(cls, z10).createInstance((Map) t10, j10);
        }
        if (t10 instanceof Collection) {
            return (T) defaultObjectReaderProvider.getObjectReader(cls, z10).createInstance((Collection) t10, j10);
        }
        Class<?> mapping = TypeUtils.getMapping(cls);
        if (mapping.isInstance(t10)) {
            return t10;
        }
        if (t10 instanceof String) {
            String str = (String) t10;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            if (mapping.isEnum()) {
                objectReader = defaultObjectReaderProvider.getObjectReader(mapping, z10);
                if (objectReader instanceof ObjectReaderImplEnum) {
                    return (T) ((ObjectReaderImplEnum) objectReader).getEnumByHashCode(Fnv.hashCode64(str));
                }
            }
        }
        String jSONString = JSON.toJSONString(t10);
        JSONReader jSONReaderM6226of = JSONReader.m6226of(jSONString);
        jSONReaderM6226of.context.config(featureArr);
        if (objectReader == null) {
            objectReader = defaultObjectReaderProvider.getObjectReader(mapping, z10);
        }
        T t11 = (T) objectReader.readObject(jSONReaderM6226of, null, null, 0L);
        if (jSONReaderM6226of.isEnd()) {
            return t11;
        }
        C1605j.m6294a("not support input ", jSONString);
        return null;
    }

    public OffsetDateTime getOffsetDateTime(int i10, OffsetDateTime offsetDateTime) {
        Object obj = super.get(i10);
        return obj == null ? offsetDateTime : obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) TypeUtils.cast(obj, OffsetDateTime.class);
    }

    public OffsetTime getOffsetTime(int i10, OffsetTime offsetTime) {
        Object obj = super.get(i10);
        return obj == null ? offsetTime : obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) TypeUtils.cast(obj, OffsetTime.class);
    }

    public Short getShort(int i10) {
        Object obj = get(i10);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Short) {
            return (Short) obj;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            C1571d.m6259a("Can not cast '", obj.getClass(), "' to short");
            return null;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(strTrim));
    }

    public short getShortValue(int i10) {
        Short sh = getShort(i10);
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    public String getString(int i10, String str) {
        Object obj = get(i10);
        return obj == null ? str : obj instanceof String ? (String) obj : obj instanceof Date ? DateUtils.toString(((Date) obj).getTime(), false, DateUtils.DEFAULT_ZONE_ID) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum) || (obj instanceof TemporalAccessor)) ? obj.toString() : JSON.toJSONString(obj);
    }

    public ZonedDateTime getZonedDateTime(int i10, ZonedDateTime zonedDateTime) {
        Object obj = super.get(i10);
        return obj == null ? zonedDateTime : obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) TypeUtils.cast(obj, ZonedDateTime.class);
    }

    public boolean isValid(JSONSchema jSONSchema) {
        return jSONSchema.validate(this).isSuccess();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        int size = super.size();
        if (i10 < 0) {
            int i11 = i10 + size;
            if (i11 >= 0) {
                return super.set(i11, obj);
            }
            super.add(0, obj);
            return null;
        }
        if (i10 < size) {
            return super.set(i10, obj);
        }
        if (i10 < size + 4096) {
            while (true) {
                int i12 = i10 - 1;
                if (i10 == size) {
                    break;
                }
                super.add(null);
                i10 = i12;
            }
            super.add(obj);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public <T> T m6189to(Class<T> cls) {
        return cls == String.class ? (T) toString() : cls == JSON.class ? this : (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls).createInstance(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] toArray(Class<T> cls, JSONReader.Feature... featureArr) {
        long j10 = JSONFactory.defaultReaderFeatures;
        boolean z10 = false;
        for (JSONReader.Feature feature : featureArr) {
            j10 |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z10 = true;
            }
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, z10);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, size()));
        for (int i10 = 0; i10 < size(); i10++) {
            Object objCreateInstance = get(i10);
            if ((objCreateInstance instanceof JSONObject) || (objCreateInstance instanceof Map)) {
                objCreateInstance = objectReader.createInstance((Map) objCreateInstance, j10);
            } else {
                if (objCreateInstance != null && !cls.isInstance(objCreateInstance)) {
                    Class<?> cls2 = objCreateInstance.getClass();
                    Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls2, cls);
                    if (typeConvert == 0) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    tArr[i10] = typeConvert.apply(objCreateInstance);
                }
            }
            tArr[i10] = objCreateInstance;
        }
        return tArr;
    }

    public byte[] toJSONBBytes(JSONWriter.Feature... featureArr) {
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB(featureArr);
        try {
            jSONWriterOfJSONB.setRootObject(this);
            jSONWriterOfJSONB.write(this);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th) {
            if (jSONWriterOfJSONB != null) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public String toJSONString(JSONWriter.Feature... featureArr) {
        return toString(featureArr);
    }

    public <T> List<T> toJavaList(Class<T> cls, JSONReader.Feature... featureArr) {
        return toList(cls, featureArr);
    }

    @Deprecated
    public <T> T toJavaObject(Type type) {
        return (T) m6190to(type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> List<T> toList(Class<T> cls, JSONReader.Feature... featureArr) {
        long j10 = JSONFactory.defaultReaderFeatures;
        boolean z10 = false;
        for (JSONReader.Feature feature : featureArr) {
            j10 |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z10 = true;
            }
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        ObjectReader objectReader = defaultObjectReaderProvider.getObjectReader(cls, z10);
        ArrayList arrayList = new ArrayList(size());
        for (int i10 = 0; i10 < size(); i10++) {
            Object objCreateInstance = get(i10);
            if ((objCreateInstance instanceof JSONObject) || (objCreateInstance instanceof Map)) {
                objCreateInstance = objectReader.createInstance((Map) objCreateInstance, j10);
            } else {
                if (objCreateInstance != null && !cls.isInstance(objCreateInstance)) {
                    Class<?> cls2 = objCreateInstance.getClass();
                    Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls2, cls);
                    if (typeConvert == 0) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    arrayList.add(typeConvert.apply(objCreateInstance));
                }
            }
            arrayList.add(objCreateInstance);
        }
        return arrayList;
    }

    public String toString(JSONWriter.Feature... featureArr) {
        JSONWriter jSONWriterM6250of = JSONWriter.m6250of(featureArr);
        try {
            if ((jSONWriterM6250of.context.features & JSONObject.NONE_DIRECT_FEATURES) == 0) {
                jSONWriterM6250of.write(this);
            } else {
                jSONWriterM6250of.setRootObject(this);
                if (arrayWriter == null) {
                    arrayWriter = jSONWriterM6250of.getObjectWriter(JSONArray.class, JSONArray.class);
                }
                arrayWriter.write(jSONWriterM6250of, this, null, null, 0L);
            }
            String string = jSONWriterM6250of.toString();
            jSONWriterM6250of.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterM6250of == null) {
                throw th;
            }
            try {
                jSONWriterM6250of.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public JSONArray fluentRemove(Object obj) {
        remove(obj);
        return this;
    }

    public static <T> List<T> parseArray(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        return JSON.parseArray(str, (Class) cls, featureArr);
    }

    public static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        return JSON.toJSONString(obj, featureArr);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) {
        return JSON.parseArray(str, (Class) cls);
    }

    public static JSONArray from(Object obj, JSONWriter.Feature... featureArr) {
        return (JSONArray) JSON.toJSON(obj, featureArr);
    }

    public JSONArray(int i10) {
        super(i10);
    }

    public JSONArray(Collection<?> collection) {
        super(collection);
    }

    public JSONArray() {
    }

    /* JADX INFO: renamed from: of */
    public static JSONArray m6185of(Object obj) {
        JSONArray jSONArray = new JSONArray(1);
        jSONArray.add(obj);
        return jSONArray;
    }

    /* JADX INFO: renamed from: of */
    public static JSONArray m6186of(Object obj, Object obj2) {
        JSONArray jSONArray = new JSONArray(2);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        return jSONArray;
    }

    /* JADX INFO: renamed from: of */
    public static JSONArray m6188of(Object... objArr) {
        return new JSONArray(objArr);
    }

    public LocalDate getLocalDate(int i10) {
        return getLocalDate(i10, null);
    }

    public LocalDateTime getLocalDateTime(int i10) {
        return getLocalDateTime(i10, null);
    }

    public LocalTime getLocalTime(int i10) {
        return getLocalTime(i10, null);
    }

    public OffsetDateTime getOffsetDateTime(int i10) {
        return getOffsetDateTime(i10, null);
    }

    public OffsetTime getOffsetTime(int i10) {
        return getOffsetTime(i10, null);
    }

    public ZonedDateTime getZonedDateTime(int i10) {
        return getZonedDateTime(i10, null);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m6191to(Type type, long j10) {
        if (type == String.class) {
            return (T) toString();
        }
        return (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(type).createInstance(this, j10);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m6190to(Type type) {
        return (T) m6191to(type, 0L);
    }

    public Date getDate(int i10, Date date) {
        Date date2 = getDate(i10);
        return date2 == null ? date : date2;
    }

    public String getString(int i10) {
        return getString(i10, null);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        JSONWriter jSONWriterM6247of = JSONWriter.m6247of();
        try {
            jSONWriterM6247of.setRootObject(this);
            jSONWriterM6247of.write(this);
            String string = jSONWriterM6247of.toString();
            jSONWriterM6247of.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterM6247of != null) {
                try {
                    jSONWriterM6247of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public <T> T getObject(int i10, Type type, JSONReader.Feature... featureArr) {
        T t10 = (T) get(i10);
        if (t10 == null) {
            return null;
        }
        Class<?> cls = t10.getClass();
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls, type);
        if (typeConvert != null) {
            return (T) typeConvert.apply(t10);
        }
        long j10 = JSONFactory.defaultReaderFeatures;
        boolean z10 = false;
        for (JSONReader.Feature feature : featureArr) {
            j10 |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z10 = true;
            }
        }
        if (t10 instanceof Map) {
            return (T) defaultObjectReaderProvider.getObjectReader(type, z10).createInstance((Map) t10, j10);
        }
        if (t10 instanceof Collection) {
            return (T) defaultObjectReaderProvider.getObjectReader(type, z10).createInstance((Collection) t10, j10);
        }
        Class<?> mapping = TypeUtils.getMapping(type);
        if (mapping.isInstance(t10)) {
            return t10;
        }
        JSONReader jSONReaderM6226of = JSONReader.m6226of(JSON.toJSONString(t10));
        jSONReaderM6226of.context.config(featureArr);
        return (T) defaultObjectReaderProvider.getObjectReader(mapping, z10).readObject(jSONReaderM6226of, null, null, 0L);
    }

    public <T> T getObject(int i10, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(i10);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
