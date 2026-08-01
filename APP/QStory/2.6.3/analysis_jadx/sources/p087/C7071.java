package p087;

import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7071 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7071 f18974 = new C7071(C7072.f18976);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7075 c7075 = (C7075) obj;
        c7075.getClass();
        long jMo10699 = interfaceC7189.mo10699(this.f19064, i);
        c7075.mo12395(c7075.mo12394() + 1);
        long[] jArr = c7075.f18982;
        int i2 = c7075.f18981;
        c7075.f18981 = i2 + 1;
        jArr[i2] = jMo10699;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int mo12390(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object mo12391(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        C7075 c7075 = new C7075();
        c7075.f18982 = jArr;
        c7075.f18981 = jArr.length;
        c7075.mo12395(10);
        return c7075;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        long[] jArr = (long[]) obj;
        interfaceC7188.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10722(this.f19064, i2, jArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object mo12393() {
        return new long[0];
    }
}
