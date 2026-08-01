package androidx.compose.foundation.interaction;

import androidx.compose.runtime.InterfaceC1395;
import java.util.ArrayList;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.flow.InterfaceC5318;
import top.yukonga.miuix.kmp.interfaces.C6046;
import top.yukonga.miuix.kmp.interfaces.C6047;

/* JADX INFO: renamed from: androidx.compose.foundation.interaction.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0567 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f1619;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1395 f1620;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1621;

    public /* synthetic */ C0567(ArrayList arrayList, InterfaceC1395 interfaceC1395, int i) {
        this.f1621 = i;
        this.f1619 = arrayList;
        this.f1620 = interfaceC1395;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        int i = this.f1621;
        C5176 c5176 = C5176.f14739;
        InterfaceC1395 interfaceC1395 = this.f1620;
        ArrayList arrayList = this.f1619;
        switch (i) {
            case 0:
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
                if (interfaceC0582 instanceof C0570) {
                    arrayList.add(interfaceC0582);
                } else if (interfaceC0582 instanceof C0569) {
                    arrayList.remove(((C0569) interfaceC0582).f1622);
                } else if (interfaceC0582 instanceof C0571) {
                    arrayList.remove(((C0571) interfaceC0582).f1623);
                }
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                InterfaceC0582 interfaceC05822 = (InterfaceC0582) obj;
                if (interfaceC05822 instanceof C0566) {
                    arrayList.add(interfaceC05822);
                } else if (interfaceC05822 instanceof C0578) {
                    arrayList.remove(((C0578) interfaceC05822).f1628);
                }
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 2:
                InterfaceC0582 interfaceC05823 = (InterfaceC0582) obj;
                if (interfaceC05823 instanceof C0577) {
                    arrayList.add(interfaceC05823);
                } else if (interfaceC05823 instanceof C0581) {
                    arrayList.remove(((C0581) interfaceC05823).f1629);
                }
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 3:
                InterfaceC0582 interfaceC05824 = (InterfaceC0582) obj;
                if (interfaceC05824 instanceof C0575) {
                    arrayList.add(interfaceC05824);
                } else if (interfaceC05824 instanceof C0576) {
                    arrayList.remove(((C0576) interfaceC05824).f1627);
                } else if (interfaceC05824 instanceof C0572) {
                    arrayList.remove(((C0572) interfaceC05824).f1624);
                }
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 4:
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                InterfaceC0582 interfaceC05825 = (InterfaceC0582) obj;
                if (interfaceC05825 instanceof C6047) {
                    arrayList.add(interfaceC05825);
                } else if (interfaceC05825 instanceof C6046) {
                    arrayList.remove(((C6046) interfaceC05825).f16529);
                }
                interfaceC1395.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return c5176;
    }
}
