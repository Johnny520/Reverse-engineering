package p087;

import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7101 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7101 f19026 = new C7101(C7100.f19025);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7102 c7102 = (C7102) obj;
        c7102.getClass();
        boolean zMo10652 = interfaceC7189.mo10652(this.f19064, i);
        c7102.mo12395(c7102.mo12394() + 1);
        boolean[] zArr = c7102.f19028;
        int i2 = c7102.f19027;
        c7102.f19027 = i2 + 1;
        zArr[i2] = zMo10652;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        C7102 c7102 = new C7102();
        c7102.f19028 = zArr;
        c7102.f19027 = zArr.length;
        c7102.mo12395(10);
        return c7102;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        interfaceC7188.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10737(this.f19064, i2, zArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new boolean[0];
    }
}
