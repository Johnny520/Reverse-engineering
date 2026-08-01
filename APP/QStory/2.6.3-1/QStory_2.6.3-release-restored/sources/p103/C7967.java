package p103;

import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7967 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7967 f19435 = new C7967(C7963.f19432);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7968 c7968 = (C7968) obj;
        c7968.getClass();
        short sMo11228 = interfaceC8018.mo11228(this.f19409, i);
        c7968.mo12954(c7968.mo12953() + 1);
        short[] sArr = c7968.f19437;
        int i2 = c7968.f19436;
        c7968.f19436 = i2 + 1;
        sArr[i2] = sMo11228;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        C7968 c7968 = new C7968();
        c7968.f19437 = sArr;
        c7968.f19436 = sArr.length;
        c7968.mo12954(10);
        return c7968;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        short[] sArr = (short[]) obj;
        interfaceC8017.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11284(this.f19409, i2, sArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new short[0];
    }
}
