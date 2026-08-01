package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3546 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public volatile InterfaceC3621 f8591;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public volatile InterfaceC3621 f8592;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f8593;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Type f8594;

    public C3546(Type type, Type type2) {
        super(Map.Entry.class);
        this.f8594 = type;
        this.f8593 = type2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objMo6023;
        abstractC3732.mo6708();
        Object objMo6684 = abstractC3732.mo6684();
        abstractC3732.mo6704(':');
        if (this.f8593 == null) {
            objMo6023 = abstractC3732.mo6684();
        } else {
            if (this.f8591 == null) {
                this.f8591 = abstractC3732.m6662(this.f8593);
            }
            objMo6023 = this.f8591.mo6023(abstractC3732, type, obj, j);
        }
        abstractC3732.mo6712();
        abstractC3732.mo6705();
        return new AbstractMap.SimpleEntry(objMo6684, objMo6023);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objMo6023;
        Object objMo60232;
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 != 2) {
            C1123.m1410(abstractC3732.mo6730("entryCnt must be 2, but " + iMo6792));
            return null;
        }
        if (this.f8594 == null) {
            objMo6023 = abstractC3732.mo6684();
        } else {
            if (this.f8592 == null) {
                this.f8592 = abstractC3732.m6662(this.f8594);
            }
            objMo6023 = this.f8592.mo6023(abstractC3732, type, obj, j);
        }
        if (this.f8593 == null) {
            objMo60232 = abstractC3732.mo6684();
        } else {
            if (this.f8591 == null) {
                this.f8591 = abstractC3732.m6662(this.f8593);
            }
            objMo60232 = this.f8591.mo6023(abstractC3732, type, obj, j);
        }
        return new AbstractMap.SimpleEntry(objMo6023, objMo60232);
    }
}
