package io.github.cherrywechat.lua;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.InterfaceC0884Ui;
import p000.RunnableC0805Sp;
import p000.RunnableC2260n3;

/* JADX INFO: loaded from: classes.dex */
public final class LuaUiScheduler {
    public static final LuaUiScheduler INSTANCE = null;
    private static final int MAX_PENDING_TASKS = 100;
    private static final String TAG = null;
    private static volatile boolean isForeground;
    private static final Handler mainHandler = null;
    private static final AtomicInteger pendingCount = null;
    private static final ConcurrentLinkedQueue<InterfaceC0884Ui> pendingTasks = null;
    private static final AtomicInteger resumedCount = null;

    static {
        TAG = AbstractC0295Gu.m625r(-363891104151605L);
        INSTANCE = new LuaUiScheduler();
        mainHandler = new Handler(Looper.getMainLooper());
        pendingTasks = new ConcurrentLinkedQueue();
        pendingCount = new AtomicInteger(0);
        resumedCount = new AtomicInteger(0);
        isForeground = true;
    }

    private LuaUiScheduler() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2984a(InterfaceC0884Ui r0, CountDownLatch r1) {
        runOnUiThreadSync$lambda$1(r0, r1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2985b(InterfaceC0884Ui r0) {
        runOnUiThread$lambda$0(r0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m2986c(InterfaceC0884Ui r0) {
        flush$lambda$2(r0);
    }

    private final void enqueue(InterfaceC0884Ui r4) {
        AtomicInteger r0 = pendingCount;
        if (r0.incrementAndGet() <= MAX_PENDING_TASKS) goto L6;
        r0.decrementAndGet();
        AbstractC0295Gu.m625r(-363719305459765L);
        AbstractC0295Gu.m625r(-363783729969205L);
        return;
    L6:
        pendingTasks.offer(r4);
    }

    private final void flush() {
    L2:
        InterfaceC0884Ui r0 = pendingTasks.poll();
        if (r0 == null) goto L4;
        pendingCount.decrementAndGet();
        mainHandler.post(new RunnableC0805Sp(0, r0));
        goto L2
    }

    private static final void flush$lambda$2(InterfaceC0884Ui r0) {
        r0.mo6a();
    }

    private static final void runOnUiThread$lambda$0(InterfaceC0884Ui r0) {
        r0.mo6a();
    }

    private static final void runOnUiThreadSync$lambda$1(InterfaceC0884Ui r0, CountDownLatch r1) {
        r0.mo6a();     // Catch: Throwable -> L5
        r1.countDown();
        return;
    L5:
        th = move-exception;
        r1.countDown();
        throw th;
    }

    private final void setForeground(boolean r2) {
        if (isForeground == r2) goto L10;
        isForeground = r2;
        if (r2 == false) goto L9;
        flush();
        return;
    L9:
        return;
    }

    public final boolean isForeground() {
        return isForeground;
    }

    public final void onActivityPaused() {
        AtomicInteger r0 = resumedCount;
        if (r0.decrementAndGet() > 0) goto L6;
        r0.set(0);
        setForeground(false);
        return;
    }

    public final void onActivityResumed() {
        if (resumedCount.incrementAndGet() != 1) goto L6;
        setForeground(true);
        return;
    }

    public final void runOnUiThread(InterfaceC0884Ui r4) {
        AbstractC0295Gu.m625r(-362916146575413L);
        if (isForeground == true) goto L5;
        enqueue(r4);
        return;
    L5:
        if (AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper()) == false) goto L8;
        r4.mo6a();
        return;
    L8:
        mainHandler.post(new RunnableC0805Sp(1, r4));
    }

    public final boolean runOnUiThreadSync(InterfaceC0884Ui r6) {
        AbstractC0295Gu.m625r(-362946211346485L);
        if (isForeground == true) goto L7;
        enqueue(r6);
        return false;
    L7:
        if (AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper()) == false) goto L10;
        r6.mo6a();
        return true;
    L10:
        CountDownLatch r0 = new CountDownLatch(1);
        mainHandler.post(new RunnableC2260n3(12, r6, r0));
        return r0.await(5, TimeUnit.SECONDS);
    L13:
        AbstractC0295Gu.m625r(-362976276117557L);
        AbstractC0295Gu.m625r(-363040700626997L);
        return false;
    }
}
