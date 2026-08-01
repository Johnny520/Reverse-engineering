package androidx.compose.ui.window;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import p052.InterfaceC6557;
import p205.C7897;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2095 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6202;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2095 f6201 = new C2095(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2095 f6200 = new C2095(1);

    public /* synthetic */ C2095(int i) {
        this.f6202 = i;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
        int i = 0;
        switch (this.f6202) {
            case 0:
                final ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iM13313 = 0;
                int iM13312 = 0;
                while (i < size) {
                    AbstractC1724 abstractC1724Mo3045 = ((InterfaceC1655) list.get(i)).mo3045(j);
                    iM13313 = Math.max(iM13313, abstractC1724Mo3045.f4998);
                    iM13312 = Math.max(iM13312, abstractC1724Mo3045.f4996);
                    arrayList.add(abstractC1724Mo3045);
                    i++;
                }
                if (list.isEmpty()) {
                    iM13313 = C7897.m13313(j);
                    iM13312 = C7897.m13312(j);
                }
                return interfaceC1653.mo1485(iM13313, iM13312, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void invoke(AbstractC1708 abstractC1708) {
                        List<AbstractC1724> list2 = arrayList;
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            AbstractC1708.m3122(abstractC1708, list2.get(i2), 0, 0);
                        }
                    }

                    @Override // p052.InterfaceC6557
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((AbstractC1708) obj);
                        return C5175.f14739;
                    }
                });
            default:
                int size2 = list.size();
                if (size2 == 0) {
                    return interfaceC1653.mo1485(0, 0, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$1
                        @Override // p052.InterfaceC6557
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((AbstractC1708) obj);
                            return C5175.f14739;
                        }

                        public final void invoke(AbstractC1708 abstractC1708) {
                        }
                    });
                }
                if (size2 == 1) {
                    final AbstractC1724 abstractC1724Mo30452 = ((InterfaceC1655) list.get(0)).mo3045(j);
                    return interfaceC1653.mo1485(abstractC1724Mo30452.f4998, abstractC1724Mo30452.f4996, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$2
                        {
                            super(1);
                        }

                        @Override // p052.InterfaceC6557
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((AbstractC1708) obj);
                            return C5175.f14739;
                        }

                        public final void invoke(AbstractC1708 abstractC1708) {
                            AbstractC1708.m3122(abstractC1708, abstractC1724Mo30452, 0, 0);
                        }
                    });
                }
                final ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                while (i < size3) {
                    AbstractC1724 abstractC1724Mo30453 = ((InterfaceC1655) list.get(i)).mo3045(j);
                    iMax = Math.max(iMax, abstractC1724Mo30453.f4998);
                    iMax2 = Math.max(iMax2, abstractC1724Mo30453.f4996);
                    arrayList2.add(abstractC1724Mo30453);
                    i++;
                }
                return interfaceC1653.mo1485(iMax, iMax2, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void invoke(AbstractC1708 abstractC1708) {
                        int iM13673 = AbstractC8189.m13673(arrayList2);
                        if (iM13673 < 0) {
                            return;
                        }
                        int i2 = 0;
                        while (true) {
                            AbstractC1708.m3122(abstractC1708, arrayList2.get(i2), 0, 0);
                            if (i2 == iM13673) {
                                return;
                            } else {
                                i2++;
                            }
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
}
