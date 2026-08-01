package p087;

import kotlin.C5180;
import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7096 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7096 f19017 = new C7096(C7097.f19019);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7099 c7099 = (C7099) obj;
        c7099.getClass();
        long jMo10668 = interfaceC7189.mo10654(this.f19064, i).mo10668();
        c7099.mo12395(c7099.mo12394() + 1);
        long[] jArr = c7099.f19023;
        int i2 = c7099.f19022;
        c7099.f19022 = i2 + 1;
        jArr[i2] = jMo10668;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        return ((C5180) obj).f14743.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        long[] jArr = ((C5180) obj).f14743;
        C7099 c7099 = new C7099();
        c7099.f19023 = jArr;
        c7099.f19022 = jArr.length;
        c7099.mo12395(10);
        return c7099;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        long[] jArr = ((C5180) obj).f14743;
        interfaceC7188.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10734(this.f19064, i2).mo10651(jArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new C5180(new long[0]);
    }
}
