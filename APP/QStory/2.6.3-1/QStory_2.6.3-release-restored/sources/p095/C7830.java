package p095;

import androidx.compose.foundation.text.C1850;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p068.InterfaceC7372;
import p114.C8068;
import p114.C8069;
import p117.C8093;
import p117.InterfaceC8083;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7830 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7829 f19104;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19105;

    public /* synthetic */ C7830(AbstractC7829 abstractC7829, int i) {
        this.f19105 = i;
        this.f19104 = abstractC7829;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f19105;
        AbstractC7829 abstractC7829 = this.f19104;
        switch (i) {
            case 0:
                InterfaceC8083 interfaceC8083Mo9773 = abstractC7829.mo9773();
                C1850 c1850 = new C1850(this, 24);
                C8068 c8068 = AbstractC5749.f14592;
                if (C8069.m13026(abstractC7829)) {
                    return C8069.m13029(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, abstractC7829.toString());
                }
                InterfaceC5705 interfaceC5705Mo9560 = abstractC7829.mo9560();
                if (interfaceC5705Mo9560 == null) {
                    AbstractC5749.m10407(12);
                    throw null;
                }
                if (interfaceC8083Mo9773 == null) {
                    AbstractC5749.m10407(13);
                    throw null;
                }
                List listM10404 = AbstractC5749.m10404(interfaceC5705Mo9560.getParameters());
                C5706.f14520.getClass();
                return AbstractC5725.m10375(C5706.f14521, interfaceC5705Mo9560, listM10404, false, interfaceC8083Mo9773, c1850);
            case 1:
                return new C8093(abstractC7829.mo9773());
            default:
                return new C7835(abstractC7829);
        }
    }
}
