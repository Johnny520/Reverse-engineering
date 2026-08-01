package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2813 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f8759;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long f8760;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f8761;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Long f8762;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f8763;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f8764;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f8765;

    public C2813(JSONObject jSONObject) {
        super(jSONObject);
        this.f8765 = "integer".equalsIgnoreCase(jSONObject.getString("type")) || jSONObject.getBooleanValue("required");
        Object obj = jSONObject.get("exclusiveMinimum");
        long longValue = jSONObject.getLongValue("minimum", Long.MIN_VALUE);
        Boolean bool = Boolean.TRUE;
        if (obj == bool) {
            this.f8764 = true;
            this.f8763 = longValue;
        } else if (obj instanceof Number) {
            this.f8764 = true;
            this.f8763 = jSONObject.getLongValue("exclusiveMinimum");
        } else {
            this.f8763 = longValue;
            this.f8764 = false;
        }
        long longValue2 = jSONObject.getLongValue("maximum", Long.MIN_VALUE);
        Object obj2 = jSONObject.get("exclusiveMaximum");
        if (obj2 == bool) {
            this.f8759 = true;
            this.f8760 = longValue2;
        } else if (obj2 instanceof Number) {
            this.f8759 = true;
            this.f8760 = jSONObject.getLongValue("exclusiveMaximum");
        } else {
            this.f8759 = false;
            this.f8760 = longValue2;
        }
        this.f8761 = jSONObject.getLongValue("multipleOf", 0L);
        this.f8762 = jSONObject.getLong("const");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.C0748 mo5648(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.schema.C2813.mo5648(java.lang.Object):androidx.compose.foundation.lazy.飘花落叶言子楪兰世哲苏");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final C0748 mo5649(Integer num) {
        boolean z;
        boolean z2;
        if (num != null) {
            long jLongValue = num.longValue();
            long j = this.f8763;
            if (j != Long.MIN_VALUE && (!(z2 = this.f8764) ? jLongValue >= j : jLongValue > j)) {
                return new C0748(z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{Long.valueOf(j), num}, false);
            }
            long j2 = this.f8760;
            if (j2 != Long.MIN_VALUE && (!(z = this.f8759) ? jLongValue <= j2 : jLongValue < j2)) {
                return new C0748(z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{Long.valueOf(j2), num}, false);
            }
            long j3 = this.f8761;
            if (j3 != 0 && jLongValue % j3 != 0) {
                return new C0748("multipleOf not match, expect multipleOf %s, but %s", new Object[]{Long.valueOf(j3), Long.valueOf(jLongValue)}, false);
            }
            Long l = this.f8762;
            if (l != null && l.longValue() != jLongValue) {
                return new C0748("const not match, expect %s, but %s", new Object[]{l, num}, false);
            }
        } else if (this.f8765) {
            return JSONSchema.f8682;
        }
        return JSONSchema.f8683;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final C0748 mo5650(Long l) {
        boolean z;
        boolean z2;
        if (l != null) {
            long jLongValue = l.longValue();
            long j = this.f8763;
            if (j != Long.MIN_VALUE && (!(z2 = this.f8764) ? jLongValue >= j : jLongValue > j)) {
                return new C0748(z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{Long.valueOf(j), l}, false);
            }
            long j2 = this.f8760;
            if (j2 != Long.MIN_VALUE && (!(z = this.f8759) ? jLongValue <= j2 : jLongValue < j2)) {
                return new C0748(z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{Long.valueOf(j2), l}, false);
            }
            long j3 = this.f8761;
            if (j3 != 0 && jLongValue % j3 != 0) {
                return new C0748("multipleOf not match, expect multipleOf %s, but %s", new Object[]{Long.valueOf(j3), l}, false);
            }
            Long l2 = this.f8762;
            if (l2 != null && l2.longValue() != jLongValue) {
                return new C0748("const not match, expect %s, but %s", new Object[]{l2, l}, false);
            }
        } else if (this.f8765) {
            return JSONSchema.f8682;
        }
        return JSONSchema.f8683;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final C0748 mo5652(long j) {
        boolean z;
        boolean z2;
        long j2 = this.f8763;
        if (j2 != Long.MIN_VALUE && (!(z2 = this.f8764) ? j >= j2 : j > j2)) {
            return new C0748(z2 ? "exclusiveMinimum not match, expect > %s, but %s" : "minimum not match, expect >= %s, but %s", new Object[]{Long.valueOf(j2), Long.valueOf(j)}, false);
        }
        long j3 = this.f8760;
        if (j3 != Long.MIN_VALUE && (!(z = this.f8759) ? j <= j3 : j < j3)) {
            return new C0748(z ? "exclusiveMaximum not match, expect < %s, but %s" : "maximum not match, expect <= %s, but %s", new Object[]{Long.valueOf(j3), Long.valueOf(j)}, false);
        }
        long j4 = this.f8761;
        if (j4 != 0 && j % j4 != 0) {
            return new C0748("multipleOf not match, expect multipleOf %s, but %s", new Object[]{Long.valueOf(j4), Long.valueOf(j)}, false);
        }
        Long l = this.f8762;
        return (l == null || l.longValue() == j) ? JSONSchema.f8683 : new C0748("const not match, expect %s, but %s", new Object[]{l, Long.valueOf(j)}, false);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo5653() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "integer");
        long j = this.f8763;
        if (j != Long.MIN_VALUE) {
            jSONObject.put(this.f8764 ? "exclusiveMinimum" : "minimum", Long.valueOf(j));
        }
        long j2 = this.f8760;
        if (j2 != Long.MIN_VALUE) {
            jSONObject.put(this.f8759 ? "exclusiveMaximum" : "maximum", Long.valueOf(j2));
        }
        long j3 = this.f8761;
        if (j3 != 0) {
            jSONObject.put("multipleOf", Long.valueOf(j3));
        }
        Long l = this.f8762;
        if (l != null) {
            jSONObject.put("const", l);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5657() {
        return JSONSchema.Type.Integer;
    }
}
