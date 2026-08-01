package p079;

import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7012 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C7013 f18834;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18835;

    public /* synthetic */ C7012(C7013 c7013, int i) {
        this.f18835 = i;
        this.f18834 = c7013;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f18835;
        C7013 c7013 = this.f18834;
        switch (i) {
            case 0:
                C4691 c4691 = (C4691) obj;
                if (c4691 != null) {
                    return c7013.m12353(c4691, c7013.m12352().mo9165(c4691, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                C7013.m12351(8);
                throw null;
            default:
                C4691 c46912 = (C4691) obj;
                if (c46912 != null) {
                    return c7013.m12353(c46912, c7013.m12352().mo9167(c46912, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                C7013.m12351(4);
                throw null;
        }
    }
}
