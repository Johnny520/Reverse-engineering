package p087;

import java.util.Iterator;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7126 extends AbstractC7114 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7127 f19064;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7126(InterfaceC7184 interfaceC7184) {
        super(interfaceC7184);
        interfaceC7184.getClass();
        this.f19064 = new C7127(interfaceC7184.getDescriptor());
    }

    @Override // p087.AbstractC7105, p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        return m12402(interfaceC7187, null);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return this.f19064;
    }

    @Override // p087.AbstractC7114, p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        int iMo12390 = mo12390(obj);
        C7127 c7127 = this.f19064;
        InterfaceC7188 interfaceC7188Mo10769 = interfaceC7186.mo10769(c7127, iMo12390);
        mo12392(interfaceC7188Mo10769, obj, iMo12390);
        interfaceC7188Mo10769.mo10711(c7127);
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Iterator mo12397(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo12398(Object obj) {
        AbstractC7128 abstractC7128 = (AbstractC7128) obj;
        abstractC7128.getClass();
        return abstractC7128.mo12394();
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12399() {
        return (AbstractC7128) mo12391(mo12393());
    }

    @Override // p087.AbstractC7105
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo12400(Object obj) {
        AbstractC7128 abstractC7128 = (AbstractC7128) obj;
        abstractC7128.getClass();
        return abstractC7128.mo12396();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract void mo12392(InterfaceC7188 interfaceC7188, Object obj, int i);

    @Override // p087.AbstractC7114
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo12401(Object obj, int i, Object obj2) {
        ((AbstractC7128) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract Object mo12393();
}
