package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class AnyOf extends JSONSchema {
    final JSONSchema[] items;

    public AnyOf(JSONObject jSONObject, JSONSchema jSONSchema) {
        super(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("anyOf");
        if (jSONArray == null || jSONArray.isEmpty()) {
            C1569c.m6258a("anyOf not found");
            throw null;
        }
        this.items = new JSONSchema[jSONArray.size()];
        for (int i10 = 0; i10 < this.items.length; i10++) {
            Object obj = jSONArray.get(i10);
            boolean z10 = obj instanceof Boolean;
            JSONSchema[] jSONSchemaArr = this.items;
            if (z10) {
                jSONSchemaArr[i10] = ((Boolean) obj).booleanValue() ? Any.INSTANCE : Any.NOT_ANY;
            } else {
                jSONSchemaArr[i10] = JSONSchema.m6419of((JSONObject) obj, jSONSchema);
            }
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.AnyOf;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONObject toJSONObject() {
        return JSONObject.m6194of("anyOf", (Object) this.items);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        for (JSONSchema jSONSchema : this.items) {
            ValidateResult validateResultValidate = jSONSchema.validate(obj);
            ValidateResult validateResult = JSONSchema.SUCCESS;
            if (validateResultValidate == validateResult) {
                return validateResult;
            }
        }
        return JSONSchema.FAIL_ANY_OF;
    }

    public AnyOf(JSONSchema[] jSONSchemaArr) {
        super(null, null);
        this.items = jSONSchemaArr;
    }
}
