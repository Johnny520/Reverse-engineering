package p087;

import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7084 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7084 f18998 = new C7084(C7083.f18997);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7085 c7085 = (C7085) obj;
        c7085.getClass();
        int iMo10671 = interfaceC7189.mo10671(this.f19064, i);
        c7085.mo12395(c7085.mo12394() + 1);
        int[] iArr = c7085.f19000;
        int i2 = c7085.f18999;
        c7085.f18999 = i2 + 1;
        iArr[i2] = iMo10671;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        C7085 c7085 = new C7085();
        c7085.f19000 = iArr;
        c7085.f18999 = iArr.length;
        c7085.mo12395(10);
        return c7085;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        int[] iArr = (int[]) obj;
        interfaceC7188.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10729(i2, iArr[i2], this.f19064);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new int[0];
    }
}
