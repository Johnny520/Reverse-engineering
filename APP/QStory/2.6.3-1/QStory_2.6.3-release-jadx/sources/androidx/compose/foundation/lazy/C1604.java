package androidx.compose.foundation.lazy;

import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.runtime.InterfaceC2230;
import io.ktor.util.C5043;
import kotlin.C6008;
import p026.AbstractC7014;
import p068.InterfaceC7372;
import p192.AbstractC8570;
import p303.AbstractC9234;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1604 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2230 f2575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2576;

    public /* synthetic */ C1604(InterfaceC2230 interfaceC2230, int i) {
        this.f2576 = i;
        this.f2575 = interfaceC2230;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f2576;
        C6008 c6008 = C6008.f15084;
        InterfaceC2230 interfaceC2230 = this.f2575;
        switch (i) {
            case 0:
                break;
            case 1:
                InterfaceC2530 interfaceC2530 = (InterfaceC2530) interfaceC2230.getValue();
                if (interfaceC2530 == null) {
                    AbstractC8570.m13653("Required value was null.");
                    C5043.m9161();
                    break;
                }
                break;
            case 2:
                interfaceC2230.setValue(Boolean.TRUE);
                break;
            case 3:
                interfaceC2230.setValue(Boolean.FALSE);
                break;
            default:
                interfaceC2230.setValue(Boolean.FALSE);
                AbstractC7014.m12151(AbstractC9234.m14531(1292));
                break;
        }
        return c6008;
    }
}
