package androidx.core.provider;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class SelfDestructiveThread {
    private static final int MSG_DESTRUCTION = 0;
    private static final int MSG_INVOKE_RUNNABLE = 1;
    private android.os.Handler.Callback mCallback;
    private final int mDestructAfterMillisec;
    private int mGeneration;
    private android.os.Handler mHandler;
    private final java.lang.Object mLock;
    private final int mPriority;
    private android.os.HandlerThread mThread;
    private final java.lang.String mThreadName;




    public interface ReplyCallback<T> {
        void onReply(T r1);
    }

    public SelfDestructiveThread(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            androidx.core.provider.SelfDestructiveThread$1 r0 = new androidx.core.provider.SelfDestructiveThread$1
            r0.<init>(r1)
            r1.mCallback = r0
            r1.mThreadName = r2
            r1.mPriority = r3
            r1.mDestructAfterMillisec = r4
            r0 = 0
            r1.mGeneration = r0
            return
    }

    private void post(java.lang.Runnable r6) {
            r5 = this;
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            android.os.HandlerThread r1 = r5.mThread     // Catch: java.lang.Throwable -> L3f
            r2 = 1
            if (r1 != 0) goto L2c
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r5.mThreadName     // Catch: java.lang.Throwable -> L3f
            int r4 = r5.mPriority     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3f
            r5.mThread = r1     // Catch: java.lang.Throwable -> L3f
            android.os.HandlerThread r1 = r5.mThread     // Catch: java.lang.Throwable -> L3f
            r1.start()     // Catch: java.lang.Throwable -> L3f
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Throwable -> L3f
            android.os.HandlerThread r3 = r5.mThread     // Catch: java.lang.Throwable -> L3f
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Throwable -> L3f
            android.os.Handler$Callback r4 = r5.mCallback     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3f
            r5.mHandler = r1     // Catch: java.lang.Throwable -> L3f
            int r1 = r5.mGeneration     // Catch: java.lang.Throwable -> L3f
            int r1 = r1 + r2
            r5.mGeneration = r1     // Catch: java.lang.Throwable -> L3f
        L2c:
            android.os.Handler r1 = r5.mHandler     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r1.removeMessages(r3)     // Catch: java.lang.Throwable -> L3f
            android.os.Handler r1 = r5.mHandler     // Catch: java.lang.Throwable -> L3f
            android.os.Handler r3 = r5.mHandler     // Catch: java.lang.Throwable -> L3f
            android.os.Message r2 = r3.obtainMessage(r2, r6)     // Catch: java.lang.Throwable -> L3f
            r1.sendMessage(r2)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
    }

    public int getGeneration() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            int r1 = r2.mGeneration     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public boolean isRunning() {
            r2 = this;
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.os.HandlerThread r1 = r2.mThread     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    void onDestruction() {
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.Handler r1 = r3.mHandler     // Catch: java.lang.Throwable -> L1a
            r2 = 1
            boolean r1 = r1.hasMessages(r2)     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        Le:
            android.os.HandlerThread r1 = r3.mThread     // Catch: java.lang.Throwable -> L1a
            r1.quit()     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r3.mThread = r1     // Catch: java.lang.Throwable -> L1a
            r3.mHandler = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r1
    }

    void onInvokeRunnable(java.lang.Runnable r6) {
            r5 = this;
            r6.run()
            java.lang.Object r0 = r5.mLock
            monitor-enter(r0)
            android.os.Handler r1 = r5.mHandler     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            r1.removeMessages(r2)     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r1 = r5.mHandler     // Catch: java.lang.Throwable -> L1c
            android.os.Handler r3 = r5.mHandler     // Catch: java.lang.Throwable -> L1c
            android.os.Message r2 = r3.obtainMessage(r2)     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.mDestructAfterMillisec     // Catch: java.lang.Throwable -> L1c
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L1c
            r1.sendMessageDelayed(r2, r3)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    public <T> void postAndReply(java.util.concurrent.Callable<T> r3, androidx.core.provider.SelfDestructiveThread.ReplyCallback<T> r4) {
            r2 = this;
            android.os.Handler r0 = androidx.core.provider.CalleeHandler.create()
            androidx.core.provider.SelfDestructiveThread$2 r1 = new androidx.core.provider.SelfDestructiveThread$2
            r1.<init>(r2, r3, r0, r4)
            r2.post(r1)
            return
    }

    public <T> T postAndWait(java.util.concurrent.Callable<T> r11, int r12) throws java.lang.InterruptedException {
            r10 = this;
            java.util.concurrent.locks.ReentrantLock r4 = new java.util.concurrent.locks.ReentrantLock
            r4.<init>()
            java.util.concurrent.locks.Condition r7 = r4.newCondition()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r5.<init>(r0)
            androidx.core.provider.SelfDestructiveThread$3 r8 = new androidx.core.provider.SelfDestructiveThread$3
            r0 = r8
            r1 = r10
            r3 = r11
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.post(r8)
            r4.lock()
            boolean r0 = r5.get()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L31
            java.lang.Object r0 = r2.get()     // Catch: java.lang.Throwable -> L5c
            r4.unlock()
            return r0
        L31:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L5c
            long r8 = (long) r12     // Catch: java.lang.Throwable -> L5c
            long r0 = r0.toNanos(r8)     // Catch: java.lang.Throwable -> L5c
        L38:
            long r8 = r7.awaitNanos(r0)     // Catch: java.lang.InterruptedException -> L3e java.lang.Throwable -> L5c
            r0 = r8
            goto L3f
        L3e:
            r3 = move-exception
        L3f:
            boolean r3 = r5.get()     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto L4d
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L5c
            r4.unlock()
            return r3
        L4d:
            r8 = 0
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 <= 0) goto L54
            goto L38
        L54:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "timeout"
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L5c
            throw r3     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            r4.unlock()
            throw r0
    }
}
