package p087;

import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7111 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7111 f19051 = new C7111(C7115.f19058);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7112 c7112 = (C7112) obj;
        c7112.getClass();
        char cMo6866 = interfaceC7188.mo6866(this.f19069, i);
        c7112.mo12368(c7112.mo12367() + 1);
        char[] cArr = c7112.f19053;
        int i2 = c7112.f19052;
        c7112.f19052 = i2 + 1;
        cArr[i2] = cMo6866;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        C7112 c7112 = new C7112();
        c7112.f19053 = cArr;
        c7112.f19052 = cArr.length;
        c7112.mo12368(10);
        return c7112;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        char[] cArr = (char[]) obj;
        interfaceC7187.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6792(this.f19069, i2, cArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new char[0];
    }
}
