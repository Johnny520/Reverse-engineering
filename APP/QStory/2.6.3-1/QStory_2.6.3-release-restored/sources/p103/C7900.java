package p103;

import p106.InterfaceC8017;
import p106.InterfaceC8018;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7900 extends AbstractC7955 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7900 f19319 = new C7900(C7901.f19321);

    @Override // p103.AbstractC7943, p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        C7904 c7904 = (C7904) obj;
        c7904.getClass();
        long jMo11258 = interfaceC8018.mo11258(this.f19409, i);
        c7904.mo12954(c7904.mo12953() + 1);
        long[] jArr = c7904.f19327;
        int i2 = c7904.f19326;
        c7904.f19326 = i2 + 1;
        jArr[i2] = jMo11258;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo12949(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object mo12950(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        C7904 c7904 = new C7904();
        c7904.f19327 = jArr;
        c7904.f19326 = jArr.length;
        c7904.mo12954(10);
        return c7904;
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i) {
        long[] jArr = (long[]) obj;
        interfaceC8017.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC8017.mo11281(this.f19409, i2, jArr[i2]);
        }
    }

    @Override // p103.AbstractC7955
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object mo12952() {
        return new long[0];
    }
}
