package p062;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p035.C7092;
import p065.AbstractC7355;
import p065.AbstractC7359;
import p068.InterfaceC7387;
import p095.AbstractC7818;
import p095.C7817;
import p117.C8094;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7305 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC7359 f18108;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18109;

    public /* synthetic */ C7305(AbstractC7359 abstractC7359, int i) {
        this.f18109 = i;
        this.f18108 = abstractC7359;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f18109;
        AbstractC7359 abstractC7359 = this.f18108;
        switch (i) {
            case 0:
                InterfaceC5318 interfaceC5318 = (InterfaceC5318) obj;
                interfaceC5318.getClass();
                return interfaceC5318.mo9620().m12593(abstractC7359.m12588(), Variance.INVARIANT);
            default:
                C5523 c5523 = (C5523) obj;
                C7817 c7817M12596 = abstractC7359.m12596();
                C5519 c5519 = AbstractC7355.f18198;
                C8094 c8094 = c7817M12596.mo9621(c5519).f19159;
                if (c8094 == null) {
                    AbstractC7359.m12579(11);
                    throw null;
                }
                InterfaceC5309 interfaceC5309Mo9714 = c8094.mo9714(c5523, NoLookupLocation.FROM_BUILTINS);
                if (interfaceC5309Mo9714 == null) {
                    C7092.m12335(c5519.m9880(c5523), "Built-in class ", " is not found");
                    return null;
                }
                if (interfaceC5309Mo9714 instanceof AbstractC7818) {
                    return (AbstractC7818) interfaceC5309Mo9714;
                }
                throw new AssertionError("Must be a class descriptor " + c5523 + ", but was " + interfaceC5309Mo9714);
        }
    }
}
