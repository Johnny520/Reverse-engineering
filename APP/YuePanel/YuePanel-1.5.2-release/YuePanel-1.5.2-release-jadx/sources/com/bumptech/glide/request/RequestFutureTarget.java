package com.bumptech.glide.request;

import Yue.InterfaceC5225;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class RequestFutureTarget<R> implements FutureTarget<R>, RequestListener<R> {
    private static final Waiter DEFAULT_WAITER = new Waiter();
    private final boolean assertBackgroundThread;

    @InterfaceC5225("this")
    @InterfaceC6490
    private GlideException exception;
    private final int height;

    @InterfaceC5225("this")
    private boolean isCancelled;

    @InterfaceC5225("this")
    private boolean loadFailed;

    @InterfaceC5225("this")
    @InterfaceC6490
    private Request request;

    @InterfaceC5225("this")
    @InterfaceC6490
    private R resource;

    @InterfaceC5225("this")
    private boolean resultReceived;
    private final Waiter waiter;
    private final int width;

    @InterfaceC8392
    public static class Waiter {
        public void notifyAll(Object obj) {
            obj.notifyAll();
        }

        public void waitForTimeout(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RequestFutureTarget(int i, int i2) {
        this(i, i2, true, DEFAULT_WAITER);
    }

    private synchronized R doGet(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        try {
            if (this.assertBackgroundThread && !isDone()) {
                Util.assertBackgroundThread();
            }
            if (this.isCancelled) {
                throw new CancellationException();
            }
            if (this.loadFailed) {
                throw new ExecutionException(this.exception);
            }
            if (this.resultReceived) {
                return this.resource;
            }
            if (l == null) {
                this.waiter.waitForTimeout(this, 0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.waiter.waitForTimeout(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.loadFailed) {
                throw new ExecutionException(this.exception);
            }
            if (this.isCancelled) {
                throw new CancellationException();
            }
            if (!this.resultReceived) {
                throw new TimeoutException();
            }
            return this.resource;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.isCancelled = true;
                this.waiter.notifyAll(this);
                Request request = null;
                if (z) {
                    Request request2 = this.request;
                    this.request = null;
                    request = request2;
                }
                if (request != null) {
                    request.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public R get() throws ExecutionException, InterruptedException {
        try {
            return doGet(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    @InterfaceC6490
    public synchronized Request getRequest() {
        return this.request;
    }

    @Override // com.bumptech.glide.request.target.Target
    public void getSize(@InterfaceC6391 SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.width, this.height);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.isCancelled;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean isDone() {
        boolean z;
        if (this.isCancelled || this.resultReceived) {
            z = true;
        } else if (!this.loadFailed) {
            z = false;
        }
        return z;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@InterfaceC6490 Drawable drawable) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onLoadFailed(@InterfaceC6490 Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@InterfaceC6490 Drawable drawable) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.request.target.Target
    public synchronized void onResourceReady(@InterfaceC6391 R r, @InterfaceC6490 Transition<? super R> transition) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.Target
    public void removeCallback(@InterfaceC6391 SizeReadyCallback sizeReadyCallback) {
    }

    @Override // com.bumptech.glide.request.target.Target
    public synchronized void setRequest(@InterfaceC6490 Request request) {
        this.request = request;
    }

    public String toString() {
        Request request;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                request = null;
                if (this.isCancelled) {
                    str = "CANCELLED";
                } else if (this.loadFailed) {
                    str = "FAILURE";
                } else if (this.resultReceived) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    request = this.request;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (request == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + request + "]]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RequestFutureTarget(int i, int i2, boolean z, Waiter waiter) {
        this.width = i;
        this.height = i2;
        this.assertBackgroundThread = z;
        this.waiter = waiter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onLoadFailed(@InterfaceC6490 GlideException glideException, Object obj, @InterfaceC6391 Target<R> target, boolean z) {
        this.loadFailed = true;
        this.exception = glideException;
        this.waiter.notifyAll(this);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.bumptech.glide.request.RequestListener
    public synchronized boolean onResourceReady(@InterfaceC6391 R r, @InterfaceC6391 Object obj, Target<R> target, @InterfaceC6391 DataSource dataSource, boolean z) {
        this.resultReceived = true;
        this.resource = r;
        this.waiter.notifyAll(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j, @InterfaceC6391 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return doGet(Long.valueOf(timeUnit.toMillis(j)));
    }
}
