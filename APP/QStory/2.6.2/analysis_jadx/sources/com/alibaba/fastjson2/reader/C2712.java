package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2712 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public volatile InterfaceC2787 f8244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile InterfaceC2787 f8245;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f8246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Type f8247;

    public C2712(Type type, Type type2) {
        super(Map.Entry.class);
        this.f8247 = type;
        this.f8246 = type2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Object objMo5418;
        abstractC2898.mo6102();
        Object objMo6078 = abstractC2898.mo6078();
        abstractC2898.mo6098(':');
        if (this.f8246 == null) {
            objMo5418 = abstractC2898.mo6078();
        } else {
            if (this.f8244 == null) {
                this.f8244 = abstractC2898.m6056(this.f8246);
            }
            objMo5418 = this.f8244.mo5418(abstractC2898, type, obj, j);
        }
        abstractC2898.mo6106();
        abstractC2898.mo6099();
        return new AbstractMap.SimpleEntry(objMo6078, objMo5418);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Object objMo5418;
        Object objMo54182;
        int iMo6187 = abstractC2898.mo6187();
        if (iMo6187 != 2) {
            C0276.m849(abstractC2898.mo6124("entryCnt must be 2, but " + iMo6187));
            return null;
        }
        if (this.f8247 == null) {
            objMo5418 = abstractC2898.mo6078();
        } else {
            if (this.f8245 == null) {
                this.f8245 = abstractC2898.m6056(this.f8247);
            }
            objMo5418 = this.f8245.mo5418(abstractC2898, type, obj, j);
        }
        if (this.f8246 == null) {
            objMo54182 = abstractC2898.mo6078();
        } else {
            if (this.f8244 == null) {
                this.f8244 = abstractC2898.m6056(this.f8246);
            }
            objMo54182 = this.f8244.mo5418(abstractC2898, type, obj, j);
        }
        return new AbstractMap.SimpleEntry(objMo5418, objMo54182);
    }
}
