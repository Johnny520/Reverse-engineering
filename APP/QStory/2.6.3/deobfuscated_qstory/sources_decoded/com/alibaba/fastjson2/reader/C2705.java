package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2705 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2705 f8223 = new C2705(Short.class);

    static {
        AbstractC2860.m5774("S");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Integer numMo6213 = abstractC2899.mo6213();
        if (numMo6213 == null) {
            return null;
        }
        return Short.valueOf(numMo6213.shortValue());
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Integer numMo6213 = abstractC2899.mo6213();
        if (numMo6213 == null) {
            return null;
        }
        return Short.valueOf(numMo6213.shortValue());
    }
}
