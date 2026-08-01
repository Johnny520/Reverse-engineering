package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.layout.InterfaceC1695;
import io.ktor.util.C4210;
import p052.InterfaceC6542;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0812 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f2315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2316;

    public /* synthetic */ C0812(InterfaceC1395 interfaceC1395, int i) {
        this.f2316 = i;
        this.f2315 = interfaceC1395;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f2316;
        InterfaceC1395 interfaceC1395 = this.f2315;
        switch (i) {
            case 0:
                InterfaceC1695 interfaceC1695 = (InterfaceC1695) interfaceC1395.getValue();
                if (interfaceC1695 == null) {
                    AbstractC7740.m13066("Required value was null.");
                    C4210.m8612();
                }
                break;
            default:
                InterfaceC1695 interfaceC16952 = (InterfaceC1695) interfaceC1395.getValue();
                if (interfaceC16952 == null) {
                    AbstractC7740.m13066("Required value was null.");
                    C4210.m8612();
                }
                break;
        }
        return null;
    }
}
