package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2796 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8648;

    public AbstractC2796(Class cls) {
        this.f8648 = cls;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public Object mo5454(long j) {
        throw new JSONException("createInstance not supported ".concat(this.f8648.getName()));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return this.f8648;
    }
}
