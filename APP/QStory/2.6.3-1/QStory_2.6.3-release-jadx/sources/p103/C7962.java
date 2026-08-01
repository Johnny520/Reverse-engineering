package p103;

import kotlin.C6009;
import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7962 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7962 f19430 = new C7962(C7961.f19429);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7959 c7959 = (C7959) obj;
        c7959.getClass();
        byte bMo11259 = interfaceC8018.mo11213(this.f19409, i).mo11259();
        c7959.mo12954(c7959.mo12953() + 1);
        byte[] bArr = c7959.f19423;
        int i2 = c7959.f19422;
        c7959.f19422 = i2 + 1;
        bArr[i2] = bMo11259;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        return ((C6009) obj).f15085.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        byte[] bArr = ((C6009) obj).f15085;
        C7959 c7959 = new C7959();
        c7959.f19423 = bArr;
        c7959.f19422 = bArr.length;
        c7959.mo12954(10);
        return c7959;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        byte[] bArr = ((C6009) obj).f15085;
        interfaceC8017.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11293(this.f19409, i2).mo11206(bArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new C6009(new byte[0]);
    }
}
