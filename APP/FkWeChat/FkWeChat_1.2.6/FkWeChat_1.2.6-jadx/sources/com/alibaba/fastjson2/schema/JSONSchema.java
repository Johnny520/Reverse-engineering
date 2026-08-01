package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.C1605j;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONSchemaValidException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONCreator;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderAdapter;
import com.alibaba.fastjson2.reader.ObjectReaderBean;
import com.alibaba.fastjson2.schema.UnresolvedReference;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@JSONType(serializer = JSONSchemaWriter.class)
public abstract class JSONSchema {
    final String customErrorMessage;
    final String description;
    final String title;
    static final Map<String, JSONSchema> CACHE = new ConcurrentHashMap();
    static final JSONReader.Context CONTEXT = JSONFactory.createReadContext();
    static final ValidateResult SUCCESS = new ValidateResult(true, "success", new Object[0]);
    static final ValidateResult FAIL_INPUT_NULL = new ValidateResult(false, "input null", new Object[0]);
    static final ValidateResult FAIL_INPUT_NOT_ENCODED = new ValidateResult(false, "input not encoded string", new Object[0]);
    static final ValidateResult FAIL_ANY_OF = new ValidateResult(false, "anyOf fail", new Object[0]);
    static final ValidateResult FAIL_ONE_OF = new ValidateResult(false, "oneOf fail", new Object[0]);
    static final ValidateResult FAIL_NOT = new ValidateResult(false, "not fail", new Object[0]);
    static final ValidateResult FAIL_TYPE_NOT_MATCH = new ValidateResult(false, "type not match", new Object[0]);
    static final ValidateResult FAIL_PROPERTY_NAME = new ValidateResult(false, "propertyName not match", new Object[0]);
    static final ValidateResult CONTAINS_NOT_MATCH = new ValidateResult(false, "contains not match", new Object[0]);
    static final ValidateResult UNIQUE_ITEMS_NOT_MATCH = new ValidateResult(false, "uniqueItems not match", new Object[0]);
    static final ValidateResult REQUIRED_NOT_MATCH = new ValidateResult(false, "required", new Object[0]);

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class JSONSchemaWriter implements ObjectWriter {
        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(JSONWriter jSONWriter, Object obj, Object obj2, java.lang.reflect.Type type, long j10) {
            jSONWriter.write(((JSONSchema) obj).toJSONObject());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum Type {
        Null,
        Boolean,
        Object,
        Array,
        Number,
        String,
        Integer,
        Enum,
        Const,
        OneOf,
        AllOf,
        AnyOf,
        Any,
        UnresolvedReference;

        /* JADX INFO: renamed from: of */
        public static Type m6423of(String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
            }
            return null;
        }
    }

    public JSONSchema(JSONObject jSONObject) {
        this.title = jSONObject.getString("title");
        this.description = jSONObject.getString("description");
        this.customErrorMessage = jSONObject.getString("error");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6416a(JSONArray jSONArray, FieldReader fieldReader) {
        if (fieldReader.fieldClass.isPrimitive()) {
            jSONArray.add(fieldReader.fieldName);
        }
    }

    public static AllOf allOf(JSONObject jSONObject, Class cls) {
        JSONSchema[] jSONSchemaArrMakeSchemaItems = makeSchemaItems(jSONObject.getJSONArray("allOf"), cls);
        if (jSONSchemaArrMakeSchemaItems == null) {
            return null;
        }
        return new AllOf(jSONSchemaArrMakeSchemaItems);
    }

    public static AnyOf anyOf(JSONArray jSONArray, Class cls) {
        JSONSchema[] jSONSchemaArrMakeSchemaItems = makeSchemaItems(jSONArray, cls);
        if (jSONSchemaArrMakeSchemaItems == null) {
            return null;
        }
        return new AnyOf(jSONSchemaArrMakeSchemaItems);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6417b(ObjectSchema objectSchema, JSONSchema jSONSchema, FieldReader fieldReader) {
        Map<String, JSONSchema> map = objectSchema.properties;
        String str = fieldReader.fieldName;
        java.lang.reflect.Type type = fieldReader.fieldType;
        JSONSchema jSONSchema2 = objectSchema;
        if (jSONSchema != null) {
            jSONSchema2 = jSONSchema;
        }
        map.put(str, m6422of(type, jSONSchema2));
    }

    public static JSONObject injectIfPresent(JSONObject jSONObject, AllOf allOf, AnyOf anyOf, OneOf oneOf) {
        if (allOf != null) {
            jSONObject.put("allOf", allOf);
        }
        if (anyOf != null) {
            jSONObject.put("anyOf", anyOf);
        }
        if (oneOf != null) {
            jSONObject.put("oneOf", oneOf);
        }
        return jSONObject;
    }

    public static JSONSchema[] makeSchemaItems(JSONArray jSONArray, Class cls) {
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        int size = jSONArray.size();
        JSONSchema[] jSONSchemaArr = new JSONSchema[size];
        for (int i10 = 0; i10 < size; i10++) {
            jSONSchemaArr[i10] = m6420of(jSONArray.getJSONObject(i10), cls);
        }
        return jSONSchemaArr;
    }

    @JSONCreator
    /* JADX INFO: renamed from: of */
    public static JSONSchema m6419of(JSONObject jSONObject, JSONSchema jSONSchema) {
        Map<String, JSONSchema> map;
        Map<String, JSONSchema> map2;
        Map<String, JSONSchema> map3;
        JSONSchema jSONSchemaPutIfAbsent;
        int i10 = 0;
        if (jSONObject.size() == 1 && jSONObject.isArray("type")) {
            JSONArray jSONArray = jSONObject.getJSONArray("type");
            JSONSchema[] jSONSchemaArr = new JSONSchema[jSONArray.size()];
            while (i10 < jSONArray.size()) {
                jSONSchemaArr[i10] = m6418of(JSONObject.m6194of("type", jSONArray.get(i10)));
                i10++;
            }
            return new AnyOf(jSONSchemaArr);
        }
        Type typeM6423of = Type.m6423of(jSONObject.getString("type"));
        if (typeM6423of != null) {
            switch (typeM6423of) {
                case Null:
                    return new NullSchema(jSONObject);
                case Boolean:
                    return new BooleanSchema(jSONObject);
                case Object:
                    return new ObjectSchema(jSONObject, jSONSchema);
                case Array:
                    return new ArraySchema(jSONObject, jSONSchema);
                case Number:
                    return new NumberSchema(jSONObject);
                case String:
                    return new StringSchema(jSONObject);
                case Integer:
                    return new IntegerSchema(jSONObject);
                default:
                    throw new JSONSchemaValidException("not support type : " + typeM6423of);
            }
        }
        Object[] objArr = (Object[]) jSONObject.getObject("enum", Object[].class, new JSONReader.Feature[0]);
        if (objArr != null) {
            int length = objArr.length;
            while (i10 < length) {
                if (!(objArr[i10] instanceof String)) {
                    return new EnumSchema(objArr);
                }
                i10++;
            }
            return new StringSchema(jSONObject);
        }
        Object obj = jSONObject.get("const");
        if (obj instanceof String) {
            return new StringSchema(jSONObject);
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return new IntegerSchema(jSONObject);
        }
        if (jSONObject.size() == 1) {
            String string = jSONObject.getString("$ref");
            if (string != null && !string.isEmpty()) {
                if ("http://json-schema.org/draft-04/schema#".equals(string)) {
                    Map<String, JSONSchema> map4 = CACHE;
                    JSONSchema jSONSchemaM6419of = map4.get(string);
                    return (jSONSchemaM6419of != null || (jSONSchemaPutIfAbsent = map4.putIfAbsent(string, (jSONSchemaM6419of = m6419of(JSON.parseObject(JSONSchema.class.getClassLoader().getResource("schema/draft-04.json")), (JSONSchema) null)))) == null) ? jSONSchemaM6419of : jSONSchemaPutIfAbsent;
                }
                if ("#".equals(string)) {
                    return jSONSchema;
                }
                if (jSONSchema instanceof ObjectSchema) {
                    ObjectSchema objectSchema = (ObjectSchema) jSONSchema;
                    map2 = objectSchema.definitions;
                    map3 = objectSchema.defs;
                    map = objectSchema.properties;
                } else if (jSONSchema instanceof ArraySchema) {
                    ArraySchema arraySchema = (ArraySchema) jSONSchema;
                    map2 = arraySchema.definitions;
                    map3 = arraySchema.defs;
                    map = null;
                } else {
                    map = null;
                    map2 = null;
                    map3 = null;
                }
                if (map2 != null && string.startsWith("#/definitions/")) {
                    return map2.get(string.substring(14));
                }
                if (map3 != null && string.startsWith("#/$defs/")) {
                    String strDecode = URLDecoder.decode(string.substring(8));
                    JSONSchema jSONSchema2 = map3.get(strDecode);
                    return jSONSchema2 == null ? new UnresolvedReference(strDecode) : jSONSchema2;
                }
                if (map != null && string.startsWith("#/properties/")) {
                    return map.get(string.substring(13));
                }
                if (string.startsWith("#/prefixItems/") && (jSONSchema instanceof ArraySchema)) {
                    return ((ArraySchema) jSONSchema).prefixItems[Integer.parseInt(string.substring(14))];
                }
            }
            Object obj2 = jSONObject.get("exclusiveMaximum");
            Object obj3 = jSONObject.get("exclusiveMinimum");
            if ((obj2 instanceof Integer) || (obj3 instanceof Integer) || (obj2 instanceof Long) || (obj3 instanceof Long)) {
                return new IntegerSchema(jSONObject);
            }
            if ((obj2 instanceof Number) || (obj3 instanceof Number)) {
                return new NumberSchema(jSONObject);
            }
        }
        if (jSONObject.containsKey("properties") || jSONObject.containsKey("dependentSchemas") || jSONObject.containsKey("if") || jSONObject.containsKey("required") || jSONObject.containsKey("patternProperties") || jSONObject.containsKey("additionalProperties") || jSONObject.containsKey("minProperties") || jSONObject.containsKey("maxProperties") || jSONObject.containsKey("propertyNames") || jSONObject.containsKey("$ref")) {
            return new ObjectSchema(jSONObject, jSONSchema);
        }
        if (jSONObject.containsKey("maxItems") || jSONObject.containsKey("minItems") || jSONObject.containsKey("additionalItems") || jSONObject.containsKey("items") || jSONObject.containsKey("prefixItems") || jSONObject.containsKey("uniqueItems") || jSONObject.containsKey("maxContains") || jSONObject.containsKey("minContains")) {
            return new ArraySchema(jSONObject, jSONSchema);
        }
        if (jSONObject.containsKey("pattern") || jSONObject.containsKey("format") || jSONObject.containsKey("minLength") || jSONObject.containsKey("maxLength")) {
            return new StringSchema(jSONObject);
        }
        boolean zContainsKey = jSONObject.containsKey("allOf");
        boolean zContainsKey2 = jSONObject.containsKey("anyOf");
        boolean zContainsKey3 = jSONObject.containsKey("oneOf");
        if (zContainsKey || zContainsKey2 || zContainsKey3) {
            int i11 = (zContainsKey ? 1 : 0) + (zContainsKey2 ? 1 : 0) + (zContainsKey3 ? 1 : 0);
            if (i11 == 1) {
                return zContainsKey ? new AllOf(jSONObject, jSONSchema) : zContainsKey2 ? new AnyOf(jSONObject, jSONSchema) : new OneOf(jSONObject, jSONSchema);
            }
            JSONSchema[] jSONSchemaArr2 = new JSONSchema[i11];
            if (zContainsKey) {
                jSONSchemaArr2[0] = new AllOf(jSONObject, jSONSchema);
                i10 = 1;
            }
            if (zContainsKey2) {
                jSONSchemaArr2[i10] = new AnyOf(jSONObject, jSONSchema);
                i10++;
            }
            if (zContainsKey3) {
                jSONSchemaArr2[i10] = new OneOf(jSONObject, jSONSchema);
            }
            return new AllOf(jSONSchemaArr2);
        }
        if (jSONObject.containsKey("not")) {
            return ofNot(jSONObject, null);
        }
        if ((jSONObject.get("maximum") instanceof Number) || (jSONObject.get("minimum") instanceof Number) || jSONObject.containsKey("multipleOf")) {
            return new NumberSchema(jSONObject);
        }
        if (jSONObject.isEmpty()) {
            return Any.INSTANCE;
        }
        if (jSONObject.size() == 1) {
            Object obj4 = jSONObject.get("type");
            if (obj4 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj4;
                JSONSchema[] jSONSchemaArr3 = new JSONSchema[jSONArray2.size()];
                while (i10 < jSONArray2.size()) {
                    Type typeM6423of2 = Type.m6423of(jSONArray2.getString(i10));
                    switch (typeM6423of2) {
                        case Null:
                            jSONSchemaArr3[i10] = new NullSchema(JSONObject.m6194of("type", (Object) "null"));
                            break;
                        case Boolean:
                            jSONSchemaArr3[i10] = new BooleanSchema(JSONObject.m6194of("type", (Object) "boolean"));
                            break;
                        case Object:
                            jSONSchemaArr3[i10] = new ObjectSchema(JSONObject.m6194of("type", (Object) "object"));
                            break;
                        case Array:
                            jSONSchemaArr3[i10] = new ArraySchema(JSONObject.m6194of("type", (Object) "array"), null);
                            break;
                        case Number:
                            jSONSchemaArr3[i10] = new NumberSchema(JSONObject.m6194of("type", (Object) "number"));
                            break;
                        case String:
                            jSONSchemaArr3[i10] = new StringSchema(JSONObject.m6194of("type", (Object) "string"));
                            break;
                        case Integer:
                            jSONSchemaArr3[i10] = new IntegerSchema(JSONObject.m6194of("type", (Object) "integer"));
                            break;
                        default:
                            throw new JSONSchemaValidException("not support type : " + typeM6423of2);
                    }
                    i10++;
                }
                return new AnyOf(jSONSchemaArr3);
            }
        }
        if (jSONObject.getString("type") == null) {
            throw new JSONSchemaValidException("type required");
        }
        throw new JSONSchemaValidException("not support type : " + jSONObject.getString("type"));
    }

    public static Not ofNot(JSONObject jSONObject, Class cls) {
        Object obj = jSONObject.get("not");
        if (obj instanceof Boolean) {
            return new Not(null, null, (Boolean) obj);
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return new Not(null, new Type[]{Type.Any}, null);
        }
        if (jSONObject2.size() == 1) {
            Object obj2 = jSONObject2.get("type");
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                Type[] typeArr = new Type[jSONArray.size()];
                for (int i10 = 0; i10 < jSONArray.size(); i10++) {
                    typeArr[i10] = (Type) jSONArray.getObject(i10, Type.class, new JSONReader.Feature[0]);
                }
                return new Not(null, typeArr, null);
            }
        }
        return new Not(m6420of(jSONObject2, cls), null, null);
    }

    public static JSONSchema ofValue(Object obj, JSONSchema jSONSchema) {
        Class<?> cls = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection.isEmpty()) {
                return new ArraySchema(JSONObject.m6194of("type", (Object) "array"), jSONSchema);
            }
            boolean z10 = true;
            Object obj2 = null;
            for (Object obj3 : collection) {
                if (obj3 != null) {
                    if (obj2 == null) {
                        obj2 = obj3;
                    }
                    if (cls == null) {
                        cls = obj3.getClass();
                    } else if (cls != obj3.getClass()) {
                        z10 = false;
                    }
                }
            }
            if (z10) {
                JSONSchema jSONSchemaOfValue = Map.class.isAssignableFrom(cls) ? ofValue(obj2, jSONSchema) : m6422of(cls, jSONSchema);
                ArraySchema arraySchema = new ArraySchema(JSONObject.m6194of("type", (Object) "array"), jSONSchema);
                arraySchema.itemSchema = jSONSchemaOfValue;
                return arraySchema;
            }
        }
        if (!(obj instanceof Map)) {
            return m6422of(obj.getClass(), jSONSchema);
        }
        ObjectSchema objectSchema = new ObjectSchema(JSONObject.m6194of("type", (Object) "object"), jSONSchema);
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                objectSchema.properties.put((String) key, value == null ? new StringSchema(JSONObject.m6192of()) : ofValue(value, jSONSchema == null ? objectSchema : jSONSchema));
            }
        }
        return objectSchema;
    }

    public static OneOf oneOf(JSONArray jSONArray, Class cls) {
        JSONSchema[] jSONSchemaArrMakeSchemaItems = makeSchemaItems(jSONArray, cls);
        if (jSONSchemaArrMakeSchemaItems == null) {
            return null;
        }
        return new OneOf(jSONSchemaArrMakeSchemaItems);
    }

    public static JSONSchema parseSchema(String str) {
        if ("true".equals(str)) {
            return Any.INSTANCE;
        }
        if ("false".equals(str)) {
            return Any.NOT_ANY;
        }
        JSONReader jSONReaderM6226of = JSONReader.m6226of(str);
        try {
            JSONSchema jSONSchemaM6418of = m6418of((JSONObject) jSONReaderM6226of.getObjectReader(Object.class).readObject(jSONReaderM6226of, null, null, 0L));
            jSONReaderM6226of.close();
            return jSONSchemaM6418of;
        } finally {
        }
    }

    public void accept(Predicate<JSONSchema> predicate) {
        predicate.test(this);
    }

    public void assertValidate(Object obj) {
        ValidateResult validateResultValidate = validate(obj);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return toJSONObject().equals(((JSONSchema) obj).toJSONObject());
    }

    public String getDescription() {
        return this.description;
    }

    public String getTitle() {
        return this.title;
    }

    public abstract Type getType();

    public int hashCode() {
        return toJSONObject().hashCode();
    }

    public boolean isValid(float f10) {
        return validate(f10).isSuccess();
    }

    public JSONObject toJSONObject() {
        return new JSONObject();
    }

    public String toString() {
        return toJSONObject().toString();
    }

    public final ValidateResult validate(Object obj) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(obj);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public ValidateResult validateInternal(long j10) {
        return validateInternal((Object) Long.valueOf(j10));
    }

    public abstract ValidateResult validateInternal(Object obj);

    public ValidateResult validateInternal(double d10) {
        return validateInternal((Object) Double.valueOf(d10));
    }

    public boolean isValid(long j10) {
        return validate(j10).isSuccess();
    }

    public ValidateResult validateInternal(Double d10) {
        return validateInternal((Object) d10);
    }

    public ValidateResult validateInternal(Integer num) {
        return validateInternal((Object) num);
    }

    public boolean isValid(double d10) {
        return validate(d10).isSuccess();
    }

    public ValidateResult validateInternal(Long l10) {
        return validateInternal((Object) l10);
    }

    public ValidateResult validateInternal(Float f10) {
        return validateInternal((Object) f10);
    }

    public static AnyOf anyOf(JSONObject jSONObject, Class cls) {
        return anyOf(jSONObject.getJSONArray("anyOf"), cls);
    }

    public static OneOf oneOf(JSONObject jSONObject, Class cls) {
        return oneOf(jSONObject.getJSONArray("oneOf"), cls);
    }

    public boolean isValid(Double d10) {
        return validate(d10).isSuccess();
    }

    public boolean isValid(Object obj) {
        return validate(obj).isSuccess();
    }

    public boolean isValid(Float f10) {
        return validate(f10).isSuccess();
    }

    public boolean isValid(Integer num) {
        return validate(num).isSuccess();
    }

    public void addResolveTask(UnresolvedReference.ResolveTask resolveTask) {
    }

    public void assertValidate(Integer num) {
        ValidateResult validateResultValidate = validate(num);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public boolean isValid(Long l10) {
        return validate(l10).isSuccess();
    }

    public final ValidateResult validate(long j10) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(j10);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public void assertValidate(Long l10) {
        ValidateResult validateResultValidate = validate(l10);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public final ValidateResult validate(double d10) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(d10);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public void assertValidate(Double d10) {
        ValidateResult validateResultValidate = validate(d10);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public JSONSchema(String str, String str2) {
        this.title = str;
        this.description = str2;
        this.customErrorMessage = null;
    }

    public final ValidateResult validate(Double d10) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(d10);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public void assertValidate(Float f10) {
        ValidateResult validateResultValidate = validate(f10);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public final ValidateResult validate(Integer num) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(num);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public void assertValidate(long j10) {
        ValidateResult validateResultValidate = validate(j10);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public final ValidateResult validate(Long l10) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(l10);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public void assertValidate(double d10) {
        ValidateResult validateResultValidate = validate(d10);
        if (!validateResultValidate.isSuccess()) {
            throw new JSONSchemaValidException(validateResultValidate.getMessage());
        }
    }

    public final ValidateResult validate(Float f10) {
        String str;
        ValidateResult validateResultValidateInternal = validateInternal(f10);
        return (validateResultValidateInternal.isSuccess() || (str = this.customErrorMessage) == null) ? validateResultValidateInternal : new ValidateResult(false, str, new Object[0]);
    }

    public static JSONSchema ofValue(Object obj) {
        return ofValue(obj, null);
    }

    @JSONCreator
    /* JADX INFO: renamed from: of */
    public static JSONSchema m6418of(JSONObject jSONObject) {
        return m6419of(jSONObject, (JSONSchema) null);
    }

    /* JADX INFO: renamed from: of */
    public static JSONSchema m6421of(java.lang.reflect.Type type) {
        return m6422of(type, (JSONSchema) null);
    }

    /* JADX INFO: renamed from: of */
    public static JSONSchema m6422of(java.lang.reflect.Type type, final JSONSchema jSONSchema) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            java.lang.reflect.Type rawType = parameterizedType.getRawType();
            java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            boolean z10 = rawType instanceof Class;
            if (z10 && Collection.class.isAssignableFrom((Class) rawType)) {
                ArraySchema arraySchema = new ArraySchema(JSONObject.m6194of("type", (Object) "array"), jSONSchema);
                if (actualTypeArguments.length == 1) {
                    java.lang.reflect.Type type2 = actualTypeArguments[0];
                    if (jSONSchema == null) {
                        jSONSchema = arraySchema;
                    }
                    arraySchema.itemSchema = m6422of(type2, jSONSchema);
                }
                return arraySchema;
            }
            if (z10 && Map.class.isAssignableFrom((Class) rawType)) {
                return new ObjectSchema(JSONObject.m6194of("type", (Object) "object"), jSONSchema);
            }
        }
        if (type instanceof GenericArrayType) {
            java.lang.reflect.Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            ArraySchema arraySchema2 = new ArraySchema(JSONObject.m6194of("type", (Object) "array"), jSONSchema);
            if (jSONSchema == null) {
                jSONSchema = arraySchema2;
            }
            arraySchema2.itemSchema = m6422of(genericComponentType, jSONSchema);
            return arraySchema2;
        }
        if (type != Byte.TYPE && type != Short.TYPE && type != Integer.TYPE && type != Long.TYPE && type != Byte.class && type != Short.class && type != Integer.class && type != Long.class && type != BigInteger.class && type != AtomicInteger.class && type != AtomicLong.class) {
            if (type != Float.TYPE && type != Double.TYPE && type != Float.class && type != Double.class && type != BigDecimal.class) {
                if (type != Boolean.TYPE && type != Boolean.class && type != AtomicBoolean.class) {
                    if (type == String.class) {
                        return new StringSchema(JSONObject.m6194of("type", (Object) "string"));
                    }
                    if (type instanceof Class) {
                        Class cls = (Class) type;
                        if (Enum.class.isAssignableFrom(cls)) {
                            Object[] enumConstants = cls.getEnumConstants();
                            String[] strArr = new String[enumConstants.length];
                            for (int i10 = 0; i10 < enumConstants.length; i10++) {
                                strArr[i10] = ((Enum) enumConstants[i10]).name();
                            }
                            return new StringSchema(JSONObject.m6195of("type", (Object) "string", "enum", (Object) strArr));
                        }
                        if (cls.isArray()) {
                            Class<?> componentType = cls.getComponentType();
                            ArraySchema arraySchema3 = new ArraySchema(JSONObject.m6194of("type", (Object) "array"), jSONSchema);
                            if (jSONSchema == null) {
                                jSONSchema = arraySchema3;
                            }
                            arraySchema3.itemSchema = m6422of(componentType, jSONSchema);
                            return arraySchema3;
                        }
                        if (Map.class.isAssignableFrom(cls)) {
                            return new ObjectSchema(JSONObject.m6194of("type", (Object) "object"), jSONSchema);
                        }
                        if (Collection.class.isAssignableFrom(cls)) {
                            return new ArraySchema(JSONObject.m6194of("type", (Object) "array"), jSONSchema);
                        }
                    }
                    ObjectReader objectReader = JSONFactory.getDefaultObjectReaderProvider().getObjectReader(type);
                    if (objectReader instanceof ObjectReaderBean) {
                        ObjectReaderAdapter objectReaderAdapter = (ObjectReaderAdapter) objectReader;
                        final JSONArray jSONArray = new JSONArray();
                        objectReaderAdapter.apply(new Consumer() { // from class: com.alibaba.fastjson2.schema.e
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                JSONSchema.m6416a(jSONArray, (FieldReader) obj);
                            }
                        });
                        final ObjectSchema objectSchema = new ObjectSchema(JSONObject.m6195of("type", (Object) "object", "required", (Object) jSONArray));
                        objectReaderAdapter.apply(new Consumer() { // from class: com.alibaba.fastjson2.schema.f
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                JSONSchema.m6417b(objectSchema, jSONSchema, (FieldReader) obj);
                            }
                        });
                        return objectSchema;
                    }
                    C1605j.m6294a("TODO : ", type);
                    return null;
                }
                return new BooleanSchema(JSONObject.m6194of("type", (Object) "boolean"));
            }
            return new NumberSchema(JSONObject.m6194of("type", (Object) "number"));
        }
        return new IntegerSchema(JSONObject.m6194of("type", (Object) "integer"));
    }

    /* JADX INFO: renamed from: of */
    public static JSONSchema m6420of(JSONObject jSONObject, Class cls) {
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        if (cls != null && cls != Object.class) {
            if (cls != Byte.TYPE && cls != Short.TYPE && cls != Integer.TYPE && cls != Long.TYPE && cls != Byte.class && cls != Short.class && cls != Integer.class && cls != Long.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (cls != BigDecimal.class && cls != Float.TYPE && cls != Double.TYPE && cls != Float.class && cls != Double.class && cls != Number.class) {
                    if (cls != Boolean.TYPE && cls != Boolean.class) {
                        if (cls == String.class) {
                            return new StringSchema(jSONObject);
                        }
                        if (Collection.class.isAssignableFrom(cls)) {
                            return new ArraySchema(jSONObject, null);
                        }
                        if (cls.isArray()) {
                            return new ArraySchema(jSONObject, null);
                        }
                        return new ObjectSchema(jSONObject, null);
                    }
                    return new BooleanSchema(jSONObject);
                }
                if (!jSONObject.containsKey("AnyOf") && !jSONObject.containsKey("anyOf")) {
                    if (jSONObject.containsKey("oneOf")) {
                        return oneOf(jSONObject, cls);
                    }
                    if (jSONObject.containsKey("not")) {
                        return ofNot(jSONObject, cls);
                    }
                    return new NumberSchema(jSONObject);
                }
                return anyOf(jSONObject, cls);
            }
            if (!jSONObject.containsKey("AnyOf") && !jSONObject.containsKey("anyOf")) {
                if (jSONObject.containsKey("oneOf")) {
                    return oneOf(jSONObject, cls);
                }
                if (jSONObject.containsKey("not")) {
                    return ofNot(jSONObject, cls);
                }
                return new IntegerSchema(jSONObject);
            }
            return anyOf(jSONObject, cls);
        }
        return m6418of(jSONObject);
    }
}
