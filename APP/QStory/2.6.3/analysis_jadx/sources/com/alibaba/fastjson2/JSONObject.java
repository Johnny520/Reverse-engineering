package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.reader.C2802;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2827;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.AbstractC2867;
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
import p279.InterfaceC8367;
import p291.C8524;
import p291.InterfaceC8523;
import p296.AbstractC8580;
import p296.AbstractC8584;
import p296.InterfaceC8583;
import p296.InterfaceC8586;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class JSONObject extends LinkedHashMap<String, Object> implements InvocationHandler {
    static final long NONE_DIRECT_FEATURES = ((JSONWriter$Feature.ReferenceDetection.mask | JSONWriter$Feature.PrettyFormat.mask) | JSONWriter$Feature.NotWriteEmptyArray.mask) | JSONWriter$Feature.NotWriteDefaultValue.mask;
    static InterfaceC2788 arrayReader = null;
    private static final long serialVersionUID = 1;

    public JSONObject() {
    }

    public static JSONObject from(Object obj) {
        return (JSONObject) InterfaceC2916.m6371(obj, null);
    }

    private String getJSONFieldName(Method method) {
        String strName = null;
        for (Annotation annotation : AbstractC2865.m5820(method)) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC8367 interfaceC8367 = (InterfaceC8367) AbstractC2865.m5819(annotation, InterfaceC8367.class);
            if (interfaceC8367 != null) {
                strName = interfaceC8367.name();
                if (strName.isEmpty()) {
                    strName = null;
                }
            } else if ("com.alibaba.fastjson.annotation.JSONField".equals(clsAnnotationType.getName())) {
                C2923 c2923 = new C2923(annotation);
                AbstractC2865.m5811(clsAnnotationType, c2923);
                String str = c2923.f9265;
                if (str != null) {
                    strName = str;
                }
            }
        }
        return strName;
    }

    public static void nameFilter(Map map, InterfaceC8583 interfaceC8583) {
        String str;
        String strM14152;
        Iterator it = map.entrySet().iterator();
        JSONObject jSONObject = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                ((JSONObject) value).nameFilter(interfaceC8583);
            } else if (value instanceof Iterable) {
                nameFilter((Iterable<?>) value, interfaceC8583);
            }
            if ((key instanceof String) && (strM14152 = ((AbstractC8584) interfaceC8583).m14152(map, (str = (String) key), value)) != null && !strM14152.equals(str)) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put(strM14152, value);
                it.remove();
            }
        }
        if (jSONObject != null) {
            map.putAll(jSONObject);
        }
    }

    private static JSONObject of(JSONObject jSONObject, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            C0276.m850("The kvArray cannot be empty");
            return null;
        }
        int length = objArr.length;
        if ((length & 1) == 1) {
            C0276.m850("The length of kvArray cannot be odd");
            return null;
        }
        boolean z = false;
        for (int i = 0; i < length; i += 2) {
            int i2 = i + 1;
            Object obj = objArr[i];
            if (!(obj instanceof String)) {
                C0276.m850("The value corresponding to the even bit index of kvArray is key, which cannot be null and must be of type string");
                return null;
            }
            String str = (String) obj;
            if (z) {
                if (jSONObject.containsKey(str)) {
                    C0276.m850("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
                    return null;
                }
                jSONObject.put(str, objArr[i2]);
            } else {
                if (jSONObject.put(str, objArr[i2]) != null) {
                    C0276.m850("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
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
        C2943 c2943M6388 = AbstractC2933.m6388(jSONReader$FeatureArr);
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(str, c2943M6388);
        try {
            if (abstractC2899M6092.mo6133()) {
                abstractC2899M6092.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            abstractC2899M6092.mo6120(jSONObject, 0L);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(jSONObject);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943M6388.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                abstractC2899M6092.close();
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
        C2943 c2943M6388 = AbstractC2933.m6388(jSONReader$FeatureArr);
        InterfaceC2788 interfaceC2788M5633 = ((C2802) c2943M6388.f9318).m5633(cls, (c2943M6388.f9320 & JSONReader$Feature.FieldBased.mask) != 0);
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(str, c2943M6388);
        try {
            T t = (T) interfaceC2788M5633.mo5463(abstractC2899M6092, cls, null, 0L);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(t);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943M6388.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
            return t;
        } finally {
        }
    }

    public static void valueFilter(Map map, InterfaceC8586 interfaceC8586) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                valueFilter((Map) value, interfaceC8586);
            } else if (value instanceof Iterable) {
                valueFilter((Iterable<?>) value, interfaceC8586);
            }
            if (key instanceof String) {
                Object objM14151 = ((AbstractC8580) interfaceC8586).m14151(map, (String) key, value);
                if (objM14151 != value) {
                    entry.setValue(objM14151);
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
        String str = AbstractC2933.f9289;
        long jOf = JSONReader$Feature.of(jSONReader$FeatureArr);
        boolean zIsEnabled = JSONReader$Feature.FieldBased.isEnabled(jOf);
        AbstractC2933.m6387().m5633(obj.getClass(), zIsEnabled).m5618(obj, this, jOf);
    }

    public Object eval(AbstractC2922 abstractC2922) {
        return abstractC2922.mo5948(this);
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
                return AbstractC2867.m5913(((String) obj).trim());
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
            }
            C0276.m850(AbstractC2442.m4580(obj, "' to BigDecimal", new StringBuilder("Can not cast '")));
            return null;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        if (!(obj instanceof Float)) {
            return obj instanceof Double ? AbstractC2867.m5915(((Double) obj).doubleValue()) : BigDecimal.valueOf(((Number) obj).longValue());
        }
        float fFloatValue = ((Float) obj).floatValue();
        Class cls = AbstractC2867.f9051;
        byte[] bArr = new byte[15];
        return AbstractC2867.m5933(0, bArr, AbstractC2827.m5675(bArr, 0, fFloatValue));
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
            C0276.m850(AbstractC2442.m4580(obj, "' to BigInteger", new StringBuilder("Can not cast '")));
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
            C0276.m850(AbstractC2442.m4580(obj, "' to boolean", new StringBuilder("Can not cast '")));
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
        AbstractC2922 abstractC2922M6378 = AbstractC2922.m6378(str);
        return abstractC2922M6378 instanceof C2945 ? get(((C2945) abstractC2922M6378).f9323) : abstractC2922M6378.mo5948(this);
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
            C0276.m850(AbstractC2442.m4580(obj, "' to byte", new StringBuilder("Can not cast '")));
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
        C0276.m850(AbstractC0053.m153(obj, "can not cast to byte[], value : "));
        return null;
    }

    public Date getDate(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        return obj instanceof Date ? (Date) obj : obj instanceof String ? AbstractC2866.m5868((String) obj) : obj instanceof Number ? new Date(((Number) obj).longValue()) : AbstractC2867.m5919(obj);
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
            C0276.m850(AbstractC2442.m4580(obj, "' to double", new StringBuilder("Can not cast '")));
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
            C0276.m850(AbstractC2442.m4580(obj, "' to float", new StringBuilder("Can not cast '")));
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
            return AbstractC2867.m5906(obj);
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
                C0276.m850(AbstractC2442.m4580(obj, "' to int value", new StringBuilder("Can not cast '")));
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
            C0276.m850(AbstractC2442.m4580(obj, "' to Integer", new StringBuilder("Can not cast '")));
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
            AbstractC2899 abstractC2899M6091 = AbstractC2899.m6091(str2);
            if (arrayReader == null) {
                arrayReader = abstractC2899M6091.m6102(JSONArray.class);
            }
            return (JSONArray) arrayReader.mo5463(abstractC2899M6091, null, null, 0L);
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
            return (JSONObject) AbstractC2933.f9281.mo5463(AbstractC2899.m6091(str2), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            put(str, jSONObject);
            return jSONObject;
        }
        Class<?> cls = obj.getClass();
        InterfaceC8523 interfaceC8523M14106 = AbstractC2933.f9294.m14106(cls, cls, false);
        if (!(interfaceC8523M14106 instanceof C8524)) {
            return null;
        }
        JSONObject jSONObjectMo14092 = ((C8524) interfaceC8523M14106).mo14092(obj, 0L);
        put(str, jSONObjectMo14092);
        return jSONObjectMo14092;
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
        return obj == null ? localDate : obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) AbstractC2867.m5927(LocalDate.class, obj);
    }

    public LocalDateTime getLocalDateTime(String str, LocalDateTime localDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? localDateTime : obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) AbstractC2867.m5927(LocalDateTime.class, obj);
    }

    public LocalTime getLocalTime(String str, LocalTime localTime) {
        Object obj = super.get((Object) str);
        return obj == null ? localTime : obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) AbstractC2867.m5927(LocalTime.class, obj);
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
            C0276.m850(AbstractC2442.m4580(obj, "' to Long", new StringBuilder("Can not cast '")));
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
                C0276.m850(AbstractC2442.m4580(obj, "' to long value", new StringBuilder("Can not cast '")));
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
            com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世 r2 = com.alibaba.fastjson2.AbstractC2933.m6387()
            java.util.function.Function r0 = r2.m5631(r0, r12)
            if (r0 == 0) goto L34
            java.lang.Object r10 = r0.apply(r10)
            return r10
        L34:
            boolean r0 = r10 instanceof java.util.Map
            if (r0 == 0) goto L43
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r11 = r2.m5633(r12, r1)
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = r11.m5619(r10, r13)
            return r10
        L43:
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L59
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r11 = r2.m5633(r12, r1)
            java.util.Collection r10 = (java.util.Collection) r10
            r11.getClass()
            long r12 = com.alibaba.fastjson2.JSONReader$Feature.of(r13)
            java.lang.Object r10 = r11.mo5469(r10, r12)
            return r10
        L59:
            java.lang.Class r12 = com.alibaba.fastjson2.util.AbstractC2867.m5942(r12)
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
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r3 = r2.m5633(r12, r1)
            boolean r4 = r3 instanceof com.alibaba.fastjson2.reader.C2737
            if (r4 == 0) goto L95
            long r10 = com.alibaba.fastjson2.util.AbstractC2860.m5774(r0)
            com.alibaba.fastjson2.reader.飘花落叶言子哲苏世兰楪 r3 = (com.alibaba.fastjson2.reader.C2737) r3
            java.lang.Enum r10 = r3.m5535(r10)
            return r10
        L93:
            return r11
        L94:
            r3 = r11
        L95:
            java.lang.String r10 = com.alibaba.fastjson2.InterfaceC2916.m6375(r10)
            com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏 r5 = com.alibaba.fastjson2.AbstractC2899.m6091(r10)
            com.alibaba.fastjson2.飘花落叶言子苏兰哲世楪 r0 = r5.f9201
            r0.m6412(r13)
            if (r3 != 0) goto La8
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r3 = r2.m5633(r12, r1)
        La8:
            r4 = r3
            r7 = 0
            r8 = 0
            r6 = 0
            java.lang.Object r12 = r4.mo5463(r5, r6, r7, r8)
            boolean r13 = r5.mo6165()
            if (r13 == 0) goto Lb8
            return r12
        Lb8:
            java.lang.String r12 = "not support input "
            java.lang.String r10 = r12.concat(r10)
            androidx.collection.C0276.m850(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONObject.getObject(java.lang.String, java.lang.Class, com.alibaba.fastjson2.JSONReader$Feature[]):java.lang.Object");
    }

    public OffsetDateTime getOffsetDateTime(String str, OffsetDateTime offsetDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? offsetDateTime : obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) AbstractC2867.m5927(OffsetDateTime.class, obj);
    }

    public OffsetTime getOffsetTime(String str, OffsetTime offsetTime) {
        Object obj = super.get((Object) str);
        return obj == null ? offsetTime : obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) AbstractC2867.m5927(OffsetTime.class, obj);
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
            C0276.m850(AbstractC2442.m4580(obj, "' to short", new StringBuilder("Can not cast '")));
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
        return obj instanceof String ? (String) obj : obj instanceof Date ? AbstractC2866.m5886(((Date) obj).getTime(), AbstractC2866.f9027) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum) || (obj instanceof TemporalAccessor)) ? obj.toString() : InterfaceC2916.m6375(obj);
    }

    public ZonedDateTime getZonedDateTime(String str, ZonedDateTime zonedDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? zonedDateTime : obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) AbstractC2867.m5927(ZonedDateTime.class, obj);
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
        return jSONSchema.mo5648(this).f2156;
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
        String str = AbstractC2933.f9289;
        long jOf = JSONReader$Feature.of(jSONReader$FeatureArr);
        boolean zIsEnabled = JSONReader$Feature.FieldBased.isEnabled(jOf);
        if (cls == String.class) {
            return (T) toString();
        }
        if (cls == InterfaceC2916.class) {
            return this;
        }
        if (cls == Void.class || cls == Void.TYPE) {
            return null;
        }
        return (T) AbstractC2933.m6387().m5633(cls, zIsEnabled).mo5507(this, jOf);
    }

    public byte[] toJSONBBytes(JSONWriter$Feature... jSONWriter$FeatureArr) {
        int i = AbstractC2897.f9161;
        C2896 c2896 = new C2896(new C2895(AbstractC2933.f9294, jSONWriter$FeatureArr));
        try {
            c2896.m6085(this);
            c2896.mo5996(this);
            byte[] bArrCopyOf = Arrays.copyOf(c2896.f9159, c2896.f9169);
            c2896.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                c2896.close();
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
        AbstractC2897 abstractC2897M6057 = AbstractC2897.m6057();
        try {
            abstractC2897M6057.m6085(this);
            abstractC2897M6057.mo5996(this);
            String string = abstractC2897M6057.toString();
            abstractC2897M6057.close();
            return string;
        } catch (Throwable th) {
            try {
                abstractC2897M6057.close();
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
        return InterfaceC2916.m6372(obj, jSONWriter$FeatureArr);
    }

    public <T> T toJavaObject(Type type, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) to(type, jSONReader$FeatureArr);
    }

    public JSONObject(int i, float f, boolean z) {
        super(i, f, z);
    }

    public <T> T toJavaObject(AbstractC2907<T> abstractC2907, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) to(abstractC2907, jSONReader$FeatureArr);
    }

    public JSONObject(Map map) {
        super(map);
    }

    public static JSONObject from(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) {
        return (JSONObject) InterfaceC2916.m6371(obj, jSONWriter$FeatureArr);
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
        AbstractC2897 abstractC2897M6055 = AbstractC2897.m6055(jSONWriter$FeatureArr);
        try {
            abstractC2897M6055.m6085(this);
            abstractC2897M6055.mo5996(this);
            String string = abstractC2897M6055.toString();
            abstractC2897M6055.close();
            return string;
        } catch (Throwable th) {
            try {
                abstractC2897M6055.close();
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
        String str = AbstractC2933.f9289;
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
        return (T) AbstractC2933.m6387().m5633(type, z).mo5507(this, j);
    }

    public <T> T to(AbstractC2907<T> abstractC2907, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) to(abstractC2907.f9254, jSONReader$FeatureArr);
    }

    public static void valueFilter(Iterable<?> iterable, InterfaceC8586 interfaceC8586) {
        for (Object obj : iterable) {
            if (obj instanceof Map) {
                valueFilter((Map) obj, interfaceC8586);
            } else if (obj instanceof Iterable) {
                valueFilter((Iterable<?>) obj, interfaceC8586);
            }
        }
    }

    public void valueFilter(InterfaceC8586 interfaceC8586) {
        valueFilter(this, interfaceC8586);
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

    public static void nameFilter(Iterable<?> iterable, InterfaceC8583 interfaceC8583) {
        for (Object obj : iterable) {
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).nameFilter(interfaceC8583);
            } else if (obj instanceof Iterable) {
                nameFilter((Iterable<?>) obj, interfaceC8583);
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

    public void nameFilter(InterfaceC8583 interfaceC8583) {
        nameFilter(this, interfaceC8583);
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
        C2943 c2943M6388 = AbstractC2933.m6388(jSONReader$FeatureArr);
        InterfaceC2788 interfaceC2788M6411 = c2943M6388.m6411(type);
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(str, c2943M6388);
        try {
            T t = (T) interfaceC2788M6411.mo5463(abstractC2899M6092, type, null, 0L);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(t);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943M6388.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
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
        return (T) InterfaceC2916.m6369(str, cls);
    }

    public static <T> T parseObject(String str, AbstractC2907<T> abstractC2907, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) InterfaceC2916.m6370(str, abstractC2907, jSONReader$FeatureArr);
    }

    public static JSONObject parseObject(String str) {
        return InterfaceC2916.m6374(str);
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
            C2802 c2802M6387 = AbstractC2933.m6387();
            Function functionM5631 = c2802M6387.m5631(cls, type);
            if (functionM5631 != null) {
                return (T) functionM5631.apply(t);
            }
            if (t instanceof Map) {
                return (T) c2802M6387.m5633(type, z).m5619((Map) t, jSONReader$FeatureArr);
            }
            if (t instanceof Collection) {
                InterfaceC2788 interfaceC2788M5633 = c2802M6387.m5633(type, z);
                interfaceC2788M5633.getClass();
                return (T) interfaceC2788M5633.mo5469((Collection) t, JSONReader$Feature.of(jSONReader$FeatureArr));
            }
            if (!(type instanceof Class) || !((Class) type).isInstance(t)) {
                if (t instanceof String) {
                    String str2 = (String) t;
                    if (str2.isEmpty() || "null".equals(str2)) {
                        return null;
                    }
                }
                AbstractC2899 abstractC2899M6091 = AbstractC2899.m6091(InterfaceC2916.m6375(t));
                abstractC2899M6091.f9201.m6412(jSONReader$FeatureArr);
                return (T) c2802M6387.m5633(type, z).mo5463(abstractC2899M6091, null, null, 0L);
            }
        }
        return t;
    }

    public <T> T getObject(String str, AbstractC2907<T> abstractC2907, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) getObject(str, abstractC2907.f9254, jSONReader$FeatureArr);
    }

    public <T> T getObject(String str, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(str);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
