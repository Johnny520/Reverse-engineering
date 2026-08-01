package p087;

import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7117 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7117 f19059 = new C7117(C7121.f19064);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7118 c7118 = (C7118) obj;
        c7118.getClass();
        byte bMo6862 = interfaceC7188.mo6862(this.f19069, i);
        c7118.mo12368(c7118.mo12367() + 1);
        byte[] bArr = c7118.f19061;
        int i2 = c7118.f19060;
        c7118.f19060 = i2 + 1;
        bArr[i2] = bMo6862;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        C7118 c7118 = new C7118();
        c7118.f19061 = bArr;
        c7118.f19060 = bArr.length;
        c7118.mo12368(10);
        return c7118;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        interfaceC7187.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6793(this.f19069, i2, bArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new byte[0];
    }
}
