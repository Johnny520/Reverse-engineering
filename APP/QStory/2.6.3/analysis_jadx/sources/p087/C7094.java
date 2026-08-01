package p087;

import kotlin.C5182;
import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7094 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7094 f19014 = new C7094(C7098.f19021);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7095 c7095 = (C7095) obj;
        c7095.getClass();
        int iMo10665 = interfaceC7189.mo10654(this.f19064, i).mo10665();
        c7095.mo12395(c7095.mo12394() + 1);
        int[] iArr = c7095.f19016;
        int i2 = c7095.f19015;
        c7095.f19015 = i2 + 1;
        iArr[i2] = iMo10665;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        return ((C5182) obj).f14745.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        int[] iArr = ((C5182) obj).f14745;
        C7095 c7095 = new C7095();
        c7095.f19016 = iArr;
        c7095.f19015 = iArr.length;
        c7095.mo12395(10);
        return c7095;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        int[] iArr = ((C5182) obj).f14745;
        interfaceC7188.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10734(this.f19064, i2).mo10645(iArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new C5182(new int[0]);
    }
}
