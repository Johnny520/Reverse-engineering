package p087;

import java.util.Iterator;
import p089.InterfaceC7184;
import p090.InterfaceC7187;
import p090.InterfaceC7189;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7105 implements InterfaceC7184 {
    @Override // p089.InterfaceC7184
    public Object deserialize(InterfaceC7187 interfaceC7187) {
        return m12402(interfaceC7187, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m12402(InterfaceC7187 interfaceC7187, Object obj) {
        Object objMo12391 = obj != null ? mo12391(obj) : mo12399();
        int iMo12398 = mo12398(objMo12391);
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(getDescriptor());
        interfaceC7189Mo10676.getClass();
        while (true) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(getDescriptor());
            if (iMo10718 == -1) {
                interfaceC7189Mo10676.mo10678(getDescriptor());
                return mo12400(objMo12391);
            }
            mo12389(interfaceC7189Mo10676, iMo10718 + iMo12398, objMo12391);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract int mo12390(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Iterator mo12397(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract int mo12398(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Object mo12399();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract Object mo12400(Object obj);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public abstract Object mo12391(Object obj);
}
