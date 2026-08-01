package androidx.compose.p001ui.layout;

import androidx.compose.p001ui.node.AbstractC2585;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;
import p221.AbstractC8726;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2556 extends AbstractC2585 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2556 f5338 = new C2556("Undefined intrinsics block and it is required");

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return interfaceC2488.mo2055(C8727.m13900(j), C8727.m13899(j), AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AbstractC2543) obj);
                    return C6008.f15084;
                }

                public final void invoke(AbstractC2543 abstractC2543) {
                }
            });
        }
        if (size == 1) {
            final AbstractC2559 abstractC2559Mo3615 = ((InterfaceC2490) list.get(0)).mo3615(j);
            return interfaceC2488.mo2055(AbstractC8726.m13886(abstractC2559Mo3615.f5344, j), AbstractC8726.m13879(abstractC2559Mo3615.f5342, j), AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AbstractC2543) obj);
                    return C6008.f15084;
                }

                public final void invoke(AbstractC2543 abstractC2543) {
                    AbstractC2543.m3693(abstractC2543, abstractC2559Mo3615, 0, 0);
                }
            });
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            AbstractC2559 abstractC2559Mo36152 = ((InterfaceC2490) list.get(i)).mo3615(j);
            iMax = Math.max(abstractC2559Mo36152.f5344, iMax);
            iMax2 = Math.max(abstractC2559Mo36152.f5342, iMax2);
            arrayList.add(abstractC2559Mo36152);
        }
        return interfaceC2488.mo2055(AbstractC8726.m13886(iMax, j), AbstractC8726.m13879(iMax2, j), AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                List<AbstractC2559> list2 = arrayList;
                int size3 = list2.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    AbstractC2543.m3693(abstractC2543, list2.get(i2), 0, 0);
                }
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }
        });
    }
}
