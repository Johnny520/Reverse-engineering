package p087;

import java.util.Iterator;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7125 extends AbstractC7113 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7126 f19069;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7125(InterfaceC7183 interfaceC7183) {
        super(interfaceC7183);
        interfaceC7183.getClass();
        this.f19069 = new C7126(interfaceC7183.getDescriptor());
    }

    @Override // p087.AbstractC7104, p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        return m12375(interfaceC7186, null);
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return this.f19069;
    }

    @Override // p087.AbstractC7113, p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        int iMo12363 = mo12363(obj);
        C7126 c7126 = this.f19069;
        InterfaceC7187 interfaceC7187Mo10712 = interfaceC7185.mo10712(c7126, iMo12363);
        mo12365(interfaceC7187Mo10712, obj, iMo12363);
        interfaceC7187Mo10712.mo6801(c7126);
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Iterator mo12370(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo12371(Object obj) {
        AbstractC7127 abstractC7127 = (AbstractC7127) obj;
        abstractC7127.getClass();
        return abstractC7127.mo12367();
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo12372() {
        return (AbstractC7127) mo12364(mo12366());
    }

    @Override // p087.AbstractC7104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Object mo12373(Object obj) {
        AbstractC7127 abstractC7127 = (AbstractC7127) obj;
        abstractC7127.getClass();
        return abstractC7127.mo12369();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract void mo12365(InterfaceC7187 interfaceC7187, Object obj, int i);

    @Override // p087.AbstractC7113
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo12374(Object obj, int i, Object obj2) {
        ((AbstractC7127) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public abstract Object mo12366();
}
