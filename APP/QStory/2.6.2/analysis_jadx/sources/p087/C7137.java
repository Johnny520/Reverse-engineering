package p087;

import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7137 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7137 f19095 = new C7137(C7133.f19092);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7138 c7138 = (C7138) obj;
        c7138.getClass();
        short sMo6870 = interfaceC7188.mo6870(this.f19069, i);
        c7138.mo12368(c7138.mo12367() + 1);
        short[] sArr = c7138.f19097;
        int i2 = c7138.f19096;
        c7138.f19096 = i2 + 1;
        sArr[i2] = sMo6870;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        C7138 c7138 = new C7138();
        c7138.f19097 = sArr;
        c7138.f19096 = sArr.length;
        c7138.mo12368(10);
        return c7138;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        short[] sArr = (short[]) obj;
        interfaceC7187.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6802(this.f19069, i2, sArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new short[0];
    }
}
