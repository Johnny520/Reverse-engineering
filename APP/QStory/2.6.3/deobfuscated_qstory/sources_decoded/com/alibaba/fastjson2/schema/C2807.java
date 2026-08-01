package com.alibaba.fastjson2.schema;

import androidx.collection.C0276;
import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2807 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final JSONSchema[] f8717;

    public C2807(JSONObject jSONObject, JSONSchema jSONSchema) {
        JSONSchema jSONSchemaM5640;
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("allOf");
        if (jSONArray == null || jSONArray.isEmpty()) {
            C0276.m850("allOf not found");
            throw null;
        }
        this.f8717 = new JSONSchema[jSONArray.size()];
        int i = 0;
        JSONSchema.Type type = null;
        while (i < this.f8717.length) {
            Object obj = jSONArray.get(i);
            if (obj instanceof Boolean) {
                jSONSchemaM5640 = ((Boolean) obj).booleanValue() ? C2806.f8716 : C2806.f8715;
            } else {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (!jSONObject2.containsKey("$ref") && !jSONObject2.containsKey("type") && type != null) {
                    switch (AbstractC2808.f8718[type.ordinal()]) {
                        case 1:
                            jSONSchemaM5640 = new C2811(jSONObject2);
                            break;
                        case 2:
                            jSONSchemaM5640 = new C2813(jSONObject2);
                            break;
                        case 3:
                            jSONSchemaM5640 = new C2816(jSONObject2);
                            break;
                        case 4:
                            jSONSchemaM5640 = new C2803(jSONObject2);
                            break;
                        case 5:
                            jSONSchemaM5640 = new C2804(jSONObject2, null);
                            break;
                        case 6:
                            jSONSchemaM5640 = new C2810(jSONObject2, null);
                            break;
                        default:
                            jSONSchemaM5640 = null;
                            break;
                    }
                } else {
                    jSONSchemaM5640 = null;
                }
                if (jSONSchemaM5640 == null) {
                    jSONSchemaM5640 = JSONSchema.m5640(jSONObject2, jSONSchema);
                }
            }
            JSONSchema.Type typeMo5657 = jSONSchemaM5640.mo5657();
            this.f8717[i] = jSONSchemaM5640;
            i++;
            type = typeMo5657;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5648(Object obj) {
        for (JSONSchema jSONSchema : this.f8717) {
            C0748 c0748Mo5648 = jSONSchema.mo5648(obj);
            if (!c0748Mo5648.f2156) {
                return c0748Mo5648;
            }
        }
        return JSONSchema.f8683;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5657() {
        return JSONSchema.Type.AllOf;
    }

    public C2807(JSONSchema[] jSONSchemaArr) {
        this.f8717 = jSONSchemaArr;
    }
}
