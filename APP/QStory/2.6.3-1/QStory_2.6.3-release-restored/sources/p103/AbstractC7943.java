package p103;

import java.util.Iterator;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7943 extends AbstractC7934 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8013 f19394;

    public AbstractC7943(InterfaceC8013 interfaceC8013) {
        this.f19394 = interfaceC8013;
    }

    @Override // p105.InterfaceC8013
    public void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        int iMo12949 = mo12949(obj);
        InterfaceC8020 descriptor = getDescriptor();
        InterfaceC8017 interfaceC8017Mo11328 = interfaceC8015.mo11328(descriptor, iMo12949);
        Iterator itMo12956 = mo12956(obj);
        for (int i = 0; i < iMo12949; i++) {
            interfaceC8017Mo11328.mo11278(getDescriptor(), i, this.f19394, itMo12956.next());
        }
        interfaceC8017Mo11328.mo11270(descriptor);
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo12948(InterfaceC8018 interfaceC8018, int i, Object obj) {
        mo12960(obj, i, interfaceC8018.mo11233(getDescriptor(), i, this.f19394, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract void mo12960(Object obj, int i, Object obj2);
}
