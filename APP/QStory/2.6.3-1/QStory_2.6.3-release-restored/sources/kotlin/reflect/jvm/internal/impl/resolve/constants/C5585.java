package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5585 extends AbstractC5600 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f14243;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5585(List list, InterfaceC7387 interfaceC7387) {
        super(list);
        list.getClass();
        this.f14243 = interfaceC7387;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC5714 mo10050(InterfaceC5318 interfaceC5318) {
        InterfaceC5309 interfaceC5309Mo9770;
        interfaceC5318.getClass();
        AbstractC5714 abstractC5714 = (AbstractC5714) this.f14243.invoke(interfaceC5318);
        if (!AbstractC7359.m12572(abstractC5714) && (((interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770()) == null || AbstractC7359.m12582(interfaceC5309Mo9770) == null) && !AbstractC7359.m12569(abstractC5714, AbstractC7356.f18255.f14041) && !AbstractC7359.m12569(abstractC5714, AbstractC7356.f18254.f14041) && !AbstractC7359.m12569(abstractC5714, AbstractC7356.f18258.f14041))) {
            AbstractC7359.m12569(abstractC5714, AbstractC7356.f18259.f14041);
        }
        return abstractC5714;
    }
}
