package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.layout.InterfaceC1695;
import io.ktor.util.C4211;
import p052.InterfaceC6543;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0812 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2316;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2317;

    public /* synthetic */ C0812(InterfaceC1395 interfaceC1395, int i) {
        this.f2317 = i;
        this.f2316 = interfaceC1395;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f2317;
        InterfaceC1395 interfaceC1395 = this.f2316;
        switch (i) {
            case 0:
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) interfaceC1395.getValue();
                if (interfaceC1695 == null) {
                    AbstractC7741.m13094("Required value was null.");
                    C4211.m8602();
                }
                break;
            default:
                InterfaceC1695 interfaceC16952 = (InterfaceC1695) interfaceC1395.getValue();
                if (interfaceC16952 == null) {
                    AbstractC7741.m13094("Required value was null.");
                    C4211.m8602();
                }
                break;
        }
        return null;
    }
}
