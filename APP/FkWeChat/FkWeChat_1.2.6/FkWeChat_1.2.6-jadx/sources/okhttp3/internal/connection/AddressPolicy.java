package okhttp3.internal.connection;

import kotlin.Metadata;
import okhttp3.internal.p218ws.RealWebSocket;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m16758d2 = {"Lokhttp3/internal/connection/AddressPolicy;", _UrlKt.FRAGMENT_ENCODE_SET, "minimumConcurrentCalls", _UrlKt.FRAGMENT_ENCODE_SET, "backoffDelayMillis", _UrlKt.FRAGMENT_ENCODE_SET, "backoffJitterMillis", "<init>", "(IJI)V", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class AddressPolicy {
    public final long backoffDelayMillis;
    public final int backoffJitterMillis;
    public final int minimumConcurrentCalls;

    public /* synthetic */ AddressPolicy(int i10, long j10, int i11, int i12, AbstractC1043k abstractC1043k) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS : j10, (i12 & 4) != 0 ? 100 : i11);
    }

    public AddressPolicy(int i10, long j10, int i11) {
        this.minimumConcurrentCalls = i10;
        this.backoffDelayMillis = j10;
        this.backoffJitterMillis = i11;
    }

    public AddressPolicy() {
        this(0, 0L, 0, 7, null);
    }
}
