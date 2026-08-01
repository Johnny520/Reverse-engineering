package androidx.recyclerview.widget;

import android.view.View;
import androidx.collection.AbstractC1114;
import androidx.collection.C1110;
import androidx.collection.C1130;
import androidx.compose.foundation.text.C1804;
import java.util.ArrayList;
import java.util.Arrays;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3324 implements InterfaceC3312 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f7800;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f7801;

    public C3324(C3354 c3354) {
        this.f7801 = c3354;
        C3322 c3322 = new C3322();
        c3322.f7799 = 0;
        this.f7800 = c3322;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public View m5475(int i, int i2, int i3, int i4) {
        View viewM5558;
        C3322 c3322 = (C3322) this.f7800;
        C3354 c3354 = (C3354) this.f7801;
        int iM5580 = c3354.m5580();
        int iM5581 = c3354.m5581();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c3354.f7945) {
                case 0:
                    viewM5558 = c3354.f7944.m5558(i);
                    break;
                default:
                    viewM5558 = c3354.f7944.m5558(i);
                    break;
            }
            int iM5582 = c3354.m5582(viewM5558);
            int iM5583 = c3354.m5583(viewM5558);
            c3322.f7798 = iM5580;
            c3322.f7797 = iM5581;
            c3322.f7796 = iM5582;
            c3322.f7795 = iM5583;
            if (i3 != 0) {
                c3322.f7799 = i3;
                if (c3322.m5474()) {
                    return viewM5558;
                }
            }
            if (i4 != 0) {
                c3322.f7799 = i4;
                if (c3322.m5474()) {
                    view = viewM5558;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m5476(int i) {
        int[] iArr = (int[]) this.f7801;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f7801 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f7801 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f7801;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m5477() {
        int[] iArr = (int[]) this.f7801;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f7800 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m5478(AbstractC3317 abstractC3317, C1804 c1804) {
        C1130 c1130 = (C1130) this.f7801;
        C3321 c3321M5473 = (C3321) c1130.get(abstractC3317);
        if (c3321M5473 == null) {
            c3321M5473 = C3321.m5473();
            c1130.put(abstractC3317, c3321M5473);
        }
        c3321M5473.f7792 = c1804;
        c3321M5473.f7794 |= 8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m5479(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        if (((ArrayList) this.f7800) == null) {
            this.f7800 = new ArrayList();
        }
        int size = ((ArrayList) this.f7800).size();
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f7800;
            if (i >= size) {
                arrayList.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) arrayList.get(i);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7630 == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630) {
                ((ArrayList) this.f7800).remove(i);
            }
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7630 >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630) {
                ((ArrayList) this.f7800).add(i, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC3312
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public long mo5454(long j) {
        C1110 c1110 = (C1110) this.f7801;
        Long lValueOf = (Long) c1110.m1386(j);
        if (lValueOf == null) {
            C3310 c3310 = (C3310) this.f7800;
            long j2 = c3310.f7771;
            c3310.f7771 = 1 + j2;
            lValueOf = Long.valueOf(j2);
            c1110.m1383(lValueOf, j);
        }
        return lValueOf.longValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C1804 m5480(AbstractC3317 abstractC3317, int i) {
        C3321 c3321;
        C1804 c1804;
        C1130 c1130 = (C1130) this.f7801;
        int iM1424 = c1130.m1424(abstractC3317);
        if (iM1424 >= 0 && (c3321 = (C3321) c1130.m1431(iM1424)) != null) {
            int i2 = c3321.f7794;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c3321.f7794 = i3;
                if (i == 4) {
                    c1804 = c3321.f7793;
                } else if (i == 8) {
                    c1804 = c3321.f7792;
                } else {
                    C6755.m11869("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c1130.mo1428(iM1424);
                    c3321.f7794 = 0;
                    c3321.f7793 = null;
                    c3321.f7792 = null;
                    C3321.f7791.mo4549(c3321);
                }
                return c1804;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m5481(int i, int i2) {
        int[] iArr = (int[]) this.f7801;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m5476(i3);
        int[] iArr2 = (int[]) this.f7801;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f7801;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f7800;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7800).get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f7800).remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630 = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m5482(AbstractC3317 abstractC3317) {
        C3321 c3321 = (C3321) ((C1130) this.f7801).get(abstractC3317);
        if (c3321 == null) {
            return;
        }
        c3321.f7794 &= -2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void m5483(AbstractC3317 abstractC3317) {
        C1110 c1110 = (C1110) this.f7800;
        int iM1388 = c1110.m1388() - 1;
        while (true) {
            if (iM1388 < 0) {
                break;
            }
            if (abstractC3317 == c1110.m1389(iM1388)) {
                Object[] objArr = c1110.f1295;
                Object obj = objArr[iM1388];
                Object obj2 = AbstractC1114.f1307;
                if (obj != obj2) {
                    objArr[iM1388] = obj2;
                    c1110.f1296 = true;
                }
            } else {
                iM1388--;
            }
        }
        C3321 c3321 = (C3321) ((C1130) this.f7801).remove(abstractC3317);
        if (c3321 != null) {
            c3321.f7794 = 0;
            c3321.f7793 = null;
            c3321.f7792 = null;
            C3321.f7791.mo4549(c3321);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem m5484(int i, int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f7800;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7800).get(i4);
            int i5 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7628 == i3 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7627)) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m5485(int i) {
        ArrayList arrayList = (ArrayList) this.f7800;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7800).get(size)).f7630 >= i) {
                    ((ArrayList) this.f7800).remove(size);
                }
            }
        }
        m5489(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean m5486(View view) {
        C3322 c3322 = (C3322) this.f7800;
        C3354 c3354 = (C3354) this.f7801;
        int iM5580 = c3354.m5580();
        int iM5581 = c3354.m5581();
        int iM5582 = c3354.m5582(view);
        int iM5583 = c3354.m5583(view);
        c3322.f7798 = iM5580;
        c3322.f7797 = iM5581;
        c3322.f7796 = iM5582;
        c3322.f7795 = iM5583;
        c3322.f7799 = 24579;
        return c3322.m5474();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m5487(int i, int i2) {
        int[] iArr = (int[]) this.f7801;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m5476(i3);
        int[] iArr2 = (int[]) this.f7801;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f7801, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f7800;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7800).get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630;
            if (i4 >= i) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630 = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem m5488(int i) {
        ArrayList arrayList = (ArrayList) this.f7800;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7800).get(size);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630 == i) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m5489(int i) {
        int i2;
        int[] iArr = (int[]) this.f7801;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        if (((ArrayList) this.f7800) != null) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488 = m5488(i);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488 != null) {
                ((ArrayList) this.f7800).remove(staggeredGridLayoutManager$LazySpanLookup$FullSpanItemM5488);
            }
            int size = ((ArrayList) this.f7800).size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7800).get(i3)).f7630 >= i) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7800).get(i3);
                ((ArrayList) this.f7800).remove(i3);
                i2 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7630;
            } else {
                i2 = -1;
            }
        }
        int[] iArr2 = (int[]) this.f7801;
        if (i2 == -1) {
            Arrays.fill(iArr2, i, iArr2.length, -1);
            return ((int[]) this.f7801).length;
        }
        int iMin = Math.min(i2 + 1, iArr2.length);
        Arrays.fill((int[]) this.f7801, i, iMin, -1);
        return iMin;
    }
}
