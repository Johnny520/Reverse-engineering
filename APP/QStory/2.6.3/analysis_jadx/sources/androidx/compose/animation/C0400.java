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
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p052.InterfaceC6558;
import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0400 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0419 f1340;

    public C0400(C0419 c0419) {
        this.f1340 = c0419;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1698) list.get(0)).mo3054(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1698) list.get(i2)).mo3054(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo1105(InterfaceC1699 interfaceC1699, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1698) list.get(0)).mo3058(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1698) list.get(i2)).mo3058(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1657 mo1106(InterfaceC1653 interfaceC1653, List list, long j) {
        AbstractC1724 abstractC1724;
        int i;
        AbstractC1724 abstractC17242;
        final int i2;
        final int i3;
        int size = list.size();
        final AbstractC1724[] abstractC1724Arr = new AbstractC1724[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            abstractC1724 = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            InterfaceC1655 interfaceC1655 = (InterfaceC1655) list.get(i4);
            Object objMo3056 = interfaceC1655.mo3056();
            C0417 c0417 = objMo3056 instanceof C0417 ? (C0417) objMo3056 : null;
            if (c0417 != null && ((Boolean) ((AbstractC1347) c0417.f1366).getValue()).booleanValue()) {
                AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
                long j3 = (((long) abstractC1724Mo3055.f4997) & 4294967295L) | (((long) abstractC1724Mo3055.f4999) << 32);
                abstractC1724Arr[i4] = abstractC1724Mo3055;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            InterfaceC1655 interfaceC16552 = (InterfaceC1655) list.get(i5);
            if (abstractC1724Arr[i5] == null) {
                abstractC1724Arr[i5] = interfaceC16552.mo3055(j);
            }
        }
        if (interfaceC1653.mo1497()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                abstractC17242 = null;
            } else {
                abstractC17242 = abstractC1724Arr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = abstractC17242 != null ? abstractC17242.f4999 : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            AbstractC1724 abstractC17243 = abstractC1724Arr[i8];
                            int i9 = abstractC17243 != null ? abstractC17243.f4999 : 0;
                            if (i7 < i9) {
                                abstractC17242 = abstractC17243;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = abstractC17242 != null ? abstractC17242.f4999 : 0;
        }
        if (interfaceC1653.mo1497()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                abstractC1724 = abstractC1724Arr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = abstractC1724 != null ? abstractC1724.f4997 : 0;
                    if (1 <= i10) {
                        while (true) {
                            AbstractC1724 abstractC17244 = abstractC1724Arr[i];
                            int i12 = abstractC17244 != null ? abstractC17244.f4997 : 0;
                            if (i11 < i12) {
                                abstractC1724 = abstractC17244;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = abstractC1724 != null ? abstractC1724.f4997 : 0;
        }
        if (!interfaceC1653.mo1497()) {
            ((AbstractC1347) this.f1340.f1369).setValue(new C7906((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return interfaceC1653.mo1495(i2, i3, AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                AbstractC1724[] abstractC1724Arr2 = abstractC1724Arr;
                C0400 c0400 = this;
                int i13 = i2;
                int i14 = i3;
                for (AbstractC1724 abstractC17245 : abstractC1724Arr2) {
                    if (abstractC17245 != null) {
                        long jMo3859 = c0400.f1340.f1370.mo3859((((long) abstractC17245.f4999) << 32) | (((long) abstractC17245.f4997) & 4294967295L), (((long) i13) << 32) | (((long) i14) & 4294967295L), LayoutDirection.Ltr);
                        abstractC1708.m3135(abstractC17245, (int) (jMo3859 >> 32), (int) (jMo3859 & 4294967295L), 0.0f);
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

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1698) list.get(0)).mo3059(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1698) list.get(i2)).mo3059(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int mo1108(InterfaceC1699 interfaceC1699, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1698) list.get(0)).mo3057(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1698) list.get(i2)).mo3057(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
