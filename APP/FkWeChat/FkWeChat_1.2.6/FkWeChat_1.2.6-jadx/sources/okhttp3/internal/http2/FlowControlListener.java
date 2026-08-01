package okhttp3.internal.http2;

import kotlin.Metadata;
import okhttp3.internal.http2.flowcontrol.WindowCounter;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\rJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000eÀ\u0006\u0003"}, m16758d2 = {"Lokhttp3/internal/http2/FlowControlListener;", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "streamId", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "windowCounter", _UrlKt.FRAGMENT_ENCODE_SET, "bufferSize", "Ll8/i0;", "receivingStreamWindowChanged", "(ILokhttp3/internal/http2/flowcontrol/WindowCounter;J)V", "receivingConnectionWindowChanged", "(Lokhttp3/internal/http2/flowcontrol/WindowCounter;)V", "None", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface FlowControlListener {

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m16758d2 = {"Lokhttp3/internal/http2/FlowControlListener$None;", "Lokhttp3/internal/http2/FlowControlListener;", "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "streamId", "Lokhttp3/internal/http2/flowcontrol/WindowCounter;", "windowCounter", _UrlKt.FRAGMENT_ENCODE_SET, "bufferSize", "Ll8/i0;", "receivingStreamWindowChanged", "(ILokhttp3/internal/http2/flowcontrol/WindowCounter;J)V", "receivingConnectionWindowChanged", "(Lokhttp3/internal/http2/flowcontrol/WindowCounter;)V", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class None implements FlowControlListener {
        public static final None INSTANCE = new None();

        private None() {
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public void receivingConnectionWindowChanged(WindowCounter windowCounter) {
            windowCounter.getClass();
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public void receivingStreamWindowChanged(int streamId, WindowCounter windowCounter, long bufferSize) {
            windowCounter.getClass();
        }
    }

    void receivingConnectionWindowChanged(WindowCounter windowCounter);

    void receivingStreamWindowChanged(int streamId, WindowCounter windowCounter, long bufferSize);
}
