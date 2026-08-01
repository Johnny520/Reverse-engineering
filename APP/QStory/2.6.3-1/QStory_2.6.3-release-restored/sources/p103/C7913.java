package p103;

import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7913 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7913 f19343 = new C7913(C7912.f19342);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7914 c7914 = (C7914) obj;
        c7914.getClass();
        int iMo11230 = interfaceC8018.mo11230(this.f19409, i);
        c7914.mo12954(c7914.mo12953() + 1);
        int[] iArr = c7914.f19345;
        int i2 = c7914.f19344;
        c7914.f19344 = i2 + 1;
        iArr[i2] = iMo11230;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        C7914 c7914 = new C7914();
        c7914.f19345 = iArr;
        c7914.f19344 = iArr.length;
        c7914.mo12954(10);
        return c7914;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        int[] iArr = (int[]) obj;
        interfaceC8017.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11288(i2, iArr[i2], this.f19409);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new int[0];
    }
}
