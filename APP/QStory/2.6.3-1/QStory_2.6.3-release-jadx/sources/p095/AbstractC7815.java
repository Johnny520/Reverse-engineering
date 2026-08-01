package p095;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import p062.C7311;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7815 extends AbstractC7837 implements InterfaceC5298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5519 f19032;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String f19033;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC7815(InterfaceC5318 interfaceC5318, C5519 c5519) {
        interfaceC5318.getClass();
        c5519.getClass();
        C5518 c5518 = c5519.f14041;
        super(interfaceC5318, C7311.f18113, c5518.m9873() ? C5518.f14034 : c5518.m9877(), InterfaceC5294.f13436);
        this.f19032 = c5519;
        this.f19033 = "package " + c5519 + " of " + interfaceC5318;
    }

    @Override // p095.AbstractC7838
    public String toString() {
        return this.f19033;
    }

    @Override // p095.AbstractC7837, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final InterfaceC5318 mo9587() {
        InterfaceC5331 interfaceC5331Mo9587 = super.mo9587();
        interfaceC5331Mo9587.getClass();
        return (InterfaceC5318) interfaceC5331Mo9587;
    }

    @Override // p095.AbstractC7837, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC5294 mo9585() {
        return InterfaceC5294.f13436;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return interfaceC5329.mo841(this, obj);
    }
}
