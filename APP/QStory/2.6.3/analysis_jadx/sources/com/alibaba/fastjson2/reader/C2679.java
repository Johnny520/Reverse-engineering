package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2679 extends C2692 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean f8144;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f8145;

    public C2679(String str, Type type, Class cls, int i, long j, String str2, Locale locale, String str3, JSONSchema jSONSchema, Method method) {
        super(i, j, jSONSchema, cls, str3, str, str2, null, method, type, locale, null);
        this.f8145 = "trim".equals(str2) || (j & JSONReader$Feature.TrimString.mask) != 0;
        this.f8144 = "upper".equals(str2);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean mo5470(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo5471(Object obj, Object obj2) {
        String string = ((obj2 instanceof String) || obj2 == null) ? (String) obj2 : obj2.toString();
        if (string != null) {
            if (this.f8145) {
                string = string.trim();
            }
            if (this.f8144) {
                string = string.toUpperCase();
            }
        }
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(string);
        }
        try {
            this.f8427.invoke(obj, string);
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        String strMo6184 = abstractC2899.mo6184();
        if (strMo6184 != null) {
            if (this.f8145) {
                strMo6184 = strMo6184.trim();
            }
            if (this.f8144) {
                strMo6184 = strMo6184.toUpperCase();
            }
        }
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(strMo6184);
        }
        try {
            this.f8427.invoke(obj, strMo6184);
        } catch (Exception e) {
            C0276.m843(AbstractC2442.m4577(new StringBuilder("set "), this.f8428, " error", abstractC2899), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Object mo5473(AbstractC2899 abstractC2899) {
        String strMo6184 = abstractC2899.mo6184();
        return (!this.f8145 || strMo6184 == null) ? strMo6184 : strMo6184.trim();
    }
}
