package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONException;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2797 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8650;

    public AbstractC2797(Class cls) {
        this.f8650 = cls;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public Object mo5499(long j) {
        throw new JSONException("createInstance not supported ".concat(this.f8650.getName()));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return this.f8650;
    }
}
