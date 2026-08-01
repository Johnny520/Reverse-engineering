package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p325w8.AbstractC9202b;
import p376zd.AbstractC9988e0;
import p376zd.C10003m;
import p376zd.InterfaceC10024w0;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m16758d2 = {"Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "()V", "Ll8/i0;", "readTheList", "readTheListUninterruptibly", "Lzd/w0;", "listSource", "()Lzd/w0;", "ensureLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "Lzd/m;", "bytes", "Lzd/m;", "getBytes", "()Lzd/m;", "setBytes", "(Lzd/m;)V", "exceptionBytes", "getExceptionBytes", "setExceptionBytes", "Ljava/io/IOException;", "readFailure", "Ljava/io/IOException;", _UrlKt.FRAGMENT_ENCODE_SET, "getPath", "()Ljava/lang/Object;", "path", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public abstract class BasePublicSuffixList implements PublicSuffixList {
    public C10003m bytes;
    public C10003m exceptionBytes;
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);
    private IOException readFailure;

    private final void readTheList() {
        try {
            InterfaceC9999k interfaceC9999kM38648c = AbstractC9988e0.m38648c(listSource());
            try {
                C10003m c10003mMo38729u = interfaceC9999kM38648c.mo38729u(interfaceC9999kM38648c.readInt());
                C10003m c10003mMo38729u2 = interfaceC9999kM38648c.mo38729u(interfaceC9999kM38648c.readInt());
                C4700i0 c4700i0 = C4700i0.f13910a;
                AbstractC9202b.m35830a(interfaceC9999kM38648c, null);
                synchronized (this) {
                    c10003mMo38729u.getClass();
                    setBytes(c10003mMo38729u);
                    c10003mMo38729u2.getClass();
                    setExceptionBytes(c10003mMo38729u2);
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    this.readFailure = e10;
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public void ensureLoaded() {
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.bytes != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + getPath() + " resource.");
        illegalStateException.initCause(this.readFailure);
        throw illegalStateException;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public C10003m getBytes() {
        C10003m c10003m = this.bytes;
        if (c10003m != null) {
            return c10003m;
        }
        AbstractC1061t.m3851l("bytes");
        return null;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public C10003m getExceptionBytes() {
        C10003m c10003m = this.exceptionBytes;
        if (c10003m != null) {
            return c10003m;
        }
        AbstractC1061t.m3851l("exceptionBytes");
        return null;
    }

    public abstract Object getPath();

    public abstract InterfaceC10024w0 listSource();

    public void setBytes(C10003m c10003m) {
        c10003m.getClass();
        this.bytes = c10003m;
    }

    public void setExceptionBytes(C10003m c10003m) {
        c10003m.getClass();
        this.exceptionBytes = c10003m;
    }
}
