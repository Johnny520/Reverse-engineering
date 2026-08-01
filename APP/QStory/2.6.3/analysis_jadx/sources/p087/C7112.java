package p087;

import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7112 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7112 f19046 = new C7112(C7116.f19053);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7113 c7113 = (C7113) obj;
        c7113.getClass();
        char cMo10660 = interfaceC7189.mo10660(this.f19064, i);
        c7113.mo12395(c7113.mo12394() + 1);
        char[] cArr = c7113.f19048;
        int i2 = c7113.f19047;
        c7113.f19047 = i2 + 1;
        cArr[i2] = cMo10660;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        C7113 c7113 = new C7113();
        c7113.f19048 = cArr;
        c7113.f19047 = cArr.length;
        c7113.mo12395(10);
        return c7113;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        char[] cArr = (char[]) obj;
        interfaceC7188.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10720(this.f19064, i2, cArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new char[0];
    }
}
