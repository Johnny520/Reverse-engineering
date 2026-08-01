package com.alibaba.fastjson2;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.reader.C2801;
import com.alibaba.fastjson2.reader.InterfaceC2787;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2826;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2866;
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
import p291.C8532;
import p291.InterfaceC8531;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class JSONArray extends ArrayList<Object> {
    static InterfaceC8531 arrayWriter = null;
    private static final long serialVersionUID = 1;

    public JSONArray(Object... objArr) {
        super(objArr.length);
        super.addAll(Arrays.asList(objArr));
    }

    public static JSONArray copyOf(Collection collection) {
        return new JSONArray((Collection<?>) collection);
    }

    public static JSONArray from(Object obj) {
        return (JSONArray) InterfaceC2915.m6313(obj, null);
    }

    public static JSONArray of(Object obj, Object obj2, Object obj3) {
        JSONArray jSONArray = new JSONArray(3);
        jSONArray.add(obj);
        jSONArray.add(obj2);
        jSONArray.add(obj3);
        return jSONArray;
    }

    public static JSONArray parse(String str, JSONReader$Feature... jSONReader$FeatureArr) {
        return InterfaceC2915.m6315(str, jSONReader$FeatureArr);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2942 c2942M6331 = AbstractC2932.m6331();
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, c2942M6331);
        try {
            List<T> listMo6076 = abstractC2898M6047.mo6076(cls);
            if (abstractC2898M6047.f9198 != null) {
                abstractC2898M6047.m6137(listMo6076);
            }
            if (abstractC2898M6047.f9191 != 26 && (c2942M6331.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
            }
            abstractC2898M6047.close();
            return listMo6076;
        } catch (Throwable th) {
            try {
                abstractC2898M6047.close();
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
            C0276.m849(AbstractC2442.m4570(obj, "' to BigInteger", new StringBuilder("Can not cast '")));
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
            C0276.m849(AbstractC2442.m4570(obj, "' to boolean", new StringBuilder("Can not cast '")));
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
            C0276.m849(AbstractC2442.m4570(obj, "' to byte", new StringBuilder("Can not cast '")));
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
            return AbstractC2865.m5823((String) obj);
        }
        if (!(obj instanceof Number)) {
            return AbstractC2866.m5874(obj);
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
            C0276.m849(AbstractC2442.m4570(obj, "' to double", new StringBuilder("Can not cast '")));
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
            C0276.m849(AbstractC2442.m4570(obj, "' to float", new StringBuilder("Can not cast '")));
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
            return AbstractC2866.m5861(obj);
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
            C0276.m849(AbstractC2442.m4570(obj, "' to int value", new StringBuilder("Can not cast '")));
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
            C0276.m849(AbstractC2442.m4570(obj, "' to Integer", new StringBuilder("Can not cast '")));
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
            return (JSONArray) AbstractC2932.f9280.mo5418(AbstractC2898.m6046(str), null, null, 0L);
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
            return (JSONObject) AbstractC2932.f9279.mo5418(AbstractC2898.m6046(str), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            set(i, jSONObject);
            return jSONObject;
        }
        Class<?> cls = obj.getClass();
        InterfaceC8531 interfaceC8531M14087 = AbstractC2932.f9292.m14087(cls, cls, false);
        JSONObject jSONObjectMo14073 = interfaceC8531M14087 instanceof C8532 ? ((C8532) interfaceC8531M14087).mo14073(obj, 0L) : (JSONObject) InterfaceC2915.m6313(obj, null);
        set(i, jSONObjectMo14073);
        return jSONObjectMo14073;
    }

    public LocalDate getLocalDate(int i, LocalDate localDate) {
        Object obj = super.get(i);
        return obj == null ? localDate : obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) AbstractC2866.m5882(LocalDate.class, obj);
    }

    public LocalDateTime getLocalDateTime(int i, LocalDateTime localDateTime) {
        Object obj = super.get(i);
        return obj == null ? localDateTime : obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) AbstractC2866.m5882(LocalDateTime.class, obj);
    }

    public LocalTime getLocalTime(int i, LocalTime localTime) {
        Object obj = super.get(i);
        return obj == null ? localTime : obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) AbstractC2866.m5882(LocalTime.class, obj);
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
            C0276.m849(AbstractC2442.m4570(obj, "' to Long", new StringBuilder("Can not cast '")));
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
            C0276.m849(AbstractC2442.m4570(obj, "' to long value", new StringBuilder("Can not cast '")));
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
            com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世 r1 = com.alibaba.fastjson2.AbstractC2932.m6329()
            java.util.function.Function r0 = r1.m5586(r0, r12)
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
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r11 = r1.m5588(r12, r3)
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r10 = r11.mo5462(r10, r4)
            return r10
        L40:
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L4f
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r11 = r1.m5588(r12, r3)
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r10 = r11.mo5424(r10, r4)
            return r10
        L4f:
            java.lang.Class r12 = com.alibaba.fastjson2.util.AbstractC2866.m5897(r12)
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
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r2 = r1.m5588(r12, r3)
            boolean r4 = r2 instanceof com.alibaba.fastjson2.reader.C2736
            if (r4 == 0) goto L8b
            long r10 = com.alibaba.fastjson2.util.AbstractC2859.m5729(r0)
            com.alibaba.fastjson2.reader.飘花落叶言子哲苏世兰楪 r2 = (com.alibaba.fastjson2.reader.C2736) r2
            java.lang.Enum r10 = r2.m5490(r10)
            return r10
        L89:
            return r11
        L8a:
            r2 = r11
        L8b:
            java.lang.String r10 = com.alibaba.fastjson2.InterfaceC2915.m6317(r10)
            com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏 r5 = com.alibaba.fastjson2.AbstractC2898.m6046(r10)
            com.alibaba.fastjson2.飘花落叶言子苏兰哲世楪 r0 = r5.f9199
            r0.m6354(r13)
            if (r2 != 0) goto L9e
            com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世 r2 = r1.m5588(r12, r3)
        L9e:
            r4 = r2
            r7 = 0
            r8 = 0
            r6 = 0
            java.lang.Object r12 = r4.mo5418(r5, r6, r7, r8)
            boolean r13 = r5.mo6119()
            if (r13 == 0) goto Lae
            return r12
        Lae:
            java.lang.String r12 = "not support input "
            java.lang.String r10 = r12.concat(r10)
            androidx.collection.C0276.m849(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONArray.getObject(int, java.lang.Class, com.alibaba.fastjson2.JSONReader$Feature[]):java.lang.Object");
    }

    public OffsetDateTime getOffsetDateTime(int i, OffsetDateTime offsetDateTime) {
        Object obj = super.get(i);
        return obj == null ? offsetDateTime : obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) AbstractC2866.m5882(OffsetDateTime.class, obj);
    }

    public OffsetTime getOffsetTime(int i, OffsetTime offsetTime) {
        Object obj = super.get(i);
        return obj == null ? offsetTime : obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) AbstractC2866.m5882(OffsetTime.class, obj);
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
            C0276.m849(AbstractC2442.m4570(obj, "' to short", new StringBuilder("Can not cast '")));
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
        return obj instanceof String ? (String) obj : obj instanceof Date ? AbstractC2865.m5841(((Date) obj).getTime(), AbstractC2865.f9025) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum) || (obj instanceof TemporalAccessor)) ? obj.toString() : InterfaceC2915.m6317(obj);
    }

    public ZonedDateTime getZonedDateTime(int i, ZonedDateTime zonedDateTime) {
        Object obj = super.get(i);
        return obj == null ? zonedDateTime : obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) AbstractC2866.m5882(ZonedDateTime.class, obj);
    }

    public boolean isValid(JSONSchema jSONSchema) {
        return jSONSchema.mo5603(this).f2155;
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
        return cls == String.class ? (T) toString() : cls == InterfaceC2915.class ? this : (T) AbstractC2932.m6329().m5588(cls, false).mo5424(this, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] toArray(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC2932.f9287;
        long j = 0;
        boolean z = false;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
            if (jSONReader$Feature == JSONReader$Feature.FieldBased) {
                z = true;
            }
        }
        C2801 c2801M6329 = AbstractC2932.m6329();
        InterfaceC2787 interfaceC2787M5588 = c2801M6329.m5588(cls, z);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, size()));
        for (int i = 0; i < size(); i++) {
            Object objMo5462 = get(i);
            if ((objMo5462 instanceof JSONObject) || (objMo5462 instanceof Map)) {
                objMo5462 = interfaceC2787M5588.mo5462((Map) objMo5462, j);
            } else {
                if (objMo5462 != null && !cls.isInstance(objMo5462)) {
                    Class<?> cls2 = objMo5462.getClass();
                    Function functionM5586 = c2801M6329.m5586(cls2, cls);
                    if (functionM5586 == null) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    tArr[i] = functionM5586.apply(objMo5462);
                }
            }
            tArr[i] = objMo5462;
        }
        return tArr;
    }

    public byte[] toJSONBBytes(JSONWriter$Feature... jSONWriter$FeatureArr) {
        int i = AbstractC2896.f9159;
        C2895 c2895 = new C2895(new C2894(AbstractC2932.f9292, jSONWriter$FeatureArr));
        try {
            c2895.m6039(this);
            c2895.mo5953(this);
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

    public <T> List<T> toJavaList(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        return toList(cls, jSONReader$FeatureArr);
    }

    @Deprecated
    public <T> T toJavaObject(Type type) {
        return (T) to(type);
    }

    public <T> List<T> toList(Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) {
        String str = AbstractC2932.f9287;
        long j = 0;
        boolean z = false;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
            if (jSONReader$Feature == JSONReader$Feature.FieldBased) {
                z = true;
            }
        }
        C2801 c2801M6329 = AbstractC2932.m6329();
        InterfaceC2787 interfaceC2787M5588 = c2801M6329.m5588(cls, z);
        ArrayList arrayList = new ArrayList(size());
        for (int i = 0; i < size(); i++) {
            Object objMo5462 = get(i);
            if ((objMo5462 instanceof JSONObject) || (objMo5462 instanceof Map)) {
                objMo5462 = interfaceC2787M5588.mo5462((Map) objMo5462, j);
            } else {
                if (objMo5462 != null && !cls.isInstance(objMo5462)) {
                    Class<?> cls2 = objMo5462.getClass();
                    Function functionM5586 = c2801M6329.m5586(cls2, cls);
                    if (functionM5586 == null) {
                        throw new JSONException(cls2 + " cannot be converted to " + cls);
                    }
                    arrayList.add(functionM5586.apply(objMo5462));
                }
            }
            arrayList.add(objMo5462);
        }
        return arrayList;
    }

    public String toString(JSONWriter$Feature... jSONWriter$FeatureArr) throws IOException {
        AbstractC2896 abstractC2896M6010 = AbstractC2896.m6010(jSONWriter$FeatureArr);
        try {
            if ((abstractC2896M6010.f9176.f9151 & JSONObject.NONE_DIRECT_FEATURES) == 0) {
                abstractC2896M6010.mo5953(this);
            } else {
                abstractC2896M6010.m6039(this);
                if (arrayWriter == null) {
                    arrayWriter = abstractC2896M6010.m6034(JSONArray.class, JSONArray.class);
                }
                arrayWriter.mo5634(abstractC2896M6010, this, null, null, 0L);
            }
            String string = abstractC2896M6010.toString();
            abstractC2896M6010.close();
            return string;
        } finally {
        }
    }

    public JSONArray fluentRemove(Object obj) {
        remove(obj);
        return this;
    }

    public static String toJSONString(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) {
        return InterfaceC2915.m6314(obj, jSONWriter$FeatureArr);
    }

    public static JSONArray from(Object obj, JSONWriter$Feature... jSONWriter$FeatureArr) {
        return (JSONArray) InterfaceC2915.m6313(obj, jSONWriter$FeatureArr);
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
        return (T) AbstractC2932.m6329().m5588(type, false).mo5424(this, j);
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
        AbstractC2896 abstractC2896M6012 = AbstractC2896.m6012();
        try {
            abstractC2896M6012.m6039(this);
            abstractC2896M6012.mo5953(this);
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

    public static JSONArray parseArray(String str, JSONReader$Feature... jSONReader$FeatureArr) {
        return InterfaceC2915.m6315(str, jSONReader$FeatureArr);
    }

    public static <T> List<T> parseArray(String str, Class<T> cls, JSONReader$Feature... jSONReader$FeatureArr) throws IOException {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2942 c2942M6330 = AbstractC2932.m6330(jSONReader$FeatureArr);
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, c2942M6330);
        try {
            List<T> listMo6076 = abstractC2898M6047.mo6076(cls);
            if (abstractC2898M6047.f9198 != null) {
                abstractC2898M6047.m6137(listMo6076);
            }
            if (abstractC2898M6047.f9191 != 26 && (c2942M6330.f9318 & JSONReader$Feature.IgnoreCheckClose.mask) == 0) {
                throw new JSONException(abstractC2898M6047.mo6124("input not end"));
            }
            abstractC2898M6047.close();
            return listMo6076;
        } catch (Throwable th) {
            try {
                abstractC2898M6047.close();
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
        C2801 c2801M6329 = AbstractC2932.m6329();
        Function functionM5586 = c2801M6329.m5586(cls, type);
        if (functionM5586 != null) {
            return (T) functionM5586.apply(t);
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
            return (T) c2801M6329.m5588(type, z).mo5462((Map) t, j);
        }
        if (t instanceof Collection) {
            return (T) c2801M6329.m5588(type, z).mo5424((Collection) t, j);
        }
        Class clsM5897 = AbstractC2866.m5897(type);
        if (clsM5897.isInstance(t)) {
            return t;
        }
        AbstractC2898 abstractC2898M6046 = AbstractC2898.m6046(InterfaceC2915.m6317(t));
        abstractC2898M6046.f9199.m6354(jSONReader$FeatureArr);
        return (T) c2801M6329.m5588(clsM5897, z).mo5418(abstractC2898M6046, null, null, 0L);
    }

    public <T> T getObject(int i, Function<JSONObject, T> function) {
        JSONObject jSONObject = getJSONObject(i);
        if (jSONObject == null) {
            return null;
        }
        return function.apply(jSONObject);
    }
}
