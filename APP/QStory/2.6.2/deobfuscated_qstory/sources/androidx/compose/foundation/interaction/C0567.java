package androidx.compose.foundation.interaction;

import androidx.compose.runtime.InterfaceC1395;
import java.util.ArrayList;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlinx.coroutines.flow.InterfaceC5317;
import top.yukonga.miuix.kmp.interfaces.C6040;
import top.yukonga.miuix.kmp.interfaces.C6041;

/* JADX INFO: renamed from: androidx.compose.foundation.interaction.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0567 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f1618;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f1619;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1620;

    public /* synthetic */ C0567(ArrayList arrayList, InterfaceC1395 interfaceC1395, int i) {
        this.f1620 = i;
        this.f1618 = arrayList;
        this.f1619 = interfaceC1395;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        int i = this.f1620;
        C5175 c5175 = C5175.f14739;
        InterfaceC1395 interfaceC1395 = this.f1619;
        ArrayList arrayList = this.f1618;
        switch (i) {
            case 0:
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
                if (interfaceC0582 instanceof C0570) {
                    arrayList.add(interfaceC0582);
                } else if (interfaceC0582 instanceof C0569) {
                    arrayList.remove(((C0569) interfaceC0582).f1621);
                } else if (interfaceC0582 instanceof C0571) {
                    arrayList.remove(((C0571) interfaceC0582).f1622);
                }
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                InterfaceC0582 interfaceC05822 = (InterfaceC0582) obj;
                if (interfaceC05822 instanceof C0566) {
                    arrayList.add(interfaceC05822);
                } else if (interfaceC05822 instanceof C0578) {
                    arrayList.remove(((C0578) interfaceC05822).f1627);
                }
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 2:
                InterfaceC0582 interfaceC05823 = (InterfaceC0582) obj;
                if (interfaceC05823 instanceof C0577) {
                    arrayList.add(interfaceC05823);
                } else if (interfaceC05823 instanceof C0581) {
                    arrayList.remove(((C0581) interfaceC05823).f1628);
                }
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 3:
                InterfaceC0582 interfaceC05824 = (InterfaceC0582) obj;
                if (interfaceC05824 instanceof C0575) {
                    arrayList.add(interfaceC05824);
                } else if (interfaceC05824 instanceof C0576) {
                    arrayList.remove(((C0576) interfaceC05824).f1626);
                } else if (interfaceC05824 instanceof C0572) {
                    arrayList.remove(((C0572) interfaceC05824).f1623);
                }
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 4:
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                InterfaceC0582 interfaceC05825 = (InterfaceC0582) obj;
                if (interfaceC05825 instanceof C6041) {
                    arrayList.add(interfaceC05825);
                } else if (interfaceC05825 instanceof C6040) {
                    arrayList.remove(((C6040) interfaceC05825).f16520);
                }
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return c5175;
    }
}
