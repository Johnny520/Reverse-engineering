package p103;

import kotlin.C6014;
import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7923 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7923 f19359 = new C7923(C7927.f19366);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7924 c7924 = (C7924) obj;
        c7924.getClass();
        int iMo11224 = interfaceC8018.mo11213(this.f19409, i).mo11224();
        c7924.mo12954(c7924.mo12953() + 1);
        int[] iArr = c7924.f19361;
        int i2 = c7924.f19360;
        c7924.f19360 = i2 + 1;
        iArr[i2] = iMo11224;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        return ((C6014) obj).f15090.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        int[] iArr = ((C6014) obj).f15090;
        C7924 c7924 = new C7924();
        c7924.f19361 = iArr;
        c7924.f19360 = iArr.length;
        c7924.mo12954(10);
        return c7924;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        int[] iArr = ((C6014) obj).f15090;
        interfaceC8017.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11293(this.f19409, i2).mo11204(iArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new C6014(new int[0]);
    }
}
