package p087;

import java.util.Iterator;
import p089.InterfaceC7183;
import p090.InterfaceC7186;
import p090.InterfaceC7188;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7104 implements InterfaceC7183 {
    @Override // p089.InterfaceC7183
    public Object deserialize(InterfaceC7186 interfaceC7186) {
        return m12375(interfaceC7186, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo12362(InterfaceC7188 interfaceC7188, int i, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m12375(InterfaceC7186 interfaceC7186, Object obj) {
        Object objMo12364 = obj != null ? mo12364(obj) : mo12372();
        int iMo12371 = mo12371(objMo12364);
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(getDescriptor());
        interfaceC7188Mo6876.getClass();
        while (true) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(getDescriptor());
            if (iMo10672 == -1) {
                interfaceC7188Mo6876.mo6877(getDescriptor());
                return mo12373(objMo12364);
            }
            mo12362(interfaceC7188Mo6876, iMo10672 + iMo12371, objMo12364);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract int mo12363(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Iterator mo12370(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract int mo12371(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo12372();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract Object mo12373(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract Object mo12364(Object obj);
}
