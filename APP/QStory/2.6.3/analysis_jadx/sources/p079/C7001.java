package p079;

import androidx.compose.foundation.text.C1012;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4917;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p052.InterfaceC6543;
import p098.C7239;
import p098.C7240;
import p101.C7264;
import p101.InterfaceC7254;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7001 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7000 f18759;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18760;

    public /* synthetic */ C7001(AbstractC7000 abstractC7000, int i) {
        this.f18760 = i;
        this.f18759 = abstractC7000;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f18760;
        AbstractC7000 abstractC7000 = this.f18759;
        switch (i) {
            case 0:
                InterfaceC7254 interfaceC7254Mo9214 = abstractC7000.mo9214();
                C1012 c1012 = new C1012(this, 24);
                C7239 c7239 = AbstractC4917.f14247;
                if (C7240.m12467(abstractC7000)) {
                    return C7240.m12470(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, abstractC7000.toString());
                }
                InterfaceC4873 interfaceC4873Mo9001 = abstractC7000.mo9001();
                if (interfaceC4873Mo9001 == null) {
                    AbstractC4917.m9848(12);
                    throw null;
                }
                if (interfaceC7254Mo9214 == null) {
                    AbstractC4917.m9848(13);
                    throw null;
                }
                List listM9845 = AbstractC4917.m9845(interfaceC4873Mo9001.getParameters());
                C4874.f14175.getClass();
                return AbstractC4893.m9816(C4874.f14176, interfaceC4873Mo9001, listM9845, false, interfaceC7254Mo9214, c1012);
            case 1:
                return new C7264(abstractC7000.mo9214());
            default:
                return new C7006(abstractC7000);
        }
    }
}
