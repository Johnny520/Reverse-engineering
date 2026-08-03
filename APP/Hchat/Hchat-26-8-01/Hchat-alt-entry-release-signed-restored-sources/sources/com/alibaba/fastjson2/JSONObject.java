package com.alibaba.fastjson2;

import ae.C0074e;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderImplEnum;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
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
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JSONObject extends LinkedHashMap<String, Object> implements InvocationHandler {
    static ObjectReader<JSONArray> arrayReader = null;
    private static final long serialVersionUID = 1;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class NameConsumer implements Consumer<Method> {
        final Annotation annotation;
        String name;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public NameConsumer(Annotation annotation) {
            this.annotation = annotation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONObject() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONObject from(Object obj) {
        return (JSONObject) JSON.toJSON(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String getJSONFieldName(Method method) {
        String strName = null;
        for (Annotation annotation : method.getAnnotations()) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$of$0(int i9) {
        return i9 % 2 == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$1(Object[] objArr, int i9) {
        return objArr[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$of$2(Object obj) {
        if (obj == null || !(obj instanceof String)) {
            C0086a.m464w("The value corresponding to the even bit index of kvArray is key, which cannot be null and must be of type string");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$of$3(int i9) {
        return i9 % 2 != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$4(Object[] objArr, int i9) {
        return objArr[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    private static JSONObject m1646of(JSONObject jSONObject, final Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            C0086a.m464w("The kvArray cannot be empty");
            return null;
        }
        int length = objArr.length;
        if ((length & 1) == 1) {
            C0086a.m464w("The length of kvArray cannot be odd");
            return null;
        }
        final int i9 = 0;
        List list = (List) IntStream.range(0, length).filter(new IntPredicate() { // from class: com.alibaba.fastjson2.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.IntPredicate
            public final boolean test(int i10) {
                switch (i9) {
                    case 0:
                        return JSONObject.lambda$of$0(i10);
                    default:
                        return JSONObject.lambda$of$3(i10);
                }
            }
        }).mapToObj(new IntFunction() { // from class: com.alibaba.fastjson2.b
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                switch (i9) {
                    case 0:
                        return JSONObject.lambda$of$1(objArr, i10);
                    default:
                        return JSONObject.lambda$of$4(objArr, i10);
                }
            }
        }).collect(Collectors.toList());
        list.forEach(new C0074e(17));
        if (list.size() != ((List) list.stream().distinct().collect(Collectors.toList())).size()) {
            C0086a.m464w("The value corresponding to the even bit index of kvArray is key and cannot be duplicated");
            return null;
        }
        final int i10 = 1;
        List list2 = (List) IntStream.range(0, length).filter(new IntPredicate() { // from class: com.alibaba.fastjson2.a
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.IntPredicate
            public final boolean test(int i102) {
                switch (i10) {
                    case 0:
                        return JSONObject.lambda$of$0(i102);
                    default:
                        return JSONObject.lambda$of$3(i102);
                }
            }
        }).mapToObj(new IntFunction() { // from class: com.alibaba.fastjson2.b
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.IntFunction
            public final Object apply(int i102) {
                switch (i10) {
                    case 0:
                        return JSONObject.lambda$of$1(objArr, i102);
                    default:
                        return JSONObject.lambda$of$4(objArr, i102);
                }
            }
        }).collect(Collectors.toList());
        for (int i11 = 0; i11 < list.size(); i11++) {
            jSONObject.put(list.get(i11).toString(), list2.get(i11));
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONObject parse(String str, JSONReader.Feature... featureArr) {
        return JSON.parseObject(str, featureArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static <T> T parseObject(String str, Class<T> cls) {
        return (T) JSON.parseObject(str, (Class) cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // java.util.HashMap, java.util.AbstractMap
    public JSONObject clone() {
        return new JSONObject(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) ? super.containsKey(obj) || super.containsKey((Object) obj.toString()) : super.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void copyTo(Object obj, JSONReader.Feature... featureArr) {
        long jM1683of = JSONFactory.defaultReaderFeatures | JSONReader.Feature.m1683of(featureArr);
        boolean zIsEnabled = JSONReader.Feature.FieldBased.isEnabled(jM1683of);
        JSONFactory.getDefaultObjectReaderProvider().getObjectReader(obj.getClass(), zIsEnabled).accept(obj, this, jM1683of);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object eval(JSONPath jSONPath) {
        return jSONPath.eval(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONObject fluentPut(String str, Object obj) {
        put(str, obj);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void forEachArrayObject(String str, Consumer<JSONObject> consumer) {
        JSONArray jSONArray = getJSONArray(str);
        if (jSONArray == null) {
            return;
        }
        for (int i9 = 0; i9 < jSONArray.size(); i9++) {
            consumer.accept(jSONArray.getJSONObject(i9));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void forEchArrayObject(String str, Consumer<JSONObject> consumer) {
        forEachArrayObject(str, consumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object obj2;
        return (((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) && (obj2 = super.get((Object) obj.toString())) != null) ? obj2 : super.get(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        C0086a.m464w(AbstractC0255e.m1019h(obj, "' to BigDecimal", new StringBuilder("Can not cast '")));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to BigInteger", new StringBuilder("Can not cast '")));
            return null;
        }
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return null;
        }
        return new BigInteger(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to Boolean", new StringBuilder("Can not cast '")));
            return null;
        }
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return null;
        }
        return Boolean.valueOf("true".equalsIgnoreCase(str2) || "1".equals(str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getBooleanValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() == 1;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            return "true".equalsIgnoreCase(str2) || "1".equals(str2);
        }
        C0086a.m464w(AbstractC0255e.m1019h(obj, "' to boolean value", new StringBuilder("Can not cast '")));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getByPath(String str) {
        return JSONPath.m1657of(str).eval(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Byte getByte(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to Byte", new StringBuilder("Can not cast '")));
            return null;
        }
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte getByteValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        if (!(obj instanceof String)) {
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to byte value", new StringBuilder("Can not cast '")));
            return (byte) 0;
        }
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return (byte) 0;
        }
        return Byte.parseByte(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] getBytes(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return IOUtils.decodeBase64((String) obj);
        }
        C0086a.m463v(obj, "can not cast to byte[], value : ");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Date getDate(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (!(obj instanceof String)) {
            return obj instanceof Number ? new Date(((Number) obj).longValue()) : TypeUtils.toDate(obj);
        }
        long millis = DateUtils.parseMillis((String) obj, DateUtils.DEFAULT_ZONE_ID);
        if (millis == 0) {
            return null;
        }
        return new Date(millis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to double", new StringBuilder("Can not cast '")));
            return null;
        }
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public double getDoubleValue(String str) {
        Double d10 = getDouble(str);
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to float", new StringBuilder("Can not cast '")));
            return null;
        }
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getFloatValue(String str) {
        Float f3 = getFloat(str);
        if (f3 == null) {
            return 0.0f;
        }
        return f3.floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getIntValue(String str) {
        Object obj = super.get((Object) str);
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
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return 0;
        }
        return str2.indexOf(46) != -1 ? (int) Double.parseDouble(str2) : Integer.parseInt(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to Integer", new StringBuilder("Can not cast '")));
            return null;
        }
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return null;
        }
        return str2.indexOf(46) != -1 ? Integer.valueOf((int) Double.parseDouble(str2)) : Integer.valueOf(Integer.parseInt(str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray getJSONArray(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        if (obj instanceof JSONObject) {
            return JSONArray.m1633of(obj);
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            if (str2.charAt(0) != '[') {
                return JSONArray.m1633of((Object) str2);
            }
            JSONReader jSONReaderM1666of = JSONReader.m1666of(str2);
            if (arrayReader == null) {
                arrayReader = jSONReaderM1666of.getObjectReader(JSONArray.class);
            }
            return arrayReader.readObject(jSONReaderM1666of, null, null, 0L);
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray((Collection<?>) obj);
            put(str, jSONArray);
            return jSONArray;
        }
        if (obj instanceof Object[]) {
            JSONArray jSONArrayM1636of = JSONArray.m1636of((Object[]) obj);
            put(str, jSONArrayM1636of);
            return jSONArrayM1636of;
        }
        if (!obj.getClass().isArray()) {
            return null;
        }
        int length = Array.getLength(obj);
        JSONArray jSONArray2 = new JSONArray(length);
        for (int i9 = 0; i9 < length; i9++) {
            jSONArray2.add(Array.get(obj, i9));
        }
        put(str, jSONArray2);
        return jSONArray2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            return JSONFactory.OBJECT_READER.readObject(JSONReader.m1666of(str2), null, null, 0L);
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject((Map) obj);
            put(str, jSONObject);
            return jSONObject;
        }
        ObjectWriter objectWriter = JSONFactory.defaultObjectWriterProvider.getObjectWriter((Class) obj.getClass());
        if (!(objectWriter instanceof ObjectWriterAdapter)) {
            return null;
        }
        JSONObject jSONObject2 = ((ObjectWriterAdapter) objectWriter).toJSONObject(obj);
        put(str, jSONObject2);
        return jSONObject2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T> List<T> getList(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        JSONArray jSONArray = getJSONArray(str);
        if (jSONArray == null) {
            return null;
        }
        return jSONArray.toList(cls, featureArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LocalDate getLocalDate(String str, LocalDate localDate) {
        Object obj = super.get((Object) str);
        return obj == null ? localDate : obj instanceof LocalDate ? (LocalDate) obj : (LocalDate) TypeUtils.cast(obj, LocalDate.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LocalDateTime getLocalDateTime(String str, LocalDateTime localDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? localDateTime : obj instanceof LocalDateTime ? (LocalDateTime) obj : (LocalDateTime) TypeUtils.cast(obj, LocalDateTime.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LocalTime getLocalTime(String str, LocalTime localTime) {
        Object obj = super.get((Object) str);
        return obj == null ? localTime : obj instanceof LocalTime ? (LocalTime) obj : (LocalTime) TypeUtils.cast(obj, LocalTime.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            String str2 = (String) obj;
            if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
                return null;
            }
            return str2.indexOf(46) != -1 ? Long.valueOf((long) Double.parseDouble(str2)) : Long.valueOf(Long.parseLong(str2));
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
    public long getLongValue(String str) {
        Object obj = super.get((Object) str);
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
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return 0L;
        }
        return str2.indexOf(46) != -1 ? (long) Double.parseDouble(str2) : Long.parseLong(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: T */
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
    public <T> T getObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        T t9 = (T) super.get((Object) str);
        ObjectReader objectReader = null;
        if (t9 == 0) {
            return null;
        }
        if (cls != Object.class || featureArr.length != 0) {
            int length = featureArr.length;
            boolean z9 = false;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (featureArr[i9] == JSONReader.Feature.FieldBased) {
                    z9 = true;
                    break;
                }
                i9++;
            }
            Class<?> cls2 = t9.getClass();
            ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
            Function typeConvert = objectReaderProvider.getTypeConvert(cls2, cls);
            if (typeConvert != null) {
                return (T) typeConvert.apply(t9);
            }
            if (t9 instanceof Map) {
                return (T) objectReaderProvider.getObjectReader(cls, z9).createInstance((Map) t9, featureArr);
            }
            if (t9 instanceof Collection) {
                return (T) objectReaderProvider.getObjectReader(cls, z9).createInstance((Collection) t9, featureArr);
            }
            Class<?> mapping = TypeUtils.getMapping(cls);
            if (!mapping.isInstance(t9)) {
                if (t9 instanceof String) {
                    String str2 = (String) t9;
                    if (str2.isEmpty() || "null".equals(str2)) {
                        return null;
                    }
                    if (mapping.isEnum()) {
                        objectReader = objectReaderProvider.getObjectReader(mapping, z9);
                        if (objectReader instanceof ObjectReaderImplEnum) {
                            return (T) ((ObjectReaderImplEnum) objectReader).getEnumByHashCode(Fnv.hashCode64(str2));
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
        }
        return t9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OffsetDateTime getOffsetDateTime(String str, OffsetDateTime offsetDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? offsetDateTime : obj instanceof OffsetDateTime ? (OffsetDateTime) obj : (OffsetDateTime) TypeUtils.cast(obj, OffsetDateTime.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OffsetTime getOffsetTime(String str, OffsetTime offsetTime) {
        Object obj = super.get((Object) str);
        return obj == null ? offsetTime : obj instanceof OffsetTime ? (OffsetTime) obj : (OffsetTime) TypeUtils.cast(obj, OffsetTime.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public Object getOrDefault(Object obj, Object obj2) {
        if ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) {
            return getOrDefault(obj.toString(), obj2);
        }
        Object obj3 = super.get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to Short", new StringBuilder("Can not cast '")));
            return null;
        }
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public short getShortValue(String str) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        if (!(obj instanceof String)) {
            C0086a.m464w(AbstractC0255e.m1019h(obj, "' to short value", new StringBuilder("Can not cast '")));
            return (short) 0;
        }
        String str2 = (String) obj;
        if (str2.isEmpty() || "null".equalsIgnoreCase(str2)) {
            return (short) 0;
        }
        return Short.parseShort(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getString(String str, String str2) {
        Object obj = super.get((Object) str);
        return obj == null ? str2 : obj instanceof String ? (String) obj : obj instanceof Date ? DateUtils.toString(((Date) obj).getTime(), false, DateUtils.DEFAULT_ZONE_ID) : ((obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Number) || (obj instanceof UUID) || (obj instanceof Enum)) ? obj.toString() : JSON.toJSONString(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ZonedDateTime getZonedDateTime(String str, ZonedDateTime zonedDateTime) {
        Object obj = super.get((Object) str);
        return obj == null ? zonedDateTime : obj instanceof ZonedDateTime ? (ZonedDateTime) obj : (ZonedDateTime) TypeUtils.cast(obj, ZonedDateTime.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        Function typeConvert;
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
                C0086a.m464w(AbstractC0921a.m2251n("This method '", name, "' is not a setter"));
                return null;
            }
            String jSONFieldName = getJSONFieldName(method);
            if (jSONFieldName == null) {
                if (!name.startsWith("set", 0)) {
                    C0086a.m464w(AbstractC0921a.m2251n("This method '", name, "' is not a setter"));
                    return null;
                }
                String strSubstring = name.substring(3);
                if (strSubstring.length() == 0) {
                    C0086a.m464w(AbstractC0921a.m2251n("This method '", name, "' is an illegal setter"));
                    return null;
                }
                jSONFieldName = Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1);
            }
            put(jSONFieldName, objArr[0]);
            if (returnType != cls) {
                return obj;
            }
            return null;
        }
        if (parameterCount != 0) {
            C2104o.m5297w(method.toGenericString());
            return null;
        }
        if (returnType == cls) {
            C0086a.m464w(AbstractC0921a.m2251n("This method '", name, "' is not a getter"));
            return null;
        }
        String jSONFieldName2 = getJSONFieldName(method);
        if (jSONFieldName2 == null) {
            if (name.startsWith("get", 0)) {
                zStartsWith = false;
            } else {
                zStartsWith = name.startsWith("with", 0);
                if (!zStartsWith) {
                    if (!name.startsWith("is", 0)) {
                        if ("hashCode".equals(name)) {
                            return Integer.valueOf(hashCode());
                        }
                        if ("toString".equals(name)) {
                            return toString();
                        }
                        if (name.startsWith("entrySet", 0)) {
                            return entrySet();
                        }
                        if ("size".equals(name)) {
                            return Integer.valueOf(size());
                        }
                        C0086a.m464w(AbstractC0921a.m2251n("This method '", name, "' is not a getter"));
                        return null;
                    }
                    if ("isEmpty".equals(name)) {
                        obj2 = get("empty");
                        if (obj2 == null) {
                            return Boolean.valueOf(isEmpty());
                        }
                    } else {
                        String strSubstring2 = name.substring(2);
                        if (strSubstring2.isEmpty()) {
                            C0086a.m464w(AbstractC0921a.m2251n("This method '", name, "' is an illegal getter"));
                            return null;
                        }
                        obj2 = get(Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1));
                        if (obj2 == null) {
                            return Boolean.FALSE;
                        }
                    }
                }
            }
            int length = name.length();
            int i9 = zStartsWith ? 4 : 3;
            if (length > i9) {
                char[] cArr = new char[name.length() - i9];
                name.getChars(i9, name.length(), cArr, 0);
                char c10 = cArr[0];
                if (c10 >= 'A' && c10 <= 'Z') {
                    cArr[0] = (char) (c10 + ' ');
                }
                String str = new String(cArr);
                if (str.isEmpty()) {
                    C0086a.m464w(AbstractC0921a.m2251n("This method '", name, "' is an illegal getter"));
                    return null;
                }
                obj2 = get(str);
                if (obj2 == null) {
                    return null;
                }
            }
        } else {
            obj2 = get(jSONFieldName2);
            if (obj2 == null) {
                return null;
            }
        }
        return (returnType.isInstance(obj2) || (typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj2.getClass(), method.getGenericReturnType())) == null) ? obj2 : typeConvert.apply(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONArray putArray(String str) {
        JSONArray jSONArray = new JSONArray();
        put(str, jSONArray);
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONObject putObject(String str) {
        JSONObject jSONObject = new JSONObject();
        put(str, jSONObject);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: to */
    public <T> T m1655to(Type type, JSONReader.Feature... featureArr) {
        long j3 = 0;
        boolean z9 = false;
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.FieldBased) {
                z9 = true;
            }
            j3 |= feature.mask;
        }
        return type == String.class ? (T) toString() : (T) JSONFactory.defaultObjectReaderProvider.getObjectReader(type, z9).createInstance(this, j3);
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
    public <T> T toJavaObject(Class<T> cls, JSONReader.Feature... featureArr) {
        long j3 = 0;
        boolean z9 = false;
        for (JSONReader.Feature feature : featureArr) {
            if (feature == JSONReader.Feature.FieldBased) {
                z9 = true;
            }
            j3 |= feature.mask;
        }
        return cls == String.class ? (T) toString() : (T) JSONFactory.defaultObjectReaderProvider.getObjectReader(cls, z9).createInstance(this, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractMap
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

    public JSONObject(int i9) {
        super(i9);
    }

    public JSONObject(int i9, float f3) {
        super(i9, f3);
    }

    public static <T> T parseObject(String str, Class<T> cls, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(str, (Class) cls, featureArr);
    }

    public static String toJSONString(Object obj, JSONWriter.Feature... featureArr) {
        return JSON.toJSONString(obj, featureArr);
    }

    public JSONObject(int i9, float f3, boolean z9) {
        super(i9, f3, z9);
    }

    public static <T> T parseObject(String str, Type type, JSONReader.Feature... featureArr) {
        return (T) JSON.parseObject(str, type, featureArr);
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
        JSONWriter jSONWriterM1687of = JSONWriter.m1687of(featureArr);
        try {
            jSONWriterM1687of.setRootObject(this);
            jSONWriterM1687of.write(this);
            String string = jSONWriterM1687of.toString();
            jSONWriterM1687of.close();
            return string;
        } catch (Throwable th2) {
            if (jSONWriterM1687of != null) {
                try {
                    jSONWriterM1687of.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public Object get(String str) {
        return super.get((Object) str);
    }

    public Object getOrDefault(String str, Object obj) {
        Object obj2 = super.get((Object) str);
        return obj2 == null ? obj : obj2;
    }

    /* JADX INFO: renamed from: to */
    public <T> T m1656to(Function<JSONObject, T> function) {
        return function.apply(this);
    }

    public <T> T toJavaObject(Type type, JSONReader.Feature... featureArr) {
        return (T) m1655to(type, featureArr);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m1653to(TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        return (T) m1655to(typeReference.getType(), featureArr);
    }

    public <T> T toJavaObject(TypeReference<T> typeReference, JSONReader.Feature... featureArr) {
        return (T) m1653to(typeReference, featureArr);
    }

    /* JADX INFO: renamed from: to */
    public <T> T m1654to(Class<T> cls, JSONReader.Feature... featureArr) {
        long jM1683of = JSONFactory.defaultReaderFeatures | JSONReader.Feature.m1683of(featureArr);
        boolean zIsEnabled = JSONReader.Feature.FieldBased.isEnabled(jM1683of);
        if (cls == String.class) {
            return (T) toString();
        }
        return (T) JSONFactory.defaultObjectReaderProvider.getObjectReader(cls, zIsEnabled).createInstance(this, jM1683of);
    }

    public boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public Date getDate(String str, Date date) {
        Date date2 = getDate(str);
        return date2 == null ? date : date2;
    }

    public String getString(String str) {
        return getString(str, null);
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

    public void valueFilter(ValueFilter valueFilter) {
        valueFilter(this, valueFilter);
    }

    public boolean getBooleanValue(String str, boolean z9) {
        Object obj = super.get((Object) str);
        if (obj == null) {
            return z9;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue() == 1;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            return "true".equalsIgnoreCase(str2) || "1".equals(str2);
        }
        C0086a.m464w(AbstractC0255e.m1019h(obj, "' to boolean value", new StringBuilder("Can not cast '")));
        return false;
    }

    public int getIntValue(String str, int i9) {
        Object obj = super.get((Object) str);
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str2.isEmpty() && !"null".equalsIgnoreCase(str2)) {
                    if (str2.indexOf(46) != -1) {
                        return (int) Double.parseDouble(str2);
                    }
                    return Integer.parseInt(str2);
                }
            } else {
                C0086a.m464w(AbstractC0255e.m1019h(obj, "' to int value", new StringBuilder("Can not cast '")));
                return 0;
            }
        }
        return i9;
    }

    public long getLongValue(String str, long j3) {
        Object obj = super.get((Object) str);
        if (obj != null) {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str2.isEmpty() && !"null".equalsIgnoreCase(str2)) {
                    if (str2.indexOf(46) != -1) {
                        return (long) Double.parseDouble(str2);
                    }
                    return Long.parseLong(str2);
                }
            } else {
                C0086a.m464w(AbstractC0255e.m1019h(obj, "' to long value", new StringBuilder("Can not cast '")));
                return 0L;
            }
        }
        return j3;
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

    public void nameFilter(NameFilter nameFilter) {
        nameFilter(this, nameFilter);
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m1647of(String str, Object obj) {
        JSONObject jSONObject = new JSONObject(1);
        jSONObject.put(str, obj);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m1648of(String str, Object obj, String str2, Object obj2) {
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m1649of(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        JSONObject jSONObject = new JSONObject(3);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m1650of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        JSONObject jSONObject = new JSONObject(4);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m1651of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        return jSONObject;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m1652of(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4, String str5, Object obj5, Object... objArr) {
        JSONObject jSONObject = new JSONObject(5);
        jSONObject.put(str, obj);
        jSONObject.put(str2, obj2);
        jSONObject.put(str3, obj3);
        jSONObject.put(str4, obj4);
        jSONObject.put(str5, obj5);
        if (objArr != null && objArr.length > 0) {
            m1646of(jSONObject, objArr);
        }
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getObject(String str, Type type, JSONReader.Feature... featureArr) {
        T t9 = (T) super.get((Object) str);
        if (t9 == 0) {
            return null;
        }
        if (type != Object.class || featureArr.length != 0) {
            int length = featureArr.length;
            boolean z9 = false;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (featureArr[i9] == JSONReader.Feature.FieldBased) {
                    z9 = true;
                    break;
                }
                i9++;
            }
            Class<?> cls = t9.getClass();
            ObjectReaderProvider objectReaderProvider = JSONFactory.defaultObjectReaderProvider;
            Function typeConvert = objectReaderProvider.getTypeConvert(cls, type);
            if (typeConvert != null) {
                return (T) typeConvert.apply(t9);
            }
            if (t9 instanceof Map) {
                return (T) objectReaderProvider.getObjectReader(type, z9).createInstance((Map) t9, featureArr);
            }
            if (t9 instanceof Collection) {
                return (T) objectReaderProvider.getObjectReader(type, z9).createInstance((Collection) t9, featureArr);
            }
            if (!(type instanceof Class) || !((Class) type).isInstance(t9)) {
                if (t9 instanceof String) {
                    String str2 = (String) t9;
                    if (str2.isEmpty() || "null".equals(str2)) {
                        return null;
                    }
                }
                JSONReader jSONReaderM1666of = JSONReader.m1666of(JSON.toJSONString(t9));
                jSONReaderM1666of.context.config(featureArr);
                return (T) objectReaderProvider.getObjectReader(type, z9).readObject(jSONReaderM1666of, null, null, 0L);
            }
        }
        return t9;
    }

    /* JADX INFO: renamed from: of */
    public static JSONObject m1645of() {
        return new JSONObject();
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
