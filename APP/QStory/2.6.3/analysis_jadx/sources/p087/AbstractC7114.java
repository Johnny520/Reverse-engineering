package p087;

import java.util.Iterator;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7114 extends AbstractC7105 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7184 f19049;

    public AbstractC7114(InterfaceC7184 interfaceC7184) {
        this.f19049 = interfaceC7184;
    }

    @Override // p089.InterfaceC7184
    public void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        int iMo12390 = mo12390(obj);
        InterfaceC7191 descriptor = getDescriptor();
        InterfaceC7188 interfaceC7188Mo10769 = interfaceC7186.mo10769(descriptor, iMo12390);
        Iterator itMo12397 = mo12397(obj);
        for (int i = 0; i < iMo12390; i++) {
            interfaceC7188Mo10769.mo10719(getDescriptor(), i, this.f19049, itMo12397.next());
        }
        interfaceC7188Mo10769.mo10711(descriptor);
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo12389(InterfaceC7189 interfaceC7189, int i, Object obj) {
        mo12401(obj, i, interfaceC7189.mo10674(getDescriptor(), i, this.f19049, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract void mo12401(Object obj, int i, Object obj2);
}
