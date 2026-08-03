package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p000.AbstractC2792zB;
import p000.C0038Av;
import p000.C0963Wb;
import p000.C2419qj;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1155d implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f4024e = new ThreadLocal();

    /* JADX INFO: renamed from: f */
    public static final C0963Wb f4025f = new C0963Wb(4);

    /* JADX INFO: renamed from: a */
    public ArrayList f4026a;

    /* JADX INFO: renamed from: b */
    public long f4027b;

    /* JADX INFO: renamed from: c */
    public long f4028c;

    /* JADX INFO: renamed from: d */
    public ArrayList f4029d;

    /* JADX INFO: renamed from: c */
    public static AbstractC1166o m2241c(RecyclerView recyclerView, int i, long j) {
        int iM2235h = recyclerView.mChildHelper.m2235h();
        for (int i2 = 0; i2 < iM2235h; i2++) {
            AbstractC1166o childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m2234g(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return null;
            }
        }
        C1161j c1161j = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            AbstractC1166o abstractC1166oM2266m = c1161j.m2266m(i, j);
            if (abstractC1166oM2266m != null) {
                if (!abstractC1166oM2266m.isBound() || abstractC1166oM2266m.isInvalid()) {
                    c1161j.m2255a(abstractC1166oM2266m, false);
                } else {
                    c1161j.m2263j(abstractC1166oM2266m.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return abstractC1166oM2266m;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2242a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f4026a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f4027b == 0) {
                this.f4027b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C1154c c1154c = recyclerView.mPrefetchRegistry;
        c1154c.f4020a = i;
        c1154c.f4021b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2243b(long j) {
        C2419qj c2419qj;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C2419qj c2419qj2;
        ArrayList arrayList = this.f4029d;
        ArrayList arrayList2 = this.f4026a;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.m2240b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.f4023d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1154c c1154c = recyclerView4.mPrefetchRegistry;
                int iAbs = Math.abs(c1154c.f4021b) + Math.abs(c1154c.f4020a);
                for (int i5 = 0; i5 < c1154c.f4023d * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        c2419qj2 = new C2419qj();
                        arrayList.add(c2419qj2);
                    } else {
                        c2419qj2 = (C2419qj) arrayList.get(i3);
                    }
                    int[] iArr = c1154c.f4022c;
                    int i6 = iArr[i5 + 1];
                    c2419qj2.f8478a = i6 <= iAbs;
                    c2419qj2.f8479b = iAbs;
                    c2419qj2.f8480c = i6;
                    c2419qj2.f8481d = recyclerView4;
                    c2419qj2.f8482e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, f4025f);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (c2419qj = (C2419qj) arrayList.get(i7)).f8481d) != null; i7++) {
            AbstractC1166o abstractC1166oM2241c = m2241c(recyclerView, c2419qj.f8482e, c2419qj.f8478a ? Long.MAX_VALUE : j);
            if (abstractC1166oM2241c != null && abstractC1166oM2241c.mNestedRecyclerView != null && abstractC1166oM2241c.isBound() && !abstractC1166oM2241c.isInvalid() && (recyclerView2 = abstractC1166oM2241c.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.m2235h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                C1154c c1154c2 = recyclerView2.mPrefetchRegistry;
                c1154c2.m2240b(recyclerView2, true);
                if (c1154c2.f4023d != 0) {
                    try {
                        int i8 = AbstractC2792zB.f9460a;
                        Trace.beginSection("RV Nested Prefetch");
                        C0038Av c0038Av = recyclerView2.mState;
                        AbstractC1158g abstractC1158g = recyclerView2.mAdapter;
                        c0038Av.f79d = 1;
                        c0038Av.f80e = abstractC1158g.getItemCount();
                        c0038Av.f82g = false;
                        c0038Av.f83h = false;
                        c0038Av.f84i = false;
                        for (int i9 = 0; i9 < c1154c2.f4023d * 2; i9 += 2) {
                            m2241c(recyclerView2, c1154c2.f4022c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = AbstractC2792zB.f9460a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c2419qj.f8478a = false;
            c2419qj.f8479b = 0;
            c2419qj.f8480c = 0;
            c2419qj.f8481d = null;
            c2419qj.f8482e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f4026a;
        try {
            int i = AbstractC2792zB.f9460a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m2243b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f4028c);
                }
            }
            this.f4027b = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f4027b = 0L;
            int i3 = AbstractC2792zB.f9460a;
            Trace.endSection();
            throw th;
        }
    }
}
