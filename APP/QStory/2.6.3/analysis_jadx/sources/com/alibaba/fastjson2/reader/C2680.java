package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2680 extends AbstractC2762 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f8146;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final BiConsumer f8147;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f8148;

    public C2680(String str, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, BiConsumer biConsumer) {
        super(str, cls, cls, i, j, str2, locale, obj, jSONSchema, method, null);
        this.f8147 = biConsumer;
        this.f8146 = "trim".equals(str2) || (j & JSONReader$Feature.TrimString.mask) != 0;
        this.f8148 = "upper".equals(str2);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo5470(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        String string = ((obj2 instanceof String) || obj2 == null) ? (String) obj2 : obj2.toString();
        if (string != null) {
            if (this.f8146) {
                string = string.trim();
            }
            if (this.f8148) {
                string = string.toUpperCase();
            }
        }
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(string);
        }
        try {
            this.f8147.accept(obj, string);
        } catch (Exception e) {
            C2942.m6391(this, e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        String strMo6184 = abstractC2899.mo6184();
        if (strMo6184 != null) {
            if (this.f8146) {
                strMo6184 = strMo6184.trim();
            }
            if (this.f8148) {
                strMo6184 = strMo6184.toUpperCase();
            }
        }
        JSONSchema jSONSchema = this.f8413;
        if (jSONSchema != null) {
            jSONSchema.m5656(strMo6184);
        }
        this.f8147.accept(obj, strMo6184);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5473(AbstractC2899 abstractC2899) {
        return abstractC2899.mo6184();
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final BiConsumer mo5474() {
        return this.f8147;
    }
}
