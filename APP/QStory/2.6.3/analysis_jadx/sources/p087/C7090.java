package p087;

import kotlin.C5175;
import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7090 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7090 f19007 = new C7090(C7093.f19013);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7091 c7091 = (C7091) obj;
        c7091.getClass();
        short sMo10698 = interfaceC7189.mo10654(this.f19064, i).mo10698();
        c7091.mo12395(c7091.mo12394() + 1);
        short[] sArr = c7091.f19009;
        int i2 = c7091.f19008;
        c7091.f19008 = i2 + 1;
        sArr[i2] = sMo10698;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        return ((C5175) obj).f14738.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        short[] sArr = ((C5175) obj).f14738;
        C7091 c7091 = new C7091();
        c7091.f19009 = sArr;
        c7091.f19008 = sArr.length;
        c7091.mo12395(10);
        return c7091;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        short[] sArr = ((C5175) obj).f14738;
        interfaceC7188.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10734(this.f19064, i2).mo10648(sArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new C5175(new short[0]);
    }
}
