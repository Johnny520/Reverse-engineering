package p103;

import java.util.Iterator;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7955 extends AbstractC7943 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7956 f19409;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7955(InterfaceC8013 interfaceC8013) {
        super(interfaceC8013);
        interfaceC8013.getClass();
        this.f19409 = new C7956(interfaceC8013.getDescriptor());
    }

    @Override // p103.AbstractC7934, p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        return m12961(interfaceC8016, null);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return this.f19409;
    }

    @Override // p103.AbstractC7943, p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        int iMo12949 = mo12949(obj);
        C7956 c7956 = this.f19409;
        InterfaceC8017 interfaceC8017Mo11328 = interfaceC8015.mo11328(c7956, iMo12949);
        mo12951(interfaceC8017Mo11328, obj, iMo12949);
        interfaceC8017Mo11328.mo11270(c7956);
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Iterator mo12956(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo12957(Object obj) {
        AbstractC7957 abstractC7957 = (AbstractC7957) obj;
        abstractC7957.getClass();
        return abstractC7957.mo12953();
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12958() {
        return (AbstractC7957) mo12950(mo12952());
    }

    @Override // p103.AbstractC7934
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo12959(Object obj) {
        AbstractC7957 abstractC7957 = (AbstractC7957) obj;
        abstractC7957.getClass();
        return abstractC7957.mo12955();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract void mo12951(InterfaceC8017 interfaceC8017, Object obj, int i);

    @Override // p103.AbstractC7943
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo12960(Object obj, int i, Object obj2) {
        ((AbstractC7957) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract Object mo12952();
}
