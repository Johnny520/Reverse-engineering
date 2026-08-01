package p087;

import kotlin.C5176;
import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7132 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7132 f19090 = new C7132(C7131.f19089);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7129 c7129 = (C7129) obj;
        c7129.getClass();
        byte bMo6887 = interfaceC7188.mo6863(this.f19069, i).mo6887();
        c7129.mo12368(c7129.mo12367() + 1);
        byte[] bArr = c7129.f19083;
        int i2 = c7129.f19082;
        c7129.f19082 = i2 + 1;
        bArr[i2] = bMo6887;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        return ((C5176) obj).f14740.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        byte[] bArr = ((C5176) obj).f14740;
        C7129 c7129 = new C7129();
        c7129.f19083 = bArr;
        c7129.f19082 = bArr.length;
        c7129.mo12368(10);
        return c7129;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        byte[] bArr = ((C5176) obj).f14740;
        interfaceC7187.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6809(this.f19069, i2).mo6810(bArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new C5176(new byte[0]);
    }
}
