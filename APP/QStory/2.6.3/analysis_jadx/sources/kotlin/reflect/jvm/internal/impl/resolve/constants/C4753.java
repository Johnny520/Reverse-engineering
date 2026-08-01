package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4753 extends AbstractC4768 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f13898;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4753(List list, InterfaceC6558 interfaceC6558) {
        super(list);
        list.getClass();
        this.f13898 = interfaceC6558;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4882 mo9491(InterfaceC4486 interfaceC4486) {
        InterfaceC4477 interfaceC4477Mo9211;
        interfaceC4486.getClass();
        AbstractC4882 abstractC4882 = (AbstractC4882) this.f13898.invoke(interfaceC4486);
        if (!AbstractC6530.m12013(abstractC4882) && (((interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211()) == null || AbstractC6530.m12023(interfaceC4477Mo9211) == null) && !AbstractC6530.m12010(abstractC4882, AbstractC6527.f17910.f13696) && !AbstractC6530.m12010(abstractC4882, AbstractC6527.f17909.f13696) && !AbstractC6530.m12010(abstractC4882, AbstractC6527.f17913.f13696))) {
            AbstractC6530.m12010(abstractC4882, AbstractC6527.f17914.f13696);
        }
        return abstractC4882;
    }
}
