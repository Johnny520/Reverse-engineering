package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$2 extends Lambda implements InterfaceC6553 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC6557 $onAttached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$2(InterfaceC6557 interfaceC6557, int i) {
        super(2);
        this.$onAttached = interfaceC6557;
        this.$$changed = i;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        final InterfaceC6557 interfaceC6557 = this.$onAttached;
        int iM2460 = AbstractC1367.m2460(this.$$changed | 1);
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(-1673066036);
        if ((iM2460 & 6) == 0) {
            i2 = (c1324.m2368(interfaceC6557) ? 4 : 2) | iM2460;
        } else {
            i2 = iM2460;
        }
        if (c1324.m2333(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(c1324.f3836);
            Object objM2335 = c1324.m2335();
            if (objM2335 == C1369.f3973) {
                objM2335 = C1716.f4985;
                c1324.m2376(objM2335);
            }
            InterfaceC1658 interfaceC1658 = (InterfaceC1658) objM2335;
            InterfaceC6542 interfaceC6542 = C1748.f5090;
            c1324.m2332(125, 1, null, null);
            c1324.f3871 = true;
            if (c1324.f3837) {
                c1324.m2370(interfaceC6542);
            } else {
                c1324.m2380();
            }
            InterfaceC1784.f5221.getClass();
            AbstractC1367.m2464(c1324, interfaceC1658, C1765.f5180);
            AbstractC1367.m2464(c1324, Integer.valueOf(iHashCode), C1765.f5187);
            AbstractC1367.m2481(c1324, new InterfaceC6557() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1
                {
                    super(1);
                }

                public final void invoke(C1748 c1748) {
                    interfaceC6557.invoke(new C1730(5));
                }

                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C1748) obj);
                    return C5175.f14739;
                }
            });
            c1324.m2367(true);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new TestModifierUpdaterKt$TestModifierUpdaterLayout$2(interfaceC6557, iM2460);
        }
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5175.f14739;
    }
}
