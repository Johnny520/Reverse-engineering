package p079;

import androidx.compose.foundation.text.C1012;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4916;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p052.InterfaceC6542;
import p098.C7238;
import p098.C7239;
import p101.C7263;
import p101.InterfaceC7253;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7000 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6999 f18764;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18765;

    public /* synthetic */ C7000(AbstractC6999 abstractC6999, int i) {
        this.f18765 = i;
        this.f18764 = abstractC6999;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f18765;
        AbstractC6999 abstractC6999 = this.f18764;
        switch (i) {
            case 0:
                InterfaceC7253 interfaceC7253Mo9224 = abstractC6999.mo9224();
                C1012 c1012 = new C1012(this, 24);
                C7238 c7238 = AbstractC4916.f14243;
                if (C7239.m12440(abstractC6999)) {
                    return C7239.m12443(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, abstractC6999.toString());
                }
                InterfaceC4872 interfaceC4872Mo9011 = abstractC6999.mo9011();
                if (interfaceC4872Mo9011 == null) {
                    AbstractC4916.m9854(12);
                    throw null;
                }
                if (interfaceC7253Mo9224 == null) {
                    AbstractC4916.m9854(13);
                    throw null;
                }
                List listM9851 = AbstractC4916.m9851(interfaceC4872Mo9011.getParameters());
                C4873.f14171.getClass();
                return AbstractC4892.m9822(C4873.f14172, interfaceC4872Mo9011, listM9851, false, interfaceC7253Mo9224, c1012);
            case 1:
                return new C7263(abstractC6999.mo9224());
            default:
                return new C7005(abstractC6999);
        }
    }
}
