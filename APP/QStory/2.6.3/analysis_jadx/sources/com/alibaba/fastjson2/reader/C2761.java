package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2761 extends C2692 {
    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo5483(Object obj, String str, Object obj2) {
        try {
            this.f8427.invoke(obj, str, obj2);
        } catch (Exception unused) {
            C0276.m850("any set error");
        }
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5471(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo5484(AbstractC2899 abstractC2899, Object obj) {
        InterfaceC2788 interfaceC2788M6102;
        String strMo6104 = abstractC2899.mo6104();
        if (this.f8416 != null) {
            interfaceC2788M6102 = this.f8416;
        } else {
            interfaceC2788M6102 = abstractC2899.m6102(this.f8423);
            this.f8416 = interfaceC2788M6102;
        }
        try {
            this.f8427.invoke(obj, strMo6104, interfaceC2788M6102.mo5463(abstractC2899, this.f8423, this.f8428, 0L));
        } catch (Exception e) {
            C0276.m843(abstractC2899.mo6170("any set error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo5485() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo5472(AbstractC2899 abstractC2899, Object obj) {
        throw new UnsupportedOperationException();
    }
}
