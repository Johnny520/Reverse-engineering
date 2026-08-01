package kotlinx.serialization.json.internal;

import p088.AbstractC7159;
import p088.AbstractC7176;
import p091.InterfaceC7191;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5500 extends AbstractC5492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC7176 f15213;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5500(AbstractC7159 abstractC7159, AbstractC7176 abstractC7176, String str) {
        super(abstractC7159, str);
        abstractC7159.getClass();
        abstractC7176.getClass();
        this.f15213 = abstractC7176;
        this.f15181.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final AbstractC7176 mo10664() {
        return this.f15213;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final AbstractC7176 mo10673(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f15213;
        }
        C5925.m11310("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10718(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        return 0;
    }
}
