package com.alibaba.fastjson2.schema;

import androidx.collection.C0276;
import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2809 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final JSONSchema[] f8719;

    public C2809(JSONObject jSONObject, JSONSchema jSONSchema) {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("oneOf");
        if (jSONArray == null || jSONArray.isEmpty()) {
            C0276.m850("oneOf not found");
            throw null;
        }
        this.f8719 = new JSONSchema[jSONArray.size()];
        for (int i = 0; i < this.f8719.length; i++) {
            Object obj = jSONArray.get(i);
            boolean z = obj instanceof Boolean;
            JSONSchema[] jSONSchemaArr = this.f8719;
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
        JSONSchema[] jSONSchemaArr = this.f8719;
        int length = jSONSchemaArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < length) {
                if (jSONSchemaArr[i].mo5648(obj).f2156 && (i2 = i2 + 1) > 1) {
                    break;
                }
                i++;
            } else if (i2 == 1) {
                return JSONSchema.f8683;
            }
        }
        return JSONSchema.f8693;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5657() {
        return JSONSchema.Type.OneOf;
    }

    public C2809(JSONSchema[] jSONSchemaArr) {
        this.f8719 = jSONSchemaArr;
    }
}
