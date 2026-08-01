package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C1589;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3646 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f9104;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f9105;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f9106;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Long f9107;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f9108;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f9109;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f9110;

    public C3646(JSONObject jSONObject) {
        super(jSONObject);
        this.f9110 = "integer".equalsIgnoreCase(jSONObject.getString("type")) || jSONObject.getBooleanValue("required");
        Object obj = jSONObject.get("exclusiveMinimum");
        long longValue = jSONObject.getLongValue("minimum", Long.MIN_VALUE);
        Boolean bool = Boolean.TRUE;
        if (obj == bool) {
            this.f9109 = true;
            this.f9108 = longValue;
        } else if (obj instanceof Number) {
            this.f9109 = true;
            this.f9108 = jSONObject.getLongValue("exclusiveMinimum");
        } else {
            this.f9108 = longValue;
            this.f9109 = false;
        }
        long longValue2 = jSONObject.getLongValue("maximum", Long.MIN_VALUE);
        Object obj2 = jSONObject.get("exclusiveMaximum");
        if (obj2 == bool) {
            this.f9104 = true;
            this.f9105 = longValue2;
        } else if (obj2 instanceof Number) {
            this.f9104 = true;
            this.f9105 = jSONObject.getLongValue("exclusiveMaximum");
        } else {
            this.f9104 = false;
            this.f9105 = longValue2;
        }
        this.f9106 = jSONObject.getLongValue("multipleOf", 0L);
        this.f9107 = jSONObject.getLong("const");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
    
        if (r6.longValue() == java.lang.Long.parseLong(r13)) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1589 mo6208(Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = this.f9110;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Long l = this.f9107;
            if (cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) {
                boolean zM6498 = cls == BigInteger.class ? AbstractC3700.m6498((BigInteger) obj) : true;
                long jLongValue = ((Number) obj).longValue();
                long j = this.f9108;
                if (j != Long.MIN_VALUE && (!(z2 = this.f9109) ? jLongValue >= j : jLongValue > j)) {
                    return new C1589(z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{Long.valueOf(j), obj}, false);
                }
                long j2 = this.f9105;
                if (j2 != Long.MIN_VALUE && (!(z = this.f9104) ? jLongValue <= j2 : jLongValue < j2)) {
                    return new C1589(z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{Long.valueOf(j2), obj}, false);
                }
                long j3 = this.f9106;
                if (j3 != 0 && jLongValue % j3 != 0) {
                    return new C1589("multipleOf not match, expect multipleOf %s, but %s", new Object[]{Long.valueOf(j3), obj}, false);
                }
                if (l != null && (l.longValue() != jLongValue || !zM6498)) {
                    return new C1589("const not match, expect %s, but %s", new Object[]{l, obj}, false);
                }
            } else if (obj instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (AbstractC3700.m6496(bigDecimal)) {
                    BigInteger bigInteger = bigDecimal.toBigInteger();
                    if (l != null && (!AbstractC3700.m6498(bigInteger) || l.longValue() != bigInteger.longValue())) {
                        return new C1589("const not match, expect %s, but %s", new Object[]{l, obj}, false);
                    }
                } else {
                    if (l != null) {
                        return new C1589("const not match, expect %s, but %s", new Object[]{l, obj}, false);
                    }
                    if (l != null) {
                        if (obj instanceof Float) {
                            if (l.longValue() != ((Float) obj).floatValue()) {
                                return new C1589("const not match, expect %s, but %s", new Object[]{l, obj}, false);
                            }
                        } else if (obj instanceof Double) {
                            if (l.longValue() != ((Double) obj).doubleValue()) {
                                return new C1589("const not match, expect %s, but %s", new Object[]{l, obj}, false);
                            }
                        } else if (obj instanceof String) {
                            String str = (String) obj;
                            if (AbstractC3700.m6499(str) && str.length() < 21) {
                            }
                            return new C1589("const not match, expect %s, but %s", new Object[]{l, obj}, false);
                        }
                    }
                    if (z3) {
                        return new C1589("expect type %s, but %s", new Object[]{JSONSchema.Type.Integer, cls}, false);
                    }
                }
            } else {
                if (l != null) {
                }
                if (z3) {
                }
            }
        } else if (z3) {
            return JSONSchema.f9027;
        }
        return JSONSchema.f9028;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final C1589 mo6209(Integer num) {
        boolean z;
        boolean z2;
        if (num != null) {
            long jLongValue = num.longValue();
            long j = this.f9108;
            if (j != Long.MIN_VALUE && (!(z2 = this.f9109) ? jLongValue >= j : jLongValue > j)) {
                return new C1589(z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{Long.valueOf(j), num}, false);
            }
            long j2 = this.f9105;
            if (j2 != Long.MIN_VALUE && (!(z = this.f9104) ? jLongValue <= j2 : jLongValue < j2)) {
                return new C1589(z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{Long.valueOf(j2), num}, false);
            }
            long j3 = this.f9106;
            if (j3 != 0 && jLongValue % j3 != 0) {
                return new C1589("multipleOf not match, expect multipleOf %s, but %s", new Object[]{Long.valueOf(j3), Long.valueOf(jLongValue)}, false);
            }
            Long l = this.f9107;
            if (l != null && l.longValue() != jLongValue) {
                return new C1589("const not match, expect %s, but %s", new Object[]{l, num}, false);
            }
        } else if (this.f9110) {
            return JSONSchema.f9027;
        }
        return JSONSchema.f9028;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final C1589 mo6210(Long l) {
        boolean z;
        boolean z2;
        if (l != null) {
            long jLongValue = l.longValue();
            long j = this.f9108;
            if (j != Long.MIN_VALUE && (!(z2 = this.f9109) ? jLongValue >= j : jLongValue > j)) {
                return new C1589(z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{Long.valueOf(j), l}, false);
            }
            long j2 = this.f9105;
            if (j2 != Long.MIN_VALUE && (!(z = this.f9104) ? jLongValue <= j2 : jLongValue < j2)) {
                return new C1589(z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{Long.valueOf(j2), l}, false);
            }
            long j3 = this.f9106;
            if (j3 != 0 && jLongValue % j3 != 0) {
                return new C1589("multipleOf not match, expect multipleOf %s, but %s", new Object[]{Long.valueOf(j3), l}, false);
            }
            Long l2 = this.f9107;
            if (l2 != null && l2.longValue() != jLongValue) {
                return new C1589("const not match, expect %s, but %s", new Object[]{l2, l}, false);
            }
        } else if (this.f9110) {
            return JSONSchema.f9027;
        }
        return JSONSchema.f9028;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final C1589 mo6212(long j) {
        boolean z;
        boolean z2;
        long j2 = this.f9108;
        if (j2 != Long.MIN_VALUE && (!(z2 = this.f9109) ? j >= j2 : j > j2)) {
            return new C1589(z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{Long.valueOf(j2), Long.valueOf(j)}, false);
        }
        long j3 = this.f9105;
        if (j3 != Long.MIN_VALUE && (!(z = this.f9104) ? j <= j3 : j < j3)) {
            return new C1589(z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{Long.valueOf(j3), Long.valueOf(j)}, false);
        }
        long j4 = this.f9106;
        if (j4 != 0 && j % j4 != 0) {
            return new C1589("multipleOf not match, expect multipleOf %s, but %s", new Object[]{Long.valueOf(j4), Long.valueOf(j)}, false);
        }
        Long l = this.f9107;
        return (l == null || l.longValue() == j) ? JSONSchema.f9028 : new C1589("const not match, expect %s, but %s", new Object[]{l, Long.valueOf(j)}, false);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo6213() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "integer");
        long j = this.f9108;
        if (j != Long.MIN_VALUE) {
            jSONObject.put(this.f9109 ? "exclusiveMinimum" : "minimum", Long.valueOf(j));
        }
        long j2 = this.f9105;
        if (j2 != Long.MIN_VALUE) {
            jSONObject.put(this.f9104 ? "exclusiveMaximum" : "maximum", Long.valueOf(j2));
        }
        long j3 = this.f9106;
        if (j3 != 0) {
            jSONObject.put("multipleOf", Long.valueOf(j3));
        }
        Long l = this.f9107;
        if (l != null) {
            jSONObject.put("const", l);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo6217() {
        return JSONSchema.Type.Integer;
    }
}
