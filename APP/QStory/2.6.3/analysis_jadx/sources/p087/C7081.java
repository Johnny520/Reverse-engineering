package p087;

import p090.InterfaceC7188;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7081 extends AbstractC7126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7081 f18993 = new C7081(C7080.f18992);

    @Override // p087.AbstractC7114, p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        C7082 c7082 = (C7082) obj;
        c7082.getClass();
        float fMo10670 = interfaceC7189.mo10670(this.f19064, i);
        c7082.mo12395(c7082.mo12394() + 1);
        float[] fArr = c7082.f18995;
        int i2 = c7082.f18994;
        c7082.f18994 = i2 + 1;
        fArr[i2] = fMo10670;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12390(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12391(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        C7082 c7082 = new C7082();
        c7082.f18995 = fArr;
        c7082.f18994 = fArr.length;
        c7082.mo12395(10);
        return c7082;
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i) {
        float[] fArr = (float[]) obj;
        interfaceC7188.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7188.mo10726(this.f19064, i2, fArr[i2]);
        }
    }

    @Override // p087.AbstractC7126
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12393() {
        return new float[0];
    }
}
