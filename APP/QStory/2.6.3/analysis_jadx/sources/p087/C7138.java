package p087;

import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7138 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7138 f19090 = new C7138(C7134.f19087);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7139 c7139 = (C7139) obj;
        c7139.getClass();
        short sMo10669 = interfaceC7189.mo10669(this.f19064, i);
        c7139.mo12395(c7139.mo12394() + 1);
        short[] sArr = c7139.f19092;
        int i2 = c7139.f19091;
        c7139.f19091 = i2 + 1;
        sArr[i2] = sMo10669;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        C7139 c7139 = new C7139();
        c7139.f19092 = sArr;
        c7139.f19091 = sArr.length;
        c7139.mo12395(10);
        return c7139;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        short[] sArr = (short[]) obj;
        interfaceC7188.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10725(this.f19064, i2, sArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new short[0];
    }
}
