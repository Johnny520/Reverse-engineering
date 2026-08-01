package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class BooleanSchema extends JSONSchema {
    public BooleanSchema(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Boolean;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONObject toJSONObject() {
        return JSONObject.m6194of("type", (Object) "boolean");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        return obj == null ? JSONSchema.FAIL_INPUT_NULL : obj instanceof Boolean ? JSONSchema.SUCCESS : new ValidateResult(false, "expect type %s, but %s", JSONSchema.Type.Boolean, obj.getClass());
    }
}
