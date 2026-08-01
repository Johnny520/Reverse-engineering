package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2793 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f8635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final JSONSchema f8636;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f8637;

    public /* synthetic */ C2793(JSONSchema jSONSchema, Object obj, int i) {
        this.f8637 = i;
        this.f8636 = jSONSchema;
        this.f8635 = obj;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        int i = this.f8637;
        Object obj2 = this.f8635;
        JSONSchema jSONSchema = this.f8636;
        switch (i) {
            case 0:
                if (!abstractC2898.mo6105()) {
                    int iMo6167 = abstractC2898.mo6167();
                    if (jSONSchema != null) {
                        jSONSchema.mo5607(iMo6167);
                    }
                    try {
                    } catch (Exception e) {
                        C0276.m842(abstractC2898.mo6124("create object error"), e);
                        return null;
                    }
                    break;
                }
                break;
            default:
                if (!abstractC2898.mo6105()) {
                    String strMo6139 = abstractC2898.mo6139();
                    if (jSONSchema != null) {
                        jSONSchema.mo5603(strMo6139);
                    }
                    try {
                    } catch (Exception e2) {
                        C0276.m842(abstractC2898.mo6124("create object error"), e2);
                        return null;
                    }
                    break;
                }
                break;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        switch (this.f8637) {
        }
        return mo5418(abstractC2898, type, obj, j);
    }
}
