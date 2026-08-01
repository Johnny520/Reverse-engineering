package p103;

import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7947 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7947 f19399 = new C7947(C7951.f19404);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7948 c7948 = (C7948) obj;
        c7948.getClass();
        byte bMo11212 = interfaceC8018.mo11212(this.f19409, i);
        c7948.mo12954(c7948.mo12953() + 1);
        byte[] bArr = c7948.f19401;
        int i2 = c7948.f19400;
        c7948.f19400 = i2 + 1;
        bArr[i2] = bMo11212;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12949(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12950(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        C7948 c7948 = new C7948();
        c7948.f19401 = bArr;
        c7948.f19400 = bArr.length;
        c7948.mo12954(10);
        return c7948;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        interfaceC8017.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11280(this.f19409, i2, bArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12952() {
        return new byte[0];
    }
}
