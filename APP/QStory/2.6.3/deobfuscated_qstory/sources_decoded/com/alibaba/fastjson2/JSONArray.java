package com.alibaba.fastjson2;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.reader.C2802;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2827;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.AbstractC2867;
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
import p291.C8524;
import p291.InterfaceC8523;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class JSONArray extends ArrayList<Object> {
    static InterfaceC8523 arrayWriter = null;
    private static final long serialVersionUID = 1;

    public JSONArray(Object... objArr) {
        super(objArr.length);
        super.addAll(Arrays.asList(objArr));
    }

    public static JSONArray copyOf(Collection collection) {
        return new JSONArray((Collection<?>) collection);
    }

    public static JSONArray from(Object obj) {
        return (JSONArray) InterfaceC2916.m6371(obj, null);
    }

    public static JSONArray of(Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray = new JSONArray(3);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        jSONArray.add(obj3);
        return jSONArray;
    }

    public static JSONArray parse(String str, JSONReader$Feature... jSONReader$FeatureArr) {
        return InterfaceC2916.m6373(str, jSONReader$FeatureArr);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2943 c2943M6389 = AbstractC2933.m6389();
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(str, c2943M6389);
        try {
            List<T> listMo6122 = abstractC2899M6092.mo6122(cls);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(listMo6122);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943M6389.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
            return listMo6122;
        } catch (Throwable th) {
            try {
                abstractC2899M6092.close();
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
            C0276.m850(AbstractC2442.m4580(obj, "' to BigInteger", new StringBuilder("Can not cast '")));
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
            C0276.m850(AbstractC2442.m4580(obj, "' to boolean", new StringBuilder("Can not cast '")));
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
            C0276.m850(AbstractC2442.m4580(obj, "' to byte", new StringBuilder("Can not cast '")));
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
            return AbstractC2866.m5868((String) obj);
        }
        if (!(obj instanceof Number)) {
            return AbstractC2867.m5919(obj);
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
            C0276.m850(AbstractC2442.m4580(obj, "' to double", new StringBuilder("Can not cast '")));
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
            C0276.m850(AbstractC2442.m4580(obj, "' to float", new StringBuilder("Can not cast '")));
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
            return AbstractC2867.m5906(obj);
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
            C0276.m850(AbstractC2442.m4580(obj, "' to int value", new StringBuilder("Can not cast '")));
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
            C0276.m850(AbstractC2442.m4580(obj, "' to Integer", new StringBuilder("Can not cast '")));
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
                return of((Object) str);
            }
            return (JSONArray) AbstractC2933.f9282.mo5463(AbstractC2899.m6091(str), null, null, 0L);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray((Collection<?>) obj);
            set(i, jSONArray);
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArrayOf = of((Object[]) obj);
            set(i, jSONArrayOf);
            return jSONArrayOf;
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
            return (JSONObject) AbstractC2933.f9281.mo5463(AbstractC2899.m6091(str), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            set(i, jSONObject);
            return jSONObject;
        }
        Class<?> cls = obj.getClass();
        InterfaceC8523 interfaceC8523M14106 = AbstractC2933.f9294.m14106(cls, cls, false);
        JSONObject jSONObjectMo14092 = interfaceC8523M14106 instanceof C8524 ? ((C8524) interfaceC8523M14106).mo14092(obj, 0L) : (JSONObject) InterfaceC2916.m6371(obj, null);
        set(i, jSONObjectMo14092);
        return jSONObjectMo14092;
    }

    public LocalDate getLocalDate(int i, LocalDate localDate) {
        Object obj = super.get(i);
        return obj == null ? localDate : obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) AbstractC2867.m5927(LocalDate.class, obj);
    }

    public LocalDateTime getLocalDateTime(int i, LocalDateTime localDateTime) {
        Object obj = super.get(i);
        return obj == null ? localDateTime : obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) AbstractC2867.m5927(LocalDateTime.class, obj);
    }

    public LocalTime getLocalTime(int i, LocalTime localTime) {
        Object obj = super.get(i);
        return obj == null ? localTime : obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) AbstractC2867.m5927(LocalTime.class, obj);
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
            C0276.m850(AbstractC2442.m4580(obj, "' to Long", new StringBuilder("Can not cast '")));
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
            C0276.m850(AbstractC2442.m4580(obj, "' to long value", new StringBuilder("Can not cast '")));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T getObject(int r11, java.lang.Class<T> r12, com.alibaba.fastjson2.JSONReader$Feature... r13) {
        /*
            r10 = this;
            java.lang.Object r10 = r10.get(r11)
            r11 = 0
            if (r10 != 0) goto L9
            goto L89
        L9:
            java.lang.Class r0 = r10.getClass()
            com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世 r1 = com.alibaba.fastjson2.AbstractC2933.m6387()
            java.util.function.Function r0 = r1.m5631(r0, r12)
            if (r0 == 0) goto L1c
            java.lang.Object r10 = r0.apply(r10)
            return r10
        L1c:
            int r0 = r13.length
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L22:
            if (r2 >= r0) goto L31
            r6 = r13[r2]
            long r7 = r6.mask
            long r4 = r4 | r7
            com.alibaba.fastjson2.JSONReader$Feature r7 = com.alibaba.fastjson2.JSONReader$Feature.FieldBased
            if (r6 != r7) goto L2e
            r3 = 1
        L2e:
            int r2 = r2 + 1
            goto L22
        L31:
            boolean r0 = r10 instanceof java.util.Map
            if (r0 == 0) goto L40
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r11 = r1.m5633(r12, r3)
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = r11.mo5507(r10, r4)
            return r10
        L40:
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L4f
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r11 = r1.m5633(r12, r3)
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r10 = r11.mo5469(r10, r4)
            return r10
        L4f:
            java.lang.Class r12 = com.alibaba.fastjson2.util.AbstractC2867.m5942(r12)
            boolean r0 = r12.isInstance(r10)
            if (r0 == 0) goto L5a
            return r10
        L5a:
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L8a
            r0 = r10
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L89
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L70
            goto L89
        L70:
            boolean r2 = r12.isEnum()
            if (r2 == 0) goto L8a
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r2 = r1.m5633(r12, r3)
            boolean r4 = r2 instanceof com.alibaba.fastjson2.reader.C2737
            if (r4 == 0) goto L8b
            long r10 = com.alibaba.fastjson2.util.AbstractC2860.m5774(r0)
            com.alibaba.fastjson2.reader.飘花落叶言子哲苏世兰楪 r2 = (com.alibaba.fastjson2.reader.C2737) r2
            java.lang.Enum r10 = r2.m5535(r10)
            return r10
        L89:
            return r11
        L8a:
            r2 = r11
        L8b:
            java.lang.String r10 = com.alibaba.fastjson2.InterfaceC2916.m6375(r10)
            com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏 r5 = com.alibaba.fastjson2.AbstractC2899.m6091(r10)
            com.alibaba.fastjson2.飘花落叶言子苏兰哲世楪 r0 = r5.f9201
            r0.m6412(r13)
            if (r2 != 0) goto L9e
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r2 = r1.m5633(r12, r3)
        L9e:
            r4 = r2
            r7 = 0
            r8 = 0
            r6 = 0
            java.lang.Object r12 = r4.mo5463(r5, r6, r7, r8)
            boolean r13 = r5.mo6165()
            if (r13 == 0) goto Lae
            return r12
        Lae:
            java.lang.String r12 = "not support input "
            java.lang.String r10 = r12.concat(r10)
            androidx.collection.C0276.m850(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONArray.getObject(int, java.lang.Class, com.alibaba.fastjson2.JSONReader$Feature[]):java.lang.Object");
    }

    public OffsetDateTime getOffsetDateTime(int i, OffsetDateTime offsetDateTime) {
        Object obj = super.get(i);
        return obj == null ? offsetDateTime : obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) AbstractC2867.m5927(OffsetDateTime.class, obj);
    }

    public OffsetTime getOffsetTime(int i, OffsetTime offsetTime) {
        Object obj = super.get(i);
        return obj == null ? offsetTime : obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) AbstractC2867.m5927(OffsetTime.class, obj);
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
            C0276.m850(AbstractC2442.m4580(obj, "' to short", new StringBuilder("Can not cast '")));
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
        return obj instanceof String ? (String) obj : obj instanceof Date ? AbstractC2866.m5886(((Date) obj).getTime(), AbstractC2866.f9027) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum) || (obj instanceof TemporalAccessor)) ? obj.toString() : InterfaceC2916.m6375(obj);
    }

    public ZonedDateTime getZonedDateTime(int i, ZonedDateTime zonedDateTime) {
        Object obj = super.get(i);
        return obj == null ? zonedDateTime : obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) AbstractC2867.m5927(ZonedDateTime.class, obj);
    }

    public boolean isValid(JSONSchema jSONSchema) {
        return jSONSchema.mo5648(this).f2156;
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
    public <T> T to(Class<T> cls) {
        return cls == String.class ? (T) toString() : cls == InterfaceC2916.class ? this : (T) AbstractC2933.m6387().m5633(cls, false).mo5469(this, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] toArray(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC2933.f9289;
        long j = 0;
        boolean z = false;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
            if (jSONReader$Feature == JSONReader$Feature.FieldBased) {
                z = true;
            }
        }
        C2802 c2802M6387 = AbstractC2933.m6387();
        InterfaceC2788 interfaceC2788M5633 = c2802M6387.m5633(cls, z);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, size()));
        for (int i = 0; i < size(); i++) {
            Object objMo5507 = get(i);
            if ((objMo5507 instanceof JSONObject) || (objMo5507 instanceof Map)) {
                objMo5507 = interfaceC2788M5633.mo5507((Map) objMo5507, j);
            } else {
                if (objMo5507 != null && !cls.isInstance(objMo5507)) {
                    Class<?> cls2 = objMo5507.getClass();
                    Function functionM5631 = c2802M6387.m5631(cls2, cls);
                    if (functionM5631 == null) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    tArr[i] = functionM5631.apply(objMo5507);
                }
            }
            tArr[i] = objMo5507;
        }
        return tArr;
    }

    public byte[] toJSONBBytes(JSONWriter$Feature... jSONWriter$FeatureArr) {
        int i = AbstractC2897.f9161;
        C2896 c2896 = new C2896(new C2895(AbstractC2933.f9294, jSONWriter$FeatureArr));
        try {
            c2896.m6085(this);
            c2896.mo5998(this);
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

    public <T> List<T> toJavaList(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        return toList(cls, jSONReader$FeatureArr);
    }

    @Deprecated
    public <T> T toJavaObject(Type type) {
        return (T) to(type);
    }

    public <T> List<T> toList(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC2933.f9289;
        long j = 0;
        boolean z = false;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
            if (jSONReader$Feature == JSONReader$Feature.FieldBased) {
                z = true;
            }
        }
        C2802 c2802M6387 = AbstractC2933.m6387();
        InterfaceC2788 interfaceC2788M5633 = c2802M6387.m5633(cls, z);
        ArrayList arrayList = new ArrayList(size());
        for (int i = 0; i < size(); i++) {
            Object objMo5507 = get(i);
            if ((objMo5507 instanceof JSONObject) || (objMo5507 instanceof Map)) {
                objMo5507 = interfaceC2788M5633.mo5507((Map) objMo5507, j);
            } else {
                if (objMo5507 != null && !cls.isInstance(objMo5507)) {
                    Class<?> cls2 = objMo5507.getClass();
                    Function functionM5631 = c2802M6387.m5631(cls2, cls);
                    if (functionM5631 == null) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    arrayList.add(functionM5631.apply(objMo5507));
                }
            }
            arrayList.add(objMo5507);
        }
        return arrayList;
    }

    public String toString(JSONWriter$Feature... jSONWriter$FeatureArr) throws IOException {
        AbstractC2897 abstractC2897M6055 = AbstractC2897.m6055(jSONWriter$FeatureArr);
        try {
            if ((abstractC2897M6055.f9178.f9153 & JSONObject.NONE_DIRECT_FEATURES) == 0) {
                abstractC2897M6055.mo5998(this);
            } else {
                abstractC2897M6055.m6085(this);
                if (arrayWriter == null) {
                    arrayWriter = abstractC2897M6055.m6080(JSONArray.class, JSONArray.class);
                }
                arrayWriter.mo5679(abstractC2897M6055, this, null, null, 0L);
            }
            String string = abstractC2897M6055.toString();
            abstractC2897M6055.close();
            return string;
        } finally {
        }
    }

    public JSONArray fluentRemove(Object obj) {
        remove(obj);
        return this;
    }

    public static String toJSONString(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) {
        return InterfaceC2916.m6372(obj, jSONWriter$FeatureArr);
    }

    public static JSONArray from(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) {
        return (JSONArray) InterfaceC2916.m6371(obj, jSONWriter$FeatureArr);
    }

    public JSONArray(int i) {
        super(i);
    }

    public JSONArray(Collection<?> collection) {
        super(collection);
    }

    public JSONArray() {
    }

    public static JSONArray of(Object obj) {
        JSONArray jSONArray = new JSONArray(1);
        jSONArray.add(obj);
        return jSONArray;
    }

    public static JSONArray of(Object obj, Object obj2) {
        JSONArray jSONArray = new JSONArray(2);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        return jSONArray;
    }

    public static JSONArray of(Object... objArr) {
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

    public <T> T to(Type type, long j) {
        if (type == String.class) {
            return (T) toString();
        }
        return (T) AbstractC2933.m6387().m5633(type, false).mo5469(this, j);
    }

    public <T> T to(Type type) {
        return (T) to(type, 0L);
    }

    public Date getDate(int i, Date date) {
        Date date2 = getDate(i);
        return date2 == null ? date : date2;
    }

    @Override // java.util.AbstractCollection
    public String toString() throws IOException {
        AbstractC2897 abstractC2897M6057 = AbstractC2897.m6057();
        try {
            abstractC2897M6057.m6085(this);
            abstractC2897M6057.mo5998(this);
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

    public static JSONArray parseArray(String str, JSONReader$Feature... jSONReader$FeatureArr) {
        return InterfaceC2916.m6373(str, jSONReader$FeatureArr);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2943 c2943M6388 = AbstractC2933.m6388(jSONReader$FeatureArr);
        AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(str, c2943M6388);
        try {
            List<T> listMo6122 = abstractC2899M6092.mo6122(cls);
            if (abstractC2899M6092.f9200 != null) {
                abstractC2899M6092.m6182(listMo6122);
            }
            if (abstractC2899M6092.f9193 != 26 && (c2943M6388.f9320 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2899M6092.mo6170("input not end"));
            }
            abstractC2899M6092.close();
            return listMo6122;
        } catch (Throwable th) {
            try {
                abstractC2899M6092.close();
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
        C2802 c2802M6387 = AbstractC2933.m6387();
        Function functionM5631 = c2802M6387.m5631(cls, type);
        if (functionM5631 != null) {
            return (T) functionM5631.apply(t);
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
            return (T) c2802M6387.m5633(type, z).mo5507((Map) t, j);
        }
        if (t instanceof Collection) {
            return (T) c2802M6387.m5633(type, z).mo5469((Collection) t, j);
        }
        Class clsM5942 = AbstractC2867.m5942(type);
        if (clsM5942.isInstance(t)) {
            return t;
        }
        AbstractC2899 abstractC2899M6091 = AbstractC2899.m6091(InterfaceC2916.m6375(t));
        abstractC2899M6091.f9201.m6412(jSONReader$FeatureArr);
        return (T) c2802M6387.m5633(clsM5942, z).mo5463(abstractC2899M6091, null, null, 0L);
    }

    public <T> T getObject(int i, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(i);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
