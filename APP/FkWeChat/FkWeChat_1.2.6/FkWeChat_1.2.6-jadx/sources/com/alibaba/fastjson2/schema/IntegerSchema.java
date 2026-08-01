package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class IntegerSchema extends JSONSchema {
    final Long constValue;
    final boolean exclusiveMaximum;
    final boolean exclusiveMinimum;
    final long maximum;
    final long minimum;
    final long multipleOf;
    final boolean typed;

    public IntegerSchema(JSONObject jSONObject) {
        super(jSONObject);
        this.typed = "integer".equalsIgnoreCase(jSONObject.getString("type")) || jSONObject.getBooleanValue("required");
        Object obj = jSONObject.get("exclusiveMinimum");
        long longValue = jSONObject.getLongValue("minimum", Long.MIN_VALUE);
        Boolean bool = Boolean.TRUE;
        if (obj == bool) {
            this.exclusiveMinimum = true;
            this.minimum = longValue;
        } else if (obj instanceof Number) {
            this.exclusiveMinimum = true;
            this.minimum = jSONObject.getLongValue("exclusiveMinimum");
        } else {
            this.minimum = longValue;
            this.exclusiveMinimum = false;
        }
        long longValue2 = jSONObject.getLongValue("maximum", Long.MIN_VALUE);
        Object obj2 = jSONObject.get("exclusiveMaximum");
        if (obj2 == bool) {
            this.exclusiveMaximum = true;
            this.maximum = longValue2;
        } else if (obj2 instanceof Number) {
            this.exclusiveMaximum = true;
            this.maximum = jSONObject.getLongValue("exclusiveMaximum");
        } else {
            this.exclusiveMaximum = false;
            this.maximum = longValue2;
        }
        this.multipleOf = jSONObject.getLongValue("multipleOf", 0L);
        this.constValue = jSONObject.getLong("const");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Integer;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "integer");
        long j10 = this.minimum;
        if (j10 != Long.MIN_VALUE) {
            jSONObject.put(this.exclusiveMinimum ? "exclusiveMinimum" : "minimum", Long.valueOf(j10));
        }
        long j11 = this.maximum;
        if (j11 != Long.MIN_VALUE) {
            jSONObject.put(this.exclusiveMaximum ? "exclusiveMaximum" : "maximum", Long.valueOf(j11));
        }
        long j12 = this.multipleOf;
        if (j12 != 0) {
            jSONObject.put("multipleOf", Long.valueOf(j12));
        }
        Long l10 = this.constValue;
        if (l10 != null) {
            jSONObject.put("const", l10);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        if (r11.constValue.longValue() == java.lang.Long.parseLong(r1)) goto L68;
     */
    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alibaba.fastjson2.schema.ValidateResult validateInternal(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.schema.IntegerSchema.validateInternal(java.lang.Object):com.alibaba.fastjson2.schema.ValidateResult");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(long j10) {
        boolean z10;
        boolean z11;
        long j11 = this.minimum;
        if (j11 != Long.MIN_VALUE && (!(z11 = this.exclusiveMinimum) ? j10 < j11 : j10 <= j11)) {
            return new ValidateResult(false, z11 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", Long.valueOf(j11), Long.valueOf(j10));
        }
        long j12 = this.maximum;
        if (j12 != Long.MIN_VALUE && (!(z10 = this.exclusiveMaximum) ? j10 > j12 : j10 >= j12)) {
            return new ValidateResult(false, z10 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", Long.valueOf(j12), Long.valueOf(j10));
        }
        long j13 = this.multipleOf;
        if (j13 != 0 && j10 % j13 != 0) {
            return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", Long.valueOf(j13), Long.valueOf(j10));
        }
        Long l10 = this.constValue;
        if (l10 != null && l10.longValue() != j10) {
            return new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, Long.valueOf(j10));
        }
        return JSONSchema.SUCCESS;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Long l10) {
        boolean z10;
        boolean z11;
        if (l10 == null) {
            return this.typed ? JSONSchema.FAIL_INPUT_NULL : JSONSchema.SUCCESS;
        }
        long jLongValue = l10.longValue();
        long j10 = this.minimum;
        if (j10 != Long.MIN_VALUE && (!(z11 = this.exclusiveMinimum) ? jLongValue < j10 : jLongValue <= j10)) {
            return new ValidateResult(false, z11 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", Long.valueOf(j10), l10);
        }
        long j11 = this.maximum;
        if (j11 != Long.MIN_VALUE && (!(z10 = this.exclusiveMaximum) ? jLongValue > j11 : jLongValue >= j11)) {
            return new ValidateResult(false, z10 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", Long.valueOf(j11), l10);
        }
        long j12 = this.multipleOf;
        if (j12 != 0 && jLongValue % j12 != 0) {
            return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", Long.valueOf(j12), l10);
        }
        Long l11 = this.constValue;
        if (l11 != null && l11.longValue() != jLongValue) {
            return new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, l10);
        }
        return JSONSchema.SUCCESS;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Integer num) {
        boolean z10;
        boolean z11;
        if (num == null) {
            return this.typed ? JSONSchema.FAIL_INPUT_NULL : JSONSchema.SUCCESS;
        }
        long jLongValue = num.longValue();
        long j10 = this.minimum;
        if (j10 != Long.MIN_VALUE && (!(z11 = this.exclusiveMinimum) ? jLongValue < j10 : jLongValue <= j10)) {
            return new ValidateResult(false, z11 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", Long.valueOf(j10), num);
        }
        long j11 = this.maximum;
        if (j11 != Long.MIN_VALUE && (!(z10 = this.exclusiveMaximum) ? jLongValue > j11 : jLongValue >= j11)) {
            return new ValidateResult(false, z10 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", Long.valueOf(j11), num);
        }
        long j12 = this.multipleOf;
        if (j12 != 0 && jLongValue % j12 != 0) {
            return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", Long.valueOf(j12), Long.valueOf(jLongValue));
        }
        Long l10 = this.constValue;
        if (l10 != null && l10.longValue() != jLongValue) {
            return new ValidateResult(false, "const not match, expect %s, but %s", this.constValue, num);
        }
        return JSONSchema.SUCCESS;
    }
}
