package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3594 extends C3525 {
    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6043(Object obj, String str, Object obj2) {
        try {
            this.f8772.invoke(obj, str, obj2);
        } catch (Exception unused) {
            C1123.m1410("any set error");
        }
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6031(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo6044(AbstractC3732 abstractC3732, Object obj) {
        InterfaceC3621 interfaceC3621M6662;
        String strMo6664 = abstractC3732.mo6664();
        if (this.f8761 != null) {
            interfaceC3621M6662 = this.f8761;
        } else {
            interfaceC3621M6662 = abstractC3732.m6662(this.f8768);
            this.f8761 = interfaceC3621M6662;
        }
        try {
            this.f8772.invoke(obj, strMo6664, interfaceC3621M6662.mo6023(abstractC3732, this.f8768, this.f8773, 0L));
        } catch (Exception e) {
            C1123.m1403(abstractC3732.mo6730("any set error"), e);
        }
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final boolean mo6045() {
        return true;
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo6032(AbstractC3732 abstractC3732, Object obj) {
        throw new UnsupportedOperationException();
    }
}
