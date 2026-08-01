package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.compose.foundation.text.C1804;
import androidx.core.view.InterfaceC3098;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3287 implements InterfaceC3098 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7649;

    public /* synthetic */ C3287(RecyclerView recyclerView) {
        this.f7649 = recyclerView;
    }

    @Override // androidx.core.view.InterfaceC3098
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public void mo4712() {
        this.f7649.m5302();
    }

    @Override // androidx.core.view.InterfaceC3098
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public float mo4713() {
        float f;
        RecyclerView recyclerView = this.f7649;
        if (recyclerView.f7538.mo5235()) {
            f = recyclerView.f7588;
        } else {
            if (!recyclerView.f7538.mo5236()) {
                return 0.0f;
            }
            f = recyclerView.f7592;
        }
        return -f;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m5387(AbstractC3317 abstractC3317, C1804 c1804, C1804 c18042) {
        boolean zM5531;
        abstractC3317.setIsRecyclable(false);
        RecyclerView recyclerView = this.f7649;
        C3338 c3338 = (C3338) recyclerView.f7599;
        if (c1804 != null) {
            c3338.getClass();
            int i = c1804.f3101;
            int i2 = c18042.f3101;
            if (i == i2 && c1804.f3100 == c18042.f3100) {
                c3338.m5533(abstractC3317);
                abstractC3317.itemView.setAlpha(0.0f);
                c3338.f7854.add(abstractC3317);
                zM5531 = true;
            } else {
                zM5531 = c3338.m5531(abstractC3317, i, c1804.f3100, i2, c18042.f3100);
            }
        }
        if (zM5531) {
            recyclerView.m5317();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m5388(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f7649;
        int iM5508 = recyclerView.f7573.m5508();
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
        for (int i11 = 0; i11 < iM5508; i11++) {
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(recyclerView.f7573.m5504(i11));
            if (abstractC3317M5249 != null && (i9 = abstractC3317M5249.mPosition) >= i4 && i9 <= i3) {
                if (RecyclerView.f7522) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + abstractC3317M5249);
                }
                if (abstractC3317M5249.mPosition == i) {
                    abstractC3317M5249.offsetPosition(i2 - i, false);
                } else {
                    abstractC3317M5249.offsetPosition(i5, false);
                }
                recyclerView.f7586.f7953 = true;
            }
        }
        ArrayList arrayList = recyclerView.f7576.f7978;
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
            AbstractC3317 abstractC3317 = (AbstractC3317) arrayList.get(i12);
            if (abstractC3317 != null && (i8 = abstractC3317.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC3317.offsetPosition(i2 - i, false);
                } else {
                    abstractC3317.offsetPosition(i10, false);
                }
                if (RecyclerView.f7522) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + abstractC3317);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f7561 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m5389(int i, int i2) {
        RecyclerView recyclerView = this.f7649;
        int iM5508 = recyclerView.f7573.m5508();
        for (int i3 = 0; i3 < iM5508; i3++) {
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(recyclerView.f7573.m5504(i3));
            if (abstractC3317M5249 != null && !abstractC3317M5249.shouldIgnore() && abstractC3317M5249.mPosition >= i) {
                if (RecyclerView.f7522) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + abstractC3317M5249 + " now at position " + (abstractC3317M5249.mPosition + i2));
                }
                abstractC3317M5249.offsetPosition(i2, false);
                recyclerView.f7586.f7953 = true;
            }
        }
        ArrayList arrayList = recyclerView.f7576.f7978;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC3317 abstractC3317 = (AbstractC3317) arrayList.get(i4);
            if (abstractC3317 != null && abstractC3317.mPosition >= i) {
                if (RecyclerView.f7522) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + abstractC3317 + " now at position " + (abstractC3317.mPosition + i2));
                }
                abstractC3317.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f7561 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m5390(Object obj, int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f7649;
        int iM5508 = recyclerView.f7573.m5508();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM5508; i6++) {
            View viewM5504 = recyclerView.f7573.m5504(i6);
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(viewM5504);
            if (abstractC3317M5249 != null && !abstractC3317M5249.shouldIgnore() && (i4 = abstractC3317M5249.mPosition) >= i && i4 < i5) {
                abstractC3317M5249.addFlags(2);
                abstractC3317M5249.addChangePayload(obj);
                ((C3351) viewM5504.getLayoutParams()).f7923 = true;
            }
        }
        C3364 c3364 = recyclerView.f7576;
        ArrayList arrayList = c3364.f7978;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC3317 abstractC3317 = (AbstractC3317) arrayList.get(size);
            if (abstractC3317 != null && (i3 = abstractC3317.mPosition) >= i && i3 < i5) {
                abstractC3317.addFlags(2);
                c3364.m5597(size);
            }
        }
        recyclerView.f7562 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC3317 m5391(int i) {
        RecyclerView recyclerView = this.f7649;
        int iM5508 = recyclerView.f7573.m5508();
        int i2 = 0;
        AbstractC3317 abstractC3317 = null;
        while (true) {
            if (i2 >= iM5508) {
                break;
            }
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(recyclerView.f7573.m5504(i2));
            if (abstractC3317M5249 != null && !abstractC3317M5249.isRemoved() && abstractC3317M5249.mPosition == i) {
                if (!((ArrayList) recyclerView.f7573.f7814).contains(abstractC3317M5249.itemView)) {
                    abstractC3317 = abstractC3317M5249;
                    break;
                }
                abstractC3317 = abstractC3317M5249;
            }
            i2++;
        }
        if (abstractC3317 != null) {
            if (!((ArrayList) recyclerView.f7573.f7814).contains(abstractC3317.itemView)) {
                return abstractC3317;
            }
            if (RecyclerView.f7522) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m5392(C3330 c3330) {
        int i = c3330.f7825;
        RecyclerView recyclerView = this.f7649;
        if (i == 1) {
            recyclerView.f7538.mo5184(c3330.f7824, c3330.f7822);
            return;
        }
        if (i == 2) {
            recyclerView.f7538.mo5183(c3330.f7824, c3330.f7822);
        } else if (i == 4) {
            recyclerView.f7538.mo5181(recyclerView, c3330.f7824, c3330.f7822);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f7538.mo5186(c3330.f7824, c3330.f7822);
        }
    }

    @Override // androidx.core.view.InterfaceC3098
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public boolean mo4724(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.f7649;
        if (recyclerView.f7538.mo5235()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.f7538.mo5236()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.m5302();
        return recyclerView.m5267(i, i2, 0, Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m5393(int i) {
        RecyclerView recyclerView = this.f7649;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.m5282(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m5394(AbstractC3317 abstractC3317, C1804 c1804, C1804 c18042) {
        boolean zM5531;
        RecyclerView recyclerView = this.f7649;
        recyclerView.f7576.m5596(abstractC3317);
        recyclerView.m5293(abstractC3317);
        abstractC3317.setIsRecyclable(false);
        C3338 c3338 = (C3338) recyclerView.f7599;
        c3338.getClass();
        int i = c1804.f3101;
        int i2 = c1804.f3100;
        View view = abstractC3317.itemView;
        int left = c18042 == null ? view.getLeft() : c18042.f3101;
        int top2 = c18042 == null ? view.getTop() : c18042.f3100;
        if (abstractC3317.isRemoved() || (i == left && i2 == top2)) {
            c3338.m5533(abstractC3317);
            c3338.f7850.add(abstractC3317);
            zM5531 = true;
        } else {
            view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
            zM5531 = c3338.m5531(abstractC3317, i, i2, left, top2);
        }
        if (zM5531) {
            recyclerView.m5317();
        }
    }
}
