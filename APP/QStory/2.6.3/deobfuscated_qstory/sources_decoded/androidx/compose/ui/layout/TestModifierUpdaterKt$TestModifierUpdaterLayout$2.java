package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1765;
import androidx.compose.ui.node.InterfaceC1784;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$2 extends Lambda implements InterfaceC6554 {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC6558 $onAttached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TestModifierUpdaterKt$TestModifierUpdaterLayout$2(InterfaceC6558 interfaceC6558, int i) {
        super(2);
        this.$onAttached = interfaceC6558;
        this.$$changed = i;
    }

    public final void invoke(InterfaceC1373 interfaceC1373, int i) {
        int i2;
        final InterfaceC6558 interfaceC6558 = this.$onAttached;
        int iM2471 = AbstractC1367.m2471(this.$$changed | 1);
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(-1673066036);
        if ((iM2471 & 6) == 0) {
            i2 = (c1324.m2378(interfaceC6558) ? 4 : 2) | iM2471;
        } else {
            i2 = iM2471;
        }
        if (c1324.m2343(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(c1324.f3837);
            Object objM2345 = c1324.m2345();
            if (objM2345 == C1369.f3974) {
                objM2345 = C1716.f4986;
                c1324.m2386(objM2345);
            }
            InterfaceC1658 interfaceC1658 = (InterfaceC1658) objM2345;
            InterfaceC6543 interfaceC6543 = C1748.f5091;
            c1324.m2342(125, 1, null, null);
            c1324.f3872 = true;
            if (c1324.f3838) {
                c1324.m2380(interfaceC6543);
            } else {
                c1324.m2390();
            }
            InterfaceC1784.f5222.getClass();
            AbstractC1367.m2472(c1324, interfaceC1658, C1765.f5181);
            AbstractC1367.m2472(c1324, Integer.valueOf(iHashCode), C1765.f5188);
            AbstractC1367.m2490(c1324, new InterfaceC6558() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1
                {
                    super(1);
                }

                public final void invoke(C1748 c1748) {
                    interfaceC6558.invoke(new C1730(5));
                }

                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((C1748) obj);
                    return C5176.f14739;
                }
            });
            c1324.m2377(true);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new TestModifierUpdaterKt$TestModifierUpdaterLayout$2(interfaceC6558, iM2471);
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
        return C5176.f14739;
    }
}
