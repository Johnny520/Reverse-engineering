package p087;

import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7083 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7083 f19003 = new C7083(C7082.f19002);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7084 c7084 = (C7084) obj;
        c7084.getClass();
        int iMo6872 = interfaceC7188.mo6872(this.f19069, i);
        c7084.mo12368(c7084.mo12367() + 1);
        int[] iArr = c7084.f19005;
        int i2 = c7084.f19004;
        c7084.f19004 = i2 + 1;
        iArr[i2] = iMo6872;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        C7084 c7084 = new C7084();
        c7084.f19005 = iArr;
        c7084.f19004 = iArr.length;
        c7084.mo12368(10);
        return c7084;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        int[] iArr = (int[]) obj;
        interfaceC7187.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6805(i2, iArr[i2], this.f19069);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new int[0];
    }
}
