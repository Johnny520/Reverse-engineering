package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.C1196a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1218w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f5198a;

    public C1218w(RecyclerView recyclerView) {
        this.f5198a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public final void m2999a(C1196a.a aVar) {
        int i = aVar.f5062a;
        RecyclerView recyclerView = this.f5198a;
        if (i == 1) {
            recyclerView.f4864m.mo2656Y(aVar.f5063b, aVar.f5064c);
            return;
        }
        if (i == 2) {
            recyclerView.f4864m.mo2659b0(aVar.f5063b, aVar.f5064c);
        } else if (i == 4) {
            recyclerView.f4864m.mo2660c0(aVar.f5063b, aVar.f5064c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f4864m.mo2658a0(aVar.f5063b, aVar.f5064c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final RecyclerView.AbstractC1163A m3000b(int i) {
        RecyclerView recyclerView = this.f5198a;
        int iM2950h = recyclerView.f4850f.m2950h();
        int i2 = 0;
        RecyclerView.AbstractC1163A abstractC1163A = null;
        while (true) {
            if (i2 >= iM2950h) {
                break;
            }
            RecyclerView.AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(recyclerView.f4850f.m2949g(i2));
            if (abstractC1163AM2735L != null && !abstractC1163AM2735L.m2802h() && abstractC1163AM2735L.f4893c == i) {
                if (!recyclerView.f4850f.f5067c.contains(abstractC1163AM2735L.f4891a)) {
                    abstractC1163A = abstractC1163AM2735L;
                    break;
                }
                abstractC1163A = abstractC1163AM2735L;
            }
            i2++;
        }
        if (abstractC1163A != null) {
            if (!recyclerView.f4850f.f5067c.contains(abstractC1163A.f4891a)) {
                return abstractC1163A;
            }
            if (RecyclerView.f4816z0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m3001c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f5198a;
        int iM2950h = recyclerView.f4850f.m2950h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM2950h; i6++) {
            View viewM2949g = recyclerView.f4850f.m2949g(i6);
            RecyclerView.AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(viewM2949g);
            if (abstractC1163AM2735L != null && !abstractC1163AM2735L.m2809o() && (i4 = abstractC1163AM2735L.f4893c) >= i && i4 < i5) {
                abstractC1163AM2735L.m2795a(2);
                abstractC1163AM2735L.m2795a(1024);
                ((RecyclerView.C1176m) viewM2949g.getLayoutParams()).f4949c = true;
            }
        }
        RecyclerView.C1181r c1181r = recyclerView.f4844c;
        ArrayList<RecyclerView.AbstractC1163A> arrayList = c1181r.f4960c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC1163A abstractC1163A = arrayList.get(size);
            if (abstractC1163A != null && (i3 = abstractC1163A.f4893c) >= i && i3 < i5) {
                abstractC1163A.m2795a(2);
                c1181r.m2874g(size);
            }
        }
        recyclerView.f4859j0 = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m3002d(int i, int i2) {
        RecyclerView recyclerView = this.f5198a;
        int iM2950h = recyclerView.f4850f.m2950h();
        for (int i3 = 0; i3 < iM2950h; i3++) {
            RecyclerView.AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(recyclerView.f4850f.m2949g(i3));
            if (abstractC1163AM2735L != null && !abstractC1163AM2735L.m2809o() && abstractC1163AM2735L.f4893c >= i) {
                if (RecyclerView.f4816z0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + abstractC1163AM2735L + " now at position " + (abstractC1163AM2735L.f4893c + i2));
                }
                abstractC1163AM2735L.m2806l(i2, false);
                recyclerView.f4851f0.f4988f = true;
            }
        }
        ArrayList<RecyclerView.AbstractC1163A> arrayList = recyclerView.f4844c.f4960c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.AbstractC1163A abstractC1163A = arrayList.get(i4);
            if (abstractC1163A != null && abstractC1163A.f4893c >= i) {
                if (RecyclerView.f4816z0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + abstractC1163A + " now at position " + (abstractC1163A.f4893c + i2));
                }
                abstractC1163A.m2806l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f4857i0 = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m3003e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f5198a;
        int iM2950h = recyclerView.f4850f.m2950h();
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        boolean z = false;
        for (int i11 = 0; i11 < iM2950h; i11++) {
            RecyclerView.AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(recyclerView.f4850f.m2949g(i11));
            if (abstractC1163AM2735L != null && (i10 = abstractC1163AM2735L.f4893c) >= i4 && i10 <= i3) {
                if (RecyclerView.f4816z0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + abstractC1163AM2735L);
                }
                if (abstractC1163AM2735L.f4893c == i) {
                    abstractC1163AM2735L.m2806l(i2 - i, false);
                } else {
                    abstractC1163AM2735L.m2806l(i5, false);
                }
                recyclerView.f4851f0.f4988f = true;
            }
        }
        RecyclerView.C1181r c1181r = recyclerView.f4844c;
        c1181r.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        } else {
            i6 = i;
            i7 = i2;
            i8 = 1;
        }
        ArrayList<RecyclerView.AbstractC1163A> arrayList = c1181r.f4960c;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            RecyclerView.AbstractC1163A abstractC1163A = arrayList.get(i12);
            if (abstractC1163A != null && (i9 = abstractC1163A.f4893c) >= i7 && i9 <= i6) {
                if (i9 == i) {
                    abstractC1163A.m2806l(i2 - i, z);
                } else {
                    abstractC1163A.m2806l(i8, z);
                }
                if (RecyclerView.f4816z0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + abstractC1163A);
                }
            }
            i12++;
            z = false;
        }
        recyclerView.requestLayout();
        recyclerView.f4857i0 = true;
    }
}
