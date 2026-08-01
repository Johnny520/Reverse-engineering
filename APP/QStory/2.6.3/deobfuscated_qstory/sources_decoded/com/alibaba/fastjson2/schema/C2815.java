package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2815 extends JSONSchema {
    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5648(Object obj) {
        return obj == null ? JSONSchema.f8683 : new C0748("expect type %s, but %s", new Object[]{JSONSchema.Type.Null, obj.getClass()}, false);
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5657() {
        return JSONSchema.Type.Null;
    }
}
