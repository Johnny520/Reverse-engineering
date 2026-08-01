package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.reader.C2801;
import com.alibaba.fastjson2.reader.InterfaceC2787;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2826;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
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
import java.util.Arrays;
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
import p279.InterfaceC8366;
import p291.C8532;
import p291.InterfaceC8531;
import p296.AbstractC8588;
import p296.AbstractC8592;
import p296.InterfaceC8591;
import p296.InterfaceC8594;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class JSONObject extends LinkedHashMap<String, Object> implements InvocationHandler {
    static final long NONE_DIRECT_FEATURES = ((JSONWriter$Feature.ReferenceDetection.mask | JSONWriter$Feature.PrettyFormat.mask) | JSONWriter$Feature.NotWriteEmptyArray.mask) | JSONWriter$Feature.NotWriteDefaultValue.mask;
    static InterfaceC2787 arrayReader = null;
    private static final long serialVersionUID = 1;

    public JSONObject() {
    }

    public static JSONObject from(Object obj) {
        return (JSONObject) InterfaceC2915.m6313(obj, null);
    }

    private String getJSONFieldName(Method method) {
        String strName = null;
        for (Annotation annotation : AbstractC2864.m5775(method)) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC8366 interfaceC8366 = (InterfaceC8366) AbstractC2864.m5774(annotation, InterfaceC8366.class);
            if (interfaceC8366 != null) {
                strName = interfaceC8366.name();
                if (strName.isEmpty()) {
                    strName = null;
                }
            } else if ("com.alibaba.fastjson.annotation.JSONField".equals(clsAnnotationType.getName())) {
                C2922 c2922 = new C2922(annotation);
                AbstractC2864.m5766(clsAnnotationType, c2922);
                String str = c2922.f9263;
                if (str != null) {
                    strName = str;
                }
            }
        }
        return strName;
    }

    public static void nameFilter(Map map, InterfaceC8591 interfaceC8591) {
        String str;
        String strM14133;
        Iterator it = map.entrySet().iterator();
        JSONObject jSONObject = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                ((JSONObject) value).nameFilter(interfaceC8591);
            } else if (value instanceof Iterable) {
                nameFilter((Iterable<?>) value, interfaceC8591);
            }
            if ((key instanceof String) && (strM14133 = ((AbstractC8592) interfaceC8591).m14133(map, (str = (String) key), value)) != null && !strM14133.equals(str)) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put(strM14133, value);
                it.remove();
            }
        }
        if (jSONObject != null) {
            map.putAll(jSONObject);
        }
    }

    private static JSONObject of(JSONObject jSONObject, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            C0276.m849("The kvArray cannot be empty");
            return null;
        }
        int length = objArr.length;
        if ((length & 1) == 1) {
            C0276.m849("The length of kvArray cannot be odd");
            return null;
        }
        boolean z = false;
        for (int i = 0; i < length; i += 2) {
            int i2 = i + 1;
            Object obj = objArr[i];
            if (!(obj instanceof String)) {
                C0276.m849("The value corresponding to the even bit index of kvArray is key, which cannot be null and must be of type string");
                return null;
            }
            String str = (String) obj;
            if (z) {
                if (jSONObject.containsKey(str)) {
                    C0276.m849("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
                    return null;
                }
                jSONObject.put(str, objArr[i2]);
            } else {
                if (jSONObject.put(str, objArr[i2]) != null) {
                    C0276.m849("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
                    return null;
                }
                z = objArr[i2] == null;
            }
        }
        return jSONObject;
    }

    public static JSONObject parse(String str, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2942 c2942M6330 = AbstractC2932.m6330(jSONReader$FeatureArr);
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, c2942M6330);
        try {
            if (abstractC2898M6047.mo6087()) {
                abstractC2898M6047.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            abstractC2898M6047.mo6074(jSONObject, 0L);
            if (abstractC2898M6047.f9198 != null) {
                abstractC2898M6047.m6137(jSONObject);
            }
            if (abstractC2898M6047.f9191 != 26 && (c2942M6330.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
            }
            abstractC2898M6047.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                abstractC2898M6047.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static <T> T parseObject(String str, Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2942 c2942M6330 = AbstractC2932.m6330(jSONReader$FeatureArr);
        InterfaceC2787 interfaceC2787M5588 = ((C2801) c2942M6330.f9316).m5588(cls, (c2942M6330.f9318 & JSONReader$Feature.FieldBased.mask) != 0);
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, c2942M6330);
        try {
            T t = (T) interfaceC2787M5588.mo5418(abstractC2898M6047, cls, null, 0L);
            if (abstractC2898M6047.f9198 != null) {
                abstractC2898M6047.m6137(t);
            }
            if (abstractC2898M6047.f9191 != 26 && (c2942M6330.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
            }
            abstractC2898M6047.close();
            return t;
        } finally {
        }
    }

    public static void valueFilter(Map map, InterfaceC8594 interfaceC8594) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                valueFilter((Map) value, interfaceC8594);
            } else if (value instanceof Iterable) {
                valueFilter((Iterable<?>) value, interfaceC8594);
            }
            if (key instanceof String) {
                Object objM14132 = ((AbstractC8588) interfaceC8594).m14132(map, (String) key, value);
                if (objM14132 != value) {
                    entry.setValue(objM14132);
                }
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

    public void copyTo(Object obj, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC2932.f9287;
        long jOf = JSONReader$Feature.of(jSONReader$FeatureArr);
        boolean zIsEnabled = JSONReader$Feature.FieldBased.isEnabled(jOf);
        AbstractC2932.m6329().m5588(obj.getClass(), zIsEnabled).m5573(obj, this, jOf);
    }

    public Object eval(AbstractC2921 abstractC2921) {
        return abstractC2921.mo5903(this);
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
        for (int i = 0; i < jSONArray.size(); i++) {
            consumer.accept(jSONArray.getJSONObject(i));
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
        if (!(obj instanceof Number)) {
            if (obj instanceof String) {
                return AbstractC2866.m5868(((String) obj).trim());
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
            }
            C0276.m849(AbstractC2442.m4570(obj, "' to BigDecimal", new StringBuilder("Can not cast '")));
            return null;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        if (!(obj instanceof Float)) {
            return obj instanceof Double ? AbstractC2866.m5870(((Double) obj).doubleValue()) : BigDecimal.valueOf(((Number) obj).longValue());
        }
        float fFloatValue = ((Float) obj).floatValue();
        Class cls = AbstractC2866.f9049;
        byte[] bArr = new byte[15];
        return AbstractC2866.m5888(0, bArr, AbstractC2826.m5630(bArr, 0, fFloatValue));
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
            C0276.m849(AbstractC2442.m4570(obj, "' to BigInteger", new StringBuilder("Can not cast '")));
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
            C0276.m849(AbstractC2442.m4570(obj, "' to boolean", new StringBuilder("Can not cast '")));
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
        AbstractC2921 abstractC2921M6320 = AbstractC2921.m6320(str);
        return abstractC2921M6320 instanceof C2944 ? get(((C2944) abstractC2921M6320).f9321) : abstractC2921M6320.mo5903(this);
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
            C0276.m849(AbstractC2442.m4570(obj, "' to byte", new StringBuilder("Can not cast '")));
            return null;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(strTrim));
    }

    public byte getByteValue(String str) {
        Byte b = getByte(str);
        if (b == null) {
            return (byte) 0;
        }
        return b.byteValue();
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
        C0276.m849(AbstractC0053.m153(obj, "can not cast to byte[], value : "));
        return null;
    }

    public Date getDate(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        return obj instanceof Date ? (Date) obj : obj instanceof String ? AbstractC2865.m5823((String) obj) : obj instanceof Number ? new Date(((Number) obj).longValue()) : AbstractC2866.m5874(obj);
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
            C0276.m849(AbstractC2442.m4570(obj, "' to double", new StringBuilder("Can not cast '")));
            return null;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(strTrim));
    }

    public double getDoubleValue(String str) {
        Double d = getDouble(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
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
            C0276.m849(AbstractC2442.m4570(obj, "' to float", new StringBuilder("Can not cast '")));
            return null;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(strTrim));
    }

    public float getFloatValue(String str) {
        Float f = getFloat(str);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
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
            return AbstractC2866.m5861(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0) {
            return null;
        }
        return Instant.ofEpochMilli(jLongValue);
    }

    public int getIntValue(String str, int i) {
        Object obj = super.get((Object) str);
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (!(obj instanceof String)) {
                C0276.m849(AbstractC2442.m4570(obj, "' to int value", new StringBuilder("Can not cast '")));
                return 0;
            }
            String strTrim = ((String) obj).trim();
            if (!strTrim.isEmpty() && !"null".equalsIgnoreCase(strTrim)) {
                return strTrim.indexOf(46) != -1 ? (int) Double.parseDouble(strTrim) : Integer.parseInt(strTrim);
            }
        }
        return i;
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
            C0276.m849(AbstractC2442.m4570(obj, "' to Integer", new StringBuilder("Can not cast '")));
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
            return JSONArray.of(obj);
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            if (str2.charAt(0) != '[') {
                return JSONArray.of((Object) str2);
            }
            AbstractC2898 abstractC2898M6046 = AbstractC2898.m6046(str2);
            if (arrayReader == null) {
                arrayReader = abstractC2898M6046.m6056(JSONArray.class);
            }
            return (JSONArray) arrayReader.mo5418(abstractC2898M6046, null, null, 0L);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray((Collection<?>) obj);
            put(str, jSONArray);
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArrayOf = JSONArray.of((Object[]) obj);
            put(str, jSONArrayOf);
            return jSONArrayOf;
        }
        if (!obj.getClass().isArray()) {
            return null;
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray2 = new JSONArray(length);
        for (int i = 0; i < length; i++) {
            jSONArray2.add(Array.get(obj, i));
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
            return (JSONObject) AbstractC2932.f9279.mo5418(AbstractC2898.m6046(str2), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            put(str, jSONObject);
            return jSONObject;
        }
        Class<?> cls = obj.getClass();
        InterfaceC8531 interfaceC8531M14087 = AbstractC2932.f9292.m14087(cls, cls, false);
        if (!(interfaceC8531M14087 instanceof C8532)) {
            return null;
        }
        JSONObject jSONObjectMo14073 = ((C8532) interfaceC8531M14087).mo14073(obj, 0L);
        put(str, jSONObjectMo14073);
        return jSONObjectMo14073;
    }

    public <T> List<T> getList(String str, Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        JSONArray jSONArray = getJSONArray(str);
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.toList(cls, jSONReader$FeatureArr);
    }

    public LocalDate getLocalDate(String str, LocalDate localDate) {
        Object obj = super.get((Object) str);
        return obj == null ? localDate : obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) AbstractC2866.m5882(LocalDate.class, obj);
    }

    public LocalDateTime getLocalDateTime(String str, LocalDateTime localDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? localDateTime : obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) AbstractC2866.m5882(LocalDateTime.class, obj);
    }

    public LocalTime getLocalTime(String str, LocalTime localTime) {
        Object obj = super.get((Object) str);
        return obj == null ? localTime : obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) AbstractC2866.m5882(LocalTime.class, obj);
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
        if (obj instanceof String) {
            String strTrim = ((String) obj).trim();
            if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
                return null;
            }
            return strTrim.indexOf(46) != -1 ? Long.valueOf((long) Double.parseDouble(strTrim)) : Long.valueOf(Long.parseLong(strTrim));
        }
        if (!(obj instanceof Boolean)) {
            C0276.m849(AbstractC2442.m4570(obj, "' to Long", new StringBuilder("Can not cast '")));
            return null;
        }
        if (((Boolean) obj).booleanValue()) {
            return Long.valueOf(serialVersionUID);
        }
        return 0L;
    }

    public long getLongValue(String str, long j) {
        Object obj = super.get((Object) str);
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            if (!(obj instanceof String)) {
                C0276.m849(AbstractC2442.m4570(obj, "' to long value", new StringBuilder("Can not cast '")));
                return 0L;
            }
            String strTrim = ((String) obj).trim();
            if (!strTrim.isEmpty() && !"null".equalsIgnoreCase(strTrim)) {
                return strTrim.indexOf(46) != -1 ? (long) Double.parseDouble(strTrim) : Long.parseLong(strTrim);
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T getObject(java.lang.String r11, java.lang.Class<T> r12, com.alibaba.fastjson2.JSONReader$Feature... r13) {
        /*
            r10 = this;
            java.lang.Object r10 = super.get(r11)
            r11 = 0
            if (r10 != 0) goto L9
            goto L93
        L9:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r12 != r0) goto L11
            int r0 = r13.length
            if (r0 != 0) goto L11
            goto L63
        L11:
            int r0 = r13.length
            r1 = 0
            r2 = r1
        L14:
            if (r2 >= r0) goto L21
            r3 = r13[r2]
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader$Feature.FieldBased
            if (r3 != r4) goto L1e
            r1 = 1
            goto L21
        L1e:
            int r2 = r2 + 1
            goto L14
        L21:
            java.lang.Class r0 = r10.getClass()
            com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世 r2 = com.alibaba.fastjson2.AbstractC2932.m6329()
            java.util.function.Function r0 = r2.m5586(r0, r12)
            if (r0 == 0) goto L34
            java.lang.Object r10 = r0.apply(r10)
            return r10
        L34:
            boolean r0 = r10 instanceof java.util.Map
            if (r0 == 0) goto L43
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r11 = r2.m5588(r12, r1)
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = r11.m5574(r10, r13)
            return r10
        L43:
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L59
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r11 = r2.m5588(r12, r1)
            java.util.Collection r10 = (java.util.Collection) r10
            r11.getClass()
            long r12 = com.alibaba.fastjson2.JSONReader$Feature.of(r13)
            java.lang.Object r10 = r11.mo5424(r10, r12)
            return r10
        L59:
            java.lang.Class r12 = com.alibaba.fastjson2.util.AbstractC2866.m5897(r12)
            boolean r0 = r12.isInstance(r10)
            if (r0 == 0) goto L64
        L63:
            return r10
        L64:
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L94
            r0 = r10
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L93
            java.lang.String r3 = "null"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L7a
            goto L93
        L7a:
            boolean r3 = r12.isEnum()
            if (r3 == 0) goto L94
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r3 = r2.m5588(r12, r1)
            boolean r4 = r3 instanceof com.alibaba.fastjson2.reader.C2736
            if (r4 == 0) goto L95
            long r10 = com.alibaba.fastjson2.util.AbstractC2859.m5729(r0)
            com.alibaba.fastjson2.reader.飘花落叶言子哲苏世兰楪 r3 = (com.alibaba.fastjson2.reader.C2736) r3
            java.lang.Enum r10 = r3.m5490(r10)
            return r10
        L93:
            return r11
        L94:
            r3 = r11
        L95:
            java.lang.String r10 = com.alibaba.fastjson2.InterfaceC2915.m6317(r10)
            com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏 r5 = com.alibaba.fastjson2.AbstractC2898.m6046(r10)
            com.alibaba.fastjson2.飘花落叶言子苏兰哲世楪 r0 = r5.f9199
            r0.m6354(r13)
            if (r3 != 0) goto La8
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r3 = r2.m5588(r12, r1)
        La8:
            r4 = r3
            r7 = 0
            r8 = 0
            r6 = 0
            java.lang.Object r12 = r4.mo5418(r5, r6, r7, r8)
            boolean r13 = r5.mo6119()
            if (r13 == 0) goto Lb8
            return r12
        Lb8:
            java.lang.String r12 = "not support input "
            java.lang.String r10 = r12.concat(r10)
            androidx.collection.C0276.m849(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONObject.getObject(java.lang.String, java.lang.Class, com.alibaba.fastjson2.JSONReader$Feature[]):java.lang.Object");
    }

    public OffsetDateTime getOffsetDateTime(String str, OffsetDateTime offsetDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? offsetDateTime : obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) AbstractC2866.m5882(OffsetDateTime.class, obj);
    }

    public OffsetTime getOffsetTime(String str, OffsetTime offsetTime) {
        Object obj = super.get((Object) str);
        return obj == null ? offsetTime : obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) AbstractC2866.m5882(OffsetTime.class, obj);
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
            C0276.m849(AbstractC2442.m4570(obj, "' to short", new StringBuilder("Can not cast '")));
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

    public String getString(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : obj instanceof Date ? AbstractC2865.m5841(((Date) obj).getTime(), AbstractC2865.f9025) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum) || (obj instanceof TemporalAccessor)) ? obj.toString() : InterfaceC2915.m6317(obj);
    }

    public ZonedDateTime getZonedDateTime(String str, ZonedDateTime zonedDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? zonedDateTime : obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) AbstractC2866.m5882(ZonedDateTime.class, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cb, code lost:
    
        if (r10 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ea, code lost:
    
        if (r10 == null) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r11, java.lang.reflect.Method r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instruction units count: 507
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
        return jSONSchema.mo5603(this).f2155;
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
    public <T> T to(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC2932.f9287;
        long jOf = JSONReader$Feature.of(jSONReader$FeatureArr);
        boolean zIsEnabled = JSONReader$Feature.FieldBased.isEnabled(jOf);
        if (cls == String.class) {
            return (T) toString();
        }
        if (cls == InterfaceC2915.class) {
            return this;
        }
        if (cls == Void.class || cls == Void.TYPE) {
            return null;
        }
        return (T) AbstractC2932.m6329().m5588(cls, zIsEnabled).mo5462(this, jOf);
    }

    public byte[] toJSONBBytes(JSONWriter$Feature... jSONWriter$FeatureArr) {
        int i = AbstractC2896.f9159;
        C2895 c2895 = new C2895(new C2894(AbstractC2932.f9292, jSONWriter$FeatureArr));
        try {
            c2895.m6039(this);
            c2895.mo5951(this);
            byte[] bArrCopyOf = Arrays.copyOf(c2895.f9157, c2895.f9167);
            c2895.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                c2895.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public String toJSONString(JSONWriter$Feature... jSONWriter$FeatureArr) {
        return toString(jSONWriter$FeatureArr);
    }

    public <T> T toJavaObject(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) to((Class) cls, jSONReader$FeatureArr);
    }

    @Override // java.util.AbstractMap
    public String toString() throws IOException {
        AbstractC2896 abstractC2896M6012 = AbstractC2896.m6012();
        try {
            abstractC2896M6012.m6039(this);
            abstractC2896M6012.mo5951(this);
            String string = abstractC2896M6012.toString();
            abstractC2896M6012.close();
            return string;
        } catch (Throwable th) {
            try {
                abstractC2896M6012.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public JSONObject(int i) {
        super(i);
    }

    public JSONObject(int i, float f) {
        super(i, f);
    }

    public static String toJSONString(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) {
        return InterfaceC2915.m6314(obj, jSONWriter$FeatureArr);
    }

    public <T> T toJavaObject(Type type, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) to(type, jSONReader$FeatureArr);
    }

    public JSONObject(int i, float f, boolean z) {
        super(i, f, z);
    }

    public <T> T toJavaObject(AbstractC2906<T> abstractC2906, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) to(abstractC2906, jSONReader$FeatureArr);
    }

    public JSONObject(Map map) {
        super(map);
    }

    public static JSONObject from(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) {
        return (JSONObject) InterfaceC2915.m6313(obj, jSONWriter$FeatureArr);
    }

    public boolean getBooleanValue(String str, boolean z) {
        Boolean bool = getBoolean(str);
        return bool == null ? z : bool.booleanValue();
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

    public String toString(JSONWriter$Feature... jSONWriter$FeatureArr) throws IOException {
        AbstractC2896 abstractC2896M6010 = AbstractC2896.m6010(jSONWriter$FeatureArr);
        try {
            abstractC2896M6010.m6039(this);
            abstractC2896M6010.mo5951(this);
            String string = abstractC2896M6010.toString();
            abstractC2896M6010.close();
            return string;
        } catch (Throwable th) {
            try {
                abstractC2896M6010.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
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

    public <T> T to(Function<JSONObject, T> function) {
        return function.apply(this);
    }

    public <T> T to(Type type, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC2932.f9287;
        long j = 0;
        boolean z = false;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            if (jSONReader$Feature == JSONReader$Feature.FieldBased) {
                z = true;
            }
            j |= jSONReader$Feature.mask;
        }
        if (type == String.class) {
            return (T) toString();
        }
        return (T) AbstractC2932.m6329().m5588(type, z).mo5462(this, j);
    }

    public <T> T to(AbstractC2906<T> abstractC2906, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) to(abstractC2906.f9252, jSONReader$FeatureArr);
    }

    public static void valueFilter(Iterable<?> iterable, InterfaceC8594 interfaceC8594) {
        for (Object obj : iterable) {
            if (obj instanceof Map) {
                valueFilter((Map) obj, interfaceC8594);
            } else if (obj instanceof Iterable) {
                valueFilter((Iterable<?>) obj, interfaceC8594);
            }
        }
    }

    public void valueFilter(InterfaceC8594 interfaceC8594) {
        valueFilter(this, interfaceC8594);
    }

    public int getIntValue(String str) {
        return getIntValue(str, 0);
    }

    public long getLongValue(String str) {
        return getLongValue(str, 0L);
    }

    public static JSONObject of(String str, Object obj) {
        JSONObject jSONObject = new JSONObject(1, 1.0f);
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2) {
        JSONObject jSONObject = new JSONObject(2, 1.0f);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        return jSONObject;
    }

    public static void nameFilter(Iterable<?> iterable, InterfaceC8591 interfaceC8591) {
        for (Object obj : iterable) {
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).nameFilter(interfaceC8591);
            } else if (obj instanceof Iterable) {
                nameFilter((Iterable<?>) obj, interfaceC8591);
            }
        }
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        JSONObject jSONObject = new JSONObject(3);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        return jSONObject;
    }

    public void nameFilter(InterfaceC8591 interfaceC8591) {
        nameFilter(this, interfaceC8591);
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        JSONObject jSONObject = new JSONObject(4, 1.0f);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        return jSONObject;
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        return jSONObject;
    }

    public static <T> T parseObject(String str, Type type, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2942 c2942M6330 = AbstractC2932.m6330(jSONReader$FeatureArr);
        InterfaceC2787 interfaceC2787M6353 = c2942M6330.m6353(type);
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, c2942M6330);
        try {
            T t = (T) interfaceC2787M6353.mo5418(abstractC2898M6047, type, null, 0L);
            if (abstractC2898M6047.f9198 != null) {
                abstractC2898M6047.m6137(t);
            }
            if (abstractC2898M6047.f9191 != 26 && (c2942M6330.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
            }
            abstractC2898M6047.close();
            return t;
        } finally {
        }
    }

    public static JSONObject of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5, Object... objArr) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        if (objArr != null && objArr.length > 0) {
            of(jSONObject, objArr);
        }
        return jSONObject;
    }

    public static JSONObject of() {
        return new JSONObject();
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        return (T) InterfaceC2915.m6311(str, cls);
    }

    public static <T> T parseObject(String str, AbstractC2906<T> abstractC2906, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) InterfaceC2915.m6312(str, abstractC2906, jSONReader$FeatureArr);
    }

    public static JSONObject parseObject(String str) {
        return InterfaceC2915.m6316(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getObject(String str, Type type, JSONReader$Feature... jSONReader$FeatureArr) {
        T t = (T) super.get((Object) str);
        if (t == 0) {
            return null;
        }
        if (type != Object.class || jSONReader$FeatureArr.length != 0) {
            int length = jSONReader$FeatureArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (jSONReader$FeatureArr[i] == JSONReader$Feature.FieldBased) {
                    z = true;
                    break;
                }
                i++;
            }
            Class<?> cls = t.getClass();
            C2801 c2801M6329 = AbstractC2932.m6329();
            Function functionM5586 = c2801M6329.m5586(cls, type);
            if (functionM5586 != null) {
                return (T) functionM5586.apply(t);
            }
            if (t instanceof Map) {
                return (T) c2801M6329.m5588(type, z).m5574((Map) t, jSONReader$FeatureArr);
            }
            if (t instanceof Collection) {
                InterfaceC2787 interfaceC2787M5588 = c2801M6329.m5588(type, z);
                interfaceC2787M5588.getClass();
                return (T) interfaceC2787M5588.mo5424((Collection) t, JSONReader$Feature.of(jSONReader$FeatureArr));
            }
            if (!(type instanceof Class) || !((Class) type).isInstance(t)) {
                if (t instanceof String) {
                    String str2 = (String) t;
                    if (str2.isEmpty() || "null".equals(str2)) {
                        return null;
                    }
                }
                AbstractC2898 abstractC2898M6046 = AbstractC2898.m6046(InterfaceC2915.m6317(t));
                abstractC2898M6046.f9199.m6354(jSONReader$FeatureArr);
                return (T) c2801M6329.m5588(type, z).mo5418(abstractC2898M6046, null, null, 0L);
            }
        }
        return t;
    }

    public <T> T getObject(String str, AbstractC2906<T> abstractC2906, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) getObject(str, abstractC2906.f9252, jSONReader$FeatureArr);
    }

    public <T> T getObject(String str, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(str);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
