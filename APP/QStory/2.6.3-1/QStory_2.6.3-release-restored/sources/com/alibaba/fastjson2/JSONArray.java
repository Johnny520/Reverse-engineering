package com.alibaba.fastjson2;

import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.reader.C3570;
import com.alibaba.fastjson2.reader.C3635;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3660;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3699;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.io.IOException;
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
import p307.C9353;
import p307.InterfaceC9352;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class JSONArray extends ArrayList<Object> {
    static InterfaceC9352 arrayWriter = null;
    private static final long serialVersionUID = 1;

    public JSONArray(Object... objArr) {
        super(objArr.length);
        super.addAll(Arrays.asList(objArr));
    }

    public static JSONArray copyOf(Collection collection) {
        return new JSONArray((Collection<?>) collection);
    }

    public static JSONArray from(Object obj) {
        return (JSONArray) InterfaceC3749.m6931(obj, null);
    }

    /* JADX INFO: renamed from: of */
    public static JSONArray m2of(Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray = new JSONArray(3);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        jSONArray.add(obj3);
        return jSONArray;
    }

    public static JSONArray parse(String str, JSONReader$Feature... jSONReader$FeatureArr) {
        return InterfaceC3749.m6933(str, jSONReader$FeatureArr);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C3776 c3776M6949 = AbstractC3766.m6949();
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, c3776M6949);
        try {
            List<T> listMo6682 = abstractC3732M6652.mo6682(cls);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(listMo6682);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776M6949.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return listMo6682;
        } catch (Throwable th) {
            try {
                abstractC3732M6652.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
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

    public JSONArray fluentRemove(int i) {
        remove(i);
        return this;
    }

    public JSONArray fluentRemoveAll(Collection<?> collection) {
        removeAll(collection);
        return this;
    }

    public JSONArray fluentSet(int i, Object obj) {
        set(i, obj);
        return this;
    }

    public BigDecimal getBigDecimal(int i) {
        Object obj = get(i);
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

    public BigInteger getBigInteger(int i) {
        Object obj = get(i);
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

    public Boolean getBoolean(int i) {
        Object obj = get(i);
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
        String str = (String) obj;
        if (str.isEmpty() || "null".equalsIgnoreCase(str)) {
            return null;
        }
        return Boolean.valueOf("true".equalsIgnoreCase(str) || "1".equals(str));
    }

    public boolean getBooleanValue(int i) {
        Boolean bool = getBoolean(i);
        return bool != null && bool.booleanValue();
    }

    public Byte getByte(int i) {
        Object obj = get(i);
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

    public byte getByteValue(int i) {
        Byte b = getByte(i);
        if (b == null) {
            return (byte) 0;
        }
        return b.byteValue();
    }

    public Date getDate(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof String) {
            return AbstractC3699.m6428((String) obj);
        }
        if (!(obj instanceof Number)) {
            return AbstractC3700.m6479(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0) {
            return null;
        }
        return new Date(jLongValue);
    }

    public Double getDouble(int i) {
        Object obj = get(i);
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

    public double getDoubleValue(int i) {
        Double d = getDouble(i);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    public Float getFloat(int i) {
        Object obj = get(i);
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

    public float getFloatValue(int i) {
        Float f = getFloat(i);
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public Instant getInstant(int i) {
        Object obj = get(i);
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

    public int getIntValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (!(obj instanceof String)) {
            C1123.m1410(AbstractC3275.m5140(obj, "' to int value", new StringBuilder("Can not cast '")));
            return 0;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return 0;
        }
        return strTrim.indexOf(46) != -1 ? (int) Double.parseDouble(strTrim) : Integer.parseInt(strTrim);
    }

    public Integer getInteger(int i) {
        Object obj = get(i);
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

    public JSONArray getJSONArray(int i) {
        Object obj = get(i);
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
                return m0of((Object) str);
            }
            return (JSONArray) AbstractC3766.f9627.mo6023(AbstractC3732.m6651(str), null, null, 0L);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray((Collection<?>) obj);
            set(i, jSONArray);
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArrayM3of = m3of((Object[]) obj);
            set(i, jSONArrayM3of);
            return jSONArrayM3of;
        }
        if (!obj.getClass().isArray()) {
            return null;
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray2 = new JSONArray(length);
        for (int i2 = 0; i2 < length; i2++) {
            jSONArray2.add(Array.get(obj, i2));
        }
        set(i, jSONArray2);
        return jSONArray2;
    }

    public JSONObject getJSONObject(int i) {
        Object obj = get(i);
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
            return (JSONObject) AbstractC3766.f9626.mo6023(AbstractC3732.m6651(str), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            set(i, jSONObject);
            return jSONObject;
        }
        Class<?> cls = obj.getClass();
        InterfaceC9352 interfaceC9352M14665 = AbstractC3766.f9639.m14665(cls, cls, false);
        JSONObject jSONObjectMo14651 = interfaceC9352M14665 instanceof C9353 ? ((C9353) interfaceC9352M14665).mo14651(obj, 0L) : (JSONObject) InterfaceC3749.m6931(obj, null);
        set(i, jSONObjectMo14651);
        return jSONObjectMo14651;
    }

    public LocalDate getLocalDate(int i, LocalDate localDate) {
        Object obj = super.get(i);
        return obj == null ? localDate : obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) AbstractC3700.m6487(LocalDate.class, obj);
    }

    public LocalDateTime getLocalDateTime(int i, LocalDateTime localDateTime) {
        Object obj = super.get(i);
        return obj == null ? localDateTime : obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) AbstractC3700.m6487(LocalDateTime.class, obj);
    }

    public LocalTime getLocalTime(int i, LocalTime localTime) {
        Object obj = super.get(i);
        return obj == null ? localTime : obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) AbstractC3700.m6487(LocalTime.class, obj);
    }

    public Long getLong(int i) {
        Object obj = get(i);
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

    public long getLongValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (!(obj instanceof String)) {
            C1123.m1410(AbstractC3275.m5140(obj, "' to long value", new StringBuilder("Can not cast '")));
            return 0L;
        }
        String strTrim = ((String) obj).trim();
        if (strTrim.isEmpty() || "null".equalsIgnoreCase(strTrim)) {
            return 0L;
        }
        return strTrim.indexOf(46) != -1 ? (long) Double.parseDouble(strTrim) : Long.parseLong(strTrim);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T getObject(int i, Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        InterfaceC3621 interfaceC3621M6193;
        T t = (T) get(i);
        if (t != 0) {
            Class cls2 = t.getClass();
            C3635 c3635M6947 = AbstractC3766.m6947();
            Function functionM6191 = c3635M6947.m6191(cls2, cls);
            if (functionM6191 != null) {
                return (T) functionM6191.apply(t);
            }
            long j = 0;
            boolean z = false;
            for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
                j |= jSONReader$Feature.mask;
                if (jSONReader$Feature == JSONReader$Feature.FieldBased) {
                    z = true;
                }
            }
            if (t instanceof Map) {
                return (T) c3635M6947.m6193(cls, z).mo6067((Map) t, j);
            }
            if (t instanceof Collection) {
                return (T) c3635M6947.m6193(cls, z).mo6029((Collection) t, j);
            }
            Class clsM6502 = AbstractC3700.m6502(cls);
            if (clsM6502.isInstance(t)) {
                return t;
            }
            if (t instanceof String) {
                String str = (String) t;
                if (!str.isEmpty() && !"null".equals(str)) {
                    if (clsM6502.isEnum()) {
                        interfaceC3621M6193 = c3635M6947.m6193(clsM6502, z);
                        if (interfaceC3621M6193 instanceof C3570) {
                            return (T) ((C3570) interfaceC3621M6193).m6095(AbstractC3693.m6334(str));
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
        return null;
    }

    public OffsetDateTime getOffsetDateTime(int i, OffsetDateTime offsetDateTime) {
        Object obj = super.get(i);
        return obj == null ? offsetDateTime : obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) AbstractC3700.m6487(OffsetDateTime.class, obj);
    }

    public OffsetTime getOffsetTime(int i, OffsetTime offsetTime) {
        Object obj = super.get(i);
        return obj == null ? offsetTime : obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) AbstractC3700.m6487(OffsetTime.class, obj);
    }

    public Short getShort(int i) {
        Object obj = get(i);
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

    public short getShortValue(int i) {
        Short sh = getShort(i);
        if (sh == null) {
            return (short) 0;
        }
        return sh.shortValue();
    }

    public String getString(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        return obj instanceof String ? (String) obj : obj instanceof Date ? AbstractC3699.m6446(((Date) obj).getTime(), AbstractC3699.f9372) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum) || (obj instanceof TemporalAccessor)) ? obj.toString() : InterfaceC3749.m6935(obj);
    }

    public ZonedDateTime getZonedDateTime(int i, ZonedDateTime zonedDateTime) {
        Object obj = super.get(i);
        return obj == null ? zonedDateTime : obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) AbstractC3700.m6487(ZonedDateTime.class, obj);
    }

    public boolean isValid(JSONSchema jSONSchema) {
        return jSONSchema.mo6208(this).f2501;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        int size = super.size();
        if (i < 0) {
            int i2 = i + size;
            if (i2 >= 0) {
                return super.set(i2, obj);
            }
            super.add(0, obj);
            return null;
        }
        if (i < size) {
            return super.set(i, obj);
        }
        if (i < size + 4096) {
            while (true) {
                int i3 = i - 1;
                if (i == size) {
                    break;
                }
                super.add(null);
                i = i3;
            }
            super.add(obj);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: to */
    public <T> T m4to(Class<T> cls) {
        return cls == String.class ? (T) toString() : cls == InterfaceC3749.class ? this : (T) AbstractC3766.m6947().m6193(cls, false).mo6029(this, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] toArray(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC3766.f9634;
        long j = 0;
        boolean z = false;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
            if (jSONReader$Feature == JSONReader$Feature.FieldBased) {
                z = true;
            }
        }
        C3635 c3635M6947 = AbstractC3766.m6947();
        InterfaceC3621 interfaceC3621M6193 = c3635M6947.m6193(cls, z);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, size()));
        for (int i = 0; i < size(); i++) {
            Object objMo6067 = get(i);
            if ((objMo6067 instanceof JSONObject) || (objMo6067 instanceof Map)) {
                objMo6067 = interfaceC3621M6193.mo6067((Map) objMo6067, j);
            } else {
                if (objMo6067 != null && !cls.isInstance(objMo6067)) {
                    Class<?> cls2 = objMo6067.getClass();
                    Function functionM6191 = c3635M6947.m6191(cls2, cls);
                    if (functionM6191 == null) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    tArr[i] = functionM6191.apply(objMo6067);
                }
            }
            tArr[i] = objMo6067;
        }
        return tArr;
    }

    public byte[] toJSONBBytes(JSONWriter$Feature... jSONWriter$FeatureArr) {
        int i = AbstractC3730.f9506;
        C3729 c3729 = new C3729(new C3728(AbstractC3766.f9639, jSONWriter$FeatureArr));
        try {
            c3729.m6645(this);
            c3729.mo6558(this);
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

    public <T> List<T> toJavaList(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        return toList(cls, jSONReader$FeatureArr);
    }

    @Deprecated
    public <T> T toJavaObject(Type type) {
        return (T) m5to(type);
    }

    public <T> List<T> toList(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC3766.f9634;
        long j = 0;
        boolean z = false;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
            if (jSONReader$Feature == JSONReader$Feature.FieldBased) {
                z = true;
            }
        }
        C3635 c3635M6947 = AbstractC3766.m6947();
        InterfaceC3621 interfaceC3621M6193 = c3635M6947.m6193(cls, z);
        ArrayList arrayList = new ArrayList(size());
        for (int i = 0; i < size(); i++) {
            Object objMo6067 = get(i);
            if ((objMo6067 instanceof JSONObject) || (objMo6067 instanceof Map)) {
                objMo6067 = interfaceC3621M6193.mo6067((Map) objMo6067, j);
            } else {
                if (objMo6067 != null && !cls.isInstance(objMo6067)) {
                    Class<?> cls2 = objMo6067.getClass();
                    Function functionM6191 = c3635M6947.m6191(cls2, cls);
                    if (functionM6191 == null) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    arrayList.add(functionM6191.apply(objMo6067));
                }
            }
            arrayList.add(objMo6067);
        }
        return arrayList;
    }

    public String toString(JSONWriter$Feature... jSONWriter$FeatureArr) throws IOException {
        AbstractC3730 abstractC3730M6615 = AbstractC3730.m6615(jSONWriter$FeatureArr);
        try {
            if ((abstractC3730M6615.f9523.f9498 & JSONObject.NONE_DIRECT_FEATURES) == 0) {
                abstractC3730M6615.mo6558(this);
            } else {
                abstractC3730M6615.m6645(this);
                if (arrayWriter == null) {
                    arrayWriter = abstractC3730M6615.m6640(JSONArray.class, JSONArray.class);
                }
                arrayWriter.mo6239(abstractC3730M6615, this, null, null, 0L);
            }
            String string = abstractC3730M6615.toString();
            abstractC3730M6615.close();
            return string;
        } finally {
        }
    }

    public JSONArray fluentRemove(Object obj) {
        remove(obj);
        return this;
    }

    public static String toJSONString(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) {
        return InterfaceC3749.m6932(obj, jSONWriter$FeatureArr);
    }

    public static JSONArray from(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) {
        return (JSONArray) InterfaceC3749.m6931(obj, jSONWriter$FeatureArr);
    }

    public JSONArray(int i) {
        super(i);
    }

    public JSONArray(Collection<?> collection) {
        super(collection);
    }

    public JSONArray() {
    }

    /* JADX INFO: renamed from: of */
    public static JSONArray m0of(Object obj) {
        JSONArray jSONArray = new JSONArray(1);
        jSONArray.add(obj);
        return jSONArray;
    }

    /* JADX INFO: renamed from: of */
    public static JSONArray m1of(Object obj, Object obj2) {
        JSONArray jSONArray = new JSONArray(2);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        return jSONArray;
    }

    /* JADX INFO: renamed from: of */
    public static JSONArray m3of(Object... objArr) {
        return new JSONArray(objArr);
    }

    public LocalDate getLocalDate(int i) {
        return getLocalDate(i, null);
    }

    public LocalDateTime getLocalDateTime(int i) {
        return getLocalDateTime(i, null);
    }

    public LocalTime getLocalTime(int i) {
        return getLocalTime(i, null);
    }

    public OffsetDateTime getOffsetDateTime(int i) {
        return getOffsetDateTime(i, null);
    }

    public OffsetTime getOffsetTime(int i) {
        return getOffsetTime(i, null);
    }

    public ZonedDateTime getZonedDateTime(int i) {
        return getZonedDateTime(i, null);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m6to(Type type, long j) {
        if (type == String.class) {
            return (T) toString();
        }
        return (T) AbstractC3766.m6947().m6193(type, false).mo6029(this, j);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m5to(Type type) {
        return (T) m6to(type, 0L);
    }

    public Date getDate(int i, Date date) {
        Date date2 = getDate(i);
        return date2 == null ? date : date2;
    }

    @Override // java.util.AbstractCollection
    public String toString() throws IOException {
        AbstractC3730 abstractC3730M6617 = AbstractC3730.m6617();
        try {
            abstractC3730M6617.m6645(this);
            abstractC3730M6617.mo6558(this);
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

    public static JSONArray parseArray(String str, JSONReader$Feature... jSONReader$FeatureArr) {
        return InterfaceC3749.m6933(str, jSONReader$FeatureArr);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C3776 c3776M6948 = AbstractC3766.m6948(jSONReader$FeatureArr);
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, c3776M6948);
        try {
            List<T> listMo6682 = abstractC3732M6652.mo6682(cls);
            if (abstractC3732M6652.f9545 != null) {
                abstractC3732M6652.m6742(listMo6682);
            }
            if (abstractC3732M6652.f9538 != 26 && (c3776M6948.f9665 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC3732M6652.mo6730("input not end"));
            }
            abstractC3732M6652.close();
            return listMo6682;
        } catch (Throwable th) {
            try {
                abstractC3732M6652.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public <T> T getObject(int i, Type type, JSONReader$Feature... jSONReader$FeatureArr) {
        T t = (T) get(i);
        if (t == null) {
            return null;
        }
        Class<?> cls = t.getClass();
        C3635 c3635M6947 = AbstractC3766.m6947();
        Function functionM6191 = c3635M6947.m6191(cls, type);
        if (functionM6191 != null) {
            return (T) functionM6191.apply(t);
        }
        long j = 0;
        boolean z = false;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
            if (jSONReader$Feature == JSONReader$Feature.FieldBased) {
                z = true;
            }
        }
        if (t instanceof Map) {
            return (T) c3635M6947.m6193(type, z).mo6067((Map) t, j);
        }
        if (t instanceof Collection) {
            return (T) c3635M6947.m6193(type, z).mo6029((Collection) t, j);
        }
        Class clsM6502 = AbstractC3700.m6502(type);
        if (clsM6502.isInstance(t)) {
            return t;
        }
        AbstractC3732 abstractC3732M6651 = AbstractC3732.m6651(InterfaceC3749.m6935(t));
        abstractC3732M6651.f9546.m6972(jSONReader$FeatureArr);
        return (T) c3635M6947.m6193(clsM6502, z).mo6023(abstractC3732M6651, null, null, 0L);
    }

    public <T> T getObject(int i, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(i);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
