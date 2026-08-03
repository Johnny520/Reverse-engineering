package androidx.recyclerview.widget;

import Yue.C7950;
import Yue.InterfaceC6490;
import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8971 implements Runnable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final ThreadLocal<RunnableC8971> f30216 = new ThreadLocal<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static Comparator<C8972> f30217 = new C1771();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public long f30219;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public long f30220;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public ArrayList<RecyclerView> f30218 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ArrayList<C8972> f30221 = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ */
    public static class C1771 implements Comparator<C8972> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public int compare(C8972 c8972, C8972 c89722) {
            RecyclerView recyclerView = c8972.f30225;
            if ((recyclerView == null) != (c89722.f30225 == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = c8972.f3960;
            if (z != c89722.f3960) {
                return z ? -1 : 1;
            }
            int i = c89722.f3961 - c8972.f3961;
            if (i != 0) {
                return i;
            }
            int i2 = c8972.f30224 - c89722.f30224;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ */
    @SuppressLint({"VisibleForTests"})
    public static class C1772 implements RecyclerView.AbstractC8919.InterfaceC8920 {

        /* JADX INFO: renamed from: ۥ */
        public int f3958;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3959;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int[] f30222;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f30223;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919.InterfaceC8920
        /* JADX INFO: renamed from: ۥ */
        public void mo4929(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f30223;
            int i4 = i3 * 2;
            int[] iArr = this.f30222;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f30222 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.f30222 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f30222;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f30223++;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4989() {
            int[] iArr = this.f30222;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f30223 = 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30619(RecyclerView recyclerView, boolean z) {
            this.f30223 = 0;
            int[] iArr = this.f30222;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC8919 abstractC8919 = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || abstractC8919 == null || !abstractC8919.isItemPrefetchEnabled()) {
                return;
            }
            if (z) {
                if (!recyclerView.mAdapterHelper.m30509()) {
                    abstractC8919.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                abstractC8919.collectAdjacentPrefetchPositions(this.f3958, this.f3959, recyclerView.mState, this);
            }
            int i = this.f30223;
            if (i > abstractC8919.mPrefetchMaxCountObserved) {
                abstractC8919.mPrefetchMaxCountObserved = i;
                abstractC8919.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView.mRecycler.m30359();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m30620(int i) {
            if (this.f30222 != null) {
                int i2 = this.f30223 * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f30222[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30621(int i, int i2) {
            this.f3958 = i;
            this.f3959 = i2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟۟, reason: contains not printable characters */
    public static class C8972 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3960;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3961;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f30224;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public RecyclerView f30225;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f30226;

        /* JADX INFO: renamed from: ۥ */
        public void m4990() {
            this.f3960 = false;
            this.f3961 = 0;
            this.f30224 = 0;
            this.f30225 = null;
            this.f30226 = 0;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m30611(RecyclerView recyclerView, int i) {
        int iM30537 = recyclerView.mChildHelper.m30537();
        for (int i2 = 0; i2 < iM30537; i2++) {
            RecyclerView.AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m30536(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C7950.m3971("RV Prefetch");
            if (!this.f30218.isEmpty()) {
                int size = this.f30218.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f30218.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m30615(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f30220);
                    this.f30219 = 0L;
                    C7950.m25086();
                }
            }
        } finally {
            this.f30219 = 0L;
            C7950.m25086();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4986(RecyclerView recyclerView) {
        this.f30218.add(recyclerView);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4987() {
        C8972 c8972;
        int size = this.f30218.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f30218.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m30619(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f30223;
            }
        }
        this.f30221.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f30218.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1772 c1772 = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(c1772.f3958) + Math.abs(c1772.f3959);
                for (int i5 = 0; i5 < c1772.f30223 * 2; i5 += 2) {
                    if (i3 >= this.f30221.size()) {
                        c8972 = new C8972();
                        this.f30221.add(c8972);
                    } else {
                        c8972 = this.f30221.get(i3);
                    }
                    int[] iArr = c1772.f30222;
                    int i6 = iArr[i5 + 1];
                    c8972.f3960 = i6 <= iAbs;
                    c8972.f3961 = iAbs;
                    c8972.f30224 = i6;
                    c8972.f30225 = recyclerView2;
                    c8972.f30226 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f30221, f30217);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m30612(C8972 c8972, long j) {
        RecyclerView.AbstractC8938 abstractC8938M30617 = m30617(c8972.f30225, c8972.f30226, c8972.f3960 ? Long.MAX_VALUE : j);
        if (abstractC8938M30617 == null || abstractC8938M30617.mNestedRecyclerView == null || !abstractC8938M30617.isBound() || abstractC8938M30617.isInvalid()) {
            return;
        }
        m30616(abstractC8938M30617.mNestedRecyclerView.get(), j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m30613(long j) {
        for (int i = 0; i < this.f30221.size(); i++) {
            C8972 c8972 = this.f30221.get(i);
            if (c8972.f30225 == null) {
                return;
            }
            m30612(c8972, j);
            c8972.m4990();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m30614(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f30219 == 0) {
            this.f30219 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.m30621(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m30615(long j) {
        m4987();
        m30613(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m30616(@InterfaceC6490 RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m30537() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        C1772 c1772 = recyclerView.mPrefetchRegistry;
        c1772.m30619(recyclerView, true);
        if (c1772.f30223 != 0) {
            try {
                C7950.m3971("RV Nested Prefetch");
                recyclerView.mState.m30382(recyclerView.mAdapter);
                for (int i = 0; i < c1772.f30223 * 2; i += 2) {
                    m30617(recyclerView, c1772.f30222[i], j);
                }
            } finally {
                C7950.m25086();
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final RecyclerView.AbstractC8938 m30617(RecyclerView recyclerView, int i, long j) {
        if (m30611(recyclerView, i)) {
            return null;
        }
        RecyclerView.C8929 c8929 = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.AbstractC8938 abstractC8938M30357 = c8929.m30357(i, false, j);
            if (abstractC8938M30357 != null) {
                if (!abstractC8938M30357.isBound() || abstractC8938M30357.isInvalid()) {
                    c8929.m4935(abstractC8938M30357, false);
                } else {
                    c8929.m30350(abstractC8938M30357.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return abstractC8938M30357;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m30618(RecyclerView recyclerView) {
        this.f30218.remove(recyclerView);
    }
}
