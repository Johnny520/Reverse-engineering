package p087;

import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7107 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7107 f19034 = new C7107(C7106.f19033);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7115 c7115 = (C7115) obj;
        c7115.getClass();
        double dMo10655 = interfaceC7189.mo10655(this.f19064, i);
        c7115.mo12395(c7115.mo12394() + 1);
        double[] dArr = c7115.f19051;
        int i2 = c7115.f19050;
        c7115.f19050 = i2 + 1;
        dArr[i2] = dMo10655;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        C7115 c7115 = new C7115();
        c7115.f19051 = dArr;
        c7115.f19050 = dArr.length;
        c7115.mo12395(10);
        return c7115;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        double[] dArr = (double[]) obj;
        interfaceC7188.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10736(this.f19064, i2, dArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new double[0];
    }
}
