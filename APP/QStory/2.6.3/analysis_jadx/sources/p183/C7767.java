package p183;

import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7767 extends C7762 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final HashMap f21065 = new HashMap();

    @Override // p183.C7762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo13115(Object obj) {
        Object objMo13115 = super.mo13115(obj);
        this.f21065.remove(obj);
        return objMo13115;
    }

    @Override // p183.C7762
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C7765 mo13116(Object obj) {
        return (C7765) this.f21065.get(obj);
    }
}
