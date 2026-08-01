package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2762 extends AbstractC2765 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f8429;

    public C2762(String str, Type type, Class cls, int i, String str2, JSONSchema jSONSchema, Field field) {
        super(str, type, cls, i, str2, jSONSchema, null, field);
        this.f8429 = Modifier.isFinal(field.getModifiers());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        if (obj2 == null) {
            return;
        }
        try {
            boolean z = this.f8429;
            Field field = this.f8422;
            if (z) {
                ((AtomicReference) field.get(obj)).set(obj2);
            } else {
                field.set(obj, new AtomicReference(obj2));
            }
        } catch (Exception e) {
            C0276.m842(AbstractC0053.m146(new StringBuilder("set "), this.f8426, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo5440() {
        return true;
    }
}
