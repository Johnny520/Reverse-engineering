package p079;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import p046.C6481;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6985 extends AbstractC7007 implements InterfaceC4465 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4686 f18692;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f18693;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6985(InterfaceC4485 interfaceC4485, C4686 c4686) {
        interfaceC4485.getClass();
        c4686.getClass();
        C4685 c4685 = c4686.f13692;
        super(interfaceC4485, C6481.f17772, c4685.m9324() ? C4685.f13685 : c4685.m9328(), InterfaceC4461.f13087);
        this.f18692 = c4686;
        this.f18693 = "package " + c4686 + " of " + interfaceC4485;
    }

    @Override // p079.AbstractC7008
    public String toString() {
        return this.f18693;
    }

    @Override // p079.AbstractC7007, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4485 mo9038() {
        InterfaceC4498 interfaceC4498Mo9038 = super.mo9038();
        interfaceC4498Mo9038.getClass();
        return (InterfaceC4485) interfaceC4498Mo9038;
    }

    @Override // p079.AbstractC7007, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC4461 mo9036() {
        return InterfaceC4461.f13087;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9037(InterfaceC4496 interfaceC4496, Object obj) {
        return interfaceC4496.mo280(this, obj);
    }
}
