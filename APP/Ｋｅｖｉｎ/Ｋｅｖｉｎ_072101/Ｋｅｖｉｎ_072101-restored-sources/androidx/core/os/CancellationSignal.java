package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private java.lang.Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private androidx.core.os.CancellationSignal.OnCancelListener mOnCancelListener;

    static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void cancel(java.lang.Object r1) {
                r0 = r1
                android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
                r0.cancel()
                return
        }

        static android.os.CancellationSignal createCancellationSignal() {
                android.os.CancellationSignal r0 = new android.os.CancellationSignal
                r0.<init>()
                return r0
        }
    }

    public interface OnCancelListener {
        void onCancel();
    }

    public CancellationSignal() {
            r0 = this;
            r0.<init>()
            return
    }

    private void waitForCancelFinishedLocked() {
            r1 = this;
        L1:
            boolean r0 = r1.mCancelInProgress
            if (r0 == 0) goto Lb
            r1.wait()     // Catch: java.lang.InterruptedException -> L9
        L8:
            goto L1
        L9:
            r0 = move-exception
            goto L8
        Lb:
            return
    }

    public void cancel() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mIsCanceled     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L7
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            return
        L7:
            r0 = 1
            r4.mIsCanceled = r0     // Catch: java.lang.Throwable -> L37
            r4.mCancelInProgress = r0     // Catch: java.lang.Throwable -> L37
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r4.mOnCancelListener     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r4.mCancellationSignalObj     // Catch: java.lang.Throwable -> L37
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            r2 = 0
            if (r0 == 0) goto L1a
            r0.onCancel()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L20
        L1a:
            if (r1 == 0) goto L2b
            androidx.core.os.CancellationSignal.Api16Impl.cancel(r1)     // Catch: java.lang.Throwable -> L18
            goto L2b
        L20:
            monitor-enter(r4)
            r4.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L28
            r4.notifyAll()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            throw r3
        L28:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            throw r2
        L2b:
            monitor-enter(r4)
            r4.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L34
            r4.notifyAll()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            throw r2
        L37:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r0
    }

    public java.lang.Object getCancellationSignalObject() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.mCancellationSignalObj     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L15
            android.os.CancellationSignal r0 = androidx.core.os.CancellationSignal.Api16Impl.createCancellationSignal()     // Catch: java.lang.Throwable -> L19
            r1.mCancellationSignalObj = r0     // Catch: java.lang.Throwable -> L19
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L15
            java.lang.Object r0 = r1.mCancellationSignalObj     // Catch: java.lang.Throwable -> L19
            androidx.core.os.CancellationSignal.Api16Impl.cancel(r0)     // Catch: java.lang.Throwable -> L19
        L15:
            java.lang.Object r0 = r1.mCancellationSignalObj     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            return r0
        L19:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r0
    }

    public boolean isCanceled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void setOnCancelListener(androidx.core.os.CancellationSignal.OnCancelListener r2) {
            r1 = this;
            monitor-enter(r1)
            r1.waitForCancelFinishedLocked()     // Catch: java.lang.Throwable -> L1a
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r1.mOnCancelListener     // Catch: java.lang.Throwable -> L1a
            if (r0 != r2) goto La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        La:
            r1.mOnCancelListener = r2     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            if (r2 != 0) goto L13
            goto L18
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            r2.onCancel()
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public void throwIfCanceled() {
            r1 = this;
            boolean r0 = r1.isCanceled()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.core.os.OperationCanceledException r0 = new androidx.core.os.OperationCanceledException
            r0.<init>()
            throw r0
    }
}
