package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2713 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public volatile InterfaceC2788 f8246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile InterfaceC2788 f8247;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f8248;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Type f8249;

    public C2713(Type type, Type type2) {
        super(Map.Entry.class);
        this.f8249 = type;
        this.f8248 = type2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Object objMo5463;
        abstractC2899.mo6148();
        Object objMo6124 = abstractC2899.mo6124();
        abstractC2899.mo6144(':');
        if (this.f8248 == null) {
            objMo5463 = abstractC2899.mo6124();
        } else {
            if (this.f8246 == null) {
                this.f8246 = abstractC2899.m6102(this.f8248);
            }
            objMo5463 = this.f8246.mo5463(abstractC2899, type, obj, j);
        }
        abstractC2899.mo6152();
        abstractC2899.mo6145();
        return new AbstractMap.SimpleEntry(objMo6124, objMo5463);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Object objMo5463;
        Object objMo54632;
        int iMo6232 = abstractC2899.mo6232();
        if (iMo6232 != 2) {
            C0276.m850(abstractC2899.mo6170("entryCnt must be 2, but " + iMo6232));
            return null;
        }
        if (this.f8249 == null) {
            objMo5463 = abstractC2899.mo6124();
        } else {
            if (this.f8247 == null) {
                this.f8247 = abstractC2899.m6102(this.f8249);
            }
            objMo5463 = this.f8247.mo5463(abstractC2899, type, obj, j);
        }
        if (this.f8248 == null) {
            objMo54632 = abstractC2899.mo6124();
        } else {
            if (this.f8246 == null) {
                this.f8246 = abstractC2899.m6102(this.f8248);
            }
            objMo54632 = this.f8246.mo5463(abstractC2899, type, obj, j);
        }
        return new AbstractMap.SimpleEntry(objMo5463, objMo54632);
    }
}
