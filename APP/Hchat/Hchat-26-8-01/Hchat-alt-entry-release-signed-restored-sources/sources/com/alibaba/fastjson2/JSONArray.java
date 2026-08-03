package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplEnum;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JSONArray extends ArrayList<Object> {
    static ObjectWriter<JSONArray> arrayWriter = null;
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray(Object... objArr) {
        super(objArr.length);
        for (Object obj : objArr) {
            super.add(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONArray copyOf(Collection collection) {
        return new JSONArray((Collection<?>) collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONArray from(Object obj) {
        return (JSONArray) JSON.toJSON(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static JSONArray m1635of(Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray = new JSONArray(3);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        jSONArray.add(obj3);
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONArray parse(String str, JSONReader.Feature... featureArr) {
        return JSON.parseArray(str, featureArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONArray parseArray(String str, JSONReader.Feature... featureArr) {
        return JSON.parseArray(str, featureArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray addArray() {
        JSONArray jSONArray = new JSONArray();
        add(jSONArray);
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONObject addObject() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList
    public Object clone() {
        return new JSONArray(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray fluentAdd(Object obj) {
        add(obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray fluentAddAll(Collection<?> collection) {
        addAll(collection);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray fluentClear() {
        clear();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray fluentRemove(int i9) {
        remove(i9);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray fluentRemoveAll(Collection<?> collection) {
        removeAll(collection);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray fluentSet(int i9, Object obj) {
        set(i9, obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BigDecimal getBigDecimal(int i9) {
        Object obj = get(i9);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return obj instanceof BigDecimal ? (BigDecimal) obj : obj instanceof BigInteger ? new BigDecimal((BigInteger) obj) : obj instanceof Float ? TypeUtils.toBigDecimal(((Float) obj).floatValue()) : obj instanceof Double ? TypeUtils.toBigDecimal(((Double) obj).doubleValue()) : BigDecimal.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return TypeUtils.toBigDecimal((String) obj);
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
        }
        C0086a.m464w(AbstractC0255e.m1019h(obj, "' to BigDecimal", new StringBuilder("Can not cast '")));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BigInteger getBigInteger(int i9) {
        Object obj = get(i9);
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to BigInteger", new StringBuilder("Can not cast '")));
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return new BigInteger(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Boolean getBoolean(int i9) {
        Object obj = get(i9);
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to boolean", new StringBuilder("Can not cast '")));
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return Boolean.valueOf("true".equalsIgnoreCase(str) || "1".equals(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getBooleanValue(int i9) {
        Boolean bool = getBoolean(i9);
        return bool != null && bool.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Byte getByte(int i9) {
        Object obj = get(i9);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to byte", new StringBuilder("Can not cast '")));
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte getByteValue(int i9) {
        Byte b10 = getByte(i9);
        if (b10 == null) {
            return (byte) 0;
        }
        return b10.byteValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Date getDate(int i9) {
        Object obj = get(i9);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Double getDouble(int i9) {
        Object obj = get(i9);
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to double", new StringBuilder("Can not cast '")));
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public double getDoubleValue(int i9) {
        Double d10 = getDouble(i9);
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Float getFloat(int i9) {
        Object obj = get(i9);
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to float", new StringBuilder("Can not cast '")));
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getFloatValue(int i9) {
        Float f3 = getFloat(i9);
        if (f3 == null) {
            return 0.0f;
        }
        return f3.floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Instant getInstant(int i9) {
        Object obj = get(i9);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getIntValue(int i9) {
        Object obj = get(i9);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String)) {
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to int value", new StringBuilder("Can not cast '")));
            return 0;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return 0;
        }
        return str.indexOf(46) != -1 ? (int) Double.parseDouble(str) : Integer.parseInt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Integer getInteger(int i9) {
        Object obj = get(i9);
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to Integer", new StringBuilder("Can not cast '")));
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return str.indexOf(46) != -1 ? Integer.valueOf((int) Double.parseDouble(str)) : Integer.valueOf(Integer.parseInt(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray getJSONArray(int i9) {
        Object obj = get(i9);
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
                return m1633of((Object) str);
            }
            return JSONFactory.ARRAY_READER.readObject(JSONReader.m1666of(str), null, null, 0L);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray((Collection<?>) obj);
            set(i9, jSONArray);
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArrayM1636of = m1636of((Object[]) obj);
            set(i9, jSONArrayM1636of);
            return jSONArrayM1636of;
        }
        if (!obj.getClass().isArray()) {
            return null;
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray2 = new JSONArray(length);
        for (int i10 = 0; i10 < length; i10++) {
            jSONArray2.add(Array.get(obj, i10));
        }
        set(i9, jSONArray2);
        return jSONArray2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONObject getJSONObject(int i9) {
        Object obj = get(i9);
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
            return JSONFactory.OBJECT_READER.readObject(JSONReader.m1666of(str), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            set(i9, jSONObject);
            return jSONObject;
        }
        ObjectWriter objectWriter = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter((Class) obj.getClass());
        JSONObject jSONObject2 = objectWriter instanceof ObjectWriterAdapter ? ((ObjectWriterAdapter) objectWriter).toJSONObject(obj) : (JSONObject) JSON.toJSON(obj);
        set(i9, jSONObject2);
        return jSONObject2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LocalDate getLocalDate(int i9, LocalDate localDate) {
        Object obj = super.get(i9);
        return obj == null ? localDate : obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) TypeUtils.cast(obj, LocalDate.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LocalDateTime getLocalDateTime(int i9, LocalDateTime localDateTime) {
        Object obj = super.get(i9);
        return obj == null ? localDateTime : obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) TypeUtils.cast(obj, LocalDateTime.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LocalTime getLocalTime(int i9, LocalTime localTime) {
        Object obj = super.get(i9);
        return obj == null ? localTime : obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) TypeUtils.cast(obj, LocalTime.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Long getLong(int i9) {
        Object obj = get(i9);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
                return null;
            }
            return str.indexOf(46) != -1 ? Long.valueOf((long) Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
        }
        if (!(obj instanceof Boolean)) {
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to Long", new StringBuilder("Can not cast '")));
            return null;
        }
        if (((Boolean) obj).booleanValue()) {
            return Long.valueOf(serialVersionUID);
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getLongValue(int i9) {
        Object obj = get(i9);
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (!(obj instanceof String)) {
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to long value", new StringBuilder("Can not cast '")));
            return 0L;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return 0L;
        }
        return str.indexOf(46) != -1 ? (long) Double.parseDouble(str) : Long.parseLong(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T> T getObject(int i9, Class<T> cls, JSONReader.Feature... featureArr) {
        T t9 = (T) get(i9);
        ObjectReader objectReader = null;
        if (t9 == 0) {
            return null;
        }
        Class<?> cls2 = t9.getClass();
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Function typeConvert = objectReaderProvider.getTypeConvert(cls2, cls);
        if (typeConvert != null) {
            return (T) typeConvert.apply(t9);
        }
        long j3 = 0;
        boolean z9 = false;
        for (JSONReader.Feature feature : featureArr) {
            j3 |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z9 = true;
            }
        }
        if (t9 instanceof Map) {
            return (T) objectReaderProvider.getObjectReader(cls, z9).createInstance((Map) t9, j3);
        }
        if (t9 instanceof Collection) {
            return (T) objectReaderProvider.getObjectReader(cls, z9).createInstance((Collection) t9, featureArr);
        }
        Class<?> mapping = TypeUtils.getMapping(cls);
        if (mapping.isInstance(t9)) {
            return t9;
        }
        if (t9 instanceof String) {
            String str = (String) t9;
            if (str.isEmpty() || "null".equals(str)) {
                return null;
            }
            if (mapping.isEnum()) {
                objectReader = objectReaderProvider.getObjectReader(mapping, z9);
                if (objectReader instanceof ObjectReaderImplEnum) {
                    return (T) ((ObjectReaderImplEnum) objectReader).getEnumByHashCode(Fnv.hashCode64(str));
                }
            }
        }
        String jSONString = JSON.toJSONString(t9);
        JSONReader jSONReaderM1666of = JSONReader.m1666of(jSONString);
        jSONReaderM1666of.context.config(featureArr);
        if (objectReader == null) {
            objectReader = objectReaderProvider.getObjectReader(mapping, z9);
        }
        T t10 = (T) objectReader.readObject(jSONReaderM1666of, null, null, 0L);
        if (jSONReaderM1666of.isEnd()) {
            return t10;
        }
        C0086a.m464w(AbstractC4855en.m9263g("not support input ", jSONString));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OffsetDateTime getOffsetDateTime(int i9, OffsetDateTime offsetDateTime) {
        Object obj = super.get(i9);
        return obj == null ? offsetDateTime : obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) TypeUtils.cast(obj, OffsetDateTime.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OffsetTime getOffsetTime(int i9, OffsetTime offsetTime) {
        Object obj = super.get(i9);
        return obj == null ? offsetTime : obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) TypeUtils.cast(obj, OffsetTime.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Short getShort(int i9) {
        Object obj = get(i9);
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to short", new StringBuilder("Can not cast '")));
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public short getShortValue(int i9) {
        Short sh2 = getShort(i9);
        if (sh2 == null) {
            return (short) 0;
        }
        return sh2.shortValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getString(int i9, String str) {
        Object obj = get(i9);
        return obj == null ? str : obj instanceof String ? (String) obj : obj instanceof Date ? DateUtils.toString(((Date) obj).getTime(), false, DateUtils.DEFAULT_ZONE_ID) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum)) ? obj.toString() : JSON.toJSONString(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ZonedDateTime getZonedDateTime(int i9, ZonedDateTime zonedDateTime) {
        Object obj = super.get(i9);
        return obj == null ? zonedDateTime : obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) TypeUtils.cast(obj, ZonedDateTime.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i9, Object obj) {
        int size = super.size();
        if (i9 < 0) {
            int i10 = i9 + size;
            if (i10 >= 0) {
                return super.set(i10, obj);
            }
            super.add(0, obj);
            return null;
        }
        if (i9 < size) {
            return super.set(i9, obj);
        }
        if (i9 < size + 4096) {
            while (true) {
                int i11 = i9 - 1;
                if (i9 == size) {
                    break;
                }
                super.add(null);
                i9 = i11;
            }
            super.add(obj);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: to */
    public <T> T m1639to(Type type, long j3) {
        return type == String.class ? (T) toString() : (T) JSONFactory.getDefaultObjectReaderProvider().getObjectReader(type).createInstance(this, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: T[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.function.Function */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] toArray(Class<T> cls, JSONReader.Feature... featureArr) {
        long j3 = 0;
        boolean z9 = false;
        for (JSONReader.Feature feature : featureArr) {
            j3 |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z9 = true;
            }
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, z9);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, size()));
        for (int i9 = 0; i9 < size(); i9++) {
            Object objCreateInstance = get(i9);
            if ((objCreateInstance instanceof JSONObject) || (objCreateInstance instanceof Map)) {
                objCreateInstance = objectReader.createInstance((Map) objCreateInstance, j3);
            } else {
                if (objCreateInstance != null && !cls.isInstance(objCreateInstance)) {
                    Class<?> cls2 = objCreateInstance.getClass();
                    Function typeConvert = objectReaderProvider.getTypeConvert(cls2, cls);
                    if (typeConvert == 0) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    tArr[i9] = typeConvert.apply(objCreateInstance);
                }
            }
            tArr[i9] = objCreateInstance;
        }
        return tArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] toJSONBBytes(JSONWriter.Feature... featureArr) {
        JSONWriter jSONWriterOfJSONB = JSONWriter.ofJSONB(featureArr);
        try {
            jSONWriterOfJSONB.setRootObject(this);
            jSONWriterOfJSONB.write(this);
            byte[] bytes = jSONWriterOfJSONB.getBytes();
            jSONWriterOfJSONB.close();
            return bytes;
        } catch (Throwable th2) {
            if (jSONWriterOfJSONB != null) {
                try {
                    jSONWriterOfJSONB.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toJSONString(JSONWriter.Feature... featureArr) {
        return toString(featureArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> List<T> toJavaList(Class<T> cls, JSONReader.Feature... featureArr) {
        return toList(cls, featureArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public <T> T toJavaObject(Type type) {
        return (T) m1638to(type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.function.Function */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> List<T> toList(Class<T> cls, JSONReader.Feature... featureArr) {
        long j3 = 0;
        boolean z9 = false;
        for (JSONReader.Feature feature : featureArr) {
            j3 |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z9 = true;
            }
        }
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        ObjectReader objectReader = objectReaderProvider.getObjectReader(cls, z9);
        ArrayList arrayList = new ArrayList(size());
        for (int i9 = 0; i9 < size(); i9++) {
            Object objCreateInstance = get(i9);
            if ((objCreateInstance instanceof JSONObject) || (objCreateInstance instanceof Map)) {
                objCreateInstance = objectReader.createInstance((Map) objCreateInstance, j3);
            } else {
                if (objCreateInstance != null && !cls.isInstance(objCreateInstance)) {
                    Class<?> cls2 = objCreateInstance.getClass();
                    Function typeConvert = objectReaderProvider.getTypeConvert(cls2, cls);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    public String toString(JSONWriter.Feature... featureArr) {
        JSONWriter jSONWriterM1687of = JSONWriter.m1687of(featureArr);
        try {
            if (((JSONWriter.Feature.ReferenceDetection.mask | JSONWriter.Feature.PrettyFormat.mask | JSONWriter.Feature.NotWriteEmptyArray.mask | JSONWriter.Feature.NotWriteDefaultValue.mask) & jSONWriterM1687of.context.features) == 0) {
                jSONWriterM1687of.write(this);
            } else {
                jSONWriterM1687of.setRootObject(this);
                if (arrayWriter == null) {
                    arrayWriter = jSONWriterM1687of.getObjectWriter(JSONArray.class, JSONArray.class);
                }
                arrayWriter.write(jSONWriterM1687of, this, null, null, 0L);
            }
            String string = jSONWriterM1687of.toString();
            jSONWriterM1687of.close();
            return string;
        } catch (Throwable th2) {
            if (jSONWriterM1687of == null) {
                throw th2;
            }
            try {
                jSONWriterM1687of.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
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

    /* JADX INFO: renamed from: of */
    public static JSONArray m1633of(Object obj) {
        JSONArray jSONArray = new JSONArray(1);
        jSONArray.add(obj);
        return jSONArray;
    }

    public JSONArray(int i9) {
        super(i9);
    }

    public JSONArray(Collection<?> collection) {
        super(collection);
    }

    /* JADX INFO: renamed from: of */
    public static JSONArray m1634of(Object obj, Object obj2) {
        JSONArray jSONArray = new JSONArray(2);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        return jSONArray;
    }

    public JSONArray() {
    }

    /* JADX INFO: renamed from: of */
    public static JSONArray m1636of(Object... objArr) {
        return new JSONArray(objArr);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m1638to(Type type) {
        return (T) m1639to(type, 0L);
    }

    public LocalDate getLocalDate(int i9) {
        return getLocalDate(i9, null);
    }

    public LocalDateTime getLocalDateTime(int i9) {
        return getLocalDateTime(i9, null);
    }

    public LocalTime getLocalTime(int i9) {
        return getLocalTime(i9, null);
    }

    public OffsetDateTime getOffsetDateTime(int i9) {
        return getOffsetDateTime(i9, null);
    }

    public OffsetTime getOffsetTime(int i9) {
        return getOffsetTime(i9, null);
    }

    public ZonedDateTime getZonedDateTime(int i9) {
        return getZonedDateTime(i9, null);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m1637to(Class<T> cls) {
        if (cls == String.class) {
            return (T) toString();
        }
        return (T) JSONFactory.defaultObjectReaderProvider.getObjectReader(cls).createInstance(this);
    }

    public Date getDate(int i9, Date date) {
        Date date2 = getDate(i9);
        return date2 == null ? date : date2;
    }

    public String getString(int i9) {
        return getString(i9, null);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        JSONWriter jSONWriterM1684of = JSONWriter.m1684of();
        try {
            jSONWriterM1684of.setRootObject(this);
            jSONWriterM1684of.write(this);
            String string = jSONWriterM1684of.toString();
            jSONWriterM1684of.close();
            return string;
        } catch (Throwable th2) {
            if (jSONWriterM1684of != null) {
                try {
                    jSONWriterM1684of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T> T getObject(int i9, Type type, JSONReader.Feature... featureArr) {
        T t9 = (T) get(i9);
        if (t9 == null) {
            return null;
        }
        Class<?> cls = t9.getClass();
        ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
        Function typeConvert = objectReaderProvider.getTypeConvert(cls, type);
        if (typeConvert != null) {
            return (T) typeConvert.apply(t9);
        }
        long j3 = 0;
        boolean z9 = false;
        for (JSONReader.Feature feature : featureArr) {
            j3 |= feature.mask;
            if (feature == JSONReader.Feature.FieldBased) {
                z9 = true;
            }
        }
        if (t9 instanceof Map) {
            return (T) objectReaderProvider.getObjectReader(type, z9).createInstance((Map) t9, j3);
        }
        if (t9 instanceof Collection) {
            return (T) objectReaderProvider.getObjectReader(type, z9).createInstance((Collection) t9, featureArr);
        }
        Class<?> mapping = TypeUtils.getMapping(type);
        if (mapping.isInstance(t9)) {
            return t9;
        }
        JSONReader jSONReaderM1666of = JSONReader.m1666of(JSON.toJSONString(t9));
        jSONReaderM1666of.context.config(featureArr);
        return (T) objectReaderProvider.getObjectReader(mapping, z9).readObject(jSONReaderM1666of, null, null, 0L);
    }

    public <T> T getObject(int i9, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(i9);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
