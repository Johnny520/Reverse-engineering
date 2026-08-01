package p103;

import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7936 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7936 f19379 = new C7936(C7935.f19378);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7944 c7944 = (C7944) obj;
        c7944.getClass();
        double dMo11214 = interfaceC8018.mo11214(this.f19409, i);
        c7944.mo12954(c7944.mo12953() + 1);
        double[] dArr = c7944.f19396;
        int i2 = c7944.f19395;
        c7944.f19395 = i2 + 1;
        dArr[i2] = dMo11214;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        C7944 c7944 = new C7944();
        c7944.f19396 = dArr;
        c7944.f19395 = dArr.length;
        c7944.mo12954(10);
        return c7944;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        double[] dArr = (double[]) obj;
        interfaceC8017.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11295(this.f19409, i2, dArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new double[0];
    }
}
