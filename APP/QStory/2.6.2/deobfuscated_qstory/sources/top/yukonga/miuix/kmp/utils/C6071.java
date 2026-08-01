package top.yukonga.miuix.kmp.utils;

import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.InterfaceC1580;
import kotlin.C5175;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6071 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C6076 f16601;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16602;

    public /* synthetic */ C6071(C6076 c6076, int i) {
        this.f16602 = i;
        this.f16601 = c6076;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f16602;
        C6076 c6076 = this.f16601;
        switch (i) {
            case 0:
                InterfaceC6553 interfaceC6553 = (InterfaceC6553) obj;
                interfaceC6553.getClass();
                return AbstractC5398.m10473(c6076.m3857(), null, null, interfaceC6553, 3);
            default:
                InterfaceC1580 interfaceC1580 = (InterfaceC1580) obj;
                interfaceC1580.getClass();
                C6072 c6072 = c6076.f16624;
                C1573 c1573 = (C1573) interfaceC1580;
                c1573.m2847(c6072.f16608);
                c1573.m2848(c6072.f16607);
                c1573.m2842(true);
                return C5175.f14739;
        }
    }
}
