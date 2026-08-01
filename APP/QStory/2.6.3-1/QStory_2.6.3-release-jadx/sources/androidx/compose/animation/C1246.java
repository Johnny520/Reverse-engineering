package androidx.compose.animation;

import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.layout.InterfaceC2533;
import androidx.compose.p001ui.layout.InterfaceC2534;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import java.util.List;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;
import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1246 implements InterfaceC2493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1265 f1685;

    public C1246(C1265 c1265) {
        this.f1685 = c1265;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int mo1664(InterfaceC2534 interfaceC2534, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2533) list.get(0)).mo3614(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2533) list.get(i2)).mo3614(i));
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

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo1665(InterfaceC2534 interfaceC2534, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2533) list.get(0)).mo3618(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2533) list.get(i2)).mo3618(i));
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

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2492 mo1666(InterfaceC2488 interfaceC2488, List list, long j) {
        AbstractC2559 abstractC2559;
        int i;
        AbstractC2559 abstractC25592;
        final int i2;
        final int i3;
        int size = list.size();
        final AbstractC2559[] abstractC2559Arr = new AbstractC2559[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            abstractC2559 = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            InterfaceC2490 interfaceC2490 = (InterfaceC2490) list.get(i4);
            Object objMo3616 = interfaceC2490.mo3616();
            C1263 c1263 = objMo3616 instanceof C1263 ? (C1263) objMo3616 : null;
            if (c1263 != null && ((Boolean) ((AbstractC2182) c1263.f1711).getValue()).booleanValue()) {
                AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(j);
                long j3 = (((long) abstractC2559Mo3615.f5342) & 4294967295L) | (((long) abstractC2559Mo3615.f5344) << 32);
                abstractC2559Arr[i4] = abstractC2559Mo3615;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            InterfaceC2490 interfaceC24902 = (InterfaceC2490) list.get(i5);
            if (abstractC2559Arr[i5] == null) {
                abstractC2559Arr[i5] = interfaceC24902.mo3615(j);
            }
        }
        if (interfaceC2488.mo2057()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                abstractC25592 = null;
            } else {
                abstractC25592 = abstractC2559Arr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = abstractC25592 != null ? abstractC25592.f5344 : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            AbstractC2559 abstractC25593 = abstractC2559Arr[i8];
                            int i9 = abstractC25593 != null ? abstractC25593.f5344 : 0;
                            if (i7 < i9) {
                                abstractC25592 = abstractC25593;
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
            i2 = abstractC25592 != null ? abstractC25592.f5344 : 0;
        }
        if (interfaceC2488.mo2057()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                abstractC2559 = abstractC2559Arr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = abstractC2559 != null ? abstractC2559.f5342 : 0;
                    if (1 <= i10) {
                        while (true) {
                            AbstractC2559 abstractC25594 = abstractC2559Arr[i];
                            int i12 = abstractC25594 != null ? abstractC25594.f5342 : 0;
                            if (i11 < i12) {
                                abstractC2559 = abstractC25594;
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
            i3 = abstractC2559 != null ? abstractC2559.f5342 : 0;
        }
        if (!interfaceC2488.mo2057()) {
            ((AbstractC2182) this.f1685.f1714).setValue(new C8735((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return interfaceC2488.mo2055(i2, i3, AbstractC5171.m9335(), new InterfaceC7387() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC2543 abstractC2543) {
                AbstractC2559[] abstractC2559Arr2 = abstractC2559Arr;
                C1246 c1246 = this;
                int i13 = i2;
                int i14 = i3;
                for (AbstractC2559 abstractC25595 : abstractC2559Arr2) {
                    if (abstractC25595 != null) {
                        long jMo4419 = c1246.f1685.f1715.mo4419((((long) abstractC25595.f5344) << 32) | (((long) abstractC25595.f5342) & 4294967295L), (((long) i13) << 32) | (((long) i14) & 4294967295L), LayoutDirection.Ltr);
                        abstractC2543.m3695(abstractC25595, (int) (jMo4419 >> 32), (int) (jMo4419 & 4294967295L), 0.0f);
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

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo1667(InterfaceC2534 interfaceC2534, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2533) list.get(0)).mo3619(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2533) list.get(i2)).mo3619(i));
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

    @Override // androidx.compose.p001ui.layout.InterfaceC2493
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int mo1668(InterfaceC2534 interfaceC2534, List list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2533) list.get(0)).mo3617(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2533) list.get(i2)).mo3617(i));
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
