package p079;

import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7011 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C7012 f18839;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18840;

    public /* synthetic */ C7011(C7012 c7012, int i) {
        this.f18840 = i;
        this.f18839 = c7012;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f18840;
        C7012 c7012 = this.f18839;
        switch (i) {
            case 0:
                C4690 c4690 = (C4690) obj;
                if (c4690 != null) {
                    return c7012.m12326(c4690, c7012.m12325().mo9175(c4690, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                C7012.m12324(8);
                throw null;
            default:
                C4690 c46902 = (C4690) obj;
                if (c46902 != null) {
                    return c7012.m12326(c46902, c7012.m12325().mo9177(c46902, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                }
                C7012.m12324(4);
                throw null;
        }
    }
}
