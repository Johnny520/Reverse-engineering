package p087;

import java.util.Iterator;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7113 extends AbstractC7104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7183 f19054;

    public AbstractC7113(InterfaceC7183 interfaceC7183) {
        this.f19054 = interfaceC7183;
    }

    @Override // p089.InterfaceC7183
    public void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        int iMo12363 = mo12363(obj);
        InterfaceC7190 descriptor = getDescriptor();
        InterfaceC7187 interfaceC7187Mo10712 = interfaceC7185.mo10712(descriptor, iMo12363);
        Iterator itMo12370 = mo12370(obj);
        for (int i = 0; i < iMo12363; i++) {
            interfaceC7187Mo10712.mo6791(getDescriptor(), i, this.f19054, itMo12370.next());
        }
        interfaceC7187Mo10712.mo6801(descriptor);
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj) {
        mo12374(obj, i, interfaceC7188.mo6874(getDescriptor(), i, this.f19054, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract void mo12374(Object obj, int i, Object obj2);
}
