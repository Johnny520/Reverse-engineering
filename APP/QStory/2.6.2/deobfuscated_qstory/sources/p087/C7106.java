package p087;

import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7106 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7106 f19039 = new C7106(C7105.f19038);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7114 c7114 = (C7114) obj;
        c7114.getClass();
        double dMo6864 = interfaceC7188.mo6864(this.f19069, i);
        c7114.mo12368(c7114.mo12367() + 1);
        double[] dArr = c7114.f19056;
        int i2 = c7114.f19055;
        c7114.f19055 = i2 + 1;
        dArr[i2] = dMo6864;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        C7114 c7114 = new C7114();
        c7114.f19056 = dArr;
        c7114.f19055 = dArr.length;
        c7114.mo12368(10);
        return c7114;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        double[] dArr = (double[]) obj;
        interfaceC7187.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6815(this.f19069, i2, dArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new double[0];
    }
}
