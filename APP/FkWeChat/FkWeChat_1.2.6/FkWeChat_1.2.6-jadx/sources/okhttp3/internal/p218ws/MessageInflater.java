package okhttp3.internal.p218ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.url._UrlKt;
import p376zd.C10029z;
import p376zd.C9987e;
import p376zd.C9995i;
import p376zd.InterfaceC10024w0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m16758d2 = {"Lokhttp3/internal/ws/MessageInflater;", "Ljava/io/Closeable;", _UrlKt.FRAGMENT_ENCODE_SET, "noContextTakeover", "<init>", "(Z)V", "Lzd/i;", "buffer", "Ll8/i0;", "inflate", "(Lzd/i;)V", "close", "()V", "Z", "deflatedBytes", "Lzd/i;", "Ljava/util/zip/Inflater;", "inflater", "Ljava/util/zip/Inflater;", "Lzd/z;", "inflaterSource", "Lzd/z;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class MessageInflater implements Closeable {
    private final C9995i deflatedBytes = new C9995i();
    private Inflater inflater;
    private C10029z inflaterSource;
    private final boolean noContextTakeover;

    public MessageInflater(boolean z10) {
        this.noContextTakeover = z10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C10029z c10029z = this.inflaterSource;
        if (c10029z != null) {
            c10029z.close();
        }
        this.inflaterSource = null;
        this.inflater = null;
    }

    public final void inflate(C9995i buffer) throws IOException {
        buffer.getClass();
        if (this.deflatedBytes.size() != 0) {
            C9987e.m38645a("Failed requirement.");
            return;
        }
        Inflater inflater = this.inflater;
        if (inflater == null) {
            inflater = new Inflater(true);
            this.inflater = inflater;
        }
        C10029z c10029z = this.inflaterSource;
        if (c10029z == null) {
            c10029z = new C10029z((InterfaceC10024w0) this.deflatedBytes, inflater);
            this.inflaterSource = c10029z;
        }
        if (this.noContextTakeover) {
            inflater.reset();
        }
        this.deflatedBytes.mo38670A0(buffer);
        this.deflatedBytes.writeInt(Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        long bytesRead = inflater.getBytesRead() + this.deflatedBytes.size();
        do {
            c10029z.m38850c(buffer, Long.MAX_VALUE);
            if (inflater.getBytesRead() >= bytesRead) {
                break;
            }
        } while (!inflater.finished());
        if (inflater.getBytesRead() < bytesRead) {
            this.deflatedBytes.m38701c();
            c10029z.close();
            this.inflaterSource = null;
            this.inflater = null;
        }
    }
}
