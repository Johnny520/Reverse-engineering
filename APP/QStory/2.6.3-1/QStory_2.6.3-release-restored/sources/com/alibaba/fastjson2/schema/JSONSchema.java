package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C1589;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.JSONSchemaValidException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p295.InterfaceC9195;
import p305.AbstractC9243;
import p305.C9242;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC9195(serializer = AbstractC9243.class)
public abstract class JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9040;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9041;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f9030 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3776 f9029 = AbstractC3766.m6949();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1589 f9028 = new C1589("success", new Object[0], true);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1589 f9027 = new C1589("input null", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1589 f9035 = new C1589("input not encoded string", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1589 f9034 = new C1589("anyOf fail", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C1589 f9038 = new C1589("oneOf fail", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C1589 f9039 = new C1589("not fail", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C1589 f9036 = new C1589("type not match", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C1589 f9037 = new C1589("propertyName not match", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C1589 f9032 = new C1589("contains not match", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C1589 f9031 = new C1589("uniqueItems not match", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C1589 f9033 = new C1589("required", new Object[0], false);

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        public static Type m21of(String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
            }
            return null;
        }
    }

    public JSONSchema(JSONObject jSONObject) {
        this.f9041 = jSONObject.getString("title");
        this.f9040 = jSONObject.getString("description");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3638 m6195(JSONArray jSONArray, Class cls) {
        JSONSchema[] jSONSchemaArrM6199 = m6199(jSONArray, cls);
        if (jSONSchemaArrM6199 == null) {
            return null;
        }
        return new C3638(jSONSchemaArrM6199);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C3651 m6196(JSONObject jSONObject, Class cls) {
        Object obj = jSONObject.get("not");
        if (obj instanceof Boolean) {
            return new C3651(null, null, (Boolean) obj);
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return new C3651(null, new Type[]{Type.Any}, null);
        }
        if (jSONObject2.size() == 1) {
            Object obj2 = jSONObject2.get("type");
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                Type[] typeArr = new Type[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    typeArr[i] = (Type) jSONArray.getObject(i, Type.class, new JSONReader$Feature[0]);
                }
                return new C3651(null, typeArr, null);
            }
        }
        return new C3651(m6197(jSONObject2, cls), null, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static JSONSchema m6197(JSONObject jSONObject, Class cls) {
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        return (cls == null || cls == Object.class) ? m6200(jSONObject, null) : (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Long.TYPE || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) ? (jSONObject.containsKey("AnyOf") || jSONObject.containsKey("anyOf")) ? m6195(jSONObject.getJSONArray("anyOf"), cls) : jSONObject.containsKey("oneOf") ? m6198(jSONObject.getJSONArray("oneOf"), cls) : jSONObject.containsKey("not") ? m6196(jSONObject, cls) : new C3646(jSONObject) : (cls == BigDecimal.class || cls == Float.TYPE || cls == Double.TYPE || cls == Float.class || cls == Double.class || cls == Number.class) ? (jSONObject.containsKey("AnyOf") || jSONObject.containsKey("anyOf")) ? m6195(jSONObject.getJSONArray("anyOf"), cls) : jSONObject.containsKey("oneOf") ? m6198(jSONObject.getJSONArray("oneOf"), cls) : jSONObject.containsKey("not") ? m6196(jSONObject, cls) : new C3649(jSONObject) : (cls == Boolean.TYPE || cls == Boolean.class) ? new C3636(jSONObject) : cls == String.class ? new C3644(jSONObject) : Collection.class.isAssignableFrom(cls) ? new C3637(jSONObject, null) : cls.isArray() ? new C3637(jSONObject, null) : new C3643(jSONObject, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static C3642 m6198(JSONArray jSONArray, Class cls) {
        JSONSchema[] jSONSchemaArrM6199 = m6199(jSONArray, cls);
        if (jSONSchemaArrM6199 == null) {
            return null;
        }
        return new C3642(jSONSchemaArrM6199);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static JSONSchema[] m6199(JSONArray jSONArray, Class cls) {
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        int size = jSONArray.size();
        JSONSchema[] jSONSchemaArr = new JSONSchema[size];
        for (int i = 0; i < size; i++) {
            jSONSchemaArr[i] = m6197(jSONArray.getJSONObject(i), cls);
        }
        return jSONSchemaArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static JSONSchema m6200(JSONObject jSONObject, JSONSchema jSONSchema) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        JSONObject jSONObjectM6936;
        int i = 0;
        if (jSONObject.size() == 1 && jSONObject.isArray("type")) {
            JSONArray jSONArray = jSONObject.getJSONArray("type");
            JSONSchema[] jSONSchemaArr = new JSONSchema[jSONArray.size()];
            while (i < jSONArray.size()) {
                jSONSchemaArr[i] = m6200(JSONObject.m9of("type", jSONArray.get(i)), null);
                i++;
            }
            return new C3638(jSONSchemaArr);
        }
        Type typeM21of = Type.m21of(jSONObject.getString("type"));
        if (typeM21of != null) {
            switch (typeM21of) {
                case Null:
                    return new C3648(jSONObject);
                case Boolean:
                    return new C3636(jSONObject);
                case Object:
                    return new C3643(jSONObject, jSONSchema);
                case Array:
                    return new C3637(jSONObject, jSONSchema);
                case Number:
                    return new C3649(jSONObject);
                case String:
                    return new C3644(jSONObject);
                case Integer:
                    return new C3646(jSONObject);
                default:
                    throw new JSONSchemaValidException("not support type : " + typeM21of);
            }
        }
        Object[] objArr = (Object[]) jSONObject.getObject("enum", Object[].class, new JSONReader$Feature[0]);
        if (objArr != null) {
            int length = objArr.length;
            while (i < length) {
                if (!(objArr[i] instanceof String)) {
                    return new C3647(objArr);
                }
                i++;
            }
            return new C3644(jSONObject);
        }
        Object obj = jSONObject.get("const");
        if (obj instanceof String) {
            return new C3644(jSONObject);
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return new C3646(jSONObject);
        }
        if (jSONObject.size() == 1) {
            String string = jSONObject.getString("$ref");
            if (string != null && !string.isEmpty()) {
                if ("http://json-schema.org/draft-04/schema#".equals(string)) {
                    ConcurrentHashMap concurrentHashMap = f9030;
                    JSONSchema jSONSchema2 = (JSONSchema) concurrentHashMap.get(string);
                    if (jSONSchema2 != null) {
                        return jSONSchema2;
                    }
                    URL resource = JSONSchema.class.getClassLoader().getResource("schema/draft-04.json");
                    if (resource == null) {
                        jSONObjectM6936 = null;
                    } else {
                        try {
                            InputStream inputStreamOpenStream = resource.openStream();
                            try {
                                Charset charset = StandardCharsets.UTF_8;
                                jSONObjectM6936 = InterfaceC3749.m6936(inputStreamOpenStream);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            } finally {
                            }
                        } catch (IOException e) {
                            throw new JSONException("JSON#parseObject cannot parse '" + resource + "'", e);
                        }
                    }
                    JSONSchema jSONSchemaM6200 = m6200(jSONObjectM6936, null);
                    JSONSchema jSONSchema3 = (JSONSchema) concurrentHashMap.putIfAbsent(string, jSONSchemaM6200);
                    return jSONSchema3 != null ? jSONSchema3 : jSONSchemaM6200;
                }
                if ("#".equals(string)) {
                    return jSONSchema;
                }
                if (jSONSchema instanceof C3643) {
                    C3643 c3643 = (C3643) jSONSchema;
                    linkedHashMap2 = c3643.f9086;
                    linkedHashMap3 = c3643.f9087;
                    linkedHashMap = c3643.f9081;
                } else if (jSONSchema instanceof C3637) {
                    C3637 c3637 = (C3637) jSONSchema;
                    linkedHashMap2 = c3637.f9058;
                    linkedHashMap3 = c3637.f9056;
                    linkedHashMap = null;
                } else {
                    linkedHashMap = null;
                    linkedHashMap2 = null;
                    linkedHashMap3 = null;
                }
                if (linkedHashMap2 != null && string.startsWith("#/definitions/")) {
                    return (JSONSchema) linkedHashMap2.get(string.substring(14));
                }
                if (linkedHashMap3 != null && string.startsWith("#/$defs/")) {
                    String strDecode = URLDecoder.decode(string.substring(8));
                    JSONSchema jSONSchema4 = (JSONSchema) linkedHashMap3.get(strDecode);
                    return jSONSchema4 == null ? new C3645(strDecode) : jSONSchema4;
                }
                if (linkedHashMap != null && string.startsWith("#/properties/")) {
                    return (JSONSchema) linkedHashMap.get(string.substring(13));
                }
                if (string.startsWith("#/prefixItems/") && (jSONSchema instanceof C3637)) {
                    return ((C3637) jSONSchema).f9055[Integer.parseInt(string.substring(14))];
                }
            }
            Object obj2 = jSONObject.get("exclusiveMaximum");
            Object obj3 = jSONObject.get("exclusiveMinimum");
            if ((obj2 instanceof Integer) || (obj3 instanceof Integer) || (obj2 instanceof Long) || (obj3 instanceof Long)) {
                return new C3646(jSONObject);
            }
            if ((obj2 instanceof Number) || (obj3 instanceof Number)) {
                return new C3649(jSONObject);
            }
        }
        if (jSONObject.containsKey("properties") || jSONObject.containsKey("dependentSchemas") || jSONObject.containsKey("if") || jSONObject.containsKey("required") || jSONObject.containsKey("patternProperties") || jSONObject.containsKey("additionalProperties") || jSONObject.containsKey("minProperties") || jSONObject.containsKey("maxProperties") || jSONObject.containsKey("propertyNames") || jSONObject.containsKey("$ref")) {
            return new C3643(jSONObject, jSONSchema);
        }
        if (jSONObject.containsKey("maxItems") || jSONObject.containsKey("minItems") || jSONObject.containsKey("additionalItems") || jSONObject.containsKey("items") || jSONObject.containsKey("prefixItems") || jSONObject.containsKey("uniqueItems") || jSONObject.containsKey("maxContains") || jSONObject.containsKey("minContains")) {
            return new C3637(jSONObject, jSONSchema);
        }
        if (jSONObject.containsKey("pattern") || jSONObject.containsKey("format") || jSONObject.containsKey("minLength") || jSONObject.containsKey("maxLength")) {
            return new C3644(jSONObject);
        }
        boolean zContainsKey = jSONObject.containsKey("allOf");
        boolean zContainsKey2 = jSONObject.containsKey("anyOf");
        boolean zContainsKey3 = jSONObject.containsKey("oneOf");
        if (zContainsKey || zContainsKey2 || zContainsKey3) {
            int i2 = (zContainsKey ? 1 : 0) + (zContainsKey2 ? 1 : 0) + (zContainsKey3 ? 1 : 0);
            if (i2 == 1) {
                return zContainsKey ? new C3640(jSONObject, jSONSchema) : zContainsKey2 ? new C3638(jSONObject, jSONSchema) : new C3642(jSONObject, jSONSchema);
            }
            JSONSchema[] jSONSchemaArr2 = new JSONSchema[i2];
            if (zContainsKey) {
                jSONSchemaArr2[0] = new C3640(jSONObject, jSONSchema);
                i = 1;
            }
            if (zContainsKey2) {
                jSONSchemaArr2[i] = new C3638(jSONObject, jSONSchema);
                i++;
            }
            if (zContainsKey3) {
                jSONSchemaArr2[i] = new C3642(jSONObject, jSONSchema);
            }
            return new C3640(jSONSchemaArr2);
        }
        if (jSONObject.containsKey("not")) {
            return m6196(jSONObject, null);
        }
        if ((jSONObject.get("maximum") instanceof Number) || (jSONObject.get("minimum") instanceof Number) || jSONObject.containsKey("multipleOf")) {
            return new C3649(jSONObject);
        }
        if (jSONObject.isEmpty()) {
            return C3639.f9061;
        }
        if (jSONObject.size() == 1) {
            Object obj4 = jSONObject.get("type");
            if (obj4 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj4;
                JSONSchema[] jSONSchemaArr3 = new JSONSchema[jSONArray2.size()];
                while (i < jSONArray2.size()) {
                    Type typeM21of2 = Type.m21of(jSONArray2.getString(i));
                    switch (typeM21of2) {
                        case Null:
                            jSONSchemaArr3[i] = new C3648(JSONObject.m9of("type", (Object) "null"));
                            break;
                        case Boolean:
                            jSONSchemaArr3[i] = new C3636(JSONObject.m9of("type", (Object) "boolean"));
                            break;
                        case Object:
                            jSONSchemaArr3[i] = new C3643(JSONObject.m9of("type", (Object) "object"), null);
                            break;
                        case Array:
                            jSONSchemaArr3[i] = new C3637(JSONObject.m9of("type", (Object) "array"), null);
                            break;
                        case Number:
                            jSONSchemaArr3[i] = new C3649(JSONObject.m9of("type", (Object) "number"));
                            break;
                        case String:
                            jSONSchemaArr3[i] = new C3644(JSONObject.m9of("type", (Object) "string"));
                            break;
                        case Integer:
                            jSONSchemaArr3[i] = new C3646(JSONObject.m9of("type", (Object) "integer"));
                            break;
                        default:
                            throw new JSONSchemaValidException("not support type : " + typeM21of2);
                    }
                    i++;
                }
                return new C3638(jSONSchemaArr3);
            }
        }
        if (jSONObject.getString("type") == null) {
            throw new JSONSchemaValidException("type required");
        }
        throw new JSONSchemaValidException("not support type : " + jSONObject.getString("type"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mo6213().equals(((JSONSchema) obj).mo6213());
    }

    public final int hashCode() {
        return mo6213().hashCode();
    }

    public final String toString() {
        return mo6213().toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m6201(Float f) {
        C1589 c1589Mo6206 = mo6206(f);
        if (!c1589Mo6206.f2501) {
            throw new JSONSchemaValidException(c1589Mo6206.m2119());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m6202(Double d) {
        C1589 c1589Mo6207 = mo6207(d);
        if (!c1589Mo6207.f2501) {
            throw new JSONSchemaValidException(c1589Mo6207.m2119());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m6203(long j) {
        C1589 c1589Mo6212 = mo6212(j);
        if (!c1589Mo6212.f2501) {
            throw new JSONSchemaValidException(c1589Mo6212.m2119());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m6204(double d) {
        C1589 c1589Mo6211 = mo6211(d);
        if (!c1589Mo6211.f2501) {
            throw new JSONSchemaValidException(c1589Mo6211.m2119());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1589 mo6206(Float f) {
        return mo6208(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1589 mo6207(Double d) {
        return mo6208(d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract C1589 mo6208(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C1589 mo6209(Integer num) {
        return mo6208(num);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C1589 mo6210(Long l) {
        return mo6208(l);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1589 mo6211(double d) {
        return mo6208(Double.valueOf(d));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1589 mo6212(long j) {
        return mo6208(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public JSONObject mo6213() {
        return new JSONObject();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m6214(Long l) {
        C1589 c1589Mo6210 = mo6210(l);
        if (!c1589Mo6210.f2501) {
            throw new JSONSchemaValidException(c1589Mo6210.m2119());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m6215(Integer num) {
        C1589 c1589Mo6209 = mo6209(num);
        if (!c1589Mo6209.f2501) {
            throw new JSONSchemaValidException(c1589Mo6209.m2119());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m6216(Object obj) {
        C1589 c1589Mo6208 = mo6208(obj);
        if (!c1589Mo6208.f2501) {
            throw new JSONSchemaValidException(c1589Mo6208.m2119());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public abstract Type mo6217();

    public JSONSchema() {
        this.f9041 = null;
        this.f9040 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo6205(C9242 c9242) {
    }
}
