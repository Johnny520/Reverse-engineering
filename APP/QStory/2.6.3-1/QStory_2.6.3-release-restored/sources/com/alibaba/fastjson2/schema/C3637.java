package com.alibaba.fastjson2.schema;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.compose.foundation.lazy.C1589;
import bsh.C3503;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.reader.C3533;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3637 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C3638 f9042;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C3640 f9043;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f9044;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f9045;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f9046;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final JSONSchema f9047;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean f9048;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C3642 f9049;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f9050;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f9051;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f9052;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final JSONSchema f9053;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final JSONSchema f9054;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final JSONSchema[] f9055;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashMap f9056;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f9057;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedHashMap f9058;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3637(JSONObject jSONObject, JSONSchema jSONSchema) {
        boolean zBooleanValue;
        JSONSchema jSONSchema2;
        super(jSONObject);
        this.f9057 = "array".equals(jSONObject.get("type"));
        this.f9058 = new LinkedHashMap();
        this.f9056 = new LinkedHashMap();
        this.f9048 = jSONObject.getBooleanValue("encoded", false);
        JSONObject jSONObject2 = jSONObject.getJSONObject("definitions");
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                this.f9058.put(entry.getKey(), JSONSchema.m6200((JSONObject) entry.getValue(), jSONSchema == null ? this : jSONSchema));
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("$defs");
        if (jSONObject3 != null) {
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                this.f9056.put(entry2.getKey(), JSONSchema.m6200((JSONObject) entry2.getValue(), jSONSchema == null ? this : jSONSchema));
            }
        }
        this.f9050 = jSONObject.getIntValue("minItems", -1);
        this.f9051 = jSONObject.getIntValue("maxItems", -1);
        Object obj = jSONObject.get("items");
        Object obj2 = jSONObject.get("additionalItems");
        JSONArray jSONArray = jSONObject.getJSONArray("prefixItems");
        boolean z = true;
        if (obj == null) {
            this.f9054 = null;
        } else {
            if (obj instanceof Boolean) {
                zBooleanValue = ((Boolean) obj).booleanValue();
                this.f9054 = null;
                if (!(obj2 instanceof JSONObject)) {
                    this.f9053 = JSONSchema.m6200((JSONObject) obj2, jSONSchema == null ? this : jSONSchema);
                    zBooleanValue = true;
                } else if (obj2 instanceof Boolean) {
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                    this.f9053 = null;
                } else {
                    this.f9053 = null;
                }
                jSONSchema2 = this.f9054;
                if ((jSONSchema2 != null || (jSONSchema2 instanceof C3639)) && (jSONArray != null || (obj instanceof Boolean))) {
                }
                this.f9052 = z;
                if (jSONArray != null) {
                    this.f9055 = new JSONSchema[0];
                } else {
                    this.f9055 = new JSONSchema[jSONArray.size()];
                    for (int i = 0; i < jSONArray.size(); i++) {
                        Object obj3 = jSONArray.get(i);
                        this.f9055[i] = obj3 instanceof Boolean ? ((Boolean) obj3).booleanValue() ? C3639.f9061 : C3639.f9060 : JSONSchema.m6200((JSONObject) obj3, jSONSchema == null ? this : jSONSchema);
                    }
                }
                this.f9047 = (JSONSchema) jSONObject.getObject("contains", new C3533(15));
                this.f9046 = jSONObject.getIntValue("minContains", -1);
                this.f9045 = jSONObject.getIntValue("maxContains", -1);
                this.f9044 = jSONObject.getBooleanValue("uniqueItems");
                JSONSchema[] jSONSchemaArrM6199 = JSONSchema.m6199(jSONObject.getJSONArray("allOf"), null);
                this.f9043 = jSONSchemaArrM6199 != null ? null : new C3640(jSONSchemaArrM6199);
                this.f9042 = JSONSchema.m6195(jSONObject.getJSONArray("anyOf"), null);
                this.f9049 = JSONSchema.m6198(jSONObject.getJSONArray("oneOf"), null);
            }
            if (!(obj instanceof JSONArray)) {
                this.f9054 = JSONSchema.m6200((JSONObject) obj, jSONSchema != null ? jSONSchema : this);
            } else {
                if (jSONArray != null) {
                    C1123.m1410(AbstractC0900.m713(obj, "schema error, items : "));
                    throw null;
                }
                jSONArray = (JSONArray) obj;
                this.f9054 = null;
            }
        }
        zBooleanValue = true;
        if (!(obj2 instanceof JSONObject)) {
        }
        jSONSchema2 = this.f9054;
        z = jSONSchema2 != null ? zBooleanValue : zBooleanValue;
        this.f9052 = z;
        if (jSONArray != null) {
        }
        this.f9047 = (JSONSchema) jSONObject.getObject("contains", new C3533(15));
        this.f9046 = jSONObject.getIntValue("minContains", -1);
        this.f9045 = jSONObject.getIntValue("maxContains", -1);
        this.f9044 = jSONObject.getBooleanValue("uniqueItems");
        JSONSchema[] jSONSchemaArrM61992 = JSONSchema.m6199(jSONObject.getJSONArray("allOf"), null);
        this.f9043 = jSONSchemaArrM61992 != null ? null : new C3640(jSONSchemaArrM61992);
        this.f9042 = JSONSchema.m6195(jSONObject.getJSONArray("anyOf"), null);
        this.f9049 = JSONSchema.m6198(jSONObject.getJSONArray("oneOf"), null);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C1589 mo6208(Object obj) throws IOException {
        boolean z = this.f9057;
        if (obj != null) {
            if (this.f9048) {
                if (obj instanceof String) {
                    try {
                        obj = InterfaceC3749.m6928((String) obj);
                    } catch (JSONException unused) {
                    }
                }
                return JSONSchema.f9035;
            }
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                return m6218(obj, objArr.length, new C3503(objArr, 1));
            }
            if (obj.getClass().isArray()) {
                return m6218(obj, Array.getLength(obj), new C3503(obj, 2));
            }
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                return m6218(obj, collection.size(), new C3503(collection.iterator(), 3));
            }
            if (z) {
                return JSONSchema.f9036;
            }
        } else if (z) {
            return JSONSchema.f9027;
        }
        return JSONSchema.f9028;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C1589 m6218(Object obj, int i, IntFunction intFunction) {
        boolean z;
        JSONSchema jSONSchema;
        int i2 = this.f9050;
        if (i2 >= 0 && i < i2) {
            return new C1589("minLength not match, expect >= %s, but %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}, false);
        }
        int i3 = this.f9051;
        if (i3 >= 0 && i > i3) {
            return new C1589("maxLength not match, expect <= %s, but %s", new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}, false);
        }
        boolean z2 = this.f9052;
        JSONSchema[] jSONSchemaArr = this.f9055;
        if (!z2 && i > jSONSchemaArr.length) {
            return new C1589("additional items not match, max size %s, but %s", new Object[]{Integer.valueOf(jSONSchemaArr.length), Integer.valueOf(i)}, false);
        }
        boolean z3 = obj instanceof Collection;
        HashSet hashSet = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            C1589 c1589 = JSONSchema.f9028;
            int i6 = this.f9045;
            int i7 = this.f9046;
            JSONSchema jSONSchema2 = this.f9047;
            if (i4 >= i) {
                boolean z4 = z3;
                if (!z4 || jSONSchema2 != null) {
                    if (i7 >= 0 && i5 < i7) {
                        return new C1589("minContains not match, expect %s, but %s", new Object[]{Integer.valueOf(i7), Integer.valueOf(i5)}, false);
                    }
                    if (!z4 ? jSONSchema2 == null || i5 != 0 : i5 != 0 || i7 == 0) {
                        return JSONSchema.f9032;
                    }
                    if (i6 >= 0 && i5 > i6) {
                        return new C1589("maxContains not match, expect %s, but %s", new Object[]{Integer.valueOf(i6), Integer.valueOf(i5)}, false);
                    }
                }
                C3640 c3640 = this.f9043;
                if (c3640 != null) {
                    C1589 c1589Mo6208 = c3640.mo6208(obj);
                    if (!c1589Mo6208.f2501) {
                        return c1589Mo6208;
                    }
                }
                C3638 c3638 = this.f9042;
                if (c3638 != null) {
                    C1589 c1589Mo62082 = c3638.mo6208(obj);
                    if (!c1589Mo62082.f2501) {
                        return c1589Mo62082;
                    }
                }
                C3642 c3642 = this.f9049;
                if (c3642 != null) {
                    C1589 c1589Mo62083 = c3642.mo6208(obj);
                    if (!c1589Mo62083.f2501) {
                        return c1589Mo62083;
                    }
                }
                return c1589;
            }
            Object objApply = intFunction.apply(i4);
            if (i4 < jSONSchemaArr.length) {
                C1589 c1589Mo62084 = jSONSchemaArr[i4].mo6208(objApply);
                if (!c1589Mo62084.f2501) {
                    return c1589Mo62084;
                }
                z = z3;
            } else {
                JSONSchema jSONSchema3 = this.f9054;
                if (z3 && jSONSchema3 == null && (jSONSchema = this.f9053) != null) {
                    C1589 c1589Mo62085 = jSONSchema.mo6208(objApply);
                    z = z3;
                    if (!c1589Mo62085.f2501) {
                        return c1589Mo62085;
                    }
                } else {
                    z = z3;
                }
                if (jSONSchema3 != null) {
                    C1589 c1589Mo62086 = jSONSchema3.mo6208(objApply);
                    if (!c1589Mo62086.f2501) {
                        return c1589Mo62086;
                    }
                }
            }
            if (jSONSchema2 != null && ((i7 > 0 || i6 > 0 || i5 == 0) && jSONSchema2.mo6208(objApply) == c1589)) {
                i5++;
            }
            if (this.f9044) {
                if (hashSet == null) {
                    hashSet = new HashSet(i, 1.0f);
                }
                if (objApply instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) objApply;
                    objApply = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
                }
                if (!hashSet.add(objApply)) {
                    return JSONSchema.f9031;
                }
            }
            i4++;
            z3 = z;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo6213() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "array");
        int i = this.f9051;
        if (i != -1) {
            jSONObject.put("maxLength", Integer.valueOf(i));
        }
        int i2 = this.f9050;
        if (i2 != -1) {
            jSONObject.put("minLength", Integer.valueOf(i2));
        }
        JSONSchema jSONSchema = this.f9054;
        if (jSONSchema != null) {
            jSONObject.put("items", jSONSchema);
        }
        JSONSchema[] jSONSchemaArr = this.f9055;
        if (jSONSchemaArr != null && jSONSchemaArr.length != 0) {
            jSONObject.put("prefixItems", jSONSchemaArr);
        }
        boolean z = this.f9052;
        if (!z) {
            jSONObject.put("additionalItems", Boolean.valueOf(z));
        }
        JSONSchema jSONSchema2 = this.f9053;
        if (jSONSchema2 != null) {
            jSONObject.put("additionalItem", jSONSchema2);
        }
        JSONSchema jSONSchema3 = this.f9047;
        if (jSONSchema3 != null) {
            jSONObject.put("contains", jSONSchema3);
        }
        int i3 = this.f9046;
        if (i3 != -1) {
            jSONObject.put("minContains", Integer.valueOf(i3));
        }
        int i4 = this.f9045;
        if (i4 != -1) {
            jSONObject.put("maxContains", Integer.valueOf(i4));
        }
        boolean z2 = this.f9044;
        if (z2) {
            jSONObject.put("uniqueItems", Boolean.valueOf(z2));
        }
        C3640 c3640 = this.f9043;
        if (c3640 != null) {
            jSONObject.put("allOf", c3640);
        }
        C3638 c3638 = this.f9042;
        if (c3638 != null) {
            jSONObject.put("anyOf", c3638);
        }
        C3642 c3642 = this.f9049;
        if (c3642 != null) {
            jSONObject.put("oneOf", c3642);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo6217() {
        return JSONSchema.Type.Array;
    }
}
