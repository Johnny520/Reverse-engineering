package androidx.compose.ui.layout;

import androidx.compose.ui.node.AbstractC1750;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import p052.InterfaceC6557;
import p205.AbstractC7896;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1721 extends AbstractC1750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1721 f4992 = new C1721("Undefined intrinsics block and it is required");

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return interfaceC1653.mo1485(C7897.m13313(j), C7897.m13312(j), AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AbstractC1708) obj);
                    return C5175.f14739;
                }

                public final void invoke(AbstractC1708 abstractC1708) {
                }
            });
        }
        if (size == 1) {
            final AbstractC1724 abstractC1724Mo3045 = ((InterfaceC1655) list.get(0)).mo3045(j);
            return interfaceC1653.mo1485(AbstractC7896.m13299(abstractC1724Mo3045.f4998, j), AbstractC7896.m13292(abstractC1724Mo3045.f4996, j), AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // p052.InterfaceC6557
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AbstractC1708) obj);
                    return C5175.f14739;
                }

                public final void invoke(AbstractC1708 abstractC1708) {
                    AbstractC1708.m3123(abstractC1708, abstractC1724Mo3045, 0, 0);
                }
            });
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            AbstractC1724 abstractC1724Mo30452 = ((InterfaceC1655) list.get(i)).mo3045(j);
            iMax = Math.max(abstractC1724Mo30452.f4998, iMax);
            iMax2 = Math.max(abstractC1724Mo30452.f4996, iMax2);
            arrayList.add(abstractC1724Mo30452);
        }
        return interfaceC1653.mo1485(AbstractC7896.m13299(iMax, j), AbstractC7896.m13292(iMax2, j), AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                List<AbstractC1724> list2 = arrayList;
                int size3 = list2.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    AbstractC1708.m3123(abstractC1708, list2.get(i2), 0, 0);
                }
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5175.f14739;
            }
        });
    }
}
