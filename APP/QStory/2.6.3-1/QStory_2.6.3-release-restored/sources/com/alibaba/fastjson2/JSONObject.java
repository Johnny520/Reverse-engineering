package com.alibaba.fastjson2;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.reader.C3570;
import com.alibaba.fastjson2.reader.C3635;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3660;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3699;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
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
import p295.InterfaceC9196;
import p307.C9353;
import p307.InterfaceC9352;
import p312.AbstractC9409;
import p312.AbstractC9413;
import p312.InterfaceC9412;
import p312.InterfaceC9415;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class JSONObject extends LinkedHashMap<String, Object> implements InvocationHandler {
    static final long NONE_DIRECT_FEATURES = ((JSONWriter$Feature.ReferenceDetection.mask | JSONWriter$Feature.PrettyFormat.mask) | JSONWriter$Feature.NotWriteEmptyArray.mask) | JSONWriter$Feature.NotWriteDefaultValue.mask;
    static InterfaceC3621 arrayReader = null;
    private static final long serialVersionUID = 1;

    public JSONObject() {
    }

    public static JSONObject from(Object obj) {
        return (JSONObject) InterfaceC3749.m6931(obj, null);
    }

    private String getJSONFieldName(Method method) {
        String strName = null;
        for (Annotation annotation : AbstractC3698.m6380(method)) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC9196 interfaceC9196 = (InterfaceC9196) AbstractC3698.m6379(annotation, InterfaceC9196.class);
            if (interfaceC9196 != null) {
                strName = interfaceC9196.name();
                if (strName.isEmpty()) {
                    strName = null;
                }
            } else if ("com.alibaba.fastjson.annotation.JSONField".equals(clsAnnotationType.getName())) {
                C3756 c3756 = new C3756(annotation);
                AbstractC3698.m6371(clsAnnotationType, c3756);
                String str = c3756.f9610;
                if (str != null) {
                    strName = str;
                }
            }
        }
        return strName;
    }

    public static void nameFilter(Map map, InterfaceC9412 interfaceC9412) {
        String str;
        String strM14711;
        Iterator it = map.entrySet().iterator();
        JSONObject jSONObject = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                ((JSONObject) value).nameFilter(interfaceC9412);
            } else if (value instanceof Iterable) {
                nameFilter((Iterable<?>) value, interfaceC9412);
            }
            if ((key instanceof String) && (strM14711 = ((AbstractC9413) interfaceC9412).m14711(map, (str = (String) key), value)) != null && !strM14711.equals(str)) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put(strM14711, value);
                it.remove();
            }
        }
        if (jSONObject != null) {
            map.putAll(jSONObject);
        }
    }

    /* JADX INFO: renamed from: of */
    private static JSONObject m8of(JSONObject jSONObject, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            C1123.m1410("The kvArray cannot be empty");
            return null;
        }
        int length = objArr.length;
        if ((length & 1) == 1) {
            C1123.m1410("The length of kvArray cannot be odd");
            return null;
        }
        boolean z = false;
        for (int i = 0; i < length; i += 2) {
            int i2 = i + 1;
            Object obj = objArr[i];
            if (!(obj instanceof String)) {
                C1123.m1410("The value corresponding to the even bit index of kvArray is key, which cannot be null and must be of type string");
                return null;
            }
            String str = (String) obj;
            if (z) {
                if (jSONObject.containsKey(str)) {
                    C1123.m1410("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
                    return null;
                }
                jSONObject.put(str, objArr[i2]);
            } else {
                if (jSONObject.put(str, objArr[i2]) != null) {
                    C1123.m1410("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
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
        C3776 c3776M6948 = AbstractC3766.m6948(jSONReader$FeatureArr);
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, c3776M6948);
        try {
            if (abstractC3732M6652.mo6693()) {
                abstractC3732M6652.close();
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            abstractC3732M6652.mo6680(jSONObject, 0L);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(jSONObject);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776M6948.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return jSONObject;
        } catch (Throwable th) {
            try {
                abstractC3732M6652.close();
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
        C3776 c3776M6948 = AbstractC3766.m6948(jSONReader$FeatureArr);
        InterfaceC3621 interfaceC3621M6193 = ((C3635) c3776M6948.f9663).m6193(cls, (c3776M6948.f9665 & JSONReader$Feature.FieldBased.mask) != 0);
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, c3776M6948);
        try {
            T t = (T) interfaceC3621M6193.mo6023(abstractC3732M6652, cls, null, 0L);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(t);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776M6948.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return t;
        } finally {
        }
    }

    public static void valueFilter(Map map, InterfaceC9415 interfaceC9415) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                valueFilter((Map) value, interfaceC9415);
            } else if (value instanceof Iterable) {
                valueFilter((Iterable<?>) value, interfaceC9415);
            }
            if (key instanceof String) {
                Object objM14710 = ((AbstractC9409) interfaceC9415).m14710(map, (String) key, value);
                if (objM14710 != value) {
                    entry.setValue(objM14710);
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
        String str = AbstractC3766.f9634;
        long jM19of = JSONReader$Feature.m19of(jSONReader$FeatureArr);
        boolean zIsEnabled = JSONReader$Feature.FieldBased.isEnabled(jM19of);
        AbstractC3766.m6947().m6193(obj.getClass(), zIsEnabled).m6178(obj, this, jM19of);
    }

    public Object eval(AbstractC3755 abstractC3755) {
        return abstractC3755.mo6508(this);
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
                return AbstractC3700.m6473(((String) obj).trim());
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
            }
            C1123.m1410(AbstractC3275.m5140(obj, "' to BigDecimal", new StringBuilder("Can not cast '")));
            return null;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        if (!(obj instanceof Float)) {
            return obj instanceof Double ? AbstractC3700.m6475(((Double) obj).doubleValue()) : BigDecimal.valueOf(((Number) obj).longValue());
        }
        float fFloatValue = ((Float) obj).floatValue();
        Class cls = AbstractC3700.f9396;
        byte[] bArr = new byte[15];
        return AbstractC3700.m6493(0, bArr, AbstractC3660.m6235(bArr, 0, fFloatValue));
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
            C1123.m1410(AbstractC3275.m5140(obj, "' to BigInteger", new StringBuilder("Can not cast '")));
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
            C1123.m1410(AbstractC3275.m5140(obj, "' to boolean", new StringBuilder("Can not cast '")));
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
        AbstractC3755 abstractC3755M6938 = AbstractC3755.m6938(str);
        return abstractC3755M6938 instanceof C3778 ? get(((C3778) abstractC3755M6938).f9668) : abstractC3755M6938.mo6508(this);
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
            C1123.m1410(AbstractC3275.m5140(obj, "' to byte", new StringBuilder("Can not cast '")));
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
        C1123.m1410(AbstractC0900.m713(obj, "can not cast to byte[], value : "));
        return null;
    }

    public Date getDate(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        return obj instanceof Date ? (Date) obj : obj instanceof String ? AbstractC3699.m6428((String) obj) : obj instanceof Number ? new Date(((Number) obj).longValue()) : AbstractC3700.m6479(obj);
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
            C1123.m1410(AbstractC3275.m5140(obj, "' to double", new StringBuilder("Can not cast '")));
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
            C1123.m1410(AbstractC3275.m5140(obj, "' to float", new StringBuilder("Can not cast '")));
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
            return AbstractC3700.m6466(obj);
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
                C1123.m1410(AbstractC3275.m5140(obj, "' to int value", new StringBuilder("Can not cast '")));
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
            C1123.m1410(AbstractC3275.m5140(obj, "' to Integer", new StringBuilder("Can not cast '")));
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
            return JSONArray.m0of(obj);
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            if (str2.charAt(0) != '[') {
                return JSONArray.m0of((Object) str2);
            }
            AbstractC3732 abstractC3732M6651 = AbstractC3732.m6651(str2);
            if (arrayReader == null) {
                arrayReader = abstractC3732M6651.m6662(JSONArray.class);
            }
            return (JSONArray) arrayReader.mo6023(abstractC3732M6651, null, null, 0L);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray((Collection<?>) obj);
            put(str, jSONArray);
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArrayM3of = JSONArray.m3of((Object[]) obj);
            put(str, jSONArrayM3of);
            return jSONArrayM3of;
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
            return (JSONObject) AbstractC3766.f9626.mo6023(AbstractC3732.m6651(str2), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            put(str, jSONObject);
            return jSONObject;
        }
        Class<?> cls = obj.getClass();
        InterfaceC9352 interfaceC9352M14665 = AbstractC3766.f9639.m14665(cls, cls, false);
        if (!(interfaceC9352M14665 instanceof C9353)) {
            return null;
        }
        JSONObject jSONObjectMo14651 = ((C9353) interfaceC9352M14665).mo14651(obj, 0L);
        put(str, jSONObjectMo14651);
        return jSONObjectMo14651;
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
        return obj == null ? localDate : obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) AbstractC3700.m6487(LocalDate.class, obj);
    }

    public LocalDateTime getLocalDateTime(String str, LocalDateTime localDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? localDateTime : obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) AbstractC3700.m6487(LocalDateTime.class, obj);
    }

    public LocalTime getLocalTime(String str, LocalTime localTime) {
        Object obj = super.get((Object) str);
        return obj == null ? localTime : obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) AbstractC3700.m6487(LocalTime.class, obj);
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
            C1123.m1410(AbstractC3275.m5140(obj, "' to Long", new StringBuilder("Can not cast '")));
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
                C1123.m1410(AbstractC3275.m5140(obj, "' to long value", new StringBuilder("Can not cast '")));
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
    */
    public <T> T getObject(String str, Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        InterfaceC3621 interfaceC3621M6193;
        T t = (T) super.get((Object) str);
        if (t != 0) {
            if (cls != Object.class || jSONReader$FeatureArr.length != 0) {
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
                Class cls2 = t.getClass();
                C3635 c3635M6947 = AbstractC3766.m6947();
                Function functionM6191 = c3635M6947.m6191(cls2, cls);
                if (functionM6191 != null) {
                    return (T) functionM6191.apply(t);
                }
                if (t instanceof Map) {
                    return (T) c3635M6947.m6193(cls, z).m6179((Map) t, jSONReader$FeatureArr);
                }
                if (t instanceof Collection) {
                    InterfaceC3621 interfaceC3621M61932 = c3635M6947.m6193(cls, z);
                    interfaceC3621M61932.getClass();
                    return (T) interfaceC3621M61932.mo6029((Collection) t, JSONReader$Feature.m19of(jSONReader$FeatureArr));
                }
                Class clsM6502 = AbstractC3700.m6502(cls);
                if (!clsM6502.isInstance(t)) {
                    if (t instanceof String) {
                        String str2 = (String) t;
                        if (!str2.isEmpty() && !"null".equals(str2)) {
                            if (clsM6502.isEnum()) {
                                interfaceC3621M6193 = c3635M6947.m6193(clsM6502, z);
                                if (interfaceC3621M6193 instanceof C3570) {
                                    return (T) ((C3570) interfaceC3621M6193).m6095(AbstractC3693.m6334(str2));
                                }
                            } else {
                                interfaceC3621M6193 = null;
                            }
                        }
                    }
                    String strM6935 = InterfaceC3749.m6935(t);
                    AbstractC3732 abstractC3732M6651 = AbstractC3732.m6651(strM6935);
                    abstractC3732M6651.f9546.m6972(jSONReader$FeatureArr);
                    if (interfaceC3621M6193 == null) {
                        interfaceC3621M6193 = c3635M6947.m6193(clsM6502, z);
                    }
                    T t2 = (T) interfaceC3621M6193.mo6023(abstractC3732M6651, null, null, 0L);
                    if (abstractC3732M6651.mo6725()) {
                        return t2;
                    }
                    C1123.m1410("not support input ".concat(strM6935));
                    return null;
                }
            }
            return t;
        }
        return null;
    }

    public OffsetDateTime getOffsetDateTime(String str, OffsetDateTime offsetDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? offsetDateTime : obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) AbstractC3700.m6487(OffsetDateTime.class, obj);
    }

    public OffsetTime getOffsetTime(String str, OffsetTime offsetTime) {
        Object obj = super.get((Object) str);
        return obj == null ? offsetTime : obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) AbstractC3700.m6487(OffsetTime.class, obj);
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
            C1123.m1410(AbstractC3275.m5140(obj, "' to short", new StringBuilder("Can not cast '")));
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
        return obj instanceof String ? (String) obj : obj instanceof Date ? AbstractC3699.m6446(((Date) obj).getTime(), AbstractC3699.f9372) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum) || (obj instanceof TemporalAccessor)) ? obj.toString() : InterfaceC3749.m6935(obj);
    }

    public ZonedDateTime getZonedDateTime(String str, ZonedDateTime zonedDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? zonedDateTime : obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) AbstractC3700.m6487(ZonedDateTime.class, obj);
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
    */
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        Function functionM6191;
        boolean zStartsWith;
        String name = method.getName();
        int parameterCount = method.getParameterCount();
        Class<?> returnType = method.getReturnType();
        Class<?> cls = Void.TYPE;
        if (parameterCount == 1) {
            if ("equals".equals(name)) {
                return Boolean.valueOf(equals(objArr[0]));
            }
            Class<?>[] interfaces = obj.getClass().getInterfaces();
            Class<?> cls2 = interfaces.length == 1 ? interfaces[0] : null;
            if (returnType != cls && returnType != cls2) {
                C1123.m1410(AbstractC0900.m718("This method '", name, "' is not a setter"));
                return null;
            }
            String jSONFieldName = getJSONFieldName(method);
            if (jSONFieldName == null) {
                if (!name.startsWith("set")) {
                    C1123.m1410(AbstractC0900.m718("This method '", name, "' is not a setter"));
                    return null;
                }
                String strSubstring = name.substring(3);
                if (strSubstring.length() == 0) {
                    C1123.m1410(AbstractC0900.m718("This method '", name, "' is an illegal setter"));
                    return null;
                }
                jSONFieldName = Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1);
            }
            put(jSONFieldName, objArr[0]);
            if (returnType != cls) {
                return obj;
            }
        } else {
            if (parameterCount != 0) {
                C6755.m11867(method.toGenericString());
                return null;
            }
            if (returnType == cls) {
                C1123.m1410(AbstractC0900.m718("This method '", name, "' is not a getter"));
                return null;
            }
            String jSONFieldName2 = getJSONFieldName(method);
            if (jSONFieldName2 == null) {
                if (!name.startsWith("get")) {
                    zStartsWith = name.startsWith("with");
                    if (!zStartsWith) {
                        if (!name.startsWith("is")) {
                            if ("hashCode".equals(name)) {
                                return Integer.valueOf(hashCode());
                            }
                            if ("toString".equals(name)) {
                                return toString();
                            }
                            if (name.startsWith("entrySet")) {
                                return entrySet();
                            }
                            if ("size".equals(name)) {
                                return Integer.valueOf(size());
                            }
                            Class<?> declaringClass = method.getDeclaringClass();
                            if (declaringClass.isInterface() && !Modifier.isAbstract(method.getModifiers()) && !AbstractC3687.f9274 && !AbstractC3687.f9273) {
                                return (Object) AbstractC3687.m6328(declaringClass).findSpecial(declaringClass, method.getName(), MethodType.methodType(returnType), declaringClass).invoke(obj);
                            }
                            C1123.m1410(AbstractC0900.m718("This method '", name, "' is not a getter"));
                            return null;
                        }
                        if ("isEmpty".equals(name)) {
                            Object obj3 = get("empty");
                            if (obj3 == null) {
                                return Boolean.valueOf(isEmpty());
                            }
                            obj2 = obj3;
                        } else {
                            String strSubstring2 = name.substring(2);
                            if (strSubstring2.isEmpty()) {
                                C1123.m1410(AbstractC0900.m718("This method '", name, "' is an illegal getter"));
                                return null;
                            }
                            obj2 = get(Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1));
                            if (obj2 == null) {
                                return Boolean.FALSE;
                            }
                        }
                    }
                    return (returnType.isInstance(obj2) || (functionM6191 = AbstractC3766.m6947().m6191(obj2.getClass(), method.getGenericReturnType())) == null) ? obj2 : functionM6191.apply(obj2);
                }
                zStartsWith = false;
                int length = name.length();
                int i = zStartsWith ? 4 : 3;
                if (length > i) {
                    char[] cArr = new char[name.length() - i];
                    name.getChars(i, name.length(), cArr, 0);
                    char c = cArr[0];
                    if (c >= 'A' && c <= 'Z') {
                        cArr[0] = (char) (c + ' ');
                    }
                    String str = new String(cArr);
                    if (str.isEmpty()) {
                        C1123.m1410(AbstractC0900.m718("This method '", name, "' is an illegal getter"));
                        return null;
                    }
                    obj2 = get(str);
                }
                if (returnType.isInstance(obj2)) {
                    return obj2;
                }
            }
            obj2 = get(jSONFieldName2);
        }
        return null;
    }

    public boolean isArray(Object obj) {
        Object obj2 = super.get(obj);
        if (obj2 instanceof JSONArray) {
            return true;
        }
        return obj2 != null && obj2.getClass().isArray();
    }

    public boolean isValid(JSONSchema jSONSchema) {
        return jSONSchema.mo6208(this).f2501;
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
    public <T> T m16to(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC3766.f9634;
        long jM19of = JSONReader$Feature.m19of(jSONReader$FeatureArr);
        boolean zIsEnabled = JSONReader$Feature.FieldBased.isEnabled(jM19of);
        if (cls == String.class) {
            return (T) toString();
        }
        if (cls == InterfaceC3749.class) {
            return this;
        }
        if (cls == Void.class || cls == Void.TYPE) {
            return null;
        }
        return (T) AbstractC3766.m6947().m6193(cls, zIsEnabled).mo6067(this, jM19of);
    }

    public byte[] toJSONBBytes(JSONWriter$Feature... jSONWriter$FeatureArr) {
        int i = AbstractC3730.f9506;
        C3729 c3729 = new C3729(new C3728(AbstractC3766.f9639, jSONWriter$FeatureArr));
        try {
            c3729.m6645(this);
            c3729.mo6556(this);
            byte[] bArrCopyOf = Arrays.copyOf(c3729.f9504, c3729.f9514);
            c3729.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                c3729.close();
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
        return (T) m16to((Class) cls, jSONReader$FeatureArr);
    }

    @Override // java.util.AbstractMap
    public String toString() throws IOException {
        AbstractC3730 abstractC3730M6617 = AbstractC3730.m6617();
        try {
            abstractC3730M6617.m6645(this);
            abstractC3730M6617.mo6556(this);
            String string = abstractC3730M6617.toString();
            abstractC3730M6617.close();
            return string;
        } catch (Throwable th) {
            try {
                abstractC3730M6617.close();
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
        return InterfaceC3749.m6932(obj, jSONWriter$FeatureArr);
    }

    public <T> T toJavaObject(Type type, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) m17to(type, jSONReader$FeatureArr);
    }

    public JSONObject(int i, float f, boolean z) {
        super(i, f, z);
    }

    public <T> T toJavaObject(AbstractC3740<T> abstractC3740, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) m15to(abstractC3740, jSONReader$FeatureArr);
    }

    public JSONObject(Map map) {
        super(map);
    }

    public static JSONObject from(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) {
        return (JSONObject) InterfaceC3749.m6931(obj, jSONWriter$FeatureArr);
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
        AbstractC3730 abstractC3730M6615 = AbstractC3730.m6615(jSONWriter$FeatureArr);
        try {
            abstractC3730M6615.m6645(this);
            abstractC3730M6615.mo6556(this);
            String string = abstractC3730M6615.toString();
            abstractC3730M6615.close();
            return string;
        } catch (Throwable th) {
            try {
                abstractC3730M6615.close();
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

    /* JADX INFO: renamed from: to */
    public <T> T m18to(Function<JSONObject, T> function) {
        return function.apply(this);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m17to(Type type, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC3766.f9634;
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
        return (T) AbstractC3766.m6947().m6193(type, z).mo6067(this, j);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m15to(AbstractC3740<T> abstractC3740, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) m17to(abstractC3740.f9599, jSONReader$FeatureArr);
    }

    public static void valueFilter(Iterable<?> iterable, InterfaceC9415 interfaceC9415) {
        for (Object obj : iterable) {
            if (obj instanceof Map) {
                valueFilter((Map) obj, interfaceC9415);
            } else if (obj instanceof Iterable) {
                valueFilter((Iterable<?>) obj, interfaceC9415);
            }
        }
    }

    public void valueFilter(InterfaceC9415 interfaceC9415) {
        valueFilter(this, interfaceC9415);
    }

    public int getIntValue(String str) {
        return getIntValue(str, 0);
    }

    public long getLongValue(String str) {
        return getLongValue(str, 0L);
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m9of(String str, Object obj) {
        JSONObject jSONObject = new JSONObject(1, 1.0f);
        jSONObject.put(str, obj);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m10of(String str, Object obj, String str2, Object obj2) {
        JSONObject jSONObject = new JSONObject(2, 1.0f);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        return jSONObject;
    }

    public static void nameFilter(Iterable<?> iterable, InterfaceC9412 interfaceC9412) {
        for (Object obj : iterable) {
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).nameFilter(interfaceC9412);
            } else if (obj instanceof Iterable) {
                nameFilter((Iterable<?>) obj, interfaceC9412);
            }
        }
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m11of(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        JSONObject jSONObject = new JSONObject(3);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        return jSONObject;
    }

    public void nameFilter(InterfaceC9412 interfaceC9412) {
        nameFilter(this, interfaceC9412);
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m12of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        JSONObject jSONObject = new JSONObject(4, 1.0f);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m13of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5) {
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
        C3776 c3776M6948 = AbstractC3766.m6948(jSONReader$FeatureArr);
        InterfaceC3621 interfaceC3621M6971 = c3776M6948.m6971(type);
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, c3776M6948);
        try {
            T t = (T) interfaceC3621M6971.mo6023(abstractC3732M6652, type, null, 0L);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(t);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776M6948.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return t;
        } finally {
        }
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m14of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5, Object... objArr) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        if (objArr != null && objArr.length > 0) {
            m8of(jSONObject, objArr);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m7of() {
        return new JSONObject();
    }

    public static <T> T parseObject(String str, Class<T> cls) {
        return (T) InterfaceC3749.m6929(str, cls);
    }

    public static <T> T parseObject(String str, AbstractC3740<T> abstractC3740, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) InterfaceC3749.m6930(str, abstractC3740, jSONReader$FeatureArr);
    }

    public static JSONObject parseObject(String str) {
        return InterfaceC3749.m6934(str);
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
            C3635 c3635M6947 = AbstractC3766.m6947();
            Function functionM6191 = c3635M6947.m6191(cls, type);
            if (functionM6191 != null) {
                return (T) functionM6191.apply(t);
            }
            if (t instanceof Map) {
                return (T) c3635M6947.m6193(type, z).m6179((Map) t, jSONReader$FeatureArr);
            }
            if (t instanceof Collection) {
                InterfaceC3621 interfaceC3621M6193 = c3635M6947.m6193(type, z);
                interfaceC3621M6193.getClass();
                return (T) interfaceC3621M6193.mo6029((Collection) t, JSONReader$Feature.m19of(jSONReader$FeatureArr));
            }
            if (!(type instanceof Class) || !((Class) type).isInstance(t)) {
                if (t instanceof String) {
                    String str2 = (String) t;
                    if (str2.isEmpty() || "null".equals(str2)) {
                        return null;
                    }
                }
                AbstractC3732 abstractC3732M6651 = AbstractC3732.m6651(InterfaceC3749.m6935(t));
                abstractC3732M6651.f9546.m6972(jSONReader$FeatureArr);
                return (T) c3635M6947.m6193(type, z).mo6023(abstractC3732M6651, null, null, 0L);
            }
        }
        return t;
    }

    public <T> T getObject(String str, AbstractC3740<T> abstractC3740, JSONReader$Feature... jSONReader$FeatureArr) {
        return (T) getObject(str, abstractC3740.f9599, jSONReader$FeatureArr);
    }

    public <T> T getObject(String str, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(str);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
