package com.alibaba.fastjson2.schema;

import androidx.collection.C1123;
import androidx.compose.foundation.lazy.C1589;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3640 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final JSONSchema[] f9062;

    public C3640(JSONObject jSONObject, JSONSchema jSONSchema) {
        JSONSchema jSONSchemaM6200;
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("allOf");
        if (jSONArray == null || jSONArray.isEmpty()) {
            C1123.m1410("allOf not found");
            throw null;
        }
        this.f9062 = new JSONSchema[jSONArray.size()];
        int i = 0;
        JSONSchema.Type type = null;
        while (i < this.f9062.length) {
            Object obj = jSONArray.get(i);
            if (obj instanceof Boolean) {
                jSONSchemaM6200 = ((Boolean) obj).booleanValue() ? C3639.f9061 : C3639.f9060;
            } else {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (!jSONObject2.containsKey("$ref") && !jSONObject2.containsKey("type") && type != null) {
                    switch (AbstractC3641.f9063[type.ordinal()]) {
                        case 1:
                            jSONSchemaM6200 = new C3644(jSONObject2);
                            break;
                        case 2:
                            jSONSchemaM6200 = new C3646(jSONObject2);
                            break;
                        case 3:
                            jSONSchemaM6200 = new C3649(jSONObject2);
                            break;
                        case 4:
                            jSONSchemaM6200 = new C3636(jSONObject2);
                            break;
                        case 5:
                            jSONSchemaM6200 = new C3637(jSONObject2, null);
                            break;
                        case 6:
                            jSONSchemaM6200 = new C3643(jSONObject2, null);
                            break;
                        default:
                            jSONSchemaM6200 = null;
                            break;
                    }
                } else {
                    jSONSchemaM6200 = null;
                }
                if (jSONSchemaM6200 == null) {
                    jSONSchemaM6200 = JSONSchema.m6200(jSONObject2, jSONSchema);
                }
            }
            JSONSchema.Type typeMo6217 = jSONSchemaM6200.mo6217();
            this.f9062[i] = jSONSchemaM6200;
            i++;
            type = typeMo6217;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C1589 mo6208(Object obj) {
        for (JSONSchema jSONSchema : this.f9062) {
            C1589 c1589Mo6208 = jSONSchema.mo6208(obj);
            if (!c1589Mo6208.f2501) {
                return c1589Mo6208;
            }
        }
        return JSONSchema.f9028;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo6217() {
        return JSONSchema.Type.AllOf;
    }

    public C3640(JSONSchema[] jSONSchemaArr) {
        this.f9062 = jSONSchemaArr;
    }
}
