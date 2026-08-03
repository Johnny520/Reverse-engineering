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
    public final void m2239a(int r6, int r7) {
        if (r6 < 0) goto L15;
        if (r7 < 0) goto L13;
        int r0 = this.f4023d;
        int r1 = r0 * 2;
        int[] r2 = this.f4022c;
        if (r2 != null) goto L8;
        int[] r02 = new int[4];
        this.f4022c = r02;
        Arrays.fill(r02, -1);
    L10:
        int[] r03 = this.f4022c;
        r03[r1] = r6;
        r03[r1 + 1] = r7;
        this.f4023d++;
        return;
    L8:
        if (r1 < r2.length) goto L10;
        int[] r04 = new int[r0 * 4];
        this.f4022c = r04;
        System.arraycopy(r2, 0, r04, 0, r2.length);
        goto L10
    L13:
        throw new IllegalArgumentException("Pixel distance must be non-negative");
    L15:
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    /* JADX INFO: renamed from: b */
    public final void m2240b(RecyclerView r5, boolean r6) {
        this.f4023d = 0;
        int[] r0 = this.f4022c;
        if (r0 == null) goto L5;
        Arrays.fill(r0, -1);
    L5:
        AbstractC1160i r02 = r5.mLayout;
        if (r5.mAdapter == null) goto L21;
        if (r02 != null) goto L9;
        return;
    L9:
        if (r02.isItemPrefetchEnabled() == false) goto L23;
        if (r6 == false) goto L15;
        if (r5.mAdapterHelper.m2222g() == true) goto L17;
        r02.collectInitialPrefetchPositions(r5.mAdapter.getItemCount(), this);
    L17:
        int r1 = this.f4023d;
        if (r1 <= r02.mPrefetchMaxCountObserved) goto L24;
        r02.mPrefetchMaxCountObserved = r1;
        r02.mPrefetchMaxObservedInInitialPrefetch = r6;
        r5.mRecycler.m2268o();
        return;
    L24:
        return;
    L15:
        if (r5.hasPendingAdapterUpdates() == true) goto L17;
        r02.collectAdjacentPrefetchPositions(this.f4020a, this.f4021b, r5.mState, this);
        goto L17
    L23:
        return;
    }
}
