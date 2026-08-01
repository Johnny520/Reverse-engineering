package p046;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p022.C6267;
import p049.AbstractC6525;
import p049.AbstractC6529;
import p052.InterfaceC6557;
import p079.AbstractC6988;
import p079.C6987;
import p101.C7264;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6475 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC6529 f17767;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17768;

    public /* synthetic */ C6475(AbstractC6529 abstractC6529, int i) {
        this.f17768 = i;
        this.f17767 = abstractC6529;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f17768;
        AbstractC6529 abstractC6529 = this.f17767;
        switch (i) {
            case 0:
                InterfaceC4485 interfaceC4485 = (InterfaceC4485) obj;
                interfaceC4485.getClass();
                return interfaceC4485.mo9071().m11991(abstractC6529.m11986(), Variance.INVARIANT);
            default:
                C4690 c4690 = (C4690) obj;
                C6987 c6987M11994 = abstractC6529.m11994();
                C4686 c4686 = AbstractC6525.f17857;
                C7264 c7264 = c6987M11994.mo9072(c4686).f18819;
                if (c7264 == null) {
                    AbstractC6529.m11977(11);
                    throw null;
                }
                InterfaceC4476 interfaceC4476Mo9165 = c7264.mo9165(c4690, NoLookupLocation.FROM_BUILTINS);
                if (interfaceC4476Mo9165 == null) {
                    C6267.m11759(c4686.m9331(c4690), "Built-in class ", " is not found");
                    return null;
                }
                if (interfaceC4476Mo9165 instanceof AbstractC6988) {
                    return (AbstractC6988) interfaceC4476Mo9165;
                }
                throw new AssertionError("Must be a class descriptor " + c4690 + ", but was " + interfaceC4476Mo9165);
        }
    }
}
