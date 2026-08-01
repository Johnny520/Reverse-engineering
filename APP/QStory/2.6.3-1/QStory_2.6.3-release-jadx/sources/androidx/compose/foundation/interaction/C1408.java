package androidx.compose.foundation.interaction;

import androidx.compose.runtime.InterfaceC2230;
import java.util.ArrayList;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.flow.InterfaceC6150;
import top.yukonga.miuix.kmp.interfaces.C6876;
import top.yukonga.miuix.kmp.interfaces.C6877;

/* JADX INFO: renamed from: androidx.compose.foundation.interaction.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1408 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f1964;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2230 f1965;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1966;

    public /* synthetic */ C1408(ArrayList arrayList, InterfaceC2230 interfaceC2230, int i) {
        this.f1966 = i;
        this.f1964 = arrayList;
        this.f1965 = interfaceC2230;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        int i = this.f1966;
        C6008 c6008 = C6008.f15084;
        InterfaceC2230 interfaceC2230 = this.f1965;
        ArrayList arrayList = this.f1964;
        switch (i) {
            case 0:
                InterfaceC1423 interfaceC1423 = (InterfaceC1423) obj;
                if (interfaceC1423 instanceof C1411) {
                    arrayList.add(interfaceC1423);
                } else if (interfaceC1423 instanceof C1410) {
                    arrayList.remove(((C1410) interfaceC1423).f1967);
                } else if (interfaceC1423 instanceof C1412) {
                    arrayList.remove(((C1412) interfaceC1423).f1968);
                }
                interfaceC2230.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                InterfaceC1423 interfaceC14232 = (InterfaceC1423) obj;
                if (interfaceC14232 instanceof C1407) {
                    arrayList.add(interfaceC14232);
                } else if (interfaceC14232 instanceof C1419) {
                    arrayList.remove(((C1419) interfaceC14232).f1973);
                }
                interfaceC2230.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 2:
                InterfaceC1423 interfaceC14233 = (InterfaceC1423) obj;
                if (interfaceC14233 instanceof C1418) {
                    arrayList.add(interfaceC14233);
                } else if (interfaceC14233 instanceof C1422) {
                    arrayList.remove(((C1422) interfaceC14233).f1974);
                }
                interfaceC2230.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 3:
                InterfaceC1423 interfaceC14234 = (InterfaceC1423) obj;
                if (interfaceC14234 instanceof C1416) {
                    arrayList.add(interfaceC14234);
                } else if (interfaceC14234 instanceof C1417) {
                    arrayList.remove(((C1417) interfaceC14234).f1972);
                } else if (interfaceC14234 instanceof C1413) {
                    arrayList.remove(((C1413) interfaceC14234).f1969);
                }
                interfaceC2230.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 4:
                interfaceC2230.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                InterfaceC1423 interfaceC14235 = (InterfaceC1423) obj;
                if (interfaceC14235 instanceof C6877) {
                    arrayList.add(interfaceC14235);
                } else if (interfaceC14235 instanceof C6876) {
                    arrayList.remove(((C6876) interfaceC14235).f16874);
                }
                interfaceC2230.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return c6008;
    }
}
