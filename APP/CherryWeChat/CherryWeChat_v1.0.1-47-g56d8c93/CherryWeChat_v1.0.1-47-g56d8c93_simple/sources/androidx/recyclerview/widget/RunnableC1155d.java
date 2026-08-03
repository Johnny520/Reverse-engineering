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
    public static final ThreadLocal f4024e = null;

    /* JADX INFO: renamed from: f */
    public static final C0963Wb f4025f = null;

    /* JADX INFO: renamed from: a */
    public ArrayList f4026a;

    /* JADX INFO: renamed from: b */
    public long f4027b;

    /* JADX INFO: renamed from: c */
    public long f4028c;

    /* JADX INFO: renamed from: d */
    public ArrayList f4029d;

    static {
        f4024e = new ThreadLocal();
        f4025f = new C0963Wb(4);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC1166o m2241c(RecyclerView r5, int r6, long r7) {
        int r0 = r5.mChildHelper.m2235h();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L11;
        AbstractC1166o r3 = RecyclerView.getChildViewHolderInt(r5.mChildHelper.m2234g(r2));
        if (r3.mPosition != r6) goto L10;
        if (r3.isInvalid() == true) goto L10;
        return null;
    L10:
        r2 = r2 + 1;
        goto L3
    L11:
        C1161j r02 = r5.mRecycler;
        r5.onEnterLayoutOrScroll();     // Catch: Throwable -> L19
        AbstractC1166o r62 = r02.m2266m(r6, r7);     // Catch: Throwable -> L19
        if (r62 != null) goto L15;
    L22:
        r5.onExitLayoutOrScroll(false);
        return r62;
    L15:
        if (r62.isBound() == true) goto L17;
    L21:
        r02.m2255a(r62, false);     // Catch: Throwable -> L19
        goto L22
    L17:
        if (r62.isInvalid() == true) goto L21;
        r02.m2263j(r62.itemView);     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        r5.onExitLayoutOrScroll(false);
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public final void m2242a(RecyclerView r5, int r6, int r7) {
        if (r5.isAttachedToWindow() == true) goto L5;
    L14:
        C1154c r52 = r5.mPrefetchRegistry;
        r52.f4020a = r6;
        r52.f4021b = r7;
        return;
    L5:
        if (RecyclerView.sDebugAssertionsEnabled == false) goto L12;
        if (this.f4026a.contains(r5) == true) goto L12;
        throw new IllegalStateException("attempting to post unregistered view!");
    L12:
        if (this.f4027b != 0) goto L14;
        this.f4027b = r5.getNanoTime();
        r5.post(this);
        goto L14
    }

    /* JADX INFO: renamed from: b */
    public final void m2243b(long r17) {
        ArrayList r0 = this.f4029d;
        ArrayList r2 = this.f4026a;
        int r3 = r2.size();
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r5 >= r3) goto L8;
        RecyclerView r7 = (RecyclerView) r2.get(r5);
        if (r7.getWindowVisibility() != 0) goto L7;
        r7.mPrefetchRegistry.m2240b(r7, false);
        r6 = r6 + r7.mPrefetchRegistry.f4023d;
    L7:
        r5 = r5 + 1;
        goto L3
    L8:
        r0.ensureCapacity(r6);
        int r52 = 0;
        int r62 = 0;
    L10:
        if (r52 >= r3) goto L27;
        RecyclerView r8 = (RecyclerView) r2.get(r52);
        if (r8.getWindowVisibility() != 0) goto L26;
        C1154c r9 = r8.mPrefetchRegistry;
        int r11 = Math.abs(r9.f4021b) + Math.abs(r9.f4020a);
        int r10 = 0;
    L16:
        if (r10 >= (r9.f4023d * 2)) goto L26;
        if (r62 < r0.size()) goto L20;
        C2419qj r12 = new C2419qj();
        r0.add(r12);
    L21:
        int[] r13 = r9.f4022c;
        int r14 = r13[r10 + 1];
        if (r14 > r11) goto L24;
        boolean r15 = true;
    L25:
        r12.f8478a = r15;
        r12.f8479b = r11;
        r12.f8480c = r14;
        r12.f8481d = r8;
        r12.f8482e = r13[r10];
        r62 = r62 + 1;
        r10 = r10 + 2;
        goto L16
    L24:
        r15 = false;
        goto L25
    L20:
        r12 = (C2419qj) r0.get(r62);
    L26:
        r52 = r52 + 1;
        goto L10
    L27:
        Collections.sort(r0, f4025f);
        int r22 = 0;
    L29:
        if (r22 >= r0.size()) goto L66;
        C2419qj r32 = (C2419qj) r0.get(r22);
        RecyclerView r53 = r32.f8481d;
        if (r53 == null) goto L82;
        if (r32.f8478a == false) goto L36;
        long r82 = Long.MAX_VALUE;
    L37:
        AbstractC1166o r54 = m2241c(r53, r32.f8482e, r82);
        if (r54 == null) goto L65;
        if (r54.mNestedRecyclerView == null) goto L65;
        if (r54.isBound() == false) goto L65;
        if (r54.isInvalid() == true) goto L65;
        RecyclerView r55 = r54.mNestedRecyclerView.get();
        if (r55 == null) goto L65;
        if (r55.mDataSetHasChangedAfterLayout == true) goto L51;
    L53:
        C1154c r63 = r55.mPrefetchRegistry;
        r63.m2240b(r55, true);
        if (r63.f4023d == 0) goto L65;
        int r92 = AbstractC2792zB.f9460a;     // Catch: Throwable -> L60
        Trace.beginSection("RV Nested Prefetch");     // Catch: Throwable -> L60
        C0038Av r83 = r55.mState;     // Catch: Throwable -> L60
        AbstractC1158g r93 = r55.mAdapter;     // Catch: Throwable -> L60
        r83.f79d = 1;     // Catch: Throwable -> L60
        r83.f80e = r93.getItemCount();     // Catch: Throwable -> L60
        r83.f82g = false;     // Catch: Throwable -> L60
        r83.f83h = false;     // Catch: Throwable -> L60
        r83.f84i = false;     // Catch: Throwable -> L60
        int r84 = 0;
    L56:
        if (r84 >= (r63.f4023d * 2)) goto L62;
        m2241c(r55, r63.f4022c[r84], r17);     // Catch: Throwable -> L60
        r84 = r84 + 2;
        goto L56
    L62:
        Trace.endSection();
    L60:
        th = move-exception;
        int r23 = AbstractC2792zB.f9460a;
        Trace.endSection();
        throw th;
    L51:
        if (r55.mChildHelper.m2235h() == 0) goto L53;
        r55.removeAndRecycleViews();
    L65:
        r32.f8478a = false;
        r32.f8479b = 0;
        r32.f8480c = 0;
        r32.f8481d = null;
        r32.f8482e = 0;
        r22 = r22 + 1;
        goto L29
    L36:
        r82 = r17;
        goto L37
    L82:
        return;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList r0 = this.f4026a;
        int r4 = AbstractC2792zB.f9460a;     // Catch: Throwable -> L12
        Trace.beginSection("RV Prefetch");     // Catch: Throwable -> L12
        if (r0.isEmpty() == false) goto L7;
    L5:
        this.f4027b = 0;
        Trace.endSection();
        return;
    L7:
        int r3 = r0.size();     // Catch: Throwable -> L12
        int r42 = 0;
        long r5 = 0;
    L8:
        if (r42 >= r3) goto L16;
        RecyclerView r7 = (RecyclerView) r0.get(r42);     // Catch: Throwable -> L12
        if (r7.getWindowVisibility() != 0) goto L14;
        r5 = Math.max(r7.getDrawingTime(), r5);     // Catch: Throwable -> L12
    L14:
        r42 = r42 + 1;     // Catch: Throwable -> L12
        goto L8
    L16:
        if (r5 == 0) goto L5;
        m2243b(TimeUnit.MILLISECONDS.toNanos(r5) + this.f4028c);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        this.f4027b = 0;
        int r1 = AbstractC2792zB.f9460a;
        Trace.endSection();
        throw th;
    }
}
