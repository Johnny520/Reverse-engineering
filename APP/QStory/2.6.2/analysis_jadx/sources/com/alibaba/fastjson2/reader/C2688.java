package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2688 extends C2690 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean f8157;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean f8158;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f8159;

    public C2688(String str, Class cls, int i, long j, String str2, String str3, JSONSchema jSONSchema, Field field) {
        super(str, cls, cls, i, j, str2, null, str3, jSONSchema, field);
        this.f8159 = "trim".equals(str2) || (j & JSONReader$Feature.TrimString.mask) != 0;
        this.f8158 = "upper".equals(str2);
        this.f8157 = (j & JSONReader$Feature.EmptyStringAsNull.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo5425(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C2690, com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        String string = (obj2 == null || (obj2 instanceof String)) ? (String) obj2 : obj2.toString();
        if (string != null) {
            if (this.f8159) {
                string = string.trim();
            }
            if (this.f8158) {
                string = string.toUpperCase();
            }
            if (this.f8157 && string.isEmpty()) {
                string = null;
            }
        }
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(string);
        }
        AbstractC2853.f8919.putObject(obj, this.f8423, string);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        String strMo6139 = abstractC2898.mo6139();
        if (strMo6139 != null) {
            if (this.f8159) {
                strMo6139 = strMo6139.trim();
            }
            if (this.f8158) {
                strMo6139 = strMo6139.toUpperCase();
            }
            if (this.f8157 && strMo6139.isEmpty()) {
                strMo6139 = null;
            }
        }
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(strMo6139);
        }
        AbstractC2853.f8919.putObject(obj, this.f8423, strMo6139);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo5436(AbstractC2898 abstractC2898, Object obj) {
        String strMo6139 = abstractC2898.mo6139();
        if (strMo6139 != null) {
            if (this.f8159) {
                strMo6139 = strMo6139.trim();
            }
            if (this.f8158) {
                strMo6139 = strMo6139.toUpperCase();
            }
            if (this.f8157 && strMo6139.isEmpty()) {
                strMo6139 = null;
            }
        }
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(strMo6139);
        }
        mo5426(obj, strMo6139);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        String strMo6139 = abstractC2898.mo6139();
        return (!this.f8159 || strMo6139 == null) ? strMo6139 : strMo6139.trim();
    }
}
