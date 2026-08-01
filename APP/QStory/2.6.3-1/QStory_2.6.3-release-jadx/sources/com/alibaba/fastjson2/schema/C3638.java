package com.alibaba.fastjson2.schema;

import androidx.collection.C1123;
import androidx.compose.foundation.lazy.C1589;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3638 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final JSONSchema[] f9059;

    public C3638(JSONObject jSONObject, JSONSchema jSONSchema) {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("anyOf");
        if (jSONArray == null || jSONArray.isEmpty()) {
            C1123.m1410("anyOf not found");
            throw null;
        }
        this.f9059 = new JSONSchema[jSONArray.size()];
        for (int i = 0; i < this.f9059.length; i++) {
            Object obj = jSONArray.get(i);
            boolean z = obj instanceof Boolean;
            JSONSchema[] jSONSchemaArr = this.f9059;
            if (z) {
                jSONSchemaArr[i] = ((Boolean) obj).booleanValue() ? C3639.f9061 : C3639.f9060;
            } else {
                jSONSchemaArr[i] = JSONSchema.m6200((JSONObject) obj, jSONSchema);
            }
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C1589 mo6208(Object obj) {
        for (JSONSchema jSONSchema : this.f9059) {
            C1589 c1589Mo6208 = jSONSchema.mo6208(obj);
            C1589 c1589 = JSONSchema.f9028;
            if (c1589Mo6208 == c1589) {
                return c1589;
            }
        }
        return JSONSchema.f9034;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo6213() {
        return JSONObject.m9of("anyOf", (Object) this.f9059);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo6217() {
        return JSONSchema.Type.AnyOf;
    }

    public C3638(JSONSchema[] jSONSchemaArr) {
        this.f9059 = jSONSchemaArr;
    }
}
