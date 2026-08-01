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
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p052.InterfaceC6558;
import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3054 = ((InterfaceC1698) list.get(0)).mo3054(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo30542 = ((InterfaceC1698) list.get(i2)).mo3054(i);
                if (iMo30542 > iMo3054) {
                    iMo3054 = iMo30542;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3054;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1105(InterfaceC1699 interfaceC1699, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3058 = ((InterfaceC1698) list.get(0)).mo3058(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo30582 = ((InterfaceC1698) list.get(i2)).mo3058(i);
                if (iMo30582 > iMo3058) {
                    iMo3058 = iMo30582;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3058;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1724 abstractC1724Mo3055 = ((InterfaceC1655) list.get(i)).mo3055(j);
            iMax = Math.max(iMax, abstractC1724Mo3055.f4999);
            iMax2 = Math.max(iMax2, abstractC1724Mo3055.f4997);
            arrayList.add(abstractC1724Mo3055);
        }
        boolean zMo1497 = interfaceC1653.mo1497();
        C0415 c0415 = this.f1373;
        if (zMo1497) {
            this.f1372 = true;
            ((AbstractC1347) c0415.f1364).setValue(new C7906((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.f1372) {
            ((AbstractC1347) c0415.f1364).setValue(new C7906((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return interfaceC1653.mo1495(iMax, iMax2, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.animation.AnimatedEnterExitMeasurePolicy$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                List<AbstractC1724> list2 = arrayList;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    abstractC1708.m3135(list2.get(i2), 0, 0, 0.0f);
                }
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }
        });
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3059 = ((InterfaceC1698) list.get(0)).mo3059(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo30592 = ((InterfaceC1698) list.get(i2)).mo3059(i);
                if (iMo30592 > iMo3059) {
                    iMo3059 = iMo30592;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3059;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final int mo1108(InterfaceC1699 interfaceC1699, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMo3057 = ((InterfaceC1698) list.get(0)).mo3057(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iMo30572 = ((InterfaceC1698) list.get(i2)).mo3057(i);
                if (iMo30572 > iMo3057) {
                    iMo3057 = iMo30572;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iMo3057;
    }
}
