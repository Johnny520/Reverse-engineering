package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3512 extends C3525 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean f8489;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean f8490;

    public C3512(String str, Type type, Class cls, int i, long j, String str2, Locale locale, String str3, JSONSchema jSONSchema, Method method) {
        super(i, j, jSONSchema, cls, str3, str, str2, null, method, type, locale, null);
        this.f8490 = "trim".equals(str2) || (j & JSONReader$Feature.TrimString.mask) != 0;
        this.f8489 = "upper".equals(str2);
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean mo6030(Class cls) {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo6031(Object obj, Object obj2) {
        String string = ((obj2 instanceof String) || obj2 == null) ? (String) obj2 : obj2.toString();
        if (string != null) {
            if (this.f8490) {
                string = string.trim();
            }
            if (this.f8489) {
                string = string.toUpperCase();
            }
        }
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(string);
        }
        try {
            this.f8772.invoke(obj, string);
        } catch (Exception e) {
            C1123.m1403(AbstractC0900.m711(new StringBuilder("set "), this.f8773, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        String strMo6744 = abstractC3732.mo6744();
        if (strMo6744 != null) {
            if (this.f8490) {
                strMo6744 = strMo6744.trim();
            }
            if (this.f8489) {
                strMo6744 = strMo6744.toUpperCase();
            }
        }
        JSONSchema jSONSchema = this.f8758;
        if (jSONSchema != null) {
            jSONSchema.m6216(strMo6744);
        }
        try {
            this.f8772.invoke(obj, strMo6744);
        } catch (Exception e) {
            C1123.m1403(AbstractC3275.m5137(new StringBuilder("set "), this.f8773, " error", abstractC3732), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Object mo6033(AbstractC3732 abstractC3732) {
        String strMo6744 = abstractC3732.mo6744();
        return (!this.f8490 || strMo6744 == null) ? strMo6744 : strMo6744.trim();
    }
}
