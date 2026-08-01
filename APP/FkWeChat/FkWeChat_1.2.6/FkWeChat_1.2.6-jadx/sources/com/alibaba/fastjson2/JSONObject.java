package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplEnum;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class JSONObject extends LinkedHashMap<String, Object> implements InvocationHandler {
    static final long NONE_DIRECT_FEATURES = ((JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask) | JSONWriter.Feature.NotWriteEmptyArray.mask) | JSONWriter.Feature.NotWriteDefaultValue.mask;
    static ObjectReader<JSONArray> arrayReader = null;
    private static final long serialVersionUID = 1;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class NameConsumer implements Consumer<Method> {
        final Annotation annotation;
        String name;

        public NameConsumer(Annotation annotation) {
            this.annotation = annotation;
        }

        @Override // java.util.function.Consumer
        public void accept(Method method) {
            if ("name".equals(method.getName())) {
                try {
                    String str = (String) method.invoke(this.annotation, null);
                    if (str.isEmpty()) {
                        return;
                    }
                    this.name = str;
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    public JSONObject() {
    }

    public static JSONObject from(Object obj) {
        return (JSONObject) JSON.toJSON(obj);
    }

    private String getJSONFieldName(Method method) {
        String strName = null;
        for (Annotation annotation : BeanUtils.getAnnotations(method)) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.findAnnotation(annotation, JSONField.class);
            if (jSONField != null) {
                strName = jSONField.name();
                if (strName.isEmpty()) {
                    strName = null;
                }
            } else if ("com.alibaba.fastjson.annotation.JSONField".equals(clsAnnotationType.getName())) {
                NameConsumer nameConsumer = new NameConsumer(annotation);
                BeanUtils.annotationMethods(clsAnnotationType, nameConsumer);
                String str = nameConsumer.name;
                if (str != null) {
                    strName = str;
                }
            }
        }
        return strName;
    }

    public static void nameFilter(Map map, NameFilter nameFilter) {
        String str;
        String strProcess;
        Iterator it = map.entrySet().iterator();
        JSONObject jSONObject = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                ((JSONObject) value).nameFilter(nameFilter);
            } else if (value instanceof Iterable) {
                nameFilter((Iterable<?>) value, nameFilter);
            }
            if ((key instanceof String) && (strProcess = nameFilter.process(map, (str = (String) key), value)) != null && !strProcess.equals(str)) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put(strProcess, value);
                it.remove();
            }
        }
        if (jSONObject != null) {
            map.putAll(jSONObject);
        }
    }

    /* JADX INFO: renamed from: of */
    private static JSONObject m6193of(JSONObject jSONObject, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            C1569c.m6258a("The kvArray cannot be empty");
            return null;
        }
        int length = objArr.length;
        if ((length & 1) == 1) {
            C1569c.m6258a("The length of kvArray cannot be odd");
            return null;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = i10 + 1;
            Object obj = objArr[i10];
            if (!(obj instanceof String)) {
                C1569c.m6258a("The value corresponding to the even bit index of kvArray is key, which cannot be null and must be of type string");
                return null;
            }
            String str = (String) obj;
            if (z10) {
                if (jSONObject.containsKey(str)) {
                    C1569c.m6258a("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
                    return null;
                }
                jSONObject.put(str, objArr[i11]);
            } else {
                if (jSONObject.put(str, objArr[i11]) != null) {
                    C1569c.m6258a("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
                    return null;
                }
                z10 = objArr[i11] == null;
            }
        }
        return jSONObject;
    }

    public static JSONObject parse(String str, JSONReader.Feature... featureArr) {
        return JSON.parseObject(str, featureArr);
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        return (T) JSON.parseObject(str, (Class) cls);
    }

    public static void valueFilter(Map map, ValueFilter valueFilter) {
        Object objApply;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                valueFilter((Map) value, valueFilter);
            } else if (value instanceof Iterable) {
                valueFilter((Iterable<?>) value, valueFilter);
            }
            if ((key instanceof String) && (objApply = valueFilter.apply(map, (String) key, value)) != value) {
                entry.setValue(objApply);
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public JSONObject clone() {
        return new JSONObject(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) ? super.containsKey(obj) || super.containsKey((Object) obj.toString()) : super.containsKey(obj);
    }

    public void copyTo(Object obj, JSONReader.Feature... featureArr) {
        long jM6243of = JSONFactory.defaultReaderFeatures | JSONReader.Feature.m6243of(featureArr);
        boolean zIsEnabled = JSONReader.Feature.FieldBased.isEnabled(jM6243of);
        JSONFactory.getDefaultObjectReaderProvider().getObjectReader(obj.getClass(), zIsEnabled).accept(obj, this, jM6243of);
    }

    public Object eval(JSONPath jSONPath) {
        return jSONPath.eval(this);
    }

    public JSONObject fluentPut(String str, Object obj) {
        put(str, obj);
        return this;
    }

    public void forEachArrayObject(String str, Consumer<JSONObject> consumer) {
        JSONArray jSONArray = getJSONArray(str);
        if (jSONArray == null) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.size(); i10++) {
            consumer.accept(jSONArray.getJSONObject(i10));
        }
    }

    @Deprecated
    public void forEchArrayObject(String str, Consumer<JSONObject> consumer) {
        forEachArrayObject(str, consumer);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object obj2;
        return (((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) && (obj2 = super.get((Object) obj.toString())) != null) ? obj2 : super.get(obj);
    }

    public BigDecimal getBigDecimal(String str) {
        Object obj = super.get((Object) str);
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

    public BigInteger getBigInteger(String str) {
        Object obj = super.get((Object) str);
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

    public Boolean getBoolean(String str) {
        Object obj = super.get((Object) str);
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
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return null;
        }
        return Boolean.valueOf("true".equalsIgnoreCase(str2) || "1".equals(str2));
    }

    public boolean getBooleanValue(String str) {
        Boolean bool = getBoolean(str);
        return bool != null && bool.booleanValue();
    }

    public Object getByPath(String str) {
        JSONPath jSONPathM6205of = JSONPath.m6205of(str);
        return jSONPathM6205of instanceof JSONPathSingleName ? get(((JSONPathSingleName) jSONPathM6205of).name) : jSONPathM6205of.eval(this);
    }

    public Byte getByte(String str) {
        Object obj = super.get((Object) str);
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

    public byte getByteValue(String str) {
        Byte b10 = getByte(str);
        if (b10 == null) {
            return (byte) 0;
        }
        return b10.byteValue();
    }

    public byte[] getBytes(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return Base64.getDecoder().decode((String) obj);
        }
        C1605j.m6294a("can not cast to byte[], value : ", obj);
        return null;
    }

    public Date getDate(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        return obj instanceof Date ? (Date) obj : obj instanceof String ? DateUtils.parseDate((String) obj) : obj instanceof Number ? new Date(((Number) obj).longValue()) : TypeUtils.toDate(obj);
    }

    public Double getDouble(String str) {
        Object obj = super.get((Object) str);
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

    public double getDoubleValue(String str) {
        Double d10 = getDouble(str);
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    public Float getFloat(String str) {
        Object obj = super.get((Object) str);
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

    public float getFloatValue(String str) {
        Float f10 = getFloat(str);
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public Instant getInstant(String str) {
        Object obj = super.get((Object) str);
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

    public int getIntValue(String str, int i10) {
        Object obj = super.get((Object) str);
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (!(obj instanceof String)) {
                C1571d.m6259a("Can not cast '", obj.getClass(), "' to int value");
                return 0;
            }
            String strTrim = ((String) obj).trim();
            if (!strTrim.isEmpty() && !"null".equalsIgnoreCase(strTrim)) {
                return strTrim.indexOf(46) != -1 ? (int) Double.parseDouble(strTrim) : Integer.parseInt(strTrim);
            }
        }
        return i10;
    }

    public Integer getInteger(String str) {
        Object obj = super.get((Object) str);
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

    public JSONArray getJSONArray(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof JSONObject) {
            return JSONArray.m6185of(obj);
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            if (str2.charAt(0) != '[') {
                return JSONArray.m6185of((Object) str2);
            }
            JSONReader jSONReaderM6226of = JSONReader.m6226of(str2);
            if (arrayReader == null) {
                arrayReader = jSONReaderM6226of.getObjectReader(JSONArray.class);
            }
            return arrayReader.readObject(jSONReaderM6226of, null, null, 0L);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray((Collection<?>) obj);
            put(str, jSONArray);
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArrayM6188of = JSONArray.m6188of((Object[]) obj);
            put(str, jSONArrayM6188of);
            return jSONArrayM6188of;
        }
        if (!obj.getClass().isArray()) {
            return null;
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray2 = new JSONArray(length);
        for (int i10 = 0; i10 < length; i10++) {
            jSONArray2.add(Array.get(obj, i10));
        }
        put(str, jSONArray2);
        return jSONArray2;
    }

    public JSONObject getJSONObject(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            return JSONFactory.OBJECT_READER.readObject(JSONReader.m6226of(str2), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            put(str, jSONObject);
            return jSONObject;
        }
        ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
        if (!(objectWriter instanceof ObjectWriterAdapter)) {
            return null;
        }
        JSONObject jSONObject2 = ((ObjectWriterAdapter) objectWriter).toJSONObject(obj);
        put(str, jSONObject2);
        return jSONObject2;
    }

    public <T> List<T> getList(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        JSONArray jSONArray = getJSONArray(str);
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.toList(cls, featureArr);
    }

    public LocalDate getLocalDate(String str, LocalDate localDate) {
        Object obj = super.get((Object) str);
        return obj == null ? localDate : obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) TypeUtils.cast(obj, LocalDate.class);
    }

    public LocalDateTime getLocalDateTime(String str, LocalDateTime localDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? localDateTime : obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) TypeUtils.cast(obj, LocalDateTime.class);
    }

    public LocalTime getLocalTime(String str, LocalTime localTime) {
        Object obj = super.get((Object) str);
        return obj == null ? localTime : obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) TypeUtils.cast(obj, LocalTime.class);
    }

    public Long getLong(String str) {
        Object obj = super.get((Object) str);
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

    public long getLongValue(String str, long j10) {
        Object obj = super.get((Object) str);
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            if (!(obj instanceof String)) {
                C1571d.m6259a("Can not cast '", obj.getClass(), "' to long value");
                return 0L;
            }
            String strTrim = ((String) obj).trim();
            if (!strTrim.isEmpty() && !"null".equalsIgnoreCase(strTrim)) {
                return strTrim.indexOf(46) != -1 ? (long) Double.parseDouble(strTrim) : Long.parseLong(strTrim);
            }
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        T t10 = (T) super.get((Object) str);
        ObjectReader objectReader = null;
        if (t10 == 0) {
            return null;
        }
        if (cls != Object.class || featureArr.length != 0) {
            int length = featureArr.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (featureArr[i10] == JSONReader.Feature.FieldBased) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            Class<?> cls2 = t10.getClass();
            ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
            Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls2, cls);
            if (typeConvert != null) {
                return (T) typeConvert.apply(t10);
            }
            if (t10 instanceof Map) {
                return (T) defaultObjectReaderProvider.getObjectReader(cls, z10).createInstance((Map) t10, featureArr);
            }
            if (t10 instanceof Collection) {
                return (T) defaultObjectReaderProvider.getObjectReader(cls, z10).createInstance((Collection) t10, featureArr);
            }
            Class<?> mapping = TypeUtils.getMapping(cls);
            if (!mapping.isInstance(t10)) {
                if (t10 instanceof String) {
                    String str2 = (String) t10;
                    if (str2.isEmpty() || "null".equals(str2)) {
                        return null;
                    }
                    if (mapping.isEnum()) {
                        objectReader = defaultObjectReaderProvider.getObjectReader(mapping, z10);
                        if (objectReader instanceof ObjectReaderImplEnum) {
                            return (T) ((ObjectReaderImplEnum) objectReader).getEnumByHashCode(Fnv.hashCode64(str2));
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
        }
        return t10;
    }

    public OffsetDateTime getOffsetDateTime(String str, OffsetDateTime offsetDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? offsetDateTime : obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) TypeUtils.cast(obj, OffsetDateTime.class);
    }

    public OffsetTime getOffsetTime(String str, OffsetTime offsetTime) {
        Object obj = super.get((Object) str);
        return obj == null ? offsetTime : obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) TypeUtils.cast(obj, OffsetTime.class);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public Object getOrDefault(Object obj, Object obj2) {
        return ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) ? super.getOrDefault((Object) obj.toString(), obj2) : super.getOrDefault(obj, obj2);
    }

    public Short getShort(String str) {
        Object obj = super.get((Object) str);
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

    public short getShortValue(String str) {
        Short sh = getShort(str);
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    public int getSize(String str) {
        Object obj = get(str);
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).size();
        }
        return 0;
    }

    public String getString(String str, String str2) {
        Object obj = super.get((Object) str);
        return obj == null ? str2 : obj instanceof String ? (String) obj : obj instanceof Date ? DateUtils.toString(((Date) obj).getTime(), false, DateUtils.DEFAULT_ZONE_ID) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum) || (obj instanceof TemporalAccessor)) ? obj.toString() : JSON.toJSONString(obj);
    }

    public ZonedDateTime getZonedDateTime(String str, ZonedDateTime zonedDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? zonedDateTime : obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) TypeUtils.cast(obj, ZonedDateTime.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r10, java.lang.reflect.Method r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONObject.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }

    public boolean isArray(Object obj) {
        Object obj2 = super.get(obj);
        if (obj2 instanceof JSONArray) {
            return true;
        }
        return obj2 != null && obj2.getClass().isArray();
    }

    public boolean isValid(JSONSchema jSONSchema) {
        return jSONSchema.isValid(this);
    }

    public JSONArray putArray(String str) {
        JSONArray jSONArray = new JSONArray();
        put(str, jSONArray);
        return jSONArray;
    }

    public JSONObject putObject(String str) {
        JSONObject jSONObject = new JSONObject();
        put(str, jSONObject);
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public <T> T m6201to(Class<T> cls, JSONReader.Feature... featureArr) {
        long jM6243of = JSONFactory.defaultReaderFeatures | JSONReader.Feature.m6243of(featureArr);
        boolean zIsEnabled = JSONReader.Feature.FieldBased.isEnabled(jM6243of);
        if (cls == String.class) {
            return (T) toString();
        }
        if (cls == JSON.class) {
            return this;
        }
        if (cls == Void.class || cls == Void.TYPE) {
            return null;
        }
        return (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(cls, zIsEnabled).createInstance(this, jM6243of);
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

    public <T> T toJavaObject(Class<T> cls, JSONReader.Feature... featureArr) {
        return (T) m6201to((Class) cls, featureArr);
    }

    @Override // java.util.AbstractMap
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

    public JSONObject(int i10) {
        super(i10);
    }

    public JSONObject(int i10, float f10) {
        super(i10, f10);
    }

    public static <T> T parseObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(str, (Class) cls, featureArr);
    }

    public static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        return JSON.toJSONString(obj, featureArr);
    }

    public <T> T toJavaObject(Type type, JSONReader.Feature... featureArr) {
        return (T) m6202to(type, featureArr);
    }

    public JSONObject(int i10, float f10, boolean z10) {
        super(i10, f10, z10);
    }

    public static <T> T parseObject(String str, Type type, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(str, type, featureArr);
    }

    public <T> T toJavaObject(TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        return (T) m6200to(typeReference, featureArr);
    }

    public JSONObject(Map map) {
        super(map);
    }

    public static JSONObject from(Object obj, JSONWriter.Feature... featureArr) {
        return (JSONObject) JSON.toJSON(obj, featureArr);
    }

    public static <T> T parseObject(String str, TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(str, typeReference, featureArr);
    }

    public static JSONObject parseObject(String str) {
        return JSON.parseObject(str);
    }

    public boolean getBooleanValue(String str, boolean z10) {
        Boolean bool = getBoolean(str);
        return bool == null ? z10 : bool.booleanValue();
    }

    public LocalDate getLocalDate(String str) {
        return getLocalDate(str, null);
    }

    public LocalDateTime getLocalDateTime(String str) {
        return getLocalDateTime(str, null);
    }

    public LocalTime getLocalTime(String str) {
        return getLocalTime(str, null);
    }

    public OffsetDateTime getOffsetDateTime(String str) {
        return getOffsetDateTime(str, null);
    }

    public OffsetTime getOffsetTime(String str) {
        return getOffsetTime(str, null);
    }

    public ZonedDateTime getZonedDateTime(String str) {
        return getZonedDateTime(str, null);
    }

    public String toString(JSONWriter.Feature... featureArr) {
        JSONWriter jSONWriterM6250of = JSONWriter.m6250of(featureArr);
        try {
            jSONWriterM6250of.setRootObject(this);
            jSONWriterM6250of.write(this);
            String string = jSONWriterM6250of.toString();
            jSONWriterM6250of.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterM6250of != null) {
                try {
                    jSONWriterM6250of.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, obj);
    }

    public Object get(String str) {
        return super.get((Object) str);
    }

    public boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public Date getDate(String str, Date date) {
        Date date2 = getDate(str);
        return date2 == null ? date : date2;
    }

    /* JADX INFO: renamed from: to */
    public <T> T m6202to(Type type, JSONReader.Feature... featureArr) {
        long j10 = JSONFactory.defaultReaderFeatures;
        boolean z10 = false;
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.FieldBased) {
                z10 = true;
            }
            j10 |= feature.mask;
        }
        if (type == String.class) {
            return (T) toString();
        }
        return (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(type, z10).createInstance(this, j10);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m6200to(TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        return (T) m6202to(typeReference.getType(), featureArr);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m6203to(Function<JSONObject, T> function) {
        return function.apply(this);
    }

    public static void valueFilter(Iterable<?> iterable, ValueFilter valueFilter) {
        for (Object obj : iterable) {
            if (obj instanceof Map) {
                valueFilter((Map) obj, valueFilter);
            } else if (obj instanceof Iterable) {
                valueFilter((Iterable<?>) obj, valueFilter);
            }
        }
    }

    public String getString(String str) {
        return getString(str, null);
    }

    public void valueFilter(ValueFilter valueFilter) {
        valueFilter(this, valueFilter);
    }

    public int getIntValue(String str) {
        return getIntValue(str, 0);
    }

    public long getLongValue(String str) {
        return getLongValue(str, 0L);
    }

    public static void nameFilter(Iterable<?> iterable, NameFilter nameFilter) {
        for (Object obj : iterable) {
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).nameFilter(nameFilter);
            } else if (obj instanceof Iterable) {
                nameFilter((Iterable<?>) obj, nameFilter);
            }
        }
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m6194of(String str, Object obj) {
        JSONObject jSONObject = new JSONObject(1, 1.0f);
        jSONObject.put(str, obj);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m6195of(String str, Object obj, String str2, Object obj2) {
        JSONObject jSONObject = new JSONObject(2, 1.0f);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m6196of(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        JSONObject jSONObject = new JSONObject(3);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        return jSONObject;
    }

    public void nameFilter(NameFilter nameFilter) {
        nameFilter(this, nameFilter);
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m6197of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        JSONObject jSONObject = new JSONObject(4, 1.0f);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m6198of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m6199of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5, Object... objArr) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        if (objArr != null && objArr.length > 0) {
            m6193of(jSONObject, objArr);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m6192of() {
        return new JSONObject();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getObject(String str, Type type, JSONReader.Feature... featureArr) {
        T t10 = (T) super.get((Object) str);
        if (t10 == 0) {
            return null;
        }
        if (type != Object.class || featureArr.length != 0) {
            int length = featureArr.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (featureArr[i10] == JSONReader.Feature.FieldBased) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            Class<?> cls = t10.getClass();
            ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
            Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls, type);
            if (typeConvert != null) {
                return (T) typeConvert.apply(t10);
            }
            if (t10 instanceof Map) {
                return (T) defaultObjectReaderProvider.getObjectReader(type, z10).createInstance((Map) t10, featureArr);
            }
            if (t10 instanceof Collection) {
                return (T) defaultObjectReaderProvider.getObjectReader(type, z10).createInstance((Collection) t10, featureArr);
            }
            if (!(type instanceof Class) || !((Class) type).isInstance(t10)) {
                if (t10 instanceof String) {
                    String str2 = (String) t10;
                    if (str2.isEmpty() || "null".equals(str2)) {
                        return null;
                    }
                }
                JSONReader jSONReaderM6226of = JSONReader.m6226of(JSON.toJSONString(t10));
                jSONReaderM6226of.context.config(featureArr);
                return (T) defaultObjectReaderProvider.getObjectReader(type, z10).readObject(jSONReaderM6226of, null, null, 0L);
            }
        }
        return t10;
    }

    public <T> T getObject(String str, TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        return (T) getObject(str, typeReference.type, featureArr);
    }

    public <T> T getObject(String str, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(str);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
