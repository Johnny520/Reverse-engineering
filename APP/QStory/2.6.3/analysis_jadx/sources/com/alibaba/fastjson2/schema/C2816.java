package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2816 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f8767;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final BigDecimal f8768;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long f8769;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f8770;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f8771;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final BigDecimal f8772;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f8773;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f8774;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final BigDecimal f8775;

    public C2816(JSONObject jSONObject) {
        super(jSONObject);
        this.f8770 = "number".equals(jSONObject.get("type"));
        Object obj = jSONObject.get("exclusiveMinimum");
        BigDecimal bigDecimal = jSONObject.getBigDecimal("minimum");
        Boolean bool = Boolean.TRUE;
        if (obj == bool) {
            this.f8775 = bigDecimal;
            this.f8774 = true;
        } else if (obj instanceof Number) {
            this.f8775 = jSONObject.getBigDecimal("exclusiveMinimum");
            this.f8774 = true;
        } else {
            this.f8775 = bigDecimal;
            this.f8774 = false;
        }
        BigDecimal bigDecimal2 = this.f8775;
        if (bigDecimal2 == null || bigDecimal2.compareTo(BigDecimal.valueOf(bigDecimal2.longValue())) != 0) {
            this.f8773 = Long.MIN_VALUE;
        } else {
            this.f8773 = this.f8775.longValue();
        }
        BigDecimal bigDecimal3 = jSONObject.getBigDecimal("maximum");
        Object obj2 = jSONObject.get("exclusiveMaximum");
        if (obj2 == bool) {
            this.f8768 = bigDecimal3;
            this.f8771 = true;
        } else if (obj2 instanceof Number) {
            this.f8768 = jSONObject.getBigDecimal("exclusiveMaximum");
            this.f8771 = true;
        } else {
            this.f8768 = bigDecimal3;
            this.f8771 = false;
        }
        BigDecimal bigDecimal4 = this.f8768;
        if (bigDecimal4 == null || bigDecimal4.compareTo(BigDecimal.valueOf(bigDecimal4.longValue())) != 0) {
            this.f8767 = Long.MIN_VALUE;
        } else {
            this.f8767 = this.f8768.longValue();
        }
        BigDecimal bigDecimal5 = jSONObject.getBigDecimal("multipleOf");
        this.f8772 = bigDecimal5;
        if (bigDecimal5 == null) {
            this.f8769 = Long.MIN_VALUE;
            return;
        }
        long jLongValue = bigDecimal5.longValue();
        if (bigDecimal5.compareTo(BigDecimal.valueOf(jLongValue)) == 0) {
            this.f8769 = jLongValue;
        } else {
            this.f8769 = Long.MIN_VALUE;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final C0748 mo5646(Float f) {
        return f == null ? JSONSchema.f8683 : mo5651(f.doubleValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final C0748 mo5647(Double d) {
        return d == null ? JSONSchema.f8683 : mo5651(d.doubleValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5648(Object obj) {
        BigDecimal bigDecimal;
        boolean z;
        boolean z2;
        boolean z3 = this.f8770;
        if (obj == null) {
            if (z3) {
                return JSONSchema.f8682;
            }
        } else if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
                return mo5652(number.longValue());
            }
            if ((number instanceof Float) || (number instanceof Double)) {
                return mo5651(number.doubleValue());
            }
            if (number instanceof BigInteger) {
                bigDecimal = new BigDecimal((BigInteger) number);
            } else {
                if (!(number instanceof BigDecimal)) {
                    return new C0748("expect type %s, but %s", new Object[]{JSONSchema.Type.Number, obj.getClass()}, false);
                }
                bigDecimal = (BigDecimal) number;
            }
            BigDecimal bigDecimal2 = this.f8775;
            if (bigDecimal2 != null && (!(z2 = this.f8774) ? bigDecimal2.compareTo(bigDecimal) <= 0 : bigDecimal2.compareTo(bigDecimal) < 0)) {
                return new C0748(z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{bigDecimal2, obj}, false);
            }
            BigDecimal bigDecimal3 = this.f8768;
            if (bigDecimal3 != null && (!(z = this.f8771) ? bigDecimal3.compareTo(bigDecimal) >= 0 : bigDecimal3.compareTo(bigDecimal) > 0)) {
                return new C0748(z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{bigDecimal3, obj}, false);
            }
            BigDecimal bigDecimal4 = this.f8772;
            if (bigDecimal4 != null && bigDecimal.divideAndRemainder(bigDecimal4)[1].abs().compareTo(BigDecimal.ZERO) > 0) {
                return new C0748("multipleOf not match, expect multipleOf %s, but %s", new Object[]{bigDecimal4, bigDecimal}, false);
            }
        } else if (z3) {
            return JSONSchema.f8691;
        }
        return JSONSchema.f8683;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final C0748 mo5649(Integer num) {
        return num == null ? JSONSchema.f8683 : mo5652(num.longValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final C0748 mo5650(Long l) {
        return l == null ? JSONSchema.f8683 : mo5652(l.longValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C0748 mo5651(double d) {
        BigDecimal bigDecimal = this.f8775;
        if (bigDecimal != null) {
            long j = this.f8773;
            boolean z = this.f8774;
            if (j != Long.MIN_VALUE) {
                double d2 = j;
                if (!z ? d < d2 : d <= d2) {
                    return new C0748(z ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{bigDecimal, Double.valueOf(d)}, false);
                }
            } else {
                double dDoubleValue = bigDecimal.doubleValue();
                if (!z ? d < dDoubleValue : d <= dDoubleValue) {
                    return new C0748(z ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{bigDecimal, Double.valueOf(d)}, false);
                }
            }
        }
        BigDecimal bigDecimal2 = this.f8768;
        if (bigDecimal2 != null) {
            long j2 = this.f8767;
            boolean z2 = this.f8771;
            if (j2 != Long.MIN_VALUE) {
                double d3 = j2;
                if (!z2 ? d > d3 : d >= d3) {
                    return new C0748(z2 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{bigDecimal2, Double.valueOf(d)}, false);
                }
            } else {
                double dDoubleValue2 = bigDecimal2.doubleValue();
                if (!z2 ? d > dDoubleValue2 : d >= dDoubleValue2) {
                    return new C0748(z2 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{bigDecimal2, Double.valueOf(d)}, false);
                }
            }
        }
        BigDecimal bigDecimal3 = this.f8772;
        if (bigDecimal3 != null) {
            long j3 = this.f8769;
            if (j3 != Long.MIN_VALUE && d % j3 != 0.0d) {
                return new C0748("multipleOf not match, expect multipleOf %s, but %s", new Object[]{bigDecimal3, Double.valueOf(d)}, false);
            }
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
            if (bigDecimalValueOf.divideAndRemainder(bigDecimal3)[1].abs().compareTo(BigDecimal.ZERO) > 0) {
                return new C0748("multipleOf not match, expect multipleOf %s, but %s", new Object[]{bigDecimal3, bigDecimalValueOf}, false);
            }
        }
        return JSONSchema.f8683;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        if (r10 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        r8 = "exclusiveMaximum not match, expect < %s, but %s";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        return new androidx.compose.foundation.lazy.C0748(r8, new java.lang.Object[]{r3, java.lang.Long.valueOf(r12)}, false);
     */
    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.C0748 mo5652(long r12) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.schema.C2816.mo5652(long):androidx.compose.foundation.lazy.飘花落叶言子楪兰世哲苏");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo5653() {
        JSONObject jSONObjectOf = JSONObject.of("type", (Object) "number");
        long j = this.f8773;
        boolean z = this.f8774;
        if (j != Long.MIN_VALUE) {
            jSONObjectOf.put(z ? "exclusiveMinimum" : "minimum", Long.valueOf(j));
        } else {
            BigDecimal bigDecimal = this.f8775;
            if (bigDecimal != null) {
                jSONObjectOf.put(z ? "exclusiveMinimum" : "minimum", bigDecimal);
            }
        }
        long j2 = this.f8767;
        boolean z2 = this.f8771;
        if (j2 != Long.MIN_VALUE) {
            jSONObjectOf.put(z2 ? "exclusiveMaximum" : "maximum", Long.valueOf(j2));
        } else {
            BigDecimal bigDecimal2 = this.f8768;
            if (bigDecimal2 != null) {
                jSONObjectOf.put(z2 ? "exclusiveMaximum" : "maximum", bigDecimal2);
            }
        }
        long j3 = this.f8769;
        if (j3 != Long.MIN_VALUE) {
            jSONObjectOf.put("multipleOf", Long.valueOf(j3));
            return jSONObjectOf;
        }
        BigDecimal bigDecimal3 = this.f8772;
        if (bigDecimal3 != null) {
            jSONObjectOf.put("multipleOf", bigDecimal3);
        }
        return jSONObjectOf;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5657() {
        return JSONSchema.Type.Number;
    }
}
