package com.alibaba.fastjson2.schema;

import androidx.collection.C0276;
import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2804 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final JSONSchema[] f8712;

    public C2804(JSONObject jSONObject, JSONSchema jSONSchema) {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("anyOf");
        if (jSONArray == null || jSONArray.isEmpty()) {
            C0276.m849("anyOf not found");
            throw null;
        }
        this.f8712 = new JSONSchema[jSONArray.size()];
        for (int i = 0; i < this.f8712.length; i++) {
            Object obj = jSONArray.get(i);
            boolean z = obj instanceof Boolean;
            JSONSchema[] jSONSchemaArr = this.f8712;
            if (z) {
                jSONSchemaArr[i] = ((Boolean) obj).booleanValue() ? C2805.f8714 : C2805.f8713;
            } else {
                jSONSchemaArr[i] = JSONSchema.m5595((JSONObject) obj, jSONSchema);
            }
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5603(Object obj) {
        for (JSONSchema jSONSchema : this.f8712) {
            C0748 c0748Mo5603 = jSONSchema.mo5603(obj);
            C0748 c0748 = JSONSchema.f8681;
            if (c0748Mo5603 == c0748) {
                return c0748;
            }
        }
        return JSONSchema.f8687;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo5608() {
        return JSONObject.of("anyOf", (Object) this.f8712);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5612() {
        return JSONSchema.Type.AnyOf;
    }

    public C2804(JSONSchema[] jSONSchemaArr) {
        this.f8712 = jSONSchemaArr;
    }
}
