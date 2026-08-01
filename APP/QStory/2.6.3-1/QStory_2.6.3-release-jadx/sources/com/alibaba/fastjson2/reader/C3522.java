package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3687;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3522 extends C3524 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean f8504;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean f8505;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f8506;

    public C3522(String str, Class cls, int i, long j, String str2, String str3, JSONSchema jSONSchema, Field field) {
        super(str, cls, cls, i, j, str2, null, str3, jSONSchema, field);
        this.f8506 = "trim".equals(str2) || (j & JSONReader$Feature.TrimString.mask) != 0;
        this.f8505 = "upper".equals(str2);
        this.f8504 = (j & JSONReader$Feature.EmptyStringAsNull.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo6030(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C3524, com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        String string = (obj2 == null || (obj2 instanceof String)) ? (String) obj2 : obj2.toString();
        if (string != null) {
            if (this.f8506) {
                string = string.trim();
            }
            if (this.f8505) {
                string = string.toUpperCase();
            }
            if (this.f8504 && string.isEmpty()) {
                string = null;
            }
        }
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(string);
        }
        AbstractC3687.f9266.putObject(obj, this.f8770, string);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        String strMo6744 = abstractC3732.mo6744();
        if (strMo6744 != null) {
            if (this.f8506) {
                strMo6744 = strMo6744.trim();
            }
            if (this.f8505) {
                strMo6744 = strMo6744.toUpperCase();
            }
            if (this.f8504 && strMo6744.isEmpty()) {
                strMo6744 = null;
            }
        }
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(strMo6744);
        }
        AbstractC3687.f9266.putObject(obj, this.f8770, strMo6744);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo6041(AbstractC3732 abstractC3732, Object obj) {
        String strMo6744 = abstractC3732.mo6744();
        if (strMo6744 != null) {
            if (this.f8506) {
                strMo6744 = strMo6744.trim();
            }
            if (this.f8505) {
                strMo6744 = strMo6744.toUpperCase();
            }
            if (this.f8504 && strMo6744.isEmpty()) {
                strMo6744 = null;
            }
        }
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(strMo6744);
        }
        mo6031(obj, strMo6744);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo6033(AbstractC3732 abstractC3732) {
        String strMo6744 = abstractC3732.mo6744();
        return (!this.f8506 || strMo6744 == null) ? strMo6744 : strMo6744.trim();
    }
}
