package com.alibaba.fastjson2.schema;

import androidx.collection.C0276;
import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2805 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final JSONSchema[] f8714;

    public C2805(JSONObject jSONObject, JSONSchema jSONSchema) {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("anyOf");
        if (jSONArray == null || jSONArray.isEmpty()) {
            C0276.m850("anyOf not found");
            throw null;
        }
        this.f8714 = new JSONSchema[jSONArray.size()];
        for (int i = 0; i < this.f8714.length; i++) {
            Object obj = jSONArray.get(i);
            boolean z = obj instanceof Boolean;
            JSONSchema[] jSONSchemaArr = this.f8714;
            if (z) {
                jSONSchemaArr[i] = ((Boolean) obj).booleanValue() ? C2806.f8716 : C2806.f8715;
            } else {
                jSONSchemaArr[i] = JSONSchema.m5640((JSONObject) obj, jSONSchema);
            }
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5648(Object obj) {
        for (JSONSchema jSONSchema : this.f8714) {
            C0748 c0748Mo5648 = jSONSchema.mo5648(obj);
            C0748 c0748 = JSONSchema.f8683;
            if (c0748Mo5648 == c0748) {
                return c0748;
            }
        }
        return JSONSchema.f8689;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo5653() {
        return JSONObject.of("anyOf", (Object) this.f8714);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5657() {
        return JSONSchema.Type.AnyOf;
    }

    public C2805(JSONSchema[] jSONSchemaArr) {
        this.f8714 = jSONSchemaArr;
    }
}
