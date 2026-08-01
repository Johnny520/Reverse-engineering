package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import bsh.C2670;
import com.alibaba.fastjson2.InterfaceC2916;
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
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2804 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2805 f8697;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final C2807 f8698;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean f8699;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int f8700;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int f8701;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final JSONSchema f8702;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean f8703;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C2809 f8704;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f8705;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f8706;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean f8707;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final JSONSchema f8708;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final JSONSchema f8709;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final JSONSchema[] f8710;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final LinkedHashMap f8711;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f8712;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedHashMap f8713;

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
    public C2804(com.alibaba.fastjson2.JSONObject r10, com.alibaba.fastjson2.schema.JSONSchema r11) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.schema.C2804.<init>(com.alibaba.fastjson2.JSONObject, com.alibaba.fastjson2.schema.JSONSchema):void");
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5648(Object obj) throws IOException {
        boolean z = this.f8712;
        if (obj != null) {
            if (this.f8703) {
                if (obj instanceof String) {
                    try {
                        obj = InterfaceC2916.m6368((String) obj);
                    } catch (JSONException unused) {
                    }
                }
                return JSONSchema.f8690;
            }
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                return m5658(obj, objArr.length, new C2670(objArr, 1));
            }
            if (obj.getClass().isArray()) {
                return m5658(obj, Array.getLength(obj), new C2670(obj, 2));
            }
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                return m5658(obj, collection.size(), new C2670(collection.iterator(), 3));
            }
            if (z) {
                return JSONSchema.f8691;
            }
        } else if (z) {
            return JSONSchema.f8682;
        }
        return JSONSchema.f8683;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C0748 m5658(Object obj, int i, IntFunction intFunction) {
        boolean z;
        JSONSchema jSONSchema;
        int i2 = this.f8705;
        if (i2 >= 0 && i < i2) {
            return new C0748("minLength not match, expect >= %s, but %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)}, false);
        }
        int i3 = this.f8706;
        if (i3 >= 0 && i > i3) {
            return new C0748("maxLength not match, expect <= %s, but %s", new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}, false);
        }
        boolean z2 = this.f8707;
        JSONSchema[] jSONSchemaArr = this.f8710;
        if (!z2 && i > jSONSchemaArr.length) {
            return new C0748("additional items not match, max size %s, but %s", new Object[]{Integer.valueOf(jSONSchemaArr.length), Integer.valueOf(i)}, false);
        }
        boolean z3 = obj instanceof Collection;
        HashSet hashSet = null;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            C0748 c0748 = JSONSchema.f8683;
            int i6 = this.f8700;
            int i7 = this.f8701;
            JSONSchema jSONSchema2 = this.f8702;
            if (i4 >= i) {
                boolean z4 = z3;
                if (!z4 || jSONSchema2 != null) {
                    if (i7 >= 0 && i5 < i7) {
                        return new C0748("minContains not match, expect %s, but %s", new Object[]{Integer.valueOf(i7), Integer.valueOf(i5)}, false);
                    }
                    if (!z4 ? jSONSchema2 == null || i5 != 0 : i5 != 0 || i7 == 0) {
                        return JSONSchema.f8687;
                    }
                    if (i6 >= 0 && i5 > i6) {
                        return new C0748("maxContains not match, expect %s, but %s", new Object[]{Integer.valueOf(i6), Integer.valueOf(i5)}, false);
                    }
                }
                C2807 c2807 = this.f8698;
                if (c2807 != null) {
                    C0748 c0748Mo5648 = c2807.mo5648(obj);
                    if (!c0748Mo5648.f2156) {
                        return c0748Mo5648;
                    }
                }
                C2805 c2805 = this.f8697;
                if (c2805 != null) {
                    C0748 c0748Mo56482 = c2805.mo5648(obj);
                    if (!c0748Mo56482.f2156) {
                        return c0748Mo56482;
                    }
                }
                C2809 c2809 = this.f8704;
                if (c2809 != null) {
                    C0748 c0748Mo56483 = c2809.mo5648(obj);
                    if (!c0748Mo56483.f2156) {
                        return c0748Mo56483;
                    }
                }
                return c0748;
            }
            Object objApply = intFunction.apply(i4);
            if (i4 < jSONSchemaArr.length) {
                C0748 c0748Mo56484 = jSONSchemaArr[i4].mo5648(objApply);
                if (!c0748Mo56484.f2156) {
                    return c0748Mo56484;
                }
                z = z3;
            } else {
                JSONSchema jSONSchema3 = this.f8709;
                if (z3 && jSONSchema3 == null && (jSONSchema = this.f8708) != null) {
                    C0748 c0748Mo56485 = jSONSchema.mo5648(objApply);
                    z = z3;
                    if (!c0748Mo56485.f2156) {
                        return c0748Mo56485;
                    }
                } else {
                    z = z3;
                }
                if (jSONSchema3 != null) {
                    C0748 c0748Mo56486 = jSONSchema3.mo5648(objApply);
                    if (!c0748Mo56486.f2156) {
                        return c0748Mo56486;
                    }
                }
            }
            if (jSONSchema2 != null && ((i7 > 0 || i6 > 0 || i5 == 0) && jSONSchema2.mo5648(objApply) == c0748)) {
                i5++;
            }
            if (this.f8699) {
                if (hashSet == null) {
                    hashSet = new HashSet(i, 1.0f);
                }
                if (objApply instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) objApply;
                    objApply = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
                }
                if (!hashSet.add(objApply)) {
                    return JSONSchema.f8686;
                }
            }
            i4++;
            z3 = z;
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final JSONObject mo5653() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "array");
        int i = this.f8706;
        if (i != -1) {
            jSONObject.put("maxLength", Integer.valueOf(i));
        }
        int i2 = this.f8705;
        if (i2 != -1) {
            jSONObject.put("minLength", Integer.valueOf(i2));
        }
        JSONSchema jSONSchema = this.f8709;
        if (jSONSchema != null) {
            jSONObject.put("items", jSONSchema);
        }
        JSONSchema[] jSONSchemaArr = this.f8710;
        if (jSONSchemaArr != null && jSONSchemaArr.length != 0) {
            jSONObject.put("prefixItems", jSONSchemaArr);
        }
        boolean z = this.f8707;
        if (!z) {
            jSONObject.put("additionalItems", Boolean.valueOf(z));
        }
        JSONSchema jSONSchema2 = this.f8708;
        if (jSONSchema2 != null) {
            jSONObject.put("additionalItem", jSONSchema2);
        }
        JSONSchema jSONSchema3 = this.f8702;
        if (jSONSchema3 != null) {
            jSONObject.put("contains", jSONSchema3);
        }
        int i3 = this.f8701;
        if (i3 != -1) {
            jSONObject.put("minContains", Integer.valueOf(i3));
        }
        int i4 = this.f8700;
        if (i4 != -1) {
            jSONObject.put("maxContains", Integer.valueOf(i4));
        }
        boolean z2 = this.f8699;
        if (z2) {
            jSONObject.put("uniqueItems", Boolean.valueOf(z2));
        }
        C2807 c2807 = this.f8698;
        if (c2807 != null) {
            jSONObject.put("allOf", c2807);
        }
        C2805 c2805 = this.f8697;
        if (c2805 != null) {
            jSONObject.put("anyOf", c2805);
        }
        C2809 c2809 = this.f8704;
        if (c2809 != null) {
            jSONObject.put("oneOf", c2809);
        }
        return jSONObject;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5657() {
        return JSONSchema.Type.Array;
    }
}
