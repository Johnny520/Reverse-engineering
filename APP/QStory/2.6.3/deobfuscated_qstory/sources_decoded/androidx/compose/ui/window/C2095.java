package androidx.compose.ui.window;

import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.layout.InterfaceC1658;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p034.AbstractC6347;
import p052.InterfaceC6558;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2095 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2095 f6202 = new C2095(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2095 f6201 = new C2095(1);

    public /* synthetic */ C2095(int i) {
        this.f6203 = i;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        int i = 0;
        switch (this.f6203) {
            case 0:
                final ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iM13341 = 0;
                int iM13340 = 0;
                while (i < size) {
                    AbstractC1724 abstractC1724Mo3055 = ((InterfaceC1655) list.get(i)).mo3055(j);
                    iM13341 = Math.max(iM13341, abstractC1724Mo3055.f4999);
                    iM13340 = Math.max(iM13340, abstractC1724Mo3055.f4997);
                    arrayList.add(abstractC1724Mo3055);
                    i++;
                }
                if (list.isEmpty()) {
                    iM13341 = C7898.m13341(j);
                    iM13340 = C7898.m13340(j);
                }
                return interfaceC1653.mo1495(iM13341, iM13340, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void invoke(AbstractC1708 abstractC1708) {
                        List<AbstractC1724> list2 = arrayList;
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            AbstractC1708.m3132(abstractC1708, list2.get(i2), 0, 0);
                        }
                    }

                    @Override // p052.InterfaceC6558
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((AbstractC1708) obj);
                        return C5176.f14739;
                    }
                });
            default:
                int size2 = list.size();
                if (size2 == 0) {
                    return interfaceC1653.mo1495(0, 0, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$1
                        @Override // p052.InterfaceC6558
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((AbstractC1708) obj);
                            return C5176.f14739;
                        }

                        public final void invoke(AbstractC1708 abstractC1708) {
                        }
                    });
                }
                if (size2 == 1) {
                    final AbstractC1724 abstractC1724Mo30552 = ((InterfaceC1655) list.get(0)).mo3055(j);
                    return interfaceC1653.mo1495(abstractC1724Mo30552.f4999, abstractC1724Mo30552.f4997, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$2
                        {
                            super(1);
                        }

                        @Override // p052.InterfaceC6558
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((AbstractC1708) obj);
                            return C5176.f14739;
                        }

                        public final void invoke(AbstractC1708 abstractC1708) {
                            AbstractC1708.m3132(abstractC1708, abstractC1724Mo30552, 0, 0);
                        }
                    });
                }
                final ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                while (i < size3) {
                    AbstractC1724 abstractC1724Mo30553 = ((InterfaceC1655) list.get(i)).mo3055(j);
                    iMax = Math.max(iMax, abstractC1724Mo30553.f4999);
                    iMax2 = Math.max(iMax2, abstractC1724Mo30553.f4997);
                    arrayList2.add(abstractC1724Mo30553);
                    i++;
                }
                return interfaceC1653.mo1495(iMax, iMax2, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void invoke(AbstractC1708 abstractC1708) {
                        int iM11901 = AbstractC6347.m11901(arrayList2);
                        if (iM11901 < 0) {
                            return;
                        }
                        int i2 = 0;
                        while (true) {
                            AbstractC1708.m3132(abstractC1708, arrayList2.get(i2), 0, 0);
                            if (i2 == iM11901) {
                                return;
                            } else {
                                i2++;
                            }
                        }
                    }

                    @Override // p052.InterfaceC6558
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((AbstractC1708) obj);
                        return C5176.f14739;
                    }
                });
        }
    }
}
