package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.BitSet;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2734 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2734 f8344 = new C2734(BitSet.class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8343 = AbstractC2860.m5774("BitSet");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6133()) {
            return null;
        }
        return BitSet.valueOf(abstractC2899.mo6113());
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6133()) {
            return null;
        }
        if (!abstractC2899.mo6143((byte) -110) || abstractC2899.mo6239() == f8343) {
            return BitSet.valueOf(abstractC2899.mo6113());
        }
        C0276.m850(abstractC2899.mo6170(abstractC2899.mo6100()));
        return null;
    }
}
