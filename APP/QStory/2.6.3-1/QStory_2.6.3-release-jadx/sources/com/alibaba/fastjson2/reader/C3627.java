package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3627 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f8982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final JSONSchema f8983;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f8984;

    public /* synthetic */ C3627(JSONSchema jSONSchema, Object obj, int i) {
        this.f8984 = i;
        this.f8983 = jSONSchema;
        this.f8982 = obj;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        int i = this.f8984;
        Object obj2 = this.f8982;
        JSONSchema jSONSchema = this.f8983;
        switch (i) {
            case 0:
                if (!abstractC3732.mo6711()) {
                    int iMo6772 = abstractC3732.mo6772();
                    if (jSONSchema != null) {
                        jSONSchema.mo6212(iMo6772);
                    }
                    try {
                    } catch (Exception e) {
                        C1123.m1403(abstractC3732.mo6730("create object error"), e);
                        return null;
                    }
                    break;
                }
                break;
            default:
                if (!abstractC3732.mo6711()) {
                    String strMo6744 = abstractC3732.mo6744();
                    if (jSONSchema != null) {
                        jSONSchema.mo6208(strMo6744);
                    }
                    try {
                    } catch (Exception e2) {
                        C1123.m1403(abstractC3732.mo6730("create object error"), e2);
                        return null;
                    }
                    break;
                }
                break;
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        switch (this.f8984) {
        }
        return mo6023(abstractC3732, type, obj, j);
    }
}
