package p087;

import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7080 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7080 f18998 = new C7080(C7079.f18997);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7081 c7081 = (C7081) obj;
        c7081.getClass();
        float fMo6871 = interfaceC7188.mo6871(this.f19069, i);
        c7081.mo12368(c7081.mo12367() + 1);
        float[] fArr = c7081.f19000;
        int i2 = c7081.f18999;
        c7081.f18999 = i2 + 1;
        fArr[i2] = fMo6871;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        C7081 c7081 = new C7081();
        c7081.f19000 = fArr;
        c7081.f18999 = fArr.length;
        c7081.mo12368(10);
        return c7081;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        float[] fArr = (float[]) obj;
        interfaceC7187.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6803(this.f19069, i2, fArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new float[0];
    }
}
