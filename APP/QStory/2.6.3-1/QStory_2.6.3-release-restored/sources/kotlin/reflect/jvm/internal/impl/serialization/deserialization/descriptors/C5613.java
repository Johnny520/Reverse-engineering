package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5741;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import kotlin.reflect.jvm.internal.impl.types.checker.C5681;
import p068.InterfaceC7372;
import p117.C8077;
import p117.C8091;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5613 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5629 f14268;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14269;

    public /* synthetic */ C5613(C5629 c5629, int i) {
        this.f14269 = i;
        this.f14268 = c5629;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f14269;
        C5629 c5629 = this.f14268;
        switch (i) {
            case 0:
                C8077 c8077 = C8077.f19660;
                InterfaceC8083.f19680.getClass();
                return c5629.m10092(c8077, C8091.f19700, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
            default:
                AbstractC5693 abstractC5693 = c5629.f14328;
                C5633 c5633 = c5629.f14330;
                ((C5681) abstractC5693).getClass();
                c5633.getClass();
                Collection collectionMo10053 = ((AbstractC5741) c5633.mo9560()).mo10053();
                collectionMo10053.getClass();
                return collectionMo10053;
        }
    }
}
