package androidx.compose.foundation.lazy;

import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.layout.InterfaceC1695;
import io.ktor.util.C4211;
import kotlin.C5176;
import p010.AbstractC6185;
import p052.InterfaceC6543;
import p176.AbstractC7741;
import p287.AbstractC8405;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0763 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2230;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2231;

    public /* synthetic */ C0763(InterfaceC1395 interfaceC1395, int i) {
        this.f2231 = i;
        this.f2230 = interfaceC1395;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f2231;
        C5176 c5176 = C5176.f14739;
        InterfaceC1395 interfaceC1395 = this.f2230;
        switch (i) {
            case 0:
                break;
            case 1:
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) interfaceC1395.getValue();
                if (interfaceC1695 == null) {
                    AbstractC7741.m13094("Required value was null.");
                    C4211.m8602();
                    break;
                }
                break;
            case 2:
                interfaceC1395.setValue(Boolean.TRUE);
                break;
            case 3:
                interfaceC1395.setValue(Boolean.FALSE);
                break;
            default:
                interfaceC1395.setValue(Boolean.FALSE);
                AbstractC6185.m11592(AbstractC8405.m13972(1292)); /* decoded: m13972(1292)=刷新失败 */
                break;
        }
        return c5176;
    }
}
