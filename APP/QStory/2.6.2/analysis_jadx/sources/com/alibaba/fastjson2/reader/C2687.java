package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2853;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2687 extends C2751 {
    public C2687(String str, Type type, Class cls, Type type2, Class cls2, int i, long j, String str2, Locale locale, Collection collection, JSONSchema jSONSchema, Field field) {
        super(str, type, cls, type2, cls2, i, j, str2, locale, collection, jSONSchema, null, field, null);
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        JSONSchema jSONSchema = this.f8411;
        if (jSONSchema != null) {
            jSONSchema.m5611(obj2);
        }
        AbstractC2853.f8919.putObject(obj, this.f8423, obj2);
    }
}
