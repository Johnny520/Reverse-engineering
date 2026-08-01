package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.interaction.C0566;
import androidx.compose.foundation.interaction.C0572;
import androidx.compose.foundation.interaction.C0575;
import androidx.compose.foundation.interaction.C0576;
import androidx.compose.foundation.interaction.C0577;
import androidx.compose.foundation.interaction.C0578;
import androidx.compose.foundation.interaction.C0581;
import androidx.compose.foundation.interaction.InterfaceC0582;
import androidx.compose.ui.AbstractC2128;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.flow.InterfaceC5317;
import top.yukonga.miuix.kmp.interfaces.C6040;
import top.yukonga.miuix.kmp.interfaces.C6041;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6056 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2128 f16561;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16562;

    public /* synthetic */ C6056(AbstractC2128 abstractC2128, int i) {
        this.f16562 = i;
        this.f16561 = abstractC2128;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        int i = this.f16562;
        C5175 c5175 = C5175.f14739;
        AbstractC2128 abstractC2128 = this.f16561;
        switch (i) {
            case 0:
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
                C6055 c6055 = (C6055) abstractC2128;
                boolean z = c6055.f16559;
                boolean z2 = c6055.f16558;
                boolean z3 = c6055.f16557;
                boolean z4 = c6055.f16556;
                if (interfaceC0582 instanceof C0575) {
                    c6055.f16559 = true;
                } else if ((interfaceC0582 instanceof C0576) || (interfaceC0582 instanceof C0572)) {
                    c6055.f16559 = false;
                } else if (interfaceC0582 instanceof C0577) {
                    c6055.f16558 = true;
                } else if (interfaceC0582 instanceof C0581) {
                    c6055.f16558 = false;
                } else if (interfaceC0582 instanceof C0566) {
                    c6055.f16557 = true;
                } else if (interfaceC0582 instanceof C0578) {
                    c6055.f16557 = false;
                } else if (interfaceC0582 instanceof C6041) {
                    c6055.f16556 = true;
                } else if (interfaceC0582 instanceof C6040) {
                    c6055.f16556 = false;
                }
                if (z != c6055.f16559 || z2 != c6055.f16558 || z3 != c6055.f16557 || z4 != c6055.f16556) {
                    Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    if (c6055.f16558) {
                        ref$FloatRef.element += 0.06f;
                    }
                    if (c6055.f16557) {
                        ref$FloatRef.element += 0.08f;
                    }
                    if (c6055.f16559) {
                        ref$FloatRef.element += 0.1f;
                    }
                    if (c6055.f16556) {
                        ref$FloatRef.element += 0.1f;
                    }
                    if (ref$FloatRef.element != 0.0f) {
                        C5416 c5416 = c6055.f16553;
                        if (c5416 != null) {
                            c5416.mo10252(null);
                        }
                        C5416 c54162 = c6055.f16552;
                        if (c54162 != null) {
                            c54162.mo10252(null);
                        }
                        c6055.f16553 = AbstractC5398.m10473(c6055.m3857(), null, null, new MiuixIndication$MiuixIndicationInstance$updateStates$2(c6055, ref$FloatRef, null), 3);
                    } else {
                        C5416 c54163 = c6055.f16552;
                        if (c54163 != null) {
                            c54163.mo10252(null);
                        }
                        c6055.f16552 = AbstractC5398.m10473(c6055.m3857(), null, null, new MiuixIndication$MiuixIndicationInstance$updateStates$1(c6055, ref$FloatRef, null), 3);
                    }
                }
                break;
            case 1:
                InterfaceC0582 interfaceC05822 = (InterfaceC0582) obj;
                C6045 c6045 = (C6045) abstractC2128;
                if (interfaceC05822 instanceof C0575) {
                    C6045.m11352(c6045, c6045.f16532);
                } else if ((interfaceC05822 instanceof C0576) || (interfaceC05822 instanceof C0572)) {
                    C6045.m11352(c6045, 1.0f);
                }
                break;
            default:
                InterfaceC0582 interfaceC05823 = (InterfaceC0582) obj;
                C6050 c6050 = (C6050) abstractC2128;
                if (interfaceC05823 instanceof C0575) {
                    C6050.m11355(c6050, c6050.f16540, c6050.f16539);
                } else if ((interfaceC05823 instanceof C0576) || (interfaceC05823 instanceof C0572)) {
                    C6050.m11355(c6050, 0.0f, 0.0f);
                }
                break;
        }
        return c5175;
    }
}
