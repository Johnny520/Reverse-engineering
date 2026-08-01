package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4909;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import kotlin.reflect.jvm.internal.impl.types.checker.C4849;
import p052.InterfaceC6543;
import p101.C7248;
import p101.C7262;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4781 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4797 f13923;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13924;

    public /* synthetic */ C4781(C4797 c4797, int i) {
        this.f13924 = i;
        this.f13923 = c4797;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f13924;
        C4797 c4797 = this.f13923;
        switch (i) {
            case 0:
                C7248 c7248 = C7248.f19315;
                InterfaceC7254.f19335.getClass();
                return c4797.m9533(c7248, C7262.f19355, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
            default:
                AbstractC4861 abstractC4861 = c4797.f13983;
                C4801 c4801 = c4797.f13985;
                ((C4849) abstractC4861).getClass();
                c4801.getClass();
                Collection collectionMo9494 = ((AbstractC4909) c4801.mo9001()).mo9494();
                collectionMo9494.getClass();
                return collectionMo9494;
        }
    }
}
