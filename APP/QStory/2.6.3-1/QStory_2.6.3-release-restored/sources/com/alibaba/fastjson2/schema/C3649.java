package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C1589;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3649 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f9112;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final BigDecimal f9113;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long f9114;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean f9115;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f9116;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final BigDecimal f9117;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f9118;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f9119;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final BigDecimal f9120;

    public C3649(JSONObject jSONObject) {
        super(jSONObject);
        this.f9115 = "number".equals(jSONObject.get("type"));
        Object obj = jSONObject.get("exclusiveMinimum");
        BigDecimal bigDecimal = jSONObject.getBigDecimal("minimum");
        Boolean bool = Boolean.TRUE;
        if (obj == bool) {
            this.f9120 = bigDecimal;
            this.f9119 = true;
        } else if (obj instanceof Number) {
            this.f9120 = jSONObject.getBigDecimal("exclusiveMinimum");
            this.f9119 = true;
        } else {
            this.f9120 = bigDecimal;
            this.f9119 = false;
        }
        BigDecimal bigDecimal2 = this.f9120;
        if (bigDecimal2 == null || bigDecimal2.compareTo(BigDecimal.valueOf(bigDecimal2.longValue())) != 0) {
            this.f9118 = Long.MIN_VALUE;
        } else {
            this.f9118 = this.f9120.longValue();
        }
        BigDecimal bigDecimal3 = jSONObject.getBigDecimal("maximum");
        Object obj2 = jSONObject.get("exclusiveMaximum");
        if (obj2 == bool) {
            this.f9113 = bigDecimal3;
            this.f9116 = true;
        } else if (obj2 instanceof Number) {
            this.f9113 = jSONObject.getBigDecimal("exclusiveMaximum");
            this.f9116 = true;
        } else {
            this.f9113 = bigDecimal3;
            this.f9116 = false;
        }
        BigDecimal bigDecimal4 = this.f9113;
        if (bigDecimal4 == null || bigDecimal4.compareTo(BigDecimal.valueOf(bigDecimal4.longValue())) != 0) {
            this.f9112 = Long.MIN_VALUE;
        } else {
            this.f9112 = this.f9113.longValue();
        }
        BigDecimal bigDecimal5 = jSONObject.getBigDecimal("multipleOf");
        this.f9117 = bigDecimal5;
        if (bigDecimal5 == null) {
            this.f9114 = Long.MIN_VALUE;
            return;
        }
        long jLongValue = bigDecimal5.longValue();
        if (bigDecimal5.compareTo(BigDecimal.valueOf(jLongValue)) == 0) {
            this.f9114 = jLongValue;
        } else {
            this.f9114 = Long.MIN_VALUE;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final C1589 mo6206(Float f) {
        return f == null ? JSONSchema.f9028 : mo6211(f.doubleValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final C1589 mo6207(Double d) {
        return d == null ? JSONSchema.f9028 : mo6211(d.doubleValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C1589 mo6208(Object obj) {
        BigDecimal bigDecimal;
        boolean z;
        boolean z2;
        boolean z3 = this.f9115;
        if (obj == null) {
            if (z3) {
                return JSONSchema.f9027;
            }
        } else if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
                return mo6212(number.longValue());
            }
            if ((number instanceof Float) || (number instanceof Double)) {
                return mo6211(number.doubleValue());
            }
            if (number instanceof BigInteger) {
                bigDecimal = new BigDecimal((BigInteger) number);
            } else {
                if (!(number instanceof BigDecimal)) {
                    return new C1589("expect type %s, but %s", new Object[]{JSONSchema.Type.Number, obj.getClass()}, false);
                }
                bigDecimal = (BigDecimal) number;
            }
            BigDecimal bigDecimal2 = this.f9120;
            if (bigDecimal2 != null && (!(z2 = this.f9119) ? bigDecimal2.compareTo(bigDecimal) <= 0 : bigDecimal2.compareTo(bigDecimal) < 0)) {
                return new C1589(z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{bigDecimal2, obj}, false);
            }
            BigDecimal bigDecimal3 = this.f9113;
            if (bigDecimal3 != null && (!(z = this.f9116) ? bigDecimal3.compareTo(bigDecimal) >= 0 : bigDecimal3.compareTo(bigDecimal) > 0)) {
                return new C1589(z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{bigDecimal3, obj}, false);
            }
            BigDecimal bigDecimal4 = this.f9117;
            if (bigDecimal4 != null && bigDecimal.divideAndRemainder(bigDecimal4)[1].abs().compareTo(BigDecimal.ZERO) > 0) {
                return new C1589("multipleOf not match, expect multipleOf %s, but %s", new Object[]{bigDecimal4, bigDecimal}, false);
            }
        } else if (z3) {
            return JSONSchema.f9036;
        }
        return JSONSchema.f9028;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final C1589 mo6209(Integer num) {
        return num == null ? JSONSchema.f9028 : mo6212(num.longValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final C1589 mo6210(Long l) {
        return l == null ? JSONSchema.f9028 : mo6212(l.longValue());
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C1589 mo6211(double d) {
        BigDecimal bigDecimal = this.f9120;
        if (bigDecimal != null) {
            long j = this.f9118;
            boolean z = this.f9119;
            if (j != Long.MIN_VALUE) {
                double d2 = j;
                if (!z ? d < d2 : d <= d2) {
                    return new C1589(z ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{bigDecimal, Double.valueOf(d)}, false);
                }
            } else {
                double dDoubleValue = bigDecimal.doubleValue();
                if (!z ? d < dDoubleValue : d <= dDoubleValue) {
                    return new C1589(z ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{bigDecimal, Double.valueOf(d)}, false);
                }
            }
        }
        BigDecimal bigDecimal2 = this.f9113;
        if (bigDecimal2 != null) {
            long j2 = this.f9112;
            boolean z2 = this.f9116;
            if (j2 != Long.MIN_VALUE) {
                double d3 = j2;
                if (!z2 ? d > d3 : d >= d3) {
                    return new C1589(z2 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{bigDecimal2, Double.valueOf(d)}, false);
                }
            } else {
                double dDoubleValue2 = bigDecimal2.doubleValue();
                if (!z2 ? d > dDoubleValue2 : d >= dDoubleValue2) {
                    return new C1589(z2 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{bigDecimal2, Double.valueOf(d)}, false);
                }
            }
        }
        BigDecimal bigDecimal3 = this.f9117;
        if (bigDecimal3 != null) {
            long j3 = this.f9114;
            if (j3 != Long.MIN_VALUE && d % j3 != 0.0d) {
                return new C1589("multipleOf not match, expect multipleOf %s, but %s", new Object[]{bigDecimal3, Double.valueOf(d)}, false);
            }
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d);
            if (bigDecimalValueOf.divideAndRemainder(bigDecimal3)[1].abs().compareTo(BigDecimal.ZERO) > 0) {
                return new C1589("multipleOf not match, expect multipleOf %s, but %s", new Object[]{bigDecimal3, bigDecimalValueOf}, false);
            }
        }
        return JSONSchema.f9028;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        if (r10 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        r8 = "exclusiveMaximum not match, expect < %s, but %s";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007b, code lost:
    
        return new androidx.compose.foundation.lazy.C1589(r8, new java.lang.Object[]{r3, java.lang.Long.valueOf(r12)}, false);
     */
    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1589 mo6212(long j) {
        BigDecimal bigDecimalValueOf;
        String str;
        BigDecimal bigDecimal = this.f9120;
        if (bigDecimal != null) {
            long j2 = this.f9118;
            boolean z = this.f9119;
            if (j2 != Long.MIN_VALUE) {
                if (!z ? j < j2 : j <= j2) {
                    return new C1589(z ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{bigDecimal, Long.valueOf(j)}, false);
                }
                bigDecimalValueOf = null;
            } else {
                bigDecimalValueOf = BigDecimal.valueOf(j);
                if (!z ? bigDecimal.compareTo(bigDecimalValueOf) > 0 : bigDecimal.compareTo(bigDecimalValueOf) >= 0) {
                    return new C1589(z ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{bigDecimal, Long.valueOf(j)}, false);
                }
            }
        } else {
            bigDecimalValueOf = null;
        }
        BigDecimal bigDecimal2 = this.f9113;
        if (bigDecimal2 != null) {
            long j3 = this.f9112;
            str = "maximum not match, expect <= %s, but %s";
            boolean z2 = this.f9116;
            if (j3 == Long.MIN_VALUE) {
                if (bigDecimalValueOf == null) {
                    bigDecimalValueOf = BigDecimal.valueOf(j);
                }
                if (!z2 ? bigDecimal2.compareTo(bigDecimalValueOf) < 0 : bigDecimal2.compareTo(bigDecimalValueOf) <= 0) {
                    return new C1589(z2 ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{bigDecimal2, Long.valueOf(j)}, false);
                }
            } else if (z2) {
            }
        }
        BigDecimal bigDecimal3 = this.f9117;
        if (bigDecimal3 != null) {
            long j4 = this.f9114;
            if (j4 != Long.MIN_VALUE && j % j4 != 0) {
                return new C1589("multipleOf not match, expect multipleOf %s, but %s", new Object[]{bigDecimal3, bigDecimalValueOf}, false);
            }
            if (bigDecimalValueOf == null) {
                bigDecimalValueOf = BigDecimal.valueOf(j);
            }
            if (bigDecimalValueOf.divideAndRemainder(bigDecimal3)[1].abs().compareTo(BigDecimal.ZERO) > 0) {
                return new C1589("multipleOf not match, expect multipleOf %s, but %s", new Object[]{bigDecimal3, Long.valueOf(j)}, false);
            }
        }
        return JSONSchema.f9028;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo6213() {
        JSONObject jSONObjectM9of = JSONObject.m9of("type", (Object) "number");
        long j = this.f9118;
        boolean z = this.f9119;
        if (j != Long.MIN_VALUE) {
            jSONObjectM9of.put(z ? "exclusiveMinimum" : "minimum", Long.valueOf(j));
        } else {
            BigDecimal bigDecimal = this.f9120;
            if (bigDecimal != null) {
                jSONObjectM9of.put(z ? "exclusiveMinimum" : "minimum", bigDecimal);
            }
        }
        long j2 = this.f9112;
        boolean z2 = this.f9116;
        if (j2 != Long.MIN_VALUE) {
            jSONObjectM9of.put(z2 ? "exclusiveMaximum" : "maximum", Long.valueOf(j2));
        } else {
            BigDecimal bigDecimal2 = this.f9113;
            if (bigDecimal2 != null) {
                jSONObjectM9of.put(z2 ? "exclusiveMaximum" : "maximum", bigDecimal2);
            }
        }
        long j3 = this.f9114;
        if (j3 != Long.MIN_VALUE) {
            jSONObjectM9of.put("multipleOf", Long.valueOf(j3));
            return jSONObjectM9of;
        }
        BigDecimal bigDecimal3 = this.f9117;
        if (bigDecimal3 != null) {
            jSONObjectM9of.put("multipleOf", bigDecimal3);
        }
        return jSONObjectM9of;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo6217() {
        return JSONSchema.Type.Number;
    }
}
