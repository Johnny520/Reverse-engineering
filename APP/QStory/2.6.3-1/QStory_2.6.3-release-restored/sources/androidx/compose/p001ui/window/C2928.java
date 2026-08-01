package androidx.compose.p001ui.window;

import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2928 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2928 f6547 = new C2928(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2928 f6546 = new C2928(1);

    public /* synthetic */ C2928(int i) {
        this.f6548 = i;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        int i = 0;
        switch (this.f6548) {
            case 0:
                final ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iM13900 = 0;
                int iM13899 = 0;
                while (i < size) {
                    AbstractC2559 abstractC2559Mo3615 = ((InterfaceC2490) list.get(i)).mo3615(j);
                    iM13900 = Math.max(iM13900, abstractC2559Mo3615.f5344);
                    iM13899 = Math.max(iM13899, abstractC2559Mo3615.f5342);
                    arrayList.add(abstractC2559Mo3615);
                    i++;
                }
                if (list.isEmpty()) {
                    iM13900 = C8727.m13900(j);
                    iM13899 = C8727.m13899(j);
                }
                return interfaceC2488.mo2055(iM13900, iM13899, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void invoke(AbstractC2543 abstractC2543) {
                        List<AbstractC2559> list2 = arrayList;
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            AbstractC2543.m3692(abstractC2543, list2.get(i2), 0, 0);
                        }
                    }

                    @Override // p068.InterfaceC7387
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((AbstractC2543) obj);
                        return C6008.f15084;
                    }
                });
            default:
                int size2 = list.size();
                if (size2 == 0) {
                    return interfaceC2488.mo2055(0, 0, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$1
                        @Override // p068.InterfaceC7387
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((AbstractC2543) obj);
                            return C6008.f15084;
                        }

                        public final void invoke(AbstractC2543 abstractC2543) {
                        }
                    });
                }
                if (size2 == 1) {
                    final AbstractC2559 abstractC2559Mo36152 = ((InterfaceC2490) list.get(0)).mo3615(j);
                    return interfaceC2488.mo2055(abstractC2559Mo36152.f5344, abstractC2559Mo36152.f5342, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$2
                        {
                            super(1);
                        }

                        @Override // p068.InterfaceC7387
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((AbstractC2543) obj);
                            return C6008.f15084;
                        }

                        public final void invoke(AbstractC2543 abstractC2543) {
                            AbstractC2543.m3692(abstractC2543, abstractC2559Mo36152, 0, 0);
                        }
                    });
                }
                final ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                while (i < size3) {
                    AbstractC2559 abstractC2559Mo36153 = ((InterfaceC2490) list.get(i)).mo3615(j);
                    iMax = Math.max(iMax, abstractC2559Mo36153.f5344);
                    iMax2 = Math.max(iMax2, abstractC2559Mo36153.f5342);
                    arrayList2.add(abstractC2559Mo36153);
                    i++;
                }
                return interfaceC2488.mo2055(iMax, iMax2, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void invoke(AbstractC2543 abstractC2543) {
                        int iM12460 = AbstractC7176.m12460(arrayList2);
                        if (iM12460 < 0) {
                            return;
                        }
                        int i2 = 0;
                        while (true) {
                            AbstractC2543.m3692(abstractC2543, arrayList2.get(i2), 0, 0);
                            if (i2 == iM12460) {
                                return;
                            } else {
                                i2++;
                            }
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
}
