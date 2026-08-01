package p087;

import kotlin.C5174;
import p090.InterfaceC7187;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7089 extends AbstractC7125 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7089 f19012 = new C7089(C7092.f19018);

    @Override // p087.AbstractC7113, p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        C7090 c7090 = (C7090) obj;
        c7090.getClass();
        short sMo6885 = interfaceC7188.mo6863(this.f19069, i).mo6885();
        c7090.mo12368(c7090.mo12367() + 1);
        short[] sArr = c7090.f19014;
        int i2 = c7090.f19013;
        c7090.f19013 = i2 + 1;
        sArr[i2] = sMo6885;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12363(Object obj) {
        return ((C5174) obj).f14738.length;
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo12364(Object obj) {
        short[] sArr = ((C5174) obj).f14738;
        C7090 c7090 = new C7090();
        c7090.f19014 = sArr;
        c7090.f19013 = sArr.length;
        c7090.mo12368(10);
        return c7090;
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i) {
        short[] sArr = ((C5174) obj).f14738;
        interfaceC7187.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC7187.mo6809(this.f19069, i2).mo6812(sArr[i2]);
        }
    }

    @Override // p087.AbstractC7125
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo12366() {
        return new C5174(new short[0]);
    }
}
