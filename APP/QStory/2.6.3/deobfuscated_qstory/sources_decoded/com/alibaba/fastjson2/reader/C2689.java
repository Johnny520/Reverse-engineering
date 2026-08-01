package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2854;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2689 extends C2691 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean f8159;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean f8160;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f8161;

    public C2689(String str, Class cls, int i, long j, String str2, String str3, JSONSchema jSONSchema, Field field) {
        super(str, cls, cls, i, j, str2, null, str3, jSONSchema, field);
        this.f8161 = "trim".equals(str2) || (j & JSONReader$Feature.TrimString.mask) != 0;
        this.f8160 = "upper".equals(str2);
        this.f8159 = (j & JSONReader$Feature.EmptyStringAsNull.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo5470(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        String string = (obj2 == null || (obj2 instanceof String)) ? (String) obj2 : obj2.toString();
        if (string != null) {
            if (this.f8161) {
                string = string.trim();
            }
            if (this.f8160) {
                string = string.toUpperCase();
            }
            if (this.f8159 && string.isEmpty()) {
                string = null;
            }
        }
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(string);
        }
        AbstractC2854.f8921.putObject(obj, this.f8425, string);
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        String strMo6184 = abstractC2899.mo6184();
        if (strMo6184 != null) {
            if (this.f8161) {
                strMo6184 = strMo6184.trim();
            }
            if (this.f8160) {
                strMo6184 = strMo6184.toUpperCase();
            }
            if (this.f8159 && strMo6184.isEmpty()) {
                strMo6184 = null;
            }
        }
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(strMo6184);
        }
        AbstractC2854.f8921.putObject(obj, this.f8425, strMo6184);
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo5481(AbstractC2899 abstractC2899, Object obj) {
        String strMo6184 = abstractC2899.mo6184();
        if (strMo6184 != null) {
            if (this.f8161) {
                strMo6184 = strMo6184.trim();
            }
            if (this.f8160) {
                strMo6184 = strMo6184.toUpperCase();
            }
            if (this.f8159 && strMo6184.isEmpty()) {
                strMo6184 = null;
            }
        }
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(strMo6184);
        }
        mo5471(obj, strMo6184);
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5473(AbstractC2899 abstractC2899) {
        String strMo6184 = abstractC2899.mo6184();
        return (!this.f8161 || strMo6184 == null) ? strMo6184 : strMo6184.trim();
    }
}
