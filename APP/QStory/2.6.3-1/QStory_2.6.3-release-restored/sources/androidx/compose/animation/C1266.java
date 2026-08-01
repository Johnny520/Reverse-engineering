package androidx.compose.animation;

import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.layout.InterfaceC2534;
import androidx.compose.runtime.AbstractC2182;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;
import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1266 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f1717;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1261 f1718;

    public C1266(C1261 c1261) {
        this.f1718 = c1261;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1664(InterfaceC2534 interfaceC2534, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3614 = ((InterfaceC2533) list.get(0)).mo3614(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo36142 = ((InterfaceC2533) list.get(i2)).mo3614(i);
                if (iMo36142 > iMo3614) {
                    iMo3614 = iMo36142;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3614;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1665(InterfaceC2534 interfaceC2534, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3618 = ((InterfaceC2533) list.get(0)).mo3618(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo36182 = ((InterfaceC2533) list.get(i2)).mo3618(i);
                if (iMo36182 > iMo3618) {
                    iMo3618 = iMo36182;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3618;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC2559 abstractC2559Mo3615 = ((InterfaceC2490) list.get(i)).mo3615(j);
            iMax = Math.max(iMax, abstractC2559Mo3615.f5344);
            iMax2 = Math.max(iMax2, abstractC2559Mo3615.f5342);
            arrayList.add(abstractC2559Mo3615);
        }
        boolean zMo2057 = interfaceC2488.mo2057();
        C1261 c1261 = this.f1718;
        if (zMo2057) {
            this.f1717 = true;
            ((AbstractC2182) c1261.f1709).setValue(new C8735((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.f1717) {
            ((AbstractC2182) c1261.f1709).setValue(new C8735((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return interfaceC2488.mo2055(iMax, iMax2, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                List<AbstractC2559> list2 = arrayList;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    abstractC2543.m3695(list2.get(i2), 0, 0, 0.0f);
                }
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC2543) obj);
                return C6008.f15084;
            }
        });
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1667(InterfaceC2534 interfaceC2534, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3619 = ((InterfaceC2533) list.get(0)).mo3619(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo36192 = ((InterfaceC2533) list.get(i2)).mo3619(i);
                if (iMo36192 > iMo3619) {
                    iMo3619 = iMo36192;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3619;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1668(InterfaceC2534 interfaceC2534, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3617 = ((InterfaceC2533) list.get(0)).mo3617(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo36172 = ((InterfaceC2533) list.get(i2)).mo3617(i);
                if (iMo36172 > iMo3617) {
                    iMo3617 = iMo36172;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3617;
    }
}
