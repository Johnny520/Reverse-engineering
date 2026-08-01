package p103;

import kotlin.C6007;
import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7919 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7919 f19352 = new C7919(C7922.f19358);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7920 c7920 = (C7920) obj;
        c7920.getClass();
        short sMo11257 = interfaceC8018.mo11213(this.f19409, i).mo11257();
        c7920.mo12954(c7920.mo12953() + 1);
        short[] sArr = c7920.f19354;
        int i2 = c7920.f19353;
        c7920.f19353 = i2 + 1;
        sArr[i2] = sMo11257;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        return ((C6007) obj).f15083.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        short[] sArr = ((C6007) obj).f15083;
        C7920 c7920 = new C7920();
        c7920.f19354 = sArr;
        c7920.f19353 = sArr.length;
        c7920.mo12954(10);
        return c7920;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        short[] sArr = ((C6007) obj).f15083;
        interfaceC8017.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11293(this.f19409, i2).mo11207(sArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new C6007(new short[0]);
    }
}
