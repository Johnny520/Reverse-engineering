package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class NumberSchema extends JSONSchema {
    final boolean exclusiveMaximum;
    final boolean exclusiveMinimum;
    final BigDecimal maximum;
    final long maximumLongValue;
    final BigDecimal minimum;
    final long minimumLongValue;
    final BigDecimal multipleOf;
    final long multipleOfLongValue;
    final boolean typed;

    public NumberSchema(JSONObject jSONObject) {
        super(jSONObject);
        this.typed = "number".equals(jSONObject.get("type"));
        Object obj = jSONObject.get("exclusiveMinimum");
        BigDecimal bigDecimal = jSONObject.getBigDecimal("minimum");
        Boolean bool = Boolean.TRUE;
        if (obj == bool) {
            this.minimum = bigDecimal;
            this.exclusiveMinimum = true;
        } else if (obj instanceof Number) {
            this.minimum = jSONObject.getBigDecimal("exclusiveMinimum");
            this.exclusiveMinimum = true;
        } else {
            this.minimum = bigDecimal;
            this.exclusiveMinimum = false;
        }
        BigDecimal bigDecimal2 = this.minimum;
        if (bigDecimal2 == null || bigDecimal2.compareTo(BigDecimal.valueOf(bigDecimal2.longValue())) != 0) {
            this.minimumLongValue = Long.MIN_VALUE;
        } else {
            this.minimumLongValue = this.minimum.longValue();
        }
        BigDecimal bigDecimal3 = jSONObject.getBigDecimal("maximum");
        Object obj2 = jSONObject.get("exclusiveMaximum");
        if (obj2 == bool) {
            this.maximum = bigDecimal3;
            this.exclusiveMaximum = true;
        } else if (obj2 instanceof Number) {
            this.maximum = jSONObject.getBigDecimal("exclusiveMaximum");
            this.exclusiveMaximum = true;
        } else {
            this.maximum = bigDecimal3;
            this.exclusiveMaximum = false;
        }
        BigDecimal bigDecimal4 = this.maximum;
        if (bigDecimal4 == null || bigDecimal4.compareTo(BigDecimal.valueOf(bigDecimal4.longValue())) != 0) {
            this.maximumLongValue = Long.MIN_VALUE;
        } else {
            this.maximumLongValue = this.maximum.longValue();
        }
        BigDecimal bigDecimal5 = jSONObject.getBigDecimal("multipleOf");
        this.multipleOf = bigDecimal5;
        if (bigDecimal5 == null) {
            this.multipleOfLongValue = Long.MIN_VALUE;
            return;
        }
        long jLongValue = bigDecimal5.longValue();
        if (bigDecimal5.compareTo(BigDecimal.valueOf(jLongValue)) == 0) {
            this.multipleOfLongValue = jLongValue;
        } else {
            this.multipleOfLongValue = Long.MIN_VALUE;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Number;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONObject toJSONObject() {
        JSONObject jSONObjectM6194of = JSONObject.m6194of("type", (Object) "number");
        long j10 = this.minimumLongValue;
        if (j10 != Long.MIN_VALUE) {
            jSONObjectM6194of.put(this.exclusiveMinimum ? "exclusiveMinimum" : "minimum", Long.valueOf(j10));
        } else {
            BigDecimal bigDecimal = this.minimum;
            if (bigDecimal != null) {
                jSONObjectM6194of.put(this.exclusiveMinimum ? "exclusiveMinimum" : "minimum", bigDecimal);
            }
        }
        long j11 = this.maximumLongValue;
        if (j11 != Long.MIN_VALUE) {
            jSONObjectM6194of.put(this.exclusiveMaximum ? "exclusiveMaximum" : "maximum", Long.valueOf(j11));
        } else {
            BigDecimal bigDecimal2 = this.maximum;
            if (bigDecimal2 != null) {
                jSONObjectM6194of.put(this.exclusiveMaximum ? "exclusiveMaximum" : "maximum", bigDecimal2);
            }
        }
        long j12 = this.multipleOfLongValue;
        if (j12 != Long.MIN_VALUE) {
            jSONObjectM6194of.put("multipleOf", Long.valueOf(j12));
            return jSONObjectM6194of;
        }
        BigDecimal bigDecimal3 = this.multipleOf;
        if (bigDecimal3 != null) {
            jSONObjectM6194of.put("multipleOf", bigDecimal3);
        }
        return jSONObjectM6194of;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (r7 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r8 = "exclusiveMaximum not match, expect < %s, but %s";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        return new com.alibaba.fastjson2.schema.ValidateResult(false, r8, r4, java.lang.Long.valueOf(r11));
     */
    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alibaba.fastjson2.schema.ValidateResult validateInternal(long r11) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.schema.NumberSchema.validateInternal(long):com.alibaba.fastjson2.schema.ValidateResult");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Integer num) {
        if (num == null) {
            return JSONSchema.SUCCESS;
        }
        return validate(num.longValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Float f10) {
        if (f10 == null) {
            return JSONSchema.SUCCESS;
        }
        return validate(f10.doubleValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Double d10) {
        if (d10 == null) {
            return JSONSchema.SUCCESS;
        }
        return validate(d10.doubleValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Long l10) {
        if (l10 == null) {
            return JSONSchema.SUCCESS;
        }
        return validate(l10.longValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0086, code lost:
    
        if (r4.exclusiveMaximum == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0088, code lost:
    
        r1 = "exclusiveMaximum not match, expect < %s, but %s";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008b, code lost:
    
        r1 = "maximum not match, expect <= %s, but %s";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0096, code lost:
    
        return new com.alibaba.fastjson2.schema.ValidateResult(false, r1, r4.maximum, r5);
     */
    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alibaba.fastjson2.schema.ValidateResult validateInternal(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.schema.NumberSchema.validateInternal(java.lang.Object):com.alibaba.fastjson2.schema.ValidateResult");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(double d10) {
        BigDecimal bigDecimal = this.minimum;
        if (bigDecimal != null) {
            long j10 = this.minimumLongValue;
            if (j10 != Long.MIN_VALUE) {
                boolean z10 = this.exclusiveMinimum;
                double d11 = j10;
                if (!z10 ? d10 < d11 : d10 <= d11) {
                    return new ValidateResult(false, z10 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", bigDecimal, Double.valueOf(d10));
                }
            } else {
                double dDoubleValue = bigDecimal.doubleValue();
                boolean z11 = this.exclusiveMinimum;
                if (!z11 ? d10 < dDoubleValue : d10 <= dDoubleValue) {
                    return new ValidateResult(false, z11 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", this.minimum, Double.valueOf(d10));
                }
            }
        }
        BigDecimal bigDecimal2 = this.maximum;
        if (bigDecimal2 != null) {
            long j11 = this.maximumLongValue;
            if (j11 != Long.MIN_VALUE) {
                boolean z12 = this.exclusiveMaximum;
                double d12 = j11;
                if (!z12 ? d10 > d12 : d10 >= d12) {
                    return new ValidateResult(false, z12 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", bigDecimal2, Double.valueOf(d10));
                }
            } else {
                double dDoubleValue2 = bigDecimal2.doubleValue();
                boolean z13 = this.exclusiveMaximum;
                if (!z13 ? d10 > dDoubleValue2 : d10 >= dDoubleValue2) {
                    return new ValidateResult(false, z13 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", this.maximum, Double.valueOf(d10));
                }
            }
        }
        BigDecimal bigDecimal3 = this.multipleOf;
        if (bigDecimal3 != null) {
            long j12 = this.multipleOfLongValue;
            if (j12 != Long.MIN_VALUE && d10 % j12 != 0.0d) {
                return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", bigDecimal3, Double.valueOf(d10));
            }
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d10);
            if (bigDecimalValueOf.divideAndRemainder(this.multipleOf)[1].abs().compareTo(BigDecimal.ZERO) > 0) {
                return new ValidateResult(false, "multipleOf not match, expect multipleOf %s, but %s", this.multipleOf, bigDecimalValueOf);
            }
        }
        return JSONSchema.SUCCESS;
    }
}
