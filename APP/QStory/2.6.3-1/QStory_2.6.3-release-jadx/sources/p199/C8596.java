package p199;

import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8596 extends C8591 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final HashMap f21410 = new HashMap();

    @Override // p199.C8591
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo13674(Object obj) {
        Object objMo13674 = super.mo13674(obj);
        this.f21410.remove(obj);
        return objMo13674;
    }

    @Override // p199.C8591
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C8594 mo13675(Object obj) {
        return (C8594) this.f21410.get(obj);
    }
}
