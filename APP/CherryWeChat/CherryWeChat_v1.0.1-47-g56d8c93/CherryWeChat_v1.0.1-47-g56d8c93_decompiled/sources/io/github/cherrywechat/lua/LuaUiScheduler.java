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
    private static final int MAX_PENDING_TASKS = 100;
    private static final String TAG = AbstractC0295Gu.m625r(-363891104151605L);
    public static final LuaUiScheduler INSTANCE = new LuaUiScheduler();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static final ConcurrentLinkedQueue<InterfaceC0884Ui> pendingTasks = new ConcurrentLinkedQueue<>();
    private static final AtomicInteger pendingCount = new AtomicInteger(0);
    private static final AtomicInteger resumedCount = new AtomicInteger(0);
    private static volatile boolean isForeground = true;

    private LuaUiScheduler() {
    }

    private final void enqueue(InterfaceC0884Ui interfaceC0884Ui) {
        AtomicInteger atomicInteger = pendingCount;
        if (atomicInteger.incrementAndGet() <= MAX_PENDING_TASKS) {
            pendingTasks.offer(interfaceC0884Ui);
            return;
        }
        atomicInteger.decrementAndGet();
        AbstractC0295Gu.m625r(-363719305459765L);
        AbstractC0295Gu.m625r(-363783729969205L);
    }

    private final void flush() {
        while (true) {
            InterfaceC0884Ui interfaceC0884UiPoll = pendingTasks.poll();
            if (interfaceC0884UiPoll == null) {
                return;
            }
            pendingCount.decrementAndGet();
            mainHandler.post(new RunnableC0805Sp(0, interfaceC0884UiPoll));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnUiThreadSync$lambda$1(InterfaceC0884Ui interfaceC0884Ui, CountDownLatch countDownLatch) {
        try {
            interfaceC0884Ui.mo6a();
        } finally {
            countDownLatch.countDown();
        }
    }

    private final void setForeground(boolean z) {
        if (isForeground == z) {
            return;
        }
        isForeground = z;
        if (z) {
            flush();
        }
    }

    public final boolean isForeground() {
        return isForeground;
    }

    public final void onActivityPaused() {
        AtomicInteger atomicInteger = resumedCount;
        if (atomicInteger.decrementAndGet() <= 0) {
            atomicInteger.set(0);
            setForeground(false);
        }
    }

    public final void onActivityResumed() {
        if (resumedCount.incrementAndGet() == 1) {
            setForeground(true);
        }
    }

    public final void runOnUiThread(InterfaceC0884Ui interfaceC0884Ui) {
        AbstractC0295Gu.m625r(-362916146575413L);
        if (!isForeground) {
            enqueue(interfaceC0884Ui);
        } else if (AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper())) {
            interfaceC0884Ui.mo6a();
        } else {
            mainHandler.post(new RunnableC0805Sp(1, interfaceC0884Ui));
        }
    }

    public final boolean runOnUiThreadSync(InterfaceC0884Ui interfaceC0884Ui) {
        AbstractC0295Gu.m625r(-362946211346485L);
        if (!isForeground) {
            enqueue(interfaceC0884Ui);
            return false;
        }
        if (AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper())) {
            interfaceC0884Ui.mo6a();
            return true;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        mainHandler.post(new RunnableC2260n3(12, interfaceC0884Ui, countDownLatch));
        try {
            return countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            AbstractC0295Gu.m625r(-362976276117557L);
            AbstractC0295Gu.m625r(-363040700626997L);
            return false;
        }
    }
}
