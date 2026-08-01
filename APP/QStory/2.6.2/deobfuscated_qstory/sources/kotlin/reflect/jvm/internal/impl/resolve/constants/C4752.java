package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4752 extends AbstractC4767 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f13894;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4752(List list, InterfaceC6557 interfaceC6557) {
        super(list);
        list.getClass();
        this.f13894 = interfaceC6557;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4881 mo9501(InterfaceC4485 interfaceC4485) {
        InterfaceC4476 interfaceC4476Mo9221;
        interfaceC4485.getClass();
        AbstractC4881 abstractC4881 = (AbstractC4881) this.f13894.invoke(interfaceC4485);
        if (!AbstractC6529.m11970(abstractC4881) && (((interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221()) == null || AbstractC6529.m11980(interfaceC4476Mo9221) == null) && !AbstractC6529.m11967(abstractC4881, AbstractC6526.f17914.f13692) && !AbstractC6529.m11967(abstractC4881, AbstractC6526.f17913.f13692) && !AbstractC6529.m11967(abstractC4881, AbstractC6526.f17917.f13692))) {
            AbstractC6529.m11967(abstractC4881, AbstractC6526.f17918.f13692);
        }
        return abstractC4881;
    }
}
