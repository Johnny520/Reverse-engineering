package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2678 extends C2691 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean f8142;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f8143;

    public C2678(String str, Type type, Class cls, int i, long j, String str2, Locale locale, String str3, JSONSchema jSONSchema, Method method) {
        super(i, j, jSONSchema, cls, str3, str, str2, null, method, type, locale, null);
        this.f8143 = "trim".equals(str2) || (j & JSONReader$Feature.TrimString.mask) != 0;
        this.f8142 = "upper".equals(str2);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean mo5425(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo5426(Object obj, Object obj2) {
        String string = ((obj2 instanceof String) || obj2 == null) ? (String) obj2 : obj2.toString();
        if (string != null) {
            if (this.f8143) {
                string = string.trim();
            }
            if (this.f8142) {
                string = string.toUpperCase();
            }
        }
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(string);
        }
        try {
            this.f8425.invoke(obj, string);
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        String strMo6139 = abstractC2898.mo6139();
        if (strMo6139 != null) {
            if (this.f8143) {
                strMo6139 = strMo6139.trim();
            }
            if (this.f8142) {
                strMo6139 = strMo6139.toUpperCase();
            }
        }
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(strMo6139);
        }
        try {
            this.f8425.invoke(obj, strMo6139);
        } catch (Exception e) {
            C0276.m842(AbstractC2442.m4564(new StringBuilder("set "), this.f8426, " error", abstractC2898), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        String strMo6139 = abstractC2898.mo6139();
        return (!this.f8143 || strMo6139 == null) ? strMo6139 : strMo6139.trim();
    }
}
