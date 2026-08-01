package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import bsh.C2669;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2803 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2804 f8695;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C2806 f8696;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f8697;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f8698;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f8699;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final JSONSchema f8700;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean f8701;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C2808 f8702;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f8703;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f8704;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f8705;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final JSONSchema f8706;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final JSONSchema f8707;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final JSONSchema[] f8708;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashMap f8709;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f8710;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedHashMap f8711;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2803(com.alibaba.fastjson2.JSONObject r10, com.alibaba.fastjson2.schema.JSONSchema r11) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.schema.C2803.<init>(com.alibaba.fastjson2.JSONObject, com.alibaba.fastjson2.schema.JSONSchema):void");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5603(Object obj) throws IOException {
        boolean z = this.f8710;
        if (obj != null) {
            if (this.f8701) {
                if (obj instanceof String) {
                    try {
                        obj = InterfaceC2915.m6310((String) obj);
                    } catch (JSONException unused) {
                    }
                }
                return JSONSchema.f8688;
            }
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                return m5613(obj, objArr.length, new C2669(objArr, 1));
            }
            if (obj.getClass().isArray()) {
                return m5613(obj, Array.getLength(obj), new C2669(obj, 2));
            }
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                return m5613(obj, collection.size(), new C2669(collection.iterator(), 3));
            }
            if (z) {
                return JSONSchema.f8689;
            }
        } else if (z) {
            return JSONSchema.f8680;
        }
        return JSONSchema.f8681;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0748 m5613(Object obj, int i, IntFunction intFunction) {
        boolean z;
        JSONSchema jSONSchema;
        int i2 = this.f8703;
        if (i2 >= 0 && i < i2) {
            return new C0748("minLength not match, expect >= %s, but %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}, false);
        }
        int i3 = this.f8704;
        if (i3 >= 0 && i > i3) {
            return new C0748("maxLength not match, expect <= %s, but %s", new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}, false);
        }
        boolean z2 = this.f8705;
        JSONSchema[] jSONSchemaArr = this.f8708;
        if (!z2 && i > jSONSchemaArr.length) {
            return new C0748("additional items not match, max size %s, but %s", new Object[]{Integer.valueOf(jSONSchemaArr.length), Integer.valueOf(i)}, false);
        }
        boolean z3 = obj instanceof Collection;
        HashSet hashSet = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            C0748 c0748 = JSONSchema.f8681;
            int i6 = this.f8698;
            int i7 = this.f8699;
            JSONSchema jSONSchema2 = this.f8700;
            if (i4 >= i) {
                boolean z4 = z3;
                if (!z4 || jSONSchema2 != null) {
                    if (i7 >= 0 && i5 < i7) {
                        return new C0748("minContains not match, expect %s, but %s", new Object[]{Integer.valueOf(i7), Integer.valueOf(i5)}, false);
                    }
                    if (!z4 ? jSONSchema2 == null || i5 != 0 : i5 != 0 || i7 == 0) {
                        return JSONSchema.f8685;
                    }
                    if (i6 >= 0 && i5 > i6) {
                        return new C0748("maxContains not match, expect %s, but %s", new Object[]{Integer.valueOf(i6), Integer.valueOf(i5)}, false);
                    }
                }
                C2806 c2806 = this.f8696;
                if (c2806 != null) {
                    C0748 c0748Mo5603 = c2806.mo5603(obj);
                    if (!c0748Mo5603.f2155) {
                        return c0748Mo5603;
                    }
                }
                C2804 c2804 = this.f8695;
                if (c2804 != null) {
                    C0748 c0748Mo56032 = c2804.mo5603(obj);
                    if (!c0748Mo56032.f2155) {
                        return c0748Mo56032;
                    }
                }
                C2808 c2808 = this.f8702;
                if (c2808 != null) {
                    C0748 c0748Mo56033 = c2808.mo5603(obj);
                    if (!c0748Mo56033.f2155) {
                        return c0748Mo56033;
                    }
                }
                return c0748;
            }
            Object objApply = intFunction.apply(i4);
            if (i4 < jSONSchemaArr.length) {
                C0748 c0748Mo56034 = jSONSchemaArr[i4].mo5603(objApply);
                if (!c0748Mo56034.f2155) {
                    return c0748Mo56034;
                }
                z = z3;
            } else {
                JSONSchema jSONSchema3 = this.f8707;
                if (z3 && jSONSchema3 == null && (jSONSchema = this.f8706) != null) {
                    C0748 c0748Mo56035 = jSONSchema.mo5603(objApply);
                    z = z3;
                    if (!c0748Mo56035.f2155) {
                        return c0748Mo56035;
                    }
                } else {
                    z = z3;
                }
                if (jSONSchema3 != null) {
                    C0748 c0748Mo56036 = jSONSchema3.mo5603(objApply);
                    if (!c0748Mo56036.f2155) {
                        return c0748Mo56036;
                    }
                }
            }
            if (jSONSchema2 != null && ((i7 > 0 || i6 > 0 || i5 == 0) && jSONSchema2.mo5603(objApply) == c0748)) {
                i5++;
            }
            if (this.f8697) {
                if (hashSet == null) {
                    hashSet = new HashSet(i, 1.0f);
                }
                if (objApply instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) objApply;
                    objApply = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
                }
                if (!hashSet.add(objApply)) {
                    return JSONSchema.f8684;
                }
            }
            i4++;
            z3 = z;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo5608() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "array");
        int i = this.f8704;
        if (i != -1) {
            jSONObject.put("maxLength", Integer.valueOf(i));
        }
        int i2 = this.f8703;
        if (i2 != -1) {
            jSONObject.put("minLength", Integer.valueOf(i2));
        }
        JSONSchema jSONSchema = this.f8707;
        if (jSONSchema != null) {
            jSONObject.put("items", jSONSchema);
        }
        JSONSchema[] jSONSchemaArr = this.f8708;
        if (jSONSchemaArr != null && jSONSchemaArr.length != 0) {
            jSONObject.put("prefixItems", jSONSchemaArr);
        }
        boolean z = this.f8705;
        if (!z) {
            jSONObject.put("additionalItems", Boolean.valueOf(z));
        }
        JSONSchema jSONSchema2 = this.f8706;
        if (jSONSchema2 != null) {
            jSONObject.put("additionalItem", jSONSchema2);
        }
        JSONSchema jSONSchema3 = this.f8700;
        if (jSONSchema3 != null) {
            jSONObject.put("contains", jSONSchema3);
        }
        int i3 = this.f8699;
        if (i3 != -1) {
            jSONObject.put("minContains", Integer.valueOf(i3));
        }
        int i4 = this.f8698;
        if (i4 != -1) {
            jSONObject.put("maxContains", Integer.valueOf(i4));
        }
        boolean z2 = this.f8697;
        if (z2) {
            jSONObject.put("uniqueItems", Boolean.valueOf(z2));
        }
        C2806 c2806 = this.f8696;
        if (c2806 != null) {
            jSONObject.put("allOf", c2806);
        }
        C2804 c2804 = this.f8695;
        if (c2804 != null) {
            jSONObject.put("anyOf", c2804);
        }
        C2808 c2808 = this.f8702;
        if (c2808 != null) {
            jSONObject.put("oneOf", c2808);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5612() {
        return JSONSchema.Type.Array;
    }
}
