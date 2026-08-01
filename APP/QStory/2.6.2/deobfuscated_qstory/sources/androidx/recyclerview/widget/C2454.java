package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.compose.foundation.text.C0966;
import androidx.core.view.InterfaceC2265;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2454 implements InterfaceC2265 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7303;

    public /* synthetic */ C2454(RecyclerView recyclerView) {
        this.f7303 = recyclerView;
    }

    @Override // androidx.core.view.InterfaceC2265
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo4142() {
        this.f7303.m4732();
    }

    @Override // androidx.core.view.InterfaceC2265
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public float mo4143() {
        float f;
        RecyclerView recyclerView = this.f7303;
        if (recyclerView.f7192.mo4665()) {
            f = recyclerView.f7242;
        } else {
            if (!recyclerView.f7192.mo4666()) {
                return 0.0f;
            }
            f = recyclerView.f7246;
        }
        return -f;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m4817(androidx.recyclerview.widget.AbstractC2484 r8, androidx.compose.foundation.text.C0966 r9, androidx.compose.foundation.text.C0966 r10) {
        /*
            r7 = this;
            r0 = 0
            r8.setIsRecyclable(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r7.f7303
            androidx.recyclerview.widget.飘花落叶言子苏楪兰世哲 r0 = r7.f7253
            r1 = r0
            androidx.recyclerview.widget.飘花落叶言子楪哲世苏兰 r1 = (androidx.recyclerview.widget.C2505) r1
            if (r9 == 0) goto L1d
            r1.getClass()
            int r3 = r9.f2755
            int r5 = r10.f2755
            if (r3 != r5) goto L1f
            int r0 = r9.f2754
            int r2 = r10.f2754
            if (r0 == r2) goto L1d
            goto L1f
        L1d:
            r2 = r8
            goto L29
        L1f:
            int r4 = r9.f2754
            int r6 = r10.f2754
            r2 = r8
            boolean r8 = r1.m4961(r2, r3, r4, r5, r6)
            goto L38
        L29:
            r1.m4963(r2)
            android.view.View r8 = r2.itemView
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.f7508
            r8.add(r2)
            r8 = 1
        L38:
            if (r8 == 0) goto L3d
            r7.m4747()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C2454.m4817(androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰, androidx.compose.foundation.text.飘花落叶言子哲楪苏兰世, androidx.compose.foundation.text.飘花落叶言子哲楪苏兰世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m4818(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f7303;
        int iM4938 = recyclerView.f7227.m4938();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM4938; i11++) {
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(recyclerView.f7227.m4934(i11));
            if (abstractC2484M4679 != null && (i9 = abstractC2484M4679.mPosition) >= i4 && i9 <= i3) {
                if (RecyclerView.f7176) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + abstractC2484M4679);
                }
                if (abstractC2484M4679.mPosition == i) {
                    abstractC2484M4679.offsetPosition(i2 - i, false);
                } else {
                    abstractC2484M4679.offsetPosition(i5, false);
                }
                recyclerView.f7240.f7607 = true;
            }
        }
        ArrayList arrayList = recyclerView.f7230.f7632;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC2484 abstractC2484 = (AbstractC2484) arrayList.get(i12);
            if (abstractC2484 != null && (i8 = abstractC2484.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC2484.offsetPosition(i2 - i, false);
                } else {
                    abstractC2484.offsetPosition(i10, false);
                }
                if (RecyclerView.f7176) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + abstractC2484);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f7215 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m4819(int i, int i2) {
        RecyclerView recyclerView = this.f7303;
        int iM4938 = recyclerView.f7227.m4938();
        for (int i3 = 0; i3 < iM4938; i3++) {
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(recyclerView.f7227.m4934(i3));
            if (abstractC2484M4679 != null && !abstractC2484M4679.shouldIgnore() && abstractC2484M4679.mPosition >= i) {
                if (RecyclerView.f7176) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + abstractC2484M4679 + " now at position " + (abstractC2484M4679.mPosition + i2));
                }
                abstractC2484M4679.offsetPosition(i2, false);
                recyclerView.f7240.f7607 = true;
            }
        }
        ArrayList arrayList = recyclerView.f7230.f7632;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC2484 abstractC2484 = (AbstractC2484) arrayList.get(i4);
            if (abstractC2484 != null && abstractC2484.mPosition >= i) {
                if (RecyclerView.f7176) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + abstractC2484 + " now at position " + (abstractC2484.mPosition + i2));
                }
                abstractC2484.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f7215 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m4820(Object obj, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f7303;
        int iM4938 = recyclerView.f7227.m4938();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM4938; i6++) {
            View viewM4934 = recyclerView.f7227.m4934(i6);
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(viewM4934);
            if (abstractC2484M4679 != null && !abstractC2484M4679.shouldIgnore() && (i4 = abstractC2484M4679.mPosition) >= i && i4 < i5) {
                abstractC2484M4679.addFlags(2);
                abstractC2484M4679.addChangePayload(obj);
                ((C2518) viewM4934.getLayoutParams()).f7577 = true;
            }
        }
        C2531 c2531 = recyclerView.f7230;
        ArrayList arrayList = c2531.f7632;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC2484 abstractC2484 = (AbstractC2484) arrayList.get(size);
            if (abstractC2484 != null && (i3 = abstractC2484.mPosition) >= i && i3 < i5) {
                abstractC2484.addFlags(2);
                c2531.m5027(size);
            }
        }
        recyclerView.f7216 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC2484 m4821(int i) {
        RecyclerView recyclerView = this.f7303;
        int iM4938 = recyclerView.f7227.m4938();
        int i2 = 0;
        AbstractC2484 abstractC2484 = null;
        while (true) {
            if (i2 >= iM4938) {
                break;
            }
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(recyclerView.f7227.m4934(i2));
            if (abstractC2484M4679 != null && !abstractC2484M4679.isRemoved() && abstractC2484M4679.mPosition == i) {
                if (!((ArrayList) recyclerView.f7227.f7468).contains(abstractC2484M4679.itemView)) {
                    abstractC2484 = abstractC2484M4679;
                    break;
                }
                abstractC2484 = abstractC2484M4679;
            }
            i2++;
        }
        if (abstractC2484 != null) {
            if (!((ArrayList) recyclerView.f7227.f7468).contains(abstractC2484.itemView)) {
                return abstractC2484;
            }
            if (RecyclerView.f7176) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m4822(C2497 c2497) {
        int i = c2497.f7479;
        RecyclerView recyclerView = this.f7303;
        if (i == 1) {
            recyclerView.f7192.mo4614(c2497.f7478, c2497.f7476);
            return;
        }
        if (i == 2) {
            recyclerView.f7192.mo4613(c2497.f7478, c2497.f7476);
        } else if (i == 4) {
            recyclerView.f7192.mo4611(recyclerView, c2497.f7478, c2497.f7476);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f7192.mo4616(c2497.f7478, c2497.f7476);
        }
    }

    @Override // androidx.core.view.InterfaceC2265
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo4154(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.f7303;
        if (recyclerView.f7192.mo4665()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.f7192.mo4666()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.m4732();
        return recyclerView.m4697(i, i2, 0, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m4823(int i) {
        RecyclerView recyclerView = this.f7303;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.m4712(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m4824(AbstractC2484 abstractC2484, C0966 c0966, C0966 c09662) {
        boolean zM4961;
        RecyclerView recyclerView = this.f7303;
        recyclerView.f7230.m5026(abstractC2484);
        recyclerView.m4723(abstractC2484);
        abstractC2484.setIsRecyclable(false);
        C2505 c2505 = (C2505) recyclerView.f7253;
        c2505.getClass();
        int i = c0966.f2755;
        int i2 = c0966.f2754;
        View view = abstractC2484.itemView;
        int left = c09662 == null ? view.getLeft() : c09662.f2755;
        int top2 = c09662 == null ? view.getTop() : c09662.f2754;
        if (abstractC2484.isRemoved() || (i == left && i2 == top2)) {
            c2505.m4963(abstractC2484);
            c2505.f7504.add(abstractC2484);
            zM4961 = true;
        } else {
            view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
            zM4961 = c2505.m4961(abstractC2484, i, i2, left, top2);
        }
        if (zM4961) {
            recyclerView.m4747();
        }
    }
}
