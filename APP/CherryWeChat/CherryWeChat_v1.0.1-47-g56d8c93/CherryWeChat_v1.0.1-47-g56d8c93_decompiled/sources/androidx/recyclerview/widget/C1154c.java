package androidx.recyclerview.widget;

import java.util.Arrays;
import p000.InterfaceC2337ov;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1154c implements InterfaceC2337ov {

    /* JADX INFO: renamed from: a */
    public int f4020a;

    /* JADX INFO: renamed from: b */
    public int f4021b;

    /* JADX INFO: renamed from: c */
    public int[] f4022c;

    /* JADX INFO: renamed from: d */
    public int f4023d;

    /* JADX INFO: renamed from: a */
    public final void m2239a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f4023d;
        int i4 = i3 * 2;
        int[] iArr = this.f4022c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f4022c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f4022c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f4022c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f4023d++;
    }

    /* JADX INFO: renamed from: b */
    public final void m2240b(RecyclerView recyclerView, boolean z) {
        this.f4023d = 0;
        int[] iArr = this.f4022c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC1160i abstractC1160i = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || abstractC1160i == null || !abstractC1160i.isItemPrefetchEnabled()) {
            return;
        }
        if (z) {
            if (!recyclerView.mAdapterHelper.m2222g()) {
                abstractC1160i.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            abstractC1160i.collectAdjacentPrefetchPositions(this.f4020a, this.f4021b, recyclerView.mState, this);
        }
        int i = this.f4023d;
        if (i > abstractC1160i.mPrefetchMaxCountObserved) {
            abstractC1160i.mPrefetchMaxCountObserved = i;
            abstractC1160i.mPrefetchMaxObservedInInitialPrefetch = z;
            recyclerView.mRecycler.m2268o();
        }
    }
}
