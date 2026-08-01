package p183;

import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7766 extends C7761 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final HashMap f21068 = new HashMap();

    @Override // p183.C7761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo13087(Object obj) {
        Object objMo13087 = super.mo13087(obj);
        this.f21068.remove(obj);
        return objMo13087;
    }

    @Override // p183.C7761
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C7764 mo13088(Object obj) {
        return (C7764) this.f21068.get(obj);
    }
}
