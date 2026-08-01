package p087;

import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7100 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7100 f19031 = new C7100(C7099.f19030);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7101 c7101 = (C7101) obj;
        c7101.getClass();
        boolean zMo6861 = interfaceC7188.mo6861(this.f19069, i);
        c7101.mo12368(c7101.mo12367() + 1);
        boolean[] zArr = c7101.f19033;
        int i2 = c7101.f19032;
        c7101.f19032 = i2 + 1;
        zArr[i2] = zMo6861;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        C7101 c7101 = new C7101();
        c7101.f19033 = zArr;
        c7101.f19032 = zArr.length;
        c7101.mo12368(10);
        return c7101;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        interfaceC7187.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6816(this.f19069, i2, zArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new boolean[0];
    }
}
