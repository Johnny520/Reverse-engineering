package com.alibaba.fastjson2.schema;

import androidx.collection.C0276;
import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2806 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final JSONSchema[] f8715;

    public C2806(JSONObject jSONObject, JSONSchema jSONSchema) {
        JSONSchema jSONSchemaM5595;
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("allOf");
        if (jSONArray == null || jSONArray.isEmpty()) {
            C0276.m849("allOf not found");
            throw null;
        }
        this.f8715 = new JSONSchema[jSONArray.size()];
        int i = 0;
        JSONSchema.Type type = null;
        while (i < this.f8715.length) {
            Object obj = jSONArray.get(i);
            if (obj instanceof Boolean) {
                jSONSchemaM5595 = ((Boolean) obj).booleanValue() ? C2805.f8714 : C2805.f8713;
            } else {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (!jSONObject2.containsKey("$ref") && !jSONObject2.containsKey("type") && type != null) {
                    switch (AbstractC2807.f8716[type.ordinal()]) {
                        case 1:
                            jSONSchemaM5595 = new C2810(jSONObject2);
                            break;
                        case 2:
                            jSONSchemaM5595 = new C2812(jSONObject2);
                            break;
                        case 3:
                            jSONSchemaM5595 = new C2815(jSONObject2);
                            break;
                        case 4:
                            jSONSchemaM5595 = new C2802(jSONObject2);
                            break;
                        case 5:
                            jSONSchemaM5595 = new C2803(jSONObject2, null);
                            break;
                        case 6:
                            jSONSchemaM5595 = new C2809(jSONObject2, null);
                            break;
                        default:
                            jSONSchemaM5595 = null;
                            break;
                    }
                } else {
                    jSONSchemaM5595 = null;
                }
                if (jSONSchemaM5595 == null) {
                    jSONSchemaM5595 = JSONSchema.m5595(jSONObject2, jSONSchema);
                }
            }
            JSONSchema.Type typeMo5612 = jSONSchemaM5595.mo5612();
            this.f8715[i] = jSONSchemaM5595;
            i++;
            type = typeMo5612;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5603(Object obj) {
        for (JSONSchema jSONSchema : this.f8715) {
            C0748 c0748Mo5603 = jSONSchema.mo5603(obj);
            if (!c0748Mo5603.f2155) {
                return c0748Mo5603;
            }
        }
        return JSONSchema.f8681;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5612() {
        return JSONSchema.Type.AllOf;
    }

    public C2806(JSONSchema[] jSONSchemaArr) {
        this.f8715 = jSONSchemaArr;
    }
}
