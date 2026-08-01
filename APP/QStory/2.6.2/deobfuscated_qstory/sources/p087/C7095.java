package p087;

import kotlin.C5179;
import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7095 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7095 f19022 = new C7095(C7096.f19024);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7098 c7098 = (C7098) obj;
        c7098.getClass();
        long jMo6869 = interfaceC7188.mo6863(this.f19069, i).mo6869();
        c7098.mo12368(c7098.mo12367() + 1);
        long[] jArr = c7098.f19028;
        int i2 = c7098.f19027;
        c7098.f19027 = i2 + 1;
        jArr[i2] = jMo6869;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        return ((C5179) obj).f14743.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        long[] jArr = ((C5179) obj).f14743;
        C7098 c7098 = new C7098();
        c7098.f19028 = jArr;
        c7098.f19027 = jArr.length;
        c7098.mo12368(10);
        return c7098;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        long[] jArr = ((C5179) obj).f14743;
        interfaceC7187.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6809(this.f19069, i2).mo6817(jArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new C5179(new long[0]);
    }
}
