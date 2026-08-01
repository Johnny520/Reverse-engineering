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
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.flow.InterfaceC5318;
import top.yukonga.miuix.kmp.interfaces.C6046;
import top.yukonga.miuix.kmp.interfaces.C6047;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6062 implements InterfaceC5318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2128 f16570;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16571;

    public /* synthetic */ C6062(AbstractC2128 abstractC2128, int i) {
        this.f16571 = i;
        this.f16570 = abstractC2128;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5318
    public final Object emit(Object obj, InterfaceC4357 interfaceC4357) {
        int i = this.f16571;
        C5176 c5176 = C5176.f14739;
        AbstractC2128 abstractC2128 = this.f16570;
        switch (i) {
            case 0:
                InterfaceC0582 interfaceC0582 = (InterfaceC0582) obj;
                C6061 c6061 = (C6061) abstractC2128;
                boolean z = c6061.f16568;
                boolean z2 = c6061.f16567;
                boolean z3 = c6061.f16566;
                boolean z4 = c6061.f16565;
                if (interfaceC0582 instanceof C0575) {
                    c6061.f16568 = true;
                } else if ((interfaceC0582 instanceof C0576) || (interfaceC0582 instanceof C0572)) {
                    c6061.f16568 = false;
                } else if (interfaceC0582 instanceof C0577) {
                    c6061.f16567 = true;
                } else if (interfaceC0582 instanceof C0581) {
                    c6061.f16567 = false;
                } else if (interfaceC0582 instanceof C0566) {
                    c6061.f16566 = true;
                } else if (interfaceC0582 instanceof C0578) {
                    c6061.f16566 = false;
                } else if (interfaceC0582 instanceof C6047) {
                    c6061.f16565 = true;
                } else if (interfaceC0582 instanceof C6046) {
                    c6061.f16565 = false;
                }
                if (z != c6061.f16568 || z2 != c6061.f16567 || z3 != c6061.f16566 || z4 != c6061.f16565) {
                    Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                    if (c6061.f16567) {
                        ref$FloatRef.element += 0.06f;
                    }
                    if (c6061.f16566) {
                        ref$FloatRef.element += 0.08f;
                    }
                    if (c6061.f16568) {
                        ref$FloatRef.element += 0.1f;
                    }
                    if (c6061.f16565) {
                        ref$FloatRef.element += 0.1f;
                    }
                    if (ref$FloatRef.element != 0.0f) {
                        C5417 c5417 = c6061.f16562;
                        if (c5417 != null) {
                            c5417.mo10256(null);
                        }
                        C5417 c54172 = c6061.f16561;
                        if (c54172 != null) {
                            c54172.mo10256(null);
                        }
                        c6061.f16562 = AbstractC5399.m10477(c6061.m3867(), null, null, new MiuixIndication$MiuixIndicationInstance$updateStates$2(c6061, ref$FloatRef, null), 3);
                    } else {
                        C5417 c54173 = c6061.f16561;
                        if (c54173 != null) {
                            c54173.mo10256(null);
                        }
                        c6061.f16561 = AbstractC5399.m10477(c6061.m3867(), null, null, new MiuixIndication$MiuixIndicationInstance$updateStates$1(c6061, ref$FloatRef, null), 3);
                    }
                }
                break;
            case 1:
                InterfaceC0582 interfaceC05822 = (InterfaceC0582) obj;
                C6051 c6051 = (C6051) abstractC2128;
                if (interfaceC05822 instanceof C0575) {
                    C6051.m11412(c6051, c6051.f16541);
                } else if ((interfaceC05822 instanceof C0576) || (interfaceC05822 instanceof C0572)) {
                    C6051.m11412(c6051, 1.0f);
                }
                break;
            default:
                InterfaceC0582 interfaceC05823 = (InterfaceC0582) obj;
                C6056 c6056 = (C6056) abstractC2128;
                if (interfaceC05823 instanceof C0575) {
                    C6056.m11415(c6056, c6056.f16549, c6056.f16548);
                } else if ((interfaceC05823 instanceof C0576) || (interfaceC05823 instanceof C0572)) {
                    C6056.m11415(c6056, 0.0f, 0.0f);
                }
                break;
        }
        return c5176;
    }
}
