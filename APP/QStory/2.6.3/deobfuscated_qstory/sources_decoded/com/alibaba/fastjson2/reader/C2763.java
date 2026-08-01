package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2763 extends AbstractC2766 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final boolean f8431;

    public C2763(String str, Type type, Class cls, int i, String str2, JSONSchema jSONSchema, Field field) {
        super(str, type, cls, i, str2, jSONSchema, null, field);
        this.f8431 = Modifier.isFinal(field.getModifiers());
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        if (obj2 == null) {
            return;
        }
        try {
            boolean z = this.f8431;
            Field field = this.f8424;
            if (z) {
                ((AtomicReference) field.get(obj)).set(obj2);
            } else {
                field.set(obj, new AtomicReference(obj2));
            }
        } catch (Exception e) {
            C0276.m843(AbstractC0053.m151(new StringBuilder("set "), this.f8428, " error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo5485() {
        return true;
    }
}
