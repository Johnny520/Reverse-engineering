package kotlinx.serialization.json.internal;

import p088.AbstractC7158;
import p088.AbstractC7175;
import p091.InterfaceC7190;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5499 extends AbstractC5491 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC7175 f15213;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5499(AbstractC7158 abstractC7158, AbstractC7175 abstractC7175, String str) {
        super(abstractC7158, str);
        abstractC7158.getClass();
        abstractC7175.getClass();
        this.f15213 = abstractC7175;
        this.f15181.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC7175 mo10648() {
        return this.f15213;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC7175 mo10651(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f15213;
        }
        C5919.m11249("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10672(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return 0;
    }
}
