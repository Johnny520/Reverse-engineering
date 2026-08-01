package p087;

import kotlin.C5181;
import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7093 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7093 f19019 = new C7093(C7097.f19026);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7094 c7094 = (C7094) obj;
        c7094.getClass();
        int iMo6868 = interfaceC7188.mo6863(this.f19069, i).mo6868();
        c7094.mo12368(c7094.mo12367() + 1);
        int[] iArr = c7094.f19021;
        int i2 = c7094.f19020;
        c7094.f19020 = i2 + 1;
        iArr[i2] = iMo6868;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        return ((C5181) obj).f14745.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        int[] iArr = ((C5181) obj).f14745;
        C7094 c7094 = new C7094();
        c7094.f19021 = iArr;
        c7094.f19020 = iArr.length;
        c7094.mo12368(10);
        return c7094;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        int[] iArr = ((C5181) obj).f14745;
        interfaceC7187.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6809(this.f19069, i2).mo6790(iArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new C5181(new int[0]);
    }
}
