package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.AbstractC1843z;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.TypeUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumSchema extends JSONSchema {
    final Set<Object> items;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.math.BigInteger] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Integer] */
    public EnumSchema(Object... objArr) {
        super(null, null);
        this.items = new LinkedHashSet(objArr.length);
        for (Object objM6535a : objArr) {
            if (objM6535a instanceof BigDecimal) {
                objM6535a = AbstractC1843z.m6535a((BigDecimal) objM6535a);
                if (objM6535a.scale() == 0) {
                    objM6535a = objM6535a.toBigInteger();
                    if (objM6535a.compareTo(TypeUtils.BIGINT_INT32_MIN) >= 0 && objM6535a.compareTo(TypeUtils.BIGINT_INT32_MAX) <= 0) {
                        objM6535a = Integer.valueOf(objM6535a.intValue());
                    } else if (objM6535a.compareTo(TypeUtils.BIGINT_INT64_MIN) >= 0 && objM6535a.compareTo(TypeUtils.BIGINT_INT64_MAX) <= 0) {
                        objM6535a = Long.valueOf(objM6535a.longValue());
                    }
                }
            }
            this.items.add(objM6535a);
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public JSONSchema.Type getType() {
        return JSONSchema.Type.Enum;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    public ValidateResult validateInternal(Object obj) {
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            BigDecimal bigDecimalM6535a = AbstractC1843z.m6535a(bigDecimal);
            long jLongValue = bigDecimal.longValue();
            obj = bigDecimal.compareTo(BigDecimal.valueOf(jLongValue)) == 0 ? Long.valueOf(jLongValue) : bigDecimal.scale() == 0 ? bigDecimal.unscaledValue() : bigDecimalM6535a;
        } else if (obj instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) obj;
            if (bigInteger.compareTo(TypeUtils.BIGINT_INT64_MIN) >= 0 && bigInteger.compareTo(TypeUtils.BIGINT_INT64_MAX) <= 0) {
                obj = Long.valueOf(bigInteger.longValue());
            }
        }
        if (obj instanceof Long) {
            long jLongValue2 = ((Long) obj).longValue();
            if (jLongValue2 >= -2147483648L && jLongValue2 <= 2147483647L) {
                obj = Integer.valueOf((int) jLongValue2);
            }
        }
        return !this.items.contains(obj) ? obj == null ? JSONSchema.FAIL_INPUT_NULL : new ValidateResult(false, "expect type %s, but %s", JSONSchema.Type.Enum, obj.getClass()) : JSONSchema.SUCCESS;
    }
}
