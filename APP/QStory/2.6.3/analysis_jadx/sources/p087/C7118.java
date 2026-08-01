package p087;

import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7118 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7118 f19054 = new C7118(C7122.f19059);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7119 c7119 = (C7119) obj;
        c7119.getClass();
        byte bMo10653 = interfaceC7189.mo10653(this.f19064, i);
        c7119.mo12395(c7119.mo12394() + 1);
        byte[] bArr = c7119.f19056;
        int i2 = c7119.f19055;
        c7119.f19055 = i2 + 1;
        bArr[i2] = bMo10653;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        C7119 c7119 = new C7119();
        c7119.f19056 = bArr;
        c7119.f19055 = bArr.length;
        c7119.mo12395(10);
        return c7119;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        interfaceC7188.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10721(this.f19064, i2, bArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new byte[0];
    }
}
