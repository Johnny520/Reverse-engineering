package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4908;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import kotlin.reflect.jvm.internal.impl.types.checker.C4848;
import p052.InterfaceC6542;
import p101.C7247;
import p101.C7261;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4780 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4796 f13919;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13920;

    public /* synthetic */ C4780(C4796 c4796, int i) {
        this.f13920 = i;
        this.f13919 = c4796;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f13920;
        C4796 c4796 = this.f13919;
        switch (i) {
            case 0:
                C7247 c7247 = C7247.f19320;
                InterfaceC7253.f19340.getClass();
                return c4796.m9543(c7247, C7261.f19360, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
            default:
                AbstractC4860 abstractC4860 = c4796.f13979;
                C4800 c4800 = c4796.f13981;
                ((C4848) abstractC4860).getClass();
                c4800.getClass();
                Collection collectionMo9504 = ((AbstractC4908) c4800.mo9011()).mo9504();
                collectionMo9504.getClass();
                return collectionMo9504;
        }
    }
}
