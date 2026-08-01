package okhttp3.internal.http2.flowcontrol;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, m16758d2 = {"Lokhttp3/internal/http2/flowcontrol/WindowCounter;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "streamId", "<init>", "(I)V", _UrlKt.FRAGMENT_ENCODE_SET, "total", "acknowledged", "Ll8/i0;", "update", "(JJ)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "I", "getStreamId", "()I", "value", "J", "getTotal", "()J", "getAcknowledged", "getUnacknowledged", "unacknowledged", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class WindowCounter {
    private long acknowledged;
    private final int streamId;
    private long total;

    public WindowCounter(int i10) {
        this.streamId = i10;
    }

    public static /* synthetic */ void update$default(WindowCounter windowCounter, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        windowCounter.update(j10, j11);
    }

    public final long getAcknowledged() {
        return this.acknowledged;
    }

    public final int getStreamId() {
        return this.streamId;
    }

    public final long getTotal() {
        return this.total;
    }

    public final synchronized long getUnacknowledged() {
        return this.total - this.acknowledged;
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.streamId + ", total=" + this.total + ", acknowledged=" + this.acknowledged + ", unacknowledged=" + getUnacknowledged() + ')';
    }

    public final synchronized void update(long total, long acknowledged) {
        try {
            if (total < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (acknowledged < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j10 = this.total + total;
            this.total = j10;
            long j11 = this.acknowledged + acknowledged;
            this.acknowledged = j11;
            if (j11 > j10) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
