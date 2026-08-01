package androidx.recyclerview.widget;

import android.view.View;
import androidx.collection.AbstractC0267;
import androidx.collection.C0263;
import androidx.collection.C0283;
import androidx.compose.foundation.text.C0966;
import java.util.ArrayList;
import java.util.Arrays;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2491 implements InterfaceC2479 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f7454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f7455;

    public C2491(C2521 c2521) {
        this.f7455 = c2521;
        C2489 c2489 = new C2489();
        c2489.f7453 = 0;
        this.f7454 = c2489;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public View m4905(int i, int i2, int i3, int i4) {
        View viewM4988;
        C2489 c2489 = (C2489) this.f7454;
        C2521 c2521 = (C2521) this.f7455;
        int iM5010 = c2521.m5010();
        int iM5011 = c2521.m5011();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c2521.f7599) {
                case 0:
                    viewM4988 = c2521.f7598.m4988(i);
                    break;
                default:
                    viewM4988 = c2521.f7598.m4988(i);
                    break;
            }
            int iM5012 = c2521.m5012(viewM4988);
            int iM5013 = c2521.m5013(viewM4988);
            c2489.f7452 = iM5010;
            c2489.f7451 = iM5011;
            c2489.f7450 = iM5012;
            c2489.f7449 = iM5013;
            if (i3 != 0) {
                c2489.f7453 = i3;
                if (c2489.m4904()) {
                    return viewM4988;
                }
            }
            if (i4 != 0) {
                c2489.f7453 = i4;
                if (c2489.m4904()) {
                    view = viewM4988;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m4906(int i) {
        int[] iArr = (int[]) this.f7455;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f7455 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f7455 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f7455;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m4907() {
        int[] iArr = (int[]) this.f7455;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f7454 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4908(AbstractC2484 abstractC2484, C0966 c0966) {
        C0283 c0283 = (C0283) this.f7455;
        C2488 c2488M4903 = (C2488) c0283.get(abstractC2484);
        if (c2488M4903 == null) {
            c2488M4903 = C2488.m4903();
            c0283.put(abstractC2484, c2488M4903);
        }
        c2488M4903.f7446 = c0966;
        c2488M4903.f7448 |= 8;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m4909(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        if (((ArrayList) this.f7454) == null) {
            this.f7454 = new ArrayList();
        }
        int size = ((ArrayList) this.f7454).size();
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f7454;
            if (i >= size) {
                arrayList.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) arrayList.get(i);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7284 == staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7284) {
                ((ArrayList) this.f7454).remove(i);
            }
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.f7284 >= staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7284) {
                ((ArrayList) this.f7454).add(i, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC2479
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public long mo4884(long j) {
        C0263 c0263 = (C0263) this.f7455;
        Long lValueOf = (Long) c0263.m825(j);
        if (lValueOf == null) {
            C2477 c2477 = (C2477) this.f7454;
            long j2 = c2477.f7425;
            c2477.f7425 = 1 + j2;
            lValueOf = Long.valueOf(j2);
            c0263.m822(lValueOf, j);
        }
        return lValueOf.longValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C0966 m4910(AbstractC2484 abstractC2484, int i) {
        C2488 c2488;
        C0966 c0966;
        C0283 c0283 = (C0283) this.f7455;
        int iM863 = c0283.m863(abstractC2484);
        if (iM863 >= 0 && (c2488 = (C2488) c0283.m870(iM863)) != null) {
            int i2 = c2488.f7448;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c2488.f7448 = i3;
                if (i == 4) {
                    c0966 = c2488.f7447;
                } else if (i == 8) {
                    c0966 = c2488.f7446;
                } else {
                    C5919.m11249("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c0283.mo867(iM863);
                    c2488.f7448 = 0;
                    c2488.f7447 = null;
                    c2488.f7446 = null;
                    C2488.f7445.mo3979(c2488);
                }
                return c0966;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m4911(int i, int i2) {
        int[] iArr = (int[]) this.f7455;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m4906(i3);
        int[] iArr2 = (int[]) this.f7455;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f7455;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f7454;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7454).get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7284;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f7454).remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7284 = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m4912(AbstractC2484 abstractC2484) {
        C2488 c2488 = (C2488) ((C0283) this.f7455).get(abstractC2484);
        if (c2488 == null) {
            return;
        }
        c2488.f7448 &= -2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public void m4913(AbstractC2484 abstractC2484) {
        C0263 c0263 = (C0263) this.f7454;
        int iM827 = c0263.m827() - 1;
        while (true) {
            if (iM827 < 0) {
                break;
            }
            if (abstractC2484 == c0263.m828(iM827)) {
                Object[] objArr = c0263.f950;
                Object obj = objArr[iM827];
                Object obj2 = AbstractC0267.f962;
                if (obj != obj2) {
                    objArr[iM827] = obj2;
                    c0263.f951 = true;
                }
            } else {
                iM827--;
            }
        }
        C2488 c2488 = (C2488) ((C0283) this.f7455).remove(abstractC2484);
        if (c2488 != null) {
            c2488.f7448 = 0;
            c2488.f7447 = null;
            c2488.f7446 = null;
            C2488.f7445.mo3979(c2488);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem m4914(int i, int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f7454;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7454).get(i4);
            int i5 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7284;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7282 == i3 || staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7281)) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m4915(int i) {
        ArrayList arrayList = (ArrayList) this.f7454;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7454).get(size)).f7284 >= i) {
                    ((ArrayList) this.f7454).remove(size);
                }
            }
        }
        m4919(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean m4916(View view) {
        C2489 c2489 = (C2489) this.f7454;
        C2521 c2521 = (C2521) this.f7455;
        int iM5010 = c2521.m5010();
        int iM5011 = c2521.m5011();
        int iM5012 = c2521.m5012(view);
        int iM5013 = c2521.m5013(view);
        c2489.f7452 = iM5010;
        c2489.f7451 = iM5011;
        c2489.f7450 = iM5012;
        c2489.f7449 = iM5013;
        c2489.f7453 = 24579;
        return c2489.m4904();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m4917(int i, int i2) {
        int[] iArr = (int[]) this.f7455;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m4906(i3);
        int[] iArr2 = (int[]) this.f7455;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f7455, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f7454;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7454).get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7284;
            if (i4 >= i) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7284 = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem m4918(int i) {
        ArrayList arrayList = (ArrayList) this.f7454;
        if (arrayList == null) {
            return null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.f7454).get(size);
            if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f7284 == i) {
                return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m4919(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f7455
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            goto Lb
        L8:
            int r0 = r0.length
            if (r5 < r0) goto Lc
        Lb:
            return r1
        Lc:
            java.lang.Object r0 = r4.f7454
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L14
        L12:
            r0 = r1
            goto L54
        L14:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.m4918(r5)
            if (r0 == 0) goto L21
            java.lang.Object r2 = r4.f7454
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.remove(r0)
        L21:
            java.lang.Object r0 = r4.f7454
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r2 = 0
        L2a:
            if (r2 >= r0) goto L3e
            java.lang.Object r3 = r4.f7454
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r3
            int r3 = r3.f7284
            if (r3 < r5) goto L3b
            goto L3f
        L3b:
            int r2 = r2 + 1
            goto L2a
        L3e:
            r2 = r1
        L3f:
            if (r2 == r1) goto L12
            java.lang.Object r0 = r4.f7454
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r0
            java.lang.Object r3 = r4.f7454
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.remove(r2)
            int r0 = r0.f7284
        L54:
            java.lang.Object r2 = r4.f7455
            int[] r2 = (int[]) r2
            if (r0 != r1) goto L64
            int r0 = r2.length
            java.util.Arrays.fill(r2, r5, r0, r1)
            java.lang.Object r4 = r4.f7455
            int[] r4 = (int[]) r4
            int r4 = r4.length
            return r4
        L64:
            int r0 = r0 + 1
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r4 = r4.f7455
            int[] r4 = (int[]) r4
            java.util.Arrays.fill(r4, r5, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C2491.m4919(int):int");
    }
}
