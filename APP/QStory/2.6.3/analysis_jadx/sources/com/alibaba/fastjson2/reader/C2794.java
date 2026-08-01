package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2794 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f8637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final JSONSchema f8638;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f8639;

    public /* synthetic */ C2794(JSONSchema jSONSchema, Object obj, int i) {
        this.f8639 = i;
        this.f8638 = jSONSchema;
        this.f8637 = obj;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        int i = this.f8639;
        Object obj2 = this.f8637;
        JSONSchema jSONSchema = this.f8638;
        switch (i) {
            case 0:
                if (!abstractC2899.mo6151()) {
                    int iMo6212 = abstractC2899.mo6212();
                    if (jSONSchema != null) {
                        jSONSchema.mo5652(iMo6212);
                    }
                    try {
                    } catch (Exception e) {
                        C0276.m843(abstractC2899.mo6170("create object error"), e);
                        return null;
                    }
                    break;
                }
                break;
            default:
                if (!abstractC2899.mo6151()) {
                    String strMo6184 = abstractC2899.mo6184();
                    if (jSONSchema != null) {
                        jSONSchema.mo5648(strMo6184);
                    }
                    try {
                    } catch (Exception e2) {
                        C0276.m843(abstractC2899.mo6170("create object error"), e2);
                        return null;
                    }
                    break;
                }
                break;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        switch (this.f8639) {
        }
        return mo5463(abstractC2899, type, obj, j);
    }
}
