package p087;

import kotlin.C5177;
import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7133 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7133 f19085 = new C7133(C7132.f19084);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7130 c7130 = (C7130) obj;
        c7130.getClass();
        byte bMo10700 = interfaceC7189.mo10654(this.f19064, i).mo10700();
        c7130.mo12395(c7130.mo12394() + 1);
        byte[] bArr = c7130.f19078;
        int i2 = c7130.f19077;
        c7130.f19077 = i2 + 1;
        bArr[i2] = bMo10700;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        return ((C5177) obj).f14740.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        byte[] bArr = ((C5177) obj).f14740;
        C7130 c7130 = new C7130();
        c7130.f19078 = bArr;
        c7130.f19077 = bArr.length;
        c7130.mo12395(10);
        return c7130;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        byte[] bArr = ((C5177) obj).f14740;
        interfaceC7188.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10734(this.f19064, i2).mo10647(bArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new C5177(new byte[0]);
    }
}
