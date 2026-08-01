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
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import p052.InterfaceC6557;
import p205.C7905;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0400 implements InterfaceC1658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0419 f1340;

    public C0400(C0419 c0419) {
        this.f1340 = c0419;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo1103(InterfaceC1699 interfaceC1699, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1698) list.get(0)).mo3044(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1698) list.get(i2)).mo3044(i));
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
    public final int mo1104(InterfaceC1699 interfaceC1699, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1698) list.get(0)).mo3048(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1698) list.get(i2)).mo3048(i));
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
    public final InterfaceC1657 mo1105(InterfaceC1653 interfaceC1653, List list, long j) {
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
            Object objMo3046 = interfaceC1655.mo3046();
            C0417 c0417 = objMo3046 instanceof C0417 ? (C0417) objMo3046 : null;
            if (c0417 != null && ((Boolean) ((AbstractC1347) c0417.f1366).getValue()).booleanValue()) {
                AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
                long j3 = (((long) abstractC1724Mo3045.f4996) & 4294967295L) | (((long) abstractC1724Mo3045.f4998) << 32);
                abstractC1724Arr[i4] = abstractC1724Mo3045;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            InterfaceC1655 interfaceC16552 = (InterfaceC1655) list.get(i5);
            if (abstractC1724Arr[i5] == null) {
                abstractC1724Arr[i5] = interfaceC16552.mo3045(j);
            }
        }
        if (interfaceC1653.mo1487()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                abstractC17242 = null;
            } else {
                abstractC17242 = abstractC1724Arr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = abstractC17242 != null ? abstractC17242.f4998 : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            AbstractC1724 abstractC17243 = abstractC1724Arr[i8];
                            int i9 = abstractC17243 != null ? abstractC17243.f4998 : 0;
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
            i2 = abstractC17242 != null ? abstractC17242.f4998 : 0;
        }
        if (interfaceC1653.mo1487()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                abstractC1724 = abstractC1724Arr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = abstractC1724 != null ? abstractC1724.f4996 : 0;
                    if (1 <= i10) {
                        while (true) {
                            AbstractC1724 abstractC17244 = abstractC1724Arr[i];
                            int i12 = abstractC17244 != null ? abstractC17244.f4996 : 0;
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
            i3 = abstractC1724 != null ? abstractC1724.f4996 : 0;
        }
        if (!interfaceC1653.mo1487()) {
            ((AbstractC1347) this.f1340.f1369).setValue(new C7905((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return interfaceC1653.mo1485(i2, i3, AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
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
                        long jMo3849 = c0400.f1340.f1370.mo3849((((long) abstractC17245.f4998) << 32) | (((long) abstractC17245.f4996) & 4294967295L), (((long) i13) << 32) | (((long) i14) & 4294967295L), LayoutDirection.Ltr);
                        abstractC1708.m3125(abstractC17245, (int) (jMo3849 >> 32), (int) (jMo3849 & 4294967295L), 0.0f);
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

    @Override // androidx.compose.ui.layout.InterfaceC1658
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo1106(InterfaceC1699 interfaceC1699, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1698) list.get(0)).mo3049(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1698) list.get(i2)).mo3049(i));
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
    public final int mo1107(InterfaceC1699 interfaceC1699, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC1698) list.get(0)).mo3047(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC1698) list.get(i2)).mo3047(i));
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
