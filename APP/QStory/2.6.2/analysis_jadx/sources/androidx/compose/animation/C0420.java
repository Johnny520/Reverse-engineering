package androidx.compose.animation;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.layout.InterfaceC1698;
import androidx.compose.ui.layout.InterfaceC1699;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import p052.InterfaceC6557;
import p205.C7905;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0420 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f1372;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0415 f1373;

    public C0420(C0415 c0415) {
        this.f1373 = c0415;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1103(InterfaceC1699 interfaceC1699, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3044 = ((InterfaceC1698) list.get(0)).mo3044(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo30442 = ((InterfaceC1698) list.get(i2)).mo3044(i);
                if (iMo30442 > iMo3044) {
                    iMo3044 = iMo30442;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3044;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3048 = ((InterfaceC1698) list.get(0)).mo3048(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo30482 = ((InterfaceC1698) list.get(i2)).mo3048(i);
                if (iMo30482 > iMo3048) {
                    iMo3048 = iMo30482;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3048;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1724 abstractC1724Mo3045 = ((InterfaceC1655) list.get(i)).mo3045(j);
            iMax = Math.max(iMax, abstractC1724Mo3045.f4998);
            iMax2 = Math.max(iMax2, abstractC1724Mo3045.f4996);
            arrayList.add(abstractC1724Mo3045);
        }
        boolean zMo1487 = interfaceC1653.mo1487();
        C0415 c0415 = this.f1373;
        if (zMo1487) {
            this.f1372 = true;
            ((AbstractC1347) c0415.f1364).setValue(new C7905((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.f1372) {
            ((AbstractC1347) c0415.f1364).setValue(new C7905((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return interfaceC1653.mo1485(iMax, iMax2, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                List<AbstractC1724> list2 = arrayList;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    abstractC1708.m3125(list2.get(i2), 0, 0, 0.0f);
                }
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5175.f14739;
            }
        });
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1106(InterfaceC1699 interfaceC1699, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3049 = ((InterfaceC1698) list.get(0)).mo3049(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo30492 = ((InterfaceC1698) list.get(i2)).mo3049(i);
                if (iMo30492 > iMo3049) {
                    iMo3049 = iMo30492;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3049;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3047 = ((InterfaceC1698) list.get(0)).mo3047(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo30472 = ((InterfaceC1698) list.get(i2)).mo3047(i);
                if (iMo30472 > iMo3047) {
                    iMo3047 = iMo30472;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3047;
    }
}
