package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2600;
import androidx.compose.p001ui.node.InterfaceC2619;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$2 extends Lambda implements InterfaceC7383 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC7387 $onAttached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$2(InterfaceC7387 interfaceC7387, int i) {
        super(2);
        this.$onAttached = interfaceC7387;
        this.$$changed = i;
    }

    public final void invoke(InterfaceC2208 interfaceC2208, int i) {
        int i2;
        final InterfaceC7387 interfaceC7387 = this.$onAttached;
        int iM3031 = AbstractC2202.m3031(this.$$changed | 1);
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1673066036);
        if ((iM3031 & 6) == 0) {
            i2 = (c2159.m2938(interfaceC7387) ? 4 : 2) | iM3031;
        } else {
            i2 = iM3031;
        }
        if (c2159.m2903(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(c2159.f4182);
            Object objM2905 = c2159.m2905();
            if (objM2905 == C2204.f4319) {
                objM2905 = C2551.f5331;
                c2159.m2946(objM2905);
            }
            InterfaceC2493 interfaceC2493 = (InterfaceC2493) objM2905;
            InterfaceC7372 interfaceC7372 = C2583.f5436;
            c2159.m2902(125, 1, null, null);
            c2159.f4217 = true;
            if (c2159.f4183) {
                c2159.m2940(interfaceC7372);
            } else {
                c2159.m2950();
            }
            InterfaceC2619.f5567.getClass();
            AbstractC2202.m3032(c2159, interfaceC2493, C2600.f5526);
            AbstractC2202.m3032(c2159, Integer.valueOf(iHashCode), C2600.f5533);
            AbstractC2202.m3050(c2159, new InterfaceC7387() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1
                {
                    super(1);
                }

                public final void invoke(C2583 c2583) {
                    interfaceC7387.invoke(new C2565(5));
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C2583) obj);
                    return C6008.f15084;
                }
            });
            c2159.m2937(true);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new TestModifierUpdaterKt$TestModifierUpdaterLayout$2(interfaceC7387, iM3031);
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
        return C6008.f15084;
    }
}
