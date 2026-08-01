package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.interaction.C1407;
import androidx.compose.foundation.interaction.C1413;
import androidx.compose.foundation.interaction.C1416;
import androidx.compose.foundation.interaction.C1417;
import androidx.compose.foundation.interaction.C1418;
import androidx.compose.foundation.interaction.C1419;
import androidx.compose.foundation.interaction.C1422;
import androidx.compose.foundation.interaction.InterfaceC1423;
import androidx.compose.p001ui.AbstractC2961;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.flow.InterfaceC6150;
import top.yukonga.miuix.kmp.interfaces.C6876;
import top.yukonga.miuix.kmp.interfaces.C6877;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6891 implements InterfaceC6150 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2961 f16915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16916;

    public /* synthetic */ C6891(AbstractC2961 abstractC2961, int i) {
        this.f16916 = i;
        this.f16915 = abstractC2961;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6150
    public final Object emit(Object obj, InterfaceC5189 interfaceC5189) {
        int i = this.f16916;
        C6008 c6008 = C6008.f15084;
        AbstractC2961 abstractC2961 = this.f16915;
        switch (i) {
            case 0:
                InterfaceC1423 interfaceC1423 = (InterfaceC1423) obj;
                C6890 c6890 = (C6890) abstractC2961;
                boolean z = c6890.f16913;
                boolean z2 = c6890.f16912;
                boolean z3 = c6890.f16911;
                boolean z4 = c6890.f16910;
                if (interfaceC1423 instanceof C1416) {
                    c6890.f16913 = true;
                } else if ((interfaceC1423 instanceof C1417) || (interfaceC1423 instanceof C1413)) {
                    c6890.f16913 = false;
                } else if (interfaceC1423 instanceof C1418) {
                    c6890.f16912 = true;
                } else if (interfaceC1423 instanceof C1422) {
                    c6890.f16912 = false;
                } else if (interfaceC1423 instanceof C1407) {
                    c6890.f16911 = true;
                } else if (interfaceC1423 instanceof C1419) {
                    c6890.f16911 = false;
                } else if (interfaceC1423 instanceof C6877) {
                    c6890.f16910 = true;
                } else if (interfaceC1423 instanceof C6876) {
                    c6890.f16910 = false;
                }
                if (z != c6890.f16913 || z2 != c6890.f16912 || z3 != c6890.f16911 || z4 != c6890.f16910) {
                    Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    if (c6890.f16912) {
                        ref$FloatRef.element += 0.06f;
                    }
                    if (c6890.f16911) {
                        ref$FloatRef.element += 0.08f;
                    }
                    if (c6890.f16913) {
                        ref$FloatRef.element += 0.1f;
                    }
                    if (c6890.f16910) {
                        ref$FloatRef.element += 0.1f;
                    }
                    if (ref$FloatRef.element != 0.0f) {
                        C6249 c6249 = c6890.f16907;
                        if (c6249 != null) {
                            c6249.mo10815(null);
                        }
                        C6249 c62492 = c6890.f16906;
                        if (c62492 != null) {
                            c62492.mo10815(null);
                        }
                        c6890.f16907 = AbstractC6231.m11036(c6890.m4427(), null, null, new MiuixIndication$MiuixIndicationInstance$updateStates$2(c6890, ref$FloatRef, null), 3);
                    } else {
                        C6249 c62493 = c6890.f16906;
                        if (c62493 != null) {
                            c62493.mo10815(null);
                        }
                        c6890.f16906 = AbstractC6231.m11036(c6890.m4427(), null, null, new MiuixIndication$MiuixIndicationInstance$updateStates$1(c6890, ref$FloatRef, null), 3);
                    }
                }
                break;
            case 1:
                InterfaceC1423 interfaceC14232 = (InterfaceC1423) obj;
                C6880 c6880 = (C6880) abstractC2961;
                if (interfaceC14232 instanceof C1416) {
                    C6880.m11971(c6880, c6880.f16886);
                } else if ((interfaceC14232 instanceof C1417) || (interfaceC14232 instanceof C1413)) {
                    C6880.m11971(c6880, 1.0f);
                }
                break;
            default:
                InterfaceC1423 interfaceC14233 = (InterfaceC1423) obj;
                C6885 c6885 = (C6885) abstractC2961;
                if (interfaceC14233 instanceof C1416) {
                    C6885.m11974(c6885, c6885.f16894, c6885.f16893);
                } else if ((interfaceC14233 instanceof C1417) || (interfaceC14233 instanceof C1413)) {
                    C6885.m11974(c6885, 0.0f, 0.0f);
                }
                break;
        }
        return c6008;
    }
}
