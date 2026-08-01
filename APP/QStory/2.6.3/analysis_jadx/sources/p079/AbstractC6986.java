package p079;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p046.C6482;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6986 extends AbstractC7008 implements InterfaceC4466 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4687 f18687;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f18688;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC6986(InterfaceC4486 interfaceC4486, C4687 c4687) {
        interfaceC4486.getClass();
        c4687.getClass();
        C4686 c4686 = c4687.f13696;
        super(interfaceC4486, C6482.f17768, c4686.m9314() ? C4686.f13689 : c4686.m9318(), InterfaceC4462.f13091);
        this.f18687 = c4687;
        this.f18688 = "package " + c4687 + " of " + interfaceC4486;
    }

    @Override // p079.AbstractC7009
    public String toString() {
        return this.f18688;
    }

    @Override // p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC4486 mo9028() {
        InterfaceC4499 interfaceC4499Mo9028 = super.mo9028();
        interfaceC4499Mo9028.getClass();
        return (InterfaceC4486) interfaceC4499Mo9028;
    }

    @Override // p079.AbstractC7008, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC4462 mo9026() {
        return InterfaceC4462.f13091;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9027(InterfaceC4497 interfaceC4497, Object obj) {
        return interfaceC4497.mo281(this, obj);
    }
}
