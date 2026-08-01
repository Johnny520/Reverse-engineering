package com.alibaba.fastjson2.schema;

import androidx.collection.C1123;
import androidx.compose.foundation.lazy.C1589;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3642 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final JSONSchema[] f9064;

    public C3642(JSONObject jSONObject, JSONSchema jSONSchema) {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("oneOf");
        if (jSONArray == null || jSONArray.isEmpty()) {
            C1123.m1410("oneOf not found");
            throw null;
        }
        this.f9064 = new JSONSchema[jSONArray.size()];
        for (int i = 0; i < this.f9064.length; i++) {
            Object obj = jSONArray.get(i);
            boolean z = obj instanceof Boolean;
            JSONSchema[] jSONSchemaArr = this.f9064;
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
        JSONSchema[] jSONSchemaArr = this.f9064;
        int length = jSONSchemaArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < length) {
                if (jSONSchemaArr[i].mo6208(obj).f2501 && (i2 = i2 + 1) > 1) {
                    break;
                }
                i++;
            } else if (i2 == 1) {
                return JSONSchema.f9028;
            }
        }
        return JSONSchema.f9038;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo6217() {
        return JSONSchema.Type.OneOf;
    }

    public C3642(JSONSchema[] jSONSchemaArr) {
        this.f9064 = jSONSchemaArr;
    }
}
