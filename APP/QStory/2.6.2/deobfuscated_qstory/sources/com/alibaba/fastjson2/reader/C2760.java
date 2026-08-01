package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2760 extends C2691 {
    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo5438(Object obj, String str, Object obj2) {
        try {
            this.f8425.invoke(obj, str, obj2);
        } catch (Exception unused) {
            C0276.m849("any set error");
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5426(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo5439(AbstractC2898 abstractC2898, Object obj) {
        InterfaceC2787 interfaceC2787M6056;
        String strMo6058 = abstractC2898.mo6058();
        if (this.f8414 != null) {
            interfaceC2787M6056 = this.f8414;
        } else {
            interfaceC2787M6056 = abstractC2898.m6056(this.f8421);
            this.f8414 = interfaceC2787M6056;
        }
        try {
            this.f8425.invoke(obj, strMo6058, interfaceC2787M6056.mo5418(abstractC2898, this.f8421, this.f8426, 0L));
        } catch (Exception e) {
            C0276.m842(abstractC2898.mo6124("any set error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo5440() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5427(AbstractC2898 abstractC2898, Object obj) {
        throw new UnsupportedOperationException();
    }
}
