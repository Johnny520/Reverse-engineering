package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.InterfaceC2916;
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
import p279.InterfaceC8366;
import p289.AbstractC8414;
import p289.C8413;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8366(serializer = AbstractC8414.class)
public abstract class JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f8695;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f8696;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ConcurrentHashMap f8685 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2943 f8684 = AbstractC2933.m6389();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0748 f8683 = new C0748("success", new Object[0], true);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0748 f8682 = new C0748("input null", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0748 f8690 = new C0748("input not encoded string", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0748 f8689 = new C0748("anyOf fail", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C0748 f8693 = new C0748("oneOf fail", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0748 f8694 = new C0748("not fail", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C0748 f8691 = new C0748("type not match", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C0748 f8692 = new C0748("propertyName not match", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C0748 f8687 = new C0748("contains not match", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C0748 f8686 = new C0748("uniqueItems not match", new Object[0], false);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C0748 f8688 = new C0748("required", new Object[0], false);

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

        public static Type of(String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
            }
            return null;
        }
    }

    public JSONSchema(JSONObject jSONObject) {
        this.f8696 = jSONObject.getString("title");
        this.f8695 = jSONObject.getString("description");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2805 m5635(JSONArray jSONArray, Class cls) {
        JSONSchema[] jSONSchemaArrM5639 = m5639(jSONArray, cls);
        if (jSONSchemaArrM5639 == null) {
            return null;
        }
        return new C2805(jSONSchemaArrM5639);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C2818 m5636(JSONObject jSONObject, Class cls) {
        Object obj = jSONObject.get("not");
        if (obj instanceof Boolean) {
            return new C2818(null, null, (Boolean) obj);
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return new C2818(null, new Type[]{Type.Any}, null);
        }
        if (jSONObject2.size() == 1) {
            Object obj2 = jSONObject2.get("type");
            if (obj2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj2;
                Type[] typeArr = new Type[jSONArray.size()];
                for (int i = 0; i < jSONArray.size(); i++) {
                    typeArr[i] = (Type) jSONArray.getObject(i, Type.class, new JSONReader$Feature[0]);
                }
                return new C2818(null, typeArr, null);
            }
        }
        return new C2818(m5637(jSONObject2, cls), null, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static JSONSchema m5637(JSONObject jSONObject, Class cls) {
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        return (cls == null || cls == Object.class) ? m5640(jSONObject, null) : (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Long.TYPE || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) ? (jSONObject.containsKey("AnyOf") || jSONObject.containsKey("anyOf")) ? m5635(jSONObject.getJSONArray("anyOf"), cls) : jSONObject.containsKey("oneOf") ? m5638(jSONObject.getJSONArray("oneOf"), cls) : jSONObject.containsKey("not") ? m5636(jSONObject, cls) : new C2813(jSONObject) : (cls == BigDecimal.class || cls == Float.TYPE || cls == Double.TYPE || cls == Float.class || cls == Double.class || cls == Number.class) ? (jSONObject.containsKey("AnyOf") || jSONObject.containsKey("anyOf")) ? m5635(jSONObject.getJSONArray("anyOf"), cls) : jSONObject.containsKey("oneOf") ? m5638(jSONObject.getJSONArray("oneOf"), cls) : jSONObject.containsKey("not") ? m5636(jSONObject, cls) : new C2816(jSONObject) : (cls == Boolean.TYPE || cls == Boolean.class) ? new C2803(jSONObject) : cls == String.class ? new C2811(jSONObject) : Collection.class.isAssignableFrom(cls) ? new C2804(jSONObject, null) : cls.isArray() ? new C2804(jSONObject, null) : new C2810(jSONObject, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static C2809 m5638(JSONArray jSONArray, Class cls) {
        JSONSchema[] jSONSchemaArrM5639 = m5639(jSONArray, cls);
        if (jSONSchemaArrM5639 == null) {
            return null;
        }
        return new C2809(jSONSchemaArrM5639);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static JSONSchema[] m5639(JSONArray jSONArray, Class cls) {
        if (jSONArray == null || jSONArray.isEmpty()) {
            return null;
        }
        int size = jSONArray.size();
        JSONSchema[] jSONSchemaArr = new JSONSchema[size];
        for (int i = 0; i < size; i++) {
            jSONSchemaArr[i] = m5637(jSONArray.getJSONObject(i), cls);
        }
        return jSONSchemaArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static JSONSchema m5640(JSONObject jSONObject, JSONSchema jSONSchema) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        JSONObject jSONObjectM6376;
        int i = 0;
        if (jSONObject.size() == 1 && jSONObject.isArray("type")) {
            JSONArray jSONArray = jSONObject.getJSONArray("type");
            JSONSchema[] jSONSchemaArr = new JSONSchema[jSONArray.size()];
            while (i < jSONArray.size()) {
                jSONSchemaArr[i] = m5640(JSONObject.of("type", jSONArray.get(i)), null);
                i++;
            }
            return new C2805(jSONSchemaArr);
        }
        Type typeOf = Type.of(jSONObject.getString("type"));
        if (typeOf != null) {
            switch (typeOf) {
                case Null:
                    return new C2815(jSONObject);
                case Boolean:
                    return new C2803(jSONObject);
                case Object:
                    return new C2810(jSONObject, jSONSchema);
                case Array:
                    return new C2804(jSONObject, jSONSchema);
                case Number:
                    return new C2816(jSONObject);
                case String:
                    return new C2811(jSONObject);
                case Integer:
                    return new C2813(jSONObject);
                default:
                    throw new JSONSchemaValidException("not support type : " + typeOf);
            }
        }
        Object[] objArr = (Object[]) jSONObject.getObject("enum", Object[].class, new JSONReader$Feature[0]);
        if (objArr != null) {
            int length = objArr.length;
            while (i < length) {
                if (!(objArr[i] instanceof String)) {
                    return new C2814(objArr);
                }
                i++;
            }
            return new C2811(jSONObject);
        }
        Object obj = jSONObject.get("const");
        if (obj instanceof String) {
            return new C2811(jSONObject);
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return new C2813(jSONObject);
        }
        if (jSONObject.size() == 1) {
            String string = jSONObject.getString("$ref");
            if (string != null && !string.isEmpty()) {
                if ("http://json-schema.org/draft-04/schema#".equals(string)) {
                    ConcurrentHashMap concurrentHashMap = f8685;
                    JSONSchema jSONSchema2 = (JSONSchema) concurrentHashMap.get(string);
                    if (jSONSchema2 != null) {
                        return jSONSchema2;
                    }
                    URL resource = JSONSchema.class.getClassLoader().getResource("schema/draft-04.json");
                    if (resource == null) {
                        jSONObjectM6376 = null;
                    } else {
                        try {
                            InputStream inputStreamOpenStream = resource.openStream();
                            try {
                                Charset charset = StandardCharsets.UTF_8;
                                jSONObjectM6376 = InterfaceC2916.m6376(inputStreamOpenStream);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            } finally {
                            }
                        } catch (IOException e) {
                            throw new JSONException("JSON#parseObject cannot parse '" + resource + "'", e);
                        }
                    }
                    JSONSchema jSONSchemaM5640 = m5640(jSONObjectM6376, null);
                    JSONSchema jSONSchema3 = (JSONSchema) concurrentHashMap.putIfAbsent(string, jSONSchemaM5640);
                    return jSONSchema3 != null ? jSONSchema3 : jSONSchemaM5640;
                }
                if ("#".equals(string)) {
                    return jSONSchema;
                }
                if (jSONSchema instanceof C2810) {
                    C2810 c2810 = (C2810) jSONSchema;
                    linkedHashMap2 = c2810.f8741;
                    linkedHashMap3 = c2810.f8742;
                    linkedHashMap = c2810.f8736;
                } else if (jSONSchema instanceof C2804) {
                    C2804 c2804 = (C2804) jSONSchema;
                    linkedHashMap2 = c2804.f8713;
                    linkedHashMap3 = c2804.f8711;
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
                    return jSONSchema4 == null ? new C2812(strDecode) : jSONSchema4;
                }
                if (linkedHashMap != null && string.startsWith("#/properties/")) {
                    return (JSONSchema) linkedHashMap.get(string.substring(13));
                }
                if (string.startsWith("#/prefixItems/") && (jSONSchema instanceof C2804)) {
                    return ((C2804) jSONSchema).f8710[Integer.parseInt(string.substring(14))];
                }
            }
            Object obj2 = jSONObject.get("exclusiveMaximum");
            Object obj3 = jSONObject.get("exclusiveMinimum");
            if ((obj2 instanceof Integer) || (obj3 instanceof Integer) || (obj2 instanceof Long) || (obj3 instanceof Long)) {
                return new C2813(jSONObject);
            }
            if ((obj2 instanceof Number) || (obj3 instanceof Number)) {
                return new C2816(jSONObject);
            }
        }
        if (jSONObject.containsKey("properties") || jSONObject.containsKey("dependentSchemas") || jSONObject.containsKey("if") || jSONObject.containsKey("required") || jSONObject.containsKey("patternProperties") || jSONObject.containsKey("additionalProperties") || jSONObject.containsKey("minProperties") || jSONObject.containsKey("maxProperties") || jSONObject.containsKey("propertyNames") || jSONObject.containsKey("$ref")) {
            return new C2810(jSONObject, jSONSchema);
        }
        if (jSONObject.containsKey("maxItems") || jSONObject.containsKey("minItems") || jSONObject.containsKey("additionalItems") || jSONObject.containsKey("items") || jSONObject.containsKey("prefixItems") || jSONObject.containsKey("uniqueItems") || jSONObject.containsKey("maxContains") || jSONObject.containsKey("minContains")) {
            return new C2804(jSONObject, jSONSchema);
        }
        if (jSONObject.containsKey("pattern") || jSONObject.containsKey("format") || jSONObject.containsKey("minLength") || jSONObject.containsKey("maxLength")) {
            return new C2811(jSONObject);
        }
        boolean zContainsKey = jSONObject.containsKey("allOf");
        boolean zContainsKey2 = jSONObject.containsKey("anyOf");
        boolean zContainsKey3 = jSONObject.containsKey("oneOf");
        if (zContainsKey || zContainsKey2 || zContainsKey3) {
            int i2 = (zContainsKey ? 1 : 0) + (zContainsKey2 ? 1 : 0) + (zContainsKey3 ? 1 : 0);
            if (i2 == 1) {
                return zContainsKey ? new C2807(jSONObject, jSONSchema) : zContainsKey2 ? new C2805(jSONObject, jSONSchema) : new C2809(jSONObject, jSONSchema);
            }
            JSONSchema[] jSONSchemaArr2 = new JSONSchema[i2];
            if (zContainsKey) {
                jSONSchemaArr2[0] = new C2807(jSONObject, jSONSchema);
                i = 1;
            }
            if (zContainsKey2) {
                jSONSchemaArr2[i] = new C2805(jSONObject, jSONSchema);
                i++;
            }
            if (zContainsKey3) {
                jSONSchemaArr2[i] = new C2809(jSONObject, jSONSchema);
            }
            return new C2807(jSONSchemaArr2);
        }
        if (jSONObject.containsKey("not")) {
            return m5636(jSONObject, null);
        }
        if ((jSONObject.get("maximum") instanceof Number) || (jSONObject.get("minimum") instanceof Number) || jSONObject.containsKey("multipleOf")) {
            return new C2816(jSONObject);
        }
        if (jSONObject.isEmpty()) {
            return C2806.f8716;
        }
        if (jSONObject.size() == 1) {
            Object obj4 = jSONObject.get("type");
            if (obj4 instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj4;
                JSONSchema[] jSONSchemaArr3 = new JSONSchema[jSONArray2.size()];
                while (i < jSONArray2.size()) {
                    Type typeOf2 = Type.of(jSONArray2.getString(i));
                    switch (typeOf2) {
                        case Null:
                            jSONSchemaArr3[i] = new C2815(JSONObject.of("type", (Object) "null"));
                            break;
                        case Boolean:
                            jSONSchemaArr3[i] = new C2803(JSONObject.of("type", (Object) "boolean"));
                            break;
                        case Object:
                            jSONSchemaArr3[i] = new C2810(JSONObject.of("type", (Object) "object"), null);
                            break;
                        case Array:
                            jSONSchemaArr3[i] = new C2804(JSONObject.of("type", (Object) "array"), null);
                            break;
                        case Number:
                            jSONSchemaArr3[i] = new C2816(JSONObject.of("type", (Object) "number"));
                            break;
                        case String:
                            jSONSchemaArr3[i] = new C2811(JSONObject.of("type", (Object) "string"));
                            break;
                        case Integer:
                            jSONSchemaArr3[i] = new C2813(JSONObject.of("type", (Object) "integer"));
                            break;
                        default:
                            throw new JSONSchemaValidException("not support type : " + typeOf2);
                    }
                    i++;
                }
                return new C2805(jSONSchemaArr3);
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
        return mo5653().equals(((JSONSchema) obj).mo5653());
    }

    public final int hashCode() {
        return mo5653().hashCode();
    }

    public final String toString() {
        return mo5653().toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5641(Float f) {
        C0748 c0748Mo5646 = mo5646(f);
        if (!c0748Mo5646.f2156) {
            throw new JSONSchemaValidException(c0748Mo5646.m1559());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5642(Double d) {
        C0748 c0748Mo5647 = mo5647(d);
        if (!c0748Mo5647.f2156) {
            throw new JSONSchemaValidException(c0748Mo5647.m1559());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5643(long j) {
        C0748 c0748Mo5652 = mo5652(j);
        if (!c0748Mo5652.f2156) {
            throw new JSONSchemaValidException(c0748Mo5652.m1559());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5644(double d) {
        C0748 c0748Mo5651 = mo5651(d);
        if (!c0748Mo5651.f2156) {
            throw new JSONSchemaValidException(c0748Mo5651.m1559());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0748 mo5646(Float f) {
        return mo5648(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0748 mo5647(Double d) {
        return mo5648(d);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public abstract C0748 mo5648(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C0748 mo5649(Integer num) {
        return mo5648(num);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C0748 mo5650(Long l) {
        return mo5648(l);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0748 mo5651(double d) {
        return mo5648(Double.valueOf(d));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0748 mo5652(long j) {
        return mo5648(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public JSONObject mo5653() {
        return new JSONObject();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m5654(Long l) {
        C0748 c0748Mo5650 = mo5650(l);
        if (!c0748Mo5650.f2156) {
            throw new JSONSchemaValidException(c0748Mo5650.m1559());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5655(Integer num) {
        C0748 c0748Mo5649 = mo5649(num);
        if (!c0748Mo5649.f2156) {
            throw new JSONSchemaValidException(c0748Mo5649.m1559());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5656(Object obj) {
        C0748 c0748Mo5648 = mo5648(obj);
        if (!c0748Mo5648.f2156) {
            throw new JSONSchemaValidException(c0748Mo5648.m1559());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public abstract Type mo5657();

    public JSONSchema() {
        this.f8696 = null;
        this.f8695 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo5645(C8413 c8413) {
    }
}
