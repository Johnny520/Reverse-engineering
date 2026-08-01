package p046;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p019.C6263;
import p049.AbstractC6526;
import p049.AbstractC6530;
import p052.InterfaceC6558;
import p079.AbstractC6989;
import p079.C6988;
import p101.C7265;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6476 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC6530 f17763;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17764;

    public /* synthetic */ C6476(AbstractC6530 abstractC6530, int i) {
        this.f17764 = i;
        this.f17763 = abstractC6530;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f17764;
        AbstractC6530 abstractC6530 = this.f17763;
        switch (i) {
            case 0:
                InterfaceC4486 interfaceC4486 = (InterfaceC4486) obj;
                interfaceC4486.getClass();
                return interfaceC4486.mo9061().m12034(abstractC6530.m12029(), Variance.INVARIANT);
            default:
                C4691 c4691 = (C4691) obj;
                C6988 c6988M12037 = abstractC6530.m12037();
                C4687 c4687 = AbstractC6526.f17853;
                C7265 c7265 = c6988M12037.mo9062(c4687).f18814;
                if (c7265 == null) {
                    AbstractC6530.m12020(11);
                    throw null;
                }
                InterfaceC4477 interfaceC4477Mo9155 = c7265.mo9155(c4691, NoLookupLocation.FROM_BUILTINS);
                if (interfaceC4477Mo9155 == null) {
                    C6263.m11776(c4687.m9321(c4691), "Built-in class ", " is not found");
                    return null;
                }
                if (interfaceC4477Mo9155 instanceof AbstractC6989) {
                    return (AbstractC6989) interfaceC4477Mo9155;
                }
                throw new AssertionError("Must be a class descriptor " + c4691 + ", but was " + interfaceC4477Mo9155);
        }
    }
}
