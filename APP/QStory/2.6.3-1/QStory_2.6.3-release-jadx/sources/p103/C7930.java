package p103;

import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7930 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7930 f19371 = new C7930(C7929.f19370);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7931 c7931 = (C7931) obj;
        c7931.getClass();
        boolean zMo11211 = interfaceC8018.mo11211(this.f19409, i);
        c7931.mo12954(c7931.mo12953() + 1);
        boolean[] zArr = c7931.f19373;
        int i2 = c7931.f19372;
        c7931.f19372 = i2 + 1;
        zArr[i2] = zMo11211;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        C7931 c7931 = new C7931();
        c7931.f19373 = zArr;
        c7931.f19372 = zArr.length;
        c7931.mo12954(10);
        return c7931;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        interfaceC8017.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11296(this.f19409, i2, zArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new boolean[0];
    }
}
